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
json hql_type_table_identifier(string database, string table);
json hql_complx_typ_array(vector<json> arr_values);
json hql_complx_typ_map(vector<json> keys, vector<json> values);
json hql_complex_type_access(json struct_def, json access_expr);
json hql_complx_typ_struct(vector<json> cols, vector<json> values);
json hql_primitive_type_spec(string type_name);
json hql_array_type_spec(string data_type);
json hql_map_type_spec(string data_type_key, string data_type_value);
json hql_struct_type_spec(vector<string> columns, vector<json> column_type_specs);
json hql_uniontype_type_spec(vector<json> data_type_list);