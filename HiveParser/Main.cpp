#include <iostream>
#include <antlr4-runtime.h>
#include "HiveLexer.h"
#include "HiveParser.h"

using namespace std;
using namespace antlr4;
using namespace hiveparser;

int main()
{
	string in = "SELECT COALESCE('elisson',10,'OL',NULL) as tst FROM teste;";

	ANTLRInputStream input(in);
	HiveLexer lexer(&input);
	CommonTokenStream tokens(&lexer);
	HiveParser parser(&tokens);

	HiveParser::ProgramContext* tree = parser.program();
	cout << tree->res << endl;

	system("pause");

	return 0;
}