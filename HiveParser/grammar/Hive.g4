grammar Hive;

@header {
    #include <string>
    #include <vector>
    #include <cstdio>
    #include "nlohmann/json.hpp"
    #include "hql_types.h"
    #include "hql_exprs.h"
    #include "hql_stmts.h"
    #include "hql_functions.h"
    #include "utils.h"

    using namespace std;
    using json = nlohmann::json;

}


/* Parser */

program returns [json res]
    : stmt_list EOF { $res = $stmt_list.res; }
    ;

stmt_list returns [json res]
    :{ vector<StmtContext*> stmts; } (stmts+=stmt ';')+ { 
        vector<json> stmt_list;
        for(StmtContext* stmt : $stmts) {stmt_list.push_back(stmt->res);}
        $res = hql_stmt_list(stmt_list); }
    ;

data_type returns [json res]
    : primitive_type { $res = hql_primitive_type_spec($primitive_type.res); }
    | complex_type { $res = $complex_type.res; }
    ;

primitive_type returns [std::string res]
    : T_TINYINT { $res = "TINYINT"; }
    | T_SMALLINT { $res = "SMALLINT"; }
    | T_INT { $res = "INT"; }
    | T_BIGINT { $res = "BIGINT"; }
    | T_BOOLEAN { $res = "BOOLEAN"; } 
    | T_FLOAT { $res = "FLOAT"; } 
    | T_DOUBLE T_PRECISION? { $res = "DOUBLE"; }
    | T_STRING { $res = "STRING"; } 
    | T_BINARY { $res = "BINARY"; } 
    | T_TIMESTAMP { $res = "TIMESTAMP"; } 
    | T_DECIMAL { $res = "DECIMAL"; } 
    | T_DECIMAL '(' precision=INT_LITERAL ',' scale=INT_LITERAL ')' { $res = "DECIMAL"; } 
    | T_DATE { $res = "DATE"; } 
    | T_VARCHAR { $res = "VARCHAR"; } 
    | T_CHAR { $res = "CHAR"; } 
    ;

complex_type returns [json res]
    : T_ARRAY '<' primitive_type '>' { $res = hql_array_type_spec($primitive_type.res); }
    | T_MAP '<' primitive_type ',' data_type '>' { $res = hql_map_type_spec($primitive_type.res, $data_type.res); }
    | { vector<Column_identifierContext*> column_list; vector<Data_typeContext*> data_type_list; } T_STRUCT '<' column_list+=column_identifier ':' data_type_list+=data_type ( ',' column_list+=column_identifier ':' data_type_list+=data_type )* '>' {
        vector<string> column_json_list; vector<json> data_type_json_list;
        for(int i = 0 ; i < $column_list.size(); i++)
        {
            column_json_list.push_back($column_list[i]->res);
            data_type_json_list.push_back($data_type_list[i]->res);
        }
        $res = hql_struct_type_spec(column_json_list, data_type_json_list);
    }
    | { vector<Data_typeContext*> data_type_list; } T_UNIONTYPE '<' data_type_list+=data_type ( ','  data_type_list+=data_type )* '>' {
        vector<json> data_type_json_list;
        for(Data_typeContext* dtyp:$data_type_list)
        {
            data_type_json_list.push_back(dtyp->res);
        }
        $res = hql_uniontype_type_spec(data_type_json_list);
    }
    ;

dtype_len : // Data type length or size specification
       T_OPEN_P size=(L_INT | T_MAX) (T_CHAR | T_BYTE)? (T_COMMA L_INT)? T_CLOSE_P
     ;

stmt returns [json res]
    : query_stmt { $res = $query_stmt.res; }
    | ddl_stmt { $res = $ddl_stmt.res; }
    ;

ddl_stmt returns [json res]
    : create_table_stmt { $res = $create_table_stmt.res; }
    ;

create_table_stmt returns [json res]
    : T_CREATE table_type T_TABLE opt_if_not_exists_flag tab_ident 
        opt_column_specs opt_constraint_specification
        opt_comment opt_partitioned_table opt_clustered_by_table 
        opt_skewed_by_table opt_row_formated opt_stored_as opt_location
        opt_table_properties opt_as_select {
            $res = hql_stmt_create_table($table_type.res, $opt_if_not_exists_flag.res, $tab_ident.res, 
                $opt_column_specs.res, $opt_constraint_specification.res, $opt_comment.res, 
                $opt_partitioned_table.res, $opt_clustered_by_table.res, $opt_skewed_by_table.res,
                $opt_row_formated.res, $opt_stored_as.res, $opt_location.res, 
                $opt_table_properties.res, $opt_as_select.res);
        }
    ;

opt_column_specs returns [vector<json> res]
    : { $res = vector<json>(); }
    | {vector<Column_definitionContext*> column_def_list; } T_OPEN_P column_def_list+=column_definition  ( ',' column_def_list+=column_definition )* T_CLOSE_P {
        vector<json> column_def_json_list;
        for(Column_definitionContext* column_ctxt:$column_def_list)
        {
            column_def_json_list.push_back(column_ctxt->res);
        }
        $res = column_def_json_list;
    }
    ;

opt_constraint_specification returns [vector<json> res]
    : { $res = vector<json>(); }
    | { vector<Constraint_specificationContext*> constraint_list; } constraint_list+=constraint_specification constraint_list+=constraint_specification* {
        vector<json> contraint_json_list;
        for(Constraint_specificationContext* contraint_ctxt:$constraint_list)
            contraint_json_list.push_back(contraint_ctxt->res);
        $res = contraint_json_list;
    }
    ;

opt_comment returns [string res]
    : { $res = string(); }
    | T_COMMENT table_comment=STRING_LITERAL { $res = remove_quotes($table_comment.text);}
    ;

table_options returns [json res]
    : opt_partitioned_table 
    ;

opt_partitioned_table returns [vector<json> res]
    : { $res = vector<json>(); }
    | { vector<Partition_specContext*> partition_field_list; } T_PARTITIONED T_BY T_OPEN_P partition_field_list+=partition_spec  ( ',' partition_field_list+=partition_spec )* T_CLOSE_P {
        vector<json> partition_json_list;
        for(Partition_specContext* part_cxt:$partition_field_list)
        {
            partition_json_list.push_back(part_cxt->res);
        }
        $res = partition_json_list;
    }
    ;

partition_spec returns [json res]
    : column_identifier data_type { $res = hql_column_definition($column_identifier.res, $data_type.res); }
    | column_identifier data_type T_COMMENT STRING_LITERAL { $res = hql_column_definition($column_identifier.res, $data_type.res, $STRING_LITERAL.text); }
    ;

opt_clustered_by_table returns [json res]
    : { $res = json(); }
    | { vector<Column_identifierContext*> column_list; } T_CLUSTERED T_BY T_OPEN_P column_list+=column_identifier ( ',' column_list+=column_identifier )*  T_CLOSE_P opt_sorted_by_table T_INTO INT_LITERAL T_BUCKETS {
        vector<string> column_str_list;
        for(Column_identifierContext* column_ctxt:$column_list)
            column_str_list.push_back(column_ctxt->res);
        $res = hql_clustered_by_expr(column_str_list, $opt_sorted_by_table.res, $INT_LITERAL.text);
    }
    ;

opt_sorted_by_table returns [vector<json> res]
    : { $res = vector<json>(); }
    | { vector<string> column_list; vector<string> sort_type_list; } T_STORED T_BY T_OPEN_P column_list+=column_identifier sort_type_list+=opt_sorted_by_asc_desc ( ',' column_list+=column_identifier sort_type_list+=opt_sorted_by_asc_desc )* T_CLOSE_P {
        vector<json> result_list;
        for(int i = 0 ; i < $column_list.size() ; i++)
        {
            json tmp;
            tmp["column"] = $column_list[i]->res;
            tmp["sort_type"] = $sort_type_list[i]->res;
            result_list.push_back(tmp);
        }
        $res = result_list;
    }
    ;

opt_sorted_by_asc_desc returns [string res]
    : { $res = "ASC"; }
    | T_ASC { $res = "ASC"; }
    | T_DESC { $res = "DESC"; }
    ;

opt_skewed_by_table returns [json res]
    : { $res = json(); }
    | { vector<Column_identifierContext*> column_list; } T_SKEWED T_BY T_OPEN_P column_list+=column_identifier ( ',' column_list+=column_identifier )* opt_on_skewed T_CLOSE_P opt_skewed_stored_as_directory {
        vector<string> column_str_list;
        for(Column_identifierContext* column_ctxt:$column_list)
            column_str_list.push_back(column_ctxt->res);
        $res = hql_skewed_by_expr(column_str_list,$opt_on_skewed.res, $opt_skewed_stored_as_directory.res);
    } 
    ;

opt_on_skewed returns [vector<json> res]
    : { $res = vector<json>(); }
    | { vector<Literal_valuesContext*> values_list; } T_ON T_OPEN_P values_list+=literal_values ( ',' values_list+=literal_values )* T_CLOSE_P {
        vector<json> values_json_list;
        for(Literal_valuesContext* value_ctxt:$values_list)
            values_json_list.push_back(value_ctxt->res);
        $res = values_json_list;
    }
    | { vector<Literal_valuesContext*> values_list; } T_ON T_OPEN_P T_OPEN_P values_list+=literal_values ( ',' values_list+=literal_values )* T_CLOSE_P  ( ','  T_OPEN_P values_list+=literal_values ( ',' values_list+=literal_values )* T_CLOSE_P  )* T_CLOSE_P {
        vector<json> values_json_list;
        for(Literal_valuesContext* value_ctxt:$values_list)
            values_json_list.push_back(value_ctxt->res);
        $res = values_json_list;
    }
    ;

opt_skewed_stored_as_directory returns [bool res]
    : { $res = false; }
    | T_STORED T_AS T_DIRECTORY { $res = true; }
    ;

opt_row_formated returns [json res]
    : { $res = json(); }
    | T_ROW T_FORMAT row_format { $res = $row_format.res; }
    ;

row_format returns [json res]
    : T_DELIMITED opt_field_terminated_by opt_collection_items_terminated_by opt_map_keys_terminated_by opt_lines_terminated_by opt_null_defined_as { $res = hql_row_format_delimited($opt_field_terminated_by.res, $opt_collection_items_terminated_by.res, $opt_map_keys_terminated_by.res, $opt_lines_terminated_by.res, $opt_null_defined_as.res); }
    | T_SERDE STRING_LITERAL opt_serde_properties { $res = hql_row_format_serde(remove_quotes($STRING_LITERAL.text), $opt_serde_properties.res); }
    ;

opt_field_terminated_by returns [json res]
    : { $res = json(); }
    | T_FIELDS T_TERMINATED T_BY STRING_LITERAL { $res = remove_quotes($STRING_LITERAL.text);}
    | T_FIELDS T_TERMINATED T_BY delimiter=STRING_LITERAL T_ESCAPED T_BY escape=STRING_LITERAL { $res = remove_quotes($delimiter.text);}
    ;

opt_collection_items_terminated_by returns [string res]
    : { $res = string(); }
    | T_COLLECTION T_ITEMS T_TERMINATED T_BY STRING_LITERAL { $res = remove_quotes($STRING_LITERAL.text);}
    ;

opt_map_keys_terminated_by returns [string res]
    : { $res = string(); }
    | T_MAP T_KEYS T_TERMINATED T_BY STRING_LITERAL { $res = remove_quotes($STRING_LITERAL.text);}
    ;

opt_lines_terminated_by returns [string res]
    : { $res = string(); }
    | T_LINES T_TERMINATED T_BY STRING_LITERAL { $res = remove_quotes($STRING_LITERAL.text);}
    ;

