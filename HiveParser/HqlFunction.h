#pragma once

#include <string>
#include <sstream>
#include <algorithm>
#include <vector>
#include <cstdarg>

std::string aux_return_list(std::string arg, ...);
const std::vector<std::string> explode(const std::string& s, const char& c);
std::string hql_recur_list(std::string left_val, std::string right_val);
std::string hql_expr_name(std::string name);
//std::string hql_select_expr(std::string expr, std::string alias);
std::string hql_select_expr_list(std::string select_expr, std::string select_expr_list);
std::string hql_select_stmt(std::string select_expr_list, std::string table_name);
std::string hql_expr_atom(std::string type, std::string value);
std::string hql_expr_interval(std::string expr, std::string interval_item);
std::string hql_arithmetic_expr(std::string op, std::string l_expr, std::string r_expr);
std::string hql_subselect_expr(std::string select_stmt);
std::string hql_concat_expr(std::string val1, std::string val2);
std::string hql_concat_expr_result(std::string list_concat);
std::string hql_case_expr(std::string expr, std::string when_then_expr_list, std::string else_expr);
std::string hql_case_when_then_list(std::string when_expr, std::string then_expr, std::string recursive);
std::string hql_order_by_clause(std::string expr, std::string asc_desc, std::string recursive);
std::string hql_partition_by_list(std::string expr, std::string partition_list);
std::string hql_over_clause(std::string partition_by_list, std::string order_by_list);
std::string hql_agg_window_func(std::string function_name, std::string all_distinct, std::string expr, std::string over_expr);
std::string hql_lag_lead_func(std::string function_name, std::string expr_list, std::string over_expr);
std::string hql_dtype(std::string type_name, std::string size);
std::string hql_dtype_size(std::string size_1, std::string size_2);
std::string hql_simple_spec_func(std::string func_name);
std::string hql_cast_func(std::string expr, std::string dtype_expr);
std::string hql_current_timestamp(std::string expr);
std::string hql_trim_func(std::string expr);
std::string hql_substr_func(std::string expr, std::string from_expr, std::string for_expr);
std::string hql_generic_func(std::string func_name, std::string expr_list);
std::string hql_bool_expr_binary(std::string op, std::string left_expr, std::string right_expr);
std::string hql_bool_expr_multi_in(std::string expr_list, std::string op, std::string select_stmt);
std::string hql_bool_expr_single_in(std::string expr, std::string op, std::string comp_stmt);
std::string hql_bool_exists(std::string op, std::string select_stmt);
std::string hql_between(std::string expr, std::string left_expr, std::string right_expr);
std::string hql_is_null(std::string op, std::string expr);
std::string hql_bool_not_expr(std::string expr);
std::string hql_desc_table_stmt(std::string table_name);
std::string hql_delete_stmt(std::string table_name, std::string delete_alias, std::string where_clause);
std::string hql_select_option_item(std::string option_type, std::string expr);
std::string hql_from_table_values_clause(std::string from_table_values_row_list, std::string from_alias_clause);
std::string hql_from_table_name(std::string table_name, std::string table_alias);
std::string hql_from_subselect(std::string subselect, std::string table_alias);
std::string hql_join_expr(std::string join_type, std::string from_table_clause, std::string on_expr);
std::string hql_from_clause(std::string from_table_clause, std::string from_join_clause_list);
std::string hql_select_expr(std::string expr, std::string alias);
std::string hql_select_list(std::string select_list_set, std::string select_list_limit, std::string select_expr_list);
std::string hql_subselect_stmt(std::string select_list, std::string from_clause, std::string where_clause,
	 std::string group_by_clause, std::string having_qualify_clause, std::string order_by_clause, std::string select_options);
std::string hql_select_set_opt(std::string set_op_type, std::string fst_select_stmt, std::string snd_select_stmt);
std::string hql_create_table_option_item(std::string option_name, std::string option_expr);
std::string hql_create_table_option_item_val(std::string option_name, std::string option_expr);
std::string hql_create_table_fields_spec(std::string terminated, std::string escaped);