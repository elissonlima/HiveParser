// Generated from c:\Users\elisson.lima\source\repos\HiveParser\HiveParser\grammar\Hive.g4 by ANTLR 4.7.1

    #include <string>
    #include <vector>
    #include <map>
    #include <cstdio>
    #include <iterator>
    #include "nlohmann/json.hpp"
    #include "hql_types.h"
    #include "hql_exprs.h"
    #include "hql_stmts.h"
    #include "hql_functions.h"
    #include "utils.h"

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
		T__9=10, T__10=11, NULL_CONST=12, BOOL_LITERAL=13, T_ABS=14, T_ACOS=15, 
		T_ADD_MONTHS=16, T_AES_ENCRYPT=17, T_AES_DECRYPT=18, T_ALL=19, T_ALTER=20, 
		T_AND=21, T_ARRAY=22, T_AS=23, T_ASC=24, T_ASCII=25, T_ASIN=26, T_ASSERT_TRUE=27, 
		T_AT=28, T_ATAN=29, T_AUTO_INCREMENT=30, T_AVG=31, T_AVRO=32, T_BASE64=33, 
		T_BEGIN=34, T_BETWEEN=35, T_BIGINT=36, T_BIN=37, T_BINARY=38, T_BIT=39, 
		T_BODY=40, T_BOOLEAN=41, T_BREAK=42, T_BUCKETS=43, T_BY=44, T_BYTE=45, 
		T_CALL=46, T_CALLER=47, T_CASCADE=48, T_CASE=49, T_CAST=50, T_CBR=51, 
		T_CEIL=52, T_CEILING=53, T_CHAR=54, T_CHARACTER=55, T_CHARACTER_LENGTH=56, 
		T_CHARSET=57, T_CHECK=58, T_CHR=59, T_CLIENT=60, T_CLOSE=61, T_CLUSTERED=62, 
		T_CMP=63, T_COALESCE=64, T_COLLECT=65, T_COLLECT_SET=66, T_COLLECT_LIST=67, 
		T_COLLECTION=68, T_COLUMN=69, T_COMMENT=70, T_CONSTANT=71, T_COMMIT=72, 
		T_COMPRESS=73, T_CONCAT=74, T_CONCAT_WS=75, T_CONDITION=76, T_CONSTRAINT=77, 
		T_CONTINUE=78, T_CONV=79, T_COPY=80, T_CORR=81, T_COS=82, T_COUNT=83, 
		T_COUNT_BIG=84, T_COVAR_POP=85, T_COVAR_SAMP=86, T_CRC32=87, T_CREATE=88, 
		T_CREATION=89, T_CREATOR=90, T_CROSS=91, T_CS=92, T_CURRENT=93, T_CURRENT_SCHEMA=94, 
		T_CURRENT_DATABASE=95, T_CURSOR=96, T_DATABASE=97, T_DATE=98, T_DATEADD=99, 
		T_DATEDIFF=100, T_DATE_FORMAT=101, T_DATESUB=102, T_DATETIME=103, T_DAY=104, 
		T_DAYS=105, T_DEC=106, T_DECIMAL=107, T_DECODE=108, T_DECLARE=109, T_DEFAULT=110, 
		T_DEFERRED=111, T_DEFINED=112, T_DEFINER=113, T_DEFINITION=114, T_DEGREES=115, 
		T_DELETE=116, T_DELIMITED=117, T_DELIMITER=118, T_DESC=119, T_DESCRIBE=120, 
		T_DIAGNOSTICS=121, T_DIR=122, T_DIRECTORY=123, T_DISABLE=124, T_DISTINCT=125, 
		T_DISTRIBUTE=126, T_DO=127, T_DOUBLE=128, T_DROP=129, T_DYNAMIC=130, T_ELSE=131, 
		T_ELSEIF=132, T_ELSIF=133, T_ELT=134, T_ENABLE=135, T_ENCODE=136, T_END=137, 
		T_ENGINE=138, T_ESCAPED=139, T_EXCEPT=140, T_EXEC=141, T_EXECUTE=142, 
		T_EXCEPTION=143, T_EXCLUSIVE=144, T_EXISTS=145, T_EXIT=146, T_EXP=147, 
		T_EXPLODE=148, T_EXTERNAL=149, T_FACTORIAL=150, T_FALLBACK=151, T_FALSE=152, 
		T_FETCH=153, T_FIELD=154, T_FIELDS=155, T_FIELD_IN_SET=156, T_FILE=157, 
		T_FILES=158, T_FLOAT=159, T_FLOOR=160, T_FOR=161, T_FOREIGN=162, T_FORMAT=163, 
		T_FORMAT_NUMBER=164, T_FOUND=165, T_FROM=166, T_FROMUTCTIMESTAMP=167, 
		T_FULL=168, T_FUNCTION=169, T_GET=170, T_GET_JSON_OBJECTS=171, T_GLOBAL=172, 
		T_GO=173, T_GRANT=174, T_GROUP=175, T_HANDLER=176, T_HASH=177, T_HAVING=178, 
		T_HDFS=179, T_HEX=180, T_HISTOGRAM_NUMERIC=181, T_HIVE=182, T_HIVECONF=183, 
		T_HIVEVAR=184, T_HOST=185, T_HOUR=186, T_IDENTITY=187, T_IF=188, T_IGNORE=189, 
		T_IMMEDIATE=190, T_IN=191, T_INCLUDE=192, T_INDEX=193, T_IN_FILE=194, 
		T_INITCAP=195, T_INITRANS=196, T_INLINE=197, T_INNER=198, T_INOUT=199, 
		T_INPUTFORMAT=200, T_INSERT=201, T_IN_STR=202, T_INT=203, T_INT2=204, 
		T_INT4=205, T_INT8=206, T_INTEGER=207, T_INTERSECT=208, T_INTERVAL=209, 
		T_INTO=210, T_INVOKER=211, T_IS=212, T_ISNOTNULL=213, T_ISNULL=214, T_NVL=215, 
		T_ISOPEN=216, T_ITEMS=217, T_JAVA_METHOD=218, T_JOIN=219, T_JSONFILE=220, 
		T_KEEP=221, T_KEY=222, T_KEYS=223, T_LANGUAGE=224, T_LASTDAY=225, T_LATERAL=226, 
		T_LCASE=227, T_LEAVE=228, T_LEFT=229, T_LENGTH=230, T_LEVENSHTEIN=231, 
		T_LIKE=232, T_LIMIT=233, T_LINES=234, T_LOCAL=235, T_LOCATE=236, T_LOCATION=237, 
		T_LOCATOR=238, T_LOCATORS=239, T_LOCKS=240, T_LOG=241, T_LOG10=242, T_LOG2=243, 
		T_LOGGED=244, T_LOGGED_IN_USER=245, T_LOGGING=246, T_LOOP=247, T_LOWER=248, 
		T_LPAD=249, T_LN=250, T_LTRIM=251, T_MAP=252, T_MASK=253, T_MASK_FIRST_N=254, 
		T_MASK_HASH=255, T_MASK_LAST_N=256, T_MASK_SHOW_FIRST_N=257, T_MASK_SHOW_LAST_N=258, 
		T_MATCHED=259, T_MAX=260, T_MAXTRANS=261, T_MD5=262, T_MERGE=263, T_MESSAGE_TEXT=264, 
		T_MICROSECOND=265, T_MICROSECONDS=266, T_MIN=267, T_MINUTE=268, T_MONTH=269, 
		T_MONTHS_BETWEEN=270, T_MULTISET=271, T_NAMED_STRUCT=272, T_NCHAR=273, 
		T_NEGATIVE=274, T_NEXT_DAY=275, T_NEW=276, T_NVARCHAR=277, T_NO=278, T_NOCOUNT=279, 
		T_NOCOMPRESS=280, T_NOLOGGING=281, T_NONE=282, T_NORELY=283, T_NOT=284, 
		T_NOTFOUND=285, T_NOVALIDATE=286, T_NTILE=287, T_NULL=288, T_NULLIF=289, 
		T_NUMERIC=290, T_NUMBER=291, T_OBJECT=292, T_OCTET_LENGTH=293, T_OFF=294, 
		T_ON=295, T_ONLY=296, T_OPEN=297, T_OR=298, T_ORC=299, T_ORDER=300, T_OUT=301, 
		T_OUTER=302, T_OUTPUTFORMAT=303, T_OVER=304, T_OVERWRITE=305, T_OWNER=306, 
		T_PACKAGE=307, T_PARQUET=308, T_PARSE_URL=309, T_PARTITION=310, T_PARTITIONED=311, 
		T_PCTFREE=312, T_PCTUSED=313, T_PERCENT_RANK=314, T_PERCENTILE=315, T_PERCENTILE_APPROX=316, 
		T_PLS_INTEGER=317, T_PMOD=318, T_POSITIVE=319, T_POSEXPLODE=320, T_POW=321, 
		T_POWER=322, T_PRECISION=323, T_PRESERVE=324, T_PRIMARY=325, T_PRINTF=326, 
		T_PROC=327, T_PROCEDURE=328, T_PURGE=329, T_QUALIFY=330, T_QUARTER=331, 
		T_QUERY_BAND=332, T_QUIT=333, T_QUOTE=334, T_RADIANS=335, T_RAISE=336, 
		T_RAND=337, T_RCFILE=338, T_REAL=339, T_REFERENCES=340, T_REFLECT=341, 
		T_REGEXP=342, T_REGEXP_EXTRACT=343, T_REGEXP_REPLACE=344, T_REGR_AVGX=345, 
		T_REGR_AVGY=346, T_REGR_COUNT=347, T_REGR_INTERCEPT=348, T_REGR_R2=349, 
		T_REGR_SLOPE=350, T_REGR_SXX=351, T_REGR_SXY=352, T_REGR_SYY=353, T_RELY=354, 
		T_REPEAT=355, T_REPLACE=356, T_RESIGNAL=357, T_RESTRICT=358, T_RESULT=359, 
		T_RESULT_SET_LOCATOR=360, T_RETURN=361, T_RETURNS=362, T_REVERSE=363, 
		T_RIGHT=364, T_RLIKE=365, T_ROLE=366, T_ROLLBACK=367, T_ROUND=368, T_ROW=369, 
		T_ROWS=370, T_ROWTYPE=371, T_ROW_COUNT=372, T_RPAD=373, T_RR=374, T_RS=375, 
		T_RTRIM=376, T_PWD=377, T_TRIM=378, T_SCHEMA=379, T_SECOND=380, T_SECONDS=381, 
		T_SECURITY=382, T_SERDE=383, T_SERDEPROPERTIES=384, T_SEGMENT=385, T_SEL=386, 
		T_SELECT=387, T_SEQUENCEFILE=388, T_SENTENCES=389, T_SET=390, T_SETS=391, 
		T_SHA=392, T_SHA1=393, T_SHA2=394, T_SIGN=395, T_SIN=396, T_SIMPLE_DOUBLE=397, 
		T_SIMPLE_FLOAT=398, T_SIMPLE_INTEGER=399, T_SKEWED=400, T_SMALLDATETIME=401, 
		T_SMALLINT=402, T_SOUNDEX=403, T_SPACE=404, T_SPLIT=405, T_SQL=406, T_SQLEXCEPTION=407, 
		T_SQLINSERT=408, T_SQLSTATE=409, T_SQLWARNING=410, T_SQRT=411, T_STATS=412, 
		T_STATISTICS=413, T_STDDEV_POP=414, T_STDDEV_SAMP=415, T_STEP=416, T_STORAGE=417, 
		T_STORED=418, T_STRING=419, T_STR_TO_MAP=420, T_STRUCT=421, T_SUBDIR=422, 
		T_SUBSTR=423, T_SUBSTRING=424, T_SUBSTRING_INDEX=425, T_SUM=426, T_SUMMARY=427, 
		T_SYS_REFCURSOR=428, T_TABLE=429, T_TABLESPACE=430, T_TAN=431, T_TBLPROPERTIES=432, 
		T_TEMPORARY=433, T_TERMINATED=434, T_TEXTFILE=435, T_TEXTIMAGE_ON=436, 
		T_THEN=437, T_TIMESTAMP=438, T_TINYINT=439, T_TITLE=440, T_TO=441, T_TOP=442, 
		T_TOUTCTIMESTAMP=443, T_TRANSACTION=444, T_TRANSLATE=445, T_TRUE=446, 
		T_TRUNCATE=447, T_TRUNC=448, T_TYPE=449, T_UCASE=450, T_UNBASE64=451, 
		T_UNHEX=452, T_UNION=453, T_UNIONTYPE=454, T_UNIQUE=455, T_UNIX_TIMESTAMP=456, 
		T_UPDATE=457, T_UPPER=458, T_UR=459, T_USE=460, T_USING=461, T_VALUE=462, 
		T_VALUES=463, T_VAR=464, T_VARCHAR=465, T_VARCHAR2=466, T_VARYING=467, 
		T_VERSION=468, T_VIEW=469, T_VOLATILE=470, T_WEEKOFYEAR=471, T_WHEN=472, 
		T_WHERE=473, T_WHILE=474, T_WITH=475, T_WITHOUT=476, T_WORK=477, T_XACT_ABORT=478, 
		T_XML=479, T_XPATH=480, T_XPATH_BOOLEAN=481, T_XPATH_DOUBLE=482, T_XPATH_FLOAT=483, 
		T_XPATH_INT=484, T_XPATH_LONG=485, T_XPATH_NUMBER=486, T_XPATH_SHORT=487, 
		T_XPATH_STRING=488, T_YEAR=489, T_YES=490, T_ACTIVITY_COUNT=491, T_CUME_DIST=492, 
		T_CURRENT_DATE=493, T_CURRENT_TIMESTAMP=494, T_CURRENT_USER=495, T_DENSE_RANK=496, 
		T_FIRST_VALUE=497, T_LAG=498, T_LAST_VALUE=499, T_LEAD=500, T_MAX_PART_STRING=501, 
		T_MIN_PART_STRING=502, T_MAX_PART_INT=503, T_MIN_PART_INT=504, T_MAX_PART_DATE=505, 
		T_MIN_PART_DATE=506, T_PART_COUNT=507, T_PART_LOC=508, T_RANK=509, T_ROW_NUMBER=510, 
		T_STDEV=511, T_SYSDATE=512, T_VARIANCE=513, T_VAR_POP=514, T_VAR_SAMP=515, 
		T_USER=516, T_ADD=517, T_COLON=518, T_COMMA=519, T_PIPE=520, T_DIV=521, 
		T_DOT2=522, T_EQUAL=523, T_EQUAL2=524, T_NOTEQUAL=525, T_NOTEQUAL2=526, 
		T_GREATER=527, T_GREATEREQUAL=528, T_LESS=529, T_LESSEQUAL=530, T_MUL=531, 
		T_OPEN_B=532, T_OPEN_P=533, T_OPEN_SB=534, T_CLOSE_B=535, T_CLOSE_P=536, 
		T_CLOSE_SB=537, T_SEMICOLON=538, T_SUB=539, IDENTIFIER=540, INT_LITERAL=541, 
		DECIMAL_LITERAL=542, STRING_LITERAL=543, L_INT=544, L_DEC=545, L_M_COMMENT=546, 
		L_S_COMMENT=547, SPACES=548, UNEXPECTED_CHAR=549;
	public static final int
		RULE_program = 0, RULE_stmt_list = 1, RULE_data_type = 2, RULE_primitive_type = 3, 
		RULE_complex_type = 4, RULE_dtype_len = 5, RULE_stmt = 6, RULE_ddl_stmt = 7, 
		RULE_variable_substitution = 8, RULE_use_var = 9, RULE_system_var_identifier = 10, 
		RULE_opt_var_set_type = 11, RULE_opt_var_use_type = 12, RULE_var_name = 13, 
		RULE_droptable_stmt = 14, RULE_opt_drop_table_purge = 15, RULE_create_table_stmt = 16, 
		RULE_opt_column_specs = 17, RULE_opt_constraint_specification = 18, RULE_opt_comment = 19, 
		RULE_table_options = 20, RULE_opt_partitioned_table = 21, RULE_partition_spec = 22, 
		RULE_opt_clustered_by_table = 23, RULE_opt_sorted_by_table = 24, RULE_opt_sorted_by_asc_desc = 25, 
		RULE_opt_skewed_by_table = 26, RULE_opt_on_skewed = 27, RULE_opt_skewed_stored_as_directory = 28, 
		RULE_opt_row_formated = 29, RULE_row_format = 30, RULE_opt_field_terminated_by = 31, 
		RULE_opt_collection_items_terminated_by = 32, RULE_opt_map_keys_terminated_by = 33, 
		RULE_opt_lines_terminated_by = 34, RULE_opt_null_defined_as = 35, RULE_opt_serde_properties = 36, 
		RULE_serde_val = 37, RULE_opt_stored_as = 38, RULE_opt_location = 39, 
		RULE_opt_table_properties = 40, RULE_opt_table_val = 41, RULE_opt_as_select = 42, 
		RULE_file_format = 43, RULE_column_definition = 44, RULE_column_constraint = 45, 
		RULE_default_value = 46, RULE_constraint_specification = 47, RULE_opt_constraint_enable_disable = 48, 
		RULE_opt_constraint_enable = 49, RULE_opt_constraint_disable = 50, RULE_opt_constraint_novalidate = 51, 
		RULE_opt_constraint_rely_no_rely = 52, RULE_opt_if_not_exists_flag = 53, 
		RULE_opt_if_exists = 54, RULE_table_type = 55, RULE_query_stmt = 56, RULE_select_union_stmt = 57, 
		RULE_select_union_type = 58, RULE_select_stmt = 59, RULE_opt_lateral_view_expr = 60, 
		RULE_column_identifier = 61, RULE_opt_where_expr = 62, RULE_opt_group_by_list = 63, 
		RULE_opt_having_expr = 64, RULE_opt_order_by_list = 65, RULE_opt_order_by_mode = 66, 
		RULE_opt_limit = 67, RULE_table_reference = 68, RULE_join_table = 69, 
		RULE_join_condition = 70, RULE_table_factor = 71, RULE_select_all_distinct = 72, 
		RULE_select_expr_list = 73, RULE_select_expr = 74, RULE_over_clause = 75, 
		RULE_over_func = 76, RULE_analytic_func = 77, RULE_expr_list = 78, RULE_expr = 79, 
		RULE_complex_types = 80, RULE_array_def = 81, RULE_map_def = 82, RULE_struct_def = 83, 
		RULE_named_struct_def = 84, RULE_str_func = 85, RULE_misc_func = 86, RULE_expr_concat = 87, 
		RULE_expr_concat_item = 88, RULE_cond_func = 89, RULE_date_func = 90, 
		RULE_dat_convrt_func = 91, RULE_basic_aggr_func = 92, RULE_aggr_func = 93, 
		RULE_tab_generate_func = 94, RULE_math_func = 95, RULE_literal_values = 96, 
		RULE_ident = 97, RULE_tab_ident = 98, RULE_complex_name = 99, RULE_complex_atom_name = 100, 
		RULE_date_literal = 101, RULE_timestamp_literal = 102, RULE_set_operators_is = 103, 
		RULE_set_operators_like = 104, RULE_set_operators_in = 105, RULE_set_operators_exists = 106, 
		RULE_unary_operator = 107;
	public static final String[] ruleNames = {
		"program", "stmt_list", "data_type", "primitive_type", "complex_type", 
		"dtype_len", "stmt", "ddl_stmt", "variable_substitution", "use_var", "system_var_identifier", 
		"opt_var_set_type", "opt_var_use_type", "var_name", "droptable_stmt", 
		"opt_drop_table_purge", "create_table_stmt", "opt_column_specs", "opt_constraint_specification", 
		"opt_comment", "table_options", "opt_partitioned_table", "partition_spec", 
		"opt_clustered_by_table", "opt_sorted_by_table", "opt_sorted_by_asc_desc", 
		"opt_skewed_by_table", "opt_on_skewed", "opt_skewed_stored_as_directory", 
		"opt_row_formated", "row_format", "opt_field_terminated_by", "opt_collection_items_terminated_by", 
		"opt_map_keys_terminated_by", "opt_lines_terminated_by", "opt_null_defined_as", 
		"opt_serde_properties", "serde_val", "opt_stored_as", "opt_location", 
		"opt_table_properties", "opt_table_val", "opt_as_select", "file_format", 
		"column_definition", "column_constraint", "default_value", "constraint_specification", 
		"opt_constraint_enable_disable", "opt_constraint_enable", "opt_constraint_disable", 
		"opt_constraint_novalidate", "opt_constraint_rely_no_rely", "opt_if_not_exists_flag", 
		"opt_if_exists", "table_type", "query_stmt", "select_union_stmt", "select_union_type", 
		"select_stmt", "opt_lateral_view_expr", "column_identifier", "opt_where_expr", 
		"opt_group_by_list", "opt_having_expr", "opt_order_by_list", "opt_order_by_mode", 
		"opt_limit", "table_reference", "join_table", "join_condition", "table_factor", 
		"select_all_distinct", "select_expr_list", "select_expr", "over_clause", 
		"over_func", "analytic_func", "expr_list", "expr", "complex_types", "array_def", 
		"map_def", "struct_def", "named_struct_def", "str_func", "misc_func", 
		"expr_concat", "expr_concat_item", "cond_func", "date_func", "dat_convrt_func", 
		"basic_aggr_func", "aggr_func", "tab_generate_func", "math_func", "literal_values", 
		"ident", "tab_ident", "complex_name", "complex_atom_name", "date_literal", 
		"timestamp_literal", "set_operators_is", "set_operators_like", "set_operators_in", 
		"set_operators_exists", "unary_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'.'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<=>'", "'E'", 
		"'PI'", "'!'", null, null, null, null, null, null, null, null, null, null, 
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'+'", "':'", "','", "'||'", "'/'", "'..'", "'='", "'=='", 
		"'<>'", "'!='", "'>'", "'>='", "'<'", "'<='", "'*'", "'{'", "'('", "'['", 
		"'}'", "')'", "']'", "';'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"NULL_CONST", "BOOL_LITERAL", "T_ABS", "T_ACOS", "T_ADD_MONTHS", "T_AES_ENCRYPT", 
		"T_AES_DECRYPT", "T_ALL", "T_ALTER", "T_AND", "T_ARRAY", "T_AS", "T_ASC", 
		"T_ASCII", "T_ASIN", "T_ASSERT_TRUE", "T_AT", "T_ATAN", "T_AUTO_INCREMENT", 
		"T_AVG", "T_AVRO", "T_BASE64", "T_BEGIN", "T_BETWEEN", "T_BIGINT", "T_BIN", 
		"T_BINARY", "T_BIT", "T_BODY", "T_BOOLEAN", "T_BREAK", "T_BUCKETS", "T_BY", 
		"T_BYTE", "T_CALL", "T_CALLER", "T_CASCADE", "T_CASE", "T_CAST", "T_CBR", 
		"T_CEIL", "T_CEILING", "T_CHAR", "T_CHARACTER", "T_CHARACTER_LENGTH", 
		"T_CHARSET", "T_CHECK", "T_CHR", "T_CLIENT", "T_CLOSE", "T_CLUSTERED", 
		"T_CMP", "T_COALESCE", "T_COLLECT", "T_COLLECT_SET", "T_COLLECT_LIST", 
		"T_COLLECTION", "T_COLUMN", "T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", 
		"T_CONCAT", "T_CONCAT_WS", "T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", 
		"T_CONV", "T_COPY", "T_CORR", "T_COS", "T_COUNT", "T_COUNT_BIG", "T_COVAR_POP", 
		"T_COVAR_SAMP", "T_CRC32", "T_CREATE", "T_CREATION", "T_CREATOR", "T_CROSS", 
		"T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", "T_CURRENT_DATABASE", "T_CURSOR", 
		"T_DATABASE", "T_DATE", "T_DATEADD", "T_DATEDIFF", "T_DATE_FORMAT", "T_DATESUB", 
		"T_DATETIME", "T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECODE", "T_DECLARE", 
		"T_DEFAULT", "T_DEFERRED", "T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DEGREES", 
		"T_DELETE", "T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", 
		"T_DIR", "T_DIRECTORY", "T_DISABLE", "T_DISTINCT", "T_DISTRIBUTE", "T_DO", 
		"T_DOUBLE", "T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ELT", 
		"T_ENABLE", "T_ENCODE", "T_END", "T_ENGINE", "T_ESCAPED", "T_EXCEPT", 
		"T_EXEC", "T_EXECUTE", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", "T_EXIT", 
		"T_EXP", "T_EXPLODE", "T_EXTERNAL", "T_FACTORIAL", "T_FALLBACK", "T_FALSE", 
		"T_FETCH", "T_FIELD", "T_FIELDS", "T_FIELD_IN_SET", "T_FILE", "T_FILES", 
		"T_FLOAT", "T_FLOOR", "T_FOR", "T_FOREIGN", "T_FORMAT", "T_FORMAT_NUMBER", 
		"T_FOUND", "T_FROM", "T_FROMUTCTIMESTAMP", "T_FULL", "T_FUNCTION", "T_GET", 
		"T_GET_JSON_OBJECTS", "T_GLOBAL", "T_GO", "T_GRANT", "T_GROUP", "T_HANDLER", 
		"T_HASH", "T_HAVING", "T_HDFS", "T_HEX", "T_HISTOGRAM_NUMERIC", "T_HIVE", 
		"T_HIVECONF", "T_HIVEVAR", "T_HOST", "T_HOUR", "T_IDENTITY", "T_IF", "T_IGNORE", 
		"T_IMMEDIATE", "T_IN", "T_INCLUDE", "T_INDEX", "T_IN_FILE", "T_INITCAP", 
		"T_INITRANS", "T_INLINE", "T_INNER", "T_INOUT", "T_INPUTFORMAT", "T_INSERT", 
		"T_IN_STR", "T_INT", "T_INT2", "T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", 
		"T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", "T_ISNOTNULL", "T_ISNULL", 
		"T_NVL", "T_ISOPEN", "T_ITEMS", "T_JAVA_METHOD", "T_JOIN", "T_JSONFILE", 
		"T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", "T_LASTDAY", "T_LATERAL", "T_LCASE", 
		"T_LEAVE", "T_LEFT", "T_LENGTH", "T_LEVENSHTEIN", "T_LIKE", "T_LIMIT", 
		"T_LINES", "T_LOCAL", "T_LOCATE", "T_LOCATION", "T_LOCATOR", "T_LOCATORS", 
		"T_LOCKS", "T_LOG", "T_LOG10", "T_LOG2", "T_LOGGED", "T_LOGGED_IN_USER", 
		"T_LOGGING", "T_LOOP", "T_LOWER", "T_LPAD", "T_LN", "T_LTRIM", "T_MAP", 
		"T_MASK", "T_MASK_FIRST_N", "T_MASK_HASH", "T_MASK_LAST_N", "T_MASK_SHOW_FIRST_N", 
		"T_MASK_SHOW_LAST_N", "T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MD5", "T_MERGE", 
		"T_MESSAGE_TEXT", "T_MICROSECOND", "T_MICROSECONDS", "T_MIN", "T_MINUTE", 
		"T_MONTH", "T_MONTHS_BETWEEN", "T_MULTISET", "T_NAMED_STRUCT", "T_NCHAR", 
		"T_NEGATIVE", "T_NEXT_DAY", "T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", 
		"T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", "T_NORELY", "T_NOT", "T_NOTFOUND", 
		"T_NOVALIDATE", "T_NTILE", "T_NULL", "T_NULLIF", "T_NUMERIC", "T_NUMBER", 
		"T_OBJECT", "T_OCTET_LENGTH", "T_OFF", "T_ON", "T_ONLY", "T_OPEN", "T_OR", 
		"T_ORC", "T_ORDER", "T_OUT", "T_OUTER", "T_OUTPUTFORMAT", "T_OVER", "T_OVERWRITE", 
		"T_OWNER", "T_PACKAGE", "T_PARQUET", "T_PARSE_URL", "T_PARTITION", "T_PARTITIONED", 
		"T_PCTFREE", "T_PCTUSED", "T_PERCENT_RANK", "T_PERCENTILE", "T_PERCENTILE_APPROX", 
		"T_PLS_INTEGER", "T_PMOD", "T_POSITIVE", "T_POSEXPLODE", "T_POW", "T_POWER", 
		"T_PRECISION", "T_PRESERVE", "T_PRIMARY", "T_PRINTF", "T_PROC", "T_PROCEDURE", 
		"T_PURGE", "T_QUALIFY", "T_QUARTER", "T_QUERY_BAND", "T_QUIT", "T_QUOTE", 
		"T_RADIANS", "T_RAISE", "T_RAND", "T_RCFILE", "T_REAL", "T_REFERENCES", 
		"T_REFLECT", "T_REGEXP", "T_REGEXP_EXTRACT", "T_REGEXP_REPLACE", "T_REGR_AVGX", 
		"T_REGR_AVGY", "T_REGR_COUNT", "T_REGR_INTERCEPT", "T_REGR_R2", "T_REGR_SLOPE", 
		"T_REGR_SXX", "T_REGR_SXY", "T_REGR_SYY", "T_RELY", "T_REPEAT", "T_REPLACE", 
		"T_RESIGNAL", "T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", 
		"T_RETURNS", "T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", "T_ROLLBACK", 
		"T_ROUND", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RPAD", "T_RR", 
		"T_RS", "T_RTRIM", "T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", 
		"T_SECURITY", "T_SERDE", "T_SERDEPROPERTIES", "T_SEGMENT", "T_SEL", "T_SELECT", 
		"T_SEQUENCEFILE", "T_SENTENCES", "T_SET", "T_SETS", "T_SHA", "T_SHA1", 
		"T_SHA2", "T_SIGN", "T_SIN", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", "T_SIMPLE_INTEGER", 
		"T_SKEWED", "T_SMALLDATETIME", "T_SMALLINT", "T_SOUNDEX", "T_SPACE", "T_SPLIT", 
		"T_SQL", "T_SQLEXCEPTION", "T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", 
		"T_SQRT", "T_STATS", "T_STATISTICS", "T_STDDEV_POP", "T_STDDEV_SAMP", 
		"T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_STR_TO_MAP", "T_STRUCT", 
		"T_SUBDIR", "T_SUBSTR", "T_SUBSTRING", "T_SUBSTRING_INDEX", "T_SUM", "T_SUMMARY", 
		"T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TAN", "T_TBLPROPERTIES", 
		"T_TEMPORARY", "T_TERMINATED", "T_TEXTFILE", "T_TEXTIMAGE_ON", "T_THEN", 
		"T_TIMESTAMP", "T_TINYINT", "T_TITLE", "T_TO", "T_TOP", "T_TOUTCTIMESTAMP", 
		"T_TRANSACTION", "T_TRANSLATE", "T_TRUE", "T_TRUNCATE", "T_TRUNC", "T_TYPE", 
		"T_UCASE", "T_UNBASE64", "T_UNHEX", "T_UNION", "T_UNIONTYPE", "T_UNIQUE", 
		"T_UNIX_TIMESTAMP", "T_UPDATE", "T_UPPER", "T_UR", "T_USE", "T_USING", 
		"T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", 
		"T_VERSION", "T_VIEW", "T_VOLATILE", "T_WEEKOFYEAR", "T_WHEN", "T_WHERE", 
		"T_WHILE", "T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", "T_XML", "T_XPATH", 
		"T_XPATH_BOOLEAN", "T_XPATH_DOUBLE", "T_XPATH_FLOAT", "T_XPATH_INT", "T_XPATH_LONG", 
		"T_XPATH_NUMBER", "T_XPATH_SHORT", "T_XPATH_STRING", "T_YEAR", "T_YES", 
		"T_ACTIVITY_COUNT", "T_CUME_DIST", "T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", 
		"T_CURRENT_USER", "T_DENSE_RANK", "T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", 
		"T_LEAD", "T_MAX_PART_STRING", "T_MIN_PART_STRING", "T_MAX_PART_INT", 
		"T_MIN_PART_INT", "T_MAX_PART_DATE", "T_MIN_PART_DATE", "T_PART_COUNT", 
		"T_PART_LOC", "T_RANK", "T_ROW_NUMBER", "T_STDEV", "T_SYSDATE", "T_VARIANCE", 
		"T_VAR_POP", "T_VAR_SAMP", "T_USER", "T_ADD", "T_COLON", "T_COMMA", "T_PIPE", 
		"T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", 
		"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", 
		"T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", 
		"T_SUB", "IDENTIFIER", "INT_LITERAL", "DECIMAL_LITERAL", "STRING_LITERAL", 
		"L_INT", "L_DEC", "L_M_COMMENT", "L_S_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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

	 
	    map<string, json> hivevar_context_variables; 
	    map<string, json> hiveconf_context_variables;

	    void save_var(string var_name, string var_type, json var_value)
	    {
	        if(var_type == "HIVECONF")
	        {
	            hiveconf_context_variables.insert(make_pair(var_name, var_value));
	        }
	        else if(var_type == "HIVEVAR")
	        {
	            hivevar_context_variables.insert(make_pair(var_name, var_value));
	        }
	    }

	    json get_value(string var_name, string var_type)
	    {
	        if(var_type == "HIVECONF")
	        {
	            json tmp = hiveconf_context_variables.find(var_name)->second;

	            return tmp;
	        }
	        else if(var_type == "HIVEVAR")
	        {
	            json tmp =  hivevar_context_variables.find(var_name)->second;
	            return tmp;
	        }

	        return NULL;
	    }

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
			setState(216);
			((ProgramContext)_localctx).stmt_list = stmt_list();
			setState(217);
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
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				((Stmt_listContext)_localctx).stmt = stmt();
				((Stmt_listContext)_localctx).stmts.add(((Stmt_listContext)_localctx).stmt);
				setState(222);
				match(T_SEMICOLON);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_CREATE || _la==T_DROP || _la==T_SELECT || _la==T_SET );
			 
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

	public static class Data_typeContext extends ParserRuleContext {
		public json res;
		public Primitive_typeContext primitive_type;
		public Complex_typeContext complex_type;
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Complex_typeContext complex_type() {
			return getRuleContext(Complex_typeContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data_type);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BIGINT:
			case T_BINARY:
			case T_BOOLEAN:
			case T_CHAR:
			case T_DATE:
			case T_DECIMAL:
			case T_DOUBLE:
			case T_FLOAT:
			case T_INT:
			case T_SMALLINT:
			case T_STRING:
			case T_TIMESTAMP:
			case T_TINYINT:
			case T_VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				((Data_typeContext)_localctx).primitive_type = primitive_type();
				 ((Data_typeContext)_localctx).res =  hql_primitive_type_spec(((Data_typeContext)_localctx).primitive_type.res); 
				}
				break;
			case T_ARRAY:
			case T_MAP:
			case T_STRUCT:
			case T_UNIONTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				((Data_typeContext)_localctx).complex_type = complex_type();
				 ((Data_typeContext)_localctx).res =  ((Data_typeContext)_localctx).complex_type.res; 
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

	public static class Primitive_typeContext extends ParserRuleContext {
		public std::string res;
		public Token precision;
		public Token scale;
		public TerminalNode T_TINYINT() { return getToken(HiveParser.T_TINYINT, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HiveParser.T_SMALLINT, 0); }
		public TerminalNode T_INT() { return getToken(HiveParser.T_INT, 0); }
		public TerminalNode T_BIGINT() { return getToken(HiveParser.T_BIGINT, 0); }
		public TerminalNode T_BOOLEAN() { return getToken(HiveParser.T_BOOLEAN, 0); }
		public TerminalNode T_FLOAT() { return getToken(HiveParser.T_FLOAT, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HiveParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(HiveParser.T_PRECISION, 0); }
		public TerminalNode T_STRING() { return getToken(HiveParser.T_STRING, 0); }
		public TerminalNode T_BINARY() { return getToken(HiveParser.T_BINARY, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HiveParser.T_TIMESTAMP, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HiveParser.T_DECIMAL, 0); }
		public List<TerminalNode> INT_LITERAL() { return getTokens(HiveParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(HiveParser.INT_LITERAL, i);
		}
		public TerminalNode T_DATE() { return getToken(HiveParser.T_DATE, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HiveParser.T_VARCHAR, 0); }
		public TerminalNode T_CHAR() { return getToken(HiveParser.T_CHAR, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitive_type);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(T_TINYINT);
				 ((Primitive_typeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T_SMALLINT);
				 ((Primitive_typeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T_INT);
				 ((Primitive_typeContext)_localctx).res =  "INT"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(T_BIGINT);
				 ((Primitive_typeContext)_localctx).res =  "BIGINT"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(T_BOOLEAN);
				 ((Primitive_typeContext)_localctx).res =  "BOOLEAN"; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(T_FLOAT);
				 ((Primitive_typeContext)_localctx).res =  "FLOAT"; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(250);
				match(T_DOUBLE);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PRECISION) {
					{
					setState(251);
					match(T_PRECISION);
					}
				}

				 ((Primitive_typeContext)_localctx).res =  "DOUBLE"; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(255);
				match(T_STRING);
				 ((Primitive_typeContext)_localctx).res =  "STRING"; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				match(T_BINARY);
				 ((Primitive_typeContext)_localctx).res =  "BINARY"; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(259);
				match(T_TIMESTAMP);
				 ((Primitive_typeContext)_localctx).res =  "TIMESTAMP"; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(261);
				match(T_DECIMAL);
				 ((Primitive_typeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(263);
				match(T_DECIMAL);
				setState(264);
				match(T_OPEN_P);
				setState(265);
				((Primitive_typeContext)_localctx).precision = match(INT_LITERAL);
				setState(266);
				match(T_COMMA);
				setState(267);
				((Primitive_typeContext)_localctx).scale = match(INT_LITERAL);
				setState(268);
				match(T_CLOSE_P);
				 ((Primitive_typeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(270);
				match(T_DATE);
				 ((Primitive_typeContext)_localctx).res =  "DATE"; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(272);
				match(T_VARCHAR);
				 ((Primitive_typeContext)_localctx).res =  "VARCHAR"; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(274);
				match(T_CHAR);
				 ((Primitive_typeContext)_localctx).res =  "CHAR"; 
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

	public static class Complex_typeContext extends ParserRuleContext {
		public json res;
		public Primitive_typeContext primitive_type;
		public Data_typeContext data_type;
		public Column_identifierContext column_identifier;
		public List<Column_identifierContext> column_list = new ArrayList<Column_identifierContext>();
		public List<Data_typeContext> data_type_list = new ArrayList<Data_typeContext>();
		public TerminalNode T_ARRAY() { return getToken(HiveParser.T_ARRAY, 0); }
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode T_MAP() { return getToken(HiveParser.T_MAP, 0); }
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public TerminalNode T_STRUCT() { return getToken(HiveParser.T_STRUCT, 0); }
		public List<Column_identifierContext> column_identifier() {
			return getRuleContexts(Column_identifierContext.class);
		}
		public Column_identifierContext column_identifier(int i) {
			return getRuleContext(Column_identifierContext.class,i);
		}
		public TerminalNode T_UNIONTYPE() { return getToken(HiveParser.T_UNIONTYPE, 0); }
		public Complex_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_type; }
	}

	public final Complex_typeContext complex_type() throws RecognitionException {
		Complex_typeContext _localctx = new Complex_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_complex_type);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T_ARRAY);
				setState(279);
				match(T_LESS);
				setState(280);
				((Complex_typeContext)_localctx).primitive_type = primitive_type();
				setState(281);
				match(T_GREATER);
				 ((Complex_typeContext)_localctx).res =  hql_array_type_spec(((Complex_typeContext)_localctx).primitive_type.res); 
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T_MAP);
				setState(285);
				match(T_LESS);
				setState(286);
				((Complex_typeContext)_localctx).primitive_type = primitive_type();
				setState(287);
				match(T_COMMA);
				setState(288);
				((Complex_typeContext)_localctx).data_type = data_type();
				setState(289);
				match(T_GREATER);
				 ((Complex_typeContext)_localctx).res =  hql_map_type_spec(((Complex_typeContext)_localctx).primitive_type.res, ((Complex_typeContext)_localctx).data_type.res); 
				}
				break;
			case T_STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				 vector<Column_identifierContext*> column_list; vector<Data_typeContext*> data_type_list; 
				setState(293);
				match(T_STRUCT);
				setState(294);
				match(T_LESS);
				setState(295);
				((Complex_typeContext)_localctx).column_identifier = column_identifier();
				((Complex_typeContext)_localctx).column_list.add(((Complex_typeContext)_localctx).column_identifier);
				setState(296);
				match(T_COLON);
				setState(297);
				((Complex_typeContext)_localctx).data_type = data_type();
				((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(298);
					match(T_COMMA);
					setState(299);
					((Complex_typeContext)_localctx).column_identifier = column_identifier();
					((Complex_typeContext)_localctx).column_list.add(((Complex_typeContext)_localctx).column_identifier);
					setState(300);
					match(T_COLON);
					setState(301);
					((Complex_typeContext)_localctx).data_type = data_type();
					((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(308);
				match(T_GREATER);

				        vector<string> column_json_list; vector<json> data_type_json_list;
				        for(int i = 0 ; i < ((Complex_typeContext)_localctx).column_list.size(); i++)
				        {
				            column_json_list.push_back(((Complex_typeContext)_localctx).column_list[i]->res);
				            data_type_json_list.push_back(((Complex_typeContext)_localctx).data_type_list[i]->res);
				        }
				        ((Complex_typeContext)_localctx).res =  hql_struct_type_spec(column_json_list, data_type_json_list);
				    
				}
				break;
			case T_UNIONTYPE:
				enterOuterAlt(_localctx, 4);
				{
				 vector<Data_typeContext*> data_type_list; 
				setState(312);
				match(T_UNIONTYPE);
				setState(313);
				match(T_LESS);
				setState(314);
				((Complex_typeContext)_localctx).data_type = data_type();
				((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(315);
					match(T_COMMA);
					setState(316);
					((Complex_typeContext)_localctx).data_type = data_type();
					((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322);
				match(T_GREATER);

				        vector<json> data_type_json_list;
				        for(Data_typeContext* dtyp:((Complex_typeContext)_localctx).data_type_list)
				        {
				            data_type_json_list.push_back(dtyp->res);
				        }
				        ((Complex_typeContext)_localctx).res =  hql_uniontype_type_spec(data_type_json_list);
				    
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
		enterRule(_localctx, 10, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T_OPEN_P);
			setState(328);
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
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(329);
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

			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(332);
				match(T_COMMA);
				setState(333);
				match(L_INT);
				}
			}

			setState(336);
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
		public Ddl_stmtContext ddl_stmt;
		public Variable_substitutionContext variable_substitution;
		public Query_stmtContext query_stmt() {
			return getRuleContext(Query_stmtContext.class,0);
		}
		public Ddl_stmtContext ddl_stmt() {
			return getRuleContext(Ddl_stmtContext.class,0);
		}
		public Variable_substitutionContext variable_substitution() {
			return getRuleContext(Variable_substitutionContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				((StmtContext)_localctx).query_stmt = query_stmt();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).query_stmt.res; 
				}
				break;
			case T_CREATE:
			case T_DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				((StmtContext)_localctx).ddl_stmt = ddl_stmt();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).ddl_stmt.res; 
				}
				break;
			case T_SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				((StmtContext)_localctx).variable_substitution = variable_substitution();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).variable_substitution.res; 
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

	public static class Ddl_stmtContext extends ParserRuleContext {
		public json res;
		public Create_table_stmtContext create_table_stmt;
		public Droptable_stmtContext droptable_stmt;
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Droptable_stmtContext droptable_stmt() {
			return getRuleContext(Droptable_stmtContext.class,0);
		}
		public Ddl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_stmt; }
	}

	public final Ddl_stmtContext ddl_stmt() throws RecognitionException {
		Ddl_stmtContext _localctx = new Ddl_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ddl_stmt);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				((Ddl_stmtContext)_localctx).create_table_stmt = create_table_stmt();
				 ((Ddl_stmtContext)_localctx).res =  ((Ddl_stmtContext)_localctx).create_table_stmt.res; 
				}
				break;
			case T_DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				((Ddl_stmtContext)_localctx).droptable_stmt = droptable_stmt();
				 ((Ddl_stmtContext)_localctx).res =  ((Ddl_stmtContext)_localctx).droptable_stmt.res; 
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

	public static class Variable_substitutionContext extends ParserRuleContext {
		public json res;
		public Opt_var_set_typeContext opt_var_set_type;
		public System_var_identifierContext system_var_identifier;
		public ExprContext expr;
		public TerminalNode T_SET() { return getToken(HiveParser.T_SET, 0); }
		public Opt_var_set_typeContext opt_var_set_type() {
			return getRuleContext(Opt_var_set_typeContext.class,0);
		}
		public System_var_identifierContext system_var_identifier() {
			return getRuleContext(System_var_identifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Variable_substitutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_substitution; }
	}

	public final Variable_substitutionContext variable_substitution() throws RecognitionException {
		Variable_substitutionContext _localctx = new Variable_substitutionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_substitution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T_SET);
			setState(358);
			((Variable_substitutionContext)_localctx).opt_var_set_type = opt_var_set_type();
			setState(359);
			((Variable_substitutionContext)_localctx).system_var_identifier = system_var_identifier();
			setState(360);
			match(T_EQUAL);
			setState(361);
			((Variable_substitutionContext)_localctx).expr = expr(0);
			 
			        save_var(((Variable_substitutionContext)_localctx).system_var_identifier.res, ((Variable_substitutionContext)_localctx).opt_var_set_type.res, ((Variable_substitutionContext)_localctx).expr.res);
			        ((Variable_substitutionContext)_localctx).res =  hql_set_variable(((Variable_substitutionContext)_localctx).opt_var_set_type.res, ((Variable_substitutionContext)_localctx).system_var_identifier.res, ((Variable_substitutionContext)_localctx).expr.res); 
			    
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

	public static class Use_varContext extends ParserRuleContext {
		public json res;
		public Opt_var_use_typeContext opt_var_use_type;
		public System_var_identifierContext system_var_identifier;
		public Opt_var_use_typeContext opt_var_use_type() {
			return getRuleContext(Opt_var_use_typeContext.class,0);
		}
		public System_var_identifierContext system_var_identifier() {
			return getRuleContext(System_var_identifierContext.class,0);
		}
		public Use_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_var; }
	}

	public final Use_varContext use_var() throws RecognitionException {
		Use_varContext _localctx = new Use_varContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_use_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__0);
			setState(365);
			match(T_OPEN_B);
			setState(366);
			((Use_varContext)_localctx).opt_var_use_type = opt_var_use_type();
			setState(367);
			((Use_varContext)_localctx).system_var_identifier = system_var_identifier();
			setState(368);
			match(T_CLOSE_B);
			 ((Use_varContext)_localctx).res =  get_value(((Use_varContext)_localctx).system_var_identifier.res, ((Use_varContext)_localctx).opt_var_use_type.res); 
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

	public static class System_var_identifierContext extends ParserRuleContext {
		public string res;
		public Var_nameContext var_name;
		public List<Var_nameContext> var_name_list = new ArrayList<Var_nameContext>();
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public System_var_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_var_identifier; }
	}

	public final System_var_identifierContext system_var_identifier() throws RecognitionException {
		System_var_identifierContext _localctx = new System_var_identifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_system_var_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<Var_nameContext*> var_name_list; 
			setState(372);
			((System_var_identifierContext)_localctx).var_name = var_name();
			((System_var_identifierContext)_localctx).var_name_list.add(((System_var_identifierContext)_localctx).var_name);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(373);
				match(T__1);
				setState(374);
				((System_var_identifierContext)_localctx).var_name = var_name();
				((System_var_identifierContext)_localctx).var_name_list.add(((System_var_identifierContext)_localctx).var_name);
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        string result = "";
			        for(Var_nameContext* var_namectxt:((System_var_identifierContext)_localctx).var_name_list)
			        {
			            result+=var_namectxt->res;
			        }
			        ((System_var_identifierContext)_localctx).res =  result;
			    
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

	public static class Opt_var_set_typeContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_HIVECONF() { return getToken(HiveParser.T_HIVECONF, 0); }
		public TerminalNode T_HIVEVAR() { return getToken(HiveParser.T_HIVEVAR, 0); }
		public Opt_var_set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_var_set_type; }
	}

	public final Opt_var_set_typeContext opt_var_set_type() throws RecognitionException {
		Opt_var_set_typeContext _localctx = new Opt_var_set_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_opt_var_set_type);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_var_set_typeContext)_localctx).res =  "HIVECONF"; 
				}
				break;
			case T_HIVECONF:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(T_HIVECONF);
				setState(384);
				match(T_COLON);
				 ((Opt_var_set_typeContext)_localctx).res =  "HIVECONF"; 
				}
				break;
			case T_HIVEVAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(T_HIVEVAR);
				setState(387);
				match(T_COLON);
				 ((Opt_var_set_typeContext)_localctx).res =  "HIVEVAR"; 
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

	public static class Opt_var_use_typeContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_HIVECONF() { return getToken(HiveParser.T_HIVECONF, 0); }
		public TerminalNode T_HIVEVAR() { return getToken(HiveParser.T_HIVEVAR, 0); }
		public Opt_var_use_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_var_use_type; }
	}

	public final Opt_var_use_typeContext opt_var_use_type() throws RecognitionException {
		Opt_var_use_typeContext _localctx = new Opt_var_use_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opt_var_use_type);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_var_use_typeContext)_localctx).res =  "HIVEVAR"; 
				}
				break;
			case T_HIVECONF:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(T_HIVECONF);
				setState(393);
				match(T_COLON);
				 ((Opt_var_use_typeContext)_localctx).res =  "HIVECONF"; 
				}
				break;
			case T_HIVEVAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(T_HIVEVAR);
				setState(396);
				match(T_COLON);
				 ((Opt_var_use_typeContext)_localctx).res =  "HIVEVAR"; 
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

	public static class Var_nameContext extends ParserRuleContext {
		public string res;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(HiveParser.IDENTIFIER, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			((Var_nameContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 ((Var_nameContext)_localctx).res =  (((Var_nameContext)_localctx).IDENTIFIER!=null?((Var_nameContext)_localctx).IDENTIFIER.getText():null); 
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

	public static class Droptable_stmtContext extends ParserRuleContext {
		public json res;
		public Opt_if_existsContext opt_if_exists;
		public Tab_identContext tab_ident;
		public Opt_drop_table_purgeContext opt_drop_table_purge;
		public TerminalNode T_DROP() { return getToken(HiveParser.T_DROP, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveParser.T_TABLE, 0); }
		public Opt_if_existsContext opt_if_exists() {
			return getRuleContext(Opt_if_existsContext.class,0);
		}
		public Tab_identContext tab_ident() {
			return getRuleContext(Tab_identContext.class,0);
		}
		public Opt_drop_table_purgeContext opt_drop_table_purge() {
			return getRuleContext(Opt_drop_table_purgeContext.class,0);
		}
		public Droptable_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_droptable_stmt; }
	}

	public final Droptable_stmtContext droptable_stmt() throws RecognitionException {
		Droptable_stmtContext _localctx = new Droptable_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_droptable_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T_DROP);
			setState(404);
			match(T_TABLE);
			setState(405);
			((Droptable_stmtContext)_localctx).opt_if_exists = opt_if_exists();
			setState(406);
			((Droptable_stmtContext)_localctx).tab_ident = tab_ident();
			setState(407);
			((Droptable_stmtContext)_localctx).opt_drop_table_purge = opt_drop_table_purge();
			 ((Droptable_stmtContext)_localctx).res =  hql_drop_table_stmt(((Droptable_stmtContext)_localctx).opt_if_exists.res, ((Droptable_stmtContext)_localctx).tab_ident.res, ((Droptable_stmtContext)_localctx).opt_drop_table_purge.res); 
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

	public static class Opt_drop_table_purgeContext extends ParserRuleContext {
		public bool res;
		public TerminalNode T_PURGE() { return getToken(HiveParser.T_PURGE, 0); }
		public Opt_drop_table_purgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_drop_table_purge; }
	}

	public final Opt_drop_table_purgeContext opt_drop_table_purge() throws RecognitionException {
		Opt_drop_table_purgeContext _localctx = new Opt_drop_table_purgeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_opt_drop_table_purge);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_drop_table_purgeContext)_localctx).res =  false; 
				}
				break;
			case T_PURGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(T_PURGE);
				 ((Opt_drop_table_purgeContext)_localctx).res =  true; 
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public json res;
		public Table_typeContext table_type;
		public Opt_if_not_exists_flagContext opt_if_not_exists_flag;
		public Tab_identContext tab_ident;
		public Opt_column_specsContext opt_column_specs;
		public Opt_constraint_specificationContext opt_constraint_specification;
		public Opt_commentContext opt_comment;
		public Opt_partitioned_tableContext opt_partitioned_table;
		public Opt_clustered_by_tableContext opt_clustered_by_table;
		public Opt_skewed_by_tableContext opt_skewed_by_table;
		public Opt_row_formatedContext opt_row_formated;
		public Opt_stored_asContext opt_stored_as;
		public Opt_locationContext opt_location;
		public Opt_table_propertiesContext opt_table_properties;
		public Opt_as_selectContext opt_as_select;
		public Tab_identContext tab_name;
		public Tab_identContext tab_like;
		public TerminalNode T_CREATE() { return getToken(HiveParser.T_CREATE, 0); }
		public Table_typeContext table_type() {
			return getRuleContext(Table_typeContext.class,0);
		}
		public TerminalNode T_TABLE() { return getToken(HiveParser.T_TABLE, 0); }
		public Opt_if_not_exists_flagContext opt_if_not_exists_flag() {
			return getRuleContext(Opt_if_not_exists_flagContext.class,0);
		}
		public List<Tab_identContext> tab_ident() {
			return getRuleContexts(Tab_identContext.class);
		}
		public Tab_identContext tab_ident(int i) {
			return getRuleContext(Tab_identContext.class,i);
		}
		public Opt_column_specsContext opt_column_specs() {
			return getRuleContext(Opt_column_specsContext.class,0);
		}
		public Opt_constraint_specificationContext opt_constraint_specification() {
			return getRuleContext(Opt_constraint_specificationContext.class,0);
		}
		public Opt_commentContext opt_comment() {
			return getRuleContext(Opt_commentContext.class,0);
		}
		public Opt_partitioned_tableContext opt_partitioned_table() {
			return getRuleContext(Opt_partitioned_tableContext.class,0);
		}
		public Opt_clustered_by_tableContext opt_clustered_by_table() {
			return getRuleContext(Opt_clustered_by_tableContext.class,0);
		}
		public Opt_skewed_by_tableContext opt_skewed_by_table() {
			return getRuleContext(Opt_skewed_by_tableContext.class,0);
		}
		public Opt_row_formatedContext opt_row_formated() {
			return getRuleContext(Opt_row_formatedContext.class,0);
		}
		public Opt_stored_asContext opt_stored_as() {
			return getRuleContext(Opt_stored_asContext.class,0);
		}
		public Opt_locationContext opt_location() {
			return getRuleContext(Opt_locationContext.class,0);
		}
		public Opt_table_propertiesContext opt_table_properties() {
			return getRuleContext(Opt_table_propertiesContext.class,0);
		}
		public Opt_as_selectContext opt_as_select() {
			return getRuleContext(Opt_as_selectContext.class,0);
		}
		public TerminalNode T_LIKE() { return getToken(HiveParser.T_LIKE, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_table_stmt);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(T_CREATE);
				setState(416);
				((Create_table_stmtContext)_localctx).table_type = table_type();
				setState(417);
				match(T_TABLE);
				setState(418);
				((Create_table_stmtContext)_localctx).opt_if_not_exists_flag = opt_if_not_exists_flag();
				setState(419);
				((Create_table_stmtContext)_localctx).tab_ident = tab_ident();
				setState(420);
				((Create_table_stmtContext)_localctx).opt_column_specs = opt_column_specs();
				setState(421);
				((Create_table_stmtContext)_localctx).opt_constraint_specification = opt_constraint_specification();
				setState(422);
				((Create_table_stmtContext)_localctx).opt_comment = opt_comment();
				setState(423);
				((Create_table_stmtContext)_localctx).opt_partitioned_table = opt_partitioned_table();
				setState(424);
				((Create_table_stmtContext)_localctx).opt_clustered_by_table = opt_clustered_by_table();
				setState(425);
				((Create_table_stmtContext)_localctx).opt_skewed_by_table = opt_skewed_by_table();
				setState(426);
				((Create_table_stmtContext)_localctx).opt_row_formated = opt_row_formated();
				setState(427);
				((Create_table_stmtContext)_localctx).opt_stored_as = opt_stored_as();
				setState(428);
				((Create_table_stmtContext)_localctx).opt_location = opt_location();
				setState(429);
				((Create_table_stmtContext)_localctx).opt_table_properties = opt_table_properties();
				setState(430);
				((Create_table_stmtContext)_localctx).opt_as_select = opt_as_select();

				            ((Create_table_stmtContext)_localctx).res =  hql_stmt_create_table(((Create_table_stmtContext)_localctx).table_type.res, ((Create_table_stmtContext)_localctx).opt_if_not_exists_flag.res, ((Create_table_stmtContext)_localctx).tab_ident.res, 
				                ((Create_table_stmtContext)_localctx).opt_column_specs.res, ((Create_table_stmtContext)_localctx).opt_constraint_specification.res, ((Create_table_stmtContext)_localctx).opt_comment.res, 
				                ((Create_table_stmtContext)_localctx).opt_partitioned_table.res, ((Create_table_stmtContext)_localctx).opt_clustered_by_table.res, ((Create_table_stmtContext)_localctx).opt_skewed_by_table.res,
				                ((Create_table_stmtContext)_localctx).opt_row_formated.res, ((Create_table_stmtContext)_localctx).opt_stored_as.res, ((Create_table_stmtContext)_localctx).opt_location.res, 
				                ((Create_table_stmtContext)_localctx).opt_table_properties.res, ((Create_table_stmtContext)_localctx).opt_as_select.res);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(T_CREATE);
				setState(434);
				((Create_table_stmtContext)_localctx).table_type = table_type();
				setState(435);
				match(T_TABLE);
				setState(436);
				((Create_table_stmtContext)_localctx).opt_if_not_exists_flag = opt_if_not_exists_flag();
				setState(437);
				((Create_table_stmtContext)_localctx).tab_name = tab_ident();
				setState(438);
				match(T_LIKE);
				setState(439);
				((Create_table_stmtContext)_localctx).tab_like = tab_ident();
				setState(440);
				((Create_table_stmtContext)_localctx).opt_location = opt_location();
				 ((Create_table_stmtContext)_localctx).res =  hql_create_table_like(((Create_table_stmtContext)_localctx).table_type.res, ((Create_table_stmtContext)_localctx).opt_if_not_exists_flag.res, ((Create_table_stmtContext)_localctx).tab_name.res, ((Create_table_stmtContext)_localctx).tab_like.res, ((Create_table_stmtContext)_localctx).opt_location.res); 
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

	public static class Opt_column_specsContext extends ParserRuleContext {
		public vector<json> res;
		public Column_definitionContext column_definition;
		public List<Column_definitionContext> column_def_list = new ArrayList<Column_definitionContext>();
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public Opt_column_specsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_column_specs; }
	}

	public final Opt_column_specsContext opt_column_specs() throws RecognitionException {
		Opt_column_specsContext _localctx = new Opt_column_specsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_opt_column_specs);
		int _la;
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_CONSTRAINT:
			case T_LOCATION:
			case T_PARTITIONED:
			case T_PRIMARY:
			case T_ROW:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_column_specsContext)_localctx).res =  vector<json>(); 
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				vector<Column_definitionContext*> column_def_list; 
				setState(447);
				match(T_OPEN_P);
				setState(448);
				((Opt_column_specsContext)_localctx).column_definition = column_definition();
				((Opt_column_specsContext)_localctx).column_def_list.add(((Opt_column_specsContext)_localctx).column_definition);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(449);
					match(T_COMMA);
					setState(450);
					((Opt_column_specsContext)_localctx).column_definition = column_definition();
					((Opt_column_specsContext)_localctx).column_def_list.add(((Opt_column_specsContext)_localctx).column_definition);
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(456);
				match(T_CLOSE_P);

				        vector<json> column_def_json_list;
				        for(Column_definitionContext* column_ctxt:((Opt_column_specsContext)_localctx).column_def_list)
				        {
				            column_def_json_list.push_back(column_ctxt->res);
				        }
				        ((Opt_column_specsContext)_localctx).res =  column_def_json_list;
				    
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

	public static class Opt_constraint_specificationContext extends ParserRuleContext {
		public vector<json> res;
		public Constraint_specificationContext constraint_specification;
		public List<Constraint_specificationContext> constraint_list = new ArrayList<Constraint_specificationContext>();
		public List<Constraint_specificationContext> constraint_specification() {
			return getRuleContexts(Constraint_specificationContext.class);
		}
		public Constraint_specificationContext constraint_specification(int i) {
			return getRuleContext(Constraint_specificationContext.class,i);
		}
		public Opt_constraint_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_constraint_specification; }
	}

	public final Opt_constraint_specificationContext opt_constraint_specification() throws RecognitionException {
		Opt_constraint_specificationContext _localctx = new Opt_constraint_specificationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opt_constraint_specification);
		int _la;
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_LOCATION:
			case T_PARTITIONED:
			case T_ROW:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_constraint_specificationContext)_localctx).res =  vector<json>(); 
				}
				break;
			case T_CONSTRAINT:
			case T_PRIMARY:
				enterOuterAlt(_localctx, 2);
				{
				 vector<Constraint_specificationContext*> constraint_list; 
				setState(463);
				((Opt_constraint_specificationContext)_localctx).constraint_specification = constraint_specification();
				((Opt_constraint_specificationContext)_localctx).constraint_list.add(((Opt_constraint_specificationContext)_localctx).constraint_specification);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_CONSTRAINT || _la==T_PRIMARY) {
					{
					{
					setState(464);
					((Opt_constraint_specificationContext)_localctx).constraint_specification = constraint_specification();
					((Opt_constraint_specificationContext)_localctx).constraint_list.add(((Opt_constraint_specificationContext)_localctx).constraint_specification);
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        vector<json> contraint_json_list;
				        for(Constraint_specificationContext* contraint_ctxt:((Opt_constraint_specificationContext)_localctx).constraint_list)
				            contraint_json_list.push_back(contraint_ctxt->res);
				        ((Opt_constraint_specificationContext)_localctx).res =  contraint_json_list;
				    
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

	public static class Opt_commentContext extends ParserRuleContext {
		public string res;
		public Token table_comment;
		public TerminalNode T_COMMENT() { return getToken(HiveParser.T_COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Opt_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_comment; }
	}

	public final Opt_commentContext opt_comment() throws RecognitionException {
		Opt_commentContext _localctx = new Opt_commentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_opt_comment);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_CLUSTERED:
			case T_LOCATION:
			case T_PARTITIONED:
			case T_ROW:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_commentContext)_localctx).res =  string(); 
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(T_COMMENT);
				setState(476);
				((Opt_commentContext)_localctx).table_comment = match(STRING_LITERAL);
				 ((Opt_commentContext)_localctx).res =  remove_quotes((((Opt_commentContext)_localctx).table_comment!=null?((Opt_commentContext)_localctx).table_comment.getText():null));
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

	public static class Table_optionsContext extends ParserRuleContext {
		public json res;
		public Opt_partitioned_tableContext opt_partitioned_table() {
			return getRuleContext(Opt_partitioned_tableContext.class,0);
		}
		public Table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_options; }
	}

	public final Table_optionsContext table_options() throws RecognitionException {
		Table_optionsContext _localctx = new Table_optionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_table_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			opt_partitioned_table();
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

	public static class Opt_partitioned_tableContext extends ParserRuleContext {
		public vector<json> res;
		public Partition_specContext partition_spec;
		public List<Partition_specContext> partition_field_list = new ArrayList<Partition_specContext>();
		public TerminalNode T_PARTITIONED() { return getToken(HiveParser.T_PARTITIONED, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<Partition_specContext> partition_spec() {
			return getRuleContexts(Partition_specContext.class);
		}
		public Partition_specContext partition_spec(int i) {
			return getRuleContext(Partition_specContext.class,i);
		}
		public Opt_partitioned_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_partitioned_table; }
	}

	public final Opt_partitioned_tableContext opt_partitioned_table() throws RecognitionException {
		Opt_partitioned_tableContext _localctx = new Opt_partitioned_tableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_opt_partitioned_table);
		int _la;
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T_AS:
			case T_CLUSTERED:
			case T_LOCATION:
			case T_ROW:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_partitioned_tableContext)_localctx).res =  vector<json>(); 
				}
				break;
			case T_PARTITIONED:
				enterOuterAlt(_localctx, 2);
				{
				 vector<Partition_specContext*> partition_field_list; 
				setState(484);
				match(T_PARTITIONED);
				setState(485);
				match(T_BY);
				setState(486);
				match(T_OPEN_P);
				setState(487);
				((Opt_partitioned_tableContext)_localctx).partition_spec = partition_spec();
				((Opt_partitioned_tableContext)_localctx).partition_field_list.add(((Opt_partitioned_tableContext)_localctx).partition_spec);
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(488);
					match(T_COMMA);
					setState(489);
					((Opt_partitioned_tableContext)_localctx).partition_spec = partition_spec();
					((Opt_partitioned_tableContext)_localctx).partition_field_list.add(((Opt_partitioned_tableContext)_localctx).partition_spec);
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(495);
				match(T_CLOSE_P);

				        vector<json> partition_json_list;
				        for(Partition_specContext* part_cxt:((Opt_partitioned_tableContext)_localctx).partition_field_list)
				        {
				            partition_json_list.push_back(part_cxt->res);
				        }
				        ((Opt_partitioned_tableContext)_localctx).res =  partition_json_list;
				    
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

	public static class Partition_specContext extends ParserRuleContext {
		public json res;
		public Column_identifierContext column_identifier;
		public Data_typeContext data_type;
		public Token STRING_LITERAL;
		public Column_identifierContext column_identifier() {
			return getRuleContext(Column_identifierContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode T_COMMENT() { return getToken(HiveParser.T_COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Partition_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_spec; }
	}

	public final Partition_specContext partition_spec() throws RecognitionException {
		Partition_specContext _localctx = new Partition_specContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_partition_spec);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				((Partition_specContext)_localctx).column_identifier = column_identifier();
				setState(501);
				((Partition_specContext)_localctx).data_type = data_type();
				 ((Partition_specContext)_localctx).res =  hql_column_definition(((Partition_specContext)_localctx).column_identifier.res, ((Partition_specContext)_localctx).data_type.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				((Partition_specContext)_localctx).column_identifier = column_identifier();
				setState(505);
				((Partition_specContext)_localctx).data_type = data_type();
				setState(506);
				match(T_COMMENT);
				setState(507);
				((Partition_specContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Partition_specContext)_localctx).res =  hql_column_definition(((Partition_specContext)_localctx).column_identifier.res, ((Partition_specContext)_localctx).data_type.res, (((Partition_specContext)_localctx).STRING_LITERAL!=null?((Partition_specContext)_localctx).STRING_LITERAL.getText():null)); 
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

	public static class Opt_clustered_by_tableContext extends ParserRuleContext {
		public json res;
		public Column_identifierContext column_identifier;
		public List<Column_identifierContext> column_list = new ArrayList<Column_identifierContext>();
		public Opt_sorted_by_tableContext opt_sorted_by_table;
		public Token INT_LITERAL;
		public TerminalNode T_CLUSTERED() { return getToken(HiveParser.T_CLUSTERED, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Opt_sorted_by_tableContext opt_sorted_by_table() {
			return getRuleContext(Opt_sorted_by_tableContext.class,0);
		}
		public TerminalNode T_INTO() { return getToken(HiveParser.T_INTO, 0); }
		public TerminalNode INT_LITERAL() { return getToken(HiveParser.INT_LITERAL, 0); }
		public TerminalNode T_BUCKETS() { return getToken(HiveParser.T_BUCKETS, 0); }
		public List<Column_identifierContext> column_identifier() {
			return getRuleContexts(Column_identifierContext.class);
		}
		public Column_identifierContext column_identifier(int i) {
			return getRuleContext(Column_identifierContext.class,i);
		}
		public Opt_clustered_by_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_clustered_by_table; }
	}

	public final Opt_clustered_by_tableContext opt_clustered_by_table() throws RecognitionException {
		Opt_clustered_by_tableContext _localctx = new Opt_clustered_by_tableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opt_clustered_by_table);
		int _la;
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_LOCATION:
			case T_ROW:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_clustered_by_tableContext)_localctx).res =  json(); 
				}
				break;
			case T_CLUSTERED:
				enterOuterAlt(_localctx, 2);
				{
				 vector<Column_identifierContext*> column_list; 
				setState(514);
				match(T_CLUSTERED);
				setState(515);
				match(T_BY);
				setState(516);
				match(T_OPEN_P);
				setState(517);
				((Opt_clustered_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_clustered_by_tableContext)_localctx).column_list.add(((Opt_clustered_by_tableContext)_localctx).column_identifier);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(518);
					match(T_COMMA);
					setState(519);
					((Opt_clustered_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_clustered_by_tableContext)_localctx).column_list.add(((Opt_clustered_by_tableContext)_localctx).column_identifier);
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
				match(T_CLOSE_P);
				setState(526);
				((Opt_clustered_by_tableContext)_localctx).opt_sorted_by_table = opt_sorted_by_table();
				setState(527);
				match(T_INTO);
				setState(528);
				((Opt_clustered_by_tableContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(529);
				match(T_BUCKETS);

				        vector<string> column_str_list;
				        for(Column_identifierContext* column_ctxt:((Opt_clustered_by_tableContext)_localctx).column_list)
				            column_str_list.push_back(column_ctxt->res);
				        ((Opt_clustered_by_tableContext)_localctx).res =  hql_clustered_by_expr(column_str_list, ((Opt_clustered_by_tableContext)_localctx).opt_sorted_by_table.res, (((Opt_clustered_by_tableContext)_localctx).INT_LITERAL!=null?((Opt_clustered_by_tableContext)_localctx).INT_LITERAL.getText():null));
				    
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

	public static class Opt_sorted_by_tableContext extends ParserRuleContext {
		public vector<json> res;
		public Column_identifierContext column_identifier;
		public List<Column_identifierContext> column_list = new ArrayList<Column_identifierContext>();
		public Opt_sorted_by_asc_descContext opt_sorted_by_asc_desc;
		public List<Opt_sorted_by_asc_descContext> sort_type_list = new ArrayList<Opt_sorted_by_asc_descContext>();
		public TerminalNode T_STORED() { return getToken(HiveParser.T_STORED, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<Column_identifierContext> column_identifier() {
			return getRuleContexts(Column_identifierContext.class);
		}
		public Column_identifierContext column_identifier(int i) {
			return getRuleContext(Column_identifierContext.class,i);
		}
		public List<Opt_sorted_by_asc_descContext> opt_sorted_by_asc_desc() {
			return getRuleContexts(Opt_sorted_by_asc_descContext.class);
		}
		public Opt_sorted_by_asc_descContext opt_sorted_by_asc_desc(int i) {
			return getRuleContext(Opt_sorted_by_asc_descContext.class,i);
		}
		public Opt_sorted_by_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_sorted_by_table; }
	}

	public final Opt_sorted_by_tableContext opt_sorted_by_table() throws RecognitionException {
		Opt_sorted_by_tableContext _localctx = new Opt_sorted_by_tableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opt_sorted_by_table);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INTO:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_sorted_by_tableContext)_localctx).res =  vector<json>(); 
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				 vector<string> column_list; vector<string> sort_type_list; 
				setState(536);
				match(T_STORED);
				setState(537);
				match(T_BY);
				setState(538);
				match(T_OPEN_P);
				setState(539);
				((Opt_sorted_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_sorted_by_tableContext)_localctx).column_list.add(((Opt_sorted_by_tableContext)_localctx).column_identifier);
				setState(540);
				((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc = opt_sorted_by_asc_desc();
				((Opt_sorted_by_tableContext)_localctx).sort_type_list.add(((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(541);
					match(T_COMMA);
					setState(542);
					((Opt_sorted_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_sorted_by_tableContext)_localctx).column_list.add(((Opt_sorted_by_tableContext)_localctx).column_identifier);
					setState(543);
					((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc = opt_sorted_by_asc_desc();
					((Opt_sorted_by_tableContext)_localctx).sort_type_list.add(((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc);
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(550);
				match(T_CLOSE_P);

				        vector<json> result_list;
				        for(int i = 0 ; i < ((Opt_sorted_by_tableContext)_localctx).column_list.size() ; i++)
				        {
				            json tmp;
				            tmp["column"] = ((Opt_sorted_by_tableContext)_localctx).column_list[i]->res;
				            tmp["sort_type"] = ((Opt_sorted_by_tableContext)_localctx).sort_type_list[i]->res;
				            result_list.push_back(tmp);
				        }
				        ((Opt_sorted_by_tableContext)_localctx).res =  result_list;
				    
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

	public static class Opt_sorted_by_asc_descContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_ASC() { return getToken(HiveParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(HiveParser.T_DESC, 0); }
		public Opt_sorted_by_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_sorted_by_asc_desc; }
	}

	public final Opt_sorted_by_asc_descContext opt_sorted_by_asc_desc() throws RecognitionException {
		Opt_sorted_by_asc_descContext _localctx = new Opt_sorted_by_asc_descContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opt_sorted_by_asc_desc);
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
			case T_CLOSE_P:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_sorted_by_asc_descContext)_localctx).res =  "ASC"; 
				}
				break;
			case T_ASC:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(T_ASC);
				 ((Opt_sorted_by_asc_descContext)_localctx).res =  "ASC"; 
				}
				break;
			case T_DESC:
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				match(T_DESC);
				 ((Opt_sorted_by_asc_descContext)_localctx).res =  "DESC"; 
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

	public static class Opt_skewed_by_tableContext extends ParserRuleContext {
		public json res;
		public Column_identifierContext column_identifier;
		public List<Column_identifierContext> column_list = new ArrayList<Column_identifierContext>();
		public Opt_on_skewedContext opt_on_skewed;
		public Opt_skewed_stored_as_directoryContext opt_skewed_stored_as_directory;
		public TerminalNode T_SKEWED() { return getToken(HiveParser.T_SKEWED, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Opt_on_skewedContext opt_on_skewed() {
			return getRuleContext(Opt_on_skewedContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Opt_skewed_stored_as_directoryContext opt_skewed_stored_as_directory() {
			return getRuleContext(Opt_skewed_stored_as_directoryContext.class,0);
		}
		public List<Column_identifierContext> column_identifier() {
			return getRuleContexts(Column_identifierContext.class);
		}
		public Column_identifierContext column_identifier(int i) {
			return getRuleContext(Column_identifierContext.class,i);
		}
		public Opt_skewed_by_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_skewed_by_table; }
	}

	public final Opt_skewed_by_tableContext opt_skewed_by_table() throws RecognitionException {
		Opt_skewed_by_tableContext _localctx = new Opt_skewed_by_tableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_opt_skewed_by_table);
		int _la;
		try {
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_LOCATION:
			case T_ROW:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_skewed_by_tableContext)_localctx).res =  json(); 
				}
				break;
			case T_SKEWED:
				enterOuterAlt(_localctx, 2);
				{
				 vector<Column_identifierContext*> column_list; 
				setState(564);
				match(T_SKEWED);
				setState(565);
				match(T_BY);
				setState(566);
				match(T_OPEN_P);
				setState(567);
				((Opt_skewed_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_skewed_by_tableContext)_localctx).column_list.add(((Opt_skewed_by_tableContext)_localctx).column_identifier);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(568);
					match(T_COMMA);
					setState(569);
					((Opt_skewed_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_skewed_by_tableContext)_localctx).column_list.add(((Opt_skewed_by_tableContext)_localctx).column_identifier);
					}
					}
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(575);
				((Opt_skewed_by_tableContext)_localctx).opt_on_skewed = opt_on_skewed();
				setState(576);
				match(T_CLOSE_P);
				setState(577);
				((Opt_skewed_by_tableContext)_localctx).opt_skewed_stored_as_directory = opt_skewed_stored_as_directory();

				        vector<string> column_str_list;
				        for(Column_identifierContext* column_ctxt:((Opt_skewed_by_tableContext)_localctx).column_list)
				            column_str_list.push_back(column_ctxt->res);
				        ((Opt_skewed_by_tableContext)_localctx).res =  hql_skewed_by_expr(column_str_list,((Opt_skewed_by_tableContext)_localctx).opt_on_skewed.res, ((Opt_skewed_by_tableContext)_localctx).opt_skewed_stored_as_directory.res);
				    
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

	public static class Opt_on_skewedContext extends ParserRuleContext {
		public vector<json> res;
		public Literal_valuesContext literal_values;
		public List<Literal_valuesContext> values_list = new ArrayList<Literal_valuesContext>();
		public TerminalNode T_ON() { return getToken(HiveParser.T_ON, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HiveParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HiveParser.T_OPEN_P, i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HiveParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HiveParser.T_CLOSE_P, i);
		}
		public List<Literal_valuesContext> literal_values() {
			return getRuleContexts(Literal_valuesContext.class);
		}
		public Literal_valuesContext literal_values(int i) {
			return getRuleContext(Literal_valuesContext.class,i);
		}
		public Opt_on_skewedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_on_skewed; }
	}

	public final Opt_on_skewedContext opt_on_skewed() throws RecognitionException {
		Opt_on_skewedContext _localctx = new Opt_on_skewedContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_opt_on_skewed);
		int _la;
		try {
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_on_skewedContext)_localctx).res =  vector<json>(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 vector<Literal_valuesContext*> values_list; 
				setState(584);
				match(T_ON);
				setState(585);
				match(T_OPEN_P);
				setState(586);
				((Opt_on_skewedContext)_localctx).literal_values = literal_values();
				((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(587);
					match(T_COMMA);
					setState(588);
					((Opt_on_skewedContext)_localctx).literal_values = literal_values();
					((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				match(T_CLOSE_P);

				        vector<json> values_json_list;
				        for(Literal_valuesContext* value_ctxt:((Opt_on_skewedContext)_localctx).values_list)
				            values_json_list.push_back(value_ctxt->res);
				        ((Opt_on_skewedContext)_localctx).res =  values_json_list;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 vector<Literal_valuesContext*> values_list; 
				setState(598);
				match(T_ON);
				setState(599);
				match(T_OPEN_P);
				setState(600);
				match(T_OPEN_P);
				setState(601);
				((Opt_on_skewedContext)_localctx).literal_values = literal_values();
				((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(602);
					match(T_COMMA);
					setState(603);
					((Opt_on_skewedContext)_localctx).literal_values = literal_values();
					((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
					}
					}
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(609);
				match(T_CLOSE_P);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(610);
					match(T_COMMA);
					setState(611);
					match(T_OPEN_P);
					setState(612);
					((Opt_on_skewedContext)_localctx).literal_values = literal_values();
					((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(613);
						match(T_COMMA);
						setState(614);
						((Opt_on_skewedContext)_localctx).literal_values = literal_values();
						((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
						}
						}
						setState(619);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(620);
					match(T_CLOSE_P);
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(627);
				match(T_CLOSE_P);

				        vector<json> values_json_list;
				        for(Literal_valuesContext* value_ctxt:((Opt_on_skewedContext)_localctx).values_list)
				            values_json_list.push_back(value_ctxt->res);
				        ((Opt_on_skewedContext)_localctx).res =  values_json_list;
				    
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

	public static class Opt_skewed_stored_as_directoryContext extends ParserRuleContext {
		public bool res;
		public TerminalNode T_STORED() { return getToken(HiveParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HiveParser.T_DIRECTORY, 0); }
		public Opt_skewed_stored_as_directoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_skewed_stored_as_directory; }
	}

	public final Opt_skewed_stored_as_directoryContext opt_skewed_stored_as_directory() throws RecognitionException {
		Opt_skewed_stored_as_directoryContext _localctx = new Opt_skewed_stored_as_directoryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_opt_skewed_stored_as_directory);
		try {
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_skewed_stored_as_directoryContext)_localctx).res =  false; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(T_STORED);
				setState(634);
				match(T_AS);
				setState(635);
				match(T_DIRECTORY);
				 ((Opt_skewed_stored_as_directoryContext)_localctx).res =  true; 
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

	public static class Opt_row_formatedContext extends ParserRuleContext {
		public json res;
		public Row_formatContext row_format;
		public TerminalNode T_ROW() { return getToken(HiveParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(HiveParser.T_FORMAT, 0); }
		public Row_formatContext row_format() {
			return getRuleContext(Row_formatContext.class,0);
		}
		public Opt_row_formatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_row_formated; }
	}

	public final Opt_row_formatedContext opt_row_formated() throws RecognitionException {
		Opt_row_formatedContext _localctx = new Opt_row_formatedContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_opt_row_formated);
		try {
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_LOCATION:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_row_formatedContext)_localctx).res =  json(); 
				}
				break;
			case T_ROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(T_ROW);
				setState(641);
				match(T_FORMAT);
				setState(642);
				((Opt_row_formatedContext)_localctx).row_format = row_format();
				 ((Opt_row_formatedContext)_localctx).res =  ((Opt_row_formatedContext)_localctx).row_format.res; 
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

	public static class Row_formatContext extends ParserRuleContext {
		public json res;
		public Opt_field_terminated_byContext opt_field_terminated_by;
		public Opt_collection_items_terminated_byContext opt_collection_items_terminated_by;
		public Opt_map_keys_terminated_byContext opt_map_keys_terminated_by;
		public Opt_lines_terminated_byContext opt_lines_terminated_by;
		public Opt_null_defined_asContext opt_null_defined_as;
		public Token STRING_LITERAL;
		public Opt_serde_propertiesContext opt_serde_properties;
		public TerminalNode T_DELIMITED() { return getToken(HiveParser.T_DELIMITED, 0); }
		public Opt_field_terminated_byContext opt_field_terminated_by() {
			return getRuleContext(Opt_field_terminated_byContext.class,0);
		}
		public Opt_collection_items_terminated_byContext opt_collection_items_terminated_by() {
			return getRuleContext(Opt_collection_items_terminated_byContext.class,0);
		}
		public Opt_map_keys_terminated_byContext opt_map_keys_terminated_by() {
			return getRuleContext(Opt_map_keys_terminated_byContext.class,0);
		}
		public Opt_lines_terminated_byContext opt_lines_terminated_by() {
			return getRuleContext(Opt_lines_terminated_byContext.class,0);
		}
		public Opt_null_defined_asContext opt_null_defined_as() {
			return getRuleContext(Opt_null_defined_asContext.class,0);
		}
		public TerminalNode T_SERDE() { return getToken(HiveParser.T_SERDE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Opt_serde_propertiesContext opt_serde_properties() {
			return getRuleContext(Opt_serde_propertiesContext.class,0);
		}
		public Row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_format; }
	}

	public final Row_formatContext row_format() throws RecognitionException {
		Row_formatContext _localctx = new Row_formatContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_row_format);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DELIMITED:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				match(T_DELIMITED);
				setState(648);
				((Row_formatContext)_localctx).opt_field_terminated_by = opt_field_terminated_by();
				setState(649);
				((Row_formatContext)_localctx).opt_collection_items_terminated_by = opt_collection_items_terminated_by();
				setState(650);
				((Row_formatContext)_localctx).opt_map_keys_terminated_by = opt_map_keys_terminated_by();
				setState(651);
				((Row_formatContext)_localctx).opt_lines_terminated_by = opt_lines_terminated_by();
				setState(652);
				((Row_formatContext)_localctx).opt_null_defined_as = opt_null_defined_as();
				 ((Row_formatContext)_localctx).res =  hql_row_format_delimited(((Row_formatContext)_localctx).opt_field_terminated_by.res, ((Row_formatContext)_localctx).opt_collection_items_terminated_by.res, ((Row_formatContext)_localctx).opt_map_keys_terminated_by.res, ((Row_formatContext)_localctx).opt_lines_terminated_by.res, ((Row_formatContext)_localctx).opt_null_defined_as.res); 
				}
				break;
			case T_SERDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				match(T_SERDE);
				setState(656);
				((Row_formatContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				setState(657);
				((Row_formatContext)_localctx).opt_serde_properties = opt_serde_properties();
				 ((Row_formatContext)_localctx).res =  hql_row_format_serde(remove_quotes((((Row_formatContext)_localctx).STRING_LITERAL!=null?((Row_formatContext)_localctx).STRING_LITERAL.getText():null)), ((Row_formatContext)_localctx).opt_serde_properties.res); 
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

	public static class Opt_field_terminated_byContext extends ParserRuleContext {
		public json res;
		public Token STRING_LITERAL;
		public Token delimiter;
		public Token escape;
		public TerminalNode T_FIELDS() { return getToken(HiveParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HiveParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(HiveParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(HiveParser.T_BY, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(HiveParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(HiveParser.STRING_LITERAL, i);
		}
		public TerminalNode T_ESCAPED() { return getToken(HiveParser.T_ESCAPED, 0); }
		public Opt_field_terminated_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_field_terminated_by; }
	}

	public final Opt_field_terminated_byContext opt_field_terminated_by() throws RecognitionException {
		Opt_field_terminated_byContext _localctx = new Opt_field_terminated_byContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_opt_field_terminated_by);
		try {
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_field_terminated_byContext)_localctx).res =  json(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(T_FIELDS);
				setState(664);
				match(T_TERMINATED);
				setState(665);
				match(T_BY);
				setState(666);
				((Opt_field_terminated_byContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Opt_field_terminated_byContext)_localctx).res =  remove_quotes((((Opt_field_terminated_byContext)_localctx).STRING_LITERAL!=null?((Opt_field_terminated_byContext)_localctx).STRING_LITERAL.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				match(T_FIELDS);
				setState(669);
				match(T_TERMINATED);
				setState(670);
				match(T_BY);
				setState(671);
				((Opt_field_terminated_byContext)_localctx).delimiter = match(STRING_LITERAL);
				setState(672);
				match(T_ESCAPED);
				setState(673);
				match(T_BY);
				setState(674);
				((Opt_field_terminated_byContext)_localctx).escape = match(STRING_LITERAL);
				 ((Opt_field_terminated_byContext)_localctx).res =  remove_quotes((((Opt_field_terminated_byContext)_localctx).delimiter!=null?((Opt_field_terminated_byContext)_localctx).delimiter.getText():null));
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

	public static class Opt_collection_items_terminated_byContext extends ParserRuleContext {
		public string res;
		public Token STRING_LITERAL;
		public TerminalNode T_COLLECTION() { return getToken(HiveParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(HiveParser.T_ITEMS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HiveParser.T_TERMINATED, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Opt_collection_items_terminated_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_collection_items_terminated_by; }
	}

	public final Opt_collection_items_terminated_byContext opt_collection_items_terminated_by() throws RecognitionException {
		Opt_collection_items_terminated_byContext _localctx = new Opt_collection_items_terminated_byContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_opt_collection_items_terminated_by);
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_LINES:
			case T_LOCATION:
			case T_MAP:
			case T_NULL:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_collection_items_terminated_byContext)_localctx).res =  string(); 
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				match(T_COLLECTION);
				setState(680);
				match(T_ITEMS);
				setState(681);
				match(T_TERMINATED);
				setState(682);
				match(T_BY);
				setState(683);
				((Opt_collection_items_terminated_byContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Opt_collection_items_terminated_byContext)_localctx).res =  remove_quotes((((Opt_collection_items_terminated_byContext)_localctx).STRING_LITERAL!=null?((Opt_collection_items_terminated_byContext)_localctx).STRING_LITERAL.getText():null));
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

	public static class Opt_map_keys_terminated_byContext extends ParserRuleContext {
		public string res;
		public Token STRING_LITERAL;
		public TerminalNode T_MAP() { return getToken(HiveParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(HiveParser.T_KEYS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HiveParser.T_TERMINATED, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Opt_map_keys_terminated_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_map_keys_terminated_by; }
	}

	public final Opt_map_keys_terminated_byContext opt_map_keys_terminated_by() throws RecognitionException {
		Opt_map_keys_terminated_byContext _localctx = new Opt_map_keys_terminated_byContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_opt_map_keys_terminated_by);
		try {
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_LINES:
			case T_LOCATION:
			case T_NULL:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_map_keys_terminated_byContext)_localctx).res =  string(); 
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				match(T_MAP);
				setState(689);
				match(T_KEYS);
				setState(690);
				match(T_TERMINATED);
				setState(691);
				match(T_BY);
				setState(692);
				((Opt_map_keys_terminated_byContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Opt_map_keys_terminated_byContext)_localctx).res =  remove_quotes((((Opt_map_keys_terminated_byContext)_localctx).STRING_LITERAL!=null?((Opt_map_keys_terminated_byContext)_localctx).STRING_LITERAL.getText():null));
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

	public static class Opt_lines_terminated_byContext extends ParserRuleContext {
		public string res;
		public Token STRING_LITERAL;
		public TerminalNode T_LINES() { return getToken(HiveParser.T_LINES, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HiveParser.T_TERMINATED, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Opt_lines_terminated_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_lines_terminated_by; }
	}

	public final Opt_lines_terminated_byContext opt_lines_terminated_by() throws RecognitionException {
		Opt_lines_terminated_byContext _localctx = new Opt_lines_terminated_byContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_opt_lines_terminated_by);
		try {
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_LOCATION:
			case T_NULL:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_lines_terminated_byContext)_localctx).res =  string(); 
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				match(T_LINES);
				setState(698);
				match(T_TERMINATED);
				setState(699);
				match(T_BY);
				setState(700);
				((Opt_lines_terminated_byContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Opt_lines_terminated_byContext)_localctx).res =  remove_quotes((((Opt_lines_terminated_byContext)_localctx).STRING_LITERAL!=null?((Opt_lines_terminated_byContext)_localctx).STRING_LITERAL.getText():null));
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

	public static class Opt_null_defined_asContext extends ParserRuleContext {
		public string res;
		public Token STRING_LITERAL;
		public TerminalNode T_NULL() { return getToken(HiveParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(HiveParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Opt_null_defined_asContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_null_defined_as; }
	}

	public final Opt_null_defined_asContext opt_null_defined_as() throws RecognitionException {
		Opt_null_defined_asContext _localctx = new Opt_null_defined_asContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_opt_null_defined_as);
		try {
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_LOCATION:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_null_defined_asContext)_localctx).res =  string(); 
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(T_NULL);
				setState(706);
				match(T_DEFINED);
				setState(707);
				match(T_AS);
				setState(708);
				((Opt_null_defined_asContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Opt_null_defined_asContext)_localctx).res =  remove_quotes((((Opt_null_defined_asContext)_localctx).STRING_LITERAL!=null?((Opt_null_defined_asContext)_localctx).STRING_LITERAL.getText():null));
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

	public static class Opt_serde_propertiesContext extends ParserRuleContext {
		public vector<json> res;
		public Serde_valContext serde_val;
		public List<Serde_valContext> opt_name_list = new ArrayList<Serde_valContext>();
		public List<Serde_valContext> opt_val_list = new ArrayList<Serde_valContext>();
		public TerminalNode T_WITH() { return getToken(HiveParser.T_WITH, 0); }
		public TerminalNode T_SERDEPROPERTIES() { return getToken(HiveParser.T_SERDEPROPERTIES, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<Serde_valContext> serde_val() {
			return getRuleContexts(Serde_valContext.class);
		}
		public Serde_valContext serde_val(int i) {
			return getRuleContext(Serde_valContext.class,i);
		}
		public Opt_serde_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_serde_properties; }
	}

	public final Opt_serde_propertiesContext opt_serde_properties() throws RecognitionException {
		Opt_serde_propertiesContext _localctx = new Opt_serde_propertiesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_opt_serde_properties);
		int _la;
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_LOCATION:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_serde_propertiesContext)_localctx).res =  vector<json>(); 
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				 vector<Serde_valContext*> opt_name_list, opt_val_list;  
				setState(714);
				match(T_WITH);
				setState(715);
				match(T_SERDEPROPERTIES);
				setState(716);
				match(T_OPEN_P);
				setState(717);
				((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
				((Opt_serde_propertiesContext)_localctx).opt_name_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
				setState(718);
				match(T_EQUAL);
				setState(719);
				((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
				((Opt_serde_propertiesContext)_localctx).opt_val_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(720);
					match(T_COMMA);
					setState(721);
					((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
					((Opt_serde_propertiesContext)_localctx).opt_name_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
					setState(722);
					match(T_EQUAL);
					setState(723);
					((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
					((Opt_serde_propertiesContext)_localctx).opt_val_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(730);
				match(T_CLOSE_P);

				        vector<json> serde_opt_json_list;
				        for(int i = 0 ; i < ((Opt_serde_propertiesContext)_localctx).opt_name_list.size() ; i++)
				        {
				            json tmp;
				            tmp[((Opt_serde_propertiesContext)_localctx).opt_name_list[i]->res] = ((Opt_serde_propertiesContext)_localctx).opt_val_list[i]->res;
				            serde_opt_json_list.push_back(tmp);
				        }
				        ((Opt_serde_propertiesContext)_localctx).res =  serde_opt_json_list;
				    
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

	public static class Serde_valContext extends ParserRuleContext {
		public string res;
		public Token STRING_LITERAL;
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Serde_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serde_val; }
	}

	public final Serde_valContext serde_val() throws RecognitionException {
		Serde_valContext _localctx = new Serde_valContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_serde_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			((Serde_valContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
			 ((Serde_valContext)_localctx).res =  remove_quotes((((Serde_valContext)_localctx).STRING_LITERAL!=null?((Serde_valContext)_localctx).STRING_LITERAL.getText():null)); 
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

	public static class Opt_stored_asContext extends ParserRuleContext {
		public json res;
		public File_formatContext file_format;
		public Token input_format;
		public Token output_format;
		public Token STRING_LITERAL;
		public Opt_serde_propertiesContext opt_serde_properties;
		public TerminalNode T_STORED() { return getToken(HiveParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public File_formatContext file_format() {
			return getRuleContext(File_formatContext.class,0);
		}
		public TerminalNode T_INPUTFORMAT() { return getToken(HiveParser.T_INPUTFORMAT, 0); }
		public TerminalNode T_OUTPUTFORMAT() { return getToken(HiveParser.T_OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(HiveParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(HiveParser.STRING_LITERAL, i);
		}
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public Opt_serde_propertiesContext opt_serde_properties() {
			return getRuleContext(Opt_serde_propertiesContext.class,0);
		}
		public Opt_stored_asContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_stored_as; }
	}

	public final Opt_stored_asContext opt_stored_as() throws RecognitionException {
		Opt_stored_asContext _localctx = new Opt_stored_asContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_opt_stored_as);
		try {
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_stored_asContext)_localctx).res =  json(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(T_STORED);
				setState(740);
				match(T_AS);
				setState(741);
				((Opt_stored_asContext)_localctx).file_format = file_format();
				 ((Opt_stored_asContext)_localctx).res =  hql_stored_as_file_format(((Opt_stored_asContext)_localctx).file_format.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				match(T_STORED);
				setState(745);
				match(T_AS);
				setState(746);
				match(T_INPUTFORMAT);
				setState(747);
				((Opt_stored_asContext)_localctx).input_format = match(STRING_LITERAL);
				setState(748);
				match(T_OUTPUTFORMAT);
				setState(749);
				((Opt_stored_asContext)_localctx).output_format = match(STRING_LITERAL);
				 ((Opt_stored_asContext)_localctx).res =  hql_stored_as_file_format((((Opt_stored_asContext)_localctx).input_format!=null?((Opt_stored_asContext)_localctx).input_format.getText():null), (((Opt_stored_asContext)_localctx).output_format!=null?((Opt_stored_asContext)_localctx).output_format.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				match(T_STORED);
				setState(752);
				match(T_BY);
				setState(753);
				((Opt_stored_asContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				setState(754);
				((Opt_stored_asContext)_localctx).opt_serde_properties = opt_serde_properties();
				 ((Opt_stored_asContext)_localctx).res =  hql_stored_by_serde(remove_quotes((((Opt_stored_asContext)_localctx).STRING_LITERAL!=null?((Opt_stored_asContext)_localctx).STRING_LITERAL.getText():null)), ((Opt_stored_asContext)_localctx).opt_serde_properties.res); 
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

	public static class Opt_locationContext extends ParserRuleContext {
		public string res;
		public Token STRING_LITERAL;
		public TerminalNode T_LOCATION() { return getToken(HiveParser.T_LOCATION, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Opt_locationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_location; }
	}

	public final Opt_locationContext opt_location() throws RecognitionException {
		Opt_locationContext _localctx = new Opt_locationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_opt_location);
		try {
			setState(763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_locationContext)_localctx).res =  string(); 
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				match(T_LOCATION);
				setState(761);
				((Opt_locationContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Opt_locationContext)_localctx).res =  remove_quotes((((Opt_locationContext)_localctx).STRING_LITERAL!=null?((Opt_locationContext)_localctx).STRING_LITERAL.getText():null)); 
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

	public static class Opt_table_propertiesContext extends ParserRuleContext {
		public vector<json> res;
		public Opt_table_valContext opt_table_val;
		public List<Opt_table_valContext> opt_name_list = new ArrayList<Opt_table_valContext>();
		public List<Opt_table_valContext> opt_val_list = new ArrayList<Opt_table_valContext>();
		public TerminalNode T_TBLPROPERTIES() { return getToken(HiveParser.T_TBLPROPERTIES, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<Opt_table_valContext> opt_table_val() {
			return getRuleContexts(Opt_table_valContext.class);
		}
		public Opt_table_valContext opt_table_val(int i) {
			return getRuleContext(Opt_table_valContext.class,i);
		}
		public Opt_table_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_table_properties; }
	}

	public final Opt_table_propertiesContext opt_table_properties() throws RecognitionException {
		Opt_table_propertiesContext _localctx = new Opt_table_propertiesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_opt_table_properties);
		try {
			setState(780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_table_propertiesContext)_localctx).res =  vector<json>(); 
				}
				break;
			case T_TBLPROPERTIES:
				enterOuterAlt(_localctx, 2);
				{
				 vector<Opt_table_valContext*> opt_name_list, opt_val_list; 
				setState(767);
				match(T_TBLPROPERTIES);
				setState(768);
				match(T_OPEN_P);
				setState(769);
				((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
				((Opt_table_propertiesContext)_localctx).opt_name_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
				setState(770);
				match(T_EQUAL);
				setState(771);
				((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
				((Opt_table_propertiesContext)_localctx).opt_val_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
				{
				setState(772);
				match(T_COMMA);
				setState(773);
				((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
				((Opt_table_propertiesContext)_localctx).opt_name_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
				setState(774);
				match(T_EQUAL);
				setState(775);
				((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
				((Opt_table_propertiesContext)_localctx).opt_val_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
				}
				setState(777);
				match(T_CLOSE_P);

				        vector<json> table_option_json_list;
				        for(int i = 0 ; i < ((Opt_table_propertiesContext)_localctx).opt_name_list.size() ; i++) 
				        {
				            json tmp;
				            tmp[((Opt_table_propertiesContext)_localctx).opt_name_list[i]->res] = ((Opt_table_propertiesContext)_localctx).opt_val_list[i]->res;
				            table_option_json_list.push_back(tmp);
				        }
				        ((Opt_table_propertiesContext)_localctx).res =  table_option_json_list;
				    
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

	public static class Opt_table_valContext extends ParserRuleContext {
		public string res;
		public Token STRING_LITERAL;
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public Opt_table_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_table_val; }
	}

	public final Opt_table_valContext opt_table_val() throws RecognitionException {
		Opt_table_valContext _localctx = new Opt_table_valContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_opt_table_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			((Opt_table_valContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
			 ((Opt_table_valContext)_localctx).res =  remove_quotes((((Opt_table_valContext)_localctx).STRING_LITERAL!=null?((Opt_table_valContext)_localctx).STRING_LITERAL.getText():null)); 
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

	public static class Opt_as_selectContext extends ParserRuleContext {
		public json res;
		public Select_stmtContext select_stmt;
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Opt_as_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_as_select; }
	}

	public final Opt_as_selectContext opt_as_select() throws RecognitionException {
		Opt_as_selectContext _localctx = new Opt_as_selectContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_opt_as_select);
		try {
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_as_selectContext)_localctx).res =  json(); 
				}
				break;
			case T_AS:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				match(T_AS);
				setState(787);
				((Opt_as_selectContext)_localctx).select_stmt = select_stmt();
				 ((Opt_as_selectContext)_localctx).res =  ((Opt_as_selectContext)_localctx).select_stmt.res; 
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

	public static class File_formatContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_SEQUENCEFILE() { return getToken(HiveParser.T_SEQUENCEFILE, 0); }
		public TerminalNode T_TEXTFILE() { return getToken(HiveParser.T_TEXTFILE, 0); }
		public TerminalNode T_RCFILE() { return getToken(HiveParser.T_RCFILE, 0); }
		public TerminalNode T_ORC() { return getToken(HiveParser.T_ORC, 0); }
		public TerminalNode T_PARQUET() { return getToken(HiveParser.T_PARQUET, 0); }
		public TerminalNode T_AVRO() { return getToken(HiveParser.T_AVRO, 0); }
		public TerminalNode T_JSONFILE() { return getToken(HiveParser.T_JSONFILE, 0); }
		public File_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_format; }
	}

	public final File_formatContext file_format() throws RecognitionException {
		File_formatContext _localctx = new File_formatContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_file_format);
		try {
			setState(806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEQUENCEFILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				match(T_SEQUENCEFILE);
				 ((File_formatContext)_localctx).res =  "SEQUENCEFILE"; 
				}
				break;
			case T_TEXTFILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				match(T_TEXTFILE);
				 ((File_formatContext)_localctx).res =  "TEXTFILE"; 
				}
				break;
			case T_RCFILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(796);
				match(T_RCFILE);
				 ((File_formatContext)_localctx).res =  "RCFILE"; 
				}
				break;
			case T_ORC:
				enterOuterAlt(_localctx, 4);
				{
				setState(798);
				match(T_ORC);
				 ((File_formatContext)_localctx).res =  "ORC"; 
				}
				break;
			case T_PARQUET:
				enterOuterAlt(_localctx, 5);
				{
				setState(800);
				match(T_PARQUET);
				 ((File_formatContext)_localctx).res =  "PARQUET"; 
				}
				break;
			case T_AVRO:
				enterOuterAlt(_localctx, 6);
				{
				setState(802);
				match(T_AVRO);
				 ((File_formatContext)_localctx).res =  "AVRO"; 
				}
				break;
			case T_JSONFILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(804);
				match(T_JSONFILE);
				 ((File_formatContext)_localctx).res =  "JSONFILE"; 
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

	public static class Column_definitionContext extends ParserRuleContext {
		public json res;
		public Column_identifierContext column_identifier;
		public Data_typeContext data_type;
		public Token STRING_LITERAL;
		public Column_constraintContext column_constraint;
		public List<Column_constraintContext> constraint_list = new ArrayList<Column_constraintContext>();
		public Column_identifierContext column_identifier() {
			return getRuleContext(Column_identifierContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode T_COMMENT() { return getToken(HiveParser.T_COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveParser.STRING_LITERAL, 0); }
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_column_definition);
		int _la;
		try {
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(809);
				((Column_definitionContext)_localctx).data_type = data_type();
				 ((Column_definitionContext)_localctx).res =  hql_column_definition(((Column_definitionContext)_localctx).column_identifier.res, ((Column_definitionContext)_localctx).data_type.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(813);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(814);
				match(T_COMMENT);
				setState(815);
				((Column_definitionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Column_definitionContext)_localctx).res =  hql_column_definition(((Column_definitionContext)_localctx).column_identifier.res, ((Column_definitionContext)_localctx).data_type.res, (((Column_definitionContext)_localctx).STRING_LITERAL!=null?((Column_definitionContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				vector<Column_constraintContext*> constraint_list; 
				setState(819);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(820);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(822); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(821);
					((Column_definitionContext)_localctx).column_constraint = column_constraint();
					((Column_definitionContext)_localctx).constraint_list.add(((Column_definitionContext)_localctx).column_constraint);
					}
					}
					setState(824); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_CHECK || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (T_DEFAULT - 110)) | (1L << (T_DISABLE - 110)) | (1L << (T_ENABLE - 110)))) != 0) || ((((_la - 283)) & ~0x3f) == 0 && ((1L << (_la - 283)) & ((1L << (T_NORELY - 283)) | (1L << (T_NOT - 283)) | (1L << (T_NOVALIDATE - 283)) | (1L << (T_PRIMARY - 283)))) != 0) || _la==T_RELY || _la==T_UNIQUE );
				setState(826);
				match(T_COMMENT);
				setState(827);
				((Column_definitionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 
				        vector<json> constraint_json_list;
				        for(Column_constraintContext* cons:((Column_definitionContext)_localctx).constraint_list)
				        {
				            constraint_json_list.push_back(cons->res);
				        }
				        ((Column_definitionContext)_localctx).res =  hql_column_definition(((Column_definitionContext)_localctx).column_identifier.res, ((Column_definitionContext)_localctx).data_type.res, constraint_json_list, (((Column_definitionContext)_localctx).STRING_LITERAL!=null?((Column_definitionContext)_localctx).STRING_LITERAL.getText():null));
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				vector<Column_constraintContext*> constraint_list; 
				setState(831);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(832);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(834); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(833);
					((Column_definitionContext)_localctx).column_constraint = column_constraint();
					((Column_definitionContext)_localctx).constraint_list.add(((Column_definitionContext)_localctx).column_constraint);
					}
					}
					setState(836); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_CHECK || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (T_DEFAULT - 110)) | (1L << (T_DISABLE - 110)) | (1L << (T_ENABLE - 110)))) != 0) || ((((_la - 283)) & ~0x3f) == 0 && ((1L << (_la - 283)) & ((1L << (T_NORELY - 283)) | (1L << (T_NOT - 283)) | (1L << (T_NOVALIDATE - 283)) | (1L << (T_PRIMARY - 283)))) != 0) || _la==T_RELY || _la==T_UNIQUE );
				 
				        vector<json> constraint_json_list;
				        for(Column_constraintContext* cons:((Column_definitionContext)_localctx).constraint_list)
				        {
				            constraint_json_list.push_back(cons->res);
				        }
				        ((Column_definitionContext)_localctx).res =  hql_column_definition(((Column_definitionContext)_localctx).column_identifier.res, ((Column_definitionContext)_localctx).data_type.res, constraint_json_list);
				    
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

	public static class Column_constraintContext extends ParserRuleContext {
		public json res;
		public Default_valueContext default_value;
		public ExprContext expr;
		public TerminalNode T_PRIMARY() { return getToken(HiveParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HiveParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HiveParser.T_UNIQUE, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public TerminalNode T_NULL() { return getToken(HiveParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HiveParser.T_DEFAULT, 0); }
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public TerminalNode T_CHECK() { return getToken(HiveParser.T_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_ENABLE() { return getToken(HiveParser.T_ENABLE, 0); }
		public TerminalNode T_DISABLE() { return getToken(HiveParser.T_DISABLE, 0); }
		public TerminalNode T_NOVALIDATE() { return getToken(HiveParser.T_NOVALIDATE, 0); }
		public TerminalNode T_RELY() { return getToken(HiveParser.T_RELY, 0); }
		public TerminalNode T_NORELY() { return getToken(HiveParser.T_NORELY, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_column_constraint);
		try {
			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				match(T_PRIMARY);
				setState(843);
				match(T_KEY);
				 ((Column_constraintContext)_localctx).res =  json({"primary_key", true}); 
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				match(T_UNIQUE);
				 ((Column_constraintContext)_localctx).res =  json({"unique", true}); 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(847);
				match(T_NOT);
				setState(848);
				match(T_NULL);
				 ((Column_constraintContext)_localctx).res =  json({"not_null", true}); 
				}
				break;
			case T_DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(850);
				match(T_DEFAULT);
				setState(851);
				((Column_constraintContext)_localctx).default_value = default_value();
				 ((Column_constraintContext)_localctx).res =  json({"default_value", ((Column_constraintContext)_localctx).default_value.res}); 
				}
				break;
			case T_CHECK:
				enterOuterAlt(_localctx, 5);
				{
				setState(854);
				match(T_CHECK);
				setState(855);
				((Column_constraintContext)_localctx).expr = expr(0);
				 ((Column_constraintContext)_localctx).res =  json({"check", ((Column_constraintContext)_localctx).expr.res}); 
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(858);
				match(T_ENABLE);
				 ((Column_constraintContext)_localctx).res =  json({"enable", true}); 
				}
				break;
			case T_DISABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(860);
				match(T_DISABLE);
				 ((Column_constraintContext)_localctx).res =  json({"enable", false}); 
				}
				break;
			case T_NOVALIDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(862);
				match(T_NOVALIDATE);
				 ((Column_constraintContext)_localctx).res =  json({"novalidate", true}); 
				}
				break;
			case T_RELY:
				enterOuterAlt(_localctx, 9);
				{
				setState(864);
				match(T_RELY);
				 ((Column_constraintContext)_localctx).res =  json({"rely", true}); 
				}
				break;
			case T_NORELY:
				enterOuterAlt(_localctx, 10);
				{
				setState(866);
				match(T_NORELY);
				 ((Column_constraintContext)_localctx).res =  json({"norely", true}); 
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

	public static class Default_valueContext extends ParserRuleContext {
		public json res;
		public Literal_valuesContext literal_values() {
			return getRuleContext(Literal_valuesContext.class,0);
		}
		public TerminalNode T_CURRENT_USER() { return getToken(HiveParser.T_CURRENT_USER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HiveParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HiveParser.T_CURRENT_TIMESTAMP, 0); }
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_default_value);
		try {
			setState(880);
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
				setState(870);
				literal_values();
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				match(T_CURRENT_USER);
				setState(872);
				match(T_OPEN_P);
				setState(873);
				match(T_CLOSE_P);
				}
				break;
			case T_CURRENT_DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(874);
				match(T_CURRENT_DATE);
				setState(875);
				match(T_OPEN_P);
				setState(876);
				match(T_CLOSE_P);
				}
				break;
			case T_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(877);
				match(T_CURRENT_TIMESTAMP);
				setState(878);
				match(T_OPEN_P);
				setState(879);
				match(T_CLOSE_P);
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

	public static class Constraint_specificationContext extends ParserRuleContext {
		public json res;
		public Column_identifierContext column_identifier;
		public List<Column_identifierContext> column_list = new ArrayList<Column_identifierContext>();
		public Opt_constraint_disableContext opt_constraint_disable;
		public Opt_constraint_novalidateContext opt_constraint_novalidate;
		public Opt_constraint_rely_no_relyContext opt_constraint_rely_no_rely;
		public Tab_identContext tab_ident;
		public List<Column_identifierContext> ref_column_list = new ArrayList<Column_identifierContext>();
		public ExprContext expr;
		public Opt_constraint_enable_disableContext opt_constraint_enable_disable;
		public TerminalNode T_PRIMARY() { return getToken(HiveParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HiveParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HiveParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HiveParser.T_OPEN_P, i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HiveParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HiveParser.T_CLOSE_P, i);
		}
		public Opt_constraint_disableContext opt_constraint_disable() {
			return getRuleContext(Opt_constraint_disableContext.class,0);
		}
		public Opt_constraint_novalidateContext opt_constraint_novalidate() {
			return getRuleContext(Opt_constraint_novalidateContext.class,0);
		}
		public Opt_constraint_rely_no_relyContext opt_constraint_rely_no_rely() {
			return getRuleContext(Opt_constraint_rely_no_relyContext.class,0);
		}
		public List<Column_identifierContext> column_identifier() {
			return getRuleContexts(Column_identifierContext.class);
		}
		public Column_identifierContext column_identifier(int i) {
			return getRuleContext(Column_identifierContext.class,i);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HiveParser.T_CONSTRAINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HiveParser.IDENTIFIER, 0); }
		public TerminalNode T_FOREIGN() { return getToken(HiveParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HiveParser.T_REFERENCES, 0); }
		public Tab_identContext tab_ident() {
			return getRuleContext(Tab_identContext.class,0);
		}
		public TerminalNode T_UNIQUE() { return getToken(HiveParser.T_UNIQUE, 0); }
		public TerminalNode T_CHECK() { return getToken(HiveParser.T_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Opt_constraint_enable_disableContext opt_constraint_enable_disable() {
			return getRuleContext(Opt_constraint_enable_disableContext.class,0);
		}
		public Constraint_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint_specification; }
	}

	public final Constraint_specificationContext constraint_specification() throws RecognitionException {
		Constraint_specificationContext _localctx = new Constraint_specificationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constraint_specification);
		int _la;
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				vector<Column_identifierContext*> column_list; 
				setState(883);
				match(T_PRIMARY);
				setState(884);
				match(T_KEY);
				setState(885);
				match(T_OPEN_P);
				setState(886);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(887);
					match(T_COMMA);
					setState(888);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(893);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(894);
				match(T_CLOSE_P);
				setState(895);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(896);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(897);
				((Constraint_specificationContext)_localctx).opt_constraint_rely_no_rely = opt_constraint_rely_no_rely();

				        vector<string> column_str_list;
				        for(Column_identifierContext* c_ctxt: ((Constraint_specificationContext)_localctx).column_list) {
				            column_str_list.push_back(c_ctxt->res); }
				        ((Constraint_specificationContext)_localctx).res =  hql_primary_key_constraint(column_str_list, ((Constraint_specificationContext)_localctx).opt_constraint_disable.res, ((Constraint_specificationContext)_localctx).opt_constraint_novalidate.res, ((Constraint_specificationContext)_localctx).opt_constraint_rely_no_rely.res);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 vector<Column_identifierContext*> column_list; vector<Column_identifierContext*> ref_column_list; 
				setState(901);
				match(T_CONSTRAINT);
				setState(902);
				match(IDENTIFIER);
				setState(903);
				match(T_FOREIGN);
				setState(904);
				match(T_KEY);
				setState(905);
				match(T_OPEN_P);
				setState(906);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(907);
					match(T_COMMA);
					setState(908);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(913);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(914);
				match(T_CLOSE_P);
				setState(915);
				match(T_REFERENCES);
				setState(916);
				((Constraint_specificationContext)_localctx).tab_ident = tab_ident();
				setState(917);
				match(T_OPEN_P);
				setState(918);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).ref_column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(919);
					match(T_COMMA);
					setState(920);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).ref_column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(926);
				match(T_CLOSE_P);
				setState(927);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(928);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();

				        vector<string> column_str_list; vector<string> ref_column_str_list;
				        for(Column_identifierContext* c_ctxt: ((Constraint_specificationContext)_localctx).column_list) {
				            column_str_list.push_back(c_ctxt->res); }
				        for(Column_identifierContext* c_ctxt: ((Constraint_specificationContext)_localctx).ref_column_list) {
				            ref_column_str_list.push_back(c_ctxt->res); }
				        ((Constraint_specificationContext)_localctx).res =  hql_foreign_key_constraint(column_str_list, ((Constraint_specificationContext)_localctx).tab_ident.res, ref_column_str_list, ((Constraint_specificationContext)_localctx).opt_constraint_disable.res, ((Constraint_specificationContext)_localctx).opt_constraint_novalidate.res);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				vector<Column_identifierContext*> column_list; 
				setState(932);
				match(T_CONSTRAINT);
				setState(933);
				match(IDENTIFIER);
				setState(934);
				match(T_UNIQUE);
				setState(935);
				match(T_OPEN_P);
				setState(936);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(937);
					match(T_COMMA);
					setState(938);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(944);
				match(T_CLOSE_P);
				setState(945);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(946);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(947);
				((Constraint_specificationContext)_localctx).opt_constraint_rely_no_rely = opt_constraint_rely_no_rely();

				        vector<string> column_str_list;
				        for(Column_identifierContext* c_ctxt: ((Constraint_specificationContext)_localctx).column_list) {
				            column_str_list.push_back(c_ctxt->res); }
				        ((Constraint_specificationContext)_localctx).res =  hql_unique_constraint(column_str_list, ((Constraint_specificationContext)_localctx).opt_constraint_disable.res, ((Constraint_specificationContext)_localctx).opt_constraint_novalidate.res, ((Constraint_specificationContext)_localctx).opt_constraint_rely_no_rely.res);
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(950);
				match(T_CONSTRAINT);
				setState(951);
				match(IDENTIFIER);
				setState(952);
				match(T_CHECK);
				setState(953);
				((Constraint_specificationContext)_localctx).expr = expr(0);
				setState(954);
				((Constraint_specificationContext)_localctx).opt_constraint_enable_disable = opt_constraint_enable_disable();
				setState(955);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(956);
				((Constraint_specificationContext)_localctx).opt_constraint_rely_no_rely = opt_constraint_rely_no_rely();
				 ((Constraint_specificationContext)_localctx).res =  hql_check_constraint(((Constraint_specificationContext)_localctx).expr.res,  ((Constraint_specificationContext)_localctx).opt_constraint_enable_disable.res, ((Constraint_specificationContext)_localctx).opt_constraint_novalidate.res, ((Constraint_specificationContext)_localctx).opt_constraint_rely_no_rely.res); 
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

	public static class Opt_constraint_enable_disableContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_ENABLE() { return getToken(HiveParser.T_ENABLE, 0); }
		public TerminalNode T_DISABLE() { return getToken(HiveParser.T_DISABLE, 0); }
		public Opt_constraint_enable_disableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_constraint_enable_disable; }
	}

	public final Opt_constraint_enable_disableContext opt_constraint_enable_disable() throws RecognitionException {
		Opt_constraint_enable_disableContext _localctx = new Opt_constraint_enable_disableContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_opt_constraint_enable_disable);
		try {
			setState(966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_CONSTRAINT:
			case T_LOCATION:
			case T_NORELY:
			case T_NOVALIDATE:
			case T_PARTITIONED:
			case T_PRIMARY:
			case T_RELY:
			case T_ROW:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_constraint_enable_disableContext)_localctx).res =  "ENABLE"; 
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(962);
				match(T_ENABLE);
				 ((Opt_constraint_enable_disableContext)_localctx).res =  "ENABLE"; 
				}
				break;
			case T_DISABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(964);
				match(T_DISABLE);
				 ((Opt_constraint_enable_disableContext)_localctx).res =  "DISABLE"; 
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

	public static class Opt_constraint_enableContext extends ParserRuleContext {
		public bool res;
		public TerminalNode T_ENABLE() { return getToken(HiveParser.T_ENABLE, 0); }
		public Opt_constraint_enableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_constraint_enable; }
	}

	public final Opt_constraint_enableContext opt_constraint_enable() throws RecognitionException {
		Opt_constraint_enableContext _localctx = new Opt_constraint_enableContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_opt_constraint_enable);
		try {
			setState(971);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_constraint_enableContext)_localctx).res =  false; 
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				match(T_ENABLE);
				 ((Opt_constraint_enableContext)_localctx).res =  true; 
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

	public static class Opt_constraint_disableContext extends ParserRuleContext {
		public bool res;
		public TerminalNode T_DISABLE() { return getToken(HiveParser.T_DISABLE, 0); }
		public Opt_constraint_disableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_constraint_disable; }
	}

	public final Opt_constraint_disableContext opt_constraint_disable() throws RecognitionException {
		Opt_constraint_disableContext _localctx = new Opt_constraint_disableContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_opt_constraint_disable);
		try {
			setState(976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_CONSTRAINT:
			case T_LOCATION:
			case T_NORELY:
			case T_NOVALIDATE:
			case T_PARTITIONED:
			case T_PRIMARY:
			case T_RELY:
			case T_ROW:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_constraint_disableContext)_localctx).res =  false; 
				}
				break;
			case T_DISABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				match(T_DISABLE);
				 ((Opt_constraint_disableContext)_localctx).res =  true; 
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

	public static class Opt_constraint_novalidateContext extends ParserRuleContext {
		public bool res;
		public TerminalNode T_NOVALIDATE() { return getToken(HiveParser.T_NOVALIDATE, 0); }
		public Opt_constraint_novalidateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_constraint_novalidate; }
	}

	public final Opt_constraint_novalidateContext opt_constraint_novalidate() throws RecognitionException {
		Opt_constraint_novalidateContext _localctx = new Opt_constraint_novalidateContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_opt_constraint_novalidate);
		try {
			setState(981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_CONSTRAINT:
			case T_LOCATION:
			case T_NORELY:
			case T_PARTITIONED:
			case T_PRIMARY:
			case T_RELY:
			case T_ROW:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_constraint_novalidateContext)_localctx).res =  false; 
				}
				break;
			case T_NOVALIDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				match(T_NOVALIDATE);
				 ((Opt_constraint_novalidateContext)_localctx).res =  true; 
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

	public static class Opt_constraint_rely_no_relyContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_RELY() { return getToken(HiveParser.T_RELY, 0); }
		public TerminalNode T_NORELY() { return getToken(HiveParser.T_NORELY, 0); }
		public Opt_constraint_rely_no_relyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_constraint_rely_no_rely; }
	}

	public final Opt_constraint_rely_no_relyContext opt_constraint_rely_no_rely() throws RecognitionException {
		Opt_constraint_rely_no_relyContext _localctx = new Opt_constraint_rely_no_relyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_opt_constraint_rely_no_rely);
		try {
			setState(988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_CONSTRAINT:
			case T_LOCATION:
			case T_PARTITIONED:
			case T_PRIMARY:
			case T_ROW:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_constraint_rely_no_relyContext)_localctx).res =  string(); 
				}
				break;
			case T_RELY:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				match(T_RELY);
				 ((Opt_constraint_rely_no_relyContext)_localctx).res =  "RELY"; 
				}
				break;
			case T_NORELY:
				enterOuterAlt(_localctx, 3);
				{
				setState(986);
				match(T_NORELY);
				 ((Opt_constraint_rely_no_relyContext)_localctx).res =  "NORELY"; 
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

	public static class Opt_if_not_exists_flagContext extends ParserRuleContext {
		public bool res;
		public TerminalNode T_IF() { return getToken(HiveParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HiveParser.T_EXISTS, 0); }
		public Opt_if_not_exists_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_if_not_exists_flag; }
	}

	public final Opt_if_not_exists_flagContext opt_if_not_exists_flag() throws RecognitionException {
		Opt_if_not_exists_flagContext _localctx = new Opt_if_not_exists_flagContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_opt_if_not_exists_flag);
		try {
			setState(995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_if_not_exists_flagContext)_localctx).res =  false; 
				}
				break;
			case T_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				match(T_IF);
				setState(992);
				match(T_NOT);
				setState(993);
				match(T_EXISTS);
				 ((Opt_if_not_exists_flagContext)_localctx).res =  true; 
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

	public static class Opt_if_existsContext extends ParserRuleContext {
		public bool res;
		public TerminalNode T_IF() { return getToken(HiveParser.T_IF, 0); }
		public TerminalNode T_EXISTS() { return getToken(HiveParser.T_EXISTS, 0); }
		public Opt_if_existsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_if_exists; }
	}

	public final Opt_if_existsContext opt_if_exists() throws RecognitionException {
		Opt_if_existsContext _localctx = new Opt_if_existsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_opt_if_exists);
		try {
			setState(1001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_if_existsContext)_localctx).res =  false; 
				}
				break;
			case T_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				match(T_IF);
				setState(999);
				match(T_EXISTS);
				 ((Opt_if_existsContext)_localctx).res =  true; 
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

	public static class Table_typeContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_EXTERNAL() { return getToken(HiveParser.T_EXTERNAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HiveParser.T_TEMPORARY, 0); }
		public Table_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_type; }
	}

	public final Table_typeContext table_type() throws RecognitionException {
		Table_typeContext _localctx = new Table_typeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_table_type);
		try {
			setState(1008);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_TABLE:
				enterOuterAlt(_localctx, 1);
				{
				 ((Table_typeContext)_localctx).res =  "MANAGED"; 
				}
				break;
			case T_EXTERNAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				match(T_EXTERNAL);
				 ((Table_typeContext)_localctx).res =  "EXTERNAL"; 
				}
				break;
			case T_TEMPORARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1006);
				match(T_TEMPORARY);
				 ((Table_typeContext)_localctx).res =  "TEMPORARY"; 
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

	public static class Query_stmtContext extends ParserRuleContext {
		public json res;
		public Select_stmtContext select_stmt;
		public Select_union_stmtContext select_union_stmt;
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Select_union_stmtContext select_union_stmt() {
			return getRuleContext(Select_union_stmtContext.class,0);
		}
		public Query_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_stmt; }
	}

	public final Query_stmtContext query_stmt() throws RecognitionException {
		Query_stmtContext _localctx = new Query_stmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_query_stmt);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				((Query_stmtContext)_localctx).select_stmt = select_stmt();
				 ((Query_stmtContext)_localctx).res =  ((Query_stmtContext)_localctx).select_stmt.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				((Query_stmtContext)_localctx).select_union_stmt = select_union_stmt();
				 ((Query_stmtContext)_localctx).res =  ((Query_stmtContext)_localctx).select_union_stmt.res; 
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

	public static class Select_union_stmtContext extends ParserRuleContext {
		public json res;
		public Select_stmtContext base_select;
		public Select_union_typeContext select_union_type;
		public List<Select_union_typeContext> union_type_list = new ArrayList<Select_union_typeContext>();
		public Select_stmtContext select_stmt;
		public List<Select_stmtContext> select_stmt_list = new ArrayList<Select_stmtContext>();
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> T_UNION() { return getTokens(HiveParser.T_UNION); }
		public TerminalNode T_UNION(int i) {
			return getToken(HiveParser.T_UNION, i);
		}
		public List<Select_union_typeContext> select_union_type() {
			return getRuleContexts(Select_union_typeContext.class);
		}
		public Select_union_typeContext select_union_type(int i) {
			return getRuleContext(Select_union_typeContext.class,i);
		}
		public Select_union_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_union_stmt; }
	}

	public final Select_union_stmtContext select_union_stmt() throws RecognitionException {
		Select_union_stmtContext _localctx = new Select_union_stmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_select_union_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			vector<Select_union_typeContext*> union_type_list; vector<Select_stmtContext*> select_stmt_list; 
			setState(1019);
			((Select_union_stmtContext)_localctx).base_select = select_stmt();
			setState(1024); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1020);
				match(T_UNION);
				setState(1021);
				((Select_union_stmtContext)_localctx).select_union_type = select_union_type();
				((Select_union_stmtContext)_localctx).union_type_list.add(((Select_union_stmtContext)_localctx).select_union_type);
				setState(1022);
				((Select_union_stmtContext)_localctx).select_stmt = select_stmt();
				((Select_union_stmtContext)_localctx).select_stmt_list.add(((Select_union_stmtContext)_localctx).select_stmt);
				}
				}
				setState(1026); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_UNION );

			        vector<json> select_union_json_list;
			        for(int i = 0 ; i < ((Select_union_stmtContext)_localctx).union_type_list.size() ; i++)
			        {
			            json tmp;
			            tmp["union_type"] = ((Select_union_stmtContext)_localctx).union_type_list[i]->res;
			            tmp["select_stmt"] = ((Select_union_stmtContext)_localctx).select_stmt_list[i]->res;
			            select_union_json_list.push_back(tmp);
			        }
			        ((Select_union_stmtContext)_localctx).res =  hql_select_union_stmt(((Select_union_stmtContext)_localctx).base_select.res, select_union_json_list);
			    
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

	public static class Select_union_typeContext extends ParserRuleContext {
		public string res;
		public TerminalNode T_ALL() { return getToken(HiveParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HiveParser.T_DISTINCT, 0); }
		public Select_union_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_union_type; }
	}

	public final Select_union_typeContext select_union_type() throws RecognitionException {
		Select_union_typeContext _localctx = new Select_union_typeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_select_union_type);
		try {
			setState(1035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				 ((Select_union_typeContext)_localctx).res =  "DISTINCT"; 
				}
				break;
			case T_ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				match(T_ALL);
				 ((Select_union_typeContext)_localctx).res =  "ALL"; 
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1033);
				match(T_DISTINCT);
				 ((Select_union_typeContext)_localctx).res =  "DISTINCT"; 
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

	public static class Select_stmtContext extends ParserRuleContext {
		public json res;
		public Select_all_distinctContext select_all_distinct;
		public Select_expr_listContext select_expr_list;
		public Tab_generate_funcContext tab_generate_func;
		public Table_referenceContext table_reference;
		public Opt_lateral_view_exprContext opt_lateral_view_expr;
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
		public Opt_lateral_view_exprContext opt_lateral_view_expr() {
			return getRuleContext(Opt_lateral_view_exprContext.class,0);
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
		enterRule(_localctx, 118, RULE_select_stmt);
		try {
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037);
				match(T_SELECT);
				setState(1038);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1039);
				((Select_stmtContext)_localctx).select_expr_list = select_expr_list();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).select_expr_list.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				match(T_SELECT);
				setState(1043);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1044);
				((Select_stmtContext)_localctx).tab_generate_func = tab_generate_func();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).tab_generate_func.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1047);
				match(T_SELECT);
				setState(1048);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1049);
				((Select_stmtContext)_localctx).select_expr_list = select_expr_list();
				setState(1050);
				match(T_FROM);
				setState(1051);
				((Select_stmtContext)_localctx).table_reference = table_reference();
				setState(1052);
				((Select_stmtContext)_localctx).opt_lateral_view_expr = opt_lateral_view_expr();
				setState(1053);
				((Select_stmtContext)_localctx).opt_where_expr = opt_where_expr();
				setState(1054);
				((Select_stmtContext)_localctx).opt_group_by_list = opt_group_by_list();
				setState(1055);
				((Select_stmtContext)_localctx).opt_having_expr = opt_having_expr();
				setState(1056);
				((Select_stmtContext)_localctx).opt_order_by_list = opt_order_by_list();
				setState(1057);
				((Select_stmtContext)_localctx).opt_limit = opt_limit();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).select_expr_list.res, ((Select_stmtContext)_localctx).table_reference.res, ((Select_stmtContext)_localctx).opt_lateral_view_expr.res, ((Select_stmtContext)_localctx).opt_where_expr.res, ((Select_stmtContext)_localctx).opt_group_by_list.res, ((Select_stmtContext)_localctx).opt_having_expr.res, ((Select_stmtContext)_localctx).opt_order_by_list.res, ((Select_stmtContext)_localctx).opt_limit.res); 
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

	public static class Opt_lateral_view_exprContext extends ParserRuleContext {
		public json res;
		public Tab_generate_funcContext tab_generate_func;
		public Column_identifierContext tab_alias;
		public Column_identifierContext column_identifier;
		public List<Column_identifierContext> column_alias_list = new ArrayList<Column_identifierContext>();
		public TerminalNode T_LATERAL() { return getToken(HiveParser.T_LATERAL, 0); }
		public TerminalNode T_VIEW() { return getToken(HiveParser.T_VIEW, 0); }
		public Tab_generate_funcContext tab_generate_func() {
			return getRuleContext(Tab_generate_funcContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public List<Column_identifierContext> column_identifier() {
			return getRuleContexts(Column_identifierContext.class);
		}
		public Column_identifierContext column_identifier(int i) {
			return getRuleContext(Column_identifierContext.class,i);
		}
		public Opt_lateral_view_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_lateral_view_expr; }
	}

	public final Opt_lateral_view_exprContext opt_lateral_view_expr() throws RecognitionException {
		Opt_lateral_view_exprContext _localctx = new Opt_lateral_view_exprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_opt_lateral_view_expr);
		int _la;
		try {
			setState(1079);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_GROUP:
			case T_HAVING:
			case T_LIMIT:
			case T_ORDER:
			case T_UNION:
			case T_WHERE:
			case T_CLOSE_P:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_lateral_view_exprContext)_localctx).res =  json(); 
				}
				break;
			case T_LATERAL:
				enterOuterAlt(_localctx, 2);
				{
				 vector<Column_identifierContext*> column_alias_list; 
				setState(1064);
				match(T_LATERAL);
				setState(1065);
				match(T_VIEW);
				setState(1066);
				((Opt_lateral_view_exprContext)_localctx).tab_generate_func = tab_generate_func();
				setState(1067);
				((Opt_lateral_view_exprContext)_localctx).tab_alias = column_identifier();
				setState(1068);
				match(T_AS);
				setState(1069);
				((Opt_lateral_view_exprContext)_localctx).column_identifier = column_identifier();
				((Opt_lateral_view_exprContext)_localctx).column_alias_list.add(((Opt_lateral_view_exprContext)_localctx).column_identifier);
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1070);
					match(T_COMMA);
					setState(1071);
					((Opt_lateral_view_exprContext)_localctx).column_identifier = column_identifier();
					((Opt_lateral_view_exprContext)_localctx).column_alias_list.add(((Opt_lateral_view_exprContext)_localctx).column_identifier);
					}
					}
					setState(1076);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        vector<string> column_alias_json_list;
				        for(Column_identifierContext* column_ctxt:((Opt_lateral_view_exprContext)_localctx).column_alias_list)
				        {
				            column_alias_json_list.push_back(column_ctxt->res);
				        }
				        ((Opt_lateral_view_exprContext)_localctx).res =  hql_lateral_view_expr(((Opt_lateral_view_exprContext)_localctx).tab_generate_func.res, ((Opt_lateral_view_exprContext)_localctx).tab_alias.res, column_alias_json_list);
				    
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

	public static class Column_identifierContext extends ParserRuleContext {
		public string res;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(HiveParser.IDENTIFIER, 0); }
		public Column_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_identifier; }
	}

	public final Column_identifierContext column_identifier() throws RecognitionException {
		Column_identifierContext _localctx = new Column_identifierContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_column_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			((Column_identifierContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 ((Column_identifierContext)_localctx).res =  (((Column_identifierContext)_localctx).IDENTIFIER!=null?((Column_identifierContext)_localctx).IDENTIFIER.getText():null); 
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
		enterRule(_localctx, 124, RULE_opt_where_expr);
		try {
			setState(1089);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_GROUP:
			case T_HAVING:
			case T_LIMIT:
			case T_ORDER:
			case T_UNION:
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
				setState(1085);
				match(T_WHERE);
				setState(1086);
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
		enterRule(_localctx, 126, RULE_opt_group_by_list);
		int _la;
		try {
			setState(1105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_HAVING:
			case T_LIMIT:
			case T_ORDER:
			case T_UNION:
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
				setState(1093);
				match(T_GROUP);
				setState(1094);
				match(T_BY);
				setState(1095);
				((Opt_group_by_listContext)_localctx).expr = expr(0);
				((Opt_group_by_listContext)_localctx).expr_group_by_list.add(((Opt_group_by_listContext)_localctx).expr);
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1096);
					match(T_COMMA);
					setState(1097);
					((Opt_group_by_listContext)_localctx).expr = expr(0);
					((Opt_group_by_listContext)_localctx).expr_group_by_list.add(((Opt_group_by_listContext)_localctx).expr);
					}
					}
					setState(1102);
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
		enterRule(_localctx, 128, RULE_opt_having_expr);
		try {
			setState(1112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
			case T_ORDER:
			case T_UNION:
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
				setState(1108);
				match(T_HAVING);
				setState(1109);
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
		enterRule(_localctx, 130, RULE_opt_order_by_list);
		int _la;
		try {
			setState(1131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
			case T_UNION:
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
				setState(1116);
				match(T_ORDER);
				setState(1117);
				match(T_BY);
				setState(1118);
				((Opt_order_by_listContext)_localctx).ident = ident();
				((Opt_order_by_listContext)_localctx).order_by_ident_list.add(((Opt_order_by_listContext)_localctx).ident);
				setState(1119);
				((Opt_order_by_listContext)_localctx).opt_order_by_mode = opt_order_by_mode();
				((Opt_order_by_listContext)_localctx).order_mode_list.add(((Opt_order_by_listContext)_localctx).opt_order_by_mode);
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1120);
					match(T_COMMA);
					setState(1121);
					((Opt_order_by_listContext)_localctx).ident = ident();
					((Opt_order_by_listContext)_localctx).order_by_ident_list.add(((Opt_order_by_listContext)_localctx).ident);
					setState(1122);
					((Opt_order_by_listContext)_localctx).opt_order_by_mode = opt_order_by_mode();
					((Opt_order_by_listContext)_localctx).order_mode_list.add(((Opt_order_by_listContext)_localctx).opt_order_by_mode);
					}
					}
					setState(1128);
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
		enterRule(_localctx, 132, RULE_opt_order_by_mode);
		try {
			setState(1138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
			case T_UNION:
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
				setState(1134);
				match(T_ASC);
				 ((Opt_order_by_modeContext)_localctx).res =  "ASC"; 
				}
				break;
			case T_DESC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1136);
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
		enterRule(_localctx, 134, RULE_opt_limit);
		try {
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_limitContext)_localctx).res =  json(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				match(T_LIMIT);
				setState(1142);
				((Opt_limitContext)_localctx).rows = match(INT_LITERAL);
				 ((Opt_limitContext)_localctx).res =  hql_select_limit_clause((((Opt_limitContext)_localctx).rows!=null?((Opt_limitContext)_localctx).rows.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1144);
				match(T_LIMIT);
				setState(1145);
				((Opt_limitContext)_localctx).offset = match(INT_LITERAL);
				setState(1146);
				match(T_COMMA);
				setState(1147);
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
		enterRule(_localctx, 136, RULE_table_reference);
		int _la;
		try {
			setState(1173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1151);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				 ((Table_referenceContext)_localctx).res =  ((Table_referenceContext)_localctx).table_factor.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				vector<Table_factorContext*> table_factor_list; 
				setState(1155);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				((Table_referenceContext)_localctx).table_factor_list.add(((Table_referenceContext)_localctx).table_factor);
				setState(1158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1156);
					match(T_COMMA);
					setState(1157);
					((Table_referenceContext)_localctx).table_factor = table_factor();
					((Table_referenceContext)_localctx).table_factor_list.add(((Table_referenceContext)_localctx).table_factor);
					}
					}
					setState(1160); 
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
				setState(1165);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				setState(1167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1166);
					((Table_referenceContext)_localctx).join_table = join_table();
					((Table_referenceContext)_localctx).join_table_list.add(((Table_referenceContext)_localctx).join_table);
					}
					}
					setState(1169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_CROSS || ((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & ((1L << (T_FULL - 168)) | (1L << (T_INNER - 168)) | (1L << (T_JOIN - 168)) | (1L << (T_LEFT - 168)))) != 0) || _la==T_RIGHT );

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
		enterRule(_localctx, 138, RULE_join_table);
		int _la;
		try {
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1175);
					match(T_INNER);
					}
				}

				setState(1178);
				match(T_JOIN);
				setState(1179);
				((Join_tableContext)_localctx).table_factor = table_factor();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("INNER", ((Join_tableContext)_localctx).table_factor.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1182);
					match(T_INNER);
					}
				}

				setState(1185);
				match(T_JOIN);
				setState(1186);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1187);
				((Join_tableContext)_localctx).join_condition = join_condition();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("INNER", ((Join_tableContext)_localctx).table_factor.res, ((Join_tableContext)_localctx).join_condition.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1190);
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
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1191);
					match(T_OUTER);
					}
				}

				setState(1194);
				match(T_JOIN);
				setState(1195);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1196);
				((Join_tableContext)_localctx).join_condition = join_condition();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table((((Join_tableContext)_localctx).j_type!=null?((Join_tableContext)_localctx).j_type.getText():null), ((Join_tableContext)_localctx).table_factor.res, ((Join_tableContext)_localctx).join_condition.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1199);
				match(T_CROSS);
				setState(1200);
				match(T_JOIN);
				setState(1201);
				((Join_tableContext)_localctx).table_factor = table_factor();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("CROSS", ((Join_tableContext)_localctx).table_factor.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1204);
				match(T_CROSS);
				setState(1205);
				match(T_JOIN);
				setState(1206);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1207);
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
		enterRule(_localctx, 140, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(T_ON);
			setState(1213);
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
		enterRule(_localctx, 142, RULE_table_factor);
		int _la;
		try {
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216);
				((Table_factorContext)_localctx).tab_ident = tab_ident();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).tab_ident.res, "DEFAULT"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219);
				((Table_factorContext)_localctx).tab_ident = tab_ident();
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1220);
					match(T_AS);
					}
				}

				setState(1223);
				((Table_factorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).tab_ident.res, (((Table_factorContext)_localctx).IDENTIFIER!=null?((Table_factorContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1226);
				match(T_OPEN_P);
				setState(1227);
				((Table_factorContext)_localctx).select_stmt = select_stmt();
				setState(1228);
				match(T_CLOSE_P);
				setState(1230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1229);
					match(T_AS);
					}
				}

				setState(1232);
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
		enterRule(_localctx, 144, RULE_select_all_distinct);
		try {
			setState(1242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__8:
			case T__9:
			case T__10:
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
				setState(1238);
				match(T_ALL);
				 ((Select_all_distinctContext)_localctx).res =  "ALL"; 
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1240);
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
		enterRule(_localctx, 146, RULE_select_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<Select_exprContext*> exprs; 
			setState(1245);
			((Select_expr_listContext)_localctx).select_expr = select_expr();
			((Select_expr_listContext)_localctx).exprs.add(((Select_expr_listContext)_localctx).select_expr);
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1246);
				match(T_COMMA);
				setState(1247);
				((Select_expr_listContext)_localctx).select_expr = select_expr();
				((Select_expr_listContext)_localctx).exprs.add(((Select_expr_listContext)_localctx).select_expr);
				}
				}
				setState(1252);
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
		enterRule(_localctx, 148, RULE_select_expr);
		int _la;
		try {
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				((Select_exprContext)_localctx).expr = expr(0);
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1256);
					match(T_AS);
					}
				}

				setState(1259);
				((Select_exprContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res, (((Select_exprContext)_localctx).IDENTIFIER!=null?((Select_exprContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				((Select_exprContext)_localctx).expr = expr(0);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1265);
				((Select_exprContext)_localctx).expr = expr(0);
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1266);
					match(T_AS);
					}
				}

				setState(1269);
				((Select_exprContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res, (((Select_exprContext)_localctx).IDENTIFIER!=null?((Select_exprContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1272);
				((Select_exprContext)_localctx).expr = expr(0);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1275);
				match(T_MUL);
				 ((Select_exprContext)_localctx).res =  hql_select_all_expr(); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1277);
				((Select_exprContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(1278);
				match(T__1);
				setState(1279);
				match(T_MUL);
				 ((Select_exprContext)_localctx).res =  hql_select_all_expr((((Select_exprContext)_localctx).IDENTIFIER!=null?((Select_exprContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1281);
				((Select_exprContext)_localctx).over_clause = over_clause();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).over_clause.res, "DEFAULT"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1284);
				((Select_exprContext)_localctx).over_clause = over_clause();
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1285);
					match(T_AS);
					}
				}

				setState(1288);
				((Select_exprContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).over_clause.res, (((Select_exprContext)_localctx).IDENTIFIER!=null?((Select_exprContext)_localctx).IDENTIFIER.getText():null)); 
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
		enterRule(_localctx, 150, RULE_over_clause);
		int _la;
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 vector<IdentContext*> ident_cntxt_list; 
				setState(1294);
				((Over_clauseContext)_localctx).over_func = over_func();
				setState(1295);
				match(T_OVER);
				setState(1296);
				match(T_OPEN_P);
				setState(1297);
				match(T_PARTITION);
				setState(1298);
				match(T_BY);
				setState(1299);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1300);
					match(T_COMMA);
					setState(1301);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(1306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1307);
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
				setState(1311);
				((Over_clauseContext)_localctx).over_func = over_func();
				setState(1312);
				match(T_OVER);
				setState(1313);
				match(T_OPEN_P);
				setState(1314);
				match(T_ORDER);
				setState(1315);
				match(T_BY);
				setState(1316);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1317);
					match(T_COMMA);
					setState(1318);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(1323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1324);
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
				setState(1328);
				((Over_clauseContext)_localctx).over_func = over_func();
				setState(1329);
				match(T_OVER);
				setState(1330);
				match(T_OPEN_P);
				setState(1331);
				match(T_PARTITION);
				setState(1332);
				match(T_BY);
				setState(1333);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).partition_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1334);
					match(T_COMMA);
					setState(1335);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).partition_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(1340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1341);
				match(T_ORDER);
				setState(1342);
				match(T_BY);
				setState(1343);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).order_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1344);
					match(T_COMMA);
					setState(1345);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).order_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(1350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1351);
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
		enterRule(_localctx, 152, RULE_over_func);
		try {
			setState(1362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
			case T_COUNT:
			case T_MAX:
			case T_MIN:
			case T_SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1356);
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
				setState(1359);
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
		enterRule(_localctx, 154, RULE_analytic_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			((Analytic_funcContext)_localctx).func_name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T_PERCENT_RANK || ((((_la - 492)) & ~0x3f) == 0 && ((1L << (_la - 492)) & ((1L << (T_CUME_DIST - 492)) | (1L << (T_DENSE_RANK - 492)) | (1L << (T_RANK - 492)) | (1L << (T_ROW_NUMBER - 492)))) != 0)) ) {
				((Analytic_funcContext)_localctx).func_name = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1365);
			match(T_OPEN_P);
			setState(1366);
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
		enterRule(_localctx, 156, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> exprs; 
			setState(1370);
			match(T_OPEN_P);
			setState(1371);
			((Expr_listContext)_localctx).expr = expr(0);
			((Expr_listContext)_localctx).exprs.add(((Expr_listContext)_localctx).expr);
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1372);
				match(T_COMMA);
				setState(1373);
				((Expr_listContext)_localctx).expr = expr(0);
				((Expr_listContext)_localctx).exprs.add(((Expr_listContext)_localctx).expr);
				}
				}
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1379);
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
		public Use_varContext use_var;
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
		public Use_varContext use_var() {
			return getRuleContext(Use_varContext.class,0);
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
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1383);
				((ExprContext)_localctx).literal_values = literal_values();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).literal_values.res; 
				}
				break;
			case 2:
				{
				setState(1386);
				((ExprContext)_localctx).ident = ident();
				 ((ExprContext)_localctx).res =   ((ExprContext)_localctx).ident.res; 
				}
				break;
			case 3:
				{
				setState(1389);
				((ExprContext)_localctx).unary_operator = unary_operator();
				setState(1390);
				((ExprContext)_localctx).expr = expr(12);
				 ((ExprContext)_localctx).res =  hql_unary_operator((((ExprContext)_localctx).unary_operator!=null?_input.getText(((ExprContext)_localctx).unary_operator.start,((ExprContext)_localctx).unary_operator.stop):null), ((ExprContext)_localctx).expr.res); 
				}
				break;
			case 4:
				{
				setState(1393);
				match(T_OPEN_P);
				setState(1394);
				((ExprContext)_localctx).expr = expr(0);
				setState(1395);
				match(T_CLOSE_P);
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr.res; 
				}
				break;
			case 5:
				{
				setState(1398);
				((ExprContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case 6:
				{
				setState(1401);
				((ExprContext)_localctx).math_func = math_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).math_func.res; 
				}
				break;
			case 7:
				{
				setState(1404);
				((ExprContext)_localctx).date_func = date_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).date_func.res; 
				}
				break;
			case 8:
				{
				setState(1407);
				((ExprContext)_localctx).cond_func = cond_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).cond_func.res; 
				}
				break;
			case 9:
				{
				setState(1410);
				((ExprContext)_localctx).str_func = str_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).str_func.res; 
				}
				break;
			case 10:
				{
				setState(1413);
				((ExprContext)_localctx).expr_concat = expr_concat();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr_concat.res; 
				}
				break;
			case 11:
				{
				setState(1416);
				((ExprContext)_localctx).misc_func = misc_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).misc_func.res; 
				}
				break;
			case 12:
				{
				setState(1419);
				((ExprContext)_localctx).aggr_func = aggr_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).aggr_func.res; 
				}
				break;
			case 13:
				{
				setState(1422);
				((ExprContext)_localctx).complex_types = complex_types();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).complex_types.res; 
				}
				break;
			case 14:
				{
				setState(1425);
				((ExprContext)_localctx).use_var = use_var();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).use_var.res; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1430);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1431);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T_DIV || _la==T_MUL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1432);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(30);
						 ((ExprContext)_localctx).res =  hql_math_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1435);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1436);
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
						setState(1437);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(29);
						 ((ExprContext)_localctx).res =  hql_math_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1440);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1441);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1442);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(28);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1445);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1446);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 527)) & ~0x3f) == 0 && ((1L << (_la - 527)) & ((1L << (T_GREATER - 527)) | (1L << (T_GREATEREQUAL - 527)) | (1L << (T_LESS - 527)) | (1L << (T_LESSEQUAL - 527)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1447);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(27);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1450);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1451);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || ((((_la - 523)) & ~0x3f) == 0 && ((1L << (_la - 523)) & ((1L << (T_EQUAL - 523)) | (1L << (T_EQUAL2 - 523)) | (1L << (T_NOTEQUAL - 523)) | (1L << (T_NOTEQUAL2 - 523)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1452);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(26);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1455);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1456);
						((ExprContext)_localctx).op = match(T_AND);
						setState(1457);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(25);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1460);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1461);
						((ExprContext)_localctx).op = match(T_OR);
						setState(1462);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(24);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1465);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1466);
						match(T_BETWEEN);
						setState(1467);
						((ExprContext)_localctx).start_interval = ((ExprContext)_localctx).expr = expr(0);
						setState(1468);
						match(T_AND);
						setState(1469);
						((ExprContext)_localctx).end_interval = ((ExprContext)_localctx).expr = expr(21);
						 ((ExprContext)_localctx).res =  hql_between_expr(((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).start_interval.res, ((ExprContext)_localctx).end_interval.res, false); 
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1472);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1473);
						match(T_NOT);
						setState(1474);
						match(T_BETWEEN);
						setState(1475);
						((ExprContext)_localctx).start_interval = ((ExprContext)_localctx).expr = expr(0);
						setState(1476);
						match(T_AND);
						setState(1477);
						((ExprContext)_localctx).end_interval = ((ExprContext)_localctx).expr = expr(20);
						 ((ExprContext)_localctx).res =  hql_between_expr(((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).start_interval.res, ((ExprContext)_localctx).end_interval.res, true); 
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1480);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1481);
						((ExprContext)_localctx).set_operators_like = set_operators_like();
						setState(1482);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(16);
						 ((ExprContext)_localctx).res =  hql_bool_operator(((ExprContext)_localctx).set_operators_like.res, ((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1485);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1486);
						((ExprContext)_localctx).set_operators_is = set_operators_is();
						setState(1487);
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
						setState(1490);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1491);
						((ExprContext)_localctx).set_operators_is = set_operators_is();
						setState(1492);
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
						setState(1495);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1496);
						((ExprContext)_localctx).set_operators_in = set_operators_in();
						setState(1497);
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
						setState(1500);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1501);
						((ExprContext)_localctx).set_operators_in = set_operators_in();
						setState(1502);
						match(T_OPEN_P);
						setState(1503);
						((ExprContext)_localctx).select_stmt = select_stmt();
						setState(1504);
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
						setState(1507);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1508);
						((ExprContext)_localctx).set_operators_exists = set_operators_exists();
						setState(1509);
						match(T_OPEN_P);
						setState(1510);
						((ExprContext)_localctx).select_stmt = select_stmt();
						setState(1511);
						match(T_CLOSE_P);
						 ((ExprContext)_localctx).res =  hql_set_operators_in(((ExprContext)_localctx).set_operators_exists.res, ((ExprContext)_localctx).expr.res, ((ExprContext)_localctx).select_stmt.res); 
						}
						break;
					}
					} 
				}
				setState(1518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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
		enterRule(_localctx, 160, RULE_complex_types);
		try {
			setState(1559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1519);
				((Complex_typesContext)_localctx).array_def = array_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).array_def.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
				((Complex_typesContext)_localctx).map_def = map_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).map_def.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1525);
				((Complex_typesContext)_localctx).struct_def = struct_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).struct_def.res; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1528);
				((Complex_typesContext)_localctx).named_struct_def = named_struct_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).named_struct_def.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1531);
				((Complex_typesContext)_localctx).ident = ident();
				setState(1532);
				match(T_OPEN_SB);
				setState(1533);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(1534);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).ident.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1537);
				((Complex_typesContext)_localctx).array_def = array_def();
				setState(1538);
				match(T_OPEN_SB);
				setState(1539);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(1540);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).array_def.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1543);
				((Complex_typesContext)_localctx).map_def = map_def();
				setState(1544);
				match(T_OPEN_SB);
				setState(1545);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(1546);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).map_def.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1549);
				((Complex_typesContext)_localctx).ident = ident();
				setState(1550);
				match(T__1);
				setState(1551);
				((Complex_typesContext)_localctx).expr = expr(0);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).ident.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1554);
				((Complex_typesContext)_localctx).struct_def = struct_def();
				setState(1555);
				match(T__1);
				setState(1556);
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
		enterRule(_localctx, 162, RULE_array_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> exprs; 
			setState(1562);
			match(T_ARRAY);
			setState(1563);
			match(T_OPEN_P);
			setState(1564);
			((Array_defContext)_localctx).expr = expr(0);
			((Array_defContext)_localctx).exprs.add(((Array_defContext)_localctx).expr);
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1565);
				match(T_COMMA);
				setState(1566);
				((Array_defContext)_localctx).expr = expr(0);
				((Array_defContext)_localctx).exprs.add(((Array_defContext)_localctx).expr);
				}
				}
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1572);
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
		enterRule(_localctx, 164, RULE_map_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> key_exprs; vector<ExprContext*> val_exprs; 
			setState(1576);
			match(T_MAP);
			setState(1577);
			match(T_OPEN_P);
			setState(1578);
			((Map_defContext)_localctx).expr = expr(0);
			((Map_defContext)_localctx).key_exprs.add(((Map_defContext)_localctx).expr);
			setState(1579);
			match(T_COMMA);
			setState(1580);
			((Map_defContext)_localctx).expr = expr(0);
			((Map_defContext)_localctx).val_exprs.add(((Map_defContext)_localctx).expr);
			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1581);
				match(T_COMMA);
				setState(1582);
				((Map_defContext)_localctx).expr = expr(0);
				((Map_defContext)_localctx).key_exprs.add(((Map_defContext)_localctx).expr);
				setState(1583);
				match(T_COMMA);
				setState(1584);
				((Map_defContext)_localctx).expr = expr(0);
				((Map_defContext)_localctx).val_exprs.add(((Map_defContext)_localctx).expr);
				}
				}
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1591);
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
		enterRule(_localctx, 166, RULE_struct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> val_exprs; 
			setState(1595);
			match(T_STRUCT);
			setState(1596);
			match(T_OPEN_P);
			setState(1597);
			((Struct_defContext)_localctx).expr = expr(0);
			((Struct_defContext)_localctx).val_exprs.add(((Struct_defContext)_localctx).expr);
			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1598);
				match(T_COMMA);
				setState(1599);
				((Struct_defContext)_localctx).expr = expr(0);
				((Struct_defContext)_localctx).val_exprs.add(((Struct_defContext)_localctx).expr);
				}
				}
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1605);
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
		enterRule(_localctx, 168, RULE_named_struct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> col_exprs; vector<ExprContext*> val_exprs; 
			setState(1609);
			match(T_NAMED_STRUCT);
			setState(1610);
			match(T_OPEN_P);
			setState(1611);
			((Named_struct_defContext)_localctx).expr = expr(0);
			((Named_struct_defContext)_localctx).col_exprs.add(((Named_struct_defContext)_localctx).expr);
			setState(1612);
			match(T_COMMA);
			setState(1613);
			((Named_struct_defContext)_localctx).expr = expr(0);
			((Named_struct_defContext)_localctx).val_exprs.add(((Named_struct_defContext)_localctx).expr);
			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1614);
				match(T_COMMA);
				setState(1615);
				((Named_struct_defContext)_localctx).expr = expr(0);
				((Named_struct_defContext)_localctx).col_exprs.add(((Named_struct_defContext)_localctx).expr);
				setState(1616);
				match(T_COMMA);
				setState(1617);
				((Named_struct_defContext)_localctx).expr = expr(0);
				((Named_struct_defContext)_localctx).val_exprs.add(((Named_struct_defContext)_localctx).expr);
				}
				}
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1624);
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
		enterRule(_localctx, 170, RULE_str_func);
		int _la;
		try {
			setState(2140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				match(T_ASCII);
				setState(1628);
				match(T_OPEN_P);
				setState(1629);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1630);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("ASCII", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1633);
				match(T_BASE64);
				setState(1634);
				match(T_OPEN_P);
				setState(1635);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1636);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("BASE64", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1639);
				match(T_CHARACTER_LENGTH);
				setState(1640);
				match(T_OPEN_P);
				setState(1641);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1642);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHARACTER_LENGTH", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1645);
				match(T_CHR);
				setState(1646);
				match(T_OPEN_P);
				setState(1647);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1648);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHR", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(1652);
				match(T_CONCAT);
				setState(1653);
				match(T_OPEN_P);
				setState(1654);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1657); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1655);
					match(T_COMMA);
					setState(1656);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1659); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(1661);
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
				setState(1665);
				match(T_CONCAT_WS);
				setState(1666);
				match(T_OPEN_P);
				setState(1667);
				((Str_funcContext)_localctx).sep = expr(0);
				setState(1668);
				match(T_COMMA);
				setState(1669);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1672); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1670);
					match(T_COMMA);
					setState(1671);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1674); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(1676);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("CONCAT","separator", ((Str_funcContext)_localctx).sep.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1679);
				match(T_DECODE);
				setState(1680);
				match(T_OPEN_P);
				setState(1681);
				((Str_funcContext)_localctx).expr_bin = expr(0);
				setState(1682);
				match(T_COMMA);
				setState(1683);
				((Str_funcContext)_localctx).expr_charset = expr(0);
				setState(1684);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("DECODE", "binary_value", ((Str_funcContext)_localctx).expr_bin.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				 vector<ExprContext*> exprs; 
				setState(1688);
				match(T_ELT);
				setState(1689);
				match(T_OPEN_P);
				setState(1690);
				((Str_funcContext)_localctx).index_num = expr(0);
				setState(1691);
				match(T_COMMA);
				setState(1692);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1693);
					match(T_COMMA);
					setState(1694);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1700);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("ELT","index_num", ((Str_funcContext)_localctx).index_num.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1703);
				match(T_ENCODE);
				setState(1704);
				match(T_OPEN_P);
				setState(1705);
				((Str_funcContext)_localctx).expr_str = expr(0);
				setState(1706);
				match(T_COMMA);
				setState(1707);
				((Str_funcContext)_localctx).expr_charset = expr(0);
				setState(1708);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("ENCODE", "str_value", ((Str_funcContext)_localctx).expr_str.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				 vector<ExprContext*> exprs; 
				setState(1712);
				match(T_FIELD);
				setState(1713);
				match(T_OPEN_P);
				setState(1714);
				((Str_funcContext)_localctx).expr_val = expr(0);
				setState(1715);
				match(T_COMMA);
				setState(1716);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1717);
					match(T_COMMA);
					setState(1718);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1724);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("FIELD","expr_val", ((Str_funcContext)_localctx).expr_val.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1727);
				match(T_FIELD_IN_SET);
				setState(1728);
				match(T_OPEN_P);
				setState(1729);
				((Str_funcContext)_localctx).expr_str = expr(0);
				setState(1730);
				match(T_COMMA);
				setState(1731);
				((Str_funcContext)_localctx).expr_str_list = expr(0);
				setState(1732);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FIELD_IN_SET", "str_value", ((Str_funcContext)_localctx).expr_str.res, "str_list", ((Str_funcContext)_localctx).expr_str_list.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1735);
				match(T_FORMAT_NUMBER);
				setState(1736);
				match(T_OPEN_P);
				setState(1737);
				((Str_funcContext)_localctx).number_expr = expr(0);
				setState(1738);
				match(T_COMMA);
				setState(1739);
				((Str_funcContext)_localctx).int_expr = expr(0);
				setState(1740);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FORMAT_NUMBER", "number", ((Str_funcContext)_localctx).number_expr.res, "decimal_places", ((Str_funcContext)_localctx).int_expr.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1743);
				match(T_GET_JSON_OBJECTS);
				setState(1744);
				match(T_OPEN_P);
				setState(1745);
				((Str_funcContext)_localctx).json_string = expr(0);
				setState(1746);
				match(T_COMMA);
				setState(1747);
				((Str_funcContext)_localctx).path_expr = expr(0);
				setState(1748);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("GET_JSON_OBJECTS", "json_string", ((Str_funcContext)_localctx).json_string.res, "path", ((Str_funcContext)_localctx).path_expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1751);
				match(T_IN_FILE);
				setState(1752);
				match(T_OPEN_P);
				setState(1753);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1754);
				match(T_COMMA);
				setState(1755);
				((Str_funcContext)_localctx).filename = expr(0);
				setState(1756);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_FILE", "string", ((Str_funcContext)_localctx).str_expr.res, "filename", ((Str_funcContext)_localctx).filename.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1759);
				match(T_IN_STR);
				setState(1760);
				match(T_OPEN_P);
				setState(1761);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1762);
				match(T_COMMA);
				setState(1763);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(1764);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_STR", "string", ((Str_funcContext)_localctx).str_expr.res, "substring", ((Str_funcContext)_localctx).substr_expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1767);
				match(T_LENGTH);
				setState(1768);
				match(T_OPEN_P);
				setState(1769);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1770);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1773);
				match(T_LOCATE);
				setState(1774);
				match(T_OPEN_P);
				setState(1775);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(1776);
				match(T_COMMA);
				setState(1777);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1778);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1781);
				match(T_LOCATE);
				setState(1782);
				match(T_OPEN_P);
				setState(1783);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(1784);
				match(T_COMMA);
				setState(1785);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1786);
				match(T_COMMA);
				setState(1787);
				((Str_funcContext)_localctx).pos = expr(0);
				setState(1788);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res,"position", ((Str_funcContext)_localctx).pos.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1791);
				_la = _input.LA(1);
				if ( !(_la==T_LCASE || _la==T_LOWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1792);
				match(T_OPEN_P);
				setState(1793);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1794);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LOWER_CASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1797);
				match(T_LPAD);
				setState(1798);
				match(T_OPEN_P);
				setState(1799);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1800);
				match(T_COMMA);
				setState(1801);
				((Str_funcContext)_localctx).len = expr(0);
				setState(1802);
				match(T_COMMA);
				setState(1803);
				((Str_funcContext)_localctx).pad = expr(0);
				setState(1804);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1807);
				match(T_LTRIM);
				setState(1808);
				match(T_OPEN_P);
				setState(1809);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1810);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1813);
				match(T_OCTET_LENGTH);
				setState(1814);
				match(T_OPEN_P);
				setState(1815);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1816);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("OCTET_LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1819);
				match(T_PARSE_URL);
				setState(1820);
				match(T_OPEN_P);
				setState(1821);
				((Str_funcContext)_localctx).url_str = expr(0);
				setState(1822);
				match(T_COMMA);
				setState(1823);
				((Str_funcContext)_localctx).part_to_extract = expr(0);
				setState(1824);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1827);
				match(T_PARSE_URL);
				setState(1828);
				match(T_OPEN_P);
				setState(1829);
				((Str_funcContext)_localctx).url_str = expr(0);
				setState(1830);
				match(T_COMMA);
				setState(1831);
				((Str_funcContext)_localctx).part_to_extract = expr(0);
				setState(1832);
				match(T_COMMA);
				setState(1833);
				((Str_funcContext)_localctx).key_to_extract = expr(0);
				setState(1834);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res, "key_to_extract", ((Str_funcContext)_localctx).key_to_extract.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				 vector<ExprContext*> exprs; 
				setState(1838);
				match(T_PRINTF);
				setState(1839);
				match(T_OPEN_P);
				setState(1840);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1841);
				match(T_COMMA);
				setState(1842);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1845); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1843);
					match(T_COMMA);
					setState(1844);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1847); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(1849);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("PRINTF","string", ((Str_funcContext)_localctx).str_expr.res, "object_list",expr_list_json);
				    
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1852);
				match(T_QUOTE);
				setState(1853);
				match(T_OPEN_P);
				setState(1854);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1855);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("QUOTE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1858);
				match(T_REGEXP_EXTRACT);
				setState(1859);
				match(T_OPEN_P);
				setState(1860);
				((Str_funcContext)_localctx).subject = expr(0);
				setState(1861);
				match(T_COMMA);
				setState(1862);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(1863);
				match(T_COMMA);
				setState(1864);
				((Str_funcContext)_localctx).index = expr(0);
				setState(1865);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_EXTRACT", "subject", ((Str_funcContext)_localctx).subject.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"index", ((Str_funcContext)_localctx).index.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1868);
				match(T_REGEXP_REPLACE);
				setState(1869);
				match(T_OPEN_P);
				setState(1870);
				((Str_funcContext)_localctx).initial_string = expr(0);
				setState(1871);
				match(T_COMMA);
				setState(1872);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(1873);
				match(T_COMMA);
				setState(1874);
				((Str_funcContext)_localctx).replacement = expr(0);
				setState(1875);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_REPLACE", "initial_string", ((Str_funcContext)_localctx).initial_string.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"replacement", ((Str_funcContext)_localctx).replacement.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1878);
				match(T_REPEAT);
				setState(1879);
				match(T_OPEN_P);
				setState(1880);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1881);
				match(T_COMMA);
				setState(1882);
				((Str_funcContext)_localctx).n_times_expr = expr(0);
				setState(1883);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("REPEAT", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_times_expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1886);
				match(T_REPLACE);
				setState(1887);
				match(T_OPEN_P);
				setState(1888);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1889);
				match(T_COMMA);
				setState(1890);
				((Str_funcContext)_localctx).old = expr(0);
				setState(1891);
				match(T_COMMA);
				setState(1892);
				((Str_funcContext)_localctx).new_expr = expr(0);
				setState(1893);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REPLACE", "string", ((Str_funcContext)_localctx).str_expr.res, "old", ((Str_funcContext)_localctx).old.res,"new", ((Str_funcContext)_localctx).new_expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1896);
				match(T_REVERSE);
				setState(1897);
				match(T_OPEN_P);
				setState(1898);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1899);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("REVERSE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1902);
				match(T_RPAD);
				setState(1903);
				match(T_OPEN_P);
				setState(1904);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1905);
				match(T_COMMA);
				setState(1906);
				((Str_funcContext)_localctx).len = expr(0);
				setState(1907);
				match(T_COMMA);
				setState(1908);
				((Str_funcContext)_localctx).pad = expr(0);
				setState(1909);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("RPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1912);
				match(T_RTRIM);
				setState(1913);
				match(T_OPEN_P);
				setState(1914);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1915);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("RTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1918);
				match(T_SENTENCES);
				setState(1919);
				match(T_OPEN_P);
				setState(1920);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1921);
				match(T_COMMA);
				setState(1922);
				((Str_funcContext)_localctx).lang_expr = expr(0);
				setState(1923);
				match(T_COMMA);
				setState(1924);
				((Str_funcContext)_localctx).locale_expr = expr(0);
				setState(1925);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SENTENCES", "string", ((Str_funcContext)_localctx).str_expr.res, "lang", ((Str_funcContext)_localctx).lang_expr.res, "locale", ((Str_funcContext)_localctx).locale_expr.res); 
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1928);
				match(T_SPACE);
				setState(1929);
				match(T_OPEN_P);
				setState(1930);
				((Str_funcContext)_localctx).size_expr = expr(0);
				setState(1931);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SPACE", "size", ((Str_funcContext)_localctx).size_expr.res); 
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1934);
				match(T_SPLIT);
				setState(1935);
				match(T_OPEN_P);
				setState(1936);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1937);
				match(T_COMMA);
				setState(1938);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(1939);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SPLIT", "string", ((Str_funcContext)_localctx).str_expr.res, "pattern", ((Str_funcContext)_localctx).pattern.res); 
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1942);
				match(T_STR_TO_MAP);
				setState(1943);
				match(T_OPEN_P);
				setState(1944);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1945);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", hql_string_type(";"), "delimiter2", hql_string_type(":")); 
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1948);
				match(T_STR_TO_MAP);
				setState(1949);
				match(T_OPEN_P);
				setState(1950);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1951);
				match(T_COMMA);
				setState(1952);
				((Str_funcContext)_localctx).delimiter1 = expr(0);
				setState(1953);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2", hql_string_type(":")); 
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1956);
				match(T_STR_TO_MAP);
				setState(1957);
				match(T_OPEN_P);
				setState(1958);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1959);
				match(T_COMMA);
				setState(1960);
				((Str_funcContext)_localctx).delimiter1 = expr(0);
				setState(1961);
				match(T_COMMA);
				setState(1962);
				((Str_funcContext)_localctx).delimiter2 = expr(0);
				setState(1963);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2",((Str_funcContext)_localctx).delimiter2.res); 
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1966);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1967);
				match(T_OPEN_P);
				setState(1968);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1969);
				match(T_COMMA);
				setState(1970);
				((Str_funcContext)_localctx).start_indx = expr(0);
				setState(1971);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res); 
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1974);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1975);
				match(T_OPEN_P);
				setState(1976);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1977);
				match(T_COMMA);
				setState(1978);
				((Str_funcContext)_localctx).start_indx = expr(0);
				setState(1979);
				match(T_COMMA);
				setState(1980);
				((Str_funcContext)_localctx).lenght_expr = expr(0);
				setState(1981);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res, "length", ((Str_funcContext)_localctx).lenght_expr.res); 
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1984);
				match(T_SUBSTRING_INDEX);
				setState(1985);
				match(T_OPEN_P);
				setState(1986);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1987);
				match(T_COMMA);
				setState(1988);
				((Str_funcContext)_localctx).delimiter = expr(0);
				setState(1989);
				match(T_COMMA);
				setState(1990);
				((Str_funcContext)_localctx).count = expr(0);
				setState(1991);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING_INDEX", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter", ((Str_funcContext)_localctx).delimiter.res, "count", ((Str_funcContext)_localctx).count.res); 
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1994);
				match(T_TRANSLATE);
				setState(1995);
				match(T_OPEN_P);
				setState(1996);
				((Str_funcContext)_localctx).input_expr = expr(0);
				setState(1997);
				match(T_COMMA);
				setState(1998);
				((Str_funcContext)_localctx).from_expr = expr(0);
				setState(1999);
				match(T_COMMA);
				setState(2000);
				((Str_funcContext)_localctx).to_expr = expr(0);
				setState(2001);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("TRANSLATE", "input", ((Str_funcContext)_localctx).input_expr.res, "from", ((Str_funcContext)_localctx).from_expr.res, "to", ((Str_funcContext)_localctx).to_expr.res); 
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2004);
				match(T_TRIM);
				setState(2005);
				match(T_OPEN_P);
				setState(2006);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2007);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("TRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2010);
				match(T_UNBASE64);
				setState(2011);
				match(T_OPEN_P);
				setState(2012);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2013);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UNBASE64", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(2016);
				_la = _input.LA(1);
				if ( !(_la==T_UCASE || _la==T_UPPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2017);
				match(T_OPEN_P);
				setState(2018);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2019);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UPPERCASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(2022);
				match(T_INITCAP);
				setState(2023);
				match(T_OPEN_P);
				setState(2024);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2025);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("INITCAP", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(2028);
				match(T_LEVENSHTEIN);
				setState(2029);
				match(T_OPEN_P);
				setState(2030);
				((Str_funcContext)_localctx).strA_expr = expr(0);
				setState(2031);
				match(T_COMMA);
				setState(2032);
				((Str_funcContext)_localctx).strB_expr = expr(0);
				setState(2033);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LEVENSHTEIN", "string_A", ((Str_funcContext)_localctx).strA_expr.res, "string_B", ((Str_funcContext)_localctx).strB_expr.res); 
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(2036);
				match(T_SOUNDEX);
				setState(2037);
				match(T_OPEN_P);
				setState(2038);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2039);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SOUNDEX", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(2042);
				match(T_MASK);
				setState(2043);
				match(T_OPEN_P);
				setState(2044);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2045);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(2048);
				match(T_MASK);
				setState(2049);
				match(T_OPEN_P);
				setState(2050);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2051);
				match(T_COMMA);
				setState(2052);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(2053);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res); 
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(2056);
				match(T_MASK);
				setState(2057);
				match(T_OPEN_P);
				setState(2058);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2059);
				match(T_COMMA);
				setState(2060);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(2061);
				match(T_COMMA);
				setState(2062);
				((Str_funcContext)_localctx).str_lower_expr = expr(0);
				setState(2063);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res); 
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(2066);
				match(T_MASK);
				setState(2067);
				match(T_OPEN_P);
				setState(2068);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2069);
				match(T_COMMA);
				setState(2070);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(2071);
				match(T_COMMA);
				setState(2072);
				((Str_funcContext)_localctx).str_lower_expr = expr(0);
				setState(2073);
				match(T_COMMA);
				setState(2074);
				((Str_funcContext)_localctx).str_number_expr = expr(0);
				setState(2075);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_four_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res, "number", ((Str_funcContext)_localctx).str_number_expr.res); 
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(2078);
				match(T_MASK_FIRST_N);
				setState(2079);
				match(T_OPEN_P);
				setState(2080);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2081);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(2084);
				match(T_MASK_FIRST_N);
				setState(2085);
				match(T_OPEN_P);
				setState(2086);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2087);
				match(T_COMMA);
				setState(2088);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2089);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(2092);
				match(T_MASK_LAST_N);
				setState(2093);
				match(T_OPEN_P);
				setState(2094);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2095);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(2098);
				match(T_MASK_LAST_N);
				setState(2099);
				match(T_OPEN_P);
				setState(2100);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2101);
				match(T_COMMA);
				setState(2102);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2103);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(2106);
				match(T_MASK_SHOW_FIRST_N);
				setState(2107);
				match(T_OPEN_P);
				setState(2108);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2109);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(2112);
				match(T_MASK_SHOW_FIRST_N);
				setState(2113);
				match(T_OPEN_P);
				setState(2114);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2115);
				match(T_COMMA);
				setState(2116);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2117);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(2120);
				match(T_MASK_SHOW_LAST_N);
				setState(2121);
				match(T_OPEN_P);
				setState(2122);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2123);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(2126);
				match(T_MASK_SHOW_LAST_N);
				setState(2127);
				match(T_OPEN_P);
				setState(2128);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2129);
				match(T_COMMA);
				setState(2130);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2131);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(2134);
				match(T_MASK_HASH);
				setState(2135);
				match(T_OPEN_P);
				setState(2136);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2137);
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
		enterRule(_localctx, 172, RULE_misc_func);
		int _la;
		try {
			setState(2242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_JAVA_METHOD:
				enterOuterAlt(_localctx, 1);
				{
				 vector<ExprContext*> exprs; 
				setState(2143);
				match(T_JAVA_METHOD);
				setState(2144);
				match(T_OPEN_P);
				setState(2145);
				((Misc_funcContext)_localctx).class_name_expr = expr(0);
				setState(2146);
				match(T_COMMA);
				setState(2147);
				((Misc_funcContext)_localctx).method_name_expr = expr(0);
				setState(2152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2148);
					match(T_COMMA);
					setState(2149);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2155);
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
				setState(2159);
				match(T_REFLECT);
				setState(2160);
				match(T_OPEN_P);
				setState(2161);
				((Misc_funcContext)_localctx).class_name_expr = expr(0);
				setState(2162);
				match(T_COMMA);
				setState(2163);
				((Misc_funcContext)_localctx).method_name_expr = expr(0);
				setState(2168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2164);
					match(T_COMMA);
					setState(2165);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2171);
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
				setState(2175);
				match(T_HASH);
				setState(2176);
				match(T_OPEN_P);
				setState(2177);
				((Misc_funcContext)_localctx).expr = expr(0);
				((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
				setState(2182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2178);
					match(T_COMMA);
					setState(2179);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2185);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Misc_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Misc_funcContext)_localctx).res =  hql_list_param_func("HASH", "expr_list", expr_list_json);
				    
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2188);
				match(T_CURRENT_USER);
				setState(2189);
				match(T_OPEN_P);
				setState(2190);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("CURRENT_USER"); 
				}
				break;
			case T_LOGGED_IN_USER:
				enterOuterAlt(_localctx, 5);
				{
				setState(2192);
				match(T_LOGGED_IN_USER);
				setState(2193);
				match(T_OPEN_P);
				setState(2194);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("LOGGED_IN_USER"); 
				}
				break;
			case T_CURRENT_DATABASE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2196);
				match(T_CURRENT_DATABASE);
				setState(2197);
				match(T_OPEN_P);
				setState(2198);
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
				setState(2200);
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
				setState(2201);
				match(T_OPEN_P);
				setState(2202);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2203);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_single_param_func((((Misc_funcContext)_localctx).f_name!=null?((Misc_funcContext)_localctx).f_name.getText():null), "string", ((Misc_funcContext)_localctx).str_expr.res); 
				}
				break;
			case T_SHA2:
				enterOuterAlt(_localctx, 8);
				{
				setState(2206);
				match(T_SHA2);
				setState(2207);
				match(T_OPEN_P);
				setState(2208);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2209);
				match(T_COMMA);
				setState(2210);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(2211);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "string", ((Misc_funcContext)_localctx).str_expr.res, "hash_size", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_ENCRYPT:
				enterOuterAlt(_localctx, 9);
				{
				setState(2214);
				match(T_AES_ENCRYPT);
				setState(2215);
				match(T_OPEN_P);
				setState(2216);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2217);
				match(T_COMMA);
				setState(2218);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(2219);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_DECRYPT:
				enterOuterAlt(_localctx, 10);
				{
				setState(2222);
				match(T_AES_DECRYPT);
				setState(2223);
				match(T_OPEN_P);
				setState(2224);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2225);
				match(T_COMMA);
				setState(2226);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(2227);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_VERSION:
				enterOuterAlt(_localctx, 11);
				{
				setState(2230);
				match(T_VERSION);
				setState(2231);
				match(T_OPEN_P);
				setState(2232);
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
				setState(2234);
				((Misc_funcContext)_localctx).f_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 480)) & ~0x3f) == 0 && ((1L << (_la - 480)) & ((1L << (T_XPATH - 480)) | (1L << (T_XPATH_BOOLEAN - 480)) | (1L << (T_XPATH_DOUBLE - 480)) | (1L << (T_XPATH_FLOAT - 480)) | (1L << (T_XPATH_INT - 480)) | (1L << (T_XPATH_LONG - 480)) | (1L << (T_XPATH_NUMBER - 480)) | (1L << (T_XPATH_SHORT - 480)) | (1L << (T_XPATH_STRING - 480)))) != 0)) ) {
					((Misc_funcContext)_localctx).f_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2235);
				match(T_OPEN_P);
				setState(2236);
				((Misc_funcContext)_localctx).xml_str_expr = expr(0);
				setState(2237);
				match(T_COMMA);
				setState(2238);
				((Misc_funcContext)_localctx).xpath_expr_str = expr(0);
				setState(2239);
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
		enterRule(_localctx, 174, RULE_expr_concat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 vector<Expr_concat_itemContext*> exprs; 
			setState(2245);
			((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
			((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
			setState(2248); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2246);
					match(T_PIPE);
					setState(2247);
					((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
					((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2250); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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
		public Use_varContext use_var;
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
		public Use_varContext use_var() {
			return getRuleContext(Use_varContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_expr_concat_item);
		try {
			setState(2289);
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
				setState(2254);
				((Expr_concat_itemContext)_localctx).literal_values = literal_values();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).literal_values.res; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2257);
				((Expr_concat_itemContext)_localctx).ident = ident();
				 ((Expr_concat_itemContext)_localctx).res =   ((Expr_concat_itemContext)_localctx).ident.res; 
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 3);
				{
				setState(2260);
				match(T_OPEN_P);
				setState(2261);
				((Expr_concat_itemContext)_localctx).expr = expr(0);
				setState(2262);
				match(T_CLOSE_P);
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr.res; 
				}
				break;
			case T_BINARY:
			case T_CAST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2265);
				((Expr_concat_itemContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case T__8:
			case T__9:
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
				setState(2268);
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
				setState(2271);
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
				setState(2274);
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
				setState(2277);
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
				setState(2280);
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
				setState(2283);
				((Expr_concat_itemContext)_localctx).aggr_func = aggr_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).aggr_func.res; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 11);
				{
				setState(2286);
				((Expr_concat_itemContext)_localctx).use_var = use_var();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).use_var.res; 
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
		enterRule(_localctx, 178, RULE_cond_func);
		int _la;
		try {
			setState(2414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2291);
				match(T_IF);
				setState(2292);
				match(T_OPEN_P);
				setState(2293);
				((Cond_funcContext)_localctx).test_cond = expr(0);
				setState(2294);
				match(T_COMMA);
				setState(2295);
				((Cond_funcContext)_localctx).valueTrue = expr(0);
				setState(2296);
				match(T_COMMA);
				setState(2297);
				((Cond_funcContext)_localctx).valueFalse = expr(0);
				setState(2298);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_three_param_func("IF", "test_cond", ((Cond_funcContext)_localctx).test_cond.res, "value_true", ((Cond_funcContext)_localctx).valueTrue.res, "value_false", ((Cond_funcContext)_localctx).valueFalse.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2301);
				match(T_ISNULL);
				setState(2302);
				match(T_OPEN_P);
				setState(2303);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(2304);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2307);
				match(T_ISNOTNULL);
				setState(2308);
				match(T_OPEN_P);
				setState(2309);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(2310);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNOTNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2313);
				match(T_NVL);
				setState(2314);
				match(T_OPEN_P);
				setState(2315);
				((Cond_funcContext)_localctx).expr_val = expr(0);
				setState(2316);
				match(T_COMMA);
				setState(2317);
				((Cond_funcContext)_localctx).default_val = expr(0);
				setState(2318);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NVL", "expr_val", ((Cond_funcContext)_localctx).expr_val.res, "default_val", ((Cond_funcContext)_localctx).default_val.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(2322);
				match(T_COALESCE);
				setState(2323);
				match(T_OPEN_P);
				{
				setState(2324);
				((Cond_funcContext)_localctx).expr = expr(0);
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				}
				{
				setState(2325);
				match(T_COMMA);
				setState(2326);
				((Cond_funcContext)_localctx).expr = expr(0);
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				}
				setState(2332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2328);
					match(T_COMMA);
					setState(2329);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2335);
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
				setState(2339);
				match(T_CASE);
				setState(2340);
				((Cond_funcContext)_localctx).case_expr = expr(0);
				setState(2346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2341);
					match(T_WHEN);
					setState(2342);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2343);
					match(T_THEN);
					setState(2344);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2348); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2350);
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
				setState(2354);
				match(T_CASE);
				setState(2355);
				((Cond_funcContext)_localctx).case_expr = expr(0);
				setState(2361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2356);
					match(T_WHEN);
					setState(2357);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2358);
					match(T_THEN);
					setState(2359);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2363); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2365);
				match(T_ELSE);
				setState(2366);
				((Cond_funcContext)_localctx).els_expr = expr(0);
				setState(2367);
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
				setState(2371);
				match(T_CASE);
				setState(2377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2372);
					match(T_WHEN);
					setState(2373);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2374);
					match(T_THEN);
					setState(2375);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2379); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2381);
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
				setState(2385);
				match(T_CASE);
				setState(2391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2386);
					match(T_WHEN);
					setState(2387);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2388);
					match(T_THEN);
					setState(2389);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2393); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2395);
				match(T_ELSE);
				setState(2396);
				((Cond_funcContext)_localctx).els_expr = expr(0);
				setState(2397);
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
				setState(2400);
				match(T_NULLIF);
				setState(2401);
				match(T_OPEN_P);
				setState(2402);
				((Cond_funcContext)_localctx).a_expr = expr(0);
				setState(2403);
				match(T_COMMA);
				setState(2404);
				((Cond_funcContext)_localctx).b_expr = expr(0);
				setState(2405);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NULLIF", "a_expr", ((Cond_funcContext)_localctx).a_expr.res, "b_expr", ((Cond_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2408);
				match(T_ASSERT_TRUE);
				setState(2409);
				match(T_OPEN_P);
				setState(2410);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(2411);
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
		enterRule(_localctx, 180, RULE_date_func);
		try {
			setState(2592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2416);
				match(T_UNIX_TIMESTAMP);
				setState(2417);
				match(T_OPEN_P);
				setState(2418);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("UNIX_TIMESTAMP"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2420);
				match(T_UNIX_TIMESTAMP);
				setState(2421);
				match(T_OPEN_P);
				setState(2422);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2423);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2426);
				match(T_UNIX_TIMESTAMP);
				setState(2427);
				match(T_OPEN_P);
				setState(2428);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2429);
				match(T_COMMA);
				setState(2430);
				((Date_funcContext)_localctx).pattern_expr = expr(0);
				setState(2431);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res, "pattern", ((Date_funcContext)_localctx).pattern_expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2434);
				match(T_YEAR);
				setState(2435);
				match(T_OPEN_P);
				setState(2436);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2437);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("YEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2440);
				match(T_QUARTER);
				setState(2441);
				match(T_OPEN_P);
				setState(2442);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2443);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("QUARTER", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2446);
				match(T_MONTH);
				setState(2447);
				match(T_OPEN_P);
				setState(2448);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2449);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MONTH", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2452);
				match(T_DAY);
				setState(2453);
				match(T_OPEN_P);
				setState(2454);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2455);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2458);
				match(T_HOUR);
				setState(2459);
				match(T_OPEN_P);
				setState(2460);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2461);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("HOUR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2464);
				match(T_MINUTE);
				setState(2465);
				match(T_OPEN_P);
				setState(2466);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2467);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MINUTE", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2470);
				match(T_SECOND);
				setState(2471);
				match(T_OPEN_P);
				setState(2472);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2473);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("SECOND", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2476);
				match(T_WEEKOFYEAR);
				setState(2477);
				match(T_OPEN_P);
				setState(2478);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2479);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("WEEKOFYEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2482);
				match(T_DATEDIFF);
				setState(2483);
				match(T_OPEN_P);
				setState(2484);
				((Date_funcContext)_localctx).enddate = expr(0);
				setState(2485);
				match(T_COMMA);
				setState(2486);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2487);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "enddate", ((Date_funcContext)_localctx).enddate.res, "startdate", ((Date_funcContext)_localctx).startdate.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2490);
				match(T_DATEADD);
				setState(2491);
				match(T_OPEN_P);
				setState(2492);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2493);
				match(T_COMMA);
				setState(2494);
				((Date_funcContext)_localctx).days = expr(0);
				setState(2495);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2498);
				match(T_DATESUB);
				setState(2499);
				match(T_OPEN_P);
				setState(2500);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2501);
				match(T_COMMA);
				setState(2502);
				((Date_funcContext)_localctx).days = expr(0);
				setState(2503);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2506);
				match(T_TOUTCTIMESTAMP);
				setState(2507);
				match(T_OPEN_P);
				setState(2508);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(2509);
				match(T_COMMA);
				setState(2510);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(2511);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TO_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2514);
				match(T_FROMUTCTIMESTAMP);
				setState(2515);
				match(T_OPEN_P);
				setState(2516);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(2517);
				match(T_COMMA);
				setState(2518);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(2519);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("FROM_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2522);
				match(T_CURRENT_DATE);
				setState(2525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(2523);
					match(T_OPEN_P);
					setState(2524);
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
				setState(2528);
				match(T_CURRENT_TIMESTAMP);
				setState(2531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(2529);
					match(T_OPEN_P);
					setState(2530);
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
				setState(2534);
				match(T_ADD_MONTHS);
				setState(2535);
				match(T_OPEN_P);
				setState(2536);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2537);
				match(T_COMMA);
				setState(2538);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(2539);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2542);
				match(T_ADD_MONTHS);
				setState(2543);
				match(T_OPEN_P);
				setState(2544);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2545);
				match(T_COMMA);
				setState(2546);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(2547);
				match(T_COMMA);
				setState(2548);
				((Date_funcContext)_localctx).out_date_format = expr(0);
				setState(2549);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_three_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res, "out_date_format", ((Date_funcContext)_localctx).out_date_format.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2552);
				match(T_LASTDAY);
				setState(2553);
				match(T_OPEN_P);
				setState(2554);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2555);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("LAST_DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2558);
				match(T_NEXT_DAY);
				setState(2559);
				match(T_OPEN_P);
				setState(2560);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2561);
				match(T_COMMA);
				setState(2562);
				((Date_funcContext)_localctx).day_of_week = expr(0);
				setState(2563);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("NEXT_DAY", "startdate", ((Date_funcContext)_localctx).startdate.res, "day_of_week", ((Date_funcContext)_localctx).day_of_week.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2566);
				match(T_TRUNC);
				setState(2567);
				match(T_OPEN_P);
				setState(2568);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2569);
				match(T_COMMA);
				setState(2570);
				((Date_funcContext)_localctx).format = expr(0);
				setState(2571);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TRUNC", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2574);
				match(T_MONTHS_BETWEEN);
				setState(2575);
				match(T_OPEN_P);
				setState(2576);
				((Date_funcContext)_localctx).date1 = expr(0);
				setState(2577);
				match(T_COMMA);
				setState(2578);
				((Date_funcContext)_localctx).date2 = expr(0);
				setState(2579);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("MONTHS_BETWEEN", "date1", ((Date_funcContext)_localctx).date1.res, "date2", ((Date_funcContext)_localctx).date2.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2582);
				match(T_DATE_FORMAT);
				setState(2583);
				match(T_OPEN_P);
				setState(2584);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2585);
				match(T_COMMA);
				setState(2586);
				((Date_funcContext)_localctx).format = expr(0);
				setState(2587);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATE_FORMAT", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2590);
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
		public Primitive_typeContext primitive_type;
		public TerminalNode T_CAST() { return getToken(HiveParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
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
		enterRule(_localctx, 182, RULE_dat_convrt_func);
		int _la;
		try {
			setState(2611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2594);
				match(T_CAST);
				setState(2595);
				match(T_OPEN_P);
				setState(2596);
				((Dat_convrt_funcContext)_localctx).expr = expr(0);
				setState(2597);
				match(T_AS);
				setState(2598);
				((Dat_convrt_funcContext)_localctx).primitive_type = primitive_type();
				setState(2600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2599);
					dtype_len();
					}
				}

				setState(2602);
				match(T_CLOSE_P);
				 ((Dat_convrt_funcContext)_localctx).res =  hql_cast_func(((Dat_convrt_funcContext)_localctx).expr.res, ((Dat_convrt_funcContext)_localctx).primitive_type.res); 
				}
				break;
			case T_BINARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2605);
				match(T_BINARY);
				setState(2606);
				match(T_OPEN_P);
				setState(2607);
				((Dat_convrt_funcContext)_localctx).expr = expr(0);
				setState(2608);
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
		enterRule(_localctx, 184, RULE_basic_aggr_func);
		int _la;
		try {
			setState(2671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2613);
				match(T_COUNT);
				setState(2614);
				match(T_OPEN_P);
				setState(2615);
				((Basic_aggr_funcContext)_localctx).r = expr(0);
				setState(2616);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_count_func(((Basic_aggr_funcContext)_localctx).r.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 vector<ExprContext*> exprs; 
				setState(2620);
				match(T_COUNT);
				setState(2621);
				match(T_OPEN_P);
				setState(2622);
				match(T_DISTINCT);
				setState(2623);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				((Basic_aggr_funcContext)_localctx).exprs.add(((Basic_aggr_funcContext)_localctx).expr);
				setState(2628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2624);
					match(T_COMMA);
					setState(2625);
					((Basic_aggr_funcContext)_localctx).expr = expr(0);
					((Basic_aggr_funcContext)_localctx).exprs.add(((Basic_aggr_funcContext)_localctx).expr);
					}
					}
					setState(2630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2631);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Basic_aggr_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Basic_aggr_funcContext)_localctx).res =  hql_single_param_list_func("COUNT", "flag_distinct", true, "expr_list", expr_list_json);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2634);
				match(T_COUNT);
				setState(2635);
				match(T_OPEN_P);
				setState(2636);
				match(T_MUL);
				setState(2637);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_count_all_func(); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2639);
				match(T_SUM);
				setState(2640);
				match(T_OPEN_P);
				setState(2641);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2642);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", false, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2645);
				match(T_SUM);
				setState(2646);
				match(T_OPEN_P);
				setState(2647);
				match(T_DISTINCT);
				setState(2648);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2649);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", true, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2652);
				match(T_AVG);
				setState(2653);
				match(T_OPEN_P);
				setState(2654);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2655);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", false, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2658);
				match(T_AVG);
				setState(2659);
				match(T_OPEN_P);
				setState(2660);
				match(T_DISTINCT);
				setState(2661);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2662);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", true, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2665);
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
				setState(2666);
				match(T_OPEN_P);
				setState(2667);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2668);
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
		enterRule(_localctx, 186, RULE_aggr_func);
		int _la;
		try {
			setState(2744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2673);
				((Aggr_funcContext)_localctx).basic_aggr_func = basic_aggr_func();
				 ((Aggr_funcContext)_localctx).res =  ((Aggr_funcContext)_localctx).basic_aggr_func.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2676);
				((Aggr_funcContext)_localctx).fun_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_STDDEV_POP || _la==T_STDDEV_SAMP || ((((_la - 513)) & ~0x3f) == 0 && ((1L << (_la - 513)) & ((1L << (T_VARIANCE - 513)) | (1L << (T_VAR_POP - 513)) | (1L << (T_VAR_SAMP - 513)))) != 0)) ) {
					((Aggr_funcContext)_localctx).fun_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2677);
				match(T_OPEN_P);
				setState(2678);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(2679);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2682);
				((Aggr_funcContext)_localctx).fun_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T_CORR - 81)) | (1L << (T_COVAR_POP - 81)) | (1L << (T_COVAR_SAMP - 81)))) != 0)) ) {
					((Aggr_funcContext)_localctx).fun_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2683);
				match(T_OPEN_P);
				setState(2684);
				((Aggr_funcContext)_localctx).col1 = expr(0);
				setState(2685);
				match(T_COMMA);
				setState(2686);
				((Aggr_funcContext)_localctx).col2 = expr(0);
				setState(2687);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col1", ((Aggr_funcContext)_localctx).col1.res, "col2", ((Aggr_funcContext)_localctx).col2.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2690);
				match(T_PERCENTILE);
				setState(2691);
				match(T_OPEN_P);
				setState(2692);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2693);
				match(T_COMMA);
				setState(2694);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(2695);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2698);
				match(T_PERCENTILE_APPROX);
				setState(2699);
				match(T_OPEN_P);
				setState(2700);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2701);
				match(T_COMMA);
				setState(2702);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(2703);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2706);
				match(T_PERCENTILE_APPROX);
				setState(2707);
				match(T_OPEN_P);
				setState(2708);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2709);
				match(T_COMMA);
				setState(2710);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(2711);
				match(T_COMMA);
				setState(2712);
				((Aggr_funcContext)_localctx).b_expr = expr(0);
				setState(2713);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_three_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2716);
				((Aggr_funcContext)_localctx).func_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 345)) & ~0x3f) == 0 && ((1L << (_la - 345)) & ((1L << (T_REGR_AVGX - 345)) | (1L << (T_REGR_AVGY - 345)) | (1L << (T_REGR_COUNT - 345)) | (1L << (T_REGR_INTERCEPT - 345)) | (1L << (T_REGR_R2 - 345)) | (1L << (T_REGR_SLOPE - 345)) | (1L << (T_REGR_SXX - 345)) | (1L << (T_REGR_SXY - 345)) | (1L << (T_REGR_SYY - 345)))) != 0)) ) {
					((Aggr_funcContext)_localctx).func_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2717);
				match(T_OPEN_P);
				setState(2718);
				((Aggr_funcContext)_localctx).indep = expr(0);
				setState(2719);
				match(T_COMMA);
				setState(2720);
				((Aggr_funcContext)_localctx).dep = expr(0);
				setState(2721);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "independent", ((Aggr_funcContext)_localctx).indep.res, "dependent", ((Aggr_funcContext)_localctx).dep.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2724);
				match(T_HISTOGRAM_NUMERIC);
				setState(2725);
				match(T_OPEN_P);
				setState(2726);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2727);
				match(T_COMMA);
				setState(2728);
				((Aggr_funcContext)_localctx).b_expr = expr(0);
				setState(2729);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("HISTOGRAM_NUMERIC", "col", ((Aggr_funcContext)_localctx).col.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2732);
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
				setState(2733);
				match(T_OPEN_P);
				setState(2734);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(2735);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2738);
				match(T_NTILE);
				setState(2739);
				match(T_OPEN_P);
				setState(2740);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(2741);
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
		enterRule(_localctx, 188, RULE_tab_generate_func);
		try {
			setState(2764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EXPLODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2746);
				match(T_EXPLODE);
				setState(2747);
				match(T_OPEN_P);
				setState(2748);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(2749);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("EXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_POSEXPLODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2752);
				match(T_POSEXPLODE);
				setState(2753);
				match(T_OPEN_P);
				setState(2754);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(2755);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("POSEXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_INLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2758);
				match(T_INLINE);
				setState(2759);
				match(T_OPEN_P);
				setState(2760);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(2761);
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
		enterRule(_localctx, 190, RULE_math_func);
		int _la;
		try {
			setState(2976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2766);
				match(T_ROUND);
				setState(2767);
				match(T_OPEN_P);
				setState(2768);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2769);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ROUND", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2772);
				match(T_ROUND);
				setState(2773);
				match(T_OPEN_P);
				setState(2774);
				((Math_funcContext)_localctx).fst = expr(0);
				setState(2775);
				match(T_COMMA);
				setState(2776);
				((Math_funcContext)_localctx).snd = expr(0);
				setState(2777);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("ROUND", "expr", ((Math_funcContext)_localctx).fst.res, "decimal_places", ((Math_funcContext)_localctx).snd.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2780);
				match(T_FLOOR);
				setState(2781);
				match(T_OPEN_P);
				setState(2782);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2783);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FLOOR", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2786);
				_la = _input.LA(1);
				if ( !(_la==T_CEIL || _la==T_CEILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2787);
				match(T_OPEN_P);
				setState(2788);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2789);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("CEIL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2792);
				((Math_funcContext)_localctx).T_RAND = match(T_RAND);
				setState(2793);
				match(T_OPEN_P);
				setState(2794);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func((((Math_funcContext)_localctx).T_RAND!=null?((Math_funcContext)_localctx).T_RAND.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2796);
				match(T_RAND);
				setState(2797);
				match(T_OPEN_P);
				setState(2798);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2799);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RAND", "seed", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2802);
				match(T_EXP);
				setState(2803);
				match(T_OPEN_P);
				setState(2804);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2805);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("EXP", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2808);
				match(T_LN);
				setState(2809);
				match(T_OPEN_P);
				setState(2810);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2811);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2814);
				match(T_LOG10);
				setState(2815);
				match(T_OPEN_P);
				setState(2816);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2817);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG10", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2820);
				match(T_LOG2);
				setState(2821);
				match(T_OPEN_P);
				setState(2822);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2823);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG2", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2826);
				match(T_LOG);
				setState(2827);
				match(T_OPEN_P);
				setState(2828);
				((Math_funcContext)_localctx).base = expr(0);
				setState(2829);
				match(T_COMMA);
				setState(2830);
				((Math_funcContext)_localctx).e = expr(0);
				setState(2831);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("LOG", "base", ((Math_funcContext)_localctx).base.res, "expr", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2834);
				_la = _input.LA(1);
				if ( !(_la==T_POW || _la==T_POWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2835);
				match(T_OPEN_P);
				setState(2836);
				((Math_funcContext)_localctx).base = expr(0);
				setState(2837);
				match(T_COMMA);
				setState(2838);
				((Math_funcContext)_localctx).e = expr(0);
				setState(2839);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("POWER", "base", ((Math_funcContext)_localctx).base.res, "exp", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2842);
				match(T_SQRT);
				setState(2843);
				match(T_OPEN_P);
				setState(2844);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2845);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SQRT", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2848);
				match(T_BIN);
				setState(2849);
				match(T_OPEN_P);
				setState(2850);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2851);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("BIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2854);
				match(T_HEX);
				setState(2855);
				match(T_OPEN_P);
				setState(2856);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2857);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("HEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2860);
				match(T_UNHEX);
				setState(2861);
				match(T_OPEN_P);
				setState(2862);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2863);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("UNHEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2866);
				match(T_CONV);
				setState(2867);
				match(T_OPEN_P);
				setState(2868);
				((Math_funcContext)_localctx).e = expr(0);
				setState(2869);
				match(T_COMMA);
				setState(2870);
				((Math_funcContext)_localctx).fbase = expr(0);
				setState(2871);
				match(T_COMMA);
				setState(2872);
				((Math_funcContext)_localctx).tbase = expr(0);
				setState(2873);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_three_param_func("CONV", "expr", ((Math_funcContext)_localctx).e.res, "from_base", ((Math_funcContext)_localctx).fbase.res, "to_base", ((Math_funcContext)_localctx).tbase.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2876);
				match(T_ABS);
				setState(2877);
				match(T_OPEN_P);
				setState(2878);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2879);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ABS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2882);
				match(T_PMOD);
				setState(2883);
				match(T_OPEN_P);
				setState(2884);
				((Math_funcContext)_localctx).a = expr(0);
				setState(2885);
				match(T_COMMA);
				setState(2886);
				((Math_funcContext)_localctx).b = expr(0);
				setState(2887);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("PMOD", "a", ((Math_funcContext)_localctx).a.res, "b", ((Math_funcContext)_localctx).b.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2890);
				match(T_SIN);
				setState(2891);
				match(T_OPEN_P);
				setState(2892);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2893);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2896);
				match(T_ASIN);
				setState(2897);
				match(T_OPEN_P);
				setState(2898);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2899);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ASIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2902);
				match(T_COS);
				setState(2903);
				match(T_OPEN_P);
				setState(2904);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2905);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("COS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2908);
				match(T_ACOS);
				setState(2909);
				match(T_OPEN_P);
				setState(2910);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2911);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ACOS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2914);
				match(T_TAN);
				setState(2915);
				match(T_OPEN_P);
				setState(2916);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2917);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("TAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2920);
				match(T_ATAN);
				setState(2921);
				match(T_OPEN_P);
				setState(2922);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2923);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ATAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2926);
				match(T_DEGREES);
				setState(2927);
				match(T_OPEN_P);
				setState(2928);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2929);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("DEGREES", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2932);
				match(T_RADIANS);
				setState(2933);
				match(T_OPEN_P);
				setState(2934);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2935);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RADIANS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2938);
				match(T_POSITIVE);
				setState(2939);
				match(T_OPEN_P);
				setState(2940);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2941);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("POSITIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2944);
				match(T_NEGATIVE);
				setState(2945);
				match(T_OPEN_P);
				setState(2946);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2947);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("NEGATIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2950);
				match(T_SIGN);
				setState(2951);
				match(T_OPEN_P);
				setState(2952);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2953);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIGN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2956);
				match(T__8);
				setState(2957);
				match(T_OPEN_P);
				setState(2958);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("EULER_CONST"); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2960);
				match(T__9);
				setState(2961);
				match(T_OPEN_P);
				setState(2962);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("PI_CONST"); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2964);
				match(T_FACTORIAL);
				setState(2965);
				match(T_OPEN_P);
				setState(2966);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2967);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FACTORIAL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2970);
				match(T_CBR);
				setState(2971);
				match(T_OPEN_P);
				setState(2972);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2973);
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
		enterRule(_localctx, 192, RULE_literal_values);
		try {
			setState(2994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2978);
				((Literal_valuesContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_string_type((((Literal_valuesContext)_localctx).STRING_LITERAL!=null?((Literal_valuesContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2980);
				((Literal_valuesContext)_localctx).DECIMAL_LITERAL = match(DECIMAL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_decimal_type((((Literal_valuesContext)_localctx).DECIMAL_LITERAL!=null?((Literal_valuesContext)_localctx).DECIMAL_LITERAL.getText():null)); 
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2982);
				((Literal_valuesContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_int_type((((Literal_valuesContext)_localctx).INT_LITERAL!=null?((Literal_valuesContext)_localctx).INT_LITERAL.getText():null)); 
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(2984);
				((Literal_valuesContext)_localctx).BOOL_LITERAL = match(BOOL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_boolean_type((((Literal_valuesContext)_localctx).BOOL_LITERAL!=null?((Literal_valuesContext)_localctx).BOOL_LITERAL.getText():null)); 
				}
				break;
			case NULL_CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(2986);
				match(NULL_CONST);
				 ((Literal_valuesContext)_localctx).res =  hql_null_constant(); 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2988);
				((Literal_valuesContext)_localctx).date_literal = date_literal();
				 ((Literal_valuesContext)_localctx).res =  hql_type_date_literal(((Literal_valuesContext)_localctx).date_literal.res); 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(2991);
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
		enterRule(_localctx, 194, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(2996);
				((IdentContext)_localctx).database = match(IDENTIFIER);
				setState(2997);
				match(T__1);
				}
				break;
			}
			setState(3002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(3000);
				((IdentContext)_localctx).tablename = match(IDENTIFIER);
				setState(3001);
				match(T__1);
				}
				break;
			}
			setState(3004);
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
		public Complex_nameContext database_var;
		public Complex_nameContext tablename_var;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HiveParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HiveParser.IDENTIFIER, i);
		}
		public List<Complex_nameContext> complex_name() {
			return getRuleContexts(Complex_nameContext.class);
		}
		public Complex_nameContext complex_name(int i) {
			return getRuleContext(Complex_nameContext.class,i);
		}
		public Tab_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab_ident; }
	}

	public final Tab_identContext tab_ident() throws RecognitionException {
		Tab_identContext _localctx = new Tab_identContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_tab_ident);
		try {
			setState(3021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3009);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(3007);
					((Tab_identContext)_localctx).database = match(IDENTIFIER);
					setState(3008);
					match(T__1);
					}
					break;
				}
				setState(3011);
				((Tab_identContext)_localctx).tablename = match(IDENTIFIER);
				 ((Tab_identContext)_localctx).res =  hql_type_table_identifier((((Tab_identContext)_localctx).database!=null?((Tab_identContext)_localctx).database.getText():null), (((Tab_identContext)_localctx).tablename!=null?((Tab_identContext)_localctx).tablename.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3013);
				((Tab_identContext)_localctx).database_var = complex_name();
				setState(3014);
				match(T__1);
				setState(3015);
				((Tab_identContext)_localctx).tablename_var = complex_name();
				 ((Tab_identContext)_localctx).res =  hql_type_table_identifier(((Tab_identContext)_localctx).database_var.res, ((Tab_identContext)_localctx).tablename_var.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3018);
				((Tab_identContext)_localctx).tablename_var = complex_name();
				 ((Tab_identContext)_localctx).res =  hql_type_table_identifier(string(), ((Tab_identContext)_localctx).tablename_var.res); 
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

	public static class Complex_nameContext extends ParserRuleContext {
		public string res;
		public Complex_atom_nameContext complex_atom_name;
		public List<Complex_atom_nameContext> name_list = new ArrayList<Complex_atom_nameContext>();
		public List<Complex_atom_nameContext> complex_atom_name() {
			return getRuleContexts(Complex_atom_nameContext.class);
		}
		public Complex_atom_nameContext complex_atom_name(int i) {
			return getRuleContext(Complex_atom_nameContext.class,i);
		}
		public Complex_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_name; }
	}

	public final Complex_nameContext complex_name() throws RecognitionException {
		Complex_nameContext _localctx = new Complex_nameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_complex_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			vector<Complex_atom_nameContext*> name_list; 
			setState(3025); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3024);
					((Complex_nameContext)_localctx).complex_atom_name = complex_atom_name();
					((Complex_nameContext)_localctx).name_list.add(((Complex_nameContext)_localctx).complex_atom_name);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3027); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			        string result = "";
			        for(Complex_atom_nameContext* name_ctxt:((Complex_nameContext)_localctx).name_list)
			            result+=name_ctxt->res;
			        ((Complex_nameContext)_localctx).res =  result;
			    
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

	public static class Complex_atom_nameContext extends ParserRuleContext {
		public string res;
		public Token IDENTIFIER;
		public Use_varContext use_var;
		public TerminalNode IDENTIFIER() { return getToken(HiveParser.IDENTIFIER, 0); }
		public Use_varContext use_var() {
			return getRuleContext(Use_varContext.class,0);
		}
		public Complex_atom_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_atom_name; }
	}

	public final Complex_atom_nameContext complex_atom_name() throws RecognitionException {
		Complex_atom_nameContext _localctx = new Complex_atom_nameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_complex_atom_name);
		try {
			setState(3036);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(3031);
				((Complex_atom_nameContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Complex_atom_nameContext)_localctx).res =  (((Complex_atom_nameContext)_localctx).IDENTIFIER!=null?((Complex_atom_nameContext)_localctx).IDENTIFIER.getText():null); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(3033);
				((Complex_atom_nameContext)_localctx).use_var = use_var();
				 ((Complex_atom_nameContext)_localctx).res =   remove_quotes(to_string(((Complex_atom_nameContext)_localctx).use_var.res["value"])); 
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
		enterRule(_localctx, 202, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3038);
			match(T_DATE);
			setState(3039);
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
		enterRule(_localctx, 204, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3042);
			match(T_TIMESTAMP);
			setState(3043);
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
		enterRule(_localctx, 206, RULE_set_operators_is);
		try {
			setState(3051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3046);
				match(T_IS);
				 ((Set_operators_isContext)_localctx).res =  "IS"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3048);
				match(T_IS);
				setState(3049);
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
		enterRule(_localctx, 208, RULE_set_operators_like);
		try {
			setState(3062);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3053);
				match(T_LIKE);
				 ((Set_operators_likeContext)_localctx).res =  "LIKE"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3055);
				match(T_NOT);
				setState(3056);
				match(T_LIKE);
				 ((Set_operators_likeContext)_localctx).res =  "NOT_LIKE"; 
				}
				break;
			case T_RLIKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3058);
				match(T_RLIKE);
				 ((Set_operators_likeContext)_localctx).res =  "RLIKE"; 
				}
				break;
			case T_REGEXP:
				enterOuterAlt(_localctx, 4);
				{
				setState(3060);
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
		enterRule(_localctx, 210, RULE_set_operators_in);
		try {
			setState(3069);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(3064);
				match(T_IN);
				 ((Set_operators_inContext)_localctx).res =  "IN"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3066);
				match(T_NOT);
				setState(3067);
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
		enterRule(_localctx, 212, RULE_set_operators_exists);
		try {
			setState(3076);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EXISTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(3071);
				match(T_EXISTS);
				 ((Set_operators_existsContext)_localctx).res =  "EXISTS"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3073);
				match(T_NOT);
				setState(3074);
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
		enterRule(_localctx, 214, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3078);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T_NOT || _la==T_ADD || _la==T_SUB) ) {
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
		case 79:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 29);
		case 1:
			return precpred(_ctx, 28);
		case 2:
			return precpred(_ctx, 27);
		case 3:
			return precpred(_ctx, 26);
		case 4:
			return precpred(_ctx, 25);
		case 5:
			return precpred(_ctx, 24);
		case 6:
			return precpred(_ctx, 23);
		case 7:
			return precpred(_ctx, 20);
		case 8:
			return precpred(_ctx, 19);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 22);
		case 11:
			return precpred(_ctx, 21);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 17);
		case 14:
			return precpred(_ctx, 16);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0227\u0c0b\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\u00e3\n\3\r\3\16\3\u00e4"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ef\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ff\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0117"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0132\n\6\f\6\16\6\u0135\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0140\n\6\f\6\16\6\u0143\13\6\3"+
		"\6\3\6\3\6\5\6\u0148\n\6\3\7\3\7\3\7\5\7\u014d\n\7\3\7\3\7\5\7\u0151\n"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u015e\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0166\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u017a\n\f\f\f\16\f\u017d\13\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0188\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0191\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\5\21\u01a0\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01be\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u01c6\n\23\f\23\16\23\u01c9\13\23\3\23\3\23\3\23"+
		"\5\23\u01ce\n\23\3\24\3\24\3\24\3\24\7\24\u01d4\n\24\f\24\16\24\u01d7"+
		"\13\24\3\24\3\24\5\24\u01db\n\24\3\25\3\25\3\25\3\25\5\25\u01e1\n\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01ed\n\27\f\27"+
		"\16\27\u01f0\13\27\3\27\3\27\3\27\5\27\u01f5\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0201\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u020b\n\31\f\31\16\31\u020e\13\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0217\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\7\32\u0224\n\32\f\32\16\32\u0227\13\32\3\32\3\32"+
		"\3\32\5\32\u022c\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0233\n\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u023d\n\34\f\34\16\34\u0240\13"+
		"\34\3\34\3\34\3\34\3\34\3\34\5\34\u0247\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u0250\n\35\f\35\16\35\u0253\13\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u025f\n\35\f\35\16\35\u0262\13\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u026a\n\35\f\35\16\35\u026d\13\35"+
		"\3\35\3\35\7\35\u0271\n\35\f\35\16\35\u0274\13\35\3\35\3\35\3\35\5\35"+
		"\u0279\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0280\n\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u0288\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5"+
		" \u0297\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u02a7\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u02b0\n\"\3#\3#\3#\3#\3#\3#\3#\5#\u02b9\n#"+
		"\3$\3$\3$\3$\3$\3$\5$\u02c1\n$\3%\3%\3%\3%\3%\3%\5%\u02c9\n%\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u02d8\n&\f&\16&\u02db\13&\3&\3&\3&\5"+
		"&\u02e0\n&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u02f8\n(\3)\3)\3)\3)\5)\u02fe\n)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\5*\u030f\n*\3+\3+\3+\3,\3,\3,\3,\3,\5,\u0319\n"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0329\n-\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\6.\u0339\n.\r.\16.\u033a\3.\3.\3.\3.\3.\3"+
		".\3.\3.\6.\u0345\n.\r.\16.\u0346\3.\3.\5.\u034b\n.\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0367\n"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0373\n\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u037c\n\61\f\61\16\61\u037f\13"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\7\61\u0390\n\61\f\61\16\61\u0393\13\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\7\61\u039c\n\61\f\61\16\61\u039f\13\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u03ae\n\61\f\61"+
		"\16\61\u03b1\13\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\5\61\u03c2\n\61\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u03c9\n\62\3\63\3\63\3\63\5\63\u03ce\n\63\3\64\3\64\3\64\5\64\u03d3\n"+
		"\64\3\65\3\65\3\65\5\65\u03d8\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u03df"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u03e6\n\67\38\38\38\38\58\u03ec\n"+
		"8\39\39\39\39\39\59\u03f3\n9\3:\3:\3:\3:\3:\3:\5:\u03fb\n:\3;\3;\3;\3"+
		";\3;\3;\6;\u0403\n;\r;\16;\u0404\3;\3;\3<\3<\3<\3<\3<\5<\u040e\n<\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0427"+
		"\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\7>\u0433\n>\f>\16>\u0436\13>\3>\3>\5"+
		">\u043a\n>\3?\3?\3?\3@\3@\3@\3@\3@\5@\u0444\n@\3A\3A\3A\3A\3A\3A\3A\7"+
		"A\u044d\nA\fA\16A\u0450\13A\3A\3A\5A\u0454\nA\3B\3B\3B\3B\3B\5B\u045b"+
		"\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\7C\u0467\nC\fC\16C\u046a\13C\3C\3C\5"+
		"C\u046e\nC\3D\3D\3D\3D\3D\5D\u0475\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0480"+
		"\nE\3F\3F\3F\3F\3F\3F\3F\6F\u0489\nF\rF\16F\u048a\3F\3F\3F\3F\3F\6F\u0492"+
		"\nF\rF\16F\u0493\3F\3F\5F\u0498\nF\3G\5G\u049b\nG\3G\3G\3G\3G\3G\5G\u04a2"+
		"\nG\3G\3G\3G\3G\3G\3G\3G\5G\u04ab\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\5G\u04bd\nG\3H\3H\3H\3H\3I\3I\3I\3I\3I\5I\u04c8\nI\3I"+
		"\3I\3I\3I\3I\3I\3I\5I\u04d1\nI\3I\3I\3I\5I\u04d6\nI\3J\3J\3J\3J\3J\5J"+
		"\u04dd\nJ\3K\3K\3K\3K\7K\u04e3\nK\fK\16K\u04e6\13K\3K\3K\3L\3L\5L\u04ec"+
		"\nL\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04f6\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\5L\u0509\nL\3L\3L\3L\5L\u050e\nL\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\7M\u0519\nM\fM\16M\u051c\13M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\7M\u052a\nM\fM\16M\u052d\13M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\7M\u053b\nM\fM\16M\u053e\13M\3M\3M\3M\3M\3M\7M\u0545\nM\fM\16M\u0548"+
		"\13M\3M\3M\3M\5M\u054d\nM\3N\3N\3N\3N\3N\3N\5N\u0555\nN\3O\3O\3O\3O\3"+
		"O\3P\3P\3P\3P\3P\7P\u0561\nP\fP\16P\u0564\13P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0597\nQ\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u05ed\nQ\fQ\16Q\u05f0\13"+
		"Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u061a\nR\3S\3"+
		"S\3S\3S\3S\3S\7S\u0622\nS\fS\16S\u0625\13S\3S\3S\3S\3T\3T\3T\3T\3T\3T"+
		"\3T\3T\3T\3T\3T\7T\u0635\nT\fT\16T\u0638\13T\3T\3T\3T\3U\3U\3U\3U\3U\3"+
		"U\7U\u0643\nU\fU\16U\u0646\13U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\7V\u0656\nV\fV\16V\u0659\13V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\6W\u067c"+
		"\nW\rW\16W\u067d\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\6W\u068b\nW\rW\16W\u068c"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\7W\u06a2\nW"+
		"\fW\16W\u06a5\13W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\7W\u06ba\nW\fW\16W\u06bd\13W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\6W\u0738\nW\rW\16"+
		"W\u0739\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u085f\nW\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\7X\u0869\nX\fX\16X\u086c\13X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\7X\u0879\nX\fX\16X\u087c\13X\3X\3X\3X\3X\3X\3X\3X\3X\3X\7"+
		"X\u0887\nX\fX\16X\u088a\13X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u08c5"+
		"\nX\3Y\3Y\3Y\3Y\6Y\u08cb\nY\rY\16Y\u08cc\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\5Z\u08f4\nZ\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\7[\u091d\n[\f[\16[\u0920\13[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\6["+
		"\u092d\n[\r[\16[\u092e\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\6[\u093c\n[\r"+
		"[\16[\u093d\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\6[\u094c\n[\r[\16[\u094d"+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\6[\u095a\n[\r[\16[\u095b\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0971\n[\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\5\\\u09e0\n\\\3\\\3\\\3\\\3\\\5\\\u09e6\n\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\5\\\u0a23\n\\\3]\3]\3]\3]\3]\3]\5]\u0a2b\n]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\5]\u0a36\n]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\7^\u0a45\n^\f"+
		"^\16^\u0a48\13^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^"+
		"\u0a72\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\5_\u0abb\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\5`\u0acf\n`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u0ba3\na\3b\3b\3b\3b\3b\3b\3b\3b"+
		"\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0bb5\nb\3c\3c\5c\u0bb9\nc\3c\3c\5c\u0bbd"+
		"\nc\3c\3c\3c\3d\3d\5d\u0bc4\nd\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0bd0"+
		"\nd\3e\3e\6e\u0bd4\ne\re\16e\u0bd5\3e\3e\3f\3f\3f\3f\3f\5f\u0bdf\nf\3"+
		"g\3g\3g\3g\3h\3h\3h\3h\3i\3i\3i\3i\3i\5i\u0bee\ni\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\5j\u0bf9\nj\3k\3k\3k\3k\3k\5k\u0c00\nk\3l\3l\3l\3l\3l\5l\u0c07"+
		"\nl\3m\3m\3m\2\3\u00a0n\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\2\30\4\2\u0106\u0106\u0222\u0222"+
		"\4\2//88\5\2\u00aa\u00aa\u00e7\u00e7\u016e\u016e\6\2\u013c\u013c\u01ee"+
		"\u01ee\u01f2\u01f2\u01ff\u0200\5\2\5\5\u020b\u020b\u0215\u0215\4\2\u0207"+
		"\u0207\u021d\u021d\3\2\6\t\3\2\u0211\u0214\4\2\n\n\u020d\u0210\4\2\u00e5"+
		"\u00e5\u00fa\u00fa\3\2\u01a9\u01aa\4\2\u01c4\u01c4\u01cc\u01cc\5\2YY\u0108"+
		"\u0108\u018a\u018b\3\2\u01e2\u01ea\4\2\u0106\u0106\u010d\u010d\4\2\u01a0"+
		"\u01a1\u0203\u0205\4\2SSWX\3\2\u015b\u0163\3\2DE\3\2\66\67\3\2\u0143\u0144"+
		"\6\2\r\r\u011e\u011e\u0207\u0207\u021d\u021d\2\u0d3c\2\u00da\3\2\2\2\4"+
		"\u00de\3\2\2\2\6\u00ee\3\2\2\2\b\u0116\3\2\2\2\n\u0147\3\2\2\2\f\u0149"+
		"\3\2\2\2\16\u015d\3\2\2\2\20\u0165\3\2\2\2\22\u0167\3\2\2\2\24\u016e\3"+
		"\2\2\2\26\u0175\3\2\2\2\30\u0187\3\2\2\2\32\u0190\3\2\2\2\34\u0192\3\2"+
		"\2\2\36\u0195\3\2\2\2 \u019f\3\2\2\2\"\u01bd\3\2\2\2$\u01cd\3\2\2\2&\u01da"+
		"\3\2\2\2(\u01e0\3\2\2\2*\u01e2\3\2\2\2,\u01f4\3\2\2\2.\u0200\3\2\2\2\60"+
		"\u0216\3\2\2\2\62\u022b\3\2\2\2\64\u0232\3\2\2\2\66\u0246\3\2\2\28\u0278"+
		"\3\2\2\2:\u027f\3\2\2\2<\u0287\3\2\2\2>\u0296\3\2\2\2@\u02a6\3\2\2\2B"+
		"\u02af\3\2\2\2D\u02b8\3\2\2\2F\u02c0\3\2\2\2H\u02c8\3\2\2\2J\u02df\3\2"+
		"\2\2L\u02e1\3\2\2\2N\u02f7\3\2\2\2P\u02fd\3\2\2\2R\u030e\3\2\2\2T\u0310"+
		"\3\2\2\2V\u0318\3\2\2\2X\u0328\3\2\2\2Z\u034a\3\2\2\2\\\u0366\3\2\2\2"+
		"^\u0372\3\2\2\2`\u03c1\3\2\2\2b\u03c8\3\2\2\2d\u03cd\3\2\2\2f\u03d2\3"+
		"\2\2\2h\u03d7\3\2\2\2j\u03de\3\2\2\2l\u03e5\3\2\2\2n\u03eb\3\2\2\2p\u03f2"+
		"\3\2\2\2r\u03fa\3\2\2\2t\u03fc\3\2\2\2v\u040d\3\2\2\2x\u0426\3\2\2\2z"+
		"\u0439\3\2\2\2|\u043b\3\2\2\2~\u0443\3\2\2\2\u0080\u0453\3\2\2\2\u0082"+
		"\u045a\3\2\2\2\u0084\u046d\3\2\2\2\u0086\u0474\3\2\2\2\u0088\u047f\3\2"+
		"\2\2\u008a\u0497\3\2\2\2\u008c\u04bc\3\2\2\2\u008e\u04be\3\2\2\2\u0090"+
		"\u04d5\3\2\2\2\u0092\u04dc\3\2\2\2\u0094\u04de\3\2\2\2\u0096\u050d\3\2"+
		"\2\2\u0098\u054c\3\2\2\2\u009a\u0554\3\2\2\2\u009c\u0556\3\2\2\2\u009e"+
		"\u055b\3\2\2\2\u00a0\u0596\3\2\2\2\u00a2\u0619\3\2\2\2\u00a4\u061b\3\2"+
		"\2\2\u00a6\u0629\3\2\2\2\u00a8\u063c\3\2\2\2\u00aa\u064a\3\2\2\2\u00ac"+
		"\u085e\3\2\2\2\u00ae\u08c4\3\2\2\2\u00b0\u08c6\3\2\2\2\u00b2\u08f3\3\2"+
		"\2\2\u00b4\u0970\3\2\2\2\u00b6\u0a22\3\2\2\2\u00b8\u0a35\3\2\2\2\u00ba"+
		"\u0a71\3\2\2\2\u00bc\u0aba\3\2\2\2\u00be\u0ace\3\2\2\2\u00c0\u0ba2\3\2"+
		"\2\2\u00c2\u0bb4\3\2\2\2\u00c4\u0bb8\3\2\2\2\u00c6\u0bcf\3\2\2\2\u00c8"+
		"\u0bd1\3\2\2\2\u00ca\u0bde\3\2\2\2\u00cc\u0be0\3\2\2\2\u00ce\u0be4\3\2"+
		"\2\2\u00d0\u0bed\3\2\2\2\u00d2\u0bf8\3\2\2\2\u00d4\u0bff\3\2\2\2\u00d6"+
		"\u0c06\3\2\2\2\u00d8\u0c08\3\2\2\2\u00da\u00db\5\4\3\2\u00db\u00dc\7\2"+
		"\2\3\u00dc\u00dd\b\2\1\2\u00dd\3\3\2\2\2\u00de\u00e2\b\3\1\2\u00df\u00e0"+
		"\5\16\b\2\u00e0\u00e1\7\u021c\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\b\3\1\2\u00e7\5\3\2\2\2\u00e8\u00e9\5\b\5\2"+
		"\u00e9\u00ea\b\4\1\2\u00ea\u00ef\3\2\2\2\u00eb\u00ec\5\n\6\2\u00ec\u00ed"+
		"\b\4\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef"+
		"\7\3\2\2\2\u00f0\u00f1\7\u01b9\2\2\u00f1\u0117\b\5\1\2\u00f2\u00f3\7\u0194"+
		"\2\2\u00f3\u0117\b\5\1\2\u00f4\u00f5\7\u00cd\2\2\u00f5\u0117\b\5\1\2\u00f6"+
		"\u00f7\7&\2\2\u00f7\u0117\b\5\1\2\u00f8\u00f9\7+\2\2\u00f9\u0117\b\5\1"+
		"\2\u00fa\u00fb\7\u00a1\2\2\u00fb\u0117\b\5\1\2\u00fc\u00fe\7\u0082\2\2"+
		"\u00fd\u00ff\7\u0145\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0117\b\5\1\2\u0101\u0102\7\u01a5\2\2\u0102\u0117"+
		"\b\5\1\2\u0103\u0104\7(\2\2\u0104\u0117\b\5\1\2\u0105\u0106\7\u01b8\2"+
		"\2\u0106\u0117\b\5\1\2\u0107\u0108\7m\2\2\u0108\u0117\b\5\1\2\u0109\u010a"+
		"\7m\2\2\u010a\u010b\7\u0217\2\2\u010b\u010c\7\u021f\2\2\u010c\u010d\7"+
		"\u0209\2\2\u010d\u010e\7\u021f\2\2\u010e\u010f\7\u021a\2\2\u010f\u0117"+
		"\b\5\1\2\u0110\u0111\7d\2\2\u0111\u0117\b\5\1\2\u0112\u0113\7\u01d3\2"+
		"\2\u0113\u0117\b\5\1\2\u0114\u0115\78\2\2\u0115\u0117\b\5\1\2\u0116\u00f0"+
		"\3\2\2\2\u0116\u00f2\3\2\2\2\u0116\u00f4\3\2\2\2\u0116\u00f6\3\2\2\2\u0116"+
		"\u00f8\3\2\2\2\u0116\u00fa\3\2\2\2\u0116\u00fc\3\2\2\2\u0116\u0101\3\2"+
		"\2\2\u0116\u0103\3\2\2\2\u0116\u0105\3\2\2\2\u0116\u0107\3\2\2\2\u0116"+
		"\u0109\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\t\3\2\2\2\u0118\u0119\7\30\2\2\u0119\u011a\7\u0213\2\2\u011a"+
		"\u011b\5\b\5\2\u011b\u011c\7\u0211\2\2\u011c\u011d\b\6\1\2\u011d\u0148"+
		"\3\2\2\2\u011e\u011f\7\u00fe\2\2\u011f\u0120\7\u0213\2\2\u0120\u0121\5"+
		"\b\5\2\u0121\u0122\7\u0209\2\2\u0122\u0123\5\6\4\2\u0123\u0124\7\u0211"+
		"\2\2\u0124\u0125\b\6\1\2\u0125\u0148\3\2\2\2\u0126\u0127\b\6\1\2\u0127"+
		"\u0128\7\u01a7\2\2\u0128\u0129\7\u0213\2\2\u0129\u012a\5|?\2\u012a\u012b"+
		"\7\u0208\2\2\u012b\u0133\5\6\4\2\u012c\u012d\7\u0209\2\2\u012d\u012e\5"+
		"|?\2\u012e\u012f\7\u0208\2\2\u012f\u0130\5\6\4\2\u0130\u0132\3\2\2\2\u0131"+
		"\u012c\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\u0211\2\2\u0137"+
		"\u0138\b\6\1\2\u0138\u0148\3\2\2\2\u0139\u013a\b\6\1\2\u013a\u013b\7\u01c8"+
		"\2\2\u013b\u013c\7\u0213\2\2\u013c\u0141\5\6\4\2\u013d\u013e\7\u0209\2"+
		"\2\u013e\u0140\5\6\4\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\7\u0211\2\2\u0145\u0146\b\6\1\2\u0146\u0148\3\2\2\2\u0147\u0118"+
		"\3\2\2\2\u0147\u011e\3\2\2\2\u0147\u0126\3\2\2\2\u0147\u0139\3\2\2\2\u0148"+
		"\13\3\2\2\2\u0149\u014a\7\u0217\2\2\u014a\u014c\t\2\2\2\u014b\u014d\t"+
		"\3\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014f\7\u0209\2\2\u014f\u0151\7\u0222\2\2\u0150\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7\u021a\2\2\u0153\r\3\2\2\2\u0154"+
		"\u0155\5r:\2\u0155\u0156\b\b\1\2\u0156\u015e\3\2\2\2\u0157\u0158\5\20"+
		"\t\2\u0158\u0159\b\b\1\2\u0159\u015e\3\2\2\2\u015a\u015b\5\22\n\2\u015b"+
		"\u015c\b\b\1\2\u015c\u015e\3\2\2\2\u015d\u0154\3\2\2\2\u015d\u0157\3\2"+
		"\2\2\u015d\u015a\3\2\2\2\u015e\17\3\2\2\2\u015f\u0160\5\"\22\2\u0160\u0161"+
		"\b\t\1\2\u0161\u0166\3\2\2\2\u0162\u0163\5\36\20\2\u0163\u0164\b\t\1\2"+
		"\u0164\u0166\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0162\3\2\2\2\u0166\21"+
		"\3\2\2\2\u0167\u0168\7\u0188\2\2\u0168\u0169\5\30\r\2\u0169\u016a\5\26"+
		"\f\2\u016a\u016b\7\u020d\2\2\u016b\u016c\5\u00a0Q\2\u016c\u016d\b\n\1"+
		"\2\u016d\23\3\2\2\2\u016e\u016f\7\3\2\2\u016f\u0170\7\u0216\2\2\u0170"+
		"\u0171\5\32\16\2\u0171\u0172\5\26\f\2\u0172\u0173\7\u0219\2\2\u0173\u0174"+
		"\b\13\1\2\u0174\25\3\2\2\2\u0175\u0176\b\f\1\2\u0176\u017b\5\34\17\2\u0177"+
		"\u0178\7\4\2\2\u0178\u017a\5\34\17\2\u0179\u0177\3\2\2\2\u017a\u017d\3"+
		"\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u017f\b\f\1\2\u017f\27\3\2\2\2\u0180\u0188\b\r\1"+
		"\2\u0181\u0182\7\u00b9\2\2\u0182\u0183\7\u0208\2\2\u0183\u0188\b\r\1\2"+
		"\u0184\u0185\7\u00ba\2\2\u0185\u0186\7\u0208\2\2\u0186\u0188\b\r\1\2\u0187"+
		"\u0180\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0184\3\2\2\2\u0188\31\3\2\2"+
		"\2\u0189\u0191\b\16\1\2\u018a\u018b\7\u00b9\2\2\u018b\u018c\7\u0208\2"+
		"\2\u018c\u0191\b\16\1\2\u018d\u018e\7\u00ba\2\2\u018e\u018f\7\u0208\2"+
		"\2\u018f\u0191\b\16\1\2\u0190\u0189\3\2\2\2\u0190\u018a\3\2\2\2\u0190"+
		"\u018d\3\2\2\2\u0191\33\3\2\2\2\u0192\u0193\7\u021e\2\2\u0193\u0194\b"+
		"\17\1\2\u0194\35\3\2\2\2\u0195\u0196\7\u0083\2\2\u0196\u0197\7\u01af\2"+
		"\2\u0197\u0198\5n8\2\u0198\u0199\5\u00c6d\2\u0199\u019a\5 \21\2\u019a"+
		"\u019b\b\20\1\2\u019b\37\3\2\2\2\u019c\u01a0\b\21\1\2\u019d\u019e\7\u014b"+
		"\2\2\u019e\u01a0\b\21\1\2\u019f\u019c\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"!\3\2\2\2\u01a1\u01a2\7Z\2\2\u01a2\u01a3\5p9\2\u01a3\u01a4\7\u01af\2\2"+
		"\u01a4\u01a5\5l\67\2\u01a5\u01a6\5\u00c6d\2\u01a6\u01a7\5$\23\2\u01a7"+
		"\u01a8\5&\24\2\u01a8\u01a9\5(\25\2\u01a9\u01aa\5,\27\2\u01aa\u01ab\5\60"+
		"\31\2\u01ab\u01ac\5\66\34\2\u01ac\u01ad\5<\37\2\u01ad\u01ae\5N(\2\u01ae"+
		"\u01af\5P)\2\u01af\u01b0\5R*\2\u01b0\u01b1\5V,\2\u01b1\u01b2\b\22\1\2"+
		"\u01b2\u01be\3\2\2\2\u01b3\u01b4\7Z\2\2\u01b4\u01b5\5p9\2\u01b5\u01b6"+
		"\7\u01af\2\2\u01b6\u01b7\5l\67\2\u01b7\u01b8\5\u00c6d\2\u01b8\u01b9\7"+
		"\u00ea\2\2\u01b9\u01ba\5\u00c6d\2\u01ba\u01bb\5P)\2\u01bb\u01bc\b\22\1"+
		"\2\u01bc\u01be\3\2\2\2\u01bd\u01a1\3\2\2\2\u01bd\u01b3\3\2\2\2\u01be#"+
		"\3\2\2\2\u01bf\u01ce\b\23\1\2\u01c0\u01c1\b\23\1\2\u01c1\u01c2\7\u0217"+
		"\2\2\u01c2\u01c7\5Z.\2\u01c3\u01c4\7\u0209\2\2\u01c4\u01c6\5Z.\2\u01c5"+
		"\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7\u021a\2\2\u01cb"+
		"\u01cc\b\23\1\2\u01cc\u01ce\3\2\2\2\u01cd\u01bf\3\2\2\2\u01cd\u01c0\3"+
		"\2\2\2\u01ce%\3\2\2\2\u01cf\u01db\b\24\1\2\u01d0\u01d1\b\24\1\2\u01d1"+
		"\u01d5\5`\61\2\u01d2\u01d4\5`\61\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2"+
		"\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8\u01d9\b\24\1\2\u01d9\u01db\3\2\2\2\u01da\u01cf\3"+
		"\2\2\2\u01da\u01d0\3\2\2\2\u01db\'\3\2\2\2\u01dc\u01e1\b\25\1\2\u01dd"+
		"\u01de\7H\2\2\u01de\u01df\7\u0221\2\2\u01df\u01e1\b\25\1\2\u01e0\u01dc"+
		"\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e1)\3\2\2\2\u01e2\u01e3\5,\27\2\u01e3"+
		"+\3\2\2\2\u01e4\u01f5\b\27\1\2\u01e5\u01e6\b\27\1\2\u01e6\u01e7\7\u0139"+
		"\2\2\u01e7\u01e8\7.\2\2\u01e8\u01e9\7\u0217\2\2\u01e9\u01ee\5.\30\2\u01ea"+
		"\u01eb\7\u0209\2\2\u01eb\u01ed\5.\30\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0"+
		"\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f1\u01f2\7\u021a\2\2\u01f2\u01f3\b\27\1\2\u01f3\u01f5"+
		"\3\2\2\2\u01f4\u01e4\3\2\2\2\u01f4\u01e5\3\2\2\2\u01f5-\3\2\2\2\u01f6"+
		"\u01f7\5|?\2\u01f7\u01f8\5\6\4\2\u01f8\u01f9\b\30\1\2\u01f9\u0201\3\2"+
		"\2\2\u01fa\u01fb\5|?\2\u01fb\u01fc\5\6\4\2\u01fc\u01fd\7H\2\2\u01fd\u01fe"+
		"\7\u0221\2\2\u01fe\u01ff\b\30\1\2\u01ff\u0201\3\2\2\2\u0200\u01f6\3\2"+
		"\2\2\u0200\u01fa\3\2\2\2\u0201/\3\2\2\2\u0202\u0217\b\31\1\2\u0203\u0204"+
		"\b\31\1\2\u0204\u0205\7@\2\2\u0205\u0206\7.\2\2\u0206\u0207\7\u0217\2"+
		"\2\u0207\u020c\5|?\2\u0208\u0209\7\u0209\2\2\u0209\u020b\5|?\2\u020a\u0208"+
		"\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7\u021a\2\2\u0210\u0211"+
		"\5\62\32\2\u0211\u0212\7\u00d4\2\2\u0212\u0213\7\u021f\2\2\u0213\u0214"+
		"\7-\2\2\u0214\u0215\b\31\1\2\u0215\u0217\3\2\2\2\u0216\u0202\3\2\2\2\u0216"+
		"\u0203\3\2\2\2\u0217\61\3\2\2\2\u0218\u022c\b\32\1\2\u0219\u021a\b\32"+
		"\1\2\u021a\u021b\7\u01a4\2\2\u021b\u021c\7.\2\2\u021c\u021d\7\u0217\2"+
		"\2\u021d\u021e\5|?\2\u021e\u0225\5\64\33\2\u021f\u0220\7\u0209\2\2\u0220"+
		"\u0221\5|?\2\u0221\u0222\5\64\33\2\u0222\u0224\3\2\2\2\u0223\u021f\3\2"+
		"\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229\7\u021a\2\2\u0229\u022a"+
		"\b\32\1\2\u022a\u022c\3\2\2\2\u022b\u0218\3\2\2\2\u022b\u0219\3\2\2\2"+
		"\u022c\63\3\2\2\2\u022d\u0233\b\33\1\2\u022e\u022f\7\32\2\2\u022f\u0233"+
		"\b\33\1\2\u0230\u0231\7y\2\2\u0231\u0233\b\33\1\2\u0232\u022d\3\2\2\2"+
		"\u0232\u022e\3\2\2\2\u0232\u0230\3\2\2\2\u0233\65\3\2\2\2\u0234\u0247"+
		"\b\34\1\2\u0235\u0236\b\34\1\2\u0236\u0237\7\u0192\2\2\u0237\u0238\7."+
		"\2\2\u0238\u0239\7\u0217\2\2\u0239\u023e\5|?\2\u023a\u023b\7\u0209\2\2"+
		"\u023b\u023d\5|?\2\u023c\u023a\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c"+
		"\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241"+
		"\u0242\58\35\2\u0242\u0243\7\u021a\2\2\u0243\u0244\5:\36\2\u0244\u0245"+
		"\b\34\1\2\u0245\u0247\3\2\2\2\u0246\u0234\3\2\2\2\u0246\u0235\3\2\2\2"+
		"\u0247\67\3\2\2\2\u0248\u0279\b\35\1\2\u0249\u024a\b\35\1\2\u024a\u024b"+
		"\7\u0129\2\2\u024b\u024c\7\u0217\2\2\u024c\u0251\5\u00c2b\2\u024d\u024e"+
		"\7\u0209\2\2\u024e\u0250\5\u00c2b\2\u024f\u024d\3\2\2\2\u0250\u0253\3"+
		"\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0255\7\u021a\2\2\u0255\u0256\b\35\1\2\u0256\u0279"+
		"\3\2\2\2\u0257\u0258\b\35\1\2\u0258\u0259\7\u0129\2\2\u0259\u025a\7\u0217"+
		"\2\2\u025a\u025b\7\u0217\2\2\u025b\u0260\5\u00c2b\2\u025c\u025d\7\u0209"+
		"\2\2\u025d\u025f\5\u00c2b\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0260\3\2"+
		"\2\2\u0263\u0272\7\u021a\2\2\u0264\u0265\7\u0209\2\2\u0265\u0266\7\u0217"+
		"\2\2\u0266\u026b\5\u00c2b\2\u0267\u0268\7\u0209\2\2\u0268\u026a\5\u00c2"+
		"b\2\u0269\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7\u021a"+
		"\2\2\u026f\u0271\3\2\2\2\u0270\u0264\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0275\u0276\7\u021a\2\2\u0276\u0277\b\35\1\2\u0277\u0279\3\2\2\2"+
		"\u0278\u0248\3\2\2\2\u0278\u0249\3\2\2\2\u0278\u0257\3\2\2\2\u02799\3"+
		"\2\2\2\u027a\u0280\b\36\1\2\u027b\u027c\7\u01a4\2\2\u027c\u027d\7\31\2"+
		"\2\u027d\u027e\7}\2\2\u027e\u0280\b\36\1\2\u027f\u027a\3\2\2\2\u027f\u027b"+
		"\3\2\2\2\u0280;\3\2\2\2\u0281\u0288\b\37\1\2\u0282\u0283\7\u0173\2\2\u0283"+
		"\u0284\7\u00a5\2\2\u0284\u0285\5> \2\u0285\u0286\b\37\1\2\u0286\u0288"+
		"\3\2\2\2\u0287\u0281\3\2\2\2\u0287\u0282\3\2\2\2\u0288=\3\2\2\2\u0289"+
		"\u028a\7w\2\2\u028a\u028b\5@!\2\u028b\u028c\5B\"\2\u028c\u028d\5D#\2\u028d"+
		"\u028e\5F$\2\u028e\u028f\5H%\2\u028f\u0290\b \1\2\u0290\u0297\3\2\2\2"+
		"\u0291\u0292\7\u0181\2\2\u0292\u0293\7\u0221\2\2\u0293\u0294\5J&\2\u0294"+
		"\u0295\b \1\2\u0295\u0297\3\2\2\2\u0296\u0289\3\2\2\2\u0296\u0291\3\2"+
		"\2\2\u0297?\3\2\2\2\u0298\u02a7\b!\1\2\u0299\u029a\7\u009d\2\2\u029a\u029b"+
		"\7\u01b4\2\2\u029b\u029c\7.\2\2\u029c\u029d\7\u0221\2\2\u029d\u02a7\b"+
		"!\1\2\u029e\u029f\7\u009d\2\2\u029f\u02a0\7\u01b4\2\2\u02a0\u02a1\7.\2"+
		"\2\u02a1\u02a2\7\u0221\2\2\u02a2\u02a3\7\u008d\2\2\u02a3\u02a4\7.\2\2"+
		"\u02a4\u02a5\7\u0221\2\2\u02a5\u02a7\b!\1\2\u02a6\u0298\3\2\2\2\u02a6"+
		"\u0299\3\2\2\2\u02a6\u029e\3\2\2\2\u02a7A\3\2\2\2\u02a8\u02b0\b\"\1\2"+
		"\u02a9\u02aa\7F\2\2\u02aa\u02ab\7\u00db\2\2\u02ab\u02ac\7\u01b4\2\2\u02ac"+
		"\u02ad\7.\2\2\u02ad\u02ae\7\u0221\2\2\u02ae\u02b0\b\"\1\2\u02af\u02a8"+
		"\3\2\2\2\u02af\u02a9\3\2\2\2\u02b0C\3\2\2\2\u02b1\u02b9\b#\1\2\u02b2\u02b3"+
		"\7\u00fe\2\2\u02b3\u02b4\7\u00e1\2\2\u02b4\u02b5\7\u01b4\2\2\u02b5\u02b6"+
		"\7.\2\2\u02b6\u02b7\7\u0221\2\2\u02b7\u02b9\b#\1\2\u02b8\u02b1\3\2\2\2"+
		"\u02b8\u02b2\3\2\2\2\u02b9E\3\2\2\2\u02ba\u02c1\b$\1\2\u02bb\u02bc\7\u00ec"+
		"\2\2\u02bc\u02bd\7\u01b4\2\2\u02bd\u02be\7.\2\2\u02be\u02bf\7\u0221\2"+
		"\2\u02bf\u02c1\b$\1\2\u02c0\u02ba\3\2\2\2\u02c0\u02bb\3\2\2\2\u02c1G\3"+
		"\2\2\2\u02c2\u02c9\b%\1\2\u02c3\u02c4\7\u0122\2\2\u02c4\u02c5\7r\2\2\u02c5"+
		"\u02c6\7\31\2\2\u02c6\u02c7\7\u0221\2\2\u02c7\u02c9\b%\1\2\u02c8\u02c2"+
		"\3\2\2\2\u02c8\u02c3\3\2\2\2\u02c9I\3\2\2\2\u02ca\u02e0\b&\1\2\u02cb\u02cc"+
		"\b&\1\2\u02cc\u02cd\7\u01dd\2\2\u02cd\u02ce\7\u0182\2\2\u02ce\u02cf\7"+
		"\u0217\2\2\u02cf\u02d0\5L\'\2\u02d0\u02d1\7\u020d\2\2\u02d1\u02d9\5L\'"+
		"\2\u02d2\u02d3\7\u0209\2\2\u02d3\u02d4\5L\'\2\u02d4\u02d5\7\u020d\2\2"+
		"\u02d5\u02d6\5L\'\2\u02d6\u02d8\3\2\2\2\u02d7\u02d2\3\2\2\2\u02d8\u02db"+
		"\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db"+
		"\u02d9\3\2\2\2\u02dc\u02dd\7\u021a\2\2\u02dd\u02de\b&\1\2\u02de\u02e0"+
		"\3\2\2\2\u02df\u02ca\3\2\2\2\u02df\u02cb\3\2\2\2\u02e0K\3\2\2\2\u02e1"+
		"\u02e2\7\u0221\2\2\u02e2\u02e3\b\'\1\2\u02e3M\3\2\2\2\u02e4\u02f8\b(\1"+
		"\2\u02e5\u02e6\7\u01a4\2\2\u02e6\u02e7\7\31\2\2\u02e7\u02e8\5X-\2\u02e8"+
		"\u02e9\b(\1\2\u02e9\u02f8\3\2\2\2\u02ea\u02eb\7\u01a4\2\2\u02eb\u02ec"+
		"\7\31\2\2\u02ec\u02ed\7\u00ca\2\2\u02ed\u02ee\7\u0221\2\2\u02ee\u02ef"+
		"\7\u0131\2\2\u02ef\u02f0\7\u0221\2\2\u02f0\u02f8\b(\1\2\u02f1\u02f2\7"+
		"\u01a4\2\2\u02f2\u02f3\7.\2\2\u02f3\u02f4\7\u0221\2\2\u02f4\u02f5\5J&"+
		"\2\u02f5\u02f6\b(\1\2\u02f6\u02f8\3\2\2\2\u02f7\u02e4\3\2\2\2\u02f7\u02e5"+
		"\3\2\2\2\u02f7\u02ea\3\2\2\2\u02f7\u02f1\3\2\2\2\u02f8O\3\2\2\2\u02f9"+
		"\u02fe\b)\1\2\u02fa\u02fb\7\u00ef\2\2\u02fb\u02fc\7\u0221\2\2\u02fc\u02fe"+
		"\b)\1\2\u02fd\u02f9\3\2\2\2\u02fd\u02fa\3\2\2\2\u02feQ\3\2\2\2\u02ff\u030f"+
		"\b*\1\2\u0300\u0301\b*\1\2\u0301\u0302\7\u01b2\2\2\u0302\u0303\7\u0217"+
		"\2\2\u0303\u0304\5T+\2\u0304\u0305\7\u020d\2\2\u0305\u0306\5T+\2\u0306"+
		"\u0307\7\u0209\2\2\u0307\u0308\5T+\2\u0308\u0309\7\u020d\2\2\u0309\u030a"+
		"\5T+\2\u030a\u030b\3\2\2\2\u030b\u030c\7\u021a\2\2\u030c\u030d\b*\1\2"+
		"\u030d\u030f\3\2\2\2\u030e\u02ff\3\2\2\2\u030e\u0300\3\2\2\2\u030fS\3"+
		"\2\2\2\u0310\u0311\7\u0221\2\2\u0311\u0312\b+\1\2\u0312U\3\2\2\2\u0313"+
		"\u0319\b,\1\2\u0314\u0315\7\31\2\2\u0315\u0316\5x=\2\u0316\u0317\b,\1"+
		"\2\u0317\u0319\3\2\2\2\u0318\u0313\3\2\2\2\u0318\u0314\3\2\2\2\u0319W"+
		"\3\2\2\2\u031a\u031b\7\u0186\2\2\u031b\u0329\b-\1\2\u031c\u031d\7\u01b5"+
		"\2\2\u031d\u0329\b-\1\2\u031e\u031f\7\u0154\2\2\u031f\u0329\b-\1\2\u0320"+
		"\u0321\7\u012d\2\2\u0321\u0329\b-\1\2\u0322\u0323\7\u0136\2\2\u0323\u0329"+
		"\b-\1\2\u0324\u0325\7\"\2\2\u0325\u0329\b-\1\2\u0326\u0327\7\u00de\2\2"+
		"\u0327\u0329\b-\1\2\u0328\u031a\3\2\2\2\u0328\u031c\3\2\2\2\u0328\u031e"+
		"\3\2\2\2\u0328\u0320\3\2\2\2\u0328\u0322\3\2\2\2\u0328\u0324\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0329Y\3\2\2\2\u032a\u032b\5|?\2\u032b\u032c\5\6\4\2\u032c"+
		"\u032d\b.\1\2\u032d\u034b\3\2\2\2\u032e\u032f\5|?\2\u032f\u0330\5\6\4"+
		"\2\u0330\u0331\7H\2\2\u0331\u0332\7\u0221\2\2\u0332\u0333\b.\1\2\u0333"+
		"\u034b\3\2\2\2\u0334\u0335\b.\1\2\u0335\u0336\5|?\2\u0336\u0338\5\6\4"+
		"\2\u0337\u0339\5\\/\2\u0338\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u0338"+
		"\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\7H\2\2\u033d"+
		"\u033e\7\u0221\2\2\u033e\u033f\b.\1\2\u033f\u034b\3\2\2\2\u0340\u0341"+
		"\b.\1\2\u0341\u0342\5|?\2\u0342\u0344\5\6\4\2\u0343\u0345\5\\/\2\u0344"+
		"\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2"+
		"\2\2\u0347\u0348\3\2\2\2\u0348\u0349\b.\1\2\u0349\u034b\3\2\2\2\u034a"+
		"\u032a\3\2\2\2\u034a\u032e\3\2\2\2\u034a\u0334\3\2\2\2\u034a\u0340\3\2"+
		"\2\2\u034b[\3\2\2\2\u034c\u034d\7\u0147\2\2\u034d\u034e\7\u00e0\2\2\u034e"+
		"\u0367\b/\1\2\u034f\u0350\7\u01c9\2\2\u0350\u0367\b/\1\2\u0351\u0352\7"+
		"\u011e\2\2\u0352\u0353\7\u0122\2\2\u0353\u0367\b/\1\2\u0354\u0355\7p\2"+
		"\2\u0355\u0356\5^\60\2\u0356\u0357\b/\1\2\u0357\u0367\3\2\2\2\u0358\u0359"+
		"\7<\2\2\u0359\u035a\5\u00a0Q\2\u035a\u035b\b/\1\2\u035b\u0367\3\2\2\2"+
		"\u035c\u035d\7\u0089\2\2\u035d\u0367\b/\1\2\u035e\u035f\7~\2\2\u035f\u0367"+
		"\b/\1\2\u0360\u0361\7\u0120\2\2\u0361\u0367\b/\1\2\u0362\u0363\7\u0164"+
		"\2\2\u0363\u0367\b/\1\2\u0364\u0365\7\u011d\2\2\u0365\u0367\b/\1\2\u0366"+
		"\u034c\3\2\2\2\u0366\u034f\3\2\2\2\u0366\u0351\3\2\2\2\u0366\u0354\3\2"+
		"\2\2\u0366\u0358\3\2\2\2\u0366\u035c\3\2\2\2\u0366\u035e\3\2\2\2\u0366"+
		"\u0360\3\2\2\2\u0366\u0362\3\2\2\2\u0366\u0364\3\2\2\2\u0367]\3\2\2\2"+
		"\u0368\u0373\5\u00c2b\2\u0369\u036a\7\u01f1\2\2\u036a\u036b\7\u0217\2"+
		"\2\u036b\u0373\7\u021a\2\2\u036c\u036d\7\u01ef\2\2\u036d\u036e\7\u0217"+
		"\2\2\u036e\u0373\7\u021a\2\2\u036f\u0370\7\u01f0\2\2\u0370\u0371\7\u0217"+
		"\2\2\u0371\u0373\7\u021a\2\2\u0372\u0368\3\2\2\2\u0372\u0369\3\2\2\2\u0372"+
		"\u036c\3\2\2\2\u0372\u036f\3\2\2\2\u0373_\3\2\2\2\u0374\u0375\b\61\1\2"+
		"\u0375\u0376\7\u0147\2\2\u0376\u0377\7\u00e0\2\2\u0377\u0378\7\u0217\2"+
		"\2\u0378\u037d\5|?\2\u0379\u037a\7\u0209\2\2\u037a\u037c\5|?\2\u037b\u0379"+
		"\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"\u0380\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u0381\7\u021a\2\2\u0381\u0382"+
		"\5f\64\2\u0382\u0383\5h\65\2\u0383\u0384\5j\66\2\u0384\u0385\b\61\1\2"+
		"\u0385\u03c2\3\2\2\2\u0386\u0387\b\61\1\2\u0387\u0388\7O\2\2\u0388\u0389"+
		"\7\u021e\2\2\u0389\u038a\7\u00a4\2\2\u038a\u038b\7\u00e0\2\2\u038b\u038c"+
		"\7\u0217\2\2\u038c\u0391\5|?\2\u038d\u038e\7\u0209\2\2\u038e\u0390\5|"+
		"?\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u0395\7\u021a"+
		"\2\2\u0395\u0396\7\u0156\2\2\u0396\u0397\5\u00c6d\2\u0397\u0398\7\u0217"+
		"\2\2\u0398\u039d\5|?\2\u0399\u039a\7\u0209\2\2\u039a\u039c\5|?\2\u039b"+
		"\u0399\3\2\2\2\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2"+
		"\2\2\u039e\u03a0\3\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03a1\7\u021a\2\2\u03a1"+
		"\u03a2\5f\64\2\u03a2\u03a3\5h\65\2\u03a3\u03a4\b\61\1\2\u03a4\u03c2\3"+
		"\2\2\2\u03a5\u03a6\b\61\1\2\u03a6\u03a7\7O\2\2\u03a7\u03a8\7\u021e\2\2"+
		"\u03a8\u03a9\7\u01c9\2\2\u03a9\u03aa\7\u0217\2\2\u03aa\u03af\5|?\2\u03ab"+
		"\u03ac\7\u0209\2\2\u03ac\u03ae\5|?\2\u03ad\u03ab\3\2\2\2\u03ae\u03b1\3"+
		"\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1"+
		"\u03af\3\2\2\2\u03b2\u03b3\7\u021a\2\2\u03b3\u03b4\5f\64\2\u03b4\u03b5"+
		"\5h\65\2\u03b5\u03b6\5j\66\2\u03b6\u03b7\b\61\1\2\u03b7\u03c2\3\2\2\2"+
		"\u03b8\u03b9\7O\2\2\u03b9\u03ba\7\u021e\2\2\u03ba\u03bb\7<\2\2\u03bb\u03bc"+
		"\5\u00a0Q\2\u03bc\u03bd\5b\62\2\u03bd\u03be\5h\65\2\u03be\u03bf\5j\66"+
		"\2\u03bf\u03c0\b\61\1\2\u03c0\u03c2\3\2\2\2\u03c1\u0374\3\2\2\2\u03c1"+
		"\u0386\3\2\2\2\u03c1\u03a5\3\2\2\2\u03c1\u03b8\3\2\2\2\u03c2a\3\2\2\2"+
		"\u03c3\u03c9\b\62\1\2\u03c4\u03c5\7\u0089\2\2\u03c5\u03c9\b\62\1\2\u03c6"+
		"\u03c7\7~\2\2\u03c7\u03c9\b\62\1\2\u03c8\u03c3\3\2\2\2\u03c8\u03c4\3\2"+
		"\2\2\u03c8\u03c6\3\2\2\2\u03c9c\3\2\2\2\u03ca\u03ce\b\63\1\2\u03cb\u03cc"+
		"\7\u0089\2\2\u03cc\u03ce\b\63\1\2\u03cd\u03ca\3\2\2\2\u03cd\u03cb\3\2"+
		"\2\2\u03cee\3\2\2\2\u03cf\u03d3\b\64\1\2\u03d0\u03d1\7~\2\2\u03d1\u03d3"+
		"\b\64\1\2\u03d2\u03cf\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3g\3\2\2\2\u03d4"+
		"\u03d8\b\65\1\2\u03d5\u03d6\7\u0120\2\2\u03d6\u03d8\b\65\1\2\u03d7\u03d4"+
		"\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8i\3\2\2\2\u03d9\u03df\b\66\1\2\u03da"+
		"\u03db\7\u0164\2\2\u03db\u03df\b\66\1\2\u03dc\u03dd\7\u011d\2\2\u03dd"+
		"\u03df\b\66\1\2\u03de\u03d9\3\2\2\2\u03de\u03da\3\2\2\2\u03de\u03dc\3"+
		"\2\2\2\u03dfk\3\2\2\2\u03e0\u03e6\b\67\1\2\u03e1\u03e2\7\u00be\2\2\u03e2"+
		"\u03e3\7\u011e\2\2\u03e3\u03e4\7\u0093\2\2\u03e4\u03e6\b\67\1\2\u03e5"+
		"\u03e0\3\2\2\2\u03e5\u03e1\3\2\2\2\u03e6m\3\2\2\2\u03e7\u03ec\b8\1\2\u03e8"+
		"\u03e9\7\u00be\2\2\u03e9\u03ea\7\u0093\2\2\u03ea\u03ec\b8\1\2\u03eb\u03e7"+
		"\3\2\2\2\u03eb\u03e8\3\2\2\2\u03eco\3\2\2\2\u03ed\u03f3\b9\1\2\u03ee\u03ef"+
		"\7\u0097\2\2\u03ef\u03f3\b9\1\2\u03f0\u03f1\7\u01b3\2\2\u03f1\u03f3\b"+
		"9\1\2\u03f2\u03ed\3\2\2\2\u03f2\u03ee\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3"+
		"q\3\2\2\2\u03f4\u03f5\5x=\2\u03f5\u03f6\b:\1\2\u03f6\u03fb\3\2\2\2\u03f7"+
		"\u03f8\5t;\2\u03f8\u03f9\b:\1\2\u03f9\u03fb\3\2\2\2\u03fa\u03f4\3\2\2"+
		"\2\u03fa\u03f7\3\2\2\2\u03fbs\3\2\2\2\u03fc\u03fd\b;\1\2\u03fd\u0402\5"+
		"x=\2\u03fe\u03ff\7\u01c7\2\2\u03ff\u0400\5v<\2\u0400\u0401\5x=\2\u0401"+
		"\u0403\3\2\2\2\u0402\u03fe\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0402\3\2"+
		"\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\b;\1\2\u0407"+
		"u\3\2\2\2\u0408\u040e\b<\1\2\u0409\u040a\7\25\2\2\u040a\u040e\b<\1\2\u040b"+
		"\u040c\7\177\2\2\u040c\u040e\b<\1\2\u040d\u0408\3\2\2\2\u040d\u0409\3"+
		"\2\2\2\u040d\u040b\3\2\2\2\u040ew\3\2\2\2\u040f\u0410\7\u0185\2\2\u0410"+
		"\u0411\5\u0092J\2\u0411\u0412\5\u0094K\2\u0412\u0413\b=\1\2\u0413\u0427"+
		"\3\2\2\2\u0414\u0415\7\u0185\2\2\u0415\u0416\5\u0092J\2\u0416\u0417\5"+
		"\u00be`\2\u0417\u0418\b=\1\2\u0418\u0427\3\2\2\2\u0419\u041a\7\u0185\2"+
		"\2\u041a\u041b\5\u0092J\2\u041b\u041c\5\u0094K\2\u041c\u041d\7\u00a8\2"+
		"\2\u041d\u041e\5\u008aF\2\u041e\u041f\5z>\2\u041f\u0420\5~@\2\u0420\u0421"+
		"\5\u0080A\2\u0421\u0422\5\u0082B\2\u0422\u0423\5\u0084C\2\u0423\u0424"+
		"\5\u0088E\2\u0424\u0425\b=\1\2\u0425\u0427\3\2\2\2\u0426\u040f\3\2\2\2"+
		"\u0426\u0414\3\2\2\2\u0426\u0419\3\2\2\2\u0427y\3\2\2\2\u0428\u043a\b"+
		">\1\2\u0429\u042a\b>\1\2\u042a\u042b\7\u00e4\2\2\u042b\u042c\7\u01d7\2"+
		"\2\u042c\u042d\5\u00be`\2\u042d\u042e\5|?\2\u042e\u042f\7\31\2\2\u042f"+
		"\u0434\5|?\2\u0430\u0431\7\u0209\2\2\u0431\u0433\5|?\2\u0432\u0430\3\2"+
		"\2\2\u0433\u0436\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0437\3\2\2\2\u0436\u0434\3\2\2\2\u0437\u0438\b>\1\2\u0438\u043a\3\2"+
		"\2\2\u0439\u0428\3\2\2\2\u0439\u0429\3\2\2\2\u043a{\3\2\2\2\u043b\u043c"+
		"\7\u021e\2\2\u043c\u043d\b?\1\2\u043d}\3\2\2\2\u043e\u0444\b@\1\2\u043f"+
		"\u0440\7\u01db\2\2\u0440\u0441\5\u00a0Q\2\u0441\u0442\b@\1\2\u0442\u0444"+
		"\3\2\2\2\u0443\u043e\3\2\2\2\u0443\u043f\3\2\2\2\u0444\177\3\2\2\2\u0445"+
		"\u0454\bA\1\2\u0446\u0447\bA\1\2\u0447\u0448\7\u00b1\2\2\u0448\u0449\7"+
		".\2\2\u0449\u044e\5\u00a0Q\2\u044a\u044b\7\u0209\2\2\u044b\u044d\5\u00a0"+
		"Q\2\u044c\u044a\3\2\2\2\u044d\u0450\3\2\2\2\u044e\u044c\3\2\2\2\u044e"+
		"\u044f\3\2\2\2\u044f\u0451\3\2\2\2\u0450\u044e\3\2\2\2\u0451\u0452\bA"+
		"\1\2\u0452\u0454\3\2\2\2\u0453\u0445\3\2\2\2\u0453\u0446\3\2\2\2\u0454"+
		"\u0081\3\2\2\2\u0455\u045b\bB\1\2\u0456\u0457\7\u00b4\2\2\u0457\u0458"+
		"\5\u00a0Q\2\u0458\u0459\bB\1\2\u0459\u045b\3\2\2\2\u045a\u0455\3\2\2\2"+
		"\u045a\u0456\3\2\2\2\u045b\u0083\3\2\2\2\u045c\u046e\bC\1\2\u045d\u045e"+
		"\bC\1\2\u045e\u045f\7\u012e\2\2\u045f\u0460\7.\2\2\u0460\u0461\5\u00c4"+
		"c\2\u0461\u0468\5\u0086D\2\u0462\u0463\7\u0209\2\2\u0463\u0464\5\u00c4"+
		"c\2\u0464\u0465\5\u0086D\2\u0465\u0467\3\2\2\2\u0466\u0462\3\2\2\2\u0467"+
		"\u046a\3\2\2\2\u0468\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046b\3\2"+
		"\2\2\u046a\u0468\3\2\2\2\u046b\u046c\bC\1\2\u046c\u046e\3\2\2\2\u046d"+
		"\u045c\3\2\2\2\u046d\u045d\3\2\2\2\u046e\u0085\3\2\2\2\u046f\u0475\bD"+
		"\1\2\u0470\u0471\7\32\2\2\u0471\u0475\bD\1\2\u0472\u0473\7y\2\2\u0473"+
		"\u0475\bD\1\2\u0474\u046f\3\2\2\2\u0474\u0470\3\2\2\2\u0474\u0472\3\2"+
		"\2\2\u0475\u0087\3\2\2\2\u0476\u0480\bE\1\2\u0477\u0478\7\u00eb\2\2\u0478"+
		"\u0479\7\u021f\2\2\u0479\u0480\bE\1\2\u047a\u047b\7\u00eb\2\2\u047b\u047c"+
		"\7\u021f\2\2\u047c\u047d\7\u0209\2\2\u047d\u047e\7\u021f\2\2\u047e\u0480"+
		"\bE\1\2\u047f\u0476\3\2\2\2\u047f\u0477\3\2\2\2\u047f\u047a\3\2\2\2\u0480"+
		"\u0089\3\2\2\2\u0481\u0482\5\u0090I\2\u0482\u0483\bF\1\2\u0483\u0498\3"+
		"\2\2\2\u0484\u0485\bF\1\2\u0485\u0488\5\u0090I\2\u0486\u0487\7\u0209\2"+
		"\2\u0487\u0489\5\u0090I\2\u0488\u0486\3\2\2\2\u0489\u048a\3\2\2\2\u048a"+
		"\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\bF"+
		"\1\2\u048d\u0498\3\2\2\2\u048e\u048f\bF\1\2\u048f\u0491\5\u0090I\2\u0490"+
		"\u0492\5\u008cG\2\u0491\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0491"+
		"\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\bF\1\2\u0496"+
		"\u0498\3\2\2\2\u0497\u0481\3\2\2\2\u0497\u0484\3\2\2\2\u0497\u048e\3\2"+
		"\2\2\u0498\u008b\3\2\2\2\u0499\u049b\7\u00c8\2\2\u049a\u0499\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\7\u00dd\2\2\u049d\u049e"+
		"\5\u0090I\2\u049e\u049f\bG\1\2\u049f\u04bd\3\2\2\2\u04a0\u04a2\7\u00c8"+
		"\2\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3"+
		"\u04a4\7\u00dd\2\2\u04a4\u04a5\5\u0090I\2\u04a5\u04a6\5\u008eH\2\u04a6"+
		"\u04a7\bG\1\2\u04a7\u04bd\3\2\2\2\u04a8\u04aa\t\4\2\2\u04a9\u04ab\7\u0130"+
		"\2\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac"+
		"\u04ad\7\u00dd\2\2\u04ad\u04ae\5\u0090I\2\u04ae\u04af\5\u008eH\2\u04af"+
		"\u04b0\bG\1\2\u04b0\u04bd\3\2\2\2\u04b1\u04b2\7]\2\2\u04b2\u04b3\7\u00dd"+
		"\2\2\u04b3\u04b4\5\u0090I\2\u04b4\u04b5\bG\1\2\u04b5\u04bd\3\2\2\2\u04b6"+
		"\u04b7\7]\2\2\u04b7\u04b8\7\u00dd\2\2\u04b8\u04b9\5\u0090I\2\u04b9\u04ba"+
		"\5\u008eH\2\u04ba\u04bb\bG\1\2\u04bb\u04bd\3\2\2\2\u04bc\u049a\3\2\2\2"+
		"\u04bc\u04a1\3\2\2\2\u04bc\u04a8\3\2\2\2\u04bc\u04b1\3\2\2\2\u04bc\u04b6"+
		"\3\2\2\2\u04bd\u008d\3\2\2\2\u04be\u04bf\7\u0129\2\2\u04bf\u04c0\5\u00a0"+
		"Q\2\u04c0\u04c1\bH\1\2\u04c1\u008f\3\2\2\2\u04c2\u04c3\5\u00c6d\2\u04c3"+
		"\u04c4\bI\1\2\u04c4\u04d6\3\2\2\2\u04c5\u04c7\5\u00c6d\2\u04c6\u04c8\7"+
		"\31\2\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9"+
		"\u04ca\7\u021e\2\2\u04ca\u04cb\bI\1\2\u04cb\u04d6\3\2\2\2\u04cc\u04cd"+
		"\7\u0217\2\2\u04cd\u04ce\5x=\2\u04ce\u04d0\7\u021a\2\2\u04cf\u04d1\7\31"+
		"\2\2\u04d0\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u04d3\7\u021e\2\2\u04d3\u04d4\bI\1\2\u04d4\u04d6\3\2\2\2\u04d5\u04c2"+
		"\3\2\2\2\u04d5\u04c5\3\2\2\2\u04d5\u04cc\3\2\2\2\u04d6\u0091\3\2\2\2\u04d7"+
		"\u04dd\bJ\1\2\u04d8\u04d9\7\25\2\2\u04d9\u04dd\bJ\1\2\u04da\u04db\7\177"+
		"\2\2\u04db\u04dd\bJ\1\2\u04dc\u04d7\3\2\2\2\u04dc\u04d8\3\2\2\2\u04dc"+
		"\u04da\3\2\2\2\u04dd\u0093\3\2\2\2\u04de\u04df\bK\1\2\u04df\u04e4\5\u0096"+
		"L\2\u04e0\u04e1\7\u0209\2\2\u04e1\u04e3\5\u0096L\2\u04e2\u04e0\3\2\2\2"+
		"\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e7"+
		"\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04e8\bK\1\2\u04e8\u0095\3\2\2\2\u04e9"+
		"\u04eb\5\u00a0Q\2\u04ea\u04ec\7\31\2\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec"+
		"\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\7\u021e\2\2\u04ee\u04ef\bL\1"+
		"\2\u04ef\u050e\3\2\2\2\u04f0\u04f1\5\u00a0Q\2\u04f1\u04f2\bL\1\2\u04f2"+
		"\u050e\3\2\2\2\u04f3\u04f5\5\u00a0Q\2\u04f4\u04f6\7\31\2\2\u04f5\u04f4"+
		"\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\7\u021e\2"+
		"\2\u04f8\u04f9\bL\1\2\u04f9\u050e\3\2\2\2\u04fa\u04fb\5\u00a0Q\2\u04fb"+
		"\u04fc\bL\1\2\u04fc\u050e\3\2\2\2\u04fd\u04fe\7\u0215\2\2\u04fe\u050e"+
		"\bL\1\2\u04ff\u0500\7\u021e\2\2\u0500\u0501\7\4\2\2\u0501\u0502\7\u0215"+
		"\2\2\u0502\u050e\bL\1\2\u0503\u0504\5\u0098M\2\u0504\u0505\bL\1\2\u0505"+
		"\u050e\3\2\2\2\u0506\u0508\5\u0098M\2\u0507\u0509\7\31\2\2\u0508\u0507"+
		"\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\7\u021e\2"+
		"\2\u050b\u050c\bL\1\2\u050c\u050e\3\2\2\2\u050d\u04e9\3\2\2\2\u050d\u04f0"+
		"\3\2\2\2\u050d\u04f3\3\2\2\2\u050d\u04fa\3\2\2\2\u050d\u04fd\3\2\2\2\u050d"+
		"\u04ff\3\2\2\2\u050d\u0503\3\2\2\2\u050d\u0506\3\2\2\2\u050e\u0097\3\2"+
		"\2\2\u050f\u0510\bM\1\2\u0510\u0511\5\u009aN\2\u0511\u0512\7\u0132\2\2"+
		"\u0512\u0513\7\u0217\2\2\u0513\u0514\7\u0138\2\2\u0514\u0515\7.\2\2\u0515"+
		"\u051a\5\u00c4c\2\u0516\u0517\7\u0209\2\2\u0517\u0519\5\u00c4c\2\u0518"+
		"\u0516\3\2\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2"+
		"\2\2\u051b\u051d\3\2\2\2\u051c\u051a\3\2\2\2\u051d\u051e\7\u021a\2\2\u051e"+
		"\u051f\bM\1\2\u051f\u054d\3\2\2\2\u0520\u0521\bM\1\2\u0521\u0522\5\u009a"+
		"N\2\u0522\u0523\7\u0132\2\2\u0523\u0524\7\u0217\2\2\u0524\u0525\7\u012e"+
		"\2\2\u0525\u0526\7.\2\2\u0526\u052b\5\u00c4c\2\u0527\u0528\7\u0209\2\2"+
		"\u0528\u052a\5\u00c4c\2\u0529\u0527\3\2\2\2\u052a\u052d\3\2\2\2\u052b"+
		"\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052e\3\2\2\2\u052d\u052b\3\2"+
		"\2\2\u052e\u052f\7\u021a\2\2\u052f\u0530\bM\1\2\u0530\u054d\3\2\2\2\u0531"+
		"\u0532\bM\1\2\u0532\u0533\5\u009aN\2\u0533\u0534\7\u0132\2\2\u0534\u0535"+
		"\7\u0217\2\2\u0535\u0536\7\u0138\2\2\u0536\u0537\7.\2\2\u0537\u053c\5"+
		"\u00c4c\2\u0538\u0539\7\u0209\2\2\u0539\u053b\5\u00c4c\2\u053a\u0538\3"+
		"\2\2\2\u053b\u053e\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d\3\2\2\2\u053d"+
		"\u053f\3\2\2\2\u053e\u053c\3\2\2\2\u053f\u0540\7\u012e\2\2\u0540\u0541"+
		"\7.\2\2\u0541\u0546\5\u00c4c\2\u0542\u0543\7\u0209\2\2\u0543\u0545\5\u00c4"+
		"c\2\u0544\u0542\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544\3\2\2\2\u0546"+
		"\u0547\3\2\2\2\u0547\u0549\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u054a\7\u021a"+
		"\2\2\u054a\u054b\bM\1\2\u054b\u054d\3\2\2\2\u054c\u050f\3\2\2\2\u054c"+
		"\u0520\3\2\2\2\u054c\u0531\3\2\2\2\u054d\u0099\3\2\2\2\u054e\u054f\5\u00ba"+
		"^\2\u054f\u0550\bN\1\2\u0550\u0555\3\2\2\2\u0551\u0552\5\u009cO\2\u0552"+
		"\u0553\bN\1\2\u0553\u0555\3\2\2\2\u0554\u054e\3\2\2\2\u0554\u0551\3\2"+
		"\2\2\u0555\u009b\3\2\2\2\u0556\u0557\t\5\2\2\u0557\u0558\7\u0217\2\2\u0558"+
		"\u0559\7\u021a\2\2\u0559\u055a\bO\1\2\u055a\u009d\3\2\2\2\u055b\u055c"+
		"\bP\1\2\u055c\u055d\7\u0217\2\2\u055d\u0562\5\u00a0Q\2\u055e\u055f\7\u0209"+
		"\2\2\u055f\u0561\5\u00a0Q\2\u0560\u055e\3\2\2\2\u0561\u0564\3\2\2\2\u0562"+
		"\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0565\3\2\2\2\u0564\u0562\3\2"+
		"\2\2\u0565\u0566\7\u021a\2\2\u0566\u0567\bP\1\2\u0567\u009f\3\2\2\2\u0568"+
		"\u0569\bQ\1\2\u0569\u056a\5\u00c2b\2\u056a\u056b\bQ\1\2\u056b\u0597\3"+
		"\2\2\2\u056c\u056d\5\u00c4c\2\u056d\u056e\bQ\1\2\u056e\u0597\3\2\2\2\u056f"+
		"\u0570\5\u00d8m\2\u0570\u0571\5\u00a0Q\16\u0571\u0572\bQ\1\2\u0572\u0597"+
		"\3\2\2\2\u0573\u0574\7\u0217\2\2\u0574\u0575\5\u00a0Q\2\u0575\u0576\7"+
		"\u021a\2\2\u0576\u0577\bQ\1\2\u0577\u0597\3\2\2\2\u0578\u0579\5\u00b8"+
		"]\2\u0579\u057a\bQ\1\2\u057a\u0597\3\2\2\2\u057b\u057c\5\u00c0a\2\u057c"+
		"\u057d\bQ\1\2\u057d\u0597\3\2\2\2\u057e\u057f\5\u00b6\\\2\u057f\u0580"+
		"\bQ\1\2\u0580\u0597\3\2\2\2\u0581\u0582\5\u00b4[\2\u0582\u0583\bQ\1\2"+
		"\u0583\u0597\3\2\2\2\u0584\u0585\5\u00acW\2\u0585\u0586\bQ\1\2\u0586\u0597"+
		"\3\2\2\2\u0587\u0588\5\u00b0Y\2\u0588\u0589\bQ\1\2\u0589\u0597\3\2\2\2"+
		"\u058a\u058b\5\u00aeX\2\u058b\u058c\bQ\1\2\u058c\u0597\3\2\2\2\u058d\u058e"+
		"\5\u00bc_\2\u058e\u058f\bQ\1\2\u058f\u0597\3\2\2\2\u0590\u0591\5\u00a2"+
		"R\2\u0591\u0592\bQ\1\2\u0592\u0597\3\2\2\2\u0593\u0594\5\24\13\2\u0594"+
		"\u0595\bQ\1\2\u0595\u0597\3\2\2\2\u0596\u0568\3\2\2\2\u0596\u056c\3\2"+
		"\2\2\u0596\u056f\3\2\2\2\u0596\u0573\3\2\2\2\u0596\u0578\3\2\2\2\u0596"+
		"\u057b\3\2\2\2\u0596\u057e\3\2\2\2\u0596\u0581\3\2\2\2\u0596\u0584\3\2"+
		"\2\2\u0596\u0587\3\2\2\2\u0596\u058a\3\2\2\2\u0596\u058d\3\2\2\2\u0596"+
		"\u0590\3\2\2\2\u0596\u0593\3\2\2\2\u0597\u05ee\3\2\2\2\u0598\u0599\f\37"+
		"\2\2\u0599\u059a\t\6\2\2\u059a\u059b\5\u00a0Q \u059b\u059c\bQ\1\2\u059c"+
		"\u05ed\3\2\2\2\u059d\u059e\f\36\2\2\u059e\u059f\t\7\2\2\u059f\u05a0\5"+
		"\u00a0Q\37\u05a0\u05a1\bQ\1\2\u05a1\u05ed\3\2\2\2\u05a2\u05a3\f\35\2\2"+
		"\u05a3\u05a4\t\b\2\2\u05a4\u05a5\5\u00a0Q\36\u05a5\u05a6\bQ\1\2\u05a6"+
		"\u05ed\3\2\2\2\u05a7\u05a8\f\34\2\2\u05a8\u05a9\t\t\2\2\u05a9\u05aa\5"+
		"\u00a0Q\35\u05aa\u05ab\bQ\1\2\u05ab\u05ed\3\2\2\2\u05ac\u05ad\f\33\2\2"+
		"\u05ad\u05ae\t\n\2\2\u05ae\u05af\5\u00a0Q\34\u05af\u05b0\bQ\1\2\u05b0"+
		"\u05ed\3\2\2\2\u05b1\u05b2\f\32\2\2\u05b2\u05b3\7\27\2\2\u05b3\u05b4\5"+
		"\u00a0Q\33\u05b4\u05b5\bQ\1\2\u05b5\u05ed\3\2\2\2\u05b6\u05b7\f\31\2\2"+
		"\u05b7\u05b8\7\u012c\2\2\u05b8\u05b9\5\u00a0Q\32\u05b9\u05ba\bQ\1\2\u05ba"+
		"\u05ed\3\2\2\2\u05bb\u05bc\f\26\2\2\u05bc\u05bd\7%\2\2\u05bd\u05be\5\u00a0"+
		"Q\2\u05be\u05bf\7\27\2\2\u05bf\u05c0\5\u00a0Q\27\u05c0\u05c1\bQ\1\2\u05c1"+
		"\u05ed\3\2\2\2\u05c2\u05c3\f\25\2\2\u05c3\u05c4\7\u011e\2\2\u05c4\u05c5"+
		"\7%\2\2\u05c5\u05c6\5\u00a0Q\2\u05c6\u05c7\7\27\2\2\u05c7\u05c8\5\u00a0"+
		"Q\26\u05c8\u05c9\bQ\1\2\u05c9\u05ed\3\2\2\2\u05ca\u05cb\f\21\2\2\u05cb"+
		"\u05cc\5\u00d2j\2\u05cc\u05cd\5\u00a0Q\22\u05cd\u05ce\bQ\1\2\u05ce\u05ed"+
		"\3\2\2\2\u05cf\u05d0\f\30\2\2\u05d0\u05d1\5\u00d0i\2\u05d1\u05d2\7\17"+
		"\2\2\u05d2\u05d3\bQ\1\2\u05d3\u05ed\3\2\2\2\u05d4\u05d5\f\27\2\2\u05d5"+
		"\u05d6\5\u00d0i\2\u05d6\u05d7\7\16\2\2\u05d7\u05d8\bQ\1\2\u05d8\u05ed"+
		"\3\2\2\2\u05d9\u05da\f\24\2\2\u05da\u05db\5\u00d4k\2\u05db\u05dc\5\u009e"+
		"P\2\u05dc\u05dd\bQ\1\2\u05dd\u05ed\3\2\2\2\u05de\u05df\f\23\2\2\u05df"+
		"\u05e0\5\u00d4k\2\u05e0\u05e1\7\u0217\2\2\u05e1\u05e2\5x=\2\u05e2\u05e3"+
		"\7\u021a\2\2\u05e3\u05e4\bQ\1\2\u05e4\u05ed\3\2\2\2\u05e5\u05e6\f\22\2"+
		"\2\u05e6\u05e7\5\u00d6l\2\u05e7\u05e8\7\u0217\2\2\u05e8\u05e9\5x=\2\u05e9"+
		"\u05ea\7\u021a\2\2\u05ea\u05eb\bQ\1\2\u05eb\u05ed\3\2\2\2\u05ec\u0598"+
		"\3\2\2\2\u05ec\u059d\3\2\2\2\u05ec\u05a2\3\2\2\2\u05ec\u05a7\3\2\2\2\u05ec"+
		"\u05ac\3\2\2\2\u05ec\u05b1\3\2\2\2\u05ec\u05b6\3\2\2\2\u05ec\u05bb\3\2"+
		"\2\2\u05ec\u05c2\3\2\2\2\u05ec\u05ca\3\2\2\2\u05ec\u05cf\3\2\2\2\u05ec"+
		"\u05d4\3\2\2\2\u05ec\u05d9\3\2\2\2\u05ec\u05de\3\2\2\2\u05ec\u05e5\3\2"+
		"\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef"+
		"\u00a1\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f1\u05f2\5\u00a4S\2\u05f2\u05f3"+
		"\bR\1\2\u05f3\u061a\3\2\2\2\u05f4\u05f5\5\u00a6T\2\u05f5\u05f6\bR\1\2"+
		"\u05f6\u061a\3\2\2\2\u05f7\u05f8\5\u00a8U\2\u05f8\u05f9\bR\1\2\u05f9\u061a"+
		"\3\2\2\2\u05fa\u05fb\5\u00aaV\2\u05fb\u05fc\bR\1\2\u05fc\u061a\3\2\2\2"+
		"\u05fd\u05fe\5\u00c4c\2\u05fe\u05ff\7\u0218\2\2\u05ff\u0600\5\u00a0Q\2"+
		"\u0600\u0601\7\u021b\2\2\u0601\u0602\bR\1\2\u0602\u061a\3\2\2\2\u0603"+
		"\u0604\5\u00a4S\2\u0604\u0605\7\u0218\2\2\u0605\u0606\5\u00a0Q\2\u0606"+
		"\u0607\7\u021b\2\2\u0607\u0608\bR\1\2\u0608\u061a\3\2\2\2\u0609\u060a"+
		"\5\u00a6T\2\u060a\u060b\7\u0218\2\2\u060b\u060c\5\u00a0Q\2\u060c\u060d"+
		"\7\u021b\2\2\u060d\u060e\bR\1\2\u060e\u061a\3\2\2\2\u060f\u0610\5\u00c4"+
		"c\2\u0610\u0611\7\4\2\2\u0611\u0612\5\u00a0Q\2\u0612\u0613\bR\1\2\u0613"+
		"\u061a\3\2\2\2\u0614\u0615\5\u00a8U\2\u0615\u0616\7\4\2\2\u0616\u0617"+
		"\5\u00a0Q\2\u0617\u0618\bR\1\2\u0618\u061a\3\2\2\2\u0619\u05f1\3\2\2\2"+
		"\u0619\u05f4\3\2\2\2\u0619\u05f7\3\2\2\2\u0619\u05fa\3\2\2\2\u0619\u05fd"+
		"\3\2\2\2\u0619\u0603\3\2\2\2\u0619\u0609\3\2\2\2\u0619\u060f\3\2\2\2\u0619"+
		"\u0614\3\2\2\2\u061a\u00a3\3\2\2\2\u061b\u061c\bS\1\2\u061c\u061d\7\30"+
		"\2\2\u061d\u061e\7\u0217\2\2\u061e\u0623\5\u00a0Q\2\u061f\u0620\7\u0209"+
		"\2\2\u0620\u0622\5\u00a0Q\2\u0621\u061f\3\2\2\2\u0622\u0625\3\2\2\2\u0623"+
		"\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0626\3\2\2\2\u0625\u0623\3\2"+
		"\2\2\u0626\u0627\7\u021a\2\2\u0627\u0628\bS\1\2\u0628\u00a5\3\2\2\2\u0629"+
		"\u062a\bT\1\2\u062a\u062b\7\u00fe\2\2\u062b\u062c\7\u0217\2\2\u062c\u062d"+
		"\5\u00a0Q\2\u062d\u062e\7\u0209\2\2\u062e\u0636\5\u00a0Q\2\u062f\u0630"+
		"\7\u0209\2\2\u0630\u0631\5\u00a0Q\2\u0631\u0632\7\u0209\2\2\u0632\u0633"+
		"\5\u00a0Q\2\u0633\u0635\3\2\2\2\u0634\u062f\3\2\2\2\u0635\u0638\3\2\2"+
		"\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0639\3\2\2\2\u0638\u0636"+
		"\3\2\2\2\u0639\u063a\7\u021a\2\2\u063a\u063b\bT\1\2\u063b\u00a7\3\2\2"+
		"\2\u063c\u063d\bU\1\2\u063d\u063e\7\u01a7\2\2\u063e\u063f\7\u0217\2\2"+
		"\u063f\u0644\5\u00a0Q\2\u0640\u0641\7\u0209\2\2\u0641\u0643\5\u00a0Q\2"+
		"\u0642\u0640\3\2\2\2\u0643\u0646\3\2\2\2\u0644\u0642\3\2\2\2\u0644\u0645"+
		"\3\2\2\2\u0645\u0647\3\2\2\2\u0646\u0644\3\2\2\2\u0647\u0648\7\u021a\2"+
		"\2\u0648\u0649\bU\1\2\u0649\u00a9\3\2\2\2\u064a\u064b\bV\1\2\u064b\u064c"+
		"\7\u0112\2\2\u064c\u064d\7\u0217\2\2\u064d\u064e\5\u00a0Q\2\u064e\u064f"+
		"\7\u0209\2\2\u064f\u0657\5\u00a0Q\2\u0650\u0651\7\u0209\2\2\u0651\u0652"+
		"\5\u00a0Q\2\u0652\u0653\7\u0209\2\2\u0653\u0654\5\u00a0Q\2\u0654\u0656"+
		"\3\2\2\2\u0655\u0650\3\2\2\2\u0656\u0659\3\2\2\2\u0657\u0655\3\2\2\2\u0657"+
		"\u0658\3\2\2\2\u0658\u065a\3\2\2\2\u0659\u0657\3\2\2\2\u065a\u065b\7\u021a"+
		"\2\2\u065b\u065c\bV\1\2\u065c\u00ab\3\2\2\2\u065d\u065e\7\33\2\2\u065e"+
		"\u065f\7\u0217\2\2\u065f\u0660\5\u00a0Q\2\u0660\u0661\7\u021a\2\2\u0661"+
		"\u0662\bW\1\2\u0662\u085f\3\2\2\2\u0663\u0664\7#\2\2\u0664\u0665\7\u0217"+
		"\2\2\u0665\u0666\5\u00a0Q\2\u0666\u0667\7\u021a\2\2\u0667\u0668\bW\1\2"+
		"\u0668\u085f\3\2\2\2\u0669\u066a\7:\2\2\u066a\u066b\7\u0217\2\2\u066b"+
		"\u066c\5\u00a0Q\2\u066c\u066d\7\u021a\2\2\u066d\u066e\bW\1\2\u066e\u085f"+
		"\3\2\2\2\u066f\u0670\7=\2\2\u0670\u0671\7\u0217\2\2\u0671\u0672\5\u00a0"+
		"Q\2\u0672\u0673\7\u021a\2\2\u0673\u0674\bW\1\2\u0674\u085f\3\2\2\2\u0675"+
		"\u0676\bW\1\2\u0676\u0677\7L\2\2\u0677\u0678\7\u0217\2\2\u0678\u067b\5"+
		"\u00a0Q\2\u0679\u067a\7\u0209\2\2\u067a\u067c\5\u00a0Q\2\u067b\u0679\3"+
		"\2\2\2\u067c\u067d\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e"+
		"\u067f\3\2\2\2\u067f\u0680\7\u021a\2\2\u0680\u0681\bW\1\2\u0681\u085f"+
		"\3\2\2\2\u0682\u0683\bW\1\2\u0683\u0684\7M\2\2\u0684\u0685\7\u0217\2\2"+
		"\u0685\u0686\5\u00a0Q\2\u0686\u0687\7\u0209\2\2\u0687\u068a\5\u00a0Q\2"+
		"\u0688\u0689\7\u0209\2\2\u0689\u068b\5\u00a0Q\2\u068a\u0688\3\2\2\2\u068b"+
		"\u068c\3\2\2\2\u068c\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e\3\2"+
		"\2\2\u068e\u068f\7\u021a\2\2\u068f\u0690\bW\1\2\u0690\u085f\3\2\2\2\u0691"+
		"\u0692\7n\2\2\u0692\u0693\7\u0217\2\2\u0693\u0694\5\u00a0Q\2\u0694\u0695"+
		"\7\u0209\2\2\u0695\u0696\5\u00a0Q\2\u0696\u0697\7\u021a\2\2\u0697\u0698"+
		"\bW\1\2\u0698\u085f\3\2\2\2\u0699\u069a\bW\1\2\u069a\u069b\7\u0088\2\2"+
		"\u069b\u069c\7\u0217\2\2\u069c\u069d\5\u00a0Q\2\u069d\u069e\7\u0209\2"+
		"\2\u069e\u06a3\5\u00a0Q\2\u069f\u06a0\7\u0209\2\2\u06a0\u06a2\5\u00a0"+
		"Q\2\u06a1\u069f\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a3"+
		"\u06a4\3\2\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6\u06a7\7\u021a"+
		"\2\2\u06a7\u06a8\bW\1\2\u06a8\u085f\3\2\2\2\u06a9\u06aa\7\u008a\2\2\u06aa"+
		"\u06ab\7\u0217\2\2\u06ab\u06ac\5\u00a0Q\2\u06ac\u06ad\7\u0209\2\2\u06ad"+
		"\u06ae\5\u00a0Q\2\u06ae\u06af\7\u021a\2\2\u06af\u06b0\bW\1\2\u06b0\u085f"+
		"\3\2\2\2\u06b1\u06b2\bW\1\2\u06b2\u06b3\7\u009c\2\2\u06b3\u06b4\7\u0217"+
		"\2\2\u06b4\u06b5\5\u00a0Q\2\u06b5\u06b6\7\u0209\2\2\u06b6\u06bb\5\u00a0"+
		"Q\2\u06b7\u06b8\7\u0209\2\2\u06b8\u06ba\5\u00a0Q\2\u06b9\u06b7\3\2\2\2"+
		"\u06ba\u06bd\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be"+
		"\3\2\2\2\u06bd\u06bb\3\2\2\2\u06be\u06bf\7\u021a\2\2\u06bf\u06c0\bW\1"+
		"\2\u06c0\u085f\3\2\2\2\u06c1\u06c2\7\u009e\2\2\u06c2\u06c3\7\u0217\2\2"+
		"\u06c3\u06c4\5\u00a0Q\2\u06c4\u06c5\7\u0209\2\2\u06c5\u06c6\5\u00a0Q\2"+
		"\u06c6\u06c7\7\u021a\2\2\u06c7\u06c8\bW\1\2\u06c8\u085f\3\2\2\2\u06c9"+
		"\u06ca\7\u00a6\2\2\u06ca\u06cb\7\u0217\2\2\u06cb\u06cc\5\u00a0Q\2\u06cc"+
		"\u06cd\7\u0209\2\2\u06cd\u06ce\5\u00a0Q\2\u06ce\u06cf\7\u021a\2\2\u06cf"+
		"\u06d0\bW\1\2\u06d0\u085f\3\2\2\2\u06d1\u06d2\7\u00ad\2\2\u06d2\u06d3"+
		"\7\u0217\2\2\u06d3\u06d4\5\u00a0Q\2\u06d4\u06d5\7\u0209\2\2\u06d5\u06d6"+
		"\5\u00a0Q\2\u06d6\u06d7\7\u021a\2\2\u06d7\u06d8\bW\1\2\u06d8\u085f\3\2"+
		"\2\2\u06d9\u06da\7\u00c4\2\2\u06da\u06db\7\u0217\2\2\u06db\u06dc\5\u00a0"+
		"Q\2\u06dc\u06dd\7\u0209\2\2\u06dd\u06de\5\u00a0Q\2\u06de\u06df\7\u021a"+
		"\2\2\u06df\u06e0\bW\1\2\u06e0\u085f\3\2\2\2\u06e1\u06e2\7\u00cc\2\2\u06e2"+
		"\u06e3\7\u0217\2\2\u06e3\u06e4\5\u00a0Q\2\u06e4\u06e5\7\u0209\2\2\u06e5"+
		"\u06e6\5\u00a0Q\2\u06e6\u06e7\7\u021a\2\2\u06e7\u06e8\bW\1\2\u06e8\u085f"+
		"\3\2\2\2\u06e9\u06ea\7\u00e8\2\2\u06ea\u06eb\7\u0217\2\2\u06eb\u06ec\5"+
		"\u00a0Q\2\u06ec\u06ed\7\u021a\2\2\u06ed\u06ee\bW\1\2\u06ee\u085f\3\2\2"+
		"\2\u06ef\u06f0\7\u00ee\2\2\u06f0\u06f1\7\u0217\2\2\u06f1\u06f2\5\u00a0"+
		"Q\2\u06f2\u06f3\7\u0209\2\2\u06f3\u06f4\5\u00a0Q\2\u06f4\u06f5\7\u021a"+
		"\2\2\u06f5\u06f6\bW\1\2\u06f6\u085f\3\2\2\2\u06f7\u06f8\7\u00ee\2\2\u06f8"+
		"\u06f9\7\u0217\2\2\u06f9\u06fa\5\u00a0Q\2\u06fa\u06fb\7\u0209\2\2\u06fb"+
		"\u06fc\5\u00a0Q\2\u06fc\u06fd\7\u0209\2\2\u06fd\u06fe\5\u00a0Q\2\u06fe"+
		"\u06ff\7\u021a\2\2\u06ff\u0700\bW\1\2\u0700\u085f\3\2\2\2\u0701\u0702"+
		"\t\13\2\2\u0702\u0703\7\u0217\2\2\u0703\u0704\5\u00a0Q\2\u0704\u0705\7"+
		"\u021a\2\2\u0705\u0706\bW\1\2\u0706\u085f\3\2\2\2\u0707\u0708\7\u00fb"+
		"\2\2\u0708\u0709\7\u0217\2\2\u0709\u070a\5\u00a0Q\2\u070a\u070b\7\u0209"+
		"\2\2\u070b\u070c\5\u00a0Q\2\u070c\u070d\7\u0209\2\2\u070d\u070e\5\u00a0"+
		"Q\2\u070e\u070f\7\u021a\2\2\u070f\u0710\bW\1\2\u0710\u085f\3\2\2\2\u0711"+
		"\u0712\7\u00fd\2\2\u0712\u0713\7\u0217\2\2\u0713\u0714\5\u00a0Q\2\u0714"+
		"\u0715\7\u021a\2\2\u0715\u0716\bW\1\2\u0716\u085f\3\2\2\2\u0717\u0718"+
		"\7\u0127\2\2\u0718\u0719\7\u0217\2\2\u0719\u071a\5\u00a0Q\2\u071a\u071b"+
		"\7\u021a\2\2\u071b\u071c\bW\1\2\u071c\u085f\3\2\2\2\u071d\u071e\7\u0137"+
		"\2\2\u071e\u071f\7\u0217\2\2\u071f\u0720\5\u00a0Q\2\u0720\u0721\7\u0209"+
		"\2\2\u0721\u0722\5\u00a0Q\2\u0722\u0723\7\u021a\2\2\u0723\u0724\bW\1\2"+
		"\u0724\u085f\3\2\2\2\u0725\u0726\7\u0137\2\2\u0726\u0727\7\u0217\2\2\u0727"+
		"\u0728\5\u00a0Q\2\u0728\u0729\7\u0209\2\2\u0729\u072a\5\u00a0Q\2\u072a"+
		"\u072b\7\u0209\2\2\u072b\u072c\5\u00a0Q\2\u072c\u072d\7\u021a\2\2\u072d"+
		"\u072e\bW\1\2\u072e\u085f\3\2\2\2\u072f\u0730\bW\1\2\u0730\u0731\7\u0148"+
		"\2\2\u0731\u0732\7\u0217\2\2\u0732\u0733\5\u00a0Q\2\u0733\u0734\7\u0209"+
		"\2\2\u0734\u0737\5\u00a0Q\2\u0735\u0736\7\u0209\2\2\u0736\u0738\5\u00a0"+
		"Q\2\u0737\u0735\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u0737\3\2\2\2\u0739"+
		"\u073a\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073c\7\u021a\2\2\u073c\u073d"+
		"\bW\1\2\u073d\u085f\3\2\2\2\u073e\u073f\7\u0150\2\2\u073f\u0740\7\u0217"+
		"\2\2\u0740\u0741\5\u00a0Q\2\u0741\u0742\7\u021a\2\2\u0742\u0743\bW\1\2"+
		"\u0743\u085f\3\2\2\2\u0744\u0745\7\u0159\2\2\u0745\u0746\7\u0217\2\2\u0746"+
		"\u0747\5\u00a0Q\2\u0747\u0748\7\u0209\2\2\u0748\u0749\5\u00a0Q\2\u0749"+
		"\u074a\7\u0209\2\2\u074a\u074b\5\u00a0Q\2\u074b\u074c\7\u021a\2\2\u074c"+
		"\u074d\bW\1\2\u074d\u085f\3\2\2\2\u074e\u074f\7\u015a\2\2\u074f\u0750"+
		"\7\u0217\2\2\u0750\u0751\5\u00a0Q\2\u0751\u0752\7\u0209\2\2\u0752\u0753"+
		"\5\u00a0Q\2\u0753\u0754\7\u0209\2\2\u0754\u0755\5\u00a0Q\2\u0755\u0756"+
		"\7\u021a\2\2\u0756\u0757\bW\1\2\u0757\u085f\3\2\2\2\u0758\u0759\7\u0165"+
		"\2\2\u0759\u075a\7\u0217\2\2\u075a\u075b\5\u00a0Q\2\u075b\u075c\7\u0209"+
		"\2\2\u075c\u075d\5\u00a0Q\2\u075d\u075e\7\u021a\2\2\u075e\u075f\bW\1\2"+
		"\u075f\u085f\3\2\2\2\u0760\u0761\7\u0166\2\2\u0761\u0762\7\u0217\2\2\u0762"+
		"\u0763\5\u00a0Q\2\u0763\u0764\7\u0209\2\2\u0764\u0765\5\u00a0Q\2\u0765"+
		"\u0766\7\u0209\2\2\u0766\u0767\5\u00a0Q\2\u0767\u0768\7\u021a\2\2\u0768"+
		"\u0769\bW\1\2\u0769\u085f\3\2\2\2\u076a\u076b\7\u016d\2\2\u076b\u076c"+
		"\7\u0217\2\2\u076c\u076d\5\u00a0Q\2\u076d\u076e\7\u021a\2\2\u076e\u076f"+
		"\bW\1\2\u076f\u085f\3\2\2\2\u0770\u0771\7\u0177\2\2\u0771\u0772\7\u0217"+
		"\2\2\u0772\u0773\5\u00a0Q\2\u0773\u0774\7\u0209\2\2\u0774\u0775\5\u00a0"+
		"Q\2\u0775\u0776\7\u0209\2\2\u0776\u0777\5\u00a0Q\2\u0777\u0778\7\u021a"+
		"\2\2\u0778\u0779\bW\1\2\u0779\u085f\3\2\2\2\u077a\u077b\7\u017a\2\2\u077b"+
		"\u077c\7\u0217\2\2\u077c\u077d\5\u00a0Q\2\u077d\u077e\7\u021a\2\2\u077e"+
		"\u077f\bW\1\2\u077f\u085f\3\2\2\2\u0780\u0781\7\u0187\2\2\u0781\u0782"+
		"\7\u0217\2\2\u0782\u0783\5\u00a0Q\2\u0783\u0784\7\u0209\2\2\u0784\u0785"+
		"\5\u00a0Q\2\u0785\u0786\7\u0209\2\2\u0786\u0787\5\u00a0Q\2\u0787\u0788"+
		"\7\u021a\2\2\u0788\u0789\bW\1\2\u0789\u085f\3\2\2\2\u078a\u078b\7\u0196"+
		"\2\2\u078b\u078c\7\u0217\2\2\u078c\u078d\5\u00a0Q\2\u078d\u078e\7\u021a"+
		"\2\2\u078e\u078f\bW\1\2\u078f\u085f\3\2\2\2\u0790\u0791\7\u0197\2\2\u0791"+
		"\u0792\7\u0217\2\2\u0792\u0793\5\u00a0Q\2\u0793\u0794\7\u0209\2\2\u0794"+
		"\u0795\5\u00a0Q\2\u0795\u0796\7\u021a\2\2\u0796\u0797\bW\1\2\u0797\u085f"+
		"\3\2\2\2\u0798\u0799\7\u01a6\2\2\u0799\u079a\7\u0217\2\2\u079a\u079b\5"+
		"\u00a0Q\2\u079b\u079c\7\u021a\2\2\u079c\u079d\bW\1\2\u079d\u085f\3\2\2"+
		"\2\u079e\u079f\7\u01a6\2\2\u079f\u07a0\7\u0217\2\2\u07a0\u07a1\5\u00a0"+
		"Q\2\u07a1\u07a2\7\u0209\2\2\u07a2\u07a3\5\u00a0Q\2\u07a3\u07a4\7\u021a"+
		"\2\2\u07a4\u07a5\bW\1\2\u07a5\u085f\3\2\2\2\u07a6\u07a7\7\u01a6\2\2\u07a7"+
		"\u07a8\7\u0217\2\2\u07a8\u07a9\5\u00a0Q\2\u07a9\u07aa\7\u0209\2\2\u07aa"+
		"\u07ab\5\u00a0Q\2\u07ab\u07ac\7\u0209\2\2\u07ac\u07ad\5\u00a0Q\2\u07ad"+
		"\u07ae\7\u021a\2\2\u07ae\u07af\bW\1\2\u07af\u085f\3\2\2\2\u07b0\u07b1"+
		"\t\f\2\2\u07b1\u07b2\7\u0217\2\2\u07b2\u07b3\5\u00a0Q\2\u07b3\u07b4\7"+
		"\u0209\2\2\u07b4\u07b5\5\u00a0Q\2\u07b5\u07b6\7\u021a\2\2\u07b6\u07b7"+
		"\bW\1\2\u07b7\u085f\3\2\2\2\u07b8\u07b9\t\f\2\2\u07b9\u07ba\7\u0217\2"+
		"\2\u07ba\u07bb\5\u00a0Q\2\u07bb\u07bc\7\u0209\2\2\u07bc\u07bd\5\u00a0"+
		"Q\2\u07bd\u07be\7\u0209\2\2\u07be\u07bf\5\u00a0Q\2\u07bf\u07c0\7\u021a"+
		"\2\2\u07c0\u07c1\bW\1\2\u07c1\u085f\3\2\2\2\u07c2\u07c3\7\u01ab\2\2\u07c3"+
		"\u07c4\7\u0217\2\2\u07c4\u07c5\5\u00a0Q\2\u07c5\u07c6\7\u0209\2\2\u07c6"+
		"\u07c7\5\u00a0Q\2\u07c7\u07c8\7\u0209\2\2\u07c8\u07c9\5\u00a0Q\2\u07c9"+
		"\u07ca\7\u021a\2\2\u07ca\u07cb\bW\1\2\u07cb\u085f\3\2\2\2\u07cc\u07cd"+
		"\7\u01bf\2\2\u07cd\u07ce\7\u0217\2\2\u07ce\u07cf\5\u00a0Q\2\u07cf\u07d0"+
		"\7\u0209\2\2\u07d0\u07d1\5\u00a0Q\2\u07d1\u07d2\7\u0209\2\2\u07d2\u07d3"+
		"\5\u00a0Q\2\u07d3\u07d4\7\u021a\2\2\u07d4\u07d5\bW\1\2\u07d5\u085f\3\2"+
		"\2\2\u07d6\u07d7\7\u017c\2\2\u07d7\u07d8\7\u0217\2\2\u07d8\u07d9\5\u00a0"+
		"Q\2\u07d9\u07da\7\u021a\2\2\u07da\u07db\bW\1\2\u07db\u085f\3\2\2\2\u07dc"+
		"\u07dd\7\u01c5\2\2\u07dd\u07de\7\u0217\2\2\u07de\u07df\5\u00a0Q\2\u07df"+
		"\u07e0\7\u021a\2\2\u07e0\u07e1\bW\1\2\u07e1\u085f\3\2\2\2\u07e2\u07e3"+
		"\t\r\2\2\u07e3\u07e4\7\u0217\2\2\u07e4\u07e5\5\u00a0Q\2\u07e5\u07e6\7"+
		"\u021a\2\2\u07e6\u07e7\bW\1\2\u07e7\u085f\3\2\2\2\u07e8\u07e9\7\u00c5"+
		"\2\2\u07e9\u07ea\7\u0217\2\2\u07ea\u07eb\5\u00a0Q\2\u07eb\u07ec\7\u021a"+
		"\2\2\u07ec\u07ed\bW\1\2\u07ed\u085f\3\2\2\2\u07ee\u07ef\7\u00e9\2\2\u07ef"+
		"\u07f0\7\u0217\2\2\u07f0\u07f1\5\u00a0Q\2\u07f1\u07f2\7\u0209\2\2\u07f2"+
		"\u07f3\5\u00a0Q\2\u07f3\u07f4\7\u021a\2\2\u07f4\u07f5\bW\1\2\u07f5\u085f"+
		"\3\2\2\2\u07f6\u07f7\7\u0195\2\2\u07f7\u07f8\7\u0217\2\2\u07f8\u07f9\5"+
		"\u00a0Q\2\u07f9\u07fa\7\u021a\2\2\u07fa\u07fb\bW\1\2\u07fb\u085f\3\2\2"+
		"\2\u07fc\u07fd\7\u00ff\2\2\u07fd\u07fe\7\u0217\2\2\u07fe\u07ff\5\u00a0"+
		"Q\2\u07ff\u0800\7\u021a\2\2\u0800\u0801\bW\1\2\u0801\u085f\3\2\2\2\u0802"+
		"\u0803\7\u00ff\2\2\u0803\u0804\7\u0217\2\2\u0804\u0805\5\u00a0Q\2\u0805"+
		"\u0806\7\u0209\2\2\u0806\u0807\5\u00a0Q\2\u0807\u0808\7\u021a\2\2\u0808"+
		"\u0809\bW\1\2\u0809\u085f\3\2\2\2\u080a\u080b\7\u00ff\2\2\u080b\u080c"+
		"\7\u0217\2\2\u080c\u080d\5\u00a0Q\2\u080d\u080e\7\u0209\2\2\u080e\u080f"+
		"\5\u00a0Q\2\u080f\u0810\7\u0209\2\2\u0810\u0811\5\u00a0Q\2\u0811\u0812"+
		"\7\u021a\2\2\u0812\u0813\bW\1\2\u0813\u085f\3\2\2\2\u0814\u0815\7\u00ff"+
		"\2\2\u0815\u0816\7\u0217\2\2\u0816\u0817\5\u00a0Q\2\u0817\u0818\7\u0209"+
		"\2\2\u0818\u0819\5\u00a0Q\2\u0819\u081a\7\u0209\2\2\u081a\u081b\5\u00a0"+
		"Q\2\u081b\u081c\7\u0209\2\2\u081c\u081d\5\u00a0Q\2\u081d\u081e\7\u021a"+
		"\2\2\u081e\u081f\bW\1\2\u081f\u085f\3\2\2\2\u0820\u0821\7\u0100\2\2\u0821"+
		"\u0822\7\u0217\2\2\u0822\u0823\5\u00a0Q\2\u0823\u0824\7\u021a\2\2\u0824"+
		"\u0825\bW\1\2\u0825\u085f\3\2\2\2\u0826\u0827\7\u0100\2\2\u0827\u0828"+
		"\7\u0217\2\2\u0828\u0829\5\u00a0Q\2\u0829\u082a\7\u0209\2\2\u082a\u082b"+
		"\5\u00a0Q\2\u082b\u082c\7\u021a\2\2\u082c\u082d\bW\1\2\u082d\u085f\3\2"+
		"\2\2\u082e\u082f\7\u0102\2\2\u082f\u0830\7\u0217\2\2\u0830\u0831\5\u00a0"+
		"Q\2\u0831\u0832\7\u021a\2\2\u0832\u0833\bW\1\2\u0833\u085f\3\2\2\2\u0834"+
		"\u0835\7\u0102\2\2\u0835\u0836\7\u0217\2\2\u0836\u0837\5\u00a0Q\2\u0837"+
		"\u0838\7\u0209\2\2\u0838\u0839\5\u00a0Q\2\u0839\u083a\7\u021a\2\2\u083a"+
		"\u083b\bW\1\2\u083b\u085f\3\2\2\2\u083c\u083d\7\u0103\2\2\u083d\u083e"+
		"\7\u0217\2\2\u083e\u083f\5\u00a0Q\2\u083f\u0840\7\u021a\2\2\u0840\u0841"+
		"\bW\1\2\u0841\u085f\3\2\2\2\u0842\u0843\7\u0103\2\2\u0843\u0844\7\u0217"+
		"\2\2\u0844\u0845\5\u00a0Q\2\u0845\u0846\7\u0209\2\2\u0846\u0847\5\u00a0"+
		"Q\2\u0847\u0848\7\u021a\2\2\u0848\u0849\bW\1\2\u0849\u085f\3\2\2\2\u084a"+
		"\u084b\7\u0104\2\2\u084b\u084c\7\u0217\2\2\u084c\u084d\5\u00a0Q\2\u084d"+
		"\u084e\7\u021a\2\2\u084e\u084f\bW\1\2\u084f\u085f\3\2\2\2\u0850\u0851"+
		"\7\u0104\2\2\u0851\u0852\7\u0217\2\2\u0852\u0853\5\u00a0Q\2\u0853\u0854"+
		"\7\u0209\2\2\u0854\u0855\5\u00a0Q\2\u0855\u0856\7\u021a\2\2\u0856\u0857"+
		"\bW\1\2\u0857\u085f\3\2\2\2\u0858\u0859\7\u0101\2\2\u0859\u085a\7\u0217"+
		"\2\2\u085a\u085b\5\u00a0Q\2\u085b\u085c\7\u021a\2\2\u085c\u085d\bW\1\2"+
		"\u085d\u085f\3\2\2\2\u085e\u065d\3\2\2\2\u085e\u0663\3\2\2\2\u085e\u0669"+
		"\3\2\2\2\u085e\u066f\3\2\2\2\u085e\u0675\3\2\2\2\u085e\u0682\3\2\2\2\u085e"+
		"\u0691\3\2\2\2\u085e\u0699\3\2\2\2\u085e\u06a9\3\2\2\2\u085e\u06b1\3\2"+
		"\2\2\u085e\u06c1\3\2\2\2\u085e\u06c9\3\2\2\2\u085e\u06d1\3\2\2\2\u085e"+
		"\u06d9\3\2\2\2\u085e\u06e1\3\2\2\2\u085e\u06e9\3\2\2\2\u085e\u06ef\3\2"+
		"\2\2\u085e\u06f7\3\2\2\2\u085e\u0701\3\2\2\2\u085e\u0707\3\2\2\2\u085e"+
		"\u0711\3\2\2\2\u085e\u0717\3\2\2\2\u085e\u071d\3\2\2\2\u085e\u0725\3\2"+
		"\2\2\u085e\u072f\3\2\2\2\u085e\u073e\3\2\2\2\u085e\u0744\3\2\2\2\u085e"+
		"\u074e\3\2\2\2\u085e\u0758\3\2\2\2\u085e\u0760\3\2\2\2\u085e\u076a\3\2"+
		"\2\2\u085e\u0770\3\2\2\2\u085e\u077a\3\2\2\2\u085e\u0780\3\2\2\2\u085e"+
		"\u078a\3\2\2\2\u085e\u0790\3\2\2\2\u085e\u0798\3\2\2\2\u085e\u079e\3\2"+
		"\2\2\u085e\u07a6\3\2\2\2\u085e\u07b0\3\2\2\2\u085e\u07b8\3\2\2\2\u085e"+
		"\u07c2\3\2\2\2\u085e\u07cc\3\2\2\2\u085e\u07d6\3\2\2\2\u085e\u07dc\3\2"+
		"\2\2\u085e\u07e2\3\2\2\2\u085e\u07e8\3\2\2\2\u085e\u07ee\3\2\2\2\u085e"+
		"\u07f6\3\2\2\2\u085e\u07fc\3\2\2\2\u085e\u0802\3\2\2\2\u085e\u080a\3\2"+
		"\2\2\u085e\u0814\3\2\2\2\u085e\u0820\3\2\2\2\u085e\u0826\3\2\2\2\u085e"+
		"\u082e\3\2\2\2\u085e\u0834\3\2\2\2\u085e\u083c\3\2\2\2\u085e\u0842\3\2"+
		"\2\2\u085e\u084a\3\2\2\2\u085e\u0850\3\2\2\2\u085e\u0858\3\2\2\2\u085f"+
		"\u00ad\3\2\2\2\u0860\u0861\bX\1\2\u0861\u0862\7\u00dc\2\2\u0862\u0863"+
		"\7\u0217\2\2\u0863\u0864\5\u00a0Q\2\u0864\u0865\7\u0209\2\2\u0865\u086a"+
		"\5\u00a0Q\2\u0866\u0867\7\u0209\2\2\u0867\u0869\5\u00a0Q\2\u0868\u0866"+
		"\3\2\2\2\u0869\u086c\3\2\2\2\u086a\u0868\3\2\2\2\u086a\u086b\3\2\2\2\u086b"+
		"\u086d\3\2\2\2\u086c\u086a\3\2\2\2\u086d\u086e\7\u021a\2\2\u086e\u086f"+
		"\bX\1\2\u086f\u08c5\3\2\2\2\u0870\u0871\bX\1\2\u0871\u0872\7\u0157\2\2"+
		"\u0872\u0873\7\u0217\2\2\u0873\u0874\5\u00a0Q\2\u0874\u0875\7\u0209\2"+
		"\2\u0875\u087a\5\u00a0Q\2\u0876\u0877\7\u0209\2\2\u0877\u0879\5\u00a0"+
		"Q\2\u0878\u0876\3\2\2\2\u0879\u087c\3\2\2\2\u087a\u0878\3\2\2\2\u087a"+
		"\u087b\3\2\2\2\u087b\u087d\3\2\2\2\u087c\u087a\3\2\2\2\u087d\u087e\7\u021a"+
		"\2\2\u087e\u087f\bX\1\2\u087f\u08c5\3\2\2\2\u0880\u0881\bX\1\2\u0881\u0882"+
		"\7\u00b3\2\2\u0882\u0883\7\u0217\2\2\u0883\u0888\5\u00a0Q\2\u0884\u0885"+
		"\7\u0209\2\2\u0885\u0887\5\u00a0Q\2\u0886\u0884\3\2\2\2\u0887\u088a\3"+
		"\2\2\2\u0888\u0886\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088b\3\2\2\2\u088a"+
		"\u0888\3\2\2\2\u088b\u088c\7\u021a\2\2\u088c\u088d\bX\1\2\u088d\u08c5"+
		"\3\2\2\2\u088e\u088f\7\u01f1\2\2\u088f\u0890\7\u0217\2\2\u0890\u0891\7"+
		"\u021a\2\2\u0891\u08c5\bX\1\2\u0892\u0893\7\u00f7\2\2\u0893\u0894\7\u0217"+
		"\2\2\u0894\u0895\7\u021a\2\2\u0895\u08c5\bX\1\2\u0896\u0897\7a\2\2\u0897"+
		"\u0898\7\u0217\2\2\u0898\u0899\7\u021a\2\2\u0899\u08c5\bX\1\2\u089a\u089b"+
		"\t\16\2\2\u089b\u089c\7\u0217\2\2\u089c\u089d\5\u00a0Q\2\u089d\u089e\7"+
		"\u021a\2\2\u089e\u089f\bX\1\2\u089f\u08c5\3\2\2\2\u08a0\u08a1\7\u018c"+
		"\2\2\u08a1\u08a2\7\u0217\2\2\u08a2\u08a3\5\u00a0Q\2\u08a3\u08a4\7\u0209"+
		"\2\2\u08a4\u08a5\5\u00a0Q\2\u08a5\u08a6\7\u021a\2\2\u08a6\u08a7\bX\1\2"+
		"\u08a7\u08c5\3\2\2\2\u08a8\u08a9\7\23\2\2\u08a9\u08aa\7\u0217\2\2\u08aa"+
		"\u08ab\5\u00a0Q\2\u08ab\u08ac\7\u0209\2\2\u08ac\u08ad\5\u00a0Q\2\u08ad"+
		"\u08ae\7\u021a\2\2\u08ae\u08af\bX\1\2\u08af\u08c5\3\2\2\2\u08b0\u08b1"+
		"\7\24\2\2\u08b1\u08b2\7\u0217\2\2\u08b2\u08b3\5\u00a0Q\2\u08b3\u08b4\7"+
		"\u0209\2\2\u08b4\u08b5\5\u00a0Q\2\u08b5\u08b6\7\u021a\2\2\u08b6\u08b7"+
		"\bX\1\2\u08b7\u08c5\3\2\2\2\u08b8\u08b9\7\u01d6\2\2\u08b9\u08ba\7\u0217"+
		"\2\2\u08ba\u08bb\7\u021a\2\2\u08bb\u08c5\bX\1\2\u08bc\u08bd\t\17\2\2\u08bd"+
		"\u08be\7\u0217\2\2\u08be\u08bf\5\u00a0Q\2\u08bf\u08c0\7\u0209\2\2\u08c0"+
		"\u08c1\5\u00a0Q\2\u08c1\u08c2\7\u021a\2\2\u08c2\u08c3\bX\1\2\u08c3\u08c5"+
		"\3\2\2\2\u08c4\u0860\3\2\2\2\u08c4\u0870\3\2\2\2\u08c4\u0880\3\2\2\2\u08c4"+
		"\u088e\3\2\2\2\u08c4\u0892\3\2\2\2\u08c4\u0896\3\2\2\2\u08c4\u089a\3\2"+
		"\2\2\u08c4\u08a0\3\2\2\2\u08c4\u08a8\3\2\2\2\u08c4\u08b0\3\2\2\2\u08c4"+
		"\u08b8\3\2\2\2\u08c4\u08bc\3\2\2\2\u08c5\u00af\3\2\2\2\u08c6\u08c7\bY"+
		"\1\2\u08c7\u08ca\5\u00b2Z\2\u08c8\u08c9\7\u020a\2\2\u08c9\u08cb\5\u00b2"+
		"Z\2\u08ca\u08c8\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cc"+
		"\u08cd\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce\u08cf\bY\1\2\u08cf\u00b1\3\2"+
		"\2\2\u08d0\u08d1\5\u00c2b\2\u08d1\u08d2\bZ\1\2\u08d2\u08f4\3\2\2\2\u08d3"+
		"\u08d4\5\u00c4c\2\u08d4\u08d5\bZ\1\2\u08d5\u08f4\3\2\2\2\u08d6\u08d7\7"+
		"\u0217\2\2\u08d7\u08d8\5\u00a0Q\2\u08d8\u08d9\7\u021a\2\2\u08d9\u08da"+
		"\bZ\1\2\u08da\u08f4\3\2\2\2\u08db\u08dc\5\u00b8]\2\u08dc\u08dd\bZ\1\2"+
		"\u08dd\u08f4\3\2\2\2\u08de\u08df\5\u00c0a\2\u08df\u08e0\bZ\1\2\u08e0\u08f4"+
		"\3\2\2\2\u08e1\u08e2\5\u00b6\\\2\u08e2\u08e3\bZ\1\2\u08e3\u08f4\3\2\2"+
		"\2\u08e4\u08e5\5\u00b4[\2\u08e5\u08e6\bZ\1\2\u08e6\u08f4\3\2\2\2\u08e7"+
		"\u08e8\5\u00acW\2\u08e8\u08e9\bZ\1\2\u08e9\u08f4\3\2\2\2\u08ea\u08eb\5"+
		"\u00aeX\2\u08eb\u08ec\bZ\1\2\u08ec\u08f4\3\2\2\2\u08ed\u08ee\5\u00bc_"+
		"\2\u08ee\u08ef\bZ\1\2\u08ef\u08f4\3\2\2\2\u08f0\u08f1\5\24\13\2\u08f1"+
		"\u08f2\bZ\1\2\u08f2\u08f4\3\2\2\2\u08f3\u08d0\3\2\2\2\u08f3\u08d3\3\2"+
		"\2\2\u08f3\u08d6\3\2\2\2\u08f3\u08db\3\2\2\2\u08f3\u08de\3\2\2\2\u08f3"+
		"\u08e1\3\2\2\2\u08f3\u08e4\3\2\2\2\u08f3\u08e7\3\2\2\2\u08f3\u08ea\3\2"+
		"\2\2\u08f3\u08ed\3\2\2\2\u08f3\u08f0\3\2\2\2\u08f4\u00b3\3\2\2\2\u08f5"+
		"\u08f6\7\u00be\2\2\u08f6\u08f7\7\u0217\2\2\u08f7\u08f8\5\u00a0Q\2\u08f8"+
		"\u08f9\7\u0209\2\2\u08f9\u08fa\5\u00a0Q\2\u08fa\u08fb\7\u0209\2\2\u08fb"+
		"\u08fc\5\u00a0Q\2\u08fc\u08fd\7\u021a\2\2\u08fd\u08fe\b[\1\2\u08fe\u0971"+
		"\3\2\2\2\u08ff\u0900\7\u00d8\2\2\u0900\u0901\7\u0217\2\2\u0901\u0902\5"+
		"\u00a0Q\2\u0902\u0903\7\u021a\2\2\u0903\u0904\b[\1\2\u0904\u0971\3\2\2"+
		"\2\u0905\u0906\7\u00d7\2\2\u0906\u0907\7\u0217\2\2\u0907\u0908\5\u00a0"+
		"Q\2\u0908\u0909\7\u021a\2\2\u0909\u090a\b[\1\2\u090a\u0971\3\2\2\2\u090b"+
		"\u090c\7\u00d9\2\2\u090c\u090d\7\u0217\2\2\u090d\u090e\5\u00a0Q\2\u090e"+
		"\u090f\7\u0209\2\2\u090f\u0910\5\u00a0Q\2\u0910\u0911\7\u021a\2\2\u0911"+
		"\u0912\b[\1\2\u0912\u0971\3\2\2\2\u0913\u0914\b[\1\2\u0914\u0915\7B\2"+
		"\2\u0915\u0916\7\u0217\2\2\u0916\u0917\5\u00a0Q\2\u0917\u0918\7\u0209"+
		"\2\2\u0918\u0919\5\u00a0Q\2\u0919\u091e\3\2\2\2\u091a\u091b\7\u0209\2"+
		"\2\u091b\u091d\5\u00a0Q\2\u091c\u091a\3\2\2\2\u091d\u0920\3\2\2\2\u091e"+
		"\u091c\3\2\2\2\u091e\u091f\3\2\2\2\u091f\u0921\3\2\2\2\u0920\u091e\3\2"+
		"\2\2\u0921\u0922\7\u021a\2\2\u0922\u0923\b[\1\2\u0923\u0971\3\2\2\2\u0924"+
		"\u0925\b[\1\2\u0925\u0926\7\63\2\2\u0926\u092c\5\u00a0Q\2\u0927\u0928"+
		"\7\u01da\2\2\u0928\u0929\5\u00a0Q\2\u0929\u092a\7\u01b7\2\2\u092a\u092b"+
		"\5";
	private static final String _serializedATNSegment1 =
		"\u00a0Q\2\u092b\u092d\3\2\2\2\u092c\u0927\3\2\2\2\u092d\u092e\3\2\2\2"+
		"\u092e\u092c\3\2\2\2\u092e\u092f\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0931"+
		"\7\u008b\2\2\u0931\u0932\b[\1\2\u0932\u0971\3\2\2\2\u0933\u0934\b[\1\2"+
		"\u0934\u0935\7\63\2\2\u0935\u093b\5\u00a0Q\2\u0936\u0937\7\u01da\2\2\u0937"+
		"\u0938\5\u00a0Q\2\u0938\u0939\7\u01b7\2\2\u0939\u093a\5\u00a0Q\2\u093a"+
		"\u093c\3\2\2\2\u093b\u0936\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u093b\3\2"+
		"\2\2\u093d\u093e\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0940\7\u0085\2\2\u0940"+
		"\u0941\5\u00a0Q\2\u0941\u0942\7\u008b\2\2\u0942\u0943\b[\1\2\u0943\u0971"+
		"\3\2\2\2\u0944\u0945\b[\1\2\u0945\u094b\7\63\2\2\u0946\u0947\7\u01da\2"+
		"\2\u0947\u0948\5\u00a0Q\2\u0948\u0949\7\u01b7\2\2\u0949\u094a\5\u00a0"+
		"Q\2\u094a\u094c\3\2\2\2\u094b\u0946\3\2\2\2\u094c\u094d\3\2\2\2\u094d"+
		"\u094b\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\7\u008b"+
		"\2\2\u0950\u0951\b[\1\2\u0951\u0971\3\2\2\2\u0952\u0953\b[\1\2\u0953\u0959"+
		"\7\63\2\2\u0954\u0955\7\u01da\2\2\u0955\u0956\5\u00a0Q\2\u0956\u0957\7"+
		"\u01b7\2\2\u0957\u0958\5\u00a0Q\2\u0958\u095a\3\2\2\2\u0959\u0954\3\2"+
		"\2\2\u095a\u095b\3\2\2\2\u095b\u0959\3\2\2\2\u095b\u095c\3\2\2\2\u095c"+
		"\u095d\3\2\2\2\u095d\u095e\7\u0085\2\2\u095e\u095f\5\u00a0Q\2\u095f\u0960"+
		"\7\u008b\2\2\u0960\u0961\b[\1\2\u0961\u0971\3\2\2\2\u0962\u0963\7\u0123"+
		"\2\2\u0963\u0964\7\u0217\2\2\u0964\u0965\5\u00a0Q\2\u0965\u0966\7\u0209"+
		"\2\2\u0966\u0967\5\u00a0Q\2\u0967\u0968\7\u021a\2\2\u0968\u0969\b[\1\2"+
		"\u0969\u0971\3\2\2\2\u096a\u096b\7\35\2\2\u096b\u096c\7\u0217\2\2\u096c"+
		"\u096d\5\u00a0Q\2\u096d\u096e\7\u021a\2\2\u096e\u096f\b[\1\2\u096f\u0971"+
		"\3\2\2\2\u0970\u08f5\3\2\2\2\u0970\u08ff\3\2\2\2\u0970\u0905\3\2\2\2\u0970"+
		"\u090b\3\2\2\2\u0970\u0913\3\2\2\2\u0970\u0924\3\2\2\2\u0970\u0933\3\2"+
		"\2\2\u0970\u0944\3\2\2\2\u0970\u0952\3\2\2\2\u0970\u0962\3\2\2\2\u0970"+
		"\u096a\3\2\2\2\u0971\u00b5\3\2\2\2\u0972\u0973\7\u01ca\2\2\u0973\u0974"+
		"\7\u0217\2\2\u0974\u0975\7\u021a\2\2\u0975\u0a23\b\\\1\2\u0976\u0977\7"+
		"\u01ca\2\2\u0977\u0978\7\u0217\2\2\u0978\u0979\5\u00a0Q\2\u0979\u097a"+
		"\7\u021a\2\2\u097a\u097b\b\\\1\2\u097b\u0a23\3\2\2\2\u097c\u097d\7\u01ca"+
		"\2\2\u097d\u097e\7\u0217\2\2\u097e\u097f\5\u00a0Q\2\u097f\u0980\7\u0209"+
		"\2\2\u0980\u0981\5\u00a0Q\2\u0981\u0982\7\u021a\2\2\u0982\u0983\b\\\1"+
		"\2\u0983\u0a23\3\2\2\2\u0984\u0985\7\u01eb\2\2\u0985\u0986\7\u0217\2\2"+
		"\u0986\u0987\5\u00a0Q\2\u0987\u0988\7\u021a\2\2\u0988\u0989\b\\\1\2\u0989"+
		"\u0a23\3\2\2\2\u098a\u098b\7\u014d\2\2\u098b\u098c\7\u0217\2\2\u098c\u098d"+
		"\5\u00a0Q\2\u098d\u098e\7\u021a\2\2\u098e\u098f\b\\\1\2\u098f\u0a23\3"+
		"\2\2\2\u0990\u0991\7\u010f\2\2\u0991\u0992\7\u0217\2\2\u0992\u0993\5\u00a0"+
		"Q\2\u0993\u0994\7\u021a\2\2\u0994\u0995\b\\\1\2\u0995\u0a23\3\2\2\2\u0996"+
		"\u0997\7j\2\2\u0997\u0998\7\u0217\2\2\u0998\u0999\5\u00a0Q\2\u0999\u099a"+
		"\7\u021a\2\2\u099a\u099b\b\\\1\2\u099b\u0a23\3\2\2\2\u099c\u099d\7\u00bc"+
		"\2\2\u099d\u099e\7\u0217\2\2\u099e\u099f\5\u00a0Q\2\u099f\u09a0\7\u021a"+
		"\2\2\u09a0\u09a1\b\\\1\2\u09a1\u0a23\3\2\2\2\u09a2\u09a3\7\u010e\2\2\u09a3"+
		"\u09a4\7\u0217\2\2\u09a4\u09a5\5\u00a0Q\2\u09a5\u09a6\7\u021a\2\2\u09a6"+
		"\u09a7\b\\\1\2\u09a7\u0a23\3\2\2\2\u09a8\u09a9\7\u017e\2\2\u09a9\u09aa"+
		"\7\u0217\2\2\u09aa\u09ab\5\u00a0Q\2\u09ab\u09ac\7\u021a\2\2\u09ac\u09ad"+
		"\b\\\1\2\u09ad\u0a23\3\2\2\2\u09ae\u09af\7\u01d9\2\2\u09af\u09b0\7\u0217"+
		"\2\2\u09b0\u09b1\5\u00a0Q\2\u09b1\u09b2\7\u021a\2\2\u09b2\u09b3\b\\\1"+
		"\2\u09b3\u0a23\3\2\2\2\u09b4\u09b5\7f\2\2\u09b5\u09b6\7\u0217\2\2\u09b6"+
		"\u09b7\5\u00a0Q\2\u09b7\u09b8\7\u0209\2\2\u09b8\u09b9\5\u00a0Q\2\u09b9"+
		"\u09ba\7\u021a\2\2\u09ba\u09bb\b\\\1\2\u09bb\u0a23\3\2\2\2\u09bc\u09bd"+
		"\7e\2\2\u09bd\u09be\7\u0217\2\2\u09be\u09bf\5\u00a0Q\2\u09bf\u09c0\7\u0209"+
		"\2\2\u09c0\u09c1\5\u00a0Q\2\u09c1\u09c2\7\u021a\2\2\u09c2\u09c3\b\\\1"+
		"\2\u09c3\u0a23\3\2\2\2\u09c4\u09c5\7h\2\2\u09c5\u09c6\7\u0217\2\2\u09c6"+
		"\u09c7\5\u00a0Q\2\u09c7\u09c8\7\u0209\2\2\u09c8\u09c9\5\u00a0Q\2\u09c9"+
		"\u09ca\7\u021a\2\2\u09ca\u09cb\b\\\1\2\u09cb\u0a23\3\2\2\2\u09cc\u09cd"+
		"\7\u01bd\2\2\u09cd\u09ce\7\u0217\2\2\u09ce\u09cf\5\u00a0Q\2\u09cf\u09d0"+
		"\7\u0209\2\2\u09d0\u09d1\5\u00a0Q\2\u09d1\u09d2\7\u021a\2\2\u09d2\u09d3"+
		"\b\\\1\2\u09d3\u0a23\3\2\2\2\u09d4\u09d5\7\u00a9\2\2\u09d5\u09d6\7\u0217"+
		"\2\2\u09d6\u09d7\5\u00a0Q\2\u09d7\u09d8\7\u0209\2\2\u09d8\u09d9\5\u00a0"+
		"Q\2\u09d9\u09da\7\u021a\2\2\u09da\u09db\b\\\1\2\u09db\u0a23\3\2\2\2\u09dc"+
		"\u09df\7\u01ef\2\2\u09dd\u09de\7\u0217\2\2\u09de\u09e0\7\u021a\2\2\u09df"+
		"\u09dd\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u0a23\b\\"+
		"\1\2\u09e2\u09e5\7\u01f0\2\2\u09e3\u09e4\7\u0217\2\2\u09e4\u09e6\7\u021a"+
		"\2\2\u09e5\u09e3\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7"+
		"\u0a23\b\\\1\2\u09e8\u09e9\7\22\2\2\u09e9\u09ea\7\u0217\2\2\u09ea\u09eb"+
		"\5\u00a0Q\2\u09eb\u09ec\7\u0209\2\2\u09ec\u09ed\5\u00a0Q\2\u09ed\u09ee"+
		"\7\u021a\2\2\u09ee\u09ef\b\\\1\2\u09ef\u0a23\3\2\2\2\u09f0\u09f1\7\22"+
		"\2\2\u09f1\u09f2\7\u0217\2\2\u09f2\u09f3\5\u00a0Q\2\u09f3\u09f4\7\u0209"+
		"\2\2\u09f4\u09f5\5\u00a0Q\2\u09f5\u09f6\7\u0209\2\2\u09f6\u09f7\5\u00a0"+
		"Q\2\u09f7\u09f8\7\u021a\2\2\u09f8\u09f9\b\\\1\2\u09f9\u0a23\3\2\2\2\u09fa"+
		"\u09fb\7\u00e3\2\2\u09fb\u09fc\7\u0217\2\2\u09fc\u09fd\5\u00a0Q\2\u09fd"+
		"\u09fe\7\u021a\2\2\u09fe\u09ff\b\\\1\2\u09ff\u0a23\3\2\2\2\u0a00\u0a01"+
		"\7\u0115\2\2\u0a01\u0a02\7\u0217\2\2\u0a02\u0a03\5\u00a0Q\2\u0a03\u0a04"+
		"\7\u0209\2\2\u0a04\u0a05\5\u00a0Q\2\u0a05\u0a06\7\u021a\2\2\u0a06\u0a07"+
		"\b\\\1\2\u0a07\u0a23\3\2\2\2\u0a08\u0a09\7\u01c2\2\2\u0a09\u0a0a\7\u0217"+
		"\2\2\u0a0a\u0a0b\5\u00a0Q\2\u0a0b\u0a0c\7\u0209\2\2\u0a0c\u0a0d\5\u00a0"+
		"Q\2\u0a0d\u0a0e\7\u021a\2\2\u0a0e\u0a0f\b\\\1\2\u0a0f\u0a23\3\2\2\2\u0a10"+
		"\u0a11\7\u0110\2\2\u0a11\u0a12\7\u0217\2\2\u0a12\u0a13\5\u00a0Q\2\u0a13"+
		"\u0a14\7\u0209\2\2\u0a14\u0a15\5\u00a0Q\2\u0a15\u0a16\7\u021a\2\2\u0a16"+
		"\u0a17\b\\\1\2\u0a17\u0a23\3\2\2\2\u0a18\u0a19\7g\2\2\u0a19\u0a1a\7\u0217"+
		"\2\2\u0a1a\u0a1b\5\u00a0Q\2\u0a1b\u0a1c\7\u0209\2\2\u0a1c\u0a1d\5\u00a0"+
		"Q\2\u0a1d\u0a1e\7\u021a\2\2\u0a1e\u0a1f\b\\\1\2\u0a1f\u0a23\3\2\2\2\u0a20"+
		"\u0a21\7\u0202\2\2\u0a21\u0a23\b\\\1\2\u0a22\u0972\3\2\2\2\u0a22\u0976"+
		"\3\2\2\2\u0a22\u097c\3\2\2\2\u0a22\u0984\3\2\2\2\u0a22\u098a\3\2\2\2\u0a22"+
		"\u0990\3\2\2\2\u0a22\u0996\3\2\2\2\u0a22\u099c\3\2\2\2\u0a22\u09a2\3\2"+
		"\2\2\u0a22\u09a8\3\2\2\2\u0a22\u09ae\3\2\2\2\u0a22\u09b4\3\2\2\2\u0a22"+
		"\u09bc\3\2\2\2\u0a22\u09c4\3\2\2\2\u0a22\u09cc\3\2\2\2\u0a22\u09d4\3\2"+
		"\2\2\u0a22\u09dc\3\2\2\2\u0a22\u09e2\3\2\2\2\u0a22\u09e8\3\2\2\2\u0a22"+
		"\u09f0\3\2\2\2\u0a22\u09fa\3\2\2\2\u0a22\u0a00\3\2\2\2\u0a22\u0a08\3\2"+
		"\2\2\u0a22\u0a10\3\2\2\2\u0a22\u0a18\3\2\2\2\u0a22\u0a20\3\2\2\2\u0a23"+
		"\u00b7\3\2\2\2\u0a24\u0a25\7\64\2\2\u0a25\u0a26\7\u0217\2\2\u0a26\u0a27"+
		"\5\u00a0Q\2\u0a27\u0a28\7\31\2\2\u0a28\u0a2a\5\b\5\2\u0a29\u0a2b\5\f\7"+
		"\2\u0a2a\u0a29\3\2\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b\u0a2c\3\2\2\2\u0a2c\u0a2d"+
		"\7\u021a\2\2\u0a2d\u0a2e\b]\1\2\u0a2e\u0a36\3\2\2\2\u0a2f\u0a30\7(\2\2"+
		"\u0a30\u0a31\7\u0217\2\2\u0a31\u0a32\5\u00a0Q\2\u0a32\u0a33\7\u021a\2"+
		"\2\u0a33\u0a34\b]\1\2\u0a34\u0a36\3\2\2\2\u0a35\u0a24\3\2\2\2\u0a35\u0a2f"+
		"\3\2\2\2\u0a36\u00b9\3\2\2\2\u0a37\u0a38\7U\2\2\u0a38\u0a39\7\u0217\2"+
		"\2\u0a39\u0a3a\5\u00a0Q\2\u0a3a\u0a3b\7\u021a\2\2\u0a3b\u0a3c\b^\1\2\u0a3c"+
		"\u0a72\3\2\2\2\u0a3d\u0a3e\b^\1\2\u0a3e\u0a3f\7U\2\2\u0a3f\u0a40\7\u0217"+
		"\2\2\u0a40\u0a41\7\177\2\2\u0a41\u0a46\5\u00a0Q\2\u0a42\u0a43\7\u0209"+
		"\2\2\u0a43\u0a45\5\u00a0Q\2\u0a44\u0a42\3\2\2\2\u0a45\u0a48\3\2\2\2\u0a46"+
		"\u0a44\3\2\2\2\u0a46\u0a47\3\2\2\2\u0a47\u0a49\3\2\2\2\u0a48\u0a46\3\2"+
		"\2\2\u0a49\u0a4a\7\u021a\2\2\u0a4a\u0a4b\b^\1\2\u0a4b\u0a72\3\2\2\2\u0a4c"+
		"\u0a4d\7U\2\2\u0a4d\u0a4e\7\u0217\2\2\u0a4e\u0a4f\7\u0215\2\2\u0a4f\u0a50"+
		"\7\u021a\2\2\u0a50\u0a72\b^\1\2\u0a51\u0a52\7\u01ac\2\2\u0a52\u0a53\7"+
		"\u0217\2\2\u0a53\u0a54\5\u00a0Q\2\u0a54\u0a55\7\u021a\2\2\u0a55\u0a56"+
		"\b^\1\2\u0a56\u0a72\3\2\2\2\u0a57\u0a58\7\u01ac\2\2\u0a58\u0a59\7\u0217"+
		"\2\2\u0a59\u0a5a\7\177\2\2\u0a5a\u0a5b\5\u00a0Q\2\u0a5b\u0a5c\7\u021a"+
		"\2\2\u0a5c\u0a5d\b^\1\2\u0a5d\u0a72\3\2\2\2\u0a5e\u0a5f\7!\2\2\u0a5f\u0a60"+
		"\7\u0217\2\2\u0a60\u0a61\5\u00a0Q\2\u0a61\u0a62\7\u021a\2\2\u0a62\u0a63"+
		"\b^\1\2\u0a63\u0a72\3\2\2\2\u0a64\u0a65\7!\2\2\u0a65\u0a66\7\u0217\2\2"+
		"\u0a66\u0a67\7\177\2\2\u0a67\u0a68\5\u00a0Q\2\u0a68\u0a69\7\u021a\2\2"+
		"\u0a69\u0a6a\b^\1\2\u0a6a\u0a72\3\2\2\2\u0a6b\u0a6c\t\20\2\2\u0a6c\u0a6d"+
		"\7\u0217\2\2\u0a6d\u0a6e\5\u00a0Q\2\u0a6e\u0a6f\7\u021a\2\2\u0a6f\u0a70"+
		"\b^\1\2\u0a70\u0a72\3\2\2\2\u0a71\u0a37\3\2\2\2\u0a71\u0a3d\3\2\2\2\u0a71"+
		"\u0a4c\3\2\2\2\u0a71\u0a51\3\2\2\2\u0a71\u0a57\3\2\2\2\u0a71\u0a5e\3\2"+
		"\2\2\u0a71\u0a64\3\2\2\2\u0a71\u0a6b\3\2\2\2\u0a72\u00bb\3\2\2\2\u0a73"+
		"\u0a74\5\u00ba^\2\u0a74\u0a75\b_\1\2\u0a75\u0abb\3\2\2\2\u0a76\u0a77\t"+
		"\21\2\2\u0a77\u0a78\7\u0217\2\2\u0a78\u0a79\5\u00a0Q\2\u0a79\u0a7a\7\u021a"+
		"\2\2\u0a7a\u0a7b\b_\1\2\u0a7b\u0abb\3\2\2\2\u0a7c\u0a7d\t\22\2\2\u0a7d"+
		"\u0a7e\7\u0217\2\2\u0a7e\u0a7f\5\u00a0Q\2\u0a7f\u0a80\7\u0209\2\2\u0a80"+
		"\u0a81\5\u00a0Q\2\u0a81\u0a82\7\u021a\2\2\u0a82\u0a83\b_\1\2\u0a83\u0abb"+
		"\3\2\2\2\u0a84\u0a85\7\u013d\2\2\u0a85\u0a86\7\u0217\2\2\u0a86\u0a87\5"+
		"\u00a0Q\2\u0a87\u0a88\7\u0209\2\2\u0a88\u0a89\5\u00a0Q\2\u0a89\u0a8a\7"+
		"\u021a\2\2\u0a8a\u0a8b\b_\1\2\u0a8b\u0abb\3\2\2\2\u0a8c\u0a8d\7\u013e"+
		"\2\2\u0a8d\u0a8e\7\u0217\2\2\u0a8e\u0a8f\5\u00a0Q\2\u0a8f\u0a90\7\u0209"+
		"\2\2\u0a90\u0a91\5\u00a0Q\2\u0a91\u0a92\7\u021a\2\2\u0a92\u0a93\b_\1\2"+
		"\u0a93\u0abb\3\2\2\2\u0a94\u0a95\7\u013e\2\2\u0a95\u0a96\7\u0217\2\2\u0a96"+
		"\u0a97\5\u00a0Q\2\u0a97\u0a98\7\u0209\2\2\u0a98\u0a99\5\u00a0Q\2\u0a99"+
		"\u0a9a\7\u0209\2\2\u0a9a\u0a9b\5\u00a0Q\2\u0a9b\u0a9c\7\u021a\2\2\u0a9c"+
		"\u0a9d\b_\1\2\u0a9d\u0abb\3\2\2\2\u0a9e\u0a9f\t\23\2\2\u0a9f\u0aa0\7\u0217"+
		"\2\2\u0aa0\u0aa1\5\u00a0Q\2\u0aa1\u0aa2\7\u0209\2\2\u0aa2\u0aa3\5\u00a0"+
		"Q\2\u0aa3\u0aa4\7\u021a\2\2\u0aa4\u0aa5\b_\1\2\u0aa5\u0abb\3\2\2\2\u0aa6"+
		"\u0aa7\7\u00b7\2\2\u0aa7\u0aa8\7\u0217\2\2\u0aa8\u0aa9\5\u00a0Q\2\u0aa9"+
		"\u0aaa\7\u0209\2\2\u0aaa\u0aab\5\u00a0Q\2\u0aab\u0aac\7\u021a\2\2\u0aac"+
		"\u0aad\b_\1\2\u0aad\u0abb\3\2\2\2\u0aae\u0aaf\t\24\2\2\u0aaf\u0ab0\7\u0217"+
		"\2\2\u0ab0\u0ab1\5\u00a0Q\2\u0ab1\u0ab2\7\u021a\2\2\u0ab2\u0ab3\b_\1\2"+
		"\u0ab3\u0abb\3\2\2\2\u0ab4\u0ab5\7\u0121\2\2\u0ab5\u0ab6\7\u0217\2\2\u0ab6"+
		"\u0ab7\5\u00a0Q\2\u0ab7\u0ab8\7\u021a\2\2\u0ab8\u0ab9\b_\1\2\u0ab9\u0abb"+
		"\3\2\2\2\u0aba\u0a73\3\2\2\2\u0aba\u0a76\3\2\2\2\u0aba\u0a7c\3\2\2\2\u0aba"+
		"\u0a84\3\2\2\2\u0aba\u0a8c\3\2\2\2\u0aba\u0a94\3\2\2\2\u0aba\u0a9e\3\2"+
		"\2\2\u0aba\u0aa6\3\2\2\2\u0aba\u0aae\3\2\2\2\u0aba\u0ab4\3\2\2\2\u0abb"+
		"\u00bd\3\2\2\2\u0abc\u0abd\7\u0096\2\2\u0abd\u0abe\7\u0217\2\2\u0abe\u0abf"+
		"\5\u00a0Q\2\u0abf\u0ac0\7\u021a\2\2\u0ac0\u0ac1\b`\1\2\u0ac1\u0acf\3\2"+
		"\2\2\u0ac2\u0ac3\7\u0142\2\2\u0ac3\u0ac4\7\u0217\2\2\u0ac4\u0ac5\5\u00a0"+
		"Q\2\u0ac5\u0ac6\7\u021a\2\2\u0ac6\u0ac7\b`\1\2\u0ac7\u0acf\3\2\2\2\u0ac8"+
		"\u0ac9\7\u00c7\2\2\u0ac9\u0aca\7\u0217\2\2\u0aca\u0acb\5\u00a0Q\2\u0acb"+
		"\u0acc\7\u021a\2\2\u0acc\u0acd\b`\1\2\u0acd\u0acf\3\2\2\2\u0ace\u0abc"+
		"\3\2\2\2\u0ace\u0ac2\3\2\2\2\u0ace\u0ac8\3\2\2\2\u0acf\u00bf\3\2\2\2\u0ad0"+
		"\u0ad1\7\u0172\2\2\u0ad1\u0ad2\7\u0217\2\2\u0ad2\u0ad3\5\u00a0Q\2\u0ad3"+
		"\u0ad4\7\u021a\2\2\u0ad4\u0ad5\ba\1\2\u0ad5\u0ba3\3\2\2\2\u0ad6\u0ad7"+
		"\7\u0172\2\2\u0ad7\u0ad8\7\u0217\2\2\u0ad8\u0ad9\5\u00a0Q\2\u0ad9\u0ada"+
		"\7\u0209\2\2\u0ada\u0adb\5\u00a0Q\2\u0adb\u0adc\7\u021a\2\2\u0adc\u0add"+
		"\ba\1\2\u0add\u0ba3\3\2\2\2\u0ade\u0adf\7\u00a2\2\2\u0adf\u0ae0\7\u0217"+
		"\2\2\u0ae0\u0ae1\5\u00a0Q\2\u0ae1\u0ae2\7\u021a\2\2\u0ae2\u0ae3\ba\1\2"+
		"\u0ae3\u0ba3\3\2\2\2\u0ae4\u0ae5\t\25\2\2\u0ae5\u0ae6\7\u0217\2\2\u0ae6"+
		"\u0ae7\5\u00a0Q\2\u0ae7\u0ae8\7\u021a\2\2\u0ae8\u0ae9\ba\1\2\u0ae9\u0ba3"+
		"\3\2\2\2\u0aea\u0aeb\7\u0153\2\2\u0aeb\u0aec\7\u0217\2\2\u0aec\u0aed\7"+
		"\u021a\2\2\u0aed\u0ba3\ba\1\2\u0aee\u0aef\7\u0153\2\2\u0aef\u0af0\7\u0217"+
		"\2\2\u0af0\u0af1\5\u00a0Q\2\u0af1\u0af2\7\u021a\2\2\u0af2\u0af3\ba\1\2"+
		"\u0af3\u0ba3\3\2\2\2\u0af4\u0af5\7\u0095\2\2\u0af5\u0af6\7\u0217\2\2\u0af6"+
		"\u0af7\5\u00a0Q\2\u0af7\u0af8\7\u021a\2\2\u0af8\u0af9\ba\1\2\u0af9\u0ba3"+
		"\3\2\2\2\u0afa\u0afb\7\u00fc\2\2\u0afb\u0afc\7\u0217\2\2\u0afc\u0afd\5"+
		"\u00a0Q\2\u0afd\u0afe\7\u021a\2\2\u0afe\u0aff\ba\1\2\u0aff\u0ba3\3\2\2"+
		"\2\u0b00\u0b01\7\u00f4\2\2\u0b01\u0b02\7\u0217\2\2\u0b02\u0b03\5\u00a0"+
		"Q\2\u0b03\u0b04\7\u021a\2\2\u0b04\u0b05\ba\1\2\u0b05\u0ba3\3\2\2\2\u0b06"+
		"\u0b07\7\u00f5\2\2\u0b07\u0b08\7\u0217\2\2\u0b08\u0b09\5\u00a0Q\2\u0b09"+
		"\u0b0a\7\u021a\2\2\u0b0a\u0b0b\ba\1\2\u0b0b\u0ba3\3\2\2\2\u0b0c\u0b0d"+
		"\7\u00f3\2\2\u0b0d\u0b0e\7\u0217\2\2\u0b0e\u0b0f\5\u00a0Q\2\u0b0f\u0b10"+
		"\7\u0209\2\2\u0b10\u0b11\5\u00a0Q\2\u0b11\u0b12\7\u021a\2\2\u0b12\u0b13"+
		"\ba\1\2\u0b13\u0ba3\3\2\2\2\u0b14\u0b15\t\26\2\2\u0b15\u0b16\7\u0217\2"+
		"\2\u0b16\u0b17\5\u00a0Q\2\u0b17\u0b18\7\u0209\2\2\u0b18\u0b19\5\u00a0"+
		"Q\2\u0b19\u0b1a\7\u021a\2\2\u0b1a\u0b1b\ba\1\2\u0b1b\u0ba3\3\2\2\2\u0b1c"+
		"\u0b1d\7\u019d\2\2\u0b1d\u0b1e\7\u0217\2\2\u0b1e\u0b1f\5\u00a0Q\2\u0b1f"+
		"\u0b20\7\u021a\2\2\u0b20\u0b21\ba\1\2\u0b21\u0ba3\3\2\2\2\u0b22\u0b23"+
		"\7\'\2\2\u0b23\u0b24\7\u0217\2\2\u0b24\u0b25\5\u00a0Q\2\u0b25\u0b26\7"+
		"\u021a\2\2\u0b26\u0b27\ba\1\2\u0b27\u0ba3\3\2\2\2\u0b28\u0b29\7\u00b6"+
		"\2\2\u0b29\u0b2a\7\u0217\2\2\u0b2a\u0b2b\5\u00a0Q\2\u0b2b\u0b2c\7\u021a"+
		"\2\2\u0b2c\u0b2d\ba\1\2\u0b2d\u0ba3\3\2\2\2\u0b2e\u0b2f\7\u01c6\2\2\u0b2f"+
		"\u0b30\7\u0217\2\2\u0b30\u0b31\5\u00a0Q\2\u0b31\u0b32\7\u021a\2\2\u0b32"+
		"\u0b33\ba\1\2\u0b33\u0ba3\3\2\2\2\u0b34\u0b35\7Q\2\2\u0b35\u0b36\7\u0217"+
		"\2\2\u0b36\u0b37\5\u00a0Q\2\u0b37\u0b38\7\u0209\2\2\u0b38\u0b39\5\u00a0"+
		"Q\2\u0b39\u0b3a\7\u0209\2\2\u0b3a\u0b3b\5\u00a0Q\2\u0b3b\u0b3c\7\u021a"+
		"\2\2\u0b3c\u0b3d\ba\1\2\u0b3d\u0ba3\3\2\2\2\u0b3e\u0b3f\7\20\2\2\u0b3f"+
		"\u0b40\7\u0217\2\2\u0b40\u0b41\5\u00a0Q\2\u0b41\u0b42\7\u021a\2\2\u0b42"+
		"\u0b43\ba\1\2\u0b43\u0ba3\3\2\2\2\u0b44\u0b45\7\u0140\2\2\u0b45\u0b46"+
		"\7\u0217\2\2\u0b46\u0b47\5\u00a0Q\2\u0b47\u0b48\7\u0209\2\2\u0b48\u0b49"+
		"\5\u00a0Q\2\u0b49\u0b4a\7\u021a\2\2\u0b4a\u0b4b\ba\1\2\u0b4b\u0ba3\3\2"+
		"\2\2\u0b4c\u0b4d\7\u018e\2\2\u0b4d\u0b4e\7\u0217\2\2\u0b4e\u0b4f\5\u00a0"+
		"Q\2\u0b4f\u0b50\7\u021a\2\2\u0b50\u0b51\ba\1\2\u0b51\u0ba3\3\2\2\2\u0b52"+
		"\u0b53\7\34\2\2\u0b53\u0b54\7\u0217\2\2\u0b54\u0b55\5\u00a0Q\2\u0b55\u0b56"+
		"\7\u021a\2\2\u0b56\u0b57\ba\1\2\u0b57\u0ba3\3\2\2\2\u0b58\u0b59\7T\2\2"+
		"\u0b59\u0b5a\7\u0217\2\2\u0b5a\u0b5b\5\u00a0Q\2\u0b5b\u0b5c\7\u021a\2"+
		"\2\u0b5c\u0b5d\ba\1\2\u0b5d\u0ba3\3\2\2\2\u0b5e\u0b5f\7\21\2\2\u0b5f\u0b60"+
		"\7\u0217\2\2\u0b60\u0b61\5\u00a0Q\2\u0b61\u0b62\7\u021a\2\2\u0b62\u0b63"+
		"\ba\1\2\u0b63\u0ba3\3\2\2\2\u0b64\u0b65\7\u01b1\2\2\u0b65\u0b66\7\u0217"+
		"\2\2\u0b66\u0b67\5\u00a0Q\2\u0b67\u0b68\7\u021a\2\2\u0b68\u0b69\ba\1\2"+
		"\u0b69\u0ba3\3\2\2\2\u0b6a\u0b6b\7\37\2\2\u0b6b\u0b6c\7\u0217\2\2\u0b6c"+
		"\u0b6d\5\u00a0Q\2\u0b6d\u0b6e\7\u021a\2\2\u0b6e\u0b6f\ba\1\2\u0b6f\u0ba3"+
		"\3\2\2\2\u0b70\u0b71\7u\2\2\u0b71\u0b72\7\u0217\2\2\u0b72\u0b73\5\u00a0"+
		"Q\2\u0b73\u0b74\7\u021a\2\2\u0b74\u0b75\ba\1\2\u0b75\u0ba3\3\2\2\2\u0b76"+
		"\u0b77\7\u0151\2\2\u0b77\u0b78\7\u0217\2\2\u0b78\u0b79\5\u00a0Q\2\u0b79"+
		"\u0b7a\7\u021a\2\2\u0b7a\u0b7b\ba\1\2\u0b7b\u0ba3\3\2\2\2\u0b7c\u0b7d"+
		"\7\u0141\2\2\u0b7d\u0b7e\7\u0217\2\2\u0b7e\u0b7f\5\u00a0Q\2\u0b7f\u0b80"+
		"\7\u021a\2\2\u0b80\u0b81\ba\1\2\u0b81\u0ba3\3\2\2\2\u0b82\u0b83\7\u0114"+
		"\2\2\u0b83\u0b84\7\u0217\2\2\u0b84\u0b85\5\u00a0Q\2\u0b85\u0b86\7\u021a"+
		"\2\2\u0b86\u0b87\ba\1\2\u0b87\u0ba3\3\2\2\2\u0b88\u0b89\7\u018d\2\2\u0b89"+
		"\u0b8a\7\u0217\2\2\u0b8a\u0b8b\5\u00a0Q\2\u0b8b\u0b8c\7\u021a\2\2\u0b8c"+
		"\u0b8d\ba\1\2\u0b8d\u0ba3\3\2\2\2\u0b8e\u0b8f\7\13\2\2\u0b8f\u0b90\7\u0217"+
		"\2\2\u0b90\u0b91\7\u021a\2\2\u0b91\u0ba3\ba\1\2\u0b92\u0b93\7\f\2\2\u0b93"+
		"\u0b94\7\u0217\2\2\u0b94\u0b95\7\u021a\2\2\u0b95\u0ba3\ba\1\2\u0b96\u0b97"+
		"\7\u0098\2\2\u0b97\u0b98\7\u0217\2\2\u0b98\u0b99\5\u00a0Q\2\u0b99\u0b9a"+
		"\7\u021a\2\2\u0b9a\u0b9b\ba\1\2\u0b9b\u0ba3\3\2\2\2\u0b9c\u0b9d\7\65\2"+
		"\2\u0b9d\u0b9e\7\u0217\2\2\u0b9e\u0b9f\5\u00a0Q\2\u0b9f\u0ba0\7\u021a"+
		"\2\2\u0ba0\u0ba1\ba\1\2\u0ba1\u0ba3\3\2\2\2\u0ba2\u0ad0\3\2\2\2\u0ba2"+
		"\u0ad6\3\2\2\2\u0ba2\u0ade\3\2\2\2\u0ba2\u0ae4\3\2\2\2\u0ba2\u0aea\3\2"+
		"\2\2\u0ba2\u0aee\3\2\2\2\u0ba2\u0af4\3\2\2\2\u0ba2\u0afa\3\2\2\2\u0ba2"+
		"\u0b00\3\2\2\2\u0ba2\u0b06\3\2\2\2\u0ba2\u0b0c\3\2\2\2\u0ba2\u0b14\3\2"+
		"\2\2\u0ba2\u0b1c\3\2\2\2\u0ba2\u0b22\3\2\2\2\u0ba2\u0b28\3\2\2\2\u0ba2"+
		"\u0b2e\3\2\2\2\u0ba2\u0b34\3\2\2\2\u0ba2\u0b3e\3\2\2\2\u0ba2\u0b44\3\2"+
		"\2\2\u0ba2\u0b4c\3\2\2\2\u0ba2\u0b52\3\2\2\2\u0ba2\u0b58\3\2\2\2\u0ba2"+
		"\u0b5e\3\2\2\2\u0ba2\u0b64\3\2\2\2\u0ba2\u0b6a\3\2\2\2\u0ba2\u0b70\3\2"+
		"\2\2\u0ba2\u0b76\3\2\2\2\u0ba2\u0b7c\3\2\2\2\u0ba2\u0b82\3\2\2\2\u0ba2"+
		"\u0b88\3\2\2\2\u0ba2\u0b8e\3\2\2\2\u0ba2\u0b92\3\2\2\2\u0ba2\u0b96\3\2"+
		"\2\2\u0ba2\u0b9c\3\2\2\2\u0ba3\u00c1\3\2\2\2\u0ba4\u0ba5\7\u0221\2\2\u0ba5"+
		"\u0bb5\bb\1\2\u0ba6\u0ba7\7\u0220\2\2\u0ba7\u0bb5\bb\1\2\u0ba8\u0ba9\7"+
		"\u021f\2\2\u0ba9\u0bb5\bb\1\2\u0baa\u0bab\7\17\2\2\u0bab\u0bb5\bb\1\2"+
		"\u0bac\u0bad\7\16\2\2\u0bad\u0bb5\bb\1\2\u0bae\u0baf\5\u00ccg\2\u0baf"+
		"\u0bb0\bb\1\2\u0bb0\u0bb5\3\2\2\2\u0bb1\u0bb2\5\u00ceh\2\u0bb2\u0bb3\b"+
		"b\1\2\u0bb3\u0bb5\3\2\2\2\u0bb4\u0ba4\3\2\2\2\u0bb4\u0ba6\3\2\2\2\u0bb4"+
		"\u0ba8\3\2\2\2\u0bb4\u0baa\3\2\2\2\u0bb4\u0bac\3\2\2\2\u0bb4\u0bae\3\2"+
		"\2\2\u0bb4\u0bb1\3\2\2\2\u0bb5\u00c3\3\2\2\2\u0bb6\u0bb7\7\u021e\2\2\u0bb7"+
		"\u0bb9\7\4\2\2\u0bb8\u0bb6\3\2\2\2\u0bb8\u0bb9\3\2\2\2\u0bb9\u0bbc\3\2"+
		"\2\2\u0bba\u0bbb\7\u021e\2\2\u0bbb\u0bbd\7\4\2\2\u0bbc\u0bba\3\2\2\2\u0bbc"+
		"\u0bbd\3\2\2\2\u0bbd\u0bbe\3\2\2\2\u0bbe\u0bbf\7\u021e\2\2\u0bbf\u0bc0"+
		"\bc\1\2\u0bc0\u00c5\3\2\2\2\u0bc1\u0bc2\7\u021e\2\2\u0bc2\u0bc4\7\4\2"+
		"\2\u0bc3\u0bc1\3\2\2\2\u0bc3\u0bc4\3\2\2\2\u0bc4\u0bc5\3\2\2\2\u0bc5\u0bc6"+
		"\7\u021e\2\2\u0bc6\u0bd0\bd\1\2\u0bc7\u0bc8\5\u00c8e\2\u0bc8\u0bc9\7\4"+
		"\2\2\u0bc9\u0bca\5\u00c8e\2\u0bca\u0bcb\bd\1\2\u0bcb\u0bd0\3\2\2\2\u0bcc"+
		"\u0bcd\5\u00c8e\2\u0bcd\u0bce\bd\1\2\u0bce\u0bd0\3\2\2\2\u0bcf\u0bc3\3"+
		"\2\2\2\u0bcf\u0bc7\3\2\2\2\u0bcf\u0bcc\3\2\2\2\u0bd0\u00c7\3\2\2\2\u0bd1"+
		"\u0bd3\be\1\2\u0bd2\u0bd4\5\u00caf\2\u0bd3\u0bd2\3\2\2\2\u0bd4\u0bd5\3"+
		"\2\2\2\u0bd5\u0bd3\3\2\2\2\u0bd5\u0bd6\3\2\2\2\u0bd6\u0bd7\3\2\2\2\u0bd7"+
		"\u0bd8\be\1\2\u0bd8\u00c9\3\2\2\2\u0bd9\u0bda\7\u021e\2\2\u0bda\u0bdf"+
		"\bf\1\2\u0bdb\u0bdc\5\24\13\2\u0bdc\u0bdd\bf\1\2\u0bdd\u0bdf\3\2\2\2\u0bde"+
		"\u0bd9\3\2\2\2\u0bde\u0bdb\3\2\2\2\u0bdf\u00cb\3\2\2\2\u0be0\u0be1\7d"+
		"\2\2\u0be1\u0be2\7\u0221\2\2\u0be2\u0be3\bg\1\2\u0be3\u00cd\3\2\2\2\u0be4"+
		"\u0be5\7\u01b8\2\2\u0be5\u0be6\7\u0221\2\2\u0be6\u0be7\bh\1\2\u0be7\u00cf"+
		"\3\2\2\2\u0be8\u0be9\7\u00d6\2\2\u0be9\u0bee\bi\1\2\u0bea\u0beb\7\u00d6"+
		"\2\2\u0beb\u0bec\7\u011e\2\2\u0bec\u0bee\bi\1\2\u0bed\u0be8\3\2\2\2\u0bed"+
		"\u0bea\3\2\2\2\u0bee\u00d1\3\2\2\2\u0bef\u0bf0\7\u00ea\2\2\u0bf0\u0bf9"+
		"\bj\1\2\u0bf1\u0bf2\7\u011e\2\2\u0bf2\u0bf3\7\u00ea\2\2\u0bf3\u0bf9\b"+
		"j\1\2\u0bf4\u0bf5\7\u016f\2\2\u0bf5\u0bf9\bj\1\2\u0bf6\u0bf7\7\u0158\2"+
		"\2\u0bf7\u0bf9\bj\1\2\u0bf8\u0bef\3\2\2\2\u0bf8\u0bf1\3\2\2\2\u0bf8\u0bf4"+
		"\3\2\2\2\u0bf8\u0bf6\3\2\2\2\u0bf9\u00d3\3\2\2\2\u0bfa\u0bfb\7\u00c1\2"+
		"\2\u0bfb\u0c00\bk\1\2\u0bfc\u0bfd\7\u011e\2\2\u0bfd\u0bfe\7\u00c1\2\2"+
		"\u0bfe\u0c00\bk\1\2\u0bff\u0bfa\3\2\2\2\u0bff\u0bfc\3\2\2\2\u0c00\u00d5"+
		"\3\2\2\2\u0c01\u0c02\7\u0093\2\2\u0c02\u0c07\bl\1\2\u0c03\u0c04\7\u011e"+
		"\2\2\u0c04\u0c05\7\u0093\2\2\u0c05\u0c07\bl\1\2\u0c06\u0c01\3\2\2\2\u0c06"+
		"\u0c03\3\2\2\2\u0c07\u00d7\3\2\2\2\u0c08\u0c09\t\27\2\2\u0c09\u00d9\3"+
		"\2\2\2\u009b\u00e4\u00ee\u00fe\u0116\u0133\u0141\u0147\u014c\u0150\u015d"+
		"\u0165\u017b\u0187\u0190\u019f\u01bd\u01c7\u01cd\u01d5\u01da\u01e0\u01ee"+
		"\u01f4\u0200\u020c\u0216\u0225\u022b\u0232\u023e\u0246\u0251\u0260\u026b"+
		"\u0272\u0278\u027f\u0287\u0296\u02a6\u02af\u02b8\u02c0\u02c8\u02d9\u02df"+
		"\u02f7\u02fd\u030e\u0318\u0328\u033a\u0346\u034a\u0366\u0372\u037d\u0391"+
		"\u039d\u03af\u03c1\u03c8\u03cd\u03d2\u03d7\u03de\u03e5\u03eb\u03f2\u03fa"+
		"\u0404\u040d\u0426\u0434\u0439\u0443\u044e\u0453\u045a\u0468\u046d\u0474"+
		"\u047f\u048a\u0493\u0497\u049a\u04a1\u04aa\u04bc\u04c7\u04d0\u04d5\u04dc"+
		"\u04e4\u04eb\u04f5\u0508\u050d\u051a\u052b\u053c\u0546\u054c\u0554\u0562"+
		"\u0596\u05ec\u05ee\u0619\u0623\u0636\u0644\u0657\u067d\u068c\u06a3\u06bb"+
		"\u0739\u085e\u086a\u087a\u0888\u08c4\u08cc\u08f3\u091e\u092e\u093d\u094d"+
		"\u095b\u0970\u09df\u09e5\u0a22\u0a2a\u0a35\u0a46\u0a71\u0aba\u0ace\u0ba2"+
		"\u0bb4\u0bb8\u0bbc\u0bc3\u0bcf\u0bd5\u0bde\u0bed\u0bf8\u0bff\u0c06";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}