
#include <iostream>
#include <string>
#include <antlr4-runtime.h>
#include "nlohmann/json.hpp"
#include "HiveLexer.h"
#include "HiveParser.h"
#include "hql_types.h"



using namespace std;
using namespace antlr4;
using namespace hiveparser;
using json = nlohmann::json;

int main(int argc, const char* argv[])
{
	ifstream in_file;
	in_file.open(argv[1]);

	ANTLRInputStream input(in_file);
	HiveLexer lexer(&input);
	CommonTokenStream tokens(&lexer);
	HiveParser parser(&tokens);

	HiveParser::ProgramContext* tree = parser.program();
	cout << tree->res.dump() << endl;

	return 0;
}