#include "hql_stmts.h"

json hql_select_stmt(string all_disctinct_clause, vector<json> expr_list)
{
	json j;
	if(all_disctinct_clause == "ALL")
		j["type"] = "SELECT_STMT";
	else if(all_disctinct_clause == "DISTINCT")
		j["type"] = "SELECT_DISTINCT_STMT";
	j["expr_list"] = expr_list;
	return j;
}

json hql_select_stmt(string all_disctinct_clause, json expr)
{
	json j;
	vector<json> expr_list;
	expr_list.push_back(expr);
	j = hql_select_stmt(all_disctinct_clause, expr_list);
	return j;
}

json hql_select_stmt(string all_disctinct_clause, vector<json> expr_list, json tab_reference)
{
	json j;
	j = hql_select_stmt(all_disctinct_clause, expr_list);
	j["tab_reference"] = tab_reference;
	return j;
}
json hql_select_stmt(string all_disctinct_clause, vector<json> expr_list, json tab_reference,
	json lateral_view_expr, json where_expr, vector<json> group_by_expr, json having_expr,
	vector<json> order_by_expr, json limit_clause)
{
	json j;
	j = hql_select_stmt(all_disctinct_clause, expr_list, tab_reference);
	if (!lateral_view_expr.empty())
		j["lateral_view_expr"] = lateral_view_expr;
	if(!where_expr.empty())
		j["where_expr"] = where_expr;
	if (!group_by_expr.empty())
		j["group_by_expr_list"] = group_by_expr;
	if (!having_expr.empty())
		j["having_expr"] = having_expr;
	if (!order_by_expr.empty())
		j["order_by_expr_list"] = order_by_expr;
	if (!limit_clause.empty())
		j["limit"] = limit_clause;
	return j;
}

json hql_select_limit_clause(string rows)
{
	json j;
	j["offset"] = 0;
	j["rows"] = stoi(rows);
	return j;
}

json hql_select_limit_clause(string rows, string offset)
{
	json j;
	j["rows"] = stoi(rows);
	j["offset"] = stoi(offset);
	return j;
}

json hql_stmt_list(vector<json> stmt_list)
{
	json j;
	j["stmt_list"] = stmt_list;
	return j;
}

json hql_stmt_table_ref(json tab_ref, string table_alias)
{
	json j;
	j["type"] = "TABLE_REFERENCE";
	j["table"] = tab_ref;
	j["alias"] = table_alias;
	return j;
}

json hql_stmt_join_table(string join_type, json right_table_expr)
{
	json j;
	j["type"] = "JOIN_TABLE";
	j["join_type"] = join_type;
	j["right_table"] = right_table_expr;
	return j;
}

json hql_stmt_join_table(string join_type, json right_table_expr, json join_condition)
{
	json j;
	j = hql_stmt_join_table(join_type, right_table_expr);
	j["join_condition"] = join_condition;
	return j;
}

