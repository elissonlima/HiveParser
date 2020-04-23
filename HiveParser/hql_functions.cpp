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