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
		T_FORMAT_NUMBER=164, T_FOUND=165, T_FROM=166, T_FROM_UNIXTIME=167, T_FROMUTCTIMESTAMP=168, 
		T_FULL=169, T_FUNCTION=170, T_GET=171, T_GET_JSON_OBJECTS=172, T_GLOBAL=173, 
		T_GO=174, T_GRANT=175, T_GROUP=176, T_HANDLER=177, T_HASH=178, T_HAVING=179, 
		T_HDFS=180, T_HEX=181, T_HISTOGRAM_NUMERIC=182, T_HIVECONF=183, T_HIVEVAR=184, 
		T_HOST=185, T_HOUR=186, T_IDENTITY=187, T_IF=188, T_IGNORE=189, T_IMMEDIATE=190, 
		T_IN=191, T_INCLUDE=192, T_INDEX=193, T_IN_FILE=194, T_INITCAP=195, T_INITRANS=196, 
		T_INLINE=197, T_INNER=198, T_INOUT=199, T_INPUTFORMAT=200, T_INSERT=201, 
		T_IN_STR=202, T_INT=203, T_INT2=204, T_INT4=205, T_INT8=206, T_INTEGER=207, 
		T_INTERSECT=208, T_INTERVAL=209, T_INTO=210, T_INVOKER=211, T_IS=212, 
		T_ISNOTNULL=213, T_ISNULL=214, T_NVL=215, T_ISOPEN=216, T_ITEMS=217, T_JAVA_METHOD=218, 
		T_JOIN=219, T_JSONFILE=220, T_KEEP=221, T_KEY=222, T_KEYS=223, T_LANGUAGE=224, 
		T_LASTDAY=225, T_LATERAL=226, T_LCASE=227, T_LEAVE=228, T_LEFT=229, T_LENGTH=230, 
		T_LEVENSHTEIN=231, T_LIKE=232, T_LIMIT=233, T_LINES=234, T_LOCAL=235, 
		T_LOCATE=236, T_LOCATION=237, T_LOCATOR=238, T_LOCATORS=239, T_LOCKS=240, 
		T_LOG=241, T_LOG10=242, T_LOG2=243, T_LOGGED=244, T_LOGGED_IN_USER=245, 
		T_LOGGING=246, T_LOOP=247, T_LOWER=248, T_LPAD=249, T_LN=250, T_LTRIM=251, 
		T_MAP=252, T_MASK=253, T_MASK_FIRST_N=254, T_MASK_HASH=255, T_MASK_LAST_N=256, 
		T_MASK_SHOW_FIRST_N=257, T_MASK_SHOW_LAST_N=258, T_MATCHED=259, T_MAX=260, 
		T_MAXTRANS=261, T_MD5=262, T_MERGE=263, T_MESSAGE_TEXT=264, T_MICROSECOND=265, 
		T_MICROSECONDS=266, T_MIN=267, T_MINUTE=268, T_MONTH=269, T_MONTHS_BETWEEN=270, 
		T_MULTISET=271, T_NAMED_STRUCT=272, T_NCHAR=273, T_NEGATIVE=274, T_NEXT_DAY=275, 
		T_NEW=276, T_NVARCHAR=277, T_NO=278, T_NOCOUNT=279, T_NOCOMPRESS=280, 
		T_NOLOGGING=281, T_NONE=282, T_NORELY=283, T_NOT=284, T_NOTFOUND=285, 
		T_NOVALIDATE=286, T_NTILE=287, T_NULL=288, T_NULLIF=289, T_NUMERIC=290, 
		T_NUMBER=291, T_OBJECT=292, T_OCTET_LENGTH=293, T_OFF=294, T_ON=295, T_ONLY=296, 
		T_OPEN=297, T_OR=298, T_ORC=299, T_ORDER=300, T_OUT=301, T_OUTER=302, 
		T_OUTPUTFORMAT=303, T_OVER=304, T_OVERWRITE=305, T_OWNER=306, T_PACKAGE=307, 
		T_PARQUET=308, T_PARSE_URL=309, T_PARTITION=310, T_PARTITIONED=311, T_PCTFREE=312, 
		T_PCTUSED=313, T_PERCENT_RANK=314, T_PERCENTILE=315, T_PERCENTILE_APPROX=316, 
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
		RULE_insert_stmt = 8, RULE_opt_insert_partitions = 9, RULE_variable_substitution = 10, 
		RULE_use_var = 11, RULE_system_var_identifier = 12, RULE_opt_var_set_type = 13, 
		RULE_opt_var_use_type = 14, RULE_var_name = 15, RULE_droptable_stmt = 16, 
		RULE_opt_drop_table_purge = 17, RULE_create_table_stmt = 18, RULE_opt_column_specs = 19, 
		RULE_opt_constraint_specification = 20, RULE_opt_comment = 21, RULE_table_options = 22, 
		RULE_opt_partitioned_table = 23, RULE_partition_spec = 24, RULE_opt_clustered_by_table = 25, 
		RULE_opt_sorted_by_table = 26, RULE_opt_sorted_by_asc_desc = 27, RULE_opt_skewed_by_table = 28, 
		RULE_opt_on_skewed = 29, RULE_opt_skewed_stored_as_directory = 30, RULE_opt_row_formated = 31, 
		RULE_row_format = 32, RULE_opt_field_terminated_by = 33, RULE_opt_collection_items_terminated_by = 34, 
		RULE_opt_map_keys_terminated_by = 35, RULE_opt_lines_terminated_by = 36, 
		RULE_opt_null_defined_as = 37, RULE_opt_serde_properties = 38, RULE_serde_val = 39, 
		RULE_opt_stored_as = 40, RULE_opt_location = 41, RULE_opt_table_properties = 42, 
		RULE_opt_table_val = 43, RULE_opt_as_select = 44, RULE_file_format = 45, 
		RULE_column_definition = 46, RULE_column_constraint = 47, RULE_default_value = 48, 
		RULE_constraint_specification = 49, RULE_opt_constraint_enable_disable = 50, 
		RULE_opt_constraint_enable = 51, RULE_opt_constraint_disable = 52, RULE_opt_constraint_novalidate = 53, 
		RULE_opt_constraint_rely_no_rely = 54, RULE_opt_if_not_exists_flag = 55, 
		RULE_opt_if_exists = 56, RULE_table_type = 57, RULE_full_select_stmt = 58, 
		RULE_select_union_stmt = 59, RULE_select_union_type = 60, RULE_select_stmt = 61, 
		RULE_opt_lateral_view_expr = 62, RULE_column_identifier = 63, RULE_opt_where_expr = 64, 
		RULE_opt_group_by_list = 65, RULE_opt_having_expr = 66, RULE_opt_order_by_list = 67, 
		RULE_opt_order_by_mode = 68, RULE_opt_limit = 69, RULE_table_reference = 70, 
		RULE_join_table = 71, RULE_join_condition = 72, RULE_table_factor = 73, 
		RULE_select_all_distinct = 74, RULE_select_expr_list = 75, RULE_select_expr = 76, 
		RULE_over_clause = 77, RULE_over_func = 78, RULE_analytic_func = 79, RULE_expr_list = 80, 
		RULE_expr = 81, RULE_complex_types = 82, RULE_array_def = 83, RULE_map_def = 84, 
		RULE_struct_def = 85, RULE_named_struct_def = 86, RULE_str_func = 87, 
		RULE_misc_func = 88, RULE_expr_concat = 89, RULE_expr_concat_item = 90, 
		RULE_cond_func = 91, RULE_date_func = 92, RULE_dat_convrt_func = 93, RULE_basic_aggr_func = 94, 
		RULE_aggr_func = 95, RULE_tab_generate_func = 96, RULE_math_func = 97, 
		RULE_literal_values = 98, RULE_ident = 99, RULE_tab_ident = 100, RULE_complex_name = 101, 
		RULE_complex_atom_name = 102, RULE_name_identifier = 103, RULE_date_literal = 104, 
		RULE_timestamp_literal = 105, RULE_set_operators_is = 106, RULE_set_operators_like = 107, 
		RULE_set_operators_in = 108, RULE_set_operators_exists = 109, RULE_unary_operator = 110, 
		RULE_non_reserved_words = 111;
	public static final String[] ruleNames = {
		"program", "stmt_list", "data_type", "primitive_type", "complex_type", 
		"dtype_len", "stmt", "ddl_stmt", "insert_stmt", "opt_insert_partitions", 
		"variable_substitution", "use_var", "system_var_identifier", "opt_var_set_type", 
		"opt_var_use_type", "var_name", "droptable_stmt", "opt_drop_table_purge", 
		"create_table_stmt", "opt_column_specs", "opt_constraint_specification", 
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
		"opt_if_exists", "table_type", "full_select_stmt", "select_union_stmt", 
		"select_union_type", "select_stmt", "opt_lateral_view_expr", "column_identifier", 
		"opt_where_expr", "opt_group_by_list", "opt_having_expr", "opt_order_by_list", 
		"opt_order_by_mode", "opt_limit", "table_reference", "join_table", "join_condition", 
		"table_factor", "select_all_distinct", "select_expr_list", "select_expr", 
		"over_clause", "over_func", "analytic_func", "expr_list", "expr", "complex_types", 
		"array_def", "map_def", "struct_def", "named_struct_def", "str_func", 
		"misc_func", "expr_concat", "expr_concat_item", "cond_func", "date_func", 
		"dat_convrt_func", "basic_aggr_func", "aggr_func", "tab_generate_func", 
		"math_func", "literal_values", "ident", "tab_ident", "complex_name", "complex_atom_name", 
		"name_identifier", "date_literal", "timestamp_literal", "set_operators_is", 
		"set_operators_like", "set_operators_in", "set_operators_exists", "unary_operator", 
		"non_reserved_words"
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
		"T_FOUND", "T_FROM", "T_FROM_UNIXTIME", "T_FROMUTCTIMESTAMP", "T_FULL", 
		"T_FUNCTION", "T_GET", "T_GET_JSON_OBJECTS", "T_GLOBAL", "T_GO", "T_GRANT", 
		"T_GROUP", "T_HANDLER", "T_HASH", "T_HAVING", "T_HDFS", "T_HEX", "T_HISTOGRAM_NUMERIC", 
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
			setState(224);
			((ProgramContext)_localctx).stmt_list = stmt_list();
			setState(225);
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
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229);
				((Stmt_listContext)_localctx).stmt = stmt();
				((Stmt_listContext)_localctx).stmts.add(((Stmt_listContext)_localctx).stmt);
				setState(230);
				match(T_SEMICOLON);
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_CREATE || _la==T_DROP || _la==T_INSERT || _la==T_SELECT || _la==T_SET );
			 
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
			setState(244);
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
				setState(238);
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
				setState(241);
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
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T_TINYINT);
				 ((Primitive_typeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T_SMALLINT);
				 ((Primitive_typeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(T_INT);
				 ((Primitive_typeContext)_localctx).res =  "INT"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				match(T_BIGINT);
				 ((Primitive_typeContext)_localctx).res =  "BIGINT"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				match(T_BOOLEAN);
				 ((Primitive_typeContext)_localctx).res =  "BOOLEAN"; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(T_FLOAT);
				 ((Primitive_typeContext)_localctx).res =  "FLOAT"; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				match(T_DOUBLE);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PRECISION) {
					{
					setState(259);
					match(T_PRECISION);
					}
				}

				 ((Primitive_typeContext)_localctx).res =  "DOUBLE"; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				match(T_STRING);
				 ((Primitive_typeContext)_localctx).res =  "STRING"; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(265);
				match(T_BINARY);
				 ((Primitive_typeContext)_localctx).res =  "BINARY"; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(267);
				match(T_TIMESTAMP);
				 ((Primitive_typeContext)_localctx).res =  "TIMESTAMP"; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(269);
				match(T_DECIMAL);
				 ((Primitive_typeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(271);
				match(T_DECIMAL);
				setState(272);
				match(T_OPEN_P);
				setState(273);
				((Primitive_typeContext)_localctx).precision = match(INT_LITERAL);
				setState(274);
				match(T_COMMA);
				setState(275);
				((Primitive_typeContext)_localctx).scale = match(INT_LITERAL);
				setState(276);
				match(T_CLOSE_P);
				 ((Primitive_typeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(278);
				match(T_DATE);
				 ((Primitive_typeContext)_localctx).res =  "DATE"; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(280);
				match(T_VARCHAR);
				 ((Primitive_typeContext)_localctx).res =  "VARCHAR"; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(282);
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
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(T_ARRAY);
				setState(287);
				match(T_LESS);
				setState(288);
				((Complex_typeContext)_localctx).primitive_type = primitive_type();
				setState(289);
				match(T_GREATER);
				 ((Complex_typeContext)_localctx).res =  hql_array_type_spec(((Complex_typeContext)_localctx).primitive_type.res); 
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(T_MAP);
				setState(293);
				match(T_LESS);
				setState(294);
				((Complex_typeContext)_localctx).primitive_type = primitive_type();
				setState(295);
				match(T_COMMA);
				setState(296);
				((Complex_typeContext)_localctx).data_type = data_type();
				setState(297);
				match(T_GREATER);
				 ((Complex_typeContext)_localctx).res =  hql_map_type_spec(((Complex_typeContext)_localctx).primitive_type.res, ((Complex_typeContext)_localctx).data_type.res); 
				}
				break;
			case T_STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				 vector<Column_identifierContext*> column_list; vector<Data_typeContext*> data_type_list; 
				setState(301);
				match(T_STRUCT);
				setState(302);
				match(T_LESS);
				setState(303);
				((Complex_typeContext)_localctx).column_identifier = column_identifier();
				((Complex_typeContext)_localctx).column_list.add(((Complex_typeContext)_localctx).column_identifier);
				setState(304);
				match(T_COLON);
				setState(305);
				((Complex_typeContext)_localctx).data_type = data_type();
				((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(306);
					match(T_COMMA);
					setState(307);
					((Complex_typeContext)_localctx).column_identifier = column_identifier();
					((Complex_typeContext)_localctx).column_list.add(((Complex_typeContext)_localctx).column_identifier);
					setState(308);
					match(T_COLON);
					setState(309);
					((Complex_typeContext)_localctx).data_type = data_type();
					((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(316);
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
				setState(320);
				match(T_UNIONTYPE);
				setState(321);
				match(T_LESS);
				setState(322);
				((Complex_typeContext)_localctx).data_type = data_type();
				((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(323);
					match(T_COMMA);
					setState(324);
					((Complex_typeContext)_localctx).data_type = data_type();
					((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
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
			setState(335);
			match(T_OPEN_P);
			setState(336);
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
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(337);
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

			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(340);
				match(T_COMMA);
				setState(341);
				match(L_INT);
				}
			}

			setState(344);
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
		public Full_select_stmtContext full_select_stmt;
		public Ddl_stmtContext ddl_stmt;
		public Variable_substitutionContext variable_substitution;
		public Full_select_stmtContext full_select_stmt() {
			return getRuleContext(Full_select_stmtContext.class,0);
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
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				((StmtContext)_localctx).full_select_stmt = full_select_stmt();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).full_select_stmt.res; 
				}
				break;
			case T_CREATE:
			case T_DROP:
			case T_INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				((StmtContext)_localctx).ddl_stmt = ddl_stmt();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).ddl_stmt.res; 
				}
				break;
			case T_SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
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
		public Insert_stmtContext insert_stmt;
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Droptable_stmtContext droptable_stmt() {
			return getRuleContext(Droptable_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
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
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((Ddl_stmtContext)_localctx).create_table_stmt = create_table_stmt();
				 ((Ddl_stmtContext)_localctx).res =  ((Ddl_stmtContext)_localctx).create_table_stmt.res; 
				}
				break;
			case T_DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				((Ddl_stmtContext)_localctx).droptable_stmt = droptable_stmt();
				 ((Ddl_stmtContext)_localctx).res =  ((Ddl_stmtContext)_localctx).droptable_stmt.res; 
				}
				break;
			case T_INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				((Ddl_stmtContext)_localctx).insert_stmt = insert_stmt();
				 ((Ddl_stmtContext)_localctx).res =  ((Ddl_stmtContext)_localctx).insert_stmt.res; 
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public json res;
		public Tab_identContext tab_ident;
		public Opt_insert_partitionsContext opt_insert_partitions;
		public Opt_if_not_exists_flagContext opt_if_not_exists_flag;
		public Full_select_stmtContext full_select_stmt;
		public TerminalNode T_INSERT() { return getToken(HiveParser.T_INSERT, 0); }
		public TerminalNode T_INTO() { return getToken(HiveParser.T_INTO, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveParser.T_TABLE, 0); }
		public Tab_identContext tab_ident() {
			return getRuleContext(Tab_identContext.class,0);
		}
		public Opt_insert_partitionsContext opt_insert_partitions() {
			return getRuleContext(Opt_insert_partitionsContext.class,0);
		}
		public Opt_if_not_exists_flagContext opt_if_not_exists_flag() {
			return getRuleContext(Opt_if_not_exists_flagContext.class,0);
		}
		public Full_select_stmtContext full_select_stmt() {
			return getRuleContext(Full_select_stmtContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insert_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T_INSERT);
			setState(369);
			match(T_INTO);
			setState(370);
			match(T_TABLE);
			setState(371);
			((Insert_stmtContext)_localctx).tab_ident = tab_ident();
			setState(372);
			((Insert_stmtContext)_localctx).opt_insert_partitions = opt_insert_partitions();
			setState(373);
			((Insert_stmtContext)_localctx).opt_if_not_exists_flag = opt_if_not_exists_flag();
			setState(374);
			((Insert_stmtContext)_localctx).full_select_stmt = full_select_stmt();
			 ((Insert_stmtContext)_localctx).res =  hql_insert_select_stmt(((Insert_stmtContext)_localctx).tab_ident.res, ((Insert_stmtContext)_localctx).opt_insert_partitions.res, ((Insert_stmtContext)_localctx).opt_if_not_exists_flag.res, ((Insert_stmtContext)_localctx).full_select_stmt.res); 
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

	public static class Opt_insert_partitionsContext extends ParserRuleContext {
		public vector<json> res;
		public Name_identifierContext name_identifier;
		public List<Name_identifierContext> col_name_list = new ArrayList<Name_identifierContext>();
		public Literal_valuesContext literal_values;
		public List<Literal_valuesContext> col_value_list = new ArrayList<Literal_valuesContext>();
		public TerminalNode T_PARTITION() { return getToken(HiveParser.T_PARTITION, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<Name_identifierContext> name_identifier() {
			return getRuleContexts(Name_identifierContext.class);
		}
		public Name_identifierContext name_identifier(int i) {
			return getRuleContext(Name_identifierContext.class,i);
		}
		public List<Literal_valuesContext> literal_values() {
			return getRuleContexts(Literal_valuesContext.class);
		}
		public Literal_valuesContext literal_values(int i) {
			return getRuleContext(Literal_valuesContext.class,i);
		}
		public Opt_insert_partitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_insert_partitions; }
	}

	public final Opt_insert_partitionsContext opt_insert_partitions() throws RecognitionException {
		Opt_insert_partitionsContext _localctx = new Opt_insert_partitionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_opt_insert_partitions);
		int _la;
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_insert_partitionsContext)_localctx).res =  vector<json>(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 vector<Name_identifierContext*> col_name_list; vector<Literal_valuesContext*> col_value_list; 
				setState(379);
				match(T_PARTITION);
				setState(380);
				match(T_OPEN_P);
				setState(381);
				((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
				((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
				setState(382);
				match(T_EQUAL);
				setState(383);
				((Opt_insert_partitionsContext)_localctx).literal_values = literal_values();
				((Opt_insert_partitionsContext)_localctx).col_value_list.add(((Opt_insert_partitionsContext)_localctx).literal_values);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(384);
					match(T_COMMA);
					setState(385);
					((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
					((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
					setState(386);
					match(T_EQUAL);
					setState(387);
					((Opt_insert_partitionsContext)_localctx).literal_values = literal_values();
					((Opt_insert_partitionsContext)_localctx).col_value_list.add(((Opt_insert_partitionsContext)_localctx).literal_values);
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
				match(T_CLOSE_P);

				        vector<json> result_list;
				        for(int i = 0 ; i < ((Opt_insert_partitionsContext)_localctx).col_name_list.size() ; i++)
				        {
				            json tmp;
				            tmp[remove_backquotes(((Opt_insert_partitionsContext)_localctx).col_name_list[i]->res)] = ((Opt_insert_partitionsContext)_localctx).col_value_list[i]->res;
				            result_list.push_back(tmp);
				        }
				        ((Opt_insert_partitionsContext)_localctx).res =  result_list;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 vector<Name_identifierContext*> col_name_list; 
				setState(398);
				match(T_PARTITION);
				setState(399);
				match(T_OPEN_P);
				setState(400);
				((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
				((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(401);
					match(T_COMMA);
					setState(402);
					((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
					((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
				match(T_CLOSE_P);

				        vector<json> result_list;
				        for(int i = 0 ; i < ((Opt_insert_partitionsContext)_localctx).col_name_list.size() ; i++)
				        {
				            json tmp;
				            tmp[remove_backquotes(((Opt_insert_partitionsContext)_localctx).col_name_list[i]->res)] = "NULL";
				            result_list.push_back(tmp);
				        }
				        ((Opt_insert_partitionsContext)_localctx).res =  result_list;
				    
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
		enterRule(_localctx, 20, RULE_variable_substitution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T_SET);
			setState(414);
			((Variable_substitutionContext)_localctx).opt_var_set_type = opt_var_set_type();
			setState(415);
			((Variable_substitutionContext)_localctx).system_var_identifier = system_var_identifier();
			setState(416);
			match(T_EQUAL);
			setState(417);
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
		enterRule(_localctx, 22, RULE_use_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__0);
			setState(421);
			match(T_OPEN_B);
			setState(422);
			((Use_varContext)_localctx).opt_var_use_type = opt_var_use_type();
			setState(423);
			((Use_varContext)_localctx).system_var_identifier = system_var_identifier();
			setState(424);
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
		enterRule(_localctx, 24, RULE_system_var_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<Var_nameContext*> var_name_list; 
			setState(428);
			((System_var_identifierContext)_localctx).var_name = var_name();
			((System_var_identifierContext)_localctx).var_name_list.add(((System_var_identifierContext)_localctx).var_name);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(429);
				match(T__1);
				setState(430);
				((System_var_identifierContext)_localctx).var_name = var_name();
				((System_var_identifierContext)_localctx).var_name_list.add(((System_var_identifierContext)_localctx).var_name);
				}
				}
				setState(435);
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
		enterRule(_localctx, 26, RULE_opt_var_set_type);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALL:
			case T_ALTER:
			case T_AND:
			case T_AS:
			case T_ASC:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SETS:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SPLIT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_var_set_typeContext)_localctx).res =  "HIVECONF"; 
				}
				break;
			case T_HIVECONF:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(T_HIVECONF);
				setState(440);
				match(T_COLON);
				 ((Opt_var_set_typeContext)_localctx).res =  "HIVECONF"; 
				}
				break;
			case T_HIVEVAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				match(T_HIVEVAR);
				setState(443);
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
		enterRule(_localctx, 28, RULE_opt_var_use_type);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALL:
			case T_ALTER:
			case T_AND:
			case T_AS:
			case T_ASC:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SETS:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SPLIT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_var_use_typeContext)_localctx).res =  "HIVEVAR"; 
				}
				break;
			case T_HIVECONF:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(T_HIVECONF);
				setState(449);
				match(T_COLON);
				 ((Opt_var_use_typeContext)_localctx).res =  "HIVECONF"; 
				}
				break;
			case T_HIVEVAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				match(T_HIVEVAR);
				setState(452);
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
		public Name_identifierContext name_identifier;
		public Name_identifierContext name_identifier() {
			return getRuleContext(Name_identifierContext.class,0);
		}
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			((Var_nameContext)_localctx).name_identifier = name_identifier();
			 ((Var_nameContext)_localctx).res =  ((Var_nameContext)_localctx).name_identifier.res; 
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
		enterRule(_localctx, 32, RULE_droptable_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(T_DROP);
			setState(460);
			match(T_TABLE);
			setState(461);
			((Droptable_stmtContext)_localctx).opt_if_exists = opt_if_exists();
			setState(462);
			((Droptable_stmtContext)_localctx).tab_ident = tab_ident();
			setState(463);
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
		enterRule(_localctx, 34, RULE_opt_drop_table_purge);
		try {
			setState(469);
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
				setState(467);
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
		enterRule(_localctx, 36, RULE_create_table_stmt);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(T_CREATE);
				setState(472);
				((Create_table_stmtContext)_localctx).table_type = table_type();
				setState(473);
				match(T_TABLE);
				setState(474);
				((Create_table_stmtContext)_localctx).opt_if_not_exists_flag = opt_if_not_exists_flag();
				setState(475);
				((Create_table_stmtContext)_localctx).tab_ident = tab_ident();
				setState(476);
				((Create_table_stmtContext)_localctx).opt_column_specs = opt_column_specs();
				setState(477);
				((Create_table_stmtContext)_localctx).opt_constraint_specification = opt_constraint_specification();
				setState(478);
				((Create_table_stmtContext)_localctx).opt_comment = opt_comment();
				setState(479);
				((Create_table_stmtContext)_localctx).opt_partitioned_table = opt_partitioned_table();
				setState(480);
				((Create_table_stmtContext)_localctx).opt_clustered_by_table = opt_clustered_by_table();
				setState(481);
				((Create_table_stmtContext)_localctx).opt_skewed_by_table = opt_skewed_by_table();
				setState(482);
				((Create_table_stmtContext)_localctx).opt_row_formated = opt_row_formated();
				setState(483);
				((Create_table_stmtContext)_localctx).opt_stored_as = opt_stored_as();
				setState(484);
				((Create_table_stmtContext)_localctx).opt_location = opt_location();
				setState(485);
				((Create_table_stmtContext)_localctx).opt_table_properties = opt_table_properties();
				setState(486);
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
				setState(489);
				match(T_CREATE);
				setState(490);
				((Create_table_stmtContext)_localctx).table_type = table_type();
				setState(491);
				match(T_TABLE);
				setState(492);
				((Create_table_stmtContext)_localctx).opt_if_not_exists_flag = opt_if_not_exists_flag();
				setState(493);
				((Create_table_stmtContext)_localctx).tab_name = tab_ident();
				setState(494);
				match(T_LIKE);
				setState(495);
				((Create_table_stmtContext)_localctx).tab_like = tab_ident();
				setState(496);
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
		enterRule(_localctx, 38, RULE_opt_column_specs);
		int _la;
		try {
			setState(515);
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
				setState(503);
				match(T_OPEN_P);
				setState(504);
				((Opt_column_specsContext)_localctx).column_definition = column_definition();
				((Opt_column_specsContext)_localctx).column_def_list.add(((Opt_column_specsContext)_localctx).column_definition);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(505);
					match(T_COMMA);
					setState(506);
					((Opt_column_specsContext)_localctx).column_definition = column_definition();
					((Opt_column_specsContext)_localctx).column_def_list.add(((Opt_column_specsContext)_localctx).column_definition);
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(512);
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
		enterRule(_localctx, 40, RULE_opt_constraint_specification);
		int _la;
		try {
			setState(528);
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
				setState(519);
				((Opt_constraint_specificationContext)_localctx).constraint_specification = constraint_specification();
				((Opt_constraint_specificationContext)_localctx).constraint_list.add(((Opt_constraint_specificationContext)_localctx).constraint_specification);
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_CONSTRAINT || _la==T_PRIMARY) {
					{
					{
					setState(520);
					((Opt_constraint_specificationContext)_localctx).constraint_specification = constraint_specification();
					((Opt_constraint_specificationContext)_localctx).constraint_list.add(((Opt_constraint_specificationContext)_localctx).constraint_specification);
					}
					}
					setState(525);
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
		enterRule(_localctx, 42, RULE_opt_comment);
		try {
			setState(534);
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
				setState(531);
				match(T_COMMENT);
				setState(532);
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
		enterRule(_localctx, 44, RULE_table_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
		enterRule(_localctx, 46, RULE_opt_partitioned_table);
		int _la;
		try {
			setState(554);
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
				setState(540);
				match(T_PARTITIONED);
				setState(541);
				match(T_BY);
				setState(542);
				match(T_OPEN_P);
				setState(543);
				((Opt_partitioned_tableContext)_localctx).partition_spec = partition_spec();
				((Opt_partitioned_tableContext)_localctx).partition_field_list.add(((Opt_partitioned_tableContext)_localctx).partition_spec);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(544);
					match(T_COMMA);
					setState(545);
					((Opt_partitioned_tableContext)_localctx).partition_spec = partition_spec();
					((Opt_partitioned_tableContext)_localctx).partition_field_list.add(((Opt_partitioned_tableContext)_localctx).partition_spec);
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551);
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
		enterRule(_localctx, 48, RULE_partition_spec);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				((Partition_specContext)_localctx).column_identifier = column_identifier();
				setState(557);
				((Partition_specContext)_localctx).data_type = data_type();
				 ((Partition_specContext)_localctx).res =  hql_column_definition(((Partition_specContext)_localctx).column_identifier.res, ((Partition_specContext)_localctx).data_type.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				((Partition_specContext)_localctx).column_identifier = column_identifier();
				setState(561);
				((Partition_specContext)_localctx).data_type = data_type();
				setState(562);
				match(T_COMMENT);
				setState(563);
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
		enterRule(_localctx, 50, RULE_opt_clustered_by_table);
		int _la;
		try {
			setState(588);
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
				setState(570);
				match(T_CLUSTERED);
				setState(571);
				match(T_BY);
				setState(572);
				match(T_OPEN_P);
				setState(573);
				((Opt_clustered_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_clustered_by_tableContext)_localctx).column_list.add(((Opt_clustered_by_tableContext)_localctx).column_identifier);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(574);
					match(T_COMMA);
					setState(575);
					((Opt_clustered_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_clustered_by_tableContext)_localctx).column_list.add(((Opt_clustered_by_tableContext)_localctx).column_identifier);
					}
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(581);
				match(T_CLOSE_P);
				setState(582);
				((Opt_clustered_by_tableContext)_localctx).opt_sorted_by_table = opt_sorted_by_table();
				setState(583);
				match(T_INTO);
				setState(584);
				((Opt_clustered_by_tableContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(585);
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
		enterRule(_localctx, 52, RULE_opt_sorted_by_table);
		int _la;
		try {
			setState(609);
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
				setState(592);
				match(T_STORED);
				setState(593);
				match(T_BY);
				setState(594);
				match(T_OPEN_P);
				setState(595);
				((Opt_sorted_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_sorted_by_tableContext)_localctx).column_list.add(((Opt_sorted_by_tableContext)_localctx).column_identifier);
				setState(596);
				((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc = opt_sorted_by_asc_desc();
				((Opt_sorted_by_tableContext)_localctx).sort_type_list.add(((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc);
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(597);
					match(T_COMMA);
					setState(598);
					((Opt_sorted_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_sorted_by_tableContext)_localctx).column_list.add(((Opt_sorted_by_tableContext)_localctx).column_identifier);
					setState(599);
					((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc = opt_sorted_by_asc_desc();
					((Opt_sorted_by_tableContext)_localctx).sort_type_list.add(((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc);
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(606);
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
		enterRule(_localctx, 54, RULE_opt_sorted_by_asc_desc);
		try {
			setState(616);
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
				setState(612);
				match(T_ASC);
				 ((Opt_sorted_by_asc_descContext)_localctx).res =  "ASC"; 
				}
				break;
			case T_DESC:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
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
		enterRule(_localctx, 56, RULE_opt_skewed_by_table);
		int _la;
		try {
			setState(636);
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
				setState(620);
				match(T_SKEWED);
				setState(621);
				match(T_BY);
				setState(622);
				match(T_OPEN_P);
				setState(623);
				((Opt_skewed_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_skewed_by_tableContext)_localctx).column_list.add(((Opt_skewed_by_tableContext)_localctx).column_identifier);
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(624);
					match(T_COMMA);
					setState(625);
					((Opt_skewed_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_skewed_by_tableContext)_localctx).column_list.add(((Opt_skewed_by_tableContext)_localctx).column_identifier);
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(631);
				((Opt_skewed_by_tableContext)_localctx).opt_on_skewed = opt_on_skewed();
				setState(632);
				match(T_CLOSE_P);
				setState(633);
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
		enterRule(_localctx, 58, RULE_opt_on_skewed);
		int _la;
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
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
				setState(640);
				match(T_ON);
				setState(641);
				match(T_OPEN_P);
				setState(642);
				((Opt_on_skewedContext)_localctx).literal_values = literal_values();
				((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(643);
					match(T_COMMA);
					setState(644);
					((Opt_on_skewedContext)_localctx).literal_values = literal_values();
					((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
					}
					}
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(650);
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
				setState(654);
				match(T_ON);
				setState(655);
				match(T_OPEN_P);
				setState(656);
				match(T_OPEN_P);
				setState(657);
				((Opt_on_skewedContext)_localctx).literal_values = literal_values();
				((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(658);
					match(T_COMMA);
					setState(659);
					((Opt_on_skewedContext)_localctx).literal_values = literal_values();
					((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
					}
					}
					setState(664);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(665);
				match(T_CLOSE_P);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(666);
					match(T_COMMA);
					setState(667);
					match(T_OPEN_P);
					setState(668);
					((Opt_on_skewedContext)_localctx).literal_values = literal_values();
					((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(669);
						match(T_COMMA);
						setState(670);
						((Opt_on_skewedContext)_localctx).literal_values = literal_values();
						((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
						}
						}
						setState(675);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(676);
					match(T_CLOSE_P);
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(683);
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
		enterRule(_localctx, 60, RULE_opt_skewed_stored_as_directory);
		try {
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_skewed_stored_as_directoryContext)_localctx).res =  false; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				match(T_STORED);
				setState(690);
				match(T_AS);
				setState(691);
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
		enterRule(_localctx, 62, RULE_opt_row_formated);
		try {
			setState(701);
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
				setState(696);
				match(T_ROW);
				setState(697);
				match(T_FORMAT);
				setState(698);
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
		enterRule(_localctx, 64, RULE_row_format);
		try {
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DELIMITED:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(T_DELIMITED);
				setState(704);
				((Row_formatContext)_localctx).opt_field_terminated_by = opt_field_terminated_by();
				setState(705);
				((Row_formatContext)_localctx).opt_collection_items_terminated_by = opt_collection_items_terminated_by();
				setState(706);
				((Row_formatContext)_localctx).opt_map_keys_terminated_by = opt_map_keys_terminated_by();
				setState(707);
				((Row_formatContext)_localctx).opt_lines_terminated_by = opt_lines_terminated_by();
				setState(708);
				((Row_formatContext)_localctx).opt_null_defined_as = opt_null_defined_as();
				 ((Row_formatContext)_localctx).res =  hql_row_format_delimited(((Row_formatContext)_localctx).opt_field_terminated_by.res, ((Row_formatContext)_localctx).opt_collection_items_terminated_by.res, ((Row_formatContext)_localctx).opt_map_keys_terminated_by.res, ((Row_formatContext)_localctx).opt_lines_terminated_by.res, ((Row_formatContext)_localctx).opt_null_defined_as.res); 
				}
				break;
			case T_SERDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				match(T_SERDE);
				setState(712);
				((Row_formatContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				setState(713);
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
		enterRule(_localctx, 66, RULE_opt_field_terminated_by);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_field_terminated_byContext)_localctx).res =  json(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				match(T_FIELDS);
				setState(720);
				match(T_TERMINATED);
				setState(721);
				match(T_BY);
				setState(722);
				((Opt_field_terminated_byContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Opt_field_terminated_byContext)_localctx).res =  remove_quotes((((Opt_field_terminated_byContext)_localctx).STRING_LITERAL!=null?((Opt_field_terminated_byContext)_localctx).STRING_LITERAL.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				match(T_FIELDS);
				setState(725);
				match(T_TERMINATED);
				setState(726);
				match(T_BY);
				setState(727);
				((Opt_field_terminated_byContext)_localctx).delimiter = match(STRING_LITERAL);
				setState(728);
				match(T_ESCAPED);
				setState(729);
				match(T_BY);
				setState(730);
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
		enterRule(_localctx, 68, RULE_opt_collection_items_terminated_by);
		try {
			setState(741);
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
				setState(735);
				match(T_COLLECTION);
				setState(736);
				match(T_ITEMS);
				setState(737);
				match(T_TERMINATED);
				setState(738);
				match(T_BY);
				setState(739);
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
		enterRule(_localctx, 70, RULE_opt_map_keys_terminated_by);
		try {
			setState(750);
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
				setState(744);
				match(T_MAP);
				setState(745);
				match(T_KEYS);
				setState(746);
				match(T_TERMINATED);
				setState(747);
				match(T_BY);
				setState(748);
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
		enterRule(_localctx, 72, RULE_opt_lines_terminated_by);
		try {
			setState(758);
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
				setState(753);
				match(T_LINES);
				setState(754);
				match(T_TERMINATED);
				setState(755);
				match(T_BY);
				setState(756);
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
		enterRule(_localctx, 74, RULE_opt_null_defined_as);
		try {
			setState(766);
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
				setState(761);
				match(T_NULL);
				setState(762);
				match(T_DEFINED);
				setState(763);
				match(T_AS);
				setState(764);
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
		enterRule(_localctx, 76, RULE_opt_serde_properties);
		int _la;
		try {
			setState(789);
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
				setState(770);
				match(T_WITH);
				setState(771);
				match(T_SERDEPROPERTIES);
				setState(772);
				match(T_OPEN_P);
				setState(773);
				((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
				((Opt_serde_propertiesContext)_localctx).opt_name_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
				setState(774);
				match(T_EQUAL);
				setState(775);
				((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
				((Opt_serde_propertiesContext)_localctx).opt_val_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(776);
					match(T_COMMA);
					setState(777);
					((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
					((Opt_serde_propertiesContext)_localctx).opt_name_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
					setState(778);
					match(T_EQUAL);
					setState(779);
					((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
					((Opt_serde_propertiesContext)_localctx).opt_val_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
					}
					}
					setState(785);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(786);
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
		enterRule(_localctx, 78, RULE_serde_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
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
		enterRule(_localctx, 80, RULE_opt_stored_as);
		try {
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_stored_asContext)_localctx).res =  json(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(T_STORED);
				setState(796);
				match(T_AS);
				setState(797);
				((Opt_stored_asContext)_localctx).file_format = file_format();
				 ((Opt_stored_asContext)_localctx).res =  hql_stored_as_file_format(((Opt_stored_asContext)_localctx).file_format.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				match(T_STORED);
				setState(801);
				match(T_AS);
				setState(802);
				match(T_INPUTFORMAT);
				setState(803);
				((Opt_stored_asContext)_localctx).input_format = match(STRING_LITERAL);
				setState(804);
				match(T_OUTPUTFORMAT);
				setState(805);
				((Opt_stored_asContext)_localctx).output_format = match(STRING_LITERAL);
				 ((Opt_stored_asContext)_localctx).res =  hql_stored_as_file_format((((Opt_stored_asContext)_localctx).input_format!=null?((Opt_stored_asContext)_localctx).input_format.getText():null), (((Opt_stored_asContext)_localctx).output_format!=null?((Opt_stored_asContext)_localctx).output_format.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				match(T_STORED);
				setState(808);
				match(T_BY);
				setState(809);
				((Opt_stored_asContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				setState(810);
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
		enterRule(_localctx, 82, RULE_opt_location);
		try {
			setState(819);
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
				setState(816);
				match(T_LOCATION);
				setState(817);
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
		enterRule(_localctx, 84, RULE_opt_table_properties);
		int _la;
		try {
			setState(841);
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
				setState(823);
				match(T_TBLPROPERTIES);
				setState(824);
				match(T_OPEN_P);
				setState(825);
				((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
				((Opt_table_propertiesContext)_localctx).opt_name_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
				setState(826);
				match(T_EQUAL);
				setState(827);
				((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
				((Opt_table_propertiesContext)_localctx).opt_val_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(828);
					match(T_COMMA);
					setState(829);
					((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
					((Opt_table_propertiesContext)_localctx).opt_name_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
					setState(830);
					match(T_EQUAL);
					setState(831);
					((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
					((Opt_table_propertiesContext)_localctx).opt_val_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
					}
					}
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(838);
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
		enterRule(_localctx, 86, RULE_opt_table_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
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
		public Full_select_stmtContext full_select_stmt;
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public Full_select_stmtContext full_select_stmt() {
			return getRuleContext(Full_select_stmtContext.class,0);
		}
		public Opt_as_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_as_select; }
	}

	public final Opt_as_selectContext opt_as_select() throws RecognitionException {
		Opt_as_selectContext _localctx = new Opt_as_selectContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_opt_as_select);
		try {
			setState(851);
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
				setState(847);
				match(T_AS);
				setState(848);
				((Opt_as_selectContext)_localctx).full_select_stmt = full_select_stmt();
				 ((Opt_as_selectContext)_localctx).res =  ((Opt_as_selectContext)_localctx).full_select_stmt.res; 
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
		enterRule(_localctx, 90, RULE_file_format);
		try {
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEQUENCEFILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				match(T_SEQUENCEFILE);
				 ((File_formatContext)_localctx).res =  "SEQUENCEFILE"; 
				}
				break;
			case T_TEXTFILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				match(T_TEXTFILE);
				 ((File_formatContext)_localctx).res =  "TEXTFILE"; 
				}
				break;
			case T_RCFILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
				match(T_RCFILE);
				 ((File_formatContext)_localctx).res =  "RCFILE"; 
				}
				break;
			case T_ORC:
				enterOuterAlt(_localctx, 4);
				{
				setState(859);
				match(T_ORC);
				 ((File_formatContext)_localctx).res =  "ORC"; 
				}
				break;
			case T_PARQUET:
				enterOuterAlt(_localctx, 5);
				{
				setState(861);
				match(T_PARQUET);
				 ((File_formatContext)_localctx).res =  "PARQUET"; 
				}
				break;
			case T_AVRO:
				enterOuterAlt(_localctx, 6);
				{
				setState(863);
				match(T_AVRO);
				 ((File_formatContext)_localctx).res =  "AVRO"; 
				}
				break;
			case T_JSONFILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(865);
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
		enterRule(_localctx, 92, RULE_column_definition);
		int _la;
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(870);
				((Column_definitionContext)_localctx).data_type = data_type();
				 ((Column_definitionContext)_localctx).res =  hql_column_definition(((Column_definitionContext)_localctx).column_identifier.res, ((Column_definitionContext)_localctx).data_type.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(874);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(875);
				match(T_COMMENT);
				setState(876);
				((Column_definitionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Column_definitionContext)_localctx).res =  hql_column_definition(((Column_definitionContext)_localctx).column_identifier.res, ((Column_definitionContext)_localctx).data_type.res, (((Column_definitionContext)_localctx).STRING_LITERAL!=null?((Column_definitionContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				vector<Column_constraintContext*> constraint_list; 
				setState(880);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(881);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(883); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(882);
					((Column_definitionContext)_localctx).column_constraint = column_constraint();
					((Column_definitionContext)_localctx).constraint_list.add(((Column_definitionContext)_localctx).column_constraint);
					}
					}
					setState(885); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_CHECK || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (T_DEFAULT - 110)) | (1L << (T_DISABLE - 110)) | (1L << (T_ENABLE - 110)))) != 0) || ((((_la - 283)) & ~0x3f) == 0 && ((1L << (_la - 283)) & ((1L << (T_NORELY - 283)) | (1L << (T_NOT - 283)) | (1L << (T_NOVALIDATE - 283)) | (1L << (T_PRIMARY - 283)))) != 0) || _la==T_RELY || _la==T_UNIQUE );
				setState(887);
				match(T_COMMENT);
				setState(888);
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
				setState(892);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(893);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(895); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(894);
					((Column_definitionContext)_localctx).column_constraint = column_constraint();
					((Column_definitionContext)_localctx).constraint_list.add(((Column_definitionContext)_localctx).column_constraint);
					}
					}
					setState(897); 
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
		enterRule(_localctx, 94, RULE_column_constraint);
		try {
			setState(929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				match(T_PRIMARY);
				setState(904);
				match(T_KEY);
				 ((Column_constraintContext)_localctx).res =  json({"primary_key", true}); 
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				match(T_UNIQUE);
				 ((Column_constraintContext)_localctx).res =  json({"unique", true}); 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				match(T_NOT);
				setState(909);
				match(T_NULL);
				 ((Column_constraintContext)_localctx).res =  json({"not_null", true}); 
				}
				break;
			case T_DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(911);
				match(T_DEFAULT);
				setState(912);
				((Column_constraintContext)_localctx).default_value = default_value();
				 ((Column_constraintContext)_localctx).res =  json({"default_value", ((Column_constraintContext)_localctx).default_value.res}); 
				}
				break;
			case T_CHECK:
				enterOuterAlt(_localctx, 5);
				{
				setState(915);
				match(T_CHECK);
				setState(916);
				((Column_constraintContext)_localctx).expr = expr(0);
				 ((Column_constraintContext)_localctx).res =  json({"check", ((Column_constraintContext)_localctx).expr.res}); 
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(919);
				match(T_ENABLE);
				 ((Column_constraintContext)_localctx).res =  json({"enable", true}); 
				}
				break;
			case T_DISABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(921);
				match(T_DISABLE);
				 ((Column_constraintContext)_localctx).res =  json({"enable", false}); 
				}
				break;
			case T_NOVALIDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(923);
				match(T_NOVALIDATE);
				 ((Column_constraintContext)_localctx).res =  json({"novalidate", true}); 
				}
				break;
			case T_RELY:
				enterOuterAlt(_localctx, 9);
				{
				setState(925);
				match(T_RELY);
				 ((Column_constraintContext)_localctx).res =  json({"rely", true}); 
				}
				break;
			case T_NORELY:
				enterOuterAlt(_localctx, 10);
				{
				setState(927);
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
		enterRule(_localctx, 96, RULE_default_value);
		try {
			setState(941);
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
				setState(931);
				literal_values();
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				match(T_CURRENT_USER);
				setState(933);
				match(T_OPEN_P);
				setState(934);
				match(T_CLOSE_P);
				}
				break;
			case T_CURRENT_DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(935);
				match(T_CURRENT_DATE);
				setState(936);
				match(T_OPEN_P);
				setState(937);
				match(T_CLOSE_P);
				}
				break;
			case T_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(938);
				match(T_CURRENT_TIMESTAMP);
				setState(939);
				match(T_OPEN_P);
				setState(940);
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
		public Name_identifierContext name_identifier() {
			return getRuleContext(Name_identifierContext.class,0);
		}
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
		enterRule(_localctx, 98, RULE_constraint_specification);
		int _la;
		try {
			setState(1020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				vector<Column_identifierContext*> column_list; 
				setState(944);
				match(T_PRIMARY);
				setState(945);
				match(T_KEY);
				setState(946);
				match(T_OPEN_P);
				setState(947);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(948);
					match(T_COMMA);
					setState(949);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(954);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(955);
				match(T_CLOSE_P);
				setState(956);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(957);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(958);
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
				setState(962);
				match(T_CONSTRAINT);
				setState(963);
				name_identifier();
				setState(964);
				match(T_FOREIGN);
				setState(965);
				match(T_KEY);
				setState(966);
				match(T_OPEN_P);
				setState(967);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(968);
					match(T_COMMA);
					setState(969);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(975);
				match(T_CLOSE_P);
				setState(976);
				match(T_REFERENCES);
				setState(977);
				((Constraint_specificationContext)_localctx).tab_ident = tab_ident();
				setState(978);
				match(T_OPEN_P);
				setState(979);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).ref_column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(980);
					match(T_COMMA);
					setState(981);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).ref_column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(987);
				match(T_CLOSE_P);
				setState(988);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(989);
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
				setState(993);
				match(T_CONSTRAINT);
				setState(994);
				name_identifier();
				setState(995);
				match(T_UNIQUE);
				setState(996);
				match(T_OPEN_P);
				setState(997);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(998);
					match(T_COMMA);
					setState(999);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(1004);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1005);
				match(T_CLOSE_P);
				setState(1006);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(1007);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(1008);
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
				setState(1011);
				match(T_CONSTRAINT);
				setState(1012);
				name_identifier();
				setState(1013);
				match(T_CHECK);
				setState(1014);
				((Constraint_specificationContext)_localctx).expr = expr(0);
				setState(1015);
				((Constraint_specificationContext)_localctx).opt_constraint_enable_disable = opt_constraint_enable_disable();
				setState(1016);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(1017);
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
		enterRule(_localctx, 100, RULE_opt_constraint_enable_disable);
		try {
			setState(1027);
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
				setState(1023);
				match(T_ENABLE);
				 ((Opt_constraint_enable_disableContext)_localctx).res =  "ENABLE"; 
				}
				break;
			case T_DISABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1025);
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
		enterRule(_localctx, 102, RULE_opt_constraint_enable);
		try {
			setState(1032);
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
				setState(1030);
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
		enterRule(_localctx, 104, RULE_opt_constraint_disable);
		try {
			setState(1037);
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
				setState(1035);
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
		enterRule(_localctx, 106, RULE_opt_constraint_novalidate);
		try {
			setState(1042);
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
				setState(1040);
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
		enterRule(_localctx, 108, RULE_opt_constraint_rely_no_rely);
		try {
			setState(1049);
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
				setState(1045);
				match(T_RELY);
				 ((Opt_constraint_rely_no_relyContext)_localctx).res =  "RELY"; 
				}
				break;
			case T_NORELY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1047);
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
		enterRule(_localctx, 110, RULE_opt_if_not_exists_flag);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_if_not_exists_flagContext)_localctx).res =  false; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				match(T_IF);
				setState(1053);
				match(T_NOT);
				setState(1054);
				match(T_EXISTS);
				 ((Opt_if_not_exists_flagContext)_localctx).res =  true; 
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
		enterRule(_localctx, 112, RULE_opt_if_exists);
		try {
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_if_existsContext)_localctx).res =  false; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1059);
				match(T_IF);
				setState(1060);
				match(T_EXISTS);
				 ((Opt_if_existsContext)_localctx).res =  true; 
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
		enterRule(_localctx, 114, RULE_table_type);
		try {
			setState(1069);
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
				setState(1065);
				match(T_EXTERNAL);
				 ((Table_typeContext)_localctx).res =  "EXTERNAL"; 
				}
				break;
			case T_TEMPORARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1067);
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

	public static class Full_select_stmtContext extends ParserRuleContext {
		public json res;
		public Select_stmtContext select_stmt;
		public Select_union_stmtContext select_union_stmt;
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Select_union_stmtContext select_union_stmt() {
			return getRuleContext(Select_union_stmtContext.class,0);
		}
		public Full_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_select_stmt; }
	}

	public final Full_select_stmtContext full_select_stmt() throws RecognitionException {
		Full_select_stmtContext _localctx = new Full_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_full_select_stmt);
		try {
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				((Full_select_stmtContext)_localctx).select_stmt = select_stmt();
				 ((Full_select_stmtContext)_localctx).res =  ((Full_select_stmtContext)_localctx).select_stmt.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				((Full_select_stmtContext)_localctx).select_union_stmt = select_union_stmt();
				 ((Full_select_stmtContext)_localctx).res =  ((Full_select_stmtContext)_localctx).select_union_stmt.res; 
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
		enterRule(_localctx, 118, RULE_select_union_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			vector<Select_union_typeContext*> union_type_list; vector<Select_stmtContext*> select_stmt_list; 
			setState(1080);
			((Select_union_stmtContext)_localctx).base_select = select_stmt();
			setState(1085); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1081);
				match(T_UNION);
				setState(1082);
				((Select_union_stmtContext)_localctx).select_union_type = select_union_type();
				((Select_union_stmtContext)_localctx).union_type_list.add(((Select_union_stmtContext)_localctx).select_union_type);
				setState(1083);
				((Select_union_stmtContext)_localctx).select_stmt = select_stmt();
				((Select_union_stmtContext)_localctx).select_stmt_list.add(((Select_union_stmtContext)_localctx).select_stmt);
				}
				}
				setState(1087); 
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
		enterRule(_localctx, 120, RULE_select_union_type);
		try {
			setState(1096);
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
				setState(1092);
				match(T_ALL);
				 ((Select_union_typeContext)_localctx).res =  "ALL"; 
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1094);
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
		enterRule(_localctx, 122, RULE_select_stmt);
		try {
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098);
				match(T_SELECT);
				setState(1099);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1100);
				((Select_stmtContext)_localctx).select_expr_list = select_expr_list();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).select_expr_list.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				match(T_SELECT);
				setState(1104);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1105);
				((Select_stmtContext)_localctx).tab_generate_func = tab_generate_func();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).tab_generate_func.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1108);
				match(T_SELECT);
				setState(1109);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1110);
				((Select_stmtContext)_localctx).select_expr_list = select_expr_list();
				setState(1111);
				match(T_FROM);
				setState(1112);
				((Select_stmtContext)_localctx).table_reference = table_reference();
				setState(1113);
				((Select_stmtContext)_localctx).opt_lateral_view_expr = opt_lateral_view_expr();
				setState(1114);
				((Select_stmtContext)_localctx).opt_where_expr = opt_where_expr();
				setState(1115);
				((Select_stmtContext)_localctx).opt_group_by_list = opt_group_by_list();
				setState(1116);
				((Select_stmtContext)_localctx).opt_having_expr = opt_having_expr();
				setState(1117);
				((Select_stmtContext)_localctx).opt_order_by_list = opt_order_by_list();
				setState(1118);
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
		enterRule(_localctx, 124, RULE_opt_lateral_view_expr);
		int _la;
		try {
			setState(1140);
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
				setState(1125);
				match(T_LATERAL);
				setState(1126);
				match(T_VIEW);
				setState(1127);
				((Opt_lateral_view_exprContext)_localctx).tab_generate_func = tab_generate_func();
				setState(1128);
				((Opt_lateral_view_exprContext)_localctx).tab_alias = column_identifier();
				setState(1129);
				match(T_AS);
				setState(1130);
				((Opt_lateral_view_exprContext)_localctx).column_identifier = column_identifier();
				((Opt_lateral_view_exprContext)_localctx).column_alias_list.add(((Opt_lateral_view_exprContext)_localctx).column_identifier);
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1131);
					match(T_COMMA);
					setState(1132);
					((Opt_lateral_view_exprContext)_localctx).column_identifier = column_identifier();
					((Opt_lateral_view_exprContext)_localctx).column_alias_list.add(((Opt_lateral_view_exprContext)_localctx).column_identifier);
					}
					}
					setState(1137);
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
		public Name_identifierContext name_identifier;
		public Name_identifierContext name_identifier() {
			return getRuleContext(Name_identifierContext.class,0);
		}
		public Column_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_identifier; }
	}

	public final Column_identifierContext column_identifier() throws RecognitionException {
		Column_identifierContext _localctx = new Column_identifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_column_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			((Column_identifierContext)_localctx).name_identifier = name_identifier();
			 ((Column_identifierContext)_localctx).res =  ((Column_identifierContext)_localctx).name_identifier.res; 
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
		enterRule(_localctx, 128, RULE_opt_where_expr);
		try {
			setState(1150);
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
				setState(1146);
				match(T_WHERE);
				setState(1147);
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
		enterRule(_localctx, 130, RULE_opt_group_by_list);
		int _la;
		try {
			setState(1166);
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
				setState(1154);
				match(T_GROUP);
				setState(1155);
				match(T_BY);
				setState(1156);
				((Opt_group_by_listContext)_localctx).expr = expr(0);
				((Opt_group_by_listContext)_localctx).expr_group_by_list.add(((Opt_group_by_listContext)_localctx).expr);
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1157);
					match(T_COMMA);
					setState(1158);
					((Opt_group_by_listContext)_localctx).expr = expr(0);
					((Opt_group_by_listContext)_localctx).expr_group_by_list.add(((Opt_group_by_listContext)_localctx).expr);
					}
					}
					setState(1163);
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
		enterRule(_localctx, 132, RULE_opt_having_expr);
		try {
			setState(1173);
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
				setState(1169);
				match(T_HAVING);
				setState(1170);
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
		enterRule(_localctx, 134, RULE_opt_order_by_list);
		int _la;
		try {
			setState(1192);
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
				setState(1177);
				match(T_ORDER);
				setState(1178);
				match(T_BY);
				setState(1179);
				((Opt_order_by_listContext)_localctx).ident = ident();
				((Opt_order_by_listContext)_localctx).order_by_ident_list.add(((Opt_order_by_listContext)_localctx).ident);
				setState(1180);
				((Opt_order_by_listContext)_localctx).opt_order_by_mode = opt_order_by_mode();
				((Opt_order_by_listContext)_localctx).order_mode_list.add(((Opt_order_by_listContext)_localctx).opt_order_by_mode);
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1181);
					match(T_COMMA);
					setState(1182);
					((Opt_order_by_listContext)_localctx).ident = ident();
					((Opt_order_by_listContext)_localctx).order_by_ident_list.add(((Opt_order_by_listContext)_localctx).ident);
					setState(1183);
					((Opt_order_by_listContext)_localctx).opt_order_by_mode = opt_order_by_mode();
					((Opt_order_by_listContext)_localctx).order_mode_list.add(((Opt_order_by_listContext)_localctx).opt_order_by_mode);
					}
					}
					setState(1189);
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
		enterRule(_localctx, 136, RULE_opt_order_by_mode);
		try {
			setState(1199);
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
				setState(1195);
				match(T_ASC);
				 ((Opt_order_by_modeContext)_localctx).res =  "ASC"; 
				}
				break;
			case T_DESC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1197);
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
		enterRule(_localctx, 138, RULE_opt_limit);
		try {
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_limitContext)_localctx).res =  json(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202);
				match(T_LIMIT);
				setState(1203);
				((Opt_limitContext)_localctx).rows = match(INT_LITERAL);
				 ((Opt_limitContext)_localctx).res =  hql_select_limit_clause((((Opt_limitContext)_localctx).rows!=null?((Opt_limitContext)_localctx).rows.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1205);
				match(T_LIMIT);
				setState(1206);
				((Opt_limitContext)_localctx).offset = match(INT_LITERAL);
				setState(1207);
				match(T_COMMA);
				setState(1208);
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
		enterRule(_localctx, 140, RULE_table_reference);
		int _la;
		try {
			setState(1234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1212);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				 ((Table_referenceContext)_localctx).res =  ((Table_referenceContext)_localctx).table_factor.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				vector<Table_factorContext*> table_factor_list; 
				setState(1216);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				((Table_referenceContext)_localctx).table_factor_list.add(((Table_referenceContext)_localctx).table_factor);
				setState(1219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1217);
					match(T_COMMA);
					setState(1218);
					((Table_referenceContext)_localctx).table_factor = table_factor();
					((Table_referenceContext)_localctx).table_factor_list.add(((Table_referenceContext)_localctx).table_factor);
					}
					}
					setState(1221); 
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
				setState(1226);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				setState(1228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1227);
					((Table_referenceContext)_localctx).join_table = join_table();
					((Table_referenceContext)_localctx).join_table_list.add(((Table_referenceContext)_localctx).join_table);
					}
					}
					setState(1230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_CROSS || ((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (T_FULL - 169)) | (1L << (T_INNER - 169)) | (1L << (T_JOIN - 169)) | (1L << (T_LEFT - 169)))) != 0) || _la==T_RIGHT );

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
		enterRule(_localctx, 142, RULE_join_table);
		int _la;
		try {
			setState(1271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1236);
					match(T_INNER);
					}
				}

				setState(1239);
				match(T_JOIN);
				setState(1240);
				((Join_tableContext)_localctx).table_factor = table_factor();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("INNER", ((Join_tableContext)_localctx).table_factor.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1243);
					match(T_INNER);
					}
				}

				setState(1246);
				match(T_JOIN);
				setState(1247);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1248);
				((Join_tableContext)_localctx).join_condition = join_condition();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("INNER", ((Join_tableContext)_localctx).table_factor.res, ((Join_tableContext)_localctx).join_condition.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1251);
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
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1252);
					match(T_OUTER);
					}
				}

				setState(1255);
				match(T_JOIN);
				setState(1256);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1257);
				((Join_tableContext)_localctx).join_condition = join_condition();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table((((Join_tableContext)_localctx).j_type!=null?((Join_tableContext)_localctx).j_type.getText():null), ((Join_tableContext)_localctx).table_factor.res, ((Join_tableContext)_localctx).join_condition.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1260);
				match(T_CROSS);
				setState(1261);
				match(T_JOIN);
				setState(1262);
				((Join_tableContext)_localctx).table_factor = table_factor();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("CROSS", ((Join_tableContext)_localctx).table_factor.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1265);
				match(T_CROSS);
				setState(1266);
				match(T_JOIN);
				setState(1267);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1268);
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
		enterRule(_localctx, 144, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(T_ON);
			setState(1274);
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
		public Name_identifierContext name_identifier;
		public Select_union_stmtContext select_union_stmt;
		public Select_stmtContext select_stmt;
		public Tab_identContext tab_ident() {
			return getRuleContext(Tab_identContext.class,0);
		}
		public Name_identifierContext name_identifier() {
			return getRuleContext(Name_identifierContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public Select_union_stmtContext select_union_stmt() {
			return getRuleContext(Select_union_stmtContext.class,0);
		}
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
		enterRule(_localctx, 146, RULE_table_factor);
		try {
			setState(1305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				((Table_factorContext)_localctx).tab_ident = tab_ident();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).tab_ident.res, "DEFAULT"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1280);
				((Table_factorContext)_localctx).tab_ident = tab_ident();
				setState(1282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(1281);
					match(T_AS);
					}
					break;
				}
				setState(1284);
				((Table_factorContext)_localctx).name_identifier = name_identifier();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).tab_ident.res, ((Table_factorContext)_localctx).name_identifier.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1287);
				match(T_OPEN_P);
				setState(1288);
				((Table_factorContext)_localctx).select_union_stmt = select_union_stmt();
				setState(1289);
				match(T_CLOSE_P);
				setState(1291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(1290);
					match(T_AS);
					}
					break;
				}
				setState(1293);
				((Table_factorContext)_localctx).name_identifier = name_identifier();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).select_union_stmt.res, ((Table_factorContext)_localctx).name_identifier.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1296);
				match(T_OPEN_P);
				setState(1297);
				((Table_factorContext)_localctx).select_stmt = select_stmt();
				setState(1298);
				match(T_CLOSE_P);
				setState(1300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(1299);
					match(T_AS);
					}
					break;
				}
				setState(1302);
				((Table_factorContext)_localctx).name_identifier = name_identifier();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).select_stmt.res, ((Table_factorContext)_localctx).name_identifier.res); 
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
		enterRule(_localctx, 148, RULE_select_all_distinct);
		try {
			setState(1312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Select_all_distinctContext)_localctx).res =  "ALL"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				match(T_ALL);
				 ((Select_all_distinctContext)_localctx).res =  "ALL"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1310);
				match(T_DISTINCT);
				 ((Select_all_distinctContext)_localctx).res =  "DISTINCT"; 
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
		enterRule(_localctx, 150, RULE_select_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<Select_exprContext*> exprs; 
			setState(1315);
			((Select_expr_listContext)_localctx).select_expr = select_expr();
			((Select_expr_listContext)_localctx).exprs.add(((Select_expr_listContext)_localctx).select_expr);
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1316);
				match(T_COMMA);
				setState(1317);
				((Select_expr_listContext)_localctx).select_expr = select_expr();
				((Select_expr_listContext)_localctx).exprs.add(((Select_expr_listContext)_localctx).select_expr);
				}
				}
				setState(1322);
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
		public Name_identifierContext name_identifier;
		public Over_clauseContext over_clause;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Name_identifierContext name_identifier() {
			return getRuleContext(Name_identifierContext.class,0);
		}
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
		enterRule(_localctx, 152, RULE_select_expr);
		try {
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325);
				((Select_exprContext)_localctx).expr = expr(0);
				setState(1327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1326);
					match(T_AS);
					}
					break;
				}
				setState(1329);
				((Select_exprContext)_localctx).name_identifier = name_identifier();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res, ((Select_exprContext)_localctx).name_identifier.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1332);
				((Select_exprContext)_localctx).expr = expr(0);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1335);
				((Select_exprContext)_localctx).expr = expr(0);
				setState(1337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(1336);
					match(T_AS);
					}
					break;
				}
				setState(1339);
				((Select_exprContext)_localctx).name_identifier = name_identifier();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res, ((Select_exprContext)_localctx).name_identifier.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1342);
				((Select_exprContext)_localctx).expr = expr(0);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1345);
				match(T_MUL);
				 ((Select_exprContext)_localctx).res =  hql_select_all_expr(); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1347);
				((Select_exprContext)_localctx).name_identifier = name_identifier();
				setState(1348);
				match(T__1);
				setState(1349);
				match(T_MUL);
				 ((Select_exprContext)_localctx).res =  hql_select_all_expr(((Select_exprContext)_localctx).name_identifier.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1352);
				((Select_exprContext)_localctx).over_clause = over_clause();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).over_clause.res, "DEFAULT"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1355);
				((Select_exprContext)_localctx).over_clause = over_clause();
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1356);
					match(T_AS);
					}
					break;
				}
				setState(1359);
				((Select_exprContext)_localctx).name_identifier = name_identifier();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).over_clause.res, ((Select_exprContext)_localctx).name_identifier.res); 
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
		enterRule(_localctx, 154, RULE_over_clause);
		int _la;
		try {
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 vector<IdentContext*> ident_cntxt_list; 
				setState(1365);
				((Over_clauseContext)_localctx).over_func = over_func();
				setState(1366);
				match(T_OVER);
				setState(1367);
				match(T_OPEN_P);
				setState(1368);
				match(T_PARTITION);
				setState(1369);
				match(T_BY);
				setState(1370);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1371);
					match(T_COMMA);
					setState(1372);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(1377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1378);
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
				setState(1382);
				((Over_clauseContext)_localctx).over_func = over_func();
				setState(1383);
				match(T_OVER);
				setState(1384);
				match(T_OPEN_P);
				setState(1385);
				match(T_ORDER);
				setState(1386);
				match(T_BY);
				setState(1387);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1388);
					match(T_COMMA);
					setState(1389);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).ident_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(1394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1395);
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
				setState(1399);
				((Over_clauseContext)_localctx).over_func = over_func();
				setState(1400);
				match(T_OVER);
				setState(1401);
				match(T_OPEN_P);
				setState(1402);
				match(T_PARTITION);
				setState(1403);
				match(T_BY);
				setState(1404);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).partition_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1405);
					match(T_COMMA);
					setState(1406);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).partition_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(1411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1412);
				match(T_ORDER);
				setState(1413);
				match(T_BY);
				setState(1414);
				((Over_clauseContext)_localctx).ident = ident();
				((Over_clauseContext)_localctx).order_cntxt_list.add(((Over_clauseContext)_localctx).ident);
				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1415);
					match(T_COMMA);
					setState(1416);
					((Over_clauseContext)_localctx).ident = ident();
					((Over_clauseContext)_localctx).order_cntxt_list.add(((Over_clauseContext)_localctx).ident);
					}
					}
					setState(1421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1422);
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
		enterRule(_localctx, 156, RULE_over_func);
		try {
			setState(1433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
			case T_COUNT:
			case T_MAX:
			case T_MIN:
			case T_SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1427);
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
				setState(1430);
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
		enterRule(_localctx, 158, RULE_analytic_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
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
			setState(1436);
			match(T_OPEN_P);
			setState(1437);
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
		enterRule(_localctx, 160, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> exprs; 
			setState(1441);
			match(T_OPEN_P);
			setState(1442);
			((Expr_listContext)_localctx).expr = expr(0);
			((Expr_listContext)_localctx).exprs.add(((Expr_listContext)_localctx).expr);
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1443);
				match(T_COMMA);
				setState(1444);
				((Expr_listContext)_localctx).expr = expr(0);
				((Expr_listContext)_localctx).exprs.add(((Expr_listContext)_localctx).expr);
				}
				}
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1450);
			match(T_CLOSE_P);

			        vector<json> expr_list_json;
			        for (ExprContext* exp_contxt : ((Expr_listContext)_localctx).exprs)
			        { 
			            expr_list_json.push_back(exp_contxt->res); 
			        }
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
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1454);
				((ExprContext)_localctx).literal_values = literal_values();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).literal_values.res; 
				}
				break;
			case 2:
				{
				setState(1457);
				((ExprContext)_localctx).ident = ident();
				 ((ExprContext)_localctx).res =   ((ExprContext)_localctx).ident.res; 
				}
				break;
			case 3:
				{
				setState(1460);
				((ExprContext)_localctx).unary_operator = unary_operator();
				setState(1461);
				((ExprContext)_localctx).expr = expr(12);
				 ((ExprContext)_localctx).res =  hql_unary_operator((((ExprContext)_localctx).unary_operator!=null?_input.getText(((ExprContext)_localctx).unary_operator.start,((ExprContext)_localctx).unary_operator.stop):null), ((ExprContext)_localctx).expr.res); 
				}
				break;
			case 4:
				{
				setState(1464);
				match(T_OPEN_P);
				setState(1465);
				((ExprContext)_localctx).expr = expr(0);
				setState(1466);
				match(T_CLOSE_P);
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr.res; 
				}
				break;
			case 5:
				{
				setState(1469);
				((ExprContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case 6:
				{
				setState(1472);
				((ExprContext)_localctx).math_func = math_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).math_func.res; 
				}
				break;
			case 7:
				{
				setState(1475);
				((ExprContext)_localctx).date_func = date_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).date_func.res; 
				}
				break;
			case 8:
				{
				setState(1478);
				((ExprContext)_localctx).cond_func = cond_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).cond_func.res; 
				}
				break;
			case 9:
				{
				setState(1481);
				((ExprContext)_localctx).str_func = str_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).str_func.res; 
				}
				break;
			case 10:
				{
				setState(1484);
				((ExprContext)_localctx).expr_concat = expr_concat();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr_concat.res; 
				}
				break;
			case 11:
				{
				setState(1487);
				((ExprContext)_localctx).misc_func = misc_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).misc_func.res; 
				}
				break;
			case 12:
				{
				setState(1490);
				((ExprContext)_localctx).aggr_func = aggr_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).aggr_func.res; 
				}
				break;
			case 13:
				{
				setState(1493);
				((ExprContext)_localctx).complex_types = complex_types();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).complex_types.res; 
				}
				break;
			case 14:
				{
				setState(1496);
				((ExprContext)_localctx).use_var = use_var();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).use_var.res; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1585);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1501);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1502);
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
						setState(1503);
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
						setState(1506);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1507);
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
						setState(1508);
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
						setState(1511);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1512);
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
						setState(1513);
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
						setState(1516);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1517);
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
						setState(1518);
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
						setState(1521);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1522);
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
						setState(1523);
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
						setState(1526);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1527);
						((ExprContext)_localctx).op = match(T_AND);
						setState(1528);
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
						setState(1531);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1532);
						((ExprContext)_localctx).op = match(T_OR);
						setState(1533);
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
						setState(1536);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1537);
						match(T_BETWEEN);
						setState(1538);
						((ExprContext)_localctx).start_interval = ((ExprContext)_localctx).expr = expr(0);
						setState(1539);
						match(T_AND);
						setState(1540);
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
						setState(1543);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1544);
						match(T_NOT);
						setState(1545);
						match(T_BETWEEN);
						setState(1546);
						((ExprContext)_localctx).start_interval = ((ExprContext)_localctx).expr = expr(0);
						setState(1547);
						match(T_AND);
						setState(1548);
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
						setState(1551);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1552);
						((ExprContext)_localctx).set_operators_like = set_operators_like();
						setState(1553);
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
						setState(1556);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1557);
						((ExprContext)_localctx).set_operators_is = set_operators_is();
						setState(1558);
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
						setState(1561);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1562);
						((ExprContext)_localctx).set_operators_is = set_operators_is();
						setState(1563);
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
						setState(1566);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1567);
						((ExprContext)_localctx).set_operators_in = set_operators_in();
						setState(1568);
						((ExprContext)_localctx).expr_list = expr_list();
						 ((ExprContext)_localctx).res =  hql_set_operators_in(((ExprContext)_localctx).set_operators_in.res, ((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).expr_list.res);  
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1571);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1572);
						((ExprContext)_localctx).set_operators_in = set_operators_in();
						setState(1573);
						match(T_OPEN_P);
						setState(1574);
						((ExprContext)_localctx).select_stmt = select_stmt();
						setState(1575);
						match(T_CLOSE_P);
						 ((ExprContext)_localctx).res =  hql_set_operators_in(((ExprContext)_localctx).set_operators_in.res, ((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).select_stmt.res); 
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1578);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1579);
						((ExprContext)_localctx).set_operators_exists = set_operators_exists();
						setState(1580);
						match(T_OPEN_P);
						setState(1581);
						((ExprContext)_localctx).select_stmt = select_stmt();
						setState(1582);
						match(T_CLOSE_P);
						 ((ExprContext)_localctx).res =  hql_set_operators_in(((ExprContext)_localctx).set_operators_exists.res, ((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).select_stmt.res); 
						}
						break;
					}
					} 
				}
				setState(1589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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
		enterRule(_localctx, 164, RULE_complex_types);
		try {
			setState(1630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1590);
				((Complex_typesContext)_localctx).array_def = array_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).array_def.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593);
				((Complex_typesContext)_localctx).map_def = map_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).map_def.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1596);
				((Complex_typesContext)_localctx).struct_def = struct_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).struct_def.res; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1599);
				((Complex_typesContext)_localctx).named_struct_def = named_struct_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).named_struct_def.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1602);
				((Complex_typesContext)_localctx).ident = ident();
				setState(1603);
				match(T_OPEN_SB);
				setState(1604);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(1605);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).ident.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1608);
				((Complex_typesContext)_localctx).array_def = array_def();
				setState(1609);
				match(T_OPEN_SB);
				setState(1610);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(1611);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).array_def.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1614);
				((Complex_typesContext)_localctx).map_def = map_def();
				setState(1615);
				match(T_OPEN_SB);
				setState(1616);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(1617);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).map_def.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1620);
				((Complex_typesContext)_localctx).ident = ident();
				setState(1621);
				match(T__1);
				setState(1622);
				((Complex_typesContext)_localctx).expr = expr(0);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).ident.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1625);
				((Complex_typesContext)_localctx).struct_def = struct_def();
				setState(1626);
				match(T__1);
				setState(1627);
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
		enterRule(_localctx, 166, RULE_array_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> exprs; 
			setState(1633);
			match(T_ARRAY);
			setState(1634);
			match(T_OPEN_P);
			setState(1635);
			((Array_defContext)_localctx).expr = expr(0);
			((Array_defContext)_localctx).exprs.add(((Array_defContext)_localctx).expr);
			setState(1640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1636);
				match(T_COMMA);
				setState(1637);
				((Array_defContext)_localctx).expr = expr(0);
				((Array_defContext)_localctx).exprs.add(((Array_defContext)_localctx).expr);
				}
				}
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1643);
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
		enterRule(_localctx, 168, RULE_map_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> key_exprs; vector<ExprContext*> val_exprs; 
			setState(1647);
			match(T_MAP);
			setState(1648);
			match(T_OPEN_P);
			setState(1649);
			((Map_defContext)_localctx).expr = expr(0);
			((Map_defContext)_localctx).key_exprs.add(((Map_defContext)_localctx).expr);
			setState(1650);
			match(T_COMMA);
			setState(1651);
			((Map_defContext)_localctx).expr = expr(0);
			((Map_defContext)_localctx).val_exprs.add(((Map_defContext)_localctx).expr);
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1652);
				match(T_COMMA);
				setState(1653);
				((Map_defContext)_localctx).expr = expr(0);
				((Map_defContext)_localctx).key_exprs.add(((Map_defContext)_localctx).expr);
				setState(1654);
				match(T_COMMA);
				setState(1655);
				((Map_defContext)_localctx).expr = expr(0);
				((Map_defContext)_localctx).val_exprs.add(((Map_defContext)_localctx).expr);
				}
				}
				setState(1661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1662);
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
		enterRule(_localctx, 170, RULE_struct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> val_exprs; 
			setState(1666);
			match(T_STRUCT);
			setState(1667);
			match(T_OPEN_P);
			setState(1668);
			((Struct_defContext)_localctx).expr = expr(0);
			((Struct_defContext)_localctx).val_exprs.add(((Struct_defContext)_localctx).expr);
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1669);
				match(T_COMMA);
				setState(1670);
				((Struct_defContext)_localctx).expr = expr(0);
				((Struct_defContext)_localctx).val_exprs.add(((Struct_defContext)_localctx).expr);
				}
				}
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1676);
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
		enterRule(_localctx, 172, RULE_named_struct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> col_exprs; vector<ExprContext*> val_exprs; 
			setState(1680);
			match(T_NAMED_STRUCT);
			setState(1681);
			match(T_OPEN_P);
			setState(1682);
			((Named_struct_defContext)_localctx).expr = expr(0);
			((Named_struct_defContext)_localctx).col_exprs.add(((Named_struct_defContext)_localctx).expr);
			setState(1683);
			match(T_COMMA);
			setState(1684);
			((Named_struct_defContext)_localctx).expr = expr(0);
			((Named_struct_defContext)_localctx).val_exprs.add(((Named_struct_defContext)_localctx).expr);
			setState(1692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1685);
				match(T_COMMA);
				setState(1686);
				((Named_struct_defContext)_localctx).expr = expr(0);
				((Named_struct_defContext)_localctx).col_exprs.add(((Named_struct_defContext)_localctx).expr);
				setState(1687);
				match(T_COMMA);
				setState(1688);
				((Named_struct_defContext)_localctx).expr = expr(0);
				((Named_struct_defContext)_localctx).val_exprs.add(((Named_struct_defContext)_localctx).expr);
				}
				}
				setState(1694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1695);
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
		enterRule(_localctx, 174, RULE_str_func);
		int _la;
		try {
			setState(2211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1698);
				match(T_ASCII);
				setState(1699);
				match(T_OPEN_P);
				setState(1700);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1701);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("ASCII", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1704);
				match(T_BASE64);
				setState(1705);
				match(T_OPEN_P);
				setState(1706);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1707);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("BASE64", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1710);
				match(T_CHARACTER_LENGTH);
				setState(1711);
				match(T_OPEN_P);
				setState(1712);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1713);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHARACTER_LENGTH", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1716);
				match(T_CHR);
				setState(1717);
				match(T_OPEN_P);
				setState(1718);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1719);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHR", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(1723);
				match(T_CONCAT);
				setState(1724);
				match(T_OPEN_P);
				setState(1725);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1728); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1726);
					match(T_COMMA);
					setState(1727);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1730); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(1732);
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
				setState(1736);
				match(T_CONCAT_WS);
				setState(1737);
				match(T_OPEN_P);
				setState(1738);
				((Str_funcContext)_localctx).sep = expr(0);
				setState(1739);
				match(T_COMMA);
				setState(1740);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1743); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1741);
					match(T_COMMA);
					setState(1742);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1745); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(1747);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("CONCAT","separator", ((Str_funcContext)_localctx).sep.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1750);
				match(T_DECODE);
				setState(1751);
				match(T_OPEN_P);
				setState(1752);
				((Str_funcContext)_localctx).expr_bin = expr(0);
				setState(1753);
				match(T_COMMA);
				setState(1754);
				((Str_funcContext)_localctx).expr_charset = expr(0);
				setState(1755);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("DECODE", "binary_value", ((Str_funcContext)_localctx).expr_bin.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				 vector<ExprContext*> exprs; 
				setState(1759);
				match(T_ELT);
				setState(1760);
				match(T_OPEN_P);
				setState(1761);
				((Str_funcContext)_localctx).index_num = expr(0);
				setState(1762);
				match(T_COMMA);
				setState(1763);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1764);
					match(T_COMMA);
					setState(1765);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1771);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("ELT","index_num", ((Str_funcContext)_localctx).index_num.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1774);
				match(T_ENCODE);
				setState(1775);
				match(T_OPEN_P);
				setState(1776);
				((Str_funcContext)_localctx).expr_str = expr(0);
				setState(1777);
				match(T_COMMA);
				setState(1778);
				((Str_funcContext)_localctx).expr_charset = expr(0);
				setState(1779);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("ENCODE", "str_value", ((Str_funcContext)_localctx).expr_str.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				 vector<ExprContext*> exprs; 
				setState(1783);
				match(T_FIELD);
				setState(1784);
				match(T_OPEN_P);
				setState(1785);
				((Str_funcContext)_localctx).expr_val = expr(0);
				setState(1786);
				match(T_COMMA);
				setState(1787);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1788);
					match(T_COMMA);
					setState(1789);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1794);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1795);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("FIELD","expr_val", ((Str_funcContext)_localctx).expr_val.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1798);
				match(T_FIELD_IN_SET);
				setState(1799);
				match(T_OPEN_P);
				setState(1800);
				((Str_funcContext)_localctx).expr_str = expr(0);
				setState(1801);
				match(T_COMMA);
				setState(1802);
				((Str_funcContext)_localctx).expr_str_list = expr(0);
				setState(1803);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FIELD_IN_SET", "str_value", ((Str_funcContext)_localctx).expr_str.res, "str_list", ((Str_funcContext)_localctx).expr_str_list.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1806);
				match(T_FORMAT_NUMBER);
				setState(1807);
				match(T_OPEN_P);
				setState(1808);
				((Str_funcContext)_localctx).number_expr = expr(0);
				setState(1809);
				match(T_COMMA);
				setState(1810);
				((Str_funcContext)_localctx).int_expr = expr(0);
				setState(1811);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FORMAT_NUMBER", "number", ((Str_funcContext)_localctx).number_expr.res, "decimal_places", ((Str_funcContext)_localctx).int_expr.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1814);
				match(T_GET_JSON_OBJECTS);
				setState(1815);
				match(T_OPEN_P);
				setState(1816);
				((Str_funcContext)_localctx).json_string = expr(0);
				setState(1817);
				match(T_COMMA);
				setState(1818);
				((Str_funcContext)_localctx).path_expr = expr(0);
				setState(1819);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("GET_JSON_OBJECTS", "json_string", ((Str_funcContext)_localctx).json_string.res, "path", ((Str_funcContext)_localctx).path_expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1822);
				match(T_IN_FILE);
				setState(1823);
				match(T_OPEN_P);
				setState(1824);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1825);
				match(T_COMMA);
				setState(1826);
				((Str_funcContext)_localctx).filename = expr(0);
				setState(1827);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_FILE", "string", ((Str_funcContext)_localctx).str_expr.res, "filename", ((Str_funcContext)_localctx).filename.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1830);
				match(T_IN_STR);
				setState(1831);
				match(T_OPEN_P);
				setState(1832);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1833);
				match(T_COMMA);
				setState(1834);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(1835);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_STR", "string", ((Str_funcContext)_localctx).str_expr.res, "substring", ((Str_funcContext)_localctx).substr_expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1838);
				match(T_LENGTH);
				setState(1839);
				match(T_OPEN_P);
				setState(1840);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1841);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1844);
				match(T_LOCATE);
				setState(1845);
				match(T_OPEN_P);
				setState(1846);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(1847);
				match(T_COMMA);
				setState(1848);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1849);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1852);
				match(T_LOCATE);
				setState(1853);
				match(T_OPEN_P);
				setState(1854);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(1855);
				match(T_COMMA);
				setState(1856);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1857);
				match(T_COMMA);
				setState(1858);
				((Str_funcContext)_localctx).pos = expr(0);
				setState(1859);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res,"position", ((Str_funcContext)_localctx).pos.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1862);
				_la = _input.LA(1);
				if ( !(_la==T_LCASE || _la==T_LOWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1863);
				match(T_OPEN_P);
				setState(1864);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1865);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LOWER_CASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1868);
				match(T_LPAD);
				setState(1869);
				match(T_OPEN_P);
				setState(1870);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1871);
				match(T_COMMA);
				setState(1872);
				((Str_funcContext)_localctx).len = expr(0);
				setState(1873);
				match(T_COMMA);
				setState(1874);
				((Str_funcContext)_localctx).pad = expr(0);
				setState(1875);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1878);
				match(T_LTRIM);
				setState(1879);
				match(T_OPEN_P);
				setState(1880);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1881);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1884);
				match(T_OCTET_LENGTH);
				setState(1885);
				match(T_OPEN_P);
				setState(1886);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1887);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("OCTET_LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1890);
				match(T_PARSE_URL);
				setState(1891);
				match(T_OPEN_P);
				setState(1892);
				((Str_funcContext)_localctx).url_str = expr(0);
				setState(1893);
				match(T_COMMA);
				setState(1894);
				((Str_funcContext)_localctx).part_to_extract = expr(0);
				setState(1895);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1898);
				match(T_PARSE_URL);
				setState(1899);
				match(T_OPEN_P);
				setState(1900);
				((Str_funcContext)_localctx).url_str = expr(0);
				setState(1901);
				match(T_COMMA);
				setState(1902);
				((Str_funcContext)_localctx).part_to_extract = expr(0);
				setState(1903);
				match(T_COMMA);
				setState(1904);
				((Str_funcContext)_localctx).key_to_extract = expr(0);
				setState(1905);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res, "key_to_extract", ((Str_funcContext)_localctx).key_to_extract.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				 vector<ExprContext*> exprs; 
				setState(1909);
				match(T_PRINTF);
				setState(1910);
				match(T_OPEN_P);
				setState(1911);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1912);
				match(T_COMMA);
				setState(1913);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1916); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1914);
					match(T_COMMA);
					setState(1915);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1918); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(1920);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("PRINTF","string", ((Str_funcContext)_localctx).str_expr.res, "object_list",expr_list_json);
				    
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1923);
				match(T_QUOTE);
				setState(1924);
				match(T_OPEN_P);
				setState(1925);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1926);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("QUOTE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1929);
				match(T_REGEXP_EXTRACT);
				setState(1930);
				match(T_OPEN_P);
				setState(1931);
				((Str_funcContext)_localctx).subject = expr(0);
				setState(1932);
				match(T_COMMA);
				setState(1933);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(1934);
				match(T_COMMA);
				setState(1935);
				((Str_funcContext)_localctx).index = expr(0);
				setState(1936);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_EXTRACT", "subject", ((Str_funcContext)_localctx).subject.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"index", ((Str_funcContext)_localctx).index.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1939);
				match(T_REGEXP_REPLACE);
				setState(1940);
				match(T_OPEN_P);
				setState(1941);
				((Str_funcContext)_localctx).initial_string = expr(0);
				setState(1942);
				match(T_COMMA);
				setState(1943);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(1944);
				match(T_COMMA);
				setState(1945);
				((Str_funcContext)_localctx).replacement = expr(0);
				setState(1946);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_REPLACE", "initial_string", ((Str_funcContext)_localctx).initial_string.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"replacement", ((Str_funcContext)_localctx).replacement.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1949);
				match(T_REPEAT);
				setState(1950);
				match(T_OPEN_P);
				setState(1951);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1952);
				match(T_COMMA);
				setState(1953);
				((Str_funcContext)_localctx).n_times_expr = expr(0);
				setState(1954);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("REPEAT", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_times_expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1957);
				match(T_REPLACE);
				setState(1958);
				match(T_OPEN_P);
				setState(1959);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1960);
				match(T_COMMA);
				setState(1961);
				((Str_funcContext)_localctx).old = expr(0);
				setState(1962);
				match(T_COMMA);
				setState(1963);
				((Str_funcContext)_localctx).new_expr = expr(0);
				setState(1964);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REPLACE", "string", ((Str_funcContext)_localctx).str_expr.res, "old", ((Str_funcContext)_localctx).old.res,"new", ((Str_funcContext)_localctx).new_expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1967);
				match(T_REVERSE);
				setState(1968);
				match(T_OPEN_P);
				setState(1969);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1970);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("REVERSE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1973);
				match(T_RPAD);
				setState(1974);
				match(T_OPEN_P);
				setState(1975);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1976);
				match(T_COMMA);
				setState(1977);
				((Str_funcContext)_localctx).len = expr(0);
				setState(1978);
				match(T_COMMA);
				setState(1979);
				((Str_funcContext)_localctx).pad = expr(0);
				setState(1980);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("RPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1983);
				match(T_RTRIM);
				setState(1984);
				match(T_OPEN_P);
				setState(1985);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1986);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("RTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1989);
				match(T_SENTENCES);
				setState(1990);
				match(T_OPEN_P);
				setState(1991);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1992);
				match(T_COMMA);
				setState(1993);
				((Str_funcContext)_localctx).lang_expr = expr(0);
				setState(1994);
				match(T_COMMA);
				setState(1995);
				((Str_funcContext)_localctx).locale_expr = expr(0);
				setState(1996);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SENTENCES", "string", ((Str_funcContext)_localctx).str_expr.res, "lang", ((Str_funcContext)_localctx).lang_expr.res, "locale", ((Str_funcContext)_localctx).locale_expr.res); 
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1999);
				match(T_SPACE);
				setState(2000);
				match(T_OPEN_P);
				setState(2001);
				((Str_funcContext)_localctx).size_expr = expr(0);
				setState(2002);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SPACE", "size", ((Str_funcContext)_localctx).size_expr.res); 
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2005);
				match(T_SPLIT);
				setState(2006);
				match(T_OPEN_P);
				setState(2007);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2008);
				match(T_COMMA);
				setState(2009);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(2010);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SPLIT", "string", ((Str_funcContext)_localctx).str_expr.res, "pattern", ((Str_funcContext)_localctx).pattern.res); 
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2013);
				match(T_STR_TO_MAP);
				setState(2014);
				match(T_OPEN_P);
				setState(2015);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2016);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", hql_string_type(";"), "delimiter2", hql_string_type(":")); 
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2019);
				match(T_STR_TO_MAP);
				setState(2020);
				match(T_OPEN_P);
				setState(2021);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2022);
				match(T_COMMA);
				setState(2023);
				((Str_funcContext)_localctx).delimiter1 = expr(0);
				setState(2024);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2", hql_string_type(":")); 
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2027);
				match(T_STR_TO_MAP);
				setState(2028);
				match(T_OPEN_P);
				setState(2029);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2030);
				match(T_COMMA);
				setState(2031);
				((Str_funcContext)_localctx).delimiter1 = expr(0);
				setState(2032);
				match(T_COMMA);
				setState(2033);
				((Str_funcContext)_localctx).delimiter2 = expr(0);
				setState(2034);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2",((Str_funcContext)_localctx).delimiter2.res); 
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2037);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2038);
				match(T_OPEN_P);
				setState(2039);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2040);
				match(T_COMMA);
				setState(2041);
				((Str_funcContext)_localctx).start_indx = expr(0);
				setState(2042);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res); 
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2045);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2046);
				match(T_OPEN_P);
				setState(2047);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2048);
				match(T_COMMA);
				setState(2049);
				((Str_funcContext)_localctx).start_indx = expr(0);
				setState(2050);
				match(T_COMMA);
				setState(2051);
				((Str_funcContext)_localctx).lenght_expr = expr(0);
				setState(2052);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res, "length", ((Str_funcContext)_localctx).lenght_expr.res); 
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2055);
				match(T_SUBSTRING_INDEX);
				setState(2056);
				match(T_OPEN_P);
				setState(2057);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2058);
				match(T_COMMA);
				setState(2059);
				((Str_funcContext)_localctx).delimiter = expr(0);
				setState(2060);
				match(T_COMMA);
				setState(2061);
				((Str_funcContext)_localctx).count = expr(0);
				setState(2062);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING_INDEX", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter", ((Str_funcContext)_localctx).delimiter.res, "count", ((Str_funcContext)_localctx).count.res); 
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2065);
				match(T_TRANSLATE);
				setState(2066);
				match(T_OPEN_P);
				setState(2067);
				((Str_funcContext)_localctx).input_expr = expr(0);
				setState(2068);
				match(T_COMMA);
				setState(2069);
				((Str_funcContext)_localctx).from_expr = expr(0);
				setState(2070);
				match(T_COMMA);
				setState(2071);
				((Str_funcContext)_localctx).to_expr = expr(0);
				setState(2072);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("TRANSLATE", "input", ((Str_funcContext)_localctx).input_expr.res, "from", ((Str_funcContext)_localctx).from_expr.res, "to", ((Str_funcContext)_localctx).to_expr.res); 
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2075);
				match(T_TRIM);
				setState(2076);
				match(T_OPEN_P);
				setState(2077);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2078);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("TRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2081);
				match(T_UNBASE64);
				setState(2082);
				match(T_OPEN_P);
				setState(2083);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2084);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UNBASE64", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(2087);
				_la = _input.LA(1);
				if ( !(_la==T_UCASE || _la==T_UPPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2088);
				match(T_OPEN_P);
				setState(2089);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2090);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UPPERCASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(2093);
				match(T_INITCAP);
				setState(2094);
				match(T_OPEN_P);
				setState(2095);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2096);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("INITCAP", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(2099);
				match(T_LEVENSHTEIN);
				setState(2100);
				match(T_OPEN_P);
				setState(2101);
				((Str_funcContext)_localctx).strA_expr = expr(0);
				setState(2102);
				match(T_COMMA);
				setState(2103);
				((Str_funcContext)_localctx).strB_expr = expr(0);
				setState(2104);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LEVENSHTEIN", "string_A", ((Str_funcContext)_localctx).strA_expr.res, "string_B", ((Str_funcContext)_localctx).strB_expr.res); 
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(2107);
				match(T_SOUNDEX);
				setState(2108);
				match(T_OPEN_P);
				setState(2109);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2110);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SOUNDEX", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(2113);
				match(T_MASK);
				setState(2114);
				match(T_OPEN_P);
				setState(2115);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2116);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(2119);
				match(T_MASK);
				setState(2120);
				match(T_OPEN_P);
				setState(2121);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2122);
				match(T_COMMA);
				setState(2123);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(2124);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res); 
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(2127);
				match(T_MASK);
				setState(2128);
				match(T_OPEN_P);
				setState(2129);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2130);
				match(T_COMMA);
				setState(2131);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(2132);
				match(T_COMMA);
				setState(2133);
				((Str_funcContext)_localctx).str_lower_expr = expr(0);
				setState(2134);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res); 
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(2137);
				match(T_MASK);
				setState(2138);
				match(T_OPEN_P);
				setState(2139);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2140);
				match(T_COMMA);
				setState(2141);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(2142);
				match(T_COMMA);
				setState(2143);
				((Str_funcContext)_localctx).str_lower_expr = expr(0);
				setState(2144);
				match(T_COMMA);
				setState(2145);
				((Str_funcContext)_localctx).str_number_expr = expr(0);
				setState(2146);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_four_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res, "number", ((Str_funcContext)_localctx).str_number_expr.res); 
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(2149);
				match(T_MASK_FIRST_N);
				setState(2150);
				match(T_OPEN_P);
				setState(2151);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2152);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(2155);
				match(T_MASK_FIRST_N);
				setState(2156);
				match(T_OPEN_P);
				setState(2157);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2158);
				match(T_COMMA);
				setState(2159);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2160);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(2163);
				match(T_MASK_LAST_N);
				setState(2164);
				match(T_OPEN_P);
				setState(2165);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2166);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(2169);
				match(T_MASK_LAST_N);
				setState(2170);
				match(T_OPEN_P);
				setState(2171);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2172);
				match(T_COMMA);
				setState(2173);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2174);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(2177);
				match(T_MASK_SHOW_FIRST_N);
				setState(2178);
				match(T_OPEN_P);
				setState(2179);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2180);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(2183);
				match(T_MASK_SHOW_FIRST_N);
				setState(2184);
				match(T_OPEN_P);
				setState(2185);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2186);
				match(T_COMMA);
				setState(2187);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2188);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(2191);
				match(T_MASK_SHOW_LAST_N);
				setState(2192);
				match(T_OPEN_P);
				setState(2193);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2194);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(2197);
				match(T_MASK_SHOW_LAST_N);
				setState(2198);
				match(T_OPEN_P);
				setState(2199);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2200);
				match(T_COMMA);
				setState(2201);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2202);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(2205);
				match(T_MASK_HASH);
				setState(2206);
				match(T_OPEN_P);
				setState(2207);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2208);
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
		enterRule(_localctx, 176, RULE_misc_func);
		int _la;
		try {
			setState(2313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_JAVA_METHOD:
				enterOuterAlt(_localctx, 1);
				{
				 vector<ExprContext*> exprs; 
				setState(2214);
				match(T_JAVA_METHOD);
				setState(2215);
				match(T_OPEN_P);
				setState(2216);
				((Misc_funcContext)_localctx).class_name_expr = expr(0);
				setState(2217);
				match(T_COMMA);
				setState(2218);
				((Misc_funcContext)_localctx).method_name_expr = expr(0);
				setState(2223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2219);
					match(T_COMMA);
					setState(2220);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2226);
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
				setState(2230);
				match(T_REFLECT);
				setState(2231);
				match(T_OPEN_P);
				setState(2232);
				((Misc_funcContext)_localctx).class_name_expr = expr(0);
				setState(2233);
				match(T_COMMA);
				setState(2234);
				((Misc_funcContext)_localctx).method_name_expr = expr(0);
				setState(2239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2235);
					match(T_COMMA);
					setState(2236);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2242);
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
				setState(2246);
				match(T_HASH);
				setState(2247);
				match(T_OPEN_P);
				setState(2248);
				((Misc_funcContext)_localctx).expr = expr(0);
				((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
				setState(2253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2249);
					match(T_COMMA);
					setState(2250);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2256);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Misc_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Misc_funcContext)_localctx).res =  hql_list_param_func("HASH", "expr_list", expr_list_json);
				    
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2259);
				match(T_CURRENT_USER);
				setState(2260);
				match(T_OPEN_P);
				setState(2261);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("CURRENT_USER"); 
				}
				break;
			case T_LOGGED_IN_USER:
				enterOuterAlt(_localctx, 5);
				{
				setState(2263);
				match(T_LOGGED_IN_USER);
				setState(2264);
				match(T_OPEN_P);
				setState(2265);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("LOGGED_IN_USER"); 
				}
				break;
			case T_CURRENT_DATABASE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2267);
				match(T_CURRENT_DATABASE);
				setState(2268);
				match(T_OPEN_P);
				setState(2269);
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
				setState(2271);
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
				setState(2272);
				match(T_OPEN_P);
				setState(2273);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2274);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_single_param_func((((Misc_funcContext)_localctx).f_name!=null?((Misc_funcContext)_localctx).f_name.getText():null), "string", ((Misc_funcContext)_localctx).str_expr.res); 
				}
				break;
			case T_SHA2:
				enterOuterAlt(_localctx, 8);
				{
				setState(2277);
				match(T_SHA2);
				setState(2278);
				match(T_OPEN_P);
				setState(2279);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2280);
				match(T_COMMA);
				setState(2281);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(2282);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "string", ((Misc_funcContext)_localctx).str_expr.res, "hash_size", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_ENCRYPT:
				enterOuterAlt(_localctx, 9);
				{
				setState(2285);
				match(T_AES_ENCRYPT);
				setState(2286);
				match(T_OPEN_P);
				setState(2287);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2288);
				match(T_COMMA);
				setState(2289);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(2290);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_DECRYPT:
				enterOuterAlt(_localctx, 10);
				{
				setState(2293);
				match(T_AES_DECRYPT);
				setState(2294);
				match(T_OPEN_P);
				setState(2295);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2296);
				match(T_COMMA);
				setState(2297);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(2298);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_VERSION:
				enterOuterAlt(_localctx, 11);
				{
				setState(2301);
				match(T_VERSION);
				setState(2302);
				match(T_OPEN_P);
				setState(2303);
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
				setState(2305);
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
				setState(2306);
				match(T_OPEN_P);
				setState(2307);
				((Misc_funcContext)_localctx).xml_str_expr = expr(0);
				setState(2308);
				match(T_COMMA);
				setState(2309);
				((Misc_funcContext)_localctx).xpath_expr_str = expr(0);
				setState(2310);
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
		enterRule(_localctx, 178, RULE_expr_concat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 vector<Expr_concat_itemContext*> exprs; 
			setState(2316);
			((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
			((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
			setState(2319); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2317);
					match(T_PIPE);
					setState(2318);
					((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
					((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2321); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
		enterRule(_localctx, 180, RULE_expr_concat_item);
		try {
			setState(2360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2325);
				((Expr_concat_itemContext)_localctx).literal_values = literal_values();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).literal_values.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2328);
				((Expr_concat_itemContext)_localctx).ident = ident();
				 ((Expr_concat_itemContext)_localctx).res =   ((Expr_concat_itemContext)_localctx).ident.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2331);
				match(T_OPEN_P);
				setState(2332);
				((Expr_concat_itemContext)_localctx).expr = expr(0);
				setState(2333);
				match(T_CLOSE_P);
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr.res; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2336);
				((Expr_concat_itemContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2339);
				((Expr_concat_itemContext)_localctx).math_func = math_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).math_func.res; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2342);
				((Expr_concat_itemContext)_localctx).date_func = date_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).date_func.res; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2345);
				((Expr_concat_itemContext)_localctx).cond_func = cond_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).cond_func.res; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2348);
				((Expr_concat_itemContext)_localctx).str_func = str_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).str_func.res; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2351);
				((Expr_concat_itemContext)_localctx).misc_func = misc_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).misc_func.res; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2354);
				((Expr_concat_itemContext)_localctx).aggr_func = aggr_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).aggr_func.res; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2357);
				((Expr_concat_itemContext)_localctx).use_var = use_var();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).use_var.res; 
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
		enterRule(_localctx, 182, RULE_cond_func);
		int _la;
		try {
			setState(2485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2362);
				match(T_IF);
				setState(2363);
				match(T_OPEN_P);
				setState(2364);
				((Cond_funcContext)_localctx).test_cond = expr(0);
				setState(2365);
				match(T_COMMA);
				setState(2366);
				((Cond_funcContext)_localctx).valueTrue = expr(0);
				setState(2367);
				match(T_COMMA);
				setState(2368);
				((Cond_funcContext)_localctx).valueFalse = expr(0);
				setState(2369);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_three_param_func("IF", "test_cond", ((Cond_funcContext)_localctx).test_cond.res, "value_true", ((Cond_funcContext)_localctx).valueTrue.res, "value_false", ((Cond_funcContext)_localctx).valueFalse.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2372);
				match(T_ISNULL);
				setState(2373);
				match(T_OPEN_P);
				setState(2374);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(2375);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2378);
				match(T_ISNOTNULL);
				setState(2379);
				match(T_OPEN_P);
				setState(2380);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(2381);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNOTNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2384);
				match(T_NVL);
				setState(2385);
				match(T_OPEN_P);
				setState(2386);
				((Cond_funcContext)_localctx).expr_val = expr(0);
				setState(2387);
				match(T_COMMA);
				setState(2388);
				((Cond_funcContext)_localctx).default_val = expr(0);
				setState(2389);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NVL", "expr_val", ((Cond_funcContext)_localctx).expr_val.res, "default_val", ((Cond_funcContext)_localctx).default_val.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(2393);
				match(T_COALESCE);
				setState(2394);
				match(T_OPEN_P);
				{
				setState(2395);
				((Cond_funcContext)_localctx).expr = expr(0);
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				}
				{
				setState(2396);
				match(T_COMMA);
				setState(2397);
				((Cond_funcContext)_localctx).expr = expr(0);
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				}
				setState(2403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2399);
					match(T_COMMA);
					setState(2400);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2406);
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
				setState(2410);
				match(T_CASE);
				setState(2411);
				((Cond_funcContext)_localctx).case_expr = expr(0);
				setState(2417); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2412);
					match(T_WHEN);
					setState(2413);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2414);
					match(T_THEN);
					setState(2415);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2419); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2421);
				match(T_END);
				 
				        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
				        for(int i = 0 ; i < ((Cond_funcContext)_localctx).when_exprs.size() ; i++)
				        {
				            when_expr_list_json.push_back(((Cond_funcContext)_localctx).when_exprs[i]->res);
				            then_expr_list_json.push_back(((Cond_funcContext)_localctx).then_exprs[i]->res);
				        }
				        ((Cond_funcContext)_localctx).res =  hql_case_func(((Cond_funcContext)_localctx).case_expr.res, when_expr_list_json, then_expr_list_json, json());
				     
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				 vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; 
				setState(2425);
				match(T_CASE);
				setState(2426);
				((Cond_funcContext)_localctx).case_expr = expr(0);
				setState(2432); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2427);
					match(T_WHEN);
					setState(2428);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2429);
					match(T_THEN);
					setState(2430);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2434); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2436);
				match(T_ELSE);
				setState(2437);
				((Cond_funcContext)_localctx).els_expr = expr(0);
				setState(2438);
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
				setState(2442);
				match(T_CASE);
				setState(2448); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2443);
					match(T_WHEN);
					setState(2444);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2445);
					match(T_THEN);
					setState(2446);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2450); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2452);
				match(T_END);
				 
				        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
				        for(int i = 0 ; i < ((Cond_funcContext)_localctx).when_exprs.size() ; i++)
				        {
				            when_expr_list_json.push_back(((Cond_funcContext)_localctx).when_exprs[i]->res);
				            then_expr_list_json.push_back(((Cond_funcContext)_localctx).then_exprs[i]->res);
				        }
				        ((Cond_funcContext)_localctx).res =  hql_case_func(json(), when_expr_list_json, then_expr_list_json, json());
				     
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				 vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; 
				setState(2456);
				match(T_CASE);
				setState(2462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2457);
					match(T_WHEN);
					setState(2458);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2459);
					match(T_THEN);
					setState(2460);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2464); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2466);
				match(T_ELSE);
				setState(2467);
				((Cond_funcContext)_localctx).els_expr = expr(0);
				setState(2468);
				match(T_END);
				 
				        vector<json> when_expr_list_json; vector<json> then_expr_list_json;
				        for(int i = 0 ; i < ((Cond_funcContext)_localctx).when_exprs.size() ; i++)
				        {
				            when_expr_list_json.push_back(((Cond_funcContext)_localctx).when_exprs[i]->res);
				            then_expr_list_json.push_back(((Cond_funcContext)_localctx).then_exprs[i]->res);
				        }
				        ((Cond_funcContext)_localctx).res =  hql_case_func(json(), when_expr_list_json, then_expr_list_json, ((Cond_funcContext)_localctx).els_expr.res);
				     
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2471);
				match(T_NULLIF);
				setState(2472);
				match(T_OPEN_P);
				setState(2473);
				((Cond_funcContext)_localctx).a_expr = expr(0);
				setState(2474);
				match(T_COMMA);
				setState(2475);
				((Cond_funcContext)_localctx).b_expr = expr(0);
				setState(2476);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NULLIF", "a_expr", ((Cond_funcContext)_localctx).a_expr.res, "b_expr", ((Cond_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2479);
				match(T_ASSERT_TRUE);
				setState(2480);
				match(T_OPEN_P);
				setState(2481);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(2482);
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
		public ExprContext unix_time;
		public ExprContext str_format;
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
		public TerminalNode T_FROM_UNIXTIME() { return getToken(HiveParser.T_FROM_UNIXTIME, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_UNIX_TIMESTAMP() { return getToken(HiveParser.T_UNIX_TIMESTAMP, 0); }
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
		enterRule(_localctx, 184, RULE_date_func);
		try {
			setState(2677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2487);
				match(T_FROM_UNIXTIME);
				setState(2488);
				match(T_OPEN_P);
				setState(2489);
				((Date_funcContext)_localctx).unix_time = expr(0);
				setState(2490);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("FROM_UNIXTIME", "unixtime", ((Date_funcContext)_localctx).unix_time.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2493);
				match(T_FROM_UNIXTIME);
				setState(2494);
				match(T_OPEN_P);
				setState(2495);
				((Date_funcContext)_localctx).unix_time = expr(0);
				setState(2496);
				match(T_COMMA);
				setState(2497);
				((Date_funcContext)_localctx).str_format = expr(0);
				setState(2498);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("FROM_UNIXTIME", "unixtime", ((Date_funcContext)_localctx).unix_time.res,"format",((Date_funcContext)_localctx).str_format.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2501);
				match(T_UNIX_TIMESTAMP);
				setState(2502);
				match(T_OPEN_P);
				setState(2503);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("UNIX_TIMESTAMP"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2505);
				match(T_UNIX_TIMESTAMP);
				setState(2506);
				match(T_OPEN_P);
				setState(2507);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2508);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2511);
				match(T_UNIX_TIMESTAMP);
				setState(2512);
				match(T_OPEN_P);
				setState(2513);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2514);
				match(T_COMMA);
				setState(2515);
				((Date_funcContext)_localctx).pattern_expr = expr(0);
				setState(2516);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res, "pattern", ((Date_funcContext)_localctx).pattern_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2519);
				match(T_YEAR);
				setState(2520);
				match(T_OPEN_P);
				setState(2521);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2522);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("YEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2525);
				match(T_QUARTER);
				setState(2526);
				match(T_OPEN_P);
				setState(2527);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2528);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("QUARTER", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2531);
				match(T_MONTH);
				setState(2532);
				match(T_OPEN_P);
				setState(2533);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2534);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MONTH", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2537);
				match(T_DAY);
				setState(2538);
				match(T_OPEN_P);
				setState(2539);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2540);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2543);
				match(T_HOUR);
				setState(2544);
				match(T_OPEN_P);
				setState(2545);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2546);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("HOUR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2549);
				match(T_MINUTE);
				setState(2550);
				match(T_OPEN_P);
				setState(2551);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2552);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MINUTE", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2555);
				match(T_SECOND);
				setState(2556);
				match(T_OPEN_P);
				setState(2557);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2558);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("SECOND", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2561);
				match(T_WEEKOFYEAR);
				setState(2562);
				match(T_OPEN_P);
				setState(2563);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2564);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("WEEKOFYEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2567);
				match(T_DATEDIFF);
				setState(2568);
				match(T_OPEN_P);
				setState(2569);
				((Date_funcContext)_localctx).enddate = expr(0);
				setState(2570);
				match(T_COMMA);
				setState(2571);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2572);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "enddate", ((Date_funcContext)_localctx).enddate.res, "startdate", ((Date_funcContext)_localctx).startdate.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2575);
				match(T_DATEADD);
				setState(2576);
				match(T_OPEN_P);
				setState(2577);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2578);
				match(T_COMMA);
				setState(2579);
				((Date_funcContext)_localctx).days = expr(0);
				setState(2580);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2583);
				match(T_DATESUB);
				setState(2584);
				match(T_OPEN_P);
				setState(2585);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2586);
				match(T_COMMA);
				setState(2587);
				((Date_funcContext)_localctx).days = expr(0);
				setState(2588);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2591);
				match(T_TOUTCTIMESTAMP);
				setState(2592);
				match(T_OPEN_P);
				setState(2593);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(2594);
				match(T_COMMA);
				setState(2595);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(2596);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TO_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2599);
				match(T_FROMUTCTIMESTAMP);
				setState(2600);
				match(T_OPEN_P);
				setState(2601);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(2602);
				match(T_COMMA);
				setState(2603);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(2604);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("FROM_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2607);
				match(T_CURRENT_DATE);
				setState(2610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(2608);
					match(T_OPEN_P);
					setState(2609);
					match(T_CLOSE_P);
					}
					break;
				}
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("CURRENT_DATE"); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2613);
				match(T_CURRENT_TIMESTAMP);
				setState(2616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(2614);
					match(T_OPEN_P);
					setState(2615);
					match(T_CLOSE_P);
					}
					break;
				}
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("T_CURRENT_TIMESTAMP"); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2619);
				match(T_ADD_MONTHS);
				setState(2620);
				match(T_OPEN_P);
				setState(2621);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2622);
				match(T_COMMA);
				setState(2623);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(2624);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2627);
				match(T_ADD_MONTHS);
				setState(2628);
				match(T_OPEN_P);
				setState(2629);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2630);
				match(T_COMMA);
				setState(2631);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(2632);
				match(T_COMMA);
				setState(2633);
				((Date_funcContext)_localctx).out_date_format = expr(0);
				setState(2634);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_three_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res, "out_date_format", ((Date_funcContext)_localctx).out_date_format.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2637);
				match(T_LASTDAY);
				setState(2638);
				match(T_OPEN_P);
				setState(2639);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2640);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("LAST_DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2643);
				match(T_NEXT_DAY);
				setState(2644);
				match(T_OPEN_P);
				setState(2645);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2646);
				match(T_COMMA);
				setState(2647);
				((Date_funcContext)_localctx).day_of_week = expr(0);
				setState(2648);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("NEXT_DAY", "startdate", ((Date_funcContext)_localctx).startdate.res, "day_of_week", ((Date_funcContext)_localctx).day_of_week.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2651);
				match(T_TRUNC);
				setState(2652);
				match(T_OPEN_P);
				setState(2653);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2654);
				match(T_COMMA);
				setState(2655);
				((Date_funcContext)_localctx).format = expr(0);
				setState(2656);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TRUNC", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2659);
				match(T_MONTHS_BETWEEN);
				setState(2660);
				match(T_OPEN_P);
				setState(2661);
				((Date_funcContext)_localctx).date1 = expr(0);
				setState(2662);
				match(T_COMMA);
				setState(2663);
				((Date_funcContext)_localctx).date2 = expr(0);
				setState(2664);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("MONTHS_BETWEEN", "date1", ((Date_funcContext)_localctx).date1.res, "date2", ((Date_funcContext)_localctx).date2.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2667);
				match(T_DATE_FORMAT);
				setState(2668);
				match(T_OPEN_P);
				setState(2669);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2670);
				match(T_COMMA);
				setState(2671);
				((Date_funcContext)_localctx).format = expr(0);
				setState(2672);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATE_FORMAT", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2675);
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
		enterRule(_localctx, 186, RULE_dat_convrt_func);
		int _la;
		try {
			setState(2696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2679);
				match(T_CAST);
				setState(2680);
				match(T_OPEN_P);
				setState(2681);
				((Dat_convrt_funcContext)_localctx).expr = expr(0);
				setState(2682);
				match(T_AS);
				setState(2683);
				((Dat_convrt_funcContext)_localctx).primitive_type = primitive_type();
				setState(2685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2684);
					dtype_len();
					}
				}

				setState(2687);
				match(T_CLOSE_P);
				 ((Dat_convrt_funcContext)_localctx).res =  hql_cast_func(((Dat_convrt_funcContext)_localctx).expr.res, ((Dat_convrt_funcContext)_localctx).primitive_type.res); 
				}
				break;
			case T_BINARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2690);
				match(T_BINARY);
				setState(2691);
				match(T_OPEN_P);
				setState(2692);
				((Dat_convrt_funcContext)_localctx).expr = expr(0);
				setState(2693);
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
		enterRule(_localctx, 188, RULE_basic_aggr_func);
		int _la;
		try {
			setState(2756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2698);
				match(T_COUNT);
				setState(2699);
				match(T_OPEN_P);
				setState(2700);
				((Basic_aggr_funcContext)_localctx).r = expr(0);
				setState(2701);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_count_func(((Basic_aggr_funcContext)_localctx).r.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 vector<ExprContext*> exprs; 
				setState(2705);
				match(T_COUNT);
				setState(2706);
				match(T_OPEN_P);
				setState(2707);
				match(T_DISTINCT);
				setState(2708);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				((Basic_aggr_funcContext)_localctx).exprs.add(((Basic_aggr_funcContext)_localctx).expr);
				setState(2713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2709);
					match(T_COMMA);
					setState(2710);
					((Basic_aggr_funcContext)_localctx).expr = expr(0);
					((Basic_aggr_funcContext)_localctx).exprs.add(((Basic_aggr_funcContext)_localctx).expr);
					}
					}
					setState(2715);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2716);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Basic_aggr_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Basic_aggr_funcContext)_localctx).res =  hql_single_param_list_func("COUNT", "flag_distinct", true, "expr_list", expr_list_json);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2719);
				match(T_COUNT);
				setState(2720);
				match(T_OPEN_P);
				setState(2721);
				match(T_MUL);
				setState(2722);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_count_all_func(); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2724);
				match(T_SUM);
				setState(2725);
				match(T_OPEN_P);
				setState(2726);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2727);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", false, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2730);
				match(T_SUM);
				setState(2731);
				match(T_OPEN_P);
				setState(2732);
				match(T_DISTINCT);
				setState(2733);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2734);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", true, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2737);
				match(T_AVG);
				setState(2738);
				match(T_OPEN_P);
				setState(2739);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2740);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", false, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2743);
				match(T_AVG);
				setState(2744);
				match(T_OPEN_P);
				setState(2745);
				match(T_DISTINCT);
				setState(2746);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2747);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", true, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2750);
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
				setState(2751);
				match(T_OPEN_P);
				setState(2752);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2753);
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
		enterRule(_localctx, 190, RULE_aggr_func);
		int _la;
		try {
			setState(2829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2758);
				((Aggr_funcContext)_localctx).basic_aggr_func = basic_aggr_func();
				 ((Aggr_funcContext)_localctx).res =  ((Aggr_funcContext)_localctx).basic_aggr_func.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2761);
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
				setState(2762);
				match(T_OPEN_P);
				setState(2763);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(2764);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2767);
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
				setState(2768);
				match(T_OPEN_P);
				setState(2769);
				((Aggr_funcContext)_localctx).col1 = expr(0);
				setState(2770);
				match(T_COMMA);
				setState(2771);
				((Aggr_funcContext)_localctx).col2 = expr(0);
				setState(2772);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col1", ((Aggr_funcContext)_localctx).col1.res, "col2", ((Aggr_funcContext)_localctx).col2.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2775);
				match(T_PERCENTILE);
				setState(2776);
				match(T_OPEN_P);
				setState(2777);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2778);
				match(T_COMMA);
				setState(2779);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(2780);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2783);
				match(T_PERCENTILE_APPROX);
				setState(2784);
				match(T_OPEN_P);
				setState(2785);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2786);
				match(T_COMMA);
				setState(2787);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(2788);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2791);
				match(T_PERCENTILE_APPROX);
				setState(2792);
				match(T_OPEN_P);
				setState(2793);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2794);
				match(T_COMMA);
				setState(2795);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(2796);
				match(T_COMMA);
				setState(2797);
				((Aggr_funcContext)_localctx).b_expr = expr(0);
				setState(2798);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_three_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2801);
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
				setState(2802);
				match(T_OPEN_P);
				setState(2803);
				((Aggr_funcContext)_localctx).indep = expr(0);
				setState(2804);
				match(T_COMMA);
				setState(2805);
				((Aggr_funcContext)_localctx).dep = expr(0);
				setState(2806);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "independent", ((Aggr_funcContext)_localctx).indep.res, "dependent", ((Aggr_funcContext)_localctx).dep.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2809);
				match(T_HISTOGRAM_NUMERIC);
				setState(2810);
				match(T_OPEN_P);
				setState(2811);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2812);
				match(T_COMMA);
				setState(2813);
				((Aggr_funcContext)_localctx).b_expr = expr(0);
				setState(2814);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("HISTOGRAM_NUMERIC", "col", ((Aggr_funcContext)_localctx).col.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2817);
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
				setState(2818);
				match(T_OPEN_P);
				setState(2819);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(2820);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2823);
				match(T_NTILE);
				setState(2824);
				match(T_OPEN_P);
				setState(2825);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(2826);
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
		enterRule(_localctx, 192, RULE_tab_generate_func);
		try {
			setState(2849);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EXPLODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2831);
				match(T_EXPLODE);
				setState(2832);
				match(T_OPEN_P);
				setState(2833);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(2834);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("EXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_POSEXPLODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2837);
				match(T_POSEXPLODE);
				setState(2838);
				match(T_OPEN_P);
				setState(2839);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(2840);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("POSEXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_INLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2843);
				match(T_INLINE);
				setState(2844);
				match(T_OPEN_P);
				setState(2845);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(2846);
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
		enterRule(_localctx, 194, RULE_math_func);
		int _la;
		try {
			setState(3061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2851);
				match(T_ROUND);
				setState(2852);
				match(T_OPEN_P);
				setState(2853);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2854);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ROUND", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2857);
				match(T_ROUND);
				setState(2858);
				match(T_OPEN_P);
				setState(2859);
				((Math_funcContext)_localctx).fst = expr(0);
				setState(2860);
				match(T_COMMA);
				setState(2861);
				((Math_funcContext)_localctx).snd = expr(0);
				setState(2862);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("ROUND", "expr", ((Math_funcContext)_localctx).fst.res, "decimal_places", ((Math_funcContext)_localctx).snd.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2865);
				match(T_FLOOR);
				setState(2866);
				match(T_OPEN_P);
				setState(2867);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2868);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FLOOR", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2871);
				_la = _input.LA(1);
				if ( !(_la==T_CEIL || _la==T_CEILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2872);
				match(T_OPEN_P);
				setState(2873);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2874);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("CEIL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2877);
				((Math_funcContext)_localctx).T_RAND = match(T_RAND);
				setState(2878);
				match(T_OPEN_P);
				setState(2879);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func((((Math_funcContext)_localctx).T_RAND!=null?((Math_funcContext)_localctx).T_RAND.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2881);
				match(T_RAND);
				setState(2882);
				match(T_OPEN_P);
				setState(2883);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2884);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RAND", "seed", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2887);
				match(T_EXP);
				setState(2888);
				match(T_OPEN_P);
				setState(2889);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2890);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("EXP", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2893);
				match(T_LN);
				setState(2894);
				match(T_OPEN_P);
				setState(2895);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2896);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2899);
				match(T_LOG10);
				setState(2900);
				match(T_OPEN_P);
				setState(2901);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2902);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG10", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2905);
				match(T_LOG2);
				setState(2906);
				match(T_OPEN_P);
				setState(2907);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2908);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG2", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2911);
				match(T_LOG);
				setState(2912);
				match(T_OPEN_P);
				setState(2913);
				((Math_funcContext)_localctx).base = expr(0);
				setState(2914);
				match(T_COMMA);
				setState(2915);
				((Math_funcContext)_localctx).e = expr(0);
				setState(2916);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("LOG", "base", ((Math_funcContext)_localctx).base.res, "expr", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2919);
				_la = _input.LA(1);
				if ( !(_la==T_POW || _la==T_POWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2920);
				match(T_OPEN_P);
				setState(2921);
				((Math_funcContext)_localctx).base = expr(0);
				setState(2922);
				match(T_COMMA);
				setState(2923);
				((Math_funcContext)_localctx).e = expr(0);
				setState(2924);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("POWER", "base", ((Math_funcContext)_localctx).base.res, "exp", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2927);
				match(T_SQRT);
				setState(2928);
				match(T_OPEN_P);
				setState(2929);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2930);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SQRT", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2933);
				match(T_BIN);
				setState(2934);
				match(T_OPEN_P);
				setState(2935);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2936);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("BIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2939);
				match(T_HEX);
				setState(2940);
				match(T_OPEN_P);
				setState(2941);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2942);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("HEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2945);
				match(T_UNHEX);
				setState(2946);
				match(T_OPEN_P);
				setState(2947);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2948);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("UNHEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2951);
				match(T_CONV);
				setState(2952);
				match(T_OPEN_P);
				setState(2953);
				((Math_funcContext)_localctx).e = expr(0);
				setState(2954);
				match(T_COMMA);
				setState(2955);
				((Math_funcContext)_localctx).fbase = expr(0);
				setState(2956);
				match(T_COMMA);
				setState(2957);
				((Math_funcContext)_localctx).tbase = expr(0);
				setState(2958);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_three_param_func("CONV", "expr", ((Math_funcContext)_localctx).e.res, "from_base", ((Math_funcContext)_localctx).fbase.res, "to_base", ((Math_funcContext)_localctx).tbase.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2961);
				match(T_ABS);
				setState(2962);
				match(T_OPEN_P);
				setState(2963);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2964);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ABS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2967);
				match(T_PMOD);
				setState(2968);
				match(T_OPEN_P);
				setState(2969);
				((Math_funcContext)_localctx).a = expr(0);
				setState(2970);
				match(T_COMMA);
				setState(2971);
				((Math_funcContext)_localctx).b = expr(0);
				setState(2972);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("PMOD", "a", ((Math_funcContext)_localctx).a.res, "b", ((Math_funcContext)_localctx).b.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2975);
				match(T_SIN);
				setState(2976);
				match(T_OPEN_P);
				setState(2977);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2978);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2981);
				match(T_ASIN);
				setState(2982);
				match(T_OPEN_P);
				setState(2983);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2984);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ASIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2987);
				match(T_COS);
				setState(2988);
				match(T_OPEN_P);
				setState(2989);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2990);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("COS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2993);
				match(T_ACOS);
				setState(2994);
				match(T_OPEN_P);
				setState(2995);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2996);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ACOS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2999);
				match(T_TAN);
				setState(3000);
				match(T_OPEN_P);
				setState(3001);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3002);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("TAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(3005);
				match(T_ATAN);
				setState(3006);
				match(T_OPEN_P);
				setState(3007);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3008);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ATAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(3011);
				match(T_DEGREES);
				setState(3012);
				match(T_OPEN_P);
				setState(3013);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3014);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("DEGREES", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(3017);
				match(T_RADIANS);
				setState(3018);
				match(T_OPEN_P);
				setState(3019);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3020);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RADIANS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(3023);
				match(T_POSITIVE);
				setState(3024);
				match(T_OPEN_P);
				setState(3025);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3026);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("POSITIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(3029);
				match(T_NEGATIVE);
				setState(3030);
				match(T_OPEN_P);
				setState(3031);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3032);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("NEGATIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(3035);
				match(T_SIGN);
				setState(3036);
				match(T_OPEN_P);
				setState(3037);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3038);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIGN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(3041);
				match(T__8);
				setState(3042);
				match(T_OPEN_P);
				setState(3043);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("EULER_CONST"); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(3045);
				match(T__9);
				setState(3046);
				match(T_OPEN_P);
				setState(3047);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("PI_CONST"); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(3049);
				match(T_FACTORIAL);
				setState(3050);
				match(T_OPEN_P);
				setState(3051);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3052);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FACTORIAL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(3055);
				match(T_CBR);
				setState(3056);
				match(T_OPEN_P);
				setState(3057);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3058);
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
		enterRule(_localctx, 196, RULE_literal_values);
		try {
			setState(3079);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3063);
				((Literal_valuesContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_string_type((((Literal_valuesContext)_localctx).STRING_LITERAL!=null?((Literal_valuesContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3065);
				((Literal_valuesContext)_localctx).DECIMAL_LITERAL = match(DECIMAL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_decimal_type((((Literal_valuesContext)_localctx).DECIMAL_LITERAL!=null?((Literal_valuesContext)_localctx).DECIMAL_LITERAL.getText():null)); 
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(3067);
				((Literal_valuesContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_int_type((((Literal_valuesContext)_localctx).INT_LITERAL!=null?((Literal_valuesContext)_localctx).INT_LITERAL.getText():null)); 
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(3069);
				((Literal_valuesContext)_localctx).BOOL_LITERAL = match(BOOL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_boolean_type((((Literal_valuesContext)_localctx).BOOL_LITERAL!=null?((Literal_valuesContext)_localctx).BOOL_LITERAL.getText():null)); 
				}
				break;
			case NULL_CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(3071);
				match(NULL_CONST);
				 ((Literal_valuesContext)_localctx).res =  hql_null_constant(); 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(3073);
				((Literal_valuesContext)_localctx).date_literal = date_literal();
				 ((Literal_valuesContext)_localctx).res =  hql_type_date_literal(((Literal_valuesContext)_localctx).date_literal.res); 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(3076);
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
		public Name_identifierContext database;
		public Name_identifierContext tablename;
		public Name_identifierContext field;
		public List<Name_identifierContext> name_identifier() {
			return getRuleContexts(Name_identifierContext.class);
		}
		public Name_identifierContext name_identifier(int i) {
			return getRuleContext(Name_identifierContext.class,i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_ident);
		try {
			setState(3099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(3081);
				((IdentContext)_localctx).database = name_identifier();
				setState(3082);
				match(T__1);
				}
				{
				setState(3084);
				((IdentContext)_localctx).tablename = name_identifier();
				setState(3085);
				match(T__1);
				}
				setState(3087);
				((IdentContext)_localctx).field = name_identifier();
				 ((IdentContext)_localctx).res =  hql_type_identifier(((IdentContext)_localctx).database.res, ((IdentContext)_localctx).tablename.res, ((IdentContext)_localctx).field.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(3090);
				((IdentContext)_localctx).tablename = name_identifier();
				setState(3091);
				match(T__1);
				}
				setState(3093);
				((IdentContext)_localctx).field = name_identifier();
				 ((IdentContext)_localctx).res =  hql_type_identifier(string(), ((IdentContext)_localctx).tablename.res, ((IdentContext)_localctx).field.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3096);
				((IdentContext)_localctx).field = name_identifier();
				 ((IdentContext)_localctx).res =  hql_type_identifier(string(), string(), ((IdentContext)_localctx).field.res); 
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

	public static class Tab_identContext extends ParserRuleContext {
		public json res;
		public Name_identifierContext database;
		public Name_identifierContext tablename;
		public Complex_nameContext database_var;
		public Complex_nameContext tablename_var;
		public List<Name_identifierContext> name_identifier() {
			return getRuleContexts(Name_identifierContext.class);
		}
		public Name_identifierContext name_identifier(int i) {
			return getRuleContext(Name_identifierContext.class,i);
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
		enterRule(_localctx, 200, RULE_tab_ident);
		try {
			setState(3117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3101);
				((Tab_identContext)_localctx).database = name_identifier();
				setState(3102);
				match(T__1);
				setState(3103);
				((Tab_identContext)_localctx).tablename = name_identifier();
				 ((Tab_identContext)_localctx).res =  hql_type_table_identifier(((Tab_identContext)_localctx).database.res, ((Tab_identContext)_localctx).tablename.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3106);
				((Tab_identContext)_localctx).tablename = name_identifier();
				 ((Tab_identContext)_localctx).res =  hql_type_table_identifier(string(), ((Tab_identContext)_localctx).tablename.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3109);
				((Tab_identContext)_localctx).database_var = complex_name();
				setState(3110);
				match(T__1);
				setState(3111);
				((Tab_identContext)_localctx).tablename_var = complex_name();
				 ((Tab_identContext)_localctx).res =  hql_type_table_identifier(((Tab_identContext)_localctx).database_var.res, ((Tab_identContext)_localctx).tablename_var.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3114);
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
		enterRule(_localctx, 202, RULE_complex_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			vector<Complex_atom_nameContext*> name_list; 
			setState(3121); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3120);
					((Complex_nameContext)_localctx).complex_atom_name = complex_atom_name();
					((Complex_nameContext)_localctx).name_list.add(((Complex_nameContext)_localctx).complex_atom_name);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3123); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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
		public Name_identifierContext name_identifier;
		public Use_varContext use_var;
		public Name_identifierContext name_identifier() {
			return getRuleContext(Name_identifierContext.class,0);
		}
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
		enterRule(_localctx, 204, RULE_complex_atom_name);
		try {
			setState(3133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALL:
			case T_ALTER:
			case T_AND:
			case T_AS:
			case T_ASC:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SETS:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SPLIT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(3127);
				((Complex_atom_nameContext)_localctx).name_identifier = name_identifier();
				 ((Complex_atom_nameContext)_localctx).res =  ((Complex_atom_nameContext)_localctx).name_identifier.res; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(3130);
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

	public static class Name_identifierContext extends ParserRuleContext {
		public string res;
		public Token IDENTIFIER;
		public Non_reserved_wordsContext non_reserved_words;
		public TerminalNode IDENTIFIER() { return getToken(HiveParser.IDENTIFIER, 0); }
		public Non_reserved_wordsContext non_reserved_words() {
			return getRuleContext(Non_reserved_wordsContext.class,0);
		}
		public Name_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_identifier; }
	}

	public final Name_identifierContext name_identifier() throws RecognitionException {
		Name_identifierContext _localctx = new Name_identifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_name_identifier);
		try {
			setState(3140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(3135);
				((Name_identifierContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Name_identifierContext)_localctx).res =  (((Name_identifierContext)_localctx).IDENTIFIER!=null?((Name_identifierContext)_localctx).IDENTIFIER.getText():null); 
				}
				break;
			case T_ALL:
			case T_ALTER:
			case T_AND:
			case T_AS:
			case T_ASC:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SETS:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SPLIT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				enterOuterAlt(_localctx, 2);
				{
				setState(3137);
				((Name_identifierContext)_localctx).non_reserved_words = non_reserved_words();
				 ((Name_identifierContext)_localctx).res =  ((Name_identifierContext)_localctx).non_reserved_words.res; 
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
		enterRule(_localctx, 208, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3142);
			match(T_DATE);
			setState(3143);
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
		enterRule(_localctx, 210, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3146);
			match(T_TIMESTAMP);
			setState(3147);
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
		enterRule(_localctx, 212, RULE_set_operators_is);
		try {
			setState(3155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3150);
				match(T_IS);
				 ((Set_operators_isContext)_localctx).res =  "IS"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3152);
				match(T_IS);
				setState(3153);
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
		enterRule(_localctx, 214, RULE_set_operators_like);
		try {
			setState(3166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3157);
				match(T_LIKE);
				 ((Set_operators_likeContext)_localctx).res =  "LIKE"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3159);
				match(T_NOT);
				setState(3160);
				match(T_LIKE);
				 ((Set_operators_likeContext)_localctx).res =  "NOT_LIKE"; 
				}
				break;
			case T_RLIKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3162);
				match(T_RLIKE);
				 ((Set_operators_likeContext)_localctx).res =  "RLIKE"; 
				}
				break;
			case T_REGEXP:
				enterOuterAlt(_localctx, 4);
				{
				setState(3164);
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
		enterRule(_localctx, 216, RULE_set_operators_in);
		try {
			setState(3173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(3168);
				match(T_IN);
				 ((Set_operators_inContext)_localctx).res =  "IN"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3170);
				match(T_NOT);
				setState(3171);
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
		enterRule(_localctx, 218, RULE_set_operators_exists);
		try {
			setState(3180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EXISTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(3175);
				match(T_EXISTS);
				 ((Set_operators_existsContext)_localctx).res =  "EXISTS"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3177);
				match(T_NOT);
				setState(3178);
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
		enterRule(_localctx, 220, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3182);
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

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public string res;
		public Token T_ACTIVITY_COUNT;
		public Token T_ALL;
		public Token T_ALTER;
		public Token T_AND;
		public Token T_AS;
		public Token T_ASC;
		public Token T_AT;
		public Token T_AUTO_INCREMENT;
		public Token T_AVG;
		public Token T_BEGIN;
		public Token T_BETWEEN;
		public Token T_BIGINT;
		public Token T_BIT;
		public Token T_BODY;
		public Token T_BREAK;
		public Token T_BY;
		public Token T_BYTE;
		public Token T_CALL;
		public Token T_CALLER;
		public Token T_CASCADE;
		public Token T_CASE;
		public Token T_CAST;
		public Token T_CHAR;
		public Token T_CHARACTER;
		public Token T_CHARSET;
		public Token T_CLIENT;
		public Token T_CLOSE;
		public Token T_CLUSTERED;
		public Token T_CMP;
		public Token T_COLLECT;
		public Token T_COLLECTION;
		public Token T_COLUMN;
		public Token T_COMMENT;
		public Token T_COMPRESS;
		public Token T_CONSTANT;
		public Token T_COPY;
		public Token T_COMMIT;
		public Token T_CONCAT;
		public Token T_CONDITION;
		public Token T_CONSTRAINT;
		public Token T_CONTINUE;
		public Token T_COUNT;
		public Token T_COUNT_BIG;
		public Token T_CREATE;
		public Token T_CREATION;
		public Token T_CREATOR;
		public Token T_CS;
		public Token T_CUME_DIST;
		public Token T_CURRENT;
		public Token T_CURRENT_DATE;
		public Token T_CURRENT_SCHEMA;
		public Token T_CURRENT_TIMESTAMP;
		public Token T_CURRENT_USER;
		public Token T_CURSOR;
		public Token T_DATABASE;
		public Token T_DATE;
		public Token T_DATETIME;
		public Token T_DAY;
		public Token T_DAYS;
		public Token T_DEC;
		public Token T_DECIMAL;
		public Token T_DECLARE;
		public Token T_DEFAULT;
		public Token T_DEFERRED;
		public Token T_DEFINED;
		public Token T_DEFINER;
		public Token T_DEFINITION;
		public Token T_DELETE;
		public Token T_DELIMITED;
		public Token T_DELIMITER;
		public Token T_DENSE_RANK;
		public Token T_DESC;
		public Token T_DESCRIBE;
		public Token T_DIAGNOSTICS;
		public Token T_DIR;
		public Token T_DIRECTORY;
		public Token T_DISTINCT;
		public Token T_DISTRIBUTE;
		public Token T_DO;
		public Token T_DOUBLE;
		public Token T_DROP;
		public Token T_DYNAMIC;
		public Token T_ENABLE;
		public Token T_ENGINE;
		public Token T_ESCAPED;
		public Token T_EXCEPT;
		public Token T_EXEC;
		public Token T_EXECUTE;
		public Token T_EXCEPTION;
		public Token T_EXCLUSIVE;
		public Token T_EXISTS;
		public Token T_EXIT;
		public Token T_FALLBACK;
		public Token T_FALSE;
		public Token T_FETCH;
		public Token T_FIELDS;
		public Token T_FILE;
		public Token T_FILES;
		public Token T_FIRST_VALUE;
		public Token T_FLOAT;
		public Token T_FOR;
		public Token T_FOREIGN;
		public Token T_FORMAT;
		public Token T_FOUND;
		public Token T_FROM;
		public Token T_FULL;
		public Token T_FUNCTION;
		public Token T_GET;
		public Token T_GLOBAL;
		public Token T_GO;
		public Token T_GRANT;
		public Token T_GROUP;
		public Token T_HANDLER;
		public Token T_HASH;
		public Token T_HAVING;
		public Token T_HDFS;
		public Token T_HOST;
		public Token T_IDENTITY;
		public Token T_IF;
		public Token T_IGNORE;
		public Token T_IMMEDIATE;
		public Token T_IN;
		public Token T_INCLUDE;
		public Token T_INDEX;
		public Token T_INITRANS;
		public Token T_INNER;
		public Token T_INOUT;
		public Token T_INSERT;
		public Token T_INT;
		public Token T_INT2;
		public Token T_INT4;
		public Token T_INT8;
		public Token T_INTEGER;
		public Token T_INTERSECT;
		public Token T_INTERVAL;
		public Token T_INTO;
		public Token T_INVOKER;
		public Token T_ITEMS;
		public Token T_IS;
		public Token T_ISOPEN;
		public Token T_JOIN;
		public Token T_KEEP;
		public Token T_KEY;
		public Token T_KEYS;
		public Token T_LAG;
		public Token T_LANGUAGE;
		public Token T_LAST_VALUE;
		public Token T_LEAD;
		public Token T_LEAVE;
		public Token T_LEFT;
		public Token T_LIKE;
		public Token T_LIMIT;
		public Token T_LINES;
		public Token T_LOCAL;
		public Token T_LOCATION;
		public Token T_LOCATOR;
		public Token T_LOCATORS;
		public Token T_LOCKS;
		public Token T_LOG;
		public Token T_LOGGED;
		public Token T_LOGGING;
		public Token T_LOOP;
		public Token T_MAP;
		public Token T_MATCHED;
		public Token T_MAX;
		public Token T_MAXTRANS;
		public Token T_MERGE;
		public Token T_MESSAGE_TEXT;
		public Token T_MICROSECOND;
		public Token T_MICROSECONDS;
		public Token T_MIN;
		public Token T_MULTISET;
		public Token T_NCHAR;
		public Token T_NEW;
		public Token T_NVARCHAR;
		public Token T_NO;
		public Token T_NOCOMPRESS;
		public Token T_NOCOUNT;
		public Token T_NOLOGGING;
		public Token T_NONE;
		public Token T_NOT;
		public Token T_NOTFOUND;
		public Token T_NUMERIC;
		public Token T_NUMBER;
		public Token T_OBJECT;
		public Token T_OFF;
		public Token T_ON;
		public Token T_ONLY;
		public Token T_OPEN;
		public Token T_OR;
		public Token T_ORDER;
		public Token T_OUT;
		public Token T_OUTER;
		public Token T_OVER;
		public Token T_OVERWRITE;
		public Token T_OWNER;
		public Token T_PACKAGE;
		public Token T_PART_COUNT;
		public Token T_PART_LOC;
		public Token T_PARTITION;
		public Token T_PCTFREE;
		public Token T_PCTUSED;
		public Token T_PRECISION;
		public Token T_PRESERVE;
		public Token T_PRIMARY;
		public Token T_PROC;
		public Token T_PROCEDURE;
		public Token T_PWD;
		public Token T_QUALIFY;
		public Token T_QUERY_BAND;
		public Token T_QUIT;
		public Token T_RAISE;
		public Token T_RANK;
		public Token T_REAL;
		public Token T_REFERENCES;
		public Token T_REGEXP;
		public Token T_RR;
		public Token T_REPLACE;
		public Token T_RESIGNAL;
		public Token T_RESTRICT;
		public Token T_RESULT;
		public Token T_RESULT_SET_LOCATOR;
		public Token T_RETURN;
		public Token T_RETURNS;
		public Token T_REVERSE;
		public Token T_RIGHT;
		public Token T_RLIKE;
		public Token T_RS;
		public Token T_ROLE;
		public Token T_ROLLBACK;
		public Token T_ROW;
		public Token T_ROWS;
		public Token T_ROW_COUNT;
		public Token T_ROW_NUMBER;
		public Token T_SCHEMA;
		public Token T_SECOND;
		public Token T_SECONDS;
		public Token T_SECURITY;
		public Token T_SEGMENT;
		public Token T_SEL;
		public Token T_SELECT;
		public Token T_SET;
		public Token T_SETS;
		public Token T_SIMPLE_DOUBLE;
		public Token T_SIMPLE_FLOAT;
		public Token T_SMALLDATETIME;
		public Token T_SMALLINT;
		public Token T_SPLIT;
		public Token T_SQL;
		public Token T_SQLEXCEPTION;
		public Token T_SQLINSERT;
		public Token T_SQLSTATE;
		public Token T_SQLWARNING;
		public Token T_STATS;
		public Token T_STATISTICS;
		public Token T_STEP;
		public Token T_STDEV;
		public Token T_STORAGE;
		public Token T_STORED;
		public Token T_STRING;
		public Token T_SUBDIR;
		public Token T_SUBSTRING;
		public Token T_SUM;
		public Token T_SUMMARY;
		public Token T_SYSDATE;
		public Token T_SYS_REFCURSOR;
		public Token T_TABLE;
		public Token T_TABLESPACE;
		public Token T_TEMPORARY;
		public Token T_TERMINATED;
		public Token T_TEXTIMAGE_ON;
		public Token T_THEN;
		public Token T_TIMESTAMP;
		public Token T_TITLE;
		public Token T_TO;
		public Token T_TOP;
		public Token T_TRANSACTION;
		public Token T_TRIM;
		public Token T_TRUE;
		public Token T_TRUNCATE;
		public Token T_UNIQUE;
		public Token T_UPDATE;
		public Token T_UR;
		public Token T_USE;
		public Token T_USER;
		public Token T_USING;
		public Token T_VALUE;
		public Token T_VALUES;
		public Token T_VAR;
		public Token T_VARCHAR;
		public Token T_VARCHAR2;
		public Token T_VARYING;
		public Token T_VARIANCE;
		public Token T_VOLATILE;
		public Token T_WHILE;
		public Token T_WITH;
		public Token T_WITHOUT;
		public Token T_WORK;
		public Token T_XACT_ABORT;
		public Token T_XML;
		public Token T_YES;
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HiveParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ALL() { return getToken(HiveParser.T_ALL, 0); }
		public TerminalNode T_ALTER() { return getToken(HiveParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(HiveParser.T_ASC, 0); }
		public TerminalNode T_AT() { return getToken(HiveParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HiveParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(HiveParser.T_AVG, 0); }
		public TerminalNode T_BEGIN() { return getToken(HiveParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HiveParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(HiveParser.T_BIGINT, 0); }
		public TerminalNode T_BIT() { return getToken(HiveParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(HiveParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(HiveParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(HiveParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(HiveParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(HiveParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(HiveParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(HiveParser.T_CASE, 0); }
		public TerminalNode T_CAST() { return getToken(HiveParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(HiveParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HiveParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(HiveParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(HiveParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(HiveParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(HiveParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(HiveParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(HiveParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HiveParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(HiveParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(HiveParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HiveParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(HiveParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(HiveParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(HiveParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(HiveParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(HiveParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(HiveParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(HiveParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(HiveParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HiveParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(HiveParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(HiveParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(HiveParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(HiveParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HiveParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(HiveParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HiveParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HiveParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HiveParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HiveParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(HiveParser.T_CURSOR, 0); }
		public TerminalNode T_DATABASE() { return getToken(HiveParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(HiveParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HiveParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(HiveParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HiveParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(HiveParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HiveParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(HiveParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HiveParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HiveParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(HiveParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(HiveParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HiveParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(HiveParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HiveParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(HiveParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HiveParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(HiveParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(HiveParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(HiveParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(HiveParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HiveParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HiveParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HiveParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(HiveParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HiveParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(HiveParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HiveParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(HiveParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(HiveParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(HiveParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HiveParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(HiveParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(HiveParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(HiveParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HiveParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(HiveParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(HiveParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HiveParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(HiveParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(HiveParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(HiveParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(HiveParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(HiveParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HiveParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(HiveParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(HiveParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(HiveParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(HiveParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(HiveParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(HiveParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(HiveParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HiveParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(HiveParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(HiveParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(HiveParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(HiveParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(HiveParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(HiveParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(HiveParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(HiveParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(HiveParser.T_HDFS, 0); }
		public TerminalNode T_HOST() { return getToken(HiveParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(HiveParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(HiveParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(HiveParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HiveParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(HiveParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(HiveParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(HiveParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(HiveParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(HiveParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(HiveParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(HiveParser.T_INSERT, 0); }
		public TerminalNode T_INT() { return getToken(HiveParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HiveParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HiveParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HiveParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HiveParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HiveParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(HiveParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(HiveParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(HiveParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(HiveParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(HiveParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(HiveParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(HiveParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(HiveParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(HiveParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(HiveParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(HiveParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(HiveParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(HiveParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HiveParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(HiveParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(HiveParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(HiveParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(HiveParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(HiveParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(HiveParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(HiveParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HiveParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HiveParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(HiveParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(HiveParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(HiveParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(HiveParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(HiveParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(HiveParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(HiveParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(HiveParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HiveParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(HiveParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HiveParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HiveParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HiveParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(HiveParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(HiveParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(HiveParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(HiveParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HiveParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(HiveParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HiveParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HiveParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HiveParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(HiveParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HiveParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HiveParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(HiveParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(HiveParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(HiveParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(HiveParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(HiveParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(HiveParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(HiveParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(HiveParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(HiveParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(HiveParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(HiveParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HiveParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(HiveParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HiveParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HiveParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HiveParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(HiveParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(HiveParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HiveParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(HiveParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HiveParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HiveParser.T_PRIMARY, 0); }
		public TerminalNode T_PROC() { return getToken(HiveParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HiveParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(HiveParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(HiveParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(HiveParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(HiveParser.T_QUIT, 0); }
		public TerminalNode T_RAISE() { return getToken(HiveParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(HiveParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(HiveParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HiveParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(HiveParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(HiveParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(HiveParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(HiveParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HiveParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(HiveParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HiveParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(HiveParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HiveParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(HiveParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(HiveParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(HiveParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(HiveParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(HiveParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(HiveParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(HiveParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(HiveParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HiveParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HiveParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HiveParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(HiveParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HiveParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(HiveParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(HiveParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(HiveParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(HiveParser.T_SELECT, 0); }
		public TerminalNode T_SET() { return getToken(HiveParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(HiveParser.T_SETS, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HiveParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HiveParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HiveParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HiveParser.T_SMALLINT, 0); }
		public TerminalNode T_SPLIT() { return getToken(HiveParser.T_SPLIT, 0); }
		public TerminalNode T_SQL() { return getToken(HiveParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HiveParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HiveParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(HiveParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HiveParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(HiveParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(HiveParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(HiveParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(HiveParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(HiveParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(HiveParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(HiveParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(HiveParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HiveParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(HiveParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(HiveParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HiveParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HiveParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(HiveParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HiveParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HiveParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HiveParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(HiveParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HiveParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(HiveParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(HiveParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(HiveParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HiveParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(HiveParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(HiveParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(HiveParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HiveParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HiveParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(HiveParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HiveParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(HiveParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(HiveParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(HiveParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(HiveParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(HiveParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HiveParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HiveParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(HiveParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HiveParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HiveParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(HiveParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(HiveParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(HiveParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(HiveParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HiveParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(HiveParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(HiveParser.T_YES, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_non_reserved_words);
		try {
			setState(3786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTIVITY_COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3184);
				((Non_reserved_wordsContext)_localctx).T_ACTIVITY_COUNT = match(T_ACTIVITY_COUNT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ACTIVITY_COUNT!=null?((Non_reserved_wordsContext)_localctx).T_ACTIVITY_COUNT.getText():null); 
				}
				break;
			case T_ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3186);
				((Non_reserved_wordsContext)_localctx).T_ALL = match(T_ALL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ALL!=null?((Non_reserved_wordsContext)_localctx).T_ALL.getText():null); 
				}
				break;
			case T_ALTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(3188);
				((Non_reserved_wordsContext)_localctx).T_ALTER = match(T_ALTER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ALTER!=null?((Non_reserved_wordsContext)_localctx).T_ALTER.getText():null); 
				}
				break;
			case T_AND:
				enterOuterAlt(_localctx, 4);
				{
				setState(3190);
				((Non_reserved_wordsContext)_localctx).T_AND = match(T_AND);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_AND!=null?((Non_reserved_wordsContext)_localctx).T_AND.getText():null); 
				}
				break;
			case T_AS:
				enterOuterAlt(_localctx, 5);
				{
				setState(3192);
				((Non_reserved_wordsContext)_localctx).T_AS = match(T_AS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_AS!=null?((Non_reserved_wordsContext)_localctx).T_AS.getText():null); 
				}
				break;
			case T_ASC:
				enterOuterAlt(_localctx, 6);
				{
				setState(3194);
				((Non_reserved_wordsContext)_localctx).T_ASC = match(T_ASC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ASC!=null?((Non_reserved_wordsContext)_localctx).T_ASC.getText():null); 
				}
				break;
			case T_AT:
				enterOuterAlt(_localctx, 7);
				{
				setState(3196);
				((Non_reserved_wordsContext)_localctx).T_AT = match(T_AT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_AT!=null?((Non_reserved_wordsContext)_localctx).T_AT.getText():null); 
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(3198);
				((Non_reserved_wordsContext)_localctx).T_AUTO_INCREMENT = match(T_AUTO_INCREMENT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_AUTO_INCREMENT!=null?((Non_reserved_wordsContext)_localctx).T_AUTO_INCREMENT.getText():null); 
				}
				break;
			case T_AVG:
				enterOuterAlt(_localctx, 9);
				{
				setState(3200);
				((Non_reserved_wordsContext)_localctx).T_AVG = match(T_AVG);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_AVG!=null?((Non_reserved_wordsContext)_localctx).T_AVG.getText():null); 
				}
				break;
			case T_BEGIN:
				enterOuterAlt(_localctx, 10);
				{
				setState(3202);
				((Non_reserved_wordsContext)_localctx).T_BEGIN = match(T_BEGIN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BEGIN!=null?((Non_reserved_wordsContext)_localctx).T_BEGIN.getText():null); 
				}
				break;
			case T_BETWEEN:
				enterOuterAlt(_localctx, 11);
				{
				setState(3204);
				((Non_reserved_wordsContext)_localctx).T_BETWEEN = match(T_BETWEEN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BETWEEN!=null?((Non_reserved_wordsContext)_localctx).T_BETWEEN.getText():null); 
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 12);
				{
				setState(3206);
				((Non_reserved_wordsContext)_localctx).T_BIGINT = match(T_BIGINT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BIGINT!=null?((Non_reserved_wordsContext)_localctx).T_BIGINT.getText():null); 
				}
				break;
			case T_BIT:
				enterOuterAlt(_localctx, 13);
				{
				setState(3208);
				((Non_reserved_wordsContext)_localctx).T_BIT = match(T_BIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BIT!=null?((Non_reserved_wordsContext)_localctx).T_BIT.getText():null); 
				}
				break;
			case T_BODY:
				enterOuterAlt(_localctx, 14);
				{
				setState(3210);
				((Non_reserved_wordsContext)_localctx).T_BODY = match(T_BODY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BODY!=null?((Non_reserved_wordsContext)_localctx).T_BODY.getText():null); 
				}
				break;
			case T_BREAK:
				enterOuterAlt(_localctx, 15);
				{
				setState(3212);
				((Non_reserved_wordsContext)_localctx).T_BREAK = match(T_BREAK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BREAK!=null?((Non_reserved_wordsContext)_localctx).T_BREAK.getText():null); 
				}
				break;
			case T_BY:
				enterOuterAlt(_localctx, 16);
				{
				setState(3214);
				((Non_reserved_wordsContext)_localctx).T_BY = match(T_BY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BY!=null?((Non_reserved_wordsContext)_localctx).T_BY.getText():null); 
				}
				break;
			case T_BYTE:
				enterOuterAlt(_localctx, 17);
				{
				setState(3216);
				((Non_reserved_wordsContext)_localctx).T_BYTE = match(T_BYTE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BYTE!=null?((Non_reserved_wordsContext)_localctx).T_BYTE.getText():null); 
				}
				break;
			case T_CALL:
				enterOuterAlt(_localctx, 18);
				{
				setState(3218);
				((Non_reserved_wordsContext)_localctx).T_CALL = match(T_CALL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CALL!=null?((Non_reserved_wordsContext)_localctx).T_CALL.getText():null); 
				}
				break;
			case T_CALLER:
				enterOuterAlt(_localctx, 19);
				{
				setState(3220);
				((Non_reserved_wordsContext)_localctx).T_CALLER = match(T_CALLER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CALLER!=null?((Non_reserved_wordsContext)_localctx).T_CALLER.getText():null); 
				}
				break;
			case T_CASCADE:
				enterOuterAlt(_localctx, 20);
				{
				setState(3222);
				((Non_reserved_wordsContext)_localctx).T_CASCADE = match(T_CASCADE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CASCADE!=null?((Non_reserved_wordsContext)_localctx).T_CASCADE.getText():null); 
				}
				break;
			case T_CASE:
				enterOuterAlt(_localctx, 21);
				{
				setState(3224);
				((Non_reserved_wordsContext)_localctx).T_CASE = match(T_CASE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CASE!=null?((Non_reserved_wordsContext)_localctx).T_CASE.getText():null); 
				}
				break;
			case T_CAST:
				enterOuterAlt(_localctx, 22);
				{
				setState(3226);
				((Non_reserved_wordsContext)_localctx).T_CAST = match(T_CAST);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CAST!=null?((Non_reserved_wordsContext)_localctx).T_CAST.getText():null); 
				}
				break;
			case T_CHAR:
				enterOuterAlt(_localctx, 23);
				{
				setState(3228);
				((Non_reserved_wordsContext)_localctx).T_CHAR = match(T_CHAR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CHAR!=null?((Non_reserved_wordsContext)_localctx).T_CHAR.getText():null); 
				}
				break;
			case T_CHARACTER:
				enterOuterAlt(_localctx, 24);
				{
				setState(3230);
				((Non_reserved_wordsContext)_localctx).T_CHARACTER = match(T_CHARACTER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CHARACTER!=null?((Non_reserved_wordsContext)_localctx).T_CHARACTER.getText():null); 
				}
				break;
			case T_CHARSET:
				enterOuterAlt(_localctx, 25);
				{
				setState(3232);
				((Non_reserved_wordsContext)_localctx).T_CHARSET = match(T_CHARSET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CHARSET!=null?((Non_reserved_wordsContext)_localctx).T_CHARSET.getText():null); 
				}
				break;
			case T_CLIENT:
				enterOuterAlt(_localctx, 26);
				{
				setState(3234);
				((Non_reserved_wordsContext)_localctx).T_CLIENT = match(T_CLIENT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CLIENT!=null?((Non_reserved_wordsContext)_localctx).T_CLIENT.getText():null); 
				}
				break;
			case T_CLOSE:
				enterOuterAlt(_localctx, 27);
				{
				setState(3236);
				((Non_reserved_wordsContext)_localctx).T_CLOSE = match(T_CLOSE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CLOSE!=null?((Non_reserved_wordsContext)_localctx).T_CLOSE.getText():null); 
				}
				break;
			case T_CLUSTERED:
				enterOuterAlt(_localctx, 28);
				{
				setState(3238);
				((Non_reserved_wordsContext)_localctx).T_CLUSTERED = match(T_CLUSTERED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CLUSTERED!=null?((Non_reserved_wordsContext)_localctx).T_CLUSTERED.getText():null); 
				}
				break;
			case T_CMP:
				enterOuterAlt(_localctx, 29);
				{
				setState(3240);
				((Non_reserved_wordsContext)_localctx).T_CMP = match(T_CMP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CMP!=null?((Non_reserved_wordsContext)_localctx).T_CMP.getText():null); 
				}
				break;
			case T_COLLECT:
				enterOuterAlt(_localctx, 30);
				{
				setState(3242);
				((Non_reserved_wordsContext)_localctx).T_COLLECT = match(T_COLLECT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COLLECT!=null?((Non_reserved_wordsContext)_localctx).T_COLLECT.getText():null); 
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 31);
				{
				setState(3244);
				((Non_reserved_wordsContext)_localctx).T_COLLECTION = match(T_COLLECTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COLLECTION!=null?((Non_reserved_wordsContext)_localctx).T_COLLECTION.getText():null); 
				}
				break;
			case T_COLUMN:
				enterOuterAlt(_localctx, 32);
				{
				setState(3246);
				((Non_reserved_wordsContext)_localctx).T_COLUMN = match(T_COLUMN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COLUMN!=null?((Non_reserved_wordsContext)_localctx).T_COLUMN.getText():null); 
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 33);
				{
				setState(3248);
				((Non_reserved_wordsContext)_localctx).T_COMMENT = match(T_COMMENT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COMMENT!=null?((Non_reserved_wordsContext)_localctx).T_COMMENT.getText():null); 
				}
				break;
			case T_COMPRESS:
				enterOuterAlt(_localctx, 34);
				{
				setState(3250);
				((Non_reserved_wordsContext)_localctx).T_COMPRESS = match(T_COMPRESS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COMPRESS!=null?((Non_reserved_wordsContext)_localctx).T_COMPRESS.getText():null); 
				}
				break;
			case T_CONSTANT:
				enterOuterAlt(_localctx, 35);
				{
				setState(3252);
				((Non_reserved_wordsContext)_localctx).T_CONSTANT = match(T_CONSTANT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CONSTANT!=null?((Non_reserved_wordsContext)_localctx).T_CONSTANT.getText():null); 
				}
				break;
			case T_COPY:
				enterOuterAlt(_localctx, 36);
				{
				setState(3254);
				((Non_reserved_wordsContext)_localctx).T_COPY = match(T_COPY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COPY!=null?((Non_reserved_wordsContext)_localctx).T_COPY.getText():null); 
				}
				break;
			case T_COMMIT:
				enterOuterAlt(_localctx, 37);
				{
				setState(3256);
				((Non_reserved_wordsContext)_localctx).T_COMMIT = match(T_COMMIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COMMIT!=null?((Non_reserved_wordsContext)_localctx).T_COMMIT.getText():null); 
				}
				break;
			case T_CONCAT:
				enterOuterAlt(_localctx, 38);
				{
				setState(3258);
				((Non_reserved_wordsContext)_localctx).T_CONCAT = match(T_CONCAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CONCAT!=null?((Non_reserved_wordsContext)_localctx).T_CONCAT.getText():null); 
				}
				break;
			case T_CONDITION:
				enterOuterAlt(_localctx, 39);
				{
				setState(3260);
				((Non_reserved_wordsContext)_localctx).T_CONDITION = match(T_CONDITION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CONDITION!=null?((Non_reserved_wordsContext)_localctx).T_CONDITION.getText():null); 
				}
				break;
			case T_CONSTRAINT:
				enterOuterAlt(_localctx, 40);
				{
				setState(3262);
				((Non_reserved_wordsContext)_localctx).T_CONSTRAINT = match(T_CONSTRAINT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CONSTRAINT!=null?((Non_reserved_wordsContext)_localctx).T_CONSTRAINT.getText():null); 
				}
				break;
			case T_CONTINUE:
				enterOuterAlt(_localctx, 41);
				{
				setState(3264);
				((Non_reserved_wordsContext)_localctx).T_CONTINUE = match(T_CONTINUE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CONTINUE!=null?((Non_reserved_wordsContext)_localctx).T_CONTINUE.getText():null); 
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 42);
				{
				setState(3266);
				((Non_reserved_wordsContext)_localctx).T_COUNT = match(T_COUNT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COUNT!=null?((Non_reserved_wordsContext)_localctx).T_COUNT.getText():null); 
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 43);
				{
				setState(3268);
				((Non_reserved_wordsContext)_localctx).T_COUNT_BIG = match(T_COUNT_BIG);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COUNT_BIG!=null?((Non_reserved_wordsContext)_localctx).T_COUNT_BIG.getText():null); 
				}
				break;
			case T_CREATE:
				enterOuterAlt(_localctx, 44);
				{
				setState(3270);
				((Non_reserved_wordsContext)_localctx).T_CREATE = match(T_CREATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CREATE!=null?((Non_reserved_wordsContext)_localctx).T_CREATE.getText():null); 
				}
				break;
			case T_CREATION:
				enterOuterAlt(_localctx, 45);
				{
				setState(3272);
				((Non_reserved_wordsContext)_localctx).T_CREATION = match(T_CREATION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CREATION!=null?((Non_reserved_wordsContext)_localctx).T_CREATION.getText():null); 
				}
				break;
			case T_CREATOR:
				enterOuterAlt(_localctx, 46);
				{
				setState(3274);
				((Non_reserved_wordsContext)_localctx).T_CREATOR = match(T_CREATOR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CREATOR!=null?((Non_reserved_wordsContext)_localctx).T_CREATOR.getText():null); 
				}
				break;
			case T_CS:
				enterOuterAlt(_localctx, 47);
				{
				setState(3276);
				((Non_reserved_wordsContext)_localctx).T_CS = match(T_CS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CS!=null?((Non_reserved_wordsContext)_localctx).T_CS.getText():null); 
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 48);
				{
				setState(3278);
				((Non_reserved_wordsContext)_localctx).T_CUME_DIST = match(T_CUME_DIST);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CUME_DIST!=null?((Non_reserved_wordsContext)_localctx).T_CUME_DIST.getText():null); 
				}
				break;
			case T_CURRENT:
				enterOuterAlt(_localctx, 49);
				{
				setState(3280);
				((Non_reserved_wordsContext)_localctx).T_CURRENT = match(T_CURRENT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CURRENT!=null?((Non_reserved_wordsContext)_localctx).T_CURRENT.getText():null); 
				}
				break;
			case T_CURRENT_DATE:
				enterOuterAlt(_localctx, 50);
				{
				setState(3282);
				((Non_reserved_wordsContext)_localctx).T_CURRENT_DATE = match(T_CURRENT_DATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CURRENT_DATE!=null?((Non_reserved_wordsContext)_localctx).T_CURRENT_DATE.getText():null); 
				}
				break;
			case T_CURRENT_SCHEMA:
				enterOuterAlt(_localctx, 51);
				{
				setState(3284);
				((Non_reserved_wordsContext)_localctx).T_CURRENT_SCHEMA = match(T_CURRENT_SCHEMA);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CURRENT_SCHEMA!=null?((Non_reserved_wordsContext)_localctx).T_CURRENT_SCHEMA.getText():null); 
				}
				break;
			case T_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 52);
				{
				setState(3286);
				((Non_reserved_wordsContext)_localctx).T_CURRENT_TIMESTAMP = match(T_CURRENT_TIMESTAMP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CURRENT_TIMESTAMP!=null?((Non_reserved_wordsContext)_localctx).T_CURRENT_TIMESTAMP.getText():null); 
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 53);
				{
				setState(3288);
				((Non_reserved_wordsContext)_localctx).T_CURRENT_USER = match(T_CURRENT_USER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CURRENT_USER!=null?((Non_reserved_wordsContext)_localctx).T_CURRENT_USER.getText():null); 
				}
				break;
			case T_CURSOR:
				enterOuterAlt(_localctx, 54);
				{
				setState(3290);
				((Non_reserved_wordsContext)_localctx).T_CURSOR = match(T_CURSOR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CURSOR!=null?((Non_reserved_wordsContext)_localctx).T_CURSOR.getText():null); 
				}
				break;
			case T_DATABASE:
				enterOuterAlt(_localctx, 55);
				{
				setState(3292);
				((Non_reserved_wordsContext)_localctx).T_DATABASE = match(T_DATABASE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DATABASE!=null?((Non_reserved_wordsContext)_localctx).T_DATABASE.getText():null); 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 56);
				{
				setState(3294);
				((Non_reserved_wordsContext)_localctx).T_DATE = match(T_DATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DATE!=null?((Non_reserved_wordsContext)_localctx).T_DATE.getText():null); 
				}
				break;
			case T_DATETIME:
				enterOuterAlt(_localctx, 57);
				{
				setState(3296);
				((Non_reserved_wordsContext)_localctx).T_DATETIME = match(T_DATETIME);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DATETIME!=null?((Non_reserved_wordsContext)_localctx).T_DATETIME.getText():null); 
				}
				break;
			case T_DAY:
				enterOuterAlt(_localctx, 58);
				{
				setState(3298);
				((Non_reserved_wordsContext)_localctx).T_DAY = match(T_DAY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DAY!=null?((Non_reserved_wordsContext)_localctx).T_DAY.getText():null); 
				}
				break;
			case T_DAYS:
				enterOuterAlt(_localctx, 59);
				{
				setState(3300);
				((Non_reserved_wordsContext)_localctx).T_DAYS = match(T_DAYS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DAYS!=null?((Non_reserved_wordsContext)_localctx).T_DAYS.getText():null); 
				}
				break;
			case T_DEC:
				enterOuterAlt(_localctx, 60);
				{
				setState(3302);
				((Non_reserved_wordsContext)_localctx).T_DEC = match(T_DEC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEC!=null?((Non_reserved_wordsContext)_localctx).T_DEC.getText():null); 
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 61);
				{
				setState(3304);
				((Non_reserved_wordsContext)_localctx).T_DECIMAL = match(T_DECIMAL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DECIMAL!=null?((Non_reserved_wordsContext)_localctx).T_DECIMAL.getText():null); 
				}
				break;
			case T_DECLARE:
				enterOuterAlt(_localctx, 62);
				{
				setState(3306);
				((Non_reserved_wordsContext)_localctx).T_DECLARE = match(T_DECLARE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DECLARE!=null?((Non_reserved_wordsContext)_localctx).T_DECLARE.getText():null); 
				}
				break;
			case T_DEFAULT:
				enterOuterAlt(_localctx, 63);
				{
				setState(3308);
				((Non_reserved_wordsContext)_localctx).T_DEFAULT = match(T_DEFAULT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEFAULT!=null?((Non_reserved_wordsContext)_localctx).T_DEFAULT.getText():null); 
				}
				break;
			case T_DEFERRED:
				enterOuterAlt(_localctx, 64);
				{
				setState(3310);
				((Non_reserved_wordsContext)_localctx).T_DEFERRED = match(T_DEFERRED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEFERRED!=null?((Non_reserved_wordsContext)_localctx).T_DEFERRED.getText():null); 
				}
				break;
			case T_DEFINED:
				enterOuterAlt(_localctx, 65);
				{
				setState(3312);
				((Non_reserved_wordsContext)_localctx).T_DEFINED = match(T_DEFINED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEFINED!=null?((Non_reserved_wordsContext)_localctx).T_DEFINED.getText():null); 
				}
				break;
			case T_DEFINER:
				enterOuterAlt(_localctx, 66);
				{
				setState(3314);
				((Non_reserved_wordsContext)_localctx).T_DEFINER = match(T_DEFINER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEFINER!=null?((Non_reserved_wordsContext)_localctx).T_DEFINER.getText():null); 
				}
				break;
			case T_DEFINITION:
				enterOuterAlt(_localctx, 67);
				{
				setState(3316);
				((Non_reserved_wordsContext)_localctx).T_DEFINITION = match(T_DEFINITION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEFINITION!=null?((Non_reserved_wordsContext)_localctx).T_DEFINITION.getText():null); 
				}
				break;
			case T_DELETE:
				enterOuterAlt(_localctx, 68);
				{
				setState(3318);
				((Non_reserved_wordsContext)_localctx).T_DELETE = match(T_DELETE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DELETE!=null?((Non_reserved_wordsContext)_localctx).T_DELETE.getText():null); 
				}
				break;
			case T_DELIMITED:
				enterOuterAlt(_localctx, 69);
				{
				setState(3320);
				((Non_reserved_wordsContext)_localctx).T_DELIMITED = match(T_DELIMITED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DELIMITED!=null?((Non_reserved_wordsContext)_localctx).T_DELIMITED.getText():null); 
				}
				break;
			case T_DELIMITER:
				enterOuterAlt(_localctx, 70);
				{
				setState(3322);
				((Non_reserved_wordsContext)_localctx).T_DELIMITER = match(T_DELIMITER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DELIMITER!=null?((Non_reserved_wordsContext)_localctx).T_DELIMITER.getText():null); 
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 71);
				{
				setState(3324);
				((Non_reserved_wordsContext)_localctx).T_DENSE_RANK = match(T_DENSE_RANK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DENSE_RANK!=null?((Non_reserved_wordsContext)_localctx).T_DENSE_RANK.getText():null); 
				}
				break;
			case T_DESC:
				enterOuterAlt(_localctx, 72);
				{
				setState(3326);
				((Non_reserved_wordsContext)_localctx).T_DESC = match(T_DESC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DESC!=null?((Non_reserved_wordsContext)_localctx).T_DESC.getText():null); 
				}
				break;
			case T_DESCRIBE:
				enterOuterAlt(_localctx, 73);
				{
				setState(3328);
				((Non_reserved_wordsContext)_localctx).T_DESCRIBE = match(T_DESCRIBE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DESCRIBE!=null?((Non_reserved_wordsContext)_localctx).T_DESCRIBE.getText():null); 
				}
				break;
			case T_DIAGNOSTICS:
				enterOuterAlt(_localctx, 74);
				{
				setState(3330);
				((Non_reserved_wordsContext)_localctx).T_DIAGNOSTICS = match(T_DIAGNOSTICS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DIAGNOSTICS!=null?((Non_reserved_wordsContext)_localctx).T_DIAGNOSTICS.getText():null); 
				}
				break;
			case T_DIR:
				enterOuterAlt(_localctx, 75);
				{
				setState(3332);
				((Non_reserved_wordsContext)_localctx).T_DIR = match(T_DIR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DIR!=null?((Non_reserved_wordsContext)_localctx).T_DIR.getText():null); 
				}
				break;
			case T_DIRECTORY:
				enterOuterAlt(_localctx, 76);
				{
				setState(3334);
				((Non_reserved_wordsContext)_localctx).T_DIRECTORY = match(T_DIRECTORY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DIRECTORY!=null?((Non_reserved_wordsContext)_localctx).T_DIRECTORY.getText():null); 
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 77);
				{
				setState(3336);
				((Non_reserved_wordsContext)_localctx).T_DISTINCT = match(T_DISTINCT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DISTINCT!=null?((Non_reserved_wordsContext)_localctx).T_DISTINCT.getText():null); 
				}
				break;
			case T_DISTRIBUTE:
				enterOuterAlt(_localctx, 78);
				{
				setState(3338);
				((Non_reserved_wordsContext)_localctx).T_DISTRIBUTE = match(T_DISTRIBUTE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DISTRIBUTE!=null?((Non_reserved_wordsContext)_localctx).T_DISTRIBUTE.getText():null); 
				}
				break;
			case T_DO:
				enterOuterAlt(_localctx, 79);
				{
				setState(3340);
				((Non_reserved_wordsContext)_localctx).T_DO = match(T_DO);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DO!=null?((Non_reserved_wordsContext)_localctx).T_DO.getText():null); 
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 80);
				{
				setState(3342);
				((Non_reserved_wordsContext)_localctx).T_DOUBLE = match(T_DOUBLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DOUBLE!=null?((Non_reserved_wordsContext)_localctx).T_DOUBLE.getText():null); 
				}
				break;
			case T_DROP:
				enterOuterAlt(_localctx, 81);
				{
				setState(3344);
				((Non_reserved_wordsContext)_localctx).T_DROP = match(T_DROP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DROP!=null?((Non_reserved_wordsContext)_localctx).T_DROP.getText():null); 
				}
				break;
			case T_DYNAMIC:
				enterOuterAlt(_localctx, 82);
				{
				setState(3346);
				((Non_reserved_wordsContext)_localctx).T_DYNAMIC = match(T_DYNAMIC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DYNAMIC!=null?((Non_reserved_wordsContext)_localctx).T_DYNAMIC.getText():null); 
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 83);
				{
				setState(3348);
				((Non_reserved_wordsContext)_localctx).T_ENABLE = match(T_ENABLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ENABLE!=null?((Non_reserved_wordsContext)_localctx).T_ENABLE.getText():null); 
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 84);
				{
				setState(3350);
				((Non_reserved_wordsContext)_localctx).T_ENGINE = match(T_ENGINE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ENGINE!=null?((Non_reserved_wordsContext)_localctx).T_ENGINE.getText():null); 
				}
				break;
			case T_ESCAPED:
				enterOuterAlt(_localctx, 85);
				{
				setState(3352);
				((Non_reserved_wordsContext)_localctx).T_ESCAPED = match(T_ESCAPED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ESCAPED!=null?((Non_reserved_wordsContext)_localctx).T_ESCAPED.getText():null); 
				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 86);
				{
				setState(3354);
				((Non_reserved_wordsContext)_localctx).T_EXCEPT = match(T_EXCEPT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXCEPT!=null?((Non_reserved_wordsContext)_localctx).T_EXCEPT.getText():null); 
				}
				break;
			case T_EXEC:
				enterOuterAlt(_localctx, 87);
				{
				setState(3356);
				((Non_reserved_wordsContext)_localctx).T_EXEC = match(T_EXEC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXEC!=null?((Non_reserved_wordsContext)_localctx).T_EXEC.getText():null); 
				}
				break;
			case T_EXECUTE:
				enterOuterAlt(_localctx, 88);
				{
				setState(3358);
				((Non_reserved_wordsContext)_localctx).T_EXECUTE = match(T_EXECUTE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXECUTE!=null?((Non_reserved_wordsContext)_localctx).T_EXECUTE.getText():null); 
				}
				break;
			case T_EXCEPTION:
				enterOuterAlt(_localctx, 89);
				{
				setState(3360);
				((Non_reserved_wordsContext)_localctx).T_EXCEPTION = match(T_EXCEPTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXCEPTION!=null?((Non_reserved_wordsContext)_localctx).T_EXCEPTION.getText():null); 
				}
				break;
			case T_EXCLUSIVE:
				enterOuterAlt(_localctx, 90);
				{
				setState(3362);
				((Non_reserved_wordsContext)_localctx).T_EXCLUSIVE = match(T_EXCLUSIVE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXCLUSIVE!=null?((Non_reserved_wordsContext)_localctx).T_EXCLUSIVE.getText():null); 
				}
				break;
			case T_EXISTS:
				enterOuterAlt(_localctx, 91);
				{
				setState(3364);
				((Non_reserved_wordsContext)_localctx).T_EXISTS = match(T_EXISTS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXISTS!=null?((Non_reserved_wordsContext)_localctx).T_EXISTS.getText():null); 
				}
				break;
			case T_EXIT:
				enterOuterAlt(_localctx, 92);
				{
				setState(3366);
				((Non_reserved_wordsContext)_localctx).T_EXIT = match(T_EXIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXIT!=null?((Non_reserved_wordsContext)_localctx).T_EXIT.getText():null); 
				}
				break;
			case T_FALLBACK:
				enterOuterAlt(_localctx, 93);
				{
				setState(3368);
				((Non_reserved_wordsContext)_localctx).T_FALLBACK = match(T_FALLBACK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FALLBACK!=null?((Non_reserved_wordsContext)_localctx).T_FALLBACK.getText():null); 
				}
				break;
			case T_FALSE:
				enterOuterAlt(_localctx, 94);
				{
				setState(3370);
				((Non_reserved_wordsContext)_localctx).T_FALSE = match(T_FALSE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FALSE!=null?((Non_reserved_wordsContext)_localctx).T_FALSE.getText():null); 
				}
				break;
			case T_FETCH:
				enterOuterAlt(_localctx, 95);
				{
				setState(3372);
				((Non_reserved_wordsContext)_localctx).T_FETCH = match(T_FETCH);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FETCH!=null?((Non_reserved_wordsContext)_localctx).T_FETCH.getText():null); 
				}
				break;
			case T_FIELDS:
				enterOuterAlt(_localctx, 96);
				{
				setState(3374);
				((Non_reserved_wordsContext)_localctx).T_FIELDS = match(T_FIELDS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FIELDS!=null?((Non_reserved_wordsContext)_localctx).T_FIELDS.getText():null); 
				}
				break;
			case T_FILE:
				enterOuterAlt(_localctx, 97);
				{
				setState(3376);
				((Non_reserved_wordsContext)_localctx).T_FILE = match(T_FILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FILE!=null?((Non_reserved_wordsContext)_localctx).T_FILE.getText():null); 
				}
				break;
			case T_FILES:
				enterOuterAlt(_localctx, 98);
				{
				setState(3378);
				((Non_reserved_wordsContext)_localctx).T_FILES = match(T_FILES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FILES!=null?((Non_reserved_wordsContext)_localctx).T_FILES.getText():null); 
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 99);
				{
				setState(3380);
				((Non_reserved_wordsContext)_localctx).T_FIRST_VALUE = match(T_FIRST_VALUE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FIRST_VALUE!=null?((Non_reserved_wordsContext)_localctx).T_FIRST_VALUE.getText():null); 
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 100);
				{
				setState(3382);
				((Non_reserved_wordsContext)_localctx).T_FLOAT = match(T_FLOAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FLOAT!=null?((Non_reserved_wordsContext)_localctx).T_FLOAT.getText():null); 
				}
				break;
			case T_FOR:
				enterOuterAlt(_localctx, 101);
				{
				setState(3384);
				((Non_reserved_wordsContext)_localctx).T_FOR = match(T_FOR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FOR!=null?((Non_reserved_wordsContext)_localctx).T_FOR.getText():null); 
				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 102);
				{
				setState(3386);
				((Non_reserved_wordsContext)_localctx).T_FOREIGN = match(T_FOREIGN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FOREIGN!=null?((Non_reserved_wordsContext)_localctx).T_FOREIGN.getText():null); 
				}
				break;
			case T_FORMAT:
				enterOuterAlt(_localctx, 103);
				{
				setState(3388);
				((Non_reserved_wordsContext)_localctx).T_FORMAT = match(T_FORMAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FORMAT!=null?((Non_reserved_wordsContext)_localctx).T_FORMAT.getText():null); 
				}
				break;
			case T_FOUND:
				enterOuterAlt(_localctx, 104);
				{
				setState(3390);
				((Non_reserved_wordsContext)_localctx).T_FOUND = match(T_FOUND);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FOUND!=null?((Non_reserved_wordsContext)_localctx).T_FOUND.getText():null); 
				}
				break;
			case T_FROM:
				enterOuterAlt(_localctx, 105);
				{
				setState(3392);
				((Non_reserved_wordsContext)_localctx).T_FROM = match(T_FROM);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FROM!=null?((Non_reserved_wordsContext)_localctx).T_FROM.getText():null); 
				}
				break;
			case T_FULL:
				enterOuterAlt(_localctx, 106);
				{
				setState(3394);
				((Non_reserved_wordsContext)_localctx).T_FULL = match(T_FULL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FULL!=null?((Non_reserved_wordsContext)_localctx).T_FULL.getText():null); 
				}
				break;
			case T_FUNCTION:
				enterOuterAlt(_localctx, 107);
				{
				setState(3396);
				((Non_reserved_wordsContext)_localctx).T_FUNCTION = match(T_FUNCTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FUNCTION!=null?((Non_reserved_wordsContext)_localctx).T_FUNCTION.getText():null); 
				}
				break;
			case T_GET:
				enterOuterAlt(_localctx, 108);
				{
				setState(3398);
				((Non_reserved_wordsContext)_localctx).T_GET = match(T_GET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_GET!=null?((Non_reserved_wordsContext)_localctx).T_GET.getText():null); 
				}
				break;
			case T_GLOBAL:
				enterOuterAlt(_localctx, 109);
				{
				setState(3400);
				((Non_reserved_wordsContext)_localctx).T_GLOBAL = match(T_GLOBAL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_GLOBAL!=null?((Non_reserved_wordsContext)_localctx).T_GLOBAL.getText():null); 
				}
				break;
			case T_GO:
				enterOuterAlt(_localctx, 110);
				{
				setState(3402);
				((Non_reserved_wordsContext)_localctx).T_GO = match(T_GO);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_GO!=null?((Non_reserved_wordsContext)_localctx).T_GO.getText():null); 
				}
				break;
			case T_GRANT:
				enterOuterAlt(_localctx, 111);
				{
				setState(3404);
				((Non_reserved_wordsContext)_localctx).T_GRANT = match(T_GRANT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_GRANT!=null?((Non_reserved_wordsContext)_localctx).T_GRANT.getText():null); 
				}
				break;
			case T_GROUP:
				enterOuterAlt(_localctx, 112);
				{
				setState(3406);
				((Non_reserved_wordsContext)_localctx).T_GROUP = match(T_GROUP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_GROUP!=null?((Non_reserved_wordsContext)_localctx).T_GROUP.getText():null); 
				}
				break;
			case T_HANDLER:
				enterOuterAlt(_localctx, 113);
				{
				setState(3408);
				((Non_reserved_wordsContext)_localctx).T_HANDLER = match(T_HANDLER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HANDLER!=null?((Non_reserved_wordsContext)_localctx).T_HANDLER.getText():null); 
				}
				break;
			case T_HASH:
				enterOuterAlt(_localctx, 114);
				{
				setState(3410);
				((Non_reserved_wordsContext)_localctx).T_HASH = match(T_HASH);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HASH!=null?((Non_reserved_wordsContext)_localctx).T_HASH.getText():null); 
				}
				break;
			case T_HAVING:
				enterOuterAlt(_localctx, 115);
				{
				setState(3412);
				((Non_reserved_wordsContext)_localctx).T_HAVING = match(T_HAVING);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HAVING!=null?((Non_reserved_wordsContext)_localctx).T_HAVING.getText():null); 
				}
				break;
			case T_HDFS:
				enterOuterAlt(_localctx, 116);
				{
				setState(3414);
				((Non_reserved_wordsContext)_localctx).T_HDFS = match(T_HDFS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HDFS!=null?((Non_reserved_wordsContext)_localctx).T_HDFS.getText():null); 
				}
				break;
			case T_HOST:
				enterOuterAlt(_localctx, 117);
				{
				setState(3416);
				((Non_reserved_wordsContext)_localctx).T_HOST = match(T_HOST);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HOST!=null?((Non_reserved_wordsContext)_localctx).T_HOST.getText():null); 
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 118);
				{
				setState(3418);
				((Non_reserved_wordsContext)_localctx).T_IDENTITY = match(T_IDENTITY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_IDENTITY!=null?((Non_reserved_wordsContext)_localctx).T_IDENTITY.getText():null); 
				}
				break;
			case T_IF:
				enterOuterAlt(_localctx, 119);
				{
				setState(3420);
				((Non_reserved_wordsContext)_localctx).T_IF = match(T_IF);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_IF!=null?((Non_reserved_wordsContext)_localctx).T_IF.getText():null); 
				}
				break;
			case T_IGNORE:
				enterOuterAlt(_localctx, 120);
				{
				setState(3422);
				((Non_reserved_wordsContext)_localctx).T_IGNORE = match(T_IGNORE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_IGNORE!=null?((Non_reserved_wordsContext)_localctx).T_IGNORE.getText():null); 
				}
				break;
			case T_IMMEDIATE:
				enterOuterAlt(_localctx, 121);
				{
				setState(3424);
				((Non_reserved_wordsContext)_localctx).T_IMMEDIATE = match(T_IMMEDIATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_IMMEDIATE!=null?((Non_reserved_wordsContext)_localctx).T_IMMEDIATE.getText():null); 
				}
				break;
			case T_IN:
				enterOuterAlt(_localctx, 122);
				{
				setState(3426);
				((Non_reserved_wordsContext)_localctx).T_IN = match(T_IN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_IN!=null?((Non_reserved_wordsContext)_localctx).T_IN.getText():null); 
				}
				break;
			case T_INCLUDE:
				enterOuterAlt(_localctx, 123);
				{
				setState(3428);
				((Non_reserved_wordsContext)_localctx).T_INCLUDE = match(T_INCLUDE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INCLUDE!=null?((Non_reserved_wordsContext)_localctx).T_INCLUDE.getText():null); 
				}
				break;
			case T_INDEX:
				enterOuterAlt(_localctx, 124);
				{
				setState(3430);
				((Non_reserved_wordsContext)_localctx).T_INDEX = match(T_INDEX);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INDEX!=null?((Non_reserved_wordsContext)_localctx).T_INDEX.getText():null); 
				}
				break;
			case T_INITRANS:
				enterOuterAlt(_localctx, 125);
				{
				setState(3432);
				((Non_reserved_wordsContext)_localctx).T_INITRANS = match(T_INITRANS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INITRANS!=null?((Non_reserved_wordsContext)_localctx).T_INITRANS.getText():null); 
				}
				break;
			case T_INNER:
				enterOuterAlt(_localctx, 126);
				{
				setState(3434);
				((Non_reserved_wordsContext)_localctx).T_INNER = match(T_INNER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INNER!=null?((Non_reserved_wordsContext)_localctx).T_INNER.getText():null); 
				}
				break;
			case T_INOUT:
				enterOuterAlt(_localctx, 127);
				{
				setState(3436);
				((Non_reserved_wordsContext)_localctx).T_INOUT = match(T_INOUT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INOUT!=null?((Non_reserved_wordsContext)_localctx).T_INOUT.getText():null); 
				}
				break;
			case T_INSERT:
				enterOuterAlt(_localctx, 128);
				{
				setState(3438);
				((Non_reserved_wordsContext)_localctx).T_INSERT = match(T_INSERT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INSERT!=null?((Non_reserved_wordsContext)_localctx).T_INSERT.getText():null); 
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 129);
				{
				setState(3440);
				((Non_reserved_wordsContext)_localctx).T_INT = match(T_INT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INT!=null?((Non_reserved_wordsContext)_localctx).T_INT.getText():null); 
				}
				break;
			case T_INT2:
				enterOuterAlt(_localctx, 130);
				{
				setState(3442);
				((Non_reserved_wordsContext)_localctx).T_INT2 = match(T_INT2);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INT2!=null?((Non_reserved_wordsContext)_localctx).T_INT2.getText():null); 
				}
				break;
			case T_INT4:
				enterOuterAlt(_localctx, 131);
				{
				setState(3444);
				((Non_reserved_wordsContext)_localctx).T_INT4 = match(T_INT4);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INT4!=null?((Non_reserved_wordsContext)_localctx).T_INT4.getText():null); 
				}
				break;
			case T_INT8:
				enterOuterAlt(_localctx, 132);
				{
				setState(3446);
				((Non_reserved_wordsContext)_localctx).T_INT8 = match(T_INT8);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INT8!=null?((Non_reserved_wordsContext)_localctx).T_INT8.getText():null); 
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 133);
				{
				setState(3448);
				((Non_reserved_wordsContext)_localctx).T_INTEGER = match(T_INTEGER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INTEGER!=null?((Non_reserved_wordsContext)_localctx).T_INTEGER.getText():null); 
				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 134);
				{
				setState(3450);
				((Non_reserved_wordsContext)_localctx).T_INTERSECT = match(T_INTERSECT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INTERSECT!=null?((Non_reserved_wordsContext)_localctx).T_INTERSECT.getText():null); 
				}
				break;
			case T_INTERVAL:
				enterOuterAlt(_localctx, 135);
				{
				setState(3452);
				((Non_reserved_wordsContext)_localctx).T_INTERVAL = match(T_INTERVAL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INTERVAL!=null?((Non_reserved_wordsContext)_localctx).T_INTERVAL.getText():null); 
				}
				break;
			case T_INTO:
				enterOuterAlt(_localctx, 136);
				{
				setState(3454);
				((Non_reserved_wordsContext)_localctx).T_INTO = match(T_INTO);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INTO!=null?((Non_reserved_wordsContext)_localctx).T_INTO.getText():null); 
				}
				break;
			case T_INVOKER:
				enterOuterAlt(_localctx, 137);
				{
				setState(3456);
				((Non_reserved_wordsContext)_localctx).T_INVOKER = match(T_INVOKER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INVOKER!=null?((Non_reserved_wordsContext)_localctx).T_INVOKER.getText():null); 
				}
				break;
			case T_ITEMS:
				enterOuterAlt(_localctx, 138);
				{
				setState(3458);
				((Non_reserved_wordsContext)_localctx).T_ITEMS = match(T_ITEMS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ITEMS!=null?((Non_reserved_wordsContext)_localctx).T_ITEMS.getText():null); 
				}
				break;
			case T_IS:
				enterOuterAlt(_localctx, 139);
				{
				setState(3460);
				((Non_reserved_wordsContext)_localctx).T_IS = match(T_IS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_IS!=null?((Non_reserved_wordsContext)_localctx).T_IS.getText():null); 
				}
				break;
			case T_ISOPEN:
				enterOuterAlt(_localctx, 140);
				{
				setState(3462);
				((Non_reserved_wordsContext)_localctx).T_ISOPEN = match(T_ISOPEN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ISOPEN!=null?((Non_reserved_wordsContext)_localctx).T_ISOPEN.getText():null); 
				}
				break;
			case T_JOIN:
				enterOuterAlt(_localctx, 141);
				{
				setState(3464);
				((Non_reserved_wordsContext)_localctx).T_JOIN = match(T_JOIN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_JOIN!=null?((Non_reserved_wordsContext)_localctx).T_JOIN.getText():null); 
				}
				break;
			case T_KEEP:
				enterOuterAlt(_localctx, 142);
				{
				setState(3466);
				((Non_reserved_wordsContext)_localctx).T_KEEP = match(T_KEEP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_KEEP!=null?((Non_reserved_wordsContext)_localctx).T_KEEP.getText():null); 
				}
				break;
			case T_KEY:
				enterOuterAlt(_localctx, 143);
				{
				setState(3468);
				((Non_reserved_wordsContext)_localctx).T_KEY = match(T_KEY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_KEY!=null?((Non_reserved_wordsContext)_localctx).T_KEY.getText():null); 
				}
				break;
			case T_KEYS:
				enterOuterAlt(_localctx, 144);
				{
				setState(3470);
				((Non_reserved_wordsContext)_localctx).T_KEYS = match(T_KEYS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_KEYS!=null?((Non_reserved_wordsContext)_localctx).T_KEYS.getText():null); 
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 145);
				{
				setState(3472);
				((Non_reserved_wordsContext)_localctx).T_LAG = match(T_LAG);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LAG!=null?((Non_reserved_wordsContext)_localctx).T_LAG.getText():null); 
				}
				break;
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 146);
				{
				setState(3474);
				((Non_reserved_wordsContext)_localctx).T_LANGUAGE = match(T_LANGUAGE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LANGUAGE!=null?((Non_reserved_wordsContext)_localctx).T_LANGUAGE.getText():null); 
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 147);
				{
				setState(3476);
				((Non_reserved_wordsContext)_localctx).T_LAST_VALUE = match(T_LAST_VALUE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LAST_VALUE!=null?((Non_reserved_wordsContext)_localctx).T_LAST_VALUE.getText():null); 
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 148);
				{
				setState(3478);
				((Non_reserved_wordsContext)_localctx).T_LEAD = match(T_LEAD);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LEAD!=null?((Non_reserved_wordsContext)_localctx).T_LEAD.getText():null); 
				}
				break;
			case T_LEAVE:
				enterOuterAlt(_localctx, 149);
				{
				setState(3480);
				((Non_reserved_wordsContext)_localctx).T_LEAVE = match(T_LEAVE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LEAVE!=null?((Non_reserved_wordsContext)_localctx).T_LEAVE.getText():null); 
				}
				break;
			case T_LEFT:
				enterOuterAlt(_localctx, 150);
				{
				setState(3482);
				((Non_reserved_wordsContext)_localctx).T_LEFT = match(T_LEFT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LEFT!=null?((Non_reserved_wordsContext)_localctx).T_LEFT.getText():null); 
				}
				break;
			case T_LIKE:
				enterOuterAlt(_localctx, 151);
				{
				setState(3484);
				((Non_reserved_wordsContext)_localctx).T_LIKE = match(T_LIKE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LIKE!=null?((Non_reserved_wordsContext)_localctx).T_LIKE.getText():null); 
				}
				break;
			case T_LIMIT:
				enterOuterAlt(_localctx, 152);
				{
				setState(3486);
				((Non_reserved_wordsContext)_localctx).T_LIMIT = match(T_LIMIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LIMIT!=null?((Non_reserved_wordsContext)_localctx).T_LIMIT.getText():null); 
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 153);
				{
				setState(3488);
				((Non_reserved_wordsContext)_localctx).T_LINES = match(T_LINES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LINES!=null?((Non_reserved_wordsContext)_localctx).T_LINES.getText():null); 
				}
				break;
			case T_LOCAL:
				enterOuterAlt(_localctx, 154);
				{
				setState(3490);
				((Non_reserved_wordsContext)_localctx).T_LOCAL = match(T_LOCAL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOCAL!=null?((Non_reserved_wordsContext)_localctx).T_LOCAL.getText():null); 
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 155);
				{
				setState(3492);
				((Non_reserved_wordsContext)_localctx).T_LOCATION = match(T_LOCATION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOCATION!=null?((Non_reserved_wordsContext)_localctx).T_LOCATION.getText():null); 
				}
				break;
			case T_LOCATOR:
				enterOuterAlt(_localctx, 156);
				{
				setState(3494);
				((Non_reserved_wordsContext)_localctx).T_LOCATOR = match(T_LOCATOR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOCATOR!=null?((Non_reserved_wordsContext)_localctx).T_LOCATOR.getText():null); 
				}
				break;
			case T_LOCATORS:
				enterOuterAlt(_localctx, 157);
				{
				setState(3496);
				((Non_reserved_wordsContext)_localctx).T_LOCATORS = match(T_LOCATORS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOCATORS!=null?((Non_reserved_wordsContext)_localctx).T_LOCATORS.getText():null); 
				}
				break;
			case T_LOCKS:
				enterOuterAlt(_localctx, 158);
				{
				setState(3498);
				((Non_reserved_wordsContext)_localctx).T_LOCKS = match(T_LOCKS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOCKS!=null?((Non_reserved_wordsContext)_localctx).T_LOCKS.getText():null); 
				}
				break;
			case T_LOG:
				enterOuterAlt(_localctx, 159);
				{
				setState(3500);
				((Non_reserved_wordsContext)_localctx).T_LOG = match(T_LOG);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOG!=null?((Non_reserved_wordsContext)_localctx).T_LOG.getText():null); 
				}
				break;
			case T_LOGGED:
				enterOuterAlt(_localctx, 160);
				{
				setState(3502);
				((Non_reserved_wordsContext)_localctx).T_LOGGED = match(T_LOGGED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOGGED!=null?((Non_reserved_wordsContext)_localctx).T_LOGGED.getText():null); 
				}
				break;
			case T_LOGGING:
				enterOuterAlt(_localctx, 161);
				{
				setState(3504);
				((Non_reserved_wordsContext)_localctx).T_LOGGING = match(T_LOGGING);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOGGING!=null?((Non_reserved_wordsContext)_localctx).T_LOGGING.getText():null); 
				}
				break;
			case T_LOOP:
				enterOuterAlt(_localctx, 162);
				{
				setState(3506);
				((Non_reserved_wordsContext)_localctx).T_LOOP = match(T_LOOP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOOP!=null?((Non_reserved_wordsContext)_localctx).T_LOOP.getText():null); 
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 163);
				{
				setState(3508);
				((Non_reserved_wordsContext)_localctx).T_MAP = match(T_MAP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MAP!=null?((Non_reserved_wordsContext)_localctx).T_MAP.getText():null); 
				}
				break;
			case T_MATCHED:
				enterOuterAlt(_localctx, 164);
				{
				setState(3510);
				((Non_reserved_wordsContext)_localctx).T_MATCHED = match(T_MATCHED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MATCHED!=null?((Non_reserved_wordsContext)_localctx).T_MATCHED.getText():null); 
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 165);
				{
				setState(3512);
				((Non_reserved_wordsContext)_localctx).T_MAX = match(T_MAX);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MAX!=null?((Non_reserved_wordsContext)_localctx).T_MAX.getText():null); 
				}
				break;
			case T_MAXTRANS:
				enterOuterAlt(_localctx, 166);
				{
				setState(3514);
				((Non_reserved_wordsContext)_localctx).T_MAXTRANS = match(T_MAXTRANS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MAXTRANS!=null?((Non_reserved_wordsContext)_localctx).T_MAXTRANS.getText():null); 
				}
				break;
			case T_MERGE:
				enterOuterAlt(_localctx, 167);
				{
				setState(3516);
				((Non_reserved_wordsContext)_localctx).T_MERGE = match(T_MERGE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MERGE!=null?((Non_reserved_wordsContext)_localctx).T_MERGE.getText():null); 
				}
				break;
			case T_MESSAGE_TEXT:
				enterOuterAlt(_localctx, 168);
				{
				setState(3518);
				((Non_reserved_wordsContext)_localctx).T_MESSAGE_TEXT = match(T_MESSAGE_TEXT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MESSAGE_TEXT!=null?((Non_reserved_wordsContext)_localctx).T_MESSAGE_TEXT.getText():null); 
				}
				break;
			case T_MICROSECOND:
				enterOuterAlt(_localctx, 169);
				{
				setState(3520);
				((Non_reserved_wordsContext)_localctx).T_MICROSECOND = match(T_MICROSECOND);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MICROSECOND!=null?((Non_reserved_wordsContext)_localctx).T_MICROSECOND.getText():null); 
				}
				break;
			case T_MICROSECONDS:
				enterOuterAlt(_localctx, 170);
				{
				setState(3522);
				((Non_reserved_wordsContext)_localctx).T_MICROSECONDS = match(T_MICROSECONDS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MICROSECONDS!=null?((Non_reserved_wordsContext)_localctx).T_MICROSECONDS.getText():null); 
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 171);
				{
				setState(3524);
				((Non_reserved_wordsContext)_localctx).T_MIN = match(T_MIN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MIN!=null?((Non_reserved_wordsContext)_localctx).T_MIN.getText():null); 
				}
				break;
			case T_MULTISET:
				enterOuterAlt(_localctx, 172);
				{
				setState(3526);
				((Non_reserved_wordsContext)_localctx).T_MULTISET = match(T_MULTISET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MULTISET!=null?((Non_reserved_wordsContext)_localctx).T_MULTISET.getText():null); 
				}
				break;
			case T_NCHAR:
				enterOuterAlt(_localctx, 173);
				{
				setState(3528);
				((Non_reserved_wordsContext)_localctx).T_NCHAR = match(T_NCHAR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NCHAR!=null?((Non_reserved_wordsContext)_localctx).T_NCHAR.getText():null); 
				}
				break;
			case T_NEW:
				enterOuterAlt(_localctx, 174);
				{
				setState(3530);
				((Non_reserved_wordsContext)_localctx).T_NEW = match(T_NEW);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NEW!=null?((Non_reserved_wordsContext)_localctx).T_NEW.getText():null); 
				}
				break;
			case T_NVARCHAR:
				enterOuterAlt(_localctx, 175);
				{
				setState(3532);
				((Non_reserved_wordsContext)_localctx).T_NVARCHAR = match(T_NVARCHAR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NVARCHAR!=null?((Non_reserved_wordsContext)_localctx).T_NVARCHAR.getText():null); 
				}
				break;
			case T_NO:
				enterOuterAlt(_localctx, 176);
				{
				setState(3534);
				((Non_reserved_wordsContext)_localctx).T_NO = match(T_NO);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NO!=null?((Non_reserved_wordsContext)_localctx).T_NO.getText():null); 
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 177);
				{
				setState(3536);
				((Non_reserved_wordsContext)_localctx).T_NOCOMPRESS = match(T_NOCOMPRESS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NOCOMPRESS!=null?((Non_reserved_wordsContext)_localctx).T_NOCOMPRESS.getText():null); 
				}
				break;
			case T_NOCOUNT:
				enterOuterAlt(_localctx, 178);
				{
				setState(3538);
				((Non_reserved_wordsContext)_localctx).T_NOCOUNT = match(T_NOCOUNT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NOCOUNT!=null?((Non_reserved_wordsContext)_localctx).T_NOCOUNT.getText():null); 
				}
				break;
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 179);
				{
				setState(3540);
				((Non_reserved_wordsContext)_localctx).T_NOLOGGING = match(T_NOLOGGING);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NOLOGGING!=null?((Non_reserved_wordsContext)_localctx).T_NOLOGGING.getText():null); 
				}
				break;
			case T_NONE:
				enterOuterAlt(_localctx, 180);
				{
				setState(3542);
				((Non_reserved_wordsContext)_localctx).T_NONE = match(T_NONE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NONE!=null?((Non_reserved_wordsContext)_localctx).T_NONE.getText():null); 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 181);
				{
				setState(3544);
				((Non_reserved_wordsContext)_localctx).T_NOT = match(T_NOT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NOT!=null?((Non_reserved_wordsContext)_localctx).T_NOT.getText():null); 
				}
				break;
			case T_NOTFOUND:
				enterOuterAlt(_localctx, 182);
				{
				setState(3546);
				((Non_reserved_wordsContext)_localctx).T_NOTFOUND = match(T_NOTFOUND);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NOTFOUND!=null?((Non_reserved_wordsContext)_localctx).T_NOTFOUND.getText():null); 
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 183);
				{
				setState(3548);
				((Non_reserved_wordsContext)_localctx).T_NUMERIC = match(T_NUMERIC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NUMERIC!=null?((Non_reserved_wordsContext)_localctx).T_NUMERIC.getText():null); 
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 184);
				{
				setState(3550);
				((Non_reserved_wordsContext)_localctx).T_NUMBER = match(T_NUMBER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NUMBER!=null?((Non_reserved_wordsContext)_localctx).T_NUMBER.getText():null); 
				}
				break;
			case T_OBJECT:
				enterOuterAlt(_localctx, 185);
				{
				setState(3552);
				((Non_reserved_wordsContext)_localctx).T_OBJECT = match(T_OBJECT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OBJECT!=null?((Non_reserved_wordsContext)_localctx).T_OBJECT.getText():null); 
				}
				break;
			case T_OFF:
				enterOuterAlt(_localctx, 186);
				{
				setState(3554);
				((Non_reserved_wordsContext)_localctx).T_OFF = match(T_OFF);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OFF!=null?((Non_reserved_wordsContext)_localctx).T_OFF.getText():null); 
				}
				break;
			case T_ON:
				enterOuterAlt(_localctx, 187);
				{
				setState(3556);
				((Non_reserved_wordsContext)_localctx).T_ON = match(T_ON);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ON!=null?((Non_reserved_wordsContext)_localctx).T_ON.getText():null); 
				}
				break;
			case T_ONLY:
				enterOuterAlt(_localctx, 188);
				{
				setState(3558);
				((Non_reserved_wordsContext)_localctx).T_ONLY = match(T_ONLY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ONLY!=null?((Non_reserved_wordsContext)_localctx).T_ONLY.getText():null); 
				}
				break;
			case T_OPEN:
				enterOuterAlt(_localctx, 189);
				{
				setState(3560);
				((Non_reserved_wordsContext)_localctx).T_OPEN = match(T_OPEN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OPEN!=null?((Non_reserved_wordsContext)_localctx).T_OPEN.getText():null); 
				}
				break;
			case T_OR:
				enterOuterAlt(_localctx, 190);
				{
				setState(3562);
				((Non_reserved_wordsContext)_localctx).T_OR = match(T_OR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OR!=null?((Non_reserved_wordsContext)_localctx).T_OR.getText():null); 
				}
				break;
			case T_ORDER:
				enterOuterAlt(_localctx, 191);
				{
				setState(3564);
				((Non_reserved_wordsContext)_localctx).T_ORDER = match(T_ORDER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ORDER!=null?((Non_reserved_wordsContext)_localctx).T_ORDER.getText():null); 
				}
				break;
			case T_OUT:
				enterOuterAlt(_localctx, 192);
				{
				setState(3566);
				((Non_reserved_wordsContext)_localctx).T_OUT = match(T_OUT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OUT!=null?((Non_reserved_wordsContext)_localctx).T_OUT.getText():null); 
				}
				break;
			case T_OUTER:
				enterOuterAlt(_localctx, 193);
				{
				setState(3568);
				((Non_reserved_wordsContext)_localctx).T_OUTER = match(T_OUTER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OUTER!=null?((Non_reserved_wordsContext)_localctx).T_OUTER.getText():null); 
				}
				break;
			case T_OVER:
				enterOuterAlt(_localctx, 194);
				{
				setState(3570);
				((Non_reserved_wordsContext)_localctx).T_OVER = match(T_OVER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OVER!=null?((Non_reserved_wordsContext)_localctx).T_OVER.getText():null); 
				}
				break;
			case T_OVERWRITE:
				enterOuterAlt(_localctx, 195);
				{
				setState(3572);
				((Non_reserved_wordsContext)_localctx).T_OVERWRITE = match(T_OVERWRITE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OVERWRITE!=null?((Non_reserved_wordsContext)_localctx).T_OVERWRITE.getText():null); 
				}
				break;
			case T_OWNER:
				enterOuterAlt(_localctx, 196);
				{
				setState(3574);
				((Non_reserved_wordsContext)_localctx).T_OWNER = match(T_OWNER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OWNER!=null?((Non_reserved_wordsContext)_localctx).T_OWNER.getText():null); 
				}
				break;
			case T_PACKAGE:
				enterOuterAlt(_localctx, 197);
				{
				setState(3576);
				((Non_reserved_wordsContext)_localctx).T_PACKAGE = match(T_PACKAGE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PACKAGE!=null?((Non_reserved_wordsContext)_localctx).T_PACKAGE.getText():null); 
				}
				break;
			case T_PART_COUNT:
				enterOuterAlt(_localctx, 198);
				{
				setState(3578);
				((Non_reserved_wordsContext)_localctx).T_PART_COUNT = match(T_PART_COUNT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PART_COUNT!=null?((Non_reserved_wordsContext)_localctx).T_PART_COUNT.getText():null); 
				}
				break;
			case T_PART_LOC:
				enterOuterAlt(_localctx, 199);
				{
				setState(3580);
				((Non_reserved_wordsContext)_localctx).T_PART_LOC = match(T_PART_LOC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PART_LOC!=null?((Non_reserved_wordsContext)_localctx).T_PART_LOC.getText():null); 
				}
				break;
			case T_PARTITION:
				enterOuterAlt(_localctx, 200);
				{
				setState(3582);
				((Non_reserved_wordsContext)_localctx).T_PARTITION = match(T_PARTITION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PARTITION!=null?((Non_reserved_wordsContext)_localctx).T_PARTITION.getText():null); 
				}
				break;
			case T_PCTFREE:
				enterOuterAlt(_localctx, 201);
				{
				setState(3584);
				((Non_reserved_wordsContext)_localctx).T_PCTFREE = match(T_PCTFREE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PCTFREE!=null?((Non_reserved_wordsContext)_localctx).T_PCTFREE.getText():null); 
				}
				break;
			case T_PCTUSED:
				enterOuterAlt(_localctx, 202);
				{
				setState(3586);
				((Non_reserved_wordsContext)_localctx).T_PCTUSED = match(T_PCTUSED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PCTUSED!=null?((Non_reserved_wordsContext)_localctx).T_PCTUSED.getText():null); 
				}
				break;
			case T_PRECISION:
				enterOuterAlt(_localctx, 203);
				{
				setState(3588);
				((Non_reserved_wordsContext)_localctx).T_PRECISION = match(T_PRECISION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PRECISION!=null?((Non_reserved_wordsContext)_localctx).T_PRECISION.getText():null); 
				}
				break;
			case T_PRESERVE:
				enterOuterAlt(_localctx, 204);
				{
				setState(3590);
				((Non_reserved_wordsContext)_localctx).T_PRESERVE = match(T_PRESERVE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PRESERVE!=null?((Non_reserved_wordsContext)_localctx).T_PRESERVE.getText():null); 
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 205);
				{
				setState(3592);
				((Non_reserved_wordsContext)_localctx).T_PRIMARY = match(T_PRIMARY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PRIMARY!=null?((Non_reserved_wordsContext)_localctx).T_PRIMARY.getText():null); 
				}
				break;
			case T_PROC:
				enterOuterAlt(_localctx, 206);
				{
				setState(3594);
				((Non_reserved_wordsContext)_localctx).T_PROC = match(T_PROC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PROC!=null?((Non_reserved_wordsContext)_localctx).T_PROC.getText():null); 
				}
				break;
			case T_PROCEDURE:
				enterOuterAlt(_localctx, 207);
				{
				setState(3596);
				((Non_reserved_wordsContext)_localctx).T_PROCEDURE = match(T_PROCEDURE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PROCEDURE!=null?((Non_reserved_wordsContext)_localctx).T_PROCEDURE.getText():null); 
				}
				break;
			case T_PWD:
				enterOuterAlt(_localctx, 208);
				{
				setState(3598);
				((Non_reserved_wordsContext)_localctx).T_PWD = match(T_PWD);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PWD!=null?((Non_reserved_wordsContext)_localctx).T_PWD.getText():null); 
				}
				break;
			case T_QUALIFY:
				enterOuterAlt(_localctx, 209);
				{
				setState(3600);
				((Non_reserved_wordsContext)_localctx).T_QUALIFY = match(T_QUALIFY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_QUALIFY!=null?((Non_reserved_wordsContext)_localctx).T_QUALIFY.getText():null); 
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 210);
				{
				setState(3602);
				((Non_reserved_wordsContext)_localctx).T_QUERY_BAND = match(T_QUERY_BAND);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_QUERY_BAND!=null?((Non_reserved_wordsContext)_localctx).T_QUERY_BAND.getText():null); 
				}
				break;
			case T_QUIT:
				enterOuterAlt(_localctx, 211);
				{
				setState(3604);
				((Non_reserved_wordsContext)_localctx).T_QUIT = match(T_QUIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_QUIT!=null?((Non_reserved_wordsContext)_localctx).T_QUIT.getText():null); 
				}
				break;
			case T_RAISE:
				enterOuterAlt(_localctx, 212);
				{
				setState(3606);
				((Non_reserved_wordsContext)_localctx).T_RAISE = match(T_RAISE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RAISE!=null?((Non_reserved_wordsContext)_localctx).T_RAISE.getText():null); 
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 213);
				{
				setState(3608);
				((Non_reserved_wordsContext)_localctx).T_RANK = match(T_RANK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RANK!=null?((Non_reserved_wordsContext)_localctx).T_RANK.getText():null); 
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 214);
				{
				setState(3610);
				((Non_reserved_wordsContext)_localctx).T_REAL = match(T_REAL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REAL!=null?((Non_reserved_wordsContext)_localctx).T_REAL.getText():null); 
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 215);
				{
				setState(3612);
				((Non_reserved_wordsContext)_localctx).T_REFERENCES = match(T_REFERENCES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REFERENCES!=null?((Non_reserved_wordsContext)_localctx).T_REFERENCES.getText():null); 
				}
				break;
			case T_REGEXP:
				enterOuterAlt(_localctx, 216);
				{
				setState(3614);
				((Non_reserved_wordsContext)_localctx).T_REGEXP = match(T_REGEXP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REGEXP!=null?((Non_reserved_wordsContext)_localctx).T_REGEXP.getText():null); 
				}
				break;
			case T_RR:
				enterOuterAlt(_localctx, 217);
				{
				setState(3616);
				((Non_reserved_wordsContext)_localctx).T_RR = match(T_RR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RR!=null?((Non_reserved_wordsContext)_localctx).T_RR.getText():null); 
				}
				break;
			case T_REPLACE:
				enterOuterAlt(_localctx, 218);
				{
				setState(3618);
				((Non_reserved_wordsContext)_localctx).T_REPLACE = match(T_REPLACE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REPLACE!=null?((Non_reserved_wordsContext)_localctx).T_REPLACE.getText():null); 
				}
				break;
			case T_RESIGNAL:
				enterOuterAlt(_localctx, 219);
				{
				setState(3620);
				((Non_reserved_wordsContext)_localctx).T_RESIGNAL = match(T_RESIGNAL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RESIGNAL!=null?((Non_reserved_wordsContext)_localctx).T_RESIGNAL.getText():null); 
				}
				break;
			case T_RESTRICT:
				enterOuterAlt(_localctx, 220);
				{
				setState(3622);
				((Non_reserved_wordsContext)_localctx).T_RESTRICT = match(T_RESTRICT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RESTRICT!=null?((Non_reserved_wordsContext)_localctx).T_RESTRICT.getText():null); 
				}
				break;
			case T_RESULT:
				enterOuterAlt(_localctx, 221);
				{
				setState(3624);
				((Non_reserved_wordsContext)_localctx).T_RESULT = match(T_RESULT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RESULT!=null?((Non_reserved_wordsContext)_localctx).T_RESULT.getText():null); 
				}
				break;
			case T_RESULT_SET_LOCATOR:
				enterOuterAlt(_localctx, 222);
				{
				setState(3626);
				((Non_reserved_wordsContext)_localctx).T_RESULT_SET_LOCATOR = match(T_RESULT_SET_LOCATOR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RESULT_SET_LOCATOR!=null?((Non_reserved_wordsContext)_localctx).T_RESULT_SET_LOCATOR.getText():null); 
				}
				break;
			case T_RETURN:
				enterOuterAlt(_localctx, 223);
				{
				setState(3628);
				((Non_reserved_wordsContext)_localctx).T_RETURN = match(T_RETURN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RETURN!=null?((Non_reserved_wordsContext)_localctx).T_RETURN.getText():null); 
				}
				break;
			case T_RETURNS:
				enterOuterAlt(_localctx, 224);
				{
				setState(3630);
				((Non_reserved_wordsContext)_localctx).T_RETURNS = match(T_RETURNS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RETURNS!=null?((Non_reserved_wordsContext)_localctx).T_RETURNS.getText():null); 
				}
				break;
			case T_REVERSE:
				enterOuterAlt(_localctx, 225);
				{
				setState(3632);
				((Non_reserved_wordsContext)_localctx).T_REVERSE = match(T_REVERSE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REVERSE!=null?((Non_reserved_wordsContext)_localctx).T_REVERSE.getText():null); 
				}
				break;
			case T_RIGHT:
				enterOuterAlt(_localctx, 226);
				{
				setState(3634);
				((Non_reserved_wordsContext)_localctx).T_RIGHT = match(T_RIGHT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RIGHT!=null?((Non_reserved_wordsContext)_localctx).T_RIGHT.getText():null); 
				}
				break;
			case T_RLIKE:
				enterOuterAlt(_localctx, 227);
				{
				setState(3636);
				((Non_reserved_wordsContext)_localctx).T_RLIKE = match(T_RLIKE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RLIKE!=null?((Non_reserved_wordsContext)_localctx).T_RLIKE.getText():null); 
				}
				break;
			case T_RS:
				enterOuterAlt(_localctx, 228);
				{
				setState(3638);
				((Non_reserved_wordsContext)_localctx).T_RS = match(T_RS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RS!=null?((Non_reserved_wordsContext)_localctx).T_RS.getText():null); 
				}
				break;
			case T_ROLE:
				enterOuterAlt(_localctx, 229);
				{
				setState(3640);
				((Non_reserved_wordsContext)_localctx).T_ROLE = match(T_ROLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ROLE!=null?((Non_reserved_wordsContext)_localctx).T_ROLE.getText():null); 
				}
				break;
			case T_ROLLBACK:
				enterOuterAlt(_localctx, 230);
				{
				setState(3642);
				((Non_reserved_wordsContext)_localctx).T_ROLLBACK = match(T_ROLLBACK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ROLLBACK!=null?((Non_reserved_wordsContext)_localctx).T_ROLLBACK.getText():null); 
				}
				break;
			case T_ROW:
				enterOuterAlt(_localctx, 231);
				{
				setState(3644);
				((Non_reserved_wordsContext)_localctx).T_ROW = match(T_ROW);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ROW!=null?((Non_reserved_wordsContext)_localctx).T_ROW.getText():null); 
				}
				break;
			case T_ROWS:
				enterOuterAlt(_localctx, 232);
				{
				setState(3646);
				((Non_reserved_wordsContext)_localctx).T_ROWS = match(T_ROWS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ROWS!=null?((Non_reserved_wordsContext)_localctx).T_ROWS.getText():null); 
				}
				break;
			case T_ROW_COUNT:
				enterOuterAlt(_localctx, 233);
				{
				setState(3648);
				((Non_reserved_wordsContext)_localctx).T_ROW_COUNT = match(T_ROW_COUNT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ROW_COUNT!=null?((Non_reserved_wordsContext)_localctx).T_ROW_COUNT.getText():null); 
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 234);
				{
				setState(3650);
				((Non_reserved_wordsContext)_localctx).T_ROW_NUMBER = match(T_ROW_NUMBER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ROW_NUMBER!=null?((Non_reserved_wordsContext)_localctx).T_ROW_NUMBER.getText():null); 
				}
				break;
			case T_SCHEMA:
				enterOuterAlt(_localctx, 235);
				{
				setState(3652);
				((Non_reserved_wordsContext)_localctx).T_SCHEMA = match(T_SCHEMA);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SCHEMA!=null?((Non_reserved_wordsContext)_localctx).T_SCHEMA.getText():null); 
				}
				break;
			case T_SECOND:
				enterOuterAlt(_localctx, 236);
				{
				setState(3654);
				((Non_reserved_wordsContext)_localctx).T_SECOND = match(T_SECOND);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SECOND!=null?((Non_reserved_wordsContext)_localctx).T_SECOND.getText():null); 
				}
				break;
			case T_SECONDS:
				enterOuterAlt(_localctx, 237);
				{
				setState(3656);
				((Non_reserved_wordsContext)_localctx).T_SECONDS = match(T_SECONDS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SECONDS!=null?((Non_reserved_wordsContext)_localctx).T_SECONDS.getText():null); 
				}
				break;
			case T_SECURITY:
				enterOuterAlt(_localctx, 238);
				{
				setState(3658);
				((Non_reserved_wordsContext)_localctx).T_SECURITY = match(T_SECURITY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SECURITY!=null?((Non_reserved_wordsContext)_localctx).T_SECURITY.getText():null); 
				}
				break;
			case T_SEGMENT:
				enterOuterAlt(_localctx, 239);
				{
				setState(3660);
				((Non_reserved_wordsContext)_localctx).T_SEGMENT = match(T_SEGMENT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SEGMENT!=null?((Non_reserved_wordsContext)_localctx).T_SEGMENT.getText():null); 
				}
				break;
			case T_SEL:
				enterOuterAlt(_localctx, 240);
				{
				setState(3662);
				((Non_reserved_wordsContext)_localctx).T_SEL = match(T_SEL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SEL!=null?((Non_reserved_wordsContext)_localctx).T_SEL.getText():null); 
				}
				break;
			case T_SELECT:
				enterOuterAlt(_localctx, 241);
				{
				setState(3664);
				((Non_reserved_wordsContext)_localctx).T_SELECT = match(T_SELECT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SELECT!=null?((Non_reserved_wordsContext)_localctx).T_SELECT.getText():null); 
				}
				break;
			case T_SET:
				enterOuterAlt(_localctx, 242);
				{
				setState(3666);
				((Non_reserved_wordsContext)_localctx).T_SET = match(T_SET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SET!=null?((Non_reserved_wordsContext)_localctx).T_SET.getText():null); 
				}
				break;
			case T_SETS:
				enterOuterAlt(_localctx, 243);
				{
				setState(3668);
				((Non_reserved_wordsContext)_localctx).T_SETS = match(T_SETS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SETS!=null?((Non_reserved_wordsContext)_localctx).T_SETS.getText():null); 
				}
				break;
			case T_SIMPLE_DOUBLE:
				enterOuterAlt(_localctx, 244);
				{
				setState(3670);
				((Non_reserved_wordsContext)_localctx).T_SIMPLE_DOUBLE = match(T_SIMPLE_DOUBLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SIMPLE_DOUBLE!=null?((Non_reserved_wordsContext)_localctx).T_SIMPLE_DOUBLE.getText():null); 
				}
				break;
			case T_SIMPLE_FLOAT:
				enterOuterAlt(_localctx, 245);
				{
				setState(3672);
				((Non_reserved_wordsContext)_localctx).T_SIMPLE_FLOAT = match(T_SIMPLE_FLOAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SIMPLE_FLOAT!=null?((Non_reserved_wordsContext)_localctx).T_SIMPLE_FLOAT.getText():null); 
				}
				break;
			case T_SMALLDATETIME:
				enterOuterAlt(_localctx, 246);
				{
				setState(3674);
				((Non_reserved_wordsContext)_localctx).T_SMALLDATETIME = match(T_SMALLDATETIME);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SMALLDATETIME!=null?((Non_reserved_wordsContext)_localctx).T_SMALLDATETIME.getText():null); 
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 247);
				{
				setState(3676);
				((Non_reserved_wordsContext)_localctx).T_SMALLINT = match(T_SMALLINT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SMALLINT!=null?((Non_reserved_wordsContext)_localctx).T_SMALLINT.getText():null); 
				}
				break;
			case T_SPLIT:
				enterOuterAlt(_localctx, 248);
				{
				setState(3678);
				((Non_reserved_wordsContext)_localctx).T_SPLIT = match(T_SPLIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SPLIT!=null?((Non_reserved_wordsContext)_localctx).T_SPLIT.getText():null); 
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 249);
				{
				setState(3680);
				((Non_reserved_wordsContext)_localctx).T_SQL = match(T_SQL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SQL!=null?((Non_reserved_wordsContext)_localctx).T_SQL.getText():null); 
				}
				break;
			case T_SQLEXCEPTION:
				enterOuterAlt(_localctx, 250);
				{
				setState(3682);
				((Non_reserved_wordsContext)_localctx).T_SQLEXCEPTION = match(T_SQLEXCEPTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SQLEXCEPTION!=null?((Non_reserved_wordsContext)_localctx).T_SQLEXCEPTION.getText():null); 
				}
				break;
			case T_SQLINSERT:
				enterOuterAlt(_localctx, 251);
				{
				setState(3684);
				((Non_reserved_wordsContext)_localctx).T_SQLINSERT = match(T_SQLINSERT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SQLINSERT!=null?((Non_reserved_wordsContext)_localctx).T_SQLINSERT.getText():null); 
				}
				break;
			case T_SQLSTATE:
				enterOuterAlt(_localctx, 252);
				{
				setState(3686);
				((Non_reserved_wordsContext)_localctx).T_SQLSTATE = match(T_SQLSTATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SQLSTATE!=null?((Non_reserved_wordsContext)_localctx).T_SQLSTATE.getText():null); 
				}
				break;
			case T_SQLWARNING:
				enterOuterAlt(_localctx, 253);
				{
				setState(3688);
				((Non_reserved_wordsContext)_localctx).T_SQLWARNING = match(T_SQLWARNING);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SQLWARNING!=null?((Non_reserved_wordsContext)_localctx).T_SQLWARNING.getText():null); 
				}
				break;
			case T_STATS:
				enterOuterAlt(_localctx, 254);
				{
				setState(3690);
				((Non_reserved_wordsContext)_localctx).T_STATS = match(T_STATS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STATS!=null?((Non_reserved_wordsContext)_localctx).T_STATS.getText():null); 
				}
				break;
			case T_STATISTICS:
				enterOuterAlt(_localctx, 255);
				{
				setState(3692);
				((Non_reserved_wordsContext)_localctx).T_STATISTICS = match(T_STATISTICS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STATISTICS!=null?((Non_reserved_wordsContext)_localctx).T_STATISTICS.getText():null); 
				}
				break;
			case T_STEP:
				enterOuterAlt(_localctx, 256);
				{
				setState(3694);
				((Non_reserved_wordsContext)_localctx).T_STEP = match(T_STEP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STEP!=null?((Non_reserved_wordsContext)_localctx).T_STEP.getText():null); 
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 257);
				{
				setState(3696);
				((Non_reserved_wordsContext)_localctx).T_STDEV = match(T_STDEV);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STDEV!=null?((Non_reserved_wordsContext)_localctx).T_STDEV.getText():null); 
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 258);
				{
				setState(3698);
				((Non_reserved_wordsContext)_localctx).T_STORAGE = match(T_STORAGE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STORAGE!=null?((Non_reserved_wordsContext)_localctx).T_STORAGE.getText():null); 
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 259);
				{
				setState(3700);
				((Non_reserved_wordsContext)_localctx).T_STORED = match(T_STORED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STORED!=null?((Non_reserved_wordsContext)_localctx).T_STORED.getText():null); 
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 260);
				{
				setState(3702);
				((Non_reserved_wordsContext)_localctx).T_STRING = match(T_STRING);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STRING!=null?((Non_reserved_wordsContext)_localctx).T_STRING.getText():null); 
				}
				break;
			case T_SUBDIR:
				enterOuterAlt(_localctx, 261);
				{
				setState(3704);
				((Non_reserved_wordsContext)_localctx).T_SUBDIR = match(T_SUBDIR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SUBDIR!=null?((Non_reserved_wordsContext)_localctx).T_SUBDIR.getText():null); 
				}
				break;
			case T_SUBSTRING:
				enterOuterAlt(_localctx, 262);
				{
				setState(3706);
				((Non_reserved_wordsContext)_localctx).T_SUBSTRING = match(T_SUBSTRING);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SUBSTRING!=null?((Non_reserved_wordsContext)_localctx).T_SUBSTRING.getText():null); 
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 263);
				{
				setState(3708);
				((Non_reserved_wordsContext)_localctx).T_SUM = match(T_SUM);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SUM!=null?((Non_reserved_wordsContext)_localctx).T_SUM.getText():null); 
				}
				break;
			case T_SUMMARY:
				enterOuterAlt(_localctx, 264);
				{
				setState(3710);
				((Non_reserved_wordsContext)_localctx).T_SUMMARY = match(T_SUMMARY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SUMMARY!=null?((Non_reserved_wordsContext)_localctx).T_SUMMARY.getText():null); 
				}
				break;
			case T_SYSDATE:
				enterOuterAlt(_localctx, 265);
				{
				setState(3712);
				((Non_reserved_wordsContext)_localctx).T_SYSDATE = match(T_SYSDATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SYSDATE!=null?((Non_reserved_wordsContext)_localctx).T_SYSDATE.getText():null); 
				}
				break;
			case T_SYS_REFCURSOR:
				enterOuterAlt(_localctx, 266);
				{
				setState(3714);
				((Non_reserved_wordsContext)_localctx).T_SYS_REFCURSOR = match(T_SYS_REFCURSOR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SYS_REFCURSOR!=null?((Non_reserved_wordsContext)_localctx).T_SYS_REFCURSOR.getText():null); 
				}
				break;
			case T_TABLE:
				enterOuterAlt(_localctx, 267);
				{
				setState(3716);
				((Non_reserved_wordsContext)_localctx).T_TABLE = match(T_TABLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TABLE!=null?((Non_reserved_wordsContext)_localctx).T_TABLE.getText():null); 
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 268);
				{
				setState(3718);
				((Non_reserved_wordsContext)_localctx).T_TABLESPACE = match(T_TABLESPACE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TABLESPACE!=null?((Non_reserved_wordsContext)_localctx).T_TABLESPACE.getText():null); 
				}
				break;
			case T_TEMPORARY:
				enterOuterAlt(_localctx, 269);
				{
				setState(3720);
				((Non_reserved_wordsContext)_localctx).T_TEMPORARY = match(T_TEMPORARY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TEMPORARY!=null?((Non_reserved_wordsContext)_localctx).T_TEMPORARY.getText():null); 
				}
				break;
			case T_TERMINATED:
				enterOuterAlt(_localctx, 270);
				{
				setState(3722);
				((Non_reserved_wordsContext)_localctx).T_TERMINATED = match(T_TERMINATED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TERMINATED!=null?((Non_reserved_wordsContext)_localctx).T_TERMINATED.getText():null); 
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 271);
				{
				setState(3724);
				((Non_reserved_wordsContext)_localctx).T_TEXTIMAGE_ON = match(T_TEXTIMAGE_ON);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TEXTIMAGE_ON!=null?((Non_reserved_wordsContext)_localctx).T_TEXTIMAGE_ON.getText():null); 
				}
				break;
			case T_THEN:
				enterOuterAlt(_localctx, 272);
				{
				setState(3726);
				((Non_reserved_wordsContext)_localctx).T_THEN = match(T_THEN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_THEN!=null?((Non_reserved_wordsContext)_localctx).T_THEN.getText():null); 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 273);
				{
				setState(3728);
				((Non_reserved_wordsContext)_localctx).T_TIMESTAMP = match(T_TIMESTAMP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TIMESTAMP!=null?((Non_reserved_wordsContext)_localctx).T_TIMESTAMP.getText():null); 
				}
				break;
			case T_TITLE:
				enterOuterAlt(_localctx, 274);
				{
				setState(3730);
				((Non_reserved_wordsContext)_localctx).T_TITLE = match(T_TITLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TITLE!=null?((Non_reserved_wordsContext)_localctx).T_TITLE.getText():null); 
				}
				break;
			case T_TO:
				enterOuterAlt(_localctx, 275);
				{
				setState(3732);
				((Non_reserved_wordsContext)_localctx).T_TO = match(T_TO);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TO!=null?((Non_reserved_wordsContext)_localctx).T_TO.getText():null); 
				}
				break;
			case T_TOP:
				enterOuterAlt(_localctx, 276);
				{
				setState(3734);
				((Non_reserved_wordsContext)_localctx).T_TOP = match(T_TOP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TOP!=null?((Non_reserved_wordsContext)_localctx).T_TOP.getText():null); 
				}
				break;
			case T_TRANSACTION:
				enterOuterAlt(_localctx, 277);
				{
				setState(3736);
				((Non_reserved_wordsContext)_localctx).T_TRANSACTION = match(T_TRANSACTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TRANSACTION!=null?((Non_reserved_wordsContext)_localctx).T_TRANSACTION.getText():null); 
				}
				break;
			case T_TRIM:
				enterOuterAlt(_localctx, 278);
				{
				setState(3738);
				((Non_reserved_wordsContext)_localctx).T_TRIM = match(T_TRIM);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TRIM!=null?((Non_reserved_wordsContext)_localctx).T_TRIM.getText():null); 
				}
				break;
			case T_TRUE:
				enterOuterAlt(_localctx, 279);
				{
				setState(3740);
				((Non_reserved_wordsContext)_localctx).T_TRUE = match(T_TRUE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TRUE!=null?((Non_reserved_wordsContext)_localctx).T_TRUE.getText():null); 
				}
				break;
			case T_TRUNCATE:
				enterOuterAlt(_localctx, 280);
				{
				setState(3742);
				((Non_reserved_wordsContext)_localctx).T_TRUNCATE = match(T_TRUNCATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TRUNCATE!=null?((Non_reserved_wordsContext)_localctx).T_TRUNCATE.getText():null); 
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 281);
				{
				setState(3744);
				((Non_reserved_wordsContext)_localctx).T_UNIQUE = match(T_UNIQUE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNIQUE!=null?((Non_reserved_wordsContext)_localctx).T_UNIQUE.getText():null); 
				}
				break;
			case T_UPDATE:
				enterOuterAlt(_localctx, 282);
				{
				setState(3746);
				((Non_reserved_wordsContext)_localctx).T_UPDATE = match(T_UPDATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UPDATE!=null?((Non_reserved_wordsContext)_localctx).T_UPDATE.getText():null); 
				}
				break;
			case T_UR:
				enterOuterAlt(_localctx, 283);
				{
				setState(3748);
				((Non_reserved_wordsContext)_localctx).T_UR = match(T_UR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UR!=null?((Non_reserved_wordsContext)_localctx).T_UR.getText():null); 
				}
				break;
			case T_USE:
				enterOuterAlt(_localctx, 284);
				{
				setState(3750);
				((Non_reserved_wordsContext)_localctx).T_USE = match(T_USE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_USE!=null?((Non_reserved_wordsContext)_localctx).T_USE.getText():null); 
				}
				break;
			case T_USER:
				enterOuterAlt(_localctx, 285);
				{
				setState(3752);
				((Non_reserved_wordsContext)_localctx).T_USER = match(T_USER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_USER!=null?((Non_reserved_wordsContext)_localctx).T_USER.getText():null); 
				}
				break;
			case T_USING:
				enterOuterAlt(_localctx, 286);
				{
				setState(3754);
				((Non_reserved_wordsContext)_localctx).T_USING = match(T_USING);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_USING!=null?((Non_reserved_wordsContext)_localctx).T_USING.getText():null); 
				}
				break;
			case T_VALUE:
				enterOuterAlt(_localctx, 287);
				{
				setState(3756);
				((Non_reserved_wordsContext)_localctx).T_VALUE = match(T_VALUE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VALUE!=null?((Non_reserved_wordsContext)_localctx).T_VALUE.getText():null); 
				}
				break;
			case T_VALUES:
				enterOuterAlt(_localctx, 288);
				{
				setState(3758);
				((Non_reserved_wordsContext)_localctx).T_VALUES = match(T_VALUES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VALUES!=null?((Non_reserved_wordsContext)_localctx).T_VALUES.getText():null); 
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 289);
				{
				setState(3760);
				((Non_reserved_wordsContext)_localctx).T_VAR = match(T_VAR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VAR!=null?((Non_reserved_wordsContext)_localctx).T_VAR.getText():null); 
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 290);
				{
				setState(3762);
				((Non_reserved_wordsContext)_localctx).T_VARCHAR = match(T_VARCHAR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VARCHAR!=null?((Non_reserved_wordsContext)_localctx).T_VARCHAR.getText():null); 
				}
				break;
			case T_VARCHAR2:
				enterOuterAlt(_localctx, 291);
				{
				setState(3764);
				((Non_reserved_wordsContext)_localctx).T_VARCHAR2 = match(T_VARCHAR2);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VARCHAR2!=null?((Non_reserved_wordsContext)_localctx).T_VARCHAR2.getText():null); 
				}
				break;
			case T_VARYING:
				enterOuterAlt(_localctx, 292);
				{
				setState(3766);
				((Non_reserved_wordsContext)_localctx).T_VARYING = match(T_VARYING);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VARYING!=null?((Non_reserved_wordsContext)_localctx).T_VARYING.getText():null); 
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 293);
				{
				setState(3768);
				((Non_reserved_wordsContext)_localctx).T_VARIANCE = match(T_VARIANCE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VARIANCE!=null?((Non_reserved_wordsContext)_localctx).T_VARIANCE.getText():null); 
				}
				break;
			case T_VOLATILE:
				enterOuterAlt(_localctx, 294);
				{
				setState(3770);
				((Non_reserved_wordsContext)_localctx).T_VOLATILE = match(T_VOLATILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VOLATILE!=null?((Non_reserved_wordsContext)_localctx).T_VOLATILE.getText():null); 
				}
				break;
			case T_WHILE:
				enterOuterAlt(_localctx, 295);
				{
				setState(3772);
				((Non_reserved_wordsContext)_localctx).T_WHILE = match(T_WHILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WHILE!=null?((Non_reserved_wordsContext)_localctx).T_WHILE.getText():null); 
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 296);
				{
				setState(3774);
				((Non_reserved_wordsContext)_localctx).T_WITH = match(T_WITH);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WITH!=null?((Non_reserved_wordsContext)_localctx).T_WITH.getText():null); 
				}
				break;
			case T_WITHOUT:
				enterOuterAlt(_localctx, 297);
				{
				setState(3776);
				((Non_reserved_wordsContext)_localctx).T_WITHOUT = match(T_WITHOUT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WITHOUT!=null?((Non_reserved_wordsContext)_localctx).T_WITHOUT.getText():null); 
				}
				break;
			case T_WORK:
				enterOuterAlt(_localctx, 298);
				{
				setState(3778);
				((Non_reserved_wordsContext)_localctx).T_WORK = match(T_WORK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WORK!=null?((Non_reserved_wordsContext)_localctx).T_WORK.getText():null); 
				}
				break;
			case T_XACT_ABORT:
				enterOuterAlt(_localctx, 299);
				{
				setState(3780);
				((Non_reserved_wordsContext)_localctx).T_XACT_ABORT = match(T_XACT_ABORT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_XACT_ABORT!=null?((Non_reserved_wordsContext)_localctx).T_XACT_ABORT.getText():null); 
				}
				break;
			case T_XML:
				enterOuterAlt(_localctx, 300);
				{
				setState(3782);
				((Non_reserved_wordsContext)_localctx).T_XML = match(T_XML);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_XML!=null?((Non_reserved_wordsContext)_localctx).T_XML.getText():null); 
				}
				break;
			case T_YES:
				enterOuterAlt(_localctx, 301);
				{
				setState(3784);
				((Non_reserved_wordsContext)_localctx).T_YES = match(T_YES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_YES!=null?((Non_reserved_wordsContext)_localctx).T_YES.getText():null); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 81:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0227\u0ecf\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\6\3\u00eb\n\3\r\3\16\3\u00ec\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f7"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0107"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u011f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"\u013a\n\6\f\6\16\6\u013d\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"\u0148\n\6\f\6\16\6\u014b\13\6\3\6\3\6\3\6\5\6\u0150\n\6\3\7\3\7\3\7\5"+
		"\7\u0155\n\7\3\7\3\7\5\7\u0159\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u0166\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0171\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u0188\n\13\f\13\16\13\u018b\13\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0196\n\13\f\13\16\13"+
		"\u0199\13\13\3\13\3\13\3\13\5\13\u019e\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u01b2\n\16\f\16"+
		"\16\16\u01b5\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01c0"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01c9\n\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u01d8\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u01f6\n\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01fe\n\25\f\25\16\25\u0201"+
		"\13\25\3\25\3\25\3\25\5\25\u0206\n\25\3\26\3\26\3\26\3\26\7\26\u020c\n"+
		"\26\f\26\16\26\u020f\13\26\3\26\3\26\5\26\u0213\n\26\3\27\3\27\3\27\3"+
		"\27\5\27\u0219\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u0225\n\31\f\31\16\31\u0228\13\31\3\31\3\31\3\31\5\31\u022d\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0239\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0243\n\33\f\33\16\33\u0246\13"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u024f\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u025c\n\34\f\34\16\34\u025f"+
		"\13\34\3\34\3\34\3\34\5\34\u0264\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u026b"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0275\n\36\f\36\16"+
		"\36\u0278\13\36\3\36\3\36\3\36\3\36\3\36\5\36\u027f\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u0288\n\37\f\37\16\37\u028b\13\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0297\n\37\f\37\16\37\u029a"+
		"\13\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u02a2\n\37\f\37\16\37\u02a5"+
		"\13\37\3\37\3\37\7\37\u02a9\n\37\f\37\16\37\u02ac\13\37\3\37\3\37\3\37"+
		"\5\37\u02b1\n\37\3 \3 \3 \3 \3 \5 \u02b8\n \3!\3!\3!\3!\3!\3!\5!\u02c0"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02cf\n\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u02df\n#\3$\3$\3$\3$\3$"+
		"\3$\3$\5$\u02e8\n$\3%\3%\3%\3%\3%\3%\3%\5%\u02f1\n%\3&\3&\3&\3&\3&\3&"+
		"\5&\u02f9\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0301\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\7(\u0310\n(\f(\16(\u0313\13(\3(\3(\3(\5(\u0318\n("+
		"\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*"+
		"\u0330\n*\3+\3+\3+\3+\5+\u0336\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\7,\u0344\n,\f,\16,\u0347\13,\3,\3,\3,\5,\u034c\n,\3-\3-\3-\3.\3.\3.\3"+
		".\3.\5.\u0356\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0366\n"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\6\60\u0376\n\60\r\60\16\60\u0377\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\6\60\u0382\n\60\r\60\16\60\u0383\3\60\3\60\5\60\u0388\n\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u03a4\n\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03b0\n\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u03b9\n\63\f\63\16\63\u03bc\13\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\7\63\u03cd\n\63\f\63\16\63\u03d0\13\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\7\63\u03d9\n\63\f\63\16\63\u03dc\13\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u03eb\n\63\f\63\16"+
		"\63\u03ee\13\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u03ff\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u0406"+
		"\n\64\3\65\3\65\3\65\5\65\u040b\n\65\3\66\3\66\3\66\5\66\u0410\n\66\3"+
		"\67\3\67\3\67\5\67\u0415\n\67\38\38\38\38\38\58\u041c\n8\39\39\39\39\3"+
		"9\59\u0423\n9\3:\3:\3:\3:\5:\u0429\n:\3;\3;\3;\3;\3;\5;\u0430\n;\3<\3"+
		"<\3<\3<\3<\3<\5<\u0438\n<\3=\3=\3=\3=\3=\3=\6=\u0440\n=\r=\16=\u0441\3"+
		"=\3=\3>\3>\3>\3>\3>\5>\u044b\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0464\n?\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\7@\u0470\n@\f@\16@\u0473\13@\3@\3@\5@\u0477\n@\3A\3A\3A\3B\3B\3B"+
		"\3B\3B\5B\u0481\nB\3C\3C\3C\3C\3C\3C\3C\7C\u048a\nC\fC\16C\u048d\13C\3"+
		"C\3C\5C\u0491\nC\3D\3D\3D\3D\3D\5D\u0498\nD\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\7E\u04a4\nE\fE\16E\u04a7\13E\3E\3E\5E\u04ab\nE\3F\3F\3F\3F\3F\5F"+
		"\u04b2\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u04bd\nG\3H\3H\3H\3H\3H\3H\3H"+
		"\6H\u04c6\nH\rH\16H\u04c7\3H\3H\3H\3H\3H\6H\u04cf\nH\rH\16H\u04d0\3H\3"+
		"H\5H\u04d5\nH\3I\5I\u04d8\nI\3I\3I\3I\3I\3I\5I\u04df\nI\3I\3I\3I\3I\3"+
		"I\3I\3I\5I\u04e8\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5"+
		"I\u04fa\nI\3J\3J\3J\3J\3K\3K\3K\3K\3K\5K\u0505\nK\3K\3K\3K\3K\3K\3K\3"+
		"K\5K\u050e\nK\3K\3K\3K\3K\3K\3K\3K\5K\u0517\nK\3K\3K\3K\5K\u051c\nK\3"+
		"L\3L\3L\3L\3L\5L\u0523\nL\3M\3M\3M\3M\7M\u0529\nM\fM\16M\u052c\13M\3M"+
		"\3M\3N\3N\5N\u0532\nN\3N\3N\3N\3N\3N\3N\3N\3N\5N\u053c\nN\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0550\nN\3N\3N\3N\5N\u0555"+
		"\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\7O\u0560\nO\fO\16O\u0563\13O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\7O\u0571\nO\fO\16O\u0574\13O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\7O\u0582\nO\fO\16O\u0585\13O\3O\3O\3O\3O\3O\7O\u058c"+
		"\nO\fO\16O\u058f\13O\3O\3O\3O\5O\u0594\nO\3P\3P\3P\3P\3P\3P\5P\u059c\n"+
		"P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\7R\u05a8\nR\fR\16R\u05ab\13R\3R\3R\3R"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\5S\u05de\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\7S\u0634\nS"+
		"\fS\16S\u0637\13S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5"+
		"T\u0661\nT\3U\3U\3U\3U\3U\3U\7U\u0669\nU\fU\16U\u066c\13U\3U\3U\3U\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\7V\u067c\nV\fV\16V\u067f\13V\3V\3V\3V\3"+
		"W\3W\3W\3W\3W\3W\7W\u068a\nW\fW\16W\u068d\13W\3W\3W\3W\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\7X\u069d\nX\fX\16X\u06a0\13X\3X\3X\3X\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\6Y\u06c3\nY\rY\16Y\u06c4\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\6Y\u06d2"+
		"\nY\rY\16Y\u06d3\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\7Y\u06e9\nY\fY\16Y\u06ec\13Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u0701\nY\fY\16Y\u0704\13Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\6"+
		"Y\u077f\nY\rY\16Y\u0780\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5"+
		"Y\u08a6\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u08b0\nZ\fZ\16Z\u08b3\13Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u08c0\nZ\fZ\16Z\u08c3\13Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\7Z\u08ce\nZ\fZ\16Z\u08d1\13Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\5Z\u090c\nZ\3[\3[\3[\3[\6[\u0912\n[\r[\16[\u0913\3[\3[\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u093b"+
		"\n\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\7]\u0964\n]\f]\16"+
		"]\u0967\13]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\6]\u0974\n]\r]\16]\u0975"+
		"\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\6]\u0983\n]\r]\16]\u0984\3]\3]\3]\3"+
		"]\3]\3]\3]\3]\3]\3]\3]\3]\6]\u0993\n]\r]\16]\u0994\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\6]\u09a1\n]\r]\16]\u09a2\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\3]\3]\3]\3]\5]\u09b8\n]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0a35\n"+
		"^\3^\3^\3^\3^\5^\u0a3b\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0a78"+
		"\n^\3_\3_\3_\3_\3_\3_\5_\u0a80\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0a8b"+
		"\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\7`\u0a9a\n`\f`\16`\u0a9d\13"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0ac7\n`\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\5a\u0b10\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5"+
		"b\u0b24\nb\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\5c\u0bf8\nc\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\5d\u0c0a\nd\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\3e\5e\u0c1e\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5"+
		"f\u0c30\nf\3g\3g\6g\u0c34\ng\rg\16g\u0c35\3g\3g\3h\3h\3h\3h\3h\3h\5h\u0c40"+
		"\nh\3i\3i\3i\3i\3i\5i\u0c47\ni\3j\3j\3j\3j\3k\3k\3k\3k\3l\3l\3l\3l\3l"+
		"\5l\u0c56\nl\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u0c61\nm\3n\3n\3n\3n\3n\5n"+
		"\u0c68\nn\3o\3o\3o\3o\3o\5o\u0c6f\no\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u0ecd\nq\3q"+
		"\2\3\u00a4r\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\2\30\4\2\u0106\u0106\u0222"+
		"\u0222\4\2//88\5\2\u00ab\u00ab\u00e7\u00e7\u016e\u016e\6\2\u013c\u013c"+
		"\u01ee\u01ee\u01f2\u01f2\u01ff\u0200\5\2\5\5\u020b\u020b\u0215\u0215\4"+
		"\2\u0207\u0207\u021d\u021d\3\2\6\t\3\2\u0211\u0214\4\2\n\n\u020d\u0210"+
		"\4\2\u00e5\u00e5\u00fa\u00fa\3\2\u01a9\u01aa\4\2\u01c4\u01c4\u01cc\u01cc"+
		"\5\2YY\u0108\u0108\u018a\u018b\3\2\u01e2\u01ea\4\2\u0106\u0106\u010d\u010d"+
		"\4\2\u01a0\u01a1\u0203\u0205\4\2SSWX\3\2\u015b\u0163\3\2DE\3\2\66\67\3"+
		"\2\u0143\u0144\6\2\r\r\u011e\u011e\u0207\u0207\u021d\u021d\2\u1133\2\u00e2"+
		"\3\2\2\2\4\u00e6\3\2\2\2\6\u00f6\3\2\2\2\b\u011e\3\2\2\2\n\u014f\3\2\2"+
		"\2\f\u0151\3\2\2\2\16\u0165\3\2\2\2\20\u0170\3\2\2\2\22\u0172\3\2\2\2"+
		"\24\u019d\3\2\2\2\26\u019f\3\2\2\2\30\u01a6\3\2\2\2\32\u01ad\3\2\2\2\34"+
		"\u01bf\3\2\2\2\36\u01c8\3\2\2\2 \u01ca\3\2\2\2\"\u01cd\3\2\2\2$\u01d7"+
		"\3\2\2\2&\u01f5\3\2\2\2(\u0205\3\2\2\2*\u0212\3\2\2\2,\u0218\3\2\2\2."+
		"\u021a\3\2\2\2\60\u022c\3\2\2\2\62\u0238\3\2\2\2\64\u024e\3\2\2\2\66\u0263"+
		"\3\2\2\28\u026a\3\2\2\2:\u027e\3\2\2\2<\u02b0\3\2\2\2>\u02b7\3\2\2\2@"+
		"\u02bf\3\2\2\2B\u02ce\3\2\2\2D\u02de\3\2\2\2F\u02e7\3\2\2\2H\u02f0\3\2"+
		"\2\2J\u02f8\3\2\2\2L\u0300\3\2\2\2N\u0317\3\2\2\2P\u0319\3\2\2\2R\u032f"+
		"\3\2\2\2T\u0335\3\2\2\2V\u034b\3\2\2\2X\u034d\3\2\2\2Z\u0355\3\2\2\2\\"+
		"\u0365\3\2\2\2^\u0387\3\2\2\2`\u03a3\3\2\2\2b\u03af\3\2\2\2d\u03fe\3\2"+
		"\2\2f\u0405\3\2\2\2h\u040a\3\2\2\2j\u040f\3\2\2\2l\u0414\3\2\2\2n\u041b"+
		"\3\2\2\2p\u0422\3\2\2\2r\u0428\3\2\2\2t\u042f\3\2\2\2v\u0437\3\2\2\2x"+
		"\u0439\3\2\2\2z\u044a\3\2\2\2|\u0463\3\2\2\2~\u0476\3\2\2\2\u0080\u0478"+
		"\3\2\2\2\u0082\u0480\3\2\2\2\u0084\u0490\3\2\2\2\u0086\u0497\3\2\2\2\u0088"+
		"\u04aa\3\2\2\2\u008a\u04b1\3\2\2\2\u008c\u04bc\3\2\2\2\u008e\u04d4\3\2"+
		"\2\2\u0090\u04f9\3\2\2\2\u0092\u04fb\3\2\2\2\u0094\u051b\3\2\2\2\u0096"+
		"\u0522\3\2\2\2\u0098\u0524\3\2\2\2\u009a\u0554\3\2\2\2\u009c\u0593\3\2"+
		"\2\2\u009e\u059b\3\2\2\2\u00a0\u059d\3\2\2\2\u00a2\u05a2\3\2\2\2\u00a4"+
		"\u05dd\3\2\2\2\u00a6\u0660\3\2\2\2\u00a8\u0662\3\2\2\2\u00aa\u0670\3\2"+
		"\2\2\u00ac\u0683\3\2\2\2\u00ae\u0691\3\2\2\2\u00b0\u08a5\3\2\2\2\u00b2"+
		"\u090b\3\2\2\2\u00b4\u090d\3\2\2\2\u00b6\u093a\3\2\2\2\u00b8\u09b7\3\2"+
		"\2\2\u00ba\u0a77\3\2\2\2\u00bc\u0a8a\3\2\2\2\u00be\u0ac6\3\2\2\2\u00c0"+
		"\u0b0f\3\2\2\2\u00c2\u0b23\3\2\2\2\u00c4\u0bf7\3\2\2\2\u00c6\u0c09\3\2"+
		"\2\2\u00c8\u0c1d\3\2\2\2\u00ca\u0c2f\3\2\2\2\u00cc\u0c31\3\2\2\2\u00ce"+
		"\u0c3f\3\2\2\2\u00d0\u0c46\3\2\2\2\u00d2\u0c48\3\2\2\2\u00d4\u0c4c\3\2"+
		"\2\2\u00d6\u0c55\3\2\2\2\u00d8\u0c60\3\2\2\2\u00da\u0c67\3\2\2\2\u00dc"+
		"\u0c6e\3\2\2\2\u00de\u0c70\3\2\2\2\u00e0\u0ecc\3\2\2\2\u00e2\u00e3\5\4"+
		"\3\2\u00e3\u00e4\7\2\2\3\u00e4\u00e5\b\2\1\2\u00e5\3\3\2\2\2\u00e6\u00ea"+
		"\b\3\1\2\u00e7\u00e8\5\16\b\2\u00e8\u00e9\7\u021c\2\2\u00e9\u00eb\3\2"+
		"\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\3\1\2\u00ef\5\3\2\2\2"+
		"\u00f0\u00f1\5\b\5\2\u00f1\u00f2\b\4\1\2\u00f2\u00f7\3\2\2\2\u00f3\u00f4"+
		"\5\n\6\2\u00f4\u00f5\b\4\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6"+
		"\u00f3\3\2\2\2\u00f7\7\3\2\2\2\u00f8\u00f9\7\u01b9\2\2\u00f9\u011f\b\5"+
		"\1\2\u00fa\u00fb\7\u0194\2\2\u00fb\u011f\b\5\1\2\u00fc\u00fd\7\u00cd\2"+
		"\2\u00fd\u011f\b\5\1\2\u00fe\u00ff\7&\2\2\u00ff\u011f\b\5\1\2\u0100\u0101"+
		"\7+\2\2\u0101\u011f\b\5\1\2\u0102\u0103\7\u00a1\2\2\u0103\u011f\b\5\1"+
		"\2\u0104\u0106\7\u0082\2\2\u0105\u0107\7\u0145\2\2\u0106\u0105\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u011f\b\5\1\2\u0109\u010a"+
		"\7\u01a5\2\2\u010a\u011f\b\5\1\2\u010b\u010c\7(\2\2\u010c\u011f\b\5\1"+
		"\2\u010d\u010e\7\u01b8\2\2\u010e\u011f\b\5\1\2\u010f\u0110\7m\2\2\u0110"+
		"\u011f\b\5\1\2\u0111\u0112\7m\2\2\u0112\u0113\7\u0217\2\2\u0113\u0114"+
		"\7\u021f\2\2\u0114\u0115\7\u0209\2\2\u0115\u0116\7\u021f\2\2\u0116\u0117"+
		"\7\u021a\2\2\u0117\u011f\b\5\1\2\u0118\u0119\7d\2\2\u0119\u011f\b\5\1"+
		"\2\u011a\u011b\7\u01d3\2\2\u011b\u011f\b\5\1\2\u011c\u011d\78\2\2\u011d"+
		"\u011f\b\5\1\2\u011e\u00f8\3\2\2\2\u011e\u00fa\3\2\2\2\u011e\u00fc\3\2"+
		"\2\2\u011e\u00fe\3\2\2\2\u011e\u0100\3\2\2\2\u011e\u0102\3\2\2\2\u011e"+
		"\u0104\3\2\2\2\u011e\u0109\3\2\2\2\u011e\u010b\3\2\2\2\u011e\u010d\3\2"+
		"\2\2\u011e\u010f\3\2\2\2\u011e\u0111\3\2\2\2\u011e\u0118\3\2\2\2\u011e"+
		"\u011a\3\2\2\2\u011e\u011c\3\2\2\2\u011f\t\3\2\2\2\u0120\u0121\7\30\2"+
		"\2\u0121\u0122\7\u0213\2\2\u0122\u0123\5\b\5\2\u0123\u0124\7\u0211\2\2"+
		"\u0124\u0125\b\6\1\2\u0125\u0150\3\2\2\2\u0126\u0127\7\u00fe\2\2\u0127"+
		"\u0128\7\u0213\2\2\u0128\u0129\5\b\5\2\u0129\u012a\7\u0209\2\2\u012a\u012b"+
		"\5\6\4\2\u012b\u012c\7\u0211\2\2\u012c\u012d\b\6\1\2\u012d\u0150\3\2\2"+
		"\2\u012e\u012f\b\6\1\2\u012f\u0130\7\u01a7\2\2\u0130\u0131\7\u0213\2\2"+
		"\u0131\u0132\5\u0080A\2\u0132\u0133\7\u0208\2\2\u0133\u013b\5\6\4\2\u0134"+
		"\u0135\7\u0209\2\2\u0135\u0136\5\u0080A\2\u0136\u0137\7\u0208\2\2\u0137"+
		"\u0138\5\6\4\2\u0138\u013a\3\2\2\2\u0139\u0134\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u013f\7\u0211\2\2\u013f\u0140\b\6\1\2\u0140\u0150"+
		"\3\2\2\2\u0141\u0142\b\6\1\2\u0142\u0143\7\u01c8\2\2\u0143\u0144\7\u0213"+
		"\2\2\u0144\u0149\5\6\4\2\u0145\u0146\7\u0209\2\2\u0146\u0148\5\6\4\2\u0147"+
		"\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7\u0211\2\2\u014d"+
		"\u014e\b\6\1\2\u014e\u0150\3\2\2\2\u014f\u0120\3\2\2\2\u014f\u0126\3\2"+
		"\2\2\u014f\u012e\3\2\2\2\u014f\u0141\3\2\2\2\u0150\13\3\2\2\2\u0151\u0152"+
		"\7\u0217\2\2\u0152\u0154\t\2\2\2\u0153\u0155\t\3\2\2\u0154\u0153\3\2\2"+
		"\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0157\7\u0209\2\2\u0157"+
		"\u0159\7\u0222\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015b\7\u021a\2\2\u015b\r\3\2\2\2\u015c\u015d\5v<\2\u015d"+
		"\u015e\b\b\1\2\u015e\u0166\3\2\2\2\u015f\u0160\5\20\t\2\u0160\u0161\b"+
		"\b\1\2\u0161\u0166\3\2\2\2\u0162\u0163\5\26\f\2\u0163\u0164\b\b\1\2\u0164"+
		"\u0166\3\2\2\2\u0165\u015c\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0162\3\2"+
		"\2\2\u0166\17\3\2\2\2\u0167\u0168\5&\24\2\u0168\u0169\b\t\1\2\u0169\u0171"+
		"\3\2\2\2\u016a\u016b\5\"\22\2\u016b\u016c\b\t\1\2\u016c\u0171\3\2\2\2"+
		"\u016d\u016e\5\22\n\2\u016e\u016f\b\t\1\2\u016f\u0171\3\2\2\2\u0170\u0167"+
		"\3\2\2\2\u0170\u016a\3\2\2\2\u0170\u016d\3\2\2\2\u0171\21\3\2\2\2\u0172"+
		"\u0173\7\u00cb\2\2\u0173\u0174\7\u00d4\2\2\u0174\u0175\7\u01af\2\2\u0175"+
		"\u0176\5\u00caf\2\u0176\u0177\5\24\13\2\u0177\u0178\5p9\2\u0178\u0179"+
		"\5v<\2\u0179\u017a\b\n\1\2\u017a\23\3\2\2\2\u017b\u019e\b\13\1\2\u017c"+
		"\u017d\b\13\1\2\u017d\u017e\7\u0138\2\2\u017e\u017f\7\u0217\2\2\u017f"+
		"\u0180\5\u00d0i\2\u0180\u0181\7\u020d\2\2\u0181\u0189\5\u00c6d\2\u0182"+
		"\u0183\7\u0209\2\2\u0183\u0184\5\u00d0i\2\u0184\u0185\7\u020d\2\2\u0185"+
		"\u0186\5\u00c6d\2\u0186\u0188\3\2\2\2\u0187\u0182\3\2\2\2\u0188\u018b"+
		"\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018c\u018d\7\u021a\2\2\u018d\u018e\b\13\1\2\u018e\u019e"+
		"\3\2\2\2\u018f\u0190\b\13\1\2\u0190\u0191\7\u0138\2\2\u0191\u0192\7\u0217"+
		"\2\2\u0192\u0197\5\u00d0i\2\u0193\u0194\7\u0209\2\2\u0194\u0196\5\u00d0"+
		"i\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7\u021a"+
		"\2\2\u019b\u019c\b\13\1\2\u019c\u019e\3\2\2\2\u019d\u017b\3\2\2\2\u019d"+
		"\u017c\3\2\2\2\u019d\u018f\3\2\2\2\u019e\25\3\2\2\2\u019f\u01a0\7\u0188"+
		"\2\2\u01a0\u01a1\5\34\17\2\u01a1\u01a2\5\32\16\2\u01a2\u01a3\7\u020d\2"+
		"\2\u01a3\u01a4\5\u00a4S\2\u01a4\u01a5\b\f\1\2\u01a5\27\3\2\2\2\u01a6\u01a7"+
		"\7\3\2\2\u01a7\u01a8\7\u0216\2\2\u01a8\u01a9\5\36\20\2\u01a9\u01aa\5\32"+
		"\16\2\u01aa\u01ab\7\u0219\2\2\u01ab\u01ac\b\r\1\2\u01ac\31\3\2\2\2\u01ad"+
		"\u01ae\b\16\1\2\u01ae\u01b3\5 \21\2\u01af\u01b0\7\4\2\2\u01b0\u01b2\5"+
		" \21\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\b\16"+
		"\1\2\u01b7\33\3\2\2\2\u01b8\u01c0\b\17\1\2\u01b9\u01ba\7\u00b9\2\2\u01ba"+
		"\u01bb\7\u0208\2\2\u01bb\u01c0\b\17\1\2\u01bc\u01bd\7\u00ba\2\2\u01bd"+
		"\u01be\7\u0208\2\2\u01be\u01c0\b\17\1\2\u01bf\u01b8\3\2\2\2\u01bf\u01b9"+
		"\3\2\2\2\u01bf\u01bc\3\2\2\2\u01c0\35\3\2\2\2\u01c1\u01c9\b\20\1\2\u01c2"+
		"\u01c3\7\u00b9\2\2\u01c3\u01c4\7\u0208\2\2\u01c4\u01c9\b\20\1\2\u01c5"+
		"\u01c6\7\u00ba\2\2\u01c6\u01c7\7\u0208\2\2\u01c7\u01c9\b\20\1\2\u01c8"+
		"\u01c1\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c9\37\3\2\2"+
		"\2\u01ca\u01cb\5\u00d0i\2\u01cb\u01cc\b\21\1\2\u01cc!\3\2\2\2\u01cd\u01ce"+
		"\7\u0083\2\2\u01ce\u01cf\7\u01af\2\2\u01cf\u01d0\5r:\2\u01d0\u01d1\5\u00ca"+
		"f\2\u01d1\u01d2\5$\23\2\u01d2\u01d3\b\22\1\2\u01d3#\3\2\2\2\u01d4\u01d8"+
		"\b\23\1\2\u01d5\u01d6\7\u014b\2\2\u01d6\u01d8\b\23\1\2\u01d7\u01d4\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d8%\3\2\2\2\u01d9\u01da\7Z\2\2\u01da\u01db"+
		"\5t;\2\u01db\u01dc\7\u01af\2\2\u01dc\u01dd\5p9\2\u01dd\u01de\5\u00caf"+
		"\2\u01de\u01df\5(\25\2\u01df\u01e0\5*\26\2\u01e0\u01e1\5,\27\2\u01e1\u01e2"+
		"\5\60\31\2\u01e2\u01e3\5\64\33\2\u01e3\u01e4\5:\36\2\u01e4\u01e5\5@!\2"+
		"\u01e5\u01e6\5R*\2\u01e6\u01e7\5T+\2\u01e7\u01e8\5V,\2\u01e8\u01e9\5Z"+
		".\2\u01e9\u01ea\b\24\1\2\u01ea\u01f6\3\2\2\2\u01eb\u01ec\7Z\2\2\u01ec"+
		"\u01ed\5t;\2\u01ed\u01ee\7\u01af\2\2\u01ee\u01ef\5p9\2\u01ef\u01f0\5\u00ca"+
		"f\2\u01f0\u01f1\7\u00ea\2\2\u01f1\u01f2\5\u00caf\2\u01f2\u01f3\5T+\2\u01f3"+
		"\u01f4\b\24\1\2\u01f4\u01f6\3\2\2\2\u01f5\u01d9\3\2\2\2\u01f5\u01eb\3"+
		"\2\2\2\u01f6\'\3\2\2\2\u01f7\u0206\b\25\1\2\u01f8\u01f9\b\25\1\2\u01f9"+
		"\u01fa\7\u0217\2\2\u01fa\u01ff\5^\60\2\u01fb\u01fc\7\u0209\2\2\u01fc\u01fe"+
		"\5^\60\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7\u021a"+
		"\2\2\u0203\u0204\b\25\1\2\u0204\u0206\3\2\2\2\u0205\u01f7\3\2\2\2\u0205"+
		"\u01f8\3\2\2\2\u0206)\3\2\2\2\u0207\u0213\b\26\1\2\u0208\u0209\b\26\1"+
		"\2\u0209\u020d\5d\63\2\u020a\u020c\5d\63\2\u020b\u020a\3\2\2\2\u020c\u020f"+
		"\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u0210\u0211\b\26\1\2\u0211\u0213\3\2\2\2\u0212\u0207\3"+
		"\2\2\2\u0212\u0208\3\2\2\2\u0213+\3\2\2\2\u0214\u0219\b\27\1\2\u0215\u0216"+
		"\7H\2\2\u0216\u0217\7\u0221\2\2\u0217\u0219\b\27\1\2\u0218\u0214\3\2\2"+
		"\2\u0218\u0215\3\2\2\2\u0219-\3\2\2\2\u021a\u021b\5\60\31\2\u021b/\3\2"+
		"\2\2\u021c\u022d\b\31\1\2\u021d\u021e\b\31\1\2\u021e\u021f\7\u0139\2\2"+
		"\u021f\u0220\7.\2\2\u0220\u0221\7\u0217\2\2\u0221\u0226\5\62\32\2\u0222"+
		"\u0223\7\u0209\2\2\u0223\u0225\5\62\32\2\u0224\u0222\3\2\2\2\u0225\u0228"+
		"\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0229\u022a\7\u021a\2\2\u022a\u022b\b\31\1\2\u022b\u022d"+
		"\3\2\2\2\u022c\u021c\3\2\2\2\u022c\u021d\3\2\2\2\u022d\61\3\2\2\2\u022e"+
		"\u022f\5\u0080A\2\u022f\u0230\5\6\4\2\u0230\u0231\b\32\1\2\u0231\u0239"+
		"\3\2\2\2\u0232\u0233\5\u0080A\2\u0233\u0234\5\6\4\2\u0234\u0235\7H\2\2"+
		"\u0235\u0236\7\u0221\2\2\u0236\u0237\b\32\1\2\u0237\u0239\3\2\2\2\u0238"+
		"\u022e\3\2\2\2\u0238\u0232\3\2\2\2\u0239\63\3\2\2\2\u023a\u024f\b\33\1"+
		"\2\u023b\u023c\b\33\1\2\u023c\u023d\7@\2\2\u023d\u023e\7.\2\2\u023e\u023f"+
		"\7\u0217\2\2\u023f\u0244\5\u0080A\2\u0240\u0241\7\u0209\2\2\u0241\u0243"+
		"\5\u0080A\2\u0242\u0240\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2"+
		"\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248"+
		"\7\u021a\2\2\u0248\u0249\5\66\34\2\u0249\u024a\7\u00d4\2\2\u024a\u024b"+
		"\7\u021f\2\2\u024b\u024c\7-\2\2\u024c\u024d\b\33\1\2\u024d\u024f\3\2\2"+
		"\2\u024e\u023a\3\2\2\2\u024e\u023b\3\2\2\2\u024f\65\3\2\2\2\u0250\u0264"+
		"\b\34\1\2\u0251\u0252\b\34\1\2\u0252\u0253\7\u01a4\2\2\u0253\u0254\7."+
		"\2\2\u0254\u0255\7\u0217\2\2\u0255\u0256\5\u0080A\2\u0256\u025d\58\35"+
		"\2\u0257\u0258\7\u0209\2\2\u0258\u0259\5\u0080A\2\u0259\u025a\58\35\2"+
		"\u025a\u025c\3\2\2\2\u025b\u0257\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b"+
		"\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260"+
		"\u0261\7\u021a\2\2\u0261\u0262\b\34\1\2\u0262\u0264\3\2\2\2\u0263\u0250"+
		"\3\2\2\2\u0263\u0251\3\2\2\2\u0264\67\3\2\2\2\u0265\u026b\b\35\1\2\u0266"+
		"\u0267\7\32\2\2\u0267\u026b\b\35\1\2\u0268\u0269\7y\2\2\u0269\u026b\b"+
		"\35\1\2\u026a\u0265\3\2\2\2\u026a\u0266\3\2\2\2\u026a\u0268\3\2\2\2\u026b"+
		"9\3\2\2\2\u026c\u027f\b\36\1\2\u026d\u026e\b\36\1\2\u026e\u026f\7\u0192"+
		"\2\2\u026f\u0270\7.\2\2\u0270\u0271\7\u0217\2\2\u0271\u0276\5\u0080A\2"+
		"\u0272\u0273\7\u0209\2\2\u0273\u0275\5\u0080A\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2"+
		"\2\2\u0278\u0276\3\2\2\2\u0279\u027a\5<\37\2\u027a\u027b\7\u021a\2\2\u027b"+
		"\u027c\5> \2\u027c\u027d\b\36\1\2\u027d\u027f\3\2\2\2\u027e\u026c\3\2"+
		"\2\2\u027e\u026d\3\2\2\2\u027f;\3\2\2\2\u0280\u02b1\b\37\1\2\u0281\u0282"+
		"\b\37\1\2\u0282\u0283\7\u0129\2\2\u0283\u0284\7\u0217\2\2\u0284\u0289"+
		"\5\u00c6d\2\u0285\u0286\7\u0209\2\2\u0286\u0288\5\u00c6d\2\u0287\u0285"+
		"\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028c\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d\7\u021a\2\2\u028d\u028e"+
		"\b\37\1\2\u028e\u02b1\3\2\2\2\u028f\u0290\b\37\1\2\u0290\u0291\7\u0129"+
		"\2\2\u0291\u0292\7\u0217\2\2\u0292\u0293\7\u0217\2\2\u0293\u0298\5\u00c6"+
		"d\2\u0294\u0295\7\u0209\2\2\u0295\u0297\5\u00c6d\2\u0296\u0294\3\2\2\2"+
		"\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b"+
		"\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u02aa\7\u021a\2\2\u029c\u029d\7\u0209"+
		"\2\2\u029d\u029e\7\u0217\2\2\u029e\u02a3\5\u00c6d\2\u029f\u02a0\7\u0209"+
		"\2\2\u02a0\u02a2\5\u00c6d\2\u02a1\u029f\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a3\3\2"+
		"\2\2\u02a6\u02a7\7\u021a\2\2\u02a7\u02a9\3\2\2\2\u02a8\u029c\3\2\2\2\u02a9"+
		"\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\3\2"+
		"\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\7\u021a\2\2\u02ae\u02af\b\37\1\2"+
		"\u02af\u02b1\3\2\2\2\u02b0\u0280\3\2\2\2\u02b0\u0281\3\2\2\2\u02b0\u028f"+
		"\3\2\2\2\u02b1=\3\2\2\2\u02b2\u02b8\b \1\2\u02b3\u02b4\7\u01a4\2\2\u02b4"+
		"\u02b5\7\31\2\2\u02b5\u02b6\7}\2\2\u02b6\u02b8\b \1\2\u02b7\u02b2\3\2"+
		"\2\2\u02b7\u02b3\3\2\2\2\u02b8?\3\2\2\2\u02b9\u02c0\b!\1\2\u02ba\u02bb"+
		"\7\u0173\2\2\u02bb\u02bc\7\u00a5\2\2\u02bc\u02bd\5B\"\2\u02bd\u02be\b"+
		"!\1\2\u02be\u02c0\3\2\2\2\u02bf\u02b9\3\2\2\2\u02bf\u02ba\3\2\2\2\u02c0"+
		"A\3\2\2\2\u02c1\u02c2\7w\2\2\u02c2\u02c3\5D#\2\u02c3\u02c4\5F$\2\u02c4"+
		"\u02c5\5H%\2\u02c5\u02c6\5J&\2\u02c6\u02c7\5L\'\2\u02c7\u02c8\b\"\1\2"+
		"\u02c8\u02cf\3\2\2\2\u02c9\u02ca\7\u0181\2\2\u02ca\u02cb\7\u0221\2\2\u02cb"+
		"\u02cc\5N(\2\u02cc\u02cd\b\"\1\2\u02cd\u02cf\3\2\2\2\u02ce\u02c1\3\2\2"+
		"\2\u02ce\u02c9\3\2\2\2\u02cfC\3\2\2\2\u02d0\u02df\b#\1\2\u02d1\u02d2\7"+
		"\u009d\2\2\u02d2\u02d3\7\u01b4\2\2\u02d3\u02d4\7.\2\2\u02d4\u02d5\7\u0221"+
		"\2\2\u02d5\u02df\b#\1\2\u02d6\u02d7\7\u009d\2\2\u02d7\u02d8\7\u01b4\2"+
		"\2\u02d8\u02d9\7.\2\2\u02d9\u02da\7\u0221\2\2\u02da\u02db\7\u008d\2\2"+
		"\u02db\u02dc\7.\2\2\u02dc\u02dd\7\u0221\2\2\u02dd\u02df\b#\1\2\u02de\u02d0"+
		"\3\2\2\2\u02de\u02d1\3\2\2\2\u02de\u02d6\3\2\2\2\u02dfE\3\2\2\2\u02e0"+
		"\u02e8\b$\1\2\u02e1\u02e2\7F\2\2\u02e2\u02e3\7\u00db\2\2\u02e3\u02e4\7"+
		"\u01b4\2\2\u02e4\u02e5\7.\2\2\u02e5\u02e6\7\u0221\2\2\u02e6\u02e8\b$\1"+
		"\2\u02e7\u02e0\3\2\2\2\u02e7\u02e1\3\2\2\2\u02e8G\3\2\2\2\u02e9\u02f1"+
		"\b%\1\2\u02ea\u02eb\7\u00fe\2\2\u02eb\u02ec\7\u00e1\2\2\u02ec\u02ed\7"+
		"\u01b4\2\2\u02ed\u02ee\7.\2\2\u02ee\u02ef\7\u0221\2\2\u02ef\u02f1\b%\1"+
		"\2\u02f0\u02e9\3\2\2\2\u02f0\u02ea\3\2\2\2\u02f1I\3\2\2\2\u02f2\u02f9"+
		"\b&\1\2\u02f3\u02f4\7\u00ec\2\2\u02f4\u02f5\7\u01b4\2\2\u02f5\u02f6\7"+
		".\2\2\u02f6\u02f7\7\u0221\2\2\u02f7\u02f9\b&\1\2\u02f8\u02f2\3\2\2\2\u02f8"+
		"\u02f3\3\2\2\2\u02f9K\3\2\2\2\u02fa\u0301\b\'\1\2\u02fb\u02fc\7\u0122"+
		"\2\2\u02fc\u02fd\7r\2\2\u02fd\u02fe\7\31\2\2\u02fe\u02ff\7\u0221\2\2\u02ff"+
		"\u0301\b\'\1\2\u0300\u02fa\3\2\2\2\u0300\u02fb\3\2\2\2\u0301M\3\2\2\2"+
		"\u0302\u0318\b(\1\2\u0303\u0304\b(\1\2\u0304\u0305\7\u01dd\2\2\u0305\u0306"+
		"\7\u0182\2\2\u0306\u0307\7\u0217\2\2\u0307\u0308\5P)\2\u0308\u0309\7\u020d"+
		"\2\2\u0309\u0311\5P)\2\u030a\u030b\7\u0209\2\2\u030b\u030c\5P)\2\u030c"+
		"\u030d\7\u020d\2\2\u030d\u030e\5P)\2\u030e\u0310\3\2\2\2\u030f\u030a\3"+
		"\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0314\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u0315\7\u021a\2\2\u0315\u0316"+
		"\b(\1\2\u0316\u0318\3\2\2\2\u0317\u0302\3\2\2\2\u0317\u0303\3\2\2\2\u0318"+
		"O\3\2\2\2\u0319\u031a\7\u0221\2\2\u031a\u031b\b)\1\2\u031bQ\3\2\2\2\u031c"+
		"\u0330\b*\1\2\u031d\u031e\7\u01a4\2\2\u031e\u031f\7\31\2\2\u031f\u0320"+
		"\5\\/\2\u0320\u0321\b*\1\2\u0321\u0330\3\2\2\2\u0322\u0323\7\u01a4\2\2"+
		"\u0323\u0324\7\31\2\2\u0324\u0325\7\u00ca\2\2\u0325\u0326\7\u0221\2\2"+
		"\u0326\u0327\7\u0131\2\2\u0327\u0328\7\u0221\2\2\u0328\u0330\b*\1\2\u0329"+
		"\u032a\7\u01a4\2\2\u032a\u032b\7.\2\2\u032b\u032c\7\u0221\2\2\u032c\u032d"+
		"\5N(\2\u032d\u032e\b*\1\2\u032e\u0330\3\2\2\2\u032f\u031c\3\2\2\2\u032f"+
		"\u031d\3\2\2\2\u032f\u0322\3\2\2\2\u032f\u0329\3\2\2\2\u0330S\3\2\2\2"+
		"\u0331\u0336\b+\1\2\u0332\u0333\7\u00ef\2\2\u0333\u0334\7\u0221\2\2\u0334"+
		"\u0336\b+\1\2\u0335\u0331\3\2\2\2\u0335\u0332\3\2\2\2\u0336U\3\2\2\2\u0337"+
		"\u034c\b,\1\2\u0338\u0339\b,\1\2\u0339\u033a\7\u01b2\2\2\u033a\u033b\7"+
		"\u0217\2\2\u033b\u033c\5X-\2\u033c\u033d\7\u020d\2\2\u033d\u0345\5X-\2"+
		"\u033e\u033f\7\u0209\2\2\u033f\u0340\5X-\2\u0340\u0341\7\u020d\2\2\u0341"+
		"\u0342\5X-\2\u0342\u0344\3\2\2\2\u0343\u033e\3\2\2\2\u0344\u0347\3\2\2"+
		"\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0345"+
		"\3\2\2\2\u0348\u0349\7\u021a\2\2\u0349\u034a\b,\1\2\u034a\u034c\3\2\2"+
		"\2\u034b\u0337\3\2\2\2\u034b\u0338\3\2\2\2\u034cW\3\2\2\2\u034d\u034e"+
		"\7\u0221\2\2\u034e\u034f\b-\1\2\u034fY\3\2\2\2\u0350\u0356\b.\1\2\u0351"+
		"\u0352\7\31\2\2\u0352\u0353\5v<\2\u0353\u0354\b.\1\2\u0354\u0356\3\2\2"+
		"\2\u0355\u0350\3\2\2\2\u0355\u0351\3\2\2\2\u0356[\3\2\2\2\u0357\u0358"+
		"\7\u0186\2\2\u0358\u0366\b/\1\2\u0359\u035a\7\u01b5\2\2\u035a\u0366\b"+
		"/\1\2\u035b\u035c\7\u0154\2\2\u035c\u0366\b/\1\2\u035d\u035e\7\u012d\2"+
		"\2\u035e\u0366\b/\1\2\u035f\u0360\7\u0136\2\2\u0360\u0366\b/\1\2\u0361"+
		"\u0362\7\"\2\2\u0362\u0366\b/\1\2\u0363\u0364\7\u00de\2\2\u0364\u0366"+
		"\b/\1\2\u0365\u0357\3\2\2\2\u0365\u0359\3\2\2\2\u0365\u035b\3\2\2\2\u0365"+
		"\u035d\3\2\2\2\u0365\u035f\3\2\2\2\u0365\u0361\3\2\2\2\u0365\u0363\3\2"+
		"\2\2\u0366]\3\2\2\2\u0367\u0368\5\u0080A\2\u0368\u0369\5\6\4\2\u0369\u036a"+
		"\b\60\1\2\u036a\u0388\3\2\2\2\u036b\u036c\5\u0080A\2\u036c\u036d\5\6\4"+
		"\2\u036d\u036e\7H\2\2\u036e\u036f\7\u0221\2\2\u036f\u0370\b\60\1\2\u0370"+
		"\u0388\3\2\2\2\u0371\u0372\b\60\1\2\u0372\u0373\5\u0080A\2\u0373\u0375"+
		"\5\6\4\2\u0374\u0376\5`\61\2\u0375\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377"+
		"\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\7H"+
		"\2\2\u037a\u037b\7\u0221\2\2\u037b\u037c\b\60\1\2\u037c\u0388\3\2\2\2"+
		"\u037d\u037e\b\60\1\2\u037e\u037f\5\u0080A\2\u037f\u0381\5\6\4\2\u0380"+
		"\u0382\5`\61\2\u0381\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0381\3\2"+
		"\2\2\u0383\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\b\60\1\2\u0386"+
		"\u0388\3\2\2\2\u0387\u0367\3\2\2\2\u0387\u036b\3\2\2\2\u0387\u0371\3\2"+
		"\2\2\u0387\u037d\3\2\2\2\u0388_\3\2\2\2\u0389\u038a\7\u0147\2\2\u038a"+
		"\u038b\7\u00e0\2\2\u038b\u03a4\b\61\1\2\u038c\u038d\7\u01c9\2\2\u038d"+
		"\u03a4\b\61\1\2\u038e\u038f\7\u011e\2\2\u038f\u0390\7\u0122\2\2\u0390"+
		"\u03a4\b\61\1\2\u0391\u0392\7p\2\2\u0392\u0393\5b\62\2\u0393\u0394\b\61"+
		"\1\2\u0394\u03a4\3\2\2\2\u0395\u0396\7<\2\2\u0396\u0397\5\u00a4S\2\u0397"+
		"\u0398\b\61\1\2\u0398\u03a4\3\2\2\2\u0399\u039a\7\u0089\2\2\u039a\u03a4"+
		"\b\61\1\2\u039b\u039c\7~\2\2\u039c\u03a4\b\61\1\2\u039d\u039e\7\u0120"+
		"\2\2\u039e\u03a4\b\61\1\2\u039f\u03a0\7\u0164\2\2\u03a0\u03a4\b\61\1\2"+
		"\u03a1\u03a2\7\u011d\2\2\u03a2\u03a4\b\61\1\2\u03a3\u0389\3\2\2\2\u03a3"+
		"\u038c\3\2\2\2\u03a3\u038e\3\2\2\2\u03a3\u0391\3\2\2\2\u03a3\u0395\3\2"+
		"\2\2\u03a3\u0399\3\2\2\2\u03a3\u039b\3\2\2\2\u03a3\u039d\3\2\2\2\u03a3"+
		"\u039f\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4a\3\2\2\2\u03a5\u03b0\5\u00c6"+
		"d\2\u03a6\u03a7\7\u01f1\2\2\u03a7\u03a8\7\u0217\2\2\u03a8\u03b0\7\u021a"+
		"\2\2\u03a9\u03aa\7\u01ef\2\2\u03aa\u03ab\7\u0217\2\2\u03ab\u03b0\7\u021a"+
		"\2\2\u03ac\u03ad\7\u01f0\2\2\u03ad\u03ae\7\u0217\2\2\u03ae\u03b0\7\u021a"+
		"\2\2\u03af\u03a5\3\2\2\2\u03af\u03a6\3\2\2\2\u03af\u03a9\3\2\2\2\u03af"+
		"\u03ac\3\2\2\2\u03b0c\3\2\2\2\u03b1\u03b2\b\63\1\2\u03b2\u03b3\7\u0147"+
		"\2\2\u03b3\u03b4\7\u00e0\2\2\u03b4\u03b5\7\u0217\2\2\u03b5\u03ba\5\u0080"+
		"A\2\u03b6\u03b7\7\u0209\2\2\u03b7\u03b9\5\u0080A\2\u03b8\u03b6\3\2\2\2"+
		"\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd"+
		"\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03be\7\u021a\2\2\u03be\u03bf\5j\66"+
		"\2\u03bf\u03c0\5l\67\2\u03c0\u03c1\5n8\2\u03c1\u03c2\b\63\1\2\u03c2\u03ff"+
		"\3\2\2\2\u03c3\u03c4\b\63\1\2\u03c4\u03c5\7O\2\2\u03c5\u03c6\5\u00d0i"+
		"\2\u03c6\u03c7\7\u00a4\2\2\u03c7\u03c8\7\u00e0\2\2\u03c8\u03c9\7\u0217"+
		"\2\2\u03c9\u03ce\5\u0080A\2\u03ca\u03cb\7\u0209\2\2\u03cb\u03cd\5\u0080"+
		"A\2\u03cc\u03ca\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce"+
		"\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d2\7\u021a"+
		"\2\2\u03d2\u03d3\7\u0156\2\2\u03d3\u03d4\5\u00caf\2\u03d4\u03d5\7\u0217"+
		"\2\2\u03d5\u03da\5\u0080A\2\u03d6\u03d7\7\u0209\2\2\u03d7\u03d9\5\u0080"+
		"A\2\u03d8\u03d6\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da"+
		"\u03db\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03de\7\u021a"+
		"\2\2\u03de\u03df\5j\66\2\u03df\u03e0\5l\67\2\u03e0\u03e1\b\63\1\2\u03e1"+
		"\u03ff\3\2\2\2\u03e2\u03e3\b\63\1\2\u03e3\u03e4\7O\2\2\u03e4\u03e5\5\u00d0"+
		"i\2\u03e5\u03e6\7\u01c9\2\2\u03e6\u03e7\7\u0217\2\2\u03e7\u03ec\5\u0080"+
		"A\2\u03e8\u03e9\7\u0209\2\2\u03e9\u03eb\5\u0080A\2\u03ea\u03e8\3\2\2\2"+
		"\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef"+
		"\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f0\7\u021a\2\2\u03f0\u03f1\5j\66"+
		"\2\u03f1\u03f2\5l\67\2\u03f2\u03f3\5n8\2\u03f3\u03f4\b\63\1\2\u03f4\u03ff"+
		"\3\2\2\2\u03f5\u03f6\7O\2\2\u03f6\u03f7\5\u00d0i\2\u03f7\u03f8\7<\2\2"+
		"\u03f8\u03f9\5\u00a4S\2\u03f9\u03fa\5f\64\2\u03fa\u03fb\5l\67\2\u03fb"+
		"\u03fc\5n8\2\u03fc\u03fd\b\63\1\2\u03fd\u03ff\3\2\2\2\u03fe\u03b1\3\2"+
		"\2\2\u03fe\u03c3\3\2\2\2\u03fe\u03e2\3\2\2\2\u03fe\u03f5\3\2\2\2\u03ff"+
		"e\3\2\2\2\u0400\u0406\b\64\1\2\u0401\u0402\7\u0089\2\2\u0402\u0406\b\64"+
		"\1\2\u0403\u0404\7~\2\2\u0404\u0406\b\64\1\2\u0405\u0400\3\2\2\2\u0405"+
		"\u0401\3\2\2\2\u0405\u0403\3\2\2\2\u0406g\3\2\2\2\u0407\u040b\b\65\1\2"+
		"\u0408\u0409\7\u0089\2\2\u0409\u040b\b\65\1\2\u040a\u0407\3\2\2\2\u040a"+
		"\u0408\3\2\2\2\u040bi\3\2\2\2\u040c\u0410\b\66\1\2\u040d\u040e\7~\2\2"+
		"\u040e\u0410\b\66\1\2\u040f\u040c\3\2\2\2\u040f\u040d\3\2\2\2\u0410k\3"+
		"\2\2\2\u0411\u0415\b\67\1\2\u0412\u0413\7\u0120\2\2\u0413\u0415\b\67\1"+
		"\2\u0414\u0411\3\2\2\2\u0414\u0412\3\2\2\2\u0415m\3\2\2\2\u0416\u041c"+
		"\b8\1\2\u0417\u0418\7\u0164\2\2\u0418\u041c\b8\1\2\u0419\u041a\7\u011d"+
		"\2\2\u041a\u041c\b8\1\2\u041b\u0416\3\2\2\2\u041b\u0417\3\2\2\2\u041b"+
		"\u0419\3\2\2\2\u041co\3\2\2\2\u041d\u0423\b9\1\2\u041e\u041f\7\u00be\2"+
		"\2\u041f\u0420\7\u011e\2\2\u0420\u0421\7\u0093\2\2\u0421\u0423\b9\1\2"+
		"\u0422\u041d\3\2\2\2\u0422\u041e\3\2\2\2\u0423q\3\2\2\2\u0424\u0429\b"+
		":\1\2\u0425\u0426\7\u00be\2\2\u0426\u0427\7\u0093\2\2\u0427\u0429\b:\1"+
		"\2\u0428\u0424\3\2\2\2\u0428\u0425\3\2\2\2\u0429s\3\2\2\2\u042a\u0430"+
		"\b;\1\2\u042b\u042c\7\u0097\2\2\u042c\u0430\b;\1\2\u042d\u042e\7\u01b3"+
		"\2\2\u042e\u0430\b;\1\2\u042f\u042a\3\2\2\2\u042f\u042b\3\2\2\2\u042f"+
		"\u042d\3\2\2\2\u0430u\3\2\2\2\u0431\u0432\5|?\2\u0432\u0433\b<\1\2\u0433"+
		"\u0438\3\2\2\2\u0434\u0435\5x=\2\u0435\u0436\b<\1\2\u0436\u0438\3\2\2"+
		"\2\u0437\u0431\3\2\2\2\u0437\u0434\3\2\2\2\u0438w\3\2\2\2\u0439\u043a"+
		"\b=\1\2\u043a\u043f\5|?\2\u043b\u043c\7\u01c7\2\2\u043c\u043d\5z>\2\u043d"+
		"\u043e\5|?\2\u043e\u0440\3\2\2\2\u043f\u043b\3\2\2\2\u0440\u0441\3\2\2"+
		"\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444"+
		"\b=\1\2\u0444y\3\2\2\2\u0445\u044b\b>\1\2\u0446\u0447\7\25\2\2\u0447\u044b"+
		"\b>\1\2\u0448\u0449\7\177\2\2\u0449\u044b\b>\1\2\u044a\u0445\3\2\2\2\u044a"+
		"\u0446\3\2\2\2\u044a\u0448\3\2\2\2\u044b{\3\2\2\2\u044c\u044d\7\u0185"+
		"\2\2\u044d\u044e\5\u0096L\2\u044e\u044f\5\u0098M\2\u044f\u0450\b?\1\2"+
		"\u0450\u0464\3\2\2\2\u0451\u0452\7\u0185\2\2\u0452\u0453\5\u0096L\2\u0453"+
		"\u0454\5\u00c2b\2\u0454\u0455\b?\1\2\u0455\u0464\3\2\2\2\u0456\u0457\7"+
		"\u0185\2\2\u0457\u0458\5\u0096L\2\u0458\u0459\5\u0098M\2\u0459\u045a\7"+
		"\u00a8\2\2\u045a\u045b\5\u008eH\2\u045b\u045c\5~@\2\u045c\u045d\5\u0082"+
		"B\2\u045d\u045e\5\u0084C\2\u045e\u045f\5\u0086D\2\u045f\u0460\5\u0088"+
		"E\2\u0460\u0461\5\u008cG\2\u0461\u0462\b?\1\2\u0462\u0464\3\2\2\2\u0463"+
		"\u044c\3\2\2\2\u0463\u0451\3\2\2\2\u0463\u0456\3\2\2\2\u0464}\3\2\2\2"+
		"\u0465\u0477\b@\1\2\u0466\u0467\b@\1\2\u0467\u0468\7\u00e4\2\2\u0468\u0469"+
		"\7\u01d7\2\2\u0469\u046a\5\u00c2b\2\u046a\u046b\5\u0080A\2\u046b\u046c"+
		"\7\31\2\2\u046c\u0471\5\u0080A\2\u046d\u046e\7\u0209\2\2\u046e\u0470\5"+
		"\u0080A\2\u046f\u046d\3\2\2\2\u0470\u0473\3\2\2\2\u0471\u046f\3\2\2\2"+
		"\u0471\u0472\3\2\2\2\u0472\u0474\3\2\2\2\u0473\u0471\3\2\2\2\u0474\u0475"+
		"\b@\1\2\u0475\u0477\3\2\2\2\u0476\u0465\3\2\2\2\u0476\u0466\3\2\2\2\u0477"+
		"\177\3\2\2\2\u0478\u0479\5\u00d0i\2\u0479\u047a\bA\1\2\u047a\u0081\3\2"+
		"\2\2\u047b\u0481\bB\1\2\u047c\u047d\7\u01db\2\2\u047d\u047e\5\u00a4S\2"+
		"\u047e\u047f\bB\1\2\u047f\u0481\3\2\2\2\u0480\u047b\3\2\2\2\u0480\u047c"+
		"\3\2\2\2\u0481\u0083\3\2\2\2\u0482\u0491\bC\1\2\u0483\u0484\bC\1\2\u0484"+
		"\u0485\7\u00b2\2\2\u0485\u0486\7.\2\2\u0486\u048b\5\u00a4S\2\u0487\u0488"+
		"\7\u0209\2\2\u0488\u048a\5\u00a4S\2\u0489\u0487\3\2\2\2\u048a\u048d\3"+
		"\2\2\2\u048b\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048e\3\2\2\2\u048d"+
		"\u048b\3\2\2\2\u048e\u048f\bC\1\2\u048f\u0491\3\2\2\2\u0490\u0482\3\2"+
		"\2\2\u0490\u0483\3\2\2\2\u0491\u0085\3\2\2\2\u0492\u0498\bD\1\2\u0493"+
		"\u0494\7\u00b5\2\2\u0494\u0495\5\u00a4S\2\u0495\u0496\bD\1\2\u0496\u0498"+
		"\3\2\2\2\u0497\u0492\3\2\2\2\u0497\u0493\3\2\2\2\u0498\u0087\3\2\2\2\u0499"+
		"\u04ab\bE\1\2\u049a\u049b\bE\1\2\u049b\u049c\7\u012e\2\2\u049c\u049d\7"+
		".\2\2\u049d\u049e\5\u00c8e\2\u049e\u04a5\5\u008aF\2\u049f\u04a0\7\u0209"+
		"\2\2\u04a0\u04a1\5\u00c8e\2\u04a1\u04a2\5\u008aF\2\u04a2\u04a4\3\2\2\2"+
		"\u04a3\u049f\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6"+
		"\3\2\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04a9\bE\1\2\u04a9"+
		"\u04ab\3\2\2\2\u04aa\u0499\3\2\2\2\u04aa\u049a\3\2\2\2\u04ab\u0089\3\2"+
		"\2\2\u04ac\u04b2\bF\1\2\u04ad\u04ae\7\32\2\2\u04ae\u04b2\bF\1\2\u04af"+
		"\u04b0\7y\2\2\u04b0\u04b2\bF\1\2\u04b1\u04ac\3\2\2\2\u04b1\u04ad\3\2\2"+
		"\2\u04b1\u04af\3\2\2\2\u04b2\u008b\3\2\2\2\u04b3\u04bd\bG\1\2\u04b4\u04b5"+
		"\7\u00eb\2\2\u04b5\u04b6\7\u021f\2\2\u04b6\u04bd\bG\1\2\u04b7\u04b8\7"+
		"\u00eb\2\2\u04b8\u04b9\7\u021f\2\2\u04b9\u04ba\7\u0209\2\2\u04ba\u04bb"+
		"\7\u021f\2\2\u04bb\u04bd\bG\1\2\u04bc\u04b3\3\2\2\2\u04bc\u04b4\3\2\2"+
		"\2\u04bc\u04b7\3\2\2\2\u04bd\u008d\3\2\2\2\u04be\u04bf\5\u0094K\2\u04bf"+
		"\u04c0\bH\1\2\u04c0\u04d5\3\2\2\2\u04c1\u04c2\bH\1\2\u04c2\u04c5\5\u0094"+
		"K\2\u04c3\u04c4\7\u0209\2\2\u04c4\u04c6\5\u0094K\2\u04c5\u04c3\3\2\2\2"+
		"\u04c6\u04c7\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9"+
		"\3\2\2\2\u04c9\u04ca\bH\1\2\u04ca\u04d5\3\2\2\2\u04cb\u04cc\bH\1\2\u04cc"+
		"\u04ce\5\u0094K\2\u04cd\u04cf\5\u0090I\2\u04ce\u04cd\3\2\2\2\u04cf\u04d0"+
		"\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u04d3\bH\1\2\u04d3\u04d5\3\2\2\2\u04d4\u04be\3\2\2\2\u04d4\u04c1\3\2"+
		"\2\2\u04d4\u04cb\3\2\2\2\u04d5\u008f\3\2\2\2\u04d6\u04d8\7\u00c8\2\2\u04d7"+
		"\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\7\u00dd"+
		"\2\2\u04da\u04db\5\u0094K\2\u04db\u04dc\bI\1\2\u04dc\u04fa\3\2\2\2\u04dd"+
		"\u04df\7\u00c8\2\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0"+
		"\3\2\2\2\u04e0\u04e1\7\u00dd\2\2\u04e1\u04e2\5\u0094K\2\u04e2\u04e3\5"+
		"\u0092J\2\u04e3\u04e4\bI\1\2\u04e4\u04fa\3\2\2\2\u04e5\u04e7\t\4\2\2\u04e6"+
		"\u04e8\7\u0130\2\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9"+
		"\3\2\2\2\u04e9\u04ea\7\u00dd\2\2\u04ea\u04eb\5\u0094K\2\u04eb\u04ec\5"+
		"\u0092J\2\u04ec\u04ed\bI\1\2\u04ed\u04fa\3\2\2\2\u04ee\u04ef\7]\2\2\u04ef"+
		"\u04f0\7\u00dd\2\2\u04f0\u04f1\5\u0094K\2\u04f1\u04f2\bI\1\2\u04f2\u04fa"+
		"\3\2\2\2\u04f3\u04f4\7]\2\2\u04f4\u04f5\7\u00dd\2\2\u04f5\u04f6\5\u0094"+
		"K\2\u04f6\u04f7\5\u0092J\2\u04f7\u04f8\bI\1\2\u04f8\u04fa\3\2\2\2\u04f9"+
		"\u04d7\3\2\2\2\u04f9\u04de\3\2\2\2\u04f9\u04e5\3\2\2\2\u04f9\u04ee\3\2"+
		"\2\2\u04f9\u04f3\3\2\2\2\u04fa\u0091\3\2\2\2\u04fb\u04fc\7\u0129\2\2\u04fc"+
		"\u04fd\5\u00a4S\2\u04fd\u04fe\bJ\1\2\u04fe\u0093\3\2\2\2\u04ff\u0500\5"+
		"\u00caf\2\u0500\u0501\bK\1\2\u0501\u051c\3\2\2\2\u0502\u0504\5\u00caf"+
		"\2\u0503\u0505\7\31\2\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u0506\3\2\2\2\u0506\u0507\5\u00d0i\2\u0507\u0508\bK\1\2\u0508\u051c\3"+
		"\2\2\2\u0509\u050a\7\u0217\2\2\u050a\u050b\5x=\2\u050b\u050d\7\u021a\2"+
		"\2\u050c\u050e\7\31\2\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e"+
		"\u050f\3\2\2\2\u050f\u0510\5\u00d0i\2\u0510\u0511\bK\1\2\u0511\u051c\3"+
		"\2\2\2\u0512\u0513\7\u0217\2\2\u0513\u0514\5|?\2\u0514\u0516\7\u021a\2"+
		"\2\u0515\u0517\7\31\2\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517"+
		"\u0518\3\2\2\2\u0518\u0519\5\u00d0i\2\u0519\u051a\bK\1\2\u051a\u051c\3"+
		"\2\2\2\u051b\u04ff\3\2\2\2\u051b\u0502\3\2\2\2\u051b\u0509\3\2\2\2\u051b"+
		"\u0512\3\2\2\2\u051c\u0095\3\2\2\2\u051d\u0523\bL\1\2\u051e\u051f\7\25"+
		"\2\2\u051f\u0523\bL\1\2\u0520\u0521\7\177\2\2\u0521\u0523\bL\1\2\u0522"+
		"\u051d\3\2\2\2\u0522\u051e\3\2\2\2\u0522\u0520\3\2\2\2\u0523\u0097\3\2"+
		"\2\2\u0524\u0525\bM\1\2\u0525\u052a\5\u009aN\2\u0526\u0527\7\u0209\2\2"+
		"\u0527\u0529\5\u009aN\2\u0528\u0526\3\2\2\2\u0529\u052c\3\2\2\2\u052a"+
		"\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052d\3\2\2\2\u052c\u052a\3\2"+
		"\2\2\u052d\u052e\bM\1\2\u052e\u0099\3\2\2\2\u052f\u0531\5\u00a4S\2\u0530"+
		"\u0532\7\31\2\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3"+
		"\2\2\2\u0533\u0534\5\u00d0i\2\u0534\u0535\bN\1\2\u0535\u0555\3\2\2\2\u0536"+
		"\u0537\5\u00a4S\2\u0537\u0538\bN\1\2\u0538\u0555\3\2\2\2\u0539\u053b\5"+
		"\u00a4S\2\u053a\u053c\7\31\2\2\u053b\u053a\3\2\2\2\u053b\u053c\3\2\2\2"+
		"\u053c\u053d\3\2\2\2\u053d\u053e\5\u00d0i\2\u053e\u053f\bN\1\2\u053f\u0555"+
		"\3\2\2\2\u0540\u0541\5\u00a4S\2\u0541\u0542\bN\1\2\u0542\u0555\3\2\2\2"+
		"\u0543\u0544\7\u0215\2\2\u0544\u0555\bN\1\2\u0545\u0546\5\u00d0i\2\u0546"+
		"\u0547\7\4\2\2\u0547\u0548\7\u0215\2\2\u0548\u0549\bN\1\2\u0549\u0555"+
		"\3\2\2\2\u054a\u054b\5\u009cO\2\u054b\u054c\bN\1\2\u054c\u0555\3\2\2\2"+
		"\u054d\u054f\5\u009cO\2\u054e\u0550\7\31\2\2\u054f\u054e\3\2\2\2\u054f"+
		"\u0550\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\5\u00d0i\2\u0552\u0553"+
		"\bN\1\2\u0553\u0555\3\2\2\2\u0554\u052f\3\2\2\2\u0554\u0536\3\2\2\2\u0554"+
		"\u0539\3\2\2\2\u0554\u0540\3\2\2\2\u0554\u0543\3\2\2\2\u0554\u0545\3\2"+
		"\2\2\u0554\u054a\3\2\2\2\u0554\u054d\3\2\2\2\u0555\u009b\3\2\2\2\u0556"+
		"\u0557\bO\1\2\u0557\u0558\5\u009eP\2\u0558\u0559\7\u0132\2\2\u0559\u055a"+
		"\7\u0217\2\2\u055a\u055b\7\u0138\2\2\u055b\u055c\7.\2\2\u055c\u0561\5"+
		"\u00c8e\2\u055d\u055e\7\u0209\2\2\u055e\u0560\5\u00c8e\2\u055f\u055d\3"+
		"\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562"+
		"\u0564\3\2\2\2\u0563\u0561\3\2\2\2\u0564\u0565\7\u021a\2\2\u0565\u0566"+
		"\bO\1\2\u0566\u0594\3\2\2\2\u0567\u0568\bO\1\2\u0568\u0569\5\u009eP\2"+
		"\u0569\u056a\7\u0132\2\2\u056a\u056b\7\u0217\2\2\u056b\u056c\7\u012e\2"+
		"\2\u056c\u056d\7.\2\2\u056d\u0572\5\u00c8e\2\u056e\u056f\7\u0209\2\2\u056f"+
		"\u0571\5\u00c8e\2\u0570\u056e\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570"+
		"\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0575\3\2\2\2\u0574\u0572\3\2\2\2\u0575"+
		"\u0576\7\u021a\2\2\u0576\u0577\bO\1\2\u0577\u0594\3\2\2\2\u0578\u0579"+
		"\bO\1\2\u0579\u057a\5\u009eP\2\u057a\u057b\7\u0132\2\2\u057b\u057c\7\u0217"+
		"\2\2\u057c\u057d\7\u0138\2\2\u057d\u057e\7.\2\2\u057e\u0583\5\u00c8e\2"+
		"\u057f\u0580\7\u0209\2\2\u0580\u0582\5\u00c8e\2\u0581\u057f\3\2\2\2\u0582"+
		"\u0585\3\2\2\2\u0583\u0581\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2"+
		"\2\2\u0585\u0583\3\2\2\2\u0586\u0587\7\u012e\2\2\u0587\u0588\7.\2\2\u0588"+
		"\u058d\5\u00c8e\2\u0589\u058a\7\u0209\2\2\u058a\u058c\5\u00c8e\2\u058b"+
		"\u0589\3\2\2\2\u058c\u058f\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2"+
		"\2\2\u058e\u0590\3\2\2\2\u058f\u058d\3\2\2\2\u0590\u0591\7\u021a\2\2\u0591"+
		"\u0592\bO\1\2\u0592\u0594\3\2\2\2\u0593\u0556\3\2\2\2\u0593\u0567\3\2"+
		"\2\2\u0593\u0578\3\2\2\2\u0594\u009d\3\2\2\2\u0595\u0596\5\u00be`\2\u0596"+
		"\u0597\bP\1\2\u0597\u059c\3\2\2\2\u0598\u0599\5\u00a0Q\2\u0599\u059a\b"+
		"P\1\2\u059a\u059c\3\2\2\2\u059b\u0595\3\2\2\2\u059b\u0598\3\2\2\2\u059c"+
		"\u009f\3\2\2\2\u059d\u059e\t\5\2\2\u059e\u059f\7\u0217\2\2\u059f\u05a0"+
		"\7\u021a\2\2\u05a0\u05a1\bQ\1\2\u05a1\u00a1\3\2\2\2\u05a2\u05a3\bR\1\2"+
		"\u05a3\u05a4\7\u0217\2\2\u05a4\u05a9\5\u00a4S\2\u05a5\u05a6\7\u0209\2"+
		"\2\u05a6\u05a8\5\u00a4S\2\u05a7\u05a5\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9"+
		"\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05a9\3\2"+
		"\2\2\u05ac\u05ad\7\u021a\2\2\u05ad\u05ae\bR\1\2\u05ae\u00a3\3\2\2\2\u05af"+
		"\u05b0\bS\1\2\u05b0\u05b1\5\u00c6d\2\u05b1\u05b2\bS\1\2\u05b2\u05de\3"+
		"\2\2\2\u05b3\u05b4\5\u00c8e\2\u05b4\u05b5\bS\1\2\u05b5\u05de\3\2\2\2\u05b6"+
		"\u05b7\5\u00dep\2\u05b7\u05b8\5\u00a4S\16\u05b8\u05b9\bS\1\2\u05b9\u05de"+
		"\3\2\2\2\u05ba\u05bb\7\u0217\2\2\u05bb\u05bc\5\u00a4S\2\u05bc\u05bd\7"+
		"\u021a\2\2\u05bd\u05be\bS\1\2\u05be\u05de\3\2\2\2\u05bf\u05c0\5\u00bc"+
		"_\2\u05c0\u05c1\bS\1\2\u05c1\u05de\3\2\2\2\u05c2\u05c3\5\u00c4c\2\u05c3"+
		"\u05c4\bS\1\2\u05c4\u05de\3\2\2\2\u05c5\u05c6\5\u00ba^\2\u05c6\u05c7\b"+
		"S\1\2\u05c7\u05de\3\2\2\2\u05c8\u05c9\5\u00b8]\2\u05c9\u05ca\bS\1\2\u05ca"+
		"\u05de\3\2\2\2\u05cb\u05cc\5\u00b0Y\2\u05cc\u05cd\bS\1\2\u05cd\u05de\3"+
		"\2\2\2\u05ce\u05cf\5\u00b4[\2\u05cf\u05d0\bS\1\2\u05d0\u05de\3\2\2\2\u05d1"+
		"\u05d2\5\u00b2Z\2\u05d2\u05d3\bS\1\2\u05d3\u05de\3\2\2\2\u05d4\u05d5\5"+
		"\u00c0a\2\u05d5\u05d6\bS\1\2\u05d6\u05de\3\2\2\2\u05d7\u05d8\5\u00a6T"+
		"\2\u05d8\u05d9\bS\1\2\u05d9\u05de\3\2\2\2\u05da\u05db\5\30\r\2\u05db\u05dc"+
		"\bS\1\2\u05dc\u05de\3\2\2\2\u05dd\u05af\3\2\2\2\u05dd\u05b3\3\2\2\2\u05dd"+
		"\u05b6\3\2\2\2\u05dd\u05ba\3\2\2\2\u05dd\u05bf\3\2\2\2\u05dd\u05c2\3\2"+
		"\2\2\u05dd\u05c5\3\2\2\2\u05dd\u05c8\3\2\2\2\u05dd\u05cb\3\2\2\2\u05dd"+
		"\u05ce\3\2\2\2\u05dd\u05d1\3\2\2\2\u05dd\u05d4\3\2\2\2\u05dd\u05d7\3\2"+
		"\2\2\u05dd\u05da\3\2\2\2\u05de\u0635\3\2\2\2\u05df\u05e0\f\37\2\2\u05e0"+
		"\u05e1\t\6\2\2\u05e1\u05e2\5\u00a4S \u05e2\u05e3\bS\1\2\u05e3\u0634\3"+
		"\2\2\2\u05e4\u05e5\f\36\2\2\u05e5\u05e6\t\7\2\2\u05e6\u05e7\5\u00a4S\37"+
		"\u05e7\u05e8\bS\1\2\u05e8\u0634\3\2\2\2\u05e9\u05ea\f\35\2\2\u05ea\u05eb"+
		"\t\b\2\2\u05eb\u05ec\5\u00a4S\36\u05ec\u05ed\bS\1\2\u05ed\u0634\3\2\2"+
		"\2\u05ee\u05ef\f\34\2\2\u05ef\u05f0\t\t\2\2\u05f0\u05f1\5\u00a4S\35\u05f1"+
		"\u05f2\bS\1\2\u05f2\u0634\3\2\2\2\u05f3\u05f4\f\33\2\2\u05f4\u05f5\t\n"+
		"\2\2\u05f5\u05f6\5\u00a4S\34\u05f6\u05f7\bS\1\2\u05f7\u0634\3\2\2\2\u05f8"+
		"\u05f9\f\32\2\2\u05f9\u05fa\7\27\2\2\u05fa\u05fb\5\u00a4S\33\u05fb\u05fc"+
		"\bS\1\2\u05fc\u0634\3\2\2\2\u05fd\u05fe\f\31\2\2\u05fe\u05ff\7\u012c\2"+
		"\2\u05ff\u0600\5\u00a4S\32\u0600\u0601\bS\1\2\u0601\u0634\3\2\2\2\u0602"+
		"\u0603\f\26\2\2\u0603\u0604\7%\2\2\u0604\u0605\5\u00a4S\2\u0605\u0606"+
		"\7\27\2\2\u0606\u0607\5\u00a4S\27\u0607\u0608\bS\1\2\u0608\u0634\3\2\2"+
		"\2\u0609\u060a\f\25\2\2\u060a\u060b\7\u011e\2\2\u060b\u060c\7%\2\2\u060c"+
		"\u060d\5\u00a4S\2\u060d\u060e\7\27\2\2\u060e\u060f\5\u00a4S\26\u060f\u0610"+
		"\bS\1\2\u0610\u0634\3\2\2\2\u0611\u0612\f\21\2\2\u0612\u0613\5\u00d8m"+
		"\2\u0613\u0614\5\u00a4S\22\u0614\u0615\bS\1\2\u0615\u0634\3\2\2\2\u0616"+
		"\u0617\f\30\2\2\u0617\u0618\5\u00d6l\2\u0618\u0619\7\17\2\2\u0619\u061a"+
		"\bS\1\2\u061a\u0634\3\2\2\2\u061b\u061c\f\27\2\2\u061c\u061d\5\u00d6l"+
		"\2\u061d\u061e\7\16\2\2\u061e\u061f\bS\1\2\u061f\u0634\3\2\2\2\u0620\u0621"+
		"\f\24\2\2\u0621\u0622\5\u00dan\2\u0622\u0623\5\u00a2R\2\u0623\u0624\b"+
		"S\1\2\u0624\u0634\3\2\2\2\u0625\u0626\f\23\2\2\u0626\u0627\5\u00dan\2"+
		"\u0627\u0628\7\u0217\2\2\u0628\u0629\5|?\2\u0629\u062a\7\u021a\2\2\u062a"+
		"\u062b\bS\1\2\u062b\u0634\3\2\2\2\u062c\u062d\f\22\2\2\u062d\u062e\5\u00dc"+
		"o\2\u062e\u062f\7\u0217\2\2\u062f\u0630\5|?\2\u0630\u0631\7\u021a\2\2"+
		"\u0631\u0632\bS\1\2\u0632\u0634\3\2\2\2\u0633\u05df\3\2\2\2\u0633\u05e4"+
		"\3\2\2\2\u0633\u05e9\3\2\2\2\u0633\u05ee\3\2\2\2\u0633\u05f3\3\2\2\2\u0633"+
		"\u05f8\3\2\2\2\u0633\u05fd\3\2\2\2\u0633\u0602\3\2\2\2\u0633\u0609\3\2"+
		"\2\2\u0633\u0611\3\2\2\2\u0633\u0616\3\2\2\2\u0633\u061b\3\2\2\2\u0633"+
		"\u0620\3\2\2\2\u0633\u0625\3\2\2\2\u0633\u062c\3\2\2\2\u0634\u0637\3\2"+
		"\2\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u00a5\3\2\2\2\u0637"+
		"\u0635\3\2\2\2\u0638\u0639\5\u00a8U\2\u0639\u063a\bT\1\2\u063a\u0661\3"+
		"\2\2\2\u063b\u063c\5\u00aaV\2\u063c\u063d\bT\1\2\u063d\u0661\3\2\2\2\u063e"+
		"\u063f\5\u00acW\2\u063f\u0640\bT\1\2\u0640\u0661\3\2\2\2\u0641\u0642\5"+
		"\u00aeX\2\u0642\u0643\bT\1\2\u0643\u0661\3\2\2\2\u0644\u0645\5\u00c8e"+
		"\2\u0645\u0646\7\u0218\2\2\u0646\u0647\5\u00a4S\2\u0647\u0648\7\u021b"+
		"\2\2\u0648\u0649\bT\1\2\u0649\u0661\3\2\2\2\u064a\u064b\5\u00a8U\2\u064b"+
		"\u064c\7\u0218\2\2\u064c\u064d\5\u00a4S\2\u064d\u064e\7\u021b\2\2\u064e"+
		"\u064f\bT\1\2\u064f\u0661\3\2\2\2\u0650\u0651\5\u00aaV\2\u0651\u0652\7"+
		"\u0218\2\2\u0652\u0653\5\u00a4S\2\u0653\u0654\7\u021b\2\2\u0654\u0655"+
		"\bT\1\2\u0655\u0661\3\2\2\2\u0656\u0657\5\u00c8e\2\u0657\u0658\7\4\2\2"+
		"\u0658\u0659\5\u00a4S\2\u0659\u065a\bT\1\2\u065a\u0661\3\2\2\2\u065b\u065c"+
		"\5\u00acW\2\u065c\u065d\7\4\2\2\u065d\u065e\5\u00a4S\2\u065e\u065f\bT"+
		"\1\2\u065f\u0661\3\2\2\2\u0660\u0638\3\2\2\2\u0660\u063b\3\2\2\2\u0660"+
		"\u063e\3\2\2\2\u0660\u0641\3\2\2\2\u0660\u0644\3\2\2\2\u0660\u064a\3\2"+
		"\2\2\u0660\u0650\3\2\2\2\u0660\u0656\3\2\2\2\u0660\u065b\3\2\2\2\u0661"+
		"\u00a7\3\2\2\2\u0662\u0663\bU\1\2\u0663\u0664\7\30\2\2\u0664\u0665\7\u0217"+
		"\2\2\u0665\u066a\5\u00a4S\2\u0666\u0667\7\u0209\2\2\u0667\u0669\5\u00a4"+
		"S\2\u0668\u0666\3\2\2\2\u0669\u066c\3\2\2\2\u066a\u0668\3\2\2\2\u066a"+
		"\u066b\3\2\2\2\u066b\u066d\3\2\2\2\u066c\u066a\3\2\2\2\u066d\u066e\7\u021a"+
		"\2\2\u066e\u066f\bU\1\2\u066f\u00a9\3\2\2\2\u0670\u0671\bV\1\2\u0671\u0672"+
		"\7\u00fe\2\2\u0672\u0673\7\u0217\2\2\u0673\u0674\5\u00a4S\2\u0674\u0675"+
		"\7\u0209\2\2\u0675\u067d\5\u00a4S\2\u0676\u0677\7\u0209\2\2\u0677\u0678"+
		"\5\u00a4S\2\u0678\u0679\7\u0209\2\2\u0679\u067a\5\u00a4S\2\u067a\u067c"+
		"\3\2\2\2\u067b\u0676\3\2\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d"+
		"\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u067d\3\2\2\2\u0680\u0681\7\u021a"+
		"\2\2\u0681\u0682\bV\1\2\u0682\u00ab\3\2\2\2\u0683\u0684\bW\1\2\u0684\u0685"+
		"\7\u01a7\2\2\u0685\u0686\7\u0217\2\2\u0686\u068b\5\u00a4S\2\u0687\u0688"+
		"\7\u0209\2\2\u0688\u068a\5\u00a4S\2\u0689\u0687\3\2\2\2\u068a\u068d\3"+
		"\2\2\2\u068b\u0689\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068e\3\2\2\2\u068d"+
		"\u068b\3\2\2\2\u068e\u068f\7\u021a\2\2\u068f\u0690\bW\1\2\u0690\u00ad"+
		"\3\2\2\2\u0691\u0692\bX\1\2\u0692\u0693\7\u0112\2\2\u0693\u0694\7\u0217"+
		"\2\2\u0694\u0695\5\u00a4S\2\u0695\u0696\7\u0209\2\2\u0696\u069e\5\u00a4"+
		"S\2\u0697\u0698\7\u0209\2\2\u0698\u0699\5\u00a4S\2\u0699\u069a\7\u0209"+
		"\2\2\u069a\u069b\5\u00a4S\2\u069b\u069d\3\2\2\2\u069c\u0697\3\2\2\2\u069d"+
		"\u06a0\3\2\2\2\u069e\u069c\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a1\3\2"+
		"\2\2\u06a0\u069e\3\2\2\2\u06a1\u06a2\7\u021a\2\2\u06a2\u06a3\bX\1\2\u06a3"+
		"\u00af\3\2\2\2\u06a4\u06a5\7\33\2\2\u06a5\u06a6\7\u0217\2\2\u06a6\u06a7"+
		"\5\u00a4S\2\u06a7\u06a8\7\u021a\2\2\u06a8\u06a9\bY\1\2\u06a9\u08a6\3\2"+
		"\2\2\u06aa\u06ab\7#\2\2\u06ab\u06ac\7\u0217\2\2\u06ac\u06ad\5\u00a4S\2"+
		"\u06ad\u06ae\7\u021a\2\2\u06ae\u06af\bY\1\2\u06af\u08a6\3\2\2\2\u06b0"+
		"\u06b1\7:\2\2\u06b1\u06b2\7\u0217\2\2\u06b2\u06b3\5\u00a4S\2\u06b3\u06b4"+
		"\7\u021a\2\2\u06b4\u06b5\bY\1\2\u06b5\u08a6\3\2\2\2\u06b6\u06b7\7=\2\2"+
		"\u06b7\u06b8\7\u0217\2\2\u06b8\u06b9\5\u00a4S\2\u06b9\u06ba\7\u021a\2"+
		"\2\u06ba\u06bb\bY\1\2\u06bb\u08a6\3\2\2\2\u06bc\u06bd\bY\1\2\u06bd\u06be"+
		"\7L\2\2\u06be\u06bf\7\u0217\2\2\u06bf\u06c2\5\u00a4S\2\u06c0\u06c1\7\u0209"+
		"\2\2\u06c1\u06c3\5\u00a4S\2\u06c2\u06c0\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4"+
		"\u06c2\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c7\7\u021a"+
		"\2\2\u06c7\u06c8\bY\1\2\u06c8\u08a6\3\2\2\2\u06c9\u06ca\bY\1\2\u06ca\u06cb"+
		"\7M\2\2\u06cb\u06cc\7\u0217\2\2\u06cc\u06cd\5\u00a4S\2\u06cd\u06ce\7\u0209"+
		"\2\2\u06ce\u06d1\5\u00a4S\2\u06cf\u06d0\7\u0209\2\2\u06d0\u06d2\5\u00a4"+
		"S\2\u06d1\u06cf\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d3"+
		"\u06d4\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6\7\u021a\2\2\u06d6\u06d7"+
		"\bY\1\2\u06d7\u08a6\3\2\2\2\u06d8\u06d9\7n\2\2\u06d9\u06da\7\u0217\2\2"+
		"\u06da\u06db\5\u00a4S\2\u06db\u06dc\7\u0209\2\2\u06dc\u06dd\5\u00a4S\2"+
		"\u06dd\u06de\7\u021a\2\2\u06de\u06df\bY\1\2\u06df\u08a6\3\2\2\2\u06e0"+
		"\u06e1\bY\1\2\u06e1\u06e2\7\u0088\2\2\u06e2\u06e3\7\u0217\2\2\u06e3\u06e4"+
		"\5\u00a4S\2\u06e4\u06e5\7\u0209\2\2\u06e5\u06ea\5\u00a4S\2\u06e6\u06e7"+
		"\7\u0209\2\2\u06e7\u06e9\5\u00a4S\2\u06e8\u06e6\3\2\2\2\u06e9\u06ec\3"+
		"\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\3\2\2\2\u06ec"+
		"\u06ea\3\2\2\2\u06ed\u06ee\7\u021a\2\2\u06ee\u06ef\bY\1\2\u06ef\u08a6"+
		"\3\2\2\2\u06f0\u06f1\7\u008a\2\2\u06f1\u06f2\7\u0217\2\2\u06f2\u06f3\5"+
		"\u00a4S\2\u06f3\u06f4\7\u0209\2\2\u06f4\u06f5\5\u00a4S\2\u06f5\u06f6\7"+
		"\u021a\2\2\u06f6\u06f7\bY\1\2\u06f7\u08a6\3\2\2\2\u06f8\u06f9\bY\1\2\u06f9"+
		"\u06fa\7\u009c\2\2\u06fa\u06fb\7\u0217\2\2\u06fb\u06fc\5\u00a4S\2\u06fc"+
		"\u06fd\7\u0209\2\2\u06fd\u0702\5\u00a4S\2\u06fe\u06ff\7\u0209\2\2\u06ff"+
		"\u0701\5\u00a4S\2\u0700\u06fe\3\2\2\2\u0701\u0704\3\2\2\2\u0702\u0700"+
		"\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0705\3\2\2\2\u0704\u0702\3\2\2\2\u0705"+
		"\u0706\7\u021a\2\2\u0706\u0707\bY\1\2\u0707\u08a6\3\2\2\2\u0708\u0709"+
		"\7\u009e\2\2\u0709\u070a\7\u0217\2\2\u070a\u070b\5\u00a4S\2\u070b\u070c"+
		"\7\u0209\2\2\u070c\u070d\5\u00a4S\2\u070d\u070e\7\u021a\2\2\u070e\u070f"+
		"\bY\1\2\u070f\u08a6\3\2\2\2\u0710\u0711\7\u00a6\2\2\u0711\u0712\7\u0217"+
		"\2\2\u0712\u0713\5\u00a4S\2\u0713\u0714\7\u0209\2\2\u0714\u0715\5\u00a4"+
		"S\2\u0715\u0716\7\u021a\2\2\u0716\u0717\bY\1\2\u0717\u08a6\3\2\2\2\u0718"+
		"\u0719\7\u00ae\2\2\u0719\u071a\7\u0217\2\2\u071a\u071b\5\u00a4S\2\u071b"+
		"\u071c\7\u0209\2\2\u071c\u071d\5\u00a4S\2\u071d\u071e\7\u021a\2\2\u071e"+
		"\u071f\bY\1\2\u071f\u08a6\3\2\2\2\u0720\u0721\7\u00c4\2\2\u0721\u0722"+
		"\7\u0217\2\2\u0722\u0723\5\u00a4S\2\u0723\u0724\7\u0209\2\2\u0724\u0725"+
		"\5\u00a4S\2\u0725\u0726\7\u021a\2\2\u0726\u0727\bY\1\2\u0727\u08a6\3\2"+
		"\2\2\u0728\u0729\7\u00cc\2\2\u0729\u072a\7\u0217\2\2\u072a\u072b\5\u00a4"+
		"S\2\u072b\u072c\7\u0209\2\2\u072c\u072d\5\u00a4S\2\u072d\u072e\7\u021a"+
		"\2\2\u072e\u072f\bY\1\2\u072f\u08a6\3\2\2\2\u0730\u0731\7\u00e8\2\2\u0731"+
		"\u0732\7\u0217\2\2\u0732\u0733\5\u00a4S\2\u0733\u0734\7\u021a\2\2\u0734"+
		"\u0735\bY\1\2\u0735\u08a6\3\2\2\2\u0736\u0737\7\u00ee\2\2\u0737\u0738"+
		"\7\u0217\2\2\u0738\u0739\5\u00a4S\2\u0739\u073a\7\u0209\2\2\u073a\u073b"+
		"\5\u00a4S\2\u073b\u073c\7\u021a\2\2\u073c\u073d\bY\1\2\u073d\u08a6\3\2"+
		"\2\2\u073e\u073f\7\u00ee\2\2\u073f\u0740\7\u0217\2\2\u0740\u0741\5\u00a4"+
		"S\2\u0741\u0742\7\u0209\2\2\u0742\u0743\5\u00a4S\2\u0743\u0744\7\u0209"+
		"\2\2\u0744\u0745\5\u00a4S\2\u0745\u0746\7\u021a\2\2\u0746\u0747\bY\1\2"+
		"\u0747\u08a6\3\2\2\2\u0748\u0749\t\13\2\2\u0749\u074a\7\u0217\2\2\u074a"+
		"\u074b\5\u00a4S\2\u074b\u074c\7\u021a\2\2\u074c\u074d\bY\1\2\u074d\u08a6"+
		"\3\2\2\2\u074e\u074f\7\u00fb\2\2\u074f\u0750\7\u0217\2\2\u0750\u0751\5"+
		"\u00a4S\2\u0751\u0752\7\u0209\2\2\u0752\u0753\5\u00a4S\2\u0753\u0754\7"+
		"\u0209\2\2\u0754\u0755\5\u00a4S\2\u0755\u0756\7\u021a\2\2\u0756\u0757"+
		"\bY\1\2\u0757\u08a6\3\2\2\2\u0758\u0759\7\u00fd\2\2\u0759\u075a\7\u0217"+
		"\2\2\u075a\u075b\5\u00a4S\2\u075b\u075c\7\u021a\2\2\u075c\u075d\bY\1\2"+
		"\u075d\u08a6\3\2\2\2\u075e\u075f\7\u0127\2\2\u075f\u0760\7\u0217\2\2\u0760"+
		"\u0761\5\u00a4S\2\u0761\u0762\7\u021a\2\2\u0762\u0763\bY\1\2\u0763\u08a6"+
		"\3\2\2\2\u0764\u0765\7\u0137\2\2\u0765\u0766\7\u0217\2\2\u0766\u0767\5"+
		"\u00a4S\2\u0767\u0768\7\u0209\2\2\u0768\u0769\5\u00a4S\2\u0769\u076a\7"+
		"\u021a\2\2\u076a\u076b\bY\1\2\u076b\u08a6\3\2\2\2\u076c\u076d\7\u0137"+
		"\2\2\u076d\u076e\7\u0217\2\2\u076e\u076f\5\u00a4S\2\u076f\u0770\7\u0209"+
		"\2\2\u0770\u0771\5\u00a4S\2\u0771\u0772\7\u0209\2\2\u0772\u0773\5\u00a4"+
		"S\2\u0773\u0774\7\u021a\2\2\u0774\u0775\bY\1\2\u0775\u08a6\3\2\2\2\u0776"+
		"\u0777\bY\1\2\u0777\u0778\7\u0148\2\2\u0778\u0779\7\u0217\2\2\u0779\u077a"+
		"\5\u00a4S\2\u077a\u077b\7\u0209\2\2\u077b\u077e\5\u00a4S\2\u077c\u077d"+
		"\7\u0209\2\2\u077d\u077f\5\u00a4S\2\u077e\u077c\3\2\2\2\u077f\u0780\3"+
		"\2\2\2\u0780\u077e\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0782\3\2\2\2\u0782"+
		"\u0783\7\u021a\2\2\u0783\u0784\bY\1\2\u0784\u08a6\3\2\2\2\u0785\u0786"+
		"\7\u0150\2\2\u0786\u0787\7\u0217\2\2\u0787\u0788\5\u00a4S\2\u0788\u0789"+
		"\7\u021a\2\2\u0789\u078a\bY\1\2\u078a\u08a6\3\2\2\2\u078b\u078c\7\u0159"+
		"\2\2\u078c\u078d\7\u0217\2\2\u078d\u078e\5\u00a4S\2\u078e\u078f\7\u0209"+
		"\2\2\u078f\u0790\5\u00a4S\2\u0790\u0791\7\u0209\2\2\u0791\u0792\5\u00a4"+
		"S\2\u0792\u0793\7\u021a\2\2\u0793\u0794\bY\1\2\u0794\u08a6\3\2\2\2\u0795"+
		"\u0796\7\u015a\2\2\u0796\u0797\7\u0217\2\2\u0797\u0798\5\u00a4S\2\u0798"+
		"\u0799\7\u0209\2\2\u0799\u079a\5\u00a4S\2\u079a\u079b\7\u0209\2\2\u079b"+
		"\u079c\5\u00a4S\2\u079c\u079d\7\u021a\2\2\u079d\u079e\bY\1\2\u079e\u08a6"+
		"\3\2\2\2\u079f\u07a0\7\u0165\2\2\u07a0\u07a1\7\u0217\2\2\u07a1\u07a2\5"+
		"\u00a4S\2\u07a2\u07a3\7\u0209\2\2\u07a3\u07a4\5\u00a4S\2\u07a4\u07a5\7"+
		"\u021a\2\2\u07a5\u07a6\bY\1\2\u07a6\u08a6\3\2\2\2\u07a7\u07a8\7\u0166"+
		"\2\2\u07a8\u07a9\7\u0217\2\2\u07a9\u07aa\5\u00a4S\2\u07aa\u07ab\7\u0209"+
		"\2\2\u07ab\u07ac\5\u00a4S\2\u07ac\u07ad\7\u0209\2\2\u07ad\u07ae\5\u00a4"+
		"S\2\u07ae\u07af\7\u021a\2\2\u07af\u07b0\bY\1\2\u07b0\u08a6\3\2\2\2\u07b1"+
		"\u07b2\7\u016d\2\2\u07b2\u07b3\7\u0217\2\2\u07b3\u07b4\5\u00a4S\2\u07b4"+
		"\u07b5\7\u021a\2\2\u07b5\u07b6\bY\1\2\u07b6\u08a6\3\2\2\2\u07b7\u07b8"+
		"\7\u0177\2\2\u07b8\u07b9\7\u0217\2\2\u07b9\u07ba\5\u00a4S\2\u07ba\u07bb"+
		"\7\u0209\2\2\u07bb\u07bc\5\u00a4S\2\u07bc\u07bd\7\u0209\2\2\u07bd\u07be"+
		"\5\u00a4S\2\u07be\u07bf\7\u021a\2\2\u07bf\u07c0\bY\1\2\u07c0\u08a6\3\2"+
		"\2\2\u07c1\u07c2\7\u017a\2\2\u07c2\u07c3\7\u0217\2\2\u07c3\u07c4\5\u00a4"+
		"S\2\u07c4\u07c5\7\u021a\2\2\u07c5\u07c6\bY\1\2\u07c6\u08a6\3\2\2\2\u07c7"+
		"\u07c8\7\u0187\2\2\u07c8\u07c9\7\u0217\2\2\u07c9\u07ca\5\u00a4S\2\u07ca"+
		"\u07cb\7\u0209\2\2\u07cb\u07cc\5\u00a4S\2\u07cc\u07cd\7\u0209\2\2\u07cd"+
		"\u07ce\5\u00a4S\2\u07ce\u07cf\7\u021a\2\2\u07cf\u07d0\bY\1\2\u07d0\u08a6"+
		"\3\2\2\2\u07d1\u07d2\7\u0196\2\2\u07d2\u07d3\7\u0217\2\2\u07d3\u07d4\5"+
		"\u00a4S\2\u07d4\u07d5\7\u021a\2\2\u07d5\u07d6\bY\1\2\u07d6\u08a6\3\2\2"+
		"\2\u07d7\u07d8\7\u0197\2\2\u07d8\u07d9\7\u0217\2\2\u07d9\u07da\5\u00a4"+
		"S\2\u07da\u07db\7\u0209\2\2\u07db\u07dc\5\u00a4S\2\u07dc\u07dd\7\u021a"+
		"\2\2\u07dd\u07de\bY\1\2\u07de\u08a6\3\2\2\2\u07df\u07e0\7\u01a6\2\2\u07e0"+
		"\u07e1\7\u0217\2\2\u07e1\u07e2\5\u00a4S\2\u07e2\u07e3\7\u021a\2\2\u07e3"+
		"\u07e4\bY\1\2\u07e4\u08a6\3\2\2\2\u07e5\u07e6\7\u01a6\2\2\u07e6\u07e7"+
		"\7\u0217\2\2\u07e7\u07e8\5\u00a4S\2\u07e8\u07e9\7\u0209\2\2\u07e9\u07ea"+
		"\5\u00a4S\2\u07ea\u07eb\7\u021a\2\2\u07eb\u07ec\bY\1\2\u07ec\u08a6\3\2"+
		"\2\2\u07ed\u07ee\7\u01a6\2\2\u07ee\u07ef\7\u0217\2\2\u07ef\u07f0\5\u00a4"+
		"S\2\u07f0\u07f1\7\u0209\2\2\u07f1\u07f2\5\u00a4S\2\u07f2\u07f3\7\u0209"+
		"\2\2\u07f3\u07f4\5\u00a4S\2\u07f4\u07f5\7\u021a\2\2\u07f5\u07f6\bY\1\2"+
		"\u07f6\u08a6\3\2\2\2\u07f7\u07f8\t\f\2\2\u07f8\u07f9\7\u0217\2\2\u07f9"+
		"\u07fa\5\u00a4S\2\u07fa\u07fb\7\u0209\2\2\u07fb\u07fc\5\u00a4S\2\u07fc"+
		"\u07fd\7\u021a\2\2\u07fd\u07fe\bY\1\2\u07fe\u08a6\3\2\2\2\u07ff\u0800"+
		"\t\f\2\2\u0800\u0801\7\u0217\2\2\u0801\u0802\5\u00a4S\2\u0802\u0803\7"+
		"\u0209\2\2\u0803\u0804\5\u00a4S\2\u0804\u0805\7\u0209\2\2\u0805\u0806"+
		"\5\u00a4S\2\u0806\u0807\7\u021a\2\2\u0807\u0808\bY\1\2\u0808\u08a6\3\2"+
		"\2\2\u0809\u080a\7\u01ab\2\2\u080a\u080b\7\u0217\2\2\u080b\u080c\5\u00a4"+
		"S\2\u080c\u080d\7\u0209\2\2\u080d\u080e\5\u00a4S\2\u080e\u080f\7\u0209"+
		"\2\2\u080f\u0810\5\u00a4S\2\u0810\u0811\7\u021a\2\2\u0811\u0812\bY\1\2"+
		"\u0812\u08a6\3\2\2\2\u0813\u0814\7\u01bf\2\2\u0814\u0815\7\u0217\2\2\u0815"+
		"\u0816\5\u00a4S\2\u0816\u0817\7\u0209\2\2\u0817\u0818\5\u00a4S\2\u0818"+
		"\u0819\7\u0209\2\2\u0819\u081a\5\u00a4S\2\u081a\u081b\7\u021a\2\2\u081b"+
		"\u081c\bY\1\2\u081c\u08a6\3\2\2\2\u081d\u081e\7\u017c\2\2\u081e\u081f"+
		"\7\u0217\2\2\u081f\u0820\5\u00a4S\2\u0820\u0821\7\u021a\2\2\u0821\u0822"+
		"\bY\1\2\u0822\u08a6\3\2\2\2\u0823\u0824\7\u01c5\2\2\u0824\u0825\7\u0217"+
		"\2\2\u0825\u0826\5\u00a4S\2\u0826\u0827\7\u021a\2\2\u0827\u0828\bY\1\2"+
		"\u0828\u08a6\3\2\2\2\u0829\u082a\t\r\2\2\u082a\u082b\7\u0217\2\2\u082b"+
		"\u082c\5\u00a4S\2\u082c\u082d\7\u021a\2\2\u082d\u082e\bY\1\2\u082e\u08a6"+
		"\3\2\2\2\u082f\u0830\7\u00c5\2\2\u0830\u0831\7\u0217\2\2\u0831\u0832\5"+
		"\u00a4S\2\u0832\u0833\7\u021a\2\2\u0833\u0834\bY\1\2\u0834\u08a6\3\2\2"+
		"\2\u0835\u0836\7\u00e9\2\2\u0836\u0837\7\u0217\2\2\u0837\u0838\5\u00a4"+
		"S\2\u0838\u0839\7\u0209\2\2\u0839\u083a\5\u00a4S\2\u083a\u083b\7\u021a"+
		"\2\2\u083b\u083c\bY\1\2\u083c\u08a6\3\2\2\2\u083d\u083e\7\u0195\2\2\u083e"+
		"\u083f\7\u0217\2\2\u083f\u0840\5\u00a4S\2\u0840\u0841\7\u021a\2\2\u0841"+
		"\u0842\bY\1\2\u0842\u08a6\3\2\2\2\u0843\u0844\7\u00ff\2\2\u0844\u0845"+
		"\7\u0217\2\2\u0845\u0846\5\u00a4S\2\u0846\u0847\7\u021a\2\2\u0847\u0848"+
		"\bY\1\2\u0848\u08a6\3\2\2\2\u0849\u084a\7\u00ff\2\2\u084a\u084b\7\u0217"+
		"\2\2\u084b\u084c\5\u00a4S\2\u084c\u084d\7\u0209\2\2\u084d\u084e\5\u00a4"+
		"S\2\u084e\u084f\7\u021a\2\2\u084f\u0850\bY\1\2\u0850\u08a6\3\2\2\2\u0851"+
		"\u0852\7\u00ff\2\2\u0852\u0853\7\u0217\2\2\u0853\u0854\5\u00a4S\2\u0854"+
		"\u0855\7\u0209\2\2\u0855\u0856\5\u00a4S\2\u0856\u0857\7\u0209\2\2\u0857"+
		"\u0858\5\u00a4S\2\u0858\u0859\7\u021a\2\2\u0859\u085a\bY\1\2\u085a\u08a6"+
		"\3\2\2\2\u085b\u085c\7\u00ff\2\2\u085c\u085d\7\u0217\2\2\u085d\u085e\5"+
		"\u00a4S\2\u085e\u085f\7\u0209\2\2\u085f\u0860\5\u00a4S\2\u0860\u0861\7"+
		"\u0209\2\2\u0861\u0862\5\u00a4S\2\u0862\u0863\7\u0209\2\2\u0863\u0864"+
		"\5\u00a4S\2\u0864\u0865\7\u021a\2\2\u0865\u0866\bY\1\2\u0866\u08a6\3\2"+
		"\2\2\u0867\u0868\7\u0100\2\2\u0868\u0869\7\u0217\2\2\u0869\u086a\5\u00a4"+
		"S\2\u086a\u086b\7\u021a\2\2\u086b\u086c\bY\1\2\u086c\u08a6\3\2\2\2\u086d"+
		"\u086e\7\u0100\2\2\u086e\u086f\7\u0217\2\2\u086f\u0870\5\u00a4S\2\u0870"+
		"\u0871\7\u0209\2\2\u0871\u0872\5\u00a4S\2\u0872\u0873\7\u021a\2\2\u0873"+
		"\u0874\bY\1\2\u0874\u08a6\3\2\2\2\u0875\u0876\7\u0102\2\2\u0876\u0877"+
		"\7\u0217\2\2\u0877\u0878\5\u00a4S\2\u0878\u0879\7\u021a\2\2\u0879\u087a"+
		"\bY\1\2\u087a\u08a6\3\2\2\2\u087b\u087c\7\u0102\2\2\u087c\u087d\7\u0217"+
		"\2\2\u087d\u087e\5\u00a4S\2\u087e\u087f\7\u0209\2\2\u087f\u0880\5\u00a4"+
		"S\2\u0880\u0881\7\u021a\2\2\u0881\u0882\bY\1\2\u0882\u08a6\3\2\2\2\u0883"+
		"\u0884\7\u0103\2\2\u0884\u0885\7\u0217\2\2\u0885\u0886\5\u00a4S\2\u0886"+
		"\u0887\7\u021a\2\2\u0887\u0888\bY\1\2\u0888\u08a6\3\2\2\2\u0889\u088a"+
		"\7\u0103\2\2\u088a\u088b\7\u0217\2\2\u088b\u088c\5\u00a4S\2\u088c\u088d"+
		"\7\u0209\2\2\u088d\u088e\5\u00a4S\2\u088e\u088f\7\u021a\2\2\u088f\u0890"+
		"\b";
	private static final String _serializedATNSegment1 =
		"Y\1\2\u0890\u08a6\3\2\2\2\u0891\u0892\7\u0104\2\2\u0892\u0893\7\u0217"+
		"\2\2\u0893\u0894\5\u00a4S\2\u0894\u0895\7\u021a\2\2\u0895\u0896\bY\1\2"+
		"\u0896\u08a6\3\2\2\2\u0897\u0898\7\u0104\2\2\u0898\u0899\7\u0217\2\2\u0899"+
		"\u089a\5\u00a4S\2\u089a\u089b\7\u0209\2\2\u089b\u089c\5\u00a4S\2\u089c"+
		"\u089d\7\u021a\2\2\u089d\u089e\bY\1\2\u089e\u08a6\3\2\2\2\u089f\u08a0"+
		"\7\u0101\2\2\u08a0\u08a1\7\u0217\2\2\u08a1\u08a2\5\u00a4S\2\u08a2\u08a3"+
		"\7\u021a\2\2\u08a3\u08a4\bY\1\2\u08a4\u08a6\3\2\2\2\u08a5\u06a4\3\2\2"+
		"\2\u08a5\u06aa\3\2\2\2\u08a5\u06b0\3\2\2\2\u08a5\u06b6\3\2\2\2\u08a5\u06bc"+
		"\3\2\2\2\u08a5\u06c9\3\2\2\2\u08a5\u06d8\3\2\2\2\u08a5\u06e0\3\2\2\2\u08a5"+
		"\u06f0\3\2\2\2\u08a5\u06f8\3\2\2\2\u08a5\u0708\3\2\2\2\u08a5\u0710\3\2"+
		"\2\2\u08a5\u0718\3\2\2\2\u08a5\u0720\3\2\2\2\u08a5\u0728\3\2\2\2\u08a5"+
		"\u0730\3\2\2\2\u08a5\u0736\3\2\2\2\u08a5\u073e\3\2\2\2\u08a5\u0748\3\2"+
		"\2\2\u08a5\u074e\3\2\2\2\u08a5\u0758\3\2\2\2\u08a5\u075e\3\2\2\2\u08a5"+
		"\u0764\3\2\2\2\u08a5\u076c\3\2\2\2\u08a5\u0776\3\2\2\2\u08a5\u0785\3\2"+
		"\2\2\u08a5\u078b\3\2\2\2\u08a5\u0795\3\2\2\2\u08a5\u079f\3\2\2\2\u08a5"+
		"\u07a7\3\2\2\2\u08a5\u07b1\3\2\2\2\u08a5\u07b7\3\2\2\2\u08a5\u07c1\3\2"+
		"\2\2\u08a5\u07c7\3\2\2\2\u08a5\u07d1\3\2\2\2\u08a5\u07d7\3\2\2\2\u08a5"+
		"\u07df\3\2\2\2\u08a5\u07e5\3\2\2\2\u08a5\u07ed\3\2\2\2\u08a5\u07f7\3\2"+
		"\2\2\u08a5\u07ff\3\2\2\2\u08a5\u0809\3\2\2\2\u08a5\u0813\3\2\2\2\u08a5"+
		"\u081d\3\2\2\2\u08a5\u0823\3\2\2\2\u08a5\u0829\3\2\2\2\u08a5\u082f\3\2"+
		"\2\2\u08a5\u0835\3\2\2\2\u08a5\u083d\3\2\2\2\u08a5\u0843\3\2\2\2\u08a5"+
		"\u0849\3\2\2\2\u08a5\u0851\3\2\2\2\u08a5\u085b\3\2\2\2\u08a5\u0867\3\2"+
		"\2\2\u08a5\u086d\3\2\2\2\u08a5\u0875\3\2\2\2\u08a5\u087b\3\2\2\2\u08a5"+
		"\u0883\3\2\2\2\u08a5\u0889\3\2\2\2\u08a5\u0891\3\2\2\2\u08a5\u0897\3\2"+
		"\2\2\u08a5\u089f\3\2\2\2\u08a6\u00b1\3\2\2\2\u08a7\u08a8\bZ\1\2\u08a8"+
		"\u08a9\7\u00dc\2\2\u08a9\u08aa\7\u0217\2\2\u08aa\u08ab\5\u00a4S\2\u08ab"+
		"\u08ac\7\u0209\2\2\u08ac\u08b1\5\u00a4S\2\u08ad\u08ae\7\u0209\2\2\u08ae"+
		"\u08b0\5\u00a4S\2\u08af\u08ad\3\2\2\2\u08b0\u08b3\3\2\2\2\u08b1\u08af"+
		"\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b4\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b4"+
		"\u08b5\7\u021a\2\2\u08b5\u08b6\bZ\1\2\u08b6\u090c\3\2\2\2\u08b7\u08b8"+
		"\bZ\1\2\u08b8\u08b9\7\u0157\2\2\u08b9\u08ba\7\u0217\2\2\u08ba\u08bb\5"+
		"\u00a4S\2\u08bb\u08bc\7\u0209\2\2\u08bc\u08c1\5\u00a4S\2\u08bd\u08be\7"+
		"\u0209\2\2\u08be\u08c0\5\u00a4S\2\u08bf\u08bd\3\2\2\2\u08c0\u08c3\3\2"+
		"\2\2\u08c1\u08bf\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c4\3\2\2\2\u08c3"+
		"\u08c1\3\2\2\2\u08c4\u08c5\7\u021a\2\2\u08c5\u08c6\bZ\1\2\u08c6\u090c"+
		"\3\2\2\2\u08c7\u08c8\bZ\1\2\u08c8\u08c9\7\u00b4\2\2\u08c9\u08ca\7\u0217"+
		"\2\2\u08ca\u08cf\5\u00a4S\2\u08cb\u08cc\7\u0209\2\2\u08cc\u08ce\5\u00a4"+
		"S\2\u08cd\u08cb\3\2\2\2\u08ce\u08d1\3\2\2\2\u08cf\u08cd\3\2\2\2\u08cf"+
		"\u08d0\3\2\2\2\u08d0\u08d2\3\2\2\2\u08d1\u08cf\3\2\2\2\u08d2\u08d3\7\u021a"+
		"\2\2\u08d3\u08d4\bZ\1\2\u08d4\u090c\3\2\2\2\u08d5\u08d6\7\u01f1\2\2\u08d6"+
		"\u08d7\7\u0217\2\2\u08d7\u08d8\7\u021a\2\2\u08d8\u090c\bZ\1\2\u08d9\u08da"+
		"\7\u00f7\2\2\u08da\u08db\7\u0217\2\2\u08db\u08dc\7\u021a\2\2\u08dc\u090c"+
		"\bZ\1\2\u08dd\u08de\7a\2\2\u08de\u08df\7\u0217\2\2\u08df\u08e0\7\u021a"+
		"\2\2\u08e0\u090c\bZ\1\2\u08e1\u08e2\t\16\2\2\u08e2\u08e3\7\u0217\2\2\u08e3"+
		"\u08e4\5\u00a4S\2\u08e4\u08e5\7\u021a\2\2\u08e5\u08e6\bZ\1\2\u08e6\u090c"+
		"\3\2\2\2\u08e7\u08e8\7\u018c\2\2\u08e8\u08e9\7\u0217\2\2\u08e9\u08ea\5"+
		"\u00a4S\2\u08ea\u08eb\7\u0209\2\2\u08eb\u08ec\5\u00a4S\2\u08ec\u08ed\7"+
		"\u021a\2\2\u08ed\u08ee\bZ\1\2\u08ee\u090c\3\2\2\2\u08ef\u08f0\7\23\2\2"+
		"\u08f0\u08f1\7\u0217\2\2\u08f1\u08f2\5\u00a4S\2\u08f2\u08f3\7\u0209\2"+
		"\2\u08f3\u08f4\5\u00a4S\2\u08f4\u08f5\7\u021a\2\2\u08f5\u08f6\bZ\1\2\u08f6"+
		"\u090c\3\2\2\2\u08f7\u08f8\7\24\2\2\u08f8\u08f9\7\u0217\2\2\u08f9\u08fa"+
		"\5\u00a4S\2\u08fa\u08fb\7\u0209\2\2\u08fb\u08fc\5\u00a4S\2\u08fc\u08fd"+
		"\7\u021a\2\2\u08fd\u08fe\bZ\1\2\u08fe\u090c\3\2\2\2\u08ff\u0900\7\u01d6"+
		"\2\2\u0900\u0901\7\u0217\2\2\u0901\u0902\7\u021a\2\2\u0902\u090c\bZ\1"+
		"\2\u0903\u0904\t\17\2\2\u0904\u0905\7\u0217\2\2\u0905\u0906\5\u00a4S\2"+
		"\u0906\u0907\7\u0209\2\2\u0907\u0908\5\u00a4S\2\u0908\u0909\7\u021a\2"+
		"\2\u0909\u090a\bZ\1\2\u090a\u090c\3\2\2\2\u090b\u08a7\3\2\2\2\u090b\u08b7"+
		"\3\2\2\2\u090b\u08c7\3\2\2\2\u090b\u08d5\3\2\2\2\u090b\u08d9\3\2\2\2\u090b"+
		"\u08dd\3\2\2\2\u090b\u08e1\3\2\2\2\u090b\u08e7\3\2\2\2\u090b\u08ef\3\2"+
		"\2\2\u090b\u08f7\3\2\2\2\u090b\u08ff\3\2\2\2\u090b\u0903\3\2\2\2\u090c"+
		"\u00b3\3\2\2\2\u090d\u090e\b[\1\2\u090e\u0911\5\u00b6\\\2\u090f\u0910"+
		"\7\u020a\2\2\u0910\u0912\5\u00b6\\\2\u0911\u090f\3\2\2\2\u0912\u0913\3"+
		"\2\2\2\u0913\u0911\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0915\3\2\2\2\u0915"+
		"\u0916\b[\1\2\u0916\u00b5\3\2\2\2\u0917\u0918\5\u00c6d\2\u0918\u0919\b"+
		"\\\1\2\u0919\u093b\3\2\2\2\u091a\u091b\5\u00c8e\2\u091b\u091c\b\\\1\2"+
		"\u091c\u093b\3\2\2\2\u091d\u091e\7\u0217\2\2\u091e\u091f\5\u00a4S\2\u091f"+
		"\u0920\7\u021a\2\2\u0920\u0921\b\\\1\2\u0921\u093b\3\2\2\2\u0922\u0923"+
		"\5\u00bc_\2\u0923\u0924\b\\\1\2\u0924\u093b\3\2\2\2\u0925\u0926\5\u00c4"+
		"c\2\u0926\u0927\b\\\1\2\u0927\u093b\3\2\2\2\u0928\u0929\5\u00ba^\2\u0929"+
		"\u092a\b\\\1\2\u092a\u093b\3\2\2\2\u092b\u092c\5\u00b8]\2\u092c\u092d"+
		"\b\\\1\2\u092d\u093b\3\2\2\2\u092e\u092f\5\u00b0Y\2\u092f\u0930\b\\\1"+
		"\2\u0930\u093b\3\2\2\2\u0931\u0932\5\u00b2Z\2\u0932\u0933\b\\\1\2\u0933"+
		"\u093b\3\2\2\2\u0934\u0935\5\u00c0a\2\u0935\u0936\b\\\1\2\u0936\u093b"+
		"\3\2\2\2\u0937\u0938\5\30\r\2\u0938\u0939\b\\\1\2\u0939\u093b\3\2\2\2"+
		"\u093a\u0917\3\2\2\2\u093a\u091a\3\2\2\2\u093a\u091d\3\2\2\2\u093a\u0922"+
		"\3\2\2\2\u093a\u0925\3\2\2\2\u093a\u0928\3\2\2\2\u093a\u092b\3\2\2\2\u093a"+
		"\u092e\3\2\2\2\u093a\u0931\3\2\2\2\u093a\u0934\3\2\2\2\u093a\u0937\3\2"+
		"\2\2\u093b\u00b7\3\2\2\2\u093c\u093d\7\u00be\2\2\u093d\u093e\7\u0217\2"+
		"\2\u093e\u093f\5\u00a4S\2\u093f\u0940\7\u0209\2\2\u0940\u0941\5\u00a4"+
		"S\2\u0941\u0942\7\u0209\2\2\u0942\u0943\5\u00a4S\2\u0943\u0944\7\u021a"+
		"\2\2\u0944\u0945\b]\1\2\u0945\u09b8\3\2\2\2\u0946\u0947\7\u00d8\2\2\u0947"+
		"\u0948\7\u0217\2\2\u0948\u0949\5\u00a4S\2\u0949\u094a\7\u021a\2\2\u094a"+
		"\u094b\b]\1\2\u094b\u09b8\3\2\2\2\u094c\u094d\7\u00d7\2\2\u094d\u094e"+
		"\7\u0217\2\2\u094e\u094f\5\u00a4S\2\u094f\u0950\7\u021a\2\2\u0950\u0951"+
		"\b]\1\2\u0951\u09b8\3\2\2\2\u0952\u0953\7\u00d9\2\2\u0953\u0954\7\u0217"+
		"\2\2\u0954\u0955\5\u00a4S\2\u0955\u0956\7\u0209\2\2\u0956\u0957\5\u00a4"+
		"S\2\u0957\u0958\7\u021a\2\2\u0958\u0959\b]\1\2\u0959\u09b8\3\2\2\2\u095a"+
		"\u095b\b]\1\2\u095b\u095c\7B\2\2\u095c\u095d\7\u0217\2\2\u095d\u095e\5"+
		"\u00a4S\2\u095e\u095f\7\u0209\2\2\u095f\u0960\5\u00a4S\2\u0960\u0965\3"+
		"\2\2\2\u0961\u0962\7\u0209\2\2\u0962\u0964\5\u00a4S\2\u0963\u0961\3\2"+
		"\2\2\u0964\u0967\3\2\2\2\u0965\u0963\3\2\2\2\u0965\u0966\3\2\2\2\u0966"+
		"\u0968\3\2\2\2\u0967\u0965\3\2\2\2\u0968\u0969\7\u021a\2\2\u0969\u096a"+
		"\b]\1\2\u096a\u09b8\3\2\2\2\u096b\u096c\b]\1\2\u096c\u096d\7\63\2\2\u096d"+
		"\u0973\5\u00a4S\2\u096e\u096f\7\u01da\2\2\u096f\u0970\5\u00a4S\2\u0970"+
		"\u0971\7\u01b7\2\2\u0971\u0972\5\u00a4S\2\u0972\u0974\3\2\2\2\u0973\u096e"+
		"\3\2\2\2\u0974\u0975\3\2\2\2\u0975\u0973\3\2\2\2\u0975\u0976\3\2\2\2\u0976"+
		"\u0977\3\2\2\2\u0977\u0978\7\u008b\2\2\u0978\u0979\b]\1\2\u0979\u09b8"+
		"\3\2\2\2\u097a\u097b\b]\1\2\u097b\u097c\7\63\2\2\u097c\u0982\5\u00a4S"+
		"\2\u097d\u097e\7\u01da\2\2\u097e\u097f\5\u00a4S\2\u097f\u0980\7\u01b7"+
		"\2\2\u0980\u0981\5\u00a4S\2\u0981\u0983\3\2\2\2\u0982\u097d\3\2\2\2\u0983"+
		"\u0984\3\2\2\2\u0984\u0982\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u0986\3\2"+
		"\2\2\u0986\u0987\7\u0085\2\2\u0987\u0988\5\u00a4S\2\u0988\u0989\7\u008b"+
		"\2\2\u0989\u098a\b]\1\2\u098a\u09b8\3\2\2\2\u098b\u098c\b]\1\2\u098c\u0992"+
		"\7\63\2\2\u098d\u098e\7\u01da\2\2\u098e\u098f\5\u00a4S\2\u098f\u0990\7"+
		"\u01b7\2\2\u0990\u0991\5\u00a4S\2\u0991\u0993\3\2\2\2\u0992\u098d\3\2"+
		"\2\2\u0993\u0994\3\2\2\2\u0994\u0992\3\2\2\2\u0994\u0995\3\2\2\2\u0995"+
		"\u0996\3\2\2\2\u0996\u0997\7\u008b\2\2\u0997\u0998\b]\1\2\u0998\u09b8"+
		"\3\2\2\2\u0999\u099a\b]\1\2\u099a\u09a0\7\63\2\2\u099b\u099c\7\u01da\2"+
		"\2\u099c\u099d\5\u00a4S\2\u099d\u099e\7\u01b7\2\2\u099e\u099f\5\u00a4"+
		"S\2\u099f\u09a1\3\2\2\2\u09a0\u099b\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2"+
		"\u09a0\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09a5\7\u0085"+
		"\2\2\u09a5\u09a6\5\u00a4S\2\u09a6\u09a7\7\u008b\2\2\u09a7\u09a8\b]\1\2"+
		"\u09a8\u09b8\3\2\2\2\u09a9\u09aa\7\u0123\2\2\u09aa\u09ab\7\u0217\2\2\u09ab"+
		"\u09ac\5\u00a4S\2\u09ac\u09ad\7\u0209\2\2\u09ad\u09ae\5\u00a4S\2\u09ae"+
		"\u09af\7\u021a\2\2\u09af\u09b0\b]\1\2\u09b0\u09b8\3\2\2\2\u09b1\u09b2"+
		"\7\35\2\2\u09b2\u09b3\7\u0217\2\2\u09b3\u09b4\5\u00a4S\2\u09b4\u09b5\7"+
		"\u021a\2\2\u09b5\u09b6\b]\1\2\u09b6\u09b8\3\2\2\2\u09b7\u093c\3\2\2\2"+
		"\u09b7\u0946\3\2\2\2\u09b7\u094c\3\2\2\2\u09b7\u0952\3\2\2\2\u09b7\u095a"+
		"\3\2\2\2\u09b7\u096b\3\2\2\2\u09b7\u097a\3\2\2\2\u09b7\u098b\3\2\2\2\u09b7"+
		"\u0999\3\2\2\2\u09b7\u09a9\3\2\2\2\u09b7\u09b1\3\2\2\2\u09b8\u00b9\3\2"+
		"\2\2\u09b9\u09ba\7\u00a9\2\2\u09ba\u09bb\7\u0217\2\2\u09bb\u09bc\5\u00a4"+
		"S\2\u09bc\u09bd\7\u021a\2\2\u09bd\u09be\b^\1\2\u09be\u0a78\3\2\2\2\u09bf"+
		"\u09c0\7\u00a9\2\2\u09c0\u09c1\7\u0217\2\2\u09c1\u09c2\5\u00a4S\2\u09c2"+
		"\u09c3\7\u0209\2\2\u09c3\u09c4\5\u00a4S\2\u09c4\u09c5\7\u021a\2\2\u09c5"+
		"\u09c6\b^\1\2\u09c6\u0a78\3\2\2\2\u09c7\u09c8\7\u01ca\2\2\u09c8\u09c9"+
		"\7\u0217\2\2\u09c9\u09ca\7\u021a\2\2\u09ca\u0a78\b^\1\2\u09cb\u09cc\7"+
		"\u01ca\2\2\u09cc\u09cd\7\u0217\2\2\u09cd\u09ce\5\u00a4S\2\u09ce\u09cf"+
		"\7\u021a\2\2\u09cf\u09d0\b^\1\2\u09d0\u0a78\3\2\2\2\u09d1\u09d2\7\u01ca"+
		"\2\2\u09d2\u09d3\7\u0217\2\2\u09d3\u09d4\5\u00a4S\2\u09d4\u09d5\7\u0209"+
		"\2\2\u09d5\u09d6\5\u00a4S\2\u09d6\u09d7\7\u021a\2\2\u09d7\u09d8\b^\1\2"+
		"\u09d8\u0a78\3\2\2\2\u09d9\u09da\7\u01eb\2\2\u09da\u09db\7\u0217\2\2\u09db"+
		"\u09dc\5\u00a4S\2\u09dc\u09dd\7\u021a\2\2\u09dd\u09de\b^\1\2\u09de\u0a78"+
		"\3\2\2\2\u09df\u09e0\7\u014d\2\2\u09e0\u09e1\7\u0217\2\2\u09e1\u09e2\5"+
		"\u00a4S\2\u09e2\u09e3\7\u021a\2\2\u09e3\u09e4\b^\1\2\u09e4\u0a78\3\2\2"+
		"\2\u09e5\u09e6\7\u010f\2\2\u09e6\u09e7\7\u0217\2\2\u09e7\u09e8\5\u00a4"+
		"S\2\u09e8\u09e9\7\u021a\2\2\u09e9\u09ea\b^\1\2\u09ea\u0a78\3\2\2\2\u09eb"+
		"\u09ec\7j\2\2\u09ec\u09ed\7\u0217\2\2\u09ed\u09ee\5\u00a4S\2\u09ee\u09ef"+
		"\7\u021a\2\2\u09ef\u09f0\b^\1\2\u09f0\u0a78\3\2\2\2\u09f1\u09f2\7\u00bc"+
		"\2\2\u09f2\u09f3\7\u0217\2\2\u09f3\u09f4\5\u00a4S\2\u09f4\u09f5\7\u021a"+
		"\2\2\u09f5\u09f6\b^\1\2\u09f6\u0a78\3\2\2\2\u09f7\u09f8\7\u010e\2\2\u09f8"+
		"\u09f9\7\u0217\2\2\u09f9\u09fa\5\u00a4S\2\u09fa\u09fb\7\u021a\2\2\u09fb"+
		"\u09fc\b^\1\2\u09fc\u0a78\3\2\2\2\u09fd\u09fe\7\u017e\2\2\u09fe\u09ff"+
		"\7\u0217\2\2\u09ff\u0a00\5\u00a4S\2\u0a00\u0a01\7\u021a\2\2\u0a01\u0a02"+
		"\b^\1\2\u0a02\u0a78\3\2\2\2\u0a03\u0a04\7\u01d9\2\2\u0a04\u0a05\7\u0217"+
		"\2\2\u0a05\u0a06\5\u00a4S\2\u0a06\u0a07\7\u021a\2\2\u0a07\u0a08\b^\1\2"+
		"\u0a08\u0a78\3\2\2\2\u0a09\u0a0a\7f\2\2\u0a0a\u0a0b\7\u0217\2\2\u0a0b"+
		"\u0a0c\5\u00a4S\2\u0a0c\u0a0d\7\u0209\2\2\u0a0d\u0a0e\5\u00a4S\2\u0a0e"+
		"\u0a0f\7\u021a\2\2\u0a0f\u0a10\b^\1\2\u0a10\u0a78\3\2\2\2\u0a11\u0a12"+
		"\7e\2\2\u0a12\u0a13\7\u0217\2\2\u0a13\u0a14\5\u00a4S\2\u0a14\u0a15\7\u0209"+
		"\2\2\u0a15\u0a16\5\u00a4S\2\u0a16\u0a17\7\u021a\2\2\u0a17\u0a18\b^\1\2"+
		"\u0a18\u0a78\3\2\2\2\u0a19\u0a1a\7h\2\2\u0a1a\u0a1b\7\u0217\2\2\u0a1b"+
		"\u0a1c\5\u00a4S\2\u0a1c\u0a1d\7\u0209\2\2\u0a1d\u0a1e\5\u00a4S\2\u0a1e"+
		"\u0a1f\7\u021a\2\2\u0a1f\u0a20\b^\1\2\u0a20\u0a78\3\2\2\2\u0a21\u0a22"+
		"\7\u01bd\2\2\u0a22\u0a23\7\u0217\2\2\u0a23\u0a24\5\u00a4S\2\u0a24\u0a25"+
		"\7\u0209\2\2\u0a25\u0a26\5\u00a4S\2\u0a26\u0a27\7\u021a\2\2\u0a27\u0a28"+
		"\b^\1\2\u0a28\u0a78\3\2\2\2\u0a29\u0a2a\7\u00aa\2\2\u0a2a\u0a2b\7\u0217"+
		"\2\2\u0a2b\u0a2c\5\u00a4S\2\u0a2c\u0a2d\7\u0209\2\2\u0a2d\u0a2e\5\u00a4"+
		"S\2\u0a2e\u0a2f\7\u021a\2\2\u0a2f\u0a30\b^\1\2\u0a30\u0a78\3\2\2\2\u0a31"+
		"\u0a34\7\u01ef\2\2\u0a32\u0a33\7\u0217\2\2\u0a33\u0a35\7\u021a\2\2\u0a34"+
		"\u0a32\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0a78\b^"+
		"\1\2\u0a37\u0a3a\7\u01f0\2\2\u0a38\u0a39\7\u0217\2\2\u0a39\u0a3b\7\u021a"+
		"\2\2\u0a3a\u0a38\3\2\2\2\u0a3a\u0a3b\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c"+
		"\u0a78\b^\1\2\u0a3d\u0a3e\7\22\2\2\u0a3e\u0a3f\7\u0217\2\2\u0a3f\u0a40"+
		"\5\u00a4S\2\u0a40\u0a41\7\u0209\2\2\u0a41\u0a42\5\u00a4S\2\u0a42\u0a43"+
		"\7\u021a\2\2\u0a43\u0a44\b^\1\2\u0a44\u0a78\3\2\2\2\u0a45\u0a46\7\22\2"+
		"\2\u0a46\u0a47\7\u0217\2\2\u0a47\u0a48\5\u00a4S\2\u0a48\u0a49\7\u0209"+
		"\2\2\u0a49\u0a4a\5\u00a4S\2\u0a4a\u0a4b\7\u0209\2\2\u0a4b\u0a4c\5\u00a4"+
		"S\2\u0a4c\u0a4d\7\u021a\2\2\u0a4d\u0a4e\b^\1\2\u0a4e\u0a78\3\2\2\2\u0a4f"+
		"\u0a50\7\u00e3\2\2\u0a50\u0a51\7\u0217\2\2\u0a51\u0a52\5\u00a4S\2\u0a52"+
		"\u0a53\7\u021a\2\2\u0a53\u0a54\b^\1\2\u0a54\u0a78\3\2\2\2\u0a55\u0a56"+
		"\7\u0115\2\2\u0a56\u0a57\7\u0217\2\2\u0a57\u0a58\5\u00a4S\2\u0a58\u0a59"+
		"\7\u0209\2\2\u0a59\u0a5a\5\u00a4S\2\u0a5a\u0a5b\7\u021a\2\2\u0a5b\u0a5c"+
		"\b^\1\2\u0a5c\u0a78\3\2\2\2\u0a5d\u0a5e\7\u01c2\2\2\u0a5e\u0a5f\7\u0217"+
		"\2\2\u0a5f\u0a60\5\u00a4S\2\u0a60\u0a61\7\u0209\2\2\u0a61\u0a62\5\u00a4"+
		"S\2\u0a62\u0a63\7\u021a\2\2\u0a63\u0a64\b^\1\2\u0a64\u0a78\3\2\2\2\u0a65"+
		"\u0a66\7\u0110\2\2\u0a66\u0a67\7\u0217\2\2\u0a67\u0a68\5\u00a4S\2\u0a68"+
		"\u0a69\7\u0209\2\2\u0a69\u0a6a\5\u00a4S\2\u0a6a\u0a6b\7\u021a\2\2\u0a6b"+
		"\u0a6c\b^\1\2\u0a6c\u0a78\3\2\2\2\u0a6d\u0a6e\7g\2\2\u0a6e\u0a6f\7\u0217"+
		"\2\2\u0a6f\u0a70\5\u00a4S\2\u0a70\u0a71\7\u0209\2\2\u0a71\u0a72\5\u00a4"+
		"S\2\u0a72\u0a73\7\u021a\2\2\u0a73\u0a74\b^\1\2\u0a74\u0a78\3\2\2\2\u0a75"+
		"\u0a76\7\u0202\2\2\u0a76\u0a78\b^\1\2\u0a77\u09b9\3\2\2\2\u0a77\u09bf"+
		"\3\2\2\2\u0a77\u09c7\3\2\2\2\u0a77\u09cb\3\2\2\2\u0a77\u09d1\3\2\2\2\u0a77"+
		"\u09d9\3\2\2\2\u0a77\u09df\3\2\2\2\u0a77\u09e5\3\2\2\2\u0a77\u09eb\3\2"+
		"\2\2\u0a77\u09f1\3\2\2\2\u0a77\u09f7\3\2\2\2\u0a77\u09fd\3\2\2\2\u0a77"+
		"\u0a03\3\2\2\2\u0a77\u0a09\3\2\2\2\u0a77\u0a11\3\2\2\2\u0a77\u0a19\3\2"+
		"\2\2\u0a77\u0a21\3\2\2\2\u0a77\u0a29\3\2\2\2\u0a77\u0a31\3\2\2\2\u0a77"+
		"\u0a37\3\2\2\2\u0a77\u0a3d\3\2\2\2\u0a77\u0a45\3\2\2\2\u0a77\u0a4f\3\2"+
		"\2\2\u0a77\u0a55\3\2\2\2\u0a77\u0a5d\3\2\2\2\u0a77\u0a65\3\2\2\2\u0a77"+
		"\u0a6d\3\2\2\2\u0a77\u0a75\3\2\2\2\u0a78\u00bb\3\2\2\2\u0a79\u0a7a\7\64"+
		"\2\2\u0a7a\u0a7b\7\u0217\2\2\u0a7b\u0a7c\5\u00a4S\2\u0a7c\u0a7d\7\31\2"+
		"\2\u0a7d\u0a7f\5\b\5\2\u0a7e\u0a80\5\f\7\2\u0a7f\u0a7e\3\2\2\2\u0a7f\u0a80"+
		"\3\2\2\2\u0a80\u0a81\3\2\2\2\u0a81\u0a82\7\u021a\2\2\u0a82\u0a83\b_\1"+
		"\2\u0a83\u0a8b\3\2\2\2\u0a84\u0a85\7(\2\2\u0a85\u0a86\7\u0217\2\2\u0a86"+
		"\u0a87\5\u00a4S\2\u0a87\u0a88\7\u021a\2\2\u0a88\u0a89\b_\1\2\u0a89\u0a8b"+
		"\3\2\2\2\u0a8a\u0a79\3\2\2\2\u0a8a\u0a84\3\2\2\2\u0a8b\u00bd\3\2\2\2\u0a8c"+
		"\u0a8d\7U\2\2\u0a8d\u0a8e\7\u0217\2\2\u0a8e\u0a8f\5\u00a4S\2\u0a8f\u0a90"+
		"\7\u021a\2\2\u0a90\u0a91\b`\1\2\u0a91\u0ac7\3\2\2\2\u0a92\u0a93\b`\1\2"+
		"\u0a93\u0a94\7U\2\2\u0a94\u0a95\7\u0217\2\2\u0a95\u0a96\7\177\2\2\u0a96"+
		"\u0a9b\5\u00a4S\2\u0a97\u0a98\7\u0209\2\2\u0a98\u0a9a\5\u00a4S\2\u0a99"+
		"\u0a97\3\2\2\2\u0a9a\u0a9d\3\2\2\2\u0a9b\u0a99\3\2\2\2\u0a9b\u0a9c\3\2"+
		"\2\2\u0a9c\u0a9e\3\2\2\2\u0a9d\u0a9b\3\2\2\2\u0a9e\u0a9f\7\u021a\2\2\u0a9f"+
		"\u0aa0\b`\1\2\u0aa0\u0ac7\3\2\2\2\u0aa1\u0aa2\7U\2\2\u0aa2\u0aa3\7\u0217"+
		"\2\2\u0aa3\u0aa4\7\u0215\2\2\u0aa4\u0aa5\7\u021a\2\2\u0aa5\u0ac7\b`\1"+
		"\2\u0aa6\u0aa7\7\u01ac\2\2\u0aa7\u0aa8\7\u0217\2\2\u0aa8\u0aa9\5\u00a4"+
		"S\2\u0aa9\u0aaa\7\u021a\2\2\u0aaa\u0aab\b`\1\2\u0aab\u0ac7\3\2\2\2\u0aac"+
		"\u0aad\7\u01ac\2\2\u0aad\u0aae\7\u0217\2\2\u0aae\u0aaf\7\177\2\2\u0aaf"+
		"\u0ab0\5\u00a4S\2\u0ab0\u0ab1\7\u021a\2\2\u0ab1\u0ab2\b`\1\2\u0ab2\u0ac7"+
		"\3\2\2\2\u0ab3\u0ab4\7!\2\2\u0ab4\u0ab5\7\u0217\2\2\u0ab5\u0ab6\5\u00a4"+
		"S\2\u0ab6\u0ab7\7\u021a\2\2\u0ab7\u0ab8\b`\1\2\u0ab8\u0ac7\3\2\2\2\u0ab9"+
		"\u0aba\7!\2\2\u0aba\u0abb\7\u0217\2\2\u0abb\u0abc\7\177\2\2\u0abc\u0abd"+
		"\5\u00a4S\2\u0abd\u0abe\7\u021a\2\2\u0abe\u0abf\b`\1\2\u0abf\u0ac7\3\2"+
		"\2\2\u0ac0\u0ac1\t\20\2\2\u0ac1\u0ac2\7\u0217\2\2\u0ac2\u0ac3\5\u00a4"+
		"S\2\u0ac3\u0ac4\7\u021a\2\2\u0ac4\u0ac5\b`\1\2\u0ac5\u0ac7\3\2\2\2\u0ac6"+
		"\u0a8c\3\2\2\2\u0ac6\u0a92\3\2\2\2\u0ac6\u0aa1\3\2\2\2\u0ac6\u0aa6\3\2"+
		"\2\2\u0ac6\u0aac\3\2\2\2\u0ac6\u0ab3\3\2\2\2\u0ac6\u0ab9\3\2\2\2\u0ac6"+
		"\u0ac0\3\2\2\2\u0ac7\u00bf\3\2\2\2\u0ac8\u0ac9\5\u00be`\2\u0ac9\u0aca"+
		"\ba\1\2\u0aca\u0b10\3\2\2\2\u0acb\u0acc\t\21\2\2\u0acc\u0acd\7\u0217\2"+
		"\2\u0acd\u0ace\5\u00a4S\2\u0ace\u0acf\7\u021a\2\2\u0acf\u0ad0\ba\1\2\u0ad0"+
		"\u0b10\3\2\2\2\u0ad1\u0ad2\t\22\2\2\u0ad2\u0ad3\7\u0217\2\2\u0ad3\u0ad4"+
		"\5\u00a4S\2\u0ad4\u0ad5\7\u0209\2\2\u0ad5\u0ad6\5\u00a4S\2\u0ad6\u0ad7"+
		"\7\u021a\2\2\u0ad7\u0ad8\ba\1\2\u0ad8\u0b10\3\2\2\2\u0ad9\u0ada\7\u013d"+
		"\2\2\u0ada\u0adb\7\u0217\2\2\u0adb\u0adc\5\u00a4S\2\u0adc\u0add\7\u0209"+
		"\2\2\u0add\u0ade\5\u00a4S\2\u0ade\u0adf\7\u021a\2\2\u0adf\u0ae0\ba\1\2"+
		"\u0ae0\u0b10\3\2\2\2\u0ae1\u0ae2\7\u013e\2\2\u0ae2\u0ae3\7\u0217\2\2\u0ae3"+
		"\u0ae4\5\u00a4S\2\u0ae4\u0ae5\7\u0209\2\2\u0ae5\u0ae6\5\u00a4S\2\u0ae6"+
		"\u0ae7\7\u021a\2\2\u0ae7\u0ae8\ba\1\2\u0ae8\u0b10\3\2\2\2\u0ae9\u0aea"+
		"\7\u013e\2\2\u0aea\u0aeb\7\u0217\2\2\u0aeb\u0aec\5\u00a4S\2\u0aec\u0aed"+
		"\7\u0209\2\2\u0aed\u0aee\5\u00a4S\2\u0aee\u0aef\7\u0209\2\2\u0aef\u0af0"+
		"\5\u00a4S\2\u0af0\u0af1\7\u021a\2\2\u0af1\u0af2\ba\1\2\u0af2\u0b10\3\2"+
		"\2\2\u0af3\u0af4\t\23\2\2\u0af4\u0af5\7\u0217\2\2\u0af5\u0af6\5\u00a4"+
		"S\2\u0af6\u0af7\7\u0209\2\2\u0af7\u0af8\5\u00a4S\2\u0af8\u0af9\7\u021a"+
		"\2\2\u0af9\u0afa\ba\1\2\u0afa\u0b10\3\2\2\2\u0afb\u0afc\7\u00b8\2\2\u0afc"+
		"\u0afd\7\u0217\2\2\u0afd\u0afe\5\u00a4S\2\u0afe\u0aff\7\u0209\2\2\u0aff"+
		"\u0b00\5\u00a4S\2\u0b00\u0b01\7\u021a\2\2\u0b01\u0b02\ba\1\2\u0b02\u0b10"+
		"\3\2\2\2\u0b03\u0b04\t\24\2\2\u0b04\u0b05\7\u0217\2\2\u0b05\u0b06\5\u00a4"+
		"S\2\u0b06\u0b07\7\u021a\2\2\u0b07\u0b08\ba\1\2\u0b08\u0b10\3\2\2\2\u0b09"+
		"\u0b0a\7\u0121\2\2\u0b0a\u0b0b\7\u0217\2\2\u0b0b\u0b0c\5\u00a4S\2\u0b0c"+
		"\u0b0d\7\u021a\2\2\u0b0d\u0b0e\ba\1\2\u0b0e\u0b10\3\2\2\2\u0b0f\u0ac8"+
		"\3\2\2\2\u0b0f\u0acb\3\2\2\2\u0b0f\u0ad1\3\2\2\2\u0b0f\u0ad9\3\2\2\2\u0b0f"+
		"\u0ae1\3\2\2\2\u0b0f\u0ae9\3\2\2\2\u0b0f\u0af3\3\2\2\2\u0b0f\u0afb\3\2"+
		"\2\2\u0b0f\u0b03\3\2\2\2\u0b0f\u0b09\3\2\2\2\u0b10\u00c1\3\2\2\2\u0b11"+
		"\u0b12\7\u0096\2\2\u0b12\u0b13\7\u0217\2\2\u0b13\u0b14\5\u00a4S\2\u0b14"+
		"\u0b15\7\u021a\2\2\u0b15\u0b16\bb\1\2\u0b16\u0b24\3\2\2\2\u0b17\u0b18"+
		"\7\u0142\2\2\u0b18\u0b19\7\u0217\2\2\u0b19\u0b1a\5\u00a4S\2\u0b1a\u0b1b"+
		"\7\u021a\2\2\u0b1b\u0b1c\bb\1\2\u0b1c\u0b24\3\2\2\2\u0b1d\u0b1e\7\u00c7"+
		"\2\2\u0b1e\u0b1f\7\u0217\2\2\u0b1f\u0b20\5\u00a4S\2\u0b20\u0b21\7\u021a"+
		"\2\2\u0b21\u0b22\bb\1\2\u0b22\u0b24\3\2\2\2\u0b23\u0b11\3\2\2\2\u0b23"+
		"\u0b17\3\2\2\2\u0b23\u0b1d\3\2\2\2\u0b24\u00c3\3\2\2\2\u0b25\u0b26\7\u0172"+
		"\2\2\u0b26\u0b27\7\u0217\2\2\u0b27\u0b28\5\u00a4S\2\u0b28\u0b29\7\u021a"+
		"\2\2\u0b29\u0b2a\bc\1\2\u0b2a\u0bf8\3\2\2\2\u0b2b\u0b2c\7\u0172\2\2\u0b2c"+
		"\u0b2d\7\u0217\2\2\u0b2d\u0b2e\5\u00a4S\2\u0b2e\u0b2f\7\u0209\2\2\u0b2f"+
		"\u0b30\5\u00a4S\2\u0b30\u0b31\7\u021a\2\2\u0b31\u0b32\bc\1\2\u0b32\u0bf8"+
		"\3\2\2\2\u0b33\u0b34\7\u00a2\2\2\u0b34\u0b35\7\u0217\2\2\u0b35\u0b36\5"+
		"\u00a4S\2\u0b36\u0b37\7\u021a\2\2\u0b37\u0b38\bc\1\2\u0b38\u0bf8\3\2\2"+
		"\2\u0b39\u0b3a\t\25\2\2\u0b3a\u0b3b\7\u0217\2\2\u0b3b\u0b3c\5\u00a4S\2"+
		"\u0b3c\u0b3d\7\u021a\2\2\u0b3d\u0b3e\bc\1\2\u0b3e\u0bf8\3\2\2\2\u0b3f"+
		"\u0b40\7\u0153\2\2\u0b40\u0b41\7\u0217\2\2\u0b41\u0b42\7\u021a\2\2\u0b42"+
		"\u0bf8\bc\1\2\u0b43\u0b44\7\u0153\2\2\u0b44\u0b45\7\u0217\2\2\u0b45\u0b46"+
		"\5\u00a4S\2\u0b46\u0b47\7\u021a\2\2\u0b47\u0b48\bc\1\2\u0b48\u0bf8\3\2"+
		"\2\2\u0b49\u0b4a\7\u0095\2\2\u0b4a\u0b4b\7\u0217\2\2\u0b4b\u0b4c\5\u00a4"+
		"S\2\u0b4c\u0b4d\7\u021a\2\2\u0b4d\u0b4e\bc\1\2\u0b4e\u0bf8\3\2\2\2\u0b4f"+
		"\u0b50\7\u00fc\2\2\u0b50\u0b51\7\u0217\2\2\u0b51\u0b52\5\u00a4S\2\u0b52"+
		"\u0b53\7\u021a\2\2\u0b53\u0b54\bc\1\2\u0b54\u0bf8\3\2\2\2\u0b55\u0b56"+
		"\7\u00f4\2\2\u0b56\u0b57\7\u0217\2\2\u0b57\u0b58\5\u00a4S\2\u0b58\u0b59"+
		"\7\u021a\2\2\u0b59\u0b5a\bc\1\2\u0b5a\u0bf8\3\2\2\2\u0b5b\u0b5c\7\u00f5"+
		"\2\2\u0b5c\u0b5d\7\u0217\2\2\u0b5d\u0b5e\5\u00a4S\2\u0b5e\u0b5f\7\u021a"+
		"\2\2\u0b5f\u0b60\bc\1\2\u0b60\u0bf8\3\2\2\2\u0b61\u0b62\7\u00f3\2\2\u0b62"+
		"\u0b63\7\u0217\2\2\u0b63\u0b64\5\u00a4S\2\u0b64\u0b65\7\u0209\2\2\u0b65"+
		"\u0b66\5\u00a4S\2\u0b66\u0b67\7\u021a\2\2\u0b67\u0b68\bc\1\2\u0b68\u0bf8"+
		"\3\2\2\2\u0b69\u0b6a\t\26\2\2\u0b6a\u0b6b\7\u0217\2\2\u0b6b\u0b6c\5\u00a4"+
		"S\2\u0b6c\u0b6d\7\u0209\2\2\u0b6d\u0b6e\5\u00a4S\2\u0b6e\u0b6f\7\u021a"+
		"\2\2\u0b6f\u0b70\bc\1\2\u0b70\u0bf8\3\2\2\2\u0b71\u0b72\7\u019d\2\2\u0b72"+
		"\u0b73\7\u0217\2\2\u0b73\u0b74\5\u00a4S\2\u0b74\u0b75\7\u021a\2\2\u0b75"+
		"\u0b76\bc\1\2\u0b76\u0bf8\3\2\2\2\u0b77\u0b78\7\'\2\2\u0b78\u0b79\7\u0217"+
		"\2\2\u0b79\u0b7a\5\u00a4S\2\u0b7a\u0b7b\7\u021a\2\2\u0b7b\u0b7c\bc\1\2"+
		"\u0b7c\u0bf8\3\2\2\2\u0b7d\u0b7e\7\u00b7\2\2\u0b7e\u0b7f\7\u0217\2\2\u0b7f"+
		"\u0b80\5\u00a4S\2\u0b80\u0b81\7\u021a\2\2\u0b81\u0b82\bc\1\2\u0b82\u0bf8"+
		"\3\2\2\2\u0b83\u0b84\7\u01c6\2\2\u0b84\u0b85\7\u0217\2\2\u0b85\u0b86\5"+
		"\u00a4S\2\u0b86\u0b87\7\u021a\2\2\u0b87\u0b88\bc\1\2\u0b88\u0bf8\3\2\2"+
		"\2\u0b89\u0b8a\7Q\2\2\u0b8a\u0b8b\7\u0217\2\2\u0b8b\u0b8c\5\u00a4S\2\u0b8c"+
		"\u0b8d\7\u0209\2\2\u0b8d\u0b8e\5\u00a4S\2\u0b8e\u0b8f\7\u0209\2\2\u0b8f"+
		"\u0b90\5\u00a4S\2\u0b90\u0b91\7\u021a\2\2\u0b91\u0b92\bc\1\2\u0b92\u0bf8"+
		"\3\2\2\2\u0b93\u0b94\7\20\2\2\u0b94\u0b95\7\u0217\2\2\u0b95\u0b96\5\u00a4"+
		"S\2\u0b96\u0b97\7\u021a\2\2\u0b97\u0b98\bc\1\2\u0b98\u0bf8\3\2\2\2\u0b99"+
		"\u0b9a\7\u0140\2\2\u0b9a\u0b9b\7\u0217\2\2\u0b9b\u0b9c\5\u00a4S\2\u0b9c"+
		"\u0b9d\7\u0209\2\2\u0b9d\u0b9e\5\u00a4S\2\u0b9e\u0b9f\7\u021a\2\2\u0b9f"+
		"\u0ba0\bc\1\2\u0ba0\u0bf8\3\2\2\2\u0ba1\u0ba2\7\u018e\2\2\u0ba2\u0ba3"+
		"\7\u0217\2\2\u0ba3\u0ba4\5\u00a4S\2\u0ba4\u0ba5\7\u021a\2\2\u0ba5\u0ba6"+
		"\bc\1\2\u0ba6\u0bf8\3\2\2\2\u0ba7\u0ba8\7\34\2\2\u0ba8\u0ba9\7\u0217\2"+
		"\2\u0ba9\u0baa\5\u00a4S\2\u0baa\u0bab\7\u021a\2\2\u0bab\u0bac\bc\1\2\u0bac"+
		"\u0bf8\3\2\2\2\u0bad\u0bae\7T\2\2\u0bae\u0baf\7\u0217\2\2\u0baf\u0bb0"+
		"\5\u00a4S\2\u0bb0\u0bb1\7\u021a\2\2\u0bb1\u0bb2\bc\1\2\u0bb2\u0bf8\3\2"+
		"\2\2\u0bb3\u0bb4\7\21\2\2\u0bb4\u0bb5\7\u0217\2\2\u0bb5\u0bb6\5\u00a4"+
		"S\2\u0bb6\u0bb7\7\u021a\2\2\u0bb7\u0bb8\bc\1\2\u0bb8\u0bf8\3\2\2\2\u0bb9"+
		"\u0bba\7\u01b1\2\2\u0bba\u0bbb\7\u0217\2\2\u0bbb\u0bbc\5\u00a4S\2\u0bbc"+
		"\u0bbd\7\u021a\2\2\u0bbd\u0bbe\bc\1\2\u0bbe\u0bf8\3\2\2\2\u0bbf\u0bc0"+
		"\7\37\2\2\u0bc0\u0bc1\7\u0217\2\2\u0bc1\u0bc2\5\u00a4S\2\u0bc2\u0bc3\7"+
		"\u021a\2\2\u0bc3\u0bc4\bc\1\2\u0bc4\u0bf8\3\2\2\2\u0bc5\u0bc6\7u\2\2\u0bc6"+
		"\u0bc7\7\u0217\2\2\u0bc7\u0bc8\5\u00a4S\2\u0bc8\u0bc9\7\u021a\2\2\u0bc9"+
		"\u0bca\bc\1\2\u0bca\u0bf8\3\2\2\2\u0bcb\u0bcc\7\u0151\2\2\u0bcc\u0bcd"+
		"\7\u0217\2\2\u0bcd\u0bce\5\u00a4S\2\u0bce\u0bcf\7\u021a\2\2\u0bcf\u0bd0"+
		"\bc\1\2\u0bd0\u0bf8\3\2\2\2\u0bd1\u0bd2\7\u0141\2\2\u0bd2\u0bd3\7\u0217"+
		"\2\2\u0bd3\u0bd4\5\u00a4S\2\u0bd4\u0bd5\7\u021a\2\2\u0bd5\u0bd6\bc\1\2"+
		"\u0bd6\u0bf8\3\2\2\2\u0bd7\u0bd8\7\u0114\2\2\u0bd8\u0bd9\7\u0217\2\2\u0bd9"+
		"\u0bda\5\u00a4S\2\u0bda\u0bdb\7\u021a\2\2\u0bdb\u0bdc\bc\1\2\u0bdc\u0bf8"+
		"\3\2\2\2\u0bdd\u0bde\7\u018d\2\2\u0bde\u0bdf\7\u0217\2\2\u0bdf\u0be0\5"+
		"\u00a4S\2\u0be0\u0be1\7\u021a\2\2\u0be1\u0be2\bc\1\2\u0be2\u0bf8\3\2\2"+
		"\2\u0be3\u0be4\7\13\2\2\u0be4\u0be5\7\u0217\2\2\u0be5\u0be6\7\u021a\2"+
		"\2\u0be6\u0bf8\bc\1\2\u0be7\u0be8\7\f\2\2\u0be8\u0be9\7\u0217\2\2\u0be9"+
		"\u0bea\7\u021a\2\2\u0bea\u0bf8\bc\1\2\u0beb\u0bec\7\u0098\2\2\u0bec\u0bed"+
		"\7\u0217\2\2\u0bed\u0bee\5\u00a4S\2\u0bee\u0bef\7\u021a\2\2\u0bef\u0bf0"+
		"\bc\1\2\u0bf0\u0bf8\3\2\2\2\u0bf1\u0bf2\7\65\2\2\u0bf2\u0bf3\7\u0217\2"+
		"\2\u0bf3\u0bf4\5\u00a4S\2\u0bf4\u0bf5\7\u021a\2\2\u0bf5\u0bf6\bc\1\2\u0bf6"+
		"\u0bf8\3\2\2\2\u0bf7\u0b25\3\2\2\2\u0bf7\u0b2b\3\2\2\2\u0bf7\u0b33\3\2"+
		"\2\2\u0bf7\u0b39\3\2\2\2\u0bf7\u0b3f\3\2\2\2\u0bf7\u0b43\3\2\2\2\u0bf7"+
		"\u0b49\3\2\2\2\u0bf7\u0b4f\3\2\2\2\u0bf7\u0b55\3\2\2\2\u0bf7\u0b5b\3\2"+
		"\2\2\u0bf7\u0b61\3\2\2\2\u0bf7\u0b69\3\2\2\2\u0bf7\u0b71\3\2\2\2\u0bf7"+
		"\u0b77\3\2\2\2\u0bf7\u0b7d\3\2\2\2\u0bf7\u0b83\3\2\2\2\u0bf7\u0b89\3\2"+
		"\2\2\u0bf7\u0b93\3\2\2\2\u0bf7\u0b99\3\2\2\2\u0bf7\u0ba1\3\2\2\2\u0bf7"+
		"\u0ba7\3\2\2\2\u0bf7\u0bad\3\2\2\2\u0bf7\u0bb3\3\2\2\2\u0bf7\u0bb9\3\2"+
		"\2\2\u0bf7\u0bbf\3\2\2\2\u0bf7\u0bc5\3\2\2\2\u0bf7\u0bcb\3\2\2\2\u0bf7"+
		"\u0bd1\3\2\2\2\u0bf7\u0bd7\3\2\2\2\u0bf7\u0bdd\3\2\2\2\u0bf7\u0be3\3\2"+
		"\2\2\u0bf7\u0be7\3\2\2\2\u0bf7\u0beb\3\2\2\2\u0bf7\u0bf1\3\2\2\2\u0bf8"+
		"\u00c5\3\2\2\2\u0bf9\u0bfa\7\u0221\2\2\u0bfa\u0c0a\bd\1\2\u0bfb\u0bfc"+
		"\7\u0220\2\2\u0bfc\u0c0a\bd\1\2\u0bfd\u0bfe\7\u021f\2\2\u0bfe\u0c0a\b"+
		"d\1\2\u0bff\u0c00\7\17\2\2\u0c00\u0c0a\bd\1\2\u0c01\u0c02\7\16\2\2\u0c02"+
		"\u0c0a\bd\1\2\u0c03\u0c04\5\u00d2j\2\u0c04\u0c05\bd\1\2\u0c05\u0c0a\3"+
		"\2\2\2\u0c06\u0c07\5\u00d4k\2\u0c07\u0c08\bd\1\2\u0c08\u0c0a\3\2\2\2\u0c09"+
		"\u0bf9\3\2\2\2\u0c09\u0bfb\3\2\2\2\u0c09\u0bfd\3\2\2\2\u0c09\u0bff\3\2"+
		"\2\2\u0c09\u0c01\3\2\2\2\u0c09\u0c03\3\2\2\2\u0c09\u0c06\3\2\2\2\u0c0a"+
		"\u00c7\3\2\2\2\u0c0b\u0c0c\5\u00d0i\2\u0c0c\u0c0d\7\4\2\2\u0c0d\u0c0e"+
		"\3\2\2\2\u0c0e\u0c0f\5\u00d0i\2\u0c0f\u0c10\7\4\2\2\u0c10\u0c11\3\2\2"+
		"\2\u0c11\u0c12\5\u00d0i\2\u0c12\u0c13\be\1\2\u0c13\u0c1e\3\2\2\2\u0c14"+
		"\u0c15\5\u00d0i\2\u0c15\u0c16\7\4\2\2\u0c16\u0c17\3\2\2\2\u0c17\u0c18"+
		"\5\u00d0i\2\u0c18\u0c19\be\1\2\u0c19\u0c1e\3\2\2\2\u0c1a\u0c1b\5\u00d0"+
		"i\2\u0c1b\u0c1c\be\1\2\u0c1c\u0c1e\3\2\2\2\u0c1d\u0c0b\3\2\2\2\u0c1d\u0c14"+
		"\3\2\2\2\u0c1d\u0c1a\3\2\2\2\u0c1e\u00c9\3\2\2\2\u0c1f\u0c20\5\u00d0i"+
		"\2\u0c20\u0c21\7\4\2\2\u0c21\u0c22\5\u00d0i\2\u0c22\u0c23\bf\1\2\u0c23"+
		"\u0c30\3\2\2\2\u0c24\u0c25\5\u00d0i\2\u0c25\u0c26\bf\1\2\u0c26\u0c30\3"+
		"\2\2\2\u0c27\u0c28\5\u00ccg\2\u0c28\u0c29\7\4\2\2\u0c29\u0c2a\5\u00cc"+
		"g\2\u0c2a\u0c2b\bf\1\2\u0c2b\u0c30\3\2\2\2\u0c2c\u0c2d\5\u00ccg\2\u0c2d"+
		"\u0c2e\bf\1\2\u0c2e\u0c30\3\2\2\2\u0c2f\u0c1f\3\2\2\2\u0c2f\u0c24\3\2"+
		"\2\2\u0c2f\u0c27\3\2\2\2\u0c2f\u0c2c\3\2\2\2\u0c30\u00cb\3\2\2\2\u0c31"+
		"\u0c33\bg\1\2\u0c32\u0c34\5\u00ceh\2\u0c33\u0c32\3\2\2\2\u0c34\u0c35\3"+
		"\2\2\2\u0c35\u0c33\3\2\2\2\u0c35\u0c36\3\2\2\2\u0c36\u0c37\3\2\2\2\u0c37"+
		"\u0c38\bg\1\2\u0c38\u00cd\3\2\2\2\u0c39\u0c3a\5\u00d0i\2\u0c3a\u0c3b\b"+
		"h\1\2\u0c3b\u0c40\3\2\2\2\u0c3c\u0c3d\5\30\r\2\u0c3d\u0c3e\bh\1\2\u0c3e"+
		"\u0c40\3\2\2\2\u0c3f\u0c39\3\2\2\2\u0c3f\u0c3c\3\2\2\2\u0c40\u00cf\3\2"+
		"\2\2\u0c41\u0c42\7\u021e\2\2\u0c42\u0c47\bi\1\2\u0c43\u0c44\5\u00e0q\2"+
		"\u0c44\u0c45\bi\1\2\u0c45\u0c47\3\2\2\2\u0c46\u0c41\3\2\2\2\u0c46\u0c43"+
		"\3\2\2\2\u0c47\u00d1\3\2\2\2\u0c48\u0c49\7d\2\2\u0c49\u0c4a\7\u0221\2"+
		"\2\u0c4a\u0c4b\bj\1\2\u0c4b\u00d3\3\2\2\2\u0c4c\u0c4d\7\u01b8\2\2\u0c4d"+
		"\u0c4e\7\u0221\2\2\u0c4e\u0c4f\bk\1\2\u0c4f\u00d5\3\2\2\2\u0c50\u0c51"+
		"\7\u00d6\2\2\u0c51\u0c56\bl\1\2\u0c52\u0c53\7\u00d6\2\2\u0c53\u0c54\7"+
		"\u011e\2\2\u0c54\u0c56\bl\1\2\u0c55\u0c50\3\2\2\2\u0c55\u0c52\3\2\2\2"+
		"\u0c56\u00d7\3\2\2\2\u0c57\u0c58\7\u00ea\2\2\u0c58\u0c61\bm\1\2\u0c59"+
		"\u0c5a\7\u011e\2\2\u0c5a\u0c5b\7\u00ea\2\2\u0c5b\u0c61\bm\1\2\u0c5c\u0c5d"+
		"\7\u016f\2\2\u0c5d\u0c61\bm\1\2\u0c5e\u0c5f\7\u0158\2\2\u0c5f\u0c61\b"+
		"m\1\2\u0c60\u0c57\3\2\2\2\u0c60\u0c59\3\2\2\2\u0c60\u0c5c\3\2\2\2\u0c60"+
		"\u0c5e\3\2\2\2\u0c61\u00d9\3\2\2\2\u0c62\u0c63\7\u00c1\2\2\u0c63\u0c68"+
		"\bn\1\2\u0c64\u0c65\7\u011e\2\2\u0c65\u0c66\7\u00c1\2\2\u0c66\u0c68\b"+
		"n\1\2\u0c67\u0c62\3\2\2\2\u0c67\u0c64\3\2\2\2\u0c68\u00db\3\2\2\2\u0c69"+
		"\u0c6a\7\u0093\2\2\u0c6a\u0c6f\bo\1\2\u0c6b\u0c6c\7\u011e\2\2\u0c6c\u0c6d"+
		"\7\u0093\2\2\u0c6d\u0c6f\bo\1\2\u0c6e\u0c69\3\2\2\2\u0c6e\u0c6b\3\2\2"+
		"\2\u0c6f\u00dd\3\2\2\2\u0c70\u0c71\t\27\2\2\u0c71\u00df\3\2\2\2\u0c72"+
		"\u0c73\7\u01ed\2\2\u0c73\u0ecd\bq\1\2\u0c74\u0c75\7\25\2\2\u0c75\u0ecd"+
		"\bq\1\2\u0c76\u0c77\7\26\2\2\u0c77\u0ecd\bq\1\2\u0c78\u0c79\7\27\2\2\u0c79"+
		"\u0ecd\bq\1\2\u0c7a\u0c7b\7\31\2\2\u0c7b\u0ecd\bq\1\2\u0c7c\u0c7d\7\32"+
		"\2\2\u0c7d\u0ecd\bq\1\2\u0c7e\u0c7f\7\36\2\2\u0c7f\u0ecd\bq\1\2\u0c80"+
		"\u0c81\7 \2\2\u0c81\u0ecd\bq\1\2\u0c82\u0c83\7!\2\2\u0c83\u0ecd\bq\1\2"+
		"\u0c84\u0c85\7$\2\2\u0c85\u0ecd\bq\1\2\u0c86\u0c87\7%\2\2\u0c87\u0ecd"+
		"\bq\1\2\u0c88\u0c89\7&\2\2\u0c89\u0ecd\bq\1\2\u0c8a\u0c8b\7)\2\2\u0c8b"+
		"\u0ecd\bq\1\2\u0c8c\u0c8d\7*\2\2\u0c8d\u0ecd\bq\1\2\u0c8e\u0c8f\7,\2\2"+
		"\u0c8f\u0ecd\bq\1\2\u0c90\u0c91\7.\2\2\u0c91\u0ecd\bq\1\2\u0c92\u0c93"+
		"\7/\2\2\u0c93\u0ecd\bq\1\2\u0c94\u0c95\7\60\2\2\u0c95\u0ecd\bq\1\2\u0c96"+
		"\u0c97\7\61\2\2\u0c97\u0ecd\bq\1\2\u0c98\u0c99\7\62\2\2\u0c99\u0ecd\b"+
		"q\1\2\u0c9a\u0c9b\7\63\2\2\u0c9b\u0ecd\bq\1\2\u0c9c\u0c9d\7\64\2\2\u0c9d"+
		"\u0ecd\bq\1\2\u0c9e\u0c9f\78\2\2\u0c9f\u0ecd\bq\1\2\u0ca0\u0ca1\79\2\2"+
		"\u0ca1\u0ecd\bq\1\2\u0ca2\u0ca3\7;\2\2\u0ca3\u0ecd\bq\1\2\u0ca4\u0ca5"+
		"\7>\2\2\u0ca5\u0ecd\bq\1\2\u0ca6\u0ca7\7?\2\2\u0ca7\u0ecd\bq\1\2\u0ca8"+
		"\u0ca9\7@\2\2\u0ca9\u0ecd\bq\1\2\u0caa\u0cab\7A\2\2\u0cab\u0ecd\bq\1\2"+
		"\u0cac\u0cad\7C\2\2\u0cad\u0ecd\bq\1\2\u0cae\u0caf\7F\2\2\u0caf\u0ecd"+
		"\bq\1\2\u0cb0\u0cb1\7G\2\2\u0cb1\u0ecd\bq\1\2\u0cb2\u0cb3\7H\2\2\u0cb3"+
		"\u0ecd\bq\1\2\u0cb4\u0cb5\7K\2\2\u0cb5\u0ecd\bq\1\2\u0cb6\u0cb7\7I\2\2"+
		"\u0cb7\u0ecd\bq\1\2\u0cb8\u0cb9\7R\2\2\u0cb9\u0ecd\bq\1\2\u0cba\u0cbb"+
		"\7J\2\2\u0cbb\u0ecd\bq\1\2\u0cbc\u0cbd\7L\2\2\u0cbd\u0ecd\bq\1\2\u0cbe"+
		"\u0cbf\7N\2\2\u0cbf\u0ecd\bq\1\2\u0cc0\u0cc1\7O\2\2\u0cc1\u0ecd\bq\1\2"+
		"\u0cc2\u0cc3\7P\2\2\u0cc3\u0ecd\bq\1\2\u0cc4\u0cc5\7U\2\2\u0cc5\u0ecd"+
		"\bq\1\2\u0cc6\u0cc7\7V\2\2\u0cc7\u0ecd\bq\1\2\u0cc8\u0cc9\7Z\2\2\u0cc9"+
		"\u0ecd\bq\1\2\u0cca\u0ccb\7[\2\2\u0ccb\u0ecd\bq\1\2\u0ccc\u0ccd\7\\\2"+
		"\2\u0ccd\u0ecd\bq\1\2\u0cce\u0ccf\7^\2\2\u0ccf\u0ecd\bq\1\2\u0cd0\u0cd1"+
		"\7\u01ee\2\2\u0cd1\u0ecd\bq\1\2\u0cd2\u0cd3\7_\2\2\u0cd3\u0ecd\bq\1\2"+
		"\u0cd4\u0cd5\7\u01ef\2\2\u0cd5\u0ecd\bq\1\2\u0cd6\u0cd7\7`\2\2\u0cd7\u0ecd"+
		"\bq\1\2\u0cd8\u0cd9\7\u01f0\2\2\u0cd9\u0ecd\bq\1\2\u0cda\u0cdb\7\u01f1"+
		"\2\2\u0cdb\u0ecd\bq\1\2\u0cdc\u0cdd\7b\2\2\u0cdd\u0ecd\bq\1\2\u0cde\u0cdf"+
		"\7c\2\2\u0cdf\u0ecd\bq\1\2\u0ce0\u0ce1\7d\2\2\u0ce1\u0ecd\bq\1\2\u0ce2"+
		"\u0ce3\7i\2\2\u0ce3\u0ecd\bq\1\2\u0ce4\u0ce5\7j\2\2\u0ce5\u0ecd\bq\1\2"+
		"\u0ce6\u0ce7\7k\2\2\u0ce7\u0ecd\bq\1\2\u0ce8\u0ce9\7l\2\2\u0ce9\u0ecd"+
		"\bq\1\2\u0cea\u0ceb\7m\2\2\u0ceb\u0ecd\bq\1\2\u0cec\u0ced\7o\2\2\u0ced"+
		"\u0ecd\bq\1\2\u0cee\u0cef\7p\2\2\u0cef\u0ecd\bq\1\2\u0cf0\u0cf1\7q\2\2"+
		"\u0cf1\u0ecd\bq\1\2\u0cf2\u0cf3\7r\2\2\u0cf3\u0ecd\bq\1\2\u0cf4\u0cf5"+
		"\7s\2\2\u0cf5\u0ecd\bq\1\2\u0cf6\u0cf7\7t\2\2\u0cf7\u0ecd\bq\1\2\u0cf8"+
		"\u0cf9\7v\2\2\u0cf9\u0ecd\bq\1\2\u0cfa\u0cfb\7w\2\2\u0cfb\u0ecd\bq\1\2"+
		"\u0cfc\u0cfd\7x\2\2\u0cfd\u0ecd\bq\1\2\u0cfe\u0cff\7\u01f2\2\2\u0cff\u0ecd"+
		"\bq\1\2\u0d00\u0d01\7y\2\2\u0d01\u0ecd\bq\1\2\u0d02\u0d03\7z\2\2\u0d03"+
		"\u0ecd\bq\1\2\u0d04\u0d05\7{\2\2\u0d05\u0ecd\bq\1\2\u0d06\u0d07\7|\2\2"+
		"\u0d07\u0ecd\bq\1\2\u0d08\u0d09\7}\2\2\u0d09\u0ecd\bq\1\2\u0d0a\u0d0b"+
		"\7\177\2\2\u0d0b\u0ecd\bq\1\2\u0d0c\u0d0d\7\u0080\2\2\u0d0d\u0ecd\bq\1"+
		"\2\u0d0e\u0d0f\7\u0081\2\2\u0d0f\u0ecd\bq\1\2\u0d10\u0d11\7\u0082\2\2"+
		"\u0d11\u0ecd\bq\1\2\u0d12\u0d13\7\u0083\2\2\u0d13\u0ecd\bq\1\2\u0d14\u0d15"+
		"\7\u0084\2\2\u0d15\u0ecd\bq\1\2\u0d16\u0d17\7\u0089\2\2\u0d17\u0ecd\b"+
		"q\1\2\u0d18\u0d19\7\u008c\2\2\u0d19\u0ecd\bq\1\2\u0d1a\u0d1b\7\u008d\2"+
		"\2\u0d1b\u0ecd\bq\1\2\u0d1c\u0d1d\7\u008e\2\2\u0d1d\u0ecd\bq\1\2\u0d1e"+
		"\u0d1f\7\u008f\2\2\u0d1f\u0ecd\bq\1\2\u0d20\u0d21\7\u0090\2\2\u0d21\u0ecd"+
		"\bq\1\2\u0d22\u0d23\7\u0091\2\2\u0d23\u0ecd\bq\1\2\u0d24\u0d25\7\u0092"+
		"\2\2\u0d25\u0ecd\bq\1\2\u0d26\u0d27\7\u0093\2\2\u0d27\u0ecd\bq\1\2\u0d28"+
		"\u0d29\7\u0094\2\2\u0d29\u0ecd\bq\1\2\u0d2a\u0d2b\7\u0099\2\2\u0d2b\u0ecd"+
		"\bq\1\2\u0d2c\u0d2d\7\u009a\2\2\u0d2d\u0ecd\bq\1\2\u0d2e\u0d2f\7\u009b"+
		"\2\2\u0d2f\u0ecd\bq\1\2\u0d30\u0d31\7\u009d\2\2\u0d31\u0ecd\bq\1\2\u0d32"+
		"\u0d33\7\u009f\2\2\u0d33\u0ecd\bq\1\2\u0d34\u0d35\7\u00a0\2\2\u0d35\u0ecd"+
		"\bq\1\2\u0d36\u0d37\7\u01f3\2\2\u0d37\u0ecd\bq\1\2\u0d38\u0d39\7\u00a1"+
		"\2\2\u0d39\u0ecd\bq\1\2\u0d3a\u0d3b\7\u00a3\2\2\u0d3b\u0ecd\bq\1\2\u0d3c"+
		"\u0d3d\7\u00a4\2\2\u0d3d\u0ecd\bq\1\2\u0d3e\u0d3f\7\u00a5\2\2\u0d3f\u0ecd"+
		"\bq\1\2\u0d40\u0d41\7\u00a7\2\2\u0d41\u0ecd\bq\1\2\u0d42\u0d43\7\u00a8"+
		"\2\2\u0d43\u0ecd\bq\1\2\u0d44\u0d45\7\u00ab\2\2\u0d45\u0ecd\bq\1\2\u0d46"+
		"\u0d47\7\u00ac\2\2\u0d47\u0ecd\bq\1\2\u0d48\u0d49\7\u00ad\2\2\u0d49\u0ecd"+
		"\bq\1\2\u0d4a\u0d4b\7\u00af\2\2\u0d4b\u0ecd\bq\1\2\u0d4c\u0d4d\7\u00b0"+
		"\2\2\u0d4d\u0ecd\bq\1\2\u0d4e\u0d4f\7\u00b1\2\2\u0d4f\u0ecd\bq\1\2\u0d50"+
		"\u0d51\7\u00b2\2\2\u0d51\u0ecd\bq\1\2\u0d52\u0d53\7\u00b3\2\2\u0d53\u0ecd"+
		"\bq\1\2\u0d54\u0d55\7\u00b4\2\2\u0d55\u0ecd\bq\1\2\u0d56\u0d57\7\u00b5"+
		"\2\2\u0d57\u0ecd\bq\1\2\u0d58\u0d59\7\u00b6\2\2\u0d59\u0ecd\bq\1\2\u0d5a"+
		"\u0d5b\7\u00bb\2\2\u0d5b\u0ecd\bq\1\2\u0d5c\u0d5d\7\u00bd\2\2\u0d5d\u0ecd"+
		"\bq\1\2\u0d5e\u0d5f\7\u00be\2\2\u0d5f\u0ecd\bq\1\2\u0d60\u0d61\7\u00bf"+
		"\2\2\u0d61\u0ecd\bq\1\2\u0d62\u0d63\7\u00c0\2\2\u0d63\u0ecd\bq\1\2\u0d64"+
		"\u0d65\7\u00c1\2\2\u0d65\u0ecd\bq\1\2\u0d66\u0d67\7\u00c2\2\2\u0d67\u0ecd"+
		"\bq\1\2\u0d68\u0d69\7\u00c3\2\2\u0d69\u0ecd\bq\1\2\u0d6a\u0d6b\7\u00c6"+
		"\2\2\u0d6b\u0ecd\bq\1\2\u0d6c\u0d6d\7\u00c8\2\2\u0d6d\u0ecd\bq\1\2\u0d6e"+
		"\u0d6f\7\u00c9\2\2\u0d6f\u0ecd\bq\1\2\u0d70\u0d71\7\u00cb\2\2\u0d71\u0ecd"+
		"\bq\1\2\u0d72\u0d73\7\u00cd\2\2\u0d73\u0ecd\bq\1\2\u0d74\u0d75\7\u00ce"+
		"\2\2\u0d75\u0ecd\bq\1\2\u0d76\u0d77\7\u00cf\2\2\u0d77\u0ecd\bq\1\2\u0d78"+
		"\u0d79\7\u00d0\2\2\u0d79\u0ecd\bq\1\2\u0d7a\u0d7b\7\u00d1\2\2\u0d7b\u0ecd"+
		"\bq\1\2\u0d7c\u0d7d\7\u00d2\2\2\u0d7d\u0ecd\bq\1\2\u0d7e\u0d7f\7\u00d3"+
		"\2\2\u0d7f\u0ecd\bq\1\2\u0d80\u0d81\7\u00d4\2\2\u0d81\u0ecd\bq\1\2\u0d82"+
		"\u0d83\7\u00d5\2\2\u0d83\u0ecd\bq\1\2\u0d84\u0d85\7\u00db\2\2\u0d85\u0ecd"+
		"\bq\1\2\u0d86\u0d87\7\u00d6\2\2\u0d87\u0ecd\bq\1\2\u0d88\u0d89\7\u00da"+
		"\2\2\u0d89\u0ecd\bq\1\2\u0d8a\u0d8b\7\u00dd\2\2\u0d8b\u0ecd\bq\1\2\u0d8c"+
		"\u0d8d\7\u00df\2\2\u0d8d\u0ecd\bq\1\2\u0d8e\u0d8f\7\u00e0\2\2\u0d8f\u0ecd"+
		"\bq\1\2\u0d90\u0d91\7\u00e1\2\2\u0d91\u0ecd\bq\1\2\u0d92\u0d93\7\u01f4"+
		"\2\2\u0d93\u0ecd\bq\1\2\u0d94\u0d95\7\u00e2\2\2\u0d95\u0ecd\bq\1\2\u0d96"+
		"\u0d97\7\u01f5\2\2\u0d97\u0ecd\bq\1\2\u0d98\u0d99\7\u01f6\2\2\u0d99\u0ecd"+
		"\bq\1\2\u0d9a\u0d9b\7\u00e6\2\2\u0d9b\u0ecd\bq\1\2\u0d9c\u0d9d\7\u00e7"+
		"\2\2\u0d9d\u0ecd\bq\1\2\u0d9e\u0d9f\7\u00ea\2\2\u0d9f\u0ecd\bq\1\2\u0da0"+
		"\u0da1\7\u00eb\2\2\u0da1\u0ecd\bq\1\2\u0da2\u0da3\7\u00ec\2\2\u0da3\u0ecd"+
		"\bq\1\2\u0da4\u0da5\7\u00ed\2\2\u0da5\u0ecd\bq\1\2\u0da6\u0da7\7\u00ef"+
		"\2\2\u0da7\u0ecd\bq\1\2\u0da8\u0da9\7\u00f0\2\2\u0da9\u0ecd\bq\1\2\u0daa"+
		"\u0dab\7\u00f1\2\2\u0dab\u0ecd\bq\1\2\u0dac\u0dad\7\u00f2\2\2\u0dad\u0ecd"+
		"\bq\1\2\u0dae\u0daf\7\u00f3\2\2\u0daf\u0ecd\bq\1\2\u0db0\u0db1\7\u00f6"+
		"\2\2\u0db1\u0ecd\bq\1\2\u0db2\u0db3\7\u00f8\2\2\u0db3\u0ecd\bq\1\2\u0db4"+
		"\u0db5\7\u00f9\2\2\u0db5\u0ecd\bq\1\2\u0db6\u0db7\7\u00fe\2\2\u0db7\u0ecd"+
		"\bq\1\2\u0db8\u0db9\7\u0105\2\2\u0db9\u0ecd\bq\1\2\u0dba\u0dbb\7\u0106"+
		"\2\2\u0dbb\u0ecd\bq\1\2\u0dbc\u0dbd\7\u0107\2\2\u0dbd\u0ecd\bq\1\2\u0dbe"+
		"\u0dbf\7\u0109\2\2\u0dbf\u0ecd\bq\1\2\u0dc0\u0dc1\7\u010a\2\2\u0dc1\u0ecd"+
		"\bq\1\2\u0dc2\u0dc3\7\u010b\2\2\u0dc3\u0ecd\bq\1\2\u0dc4\u0dc5\7\u010c"+
		"\2\2\u0dc5\u0ecd\bq\1\2\u0dc6\u0dc7\7\u010d\2\2\u0dc7\u0ecd\bq\1\2\u0dc8"+
		"\u0dc9\7\u0111\2\2\u0dc9\u0ecd\bq\1\2\u0dca\u0dcb\7\u0113\2\2\u0dcb\u0ecd"+
		"\bq\1\2\u0dcc\u0dcd\7\u0116\2\2\u0dcd\u0ecd\bq\1\2\u0dce\u0dcf\7\u0117"+
		"\2\2\u0dcf\u0ecd\bq\1\2\u0dd0\u0dd1\7\u0118\2\2\u0dd1\u0ecd\bq\1\2\u0dd2"+
		"\u0dd3\7\u011a\2\2\u0dd3\u0ecd\bq\1\2\u0dd4\u0dd5\7\u0119\2\2\u0dd5\u0ecd"+
		"\bq\1\2\u0dd6\u0dd7\7\u011b\2\2\u0dd7\u0ecd\bq\1\2\u0dd8\u0dd9\7\u011c"+
		"\2\2\u0dd9\u0ecd\bq\1\2\u0dda\u0ddb\7\u011e\2\2\u0ddb\u0ecd\bq\1\2\u0ddc"+
		"\u0ddd\7\u011f\2\2\u0ddd\u0ecd\bq\1\2\u0dde\u0ddf\7\u0124\2\2\u0ddf\u0ecd"+
		"\bq\1\2\u0de0\u0de1\7\u0125\2\2\u0de1\u0ecd\bq\1\2\u0de2\u0de3\7\u0126"+
		"\2\2\u0de3\u0ecd\bq\1\2\u0de4\u0de5\7\u0128\2\2\u0de5\u0ecd\bq\1\2\u0de6"+
		"\u0de7\7\u0129\2\2\u0de7\u0ecd\bq\1\2\u0de8\u0de9\7\u012a\2\2\u0de9\u0ecd"+
		"\bq\1\2\u0dea\u0deb\7\u012b\2\2\u0deb\u0ecd\bq\1\2\u0dec\u0ded\7\u012c"+
		"\2\2\u0ded\u0ecd\bq\1\2\u0dee\u0def\7\u012e\2\2\u0def\u0ecd\bq\1\2\u0df0"+
		"\u0df1\7\u012f\2\2\u0df1\u0ecd\bq\1\2\u0df2\u0df3\7\u0130\2\2\u0df3\u0ecd"+
		"\bq\1\2\u0df4\u0df5\7\u0132\2\2\u0df5\u0ecd\bq\1\2\u0df6\u0df7\7\u0133"+
		"\2\2\u0df7\u0ecd\bq\1\2\u0df8\u0df9\7\u0134\2\2\u0df9\u0ecd\bq\1\2\u0dfa"+
		"\u0dfb\7\u0135\2\2\u0dfb\u0ecd\bq\1\2\u0dfc\u0dfd\7\u01fd\2\2\u0dfd\u0ecd"+
		"\bq\1\2\u0dfe\u0dff\7\u01fe\2\2\u0dff\u0ecd\bq\1\2\u0e00\u0e01\7\u0138"+
		"\2\2\u0e01\u0ecd\bq\1\2\u0e02\u0e03\7\u013a\2\2\u0e03\u0ecd\bq\1\2\u0e04"+
		"\u0e05\7\u013b\2\2\u0e05\u0ecd\bq\1\2\u0e06\u0e07\7\u0145\2\2\u0e07\u0ecd"+
		"\bq\1\2\u0e08\u0e09\7\u0146\2\2\u0e09\u0ecd\bq\1\2\u0e0a\u0e0b\7\u0147"+
		"\2\2\u0e0b\u0ecd\bq\1\2\u0e0c\u0e0d\7\u0149\2\2\u0e0d\u0ecd\bq\1\2\u0e0e"+
		"\u0e0f\7\u014a\2\2\u0e0f\u0ecd\bq\1\2\u0e10\u0e11\7\u017b\2\2\u0e11\u0ecd"+
		"\bq\1\2\u0e12\u0e13\7\u014c\2\2\u0e13\u0ecd\bq\1\2\u0e14\u0e15\7\u014e"+
		"\2\2\u0e15\u0ecd\bq\1\2\u0e16\u0e17\7\u014f\2\2\u0e17\u0ecd\bq\1\2\u0e18"+
		"\u0e19\7\u0152\2\2\u0e19\u0ecd\bq\1\2\u0e1a\u0e1b\7\u01ff\2\2\u0e1b\u0ecd"+
		"\bq\1\2\u0e1c\u0e1d\7\u0155\2\2\u0e1d\u0ecd\bq\1\2\u0e1e\u0e1f\7\u0156"+
		"\2\2\u0e1f\u0ecd\bq\1\2\u0e20\u0e21\7\u0158\2\2\u0e21\u0ecd\bq\1\2\u0e22"+
		"\u0e23\7\u0178\2\2\u0e23\u0ecd\bq\1\2\u0e24\u0e25\7\u0166\2\2\u0e25\u0ecd"+
		"\bq\1\2\u0e26\u0e27\7\u0167\2\2\u0e27\u0ecd\bq\1\2\u0e28\u0e29\7\u0168"+
		"\2\2\u0e29\u0ecd\bq\1\2\u0e2a\u0e2b\7\u0169\2\2\u0e2b\u0ecd\bq\1\2\u0e2c"+
		"\u0e2d\7\u016a\2\2\u0e2d\u0ecd\bq\1\2\u0e2e\u0e2f\7\u016b\2\2\u0e2f\u0ecd"+
		"\bq\1\2\u0e30\u0e31\7\u016c\2\2\u0e31\u0ecd\bq\1\2\u0e32\u0e33\7\u016d"+
		"\2\2\u0e33\u0ecd\bq\1\2\u0e34\u0e35\7\u016e\2\2\u0e35\u0ecd\bq\1\2\u0e36"+
		"\u0e37\7\u016f\2\2\u0e37\u0ecd\bq\1\2\u0e38\u0e39\7\u0179\2\2\u0e39\u0ecd"+
		"\bq\1\2\u0e3a\u0e3b\7\u0170\2\2\u0e3b\u0ecd\bq\1\2\u0e3c\u0e3d\7\u0171"+
		"\2\2\u0e3d\u0ecd\bq\1\2\u0e3e\u0e3f\7\u0173\2\2\u0e3f\u0ecd\bq\1\2\u0e40"+
		"\u0e41\7\u0174\2\2\u0e41\u0ecd\bq\1\2\u0e42\u0e43\7\u0176\2\2\u0e43\u0ecd"+
		"\bq\1\2\u0e44\u0e45\7\u0200\2\2\u0e45\u0ecd\bq\1\2\u0e46\u0e47\7\u017d"+
		"\2\2\u0e47\u0ecd\bq\1\2\u0e48\u0e49\7\u017e\2\2\u0e49\u0ecd\bq\1\2\u0e4a"+
		"\u0e4b\7\u017f\2\2\u0e4b\u0ecd\bq\1\2\u0e4c\u0e4d\7\u0180\2\2\u0e4d\u0ecd"+
		"\bq\1\2\u0e4e\u0e4f\7\u0183\2\2\u0e4f\u0ecd\bq\1\2\u0e50\u0e51\7\u0184"+
		"\2\2\u0e51\u0ecd\bq\1\2\u0e52\u0e53\7\u0185\2\2\u0e53\u0ecd\bq\1\2\u0e54"+
		"\u0e55\7\u0188\2\2\u0e55\u0ecd\bq\1\2\u0e56\u0e57\7\u0189\2\2\u0e57\u0ecd"+
		"\bq\1\2\u0e58\u0e59\7\u018f\2\2\u0e59\u0ecd\bq\1\2\u0e5a\u0e5b\7\u0190"+
		"\2\2\u0e5b\u0ecd\bq\1\2\u0e5c\u0e5d\7\u0193\2\2\u0e5d\u0ecd\bq\1\2\u0e5e"+
		"\u0e5f\7\u0194\2\2\u0e5f\u0ecd\bq\1\2\u0e60\u0e61\7\u0197\2\2\u0e61\u0ecd"+
		"\bq\1\2\u0e62\u0e63\7\u0198\2\2\u0e63\u0ecd\bq\1\2\u0e64\u0e65\7\u0199"+
		"\2\2\u0e65\u0ecd\bq\1\2\u0e66\u0e67\7\u019a\2\2\u0e67\u0ecd\bq\1\2\u0e68"+
		"\u0e69\7\u019b\2\2\u0e69\u0ecd\bq\1\2\u0e6a\u0e6b\7\u019c\2\2\u0e6b\u0ecd"+
		"\bq\1\2\u0e6c\u0e6d\7\u019e\2\2\u0e6d\u0ecd\bq\1\2\u0e6e\u0e6f\7\u019f"+
		"\2\2\u0e6f\u0ecd\bq\1\2\u0e70\u0e71\7\u01a2\2\2\u0e71\u0ecd\bq\1\2\u0e72"+
		"\u0e73\7\u0201\2\2\u0e73\u0ecd\bq\1\2\u0e74\u0e75\7\u01a3\2\2\u0e75\u0ecd"+
		"\bq\1\2\u0e76\u0e77\7\u01a4\2\2\u0e77\u0ecd\bq\1\2\u0e78\u0e79\7\u01a5"+
		"\2\2\u0e79\u0ecd\bq\1\2\u0e7a\u0e7b\7\u01a8\2\2\u0e7b\u0ecd\bq\1\2\u0e7c"+
		"\u0e7d\7\u01aa\2\2\u0e7d\u0ecd\bq\1\2\u0e7e\u0e7f\7\u01ac\2\2\u0e7f\u0ecd"+
		"\bq\1\2\u0e80\u0e81\7\u01ad\2\2\u0e81\u0ecd\bq\1\2\u0e82\u0e83\7\u0202"+
		"\2\2\u0e83\u0ecd\bq\1\2\u0e84\u0e85\7\u01ae\2\2\u0e85\u0ecd\bq\1\2\u0e86"+
		"\u0e87\7\u01af\2\2\u0e87\u0ecd\bq\1\2\u0e88\u0e89\7\u01b0\2\2\u0e89\u0ecd"+
		"\bq\1\2\u0e8a\u0e8b\7\u01b3\2\2\u0e8b\u0ecd\bq\1\2\u0e8c\u0e8d\7\u01b4"+
		"\2\2\u0e8d\u0ecd\bq\1\2\u0e8e\u0e8f\7\u01b6\2\2\u0e8f\u0ecd\bq\1\2\u0e90"+
		"\u0e91\7\u01b7\2\2\u0e91\u0ecd\bq\1\2\u0e92\u0e93\7\u01b8\2\2\u0e93\u0ecd"+
		"\bq\1\2\u0e94\u0e95\7\u01ba\2\2\u0e95\u0ecd\bq\1\2\u0e96\u0e97\7\u01bb"+
		"\2\2\u0e97\u0ecd\bq\1\2\u0e98\u0e99\7\u01bc\2\2\u0e99\u0ecd\bq\1\2\u0e9a"+
		"\u0e9b\7\u01be\2\2\u0e9b\u0ecd\bq\1\2\u0e9c\u0e9d\7\u017c\2\2\u0e9d\u0ecd"+
		"\bq\1\2\u0e9e\u0e9f\7\u01c0\2\2\u0e9f\u0ecd\bq\1\2\u0ea0\u0ea1\7\u01c1"+
		"\2\2\u0ea1\u0ecd\bq\1\2\u0ea2\u0ea3\7\u01c9\2\2\u0ea3\u0ecd\bq\1\2\u0ea4"+
		"\u0ea5\7\u01cb\2\2\u0ea5\u0ecd\bq\1\2\u0ea6\u0ea7\7\u01cd\2\2\u0ea7\u0ecd"+
		"\bq\1\2\u0ea8\u0ea9\7\u01ce\2\2\u0ea9\u0ecd\bq\1\2\u0eaa\u0eab\7\u0206"+
		"\2\2\u0eab\u0ecd\bq\1\2\u0eac\u0ead\7\u01cf\2\2\u0ead\u0ecd\bq\1\2\u0eae"+
		"\u0eaf\7\u01d0\2\2\u0eaf\u0ecd\bq\1\2\u0eb0\u0eb1\7\u01d1\2\2\u0eb1\u0ecd"+
		"\bq\1\2\u0eb2\u0eb3\7\u01d2\2\2\u0eb3\u0ecd\bq\1\2\u0eb4\u0eb5\7\u01d3"+
		"\2\2\u0eb5\u0ecd\bq\1\2\u0eb6\u0eb7\7\u01d4\2\2\u0eb7\u0ecd\bq\1\2\u0eb8"+
		"\u0eb9\7\u01d5\2\2\u0eb9\u0ecd\bq\1\2\u0eba\u0ebb\7\u0203\2\2\u0ebb\u0ecd"+
		"\bq\1\2\u0ebc\u0ebd\7\u01d8\2\2\u0ebd\u0ecd\bq\1\2\u0ebe\u0ebf\7\u01dc"+
		"\2\2\u0ebf\u0ecd\bq\1\2\u0ec0\u0ec1\7\u01dd\2\2\u0ec1\u0ecd\bq\1\2\u0ec2"+
		"\u0ec3\7\u01de\2\2\u0ec3\u0ecd\bq\1\2\u0ec4\u0ec5\7\u01df\2\2\u0ec5\u0ecd"+
		"\bq\1\2\u0ec6\u0ec7\7\u01e0\2\2\u0ec7\u0ecd\bq\1\2\u0ec8\u0ec9\7\u01e1"+
		"\2\2\u0ec9\u0ecd\bq\1\2\u0eca\u0ecb\7\u01ec\2\2\u0ecb\u0ecd\bq\1\2\u0ecc"+
		"\u0c72\3\2\2\2\u0ecc\u0c74\3\2\2\2\u0ecc\u0c76\3\2\2\2\u0ecc\u0c78\3\2"+
		"\2\2\u0ecc\u0c7a\3\2\2\2\u0ecc\u0c7c\3\2\2\2\u0ecc\u0c7e\3\2\2\2\u0ecc"+
		"\u0c80\3\2\2\2\u0ecc\u0c82\3\2\2\2\u0ecc\u0c84\3\2\2\2\u0ecc\u0c86\3\2"+
		"\2\2\u0ecc\u0c88\3\2\2\2\u0ecc\u0c8a\3\2\2\2\u0ecc\u0c8c\3\2\2\2\u0ecc"+
		"\u0c8e\3\2\2\2\u0ecc\u0c90\3\2\2\2\u0ecc\u0c92\3\2\2\2\u0ecc\u0c94\3\2"+
		"\2\2\u0ecc\u0c96\3\2\2\2\u0ecc\u0c98\3\2\2\2\u0ecc\u0c9a\3\2\2\2\u0ecc"+
		"\u0c9c\3\2\2\2\u0ecc\u0c9e\3\2\2\2\u0ecc\u0ca0\3\2\2\2\u0ecc\u0ca2\3\2"+
		"\2\2\u0ecc\u0ca4\3\2\2\2\u0ecc\u0ca6\3\2\2\2\u0ecc\u0ca8\3\2\2\2\u0ecc"+
		"\u0caa\3\2\2\2\u0ecc\u0cac\3\2\2\2\u0ecc\u0cae\3\2\2\2\u0ecc\u0cb0\3\2"+
		"\2\2\u0ecc\u0cb2\3\2\2\2\u0ecc\u0cb4\3\2\2\2\u0ecc\u0cb6\3\2\2\2\u0ecc"+
		"\u0cb8\3\2\2\2\u0ecc\u0cba\3\2\2\2\u0ecc\u0cbc\3\2\2\2\u0ecc\u0cbe\3\2"+
		"\2\2\u0ecc\u0cc0\3\2\2\2\u0ecc\u0cc2\3\2\2\2\u0ecc\u0cc4\3\2\2\2\u0ecc"+
		"\u0cc6\3\2\2\2\u0ecc\u0cc8\3\2\2\2\u0ecc\u0cca\3\2\2\2\u0ecc\u0ccc\3\2"+
		"\2\2\u0ecc\u0cce\3\2\2\2\u0ecc\u0cd0\3\2\2\2\u0ecc\u0cd2\3\2\2\2\u0ecc"+
		"\u0cd4\3\2\2\2\u0ecc\u0cd6\3\2\2\2\u0ecc\u0cd8\3\2\2\2\u0ecc\u0cda\3\2"+
		"\2\2\u0ecc\u0cdc\3\2\2\2\u0ecc\u0cde\3\2\2\2\u0ecc\u0ce0\3\2\2\2\u0ecc"+
		"\u0ce2\3\2\2\2\u0ecc\u0ce4\3\2\2\2\u0ecc\u0ce6\3\2\2\2\u0ecc\u0ce8\3\2"+
		"\2\2\u0ecc\u0cea\3\2\2\2\u0ecc\u0cec\3\2\2\2\u0ecc\u0cee\3\2\2\2\u0ecc"+
		"\u0cf0\3\2\2\2\u0ecc\u0cf2\3\2\2\2\u0ecc\u0cf4\3\2\2\2\u0ecc\u0cf6\3\2"+
		"\2\2\u0ecc\u0cf8\3\2\2\2\u0ecc\u0cfa\3\2\2\2\u0ecc\u0cfc\3\2\2\2\u0ecc"+
		"\u0cfe\3\2\2\2\u0ecc\u0d00\3\2\2\2\u0ecc\u0d02\3\2\2\2\u0ecc\u0d04\3\2"+
		"\2\2\u0ecc\u0d06\3\2\2\2\u0ecc\u0d08\3\2\2\2\u0ecc\u0d0a\3\2\2\2\u0ecc"+
		"\u0d0c\3\2\2\2\u0ecc\u0d0e\3\2\2\2\u0ecc\u0d10\3\2\2\2\u0ecc\u0d12\3\2"+
		"\2\2\u0ecc\u0d14\3\2\2\2\u0ecc\u0d16\3\2\2\2\u0ecc\u0d18\3\2\2\2\u0ecc"+
		"\u0d1a\3\2\2\2\u0ecc\u0d1c\3\2\2\2\u0ecc\u0d1e\3\2\2\2\u0ecc\u0d20\3\2"+
		"\2\2\u0ecc\u0d22\3\2\2\2\u0ecc\u0d24\3\2\2\2\u0ecc\u0d26\3\2\2\2\u0ecc"+
		"\u0d28\3\2\2\2\u0ecc\u0d2a\3\2\2\2\u0ecc\u0d2c\3\2\2\2\u0ecc\u0d2e\3\2"+
		"\2\2\u0ecc\u0d30\3\2\2\2\u0ecc\u0d32\3\2\2\2\u0ecc\u0d34\3\2\2\2\u0ecc"+
		"\u0d36\3\2\2\2\u0ecc\u0d38\3\2\2\2\u0ecc\u0d3a\3\2\2\2\u0ecc\u0d3c\3\2"+
		"\2\2\u0ecc\u0d3e\3\2\2\2\u0ecc\u0d40\3\2\2\2\u0ecc\u0d42\3\2\2\2\u0ecc"+
		"\u0d44\3\2\2\2\u0ecc\u0d46\3\2\2\2\u0ecc\u0d48\3\2\2\2\u0ecc\u0d4a\3\2"+
		"\2\2\u0ecc\u0d4c\3\2\2\2\u0ecc\u0d4e\3\2\2\2\u0ecc\u0d50\3\2\2\2\u0ecc"+
		"\u0d52\3\2\2\2\u0ecc\u0d54\3\2\2\2\u0ecc\u0d56\3\2\2\2\u0ecc\u0d58\3\2"+
		"\2\2\u0ecc\u0d5a\3\2\2\2\u0ecc\u0d5c\3\2\2\2\u0ecc\u0d5e\3\2\2\2\u0ecc"+
		"\u0d60\3\2\2\2\u0ecc\u0d62\3\2\2\2\u0ecc\u0d64\3\2\2\2\u0ecc\u0d66\3\2"+
		"\2\2\u0ecc\u0d68\3\2\2\2\u0ecc\u0d6a\3\2\2\2\u0ecc\u0d6c\3\2\2\2\u0ecc"+
		"\u0d6e\3\2\2\2\u0ecc\u0d70\3\2\2\2\u0ecc\u0d72\3\2\2\2\u0ecc\u0d74\3\2"+
		"\2\2\u0ecc\u0d76\3\2\2\2\u0ecc\u0d78\3\2\2\2\u0ecc\u0d7a\3\2\2\2\u0ecc"+
		"\u0d7c\3\2\2\2\u0ecc\u0d7e\3\2\2\2\u0ecc\u0d80\3\2\2\2\u0ecc\u0d82\3\2"+
		"\2\2\u0ecc\u0d84\3\2\2\2\u0ecc\u0d86\3\2\2\2\u0ecc\u0d88\3\2\2\2\u0ecc"+
		"\u0d8a\3\2\2\2\u0ecc\u0d8c\3\2\2\2\u0ecc\u0d8e\3\2\2\2\u0ecc\u0d90\3\2"+
		"\2\2\u0ecc\u0d92\3\2\2\2\u0ecc\u0d94\3\2\2\2\u0ecc\u0d96\3\2\2\2\u0ecc"+
		"\u0d98\3\2\2\2\u0ecc\u0d9a\3\2\2\2\u0ecc\u0d9c\3\2\2\2\u0ecc\u0d9e\3\2"+
		"\2\2\u0ecc\u0da0\3\2\2\2\u0ecc\u0da2\3\2\2\2\u0ecc\u0da4\3\2\2\2\u0ecc"+
		"\u0da6\3\2\2\2\u0ecc\u0da8\3\2\2\2\u0ecc\u0daa\3\2\2\2\u0ecc\u0dac\3\2"+
		"\2\2\u0ecc\u0dae\3\2\2\2\u0ecc\u0db0\3\2\2\2\u0ecc\u0db2\3\2\2\2\u0ecc"+
		"\u0db4\3\2\2\2\u0ecc\u0db6\3\2\2\2\u0ecc\u0db8\3\2\2\2\u0ecc\u0dba\3\2"+
		"\2\2\u0ecc\u0dbc\3\2\2\2\u0ecc\u0dbe\3\2\2\2\u0ecc\u0dc0\3\2\2\2\u0ecc"+
		"\u0dc2\3\2\2\2\u0ecc\u0dc4\3\2\2\2\u0ecc\u0dc6\3\2\2\2\u0ecc\u0dc8\3\2"+
		"\2\2\u0ecc\u0dca\3\2\2\2\u0ecc\u0dcc\3\2\2\2\u0ecc\u0dce\3\2\2\2\u0ecc"+
		"\u0dd0\3\2\2\2\u0ecc\u0dd2\3\2\2\2\u0ecc\u0dd4\3\2\2\2\u0ecc\u0dd6\3\2"+
		"\2\2\u0ecc\u0dd8\3\2\2\2\u0ecc\u0dda\3\2\2\2\u0ecc\u0ddc\3\2\2\2\u0ecc"+
		"\u0dde\3\2\2\2\u0ecc\u0de0\3\2\2\2\u0ecc\u0de2\3\2\2\2\u0ecc\u0de4\3\2"+
		"\2\2\u0ecc\u0de6\3\2\2\2\u0ecc\u0de8\3\2\2\2\u0ecc\u0dea\3\2\2\2\u0ecc"+
		"\u0dec\3\2\2\2\u0ecc\u0dee\3\2\2\2\u0ecc\u0df0\3\2\2\2\u0ecc\u0df2\3\2"+
		"\2\2\u0ecc\u0df4\3\2\2\2\u0ecc\u0df6\3\2\2\2\u0ecc\u0df8\3\2\2\2\u0ecc"+
		"\u0dfa\3\2\2\2\u0ecc\u0dfc\3\2\2\2\u0ecc\u0dfe\3\2\2\2\u0ecc\u0e00\3\2"+
		"\2\2\u0ecc\u0e02\3\2\2\2\u0ecc\u0e04\3\2\2\2\u0ecc\u0e06\3\2\2\2\u0ecc"+
		"\u0e08\3\2\2\2\u0ecc\u0e0a\3\2\2\2\u0ecc\u0e0c\3\2\2\2\u0ecc\u0e0e\3\2"+
		"\2\2\u0ecc\u0e10\3\2\2\2\u0ecc\u0e12\3\2\2\2\u0ecc\u0e14\3\2\2\2\u0ecc"+
		"\u0e16\3\2\2\2\u0ecc\u0e18\3\2\2\2\u0ecc\u0e1a\3\2\2\2\u0ecc\u0e1c\3\2"+
		"\2\2\u0ecc\u0e1e\3\2\2\2\u0ecc\u0e20\3\2\2\2\u0ecc\u0e22\3\2\2\2\u0ecc"+
		"\u0e24\3\2\2\2\u0ecc\u0e26\3\2\2\2\u0ecc\u0e28\3\2\2\2\u0ecc\u0e2a\3\2"+
		"\2\2\u0ecc\u0e2c\3\2\2\2\u0ecc\u0e2e\3\2\2\2\u0ecc\u0e30\3\2\2\2\u0ecc"+
		"\u0e32\3\2\2\2\u0ecc\u0e34\3\2\2\2\u0ecc\u0e36\3\2\2\2\u0ecc\u0e38\3\2"+
		"\2\2\u0ecc\u0e3a\3\2\2\2\u0ecc\u0e3c\3\2\2\2\u0ecc\u0e3e\3\2\2\2\u0ecc"+
		"\u0e40\3\2\2\2\u0ecc\u0e42\3\2\2\2\u0ecc\u0e44\3\2\2\2\u0ecc\u0e46\3\2"+
		"\2\2\u0ecc\u0e48\3\2\2\2\u0ecc\u0e4a\3\2\2\2\u0ecc\u0e4c\3\2\2\2\u0ecc"+
		"\u0e4e\3\2\2\2\u0ecc\u0e50\3\2\2\2\u0ecc\u0e52\3\2\2\2\u0ecc\u0e54\3\2"+
		"\2\2\u0ecc\u0e56\3\2\2\2\u0ecc\u0e58\3\2\2\2\u0ecc\u0e5a\3\2\2\2\u0ecc"+
		"\u0e5c\3\2\2\2\u0ecc\u0e5e\3\2\2\2\u0ecc\u0e60\3\2\2\2\u0ecc\u0e62\3\2"+
		"\2\2\u0ecc\u0e64\3\2\2\2\u0ecc\u0e66\3\2\2\2\u0ecc\u0e68\3\2\2\2\u0ecc"+
		"\u0e6a\3\2\2\2\u0ecc\u0e6c\3\2\2\2\u0ecc\u0e6e\3\2\2\2\u0ecc\u0e70\3\2"+
		"\2\2\u0ecc\u0e72\3\2\2\2\u0ecc\u0e74\3\2\2\2\u0ecc\u0e76\3\2\2\2\u0ecc"+
		"\u0e78\3\2\2\2\u0ecc\u0e7a\3\2\2\2\u0ecc\u0e7c\3\2\2\2\u0ecc\u0e7e\3\2"+
		"\2\2\u0ecc\u0e80\3\2\2\2\u0ecc\u0e82\3\2\2\2\u0ecc\u0e84\3\2\2\2\u0ecc"+
		"\u0e86\3\2\2\2\u0ecc\u0e88\3\2\2\2\u0ecc\u0e8a\3\2\2\2\u0ecc\u0e8c\3\2"+
		"\2\2\u0ecc\u0e8e\3\2\2\2\u0ecc\u0e90\3\2\2\2\u0ecc\u0e92\3\2\2\2\u0ecc"+
		"\u0e94\3\2\2\2\u0ecc\u0e96\3\2\2\2\u0ecc\u0e98\3\2\2\2\u0ecc\u0e9a\3\2"+
		"\2\2\u0ecc\u0e9c\3\2\2\2\u0ecc\u0e9e\3\2\2\2\u0ecc\u0ea0\3\2\2\2\u0ecc"+
		"\u0ea2\3\2\2\2\u0ecc\u0ea4\3\2\2\2\u0ecc\u0ea6\3\2\2\2\u0ecc\u0ea8\3\2"+
		"\2\2\u0ecc\u0eaa\3\2\2\2\u0ecc\u0eac\3\2\2\2\u0ecc\u0eae\3\2\2\2\u0ecc"+
		"\u0eb0\3\2\2\2\u0ecc\u0eb2\3\2\2\2\u0ecc\u0eb4\3\2\2\2\u0ecc\u0eb6\3\2"+
		"\2\2\u0ecc\u0eb8\3\2\2\2\u0ecc\u0eba\3\2\2\2\u0ecc\u0ebc\3\2\2\2\u0ecc"+
		"\u0ebe\3\2\2\2\u0ecc\u0ec0\3\2\2\2\u0ecc\u0ec2\3\2\2\2\u0ecc\u0ec4\3\2"+
		"\2\2\u0ecc\u0ec6\3\2\2\2\u0ecc\u0ec8\3\2\2\2\u0ecc\u0eca\3\2\2\2\u0ecd"+
		"\u00e1\3\2\2\2\u00a0\u00ec\u00f6\u0106\u011e\u013b\u0149\u014f\u0154\u0158"+
		"\u0165\u0170\u0189\u0197\u019d\u01b3\u01bf\u01c8\u01d7\u01f5\u01ff\u0205"+
		"\u020d\u0212\u0218\u0226\u022c\u0238\u0244\u024e\u025d\u0263\u026a\u0276"+
		"\u027e\u0289\u0298\u02a3\u02aa\u02b0\u02b7\u02bf\u02ce\u02de\u02e7\u02f0"+
		"\u02f8\u0300\u0311\u0317\u032f\u0335\u0345\u034b\u0355\u0365\u0377\u0383"+
		"\u0387\u03a3\u03af\u03ba\u03ce\u03da\u03ec\u03fe\u0405\u040a\u040f\u0414"+
		"\u041b\u0422\u0428\u042f\u0437\u0441\u044a\u0463\u0471\u0476\u0480\u048b"+
		"\u0490\u0497\u04a5\u04aa\u04b1\u04bc\u04c7\u04d0\u04d4\u04d7\u04de\u04e7"+
		"\u04f9\u0504\u050d\u0516\u051b\u0522\u052a\u0531\u053b\u054f\u0554\u0561"+
		"\u0572\u0583\u058d\u0593\u059b\u05a9\u05dd\u0633\u0635\u0660\u066a\u067d"+
		"\u068b\u069e\u06c4\u06d3\u06ea\u0702\u0780\u08a5\u08b1\u08c1\u08cf\u090b"+
		"\u0913\u093a\u0965\u0975\u0984\u0994\u09a2\u09b7\u0a34\u0a3a\u0a77\u0a7f"+
		"\u0a8a\u0a9b\u0ac6\u0b0f\u0b23\u0bf7\u0c09\u0c1d\u0c2f\u0c35\u0c3f\u0c46"+
		"\u0c55\u0c60\u0c67\u0c6e\u0ecc";
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