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
	if (all_disctinct_clause == "ALL")
		j["type"] = "SELECT_STMT";
	else if (all_disctinct_clause == "DISTINCT")
		j["type"] = "SELECT_DISTINCT_STMT";
	vector<json> expr_list;
	expr_list.push_back(expr);
	j["expr_list"] = expr_list;
	return j;
}

json hql_select_stmt(string all_disctinct_clause, vector<json> expr_list, json tab_reference)
{
	json j;
	if (all_disctinct_clause == "ALL")
		j["type"] = "SELECT_STMT";
	else if (all_disctinct_clause == "DISTINCT")
		j["type"] = "SELECT_DISTINCT_STMT";
	j["expr_list"] = expr_list;
	j["tab_reference"] = tab_reference;
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
	j["type"] = "JOIN_TABLE";
	j["join_type"] = join_type;	
	j["right_table"] = right_table_expr;
	j["join_condition"] = join_condition;
	return j;
}

