#include "hql_exprs.h"

json hql_unary_operator(string op, json expr)
{
	json j;
	j["type"] = "UNARY_OPERATOR";
	j["operator"] = op;
	j["expr"] = expr;
	return j;
}

json hql_math_operator(string op, json l_expr, json r_expr)
{
	json j;
	j["type"] = "MATH_OPERATOR";
	j["operator"] = op;
	j["left_expr"] = l_expr;
	j["right_expr"] = r_expr;
	return j;
}

json hql_bool_operator(string op, json l_expr, json r_expr)
{
	json j;
	j["type"] = "BOOL_OPERATOR";
	j["operator"] = op;
	j["left_expr"] = l_expr;
	j["right_expr"] = r_expr;
	return j;
}

json hql_between_expr(json expr, json start_interval, json end_interval, bool flag_not)
{
	json j;
	j["type"] = "BOOL_OPERATOR";
	if(flag_not)
		j["operator"] = "NOT_BETWEEN";
	else
		j["operator"] = "BETWEEN";
	j["expr"] = expr;
	j["start_interval"] = start_interval;
	j["end_interval"] = end_interval;
	return j;
}
json hql_set_operators_in(string in_not_op, json expr, vector<json> exprs)
{
	json j;
	j["type"] = "BOOL_OPERATOR";
	j["operator"] = in_not_op;
	j["expr"] = expr;
	j["expr_list"] = exprs;
	return j;
}

json hql_set_operators_in(string in_not_op, json expr, json select_expr)
{
	json j;
	j["type"] = "BOOL_OPERATOR";
	j["operator"] = in_not_op;
	j["expr"] = expr;
	j["select_expr"] = select_expr;
	return j;
}

json hql_select_expr(json expr)
{
	json j;
	j["type"] = "SELECT_EXPR";
	j["expr"] = expr;
	j["alias"] = "DEFAULT";
	return j;
}

json hql_select_expr(json expr, string alias)
{
	json j;
	j["type"] = "SELECT_EXPR";
	j["expr"] = expr;
	j["alias"] = alias;
	return j;
}

json hql_select_all_expr()
{
	json j;
	j["type"] = "SELECT_ALL_EXPR";
	j["reference"] = "DEFAULT";
	return j;
}

json hql_select_all_expr(json tab_ref)
{
	json j;
	j["type"] = "SELECT_ALL_EXPR";
	j["reference"] = tab_ref;
	return j;
}

json hql_over_clause_partition(json over_func, json partition_by_list)
{
	json j;
	j["type"] = "OVER_CLAUSE_EXPR";
	j["func"] = over_func;
	j["partition_by_list"] = partition_by_list;
	return j;
}

json hql_over_clause_order(json over_func, json order_by_list)
{
	json j;
	j["type"] = "OVER_CLAUSE_EXPR";
	j["func"] = over_func;
	j["order_by_list"] = order_by_list;
	return j;
}

json hql_over_clause_partition_order(json over_func, json partition_by_list, json order_by_list)
{
	json j;
	j["type"] = "OVER_CLAUSE_EXPR";
	j["func"] = over_func;
	j["partition_by_list"] = partition_by_list;
	j["order_by_list"] = order_by_list;
	return j;
}

json hql_lateral_view_expr(json udtf_expr, string table_alias, vector<string> column_alias)
{
	json j;
	j["type"] = "LATERAL_VIEW_EXPR";
	j["udtf_expr"] = udtf_expr;
	j["table_alias"] = table_alias;
	if (column_alias.size() == 1)
		j["column_alias"] = column_alias[0];
	else
		j["column_alias_list"] = column_alias;
	return j;
}

json hql_column_definition(string column_name, json data_type)
{
	json j;
	j["type"] = "COLUMN_DEFINITION";
	column_name.erase(std::remove(column_name.begin(), column_name.end(), '`'), column_name.end());
	j["column_name"] = column_name;
	j["data_type"] = data_type;
	return j;
}

json hql_column_definition(string column_name, json data_type, string column_comment)
{
	json j;
	j = hql_column_definition(column_name, data_type);
	column_comment.erase(std::remove(column_comment.begin(), column_comment.end(), '\''), column_comment.end());
	column_comment.erase(std::remove(column_comment.begin(), column_comment.end(), '"'), column_comment.end());
	j["column_comment"] = column_comment;
	return j;
}

json hql_column_definition(string column_name, json data_type, vector<json> constraint_list)
{
	json j;
	j = hql_column_definition(column_name, data_type);
	j["constraint_list"] = constraint_list;
	return j;
}

json hql_column_definition(string column_name, json data_type, vector<json> constraint_list, string column_comment)
{
	json j;
	j = hql_column_definition(column_name, data_type, column_comment);
	j["constraint_list"] = constraint_list;
	return j;
}

