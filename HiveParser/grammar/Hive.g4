grammar Hive;

@header {
    #include <string>
    #include <vector>
    #include <map>
    #include <cstdio>
    #include <iterator>
    #include "nlohmann/json.hpp"
    #include "hql_types.h"
    #include "hql_exprs.h"
    #include "hql_stmts.h"
    #include "hql_functions.h"
    #include "utils.h"

    using namespace std;
    using json = nlohmann::json;

    
}

@parser::members { 
    map<string, json> hivevar_context_variables; 
    map<string, json> hiveconf_context_variables;
    string database_now = "DEFAULT";

    void save_var(string var_name, string var_type, json var_value)
    {
        if(var_type == "HIVECONF")
        {
            hiveconf_context_variables.insert(make_pair(var_name, var_value));
        }
        else if(var_type == "HIVEVAR")
        {
            hivevar_context_variables.insert(make_pair(var_name, var_value));
        }
    }

    json create_empty_var(string var_name, string var_type)
    {
        json j;
        j["type"] = "VAR_SET";
        j["var_type"] = var_type;
        j["var_name"] = var_name;
        j["value"] = "";
        return j;
    }

    json get_value(string var_name, string var_type)
    {
        
        if(var_type == "HIVECONF")
        {
            if(hiveconf_context_variables.find(var_name) == hiveconf_context_variables.end())
                return create_empty_var(var_name, var_type);
            else
                return hiveconf_context_variables.find(var_name)->second;
        }
        else if(var_type == "HIVEVAR")
        {
            if(hivevar_context_variables.find(var_name) == hivevar_context_variables.end())
                return create_empty_var(var_name, var_type);
            else
                return hivevar_context_variables.find(var_name)->second;
        }

        return NULL;
    }
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
    : full_select_stmt { $res = $full_select_stmt.res; }
    | ddl_stmt { $res = $ddl_stmt.res; }
    | variable_substitution { $res = $variable_substitution.res; }
    | T_EXIT
    ;

ddl_stmt returns [json res]
    : create_table_stmt { $res = $create_table_stmt.res; }
    | droptable_stmt { $res = $droptable_stmt.res; }
    | insert_stmt { $res = $insert_stmt.res; }
    | T_USE name_identifier { database_now = remove_backquotes($name_identifier.res); }
    ;

insert_stmt returns [json res]
    : T_INSERT insert_type=(T_OVERWRITE | T_INTO) T_TABLE tab_ident opt_insert_partitions opt_if_not_exists_flag full_select_stmt { $res = hql_insert_select_stmt($insert_type.text, $tab_ident.res, $opt_insert_partitions.res, $opt_if_not_exists_flag.res, $full_select_stmt.res); }
    ;

opt_insert_partitions returns [vector<json> res]
    : { $res = vector<json>(); }
    | { vector<Name_identifierContext*> col_name_list; vector<Literal_valuesContext*> col_value_list; } T_PARTITION T_OPEN_P col_name_list+=name_identifier '=' col_value_list+=literal_values ( ',' col_name_list+=name_identifier '=' col_value_list+=literal_values )* T_CLOSE_P
    {
        vector<json> result_list;
        for(int i = 0 ; i < $col_name_list.size() ; i++)
        {
            json tmp;
            tmp[remove_backquotes($col_name_list[i]->res)] = $col_value_list[i]->res;
            result_list.push_back(tmp);
        }
        $res = result_list;
    }
    | { vector<Name_identifierContext*> col_name_list; } T_PARTITION T_OPEN_P col_name_list+=name_identifier ( ',' col_name_list+=name_identifier )* T_CLOSE_P
    {
        vector<json> result_list;
        for(int i = 0 ; i < $col_name_list.size() ; i++)
        {
            json tmp;
            tmp[remove_backquotes($col_name_list[i]->res)] = "NULL";
            result_list.push_back(tmp);
        }
        $res = result_list;
    }
    ;

variable_substitution returns [json res]
    : T_SET opt_var_set_type system_var_identifier '=' set_var_value { 
        save_var($system_var_identifier.res, $opt_var_set_type.res, $set_var_value.res);
        $res = hql_set_variable($opt_var_set_type.res, $system_var_identifier.res, $set_var_value.res); 
    }
    ;

set_var_value returns [json res]
    : IDENTIFIER { $res = hql_var_name_value(remove_backquotes($IDENTIFIER.text)); }
    | non_reserved_words { $res = hql_var_name_value($non_reserved_words.res); }
    | reserved_words { $res = hql_var_name_value($reserved_words.res); }
    | expr { $res = $expr.res; }
    ;


use_var returns [json res]
    : '$' '{' opt_var_use_type system_var_identifier '}' { $res = get_value($system_var_identifier.res, $opt_var_use_type.res); }
    ;

system_var_identifier returns [string res]
    : { vector<Var_nameContext*> var_name_list; } var_name_list+=var_name ( '.' var_name_list+=var_name )* {
        string result = "";
        for(Var_nameContext* var_namectxt:$var_name_list)
        {
            result += "." + var_namectxt->res;
        }
        $res = result;
    }
    ;

opt_var_set_type returns [string res]
    : { $res = "HIVECONF"; }
    | T_HIVECONF ':' { $res = "HIVECONF"; }
    | T_HIVEVAR ':' { $res = "HIVEVAR"; }
    ;

opt_var_use_type returns [string res]
    : { $res = "HIVEVAR"; }
    | T_HIVECONF ':' { $res = "HIVECONF"; }
    | T_HIVEVAR ':' { $res = "HIVEVAR"; }
    ;

var_name returns [string res]
    : name_identifier { $res = $name_identifier.res; }
    | reserved_words { $res = $reserved_words.res; }
    ;

droptable_stmt returns [json res]
    : T_DROP T_TABLE opt_if_exists tab_ident opt_drop_table_purge { $res = hql_drop_table_stmt($opt_if_exists.res, $tab_ident.res, $opt_drop_table_purge.res); }
    ;

opt_drop_table_purge returns [bool res]
    : { $res = false; }
    | T_PURGE { $res = true; }
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
    | T_CREATE table_type T_TABLE opt_if_not_exists_flag tab_name=tab_ident 
        T_LIKE tab_like=tab_ident opt_location { $res = hql_create_table_like($table_type.res, $opt_if_not_exists_flag.res, $tab_name.res, $tab_like.res, $opt_location.res); }
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
    | { vector<Opt_table_valContext*> opt_name_list, opt_val_list; } T_TBLPROPERTIES T_OPEN_P opt_name_list+=opt_table_val '=' opt_val_list+=opt_table_val ( ',' opt_name_list+=opt_table_val '=' opt_val_list+=opt_table_val )* T_CLOSE_P {
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
    | T_AS full_select_stmt { $res = $full_select_stmt.res; }
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
    | { vector<Column_identifierContext*> column_list; vector<Column_identifierContext*> ref_column_list; } T_CONSTRAINT name_identifier T_FOREIGN T_KEY T_OPEN_P column_list+=column_identifier ( ','column_list+=column_identifier )* T_CLOSE_P T_REFERENCES tab_ident T_OPEN_P ref_column_list+=column_identifier ( ',' ref_column_list+=column_identifier )* T_CLOSE_P opt_constraint_disable opt_constraint_novalidate {
        vector<string> column_str_list; vector<string> ref_column_str_list;
        for(Column_identifierContext* c_ctxt: $column_list) {
            column_str_list.push_back(c_ctxt->res); }
        for(Column_identifierContext* c_ctxt: $ref_column_list) {
            ref_column_str_list.push_back(c_ctxt->res); }
        $res = hql_foreign_key_constraint(column_str_list, $tab_ident.res, ref_column_str_list, $opt_constraint_disable.res, $opt_constraint_novalidate.res);
    }
    | {vector<Column_identifierContext*> column_list; } T_CONSTRAINT name_identifier T_UNIQUE T_OPEN_P column_list+=column_identifier ( ',' column_list+=column_identifier )* T_CLOSE_P  opt_constraint_disable opt_constraint_novalidate opt_constraint_rely_no_rely {
        vector<string> column_str_list;
        for(Column_identifierContext* c_ctxt: $column_list) {
            column_str_list.push_back(c_ctxt->res); }
        $res = hql_unique_constraint(column_str_list, $opt_constraint_disable.res, $opt_constraint_novalidate.res, $opt_constraint_rely_no_rely.res);
    }
    | T_CONSTRAINT name_identifier T_CHECK expr opt_constraint_enable_disable opt_constraint_novalidate opt_constraint_rely_no_rely { $res = hql_check_constraint($expr.res,  $opt_constraint_enable_disable.res, $opt_constraint_novalidate.res, $opt_constraint_rely_no_rely.res); }
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

opt_if_exists returns [bool res]
    : { $res = false; }
    | T_IF T_EXISTS { $res = true; }
    ;

table_type returns [string res]
    : { $res = "MANAGED"; }
    | T_EXTERNAL { $res = "EXTERNAL"; }
    | T_TEMPORARY { $res = "TEMPORARY"; }
    ;

full_select_stmt returns [json res]
    : select_stmt { $res = $select_stmt.res; }
    | select_union_stmt  { $res = $select_union_stmt.res; }
    ;

select_union_stmt returns [json res]
    : {vector<Select_union_typeContext*> union_type_list; vector<Select_stmtContext*> select_stmt_list; } base_select=select_stmt ( T_UNION union_type_list+=select_union_type select_stmt_list+=select_stmt )+ {
        vector<json> select_union_json_list;
        for(int i = 0 ; i < $union_type_list.size() ; i++)
        {
            json tmp;
            tmp["union_type"] = $union_type_list[i]->res;
            tmp["select_stmt"] = $select_stmt_list[i]->res;
            select_union_json_list.push_back(tmp);
        }
        $res = hql_select_union_stmt($base_select.res, select_union_json_list);
    }
    ;

select_union_type returns [string res]
    : { $res = "DISTINCT"; }
    | T_ALL { $res = "ALL"; }
    | T_DISTINCT { $res = "DISTINCT"; }
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
    : name_identifier { $res = $name_identifier.res; }
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

opt_order_by_list returns [vector<json> res]
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
   | tab_ident T_AS? name_identifier { $res =hql_stmt_table_ref($tab_ident.res, $name_identifier.res); } 
   | '(' select_union_stmt ')' T_AS? name_identifier { $res =hql_stmt_table_ref($select_union_stmt.res, $name_identifier.res); }
   | '(' select_stmt ')' T_AS? name_identifier { $res =hql_stmt_table_ref($select_stmt.res, $name_identifier.res); }
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
    : expr T_AS? name_identifier { $res = hql_select_expr($expr.res, $name_identifier.res); }
    | expr { $res = hql_select_expr($expr.res); }
    | expr T_AS? name_identifier { $res = hql_select_expr($expr.res, $name_identifier.res); }
    | expr { $res = hql_select_expr($expr.res); }
    | '*' { $res = hql_select_all_expr(); } 
    | name_identifier '.' '*' { $res = hql_select_all_expr($name_identifier.res); }
    | over_clause { $res = hql_select_expr($over_clause.res, "DEFAULT"); }
    | over_clause T_AS? name_identifier { $res = hql_select_expr($over_clause.res, $name_identifier.res); }
    ;

over_clause returns [json res]
    :  over_func T_OVER T_OPEN_P opt_partitions_by_list opt_order_by_list T_CLOSE_P { $res = hql_over_clause_partition_order($over_func.res, $opt_partitions_by_list.res, $opt_order_by_list.res);
    }
    ;

opt_partitions_by_list returns [vector<json> res]
    : { $res = vector<json>(); }
    | { vector<IdentContext*> ident_cntxt_list; } T_PARTITION T_BY ident_cntxt_list+=ident ( ',' ident_cntxt_list+=ident)*{
        vector<json> ident_json_list;
        for(IdentContext* ident_context:$ident_cntxt_list)
        {
            ident_json_list.push_back(ident_context->res);
        }
        $res = ident_json_list;
    }
    ;

over_func returns [json res]
    : basic_aggr_func { $res = $basic_aggr_func.res; }
    | analytic_func { $res = $analytic_func.res; }
    | f_name=(T_LAG|T_LEAD) expr_list { $res = hql_list_param_func($f_name.text, "column_list", $expr_list.res); }
    ;

analytic_func returns [json res]
    : func_name=( T_RANK | T_DENSE_RANK | T_ROW_NUMBER | T_CUME_DIST | T_PERCENT_RANK ) T_OPEN_P T_CLOSE_P { $res = hql_fixed_func($func_name.text); }
    ;


expr_list returns [vector<json> res]
    : { vector<ExprContext*> exprs; } T_OPEN_P exprs+=expr (',' exprs+=expr)* T_CLOSE_P {
        vector<json> expr_list_json;
        for (ExprContext* exp_contxt : $exprs)
        { 
            expr_list_json.push_back(exp_contxt->res); 
        }
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
    | eval_expr=expr set_operators_in expr_list { $res = hql_set_operators_in($set_operators_in.res, $eval_expr.res, $expr_list.res);  }
    | eval_expr=expr set_operators_in T_OPEN_P full_select_stmt T_CLOSE_P { $res = hql_set_operators_in($set_operators_in.res, $eval_expr.res, $full_select_stmt.res); }
    | eval_expr=expr set_operators_exists T_OPEN_P full_select_stmt T_CLOSE_P { $res = hql_set_operators_in($set_operators_exists.res, $eval_expr.res, $full_select_stmt.res); }
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
    | generic_function { $res = $generic_function.res; }
    | complex_types { $res = $complex_types.res; }
    | use_var { $res = $use_var.res; }
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
    | use_var { $res = $use_var.res; }
    | generic_function { $res = $generic_function.res; }
    ;

cond_func returns [json res]
    : T_IF T_OPEN_P test_cond=expr ',' valueTrue=expr ',' valueFalse=expr T_CLOSE_P { $res = hql_three_param_func("IF", "test_cond", $test_cond.res, "value_true", $valueTrue.res, "value_false", $valueFalse.res); }
    | T_ISNULL T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ISNULL", "expr", $expr.res); }
    | T_ISNOTNULL T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ISNOTNULL", "expr", $expr.res); }
    | T_NVL T_OPEN_P expr_val=expr ',' default_val=expr T_CLOSE_P { $res = hql_double_param_func("NVL", "expr_val", $expr_val.res, "default_val", $default_val.res); }
    | { vector<ExprContext*> exprs; } T_COALESCE T_OPEN_P exprs+=expr (',' exprs+=expr)+ T_CLOSE_P { 
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
        $res = hql_case_func($case_expr.res, when_expr_list_json, then_expr_list_json, json());
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
        $res = hql_case_func(json(), when_expr_list_json, then_expr_list_json, json());
     }
    | { vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; } T_CASE (T_WHEN when_exprs+=expr T_THEN then_exprs+=expr)+ T_ELSE els_expr=expr T_END{ 
        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
        for(int i = 0 ; i < $when_exprs.size() ; i++)
        {
            when_expr_list_json.push_back($when_exprs[i]->res);
            then_expr_list_json.push_back($then_exprs[i]->res);
        }
        $res = hql_case_func(json(), when_expr_list_json, then_expr_list_json, $els_expr.res);
     }
    | T_NULLIF T_OPEN_P a_expr=expr ',' b_expr=expr T_CLOSE_P { $res = hql_double_param_func("NULLIF", "a_expr", $a_expr.res, "b_expr", $b_expr.res); }
    | T_ASSERT_TRUE T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ASSERT_TRUE", "expr", $expr.res); }
    ;

date_func returns [json res]
    : T_FROM_UNIXTIME T_OPEN_P unix_time=expr T_CLOSE_P { $res = hql_single_param_func("FROM_UNIXTIME", "unixtime", $unix_time.res); }
    | T_FROM_UNIXTIME T_OPEN_P unix_time=expr ',' str_format=expr T_CLOSE_P { $res = hql_double_param_func("FROM_UNIXTIME", "unixtime", $unix_time.res,"format",$str_format.res); }
    | T_UNIX_TIMESTAMP T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("UNIX_TIMESTAMP"); }
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
    | T_DATE_ADD T_OPEN_P startdate=expr ',' days=expr T_CLOSE_P { $res = hql_double_param_func("DATEDIFF", "startdate", $startdate.res, "days", $days.res); }
    | T_DATE_SUB T_OPEN_P startdate=expr ',' days=expr T_CLOSE_P { $res = hql_double_param_func("DATEDIFF", "startdate", $startdate.res, "days", $days.res); }
    | T_TO_UTC_TIMESTAMP T_OPEN_P ts=expr ',' timezone=expr T_CLOSE_P { $res = hql_double_param_func("TO_UTC_TIMESTAMP", "ts", $ts.res, "timezone", $timezone.res); }
    | T_FROM_UTC_TIMESTAMP T_OPEN_P ts=expr ',' timezone=expr T_CLOSE_P { $res = hql_double_param_func("FROM_UTC_TIMESTAMP", "ts", $ts.res, "timezone", $timezone.res); }
    | T_CURRENT_DATE (T_OPEN_P T_CLOSE_P)? { $res = hql_fixed_func("CURRENT_DATE"); }
    | T_CURRENT_TIMESTAMP (T_OPEN_P T_CLOSE_P)? { $res = hql_fixed_func("T_CURRENT_TIMESTAMP"); }
    | T_ADD_MONTHS T_OPEN_P startdate=expr ',' num_months=expr T_CLOSE_P { $res = hql_double_param_func("ADD_MONTHS", "startdate", $startdate.res, "num_months", $num_months.res); }
    | T_ADD_MONTHS T_OPEN_P startdate=expr ',' num_months=expr ',' out_date_format=expr T_CLOSE_P { $res = hql_three_param_func("ADD_MONTHS", "startdate", $startdate.res, "num_months", $num_months.res, "out_date_format", $out_date_format.res); }
    | T_LAST_DAY T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("LAST_DAY", "date", $date_expr.res); }
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
    | T_E T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("EULER_CONST"); }
    | T_PI T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("PI_CONST"); }
    | T_FACTORIAL T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("FACTORIAL", "expr", $expr.res); }
    | T_CBRT T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("CUBE_ROOT", "expr", $expr.res); }
    ;