opt_null_defined_as returns [string res]
    : { $res = string(); }
    | T_NULL T_DEFINED T_AS STRING_LITERAL { $res = remove_quotes($STRING_LITERAL.text);}
    ;

opt_serde_properties returns [vector<json> res]
    : { $res = vector<json>(); }
    | { vector<Serde_valContext*> opt_name_list, opt_val_list;  } T_WITH T_SERDEPROPERTIES T_OPEN_P opt_name_list+=serde_val '=' opt_val_list+=serde_val ( ',' opt_name_list+=serde_val '=' opt_val_list+=serde_val )* T_CLOSE_P {
        vector<json> serde_opt_json_list;
        for(int i = 0 ; i < $opt_name_list.size() ; i++)
        {
            json tmp;
            tmp[$opt_name_list[i]->res] = $opt_val_list[i]->res;
            serde_opt_json_list.push_back(tmp);
        }
        $res = serde_opt_json_list;
    }
    ;

serde_val returns [string res]
    : STRING_LITERAL { $res = remove_quotes($STRING_LITERAL.text); }
    ;

opt_stored_as returns [json res]
    : { $res = json(); }
    | T_STORED T_AS file_format { $res = hql_stored_as_file_format($file_format.res); }
    | T_STORED T_AS T_INPUTFORMAT input_format=STRING_LITERAL T_OUTPUTFORMAT output_format=STRING_LITERAL { $res = hql_stored_as_file_format($input_format.text, $output_format.text); }
    | T_STORED T_BY STRING_LITERAL opt_serde_properties { $res = hql_stored_by_serde(remove_quotes($STRING_LITERAL.text), $opt_serde_properties.res); }
    ;

opt_location returns [string res]
    : { $res = string(); }
    | T_LOCATION STRING_LITERAL { $res = remove_quotes($STRING_LITERAL.text); }
    ;

opt_table_properties returns [vector<json> res]
    : { $res = vector<json>(); }
    | { vector<Opt_table_valContext*> opt_name_list, opt_val_list; } T_TBLPROPERTIES T_OPEN_P opt_name_list+=opt_table_val '=' opt_val_list+=opt_table_val ( ',' opt_name_list+=opt_table_val '=' opt_val_list+=opt_table_val ) T_CLOSE_P {
        vector<json> table_option_json_list;
        for(int i = 0 ; i < $opt_name_list.size() ; i++) 
        {
            json tmp;
            tmp[$opt_name_list[i]->res] = $opt_val_list[i]->res;
            table_option_json_list.push_back(tmp);
        }
        $res = table_option_json_list;
    }
    ;

opt_table_val returns [string res]
    : STRING_LITERAL { $res = remove_quotes($STRING_LITERAL.text); }
    ;

opt_as_select returns [json res]
    : { $res = json(); }
    | T_AS select_stmt { $res = $select_stmt.res; }
    ;

file_format returns [string res]
    : T_SEQUENCEFILE { $res = "SEQUENCEFILE"; }
    | T_TEXTFILE { $res = "TEXTFILE"; }
    | T_RCFILE { $res = "RCFILE"; }
    | T_ORC { $res = "ORC"; }
    | T_PARQUET { $res = "PARQUET"; }
    | T_AVRO { $res = "AVRO"; }
    | T_JSONFILE  { $res = "JSONFILE"; }
    ;

column_definition returns [json res]
    : column_identifier data_type { $res = hql_column_definition($column_identifier.res, $data_type.res); }
    | column_identifier data_type T_COMMENT STRING_LITERAL { $res = hql_column_definition($column_identifier.res, $data_type.res, $STRING_LITERAL.text); }
    | {vector<Column_constraintContext*> constraint_list; } column_identifier data_type (constraint_list+=column_constraint)+ T_COMMENT STRING_LITERAL { 
        vector<json> constraint_json_list;
        for(Column_constraintContext* cons:$constraint_list)
        {
            constraint_json_list.push_back(cons->res);
        }
        $res = hql_column_definition($column_identifier.res, $data_type.res, constraint_json_list, $STRING_LITERAL.text);
    }
    | {vector<Column_constraintContext*> constraint_list; } column_identifier data_type (constraint_list+=column_constraint)+ { 
        vector<json> constraint_json_list;
        for(Column_constraintContext* cons:$constraint_list)
        {
            constraint_json_list.push_back(cons->res);
        }
        $res = hql_column_definition($column_identifier.res, $data_type.res, constraint_json_list);
    }
    ;

column_constraint returns [json res]
    : T_PRIMARY T_KEY { $res = json({"primary_key", true}); }
    | T_UNIQUE { $res = json({"unique", true}); }
    | T_NOT T_NULL { $res = json({"not_null", true}); }
    | T_DEFAULT default_value { $res = json({"default_value", $default_value.res}); }
    | T_CHECK expr { $res = json({"check", $expr.res}); }
    | T_ENABLE { $res = json({"enable", true}); }
    | T_DISABLE { $res = json({"enable", false}); }
    | T_NOVALIDATE { $res = json({"novalidate", true}); }
    | T_RELY { $res = json({"rely", true}); }
    | T_NORELY { $res = json({"norely", true}); }
    ;

default_value returns [json res]
    : literal_values
    | T_CURRENT_USER T_OPEN_P T_CLOSE_P
    | T_CURRENT_DATE T_OPEN_P T_CLOSE_P
    | T_CURRENT_TIMESTAMP T_OPEN_P T_CLOSE_P
    ;

constraint_specification returns [json res]
    : {vector<Column_identifierContext*> column_list; } T_PRIMARY T_KEY T_OPEN_P column_list+=column_identifier ( ',' column_list+=column_identifier )* T_CLOSE_P opt_constraint_disable opt_constraint_novalidate opt_constraint_rely_no_rely {
        vector<string> column_str_list;
        for(Column_identifierContext* c_ctxt: $column_list) {
            column_str_list.push_back(c_ctxt->res); }
        $res = hql_primary_key_constraint(column_str_list, $opt_constraint_disable.res, $opt_constraint_novalidate.res, $opt_constraint_rely_no_rely.res);
    }
    | { vector<Column_identifierContext*> column_list; vector<Column_identifierContext*> ref_column_list; } T_CONSTRAINT IDENTIFIER T_FOREIGN T_KEY T_OPEN_P column_list+=column_identifier ( ','column_list+=column_identifier )* T_CLOSE_P T_REFERENCES tab_ident T_OPEN_P ref_column_list+=column_identifier ( ',' ref_column_list+=column_identifier )* T_CLOSE_P opt_constraint_disable opt_constraint_novalidate {
        vector<string> column_str_list; vector<string> ref_column_str_list;
        for(Column_identifierContext* c_ctxt: $column_list) {
            column_str_list.push_back(c_ctxt->res); }
        for(Column_identifierContext* c_ctxt: $ref_column_list) {
            ref_column_str_list.push_back(c_ctxt->res); }
        $res = hql_foreign_key_constraint(column_str_list, $tab_ident.res, ref_column_str_list, $opt_constraint_disable.res, $opt_constraint_novalidate.res);
    }
    | {vector<Column_identifierContext*> column_list; } T_CONSTRAINT IDENTIFIER T_UNIQUE T_OPEN_P column_list+=column_identifier ( ',' column_list+=column_identifier )* T_CLOSE_P  opt_constraint_disable opt_constraint_novalidate opt_constraint_rely_no_rely {
        vector<string> column_str_list;
        for(Column_identifierContext* c_ctxt: $column_list) {
            column_str_list.push_back(c_ctxt->res); }
        $res = hql_unique_constraint(column_str_list, $opt_constraint_disable.res, $opt_constraint_novalidate.res, $opt_constraint_rely_no_rely.res);
    }
    | T_CONSTRAINT IDENTIFIER T_CHECK expr opt_constraint_enable_disable opt_constraint_novalidate opt_constraint_rely_no_rely { $res = hql_check_constraint($expr.res,  $opt_constraint_enable_disable.res, $opt_constraint_novalidate.res, $opt_constraint_rely_no_rely.res); }
    ; 

opt_constraint_enable_disable returns [string res]
    : { $res = "ENABLE"; }
    | T_ENABLE { $res = "ENABLE"; }
    | T_DISABLE { $res = "DISABLE"; }
    ; 

opt_constraint_enable returns [bool res]
    :  { $res = false; }
    | T_ENABLE { $res = true; }
    ;

opt_constraint_disable returns [bool res]
    :  { $res = false; }
    | T_DISABLE { $res = true; }
    ;

opt_constraint_novalidate returns [bool res]
    :  { $res = false; }
    | T_NOVALIDATE { $res = true; }
    ;

opt_constraint_rely_no_rely returns [string res]
    : { $res = string(); }
    | T_RELY { $res = "RELY"; }
    | T_NORELY { $res = "NORELY"; }
    ;

opt_if_not_exists_flag returns [bool res]
    : { $res = false; }
    | T_IF T_NOT T_EXISTS { $res = true; }
    ;

table_type returns [string res]
    : { $res = "MANAGED"; }
    | T_EXTERNAL { $res = "EXTERNAL"; }
    | T_TEMPORARY { $res = "TEMPORARY"; }
    ;

query_stmt returns [json res]
    : select_stmt { $res = $select_stmt.res; }
    ;

select_stmt returns [json res] // SELECT statement
    : T_SELECT select_all_distinct select_expr_list { $res = hql_select_stmt($select_all_distinct.res, $select_expr_list.res); }
    | T_SELECT select_all_distinct tab_generate_func { $res = hql_select_stmt($select_all_distinct.res, $tab_generate_func.res); }
    | T_SELECT select_all_distinct select_expr_list T_FROM table_reference opt_lateral_view_expr opt_where_expr opt_group_by_list opt_having_expr opt_order_by_list opt_limit { $res = hql_select_stmt($select_all_distinct.res, $select_expr_list.res, $table_reference.res, $opt_lateral_view_expr.res, $opt_where_expr.res, $opt_group_by_list.res, $opt_having_expr.res, $opt_order_by_list.res, $opt_limit.res); }
    ;

opt_lateral_view_expr returns [json res]
    : { $res = json(); }
    | { vector<Column_identifierContext*> column_alias_list; } T_LATERAL T_VIEW tab_generate_func tab_alias=column_identifier T_AS column_alias_list+=column_identifier ( ',' column_alias_list+=column_identifier)* {
        vector<string> column_alias_json_list;
        for(Column_identifierContext* column_ctxt:$column_alias_list)
        {
            column_alias_json_list.push_back(column_ctxt->res);
        }
        $res = hql_lateral_view_expr($tab_generate_func.res, $tab_alias.res, column_alias_json_list);
    }
    ;

column_identifier returns [string res]
    : IDENTIFIER { $res = $IDENTIFIER.text; }
    ;

opt_where_expr returns [json res]
    : { $res = json(); }
    | T_WHERE expr { $res = $expr.res; }
    ;

opt_group_by_list returns [json res]
    : { $res = vector<json>(); }
    | { vector<ExprContext*> expr_group_by_list; } T_GROUP T_BY expr_group_by_list+=expr ( ',' expr_group_by_list+=expr)* {
        vector<json> expr_json_list;
        for(ExprContext* expr_context : $expr_group_by_list)
        {  
            expr_json_list.push_back(expr_context->res);
        }
        $res = expr_json_list;
    }
    ;

opt_having_expr returns [json res]
    : { $res = json(); }
    | T_HAVING expr { $res = $expr.res; }
    ;

