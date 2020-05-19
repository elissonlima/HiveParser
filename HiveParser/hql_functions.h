#pragma once

#include <cstdio>
#include <string>
#include "nlohmann/json.hpp"



using namespace std;
using json = nlohmann::json;

json hql_cast_func(json expr, string dtype);
json hql_count_func(json expr);
json hql_count_all_func();
json hql_fixed_func(string func_name);
json hql_single_param_func(string func_name, string param_name, json expr);
json hql_double_param_func(string func_name, string fst_param_name, json fst_expr, string snd_param_name, json snd_expr);
json hql_double_param_func(string func_name, string fst_param_name, bool fst_expr, string snd_param_name, json snd_expr);
json hql_three_param_func(string func_name, string fst_param_name, json fst_expr, string snd_param_name, json snd_expr, string thrd_param_name, json thrd_expr);
json hql_four_param_func(string func_name, string fst_param_name, json fst_expr, string snd_param_name, json snd_expr, string thrd_param_name, json thrd_expr, string fourth_param_name, json fourth_expr);
json hql_list_param_func(string func_name, string list_name, vector<json> expr_list);
json hql_case_func(json case_expr, vector<json> when_expr_list, vector<json> then_expr_list, json else_expr);
json hql_single_param_list_func(string func_name, string fst_param_name, json fst_param,
	string list_name, vector<json> expr_list);
json hql_single_param_list_func(string func_name, string fst_param_name, bool fst_param,
	string list_name, vector<json> expr_list);
json hql_double_param_list_func(string func_name, 
	string fst_param_name, json fst_param,
	string snd_param_name, json snd_param,
	string list_name, vector<json> expr_list);
std::string remove_quotes(std::string in);
std::string remove_backquotes(std::string in);