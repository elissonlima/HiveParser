#pragma once

#include <cstdio>
#include <string>
#include "nlohmann/json.hpp"
#include <vector>
#include "HiveParser.h"

using namespace std;
using json = nlohmann::json;

json hql_select_stmt(vector<json> expr_list);
json hql_select_stmt(json expr);
json hql_stmt_list(vector<json> stmt_list);