opt_order_by_list returns [json res]
    : { $res = vector<json>(); }
    | { vector<IdentContext*> order_by_ident_list; vector<Opt_order_by_modeContext*> order_mode_list; } T_ORDER T_BY order_by_ident_list+=ident order_mode_list+=opt_order_by_mode ( ',' order_by_ident_list+=ident order_mode_list+=opt_order_by_mode )* {
        vector<json> expr_json_list;
        for(int i = 0; i < $order_by_ident_list.size() ; i++)
        {  
            json j;
            j["col_name"] = $order_by_ident_list[i]->res;
            j["col_order"] = $order_mode_list[i]->res;
            expr_json_list.push_back(j);
        }
        $res = expr_json_list;
    }
    ;

opt_order_by_mode returns [string res]
    : { $res = "ASC"; }
    | T_ASC { $res = "ASC"; }
    | T_DESC { $res = "DESC"; }
    ;

opt_limit returns [json res]
    : { $res = json(); }
    | T_LIMIT rows=INT_LITERAL { $res = hql_select_limit_clause($rows.text); }
    | T_LIMIT offset=INT_LITERAL ',' rows=INT_LITERAL { $res = hql_select_limit_clause($rows.text, $offset.text); }
    ;

table_reference returns [json res]
    : table_factor { $res = $table_factor.res; }
    | {vector<Table_factorContext*> table_factor_list; } table_factor_list+=table_factor (',' table_factor_list+=table_factor)+
    {
        vector<json> table_factor_list_json;
        json result;
        for(Table_factorContext* tab_fact : $table_factor_list)
        {
            table_factor_list_json.push_back(tab_fact->res);
        }
        result["type"]="TABLE_REFERENCE_LIST";
        result["table_reference_list"] = table_factor_list_json;
        $res = result;
    }
    | {vector<Join_tableContext*> join_table_list; } table_factor join_table_list+=join_table+ {
        $join_table_list[0]->res["left_table"] = $table_factor.res;
        for(int i = 1; i < $join_table_list.size() ; i++)
        {
            $join_table_list[i]->res["left_table"] =  $join_table_list[i - 1]->res;
        }
        $res = $join_table_list[$join_table_list.size() - 1]->res;
    }
    ;

join_table returns [json res]
    : T_INNER? T_JOIN table_factor { $res = hql_stmt_join_table("INNER", $table_factor.res); }
    | T_INNER? T_JOIN table_factor join_condition { $res = hql_stmt_join_table("INNER", $table_factor.res, $join_condition.res); }
    | j_type=( T_LEFT | T_RIGHT | T_FULL) T_OUTER? T_JOIN table_factor join_condition { $res = hql_stmt_join_table($j_type.text, $table_factor.res, $join_condition.res); }
    | T_CROSS T_JOIN table_factor { $res = hql_stmt_join_table("CROSS", $table_factor.res); }
    | T_CROSS T_JOIN table_factor join_condition { $res = hql_stmt_join_table("CROSS", $table_factor.res, $join_condition.res); }
    ;
//     table_reference [INNER] JOIN table_factor [join_condition]
//   | table_reference {LEFT|RIGHT|FULL} [OUTER] JOIN table_reference join_condition
//   | table_reference LEFT SEMI JOIN table_reference join_condition
//   | table_reference CROSS JOIN table_reference [join_condition] (as of Hive 0.10)

join_condition returns [json res]
    : T_ON expr { $res = $expr.res; }
    ;

table_factor returns [json res]
   : tab_ident { $res =hql_stmt_table_ref($tab_ident.res, "DEFAULT"); } 
   | tab_ident T_AS? IDENTIFIER { $res =hql_stmt_table_ref($tab_ident.res, $IDENTIFIER.text); } 
   | '(' select_stmt ')' T_AS? IDENTIFIER { $res =hql_stmt_table_ref($select_stmt.res, $IDENTIFIER.text); }
   ;

select_all_distinct returns [string res]
    : { $res = "ALL"; }
    | T_ALL { $res = "ALL"; }
    | T_DISTINCT { $res = "DISTINCT"; }
    ;

select_expr_list returns [vector<json> res]
    : { vector<Select_exprContext*> exprs; } exprs+=select_expr (',' exprs+=select_expr)*  { 
        vector<json> expr_list;
        for(Select_exprContext* expr : $exprs) {expr_list.push_back(expr->res);}
        $res = expr_list; 
        }
    ;

select_expr returns [json res]
    : expr T_AS? IDENTIFIER { $res = hql_select_expr($expr.res, $IDENTIFIER.text); }
    | expr { $res = hql_select_expr($expr.res); }
    | expr T_AS? IDENTIFIER { $res = hql_select_expr($expr.res, $IDENTIFIER.text); }
    | expr { $res = hql_select_expr($expr.res); }
    | '*' { $res = hql_select_all_expr(); } 
    | IDENTIFIER '.' '*' { $res = hql_select_all_expr($IDENTIFIER.text); }
    | over_clause { $res = hql_select_expr($over_clause.res, "DEFAULT"); }
    | over_clause  T_AS? IDENTIFIER { $res = hql_select_expr($over_clause.res, $IDENTIFIER.text); }
    ;

over_clause returns [json res]
    : { vector<IdentContext*> ident_cntxt_list; } over_func T_OVER T_OPEN_P T_PARTITION T_BY ident_cntxt_list+=ident ( ',' ident_cntxt_list+=ident)* T_CLOSE_P {
        vector<json> ident_json_list;
        for(IdentContext* ident_context:$ident_cntxt_list)
        {
            ident_json_list.push_back(ident_context->res);
        }
        $res = hql_over_clause_partition($over_func.res, ident_json_list);
    }
    | { vector<IdentContext*> ident_cntxt_list; } over_func T_OVER T_OPEN_P T_ORDER T_BY ident_cntxt_list+=ident ( ',' ident_cntxt_list+=ident)* T_CLOSE_P {
        vector<json> ident_json_list;
        for(IdentContext* ident_context:$ident_cntxt_list)
        {
            ident_json_list.push_back(ident_context->res);
        }
        $res = hql_over_clause_order($over_func.res, ident_json_list);
    }
    | { vector<IdentContext*> partition_cntxt_list; vector<IdentContext*> order_cntxt_list; } over_func T_OVER T_OPEN_P T_PARTITION T_BY partition_cntxt_list+=ident ( ',' partition_cntxt_list+=ident)* T_ORDER T_BY order_cntxt_list+=ident ( ',' order_cntxt_list+=ident)* T_CLOSE_P {
        vector<json> partition_json_list; vector<json> order_json_list;
        for(IdentContext* ident_context:$partition_cntxt_list)
        {
            partition_json_list.push_back(ident_context->res);
        }
        for(IdentContext* ident_context:$order_cntxt_list)
        {
            order_json_list.push_back(ident_context->res);
        }
        $res = hql_over_clause_partition_order($over_func.res, partition_json_list, order_json_list);
    }
    ;

over_func returns [json res]
    : basic_aggr_func { $res = $basic_aggr_func.res; }
    | analytic_func { $res = $analytic_func.res; }
    ;

analytic_func returns [json res]
    : func_name=( T_RANK | T_DENSE_RANK | T_ROW_NUMBER | T_CUME_DIST | T_PERCENT_RANK ) T_OPEN_P T_CLOSE_P { $res = hql_fixed_func($func_name.text); }
    ;


expr_list returns [vector<json> res]
    : { vector<ExprContext*> exprs; } T_OPEN_P exprs+=expr (',' exprs+=expr)* T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = expr_list_json;
    }
    ;

expr returns [json res]
    : l_expr=expr op=( '*' | '/' | '%' ) r_expr=expr { $res = hql_math_operator($op.text, $l_expr.res, $r_expr.res); }
    | l_expr=expr op=( '+' | '-' ) r_expr=expr { $res = hql_math_operator($op.text, $l_expr.res, $r_expr.res); }
    | l_expr=expr op=( '<<' | '>>' | '&' | '|' ) r_expr=expr { $res = hql_bool_operator($op.text, $l_expr.res, $r_expr.res); } 
    | l_expr=expr op=( '<' | '<=' | '>' | '>=' ) r_expr=expr { $res = hql_bool_operator($op.text, $l_expr.res, $r_expr.res); } 
    | l_expr=expr op=( '=' | '==' | '!=' | '<>' | '<=>' ) r_expr=expr { $res = hql_bool_operator($op.text, $l_expr.res, $r_expr.res); }
    | l_expr=expr op=T_AND r_expr=expr { $res = hql_bool_operator($op.text, $l_expr.res, $r_expr.res); }
    | l_expr=expr op=T_OR r_expr=expr { $res = hql_bool_operator($op.text, $l_expr.res, $r_expr.res); }
    | l_expr=expr set_operators_is BOOL_LITERAL { $res = hql_bool_operator($set_operators_is.res, $l_expr.res, hql_boolean_type($BOOL_LITERAL.text)); }
    | l_expr=expr set_operators_is NULL_CONST { $res = hql_bool_operator($set_operators_is.res, $l_expr.res, hql_null_constant()); }
    | eval_expr=expr T_BETWEEN start_interval=expr T_AND end_interval=expr { $res = hql_between_expr($eval_expr.res, $start_interval.res, $end_interval.res, false); }
    | eval_expr=expr T_NOT T_BETWEEN start_interval=expr T_AND end_interval=expr { $res = hql_between_expr($eval_expr.res, $start_interval.res, $end_interval.res, true); }
    | eval_expr=expr set_operators_in expr_list { $res = hql_set_operators_in($set_operators_in.res, $expr.res, $expr_list.res);  }
    | eval_expr=expr set_operators_in T_OPEN_P select_stmt T_CLOSE_P { $res = hql_set_operators_in($set_operators_in.res, $expr.res, $select_stmt.res); }
    | eval_expr=expr set_operators_exists T_OPEN_P select_stmt T_CLOSE_P { $res = hql_set_operators_in($set_operators_exists.res, $expr.res, $select_stmt.res); }
    | eval_expr=expr set_operators_like r_expr=expr { $res = hql_bool_operator($set_operators_like.res, $eval_expr.res, $r_expr.res); }
    | literal_values { $res = $literal_values.res; } 
    | ident { $res =  $ident.res; }
    | unary_operator expr { $res = hql_unary_operator($unary_operator.text, $expr.res); }
    | '(' expr ')' { $res = $expr.res; }  
    | dat_convrt_func { $res = $dat_convrt_func.res; }
    | math_func { $res = $math_func.res; }
    | date_func { $res = $date_func.res; }
    | cond_func { $res = $cond_func.res; }
    | str_func { $res = $str_func.res; }
    | expr_concat { $res = $expr_concat.res; } //LEMBRAR DE ADICIONAR TODA EXPRESSÃO DE FUNÇÃO NESSE NÃO-TERMINAL
    | misc_func { $res = $misc_func.res; }
    | aggr_func { $res = $aggr_func.res; }
    | complex_types { $res = $complex_types.res; }
    ;



complex_types returns [json res]
    : array_def { $res = $array_def.res; }
    | map_def { $res = $map_def.res; }
    | struct_def { $res = $struct_def.res; }
    | named_struct_def  { $res = $named_struct_def.res; }
    | ident '[' expr ']' { $res = hql_complex_type_access($ident.res, $expr.res); }
    | array_def '[' expr ']' { $res = hql_complex_type_access($array_def.res, $expr.res); }
    | map_def '[' expr ']' { $res = hql_complex_type_access($map_def.res, $expr.res); }
    | ident '.' expr  { $res = hql_complex_type_access($ident.res, $expr.res); }
    | struct_def '.' expr { $res = hql_complex_type_access($struct_def.res, $expr.res); }
    ;

