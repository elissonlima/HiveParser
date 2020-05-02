#include "hql_types.h"

json hql_string_type(string value)
{
	json j;
	j["type"] = "STRING";
	value.erase(std::remove(value.begin(), value.end(), '\''), value.end());
	value.erase(std::remove(value.begin(), value.end(), '"'), value.end());
	j["value"] = value;
	return j;
}

json hql_decimal_type(string value)
{
	json j;
	j["type"] = "DECIMAL";
	j["value"] = stof(value);
	return j;
}

json hql_int_type(string value)
{
	json j;
	j["type"] = "INT";
	j["value"] = stoi(value);
	return j;
}

json hql_boolean_type(string value)
{
	json j;
	j["type"] = "BOOLEAN";
	if (value == "TRUE")
		j["value"] = 1;
	else
		j["value"] = 0;
	return j;
}

json hql_null_constant()
{
	json j;
	j["type"] = "NULL_CONSTANT";
	j["value"] = NULL;
	return j;
}

json hql_type_date_literal(string value)
{
	json j;
	j["type"] = "DATE";
	value.erase(std::remove(value.begin(), value.end(), '\''), value.end());
	value.erase(std::remove(value.begin(), value.end(), '"'), value.end());
	j["value"] = value;
	return j;
}

json hql_type_timestamp_literal(string value)
{
	json j;
	j["type"] = "TIMESTAMP";
	value.erase(std::remove(value.begin(), value.end(), '\''), value.end());
	value.erase(std::remove(value.begin(), value.end(), '"'), value.end());
	j["value"] = value;
	return j;
}

json hql_type_identifier(string database, string table, string ident)
{
	json j;
	j["type"] = "NAME";
	ident.erase(std::remove(ident.begin(), ident.end(), '`'), ident.end());
	j["value"] = ident;

	if (!database.empty())
	{
		database.erase(std::remove(database.begin(), database.end(), '`'), database.end());
		j["database"] = database;
	}
	else
		j["database"] = "DEFAULT";

	if (!table.empty())
	{
		table.erase(std::remove(table.begin(), table.end(), '`'), table.end());
		j["table"] = table;
	}
	else
	{
		if (!database.empty())
		{
			j["table"] = database;
			j["database"] = "DEFAULT";
		}
		else
		{
			j["table"] = "DEFAULT";
		}			
	}

	return j;
}

json hql_type_table_identifier(string database, string ident)
{
	json j;
	j["type"] = "NAME";
	ident.erase(std::remove(ident.begin(), ident.end(), '`'), ident.end());
	j["value"] = ident;
	j["database"] = "DEFAULT";

	if (!database.empty())
	{
		database.erase(std::remove(database.begin(), database.end(), '`'), database.end());
		j["database"] = database;
	}
	return j;
}

json hql_complx_typ_array(vector<json> arr_values)
{
	json j;
	j["type"] = "ARRAY";
	j["values"] = arr_values;
	return j;
}

json hql_complx_typ_map(vector<json> keys, vector<json> values)
{
	json j;
	j["type"] = "MAP";
	vector<json> map_values;
	for (int i = 0; i < keys.size(); i++)
	{
		json mvalue;
		mvalue["key_map"] = keys[i];
		mvalue["value_map"] = values[i];
		map_values.push_back(mvalue);
	}
	j["values"] = map_values;
	return j;
}

json hql_complx_typ_struct(vector<json> cols, vector<json> values)
{
	json j;
	j["type"] = "STRUCT";
	vector<json> map_values;
	for (int i = 0; i < cols.size(); i++)
	{
		json mvalue;
		mvalue["col"] = cols[i];
		mvalue["val"] = values[i];
		map_values.push_back(mvalue);
	}
	j["values"] = map_values;
	return j;
}

json hql_complex_type_access(json struct_def, json access_expr)
{
	json j;
	j["type"] = "COMPLEX_TYPE_ACCESS";
	j["complex_type_def"] = struct_def;
	j["access_expr"] = access_expr;
	return j;
}