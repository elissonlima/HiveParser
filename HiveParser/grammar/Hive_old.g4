grammar Hive;

@header {
    #include <string>
    #include <vector>
    #include "HqlFunction.h"
}


/* Parser */

program returns [std::string res]
    : stmt_list EOF {
        std::stringstream js_template;
        js_template << "{\"stmt_list\":[" << $stmt_list.res << "]}";
        $res = js_template.str();
    }
    ;

stmt_list returns [std::string res]
    : stmt ';' { $res = $stmt.res; }
    | stmt ';' stmt_list {
        std::stringstream js_template;
        js_template << $stmt_list.res << "," << $stmt.res;
        $res = js_template.str();
    }
    ;

stmt returns [std::string res]
    : query_stmt  { $res = $query_stmt.res; } 
    ;

query_stmt returns [std::string res]
    : select_stmt { $res = $select_stmt.res; } 
    ;

dtype returns [std::string res]  // Data types
     : T_CHAR { $res = "CHAR"; }
     | T_CHARACTER { $res = "CHAR"; }
     | T_BIGINT { $res = "BIGINT"; }
     | T_BINARY_DOUBLE { $res = "BINARY_DOUBLE"; }
     | T_BINARY_FLOAT { $res = "BINARY_FLOAT"; }
     | T_BINARY_INTEGER { $res = "BINARY_INT"; }
     | T_BIT { $res = "BIT"; }
     | T_DATE { $res = "DATE"; }
     | T_DATETIME { $res = "DATETIME"; }
     | T_DEC { $res = "DECIMAL"; }
     | T_DECIMAL { $res = "DECIMAL"; }
     | T_DOUBLE T_PRECISION? { $res = "DOUBLE"; }
     | T_FLOAT { $res = "FLOAT"; }
     | T_INT { $res = "INT"; }
     | T_INT2 { $res = "TINYINT"; }
     | T_INT4 { $res = "SMALLINT"; }
     | T_INT8 { $res = "INT"; }
     | T_INTEGER { $res = "INT"; }
     | T_NCHAR { $res = "NCHAR"; }
     | T_NVARCHAR { $res = "NVARCHAR"; }
     | T_NUMBER { $res = "NUMBER"; }
     | T_NUMERIC { $res = "NUMERIC"; }
     | T_PLS_INTEGER { $res = "PLS_INTEGER"; }
     | T_REAL { $res = "REAL"; }
     | T_RESULT_SET_LOCATOR T_VARYING { $res = "RESULT_SET_LOCATOR"; }
     | T_SIMPLE_FLOAT { $res = "SIMPLE_FLOAT"; }
     | T_SIMPLE_DOUBLE { $res = "SIMPLE_DOUBLE"; }
     | T_SIMPLE_INTEGER { $res = "SIMPLE_INTEGER"; }
     | T_SMALLINT { $res = "SMALLINT"; }
     | T_SMALLDATETIME { $res = "SMALLDATETIME"; }
     | T_STRING { $res = "STRING"; }
     | T_SYS_REFCURSOR { $res = "SYS_REFCURSOR"; }
     | T_TIMESTAMP { $res = "TIMESTAMP"; }
     | T_TINYINT { $res = "TINYINT"; }
     | T_VARCHAR { $res = "VARCHAR"; }
     | T_VARCHAR2 { $res = "VARCHAR2"; }
     | T_XML { $res = "XML"; }
     | ident ('%' (T_TYPE | T_ROWTYPE))?  { $res = $ident.text; } // User-defined or derived data type
     ;

dtype_len returns [std::string res] // Data type length or size specification
     : { $res = ""; } 
     |  T_OPEN_P size=(L_INT | T_MAX) T_CLOSE_P { $res = hql_dtype_size($size.text, ""); }
     |  T_OPEN_P size=(L_INT | T_MAX) (T_CHAR | T_BYTE) T_CLOSE_P { $res = hql_dtype_size($size.text, ""); }
     |  T_OPEN_P size=(L_INT | T_MAX) (T_COMMA scale=L_INT) T_CLOSE_P { $res = hql_dtype_size($size.text, $scale.text); }
     |  T_OPEN_P size=(L_INT | T_MAX) (T_CHAR | T_BYTE) (T_COMMA scale=L_INT) T_CLOSE_P { $res = hql_dtype_size($size.text, $scale.text); }
     ;

dtype_default 
    : T_COLON? T_EQUAL expr
    | T_WITH? T_DEFAULT expr?
    ;

dtype_attr 
    : T_NOT? T_NULL
    | T_CHARACTER T_SET ident
    | T_NOT? (T_CASESPECIFIC | T_CS)
    ;

create_table_stmt :
       T_CREATE T_TABLE (T_IF T_NOT T_EXISTS)? table_name create_table_preoptions? create_table_definition 
     ;
     
create_local_temp_table_stmt :
       T_CREATE (T_LOCAL T_TEMPORARY | (T_SET | T_MULTISET)? T_VOLATILE) T_TABLE ident create_table_preoptions? create_table_definition
     ;
     
create_table_definition :
      (T_AS? T_OPEN_P select_stmt T_CLOSE_P | T_AS? select_stmt | T_OPEN_P create_table_columns T_CLOSE_P | T_LIKE table_name) create_table_options?
     ;
     
create_table_columns :         
       create_table_columns_item (T_COMMA create_table_columns_item)*
     ;
       
create_table_columns_item :
       column_name dtype dtype_len? dtype_attr* create_table_column_inline_cons* 
     | (T_CONSTRAINT ident)? create_table_column_cons
     ;
     
column_name :
       ident
     ;

create_table_column_inline_cons :
       dtype_default
     | T_NOT? T_NULL
     | T_PRIMARY T_KEY
     | T_UNIQUE
     | T_REFERENCES table_name T_OPEN_P ident T_CLOSE_P create_table_fk_action*
     | T_IDENTITY T_OPEN_P L_INT (T_COMMA L_INT)* T_CLOSE_P
     | T_AUTO_INCREMENT
     | T_ENABLE
     ;
     
create_table_column_cons 
    : T_PRIMARY T_KEY T_CLUSTERED? T_OPEN_P ident (T_ASC | T_DESC)? (T_COMMA ident (T_ASC | T_DESC)?)* T_CLOSE_P T_ENABLE?
    | T_FOREIGN T_KEY T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P T_REFERENCES table_name T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P create_table_fk_action* 
    ;
    
create_table_fk_action returns [std::string res]
    : T_ON T_DELETE act=( T_RESTRICT | T_CASCADE) { $res = hql_create_table_option_item_val("ON_DELETE", $act.text); }
    | T_ON T_DELETE T_NO T_ACTION  { $res = hql_create_table_option_item_val("ON_DELETE", "NO_ACTION"); }
    | T_ON T_DELETE T_SET T_NULL  { $res = hql_create_table_option_item_val("ON_DELETE", "SET_NULL"); }
    | T_ON T_DELETE T_SET T_DEFAULT  { $res = hql_create_table_option_item_val("ON_DELETE", "SET_DEFAULT"); }
    | T_ON T_UPDATE act=( T_RESTRICT | T_CASCADE) { $res = hql_create_table_option_item_val("ON_UPDATE", $act.text); }
    | T_ON T_UPDATE T_NO T_ACTION  { $res = hql_create_table_option_item_val("ON_DELETE", "NO_ACTION"); }
    | T_ON T_UPDATE T_SET T_NULL  { $res = hql_create_table_option_item_val("ON_DELETE", "SET_NULL"); }
    | T_ON T_UPDATE T_SET T_DEFAULT  { $res = hql_create_table_option_item_val("ON_DELETE", "SET_DEFAULT"); }
    ;

create_table_preoptions returns [std::string res]
    : create_table_preoptions_item { $res = $create_table_preoptions_item.res; }
    | create_table_preoptions_item create_table_preoptions { $res = hql_recur_list($create_table_preoptions_item.res, $create_table_preoptions.res); }
    ;

create_table_preoptions_item returns [std::string res]
    : T_COMMA create_table_preoptions_td_item { $res = $create_table_preoptions_td_item.res; }
    | create_table_options_hive_item { $res = $create_table_options_hive_item.res; }
    ;     
     
create_table_preoptions_td_item returns [std::string res]
    : T_NO T_LOG { $res = hql_create_table_option_item_val("NOLOG", "null"); }
    | T_NO T_FALLBACK { $res = hql_create_table_option_item_val("NOFALLBACK", "null"); }
    | T_FALLBACK { $res = hql_create_table_option_item_val("FALLBACK", "null"); }
    | T_LOG { $res = hql_create_table_option_item_val("LOG", "null"); }
    ;
     
create_table_options returns [std::string res]
    : create_table_options_item { $res = $create_table_options_item.res; }
    | create_table_options_item create_table_options { $res = hql_recur_list($create_table_options_item.res, $create_table_options.res); }
    ;
     