generic_function returns [json res]
    : database_name=complex_atom_name '.' function_name=complex_atom_name expr_list { $res = hql_generic_function($database_name.res, $function_name.res, $expr_list.res); }
    | function_name=complex_atom_name expr_list { $res = hql_generic_function(database_now, $function_name.res, $expr_list.res); }
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
    : ( database=name_identifier '.' ) ( tablename=name_identifier '.' ) field=name_identifier { $res = hql_type_identifier($database.res, $tablename.res, $field.res); }
    | ( tablename=name_identifier '.' ) field=name_identifier { $res = hql_type_identifier(string(), $tablename.res, $field.res); }
    | field=name_identifier { $res = hql_type_identifier(string(), string(), $field.res); }
    ;

tab_ident returns [json res]
    :  database=complex_name '.' tablename=complex_name { $res = hql_type_table_identifier($database.res, $tablename.res); }
    |  tablename=complex_name { $res = hql_type_table_identifier(database_now, $tablename.res); }
    ;

complex_name returns [string res]
    : complex_atom_name { $res = $complex_atom_name.res; }
    | {vector<Complex_atom_nameContext*> name_list; } ( name_list+=complex_atom_name)* use_var {
        string result = "";
        for(Complex_atom_nameContext* name_ctxt:$name_list)
            result+=name_ctxt->res;
        result += remove_quotes(to_string($use_var.res["value"]));
        $res = result;
    }
    ;

complex_atom_name returns [string res]
    : name_identifier { $res = $name_identifier.res; }
    | use_var { $res =  remove_quotes(to_string($use_var.res["value"])); }
    ; 

name_identifier returns [string res]
    : IDENTIFIER { $res = $IDENTIFIER.text; }
    | non_reserved_words { $res = $non_reserved_words.res; }
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