json hql_primary_key_constraint(vector<string> column_list, bool disabled, bool novalidate, string rely_norely)
{
	json j;
	j["type"] = "CONSTRAINT";
	j["name"] = "PRIMARY_KEY";
	if (column_list.size() > 1)
		j["column"] = column_list;
	else
		j["column"] = column_list[0];
	j["disabled"] = disabled;
	j["novalidate"] = novalidate;
	if (!rely_norely.empty())
		j["rely"] = rely_norely;
	return j;
}

json hql_foreign_key_constraint(vector<string> column_list, json table_ref, vector<string> reference_column_list, bool disabled, bool novalidate)
{
	json j;
	j["type"] = "CONSTRAINT";
	j["name"] = "FOREIGN_KEY";
	if (column_list.size() > 1)
		j["column"] = column_list;
	else
		j["column"] = column_list[0];
	j["reference_table"] = table_ref;
	if (reference_column_list.size() > 1)
		j["reference_column"] = reference_column_list;
	else
		j["reference_column"] = reference_column_list[0];
	j["disabled"] = disabled;
	j["novalidate"] = novalidate;
	return j;
}

json hql_unique_constraint(vector<string> column_list, bool disabled, bool novalidate, string rely_norely)
{
	json j;
	j["type"] = "CONSTRAINT";
	j["name"] = "UNIQUE";
	if (column_list.size() > 1)
		j["column"] = column_list;
	else
		j["column"] = column_list[0];
	j["disabled"] = disabled;
	j["novalidate"] = novalidate;
	if (!rely_norely.empty())
		j["rely"] = rely_norely;
	return j;
}

json hql_check_constraint(json expr, string enabled_disabled, bool novalidate, string rely_norely)
{
	json j;
	j["type"] = "CONSTRAINT";
	j["name"] = "CHECK";
	j["expr"] = expr;
	bool disabled = false;
	if (enabled_disabled == "DISABLE")
		disabled = true;
	j["disabled"] = disabled;
	j["novalidate"] = novalidate;
	if (!rely_norely.empty())
		j["rely"] = rely_norely;
	return j;
}

json hql_clustered_by_expr(vector<string> column_list, vector<json> sorted_by_list, string num_buckets)
{
	json j;
	j["type"] = "CREATE_TABLE_OPT";
	j["option_name"] = "CLUSTERED_BY";
	if (column_list.size() > 1)
		j["column"] = column_list;
	else
		j["column"] = column_list[0];
	if(sorted_by_list.size() > 1)
		j["sorted_by"] = column_list;
	else if(sorted_by_list.size() == 1)
		j["sorted_by"] = column_list[0];
	j["buckets_num"] = stoi(num_buckets);
	return j;
}

json hql_skewed_by_expr(vector<string> column_list, vector<json> on_exprs, bool stored_as_directory)
{
	json j;
	j["type"] = "CREATE_TABLE_OPT";
	j["option_name"] = "SKEWED_BY";
	if (column_list.size() > 1)
		j["column"] = column_list;
	else
		j["column"] = column_list[0];
	if (on_exprs.size() > 0)
		j["on_columns"] = on_exprs;
	j["stored_as_dir"] = stored_as_directory;
	return j;
}

json hql_row_format_delimited(string field_delimiter, string collection_delimiter, string map_keys_delimiter, string lines_delimiter, string null_def)
{
	json j;
	j["type"] = "CREATE_TABLE_OPT";
	j["option_name"] = "ROW_FORMAT";
	j["format_type"] = "DELIMITED";
	
	if (!field_delimiter.empty())
		j["field_delimiter"] = field_delimiter;
	if (!collection_delimiter.empty())
		j["collection_delimiter"] = collection_delimiter;
	if (!map_keys_delimiter.empty())
		j["map_keys_delimiter"] = map_keys_delimiter;
	if (!lines_delimiter.empty())
		j["lines_delimiter"] = lines_delimiter;
	if (!null_def.empty())
		j["null_defined_as"] = null_def;

	return j;
}

json hql_row_format_serde(string serde_name, vector<json> serde_option_list)
{
	json j;
	j["type"] = "CREATE_TABLE_OPT";
	j["option_name"] = "ROW_FORMAT";
	j["format_type"] = "SERDE";
	j["serde_name"] = serde_name;
	if(serde_option_list.size() > 0)
		j["serde_option_list"] = serde_option_list;
	return j;
}

json hql_stored_as_file_format(string file_format)
{
	json j;
	j["type"] = "CREATE_TABLE_OPT";
	j["option_name"] = "STORED_AS";
	j["file_format"] = file_format;
	return j;
}

json hql_stored_as_file_format(string input_format, string output_format)
{
	json j;
	j["type"] = "CREATE_TABLE_OPT";
	j["option_name"] = "STORED_AS";
	j["input_format"] = input_format;
	j["output_format"] = output_format;
	return j;
}

json hql_stored_by_serde(string serde_name, vector<json> serde_option_list)
{
	json j;
	j["type"] = "CREATE_TABLE_OPT";
	j["option_name"] = "STORED_AS";
	j["serde_name"] = serde_name;
	if (serde_option_list.size() > 0)
		j["serde_option_list"] = serde_option_list;
	return j;
}