create_table_options_item  returns [std::string res]
    : T_ON T_COMMIT (T_DELETE | T_PRESERVE) T_ROWS 
    | create_table_options_ora_item { $res = $create_table_options_ora_item.res; }
    | create_table_options_db2_item { $res = $create_table_options_db2_item.res; }
    | create_table_options_td_item { $res = $create_table_options_td_item.res; }
    | create_table_options_hive_item { $res = $create_table_options_hive_item.res; }
    | create_table_options_mssql_item { $res = $create_table_options_mssql_item.res; }
    | create_table_options_mysql_item { $res = $create_table_options_mysql_item.res; }
    ;

create_table_options_ora_item returns [std::string res]
    : T_SEGMENT T_CREATION v=(T_IMMEDIATE | T_DEFERRED) { $res = hql_create_table_option_item_val("SEGMENT_CREATION", $v.text); }
    | v=(T_PCTFREE | T_PCTUSED | T_INITRANS | T_MAXTRANS) L_INT { $res = hql_create_table_option_item_val($v.text, $L_INT.text); }
    | T_NOCOMPRESS  { $res = hql_create_table_option_item_val("NOCOMPRESS", "null"); }
    | T_LOGGING { $res = hql_create_table_option_item_val("LOGGING", "TRUE"); }
    | T_NOLOGGING { $res = hql_create_table_option_item_val("LOGGING", "FALSE"); }
    | T_STORAGE T_OPEN_P (ident | L_INT)+ T_CLOSE_P { $res = hql_create_table_option_item_val("STORAGE", "null"); }
    | T_TABLESPACE ident { $res = hql_create_table_option_item_val("TABLESPACE", $ident.text); }
    ;

create_table_options_db2_item returns [std::string res]
    : T_INDEX? T_IN ident { $res = hql_create_table_option_item_val("INDEX_IN", $ident.text); }
    | T_WITH T_REPLACE { $res = hql_create_table_option_item_val("WITH_REPLACE", "null"); }
    | T_DISTRIBUTE T_BY T_HASH T_OPEN_P fst=ident (T_COMMA ident)* T_CLOSE_P { $res = hql_create_table_option_item_val("DISTRIBUTE_BY_HASH", $fst.text); }
    | T_NOT T_LOGGED { $res = hql_create_table_option_item_val("LOGGED", "FALSE"); }
    | T_LOGGED { $res = hql_create_table_option_item_val("LOGGED", "TRUE"); }
    | T_COMPRESS c=(T_YES | T_NO) { $res = hql_create_table_option_item_val("COMPRESS", $c.text); }
    | T_DEFINITION T_ONLY { $res = hql_create_table_option_item_val("DEFINITION_ONLY", "null"); }
    | T_WITH T_RESTRICT T_ON T_DROP { $res = hql_create_table_option_item_val("WITH_RESTRICT_ON_DROP", "null"); }
    ;
     
create_table_options_td_item returns [std::string res]
    : T_UNIQUE? T_PRIMARY T_INDEX T_OPEN_P fst=ident (T_COMMA ident)* T_CLOSE_P { $res = hql_create_table_option_item_val("PRIMARY_INDEX", $fst.text); }
    | T_WITH T_DATA { $res = hql_create_table_option_item_val("WITH_DATA", "null"); }
    ;
    
create_table_options_hive_item returns [std::string res]
    : create_table_hive_row_format { $res = $create_table_hive_row_format.res; }
    | T_STORED T_AS ident { $res = hql_create_table_option_item_val("STORED_AS", $ident.text); }
    ;
     
create_table_hive_row_format returns [std::string res]
    : T_ROW T_FORMAT T_DELIMITED create_table_hive_row_format_fields_list { $res = hql_create_table_option_item("ROW_FORMAT_DELIMITED", $create_table_hive_row_format_fields_list.res); }
    ;

create_table_hive_row_format_fields_list returns [std::string res]
    : { $res = "null"; }
    | create_table_hive_row_format_fields create_table_hive_row_format_fields_list  { $res = hql_recur_list($create_table_hive_row_format_fields.res, $create_table_hive_row_format_fields_list.res); }
    ;


create_table_hive_row_format_fields returns [std::string res]
    : T_FIELDS T_TERMINATED T_BY terminated_expr=expr { $res = hql_create_table_option_item_val($terminated_expr.res, "null"); }
    | T_FIELDS T_TERMINATED T_BY terminated_expr=expr T_ESCAPED T_BY escap_expr=expr { $res = hql_create_table_fields_spec($terminated_expr.res, $escap_expr.res); }
    | T_COLLECTION T_ITEMS T_TERMINATED T_BY expr { $res = hql_create_table_option_item("COLLECTION_ITEMS_TERMINATED", $expr.res); }
    | T_MAP T_KEYS T_TERMINATED T_BY expr { $res = hql_create_table_option_item("MAP_KEYS_TERMINATED", $expr.res); }
    | T_LINES T_TERMINATED T_BY expr { $res = hql_create_table_option_item("LINES_TERMINATED", $expr.res); }
    | T_NULL T_DEFINED T_AS expr { $res = hql_create_table_option_item("NULL_DEFINED", $expr.res); }
    ;
     