reserved_words returns [string res]
    : T_ALL { $res = $T_ALL.text; }
    | T_ALTER { $res = $T_ALTER.text; }
    | T_AND { $res = $T_AND.text; }
    | T_ARRAY { $res = $T_ARRAY.text; }
    | T_AS { $res = $T_AS.text; }
    | T_AUTHORIZATION { $res = $T_AUTHORIZATION.text; }
    | T_BETWEEN { $res = $T_BETWEEN.text; }
    | T_BIGINT { $res = $T_BIGINT.text; }
    | T_BINARY { $res = $T_BINARY.text; }
    | T_BOOLEAN { $res = $T_BOOLEAN.text; }
    | T_BOTH { $res = $T_BOTH.text; }
    | T_BY { $res = $T_BY.text; }
    | T_CASE { $res = $T_CASE.text; }
    | T_CAST { $res = $T_CAST.text; }
    | T_CHAR { $res = $T_CHAR.text; }
    | T_COLUMN { $res = $T_COLUMN.text; }
    | T_CONF { $res = $T_CONF.text; }
    | T_CREATE { $res = $T_CREATE.text; }
    | T_CROSS { $res = $T_CROSS.text; }
    | T_CUBE { $res = $T_CUBE.text; }
    | T_CURRENT { $res = $T_CURRENT.text; }
    | T_CURRENT_DATE { $res = $T_CURRENT_DATE.text; }
    | T_CURRENT_TIMESTAMP { $res = $T_CURRENT_TIMESTAMP.text; }
    | T_CURSOR { $res = $T_CURSOR.text; }
    | T_DATABASE { $res = $T_DATABASE.text; }
    | T_DATE { $res = $T_DATE.text; }
    | T_DECIMAL { $res = $T_DECIMAL.text; }
    | T_DELETE { $res = $T_DELETE.text; }
    | T_DESCRIBE { $res = $T_DESCRIBE.text; }
    | T_DISTINCT { $res = $T_DISTINCT.text; }
    | T_DOUBLE { $res = $T_DOUBLE.text; }
    | T_DROP { $res = $T_DROP.text; }
    | T_ELSE { $res = $T_ELSE.text; }
    | T_END { $res = $T_END.text; }
    | T_EXCHANGE { $res = $T_EXCHANGE.text; }
    | T_EXISTS { $res = $T_EXISTS.text; }
    | T_EXTENDED { $res = $T_EXTENDED.text; }
    | T_EXTERNAL { $res = $T_EXTERNAL.text; }
    | T_FALSE { $res = $T_FALSE.text; }
    | T_FETCH { $res = $T_FETCH.text; }
    | T_FLOAT { $res = $T_FLOAT.text; }
    | T_FOLLOWING { $res = $T_FOLLOWING.text; }
    | T_FOR { $res = $T_FOR.text; }
    | T_FROM { $res = $T_FROM.text; }
    | T_FULL { $res = $T_FULL.text; }
    | T_FUNCTION { $res = $T_FUNCTION.text; }
    | T_GRANT { $res = $T_GRANT.text; }
    | T_GROUP { $res = $T_GROUP.text; }
    | T_GROUPING { $res = $T_GROUPING.text; }
    | T_HAVING { $res = $T_HAVING.text; }
    | T_IF { $res = $T_IF.text; }
    | T_IMPORT { $res = $T_IMPORT.text; }
    | T_IN { $res = $T_IN.text; }
    | T_INNER { $res = $T_INNER.text; }
    | T_INSERT { $res = $T_INSERT.text; }
    | T_INT { $res = $T_INT.text; }
    | T_INTERSECT { $res = $T_INTERSECT.text; }
    | T_INTERVAL { $res = $T_INTERVAL.text; }
    | T_INTO { $res = $T_INTO.text; }
    | T_IS { $res = $T_IS.text; }
    | T_JOIN { $res = $T_JOIN.text; }
    | T_LATERAL { $res = $T_LATERAL.text; }
    | T_LEFT { $res = $T_LEFT.text; }
    | T_LESS { $res = $T_LESS.text; }
    | T_LIKE { $res = $T_LIKE.text; }
    | T_LOCAL { $res = $T_LOCAL.text; }
    | T_MACRO { $res = $T_MACRO.text; }
    | T_MAP { $res = $T_MAP.text; }
    | T_MORE { $res = $T_MORE.text; }
    | T_NONE { $res = $T_NONE.text; }
    | T_NOT { $res = $T_NOT.text; }
    | T_NULL { $res = $T_NULL.text; }
    | T_OF { $res = $T_OF.text; }
    | T_ON { $res = $T_ON.text; }
    | T_OR { $res = $T_OR.text; }
    | T_ORDER { $res = $T_ORDER.text; }
    | T_OUT { $res = $T_OUT.text; }
    | T_OUTER { $res = $T_OUTER.text; }
    | T_OVER { $res = $T_OVER.text; }
    | T_PARTIALSCAN { $res = $T_PARTIALSCAN.text; }
    | T_PARTITION { $res = $T_PARTITION.text; }
    | T_PERCENT { $res = $T_PERCENT.text; }
    | T_PRECEDING { $res = $T_PRECEDING.text; }
    | T_PRESERVE { $res = $T_PRESERVE.text; }
    | T_PROCEDURE { $res = $T_PROCEDURE.text; }
    | T_RANGE { $res = $T_RANGE.text; }
    | T_READS { $res = $T_READS.text; }
    | T_REDUCE { $res = $T_REDUCE.text; }
    | T_REVOKE { $res = $T_REVOKE.text; }
    | T_RIGHT { $res = $T_RIGHT.text; }
    | T_ROLLUP { $res = $T_ROLLUP.text; }
    | T_ROW { $res = $T_ROW.text; }
    | T_ROWS { $res = $T_ROWS.text; }
    | T_SELECT { $res = $T_SELECT.text; }
    | T_SET { $res = $T_SET.text; }
    | T_SMALLINT { $res = $T_SMALLINT.text; }
    | T_TABLE { $res = $T_TABLE.text; }
    | T_TABLESAMPLE { $res = $T_TABLESAMPLE.text; }
    | T_THEN { $res = $T_THEN.text; }
    | T_TIMESTAMP { $res = $T_TIMESTAMP.text; }
    | T_TO { $res = $T_TO.text; }
    | T_TRANSFORM { $res = $T_TRANSFORM.text; }
    | T_TRIGGER { $res = $T_TRIGGER.text; }
    | T_TRUE { $res = $T_TRUE.text; }
    | T_TRUNCATE { $res = $T_TRUNCATE.text; }
    | T_UNBOUNDED { $res = $T_UNBOUNDED.text; }
    | T_UNION { $res = $T_UNION.text; }
    | T_UNIQUEJOIN { $res = $T_UNIQUEJOIN.text; }
    | T_UPDATE { $res = $T_UPDATE.text; }
    | T_USER { $res = $T_USER.text; }
    | T_USING { $res = $T_USING.text; }
    | T_UTC_TMESTAMP { $res = $T_UTC_TMESTAMP.text; }
    | T_VALUES { $res = $T_VALUES.text; }
    | T_VARCHAR { $res = $T_VARCHAR.text; }
    | T_WHEN { $res = $T_WHEN.text; }
    | T_WHERE { $res = $T_WHERE.text; }
    | T_WINDOW { $res = $T_WINDOW.text; }
    | T_WITH { $res = $T_WITH.text; }
    | T_COMMIT { $res = $T_COMMIT.text; }
    | T_ONLY { $res = $T_ONLY.text; }
    | T_REGEXP { $res = $T_REGEXP.text; }
    | T_RLIKE { $res = $T_RLIKE.text; }
    | T_ROLLBACK { $res = $T_ROLLBACK.text; }
    | T_START { $res = $T_START.text; }
    | T_CACHE { $res = $T_CACHE.text; }
    | T_CONSTRAINT { $res = $T_CONSTRAINT.text; }
    | T_FOREIGN { $res = $T_FOREIGN.text; }
    | T_PRIMARY { $res = $T_PRIMARY.text; }
    | T_REFERENCES { $res = $T_REFERENCES.text; }
    | T_DAYOFWEEK { $res = $T_DAYOFWEEK.text; }
    | T_EXTRACT { $res = $T_EXTRACT.text; }
    | T_FLOOR { $res = $T_FLOOR.text; }
    | T_INTEGER { $res = $T_INTEGER.text; }
    | T_PRECISION { $res = $T_PRECISION.text; }
    | T_VIEWS { $res = $T_VIEWS.text; }
    | T_TIME { $res = $T_TIME.text; }
    | T_NUMERIC { $res = $T_NUMERIC.text; }
    | T_SYNC { $res = $T_SYNC.text; }
    ;

