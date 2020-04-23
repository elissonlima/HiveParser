// Generated from c:\Users\elisson.lima\source\repos\HiveParser\HiveParser\grammar\Hive.g4 by ANTLR 4.7.1

    #include <string>
    #include <vector>
    #include <cstdio>
    #include "nlohmann/json.hpp"
    #include "hql_types.h"
    #include "hql_exprs.h"
    #include "hql_stmts.h"
    #include "hql_functions.h"

    using namespace std;
    using json = nlohmann::json;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HiveParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		NULL_CONST=10, BOOL_LITERAL=11, T_ABS=12, T_ACOS=13, T_ADD_MONTHS=14, 
		T_ALL=15, T_ALTER=16, T_AND=17, T_AS=18, T_ASC=19, T_ASIN=20, T_AT=21, 
		T_ATAN=22, T_AUTO_INCREMENT=23, T_AVG=24, T_BEGIN=25, T_BETWEEN=26, T_BIGINT=27, 
		T_BIN=28, T_BIT=29, T_BODY=30, T_BREAK=31, T_BY=32, T_BYTE=33, T_CALL=34, 
		T_CALLER=35, T_CASCADE=36, T_CASE=37, T_CAST=38, T_CBR=39, T_CEIL=40, 
		T_CEILING=41, T_CHAR=42, T_CHARACTER=43, T_CHARSET=44, T_CLIENT=45, T_CLOSE=46, 
		T_CLUSTERED=47, T_CMP=48, T_COLLECT=49, T_COLLECTION=50, T_COLUMN=51, 
		T_COMMENT=52, T_CONSTANT=53, T_COMMIT=54, T_COMPRESS=55, T_CONCAT=56, 
		T_CONDITION=57, T_CONSTRAINT=58, T_CONTINUE=59, T_CONV=60, T_COPY=61, 
		T_COS=62, T_COUNT=63, T_COUNT_BIG=64, T_CREATE=65, T_CREATION=66, T_CREATOR=67, 
		T_CS=68, T_CURRENT=69, T_CURRENT_SCHEMA=70, T_CURSOR=71, T_DATABASE=72, 
		T_DATA=73, T_DATE=74, T_DATEADD=75, T_DATEDIFF=76, T_DATE_FORMAT=77, T_DATESUB=78, 
		T_DATETIME=79, T_DAY=80, T_DAYS=81, T_DEC=82, T_DECIMAL=83, T_DECLARE=84, 
		T_DEFAULT=85, T_DEFERRED=86, T_DEFINED=87, T_DEFINER=88, T_DEFINITION=89, 
		T_DEGREES=90, T_DELETE=91, T_DELIMITED=92, T_DELIMITER=93, T_DESC=94, 
		T_DESCRIBE=95, T_DIAGNOSTICS=96, T_DIR=97, T_DIRECTORY=98, T_DISTINCT=99, 
		T_DISTRIBUTE=100, T_DO=101, T_DOUBLE=102, T_DROP=103, T_DYNAMIC=104, T_ELSE=105, 
		T_ELSEIF=106, T_ELSIF=107, T_ENABLE=108, T_END=109, T_ENGINE=110, T_ESCAPED=111, 
		T_EXCEPT=112, T_EXEC=113, T_EXECUTE=114, T_EXCEPTION=115, T_EXCLUSIVE=116, 
		T_EXISTS=117, T_EXIT=118, T_EXP=119, T_FACTORIAL=120, T_FALLBACK=121, 
		T_FALSE=122, T_FETCH=123, T_FIELDS=124, T_FILE=125, T_FILES=126, T_FLOAT=127, 
		T_FLOOR=128, T_FOR=129, T_FOREIGN=130, T_FORMAT=131, T_FOUND=132, T_FROM=133, 
		T_FROMUTCTIMESTAMP=134, T_FULL=135, T_FUNCTION=136, T_GET=137, T_GLOBAL=138, 
		T_GO=139, T_GRANT=140, T_GROUP=141, T_HANDLER=142, T_HASH=143, T_HAVING=144, 
		T_HDFS=145, T_HEX=146, T_HIVE=147, T_HOST=148, T_HOUR=149, T_IDENTITY=150, 
		T_IF=151, T_IGNORE=152, T_IMMEDIATE=153, T_IN=154, T_INCLUDE=155, T_INDEX=156, 
		T_INITRANS=157, T_INNER=158, T_INOUT=159, T_INSERT=160, T_INT=161, T_INT2=162, 
		T_INT4=163, T_INT8=164, T_INTEGER=165, T_INTERSECT=166, T_INTERVAL=167, 
		T_INTO=168, T_INVOKER=169, T_IS=170, T_ISOPEN=171, T_ITEMS=172, T_JOIN=173, 
		T_KEEP=174, T_KEY=175, T_KEYS=176, T_LANGUAGE=177, T_LASTDAY=178, T_LEAVE=179, 
		T_LEFT=180, T_LIKE=181, T_LIMIT=182, T_LINES=183, T_LOCAL=184, T_LOCATION=185, 
		T_LOCATOR=186, T_LOCATORS=187, T_LOCKS=188, T_LOG=189, T_LOG10=190, T_LOG2=191, 
		T_LOGGED=192, T_LOGGING=193, T_LOOP=194, T_LOWER=195, T_LN=196, T_MAP=197, 
		T_MATCHED=198, T_MAX=199, T_MAXTRANS=200, T_MERGE=201, T_MESSAGE_TEXT=202, 
		T_MICROSECOND=203, T_MICROSECONDS=204, T_MIN=205, T_MINUTE=206, T_MONTH=207, 
		T_MONTHS_BETWEEN=208, T_MULTISET=209, T_NCHAR=210, T_NEGATIVE=211, T_NEXT_DAY=212, 
		T_NEW=213, T_NVARCHAR=214, T_NO=215, T_NOCOUNT=216, T_NOCOMPRESS=217, 
		T_NOLOGGING=218, T_NONE=219, T_NOT=220, T_NOTFOUND=221, T_NULL=222, T_NUMERIC=223, 
		T_NUMBER=224, T_OBJECT=225, T_OFF=226, T_ON=227, T_ONLY=228, T_OPEN=229, 
		T_OR=230, T_ORDER=231, T_OUT=232, T_OUTER=233, T_OVER=234, T_OVERWRITE=235, 
		T_OWNER=236, T_PACKAGE=237, T_PARTITION=238, T_PCTFREE=239, T_PCTUSED=240, 
		T_PLS_INTEGER=241, T_PMOD=242, T_POSITIVE=243, T_POW=244, T_POWER=245, 
		T_PRECISION=246, T_PRESERVE=247, T_PRIMARY=248, T_PRINT=249, T_PROC=250, 
		T_PROCEDURE=251, T_QUALIFY=252, T_QUARTER=253, T_QUERY_BAND=254, T_QUIT=255, 
		T_QUOTED_IDENTIFIER=256, T_RADIANS=257, T_RAISE=258, T_RAND=259, T_REAL=260, 
		T_REFERENCES=261, T_REGEXP=262, T_REPLACE=263, T_RESIGNAL=264, T_RESTRICT=265, 
		T_RESULT=266, T_RESULT_SET_LOCATOR=267, T_RETURN=268, T_RETURNS=269, T_REVERSE=270, 
		T_RIGHT=271, T_RLIKE=272, T_ROLE=273, T_ROLLBACK=274, T_ROUND=275, T_ROW=276, 
		T_ROWS=277, T_ROWTYPE=278, T_ROW_COUNT=279, T_RR=280, T_RS=281, T_PWD=282, 
		T_TRIM=283, T_SCHEMA=284, T_SECOND=285, T_SECONDS=286, T_SECURITY=287, 
		T_SEGMENT=288, T_SEL=289, T_SELECT=290, T_SET=291, T_SETS=292, T_SIGN=293, 
		T_SIN=294, T_SIMPLE_DOUBLE=295, T_SIMPLE_FLOAT=296, T_SIMPLE_INTEGER=297, 
		T_SMALLDATETIME=298, T_SMALLINT=299, T_SQL=300, T_SQLEXCEPTION=301, T_SQLINSERT=302, 
		T_SQLSTATE=303, T_SQLWARNING=304, T_SQRT=305, T_STATS=306, T_STATISTICS=307, 
		T_STEP=308, T_STORAGE=309, T_STORED=310, T_STRING=311, T_SUBDIR=312, T_SUBSTR=313, 
		T_SUBSTRING=314, T_SUM=315, T_SUMMARY=316, T_SYS_REFCURSOR=317, T_TABLE=318, 
		T_TABLESPACE=319, T_TAN=320, T_TEMPORARY=321, T_TERMINATED=322, T_TEXTIMAGE_ON=323, 
		T_THEN=324, T_TIMESTAMP=325, T_TINYINT=326, T_TITLE=327, T_TO=328, T_TOP=329, 
		T_TOUTCTIMESTAMP=330, T_TRANSACTION=331, T_TRUE=332, T_TRUNCATE=333, T_TRUNC=334, 
		T_TYPE=335, T_UNHEX=336, T_UNION=337, T_UNIQUE=338, T_UNIX_TIMESTAMP=339, 
		T_UPDATE=340, T_UPPER=341, T_UR=342, T_USE=343, T_USING=344, T_VALUE=345, 
		T_VALUES=346, T_VAR=347, T_VARCHAR=348, T_VARCHAR2=349, T_VARYING=350, 
		T_VOLATILE=351, T_WEEKOFYEAR=352, T_WHEN=353, T_WHERE=354, T_WHILE=355, 
		T_WITH=356, T_WITHOUT=357, T_WORK=358, T_XACT_ABORT=359, T_XML=360, T_YEAR=361, 
		T_YES=362, T_ACTIVITY_COUNT=363, T_CUME_DIST=364, T_CURRENT_DATE=365, 
		T_CURRENT_TIMESTAMP=366, T_CURRENT_USER=367, T_DENSE_RANK=368, T_FIRST_VALUE=369, 
		T_LAG=370, T_LAST_VALUE=371, T_LEAD=372, T_MAX_PART_STRING=373, T_MIN_PART_STRING=374, 
		T_MAX_PART_INT=375, T_MIN_PART_INT=376, T_MAX_PART_DATE=377, T_MIN_PART_DATE=378, 
		T_PART_COUNT=379, T_PART_LOC=380, T_RANK=381, T_ROW_NUMBER=382, T_STDEV=383, 
		T_SYSDATE=384, T_VARIANCE=385, T_USER=386, T_ADD=387, T_COLON=388, T_COMMA=389, 
		T_PIPE=390, T_DIV=391, T_DOT2=392, T_EQUAL=393, T_EQUAL2=394, T_NOTEQUAL=395, 
		T_NOTEQUAL2=396, T_GREATER=397, T_GREATEREQUAL=398, T_LESS=399, T_LESSEQUAL=400, 
		T_MUL=401, T_OPEN_B=402, T_OPEN_P=403, T_OPEN_SB=404, T_CLOSE_B=405, T_CLOSE_P=406, 
		T_CLOSE_SB=407, T_SEMICOLON=408, T_SUB=409, IDENTIFIER=410, INT_LITERAL=411, 
		DECIMAL_LITERAL=412, STRING_LITERAL=413, L_INT=414, L_DEC=415, SPACES=416, 
		UNEXPECTED_CHAR=417;
	public static final int
		RULE_program = 0, RULE_stmt_list = 1, RULE_dtype = 2, RULE_dtype_len = 3, 
		RULE_stmt = 4, RULE_query_stmt = 5, RULE_select_stmt = 6, RULE_expr = 7, 
		RULE_date_func = 8, RULE_spec_func = 9, RULE_math_func = 10, RULE_string_func = 11, 
		RULE_literal_values = 12, RULE_ident = 13, RULE_date_literal = 14, RULE_timestamp_literal = 15, 
		RULE_set_operators = 16, RULE_unary_operator = 17;
	public static final String[] ruleNames = {
		"program", "stmt_list", "dtype", "dtype_len", "stmt", "query_stmt", "select_stmt", 
		"expr", "date_func", "spec_func", "math_func", "string_func", "literal_values", 
		"ident", "date_literal", "timestamp_literal", "set_operators", "unary_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'<<'", "'>>'", "'&'", "'|'", "'E'", "'PI'", "'.'", "'~'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'+'", "':'", "','", "'||'", "'/'", "'..'", 
		"'='", "'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", "'<='", "'*'", "'{'", 
		"'('", "'['", "'}'", "')'", "']'", "';'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "NULL_CONST", 
		"BOOL_LITERAL", "T_ABS", "T_ACOS", "T_ADD_MONTHS", "T_ALL", "T_ALTER", 
		"T_AND", "T_AS", "T_ASC", "T_ASIN", "T_AT", "T_ATAN", "T_AUTO_INCREMENT", 
		"T_AVG", "T_BEGIN", "T_BETWEEN", "T_BIGINT", "T_BIN", "T_BIT", "T_BODY", 
		"T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", "T_CASCADE", "T_CASE", 
		"T_CAST", "T_CBR", "T_CEIL", "T_CEILING", "T_CHAR", "T_CHARACTER", "T_CHARSET", 
		"T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", "T_COLLECTION", 
		"T_COLUMN", "T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", "T_CONCAT", 
		"T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", "T_CONV", "T_COPY", "T_COS", 
		"T_COUNT", "T_COUNT_BIG", "T_CREATE", "T_CREATION", "T_CREATOR", "T_CS", 
		"T_CURRENT", "T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", "T_DATA", "T_DATE", 
		"T_DATEADD", "T_DATEDIFF", "T_DATE_FORMAT", "T_DATESUB", "T_DATETIME", 
		"T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", 
		"T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DEGREES", "T_DELETE", "T_DELIMITED", 
		"T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", "T_DIR", "T_DIRECTORY", 
		"T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", 
		"T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", 
		"T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", 
		"T_EXIT", "T_EXP", "T_FACTORIAL", "T_FALLBACK", "T_FALSE", "T_FETCH", 
		"T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_FLOOR", "T_FOR", "T_FOREIGN", 
		"T_FORMAT", "T_FOUND", "T_FROM", "T_FROMUTCTIMESTAMP", "T_FULL", "T_FUNCTION", 
		"T_GET", "T_GLOBAL", "T_GO", "T_GRANT", "T_GROUP", "T_HANDLER", "T_HASH", 
		"T_HAVING", "T_HDFS", "T_HEX", "T_HIVE", "T_HOST", "T_HOUR", "T_IDENTITY", 
		"T_IF", "T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", "T_INDEX", "T_INITRANS", 
		"T_INNER", "T_INOUT", "T_INSERT", "T_INT", "T_INT2", "T_INT4", "T_INT8", 
		"T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", 
		"T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", 
		"T_LASTDAY", "T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", 
		"T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOG10", 
		"T_LOG2", "T_LOGGED", "T_LOGGING", "T_LOOP", "T_LOWER", "T_LN", "T_MAP", 
		"T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", 
		"T_MICROSECONDS", "T_MIN", "T_MINUTE", "T_MONTH", "T_MONTHS_BETWEEN", 
		"T_MULTISET", "T_NCHAR", "T_NEGATIVE", "T_NEXT_DAY", "T_NEW", "T_NVARCHAR", 
		"T_NO", "T_NOCOUNT", "T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", "T_NOT", 
		"T_NOTFOUND", "T_NULL", "T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OFF", 
		"T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", 
		"T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", 
		"T_PLS_INTEGER", "T_PMOD", "T_POSITIVE", "T_POW", "T_POWER", "T_PRECISION", 
		"T_PRESERVE", "T_PRIMARY", "T_PRINT", "T_PROC", "T_PROCEDURE", "T_QUALIFY", 
		"T_QUARTER", "T_QUERY_BAND", "T_QUIT", "T_QUOTED_IDENTIFIER", "T_RADIANS", 
		"T_RAISE", "T_RAND", "T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", 
		"T_RESIGNAL", "T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", 
		"T_RETURNS", "T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", "T_ROLLBACK", 
		"T_ROUND", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RR", "T_RS", 
		"T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", 
		"T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SETS", "T_SIGN", "T_SIN", 
		"T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", "T_SIMPLE_INTEGER", "T_SMALLDATETIME", 
		"T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", "T_SQLINSERT", "T_SQLSTATE", 
		"T_SQLWARNING", "T_SQRT", "T_STATS", "T_STATISTICS", "T_STEP", "T_STORAGE", 
		"T_STORED", "T_STRING", "T_SUBDIR", "T_SUBSTR", "T_SUBSTRING", "T_SUM", 
		"T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TAN", "T_TEMPORARY", 
		"T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", 
		"T_TITLE", "T_TO", "T_TOP", "T_TOUTCTIMESTAMP", "T_TRANSACTION", "T_TRUE", 
		"T_TRUNCATE", "T_TRUNC", "T_TYPE", "T_UNHEX", "T_UNION", "T_UNIQUE", "T_UNIX_TIMESTAMP", 
		"T_UPDATE", "T_UPPER", "T_UR", "T_USE", "T_USING", "T_VALUE", "T_VALUES", 
		"T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", "T_VOLATILE", "T_WEEKOFYEAR", 
		"T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", 
		"T_XML", "T_YEAR", "T_YES", "T_ACTIVITY_COUNT", "T_CUME_DIST", "T_CURRENT_DATE", 
		"T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", "T_FIRST_VALUE", 
		"T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", "T_MIN_PART_STRING", 
		"T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", "T_MIN_PART_DATE", 
		"T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", "T_STDEV", "T_SYSDATE", 
		"T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", "T_PIPE", "T_DIV", 
		"T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", "T_GREATER", 
		"T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", "T_OPEN_P", 
		"T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", "T_SUB", 
		"IDENTIFIER", "INT_LITERAL", "DECIMAL_LITERAL", "STRING_LITERAL", "L_INT", 
		"L_DEC", "SPACES", "UNEXPECTED_CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Hive.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HiveParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public json res;
		public Stmt_listContext stmt_list;
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HiveParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((ProgramContext)_localctx).stmt_list = stmt_list();
			setState(37);
			match(EOF);
			 ((ProgramContext)_localctx).res =  ((ProgramContext)_localctx).stmt_list.res; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_listContext extends ParserRuleContext {
		public json res;
		public StmtContext stmt;
		public List<StmtContext> stmts = new ArrayList<StmtContext>();
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<StmtContext*> stmts; 
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				((Stmt_listContext)_localctx).stmt = stmt();
				((Stmt_listContext)_localctx).stmts.add(((Stmt_listContext)_localctx).stmt);
				setState(42);
				match(T_SEMICOLON);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_SELECT );
			 
			        vector<json> stmt_list;
			        for(StmtContext* stmt : ((Stmt_listContext)_localctx).stmts) {stmt_list.push_back(stmt->res);}
			        ((Stmt_listContext)_localctx).res =  hql_stmt_list(stmt_list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public std::string res;
		public IdentContext ident;
		public TerminalNode T_CHAR() { return getToken(HiveParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HiveParser.T_CHARACTER, 0); }
		public TerminalNode T_BIGINT() { return getToken(HiveParser.T_BIGINT, 0); }
		public TerminalNode T_BIT() { return getToken(HiveParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(HiveParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HiveParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(HiveParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HiveParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HiveParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(HiveParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(HiveParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(HiveParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HiveParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HiveParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HiveParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HiveParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(HiveParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HiveParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(HiveParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HiveParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(HiveParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(HiveParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HiveParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(HiveParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HiveParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HiveParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(HiveParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HiveParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HiveParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(HiveParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HiveParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HiveParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(HiveParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HiveParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HiveParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(HiveParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(HiveParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(HiveParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dtype);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T_CHAR);
				 ((DtypeContext)_localctx).res =  "CHAR"; 
				}
				break;
			case T_CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T_CHARACTER);
				 ((DtypeContext)_localctx).res =  "CHAR"; 
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(T_BIGINT);
				 ((DtypeContext)_localctx).res =  "BIGINT"; 
				}
				break;
			case T_BIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(T_BIT);
				 ((DtypeContext)_localctx).res =  "BIT"; 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(T_DATE);
				 ((DtypeContext)_localctx).res =  "DATE"; 
				}
				break;
			case T_DATETIME:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				match(T_DATETIME);
				 ((DtypeContext)_localctx).res =  "DATETIME"; 
				}
				break;
			case T_DEC:
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				match(T_DEC);
				 ((DtypeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				match(T_DECIMAL);
				 ((DtypeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				match(T_DOUBLE);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PRECISION) {
					{
					setState(67);
					match(T_PRECISION);
					}
				}

				 ((DtypeContext)_localctx).res =  "DOUBLE"; 
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 10);
				{
				setState(71);
				match(T_FLOAT);
				 ((DtypeContext)_localctx).res =  "FLOAT"; 
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 11);
				{
				setState(73);
				match(T_INT);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_INT2:
				enterOuterAlt(_localctx, 12);
				{
				setState(75);
				match(T_INT2);
				 ((DtypeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case T_INT4:
				enterOuterAlt(_localctx, 13);
				{
				setState(77);
				match(T_INT4);
				 ((DtypeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case T_INT8:
				enterOuterAlt(_localctx, 14);
				{
				setState(79);
				match(T_INT8);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 15);
				{
				setState(81);
				match(T_INTEGER);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_NCHAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(83);
				match(T_NCHAR);
				 ((DtypeContext)_localctx).res =  "NCHAR"; 
				}
				break;
			case T_NVARCHAR:
				enterOuterAlt(_localctx, 17);
				{
				setState(85);
				match(T_NVARCHAR);
				 ((DtypeContext)_localctx).res =  "NVARCHAR"; 
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 18);
				{
				setState(87);
				match(T_NUMBER);
				 ((DtypeContext)_localctx).res =  "NUMBER"; 
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 19);
				{
				setState(89);
				match(T_NUMERIC);
				 ((DtypeContext)_localctx).res =  "NUMERIC"; 
				}
				break;
			case T_PLS_INTEGER:
				enterOuterAlt(_localctx, 20);
				{
				setState(91);
				match(T_PLS_INTEGER);
				 ((DtypeContext)_localctx).res =  "PLS_INTEGER"; 
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 21);
				{
				setState(93);
				match(T_REAL);
				 ((DtypeContext)_localctx).res =  "REAL"; 
				}
				break;
			case T_RESULT_SET_LOCATOR:
				enterOuterAlt(_localctx, 22);
				{
				setState(95);
				match(T_RESULT_SET_LOCATOR);
				setState(96);
				match(T_VARYING);
				 ((DtypeContext)_localctx).res =  "RESULT_SET_LOCATOR"; 
				}
				break;
			case T_SIMPLE_FLOAT:
				enterOuterAlt(_localctx, 23);
				{
				setState(98);
				match(T_SIMPLE_FLOAT);
				 ((DtypeContext)_localctx).res =  "SIMPLE_FLOAT"; 
				}
				break;
			case T_SIMPLE_DOUBLE:
				enterOuterAlt(_localctx, 24);
				{
				setState(100);
				match(T_SIMPLE_DOUBLE);
				 ((DtypeContext)_localctx).res =  "SIMPLE_DOUBLE"; 
				}
				break;
			case T_SIMPLE_INTEGER:
				enterOuterAlt(_localctx, 25);
				{
				setState(102);
				match(T_SIMPLE_INTEGER);
				 ((DtypeContext)_localctx).res =  "SIMPLE_INTEGER"; 
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 26);
				{
				setState(104);
				match(T_SMALLINT);
				 ((DtypeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case T_SMALLDATETIME:
				enterOuterAlt(_localctx, 27);
				{
				setState(106);
				match(T_SMALLDATETIME);
				 ((DtypeContext)_localctx).res =  "SMALLDATETIME"; 
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 28);
				{
				setState(108);
				match(T_STRING);
				 ((DtypeContext)_localctx).res =  "STRING"; 
				}
				break;
			case T_SYS_REFCURSOR:
				enterOuterAlt(_localctx, 29);
				{
				setState(110);
				match(T_SYS_REFCURSOR);
				 ((DtypeContext)_localctx).res =  "SYS_REFCURSOR"; 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 30);
				{
				setState(112);
				match(T_TIMESTAMP);
				 ((DtypeContext)_localctx).res =  "TIMESTAMP"; 
				}
				break;
			case T_TINYINT:
				enterOuterAlt(_localctx, 31);
				{
				setState(114);
				match(T_TINYINT);
				 ((DtypeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 32);
				{
				setState(116);
				match(T_VARCHAR);
				 ((DtypeContext)_localctx).res =  "VARCHAR"; 
				}
				break;
			case T_VARCHAR2:
				enterOuterAlt(_localctx, 33);
				{
				setState(118);
				match(T_VARCHAR2);
				 ((DtypeContext)_localctx).res =  "VARCHAR2"; 
				}
				break;
			case T_XML:
				enterOuterAlt(_localctx, 34);
				{
				setState(120);
				match(T_XML);
				 ((DtypeContext)_localctx).res =  "XML"; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 35);
				{
				setState(122);
				((DtypeContext)_localctx).ident = ident();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(123);
					match(T__0);
					setState(124);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				 ((DtypeContext)_localctx).res =  (((DtypeContext)_localctx).ident!=null?_input.getText(((DtypeContext)_localctx).ident.start,((DtypeContext)_localctx).ident.stop):null); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_lenContext extends ParserRuleContext {
		public Token size;
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HiveParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HiveParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(HiveParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(HiveParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(HiveParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(HiveParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T_OPEN_P);
			setState(132);
			((Dtype_lenContext)_localctx).size = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
				((Dtype_lenContext)_localctx).size = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(136);
				match(T_COMMA);
				setState(137);
				match(L_INT);
				}
			}

			setState(140);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public json res;
		public Query_stmtContext query_stmt;
		public Query_stmtContext query_stmt() {
			return getRuleContext(Query_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((StmtContext)_localctx).query_stmt = query_stmt();
			 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).query_stmt.res; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_stmtContext extends ParserRuleContext {
		public json res;
		public Select_stmtContext select_stmt;
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Query_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_stmt; }
	}

	public final Query_stmtContext query_stmt() throws RecognitionException {
		Query_stmtContext _localctx = new Query_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_query_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((Query_stmtContext)_localctx).select_stmt = select_stmt();
			 ((Query_stmtContext)_localctx).res =  ((Query_stmtContext)_localctx).select_stmt.res; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public TerminalNode T_SELECT() { return getToken(HiveParser.T_SELECT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> exprs; 
			setState(149);
			match(T_SELECT);
			setState(150);
			((Select_stmtContext)_localctx).expr = expr(0);
			((Select_stmtContext)_localctx).exprs.add(((Select_stmtContext)_localctx).expr);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(151);
				match(T_COMMA);
				setState(152);
				((Select_stmtContext)_localctx).expr = expr(0);
				((Select_stmtContext)_localctx).exprs.add(((Select_stmtContext)_localctx).expr);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
			        vector<json> expr_list;
			        for(ExprContext* expr : ((Select_stmtContext)_localctx).exprs) {expr_list.push_back(expr->res);}
			        ((Select_stmtContext)_localctx).res =  hql_select_stmt(expr_list); 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public json res;
		public ExprContext l_expr;
		public Literal_valuesContext literal_values;
		public IdentContext ident;
		public Unary_operatorContext unary_operator;
		public ExprContext expr;
		public Spec_funcContext spec_func;
		public Math_funcContext math_func;
		public String_funcContext string_func;
		public Date_funcContext date_func;
		public Token op;
		public ExprContext r_expr;
		public Set_operatorsContext set_operators;
		public Literal_valuesContext literal_values() {
			return getRuleContext(Literal_valuesContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Spec_funcContext spec_func() {
			return getRuleContext(Spec_funcContext.class,0);
		}
		public Math_funcContext math_func() {
			return getRuleContext(Math_funcContext.class,0);
		}
		public String_funcContext string_func() {
			return getRuleContext(String_funcContext.class,0);
		}
		public Date_funcContext date_func() {
			return getRuleContext(Date_funcContext.class,0);
		}
		public Set_operatorsContext set_operators() {
			return getRuleContext(Set_operatorsContext.class,0);
		}
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HiveParser.T_OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(161);
				((ExprContext)_localctx).literal_values = literal_values();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).literal_values.res; 
				}
				break;
			case 2:
				{
				setState(164);
				((ExprContext)_localctx).ident = ident();
				 ((ExprContext)_localctx).res =   ((ExprContext)_localctx).ident.res; 
				}
				break;
			case 3:
				{
				setState(167);
				((ExprContext)_localctx).unary_operator = unary_operator();
				setState(168);
				((ExprContext)_localctx).expr = expr(14);
				 ((ExprContext)_localctx).res =  hql_unary_operator((((ExprContext)_localctx).unary_operator!=null?_input.getText(((ExprContext)_localctx).unary_operator.start,((ExprContext)_localctx).unary_operator.stop):null), ((ExprContext)_localctx).expr.res); 
				}
				break;
			case 4:
				{
				setState(171);
				match(T_OPEN_P);
				setState(172);
				((ExprContext)_localctx).expr = expr(0);
				setState(173);
				match(T_CLOSE_P);
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr.res; 
				}
				break;
			case 5:
				{
				setState(176);
				((ExprContext)_localctx).spec_func = spec_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).spec_func.res; 
				}
				break;
			case 6:
				{
				setState(179);
				((ExprContext)_localctx).math_func = math_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).math_func.res; 
				}
				break;
			case 7:
				{
				setState(182);
				((ExprContext)_localctx).string_func = string_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).string_func.res; 
				}
				break;
			case 8:
				{
				setState(185);
				((ExprContext)_localctx).date_func = date_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).date_func.res; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(191);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T_DIV || _la==T_MUL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(14);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(196);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T_ADD || _la==T_SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(13);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(201);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(12);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(206);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (T_GREATER - 397)) | (1L << (T_GREATEREQUAL - 397)) | (1L << (T_LESS - 397)) | (1L << (T_LESSEQUAL - 397)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(11);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(211);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & ((1L << (T_EQUAL - 393)) | (1L << (T_EQUAL2 - 393)) | (1L << (T_NOTEQUAL - 393)) | (1L << (T_NOTEQUAL2 - 393)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(10);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(216);
						((ExprContext)_localctx).set_operators = set_operators();
						setState(217);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(9);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).set_operators!=null?_input.getText(((ExprContext)_localctx).set_operators.start,((ExprContext)_localctx).set_operators.stop):null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(221);
						((ExprContext)_localctx).op = match(T_AND);
						setState(222);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(8);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(226);
						((ExprContext)_localctx).op = match(T_OR);
						setState(227);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(7);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Date_funcContext extends ParserRuleContext {
		public json res;
		public ExprContext date_expr;
		public ExprContext pattern_expr;
		public ExprContext enddate;
		public ExprContext startdate;
		public ExprContext days;
		public ExprContext ts;
		public ExprContext timezone;
		public ExprContext num_months;
		public ExprContext out_date_format;
		public ExprContext day_of_week;
		public ExprContext format;
		public ExprContext date1;
		public ExprContext date2;
		public TerminalNode T_UNIX_TIMESTAMP() { return getToken(HiveParser.T_UNIX_TIMESTAMP, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_YEAR() { return getToken(HiveParser.T_YEAR, 0); }
		public TerminalNode T_QUARTER() { return getToken(HiveParser.T_QUARTER, 0); }
		public TerminalNode T_MONTH() { return getToken(HiveParser.T_MONTH, 0); }
		public TerminalNode T_DAY() { return getToken(HiveParser.T_DAY, 0); }
		public TerminalNode T_HOUR() { return getToken(HiveParser.T_HOUR, 0); }
		public TerminalNode T_MINUTE() { return getToken(HiveParser.T_MINUTE, 0); }
		public TerminalNode T_SECOND() { return getToken(HiveParser.T_SECOND, 0); }
		public TerminalNode T_WEEKOFYEAR() { return getToken(HiveParser.T_WEEKOFYEAR, 0); }
		public TerminalNode T_DATEDIFF() { return getToken(HiveParser.T_DATEDIFF, 0); }
		public TerminalNode T_DATEADD() { return getToken(HiveParser.T_DATEADD, 0); }
		public TerminalNode T_DATESUB() { return getToken(HiveParser.T_DATESUB, 0); }
		public TerminalNode T_TOUTCTIMESTAMP() { return getToken(HiveParser.T_TOUTCTIMESTAMP, 0); }
		public TerminalNode T_FROMUTCTIMESTAMP() { return getToken(HiveParser.T_FROMUTCTIMESTAMP, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HiveParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HiveParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_ADD_MONTHS() { return getToken(HiveParser.T_ADD_MONTHS, 0); }
		public TerminalNode T_LASTDAY() { return getToken(HiveParser.T_LASTDAY, 0); }
		public TerminalNode T_NEXT_DAY() { return getToken(HiveParser.T_NEXT_DAY, 0); }
		public TerminalNode T_TRUNC() { return getToken(HiveParser.T_TRUNC, 0); }
		public TerminalNode T_MONTHS_BETWEEN() { return getToken(HiveParser.T_MONTHS_BETWEEN, 0); }
		public TerminalNode T_DATE_FORMAT() { return getToken(HiveParser.T_DATE_FORMAT, 0); }
		public Date_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_func; }
	}

	public final Date_funcContext date_func() throws RecognitionException {
		Date_funcContext _localctx = new Date_funcContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_date_func);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T_UNIX_TIMESTAMP);
				setState(236);
				match(T_OPEN_P);
				setState(237);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("UNIX_TIMESTAMP"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(T_UNIX_TIMESTAMP);
				setState(240);
				match(T_OPEN_P);
				setState(241);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(242);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(T_UNIX_TIMESTAMP);
				setState(246);
				match(T_OPEN_P);
				setState(247);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(248);
				match(T_COMMA);
				setState(249);
				((Date_funcContext)_localctx).pattern_expr = expr(0);
				setState(250);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res, "pattern", ((Date_funcContext)_localctx).pattern_expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(T_YEAR);
				setState(254);
				match(T_OPEN_P);
				setState(255);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(256);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("YEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(T_QUARTER);
				setState(260);
				match(T_OPEN_P);
				setState(261);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(262);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("QUARTER", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(265);
				match(T_MONTH);
				setState(266);
				match(T_OPEN_P);
				setState(267);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(268);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MONTH", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(271);
				match(T_DAY);
				setState(272);
				match(T_OPEN_P);
				setState(273);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(274);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
				match(T_HOUR);
				setState(278);
				match(T_OPEN_P);
				setState(279);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(280);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("HOUR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(283);
				match(T_MINUTE);
				setState(284);
				match(T_OPEN_P);
				setState(285);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(286);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MINUTE", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(289);
				match(T_SECOND);
				setState(290);
				match(T_OPEN_P);
				setState(291);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(292);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("SECOND", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(295);
				match(T_WEEKOFYEAR);
				setState(296);
				match(T_OPEN_P);
				setState(297);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(298);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("WEEKOFYEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(301);
				match(T_DATEDIFF);
				setState(302);
				match(T_OPEN_P);
				setState(303);
				((Date_funcContext)_localctx).enddate = expr(0);
				setState(304);
				match(T_COMMA);
				setState(305);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(306);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "enddate", ((Date_funcContext)_localctx).enddate.res, "startdate", ((Date_funcContext)_localctx).startdate.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(309);
				match(T_DATEADD);
				setState(310);
				match(T_OPEN_P);
				setState(311);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(312);
				match(T_COMMA);
				setState(313);
				((Date_funcContext)_localctx).days = expr(0);
				setState(314);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(317);
				match(T_DATESUB);
				setState(318);
				match(T_OPEN_P);
				setState(319);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(320);
				match(T_COMMA);
				setState(321);
				((Date_funcContext)_localctx).days = expr(0);
				setState(322);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(325);
				match(T_TOUTCTIMESTAMP);
				setState(326);
				match(T_OPEN_P);
				setState(327);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(328);
				match(T_COMMA);
				setState(329);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(330);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TO_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(333);
				match(T_FROMUTCTIMESTAMP);
				setState(334);
				match(T_OPEN_P);
				setState(335);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(336);
				match(T_COMMA);
				setState(337);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(338);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("FROM_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(341);
				match(T_CURRENT_DATE);
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(342);
					match(T_OPEN_P);
					setState(343);
					match(T_CLOSE_P);
					}
					break;
				}
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("CURRENT_DATE"); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(347);
				match(T_CURRENT_TIMESTAMP);
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(348);
					match(T_OPEN_P);
					setState(349);
					match(T_CLOSE_P);
					}
					break;
				}
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("T_CURRENT_TIMESTAMP"); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(353);
				match(T_ADD_MONTHS);
				setState(354);
				match(T_OPEN_P);
				setState(355);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(356);
				match(T_COMMA);
				setState(357);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(358);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(361);
				match(T_ADD_MONTHS);
				setState(362);
				match(T_OPEN_P);
				setState(363);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(364);
				match(T_COMMA);
				setState(365);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(366);
				match(T_COMMA);
				setState(367);
				((Date_funcContext)_localctx).out_date_format = expr(0);
				setState(368);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_three_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res, "out_date_format", ((Date_funcContext)_localctx).out_date_format.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(371);
				match(T_LASTDAY);
				setState(372);
				match(T_OPEN_P);
				setState(373);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(374);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("LAST_DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(377);
				match(T_NEXT_DAY);
				setState(378);
				match(T_OPEN_P);
				setState(379);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(380);
				match(T_COMMA);
				setState(381);
				((Date_funcContext)_localctx).day_of_week = expr(0);
				setState(382);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("NEXT_DAY", "startdate", ((Date_funcContext)_localctx).startdate.res, "day_of_week", ((Date_funcContext)_localctx).day_of_week.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(385);
				match(T_TRUNC);
				setState(386);
				match(T_OPEN_P);
				setState(387);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(388);
				match(T_COMMA);
				setState(389);
				((Date_funcContext)_localctx).format = expr(0);
				setState(390);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TRUNC", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(393);
				match(T_MONTHS_BETWEEN);
				setState(394);
				match(T_OPEN_P);
				setState(395);
				((Date_funcContext)_localctx).date1 = expr(0);
				setState(396);
				match(T_COMMA);
				setState(397);
				((Date_funcContext)_localctx).date2 = expr(0);
				setState(398);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("MONTHS_BETWEEN", "date1", ((Date_funcContext)_localctx).date1.res, "date2", ((Date_funcContext)_localctx).date2.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(401);
				match(T_DATE_FORMAT);
				setState(402);
				match(T_OPEN_P);
				setState(403);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(404);
				match(T_COMMA);
				setState(405);
				((Date_funcContext)_localctx).format = expr(0);
				setState(406);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATE_FORMAT", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Spec_funcContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public DtypeContext dtype;
		public ExprContext r;
		public Token T_CURRENT_DATE;
		public Token T_CURRENT_TIMESTAMP;
		public Token T_SYSDATE;
		public Token T_USER;
		public TerminalNode T_CAST() { return getToken(HiveParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HiveParser.T_COUNT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HiveParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HiveParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HiveParser.T_SYSDATE, 0); }
		public TerminalNode T_USER() { return getToken(HiveParser.T_USER, 0); }
		public Spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_func; }
	}

	public final Spec_funcContext spec_func() throws RecognitionException {
		Spec_funcContext _localctx = new Spec_funcContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_spec_func);
		int _la;
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(T_CAST);
				setState(412);
				match(T_OPEN_P);
				setState(413);
				((Spec_funcContext)_localctx).expr = expr(0);
				setState(414);
				match(T_AS);
				setState(415);
				((Spec_funcContext)_localctx).dtype = dtype();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(416);
					dtype_len();
					}
				}

				setState(419);
				match(T_CLOSE_P);
				 ((Spec_funcContext)_localctx).res =  hql_cast_func(((Spec_funcContext)_localctx).expr.res, ((Spec_funcContext)_localctx).dtype.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(T_COUNT);
				setState(423);
				match(T_OPEN_P);
				setState(424);
				((Spec_funcContext)_localctx).r = expr(0);
				setState(425);
				match(T_CLOSE_P);
				 ((Spec_funcContext)_localctx).res =  hql_count_func(((Spec_funcContext)_localctx).r.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(T_COUNT);
				setState(429);
				match(T_OPEN_P);
				setState(430);
				match(T_MUL);
				setState(431);
				match(T_CLOSE_P);
				 ((Spec_funcContext)_localctx).res =  hql_count_all_func(); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				((Spec_funcContext)_localctx).T_CURRENT_DATE = match(T_CURRENT_DATE);
				 ((Spec_funcContext)_localctx).res =  hql_fixed_func((((Spec_funcContext)_localctx).T_CURRENT_DATE!=null?((Spec_funcContext)_localctx).T_CURRENT_DATE.getText():null)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(435);
				((Spec_funcContext)_localctx).T_CURRENT_DATE = match(T_CURRENT_DATE);
				setState(436);
				match(T_OPEN_P);
				setState(437);
				match(T_CLOSE_P);
				 ((Spec_funcContext)_localctx).res =  hql_fixed_func((((Spec_funcContext)_localctx).T_CURRENT_DATE!=null?((Spec_funcContext)_localctx).T_CURRENT_DATE.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(439);
				((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP = match(T_CURRENT_TIMESTAMP);
				 ((Spec_funcContext)_localctx).res =  hql_fixed_func((((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP!=null?((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP.getText():null)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(441);
				((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP = match(T_CURRENT_TIMESTAMP);
				setState(442);
				match(T_OPEN_P);
				setState(443);
				match(T_CLOSE_P);
				 ((Spec_funcContext)_localctx).res =  hql_fixed_func((((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP!=null?((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP.getText():null)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(445);
				((Spec_funcContext)_localctx).T_SYSDATE = match(T_SYSDATE);
				 ((Spec_funcContext)_localctx).res =  hql_fixed_func((((Spec_funcContext)_localctx).T_SYSDATE!=null?((Spec_funcContext)_localctx).T_SYSDATE.getText():null)); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(447);
				((Spec_funcContext)_localctx).T_USER = match(T_USER);
				 ((Spec_funcContext)_localctx).res =  hql_fixed_func((((Spec_funcContext)_localctx).T_USER!=null?((Spec_funcContext)_localctx).T_USER.getText():null)); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_funcContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public ExprContext fst;
		public ExprContext snd;
		public Token T_RAND;
		public ExprContext base;
		public ExprContext e;
		public ExprContext fbase;
		public ExprContext tbase;
		public ExprContext a;
		public ExprContext b;
		public TerminalNode T_ROUND() { return getToken(HiveParser.T_ROUND, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public TerminalNode T_FLOOR() { return getToken(HiveParser.T_FLOOR, 0); }
		public TerminalNode T_CEIL() { return getToken(HiveParser.T_CEIL, 0); }
		public TerminalNode T_CEILING() { return getToken(HiveParser.T_CEILING, 0); }
		public TerminalNode T_RAND() { return getToken(HiveParser.T_RAND, 0); }
		public TerminalNode T_EXP() { return getToken(HiveParser.T_EXP, 0); }
		public TerminalNode T_LN() { return getToken(HiveParser.T_LN, 0); }
		public TerminalNode T_LOG10() { return getToken(HiveParser.T_LOG10, 0); }
		public TerminalNode T_LOG2() { return getToken(HiveParser.T_LOG2, 0); }
		public TerminalNode T_LOG() { return getToken(HiveParser.T_LOG, 0); }
		public TerminalNode T_POW() { return getToken(HiveParser.T_POW, 0); }
		public TerminalNode T_POWER() { return getToken(HiveParser.T_POWER, 0); }
		public TerminalNode T_SQRT() { return getToken(HiveParser.T_SQRT, 0); }
		public TerminalNode T_BIN() { return getToken(HiveParser.T_BIN, 0); }
		public TerminalNode T_HEX() { return getToken(HiveParser.T_HEX, 0); }
		public TerminalNode T_UNHEX() { return getToken(HiveParser.T_UNHEX, 0); }
		public TerminalNode T_CONV() { return getToken(HiveParser.T_CONV, 0); }
		public TerminalNode T_ABS() { return getToken(HiveParser.T_ABS, 0); }
		public TerminalNode T_PMOD() { return getToken(HiveParser.T_PMOD, 0); }
		public TerminalNode T_SIN() { return getToken(HiveParser.T_SIN, 0); }
		public TerminalNode T_ASIN() { return getToken(HiveParser.T_ASIN, 0); }
		public TerminalNode T_COS() { return getToken(HiveParser.T_COS, 0); }
		public TerminalNode T_ACOS() { return getToken(HiveParser.T_ACOS, 0); }
		public TerminalNode T_TAN() { return getToken(HiveParser.T_TAN, 0); }
		public TerminalNode T_ATAN() { return getToken(HiveParser.T_ATAN, 0); }
		public TerminalNode T_DEGREES() { return getToken(HiveParser.T_DEGREES, 0); }
		public TerminalNode T_RADIANS() { return getToken(HiveParser.T_RADIANS, 0); }
		public TerminalNode T_POSITIVE() { return getToken(HiveParser.T_POSITIVE, 0); }
		public TerminalNode T_NEGATIVE() { return getToken(HiveParser.T_NEGATIVE, 0); }
		public TerminalNode T_SIGN() { return getToken(HiveParser.T_SIGN, 0); }
		public TerminalNode T_FACTORIAL() { return getToken(HiveParser.T_FACTORIAL, 0); }
		public TerminalNode T_CBR() { return getToken(HiveParser.T_CBR, 0); }
		public Math_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_func; }
	}

	public final Math_funcContext math_func() throws RecognitionException {
		Math_funcContext _localctx = new Math_funcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_math_func);
		int _la;
		try {
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(T_ROUND);
				setState(452);
				match(T_OPEN_P);
				setState(453);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(454);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ROUND", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(T_ROUND);
				setState(458);
				match(T_OPEN_P);
				setState(459);
				((Math_funcContext)_localctx).fst = expr(0);
				setState(460);
				match(T_COMMA);
				setState(461);
				((Math_funcContext)_localctx).snd = expr(0);
				setState(462);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("ROUND", "expr", ((Math_funcContext)_localctx).fst.res, "decimal_places", ((Math_funcContext)_localctx).snd.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(T_FLOOR);
				setState(466);
				match(T_OPEN_P);
				setState(467);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(468);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FLOOR", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				_la = _input.LA(1);
				if ( !(_la==T_CEIL || _la==T_CEILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(472);
				match(T_OPEN_P);
				setState(473);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(474);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("CEIL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(477);
				((Math_funcContext)_localctx).T_RAND = match(T_RAND);
				setState(478);
				match(T_OPEN_P);
				setState(479);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func((((Math_funcContext)_localctx).T_RAND!=null?((Math_funcContext)_localctx).T_RAND.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
				match(T_RAND);
				setState(482);
				match(T_OPEN_P);
				setState(483);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(484);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RAND", "seed", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(487);
				match(T_EXP);
				setState(488);
				match(T_OPEN_P);
				setState(489);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(490);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("EXP", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(493);
				match(T_LN);
				setState(494);
				match(T_OPEN_P);
				setState(495);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(496);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(499);
				match(T_LOG10);
				setState(500);
				match(T_OPEN_P);
				setState(501);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(502);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG10", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(505);
				match(T_LOG2);
				setState(506);
				match(T_OPEN_P);
				setState(507);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(508);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG2", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(511);
				match(T_LOG);
				setState(512);
				match(T_OPEN_P);
				setState(513);
				((Math_funcContext)_localctx).base = expr(0);
				setState(514);
				match(T_COMMA);
				setState(515);
				((Math_funcContext)_localctx).e = expr(0);
				setState(516);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("LOG", "base", ((Math_funcContext)_localctx).base.res, "expr", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(519);
				_la = _input.LA(1);
				if ( !(_la==T_POW || _la==T_POWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(520);
				match(T_OPEN_P);
				setState(521);
				((Math_funcContext)_localctx).base = expr(0);
				setState(522);
				match(T_COMMA);
				setState(523);
				((Math_funcContext)_localctx).e = expr(0);
				setState(524);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("POWER", "base", ((Math_funcContext)_localctx).base.res, "exp", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(527);
				match(T_SQRT);
				setState(528);
				match(T_OPEN_P);
				setState(529);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(530);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SQRT", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(533);
				match(T_BIN);
				setState(534);
				match(T_OPEN_P);
				setState(535);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(536);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("BIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(539);
				match(T_HEX);
				setState(540);
				match(T_OPEN_P);
				setState(541);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(542);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("HEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(545);
				match(T_UNHEX);
				setState(546);
				match(T_OPEN_P);
				setState(547);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(548);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("UNHEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(551);
				match(T_CONV);
				setState(552);
				match(T_OPEN_P);
				setState(553);
				((Math_funcContext)_localctx).e = expr(0);
				setState(554);
				match(T_COMMA);
				setState(555);
				((Math_funcContext)_localctx).fbase = expr(0);
				setState(556);
				match(T_COMMA);
				setState(557);
				((Math_funcContext)_localctx).tbase = expr(0);
				setState(558);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_three_param_func("CONV", "expr", ((Math_funcContext)_localctx).e.res, "from_base", ((Math_funcContext)_localctx).fbase.res, "to_base", ((Math_funcContext)_localctx).tbase.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(561);
				match(T_ABS);
				setState(562);
				match(T_OPEN_P);
				setState(563);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(564);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ABS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(567);
				match(T_PMOD);
				setState(568);
				match(T_OPEN_P);
				setState(569);
				((Math_funcContext)_localctx).a = expr(0);
				setState(570);
				match(T_COMMA);
				setState(571);
				((Math_funcContext)_localctx).b = expr(0);
				setState(572);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("PMOD", "a", ((Math_funcContext)_localctx).a.res, "b", ((Math_funcContext)_localctx).b.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(575);
				match(T_SIN);
				setState(576);
				match(T_OPEN_P);
				setState(577);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(578);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(581);
				match(T_ASIN);
				setState(582);
				match(T_OPEN_P);
				setState(583);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(584);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ASIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(587);
				match(T_COS);
				setState(588);
				match(T_OPEN_P);
				setState(589);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(590);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("COS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(593);
				match(T_ACOS);
				setState(594);
				match(T_OPEN_P);
				setState(595);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(596);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ACOS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(599);
				match(T_TAN);
				setState(600);
				match(T_OPEN_P);
				setState(601);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(602);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("TAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(605);
				match(T_ATAN);
				setState(606);
				match(T_OPEN_P);
				setState(607);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(608);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ATAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(611);
				match(T_DEGREES);
				setState(612);
				match(T_OPEN_P);
				setState(613);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(614);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("DEGREES", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(617);
				match(T_RADIANS);
				setState(618);
				match(T_OPEN_P);
				setState(619);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(620);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RADIANS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(623);
				match(T_POSITIVE);
				setState(624);
				match(T_OPEN_P);
				setState(625);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(626);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("POSITIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(629);
				match(T_NEGATIVE);
				setState(630);
				match(T_OPEN_P);
				setState(631);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(632);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("NEGATIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(635);
				match(T_SIGN);
				setState(636);
				match(T_OPEN_P);
				setState(637);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(638);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIGN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(641);
				match(T__5);
				setState(642);
				match(T_OPEN_P);
				setState(643);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("EULER_CONST"); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(645);
				match(T__6);
				setState(646);
				match(T_OPEN_P);
				setState(647);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("PI_CONST"); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(649);
				match(T_FACTORIAL);
				setState(650);
				match(T_OPEN_P);
				setState(651);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(652);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FACTORIAL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(655);
				match(T_CBR);
				setState(656);
				match(T_OPEN_P);
				setState(657);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(658);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("CUBE_ROOT", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_funcContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public TerminalNode T_TRIM() { return getToken(HiveParser.T_TRIM, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public TerminalNode T_UPPER() { return getToken(HiveParser.T_UPPER, 0); }
		public TerminalNode T_LOWER() { return getToken(HiveParser.T_LOWER, 0); }
		public String_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_func; }
	}

	public final String_funcContext string_func() throws RecognitionException {
		String_funcContext _localctx = new String_funcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string_func);
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_TRIM:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				match(T_TRIM);
				setState(664);
				match(T_OPEN_P);
				setState(665);
				((String_funcContext)_localctx).expr = expr(0);
				setState(666);
				match(T_CLOSE_P);
				 ((String_funcContext)_localctx).res =  hql_single_param_func("TRIM", "expr", ((String_funcContext)_localctx).expr.res); 
				}
				break;
			case T_UPPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				match(T_UPPER);
				setState(670);
				match(T_OPEN_P);
				setState(671);
				((String_funcContext)_localctx).expr = expr(0);
				setState(672);
				match(T_CLOSE_P);
				 ((String_funcContext)_localctx).res =  hql_single_param_func("UPPER", "expr", ((String_funcContext)_localctx).expr.res); 
				}
				break;
			case T_LOWER:
				enterOuterAlt(_localctx, 3);
				{
				setState(675);
				match(T_LOWER);
				setState(676);
				match(T_OPEN_P);
				setState(677);
				((String_funcContext)_localctx).expr = expr(0);
				setState(678);
				match(T_CLOSE_P);
				 ((String_funcContext)_localctx).res =  hql_single_param_func("LOWER", "expr", ((String_funcContext)_localctx).expr.res); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valuesContext extends ParserRuleContext {
		public json res;
		public Token STRING_LITERAL;
		public Token DECIMAL_LITERAL;
		public Token INT_LITERAL;
		public Token BOOL_LITERAL;
		public Date_literalContext date_literal;
		public Timestamp_literalContext timestamp_literal;
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(HiveParser.DECIMAL_LITERAL, 0); }
		public TerminalNode INT_LITERAL() { return getToken(HiveParser.INT_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(HiveParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_CONST() { return getToken(HiveParser.NULL_CONST, 0); }
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Literal_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_values; }
	}

	public final Literal_valuesContext literal_values() throws RecognitionException {
		Literal_valuesContext _localctx = new Literal_valuesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal_values);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				((Literal_valuesContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_string_type((((Literal_valuesContext)_localctx).STRING_LITERAL!=null?((Literal_valuesContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				((Literal_valuesContext)_localctx).DECIMAL_LITERAL = match(DECIMAL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_decimal_type((((Literal_valuesContext)_localctx).DECIMAL_LITERAL!=null?((Literal_valuesContext)_localctx).DECIMAL_LITERAL.getText():null)); 
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				((Literal_valuesContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_int_type((((Literal_valuesContext)_localctx).INT_LITERAL!=null?((Literal_valuesContext)_localctx).INT_LITERAL.getText():null)); 
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(689);
				((Literal_valuesContext)_localctx).BOOL_LITERAL = match(BOOL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_boolean_type((((Literal_valuesContext)_localctx).BOOL_LITERAL!=null?((Literal_valuesContext)_localctx).BOOL_LITERAL.getText():null)); 
				}
				break;
			case NULL_CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(691);
				match(NULL_CONST);
				 ((Literal_valuesContext)_localctx).res =  hql_null_constant(); 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(693);
				((Literal_valuesContext)_localctx).date_literal = date_literal();
				 ((Literal_valuesContext)_localctx).res =  hql_type_date_literal(((Literal_valuesContext)_localctx).date_literal.res); 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(696);
				((Literal_valuesContext)_localctx).timestamp_literal = timestamp_literal();
				 ((Literal_valuesContext)_localctx).res =  hql_type_timestamp_literal(((Literal_valuesContext)_localctx).timestamp_literal.res); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public json res;
		public Token database;
		public Token tablename;
		public Token field;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HiveParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HiveParser.IDENTIFIER, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(701);
				((IdentContext)_localctx).database = match(IDENTIFIER);
				setState(702);
				match(T__7);
				}
				break;
			}
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(705);
				((IdentContext)_localctx).tablename = match(IDENTIFIER);
				setState(706);
				match(T__7);
				}
				break;
			}
			setState(709);
			((IdentContext)_localctx).field = match(IDENTIFIER);
			 ((IdentContext)_localctx).res =  hql_type_identifier((((IdentContext)_localctx).database!=null?((IdentContext)_localctx).database.getText():null), (((IdentContext)_localctx).tablename!=null?((IdentContext)_localctx).tablename.getText():null), (((IdentContext)_localctx).field!=null?((IdentContext)_localctx).field.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public string res;
		public Token STRING_LITERAL;
		public TerminalNode T_DATE() { return getToken(HiveParser.T_DATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(T_DATE);
			setState(713);
			((Date_literalContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
			 ((Date_literalContext)_localctx).res =  (((Date_literalContext)_localctx).STRING_LITERAL!=null?((Date_literalContext)_localctx).STRING_LITERAL.getText():null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public string res;
		public Token STRING_LITERAL;
		public TerminalNode T_TIMESTAMP() { return getToken(HiveParser.T_TIMESTAMP, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(T_TIMESTAMP);
			setState(717);
			((Timestamp_literalContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
			 ((Timestamp_literalContext)_localctx).res =  (((Timestamp_literalContext)_localctx).STRING_LITERAL!=null?((Timestamp_literalContext)_localctx).STRING_LITERAL.getText():null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_operatorsContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(HiveParser.T_IS, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public TerminalNode T_IN() { return getToken(HiveParser.T_IN, 0); }
		public Set_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_operators; }
	}

	public final Set_operatorsContext set_operators() throws RecognitionException {
		Set_operatorsContext _localctx = new Set_operatorsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_set_operators);
		try {
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				match(T_IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(T_IS);
				setState(722);
				match(T_NOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				match(T_IN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(724);
				match(T_NOT);
				setState(725);
				match(T_IN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T_NOT || _la==T_ADD || _la==T_SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01a3\u02dd\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4G\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0080\n\4\3\4\3\4\5\4\u0084\n\4\3\5\3\5\3"+
		"\5\5\5\u0089\n\5\3\5\3\5\5\5\u008d\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bf\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00e9\n\t\f\t\16\t\u00ec\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u015b\n\n\3\n\3\n"+
		"\3\n\3\n\5\n\u0161\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u019c\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u01a4\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u01c4\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0298\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u02ac\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u02be\n\16\3\17\3\17\5\17\u02c2\n\17\3"+
		"\17\3\17\5\17\u02c6\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u02d9\n\22\3\23\3\23\3\23"+
		"\2\3\20\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\r\4\2\u0118\u0118"+
		"\u0151\u0151\4\2\u00c9\u00c9\u01a0\u01a0\4\2##,,\5\2\3\3\u0189\u0189\u0193"+
		"\u0193\4\2\u0185\u0185\u019b\u019b\3\2\4\7\3\2\u018f\u0192\3\2\u018b\u018e"+
		"\3\2*+\3\2\u00f6\u00f7\6\2\13\13\u00de\u00de\u0185\u0185\u019b\u019b\2"+
		"\u0352\2&\3\2\2\2\4*\3\2\2\2\6\u0083\3\2\2\2\b\u0085\3\2\2\2\n\u0090\3"+
		"\2\2\2\f\u0093\3\2\2\2\16\u0096\3\2\2\2\20\u00be\3\2\2\2\22\u019b\3\2"+
		"\2\2\24\u01c3\3\2\2\2\26\u0297\3\2\2\2\30\u02ab\3\2\2\2\32\u02bd\3\2\2"+
		"\2\34\u02c1\3\2\2\2\36\u02ca\3\2\2\2 \u02ce\3\2\2\2\"\u02d8\3\2\2\2$\u02da"+
		"\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3()\b\2\1\2)\3\3\2\2\2*.\b\3\1\2+,\5\n\6"+
		"\2,-\7\u019a\2\2-/\3\2\2\2.+\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2"+
		"\2\2\61\62\3\2\2\2\62\63\b\3\1\2\63\5\3\2\2\2\64\65\7,\2\2\65\u0084\b"+
		"\4\1\2\66\67\7-\2\2\67\u0084\b\4\1\289\7\35\2\29\u0084\b\4\1\2:;\7\37"+
		"\2\2;\u0084\b\4\1\2<=\7L\2\2=\u0084\b\4\1\2>?\7Q\2\2?\u0084\b\4\1\2@A"+
		"\7T\2\2A\u0084\b\4\1\2BC\7U\2\2C\u0084\b\4\1\2DF\7h\2\2EG\7\u00f8\2\2"+
		"FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2H\u0084\b\4\1\2IJ\7\u0081\2\2J\u0084\b\4"+
		"\1\2KL\7\u00a3\2\2L\u0084\b\4\1\2MN\7\u00a4\2\2N\u0084\b\4\1\2OP\7\u00a5"+
		"\2\2P\u0084\b\4\1\2QR\7\u00a6\2\2R\u0084\b\4\1\2ST\7\u00a7\2\2T\u0084"+
		"\b\4\1\2UV\7\u00d4\2\2V\u0084\b\4\1\2WX\7\u00d8\2\2X\u0084\b\4\1\2YZ\7"+
		"\u00e2\2\2Z\u0084\b\4\1\2[\\\7\u00e1\2\2\\\u0084\b\4\1\2]^\7\u00f3\2\2"+
		"^\u0084\b\4\1\2_`\7\u0106\2\2`\u0084\b\4\1\2ab\7\u010d\2\2bc\7\u0160\2"+
		"\2c\u0084\b\4\1\2de\7\u012a\2\2e\u0084\b\4\1\2fg\7\u0129\2\2g\u0084\b"+
		"\4\1\2hi\7\u012b\2\2i\u0084\b\4\1\2jk\7\u012d\2\2k\u0084\b\4\1\2lm\7\u012c"+
		"\2\2m\u0084\b\4\1\2no\7\u0139\2\2o\u0084\b\4\1\2pq\7\u013f\2\2q\u0084"+
		"\b\4\1\2rs\7\u0147\2\2s\u0084\b\4\1\2tu\7\u0148\2\2u\u0084\b\4\1\2vw\7"+
		"\u015e\2\2w\u0084\b\4\1\2xy\7\u015f\2\2y\u0084\b\4\1\2z{\7\u016a\2\2{"+
		"\u0084\b\4\1\2|\177\5\34\17\2}~\7\3\2\2~\u0080\t\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\4\1\2\u0082\u0084\3\2"+
		"\2\2\u0083\64\3\2\2\2\u0083\66\3\2\2\2\u00838\3\2\2\2\u0083:\3\2\2\2\u0083"+
		"<\3\2\2\2\u0083>\3\2\2\2\u0083@\3\2\2\2\u0083B\3\2\2\2\u0083D\3\2\2\2"+
		"\u0083I\3\2\2\2\u0083K\3\2\2\2\u0083M\3\2\2\2\u0083O\3\2\2\2\u0083Q\3"+
		"\2\2\2\u0083S\3\2\2\2\u0083U\3\2\2\2\u0083W\3\2\2\2\u0083Y\3\2\2\2\u0083"+
		"[\3\2\2\2\u0083]\3\2\2\2\u0083_\3\2\2\2\u0083a\3\2\2\2\u0083d\3\2\2\2"+
		"\u0083f\3\2\2\2\u0083h\3\2\2\2\u0083j\3\2\2\2\u0083l\3\2\2\2\u0083n\3"+
		"\2\2\2\u0083p\3\2\2\2\u0083r\3\2\2\2\u0083t\3\2\2\2\u0083v\3\2\2\2\u0083"+
		"x\3\2\2\2\u0083z\3\2\2\2\u0083|\3\2\2\2\u0084\7\3\2\2\2\u0085\u0086\7"+
		"\u0195\2\2\u0086\u0088\t\3\2\2\u0087\u0089\t\4\2\2\u0088\u0087\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b\7\u0187\2\2\u008b"+
		"\u008d\7\u01a0\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\7\u0198\2\2\u008f\t\3\2\2\2\u0090\u0091\5\f\7\2\u0091"+
		"\u0092\b\6\1\2\u0092\13\3\2\2\2\u0093\u0094\5\16\b\2\u0094\u0095\b\7\1"+
		"\2\u0095\r\3\2\2\2\u0096\u0097\b\b\1\2\u0097\u0098\7\u0124\2\2\u0098\u009d"+
		"\5\20\t\2\u0099\u009a\7\u0187\2\2\u009a\u009c\5\20\t\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\b\b\1\2\u00a1\17\3\2\2"+
		"\2\u00a2\u00a3\b\t\1\2\u00a3\u00a4\5\32\16\2\u00a4\u00a5\b\t\1\2\u00a5"+
		"\u00bf\3\2\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\b\t\1\2\u00a8\u00bf\3"+
		"\2\2\2\u00a9\u00aa\5$\23\2\u00aa\u00ab\5\20\t\20\u00ab\u00ac\b\t\1\2\u00ac"+
		"\u00bf\3\2\2\2\u00ad\u00ae\7\u0195\2\2\u00ae\u00af\5\20\t\2\u00af\u00b0"+
		"\7\u0198\2\2\u00b0\u00b1\b\t\1\2\u00b1\u00bf\3\2\2\2\u00b2\u00b3\5\24"+
		"\13\2\u00b3\u00b4\b\t\1\2\u00b4\u00bf\3\2\2\2\u00b5\u00b6\5\26\f\2\u00b6"+
		"\u00b7\b\t\1\2\u00b7\u00bf\3\2\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\b"+
		"\t\1\2\u00ba\u00bf\3\2\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\b\t\1\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00a2\3\2\2\2\u00be\u00a6\3\2\2\2\u00be\u00a9\3\2"+
		"\2\2\u00be\u00ad\3\2\2\2\u00be\u00b2\3\2\2\2\u00be\u00b5\3\2\2\2\u00be"+
		"\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\u00ea\3\2\2\2\u00c0\u00c1\f\17"+
		"\2\2\u00c1\u00c2\t\5\2\2\u00c2\u00c3\5\20\t\20\u00c3\u00c4\b\t\1\2\u00c4"+
		"\u00e9\3\2\2\2\u00c5\u00c6\f\16\2\2\u00c6\u00c7\t\6\2\2\u00c7\u00c8\5"+
		"\20\t\17\u00c8\u00c9\b\t\1\2\u00c9\u00e9\3\2\2\2\u00ca\u00cb\f\r\2\2\u00cb"+
		"\u00cc\t\7\2\2\u00cc\u00cd\5\20\t\16\u00cd\u00ce\b\t\1\2\u00ce\u00e9\3"+
		"\2\2\2\u00cf\u00d0\f\f\2\2\u00d0\u00d1\t\b\2\2\u00d1\u00d2\5\20\t\r\u00d2"+
		"\u00d3\b\t\1\2\u00d3\u00e9\3\2\2\2\u00d4\u00d5\f\13\2\2\u00d5\u00d6\t"+
		"\t\2\2\u00d6\u00d7\5\20\t\f\u00d7\u00d8\b\t\1\2\u00d8\u00e9\3\2\2\2\u00d9"+
		"\u00da\f\n\2\2\u00da\u00db\5\"\22\2\u00db\u00dc\5\20\t\13\u00dc\u00dd"+
		"\b\t\1\2\u00dd\u00e9\3\2\2\2\u00de\u00df\f\t\2\2\u00df\u00e0\7\23\2\2"+
		"\u00e0\u00e1\5\20\t\n\u00e1\u00e2\b\t\1\2\u00e2\u00e9\3\2\2\2\u00e3\u00e4"+
		"\f\b\2\2\u00e4\u00e5\7\u00e8\2\2\u00e5\u00e6\5\20\t\t\u00e6\u00e7\b\t"+
		"\1\2\u00e7\u00e9\3\2\2\2\u00e8\u00c0\3\2\2\2\u00e8\u00c5\3\2\2\2\u00e8"+
		"\u00ca\3\2\2\2\u00e8\u00cf\3\2\2\2\u00e8\u00d4\3\2\2\2\u00e8\u00d9\3\2"+
		"\2\2\u00e8\u00de\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\21\3\2\2\2\u00ec\u00ea\3\2\2"+
		"\2\u00ed\u00ee\7\u0155\2\2\u00ee\u00ef\7\u0195\2\2\u00ef\u00f0\7\u0198"+
		"\2\2\u00f0\u019c\b\n\1\2\u00f1\u00f2\7\u0155\2\2\u00f2\u00f3\7\u0195\2"+
		"\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5\7\u0198\2\2\u00f5\u00f6\b\n\1\2\u00f6"+
		"\u019c\3\2\2\2\u00f7\u00f8\7\u0155\2\2\u00f8\u00f9\7\u0195\2\2\u00f9\u00fa"+
		"\5\20\t\2\u00fa\u00fb\7\u0187\2\2\u00fb\u00fc\5\20\t\2\u00fc\u00fd\7\u0198"+
		"\2\2\u00fd\u00fe\b\n\1\2\u00fe\u019c\3\2\2\2\u00ff\u0100\7\u016b\2\2\u0100"+
		"\u0101\7\u0195\2\2\u0101\u0102\5\20\t\2\u0102\u0103\7\u0198\2\2\u0103"+
		"\u0104\b\n\1\2\u0104\u019c\3\2\2\2\u0105\u0106\7\u00ff\2\2\u0106\u0107"+
		"\7\u0195\2\2\u0107\u0108\5\20\t\2\u0108\u0109\7\u0198\2\2\u0109\u010a"+
		"\b\n\1\2\u010a\u019c\3\2\2\2\u010b\u010c\7\u00d1\2\2\u010c\u010d\7\u0195"+
		"\2\2\u010d\u010e\5\20\t\2\u010e\u010f\7\u0198\2\2\u010f\u0110\b\n\1\2"+
		"\u0110\u019c\3\2\2\2\u0111\u0112\7R\2\2\u0112\u0113\7\u0195\2\2\u0113"+
		"\u0114\5\20\t\2\u0114\u0115\7\u0198\2\2\u0115\u0116\b\n\1\2\u0116\u019c"+
		"\3\2\2\2\u0117\u0118\7\u0097\2\2\u0118\u0119\7\u0195\2\2\u0119\u011a\5"+
		"\20\t\2\u011a\u011b\7\u0198\2\2\u011b\u011c\b\n\1\2\u011c\u019c\3\2\2"+
		"\2\u011d\u011e\7\u00d0\2\2\u011e\u011f\7\u0195\2\2\u011f\u0120\5\20\t"+
		"\2\u0120\u0121\7\u0198\2\2\u0121\u0122\b\n\1\2\u0122\u019c\3\2\2\2\u0123"+
		"\u0124\7\u011f\2\2\u0124\u0125\7\u0195\2\2\u0125\u0126\5\20\t\2\u0126"+
		"\u0127\7\u0198\2\2\u0127\u0128\b\n\1\2\u0128\u019c\3\2\2\2\u0129\u012a"+
		"\7\u0162\2\2\u012a\u012b\7\u0195\2\2\u012b\u012c\5\20\t\2\u012c\u012d"+
		"\7\u0198\2\2\u012d\u012e\b\n\1\2\u012e\u019c\3\2\2\2\u012f\u0130\7N\2"+
		"\2\u0130\u0131\7\u0195\2\2\u0131\u0132\5\20\t\2\u0132\u0133\7\u0187\2"+
		"\2\u0133\u0134\5\20\t\2\u0134\u0135\7\u0198\2\2\u0135\u0136\b\n\1\2\u0136"+
		"\u019c\3\2\2\2\u0137\u0138\7M\2\2\u0138\u0139\7\u0195\2\2\u0139\u013a"+
		"\5\20\t\2\u013a\u013b\7\u0187\2\2\u013b\u013c\5\20\t\2\u013c\u013d\7\u0198"+
		"\2\2\u013d\u013e\b\n\1\2\u013e\u019c\3\2\2\2\u013f\u0140\7P\2\2\u0140"+
		"\u0141\7\u0195\2\2\u0141\u0142\5\20\t\2\u0142\u0143\7\u0187\2\2\u0143"+
		"\u0144\5\20\t\2\u0144\u0145\7\u0198\2\2\u0145\u0146\b\n\1\2\u0146\u019c"+
		"\3\2\2\2\u0147\u0148\7\u014c\2\2\u0148\u0149\7\u0195\2\2\u0149\u014a\5"+
		"\20\t\2\u014a\u014b\7\u0187\2\2\u014b\u014c\5\20\t\2\u014c\u014d\7\u0198"+
		"\2\2\u014d\u014e\b\n\1\2\u014e\u019c\3\2\2\2\u014f\u0150\7\u0088\2\2\u0150"+
		"\u0151\7\u0195\2\2\u0151\u0152\5\20\t\2\u0152\u0153\7\u0187\2\2\u0153"+
		"\u0154\5\20\t\2\u0154\u0155\7\u0198\2\2\u0155\u0156\b\n\1\2\u0156\u019c"+
		"\3\2\2\2\u0157\u015a\7\u016f\2\2\u0158\u0159\7\u0195\2\2\u0159\u015b\7"+
		"\u0198\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2"+
		"\u015c\u019c\b\n\1\2\u015d\u0160\7\u0170\2\2\u015e\u015f\7\u0195\2\2\u015f"+
		"\u0161\7\u0198\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u019c\b\n\1\2\u0163\u0164\7\20\2\2\u0164\u0165\7\u0195"+
		"\2\2\u0165\u0166\5\20\t\2\u0166\u0167\7\u0187\2\2\u0167\u0168\5\20\t\2"+
		"\u0168\u0169\7\u0198\2\2\u0169\u016a\b\n\1\2\u016a\u019c\3\2\2\2\u016b"+
		"\u016c\7\20\2\2\u016c\u016d\7\u0195\2\2\u016d\u016e\5\20\t\2\u016e\u016f"+
		"\7\u0187\2\2\u016f\u0170\5\20\t\2\u0170\u0171\7\u0187\2\2\u0171\u0172"+
		"\5\20\t\2\u0172\u0173\7\u0198\2\2\u0173\u0174\b\n\1\2\u0174\u019c\3\2"+
		"\2\2\u0175\u0176\7\u00b4\2\2\u0176\u0177\7\u0195\2\2\u0177\u0178\5\20"+
		"\t\2\u0178\u0179\7\u0198\2\2\u0179\u017a\b\n\1\2\u017a\u019c\3\2\2\2\u017b"+
		"\u017c\7\u00d6\2\2\u017c\u017d\7\u0195\2\2\u017d\u017e\5\20\t\2\u017e"+
		"\u017f\7\u0187\2\2\u017f\u0180\5\20\t\2\u0180\u0181\7\u0198\2\2\u0181"+
		"\u0182\b\n\1\2\u0182\u019c\3\2\2\2\u0183\u0184\7\u0150\2\2\u0184\u0185"+
		"\7\u0195\2\2\u0185\u0186\5\20\t\2\u0186\u0187\7\u0187\2\2\u0187\u0188"+
		"\5\20\t\2\u0188\u0189\7\u0198\2\2\u0189\u018a\b\n\1\2\u018a\u019c\3\2"+
		"\2\2\u018b\u018c\7\u00d2\2\2\u018c\u018d\7\u0195\2\2\u018d\u018e\5\20"+
		"\t\2\u018e\u018f\7\u0187\2\2\u018f\u0190\5\20\t\2\u0190\u0191\7\u0198"+
		"\2\2\u0191\u0192\b\n\1\2\u0192\u019c\3\2\2\2\u0193\u0194\7O\2\2\u0194"+
		"\u0195\7\u0195\2\2\u0195\u0196\5\20\t\2\u0196\u0197\7\u0187\2\2\u0197"+
		"\u0198\5\20\t\2\u0198\u0199\7\u0198\2\2\u0199\u019a\b\n\1\2\u019a\u019c"+
		"\3\2\2\2\u019b\u00ed\3\2\2\2\u019b\u00f1\3\2\2\2\u019b\u00f7\3\2\2\2\u019b"+
		"\u00ff\3\2\2\2\u019b\u0105\3\2\2\2\u019b\u010b\3\2\2\2\u019b\u0111\3\2"+
		"\2\2\u019b\u0117\3\2\2\2\u019b\u011d\3\2\2\2\u019b\u0123\3\2\2\2\u019b"+
		"\u0129\3\2\2\2\u019b\u012f\3\2\2\2\u019b\u0137\3\2\2\2\u019b\u013f\3\2"+
		"\2\2\u019b\u0147\3\2\2\2\u019b\u014f\3\2\2\2\u019b\u0157\3\2\2\2\u019b"+
		"\u015d\3\2\2\2\u019b\u0163\3\2\2\2\u019b\u016b\3\2\2\2\u019b\u0175\3\2"+
		"\2\2\u019b\u017b\3\2\2\2\u019b\u0183\3\2\2\2\u019b\u018b\3\2\2\2\u019b"+
		"\u0193\3\2\2\2\u019c\23\3\2\2\2\u019d\u019e\7(\2\2\u019e\u019f\7\u0195"+
		"\2\2\u019f\u01a0\5\20\t\2\u01a0\u01a1\7\24\2\2\u01a1\u01a3\5\6\4\2\u01a2"+
		"\u01a4\5\b\5\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a6\7\u0198\2\2\u01a6\u01a7\b\13\1\2\u01a7\u01c4\3\2\2\2"+
		"\u01a8\u01a9\7A\2\2\u01a9\u01aa\7\u0195\2\2\u01aa\u01ab\5\20\t\2\u01ab"+
		"\u01ac\7\u0198\2\2\u01ac\u01ad\b\13\1\2\u01ad\u01c4\3\2\2\2\u01ae\u01af"+
		"\7A\2\2\u01af\u01b0\7\u0195\2\2\u01b0\u01b1\7\u0193\2\2\u01b1\u01b2\7"+
		"\u0198\2\2\u01b2\u01c4\b\13\1\2\u01b3\u01b4\7\u016f\2\2\u01b4\u01c4\b"+
		"\13\1\2\u01b5\u01b6\7\u016f\2\2\u01b6\u01b7\7\u0195\2\2\u01b7\u01b8\7"+
		"\u0198\2\2\u01b8\u01c4\b\13\1\2\u01b9\u01ba\7\u0170\2\2\u01ba\u01c4\b"+
		"\13\1\2\u01bb\u01bc\7\u0170\2\2\u01bc\u01bd\7\u0195\2\2\u01bd\u01be\7"+
		"\u0198\2\2\u01be\u01c4\b\13\1\2\u01bf\u01c0\7\u0182\2\2\u01c0\u01c4\b"+
		"\13\1\2\u01c1\u01c2\7\u0184\2\2\u01c2\u01c4\b\13\1\2\u01c3\u019d\3\2\2"+
		"\2\u01c3\u01a8\3\2\2\2\u01c3\u01ae\3\2\2\2\u01c3\u01b3\3\2\2\2\u01c3\u01b5"+
		"\3\2\2\2\u01c3\u01b9\3\2\2\2\u01c3\u01bb\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\25\3\2\2\2\u01c5\u01c6\7\u0115\2\2\u01c6\u01c7\7"+
		"\u0195\2\2\u01c7\u01c8\5\20\t\2\u01c8\u01c9\7\u0198\2\2\u01c9\u01ca\b"+
		"\f\1\2\u01ca\u0298\3\2\2\2\u01cb\u01cc\7\u0115\2\2\u01cc\u01cd\7\u0195"+
		"\2\2\u01cd\u01ce\5\20\t\2\u01ce\u01cf\7\u0187\2\2\u01cf\u01d0\5\20\t\2"+
		"\u01d0\u01d1\7\u0198\2\2\u01d1\u01d2\b\f\1\2\u01d2\u0298\3\2\2\2\u01d3"+
		"\u01d4\7\u0082\2\2\u01d4\u01d5\7\u0195\2\2\u01d5\u01d6\5\20\t\2\u01d6"+
		"\u01d7\7\u0198\2\2\u01d7\u01d8\b\f\1\2\u01d8\u0298\3\2\2\2\u01d9\u01da"+
		"\t\n\2\2\u01da\u01db\7\u0195\2\2\u01db\u01dc\5\20\t\2\u01dc\u01dd\7\u0198"+
		"\2\2\u01dd\u01de\b\f\1\2\u01de\u0298\3\2\2\2\u01df\u01e0\7\u0105\2\2\u01e0"+
		"\u01e1\7\u0195\2\2\u01e1\u01e2\7\u0198\2\2\u01e2\u0298\b\f\1\2\u01e3\u01e4"+
		"\7\u0105\2\2\u01e4\u01e5\7\u0195\2\2\u01e5\u01e6\5\20\t\2\u01e6\u01e7"+
		"\7\u0198\2\2\u01e7\u01e8\b\f\1\2\u01e8\u0298\3\2\2\2\u01e9\u01ea\7y\2"+
		"\2\u01ea\u01eb\7\u0195\2\2\u01eb\u01ec\5\20\t\2\u01ec\u01ed\7\u0198\2"+
		"\2\u01ed\u01ee\b\f\1\2\u01ee\u0298\3\2\2\2\u01ef\u01f0\7\u00c6\2\2\u01f0"+
		"\u01f1\7\u0195\2\2\u01f1\u01f2\5\20\t\2\u01f2\u01f3\7\u0198\2\2\u01f3"+
		"\u01f4\b\f\1\2\u01f4\u0298\3\2\2\2\u01f5\u01f6\7\u00c0\2\2\u01f6\u01f7"+
		"\7\u0195\2\2\u01f7\u01f8\5\20\t\2\u01f8\u01f9\7\u0198\2\2\u01f9\u01fa"+
		"\b\f\1\2\u01fa\u0298\3\2\2\2\u01fb\u01fc\7\u00c1\2\2\u01fc\u01fd\7\u0195"+
		"\2\2\u01fd\u01fe\5\20\t\2\u01fe\u01ff\7\u0198\2\2\u01ff\u0200\b\f\1\2"+
		"\u0200\u0298\3\2\2\2\u0201\u0202\7\u00bf\2\2\u0202\u0203\7\u0195\2\2\u0203"+
		"\u0204\5\20\t\2\u0204\u0205\7\u0187\2\2\u0205\u0206\5\20\t\2\u0206\u0207"+
		"\7\u0198\2\2\u0207\u0208\b\f\1\2\u0208\u0298\3\2\2\2\u0209\u020a\t\13"+
		"\2\2\u020a\u020b\7\u0195\2\2\u020b\u020c\5\20\t\2\u020c\u020d\7\u0187"+
		"\2\2\u020d\u020e\5\20\t\2\u020e\u020f\7\u0198\2\2\u020f\u0210\b\f\1\2"+
		"\u0210\u0298\3\2\2\2\u0211\u0212\7\u0133\2\2\u0212\u0213\7\u0195\2\2\u0213"+
		"\u0214\5\20\t\2\u0214\u0215\7\u0198\2\2\u0215\u0216\b\f\1\2\u0216\u0298"+
		"\3\2\2\2\u0217\u0218\7\36\2\2\u0218\u0219\7\u0195\2\2\u0219\u021a\5\20"+
		"\t\2\u021a\u021b\7\u0198\2\2\u021b\u021c\b\f\1\2\u021c\u0298\3\2\2\2\u021d"+
		"\u021e\7\u0094\2\2\u021e\u021f\7\u0195\2\2\u021f\u0220\5\20\t\2\u0220"+
		"\u0221\7\u0198\2\2\u0221\u0222\b\f\1\2\u0222\u0298\3\2\2\2\u0223\u0224"+
		"\7\u0152\2\2\u0224\u0225\7\u0195\2\2\u0225\u0226\5\20\t\2\u0226\u0227"+
		"\7\u0198\2\2\u0227\u0228\b\f\1\2\u0228\u0298\3\2\2\2\u0229\u022a\7>\2"+
		"\2\u022a\u022b\7\u0195\2\2\u022b\u022c\5\20\t\2\u022c\u022d\7\u0187\2"+
		"\2\u022d\u022e\5\20\t\2\u022e\u022f\7\u0187\2\2\u022f\u0230\5\20\t\2\u0230"+
		"\u0231\7\u0198\2\2\u0231\u0232\b\f\1\2\u0232\u0298\3\2\2\2\u0233\u0234"+
		"\7\16\2\2\u0234\u0235\7\u0195\2\2\u0235\u0236\5\20\t\2\u0236\u0237\7\u0198"+
		"\2\2\u0237\u0238\b\f\1\2\u0238\u0298\3\2\2\2\u0239\u023a\7\u00f4\2\2\u023a"+
		"\u023b\7\u0195\2\2\u023b\u023c\5\20\t\2\u023c\u023d\7\u0187\2\2\u023d"+
		"\u023e\5\20\t\2\u023e\u023f\7\u0198\2\2\u023f\u0240\b\f\1\2\u0240\u0298"+
		"\3\2\2\2\u0241\u0242\7\u0128\2\2\u0242\u0243\7\u0195\2\2\u0243\u0244\5"+
		"\20\t\2\u0244\u0245\7\u0198\2\2\u0245\u0246\b\f\1\2\u0246\u0298\3\2\2"+
		"\2\u0247\u0248\7\26\2\2\u0248\u0249\7\u0195\2\2\u0249\u024a\5\20\t\2\u024a"+
		"\u024b\7\u0198\2\2\u024b\u024c\b\f\1\2\u024c\u0298\3\2\2\2\u024d\u024e"+
		"\7@\2\2\u024e\u024f\7\u0195\2\2\u024f\u0250\5\20\t\2\u0250\u0251\7\u0198"+
		"\2\2\u0251\u0252\b\f\1\2\u0252\u0298\3\2\2\2\u0253\u0254\7\17\2\2\u0254"+
		"\u0255\7\u0195\2\2\u0255\u0256\5\20\t\2\u0256\u0257\7\u0198\2\2\u0257"+
		"\u0258\b\f\1\2\u0258\u0298\3\2\2\2\u0259\u025a\7\u0142\2\2\u025a\u025b"+
		"\7\u0195\2\2\u025b\u025c\5\20\t\2\u025c\u025d\7\u0198\2\2\u025d\u025e"+
		"\b\f\1\2\u025e\u0298\3\2\2\2\u025f\u0260\7\30\2\2\u0260\u0261\7\u0195"+
		"\2\2\u0261\u0262\5\20\t\2\u0262\u0263\7\u0198\2\2\u0263\u0264\b\f\1\2"+
		"\u0264\u0298\3\2\2\2\u0265\u0266\7\\\2\2\u0266\u0267\7\u0195\2\2\u0267"+
		"\u0268\5\20\t\2\u0268\u0269\7\u0198\2\2\u0269\u026a\b\f\1\2\u026a\u0298"+
		"\3\2\2\2\u026b\u026c\7\u0103\2\2\u026c\u026d\7\u0195\2\2\u026d\u026e\5"+
		"\20\t\2\u026e\u026f\7\u0198\2\2\u026f\u0270\b\f\1\2\u0270\u0298\3\2\2"+
		"\2\u0271\u0272\7\u00f5\2\2\u0272\u0273\7\u0195\2\2\u0273\u0274\5\20\t"+
		"\2\u0274\u0275\7\u0198\2\2\u0275\u0276\b\f\1\2\u0276\u0298\3\2\2\2\u0277"+
		"\u0278\7\u00d5\2\2\u0278\u0279\7\u0195\2\2\u0279\u027a\5\20\t\2\u027a"+
		"\u027b\7\u0198\2\2\u027b\u027c\b\f\1\2\u027c\u0298\3\2\2\2\u027d\u027e"+
		"\7\u0127\2\2\u027e\u027f\7\u0195\2\2\u027f\u0280\5\20\t\2\u0280\u0281"+
		"\7\u0198\2\2\u0281\u0282\b\f\1\2\u0282\u0298\3\2\2\2\u0283\u0284\7\b\2"+
		"\2\u0284\u0285\7\u0195\2\2\u0285\u0286\7\u0198\2\2\u0286\u0298\b\f\1\2"+
		"\u0287\u0288\7\t\2\2\u0288\u0289\7\u0195\2\2\u0289\u028a\7\u0198\2\2\u028a"+
		"\u0298\b\f\1\2\u028b\u028c\7z\2\2\u028c\u028d\7\u0195\2\2\u028d\u028e"+
		"\5\20\t\2\u028e\u028f\7\u0198\2\2\u028f\u0290\b\f\1\2\u0290\u0298\3\2"+
		"\2\2\u0291\u0292\7)\2\2\u0292\u0293\7\u0195\2\2\u0293\u0294\5\20\t\2\u0294"+
		"\u0295\7\u0198\2\2\u0295\u0296\b\f\1\2\u0296\u0298\3\2\2\2\u0297\u01c5"+
		"\3\2\2\2\u0297\u01cb\3\2\2\2\u0297\u01d3\3\2\2\2\u0297\u01d9\3\2\2\2\u0297"+
		"\u01df\3\2\2\2\u0297\u01e3\3\2\2\2\u0297\u01e9\3\2\2\2\u0297\u01ef\3\2"+
		"\2\2\u0297\u01f5\3\2\2\2\u0297\u01fb\3\2\2\2\u0297\u0201\3\2\2\2\u0297"+
		"\u0209\3\2\2\2\u0297\u0211\3\2\2\2\u0297\u0217\3\2\2\2\u0297\u021d\3\2"+
		"\2\2\u0297\u0223\3\2\2\2\u0297\u0229\3\2\2\2\u0297\u0233\3\2\2\2\u0297"+
		"\u0239\3\2\2\2\u0297\u0241\3\2\2\2\u0297\u0247\3\2\2\2\u0297\u024d\3\2"+
		"\2\2\u0297\u0253\3\2\2\2\u0297\u0259\3\2\2\2\u0297\u025f\3\2\2\2\u0297"+
		"\u0265\3\2\2\2\u0297\u026b\3\2\2\2\u0297\u0271\3\2\2\2\u0297\u0277\3\2"+
		"\2\2\u0297\u027d\3\2\2\2\u0297\u0283\3\2\2\2\u0297\u0287\3\2\2\2\u0297"+
		"\u028b\3\2\2\2\u0297\u0291\3\2\2\2\u0298\27\3\2\2\2\u0299\u029a\7\u011d"+
		"\2\2\u029a\u029b\7\u0195\2\2\u029b\u029c\5\20\t\2\u029c\u029d\7\u0198"+
		"\2\2\u029d\u029e\b\r\1\2\u029e\u02ac\3\2\2\2\u029f\u02a0\7\u0157\2\2\u02a0"+
		"\u02a1\7\u0195\2\2\u02a1\u02a2\5\20\t\2\u02a2\u02a3\7\u0198\2\2\u02a3"+
		"\u02a4\b\r\1\2\u02a4\u02ac\3\2\2\2\u02a5\u02a6\7\u00c5\2\2\u02a6\u02a7"+
		"\7\u0195\2\2\u02a7\u02a8\5\20\t\2\u02a8\u02a9\7\u0198\2\2\u02a9\u02aa"+
		"\b\r\1\2\u02aa\u02ac\3\2\2\2\u02ab\u0299\3\2\2\2\u02ab\u029f\3\2\2\2\u02ab"+
		"\u02a5\3\2\2\2\u02ac\31\3\2\2\2\u02ad\u02ae\7\u019f\2\2\u02ae\u02be\b"+
		"\16\1\2\u02af\u02b0\7\u019e\2\2\u02b0\u02be\b\16\1\2\u02b1\u02b2\7\u019d"+
		"\2\2\u02b2\u02be\b\16\1\2\u02b3\u02b4\7\r\2\2\u02b4\u02be\b\16\1\2\u02b5"+
		"\u02b6\7\f\2\2\u02b6\u02be\b\16\1\2\u02b7\u02b8\5\36\20\2\u02b8\u02b9"+
		"\b\16\1\2\u02b9\u02be\3\2\2\2\u02ba\u02bb\5 \21\2\u02bb\u02bc\b\16\1\2"+
		"\u02bc\u02be\3\2\2\2\u02bd\u02ad\3\2\2\2\u02bd\u02af\3\2\2\2\u02bd\u02b1"+
		"\3\2\2\2\u02bd\u02b3\3\2\2\2\u02bd\u02b5\3\2\2\2\u02bd\u02b7\3\2\2\2\u02bd"+
		"\u02ba\3\2\2\2\u02be\33\3\2\2\2\u02bf\u02c0\7\u019c\2\2\u02c0\u02c2\7"+
		"\n\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3"+
		"\u02c4\7\u019c\2\2\u02c4\u02c6\7\n\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\7\u019c\2\2\u02c8\u02c9\b\17"+
		"\1\2\u02c9\35\3\2\2\2\u02ca\u02cb\7L\2\2\u02cb\u02cc\7\u019f\2\2\u02cc"+
		"\u02cd\b\20\1\2\u02cd\37\3\2\2\2\u02ce\u02cf\7\u0147\2\2\u02cf\u02d0\7"+
		"\u019f\2\2\u02d0\u02d1\b\21\1\2\u02d1!\3\2\2\2\u02d2\u02d9\7\u00ac\2\2"+
		"\u02d3\u02d4\7\u00ac\2\2\u02d4\u02d9\7\u00de\2\2\u02d5\u02d9\7\u009c\2"+
		"\2\u02d6\u02d7\7\u00de\2\2\u02d7\u02d9\7\u009c\2\2\u02d8\u02d2\3\2\2\2"+
		"\u02d8\u02d3\3\2\2\2\u02d8\u02d5\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9#\3"+
		"\2\2\2\u02da\u02db\t\f\2\2\u02db%\3\2\2\2\27\60F\177\u0083\u0088\u008c"+
		"\u009d\u00be\u00e8\u00ea\u015a\u0160\u019b\u01a3\u01c3\u0297\u02ab\u02bd"+
		"\u02c1\u02c5\u02d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}