create_table_options_mssql_item returns [std::string res]
    : T_ON ident { $res = (hql_create_table_option_item_val($T_ON.text, $ident.text); }
    | T_TEXTIMAGE_ON ident { $res = hql_create_table_option_item_val($T_TEXTIMAGE_ON.text, $ident.text); }
    ;

create_table_options_mysql_item returns [std::string res]
    : T_AUTO_INCREMENT T_EQUAL? expr { $res = hql_create_table_option_item($T_AUTO_INCREMENT.text, $expr.res); }
    | T_COMMENT T_EQUAL? expr { $res = hql_create_table_option_item($T_COMMENT.text, $expr.res); }
    | T_DEFAULT? (T_CHARACTER T_SET | T_CHARSET) T_EQUAL? expr { $res = hql_create_table_option_item($T_DEFAULT.text, $expr.res); }
    | T_ENGINE T_EQUAL? expr { $res = hql_create_table_option_item($T_ENGINE.text, $expr.res); }
    ;

select_stmt returns [std::string res]       // SELECT statement
    //: cte_select_stmt? fullselect_stmt 
    : fullselect_stmt { $res = $fullselect_stmt.res; }
    ;
     
// cte_select_stmt 
//     : T_WITH cte_select_stmt_item (T_COMMA cte_select_stmt_item)*
//     ;
     
// cte_select_stmt_item 
//     : ident cte_select_cols? T_AS T_OPEN_P fullselect_stmt T_CLOSE_P
//     ;
     
// cte_select_cols 
//     : T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P
//     ;
     
fullselect_stmt  returns [std::string res]
    : fullselect_stmt_item { $res = $fullselect_stmt_item.res; }
    | fullselect_stmt_item fullselect_set_clause fullselect_stmt { $res = hql_select_set_opt($fullselect_set_clause.res, $fullselect_stmt_item.res, $fullselect_stmt.res); }
    ;

fullselect_stmt_item returns [std::string res]
    : subselect_stmt { $res = $subselect_stmt.res; }
    | T_OPEN_P fullselect_stmt T_CLOSE_P { $res = $fullselect_stmt.res; }
    ;

fullselect_set_clause returns [std::string res]
    : T_UNION T_ALL { $res = "UNION_ALL"; }
    | T_UNION { $res = "UNION"; }
    | T_EXCEPT { $res = "EXCEPT"; }
    | T_EXCEPT T_ALL { $res = "EXCEPT_ALL"; }
    | T_INTERSECT { $res = "INTERSECT"; }
    | T_INTERSECT T_ALL { $res = "INTERSECT_ALL"; }
    ;
  
subselect_stmt  returns [std::string res]
    : T_SELECT select_list into_clause from_clause where_clause group_by_clause having_qualify_clause order_by_clause select_options {
        $res = hql_subselect_stmt($select_list.res, $from_clause.res, $where_clause.res, $group_by_clause.res, $having_qualify_clause.res, $order_by_clause.res, $select_options.res);
    }
    ;

having_qualify_clause returns [std::string res]
    : { $res = "null"; }
    | having_clause { $res = $having_clause.res; }
    | qualify_clause { $res = $qualify_clause.res; }
    ;

select_list returns [std::string res]
    : select_list_set select_list_limit select_expr_list { $res = hql_select_list($select_list_set.res, $select_list_limit.res, $select_expr_list.res); }
    ;

select_expr_list returns [std::string res]
    : select_list_item{ $res = $select_list_item.res; }
    | select_list_item T_COMMA select_expr_list { $res = hql_recur_list($select_list_item.res, $select_expr_list.res); }
    ;

select_list_set returns [std::string res]
    : { $res = "ALL"; }
    | T_ALL  {  $res = "ALL"; }
    | T_DISTINCT {  $res = "DISTINCT"; }
    ;
       
select_list_limit returns [std::string res]
    : { $res = "\"ALL\""; }
    |  T_TOP expr { $res = $expr.res; }
    ;

select_list_item returns [std::string res]
    : (ident T_EQUAL) expr select_list_alias { $res = hql_select_expr($expr.res, $select_list_alias.res); }
    | expr select_list_alias { $res = hql_select_expr($expr.res, $select_list_alias.res); }
    | select_list_asterisk { $res = $select_list_asterisk.res; }
    ;
     
select_list_alias returns [std::string res]
    : { $res = "DEFAULT"; }
    | T_AS? ident { $res = $ident.text; }
    | T_OPEN_P T_TITLE L_S_STRING T_CLOSE_P { $res = $L_S_STRING.text; }
    ;
     
select_list_asterisk returns [std::string res]
    :  (L_ID '.') '*' { $res = hql_select_expr("\"ALL\"", $L_ID.text); }
    |  '*'  { $res = hql_select_expr("\"ALL\"", "DEFAULT"); }
    ;
     
into_clause
    :
    | T_INTO ident (T_COMMA ident)*
    ;
     
from_clause returns [std::string res]
    : { $res = "null"; }
    | T_FROM from_table_clause from_join_clause_list { $res = hql_from_clause($from_table_clause.res, $from_join_clause_list.res); }
    ;

from_join_clause_list returns [std::string res]
    : { $res = ""; }
    | from_join_clause { $res = $from_join_clause.res; }
    | from_join_clause from_join_clause_list { $res = hql_recur_list($from_join_clause.res, $from_join_clause_list.res); }
    ;
     
from_table_clause returns [std::string res]
    : from_table_name_clause { $res = $from_table_name_clause.res; }
    | from_subselect_clause { $res = $from_subselect_clause.res; }
    | from_table_values_clause { $res = $from_table_values_clause.res; }
    ;
     
from_table_name_clause returns [std::string res]
    : table_name from_alias_clause { $res = hql_from_table_name($table_name.res, $from_alias_clause.res); }
    ;     

from_subselect_clause returns [std::string res]
    : T_OPEN_P select_stmt T_CLOSE_P from_alias_clause  { $res = hql_from_subselect($select_stmt.res, $from_alias_clause.res); }
    ;
     
from_join_clause returns [std::string res]
    : T_COMMA from_table_clause { $res = hql_join_expr("FULL", $from_table_clause.res, "\"\""); }
    | from_join_type_clause from_table_clause T_ON bool_expr { $res = hql_join_expr($from_join_type_clause.res, $from_table_clause.res, $bool_expr.res); }
    ;
     
from_join_type_clause returns [std::string res]
    :  T_INNER? T_JOIN { $res = "INNER"; }
    | typ=(T_LEFT | T_RIGHT | T_FULL) T_OUTER? T_JOIN { $res = $typ.text; }
    ;
     
from_table_values_clause returns [std::string res] 
    : T_TABLE T_OPEN_P T_VALUES from_table_values_row_list T_CLOSE_P from_alias_clause { $res = hql_from_table_values_clause($from_table_values_row_list.res, $from_alias_clause.res); }
    ;

from_table_values_row_list returns [std::string res]
    : from_table_values_row { $res = $from_table_values_row.res; }
    | from_table_values_row T_COMMA from_table_values_row_list { $res = hql_recur_list($from_table_values_row.res, $from_table_values_row_list.res); }
    ;
     
from_table_values_row returns [std::string res]
    : expr { $res = $expr.res; }
    | T_OPEN_P expr_list T_CLOSE_P { $res = $expr_list.res; }
    ;

from_alias_clause returns [std::string res]
    : { $res = "DEFAULT"; }
    | T_AS? ident (T_OPEN_P L_ID (T_COMMA L_ID)* T_CLOSE_P)? { $res = $ident.text; }
    ;

table_name returns [std::string res]
    : ident { $res = $ident.text; }
    ;

where_clause returns [std::string res]
    : { $res = "null"; }
    | T_WHERE bool_expr { $res = $bool_expr.res; }
    ;
 
group_by_clause returns [std::string res] 
    : { $res = "null"; }
    | T_GROUP T_BY expr_list { $res = $expr_list.res; }
    ;

expr_list returns [std::string res]
    : expr { $res = $expr.res; }
    | expr T_COMMA expr_list { $res = hql_recur_list($expr.res, $expr_list.res); }
    ;
     
having_clause returns [std::string res]
    : T_HAVING bool_expr{ $res = $bool_expr.res; }
    ;
     
qualify_clause returns [std::string res] 
    : T_QUALIFY bool_expr { $res = $bool_expr.res; }
    ;
     
select_options returns [std::string res]
    : { $res = "null"; }
    | select_options_item { $res = $select_options_item.res; }
    | select_options_item select_options { $res = hql_recur_list($select_options_item.res, $select_options.res); }
    ;

select_options_item returns [std::string res]
    : T_LIMIT expr { $res = hql_select_option_item("LIMIT", $expr.res); }
    | T_WITH expr_t=(T_RR | T_RS | T_CS | T_UR) (T_USE T_AND T_KEEP (T_EXCLUSIVE | T_UPDATE | T_SHARE) T_LOCKS)? { $res = hql_select_option_item("WITH", $expr_t.text); }
    ;

// update_stmt :                              // UPDATE statement
//        T_UPDATE update_table T_SET update_assignment where_clause? update_upsert?
//      ;
     
// update_assignment :
//        assignment_stmt_item (T_COMMA assignment_stmt_item)*
//      ;

// update_table :
//        (table_name from_clause? | T_OPEN_P select_stmt T_CLOSE_P) (T_AS? ident)?
//      ;     
     
// update_upsert :
//        T_ELSE insert_stmt
//      ;

// merge_stmt :                              // MERGE statement
//        T_MERGE T_INTO merge_table T_USING merge_table T_ON bool_expr merge_condition+
//      ;
     
// merge_table :
//        (table_name | (T_OPEN_P select_stmt T_CLOSE_P)) (T_AS? ident)?
//      ; 
     
// merge_condition :
//        T_WHEN T_NOT? T_MATCHED (T_AND bool_expr)? T_THEN merge_action
//      | T_ELSE T_IGNORE
//      ;
     
// merge_action :
//        T_INSERT insert_stmt_cols? T_VALUES insert_stmt_row 
//      | T_UPDATE T_SET assignment_stmt_item (T_COMMA assignment_stmt_item)* where_clause? 
//      | T_DELETE
//      ;

delete_stmt returns [std::string res]
     : T_DELETE T_FROM? table_name delete_alias where_clause { $res = hql_delete_stmt($table_name.res, $delete_alias.res, $where_clause.res); }
     | T_DELETE T_FROM? table_name delete_alias T_ALL? { $res = hql_delete_stmt($table_name.res, $delete_alias.res, ""); }
     ;

delete_alias returns [std::string res] 
     : { $res = "DEFAULT"; }
     | T_AS? ident { $res = $ident.text; }
     ;

describe_stmt  returns [std::string res]
     : (T_DESCRIBE | T_DESC) T_TABLE? table_name { $res = hql_desc_table_stmt($table_name.res); }
     ;

bool_expr returns [std::string res] // Boolean condition
     : T_OPEN_P bool_expr T_CLOSE_P { $res = $bool_expr.res; }
     | T_NOT T_OPEN_P bool_expr T_CLOSE_P { $res = hql_bool_not_expr($bool_expr.res); }
     | left_expr=bool_expr bool_expr_logical_operator right_expr=bool_expr { $res = hql_bool_expr_binary($bool_expr_logical_operator.res, $left_expr.res , $right_expr.res); }
     | bool_expr_atom { $res = $bool_expr_atom.res; }
     ;

bool_expr_atom returns [std::string res]
    : bool_expr_unary { $res = $bool_expr_unary.res; }
    | bool_expr_binary { $res = $bool_expr_binary.res; }
    | expr { $res = $expr.res; }
    ;
    
bool_expr_unary returns [std::string res]
    : expr T_IS T_NOT T_NULL{ $res = hql_is_null("IS_NOT_NULL", $expr.res); }
    | expr T_IS T_NULL { $res = hql_is_null("IS_NULL", $expr.res); }
    | v_expr=expr T_BETWEEN left_expr=expr T_AND right_expr=expr { $res = hql_between($v_expr.res, $left_expr.res, $right_expr.res); }
    | T_NOT T_EXISTS T_OPEN_P select_stmt T_CLOSE_P { $res = hql_bool_exists("NOT_EXISTS", $select_stmt.res); }
    | T_EXISTS T_OPEN_P select_stmt T_CLOSE_P { $res = hql_bool_exists("EXISTS", $select_stmt.res); }
    | bool_expr_single_in { $res = $bool_expr_single_in.res; }
    | bool_expr_multi_in { $res = $bool_expr_multi_in.res; }
    ;
    
bool_expr_single_in returns [std::string res]
    : expr T_IN T_OPEN_P select_stmt T_CLOSE_P { $res = hql_bool_expr_single_in($expr.res, "IN", $select_stmt.res); }
    | expr T_IN T_OPEN_P bool_mult_expr T_CLOSE_P { $res = hql_bool_expr_single_in($expr.res, "IN", $bool_mult_expr.res); }
    | expr T_NOT T_IN T_OPEN_P select_stmt T_CLOSE_P { $res = hql_bool_expr_single_in($expr.res, "NOT_IN", $select_stmt.res); }
    | expr T_NOT T_IN T_OPEN_P bool_mult_expr T_CLOSE_P { $res = hql_bool_expr_single_in($expr.res, "NOT_IN", $bool_mult_expr.res); }
    ;

bool_expr_multi_in returns [std::string res]
    : T_OPEN_P bool_mult_expr T_CLOSE_P T_IN T_OPEN_P select_stmt T_CLOSE_P { $res = hql_bool_expr_multi_in($bool_mult_expr.res, "IN", $select_stmt.res); }
    | T_OPEN_P bool_mult_expr T_CLOSE_P T_NOT T_IN T_OPEN_P select_stmt T_CLOSE_P { $res = hql_bool_expr_multi_in($bool_mult_expr.res, "NOT_IN", $select_stmt.res); }
    ;

bool_mult_expr returns [std::string res]
    : expr { $res = $expr.res; }
    | expr T_COMMA bool_mult_expr { $res = hql_recur_list($expr.res, $bool_mult_expr.res); }
    ;
    
bool_expr_binary returns [std::string res]
     : left_expr=expr bool_expr_binary_operator right_expr=expr { $res = hql_bool_expr_binary($bool_expr_binary_operator.res, $left_expr.res , $right_expr.res); }
     ;
     
bool_expr_logical_operator returns [std::string res]
     :  T_AND { $res = "AND"; }
     | T_OR { $res = "OR"; }
     ;      

bool_expr_binary_operator returns [std::string res]
     : T_EQUAL { $res = "EQUAL"; }
     | T_EQUAL2 { $res = "EQUAL"; }
     | T_NOTEQUAL { $res = "NOT_EQUAL"; }
     | T_NOTEQUAL2 { $res = "NOT_EQUAL"; }
     | T_LESS { $res = "LESS"; }
     | T_LESSEQUAL { $res = "LESS_EQUAL"; }
     | T_GREATER { $res = "GREATER"; }
     | T_GREATEREQUAL { $res = "GREATER_EQUAL"; }
     | op=(T_LIKE | T_RLIKE | T_REGEXP) { $res = $op.text; }
     | T_NOT op=(T_LIKE | T_RLIKE | T_REGEXP) { $res = $op.text; }
     ;

expr returns [std::string res]
    : expr interval_item  { $res = hql_expr_interval($expr.res, $interval_item.text); }
    | l=expr T_MUL r=expr { $res = hql_arithmetic_expr($T_MUL.text, $l.res, $r.res); }
    | l=expr T_DIV r=expr { $res = hql_arithmetic_expr($T_DIV.text, $l.res, $r.res); }  
    | l=expr T_ADD r=expr { $res = hql_arithmetic_expr($T_ADD.text, $l.res, $r.res); }
    | l=expr T_SUB r=expr { $res = hql_arithmetic_expr($T_SUB.text, $l.res, $r.res); }
    | T_OPEN_P select_stmt T_CLOSE_P { $res = hql_subselect_expr($select_stmt.res); }
    | T_OPEN_P expr T_CLOSE_P { $res = $expr.res; }
    | expr_atom { $res = $expr_atom.res; }
    | expr_concat { $res = hql_concat_expr_result($expr_concat.res); }
    | expr_case { $res = $expr_case.res; }
    | expr_agg_window_func { $res = $expr_agg_window_func.res; }
    | expr_spec_func { $res = $expr_spec_func.res; }
    | expr_func { $res = $expr_func.res; }
    ;

expr_concat 
    returns [ std::string res ] 
    // String concatenation operator
    : a=expr_concat_item (T_PIPE | T_CONCAT) b=expr_concat_item  { $res = hql_concat_expr($a.res, $b.res); }
    | c=expr_concat (T_PIPE | T_CONCAT) d=expr_concat_item { $res = hql_concat_expr($c.res, $d.res); }
    ;

expr_concat_item returns [ std::string res ] 
    :  T_OPEN_P expr T_CLOSE_P { $res = $expr.res; }
    | expr_case { $res = $expr_case.res; }
    | expr_agg_window_func { $res = $expr_agg_window_func.res; }
    | expr_spec_func { $res = $expr_spec_func.res; }
    | expr_func { $res = $expr_func.res; }
    | expr_atom { $res = $expr_atom.res; }
    ;

expr_case returns [ std::string res ]  // CASE expression
    : expr_case_simple { $res = $expr_case_simple.res; }
    | expr_case_searched { $res = $expr_case_searched.res; }
    ;

expr_case_simple returns [ std::string res ]
    : T_CASE expr expr_case_when_then expr_case_else T_END  { $res = hql_case_expr($expr.res, $expr_case_when_then.res, $expr_case_else.res); }
    ;

expr_case_searched returns [ std::string res ]
    : T_CASE expr_case_when_then expr_case_else T_END { $res = hql_case_expr("\"\"", $expr_case_when_then.res, $expr_case_else.res); }
    ;

expr_case_when_then returns [ std::string res ]
    : (T_WHEN a=expr T_THEN b=expr) { $res = hql_case_when_then_list($a.res, $b.res, ""); }
    | (T_WHEN c=expr T_THEN d=expr) expr_case_when_then { $res = hql_case_when_then_list($c.res, $d.res, $expr_case_when_then.res); }
    ;

expr_case_else returns [ std::string res ]
    : { $res = "\"\"";}
    | (T_ELSE expr) { $res = $expr.res;}
    ;

expr_agg_window_func returns [ std::string res ]
    : T_AVG T_OPEN_P expr_func_all_distinct expr T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("AVG", $expr_func_all_distinct.res, $expr.res, $opt_expr_func_over_clause.res); }
    | T_COUNT T_OPEN_P expr_func_all_distinct expr T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("COUNT",$expr_func_all_distinct.res, $expr.res, $opt_expr_func_over_clause.res); }
    | T_COUNT T_OPEN_P '*' T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("COUNT", "", "\"ALL\"", $opt_expr_func_over_clause.res); }
    | T_COUNT_BIG T_OPEN_P expr_func_all_distinct expr T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("COUNT_BIG",$expr_func_all_distinct.res, $expr.res, $opt_expr_func_over_clause.res); }
    | T_COUNT_BIG T_OPEN_P '*' T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("COUNT_BIG", "", "\"ALL\"", $opt_expr_func_over_clause.res); }
    | T_CUME_DIST T_OPEN_P T_CLOSE_P expr_func_over_clause { $res = hql_agg_window_func("CUME_DIST", "", "\"\"", $expr_func_over_clause.res); }
    | T_DENSE_RANK T_OPEN_P T_CLOSE_P expr_func_over_clause { $res = hql_agg_window_func("DENSE_RANK", "", "\"\"", $expr_func_over_clause.res); }
    | T_FIRST_VALUE T_OPEN_P expr T_CLOSE_P expr_func_over_clause { $res = hql_agg_window_func("FIRST_VALUE", "", "\"\"", $expr_func_over_clause.res); }
    | T_LAG T_OPEN_P expr T_CLOSE_P expr_func_over_clause { $res = hql_lag_lead_func("LAG", $expr.res, $expr_func_over_clause.res); }
    | T_LAG T_OPEN_P e1=expr T_COMMA e2=expr T_CLOSE_P expr_func_over_clause { $res = hql_lag_lead_func("LAG", aux_return_list($e1.res, $e2.res), $expr_func_over_clause.res); }
    | T_LAG T_OPEN_P e1=expr T_COMMA e2=expr T_COMMA e3=expr T_CLOSE_P expr_func_over_clause { $res = hql_lag_lead_func("LAG", aux_return_list($e1.res, $e2.res, $e3.res), $expr_func_over_clause.res); }
    | T_LAST_VALUE T_OPEN_P expr T_CLOSE_P expr_func_over_clause { $res = hql_agg_window_func("LAST_VALUE", "", "\"\"", $expr_func_over_clause.res); }
    | T_LEAD T_OPEN_P expr T_CLOSE_P expr_func_over_clause { $res = hql_lag_lead_func("LEAD", $expr.res, $expr_func_over_clause.res); }
    | T_LEAD T_OPEN_P e1=expr T_COMMA e2=expr T_CLOSE_P expr_func_over_clause { $res = hql_lag_lead_func("LEAD", aux_return_list($e1.res, $e2.res), $expr_func_over_clause.res); }
    | T_LEAD T_OPEN_P e1=expr T_COMMA e2=expr T_COMMA e3=expr T_CLOSE_P expr_func_over_clause { $res = hql_lag_lead_func("LEAD", aux_return_list($e1.res, $e2.res, $e3.res), $expr_func_over_clause.res); }
    | T_MAX T_OPEN_P expr_func_all_distinct expr T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("MAX", $expr_func_all_distinct.res, $expr.res, $opt_expr_func_over_clause.res); }
    | T_MIN T_OPEN_P expr_func_all_distinct expr T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("MIN", $expr_func_all_distinct.res, $expr.res, $opt_expr_func_over_clause.res); }
    | T_RANK T_OPEN_P T_CLOSE_P expr_func_over_clause { $res = hql_agg_window_func("RANK", "", "\"\"", $expr_func_over_clause.res); }
    | T_ROW_NUMBER T_OPEN_P T_CLOSE_P expr_func_over_clause { $res = hql_agg_window_func("ROW_NUMBER", "", "\"\"", $expr_func_over_clause.res); }
    | T_STDEV T_OPEN_P expr_func_all_distinct expr T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("STDEV", $expr_func_all_distinct.res, $expr.res, $opt_expr_func_over_clause.res); }
    | T_SUM T_OPEN_P expr_func_all_distinct expr T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("SUM", $expr_func_all_distinct.res, $expr.res, $opt_expr_func_over_clause.res); }
    | T_VAR T_OPEN_P expr_func_all_distinct expr T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("VAR", $expr_func_all_distinct.res, $expr.res, $opt_expr_func_over_clause.res); }
    | T_VARIANCE T_OPEN_P expr_func_all_distinct expr T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("VARIANCE", $expr_func_all_distinct.res, $expr.res, $opt_expr_func_over_clause.res); }
    ;

