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
		T_AES_ENCRYPT=15, T_AES_DECRYPT=16, T_ALL=17, T_ALTER=18, T_AND=19, T_ARRAY=20, 
		T_AS=21, T_ASC=22, T_ASCII=23, T_ASIN=24, T_ASSERT_TRUE=25, T_AT=26, T_ATAN=27, 
		T_AUTO_INCREMENT=28, T_AVG=29, T_BASE64=30, T_BEGIN=31, T_BETWEEN=32, 
		T_BIGINT=33, T_BIN=34, T_BINARY=35, T_BIT=36, T_BODY=37, T_BREAK=38, T_BY=39, 
		T_BYTE=40, T_CALL=41, T_CALLER=42, T_CASCADE=43, T_CASE=44, T_CAST=45, 
		T_CBR=46, T_CEIL=47, T_CEILING=48, T_CHAR=49, T_CHARACTER=50, T_CHARACTER_LENGTH=51, 
		T_CHARSET=52, T_CHR=53, T_CLIENT=54, T_CLOSE=55, T_CLUSTERED=56, T_CMP=57, 
		T_COALESCE=58, T_COLLECT=59, T_COLLECT_SET=60, T_COLLECT_LIST=61, T_COLLECTION=62, 
		T_COLUMN=63, T_COMMENT=64, T_CONSTANT=65, T_COMMIT=66, T_COMPRESS=67, 
		T_CONCAT=68, T_CONCAT_WS=69, T_CONDITION=70, T_CONSTRAINT=71, T_CONTINUE=72, 
		T_CONV=73, T_COPY=74, T_CORR=75, T_COS=76, T_COUNT=77, T_COUNT_BIG=78, 
		T_COVAR_POP=79, T_COVAR_SAMP=80, T_CRC32=81, T_CREATE=82, T_CREATION=83, 
		T_CREATOR=84, T_CS=85, T_CURRENT=86, T_CURRENT_SCHEMA=87, T_CURRENT_DATABASE=88, 
		T_CURSOR=89, T_DATABASE=90, T_DATA=91, T_DATE=92, T_DATEADD=93, T_DATEDIFF=94, 
		T_DATE_FORMAT=95, T_DATESUB=96, T_DATETIME=97, T_DAY=98, T_DAYS=99, T_DEC=100, 
		T_DECIMAL=101, T_DECODE=102, T_DECLARE=103, T_DEFAULT=104, T_DEFERRED=105, 
		T_DEFINED=106, T_DEFINER=107, T_DEFINITION=108, T_DEGREES=109, T_DELETE=110, 
		T_DELIMITED=111, T_DELIMITER=112, T_DESC=113, T_DESCRIBE=114, T_DIAGNOSTICS=115, 
		T_DIR=116, T_DIRECTORY=117, T_DISTINCT=118, T_DISTRIBUTE=119, T_DO=120, 
		T_DOUBLE=121, T_DROP=122, T_DYNAMIC=123, T_ELSE=124, T_ELSEIF=125, T_ELSIF=126, 
		T_ELT=127, T_ENABLE=128, T_ENCODE=129, T_END=130, T_ENGINE=131, T_ESCAPED=132, 
		T_EXCEPT=133, T_EXEC=134, T_EXECUTE=135, T_EXCEPTION=136, T_EXCLUSIVE=137, 
		T_EXISTS=138, T_EXIT=139, T_EXP=140, T_EXPLODE=141, T_FACTORIAL=142, T_FALLBACK=143, 
		T_FALSE=144, T_FETCH=145, T_FIELD=146, T_FIELDS=147, T_FIELD_IN_SET=148, 
		T_FILE=149, T_FILES=150, T_FLOAT=151, T_FLOOR=152, T_FOR=153, T_FOREIGN=154, 
		T_FORMAT=155, T_FORMAT_NUMBER=156, T_FOUND=157, T_FROM=158, T_FROMUTCTIMESTAMP=159, 
		T_FULL=160, T_FUNCTION=161, T_GET=162, T_GET_JSON_OBJECTS=163, T_GLOBAL=164, 
		T_GO=165, T_GRANT=166, T_GROUP=167, T_HANDLER=168, T_HASH=169, T_HAVING=170, 
		T_HDFS=171, T_HEX=172, T_HISTOGRAM_NUMERIC=173, T_HIVE=174, T_HOST=175, 
		T_HOUR=176, T_IDENTITY=177, T_IF=178, T_IGNORE=179, T_IMMEDIATE=180, T_IN=181, 
		T_INCLUDE=182, T_INDEX=183, T_IN_FILE=184, T_INITCAP=185, T_INITRANS=186, 
		T_INLINE=187, T_INNER=188, T_INOUT=189, T_INSERT=190, T_IN_STR=191, T_INT=192, 
		T_INT2=193, T_INT4=194, T_INT8=195, T_INTEGER=196, T_INTERSECT=197, T_INTERVAL=198, 
		T_INTO=199, T_INVOKER=200, T_IS=201, T_ISNOTNULL=202, T_ISNULL=203, T_NVL=204, 
		T_ISOPEN=205, T_ITEMS=206, T_JAVA_METHOD=207, T_JOIN=208, T_KEEP=209, 
		T_KEY=210, T_KEYS=211, T_LANGUAGE=212, T_LASTDAY=213, T_LCASE=214, T_LEAVE=215, 
		T_LEFT=216, T_LENGTH=217, T_LEVENSHTEIN=218, T_LIKE=219, T_LIMIT=220, 
		T_LINES=221, T_LOCAL=222, T_LOCATE=223, T_LOCATION=224, T_LOCATOR=225, 
		T_LOCATORS=226, T_LOCKS=227, T_LOG=228, T_LOG10=229, T_LOG2=230, T_LOGGED=231, 
		T_LOGGED_IN_USER=232, T_LOGGING=233, T_LOOP=234, T_LOWER=235, T_LPAD=236, 
		T_LN=237, T_LTRIM=238, T_MAP=239, T_MASK=240, T_MASK_FIRST_N=241, T_MASK_HASH=242, 
		T_MASK_LAST_N=243, T_MASK_SHOW_FIRST_N=244, T_MASK_SHOW_LAST_N=245, T_MATCHED=246, 
		T_MAX=247, T_MAXTRANS=248, T_MD5=249, T_MERGE=250, T_MESSAGE_TEXT=251, 
		T_MICROSECOND=252, T_MICROSECONDS=253, T_MIN=254, T_MINUTE=255, T_MONTH=256, 
		T_MONTHS_BETWEEN=257, T_MULTISET=258, T_NCHAR=259, T_NEGATIVE=260, T_NEXT_DAY=261, 
		T_NEW=262, T_NVARCHAR=263, T_NO=264, T_NOCOUNT=265, T_NOCOMPRESS=266, 
		T_NOLOGGING=267, T_NONE=268, T_NOT=269, T_NOTFOUND=270, T_NTILE=271, T_NULL=272, 
		T_NULLIF=273, T_NUMERIC=274, T_NUMBER=275, T_OBJECT=276, T_OCTET_LENGTH=277, 
		T_OFF=278, T_ON=279, T_ONLY=280, T_OPEN=281, T_OR=282, T_ORDER=283, T_OUT=284, 
		T_OUTER=285, T_OVER=286, T_OVERWRITE=287, T_OWNER=288, T_PACKAGE=289, 
		T_PARSE_URL=290, T_PARTITION=291, T_PCTFREE=292, T_PCTUSED=293, T_PERCENTILE=294, 
		T_PERCENTILE_APPROX=295, T_PLS_INTEGER=296, T_PMOD=297, T_POSITIVE=298, 
		T_POSEXPLODE=299, T_POW=300, T_POWER=301, T_PRECISION=302, T_PRESERVE=303, 
		T_PRIMARY=304, T_PRINTF=305, T_PROC=306, T_PROCEDURE=307, T_QUALIFY=308, 
		T_QUARTER=309, T_QUERY_BAND=310, T_QUIT=311, T_QUOTE=312, T_RADIANS=313, 
		T_RAISE=314, T_RAND=315, T_REAL=316, T_REFERENCES=317, T_REFLECT=318, 
		T_REGEXP=319, T_REGEXP_EXTRACT=320, T_REGEXP_REPLACE=321, T_REGR_AVGX=322, 
		T_REGR_AVGY=323, T_REGR_COUNT=324, T_REGR_INTERCEPT=325, T_REGR_R2=326, 
		T_REGR_SLOPE=327, T_REGR_SXX=328, T_REGR_SXY=329, T_REGR_SYY=330, T_REPEAT=331, 
		T_REPLACE=332, T_RESIGNAL=333, T_RESTRICT=334, T_RESULT=335, T_RESULT_SET_LOCATOR=336, 
		T_RETURN=337, T_RETURNS=338, T_REVERSE=339, T_RIGHT=340, T_RLIKE=341, 
		T_ROLE=342, T_ROLLBACK=343, T_ROUND=344, T_ROW=345, T_ROWS=346, T_ROWTYPE=347, 
		T_ROW_COUNT=348, T_RPAD=349, T_RR=350, T_RS=351, T_RTRIM=352, T_PWD=353, 
		T_TRIM=354, T_SCHEMA=355, T_SECOND=356, T_SECONDS=357, T_SECURITY=358, 
		T_SEGMENT=359, T_SEL=360, T_SELECT=361, T_SENTENCES=362, T_SET=363, T_SETS=364, 
		T_SHA=365, T_SHA1=366, T_SHA2=367, T_SIGN=368, T_SIN=369, T_SIMPLE_DOUBLE=370, 
		T_SIMPLE_FLOAT=371, T_SIMPLE_INTEGER=372, T_SMALLDATETIME=373, T_SMALLINT=374, 
		T_SOUNDEX=375, T_SPACE=376, T_SPLIT=377, T_SQL=378, T_SQLEXCEPTION=379, 
		T_SQLINSERT=380, T_SQLSTATE=381, T_SQLWARNING=382, T_SQRT=383, T_STATS=384, 
		T_STATISTICS=385, T_STDDEV_POP=386, T_STDDEV_SAMP=387, T_STEP=388, T_STORAGE=389, 
		T_STORED=390, T_STRING=391, T_STR_TO_MAP=392, T_SUBDIR=393, T_SUBSTR=394, 
		T_SUBSTRING=395, T_SUBSTRING_INDEX=396, T_SUM=397, T_SUMMARY=398, T_SYS_REFCURSOR=399, 
		T_TABLE=400, T_TABLESPACE=401, T_TAN=402, T_TEMPORARY=403, T_TERMINATED=404, 
		T_TEXTIMAGE_ON=405, T_THEN=406, T_TIMESTAMP=407, T_TINYINT=408, T_TITLE=409, 
		T_TO=410, T_TOP=411, T_TOUTCTIMESTAMP=412, T_TRANSACTION=413, T_TRANSLATE=414, 
		T_TRUE=415, T_TRUNCATE=416, T_TRUNC=417, T_TYPE=418, T_UCASE=419, T_UNBASE64=420, 
		T_UNHEX=421, T_UNION=422, T_UNIQUE=423, T_UNIX_TIMESTAMP=424, T_UPDATE=425, 
		T_UPPER=426, T_UR=427, T_USE=428, T_USING=429, T_VALUE=430, T_VALUES=431, 
		T_VAR=432, T_VARCHAR=433, T_VARCHAR2=434, T_VARYING=435, T_VERSION=436, 
		T_VOLATILE=437, T_WEEKOFYEAR=438, T_WHEN=439, T_WHERE=440, T_WHILE=441, 
		T_WITH=442, T_WITHOUT=443, T_WORK=444, T_XACT_ABORT=445, T_XML=446, T_XPATH=447, 
		T_XPATH_BOOLEAN=448, T_XPATH_DOUBLE=449, T_XPATH_FLOAT=450, T_XPATH_INT=451, 
		T_XPATH_LONG=452, T_XPATH_NUMBER=453, T_XPATH_SHORT=454, T_XPATH_STRING=455, 
		T_YEAR=456, T_YES=457, T_ACTIVITY_COUNT=458, T_CUME_DIST=459, T_CURRENT_DATE=460, 
		T_CURRENT_TIMESTAMP=461, T_CURRENT_USER=462, T_DENSE_RANK=463, T_FIRST_VALUE=464, 
		T_LAG=465, T_LAST_VALUE=466, T_LEAD=467, T_MAX_PART_STRING=468, T_MIN_PART_STRING=469, 
		T_MAX_PART_INT=470, T_MIN_PART_INT=471, T_MAX_PART_DATE=472, T_MIN_PART_DATE=473, 
		T_PART_COUNT=474, T_PART_LOC=475, T_RANK=476, T_ROW_NUMBER=477, T_STDEV=478, 
		T_SYSDATE=479, T_VARIANCE=480, T_VAR_POP=481, T_VAR_SAMP=482, T_USER=483, 
		T_ADD=484, T_COLON=485, T_COMMA=486, T_PIPE=487, T_DIV=488, T_DOT2=489, 
		T_EQUAL=490, T_EQUAL2=491, T_NOTEQUAL=492, T_NOTEQUAL2=493, T_GREATER=494, 
		T_GREATEREQUAL=495, T_LESS=496, T_LESSEQUAL=497, T_MUL=498, T_OPEN_B=499, 
		T_OPEN_P=500, T_OPEN_SB=501, T_CLOSE_B=502, T_CLOSE_P=503, T_CLOSE_SB=504, 
		T_SEMICOLON=505, T_SUB=506, IDENTIFIER=507, INT_LITERAL=508, DECIMAL_LITERAL=509, 
		STRING_LITERAL=510, L_INT=511, L_DEC=512, SPACES=513, UNEXPECTED_CHAR=514;
	public static final int
		RULE_program = 0, RULE_stmt_list = 1, RULE_dtype = 2, RULE_dtype_len = 3, 
		RULE_stmt = 4, RULE_query_stmt = 5, RULE_select_stmt = 6, RULE_select_expr = 7, 
		RULE_bool_expr = 8, RULE_expr = 9, RULE_complex_types = 10, RULE_str_func = 11, 
		RULE_misc_func = 12, RULE_expr_concat = 13, RULE_expr_concat_item = 14, 
		RULE_cond_func = 15, RULE_date_func = 16, RULE_dat_convrt_func = 17, RULE_aggr_func = 18, 
		RULE_tab_generate_func = 19, RULE_math_func = 20, RULE_literal_values = 21, 
		RULE_ident = 22, RULE_date_literal = 23, RULE_timestamp_literal = 24, 
		RULE_set_operators = 25, RULE_unary_operator = 26;
	public static final String[] ruleNames = {
		"program", "stmt_list", "dtype", "dtype_len", "stmt", "query_stmt", "select_stmt", 
		"select_expr", "bool_expr", "expr", "complex_types", "str_func", "misc_func", 
		"expr_concat", "expr_concat_item", "cond_func", "date_func", "dat_convrt_func", 
		"aggr_func", "tab_generate_func", "math_func", "literal_values", "ident", 
		"date_literal", "timestamp_literal", "set_operators", "unary_operator"
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'+'", "':'", "','", "'||'", "'/'", 
		"'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", "'<='", "'*'", 
		"'{'", "'('", "'['", "'}'", "')'", "']'", "';'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "NULL_CONST", 
		"BOOL_LITERAL", "T_ABS", "T_ACOS", "T_ADD_MONTHS", "T_AES_ENCRYPT", "T_AES_DECRYPT", 
		"T_ALL", "T_ALTER", "T_AND", "T_ARRAY", "T_AS", "T_ASC", "T_ASCII", "T_ASIN", 
		"T_ASSERT_TRUE", "T_AT", "T_ATAN", "T_AUTO_INCREMENT", "T_AVG", "T_BASE64", 
		"T_BEGIN", "T_BETWEEN", "T_BIGINT", "T_BIN", "T_BINARY", "T_BIT", "T_BODY", 
		"T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", "T_CASCADE", "T_CASE", 
		"T_CAST", "T_CBR", "T_CEIL", "T_CEILING", "T_CHAR", "T_CHARACTER", "T_CHARACTER_LENGTH", 
		"T_CHARSET", "T_CHR", "T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COALESCE", 
		"T_COLLECT", "T_COLLECT_SET", "T_COLLECT_LIST", "T_COLLECTION", "T_COLUMN", 
		"T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", "T_CONCAT", "T_CONCAT_WS", 
		"T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", "T_CONV", "T_COPY", "T_CORR", 
		"T_COS", "T_COUNT", "T_COUNT_BIG", "T_COVAR_POP", "T_COVAR_SAMP", "T_CRC32", 
		"T_CREATE", "T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", 
		"T_CURRENT_DATABASE", "T_CURSOR", "T_DATABASE", "T_DATA", "T_DATE", "T_DATEADD", 
		"T_DATEDIFF", "T_DATE_FORMAT", "T_DATESUB", "T_DATETIME", "T_DAY", "T_DAYS", 
		"T_DEC", "T_DECIMAL", "T_DECODE", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", 
		"T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DEGREES", "T_DELETE", "T_DELIMITED", 
		"T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", "T_DIR", "T_DIRECTORY", 
		"T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", 
		"T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ELT", "T_ENABLE", "T_ENCODE", "T_END", 
		"T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", 
		"T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_EXP", "T_EXPLODE", "T_FACTORIAL", 
		"T_FALLBACK", "T_FALSE", "T_FETCH", "T_FIELD", "T_FIELDS", "T_FIELD_IN_SET", 
		"T_FILE", "T_FILES", "T_FLOAT", "T_FLOOR", "T_FOR", "T_FOREIGN", "T_FORMAT", 
		"T_FORMAT_NUMBER", "T_FOUND", "T_FROM", "T_FROMUTCTIMESTAMP", "T_FULL", 
		"T_FUNCTION", "T_GET", "T_GET_JSON_OBJECTS", "T_GLOBAL", "T_GO", "T_GRANT", 
		"T_GROUP", "T_HANDLER", "T_HASH", "T_HAVING", "T_HDFS", "T_HEX", "T_HISTOGRAM_NUMERIC", 
		"T_HIVE", "T_HOST", "T_HOUR", "T_IDENTITY", "T_IF", "T_IGNORE", "T_IMMEDIATE", 
		"T_IN", "T_INCLUDE", "T_INDEX", "T_IN_FILE", "T_INITCAP", "T_INITRANS", 
		"T_INLINE", "T_INNER", "T_INOUT", "T_INSERT", "T_IN_STR", "T_INT", "T_INT2", 
		"T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", 
		"T_INVOKER", "T_IS", "T_ISNOTNULL", "T_ISNULL", "T_NVL", "T_ISOPEN", "T_ITEMS", 
		"T_JAVA_METHOD", "T_JOIN", "T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", 
		"T_LASTDAY", "T_LCASE", "T_LEAVE", "T_LEFT", "T_LENGTH", "T_LEVENSHTEIN", 
		"T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATE", "T_LOCATION", "T_LOCATOR", 
		"T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOG10", "T_LOG2", "T_LOGGED", "T_LOGGED_IN_USER", 
		"T_LOGGING", "T_LOOP", "T_LOWER", "T_LPAD", "T_LN", "T_LTRIM", "T_MAP", 
		"T_MASK", "T_MASK_FIRST_N", "T_MASK_HASH", "T_MASK_LAST_N", "T_MASK_SHOW_FIRST_N", 
		"T_MASK_SHOW_LAST_N", "T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MD5", "T_MERGE", 
		"T_MESSAGE_TEXT", "T_MICROSECOND", "T_MICROSECONDS", "T_MIN", "T_MINUTE", 
		"T_MONTH", "T_MONTHS_BETWEEN", "T_MULTISET", "T_NCHAR", "T_NEGATIVE", 
		"T_NEXT_DAY", "T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", "T_NOCOMPRESS", 
		"T_NOLOGGING", "T_NONE", "T_NOT", "T_NOTFOUND", "T_NTILE", "T_NULL", "T_NULLIF", 
		"T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OCTET_LENGTH", "T_OFF", "T_ON", 
		"T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", "T_OVERWRITE", 
		"T_OWNER", "T_PACKAGE", "T_PARSE_URL", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", 
		"T_PERCENTILE", "T_PERCENTILE_APPROX", "T_PLS_INTEGER", "T_PMOD", "T_POSITIVE", 
		"T_POSEXPLODE", "T_POW", "T_POWER", "T_PRECISION", "T_PRESERVE", "T_PRIMARY", 
		"T_PRINTF", "T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUARTER", "T_QUERY_BAND", 
		"T_QUIT", "T_QUOTE", "T_RADIANS", "T_RAISE", "T_RAND", "T_REAL", "T_REFERENCES", 
		"T_REFLECT", "T_REGEXP", "T_REGEXP_EXTRACT", "T_REGEXP_REPLACE", "T_REGR_AVGX", 
		"T_REGR_AVGY", "T_REGR_COUNT", "T_REGR_INTERCEPT", "T_REGR_R2", "T_REGR_SLOPE", 
		"T_REGR_SXX", "T_REGR_SXY", "T_REGR_SYY", "T_REPEAT", "T_REPLACE", "T_RESIGNAL", 
		"T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", 
		"T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", "T_ROLLBACK", "T_ROUND", 
		"T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RPAD", "T_RR", "T_RS", 
		"T_RTRIM", "T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", 
		"T_SEGMENT", "T_SEL", "T_SELECT", "T_SENTENCES", "T_SET", "T_SETS", "T_SHA", 
		"T_SHA1", "T_SHA2", "T_SIGN", "T_SIN", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", 
		"T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SOUNDEX", "T_SPACE", 
		"T_SPLIT", "T_SQL", "T_SQLEXCEPTION", "T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", 
		"T_SQRT", "T_STATS", "T_STATISTICS", "T_STDDEV_POP", "T_STDDEV_SAMP", 
		"T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_STR_TO_MAP", "T_SUBDIR", 
		"T_SUBSTR", "T_SUBSTRING", "T_SUBSTRING_INDEX", "T_SUM", "T_SUMMARY", 
		"T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TAN", "T_TEMPORARY", 
		"T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", 
		"T_TITLE", "T_TO", "T_TOP", "T_TOUTCTIMESTAMP", "T_TRANSACTION", "T_TRANSLATE", 
		"T_TRUE", "T_TRUNCATE", "T_TRUNC", "T_TYPE", "T_UCASE", "T_UNBASE64", 
		"T_UNHEX", "T_UNION", "T_UNIQUE", "T_UNIX_TIMESTAMP", "T_UPDATE", "T_UPPER", 
		"T_UR", "T_USE", "T_USING", "T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", 
		"T_VARCHAR2", "T_VARYING", "T_VERSION", "T_VOLATILE", "T_WEEKOFYEAR", 
		"T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", 
		"T_XML", "T_XPATH", "T_XPATH_BOOLEAN", "T_XPATH_DOUBLE", "T_XPATH_FLOAT", 
		"T_XPATH_INT", "T_XPATH_LONG", "T_XPATH_NUMBER", "T_XPATH_SHORT", "T_XPATH_STRING", 
		"T_YEAR", "T_YES", "T_ACTIVITY_COUNT", "T_CUME_DIST", "T_CURRENT_DATE", 
		"T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", "T_FIRST_VALUE", 
		"T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", "T_MIN_PART_STRING", 
		"T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", "T_MIN_PART_DATE", 
		"T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", "T_STDEV", "T_SYSDATE", 
		"T_VARIANCE", "T_VAR_POP", "T_VAR_SAMP", "T_USER", "T_ADD", "T_COLON", 
		"T_COMMA", "T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", 
		"T_NOTEQUAL2", "T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", 
		"T_MUL", "T_OPEN_B", "T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", 
		"T_CLOSE_SB", "T_SEMICOLON", "T_SUB", "IDENTIFIER", "INT_LITERAL", "DECIMAL_LITERAL", 
		"STRING_LITERAL", "L_INT", "L_DEC", "SPACES", "UNEXPECTED_CHAR"
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
			setState(54);
			((ProgramContext)_localctx).stmt_list = stmt_list();
			setState(55);
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
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				((Stmt_listContext)_localctx).stmt = stmt();
				((Stmt_listContext)_localctx).stmts.add(((Stmt_listContext)_localctx).stmt);
				setState(60);
				match(T_SEMICOLON);
				}
				}
				setState(64); 
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T_CHAR);
				 ((DtypeContext)_localctx).res =  "CHAR"; 
				}
				break;
			case T_CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T_CHARACTER);
				 ((DtypeContext)_localctx).res =  "CHAR"; 
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(T_BIGINT);
				 ((DtypeContext)_localctx).res =  "BIGINT"; 
				}
				break;
			case T_BIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(T_BIT);
				 ((DtypeContext)_localctx).res =  "BIT"; 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(T_DATE);
				 ((DtypeContext)_localctx).res =  "DATE"; 
				}
				break;
			case T_DATETIME:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				match(T_DATETIME);
				 ((DtypeContext)_localctx).res =  "DATETIME"; 
				}
				break;
			case T_DEC:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				match(T_DEC);
				 ((DtypeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				match(T_DECIMAL);
				 ((DtypeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				match(T_DOUBLE);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PRECISION) {
					{
					setState(85);
					match(T_PRECISION);
					}
				}

				 ((DtypeContext)_localctx).res =  "DOUBLE"; 
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				match(T_FLOAT);
				 ((DtypeContext)_localctx).res =  "FLOAT"; 
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 11);
				{
				setState(91);
				match(T_INT);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_INT2:
				enterOuterAlt(_localctx, 12);
				{
				setState(93);
				match(T_INT2);
				 ((DtypeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case T_INT4:
				enterOuterAlt(_localctx, 13);
				{
				setState(95);
				match(T_INT4);
				 ((DtypeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case T_INT8:
				enterOuterAlt(_localctx, 14);
				{
				setState(97);
				match(T_INT8);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 15);
				{
				setState(99);
				match(T_INTEGER);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_NCHAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(101);
				match(T_NCHAR);
				 ((DtypeContext)_localctx).res =  "NCHAR"; 
				}
				break;
			case T_NVARCHAR:
				enterOuterAlt(_localctx, 17);
				{
				setState(103);
				match(T_NVARCHAR);
				 ((DtypeContext)_localctx).res =  "NVARCHAR"; 
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 18);
				{
				setState(105);
				match(T_NUMBER);
				 ((DtypeContext)_localctx).res =  "NUMBER"; 
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 19);
				{
				setState(107);
				match(T_NUMERIC);
				 ((DtypeContext)_localctx).res =  "NUMERIC"; 
				}
				break;
			case T_PLS_INTEGER:
				enterOuterAlt(_localctx, 20);
				{
				setState(109);
				match(T_PLS_INTEGER);
				 ((DtypeContext)_localctx).res =  "PLS_INTEGER"; 
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 21);
				{
				setState(111);
				match(T_REAL);
				 ((DtypeContext)_localctx).res =  "REAL"; 
				}
				break;
			case T_RESULT_SET_LOCATOR:
				enterOuterAlt(_localctx, 22);
				{
				setState(113);
				match(T_RESULT_SET_LOCATOR);
				setState(114);
				match(T_VARYING);
				 ((DtypeContext)_localctx).res =  "RESULT_SET_LOCATOR"; 
				}
				break;
			case T_SIMPLE_FLOAT:
				enterOuterAlt(_localctx, 23);
				{
				setState(116);
				match(T_SIMPLE_FLOAT);
				 ((DtypeContext)_localctx).res =  "SIMPLE_FLOAT"; 
				}
				break;
			case T_SIMPLE_DOUBLE:
				enterOuterAlt(_localctx, 24);
				{
				setState(118);
				match(T_SIMPLE_DOUBLE);
				 ((DtypeContext)_localctx).res =  "SIMPLE_DOUBLE"; 
				}
				break;
			case T_SIMPLE_INTEGER:
				enterOuterAlt(_localctx, 25);
				{
				setState(120);
				match(T_SIMPLE_INTEGER);
				 ((DtypeContext)_localctx).res =  "SIMPLE_INTEGER"; 
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 26);
				{
				setState(122);
				match(T_SMALLINT);
				 ((DtypeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case T_SMALLDATETIME:
				enterOuterAlt(_localctx, 27);
				{
				setState(124);
				match(T_SMALLDATETIME);
				 ((DtypeContext)_localctx).res =  "SMALLDATETIME"; 
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 28);
				{
				setState(126);
				match(T_STRING);
				 ((DtypeContext)_localctx).res =  "STRING"; 
				}
				break;
			case T_SYS_REFCURSOR:
				enterOuterAlt(_localctx, 29);
				{
				setState(128);
				match(T_SYS_REFCURSOR);
				 ((DtypeContext)_localctx).res =  "SYS_REFCURSOR"; 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 30);
				{
				setState(130);
				match(T_TIMESTAMP);
				 ((DtypeContext)_localctx).res =  "TIMESTAMP"; 
				}
				break;
			case T_TINYINT:
				enterOuterAlt(_localctx, 31);
				{
				setState(132);
				match(T_TINYINT);
				 ((DtypeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 32);
				{
				setState(134);
				match(T_VARCHAR);
				 ((DtypeContext)_localctx).res =  "VARCHAR"; 
				}
				break;
			case T_VARCHAR2:
				enterOuterAlt(_localctx, 33);
				{
				setState(136);
				match(T_VARCHAR2);
				 ((DtypeContext)_localctx).res =  "VARCHAR2"; 
				}
				break;
			case T_XML:
				enterOuterAlt(_localctx, 34);
				{
				setState(138);
				match(T_XML);
				 ((DtypeContext)_localctx).res =  "XML"; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 35);
				{
				setState(140);
				((DtypeContext)_localctx).ident = ident();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(141);
					match(T__0);
					setState(142);
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
			setState(149);
			match(T_OPEN_P);
			setState(150);
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
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(151);
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

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(154);
				match(T_COMMA);
				setState(155);
				match(L_INT);
				}
			}

			setState(158);
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
			setState(160);
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
			setState(163);
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
		public Select_exprContext select_expr;
		public List<Select_exprContext> exprs = new ArrayList<Select_exprContext>();
		public Tab_generate_funcContext tab_generate_func;
		public TerminalNode T_SELECT() { return getToken(HiveParser.T_SELECT, 0); }
		public List<Select_exprContext> select_expr() {
			return getRuleContexts(Select_exprContext.class);
		}
		public Select_exprContext select_expr(int i) {
			return getRuleContext(Select_exprContext.class,i);
		}
		public Tab_generate_funcContext tab_generate_func() {
			return getRuleContext(Tab_generate_funcContext.class,0);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 vector<Select_exprContext*> exprs; 
				setState(167);
				match(T_SELECT);
				setState(168);
				((Select_stmtContext)_localctx).select_expr = select_expr();
				((Select_stmtContext)_localctx).exprs.add(((Select_stmtContext)_localctx).select_expr);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(169);
					match(T_COMMA);
					setState(170);
					((Select_stmtContext)_localctx).select_expr = select_expr();
					((Select_stmtContext)_localctx).exprs.add(((Select_stmtContext)_localctx).select_expr);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 
				        vector<json> expr_list;
				        for(Select_exprContext* expr : ((Select_stmtContext)_localctx).exprs) {expr_list.push_back(expr->res);}
				        ((Select_stmtContext)_localctx).res =  hql_select_stmt(expr_list); 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(T_SELECT);
				setState(179);
				((Select_stmtContext)_localctx).tab_generate_func = tab_generate_func();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).tab_generate_func.res); 
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

	public static class Select_exprContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public Bool_exprContext bool_expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Select_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expr; }
	}

	public final Select_exprContext select_expr() throws RecognitionException {
		Select_exprContext _localctx = new Select_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_select_expr);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				((Select_exprContext)_localctx).expr = expr();
				 ((Select_exprContext)_localctx).res =  ((Select_exprContext)_localctx).expr.res;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				((Select_exprContext)_localctx).bool_expr = bool_expr();
				 ((Select_exprContext)_localctx).res =  ((Select_exprContext)_localctx).bool_expr.res;
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

	public static class Bool_exprContext extends ParserRuleContext {
		public json res;
		public ExprContext l_expr;
		public Token op;
		public ExprContext r_expr;
		public Set_operatorsContext set_operators;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Set_operatorsContext set_operators() {
			return getRuleContext(Set_operatorsContext.class,0);
		}
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HiveParser.T_OR, 0); }
		public TerminalNode T_IS() { return getToken(HiveParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(HiveParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool_expr);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				((Bool_exprContext)_localctx).l_expr = expr();
				setState(193);
				((Bool_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T_DIV || _la==T_MUL) ) {
					((Bool_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				((Bool_exprContext)_localctx).r_expr = expr();
				 ((Bool_exprContext)_localctx).res =  hql_generic_operator((((Bool_exprContext)_localctx).op!=null?((Bool_exprContext)_localctx).op.getText():null), ((Bool_exprContext)_localctx).l_expr.res, ((Bool_exprContext)_localctx).r_expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				((Bool_exprContext)_localctx).l_expr = expr();
				setState(198);
				((Bool_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
					((Bool_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				((Bool_exprContext)_localctx).r_expr = expr();
				 ((Bool_exprContext)_localctx).res =  hql_generic_operator((((Bool_exprContext)_localctx).op!=null?((Bool_exprContext)_localctx).op.getText():null), ((Bool_exprContext)_localctx).l_expr.res, ((Bool_exprContext)_localctx).r_expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				((Bool_exprContext)_localctx).l_expr = expr();
				setState(203);
				((Bool_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
					((Bool_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				((Bool_exprContext)_localctx).r_expr = expr();
				 ((Bool_exprContext)_localctx).res =  hql_generic_operator((((Bool_exprContext)_localctx).op!=null?((Bool_exprContext)_localctx).op.getText():null), ((Bool_exprContext)_localctx).l_expr.res, ((Bool_exprContext)_localctx).r_expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				((Bool_exprContext)_localctx).l_expr = expr();
				setState(208);
				((Bool_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 494)) & ~0x3f) == 0 && ((1L << (_la - 494)) & ((1L << (T_GREATER - 494)) | (1L << (T_GREATEREQUAL - 494)) | (1L << (T_LESS - 494)) | (1L << (T_LESSEQUAL - 494)))) != 0)) ) {
					((Bool_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(209);
				((Bool_exprContext)_localctx).r_expr = expr();
				 ((Bool_exprContext)_localctx).res =  hql_generic_operator((((Bool_exprContext)_localctx).op!=null?((Bool_exprContext)_localctx).op.getText():null), ((Bool_exprContext)_localctx).l_expr.res, ((Bool_exprContext)_localctx).r_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				((Bool_exprContext)_localctx).l_expr = expr();
				setState(213);
				((Bool_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 490)) & ~0x3f) == 0 && ((1L << (_la - 490)) & ((1L << (T_EQUAL - 490)) | (1L << (T_EQUAL2 - 490)) | (1L << (T_NOTEQUAL - 490)) | (1L << (T_NOTEQUAL2 - 490)))) != 0)) ) {
					((Bool_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				((Bool_exprContext)_localctx).r_expr = expr();
				 ((Bool_exprContext)_localctx).res =  hql_generic_operator((((Bool_exprContext)_localctx).op!=null?((Bool_exprContext)_localctx).op.getText():null), ((Bool_exprContext)_localctx).l_expr.res, ((Bool_exprContext)_localctx).r_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				((Bool_exprContext)_localctx).l_expr = expr();
				setState(218);
				((Bool_exprContext)_localctx).set_operators = set_operators();
				setState(219);
				((Bool_exprContext)_localctx).r_expr = expr();
				 ((Bool_exprContext)_localctx).res =  hql_generic_operator((((Bool_exprContext)_localctx).set_operators!=null?_input.getText(((Bool_exprContext)_localctx).set_operators.start,((Bool_exprContext)_localctx).set_operators.stop):null), ((Bool_exprContext)_localctx).l_expr.res, ((Bool_exprContext)_localctx).r_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				((Bool_exprContext)_localctx).l_expr = expr();
				setState(223);
				((Bool_exprContext)_localctx).op = match(T_AND);
				setState(224);
				((Bool_exprContext)_localctx).r_expr = expr();
				 ((Bool_exprContext)_localctx).res =  hql_generic_operator((((Bool_exprContext)_localctx).op!=null?((Bool_exprContext)_localctx).op.getText():null), ((Bool_exprContext)_localctx).l_expr.res, ((Bool_exprContext)_localctx).r_expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				((Bool_exprContext)_localctx).l_expr = expr();
				setState(228);
				((Bool_exprContext)_localctx).op = match(T_OR);
				setState(229);
				((Bool_exprContext)_localctx).r_expr = expr();
				 ((Bool_exprContext)_localctx).res =  hql_generic_operator((((Bool_exprContext)_localctx).op!=null?((Bool_exprContext)_localctx).op.getText():null), ((Bool_exprContext)_localctx).l_expr.res, ((Bool_exprContext)_localctx).r_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(232);
				((Bool_exprContext)_localctx).expr = expr();
				setState(233);
				match(T_IS);
				setState(234);
				match(T_NULL);
				 ((Bool_exprContext)_localctx).res =  hql_generic_operator("IS", ((Bool_exprContext)_localctx).expr.res, hql_null_constant()); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(237);
				((Bool_exprContext)_localctx).expr = expr();
				setState(238);
				match(T_IS);
				setState(239);
				match(T_NOT);
				setState(240);
				match(T_NULL);
				 ((Bool_exprContext)_localctx).res =  hql_generic_operator("IS_NOT", ((Bool_exprContext)_localctx).expr.res, hql_null_constant()); 
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

	public static class ExprContext extends ParserRuleContext {
		public json res;
		public Literal_valuesContext literal_values;
		public IdentContext ident;
		public Unary_operatorContext unary_operator;
		public ExprContext expr;
		public Dat_convrt_funcContext dat_convrt_func;
		public Math_funcContext math_func;
		public Date_funcContext date_func;
		public Cond_funcContext cond_func;
		public Str_funcContext str_func;
		public Expr_concatContext expr_concat;
		public Misc_funcContext misc_func;
		public Aggr_funcContext aggr_func;
		public Complex_typesContext complex_types;
		public Literal_valuesContext literal_values() {
			return getRuleContext(Literal_valuesContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dat_convrt_funcContext dat_convrt_func() {
			return getRuleContext(Dat_convrt_funcContext.class,0);
		}
		public Math_funcContext math_func() {
			return getRuleContext(Math_funcContext.class,0);
		}
		public Date_funcContext date_func() {
			return getRuleContext(Date_funcContext.class,0);
		}
		public Cond_funcContext cond_func() {
			return getRuleContext(Cond_funcContext.class,0);
		}
		public Str_funcContext str_func() {
			return getRuleContext(Str_funcContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Misc_funcContext misc_func() {
			return getRuleContext(Misc_funcContext.class,0);
		}
		public Aggr_funcContext aggr_func() {
			return getRuleContext(Aggr_funcContext.class,0);
		}
		public Complex_typesContext complex_types() {
			return getRuleContext(Complex_typesContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				((ExprContext)_localctx).literal_values = literal_values();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).literal_values.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				((ExprContext)_localctx).ident = ident();
				 ((ExprContext)_localctx).res =   ((ExprContext)_localctx).ident.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				((ExprContext)_localctx).unary_operator = unary_operator();
				setState(252);
				((ExprContext)_localctx).expr = expr();
				 ((ExprContext)_localctx).res =  hql_unary_operator((((ExprContext)_localctx).unary_operator!=null?_input.getText(((ExprContext)_localctx).unary_operator.start,((ExprContext)_localctx).unary_operator.stop):null), ((ExprContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(T_OPEN_P);
				setState(256);
				((ExprContext)_localctx).expr = expr();
				setState(257);
				match(T_CLOSE_P);
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				((ExprContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				((ExprContext)_localctx).math_func = math_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).math_func.res; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(266);
				((ExprContext)_localctx).date_func = date_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).date_func.res; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				((ExprContext)_localctx).cond_func = cond_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).cond_func.res; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				((ExprContext)_localctx).str_func = str_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).str_func.res; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(275);
				((ExprContext)_localctx).expr_concat = expr_concat();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr_concat.res; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(278);
				((ExprContext)_localctx).misc_func = misc_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).misc_func.res; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(281);
				((ExprContext)_localctx).aggr_func = aggr_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).aggr_func.res; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(284);
				((ExprContext)_localctx).complex_types = complex_types();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).complex_types.res; 
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

	public static class Complex_typesContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public List<ExprContext> key_exprs = new ArrayList<ExprContext>();
		public List<ExprContext> val_exprs = new ArrayList<ExprContext>();
		public TerminalNode T_ARRAY() { return getToken(HiveParser.T_ARRAY, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_MAP() { return getToken(HiveParser.T_MAP, 0); }
		public Complex_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_types; }
	}

	public final Complex_typesContext complex_types() throws RecognitionException {
		Complex_typesContext _localctx = new Complex_typesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_complex_types);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				 vector<ExprContext*> exprs; 
				setState(290);
				match(T_ARRAY);
				setState(291);
				match(T_OPEN_P);
				setState(292);
				((Complex_typesContext)_localctx).expr = expr();
				((Complex_typesContext)_localctx).exprs.add(((Complex_typesContext)_localctx).expr);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(293);
					match(T_COMMA);
					setState(294);
					((Complex_typesContext)_localctx).expr = expr();
					((Complex_typesContext)_localctx).exprs.add(((Complex_typesContext)_localctx).expr);
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Complex_typesContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Complex_typesContext)_localctx).res =  hql_complx_typ_array(expr_list_json);
				    
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 2);
				{
				 vector<ExprContext*> key_exprs; vector<ExprContext*> val_exprs; 
				setState(304);
				match(T_MAP);
				setState(305);
				match(T_OPEN_P);
				setState(306);
				((Complex_typesContext)_localctx).expr = expr();
				((Complex_typesContext)_localctx).key_exprs.add(((Complex_typesContext)_localctx).expr);
				setState(307);
				match(T_COMMA);
				setState(308);
				((Complex_typesContext)_localctx).expr = expr();
				((Complex_typesContext)_localctx).val_exprs.add(((Complex_typesContext)_localctx).expr);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(309);
					match(T_COMMA);
					setState(310);
					((Complex_typesContext)_localctx).expr = expr();
					((Complex_typesContext)_localctx).key_exprs.add(((Complex_typesContext)_localctx).expr);
					setState(311);
					match(T_COMMA);
					setState(312);
					((Complex_typesContext)_localctx).expr = expr();
					((Complex_typesContext)_localctx).val_exprs.add(((Complex_typesContext)_localctx).expr);
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319);
				match(T_CLOSE_P);

				        vector<json> key_exprs_json; vector<json> val_exprs_json;
				        for(int i = 0 ; i < ((Complex_typesContext)_localctx).key_exprs.size() ; i++)
				        {
				            key_exprs_json.push_back(((Complex_typesContext)_localctx).key_exprs[i]->res);
				            val_exprs_json.push_back(((Complex_typesContext)_localctx).val_exprs[i]->res);
				        }
				        ((Complex_typesContext)_localctx).res =  hql_complx_typ_map(key_exprs_json, val_exprs_json);
				    
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

	public static class Str_funcContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public ExprContext sep;
		public ExprContext expr_bin;
		public ExprContext expr_charset;
		public ExprContext index_num;
		public ExprContext expr_str;
		public ExprContext expr_val;
		public ExprContext expr_str_list;
		public ExprContext number_expr;
		public ExprContext int_expr;
		public ExprContext json_string;
		public ExprContext path_expr;
		public ExprContext str_expr;
		public ExprContext filename;
		public ExprContext substr_expr;
		public ExprContext pos;
		public ExprContext len;
		public ExprContext pad;
		public ExprContext url_str;
		public ExprContext part_to_extract;
		public ExprContext key_to_extract;
		public ExprContext subject;
		public ExprContext pattern;
		public ExprContext index;
		public ExprContext initial_string;
		public ExprContext replacement;
		public ExprContext n_times_expr;
		public ExprContext old;
		public ExprContext new_expr;
		public ExprContext lang_expr;
		public ExprContext locale_expr;
		public ExprContext size_expr;
		public ExprContext delimiter1;
		public ExprContext delimiter2;
		public ExprContext start_indx;
		public ExprContext lenght_expr;
		public ExprContext delimiter;
		public ExprContext count;
		public ExprContext input_expr;
		public ExprContext from_expr;
		public ExprContext to_expr;
		public ExprContext strA_expr;
		public ExprContext strB_expr;
		public ExprContext str_upper_expr;
		public ExprContext str_lower_expr;
		public ExprContext str_number_expr;
		public ExprContext n_expr;
		public TerminalNode T_ASCII() { return getToken(HiveParser.T_ASCII, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public TerminalNode T_BASE64() { return getToken(HiveParser.T_BASE64, 0); }
		public TerminalNode T_CHARACTER_LENGTH() { return getToken(HiveParser.T_CHARACTER_LENGTH, 0); }
		public TerminalNode T_CHR() { return getToken(HiveParser.T_CHR, 0); }
		public TerminalNode T_CONCAT() { return getToken(HiveParser.T_CONCAT, 0); }
		public TerminalNode T_CONCAT_WS() { return getToken(HiveParser.T_CONCAT_WS, 0); }
		public TerminalNode T_DECODE() { return getToken(HiveParser.T_DECODE, 0); }
		public TerminalNode T_ELT() { return getToken(HiveParser.T_ELT, 0); }
		public TerminalNode T_ENCODE() { return getToken(HiveParser.T_ENCODE, 0); }
		public TerminalNode T_FIELD() { return getToken(HiveParser.T_FIELD, 0); }
		public TerminalNode T_FIELD_IN_SET() { return getToken(HiveParser.T_FIELD_IN_SET, 0); }
		public TerminalNode T_FORMAT_NUMBER() { return getToken(HiveParser.T_FORMAT_NUMBER, 0); }
		public TerminalNode T_GET_JSON_OBJECTS() { return getToken(HiveParser.T_GET_JSON_OBJECTS, 0); }
		public TerminalNode T_IN_FILE() { return getToken(HiveParser.T_IN_FILE, 0); }
		public TerminalNode T_IN_STR() { return getToken(HiveParser.T_IN_STR, 0); }
		public TerminalNode T_LENGTH() { return getToken(HiveParser.T_LENGTH, 0); }
		public TerminalNode T_LOCATE() { return getToken(HiveParser.T_LOCATE, 0); }
		public TerminalNode T_LOWER() { return getToken(HiveParser.T_LOWER, 0); }
		public TerminalNode T_LCASE() { return getToken(HiveParser.T_LCASE, 0); }
		public TerminalNode T_LPAD() { return getToken(HiveParser.T_LPAD, 0); }
		public TerminalNode T_LTRIM() { return getToken(HiveParser.T_LTRIM, 0); }
		public TerminalNode T_OCTET_LENGTH() { return getToken(HiveParser.T_OCTET_LENGTH, 0); }
		public TerminalNode T_PARSE_URL() { return getToken(HiveParser.T_PARSE_URL, 0); }
		public TerminalNode T_PRINTF() { return getToken(HiveParser.T_PRINTF, 0); }
		public TerminalNode T_QUOTE() { return getToken(HiveParser.T_QUOTE, 0); }
		public TerminalNode T_REGEXP_EXTRACT() { return getToken(HiveParser.T_REGEXP_EXTRACT, 0); }
		public TerminalNode T_REGEXP_REPLACE() { return getToken(HiveParser.T_REGEXP_REPLACE, 0); }
		public TerminalNode T_REPEAT() { return getToken(HiveParser.T_REPEAT, 0); }
		public TerminalNode T_REPLACE() { return getToken(HiveParser.T_REPLACE, 0); }
		public TerminalNode T_REVERSE() { return getToken(HiveParser.T_REVERSE, 0); }
		public TerminalNode T_RPAD() { return getToken(HiveParser.T_RPAD, 0); }
		public TerminalNode T_RTRIM() { return getToken(HiveParser.T_RTRIM, 0); }
		public TerminalNode T_SENTENCES() { return getToken(HiveParser.T_SENTENCES, 0); }
		public TerminalNode T_SPACE() { return getToken(HiveParser.T_SPACE, 0); }
		public TerminalNode T_SPLIT() { return getToken(HiveParser.T_SPLIT, 0); }
		public TerminalNode T_STR_TO_MAP() { return getToken(HiveParser.T_STR_TO_MAP, 0); }
		public TerminalNode T_SUBSTR() { return getToken(HiveParser.T_SUBSTR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HiveParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUBSTRING_INDEX() { return getToken(HiveParser.T_SUBSTRING_INDEX, 0); }
		public TerminalNode T_TRANSLATE() { return getToken(HiveParser.T_TRANSLATE, 0); }
		public TerminalNode T_TRIM() { return getToken(HiveParser.T_TRIM, 0); }
		public TerminalNode T_UNBASE64() { return getToken(HiveParser.T_UNBASE64, 0); }
		public TerminalNode T_UCASE() { return getToken(HiveParser.T_UCASE, 0); }
		public TerminalNode T_UPPER() { return getToken(HiveParser.T_UPPER, 0); }
		public TerminalNode T_INITCAP() { return getToken(HiveParser.T_INITCAP, 0); }
		public TerminalNode T_LEVENSHTEIN() { return getToken(HiveParser.T_LEVENSHTEIN, 0); }
		public TerminalNode T_SOUNDEX() { return getToken(HiveParser.T_SOUNDEX, 0); }
		public TerminalNode T_MASK() { return getToken(HiveParser.T_MASK, 0); }
		public TerminalNode T_MASK_FIRST_N() { return getToken(HiveParser.T_MASK_FIRST_N, 0); }
		public TerminalNode T_MASK_LAST_N() { return getToken(HiveParser.T_MASK_LAST_N, 0); }
		public TerminalNode T_MASK_SHOW_FIRST_N() { return getToken(HiveParser.T_MASK_SHOW_FIRST_N, 0); }
		public TerminalNode T_MASK_SHOW_LAST_N() { return getToken(HiveParser.T_MASK_SHOW_LAST_N, 0); }
		public TerminalNode T_MASK_HASH() { return getToken(HiveParser.T_MASK_HASH, 0); }
		public Str_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_func; }
	}

	public final Str_funcContext str_func() throws RecognitionException {
		Str_funcContext _localctx = new Str_funcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_str_func);
		int _la;
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(T_ASCII);
				setState(325);
				match(T_OPEN_P);
				setState(326);
				((Str_funcContext)_localctx).expr = expr();
				setState(327);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("ASCII", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(T_BASE64);
				setState(331);
				match(T_OPEN_P);
				setState(332);
				((Str_funcContext)_localctx).expr = expr();
				setState(333);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("BASE64", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				match(T_CHARACTER_LENGTH);
				setState(337);
				match(T_OPEN_P);
				setState(338);
				((Str_funcContext)_localctx).expr = expr();
				setState(339);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHARACTER_LENGTH", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				match(T_CHR);
				setState(343);
				match(T_OPEN_P);
				setState(344);
				((Str_funcContext)_localctx).expr = expr();
				setState(345);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHR", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(349);
				match(T_CONCAT);
				setState(350);
				match(T_OPEN_P);
				setState(351);
				((Str_funcContext)_localctx).expr = expr();
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(352);
					match(T_COMMA);
					setState(353);
					((Str_funcContext)_localctx).expr = expr();
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(358);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_list_param_func("CONCAT","expr_list",expr_list_json);
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				 vector<ExprContext*> exprs; 
				setState(362);
				match(T_CONCAT_WS);
				setState(363);
				match(T_OPEN_P);
				setState(364);
				((Str_funcContext)_localctx).sep = expr();
				setState(365);
				match(T_COMMA);
				setState(366);
				((Str_funcContext)_localctx).expr = expr();
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(367);
					match(T_COMMA);
					setState(368);
					((Str_funcContext)_localctx).expr = expr();
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(371); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(373);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("CONCAT","separator", ((Str_funcContext)_localctx).sep.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(376);
				match(T_DECODE);
				setState(377);
				match(T_OPEN_P);
				setState(378);
				((Str_funcContext)_localctx).expr_bin = expr();
				setState(379);
				match(T_COMMA);
				setState(380);
				((Str_funcContext)_localctx).expr_charset = expr();
				setState(381);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("DECODE", "binary_value", ((Str_funcContext)_localctx).expr_bin.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				 vector<ExprContext*> exprs; 
				setState(385);
				match(T_ELT);
				setState(386);
				match(T_OPEN_P);
				setState(387);
				((Str_funcContext)_localctx).index_num = expr();
				setState(388);
				match(T_COMMA);
				setState(389);
				((Str_funcContext)_localctx).expr = expr();
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(390);
					match(T_COMMA);
					setState(391);
					((Str_funcContext)_localctx).expr = expr();
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("ELT","index_num", ((Str_funcContext)_localctx).index_num.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(400);
				match(T_ENCODE);
				setState(401);
				match(T_OPEN_P);
				setState(402);
				((Str_funcContext)_localctx).expr_str = expr();
				setState(403);
				match(T_COMMA);
				setState(404);
				((Str_funcContext)_localctx).expr_charset = expr();
				setState(405);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("ENCODE", "str_value", ((Str_funcContext)_localctx).expr_str.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				 vector<ExprContext*> exprs; 
				setState(409);
				match(T_FIELD);
				setState(410);
				match(T_OPEN_P);
				setState(411);
				((Str_funcContext)_localctx).expr_val = expr();
				setState(412);
				match(T_COMMA);
				setState(413);
				((Str_funcContext)_localctx).expr = expr();
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(414);
					match(T_COMMA);
					setState(415);
					((Str_funcContext)_localctx).expr = expr();
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(421);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("FIELD","expr_val", ((Str_funcContext)_localctx).expr_val.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(424);
				match(T_FIELD_IN_SET);
				setState(425);
				match(T_OPEN_P);
				setState(426);
				((Str_funcContext)_localctx).expr_str = expr();
				setState(427);
				match(T_COMMA);
				setState(428);
				((Str_funcContext)_localctx).expr_str_list = expr();
				setState(429);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FIELD_IN_SET", "str_value", ((Str_funcContext)_localctx).expr_str.res, "str_list", ((Str_funcContext)_localctx).expr_str_list.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(432);
				match(T_FORMAT_NUMBER);
				setState(433);
				match(T_OPEN_P);
				setState(434);
				((Str_funcContext)_localctx).number_expr = expr();
				setState(435);
				match(T_COMMA);
				setState(436);
				((Str_funcContext)_localctx).int_expr = expr();
				setState(437);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FORMAT_NUMBER", "number", ((Str_funcContext)_localctx).number_expr.res, "decimal_places", ((Str_funcContext)_localctx).int_expr.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(440);
				match(T_GET_JSON_OBJECTS);
				setState(441);
				match(T_OPEN_P);
				setState(442);
				((Str_funcContext)_localctx).json_string = expr();
				setState(443);
				match(T_COMMA);
				setState(444);
				((Str_funcContext)_localctx).path_expr = expr();
				setState(445);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("GET_JSON_OBJECTS", "json_string", ((Str_funcContext)_localctx).json_string.res, "path", ((Str_funcContext)_localctx).path_expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(448);
				match(T_IN_FILE);
				setState(449);
				match(T_OPEN_P);
				setState(450);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(451);
				match(T_COMMA);
				setState(452);
				((Str_funcContext)_localctx).filename = expr();
				setState(453);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_FILE", "string", ((Str_funcContext)_localctx).str_expr.res, "filename", ((Str_funcContext)_localctx).filename.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(456);
				match(T_IN_STR);
				setState(457);
				match(T_OPEN_P);
				setState(458);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(459);
				match(T_COMMA);
				setState(460);
				((Str_funcContext)_localctx).substr_expr = expr();
				setState(461);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_STR", "string", ((Str_funcContext)_localctx).str_expr.res, "substring", ((Str_funcContext)_localctx).substr_expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(464);
				match(T_LENGTH);
				setState(465);
				match(T_OPEN_P);
				setState(466);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(467);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(470);
				match(T_LOCATE);
				setState(471);
				match(T_OPEN_P);
				setState(472);
				((Str_funcContext)_localctx).substr_expr = expr();
				setState(473);
				match(T_COMMA);
				setState(474);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(475);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(478);
				match(T_LOCATE);
				setState(479);
				match(T_OPEN_P);
				setState(480);
				((Str_funcContext)_localctx).substr_expr = expr();
				setState(481);
				match(T_COMMA);
				setState(482);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(483);
				match(T_COMMA);
				setState(484);
				((Str_funcContext)_localctx).pos = expr();
				setState(485);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res,"position", ((Str_funcContext)_localctx).pos.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(488);
				_la = _input.LA(1);
				if ( !(_la==T_LCASE || _la==T_LOWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(489);
				match(T_OPEN_P);
				setState(490);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(491);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LOWER_CASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(494);
				match(T_LPAD);
				setState(495);
				match(T_OPEN_P);
				setState(496);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(497);
				match(T_COMMA);
				setState(498);
				((Str_funcContext)_localctx).len = expr();
				setState(499);
				match(T_COMMA);
				setState(500);
				((Str_funcContext)_localctx).pad = expr();
				setState(501);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(504);
				match(T_LTRIM);
				setState(505);
				match(T_OPEN_P);
				setState(506);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(507);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(510);
				match(T_OCTET_LENGTH);
				setState(511);
				match(T_OPEN_P);
				setState(512);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(513);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("OCTET_LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(516);
				match(T_PARSE_URL);
				setState(517);
				match(T_OPEN_P);
				setState(518);
				((Str_funcContext)_localctx).url_str = expr();
				setState(519);
				match(T_COMMA);
				setState(520);
				((Str_funcContext)_localctx).part_to_extract = expr();
				setState(521);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(524);
				match(T_PARSE_URL);
				setState(525);
				match(T_OPEN_P);
				setState(526);
				((Str_funcContext)_localctx).url_str = expr();
				setState(527);
				match(T_COMMA);
				setState(528);
				((Str_funcContext)_localctx).part_to_extract = expr();
				setState(529);
				match(T_COMMA);
				setState(530);
				((Str_funcContext)_localctx).key_to_extract = expr();
				setState(531);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res, "key_to_extract", ((Str_funcContext)_localctx).key_to_extract.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				 vector<ExprContext*> exprs; 
				setState(535);
				match(T_PRINTF);
				setState(536);
				match(T_OPEN_P);
				setState(537);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(538);
				match(T_COMMA);
				setState(539);
				((Str_funcContext)_localctx).expr = expr();
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(542); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(540);
					match(T_COMMA);
					setState(541);
					((Str_funcContext)_localctx).expr = expr();
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(544); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(546);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("PRINTF","string", ((Str_funcContext)_localctx).str_expr.res, "object_list",expr_list_json);
				    
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(549);
				match(T_QUOTE);
				setState(550);
				match(T_OPEN_P);
				setState(551);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(552);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("QUOTE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(555);
				match(T_REGEXP_EXTRACT);
				setState(556);
				match(T_OPEN_P);
				setState(557);
				((Str_funcContext)_localctx).subject = expr();
				setState(558);
				match(T_COMMA);
				setState(559);
				((Str_funcContext)_localctx).pattern = expr();
				setState(560);
				match(T_COMMA);
				setState(561);
				((Str_funcContext)_localctx).index = expr();
				setState(562);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_EXTRACT", "subject", ((Str_funcContext)_localctx).subject.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"index", ((Str_funcContext)_localctx).index.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(565);
				match(T_REGEXP_REPLACE);
				setState(566);
				match(T_OPEN_P);
				setState(567);
				((Str_funcContext)_localctx).initial_string = expr();
				setState(568);
				match(T_COMMA);
				setState(569);
				((Str_funcContext)_localctx).pattern = expr();
				setState(570);
				match(T_COMMA);
				setState(571);
				((Str_funcContext)_localctx).replacement = expr();
				setState(572);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_REPLACE", "initial_string", ((Str_funcContext)_localctx).initial_string.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"replacement", ((Str_funcContext)_localctx).replacement.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(575);
				match(T_REPEAT);
				setState(576);
				match(T_OPEN_P);
				setState(577);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(578);
				match(T_COMMA);
				setState(579);
				((Str_funcContext)_localctx).n_times_expr = expr();
				setState(580);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("REPEAT", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_times_expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(583);
				match(T_REPLACE);
				setState(584);
				match(T_OPEN_P);
				setState(585);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(586);
				match(T_COMMA);
				setState(587);
				((Str_funcContext)_localctx).old = expr();
				setState(588);
				match(T_COMMA);
				setState(589);
				((Str_funcContext)_localctx).new_expr = expr();
				setState(590);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REPLACE", "string", ((Str_funcContext)_localctx).str_expr.res, "old", ((Str_funcContext)_localctx).old.res,"new", ((Str_funcContext)_localctx).new_expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(593);
				match(T_REVERSE);
				setState(594);
				match(T_OPEN_P);
				setState(595);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(596);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("REVERSE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(599);
				match(T_RPAD);
				setState(600);
				match(T_OPEN_P);
				setState(601);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(602);
				match(T_COMMA);
				setState(603);
				((Str_funcContext)_localctx).len = expr();
				setState(604);
				match(T_COMMA);
				setState(605);
				((Str_funcContext)_localctx).pad = expr();
				setState(606);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("RPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(609);
				match(T_RTRIM);
				setState(610);
				match(T_OPEN_P);
				setState(611);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(612);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("RTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(615);
				match(T_SENTENCES);
				setState(616);
				match(T_OPEN_P);
				setState(617);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(618);
				match(T_COMMA);
				setState(619);
				((Str_funcContext)_localctx).lang_expr = expr();
				setState(620);
				match(T_COMMA);
				setState(621);
				((Str_funcContext)_localctx).locale_expr = expr();
				setState(622);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SENTENCES", "string", ((Str_funcContext)_localctx).str_expr.res, "lang", ((Str_funcContext)_localctx).lang_expr.res, "locale", ((Str_funcContext)_localctx).locale_expr.res); 
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(625);
				match(T_SPACE);
				setState(626);
				match(T_OPEN_P);
				setState(627);
				((Str_funcContext)_localctx).size_expr = expr();
				setState(628);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SPACE", "size", ((Str_funcContext)_localctx).size_expr.res); 
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(631);
				match(T_SPLIT);
				setState(632);
				match(T_OPEN_P);
				setState(633);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(634);
				match(T_COMMA);
				setState(635);
				((Str_funcContext)_localctx).pattern = expr();
				setState(636);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SPLIT", "string", ((Str_funcContext)_localctx).str_expr.res, "pattern", ((Str_funcContext)_localctx).pattern.res); 
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(639);
				match(T_STR_TO_MAP);
				setState(640);
				match(T_OPEN_P);
				setState(641);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(642);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", hql_string_type(";"), "delimiter2", hql_string_type(":")); 
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(645);
				match(T_STR_TO_MAP);
				setState(646);
				match(T_OPEN_P);
				setState(647);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(648);
				match(T_COMMA);
				setState(649);
				((Str_funcContext)_localctx).delimiter1 = expr();
				setState(650);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2", hql_string_type(":")); 
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(653);
				match(T_STR_TO_MAP);
				setState(654);
				match(T_OPEN_P);
				setState(655);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(656);
				match(T_COMMA);
				setState(657);
				((Str_funcContext)_localctx).delimiter1 = expr();
				setState(658);
				match(T_COMMA);
				setState(659);
				((Str_funcContext)_localctx).delimiter2 = expr();
				setState(660);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2",((Str_funcContext)_localctx).delimiter2.res); 
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(663);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(664);
				match(T_OPEN_P);
				setState(665);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(666);
				match(T_COMMA);
				setState(667);
				((Str_funcContext)_localctx).start_indx = expr();
				setState(668);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res); 
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(671);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(672);
				match(T_OPEN_P);
				setState(673);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(674);
				match(T_COMMA);
				setState(675);
				((Str_funcContext)_localctx).start_indx = expr();
				setState(676);
				match(T_COMMA);
				setState(677);
				((Str_funcContext)_localctx).lenght_expr = expr();
				setState(678);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res, "length", ((Str_funcContext)_localctx).lenght_expr.res); 
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(681);
				match(T_SUBSTRING_INDEX);
				setState(682);
				match(T_OPEN_P);
				setState(683);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(684);
				match(T_COMMA);
				setState(685);
				((Str_funcContext)_localctx).delimiter = expr();
				setState(686);
				match(T_COMMA);
				setState(687);
				((Str_funcContext)_localctx).count = expr();
				setState(688);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING_INDEX", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter", ((Str_funcContext)_localctx).delimiter.res, "count", ((Str_funcContext)_localctx).count.res); 
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(691);
				match(T_TRANSLATE);
				setState(692);
				match(T_OPEN_P);
				setState(693);
				((Str_funcContext)_localctx).input_expr = expr();
				setState(694);
				match(T_COMMA);
				setState(695);
				((Str_funcContext)_localctx).from_expr = expr();
				setState(696);
				match(T_COMMA);
				setState(697);
				((Str_funcContext)_localctx).to_expr = expr();
				setState(698);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("TRANSLATE", "input", ((Str_funcContext)_localctx).input_expr.res, "from", ((Str_funcContext)_localctx).from_expr.res, "to", ((Str_funcContext)_localctx).to_expr.res); 
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(701);
				match(T_TRIM);
				setState(702);
				match(T_OPEN_P);
				setState(703);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(704);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("TRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(707);
				match(T_UNBASE64);
				setState(708);
				match(T_OPEN_P);
				setState(709);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(710);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UNBASE64", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(713);
				_la = _input.LA(1);
				if ( !(_la==T_UCASE || _la==T_UPPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(714);
				match(T_OPEN_P);
				setState(715);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(716);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UPPERCASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(719);
				match(T_INITCAP);
				setState(720);
				match(T_OPEN_P);
				setState(721);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(722);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("INITCAP", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(725);
				match(T_LEVENSHTEIN);
				setState(726);
				match(T_OPEN_P);
				setState(727);
				((Str_funcContext)_localctx).strA_expr = expr();
				setState(728);
				match(T_COMMA);
				setState(729);
				((Str_funcContext)_localctx).strB_expr = expr();
				setState(730);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LEVENSHTEIN", "string_A", ((Str_funcContext)_localctx).strA_expr.res, "string_B", ((Str_funcContext)_localctx).strB_expr.res); 
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(733);
				match(T_SOUNDEX);
				setState(734);
				match(T_OPEN_P);
				setState(735);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(736);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SOUNDEX", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(739);
				match(T_MASK);
				setState(740);
				match(T_OPEN_P);
				setState(741);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(742);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(745);
				match(T_MASK);
				setState(746);
				match(T_OPEN_P);
				setState(747);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(748);
				match(T_COMMA);
				setState(749);
				((Str_funcContext)_localctx).str_upper_expr = expr();
				setState(750);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res); 
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(753);
				match(T_MASK);
				setState(754);
				match(T_OPEN_P);
				setState(755);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(756);
				match(T_COMMA);
				setState(757);
				((Str_funcContext)_localctx).str_upper_expr = expr();
				setState(758);
				match(T_COMMA);
				setState(759);
				((Str_funcContext)_localctx).str_lower_expr = expr();
				setState(760);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res); 
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(763);
				match(T_MASK);
				setState(764);
				match(T_OPEN_P);
				setState(765);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(766);
				match(T_COMMA);
				setState(767);
				((Str_funcContext)_localctx).str_upper_expr = expr();
				setState(768);
				match(T_COMMA);
				setState(769);
				((Str_funcContext)_localctx).str_lower_expr = expr();
				setState(770);
				match(T_COMMA);
				setState(771);
				((Str_funcContext)_localctx).str_number_expr = expr();
				setState(772);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_four_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res, "number", ((Str_funcContext)_localctx).str_number_expr.res); 
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(775);
				match(T_MASK_FIRST_N);
				setState(776);
				match(T_OPEN_P);
				setState(777);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(778);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(781);
				match(T_MASK_FIRST_N);
				setState(782);
				match(T_OPEN_P);
				setState(783);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(784);
				match(T_COMMA);
				setState(785);
				((Str_funcContext)_localctx).n_expr = expr();
				setState(786);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(789);
				match(T_MASK_LAST_N);
				setState(790);
				match(T_OPEN_P);
				setState(791);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(792);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(795);
				match(T_MASK_LAST_N);
				setState(796);
				match(T_OPEN_P);
				setState(797);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(798);
				match(T_COMMA);
				setState(799);
				((Str_funcContext)_localctx).n_expr = expr();
				setState(800);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(803);
				match(T_MASK_SHOW_FIRST_N);
				setState(804);
				match(T_OPEN_P);
				setState(805);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(806);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(809);
				match(T_MASK_SHOW_FIRST_N);
				setState(810);
				match(T_OPEN_P);
				setState(811);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(812);
				match(T_COMMA);
				setState(813);
				((Str_funcContext)_localctx).n_expr = expr();
				setState(814);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(817);
				match(T_MASK_SHOW_LAST_N);
				setState(818);
				match(T_OPEN_P);
				setState(819);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(820);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(823);
				match(T_MASK_SHOW_LAST_N);
				setState(824);
				match(T_OPEN_P);
				setState(825);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(826);
				match(T_COMMA);
				setState(827);
				((Str_funcContext)_localctx).n_expr = expr();
				setState(828);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(831);
				match(T_MASK_HASH);
				setState(832);
				match(T_OPEN_P);
				setState(833);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(834);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_HASH", "string", ((Str_funcContext)_localctx).str_expr.res); 
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

	public static class Misc_funcContext extends ParserRuleContext {
		public json res;
		public ExprContext class_name_expr;
		public ExprContext method_name_expr;
		public ExprContext expr;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public Token f_name;
		public ExprContext str_expr;
		public ExprContext n_expr;
		public ExprContext xml_str_expr;
		public ExprContext xpath_expr_str;
		public TerminalNode T_JAVA_METHOD() { return getToken(HiveParser.T_JAVA_METHOD, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_REFLECT() { return getToken(HiveParser.T_REFLECT, 0); }
		public TerminalNode T_HASH() { return getToken(HiveParser.T_HASH, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HiveParser.T_CURRENT_USER, 0); }
		public TerminalNode T_LOGGED_IN_USER() { return getToken(HiveParser.T_LOGGED_IN_USER, 0); }
		public TerminalNode T_CURRENT_DATABASE() { return getToken(HiveParser.T_CURRENT_DATABASE, 0); }
		public TerminalNode T_MD5() { return getToken(HiveParser.T_MD5, 0); }
		public TerminalNode T_SHA() { return getToken(HiveParser.T_SHA, 0); }
		public TerminalNode T_SHA1() { return getToken(HiveParser.T_SHA1, 0); }
		public TerminalNode T_CRC32() { return getToken(HiveParser.T_CRC32, 0); }
		public TerminalNode T_SHA2() { return getToken(HiveParser.T_SHA2, 0); }
		public TerminalNode T_AES_ENCRYPT() { return getToken(HiveParser.T_AES_ENCRYPT, 0); }
		public TerminalNode T_AES_DECRYPT() { return getToken(HiveParser.T_AES_DECRYPT, 0); }
		public TerminalNode T_VERSION() { return getToken(HiveParser.T_VERSION, 0); }
		public TerminalNode T_XPATH() { return getToken(HiveParser.T_XPATH, 0); }
		public TerminalNode T_XPATH_BOOLEAN() { return getToken(HiveParser.T_XPATH_BOOLEAN, 0); }
		public TerminalNode T_XPATH_DOUBLE() { return getToken(HiveParser.T_XPATH_DOUBLE, 0); }
		public TerminalNode T_XPATH_FLOAT() { return getToken(HiveParser.T_XPATH_FLOAT, 0); }
		public TerminalNode T_XPATH_INT() { return getToken(HiveParser.T_XPATH_INT, 0); }
		public TerminalNode T_XPATH_LONG() { return getToken(HiveParser.T_XPATH_LONG, 0); }
		public TerminalNode T_XPATH_NUMBER() { return getToken(HiveParser.T_XPATH_NUMBER, 0); }
		public TerminalNode T_XPATH_SHORT() { return getToken(HiveParser.T_XPATH_SHORT, 0); }
		public TerminalNode T_XPATH_STRING() { return getToken(HiveParser.T_XPATH_STRING, 0); }
		public Misc_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc_func; }
	}

	public final Misc_funcContext misc_func() throws RecognitionException {
		Misc_funcContext _localctx = new Misc_funcContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_misc_func);
		int _la;
		try {
			setState(939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_JAVA_METHOD:
				enterOuterAlt(_localctx, 1);
				{
				 vector<ExprContext*> exprs; 
				setState(840);
				match(T_JAVA_METHOD);
				setState(841);
				match(T_OPEN_P);
				setState(842);
				((Misc_funcContext)_localctx).class_name_expr = expr();
				setState(843);
				match(T_COMMA);
				setState(844);
				((Misc_funcContext)_localctx).method_name_expr = expr();
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(845);
					match(T_COMMA);
					setState(846);
					((Misc_funcContext)_localctx).expr = expr();
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(852);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Misc_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Misc_funcContext)_localctx).res =  hql_double_param_list_func("JAVA_METHOD","class", ((Misc_funcContext)_localctx).class_name_expr.res, "method", ((Misc_funcContext)_localctx).method_name_expr.res, "arg_list",expr_list_json);
				    
				}
				break;
			case T_REFLECT:
				enterOuterAlt(_localctx, 2);
				{
				 vector<ExprContext*> exprs; 
				setState(856);
				match(T_REFLECT);
				setState(857);
				match(T_OPEN_P);
				setState(858);
				((Misc_funcContext)_localctx).class_name_expr = expr();
				setState(859);
				match(T_COMMA);
				setState(860);
				((Misc_funcContext)_localctx).method_name_expr = expr();
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(861);
					match(T_COMMA);
					setState(862);
					((Misc_funcContext)_localctx).expr = expr();
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(867);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(868);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Misc_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Misc_funcContext)_localctx).res =  hql_double_param_list_func("REFLECT","class", ((Misc_funcContext)_localctx).class_name_expr.res, "method", ((Misc_funcContext)_localctx).method_name_expr.res, "arg_list",expr_list_json);
				    
				}
				break;
			case T_HASH:
				enterOuterAlt(_localctx, 3);
				{
				 vector<ExprContext*> exprs; 
				setState(872);
				match(T_HASH);
				setState(873);
				match(T_OPEN_P);
				setState(874);
				((Misc_funcContext)_localctx).expr = expr();
				((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(875);
					match(T_COMMA);
					setState(876);
					((Misc_funcContext)_localctx).expr = expr();
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(881);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(882);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Misc_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Misc_funcContext)_localctx).res =  hql_list_param_func("HASH", "expr_list", expr_list_json);
				    
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 4);
				{
				setState(885);
				match(T_CURRENT_USER);
				setState(886);
				match(T_OPEN_P);
				setState(887);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("CURRENT_USER"); 
				}
				break;
			case T_LOGGED_IN_USER:
				enterOuterAlt(_localctx, 5);
				{
				setState(889);
				match(T_LOGGED_IN_USER);
				setState(890);
				match(T_OPEN_P);
				setState(891);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("LOGGED_IN_USER"); 
				}
				break;
			case T_CURRENT_DATABASE:
				enterOuterAlt(_localctx, 6);
				{
				setState(893);
				match(T_CURRENT_DATABASE);
				setState(894);
				match(T_OPEN_P);
				setState(895);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("CURRENT_USER"); 
				}
				break;
			case T_CRC32:
			case T_MD5:
			case T_SHA:
			case T_SHA1:
				enterOuterAlt(_localctx, 7);
				{
				setState(897);
				((Misc_funcContext)_localctx).f_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_CRC32 || _la==T_MD5 || _la==T_SHA || _la==T_SHA1) ) {
					((Misc_funcContext)_localctx).f_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(898);
				match(T_OPEN_P);
				setState(899);
				((Misc_funcContext)_localctx).str_expr = expr();
				setState(900);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_single_param_func((((Misc_funcContext)_localctx).f_name!=null?((Misc_funcContext)_localctx).f_name.getText():null), "string", ((Misc_funcContext)_localctx).str_expr.res); 
				}
				break;
			case T_SHA2:
				enterOuterAlt(_localctx, 8);
				{
				setState(903);
				match(T_SHA2);
				setState(904);
				match(T_OPEN_P);
				setState(905);
				((Misc_funcContext)_localctx).str_expr = expr();
				setState(906);
				match(T_COMMA);
				setState(907);
				((Misc_funcContext)_localctx).n_expr = expr();
				setState(908);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "string", ((Misc_funcContext)_localctx).str_expr.res, "hash_size", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_ENCRYPT:
				enterOuterAlt(_localctx, 9);
				{
				setState(911);
				match(T_AES_ENCRYPT);
				setState(912);
				match(T_OPEN_P);
				setState(913);
				((Misc_funcContext)_localctx).str_expr = expr();
				setState(914);
				match(T_COMMA);
				setState(915);
				((Misc_funcContext)_localctx).n_expr = expr();
				setState(916);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_DECRYPT:
				enterOuterAlt(_localctx, 10);
				{
				setState(919);
				match(T_AES_DECRYPT);
				setState(920);
				match(T_OPEN_P);
				setState(921);
				((Misc_funcContext)_localctx).str_expr = expr();
				setState(922);
				match(T_COMMA);
				setState(923);
				((Misc_funcContext)_localctx).n_expr = expr();
				setState(924);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_VERSION:
				enterOuterAlt(_localctx, 11);
				{
				setState(927);
				match(T_VERSION);
				setState(928);
				match(T_OPEN_P);
				setState(929);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("VERSION"); 
				}
				break;
			case T_XPATH:
			case T_XPATH_BOOLEAN:
			case T_XPATH_DOUBLE:
			case T_XPATH_FLOAT:
			case T_XPATH_INT:
			case T_XPATH_LONG:
			case T_XPATH_NUMBER:
			case T_XPATH_SHORT:
			case T_XPATH_STRING:
				enterOuterAlt(_localctx, 12);
				{
				setState(931);
				((Misc_funcContext)_localctx).f_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 447)) & ~0x3f) == 0 && ((1L << (_la - 447)) & ((1L << (T_XPATH - 447)) | (1L << (T_XPATH_BOOLEAN - 447)) | (1L << (T_XPATH_DOUBLE - 447)) | (1L << (T_XPATH_FLOAT - 447)) | (1L << (T_XPATH_INT - 447)) | (1L << (T_XPATH_LONG - 447)) | (1L << (T_XPATH_NUMBER - 447)) | (1L << (T_XPATH_SHORT - 447)) | (1L << (T_XPATH_STRING - 447)))) != 0)) ) {
					((Misc_funcContext)_localctx).f_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(932);
				match(T_OPEN_P);
				setState(933);
				((Misc_funcContext)_localctx).xml_str_expr = expr();
				setState(934);
				match(T_COMMA);
				setState(935);
				((Misc_funcContext)_localctx).xpath_expr_str = expr();
				setState(936);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func((((Misc_funcContext)_localctx).f_name!=null?((Misc_funcContext)_localctx).f_name.getText():null), "xml_string", ((Misc_funcContext)_localctx).xml_str_expr.res, "xpath_expression_string", ((Misc_funcContext)_localctx).xpath_expr_str.res); 
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

	public static class Expr_concatContext extends ParserRuleContext {
		public json res;
		public Expr_concat_itemContext expr_concat_item;
		public List<Expr_concat_itemContext> expr_concat_items = new ArrayList<Expr_concat_itemContext>();
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_concat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<Expr_concat_itemContext*> exprs; 
			setState(942);
			((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
			((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
			setState(945); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(943);
				match(T_PIPE);
				setState(944);
				((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
				((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
				}
				}
				setState(947); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_PIPE );

			        vector<json> expr_list_json;
			        for (Expr_concat_itemContext* exp_contxt : ((Expr_concatContext)_localctx).expr_concat_items){ expr_list_json.push_back(exp_contxt->res); }
			        ((Expr_concatContext)_localctx).res =  hql_list_param_func("CONCAT","expr_list",expr_list_json);
			    
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

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public json res;
		public Literal_valuesContext literal_values;
		public IdentContext ident;
		public ExprContext expr;
		public Dat_convrt_funcContext dat_convrt_func;
		public Math_funcContext math_func;
		public Date_funcContext date_func;
		public Cond_funcContext cond_func;
		public Str_funcContext str_func;
		public Misc_funcContext misc_func;
		public Aggr_funcContext aggr_func;
		public Literal_valuesContext literal_values() {
			return getRuleContext(Literal_valuesContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Dat_convrt_funcContext dat_convrt_func() {
			return getRuleContext(Dat_convrt_funcContext.class,0);
		}
		public Math_funcContext math_func() {
			return getRuleContext(Math_funcContext.class,0);
		}
		public Date_funcContext date_func() {
			return getRuleContext(Date_funcContext.class,0);
		}
		public Cond_funcContext cond_func() {
			return getRuleContext(Cond_funcContext.class,0);
		}
		public Str_funcContext str_func() {
			return getRuleContext(Str_funcContext.class,0);
		}
		public Misc_funcContext misc_func() {
			return getRuleContext(Misc_funcContext.class,0);
		}
		public Aggr_funcContext aggr_func() {
			return getRuleContext(Aggr_funcContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_concat_item);
		try {
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_CONST:
			case BOOL_LITERAL:
			case T_DATE:
			case T_TIMESTAMP:
			case INT_LITERAL:
			case DECIMAL_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				((Expr_concat_itemContext)_localctx).literal_values = literal_values();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).literal_values.res; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				((Expr_concat_itemContext)_localctx).ident = ident();
				 ((Expr_concat_itemContext)_localctx).res =   ((Expr_concat_itemContext)_localctx).ident.res; 
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				match(T_OPEN_P);
				setState(958);
				((Expr_concat_itemContext)_localctx).expr = expr();
				setState(959);
				match(T_CLOSE_P);
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr.res; 
				}
				break;
			case T_BINARY:
			case T_CAST:
				enterOuterAlt(_localctx, 4);
				{
				setState(962);
				((Expr_concat_itemContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case T__5:
			case T__6:
			case T_ABS:
			case T_ACOS:
			case T_ASIN:
			case T_ATAN:
			case T_BIN:
			case T_CBR:
			case T_CEIL:
			case T_CEILING:
			case T_CONV:
			case T_COS:
			case T_DEGREES:
			case T_EXP:
			case T_FACTORIAL:
			case T_FLOOR:
			case T_HEX:
			case T_LOG:
			case T_LOG10:
			case T_LOG2:
			case T_LN:
			case T_NEGATIVE:
			case T_PMOD:
			case T_POSITIVE:
			case T_POW:
			case T_POWER:
			case T_RADIANS:
			case T_RAND:
			case T_ROUND:
			case T_SIGN:
			case T_SIN:
			case T_SQRT:
			case T_TAN:
			case T_UNHEX:
				enterOuterAlt(_localctx, 5);
				{
				setState(965);
				((Expr_concat_itemContext)_localctx).math_func = math_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).math_func.res; 
				}
				break;
			case T_ADD_MONTHS:
			case T_DATEADD:
			case T_DATEDIFF:
			case T_DATE_FORMAT:
			case T_DATESUB:
			case T_DAY:
			case T_FROMUTCTIMESTAMP:
			case T_HOUR:
			case T_LASTDAY:
			case T_MINUTE:
			case T_MONTH:
			case T_MONTHS_BETWEEN:
			case T_NEXT_DAY:
			case T_QUARTER:
			case T_SECOND:
			case T_TOUTCTIMESTAMP:
			case T_TRUNC:
			case T_UNIX_TIMESTAMP:
			case T_WEEKOFYEAR:
			case T_YEAR:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_SYSDATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(968);
				((Expr_concat_itemContext)_localctx).date_func = date_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).date_func.res; 
				}
				break;
			case T_ASSERT_TRUE:
			case T_CASE:
			case T_COALESCE:
			case T_IF:
			case T_ISNOTNULL:
			case T_ISNULL:
			case T_NVL:
			case T_NULLIF:
				enterOuterAlt(_localctx, 7);
				{
				setState(971);
				((Expr_concat_itemContext)_localctx).cond_func = cond_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).cond_func.res; 
				}
				break;
			case T_ASCII:
			case T_BASE64:
			case T_CHARACTER_LENGTH:
			case T_CHR:
			case T_CONCAT:
			case T_CONCAT_WS:
			case T_DECODE:
			case T_ELT:
			case T_ENCODE:
			case T_FIELD:
			case T_FIELD_IN_SET:
			case T_FORMAT_NUMBER:
			case T_GET_JSON_OBJECTS:
			case T_IN_FILE:
			case T_INITCAP:
			case T_IN_STR:
			case T_LCASE:
			case T_LENGTH:
			case T_LEVENSHTEIN:
			case T_LOCATE:
			case T_LOWER:
			case T_LPAD:
			case T_LTRIM:
			case T_MASK:
			case T_MASK_FIRST_N:
			case T_MASK_HASH:
			case T_MASK_LAST_N:
			case T_MASK_SHOW_FIRST_N:
			case T_MASK_SHOW_LAST_N:
			case T_OCTET_LENGTH:
			case T_PARSE_URL:
			case T_PRINTF:
			case T_QUOTE:
			case T_REGEXP_EXTRACT:
			case T_REGEXP_REPLACE:
			case T_REPEAT:
			case T_REPLACE:
			case T_REVERSE:
			case T_RPAD:
			case T_RTRIM:
			case T_TRIM:
			case T_SENTENCES:
			case T_SOUNDEX:
			case T_SPACE:
			case T_SPLIT:
			case T_STR_TO_MAP:
			case T_SUBSTR:
			case T_SUBSTRING:
			case T_SUBSTRING_INDEX:
			case T_TRANSLATE:
			case T_UCASE:
			case T_UNBASE64:
			case T_UPPER:
				enterOuterAlt(_localctx, 8);
				{
				setState(974);
				((Expr_concat_itemContext)_localctx).str_func = str_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).str_func.res; 
				}
				break;
			case T_AES_ENCRYPT:
			case T_AES_DECRYPT:
			case T_CRC32:
			case T_CURRENT_DATABASE:
			case T_HASH:
			case T_JAVA_METHOD:
			case T_LOGGED_IN_USER:
			case T_MD5:
			case T_REFLECT:
			case T_SHA:
			case T_SHA1:
			case T_SHA2:
			case T_VERSION:
			case T_XPATH:
			case T_XPATH_BOOLEAN:
			case T_XPATH_DOUBLE:
			case T_XPATH_FLOAT:
			case T_XPATH_INT:
			case T_XPATH_LONG:
			case T_XPATH_NUMBER:
			case T_XPATH_SHORT:
			case T_XPATH_STRING:
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 9);
				{
				setState(977);
				((Expr_concat_itemContext)_localctx).misc_func = misc_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).misc_func.res; 
				}
				break;
			case T_AVG:
			case T_COLLECT_SET:
			case T_COLLECT_LIST:
			case T_CORR:
			case T_COUNT:
			case T_COVAR_POP:
			case T_COVAR_SAMP:
			case T_HISTOGRAM_NUMERIC:
			case T_MAX:
			case T_MIN:
			case T_NTILE:
			case T_PERCENTILE:
			case T_PERCENTILE_APPROX:
			case T_REGR_AVGX:
			case T_REGR_AVGY:
			case T_REGR_COUNT:
			case T_REGR_INTERCEPT:
			case T_REGR_R2:
			case T_REGR_SLOPE:
			case T_REGR_SXX:
			case T_REGR_SXY:
			case T_REGR_SYY:
			case T_STDDEV_POP:
			case T_STDDEV_SAMP:
			case T_SUM:
			case T_VARIANCE:
			case T_VAR_POP:
			case T_VAR_SAMP:
				enterOuterAlt(_localctx, 10);
				{
				setState(980);
				((Expr_concat_itemContext)_localctx).aggr_func = aggr_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).aggr_func.res; 
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
		enterRule(_localctx, 30, RULE_cond_func);
		int _la;
		try {
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				match(T_IF);
				setState(986);
				match(T_OPEN_P);
				setState(987);
				((Cond_funcContext)_localctx).test_cond = expr();
				setState(988);
				match(T_COMMA);
				setState(989);
				((Cond_funcContext)_localctx).valueTrue = expr();
				setState(990);
				match(T_COMMA);
				setState(991);
				((Cond_funcContext)_localctx).valueFalse = expr();
				setState(992);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_three_param_func("IF", "test_cond", ((Cond_funcContext)_localctx).test_cond.res, "value_true", ((Cond_funcContext)_localctx).valueTrue.res, "value_false", ((Cond_funcContext)_localctx).valueFalse.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(T_ISNULL);
				setState(996);
				match(T_OPEN_P);
				setState(997);
				((Cond_funcContext)_localctx).expr = expr();
				setState(998);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1001);
				match(T_ISNOTNULL);
				setState(1002);
				match(T_OPEN_P);
				setState(1003);
				((Cond_funcContext)_localctx).expr = expr();
				setState(1004);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNOTNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1007);
				match(T_NVL);
				setState(1008);
				match(T_OPEN_P);
				setState(1009);
				((Cond_funcContext)_localctx).expr_val = expr();
				setState(1010);
				match(T_COMMA);
				setState(1011);
				((Cond_funcContext)_localctx).default_val = expr();
				setState(1012);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NVL", "expr_val", ((Cond_funcContext)_localctx).expr_val.res, "default_val", ((Cond_funcContext)_localctx).default_val.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(1016);
				match(T_COALESCE);
				setState(1017);
				match(T_OPEN_P);
				{
				setState(1018);
				((Cond_funcContext)_localctx).expr = expr();
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				}
				{
				setState(1019);
				match(T_COMMA);
				setState(1020);
				((Cond_funcContext)_localctx).expr = expr();
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				}
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1022);
					match(T_COMMA);
					setState(1023);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(1028);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1029);
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
				setState(1033);
				match(T_CASE);
				setState(1034);
				((Cond_funcContext)_localctx).case_expr = expr();
				setState(1040); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1035);
					match(T_WHEN);
					setState(1036);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(1037);
					match(T_THEN);
					setState(1038);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(1042); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(1044);
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
				setState(1048);
				match(T_CASE);
				setState(1049);
				((Cond_funcContext)_localctx).case_expr = expr();
				setState(1055); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1050);
					match(T_WHEN);
					setState(1051);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(1052);
					match(T_THEN);
					setState(1053);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(1057); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(1059);
				match(T_ELSE);
				setState(1060);
				((Cond_funcContext)_localctx).els_expr = expr();
				setState(1061);
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
				setState(1065);
				match(T_CASE);
				setState(1071); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1066);
					match(T_WHEN);
					setState(1067);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(1068);
					match(T_THEN);
					setState(1069);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(1073); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(1075);
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
				setState(1079);
				match(T_CASE);
				setState(1085); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1080);
					match(T_WHEN);
					setState(1081);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(1082);
					match(T_THEN);
					setState(1083);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(1087); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(1089);
				match(T_ELSE);
				setState(1090);
				((Cond_funcContext)_localctx).els_expr = expr();
				setState(1091);
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
				setState(1094);
				match(T_NULLIF);
				setState(1095);
				match(T_OPEN_P);
				setState(1096);
				((Cond_funcContext)_localctx).a_expr = expr();
				setState(1097);
				match(T_COMMA);
				setState(1098);
				((Cond_funcContext)_localctx).b_expr = expr();
				setState(1099);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NULLIF", "a_expr", ((Cond_funcContext)_localctx).a_expr.res, "b_expr", ((Cond_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1102);
				match(T_ASSERT_TRUE);
				setState(1103);
				match(T_OPEN_P);
				setState(1104);
				((Cond_funcContext)_localctx).expr = expr();
				setState(1105);
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
		public Token T_SYSDATE;
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
		public TerminalNode T_SYSDATE() { return getToken(HiveParser.T_SYSDATE, 0); }
		public Date_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_func; }
	}

	public final Date_funcContext date_func() throws RecognitionException {
		Date_funcContext _localctx = new Date_funcContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_date_func);
		int _la;
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				match(T_UNIX_TIMESTAMP);
				setState(1111);
				match(T_OPEN_P);
				setState(1112);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("UNIX_TIMESTAMP"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				match(T_UNIX_TIMESTAMP);
				setState(1115);
				match(T_OPEN_P);
				setState(1116);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1117);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1120);
				match(T_UNIX_TIMESTAMP);
				setState(1121);
				match(T_OPEN_P);
				setState(1122);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1123);
				match(T_COMMA);
				setState(1124);
				((Date_funcContext)_localctx).pattern_expr = expr();
				setState(1125);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res, "pattern", ((Date_funcContext)_localctx).pattern_expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1128);
				match(T_YEAR);
				setState(1129);
				match(T_OPEN_P);
				setState(1130);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1131);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("YEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1134);
				match(T_QUARTER);
				setState(1135);
				match(T_OPEN_P);
				setState(1136);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1137);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("QUARTER", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1140);
				match(T_MONTH);
				setState(1141);
				match(T_OPEN_P);
				setState(1142);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1143);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MONTH", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1146);
				match(T_DAY);
				setState(1147);
				match(T_OPEN_P);
				setState(1148);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1149);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1152);
				match(T_HOUR);
				setState(1153);
				match(T_OPEN_P);
				setState(1154);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1155);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("HOUR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1158);
				match(T_MINUTE);
				setState(1159);
				match(T_OPEN_P);
				setState(1160);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1161);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MINUTE", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1164);
				match(T_SECOND);
				setState(1165);
				match(T_OPEN_P);
				setState(1166);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1167);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("SECOND", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1170);
				match(T_WEEKOFYEAR);
				setState(1171);
				match(T_OPEN_P);
				setState(1172);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1173);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("WEEKOFYEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1176);
				match(T_DATEDIFF);
				setState(1177);
				match(T_OPEN_P);
				setState(1178);
				((Date_funcContext)_localctx).enddate = expr();
				setState(1179);
				match(T_COMMA);
				setState(1180);
				((Date_funcContext)_localctx).startdate = expr();
				setState(1181);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "enddate", ((Date_funcContext)_localctx).enddate.res, "startdate", ((Date_funcContext)_localctx).startdate.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1184);
				match(T_DATEADD);
				setState(1185);
				match(T_OPEN_P);
				setState(1186);
				((Date_funcContext)_localctx).startdate = expr();
				setState(1187);
				match(T_COMMA);
				setState(1188);
				((Date_funcContext)_localctx).days = expr();
				setState(1189);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1192);
				match(T_DATESUB);
				setState(1193);
				match(T_OPEN_P);
				setState(1194);
				((Date_funcContext)_localctx).startdate = expr();
				setState(1195);
				match(T_COMMA);
				setState(1196);
				((Date_funcContext)_localctx).days = expr();
				setState(1197);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1200);
				match(T_TOUTCTIMESTAMP);
				setState(1201);
				match(T_OPEN_P);
				setState(1202);
				((Date_funcContext)_localctx).ts = expr();
				setState(1203);
				match(T_COMMA);
				setState(1204);
				((Date_funcContext)_localctx).timezone = expr();
				setState(1205);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TO_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1208);
				match(T_FROMUTCTIMESTAMP);
				setState(1209);
				match(T_OPEN_P);
				setState(1210);
				((Date_funcContext)_localctx).ts = expr();
				setState(1211);
				match(T_COMMA);
				setState(1212);
				((Date_funcContext)_localctx).timezone = expr();
				setState(1213);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("FROM_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1216);
				match(T_CURRENT_DATE);
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1217);
					match(T_OPEN_P);
					setState(1218);
					match(T_CLOSE_P);
					}
				}

				 ((Date_funcContext)_localctx).res =  hql_fixed_func("CURRENT_DATE"); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1222);
				match(T_CURRENT_TIMESTAMP);
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1223);
					match(T_OPEN_P);
					setState(1224);
					match(T_CLOSE_P);
					}
				}

				 ((Date_funcContext)_localctx).res =  hql_fixed_func("T_CURRENT_TIMESTAMP"); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1228);
				match(T_ADD_MONTHS);
				setState(1229);
				match(T_OPEN_P);
				setState(1230);
				((Date_funcContext)_localctx).startdate = expr();
				setState(1231);
				match(T_COMMA);
				setState(1232);
				((Date_funcContext)_localctx).num_months = expr();
				setState(1233);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1236);
				match(T_ADD_MONTHS);
				setState(1237);
				match(T_OPEN_P);
				setState(1238);
				((Date_funcContext)_localctx).startdate = expr();
				setState(1239);
				match(T_COMMA);
				setState(1240);
				((Date_funcContext)_localctx).num_months = expr();
				setState(1241);
				match(T_COMMA);
				setState(1242);
				((Date_funcContext)_localctx).out_date_format = expr();
				setState(1243);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_three_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res, "out_date_format", ((Date_funcContext)_localctx).out_date_format.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1246);
				match(T_LASTDAY);
				setState(1247);
				match(T_OPEN_P);
				setState(1248);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1249);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("LAST_DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1252);
				match(T_NEXT_DAY);
				setState(1253);
				match(T_OPEN_P);
				setState(1254);
				((Date_funcContext)_localctx).startdate = expr();
				setState(1255);
				match(T_COMMA);
				setState(1256);
				((Date_funcContext)_localctx).day_of_week = expr();
				setState(1257);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("NEXT_DAY", "startdate", ((Date_funcContext)_localctx).startdate.res, "day_of_week", ((Date_funcContext)_localctx).day_of_week.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1260);
				match(T_TRUNC);
				setState(1261);
				match(T_OPEN_P);
				setState(1262);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1263);
				match(T_COMMA);
				setState(1264);
				((Date_funcContext)_localctx).format = expr();
				setState(1265);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TRUNC", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1268);
				match(T_MONTHS_BETWEEN);
				setState(1269);
				match(T_OPEN_P);
				setState(1270);
				((Date_funcContext)_localctx).date1 = expr();
				setState(1271);
				match(T_COMMA);
				setState(1272);
				((Date_funcContext)_localctx).date2 = expr();
				setState(1273);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("MONTHS_BETWEEN", "date1", ((Date_funcContext)_localctx).date1.res, "date2", ((Date_funcContext)_localctx).date2.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1276);
				match(T_DATE_FORMAT);
				setState(1277);
				match(T_OPEN_P);
				setState(1278);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(1279);
				match(T_COMMA);
				setState(1280);
				((Date_funcContext)_localctx).format = expr();
				setState(1281);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATE_FORMAT", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1284);
				((Date_funcContext)_localctx).T_SYSDATE = match(T_SYSDATE);
				 ((Date_funcContext)_localctx).res =  hql_fixed_func((((Date_funcContext)_localctx).T_SYSDATE!=null?((Date_funcContext)_localctx).T_SYSDATE.getText():null)); 
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

	public static class Dat_convrt_funcContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public DtypeContext dtype;
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
		public TerminalNode T_BINARY() { return getToken(HiveParser.T_BINARY, 0); }
		public Dat_convrt_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dat_convrt_func; }
	}

	public final Dat_convrt_funcContext dat_convrt_func() throws RecognitionException {
		Dat_convrt_funcContext _localctx = new Dat_convrt_funcContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dat_convrt_func);
		int _la;
		try {
			setState(1305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				match(T_CAST);
				setState(1289);
				match(T_OPEN_P);
				setState(1290);
				((Dat_convrt_funcContext)_localctx).expr = expr();
				setState(1291);
				match(T_AS);
				setState(1292);
				((Dat_convrt_funcContext)_localctx).dtype = dtype();
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1293);
					dtype_len();
					}
				}

				setState(1296);
				match(T_CLOSE_P);
				 ((Dat_convrt_funcContext)_localctx).res =  hql_cast_func(((Dat_convrt_funcContext)_localctx).expr.res, ((Dat_convrt_funcContext)_localctx).dtype.res); 
				}
				break;
			case T_BINARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				match(T_BINARY);
				setState(1300);
				match(T_OPEN_P);
				setState(1301);
				((Dat_convrt_funcContext)_localctx).expr = expr();
				setState(1302);
				match(T_CLOSE_P);
				 ((Dat_convrt_funcContext)_localctx).res =  hql_single_param_func("BINARY", "expr", ((Dat_convrt_funcContext)_localctx).expr.res); 
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

	public static class Aggr_funcContext extends ParserRuleContext {
		public json res;
		public ExprContext r;
		public ExprContext expr;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public Token fun_name;
		public ExprContext col1;
		public ExprContext col2;
		public ExprContext col;
		public ExprContext p_expr;
		public ExprContext b_expr;
		public Token func_name;
		public ExprContext indep;
		public ExprContext dep;
		public TerminalNode T_COUNT() { return getToken(HiveParser.T_COUNT, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DISTINCT() { return getToken(HiveParser.T_DISTINCT, 0); }
		public TerminalNode T_SUM() { return getToken(HiveParser.T_SUM, 0); }
		public TerminalNode T_AVG() { return getToken(HiveParser.T_AVG, 0); }
		public TerminalNode T_MIN() { return getToken(HiveParser.T_MIN, 0); }
		public TerminalNode T_MAX() { return getToken(HiveParser.T_MAX, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HiveParser.T_VARIANCE, 0); }
		public TerminalNode T_VAR_POP() { return getToken(HiveParser.T_VAR_POP, 0); }
		public TerminalNode T_VAR_SAMP() { return getToken(HiveParser.T_VAR_SAMP, 0); }
		public TerminalNode T_STDDEV_POP() { return getToken(HiveParser.T_STDDEV_POP, 0); }
		public TerminalNode T_STDDEV_SAMP() { return getToken(HiveParser.T_STDDEV_SAMP, 0); }
		public TerminalNode T_COVAR_POP() { return getToken(HiveParser.T_COVAR_POP, 0); }
		public TerminalNode T_COVAR_SAMP() { return getToken(HiveParser.T_COVAR_SAMP, 0); }
		public TerminalNode T_CORR() { return getToken(HiveParser.T_CORR, 0); }
		public TerminalNode T_PERCENTILE() { return getToken(HiveParser.T_PERCENTILE, 0); }
		public TerminalNode T_PERCENTILE_APPROX() { return getToken(HiveParser.T_PERCENTILE_APPROX, 0); }
		public TerminalNode T_REGR_AVGX() { return getToken(HiveParser.T_REGR_AVGX, 0); }
		public TerminalNode T_REGR_AVGY() { return getToken(HiveParser.T_REGR_AVGY, 0); }
		public TerminalNode T_REGR_COUNT() { return getToken(HiveParser.T_REGR_COUNT, 0); }
		public TerminalNode T_REGR_INTERCEPT() { return getToken(HiveParser.T_REGR_INTERCEPT, 0); }
		public TerminalNode T_REGR_R2() { return getToken(HiveParser.T_REGR_R2, 0); }
		public TerminalNode T_REGR_SLOPE() { return getToken(HiveParser.T_REGR_SLOPE, 0); }
		public TerminalNode T_REGR_SXX() { return getToken(HiveParser.T_REGR_SXX, 0); }
		public TerminalNode T_REGR_SXY() { return getToken(HiveParser.T_REGR_SXY, 0); }
		public TerminalNode T_REGR_SYY() { return getToken(HiveParser.T_REGR_SYY, 0); }
		public TerminalNode T_HISTOGRAM_NUMERIC() { return getToken(HiveParser.T_HISTOGRAM_NUMERIC, 0); }
		public TerminalNode T_COLLECT_SET() { return getToken(HiveParser.T_COLLECT_SET, 0); }
		public TerminalNode T_COLLECT_LIST() { return getToken(HiveParser.T_COLLECT_LIST, 0); }
		public TerminalNode T_NTILE() { return getToken(HiveParser.T_NTILE, 0); }
		public Aggr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggr_func; }
	}

	public final Aggr_funcContext aggr_func() throws RecognitionException {
		Aggr_funcContext _localctx = new Aggr_funcContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_aggr_func);
		int _la;
		try {
			setState(1427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1307);
				match(T_COUNT);
				setState(1308);
				match(T_OPEN_P);
				setState(1309);
				((Aggr_funcContext)_localctx).r = expr();
				setState(1310);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_count_func(((Aggr_funcContext)_localctx).r.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 vector<ExprContext*> exprs; 
				setState(1314);
				match(T_COUNT);
				setState(1315);
				match(T_OPEN_P);
				setState(1316);
				match(T_DISTINCT);
				setState(1317);
				((Aggr_funcContext)_localctx).expr = expr();
				((Aggr_funcContext)_localctx).exprs.add(((Aggr_funcContext)_localctx).expr);
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1318);
					match(T_COMMA);
					setState(1319);
					((Aggr_funcContext)_localctx).expr = expr();
					((Aggr_funcContext)_localctx).exprs.add(((Aggr_funcContext)_localctx).expr);
					}
					}
					setState(1324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1325);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Aggr_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Aggr_funcContext)_localctx).res =  hql_single_param_list_func("COUNT", "flag_distinct", true, "expr_list", expr_list_json);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1328);
				match(T_COUNT);
				setState(1329);
				match(T_OPEN_P);
				setState(1330);
				match(T_MUL);
				setState(1331);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_count_all_func(); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1333);
				match(T_SUM);
				setState(1334);
				match(T_OPEN_P);
				setState(1335);
				((Aggr_funcContext)_localctx).expr = expr();
				setState(1336);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", false, "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1339);
				match(T_SUM);
				setState(1340);
				match(T_OPEN_P);
				setState(1341);
				match(T_DISTINCT);
				setState(1342);
				((Aggr_funcContext)_localctx).expr = expr();
				setState(1343);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", true, "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1346);
				match(T_AVG);
				setState(1347);
				match(T_OPEN_P);
				setState(1348);
				((Aggr_funcContext)_localctx).expr = expr();
				setState(1349);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", false, "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1352);
				match(T_AVG);
				setState(1353);
				match(T_OPEN_P);
				setState(1354);
				match(T_DISTINCT);
				setState(1355);
				((Aggr_funcContext)_localctx).expr = expr();
				setState(1356);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", true, "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1359);
				((Aggr_funcContext)_localctx).fun_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_MAX || _la==T_MIN || _la==T_STDDEV_POP || _la==T_STDDEV_SAMP || ((((_la - 480)) & ~0x3f) == 0 && ((1L << (_la - 480)) & ((1L << (T_VARIANCE - 480)) | (1L << (T_VAR_POP - 480)) | (1L << (T_VAR_SAMP - 480)))) != 0)) ) {
					((Aggr_funcContext)_localctx).fun_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1360);
				match(T_OPEN_P);
				setState(1361);
				((Aggr_funcContext)_localctx).expr = expr();
				setState(1362);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1365);
				((Aggr_funcContext)_localctx).fun_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T_CORR - 75)) | (1L << (T_COVAR_POP - 75)) | (1L << (T_COVAR_SAMP - 75)))) != 0)) ) {
					((Aggr_funcContext)_localctx).fun_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1366);
				match(T_OPEN_P);
				setState(1367);
				((Aggr_funcContext)_localctx).col1 = expr();
				setState(1368);
				match(T_COMMA);
				setState(1369);
				((Aggr_funcContext)_localctx).col2 = expr();
				setState(1370);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col1", ((Aggr_funcContext)_localctx).col1.res, "col2", ((Aggr_funcContext)_localctx).col2.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1373);
				match(T_PERCENTILE);
				setState(1374);
				match(T_OPEN_P);
				setState(1375);
				((Aggr_funcContext)_localctx).col = expr();
				setState(1376);
				match(T_COMMA);
				setState(1377);
				((Aggr_funcContext)_localctx).p_expr = expr();
				setState(1378);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1381);
				match(T_PERCENTILE_APPROX);
				setState(1382);
				match(T_OPEN_P);
				setState(1383);
				((Aggr_funcContext)_localctx).col = expr();
				setState(1384);
				match(T_COMMA);
				setState(1385);
				((Aggr_funcContext)_localctx).p_expr = expr();
				setState(1386);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1389);
				match(T_PERCENTILE_APPROX);
				setState(1390);
				match(T_OPEN_P);
				setState(1391);
				((Aggr_funcContext)_localctx).col = expr();
				setState(1392);
				match(T_COMMA);
				setState(1393);
				((Aggr_funcContext)_localctx).p_expr = expr();
				setState(1394);
				match(T_COMMA);
				setState(1395);
				((Aggr_funcContext)_localctx).b_expr = expr();
				setState(1396);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_three_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1399);
				((Aggr_funcContext)_localctx).func_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_REGR_AVGX - 322)) | (1L << (T_REGR_AVGY - 322)) | (1L << (T_REGR_COUNT - 322)) | (1L << (T_REGR_INTERCEPT - 322)) | (1L << (T_REGR_R2 - 322)) | (1L << (T_REGR_SLOPE - 322)) | (1L << (T_REGR_SXX - 322)) | (1L << (T_REGR_SXY - 322)) | (1L << (T_REGR_SYY - 322)))) != 0)) ) {
					((Aggr_funcContext)_localctx).func_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1400);
				match(T_OPEN_P);
				setState(1401);
				((Aggr_funcContext)_localctx).indep = expr();
				setState(1402);
				match(T_COMMA);
				setState(1403);
				((Aggr_funcContext)_localctx).dep = expr();
				setState(1404);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "independent", ((Aggr_funcContext)_localctx).indep.res, "dependent", ((Aggr_funcContext)_localctx).dep.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1407);
				match(T_HISTOGRAM_NUMERIC);
				setState(1408);
				match(T_OPEN_P);
				setState(1409);
				((Aggr_funcContext)_localctx).col = expr();
				setState(1410);
				match(T_COMMA);
				setState(1411);
				((Aggr_funcContext)_localctx).b_expr = expr();
				setState(1412);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("HISTOGRAM_NUMERIC", "col", ((Aggr_funcContext)_localctx).col.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1415);
				((Aggr_funcContext)_localctx).func_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_COLLECT_SET || _la==T_COLLECT_LIST) ) {
					((Aggr_funcContext)_localctx).func_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1416);
				match(T_OPEN_P);
				setState(1417);
				((Aggr_funcContext)_localctx).expr = expr();
				setState(1418);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1421);
				match(T_NTILE);
				setState(1422);
				match(T_OPEN_P);
				setState(1423);
				((Aggr_funcContext)_localctx).expr = expr();
				setState(1424);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func("NTILE", "x", ((Aggr_funcContext)_localctx).expr.res); 
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

	public static class Tab_generate_funcContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public TerminalNode T_EXPLODE() { return getToken(HiveParser.T_EXPLODE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public TerminalNode T_POSEXPLODE() { return getToken(HiveParser.T_POSEXPLODE, 0); }
		public TerminalNode T_INLINE() { return getToken(HiveParser.T_INLINE, 0); }
		public Tab_generate_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab_generate_func; }
	}

	public final Tab_generate_funcContext tab_generate_func() throws RecognitionException {
		Tab_generate_funcContext _localctx = new Tab_generate_funcContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tab_generate_func);
		try {
			setState(1447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EXPLODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1429);
				match(T_EXPLODE);
				setState(1430);
				match(T_OPEN_P);
				setState(1431);
				((Tab_generate_funcContext)_localctx).expr = expr();
				setState(1432);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("EXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_POSEXPLODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				match(T_POSEXPLODE);
				setState(1436);
				match(T_OPEN_P);
				setState(1437);
				((Tab_generate_funcContext)_localctx).expr = expr();
				setState(1438);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("POSEXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_INLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1441);
				match(T_INLINE);
				setState(1442);
				match(T_OPEN_P);
				setState(1443);
				((Tab_generate_funcContext)_localctx).expr = expr();
				setState(1444);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("INLINE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
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
		enterRule(_localctx, 40, RULE_math_func);
		int _la;
		try {
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1449);
				match(T_ROUND);
				setState(1450);
				match(T_OPEN_P);
				setState(1451);
				((Math_funcContext)_localctx).expr = expr();
				setState(1452);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ROUND", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1455);
				match(T_ROUND);
				setState(1456);
				match(T_OPEN_P);
				setState(1457);
				((Math_funcContext)_localctx).fst = expr();
				setState(1458);
				match(T_COMMA);
				setState(1459);
				((Math_funcContext)_localctx).snd = expr();
				setState(1460);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("ROUND", "expr", ((Math_funcContext)_localctx).fst.res, "decimal_places", ((Math_funcContext)_localctx).snd.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1463);
				match(T_FLOOR);
				setState(1464);
				match(T_OPEN_P);
				setState(1465);
				((Math_funcContext)_localctx).expr = expr();
				setState(1466);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FLOOR", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1469);
				_la = _input.LA(1);
				if ( !(_la==T_CEIL || _la==T_CEILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1470);
				match(T_OPEN_P);
				setState(1471);
				((Math_funcContext)_localctx).expr = expr();
				setState(1472);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("CEIL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1475);
				((Math_funcContext)_localctx).T_RAND = match(T_RAND);
				setState(1476);
				match(T_OPEN_P);
				setState(1477);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func((((Math_funcContext)_localctx).T_RAND!=null?((Math_funcContext)_localctx).T_RAND.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1479);
				match(T_RAND);
				setState(1480);
				match(T_OPEN_P);
				setState(1481);
				((Math_funcContext)_localctx).expr = expr();
				setState(1482);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RAND", "seed", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1485);
				match(T_EXP);
				setState(1486);
				match(T_OPEN_P);
				setState(1487);
				((Math_funcContext)_localctx).expr = expr();
				setState(1488);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("EXP", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1491);
				match(T_LN);
				setState(1492);
				match(T_OPEN_P);
				setState(1493);
				((Math_funcContext)_localctx).expr = expr();
				setState(1494);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1497);
				match(T_LOG10);
				setState(1498);
				match(T_OPEN_P);
				setState(1499);
				((Math_funcContext)_localctx).expr = expr();
				setState(1500);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG10", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1503);
				match(T_LOG2);
				setState(1504);
				match(T_OPEN_P);
				setState(1505);
				((Math_funcContext)_localctx).expr = expr();
				setState(1506);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG2", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1509);
				match(T_LOG);
				setState(1510);
				match(T_OPEN_P);
				setState(1511);
				((Math_funcContext)_localctx).base = expr();
				setState(1512);
				match(T_COMMA);
				setState(1513);
				((Math_funcContext)_localctx).e = expr();
				setState(1514);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("LOG", "base", ((Math_funcContext)_localctx).base.res, "expr", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1517);
				_la = _input.LA(1);
				if ( !(_la==T_POW || _la==T_POWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1518);
				match(T_OPEN_P);
				setState(1519);
				((Math_funcContext)_localctx).base = expr();
				setState(1520);
				match(T_COMMA);
				setState(1521);
				((Math_funcContext)_localctx).e = expr();
				setState(1522);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("POWER", "base", ((Math_funcContext)_localctx).base.res, "exp", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1525);
				match(T_SQRT);
				setState(1526);
				match(T_OPEN_P);
				setState(1527);
				((Math_funcContext)_localctx).expr = expr();
				setState(1528);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SQRT", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1531);
				match(T_BIN);
				setState(1532);
				match(T_OPEN_P);
				setState(1533);
				((Math_funcContext)_localctx).expr = expr();
				setState(1534);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("BIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1537);
				match(T_HEX);
				setState(1538);
				match(T_OPEN_P);
				setState(1539);
				((Math_funcContext)_localctx).expr = expr();
				setState(1540);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("HEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1543);
				match(T_UNHEX);
				setState(1544);
				match(T_OPEN_P);
				setState(1545);
				((Math_funcContext)_localctx).expr = expr();
				setState(1546);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("UNHEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1549);
				match(T_CONV);
				setState(1550);
				match(T_OPEN_P);
				setState(1551);
				((Math_funcContext)_localctx).e = expr();
				setState(1552);
				match(T_COMMA);
				setState(1553);
				((Math_funcContext)_localctx).fbase = expr();
				setState(1554);
				match(T_COMMA);
				setState(1555);
				((Math_funcContext)_localctx).tbase = expr();
				setState(1556);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_three_param_func("CONV", "expr", ((Math_funcContext)_localctx).e.res, "from_base", ((Math_funcContext)_localctx).fbase.res, "to_base", ((Math_funcContext)_localctx).tbase.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1559);
				match(T_ABS);
				setState(1560);
				match(T_OPEN_P);
				setState(1561);
				((Math_funcContext)_localctx).expr = expr();
				setState(1562);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ABS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1565);
				match(T_PMOD);
				setState(1566);
				match(T_OPEN_P);
				setState(1567);
				((Math_funcContext)_localctx).a = expr();
				setState(1568);
				match(T_COMMA);
				setState(1569);
				((Math_funcContext)_localctx).b = expr();
				setState(1570);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("PMOD", "a", ((Math_funcContext)_localctx).a.res, "b", ((Math_funcContext)_localctx).b.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1573);
				match(T_SIN);
				setState(1574);
				match(T_OPEN_P);
				setState(1575);
				((Math_funcContext)_localctx).expr = expr();
				setState(1576);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1579);
				match(T_ASIN);
				setState(1580);
				match(T_OPEN_P);
				setState(1581);
				((Math_funcContext)_localctx).expr = expr();
				setState(1582);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ASIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1585);
				match(T_COS);
				setState(1586);
				match(T_OPEN_P);
				setState(1587);
				((Math_funcContext)_localctx).expr = expr();
				setState(1588);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("COS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1591);
				match(T_ACOS);
				setState(1592);
				match(T_OPEN_P);
				setState(1593);
				((Math_funcContext)_localctx).expr = expr();
				setState(1594);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ACOS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1597);
				match(T_TAN);
				setState(1598);
				match(T_OPEN_P);
				setState(1599);
				((Math_funcContext)_localctx).expr = expr();
				setState(1600);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("TAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1603);
				match(T_ATAN);
				setState(1604);
				match(T_OPEN_P);
				setState(1605);
				((Math_funcContext)_localctx).expr = expr();
				setState(1606);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ATAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1609);
				match(T_DEGREES);
				setState(1610);
				match(T_OPEN_P);
				setState(1611);
				((Math_funcContext)_localctx).expr = expr();
				setState(1612);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("DEGREES", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1615);
				match(T_RADIANS);
				setState(1616);
				match(T_OPEN_P);
				setState(1617);
				((Math_funcContext)_localctx).expr = expr();
				setState(1618);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RADIANS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1621);
				match(T_POSITIVE);
				setState(1622);
				match(T_OPEN_P);
				setState(1623);
				((Math_funcContext)_localctx).expr = expr();
				setState(1624);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("POSITIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1627);
				match(T_NEGATIVE);
				setState(1628);
				match(T_OPEN_P);
				setState(1629);
				((Math_funcContext)_localctx).expr = expr();
				setState(1630);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("NEGATIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1633);
				match(T_SIGN);
				setState(1634);
				match(T_OPEN_P);
				setState(1635);
				((Math_funcContext)_localctx).expr = expr();
				setState(1636);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIGN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1639);
				match(T__5);
				setState(1640);
				match(T_OPEN_P);
				setState(1641);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("EULER_CONST"); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1643);
				match(T__6);
				setState(1644);
				match(T_OPEN_P);
				setState(1645);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("PI_CONST"); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1647);
				match(T_FACTORIAL);
				setState(1648);
				match(T_OPEN_P);
				setState(1649);
				((Math_funcContext)_localctx).expr = expr();
				setState(1650);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FACTORIAL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1653);
				match(T_CBR);
				setState(1654);
				match(T_OPEN_P);
				setState(1655);
				((Math_funcContext)_localctx).expr = expr();
				setState(1656);
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
		enterRule(_localctx, 42, RULE_literal_values);
		try {
			setState(1677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1661);
				((Literal_valuesContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_string_type((((Literal_valuesContext)_localctx).STRING_LITERAL!=null?((Literal_valuesContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1663);
				((Literal_valuesContext)_localctx).DECIMAL_LITERAL = match(DECIMAL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_decimal_type((((Literal_valuesContext)_localctx).DECIMAL_LITERAL!=null?((Literal_valuesContext)_localctx).DECIMAL_LITERAL.getText():null)); 
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1665);
				((Literal_valuesContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_int_type((((Literal_valuesContext)_localctx).INT_LITERAL!=null?((Literal_valuesContext)_localctx).INT_LITERAL.getText():null)); 
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1667);
				((Literal_valuesContext)_localctx).BOOL_LITERAL = match(BOOL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_boolean_type((((Literal_valuesContext)_localctx).BOOL_LITERAL!=null?((Literal_valuesContext)_localctx).BOOL_LITERAL.getText():null)); 
				}
				break;
			case NULL_CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(1669);
				match(NULL_CONST);
				 ((Literal_valuesContext)_localctx).res =  hql_null_constant(); 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1671);
				((Literal_valuesContext)_localctx).date_literal = date_literal();
				 ((Literal_valuesContext)_localctx).res =  hql_type_date_literal(((Literal_valuesContext)_localctx).date_literal.res); 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1674);
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
		enterRule(_localctx, 44, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(1679);
				((IdentContext)_localctx).database = match(IDENTIFIER);
				setState(1680);
				match(T__7);
				}
				break;
			}
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(1683);
				((IdentContext)_localctx).tablename = match(IDENTIFIER);
				setState(1684);
				match(T__7);
				}
				break;
			}
			setState(1687);
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
		enterRule(_localctx, 46, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
			match(T_DATE);
			setState(1691);
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
		enterRule(_localctx, 48, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(T_TIMESTAMP);
			setState(1695);
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
		enterRule(_localctx, 50, RULE_set_operators);
		try {
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1698);
				match(T_IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1699);
				match(T_IS);
				setState(1700);
				match(T_NOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1701);
				match(T_IN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1702);
				match(T_NOT);
				setState(1703);
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
		enterRule(_localctx, 52, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0204\u06af\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3A\n"+
		"\3\r\3\16\3B\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0092\n\4\3\4\3\4\5\4\u0096"+
		"\n\4\3\5\3\5\3\5\5\5\u009b\n\5\3\5\3\5\5\5\u009f\n\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b9\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c1"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00f6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u0122\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u012a\n\f\f"+
		"\f\16\f\u012d\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u013d\n\f\f\f\16\f\u0140\13\f\3\f\3\f\3\f\5\f\u0145\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0165\n\r\r\r\16\r\u0166"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0174\n\r\r\r\16\r\u0175"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u018b\n\r\f\r\16\r\u018e\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01a3\n\r\f\r\16\r"+
		"\u01a6\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\6\r\u0221\n\r\r\r\16\r\u0222\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
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
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0348\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u0352\n\16\f\16\16\16\u0355\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u0362\n\16\f\16\16\16\u0365\13\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0370\n\16\f\16\16\16\u0373\13"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u03ae\n\16\3\17\3\17\3\17\3\17\6\17\u03b4\n\17\r\17\16\17"+
		"\u03b5\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u03da\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0403\n\21\f\21\16\21\u0406\13"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0413"+
		"\n\21\r\21\16\21\u0414\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\6\21\u0422\n\21\r\21\16\21\u0423\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0432\n\21\r\21\16\21\u0433\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0440\n\21\r\21\16\21"+
		"\u0441\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0457\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u04c6\n\22\3\22\3\22\3\22\3\22\5\22"+
		"\u04cc\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0509\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0511\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u051c"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u052b\n\24\f\24\16\24\u052e\13\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0596"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u05aa\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u067e\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0690\n\27\3\30\3\30\5\30\u0694\n\30\3\30\3\30\5\30\u0698\n\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u06ab\n\33\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\26\4\2\u015d\u015d\u01a4\u01a4"+
		"\4\2\u00f9\u00f9\u0201\u0201\4\2**\63\63\5\2\3\3\u01ea\u01ea\u01f4\u01f4"+
		"\4\2\u01e6\u01e6\u01fc\u01fc\3\2\4\7\3\2\u01f0\u01f3\3\2\u01ec\u01ef\4"+
		"\2\u00d8\u00d8\u00ed\u00ed\3\2\u018c\u018d\4\2\u01a5\u01a5\u01ac\u01ac"+
		"\5\2SS\u00fb\u00fb\u016f\u0170\3\2\u01c1\u01c9\6\2\u00f9\u00f9\u0100\u0100"+
		"\u0184\u0185\u01e2\u01e4\4\2MMQR\3\2\u0144\u014c\3\2>?\3\2\61\62\3\2\u012e"+
		"\u012f\6\2\13\13\u010f\u010f\u01e6\u01e6\u01fc\u01fc\2\u0799\28\3\2\2"+
		"\2\4<\3\2\2\2\6\u0095\3\2\2\2\b\u0097\3\2\2\2\n\u00a2\3\2\2\2\f\u00a5"+
		"\3\2\2\2\16\u00b8\3\2\2\2\20\u00c0\3\2\2\2\22\u00f5\3\2\2\2\24\u0121\3"+
		"\2\2\2\26\u0144\3\2\2\2\30\u0347\3\2\2\2\32\u03ad\3\2\2\2\34\u03af\3\2"+
		"\2\2\36\u03d9\3\2\2\2 \u0456\3\2\2\2\"\u0508\3\2\2\2$\u051b\3\2\2\2&\u0595"+
		"\3\2\2\2(\u05a9\3\2\2\2*\u067d\3\2\2\2,\u068f\3\2\2\2.\u0693\3\2\2\2\60"+
		"\u069c\3\2\2\2\62\u06a0\3\2\2\2\64\u06aa\3\2\2\2\66\u06ac\3\2\2\289\5"+
		"\4\3\29:\7\2\2\3:;\b\2\1\2;\3\3\2\2\2<@\b\3\1\2=>\5\n\6\2>?\7\u01fb\2"+
		"\2?A\3\2\2\2@=\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\3\1"+
		"\2E\5\3\2\2\2FG\7\63\2\2G\u0096\b\4\1\2HI\7\64\2\2I\u0096\b\4\1\2JK\7"+
		"#\2\2K\u0096\b\4\1\2LM\7&\2\2M\u0096\b\4\1\2NO\7^\2\2O\u0096\b\4\1\2P"+
		"Q\7c\2\2Q\u0096\b\4\1\2RS\7f\2\2S\u0096\b\4\1\2TU\7g\2\2U\u0096\b\4\1"+
		"\2VX\7{\2\2WY\7\u0130\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\u0096\b\4\1\2"+
		"[\\\7\u0099\2\2\\\u0096\b\4\1\2]^\7\u00c2\2\2^\u0096\b\4\1\2_`\7\u00c3"+
		"\2\2`\u0096\b\4\1\2ab\7\u00c4\2\2b\u0096\b\4\1\2cd\7\u00c5\2\2d\u0096"+
		"\b\4\1\2ef\7\u00c6\2\2f\u0096\b\4\1\2gh\7\u0105\2\2h\u0096\b\4\1\2ij\7"+
		"\u0109\2\2j\u0096\b\4\1\2kl\7\u0115\2\2l\u0096\b\4\1\2mn\7\u0114\2\2n"+
		"\u0096\b\4\1\2op\7\u012a\2\2p\u0096\b\4\1\2qr\7\u013e\2\2r\u0096\b\4\1"+
		"\2st\7\u0152\2\2tu\7\u01b5\2\2u\u0096\b\4\1\2vw\7\u0175\2\2w\u0096\b\4"+
		"\1\2xy\7\u0174\2\2y\u0096\b\4\1\2z{\7\u0176\2\2{\u0096\b\4\1\2|}\7\u0178"+
		"\2\2}\u0096\b\4\1\2~\177\7\u0177\2\2\177\u0096\b\4\1\2\u0080\u0081\7\u0189"+
		"\2\2\u0081\u0096\b\4\1\2\u0082\u0083\7\u0191\2\2\u0083\u0096\b\4\1\2\u0084"+
		"\u0085\7\u0199\2\2\u0085\u0096\b\4\1\2\u0086\u0087\7\u019a\2\2\u0087\u0096"+
		"\b\4\1\2\u0088\u0089\7\u01b3\2\2\u0089\u0096\b\4\1\2\u008a\u008b\7\u01b4"+
		"\2\2\u008b\u0096\b\4\1\2\u008c\u008d\7\u01c0\2\2\u008d\u0096\b\4\1\2\u008e"+
		"\u0091\5.\30\2\u008f\u0090\7\3\2\2\u0090\u0092\t\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\4\1\2\u0094"+
		"\u0096\3\2\2\2\u0095F\3\2\2\2\u0095H\3\2\2\2\u0095J\3\2\2\2\u0095L\3\2"+
		"\2\2\u0095N\3\2\2\2\u0095P\3\2\2\2\u0095R\3\2\2\2\u0095T\3\2\2\2\u0095"+
		"V\3\2\2\2\u0095[\3\2\2\2\u0095]\3\2\2\2\u0095_\3\2\2\2\u0095a\3\2\2\2"+
		"\u0095c\3\2\2\2\u0095e\3\2\2\2\u0095g\3\2\2\2\u0095i\3\2\2\2\u0095k\3"+
		"\2\2\2\u0095m\3\2\2\2\u0095o\3\2\2\2\u0095q\3\2\2\2\u0095s\3\2\2\2\u0095"+
		"v\3\2\2\2\u0095x\3\2\2\2\u0095z\3\2\2\2\u0095|\3\2\2\2\u0095~\3\2\2\2"+
		"\u0095\u0080\3\2\2\2\u0095\u0082\3\2\2\2\u0095\u0084\3\2\2\2\u0095\u0086"+
		"\3\2\2\2\u0095\u0088\3\2\2\2\u0095\u008a\3\2\2\2\u0095\u008c\3\2\2\2\u0095"+
		"\u008e\3\2\2\2\u0096\7\3\2\2\2\u0097\u0098\7\u01f6\2\2\u0098\u009a\t\3"+
		"\2\2\u0099\u009b\t\4\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009d\7\u01e8\2\2\u009d\u009f\7\u0201\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\u01f9\2"+
		"\2\u00a1\t\3\2\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\b\6\1\2\u00a4\13\3"+
		"\2\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\b\7\1\2\u00a7\r\3\2\2\2\u00a8"+
		"\u00a9\b\b\1\2\u00a9\u00aa\7\u016b\2\2\u00aa\u00af\5\20\t\2\u00ab\u00ac"+
		"\7\u01e8\2\2\u00ac\u00ae\5\20\t\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\b\b\1\2\u00b3\u00b9\3\2\2\2\u00b4\u00b5\7\u016b"+
		"\2\2\u00b5\u00b6\5(\25\2\u00b6\u00b7\b\b\1\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00a8\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\17\3\2\2\2\u00ba\u00bb\5\24\13"+
		"\2\u00bb\u00bc\b\t\1\2\u00bc\u00c1\3\2\2\2\u00bd\u00be\5\22\n\2\u00be"+
		"\u00bf\b\t\1\2\u00bf\u00c1\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bd\3\2"+
		"\2\2\u00c1\21\3\2\2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c4\t\5\2\2\u00c4"+
		"\u00c5\5\24\13\2\u00c5\u00c6\b\n\1\2\u00c6\u00f6\3\2\2\2\u00c7\u00c8\5"+
		"\24\13\2\u00c8\u00c9\t\6\2\2\u00c9\u00ca\5\24\13\2\u00ca\u00cb\b\n\1\2"+
		"\u00cb\u00f6\3\2\2\2\u00cc\u00cd\5\24\13\2\u00cd\u00ce\t\7\2\2\u00ce\u00cf"+
		"\5\24\13\2\u00cf\u00d0\b\n\1\2\u00d0\u00f6\3\2\2\2\u00d1\u00d2\5\24\13"+
		"\2\u00d2\u00d3\t\b\2\2\u00d3\u00d4\5\24\13\2\u00d4\u00d5\b\n\1\2\u00d5"+
		"\u00f6\3\2\2\2\u00d6\u00d7\5\24\13\2\u00d7\u00d8\t\t\2\2\u00d8\u00d9\5"+
		"\24\13\2\u00d9\u00da\b\n\1\2\u00da\u00f6\3\2\2\2\u00db\u00dc\5\24\13\2"+
		"\u00dc\u00dd\5\64\33\2\u00dd\u00de\5\24\13\2\u00de\u00df\b\n\1\2\u00df"+
		"\u00f6\3\2\2\2\u00e0\u00e1\5\24\13\2\u00e1\u00e2\7\25\2\2\u00e2\u00e3"+
		"\5\24\13\2\u00e3\u00e4\b\n\1\2\u00e4\u00f6\3\2\2\2\u00e5\u00e6\5\24\13"+
		"\2\u00e6\u00e7\7\u011c\2\2\u00e7\u00e8\5\24\13\2\u00e8\u00e9\b\n\1\2\u00e9"+
		"\u00f6\3\2\2\2\u00ea\u00eb\5\24\13\2\u00eb\u00ec\7\u00cb\2\2\u00ec\u00ed"+
		"\7\u0112\2\2\u00ed\u00ee\b\n\1\2\u00ee\u00f6\3\2\2\2\u00ef\u00f0\5\24"+
		"\13\2\u00f0\u00f1\7\u00cb\2\2\u00f1\u00f2\7\u010f\2\2\u00f2\u00f3\7\u0112"+
		"\2\2\u00f3\u00f4\b\n\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00c2\3\2\2\2\u00f5"+
		"\u00c7\3\2\2\2\u00f5\u00cc\3\2\2\2\u00f5\u00d1\3\2\2\2\u00f5\u00d6\3\2"+
		"\2\2\u00f5\u00db\3\2\2\2\u00f5\u00e0\3\2\2\2\u00f5\u00e5\3\2\2\2\u00f5"+
		"\u00ea\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f6\23\3\2\2\2\u00f7\u00f8\5,\27"+
		"\2\u00f8\u00f9\b\13\1\2\u00f9\u0122\3\2\2\2\u00fa\u00fb\5.\30\2\u00fb"+
		"\u00fc\b\13\1\2\u00fc\u0122\3\2\2\2\u00fd\u00fe\5\66\34\2\u00fe\u00ff"+
		"\5\24\13\2\u00ff\u0100\b\13\1\2\u0100\u0122\3\2\2\2\u0101\u0102\7\u01f6"+
		"\2\2\u0102\u0103\5\24\13\2\u0103\u0104\7\u01f9\2\2\u0104\u0105\b\13\1"+
		"\2\u0105\u0122\3\2\2\2\u0106\u0107\5$\23\2\u0107\u0108\b\13\1\2\u0108"+
		"\u0122\3\2\2\2\u0109\u010a\5*\26\2\u010a\u010b\b\13\1\2\u010b\u0122\3"+
		"\2\2\2\u010c\u010d\5\"\22\2\u010d\u010e\b\13\1\2\u010e\u0122\3\2\2\2\u010f"+
		"\u0110\5 \21\2\u0110\u0111\b\13\1\2\u0111\u0122\3\2\2\2\u0112\u0113\5"+
		"\30\r\2\u0113\u0114\b\13\1\2\u0114\u0122\3\2\2\2\u0115\u0116\5\34\17\2"+
		"\u0116\u0117\b\13\1\2\u0117\u0122\3\2\2\2\u0118\u0119\5\32\16\2\u0119"+
		"\u011a\b\13\1\2\u011a\u0122\3\2\2\2\u011b\u011c\5&\24\2\u011c\u011d\b"+
		"\13\1\2\u011d\u0122\3\2\2\2\u011e\u011f\5\26\f\2\u011f\u0120\b\13\1\2"+
		"\u0120\u0122\3\2\2\2\u0121\u00f7\3\2\2\2\u0121\u00fa\3\2\2\2\u0121\u00fd"+
		"\3\2\2\2\u0121\u0101\3\2\2\2\u0121\u0106\3\2\2\2\u0121\u0109\3\2\2\2\u0121"+
		"\u010c\3\2\2\2\u0121\u010f\3\2\2\2\u0121\u0112\3\2\2\2\u0121\u0115\3\2"+
		"\2\2\u0121\u0118\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0122"+
		"\25\3\2\2\2\u0123\u0124\b\f\1\2\u0124\u0125\7\26\2\2\u0125\u0126\7\u01f6"+
		"\2\2\u0126\u012b\5\24\13\2\u0127\u0128\7\u01e8\2\2\u0128\u012a\5\24\13"+
		"\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\u01f9\2"+
		"\2\u012f\u0130\b\f\1\2\u0130\u0145\3\2\2\2\u0131\u0132\b\f\1\2\u0132\u0133"+
		"\7\u00f1\2\2\u0133\u0134\7\u01f6\2\2\u0134\u0135\5\24\13\2\u0135\u0136"+
		"\7\u01e8\2\2\u0136\u013e\5\24\13\2\u0137\u0138\7\u01e8\2\2\u0138\u0139"+
		"\5\24\13\2\u0139\u013a\7\u01e8\2\2\u013a\u013b\5\24\13\2\u013b\u013d\3"+
		"\2\2\2\u013c\u0137\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\u01f9"+
		"\2\2\u0142\u0143\b\f\1\2\u0143\u0145\3\2\2\2\u0144\u0123\3\2\2\2\u0144"+
		"\u0131\3\2\2\2\u0145\27\3\2\2\2\u0146\u0147\7\31\2\2\u0147\u0148\7\u01f6"+
		"\2\2\u0148\u0149\5\24\13\2\u0149\u014a\7\u01f9\2\2\u014a\u014b\b\r\1\2"+
		"\u014b\u0348\3\2\2\2\u014c\u014d\7 \2\2\u014d\u014e\7\u01f6\2\2\u014e"+
		"\u014f\5\24\13\2\u014f\u0150\7\u01f9\2\2\u0150\u0151\b\r\1\2\u0151\u0348"+
		"\3\2\2\2\u0152\u0153\7\65\2\2\u0153\u0154\7\u01f6\2\2\u0154\u0155\5\24"+
		"\13\2\u0155\u0156\7\u01f9\2\2\u0156\u0157\b\r\1\2\u0157\u0348\3\2\2\2"+
		"\u0158\u0159\7\67\2\2\u0159\u015a\7\u01f6\2\2\u015a\u015b\5\24\13\2\u015b"+
		"\u015c\7\u01f9\2\2\u015c\u015d\b\r\1\2\u015d\u0348\3\2\2\2\u015e\u015f"+
		"\b\r\1\2\u015f\u0160\7F\2\2\u0160\u0161\7\u01f6\2\2\u0161\u0164\5\24\13"+
		"\2\u0162\u0163\7\u01e8\2\2\u0163\u0165\5\24\13\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0169\7\u01f9\2\2\u0169\u016a\b\r\1\2\u016a\u0348\3\2\2\2\u016b"+
		"\u016c\b\r\1\2\u016c\u016d\7G\2\2\u016d\u016e\7\u01f6\2\2\u016e\u016f"+
		"\5\24\13\2\u016f\u0170\7\u01e8\2\2\u0170\u0173\5\24\13\2\u0171\u0172\7"+
		"\u01e8\2\2\u0172\u0174\5\24\13\2\u0173\u0171\3\2\2\2\u0174\u0175\3\2\2"+
		"\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178"+
		"\7\u01f9\2\2\u0178\u0179\b\r\1\2\u0179\u0348\3\2\2\2\u017a\u017b\7h\2"+
		"\2\u017b\u017c\7\u01f6\2\2\u017c\u017d\5\24\13\2\u017d\u017e\7\u01e8\2"+
		"\2\u017e\u017f\5\24\13\2\u017f\u0180\7\u01f9\2\2\u0180\u0181\b\r\1\2\u0181"+
		"\u0348\3\2\2\2\u0182\u0183\b\r\1\2\u0183\u0184\7\u0081\2\2\u0184\u0185"+
		"\7\u01f6\2\2\u0185\u0186\5\24\13\2\u0186\u0187\7\u01e8\2\2\u0187\u018c"+
		"\5\24\13\2\u0188\u0189\7\u01e8\2\2\u0189\u018b\5\24\13\2\u018a\u0188\3"+
		"\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\u01f9\2\2\u0190\u0191"+
		"\b\r\1\2\u0191\u0348\3\2\2\2\u0192\u0193\7\u0083\2\2\u0193\u0194\7\u01f6"+
		"\2\2\u0194\u0195\5\24\13\2\u0195\u0196\7\u01e8\2\2\u0196\u0197\5\24\13"+
		"\2\u0197\u0198\7\u01f9\2\2\u0198\u0199\b\r\1\2\u0199\u0348\3\2\2\2\u019a"+
		"\u019b\b\r\1\2\u019b\u019c\7\u0094\2\2\u019c\u019d\7\u01f6\2\2\u019d\u019e"+
		"\5\24\13\2\u019e\u019f\7\u01e8\2\2\u019f\u01a4\5\24\13\2\u01a0\u01a1\7"+
		"\u01e8\2\2\u01a1\u01a3\5\24\13\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3\2\2"+
		"\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a7\u01a8\7\u01f9\2\2\u01a8\u01a9\b\r\1\2\u01a9\u0348\3\2\2"+
		"\2\u01aa\u01ab\7\u0096\2\2\u01ab\u01ac\7\u01f6\2\2\u01ac\u01ad\5\24\13"+
		"\2\u01ad\u01ae\7\u01e8\2\2\u01ae\u01af\5\24\13\2\u01af\u01b0\7\u01f9\2"+
		"\2\u01b0\u01b1\b\r\1\2\u01b1\u0348\3\2\2\2\u01b2\u01b3\7\u009e\2\2\u01b3"+
		"\u01b4\7\u01f6\2\2\u01b4\u01b5\5\24\13\2\u01b5\u01b6\7\u01e8\2\2\u01b6"+
		"\u01b7\5\24\13\2\u01b7\u01b8\7\u01f9\2\2\u01b8\u01b9\b\r\1\2\u01b9\u0348"+
		"\3\2\2\2\u01ba\u01bb\7\u00a5\2\2\u01bb\u01bc\7\u01f6\2\2\u01bc\u01bd\5"+
		"\24\13\2\u01bd\u01be\7\u01e8\2\2\u01be\u01bf\5\24\13\2\u01bf\u01c0\7\u01f9"+
		"\2\2\u01c0\u01c1\b\r\1\2\u01c1\u0348\3\2\2\2\u01c2\u01c3\7\u00ba\2\2\u01c3"+
		"\u01c4\7\u01f6\2\2\u01c4\u01c5\5\24\13\2\u01c5\u01c6\7\u01e8\2\2\u01c6"+
		"\u01c7\5\24\13\2\u01c7\u01c8\7\u01f9\2\2\u01c8\u01c9\b\r\1\2\u01c9\u0348"+
		"\3\2\2\2\u01ca\u01cb\7\u00c1\2\2\u01cb\u01cc\7\u01f6\2\2\u01cc\u01cd\5"+
		"\24\13\2\u01cd\u01ce\7\u01e8\2\2\u01ce\u01cf\5\24\13\2\u01cf\u01d0\7\u01f9"+
		"\2\2\u01d0\u01d1\b\r\1\2\u01d1\u0348\3\2\2\2\u01d2\u01d3\7\u00db\2\2\u01d3"+
		"\u01d4\7\u01f6\2\2\u01d4\u01d5\5\24\13\2\u01d5\u01d6\7\u01f9\2\2\u01d6"+
		"\u01d7\b\r\1\2\u01d7\u0348\3\2\2\2\u01d8\u01d9\7\u00e1\2\2\u01d9\u01da"+
		"\7\u01f6\2\2\u01da\u01db\5\24\13\2\u01db\u01dc\7\u01e8\2\2\u01dc\u01dd"+
		"\5\24\13\2\u01dd\u01de\7\u01f9\2\2\u01de\u01df\b\r\1\2\u01df\u0348\3\2"+
		"\2\2\u01e0\u01e1\7\u00e1\2\2\u01e1\u01e2\7\u01f6\2\2\u01e2\u01e3\5\24"+
		"\13\2\u01e3\u01e4\7\u01e8\2\2\u01e4\u01e5\5\24\13\2\u01e5\u01e6\7\u01e8"+
		"\2\2\u01e6\u01e7\5\24\13\2\u01e7\u01e8\7\u01f9\2\2\u01e8\u01e9\b\r\1\2"+
		"\u01e9\u0348\3\2\2\2\u01ea\u01eb\t\n\2\2\u01eb\u01ec\7\u01f6\2\2\u01ec"+
		"\u01ed\5\24\13\2\u01ed\u01ee\7\u01f9\2\2\u01ee\u01ef\b\r\1\2\u01ef\u0348"+
		"\3\2\2\2\u01f0\u01f1\7\u00ee\2\2\u01f1\u01f2\7\u01f6\2\2\u01f2\u01f3\5"+
		"\24\13\2\u01f3\u01f4\7\u01e8\2\2\u01f4\u01f5\5\24\13\2\u01f5\u01f6\7\u01e8"+
		"\2\2\u01f6\u01f7\5\24\13\2\u01f7\u01f8\7\u01f9\2\2\u01f8\u01f9\b\r\1\2"+
		"\u01f9\u0348\3\2\2\2\u01fa\u01fb\7\u00f0\2\2\u01fb\u01fc\7\u01f6\2\2\u01fc"+
		"\u01fd\5\24\13\2\u01fd\u01fe\7\u01f9\2\2\u01fe\u01ff\b\r\1\2\u01ff\u0348"+
		"\3\2\2\2\u0200\u0201\7\u0117\2\2\u0201\u0202\7\u01f6\2\2\u0202\u0203\5"+
		"\24\13\2\u0203\u0204\7\u01f9\2\2\u0204\u0205\b\r\1\2\u0205\u0348\3\2\2"+
		"\2\u0206\u0207\7\u0124\2\2\u0207\u0208\7\u01f6\2\2\u0208\u0209\5\24\13"+
		"\2\u0209\u020a\7\u01e8\2\2\u020a\u020b\5\24\13\2\u020b\u020c\7\u01f9\2"+
		"\2\u020c\u020d\b\r\1\2\u020d\u0348\3\2\2\2\u020e\u020f\7\u0124\2\2\u020f"+
		"\u0210\7\u01f6\2\2\u0210\u0211\5\24\13\2\u0211\u0212\7\u01e8\2\2\u0212"+
		"\u0213\5\24\13\2\u0213\u0214\7\u01e8\2\2\u0214\u0215\5\24\13\2\u0215\u0216"+
		"\7\u01f9\2\2\u0216\u0217\b\r\1\2\u0217\u0348\3\2\2\2\u0218\u0219\b\r\1"+
		"\2\u0219\u021a\7\u0133\2\2\u021a\u021b\7\u01f6\2\2\u021b\u021c\5\24\13"+
		"\2\u021c\u021d\7\u01e8\2\2\u021d\u0220\5\24\13\2\u021e\u021f\7\u01e8\2"+
		"\2\u021f\u0221\5\24\13\2\u0220\u021e\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\7\u01f9"+
		"\2\2\u0225\u0226\b\r\1\2\u0226\u0348\3\2\2\2\u0227\u0228\7\u013a\2\2\u0228"+
		"\u0229\7\u01f6\2\2\u0229\u022a\5\24\13\2\u022a\u022b\7\u01f9\2\2\u022b"+
		"\u022c\b\r\1\2\u022c\u0348\3\2\2\2\u022d\u022e\7\u0142\2\2\u022e\u022f"+
		"\7\u01f6\2\2\u022f\u0230\5\24\13\2\u0230\u0231\7\u01e8\2\2\u0231\u0232"+
		"\5\24\13\2\u0232\u0233\7\u01e8\2\2\u0233\u0234\5\24\13\2\u0234\u0235\7"+
		"\u01f9\2\2\u0235\u0236\b\r\1\2\u0236\u0348\3\2\2\2\u0237\u0238\7\u0143"+
		"\2\2\u0238\u0239\7\u01f6\2\2\u0239\u023a\5\24\13\2\u023a\u023b\7\u01e8"+
		"\2\2\u023b\u023c\5\24\13\2\u023c\u023d\7\u01e8\2\2\u023d\u023e\5\24\13"+
		"\2\u023e\u023f\7\u01f9\2\2\u023f\u0240\b\r\1\2\u0240\u0348\3\2\2\2\u0241"+
		"\u0242\7\u014d\2\2\u0242\u0243\7\u01f6\2\2\u0243\u0244\5\24\13\2\u0244"+
		"\u0245\7\u01e8\2\2\u0245\u0246\5\24\13\2\u0246\u0247\7\u01f9\2\2\u0247"+
		"\u0248\b\r\1\2\u0248\u0348\3\2\2\2\u0249\u024a\7\u014e\2\2\u024a\u024b"+
		"\7\u01f6\2\2\u024b\u024c\5\24\13\2\u024c\u024d\7\u01e8\2\2\u024d\u024e"+
		"\5\24\13\2\u024e\u024f\7\u01e8\2\2\u024f\u0250\5\24\13\2\u0250\u0251\7"+
		"\u01f9\2\2\u0251\u0252\b\r\1\2\u0252\u0348\3\2\2\2\u0253\u0254\7\u0155"+
		"\2\2\u0254\u0255\7\u01f6\2\2\u0255\u0256\5\24\13\2\u0256\u0257\7\u01f9"+
		"\2\2\u0257\u0258\b\r\1\2\u0258\u0348\3\2\2\2\u0259\u025a\7\u015f\2\2\u025a"+
		"\u025b\7\u01f6\2\2\u025b\u025c\5\24\13\2\u025c\u025d\7\u01e8\2\2\u025d"+
		"\u025e\5\24\13\2\u025e\u025f\7\u01e8\2\2\u025f\u0260\5\24\13\2\u0260\u0261"+
		"\7\u01f9\2\2\u0261\u0262\b\r\1\2\u0262\u0348\3\2\2\2\u0263\u0264\7\u0162"+
		"\2\2\u0264\u0265\7\u01f6\2\2\u0265\u0266\5\24\13\2\u0266\u0267\7\u01f9"+
		"\2\2\u0267\u0268\b\r\1\2\u0268\u0348\3\2\2\2\u0269\u026a\7\u016c\2\2\u026a"+
		"\u026b\7\u01f6\2\2\u026b\u026c\5\24\13\2\u026c\u026d\7\u01e8\2\2\u026d"+
		"\u026e\5\24\13\2\u026e\u026f\7\u01e8\2\2\u026f\u0270\5\24\13\2\u0270\u0271"+
		"\7\u01f9\2\2\u0271\u0272\b\r\1\2\u0272\u0348\3\2\2\2\u0273\u0274\7\u017a"+
		"\2\2\u0274\u0275\7\u01f6\2\2\u0275\u0276\5\24\13\2\u0276\u0277\7\u01f9"+
		"\2\2\u0277\u0278\b\r\1\2\u0278\u0348\3\2\2\2\u0279\u027a\7\u017b\2\2\u027a"+
		"\u027b\7\u01f6\2\2\u027b\u027c\5\24\13\2\u027c\u027d\7\u01e8\2\2\u027d"+
		"\u027e\5\24\13\2\u027e\u027f\7\u01f9\2\2\u027f\u0280\b\r\1\2\u0280\u0348"+
		"\3\2\2\2\u0281\u0282\7\u018a\2\2\u0282\u0283\7\u01f6\2\2\u0283\u0284\5"+
		"\24\13\2\u0284\u0285\7\u01f9\2\2\u0285\u0286\b\r\1\2\u0286\u0348\3\2\2"+
		"\2\u0287\u0288\7\u018a\2\2\u0288\u0289\7\u01f6\2\2\u0289\u028a\5\24\13"+
		"\2\u028a\u028b\7\u01e8\2\2\u028b\u028c\5\24\13\2\u028c\u028d\7\u01f9\2"+
		"\2\u028d\u028e\b\r\1\2\u028e\u0348\3\2\2\2\u028f\u0290\7\u018a\2\2\u0290"+
		"\u0291\7\u01f6\2\2\u0291\u0292\5\24\13\2\u0292\u0293\7\u01e8\2\2\u0293"+
		"\u0294\5\24\13\2\u0294\u0295\7\u01e8\2\2\u0295\u0296\5\24\13\2\u0296\u0297"+
		"\7\u01f9\2\2\u0297\u0298\b\r\1\2\u0298\u0348\3\2\2\2\u0299\u029a\t\13"+
		"\2\2\u029a\u029b\7\u01f6\2\2\u029b\u029c\5\24\13\2\u029c\u029d\7\u01e8"+
		"\2\2\u029d\u029e\5\24\13\2\u029e\u029f\7\u01f9\2\2\u029f\u02a0\b\r\1\2"+
		"\u02a0\u0348\3\2\2\2\u02a1\u02a2\t\13\2\2\u02a2\u02a3\7\u01f6\2\2\u02a3"+
		"\u02a4\5\24\13\2\u02a4\u02a5\7\u01e8\2\2\u02a5\u02a6\5\24\13\2\u02a6\u02a7"+
		"\7\u01e8\2\2\u02a7\u02a8\5\24\13\2\u02a8\u02a9\7\u01f9\2\2\u02a9\u02aa"+
		"\b\r\1\2\u02aa\u0348\3\2\2\2\u02ab\u02ac\7\u018e\2\2\u02ac\u02ad\7\u01f6"+
		"\2\2\u02ad\u02ae\5\24\13\2\u02ae\u02af\7\u01e8\2\2\u02af\u02b0\5\24\13"+
		"\2\u02b0\u02b1\7\u01e8\2\2\u02b1\u02b2\5\24\13\2\u02b2\u02b3\7\u01f9\2"+
		"\2\u02b3\u02b4\b\r\1\2\u02b4\u0348\3\2\2\2\u02b5\u02b6\7\u01a0\2\2\u02b6"+
		"\u02b7\7\u01f6\2\2\u02b7\u02b8\5\24\13\2\u02b8\u02b9\7\u01e8\2\2\u02b9"+
		"\u02ba\5\24\13\2\u02ba\u02bb\7\u01e8\2\2\u02bb\u02bc\5\24\13\2\u02bc\u02bd"+
		"\7\u01f9\2\2\u02bd\u02be\b\r\1\2\u02be\u0348\3\2\2\2\u02bf\u02c0\7\u0164"+
		"\2\2\u02c0\u02c1\7\u01f6\2\2\u02c1\u02c2\5\24\13\2\u02c2\u02c3\7\u01f9"+
		"\2\2\u02c3\u02c4\b\r\1\2\u02c4\u0348\3\2\2\2\u02c5\u02c6\7\u01a6\2\2\u02c6"+
		"\u02c7\7\u01f6\2\2\u02c7\u02c8\5\24\13\2\u02c8\u02c9\7\u01f9\2\2\u02c9"+
		"\u02ca\b\r\1\2\u02ca\u0348\3\2\2\2\u02cb\u02cc\t\f\2\2\u02cc\u02cd\7\u01f6"+
		"\2\2\u02cd\u02ce\5\24\13\2\u02ce\u02cf\7\u01f9\2\2\u02cf\u02d0\b\r\1\2"+
		"\u02d0\u0348\3\2\2\2\u02d1\u02d2\7\u00bb\2\2\u02d2\u02d3\7\u01f6\2\2\u02d3"+
		"\u02d4\5\24\13\2\u02d4\u02d5\7\u01f9\2\2\u02d5\u02d6\b\r\1\2\u02d6\u0348"+
		"\3\2\2\2\u02d7\u02d8\7\u00dc\2\2\u02d8\u02d9\7\u01f6\2\2\u02d9\u02da\5"+
		"\24\13\2\u02da\u02db\7\u01e8\2\2\u02db\u02dc\5\24\13\2\u02dc\u02dd\7\u01f9"+
		"\2\2\u02dd\u02de\b\r\1\2\u02de\u0348\3\2\2\2\u02df\u02e0\7\u0179\2\2\u02e0"+
		"\u02e1\7\u01f6\2\2\u02e1\u02e2\5\24\13\2\u02e2\u02e3\7\u01f9\2\2\u02e3"+
		"\u02e4\b\r\1\2\u02e4\u0348\3\2\2\2\u02e5\u02e6\7\u00f2\2\2\u02e6\u02e7"+
		"\7\u01f6\2\2\u02e7\u02e8\5\24\13\2\u02e8\u02e9\7\u01f9\2\2\u02e9\u02ea"+
		"\b\r\1\2\u02ea\u0348\3\2\2\2\u02eb\u02ec\7\u00f2\2\2\u02ec\u02ed\7\u01f6"+
		"\2\2\u02ed\u02ee\5\24\13\2\u02ee\u02ef\7\u01e8\2\2\u02ef\u02f0\5\24\13"+
		"\2\u02f0\u02f1\7\u01f9\2\2\u02f1\u02f2\b\r\1\2\u02f2\u0348\3\2\2\2\u02f3"+
		"\u02f4\7\u00f2\2\2\u02f4\u02f5\7\u01f6\2\2\u02f5\u02f6\5\24\13\2\u02f6"+
		"\u02f7\7\u01e8\2\2\u02f7\u02f8\5\24\13\2\u02f8\u02f9\7\u01e8\2\2\u02f9"+
		"\u02fa\5\24\13\2\u02fa\u02fb\7\u01f9\2\2\u02fb\u02fc\b\r\1\2\u02fc\u0348"+
		"\3\2\2\2\u02fd\u02fe\7\u00f2\2\2\u02fe\u02ff\7\u01f6\2\2\u02ff\u0300\5"+
		"\24\13\2\u0300\u0301\7\u01e8\2\2\u0301\u0302\5\24\13\2\u0302\u0303\7\u01e8"+
		"\2\2\u0303\u0304\5\24\13\2\u0304\u0305\7\u01e8\2\2\u0305\u0306\5\24\13"+
		"\2\u0306\u0307\7\u01f9\2\2\u0307\u0308\b\r\1\2\u0308\u0348\3\2\2\2\u0309"+
		"\u030a\7\u00f3\2\2\u030a\u030b\7\u01f6\2\2\u030b\u030c\5\24\13\2\u030c"+
		"\u030d\7\u01f9\2\2\u030d\u030e\b\r\1\2\u030e\u0348\3\2\2\2\u030f\u0310"+
		"\7\u00f3\2\2\u0310\u0311\7\u01f6\2\2\u0311\u0312\5\24\13\2\u0312\u0313"+
		"\7\u01e8\2\2\u0313\u0314\5\24\13\2\u0314\u0315\7\u01f9\2\2\u0315\u0316"+
		"\b\r\1\2\u0316\u0348\3\2\2\2\u0317\u0318\7\u00f5\2\2\u0318\u0319\7\u01f6"+
		"\2\2\u0319\u031a\5\24\13\2\u031a\u031b\7\u01f9\2\2\u031b\u031c\b\r\1\2"+
		"\u031c\u0348\3\2\2\2\u031d\u031e\7\u00f5\2\2\u031e\u031f\7\u01f6\2\2\u031f"+
		"\u0320\5\24\13\2\u0320\u0321\7\u01e8\2\2\u0321\u0322\5\24\13\2\u0322\u0323"+
		"\7\u01f9\2\2\u0323\u0324\b\r\1\2\u0324\u0348\3\2\2\2\u0325\u0326\7\u00f6"+
		"\2\2\u0326\u0327\7\u01f6\2\2\u0327\u0328\5\24\13\2\u0328\u0329\7\u01f9"+
		"\2\2\u0329\u032a\b\r\1\2\u032a\u0348\3\2\2\2\u032b\u032c\7\u00f6\2\2\u032c"+
		"\u032d\7\u01f6\2\2\u032d\u032e\5\24\13\2\u032e\u032f\7\u01e8\2\2\u032f"+
		"\u0330\5\24\13\2\u0330\u0331\7\u01f9\2\2\u0331\u0332\b\r\1\2\u0332\u0348"+
		"\3\2\2\2\u0333\u0334\7\u00f7\2\2\u0334\u0335\7\u01f6\2\2\u0335\u0336\5"+
		"\24\13\2\u0336\u0337\7\u01f9\2\2\u0337\u0338\b\r\1\2\u0338\u0348\3\2\2"+
		"\2\u0339\u033a\7\u00f7\2\2\u033a\u033b\7\u01f6\2\2\u033b\u033c\5\24\13"+
		"\2\u033c\u033d\7\u01e8\2\2\u033d\u033e\5\24\13\2\u033e\u033f\7\u01f9\2"+
		"\2\u033f\u0340\b\r\1\2\u0340\u0348\3\2\2\2\u0341\u0342\7\u00f4\2\2\u0342"+
		"\u0343\7\u01f6\2\2\u0343\u0344\5\24\13\2\u0344\u0345\7\u01f9\2\2\u0345"+
		"\u0346\b\r\1\2\u0346\u0348\3\2\2\2\u0347\u0146\3\2\2\2\u0347\u014c\3\2"+
		"\2\2\u0347\u0152\3\2\2\2\u0347\u0158\3\2\2\2\u0347\u015e\3\2\2\2\u0347"+
		"\u016b\3\2\2\2\u0347\u017a\3\2\2\2\u0347\u0182\3\2\2\2\u0347\u0192\3\2"+
		"\2\2\u0347\u019a\3\2\2\2\u0347\u01aa\3\2\2\2\u0347\u01b2\3\2\2\2\u0347"+
		"\u01ba\3\2\2\2\u0347\u01c2\3\2\2\2\u0347\u01ca\3\2\2\2\u0347\u01d2\3\2"+
		"\2\2\u0347\u01d8\3\2\2\2\u0347\u01e0\3\2\2\2\u0347\u01ea\3\2\2\2\u0347"+
		"\u01f0\3\2\2\2\u0347\u01fa\3\2\2\2\u0347\u0200\3\2\2\2\u0347\u0206\3\2"+
		"\2\2\u0347\u020e\3\2\2\2\u0347\u0218\3\2\2\2\u0347\u0227\3\2\2\2\u0347"+
		"\u022d\3\2\2\2\u0347\u0237\3\2\2\2\u0347\u0241\3\2\2\2\u0347\u0249\3\2"+
		"\2\2\u0347\u0253\3\2\2\2\u0347\u0259\3\2\2\2\u0347\u0263\3\2\2\2\u0347"+
		"\u0269\3\2\2\2\u0347\u0273\3\2\2\2\u0347\u0279\3\2\2\2\u0347\u0281\3\2"+
		"\2\2\u0347\u0287\3\2\2\2\u0347\u028f\3\2\2\2\u0347\u0299\3\2\2\2\u0347"+
		"\u02a1\3\2\2\2\u0347\u02ab\3\2\2\2\u0347\u02b5\3\2\2\2\u0347\u02bf\3\2"+
		"\2\2\u0347\u02c5\3\2\2\2\u0347\u02cb\3\2\2\2\u0347\u02d1\3\2\2\2\u0347"+
		"\u02d7\3\2\2\2\u0347\u02df\3\2\2\2\u0347\u02e5\3\2\2\2\u0347\u02eb\3\2"+
		"\2\2\u0347\u02f3\3\2\2\2\u0347\u02fd\3\2\2\2\u0347\u0309\3\2\2\2\u0347"+
		"\u030f\3\2\2\2\u0347\u0317\3\2\2\2\u0347\u031d\3\2\2\2\u0347\u0325\3\2"+
		"\2\2\u0347\u032b\3\2\2\2\u0347\u0333\3\2\2\2\u0347\u0339\3\2\2\2\u0347"+
		"\u0341\3\2\2\2\u0348\31\3\2\2\2\u0349\u034a\b\16\1\2\u034a\u034b\7\u00d1"+
		"\2\2\u034b\u034c\7\u01f6\2\2\u034c\u034d\5\24\13\2\u034d\u034e\7\u01e8"+
		"\2\2\u034e\u0353\5\24\13\2\u034f\u0350\7\u01e8\2\2\u0350\u0352\5\24\13"+
		"\2\u0351\u034f\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354"+
		"\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0353\3\2\2\2\u0356\u0357\7\u01f9\2"+
		"\2\u0357\u0358\b\16\1\2\u0358\u03ae\3\2\2\2\u0359\u035a\b\16\1\2\u035a"+
		"\u035b\7\u0140\2\2\u035b\u035c\7\u01f6\2\2\u035c\u035d\5\24\13\2\u035d"+
		"\u035e\7\u01e8\2\2\u035e\u0363\5\24\13\2\u035f\u0360\7\u01e8\2\2\u0360"+
		"\u0362\5\24\13\2\u0361\u035f\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3"+
		"\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0363\3\2\2\2\u0366"+
		"\u0367\7\u01f9\2\2\u0367\u0368\b\16\1\2\u0368\u03ae\3\2\2\2\u0369\u036a"+
		"\b\16\1\2\u036a\u036b\7\u00ab\2\2\u036b\u036c\7\u01f6\2\2\u036c\u0371"+
		"\5\24\13\2\u036d\u036e\7\u01e8\2\2\u036e\u0370\5\24\13\2\u036f\u036d\3"+
		"\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0374\3\2\2\2\u0373\u0371\3\2\2\2\u0374\u0375\7\u01f9\2\2\u0375\u0376"+
		"\b\16\1\2\u0376\u03ae\3\2\2\2\u0377\u0378\7\u01d0\2\2\u0378\u0379\7\u01f6"+
		"\2\2\u0379\u037a\7\u01f9\2\2\u037a\u03ae\b\16\1\2\u037b\u037c\7\u00ea"+
		"\2\2\u037c\u037d\7\u01f6\2\2\u037d\u037e\7\u01f9\2\2\u037e\u03ae\b\16"+
		"\1\2\u037f\u0380\7Z\2\2\u0380\u0381\7\u01f6\2\2\u0381\u0382\7\u01f9\2"+
		"\2\u0382\u03ae\b\16\1\2\u0383\u0384\t\r\2\2\u0384\u0385\7\u01f6\2\2\u0385"+
		"\u0386\5\24\13\2\u0386\u0387\7\u01f9\2\2\u0387\u0388\b\16\1\2\u0388\u03ae"+
		"\3\2\2\2\u0389\u038a\7\u0171\2\2\u038a\u038b\7\u01f6\2\2\u038b\u038c\5"+
		"\24\13\2\u038c\u038d\7\u01e8\2\2\u038d\u038e\5\24\13\2\u038e\u038f\7\u01f9"+
		"\2\2\u038f\u0390\b\16\1\2\u0390\u03ae\3\2\2\2\u0391\u0392\7\21\2\2\u0392"+
		"\u0393\7\u01f6\2\2\u0393\u0394\5\24\13\2\u0394\u0395\7\u01e8\2\2\u0395"+
		"\u0396\5\24\13\2\u0396\u0397\7\u01f9\2\2\u0397\u0398\b\16\1\2\u0398\u03ae"+
		"\3\2\2\2\u0399\u039a\7\22\2\2\u039a\u039b\7\u01f6\2\2\u039b\u039c\5\24"+
		"\13\2\u039c\u039d\7\u01e8\2\2\u039d\u039e\5\24\13\2\u039e\u039f\7\u01f9"+
		"\2\2\u039f\u03a0\b\16\1\2\u03a0\u03ae\3\2\2\2\u03a1\u03a2\7\u01b6\2\2"+
		"\u03a2\u03a3\7\u01f6\2\2\u03a3\u03a4\7\u01f9\2\2\u03a4\u03ae\b\16\1\2"+
		"\u03a5\u03a6\t\16\2\2\u03a6\u03a7\7\u01f6\2\2\u03a7\u03a8\5\24\13\2\u03a8"+
		"\u03a9\7\u01e8\2\2\u03a9\u03aa\5\24\13\2\u03aa\u03ab\7\u01f9\2\2\u03ab"+
		"\u03ac\b\16\1\2\u03ac\u03ae\3\2\2\2\u03ad\u0349\3\2\2\2\u03ad\u0359\3"+
		"\2\2\2\u03ad\u0369\3\2\2\2\u03ad\u0377\3\2\2\2\u03ad\u037b\3\2\2\2\u03ad"+
		"\u037f\3\2\2\2\u03ad\u0383\3\2\2\2\u03ad\u0389\3\2\2\2\u03ad\u0391\3\2"+
		"\2\2\u03ad\u0399\3\2\2\2\u03ad\u03a1\3\2\2\2\u03ad\u03a5\3\2\2\2\u03ae"+
		"\33\3\2\2\2\u03af\u03b0\b\17\1\2\u03b0\u03b3\5\36\20\2\u03b1\u03b2\7\u01e9"+
		"\2\2\u03b2\u03b4\5\36\20\2\u03b3\u03b1\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5"+
		"\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\b\17"+
		"\1\2\u03b8\35\3\2\2\2\u03b9\u03ba\5,\27\2\u03ba\u03bb\b\20\1\2\u03bb\u03da"+
		"\3\2\2\2\u03bc\u03bd\5.\30\2\u03bd\u03be\b\20\1\2\u03be\u03da\3\2\2\2"+
		"\u03bf\u03c0\7\u01f6\2\2\u03c0\u03c1\5\24\13\2\u03c1\u03c2\7\u01f9\2\2"+
		"\u03c2\u03c3\b\20\1\2\u03c3\u03da\3\2\2\2\u03c4\u03c5\5$\23\2\u03c5\u03c6"+
		"\b\20\1\2\u03c6\u03da\3\2\2\2\u03c7\u03c8\5*\26\2\u03c8\u03c9\b\20\1\2"+
		"\u03c9\u03da\3\2\2\2\u03ca\u03cb\5\"\22\2\u03cb\u03cc\b\20\1\2\u03cc\u03da"+
		"\3\2\2\2\u03cd\u03ce\5 \21\2\u03ce\u03cf\b\20\1\2\u03cf\u03da\3\2\2\2"+
		"\u03d0\u03d1\5\30\r\2\u03d1\u03d2\b\20\1\2\u03d2\u03da\3\2\2\2\u03d3\u03d4"+
		"\5\32\16\2\u03d4\u03d5\b\20\1\2\u03d5\u03da\3\2\2\2\u03d6\u03d7\5&\24"+
		"\2\u03d7\u03d8\b\20\1\2\u03d8\u03da\3\2\2\2\u03d9\u03b9\3\2\2\2\u03d9"+
		"\u03bc\3\2\2\2\u03d9\u03bf\3\2\2\2\u03d9\u03c4\3\2\2\2\u03d9\u03c7\3\2"+
		"\2\2\u03d9\u03ca\3\2\2\2\u03d9\u03cd\3\2\2\2\u03d9\u03d0\3\2\2\2\u03d9"+
		"\u03d3\3\2\2\2\u03d9\u03d6\3\2\2\2\u03da\37\3\2\2\2\u03db\u03dc\7\u00b4"+
		"\2\2\u03dc\u03dd\7\u01f6\2\2\u03dd\u03de\5\24\13\2\u03de\u03df\7\u01e8"+
		"\2\2\u03df\u03e0\5\24\13\2\u03e0\u03e1\7\u01e8\2\2\u03e1\u03e2\5\24\13"+
		"\2\u03e2\u03e3\7\u01f9\2\2\u03e3\u03e4\b\21\1\2\u03e4\u0457\3\2\2\2\u03e5"+
		"\u03e6\7\u00cd\2\2\u03e6\u03e7\7\u01f6\2\2\u03e7\u03e8\5\24\13\2\u03e8"+
		"\u03e9\7\u01f9\2\2\u03e9\u03ea\b\21\1\2\u03ea\u0457\3\2\2\2\u03eb\u03ec"+
		"\7\u00cc\2\2\u03ec\u03ed\7\u01f6\2\2\u03ed\u03ee\5\24\13\2\u03ee\u03ef"+
		"\7\u01f9\2\2\u03ef\u03f0\b\21\1\2\u03f0\u0457\3\2\2\2\u03f1\u03f2\7\u00ce"+
		"\2\2\u03f2\u03f3\7\u01f6\2\2\u03f3\u03f4\5\24\13\2\u03f4\u03f5\7\u01e8"+
		"\2\2\u03f5\u03f6\5\24\13\2\u03f6\u03f7\7\u01f9\2\2\u03f7\u03f8\b\21\1"+
		"\2\u03f8\u0457\3\2\2\2\u03f9\u03fa\b\21\1\2\u03fa\u03fb\7<\2\2\u03fb\u03fc"+
		"\7\u01f6\2\2\u03fc\u03fd\5\24\13\2\u03fd\u03fe\7\u01e8\2\2\u03fe\u03ff"+
		"\5\24\13\2\u03ff\u0404\3\2\2\2\u0400\u0401\7\u01e8\2\2\u0401\u0403\5\24"+
		"\13\2\u0402\u0400\3\2\2\2\u0403\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0407\3\2\2\2\u0406\u0404\3\2\2\2\u0407\u0408\7\u01f9"+
		"\2\2\u0408\u0409\b\21\1\2\u0409\u0457\3\2\2\2\u040a\u040b\b\21\1\2\u040b"+
		"\u040c\7.\2\2\u040c\u0412\5\24\13\2\u040d\u040e\7\u01b9\2\2\u040e\u040f"+
		"\5\24\13\2\u040f\u0410\7\u0198\2\2\u0410\u0411\5\24\13\2\u0411\u0413\3"+
		"\2\2\2\u0412\u040d\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0412\3\2\2\2\u0414"+
		"\u0415\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\7\u0084\2\2\u0417\u0418"+
		"\b\21\1\2\u0418\u0457\3\2\2\2\u0419\u041a\b\21\1\2\u041a\u041b\7.\2\2"+
		"\u041b\u0421\5\24\13\2\u041c\u041d\7\u01b9\2\2\u041d\u041e\5\24\13\2\u041e"+
		"\u041f\7\u0198\2\2\u041f\u0420\5\24\13\2\u0420\u0422\3\2\2\2\u0421\u041c"+
		"\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424"+
		"\u0425\3\2\2\2\u0425\u0426\7~\2\2\u0426\u0427\5\24\13\2\u0427\u0428\7"+
		"\u0084\2\2\u0428\u0429\b\21\1\2\u0429\u0457\3\2\2\2\u042a\u042b\b\21\1"+
		"\2\u042b\u0431\7.\2\2\u042c\u042d\7\u01b9\2\2\u042d\u042e\5\24\13\2\u042e"+
		"\u042f\7\u0198\2\2\u042f\u0430\5\24\13\2\u0430\u0432\3\2\2\2\u0431\u042c"+
		"\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434"+
		"\u0435\3\2\2\2\u0435\u0436\7\u0084\2\2\u0436\u0437\b\21\1\2\u0437\u0457"+
		"\3\2\2\2\u0438\u0439\b\21\1\2\u0439\u043f\7.\2\2\u043a\u043b\7\u01b9\2"+
		"\2\u043b\u043c\5\24\13\2\u043c\u043d\7\u0198\2\2\u043d\u043e\5\24\13\2"+
		"\u043e\u0440\3\2\2\2\u043f\u043a\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u043f"+
		"\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\7~\2\2\u0444"+
		"\u0445\5\24\13\2\u0445\u0446\7\u0084\2\2\u0446\u0447\b\21\1\2\u0447\u0457"+
		"\3\2\2\2\u0448\u0449\7\u0113\2\2\u0449\u044a\7\u01f6\2\2\u044a\u044b\5"+
		"\24\13\2\u044b\u044c\7\u01e8\2\2\u044c\u044d\5\24\13\2\u044d\u044e\7\u01f9"+
		"\2\2\u044e\u044f\b\21\1\2\u044f\u0457\3\2\2\2\u0450\u0451\7\33\2\2\u0451"+
		"\u0452\7\u01f6\2\2\u0452\u0453\5\24\13\2\u0453\u0454\7\u01f9\2\2\u0454"+
		"\u0455\b\21\1\2\u0455\u0457\3\2\2\2\u0456\u03db\3\2\2\2\u0456\u03e5\3"+
		"\2\2\2\u0456\u03eb\3\2\2\2\u0456\u03f1\3\2\2\2\u0456\u03f9\3\2\2\2\u0456"+
		"\u040a\3\2\2\2\u0456\u0419\3\2\2\2\u0456\u042a\3\2\2\2\u0456\u0438\3\2"+
		"\2\2\u0456\u0448\3\2\2\2\u0456\u0450\3\2\2\2\u0457!\3\2\2\2\u0458\u0459"+
		"\7\u01aa\2\2\u0459\u045a\7\u01f6\2\2\u045a\u045b\7\u01f9\2\2\u045b\u0509"+
		"\b\22\1\2\u045c\u045d\7\u01aa\2\2\u045d\u045e\7\u01f6\2\2\u045e\u045f"+
		"\5\24\13\2\u045f\u0460\7\u01f9\2\2\u0460\u0461\b\22\1\2\u0461\u0509\3"+
		"\2\2\2\u0462\u0463\7\u01aa\2\2\u0463\u0464\7\u01f6\2\2\u0464\u0465\5\24"+
		"\13\2\u0465\u0466\7\u01e8\2\2\u0466\u0467\5\24\13\2\u0467\u0468\7\u01f9"+
		"\2\2\u0468\u0469\b\22\1\2\u0469\u0509\3\2\2\2\u046a\u046b\7\u01ca\2\2"+
		"\u046b\u046c\7\u01f6\2\2\u046c\u046d\5\24\13\2\u046d\u046e\7\u01f9\2\2"+
		"\u046e\u046f\b\22\1\2\u046f\u0509\3\2\2\2\u0470\u0471\7\u0137\2\2\u0471"+
		"\u0472\7\u01f6\2\2\u0472\u0473\5\24\13\2\u0473\u0474\7\u01f9\2\2\u0474"+
		"\u0475\b\22\1\2\u0475\u0509\3\2\2\2\u0476\u0477\7\u0102\2\2\u0477\u0478"+
		"\7\u01f6\2\2\u0478\u0479\5\24\13\2\u0479\u047a\7\u01f9\2\2\u047a\u047b"+
		"\b\22\1\2\u047b\u0509\3\2\2\2\u047c\u047d\7d\2\2\u047d\u047e\7\u01f6\2"+
		"\2\u047e\u047f\5\24\13\2\u047f\u0480\7\u01f9\2\2\u0480\u0481\b\22\1\2"+
		"\u0481\u0509\3\2\2\2\u0482\u0483\7\u00b2\2\2\u0483\u0484\7\u01f6\2\2\u0484"+
		"\u0485\5\24\13\2\u0485\u0486\7\u01f9\2\2\u0486\u0487\b\22\1\2\u0487\u0509"+
		"\3\2\2\2\u0488\u0489\7\u0101\2\2\u0489\u048a\7\u01f6\2\2\u048a\u048b\5"+
		"\24\13\2\u048b\u048c\7\u01f9\2\2\u048c\u048d\b\22\1\2\u048d\u0509\3\2"+
		"\2\2\u048e\u048f\7\u0166\2\2\u048f\u0490\7\u01f6\2\2\u0490\u0491\5\24"+
		"\13\2\u0491\u0492\7\u01f9\2\2\u0492\u0493\b\22\1\2\u0493\u0509\3\2\2\2"+
		"\u0494\u0495\7\u01b8\2\2\u0495\u0496\7\u01f6\2\2\u0496\u0497\5\24\13\2"+
		"\u0497\u0498\7\u01f9\2\2\u0498\u0499\b\22\1\2\u0499\u0509\3\2\2\2\u049a"+
		"\u049b\7`\2\2\u049b\u049c\7\u01f6\2\2\u049c\u049d\5\24\13\2\u049d\u049e"+
		"\7\u01e8\2\2\u049e\u049f\5\24\13\2\u049f\u04a0\7\u01f9\2\2\u04a0\u04a1"+
		"\b\22\1\2\u04a1\u0509\3\2\2\2\u04a2\u04a3\7_\2\2\u04a3\u04a4\7\u01f6\2"+
		"\2\u04a4\u04a5\5\24\13\2\u04a5\u04a6\7\u01e8\2\2\u04a6\u04a7\5\24\13\2"+
		"\u04a7\u04a8\7\u01f9\2\2\u04a8\u04a9\b\22\1\2\u04a9\u0509\3\2\2\2\u04aa"+
		"\u04ab\7b\2\2\u04ab\u04ac\7\u01f6\2\2\u04ac\u04ad\5\24\13\2\u04ad\u04ae"+
		"\7\u01e8\2\2\u04ae\u04af\5\24\13\2\u04af\u04b0\7\u01f9\2\2\u04b0\u04b1"+
		"\b\22\1\2\u04b1\u0509\3\2\2\2\u04b2\u04b3\7\u019e\2\2\u04b3\u04b4\7\u01f6"+
		"\2\2\u04b4\u04b5\5\24\13\2\u04b5\u04b6\7\u01e8\2\2\u04b6\u04b7\5\24\13"+
		"\2\u04b7\u04b8\7\u01f9\2\2\u04b8\u04b9\b\22\1\2\u04b9\u0509\3\2\2\2\u04ba"+
		"\u04bb\7\u00a1\2\2\u04bb\u04bc\7\u01f6\2\2\u04bc\u04bd\5\24\13\2\u04bd"+
		"\u04be\7\u01e8\2\2\u04be\u04bf\5\24\13\2\u04bf\u04c0\7\u01f9\2\2\u04c0"+
		"\u04c1\b\22\1\2\u04c1\u0509\3\2\2\2\u04c2\u04c5\7\u01ce\2\2\u04c3\u04c4"+
		"\7\u01f6\2\2\u04c4\u04c6\7\u01f9\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3"+
		"\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u0509\b\22\1\2\u04c8\u04cb\7\u01cf\2"+
		"\2\u04c9\u04ca\7\u01f6\2\2\u04ca\u04cc\7\u01f9\2\2\u04cb\u04c9\3\2\2\2"+
		"\u04cb\u04cc\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u0509\b\22\1\2\u04ce\u04cf"+
		"\7\20\2\2\u04cf\u04d0\7\u01f6\2\2\u04d0\u04d1\5\24\13\2\u04d1\u04d2\7"+
		"\u01e8\2\2\u04d2\u04d3\5\24\13\2\u04d3\u04d4\7\u01f9\2\2\u04d4\u04d5\b"+
		"\22\1\2\u04d5\u0509\3\2\2\2\u04d6\u04d7\7\20\2\2\u04d7\u04d8\7\u01f6\2"+
		"\2\u04d8\u04d9\5\24\13\2\u04d9\u04da\7\u01e8\2\2\u04da\u04db\5\24\13\2"+
		"\u04db\u04dc\7\u01e8\2\2\u04dc\u04dd\5\24\13\2\u04dd\u04de\7\u01f9\2\2"+
		"\u04de\u04df\b\22\1\2\u04df\u0509\3\2\2\2\u04e0\u04e1\7\u00d7\2\2\u04e1"+
		"\u04e2\7\u01f6\2\2\u04e2\u04e3\5\24\13\2\u04e3\u04e4\7\u01f9\2\2\u04e4"+
		"\u04e5\b\22\1\2\u04e5\u0509\3\2\2\2\u04e6\u04e7\7\u0107\2\2\u04e7\u04e8"+
		"\7\u01f6\2\2\u04e8\u04e9\5\24\13\2\u04e9\u04ea\7\u01e8\2\2\u04ea\u04eb"+
		"\5\24\13\2\u04eb\u04ec\7\u01f9\2\2\u04ec\u04ed\b\22\1\2\u04ed\u0509\3"+
		"\2\2\2\u04ee\u04ef\7\u01a3\2\2\u04ef\u04f0\7\u01f6\2\2\u04f0\u04f1\5\24"+
		"\13\2\u04f1\u04f2\7\u01e8\2\2\u04f2\u04f3\5\24\13\2\u04f3\u04f4\7\u01f9"+
		"\2\2\u04f4\u04f5\b\22\1\2\u04f5\u0509\3\2\2\2\u04f6\u04f7\7\u0103\2\2"+
		"\u04f7\u04f8\7\u01f6\2\2\u04f8\u04f9\5\24\13\2\u04f9\u04fa\7\u01e8\2\2"+
		"\u04fa\u04fb\5\24\13\2\u04fb\u04fc\7\u01f9\2\2\u04fc\u04fd\b\22\1\2\u04fd"+
		"\u0509\3\2\2\2\u04fe\u04ff\7a\2\2\u04ff\u0500\7\u01f6\2\2\u0500\u0501"+
		"\5\24\13\2\u0501\u0502\7\u01e8\2\2\u0502\u0503\5\24\13\2\u0503\u0504\7"+
		"\u01f9\2\2\u0504\u0505\b\22\1\2\u0505\u0509\3\2\2\2\u0506\u0507\7\u01e1"+
		"\2\2\u0507\u0509\b\22\1\2\u0508\u0458\3\2\2\2\u0508\u045c\3\2\2\2\u0508"+
		"\u0462\3\2\2\2\u0508\u046a\3\2\2\2\u0508\u0470\3\2\2\2\u0508\u0476\3\2"+
		"\2\2\u0508\u047c\3\2\2\2\u0508\u0482\3\2\2\2\u0508\u0488\3\2\2\2\u0508"+
		"\u048e\3\2\2\2\u0508\u0494\3\2\2\2\u0508\u049a\3\2\2\2\u0508\u04a2\3\2"+
		"\2\2\u0508\u04aa\3\2\2\2\u0508\u04b2\3\2\2\2\u0508\u04ba\3\2\2\2\u0508"+
		"\u04c2\3\2\2\2\u0508\u04c8\3\2\2\2\u0508\u04ce\3\2\2\2\u0508\u04d6\3\2"+
		"\2\2\u0508\u04e0\3\2\2\2\u0508\u04e6\3\2\2\2\u0508\u04ee\3\2\2\2\u0508"+
		"\u04f6\3\2\2\2\u0508\u04fe\3\2\2\2\u0508\u0506\3\2\2\2\u0509#\3\2\2\2"+
		"\u050a\u050b\7/\2\2\u050b\u050c\7\u01f6\2\2\u050c\u050d\5\24\13\2\u050d"+
		"\u050e\7\27\2\2\u050e\u0510\5\6\4\2\u050f\u0511\5\b\5\2\u0510\u050f\3"+
		"\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\7\u01f9\2\2"+
		"\u0513\u0514\b\23\1\2\u0514\u051c\3\2\2\2\u0515\u0516\7%\2\2\u0516\u0517"+
		"\7\u01f6\2\2\u0517\u0518\5\24\13\2\u0518\u0519\7\u01f9\2\2\u0519\u051a"+
		"\b\23\1\2\u051a\u051c\3\2\2\2\u051b\u050a\3\2\2\2\u051b\u0515\3\2\2\2"+
		"\u051c%\3\2\2\2\u051d\u051e\7O\2\2\u051e\u051f\7\u01f6\2\2\u051f\u0520"+
		"\5\24\13\2\u0520\u0521\7\u01f9\2\2\u0521\u0522\b\24\1\2\u0522\u0596\3"+
		"\2\2\2\u0523\u0524\b\24\1\2\u0524\u0525\7O\2\2\u0525\u0526\7\u01f6\2\2"+
		"\u0526\u0527\7x\2\2\u0527\u052c\5\24\13\2\u0528\u0529\7\u01e8\2\2\u0529"+
		"\u052b\5\24\13\2\u052a\u0528\3\2\2\2\u052b\u052e\3\2\2\2\u052c\u052a\3"+
		"\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2\2\2\u052e\u052c\3\2\2\2\u052f"+
		"\u0530\7\u01f9\2\2\u0530\u0531\b\24\1\2\u0531\u0596\3\2\2\2\u0532\u0533"+
		"\7O\2\2\u0533\u0534\7\u01f6\2\2\u0534\u0535\7\u01f4\2\2\u0535\u0536\7"+
		"\u01f9\2\2\u0536\u0596\b\24\1\2\u0537\u0538\7\u018f\2\2\u0538\u0539\7"+
		"\u01f6\2\2\u0539\u053a\5\24\13\2\u053a\u053b\7\u01f9\2\2\u053b\u053c\b"+
		"\24\1\2\u053c\u0596\3\2\2\2\u053d\u053e\7\u018f\2\2\u053e\u053f\7\u01f6"+
		"\2\2\u053f\u0540\7x\2\2\u0540\u0541\5\24\13\2\u0541\u0542\7\u01f9\2\2"+
		"\u0542\u0543\b\24\1\2\u0543\u0596\3\2\2\2\u0544\u0545\7\37\2\2\u0545\u0546"+
		"\7\u01f6\2\2\u0546\u0547\5\24\13\2\u0547\u0548\7\u01f9\2\2\u0548\u0549"+
		"\b\24\1\2\u0549\u0596\3\2\2\2\u054a\u054b\7\37\2\2\u054b\u054c\7\u01f6"+
		"\2\2\u054c\u054d\7x\2\2\u054d\u054e\5\24\13\2\u054e\u054f\7\u01f9\2\2"+
		"\u054f\u0550\b\24\1\2\u0550\u0596\3\2\2\2\u0551\u0552\t\17\2\2\u0552\u0553"+
		"\7\u01f6\2\2\u0553\u0554\5\24\13\2\u0554\u0555\7\u01f9\2\2\u0555\u0556"+
		"\b\24\1\2\u0556\u0596\3\2\2\2\u0557\u0558\t\20\2\2\u0558\u0559\7\u01f6"+
		"\2\2\u0559\u055a\5\24\13\2\u055a\u055b\7\u01e8\2\2\u055b\u055c\5\24\13"+
		"\2\u055c\u055d\7\u01f9\2\2\u055d\u055e\b\24\1\2\u055e\u0596\3\2\2\2\u055f"+
		"\u0560\7\u0128\2\2\u0560\u0561\7\u01f6\2\2\u0561\u0562\5\24\13\2\u0562"+
		"\u0563\7\u01e8\2\2\u0563\u0564\5\24\13\2\u0564\u0565\7\u01f9\2\2\u0565"+
		"\u0566\b\24\1\2\u0566\u0596\3\2\2\2\u0567\u0568\7\u0129\2\2\u0568\u0569"+
		"\7\u01f6\2\2\u0569\u056a\5\24\13\2\u056a\u056b\7\u01e8\2\2\u056b\u056c"+
		"\5\24\13\2\u056c\u056d\7\u01f9\2\2\u056d\u056e\b\24\1\2\u056e\u0596\3"+
		"\2\2\2\u056f\u0570\7\u0129\2\2\u0570\u0571\7\u01f6\2\2\u0571\u0572\5\24"+
		"\13\2\u0572\u0573\7\u01e8\2\2\u0573\u0574\5\24\13\2\u0574\u0575\7\u01e8"+
		"\2\2\u0575\u0576\5\24\13\2\u0576\u0577\7\u01f9\2\2\u0577\u0578\b\24\1"+
		"\2\u0578\u0596\3\2\2\2\u0579\u057a\t\21\2\2\u057a\u057b\7\u01f6\2\2\u057b"+
		"\u057c\5\24\13\2\u057c\u057d\7\u01e8\2\2\u057d\u057e\5\24\13\2\u057e\u057f"+
		"\7\u01f9\2\2\u057f\u0580\b\24\1\2\u0580\u0596\3\2\2\2\u0581\u0582\7\u00af"+
		"\2\2\u0582\u0583\7\u01f6\2\2\u0583\u0584\5\24\13\2\u0584\u0585\7\u01e8"+
		"\2\2\u0585\u0586\5\24\13\2\u0586\u0587\7\u01f9\2\2\u0587\u0588\b\24\1"+
		"\2\u0588\u0596\3\2\2\2\u0589\u058a\t\22\2\2\u058a\u058b\7\u01f6\2\2\u058b"+
		"\u058c\5\24\13\2\u058c\u058d\7\u01f9\2\2\u058d\u058e\b\24\1\2\u058e\u0596"+
		"\3\2\2\2\u058f\u0590\7\u0111\2\2\u0590\u0591\7\u01f6\2\2\u0591\u0592\5"+
		"\24\13\2\u0592\u0593\7\u01f9\2\2\u0593\u0594\b\24\1\2\u0594\u0596\3\2"+
		"\2\2\u0595\u051d\3\2\2\2\u0595\u0523\3\2\2\2\u0595\u0532\3\2\2\2\u0595"+
		"\u0537\3\2\2\2\u0595\u053d\3\2\2\2\u0595\u0544\3\2\2\2\u0595\u054a\3\2"+
		"\2\2\u0595\u0551\3\2\2\2\u0595\u0557\3\2\2\2\u0595\u055f\3\2\2\2\u0595"+
		"\u0567\3\2\2\2\u0595\u056f\3\2\2\2\u0595\u0579\3\2\2\2\u0595\u0581\3\2"+
		"\2\2\u0595\u0589\3\2\2\2\u0595\u058f\3\2\2\2\u0596\'\3\2\2\2\u0597\u0598"+
		"\7\u008f\2\2\u0598\u0599\7\u01f6\2\2\u0599\u059a\5\24\13\2\u059a\u059b"+
		"\7\u01f9\2\2\u059b\u059c\b\25\1\2\u059c\u05aa\3\2\2\2\u059d\u059e\7\u012d"+
		"\2\2\u059e\u059f\7\u01f6\2\2\u059f\u05a0\5\24\13\2\u05a0\u05a1\7\u01f9"+
		"\2\2\u05a1\u05a2\b\25\1\2\u05a2\u05aa\3\2\2\2\u05a3\u05a4\7\u00bd\2\2"+
		"\u05a4\u05a5\7\u01f6\2\2\u05a5\u05a6\5\24\13\2\u05a6\u05a7\7\u01f9\2\2"+
		"\u05a7\u05a8\b\25\1\2\u05a8\u05aa\3\2\2\2\u05a9\u0597\3\2\2\2\u05a9\u059d"+
		"\3\2\2\2\u05a9\u05a3\3\2\2\2\u05aa)\3\2\2\2\u05ab\u05ac\7\u015a\2\2\u05ac"+
		"\u05ad\7\u01f6\2\2\u05ad\u05ae\5\24\13\2\u05ae\u05af\7\u01f9\2\2\u05af"+
		"\u05b0\b\26\1\2\u05b0\u067e\3\2\2\2\u05b1\u05b2\7\u015a\2\2\u05b2\u05b3"+
		"\7\u01f6\2\2\u05b3\u05b4\5\24\13\2\u05b4\u05b5\7\u01e8\2\2\u05b5\u05b6"+
		"\5\24\13\2\u05b6\u05b7\7\u01f9\2\2\u05b7\u05b8\b\26\1\2\u05b8\u067e\3"+
		"\2\2\2\u05b9\u05ba\7\u009a\2\2\u05ba\u05bb\7\u01f6\2\2\u05bb\u05bc\5\24"+
		"\13\2\u05bc\u05bd\7\u01f9\2\2\u05bd\u05be\b\26\1\2\u05be\u067e\3\2\2\2"+
		"\u05bf\u05c0\t\23\2\2\u05c0\u05c1\7\u01f6\2\2\u05c1\u05c2\5\24\13\2\u05c2"+
		"\u05c3\7\u01f9\2\2\u05c3\u05c4\b\26\1\2\u05c4\u067e\3\2\2\2\u05c5\u05c6"+
		"\7\u013d\2\2\u05c6\u05c7\7\u01f6\2\2\u05c7\u05c8\7\u01f9\2\2\u05c8\u067e"+
		"\b\26\1\2\u05c9\u05ca\7\u013d\2\2\u05ca\u05cb\7\u01f6\2\2\u05cb\u05cc"+
		"\5\24\13\2\u05cc\u05cd\7\u01f9\2\2\u05cd\u05ce\b\26\1\2\u05ce\u067e\3"+
		"\2\2\2\u05cf\u05d0\7\u008e\2\2\u05d0\u05d1\7\u01f6\2\2\u05d1\u05d2\5\24"+
		"\13\2\u05d2\u05d3\7\u01f9\2\2\u05d3\u05d4\b\26\1\2\u05d4\u067e\3\2\2\2"+
		"\u05d5\u05d6\7\u00ef\2\2\u05d6\u05d7\7\u01f6\2\2\u05d7\u05d8\5\24\13\2"+
		"\u05d8\u05d9\7\u01f9\2\2\u05d9\u05da\b\26\1\2\u05da\u067e\3\2\2\2\u05db"+
		"\u05dc\7\u00e7\2\2\u05dc\u05dd\7\u01f6\2\2\u05dd\u05de\5\24\13\2\u05de"+
		"\u05df\7\u01f9\2\2\u05df\u05e0\b\26\1\2\u05e0\u067e\3\2\2\2\u05e1\u05e2"+
		"\7\u00e8\2\2\u05e2\u05e3\7\u01f6\2\2\u05e3\u05e4\5\24\13\2\u05e4\u05e5"+
		"\7\u01f9\2\2\u05e5\u05e6\b\26\1\2\u05e6\u067e\3\2\2\2\u05e7\u05e8\7\u00e6"+
		"\2\2\u05e8\u05e9\7\u01f6\2\2\u05e9\u05ea\5\24\13\2\u05ea\u05eb\7\u01e8"+
		"\2\2\u05eb\u05ec\5\24\13\2\u05ec\u05ed\7\u01f9\2\2\u05ed\u05ee\b\26\1"+
		"\2\u05ee\u067e\3\2\2\2\u05ef\u05f0\t\24\2\2\u05f0\u05f1\7\u01f6\2\2\u05f1"+
		"\u05f2\5\24\13\2\u05f2\u05f3\7\u01e8\2\2\u05f3\u05f4\5\24\13\2\u05f4\u05f5"+
		"\7\u01f9\2\2\u05f5\u05f6\b\26\1\2\u05f6\u067e\3\2\2\2\u05f7\u05f8\7\u0181"+
		"\2\2\u05f8\u05f9\7\u01f6\2\2\u05f9\u05fa\5\24\13\2\u05fa\u05fb\7\u01f9"+
		"\2\2\u05fb\u05fc\b\26\1\2\u05fc\u067e\3\2\2\2\u05fd\u05fe\7$\2\2\u05fe"+
		"\u05ff\7\u01f6\2\2\u05ff\u0600\5\24\13\2\u0600\u0601\7\u01f9\2\2\u0601"+
		"\u0602\b\26\1\2\u0602\u067e\3\2\2\2\u0603\u0604\7\u00ae\2\2\u0604\u0605"+
		"\7\u01f6\2\2\u0605\u0606\5\24\13\2\u0606\u0607\7\u01f9\2\2\u0607\u0608"+
		"\b\26\1\2\u0608\u067e\3\2\2\2\u0609\u060a\7\u01a7\2\2\u060a\u060b\7\u01f6"+
		"\2\2\u060b\u060c\5\24\13\2\u060c\u060d\7\u01f9\2\2\u060d\u060e\b\26\1"+
		"\2\u060e\u067e\3\2\2\2\u060f\u0610\7K\2\2\u0610\u0611\7\u01f6\2\2\u0611"+
		"\u0612\5\24\13\2\u0612\u0613\7\u01e8\2\2\u0613\u0614\5\24\13\2\u0614\u0615"+
		"\7\u01e8\2\2\u0615\u0616\5\24\13\2\u0616\u0617\7\u01f9\2\2\u0617\u0618"+
		"\b\26\1\2\u0618\u067e\3\2\2\2\u0619\u061a\7\16\2\2\u061a\u061b\7\u01f6"+
		"\2\2\u061b\u061c\5\24\13\2\u061c\u061d\7\u01f9\2\2\u061d\u061e\b\26\1"+
		"\2\u061e\u067e\3\2\2\2\u061f\u0620\7\u012b\2\2\u0620\u0621\7\u01f6\2\2"+
		"\u0621\u0622\5\24\13\2\u0622\u0623\7\u01e8\2\2\u0623\u0624\5\24\13\2\u0624"+
		"\u0625\7\u01f9\2\2\u0625\u0626\b\26\1\2\u0626\u067e\3\2\2\2\u0627\u0628"+
		"\7\u0173\2\2\u0628\u0629\7\u01f6\2\2\u0629\u062a\5\24\13\2\u062a\u062b"+
		"\7\u01f9\2\2\u062b\u062c\b\26\1\2\u062c\u067e\3\2\2\2\u062d\u062e\7\32"+
		"\2\2\u062e\u062f\7\u01f6\2\2\u062f\u0630\5\24\13\2\u0630\u0631\7\u01f9"+
		"\2\2\u0631\u0632\b\26\1\2\u0632\u067e\3\2\2\2\u0633\u0634\7N\2\2\u0634"+
		"\u0635\7\u01f6\2\2\u0635\u0636\5\24\13\2\u0636\u0637\7\u01f9\2\2\u0637"+
		"\u0638\b\26\1\2\u0638\u067e\3\2\2\2\u0639\u063a\7\17\2\2\u063a\u063b\7"+
		"\u01f6\2\2\u063b\u063c\5\24\13\2\u063c\u063d\7\u01f9\2\2\u063d\u063e\b"+
		"\26\1\2\u063e\u067e\3\2\2\2\u063f\u0640\7\u0194\2\2\u0640\u0641\7\u01f6"+
		"\2\2\u0641\u0642\5\24\13\2\u0642\u0643\7\u01f9\2\2\u0643\u0644\b\26\1"+
		"\2\u0644\u067e\3\2\2\2\u0645\u0646\7\35\2\2\u0646\u0647\7\u01f6\2\2\u0647"+
		"\u0648\5\24\13\2\u0648\u0649\7\u01f9\2\2\u0649\u064a\b\26\1\2\u064a\u067e"+
		"\3\2\2\2\u064b\u064c\7o\2\2\u064c\u064d\7\u01f6\2\2\u064d\u064e\5\24\13"+
		"\2\u064e\u064f\7\u01f9\2\2\u064f\u0650\b\26\1\2\u0650\u067e\3\2\2\2\u0651"+
		"\u0652\7\u013b\2\2\u0652\u0653\7\u01f6\2\2\u0653\u0654\5\24\13\2\u0654"+
		"\u0655\7\u01f9\2\2\u0655\u0656\b\26\1\2\u0656\u067e\3\2\2\2\u0657\u0658"+
		"\7\u012c\2\2\u0658\u0659\7\u01f6\2\2\u0659\u065a\5\24\13\2\u065a\u065b"+
		"\7\u01f9\2\2\u065b\u065c\b\26\1\2\u065c\u067e\3\2\2\2\u065d\u065e\7\u0106"+
		"\2\2\u065e\u065f\7\u01f6\2\2\u065f\u0660\5\24\13\2\u0660\u0661\7\u01f9"+
		"\2\2\u0661\u0662\b\26\1\2\u0662\u067e\3\2\2\2\u0663\u0664\7\u0172\2\2"+
		"\u0664\u0665\7\u01f6\2\2\u0665\u0666\5\24\13\2\u0666\u0667\7\u01f9\2\2"+
		"\u0667\u0668\b\26\1\2\u0668\u067e\3\2\2\2\u0669\u066a\7\b\2\2\u066a\u066b"+
		"\7\u01f6\2\2\u066b\u066c\7\u01f9\2\2\u066c\u067e\b\26\1\2\u066d\u066e"+
		"\7\t\2\2\u066e\u066f\7\u01f6\2\2\u066f\u0670\7\u01f9\2\2\u0670\u067e\b"+
		"\26\1\2\u0671\u0672\7\u0090\2\2\u0672\u0673\7\u01f6\2\2\u0673\u0674\5"+
		"\24\13\2\u0674\u0675\7\u01f9\2\2\u0675\u0676\b\26\1\2\u0676\u067e\3\2"+
		"\2\2\u0677\u0678\7\60\2\2\u0678\u0679\7\u01f6\2\2\u0679\u067a\5\24\13"+
		"\2\u067a\u067b\7\u01f9\2\2\u067b\u067c\b\26\1\2\u067c\u067e\3\2\2\2\u067d"+
		"\u05ab\3\2\2\2\u067d\u05b1\3\2\2\2\u067d\u05b9\3\2\2\2\u067d\u05bf\3\2"+
		"\2\2\u067d\u05c5\3\2\2\2\u067d\u05c9\3\2\2\2\u067d\u05cf\3\2\2\2\u067d"+
		"\u05d5\3\2\2\2\u067d\u05db\3\2\2\2\u067d\u05e1\3\2\2\2\u067d\u05e7\3\2"+
		"\2\2\u067d\u05ef\3\2\2\2\u067d\u05f7\3\2\2\2\u067d\u05fd\3\2\2\2\u067d"+
		"\u0603\3\2\2\2\u067d\u0609\3\2\2\2\u067d\u060f\3\2\2\2\u067d\u0619\3\2"+
		"\2\2\u067d\u061f\3\2\2\2\u067d\u0627\3\2\2\2\u067d\u062d\3\2\2\2\u067d"+
		"\u0633\3\2\2\2\u067d\u0639\3\2\2\2\u067d\u063f\3\2\2\2\u067d\u0645\3\2"+
		"\2\2\u067d\u064b\3\2\2\2\u067d\u0651\3\2\2\2\u067d\u0657\3\2\2\2\u067d"+
		"\u065d\3\2\2\2\u067d\u0663\3\2\2\2\u067d\u0669\3\2\2\2\u067d\u066d\3\2"+
		"\2\2\u067d\u0671\3\2\2\2\u067d\u0677\3\2\2\2\u067e+\3\2\2\2\u067f\u0680"+
		"\7\u0200\2\2\u0680\u0690\b\27\1\2\u0681\u0682\7\u01ff\2\2\u0682\u0690"+
		"\b\27\1\2\u0683\u0684\7\u01fe\2\2\u0684\u0690\b\27\1\2\u0685\u0686\7\r"+
		"\2\2\u0686\u0690\b\27\1\2\u0687\u0688\7\f\2\2\u0688\u0690\b\27\1\2\u0689"+
		"\u068a\5\60\31\2\u068a\u068b\b\27\1\2\u068b\u0690\3\2\2\2\u068c\u068d"+
		"\5\62\32\2\u068d\u068e\b\27\1\2\u068e\u0690\3\2\2\2\u068f\u067f\3\2\2"+
		"\2\u068f\u0681\3\2\2\2\u068f\u0683\3\2\2\2\u068f\u0685\3\2\2\2\u068f\u0687"+
		"\3\2\2\2\u068f\u0689\3\2\2\2\u068f\u068c\3\2\2\2\u0690-\3\2\2\2\u0691"+
		"\u0692\7\u01fd\2\2\u0692\u0694\7\n\2\2\u0693\u0691\3\2\2\2\u0693\u0694"+
		"\3\2\2\2\u0694\u0697\3\2\2\2\u0695\u0696\7\u01fd\2\2\u0696\u0698\7\n\2"+
		"\2\u0697\u0695\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069a"+
		"\7\u01fd\2\2\u069a\u069b\b\30\1\2\u069b/\3\2\2\2\u069c\u069d\7^\2\2\u069d"+
		"\u069e\7\u0200\2\2\u069e\u069f\b\31\1\2\u069f\61\3\2\2\2\u06a0\u06a1\7"+
		"\u0199\2\2\u06a1\u06a2\7\u0200\2\2\u06a2\u06a3\b\32\1\2\u06a3\63\3\2\2"+
		"\2\u06a4\u06ab\7\u00cb\2\2\u06a5\u06a6\7\u00cb\2\2\u06a6\u06ab\7\u010f"+
		"\2\2\u06a7\u06ab\7\u00b7\2\2\u06a8\u06a9\7\u010f\2\2\u06a9\u06ab\7\u00b7"+
		"\2\2\u06aa\u06a4\3\2\2\2\u06aa\u06a5\3\2\2\2\u06aa\u06a7\3\2\2\2\u06aa"+
		"\u06a8\3\2\2\2\u06ab\65\3\2\2\2\u06ac\u06ad\t\25\2\2\u06ad\67\3\2\2\2"+
		"/BX\u0091\u0095\u009a\u009e\u00af\u00b8\u00c0\u00f5\u0121\u012b\u013e"+
		"\u0144\u0166\u0175\u018c\u01a4\u0222\u0347\u0353\u0363\u0371\u03ad\u03b5"+
		"\u03d9\u0404\u0414\u0423\u0433\u0441\u0456\u04c5\u04cb\u0508\u0510\u051b"+
		"\u052c\u0595\u05a9\u067d\u068f\u0693\u0697\u06aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}