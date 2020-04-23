#pragma once

#include <string>
#include <sstream>
#include <algorithm>
#include <vector>

std::string aux_return_list(std::string arg, ...);
const std::vector<std::string> explode(const std::string& s, const char& c);
std::string recur_list(std::string left_val, std::string right_val);