expr_func_all_distinct returns [std::string res]
    : { $res = "ALL"; }
    | T_ALL { $res = "ALL"; }
    | T_DISTINCT { $res = "DISTINCT"; }
    ;

opt_expr_func_over_clause returns [std::string res]
    : { $res = ""; }
    | expr_func_over_clause { $res = $expr_func_over_clause.res; }
    ;
expr_func_over_clause returns [std::string res]
    : T_OVER T_OPEN_P expr_func_partition_by_clause order_by_clause T_CLOSE_P { $res = hql_over_clause($expr_func_partition_by_clause.res, $order_by_clause.res); }
    ; 

expr_func_partition_by_clause returns [std::string res]
    : { $res = ""; }
    | T_PARTITION T_BY expr { $res = hql_partition_by_list($expr.res, ""); }
    | expr T_COMMA expr_func_partition_by_clause { $res = hql_partition_by_list($expr.res, $expr_func_partition_by_clause.res); }
    ;

expr_spec_func returns [std::string res]
     : T_ACTIVITY_COUNT { $res = hql_simple_spec_func("ACTIVITY_COUNT"); }
     | T_CAST T_OPEN_P expr T_AS  dtype dtype_len T_CLOSE_P { $res = hql_cast_func($expr.res, hql_dtype($dtype.res, $dtype_len.res)); }
     | T_COUNT T_OPEN_P expr T_CLOSE_P { $res = hql_agg_window_func("COUNT","", $expr.res, ""); }
     | T_COUNT T_OPEN_P '*' T_CLOSE_P opt_expr_func_over_clause { $res = hql_agg_window_func("COUNT", "", "\"ALL\"", ""); }
     | T_CURRENT_DATE | T_CURRENT T_DATE { $res = hql_simple_spec_func("CURRENT_DATE"); }
     | (T_CURRENT_TIMESTAMP | T_CURRENT T_TIMESTAMP) { $res = hql_current_timestamp(""); }
     | (T_CURRENT_TIMESTAMP | T_CURRENT T_TIMESTAMP) T_OPEN_P T_CLOSE_P { $res = hql_current_timestamp(""); }
     | (T_CURRENT_TIMESTAMP | T_CURRENT T_TIMESTAMP) (T_OPEN_P expr T_CLOSE_P) { $res = hql_current_timestamp($expr.res); }
     | T_CURRENT_USER | T_CURRENT T_USER { $res = hql_simple_spec_func("CURRENT_USER"); }
     //| T_MAX_PART_STRING T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P 
     //| T_MIN_PART_STRING T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P 
     //| T_MAX_PART_INT T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P 
     //| T_MIN_PART_INT T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P 
     //| T_MAX_PART_DATE T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P 
     //| T_MIN_PART_DATE T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P 
     //| T_PART_COUNT T_OPEN_P expr (T_COMMA expr T_EQUAL expr)* T_CLOSE_P 
     //| T_PART_LOC T_OPEN_P expr (T_COMMA expr T_EQUAL expr)+ (T_COMMA expr)? T_CLOSE_P 
     | T_TRIM T_OPEN_P expr T_CLOSE_P { $res = hql_trim_func($expr.res); }
     | (T_SUBSTR | T_SUBSTRING) T_OPEN_P exp=expr T_COMMA from_expr=expr T_CLOSE_P { $res = hql_substr_func($exp.res, $from_expr.res, ""); }
     | (T_SUBSTR | T_SUBSTRING) T_OPEN_P exp=expr T_COMMA from_expr=expr T_COMMA for_expr=expr T_CLOSE_P { $res = hql_substr_func($exp.res, $from_expr.res, $for_expr.res); }
     | T_SYSDATE { $res = hql_simple_spec_func("SYSDATE"); }
     | T_USER { $res = hql_simple_spec_func("USER"); }
     ;

