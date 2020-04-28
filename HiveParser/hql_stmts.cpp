#include "hql_stmts.h"

json hql_select_stmt(vector<json> expr_list)
{
	json j;
	j["type"] = "SELECT_STMT";
	j["expr_list"] = expr_list;
	return j;
}

json hql_select_stmt(json expr)
{
	json j;
	j["type"] = "SELECT_STMT";
	vector<json> expr_list;
	expr_list.push_back(expr);
	j["expr_list"] = expr_list;
	return j;
}

json hql_stmt_list(vector<json> stmt_list)
{
	json j;
	j["stmt_list"] = stmt_list;
	return j;
}