#include "HqlFunction.h"


std::string aux_return_list(std::string arg, ...)
{
    va_list arguments;
    va_start(arguments, arg);
    std::stringstream js_result;
    while ((va_arg(arguments, int)) != 0)
    {
        std::string printString = va_arg(arguments, std::string);
        js_result << printString;
        js_result << ",";
    }

    std::string result = js_result.str();
    result.erase(result.size() - 1);
    return result;
}

const std::vector<std::string> explode(const std::string& s, const char& c)
{
    std::string buff{ "" };
    std::vector<std::string> v;

    for (auto n : s)
    {
        if (n != c) buff += n; else
            if (n == c && buff != "") { v.push_back(buff); buff = ""; }
    }
    if (buff != "") v.push_back(buff);

    return v;
}

std::string hql_recur_list(std::string left_val, std::string right_val)
{
    std::stringstream js_template;

    js_template << left_val;
    if (right_val != "" && right_val != "null")
        js_template << "," << right_val;

    return js_template.str();
}

std::string hql_expr_name(std::string name)
{
    std::stringstream js_template;
    std::string reference = "DEFAULT";

    int dot_num = std::count(name.begin(), name.end(), '.');

    if (dot_num == 1)
    {
        std::vector<std::string> v{explode(name, '.')};
        reference = v[0];
        name = v[1];
    }
    else if (dot_num == 2)
    {
        std::vector<std::string> v{ explode(name, '.') };
        reference = v[0] + "." + v[1];
        name = v[2];
    }

    js_template << "{\"type\":\"IDENTIFIER\",\"ref\":\"" << reference << "\",\"value\":\"" << name << "\"}";
    return js_template.str();
}

//std::string hql_select_expr(std::string expr, std::string alias)
//{
//    std::stringstream js_template;
//    js_template << "{\"type\":\"SELECT_EXPR\",\"alias\":\"" << alias
//        << "\",\"value\":" << expr << "}";
//    return js_template.str();
//}

std::string hql_select_expr_list(std::string select_expr, std::string select_expr_list)
{
    std::stringstream js_template;
    js_template << select_expr << "," << select_expr_list;
    return js_template.str();
}

std::string hql_select_stmt(std::string select_expr_list, std::string table_name)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"SELECT_STMT\",\"expr_list\":[" << select_expr_list
        << "],\"table_expr_list\":[\"" << table_name << "\"]}";
    return js_template.str();
}

std::string hql_expr_atom(std::string type, std::string value)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"" << type << "\",\"value\":\"" << value << "\"}" ;
    return js_template.str();
}

std::string hql_expr_interval(std::string expr, std::string interval_item)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"INTERVAL_EXPR\",\"interval_item\":\"" << 
        interval_item << "\",\"value\":" << expr << "}";
    return js_template.str();
}

std::string hql_arithmetic_expr(std::string op, std::string l_expr, std::string r_expr)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"" << op << "\",\"L_EXPR\":" << l_expr
        << ",\"R_EXPR\":" << r_expr << "}";
    return js_template.str();
}

std::string hql_subselect_expr(std::string select_stmt)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"INTERVAL_EXPR\",\"select_expr\":"
        << select_stmt << "}";
    return js_template.str();
}

std::string hql_concat_expr(std::string val1, std::string val2)
{
    std::stringstream js_template;
    js_template << val1 << "," << val2;
    return js_template.str();
}

std::string hql_concat_expr_result(std::string list_concat)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"CONCAT_EXPR\",\"expr_list\":[" << list_concat << "]}";
    return js_template.str();
}

std::string hql_case_expr(std::string expr, std::string when_then_expr_list, std::string else_expr)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"CASE_EXPR\",\"expr\":" << expr << ",";
    js_template << "\"when_then_list\":[" << when_then_expr_list << "],";
    js_template << "\"else_expr\":" << else_expr << "}";
    return js_template.str();
}

std::string hql_case_when_then_list(std::string when_expr, std::string then_expr, std::string recursive)
{
    std::stringstream js_template;
    js_template << "{\"when_expr\":" << when_expr << ",\"then_expr\":" << then_expr << "}";
    if (recursive != "")
        js_template << "," << recursive;
    return js_template.str();
}

std::string hql_order_by_clause(std::string expr, std::string asc_desc, std::string recursive)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"ORDER_BY_EXPR\",\"expr\":" << expr << ",";
    js_template << "\"order\":\"" << asc_desc << "\"}";
    if (recursive != "")
        js_template << "," << recursive;
    return js_template.str();
}

std::string hql_partition_by_list(std::string expr, std::string partition_list)
{
    std::stringstream js_template;
    js_template << expr << "," << partition_list;
    return js_template.str();
}

std::string hql_over_clause(std::string partition_by_list, std::string order_by_list)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"OVER_EXPR\",\"partition_by_list\":[" << partition_by_list << "],";
    js_template << "\"order_by_list\":[" << order_by_list << "]}";
    return js_template.str();
}