expr_func returns [std::string res] 
     : ident T_OPEN_P expr_func_params T_CLOSE_P { $res = hql_generic_func($ident.text, $expr_func_params.res); }
     ;

expr_func_params returns [std::string res]
     : 
     |  func_param { $res = $func_param.res; }
     |  func_param T_COMMA expr_func_params { $res = hql_recur_list($func_param.res, $expr_func_params.res); }
     ;

func_param returns [std::string res] : 
       /* {!_input.LT(1).getText().equalsIgnoreCase("INTO")}? (ident T_EQUAL T_GREATER?)?*/ expr { $res = $expr.res; }
     ; 

order_by_clause returns [std::string res]
    : { $res = "null"; }
    | T_ORDER T_BY expr order_by_asc_desc { $res = hql_order_by_clause($expr.res, $order_by_asc_desc.res, ""); }
    | expr T_COMMA order_by_clause order_by_asc_desc { $res = hql_order_by_clause($expr.res, $order_by_asc_desc.res, $order_by_clause.res); }
    ;

order_by_asc_desc returns [std::string res]
    : { $res = "ASC"; }
    | T_ASC { $res = "ASC"; }
    | T_DESC { $res = "DESC"; }
    ;

expr_atom returns [std::string res]
    : date_literal { $res = hql_expr_atom("DATE", $date_literal.res); }
    | timestamp_literal { $res = hql_expr_atom("TIMESTAMP", $timestamp_literal.res); }
    | bool_literal { $res = hql_expr_atom("BOOLEAN", $bool_literal.res); }
    | ident { $res = hql_expr_name($ident.text); }
    | string { $res = hql_expr_atom("STRING", $string.res); }
    | dec_number { $res = hql_expr_atom("DECIMAL", $dec_number.text); }
    | int_number { $res = hql_expr_atom("INT", $int_number.text); }
    | null_const { $res = hql_expr_atom("NULL_CONSTANT", $null_const.res); }
    ;

interval_item 
     : T_DAY 
     | T_DAYS
     | T_MICROSECOND 
     | T_MICROSECONDS  
     | T_SECOND 
     | T_SECONDS  
     ;

date_literal returns [std::string res] // DATE 'YYYY-MM-DD' literal
    : T_DATE s=string { $res = $s.res; }
    ;

timestamp_literal returns [std::string res]  // TIMESTAMP 'YYYY-MM-DD HH:MI:SS.FFF' literal
    : T_TIMESTAMP s=string  { $res = $s.res; }
    ;

ident
    : '-'? (L_ID | non_reserved_words) ('.' (L_ID | non_reserved_words))*
    ;

string returns [std::string res] // String literal (single or double quoted)
    : L_S_STRING { $res = $L_S_STRING.text.substr(1, $L_S_STRING.text.length() - 2); }  # single_quotedString
    | L_D_STRING { $res = $L_D_STRING.text.substr(1, $L_D_STRING.text.length() - 2); }  # double_quotedString
    ;

bool_literal returns  [std::string res]  // Boolean literal
    : T_TRUE { $res = $T_TRUE.text; }
    | T_FALSE { $res = $T_FALSE.text; }
    ;


int_number // Integer (positive or negative)
    :('-' | '+')? L_INT
    ;

dec_number // Decimal number (positive or negative)
    : ('-' | '+')? L_DEC 
    ;

null_const returns [std::string res]  // NULL constant
    : T_NULL { $res = "NULL"; }
    ;

     
