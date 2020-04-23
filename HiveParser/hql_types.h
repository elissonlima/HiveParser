#pragma once

#include <string>
#include <sstream>
#include <algorithm>
#include <vector>
#include <cstdarg>
#include "utils.h"
#include <cstdio>
#include "nlohmann/json.hpp"

using json = nlohmann::json;
using namespace std;

json hql_string_type(string value);
json hql_decimal_type(string value);
json hql_int_type(string value);
json hql_boolean_type(string value);
json hql_null_constant();
json hql_type_date_literal(string value);
json hql_type_timestamp_literal(string value);
json hql_type_identifier(string database, string table, string ident);