// Tokens that are not reserved words and can be used as identifiers
non_reserved_words returns [string res]
    : function_names { $res = $function_names.res; }
    | T_EXIT { $res = $T_EXIT.text; }
    | T_ADD_W { $res = $T_ADD_W.text; }
    | T_ADMIN { $res = $T_ADMIN.text; }
    | T_AFTER { $res = $T_AFTER.text; }
    | T_ANALYZE { $res = $T_ANALYZE.text; }
    | T_ARCHIVE { $res = $T_ARCHIVE.text; }
    | T_ASC { $res = $T_ASC.text; }
    | T_AUTOCOMMIT { $res = $T_AUTOCOMMIT.text; }
    | T_BEFORE { $res = $T_BEFORE.text; }
    | T_BUCKET { $res = $T_BUCKET.text; }
    | T_BUCKETS { $res = $T_BUCKETS.text; }
    | T_CASCADE { $res = $T_CASCADE.text; }
    | T_CHANGE { $res = $T_CHANGE.text; }
    | T_CLUSTER { $res = $T_CLUSTER.text; }
    | T_CLUSTERED { $res = $T_CLUSTERED.text; }
    | T_CLUSTERSTATUS { $res = $T_CLUSTERSTATUS.text; }
    | T_COLLECTION { $res = $T_COLLECTION.text; }
    | T_COLUMNS { $res = $T_COLUMNS.text; }
    | T_COMMENT { $res = $T_COMMENT.text; }
    | T_COMPACT { $res = $T_COMPACT.text; }
    | T_COMPACTIONS { $res = $T_COMPACTIONS.text; }
    | T_COMPUTE { $res = $T_COMPUTE.text; }
    | T_CONCATENATE { $res = $T_CONCATENATE.text; }
    | T_CONTINUE { $res = $T_CONTINUE.text; }
    | T_DATA { $res = $T_DATA.text; }
    | T_DATABASES { $res = $T_DATABASES.text; }
    | T_DATETIME { $res = $T_DATETIME.text; }
    | T_DAY { $res = $T_DAY.text; }
    | T_DBPROPERTIES { $res = $T_DBPROPERTIES.text; }
    | T_DEFERRED { $res = $T_DEFERRED.text; }
    | T_DEFINED { $res = $T_DEFINED.text; }
    | T_DELIMITED { $res = $T_DELIMITED.text; }
    | T_DEPENDENCY { $res = $T_DEPENDENCY.text; }
    | T_DESC { $res = $T_DESC.text; }
    | T_DIRECTORIES { $res = $T_DIRECTORIES.text; }
    | T_DIRECTORY { $res = $T_DIRECTORY.text; }
    | T_DISABLE { $res = $T_DISABLE.text; }
    | T_DISTRIBUTE { $res = $T_DISTRIBUTE.text; }
    | T_ELEM_TYPE { $res = $T_ELEM_TYPE.text; }
    | T_ENABLE { $res = $T_ENABLE.text; }
    | T_ESCAPED { $res = $T_ESCAPED.text; }
    | T_EXCLUSIVE { $res = $T_EXCLUSIVE.text; }
    | T_EXPLAIN { $res = $T_EXPLAIN.text; }
    | T_EXPORT { $res = $T_EXPORT.text; }
    | T_FIELDS { $res = $T_FIELDS.text; }
    | T_FILE { $res = $T_FILE.text; }
    | T_FILEFORMAT { $res = $T_FILEFORMAT.text; }
    | T_FIRST { $res = $T_FIRST.text; }
    | T_FORMAT { $res = $T_FORMAT.text; }
    | T_FORMATTED { $res = $T_FORMATTED.text; }
    | T_FUNCTIONS { $res = $T_FUNCTIONS.text; }
    | T_HOLD_DDLTIME { $res = $T_HOLD_DDLTIME.text; }
    | T_HOUR { $res = $T_HOUR.text; }
    | T_IDXPROPERTIES { $res = $T_IDXPROPERTIES.text; }
    | T_IGNORE { $res = $T_IGNORE.text; }
    | T_INDEX { $res = $T_INDEX.text; }
    | T_INDEXES { $res = $T_INDEXES.text; }
    | T_INPATH { $res = $T_INPATH.text; }
    | T_INPUTDRIVER { $res = $T_INPUTDRIVER.text; }
    | T_INPUTFORMAT { $res = $T_INPUTFORMAT.text; }
    | T_ITEMS { $res = $T_ITEMS.text; }
    | T_JAR { $res = $T_JAR.text; }
    | T_KEYS { $res = $T_KEYS.text; }
    | T_KEY_TYPE { $res = $T_KEY_TYPE.text; }
    | T_LIMIT { $res = $T_LIMIT.text; }
    | T_LINES { $res = $T_LINES.text; }
    | T_LOAD { $res = $T_LOAD.text; }
    | T_LOCATION { $res = $T_LOCATION.text; }
    | T_LOCK { $res = $T_LOCK.text; }
    | T_LOCKS { $res = $T_LOCKS.text; }
    | T_LOGICAL { $res = $T_LOGICAL.text; }
    | T_LONG { $res = $T_LONG.text; }
    | T_MAPJOIN { $res = $T_MAPJOIN.text; }
    | T_MATERIALIZED { $res = $T_MATERIALIZED.text; }
    | T_METADATA { $res = $T_METADATA.text; }
    | T_MINUS { $res = $T_MINUS.text; }
    | T_MINUTE { $res = $T_MINUTE.text; }
    | T_MONTH { $res = $T_MONTH.text; }
    | T_MSCK { $res = $T_MSCK.text; }
    | T_NOSCAN { $res = $T_NOSCAN.text; }
    | T_NO_DROP { $res = $T_NO_DROP.text; }
    | T_OFFLINE { $res = $T_OFFLINE.text; }
    | T_OPTION { $res = $T_OPTION.text; }
    | T_OUTPUTDRIVER { $res = $T_OUTPUTDRIVER.text; }
    | T_OUTPUTFORMAT { $res = $T_OUTPUTFORMAT.text; }
    | T_OVERWRITE { $res = $T_OVERWRITE.text; }
    | T_OWNER { $res = $T_OWNER.text; }
    | T_PARTITIONED { $res = $T_PARTITIONED.text; }
    | T_PARTITIONS { $res = $T_PARTITIONS.text; }
    | T_PLUS { $res = $T_PLUS.text; }
    | T_PRETTY { $res = $T_PRETTY.text; }
    | T_PRINCIPALS { $res = $T_PRINCIPALS.text; }
    | T_PROTECTION { $res = $T_PROTECTION.text; }
    | T_PURGE { $res = $T_PURGE.text; }
    | T_READ { $res = $T_READ.text; }
    | T_READONLY { $res = $T_READONLY.text; }
    | T_REBUILD { $res = $T_REBUILD.text; }
    | T_RECORDREADER { $res = $T_RECORDREADER.text; }
    | T_RECORDWRITER { $res = $T_RECORDWRITER.text; }
    | T_RELOAD { $res = $T_RELOAD.text; }
    | T_RENAME { $res = $T_RENAME.text; }
    | T_REPAIR { $res = $T_REPAIR.text; }
    | T_REPLACE { $res = $T_REPLACE.text; }
    | T_REPLICATION { $res = $T_REPLICATION.text; }
    | T_RESTRICT { $res = $T_RESTRICT.text; }
    | T_REWRITE { $res = $T_REWRITE.text; }
    | T_ROLE { $res = $T_ROLE.text; }
    | T_ROLES { $res = $T_ROLES.text; }
    | T_SCHEMA { $res = $T_SCHEMA.text; }
    | T_SCHEMAS { $res = $T_SCHEMAS.text; }
    | T_SECOND { $res = $T_SECOND.text; }
    | T_SEMI { $res = $T_SEMI.text; }
    | T_SERDE { $res = $T_SERDE.text; }
    | T_SERDEPROPERTIES { $res = $T_SERDEPROPERTIES.text; }
    | T_SERVER { $res = $T_SERVER.text; }
    | T_SETS { $res = $T_SETS.text; }
    | T_SHARED { $res = $T_SHARED.text; }
    | T_SHOW { $res = $T_SHOW.text; }
    | T_SHOW_DATABASE { $res = $T_SHOW_DATABASE.text; }
    | T_SKEWED { $res = $T_SKEWED.text; }
    | T_SORT { $res = $T_SORT.text; }
    | T_SORTED { $res = $T_SORTED.text; }
    | T_SSL { $res = $T_SSL.text; }
    | T_STATISTICS { $res = $T_STATISTICS.text; }
    | T_STORED { $res = $T_STORED.text; }
    | T_STREAMTABLE { $res = $T_STREAMTABLE.text; }
    | T_STRING { $res = $T_STRING.text; }
    | T_STRUCT { $res = $T_STRUCT.text; }
    | T_TABLES { $res = $T_TABLES.text; }
    | T_TBLPROPERTIES { $res = $T_TBLPROPERTIES.text; }
    | T_TEMPORARY { $res = $T_TEMPORARY.text; }
    | T_TERMINATED { $res = $T_TERMINATED.text; }
    | T_TINYINT { $res = $T_TINYINT.text; }
    | T_TOUCH { $res = $T_TOUCH.text; }
    | T_TRANSACTIONS { $res = $T_TRANSACTIONS.text; }
    | T_UNARCHIVE { $res = $T_UNARCHIVE.text; }
    | T_UNDO { $res = $T_UNDO.text; }
    | T_UNIONTYPE { $res = $T_UNIONTYPE.text; }
    | T_UNLOCK { $res = $T_UNLOCK.text; }
    | T_UNSET { $res = $T_UNSET.text; }
    | T_UNSIGNED { $res = $T_UNSIGNED.text; }
    | T_URI { $res = $T_URI.text; }
    | T_USE { $res = $T_USE.text; }
    | T_UTC { $res = $T_UTC.text; }
    | T_UTCTIMESTAMP { $res = $T_UTCTIMESTAMP.text; }
    | T_VALUE_TYPE { $res = $T_VALUE_TYPE.text; }
    | T_VIEW { $res = $T_VIEW.text; }
    | T_WHILE { $res = $T_WHILE.text; }
    | T_YEAR { $res = $T_YEAR.text; }
    | T_ISOLATION { $res = $T_ISOLATION.text; }
    | T_LEVEL { $res = $T_LEVEL.text; }
    | T_OFFSET { $res = $T_OFFSET.text; }
    | T_SNAPSHOT { $res = $T_SNAPSHOT.text; }
    | T_TRANSACTION { $res = $T_TRANSACTION.text; }
    | T_WORK { $res = $T_WORK.text; }
    | T_WRITE { $res = $T_WRITE.text; }
    | T_ABORT { $res = $T_ABORT.text; }
    | T_KEY { $res = $T_KEY.text; }
    | T_LAST { $res = $T_LAST.text; }
    | T_NORELY { $res = $T_NORELY.text; }
    | T_NOVALIDATE { $res = $T_NOVALIDATE.text; }
    | T_NULLS { $res = $T_NULLS.text; }
    | T_RELY { $res = $T_RELY.text; }
    | T_VALIDATE { $res = $T_VALIDATE.text; }
    | T_DETAIL { $res = $T_DETAIL.text; }
    | T_DOW { $res = $T_DOW.text; }
    | T_EXPRESSION { $res = $T_EXPRESSION.text; }
    | T_OPERATOR { $res = $T_OPERATOR.text; }
    | T_QUARTER { $res = $T_QUARTER.text; }
    | T_SUMMARY { $res = $T_SUMMARY.text; }
    | T_VECTORIZATION { $res = $T_VECTORIZATION.text; }
    | T_WEEK { $res = $T_WEEK.text; }
    | T_YEARS { $res = $T_YEARS.text; }
    | T_MONTHS { $res = $T_MONTHS.text; }
    | T_WEEKS { $res = $T_WEEKS.text; }
    | T_DAYS { $res = $T_DAYS.text; }
    | T_HOURS { $res = $T_HOURS.text; }
    | T_MINUTES { $res = $T_MINUTES.text; }
    | T_SECONDS { $res = $T_SECONDS.text; }
    | T_TIMESTAMPTZ { $res = $T_TIMESTAMPTZ.text; }
    | T_ZONE { $res = $T_ZONE.text; }
    | T_SYSDATE { $res = $T_SYSDATE.text; }
    | T_NAMED_STRUCT { $res = $T_NAMED_STRUCT.text; }
    | T_UNIQUE { $res = $T_UNIQUE.text; }
    | T_CHECK { $res = $T_CHECK.text; }
    | T_DEFAULT { $res = $T_DEFAULT.text; }
    | T_SEQUENCEFILE { $res = $T_SEQUENCEFILE.text; }
    | T_TEXTFILE { $res = $T_TEXTFILE.text; }
    | T_RCFILE { $res = $T_RCFILE.text; }
    | T_ORC { $res = $T_ORC.text; }
    | T_PARQUET { $res = $T_PARQUET.text; }
    | T_AVRO { $res = $T_AVRO.text; }
    | T_JSONFILE { $res = $T_JSONFILE.text; }
    | T_HIVECONF { $res = $T_HIVECONF.text; }
    | T_HIVEVAR { $res = $T_HIVEVAR.text; }
    | T_BYTE { $res = $T_BYTE.text; }
    ;

