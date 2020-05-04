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