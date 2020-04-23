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