non_reserved_words // Tokens that are not reserved words and can be used as identifiers
    : T_ACTION 
    | T_ACTIVITY_COUNT
    | T_ADD2
    | T_ALL 
    | T_ALLOCATE
    | T_ALTER
    | T_AND
    | T_ANSI_NULLS
    | T_ANSI_PADDING
    | T_AS     
    | T_ASC   
    | T_ASSOCIATE     
    | T_AT
    | T_AUTO_INCREMENT
    | T_AVG
    | T_BATCHSIZE
    | T_BEGIN   
    | T_BETWEEN
    | T_BIGINT  
    | T_BINARY_DOUBLE
    | T_BINARY_FLOAT
    | T_BIT
    | T_BODY
    | T_BREAK   
    | T_BY    
    | T_BYTE
    | T_CALL     
    | T_CALLER 
    | T_CASCADE     
    | T_CASE   
    | T_CASESPECIFIC
    | T_CAST
    | T_CHAR  
    | T_CHARACTER 
    | T_CHARSET     
    | T_CLIENT     
    | T_CLOSE 
    | T_CLUSTERED
    | T_CMP
    | T_COLLECT
    | T_COLLECTION  
    | T_COLUMN
    | T_COMMENT  
    | T_COMPRESS     
    | T_CONSTANT     
    | T_COPY
    | T_COMMIT
    | T_CONCAT 
    | T_CONDITION
    | T_CONSTRAINT
    | T_CONTINUE
    | T_COUNT   
    | T_COUNT_BIG   
    | T_CREATE
    | T_CREATION
    | T_CREATOR
    | T_CS
    | T_CUME_DIST
    | T_CURRENT 
    | T_CURRENT_DATE
    | T_CURRENT_SCHEMA
    | T_CURRENT_TIMESTAMP
    | T_CURRENT_USER
    | T_CURSOR  
    | T_DATA
    | T_DATABASE
    | T_DATE   
    | T_DATETIME     
    | T_DAY
    | T_DAYS
    | T_DEC      
    | T_DECIMAL  
    | T_DECLARE 
    | T_DEFAULT  
    | T_DEFERRED
    | T_DEFINED
    | T_DEFINER
    | T_DEFINITION
    | T_DELETE
    | T_DELIMITED
    | T_DELIMITER
    | T_DENSE_RANK
    | T_DESC   
    | T_DESCRIBE 
    | T_DIAGNOSTICS
    | T_DIR
    | T_DIRECTORY
    | T_DISTINCT 
    | T_DISTRIBUTE
    | T_DO        
    | T_DOUBLE     
    | T_DROP    
    | T_DYNAMIC      
    // T_ELSE reserved word         
    // T_ELSEIF reserved word       
    // T_ELSIF reserved word        
    // T_END reserved word
    | T_ENABLE
    | T_ENGINE     
    | T_ESCAPED     
    | T_EXCEPT       
    | T_EXEC         
    | T_EXECUTE      
    | T_EXCEPTION  
    | T_EXCLUSIVE     
    | T_EXISTS
    | T_EXIT 
    | T_FALLBACK     
    | T_FALSE     
    | T_FETCH  
    | T_FIELDS
    | T_FILE    
    | T_FILES 
    | T_FIRST_VALUE     
    | T_FLOAT        
    | T_FOR  
    | T_FOREIGN
    | T_FORMAT     
    | T_FOUND        
    | T_FROM  
    | T_FULL     
    | T_FUNCTION
    | T_GET
    | T_GLOBAL
    | T_GO
    | T_GRANT
    | T_GROUP        
    | T_HANDLER      
    | T_HASH
    | T_HAVING       
    | T_HDFS
    | T_HIVE         
    | T_HOST    
    | T_IDENTITY     
    | T_IF    
    | T_IGNORE     
    | T_IMMEDIATE    
    | T_IN   
    | T_INCLUDE
    | T_INDEX     
    | T_INITRANS
    | T_INNER
    | T_INOUT
    | T_INSERT
    | T_INT          
    | T_INT2
    | T_INT4
    | T_INT8
    | T_INTEGER      
    | T_INTERSECT  
    | T_INTERVAL     
    | T_INTO 
    | T_INVOKER     
    | T_ITEMS     
    | T_IS    
    | T_ISOPEN
    | T_JOIN  
    | T_KEEP     
    | T_KEY
    | T_KEYS
    | T_LAG
    | T_LANGUAGE
    | T_LAST_VALUE
    | T_LEAD
    | T_LEAVE     
    | T_LEFT     
    | T_LIKE 
    | T_LIMIT  
    | T_LINES     
    | T_LOCAL    
    | T_LOCATION 
    | T_LOCATOR
    | T_LOCATORS
    | T_LOCKS
    | T_LOG
    | T_LOGGED    
    | T_LOGGING     
    | T_LOOP    
    | T_MAP  
    | T_MATCHED     
    | T_MAX   
    | T_MAXTRANS     
    | T_MERGE
    | T_MESSAGE_TEXT
    | T_MICROSECOND
    | T_MICROSECONDS
    | T_MIN
    | T_MULTISET
    | T_NCHAR
    | T_NEW
    | T_NVARCHAR
    | T_NO
    | T_NOCOMPRESS
    | T_NOCOUNT
    | T_NOLOGGING
    | T_NONE
    | T_NOT         
    | T_NOTFOUND     
    // T_NULL reserved word       
    | T_NUMERIC
    | T_NUMBER   
    | T_OBJECT  
    | T_OFF     
    | T_ON
    | T_ONLY
    | T_OPEN         
    | T_OR           
    | T_ORDER   
    | T_OUT     
    | T_OUTER
    | T_OVER
    | T_OVERWRITE
    | T_OWNER
    | T_PACKAGE
    | T_PART_COUNT
    | T_PART_LOC 
    | T_PARTITION  
    | T_PCTFREE
    | T_PCTUSED  
    | T_PRECISION     
    | T_PRESERVE
    | T_PRIMARY
    | T_PRINT 
    | T_PROC
    | T_PROCEDURE 
    | T_PWD     
    | T_QUALIFY
    | T_QUERY_BAND
    | T_QUIT
    | T_QUOTED_IDENTIFIER
    | T_RAISE
    | T_RANK  
    | T_REAL
    | T_REFERENCES     
    | T_REGEXP
    | T_RR     
    | T_REPLACE
    | T_RESIGNAL
    | T_RESTRICT
    | T_RESULT
    | T_RESULT_SET_LOCATOR
    | T_RETURN       
    | T_RETURNS
    | T_REVERSE    
    | T_RIGHT
    | T_RLIKE
    | T_RS 
    | T_ROLE     
    | T_ROLLBACK
    | T_ROW
    | T_ROWS
    | T_ROW_COUNT
    | T_ROW_NUMBER
    | T_SCHEMA
    | T_SECOND
    | T_SECONDS
    | T_SECURITY
    | T_SEGMENT
    | T_SEL          
    | T_SELECT 
    | T_SESSION 
    | T_SESSIONS
    | T_SET 
    | T_SETS     
    | T_SHARE
    | T_SIGNAL
    | T_SIMPLE_DOUBLE
    | T_SIMPLE_FLOAT
    | T_SMALLDATETIME
    | T_SMALLINT     
    | T_SQL
    | T_SQLEXCEPTION 
    | T_SQLINSERT
    | T_SQLSTATE
    | T_SQLWARNING  
    | T_STATS
    | T_STATISTICS     
    | T_STEP    
    | T_STDEV     
    | T_STORAGE
    | T_STORED
    | T_STRING   
    | T_SUBDIR  
    | T_SUBSTR
    | T_SUBSTRING
    | T_SUM
    | T_SUMMARY
    | T_SYSDATE 
    | T_SYS_REFCURSOR     
    | T_TABLE
    | T_TABLESPACE
    | T_TEMPORARY
    | T_TERMINATED
    | T_TEXTIMAGE_ON
    | T_THEN  
    | T_TIMESTAMP     
    | T_TITLE
    | T_TO     
    | T_TOP
    | T_TRANSACTION
    | T_TRIM
    | T_TRUE
    | T_TRUNCATE
    // T_UNION reserved word   
    | T_UNIQUE     
    | T_UPDATE  
    | T_UR     
    | T_USE         
    | T_USER     
    | T_USING        
    | T_VALUE
    | T_VALUES
    | T_VAR
    | T_VARCHAR      
    | T_VARCHAR2
    | T_VARYING
    | T_VARIANCE
    | T_VOLATILE
    // T_WHEN reserved word         
    // T_WHERE reserved word        
    | T_WHILE     
    | T_WITH 
    | T_WITHOUT      
    | T_WORK
    | T_XACT_ABORT
    | T_XML
    | T_YES
    ;


