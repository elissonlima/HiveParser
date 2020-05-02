#pragma once

#include <cstdio>
#include <string>
#include "nlohmann/json.hpp"
#include <vector>
#include "HiveParser.h"

using namespace std;
using json = nlohmann::json;

json hql_select_stmt(string all_disctinct_clause, vector<json> expr_list);
json hql_select_stmt(string all_disctinct_clause, vector<json> expr_list, json tab_reference);
json hql_select_stmt(string all_disctinct_clause, json expr);
json hql_stmt_list(vector<json> stmt_list);
json hql_stmt_table_ref(json tab_ref, string table_alias);
json hql_stmt_join_table(string join_type, json right_table_expr);
json hql_stmt_join_table(string join_type, json right_table_expr, json join_condition);