array_def returns [json res]
    : { vector<ExprContext*> exprs; } T_ARRAY T_OPEN_P exprs+=expr ( ',' exprs+=expr)* T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_complx_typ_array(expr_list_json);
    }
    ;

map_def returns [json res]
    : { vector<ExprContext*> key_exprs; vector<ExprContext*> val_exprs; } T_MAP T_OPEN_P key_exprs+=expr ',' val_exprs+=expr ( ',' key_exprs+=expr ',' val_exprs+=expr )* T_CLOSE_P {
        vector<json> key_exprs_json; vector<json> val_exprs_json;
        for(int i = 0 ; i < $key_exprs.size() ; i++)
        {
            key_exprs_json.push_back($key_exprs[i]->res);
            val_exprs_json.push_back($val_exprs[i]->res);
        }
        $res = hql_complx_typ_map(key_exprs_json, val_exprs_json);
    }
    ;

struct_def returns [json res]
    : { vector<ExprContext*> val_exprs; } T_STRUCT T_OPEN_P val_exprs+=expr ( ',' val_exprs+=expr)* T_CLOSE_P {
        vector<json> col_exprs_json; vector<json> val_exprs_json;
        for(int i = 0 ; i < $val_exprs.size() ; i++)
        {
            col_exprs_json.push_back(hql_string_type("col" + to_string(i + 1)));
            val_exprs_json.push_back($val_exprs[i]->res);
        }
        $res = hql_complx_typ_struct(col_exprs_json, val_exprs_json);
    }
    ;

named_struct_def returns [json res]
    : { vector<ExprContext*> col_exprs; vector<ExprContext*> val_exprs; } T_NAMED_STRUCT T_OPEN_P col_exprs+=expr ',' val_exprs+=expr ( ',' col_exprs+=expr ',' val_exprs+=expr )* T_CLOSE_P {
        vector<json> col_exprs_json; vector<json> val_exprs_json;
        for(int i = 0 ; i < $val_exprs.size() ; i++)
        {
            col_exprs_json.push_back($col_exprs[i]->res);
            val_exprs_json.push_back($val_exprs[i]->res);
        }
        $res = hql_complx_typ_struct(col_exprs_json, val_exprs_json);
    }
    ;

str_func returns [json res]
    : T_ASCII T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ASCII", "expr", $expr.res); }
    | T_BASE64 T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("BASE64", "expr", $expr.res); }
    | T_CHARACTER_LENGTH T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("CHARACTER_LENGTH", "expr", $expr.res); }
    | T_CHR T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("CHR", "expr", $expr.res); }
    | { vector<ExprContext*> exprs; } T_CONCAT T_OPEN_P exprs+=expr ( ',' exprs+=expr )+ T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_list_param_func("CONCAT","expr_list",expr_list_json);
    }
    | { vector<ExprContext*> exprs; } T_CONCAT_WS T_OPEN_P sep=expr ',' exprs+=expr ( ',' exprs+=expr )+ T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_single_param_list_func("CONCAT","separator", $sep.res, "expr_list",expr_list_json);
    }
    //context_ngrams(array<array<string>>, array<string>, int K, int pf)
    | T_DECODE T_OPEN_P expr_bin=expr ',' expr_charset=expr T_CLOSE_P { $res = hql_double_param_func("DECODE", "binary_value", $expr_bin.res, "charset", $expr_charset.res); }
    | { vector<ExprContext*> exprs; } T_ELT T_OPEN_P index_num=expr ',' exprs+=expr ( ',' exprs+=expr )* T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_single_param_list_func("ELT","index_num", $index_num.res, "expr_list",expr_list_json);
    }
    | T_ENCODE T_OPEN_P expr_str=expr ',' expr_charset=expr T_CLOSE_P { $res = hql_double_param_func("ENCODE", "str_value", $expr_str.res, "charset", $expr_charset.res); }
    | { vector<ExprContext*> exprs; } T_FIELD T_OPEN_P expr_val=expr ',' exprs+=expr ( ',' exprs+=expr )* T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_single_param_list_func("FIELD","expr_val", $expr_val.res, "expr_list",expr_list_json);
    }
    | T_FIELD_IN_SET T_OPEN_P expr_str=expr ',' expr_str_list=expr T_CLOSE_P { $res = hql_double_param_func("FIELD_IN_SET", "str_value", $expr_str.res, "str_list", $expr_str_list.res); }
    | T_FORMAT_NUMBER T_OPEN_P number_expr=expr ',' int_expr=expr T_CLOSE_P { $res = hql_double_param_func("FORMAT_NUMBER", "number", $number_expr.res, "decimal_places", $int_expr.res); }
    | T_GET_JSON_OBJECTS T_OPEN_P json_string=expr ',' path_expr=expr T_CLOSE_P { $res = hql_double_param_func("GET_JSON_OBJECTS", "json_string", $json_string.res, "path", $path_expr.res); }
    | T_IN_FILE T_OPEN_P str_expr=expr ',' filename=expr T_CLOSE_P { $res = hql_double_param_func("IN_FILE", "string", $str_expr.res, "filename", $filename.res); }
    | T_IN_STR T_OPEN_P str_expr=expr ',' substr_expr=expr T_CLOSE_P { $res = hql_double_param_func("IN_STR", "string", $str_expr.res, "substring", $substr_expr.res); }
    | T_LENGTH T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("LENGTH", "string", $str_expr.res); }
    | T_LOCATE T_OPEN_P substr_expr=expr ',' str_expr=expr T_CLOSE_P { $res = hql_double_param_func("LOCATE", "substring", $substr_expr.res, "string", $str_expr.res); }
    | T_LOCATE T_OPEN_P substr_expr=expr ',' str_expr=expr ',' pos=expr T_CLOSE_P { $res = hql_three_param_func("LOCATE", "substring", $substr_expr.res, "string", $str_expr.res,"position", $pos.res); }
    | ( T_LOWER | T_LCASE ) T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("LOWER_CASE", "string", $str_expr.res); }
    | T_LPAD T_OPEN_P str_expr=expr ',' len=expr ',' pad=expr T_CLOSE_P { $res = hql_three_param_func("LPAD", "string", $str_expr.res, "length", $len.res,"pad", $pad.res); }
    | T_LTRIM T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("LTRIM", "string", $str_expr.res); }
    //ngrams(array<array<string>>, int N, int K, int pf)
    | T_OCTET_LENGTH T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("OCTET_LENGTH", "string", $str_expr.res); }
    | T_PARSE_URL T_OPEN_P url_str=expr ',' part_to_extract=expr T_CLOSE_P { $res = hql_double_param_func("PARSE_URL", "url_str", $url_str.res, "part_to_extract", $part_to_extract.res); }
    | T_PARSE_URL T_OPEN_P url_str=expr ',' part_to_extract=expr ',' key_to_extract=expr T_CLOSE_P { $res = hql_three_param_func("PARSE_URL", "url_str", $url_str.res, "part_to_extract", $part_to_extract.res, "key_to_extract", $key_to_extract.res); }
    | { vector<ExprContext*> exprs; } T_PRINTF T_OPEN_P str_expr=expr ',' exprs+=expr ( ',' exprs+=expr )+ T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_single_param_list_func("PRINTF","string", $str_expr.res, "object_list",expr_list_json);
    }
    | T_QUOTE T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("QUOTE", "string", $str_expr.res); }
    | T_REGEXP_EXTRACT T_OPEN_P subject=expr ',' pattern=expr ',' index=expr T_CLOSE_P { $res = hql_three_param_func("REGEXP_EXTRACT", "subject", $subject.res, "pattern", $pattern.res,"index", $index.res); }
    | T_REGEXP_REPLACE T_OPEN_P initial_string=expr ',' pattern=expr ',' replacement=expr T_CLOSE_P { $res = hql_three_param_func("REGEXP_REPLACE", "initial_string", $initial_string.res, "pattern", $pattern.res,"replacement", $replacement.res); }
    | T_REPEAT T_OPEN_P str_expr=expr ',' n_times_expr=expr T_CLOSE_P { $res = hql_double_param_func("REPEAT", "string", $str_expr.res, "n", $n_times_expr.res); }
    | T_REPLACE T_OPEN_P str_expr=expr ',' old=expr ',' new_expr=expr T_CLOSE_P { $res = hql_three_param_func("REPLACE", "string", $str_expr.res, "old", $old.res,"new", $new_expr.res); }
    | T_REVERSE T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("REVERSE", "string", $str_expr.res); }
    | T_RPAD T_OPEN_P str_expr=expr ',' len=expr ',' pad=expr T_CLOSE_P { $res = hql_three_param_func("RPAD", "string", $str_expr.res, "length", $len.res,"pad", $pad.res); }
    | T_RTRIM T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("RTRIM", "string", $str_expr.res); }
    | T_SENTENCES T_OPEN_P str_expr=expr ',' lang_expr=expr ',' locale_expr=expr T_CLOSE_P { $res = hql_three_param_func("SENTENCES", "string", $str_expr.res, "lang", $lang_expr.res, "locale", $locale_expr.res); }
    | T_SPACE T_OPEN_P size_expr=expr T_CLOSE_P { $res = hql_single_param_func("SPACE", "size", $size_expr.res); }
    | T_SPLIT T_OPEN_P str_expr=expr ',' pattern=expr T_CLOSE_P { $res = hql_double_param_func("SPLIT", "string", $str_expr.res, "pattern", $pattern.res); }
    | T_STR_TO_MAP T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_three_param_func("STR_TO_MAP", "string", $str_expr.res, "delimiter1", hql_string_type(";"), "delimiter2", hql_string_type(":")); }
    | T_STR_TO_MAP T_OPEN_P str_expr=expr ',' delimiter1=expr T_CLOSE_P { $res = hql_three_param_func("STR_TO_MAP", "string", $str_expr.res, "delimiter1", $delimiter1.res, "delimiter2", hql_string_type(":")); }
    | T_STR_TO_MAP T_OPEN_P str_expr=expr ',' delimiter1=expr ',' delimiter2=expr T_CLOSE_P { $res = hql_three_param_func("STR_TO_MAP", "string", $str_expr.res, "delimiter1", $delimiter1.res, "delimiter2",$delimiter2.res); }
    | ( T_SUBSTR | T_SUBSTRING ) T_OPEN_P str_expr=expr ',' start_indx=expr T_CLOSE_P { $res = hql_double_param_func("SUBSTRING", "string", $str_expr.res, "start", $start_indx.res); }
    | ( T_SUBSTR | T_SUBSTRING ) T_OPEN_P str_expr=expr ',' start_indx=expr ',' lenght_expr=expr T_CLOSE_P { $res = hql_three_param_func("SUBSTRING", "string", $str_expr.res, "start", $start_indx.res, "length", $lenght_expr.res); }
    | T_SUBSTRING_INDEX T_OPEN_P str_expr=expr ',' delimiter=expr ',' count=expr T_CLOSE_P { $res = hql_three_param_func("SUBSTRING_INDEX", "string", $str_expr.res, "delimiter", $delimiter.res, "count", $count.res); }
    | T_TRANSLATE T_OPEN_P input_expr=expr ',' from_expr=expr ',' to_expr=expr T_CLOSE_P { $res = hql_three_param_func("TRANSLATE", "input", $input_expr.res, "from", $from_expr.res, "to", $to_expr.res); }
    | T_TRIM T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("TRIM", "string", $str_expr.res); }
    | T_UNBASE64 T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("UNBASE64", "string", $str_expr.res); }
    | ( T_UCASE | T_UPPER ) T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("UPPERCASE", "string", $str_expr.res); }
    | T_INITCAP T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("INITCAP", "string", $str_expr.res); }
    | T_LEVENSHTEIN T_OPEN_P strA_expr=expr ',' strB_expr=expr T_CLOSE_P { $res = hql_double_param_func("LEVENSHTEIN", "string_A", $strA_expr.res, "string_B", $strB_expr.res); }
    | T_SOUNDEX T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("SOUNDEX", "string", $str_expr.res); }
    | T_MASK T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("MASK", "string", $str_expr.res); }
    | T_MASK T_OPEN_P str_expr=expr ',' str_upper_expr=expr T_CLOSE_P { $res = hql_double_param_func("MASK", "string", $str_expr.res, "upper", $str_upper_expr.res); }
    | T_MASK T_OPEN_P str_expr=expr ',' str_upper_expr=expr ',' str_lower_expr=expr T_CLOSE_P { $res = hql_three_param_func("MASK", "string", $str_expr.res, "upper", $str_upper_expr.res, "lower", $str_lower_expr.res); }
    | T_MASK T_OPEN_P str_expr=expr ',' str_upper_expr=expr ',' str_lower_expr=expr ',' str_number_expr=expr T_CLOSE_P { $res = hql_four_param_func("MASK", "string", $str_expr.res, "upper", $str_upper_expr.res, "lower", $str_lower_expr.res, "number", $str_number_expr.res); }
    | T_MASK_FIRST_N T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("MASK_FIRST_N", "string", $str_expr.res); }
    | T_MASK_FIRST_N T_OPEN_P str_expr=expr ',' n_expr=expr T_CLOSE_P { $res = hql_double_param_func("MASK_FIRST_N", "string", $str_expr.res, "n", $n_expr.res); }
    | T_MASK_LAST_N T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("MASK_LAST_N", "string", $str_expr.res); }
    | T_MASK_LAST_N T_OPEN_P str_expr=expr ',' n_expr=expr T_CLOSE_P { $res = hql_double_param_func("MASK_LAST_N", "string", $str_expr.res, "n", $n_expr.res); }
    | T_MASK_SHOW_FIRST_N T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("MASK_SHOW_FIRST_N", "string", $str_expr.res); }
    | T_MASK_SHOW_FIRST_N T_OPEN_P str_expr=expr ',' n_expr=expr T_CLOSE_P { $res = hql_double_param_func("MASK_SHOW_FIRST_N", "string", $str_expr.res, "n", $n_expr.res); }
    | T_MASK_SHOW_LAST_N T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("MASK_SHOW_LAST_N", "string", $str_expr.res); }
    | T_MASK_SHOW_LAST_N T_OPEN_P str_expr=expr ',' n_expr=expr T_CLOSE_P { $res = hql_double_param_func("MASK_SHOW_LAST_N", "string", $str_expr.res, "n", $n_expr.res); }
    | T_MASK_HASH T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func("MASK_HASH", "string", $str_expr.res); }
    ;

