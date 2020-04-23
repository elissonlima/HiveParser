#include "hql_exprs.h"

json hql_unary_operator(string op, json expr)
{
	json j;
	j["type"] = "UNARY_OPERATOR";
	j["operator"] = op;
	j["expr"] = expr;
	return j;
}

json hql_generic_operator(string op, json l_expr, json r_expr)
{
	json j;
	j["type"] = "EXPR_OPERATOR";
	j["operator"] = op;
	j["left_expr"] = l_expr;
	j["right_expr"] = r_expr;
	return j;
}