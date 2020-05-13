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
json hql_select_stmt(string all_disctinct_clause, vector<json> expr_list, json tab_reference, 
	json lateral_view_expr, json where_expr, vector<json> group_by_expr, json having_expr, 
	vector<json> order_by_expr,	json limit_clause);
json hql_select_stmt(string all_disctinct_clause, json expr);
json hql_select_limit_clause(string rows);
json hql_select_limit_clause(string rows, string offset);
json hql_stmt_list(vector<json> stmt_list);
json hql_stmt_table_ref(json tab_ref, string table_alias);
json hql_stmt_join_table(string join_type, json right_table_expr);
json hql_stmt_join_table(string join_type, json right_table_expr, json join_condition);
json hql_select_union_stmt(json base_select, vector<json> union_list);
json hql_stmt_create_table(string table_type, bool if_not_exists_flag, json table_identifier, vector<json> column_specs, 
							vector<json> constraints, string table_comment, vector<json> partitions_fields, 
							json clustered_by, json skewed_by, json row_format, json stored_as, 
						    string location, vector<json> table_properties, json select_stmt);
json hql_create_table_like(string table_type, bool if_not_exists_flag, json table_identifier, json table_like,
							string location);
json drop_table_stmt(bool opt_if_exists, json table_ident, bool opt_purge);