function_names returns [string res]
    : T_REGR_AVGX { $res = $T_REGR_AVGX.text; }
    | T_LOWER { $res = $T_LOWER.text; }
    | T_SHIFTRIGHT { $res = $T_SHIFTRIGHT.text; }
    | T_LOG { $res = $T_LOG.text; }
    | T_ABS { $res = $T_ABS.text; }
    | T_NULLIF { $res = $T_NULLIF.text; }
    | T_ENCODE { $res = $T_ENCODE.text; }
    | T_FIELD { $res = $T_FIELD.text; }
    | T_END { $res = $T_END.text; }
    | T_DATE_SUB { $res = $T_DATE_SUB.text; }
    | T_ASIN { $res = $T_ASIN.text; }
    | T_SUBSTR { $res = $T_SUBSTR.text; }
    | T_UNIX_TIMESTAMP { $res = $T_UNIX_TIMESTAMP.text; }
    | T_DECODE { $res = $T_DECODE.text; }
    | T_STDDEV_POP { $res = $T_STDDEV_POP.text; }
    | T_SIN { $res = $T_SIN.text; }
    | T_SORT_ARRAY { $res = $T_SORT_ARRAY.text; }
    | T_BINARY { $res = $T_BINARY.text; }
    | T_CONCATENATE { $res = $T_CONCATENATE.text; }
    | T_CURRENT_USER { $res = $T_CURRENT_USER.text; }
    | T_ASSERT_TRUE { $res = $T_ASSERT_TRUE.text; }
    | T_NVL { $res = $T_NVL.text; }
    | T_SHA2 { $res = $T_SHA2.text; }
    | T_DATEDIFF { $res = $T_DATEDIFF.text; }
    | T_HISTOGRAM_NUMERIC { $res = $T_HISTOGRAM_NUMERIC.text; }
    | T_TO_DATE { $res = $T_TO_DATE.text; }
    | T_NEGATIVE { $res = $T_NEGATIVE.text; }
    | T_CONCAT_WS { $res = $T_CONCAT_WS.text; }
    | T_LEAST { $res = $T_LEAST.text; }
    | T_FIND_IN_SET { $res = $T_FIND_IN_SET.text; }
    | T_CONCAT { $res = $T_CONCAT.text; }
    | T_MD5 { $res = $T_MD5.text; }
    | T_SUBSTRING_INDEX { $res = $T_SUBSTRING_INDEX.text; }
    | T_E { $res = $T_E.text; }
    | T_CONTEXT_NGRAMS { $res = $T_CONTEXT_NGRAMS.text; }
    | T_UNHEX { $res = $T_UNHEX.text; }
    | T_ELT { $res = $T_ELT.text; }
    | T_BEGINNING { $res = $T_BEGINNING.text; }
    | T_AVG { $res = $T_AVG.text; }
    | T_EXP { $res = $T_EXP.text; }
    | T_EXTRACT { $res = $T_EXTRACT.text; }
    | T_QUARTER { $res = $T_QUARTER.text; }
    | T_STDDEV_SAMP { $res = $T_STDDEV_SAMP.text; }
    | T_HASH { $res = $T_HASH.text; }
    | T_SURROGATE_KEY { $res = $T_SURROGATE_KEY.text; }
    | T_FROM_UNIXTIME { $res = $T_FROM_UNIXTIME.text; }
    | T_COLLECT_SET { $res = $T_COLLECT_SET.text; }
    | T_ASCII { $res = $T_ASCII.text; }
    | T_REGR_R2 { $res = $T_REGR_R2.text; }
    | T_OR { $res = $T_OR.text; }
    | T_PERCENTILE_APPROX { $res = $T_PERCENTILE_APPROX.text; }
    | T_SIZE { $res = $T_SIZE.text; }
    | T_NGRAMS { $res = $T_NGRAMS.text; }
    | T_MASK_SHOW_FIRST_N { $res = $T_MASK_SHOW_FIRST_N.text; }
    | T_EXPLODE { $res = $T_EXPLODE.text; }
    | T_REGR_COUNT { $res = $T_REGR_COUNT.text; }
    | T_COUNT { $res = $T_COUNT.text; }
    | T_LENGTH { $res = $T_LENGTH.text; }
    | T_LOCATE { $res = $T_LOCATE.text; }
    | T_ACOS { $res = $T_ACOS.text; }
    | T_REPLACE { $res = $T_REPLACE.text; }
    | T_PMOD { $res = $T_PMOD.text; }
    | T_DAY { $res = $T_DAY.text; }
    | T_CHR { $res = $T_CHR.text; }
    | T_SPLIT { $res = $T_SPLIT.text; }
    | T_UNARY { $res = $T_UNARY.text; }
    | T_MINUTE { $res = $T_MINUTE.text; }
    | T_RADIANS { $res = $T_RADIANS.text; }
    | T_INLINE { $res = $T_INLINE.text; }
    | T_LPAD { $res = $T_LPAD.text; }
    | T_CBRT { $res = $T_CBRT.text; }
    | T_FROM_UTC_TIMESTAMP { $res = $T_FROM_UTC_TIMESTAMP.text; }
    | T_CAST { $res = $T_CAST.text; }
    | T_TRANSLATE { $res = $T_TRANSLATE.text; }
    | T_CRC32 { $res = $T_CRC32.text; }
    | T_OCTET_LENGTH { $res = $T_OCTET_LENGTH.text; }
    | T_INITCAP { $res = $T_INITCAP.text; }
    | T_POSITIVE { $res = $T_POSITIVE.text; }
    | T_UNBASE64 { $res = $T_UNBASE64.text; }
    | T_FACTORIAL { $res = $T_FACTORIAL.text; }
    | T_REGEXP_EXTRACT { $res = $T_REGEXP_EXTRACT.text; }
    | T_COS { $res = $T_COS.text; }
    | T_MONTH { $res = $T_MONTH.text; }
    | T_NTILE { $res = $T_NTILE.text; }
    | T_SHIFTRIGHTUNSIGNED { $res = $T_SHIFTRIGHTUNSIGNED.text; }
    | T_AES_ENCRYPT { $res = $T_AES_ENCRYPT.text; }
    | T_LAST_DAY { $res = $T_LAST_DAY.text; }
    | T_SECOND { $res = $T_SECOND.text; }
    | T_TO_UTC_TIMESTAMP { $res = $T_TO_UTC_TIMESTAMP.text; }
    | T_QUOTE { $res = $T_QUOTE.text; }
    | T_SQRT { $res = $T_SQRT.text; }
    | T_PARSE_URL { $res = $T_PARSE_URL.text; }
    | T_EQUAL { $res = $T_EQUAL.text; }
    | T_MONTHS_BETWEEN { $res = $T_MONTHS_BETWEEN.text; }
    | T_MASK_HASH { $res = $T_MASK_HASH.text; }
    | T_XOR { $res = $T_XOR.text; }
    | T_LOG10 { $res = $T_LOG10.text; }
    | T_SENTENCES { $res = $T_SENTENCES.text; }
    | T_MAP_VALUES { $res = $T_MAP_VALUES.text; }
    | T_INSTR { $res = $T_INSTR.text; }
    | T_MASK { $res = $T_MASK.text; }
    | T_AND { $res = $T_AND.text; }
    | T_VARIANCE { $res = $T_VARIANCE.text; }
    | T_VAR_SAMP { $res = $T_VAR_SAMP.text; }
    | T_SHA1 { $res = $T_SHA1.text; }
    | T_TAN { $res = $T_TAN.text; }
    | T_ADD_MONTHS { $res = $T_ADD_MONTHS.text; }
    | T_MAP_KEYS { $res = $T_MAP_KEYS.text; }
    | T_ATAN { $res = $T_ATAN.text; }
    | T_TRUNC { $res = $T_TRUNC.text; }
    | T_LEVENSHTEIN { $res = $T_LEVENSHTEIN.text; }
    | T_YEAR { $res = $T_YEAR.text; }
    | T_ARRAY_CONTAINS { $res = $T_ARRAY_CONTAINS.text; }
    | T_MIN { $res = $T_MIN.text; }
    | T_GET_JSON_OBJECT { $res = $T_GET_JSON_OBJECT.text; }
    | T_REGR_INTERCEPT { $res = $T_REGR_INTERCEPT.text; }
    | T_MASK_SHOW_LAST_N { $res = $T_MASK_SHOW_LAST_N.text; }
    | T_RPAD { $res = $T_RPAD.text; }
    | T_PERCENTILE { $res = $T_PERCENTILE.text; }
    | T_REGR_AVGY { $res = $T_REGR_AVGY.text; }
    | T_REGR_SYY { $res = $T_REGR_SYY.text; }
    | T_REFLECT { $res = $T_REFLECT.text; }
    | T_DATE_FORMAT { $res = $T_DATE_FORMAT.text; }
    | T_CEIL { $res = $T_CEIL.text; }
    | T_CONV { $res = $T_CONV.text; }
    | T_BASE64 { $res = $T_BASE64.text; }
    | T_WEEKOFYEAR { $res = $T_WEEKOFYEAR.text; }
    | T_BIN { $res = $T_BIN.text; }
    | T_STAR { $res = $T_STAR.text; }
    | T_PLUS { $res = $T_PLUS.text; }
    | T_REGR_SXX { $res = $T_REGR_SXX.text; }
    | T_DEGREES { $res = $T_DEGREES.text; }
    | T_AES_DECRYPT { $res = $T_AES_DECRYPT.text; }
    | T_MAX { $res = $T_MAX.text; }
    | T_LOG2 { $res = $T_LOG2.text; }
    | T_CURRENT_DATABASE { $res = $T_CURRENT_DATABASE.text; }
    | T_JAVA_METHOD { $res = $T_JAVA_METHOD.text; }
    | T_HOUR { $res = $T_HOUR.text; }
    | T_STACK { $res = $T_STACK.text; }
    | T_LN { $res = $T_LN.text; }
    | T_CHARACTER_LENGTH { $res = $T_CHARACTER_LENGTH.text; }
    | T_ROUND { $res = $T_ROUND.text; }
    | T_RAND { $res = $T_RAND.text; }
    | T_COLLECT_LIST { $res = $T_COLLECT_LIST.text; }
    | T_REGEXP_REPLACE { $res = $T_REGEXP_REPLACE.text; }
    | T_POW { $res = $T_POW.text; }
    | T_SOUNDEX { $res = $T_SOUNDEX.text; }
    | T_IF { $res = $T_IF.text; }
    | T_SHIFTLEFT { $res = $T_SHIFTLEFT.text; }
    | T_UPPER { $res = $T_UPPER.text; }
    | T_BROUND { $res = $T_BROUND.text; }
    | T_ISNULL { $res = $T_ISNULL.text; }
    | T_COVAR_POP { $res = $T_COVAR_POP.text; }
    | T_HEX { $res = $T_HEX.text; }
    | T_PARENT { $res = $T_PARENT.text; }
    | T_WIDTH_BUCKET { $res = $T_WIDTH_BUCKET.text; }
    | T_REVERSE { $res = $T_REVERSE.text; }
    | T_SPACE { $res = $T_SPACE.text; }
    | T_BRACKET_OP { $res = $T_BRACKET_OP.text; }
    | T_RTRIM { $res = $T_RTRIM.text; }
    | T_LTRIM { $res = $T_LTRIM.text; }
    | T_TRIM { $res = $T_TRIM.text; }
    | T_FORMAT_NUMBER { $res = $T_FORMAT_NUMBER.text; }
    | T_NEXT_DAY { $res = $T_NEXT_DAY.text; }
    | T_VERSION { $res = $T_VERSION.text; }
    | T_BUILDVERSION { $res = $T_BUILDVERSION.text; }
    | T_MASK_FIRST_N { $res = $T_MASK_FIRST_N.text; }
    | T_PI { $res = $T_PI.text; }
    | T_COALESCE { $res = $T_COALESCE.text; }
    | T_STR_TO_MAP { $res = $T_STR_TO_MAP.text; }
    | T_REGR_SLOPE { $res = $T_REGR_SLOPE.text; }
    | T_REPEAT { $res = $T_REPEAT.text; }
    | T_JSON_TUPLE { $res = $T_JSON_TUPLE.text; }
    | T_MASK_LAST_N { $res = $T_MASK_LAST_N.text; }
    | T_SIGN { $res = $T_SIGN.text; }
    | T_PARSE_URL_TUPLE { $res = $T_PARSE_URL_TUPLE.text; }
    | T_IN_FILE { $res = $T_IN_FILE.text; }
    | T_SUM { $res = $T_SUM.text; }
    | T_CORR { $res = $T_CORR.text; }
    | T_REGR_SXY { $res = $T_REGR_SXY.text; }
    | T_GREATEST { $res = $T_GREATEST.text; }
    | T_COVAR_SAMP { $res = $T_COVAR_SAMP.text; }
    | T_LOGGED_IN_USER { $res = $T_LOGGED_IN_USER.text; }
    | T_PRINTF { $res = $T_PRINTF.text; }
    | T_FLOOR { $res = $T_FLOOR.text; }
    | T_POSEXPLODE { $res = $T_POSEXPLODE.text; }
    | T_DATE_ADD { $res = $T_DATE_ADD.text; }
    | T_POWER { $res = $T_POWER.text; }
    | T_CEILING { $res = $T_CEILING.text; }
    | T_VAR_POP { $res = $T_VAR_POP.text; }
    | T_XPATH { $res = $T_XPATH.text; }
    | T_XPATH_BOOLEAN { $res = $T_XPATH_BOOLEAN.text; }
    | T_XPATH_DOUBLE { $res = $T_XPATH_DOUBLE.text; }
    | T_XPATH_FLOAT { $res = $T_XPATH_FLOAT.text; }
    | T_XPATH_INT { $res = $T_XPATH_INT.text; }
    | T_XPATH_LONG { $res = $T_XPATH_LONG.text; }
    | T_XPATH_NUMBER { $res = $T_XPATH_NUMBER.text; }
    | T_XPATH_SHORT { $res = $T_XPATH_SHORT.text; }
    | T_XPATH_STRING { $res = $T_XPATH_STRING.text; }
    | T_SHA { $res = $T_SHA.text; }
    | T_UCASE { $res = $T_UCASE.text; }
    | T_SUBSTRING { $res = $T_SUBSTRING.text; }
    | T_LCASE { $res = $T_LCASE.text; }
    | T_FIELD_IN_SET { $res = $T_FIELD_IN_SET.text; }
    | T_GET_JSON_OBJECTS { $res = $T_GET_JSON_OBJECTS.text; }
    | T_IN_STR { $res = $T_IN_STR.text; }
    | T_RANK { $res = $T_RANK.text; }
    | T_DENSE_RANK { $res = $T_DENSE_RANK.text; }
    | T_ROW_NUMBER { $res = $T_ROW_NUMBER.text; }
    | T_CUME_DIST { $res = $T_CUME_DIST.text; }
    | T_PERCENT_RANK { $res = $T_PERCENT_RANK.text; }
    | T_LAG { $res = $T_LAG.text; }
    | T_LEAD { $res = $T_LEAD.text; }
    ;


