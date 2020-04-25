#include "hql_functions.h"

json hql_cast_func(json expr, string dtype)
{
	json j;
	j["type"] = "FUNCTION";
	j["name"] = "CAST";
	j["expr"] = expr;
	j["data_type"] = dtype;
	return j;
}

json hql_count_func(json expr)
{
	json j;
	j["type"] = "FUNCTION";
	j["name"] = "COUNT";
	j["expr"] = expr;
	return j;
}

json hql_count_all_func()
{
	json j;
	j["type"] = "FUNCTION";
	j["name"] = "COUNT";
	j["expr"] = "ALL";
	return j;
}

json hql_fixed_func(string func_name)
{
	json j;
	j["type"] = "FUNCTION";
	j["name"] = func_name;
	return j;
}

json hql_single_param_func(string func_name, string param_name, json expr)
{
	json j;
	j["type"] = "FUNCTION";
	j["name"] = func_name;
	j[param_name] = expr;
	return j;
}

json hql_double_param_func(string func_name, string fst_param_name, json fst_expr, string snd_param_name, json snd_expr)
{
	json j;
	j["type"] = "FUNCTION";
	j["name"] = func_name;
	j[fst_param_name] = fst_expr;
	j[snd_param_name] = snd_expr;
	return j;
}

json hql_three_param_func(string func_name, string fst_param_name, json fst_expr, string snd_param_name, json snd_expr, string thrd_param_name, json thrd_expr)
{
	json j;
	j["type"] = "FUNCTION";
	j["name"] = func_name;
	j[fst_param_name] = fst_expr;
	j[snd_param_name] = snd_expr;
	j[thrd_param_name] = thrd_expr;
	return j;
}

json hql_list_param_func(string func_name, string list_name, vector<json> expr_list)
{
	json j;
	j["type"] = "FUNCTION";
	j["name"] = func_name;
	j[list_name] = expr_list;
	return j;
}

json hql_single_param_list_func(string func_name, string fst_param_name, json fst_param,
	string list_name, vector<json> expr_list)
{
	json j;
	j["type"] = "FUNCTION";
	j["name"] = func_name;
	j[fst_param_name] = fst_param;
	j[list_name] = expr_list;
	return j;
}

json hql_case_func(json case_expr, vector<json> when_expr_list, vector<json> then_expr_list, json else_expr)
{
	json j;
	j["type"] = "FUNCTION";
	j["name"] = "CASE";
	vector<json> when_then_expr_list;
	for (int i = 0; i < when_expr_list.size(); i++)
	{
		json when_then_expr;
		when_then_expr["when"] = when_expr_list[i];
		when_then_expr["then"] = then_expr_list[i];
		when_then_expr_list.push_back(when_then_expr);
	}
	if (case_expr != NULL)
		j["case_expr"] = case_expr;
	if (else_expr != NULL)
		j["else_expr"] = else_expr;
	j["when_then_expr_list"] = when_then_expr_list;
	return j;
}