// Lexer rules
T_ACTION          : A C T I O N ; 
T_ADD2            : A D D ;
T_ALL             : A L L ;
T_ALLOCATE        : A L L O C A T E ;
T_ALTER           : A L T E R ;
T_AND             : A N D ;
T_ANSI_NULLS      : A N S I '_' N U L L S ;
T_ANSI_PADDING    : A N S I '_' P A D D I N G ;
T_AS              : A S ;
T_ASC             : A S C ;
T_ASSOCIATE       : A S S O C I A T E ; 
T_AT              : A T ;
T_AUTO_INCREMENT  : A U T O '_' I N C R E M E N T ;
T_AVG             : A V G ; 
T_BATCHSIZE       : B A T C H S I Z E ;
T_BEGIN           : B E G I N ;
T_BETWEEN         : B E T W E E N ; 
T_BIGINT          : B I G I N T ;
T_BINARY_DOUBLE   : B I N A R Y '_' D O U B L E ;
T_BINARY_FLOAT    : B I N A R Y '_' F L O A T ;
T_BINARY_INTEGER  : B I N A R Y '_' I N T E G E R ;
T_BIT             : B I T ;
T_BODY            : B O D Y ; 
T_BREAK           : B R E A K ;
T_BY              : B Y ;
T_BYTE            : B Y T E ; 
T_CALL            : C A L L ;
T_CALLER          : C A L L E R ;
T_CASCADE         : C A S C A D E ; 
T_CASE            : C A S E ;
T_CASESPECIFIC    : C A S E S P E C I F I C ; 
T_CAST            : C A S T ;
T_CHAR            : C H A R ;
T_CHARACTER       : C H A R A C T E R ;
T_CHARSET         : C H A R S E T ;
T_CLIENT          : C L I E N T ;
T_CLOSE           : C L O S E ;
T_CLUSTERED       : C L U S T E R E D;
T_CMP             : C M P ; 
T_COLLECT         : C O L L E C T ; 
T_COLLECTION      : C O L L E C T I O N ; 
T_COLUMN          : C O L U M N ;
T_COMMENT         : C O M M E N T;
T_CONSTANT        : C O N S T A N T ;
T_COMMIT          : C O M M I T ; 
T_COMPRESS        : C O M P R E S S ;
T_CONCAT          : C O N C A T;
T_CONDITION       : C O N D I T I O N ;
T_CONSTRAINT      : C O N S T R A I N T ; 
T_CONTINUE        : C O N T I N U E ;
T_COPY            : C O P Y ;
T_COUNT           : C O U N T ;
T_COUNT_BIG       : C O U N T '_' B I G;
T_CREATE          : C R E A T E ;
T_CREATION        : C R E A T I O N ; 
T_CREATOR         : C R E A T O R ;
T_CS              : C S;
T_CURRENT         : C U R R E N T ;
T_CURRENT_SCHEMA  : C U R R E N T '_' S C H E M A ;
T_CURSOR          : C U R S O R ;
T_DATABASE        : D A T A B A S E ;
T_DATA            : D A T A ;
T_DATE            : D A T E ;
T_DATETIME        : D A T E T I M E ; 
T_DAY             : D A Y ;
T_DAYS            : D A Y S ;
T_DEC             : D E C ;
T_DECIMAL         : D E C I M A L ;
T_DECLARE         : D E C L A R E ;
T_DEFAULT         : D E F A U L T ;
T_DEFERRED        : D E F E R R E D ; 
T_DEFINED         : D E F I N E D ; 
T_DEFINER         : D E F I N E R ;
T_DEFINITION      : D E F I N I T I O N ; 
T_DELETE          : D E L E T E ;
T_DELIMITED       : D E L I M I T E D ; 
T_DELIMITER       : D E L I M I T E R ; 
T_DESC            : D E S C ;
T_DESCRIBE        : D E S C R I B E ; 
T_DIAGNOSTICS     : D I A G N O S T I C S ;
T_DIR             : D I R ;
T_DIRECTORY       : D I R E C T O R Y ; 
T_DISTINCT        : D I S T I N C T ;
T_DISTRIBUTE      : D I S T R I B U T E ;
T_DO              : D O ;
T_DOUBLE          : D O U B L E ;
T_DROP            : D R O P ;
T_DYNAMIC         : D Y N A M I C ; 
T_ELSE            : E L S E ;
T_ELSEIF          : E L S E I F ;
T_ELSIF           : E L S I F ;
T_ENABLE          : E N A B L E ;
T_END             : E N D ;
T_ENGINE          : E N G I N E ;
T_ESCAPED         : E S C A P E D ; 
T_EXCEPT          : E X C E P T ;
T_EXEC            : E X E C ;
T_EXECUTE         : E X E C U T E ;
T_EXCEPTION       : E X C E P T I O N ;
T_EXCLUSIVE       : E X C L U S I V E ; 
T_EXISTS          : E X I S T S ; 
T_EXIT            : E X I T ;
T_FALLBACK        : F A L L B A C K ;
T_FALSE           : F A L S E ;
T_FETCH           : F E T C H ;
T_FIELDS          : F I E L D S ; 
T_FILE            : F I L E ;
T_FILES           : F I L E S ; 
T_FLOAT           : F L O A T ;
T_FOR             : F O R ;
T_FOREIGN         : F O R E I G N ; 
T_FORMAT          : F O R M A T ;
T_FOUND           : F O U N D ;
T_FROM            : F R O M ; 
T_FULL            : F U L L ;
T_FUNCTION        : F U N C T I O N ;
T_GET             : G E T ;
T_GLOBAL          : G L O B A L ; 
T_GO              : G O ;
T_GRANT           : G R A N T ; 
T_GROUP           : G R O U P ;
T_HANDLER         : H A N D L E R ;
T_HASH            : H A S H ;
T_HAVING          : H A V I N G ;
T_HDFS            : H D F S ; 
T_HIVE            : H I V E ;
T_HOST            : H O S T ;
T_IDENTITY        : I D E N T I T Y ; 
T_IF              : I F ;
T_IGNORE          : I G N O R E ; 
T_IMMEDIATE       : I M M E D I A T E ;
T_IN              : I N ;
T_INCLUDE         : I N C L U D E ;
T_INDEX           : I N D E X ;
T_INITRANS        : I N I T R A N S ;
T_INNER           : I N N E R ; 
T_INOUT           : I N O U T;
T_INSERT          : I N S E R T ;
T_INT             : I N T ;
T_INT2            : I N T '2';
T_INT4            : I N T '4';
T_INT8            : I N T '8';
T_INTEGER         : I N T E G E R ;
T_INTERSECT       : I N T E R S E C T ;
T_INTERVAL        : I N T E R V A L ; 
T_INTO            : I N T O ;
T_INVOKER         : I N V O K E R ;
T_IS              : I S ;
T_ISOPEN          : I S O P E N ;
T_ITEMS           : I T E M S ; 
T_JOIN            : J O I N ;
T_KEEP            : K E E P; 
T_KEY             : K E Y ;
T_KEYS            : K E Y S ;
T_LANGUAGE        : L A N G U A G E ;
T_LEAVE           : L E A V E ;
T_LEFT            : L E F T ;
T_LIKE            : L I K E ; 
T_LIMIT           : L I M I T ;
T_LINES           : L I N E S ; 
T_LOCAL           : L O C A L ;
T_LOCATION        : L O C A T I O N ;
T_LOCATOR         : L O C A T O R ; 
T_LOCATORS        : L O C A T O R S ; 
T_LOCKS           : L O C K S ; 
T_LOG             : L O G ; 
T_LOGGED          : L O G G E D ; 
T_LOGGING         : L O G G I N G ; 
T_LOOP            : L O O P ;
T_MAP             : M A P ; 
T_MATCHED         : M A T C H E D ; 
T_MAX             : M A X ;
T_MAXTRANS        : M A X T R A N S ; 
T_MERGE           : M E R G E ; 
T_MESSAGE_TEXT    : M E S S A G E '_' T E X T ;
T_MICROSECOND     : M I C R O S E C O N D ;
T_MICROSECONDS    : M I C R O S E C O N D S;
T_MIN             : M I N ;
T_MULTISET        : M U L T I S E T ; 
T_NCHAR           : N C H A R ; 
T_NEW             : N E W ;
T_NVARCHAR        : N V A R C H A R ; 
T_NO              : N O ;
T_NOCOUNT         : N O C O U N T ;
T_NOCOMPRESS      : N O C O M P R E S S ; 
T_NOLOGGING       : N O L O G G I N G ;
T_NONE            : N O N E ;
T_NOT             : N O T ;
T_NOTFOUND        : N O T F O U N D ; 
T_NULL            : N U L L ;
T_NUMERIC         : N U M E R I C ; 
T_NUMBER          : N U M B E R ;
T_OBJECT          : O B J E C T ; 
T_OFF             : O F F ;
T_ON              : O N ;
T_ONLY            : O N L Y ;
T_OPEN            : O P E N ;
T_OR              : O R ;
T_ORDER           : O R D E R;
T_OUT             : O U T ;
T_OUTER           : O U T E R ;
T_OVER            : O V E R ;
T_OVERWRITE       : O V E R W R I T E ; 
T_OWNER           : O W N E R ; 
T_PACKAGE         : P A C K A G E ; 
T_PARTITION       : P A R T I T I O N ; 
T_PCTFREE         : P C T F R E E ; 
T_PCTUSED         : P C T U S E D ;
T_PLS_INTEGER     : P L S '_' I N T E G E R ;
T_PRECISION       : P R E C I S I O N ; 
T_PRESERVE        : P R E S E R V E ; 
T_PRIMARY         : P R I M A R Y ;
T_PRINT           : P R I N T ; 
T_PROC            : P R O C ;
T_PROCEDURE       : P R O C E D U R E ;
T_QUALIFY         : Q U A L I F Y ;
T_QUERY_BAND      : Q U E R Y '_' B A N D ; 
T_QUIT            : Q U I T ; 
T_QUOTED_IDENTIFIER : Q U O T E D '_' I D E N T I F I E R ;
T_RAISE           : R A I S E ;
T_REAL            : R E A L ; 
T_REFERENCES      : R E F E R E N C E S ; 
T_REGEXP          : R E G E X P ;
T_REPLACE         : R E P L A C E ; 
T_RESIGNAL        : R E S I G N A L ;
T_RESTRICT        : R E S T R I C T ; 
T_RESULT          : R E S U L T ; 
T_RESULT_SET_LOCATOR : R E S U L T '_' S E T '_' L O C A T O R ;
T_RETURN          : R E T U R N ;
T_RETURNS         : R E T U R N S ;
T_REVERSE         : R E V E R S E ;
T_RIGHT           : R I G H T ;
T_RLIKE           : R L I K E ;
T_ROLE            : R O L E ;
T_ROLLBACK        : R O L L B A C K ;
T_ROW             : R O W ; 
T_ROWS            : R O W S ; 
T_ROWTYPE         : R O W T Y P E ; 
T_ROW_COUNT       : R O W '_' C O U N T ;
T_RR              : R R;
T_RS              : R S ;
T_PWD             : P W D ; 
T_TRIM            : T R I M ;
T_SCHEMA          : S C H E M A ;
T_SECOND          : S E C O N D ;
T_SECONDS         : S E C O N D S;
T_SECURITY        : S E C U R I T Y ; 
T_SEGMENT         : S E G M E N T ; 
T_SEL             : S E L ;
T_SELECT          : S E L E C T ; 
T_SET             : S E T ;
T_SESSION         : S E S S I O N ; 
T_SESSIONS        : S E S S I O N S ;
T_SETS            : S E T S;
T_SHARE           : S H A R E ; 
T_SIGNAL          : S I G N A L ;
T_SIMPLE_DOUBLE   : S I M P L E '_' D O U B L E ;
T_SIMPLE_FLOAT    : S I M P L E '_' F L O A T ;
T_SIMPLE_INTEGER  : S I M P L E '_' I N T E G E R ;
T_SMALLDATETIME   : S M A L L D A T E T I M E ;
T_SMALLINT        : S M A L L I N T ;
T_SQL             : S Q L ; 
T_SQLEXCEPTION    : S Q L E X C E P T I O N ;
T_SQLINSERT       : S Q L I N S E R T ;
T_SQLSTATE        : S Q L S T A T E ;
T_SQLWARNING      : S Q L W A R N I N G ;
T_STATS           : S T A T S ; 
T_STATISTICS      : S T A T I S T I C S ;
T_STEP            : S T E P ; 
T_STORAGE         : S T O R A G E ; 
T_STORED          : S T O R E D ;
T_STRING          : S T R I N G ;
T_SUBDIR          : S U B D I R ; 
T_SUBSTR          : S U B S T R ; 
T_SUBSTRING       : S U B S T R I N G ; 
T_SUM             : S U M ;
T_SUMMARY         : S U M M A R Y ;
T_SYS_REFCURSOR   : S Y S '_' R E F C U R S O R ; 
T_TABLE           : T A B L E ;
T_TABLESPACE      : T A B L E S P A C E ; 
T_TEMPORARY       : T E M P O R A R Y ;
T_TERMINATED      : T E R M I N A T E D ; 
T_TEXTIMAGE_ON    : T E X T I M A G E '_' O N ;
T_THEN            : T H E N ;
T_TIMESTAMP       : T I M E S T A M P ;
T_TINYINT         : T I N Y I N T ;
T_TITLE           : T I T L E ;
T_TO              : T O ; 
T_TOP             : T O P ;
T_TRANSACTION     : T R A N S A C T I O N ;
T_TRUE            : T R U E ;
T_TRUNCATE        : T R U N C A T E;
T_TYPE            : T Y P E ; 
T_UNION           : U N I O N ;
T_UNIQUE          : U N I Q U E ;
T_UPDATE          : U P D A T E ; 
T_UR              : U R ;
T_USE             : U S E ;
T_USING           : U S I N G ;
T_VALUE           : V A L U E ;
T_VALUES          : V A L U E S ;
T_VAR             : V A R ;
T_VARCHAR         : V A R C H A R ;
T_VARCHAR2        : V A R C H A R '2' ;
T_VARYING         : V A R Y I N G ;
T_VOLATILE        : V O L A T I L E ;
T_WHEN            : W H E N ;
T_WHERE           : W H E R E ;
T_WHILE           : W H I L E ;
T_WITH            : W I T H ; 
T_WITHOUT         : W I T H O U T ;
T_WORK            : W O R K ;
T_XACT_ABORT      : X A C T '_' A B O R T ;
T_XML             : X M L ;
T_YES             : Y E S ; 