NULL_CONST
    : T_NULL
    ;

BOOL_LITERAL
    : T_TRUE
    | T_FALSE
    ;

T_ALL : A L L;
T_ALTER : A L T E R;
T_AND : A N D;
T_ARRAY : A R R A Y;
T_AS : A S;
T_AUTHORIZATION : A U T H O R I Z A T I O N;
T_BETWEEN : B E T W E E N;
T_BIGINT : B I G I N T;
T_BINARY : B I N A R Y;
T_BOOLEAN : B O O L E A N;
T_BOTH : B O T H;
T_BY : B Y;
T_CASE : C A S E;
T_CAST : C A S T;
T_CHAR : C H A R;
T_COLUMN : C O L U M N;
T_CONF : C O N F;
T_CREATE : C R E A T E;
T_CROSS : C R O S S;
T_CUBE : C U B E;
T_CURRENT : C U R R E N T;
T_CURRENT_DATE : C U R R E N T '_' D A T E;
T_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P;
T_CURSOR : C U R S O R;
T_DATABASE : D A T A B A S E;
T_DATE : D A T E;
T_DECIMAL : D E C I M A L;
T_DELETE : D E L E T E;
T_DESCRIBE : D E S C R I B E;
T_DISTINCT : D I S T I N C T;
T_DOUBLE : D O U B L E;
T_DROP : D R O P;
T_ELSE : E L S E;
T_END : E N D;
T_EXCHANGE : E X C H A N G E;
T_EXISTS : E X I S T S;
T_EXTENDED : E X T E N D E D;
T_EXTERNAL : E X T E R N A L;
T_FALSE : F A L S E;
T_FETCH : F E T C H;
T_FLOAT : F L O A T;
T_FOLLOWING : F O L L O W I N G;
T_FOR : F O R;
T_FROM : F R O M;
T_FULL : F U L L;
T_FUNCTION : F U N C T I O N;
T_GRANT : G R A N T;
T_GROUP : G R O U P;
T_GROUPING : G R O U P I N G;
T_HAVING : H A V I N G;
T_IF : I F;
T_IMPORT : I M P O R T;
T_IN : I N;
T_INNER : I N N E R;
T_INSERT : I N S E R T;
T_INT : I N T;
T_INTERSECT : I N T E R S E C T;
T_INTERVAL : I N T E R V A L;
T_INTO : I N T O;
T_IS : I S;
T_JOIN : J O I N;
T_LATERAL : L A T E R A L;
T_LEFT : L E F T;
T_LESS_W : L E S S;
T_LIKE : L I K E;
T_LOCAL : L O C A L;
T_MACRO : M A C R O;
T_MAP : M A P;
T_MORE : M O R E;
T_NONE : N O N E;
T_NOT : N O T;
T_NULL : N U L L;
T_OF : O F;
T_ON : O N;
T_OR : O R;
T_ORDER : O R D E R;
T_OUT : O U T;
T_OUTER : O U T E R;
T_OVER : O V E R;
T_PARTIALSCAN : P A R T I A L S C A N;
T_PARTITION : P A R T I T I O N;
T_PERCENT : P E R C E N T;
T_PRECEDING : P R E C E D I N G;
T_PRESERVE : P R E S E R V E;
T_PROCEDURE : P R O C E D U R E;
T_RANGE : R A N G E;
T_READS : R E A D S;
T_REDUCE : R E D U C E;
T_REVOKE : R E V O K E;
T_RIGHT : R I G H T;
T_ROLLUP : R O L L U P;
T_ROW : R O W;
T_ROWS : R O W S;
T_SELECT : S E L E C T;
T_SET : S E T;
T_SMALLINT : S M A L L I N T;
T_TABLE : T A B L E;
T_TABLESAMPLE : T A B L E S A M P L E;
T_THEN : T H E N;
T_TIMESTAMP : T I M E S T A M P;
T_TO : T O;
T_TRANSFORM : T R A N S F O R M;
T_TRIGGER : T R I G G E R;
T_TRUE : T R U E;
T_TRUNCATE : T R U N C A T E;
T_UNBOUNDED : U N B O U N D E D;
T_UNION : U N I O N;
T_UNIQUEJOIN : U N I Q U E J O I N;
T_UPDATE : U P D A T E;
T_USER : U S E R;
T_USING : U S I N G;
T_UTC_TMESTAMP : U T C '_' T M E S T A M P;
T_VALUES : V A L U E S;
T_VARCHAR : V A R C H A R;
T_WHEN : W H E N;
T_WHERE : W H E R E;
T_WINDOW : W I N D O W;
T_WITH : W I T H;
T_COMMIT : C O M M I T;
T_ONLY : O N L Y;
T_REGEXP : R E G E X P;
T_RLIKE : R L I K E;
T_ROLLBACK : R O L L B A C K;
T_START : S T A R T;
T_CACHE : C A C H E;
T_CONSTRAINT : C O N S T R A I N T;
T_FOREIGN : F O R E I G N;
T_PRIMARY : P R I M A R Y;
T_REFERENCES : R E F E R E N C E S;
T_DAYOFWEEK : D A Y O F W E E K;
T_EXTRACT : E X T R A C T;
T_FLOOR : F L O O R;
T_INTEGER : I N T E G E R;
T_PRECISION : P R E C I S I O N;
T_VIEWS : V I E W S;
T_TIME : T I M E;
T_NUMERIC : N U M E R I C;
T_SYNC : S Y N C;
T_ADD_W : A D D;
T_ADMIN : A D M I N;
T_AFTER : A F T E R;
T_ANALYZE : A N A L Y Z E;
T_ARCHIVE : A R C H I V E;
T_ASC : A S C;
T_AUTOCOMMIT : A U T O C O M M I T;
T_BEFORE : B E F O R E;
T_BUCKET : B U C K E T;
T_BUCKETS : B U C K E T S;
T_CASCADE : C A S C A D E;
T_CHANGE : C H A N G E;
T_CLUSTER : C L U S T E R;
T_CLUSTERED : C L U S T E R E D;
T_CLUSTERSTATUS : C L U S T E R S T A T U S;
T_COLLECTION : C O L L E C T I O N;
T_COLUMNS : C O L U M N S;
T_COMMENT : C O M M E N T;
T_COMPACT : C O M P A C T;
T_COMPACTIONS : C O M P A C T I O N S;
T_COMPUTE : C O M P U T E;
T_CONCATENATE : C O N C A T E N A T E;
T_CONTINUE : C O N T I N U E;
T_DATA : D A T A;
T_DATABASES : D A T A B A S E S;
T_DATETIME : D A T E T I M E;
T_DAY : D A Y;
T_DBPROPERTIES : D B P R O P E R T I E S;
T_DEFERRED : D E F E R R E D;
T_DEFINED : D E F I N E D;
T_DELIMITED : D E L I M I T E D;
T_DEPENDENCY : D E P E N D E N C Y;
T_DESC : D E S C;
T_DIRECTORIES : D I R E C T O R I E S;
T_DIRECTORY : D I R E C T O R Y;
T_DISABLE : D I S A B L E;
T_DISTRIBUTE : D I S T R I B U T E;
T_ELEM_TYPE : E L E M '_' T Y P E;
T_ENABLE : E N A B L E;
T_ESCAPED : E S C A P E D;
T_EXCLUSIVE : E X C L U S I V E;
T_EXPLAIN : E X P L A I N;
T_EXPORT : E X P O R T;
T_FIELDS : F I E L D S;
T_FILE : F I L E;
T_FILEFORMAT : F I L E F O R M A T;
T_FIRST : F I R S T;
T_FORMAT : F O R M A T;
T_FORMATTED : F O R M A T T E D;
T_FUNCTIONS : F U N C T I O N S;
T_HOLD_DDLTIME : H O L D '_' D D L T I M E;
T_HOUR : H O U R;
T_IDXPROPERTIES : I D X P R O P E R T I E S;
T_IGNORE : I G N O R E;
T_INDEX : I N D E X;
T_INDEXES : I N D E X E S;
T_INPATH : I N P A T H;
T_INPUTDRIVER : I N P U T D R I V E R;
T_INPUTFORMAT : I N P U T F O R M A T;
T_ITEMS : I T E M S;
T_JAR : J A R;
T_KEYS : K E Y S;
T_KEY_TYPE : K E Y '_' T Y P E;
T_LIMIT : L I M I T;
T_LINES : L I N E S;
T_LOAD : L O A D;
T_LOCATION : L O C A T I O N;
T_LOCK : L O C K;
T_LOCKS : L O C K S;
T_LOGICAL : L O G I C A L;
T_LONG : L O N G;
T_MAPJOIN : M A P J O I N;
T_MATERIALIZED : M A T E R I A L I Z E D;
T_METADATA : M E T A D A T A;
T_MINUS : M I N U S;
T_MINUTE : M I N U T E;
T_MONTH : M O N T H;
T_MSCK : M S C K;
T_NOSCAN : N O S C A N;
T_NO_DROP : N O '_' D R O P;
T_OFFLINE : O F F L I N E;
T_OPTION : O P T I O N;
T_OUTPUTDRIVER : O U T P U T D R I V E R;
T_OUTPUTFORMAT : O U T P U T F O R M A T;
T_OVERWRITE : O V E R W R I T E;
T_OWNER : O W N E R;
T_PARTITIONED : P A R T I T I O N E D;
T_PARTITIONS : P A R T I T I O N S;
T_PLUS : P L U S;
T_PRETTY : P R E T T Y;
T_PRINCIPALS : P R I N C I P A L S;
T_PROTECTION : P R O T E C T I O N;
T_PURGE : P U R G E;
T_READ : R E A D;
T_READONLY : R E A D O N L Y;
T_REBUILD : R E B U I L D;
T_RECORDREADER : R E C O R D R E A D E R;
T_RECORDWRITER : R E C O R D W R I T E R;
T_RELOAD : R E L O A D;
T_RENAME : R E N A M E;
T_REPAIR : R E P A I R;
T_REPLACE : R E P L A C E;
T_REPLICATION : R E P L I C A T I O N;
T_RESTRICT : R E S T R I C T;
T_REWRITE : R E W R I T E;
T_ROLE : R O L E;
T_ROLES : R O L E S;
T_SCHEMA : S C H E M A;
T_SCHEMAS : S C H E M A S;
T_SECOND : S E C O N D;
T_SEMI : S E M I;
T_SERDE : S E R D E;
T_SERDEPROPERTIES : S E R D E P R O P E R T I E S;
T_SERVER : S E R V E R;
T_SETS : S E T S;
T_SHARED : S H A R E D;
T_SHOW : S H O W;
T_SHOW_DATABASE : S H O W '_' D A T A B A S E;
T_SKEWED : S K E W E D;
T_SORT : S O R T;
T_SORTED : S O R T E D;
T_SSL : S S L;
T_STATISTICS : S T A T I S T I C S;
T_STORED : S T O R E D;
T_STREAMTABLE : S T R E A M T A B L E;
T_STRING : S T R I N G;
T_STRUCT : S T R U C T;
T_TABLES : T A B L E S;
T_TBLPROPERTIES : T B L P R O P E R T I E S;
T_TEMPORARY : T E M P O R A R Y;
T_TERMINATED : T E R M I N A T E D;
T_TINYINT : T I N Y I N T;
T_TOUCH : T O U C H;
T_TRANSACTIONS : T R A N S A C T I O N S;
T_UNARCHIVE : U N A R C H I V E;
T_UNDO : U N D O;
T_UNIONTYPE : U N I O N T Y P E;
T_UNLOCK : U N L O C K;
T_UNSET : U N S E T;
T_UNSIGNED : U N S I G N E D;
T_URI : U R I;
T_USE : U S E;
T_UTC : U T C;
T_UTCTIMESTAMP : U T C T I M E S T A M P;
T_VALUE_TYPE : V A L U E '_' T Y P E;
T_VIEW : V I E W;
T_WHILE : W H I L E;
T_YEAR : Y E A R;
T_ISOLATION : I S O L A T I O N;
T_LEVEL : L E V E L;
T_OFFSET : O F F S E T;
T_SNAPSHOT : S N A P S H O T;
T_TRANSACTION : T R A N S A C T I O N;
T_WORK : W O R K;
T_WRITE : W R I T E;
T_ABORT : A B O R T;
T_KEY : K E Y;
T_LAST : L A S T;
T_NORELY : N O R E L Y;
T_NOVALIDATE : N O V A L I D A T E;
T_NULLS : N U L L S;
T_RELY : R E L Y;
T_VALIDATE : V A L I D A T E;
T_DETAIL : D E T A I L;
T_DOW : D O W;
T_EXPRESSION : E X P R E S S I O N;
T_OPERATOR : O P E R A T O R;
T_QUARTER : Q U A R T E R;
T_SUMMARY : S U M M A R Y;
T_VECTORIZATION : V E C T O R I Z A T I O N;
T_WEEK : W E E K;
T_YEARS : Y E A R S;
T_MONTHS : M O N T H S;
T_WEEKS : W E E K S;
T_DAYS : D A Y S;
T_HOURS : H O U R S;
T_MINUTES : M I N U T E S;
T_SECONDS : S E C O N D S;
T_TIMESTAMPTZ : T I M E S T A M P T Z;
T_ZONE : Z O N E;
T_COVAR_POP: C O V A R '_' P O P;
T_BROUND: B R O U N D;
T_CURRENT_USER: C U R R E N T '_' U S E R;
T_LPAD: L P A D;
T_UNHEX: U N H E X;
T_PI: P I;
T_STAR: S T A R;
T_REGEXP_REPLACE: R E G E X P '_' R E P L A C E;
T_ASCII: A S C I I;
T_GET_JSON_OBJECT: G E T '_' J S O N '_' O B J E C T;
T_COS: C O S;
T_REGR_SXX: R E G R '_' S X X;
T_WIDTH_BUCKET: W I D T H '_' B U C K E T;
T_REPEAT: R E P E A T;
T_ASIN: A S I N;
T_NULLIF: N U L L I F;
T_CONTEXT_NGRAMS: C O N T E X T '_' N G R A M S;
T_MASK_HASH: M A S K '_' H A S H;
T_PARENT: P A R E N T;
T_STR_TO_MAP: S T R '_' T O '_' M A P;
T_SIN: S I N;
T_UNBASE64: U N B A S E '6' '4';
T_COUNT: C O U N T;
T_IN_FILE: I N '_' F I L E;
T_CONV: C O N V;
T_SIGN: S I G N;
T_REGR_COUNT: R E G R '_' C O U N T;
T_SQRT: S Q R T;
T_REGR_INTERCEPT: R E G R '_' I N T E R C E P T;
T_UNIX_TIMESTAMP: U N I X '_' T I M E S T A M P;
T_MASK_LAST_N: M A S K '_' L A S T '_' N;
T_AES_ENCRYPT: A E S '_' E N C R Y P T;
T_MASK_FIRST_N: M A S K '_' F I R S T '_' N;
T_REVERSE: R E V E R S E;
T_NEXT_DAY: N E X T '_' D A Y;
T_HISTOGRAM_NUMERIC: H I S T O G R A M '_' N U M E R I C;
T_TRUNC: T R U N C;
T_SHIFTRIGHT: S H I F T R I G H T;
T_ADD_MONTHS: A D D '_' M O N T H S;
T_MAX: M A X;
T_DATE_SUB: D A T E '_' S U B;
T_UNARY: U N A R Y;
T_LN: L N;
T_OCTET_LENGTH: O C T E T '_' L E N G T H;
T_EXP: E X P;
T_FIELD: F I E L D;
T_NTILE: N T I L E;
T_COLLECT_LIST: C O L L E C T '_' L I S T;
T_RTRIM: R T R I M;
T_LTRIM: L T R I M;
T_REFLECT: R E F L E C T;
T_SHA2: S H A '2';
T_PRINTF: P R I N T F;
T_CEIL: C E I L;
T_CEILING : C E I L I N G ;
T_CONCAT: C O N C A T;
T_NVL: N V L;
T_MD5: M D '5';
T_ISNULL: I S N U L L;
T_ISNOTNULL : I S N O T N U L L ;
T_PARSE_URL: P A R S E '_' U R L;
T_CBRT: C B R T;
T_VARIANCE: V A R I A N C E;
T_VAR_POP: V A R '_' P O P ;
T_DEGREES: D E G R E E S;
T_RADIANS: R A D I A N S;
T_LEAST: L E A S T;
T_BUILDVERSION: B U I L D V E R S I O N;
T_SUBSTR: S U B S T R;
T_SUBSTRING: S U B S T R I N G;
T_SIZE: S I Z E;
T_POSITIVE: P O S I T I V E;
T_FROM_UNIXTIME: F R O M '_' U N I X T I M E;
T_CHR: C H R;
T_PERCENTILE_APPROX: P E R C E N T I L E '_' A P P R O X;
T_ASSERT_TRUE: A S S E R T '_' T R U E;
T_MONTHS_BETWEEN: M O N T H S '_' B E T W E E N;
T_INITCAP: I N I T C A P;
T_ACOS: A C O S;
T_WEEKOFYEAR: W E E K O F Y E A R;
T_LAST_DAY: L A S T '_' D A Y;
T_CHARACTER_LENGTH: C H A R A C T E R '_' L E N G T H;
T_SUBSTRING_INDEX: S U B S T R I N G '_' I N D E X;
T_TRANSLATE: T R A N S L A T E;
T_LEVENSHTEIN: L E V E N S H T E I N;
T_COVAR_SAMP: C O V A R '_' S A M P;
T_DATEDIFF: D A T E D I F F;
T_LOG: L O G;
T_NGRAMS: N G R A M S;
T_LENGTH: L E N G T H;
T_REGR_AVGX: R E G R '_' A V G X;
T_FIND_IN_SET: F I N D '_' I N '_' S E T;
T_XOR: X O R;
T_NEGATIVE: N E G A T I V E;
T_DATE_ADD: D A T E '_' A D D;
T_PARSE_URL_TUPLE: P A R S E '_' U R L '_' T U P L E;
T_CONCAT_WS: C O N C A T '_' W S;
T_ELT: E L T;
T_LOGGED_IN_USER: L O G G E D '_' I N '_' U S E R;
T_MAP_VALUES: M A P '_' V A L U E S;
T_JAVA_METHOD: J A V A '_' M E T H O D;
T_MAP_KEYS: M A P '_' K E Y S;
T_CORR: C O R R;
T_SORT_ARRAY: S O R T '_' A R R A Y;
T_SHIFTRIGHTUNSIGNED: S H I F T R I G H T U N S I G N E D;
T_AES_DECRYPT: A E S '_' D E C R Y P T;
T_SHA1: S H A '1';
T_SHA: S H A ;
T_AVG: A V G;
T_CURRENT_DATABASE: C U R R E N T '_' D A T A B A S E;
T_ARRAY_CONTAINS: A R R A Y '_' C O N T A I N S;
T_FROM_UTC_TIMESTAMP: F R O M '_' U T C '_' T I M E S T A M P;
T_DECODE: D E C O D E;
T_ABS: A B S;
T_EXPLODE: E X P L O D E;
T_E: E;
T_SUM: S U M;
T_COALESCE: C O A L E S C E;
T_LOWER: L O W E R;
T_LCASE: L C A S E ;
T_ENCODE: E N C O D E;
T_VAR_SAMP: V A R '_' S A M P;
T_INLINE: I N L I N E;
T_SPACE: S P A C E;
T_HASH: H A S H;
T_ROUND: R O U N D;
T_SPLIT: S P L I T;
T_BASE64: B A S E '6' '4';
T_TO_UTC_TIMESTAMP: T O '_' U T C '_' T I M E S T A M P;
T_REGEXP_EXTRACT: R E G E X P '_' E X T R A C T;
T_CRC32: C R C '3' '2';
T_HEX: H E X;
T_REGR_SYY: R E G R '_' S Y Y;
T_UPPER: U P P E R;
T_UCASE: U C A S E ;
T_STDDEV_POP: S T D D E V '_' P O P;
T_DATE_FORMAT: D A T E '_' F O R M A T;
T_REGR_R2: R E G R '_' R '2';
T_ATAN: A T A N;
T_MIN: M I N;
T_POSEXPLODE: P O S E X P L O D E;
T_BRACKET_OP: B R A C K E T '_' O P;
T_PMOD: P M O D;
T_POW: P O W;
T_LAG : L A G ;
T_LEAD : L E A D ;
T_POWER: P O W E R ;
T_SENTENCES: S E N T E N C E S;
T_MASK_SHOW_FIRST_N: M A S K '_' S H O W '_' F I R S T '_' N;
T_SOUNDEX: S O U N D E X;
T_SURROGATE_KEY: S U R R O G A T E '_' K E Y;
T_SHIFTLEFT: S H I F T L E F T;
T_PERCENTILE: P E R C E N T I L E;
T_TO_DATE: T O '_' D A T E;
T_REGR_AVGY: R E G R '_' A V G Y;
T_RPAD: R P A D;
T_FACTORIAL: F A C T O R I A L;
T_COLLECT_SET: C O L L E C T '_' S E T;
T_EQUAL_W: E Q U A L;
T_BEGINNING: B E G I N N I N G;
T_VERSION: V E R S I O N;
T_STACK: S T A C K;
T_BIN: B I N;
T_TAN: T A N;
T_TRIM: T R I M;
T_REGR_SLOPE: R E G R '_' S L O P E;
T_MASK: M A S K;
T_MASK_SHOW_LAST_N: M A S K '_' S H O W '_' L A S T '_' N;
T_INSTR: I N S T R;
T_GREATEST: G R E A T E S T;
T_REGR_SXY: R E G R '_' S X Y;
T_FORMAT_NUMBER: F O R M A T '_' N U M B E R;
T_LOCATE: L O C A T E;
T_STDDEV_SAMP: S T D D E V '_' S A M P;
T_RAND: R A N D;
T_LOG2: L O G '2';
T_LOG10: L O G '1' '0';
T_JSON_TUPLE: J S O N '_' T U P L E;
T_QUOTE: Q U O T E;
T_SYSDATE: S Y S D A T E;
T_XPATH: X P A T H ;
T_XPATH_BOOLEAN: X P A T H '_' B O O L E A N ;
T_XPATH_DOUBLE: X P A T H '_' D O U B L E;
T_XPATH_FLOAT: X P A T H '_' F L O A T;
T_XPATH_INT: X P A T H '_' I N T;
T_XPATH_LONG: X P A T H '_' L O N G;
T_XPATH_NUMBER: X P A T H '_' N U M B E R;
T_XPATH_SHORT: X P A T H '_' S H O R T;
T_XPATH_STRING: X P A T H '_' S T R I N G;
T_FIELD_IN_SET : F I E L D '_' I N '_' S E T ;
T_GET_JSON_OBJECTS : G E T '_' J S O N '_' O B J E C T S;
T_IN_STR : I N '_' S T R ;
T_NAMED_STRUCT : N A M E D '_' S T R U C T ;
T_RANK : R A N K;
T_DENSE_RANK : D E N S E '_' R A N K ;
T_ROW_NUMBER : R O W '_' N U M B E R ;
T_CUME_DIST : C U M E '_' D I S T ;
T_PERCENT_RANK : P E R C E N T '_' R A N K ;
T_UNIQUE : U N I Q U E ;
T_CHECK : C H E C K ;
T_DEFAULT : D E F A U L T;
T_SEQUENCEFILE : S E Q U E N C E F I L E ;
T_TEXTFILE : T E X T F I L E ;
T_RCFILE : R C F I L E ;
T_ORC : O R C ;
T_PARQUET : P A R Q U E T ;
T_AVRO : A V R O ;
T_JSONFILE : J S O N F I L E ;
T_HIVECONF : H I V E C O N F ;
T_HIVEVAR : H I V E V A R ;
T_BYTE : B Y T E ;
T_EXIT : E X I T ;


// T_ADD          : '+' ;
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
// T_SUB          : '-' ;

IDENTIFIER
    : '`' (~'`' | '``')* '`'
    | [a-zA-Z_] [a-zA-Z_0-9]*
    ;

INT_LITERAL
    : L_INT
    ;

DECIMAL_LITERAL 
    : L_DEC
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
L_S_COMMENT : ('--' | '//') ~('\r' | '\n')* -> channel(HIDDEN) ;       // Single line comment

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