misc_func returns [json res]
    : { vector<ExprContext*> exprs; } T_JAVA_METHOD T_OPEN_P class_name_expr=expr ',' method_name_expr=expr ( ',' exprs+=expr )* T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_double_param_list_func("JAVA_METHOD","class", $class_name_expr.res, "method", $method_name_expr.res, "arg_list",expr_list_json);
    }
    | { vector<ExprContext*> exprs; } T_REFLECT T_OPEN_P class_name_expr=expr ',' method_name_expr=expr ( ',' exprs+=expr )* T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_double_param_list_func("REFLECT","class", $class_name_expr.res, "method", $method_name_expr.res, "arg_list",expr_list_json);
    }
    | { vector<ExprContext*> exprs; } T_HASH T_OPEN_P exprs+=expr ( ',' exprs+=expr )* T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_list_param_func("HASH", "expr_list", expr_list_json);
    }
    | T_CURRENT_USER T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("CURRENT_USER"); }
    | T_LOGGED_IN_USER T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("LOGGED_IN_USER"); }
    | T_CURRENT_DATABASE T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("CURRENT_USER"); }
    | f_name=( T_MD5 | T_SHA | T_SHA1 | T_CRC32 ) T_OPEN_P str_expr=expr T_CLOSE_P { $res = hql_single_param_func($f_name.text, "string", $str_expr.res); }    
    | T_SHA2 T_OPEN_P str_expr=expr ',' n_expr=expr T_CLOSE_P { $res = hql_double_param_func("SHA2", "string", $str_expr.res, "hash_size", $n_expr.res); }
    | T_AES_ENCRYPT T_OPEN_P str_expr=expr ',' n_expr=expr T_CLOSE_P { $res = hql_double_param_func("SHA2", "input", $str_expr.res, "key", $n_expr.res); }
    | T_AES_DECRYPT T_OPEN_P str_expr=expr ',' n_expr=expr T_CLOSE_P { $res = hql_double_param_func("SHA2", "input", $str_expr.res, "key", $n_expr.res); }
    | T_VERSION T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("VERSION"); } 
    | f_name=(T_XPATH | T_XPATH_BOOLEAN | T_XPATH_DOUBLE | T_XPATH_FLOAT | T_XPATH_INT | T_XPATH_LONG | T_XPATH_NUMBER | T_XPATH_SHORT | T_XPATH_STRING ) T_OPEN_P xml_str_expr=expr ',' xpath_expr_str=expr T_CLOSE_P { $res = hql_double_param_func($f_name.text, "xml_string", $xml_str_expr.res, "xpath_expression_string", $xpath_expr_str.res); }
    //surrogate_key([write_id_bits, task_id_bits]) -> Automatically generate numerical Ids for rows as you enter data into a table. Can only be used as default value for acid or insert-only tables.
    ;

expr_concat returns [json res]
    : { vector<Expr_concat_itemContext*> exprs; } expr_concat_items+=expr_concat_item ( '||' expr_concat_items+=expr_concat_item )+ {
        vector<json> expr_list_json;
        for (Expr_concat_itemContext* exp_contxt : $expr_concat_items){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_list_param_func("CONCAT","expr_list",expr_list_json);
    }
    ;

expr_concat_item returns [json res]
    : literal_values { $res = $literal_values.res; }    
    | ident { $res =  $ident.res; }
    | T_OPEN_P expr T_CLOSE_P { $res = $expr.res; }  
    | dat_convrt_func { $res = $dat_convrt_func.res; }
    | math_func { $res = $math_func.res; }
    | date_func { $res = $date_func.res; }
    | cond_func { $res = $cond_func.res; }
    | str_func { $res = $str_func.res; }
    | misc_func { $res = $misc_func.res; }
    | aggr_func { $res = $aggr_func.res; }
    ;

cond_func returns [json res]
    : T_IF T_OPEN_P test_cond=expr ',' valueTrue=expr ',' valueFalse=expr T_CLOSE_P { $res = hql_three_param_func("IF", "test_cond", $test_cond.res, "value_true", $valueTrue.res, "value_false", $valueFalse.res); }
    | T_ISNULL T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ISNULL", "expr", $expr.res); }
    | T_ISNOTNULL T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ISNOTNULL", "expr", $expr.res); }
    | T_NVL T_OPEN_P expr_val=expr ',' default_val=expr T_CLOSE_P { $res = hql_double_param_func("NVL", "expr_val", $expr_val.res, "default_val", $default_val.res); }
    | { vector<ExprContext*> exprs; } T_COALESCE T_OPEN_P (exprs+=expr) (',' exprs+=expr) (',' exprs+=expr)* T_CLOSE_P { 
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_list_param_func("COALESCE","expr_list",expr_list_json);
    }
    | { vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; } T_CASE case_expr=expr (T_WHEN when_exprs+=expr T_THEN then_exprs+=expr)+ T_END { 
        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
        for(int i = 0 ; i < $when_exprs.size() ; i++)
        {
            when_expr_list_json.push_back($when_exprs[i]->res);
            then_expr_list_json.push_back($then_exprs[i]->res);
        }
        $res = hql_case_func($case_expr.res, when_expr_list_json, then_expr_list_json, NULL);
     }
    | { vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; } T_CASE case_expr=expr (T_WHEN when_exprs+=expr T_THEN then_exprs+=expr)+ T_ELSE els_expr=expr T_END{ 
        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
        for(int i = 0 ; i < $when_exprs.size() ; i++)
        {
            when_expr_list_json.push_back($when_exprs[i]->res);
            then_expr_list_json.push_back($then_exprs[i]->res);
        }
        $res = hql_case_func($case_expr.res, when_expr_list_json, then_expr_list_json, $els_expr.res);
     }
    | { vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; } T_CASE (T_WHEN when_exprs+=expr T_THEN then_exprs+=expr)+ T_END { 
        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
        for(int i = 0 ; i < $when_exprs.size() ; i++)
        {
            when_expr_list_json.push_back($when_exprs[i]->res);
            then_expr_list_json.push_back($then_exprs[i]->res);
        }
        $res = hql_case_func(NULL, when_expr_list_json, then_expr_list_json, NULL);
     }
    | { vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; } T_CASE (T_WHEN when_exprs+=expr T_THEN then_exprs+=expr)+ T_ELSE els_expr=expr T_END{ 
        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
        for(int i = 0 ; i < $when_exprs.size() ; i++)
        {
            when_expr_list_json.push_back($when_exprs[i]->res);
            then_expr_list_json.push_back($then_exprs[i]->res);
        }
        $res = hql_case_func(NULL, when_expr_list_json, then_expr_list_json, $els_expr.res);
     }
    | T_NULLIF T_OPEN_P a_expr=expr ',' b_expr=expr T_CLOSE_P { $res = hql_double_param_func("NULLIF", "a_expr", $a_expr.res, "b_expr", $b_expr.res); }
    | T_ASSERT_TRUE T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ASSERT_TRUE", "expr", $expr.res); }
    ;

date_func returns [json res]
    : T_UNIX_TIMESTAMP T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("UNIX_TIMESTAMP"); }
    | T_UNIX_TIMESTAMP T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("UNIX_TIMESTAMP", "date", $date_expr.res); }
    | T_UNIX_TIMESTAMP T_OPEN_P date_expr=expr ',' pattern_expr=expr T_CLOSE_P { $res = hql_double_param_func("UNIX_TIMESTAMP", "date", $date_expr.res, "pattern", $pattern_expr.res); }
    | T_YEAR T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("YEAR", "date", $date_expr.res); }
    | T_QUARTER T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("QUARTER", "date", $date_expr.res); }
    | T_MONTH T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("MONTH", "date", $date_expr.res); }
    | T_DAY T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("DAY", "date", $date_expr.res); }
    | T_HOUR T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("HOUR", "date", $date_expr.res); }
    | T_MINUTE T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("MINUTE", "date", $date_expr.res); }
    | T_SECOND T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("SECOND", "date", $date_expr.res); }
    | T_WEEKOFYEAR T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("WEEKOFYEAR", "date", $date_expr.res); }
    | T_DATEDIFF T_OPEN_P enddate=expr ',' startdate=expr T_CLOSE_P { $res = hql_double_param_func("DATEDIFF", "enddate", $enddate.res, "startdate", $startdate.res); }
    | T_DATEADD T_OPEN_P startdate=expr ',' days=expr T_CLOSE_P { $res = hql_double_param_func("DATEDIFF", "startdate", $startdate.res, "days", $days.res); }
    | T_DATESUB T_OPEN_P startdate=expr ',' days=expr T_CLOSE_P { $res = hql_double_param_func("DATEDIFF", "startdate", $startdate.res, "days", $days.res); }
    | T_TOUTCTIMESTAMP T_OPEN_P ts=expr ',' timezone=expr T_CLOSE_P { $res = hql_double_param_func("TO_UTC_TIMESTAMP", "ts", $ts.res, "timezone", $timezone.res); }
    | T_FROMUTCTIMESTAMP T_OPEN_P ts=expr ',' timezone=expr T_CLOSE_P { $res = hql_double_param_func("FROM_UTC_TIMESTAMP", "ts", $ts.res, "timezone", $timezone.res); }
    | T_CURRENT_DATE (T_OPEN_P T_CLOSE_P)? { $res = hql_fixed_func("CURRENT_DATE"); }
    | T_CURRENT_TIMESTAMP (T_OPEN_P T_CLOSE_P)? { $res = hql_fixed_func("T_CURRENT_TIMESTAMP"); }
    | T_ADD_MONTHS T_OPEN_P startdate=expr ',' num_months=expr T_CLOSE_P { $res = hql_double_param_func("ADD_MONTHS", "startdate", $startdate.res, "num_months", $num_months.res); }
    | T_ADD_MONTHS T_OPEN_P startdate=expr ',' num_months=expr ',' out_date_format=expr T_CLOSE_P { $res = hql_three_param_func("ADD_MONTHS", "startdate", $startdate.res, "num_months", $num_months.res, "out_date_format", $out_date_format.res); }
    | T_LASTDAY T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("LAST_DAY", "date", $date_expr.res); }
    | T_NEXT_DAY T_OPEN_P startdate=expr ',' day_of_week=expr T_CLOSE_P { $res = hql_double_param_func("NEXT_DAY", "startdate", $startdate.res, "day_of_week", $day_of_week.res); }
    | T_TRUNC T_OPEN_P date_expr=expr ',' format=expr T_CLOSE_P { $res = hql_double_param_func("TRUNC", "date", $date_expr.res, "format", $format.res); }
    | T_MONTHS_BETWEEN T_OPEN_P date1=expr ',' date2=expr T_CLOSE_P { $res = hql_double_param_func("MONTHS_BETWEEN", "date1", $date1.res, "date2", $date2.res); }
    | T_DATE_FORMAT T_OPEN_P date_expr=expr ',' format=expr T_CLOSE_P { $res = hql_double_param_func("DATE_FORMAT", "date", $date_expr.res, "format", $format.res); }
    | T_SYSDATE { $res = hql_fixed_func($T_SYSDATE.text); }
    ;