std::string hql_agg_window_func(std::string function_name, std::string all_distinct, std::string expr, std::string over_expr)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"FUNC\",\"name\":\"" << function_name << "\",";
    js_template << "\"all_distinct_flg\":\"" << all_distinct << "\",";
    js_template << "\"expr\":" << expr;
    if (over_expr != "")
        js_template << ",\"over_expr\":" << over_expr;
    js_template << "}";
    return js_template.str();
}

std::string hql_lag_lead_func(std::string function_name, std::string expr_list, std::string over_expr)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"FUNC\",\"name\":\"" << function_name << "\",";
    js_template << "\"expr_list\":[" << expr_list << "]";
    if (over_expr != "")
        js_template << ",\"over_expr\":" << over_expr;
    js_template << "}";
    return js_template.str();
}

std::string hql_dtype(std::string type_name, std::string size)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"DTYPE_SPEC\",\"name\":\"" << type_name << "\",";
    js_template << "\"size\":";

    if (size != "")
    {
        js_template << size;
    }
    else
    {
        js_template << "\"DEFAULT\"";
    }

    js_template << "}";

    return js_template.str();
}

std::string hql_dtype_size(std::string size_1, std::string size_2)
{
    std::stringstream js_template;   

    if (size_1 != "")
    {
        js_template << "\"" << size_1 << "\"";
    }

    if (size_2 != "")
    {
        js_template << ",\"scale\":";
        js_template << "\"" << size_2 << "\"";
    }

    return js_template.str();
}

std::string hql_simple_spec_func(std::string func_name)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"FUNC\",\"name\":\"" << func_name << "\"}";

    return js_template.str();
}

std::string hql_cast_func(std::string expr, std::string dtype_expr)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"FUNC\",\"name\":\"CAST\",";

    js_template << "\"dtype\":" << dtype_expr;

    js_template << "}";
    return js_template.str();
}

std::string hql_current_timestamp(std::string expr)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"FUNC\",\"name\":\"CURRENT_TIMESTAMP\"";

    if (expr != "")
        js_template << ",\"expr\":" << expr;

    js_template << "}";
    return js_template.str();
}

std::string hql_trim_func(std::string expr)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"FUNC\",\"name\":\"TRIM\"";
    js_template << ",\"expr\":" << expr;

    js_template << "}";

    return js_template.str();
}

std::string hql_substr_func(std::string expr, std::string from_expr, std::string for_expr)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"FUNC\",\"name\":\"SUBSTRING\"";
    js_template << ",\"expr\":" << expr;
    js_template << ",\"from_expr\":" << from_expr;

    if (for_expr != "")
    {
        js_template << ",\"for_expr\":" << from_expr;
    }

    js_template << "}";

    return js_template.str();
}

std::string hql_generic_func(std::string func_name, std::string expr_list)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"FUNC\",\"name\":\" " << func_name << "\"";
    js_template << ",\"expr_list\":[" << expr_list << "]}";

    return js_template.str();
}

std::string hql_bool_expr_binary(std::string op, std::string left_expr, std::string right_expr)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"BOOL_EXPR_BINARY\",\"operator\":\" " << op << "\",";
    js_template << "\"left_expr\":" << left_expr << ",\"right_expr\":" << right_expr << "}";
    
    return js_template.str();
}

std::string hql_bool_expr_multi_in(std::string expr_list, std::string op, std::string select_stmt)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"BOOL_EXPR_MULTI_IN\",\"operator\":\" " << op << "\",";
    js_template << "\"expr_list\":[" << expr_list << "],\"select_stmt\":" << select_stmt << "}";

    return js_template.str();
}

std::string hql_bool_expr_single_in(std::string expr, std::string op, std::string comp_stmt) 
{
    std::stringstream js_template;

    js_template << "{\"type\":\"BOOL_EXPR_SINGLE_IN\",\"operator\":\" " << op << "\",";
    js_template << "\"expr\":" << expr << ",\"comp_stmt\":" << comp_stmt << "}";

    return js_template.str();
}

std::string hql_bool_exists(std::string op, std::string select_stmt)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"BOOL_EXISTS\",\"operator\":\" " << op << "\",";
    js_template << "\"select_stmt\":" << select_stmt << "}";

    return js_template.str();
}

std::string hql_between(std::string expr, std::string left_expr, std::string right_expr)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"BETWEEN_EXPR\",\"expr\":\" " << expr << "\",";
    js_template << "\"left_expr\":" << left_expr << ",\"right_expr\":" << right_expr << "}";

    return js_template.str();
}

std::string hql_is_null(std::string op, std::string expr)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"BOOL_NULL\",\"operator\":\" " << op << "\",";
    js_template << "\"expr\":" << expr << "}";

    return js_template.str();
}

std::string hql_bool_not_expr(std::string expr)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"BOOL_NOT_EXPR\",";
    js_template << "\"expr\":" << expr << "}";
    return js_template.str();
}

std::string hql_desc_table_stmt(std::string table_name)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"DESCRIBE_STMT\",";
    js_template << "\"table_name\":" << table_name << "}";
    return js_template.str();
}

