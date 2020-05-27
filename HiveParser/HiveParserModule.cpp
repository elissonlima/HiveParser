#include "HiveParserModule.h"

std::string parse(std::string in)
{

	ANTLRInputStream input(in);
	HiveLexer lexer(&input);
	CommonTokenStream tokens(&lexer);
	HiveParser parser(&tokens);

	lexer.removeErrorListeners();


	HiveParser::ProgramContext* tree = parser.program();
	return tree->res.dump();
}