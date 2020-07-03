#include "HiveParserModule.h"

class HiveParserException : public exception
{
public:
	std::string msg;

	HiveParserException()
	{
		msg = "an error occurred :(";
	}

	HiveParserException(std::string message)
	{
		msg = message;
	}

	virtual const char* what() const throw()
	{
		return msg.c_str();
	}

};


class LexerErrorListener : public BaseErrorListener {
public:
	//HiveParserContextImpl* owner;

	//LexerErrorListener(HiveParserContextImpl* aOwner) : owner(aOwner) {}

	void syntaxError(Recognizer* recognizer, Token* offendingSymbol, size_t line, size_t charPositionInLine,
		const std::string& msg, std::exception_ptr e) override
	{
		std::stringstream ss;
		ss << "PARSER_ERROR Line: " << line << " - " << "Col: " << charPositionInLine << " : " << msg;
		throw HiveParserException(ss.str());
	}
};

class ParserErrorListener : public BaseErrorListener {
public:
	//HiveParserContextImpl* owner;

	//ParserErrorListener(HiveParserContextImpl* aOwner) : owner(aOwner) {}

	void syntaxError(Recognizer* recognizer, Token* offendingSymbol, size_t line, size_t charPositionInLine,
		const std::string& msg, std::exception_ptr e) override
	{
		std::stringstream ss;
		ss << "PARSER_ERROR Line: " << line << " - " << "Col: " << charPositionInLine << " : " << msg;
		throw HiveParserException(ss.str());
	}
};


std::string parse(std::string in)
{

	LexerErrorListener lexerErrorListener;
	ParserErrorListener parserErrorListener;

	ANTLRInputStream input(in);
	HiveLexer lexer(&input);
	CommonTokenStream tokens(&lexer);
	HiveParser parser(&tokens);
			
	lexer.removeErrorListeners();
	lexer.addErrorListener(&lexerErrorListener);

	parser.removeParseListeners();
	parser.removeErrorListeners();
	parser.addErrorListener(&parserErrorListener);
	
	HiveParser::ProgramContext* tree = parser.program();
	return tree->res.dump();
}