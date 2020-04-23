#pragma once

#include <cstdio>
#include <string>
#include "nlohmann/json.hpp"

using namespace std;
using json = nlohmann::json;

json hql_unary_operator(string op, json expr);
json hql_generic_operator(string op, json l_expr, json r_expr);