dat_convrt_func returns [json res]
    : T_CAST T_OPEN_P expr T_AS primitive_type dtype_len? T_CLOSE_P { $res = hql_cast_func($expr.res, $primitive_type.res); }
    | T_BINARY T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("BINARY", "expr", $expr.res); }
    ;

basic_aggr_func returns [json res]
    : T_COUNT T_OPEN_P r=expr T_CLOSE_P { $res = hql_count_func($r.res); }
    | { vector<ExprContext*> exprs; } T_COUNT T_OPEN_P T_DISTINCT exprs+=expr ( ',' exprs+=expr )* T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs){ expr_list_json.push_back(exp_contxt->res); }
        $res = hql_single_param_list_func("COUNT", "flag_distinct", true, "expr_list", expr_list_json);
    }
    | T_COUNT T_OPEN_P '*' T_CLOSE_P { $res = hql_count_all_func(); }
    | T_SUM T_OPEN_P expr T_CLOSE_P { $res = hql_double_param_func("SUM", "flag_distinct", false, "col", $expr.res); }
    | T_SUM T_OPEN_P T_DISTINCT expr T_CLOSE_P { $res = hql_double_param_func("SUM", "flag_distinct", true, "col", $expr.res); }
    | T_AVG T_OPEN_P expr T_CLOSE_P { $res = hql_double_param_func("AVG", "flag_distinct", false, "col", $expr.res); }
    | T_AVG T_OPEN_P T_DISTINCT expr T_CLOSE_P { $res = hql_double_param_func("AVG", "flag_distinct", true, "col", $expr.res); }
    | fun_name=( T_MIN | T_MAX ) T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func($fun_name.text, "col", $expr.res); }
    ; 

aggr_func returns [json res]
    : basic_aggr_func { $res = $basic_aggr_func.res; }    
    | fun_name=( T_VARIANCE | T_VAR_POP | T_VAR_SAMP | T_STDDEV_POP | T_STDDEV_SAMP ) T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func($fun_name.text, "col", $expr.res); }
    | fun_name=( T_COVAR_POP | T_COVAR_SAMP | T_CORR ) T_OPEN_P col1=expr ',' col2=expr T_CLOSE_P { $res = hql_double_param_func($fun_name.text, "col1", $col1.res, "col2", $col2.res); }
    | T_PERCENTILE T_OPEN_P col=expr ',' p_expr=expr T_CLOSE_P { $res = hql_double_param_func("PERCENTILE", "col", $col.res, "percentile", $p_expr.res); }
    | T_PERCENTILE_APPROX T_OPEN_P col=expr ',' p_expr=expr T_CLOSE_P { $res = hql_double_param_func("PERCENTILE_APPROX", "col", $col.res, "percentile", $p_expr.res); }
    | T_PERCENTILE_APPROX T_OPEN_P col=expr ',' p_expr=expr ',' b_expr=expr T_CLOSE_P { $res = hql_three_param_func("PERCENTILE_APPROX", "col", $col.res, "percentile", $p_expr.res, "b", $b_expr.res); }
    | func_name=( T_REGR_AVGX | T_REGR_AVGY | T_REGR_COUNT | T_REGR_INTERCEPT | T_REGR_R2 | T_REGR_SLOPE | T_REGR_SXX | T_REGR_SXY | T_REGR_SYY ) T_OPEN_P indep=expr ',' dep=expr T_CLOSE_P { $res = hql_double_param_func($func_name.text, "independent", $indep.res, "dependent", $dep.res); }
    | T_HISTOGRAM_NUMERIC T_OPEN_P col=expr ',' b_expr=expr T_CLOSE_P { $res = hql_double_param_func("HISTOGRAM_NUMERIC", "col", $col.res, "b", $b_expr.res); }
    | func_name=( T_COLLECT_SET | T_COLLECT_LIST ) T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func($func_name.text, "col", $expr.res); }
    | T_NTILE T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("NTILE", "x", $expr.res); }
    ;

tab_generate_func returns [json res]
    : T_EXPLODE T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("EXPLODE", "expr", $expr.res); }
    | T_POSEXPLODE T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("POSEXPLODE", "expr", $expr.res); }
    | T_INLINE T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("INLINE", "expr", $expr.res); }
    ;
    
math_func returns [json res]
    : T_ROUND T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ROUND", "expr", $expr.res); }
    | T_ROUND T_OPEN_P fst=expr ',' snd=expr T_CLOSE_P { $res = hql_double_param_func("ROUND", "expr", $fst.res, "decimal_places", $snd.res); }
    | T_FLOOR T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("FLOOR", "expr", $expr.res); }
    | (T_CEIL | T_CEILING) T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("CEIL", "expr", $expr.res); }
    | T_RAND T_OPEN_P T_CLOSE_P { $res = hql_fixed_func($T_RAND.text); }
    | T_RAND T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("RAND", "seed", $expr.res); }
    | T_EXP T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("EXP", "expr", $expr.res); }
    | T_LN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("LN", "expr", $expr.res); }
    | T_LOG10 T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("LOG10", "expr", $expr.res); }
    | T_LOG2 T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("LOG2", "expr", $expr.res); }
    | T_LOG T_OPEN_P base=expr ',' e=expr T_CLOSE_P { $res = hql_double_param_func("LOG", "base", $base.res, "expr", $e.res); }
    | ( T_POW | T_POWER ) T_OPEN_P base=expr ',' e=expr T_CLOSE_P { $res = hql_double_param_func("POWER", "base", $base.res, "exp", $e.res); }
    | T_SQRT T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("SQRT", "expr", $expr.res); }
    | T_BIN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("BIN", "expr", $expr.res); }
    | T_HEX T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("HEX", "expr", $expr.res); }
    | T_UNHEX T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("UNHEX", "expr", $expr.res); }
    | T_CONV T_OPEN_P e=expr ',' fbase=expr ',' tbase=expr T_CLOSE_P { $res = hql_three_param_func("CONV", "expr", $e.res, "from_base", $fbase.res, "to_base", $tbase.res); }
    | T_ABS T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ABS", "expr", $expr.res); }
    | T_PMOD T_OPEN_P a=expr ',' b=expr T_CLOSE_P { $res = hql_double_param_func("PMOD", "a", $a.res, "b", $b.res); }
    | T_SIN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("SIN", "expr", $expr.res); }
    | T_ASIN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ASIN", "expr", $expr.res); }
    | T_COS T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("COS", "expr", $expr.res); }
    | T_ACOS T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ACOS", "expr", $expr.res); }
    | T_TAN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("TAN", "expr", $expr.res); }
    | T_ATAN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ATAN", "expr", $expr.res); }
    | T_DEGREES T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("DEGREES", "expr", $expr.res); }
    | T_RADIANS T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("RADIANS", "expr", $expr.res); }
    | T_POSITIVE T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("POSITIVE", "expr", $expr.res); }
    | T_NEGATIVE T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("NEGATIVE", "expr", $expr.res); }
    | T_SIGN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("SIGN", "expr", $expr.res); }
    | 'E' T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("EULER_CONST"); }
    | 'PI' T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("PI_CONST"); }
    | T_FACTORIAL T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("FACTORIAL", "expr", $expr.res); }
    | T_CBR T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("CUBE_ROOT", "expr", $expr.res); }
    ;

// https://cwiki.apache.org/confluence/display/Hive/LanguageManual+UDF
// https://cwiki.apache.org/confluence/display/Hive/LanguageManual

literal_values returns [json res]
    : STRING_LITERAL { $res = hql_string_type($STRING_LITERAL.text); }
    | DECIMAL_LITERAL { $res = hql_decimal_type($DECIMAL_LITERAL.text); }
    | INT_LITERAL { $res = hql_int_type($INT_LITERAL.text); }
    | BOOL_LITERAL { $res = hql_boolean_type($BOOL_LITERAL.text); }
    | NULL_CONST { $res = hql_null_constant(); }
    | date_literal { $res = hql_type_date_literal($date_literal.res); }
    | timestamp_literal { $res = hql_type_timestamp_literal($timestamp_literal.res); }
    ;

ident returns [json res]
    : ( database=IDENTIFIER '.' )? ( tablename=IDENTIFIER '.' )? field=IDENTIFIER { $res = hql_type_identifier($database.text, $tablename.text, $field.text); }
    ;

tab_ident returns [json res]
    :  ( database=IDENTIFIER '.' )? tablename=IDENTIFIER { $res = hql_type_table_identifier($database.text, $tablename.text); }
    ;

date_literal returns [string res]
    : T_DATE STRING_LITERAL { $res = $STRING_LITERAL.text; }
    ;

timestamp_literal returns [string res]
    : T_TIMESTAMP STRING_LITERAL { $res = $STRING_LITERAL.text; }
    ;

set_operators_is returns [string res]
    : T_IS { $res = "IS"; }
    | T_IS T_NOT { $res = "IS_NOT"; }
    ;
set_operators_like returns [string res]
    : T_LIKE { $res = "LIKE"; }
    | T_NOT T_LIKE { $res = "NOT_LIKE"; }
    | T_RLIKE { $res = "RLIKE"; }
    | T_REGEXP  { $res = "REGEXP "; }
    ;
set_operators_in returns [string res]
    : T_IN { $res = "IN"; }
    | T_NOT T_IN { $res = "NOT_IN"; }
    ;