std::string hql_delete_stmt(std::string table_name, std::string delete_alias, std::string where_clause)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"DELETE_STMT\",";
    js_template << "\"table_name\":" << table_name << ",";
    js_template << "\"delete_alias\":\"" << delete_alias << "\"";
    if(where_clause != "")
        js_template << ",\"where_clause\":" << where_clause;
    js_template << "}";
    return js_template.str();
}

std::string hql_select_option_item(std::string option_type, std::string expr)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"SELECT_OPTION_ITEM\",";
    js_template << "\"option_type\":" << option_type << ",";
    js_template << "\"expr\":" << expr << "}";
    return js_template.str();
}

std::string hql_from_table_values_clause(std::string from_table_values_row_list, std::string from_alias_clause)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"FROM_TABLE_VALUES\",";
    js_template << "\"table_value_list\":[" << from_table_values_row_list << "],";
    js_template << "\"table_alias\":\"" << from_alias_clause << "\"}";
    return js_template.str();
}

std::string hql_from_table_name(std::string table_name, std::string table_alias)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"FROM_TABLE_NAME\",";
    js_template << "\"table_name\":\"" << table_name << "\",";
    js_template << "\"table_alias\":\"" << table_alias << "\"}";
    return js_template.str();
}

std::string hql_from_subselect(std::string subselect, std::string table_alias)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"FROM_TABLE_SUBSELECT\",";
    js_template << "\"select_stmt\":" << subselect << ",";
    js_template << "\"table_alias\":\"" << table_alias << "\"}";
    return js_template.str();
}

std::string hql_join_expr(std::string join_type, std::string from_table_clause, std::string on_expr)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"JOIN_TABLE_EXPR\",";
    js_template << "\"join_type\":\"" << join_type << "\",";
    js_template << "\"table_factor\":[" << from_table_clause << "],";
    js_template << "\"on_expr\":" << on_expr << "}";
    return js_template.str();
}

std::string hql_from_clause(std::string from_table_clause, std::string from_join_clause_list)
{
    std::stringstream js_template;

    js_template << "\"from_expr\":\"" << from_table_clause << "\",";
    js_template << "\"join_expr_list\":[" << from_join_clause_list << "],";

    return js_template.str();
}

std::string hql_select_expr(std::string expr, std::string alias)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"SELECT_EXPR\",";
    js_template << "\"expr\":" << expr << ",";
    js_template << "\"alias\":\"" << alias << "\"}";
    return js_template.str();
}

std::string hql_select_list(std::string select_list_set, std::string select_list_limit, std::string select_expr_list)
{
    std::stringstream js_template;
    js_template << "\"set\":\"" << select_list_set << "\",";
    js_template << "\"limit\":" << select_list_limit << ",";
    js_template << "\"expr_list\":[" << select_expr_list << "]";
    return js_template.str();
}

std::string hql_subselect_stmt(std::string select_list, std::string from_clause, std::string where_clause,
    std::string group_by_clause, std::string having_qualify_clause, std::string order_by_clause, std::string select_options)
{
    std::stringstream js_template;
    js_template << "{\"type\":\"SUBSELECT_STMT\",";
    js_template << "\"select_expr\":{" << select_list << "},";
    js_template << from_clause << ",";
    js_template << "\"where\":" << where_clause << ",";
    js_template << "\"group_by\":" << group_by_clause << ",";
    js_template << "\"having_qualify\":" << having_qualify_clause << ",";
    js_template << "\"order_by\":" << order_by_clause << ",";
    js_template << "\"select_options\":" << select_options << "}";
    return js_template.str();
}

std::string hql_select_set_opt(std::string set_op_type, std::string select_stmt, std::string select_stmt_list)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"SELECT_SET\",";
    js_template << "\"op_type\":\"" << set_op_type << "\",";
    js_template << "\"select_stmt\":" << select_stmt << ",";
    js_template << "\"select_stmt_list\":" << select_stmt_list << "}";

    return js_template.str();
}

std::string hql_create_table_option_item(std::string option_name, std::string option_expr)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"CREATE_TABLE_OPTION_ITEM\",";
    js_template << "\"name\":\"" << option_name << "\",";
    js_template << "\"expr\":" << option_expr << "}";

    return js_template.str();
}

std::string hql_create_table_option_item_val(std::string option_name, std::string option_expr)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"CREATE_TABLE_OPTION_ITEM\",";
    js_template << "\"name\":\"" << option_name << "\",";
    js_template << "\"value\":\"" << option_expr << "\"}";

    return js_template.str();
}

std::string hql_create_table_fields_spec(std::string terminated, std::string escaped)
{
    std::stringstream js_template;

    js_template << "{\"type\":\"CREATE_TABLE_OPTION_ITEM\",";
    js_template << "\"name\":\"FIELDS\",";
    js_template << "\"terminated\":" << terminated << ",";
    js_template << "\"escaped\":" << escaped << "}";

    return js_template.str();
}