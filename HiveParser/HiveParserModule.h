#pragma once

#include <string>
#include <antlr4-runtime.h>
#include "HiveLexer.h"
#include "HiveParser.h"
#include <sstream>
#include <exception>

using namespace antlr4;
using namespace hiveparser;

std::string parse(std::string in);