set_operators_exists returns [string res]
    : T_EXISTS { $res = "EXISTS"; }
    | T_NOT T_EXISTS { $res = "NOT_EXISTS"; }
    ;

unary_operator
    : '-'
    | '+'
    | '!'
    | T_NOT
    ;

NULL_CONST
    : T_NULL
    ;

BOOL_LITERAL
    : T_TRUE
    | T_FALSE
    ;

T_ABS             : A B S ;
T_ACOS            : A C O S ;
T_ADD_MONTHS      : A D D '_' M O N T H S ;
T_AES_ENCRYPT     : A E S '_' E N C R Y P T ;
T_AES_DECRYPT     : A E S '_' D E C R Y P T ;
T_ALL             : A L L ;
T_ALTER           : A L T E R ;
T_AND             : A N D ;
T_ARRAY           : A R R A Y ;
T_AS              : A S ;
T_ASC             : A S C ;
T_ASCII           : A S C I I ;
T_ASIN            : A S I N ;
T_ASSERT_TRUE     : A S S E R T '_' T R U E ;
T_AT              : A T ;
T_ATAN            : A T A N ;
T_AUTO_INCREMENT  : A U T O '_' I N C R E M E N T ;
T_AVG             : A V G ; 
T_AVRO            : A V R O ;
T_BASE64          : B A S E '6' '4' ;
T_BEGIN           : B E G I N ;
T_BETWEEN         : B E T W E E N ; 
T_BIGINT          : B I G I N T ;
T_BIN             : B I N ;
T_BINARY          : B I N A R Y ;
T_BIT             : B I T ;
T_BODY            : B O D Y ; 
T_BOOLEAN         : B O O L E A N ;
T_BREAK           : B R E A K ;
T_BUCKETS         : B U C K E T S ;
T_BY              : B Y ;
T_BYTE            : B Y T E ; 
T_CALL            : C A L L ;
T_CALLER          : C A L L E R ;
T_CASCADE         : C A S C A D E ; 
T_CASE            : C A S E ;
T_CAST            : C A S T ;
T_CBR             : C B R ;
T_CEIL            : C E I L ;
T_CEILING         : C E I L I N G ;
T_CHAR            : C H A R ;
T_CHARACTER       : C H A R A C T E R ;
T_CHARACTER_LENGTH: C H A R A C T E R '_' L E N G T H ;
T_CHARSET         : C H A R S E T ;
T_CHECK           : C H E C K ;
T_CHR             : C H R ;
T_CLIENT          : C L I E N T ;
T_CLOSE           : C L O S E ;
T_CLUSTERED       : C L U S T E R E D;
T_CMP             : C M P ;
T_COALESCE        : C O A L E S C E ; 
T_COLLECT         : C O L L E C T ; 
T_COLLECT_SET     : C O L L E C T '_' S E T ;
T_COLLECT_LIST    : C O L L E C T '_' L I S T ;
T_COLLECTION      : C O L L E C T I O N ; 
T_COLUMN          : C O L U M N ;
T_COMMENT         : C O M M E N T;
T_CONSTANT        : C O N S T A N T ;
T_COMMIT          : C O M M I T ; 
T_COMPRESS        : C O M P R E S S ;
T_CONCAT          : C O N C A T ;
T_CONCAT_WS       : C O N C A T '_' W S ;
T_CONDITION       : C O N D I T I O N ;
T_CONSTRAINT      : C O N S T R A I N T ; 
T_CONTINUE        : C O N T I N U E ;
T_CONV            : C O N V ;
T_COPY            : C O P Y ;
T_CORR            : C O R R ;
T_COS             : C O S ;
T_COUNT           : C O U N T ;
T_COUNT_BIG       : C O U N T '_' B I G;
T_COVAR_POP       : C O V A R '_' P O P ;
T_COVAR_SAMP      : C O V A R '_' S A M P ;
T_CRC32           : C R C '3' '2' ;
T_CREATE          : C R E A T E ;
T_CREATION        : C R E A T I O N ; 
T_CREATOR         : C R E A T O R ;
T_CROSS           : C R O S S ;
T_CS              : C S;
T_CURRENT         : C U R R E N T ;
T_CURRENT_SCHEMA  : C U R R E N T '_' S C H E M A ;
T_CURRENT_DATABASE : C U R R E N T '_' D A T A B A S E ;
T_CURSOR          : C U R S O R ;
T_DATABASE        : D A T A B A S E ;
T_DATE            : D A T E ;
T_DATEADD         : D A T E '_' A D D ;
T_DATEDIFF        : D A T E D I F F ;
T_DATE_FORMAT     : D A T E '_' F O R M A T ;
T_DATESUB         : D A T E '_' S U B ;
T_DATETIME        : D A T E T I M E ;
T_DAY             : D A Y ;
T_DAYS            : D A Y S ;
T_DEC             : D E C ;
T_DECIMAL         : D E C I M A L ;
T_DECODE          : D E C O D E ;
T_DECLARE         : D E C L A R E ;
T_DEFAULT         : D E F A U L T ;
T_DEFERRED        : D E F E R R E D ; 
T_DEFINED         : D E F I N E D ; 
T_DEFINER         : D E F I N E R ;
T_DEFINITION      : D E F I N I T I O N ; 
T_DEGREES         : D E G R E E S ;
T_DELETE          : D E L E T E ;
T_DELIMITED       : D E L I M I T E D ; 
T_DELIMITER       : D E L I M I T E R ; 
T_DESC            : D E S C ;
T_DESCRIBE        : D E S C R I B E ; 
T_DIAGNOSTICS     : D I A G N O S T I C S ;
T_DIR             : D I R ;
T_DIRECTORY       : D I R E C T O R Y ; 
T_DISABLE         : D I S A B L E ;
T_DISTINCT        : D I S T I N C T ;
T_DISTRIBUTE      : D I S T R I B U T E ;
T_DO              : D O ;
T_DOUBLE          : D O U B L E ;
T_DROP            : D R O P ;
T_DYNAMIC         : D Y N A M I C ; 
T_ELSE            : E L S E ;
T_ELSEIF          : E L S E I F ;
T_ELSIF           : E L S I F ;
T_ELT             : E L T ;
T_ENABLE          : E N A B L E ;
T_ENCODE          : E N C O D E ;
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
T_EXP             : E X P;
T_EXPLODE         : E X P L O D E ;
T_EXTERNAL        : E X T E R N A L ;
T_FACTORIAL       : F A C T O R I A L ;
T_FALLBACK        : F A L L B A C K ;
T_FALSE           : F A L S E ;
T_FETCH           : F E T C H ;
T_FIELD           : F I E L D  ; 
T_FIELDS          : F I E L D S ; 
T_FIELD_IN_SET    : F I E L D '_' I N '_' S E T ;
T_FILE            : F I L E ;
T_FILES           : F I L E S ; 
T_FLOAT           : F L O A T ;
T_FLOOR           : F L O O R;
T_FOR             : F O R ;
T_FOREIGN         : F O R E I G N ; 
T_FORMAT          : F O R M A T ;
T_FORMAT_NUMBER   : F O R M A T '_' N U M B E R ;
T_FOUND           : F O U N D ;
T_FROM            : F R O M ; 
T_FROMUTCTIMESTAMP  : F R O M '_' U T C '_' T I M E S T A M P ;
T_FULL            : F U L L ;
T_FUNCTION        : F U N C T I O N ;
T_GET             : G E T ;
T_GET_JSON_OBJECTS : G E T '_' J S O N '_' P A T H ;
T_GLOBAL          : G L O B A L ; 
T_GO              : G O ;
T_GRANT           : G R A N T ; 
T_GROUP           : G R O U P ;
T_HANDLER         : H A N D L E R ;
T_HASH            : H A S H ;
T_HAVING          : H A V I N G ;
T_HDFS            : H D F S ; 
T_HEX             : H E X ;
T_HISTOGRAM_NUMERIC : H I S T O G R A M '_' N U M E R I C ;
T_HIVE            : H I V E ;
T_HOST            : H O S T ;
T_HOUR            : H O U R ;
T_IDENTITY        : I D E N T I T Y ; 
T_IF              : I F ;
T_IGNORE          : I G N O R E ; 
T_IMMEDIATE       : I M M E D I A T E ;
T_IN              : I N ;
T_INCLUDE         : I N C L U D E ;
T_INDEX           : I N D E X ;
T_IN_FILE         : I N '_' F I L E ;
T_INITCAP         : I N I T C A P ;
T_INITRANS        : I N I T R A N S ;
T_INLINE          : I N L I N E ;
T_INNER           : I N N E R ; 
T_INOUT           : I N O U T;
T_INPUTFORMAT     : I N P U T F O R M A T ;
T_INSERT          : I N S E R T ;
T_IN_STR          : I N S T R ;
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
T_ISNOTNULL       : I S N O T N U L L ;
T_ISNULL          : I S N U L L ;
T_NVL             : N V L ;
T_ISOPEN          : I S O P E N ;
T_ITEMS           : I T E M S ; 
T_JAVA_METHOD     : J A V A '_' M E T H O D ;
T_JOIN            : J O I N ;
T_JSONFILE        : J S O N F I L E ;
T_KEEP            : K E E P; 
T_KEY             : K E Y ;
T_KEYS            : K E Y S ;
T_LANGUAGE        : L A N G U A G E ;
T_LASTDAY         : L A S T '_' D A Y ;
T_LATERAL         : L A T E R A L ;
T_LCASE           : L C A S E ;
T_LEAVE           : L E A V E ;
T_LEFT            : L E F T ;
T_LENGTH          : L E N G T H ;
T_LEVENSHTEIN     : L E V E N S H T E I N ;
T_LIKE            : L I K E ; 
T_LIMIT           : L I M I T ;
T_LINES           : L I N E S ; 
T_LOCAL           : L O C A L ;
T_LOCATE          : L O C A T E ;
T_LOCATION        : L O C A T I O N ;
T_LOCATOR         : L O C A T O R ; 
T_LOCATORS        : L O C A T O R S ; 
T_LOCKS           : L O C K S ; 
T_LOG             : L O G ; 
T_LOG10           : L O G '1' '0'; 
T_LOG2            : L O G '2'; 
T_LOGGED          : L O G G E D ; 
T_LOGGED_IN_USER  : L O G G E D '_' I N '_' U S E R ; 
T_LOGGING         : L O G G I N G ; 
T_LOOP            : L O O P ;
T_LOWER           : L O W E R ;
T_LPAD            : L P A D ;
T_LN              : L N ;
T_LTRIM           : L T R I M ;
T_MAP             : M A P ; 
T_MASK            : M A S K ;
T_MASK_FIRST_N    : M A S K '_' F I R S T '_' N ;
T_MASK_HASH       : M A S K '_' H A S H ;
T_MASK_LAST_N    : M A S K '_' L A S T '_' N ;
T_MASK_SHOW_FIRST_N : M A S K '_' S H O W '_' F I R S T '_' N ;
T_MASK_SHOW_LAST_N : M A S K '_' S H O W '_' L A S T '_' N ;
T_MATCHED         : M A T C H E D ; 
T_MAX             : M A X ;
T_MAXTRANS        : M A X T R A N S ; 
T_MD5             : M D '5' ;
T_MERGE           : M E R G E ; 
T_MESSAGE_TEXT    : M E S S A G E '_' T E X T ;
T_MICROSECOND     : M I C R O S E C O N D ;
T_MICROSECONDS    : M I C R O S E C O N D S;
T_MIN             : M I N ;
T_MINUTE          : M I N U T E ;
T_MONTH           : M O N T H ;
T_MONTHS_BETWEEN  : M O N T H S '_' B E T W E E N ;
T_MULTISET        : M U L T I S E T ; 
T_NAMED_STRUCT    : N A M E D '_' S T R U C T ;
T_NCHAR           : N C H A R ; 
T_NEGATIVE        : N E G A T I V E ;
T_NEXT_DAY        : N E X T '_' D A Y ;
T_NEW             : N E W ;
T_NVARCHAR        : N V A R C H A R ; 
T_NO              : N O ;
T_NOCOUNT         : N O C O U N T ;
T_NOCOMPRESS      : N O C O M P R E S S ; 
T_NOLOGGING       : N O L O G G I N G ;
T_NONE            : N O N E ;
T_NORELY          : N O R E L Y ;
T_NOT             : N O T ;
T_NOTFOUND        : N O T F O U N D ; 
T_NOVALIDATE      : N O V A L I D A T E ;
T_NTILE           : N T I L E ;
T_NULL            : N U L L ;
T_NULLIF          : N U L L I F ;
T_NUMERIC         : N U M E R I C ; 
T_NUMBER          : N U M B E R ;
T_OBJECT          : O B J E C T ; 
T_OCTET_LENGTH    : O C T E T '_' L E N G T H ;
T_OFF             : O F F ;
T_ON              : O N ;
T_ONLY            : O N L Y ;
T_OPEN            : O P E N ;
T_OR              : O R ;
T_ORC             : O R C ;
T_ORDER           : O R D E R;
T_OUT             : O U T ;
T_OUTER           : O U T E R ;
T_OUTPUTFORMAT    : O U T P U T F O R M A T ;
T_OVER            : O V E R ;
T_OVERWRITE       : O V E R W R I T E ; 
T_OWNER           : O W N E R ; 
T_PACKAGE         : P A C K A G E ; 
T_PARQUET         : P A R Q U E T ;
T_PARSE_URL       : P A R S E '_' U R L ;
T_PARTITION       : P A R T I T I O N ; 
T_PARTITIONED     : P A R T I T I O N E D ; 
T_PCTFREE         : P C T F R E E ; 
T_PCTUSED         : P C T U S E D ;
T_PERCENT_RANK    : P E R C E N T '_' R A N K ;
T_PERCENTILE      : P E R C E N T I L E ;
T_PERCENTILE_APPROX : P E R C E N T I L E '_' A P P R O X ;
T_PLS_INTEGER     : P L S '_' I N T E G E R ;
T_PMOD            : P M O D ;
T_POSITIVE        : P O S I T I V E ;
T_POSEXPLODE      : P O S E X P L O D E ;
T_POW             : P O W;
T_POWER           : P O W E R;
T_PRECISION       : P R E C I S I O N ; 
T_PRESERVE        : P R E S E R V E ; 
T_PRIMARY         : P R I M A R Y ;
T_PRINTF           : P R I N T F ; 
T_PROC            : P R O C ;
T_PROCEDURE       : P R O C E D U R E ;
T_QUALIFY         : Q U A L I F Y ;
T_QUARTER         : Q U A R T E R ;
T_QUERY_BAND      : Q U E R Y '_' B A N D ; 
T_QUIT            : Q U I T ; 
T_QUOTE           : Q U O T E;
T_RADIANS         : R A D I A N S ;
T_RAISE           : R A I S E ;
T_RAND            : R A N D ;
T_RCFILE          : R C F I L E ; 
T_REAL            : R E A L ; 
T_REFERENCES      : R E F E R E N C E S ; 
T_REFLECT         : R E F L E C T ;
T_REGEXP          : R E G E X P ;
T_REGEXP_EXTRACT  : R E G E X P '_' E X T R A C T ;
T_REGEXP_REPLACE  : R E G E X P '_' R E P L A C E ;
T_REGR_AVGX       : R E G R '_' A V G X ;
T_REGR_AVGY       : R E G R '_' A V G Y ;
T_REGR_COUNT      : R E G R '_' C O U N T ;
T_REGR_INTERCEPT  : R E G R '_' I N T E R C E P T ;
T_REGR_R2         : R E G R '_'R '2' ;
T_REGR_SLOPE      : R E G R '_' S L O P E ;
T_REGR_SXX        : R E G R '_' S X X ;
T_REGR_SXY        : R E G R '_' S X Y ;
T_REGR_SYY        : R E G R '_' S Y Y ;
T_RELY            : R E L Y ;
T_REPEAT          : R E P E A T ;
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
T_ROUND           : R O U N D ;
T_ROW             : R O W ; 
T_ROWS            : R O W S ; 
T_ROWTYPE         : R O W T Y P E ; 
T_ROW_COUNT       : R O W '_' C O U N T ;
T_RPAD            : R P A D ;
T_RR              : R R;
T_RS              : R S ;
T_RTRIM           : R T R I M ;
T_PWD             : P W D ; 
T_TRIM            : T R I M ;
T_SCHEMA          : S C H E M A ;
T_SECOND          : S E C O N D ;
T_SECONDS         : S E C O N D S;
T_SECURITY        : S E C U R I T Y ; 
T_SERDE           : S E R D E ;
T_SERDEPROPERTIES : S E R D E P R O P E R T I E S ;
T_SEGMENT         : S E G M E N T ; 
T_SEL             : S E L ;
T_SELECT          : S E L E C T ; 
T_SEQUENCEFILE    : S E Q U E N C E F I L E ;
T_SENTENCES       : S E N T E N C E S ;
T_SET             : S E T ;
T_SETS            : S E T S;
T_SHA             : S H A ;
T_SHA1             : S H A '1' ;
T_SHA2             : S H A '2' ;
T_SIGN            : S I G N ;
T_SIN             : S I N ; 
T_SIMPLE_DOUBLE   : S I M P L E '_' D O U B L E ;
T_SIMPLE_FLOAT    : S I M P L E '_' F L O A T ;
T_SIMPLE_INTEGER  : S I M P L E '_' I N T E G E R ;
T_SKEWED          : S K E W E D ;
T_SMALLDATETIME   : S M A L L D A T E T I M E ;
T_SMALLINT        : S M A L L I N T ;
T_SOUNDEX         : S O U N D E X ;
T_SPACE           : S P A C E ;
T_SPLIT           : S P L I T ;
T_SQL             : S Q L ; 
T_SQLEXCEPTION    : S Q L E X C E P T I O N ;
T_SQLINSERT       : S Q L I N S E R T ;
T_SQLSTATE        : S Q L S T A T E ;
T_SQLWARNING      : S Q L W A R N I N G ;
T_SQRT            : S Q R T ;
T_STATS           : S T A T S ; 
T_STATISTICS      : S T A T I S T I C S ;
T_STDDEV_POP      : S T D D E V '_' P O P ;
T_STDDEV_SAMP     : S T D D E V '_' S A M P ;
T_STEP            : S T E P ; 
T_STORAGE         : S T O R A G E ; 
T_STORED          : S T O R E D ;
T_STRING          : S T R I N G ;
T_STR_TO_MAP      : S T R '_' T O '_' M A P ;
T_STRUCT          : S T R U C T ;
T_SUBDIR          : S U B D I R ; 
T_SUBSTR          : S U B S T R ; 
T_SUBSTRING       : S U B S T R I N G ; 
T_SUBSTRING_INDEX : S U B S T R I N G '_' I N D E X ;
T_SUM             : S U M ;
T_SUMMARY         : S U M M A R Y ;
T_SYS_REFCURSOR   : S Y S '_' R E F C U R S O R ; 
T_TABLE           : T A B L E ;
T_TABLESPACE      : T A B L E S P A C E ;
T_TAN             : T A N ;
T_TBLPROPERTIES   : T B L P R O P E R T I E S ;
T_TEMPORARY       : T E M P O R A R Y ;
T_TERMINATED      : T E R M I N A T E D ; 
T_TEXTFILE        : T E X T F I L E ;
T_TEXTIMAGE_ON    : T E X T I M A G E '_' O N ;
T_THEN            : T H E N ;
T_TIMESTAMP       : T I M E S T A M P ;
T_TINYINT         : T I N Y I N T ;
T_TITLE           : T I T L E ;
T_TO              : T O ; 
T_TOP             : T O P ;
T_TOUTCTIMESTAMP  : T O '_' U T C '_' T I M E S T A M P ;
T_TRANSACTION     : T R A N S A C T I O N ;
T_TRANSLATE       : T R A N S L A T E ;
T_TRUE            : T R U E ;
T_TRUNCATE        : T R U N C A T E;
T_TRUNC            : T R U N C ;
T_TYPE            : T Y P E ; 
T_UCASE           : U C A S E ;
T_UNBASE64        : U N B A S E '6' '4' ;
T_UNHEX           : U N H E X ;
T_UNION           : U N I O N ;
T_UNIONTYPE       : U N I O N T Y P E ;
T_UNIQUE          : U N I Q U E ;
T_UNIX_TIMESTAMP  : U N I X '_' T I M E S T A M P ;
T_UPDATE          : U P D A T E ; 
T_UPPER           : U P P E R;
T_UR              : U R ;
T_USE             : U S E ;
T_USING           : U S I N G ;
T_VALUE           : V A L U E ;
T_VALUES          : V A L U E S ;
T_VAR             : V A R ;
T_VARCHAR         : V A R C H A R ;
T_VARCHAR2        : V A R C H A R '2' ;
T_VARYING         : V A R Y I N G ;
T_VERSION         : V E R S I O N;
T_VIEW            : V I E W ;
T_VOLATILE        : V O L A T I L E ;
T_WEEKOFYEAR      : W E E K O F Y E A R ;
T_WHEN            : W H E N ;
T_WHERE           : W H E R E ;
T_WHILE           : W H I L E ;
T_WITH            : W I T H ; 
T_WITHOUT         : W I T H O U T ;
T_WORK            : W O R K ;
T_XACT_ABORT      : X A C T '_' A B O R T ;
T_XML             : X M L ;
T_XPATH                : X P A T H ;
T_XPATH_BOOLEAN        : X P A T H '_' B O O L E A N ;
T_XPATH_DOUBLE         : X P A T H '_' D O U B L E ;
T_XPATH_FLOAT          : X P A T H '_' F L O A T ;
T_XPATH_INT            : X P A T H '_' I N T ;
T_XPATH_LONG           : X P A T H '_' L O N G ;
T_XPATH_NUMBER         : X P A T H '_' N U M B E R ;
T_XPATH_SHORT          : X P A T H '_' S H O R T ;
T_XPATH_STRING         : X P A T H '_' S T R I N G ;
T_YEAR            : Y E A R ;
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
T_VAR_POP              : V A R '_' P O P ;
T_VAR_SAMP             : V A R '_' S A M P ;
T_USER                 : U S E R ; 


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


IDENTIFIER
    : '`' (~'`' | '``')* '`'
    | [a-zA-Z_] [a-zA-Z_0-9]*
    ;

INT_LITERAL
    :('-' | '+')? L_INT
    ;

DECIMAL_LITERAL 
    : ('-' | '+')? L_DEC 
    ;

STRING_LITERAL  
    : '\'' (('\'' '\'') | ('\\' '\'') | ~('\''))* '\''         // Single quoted string literal 
    | '"' ('""' | '\\"' | .)*? '"'                              // Double quoted string literal
    ;

L_INT       : DIGIT+ ;

L_DEC
    : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
    | '.' DIGIT+ ( E [-+]? DIGIT+ )?
    ;

L_M_COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;                       // Multiline comment
L_S_COMMENT : ('--' | '//')  .*? '\r'? '\n' -> channel(HIDDEN) ;       // Single line comment

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9]; 

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];