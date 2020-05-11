#include "utils.h"

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

std::string recur_list(std::string left_val, std::string right_val)
{
    std::stringstream js_template;

    js_template << left_val;
    if (right_val != "" && right_val != "null")
        js_template << "," << right_val;

    return js_template.str();
}


std::string remove_quotes(std::string in)
{
    in.erase(std::remove(in.begin(), in.end(), '\''), in.end());
    in.erase(std::remove(in.begin(), in.end(), '"'), in.end());
    return in;
}