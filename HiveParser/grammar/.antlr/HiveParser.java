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
		T__9=10, NULL_CONST=11, BOOL_LITERAL=12, T_ABS=13, T_ACOS=14, T_ADD_MONTHS=15, 
		T_AES_ENCRYPT=16, T_AES_DECRYPT=17, T_ALL=18, T_ALTER=19, T_AND=20, T_ARRAY=21, 
		T_AS=22, T_ASC=23, T_ASCII=24, T_ASIN=25, T_ASSERT_TRUE=26, T_AT=27, T_ATAN=28, 
		T_AUTO_INCREMENT=29, T_AVG=30, T_BASE64=31, T_BEGIN=32, T_BETWEEN=33, 
		T_BIGINT=34, T_BIN=35, T_BINARY=36, T_BIT=37, T_BODY=38, T_BREAK=39, T_BY=40, 
		T_BYTE=41, T_CALL=42, T_CALLER=43, T_CASCADE=44, T_CASE=45, T_CAST=46, 
		T_CBR=47, T_CEIL=48, T_CEILING=49, T_CHAR=50, T_CHARACTER=51, T_CHARACTER_LENGTH=52, 
		T_CHARSET=53, T_CHR=54, T_CLIENT=55, T_CLOSE=56, T_CLUSTERED=57, T_CMP=58, 
		T_COALESCE=59, T_COLLECT=60, T_COLLECT_SET=61, T_COLLECT_LIST=62, T_COLLECTION=63, 
		T_COLUMN=64, T_COMMENT=65, T_CONSTANT=66, T_COMMIT=67, T_COMPRESS=68, 
		T_CONCAT=69, T_CONCAT_WS=70, T_CONDITION=71, T_CONSTRAINT=72, T_CONTINUE=73, 
		T_CONV=74, T_COPY=75, T_CORR=76, T_COS=77, T_COUNT=78, T_COUNT_BIG=79, 
		T_COVAR_POP=80, T_COVAR_SAMP=81, T_CRC32=82, T_CREATE=83, T_CREATION=84, 
		T_CREATOR=85, T_CROSS=86, T_CS=87, T_CURRENT=88, T_CURRENT_SCHEMA=89, 
		T_CURRENT_DATABASE=90, T_CURSOR=91, T_DATABASE=92, T_DATE=93, T_DATEADD=94, 
		T_DATEDIFF=95, T_DATE_FORMAT=96, T_DATESUB=97, T_DATETIME=98, T_DAY=99, 
		T_DAYS=100, T_DEC=101, T_DECIMAL=102, T_DECODE=103, T_DECLARE=104, T_DEFAULT=105, 
		T_DEFERRED=106, T_DEFINED=107, T_DEFINER=108, T_DEFINITION=109, T_DEGREES=110, 
		T_DELETE=111, T_DELIMITED=112, T_DELIMITER=113, T_DESC=114, T_DESCRIBE=115, 
		T_DIAGNOSTICS=116, T_DIR=117, T_DIRECTORY=118, T_DISTINCT=119, T_DISTRIBUTE=120, 
		T_DO=121, T_DOUBLE=122, T_DROP=123, T_DYNAMIC=124, T_ELSE=125, T_ELSEIF=126, 
		T_ELSIF=127, T_ELT=128, T_ENABLE=129, T_ENCODE=130, T_END=131, T_ENGINE=132, 
		T_ESCAPED=133, T_EXCEPT=134, T_EXEC=135, T_EXECUTE=136, T_EXCEPTION=137, 
		T_EXCLUSIVE=138, T_EXISTS=139, T_EXIT=140, T_EXP=141, T_EXPLODE=142, T_FACTORIAL=143, 
		T_FALLBACK=144, T_FALSE=145, T_FETCH=146, T_FIELD=147, T_FIELDS=148, T_FIELD_IN_SET=149, 
		T_FILE=150, T_FILES=151, T_FLOAT=152, T_FLOOR=153, T_FOR=154, T_FOREIGN=155, 
		T_FORMAT=156, T_FORMAT_NUMBER=157, T_FOUND=158, T_FROM=159, T_FROMUTCTIMESTAMP=160, 
		T_FULL=161, T_FUNCTION=162, T_GET=163, T_GET_JSON_OBJECTS=164, T_GLOBAL=165, 
		T_GO=166, T_GRANT=167, T_GROUP=168, T_HANDLER=169, T_HASH=170, T_HAVING=171, 
		T_HDFS=172, T_HEX=173, T_HISTOGRAM_NUMERIC=174, T_HIVE=175, T_HOST=176, 
		T_HOUR=177, T_IDENTITY=178, T_IF=179, T_IGNORE=180, T_IMMEDIATE=181, T_IN=182, 
		T_INCLUDE=183, T_INDEX=184, T_IN_FILE=185, T_INITCAP=186, T_INITRANS=187, 
		T_INLINE=188, T_INNER=189, T_INOUT=190, T_INSERT=191, T_IN_STR=192, T_INT=193, 
		T_INT2=194, T_INT4=195, T_INT8=196, T_INTEGER=197, T_INTERSECT=198, T_INTERVAL=199, 
		T_INTO=200, T_INVOKER=201, T_IS=202, T_ISNOTNULL=203, T_ISNULL=204, T_NVL=205, 
		T_ISOPEN=206, T_ITEMS=207, T_JAVA_METHOD=208, T_JOIN=209, T_KEEP=210, 
		T_KEY=211, T_KEYS=212, T_LANGUAGE=213, T_LASTDAY=214, T_LCASE=215, T_LEAVE=216, 
		T_LEFT=217, T_LENGTH=218, T_LEVENSHTEIN=219, T_LIKE=220, T_LIMIT=221, 
		T_LINES=222, T_LOCAL=223, T_LOCATE=224, T_LOCATION=225, T_LOCATOR=226, 
		T_LOCATORS=227, T_LOCKS=228, T_LOG=229, T_LOG10=230, T_LOG2=231, T_LOGGED=232, 
		T_LOGGED_IN_USER=233, T_LOGGING=234, T_LOOP=235, T_LOWER=236, T_LPAD=237, 
		T_LN=238, T_LTRIM=239, T_MAP=240, T_MASK=241, T_MASK_FIRST_N=242, T_MASK_HASH=243, 
		T_MASK_LAST_N=244, T_MASK_SHOW_FIRST_N=245, T_MASK_SHOW_LAST_N=246, T_MATCHED=247, 
		T_MAX=248, T_MAXTRANS=249, T_MD5=250, T_MERGE=251, T_MESSAGE_TEXT=252, 
		T_MICROSECOND=253, T_MICROSECONDS=254, T_MIN=255, T_MINUTE=256, T_MONTH=257, 
		T_MONTHS_BETWEEN=258, T_MULTISET=259, T_NAMED_STRUCT=260, T_NCHAR=261, 
		T_NEGATIVE=262, T_NEXT_DAY=263, T_NEW=264, T_NVARCHAR=265, T_NO=266, T_NOCOUNT=267, 
		T_NOCOMPRESS=268, T_NOLOGGING=269, T_NONE=270, T_NOT=271, T_NOTFOUND=272, 
		T_NTILE=273, T_NULL=274, T_NULLIF=275, T_NUMERIC=276, T_NUMBER=277, T_OBJECT=278, 
		T_OCTET_LENGTH=279, T_OFF=280, T_ON=281, T_ONLY=282, T_OPEN=283, T_OR=284, 
		T_ORDER=285, T_OUT=286, T_OUTER=287, T_OVER=288, T_OVERWRITE=289, T_OWNER=290, 
		T_PACKAGE=291, T_PARSE_URL=292, T_PARTITION=293, T_PCTFREE=294, T_PCTUSED=295, 
		T_PERCENT_RANK=296, T_PERCENTILE=297, T_PERCENTILE_APPROX=298, T_PLS_INTEGER=299, 
		T_PMOD=300, T_POSITIVE=301, T_POSEXPLODE=302, T_POW=303, T_POWER=304, 
		T_PRECISION=305, T_PRESERVE=306, T_PRIMARY=307, T_PRINTF=308, T_PROC=309, 
		T_PROCEDURE=310, T_QUALIFY=311, T_QUARTER=312, T_QUERY_BAND=313, T_QUIT=314, 
		T_QUOTE=315, T_RADIANS=316, T_RAISE=317, T_RAND=318, T_REAL=319, T_REFERENCES=320, 
		T_REFLECT=321, T_REGEXP=322, T_REGEXP_EXTRACT=323, T_REGEXP_REPLACE=324, 
		T_REGR_AVGX=325, T_REGR_AVGY=326, T_REGR_COUNT=327, T_REGR_INTERCEPT=328, 
		T_REGR_R2=329, T_REGR_SLOPE=330, T_REGR_SXX=331, T_REGR_SXY=332, T_REGR_SYY=333, 
		T_REPEAT=334, T_REPLACE=335, T_RESIGNAL=336, T_RESTRICT=337, T_RESULT=338, 
		T_RESULT_SET_LOCATOR=339, T_RETURN=340, T_RETURNS=341, T_REVERSE=342, 
		T_RIGHT=343, T_RLIKE=344, T_ROLE=345, T_ROLLBACK=346, T_ROUND=347, T_ROW=348, 
		T_ROWS=349, T_ROWTYPE=350, T_ROW_COUNT=351, T_RPAD=352, T_RR=353, T_RS=354, 
		T_RTRIM=355, T_PWD=356, T_TRIM=357, T_SCHEMA=358, T_SECOND=359, T_SECONDS=360, 
		T_SECURITY=361, T_SEGMENT=362, T_SEL=363, T_SELECT=364, T_SENTENCES=365, 
		T_SET=366, T_SETS=367, T_SHA=368, T_SHA1=369, T_SHA2=370, T_SIGN=371, 
		T_SIN=372, T_SIMPLE_DOUBLE=373, T_SIMPLE_FLOAT=374, T_SIMPLE_INTEGER=375, 
		T_SMALLDATETIME=376, T_SMALLINT=377, T_SOUNDEX=378, T_SPACE=379, T_SPLIT=380, 
		T_SQL=381, T_SQLEXCEPTION=382, T_SQLINSERT=383, T_SQLSTATE=384, T_SQLWARNING=385, 
		T_SQRT=386, T_STATS=387, T_STATISTICS=388, T_STDDEV_POP=389, T_STDDEV_SAMP=390, 
		T_STEP=391, T_STORAGE=392, T_STORED=393, T_STRING=394, T_STR_TO_MAP=395, 
		T_STRUCT=396, T_SUBDIR=397, T_SUBSTR=398, T_SUBSTRING=399, T_SUBSTRING_INDEX=400, 
		T_SUM=401, T_SUMMARY=402, T_SYS_REFCURSOR=403, T_TABLE=404, T_TABLESPACE=405, 
		T_TAN=406, T_TEMPORARY=407, T_TERMINATED=408, T_TEXTIMAGE_ON=409, T_THEN=410, 
		T_TIMESTAMP=411, T_TINYINT=412, T_TITLE=413, T_TO=414, T_TOP=415, T_TOUTCTIMESTAMP=416, 
		T_TRANSACTION=417, T_TRANSLATE=418, T_TRUE=419, T_TRUNCATE=420, T_TRUNC=421, 
		T_TYPE=422, T_UCASE=423, T_UNBASE64=424, T_UNHEX=425, T_UNION=426, T_UNIQUE=427, 
		T_UNIX_TIMESTAMP=428, T_UPDATE=429, T_UPPER=430, T_UR=431, T_USE=432, 
		T_USING=433, T_VALUE=434, T_VALUES=435, T_VAR=436, T_VARCHAR=437, T_VARCHAR2=438, 
		T_VARYING=439, T_VERSION=440, T_VOLATILE=441, T_WEEKOFYEAR=442, T_WHEN=443, 
		T_WHERE=444, T_WHILE=445, T_WITH=446, T_WITHOUT=447, T_WORK=448, T_XACT_ABORT=449, 
		T_XML=450, T_XPATH=451, T_XPATH_BOOLEAN=452, T_XPATH_DOUBLE=453, T_XPATH_FLOAT=454, 
		T_XPATH_INT=455, T_XPATH_LONG=456, T_XPATH_NUMBER=457, T_XPATH_SHORT=458, 
		T_XPATH_STRING=459, T_YEAR=460, T_YES=461, T_ACTIVITY_COUNT=462, T_CUME_DIST=463, 
		T_CURRENT_DATE=464, T_CURRENT_TIMESTAMP=465, T_CURRENT_USER=466, T_DENSE_RANK=467, 
		T_FIRST_VALUE=468, T_LAG=469, T_LAST_VALUE=470, T_LEAD=471, T_MAX_PART_STRING=472, 
		T_MIN_PART_STRING=473, T_MAX_PART_INT=474, T_MIN_PART_INT=475, T_MAX_PART_DATE=476, 
		T_MIN_PART_DATE=477, T_PART_COUNT=478, T_PART_LOC=479, T_RANK=480, T_ROW_NUMBER=481, 
		T_STDEV=482, T_SYSDATE=483, T_VARIANCE=484, T_VAR_POP=485, T_VAR_SAMP=486, 
		T_USER=487, T_ADD=488, T_COLON=489, T_COMMA=490, T_PIPE=491, T_DIV=492, 
		T_DOT2=493, T_EQUAL=494, T_EQUAL2=495, T_NOTEQUAL=496, T_NOTEQUAL2=497, 
		T_GREATER=498, T_GREATEREQUAL=499, T_LESS=500, T_LESSEQUAL=501, T_MUL=502, 
		T_OPEN_B=503, T_OPEN_P=504, T_OPEN_SB=505, T_CLOSE_B=506, T_CLOSE_P=507, 
		T_CLOSE_SB=508, T_SEMICOLON=509, T_SUB=510, IDENTIFIER=511, INT_LITERAL=512, 
		DECIMAL_LITERAL=513, STRING_LITERAL=514, L_INT=515, L_DEC=516, SPACES=517, 
		UNEXPECTED_CHAR=518;
	public static final int
		RULE_program = 0, RULE_stmt_list = 1, RULE_dtype = 2, RULE_dtype_len = 3, 
		RULE_stmt = 4, RULE_query_stmt = 5, RULE_select_stmt = 6, RULE_opt_where_expr = 7, 
		RULE_opt_group_by_list = 8, RULE_opt_having_expr = 9, RULE_opt_order_by_list = 10, 
		RULE_opt_order_by_mode = 11, RULE_opt_limit = 12, RULE_table_reference = 13, 
		RULE_join_table = 14, RULE_join_condition = 15, RULE_table_factor = 16, 
		RULE_select_all_distinct = 17, RULE_select_expr_list = 18, RULE_select_expr = 19, 
		RULE_over_clause = 20, RULE_over_func = 21, RULE_analytic_func = 22, RULE_expr_list = 23, 
		RULE_expr = 24, RULE_complex_types = 25, RULE_array_def = 26, RULE_map_def = 27, 
		RULE_struct_def = 28, RULE_named_struct_def = 29, RULE_str_func = 30, 
		RULE_misc_func = 31, RULE_expr_concat = 32, RULE_expr_concat_item = 33, 
		RULE_cond_func = 34, RULE_date_func = 35, RULE_dat_convrt_func = 36, RULE_basic_aggr_func = 37, 
		RULE_aggr_func = 38, RULE_tab_generate_func = 39, RULE_math_func = 40, 
		RULE_literal_values = 41, RULE_ident = 42, RULE_tab_ident = 43, RULE_date_literal = 44, 
		RULE_timestamp_literal = 45, RULE_set_operators_is = 46, RULE_set_operators_like = 47, 
		RULE_set_operators_in = 48, RULE_set_operators_exists = 49, RULE_unary_operator = 50;
	public static final String[] ruleNames = {
		"program", "stmt_list", "dtype", "dtype_len", "stmt", "query_stmt", "select_stmt", 
		"opt_where_expr", "opt_group_by_list", "opt_having_expr", "opt_order_by_list", 
		"opt_order_by_mode", "opt_limit", "table_reference", "join_table", "join_condition", 
		"table_factor", "select_all_distinct", "select_expr_list", "select_expr", 
		"over_clause", "over_func", "analytic_func", "expr_list", "expr", "complex_types", 
		"array_def", "map_def", "struct_def", "named_struct_def", "str_func", 
		"misc_func", "expr_concat", "expr_concat_item", "cond_func", "date_func", 
		"dat_convrt_func", "basic_aggr_func", "aggr_func", "tab_generate_func", 
		"math_func", "literal_values", "ident", "tab_ident", "date_literal", "timestamp_literal", 
		"set_operators_is", "set_operators_like", "set_operators_in", "set_operators_exists", 
		"unary_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'.'", "'<<'", "'>>'", "'&'", "'|'", "'<=>'", "'E'", "'PI'", 
		"'!'", null, null, null, null, null, null, null, null, null, null, null, 
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
		null, null, null, null, null, null, null, null, null, null, "'+'", "':'", 
		"','", "'||'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", 
		"'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "NULL_CONST", 
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
		"T_CREATE", "T_CREATION", "T_CREATOR", "T_CROSS", "T_CS", "T_CURRENT", 
		"T_CURRENT_SCHEMA", "T_CURRENT_DATABASE", "T_CURSOR", "T_DATABASE", "T_DATE", 
		"T_DATEADD", "T_DATEDIFF", "T_DATE_FORMAT", "T_DATESUB", "T_DATETIME", 
		"T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECODE", "T_DECLARE", "T_DEFAULT", 
		"T_DEFERRED", "T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DEGREES", "T_DELETE", 
		"T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", 
		"T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", 
		"T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ELT", "T_ENABLE", 
		"T_ENCODE", "T_END", "T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE", 
		"T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_EXP", "T_EXPLODE", 
		"T_FACTORIAL", "T_FALLBACK", "T_FALSE", "T_FETCH", "T_FIELD", "T_FIELDS", 
		"T_FIELD_IN_SET", "T_FILE", "T_FILES", "T_FLOAT", "T_FLOOR", "T_FOR", 
		"T_FOREIGN", "T_FORMAT", "T_FORMAT_NUMBER", "T_FOUND", "T_FROM", "T_FROMUTCTIMESTAMP", 
		"T_FULL", "T_FUNCTION", "T_GET", "T_GET_JSON_OBJECTS", "T_GLOBAL", "T_GO", 
		"T_GRANT", "T_GROUP", "T_HANDLER", "T_HASH", "T_HAVING", "T_HDFS", "T_HEX", 
		"T_HISTOGRAM_NUMERIC", "T_HIVE", "T_HOST", "T_HOUR", "T_IDENTITY", "T_IF", 
		"T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", "T_INDEX", "T_IN_FILE", 
		"T_INITCAP", "T_INITRANS", "T_INLINE", "T_INNER", "T_INOUT", "T_INSERT", 
		"T_IN_STR", "T_INT", "T_INT2", "T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", 
		"T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", "T_ISNOTNULL", "T_ISNULL", 
		"T_NVL", "T_ISOPEN", "T_ITEMS", "T_JAVA_METHOD", "T_JOIN", "T_KEEP", "T_KEY", 
		"T_KEYS", "T_LANGUAGE", "T_LASTDAY", "T_LCASE", "T_LEAVE", "T_LEFT", "T_LENGTH", 
		"T_LEVENSHTEIN", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATE", 
		"T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOG10", 
		"T_LOG2", "T_LOGGED", "T_LOGGED_IN_USER", "T_LOGGING", "T_LOOP", "T_LOWER", 
		"T_LPAD", "T_LN", "T_LTRIM", "T_MAP", "T_MASK", "T_MASK_FIRST_N", "T_MASK_HASH", 
		"T_MASK_LAST_N", "T_MASK_SHOW_FIRST_N", "T_MASK_SHOW_LAST_N", "T_MATCHED", 
		"T_MAX", "T_MAXTRANS", "T_MD5", "T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", 
		"T_MICROSECONDS", "T_MIN", "T_MINUTE", "T_MONTH", "T_MONTHS_BETWEEN", 
		"T_MULTISET", "T_NAMED_STRUCT", "T_NCHAR", "T_NEGATIVE", "T_NEXT_DAY", 
		"T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", "T_NOCOMPRESS", "T_NOLOGGING", 
		"T_NONE", "T_NOT", "T_NOTFOUND", "T_NTILE", "T_NULL", "T_NULLIF", "T_NUMERIC", 
		"T_NUMBER", "T_OBJECT", "T_OCTET_LENGTH", "T_OFF", "T_ON", "T_ONLY", "T_OPEN", 
		"T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", "T_OVERWRITE", "T_OWNER", 
		"T_PACKAGE", "T_PARSE_URL", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", "T_PERCENT_RANK", 
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
		"T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_STR_TO_MAP", "T_STRUCT", 
		"T_SUBDIR", "T_SUBSTR", "T_SUBSTRING", "T_SUBSTRING_INDEX", "T_SUM", "T_SUMMARY", 
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
			setState(102);
			((ProgramContext)_localctx).stmt_list = stmt_list();
			setState(103);
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
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				((Stmt_listContext)_localctx).stmt = stmt();
				((Stmt_listContext)_localctx).stmts.add(((Stmt_listContext)_localctx).stmt);
				setState(108);
				match(T_SEMICOLON);
				}
				}
				setState(112); 
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
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T_CHAR);
				 ((DtypeContext)_localctx).res =  "CHAR"; 
				}
				break;
			case T_CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(T_CHARACTER);
				 ((DtypeContext)_localctx).res =  "CHAR"; 
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(T_BIGINT);
				 ((DtypeContext)_localctx).res =  "BIGINT"; 
				}
				break;
			case T_BIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(T_BIT);
				 ((DtypeContext)_localctx).res =  "BIT"; 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				match(T_DATE);
				 ((DtypeContext)_localctx).res =  "DATE"; 
				}
				break;
			case T_DATETIME:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				match(T_DATETIME);
				 ((DtypeContext)_localctx).res =  "DATETIME"; 
				}
				break;
			case T_DEC:
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				match(T_DEC);
				 ((DtypeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				match(T_DECIMAL);
				 ((DtypeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				match(T_DOUBLE);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PRECISION) {
					{
					setState(133);
					match(T_PRECISION);
					}
				}

				 ((DtypeContext)_localctx).res =  "DOUBLE"; 
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 10);
				{
				setState(137);
				match(T_FLOAT);
				 ((DtypeContext)_localctx).res =  "FLOAT"; 
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 11);
				{
				setState(139);
				match(T_INT);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_INT2:
				enterOuterAlt(_localctx, 12);
				{
				setState(141);
				match(T_INT2);
				 ((DtypeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case T_INT4:
				enterOuterAlt(_localctx, 13);
				{
				setState(143);
				match(T_INT4);
				 ((DtypeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case T_INT8:
				enterOuterAlt(_localctx, 14);
				{
				setState(145);
				match(T_INT8);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 15);
				{
				setState(147);
				match(T_INTEGER);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case T_NCHAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(149);
				match(T_NCHAR);
				 ((DtypeContext)_localctx).res =  "NCHAR"; 
				}
				break;
			case T_NVARCHAR:
				enterOuterAlt(_localctx, 17);
				{
				setState(151);
				match(T_NVARCHAR);
				 ((DtypeContext)_localctx).res =  "NVARCHAR"; 
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 18);
				{
				setState(153);
				match(T_NUMBER);
				 ((DtypeContext)_localctx).res =  "NUMBER"; 
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 19);
				{
				setState(155);
				match(T_NUMERIC);
				 ((DtypeContext)_localctx).res =  "NUMERIC"; 
				}
				break;
			case T_PLS_INTEGER:
				enterOuterAlt(_localctx, 20);
				{
				setState(157);
				match(T_PLS_INTEGER);
				 ((DtypeContext)_localctx).res =  "PLS_INTEGER"; 
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 21);
				{
				setState(159);
				match(T_REAL);
				 ((DtypeContext)_localctx).res =  "REAL"; 
				}
				break;
			case T_RESULT_SET_LOCATOR:
				enterOuterAlt(_localctx, 22);
				{
				setState(161);
				match(T_RESULT_SET_LOCATOR);
				setState(162);
				match(T_VARYING);
				 ((DtypeContext)_localctx).res =  "RESULT_SET_LOCATOR"; 
				}
				break;
			case T_SIMPLE_FLOAT:
				enterOuterAlt(_localctx, 23);
				{
				setState(164);
				match(T_SIMPLE_FLOAT);
				 ((DtypeContext)_localctx).res =  "SIMPLE_FLOAT"; 
				}
				break;
			case T_SIMPLE_DOUBLE:
				enterOuterAlt(_localctx, 24);
				{
				setState(166);
				match(T_SIMPLE_DOUBLE);
				 ((DtypeContext)_localctx).res =  "SIMPLE_DOUBLE"; 
				}
				break;
			case T_SIMPLE_INTEGER:
				enterOuterAlt(_localctx, 25);
				{
				setState(168);
				match(T_SIMPLE_INTEGER);
				 ((DtypeContext)_localctx).res =  "SIMPLE_INTEGER"; 
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 26);
				{
				setState(170);
				match(T_SMALLINT);
				 ((DtypeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case T_SMALLDATETIME:
				enterOuterAlt(_localctx, 27);
				{
				setState(172);
				match(T_SMALLDATETIME);
				 ((DtypeContext)_localctx).res =  "SMALLDATETIME"; 
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 28);
				{
				setState(174);
				match(T_STRING);
				 ((DtypeContext)_localctx).res =  "STRING"; 
				}
				break;
			case T_SYS_REFCURSOR:
				enterOuterAlt(_localctx, 29);
				{
				setState(176);
				match(T_SYS_REFCURSOR);
				 ((DtypeContext)_localctx).res =  "SYS_REFCURSOR"; 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 30);
				{
				setState(178);
				match(T_TIMESTAMP);
				 ((DtypeContext)_localctx).res =  "TIMESTAMP"; 
				}
				break;
			case T_TINYINT:
				enterOuterAlt(_localctx, 31);
				{
				setState(180);
				match(T_TINYINT);
				 ((DtypeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 32);
				{
				setState(182);
				match(T_VARCHAR);
				 ((DtypeContext)_localctx).res =  "VARCHAR"; 
				}
				break;
			case T_VARCHAR2:
				enterOuterAlt(_localctx, 33);
				{
				setState(184);
				match(T_VARCHAR2);
				 ((DtypeContext)_localctx).res =  "VARCHAR2"; 
				}
				break;
			case T_XML:
				enterOuterAlt(_localctx, 34);
				{
				setState(186);
				match(T_XML);
				 ((DtypeContext)_localctx).res =  "XML"; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 35);
				{
				setState(188);
				((DtypeContext)_localctx).ident = ident();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(189);
					match(T__0);
					setState(190);
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
			setState(197);
			match(T_OPEN_P);
			setState(198);
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
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(199);
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

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(202);
				match(T_COMMA);
				setState(203);
				match(L_INT);
				}
			}

			setState(206);
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
			setState(208);
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
			setState(211);
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
		public Select_all_distinctContext select_all_distinct;
		public Select_expr_listContext select_expr_list;
		public Tab_generate_funcContext tab_generate_func;
		public Table_referenceContext table_reference;
		public Opt_where_exprContext opt_where_expr;
		public Opt_group_by_listContext opt_group_by_list;
		public Opt_having_exprContext opt_having_expr;
		public Opt_order_by_listContext opt_order_by_list;
		public Opt_limitContext opt_limit;
		public TerminalNode T_SELECT() { return getToken(HiveParser.T_SELECT, 0); }
		public Select_all_distinctContext select_all_distinct() {
			return getRuleContext(Select_all_distinctContext.class,0);
		}
		public Select_expr_listContext select_expr_list() {
			return getRuleContext(Select_expr_listContext.class,0);
		}
		public Tab_generate_funcContext tab_generate_func() {
			return getRuleContext(Tab_generate_funcContext.class,0);
		}
		public TerminalNode T_FROM() { return getToken(HiveParser.T_FROM, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public Opt_where_exprContext opt_where_expr() {
			return getRuleContext(Opt_where_exprContext.class,0);
		}
		public Opt_group_by_listContext opt_group_by_list() {
			return getRuleContext(Opt_group_by_listContext.class,0);
		}
		public Opt_having_exprContext opt_having_expr() {
			return getRuleContext(Opt_having_exprContext.class,0);
		}
		public Opt_order_by_listContext opt_order_by_list() {
			return getRuleContext(Opt_order_by_listContext.class,0);
		}
		public Opt_limitContext opt_limit() {
			return getRuleContext(Opt_limitContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_select_stmt);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T_SELECT);
				setState(215);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(216);
				((Select_stmtContext)_localctx).select_expr_list = select_expr_list();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).select_expr_list.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(T_SELECT);
				setState(220);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(221);
				((Select_stmtContext)_localctx).tab_generate_func = tab_generate_func();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).tab_generate_func.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(T_SELECT);
				setState(225);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(226);
				((Select_stmtContext)_localctx).select_expr_list = select_expr_list();
				setState(227);
				match(T_FROM);
				setState(228);
				((Select_stmtContext)_localctx).table_reference = table_reference();
				setState(229);
				((Select_stmtContext)_localctx).opt_where_expr = opt_where_expr();
				setState(230);
				((Select_stmtContext)_localctx).opt_group_by_list = opt_group_by_list();
				setState(231);
				((Select_stmtContext)_localctx).opt_having_expr = opt_having_expr();
				setState(232);
				((Select_stmtContext)_localctx).opt_order_by_list = opt_order_by_list();
				setState(233);
				((Select_stmtContext)_localctx).opt_limit = opt_limit();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).select_expr_list.res, ((Select_stmtContext)_localctx).table_reference.res, ((Select_stmtContext)_localctx).opt_where_expr.res, ((Select_stmtContext)_localctx).opt_group_by_list.res, ((Select_stmtContext)_localctx).opt_having_expr.res, ((Select_stmtContext)_localctx).opt_order_by_list.res, ((Select_stmtContext)_localctx).opt_limit.res); 
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

	public static class Opt_where_exprContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public TerminalNode T_WHERE() { return getToken(HiveParser.T_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Opt_where_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_where_expr; }
	}

	public final Opt_where_exprContext opt_where_expr() throws RecognitionException {
		Opt_where_exprContext _localctx = new Opt_where_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_opt_where_expr);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_GROUP:
			case T_HAVING:
			case T_LIMIT:
			case T_ORDER:
			case T_CLOSE_P:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_where_exprContext)_localctx).res =  json(); 
				}
				break;
			case T_WHERE:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(T_WHERE);
				setState(240);
				((Opt_where_exprContext)_localctx).expr = expr(0);
				 ((Opt_where_exprContext)_localctx).res =  ((Opt_where_exprContext)_localctx).expr.res; 
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

	public static class Opt_group_by_listContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public List<ExprContext> expr_group_by_list = new ArrayList<ExprContext>();
		public TerminalNode T_GROUP() { return getToken(HiveParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Opt_group_by_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_group_by_list; }
	}

	public final Opt_group_by_listContext opt_group_by_list() throws RecognitionException {
		Opt_group_by_listContext _localctx = new Opt_group_by_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_opt_group_by_list);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_HAVING:
			case T_LIMIT:
			case T_ORDER:
			case T_CLOSE_P:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_group_by_listContext)_localctx).res =  vector<json>(); 
				}
				break;
			case T_GROUP:
				enterOuterAlt(_localctx, 2);
				{
				 vector<ExprContext*> expr_group_by_list; 
				setState(247);
				match(T_GROUP);
				setState(248);
				match(T_BY);
				setState(249);
				((Opt_group_by_listContext)_localctx).expr = expr(0);
				((Opt_group_by_listContext)_localctx).expr_group_by_list.add(((Opt_group_by_listContext)_localctx).expr);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(250);
					match(T_COMMA);
					setState(251);
					((Opt_group_by_listContext)_localctx).expr = expr(0);
					((Opt_group_by_listContext)_localctx).expr_group_by_list.add(((Opt_group_by_listContext)_localctx).expr);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        vector<json> expr_json_list;
				        for(ExprContext* expr_context : ((Opt_group_by_listContext)_localctx).expr_group_by_list)
				        {  
				            expr_json_list.push_back(expr_context->res);
				        }
				        ((Opt_group_by_listContext)_localctx).res =  expr_json_list;
				    
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

	public static class Opt_having_exprContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public TerminalNode T_HAVING() { return getToken(HiveParser.T_HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Opt_having_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_having_expr; }
	}

	public final Opt_having_exprContext opt_having_expr() throws RecognitionException {
		Opt_having_exprContext _localctx = new Opt_having_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_opt_having_expr);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
			case T_ORDER:
			case T_CLOSE_P:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_having_exprContext)_localctx).res =  json(); 
				}
				break;
			case T_HAVING:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T_HAVING);
				setState(263);
				((Opt_having_exprContext)_localctx).expr = expr(0);
				 ((Opt_having_exprContext)_localctx).res =  ((Opt_having_exprContext)_localctx).expr.res; 
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

	public static class Opt_order_by_listContext extends ParserRuleContext {
		public json res;
		public IdentContext ident;
		public List<IdentContext> order_by_ident_list = new ArrayList<IdentContext>();
		public Opt_order_by_modeContext opt_order_by_mode;
		public List<Opt_order_by_modeContext> order_mode_list = new ArrayList<Opt_order_by_modeContext>();
		public TerminalNode T_ORDER() { return getToken(HiveParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<Opt_order_by_modeContext> opt_order_by_mode() {
			return getRuleContexts(Opt_order_by_modeContext.class);
		}
		public Opt_order_by_modeContext opt_order_by_mode(int i) {
			return getRuleContext(Opt_order_by_modeContext.class,i);
		}
		public Opt_order_by_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_order_by_list; }
	}

	public final Opt_order_by_listContext opt_order_by_list() throws RecognitionException {
		Opt_order_by_listContext _localctx = new Opt_order_by_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opt_order_by_list);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
			case T_CLOSE_P:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_order_by_listContext)_localctx).res =  vector<json>(); 
				}
				break;
			case T_ORDER:
				enterOuterAlt(_localctx, 2);
				{
				 vector<IdentContext*> order_by_ident_list; vector<Opt_order_by_modeContext*> order_mode_list; 
				setState(270);
				match(T_ORDER);
				setState(271);
				match(T_BY);
				setState(272);
				((Opt_order_by_listContext)_localctx).ident = ident();
				((Opt_order_by_listContext)_localctx).order_by_ident_list.add(((Opt_order_by_listContext)_localctx).ident);
				setState(273);
				((Opt_order_by_listContext)_localctx).opt_order_by_mode = opt_order_by_mode();
				((Opt_order_by_listContext)_localctx).order_mode_list.add(((Opt_order_by_listContext)_localctx).opt_order_by_mode);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(274);
					match(T_COMMA);
					setState(275);
					((Opt_order_by_listContext)_localctx).ident = ident();
					((Opt_order_by_listContext)_localctx).order_by_ident_list.add(((Opt_order_by_listContext)_localctx).ident);
					setState(276);
					((Opt_order_by_listContext)_localctx).opt_order_by_mode = opt_order_by_mode();
					((Opt_order_by_listContext)_localctx).order_mode_list.add(((Opt_order_by_listContext)_localctx).opt_order_by_mode);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        vector<json> expr_json_list;
				        for(int i = 0; i < ((Opt_order_by_listContext)_localctx).order_by_ident_list.size() ; i++)
				        {  
				            json j;
				            j["col_name"] = ((Opt_order_by_listContext)_localctx).order_by_ident_list[i]->res;
				            j["col_order"] = ((Opt_order_by_listContext)_localctx).order_mode_list[i]->res;
				            expr_json_list.push_back(j);
				        }
				        ((Opt_order_by_listContext)_localctx).res =  expr_json_list;
				    
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

	public static class Opt_order_by_modeContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_ASC() { return getToken(HiveParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(HiveParser.T_DESC, 0); }
		public Opt_order_by_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_order_by_mode; }
	}

	public final Opt_order_by_modeContext opt_order_by_mode() throws RecognitionException {
		Opt_order_by_modeContext _localctx = new Opt_order_by_modeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_opt_order_by_mode);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
			case T_COMMA:
			case T_CLOSE_P:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_order_by_modeContext)_localctx).res =  "ASC"; 
				}
				break;
			case T_ASC:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(T_ASC);
				 ((Opt_order_by_modeContext)_localctx).res =  "ASC"; 
				}
				break;
			case T_DESC:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(T_DESC);
				 ((Opt_order_by_modeContext)_localctx).res =  "DESC"; 
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

	public static class Opt_limitContext extends ParserRuleContext {
		public json res;
		public Token rows;
		public Token offset;
		public TerminalNode T_LIMIT() { return getToken(HiveParser.T_LIMIT, 0); }
		public List<TerminalNode> INT_LITERAL() { return getTokens(HiveParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(HiveParser.INT_LITERAL, i);
		}
		public Opt_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_limit; }
	}

	public final Opt_limitContext opt_limit() throws RecognitionException {
		Opt_limitContext _localctx = new Opt_limitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opt_limit);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_limitContext)_localctx).res =  json(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(T_LIMIT);
				setState(296);
				((Opt_limitContext)_localctx).rows = match(INT_LITERAL);
				 ((Opt_limitContext)_localctx).res =  hql_select_limit_clause((((Opt_limitContext)_localctx).rows!=null?((Opt_limitContext)_localctx).rows.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(T_LIMIT);
				setState(299);
				((Opt_limitContext)_localctx).offset = match(INT_LITERAL);
				setState(300);
				match(T_COMMA);
				setState(301);
				((Opt_limitContext)_localctx).rows = match(INT_LITERAL);
				 ((Opt_limitContext)_localctx).res =  hql_select_limit_clause((((Opt_limitContext)_localctx).rows!=null?((Opt_limitContext)_localctx).rows.getText():null), (((Opt_limitContext)_localctx).offset!=null?((Opt_limitContext)_localctx).offset.getText():null)); 
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

	public static class Table_referenceContext extends ParserRuleContext {
		public json res;
		public Table_factorContext table_factor;
		public List<Table_factorContext> table_factor_list = new ArrayList<Table_factorContext>();
		public Join_tableContext join_table;
		public List<Join_tableContext> join_table_list = new ArrayList<Join_tableContext>();
		public List<Table_factorContext> table_factor() {
			return getRuleContexts(Table_factorContext.class);
		}
		public Table_factorContext table_factor(int i) {
			return getRuleContext(Table_factorContext.class,i);
		}
		public List<Join_tableContext> join_table() {
			return getRuleContexts(Join_tableContext.class);
		}
		public Join_tableContext join_table(int i) {
			return getRuleContext(Join_tableContext.class,i);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_table_reference);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				 ((Table_referenceContext)_localctx).res =  ((Table_referenceContext)_localctx).table_factor.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				vector<Table_factorContext*> table_factor_list; 
				setState(309);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				((Table_referenceContext)_localctx).table_factor_list.add(((Table_referenceContext)_localctx).table_factor);
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(310);
					match(T_COMMA);
					setState(311);
					((Table_referenceContext)_localctx).table_factor = table_factor();
					((Table_referenceContext)_localctx).table_factor_list.add(((Table_referenceContext)_localctx).table_factor);
					}
					}
					setState(314); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );

				        vector<json> table_factor_list_json;
				        json result;
				        for(Table_factorContext* tab_fact : ((Table_referenceContext)_localctx).table_factor_list)
				        {
				            table_factor_list_json.push_back(tab_fact->res);
				        }
				        result["type"]="TABLE_REFERENCE_LIST";
				        result["table_reference_list"] = table_factor_list_json;
				        ((Table_referenceContext)_localctx).res =  result;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				vector<Join_tableContext*> join_table_list; 
				setState(319);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(320);
					((Table_referenceContext)_localctx).join_table = join_table();
					((Table_referenceContext)_localctx).join_table_list.add(((Table_referenceContext)_localctx).join_table);
					}
					}
					setState(323); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_CROSS || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (T_FULL - 161)) | (1L << (T_INNER - 161)) | (1L << (T_JOIN - 161)) | (1L << (T_LEFT - 161)))) != 0) || _la==T_RIGHT );

				        ((Table_referenceContext)_localctx).join_table_list[0]->res["left_table"] = ((Table_referenceContext)_localctx).table_factor.res;
				        for(int i = 1; i < ((Table_referenceContext)_localctx).join_table_list.size() ; i++)
				        {
				            ((Table_referenceContext)_localctx).join_table_list[i]->res["left_table"] =  ((Table_referenceContext)_localctx).join_table_list[i - 1]->res;
				        }
				        ((Table_referenceContext)_localctx).res =  ((Table_referenceContext)_localctx).join_table_list[((Table_referenceContext)_localctx).join_table_list.size() - 1]->res;
				    
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

	public static class Join_tableContext extends ParserRuleContext {
		public json res;
		public Table_factorContext table_factor;
		public Join_conditionContext join_condition;
		public Token j_type;
		public TerminalNode T_JOIN() { return getToken(HiveParser.T_JOIN, 0); }
		public Table_factorContext table_factor() {
			return getRuleContext(Table_factorContext.class,0);
		}
		public TerminalNode T_INNER() { return getToken(HiveParser.T_INNER, 0); }
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode T_LEFT() { return getToken(HiveParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(HiveParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(HiveParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(HiveParser.T_OUTER, 0); }
		public TerminalNode T_CROSS() { return getToken(HiveParser.T_CROSS, 0); }
		public Join_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_table; }
	}

	public final Join_tableContext join_table() throws RecognitionException {
		Join_tableContext _localctx = new Join_tableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_join_table);
		int _la;
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(329);
					match(T_INNER);
					}
				}

				setState(332);
				match(T_JOIN);
				setState(333);
				((Join_tableContext)_localctx).table_factor = table_factor();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("INNER", ((Join_tableContext)_localctx).table_factor.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(336);
					match(T_INNER);
					}
				}

				setState(339);
				match(T_JOIN);
				setState(340);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(341);
				((Join_tableContext)_localctx).join_condition = join_condition();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("INNER", ((Join_tableContext)_localctx).table_factor.res, ((Join_tableContext)_localctx).join_condition.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				((Join_tableContext)_localctx).j_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
					((Join_tableContext)_localctx).j_type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(345);
					match(T_OUTER);
					}
				}

				setState(348);
				match(T_JOIN);
				setState(349);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(350);
				((Join_tableContext)_localctx).join_condition = join_condition();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table((((Join_tableContext)_localctx).j_type!=null?((Join_tableContext)_localctx).j_type.getText():null), ((Join_tableContext)_localctx).table_factor.res, ((Join_tableContext)_localctx).join_condition.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				match(T_CROSS);
				setState(354);
				match(T_JOIN);
				setState(355);
				((Join_tableContext)_localctx).table_factor = table_factor();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("CROSS", ((Join_tableContext)_localctx).table_factor.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				match(T_CROSS);
				setState(359);
				match(T_JOIN);
				setState(360);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(361);
				((Join_tableContext)_localctx).join_condition = join_condition();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("CROSS", ((Join_tableContext)_localctx).table_factor.res, ((Join_tableContext)_localctx).join_condition.res); 
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

	public static class Join_conditionContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public TerminalNode T_ON() { return getToken(HiveParser.T_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T_ON);
			setState(367);
			((Join_conditionContext)_localctx).expr = expr(0);
			 ((Join_conditionContext)_localctx).res =  ((Join_conditionContext)_localctx).expr.res; 
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

	public static class Table_factorContext extends ParserRuleContext {
		public json res;
		public Tab_identContext tab_ident;
		public Token IDENTIFIER;
		public Select_stmtContext select_stmt;
		public Tab_identContext tab_ident() {
			return getRuleContext(Tab_identContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HiveParser.IDENTIFIER, 0); }
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor; }
	}

	public final Table_factorContext table_factor() throws RecognitionException {
		Table_factorContext _localctx = new Table_factorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_table_factor);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				((Table_factorContext)_localctx).tab_ident = tab_ident();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).tab_ident.res, "DEFAULT"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				((Table_factorContext)_localctx).tab_ident = tab_ident();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(374);
					match(T_AS);
					}
				}

				setState(377);
				((Table_factorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).tab_ident.res, (((Table_factorContext)_localctx).IDENTIFIER!=null?((Table_factorContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(T_OPEN_P);
				setState(381);
				((Table_factorContext)_localctx).select_stmt = select_stmt();
				setState(382);
				match(T_CLOSE_P);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(383);
					match(T_AS);
					}
				}

				setState(386);
				((Table_factorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).select_stmt.res, (((Table_factorContext)_localctx).IDENTIFIER!=null?((Table_factorContext)_localctx).IDENTIFIER.getText():null)); 
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

	public static class Select_all_distinctContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_ALL() { return getToken(HiveParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HiveParser.T_DISTINCT, 0); }
		public Select_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_all_distinct; }
	}

	public final Select_all_distinctContext select_all_distinct() throws RecognitionException {
		Select_all_distinctContext _localctx = new Select_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_select_all_distinct);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case NULL_CONST:
			case BOOL_LITERAL:
			case T_ABS:
			case T_ACOS:
			case T_ADD_MONTHS:
			case T_AES_ENCRYPT:
			case T_AES_DECRYPT:
			case T_ARRAY:
			case T_ASCII:
			case T_ASIN:
			case T_ASSERT_TRUE:
			case T_ATAN:
			case T_AVG:
			case T_BASE64:
			case T_BIN:
			case T_BINARY:
			case T_CASE:
			case T_CAST:
			case T_CBR:
			case T_CEIL:
			case T_CEILING:
			case T_CHARACTER_LENGTH:
			case T_CHR:
			case T_COALESCE:
			case T_COLLECT_SET:
			case T_COLLECT_LIST:
			case T_CONCAT:
			case T_CONCAT_WS:
			case T_CONV:
			case T_CORR:
			case T_COS:
			case T_COUNT:
			case T_COVAR_POP:
			case T_COVAR_SAMP:
			case T_CRC32:
			case T_CURRENT_DATABASE:
			case T_DATE:
			case T_DATEADD:
			case T_DATEDIFF:
			case T_DATE_FORMAT:
			case T_DATESUB:
			case T_DAY:
			case T_DECODE:
			case T_DEGREES:
			case T_ELT:
			case T_ENCODE:
			case T_EXP:
			case T_EXPLODE:
			case T_FACTORIAL:
			case T_FIELD:
			case T_FIELD_IN_SET:
			case T_FLOOR:
			case T_FORMAT_NUMBER:
			case T_FROMUTCTIMESTAMP:
			case T_GET_JSON_OBJECTS:
			case T_HASH:
			case T_HEX:
			case T_HISTOGRAM_NUMERIC:
			case T_HOUR:
			case T_IF:
			case T_IN_FILE:
			case T_INITCAP:
			case T_INLINE:
			case T_IN_STR:
			case T_ISNOTNULL:
			case T_ISNULL:
			case T_NVL:
			case T_JAVA_METHOD:
			case T_LASTDAY:
			case T_LCASE:
			case T_LENGTH:
			case T_LEVENSHTEIN:
			case T_LOCATE:
			case T_LOG:
			case T_LOG10:
			case T_LOG2:
			case T_LOGGED_IN_USER:
			case T_LOWER:
			case T_LPAD:
			case T_LN:
			case T_LTRIM:
			case T_MAP:
			case T_MASK:
			case T_MASK_FIRST_N:
			case T_MASK_HASH:
			case T_MASK_LAST_N:
			case T_MASK_SHOW_FIRST_N:
			case T_MASK_SHOW_LAST_N:
			case T_MAX:
			case T_MD5:
			case T_MIN:
			case T_MINUTE:
			case T_MONTH:
			case T_MONTHS_BETWEEN:
			case T_NAMED_STRUCT:
			case T_NEGATIVE:
			case T_NEXT_DAY:
			case T_NOT:
			case T_NTILE:
			case T_NULLIF:
			case T_OCTET_LENGTH:
			case T_PARSE_URL:
			case T_PERCENT_RANK:
			case T_PERCENTILE:
			case T_PERCENTILE_APPROX:
			case T_PMOD:
			case T_POSITIVE:
			case T_POSEXPLODE:
			case T_POW:
			case T_POWER:
			case T_PRINTF:
			case T_QUARTER:
			case T_QUOTE:
			case T_RADIANS:
			case T_RAND:
			case T_REFLECT:
			case T_REGEXP_EXTRACT:
			case T_REGEXP_REPLACE:
			case T_REGR_AVGX:
			case T_REGR_AVGY:
			case T_REGR_COUNT:
			case T_REGR_INTERCEPT:
			case T_REGR_R2:
			case T_REGR_SLOPE:
			case T_REGR_SXX:
			case T_REGR_SXY:
			case T_REGR_SYY:
			case T_REPEAT:
			case T_REPLACE:
			case T_REVERSE:
			case T_ROUND:
			case T_RPAD:
			case T_RTRIM:
			case T_TRIM:
			case T_SECOND:
			case T_SENTENCES:
			case T_SHA:
			case T_SHA1:
			case T_SHA2:
			case T_SIGN:
			case T_SIN:
			case T_SOUNDEX:
			case T_SPACE:
			case T_SPLIT:
			case T_SQRT:
			case T_STDDEV_POP:
			case T_STDDEV_SAMP:
			case T_STR_TO_MAP:
			case T_STRUCT:
			case T_SUBSTR:
			case T_SUBSTRING:
			case T_SUBSTRING_INDEX:
			case T_SUM:
			case T_TAN:
			case T_TIMESTAMP:
			case T_TOUTCTIMESTAMP:
			case T_TRANSLATE:
			case T_TRUNC:
			case T_UCASE:
			case T_UNBASE64:
			case T_UNHEX:
			case T_UNIX_TIMESTAMP:
			case T_UPPER:
			case T_VERSION:
			case T_WEEKOFYEAR:
			case T_XPATH:
			case T_XPATH_BOOLEAN:
			case T_XPATH_DOUBLE:
			case T_XPATH_FLOAT:
			case T_XPATH_INT:
			case T_XPATH_LONG:
			case T_XPATH_NUMBER:
			case T_XPATH_SHORT:
			case T_XPATH_STRING:
			case T_YEAR:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_VAR_POP:
			case T_VAR_SAMP:
			case T_ADD:
			case T_MUL:
			case T_OPEN_P:
			case T_SUB:
			case IDENTIFIER:
			case INT_LITERAL:
			case DECIMAL_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				 ((Select_all_distinctContext)_localctx).res =  "ALL"; 
				}
				break;
			case T_ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(T_ALL);
				 ((Select_all_distinctContext)_localctx).res =  "ALL"; 
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				match(T_DISTINCT);
				 ((Select_all_distinctContext)_localctx).res =  "DISTINCT"; 
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

	public static class Select_expr_listContext extends ParserRuleContext {
		public vector<json> res;
		public Select_exprContext select_expr;
		public List<Select_exprContext> exprs = new ArrayList<Select_exprContext>();
		public List<Select_exprContext> select_expr() {
			return getRuleContexts(Select_exprContext.class);
		}
		public Select_exprContext select_expr(int i) {
			return getRuleContext(Select_exprContext.class,i);
		}
		public Select_expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expr_list; }
	}

	public final Select_expr_listContext select_expr_list() throws RecognitionException {
		Select_expr_listContext _localctx = new Select_expr_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_select_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<Select_exprContext*> exprs; 
			setState(399);
			((Select_expr_listContext)_localctx).select_expr = select_expr();
			((Select_expr_listContext)_localctx).exprs.add(((Select_expr_listContext)_localctx).select_expr);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(400);
				match(T_COMMA);
				setState(401);
				((Select_expr_listContext)_localctx).select_expr = select_expr();
				((Select_expr_listContext)_localctx).exprs.add(((Select_expr_listContext)_localctx).select_expr);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
			        vector<json> expr_list;
			        for(Select_exprContext* expr : ((Select_expr_listContext)_localctx).exprs) {expr_list.push_back(expr->res);}
			        ((Select_expr_listContext)_localctx).res =  expr_list; 
			        
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
		public Token IDENTIFIER;
		public Over_clauseContext over_clause;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HiveParser.IDENTIFIER, 0); }
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public Select_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expr; }
	}

	public final Select_exprContext select_expr() throws RecognitionException {
		Select_exprContext _localctx = new Select_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_select_expr);
		int _la;
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				((Select_exprContext)_localctx).expr = expr(0);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(410);
					match(T_AS);
					}
				}

				setState(413);
				((Select_exprContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res, (((Select_exprContext)_localctx).IDENTIFIER!=null?((Select_exprContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				((Select_exprContext)_localctx).expr = expr(0);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				((Select_exprContext)_localctx).expr = expr(0);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(420);
					match(T_AS);
					}
				}

				setState(423);
				((Select_exprContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res, (((Select_exprContext)_localctx).IDENTIFIER!=null?((Select_exprContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				((Select_exprContext)_localctx).expr = expr(0);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				match(T_MUL);
				 ((Select_exprContext)_localctx).res =  hql_select_all_expr(); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(431);
				((Select_exprContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(432);
				match(T__1);
				setState(433);
				match(T_MUL);
				 ((Select_exprContext)_localctx).res =  hql_select_all_expr((((Select_exprContext)_localctx).IDENTIFIER!=null?((Select_exprContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(435);
				((Select_exprContext)_localctx).over_clause = over_clause();
				 ((Select_exprContext)_localctx).res =  ((Select_exprContext)_localctx).over_clause.res; 
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

	public static class Over_clauseContext extends ParserRuleContext {
		public json res;
		public Over_funcContext over_func;
		public IdentContext ident;
		public List<IdentContext> ident_cntxt_list = new ArrayList<IdentContext>();
		public List<IdentContext> partition_cntxt_list = new ArrayList<IdentContext>();
		public List<IdentContext> order_cntxt_list = new ArrayList<IdentContext>();
		public Over_funcContext over_func() {
			return getRuleContext(Over_funcContext.class,0);
		}
		public TerminalNode T_OVER() { return getToken(HiveParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_PARTITION() { return getToken(HiveParser.T_PARTITION, 0); }
		public List<TerminalNode> T_BY() { return getTokens(HiveParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(HiveParser.T_BY, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_ORDER() { return getToken(HiveParser.T_ORDER, 0); }
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_over_clause);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 vector<IdentContext*> ident_cntxt_list; 
				setState(441);
				((Over_clauseContext)_localctx).over_func = over_func();
				setState(442);
				match(T_OVER);
				setState(443);
				match(T_OPEN_P);
				setState(444);
				match(T_PARTITION);
				setState(445);
				match(T_BY);
				setState(446);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(447);
					match(T_COMMA);
					setState(448);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(454);
				match(T_CLOSE_P);

				        vector<json> ident_json_list;
				        for(IdentContext* ident_context:((Over_clauseContext)_localctx).ident_cntxt_list)
				        {
				            ident_json_list.push_back(ident_context->res);
				        }
				        ((Over_clauseContext)_localctx).res =  hql_over_clause_partition(((Over_clauseContext)_localctx).over_func.res, ident_json_list);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 vector<IdentContext*> ident_cntxt_list; 
				setState(458);
				((Over_clauseContext)_localctx).over_func = over_func();
				setState(459);
				match(T_OVER);
				setState(460);
				match(T_OPEN_P);
				setState(461);
				match(T_ORDER);
				setState(462);
				match(T_BY);
				setState(463);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(464);
					match(T_COMMA);
					setState(465);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(471);
				match(T_CLOSE_P);

				        vector<json> ident_json_list;
				        for(IdentContext* ident_context:((Over_clauseContext)_localctx).ident_cntxt_list)
				        {
				            ident_json_list.push_back(ident_context->res);
				        }
				        ((Over_clauseContext)_localctx).res =  hql_over_clause_order(((Over_clauseContext)_localctx).over_func.res, ident_json_list);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 vector<IdentContext*> partition_cntxt_list; vector<IdentContext*> order_cntxt_list; 
				setState(475);
				((Over_clauseContext)_localctx).over_func = over_func();
				setState(476);
				match(T_OVER);
				setState(477);
				match(T_OPEN_P);
				setState(478);
				match(T_PARTITION);
				setState(479);
				match(T_BY);
				setState(480);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).partition_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(481);
					match(T_COMMA);
					setState(482);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).partition_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				match(T_ORDER);
				setState(489);
				match(T_BY);
				setState(490);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).order_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(491);
					match(T_COMMA);
					setState(492);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).order_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(498);
				match(T_CLOSE_P);

				        vector<json> partition_json_list; vector<json> order_json_list;
				        for(IdentContext* ident_context:((Over_clauseContext)_localctx).partition_cntxt_list)
				        {
				            partition_json_list.push_back(ident_context->res);
				        }
				        for(IdentContext* ident_context:((Over_clauseContext)_localctx).order_cntxt_list)
				        {
				            order_json_list.push_back(ident_context->res);
				        }
				        ((Over_clauseContext)_localctx).res =  hql_over_clause_partition_order(((Over_clauseContext)_localctx).over_func.res, partition_json_list, order_json_list);
				    
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

	public static class Over_funcContext extends ParserRuleContext {
		public json res;
		public Basic_aggr_funcContext basic_aggr_func;
		public Analytic_funcContext analytic_func;
		public Basic_aggr_funcContext basic_aggr_func() {
			return getRuleContext(Basic_aggr_funcContext.class,0);
		}
		public Analytic_funcContext analytic_func() {
			return getRuleContext(Analytic_funcContext.class,0);
		}
		public Over_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_func; }
	}

	public final Over_funcContext over_func() throws RecognitionException {
		Over_funcContext _localctx = new Over_funcContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_over_func);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
			case T_COUNT:
			case T_MAX:
			case T_MIN:
			case T_SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				((Over_funcContext)_localctx).basic_aggr_func = basic_aggr_func();
				 ((Over_funcContext)_localctx).res =  ((Over_funcContext)_localctx).basic_aggr_func.res; 
				}
				break;
			case T_PERCENT_RANK:
			case T_CUME_DIST:
			case T_DENSE_RANK:
			case T_RANK:
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				((Over_funcContext)_localctx).analytic_func = analytic_func();
				 ((Over_funcContext)_localctx).res =  ((Over_funcContext)_localctx).analytic_func.res; 
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

	public static class Analytic_funcContext extends ParserRuleContext {
		public json res;
		public Token func_name;
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public TerminalNode T_RANK() { return getToken(HiveParser.T_RANK, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HiveParser.T_DENSE_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HiveParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HiveParser.T_CUME_DIST, 0); }
		public TerminalNode T_PERCENT_RANK() { return getToken(HiveParser.T_PERCENT_RANK, 0); }
		public Analytic_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analytic_func; }
	}

	public final Analytic_funcContext analytic_func() throws RecognitionException {
		Analytic_funcContext _localctx = new Analytic_funcContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_analytic_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			((Analytic_funcContext)_localctx).func_name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T_PERCENT_RANK || ((((_la - 463)) & ~0x3f) == 0 && ((1L << (_la - 463)) & ((1L << (T_CUME_DIST - 463)) | (1L << (T_DENSE_RANK - 463)) | (1L << (T_RANK - 463)) | (1L << (T_ROW_NUMBER - 463)))) != 0)) ) {
				((Analytic_funcContext)_localctx).func_name = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(512);
			match(T_OPEN_P);
			setState(513);
			match(T_CLOSE_P);
			 ((Analytic_funcContext)_localctx).res =  hql_fixed_func((((Analytic_funcContext)_localctx).func_name!=null?((Analytic_funcContext)_localctx).func_name.getText():null)); 
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

	public static class Expr_listContext extends ParserRuleContext {
		public vector<json> res;
		public ExprContext expr;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> exprs; 
			setState(517);
			match(T_OPEN_P);
			setState(518);
			((Expr_listContext)_localctx).expr = expr(0);
			((Expr_listContext)_localctx).exprs.add(((Expr_listContext)_localctx).expr);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(519);
				match(T_COMMA);
				setState(520);
				((Expr_listContext)_localctx).expr = expr(0);
				((Expr_listContext)_localctx).exprs.add(((Expr_listContext)_localctx).expr);
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			match(T_CLOSE_P);

			        vector<json> expr_list_json;
			        for (ExprContext* exp_contxt : ((Expr_listContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
			        ((Expr_listContext)_localctx).res =  expr_list_json;
			    
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
		public ExprContext eval_expr;
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
		public Token op;
		public ExprContext r_expr;
		public ExprContext start_interval;
		public ExprContext end_interval;
		public Set_operators_likeContext set_operators_like;
		public Set_operators_isContext set_operators_is;
		public Token BOOL_LITERAL;
		public Set_operators_inContext set_operators_in;
		public Expr_listContext expr_list;
		public Select_stmtContext select_stmt;
		public Set_operators_existsContext set_operators_exists;
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
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HiveParser.T_OR, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HiveParser.T_BETWEEN, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public Set_operators_likeContext set_operators_like() {
			return getRuleContext(Set_operators_likeContext.class,0);
		}
		public Set_operators_isContext set_operators_is() {
			return getRuleContext(Set_operators_isContext.class,0);
		}
		public TerminalNode BOOL_LITERAL() { return getToken(HiveParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_CONST() { return getToken(HiveParser.NULL_CONST, 0); }
		public Set_operators_inContext set_operators_in() {
			return getRuleContext(Set_operators_inContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Set_operators_existsContext set_operators_exists() {
			return getRuleContext(Set_operators_existsContext.class,0);
		}
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(530);
				((ExprContext)_localctx).literal_values = literal_values();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).literal_values.res; 
				}
				break;
			case 2:
				{
				setState(533);
				((ExprContext)_localctx).ident = ident();
				 ((ExprContext)_localctx).res =   ((ExprContext)_localctx).ident.res; 
				}
				break;
			case 3:
				{
				setState(536);
				((ExprContext)_localctx).unary_operator = unary_operator();
				setState(537);
				((ExprContext)_localctx).expr = expr(11);
				 ((ExprContext)_localctx).res =  hql_unary_operator((((ExprContext)_localctx).unary_operator!=null?_input.getText(((ExprContext)_localctx).unary_operator.start,((ExprContext)_localctx).unary_operator.stop):null), ((ExprContext)_localctx).expr.res); 
				}
				break;
			case 4:
				{
				setState(540);
				match(T_OPEN_P);
				setState(541);
				((ExprContext)_localctx).expr = expr(0);
				setState(542);
				match(T_CLOSE_P);
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr.res; 
				}
				break;
			case 5:
				{
				setState(545);
				((ExprContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case 6:
				{
				setState(548);
				((ExprContext)_localctx).math_func = math_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).math_func.res; 
				}
				break;
			case 7:
				{
				setState(551);
				((ExprContext)_localctx).date_func = date_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).date_func.res; 
				}
				break;
			case 8:
				{
				setState(554);
				((ExprContext)_localctx).cond_func = cond_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).cond_func.res; 
				}
				break;
			case 9:
				{
				setState(557);
				((ExprContext)_localctx).str_func = str_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).str_func.res; 
				}
				break;
			case 10:
				{
				setState(560);
				((ExprContext)_localctx).expr_concat = expr_concat();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr_concat.res; 
				}
				break;
			case 11:
				{
				setState(563);
				((ExprContext)_localctx).misc_func = misc_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).misc_func.res; 
				}
				break;
			case 12:
				{
				setState(566);
				((ExprContext)_localctx).aggr_func = aggr_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).aggr_func.res; 
				}
				break;
			case 13:
				{
				setState(569);
				((ExprContext)_localctx).complex_types = complex_types();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).complex_types.res; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(658);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(574);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(575);
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
						setState(576);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(29);
						 ((ExprContext)_localctx).res =  hql_math_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(579);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(580);
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
						setState(581);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(28);
						 ((ExprContext)_localctx).res =  hql_math_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(584);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(585);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(586);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(27);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(589);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(590);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 498)) & ~0x3f) == 0 && ((1L << (_la - 498)) & ((1L << (T_GREATER - 498)) | (1L << (T_GREATEREQUAL - 498)) | (1L << (T_LESS - 498)) | (1L << (T_LESSEQUAL - 498)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(591);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(26);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(594);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(595);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || ((((_la - 494)) & ~0x3f) == 0 && ((1L << (_la - 494)) & ((1L << (T_EQUAL - 494)) | (1L << (T_EQUAL2 - 494)) | (1L << (T_NOTEQUAL - 494)) | (1L << (T_NOTEQUAL2 - 494)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(596);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(25);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(599);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(600);
						((ExprContext)_localctx).op = match(T_AND);
						setState(601);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(24);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(604);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(605);
						((ExprContext)_localctx).op = match(T_OR);
						setState(606);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(23);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(609);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(610);
						match(T_BETWEEN);
						setState(611);
						((ExprContext)_localctx).start_interval = ((ExprContext)_localctx).expr = expr(0);
						setState(612);
						match(T_AND);
						setState(613);
						((ExprContext)_localctx).end_interval = ((ExprContext)_localctx).expr = expr(20);
						 ((ExprContext)_localctx).res =  hql_between_expr(((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).start_interval.res, ((ExprContext)_localctx).end_interval.res, false); 
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(616);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(617);
						match(T_NOT);
						setState(618);
						match(T_BETWEEN);
						setState(619);
						((ExprContext)_localctx).start_interval = ((ExprContext)_localctx).expr = expr(0);
						setState(620);
						match(T_AND);
						setState(621);
						((ExprContext)_localctx).end_interval = ((ExprContext)_localctx).expr = expr(19);
						 ((ExprContext)_localctx).res =  hql_between_expr(((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).start_interval.res, ((ExprContext)_localctx).end_interval.res, true); 
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(624);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(625);
						((ExprContext)_localctx).set_operators_like = set_operators_like();
						setState(626);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(15);
						 ((ExprContext)_localctx).res =  hql_bool_operator(((ExprContext)_localctx).set_operators_like.res, ((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(629);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(630);
						((ExprContext)_localctx).set_operators_is = set_operators_is();
						setState(631);
						((ExprContext)_localctx).BOOL_LITERAL = match(BOOL_LITERAL);
						 ((ExprContext)_localctx).res =  hql_bool_operator(((ExprContext)_localctx).set_operators_is.res, ((ExprContext)_localctx).l_expr.res, hql_boolean_type((((ExprContext)_localctx).BOOL_LITERAL!=null?((ExprContext)_localctx).BOOL_LITERAL.getText():null))); 
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(634);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(635);
						((ExprContext)_localctx).set_operators_is = set_operators_is();
						setState(636);
						match(NULL_CONST);
						 ((ExprContext)_localctx).res =  hql_bool_operator(((ExprContext)_localctx).set_operators_is.res, ((ExprContext)_localctx).l_expr.res, hql_null_constant()); 
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(639);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(640);
						((ExprContext)_localctx).set_operators_in = set_operators_in();
						setState(641);
						((ExprContext)_localctx).expr_list = expr_list();
						 ((ExprContext)_localctx).res =  hql_set_operators_in(((ExprContext)_localctx).set_operators_in.res, ((ExprContext)_localctx).expr.res, ((ExprContext)_localctx).expr_list.res);  
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(644);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(645);
						((ExprContext)_localctx).set_operators_in = set_operators_in();
						setState(646);
						match(T_OPEN_P);
						setState(647);
						((ExprContext)_localctx).select_stmt = select_stmt();
						setState(648);
						match(T_CLOSE_P);
						 ((ExprContext)_localctx).res =  hql_set_operators_in(((ExprContext)_localctx).set_operators_in.res, ((ExprContext)_localctx).expr.res, ((ExprContext)_localctx).select_stmt.res); 
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(651);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(652);
						((ExprContext)_localctx).set_operators_exists = set_operators_exists();
						setState(653);
						match(T_OPEN_P);
						setState(654);
						((ExprContext)_localctx).select_stmt = select_stmt();
						setState(655);
						match(T_CLOSE_P);
						 ((ExprContext)_localctx).res =  hql_set_operators_in(((ExprContext)_localctx).set_operators_exists.res, ((ExprContext)_localctx).expr.res, ((ExprContext)_localctx).select_stmt.res); 
						}
						break;
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class Complex_typesContext extends ParserRuleContext {
		public json res;
		public Array_defContext array_def;
		public Map_defContext map_def;
		public Struct_defContext struct_def;
		public Named_struct_defContext named_struct_def;
		public IdentContext ident;
		public ExprContext expr;
		public Array_defContext array_def() {
			return getRuleContext(Array_defContext.class,0);
		}
		public Map_defContext map_def() {
			return getRuleContext(Map_defContext.class,0);
		}
		public Struct_defContext struct_def() {
			return getRuleContext(Struct_defContext.class,0);
		}
		public Named_struct_defContext named_struct_def() {
			return getRuleContext(Named_struct_defContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Complex_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_types; }
	}

	public final Complex_typesContext complex_types() throws RecognitionException {
		Complex_typesContext _localctx = new Complex_typesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_complex_types);
		try {
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				((Complex_typesContext)_localctx).array_def = array_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).array_def.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				((Complex_typesContext)_localctx).map_def = map_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).map_def.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				((Complex_typesContext)_localctx).struct_def = struct_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).struct_def.res; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				((Complex_typesContext)_localctx).named_struct_def = named_struct_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).named_struct_def.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(675);
				((Complex_typesContext)_localctx).ident = ident();
				setState(676);
				match(T_OPEN_SB);
				setState(677);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(678);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).ident.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(681);
				((Complex_typesContext)_localctx).array_def = array_def();
				setState(682);
				match(T_OPEN_SB);
				setState(683);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(684);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).array_def.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(687);
				((Complex_typesContext)_localctx).map_def = map_def();
				setState(688);
				match(T_OPEN_SB);
				setState(689);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(690);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).map_def.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(693);
				((Complex_typesContext)_localctx).ident = ident();
				setState(694);
				match(T__1);
				setState(695);
				((Complex_typesContext)_localctx).expr = expr(0);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).ident.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(698);
				((Complex_typesContext)_localctx).struct_def = struct_def();
				setState(699);
				match(T__1);
				setState(700);
				((Complex_typesContext)_localctx).expr = expr(0);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).struct_def.res, ((Complex_typesContext)_localctx).expr.res); 
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

	public static class Array_defContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public TerminalNode T_ARRAY() { return getToken(HiveParser.T_ARRAY, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Array_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_def; }
	}

	public final Array_defContext array_def() throws RecognitionException {
		Array_defContext _localctx = new Array_defContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> exprs; 
			setState(706);
			match(T_ARRAY);
			setState(707);
			match(T_OPEN_P);
			setState(708);
			((Array_defContext)_localctx).expr = expr(0);
			((Array_defContext)_localctx).exprs.add(((Array_defContext)_localctx).expr);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(709);
				match(T_COMMA);
				setState(710);
				((Array_defContext)_localctx).expr = expr(0);
				((Array_defContext)_localctx).exprs.add(((Array_defContext)_localctx).expr);
				}
				}
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(716);
			match(T_CLOSE_P);

			        vector<json> expr_list_json;
			        for (ExprContext* exp_contxt : ((Array_defContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
			        ((Array_defContext)_localctx).res =  hql_complx_typ_array(expr_list_json);
			    
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

	public static class Map_defContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public List<ExprContext> key_exprs = new ArrayList<ExprContext>();
		public List<ExprContext> val_exprs = new ArrayList<ExprContext>();
		public TerminalNode T_MAP() { return getToken(HiveParser.T_MAP, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Map_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_def; }
	}

	public final Map_defContext map_def() throws RecognitionException {
		Map_defContext _localctx = new Map_defContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_map_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> key_exprs; vector<ExprContext*> val_exprs; 
			setState(720);
			match(T_MAP);
			setState(721);
			match(T_OPEN_P);
			setState(722);
			((Map_defContext)_localctx).expr = expr(0);
			((Map_defContext)_localctx).key_exprs.add(((Map_defContext)_localctx).expr);
			setState(723);
			match(T_COMMA);
			setState(724);
			((Map_defContext)_localctx).expr = expr(0);
			((Map_defContext)_localctx).val_exprs.add(((Map_defContext)_localctx).expr);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(725);
				match(T_COMMA);
				setState(726);
				((Map_defContext)_localctx).expr = expr(0);
				((Map_defContext)_localctx).key_exprs.add(((Map_defContext)_localctx).expr);
				setState(727);
				match(T_COMMA);
				setState(728);
				((Map_defContext)_localctx).expr = expr(0);
				((Map_defContext)_localctx).val_exprs.add(((Map_defContext)_localctx).expr);
				}
				}
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(735);
			match(T_CLOSE_P);

			        vector<json> key_exprs_json; vector<json> val_exprs_json;
			        for(int i = 0 ; i < ((Map_defContext)_localctx).key_exprs.size() ; i++)
			        {
			            key_exprs_json.push_back(((Map_defContext)_localctx).key_exprs[i]->res);
			            val_exprs_json.push_back(((Map_defContext)_localctx).val_exprs[i]->res);
			        }
			        ((Map_defContext)_localctx).res =  hql_complx_typ_map(key_exprs_json, val_exprs_json);
			    
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

	public static class Struct_defContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public List<ExprContext> val_exprs = new ArrayList<ExprContext>();
		public TerminalNode T_STRUCT() { return getToken(HiveParser.T_STRUCT, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Struct_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_def; }
	}

	public final Struct_defContext struct_def() throws RecognitionException {
		Struct_defContext _localctx = new Struct_defContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_struct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> val_exprs; 
			setState(739);
			match(T_STRUCT);
			setState(740);
			match(T_OPEN_P);
			setState(741);
			((Struct_defContext)_localctx).expr = expr(0);
			((Struct_defContext)_localctx).val_exprs.add(((Struct_defContext)_localctx).expr);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(742);
				match(T_COMMA);
				setState(743);
				((Struct_defContext)_localctx).expr = expr(0);
				((Struct_defContext)_localctx).val_exprs.add(((Struct_defContext)_localctx).expr);
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(749);
			match(T_CLOSE_P);

			        vector<json> col_exprs_json; vector<json> val_exprs_json;
			        for(int i = 0 ; i < ((Struct_defContext)_localctx).val_exprs.size() ; i++)
			        {
			            col_exprs_json.push_back(hql_string_type("col" + to_string(i + 1)));
			            val_exprs_json.push_back(((Struct_defContext)_localctx).val_exprs[i]->res);
			        }
			        ((Struct_defContext)_localctx).res =  hql_complx_typ_struct(col_exprs_json, val_exprs_json);
			    
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

	public static class Named_struct_defContext extends ParserRuleContext {
		public json res;
		public ExprContext expr;
		public List<ExprContext> col_exprs = new ArrayList<ExprContext>();
		public List<ExprContext> val_exprs = new ArrayList<ExprContext>();
		public TerminalNode T_NAMED_STRUCT() { return getToken(HiveParser.T_NAMED_STRUCT, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Named_struct_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_struct_def; }
	}

	public final Named_struct_defContext named_struct_def() throws RecognitionException {
		Named_struct_defContext _localctx = new Named_struct_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_named_struct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> col_exprs; vector<ExprContext*> val_exprs; 
			setState(753);
			match(T_NAMED_STRUCT);
			setState(754);
			match(T_OPEN_P);
			setState(755);
			((Named_struct_defContext)_localctx).expr = expr(0);
			((Named_struct_defContext)_localctx).col_exprs.add(((Named_struct_defContext)_localctx).expr);
			setState(756);
			match(T_COMMA);
			setState(757);
			((Named_struct_defContext)_localctx).expr = expr(0);
			((Named_struct_defContext)_localctx).val_exprs.add(((Named_struct_defContext)_localctx).expr);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(758);
				match(T_COMMA);
				setState(759);
				((Named_struct_defContext)_localctx).expr = expr(0);
				((Named_struct_defContext)_localctx).col_exprs.add(((Named_struct_defContext)_localctx).expr);
				setState(760);
				match(T_COMMA);
				setState(761);
				((Named_struct_defContext)_localctx).expr = expr(0);
				((Named_struct_defContext)_localctx).val_exprs.add(((Named_struct_defContext)_localctx).expr);
				}
				}
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(768);
			match(T_CLOSE_P);

			        vector<json> col_exprs_json; vector<json> val_exprs_json;
			        for(int i = 0 ; i < ((Named_struct_defContext)_localctx).val_exprs.size() ; i++)
			        {
			            col_exprs_json.push_back(((Named_struct_defContext)_localctx).col_exprs[i]->res);
			            val_exprs_json.push_back(((Named_struct_defContext)_localctx).val_exprs[i]->res);
			        }
			        ((Named_struct_defContext)_localctx).res =  hql_complx_typ_struct(col_exprs_json, val_exprs_json);
			    
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
		enterRule(_localctx, 60, RULE_str_func);
		int _la;
		try {
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				match(T_ASCII);
				setState(772);
				match(T_OPEN_P);
				setState(773);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(774);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("ASCII", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				match(T_BASE64);
				setState(778);
				match(T_OPEN_P);
				setState(779);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(780);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("BASE64", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				match(T_CHARACTER_LENGTH);
				setState(784);
				match(T_OPEN_P);
				setState(785);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(786);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHARACTER_LENGTH", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				match(T_CHR);
				setState(790);
				match(T_OPEN_P);
				setState(791);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(792);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHR", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(796);
				match(T_CONCAT);
				setState(797);
				match(T_OPEN_P);
				setState(798);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(801); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(799);
					match(T_COMMA);
					setState(800);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(803); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(805);
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
				setState(809);
				match(T_CONCAT_WS);
				setState(810);
				match(T_OPEN_P);
				setState(811);
				((Str_funcContext)_localctx).sep = expr(0);
				setState(812);
				match(T_COMMA);
				setState(813);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(816); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(814);
					match(T_COMMA);
					setState(815);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(818); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(820);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("CONCAT","separator", ((Str_funcContext)_localctx).sep.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(823);
				match(T_DECODE);
				setState(824);
				match(T_OPEN_P);
				setState(825);
				((Str_funcContext)_localctx).expr_bin = expr(0);
				setState(826);
				match(T_COMMA);
				setState(827);
				((Str_funcContext)_localctx).expr_charset = expr(0);
				setState(828);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("DECODE", "binary_value", ((Str_funcContext)_localctx).expr_bin.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				 vector<ExprContext*> exprs; 
				setState(832);
				match(T_ELT);
				setState(833);
				match(T_OPEN_P);
				setState(834);
				((Str_funcContext)_localctx).index_num = expr(0);
				setState(835);
				match(T_COMMA);
				setState(836);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(837);
					match(T_COMMA);
					setState(838);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(844);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("ELT","index_num", ((Str_funcContext)_localctx).index_num.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(847);
				match(T_ENCODE);
				setState(848);
				match(T_OPEN_P);
				setState(849);
				((Str_funcContext)_localctx).expr_str = expr(0);
				setState(850);
				match(T_COMMA);
				setState(851);
				((Str_funcContext)_localctx).expr_charset = expr(0);
				setState(852);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("ENCODE", "str_value", ((Str_funcContext)_localctx).expr_str.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				 vector<ExprContext*> exprs; 
				setState(856);
				match(T_FIELD);
				setState(857);
				match(T_OPEN_P);
				setState(858);
				((Str_funcContext)_localctx).expr_val = expr(0);
				setState(859);
				match(T_COMMA);
				setState(860);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(861);
					match(T_COMMA);
					setState(862);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(867);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(868);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("FIELD","expr_val", ((Str_funcContext)_localctx).expr_val.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(871);
				match(T_FIELD_IN_SET);
				setState(872);
				match(T_OPEN_P);
				setState(873);
				((Str_funcContext)_localctx).expr_str = expr(0);
				setState(874);
				match(T_COMMA);
				setState(875);
				((Str_funcContext)_localctx).expr_str_list = expr(0);
				setState(876);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FIELD_IN_SET", "str_value", ((Str_funcContext)_localctx).expr_str.res, "str_list", ((Str_funcContext)_localctx).expr_str_list.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(879);
				match(T_FORMAT_NUMBER);
				setState(880);
				match(T_OPEN_P);
				setState(881);
				((Str_funcContext)_localctx).number_expr = expr(0);
				setState(882);
				match(T_COMMA);
				setState(883);
				((Str_funcContext)_localctx).int_expr = expr(0);
				setState(884);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FORMAT_NUMBER", "number", ((Str_funcContext)_localctx).number_expr.res, "decimal_places", ((Str_funcContext)_localctx).int_expr.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(887);
				match(T_GET_JSON_OBJECTS);
				setState(888);
				match(T_OPEN_P);
				setState(889);
				((Str_funcContext)_localctx).json_string = expr(0);
				setState(890);
				match(T_COMMA);
				setState(891);
				((Str_funcContext)_localctx).path_expr = expr(0);
				setState(892);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("GET_JSON_OBJECTS", "json_string", ((Str_funcContext)_localctx).json_string.res, "path", ((Str_funcContext)_localctx).path_expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(895);
				match(T_IN_FILE);
				setState(896);
				match(T_OPEN_P);
				setState(897);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(898);
				match(T_COMMA);
				setState(899);
				((Str_funcContext)_localctx).filename = expr(0);
				setState(900);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_FILE", "string", ((Str_funcContext)_localctx).str_expr.res, "filename", ((Str_funcContext)_localctx).filename.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(903);
				match(T_IN_STR);
				setState(904);
				match(T_OPEN_P);
				setState(905);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(906);
				match(T_COMMA);
				setState(907);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(908);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_STR", "string", ((Str_funcContext)_localctx).str_expr.res, "substring", ((Str_funcContext)_localctx).substr_expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(911);
				match(T_LENGTH);
				setState(912);
				match(T_OPEN_P);
				setState(913);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(914);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(917);
				match(T_LOCATE);
				setState(918);
				match(T_OPEN_P);
				setState(919);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(920);
				match(T_COMMA);
				setState(921);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(922);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(925);
				match(T_LOCATE);
				setState(926);
				match(T_OPEN_P);
				setState(927);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(928);
				match(T_COMMA);
				setState(929);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(930);
				match(T_COMMA);
				setState(931);
				((Str_funcContext)_localctx).pos = expr(0);
				setState(932);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res,"position", ((Str_funcContext)_localctx).pos.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(935);
				_la = _input.LA(1);
				if ( !(_la==T_LCASE || _la==T_LOWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(936);
				match(T_OPEN_P);
				setState(937);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(938);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LOWER_CASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(941);
				match(T_LPAD);
				setState(942);
				match(T_OPEN_P);
				setState(943);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(944);
				match(T_COMMA);
				setState(945);
				((Str_funcContext)_localctx).len = expr(0);
				setState(946);
				match(T_COMMA);
				setState(947);
				((Str_funcContext)_localctx).pad = expr(0);
				setState(948);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(951);
				match(T_LTRIM);
				setState(952);
				match(T_OPEN_P);
				setState(953);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(954);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(957);
				match(T_OCTET_LENGTH);
				setState(958);
				match(T_OPEN_P);
				setState(959);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(960);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("OCTET_LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(963);
				match(T_PARSE_URL);
				setState(964);
				match(T_OPEN_P);
				setState(965);
				((Str_funcContext)_localctx).url_str = expr(0);
				setState(966);
				match(T_COMMA);
				setState(967);
				((Str_funcContext)_localctx).part_to_extract = expr(0);
				setState(968);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(971);
				match(T_PARSE_URL);
				setState(972);
				match(T_OPEN_P);
				setState(973);
				((Str_funcContext)_localctx).url_str = expr(0);
				setState(974);
				match(T_COMMA);
				setState(975);
				((Str_funcContext)_localctx).part_to_extract = expr(0);
				setState(976);
				match(T_COMMA);
				setState(977);
				((Str_funcContext)_localctx).key_to_extract = expr(0);
				setState(978);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res, "key_to_extract", ((Str_funcContext)_localctx).key_to_extract.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				 vector<ExprContext*> exprs; 
				setState(982);
				match(T_PRINTF);
				setState(983);
				match(T_OPEN_P);
				setState(984);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(985);
				match(T_COMMA);
				setState(986);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(989); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(987);
					match(T_COMMA);
					setState(988);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(991); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(993);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("PRINTF","string", ((Str_funcContext)_localctx).str_expr.res, "object_list",expr_list_json);
				    
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(996);
				match(T_QUOTE);
				setState(997);
				match(T_OPEN_P);
				setState(998);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(999);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("QUOTE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1002);
				match(T_REGEXP_EXTRACT);
				setState(1003);
				match(T_OPEN_P);
				setState(1004);
				((Str_funcContext)_localctx).subject = expr(0);
				setState(1005);
				match(T_COMMA);
				setState(1006);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(1007);
				match(T_COMMA);
				setState(1008);
				((Str_funcContext)_localctx).index = expr(0);
				setState(1009);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_EXTRACT", "subject", ((Str_funcContext)_localctx).subject.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"index", ((Str_funcContext)_localctx).index.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1012);
				match(T_REGEXP_REPLACE);
				setState(1013);
				match(T_OPEN_P);
				setState(1014);
				((Str_funcContext)_localctx).initial_string = expr(0);
				setState(1015);
				match(T_COMMA);
				setState(1016);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(1017);
				match(T_COMMA);
				setState(1018);
				((Str_funcContext)_localctx).replacement = expr(0);
				setState(1019);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_REPLACE", "initial_string", ((Str_funcContext)_localctx).initial_string.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"replacement", ((Str_funcContext)_localctx).replacement.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1022);
				match(T_REPEAT);
				setState(1023);
				match(T_OPEN_P);
				setState(1024);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1025);
				match(T_COMMA);
				setState(1026);
				((Str_funcContext)_localctx).n_times_expr = expr(0);
				setState(1027);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("REPEAT", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_times_expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1030);
				match(T_REPLACE);
				setState(1031);
				match(T_OPEN_P);
				setState(1032);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1033);
				match(T_COMMA);
				setState(1034);
				((Str_funcContext)_localctx).old = expr(0);
				setState(1035);
				match(T_COMMA);
				setState(1036);
				((Str_funcContext)_localctx).new_expr = expr(0);
				setState(1037);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REPLACE", "string", ((Str_funcContext)_localctx).str_expr.res, "old", ((Str_funcContext)_localctx).old.res,"new", ((Str_funcContext)_localctx).new_expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1040);
				match(T_REVERSE);
				setState(1041);
				match(T_OPEN_P);
				setState(1042);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1043);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("REVERSE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1046);
				match(T_RPAD);
				setState(1047);
				match(T_OPEN_P);
				setState(1048);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1049);
				match(T_COMMA);
				setState(1050);
				((Str_funcContext)_localctx).len = expr(0);
				setState(1051);
				match(T_COMMA);
				setState(1052);
				((Str_funcContext)_localctx).pad = expr(0);
				setState(1053);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("RPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1056);
				match(T_RTRIM);
				setState(1057);
				match(T_OPEN_P);
				setState(1058);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1059);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("RTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1062);
				match(T_SENTENCES);
				setState(1063);
				match(T_OPEN_P);
				setState(1064);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1065);
				match(T_COMMA);
				setState(1066);
				((Str_funcContext)_localctx).lang_expr = expr(0);
				setState(1067);
				match(T_COMMA);
				setState(1068);
				((Str_funcContext)_localctx).locale_expr = expr(0);
				setState(1069);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SENTENCES", "string", ((Str_funcContext)_localctx).str_expr.res, "lang", ((Str_funcContext)_localctx).lang_expr.res, "locale", ((Str_funcContext)_localctx).locale_expr.res); 
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1072);
				match(T_SPACE);
				setState(1073);
				match(T_OPEN_P);
				setState(1074);
				((Str_funcContext)_localctx).size_expr = expr(0);
				setState(1075);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SPACE", "size", ((Str_funcContext)_localctx).size_expr.res); 
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1078);
				match(T_SPLIT);
				setState(1079);
				match(T_OPEN_P);
				setState(1080);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1081);
				match(T_COMMA);
				setState(1082);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(1083);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SPLIT", "string", ((Str_funcContext)_localctx).str_expr.res, "pattern", ((Str_funcContext)_localctx).pattern.res); 
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1086);
				match(T_STR_TO_MAP);
				setState(1087);
				match(T_OPEN_P);
				setState(1088);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1089);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", hql_string_type(";"), "delimiter2", hql_string_type(":")); 
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1092);
				match(T_STR_TO_MAP);
				setState(1093);
				match(T_OPEN_P);
				setState(1094);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1095);
				match(T_COMMA);
				setState(1096);
				((Str_funcContext)_localctx).delimiter1 = expr(0);
				setState(1097);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2", hql_string_type(":")); 
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1100);
				match(T_STR_TO_MAP);
				setState(1101);
				match(T_OPEN_P);
				setState(1102);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1103);
				match(T_COMMA);
				setState(1104);
				((Str_funcContext)_localctx).delimiter1 = expr(0);
				setState(1105);
				match(T_COMMA);
				setState(1106);
				((Str_funcContext)_localctx).delimiter2 = expr(0);
				setState(1107);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2",((Str_funcContext)_localctx).delimiter2.res); 
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1110);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1111);
				match(T_OPEN_P);
				setState(1112);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1113);
				match(T_COMMA);
				setState(1114);
				((Str_funcContext)_localctx).start_indx = expr(0);
				setState(1115);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res); 
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1118);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1119);
				match(T_OPEN_P);
				setState(1120);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1121);
				match(T_COMMA);
				setState(1122);
				((Str_funcContext)_localctx).start_indx = expr(0);
				setState(1123);
				match(T_COMMA);
				setState(1124);
				((Str_funcContext)_localctx).lenght_expr = expr(0);
				setState(1125);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res, "length", ((Str_funcContext)_localctx).lenght_expr.res); 
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1128);
				match(T_SUBSTRING_INDEX);
				setState(1129);
				match(T_OPEN_P);
				setState(1130);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1131);
				match(T_COMMA);
				setState(1132);
				((Str_funcContext)_localctx).delimiter = expr(0);
				setState(1133);
				match(T_COMMA);
				setState(1134);
				((Str_funcContext)_localctx).count = expr(0);
				setState(1135);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING_INDEX", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter", ((Str_funcContext)_localctx).delimiter.res, "count", ((Str_funcContext)_localctx).count.res); 
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1138);
				match(T_TRANSLATE);
				setState(1139);
				match(T_OPEN_P);
				setState(1140);
				((Str_funcContext)_localctx).input_expr = expr(0);
				setState(1141);
				match(T_COMMA);
				setState(1142);
				((Str_funcContext)_localctx).from_expr = expr(0);
				setState(1143);
				match(T_COMMA);
				setState(1144);
				((Str_funcContext)_localctx).to_expr = expr(0);
				setState(1145);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("TRANSLATE", "input", ((Str_funcContext)_localctx).input_expr.res, "from", ((Str_funcContext)_localctx).from_expr.res, "to", ((Str_funcContext)_localctx).to_expr.res); 
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1148);
				match(T_TRIM);
				setState(1149);
				match(T_OPEN_P);
				setState(1150);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1151);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("TRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1154);
				match(T_UNBASE64);
				setState(1155);
				match(T_OPEN_P);
				setState(1156);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1157);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UNBASE64", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(1160);
				_la = _input.LA(1);
				if ( !(_la==T_UCASE || _la==T_UPPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1161);
				match(T_OPEN_P);
				setState(1162);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1163);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UPPERCASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(1166);
				match(T_INITCAP);
				setState(1167);
				match(T_OPEN_P);
				setState(1168);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1169);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("INITCAP", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(1172);
				match(T_LEVENSHTEIN);
				setState(1173);
				match(T_OPEN_P);
				setState(1174);
				((Str_funcContext)_localctx).strA_expr = expr(0);
				setState(1175);
				match(T_COMMA);
				setState(1176);
				((Str_funcContext)_localctx).strB_expr = expr(0);
				setState(1177);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LEVENSHTEIN", "string_A", ((Str_funcContext)_localctx).strA_expr.res, "string_B", ((Str_funcContext)_localctx).strB_expr.res); 
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(1180);
				match(T_SOUNDEX);
				setState(1181);
				match(T_OPEN_P);
				setState(1182);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1183);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SOUNDEX", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(1186);
				match(T_MASK);
				setState(1187);
				match(T_OPEN_P);
				setState(1188);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1189);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(1192);
				match(T_MASK);
				setState(1193);
				match(T_OPEN_P);
				setState(1194);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1195);
				match(T_COMMA);
				setState(1196);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(1197);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res); 
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(1200);
				match(T_MASK);
				setState(1201);
				match(T_OPEN_P);
				setState(1202);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1203);
				match(T_COMMA);
				setState(1204);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(1205);
				match(T_COMMA);
				setState(1206);
				((Str_funcContext)_localctx).str_lower_expr = expr(0);
				setState(1207);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res); 
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(1210);
				match(T_MASK);
				setState(1211);
				match(T_OPEN_P);
				setState(1212);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1213);
				match(T_COMMA);
				setState(1214);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(1215);
				match(T_COMMA);
				setState(1216);
				((Str_funcContext)_localctx).str_lower_expr = expr(0);
				setState(1217);
				match(T_COMMA);
				setState(1218);
				((Str_funcContext)_localctx).str_number_expr = expr(0);
				setState(1219);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_four_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res, "number", ((Str_funcContext)_localctx).str_number_expr.res); 
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(1222);
				match(T_MASK_FIRST_N);
				setState(1223);
				match(T_OPEN_P);
				setState(1224);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1225);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(1228);
				match(T_MASK_FIRST_N);
				setState(1229);
				match(T_OPEN_P);
				setState(1230);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1231);
				match(T_COMMA);
				setState(1232);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(1233);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(1236);
				match(T_MASK_LAST_N);
				setState(1237);
				match(T_OPEN_P);
				setState(1238);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1239);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(1242);
				match(T_MASK_LAST_N);
				setState(1243);
				match(T_OPEN_P);
				setState(1244);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1245);
				match(T_COMMA);
				setState(1246);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(1247);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(1250);
				match(T_MASK_SHOW_FIRST_N);
				setState(1251);
				match(T_OPEN_P);
				setState(1252);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1253);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(1256);
				match(T_MASK_SHOW_FIRST_N);
				setState(1257);
				match(T_OPEN_P);
				setState(1258);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1259);
				match(T_COMMA);
				setState(1260);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(1261);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(1264);
				match(T_MASK_SHOW_LAST_N);
				setState(1265);
				match(T_OPEN_P);
				setState(1266);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1267);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(1270);
				match(T_MASK_SHOW_LAST_N);
				setState(1271);
				match(T_OPEN_P);
				setState(1272);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1273);
				match(T_COMMA);
				setState(1274);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(1275);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(1278);
				match(T_MASK_HASH);
				setState(1279);
				match(T_OPEN_P);
				setState(1280);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1281);
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
		enterRule(_localctx, 62, RULE_misc_func);
		int _la;
		try {
			setState(1386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_JAVA_METHOD:
				enterOuterAlt(_localctx, 1);
				{
				 vector<ExprContext*> exprs; 
				setState(1287);
				match(T_JAVA_METHOD);
				setState(1288);
				match(T_OPEN_P);
				setState(1289);
				((Misc_funcContext)_localctx).class_name_expr = expr(0);
				setState(1290);
				match(T_COMMA);
				setState(1291);
				((Misc_funcContext)_localctx).method_name_expr = expr(0);
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1292);
					match(T_COMMA);
					setState(1293);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(1298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1299);
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
				setState(1303);
				match(T_REFLECT);
				setState(1304);
				match(T_OPEN_P);
				setState(1305);
				((Misc_funcContext)_localctx).class_name_expr = expr(0);
				setState(1306);
				match(T_COMMA);
				setState(1307);
				((Misc_funcContext)_localctx).method_name_expr = expr(0);
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1308);
					match(T_COMMA);
					setState(1309);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(1314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1315);
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
				setState(1319);
				match(T_HASH);
				setState(1320);
				match(T_OPEN_P);
				setState(1321);
				((Misc_funcContext)_localctx).expr = expr(0);
				((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1322);
					match(T_COMMA);
					setState(1323);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(1328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1329);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Misc_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Misc_funcContext)_localctx).res =  hql_list_param_func("HASH", "expr_list", expr_list_json);
				    
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1332);
				match(T_CURRENT_USER);
				setState(1333);
				match(T_OPEN_P);
				setState(1334);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("CURRENT_USER"); 
				}
				break;
			case T_LOGGED_IN_USER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1336);
				match(T_LOGGED_IN_USER);
				setState(1337);
				match(T_OPEN_P);
				setState(1338);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("LOGGED_IN_USER"); 
				}
				break;
			case T_CURRENT_DATABASE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1340);
				match(T_CURRENT_DATABASE);
				setState(1341);
				match(T_OPEN_P);
				setState(1342);
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
				setState(1344);
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
				setState(1345);
				match(T_OPEN_P);
				setState(1346);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(1347);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_single_param_func((((Misc_funcContext)_localctx).f_name!=null?((Misc_funcContext)_localctx).f_name.getText():null), "string", ((Misc_funcContext)_localctx).str_expr.res); 
				}
				break;
			case T_SHA2:
				enterOuterAlt(_localctx, 8);
				{
				setState(1350);
				match(T_SHA2);
				setState(1351);
				match(T_OPEN_P);
				setState(1352);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(1353);
				match(T_COMMA);
				setState(1354);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(1355);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "string", ((Misc_funcContext)_localctx).str_expr.res, "hash_size", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_ENCRYPT:
				enterOuterAlt(_localctx, 9);
				{
				setState(1358);
				match(T_AES_ENCRYPT);
				setState(1359);
				match(T_OPEN_P);
				setState(1360);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(1361);
				match(T_COMMA);
				setState(1362);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(1363);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_DECRYPT:
				enterOuterAlt(_localctx, 10);
				{
				setState(1366);
				match(T_AES_DECRYPT);
				setState(1367);
				match(T_OPEN_P);
				setState(1368);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(1369);
				match(T_COMMA);
				setState(1370);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(1371);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_VERSION:
				enterOuterAlt(_localctx, 11);
				{
				setState(1374);
				match(T_VERSION);
				setState(1375);
				match(T_OPEN_P);
				setState(1376);
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
				setState(1378);
				((Misc_funcContext)_localctx).f_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 451)) & ~0x3f) == 0 && ((1L << (_la - 451)) & ((1L << (T_XPATH - 451)) | (1L << (T_XPATH_BOOLEAN - 451)) | (1L << (T_XPATH_DOUBLE - 451)) | (1L << (T_XPATH_FLOAT - 451)) | (1L << (T_XPATH_INT - 451)) | (1L << (T_XPATH_LONG - 451)) | (1L << (T_XPATH_NUMBER - 451)) | (1L << (T_XPATH_SHORT - 451)) | (1L << (T_XPATH_STRING - 451)))) != 0)) ) {
					((Misc_funcContext)_localctx).f_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1379);
				match(T_OPEN_P);
				setState(1380);
				((Misc_funcContext)_localctx).xml_str_expr = expr(0);
				setState(1381);
				match(T_COMMA);
				setState(1382);
				((Misc_funcContext)_localctx).xpath_expr_str = expr(0);
				setState(1383);
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
		enterRule(_localctx, 64, RULE_expr_concat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 vector<Expr_concat_itemContext*> exprs; 
			setState(1389);
			((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
			((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
			setState(1392); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1390);
					match(T_PIPE);
					setState(1391);
					((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
					((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1394); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

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
		enterRule(_localctx, 66, RULE_expr_concat_item);
		try {
			setState(1430);
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
				setState(1398);
				((Expr_concat_itemContext)_localctx).literal_values = literal_values();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).literal_values.res; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
				((Expr_concat_itemContext)_localctx).ident = ident();
				 ((Expr_concat_itemContext)_localctx).res =   ((Expr_concat_itemContext)_localctx).ident.res; 
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 3);
				{
				setState(1404);
				match(T_OPEN_P);
				setState(1405);
				((Expr_concat_itemContext)_localctx).expr = expr(0);
				setState(1406);
				match(T_CLOSE_P);
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr.res; 
				}
				break;
			case T_BINARY:
			case T_CAST:
				enterOuterAlt(_localctx, 4);
				{
				setState(1409);
				((Expr_concat_itemContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case T__7:
			case T__8:
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
				setState(1412);
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
				setState(1415);
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
				setState(1418);
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
				setState(1421);
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
				setState(1424);
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
				setState(1427);
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
		enterRule(_localctx, 68, RULE_cond_func);
		int _la;
		try {
			setState(1555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1432);
				match(T_IF);
				setState(1433);
				match(T_OPEN_P);
				setState(1434);
				((Cond_funcContext)_localctx).test_cond = expr(0);
				setState(1435);
				match(T_COMMA);
				setState(1436);
				((Cond_funcContext)_localctx).valueTrue = expr(0);
				setState(1437);
				match(T_COMMA);
				setState(1438);
				((Cond_funcContext)_localctx).valueFalse = expr(0);
				setState(1439);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_three_param_func("IF", "test_cond", ((Cond_funcContext)_localctx).test_cond.res, "value_true", ((Cond_funcContext)_localctx).valueTrue.res, "value_false", ((Cond_funcContext)_localctx).valueFalse.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				match(T_ISNULL);
				setState(1443);
				match(T_OPEN_P);
				setState(1444);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(1445);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1448);
				match(T_ISNOTNULL);
				setState(1449);
				match(T_OPEN_P);
				setState(1450);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(1451);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNOTNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1454);
				match(T_NVL);
				setState(1455);
				match(T_OPEN_P);
				setState(1456);
				((Cond_funcContext)_localctx).expr_val = expr(0);
				setState(1457);
				match(T_COMMA);
				setState(1458);
				((Cond_funcContext)_localctx).default_val = expr(0);
				setState(1459);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NVL", "expr_val", ((Cond_funcContext)_localctx).expr_val.res, "default_val", ((Cond_funcContext)_localctx).default_val.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(1463);
				match(T_COALESCE);
				setState(1464);
				match(T_OPEN_P);
				{
				setState(1465);
				((Cond_funcContext)_localctx).expr = expr(0);
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				}
				{
				setState(1466);
				match(T_COMMA);
				setState(1467);
				((Cond_funcContext)_localctx).expr = expr(0);
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				}
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1469);
					match(T_COMMA);
					setState(1470);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(1475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1476);
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
				setState(1480);
				match(T_CASE);
				setState(1481);
				((Cond_funcContext)_localctx).case_expr = expr(0);
				setState(1487); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1482);
					match(T_WHEN);
					setState(1483);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(1484);
					match(T_THEN);
					setState(1485);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(1489); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(1491);
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
				setState(1495);
				match(T_CASE);
				setState(1496);
				((Cond_funcContext)_localctx).case_expr = expr(0);
				setState(1502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1497);
					match(T_WHEN);
					setState(1498);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(1499);
					match(T_THEN);
					setState(1500);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(1504); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(1506);
				match(T_ELSE);
				setState(1507);
				((Cond_funcContext)_localctx).els_expr = expr(0);
				setState(1508);
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
				setState(1512);
				match(T_CASE);
				setState(1518); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1513);
					match(T_WHEN);
					setState(1514);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(1515);
					match(T_THEN);
					setState(1516);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(1520); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(1522);
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
				setState(1526);
				match(T_CASE);
				setState(1532); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1527);
					match(T_WHEN);
					setState(1528);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(1529);
					match(T_THEN);
					setState(1530);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(1534); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(1536);
				match(T_ELSE);
				setState(1537);
				((Cond_funcContext)_localctx).els_expr = expr(0);
				setState(1538);
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
				setState(1541);
				match(T_NULLIF);
				setState(1542);
				match(T_OPEN_P);
				setState(1543);
				((Cond_funcContext)_localctx).a_expr = expr(0);
				setState(1544);
				match(T_COMMA);
				setState(1545);
				((Cond_funcContext)_localctx).b_expr = expr(0);
				setState(1546);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NULLIF", "a_expr", ((Cond_funcContext)_localctx).a_expr.res, "b_expr", ((Cond_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1549);
				match(T_ASSERT_TRUE);
				setState(1550);
				match(T_OPEN_P);
				setState(1551);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(1552);
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
		enterRule(_localctx, 70, RULE_date_func);
		try {
			setState(1733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				match(T_UNIX_TIMESTAMP);
				setState(1558);
				match(T_OPEN_P);
				setState(1559);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("UNIX_TIMESTAMP"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
				match(T_UNIX_TIMESTAMP);
				setState(1562);
				match(T_OPEN_P);
				setState(1563);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1564);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1567);
				match(T_UNIX_TIMESTAMP);
				setState(1568);
				match(T_OPEN_P);
				setState(1569);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1570);
				match(T_COMMA);
				setState(1571);
				((Date_funcContext)_localctx).pattern_expr = expr(0);
				setState(1572);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res, "pattern", ((Date_funcContext)_localctx).pattern_expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1575);
				match(T_YEAR);
				setState(1576);
				match(T_OPEN_P);
				setState(1577);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1578);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("YEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1581);
				match(T_QUARTER);
				setState(1582);
				match(T_OPEN_P);
				setState(1583);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1584);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("QUARTER", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1587);
				match(T_MONTH);
				setState(1588);
				match(T_OPEN_P);
				setState(1589);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1590);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MONTH", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1593);
				match(T_DAY);
				setState(1594);
				match(T_OPEN_P);
				setState(1595);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1596);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1599);
				match(T_HOUR);
				setState(1600);
				match(T_OPEN_P);
				setState(1601);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1602);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("HOUR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1605);
				match(T_MINUTE);
				setState(1606);
				match(T_OPEN_P);
				setState(1607);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1608);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MINUTE", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1611);
				match(T_SECOND);
				setState(1612);
				match(T_OPEN_P);
				setState(1613);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1614);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("SECOND", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1617);
				match(T_WEEKOFYEAR);
				setState(1618);
				match(T_OPEN_P);
				setState(1619);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1620);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("WEEKOFYEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1623);
				match(T_DATEDIFF);
				setState(1624);
				match(T_OPEN_P);
				setState(1625);
				((Date_funcContext)_localctx).enddate = expr(0);
				setState(1626);
				match(T_COMMA);
				setState(1627);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(1628);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "enddate", ((Date_funcContext)_localctx).enddate.res, "startdate", ((Date_funcContext)_localctx).startdate.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1631);
				match(T_DATEADD);
				setState(1632);
				match(T_OPEN_P);
				setState(1633);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(1634);
				match(T_COMMA);
				setState(1635);
				((Date_funcContext)_localctx).days = expr(0);
				setState(1636);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1639);
				match(T_DATESUB);
				setState(1640);
				match(T_OPEN_P);
				setState(1641);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(1642);
				match(T_COMMA);
				setState(1643);
				((Date_funcContext)_localctx).days = expr(0);
				setState(1644);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1647);
				match(T_TOUTCTIMESTAMP);
				setState(1648);
				match(T_OPEN_P);
				setState(1649);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(1650);
				match(T_COMMA);
				setState(1651);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(1652);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TO_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1655);
				match(T_FROMUTCTIMESTAMP);
				setState(1656);
				match(T_OPEN_P);
				setState(1657);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(1658);
				match(T_COMMA);
				setState(1659);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(1660);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("FROM_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1663);
				match(T_CURRENT_DATE);
				setState(1666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(1664);
					match(T_OPEN_P);
					setState(1665);
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
				setState(1669);
				match(T_CURRENT_TIMESTAMP);
				setState(1672);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(1670);
					match(T_OPEN_P);
					setState(1671);
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
				setState(1675);
				match(T_ADD_MONTHS);
				setState(1676);
				match(T_OPEN_P);
				setState(1677);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(1678);
				match(T_COMMA);
				setState(1679);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(1680);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1683);
				match(T_ADD_MONTHS);
				setState(1684);
				match(T_OPEN_P);
				setState(1685);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(1686);
				match(T_COMMA);
				setState(1687);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(1688);
				match(T_COMMA);
				setState(1689);
				((Date_funcContext)_localctx).out_date_format = expr(0);
				setState(1690);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_three_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res, "out_date_format", ((Date_funcContext)_localctx).out_date_format.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1693);
				match(T_LASTDAY);
				setState(1694);
				match(T_OPEN_P);
				setState(1695);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1696);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("LAST_DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1699);
				match(T_NEXT_DAY);
				setState(1700);
				match(T_OPEN_P);
				setState(1701);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(1702);
				match(T_COMMA);
				setState(1703);
				((Date_funcContext)_localctx).day_of_week = expr(0);
				setState(1704);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("NEXT_DAY", "startdate", ((Date_funcContext)_localctx).startdate.res, "day_of_week", ((Date_funcContext)_localctx).day_of_week.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1707);
				match(T_TRUNC);
				setState(1708);
				match(T_OPEN_P);
				setState(1709);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1710);
				match(T_COMMA);
				setState(1711);
				((Date_funcContext)_localctx).format = expr(0);
				setState(1712);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TRUNC", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1715);
				match(T_MONTHS_BETWEEN);
				setState(1716);
				match(T_OPEN_P);
				setState(1717);
				((Date_funcContext)_localctx).date1 = expr(0);
				setState(1718);
				match(T_COMMA);
				setState(1719);
				((Date_funcContext)_localctx).date2 = expr(0);
				setState(1720);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("MONTHS_BETWEEN", "date1", ((Date_funcContext)_localctx).date1.res, "date2", ((Date_funcContext)_localctx).date2.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1723);
				match(T_DATE_FORMAT);
				setState(1724);
				match(T_OPEN_P);
				setState(1725);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(1726);
				match(T_COMMA);
				setState(1727);
				((Date_funcContext)_localctx).format = expr(0);
				setState(1728);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATE_FORMAT", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1731);
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
		enterRule(_localctx, 72, RULE_dat_convrt_func);
		int _la;
		try {
			setState(1752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1735);
				match(T_CAST);
				setState(1736);
				match(T_OPEN_P);
				setState(1737);
				((Dat_convrt_funcContext)_localctx).expr = expr(0);
				setState(1738);
				match(T_AS);
				setState(1739);
				((Dat_convrt_funcContext)_localctx).dtype = dtype();
				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1740);
					dtype_len();
					}
				}

				setState(1743);
				match(T_CLOSE_P);
				 ((Dat_convrt_funcContext)_localctx).res =  hql_cast_func(((Dat_convrt_funcContext)_localctx).expr.res, ((Dat_convrt_funcContext)_localctx).dtype.res); 
				}
				break;
			case T_BINARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1746);
				match(T_BINARY);
				setState(1747);
				match(T_OPEN_P);
				setState(1748);
				((Dat_convrt_funcContext)_localctx).expr = expr(0);
				setState(1749);
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

	public static class Basic_aggr_funcContext extends ParserRuleContext {
		public json res;
		public ExprContext r;
		public ExprContext expr;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public Token fun_name;
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
		public Basic_aggr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_aggr_func; }
	}

	public final Basic_aggr_funcContext basic_aggr_func() throws RecognitionException {
		Basic_aggr_funcContext _localctx = new Basic_aggr_funcContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_basic_aggr_func);
		int _la;
		try {
			setState(1812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1754);
				match(T_COUNT);
				setState(1755);
				match(T_OPEN_P);
				setState(1756);
				((Basic_aggr_funcContext)_localctx).r = expr(0);
				setState(1757);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_count_func(((Basic_aggr_funcContext)_localctx).r.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 vector<ExprContext*> exprs; 
				setState(1761);
				match(T_COUNT);
				setState(1762);
				match(T_OPEN_P);
				setState(1763);
				match(T_DISTINCT);
				setState(1764);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				((Basic_aggr_funcContext)_localctx).exprs.add(((Basic_aggr_funcContext)_localctx).expr);
				setState(1769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1765);
					match(T_COMMA);
					setState(1766);
					((Basic_aggr_funcContext)_localctx).expr = expr(0);
					((Basic_aggr_funcContext)_localctx).exprs.add(((Basic_aggr_funcContext)_localctx).expr);
					}
					}
					setState(1771);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1772);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Basic_aggr_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Basic_aggr_funcContext)_localctx).res =  hql_single_param_list_func("COUNT", "flag_distinct", true, "expr_list", expr_list_json);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1775);
				match(T_COUNT);
				setState(1776);
				match(T_OPEN_P);
				setState(1777);
				match(T_MUL);
				setState(1778);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_count_all_func(); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1780);
				match(T_SUM);
				setState(1781);
				match(T_OPEN_P);
				setState(1782);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(1783);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", false, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1786);
				match(T_SUM);
				setState(1787);
				match(T_OPEN_P);
				setState(1788);
				match(T_DISTINCT);
				setState(1789);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(1790);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", true, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1793);
				match(T_AVG);
				setState(1794);
				match(T_OPEN_P);
				setState(1795);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(1796);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", false, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1799);
				match(T_AVG);
				setState(1800);
				match(T_OPEN_P);
				setState(1801);
				match(T_DISTINCT);
				setState(1802);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(1803);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", true, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1806);
				((Basic_aggr_funcContext)_localctx).fun_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_MAX || _la==T_MIN) ) {
					((Basic_aggr_funcContext)_localctx).fun_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1807);
				match(T_OPEN_P);
				setState(1808);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(1809);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_single_param_func((((Basic_aggr_funcContext)_localctx).fun_name!=null?((Basic_aggr_funcContext)_localctx).fun_name.getText():null), "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
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

	public static class Aggr_funcContext extends ParserRuleContext {
		public json res;
		public Basic_aggr_funcContext basic_aggr_func;
		public Token fun_name;
		public ExprContext expr;
		public ExprContext col1;
		public ExprContext col2;
		public ExprContext col;
		public ExprContext p_expr;
		public ExprContext b_expr;
		public Token func_name;
		public ExprContext indep;
		public ExprContext dep;
		public Basic_aggr_funcContext basic_aggr_func() {
			return getRuleContext(Basic_aggr_funcContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
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
		enterRule(_localctx, 76, RULE_aggr_func);
		int _la;
		try {
			setState(1885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1814);
				((Aggr_funcContext)_localctx).basic_aggr_func = basic_aggr_func();
				 ((Aggr_funcContext)_localctx).res =  ((Aggr_funcContext)_localctx).basic_aggr_func.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1817);
				((Aggr_funcContext)_localctx).fun_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_STDDEV_POP || _la==T_STDDEV_SAMP || ((((_la - 484)) & ~0x3f) == 0 && ((1L << (_la - 484)) & ((1L << (T_VARIANCE - 484)) | (1L << (T_VAR_POP - 484)) | (1L << (T_VAR_SAMP - 484)))) != 0)) ) {
					((Aggr_funcContext)_localctx).fun_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1818);
				match(T_OPEN_P);
				setState(1819);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(1820);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1823);
				((Aggr_funcContext)_localctx).fun_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T_CORR - 76)) | (1L << (T_COVAR_POP - 76)) | (1L << (T_COVAR_SAMP - 76)))) != 0)) ) {
					((Aggr_funcContext)_localctx).fun_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1824);
				match(T_OPEN_P);
				setState(1825);
				((Aggr_funcContext)_localctx).col1 = expr(0);
				setState(1826);
				match(T_COMMA);
				setState(1827);
				((Aggr_funcContext)_localctx).col2 = expr(0);
				setState(1828);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col1", ((Aggr_funcContext)_localctx).col1.res, "col2", ((Aggr_funcContext)_localctx).col2.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1831);
				match(T_PERCENTILE);
				setState(1832);
				match(T_OPEN_P);
				setState(1833);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(1834);
				match(T_COMMA);
				setState(1835);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(1836);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1839);
				match(T_PERCENTILE_APPROX);
				setState(1840);
				match(T_OPEN_P);
				setState(1841);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(1842);
				match(T_COMMA);
				setState(1843);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(1844);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1847);
				match(T_PERCENTILE_APPROX);
				setState(1848);
				match(T_OPEN_P);
				setState(1849);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(1850);
				match(T_COMMA);
				setState(1851);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(1852);
				match(T_COMMA);
				setState(1853);
				((Aggr_funcContext)_localctx).b_expr = expr(0);
				setState(1854);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_three_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1857);
				((Aggr_funcContext)_localctx).func_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (T_REGR_AVGX - 325)) | (1L << (T_REGR_AVGY - 325)) | (1L << (T_REGR_COUNT - 325)) | (1L << (T_REGR_INTERCEPT - 325)) | (1L << (T_REGR_R2 - 325)) | (1L << (T_REGR_SLOPE - 325)) | (1L << (T_REGR_SXX - 325)) | (1L << (T_REGR_SXY - 325)) | (1L << (T_REGR_SYY - 325)))) != 0)) ) {
					((Aggr_funcContext)_localctx).func_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1858);
				match(T_OPEN_P);
				setState(1859);
				((Aggr_funcContext)_localctx).indep = expr(0);
				setState(1860);
				match(T_COMMA);
				setState(1861);
				((Aggr_funcContext)_localctx).dep = expr(0);
				setState(1862);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "independent", ((Aggr_funcContext)_localctx).indep.res, "dependent", ((Aggr_funcContext)_localctx).dep.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1865);
				match(T_HISTOGRAM_NUMERIC);
				setState(1866);
				match(T_OPEN_P);
				setState(1867);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(1868);
				match(T_COMMA);
				setState(1869);
				((Aggr_funcContext)_localctx).b_expr = expr(0);
				setState(1870);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("HISTOGRAM_NUMERIC", "col", ((Aggr_funcContext)_localctx).col.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1873);
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
				setState(1874);
				match(T_OPEN_P);
				setState(1875);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(1876);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1879);
				match(T_NTILE);
				setState(1880);
				match(T_OPEN_P);
				setState(1881);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(1882);
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
		enterRule(_localctx, 78, RULE_tab_generate_func);
		try {
			setState(1905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EXPLODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1887);
				match(T_EXPLODE);
				setState(1888);
				match(T_OPEN_P);
				setState(1889);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(1890);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("EXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_POSEXPLODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1893);
				match(T_POSEXPLODE);
				setState(1894);
				match(T_OPEN_P);
				setState(1895);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(1896);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("POSEXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_INLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1899);
				match(T_INLINE);
				setState(1900);
				match(T_OPEN_P);
				setState(1901);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(1902);
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
		enterRule(_localctx, 80, RULE_math_func);
		int _la;
		try {
			setState(2117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1907);
				match(T_ROUND);
				setState(1908);
				match(T_OPEN_P);
				setState(1909);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(1910);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ROUND", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1913);
				match(T_ROUND);
				setState(1914);
				match(T_OPEN_P);
				setState(1915);
				((Math_funcContext)_localctx).fst = expr(0);
				setState(1916);
				match(T_COMMA);
				setState(1917);
				((Math_funcContext)_localctx).snd = expr(0);
				setState(1918);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("ROUND", "expr", ((Math_funcContext)_localctx).fst.res, "decimal_places", ((Math_funcContext)_localctx).snd.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1921);
				match(T_FLOOR);
				setState(1922);
				match(T_OPEN_P);
				setState(1923);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(1924);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FLOOR", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1927);
				_la = _input.LA(1);
				if ( !(_la==T_CEIL || _la==T_CEILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1928);
				match(T_OPEN_P);
				setState(1929);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(1930);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("CEIL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1933);
				((Math_funcContext)_localctx).T_RAND = match(T_RAND);
				setState(1934);
				match(T_OPEN_P);
				setState(1935);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func((((Math_funcContext)_localctx).T_RAND!=null?((Math_funcContext)_localctx).T_RAND.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1937);
				match(T_RAND);
				setState(1938);
				match(T_OPEN_P);
				setState(1939);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(1940);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RAND", "seed", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1943);
				match(T_EXP);
				setState(1944);
				match(T_OPEN_P);
				setState(1945);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(1946);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("EXP", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1949);
				match(T_LN);
				setState(1950);
				match(T_OPEN_P);
				setState(1951);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(1952);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1955);
				match(T_LOG10);
				setState(1956);
				match(T_OPEN_P);
				setState(1957);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(1958);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG10", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1961);
				match(T_LOG2);
				setState(1962);
				match(T_OPEN_P);
				setState(1963);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(1964);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG2", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1967);
				match(T_LOG);
				setState(1968);
				match(T_OPEN_P);
				setState(1969);
				((Math_funcContext)_localctx).base = expr(0);
				setState(1970);
				match(T_COMMA);
				setState(1971);
				((Math_funcContext)_localctx).e = expr(0);
				setState(1972);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("LOG", "base", ((Math_funcContext)_localctx).base.res, "expr", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1975);
				_la = _input.LA(1);
				if ( !(_la==T_POW || _la==T_POWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1976);
				match(T_OPEN_P);
				setState(1977);
				((Math_funcContext)_localctx).base = expr(0);
				setState(1978);
				match(T_COMMA);
				setState(1979);
				((Math_funcContext)_localctx).e = expr(0);
				setState(1980);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("POWER", "base", ((Math_funcContext)_localctx).base.res, "exp", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1983);
				match(T_SQRT);
				setState(1984);
				match(T_OPEN_P);
				setState(1985);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(1986);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SQRT", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1989);
				match(T_BIN);
				setState(1990);
				match(T_OPEN_P);
				setState(1991);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(1992);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("BIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1995);
				match(T_HEX);
				setState(1996);
				match(T_OPEN_P);
				setState(1997);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(1998);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("HEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2001);
				match(T_UNHEX);
				setState(2002);
				match(T_OPEN_P);
				setState(2003);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2004);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("UNHEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2007);
				match(T_CONV);
				setState(2008);
				match(T_OPEN_P);
				setState(2009);
				((Math_funcContext)_localctx).e = expr(0);
				setState(2010);
				match(T_COMMA);
				setState(2011);
				((Math_funcContext)_localctx).fbase = expr(0);
				setState(2012);
				match(T_COMMA);
				setState(2013);
				((Math_funcContext)_localctx).tbase = expr(0);
				setState(2014);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_three_param_func("CONV", "expr", ((Math_funcContext)_localctx).e.res, "from_base", ((Math_funcContext)_localctx).fbase.res, "to_base", ((Math_funcContext)_localctx).tbase.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2017);
				match(T_ABS);
				setState(2018);
				match(T_OPEN_P);
				setState(2019);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2020);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ABS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2023);
				match(T_PMOD);
				setState(2024);
				match(T_OPEN_P);
				setState(2025);
				((Math_funcContext)_localctx).a = expr(0);
				setState(2026);
				match(T_COMMA);
				setState(2027);
				((Math_funcContext)_localctx).b = expr(0);
				setState(2028);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("PMOD", "a", ((Math_funcContext)_localctx).a.res, "b", ((Math_funcContext)_localctx).b.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2031);
				match(T_SIN);
				setState(2032);
				match(T_OPEN_P);
				setState(2033);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2034);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2037);
				match(T_ASIN);
				setState(2038);
				match(T_OPEN_P);
				setState(2039);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2040);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ASIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2043);
				match(T_COS);
				setState(2044);
				match(T_OPEN_P);
				setState(2045);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2046);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("COS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2049);
				match(T_ACOS);
				setState(2050);
				match(T_OPEN_P);
				setState(2051);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2052);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ACOS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2055);
				match(T_TAN);
				setState(2056);
				match(T_OPEN_P);
				setState(2057);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2058);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("TAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2061);
				match(T_ATAN);
				setState(2062);
				match(T_OPEN_P);
				setState(2063);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2064);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ATAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2067);
				match(T_DEGREES);
				setState(2068);
				match(T_OPEN_P);
				setState(2069);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2070);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("DEGREES", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2073);
				match(T_RADIANS);
				setState(2074);
				match(T_OPEN_P);
				setState(2075);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2076);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RADIANS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2079);
				match(T_POSITIVE);
				setState(2080);
				match(T_OPEN_P);
				setState(2081);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2082);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("POSITIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2085);
				match(T_NEGATIVE);
				setState(2086);
				match(T_OPEN_P);
				setState(2087);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2088);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("NEGATIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2091);
				match(T_SIGN);
				setState(2092);
				match(T_OPEN_P);
				setState(2093);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2094);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIGN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2097);
				match(T__7);
				setState(2098);
				match(T_OPEN_P);
				setState(2099);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("EULER_CONST"); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2101);
				match(T__8);
				setState(2102);
				match(T_OPEN_P);
				setState(2103);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("PI_CONST"); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2105);
				match(T_FACTORIAL);
				setState(2106);
				match(T_OPEN_P);
				setState(2107);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2108);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FACTORIAL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2111);
				match(T_CBR);
				setState(2112);
				match(T_OPEN_P);
				setState(2113);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2114);
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
		enterRule(_localctx, 82, RULE_literal_values);
		try {
			setState(2135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2119);
				((Literal_valuesContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_string_type((((Literal_valuesContext)_localctx).STRING_LITERAL!=null?((Literal_valuesContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2121);
				((Literal_valuesContext)_localctx).DECIMAL_LITERAL = match(DECIMAL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_decimal_type((((Literal_valuesContext)_localctx).DECIMAL_LITERAL!=null?((Literal_valuesContext)_localctx).DECIMAL_LITERAL.getText():null)); 
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2123);
				((Literal_valuesContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_int_type((((Literal_valuesContext)_localctx).INT_LITERAL!=null?((Literal_valuesContext)_localctx).INT_LITERAL.getText():null)); 
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(2125);
				((Literal_valuesContext)_localctx).BOOL_LITERAL = match(BOOL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_boolean_type((((Literal_valuesContext)_localctx).BOOL_LITERAL!=null?((Literal_valuesContext)_localctx).BOOL_LITERAL.getText():null)); 
				}
				break;
			case NULL_CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(2127);
				match(NULL_CONST);
				 ((Literal_valuesContext)_localctx).res =  hql_null_constant(); 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2129);
				((Literal_valuesContext)_localctx).date_literal = date_literal();
				 ((Literal_valuesContext)_localctx).res =  hql_type_date_literal(((Literal_valuesContext)_localctx).date_literal.res); 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(2132);
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
		enterRule(_localctx, 84, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(2137);
				((IdentContext)_localctx).database = match(IDENTIFIER);
				setState(2138);
				match(T__1);
				}
				break;
			}
			setState(2143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(2141);
				((IdentContext)_localctx).tablename = match(IDENTIFIER);
				setState(2142);
				match(T__1);
				}
				break;
			}
			setState(2145);
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

	public static class Tab_identContext extends ParserRuleContext {
		public json res;
		public Token database;
		public Token tablename;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HiveParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HiveParser.IDENTIFIER, i);
		}
		public Tab_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab_ident; }
	}

	public final Tab_identContext tab_ident() throws RecognitionException {
		Tab_identContext _localctx = new Tab_identContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tab_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(2148);
				((Tab_identContext)_localctx).database = match(IDENTIFIER);
				setState(2149);
				match(T__1);
				}
				break;
			}
			setState(2152);
			((Tab_identContext)_localctx).tablename = match(IDENTIFIER);
			 ((Tab_identContext)_localctx).res =  hql_type_table_identifier((((Tab_identContext)_localctx).database!=null?((Tab_identContext)_localctx).database.getText():null), (((Tab_identContext)_localctx).tablename!=null?((Tab_identContext)_localctx).tablename.getText():null)); 
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
		enterRule(_localctx, 88, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
			match(T_DATE);
			setState(2156);
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
		enterRule(_localctx, 90, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2159);
			match(T_TIMESTAMP);
			setState(2160);
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

	public static class Set_operators_isContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_IS() { return getToken(HiveParser.T_IS, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public Set_operators_isContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_operators_is; }
	}

	public final Set_operators_isContext set_operators_is() throws RecognitionException {
		Set_operators_isContext _localctx = new Set_operators_isContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_set_operators_is);
		try {
			setState(2168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2163);
				match(T_IS);
				 ((Set_operators_isContext)_localctx).res =  "IS"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2165);
				match(T_IS);
				setState(2166);
				match(T_NOT);
				 ((Set_operators_isContext)_localctx).res =  "IS_NOT"; 
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

	public static class Set_operators_likeContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_LIKE() { return getToken(HiveParser.T_LIKE, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public TerminalNode T_RLIKE() { return getToken(HiveParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(HiveParser.T_REGEXP, 0); }
		public Set_operators_likeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_operators_like; }
	}

	public final Set_operators_likeContext set_operators_like() throws RecognitionException {
		Set_operators_likeContext _localctx = new Set_operators_likeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_set_operators_like);
		try {
			setState(2179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2170);
				match(T_LIKE);
				 ((Set_operators_likeContext)_localctx).res =  "LIKE"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2172);
				match(T_NOT);
				setState(2173);
				match(T_LIKE);
				 ((Set_operators_likeContext)_localctx).res =  "NOT_LIKE"; 
				}
				break;
			case T_RLIKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2175);
				match(T_RLIKE);
				 ((Set_operators_likeContext)_localctx).res =  "RLIKE"; 
				}
				break;
			case T_REGEXP:
				enterOuterAlt(_localctx, 4);
				{
				setState(2177);
				match(T_REGEXP);
				 ((Set_operators_likeContext)_localctx).res =  "REGEXP "; 
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

	public static class Set_operators_inContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_IN() { return getToken(HiveParser.T_IN, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public Set_operators_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_operators_in; }
	}

	public final Set_operators_inContext set_operators_in() throws RecognitionException {
		Set_operators_inContext _localctx = new Set_operators_inContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_set_operators_in);
		try {
			setState(2186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2181);
				match(T_IN);
				 ((Set_operators_inContext)_localctx).res =  "IN"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2183);
				match(T_NOT);
				setState(2184);
				match(T_IN);
				 ((Set_operators_inContext)_localctx).res =  "NOT_IN"; 
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

	public static class Set_operators_existsContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_EXISTS() { return getToken(HiveParser.T_EXISTS, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public Set_operators_existsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_operators_exists; }
	}

	public final Set_operators_existsContext set_operators_exists() throws RecognitionException {
		Set_operators_existsContext _localctx = new Set_operators_existsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_set_operators_exists);
		try {
			setState(2193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EXISTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2188);
				match(T_EXISTS);
				 ((Set_operators_existsContext)_localctx).res =  "EXISTS"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2190);
				match(T_NOT);
				setState(2191);
				match(T_EXISTS);
				 ((Set_operators_existsContext)_localctx).res =  "NOT_EXISTS"; 
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T_NOT || _la==T_ADD || _la==T_SUB) ) {
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
		case 24:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 28);
		case 1:
			return precpred(_ctx, 27);
		case 2:
			return precpred(_ctx, 26);
		case 3:
			return precpred(_ctx, 25);
		case 4:
			return precpred(_ctx, 24);
		case 5:
			return precpred(_ctx, 23);
		case 6:
			return precpred(_ctx, 22);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 21);
		case 11:
			return precpred(_ctx, 20);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 16);
		case 14:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0208\u0898\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3q\n\3\r\3\16\3r\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0089"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u00c2\n\4\3\4\3\4\5\4\u00c6\n\4\3\5\3\5\3\5\5\5\u00cb"+
		"\n\5\3\5\3\5\5\5\u00cf\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00ef\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00f6\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00ff\n\n\f\n\16\n\u0102\13\n\3\n\3\n\5\n\u0106\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u010d\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u0119\n\f\f\f\16\f\u011c\13\f\3\f\3\f\5\f\u0120\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0127\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0132\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u013b\n"+
		"\17\r\17\16\17\u013c\3\17\3\17\3\17\3\17\3\17\6\17\u0144\n\17\r\17\16"+
		"\17\u0145\3\17\3\17\5\17\u014a\n\17\3\20\5\20\u014d\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0154\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u015d"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u016f\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u017a\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0183\n"+
		"\22\3\22\3\22\3\22\5\22\u0188\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u018f"+
		"\n\23\3\24\3\24\3\24\3\24\7\24\u0195\n\24\f\24\16\24\u0198\13\24\3\24"+
		"\3\24\3\25\3\25\5\25\u019e\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u01a8\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u01b9\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u01c4\n\26\f\26\16\26\u01c7\13\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01d5\n\26\f\26\16\26\u01d8"+
		"\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u01e6\n\26\f\26\16\26\u01e9\13\26\3\26\3\26\3\26\3\26\3\26\7\26\u01f0"+
		"\n\26\f\26\16\26\u01f3\13\26\3\26\3\26\3\26\5\26\u01f8\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0200\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u020c\n\31\f\31\16\31\u020f\13\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u023f\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\7\32\u0295\n\32\f\32\16\32\u0298\13\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02c2\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u02ca\n\34\f\34\16\34\u02cd\13\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u02dd\n\35\f\35\16\35\u02e0\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u02eb\n\36\f\36\16\36\u02ee\13\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u02fe\n\37\f\37"+
		"\16\37\u0301\13\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \6 \u0324\n \r "+
		"\16 \u0325\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \6 \u0333\n \r \16 \u0334\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u034a\n \f"+
		" \16 \u034d\13 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \7 \u0362\n \f \16 \u0365\13 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \6 \u03e0\n \r \16 \u03e1"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0507\n \3!\3!\3!\3!"+
		"\3!\3!\3!\3!\7!\u0511\n!\f!\16!\u0514\13!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\7!\u0521\n!\f!\16!\u0524\13!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u052f"+
		"\n!\f!\16!\u0532\13!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u056d\n!\3\"\3"+
		"\"\3\"\3\"\6\"\u0573\n\"\r\"\16\"\u0574\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\5#\u0599\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u05c2"+
		"\n$\f$\16$\u05c5\13$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\6$\u05d2\n$\r$\16"+
		"$\u05d3\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\6$\u05e1\n$\r$\16$\u05e2\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\6$\u05f1\n$\r$\16$\u05f2\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\6$\u05ff\n$\r$\16$\u0600\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0616\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\5%\u0685\n%\3%\3%\3%\3%\5%\u068b\n%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u06c8\n%\3&\3&\3&\3&\3&\3&\5&\u06d0\n"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u06db\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\7\'\u06ea\n\'\f\'\16\'\u06ed\13\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u0717\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0760\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u0774\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0848\n*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u085a\n+\3,\3,\5,\u085e\n,\3,\3"+
		",\5,\u0862\n,\3,\3,\3,\3-\3-\5-\u0869\n-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\5\60\u087b\n\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u0886\n\61\3\62\3\62\3\62\3\62\3\62\5\62\u088d"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\5\63\u0894\n\63\3\64\3\64\3\64\2\3\62\65"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdf\2\31\4\2\u0160\u0160\u01a8\u01a8\4\2\u00fa\u00fa\u0205"+
		"\u0205\4\2++\64\64\5\2\u00a3\u00a3\u00db\u00db\u0159\u0159\6\2\u012a\u012a"+
		"\u01d1\u01d1\u01d5\u01d5\u01e2\u01e3\5\2\3\3\u01ee\u01ee\u01f8\u01f8\4"+
		"\2\u01ea\u01ea\u0200\u0200\3\2\5\b\3\2\u01f4\u01f7\4\2\t\t\u01f0\u01f3"+
		"\4\2\u00d9\u00d9\u00ee\u00ee\3\2\u0190\u0191\4\2\u01a9\u01a9\u01b0\u01b0"+
		"\5\2TT\u00fc\u00fc\u0172\u0173\3\2\u01c5\u01cd\4\2\u00fa\u00fa\u0101\u0101"+
		"\4\2\u0187\u0188\u01e6\u01e8\4\2NNRS\3\2\u0147\u014f\3\2?@\3\2\62\63\3"+
		"\2\u0131\u0132\6\2\f\f\u0111\u0111\u01ea\u01ea\u0200\u0200\2\u09a9\2h"+
		"\3\2\2\2\4l\3\2\2\2\6\u00c5\3\2\2\2\b\u00c7\3\2\2\2\n\u00d2\3\2\2\2\f"+
		"\u00d5\3\2\2\2\16\u00ee\3\2\2\2\20\u00f5\3\2\2\2\22\u0105\3\2\2\2\24\u010c"+
		"\3\2\2\2\26\u011f\3\2\2\2\30\u0126\3\2\2\2\32\u0131\3\2\2\2\34\u0149\3"+
		"\2\2\2\36\u016e\3\2\2\2 \u0170\3\2\2\2\"\u0187\3\2\2\2$\u018e\3\2\2\2"+
		"&\u0190\3\2\2\2(\u01b8\3\2\2\2*\u01f7\3\2\2\2,\u01ff\3\2\2\2.\u0201\3"+
		"\2\2\2\60\u0206\3\2\2\2\62\u023e\3\2\2\2\64\u02c1\3\2\2\2\66\u02c3\3\2"+
		"\2\28\u02d1\3\2\2\2:\u02e4\3\2\2\2<\u02f2\3\2\2\2>\u0506\3\2\2\2@\u056c"+
		"\3\2\2\2B\u056e\3\2\2\2D\u0598\3\2\2\2F\u0615\3\2\2\2H\u06c7\3\2\2\2J"+
		"\u06da\3\2\2\2L\u0716\3\2\2\2N\u075f\3\2\2\2P\u0773\3\2\2\2R\u0847\3\2"+
		"\2\2T\u0859\3\2\2\2V\u085d\3\2\2\2X\u0868\3\2\2\2Z\u086d\3\2\2\2\\\u0871"+
		"\3\2\2\2^\u087a\3\2\2\2`\u0885\3\2\2\2b\u088c\3\2\2\2d\u0893\3\2\2\2f"+
		"\u0895\3\2\2\2hi\5\4\3\2ij\7\2\2\3jk\b\2\1\2k\3\3\2\2\2lp\b\3\1\2mn\5"+
		"\n\6\2no\7\u01ff\2\2oq\3\2\2\2pm\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"st\3\2\2\2tu\b\3\1\2u\5\3\2\2\2vw\7\64\2\2w\u00c6\b\4\1\2xy\7\65\2\2y"+
		"\u00c6\b\4\1\2z{\7$\2\2{\u00c6\b\4\1\2|}\7\'\2\2}\u00c6\b\4\1\2~\177\7"+
		"_\2\2\177\u00c6\b\4\1\2\u0080\u0081\7d\2\2\u0081\u00c6\b\4\1\2\u0082\u0083"+
		"\7g\2\2\u0083\u00c6\b\4\1\2\u0084\u0085\7h\2\2\u0085\u00c6\b\4\1\2\u0086"+
		"\u0088\7|\2\2\u0087\u0089\7\u0133\2\2\u0088\u0087\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u00c6\b\4\1\2\u008b\u008c\7\u009a\2"+
		"\2\u008c\u00c6\b\4\1\2\u008d\u008e\7\u00c3\2\2\u008e\u00c6\b\4\1\2\u008f"+
		"\u0090\7\u00c4\2\2\u0090\u00c6\b\4\1\2\u0091\u0092\7\u00c5\2\2\u0092\u00c6"+
		"\b\4\1\2\u0093\u0094\7\u00c6\2\2\u0094\u00c6\b\4\1\2\u0095\u0096\7\u00c7"+
		"\2\2\u0096\u00c6\b\4\1\2\u0097\u0098\7\u0107\2\2\u0098\u00c6\b\4\1\2\u0099"+
		"\u009a\7\u010b\2\2\u009a\u00c6\b\4\1\2\u009b\u009c\7\u0117\2\2\u009c\u00c6"+
		"\b\4\1\2\u009d\u009e\7\u0116\2\2\u009e\u00c6\b\4\1\2\u009f\u00a0\7\u012d"+
		"\2\2\u00a0\u00c6\b\4\1\2\u00a1\u00a2\7\u0141\2\2\u00a2\u00c6\b\4\1\2\u00a3"+
		"\u00a4\7\u0155\2\2\u00a4\u00a5\7\u01b9\2\2\u00a5\u00c6\b\4\1\2\u00a6\u00a7"+
		"\7\u0178\2\2\u00a7\u00c6\b\4\1\2\u00a8\u00a9\7\u0177\2\2\u00a9\u00c6\b"+
		"\4\1\2\u00aa\u00ab\7\u0179\2\2\u00ab\u00c6\b\4\1\2\u00ac\u00ad\7\u017b"+
		"\2\2\u00ad\u00c6\b\4\1\2\u00ae\u00af\7\u017a\2\2\u00af\u00c6\b\4\1\2\u00b0"+
		"\u00b1\7\u018c\2\2\u00b1\u00c6\b\4\1\2\u00b2\u00b3\7\u0195\2\2\u00b3\u00c6"+
		"\b\4\1\2\u00b4\u00b5\7\u019d\2\2\u00b5\u00c6\b\4\1\2\u00b6\u00b7\7\u019e"+
		"\2\2\u00b7\u00c6\b\4\1\2\u00b8\u00b9\7\u01b7\2\2\u00b9\u00c6\b\4\1\2\u00ba"+
		"\u00bb\7\u01b8\2\2\u00bb\u00c6\b\4\1\2\u00bc\u00bd\7\u01c4\2\2\u00bd\u00c6"+
		"\b\4\1\2\u00be\u00c1\5V,\2\u00bf\u00c0\7\3\2\2\u00c0\u00c2\t\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\b\4"+
		"\1\2\u00c4\u00c6\3\2\2\2\u00c5v\3\2\2\2\u00c5x\3\2\2\2\u00c5z\3\2\2\2"+
		"\u00c5|\3\2\2\2\u00c5~\3\2\2\2\u00c5\u0080\3\2\2\2\u00c5\u0082\3\2\2\2"+
		"\u00c5\u0084\3\2\2\2\u00c5\u0086\3\2\2\2\u00c5\u008b\3\2\2\2\u00c5\u008d"+
		"\3\2\2\2\u00c5\u008f\3\2\2\2\u00c5\u0091\3\2\2\2\u00c5\u0093\3\2\2\2\u00c5"+
		"\u0095\3\2\2\2\u00c5\u0097\3\2\2\2\u00c5\u0099\3\2\2\2\u00c5\u009b\3\2"+
		"\2\2\u00c5\u009d\3\2\2\2\u00c5\u009f\3\2\2\2\u00c5\u00a1\3\2\2\2\u00c5"+
		"\u00a3\3\2\2\2\u00c5\u00a6\3\2\2\2\u00c5\u00a8\3\2\2\2\u00c5\u00aa\3\2"+
		"\2\2\u00c5\u00ac\3\2\2\2\u00c5\u00ae\3\2\2\2\u00c5\u00b0\3\2\2\2\u00c5"+
		"\u00b2\3\2\2\2\u00c5\u00b4\3\2\2\2\u00c5\u00b6\3\2\2\2\u00c5\u00b8\3\2"+
		"\2\2\u00c5\u00ba\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00be\3\2\2\2\u00c6"+
		"\7\3\2\2\2\u00c7\u00c8\7\u01fa\2\2\u00c8\u00ca\t\3\2\2\u00c9\u00cb\t\4"+
		"\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00cd\7\u01ec\2\2\u00cd\u00cf\7\u0205\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\u01fd\2\2\u00d1\t\3\2\2\2\u00d2"+
		"\u00d3\5\f\7\2\u00d3\u00d4\b\6\1\2\u00d4\13\3\2\2\2\u00d5\u00d6\5\16\b"+
		"\2\u00d6\u00d7\b\7\1\2\u00d7\r\3\2\2\2\u00d8\u00d9\7\u016e\2\2\u00d9\u00da"+
		"\5$\23\2\u00da\u00db\5&\24\2\u00db\u00dc\b\b\1\2\u00dc\u00ef\3\2\2\2\u00dd"+
		"\u00de\7\u016e\2\2\u00de\u00df\5$\23\2\u00df\u00e0\5P)\2\u00e0\u00e1\b"+
		"\b\1\2\u00e1\u00ef\3\2\2\2\u00e2\u00e3\7\u016e\2\2\u00e3\u00e4\5$\23\2"+
		"\u00e4\u00e5\5&\24\2\u00e5\u00e6\7\u00a1\2\2\u00e6\u00e7\5\34\17\2\u00e7"+
		"\u00e8\5\20\t\2\u00e8\u00e9\5\22\n\2\u00e9\u00ea\5\24\13\2\u00ea\u00eb"+
		"\5\26\f\2\u00eb\u00ec\5\32\16\2\u00ec\u00ed\b\b\1\2\u00ed\u00ef\3\2\2"+
		"\2\u00ee\u00d8\3\2\2\2\u00ee\u00dd\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ef\17"+
		"\3\2\2\2\u00f0\u00f6\b\t\1\2\u00f1\u00f2\7\u01be\2\2\u00f2\u00f3\5\62"+
		"\32\2\u00f3\u00f4\b\t\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5"+
		"\u00f1\3\2\2\2\u00f6\21\3\2\2\2\u00f7\u0106\b\n\1\2\u00f8\u00f9\b\n\1"+
		"\2\u00f9\u00fa\7\u00aa\2\2\u00fa\u00fb\7*\2\2\u00fb\u0100\5\62\32\2\u00fc"+
		"\u00fd\7\u01ec\2\2\u00fd\u00ff\5\62\32\2\u00fe\u00fc\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\b\n\1\2\u0104\u0106\3\2\2\2\u0105\u00f7\3\2"+
		"\2\2\u0105\u00f8\3\2\2\2\u0106\23\3\2\2\2\u0107\u010d\b\13\1\2\u0108\u0109"+
		"\7\u00ad\2\2\u0109\u010a\5\62\32\2\u010a\u010b\b\13\1\2\u010b\u010d\3"+
		"\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2\2\2\u010d\25\3\2\2\2\u010e"+
		"\u0120\b\f\1\2\u010f\u0110\b\f\1\2\u0110\u0111\7\u011f\2\2\u0111\u0112"+
		"\7*\2\2\u0112\u0113\5V,\2\u0113\u011a\5\30\r\2\u0114\u0115\7\u01ec\2\2"+
		"\u0115\u0116\5V,\2\u0116\u0117\5\30\r\2\u0117\u0119\3\2\2\2\u0118\u0114"+
		"\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\b\f\1\2\u011e\u0120\3\2"+
		"\2\2\u011f\u010e\3\2\2\2\u011f\u010f\3\2\2\2\u0120\27\3\2\2\2\u0121\u0127"+
		"\b\r\1\2\u0122\u0123\7\31\2\2\u0123\u0127\b\r\1\2\u0124\u0125\7t\2\2\u0125"+
		"\u0127\b\r\1\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\31\3\2\2\2\u0128\u0132\b\16\1\2\u0129\u012a\7\u00df\2\2\u012a"+
		"\u012b\7\u0202\2\2\u012b\u0132\b\16\1\2\u012c\u012d\7\u00df\2\2\u012d"+
		"\u012e\7\u0202\2\2\u012e\u012f\7\u01ec\2\2\u012f\u0130\7\u0202\2\2\u0130"+
		"\u0132\b\16\1\2\u0131\u0128\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u012c\3"+
		"\2\2\2\u0132\33\3\2\2\2\u0133\u0134\5\"\22\2\u0134\u0135\b\17\1\2\u0135"+
		"\u014a\3\2\2\2\u0136\u0137\b\17\1\2\u0137\u013a\5\"\22\2\u0138\u0139\7"+
		"\u01ec\2\2\u0139\u013b\5\"\22\2\u013a\u0138\3\2\2\2\u013b\u013c\3\2\2"+
		"\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f"+
		"\b\17\1\2\u013f\u014a\3\2\2\2\u0140\u0141\b\17\1\2\u0141\u0143\5\"\22"+
		"\2\u0142\u0144\5\36\20\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b\17"+
		"\1\2\u0148\u014a\3\2\2\2\u0149\u0133\3\2\2\2\u0149\u0136\3\2\2\2\u0149"+
		"\u0140\3\2\2\2\u014a\35\3\2\2\2\u014b\u014d\7\u00bf\2\2\u014c\u014b\3"+
		"\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7\u00d3\2\2"+
		"\u014f\u0150\5\"\22\2\u0150\u0151\b\20\1\2\u0151\u016f\3\2\2\2\u0152\u0154"+
		"\7\u00bf\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2"+
		"\2\u0155\u0156\7\u00d3\2\2\u0156\u0157\5\"\22\2\u0157\u0158\5 \21\2\u0158"+
		"\u0159\b\20\1\2\u0159\u016f\3\2\2\2\u015a\u015c\t\5\2\2\u015b\u015d\7"+
		"\u0121\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2"+
		"\u015e\u015f\7\u00d3\2\2\u015f\u0160\5\"\22\2\u0160\u0161\5 \21\2\u0161"+
		"\u0162\b\20\1\2\u0162\u016f\3\2\2\2\u0163\u0164\7X\2\2\u0164\u0165\7\u00d3"+
		"\2\2\u0165\u0166\5\"\22\2\u0166\u0167\b\20\1\2\u0167\u016f\3\2\2\2\u0168"+
		"\u0169\7X\2\2\u0169\u016a\7\u00d3\2\2\u016a\u016b\5\"\22\2\u016b\u016c"+
		"\5 \21\2\u016c\u016d\b\20\1\2\u016d\u016f\3\2\2\2\u016e\u014c\3\2\2\2"+
		"\u016e\u0153\3\2\2\2\u016e\u015a\3\2\2\2\u016e\u0163\3\2\2\2\u016e\u0168"+
		"\3\2\2\2\u016f\37\3\2\2\2\u0170\u0171\7\u011b\2\2\u0171\u0172\5\62\32"+
		"\2\u0172\u0173\b\21\1\2\u0173!\3\2\2\2\u0174\u0175\5X-\2\u0175\u0176\b"+
		"\22\1\2\u0176\u0188\3\2\2\2\u0177\u0179\5X-\2\u0178\u017a\7\30\2\2\u0179"+
		"\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\7\u0201"+
		"\2\2\u017c\u017d\b\22\1\2\u017d\u0188\3\2\2\2\u017e\u017f\7\u01fa\2\2"+
		"\u017f\u0180\5\16\b\2\u0180\u0182\7\u01fd\2\2\u0181\u0183\7\30\2\2\u0182"+
		"\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\u0201"+
		"\2\2\u0185\u0186\b\22\1\2\u0186\u0188\3\2\2\2\u0187\u0174\3\2\2\2\u0187"+
		"\u0177\3\2\2\2\u0187\u017e\3\2\2\2\u0188#\3\2\2\2\u0189\u018f\b\23\1\2"+
		"\u018a\u018b\7\24\2\2\u018b\u018f\b\23\1\2\u018c\u018d\7y\2\2\u018d\u018f"+
		"\b\23\1\2\u018e\u0189\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018c\3\2\2\2"+
		"\u018f%\3\2\2\2\u0190\u0191\b\24\1\2\u0191\u0196\5(\25\2\u0192\u0193\7"+
		"\u01ec\2\2\u0193\u0195\5(\25\2\u0194\u0192\3\2\2\2\u0195\u0198\3\2\2\2"+
		"\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0199\u019a\b\24\1\2\u019a\'\3\2\2\2\u019b\u019d\5\62\32\2\u019c"+
		"\u019e\7\30\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3"+
		"\2\2\2\u019f\u01a0\7\u0201\2\2\u01a0\u01a1\b\25\1\2\u01a1\u01b9\3\2\2"+
		"\2\u01a2\u01a3\5\62\32\2\u01a3\u01a4\b\25\1\2\u01a4\u01b9\3\2\2\2\u01a5"+
		"\u01a7\5\62\32\2\u01a6\u01a8\7\30\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7\u0201\2\2\u01aa\u01ab\b\25"+
		"\1\2\u01ab\u01b9\3\2\2\2\u01ac\u01ad\5\62\32\2\u01ad\u01ae\b\25\1\2\u01ae"+
		"\u01b9\3\2\2\2\u01af\u01b0\7\u01f8\2\2\u01b0\u01b9\b\25\1\2\u01b1\u01b2"+
		"\7\u0201\2\2\u01b2\u01b3\7\4\2\2\u01b3\u01b4\7\u01f8\2\2\u01b4\u01b9\b"+
		"\25\1\2\u01b5\u01b6\5*\26\2\u01b6\u01b7\b\25\1\2\u01b7\u01b9\3\2\2\2\u01b8"+
		"\u019b\3\2\2\2\u01b8\u01a2\3\2\2\2\u01b8\u01a5\3\2\2\2\u01b8\u01ac\3\2"+
		"\2\2\u01b8\u01af\3\2\2\2\u01b8\u01b1\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b9"+
		")\3\2\2\2\u01ba\u01bb\b\26\1\2\u01bb\u01bc\5,\27\2\u01bc\u01bd\7\u0122"+
		"\2\2\u01bd\u01be\7\u01fa\2\2\u01be\u01bf\7\u0127\2\2\u01bf\u01c0\7*\2"+
		"\2\u01c0\u01c5\5V,\2\u01c1\u01c2\7\u01ec\2\2\u01c2\u01c4\5V,\2\u01c3\u01c1"+
		"\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7\u01fd\2\2\u01c9\u01ca"+
		"\b\26\1\2\u01ca\u01f8\3\2\2\2\u01cb\u01cc\b\26\1\2\u01cc\u01cd\5,\27\2"+
		"\u01cd\u01ce\7\u0122\2\2\u01ce\u01cf\7\u01fa\2\2\u01cf\u01d0\7\u011f\2"+
		"\2\u01d0\u01d1\7*\2\2\u01d1\u01d6\5V,\2\u01d2\u01d3\7\u01ec\2\2\u01d3"+
		"\u01d5\5V,\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2"+
		"\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da"+
		"\7\u01fd\2\2\u01da\u01db\b\26\1\2\u01db\u01f8\3\2\2\2\u01dc\u01dd\b\26"+
		"\1\2\u01dd\u01de\5,\27\2\u01de\u01df\7\u0122\2\2\u01df\u01e0\7\u01fa\2"+
		"\2\u01e0\u01e1\7\u0127\2\2\u01e1\u01e2\7*\2\2\u01e2\u01e7\5V,\2\u01e3"+
		"\u01e4\7\u01ec\2\2\u01e4\u01e6\5V,\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3"+
		"\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01eb\7\u011f\2\2\u01eb\u01ec\7*\2\2\u01ec\u01f1"+
		"\5V,\2\u01ed\u01ee\7\u01ec\2\2\u01ee\u01f0\5V,\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2"+
		"\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\7\u01fd\2\2\u01f5\u01f6\b\26\1\2"+
		"\u01f6\u01f8\3\2\2\2\u01f7\u01ba\3\2\2\2\u01f7\u01cb\3\2\2\2\u01f7\u01dc"+
		"\3\2\2\2\u01f8+\3\2\2\2\u01f9\u01fa\5L\'\2\u01fa\u01fb\b\27\1\2\u01fb"+
		"\u0200\3\2\2\2\u01fc\u01fd\5.\30\2\u01fd\u01fe\b\27\1\2\u01fe\u0200\3"+
		"\2\2\2\u01ff\u01f9\3\2\2\2\u01ff\u01fc\3\2\2\2\u0200-\3\2\2\2\u0201\u0202"+
		"\t\6\2\2\u0202\u0203\7\u01fa\2\2\u0203\u0204\7\u01fd\2\2\u0204\u0205\b"+
		"\30\1\2\u0205/\3\2\2\2\u0206\u0207\b\31\1\2\u0207\u0208\7\u01fa\2\2\u0208"+
		"\u020d\5\62\32\2\u0209\u020a\7\u01ec\2\2\u020a\u020c\5\62\32\2\u020b\u0209"+
		"\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7\u01fd\2\2\u0211\u0212"+
		"\b\31\1\2\u0212\61\3\2\2\2\u0213\u0214\b\32\1\2\u0214\u0215\5T+\2\u0215"+
		"\u0216\b\32\1\2\u0216\u023f\3\2\2\2\u0217\u0218\5V,\2\u0218\u0219\b\32"+
		"\1\2\u0219\u023f\3\2\2\2\u021a\u021b\5f\64\2\u021b\u021c\5\62\32\r\u021c"+
		"\u021d\b\32\1\2\u021d\u023f\3\2\2\2\u021e\u021f\7\u01fa\2\2\u021f\u0220"+
		"\5\62\32\2\u0220\u0221\7\u01fd\2\2\u0221\u0222\b\32\1\2\u0222\u023f\3"+
		"\2\2\2\u0223\u0224\5J&\2\u0224\u0225\b\32\1\2\u0225\u023f\3\2\2\2\u0226"+
		"\u0227\5R*\2\u0227\u0228\b\32\1\2\u0228\u023f\3\2\2\2\u0229\u022a\5H%"+
		"\2\u022a\u022b\b\32\1\2\u022b\u023f\3\2\2\2\u022c\u022d\5F$\2\u022d\u022e"+
		"\b\32\1\2\u022e\u023f\3\2\2\2\u022f\u0230\5> \2\u0230\u0231\b\32\1\2\u0231"+
		"\u023f\3\2\2\2\u0232\u0233\5B\"\2\u0233\u0234\b\32\1\2\u0234\u023f\3\2"+
		"\2\2\u0235\u0236\5@!\2\u0236\u0237\b\32\1\2\u0237\u023f\3\2\2\2\u0238"+
		"\u0239\5N(\2\u0239\u023a\b\32\1\2\u023a\u023f\3\2\2\2\u023b\u023c\5\64"+
		"\33\2\u023c\u023d\b\32\1\2\u023d\u023f\3\2\2\2\u023e\u0213\3\2\2\2\u023e"+
		"\u0217\3\2\2\2\u023e\u021a\3\2\2\2\u023e\u021e\3\2\2\2\u023e\u0223\3\2"+
		"\2\2\u023e\u0226\3\2\2\2\u023e\u0229\3\2\2\2\u023e\u022c\3\2\2\2\u023e"+
		"\u022f\3\2\2\2\u023e\u0232\3\2\2\2\u023e\u0235\3\2\2\2\u023e\u0238\3\2"+
		"\2\2\u023e\u023b\3\2\2\2\u023f\u0296\3\2\2\2\u0240\u0241\f\36\2\2\u0241"+
		"\u0242\t\7\2\2\u0242\u0243\5\62\32\37\u0243\u0244\b\32\1\2\u0244\u0295"+
		"\3\2\2\2\u0245\u0246\f\35\2\2\u0246\u0247\t\b\2\2\u0247\u0248\5\62\32"+
		"\36\u0248\u0249\b\32\1\2\u0249\u0295\3\2\2\2\u024a\u024b\f\34\2\2\u024b"+
		"\u024c\t\t\2\2\u024c\u024d\5\62\32\35\u024d\u024e\b\32\1\2\u024e\u0295"+
		"\3\2\2\2\u024f\u0250\f\33\2\2\u0250\u0251\t\n\2\2\u0251\u0252\5\62\32"+
		"\34\u0252\u0253\b\32\1\2\u0253\u0295\3\2\2\2\u0254\u0255\f\32\2\2\u0255"+
		"\u0256\t\13\2\2\u0256\u0257\5\62\32\33\u0257\u0258\b\32\1\2\u0258\u0295"+
		"\3\2\2\2\u0259\u025a\f\31\2\2\u025a\u025b\7\26\2\2\u025b\u025c\5\62\32"+
		"\32\u025c\u025d\b\32\1\2\u025d\u0295\3\2\2\2\u025e\u025f\f\30\2\2\u025f"+
		"\u0260\7\u011e\2\2\u0260\u0261\5\62\32\31\u0261\u0262\b\32\1\2\u0262\u0295"+
		"\3\2\2\2\u0263\u0264\f\25\2\2\u0264\u0265\7#\2\2\u0265\u0266\5\62\32\2"+
		"\u0266\u0267\7\26\2\2\u0267\u0268\5\62\32\26\u0268\u0269\b\32\1\2\u0269"+
		"\u0295\3\2\2\2\u026a\u026b\f\24\2\2\u026b\u026c\7\u0111\2\2\u026c\u026d"+
		"\7#\2\2\u026d\u026e\5\62\32\2\u026e\u026f\7\26\2\2\u026f\u0270\5\62\32"+
		"\25\u0270\u0271\b\32\1\2\u0271\u0295\3\2\2\2\u0272\u0273\f\20\2\2\u0273"+
		"\u0274\5`\61\2\u0274\u0275\5\62\32\21\u0275\u0276\b\32\1\2\u0276\u0295"+
		"\3\2\2\2\u0277\u0278\f\27\2\2\u0278\u0279\5^\60\2\u0279\u027a\7\16\2\2"+
		"\u027a\u027b\b\32\1\2\u027b\u0295\3\2\2\2\u027c\u027d\f\26\2\2\u027d\u027e"+
		"\5^\60\2\u027e\u027f\7\r\2\2\u027f\u0280\b\32\1\2\u0280\u0295\3\2\2\2"+
		"\u0281\u0282\f\23\2\2\u0282\u0283\5b\62\2\u0283\u0284\5\60\31\2\u0284"+
		"\u0285\b\32\1\2\u0285\u0295\3\2\2\2\u0286\u0287\f\22\2\2\u0287\u0288\5"+
		"b\62\2\u0288\u0289\7\u01fa\2\2\u0289\u028a\5\16\b\2\u028a\u028b\7\u01fd"+
		"\2\2\u028b\u028c\b\32\1\2\u028c\u0295\3\2\2\2\u028d\u028e\f\21\2\2\u028e"+
		"\u028f\5d\63\2\u028f\u0290\7\u01fa\2\2\u0290\u0291\5\16\b\2\u0291\u0292"+
		"\7\u01fd\2\2\u0292\u0293\b\32\1\2\u0293\u0295\3\2\2\2\u0294\u0240\3\2"+
		"\2\2\u0294\u0245\3\2\2\2\u0294\u024a\3\2\2\2\u0294\u024f\3\2\2\2\u0294"+
		"\u0254\3\2\2\2\u0294\u0259\3\2\2\2\u0294\u025e\3\2\2\2\u0294\u0263\3\2"+
		"\2\2\u0294\u026a\3\2\2\2\u0294\u0272\3\2\2\2\u0294\u0277\3\2\2\2\u0294"+
		"\u027c\3\2\2\2\u0294\u0281\3\2\2\2\u0294\u0286\3\2\2\2\u0294\u028d\3\2"+
		"\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\63\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\5\66\34\2\u029a\u029b\b\33"+
		"\1\2\u029b\u02c2\3\2\2\2\u029c\u029d\58\35\2\u029d\u029e\b\33\1\2\u029e"+
		"\u02c2\3\2\2\2\u029f\u02a0\5:\36\2\u02a0\u02a1\b\33\1\2\u02a1\u02c2\3"+
		"\2\2\2\u02a2\u02a3\5<\37\2\u02a3\u02a4\b\33\1\2\u02a4\u02c2\3\2\2\2\u02a5"+
		"\u02a6\5V,\2\u02a6\u02a7\7\u01fb\2\2\u02a7\u02a8\5\62\32\2\u02a8\u02a9"+
		"\7\u01fe\2\2\u02a9\u02aa\b\33\1\2\u02aa\u02c2\3\2\2\2\u02ab\u02ac\5\66"+
		"\34\2\u02ac\u02ad\7\u01fb\2\2\u02ad\u02ae\5\62\32\2\u02ae\u02af\7\u01fe"+
		"\2\2\u02af\u02b0\b\33\1\2\u02b0\u02c2\3\2\2\2\u02b1\u02b2\58\35\2\u02b2"+
		"\u02b3\7\u01fb\2\2\u02b3\u02b4\5\62\32\2\u02b4\u02b5\7\u01fe\2\2\u02b5"+
		"\u02b6\b\33\1\2\u02b6\u02c2\3\2\2\2\u02b7\u02b8\5V,\2\u02b8\u02b9\7\4"+
		"\2\2\u02b9\u02ba\5\62\32\2\u02ba\u02bb\b\33\1\2\u02bb\u02c2\3\2\2\2\u02bc"+
		"\u02bd\5:\36\2\u02bd\u02be\7\4\2\2\u02be\u02bf\5\62\32\2\u02bf\u02c0\b"+
		"\33\1\2\u02c0\u02c2\3\2\2\2\u02c1\u0299\3\2\2\2\u02c1\u029c\3\2\2\2\u02c1"+
		"\u029f\3\2\2\2\u02c1\u02a2\3\2\2\2\u02c1\u02a5\3\2\2\2\u02c1\u02ab\3\2"+
		"\2\2\u02c1\u02b1\3\2\2\2\u02c1\u02b7\3\2\2\2\u02c1\u02bc\3\2\2\2\u02c2"+
		"\65\3\2\2\2\u02c3\u02c4\b\34\1\2\u02c4\u02c5\7\27\2\2\u02c5\u02c6\7\u01fa"+
		"\2\2\u02c6\u02cb\5\62\32\2\u02c7\u02c8\7\u01ec\2\2\u02c8\u02ca\5\62\32"+
		"\2\u02c9\u02c7\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc"+
		"\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02cf\7\u01fd\2"+
		"\2\u02cf\u02d0\b\34\1\2\u02d0\67\3\2\2\2\u02d1\u02d2\b\35\1\2\u02d2\u02d3"+
		"\7\u00f2\2\2\u02d3\u02d4\7\u01fa\2\2\u02d4\u02d5\5\62\32\2\u02d5\u02d6"+
		"\7\u01ec\2\2\u02d6\u02de\5\62\32\2\u02d7\u02d8\7\u01ec\2\2\u02d8\u02d9"+
		"\5\62\32\2\u02d9\u02da\7\u01ec\2\2\u02da\u02db\5\62\32\2\u02db\u02dd\3"+
		"\2\2\2\u02dc\u02d7\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e2\7\u01fd"+
		"\2\2\u02e2\u02e3\b\35\1\2\u02e39\3\2\2\2\u02e4\u02e5\b\36\1\2\u02e5\u02e6"+
		"\7\u018e\2\2\u02e6\u02e7\7\u01fa\2\2\u02e7\u02ec\5\62\32\2\u02e8\u02e9"+
		"\7\u01ec\2\2\u02e9\u02eb\5\62\32\2\u02ea\u02e8\3\2\2\2\u02eb\u02ee\3\2"+
		"\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee"+
		"\u02ec\3\2\2\2\u02ef\u02f0\7\u01fd\2\2\u02f0\u02f1\b\36\1\2\u02f1;\3\2"+
		"\2\2\u02f2\u02f3\b\37\1\2\u02f3\u02f4\7\u0106\2\2\u02f4\u02f5\7\u01fa"+
		"\2\2\u02f5\u02f6\5\62\32\2\u02f6\u02f7\7\u01ec\2\2\u02f7\u02ff\5\62\32"+
		"\2\u02f8\u02f9\7\u01ec\2\2\u02f9\u02fa\5\62\32\2\u02fa\u02fb\7\u01ec\2"+
		"\2\u02fb\u02fc\5\62\32\2\u02fc\u02fe\3\2\2\2\u02fd\u02f8\3\2\2\2\u02fe"+
		"\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2"+
		"\2\2\u0301\u02ff\3\2\2\2\u0302\u0303\7\u01fd\2\2\u0303\u0304\b\37\1\2"+
		"\u0304=\3\2\2\2\u0305\u0306\7\32\2\2\u0306\u0307\7\u01fa\2\2\u0307\u0308"+
		"\5\62\32\2\u0308\u0309\7\u01fd\2\2\u0309\u030a\b \1\2\u030a\u0507\3\2"+
		"\2\2\u030b\u030c\7!\2\2\u030c\u030d\7\u01fa\2\2\u030d\u030e\5\62\32\2"+
		"\u030e\u030f\7\u01fd\2\2\u030f\u0310\b \1\2\u0310\u0507\3\2\2\2\u0311"+
		"\u0312\7\66\2\2\u0312\u0313\7\u01fa\2\2\u0313\u0314\5\62\32\2\u0314\u0315"+
		"\7\u01fd\2\2\u0315\u0316\b \1\2\u0316\u0507\3\2\2\2\u0317\u0318\78\2\2"+
		"\u0318\u0319\7\u01fa\2\2\u0319\u031a\5\62\32\2\u031a\u031b\7\u01fd\2\2"+
		"\u031b\u031c\b \1\2\u031c\u0507\3\2\2\2\u031d\u031e\b \1\2\u031e\u031f"+
		"\7G\2\2\u031f\u0320\7\u01fa\2\2\u0320\u0323\5\62\32\2\u0321\u0322\7\u01ec"+
		"\2\2\u0322\u0324\5\62\32\2\u0323\u0321\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\7\u01fd"+
		"\2\2\u0328\u0329\b \1\2\u0329\u0507\3\2\2\2\u032a\u032b\b \1\2\u032b\u032c"+
		"\7H\2\2\u032c\u032d\7\u01fa\2\2\u032d\u032e\5\62\32\2\u032e\u032f\7\u01ec"+
		"\2\2\u032f\u0332\5\62\32\2\u0330\u0331\7\u01ec\2\2\u0331\u0333\5\62\32"+
		"\2\u0332\u0330\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335"+
		"\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\7\u01fd\2\2\u0337\u0338\b \1"+
		"\2\u0338\u0507\3\2\2\2\u0339\u033a\7i\2\2\u033a\u033b\7\u01fa\2\2\u033b"+
		"\u033c\5\62\32\2\u033c\u033d\7\u01ec\2\2\u033d\u033e\5\62\32\2\u033e\u033f"+
		"\7\u01fd\2\2\u033f\u0340\b \1\2\u0340\u0507\3\2\2\2\u0341\u0342\b \1\2"+
		"\u0342\u0343\7\u0082\2\2\u0343\u0344\7\u01fa\2\2\u0344\u0345\5\62\32\2"+
		"\u0345\u0346\7\u01ec\2\2\u0346\u034b\5\62\32\2\u0347\u0348\7\u01ec\2\2"+
		"\u0348\u034a\5\62\32\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e"+
		"\u034f\7\u01fd\2\2\u034f\u0350\b \1\2\u0350\u0507\3\2\2\2\u0351\u0352"+
		"\7\u0084\2\2\u0352\u0353\7\u01fa\2\2\u0353\u0354\5\62\32\2\u0354\u0355"+
		"\7\u01ec\2\2\u0355\u0356\5\62\32\2\u0356\u0357\7\u01fd\2\2\u0357\u0358"+
		"\b \1\2\u0358\u0507\3\2\2\2\u0359\u035a\b \1\2\u035a\u035b\7\u0095\2\2"+
		"\u035b\u035c\7\u01fa\2\2\u035c\u035d\5\62\32\2\u035d\u035e\7\u01ec\2\2"+
		"\u035e\u0363\5\62\32\2\u035f\u0360\7\u01ec\2\2\u0360\u0362\5\62\32\2\u0361"+
		"\u035f\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2"+
		"\2\2\u0364\u0366\3\2\2\2\u0365\u0363\3\2\2\2\u0366\u0367\7\u01fd\2\2\u0367"+
		"\u0368\b \1\2\u0368\u0507\3\2\2\2\u0369\u036a\7\u0097\2\2\u036a\u036b"+
		"\7\u01fa\2\2\u036b\u036c\5\62\32\2\u036c\u036d\7\u01ec\2\2\u036d\u036e"+
		"\5\62\32\2\u036e\u036f\7\u01fd\2\2\u036f\u0370\b \1\2\u0370\u0507\3\2"+
		"\2\2\u0371\u0372\7\u009f\2\2\u0372\u0373\7\u01fa\2\2\u0373\u0374\5\62"+
		"\32\2\u0374\u0375\7\u01ec\2\2\u0375\u0376\5\62\32\2\u0376\u0377\7\u01fd"+
		"\2\2\u0377\u0378\b \1\2\u0378\u0507\3\2\2\2\u0379\u037a\7\u00a6\2\2\u037a"+
		"\u037b\7\u01fa\2\2\u037b\u037c\5\62\32\2\u037c\u037d\7\u01ec\2\2\u037d"+
		"\u037e\5\62\32\2\u037e\u037f\7\u01fd\2\2\u037f\u0380\b \1\2\u0380\u0507"+
		"\3\2\2\2\u0381\u0382\7\u00bb\2\2\u0382\u0383\7\u01fa\2\2\u0383\u0384\5"+
		"\62\32\2\u0384\u0385\7\u01ec\2\2\u0385\u0386\5\62\32\2\u0386\u0387\7\u01fd"+
		"\2\2\u0387\u0388\b \1\2\u0388\u0507\3\2\2\2\u0389\u038a\7\u00c2\2\2\u038a"+
		"\u038b\7\u01fa\2\2\u038b\u038c\5\62\32\2\u038c\u038d\7\u01ec\2\2\u038d"+
		"\u038e\5\62\32\2\u038e\u038f\7\u01fd\2\2\u038f\u0390\b \1\2\u0390\u0507"+
		"\3\2\2\2\u0391\u0392\7\u00dc\2\2\u0392\u0393\7\u01fa\2\2\u0393\u0394\5"+
		"\62\32\2\u0394\u0395\7\u01fd\2\2\u0395\u0396\b \1\2\u0396\u0507\3\2\2"+
		"\2\u0397\u0398\7\u00e2\2\2\u0398\u0399\7\u01fa\2\2\u0399\u039a\5\62\32"+
		"\2\u039a\u039b\7\u01ec\2\2\u039b\u039c\5\62\32\2\u039c\u039d\7\u01fd\2"+
		"\2\u039d\u039e\b \1\2\u039e\u0507\3\2\2\2\u039f\u03a0\7\u00e2\2\2\u03a0"+
		"\u03a1\7\u01fa\2\2\u03a1\u03a2\5\62\32\2\u03a2\u03a3\7\u01ec\2\2\u03a3"+
		"\u03a4\5\62\32\2\u03a4\u03a5\7\u01ec\2\2\u03a5\u03a6\5\62\32\2\u03a6\u03a7"+
		"\7\u01fd\2\2\u03a7\u03a8\b \1\2\u03a8\u0507\3\2\2\2\u03a9\u03aa\t\f\2"+
		"\2\u03aa\u03ab\7\u01fa\2\2\u03ab\u03ac\5\62\32\2\u03ac\u03ad\7\u01fd\2"+
		"\2\u03ad\u03ae\b \1\2\u03ae\u0507\3\2\2\2\u03af\u03b0\7\u00ef\2\2\u03b0"+
		"\u03b1\7\u01fa\2\2\u03b1\u03b2\5\62\32\2\u03b2\u03b3\7\u01ec\2\2\u03b3"+
		"\u03b4\5\62\32\2\u03b4\u03b5\7\u01ec\2\2\u03b5\u03b6\5\62\32\2\u03b6\u03b7"+
		"\7\u01fd\2\2\u03b7\u03b8\b \1\2\u03b8\u0507\3\2\2\2\u03b9\u03ba\7\u00f1"+
		"\2\2\u03ba\u03bb\7\u01fa\2\2\u03bb\u03bc\5\62\32\2\u03bc\u03bd\7\u01fd"+
		"\2\2\u03bd\u03be\b \1\2\u03be\u0507\3\2\2\2\u03bf\u03c0\7\u0119\2\2\u03c0"+
		"\u03c1\7\u01fa\2\2\u03c1\u03c2\5\62\32\2\u03c2\u03c3\7\u01fd\2\2\u03c3"+
		"\u03c4\b \1\2\u03c4\u0507\3\2\2\2\u03c5\u03c6\7\u0126\2\2\u03c6\u03c7"+
		"\7\u01fa\2\2\u03c7\u03c8\5\62\32\2\u03c8\u03c9\7\u01ec\2\2\u03c9\u03ca"+
		"\5\62\32\2\u03ca\u03cb\7\u01fd\2\2\u03cb\u03cc\b \1\2\u03cc\u0507\3\2"+
		"\2\2\u03cd\u03ce\7\u0126\2\2\u03ce\u03cf\7\u01fa\2\2\u03cf\u03d0\5\62"+
		"\32\2\u03d0\u03d1\7\u01ec\2\2\u03d1\u03d2\5\62\32\2\u03d2\u03d3\7\u01ec"+
		"\2\2\u03d3\u03d4\5\62\32\2\u03d4\u03d5\7\u01fd\2\2\u03d5\u03d6\b \1\2"+
		"\u03d6\u0507\3\2\2\2\u03d7\u03d8\b \1\2\u03d8\u03d9\7\u0136\2\2\u03d9"+
		"\u03da\7\u01fa\2\2\u03da\u03db\5\62\32\2\u03db\u03dc\7\u01ec\2\2\u03dc"+
		"\u03df\5\62\32\2\u03dd\u03de\7\u01ec\2\2\u03de\u03e0\5\62\32\2\u03df\u03dd"+
		"\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u03e3\3\2\2\2\u03e3\u03e4\7\u01fd\2\2\u03e4\u03e5\b \1\2\u03e5\u0507"+
		"\3\2\2\2\u03e6\u03e7\7\u013d\2\2\u03e7\u03e8\7\u01fa\2\2\u03e8\u03e9\5"+
		"\62\32\2\u03e9\u03ea\7\u01fd\2\2\u03ea\u03eb\b \1\2\u03eb\u0507\3\2\2"+
		"\2\u03ec\u03ed\7\u0145\2\2\u03ed\u03ee\7\u01fa\2\2\u03ee\u03ef\5\62\32"+
		"\2\u03ef\u03f0\7\u01ec\2\2\u03f0\u03f1\5\62\32\2\u03f1\u03f2\7\u01ec\2"+
		"\2\u03f2\u03f3\5\62\32\2\u03f3\u03f4\7\u01fd\2\2\u03f4\u03f5\b \1\2\u03f5"+
		"\u0507\3\2\2\2\u03f6\u03f7\7\u0146\2\2\u03f7\u03f8\7\u01fa\2\2\u03f8\u03f9"+
		"\5\62\32\2\u03f9\u03fa\7\u01ec\2\2\u03fa\u03fb\5\62\32\2\u03fb\u03fc\7"+
		"\u01ec\2\2\u03fc\u03fd\5\62\32\2\u03fd\u03fe\7\u01fd\2\2\u03fe\u03ff\b"+
		" \1\2\u03ff\u0507\3\2\2\2\u0400\u0401\7\u0150\2\2\u0401\u0402\7\u01fa"+
		"\2\2\u0402\u0403\5\62\32\2\u0403\u0404\7\u01ec\2\2\u0404\u0405\5\62\32"+
		"\2\u0405\u0406\7\u01fd\2\2\u0406\u0407\b \1\2\u0407\u0507\3\2\2\2\u0408"+
		"\u0409\7\u0151\2\2\u0409\u040a\7\u01fa\2\2\u040a\u040b\5\62\32\2\u040b"+
		"\u040c\7\u01ec\2\2\u040c\u040d\5\62\32\2\u040d\u040e\7\u01ec\2\2\u040e"+
		"\u040f\5\62\32\2\u040f\u0410\7\u01fd\2\2\u0410\u0411\b \1\2\u0411\u0507"+
		"\3\2\2\2\u0412\u0413\7\u0158\2\2\u0413\u0414\7\u01fa\2\2\u0414\u0415\5"+
		"\62\32\2\u0415\u0416\7\u01fd\2\2\u0416\u0417\b \1\2\u0417\u0507\3\2\2"+
		"\2\u0418\u0419\7\u0162\2\2\u0419\u041a\7\u01fa\2\2\u041a\u041b\5\62\32"+
		"\2\u041b\u041c\7\u01ec\2\2\u041c\u041d\5\62\32\2\u041d\u041e\7\u01ec\2"+
		"\2\u041e\u041f\5\62\32\2\u041f\u0420\7\u01fd\2\2\u0420\u0421\b \1\2\u0421"+
		"\u0507\3\2\2\2\u0422\u0423\7\u0165\2\2\u0423\u0424\7\u01fa\2\2\u0424\u0425"+
		"\5\62\32\2\u0425\u0426\7\u01fd\2\2\u0426\u0427\b \1\2\u0427\u0507\3\2"+
		"\2\2\u0428\u0429\7\u016f\2\2\u0429\u042a\7\u01fa\2\2\u042a\u042b\5\62"+
		"\32\2\u042b\u042c\7\u01ec\2\2\u042c\u042d\5\62\32\2\u042d\u042e\7\u01ec"+
		"\2\2\u042e\u042f\5\62\32\2\u042f\u0430\7\u01fd\2\2\u0430\u0431\b \1\2"+
		"\u0431\u0507\3\2\2\2\u0432\u0433\7\u017d\2\2\u0433\u0434\7\u01fa\2\2\u0434"+
		"\u0435\5\62\32\2\u0435\u0436\7\u01fd\2\2\u0436\u0437\b \1\2\u0437\u0507"+
		"\3\2\2\2\u0438\u0439\7\u017e\2\2\u0439\u043a\7\u01fa\2\2\u043a\u043b\5"+
		"\62\32\2\u043b\u043c\7\u01ec\2\2\u043c\u043d\5\62\32\2\u043d\u043e\7\u01fd"+
		"\2\2\u043e\u043f\b \1\2\u043f\u0507\3\2\2\2\u0440\u0441\7\u018d\2\2\u0441"+
		"\u0442\7\u01fa\2\2\u0442\u0443\5\62\32\2\u0443\u0444\7\u01fd\2\2\u0444"+
		"\u0445\b \1\2\u0445\u0507\3\2\2\2\u0446\u0447\7\u018d\2\2\u0447\u0448"+
		"\7\u01fa\2\2\u0448\u0449\5\62\32\2\u0449\u044a\7\u01ec\2\2\u044a\u044b"+
		"\5\62\32\2\u044b\u044c\7\u01fd\2\2\u044c\u044d\b \1\2\u044d\u0507\3\2"+
		"\2\2\u044e\u044f\7\u018d\2\2\u044f\u0450\7\u01fa\2\2\u0450\u0451\5\62"+
		"\32\2\u0451\u0452\7\u01ec\2\2\u0452\u0453\5\62\32\2\u0453\u0454\7\u01ec"+
		"\2\2\u0454\u0455\5\62\32\2\u0455\u0456\7\u01fd\2\2\u0456\u0457\b \1\2"+
		"\u0457\u0507\3\2\2\2\u0458\u0459\t\r\2\2\u0459\u045a\7\u01fa\2\2\u045a"+
		"\u045b\5\62\32\2\u045b\u045c\7\u01ec\2\2\u045c\u045d\5\62\32\2\u045d\u045e"+
		"\7\u01fd\2\2\u045e\u045f\b \1\2\u045f\u0507\3\2\2\2\u0460\u0461\t\r\2"+
		"\2\u0461\u0462\7\u01fa\2\2\u0462\u0463\5\62\32\2\u0463\u0464\7\u01ec\2"+
		"\2\u0464\u0465\5\62\32\2\u0465\u0466\7\u01ec\2\2\u0466\u0467\5\62\32\2"+
		"\u0467\u0468\7\u01fd\2\2\u0468\u0469\b \1\2\u0469\u0507\3\2\2\2\u046a"+
		"\u046b\7\u0192\2\2\u046b\u046c\7\u01fa\2\2\u046c\u046d\5\62\32\2\u046d"+
		"\u046e\7\u01ec\2\2\u046e\u046f\5\62\32\2\u046f\u0470\7\u01ec\2\2\u0470"+
		"\u0471\5\62\32\2\u0471\u0472\7\u01fd\2\2\u0472\u0473\b \1\2\u0473\u0507"+
		"\3\2\2\2\u0474\u0475\7\u01a4\2\2\u0475\u0476\7\u01fa\2\2\u0476\u0477\5"+
		"\62\32\2\u0477\u0478\7\u01ec\2\2\u0478\u0479\5\62\32\2\u0479\u047a\7\u01ec"+
		"\2\2\u047a\u047b\5\62\32\2\u047b\u047c\7\u01fd\2\2\u047c\u047d\b \1\2"+
		"\u047d\u0507\3\2\2\2\u047e\u047f\7\u0167\2\2\u047f\u0480\7\u01fa\2\2\u0480"+
		"\u0481\5\62\32\2\u0481\u0482\7\u01fd\2\2\u0482\u0483\b \1\2\u0483\u0507"+
		"\3\2\2\2\u0484\u0485\7\u01aa\2\2\u0485\u0486\7\u01fa\2\2\u0486\u0487\5"+
		"\62\32\2\u0487\u0488\7\u01fd\2\2\u0488\u0489\b \1\2\u0489\u0507\3\2\2"+
		"\2\u048a\u048b\t\16\2\2\u048b\u048c\7\u01fa\2\2\u048c\u048d\5\62\32\2"+
		"\u048d\u048e\7\u01fd\2\2\u048e\u048f\b \1\2\u048f\u0507\3\2\2\2\u0490"+
		"\u0491\7\u00bc\2\2\u0491\u0492\7\u01fa\2\2\u0492\u0493\5\62\32\2\u0493"+
		"\u0494\7\u01fd\2\2\u0494\u0495\b \1\2\u0495\u0507\3\2\2\2\u0496\u0497"+
		"\7\u00dd\2\2\u0497\u0498\7\u01fa\2\2\u0498\u0499\5\62\32\2\u0499\u049a"+
		"\7\u01ec\2\2\u049a\u049b\5\62\32\2\u049b\u049c\7\u01fd\2\2\u049c\u049d"+
		"\b \1\2\u049d\u0507\3\2\2\2\u049e\u049f\7\u017c\2\2\u049f\u04a0\7\u01fa"+
		"\2\2\u04a0\u04a1\5\62\32\2\u04a1\u04a2\7\u01fd\2\2\u04a2\u04a3\b \1\2"+
		"\u04a3\u0507\3\2\2\2\u04a4\u04a5\7\u00f3\2\2\u04a5\u04a6\7\u01fa\2\2\u04a6"+
		"\u04a7\5\62\32\2\u04a7\u04a8\7\u01fd\2\2\u04a8\u04a9\b \1\2\u04a9\u0507"+
		"\3\2\2\2\u04aa\u04ab\7\u00f3\2\2\u04ab\u04ac\7\u01fa\2\2\u04ac\u04ad\5"+
		"\62\32\2\u04ad\u04ae\7\u01ec\2\2\u04ae\u04af\5\62\32\2\u04af\u04b0\7\u01fd"+
		"\2\2\u04b0\u04b1\b \1\2\u04b1\u0507\3\2\2\2\u04b2\u04b3\7\u00f3\2\2\u04b3"+
		"\u04b4\7\u01fa\2\2\u04b4\u04b5\5\62\32\2\u04b5\u04b6\7\u01ec\2\2\u04b6"+
		"\u04b7\5\62\32\2\u04b7\u04b8\7\u01ec\2\2\u04b8\u04b9\5\62\32\2\u04b9\u04ba"+
		"\7\u01fd\2\2\u04ba\u04bb\b \1\2\u04bb\u0507\3\2\2\2\u04bc\u04bd\7\u00f3"+
		"\2\2\u04bd\u04be\7\u01fa\2\2\u04be\u04bf\5\62\32\2\u04bf\u04c0\7\u01ec"+
		"\2\2\u04c0\u04c1\5\62\32\2\u04c1\u04c2\7\u01ec\2\2\u04c2\u04c3\5\62\32"+
		"\2\u04c3\u04c4\7\u01ec\2\2\u04c4\u04c5\5\62\32\2\u04c5\u04c6\7\u01fd\2"+
		"\2\u04c6\u04c7\b \1\2\u04c7\u0507\3\2\2\2\u04c8\u04c9\7\u00f4\2\2\u04c9"+
		"\u04ca\7\u01fa\2\2\u04ca\u04cb\5\62\32\2\u04cb\u04cc\7\u01fd\2\2\u04cc"+
		"\u04cd\b \1\2\u04cd\u0507\3\2\2\2\u04ce\u04cf\7\u00f4\2\2\u04cf\u04d0"+
		"\7\u01fa\2\2\u04d0\u04d1\5\62\32\2\u04d1\u04d2\7\u01ec\2\2\u04d2\u04d3"+
		"\5\62\32\2\u04d3\u04d4\7\u01fd\2\2\u04d4\u04d5\b \1\2\u04d5\u0507\3\2"+
		"\2\2\u04d6\u04d7\7\u00f6\2\2\u04d7\u04d8\7\u01fa\2\2\u04d8\u04d9\5\62"+
		"\32\2\u04d9\u04da\7\u01fd\2\2\u04da\u04db\b \1\2\u04db\u0507\3\2\2\2\u04dc"+
		"\u04dd\7\u00f6\2\2\u04dd\u04de\7\u01fa\2\2\u04de\u04df\5\62\32\2\u04df"+
		"\u04e0\7\u01ec\2\2\u04e0\u04e1\5\62\32\2\u04e1\u04e2\7\u01fd\2\2\u04e2"+
		"\u04e3\b \1\2\u04e3\u0507\3\2\2\2\u04e4\u04e5\7\u00f7\2\2\u04e5\u04e6"+
		"\7\u01fa\2\2\u04e6\u04e7\5\62\32\2\u04e7\u04e8\7\u01fd\2\2\u04e8\u04e9"+
		"\b \1\2\u04e9\u0507\3\2\2\2\u04ea\u04eb\7\u00f7\2\2\u04eb\u04ec\7\u01fa"+
		"\2\2\u04ec\u04ed\5\62\32\2\u04ed\u04ee\7\u01ec\2\2\u04ee\u04ef\5\62\32"+
		"\2\u04ef\u04f0\7\u01fd\2\2\u04f0\u04f1\b \1\2\u04f1\u0507\3\2\2\2\u04f2"+
		"\u04f3\7\u00f8\2\2\u04f3\u04f4\7\u01fa\2\2\u04f4\u04f5\5\62\32\2\u04f5"+
		"\u04f6\7\u01fd\2\2\u04f6\u04f7\b \1\2\u04f7\u0507\3\2\2\2\u04f8\u04f9"+
		"\7\u00f8\2\2\u04f9\u04fa\7\u01fa\2\2\u04fa\u04fb\5\62\32\2\u04fb\u04fc"+
		"\7\u01ec\2\2\u04fc\u04fd\5\62\32\2\u04fd\u04fe\7\u01fd\2\2\u04fe\u04ff"+
		"\b \1\2\u04ff\u0507\3\2\2\2\u0500\u0501\7\u00f5\2\2\u0501\u0502\7\u01fa"+
		"\2\2\u0502\u0503\5\62\32\2\u0503\u0504\7\u01fd\2\2\u0504\u0505\b \1\2"+
		"\u0505\u0507\3\2\2\2\u0506\u0305\3\2\2\2\u0506\u030b\3\2\2\2\u0506\u0311"+
		"\3\2\2\2\u0506\u0317\3\2\2\2\u0506\u031d\3\2\2\2\u0506\u032a\3\2\2\2\u0506"+
		"\u0339\3\2\2\2\u0506\u0341\3\2\2\2\u0506\u0351\3\2\2\2\u0506\u0359\3\2"+
		"\2\2\u0506\u0369\3\2\2\2\u0506\u0371\3\2\2\2\u0506\u0379\3\2\2\2\u0506"+
		"\u0381\3\2\2\2\u0506\u0389\3\2\2\2\u0506\u0391\3\2\2\2\u0506\u0397\3\2"+
		"\2\2\u0506\u039f\3\2\2\2\u0506\u03a9\3\2\2\2\u0506\u03af\3\2\2\2\u0506"+
		"\u03b9\3\2\2\2\u0506\u03bf\3\2\2\2\u0506\u03c5\3\2\2\2\u0506\u03cd\3\2"+
		"\2\2\u0506\u03d7\3\2\2\2\u0506\u03e6\3\2\2\2\u0506\u03ec\3\2\2\2\u0506"+
		"\u03f6\3\2\2\2\u0506\u0400\3\2\2\2\u0506\u0408\3\2\2\2\u0506\u0412\3\2"+
		"\2\2\u0506\u0418\3\2\2\2\u0506\u0422\3\2\2\2\u0506\u0428\3\2\2\2\u0506"+
		"\u0432\3\2\2\2\u0506\u0438\3\2\2\2\u0506\u0440\3\2\2\2\u0506\u0446\3\2"+
		"\2\2\u0506\u044e\3\2\2\2\u0506\u0458\3\2\2\2\u0506\u0460\3\2\2\2\u0506"+
		"\u046a\3\2\2\2\u0506\u0474\3\2\2\2\u0506\u047e\3\2\2\2\u0506\u0484\3\2"+
		"\2\2\u0506\u048a\3\2\2\2\u0506\u0490\3\2\2\2\u0506\u0496\3\2\2\2\u0506"+
		"\u049e\3\2\2\2\u0506\u04a4\3\2\2\2\u0506\u04aa\3\2\2\2\u0506\u04b2\3\2"+
		"\2\2\u0506\u04bc\3\2\2\2\u0506\u04c8\3\2\2\2\u0506\u04ce\3\2\2\2\u0506"+
		"\u04d6\3\2\2\2\u0506\u04dc\3\2\2\2\u0506\u04e4\3\2\2\2\u0506\u04ea\3\2"+
		"\2\2\u0506\u04f2\3\2\2\2\u0506\u04f8\3\2\2\2\u0506\u0500\3\2\2\2\u0507"+
		"?\3\2\2\2\u0508\u0509\b!\1\2\u0509\u050a\7\u00d2\2\2\u050a\u050b\7\u01fa"+
		"\2\2\u050b\u050c\5\62\32\2\u050c\u050d\7\u01ec\2\2\u050d\u0512\5\62\32"+
		"\2\u050e\u050f\7\u01ec\2\2\u050f\u0511\5\62\32\2\u0510\u050e\3\2\2\2\u0511"+
		"\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515\3\2"+
		"\2\2\u0514\u0512\3\2\2\2\u0515\u0516\7\u01fd\2\2\u0516\u0517\b!\1\2\u0517"+
		"\u056d\3\2\2\2\u0518\u0519\b!\1\2\u0519\u051a\7\u0143\2\2\u051a\u051b"+
		"\7\u01fa\2\2\u051b\u051c\5\62\32\2\u051c\u051d\7\u01ec\2\2\u051d\u0522"+
		"\5\62\32\2\u051e\u051f\7\u01ec\2\2\u051f\u0521\5\62\32\2\u0520\u051e\3"+
		"\2\2\2\u0521\u0524\3\2\2\2\u0522\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523"+
		"\u0525\3\2\2\2\u0524\u0522\3\2\2\2\u0525\u0526\7\u01fd\2\2\u0526\u0527"+
		"\b!\1\2\u0527\u056d\3\2\2\2\u0528\u0529\b!\1\2\u0529\u052a\7\u00ac\2\2"+
		"\u052a\u052b\7\u01fa\2\2\u052b\u0530\5\62\32\2\u052c\u052d\7\u01ec\2\2"+
		"\u052d\u052f\5\62\32\2\u052e\u052c\3\2\2\2\u052f\u0532\3\2\2\2\u0530\u052e"+
		"\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0533\3\2\2\2\u0532\u0530\3\2\2\2\u0533"+
		"\u0534\7\u01fd\2\2\u0534\u0535\b!\1\2\u0535\u056d\3\2\2\2\u0536\u0537"+
		"\7\u01d4\2\2\u0537\u0538\7\u01fa\2\2\u0538\u0539\7\u01fd\2\2\u0539\u056d"+
		"\b!\1\2\u053a\u053b\7\u00eb\2\2\u053b\u053c\7\u01fa\2\2\u053c\u053d\7"+
		"\u01fd\2\2\u053d\u056d\b!\1\2\u053e\u053f\7\\\2\2\u053f\u0540\7\u01fa"+
		"\2\2\u0540\u0541\7\u01fd\2\2\u0541\u056d\b!\1\2\u0542\u0543\t\17\2\2\u0543"+
		"\u0544\7\u01fa\2\2\u0544\u0545\5\62\32\2\u0545\u0546\7\u01fd\2\2\u0546"+
		"\u0547\b!\1\2\u0547\u056d\3\2\2\2\u0548\u0549\7\u0174\2\2\u0549\u054a"+
		"\7\u01fa\2\2\u054a\u054b\5\62\32\2\u054b\u054c\7\u01ec\2\2\u054c\u054d"+
		"\5\62\32\2\u054d\u054e\7\u01fd\2\2\u054e\u054f\b!\1\2\u054f\u056d\3\2"+
		"\2\2\u0550\u0551\7\22\2\2\u0551\u0552\7\u01fa\2\2\u0552\u0553\5\62\32"+
		"\2\u0553\u0554\7\u01ec\2\2\u0554\u0555\5\62\32\2\u0555\u0556\7\u01fd\2"+
		"\2\u0556\u0557\b!\1\2\u0557\u056d\3\2\2\2\u0558\u0559\7\23\2\2\u0559\u055a"+
		"\7\u01fa\2\2\u055a\u055b\5\62\32\2\u055b\u055c\7\u01ec\2\2\u055c\u055d"+
		"\5\62\32\2\u055d\u055e\7\u01fd\2\2\u055e\u055f\b!\1\2\u055f\u056d\3\2"+
		"\2\2\u0560\u0561\7\u01ba\2\2\u0561\u0562\7\u01fa\2\2\u0562\u0563\7\u01fd"+
		"\2\2\u0563\u056d\b!\1\2\u0564\u0565\t\20\2\2\u0565\u0566\7\u01fa\2\2\u0566"+
		"\u0567\5\62\32\2\u0567\u0568\7\u01ec\2\2\u0568\u0569\5\62\32\2\u0569\u056a"+
		"\7\u01fd\2\2\u056a\u056b\b!\1\2\u056b\u056d\3\2\2\2\u056c\u0508\3\2\2"+
		"\2\u056c\u0518\3\2\2\2\u056c\u0528\3\2\2\2\u056c\u0536\3\2\2\2\u056c\u053a"+
		"\3\2\2\2\u056c\u053e\3\2\2\2\u056c\u0542\3\2\2\2\u056c\u0548\3\2\2\2\u056c"+
		"\u0550\3\2\2\2\u056c\u0558\3\2\2\2\u056c\u0560\3\2\2\2\u056c\u0564\3\2"+
		"\2\2\u056dA\3\2\2\2\u056e\u056f\b\"\1\2\u056f\u0572\5D#\2\u0570\u0571"+
		"\7\u01ed\2\2\u0571\u0573\5D#\2\u0572\u0570\3\2\2\2\u0573\u0574\3\2\2\2"+
		"\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0577"+
		"\b\"\1\2\u0577C\3\2\2\2\u0578\u0579\5T+\2\u0579\u057a\b#\1\2\u057a\u0599"+
		"\3\2\2\2\u057b\u057c\5V,\2\u057c\u057d\b#\1\2\u057d\u0599\3\2\2\2\u057e"+
		"\u057f\7\u01fa\2\2\u057f\u0580\5\62\32\2\u0580\u0581\7\u01fd\2\2\u0581"+
		"\u0582\b#\1\2\u0582\u0599\3\2\2\2\u0583\u0584\5J&\2\u0584\u0585\b#\1\2"+
		"\u0585\u0599\3\2\2\2\u0586\u0587\5R*\2\u0587\u0588\b#\1\2\u0588\u0599"+
		"\3\2\2\2\u0589\u058a\5H%\2\u058a\u058b\b#\1\2\u058b\u0599\3\2\2\2\u058c"+
		"\u058d\5F$\2\u058d\u058e\b#\1\2\u058e\u0599\3\2\2\2\u058f\u0590\5> \2"+
		"\u0590\u0591\b#\1\2\u0591\u0599\3\2\2\2\u0592\u0593\5@!\2\u0593\u0594"+
		"\b#\1\2\u0594\u0599\3\2\2\2\u0595\u0596\5N(\2\u0596\u0597\b#\1\2\u0597"+
		"\u0599\3\2\2\2\u0598\u0578\3\2\2\2\u0598\u057b\3\2\2\2\u0598\u057e\3\2"+
		"\2\2\u0598\u0583\3\2\2\2\u0598\u0586\3\2\2\2\u0598\u0589\3\2\2\2\u0598"+
		"\u058c\3\2\2\2\u0598\u058f\3\2\2\2\u0598\u0592\3\2\2\2\u0598\u0595\3\2"+
		"\2\2\u0599E\3\2\2\2\u059a\u059b\7\u00b5\2\2\u059b\u059c\7\u01fa\2\2\u059c"+
		"\u059d\5\62\32\2\u059d\u059e\7\u01ec\2\2\u059e\u059f\5\62\32\2\u059f\u05a0"+
		"\7\u01ec\2\2\u05a0\u05a1\5\62\32\2\u05a1\u05a2\7\u01fd\2\2\u05a2\u05a3"+
		"\b$\1\2\u05a3\u0616\3\2\2\2\u05a4\u05a5\7\u00ce\2\2\u05a5\u05a6\7\u01fa"+
		"\2\2\u05a6\u05a7\5\62\32\2\u05a7\u05a8\7\u01fd\2\2\u05a8\u05a9\b$\1\2"+
		"\u05a9\u0616\3\2\2\2\u05aa\u05ab\7\u00cd\2\2\u05ab\u05ac\7\u01fa\2\2\u05ac"+
		"\u05ad\5\62\32\2\u05ad\u05ae\7\u01fd\2\2\u05ae\u05af\b$\1\2\u05af\u0616"+
		"\3\2\2\2\u05b0\u05b1\7\u00cf\2\2\u05b1\u05b2\7\u01fa\2\2\u05b2\u05b3\5"+
		"\62\32\2\u05b3\u05b4\7\u01ec\2\2\u05b4\u05b5\5\62\32\2\u05b5\u05b6\7\u01fd"+
		"\2\2\u05b6\u05b7\b$\1\2\u05b7\u0616\3\2\2\2\u05b8\u05b9\b$\1\2\u05b9\u05ba"+
		"\7=\2\2\u05ba\u05bb\7\u01fa\2\2\u05bb\u05bc\5\62\32\2\u05bc\u05bd\7\u01ec"+
		"\2\2\u05bd\u05be\5\62\32\2\u05be\u05c3\3\2\2\2\u05bf\u05c0\7\u01ec\2\2"+
		"\u05c0\u05c2\5\62\32\2\u05c1\u05bf\3\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1"+
		"\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c6\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6"+
		"\u05c7\7\u01fd\2\2\u05c7\u05c8\b$\1\2\u05c8\u0616\3\2\2\2\u05c9\u05ca"+
		"\b$\1\2\u05ca\u05cb\7/\2\2\u05cb\u05d1\5\62\32\2\u05cc\u05cd\7\u01bd\2"+
		"\2\u05cd\u05ce\5\62\32\2\u05ce\u05cf\7\u019c\2\2\u05cf\u05d0\5\62\32\2"+
		"\u05d0\u05d2\3\2\2\2\u05d1\u05cc\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d1"+
		"\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\7\u0085\2"+
		"\2\u05d6\u05d7\b$\1\2\u05d7\u0616\3\2\2\2\u05d8\u05d9\b$\1\2\u05d9\u05da"+
		"\7/\2\2\u05da\u05e0\5\62\32\2\u05db\u05dc\7\u01bd\2\2\u05dc\u05dd\5\62"+
		"\32\2\u05dd\u05de\7\u019c\2\2\u05de\u05df\5\62\32\2\u05df\u05e1\3\2\2"+
		"\2\u05e0\u05db\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3"+
		"\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\7\177\2\2\u05e5\u05e6\5\62\32"+
		"\2\u05e6\u05e7\7\u0085\2\2\u05e7\u05e8\b$\1\2\u05e8\u0616\3\2\2\2\u05e9"+
		"\u05ea\b$\1\2\u05ea\u05f0\7/\2\2\u05eb\u05ec\7\u01bd\2\2\u05ec\u05ed\5"+
		"\62\32\2\u05ed\u05ee\7\u019c\2\2\u05ee\u05ef\5\62\32\2\u05ef\u05f1\3\2"+
		"\2\2\u05f0\u05eb\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f2"+
		"\u05f3\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5\7\u0085\2\2\u05f5\u05f6"+
		"\b$\1\2\u05f6\u0616\3\2\2\2\u05f7\u05f8\b$\1\2\u05f8\u05fe\7/\2\2\u05f9"+
		"\u05fa\7\u01bd\2\2\u05fa\u05fb\5\62\32\2\u05fb\u05fc\7\u019c\2\2\u05fc"+
		"\u05fd\5\62\32\2\u05fd\u05ff\3\2\2\2\u05fe\u05f9\3\2\2\2\u05ff\u0600\3"+
		"\2\2\2\u0600\u05fe\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\3\2\2\2\u0602"+
		"\u0603\7\177\2\2\u0603\u0604\5\62\32\2\u0604\u0605\7\u0085\2\2\u0605\u0606"+
		"\b$\1\2\u0606\u0616\3\2\2\2\u0607\u0608\7\u0115\2\2\u0608\u0609\7\u01fa"+
		"\2\2\u0609\u060a\5\62\32\2\u060a\u060b\7\u01ec\2\2\u060b\u060c\5\62\32"+
		"\2\u060c\u060d\7\u01fd\2\2\u060d\u060e\b$\1\2\u060e\u0616\3\2\2\2\u060f"+
		"\u0610\7\34\2\2\u0610\u0611\7\u01fa\2\2\u0611\u0612\5\62\32\2\u0612\u0613"+
		"\7\u01fd\2\2\u0613\u0614\b$\1\2\u0614\u0616\3\2\2\2\u0615\u059a\3\2\2"+
		"\2\u0615\u05a4\3\2\2\2\u0615\u05aa\3\2\2\2\u0615\u05b0\3\2\2\2\u0615\u05b8"+
		"\3\2\2\2\u0615\u05c9\3\2\2\2\u0615\u05d8\3\2\2\2\u0615\u05e9\3\2\2\2\u0615"+
		"\u05f7\3\2\2\2\u0615\u0607\3\2\2\2\u0615\u060f\3\2\2\2\u0616G\3\2\2\2"+
		"\u0617\u0618\7\u01ae\2\2\u0618\u0619\7\u01fa\2\2\u0619\u061a\7\u01fd\2"+
		"\2\u061a\u06c8\b%\1\2\u061b\u061c\7\u01ae\2\2\u061c\u061d\7\u01fa\2\2"+
		"\u061d\u061e\5\62\32\2\u061e\u061f\7\u01fd\2\2\u061f\u0620\b%\1\2\u0620"+
		"\u06c8\3\2\2\2\u0621\u0622\7\u01ae\2\2\u0622\u0623\7\u01fa\2\2\u0623\u0624"+
		"\5\62\32\2\u0624\u0625\7\u01ec\2\2\u0625\u0626\5\62\32\2\u0626\u0627\7"+
		"\u01fd\2\2\u0627\u0628\b%\1\2\u0628\u06c8\3\2\2\2\u0629\u062a\7\u01ce"+
		"\2\2\u062a\u062b\7\u01fa\2\2\u062b\u062c\5\62\32\2\u062c\u062d\7\u01fd"+
		"\2\2\u062d\u062e\b%\1\2\u062e\u06c8\3\2\2\2\u062f\u0630\7\u013a\2\2\u0630"+
		"\u0631\7\u01fa\2\2\u0631\u0632\5\62\32\2\u0632\u0633\7\u01fd\2\2\u0633"+
		"\u0634\b%\1\2\u0634\u06c8\3\2\2\2\u0635\u0636\7\u0103\2\2\u0636\u0637"+
		"\7\u01fa\2\2\u0637\u0638\5\62\32\2\u0638\u0639\7\u01fd\2\2\u0639\u063a"+
		"\b%\1\2\u063a\u06c8\3\2\2\2\u063b\u063c\7e\2\2\u063c\u063d\7\u01fa\2\2"+
		"\u063d\u063e\5\62\32\2\u063e\u063f\7\u01fd\2\2\u063f\u0640\b%\1\2\u0640"+
		"\u06c8\3\2\2\2\u0641\u0642\7\u00b3\2\2\u0642\u0643\7\u01fa\2\2\u0643\u0644"+
		"\5\62\32\2\u0644\u0645\7\u01fd\2\2\u0645\u0646\b%\1\2\u0646\u06c8\3\2"+
		"\2\2\u0647\u0648\7\u0102\2\2\u0648\u0649\7\u01fa\2\2\u0649\u064a\5\62"+
		"\32\2\u064a\u064b\7\u01fd\2\2\u064b\u064c\b%\1\2\u064c\u06c8\3\2\2\2\u064d"+
		"\u064e\7\u0169\2\2\u064e\u064f\7\u01fa\2\2\u064f\u0650\5\62\32\2\u0650"+
		"\u0651\7\u01fd\2\2\u0651\u0652\b%\1\2\u0652\u06c8\3\2\2\2\u0653\u0654"+
		"\7\u01bc\2\2\u0654\u0655\7\u01fa\2\2\u0655\u0656\5\62\32\2\u0656\u0657"+
		"\7\u01fd\2\2\u0657\u0658\b%\1\2\u0658\u06c8\3\2\2\2\u0659\u065a\7a\2\2"+
		"\u065a\u065b\7\u01fa\2\2\u065b\u065c\5\62\32\2\u065c\u065d\7\u01ec\2\2"+
		"\u065d\u065e\5\62\32\2\u065e\u065f\7\u01fd\2\2\u065f\u0660\b%\1\2\u0660"+
		"\u06c8\3\2\2\2\u0661\u0662\7`\2\2\u0662\u0663\7\u01fa\2\2\u0663\u0664"+
		"\5\62\32\2\u0664\u0665\7\u01ec\2\2\u0665\u0666\5\62\32\2\u0666\u0667\7"+
		"\u01fd\2\2\u0667\u0668\b%\1\2\u0668\u06c8\3\2\2\2\u0669\u066a\7c\2\2\u066a"+
		"\u066b\7\u01fa\2\2\u066b\u066c\5\62\32\2\u066c\u066d\7\u01ec\2\2\u066d"+
		"\u066e\5\62\32\2\u066e\u066f\7\u01fd\2\2\u066f\u0670\b%\1\2\u0670\u06c8"+
		"\3\2\2\2\u0671\u0672\7\u01a2\2\2\u0672\u0673\7\u01fa\2\2\u0673\u0674\5"+
		"\62\32\2\u0674\u0675\7\u01ec\2\2\u0675\u0676\5\62\32\2\u0676\u0677\7\u01fd"+
		"\2\2\u0677\u0678\b%\1\2\u0678\u06c8\3\2\2\2\u0679\u067a\7\u00a2\2\2\u067a"+
		"\u067b\7\u01fa\2\2\u067b\u067c\5\62\32\2\u067c\u067d\7\u01ec\2\2\u067d"+
		"\u067e\5\62\32\2\u067e\u067f\7\u01fd\2\2\u067f\u0680\b%\1\2\u0680\u06c8"+
		"\3\2\2\2\u0681\u0684\7\u01d2\2\2\u0682\u0683\7\u01fa\2\2\u0683\u0685\7"+
		"\u01fd\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686\3\2\2\2"+
		"\u0686\u06c8\b%\1\2\u0687\u068a\7\u01d3\2\2\u0688\u0689\7\u01fa\2\2\u0689"+
		"\u068b\7\u01fd\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c"+
		"\3\2\2\2\u068c\u06c8\b%\1\2\u068d\u068e\7\21\2\2\u068e\u068f\7\u01fa\2"+
		"\2\u068f\u0690\5\62\32\2\u0690\u0691\7\u01ec\2\2\u0691\u0692\5\62\32\2"+
		"\u0692\u0693\7\u01fd\2\2\u0693\u0694\b%\1\2\u0694\u06c8\3\2\2\2\u0695"+
		"\u0696\7\21\2\2\u0696\u0697\7\u01fa\2\2\u0697\u0698\5\62\32\2\u0698\u0699"+
		"\7\u01ec\2\2\u0699\u069a\5\62\32\2\u069a\u069b\7\u01ec\2\2\u069b\u069c"+
		"\5\62\32\2\u069c\u069d\7\u01fd\2\2\u069d\u069e\b%\1\2\u069e\u06c8\3\2"+
		"\2\2\u069f\u06a0\7\u00d8\2\2\u06a0\u06a1\7\u01fa\2\2\u06a1\u06a2\5\62"+
		"\32\2\u06a2\u06a3\7\u01fd\2\2\u06a3\u06a4\b%\1\2\u06a4\u06c8\3\2\2\2\u06a5"+
		"\u06a6\7\u0109\2\2\u06a6\u06a7\7\u01fa\2\2\u06a7\u06a8\5\62\32\2\u06a8"+
		"\u06a9\7\u01ec\2\2\u06a9\u06aa\5\62\32\2\u06aa\u06ab\7\u01fd\2\2\u06ab"+
		"\u06ac\b%\1\2\u06ac\u06c8\3\2\2\2\u06ad\u06ae\7\u01a7\2\2\u06ae\u06af"+
		"\7\u01fa\2\2\u06af\u06b0\5\62\32\2\u06b0\u06b1\7\u01ec\2\2\u06b1\u06b2"+
		"\5\62\32\2\u06b2\u06b3\7\u01fd\2\2\u06b3\u06b4\b%\1\2\u06b4\u06c8\3\2"+
		"\2\2\u06b5\u06b6\7\u0104\2\2\u06b6\u06b7\7\u01fa\2\2\u06b7\u06b8\5\62"+
		"\32\2\u06b8\u06b9\7\u01ec\2\2\u06b9\u06ba\5\62\32\2\u06ba\u06bb\7\u01fd"+
		"\2\2\u06bb\u06bc\b%\1\2\u06bc\u06c8\3\2\2\2\u06bd\u06be\7b\2\2\u06be\u06bf"+
		"\7\u01fa\2\2\u06bf\u06c0\5\62\32\2\u06c0\u06c1\7\u01ec\2\2\u06c1\u06c2"+
		"\5\62\32\2\u06c2\u06c3\7\u01fd\2\2\u06c3\u06c4\b%\1\2\u06c4\u06c8\3\2"+
		"\2\2\u06c5\u06c6\7\u01e5\2\2\u06c6\u06c8\b%\1\2\u06c7\u0617\3\2\2\2\u06c7"+
		"\u061b\3\2\2\2\u06c7\u0621\3\2\2\2\u06c7\u0629\3\2\2\2\u06c7\u062f\3\2"+
		"\2\2\u06c7\u0635\3\2\2\2\u06c7\u063b\3\2\2\2\u06c7\u0641\3\2\2\2\u06c7"+
		"\u0647\3\2\2\2\u06c7\u064d\3\2\2\2\u06c7\u0653\3\2\2\2\u06c7\u0659\3\2"+
		"\2\2\u06c7\u0661\3\2\2\2\u06c7\u0669\3\2\2\2\u06c7\u0671\3\2\2\2\u06c7"+
		"\u0679\3\2\2\2\u06c7\u0681\3\2\2\2\u06c7\u0687\3\2\2\2\u06c7\u068d\3\2"+
		"\2\2\u06c7\u0695\3\2\2\2\u06c7\u069f\3\2\2\2\u06c7\u06a5\3\2\2\2\u06c7"+
		"\u06ad\3\2\2\2\u06c7\u06b5\3\2\2\2\u06c7\u06bd\3\2\2\2\u06c7\u06c5\3\2"+
		"\2\2\u06c8I\3\2\2\2\u06c9\u06ca\7\60\2\2\u06ca\u06cb\7\u01fa\2\2\u06cb"+
		"\u06cc\5\62\32\2\u06cc\u06cd\7\30\2\2\u06cd\u06cf\5\6\4\2\u06ce\u06d0"+
		"\5\b\5\2\u06cf\u06ce\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1"+
		"\u06d2\7\u01fd\2\2\u06d2\u06d3\b&\1\2\u06d3\u06db\3\2\2\2\u06d4\u06d5"+
		"\7&\2\2\u06d5\u06d6\7\u01fa\2\2\u06d6\u06d7\5\62\32\2\u06d7\u06d8\7\u01fd"+
		"\2\2\u06d8\u06d9\b&\1\2\u06d9\u06db\3\2\2\2\u06da\u06c9\3\2\2\2\u06da"+
		"\u06d4\3\2\2\2\u06dbK\3\2\2\2\u06dc\u06dd\7P\2\2\u06dd\u06de\7\u01fa\2"+
		"\2\u06de\u06df\5\62\32\2\u06df\u06e0\7\u01fd\2\2\u06e0\u06e1\b\'\1\2\u06e1"+
		"\u0717\3\2\2\2\u06e2\u06e3\b\'\1\2\u06e3\u06e4\7P\2\2\u06e4\u06e5\7\u01fa"+
		"\2\2\u06e5\u06e6\7y\2\2\u06e6\u06eb\5\62\32\2\u06e7\u06e8\7\u01ec\2\2"+
		"\u06e8\u06ea\5\62\32\2\u06e9\u06e7\3\2\2\2\u06ea\u06ed\3\2\2\2\u06eb\u06e9"+
		"\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ee\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ee"+
		"\u06ef\7\u01fd\2\2\u06ef\u06f0\b\'\1\2\u06f0\u0717\3\2\2\2\u06f1\u06f2"+
		"\7P\2\2\u06f2\u06f3\7\u01fa\2\2\u06f3\u06f4\7\u01f8\2\2\u06f4\u06f5\7"+
		"\u01fd\2\2\u06f5\u0717\b\'\1\2\u06f6\u06f7\7\u0193\2\2\u06f7\u06f8\7\u01fa"+
		"\2\2\u06f8\u06f9\5\62\32\2\u06f9\u06fa\7\u01fd\2\2\u06fa\u06fb\b\'\1\2"+
		"\u06fb\u0717\3\2\2\2\u06fc\u06fd\7\u0193\2\2\u06fd\u06fe\7\u01fa\2\2\u06fe"+
		"\u06ff\7y\2\2\u06ff\u0700\5\62\32\2\u0700\u0701\7\u01fd\2\2\u0701\u0702"+
		"\b\'\1\2\u0702\u0717\3\2\2\2\u0703\u0704\7 \2\2\u0704\u0705\7\u01fa\2"+
		"\2\u0705\u0706\5\62\32\2\u0706\u0707\7\u01fd\2\2\u0707\u0708\b\'\1\2\u0708"+
		"\u0717\3\2\2\2\u0709\u070a\7 \2\2\u070a\u070b\7\u01fa\2\2\u070b\u070c"+
		"\7y\2\2\u070c\u070d\5\62\32\2\u070d\u070e\7\u01fd\2\2\u070e\u070f\b\'"+
		"\1\2\u070f\u0717\3\2\2\2\u0710\u0711\t\21\2\2\u0711\u0712\7\u01fa\2\2"+
		"\u0712\u0713\5\62\32\2\u0713\u0714\7\u01fd\2\2\u0714\u0715\b\'\1\2\u0715"+
		"\u0717\3\2\2\2\u0716\u06dc\3\2\2\2\u0716\u06e2\3\2\2\2\u0716\u06f1\3\2"+
		"\2\2\u0716\u06f6\3\2\2\2\u0716\u06fc\3\2\2\2\u0716\u0703\3\2\2\2\u0716"+
		"\u0709\3\2\2\2\u0716\u0710\3\2\2\2\u0717M\3\2\2\2\u0718\u0719\5L\'\2\u0719"+
		"\u071a\b(\1\2\u071a\u0760\3\2\2\2\u071b\u071c\t\22\2\2\u071c\u071d\7\u01fa"+
		"\2\2\u071d\u071e\5\62\32\2\u071e\u071f\7\u01fd\2\2\u071f\u0720\b(\1\2"+
		"\u0720\u0760\3\2\2\2\u0721\u0722\t\23\2\2\u0722\u0723\7\u01fa\2\2\u0723"+
		"\u0724\5\62\32\2\u0724\u0725\7\u01ec\2\2\u0725\u0726\5\62\32\2\u0726\u0727"+
		"\7\u01fd\2\2\u0727\u0728\b(\1\2\u0728\u0760\3\2\2\2\u0729\u072a\7\u012b"+
		"\2\2\u072a\u072b\7\u01fa\2\2\u072b\u072c\5\62\32\2\u072c\u072d\7\u01ec"+
		"\2\2\u072d\u072e\5\62\32\2\u072e\u072f\7\u01fd\2\2\u072f\u0730\b(\1\2"+
		"\u0730\u0760\3\2\2\2\u0731\u0732\7\u012c\2\2\u0732\u0733\7\u01fa\2\2\u0733"+
		"\u0734\5\62\32\2\u0734\u0735\7\u01ec\2\2\u0735\u0736\5\62\32\2\u0736\u0737"+
		"\7\u01fd\2\2\u0737\u0738\b(\1\2\u0738\u0760\3\2\2\2\u0739\u073a\7\u012c"+
		"\2\2\u073a\u073b\7\u01fa\2\2\u073b\u073c\5\62\32\2\u073c\u073d\7\u01ec"+
		"\2\2\u073d\u073e\5\62\32\2\u073e\u073f\7\u01ec\2\2\u073f\u0740\5\62\32"+
		"\2\u0740\u0741\7\u01fd\2\2\u0741\u0742\b(\1\2\u0742\u0760\3\2\2\2\u0743"+
		"\u0744\t\24\2\2\u0744\u0745\7\u01fa\2\2\u0745\u0746\5\62\32\2\u0746\u0747"+
		"\7\u01ec\2\2\u0747\u0748\5\62\32\2\u0748\u0749\7\u01fd\2\2\u0749\u074a"+
		"\b(\1\2\u074a\u0760\3\2\2\2\u074b\u074c\7\u00b0\2\2\u074c\u074d\7\u01fa"+
		"\2\2\u074d\u074e\5\62\32\2\u074e\u074f\7\u01ec\2\2\u074f\u0750\5\62\32"+
		"\2\u0750\u0751\7\u01fd\2\2\u0751\u0752\b(\1\2\u0752\u0760\3\2\2\2\u0753"+
		"\u0754\t\25\2\2\u0754\u0755\7\u01fa\2\2\u0755\u0756\5\62\32\2\u0756\u0757"+
		"\7\u01fd\2\2\u0757\u0758\b(\1\2\u0758\u0760\3\2\2\2\u0759\u075a\7\u0113"+
		"\2\2\u075a\u075b\7\u01fa\2\2\u075b\u075c\5\62\32\2\u075c\u075d\7\u01fd"+
		"\2\2\u075d\u075e\b(\1\2\u075e\u0760\3\2\2\2\u075f\u0718\3\2\2\2\u075f"+
		"\u071b\3\2\2\2\u075f\u0721\3\2\2\2\u075f\u0729\3\2\2\2\u075f\u0731\3\2"+
		"\2\2\u075f\u0739\3\2\2\2\u075f\u0743\3\2\2\2\u075f\u074b\3\2\2\2\u075f"+
		"\u0753\3\2\2\2\u075f\u0759\3\2\2\2\u0760O\3\2\2\2\u0761\u0762\7\u0090"+
		"\2\2\u0762\u0763\7\u01fa\2\2\u0763\u0764\5\62\32\2\u0764\u0765\7\u01fd"+
		"\2\2\u0765\u0766\b)\1\2\u0766\u0774\3\2\2\2\u0767\u0768\7\u0130\2\2\u0768"+
		"\u0769\7\u01fa\2\2\u0769\u076a\5\62\32\2\u076a\u076b\7\u01fd\2\2\u076b"+
		"\u076c\b)\1\2\u076c\u0774\3\2\2\2\u076d\u076e\7\u00be\2\2\u076e\u076f"+
		"\7\u01fa\2\2\u076f\u0770\5\62\32\2\u0770\u0771\7\u01fd\2\2\u0771\u0772"+
		"\b)\1\2\u0772\u0774\3\2\2\2\u0773\u0761\3\2\2\2\u0773\u0767\3\2\2\2\u0773"+
		"\u076d\3\2\2\2\u0774Q\3\2\2\2\u0775\u0776\7\u015d\2\2\u0776\u0777\7\u01fa"+
		"\2\2\u0777\u0778\5\62\32\2\u0778\u0779\7\u01fd\2\2\u0779\u077a\b*\1\2"+
		"\u077a\u0848\3\2\2\2\u077b\u077c\7\u015d\2\2\u077c\u077d\7\u01fa\2\2\u077d"+
		"\u077e\5\62\32\2\u077e\u077f\7\u01ec\2\2\u077f\u0780\5\62\32\2\u0780\u0781"+
		"\7\u01fd\2\2\u0781\u0782\b*\1\2\u0782\u0848\3\2\2\2\u0783\u0784\7\u009b"+
		"\2\2\u0784\u0785\7\u01fa\2\2\u0785\u0786\5\62\32\2\u0786\u0787\7\u01fd"+
		"\2\2\u0787\u0788\b*\1\2\u0788\u0848\3\2\2\2\u0789\u078a\t\26\2\2\u078a"+
		"\u078b\7\u01fa\2\2\u078b\u078c\5\62\32\2\u078c\u078d\7\u01fd\2\2\u078d"+
		"\u078e\b*\1\2\u078e\u0848\3\2\2\2\u078f\u0790\7\u0140\2\2\u0790\u0791"+
		"\7\u01fa\2\2\u0791\u0792\7\u01fd\2\2\u0792\u0848\b*\1\2\u0793\u0794\7"+
		"\u0140\2\2\u0794\u0795\7\u01fa\2\2\u0795\u0796\5\62\32\2\u0796\u0797\7"+
		"\u01fd\2\2\u0797\u0798\b*\1\2\u0798\u0848\3\2\2\2\u0799\u079a\7\u008f"+
		"\2\2\u079a\u079b\7\u01fa\2\2\u079b\u079c\5\62\32\2\u079c\u079d\7\u01fd"+
		"\2\2\u079d\u079e\b*\1\2\u079e\u0848\3\2\2\2\u079f\u07a0\7\u00f0\2\2\u07a0"+
		"\u07a1\7\u01fa\2\2\u07a1\u07a2\5\62\32\2\u07a2\u07a3\7\u01fd\2\2\u07a3"+
		"\u07a4\b*\1\2\u07a4\u0848\3\2\2\2\u07a5\u07a6\7\u00e8\2\2\u07a6\u07a7"+
		"\7\u01fa\2\2\u07a7\u07a8\5\62\32\2\u07a8\u07a9\7\u01fd\2\2\u07a9\u07aa"+
		"\b*\1\2\u07aa\u0848\3\2\2\2\u07ab\u07ac\7\u00e9\2\2\u07ac\u07ad\7\u01fa"+
		"\2\2\u07ad\u07ae\5\62\32\2\u07ae\u07af\7\u01fd\2\2\u07af\u07b0\b*\1\2"+
		"\u07b0\u0848\3\2\2\2\u07b1\u07b2\7\u00e7\2\2\u07b2\u07b3\7\u01fa\2\2\u07b3"+
		"\u07b4\5\62\32\2\u07b4\u07b5\7\u01ec\2\2\u07b5\u07b6\5\62\32\2\u07b6\u07b7"+
		"\7\u01fd\2\2\u07b7\u07b8\b*\1\2\u07b8\u0848\3\2\2\2\u07b9\u07ba\t\27\2"+
		"\2\u07ba\u07bb\7\u01fa\2\2\u07bb\u07bc\5\62\32\2\u07bc\u07bd\7\u01ec\2"+
		"\2\u07bd\u07be\5\62\32\2\u07be\u07bf\7\u01fd\2\2\u07bf\u07c0\b*\1\2\u07c0"+
		"\u0848\3\2\2\2\u07c1\u07c2\7\u0184\2\2\u07c2\u07c3\7\u01fa\2\2\u07c3\u07c4"+
		"\5\62\32\2\u07c4\u07c5\7\u01fd\2\2\u07c5\u07c6\b*\1\2\u07c6\u0848\3\2"+
		"\2\2\u07c7\u07c8\7%\2\2\u07c8\u07c9\7\u01fa\2\2\u07c9\u07ca\5\62\32\2"+
		"\u07ca\u07cb\7\u01fd\2\2\u07cb\u07cc\b*\1\2\u07cc\u0848\3\2\2\2\u07cd"+
		"\u07ce\7\u00af\2\2\u07ce\u07cf\7\u01fa\2\2\u07cf\u07d0\5\62\32\2\u07d0"+
		"\u07d1\7\u01fd\2\2\u07d1\u07d2\b*\1\2\u07d2\u0848\3\2\2\2\u07d3\u07d4"+
		"\7\u01ab\2\2\u07d4\u07d5\7\u01fa\2\2\u07d5\u07d6\5\62\32\2\u07d6\u07d7"+
		"\7\u01fd\2\2\u07d7\u07d8\b*\1\2\u07d8\u0848\3\2\2\2\u07d9\u07da\7L\2\2"+
		"\u07da\u07db\7\u01fa\2\2\u07db\u07dc\5\62\32\2\u07dc\u07dd\7\u01ec\2\2"+
		"\u07dd\u07de\5\62\32\2\u07de\u07df\7\u01ec\2\2\u07df\u07e0\5\62\32\2\u07e0"+
		"\u07e1\7\u01fd\2\2\u07e1\u07e2\b*\1\2\u07e2\u0848\3\2\2\2\u07e3\u07e4"+
		"\7\17\2\2\u07e4\u07e5\7\u01fa\2\2\u07e5\u07e6\5\62\32\2\u07e6\u07e7\7"+
		"\u01fd\2\2\u07e7\u07e8\b*\1\2\u07e8\u0848\3\2\2\2\u07e9\u07ea\7\u012e"+
		"\2\2\u07ea\u07eb\7\u01fa\2\2\u07eb\u07ec\5\62\32\2\u07ec\u07ed\7\u01ec"+
		"\2\2\u07ed\u07ee\5\62\32\2\u07ee\u07ef\7\u01fd\2\2\u07ef\u07f0\b*\1\2"+
		"\u07f0\u0848\3\2\2\2\u07f1\u07f2\7\u0176\2\2\u07f2\u07f3\7\u01fa\2\2\u07f3"+
		"\u07f4\5\62\32\2\u07f4\u07f5\7\u01fd\2\2\u07f5\u07f6\b*\1\2\u07f6\u0848"+
		"\3\2\2\2\u07f7\u07f8\7\33\2\2\u07f8\u07f9\7\u01fa\2\2\u07f9\u07fa\5\62"+
		"\32\2\u07fa\u07fb\7\u01fd\2\2\u07fb\u07fc\b*\1\2\u07fc\u0848\3\2\2\2\u07fd"+
		"\u07fe\7O\2\2\u07fe\u07ff\7\u01fa\2\2\u07ff\u0800\5\62\32\2\u0800\u0801"+
		"\7\u01fd\2\2\u0801\u0802\b*\1\2\u0802\u0848\3\2\2\2\u0803\u0804\7\20\2"+
		"\2\u0804\u0805\7\u01fa\2\2\u0805\u0806\5\62\32\2\u0806\u0807\7\u01fd\2"+
		"\2\u0807\u0808\b*\1\2\u0808\u0848\3\2\2\2\u0809\u080a\7\u0198\2\2\u080a"+
		"\u080b\7\u01fa\2\2\u080b\u080c\5\62\32\2\u080c\u080d\7\u01fd\2\2\u080d"+
		"\u080e\b*\1\2\u080e\u0848\3\2\2\2\u080f\u0810\7\36\2\2\u0810\u0811\7\u01fa"+
		"\2\2\u0811\u0812\5\62\32\2\u0812\u0813\7\u01fd\2\2\u0813\u0814\b*\1\2"+
		"\u0814\u0848\3\2\2\2\u0815\u0816\7p\2\2\u0816\u0817\7\u01fa\2\2\u0817"+
		"\u0818\5\62\32\2\u0818\u0819\7\u01fd\2\2\u0819\u081a\b*\1\2\u081a\u0848"+
		"\3\2\2\2\u081b\u081c\7\u013e\2\2\u081c\u081d\7\u01fa\2\2\u081d\u081e\5"+
		"\62\32\2\u081e\u081f\7\u01fd\2\2\u081f\u0820\b*\1\2\u0820\u0848\3\2\2"+
		"\2\u0821\u0822\7\u012f\2\2\u0822\u0823\7\u01fa\2\2\u0823\u0824\5\62\32"+
		"\2\u0824\u0825\7\u01fd\2\2\u0825\u0826\b*\1\2\u0826\u0848\3\2\2\2\u0827"+
		"\u0828\7\u0108\2\2\u0828\u0829\7\u01fa\2\2\u0829\u082a\5\62\32\2\u082a"+
		"\u082b\7\u01fd\2\2\u082b\u082c\b*\1\2\u082c\u0848\3\2\2\2\u082d\u082e"+
		"\7\u0175\2\2\u082e\u082f\7\u01fa\2\2\u082f\u0830\5\62\32\2\u0830\u0831"+
		"\7\u01fd\2\2\u0831\u0832\b*\1\2\u0832\u0848\3\2\2\2\u0833\u0834\7\n\2"+
		"\2\u0834\u0835\7\u01fa\2\2\u0835\u0836\7\u01fd\2\2\u0836\u0848\b*\1\2"+
		"\u0837\u0838\7\13\2\2\u0838\u0839\7\u01fa\2\2\u0839\u083a\7\u01fd\2\2"+
		"\u083a\u0848\b*\1\2\u083b\u083c\7\u0091\2\2\u083c\u083d\7\u01fa\2\2\u083d"+
		"\u083e\5\62\32\2\u083e\u083f\7\u01fd\2\2\u083f\u0840\b*\1\2\u0840\u0848"+
		"\3\2\2\2\u0841\u0842\7\61\2\2\u0842\u0843\7\u01fa\2\2\u0843\u0844\5\62"+
		"\32\2\u0844\u0845\7\u01fd\2\2\u0845\u0846\b*\1\2\u0846\u0848\3\2\2\2\u0847"+
		"\u0775\3\2\2\2\u0847\u077b\3\2\2\2\u0847\u0783\3\2\2\2\u0847\u0789\3\2"+
		"\2\2\u0847\u078f\3\2\2\2\u0847\u0793\3\2\2\2\u0847\u0799\3\2\2\2\u0847"+
		"\u079f\3\2\2\2\u0847\u07a5\3\2\2\2\u0847\u07ab\3\2\2\2\u0847\u07b1\3\2"+
		"\2\2\u0847\u07b9\3\2\2\2\u0847\u07c1\3\2\2\2\u0847\u07c7\3\2\2\2\u0847"+
		"\u07cd\3\2\2\2\u0847\u07d3\3\2\2\2\u0847\u07d9\3\2\2\2\u0847\u07e3\3\2"+
		"\2\2\u0847\u07e9\3\2\2\2\u0847\u07f1\3\2\2\2\u0847\u07f7\3\2\2\2\u0847"+
		"\u07fd\3\2\2\2\u0847\u0803\3\2\2\2\u0847\u0809\3\2\2\2\u0847\u080f\3\2"+
		"\2\2\u0847\u0815\3\2\2\2\u0847\u081b\3\2\2\2\u0847\u0821\3\2\2\2\u0847"+
		"\u0827\3\2\2\2\u0847\u082d\3\2\2\2\u0847\u0833\3\2\2\2\u0847\u0837\3\2"+
		"\2\2\u0847\u083b\3\2\2\2\u0847\u0841\3\2\2\2\u0848S\3\2\2\2\u0849\u084a"+
		"\7\u0204\2\2\u084a\u085a\b+\1\2\u084b\u084c\7\u0203\2\2\u084c\u085a\b"+
		"+\1\2\u084d\u084e\7\u0202\2\2\u084e\u085a\b+\1\2\u084f\u0850\7\16\2\2"+
		"\u0850\u085a\b+\1\2\u0851\u0852\7\r\2\2\u0852\u085a\b+\1\2\u0853\u0854"+
		"\5Z.\2\u0854\u0855\b+\1\2\u0855\u085a\3\2\2\2\u0856\u0857\5\\/\2\u0857"+
		"\u0858\b+\1\2\u0858\u085a\3\2\2\2\u0859\u0849\3\2\2\2\u0859\u084b\3\2"+
		"\2\2\u0859\u084d\3\2\2\2\u0859\u084f\3\2\2\2\u0859\u0851\3\2\2\2\u0859"+
		"\u0853\3\2\2\2\u0859\u0856\3\2\2\2\u085aU\3\2\2\2\u085b\u085c\7\u0201"+
		"\2\2\u085c\u085e\7\4\2\2\u085d\u085b\3\2\2\2\u085d\u085e\3\2\2\2\u085e"+
		"\u0861\3\2\2\2\u085f\u0860\7\u0201\2\2\u0860\u0862\7\4\2\2\u0861\u085f"+
		"\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0864\7\u0201\2"+
		"\2\u0864\u0865\b,\1\2\u0865W\3\2\2\2\u0866\u0867\7\u0201\2\2\u0867\u0869"+
		"\7\4\2\2\u0868\u0866\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u086a\3\2\2\2\u086a"+
		"\u086b\7\u0201\2\2\u086b\u086c\b-\1\2\u086cY\3\2\2\2\u086d\u086e\7_\2"+
		"\2\u086e\u086f\7\u0204\2\2\u086f\u0870\b.\1\2\u0870[\3\2\2\2\u0871\u0872"+
		"\7\u019d\2\2\u0872\u0873\7\u0204\2\2\u0873\u0874\b/\1\2\u0874]\3\2\2\2"+
		"\u0875\u0876\7\u00cc\2\2\u0876\u087b\b\60\1\2\u0877\u0878\7\u00cc\2\2"+
		"\u0878\u0879\7\u0111\2\2\u0879\u087b\b\60\1\2\u087a\u0875\3\2\2\2\u087a"+
		"\u0877\3\2\2\2\u087b_\3\2\2\2\u087c\u087d\7\u00de\2\2\u087d\u0886\b\61"+
		"\1\2\u087e\u087f\7\u0111\2\2\u087f\u0880\7\u00de\2\2\u0880\u0886\b\61"+
		"\1\2\u0881\u0882\7\u015a\2\2\u0882\u0886\b\61\1\2\u0883\u0884\7\u0144"+
		"\2\2\u0884\u0886\b\61\1\2\u0885\u087c\3\2\2\2\u0885\u087e\3\2\2\2\u0885"+
		"\u0881\3\2\2\2\u0885\u0883\3\2\2\2\u0886a\3\2\2\2\u0887\u0888\7\u00b8"+
		"\2\2\u0888\u088d\b\62\1\2\u0889\u088a\7\u0111\2\2\u088a\u088b\7\u00b8"+
		"\2\2\u088b\u088d\b\62\1\2\u088c\u0887\3\2\2\2\u088c\u0889\3\2\2\2\u088d"+
		"c\3\2\2\2\u088e\u088f\7\u008d\2\2\u088f\u0894\b\63\1\2\u0890\u0891\7\u0111"+
		"\2\2\u0891\u0892\7\u008d\2\2\u0892\u0894\b\63\1\2\u0893\u088e\3\2\2\2"+
		"\u0893\u0890\3\2\2\2\u0894e\3\2\2\2\u0895\u0896\t\30\2\2\u0896g\3\2\2"+
		"\2Sr\u0088\u00c1\u00c5\u00ca\u00ce\u00ee\u00f5\u0100\u0105\u010c\u011a"+
		"\u011f\u0126\u0131\u013c\u0145\u0149\u014c\u0153\u015c\u016e\u0179\u0182"+
		"\u0187\u018e\u0196\u019d\u01a7\u01b8\u01c5\u01d6\u01e7\u01f1\u01f7\u01ff"+
		"\u020d\u023e\u0294\u0296\u02c1\u02cb\u02de\u02ec\u02ff\u0325\u0334\u034b"+
		"\u0363\u03e1\u0506\u0512\u0522\u0530\u056c\u0574\u0598\u05c3\u05d3\u05e2"+
		"\u05f2\u0600\u0615\u0684\u068a\u06c7\u06cf\u06da\u06eb\u0716\u075f\u0773"+
		"\u0847\u0859\u085d\u0861\u0868\u087a\u0885\u088c\u0893";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}