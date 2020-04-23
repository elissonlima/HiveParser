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
		T_ALL=15, T_ALTER=16, T_AND=17, T_AS=18, T_ASC=19, T_ASIN=20, T_ASSERT_TRUE=21, 
		T_AT=22, T_ATAN=23, T_AUTO_INCREMENT=24, T_AVG=25, T_BEGIN=26, T_BETWEEN=27, 
		T_BIGINT=28, T_BIN=29, T_BIT=30, T_BODY=31, T_BREAK=32, T_BY=33, T_BYTE=34, 
		T_CALL=35, T_CALLER=36, T_CASCADE=37, T_CASE=38, T_CAST=39, T_CBR=40, 
		T_CEIL=41, T_CEILING=42, T_CHAR=43, T_CHARACTER=44, T_CHARSET=45, T_CLIENT=46, 
		T_CLOSE=47, T_CLUSTERED=48, T_CMP=49, T_COALESCE=50, T_COLLECT=51, T_COLLECTION=52, 
		T_COLUMN=53, T_COMMENT=54, T_CONSTANT=55, T_COMMIT=56, T_COMPRESS=57, 
		T_CONCAT=58, T_CONDITION=59, T_CONSTRAINT=60, T_CONTINUE=61, T_CONV=62, 
		T_COPY=63, T_COS=64, T_COUNT=65, T_COUNT_BIG=66, T_CREATE=67, T_CREATION=68, 
		T_CREATOR=69, T_CS=70, T_CURRENT=71, T_CURRENT_SCHEMA=72, T_CURSOR=73, 
		T_DATABASE=74, T_DATA=75, T_DATE=76, T_DATEADD=77, T_DATEDIFF=78, T_DATE_FORMAT=79, 
		T_DATESUB=80, T_DATETIME=81, T_DAY=82, T_DAYS=83, T_DEC=84, T_DECIMAL=85, 
		T_DECLARE=86, T_DEFAULT=87, T_DEFERRED=88, T_DEFINED=89, T_DEFINER=90, 
		T_DEFINITION=91, T_DEGREES=92, T_DELETE=93, T_DELIMITED=94, T_DELIMITER=95, 
		T_DESC=96, T_DESCRIBE=97, T_DIAGNOSTICS=98, T_DIR=99, T_DIRECTORY=100, 
		T_DISTINCT=101, T_DISTRIBUTE=102, T_DO=103, T_DOUBLE=104, T_DROP=105, 
		T_DYNAMIC=106, T_ELSE=107, T_ELSEIF=108, T_ELSIF=109, T_ENABLE=110, T_END=111, 
		T_ENGINE=112, T_ESCAPED=113, T_EXCEPT=114, T_EXEC=115, T_EXECUTE=116, 
		T_EXCEPTION=117, T_EXCLUSIVE=118, T_EXISTS=119, T_EXIT=120, T_EXP=121, 
		T_FACTORIAL=122, T_FALLBACK=123, T_FALSE=124, T_FETCH=125, T_FIELDS=126, 
		T_FILE=127, T_FILES=128, T_FLOAT=129, T_FLOOR=130, T_FOR=131, T_FOREIGN=132, 
		T_FORMAT=133, T_FOUND=134, T_FROM=135, T_FROMUTCTIMESTAMP=136, T_FULL=137, 
		T_FUNCTION=138, T_GET=139, T_GLOBAL=140, T_GO=141, T_GRANT=142, T_GROUP=143, 
		T_HANDLER=144, T_HASH=145, T_HAVING=146, T_HDFS=147, T_HEX=148, T_HIVE=149, 
		T_HOST=150, T_HOUR=151, T_IDENTITY=152, T_IF=153, T_IGNORE=154, T_IMMEDIATE=155, 
		T_IN=156, T_INCLUDE=157, T_INDEX=158, T_INITRANS=159, T_INNER=160, T_INOUT=161, 
		T_INSERT=162, T_INT=163, T_INT2=164, T_INT4=165, T_INT8=166, T_INTEGER=167, 
		T_INTERSECT=168, T_INTERVAL=169, T_INTO=170, T_INVOKER=171, T_IS=172, 
		T_ISNOTNULL=173, T_ISNULL=174, T_NVL=175, T_ISOPEN=176, T_ITEMS=177, T_JOIN=178, 
		T_KEEP=179, T_KEY=180, T_KEYS=181, T_LANGUAGE=182, T_LASTDAY=183, T_LEAVE=184, 
		T_LEFT=185, T_LIKE=186, T_LIMIT=187, T_LINES=188, T_LOCAL=189, T_LOCATION=190, 
		T_LOCATOR=191, T_LOCATORS=192, T_LOCKS=193, T_LOG=194, T_LOG10=195, T_LOG2=196, 
		T_LOGGED=197, T_LOGGING=198, T_LOOP=199, T_LOWER=200, T_LN=201, T_MAP=202, 
		T_MATCHED=203, T_MAX=204, T_MAXTRANS=205, T_MERGE=206, T_MESSAGE_TEXT=207, 
		T_MICROSECOND=208, T_MICROSECONDS=209, T_MIN=210, T_MINUTE=211, T_MONTH=212, 
		T_MONTHS_BETWEEN=213, T_MULTISET=214, T_NCHAR=215, T_NEGATIVE=216, T_NEXT_DAY=217, 
		T_NEW=218, T_NVARCHAR=219, T_NO=220, T_NOCOUNT=221, T_NOCOMPRESS=222, 
		T_NOLOGGING=223, T_NONE=224, T_NOT=225, T_NOTFOUND=226, T_NULL=227, T_NULLIF=228, 
		T_NUMERIC=229, T_NUMBER=230, T_OBJECT=231, T_OFF=232, T_ON=233, T_ONLY=234, 
		T_OPEN=235, T_OR=236, T_ORDER=237, T_OUT=238, T_OUTER=239, T_OVER=240, 
		T_OVERWRITE=241, T_OWNER=242, T_PACKAGE=243, T_PARTITION=244, T_PCTFREE=245, 
		T_PCTUSED=246, T_PLS_INTEGER=247, T_PMOD=248, T_POSITIVE=249, T_POW=250, 
		T_POWER=251, T_PRECISION=252, T_PRESERVE=253, T_PRIMARY=254, T_PRINT=255, 
		T_PROC=256, T_PROCEDURE=257, T_QUALIFY=258, T_QUARTER=259, T_QUERY_BAND=260, 
		T_QUIT=261, T_QUOTED_IDENTIFIER=262, T_RADIANS=263, T_RAISE=264, T_RAND=265, 
		T_REAL=266, T_REFERENCES=267, T_REGEXP=268, T_REPLACE=269, T_RESIGNAL=270, 
		T_RESTRICT=271, T_RESULT=272, T_RESULT_SET_LOCATOR=273, T_RETURN=274, 
		T_RETURNS=275, T_REVERSE=276, T_RIGHT=277, T_RLIKE=278, T_ROLE=279, T_ROLLBACK=280, 
		T_ROUND=281, T_ROW=282, T_ROWS=283, T_ROWTYPE=284, T_ROW_COUNT=285, T_RR=286, 
		T_RS=287, T_PWD=288, T_TRIM=289, T_SCHEMA=290, T_SECOND=291, T_SECONDS=292, 
		T_SECURITY=293, T_SEGMENT=294, T_SEL=295, T_SELECT=296, T_SET=297, T_SETS=298, 
		T_SIGN=299, T_SIN=300, T_SIMPLE_DOUBLE=301, T_SIMPLE_FLOAT=302, T_SIMPLE_INTEGER=303, 
		T_SMALLDATETIME=304, T_SMALLINT=305, T_SQL=306, T_SQLEXCEPTION=307, T_SQLINSERT=308, 
		T_SQLSTATE=309, T_SQLWARNING=310, T_SQRT=311, T_STATS=312, T_STATISTICS=313, 
		T_STEP=314, T_STORAGE=315, T_STORED=316, T_STRING=317, T_SUBDIR=318, T_SUBSTR=319, 
		T_SUBSTRING=320, T_SUM=321, T_SUMMARY=322, T_SYS_REFCURSOR=323, T_TABLE=324, 
		T_TABLESPACE=325, T_TAN=326, T_TEMPORARY=327, T_TERMINATED=328, T_TEXTIMAGE_ON=329, 
		T_THEN=330, T_TIMESTAMP=331, T_TINYINT=332, T_TITLE=333, T_TO=334, T_TOP=335, 
		T_TOUTCTIMESTAMP=336, T_TRANSACTION=337, T_TRUE=338, T_TRUNCATE=339, T_TRUNC=340, 
		T_TYPE=341, T_UNHEX=342, T_UNION=343, T_UNIQUE=344, T_UNIX_TIMESTAMP=345, 
		T_UPDATE=346, T_UPPER=347, T_UR=348, T_USE=349, T_USING=350, T_VALUE=351, 
		T_VALUES=352, T_VAR=353, T_VARCHAR=354, T_VARCHAR2=355, T_VARYING=356, 
		T_VOLATILE=357, T_WEEKOFYEAR=358, T_WHEN=359, T_WHERE=360, T_WHILE=361, 
		T_WITH=362, T_WITHOUT=363, T_WORK=364, T_XACT_ABORT=365, T_XML=366, T_YEAR=367, 
		T_YES=368, T_ACTIVITY_COUNT=369, T_CUME_DIST=370, T_CURRENT_DATE=371, 
		T_CURRENT_TIMESTAMP=372, T_CURRENT_USER=373, T_DENSE_RANK=374, T_FIRST_VALUE=375, 
		T_LAG=376, T_LAST_VALUE=377, T_LEAD=378, T_MAX_PART_STRING=379, T_MIN_PART_STRING=380, 
		T_MAX_PART_INT=381, T_MIN_PART_INT=382, T_MAX_PART_DATE=383, T_MIN_PART_DATE=384, 
		T_PART_COUNT=385, T_PART_LOC=386, T_RANK=387, T_ROW_NUMBER=388, T_STDEV=389, 
		T_SYSDATE=390, T_VARIANCE=391, T_USER=392, T_ADD=393, T_COLON=394, T_COMMA=395, 
		T_PIPE=396, T_DIV=397, T_DOT2=398, T_EQUAL=399, T_EQUAL2=400, T_NOTEQUAL=401, 
		T_NOTEQUAL2=402, T_GREATER=403, T_GREATEREQUAL=404, T_LESS=405, T_LESSEQUAL=406, 
		T_MUL=407, T_OPEN_B=408, T_OPEN_P=409, T_OPEN_SB=410, T_CLOSE_B=411, T_CLOSE_P=412, 
		T_CLOSE_SB=413, T_SEMICOLON=414, T_SUB=415, IDENTIFIER=416, INT_LITERAL=417, 
		DECIMAL_LITERAL=418, STRING_LITERAL=419, L_INT=420, L_DEC=421, SPACES=422, 
		UNEXPECTED_CHAR=423;
	public static final int
		RULE_program = 0, RULE_stmt_list = 1, RULE_dtype = 2, RULE_dtype_len = 3, 
		RULE_stmt = 4, RULE_query_stmt = 5, RULE_select_stmt = 6, RULE_expr = 7, 
		RULE_cond_func = 8, RULE_date_func = 9, RULE_spec_func = 10, RULE_math_func = 11, 
		RULE_string_func = 12, RULE_literal_values = 13, RULE_ident = 14, RULE_date_literal = 15, 
		RULE_timestamp_literal = 16, RULE_set_operators = 17, RULE_unary_operator = 18;
	public static final String[] ruleNames = {
		"program", "stmt_list", "dtype", "dtype_len", "stmt", "query_stmt", "select_stmt", 
		"expr", "cond_func", "date_func", "spec_func", "math_func", "string_func", 
		"literal_values", "ident", "date_literal", "timestamp_literal", "set_operators", 
		"unary_operator"
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
		null, null, null, null, null, null, null, null, null, null, null, "'+'", 
		"':'", "','", "'||'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", 
		"'>='", "'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", 
		"';'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "NULL_CONST", 
		"BOOL_LITERAL", "T_ABS", "T_ACOS", "T_ADD_MONTHS", "T_ALL", "T_ALTER", 
		"T_AND", "T_AS", "T_ASC", "T_ASIN", "T_ASSERT_TRUE", "T_AT", "T_ATAN", 
		"T_AUTO_INCREMENT", "T_AVG", "T_BEGIN", "T_BETWEEN", "T_BIGINT", "T_BIN", 
		"T_BIT", "T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", 
		"T_CASCADE", "T_CASE", "T_CAST", "T_CBR", "T_CEIL", "T_CEILING", "T_CHAR", 
		"T_CHARACTER", "T_CHARSET", "T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", 
		"T_COALESCE", "T_COLLECT", "T_COLLECTION", "T_COLUMN", "T_COMMENT", "T_CONSTANT", 
		"T_COMMIT", "T_COMPRESS", "T_CONCAT", "T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", 
		"T_CONV", "T_COPY", "T_COS", "T_COUNT", "T_COUNT_BIG", "T_CREATE", "T_CREATION", 
		"T_CREATOR", "T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", 
		"T_DATA", "T_DATE", "T_DATEADD", "T_DATEDIFF", "T_DATE_FORMAT", "T_DATESUB", 
		"T_DATETIME", "T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", 
		"T_DEFERRED", "T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DEGREES", "T_DELETE", 
		"T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", 
		"T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", 
		"T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", 
		"T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", 
		"T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_EXP", "T_FACTORIAL", "T_FALLBACK", 
		"T_FALSE", "T_FETCH", "T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_FLOOR", 
		"T_FOR", "T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM", "T_FROMUTCTIMESTAMP", 
		"T_FULL", "T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", "T_GRANT", "T_GROUP", 
		"T_HANDLER", "T_HASH", "T_HAVING", "T_HDFS", "T_HEX", "T_HIVE", "T_HOST", 
		"T_HOUR", "T_IDENTITY", "T_IF", "T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", 
		"T_INDEX", "T_INITRANS", "T_INNER", "T_INOUT", "T_INSERT", "T_INT", "T_INT2", 
		"T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", 
		"T_INVOKER", "T_IS", "T_ISNOTNULL", "T_ISNULL", "T_NVL", "T_ISOPEN", "T_ITEMS", 
		"T_JOIN", "T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", "T_LASTDAY", "T_LEAVE", 
		"T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATION", "T_LOCATOR", 
		"T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOG10", "T_LOG2", "T_LOGGED", "T_LOGGING", 
		"T_LOOP", "T_LOWER", "T_LN", "T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", 
		"T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", "T_MICROSECONDS", "T_MIN", 
		"T_MINUTE", "T_MONTH", "T_MONTHS_BETWEEN", "T_MULTISET", "T_NCHAR", "T_NEGATIVE", 
		"T_NEXT_DAY", "T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", "T_NOCOMPRESS", 
		"T_NOLOGGING", "T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", "T_NULLIF", 
		"T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OFF", "T_ON", "T_ONLY", "T_OPEN", 
		"T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", "T_OVERWRITE", "T_OWNER", 
		"T_PACKAGE", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", "T_PLS_INTEGER", 
		"T_PMOD", "T_POSITIVE", "T_POW", "T_POWER", "T_PRECISION", "T_PRESERVE", 
		"T_PRIMARY", "T_PRINT", "T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUARTER", 
		"T_QUERY_BAND", "T_QUIT", "T_QUOTED_IDENTIFIER", "T_RADIANS", "T_RAISE", 
		"T_RAND", "T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", "T_RESIGNAL", 
		"T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", 
		"T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", "T_ROLLBACK", "T_ROUND", 
		"T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RR", "T_RS", "T_PWD", 
		"T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", "T_SEGMENT", 
		"T_SEL", "T_SELECT", "T_SET", "T_SETS", "T_SIGN", "T_SIN", "T_SIMPLE_DOUBLE", 
		"T_SIMPLE_FLOAT", "T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", 
		"T_SQL", "T_SQLEXCEPTION", "T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", 
		"T_SQRT", "T_STATS", "T_STATISTICS", "T_STEP", "T_STORAGE", "T_STORED", 
		"T_STRING", "T_SUBDIR", "T_SUBSTR", "T_SUBSTRING", "T_SUM", "T_SUMMARY", 
		"T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TAN", "T_TEMPORARY", 
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
			setState(38);
			((ProgramContext)_localctx).stmt_list = stmt_list();
			setState(39);
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
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				((Stmt_listContext)_localctx).stmt = stmt();
				((Stmt_listContext)_localctx).stmts.add(((Stmt_listContext)_localctx).stmt);
				setState(44);
				match(T_SEMICOLON);
				}
				}
				setState(48); 
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T_CHAR);
				 ((DtypeContext)_localctx).res =  "CHAR"; 
				}
				break;
			case T_CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T_CHARACTER);
				 ((DtypeContext)_localctx).res =  "CHAR"; 
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(T_BIGINT);
				 ((DtypeContext)_localctx).res =  "BIGINT"; 
				}
				break;
			case T_BIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(T_BIT);
				 ((DtypeContext)_localctx).res =  "BIT"; 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				match(T_DATE);
				 ((DtypeContext)_localctx).res =  "DATE"; 
				}
				break;
			case T_DATETIME:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				match(T_DATETIME);
				 ((DtypeContext)_localctx).res =  "DATETIME"; 
				}
				break;
			case T_DEC:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				match(T_DEC);
				 ((DtypeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				match(T_DECIMAL);
				 ((DtypeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(68);
				match(T_DOUBLE);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PRECISION) {
					{
					setState(69);
					match(T_PRECISION);
					}
				}

				 ((DtypeContext)_localctx).res =  "DOUBLE"; 
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 10);
				{
				setState(73);
				match(T_FLOAT);
				 ((DtypeContext)_localctx).res =  "FLOAT"; 
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 11);
				{
				setState(75);
				match(T_INT);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_INT2:
				enterOuterAlt(_localctx, 12);
				{
				setState(77);
				match(T_INT2);
				 ((DtypeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case T_INT4:
				enterOuterAlt(_localctx, 13);
				{
				setState(79);
				match(T_INT4);
				 ((DtypeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case T_INT8:
				enterOuterAlt(_localctx, 14);
				{
				setState(81);
				match(T_INT8);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 15);
				{
				setState(83);
				match(T_INTEGER);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_NCHAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(85);
				match(T_NCHAR);
				 ((DtypeContext)_localctx).res =  "NCHAR"; 
				}
				break;
			case T_NVARCHAR:
				enterOuterAlt(_localctx, 17);
				{
				setState(87);
				match(T_NVARCHAR);
				 ((DtypeContext)_localctx).res =  "NVARCHAR"; 
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 18);
				{
				setState(89);
				match(T_NUMBER);
				 ((DtypeContext)_localctx).res =  "NUMBER"; 
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 19);
				{
				setState(91);
				match(T_NUMERIC);
				 ((DtypeContext)_localctx).res =  "NUMERIC"; 
				}
				break;
			case T_PLS_INTEGER:
				enterOuterAlt(_localctx, 20);
				{
				setState(93);
				match(T_PLS_INTEGER);
				 ((DtypeContext)_localctx).res =  "PLS_INTEGER"; 
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 21);
				{
				setState(95);
				match(T_REAL);
				 ((DtypeContext)_localctx).res =  "REAL"; 
				}
				break;
			case T_RESULT_SET_LOCATOR:
				enterOuterAlt(_localctx, 22);
				{
				setState(97);
				match(T_RESULT_SET_LOCATOR);
				setState(98);
				match(T_VARYING);
				 ((DtypeContext)_localctx).res =  "RESULT_SET_LOCATOR"; 
				}
				break;
			case T_SIMPLE_FLOAT:
				enterOuterAlt(_localctx, 23);
				{
				setState(100);
				match(T_SIMPLE_FLOAT);
				 ((DtypeContext)_localctx).res =  "SIMPLE_FLOAT"; 
				}
				break;
			case T_SIMPLE_DOUBLE:
				enterOuterAlt(_localctx, 24);
				{
				setState(102);
				match(T_SIMPLE_DOUBLE);
				 ((DtypeContext)_localctx).res =  "SIMPLE_DOUBLE"; 
				}
				break;
			case T_SIMPLE_INTEGER:
				enterOuterAlt(_localctx, 25);
				{
				setState(104);
				match(T_SIMPLE_INTEGER);
				 ((DtypeContext)_localctx).res =  "SIMPLE_INTEGER"; 
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 26);
				{
				setState(106);
				match(T_SMALLINT);
				 ((DtypeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case T_SMALLDATETIME:
				enterOuterAlt(_localctx, 27);
				{
				setState(108);
				match(T_SMALLDATETIME);
				 ((DtypeContext)_localctx).res =  "SMALLDATETIME"; 
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 28);
				{
				setState(110);
				match(T_STRING);
				 ((DtypeContext)_localctx).res =  "STRING"; 
				}
				break;
			case T_SYS_REFCURSOR:
				enterOuterAlt(_localctx, 29);
				{
				setState(112);
				match(T_SYS_REFCURSOR);
				 ((DtypeContext)_localctx).res =  "SYS_REFCURSOR"; 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 30);
				{
				setState(114);
				match(T_TIMESTAMP);
				 ((DtypeContext)_localctx).res =  "TIMESTAMP"; 
				}
				break;
			case T_TINYINT:
				enterOuterAlt(_localctx, 31);
				{
				setState(116);
				match(T_TINYINT);
				 ((DtypeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 32);
				{
				setState(118);
				match(T_VARCHAR);
				 ((DtypeContext)_localctx).res =  "VARCHAR"; 
				}
				break;
			case T_VARCHAR2:
				enterOuterAlt(_localctx, 33);
				{
				setState(120);
				match(T_VARCHAR2);
				 ((DtypeContext)_localctx).res =  "VARCHAR2"; 
				}
				break;
			case T_XML:
				enterOuterAlt(_localctx, 34);
				{
				setState(122);
				match(T_XML);
				 ((DtypeContext)_localctx).res =  "XML"; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 35);
				{
				setState(124);
				((DtypeContext)_localctx).ident = ident();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(125);
					match(T__0);
					setState(126);
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
			setState(133);
			match(T_OPEN_P);
			setState(134);
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
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(135);
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

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(138);
				match(T_COMMA);
				setState(139);
				match(L_INT);
				}
			}

			setState(142);
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
			setState(144);
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
			setState(147);
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
			setState(151);
			match(T_SELECT);
			setState(152);
			((Select_stmtContext)_localctx).expr = expr(0);
			((Select_stmtContext)_localctx).exprs.add(((Select_stmtContext)_localctx).expr);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(153);
				match(T_COMMA);
				setState(154);
				((Select_stmtContext)_localctx).expr = expr(0);
				((Select_stmtContext)_localctx).exprs.add(((Select_stmtContext)_localctx).expr);
				}
				}
				setState(159);
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
		public Cond_funcContext cond_func;
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
		public Cond_funcContext cond_func() {
			return getRuleContext(Cond_funcContext.class,0);
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(163);
				((ExprContext)_localctx).literal_values = literal_values();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).literal_values.res; 
				}
				break;
			case 2:
				{
				setState(166);
				((ExprContext)_localctx).ident = ident();
				 ((ExprContext)_localctx).res =   ((ExprContext)_localctx).ident.res; 
				}
				break;
			case 3:
				{
				setState(169);
				((ExprContext)_localctx).unary_operator = unary_operator();
				setState(170);
				((ExprContext)_localctx).expr = expr(15);
				 ((ExprContext)_localctx).res =  hql_unary_operator((((ExprContext)_localctx).unary_operator!=null?_input.getText(((ExprContext)_localctx).unary_operator.start,((ExprContext)_localctx).unary_operator.stop):null), ((ExprContext)_localctx).expr.res); 
				}
				break;
			case 4:
				{
				setState(173);
				match(T_OPEN_P);
				setState(174);
				((ExprContext)_localctx).expr = expr(0);
				setState(175);
				match(T_CLOSE_P);
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr.res; 
				}
				break;
			case 5:
				{
				setState(178);
				((ExprContext)_localctx).spec_func = spec_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).spec_func.res; 
				}
				break;
			case 6:
				{
				setState(181);
				((ExprContext)_localctx).math_func = math_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).math_func.res; 
				}
				break;
			case 7:
				{
				setState(184);
				((ExprContext)_localctx).string_func = string_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).string_func.res; 
				}
				break;
			case 8:
				{
				setState(187);
				((ExprContext)_localctx).date_func = date_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).date_func.res; 
				}
				break;
			case 9:
				{
				setState(190);
				((ExprContext)_localctx).cond_func = cond_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).cond_func.res; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(196);
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
						setState(197);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(15);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(201);
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
						setState(202);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(14);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(206);
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
						setState(207);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(13);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(211);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 403)) & ~0x3f) == 0 && ((1L << (_la - 403)) & ((1L << (T_GREATER - 403)) | (1L << (T_GREATEREQUAL - 403)) | (1L << (T_LESS - 403)) | (1L << (T_LESSEQUAL - 403)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(12);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(216);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & ((1L << (T_EQUAL - 399)) | (1L << (T_EQUAL2 - 399)) | (1L << (T_NOTEQUAL - 399)) | (1L << (T_NOTEQUAL2 - 399)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(11);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(221);
						((ExprContext)_localctx).set_operators = set_operators();
						setState(222);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(10);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).set_operators!=null?_input.getText(((ExprContext)_localctx).set_operators.start,((ExprContext)_localctx).set_operators.stop):null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(226);
						((ExprContext)_localctx).op = match(T_AND);
						setState(227);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(9);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(231);
						((ExprContext)_localctx).op = match(T_OR);
						setState(232);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(8);
						 ((ExprContext)_localctx).res =  hql_generic_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					}
					} 
				}
				setState(239);
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

	public static class Cond_funcContext extends ParserRuleContext {
		public json res;
		public ExprContext test_cond;
		public ExprContext valueTrue;
		public ExprContext valueFalse;
		public ExprContext expr;
		public ExprContext expr_val;
		public ExprContext default_val;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public ExprContext case_expr;
		public List<ExprContext> when_exprs = new ArrayList<ExprContext>();
		public List<ExprContext> then_exprs = new ArrayList<ExprContext>();
		public ExprContext els_expr;
		public ExprContext a_expr;
		public ExprContext b_expr;
		public TerminalNode T_IF() { return getToken(HiveParser.T_IF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ISNULL() { return getToken(HiveParser.T_ISNULL, 0); }
		public TerminalNode T_ISNOTNULL() { return getToken(HiveParser.T_ISNOTNULL, 0); }
		public TerminalNode T_NVL() { return getToken(HiveParser.T_NVL, 0); }
		public TerminalNode T_COALESCE() { return getToken(HiveParser.T_COALESCE, 0); }
		public TerminalNode T_CASE() { return getToken(HiveParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(HiveParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HiveParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HiveParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HiveParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HiveParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(HiveParser.T_ELSE, 0); }
		public TerminalNode T_NULLIF() { return getToken(HiveParser.T_NULLIF, 0); }
		public TerminalNode T_ASSERT_TRUE() { return getToken(HiveParser.T_ASSERT_TRUE, 0); }
		public Cond_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_func; }
	}

	public final Cond_funcContext cond_func() throws RecognitionException {
		Cond_funcContext _localctx = new Cond_funcContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cond_func);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(T_IF);
				setState(241);
				match(T_OPEN_P);
				setState(242);
				((Cond_funcContext)_localctx).test_cond = expr(0);
				setState(243);
				match(T_COMMA);
				setState(244);
				((Cond_funcContext)_localctx).valueTrue = expr(0);
				setState(245);
				match(T_COMMA);
				setState(246);
				((Cond_funcContext)_localctx).valueFalse = expr(0);
				setState(247);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_three_param_func("IF", "test_cond", ((Cond_funcContext)_localctx).test_cond.res, "value_true", ((Cond_funcContext)_localctx).valueTrue.res, "value_false", ((Cond_funcContext)_localctx).valueFalse.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T_ISNULL);
				setState(251);
				match(T_OPEN_P);
				setState(252);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(253);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(T_ISNOTNULL);
				setState(257);
				match(T_OPEN_P);
				setState(258);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(259);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNOTNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(T_NVL);
				setState(263);
				match(T_OPEN_P);
				setState(264);
				((Cond_funcContext)_localctx).expr_val = expr(0);
				setState(265);
				match(T_COMMA);
				setState(266);
				((Cond_funcContext)_localctx).default_val = expr(0);
				setState(267);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NVL", "expr_val", ((Cond_funcContext)_localctx).expr_val.res, "default_val", ((Cond_funcContext)_localctx).default_val.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(271);
				match(T_COALESCE);
				setState(272);
				match(T_OPEN_P);
				{
				setState(273);
				((Cond_funcContext)_localctx).expr = expr(0);
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				}
				{
				setState(274);
				match(T_COMMA);
				setState(275);
				((Cond_funcContext)_localctx).expr = expr(0);
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(277);
					match(T_COMMA);
					setState(278);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				match(T_CLOSE_P);
				 
				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Cond_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Cond_funcContext)_localctx).res =  hql_list_param_func("COALESCE","expr_list",expr_list_json);
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				 vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; 
				setState(288);
				match(T_CASE);
				setState(289);
				((Cond_funcContext)_localctx).case_expr = expr(0);
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(290);
					match(T_WHEN);
					setState(291);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(292);
					match(T_THEN);
					setState(293);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(299);
				match(T_END);
				 
				        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
				        for(int i = 0 ; i < ((Cond_funcContext)_localctx).when_exprs.size() ; i++)
				        {
				            when_expr_list_json.push_back(((Cond_funcContext)_localctx).when_exprs[i]->res);
				            then_expr_list_json.push_back(((Cond_funcContext)_localctx).then_exprs[i]->res);
				        }
				        ((Cond_funcContext)_localctx).res =  hql_case_func(((Cond_funcContext)_localctx).case_expr.res, when_expr_list_json, then_expr_list_json, NULL);
				     
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				 vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; 
				setState(303);
				match(T_CASE);
				setState(304);
				((Cond_funcContext)_localctx).case_expr = expr(0);
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(305);
					match(T_WHEN);
					setState(306);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(307);
					match(T_THEN);
					setState(308);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(312); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(314);
				match(T_ELSE);
				setState(315);
				((Cond_funcContext)_localctx).els_expr = expr(0);
				setState(316);
				match(T_END);
				 
				        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
				        for(int i = 0 ; i < ((Cond_funcContext)_localctx).when_exprs.size() ; i++)
				        {
				            when_expr_list_json.push_back(((Cond_funcContext)_localctx).when_exprs[i]->res);
				            then_expr_list_json.push_back(((Cond_funcContext)_localctx).then_exprs[i]->res);
				        }
				        ((Cond_funcContext)_localctx).res =  hql_case_func(((Cond_funcContext)_localctx).case_expr.res, when_expr_list_json, then_expr_list_json, ((Cond_funcContext)_localctx).els_expr.res);
				     
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				 vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; 
				setState(320);
				match(T_CASE);
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(321);
					match(T_WHEN);
					setState(322);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(323);
					match(T_THEN);
					setState(324);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(328); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(330);
				match(T_END);
				 
				        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
				        for(int i = 0 ; i < ((Cond_funcContext)_localctx).when_exprs.size() ; i++)
				        {
				            when_expr_list_json.push_back(((Cond_funcContext)_localctx).when_exprs[i]->res);
				            then_expr_list_json.push_back(((Cond_funcContext)_localctx).then_exprs[i]->res);
				        }
				        ((Cond_funcContext)_localctx).res =  hql_case_func(NULL, when_expr_list_json, then_expr_list_json, NULL);
				     
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				 vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; 
				setState(334);
				match(T_CASE);
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(335);
					match(T_WHEN);
					setState(336);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(337);
					match(T_THEN);
					setState(338);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(342); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(344);
				match(T_ELSE);
				setState(345);
				((Cond_funcContext)_localctx).els_expr = expr(0);
				setState(346);
				match(T_END);
				 
				        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
				        for(int i = 0 ; i < ((Cond_funcContext)_localctx).when_exprs.size() ; i++)
				        {
				            when_expr_list_json.push_back(((Cond_funcContext)_localctx).when_exprs[i]->res);
				            then_expr_list_json.push_back(((Cond_funcContext)_localctx).then_exprs[i]->res);
				        }
				        ((Cond_funcContext)_localctx).res =  hql_case_func(NULL, when_expr_list_json, then_expr_list_json, ((Cond_funcContext)_localctx).els_expr.res);
				     
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(349);
				match(T_NULLIF);
				setState(350);
				match(T_OPEN_P);
				setState(351);
				((Cond_funcContext)_localctx).a_expr = expr(0);
				setState(352);
				match(T_COMMA);
				setState(353);
				((Cond_funcContext)_localctx).b_expr = expr(0);
				setState(354);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NULLIF", "a_expr", ((Cond_funcContext)_localctx).a_expr.res, "b_expr", ((Cond_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(357);
				match(T_ASSERT_TRUE);
				setState(358);
				match(T_OPEN_P);
				setState(359);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(360);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ASSERT_TRUE", "expr", ((Cond_funcContext)_localctx).expr.res); 
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
		enterRule(_localctx, 18, RULE_date_func);
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(T_UNIX_TIMESTAMP);
				setState(366);
				match(T_OPEN_P);
				setState(367);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("UNIX_TIMESTAMP"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(T_UNIX_TIMESTAMP);
				setState(370);
				match(T_OPEN_P);
				setState(371);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(372);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(T_UNIX_TIMESTAMP);
				setState(376);
				match(T_OPEN_P);
				setState(377);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(378);
				match(T_COMMA);
				setState(379);
				((Date_funcContext)_localctx).pattern_expr = expr(0);
				setState(380);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res, "pattern", ((Date_funcContext)_localctx).pattern_expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				match(T_YEAR);
				setState(384);
				match(T_OPEN_P);
				setState(385);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(386);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("YEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				match(T_QUARTER);
				setState(390);
				match(T_OPEN_P);
				setState(391);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(392);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("QUARTER", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(395);
				match(T_MONTH);
				setState(396);
				match(T_OPEN_P);
				setState(397);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(398);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MONTH", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(401);
				match(T_DAY);
				setState(402);
				match(T_OPEN_P);
				setState(403);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(404);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(407);
				match(T_HOUR);
				setState(408);
				match(T_OPEN_P);
				setState(409);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(410);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("HOUR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(413);
				match(T_MINUTE);
				setState(414);
				match(T_OPEN_P);
				setState(415);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(416);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MINUTE", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(419);
				match(T_SECOND);
				setState(420);
				match(T_OPEN_P);
				setState(421);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(422);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("SECOND", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(425);
				match(T_WEEKOFYEAR);
				setState(426);
				match(T_OPEN_P);
				setState(427);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(428);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("WEEKOFYEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(431);
				match(T_DATEDIFF);
				setState(432);
				match(T_OPEN_P);
				setState(433);
				((Date_funcContext)_localctx).enddate = expr(0);
				setState(434);
				match(T_COMMA);
				setState(435);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(436);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "enddate", ((Date_funcContext)_localctx).enddate.res, "startdate", ((Date_funcContext)_localctx).startdate.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(439);
				match(T_DATEADD);
				setState(440);
				match(T_OPEN_P);
				setState(441);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(442);
				match(T_COMMA);
				setState(443);
				((Date_funcContext)_localctx).days = expr(0);
				setState(444);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(447);
				match(T_DATESUB);
				setState(448);
				match(T_OPEN_P);
				setState(449);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(450);
				match(T_COMMA);
				setState(451);
				((Date_funcContext)_localctx).days = expr(0);
				setState(452);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(455);
				match(T_TOUTCTIMESTAMP);
				setState(456);
				match(T_OPEN_P);
				setState(457);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(458);
				match(T_COMMA);
				setState(459);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(460);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TO_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(463);
				match(T_FROMUTCTIMESTAMP);
				setState(464);
				match(T_OPEN_P);
				setState(465);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(466);
				match(T_COMMA);
				setState(467);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(468);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("FROM_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(471);
				match(T_CURRENT_DATE);
				setState(474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(472);
					match(T_OPEN_P);
					setState(473);
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
				setState(477);
				match(T_CURRENT_TIMESTAMP);
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(478);
					match(T_OPEN_P);
					setState(479);
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
				setState(483);
				match(T_ADD_MONTHS);
				setState(484);
				match(T_OPEN_P);
				setState(485);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(486);
				match(T_COMMA);
				setState(487);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(488);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(491);
				match(T_ADD_MONTHS);
				setState(492);
				match(T_OPEN_P);
				setState(493);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(494);
				match(T_COMMA);
				setState(495);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(496);
				match(T_COMMA);
				setState(497);
				((Date_funcContext)_localctx).out_date_format = expr(0);
				setState(498);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_three_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res, "out_date_format", ((Date_funcContext)_localctx).out_date_format.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(501);
				match(T_LASTDAY);
				setState(502);
				match(T_OPEN_P);
				setState(503);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(504);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("LAST_DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(507);
				match(T_NEXT_DAY);
				setState(508);
				match(T_OPEN_P);
				setState(509);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(510);
				match(T_COMMA);
				setState(511);
				((Date_funcContext)_localctx).day_of_week = expr(0);
				setState(512);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("NEXT_DAY", "startdate", ((Date_funcContext)_localctx).startdate.res, "day_of_week", ((Date_funcContext)_localctx).day_of_week.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(515);
				match(T_TRUNC);
				setState(516);
				match(T_OPEN_P);
				setState(517);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(518);
				match(T_COMMA);
				setState(519);
				((Date_funcContext)_localctx).format = expr(0);
				setState(520);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TRUNC", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(523);
				match(T_MONTHS_BETWEEN);
				setState(524);
				match(T_OPEN_P);
				setState(525);
				((Date_funcContext)_localctx).date1 = expr(0);
				setState(526);
				match(T_COMMA);
				setState(527);
				((Date_funcContext)_localctx).date2 = expr(0);
				setState(528);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("MONTHS_BETWEEN", "date1", ((Date_funcContext)_localctx).date1.res, "date2", ((Date_funcContext)_localctx).date2.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(531);
				match(T_DATE_FORMAT);
				setState(532);
				match(T_OPEN_P);
				setState(533);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(534);
				match(T_COMMA);
				setState(535);
				((Date_funcContext)_localctx).format = expr(0);
				setState(536);
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
		enterRule(_localctx, 20, RULE_spec_func);
		int _la;
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(T_CAST);
				setState(542);
				match(T_OPEN_P);
				setState(543);
				((Spec_funcContext)_localctx).expr = expr(0);
				setState(544);
				match(T_AS);
				setState(545);
				((Spec_funcContext)_localctx).dtype = dtype();
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(546);
					dtype_len();
					}
				}

				setState(549);
				match(T_CLOSE_P);
				 ((Spec_funcContext)_localctx).res =  hql_cast_func(((Spec_funcContext)_localctx).expr.res, ((Spec_funcContext)_localctx).dtype.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(T_COUNT);
				setState(553);
				match(T_OPEN_P);
				setState(554);
				((Spec_funcContext)_localctx).r = expr(0);
				setState(555);
				match(T_CLOSE_P);
				 ((Spec_funcContext)_localctx).res =  hql_count_func(((Spec_funcContext)_localctx).r.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				match(T_COUNT);
				setState(559);
				match(T_OPEN_P);
				setState(560);
				match(T_MUL);
				setState(561);
				match(T_CLOSE_P);
				 ((Spec_funcContext)_localctx).res =  hql_count_all_func(); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				((Spec_funcContext)_localctx).T_CURRENT_DATE = match(T_CURRENT_DATE);
				 ((Spec_funcContext)_localctx).res =  hql_fixed_func((((Spec_funcContext)_localctx).T_CURRENT_DATE!=null?((Spec_funcContext)_localctx).T_CURRENT_DATE.getText():null)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(565);
				((Spec_funcContext)_localctx).T_CURRENT_DATE = match(T_CURRENT_DATE);
				setState(566);
				match(T_OPEN_P);
				setState(567);
				match(T_CLOSE_P);
				 ((Spec_funcContext)_localctx).res =  hql_fixed_func((((Spec_funcContext)_localctx).T_CURRENT_DATE!=null?((Spec_funcContext)_localctx).T_CURRENT_DATE.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(569);
				((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP = match(T_CURRENT_TIMESTAMP);
				 ((Spec_funcContext)_localctx).res =  hql_fixed_func((((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP!=null?((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP.getText():null)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(571);
				((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP = match(T_CURRENT_TIMESTAMP);
				setState(572);
				match(T_OPEN_P);
				setState(573);
				match(T_CLOSE_P);
				 ((Spec_funcContext)_localctx).res =  hql_fixed_func((((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP!=null?((Spec_funcContext)_localctx).T_CURRENT_TIMESTAMP.getText():null)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(575);
				((Spec_funcContext)_localctx).T_SYSDATE = match(T_SYSDATE);
				 ((Spec_funcContext)_localctx).res =  hql_fixed_func((((Spec_funcContext)_localctx).T_SYSDATE!=null?((Spec_funcContext)_localctx).T_SYSDATE.getText():null)); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(577);
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
		enterRule(_localctx, 22, RULE_math_func);
		int _la;
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(T_ROUND);
				setState(582);
				match(T_OPEN_P);
				setState(583);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(584);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ROUND", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(T_ROUND);
				setState(588);
				match(T_OPEN_P);
				setState(589);
				((Math_funcContext)_localctx).fst = expr(0);
				setState(590);
				match(T_COMMA);
				setState(591);
				((Math_funcContext)_localctx).snd = expr(0);
				setState(592);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("ROUND", "expr", ((Math_funcContext)_localctx).fst.res, "decimal_places", ((Math_funcContext)_localctx).snd.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				match(T_FLOOR);
				setState(596);
				match(T_OPEN_P);
				setState(597);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(598);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FLOOR", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(601);
				_la = _input.LA(1);
				if ( !(_la==T_CEIL || _la==T_CEILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(602);
				match(T_OPEN_P);
				setState(603);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(604);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("CEIL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(607);
				((Math_funcContext)_localctx).T_RAND = match(T_RAND);
				setState(608);
				match(T_OPEN_P);
				setState(609);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func((((Math_funcContext)_localctx).T_RAND!=null?((Math_funcContext)_localctx).T_RAND.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(611);
				match(T_RAND);
				setState(612);
				match(T_OPEN_P);
				setState(613);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(614);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RAND", "seed", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(617);
				match(T_EXP);
				setState(618);
				match(T_OPEN_P);
				setState(619);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(620);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("EXP", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(623);
				match(T_LN);
				setState(624);
				match(T_OPEN_P);
				setState(625);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(626);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(629);
				match(T_LOG10);
				setState(630);
				match(T_OPEN_P);
				setState(631);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(632);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG10", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(635);
				match(T_LOG2);
				setState(636);
				match(T_OPEN_P);
				setState(637);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(638);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG2", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(641);
				match(T_LOG);
				setState(642);
				match(T_OPEN_P);
				setState(643);
				((Math_funcContext)_localctx).base = expr(0);
				setState(644);
				match(T_COMMA);
				setState(645);
				((Math_funcContext)_localctx).e = expr(0);
				setState(646);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("LOG", "base", ((Math_funcContext)_localctx).base.res, "expr", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(649);
				_la = _input.LA(1);
				if ( !(_la==T_POW || _la==T_POWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(650);
				match(T_OPEN_P);
				setState(651);
				((Math_funcContext)_localctx).base = expr(0);
				setState(652);
				match(T_COMMA);
				setState(653);
				((Math_funcContext)_localctx).e = expr(0);
				setState(654);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("POWER", "base", ((Math_funcContext)_localctx).base.res, "exp", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(657);
				match(T_SQRT);
				setState(658);
				match(T_OPEN_P);
				setState(659);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(660);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SQRT", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(663);
				match(T_BIN);
				setState(664);
				match(T_OPEN_P);
				setState(665);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(666);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("BIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(669);
				match(T_HEX);
				setState(670);
				match(T_OPEN_P);
				setState(671);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(672);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("HEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(675);
				match(T_UNHEX);
				setState(676);
				match(T_OPEN_P);
				setState(677);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(678);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("UNHEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(681);
				match(T_CONV);
				setState(682);
				match(T_OPEN_P);
				setState(683);
				((Math_funcContext)_localctx).e = expr(0);
				setState(684);
				match(T_COMMA);
				setState(685);
				((Math_funcContext)_localctx).fbase = expr(0);
				setState(686);
				match(T_COMMA);
				setState(687);
				((Math_funcContext)_localctx).tbase = expr(0);
				setState(688);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_three_param_func("CONV", "expr", ((Math_funcContext)_localctx).e.res, "from_base", ((Math_funcContext)_localctx).fbase.res, "to_base", ((Math_funcContext)_localctx).tbase.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(691);
				match(T_ABS);
				setState(692);
				match(T_OPEN_P);
				setState(693);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(694);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ABS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(697);
				match(T_PMOD);
				setState(698);
				match(T_OPEN_P);
				setState(699);
				((Math_funcContext)_localctx).a = expr(0);
				setState(700);
				match(T_COMMA);
				setState(701);
				((Math_funcContext)_localctx).b = expr(0);
				setState(702);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("PMOD", "a", ((Math_funcContext)_localctx).a.res, "b", ((Math_funcContext)_localctx).b.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(705);
				match(T_SIN);
				setState(706);
				match(T_OPEN_P);
				setState(707);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(708);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(711);
				match(T_ASIN);
				setState(712);
				match(T_OPEN_P);
				setState(713);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(714);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ASIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(717);
				match(T_COS);
				setState(718);
				match(T_OPEN_P);
				setState(719);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(720);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("COS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(723);
				match(T_ACOS);
				setState(724);
				match(T_OPEN_P);
				setState(725);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(726);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ACOS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(729);
				match(T_TAN);
				setState(730);
				match(T_OPEN_P);
				setState(731);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(732);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("TAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(735);
				match(T_ATAN);
				setState(736);
				match(T_OPEN_P);
				setState(737);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(738);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ATAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(741);
				match(T_DEGREES);
				setState(742);
				match(T_OPEN_P);
				setState(743);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(744);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("DEGREES", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(747);
				match(T_RADIANS);
				setState(748);
				match(T_OPEN_P);
				setState(749);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(750);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RADIANS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(753);
				match(T_POSITIVE);
				setState(754);
				match(T_OPEN_P);
				setState(755);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(756);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("POSITIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(759);
				match(T_NEGATIVE);
				setState(760);
				match(T_OPEN_P);
				setState(761);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(762);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("NEGATIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(765);
				match(T_SIGN);
				setState(766);
				match(T_OPEN_P);
				setState(767);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(768);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIGN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(771);
				match(T__5);
				setState(772);
				match(T_OPEN_P);
				setState(773);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("EULER_CONST"); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(775);
				match(T__6);
				setState(776);
				match(T_OPEN_P);
				setState(777);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("PI_CONST"); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(779);
				match(T_FACTORIAL);
				setState(780);
				match(T_OPEN_P);
				setState(781);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(782);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FACTORIAL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(785);
				match(T_CBR);
				setState(786);
				match(T_OPEN_P);
				setState(787);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(788);
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
		enterRule(_localctx, 24, RULE_string_func);
		try {
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_TRIM:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				match(T_TRIM);
				setState(794);
				match(T_OPEN_P);
				setState(795);
				((String_funcContext)_localctx).expr = expr(0);
				setState(796);
				match(T_CLOSE_P);
				 ((String_funcContext)_localctx).res =  hql_single_param_func("TRIM", "expr", ((String_funcContext)_localctx).expr.res); 
				}
				break;
			case T_UPPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				match(T_UPPER);
				setState(800);
				match(T_OPEN_P);
				setState(801);
				((String_funcContext)_localctx).expr = expr(0);
				setState(802);
				match(T_CLOSE_P);
				 ((String_funcContext)_localctx).res =  hql_single_param_func("UPPER", "expr", ((String_funcContext)_localctx).expr.res); 
				}
				break;
			case T_LOWER:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				match(T_LOWER);
				setState(806);
				match(T_OPEN_P);
				setState(807);
				((String_funcContext)_localctx).expr = expr(0);
				setState(808);
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
		enterRule(_localctx, 26, RULE_literal_values);
		try {
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				((Literal_valuesContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_string_type((((Literal_valuesContext)_localctx).STRING_LITERAL!=null?((Literal_valuesContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				((Literal_valuesContext)_localctx).DECIMAL_LITERAL = match(DECIMAL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_decimal_type((((Literal_valuesContext)_localctx).DECIMAL_LITERAL!=null?((Literal_valuesContext)_localctx).DECIMAL_LITERAL.getText():null)); 
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
				((Literal_valuesContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_int_type((((Literal_valuesContext)_localctx).INT_LITERAL!=null?((Literal_valuesContext)_localctx).INT_LITERAL.getText():null)); 
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				((Literal_valuesContext)_localctx).BOOL_LITERAL = match(BOOL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_boolean_type((((Literal_valuesContext)_localctx).BOOL_LITERAL!=null?((Literal_valuesContext)_localctx).BOOL_LITERAL.getText():null)); 
				}
				break;
			case NULL_CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(821);
				match(NULL_CONST);
				 ((Literal_valuesContext)_localctx).res =  hql_null_constant(); 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(823);
				((Literal_valuesContext)_localctx).date_literal = date_literal();
				 ((Literal_valuesContext)_localctx).res =  hql_type_date_literal(((Literal_valuesContext)_localctx).date_literal.res); 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(826);
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
		enterRule(_localctx, 28, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(831);
				((IdentContext)_localctx).database = match(IDENTIFIER);
				setState(832);
				match(T__7);
				}
				break;
			}
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(835);
				((IdentContext)_localctx).tablename = match(IDENTIFIER);
				setState(836);
				match(T__7);
				}
				break;
			}
			setState(839);
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
		enterRule(_localctx, 30, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(T_DATE);
			setState(843);
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
		enterRule(_localctx, 32, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(T_TIMESTAMP);
			setState(847);
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
		enterRule(_localctx, 34, RULE_set_operators);
		try {
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				match(T_IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				match(T_IS);
				setState(852);
				match(T_NOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				match(T_IN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				match(T_NOT);
				setState(855);
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
		enterRule(_localctx, 36, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
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
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01a9\u035f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\61\n\3\r\3\16"+
		"\3\62\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\4\3\4\5\4\u0086\n"+
		"\4\3\5\3\5\3\5\5\5\u008b\n\5\3\5\3\5\5\5\u008f\n\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1\13\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c4\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ee\n\t\f\t\16\t\u00f1\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u011a\n\n\f\n\16\n\u011d\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\6\n\u012a\n\n\r\n\16\n\u012b\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\6\n\u0139\n\n\r\n\16\n\u013a\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\6\n\u0149\n\n\r\n\16\n\u014a\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\6\n\u0157\n\n\r\n\16\n\u0158\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u016e\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u01dd"+
		"\n\13\3\13\3\13\3\13\3\13\5\13\u01e3\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u021e\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0226\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0246\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u031a\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u032e"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0340\n\17\3\20\3\20\5\20\u0344\n\20\3\20\3\20\5"+
		"\20\u0348\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u035b\n\23\3\24\3\24\3\24\2\3\20\25"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\r\4\2\u011e\u011e\u0157"+
		"\u0157\4\2\u00ce\u00ce\u01a6\u01a6\4\2$$--\5\2\3\3\u018f\u018f\u0199\u0199"+
		"\4\2\u018b\u018b\u01a1\u01a1\3\2\4\7\3\2\u0195\u0198\3\2\u0191\u0194\3"+
		"\2+,\3\2\u00fc\u00fd\6\2\13\13\u00e3\u00e3\u018b\u018b\u01a1\u01a1\2\u03e3"+
		"\2(\3\2\2\2\4,\3\2\2\2\6\u0085\3\2\2\2\b\u0087\3\2\2\2\n\u0092\3\2\2\2"+
		"\f\u0095\3\2\2\2\16\u0098\3\2\2\2\20\u00c3\3\2\2\2\22\u016d\3\2\2\2\24"+
		"\u021d\3\2\2\2\26\u0245\3\2\2\2\30\u0319\3\2\2\2\32\u032d\3\2\2\2\34\u033f"+
		"\3\2\2\2\36\u0343\3\2\2\2 \u034c\3\2\2\2\"\u0350\3\2\2\2$\u035a\3\2\2"+
		"\2&\u035c\3\2\2\2()\5\4\3\2)*\7\2\2\3*+\b\2\1\2+\3\3\2\2\2,\60\b\3\1\2"+
		"-.\5\n\6\2./\7\u01a0\2\2/\61\3\2\2\2\60-\3\2\2\2\61\62\3\2\2\2\62\60\3"+
		"\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\b\3\1\2\65\5\3\2\2\2\66\67\7"+
		"-\2\2\67\u0086\b\4\1\289\7.\2\29\u0086\b\4\1\2:;\7\36\2\2;\u0086\b\4\1"+
		"\2<=\7 \2\2=\u0086\b\4\1\2>?\7N\2\2?\u0086\b\4\1\2@A\7S\2\2A\u0086\b\4"+
		"\1\2BC\7V\2\2C\u0086\b\4\1\2DE\7W\2\2E\u0086\b\4\1\2FH\7j\2\2GI\7\u00fe"+
		"\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2J\u0086\b\4\1\2KL\7\u0083\2\2L\u0086"+
		"\b\4\1\2MN\7\u00a5\2\2N\u0086\b\4\1\2OP\7\u00a6\2\2P\u0086\b\4\1\2QR\7"+
		"\u00a7\2\2R\u0086\b\4\1\2ST\7\u00a8\2\2T\u0086\b\4\1\2UV\7\u00a9\2\2V"+
		"\u0086\b\4\1\2WX\7\u00d9\2\2X\u0086\b\4\1\2YZ\7\u00dd\2\2Z\u0086\b\4\1"+
		"\2[\\\7\u00e8\2\2\\\u0086\b\4\1\2]^\7\u00e7\2\2^\u0086\b\4\1\2_`\7\u00f9"+
		"\2\2`\u0086\b\4\1\2ab\7\u010c\2\2b\u0086\b\4\1\2cd\7\u0113\2\2de\7\u0166"+
		"\2\2e\u0086\b\4\1\2fg\7\u0130\2\2g\u0086\b\4\1\2hi\7\u012f\2\2i\u0086"+
		"\b\4\1\2jk\7\u0131\2\2k\u0086\b\4\1\2lm\7\u0133\2\2m\u0086\b\4\1\2no\7"+
		"\u0132\2\2o\u0086\b\4\1\2pq\7\u013f\2\2q\u0086\b\4\1\2rs\7\u0145\2\2s"+
		"\u0086\b\4\1\2tu\7\u014d\2\2u\u0086\b\4\1\2vw\7\u014e\2\2w\u0086\b\4\1"+
		"\2xy\7\u0164\2\2y\u0086\b\4\1\2z{\7\u0165\2\2{\u0086\b\4\1\2|}\7\u0170"+
		"\2\2}\u0086\b\4\1\2~\u0081\5\36\20\2\177\u0080\7\3\2\2\u0080\u0082\t\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\b\4\1\2\u0084\u0086\3\2\2\2\u0085\66\3\2\2\2\u00858\3\2\2\2\u0085:\3"+
		"\2\2\2\u0085<\3\2\2\2\u0085>\3\2\2\2\u0085@\3\2\2\2\u0085B\3\2\2\2\u0085"+
		"D\3\2\2\2\u0085F\3\2\2\2\u0085K\3\2\2\2\u0085M\3\2\2\2\u0085O\3\2\2\2"+
		"\u0085Q\3\2\2\2\u0085S\3\2\2\2\u0085U\3\2\2\2\u0085W\3\2\2\2\u0085Y\3"+
		"\2\2\2\u0085[\3\2\2\2\u0085]\3\2\2\2\u0085_\3\2\2\2\u0085a\3\2\2\2\u0085"+
		"c\3\2\2\2\u0085f\3\2\2\2\u0085h\3\2\2\2\u0085j\3\2\2\2\u0085l\3\2\2\2"+
		"\u0085n\3\2\2\2\u0085p\3\2\2\2\u0085r\3\2\2\2\u0085t\3\2\2\2\u0085v\3"+
		"\2\2\2\u0085x\3\2\2\2\u0085z\3\2\2\2\u0085|\3\2\2\2\u0085~\3\2\2\2\u0086"+
		"\7\3\2\2\2\u0087\u0088\7\u019b\2\2\u0088\u008a\t\3\2\2\u0089\u008b\t\4"+
		"\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008d\7\u018d\2\2\u008d\u008f\7\u01a6\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\u019e\2\2\u0091\t\3\2\2\2\u0092"+
		"\u0093\5\f\7\2\u0093\u0094\b\6\1\2\u0094\13\3\2\2\2\u0095\u0096\5\16\b"+
		"\2\u0096\u0097\b\7\1\2\u0097\r\3\2\2\2\u0098\u0099\b\b\1\2\u0099\u009a"+
		"\7\u012a\2\2\u009a\u009f\5\20\t\2\u009b\u009c\7\u018d\2\2\u009c\u009e"+
		"\5\20\t\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3"+
		"\b\b\1\2\u00a3\17\3\2\2\2\u00a4\u00a5\b\t\1\2\u00a5\u00a6\5\34\17\2\u00a6"+
		"\u00a7\b\t\1\2\u00a7\u00c4\3\2\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\b"+
		"\t\1\2\u00aa\u00c4\3\2\2\2\u00ab\u00ac\5&\24\2\u00ac\u00ad\5\20\t\21\u00ad"+
		"\u00ae\b\t\1\2\u00ae\u00c4\3\2\2\2\u00af\u00b0\7\u019b\2\2\u00b0\u00b1"+
		"\5\20\t\2\u00b1\u00b2\7\u019e\2\2\u00b2\u00b3\b\t\1\2\u00b3\u00c4\3\2"+
		"\2\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6\b\t\1\2\u00b6\u00c4\3\2\2\2\u00b7"+
		"\u00b8\5\30\r\2\u00b8\u00b9\b\t\1\2\u00b9\u00c4\3\2\2\2\u00ba\u00bb\5"+
		"\32\16\2\u00bb\u00bc\b\t\1\2\u00bc\u00c4\3\2\2\2\u00bd\u00be\5\24\13\2"+
		"\u00be\u00bf\b\t\1\2\u00bf\u00c4\3\2\2\2\u00c0\u00c1\5\22\n\2\u00c1\u00c2"+
		"\b\t\1\2\u00c2\u00c4\3\2\2\2\u00c3\u00a4\3\2\2\2\u00c3\u00a8\3\2\2\2\u00c3"+
		"\u00ab\3\2\2\2\u00c3\u00af\3\2\2\2\u00c3\u00b4\3\2\2\2\u00c3\u00b7\3\2"+
		"\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4"+
		"\u00ef\3\2\2\2\u00c5\u00c6\f\20\2\2\u00c6\u00c7\t\5\2\2\u00c7\u00c8\5"+
		"\20\t\21\u00c8\u00c9\b\t\1\2\u00c9\u00ee\3\2\2\2\u00ca\u00cb\f\17\2\2"+
		"\u00cb\u00cc\t\6\2\2\u00cc\u00cd\5\20\t\20\u00cd\u00ce\b\t\1\2\u00ce\u00ee"+
		"\3\2\2\2\u00cf\u00d0\f\16\2\2\u00d0\u00d1\t\7\2\2\u00d1\u00d2\5\20\t\17"+
		"\u00d2\u00d3\b\t\1\2\u00d3\u00ee\3\2\2\2\u00d4\u00d5\f\r\2\2\u00d5\u00d6"+
		"\t\b\2\2\u00d6\u00d7\5\20\t\16\u00d7\u00d8\b\t\1\2\u00d8\u00ee\3\2\2\2"+
		"\u00d9\u00da\f\f\2\2\u00da\u00db\t\t\2\2\u00db\u00dc\5\20\t\r\u00dc\u00dd"+
		"\b\t\1\2\u00dd\u00ee\3\2\2\2\u00de\u00df\f\13\2\2\u00df\u00e0\5$\23\2"+
		"\u00e0\u00e1\5\20\t\f\u00e1\u00e2\b\t\1\2\u00e2\u00ee\3\2\2\2\u00e3\u00e4"+
		"\f\n\2\2\u00e4\u00e5\7\23\2\2\u00e5\u00e6\5\20\t\13\u00e6\u00e7\b\t\1"+
		"\2\u00e7\u00ee\3\2\2\2\u00e8\u00e9\f\t\2\2\u00e9\u00ea\7\u00ee\2\2\u00ea"+
		"\u00eb\5\20\t\n\u00eb\u00ec\b\t\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00c5\3"+
		"\2\2\2\u00ed\u00ca\3\2\2\2\u00ed\u00cf\3\2\2\2\u00ed\u00d4\3\2\2\2\u00ed"+
		"\u00d9\3\2\2\2\u00ed\u00de\3\2\2\2\u00ed\u00e3\3\2\2\2\u00ed\u00e8\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\21\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\u009b\2\2\u00f3\u00f4\7"+
		"\u019b\2\2\u00f4\u00f5\5\20\t\2\u00f5\u00f6\7\u018d\2\2\u00f6\u00f7\5"+
		"\20\t\2\u00f7\u00f8\7\u018d\2\2\u00f8\u00f9\5\20\t\2\u00f9\u00fa\7\u019e"+
		"\2\2\u00fa\u00fb\b\n\1\2\u00fb\u016e\3\2\2\2\u00fc\u00fd\7\u00b0\2\2\u00fd"+
		"\u00fe\7\u019b\2\2\u00fe\u00ff\5\20\t\2\u00ff\u0100\7\u019e\2\2\u0100"+
		"\u0101\b\n\1\2\u0101\u016e\3\2\2\2\u0102\u0103\7\u00af\2\2\u0103\u0104"+
		"\7\u019b\2\2\u0104\u0105\5\20\t\2\u0105\u0106\7\u019e\2\2\u0106\u0107"+
		"\b\n\1\2\u0107\u016e\3\2\2\2\u0108\u0109\7\u00b1\2\2\u0109\u010a\7\u019b"+
		"\2\2\u010a\u010b\5\20\t\2\u010b\u010c\7\u018d\2\2\u010c\u010d\5\20\t\2"+
		"\u010d\u010e\7\u019e\2\2\u010e\u010f\b\n\1\2\u010f\u016e\3\2\2\2\u0110"+
		"\u0111\b\n\1\2\u0111\u0112\7\64\2\2\u0112\u0113\7\u019b\2\2\u0113\u0114"+
		"\5\20\t\2\u0114\u0115\7\u018d\2\2\u0115\u0116\5\20\t\2\u0116\u011b\3\2"+
		"\2\2\u0117\u0118\7\u018d\2\2\u0118\u011a\5\20\t\2\u0119\u0117\3\2\2\2"+
		"\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7\u019e\2\2\u011f\u0120\b\n\1"+
		"\2\u0120\u016e\3\2\2\2\u0121\u0122\b\n\1\2\u0122\u0123\7(\2\2\u0123\u0129"+
		"\5\20\t\2\u0124\u0125\7\u0169\2\2\u0125\u0126\5\20\t\2\u0126\u0127\7\u014c"+
		"\2\2\u0127\u0128\5\20\t\2\u0128\u012a\3\2\2\2\u0129\u0124\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012e\7q\2\2\u012e\u012f\b\n\1\2\u012f\u016e\3\2\2\2\u0130"+
		"\u0131\b\n\1\2\u0131\u0132\7(\2\2\u0132\u0138\5\20\t\2\u0133\u0134\7\u0169"+
		"\2\2\u0134\u0135\5\20\t\2\u0135\u0136\7\u014c\2\2\u0136\u0137\5\20\t\2"+
		"\u0137\u0139\3\2\2\2\u0138\u0133\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7m\2\2\u013d"+
		"\u013e\5\20\t\2\u013e\u013f\7q\2\2\u013f\u0140\b\n\1\2\u0140\u016e\3\2"+
		"\2\2\u0141\u0142\b\n\1\2\u0142\u0148\7(\2\2\u0143\u0144\7\u0169\2\2\u0144"+
		"\u0145\5\20\t\2\u0145\u0146\7\u014c\2\2\u0146\u0147\5\20\t\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0143\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7q\2\2\u014d\u014e\b\n"+
		"\1\2\u014e\u016e\3\2\2\2\u014f\u0150\b\n\1\2\u0150\u0156\7(\2\2\u0151"+
		"\u0152\7\u0169\2\2\u0152\u0153\5\20\t\2\u0153\u0154\7\u014c\2\2\u0154"+
		"\u0155\5\20\t\2\u0155\u0157\3\2\2\2\u0156\u0151\3\2\2\2\u0157\u0158\3"+
		"\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\7m\2\2\u015b\u015c\5\20\t\2\u015c\u015d\7q\2\2\u015d\u015e\b\n"+
		"\1\2\u015e\u016e\3\2\2\2\u015f\u0160\7\u00e6\2\2\u0160\u0161\7\u019b\2"+
		"\2\u0161\u0162\5\20\t\2\u0162\u0163\7\u018d\2\2\u0163\u0164\5\20\t\2\u0164"+
		"\u0165\7\u019e\2\2\u0165\u0166\b\n\1\2\u0166\u016e\3\2\2\2\u0167\u0168"+
		"\7\27\2\2\u0168\u0169\7\u019b\2\2\u0169\u016a\5\20\t\2\u016a\u016b\7\u019e"+
		"\2\2\u016b\u016c\b\n\1\2\u016c\u016e\3\2\2\2\u016d\u00f2\3\2\2\2\u016d"+
		"\u00fc\3\2\2\2\u016d\u0102\3\2\2\2\u016d\u0108\3\2\2\2\u016d\u0110\3\2"+
		"\2\2\u016d\u0121\3\2\2\2\u016d\u0130\3\2\2\2\u016d\u0141\3\2\2\2\u016d"+
		"\u014f\3\2\2\2\u016d\u015f\3\2\2\2\u016d\u0167\3\2\2\2\u016e\23\3\2\2"+
		"\2\u016f\u0170\7\u015b\2\2\u0170\u0171\7\u019b\2\2\u0171\u0172\7\u019e"+
		"\2\2\u0172\u021e\b\13\1\2\u0173\u0174\7\u015b\2\2\u0174\u0175\7\u019b"+
		"\2\2\u0175\u0176\5\20\t\2\u0176\u0177\7\u019e\2\2\u0177\u0178\b\13\1\2"+
		"\u0178\u021e\3\2\2\2\u0179\u017a\7\u015b\2\2\u017a\u017b\7\u019b\2\2\u017b"+
		"\u017c\5\20\t\2\u017c\u017d\7\u018d\2\2\u017d\u017e\5\20\t\2\u017e\u017f"+
		"\7\u019e\2\2\u017f\u0180\b\13\1\2\u0180\u021e\3\2\2\2\u0181\u0182\7\u0171"+
		"\2\2\u0182\u0183\7\u019b\2\2\u0183\u0184\5\20\t\2\u0184\u0185\7\u019e"+
		"\2\2\u0185\u0186\b\13\1\2\u0186\u021e\3\2\2\2\u0187\u0188\7\u0105\2\2"+
		"\u0188\u0189\7\u019b\2\2\u0189\u018a\5\20\t\2\u018a\u018b\7\u019e\2\2"+
		"\u018b\u018c\b\13\1\2\u018c\u021e\3\2\2\2\u018d\u018e\7\u00d6\2\2\u018e"+
		"\u018f\7\u019b\2\2\u018f\u0190\5\20\t\2\u0190\u0191\7\u019e\2\2\u0191"+
		"\u0192\b\13\1\2\u0192\u021e\3\2\2\2\u0193\u0194\7T\2\2\u0194\u0195\7\u019b"+
		"\2\2\u0195\u0196\5\20\t\2\u0196\u0197\7\u019e\2\2\u0197\u0198\b\13\1\2"+
		"\u0198\u021e\3\2\2\2\u0199\u019a\7\u0099\2\2\u019a\u019b\7\u019b\2\2\u019b"+
		"\u019c\5\20\t\2\u019c\u019d\7\u019e\2\2\u019d\u019e\b\13\1\2\u019e\u021e"+
		"\3\2\2\2\u019f\u01a0\7\u00d5\2\2\u01a0\u01a1\7\u019b\2\2\u01a1\u01a2\5"+
		"\20\t\2\u01a2\u01a3\7\u019e\2\2\u01a3\u01a4\b\13\1\2\u01a4\u021e\3\2\2"+
		"\2\u01a5\u01a6\7\u0125\2\2\u01a6\u01a7\7\u019b\2\2\u01a7\u01a8\5\20\t"+
		"\2\u01a8\u01a9\7\u019e\2\2\u01a9\u01aa\b\13\1\2\u01aa\u021e\3\2\2\2\u01ab"+
		"\u01ac\7\u0168\2\2\u01ac\u01ad\7\u019b\2\2\u01ad\u01ae\5\20\t\2\u01ae"+
		"\u01af\7\u019e\2\2\u01af\u01b0\b\13\1\2\u01b0\u021e\3\2\2\2\u01b1\u01b2"+
		"\7P\2\2\u01b2\u01b3\7\u019b\2\2\u01b3\u01b4\5\20\t\2\u01b4\u01b5\7\u018d"+
		"\2\2\u01b5\u01b6\5\20\t\2\u01b6\u01b7\7\u019e\2\2\u01b7\u01b8\b\13\1\2"+
		"\u01b8\u021e\3\2\2\2\u01b9\u01ba\7O\2\2\u01ba\u01bb\7\u019b\2\2\u01bb"+
		"\u01bc\5\20\t\2\u01bc\u01bd\7\u018d\2\2\u01bd\u01be\5\20\t\2\u01be\u01bf"+
		"\7\u019e\2\2\u01bf\u01c0\b\13\1\2\u01c0\u021e\3\2\2\2\u01c1\u01c2\7R\2"+
		"\2\u01c2\u01c3\7\u019b\2\2\u01c3\u01c4\5\20\t\2\u01c4\u01c5\7\u018d\2"+
		"\2\u01c5\u01c6\5\20\t\2\u01c6\u01c7\7\u019e\2\2\u01c7\u01c8\b\13\1\2\u01c8"+
		"\u021e\3\2\2\2\u01c9\u01ca\7\u0152\2\2\u01ca\u01cb\7\u019b\2\2\u01cb\u01cc"+
		"\5\20\t\2\u01cc\u01cd\7\u018d\2\2\u01cd\u01ce\5\20\t\2\u01ce\u01cf\7\u019e"+
		"\2\2\u01cf\u01d0\b\13\1\2\u01d0\u021e\3\2\2\2\u01d1\u01d2\7\u008a\2\2"+
		"\u01d2\u01d3\7\u019b\2\2\u01d3\u01d4\5\20\t\2\u01d4\u01d5\7\u018d\2\2"+
		"\u01d5\u01d6\5\20\t\2\u01d6\u01d7\7\u019e\2\2\u01d7\u01d8\b\13\1\2\u01d8"+
		"\u021e\3\2\2\2\u01d9\u01dc\7\u0175\2\2\u01da\u01db\7\u019b\2\2\u01db\u01dd"+
		"\7\u019e\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2"+
		"\2\u01de\u021e\b\13\1\2\u01df\u01e2\7\u0176\2\2\u01e0\u01e1\7\u019b\2"+
		"\2\u01e1\u01e3\7\u019e\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u021e\b\13\1\2\u01e5\u01e6\7\20\2\2\u01e6\u01e7\7"+
		"\u019b\2\2\u01e7\u01e8\5\20\t\2\u01e8\u01e9\7\u018d\2\2\u01e9\u01ea\5"+
		"\20\t\2\u01ea\u01eb\7\u019e\2\2\u01eb\u01ec\b\13\1\2\u01ec\u021e\3\2\2"+
		"\2\u01ed\u01ee\7\20\2\2\u01ee\u01ef\7\u019b\2\2\u01ef\u01f0\5\20\t\2\u01f0"+
		"\u01f1\7\u018d\2\2\u01f1\u01f2\5\20\t\2\u01f2\u01f3\7\u018d\2\2\u01f3"+
		"\u01f4\5\20\t\2\u01f4\u01f5\7\u019e\2\2\u01f5\u01f6\b\13\1\2\u01f6\u021e"+
		"\3\2\2\2\u01f7\u01f8\7\u00b9\2\2\u01f8\u01f9\7\u019b\2\2\u01f9\u01fa\5"+
		"\20\t\2\u01fa\u01fb\7\u019e\2\2\u01fb\u01fc\b\13\1\2\u01fc\u021e\3\2\2"+
		"\2\u01fd\u01fe\7\u00db\2\2\u01fe\u01ff\7\u019b\2\2\u01ff\u0200\5\20\t"+
		"\2\u0200\u0201\7\u018d\2\2\u0201\u0202\5\20\t\2\u0202\u0203\7\u019e\2"+
		"\2\u0203\u0204\b\13\1\2\u0204\u021e\3\2\2\2\u0205\u0206\7\u0156\2\2\u0206"+
		"\u0207\7\u019b\2\2\u0207\u0208\5\20\t\2\u0208\u0209\7\u018d\2\2\u0209"+
		"\u020a\5\20\t\2\u020a\u020b\7\u019e\2\2\u020b\u020c\b\13\1\2\u020c\u021e"+
		"\3\2\2\2\u020d\u020e\7\u00d7\2\2\u020e\u020f\7\u019b\2\2\u020f\u0210\5"+
		"\20\t\2\u0210\u0211\7\u018d\2\2\u0211\u0212\5\20\t\2\u0212\u0213\7\u019e"+
		"\2\2\u0213\u0214\b\13\1\2\u0214\u021e\3\2\2\2\u0215\u0216\7Q\2\2\u0216"+
		"\u0217\7\u019b\2\2\u0217\u0218\5\20\t\2\u0218\u0219\7\u018d\2\2\u0219"+
		"\u021a\5\20\t\2\u021a\u021b\7\u019e\2\2\u021b\u021c\b\13\1\2\u021c\u021e"+
		"\3\2\2\2\u021d\u016f\3\2\2\2\u021d\u0173\3\2\2\2\u021d\u0179\3\2\2\2\u021d"+
		"\u0181\3\2\2\2\u021d\u0187\3\2\2\2\u021d\u018d\3\2\2\2\u021d\u0193\3\2"+
		"\2\2\u021d\u0199\3\2\2\2\u021d\u019f\3\2\2\2\u021d\u01a5\3\2\2\2\u021d"+
		"\u01ab\3\2\2\2\u021d\u01b1\3\2\2\2\u021d\u01b9\3\2\2\2\u021d\u01c1\3\2"+
		"\2\2\u021d\u01c9\3\2\2\2\u021d\u01d1\3\2\2\2\u021d\u01d9\3\2\2\2\u021d"+
		"\u01df\3\2\2\2\u021d\u01e5\3\2\2\2\u021d\u01ed\3\2\2\2\u021d\u01f7\3\2"+
		"\2\2\u021d\u01fd\3\2\2\2\u021d\u0205\3\2\2\2\u021d\u020d\3\2\2\2\u021d"+
		"\u0215\3\2\2\2\u021e\25\3\2\2\2\u021f\u0220\7)\2\2\u0220\u0221\7\u019b"+
		"\2\2\u0221\u0222\5\20\t\2\u0222\u0223\7\24\2\2\u0223\u0225\5\6\4\2\u0224"+
		"\u0226\5\b\5\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u0228\7\u019e\2\2\u0228\u0229\b\f\1\2\u0229\u0246\3\2\2\2\u022a"+
		"\u022b\7C\2\2\u022b\u022c\7\u019b\2\2\u022c\u022d\5\20\t\2\u022d\u022e"+
		"\7\u019e\2\2\u022e\u022f\b\f\1\2\u022f\u0246\3\2\2\2\u0230\u0231\7C\2"+
		"\2\u0231\u0232\7\u019b\2\2\u0232\u0233\7\u0199\2\2\u0233\u0234\7\u019e"+
		"\2\2\u0234\u0246\b\f\1\2\u0235\u0236\7\u0175\2\2\u0236\u0246\b\f\1\2\u0237"+
		"\u0238\7\u0175\2\2\u0238\u0239\7\u019b\2\2\u0239\u023a\7\u019e\2\2\u023a"+
		"\u0246\b\f\1\2\u023b\u023c\7\u0176\2\2\u023c\u0246\b\f\1\2\u023d\u023e"+
		"\7\u0176\2\2\u023e\u023f\7\u019b\2\2\u023f\u0240\7\u019e\2\2\u0240\u0246"+
		"\b\f\1\2\u0241\u0242\7\u0188\2\2\u0242\u0246\b\f\1\2\u0243\u0244\7\u018a"+
		"\2\2\u0244\u0246\b\f\1\2\u0245\u021f\3\2\2\2\u0245\u022a\3\2\2\2\u0245"+
		"\u0230\3\2\2\2\u0245\u0235\3\2\2\2\u0245\u0237\3\2\2\2\u0245\u023b\3\2"+
		"\2\2\u0245\u023d\3\2\2\2\u0245\u0241\3\2\2\2\u0245\u0243\3\2\2\2\u0246"+
		"\27\3\2\2\2\u0247\u0248\7\u011b\2\2\u0248\u0249\7\u019b\2\2\u0249\u024a"+
		"\5\20\t\2\u024a\u024b\7\u019e\2\2\u024b\u024c\b\r\1\2\u024c\u031a\3\2"+
		"\2\2\u024d\u024e\7\u011b\2\2\u024e\u024f\7\u019b\2\2\u024f\u0250\5\20"+
		"\t\2\u0250\u0251\7\u018d\2\2\u0251\u0252\5\20\t\2\u0252\u0253\7\u019e"+
		"\2\2\u0253\u0254\b\r\1\2\u0254\u031a\3\2\2\2\u0255\u0256\7\u0084\2\2\u0256"+
		"\u0257\7\u019b\2\2\u0257\u0258\5\20\t\2\u0258\u0259\7\u019e\2\2\u0259"+
		"\u025a\b\r\1\2\u025a\u031a\3\2\2\2\u025b\u025c\t\n\2\2\u025c\u025d\7\u019b"+
		"\2\2\u025d\u025e\5\20\t\2\u025e\u025f\7\u019e\2\2\u025f\u0260\b\r\1\2"+
		"\u0260\u031a\3\2\2\2\u0261\u0262\7\u010b\2\2\u0262\u0263\7\u019b\2\2\u0263"+
		"\u0264\7\u019e\2\2\u0264\u031a\b\r\1\2\u0265\u0266\7\u010b\2\2\u0266\u0267"+
		"\7\u019b\2\2\u0267\u0268\5\20\t\2\u0268\u0269\7\u019e\2\2\u0269\u026a"+
		"\b\r\1\2\u026a\u031a\3\2\2\2\u026b\u026c\7{\2\2\u026c\u026d\7\u019b\2"+
		"\2\u026d\u026e\5\20\t\2\u026e\u026f\7\u019e\2\2\u026f\u0270\b\r\1\2\u0270"+
		"\u031a\3\2\2\2\u0271\u0272\7\u00cb\2\2\u0272\u0273\7\u019b\2\2\u0273\u0274"+
		"\5\20\t\2\u0274\u0275\7\u019e\2\2\u0275\u0276\b\r\1\2\u0276\u031a\3\2"+
		"\2\2\u0277\u0278\7\u00c5\2\2\u0278\u0279\7\u019b\2\2\u0279\u027a\5\20"+
		"\t\2\u027a\u027b\7\u019e\2\2\u027b\u027c\b\r\1\2\u027c\u031a\3\2\2\2\u027d"+
		"\u027e\7\u00c6\2\2\u027e\u027f\7\u019b\2\2\u027f\u0280\5\20\t\2\u0280"+
		"\u0281\7\u019e\2\2\u0281\u0282\b\r\1\2\u0282\u031a\3\2\2\2\u0283\u0284"+
		"\7\u00c4\2\2\u0284\u0285\7\u019b\2\2\u0285\u0286\5\20\t\2\u0286\u0287"+
		"\7\u018d\2\2\u0287\u0288\5\20\t\2\u0288\u0289\7\u019e\2\2\u0289\u028a"+
		"\b\r\1\2\u028a\u031a\3\2\2\2\u028b\u028c\t\13\2\2\u028c\u028d\7\u019b"+
		"\2\2\u028d\u028e\5\20\t\2\u028e\u028f\7\u018d\2\2\u028f\u0290\5\20\t\2"+
		"\u0290\u0291\7\u019e\2\2\u0291\u0292\b\r\1\2\u0292\u031a\3\2\2\2\u0293"+
		"\u0294\7\u0139\2\2\u0294\u0295\7\u019b\2\2\u0295\u0296\5\20\t\2\u0296"+
		"\u0297\7\u019e\2\2\u0297\u0298\b\r\1\2\u0298\u031a\3\2\2\2\u0299\u029a"+
		"\7\37\2\2\u029a\u029b\7\u019b\2\2\u029b\u029c\5\20\t\2\u029c\u029d\7\u019e"+
		"\2\2\u029d\u029e\b\r\1\2\u029e\u031a\3\2\2\2\u029f\u02a0\7\u0096\2\2\u02a0"+
		"\u02a1\7\u019b\2\2\u02a1\u02a2\5\20\t\2\u02a2\u02a3\7\u019e\2\2\u02a3"+
		"\u02a4\b\r\1\2\u02a4\u031a\3\2\2\2\u02a5\u02a6\7\u0158\2\2\u02a6\u02a7"+
		"\7\u019b\2\2\u02a7\u02a8\5\20\t\2\u02a8\u02a9\7\u019e\2\2\u02a9\u02aa"+
		"\b\r\1\2\u02aa\u031a\3\2\2\2\u02ab\u02ac\7@\2\2\u02ac\u02ad\7\u019b\2"+
		"\2\u02ad\u02ae\5\20\t\2\u02ae\u02af\7\u018d\2\2\u02af\u02b0\5\20\t\2\u02b0"+
		"\u02b1\7\u018d\2\2\u02b1\u02b2\5\20\t\2\u02b2\u02b3\7\u019e\2\2\u02b3"+
		"\u02b4\b\r\1\2\u02b4\u031a\3\2\2\2\u02b5\u02b6\7\16\2\2\u02b6\u02b7\7"+
		"\u019b\2\2\u02b7\u02b8\5\20\t\2\u02b8\u02b9\7\u019e\2\2\u02b9\u02ba\b"+
		"\r\1\2\u02ba\u031a\3\2\2\2\u02bb\u02bc\7\u00fa\2\2\u02bc\u02bd\7\u019b"+
		"\2\2\u02bd\u02be\5\20\t\2\u02be\u02bf\7\u018d\2\2\u02bf\u02c0\5\20\t\2"+
		"\u02c0\u02c1\7\u019e\2\2\u02c1\u02c2\b\r\1\2\u02c2\u031a\3\2\2\2\u02c3"+
		"\u02c4\7\u012e\2\2\u02c4\u02c5\7\u019b\2\2\u02c5\u02c6\5\20\t\2\u02c6"+
		"\u02c7\7\u019e\2\2\u02c7\u02c8\b\r\1\2\u02c8\u031a\3\2\2\2\u02c9\u02ca"+
		"\7\26\2\2\u02ca\u02cb\7\u019b\2\2\u02cb\u02cc\5\20\t\2\u02cc\u02cd\7\u019e"+
		"\2\2\u02cd\u02ce\b\r\1\2\u02ce\u031a\3\2\2\2\u02cf\u02d0\7B\2\2\u02d0"+
		"\u02d1\7\u019b\2\2\u02d1\u02d2\5\20\t\2\u02d2\u02d3\7\u019e\2\2\u02d3"+
		"\u02d4\b\r\1\2\u02d4\u031a\3\2\2\2\u02d5\u02d6\7\17\2\2\u02d6\u02d7\7"+
		"\u019b\2\2\u02d7\u02d8\5\20\t\2\u02d8\u02d9\7\u019e\2\2\u02d9\u02da\b"+
		"\r\1\2\u02da\u031a\3\2\2\2\u02db\u02dc\7\u0148\2\2\u02dc\u02dd\7\u019b"+
		"\2\2\u02dd\u02de\5\20\t\2\u02de\u02df\7\u019e\2\2\u02df\u02e0\b\r\1\2"+
		"\u02e0\u031a\3\2\2\2\u02e1\u02e2\7\31\2\2\u02e2\u02e3\7\u019b\2\2\u02e3"+
		"\u02e4\5\20\t\2\u02e4\u02e5\7\u019e\2\2\u02e5\u02e6\b\r\1\2\u02e6\u031a"+
		"\3\2\2\2\u02e7\u02e8\7^\2\2\u02e8\u02e9\7\u019b\2\2\u02e9\u02ea\5\20\t"+
		"\2\u02ea\u02eb\7\u019e\2\2\u02eb\u02ec\b\r\1\2\u02ec\u031a\3\2\2\2\u02ed"+
		"\u02ee\7\u0109\2\2\u02ee\u02ef\7\u019b\2\2\u02ef\u02f0\5\20\t\2\u02f0"+
		"\u02f1\7\u019e\2\2\u02f1\u02f2\b\r\1\2\u02f2\u031a\3\2\2\2\u02f3\u02f4"+
		"\7\u00fb\2\2\u02f4\u02f5\7\u019b\2\2\u02f5\u02f6\5\20\t\2\u02f6\u02f7"+
		"\7\u019e\2\2\u02f7\u02f8\b\r\1\2\u02f8\u031a\3\2\2\2\u02f9\u02fa\7\u00da"+
		"\2\2\u02fa\u02fb\7\u019b\2\2\u02fb\u02fc\5\20\t\2\u02fc\u02fd\7\u019e"+
		"\2\2\u02fd\u02fe\b\r\1\2\u02fe\u031a\3\2\2\2\u02ff\u0300\7\u012d\2\2\u0300"+
		"\u0301\7\u019b\2\2\u0301\u0302\5\20\t\2\u0302\u0303\7\u019e\2\2\u0303"+
		"\u0304\b\r\1\2\u0304\u031a\3\2\2\2\u0305\u0306\7\b\2\2\u0306\u0307\7\u019b"+
		"\2\2\u0307\u0308\7\u019e\2\2\u0308\u031a\b\r\1\2\u0309\u030a\7\t\2\2\u030a"+
		"\u030b\7\u019b\2\2\u030b\u030c\7\u019e\2\2\u030c\u031a\b\r\1\2\u030d\u030e"+
		"\7|\2\2\u030e\u030f\7\u019b\2\2\u030f\u0310\5\20\t\2\u0310\u0311\7\u019e"+
		"\2\2\u0311\u0312\b\r\1\2\u0312\u031a\3\2\2\2\u0313\u0314\7*\2\2\u0314"+
		"\u0315\7\u019b\2\2\u0315\u0316\5\20\t\2\u0316\u0317\7\u019e\2\2\u0317"+
		"\u0318\b\r\1\2\u0318\u031a\3\2\2\2\u0319\u0247\3\2\2\2\u0319\u024d\3\2"+
		"\2\2\u0319\u0255\3\2\2\2\u0319\u025b\3\2\2\2\u0319\u0261\3\2\2\2\u0319"+
		"\u0265\3\2\2\2\u0319\u026b\3\2\2\2\u0319\u0271\3\2\2\2\u0319\u0277\3\2"+
		"\2\2\u0319\u027d\3\2\2\2\u0319\u0283\3\2\2\2\u0319\u028b\3\2\2\2\u0319"+
		"\u0293\3\2\2\2\u0319\u0299\3\2\2\2\u0319\u029f\3\2\2\2\u0319\u02a5\3\2"+
		"\2\2\u0319\u02ab\3\2\2\2\u0319\u02b5\3\2\2\2\u0319\u02bb\3\2\2\2\u0319"+
		"\u02c3\3\2\2\2\u0319\u02c9\3\2\2\2\u0319\u02cf\3\2\2\2\u0319\u02d5\3\2"+
		"\2\2\u0319\u02db\3\2\2\2\u0319\u02e1\3\2\2\2\u0319\u02e7\3\2\2\2\u0319"+
		"\u02ed\3\2\2\2\u0319\u02f3\3\2\2\2\u0319\u02f9\3\2\2\2\u0319\u02ff\3\2"+
		"\2\2\u0319\u0305\3\2\2\2\u0319\u0309\3\2\2\2\u0319\u030d\3\2\2\2\u0319"+
		"\u0313\3\2\2\2\u031a\31\3\2\2\2\u031b\u031c\7\u0123\2\2\u031c\u031d\7"+
		"\u019b\2\2\u031d\u031e\5\20\t\2\u031e\u031f\7\u019e\2\2\u031f\u0320\b"+
		"\16\1\2\u0320\u032e\3\2\2\2\u0321\u0322\7\u015d\2\2\u0322\u0323\7\u019b"+
		"\2\2\u0323\u0324\5\20\t\2\u0324\u0325\7\u019e\2\2\u0325\u0326\b\16\1\2"+
		"\u0326\u032e\3\2\2\2\u0327\u0328\7\u00ca\2\2\u0328\u0329\7\u019b\2\2\u0329"+
		"\u032a\5\20\t\2\u032a\u032b\7\u019e\2\2\u032b\u032c\b\16\1\2\u032c\u032e"+
		"\3\2\2\2\u032d\u031b\3\2\2\2\u032d\u0321\3\2\2\2\u032d\u0327\3\2\2\2\u032e"+
		"\33\3\2\2\2\u032f\u0330\7\u01a5\2\2\u0330\u0340\b\17\1\2\u0331\u0332\7"+
		"\u01a4\2\2\u0332\u0340\b\17\1\2\u0333\u0334\7\u01a3\2\2\u0334\u0340\b"+
		"\17\1\2\u0335\u0336\7\r\2\2\u0336\u0340\b\17\1\2\u0337\u0338\7\f\2\2\u0338"+
		"\u0340\b\17\1\2\u0339\u033a\5 \21\2\u033a\u033b\b\17\1\2\u033b\u0340\3"+
		"\2\2\2\u033c\u033d\5\"\22\2\u033d\u033e\b\17\1\2\u033e\u0340\3\2\2\2\u033f"+
		"\u032f\3\2\2\2\u033f\u0331\3\2\2\2\u033f\u0333\3\2\2\2\u033f\u0335\3\2"+
		"\2\2\u033f\u0337\3\2\2\2\u033f\u0339\3\2\2\2\u033f\u033c\3\2\2\2\u0340"+
		"\35\3\2\2\2\u0341\u0342\7\u01a2\2\2\u0342\u0344\7\n\2\2\u0343\u0341\3"+
		"\2\2\2\u0343\u0344\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0346\7\u01a2\2\2"+
		"\u0346\u0348\7\n\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349"+
		"\3\2\2\2\u0349\u034a\7\u01a2\2\2\u034a\u034b\b\20\1\2\u034b\37\3\2\2\2"+
		"\u034c\u034d\7N\2\2\u034d\u034e\7\u01a5\2\2\u034e\u034f\b\21\1\2\u034f"+
		"!\3\2\2\2\u0350\u0351\7\u014d\2\2\u0351\u0352\7\u01a5\2\2\u0352\u0353"+
		"\b\22\1\2\u0353#\3\2\2\2\u0354\u035b\7\u00ae\2\2\u0355\u0356\7\u00ae\2"+
		"\2\u0356\u035b\7\u00e3\2\2\u0357\u035b\7\u009e\2\2\u0358\u0359\7\u00e3"+
		"\2\2\u0359\u035b\7\u009e\2\2\u035a\u0354\3\2\2\2\u035a\u0355\3\2\2\2\u035a"+
		"\u0357\3\2\2\2\u035a\u0358\3\2\2\2\u035b%\3\2\2\2\u035c\u035d\t\f\2\2"+
		"\u035d\'\3\2\2\2\35\62H\u0081\u0085\u008a\u008e\u009f\u00c3\u00ed\u00ef"+
		"\u011b\u012b\u013a\u014a\u0158\u016d\u01dc\u01e2\u021d\u0225\u0245\u0319"+
		"\u032d\u033f\u0343\u0347\u035a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}