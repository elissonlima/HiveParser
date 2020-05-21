#pragma once

#include <cstdio>
#include <string>
#include "nlohmann/json.hpp"

using namespace std;
using json = nlohmann::json;

json hql_unary_operator(string op, json expr);
json hql_math_operator(string op, json l_expr, json r_expr);
json hql_bool_operator(string op, json l_expr, json r_expr);
json hql_between_expr(json expr, json start_interval, json end_interval, bool flag_not);
json hql_set_operators_in(string in_not_op, json expr, vector<json> exprs);
json hql_set_operators_in(string in_not_op, json expr, json select_expr);
json hql_select_expr(json expr);
json hql_select_expr(json expr, string alias);
json hql_select_all_expr();
json hql_select_all_expr(json tab_ref);
json hql_over_clause_partition(json over_func, json partition_by_list);
json hql_over_clause_order(json over_func, json order_by_list);
json hql_over_clause_partition_order(json over_func, json partition_by_list, json order_by_list);
json hql_lateral_view_expr(json udtf_expr, string table_alias, vector<string> column_alias);
//CREATE TABLE
json hql_column_definition(string column_name, json data_type);
json hql_column_definition(string column_name, json data_type, string column_comment);
json hql_column_definition(string column_name, json data_type, vector<json> constraint_list, string column_comment);
json hql_column_definition(string column_name, json data_type, vector<json> constraint_list);
json hql_primary_key_constraint(vector<string> column_list, bool disabled, bool novalidate, string rely_norely);
json hql_foreign_key_constraint(vector<string> column_list, json table_ref, vector<string> reference_column_list, 
		bool disabled, bool novalidate);
json hql_unique_constraint(vector<string> column_list, bool disabled, bool novalidate, string rely_norely);
json hql_check_constraint(json expr, string enabled_disabled, bool novalidate, string rely_norely);
json hql_clustered_by_expr(vector<string> column_list, vector<json> sorted_by_list, string num_buckets);
json hql_skewed_by_expr(vector<string> column_list, vector<json> on_exprs, bool stored_as_directory);
json hql_row_format_delimited(string field_delimiter, string collection_delimiter, string map_keys_delimiter, string lines_delimiter, string null_def);
json hql_row_format_serde(string serde_name, vector<json> serde_option_list);
json hql_stored_as_file_format(string file_format);
json hql_stored_as_file_format(string input_format, string output_format);
json hql_stored_by_serde(string serde_name, vector<json> serde_option_list);
