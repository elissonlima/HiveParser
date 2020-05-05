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