// Functions with specific syntax
T_ACTIVITY_COUNT       : A C T I V I T Y '_' C O U N T ;
T_CUME_DIST            : C U M E '_' D I S T ; 
T_CURRENT_DATE         : C U R R E N T '_' D A T E ;
T_CURRENT_TIMESTAMP    : C U R R E N T '_' T I M E S T A M P ;
T_CURRENT_USER         : C U R R E N T '_' U S E R ;
T_DENSE_RANK           : D E N S E '_' R A N K ;
T_FIRST_VALUE          : F I R S T '_' V A L U E; 
T_LAG                  : L A G ;
T_LAST_VALUE           : L A S T '_' V A L U E; 
T_LEAD                 : L E A D ; 
T_MAX_PART_STRING      : M A X '_' P A R T '_' S T R I N G ;
T_MIN_PART_STRING      : M I N '_' P A R T '_' S T R I N G ;
T_MAX_PART_INT         : M A X '_' P A R T '_' I N T ;
T_MIN_PART_INT         : M I N '_' P A R T '_' I N T ;
T_MAX_PART_DATE        : M A X '_' P A R T '_' D A T E ;
T_MIN_PART_DATE        : M I N '_' P A R T '_' D A T E ;
T_PART_COUNT           : P A R T '_' C O U N T ; 
T_PART_LOC             : P A R T '_' L O C ;
T_RANK                 : R A N K ;
T_ROW_NUMBER           : R O W '_' N U M B E R;
T_STDEV                : S T D E V ;
T_SYSDATE              : S Y S D A T E ;
T_VARIANCE             : V A R I A N C E ; 
T_USER                 : U S E R; 

T_ADD          : '+' ;
T_COLON        : ':' ;
T_COMMA        : ',' ;
T_PIPE         : '||' ;
T_DIV          : '/' ;
T_DOT2         : '..' ;
T_EQUAL        : '=' ;
T_EQUAL2       : '==' ;
T_NOTEQUAL     : '<>' ;
T_NOTEQUAL2    : '!=' ;
T_GREATER      : '>' ;
T_GREATEREQUAL : '>=' ;
T_LESS         : '<' ;
T_LESSEQUAL    : '<=' ;
T_MUL          : '*' ;
T_OPEN_B       : '{' ;
T_OPEN_P       : '(' ;
T_OPEN_SB      : '[' ;
T_CLOSE_B      : '}' ; 
T_CLOSE_P      : ')' ;
T_CLOSE_SB     : ']' ;
T_SEMICOLON    : ';' ;
T_SUB          : '-' ;

L_S_STRING  : '\'' (('\'' '\'') | ('\\' '\'') | ~('\''))* '\''         // Single quoted string literal
            ;
L_D_STRING  : '"' (L_STR_ESC_D | .)*? '"'                              // Double quoted string literal
            ;

L_ID        : L_ID_PART                                                // Identifier
            ;

L_INT       : L_DIGIT+ ;                                               // Integer
L_DEC       : L_DIGIT+ '.' ~'.' L_DIGIT*                               // Decimal number
            | '.' L_DIGIT+
            ;
L_WS        : L_BLANK+ -> skip ;                                       // Whitespace
L_M_COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;                       // Multiline comment
L_S_COMMENT : ('--' | '//')  .*? '\r'? '\n' -> channel(HIDDEN) ;       // Single line comment

L_FILE      : ([a-zA-Z] ':' '\\'?)? L_ID ('\\' L_ID)*                  // File path (a/b/c Linux path causes conflicts with division operator and handled at parser level)
            ; 

L_LABEL     : ([a-zA-Z] | L_DIGIT | '_')* ':'            
            ;
            
fragment
L_ID_PART  :
             [a-zA-Z] ([a-zA-Z] | L_DIGIT | '_')*                           // Identifier part
            | '$' '{' .*? '}'
            | ('_' | '@' | ':' | '#' | '$') ([a-zA-Z] | L_DIGIT | '_' | '@' | ':' | '#' | '$')+     // (at least one char must follow special char)
            | '"' .*? '"'                                                   // Quoted identifiers
            | '[' .*? ']'
            | '`' .*? '`'
            ;
fragment
L_STR_ESC_D :                                                          // Double quoted string escape sequence
              '""' | '\\"' 
            ;            
fragment
L_DIGIT     : [0-9]                                                    // Digit
            ;
fragment
L_BLANK     : (' ' | '\t' | '\r' | '\n')
            ;

// Support case-insensitive keywords and allowing case-sensitive identifiers
fragment A : ('a'|'A') ;
fragment B : ('b'|'B') ;
fragment C : ('c'|'C') ;
fragment D : ('d'|'D') ;
fragment E : ('e'|'E') ;
fragment F : ('f'|'F') ;
fragment G : ('g'|'G') ;
fragment H : ('h'|'H') ;
fragment I : ('i'|'I') ;
fragment J : ('j'|'J') ;
fragment K : ('k'|'K') ;
fragment L : ('l'|'L') ;
fragment M : ('m'|'M') ;
fragment N : ('n'|'N') ;
fragment O : ('o'|'O') ;
fragment P : ('p'|'P') ;
fragment Q : ('q'|'Q') ;
fragment R : ('r'|'R') ;
fragment S : ('s'|'S') ;
fragment T : ('t'|'T') ;
fragment U : ('u'|'U') ;
fragment V : ('v'|'V') ;
fragment W : ('w'|'W') ;
fragment X : ('x'|'X') ;
fragment Y : ('y'|'Y') ;
fragment Z : ('z'|'Z') ;
