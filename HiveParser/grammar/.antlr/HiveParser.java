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
		T__9=10, T__10=11, NULL_CONST=12, BOOL_LITERAL=13, T_ALL=14, T_ALTER=15, 
		T_AND=16, T_ARRAY=17, T_AS=18, T_AUTHORIZATION=19, T_BETWEEN=20, T_BIGINT=21, 
		T_BINARY=22, T_BOOLEAN=23, T_BOTH=24, T_BY=25, T_CASE=26, T_CAST=27, T_CHAR=28, 
		T_COLUMN=29, T_CONF=30, T_CREATE=31, T_CROSS=32, T_CUBE=33, T_CURRENT=34, 
		T_CURRENT_DATE=35, T_CURRENT_TIMESTAMP=36, T_CURSOR=37, T_DATABASE=38, 
		T_DATE=39, T_DECIMAL=40, T_DELETE=41, T_DESCRIBE=42, T_DISTINCT=43, T_DOUBLE=44, 
		T_DROP=45, T_ELSE=46, T_END=47, T_EXCHANGE=48, T_EXISTS=49, T_EXTENDED=50, 
		T_EXTERNAL=51, T_FALSE=52, T_FETCH=53, T_FLOAT=54, T_FOLLOWING=55, T_FOR=56, 
		T_FROM=57, T_FULL=58, T_FUNCTION=59, T_GRANT=60, T_GROUP=61, T_GROUPING=62, 
		T_HAVING=63, T_IF=64, T_IMPORT=65, T_IN=66, T_INNER=67, T_INSERT=68, T_INT=69, 
		T_INTERSECT=70, T_INTERVAL=71, T_INTO=72, T_IS=73, T_JOIN=74, T_LATERAL=75, 
		T_LEFT=76, T_LESS_W=77, T_LIKE=78, T_LOCAL=79, T_MACRO=80, T_MAP=81, T_MORE=82, 
		T_NONE=83, T_NOT=84, T_NULL=85, T_OF=86, T_ON=87, T_OR=88, T_ORDER=89, 
		T_OUT=90, T_OUTER=91, T_OVER=92, T_PARTIALSCAN=93, T_PARTITION=94, T_PERCENT=95, 
		T_PRECEDING=96, T_PRESERVE=97, T_PROCEDURE=98, T_RANGE=99, T_READS=100, 
		T_REDUCE=101, T_REVOKE=102, T_RIGHT=103, T_ROLLUP=104, T_ROW=105, T_ROWS=106, 
		T_SELECT=107, T_SET=108, T_SMALLINT=109, T_TABLE=110, T_TABLESAMPLE=111, 
		T_THEN=112, T_TIMESTAMP=113, T_TO=114, T_TRANSFORM=115, T_TRIGGER=116, 
		T_TRUE=117, T_TRUNCATE=118, T_UNBOUNDED=119, T_UNION=120, T_UNIQUEJOIN=121, 
		T_UPDATE=122, T_USER=123, T_USING=124, T_UTC_TMESTAMP=125, T_VALUES=126, 
		T_VARCHAR=127, T_WHEN=128, T_WHERE=129, T_WINDOW=130, T_WITH=131, T_COMMIT=132, 
		T_ONLY=133, T_REGEXP=134, T_RLIKE=135, T_ROLLBACK=136, T_START=137, T_CACHE=138, 
		T_CONSTRAINT=139, T_FOREIGN=140, T_PRIMARY=141, T_REFERENCES=142, T_DAYOFWEEK=143, 
		T_EXTRACT=144, T_FLOOR=145, T_INTEGER=146, T_PRECISION=147, T_VIEWS=148, 
		T_TIME=149, T_NUMERIC=150, T_SYNC=151, T_ADD_W=152, T_ADMIN=153, T_AFTER=154, 
		T_ANALYZE=155, T_ARCHIVE=156, T_ASC=157, T_AUTOCOMMIT=158, T_BEFORE=159, 
		T_BUCKET=160, T_BUCKETS=161, T_CASCADE=162, T_CHANGE=163, T_CLUSTER=164, 
		T_CLUSTERED=165, T_CLUSTERSTATUS=166, T_COLLECTION=167, T_COLUMNS=168, 
		T_COMMENT=169, T_COMPACT=170, T_COMPACTIONS=171, T_COMPUTE=172, T_CONCATENATE=173, 
		T_CONTINUE=174, T_DATA=175, T_DATABASES=176, T_DATETIME=177, T_DAY=178, 
		T_DBPROPERTIES=179, T_DEFERRED=180, T_DEFINED=181, T_DELIMITED=182, T_DEPENDENCY=183, 
		T_DESC=184, T_DIRECTORIES=185, T_DIRECTORY=186, T_DISABLE=187, T_DISTRIBUTE=188, 
		T_ELEM_TYPE=189, T_ENABLE=190, T_ESCAPED=191, T_EXCLUSIVE=192, T_EXPLAIN=193, 
		T_EXPORT=194, T_FIELDS=195, T_FILE=196, T_FILEFORMAT=197, T_FIRST=198, 
		T_FORMAT=199, T_FORMATTED=200, T_FUNCTIONS=201, T_HOLD_DDLTIME=202, T_HOUR=203, 
		T_IDXPROPERTIES=204, T_IGNORE=205, T_INDEX=206, T_INDEXES=207, T_INPATH=208, 
		T_INPUTDRIVER=209, T_INPUTFORMAT=210, T_ITEMS=211, T_JAR=212, T_KEYS=213, 
		T_KEY_TYPE=214, T_LIMIT=215, T_LINES=216, T_LOAD=217, T_LOCATION=218, 
		T_LOCK=219, T_LOCKS=220, T_LOGICAL=221, T_LONG=222, T_MAPJOIN=223, T_MATERIALIZED=224, 
		T_METADATA=225, T_MINUS=226, T_MINUTE=227, T_MONTH=228, T_MSCK=229, T_NOSCAN=230, 
		T_NO_DROP=231, T_OFFLINE=232, T_OPTION=233, T_OUTPUTDRIVER=234, T_OUTPUTFORMAT=235, 
		T_OVERWRITE=236, T_OWNER=237, T_PARTITIONED=238, T_PARTITIONS=239, T_PLUS=240, 
		T_PRETTY=241, T_PRINCIPALS=242, T_PROTECTION=243, T_PURGE=244, T_READ=245, 
		T_READONLY=246, T_REBUILD=247, T_RECORDREADER=248, T_RECORDWRITER=249, 
		T_RELOAD=250, T_RENAME=251, T_REPAIR=252, T_REPLACE=253, T_REPLICATION=254, 
		T_RESTRICT=255, T_REWRITE=256, T_ROLE=257, T_ROLES=258, T_SCHEMA=259, 
		T_SCHEMAS=260, T_SECOND=261, T_SEMI=262, T_SERDE=263, T_SERDEPROPERTIES=264, 
		T_SERVER=265, T_SETS=266, T_SHARED=267, T_SHOW=268, T_SHOW_DATABASE=269, 
		T_SKEWED=270, T_SORT=271, T_SORTED=272, T_SSL=273, T_STATISTICS=274, T_STORED=275, 
		T_STREAMTABLE=276, T_STRING=277, T_STRUCT=278, T_TABLES=279, T_TBLPROPERTIES=280, 
		T_TEMPORARY=281, T_TERMINATED=282, T_TINYINT=283, T_TOUCH=284, T_TRANSACTIONS=285, 
		T_UNARCHIVE=286, T_UNDO=287, T_UNIONTYPE=288, T_UNLOCK=289, T_UNSET=290, 
		T_UNSIGNED=291, T_URI=292, T_USE=293, T_UTC=294, T_UTCTIMESTAMP=295, T_VALUE_TYPE=296, 
		T_VIEW=297, T_WHILE=298, T_YEAR=299, T_ISOLATION=300, T_LEVEL=301, T_OFFSET=302, 
		T_SNAPSHOT=303, T_TRANSACTION=304, T_WORK=305, T_WRITE=306, T_ABORT=307, 
		T_KEY=308, T_LAST=309, T_NORELY=310, T_NOVALIDATE=311, T_NULLS=312, T_RELY=313, 
		T_VALIDATE=314, T_DETAIL=315, T_DOW=316, T_EXPRESSION=317, T_OPERATOR=318, 
		T_QUARTER=319, T_SUMMARY=320, T_VECTORIZATION=321, T_WEEK=322, T_YEARS=323, 
		T_MONTHS=324, T_WEEKS=325, T_DAYS=326, T_HOURS=327, T_MINUTES=328, T_SECONDS=329, 
		T_TIMESTAMPTZ=330, T_ZONE=331, T_COVAR_POP=332, T_BROUND=333, T_CURRENT_USER=334, 
		T_LPAD=335, T_UNHEX=336, T_PI=337, T_STAR=338, T_REGEXP_REPLACE=339, T_ASCII=340, 
		T_GET_JSON_OBJECT=341, T_COS=342, T_REGR_SXX=343, T_WIDTH_BUCKET=344, 
		T_REPEAT=345, T_ASIN=346, T_NULLIF=347, T_CONTEXT_NGRAMS=348, T_MASK_HASH=349, 
		T_PARENT=350, T_STR_TO_MAP=351, T_SIN=352, T_UNBASE64=353, T_COUNT=354, 
		T_IN_FILE=355, T_CONV=356, T_SIGN=357, T_REGR_COUNT=358, T_SQRT=359, T_REGR_INTERCEPT=360, 
		T_UNIX_TIMESTAMP=361, T_MASK_LAST_N=362, T_AES_ENCRYPT=363, T_MASK_FIRST_N=364, 
		T_REVERSE=365, T_NEXT_DAY=366, T_HISTOGRAM_NUMERIC=367, T_TRUNC=368, T_SHIFTRIGHT=369, 
		T_ADD_MONTHS=370, T_MAX=371, T_DATE_SUB=372, T_UNARY=373, T_LN=374, T_OCTET_LENGTH=375, 
		T_EXP=376, T_FIELD=377, T_NTILE=378, T_COLLECT_LIST=379, T_RTRIM=380, 
		T_LTRIM=381, T_REFLECT=382, T_SHA2=383, T_PRINTF=384, T_CEIL=385, T_CEILING=386, 
		T_CONCAT=387, T_NVL=388, T_MD5=389, T_ISNULL=390, T_ISNOTNULL=391, T_PARSE_URL=392, 
		T_CBRT=393, T_VARIANCE=394, T_VAR_POP=395, T_DEGREES=396, T_RADIANS=397, 
		T_LEAST=398, T_BUILDVERSION=399, T_SUBSTR=400, T_SUBSTRING=401, T_SIZE=402, 
		T_POSITIVE=403, T_FROM_UNIXTIME=404, T_CHR=405, T_PERCENTILE_APPROX=406, 
		T_ASSERT_TRUE=407, T_MONTHS_BETWEEN=408, T_INITCAP=409, T_ACOS=410, T_WEEKOFYEAR=411, 
		T_LAST_DAY=412, T_CHARACTER_LENGTH=413, T_SUBSTRING_INDEX=414, T_TRANSLATE=415, 
		T_LEVENSHTEIN=416, T_COVAR_SAMP=417, T_DATEDIFF=418, T_LOG=419, T_NGRAMS=420, 
		T_LENGTH=421, T_REGR_AVGX=422, T_FIND_IN_SET=423, T_XOR=424, T_NEGATIVE=425, 
		T_DATE_ADD=426, T_PARSE_URL_TUPLE=427, T_CONCAT_WS=428, T_ELT=429, T_LOGGED_IN_USER=430, 
		T_MAP_VALUES=431, T_JAVA_METHOD=432, T_MAP_KEYS=433, T_CORR=434, T_SORT_ARRAY=435, 
		T_SHIFTRIGHTUNSIGNED=436, T_AES_DECRYPT=437, T_SHA1=438, T_SHA=439, T_AVG=440, 
		T_CURRENT_DATABASE=441, T_ARRAY_CONTAINS=442, T_FROM_UTC_TIMESTAMP=443, 
		T_DECODE=444, T_ABS=445, T_EXPLODE=446, T_E=447, T_SUM=448, T_COALESCE=449, 
		T_LOWER=450, T_LCASE=451, T_ENCODE=452, T_VAR_SAMP=453, T_INLINE=454, 
		T_SPACE=455, T_HASH=456, T_ROUND=457, T_SPLIT=458, T_BASE64=459, T_TO_UTC_TIMESTAMP=460, 
		T_REGEXP_EXTRACT=461, T_CRC32=462, T_HEX=463, T_REGR_SYY=464, T_UPPER=465, 
		T_UCASE=466, T_STDDEV_POP=467, T_DATE_FORMAT=468, T_REGR_R2=469, T_ATAN=470, 
		T_MIN=471, T_POSEXPLODE=472, T_BRACKET_OP=473, T_PMOD=474, T_POW=475, 
		T_LAG=476, T_LEAD=477, T_POWER=478, T_SENTENCES=479, T_MASK_SHOW_FIRST_N=480, 
		T_SOUNDEX=481, T_SURROGATE_KEY=482, T_SHIFTLEFT=483, T_PERCENTILE=484, 
		T_TO_DATE=485, T_REGR_AVGY=486, T_RPAD=487, T_FACTORIAL=488, T_COLLECT_SET=489, 
		T_EQUAL_W=490, T_BEGINNING=491, T_VERSION=492, T_STACK=493, T_BIN=494, 
		T_TAN=495, T_TRIM=496, T_REGR_SLOPE=497, T_MASK=498, T_MASK_SHOW_LAST_N=499, 
		T_INSTR=500, T_GREATEST=501, T_REGR_SXY=502, T_FORMAT_NUMBER=503, T_LOCATE=504, 
		T_STDDEV_SAMP=505, T_RAND=506, T_LOG2=507, T_LOG10=508, T_JSON_TUPLE=509, 
		T_QUOTE=510, T_SYSDATE=511, T_XPATH=512, T_XPATH_BOOLEAN=513, T_XPATH_DOUBLE=514, 
		T_XPATH_FLOAT=515, T_XPATH_INT=516, T_XPATH_LONG=517, T_XPATH_NUMBER=518, 
		T_XPATH_SHORT=519, T_XPATH_STRING=520, T_FIELD_IN_SET=521, T_GET_JSON_OBJECTS=522, 
		T_IN_STR=523, T_NAMED_STRUCT=524, T_RANK=525, T_DENSE_RANK=526, T_ROW_NUMBER=527, 
		T_CUME_DIST=528, T_PERCENT_RANK=529, T_UNIQUE=530, T_CHECK=531, T_DEFAULT=532, 
		T_SEQUENCEFILE=533, T_TEXTFILE=534, T_RCFILE=535, T_ORC=536, T_PARQUET=537, 
		T_AVRO=538, T_JSONFILE=539, T_HIVECONF=540, T_HIVEVAR=541, T_BYTE=542, 
		T_EXIT=543, T_COLON=544, T_COMMA=545, T_PIPE=546, T_DIV=547, T_DOT2=548, 
		T_EQUAL=549, T_EQUAL2=550, T_NOTEQUAL=551, T_NOTEQUAL2=552, T_GREATER=553, 
		T_GREATEREQUAL=554, T_LESS=555, T_LESSEQUAL=556, T_MUL=557, T_OPEN_B=558, 
		T_OPEN_P=559, T_OPEN_SB=560, T_CLOSE_B=561, T_CLOSE_P=562, T_CLOSE_SB=563, 
		T_SEMICOLON=564, IDENTIFIER=565, INT_LITERAL=566, DECIMAL_LITERAL=567, 
		STRING_LITERAL=568, L_INT=569, L_DEC=570, L_M_COMMENT=571, L_S_COMMENT=572, 
		SPACES=573, UNEXPECTED_CHAR=574;
	public static final int
		RULE_program = 0, RULE_stmt_list = 1, RULE_data_type = 2, RULE_primitive_type = 3, 
		RULE_complex_type = 4, RULE_dtype_len = 5, RULE_stmt = 6, RULE_analyze_stmt = 7, 
		RULE_opt_for_columns = 8, RULE_opt_noscan = 9, RULE_ddl_stmt = 10, RULE_insert_stmt = 11, 
		RULE_opt_insert_partitions = 12, RULE_variable_substitution = 13, RULE_set_var_value = 14, 
		RULE_use_var = 15, RULE_system_var_identifier = 16, RULE_opt_var_set_type = 17, 
		RULE_opt_var_use_type = 18, RULE_var_name = 19, RULE_droptable_stmt = 20, 
		RULE_opt_drop_table_purge = 21, RULE_create_table_stmt = 22, RULE_opt_column_specs = 23, 
		RULE_opt_constraint_specification = 24, RULE_opt_comment = 25, RULE_table_options = 26, 
		RULE_opt_partitioned_table = 27, RULE_partition_spec = 28, RULE_opt_clustered_by_table = 29, 
		RULE_opt_sorted_by_table = 30, RULE_opt_sorted_by_asc_desc = 31, RULE_opt_skewed_by_table = 32, 
		RULE_opt_on_skewed = 33, RULE_opt_skewed_stored_as_directory = 34, RULE_opt_row_formated = 35, 
		RULE_row_format = 36, RULE_opt_field_terminated_by = 37, RULE_opt_collection_items_terminated_by = 38, 
		RULE_opt_map_keys_terminated_by = 39, RULE_opt_lines_terminated_by = 40, 
		RULE_opt_null_defined_as = 41, RULE_opt_serde_properties = 42, RULE_serde_val = 43, 
		RULE_opt_stored_as = 44, RULE_opt_location = 45, RULE_opt_table_properties = 46, 
		RULE_opt_table_val = 47, RULE_opt_as_select = 48, RULE_file_format = 49, 
		RULE_column_definition = 50, RULE_column_constraint = 51, RULE_default_value = 52, 
		RULE_constraint_specification = 53, RULE_opt_constraint_enable_disable = 54, 
		RULE_opt_constraint_enable = 55, RULE_opt_constraint_disable = 56, RULE_opt_constraint_novalidate = 57, 
		RULE_opt_constraint_rely_no_rely = 58, RULE_opt_if_not_exists_flag = 59, 
		RULE_opt_if_exists = 60, RULE_table_type = 61, RULE_full_select_stmt = 62, 
		RULE_select_union_stmt = 63, RULE_select_union_type = 64, RULE_select_stmt = 65, 
		RULE_opt_lateral_view_expr = 66, RULE_column_identifier = 67, RULE_opt_where_expr = 68, 
		RULE_opt_group_by_list = 69, RULE_opt_having_expr = 70, RULE_opt_order_by_list = 71, 
		RULE_opt_order_by_mode = 72, RULE_opt_limit = 73, RULE_table_reference = 74, 
		RULE_join_table = 75, RULE_join_condition = 76, RULE_table_factor = 77, 
		RULE_select_all_distinct = 78, RULE_select_expr_list = 79, RULE_select_expr = 80, 
		RULE_over_clause = 81, RULE_opt_partitions_by_list = 82, RULE_over_func = 83, 
		RULE_analytic_func = 84, RULE_expr_list = 85, RULE_expr = 86, RULE_complex_types = 87, 
		RULE_array_def = 88, RULE_map_def = 89, RULE_struct_def = 90, RULE_named_struct_def = 91, 
		RULE_str_func = 92, RULE_misc_func = 93, RULE_expr_concat = 94, RULE_expr_concat_item = 95, 
		RULE_cond_func = 96, RULE_date_func = 97, RULE_dat_convrt_func = 98, RULE_basic_aggr_func = 99, 
		RULE_aggr_func = 100, RULE_tab_generate_func = 101, RULE_math_func = 102, 
		RULE_generic_function = 103, RULE_literal_values = 104, RULE_ident = 105, 
		RULE_tab_ident = 106, RULE_complex_name = 107, RULE_complex_atom_name = 108, 
		RULE_name_identifier = 109, RULE_date_literal = 110, RULE_timestamp_literal = 111, 
		RULE_set_operators_is = 112, RULE_set_operators_like = 113, RULE_set_operators_in = 114, 
		RULE_set_operators_exists = 115, RULE_unary_operator = 116, RULE_reserved_words = 117, 
		RULE_non_reserved_words = 118, RULE_function_names = 119;
	public static final String[] ruleNames = {
		"program", "stmt_list", "data_type", "primitive_type", "complex_type", 
		"dtype_len", "stmt", "analyze_stmt", "opt_for_columns", "opt_noscan", 
		"ddl_stmt", "insert_stmt", "opt_insert_partitions", "variable_substitution", 
		"set_var_value", "use_var", "system_var_identifier", "opt_var_set_type", 
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
		"over_clause", "opt_partitions_by_list", "over_func", "analytic_func", 
		"expr_list", "expr", "complex_types", "array_def", "map_def", "struct_def", 
		"named_struct_def", "str_func", "misc_func", "expr_concat", "expr_concat_item", 
		"cond_func", "date_func", "dat_convrt_func", "basic_aggr_func", "aggr_func", 
		"tab_generate_func", "math_func", "generic_function", "literal_values", 
		"ident", "tab_ident", "complex_name", "complex_atom_name", "name_identifier", 
		"date_literal", "timestamp_literal", "set_operators_is", "set_operators_like", 
		"set_operators_in", "set_operators_exists", "unary_operator", "reserved_words", 
		"non_reserved_words", "function_names"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'.'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", 
		"'<=>'", "'!'", null, null, null, null, null, null, null, null, null, 
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "':'", "','", "'||'", "'/'", 
		"'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", "'<='", "'*'", 
		"'{'", "'('", "'['", "'}'", "')'", "']'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"NULL_CONST", "BOOL_LITERAL", "T_ALL", "T_ALTER", "T_AND", "T_ARRAY", 
		"T_AS", "T_AUTHORIZATION", "T_BETWEEN", "T_BIGINT", "T_BINARY", "T_BOOLEAN", 
		"T_BOTH", "T_BY", "T_CASE", "T_CAST", "T_CHAR", "T_COLUMN", "T_CONF", 
		"T_CREATE", "T_CROSS", "T_CUBE", "T_CURRENT", "T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", 
		"T_CURSOR", "T_DATABASE", "T_DATE", "T_DECIMAL", "T_DELETE", "T_DESCRIBE", 
		"T_DISTINCT", "T_DOUBLE", "T_DROP", "T_ELSE", "T_END", "T_EXCHANGE", "T_EXISTS", 
		"T_EXTENDED", "T_EXTERNAL", "T_FALSE", "T_FETCH", "T_FLOAT", "T_FOLLOWING", 
		"T_FOR", "T_FROM", "T_FULL", "T_FUNCTION", "T_GRANT", "T_GROUP", "T_GROUPING", 
		"T_HAVING", "T_IF", "T_IMPORT", "T_IN", "T_INNER", "T_INSERT", "T_INT", 
		"T_INTERSECT", "T_INTERVAL", "T_INTO", "T_IS", "T_JOIN", "T_LATERAL", 
		"T_LEFT", "T_LESS_W", "T_LIKE", "T_LOCAL", "T_MACRO", "T_MAP", "T_MORE", 
		"T_NONE", "T_NOT", "T_NULL", "T_OF", "T_ON", "T_OR", "T_ORDER", "T_OUT", 
		"T_OUTER", "T_OVER", "T_PARTIALSCAN", "T_PARTITION", "T_PERCENT", "T_PRECEDING", 
		"T_PRESERVE", "T_PROCEDURE", "T_RANGE", "T_READS", "T_REDUCE", "T_REVOKE", 
		"T_RIGHT", "T_ROLLUP", "T_ROW", "T_ROWS", "T_SELECT", "T_SET", "T_SMALLINT", 
		"T_TABLE", "T_TABLESAMPLE", "T_THEN", "T_TIMESTAMP", "T_TO", "T_TRANSFORM", 
		"T_TRIGGER", "T_TRUE", "T_TRUNCATE", "T_UNBOUNDED", "T_UNION", "T_UNIQUEJOIN", 
		"T_UPDATE", "T_USER", "T_USING", "T_UTC_TMESTAMP", "T_VALUES", "T_VARCHAR", 
		"T_WHEN", "T_WHERE", "T_WINDOW", "T_WITH", "T_COMMIT", "T_ONLY", "T_REGEXP", 
		"T_RLIKE", "T_ROLLBACK", "T_START", "T_CACHE", "T_CONSTRAINT", "T_FOREIGN", 
		"T_PRIMARY", "T_REFERENCES", "T_DAYOFWEEK", "T_EXTRACT", "T_FLOOR", "T_INTEGER", 
		"T_PRECISION", "T_VIEWS", "T_TIME", "T_NUMERIC", "T_SYNC", "T_ADD_W", 
		"T_ADMIN", "T_AFTER", "T_ANALYZE", "T_ARCHIVE", "T_ASC", "T_AUTOCOMMIT", 
		"T_BEFORE", "T_BUCKET", "T_BUCKETS", "T_CASCADE", "T_CHANGE", "T_CLUSTER", 
		"T_CLUSTERED", "T_CLUSTERSTATUS", "T_COLLECTION", "T_COLUMNS", "T_COMMENT", 
		"T_COMPACT", "T_COMPACTIONS", "T_COMPUTE", "T_CONCATENATE", "T_CONTINUE", 
		"T_DATA", "T_DATABASES", "T_DATETIME", "T_DAY", "T_DBPROPERTIES", "T_DEFERRED", 
		"T_DEFINED", "T_DELIMITED", "T_DEPENDENCY", "T_DESC", "T_DIRECTORIES", 
		"T_DIRECTORY", "T_DISABLE", "T_DISTRIBUTE", "T_ELEM_TYPE", "T_ENABLE", 
		"T_ESCAPED", "T_EXCLUSIVE", "T_EXPLAIN", "T_EXPORT", "T_FIELDS", "T_FILE", 
		"T_FILEFORMAT", "T_FIRST", "T_FORMAT", "T_FORMATTED", "T_FUNCTIONS", "T_HOLD_DDLTIME", 
		"T_HOUR", "T_IDXPROPERTIES", "T_IGNORE", "T_INDEX", "T_INDEXES", "T_INPATH", 
		"T_INPUTDRIVER", "T_INPUTFORMAT", "T_ITEMS", "T_JAR", "T_KEYS", "T_KEY_TYPE", 
		"T_LIMIT", "T_LINES", "T_LOAD", "T_LOCATION", "T_LOCK", "T_LOCKS", "T_LOGICAL", 
		"T_LONG", "T_MAPJOIN", "T_MATERIALIZED", "T_METADATA", "T_MINUS", "T_MINUTE", 
		"T_MONTH", "T_MSCK", "T_NOSCAN", "T_NO_DROP", "T_OFFLINE", "T_OPTION", 
		"T_OUTPUTDRIVER", "T_OUTPUTFORMAT", "T_OVERWRITE", "T_OWNER", "T_PARTITIONED", 
		"T_PARTITIONS", "T_PLUS", "T_PRETTY", "T_PRINCIPALS", "T_PROTECTION", 
		"T_PURGE", "T_READ", "T_READONLY", "T_REBUILD", "T_RECORDREADER", "T_RECORDWRITER", 
		"T_RELOAD", "T_RENAME", "T_REPAIR", "T_REPLACE", "T_REPLICATION", "T_RESTRICT", 
		"T_REWRITE", "T_ROLE", "T_ROLES", "T_SCHEMA", "T_SCHEMAS", "T_SECOND", 
		"T_SEMI", "T_SERDE", "T_SERDEPROPERTIES", "T_SERVER", "T_SETS", "T_SHARED", 
		"T_SHOW", "T_SHOW_DATABASE", "T_SKEWED", "T_SORT", "T_SORTED", "T_SSL", 
		"T_STATISTICS", "T_STORED", "T_STREAMTABLE", "T_STRING", "T_STRUCT", "T_TABLES", 
		"T_TBLPROPERTIES", "T_TEMPORARY", "T_TERMINATED", "T_TINYINT", "T_TOUCH", 
		"T_TRANSACTIONS", "T_UNARCHIVE", "T_UNDO", "T_UNIONTYPE", "T_UNLOCK", 
		"T_UNSET", "T_UNSIGNED", "T_URI", "T_USE", "T_UTC", "T_UTCTIMESTAMP", 
		"T_VALUE_TYPE", "T_VIEW", "T_WHILE", "T_YEAR", "T_ISOLATION", "T_LEVEL", 
		"T_OFFSET", "T_SNAPSHOT", "T_TRANSACTION", "T_WORK", "T_WRITE", "T_ABORT", 
		"T_KEY", "T_LAST", "T_NORELY", "T_NOVALIDATE", "T_NULLS", "T_RELY", "T_VALIDATE", 
		"T_DETAIL", "T_DOW", "T_EXPRESSION", "T_OPERATOR", "T_QUARTER", "T_SUMMARY", 
		"T_VECTORIZATION", "T_WEEK", "T_YEARS", "T_MONTHS", "T_WEEKS", "T_DAYS", 
		"T_HOURS", "T_MINUTES", "T_SECONDS", "T_TIMESTAMPTZ", "T_ZONE", "T_COVAR_POP", 
		"T_BROUND", "T_CURRENT_USER", "T_LPAD", "T_UNHEX", "T_PI", "T_STAR", "T_REGEXP_REPLACE", 
		"T_ASCII", "T_GET_JSON_OBJECT", "T_COS", "T_REGR_SXX", "T_WIDTH_BUCKET", 
		"T_REPEAT", "T_ASIN", "T_NULLIF", "T_CONTEXT_NGRAMS", "T_MASK_HASH", "T_PARENT", 
		"T_STR_TO_MAP", "T_SIN", "T_UNBASE64", "T_COUNT", "T_IN_FILE", "T_CONV", 
		"T_SIGN", "T_REGR_COUNT", "T_SQRT", "T_REGR_INTERCEPT", "T_UNIX_TIMESTAMP", 
		"T_MASK_LAST_N", "T_AES_ENCRYPT", "T_MASK_FIRST_N", "T_REVERSE", "T_NEXT_DAY", 
		"T_HISTOGRAM_NUMERIC", "T_TRUNC", "T_SHIFTRIGHT", "T_ADD_MONTHS", "T_MAX", 
		"T_DATE_SUB", "T_UNARY", "T_LN", "T_OCTET_LENGTH", "T_EXP", "T_FIELD", 
		"T_NTILE", "T_COLLECT_LIST", "T_RTRIM", "T_LTRIM", "T_REFLECT", "T_SHA2", 
		"T_PRINTF", "T_CEIL", "T_CEILING", "T_CONCAT", "T_NVL", "T_MD5", "T_ISNULL", 
		"T_ISNOTNULL", "T_PARSE_URL", "T_CBRT", "T_VARIANCE", "T_VAR_POP", "T_DEGREES", 
		"T_RADIANS", "T_LEAST", "T_BUILDVERSION", "T_SUBSTR", "T_SUBSTRING", "T_SIZE", 
		"T_POSITIVE", "T_FROM_UNIXTIME", "T_CHR", "T_PERCENTILE_APPROX", "T_ASSERT_TRUE", 
		"T_MONTHS_BETWEEN", "T_INITCAP", "T_ACOS", "T_WEEKOFYEAR", "T_LAST_DAY", 
		"T_CHARACTER_LENGTH", "T_SUBSTRING_INDEX", "T_TRANSLATE", "T_LEVENSHTEIN", 
		"T_COVAR_SAMP", "T_DATEDIFF", "T_LOG", "T_NGRAMS", "T_LENGTH", "T_REGR_AVGX", 
		"T_FIND_IN_SET", "T_XOR", "T_NEGATIVE", "T_DATE_ADD", "T_PARSE_URL_TUPLE", 
		"T_CONCAT_WS", "T_ELT", "T_LOGGED_IN_USER", "T_MAP_VALUES", "T_JAVA_METHOD", 
		"T_MAP_KEYS", "T_CORR", "T_SORT_ARRAY", "T_SHIFTRIGHTUNSIGNED", "T_AES_DECRYPT", 
		"T_SHA1", "T_SHA", "T_AVG", "T_CURRENT_DATABASE", "T_ARRAY_CONTAINS", 
		"T_FROM_UTC_TIMESTAMP", "T_DECODE", "T_ABS", "T_EXPLODE", "T_E", "T_SUM", 
		"T_COALESCE", "T_LOWER", "T_LCASE", "T_ENCODE", "T_VAR_SAMP", "T_INLINE", 
		"T_SPACE", "T_HASH", "T_ROUND", "T_SPLIT", "T_BASE64", "T_TO_UTC_TIMESTAMP", 
		"T_REGEXP_EXTRACT", "T_CRC32", "T_HEX", "T_REGR_SYY", "T_UPPER", "T_UCASE", 
		"T_STDDEV_POP", "T_DATE_FORMAT", "T_REGR_R2", "T_ATAN", "T_MIN", "T_POSEXPLODE", 
		"T_BRACKET_OP", "T_PMOD", "T_POW", "T_LAG", "T_LEAD", "T_POWER", "T_SENTENCES", 
		"T_MASK_SHOW_FIRST_N", "T_SOUNDEX", "T_SURROGATE_KEY", "T_SHIFTLEFT", 
		"T_PERCENTILE", "T_TO_DATE", "T_REGR_AVGY", "T_RPAD", "T_FACTORIAL", "T_COLLECT_SET", 
		"T_EQUAL_W", "T_BEGINNING", "T_VERSION", "T_STACK", "T_BIN", "T_TAN", 
		"T_TRIM", "T_REGR_SLOPE", "T_MASK", "T_MASK_SHOW_LAST_N", "T_INSTR", "T_GREATEST", 
		"T_REGR_SXY", "T_FORMAT_NUMBER", "T_LOCATE", "T_STDDEV_SAMP", "T_RAND", 
		"T_LOG2", "T_LOG10", "T_JSON_TUPLE", "T_QUOTE", "T_SYSDATE", "T_XPATH", 
		"T_XPATH_BOOLEAN", "T_XPATH_DOUBLE", "T_XPATH_FLOAT", "T_XPATH_INT", "T_XPATH_LONG", 
		"T_XPATH_NUMBER", "T_XPATH_SHORT", "T_XPATH_STRING", "T_FIELD_IN_SET", 
		"T_GET_JSON_OBJECTS", "T_IN_STR", "T_NAMED_STRUCT", "T_RANK", "T_DENSE_RANK", 
		"T_ROW_NUMBER", "T_CUME_DIST", "T_PERCENT_RANK", "T_UNIQUE", "T_CHECK", 
		"T_DEFAULT", "T_SEQUENCEFILE", "T_TEXTFILE", "T_RCFILE", "T_ORC", "T_PARQUET", 
		"T_AVRO", "T_JSONFILE", "T_HIVECONF", "T_HIVEVAR", "T_BYTE", "T_EXIT", 
		"T_COLON", "T_COMMA", "T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", 
		"T_NOTEQUAL", "T_NOTEQUAL2", "T_GREATER", "T_GREATEREQUAL", "T_LESS", 
		"T_LESSEQUAL", "T_MUL", "T_OPEN_B", "T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", 
		"T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", "IDENTIFIER", "INT_LITERAL", 
		"DECIMAL_LITERAL", "STRING_LITERAL", "L_INT", "L_DEC", "L_M_COMMENT", 
		"L_S_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
	    string database_now = "DEFAULT";

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

	    json create_empty_var(string var_name, string var_type)
	    {
	        json j;
	        j["type"] = "VAR_SET";
	        j["var_type"] = var_type;
	        j["var_name"] = var_name;
	        j["value"] = "";
	        return j;
	    }

	    json get_value(string var_name, string var_type)
	    {
	        
	        if(var_type == "HIVECONF")
	        {
	            if(hiveconf_context_variables.find(var_name) == hiveconf_context_variables.end())
	                return create_empty_var(var_name, var_type);
	            else
	                return hiveconf_context_variables.find(var_name)->second;
	        }
	        else if(var_type == "HIVEVAR")
	        {
	            if(hivevar_context_variables.find(var_name) == hivevar_context_variables.end())
	                return create_empty_var(var_name, var_type);
	            else
	                return hivevar_context_variables.find(var_name)->second;
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
			setState(240);
			((ProgramContext)_localctx).stmt_list = stmt_list();
			setState(241);
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
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				((Stmt_listContext)_localctx).stmt = stmt();
				((Stmt_listContext)_localctx).stmts.add(((Stmt_listContext)_localctx).stmt);
				setState(246);
				match(T_SEMICOLON);
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T_CREATE - 31)) | (1L << (T_DROP - 31)) | (1L << (T_INSERT - 31)))) != 0) || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (T_SELECT - 107)) | (1L << (T_SET - 107)) | (1L << (T_ANALYZE - 107)))) != 0) || _la==T_USE || _la==T_EXIT );
			 
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
			setState(260);
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
			case T_TIMESTAMP:
			case T_VARCHAR:
			case T_STRING:
			case T_TINYINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
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
				setState(257);
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(T_TINYINT);
				 ((Primitive_typeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T_SMALLINT);
				 ((Primitive_typeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(T_INT);
				 ((Primitive_typeContext)_localctx).res =  "INT"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(T_BIGINT);
				 ((Primitive_typeContext)_localctx).res =  "BIGINT"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				match(T_BOOLEAN);
				 ((Primitive_typeContext)_localctx).res =  "BOOLEAN"; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				match(T_FLOAT);
				 ((Primitive_typeContext)_localctx).res =  "FLOAT"; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				match(T_DOUBLE);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PRECISION) {
					{
					setState(275);
					match(T_PRECISION);
					}
				}

				 ((Primitive_typeContext)_localctx).res =  "DOUBLE"; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(279);
				match(T_STRING);
				 ((Primitive_typeContext)_localctx).res =  "STRING"; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(281);
				match(T_BINARY);
				 ((Primitive_typeContext)_localctx).res =  "BINARY"; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(283);
				match(T_TIMESTAMP);
				 ((Primitive_typeContext)_localctx).res =  "TIMESTAMP"; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(285);
				match(T_DECIMAL);
				 ((Primitive_typeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(287);
				match(T_DECIMAL);
				setState(288);
				match(T_OPEN_P);
				setState(289);
				((Primitive_typeContext)_localctx).precision = match(INT_LITERAL);
				setState(290);
				match(T_COMMA);
				setState(291);
				((Primitive_typeContext)_localctx).scale = match(INT_LITERAL);
				setState(292);
				match(T_CLOSE_P);
				 ((Primitive_typeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(294);
				match(T_DATE);
				 ((Primitive_typeContext)_localctx).res =  "DATE"; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(296);
				match(T_VARCHAR);
				 ((Primitive_typeContext)_localctx).res =  "VARCHAR"; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(298);
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
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T_ARRAY);
				setState(303);
				match(T_LESS);
				setState(304);
				((Complex_typeContext)_localctx).primitive_type = primitive_type();
				setState(305);
				match(T_GREATER);
				 ((Complex_typeContext)_localctx).res =  hql_array_type_spec(((Complex_typeContext)_localctx).primitive_type.res); 
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(T_MAP);
				setState(309);
				match(T_LESS);
				setState(310);
				((Complex_typeContext)_localctx).primitive_type = primitive_type();
				setState(311);
				match(T_COMMA);
				setState(312);
				((Complex_typeContext)_localctx).data_type = data_type();
				setState(313);
				match(T_GREATER);
				 ((Complex_typeContext)_localctx).res =  hql_map_type_spec(((Complex_typeContext)_localctx).primitive_type.res, ((Complex_typeContext)_localctx).data_type.res); 
				}
				break;
			case T_STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				 vector<Column_identifierContext*> column_list; vector<Data_typeContext*> data_type_list; 
				setState(317);
				match(T_STRUCT);
				setState(318);
				match(T_LESS);
				setState(319);
				((Complex_typeContext)_localctx).column_identifier = column_identifier();
				((Complex_typeContext)_localctx).column_list.add(((Complex_typeContext)_localctx).column_identifier);
				setState(320);
				match(T_COLON);
				setState(321);
				((Complex_typeContext)_localctx).data_type = data_type();
				((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(322);
					match(T_COMMA);
					setState(323);
					((Complex_typeContext)_localctx).column_identifier = column_identifier();
					((Complex_typeContext)_localctx).column_list.add(((Complex_typeContext)_localctx).column_identifier);
					setState(324);
					match(T_COLON);
					setState(325);
					((Complex_typeContext)_localctx).data_type = data_type();
					((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
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
				setState(336);
				match(T_UNIONTYPE);
				setState(337);
				match(T_LESS);
				setState(338);
				((Complex_typeContext)_localctx).data_type = data_type();
				((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(339);
					match(T_COMMA);
					setState(340);
					((Complex_typeContext)_localctx).data_type = data_type();
					((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(346);
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
			setState(351);
			match(T_OPEN_P);
			setState(352);
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
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CHAR || _la==T_BYTE) {
				{
				setState(353);
				_la = _input.LA(1);
				if ( !(_la==T_CHAR || _la==T_BYTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(356);
				match(T_COMMA);
				setState(357);
				match(L_INT);
				}
			}

			setState(360);
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
		public Analyze_stmtContext analyze_stmt;
		public Full_select_stmtContext full_select_stmt() {
			return getRuleContext(Full_select_stmtContext.class,0);
		}
		public Ddl_stmtContext ddl_stmt() {
			return getRuleContext(Ddl_stmtContext.class,0);
		}
		public Variable_substitutionContext variable_substitution() {
			return getRuleContext(Variable_substitutionContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public TerminalNode T_EXIT() { return getToken(HiveParser.T_EXIT, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				((StmtContext)_localctx).full_select_stmt = full_select_stmt();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).full_select_stmt.res; 
				}
				break;
			case T_CREATE:
			case T_DROP:
			case T_INSERT:
			case T_USE:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				((StmtContext)_localctx).ddl_stmt = ddl_stmt();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).ddl_stmt.res; 
				}
				break;
			case T_SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				((StmtContext)_localctx).variable_substitution = variable_substitution();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).variable_substitution.res; 
				}
				break;
			case T_ANALYZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				((StmtContext)_localctx).analyze_stmt = analyze_stmt();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).analyze_stmt.res; 
				}
				break;
			case T_EXIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				match(T_EXIT);
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

	public static class Analyze_stmtContext extends ParserRuleContext {
		public json res;
		public Tab_identContext tab_ident;
		public Opt_insert_partitionsContext opt_insert_partitions;
		public Opt_for_columnsContext opt_for_columns;
		public Opt_noscanContext opt_noscan;
		public TerminalNode T_ANALYZE() { return getToken(HiveParser.T_ANALYZE, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveParser.T_TABLE, 0); }
		public Tab_identContext tab_ident() {
			return getRuleContext(Tab_identContext.class,0);
		}
		public Opt_insert_partitionsContext opt_insert_partitions() {
			return getRuleContext(Opt_insert_partitionsContext.class,0);
		}
		public TerminalNode T_COMPUTE() { return getToken(HiveParser.T_COMPUTE, 0); }
		public TerminalNode T_STATISTICS() { return getToken(HiveParser.T_STATISTICS, 0); }
		public Opt_for_columnsContext opt_for_columns() {
			return getRuleContext(Opt_for_columnsContext.class,0);
		}
		public Opt_noscanContext opt_noscan() {
			return getRuleContext(Opt_noscanContext.class,0);
		}
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T_ANALYZE);
			setState(378);
			match(T_TABLE);
			setState(379);
			((Analyze_stmtContext)_localctx).tab_ident = tab_ident();
			setState(380);
			((Analyze_stmtContext)_localctx).opt_insert_partitions = opt_insert_partitions();
			setState(381);
			match(T_COMPUTE);
			setState(382);
			match(T_STATISTICS);
			setState(383);
			((Analyze_stmtContext)_localctx).opt_for_columns = opt_for_columns();
			setState(384);
			((Analyze_stmtContext)_localctx).opt_noscan = opt_noscan();
			 ((Analyze_stmtContext)_localctx).res =  hql_analyze_stmt(((Analyze_stmtContext)_localctx).tab_ident.res, ((Analyze_stmtContext)_localctx).opt_insert_partitions.res, ((Analyze_stmtContext)_localctx).opt_for_columns.res, ((Analyze_stmtContext)_localctx).opt_noscan.res); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Opt_for_columnsContext extends ParserRuleContext {
		public bool res;
		public TerminalNode T_FOR() { return getToken(HiveParser.T_FOR, 0); }
		public TerminalNode T_COLUMNS() { return getToken(HiveParser.T_COLUMNS, 0); }
		public Opt_for_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_for_columns; }
	}

	public final Opt_for_columnsContext opt_for_columns() throws RecognitionException {
		Opt_for_columnsContext _localctx = new Opt_for_columnsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_opt_for_columns);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NOSCAN:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_for_columnsContext)_localctx).res =  false; 
				}
				break;
			case T_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(T_FOR);
				setState(389);
				match(T_COLUMNS);
				 ((Opt_for_columnsContext)_localctx).res =  true; 
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

	public static class Opt_noscanContext extends ParserRuleContext {
		public bool res;
		public TerminalNode T_NOSCAN() { return getToken(HiveParser.T_NOSCAN, 0); }
		public Opt_noscanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_noscan; }
	}

	public final Opt_noscanContext opt_noscan() throws RecognitionException {
		Opt_noscanContext _localctx = new Opt_noscanContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_opt_noscan);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_noscanContext)_localctx).res =  false; 
				}
				break;
			case T_NOSCAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(T_NOSCAN);
				 ((Opt_noscanContext)_localctx).res =  true; 
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
		public Name_identifierContext name_identifier;
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Droptable_stmtContext droptable_stmt() {
			return getRuleContext(Droptable_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public TerminalNode T_USE() { return getToken(HiveParser.T_USE, 0); }
		public Name_identifierContext name_identifier() {
			return getRuleContext(Name_identifierContext.class,0);
		}
		public Ddl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_stmt; }
	}

	public final Ddl_stmtContext ddl_stmt() throws RecognitionException {
		Ddl_stmtContext _localctx = new Ddl_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ddl_stmt);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				((Ddl_stmtContext)_localctx).create_table_stmt = create_table_stmt();
				 ((Ddl_stmtContext)_localctx).res =  ((Ddl_stmtContext)_localctx).create_table_stmt.res; 
				}
				break;
			case T_DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				((Ddl_stmtContext)_localctx).droptable_stmt = droptable_stmt();
				 ((Ddl_stmtContext)_localctx).res =  ((Ddl_stmtContext)_localctx).droptable_stmt.res; 
				}
				break;
			case T_INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				((Ddl_stmtContext)_localctx).insert_stmt = insert_stmt();
				 ((Ddl_stmtContext)_localctx).res =  ((Ddl_stmtContext)_localctx).insert_stmt.res; 
				}
				break;
			case T_USE:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				match(T_USE);
				setState(408);
				((Ddl_stmtContext)_localctx).name_identifier = name_identifier();
				 database_now = remove_backquotes(((Ddl_stmtContext)_localctx).name_identifier.res); 
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
		public Token insert_type;
		public Tab_identContext tab_ident;
		public Opt_insert_partitionsContext opt_insert_partitions;
		public Opt_if_not_exists_flagContext opt_if_not_exists_flag;
		public Full_select_stmtContext full_select_stmt;
		public TerminalNode T_INSERT() { return getToken(HiveParser.T_INSERT, 0); }
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
		public TerminalNode T_OVERWRITE() { return getToken(HiveParser.T_OVERWRITE, 0); }
		public TerminalNode T_INTO() { return getToken(HiveParser.T_INTO, 0); }
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T_INSERT);
			setState(414);
			((Insert_stmtContext)_localctx).insert_type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T_INTO || _la==T_OVERWRITE) ) {
				((Insert_stmtContext)_localctx).insert_type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(415);
			match(T_TABLE);
			setState(416);
			((Insert_stmtContext)_localctx).tab_ident = tab_ident();
			setState(417);
			((Insert_stmtContext)_localctx).opt_insert_partitions = opt_insert_partitions();
			setState(418);
			((Insert_stmtContext)_localctx).opt_if_not_exists_flag = opt_if_not_exists_flag();
			setState(419);
			((Insert_stmtContext)_localctx).full_select_stmt = full_select_stmt();
			 ((Insert_stmtContext)_localctx).res =  hql_insert_select_stmt((((Insert_stmtContext)_localctx).insert_type!=null?((Insert_stmtContext)_localctx).insert_type.getText():null), ((Insert_stmtContext)_localctx).tab_ident.res, ((Insert_stmtContext)_localctx).opt_insert_partitions.res, ((Insert_stmtContext)_localctx).opt_if_not_exists_flag.res, ((Insert_stmtContext)_localctx).full_select_stmt.res); 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 24, RULE_opt_insert_partitions);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
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
				setState(424);
				match(T_PARTITION);
				setState(425);
				match(T_OPEN_P);
				setState(426);
				((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
				((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
				setState(427);
				match(T_EQUAL);
				setState(428);
				((Opt_insert_partitionsContext)_localctx).literal_values = literal_values();
				((Opt_insert_partitionsContext)_localctx).col_value_list.add(((Opt_insert_partitionsContext)_localctx).literal_values);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(429);
					match(T_COMMA);
					setState(430);
					((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
					((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
					setState(431);
					match(T_EQUAL);
					setState(432);
					((Opt_insert_partitionsContext)_localctx).literal_values = literal_values();
					((Opt_insert_partitionsContext)_localctx).col_value_list.add(((Opt_insert_partitionsContext)_localctx).literal_values);
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(439);
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
				setState(443);
				match(T_PARTITION);
				setState(444);
				match(T_OPEN_P);
				setState(445);
				((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
				((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(446);
					match(T_COMMA);
					setState(447);
					((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
					((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(453);
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
		public Set_var_valueContext set_var_value;
		public TerminalNode T_SET() { return getToken(HiveParser.T_SET, 0); }
		public Opt_var_set_typeContext opt_var_set_type() {
			return getRuleContext(Opt_var_set_typeContext.class,0);
		}
		public System_var_identifierContext system_var_identifier() {
			return getRuleContext(System_var_identifierContext.class,0);
		}
		public Set_var_valueContext set_var_value() {
			return getRuleContext(Set_var_valueContext.class,0);
		}
		public Variable_substitutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_substitution; }
	}

	public final Variable_substitutionContext variable_substitution() throws RecognitionException {
		Variable_substitutionContext _localctx = new Variable_substitutionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable_substitution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T_SET);
			setState(459);
			((Variable_substitutionContext)_localctx).opt_var_set_type = opt_var_set_type();
			setState(460);
			((Variable_substitutionContext)_localctx).system_var_identifier = system_var_identifier();
			setState(461);
			match(T_EQUAL);
			setState(462);
			((Variable_substitutionContext)_localctx).set_var_value = set_var_value();
			 
			        save_var(((Variable_substitutionContext)_localctx).system_var_identifier.res, ((Variable_substitutionContext)_localctx).opt_var_set_type.res, ((Variable_substitutionContext)_localctx).set_var_value.res);
			        ((Variable_substitutionContext)_localctx).res =  hql_set_variable(((Variable_substitutionContext)_localctx).opt_var_set_type.res, ((Variable_substitutionContext)_localctx).system_var_identifier.res, ((Variable_substitutionContext)_localctx).set_var_value.res); 
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_var_valueContext extends ParserRuleContext {
		public json res;
		public Token IDENTIFIER;
		public Non_reserved_wordsContext non_reserved_words;
		public Reserved_wordsContext reserved_words;
		public ExprContext expr;
		public TerminalNode IDENTIFIER() { return getToken(HiveParser.IDENTIFIER, 0); }
		public Non_reserved_wordsContext non_reserved_words() {
			return getRuleContext(Non_reserved_wordsContext.class,0);
		}
		public Reserved_wordsContext reserved_words() {
			return getRuleContext(Reserved_wordsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Set_var_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_var_value; }
	}

	public final Set_var_valueContext set_var_value() throws RecognitionException {
		Set_var_valueContext _localctx = new Set_var_valueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_set_var_value);
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				((Set_var_valueContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Set_var_valueContext)_localctx).res =  hql_var_name_value(remove_backquotes((((Set_var_valueContext)_localctx).IDENTIFIER!=null?((Set_var_valueContext)_localctx).IDENTIFIER.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				((Set_var_valueContext)_localctx).non_reserved_words = non_reserved_words();
				 ((Set_var_valueContext)_localctx).res =  hql_var_name_value(((Set_var_valueContext)_localctx).non_reserved_words.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				((Set_var_valueContext)_localctx).reserved_words = reserved_words();
				 ((Set_var_valueContext)_localctx).res =  hql_var_name_value(((Set_var_valueContext)_localctx).reserved_words.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				((Set_var_valueContext)_localctx).expr = expr(0);
				 ((Set_var_valueContext)_localctx).res =  ((Set_var_valueContext)_localctx).expr.res; 
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
		enterRule(_localctx, 30, RULE_use_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(T__0);
			setState(479);
			match(T_OPEN_B);
			setState(480);
			((Use_varContext)_localctx).opt_var_use_type = opt_var_use_type();
			setState(481);
			((Use_varContext)_localctx).system_var_identifier = system_var_identifier();
			setState(482);
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
		enterRule(_localctx, 32, RULE_system_var_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<Var_nameContext*> var_name_list; 
			setState(486);
			((System_var_identifierContext)_localctx).var_name = var_name();
			((System_var_identifierContext)_localctx).var_name_list.add(((System_var_identifierContext)_localctx).var_name);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(487);
				match(T__1);
				setState(488);
				((System_var_identifierContext)_localctx).var_name = var_name();
				((System_var_identifierContext)_localctx).var_name_list.add(((System_var_identifierContext)_localctx).var_name);
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        string result = "";
			        for(Var_nameContext* var_namectxt:((System_var_identifierContext)_localctx).var_name_list)
			        {
			            result += "." + var_namectxt->res;
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
		enterRule(_localctx, 34, RULE_opt_var_set_type);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_var_set_typeContext)_localctx).res =  "HIVECONF"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(T_HIVECONF);
				setState(498);
				match(T_COLON);
				 ((Opt_var_set_typeContext)_localctx).res =  "HIVECONF"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				match(T_HIVEVAR);
				setState(501);
				match(T_COLON);
				 ((Opt_var_set_typeContext)_localctx).res =  "HIVEVAR"; 
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
		enterRule(_localctx, 36, RULE_opt_var_use_type);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_var_use_typeContext)_localctx).res =  "HIVEVAR"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(T_HIVECONF);
				setState(507);
				match(T_COLON);
				 ((Opt_var_use_typeContext)_localctx).res =  "HIVECONF"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(T_HIVEVAR);
				setState(510);
				match(T_COLON);
				 ((Opt_var_use_typeContext)_localctx).res =  "HIVEVAR"; 
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

	public static class Var_nameContext extends ParserRuleContext {
		public string res;
		public Name_identifierContext name_identifier;
		public Reserved_wordsContext reserved_words;
		public Name_identifierContext name_identifier() {
			return getRuleContext(Name_identifierContext.class,0);
		}
		public Reserved_wordsContext reserved_words() {
			return getRuleContext(Reserved_wordsContext.class,0);
		}
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var_name);
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				((Var_nameContext)_localctx).name_identifier = name_identifier();
				 ((Var_nameContext)_localctx).res =  ((Var_nameContext)_localctx).name_identifier.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				((Var_nameContext)_localctx).reserved_words = reserved_words();
				 ((Var_nameContext)_localctx).res =  ((Var_nameContext)_localctx).reserved_words.res; 
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
		enterRule(_localctx, 40, RULE_droptable_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T_DROP);
			setState(523);
			match(T_TABLE);
			setState(524);
			((Droptable_stmtContext)_localctx).opt_if_exists = opt_if_exists();
			setState(525);
			((Droptable_stmtContext)_localctx).tab_ident = tab_ident();
			setState(526);
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
		enterRule(_localctx, 42, RULE_opt_drop_table_purge);
		try {
			setState(532);
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
				setState(530);
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
		enterRule(_localctx, 44, RULE_create_table_stmt);
		try {
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(T_CREATE);
				setState(535);
				((Create_table_stmtContext)_localctx).table_type = table_type();
				setState(536);
				match(T_TABLE);
				setState(537);
				((Create_table_stmtContext)_localctx).opt_if_not_exists_flag = opt_if_not_exists_flag();
				setState(538);
				((Create_table_stmtContext)_localctx).tab_ident = tab_ident();
				setState(539);
				((Create_table_stmtContext)_localctx).opt_column_specs = opt_column_specs();
				setState(540);
				((Create_table_stmtContext)_localctx).opt_constraint_specification = opt_constraint_specification();
				setState(541);
				((Create_table_stmtContext)_localctx).opt_comment = opt_comment();
				setState(542);
				((Create_table_stmtContext)_localctx).opt_partitioned_table = opt_partitioned_table();
				setState(543);
				((Create_table_stmtContext)_localctx).opt_clustered_by_table = opt_clustered_by_table();
				setState(544);
				((Create_table_stmtContext)_localctx).opt_skewed_by_table = opt_skewed_by_table();
				setState(545);
				((Create_table_stmtContext)_localctx).opt_row_formated = opt_row_formated();
				setState(546);
				((Create_table_stmtContext)_localctx).opt_stored_as = opt_stored_as();
				setState(547);
				((Create_table_stmtContext)_localctx).opt_location = opt_location();
				setState(548);
				((Create_table_stmtContext)_localctx).opt_table_properties = opt_table_properties();
				setState(549);
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
				setState(552);
				match(T_CREATE);
				setState(553);
				((Create_table_stmtContext)_localctx).table_type = table_type();
				setState(554);
				match(T_TABLE);
				setState(555);
				((Create_table_stmtContext)_localctx).opt_if_not_exists_flag = opt_if_not_exists_flag();
				setState(556);
				((Create_table_stmtContext)_localctx).tab_name = tab_ident();
				setState(557);
				match(T_LIKE);
				setState(558);
				((Create_table_stmtContext)_localctx).tab_like = tab_ident();
				setState(559);
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
		enterRule(_localctx, 46, RULE_opt_column_specs);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_ROW:
			case T_CONSTRAINT:
			case T_PRIMARY:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_LOCATION:
			case T_PARTITIONED:
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
				setState(566);
				match(T_OPEN_P);
				setState(567);
				((Opt_column_specsContext)_localctx).column_definition = column_definition();
				((Opt_column_specsContext)_localctx).column_def_list.add(((Opt_column_specsContext)_localctx).column_definition);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(568);
					match(T_COMMA);
					setState(569);
					((Opt_column_specsContext)_localctx).column_definition = column_definition();
					((Opt_column_specsContext)_localctx).column_def_list.add(((Opt_column_specsContext)_localctx).column_definition);
					}
					}
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(575);
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
		enterRule(_localctx, 48, RULE_opt_constraint_specification);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_ROW:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_LOCATION:
			case T_PARTITIONED:
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
				setState(582);
				((Opt_constraint_specificationContext)_localctx).constraint_specification = constraint_specification();
				((Opt_constraint_specificationContext)_localctx).constraint_list.add(((Opt_constraint_specificationContext)_localctx).constraint_specification);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_CONSTRAINT || _la==T_PRIMARY) {
					{
					{
					setState(583);
					((Opt_constraint_specificationContext)_localctx).constraint_specification = constraint_specification();
					((Opt_constraint_specificationContext)_localctx).constraint_list.add(((Opt_constraint_specificationContext)_localctx).constraint_specification);
					}
					}
					setState(588);
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
		enterRule(_localctx, 50, RULE_opt_comment);
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_ROW:
			case T_CLUSTERED:
			case T_LOCATION:
			case T_PARTITIONED:
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
				setState(594);
				match(T_COMMENT);
				setState(595);
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
		enterRule(_localctx, 52, RULE_table_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
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
		enterRule(_localctx, 54, RULE_opt_partitioned_table);
		int _la;
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T_AS:
			case T_ROW:
			case T_CLUSTERED:
			case T_LOCATION:
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
				setState(603);
				match(T_PARTITIONED);
				setState(604);
				match(T_BY);
				setState(605);
				match(T_OPEN_P);
				setState(606);
				((Opt_partitioned_tableContext)_localctx).partition_spec = partition_spec();
				((Opt_partitioned_tableContext)_localctx).partition_field_list.add(((Opt_partitioned_tableContext)_localctx).partition_spec);
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(607);
					match(T_COMMA);
					setState(608);
					((Opt_partitioned_tableContext)_localctx).partition_spec = partition_spec();
					((Opt_partitioned_tableContext)_localctx).partition_field_list.add(((Opt_partitioned_tableContext)_localctx).partition_spec);
					}
					}
					setState(613);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(614);
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
		enterRule(_localctx, 56, RULE_partition_spec);
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				((Partition_specContext)_localctx).column_identifier = column_identifier();
				setState(620);
				((Partition_specContext)_localctx).data_type = data_type();
				 ((Partition_specContext)_localctx).res =  hql_column_definition(((Partition_specContext)_localctx).column_identifier.res, ((Partition_specContext)_localctx).data_type.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				((Partition_specContext)_localctx).column_identifier = column_identifier();
				setState(624);
				((Partition_specContext)_localctx).data_type = data_type();
				setState(625);
				match(T_COMMENT);
				setState(626);
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
		enterRule(_localctx, 58, RULE_opt_clustered_by_table);
		int _la;
		try {
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_ROW:
			case T_LOCATION:
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
				setState(633);
				match(T_CLUSTERED);
				setState(634);
				match(T_BY);
				setState(635);
				match(T_OPEN_P);
				setState(636);
				((Opt_clustered_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_clustered_by_tableContext)_localctx).column_list.add(((Opt_clustered_by_tableContext)_localctx).column_identifier);
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(637);
					match(T_COMMA);
					setState(638);
					((Opt_clustered_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_clustered_by_tableContext)_localctx).column_list.add(((Opt_clustered_by_tableContext)_localctx).column_identifier);
					}
					}
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(644);
				match(T_CLOSE_P);
				setState(645);
				((Opt_clustered_by_tableContext)_localctx).opt_sorted_by_table = opt_sorted_by_table();
				setState(646);
				match(T_INTO);
				setState(647);
				((Opt_clustered_by_tableContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(648);
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
		enterRule(_localctx, 60, RULE_opt_sorted_by_table);
		int _la;
		try {
			setState(672);
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
				setState(655);
				match(T_STORED);
				setState(656);
				match(T_BY);
				setState(657);
				match(T_OPEN_P);
				setState(658);
				((Opt_sorted_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_sorted_by_tableContext)_localctx).column_list.add(((Opt_sorted_by_tableContext)_localctx).column_identifier);
				setState(659);
				((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc = opt_sorted_by_asc_desc();
				((Opt_sorted_by_tableContext)_localctx).sort_type_list.add(((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc);
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(660);
					match(T_COMMA);
					setState(661);
					((Opt_sorted_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_sorted_by_tableContext)_localctx).column_list.add(((Opt_sorted_by_tableContext)_localctx).column_identifier);
					setState(662);
					((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc = opt_sorted_by_asc_desc();
					((Opt_sorted_by_tableContext)_localctx).sort_type_list.add(((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc);
					}
					}
					setState(668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(669);
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
		enterRule(_localctx, 62, RULE_opt_sorted_by_asc_desc);
		try {
			setState(679);
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
				setState(675);
				match(T_ASC);
				 ((Opt_sorted_by_asc_descContext)_localctx).res =  "ASC"; 
				}
				break;
			case T_DESC:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
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
		enterRule(_localctx, 64, RULE_opt_skewed_by_table);
		int _la;
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_ROW:
			case T_LOCATION:
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
				setState(683);
				match(T_SKEWED);
				setState(684);
				match(T_BY);
				setState(685);
				match(T_OPEN_P);
				setState(686);
				((Opt_skewed_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_skewed_by_tableContext)_localctx).column_list.add(((Opt_skewed_by_tableContext)_localctx).column_identifier);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(687);
					match(T_COMMA);
					setState(688);
					((Opt_skewed_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_skewed_by_tableContext)_localctx).column_list.add(((Opt_skewed_by_tableContext)_localctx).column_identifier);
					}
					}
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(694);
				((Opt_skewed_by_tableContext)_localctx).opt_on_skewed = opt_on_skewed();
				setState(695);
				match(T_CLOSE_P);
				setState(696);
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
		enterRule(_localctx, 66, RULE_opt_on_skewed);
		int _la;
		try {
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
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
				setState(703);
				match(T_ON);
				setState(704);
				match(T_OPEN_P);
				setState(705);
				((Opt_on_skewedContext)_localctx).literal_values = literal_values();
				((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(706);
					match(T_COMMA);
					setState(707);
					((Opt_on_skewedContext)_localctx).literal_values = literal_values();
					((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
					}
					}
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(713);
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
				setState(717);
				match(T_ON);
				setState(718);
				match(T_OPEN_P);
				setState(719);
				match(T_OPEN_P);
				setState(720);
				((Opt_on_skewedContext)_localctx).literal_values = literal_values();
				((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(721);
					match(T_COMMA);
					setState(722);
					((Opt_on_skewedContext)_localctx).literal_values = literal_values();
					((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
					}
					}
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(728);
				match(T_CLOSE_P);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(729);
					match(T_COMMA);
					setState(730);
					match(T_OPEN_P);
					setState(731);
					((Opt_on_skewedContext)_localctx).literal_values = literal_values();
					((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(732);
						match(T_COMMA);
						setState(733);
						((Opt_on_skewedContext)_localctx).literal_values = literal_values();
						((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
						}
						}
						setState(738);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(739);
					match(T_CLOSE_P);
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(746);
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
		enterRule(_localctx, 68, RULE_opt_skewed_stored_as_directory);
		try {
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_skewed_stored_as_directoryContext)_localctx).res =  false; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				match(T_STORED);
				setState(753);
				match(T_AS);
				setState(754);
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
		enterRule(_localctx, 70, RULE_opt_row_formated);
		try {
			setState(764);
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
				setState(759);
				match(T_ROW);
				setState(760);
				match(T_FORMAT);
				setState(761);
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
		enterRule(_localctx, 72, RULE_row_format);
		try {
			setState(779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DELIMITED:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				match(T_DELIMITED);
				setState(767);
				((Row_formatContext)_localctx).opt_field_terminated_by = opt_field_terminated_by();
				setState(768);
				((Row_formatContext)_localctx).opt_collection_items_terminated_by = opt_collection_items_terminated_by();
				setState(769);
				((Row_formatContext)_localctx).opt_map_keys_terminated_by = opt_map_keys_terminated_by();
				setState(770);
				((Row_formatContext)_localctx).opt_lines_terminated_by = opt_lines_terminated_by();
				setState(771);
				((Row_formatContext)_localctx).opt_null_defined_as = opt_null_defined_as();
				 ((Row_formatContext)_localctx).res =  hql_row_format_delimited(((Row_formatContext)_localctx).opt_field_terminated_by.res, ((Row_formatContext)_localctx).opt_collection_items_terminated_by.res, ((Row_formatContext)_localctx).opt_map_keys_terminated_by.res, ((Row_formatContext)_localctx).opt_lines_terminated_by.res, ((Row_formatContext)_localctx).opt_null_defined_as.res); 
				}
				break;
			case T_SERDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				match(T_SERDE);
				setState(775);
				((Row_formatContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				setState(776);
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
		enterRule(_localctx, 74, RULE_opt_field_terminated_by);
		try {
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_field_terminated_byContext)_localctx).res =  json(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				match(T_FIELDS);
				setState(783);
				match(T_TERMINATED);
				setState(784);
				match(T_BY);
				setState(785);
				((Opt_field_terminated_byContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Opt_field_terminated_byContext)_localctx).res =  remove_quotes((((Opt_field_terminated_byContext)_localctx).STRING_LITERAL!=null?((Opt_field_terminated_byContext)_localctx).STRING_LITERAL.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(787);
				match(T_FIELDS);
				setState(788);
				match(T_TERMINATED);
				setState(789);
				match(T_BY);
				setState(790);
				((Opt_field_terminated_byContext)_localctx).delimiter = match(STRING_LITERAL);
				setState(791);
				match(T_ESCAPED);
				setState(792);
				match(T_BY);
				setState(793);
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
		enterRule(_localctx, 76, RULE_opt_collection_items_terminated_by);
		try {
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_MAP:
			case T_NULL:
			case T_LINES:
			case T_LOCATION:
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
				setState(798);
				match(T_COLLECTION);
				setState(799);
				match(T_ITEMS);
				setState(800);
				match(T_TERMINATED);
				setState(801);
				match(T_BY);
				setState(802);
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
		enterRule(_localctx, 78, RULE_opt_map_keys_terminated_by);
		try {
			setState(813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_NULL:
			case T_LINES:
			case T_LOCATION:
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
				setState(807);
				match(T_MAP);
				setState(808);
				match(T_KEYS);
				setState(809);
				match(T_TERMINATED);
				setState(810);
				match(T_BY);
				setState(811);
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
		enterRule(_localctx, 80, RULE_opt_lines_terminated_by);
		try {
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_NULL:
			case T_LOCATION:
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
				setState(816);
				match(T_LINES);
				setState(817);
				match(T_TERMINATED);
				setState(818);
				match(T_BY);
				setState(819);
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
		enterRule(_localctx, 82, RULE_opt_null_defined_as);
		try {
			setState(829);
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
				setState(824);
				match(T_NULL);
				setState(825);
				match(T_DEFINED);
				setState(826);
				match(T_AS);
				setState(827);
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
		enterRule(_localctx, 84, RULE_opt_serde_properties);
		int _la;
		try {
			setState(852);
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
				setState(833);
				match(T_WITH);
				setState(834);
				match(T_SERDEPROPERTIES);
				setState(835);
				match(T_OPEN_P);
				setState(836);
				((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
				((Opt_serde_propertiesContext)_localctx).opt_name_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
				setState(837);
				match(T_EQUAL);
				setState(838);
				((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
				((Opt_serde_propertiesContext)_localctx).opt_val_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(839);
					match(T_COMMA);
					setState(840);
					((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
					((Opt_serde_propertiesContext)_localctx).opt_name_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
					setState(841);
					match(T_EQUAL);
					setState(842);
					((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
					((Opt_serde_propertiesContext)_localctx).opt_val_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
					}
					}
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(849);
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
		enterRule(_localctx, 86, RULE_serde_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
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
		enterRule(_localctx, 88, RULE_opt_stored_as);
		try {
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_stored_asContext)_localctx).res =  json(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				match(T_STORED);
				setState(859);
				match(T_AS);
				setState(860);
				((Opt_stored_asContext)_localctx).file_format = file_format();
				 ((Opt_stored_asContext)_localctx).res =  hql_stored_as_file_format(((Opt_stored_asContext)_localctx).file_format.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(863);
				match(T_STORED);
				setState(864);
				match(T_AS);
				setState(865);
				match(T_INPUTFORMAT);
				setState(866);
				((Opt_stored_asContext)_localctx).input_format = match(STRING_LITERAL);
				setState(867);
				match(T_OUTPUTFORMAT);
				setState(868);
				((Opt_stored_asContext)_localctx).output_format = match(STRING_LITERAL);
				 ((Opt_stored_asContext)_localctx).res =  hql_stored_as_file_format((((Opt_stored_asContext)_localctx).input_format!=null?((Opt_stored_asContext)_localctx).input_format.getText():null), (((Opt_stored_asContext)_localctx).output_format!=null?((Opt_stored_asContext)_localctx).output_format.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(870);
				match(T_STORED);
				setState(871);
				match(T_BY);
				setState(872);
				((Opt_stored_asContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				setState(873);
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
		enterRule(_localctx, 90, RULE_opt_location);
		try {
			setState(882);
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
				setState(879);
				match(T_LOCATION);
				setState(880);
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
		enterRule(_localctx, 92, RULE_opt_table_properties);
		int _la;
		try {
			setState(904);
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
				setState(886);
				match(T_TBLPROPERTIES);
				setState(887);
				match(T_OPEN_P);
				setState(888);
				((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
				((Opt_table_propertiesContext)_localctx).opt_name_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
				setState(889);
				match(T_EQUAL);
				setState(890);
				((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
				((Opt_table_propertiesContext)_localctx).opt_val_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(891);
					match(T_COMMA);
					setState(892);
					((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
					((Opt_table_propertiesContext)_localctx).opt_name_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
					setState(893);
					match(T_EQUAL);
					setState(894);
					((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
					((Opt_table_propertiesContext)_localctx).opt_val_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
					}
					}
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(901);
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
		enterRule(_localctx, 94, RULE_opt_table_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
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
		enterRule(_localctx, 96, RULE_opt_as_select);
		try {
			setState(914);
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
				setState(910);
				match(T_AS);
				setState(911);
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
		enterRule(_localctx, 98, RULE_file_format);
		try {
			setState(930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEQUENCEFILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				match(T_SEQUENCEFILE);
				 ((File_formatContext)_localctx).res =  "SEQUENCEFILE"; 
				}
				break;
			case T_TEXTFILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				match(T_TEXTFILE);
				 ((File_formatContext)_localctx).res =  "TEXTFILE"; 
				}
				break;
			case T_RCFILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(920);
				match(T_RCFILE);
				 ((File_formatContext)_localctx).res =  "RCFILE"; 
				}
				break;
			case T_ORC:
				enterOuterAlt(_localctx, 4);
				{
				setState(922);
				match(T_ORC);
				 ((File_formatContext)_localctx).res =  "ORC"; 
				}
				break;
			case T_PARQUET:
				enterOuterAlt(_localctx, 5);
				{
				setState(924);
				match(T_PARQUET);
				 ((File_formatContext)_localctx).res =  "PARQUET"; 
				}
				break;
			case T_AVRO:
				enterOuterAlt(_localctx, 6);
				{
				setState(926);
				match(T_AVRO);
				 ((File_formatContext)_localctx).res =  "AVRO"; 
				}
				break;
			case T_JSONFILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(928);
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
		enterRule(_localctx, 100, RULE_column_definition);
		int _la;
		try {
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(933);
				((Column_definitionContext)_localctx).data_type = data_type();
				 ((Column_definitionContext)_localctx).res =  hql_column_definition(((Column_definitionContext)_localctx).column_identifier.res, ((Column_definitionContext)_localctx).data_type.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(937);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(938);
				match(T_COMMENT);
				setState(939);
				((Column_definitionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Column_definitionContext)_localctx).res =  hql_column_definition(((Column_definitionContext)_localctx).column_identifier.res, ((Column_definitionContext)_localctx).data_type.res, (((Column_definitionContext)_localctx).STRING_LITERAL!=null?((Column_definitionContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				vector<Column_constraintContext*> constraint_list; 
				setState(943);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(944);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(946); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(945);
					((Column_definitionContext)_localctx).column_constraint = column_constraint();
					((Column_definitionContext)_localctx).constraint_list.add(((Column_definitionContext)_localctx).column_constraint);
					}
					}
					setState(948); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_NOT || _la==T_PRIMARY || _la==T_DISABLE || _la==T_ENABLE || ((((_la - 310)) & ~0x3f) == 0 && ((1L << (_la - 310)) & ((1L << (T_NORELY - 310)) | (1L << (T_NOVALIDATE - 310)) | (1L << (T_RELY - 310)))) != 0) || ((((_la - 530)) & ~0x3f) == 0 && ((1L << (_la - 530)) & ((1L << (T_UNIQUE - 530)) | (1L << (T_CHECK - 530)) | (1L << (T_DEFAULT - 530)))) != 0) );
				setState(950);
				match(T_COMMENT);
				setState(951);
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
				setState(955);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(956);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(958); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(957);
					((Column_definitionContext)_localctx).column_constraint = column_constraint();
					((Column_definitionContext)_localctx).constraint_list.add(((Column_definitionContext)_localctx).column_constraint);
					}
					}
					setState(960); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_NOT || _la==T_PRIMARY || _la==T_DISABLE || _la==T_ENABLE || ((((_la - 310)) & ~0x3f) == 0 && ((1L << (_la - 310)) & ((1L << (T_NORELY - 310)) | (1L << (T_NOVALIDATE - 310)) | (1L << (T_RELY - 310)))) != 0) || ((((_la - 530)) & ~0x3f) == 0 && ((1L << (_la - 530)) & ((1L << (T_UNIQUE - 530)) | (1L << (T_CHECK - 530)) | (1L << (T_DEFAULT - 530)))) != 0) );
				 
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
		enterRule(_localctx, 102, RULE_column_constraint);
		try {
			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				match(T_PRIMARY);
				setState(967);
				match(T_KEY);
				 ((Column_constraintContext)_localctx).res =  json({"primary_key", true}); 
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				match(T_UNIQUE);
				 ((Column_constraintContext)_localctx).res =  json({"unique", true}); 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(971);
				match(T_NOT);
				setState(972);
				match(T_NULL);
				 ((Column_constraintContext)_localctx).res =  json({"not_null", true}); 
				}
				break;
			case T_DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(974);
				match(T_DEFAULT);
				setState(975);
				((Column_constraintContext)_localctx).default_value = default_value();
				 ((Column_constraintContext)_localctx).res =  json({"default_value", ((Column_constraintContext)_localctx).default_value.res}); 
				}
				break;
			case T_CHECK:
				enterOuterAlt(_localctx, 5);
				{
				setState(978);
				match(T_CHECK);
				setState(979);
				((Column_constraintContext)_localctx).expr = expr(0);
				 ((Column_constraintContext)_localctx).res =  json({"check", ((Column_constraintContext)_localctx).expr.res}); 
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(982);
				match(T_ENABLE);
				 ((Column_constraintContext)_localctx).res =  json({"enable", true}); 
				}
				break;
			case T_DISABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(984);
				match(T_DISABLE);
				 ((Column_constraintContext)_localctx).res =  json({"enable", false}); 
				}
				break;
			case T_NOVALIDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(986);
				match(T_NOVALIDATE);
				 ((Column_constraintContext)_localctx).res =  json({"novalidate", true}); 
				}
				break;
			case T_RELY:
				enterOuterAlt(_localctx, 9);
				{
				setState(988);
				match(T_RELY);
				 ((Column_constraintContext)_localctx).res =  json({"rely", true}); 
				}
				break;
			case T_NORELY:
				enterOuterAlt(_localctx, 10);
				{
				setState(990);
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
		enterRule(_localctx, 104, RULE_default_value);
		try {
			setState(1004);
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
				setState(994);
				literal_values();
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(T_CURRENT_USER);
				setState(996);
				match(T_OPEN_P);
				setState(997);
				match(T_CLOSE_P);
				}
				break;
			case T_CURRENT_DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(998);
				match(T_CURRENT_DATE);
				setState(999);
				match(T_OPEN_P);
				setState(1000);
				match(T_CLOSE_P);
				}
				break;
			case T_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(1001);
				match(T_CURRENT_TIMESTAMP);
				setState(1002);
				match(T_OPEN_P);
				setState(1003);
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
		enterRule(_localctx, 106, RULE_constraint_specification);
		int _la;
		try {
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				vector<Column_identifierContext*> column_list; 
				setState(1007);
				match(T_PRIMARY);
				setState(1008);
				match(T_KEY);
				setState(1009);
				match(T_OPEN_P);
				setState(1010);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1011);
					match(T_COMMA);
					setState(1012);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(1017);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1018);
				match(T_CLOSE_P);
				setState(1019);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(1020);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(1021);
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
				setState(1025);
				match(T_CONSTRAINT);
				setState(1026);
				name_identifier();
				setState(1027);
				match(T_FOREIGN);
				setState(1028);
				match(T_KEY);
				setState(1029);
				match(T_OPEN_P);
				setState(1030);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1031);
					match(T_COMMA);
					setState(1032);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(1037);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1038);
				match(T_CLOSE_P);
				setState(1039);
				match(T_REFERENCES);
				setState(1040);
				((Constraint_specificationContext)_localctx).tab_ident = tab_ident();
				setState(1041);
				match(T_OPEN_P);
				setState(1042);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).ref_column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1043);
					match(T_COMMA);
					setState(1044);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).ref_column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(1049);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1050);
				match(T_CLOSE_P);
				setState(1051);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(1052);
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
				setState(1056);
				match(T_CONSTRAINT);
				setState(1057);
				name_identifier();
				setState(1058);
				match(T_UNIQUE);
				setState(1059);
				match(T_OPEN_P);
				setState(1060);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1061);
					match(T_COMMA);
					setState(1062);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(1067);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1068);
				match(T_CLOSE_P);
				setState(1069);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(1070);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(1071);
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
				setState(1074);
				match(T_CONSTRAINT);
				setState(1075);
				name_identifier();
				setState(1076);
				match(T_CHECK);
				setState(1077);
				((Constraint_specificationContext)_localctx).expr = expr(0);
				setState(1078);
				((Constraint_specificationContext)_localctx).opt_constraint_enable_disable = opt_constraint_enable_disable();
				setState(1079);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(1080);
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
		enterRule(_localctx, 108, RULE_opt_constraint_enable_disable);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_ROW:
			case T_CONSTRAINT:
			case T_PRIMARY:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_LOCATION:
			case T_PARTITIONED:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_NORELY:
			case T_NOVALIDATE:
			case T_RELY:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_constraint_enable_disableContext)_localctx).res =  "ENABLE"; 
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
				match(T_ENABLE);
				 ((Opt_constraint_enable_disableContext)_localctx).res =  "ENABLE"; 
				}
				break;
			case T_DISABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1088);
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
		enterRule(_localctx, 110, RULE_opt_constraint_enable);
		try {
			setState(1095);
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
				setState(1093);
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
		enterRule(_localctx, 112, RULE_opt_constraint_disable);
		try {
			setState(1100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_ROW:
			case T_CONSTRAINT:
			case T_PRIMARY:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_LOCATION:
			case T_PARTITIONED:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_NORELY:
			case T_NOVALIDATE:
			case T_RELY:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_constraint_disableContext)_localctx).res =  false; 
				}
				break;
			case T_DISABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
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
		enterRule(_localctx, 114, RULE_opt_constraint_novalidate);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_ROW:
			case T_CONSTRAINT:
			case T_PRIMARY:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_LOCATION:
			case T_PARTITIONED:
			case T_SKEWED:
			case T_STORED:
			case T_TBLPROPERTIES:
			case T_NORELY:
			case T_RELY:
			case T_SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_constraint_novalidateContext)_localctx).res =  false; 
				}
				break;
			case T_NOVALIDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
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
		enterRule(_localctx, 116, RULE_opt_constraint_rely_no_rely);
		try {
			setState(1112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AS:
			case T_ROW:
			case T_CONSTRAINT:
			case T_PRIMARY:
			case T_CLUSTERED:
			case T_COMMENT:
			case T_LOCATION:
			case T_PARTITIONED:
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
				setState(1108);
				match(T_RELY);
				 ((Opt_constraint_rely_no_relyContext)_localctx).res =  "RELY"; 
				}
				break;
			case T_NORELY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110);
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
		enterRule(_localctx, 118, RULE_opt_if_not_exists_flag);
		try {
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_if_not_exists_flagContext)_localctx).res =  false; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				match(T_IF);
				setState(1116);
				match(T_NOT);
				setState(1117);
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
		enterRule(_localctx, 120, RULE_opt_if_exists);
		try {
			setState(1125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_if_existsContext)_localctx).res =  false; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				match(T_IF);
				setState(1123);
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
		enterRule(_localctx, 122, RULE_table_type);
		try {
			setState(1132);
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
				setState(1128);
				match(T_EXTERNAL);
				 ((Table_typeContext)_localctx).res =  "EXTERNAL"; 
				}
				break;
			case T_TEMPORARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1130);
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
		enterRule(_localctx, 124, RULE_full_select_stmt);
		try {
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				((Full_select_stmtContext)_localctx).select_stmt = select_stmt();
				 ((Full_select_stmtContext)_localctx).res =  ((Full_select_stmtContext)_localctx).select_stmt.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
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
		enterRule(_localctx, 126, RULE_select_union_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			vector<Select_union_typeContext*> union_type_list; vector<Select_stmtContext*> select_stmt_list; 
			setState(1143);
			((Select_union_stmtContext)_localctx).base_select = select_stmt();
			setState(1148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1144);
				match(T_UNION);
				setState(1145);
				((Select_union_stmtContext)_localctx).select_union_type = select_union_type();
				((Select_union_stmtContext)_localctx).union_type_list.add(((Select_union_stmtContext)_localctx).select_union_type);
				setState(1146);
				((Select_union_stmtContext)_localctx).select_stmt = select_stmt();
				((Select_union_stmtContext)_localctx).select_stmt_list.add(((Select_union_stmtContext)_localctx).select_stmt);
				}
				}
				setState(1150); 
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
		enterRule(_localctx, 128, RULE_select_union_type);
		try {
			setState(1159);
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
				setState(1155);
				match(T_ALL);
				 ((Select_union_typeContext)_localctx).res =  "ALL"; 
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1157);
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
		enterRule(_localctx, 130, RULE_select_stmt);
		try {
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				match(T_SELECT);
				setState(1162);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1163);
				((Select_stmtContext)_localctx).select_expr_list = select_expr_list();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).select_expr_list.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166);
				match(T_SELECT);
				setState(1167);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1168);
				((Select_stmtContext)_localctx).tab_generate_func = tab_generate_func();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).tab_generate_func.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1171);
				match(T_SELECT);
				setState(1172);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1173);
				((Select_stmtContext)_localctx).select_expr_list = select_expr_list();
				setState(1174);
				match(T_FROM);
				setState(1175);
				((Select_stmtContext)_localctx).table_reference = table_reference();
				setState(1176);
				((Select_stmtContext)_localctx).opt_lateral_view_expr = opt_lateral_view_expr();
				setState(1177);
				((Select_stmtContext)_localctx).opt_where_expr = opt_where_expr();
				setState(1178);
				((Select_stmtContext)_localctx).opt_group_by_list = opt_group_by_list();
				setState(1179);
				((Select_stmtContext)_localctx).opt_having_expr = opt_having_expr();
				setState(1180);
				((Select_stmtContext)_localctx).opt_order_by_list = opt_order_by_list();
				setState(1181);
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
		enterRule(_localctx, 132, RULE_opt_lateral_view_expr);
		int _la;
		try {
			setState(1203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_GROUP:
			case T_HAVING:
			case T_ORDER:
			case T_UNION:
			case T_WHERE:
			case T_LIMIT:
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
				setState(1188);
				match(T_LATERAL);
				setState(1189);
				match(T_VIEW);
				setState(1190);
				((Opt_lateral_view_exprContext)_localctx).tab_generate_func = tab_generate_func();
				setState(1191);
				((Opt_lateral_view_exprContext)_localctx).tab_alias = column_identifier();
				setState(1192);
				match(T_AS);
				setState(1193);
				((Opt_lateral_view_exprContext)_localctx).column_identifier = column_identifier();
				((Opt_lateral_view_exprContext)_localctx).column_alias_list.add(((Opt_lateral_view_exprContext)_localctx).column_identifier);
				setState(1198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1194);
					match(T_COMMA);
					setState(1195);
					((Opt_lateral_view_exprContext)_localctx).column_identifier = column_identifier();
					((Opt_lateral_view_exprContext)_localctx).column_alias_list.add(((Opt_lateral_view_exprContext)_localctx).column_identifier);
					}
					}
					setState(1200);
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
		enterRule(_localctx, 134, RULE_column_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
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
		enterRule(_localctx, 136, RULE_opt_where_expr);
		try {
			setState(1213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_GROUP:
			case T_HAVING:
			case T_ORDER:
			case T_UNION:
			case T_LIMIT:
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
				setState(1209);
				match(T_WHERE);
				setState(1210);
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
		enterRule(_localctx, 138, RULE_opt_group_by_list);
		int _la;
		try {
			setState(1229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_HAVING:
			case T_ORDER:
			case T_UNION:
			case T_LIMIT:
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
				setState(1217);
				match(T_GROUP);
				setState(1218);
				match(T_BY);
				setState(1219);
				((Opt_group_by_listContext)_localctx).expr = expr(0);
				((Opt_group_by_listContext)_localctx).expr_group_by_list.add(((Opt_group_by_listContext)_localctx).expr);
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1220);
					match(T_COMMA);
					setState(1221);
					((Opt_group_by_listContext)_localctx).expr = expr(0);
					((Opt_group_by_listContext)_localctx).expr_group_by_list.add(((Opt_group_by_listContext)_localctx).expr);
					}
					}
					setState(1226);
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
		enterRule(_localctx, 140, RULE_opt_having_expr);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ORDER:
			case T_UNION:
			case T_LIMIT:
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
				setState(1232);
				match(T_HAVING);
				setState(1233);
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
		public vector<json> res;
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
		enterRule(_localctx, 142, RULE_opt_order_by_list);
		int _la;
		try {
			setState(1255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
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
				setState(1240);
				match(T_ORDER);
				setState(1241);
				match(T_BY);
				setState(1242);
				((Opt_order_by_listContext)_localctx).ident = ident();
				((Opt_order_by_listContext)_localctx).order_by_ident_list.add(((Opt_order_by_listContext)_localctx).ident);
				setState(1243);
				((Opt_order_by_listContext)_localctx).opt_order_by_mode = opt_order_by_mode();
				((Opt_order_by_listContext)_localctx).order_mode_list.add(((Opt_order_by_listContext)_localctx).opt_order_by_mode);
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1244);
					match(T_COMMA);
					setState(1245);
					((Opt_order_by_listContext)_localctx).ident = ident();
					((Opt_order_by_listContext)_localctx).order_by_ident_list.add(((Opt_order_by_listContext)_localctx).ident);
					setState(1246);
					((Opt_order_by_listContext)_localctx).opt_order_by_mode = opt_order_by_mode();
					((Opt_order_by_listContext)_localctx).order_mode_list.add(((Opt_order_by_listContext)_localctx).opt_order_by_mode);
					}
					}
					setState(1252);
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
		enterRule(_localctx, 144, RULE_opt_order_by_mode);
		try {
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
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
				setState(1258);
				match(T_ASC);
				 ((Opt_order_by_modeContext)_localctx).res =  "ASC"; 
				}
				break;
			case T_DESC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1260);
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
		enterRule(_localctx, 146, RULE_opt_limit);
		try {
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_limitContext)_localctx).res =  json(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				match(T_LIMIT);
				setState(1266);
				((Opt_limitContext)_localctx).rows = match(INT_LITERAL);
				 ((Opt_limitContext)_localctx).res =  hql_select_limit_clause((((Opt_limitContext)_localctx).rows!=null?((Opt_limitContext)_localctx).rows.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1268);
				match(T_LIMIT);
				setState(1269);
				((Opt_limitContext)_localctx).offset = match(INT_LITERAL);
				setState(1270);
				match(T_COMMA);
				setState(1271);
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
		enterRule(_localctx, 148, RULE_table_reference);
		int _la;
		try {
			setState(1297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				 ((Table_referenceContext)_localctx).res =  ((Table_referenceContext)_localctx).table_factor.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				vector<Table_factorContext*> table_factor_list; 
				setState(1279);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				((Table_referenceContext)_localctx).table_factor_list.add(((Table_referenceContext)_localctx).table_factor);
				setState(1282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1280);
					match(T_COMMA);
					setState(1281);
					((Table_referenceContext)_localctx).table_factor = table_factor();
					((Table_referenceContext)_localctx).table_factor_list.add(((Table_referenceContext)_localctx).table_factor);
					}
					}
					setState(1284); 
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
				setState(1289);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				setState(1291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1290);
					((Table_referenceContext)_localctx).join_table = join_table();
					((Table_referenceContext)_localctx).join_table_list.add(((Table_referenceContext)_localctx).join_table);
					}
					}
					setState(1293); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_CROSS || _la==T_FULL || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T_INNER - 67)) | (1L << (T_JOIN - 67)) | (1L << (T_LEFT - 67)) | (1L << (T_RIGHT - 67)))) != 0) );

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
		enterRule(_localctx, 150, RULE_join_table);
		int _la;
		try {
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1299);
					match(T_INNER);
					}
				}

				setState(1302);
				match(T_JOIN);
				setState(1303);
				((Join_tableContext)_localctx).table_factor = table_factor();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("INNER", ((Join_tableContext)_localctx).table_factor.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1306);
					match(T_INNER);
					}
				}

				setState(1309);
				match(T_JOIN);
				setState(1310);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1311);
				((Join_tableContext)_localctx).join_condition = join_condition();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("INNER", ((Join_tableContext)_localctx).table_factor.res, ((Join_tableContext)_localctx).join_condition.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1314);
				((Join_tableContext)_localctx).j_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (T_FULL - 58)) | (1L << (T_LEFT - 58)) | (1L << (T_RIGHT - 58)))) != 0)) ) {
					((Join_tableContext)_localctx).j_type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1315);
					match(T_OUTER);
					}
				}

				setState(1318);
				match(T_JOIN);
				setState(1319);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1320);
				((Join_tableContext)_localctx).join_condition = join_condition();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table((((Join_tableContext)_localctx).j_type!=null?((Join_tableContext)_localctx).j_type.getText():null), ((Join_tableContext)_localctx).table_factor.res, ((Join_tableContext)_localctx).join_condition.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1323);
				match(T_CROSS);
				setState(1324);
				match(T_JOIN);
				setState(1325);
				((Join_tableContext)_localctx).table_factor = table_factor();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("CROSS", ((Join_tableContext)_localctx).table_factor.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1328);
				match(T_CROSS);
				setState(1329);
				match(T_JOIN);
				setState(1330);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1331);
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
		enterRule(_localctx, 152, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(T_ON);
			setState(1337);
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
		enterRule(_localctx, 154, RULE_table_factor);
		int _la;
		try {
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				((Table_factorContext)_localctx).tab_ident = tab_ident();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).tab_ident.res, "DEFAULT"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343);
				((Table_factorContext)_localctx).tab_ident = tab_ident();
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1344);
					match(T_AS);
					}
				}

				setState(1347);
				((Table_factorContext)_localctx).name_identifier = name_identifier();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).tab_ident.res, ((Table_factorContext)_localctx).name_identifier.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1350);
				match(T_OPEN_P);
				setState(1351);
				((Table_factorContext)_localctx).select_union_stmt = select_union_stmt();
				setState(1352);
				match(T_CLOSE_P);
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1353);
					match(T_AS);
					}
				}

				setState(1356);
				((Table_factorContext)_localctx).name_identifier = name_identifier();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).select_union_stmt.res, ((Table_factorContext)_localctx).name_identifier.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1359);
				match(T_OPEN_P);
				setState(1360);
				((Table_factorContext)_localctx).select_stmt = select_stmt();
				setState(1361);
				match(T_CLOSE_P);
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1362);
					match(T_AS);
					}
				}

				setState(1365);
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
		enterRule(_localctx, 156, RULE_select_all_distinct);
		try {
			setState(1375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__10:
			case NULL_CONST:
			case BOOL_LITERAL:
			case T_AND:
			case T_ARRAY:
			case T_BINARY:
			case T_CASE:
			case T_CAST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_DATE:
			case T_END:
			case T_IF:
			case T_MAP:
			case T_NOT:
			case T_OR:
			case T_TIMESTAMP:
			case T_EXTRACT:
			case T_FLOOR:
			case T_ADD_W:
			case T_ADMIN:
			case T_AFTER:
			case T_ANALYZE:
			case T_ARCHIVE:
			case T_ASC:
			case T_AUTOCOMMIT:
			case T_BEFORE:
			case T_BUCKET:
			case T_BUCKETS:
			case T_CASCADE:
			case T_CHANGE:
			case T_CLUSTER:
			case T_CLUSTERED:
			case T_CLUSTERSTATUS:
			case T_COLLECTION:
			case T_COLUMNS:
			case T_COMMENT:
			case T_COMPACT:
			case T_COMPACTIONS:
			case T_COMPUTE:
			case T_CONCATENATE:
			case T_CONTINUE:
			case T_DATA:
			case T_DATABASES:
			case T_DATETIME:
			case T_DAY:
			case T_DBPROPERTIES:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DELIMITED:
			case T_DEPENDENCY:
			case T_DESC:
			case T_DIRECTORIES:
			case T_DIRECTORY:
			case T_DISABLE:
			case T_DISTRIBUTE:
			case T_ELEM_TYPE:
			case T_ENABLE:
			case T_ESCAPED:
			case T_EXCLUSIVE:
			case T_EXPLAIN:
			case T_EXPORT:
			case T_FIELDS:
			case T_FILE:
			case T_FILEFORMAT:
			case T_FIRST:
			case T_FORMAT:
			case T_FORMATTED:
			case T_FUNCTIONS:
			case T_HOLD_DDLTIME:
			case T_HOUR:
			case T_IDXPROPERTIES:
			case T_IGNORE:
			case T_INDEX:
			case T_INDEXES:
			case T_INPATH:
			case T_INPUTDRIVER:
			case T_INPUTFORMAT:
			case T_ITEMS:
			case T_JAR:
			case T_KEYS:
			case T_KEY_TYPE:
			case T_LIMIT:
			case T_LINES:
			case T_LOAD:
			case T_LOCATION:
			case T_LOCK:
			case T_LOCKS:
			case T_LOGICAL:
			case T_LONG:
			case T_MAPJOIN:
			case T_MATERIALIZED:
			case T_METADATA:
			case T_MINUS:
			case T_MINUTE:
			case T_MONTH:
			case T_MSCK:
			case T_NOSCAN:
			case T_NO_DROP:
			case T_OFFLINE:
			case T_OPTION:
			case T_OUTPUTDRIVER:
			case T_OUTPUTFORMAT:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PARTITIONED:
			case T_PARTITIONS:
			case T_PLUS:
			case T_PRETTY:
			case T_PRINCIPALS:
			case T_PROTECTION:
			case T_PURGE:
			case T_READ:
			case T_READONLY:
			case T_REBUILD:
			case T_RECORDREADER:
			case T_RECORDWRITER:
			case T_RELOAD:
			case T_RENAME:
			case T_REPAIR:
			case T_REPLACE:
			case T_REPLICATION:
			case T_RESTRICT:
			case T_REWRITE:
			case T_ROLE:
			case T_ROLES:
			case T_SCHEMA:
			case T_SCHEMAS:
			case T_SECOND:
			case T_SEMI:
			case T_SERDE:
			case T_SERDEPROPERTIES:
			case T_SERVER:
			case T_SETS:
			case T_SHARED:
			case T_SHOW:
			case T_SHOW_DATABASE:
			case T_SKEWED:
			case T_SORT:
			case T_SORTED:
			case T_SSL:
			case T_STATISTICS:
			case T_STORED:
			case T_STREAMTABLE:
			case T_STRING:
			case T_STRUCT:
			case T_TABLES:
			case T_TBLPROPERTIES:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TINYINT:
			case T_TOUCH:
			case T_TRANSACTIONS:
			case T_UNARCHIVE:
			case T_UNDO:
			case T_UNIONTYPE:
			case T_UNLOCK:
			case T_UNSET:
			case T_UNSIGNED:
			case T_URI:
			case T_USE:
			case T_UTC:
			case T_UTCTIMESTAMP:
			case T_VALUE_TYPE:
			case T_VIEW:
			case T_WHILE:
			case T_YEAR:
			case T_ISOLATION:
			case T_LEVEL:
			case T_OFFSET:
			case T_SNAPSHOT:
			case T_TRANSACTION:
			case T_WORK:
			case T_WRITE:
			case T_ABORT:
			case T_KEY:
			case T_LAST:
			case T_NORELY:
			case T_NOVALIDATE:
			case T_NULLS:
			case T_RELY:
			case T_VALIDATE:
			case T_DETAIL:
			case T_DOW:
			case T_EXPRESSION:
			case T_OPERATOR:
			case T_QUARTER:
			case T_SUMMARY:
			case T_VECTORIZATION:
			case T_WEEK:
			case T_YEARS:
			case T_MONTHS:
			case T_WEEKS:
			case T_DAYS:
			case T_HOURS:
			case T_MINUTES:
			case T_SECONDS:
			case T_TIMESTAMPTZ:
			case T_ZONE:
			case T_COVAR_POP:
			case T_BROUND:
			case T_CURRENT_USER:
			case T_LPAD:
			case T_UNHEX:
			case T_PI:
			case T_STAR:
			case T_REGEXP_REPLACE:
			case T_ASCII:
			case T_GET_JSON_OBJECT:
			case T_COS:
			case T_REGR_SXX:
			case T_WIDTH_BUCKET:
			case T_REPEAT:
			case T_ASIN:
			case T_NULLIF:
			case T_CONTEXT_NGRAMS:
			case T_MASK_HASH:
			case T_PARENT:
			case T_STR_TO_MAP:
			case T_SIN:
			case T_UNBASE64:
			case T_COUNT:
			case T_IN_FILE:
			case T_CONV:
			case T_SIGN:
			case T_REGR_COUNT:
			case T_SQRT:
			case T_REGR_INTERCEPT:
			case T_UNIX_TIMESTAMP:
			case T_MASK_LAST_N:
			case T_AES_ENCRYPT:
			case T_MASK_FIRST_N:
			case T_REVERSE:
			case T_NEXT_DAY:
			case T_HISTOGRAM_NUMERIC:
			case T_TRUNC:
			case T_SHIFTRIGHT:
			case T_ADD_MONTHS:
			case T_MAX:
			case T_DATE_SUB:
			case T_UNARY:
			case T_LN:
			case T_OCTET_LENGTH:
			case T_EXP:
			case T_FIELD:
			case T_NTILE:
			case T_COLLECT_LIST:
			case T_RTRIM:
			case T_LTRIM:
			case T_REFLECT:
			case T_SHA2:
			case T_PRINTF:
			case T_CEIL:
			case T_CEILING:
			case T_CONCAT:
			case T_NVL:
			case T_MD5:
			case T_ISNULL:
			case T_ISNOTNULL:
			case T_PARSE_URL:
			case T_CBRT:
			case T_VARIANCE:
			case T_VAR_POP:
			case T_DEGREES:
			case T_RADIANS:
			case T_LEAST:
			case T_BUILDVERSION:
			case T_SUBSTR:
			case T_SUBSTRING:
			case T_SIZE:
			case T_POSITIVE:
			case T_FROM_UNIXTIME:
			case T_CHR:
			case T_PERCENTILE_APPROX:
			case T_ASSERT_TRUE:
			case T_MONTHS_BETWEEN:
			case T_INITCAP:
			case T_ACOS:
			case T_WEEKOFYEAR:
			case T_LAST_DAY:
			case T_CHARACTER_LENGTH:
			case T_SUBSTRING_INDEX:
			case T_TRANSLATE:
			case T_LEVENSHTEIN:
			case T_COVAR_SAMP:
			case T_DATEDIFF:
			case T_LOG:
			case T_NGRAMS:
			case T_LENGTH:
			case T_REGR_AVGX:
			case T_FIND_IN_SET:
			case T_XOR:
			case T_NEGATIVE:
			case T_DATE_ADD:
			case T_PARSE_URL_TUPLE:
			case T_CONCAT_WS:
			case T_ELT:
			case T_LOGGED_IN_USER:
			case T_MAP_VALUES:
			case T_JAVA_METHOD:
			case T_MAP_KEYS:
			case T_CORR:
			case T_SORT_ARRAY:
			case T_SHIFTRIGHTUNSIGNED:
			case T_AES_DECRYPT:
			case T_SHA1:
			case T_SHA:
			case T_AVG:
			case T_CURRENT_DATABASE:
			case T_ARRAY_CONTAINS:
			case T_FROM_UTC_TIMESTAMP:
			case T_DECODE:
			case T_ABS:
			case T_EXPLODE:
			case T_E:
			case T_SUM:
			case T_COALESCE:
			case T_LOWER:
			case T_LCASE:
			case T_ENCODE:
			case T_VAR_SAMP:
			case T_INLINE:
			case T_SPACE:
			case T_HASH:
			case T_ROUND:
			case T_SPLIT:
			case T_BASE64:
			case T_TO_UTC_TIMESTAMP:
			case T_REGEXP_EXTRACT:
			case T_CRC32:
			case T_HEX:
			case T_REGR_SYY:
			case T_UPPER:
			case T_UCASE:
			case T_STDDEV_POP:
			case T_DATE_FORMAT:
			case T_REGR_R2:
			case T_ATAN:
			case T_MIN:
			case T_POSEXPLODE:
			case T_BRACKET_OP:
			case T_PMOD:
			case T_POW:
			case T_LAG:
			case T_LEAD:
			case T_POWER:
			case T_SENTENCES:
			case T_MASK_SHOW_FIRST_N:
			case T_SOUNDEX:
			case T_SURROGATE_KEY:
			case T_SHIFTLEFT:
			case T_PERCENTILE:
			case T_TO_DATE:
			case T_REGR_AVGY:
			case T_RPAD:
			case T_FACTORIAL:
			case T_COLLECT_SET:
			case T_BEGINNING:
			case T_VERSION:
			case T_STACK:
			case T_BIN:
			case T_TAN:
			case T_TRIM:
			case T_REGR_SLOPE:
			case T_MASK:
			case T_MASK_SHOW_LAST_N:
			case T_INSTR:
			case T_GREATEST:
			case T_REGR_SXY:
			case T_FORMAT_NUMBER:
			case T_LOCATE:
			case T_STDDEV_SAMP:
			case T_RAND:
			case T_LOG2:
			case T_LOG10:
			case T_JSON_TUPLE:
			case T_QUOTE:
			case T_SYSDATE:
			case T_XPATH:
			case T_XPATH_BOOLEAN:
			case T_XPATH_DOUBLE:
			case T_XPATH_FLOAT:
			case T_XPATH_INT:
			case T_XPATH_LONG:
			case T_XPATH_NUMBER:
			case T_XPATH_SHORT:
			case T_XPATH_STRING:
			case T_FIELD_IN_SET:
			case T_GET_JSON_OBJECTS:
			case T_IN_STR:
			case T_NAMED_STRUCT:
			case T_RANK:
			case T_DENSE_RANK:
			case T_ROW_NUMBER:
			case T_CUME_DIST:
			case T_PERCENT_RANK:
			case T_UNIQUE:
			case T_CHECK:
			case T_DEFAULT:
			case T_SEQUENCEFILE:
			case T_TEXTFILE:
			case T_RCFILE:
			case T_ORC:
			case T_PARQUET:
			case T_AVRO:
			case T_JSONFILE:
			case T_HIVECONF:
			case T_HIVEVAR:
			case T_BYTE:
			case T_EXIT:
			case T_EQUAL:
			case T_MUL:
			case T_OPEN_P:
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
				setState(1371);
				match(T_ALL);
				 ((Select_all_distinctContext)_localctx).res =  "ALL"; 
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1373);
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
		enterRule(_localctx, 158, RULE_select_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<Select_exprContext*> exprs; 
			setState(1378);
			((Select_expr_listContext)_localctx).select_expr = select_expr();
			((Select_expr_listContext)_localctx).exprs.add(((Select_expr_listContext)_localctx).select_expr);
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1379);
				match(T_COMMA);
				setState(1380);
				((Select_expr_listContext)_localctx).select_expr = select_expr();
				((Select_expr_listContext)_localctx).exprs.add(((Select_expr_listContext)_localctx).select_expr);
				}
				}
				setState(1385);
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
		enterRule(_localctx, 160, RULE_select_expr);
		int _la;
		try {
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1388);
				((Select_exprContext)_localctx).expr = expr(0);
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1389);
					match(T_AS);
					}
				}

				setState(1392);
				((Select_exprContext)_localctx).name_identifier = name_identifier();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res, ((Select_exprContext)_localctx).name_identifier.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1395);
				((Select_exprContext)_localctx).expr = expr(0);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1398);
				((Select_exprContext)_localctx).expr = expr(0);
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1399);
					match(T_AS);
					}
				}

				setState(1402);
				((Select_exprContext)_localctx).name_identifier = name_identifier();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res, ((Select_exprContext)_localctx).name_identifier.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1405);
				((Select_exprContext)_localctx).expr = expr(0);
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1408);
				match(T_MUL);
				 ((Select_exprContext)_localctx).res =  hql_select_all_expr(); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1410);
				((Select_exprContext)_localctx).name_identifier = name_identifier();
				setState(1411);
				match(T__1);
				setState(1412);
				match(T_MUL);
				 ((Select_exprContext)_localctx).res =  hql_select_all_expr(((Select_exprContext)_localctx).name_identifier.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1415);
				((Select_exprContext)_localctx).over_clause = over_clause();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).over_clause.res, "DEFAULT"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1418);
				((Select_exprContext)_localctx).over_clause = over_clause();
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1419);
					match(T_AS);
					}
				}

				setState(1422);
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
		public Opt_partitions_by_listContext opt_partitions_by_list;
		public Opt_order_by_listContext opt_order_by_list;
		public Over_funcContext over_func() {
			return getRuleContext(Over_funcContext.class,0);
		}
		public TerminalNode T_OVER() { return getToken(HiveParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Opt_partitions_by_listContext opt_partitions_by_list() {
			return getRuleContext(Opt_partitions_by_listContext.class,0);
		}
		public Opt_order_by_listContext opt_order_by_list() {
			return getRuleContext(Opt_order_by_listContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_over_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			((Over_clauseContext)_localctx).over_func = over_func();
			setState(1428);
			match(T_OVER);
			setState(1429);
			match(T_OPEN_P);
			setState(1430);
			((Over_clauseContext)_localctx).opt_partitions_by_list = opt_partitions_by_list();
			setState(1431);
			((Over_clauseContext)_localctx).opt_order_by_list = opt_order_by_list();
			setState(1432);
			match(T_CLOSE_P);
			 ((Over_clauseContext)_localctx).res =  hql_over_clause_partition_order(((Over_clauseContext)_localctx).over_func.res, ((Over_clauseContext)_localctx).opt_partitions_by_list.res, ((Over_clauseContext)_localctx).opt_order_by_list.res);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Opt_partitions_by_listContext extends ParserRuleContext {
		public vector<json> res;
		public IdentContext ident;
		public List<IdentContext> ident_cntxt_list = new ArrayList<IdentContext>();
		public TerminalNode T_PARTITION() { return getToken(HiveParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Opt_partitions_by_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_partitions_by_list; }
	}

	public final Opt_partitions_by_listContext opt_partitions_by_list() throws RecognitionException {
		Opt_partitions_by_listContext _localctx = new Opt_partitions_by_listContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_opt_partitions_by_list);
		int _la;
		try {
			setState(1449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ORDER:
			case T_CLOSE_P:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_partitions_by_listContext)_localctx).res =  vector<json>(); 
				}
				break;
			case T_PARTITION:
				enterOuterAlt(_localctx, 2);
				{
				 vector<IdentContext*> ident_cntxt_list; 
				setState(1437);
				match(T_PARTITION);
				setState(1438);
				match(T_BY);
				setState(1439);
				((Opt_partitions_by_listContext)_localctx).ident = ident();
				((Opt_partitions_by_listContext)_localctx).ident_cntxt_list.add(((Opt_partitions_by_listContext)_localctx).ident);
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1440);
					match(T_COMMA);
					setState(1441);
					((Opt_partitions_by_listContext)_localctx).ident = ident();
					((Opt_partitions_by_listContext)_localctx).ident_cntxt_list.add(((Opt_partitions_by_listContext)_localctx).ident);
					}
					}
					setState(1446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        vector<json> ident_json_list;
				        for(IdentContext* ident_context:((Opt_partitions_by_listContext)_localctx).ident_cntxt_list)
				        {
				            ident_json_list.push_back(ident_context->res);
				        }
				        ((Opt_partitions_by_listContext)_localctx).res =  ident_json_list;
				    
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

	public static class Over_funcContext extends ParserRuleContext {
		public json res;
		public Basic_aggr_funcContext basic_aggr_func;
		public Analytic_funcContext analytic_func;
		public Token f_name;
		public Expr_listContext expr_list;
		public Basic_aggr_funcContext basic_aggr_func() {
			return getRuleContext(Basic_aggr_funcContext.class,0);
		}
		public Analytic_funcContext analytic_func() {
			return getRuleContext(Analytic_funcContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode T_LAG() { return getToken(HiveParser.T_LAG, 0); }
		public TerminalNode T_LEAD() { return getToken(HiveParser.T_LEAD, 0); }
		public Over_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_func; }
	}

	public final Over_funcContext over_func() throws RecognitionException {
		Over_funcContext _localctx = new Over_funcContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_over_func);
		int _la;
		try {
			setState(1461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COUNT:
			case T_MAX:
			case T_AVG:
			case T_SUM:
			case T_MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1451);
				((Over_funcContext)_localctx).basic_aggr_func = basic_aggr_func();
				 ((Over_funcContext)_localctx).res =  ((Over_funcContext)_localctx).basic_aggr_func.res; 
				}
				break;
			case T_RANK:
			case T_DENSE_RANK:
			case T_ROW_NUMBER:
			case T_CUME_DIST:
			case T_PERCENT_RANK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1454);
				((Over_funcContext)_localctx).analytic_func = analytic_func();
				 ((Over_funcContext)_localctx).res =  ((Over_funcContext)_localctx).analytic_func.res; 
				}
				break;
			case T_LAG:
			case T_LEAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1457);
				((Over_funcContext)_localctx).f_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_LAG || _la==T_LEAD) ) {
					((Over_funcContext)_localctx).f_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1458);
				((Over_funcContext)_localctx).expr_list = expr_list();
				 ((Over_funcContext)_localctx).res =  hql_list_param_func((((Over_funcContext)_localctx).f_name!=null?((Over_funcContext)_localctx).f_name.getText():null), "column_list", ((Over_funcContext)_localctx).expr_list.res); 
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
		enterRule(_localctx, 168, RULE_analytic_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			((Analytic_funcContext)_localctx).func_name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 525)) & ~0x3f) == 0 && ((1L << (_la - 525)) & ((1L << (T_RANK - 525)) | (1L << (T_DENSE_RANK - 525)) | (1L << (T_ROW_NUMBER - 525)) | (1L << (T_CUME_DIST - 525)) | (1L << (T_PERCENT_RANK - 525)))) != 0)) ) {
				((Analytic_funcContext)_localctx).func_name = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1464);
			match(T_OPEN_P);
			setState(1465);
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
		enterRule(_localctx, 170, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> exprs; 
			setState(1469);
			match(T_OPEN_P);
			setState(1470);
			((Expr_listContext)_localctx).expr = expr(0);
			((Expr_listContext)_localctx).exprs.add(((Expr_listContext)_localctx).expr);
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1471);
				match(T_COMMA);
				setState(1472);
				((Expr_listContext)_localctx).expr = expr(0);
				((Expr_listContext)_localctx).exprs.add(((Expr_listContext)_localctx).expr);
				}
				}
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1478);
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
		public Generic_functionContext generic_function;
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
		public Full_select_stmtContext full_select_stmt;
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
		public Generic_functionContext generic_function() {
			return getRuleContext(Generic_functionContext.class,0);
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
		public Full_select_stmtContext full_select_stmt() {
			return getRuleContext(Full_select_stmtContext.class,0);
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
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1482);
				((ExprContext)_localctx).literal_values = literal_values();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).literal_values.res; 
				}
				break;
			case 2:
				{
				setState(1485);
				((ExprContext)_localctx).ident = ident();
				 ((ExprContext)_localctx).res =   ((ExprContext)_localctx).ident.res; 
				}
				break;
			case 3:
				{
				setState(1488);
				((ExprContext)_localctx).unary_operator = unary_operator();
				setState(1489);
				((ExprContext)_localctx).expr = expr(13);
				 ((ExprContext)_localctx).res =  hql_unary_operator((((ExprContext)_localctx).unary_operator!=null?_input.getText(((ExprContext)_localctx).unary_operator.start,((ExprContext)_localctx).unary_operator.stop):null), ((ExprContext)_localctx).expr.res); 
				}
				break;
			case 4:
				{
				setState(1492);
				match(T_OPEN_P);
				setState(1493);
				((ExprContext)_localctx).expr = expr(0);
				setState(1494);
				match(T_CLOSE_P);
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr.res; 
				}
				break;
			case 5:
				{
				setState(1497);
				((ExprContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case 6:
				{
				setState(1500);
				((ExprContext)_localctx).math_func = math_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).math_func.res; 
				}
				break;
			case 7:
				{
				setState(1503);
				((ExprContext)_localctx).date_func = date_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).date_func.res; 
				}
				break;
			case 8:
				{
				setState(1506);
				((ExprContext)_localctx).cond_func = cond_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).cond_func.res; 
				}
				break;
			case 9:
				{
				setState(1509);
				((ExprContext)_localctx).str_func = str_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).str_func.res; 
				}
				break;
			case 10:
				{
				setState(1512);
				((ExprContext)_localctx).expr_concat = expr_concat();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr_concat.res; 
				}
				break;
			case 11:
				{
				setState(1515);
				((ExprContext)_localctx).misc_func = misc_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).misc_func.res; 
				}
				break;
			case 12:
				{
				setState(1518);
				((ExprContext)_localctx).aggr_func = aggr_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).aggr_func.res; 
				}
				break;
			case 13:
				{
				setState(1521);
				((ExprContext)_localctx).generic_function = generic_function();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).generic_function.res; 
				}
				break;
			case 14:
				{
				setState(1524);
				((ExprContext)_localctx).complex_types = complex_types();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).complex_types.res; 
				}
				break;
			case 15:
				{
				setState(1527);
				((ExprContext)_localctx).use_var = use_var();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).use_var.res; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1616);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1532);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1533);
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
						setState(1534);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(31);
						 ((ExprContext)_localctx).res =  hql_math_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1537);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1538);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1539);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(30);
						 ((ExprContext)_localctx).res =  hql_math_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1542);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1543);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1544);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(29);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1547);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1548);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 553)) & ~0x3f) == 0 && ((1L << (_la - 553)) & ((1L << (T_GREATER - 553)) | (1L << (T_GREATEREQUAL - 553)) | (1L << (T_LESS - 553)) | (1L << (T_LESSEQUAL - 553)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1549);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(28);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1552);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1553);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || ((((_la - 549)) & ~0x3f) == 0 && ((1L << (_la - 549)) & ((1L << (T_EQUAL - 549)) | (1L << (T_EQUAL2 - 549)) | (1L << (T_NOTEQUAL - 549)) | (1L << (T_NOTEQUAL2 - 549)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1554);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(27);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1557);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1558);
						((ExprContext)_localctx).op = match(T_AND);
						setState(1559);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(26);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1562);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1563);
						((ExprContext)_localctx).op = match(T_OR);
						setState(1564);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(25);
						 ((ExprContext)_localctx).res =  hql_bool_operator((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).l_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1567);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1568);
						match(T_BETWEEN);
						setState(1569);
						((ExprContext)_localctx).start_interval = ((ExprContext)_localctx).expr = expr(0);
						setState(1570);
						match(T_AND);
						setState(1571);
						((ExprContext)_localctx).end_interval = ((ExprContext)_localctx).expr = expr(22);
						 ((ExprContext)_localctx).res =  hql_between_expr(((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).start_interval.res, ((ExprContext)_localctx).end_interval.res, false); 
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1574);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1575);
						match(T_NOT);
						setState(1576);
						match(T_BETWEEN);
						setState(1577);
						((ExprContext)_localctx).start_interval = ((ExprContext)_localctx).expr = expr(0);
						setState(1578);
						match(T_AND);
						setState(1579);
						((ExprContext)_localctx).end_interval = ((ExprContext)_localctx).expr = expr(21);
						 ((ExprContext)_localctx).res =  hql_between_expr(((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).start_interval.res, ((ExprContext)_localctx).end_interval.res, true); 
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1582);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1583);
						((ExprContext)_localctx).set_operators_like = set_operators_like();
						setState(1584);
						((ExprContext)_localctx).r_expr = ((ExprContext)_localctx).expr = expr(17);
						 ((ExprContext)_localctx).res =  hql_bool_operator(((ExprContext)_localctx).set_operators_like.res, ((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).r_expr.res); 
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l_expr = _prevctx;
						_localctx.l_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1587);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1588);
						((ExprContext)_localctx).set_operators_is = set_operators_is();
						setState(1589);
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
						setState(1592);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1593);
						((ExprContext)_localctx).set_operators_is = set_operators_is();
						setState(1594);
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
						setState(1597);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1598);
						((ExprContext)_localctx).set_operators_in = set_operators_in();
						setState(1599);
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
						setState(1602);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1603);
						((ExprContext)_localctx).set_operators_in = set_operators_in();
						setState(1604);
						match(T_OPEN_P);
						setState(1605);
						((ExprContext)_localctx).full_select_stmt = full_select_stmt();
						setState(1606);
						match(T_CLOSE_P);
						 ((ExprContext)_localctx).res =  hql_set_operators_in(((ExprContext)_localctx).set_operators_in.res, ((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).full_select_stmt.res); 
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.eval_expr = _prevctx;
						_localctx.eval_expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1609);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1610);
						((ExprContext)_localctx).set_operators_exists = set_operators_exists();
						setState(1611);
						match(T_OPEN_P);
						setState(1612);
						((ExprContext)_localctx).full_select_stmt = full_select_stmt();
						setState(1613);
						match(T_CLOSE_P);
						 ((ExprContext)_localctx).res =  hql_set_operators_in(((ExprContext)_localctx).set_operators_exists.res, ((ExprContext)_localctx).eval_expr.res, ((ExprContext)_localctx).full_select_stmt.res); 
						}
						break;
					}
					} 
				}
				setState(1620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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
		enterRule(_localctx, 174, RULE_complex_types);
		try {
			setState(1661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1621);
				((Complex_typesContext)_localctx).array_def = array_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).array_def.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1624);
				((Complex_typesContext)_localctx).map_def = map_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).map_def.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1627);
				((Complex_typesContext)_localctx).struct_def = struct_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).struct_def.res; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1630);
				((Complex_typesContext)_localctx).named_struct_def = named_struct_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).named_struct_def.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1633);
				((Complex_typesContext)_localctx).ident = ident();
				setState(1634);
				match(T_OPEN_SB);
				setState(1635);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(1636);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).ident.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1639);
				((Complex_typesContext)_localctx).array_def = array_def();
				setState(1640);
				match(T_OPEN_SB);
				setState(1641);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(1642);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).array_def.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1645);
				((Complex_typesContext)_localctx).map_def = map_def();
				setState(1646);
				match(T_OPEN_SB);
				setState(1647);
				((Complex_typesContext)_localctx).expr = expr(0);
				setState(1648);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).map_def.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1651);
				((Complex_typesContext)_localctx).ident = ident();
				setState(1652);
				match(T__1);
				setState(1653);
				((Complex_typesContext)_localctx).expr = expr(0);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).ident.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1656);
				((Complex_typesContext)_localctx).struct_def = struct_def();
				setState(1657);
				match(T__1);
				setState(1658);
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
		enterRule(_localctx, 176, RULE_array_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> exprs; 
			setState(1664);
			match(T_ARRAY);
			setState(1665);
			match(T_OPEN_P);
			setState(1666);
			((Array_defContext)_localctx).expr = expr(0);
			((Array_defContext)_localctx).exprs.add(((Array_defContext)_localctx).expr);
			setState(1671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1667);
				match(T_COMMA);
				setState(1668);
				((Array_defContext)_localctx).expr = expr(0);
				((Array_defContext)_localctx).exprs.add(((Array_defContext)_localctx).expr);
				}
				}
				setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1674);
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
		enterRule(_localctx, 178, RULE_map_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> key_exprs; vector<ExprContext*> val_exprs; 
			setState(1678);
			match(T_MAP);
			setState(1679);
			match(T_OPEN_P);
			setState(1680);
			((Map_defContext)_localctx).expr = expr(0);
			((Map_defContext)_localctx).key_exprs.add(((Map_defContext)_localctx).expr);
			setState(1681);
			match(T_COMMA);
			setState(1682);
			((Map_defContext)_localctx).expr = expr(0);
			((Map_defContext)_localctx).val_exprs.add(((Map_defContext)_localctx).expr);
			setState(1690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1683);
				match(T_COMMA);
				setState(1684);
				((Map_defContext)_localctx).expr = expr(0);
				((Map_defContext)_localctx).key_exprs.add(((Map_defContext)_localctx).expr);
				setState(1685);
				match(T_COMMA);
				setState(1686);
				((Map_defContext)_localctx).expr = expr(0);
				((Map_defContext)_localctx).val_exprs.add(((Map_defContext)_localctx).expr);
				}
				}
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1693);
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
		enterRule(_localctx, 180, RULE_struct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> val_exprs; 
			setState(1697);
			match(T_STRUCT);
			setState(1698);
			match(T_OPEN_P);
			setState(1699);
			((Struct_defContext)_localctx).expr = expr(0);
			((Struct_defContext)_localctx).val_exprs.add(((Struct_defContext)_localctx).expr);
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1700);
				match(T_COMMA);
				setState(1701);
				((Struct_defContext)_localctx).expr = expr(0);
				((Struct_defContext)_localctx).val_exprs.add(((Struct_defContext)_localctx).expr);
				}
				}
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1707);
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
		enterRule(_localctx, 182, RULE_named_struct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> col_exprs; vector<ExprContext*> val_exprs; 
			setState(1711);
			match(T_NAMED_STRUCT);
			setState(1712);
			match(T_OPEN_P);
			setState(1713);
			((Named_struct_defContext)_localctx).expr = expr(0);
			((Named_struct_defContext)_localctx).col_exprs.add(((Named_struct_defContext)_localctx).expr);
			setState(1714);
			match(T_COMMA);
			setState(1715);
			((Named_struct_defContext)_localctx).expr = expr(0);
			((Named_struct_defContext)_localctx).val_exprs.add(((Named_struct_defContext)_localctx).expr);
			setState(1723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1716);
				match(T_COMMA);
				setState(1717);
				((Named_struct_defContext)_localctx).expr = expr(0);
				((Named_struct_defContext)_localctx).col_exprs.add(((Named_struct_defContext)_localctx).expr);
				setState(1718);
				match(T_COMMA);
				setState(1719);
				((Named_struct_defContext)_localctx).expr = expr(0);
				((Named_struct_defContext)_localctx).val_exprs.add(((Named_struct_defContext)_localctx).expr);
				}
				}
				setState(1725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1726);
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
		enterRule(_localctx, 184, RULE_str_func);
		int _la;
		try {
			setState(2242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				match(T_ASCII);
				setState(1730);
				match(T_OPEN_P);
				setState(1731);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1732);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("ASCII", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1735);
				match(T_BASE64);
				setState(1736);
				match(T_OPEN_P);
				setState(1737);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1738);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("BASE64", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1741);
				match(T_CHARACTER_LENGTH);
				setState(1742);
				match(T_OPEN_P);
				setState(1743);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1744);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHARACTER_LENGTH", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1747);
				match(T_CHR);
				setState(1748);
				match(T_OPEN_P);
				setState(1749);
				((Str_funcContext)_localctx).expr = expr(0);
				setState(1750);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHR", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(1754);
				match(T_CONCAT);
				setState(1755);
				match(T_OPEN_P);
				setState(1756);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1759); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1757);
					match(T_COMMA);
					setState(1758);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1761); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(1763);
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
				setState(1767);
				match(T_CONCAT_WS);
				setState(1768);
				match(T_OPEN_P);
				setState(1769);
				((Str_funcContext)_localctx).sep = expr(0);
				setState(1770);
				match(T_COMMA);
				setState(1771);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1774); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1772);
					match(T_COMMA);
					setState(1773);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1776); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(1778);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("CONCAT","separator", ((Str_funcContext)_localctx).sep.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1781);
				match(T_DECODE);
				setState(1782);
				match(T_OPEN_P);
				setState(1783);
				((Str_funcContext)_localctx).expr_bin = expr(0);
				setState(1784);
				match(T_COMMA);
				setState(1785);
				((Str_funcContext)_localctx).expr_charset = expr(0);
				setState(1786);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("DECODE", "binary_value", ((Str_funcContext)_localctx).expr_bin.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				 vector<ExprContext*> exprs; 
				setState(1790);
				match(T_ELT);
				setState(1791);
				match(T_OPEN_P);
				setState(1792);
				((Str_funcContext)_localctx).index_num = expr(0);
				setState(1793);
				match(T_COMMA);
				setState(1794);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1795);
					match(T_COMMA);
					setState(1796);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1801);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1802);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("ELT","index_num", ((Str_funcContext)_localctx).index_num.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1805);
				match(T_ENCODE);
				setState(1806);
				match(T_OPEN_P);
				setState(1807);
				((Str_funcContext)_localctx).expr_str = expr(0);
				setState(1808);
				match(T_COMMA);
				setState(1809);
				((Str_funcContext)_localctx).expr_charset = expr(0);
				setState(1810);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("ENCODE", "str_value", ((Str_funcContext)_localctx).expr_str.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				 vector<ExprContext*> exprs; 
				setState(1814);
				match(T_FIELD);
				setState(1815);
				match(T_OPEN_P);
				setState(1816);
				((Str_funcContext)_localctx).expr_val = expr(0);
				setState(1817);
				match(T_COMMA);
				setState(1818);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1819);
					match(T_COMMA);
					setState(1820);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1825);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1826);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("FIELD","expr_val", ((Str_funcContext)_localctx).expr_val.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1829);
				match(T_FIELD_IN_SET);
				setState(1830);
				match(T_OPEN_P);
				setState(1831);
				((Str_funcContext)_localctx).expr_str = expr(0);
				setState(1832);
				match(T_COMMA);
				setState(1833);
				((Str_funcContext)_localctx).expr_str_list = expr(0);
				setState(1834);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FIELD_IN_SET", "str_value", ((Str_funcContext)_localctx).expr_str.res, "str_list", ((Str_funcContext)_localctx).expr_str_list.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1837);
				match(T_FORMAT_NUMBER);
				setState(1838);
				match(T_OPEN_P);
				setState(1839);
				((Str_funcContext)_localctx).number_expr = expr(0);
				setState(1840);
				match(T_COMMA);
				setState(1841);
				((Str_funcContext)_localctx).int_expr = expr(0);
				setState(1842);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FORMAT_NUMBER", "number", ((Str_funcContext)_localctx).number_expr.res, "decimal_places", ((Str_funcContext)_localctx).int_expr.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1845);
				match(T_GET_JSON_OBJECTS);
				setState(1846);
				match(T_OPEN_P);
				setState(1847);
				((Str_funcContext)_localctx).json_string = expr(0);
				setState(1848);
				match(T_COMMA);
				setState(1849);
				((Str_funcContext)_localctx).path_expr = expr(0);
				setState(1850);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("GET_JSON_OBJECTS", "json_string", ((Str_funcContext)_localctx).json_string.res, "path", ((Str_funcContext)_localctx).path_expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1853);
				match(T_IN_FILE);
				setState(1854);
				match(T_OPEN_P);
				setState(1855);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1856);
				match(T_COMMA);
				setState(1857);
				((Str_funcContext)_localctx).filename = expr(0);
				setState(1858);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_FILE", "string", ((Str_funcContext)_localctx).str_expr.res, "filename", ((Str_funcContext)_localctx).filename.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1861);
				match(T_IN_STR);
				setState(1862);
				match(T_OPEN_P);
				setState(1863);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1864);
				match(T_COMMA);
				setState(1865);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(1866);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_STR", "string", ((Str_funcContext)_localctx).str_expr.res, "substring", ((Str_funcContext)_localctx).substr_expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1869);
				match(T_LENGTH);
				setState(1870);
				match(T_OPEN_P);
				setState(1871);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1872);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1875);
				match(T_LOCATE);
				setState(1876);
				match(T_OPEN_P);
				setState(1877);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(1878);
				match(T_COMMA);
				setState(1879);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1880);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1883);
				match(T_LOCATE);
				setState(1884);
				match(T_OPEN_P);
				setState(1885);
				((Str_funcContext)_localctx).substr_expr = expr(0);
				setState(1886);
				match(T_COMMA);
				setState(1887);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1888);
				match(T_COMMA);
				setState(1889);
				((Str_funcContext)_localctx).pos = expr(0);
				setState(1890);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res,"position", ((Str_funcContext)_localctx).pos.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1893);
				_la = _input.LA(1);
				if ( !(_la==T_LOWER || _la==T_LCASE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1894);
				match(T_OPEN_P);
				setState(1895);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1896);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LOWER_CASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1899);
				match(T_LPAD);
				setState(1900);
				match(T_OPEN_P);
				setState(1901);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1902);
				match(T_COMMA);
				setState(1903);
				((Str_funcContext)_localctx).len = expr(0);
				setState(1904);
				match(T_COMMA);
				setState(1905);
				((Str_funcContext)_localctx).pad = expr(0);
				setState(1906);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1909);
				match(T_LTRIM);
				setState(1910);
				match(T_OPEN_P);
				setState(1911);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1912);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1915);
				match(T_OCTET_LENGTH);
				setState(1916);
				match(T_OPEN_P);
				setState(1917);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1918);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("OCTET_LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1921);
				match(T_PARSE_URL);
				setState(1922);
				match(T_OPEN_P);
				setState(1923);
				((Str_funcContext)_localctx).url_str = expr(0);
				setState(1924);
				match(T_COMMA);
				setState(1925);
				((Str_funcContext)_localctx).part_to_extract = expr(0);
				setState(1926);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1929);
				match(T_PARSE_URL);
				setState(1930);
				match(T_OPEN_P);
				setState(1931);
				((Str_funcContext)_localctx).url_str = expr(0);
				setState(1932);
				match(T_COMMA);
				setState(1933);
				((Str_funcContext)_localctx).part_to_extract = expr(0);
				setState(1934);
				match(T_COMMA);
				setState(1935);
				((Str_funcContext)_localctx).key_to_extract = expr(0);
				setState(1936);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res, "key_to_extract", ((Str_funcContext)_localctx).key_to_extract.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				 vector<ExprContext*> exprs; 
				setState(1940);
				match(T_PRINTF);
				setState(1941);
				match(T_OPEN_P);
				setState(1942);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1943);
				match(T_COMMA);
				setState(1944);
				((Str_funcContext)_localctx).expr = expr(0);
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1947); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1945);
					match(T_COMMA);
					setState(1946);
					((Str_funcContext)_localctx).expr = expr(0);
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1949); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(1951);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("PRINTF","string", ((Str_funcContext)_localctx).str_expr.res, "object_list",expr_list_json);
				    
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1954);
				match(T_QUOTE);
				setState(1955);
				match(T_OPEN_P);
				setState(1956);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1957);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("QUOTE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1960);
				match(T_REGEXP_EXTRACT);
				setState(1961);
				match(T_OPEN_P);
				setState(1962);
				((Str_funcContext)_localctx).subject = expr(0);
				setState(1963);
				match(T_COMMA);
				setState(1964);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(1965);
				match(T_COMMA);
				setState(1966);
				((Str_funcContext)_localctx).index = expr(0);
				setState(1967);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_EXTRACT", "subject", ((Str_funcContext)_localctx).subject.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"index", ((Str_funcContext)_localctx).index.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1970);
				match(T_REGEXP_REPLACE);
				setState(1971);
				match(T_OPEN_P);
				setState(1972);
				((Str_funcContext)_localctx).initial_string = expr(0);
				setState(1973);
				match(T_COMMA);
				setState(1974);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(1975);
				match(T_COMMA);
				setState(1976);
				((Str_funcContext)_localctx).replacement = expr(0);
				setState(1977);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_REPLACE", "initial_string", ((Str_funcContext)_localctx).initial_string.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"replacement", ((Str_funcContext)_localctx).replacement.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1980);
				match(T_REPEAT);
				setState(1981);
				match(T_OPEN_P);
				setState(1982);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1983);
				match(T_COMMA);
				setState(1984);
				((Str_funcContext)_localctx).n_times_expr = expr(0);
				setState(1985);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("REPEAT", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_times_expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1988);
				match(T_REPLACE);
				setState(1989);
				match(T_OPEN_P);
				setState(1990);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(1991);
				match(T_COMMA);
				setState(1992);
				((Str_funcContext)_localctx).old = expr(0);
				setState(1993);
				match(T_COMMA);
				setState(1994);
				((Str_funcContext)_localctx).new_expr = expr(0);
				setState(1995);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REPLACE", "string", ((Str_funcContext)_localctx).str_expr.res, "old", ((Str_funcContext)_localctx).old.res,"new", ((Str_funcContext)_localctx).new_expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1998);
				match(T_REVERSE);
				setState(1999);
				match(T_OPEN_P);
				setState(2000);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2001);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("REVERSE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2004);
				match(T_RPAD);
				setState(2005);
				match(T_OPEN_P);
				setState(2006);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2007);
				match(T_COMMA);
				setState(2008);
				((Str_funcContext)_localctx).len = expr(0);
				setState(2009);
				match(T_COMMA);
				setState(2010);
				((Str_funcContext)_localctx).pad = expr(0);
				setState(2011);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("RPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2014);
				match(T_RTRIM);
				setState(2015);
				match(T_OPEN_P);
				setState(2016);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2017);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("RTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2020);
				match(T_SENTENCES);
				setState(2021);
				match(T_OPEN_P);
				setState(2022);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2023);
				match(T_COMMA);
				setState(2024);
				((Str_funcContext)_localctx).lang_expr = expr(0);
				setState(2025);
				match(T_COMMA);
				setState(2026);
				((Str_funcContext)_localctx).locale_expr = expr(0);
				setState(2027);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SENTENCES", "string", ((Str_funcContext)_localctx).str_expr.res, "lang", ((Str_funcContext)_localctx).lang_expr.res, "locale", ((Str_funcContext)_localctx).locale_expr.res); 
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2030);
				match(T_SPACE);
				setState(2031);
				match(T_OPEN_P);
				setState(2032);
				((Str_funcContext)_localctx).size_expr = expr(0);
				setState(2033);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SPACE", "size", ((Str_funcContext)_localctx).size_expr.res); 
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2036);
				match(T_SPLIT);
				setState(2037);
				match(T_OPEN_P);
				setState(2038);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2039);
				match(T_COMMA);
				setState(2040);
				((Str_funcContext)_localctx).pattern = expr(0);
				setState(2041);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SPLIT", "string", ((Str_funcContext)_localctx).str_expr.res, "pattern", ((Str_funcContext)_localctx).pattern.res); 
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2044);
				match(T_STR_TO_MAP);
				setState(2045);
				match(T_OPEN_P);
				setState(2046);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2047);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", hql_string_type(";"), "delimiter2", hql_string_type(":")); 
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2050);
				match(T_STR_TO_MAP);
				setState(2051);
				match(T_OPEN_P);
				setState(2052);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2053);
				match(T_COMMA);
				setState(2054);
				((Str_funcContext)_localctx).delimiter1 = expr(0);
				setState(2055);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2", hql_string_type(":")); 
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2058);
				match(T_STR_TO_MAP);
				setState(2059);
				match(T_OPEN_P);
				setState(2060);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2061);
				match(T_COMMA);
				setState(2062);
				((Str_funcContext)_localctx).delimiter1 = expr(0);
				setState(2063);
				match(T_COMMA);
				setState(2064);
				((Str_funcContext)_localctx).delimiter2 = expr(0);
				setState(2065);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2",((Str_funcContext)_localctx).delimiter2.res); 
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2068);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2069);
				match(T_OPEN_P);
				setState(2070);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2071);
				match(T_COMMA);
				setState(2072);
				((Str_funcContext)_localctx).start_indx = expr(0);
				setState(2073);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res); 
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2076);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2077);
				match(T_OPEN_P);
				setState(2078);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2079);
				match(T_COMMA);
				setState(2080);
				((Str_funcContext)_localctx).start_indx = expr(0);
				setState(2081);
				match(T_COMMA);
				setState(2082);
				((Str_funcContext)_localctx).lenght_expr = expr(0);
				setState(2083);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res, "length", ((Str_funcContext)_localctx).lenght_expr.res); 
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2086);
				match(T_SUBSTRING_INDEX);
				setState(2087);
				match(T_OPEN_P);
				setState(2088);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2089);
				match(T_COMMA);
				setState(2090);
				((Str_funcContext)_localctx).delimiter = expr(0);
				setState(2091);
				match(T_COMMA);
				setState(2092);
				((Str_funcContext)_localctx).count = expr(0);
				setState(2093);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING_INDEX", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter", ((Str_funcContext)_localctx).delimiter.res, "count", ((Str_funcContext)_localctx).count.res); 
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2096);
				match(T_TRANSLATE);
				setState(2097);
				match(T_OPEN_P);
				setState(2098);
				((Str_funcContext)_localctx).input_expr = expr(0);
				setState(2099);
				match(T_COMMA);
				setState(2100);
				((Str_funcContext)_localctx).from_expr = expr(0);
				setState(2101);
				match(T_COMMA);
				setState(2102);
				((Str_funcContext)_localctx).to_expr = expr(0);
				setState(2103);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("TRANSLATE", "input", ((Str_funcContext)_localctx).input_expr.res, "from", ((Str_funcContext)_localctx).from_expr.res, "to", ((Str_funcContext)_localctx).to_expr.res); 
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2106);
				match(T_TRIM);
				setState(2107);
				match(T_OPEN_P);
				setState(2108);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2109);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("TRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2112);
				match(T_UNBASE64);
				setState(2113);
				match(T_OPEN_P);
				setState(2114);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2115);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UNBASE64", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(2118);
				_la = _input.LA(1);
				if ( !(_la==T_UPPER || _la==T_UCASE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2119);
				match(T_OPEN_P);
				setState(2120);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2121);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UPPERCASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(2124);
				match(T_INITCAP);
				setState(2125);
				match(T_OPEN_P);
				setState(2126);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2127);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("INITCAP", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(2130);
				match(T_LEVENSHTEIN);
				setState(2131);
				match(T_OPEN_P);
				setState(2132);
				((Str_funcContext)_localctx).strA_expr = expr(0);
				setState(2133);
				match(T_COMMA);
				setState(2134);
				((Str_funcContext)_localctx).strB_expr = expr(0);
				setState(2135);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LEVENSHTEIN", "string_A", ((Str_funcContext)_localctx).strA_expr.res, "string_B", ((Str_funcContext)_localctx).strB_expr.res); 
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(2138);
				match(T_SOUNDEX);
				setState(2139);
				match(T_OPEN_P);
				setState(2140);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2141);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SOUNDEX", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(2144);
				match(T_MASK);
				setState(2145);
				match(T_OPEN_P);
				setState(2146);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2147);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(2150);
				match(T_MASK);
				setState(2151);
				match(T_OPEN_P);
				setState(2152);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2153);
				match(T_COMMA);
				setState(2154);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(2155);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res); 
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(2158);
				match(T_MASK);
				setState(2159);
				match(T_OPEN_P);
				setState(2160);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2161);
				match(T_COMMA);
				setState(2162);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(2163);
				match(T_COMMA);
				setState(2164);
				((Str_funcContext)_localctx).str_lower_expr = expr(0);
				setState(2165);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res); 
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(2168);
				match(T_MASK);
				setState(2169);
				match(T_OPEN_P);
				setState(2170);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2171);
				match(T_COMMA);
				setState(2172);
				((Str_funcContext)_localctx).str_upper_expr = expr(0);
				setState(2173);
				match(T_COMMA);
				setState(2174);
				((Str_funcContext)_localctx).str_lower_expr = expr(0);
				setState(2175);
				match(T_COMMA);
				setState(2176);
				((Str_funcContext)_localctx).str_number_expr = expr(0);
				setState(2177);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_four_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res, "number", ((Str_funcContext)_localctx).str_number_expr.res); 
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(2180);
				match(T_MASK_FIRST_N);
				setState(2181);
				match(T_OPEN_P);
				setState(2182);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2183);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(2186);
				match(T_MASK_FIRST_N);
				setState(2187);
				match(T_OPEN_P);
				setState(2188);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2189);
				match(T_COMMA);
				setState(2190);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2191);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(2194);
				match(T_MASK_LAST_N);
				setState(2195);
				match(T_OPEN_P);
				setState(2196);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2197);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(2200);
				match(T_MASK_LAST_N);
				setState(2201);
				match(T_OPEN_P);
				setState(2202);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2203);
				match(T_COMMA);
				setState(2204);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2205);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(2208);
				match(T_MASK_SHOW_FIRST_N);
				setState(2209);
				match(T_OPEN_P);
				setState(2210);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2211);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(2214);
				match(T_MASK_SHOW_FIRST_N);
				setState(2215);
				match(T_OPEN_P);
				setState(2216);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2217);
				match(T_COMMA);
				setState(2218);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2219);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(2222);
				match(T_MASK_SHOW_LAST_N);
				setState(2223);
				match(T_OPEN_P);
				setState(2224);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2225);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(2228);
				match(T_MASK_SHOW_LAST_N);
				setState(2229);
				match(T_OPEN_P);
				setState(2230);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2231);
				match(T_COMMA);
				setState(2232);
				((Str_funcContext)_localctx).n_expr = expr(0);
				setState(2233);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(2236);
				match(T_MASK_HASH);
				setState(2237);
				match(T_OPEN_P);
				setState(2238);
				((Str_funcContext)_localctx).str_expr = expr(0);
				setState(2239);
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
		enterRule(_localctx, 186, RULE_misc_func);
		int _la;
		try {
			setState(2344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_JAVA_METHOD:
				enterOuterAlt(_localctx, 1);
				{
				 vector<ExprContext*> exprs; 
				setState(2245);
				match(T_JAVA_METHOD);
				setState(2246);
				match(T_OPEN_P);
				setState(2247);
				((Misc_funcContext)_localctx).class_name_expr = expr(0);
				setState(2248);
				match(T_COMMA);
				setState(2249);
				((Misc_funcContext)_localctx).method_name_expr = expr(0);
				setState(2254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2250);
					match(T_COMMA);
					setState(2251);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2257);
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
				setState(2261);
				match(T_REFLECT);
				setState(2262);
				match(T_OPEN_P);
				setState(2263);
				((Misc_funcContext)_localctx).class_name_expr = expr(0);
				setState(2264);
				match(T_COMMA);
				setState(2265);
				((Misc_funcContext)_localctx).method_name_expr = expr(0);
				setState(2270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2266);
					match(T_COMMA);
					setState(2267);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2273);
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
				setState(2277);
				match(T_HASH);
				setState(2278);
				match(T_OPEN_P);
				setState(2279);
				((Misc_funcContext)_localctx).expr = expr(0);
				((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
				setState(2284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2280);
					match(T_COMMA);
					setState(2281);
					((Misc_funcContext)_localctx).expr = expr(0);
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2287);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Misc_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Misc_funcContext)_localctx).res =  hql_list_param_func("HASH", "expr_list", expr_list_json);
				    
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2290);
				match(T_CURRENT_USER);
				setState(2291);
				match(T_OPEN_P);
				setState(2292);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("CURRENT_USER"); 
				}
				break;
			case T_LOGGED_IN_USER:
				enterOuterAlt(_localctx, 5);
				{
				setState(2294);
				match(T_LOGGED_IN_USER);
				setState(2295);
				match(T_OPEN_P);
				setState(2296);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("LOGGED_IN_USER"); 
				}
				break;
			case T_CURRENT_DATABASE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2298);
				match(T_CURRENT_DATABASE);
				setState(2299);
				match(T_OPEN_P);
				setState(2300);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("CURRENT_USER"); 
				}
				break;
			case T_MD5:
			case T_SHA1:
			case T_SHA:
			case T_CRC32:
				enterOuterAlt(_localctx, 7);
				{
				setState(2302);
				((Misc_funcContext)_localctx).f_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (T_MD5 - 389)) | (1L << (T_SHA1 - 389)) | (1L << (T_SHA - 389)))) != 0) || _la==T_CRC32) ) {
					((Misc_funcContext)_localctx).f_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2303);
				match(T_OPEN_P);
				setState(2304);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2305);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_single_param_func((((Misc_funcContext)_localctx).f_name!=null?((Misc_funcContext)_localctx).f_name.getText():null), "string", ((Misc_funcContext)_localctx).str_expr.res); 
				}
				break;
			case T_SHA2:
				enterOuterAlt(_localctx, 8);
				{
				setState(2308);
				match(T_SHA2);
				setState(2309);
				match(T_OPEN_P);
				setState(2310);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2311);
				match(T_COMMA);
				setState(2312);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(2313);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "string", ((Misc_funcContext)_localctx).str_expr.res, "hash_size", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_ENCRYPT:
				enterOuterAlt(_localctx, 9);
				{
				setState(2316);
				match(T_AES_ENCRYPT);
				setState(2317);
				match(T_OPEN_P);
				setState(2318);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2319);
				match(T_COMMA);
				setState(2320);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(2321);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_DECRYPT:
				enterOuterAlt(_localctx, 10);
				{
				setState(2324);
				match(T_AES_DECRYPT);
				setState(2325);
				match(T_OPEN_P);
				setState(2326);
				((Misc_funcContext)_localctx).str_expr = expr(0);
				setState(2327);
				match(T_COMMA);
				setState(2328);
				((Misc_funcContext)_localctx).n_expr = expr(0);
				setState(2329);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_VERSION:
				enterOuterAlt(_localctx, 11);
				{
				setState(2332);
				match(T_VERSION);
				setState(2333);
				match(T_OPEN_P);
				setState(2334);
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
				setState(2336);
				((Misc_funcContext)_localctx).f_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (T_XPATH - 512)) | (1L << (T_XPATH_BOOLEAN - 512)) | (1L << (T_XPATH_DOUBLE - 512)) | (1L << (T_XPATH_FLOAT - 512)) | (1L << (T_XPATH_INT - 512)) | (1L << (T_XPATH_LONG - 512)) | (1L << (T_XPATH_NUMBER - 512)) | (1L << (T_XPATH_SHORT - 512)) | (1L << (T_XPATH_STRING - 512)))) != 0)) ) {
					((Misc_funcContext)_localctx).f_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2337);
				match(T_OPEN_P);
				setState(2338);
				((Misc_funcContext)_localctx).xml_str_expr = expr(0);
				setState(2339);
				match(T_COMMA);
				setState(2340);
				((Misc_funcContext)_localctx).xpath_expr_str = expr(0);
				setState(2341);
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
		enterRule(_localctx, 188, RULE_expr_concat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 vector<Expr_concat_itemContext*> exprs; 
			setState(2347);
			((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
			((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
			setState(2350); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2348);
					match(T_PIPE);
					setState(2349);
					((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
					((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2352); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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
		public Generic_functionContext generic_function;
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
		public Generic_functionContext generic_function() {
			return getRuleContext(Generic_functionContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_expr_concat_item);
		try {
			setState(2394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2356);
				((Expr_concat_itemContext)_localctx).literal_values = literal_values();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).literal_values.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2359);
				((Expr_concat_itemContext)_localctx).ident = ident();
				 ((Expr_concat_itemContext)_localctx).res =   ((Expr_concat_itemContext)_localctx).ident.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2362);
				match(T_OPEN_P);
				setState(2363);
				((Expr_concat_itemContext)_localctx).expr = expr(0);
				setState(2364);
				match(T_CLOSE_P);
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr.res; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2367);
				((Expr_concat_itemContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2370);
				((Expr_concat_itemContext)_localctx).math_func = math_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).math_func.res; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2373);
				((Expr_concat_itemContext)_localctx).date_func = date_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).date_func.res; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2376);
				((Expr_concat_itemContext)_localctx).cond_func = cond_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).cond_func.res; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2379);
				((Expr_concat_itemContext)_localctx).str_func = str_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).str_func.res; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2382);
				((Expr_concat_itemContext)_localctx).misc_func = misc_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).misc_func.res; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2385);
				((Expr_concat_itemContext)_localctx).aggr_func = aggr_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).aggr_func.res; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2388);
				((Expr_concat_itemContext)_localctx).use_var = use_var();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).use_var.res; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2391);
				((Expr_concat_itemContext)_localctx).generic_function = generic_function();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).generic_function.res; 
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
		enterRule(_localctx, 192, RULE_cond_func);
		int _la;
		try {
			setState(2515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2396);
				match(T_IF);
				setState(2397);
				match(T_OPEN_P);
				setState(2398);
				((Cond_funcContext)_localctx).test_cond = expr(0);
				setState(2399);
				match(T_COMMA);
				setState(2400);
				((Cond_funcContext)_localctx).valueTrue = expr(0);
				setState(2401);
				match(T_COMMA);
				setState(2402);
				((Cond_funcContext)_localctx).valueFalse = expr(0);
				setState(2403);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_three_param_func("IF", "test_cond", ((Cond_funcContext)_localctx).test_cond.res, "value_true", ((Cond_funcContext)_localctx).valueTrue.res, "value_false", ((Cond_funcContext)_localctx).valueFalse.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2406);
				match(T_ISNULL);
				setState(2407);
				match(T_OPEN_P);
				setState(2408);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(2409);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2412);
				match(T_ISNOTNULL);
				setState(2413);
				match(T_OPEN_P);
				setState(2414);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(2415);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNOTNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2418);
				match(T_NVL);
				setState(2419);
				match(T_OPEN_P);
				setState(2420);
				((Cond_funcContext)_localctx).expr_val = expr(0);
				setState(2421);
				match(T_COMMA);
				setState(2422);
				((Cond_funcContext)_localctx).default_val = expr(0);
				setState(2423);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NVL", "expr_val", ((Cond_funcContext)_localctx).expr_val.res, "default_val", ((Cond_funcContext)_localctx).default_val.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(2427);
				match(T_COALESCE);
				setState(2428);
				match(T_OPEN_P);
				setState(2429);
				((Cond_funcContext)_localctx).expr = expr(0);
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				setState(2432); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2430);
					match(T_COMMA);
					setState(2431);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2434); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(2436);
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
				setState(2440);
				match(T_CASE);
				setState(2441);
				((Cond_funcContext)_localctx).case_expr = expr(0);
				setState(2447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2442);
					match(T_WHEN);
					setState(2443);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2444);
					match(T_THEN);
					setState(2445);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2449); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2451);
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
				setState(2455);
				match(T_CASE);
				setState(2456);
				((Cond_funcContext)_localctx).case_expr = expr(0);
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
				        ((Cond_funcContext)_localctx).res =  hql_case_func(((Cond_funcContext)_localctx).case_expr.res, when_expr_list_json, then_expr_list_json, ((Cond_funcContext)_localctx).els_expr.res);
				     
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				 vector<ExprContext*> when_exprs; vector<ExprContext*> then_exprs; 
				setState(2472);
				match(T_CASE);
				setState(2478); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2473);
					match(T_WHEN);
					setState(2474);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2475);
					match(T_THEN);
					setState(2476);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2480); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2482);
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
				setState(2486);
				match(T_CASE);
				setState(2492); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2487);
					match(T_WHEN);
					setState(2488);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2489);
					match(T_THEN);
					setState(2490);
					((Cond_funcContext)_localctx).expr = expr(0);
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2494); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2496);
				match(T_ELSE);
				setState(2497);
				((Cond_funcContext)_localctx).els_expr = expr(0);
				setState(2498);
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
				setState(2501);
				match(T_NULLIF);
				setState(2502);
				match(T_OPEN_P);
				setState(2503);
				((Cond_funcContext)_localctx).a_expr = expr(0);
				setState(2504);
				match(T_COMMA);
				setState(2505);
				((Cond_funcContext)_localctx).b_expr = expr(0);
				setState(2506);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NULLIF", "a_expr", ((Cond_funcContext)_localctx).a_expr.res, "b_expr", ((Cond_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2509);
				match(T_ASSERT_TRUE);
				setState(2510);
				match(T_OPEN_P);
				setState(2511);
				((Cond_funcContext)_localctx).expr = expr(0);
				setState(2512);
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
		public TerminalNode T_DATE_ADD() { return getToken(HiveParser.T_DATE_ADD, 0); }
		public TerminalNode T_DATE_SUB() { return getToken(HiveParser.T_DATE_SUB, 0); }
		public TerminalNode T_TO_UTC_TIMESTAMP() { return getToken(HiveParser.T_TO_UTC_TIMESTAMP, 0); }
		public TerminalNode T_FROM_UTC_TIMESTAMP() { return getToken(HiveParser.T_FROM_UTC_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HiveParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HiveParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_ADD_MONTHS() { return getToken(HiveParser.T_ADD_MONTHS, 0); }
		public TerminalNode T_LAST_DAY() { return getToken(HiveParser.T_LAST_DAY, 0); }
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
		enterRule(_localctx, 194, RULE_date_func);
		try {
			setState(2707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2517);
				match(T_FROM_UNIXTIME);
				setState(2518);
				match(T_OPEN_P);
				setState(2519);
				((Date_funcContext)_localctx).unix_time = expr(0);
				setState(2520);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("FROM_UNIXTIME", "unixtime", ((Date_funcContext)_localctx).unix_time.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2523);
				match(T_FROM_UNIXTIME);
				setState(2524);
				match(T_OPEN_P);
				setState(2525);
				((Date_funcContext)_localctx).unix_time = expr(0);
				setState(2526);
				match(T_COMMA);
				setState(2527);
				((Date_funcContext)_localctx).str_format = expr(0);
				setState(2528);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("FROM_UNIXTIME", "unixtime", ((Date_funcContext)_localctx).unix_time.res,"format",((Date_funcContext)_localctx).str_format.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2531);
				match(T_UNIX_TIMESTAMP);
				setState(2532);
				match(T_OPEN_P);
				setState(2533);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("UNIX_TIMESTAMP"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2535);
				match(T_UNIX_TIMESTAMP);
				setState(2536);
				match(T_OPEN_P);
				setState(2537);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2538);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2541);
				match(T_UNIX_TIMESTAMP);
				setState(2542);
				match(T_OPEN_P);
				setState(2543);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2544);
				match(T_COMMA);
				setState(2545);
				((Date_funcContext)_localctx).pattern_expr = expr(0);
				setState(2546);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res, "pattern", ((Date_funcContext)_localctx).pattern_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2549);
				match(T_YEAR);
				setState(2550);
				match(T_OPEN_P);
				setState(2551);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2552);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("YEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2555);
				match(T_QUARTER);
				setState(2556);
				match(T_OPEN_P);
				setState(2557);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2558);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("QUARTER", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2561);
				match(T_MONTH);
				setState(2562);
				match(T_OPEN_P);
				setState(2563);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2564);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MONTH", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2567);
				match(T_DAY);
				setState(2568);
				match(T_OPEN_P);
				setState(2569);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2570);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2573);
				match(T_HOUR);
				setState(2574);
				match(T_OPEN_P);
				setState(2575);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2576);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("HOUR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2579);
				match(T_MINUTE);
				setState(2580);
				match(T_OPEN_P);
				setState(2581);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2582);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MINUTE", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2585);
				match(T_SECOND);
				setState(2586);
				match(T_OPEN_P);
				setState(2587);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2588);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("SECOND", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2591);
				match(T_WEEKOFYEAR);
				setState(2592);
				match(T_OPEN_P);
				setState(2593);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2594);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("WEEKOFYEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2597);
				match(T_DATEDIFF);
				setState(2598);
				match(T_OPEN_P);
				setState(2599);
				((Date_funcContext)_localctx).enddate = expr(0);
				setState(2600);
				match(T_COMMA);
				setState(2601);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2602);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "enddate", ((Date_funcContext)_localctx).enddate.res, "startdate", ((Date_funcContext)_localctx).startdate.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2605);
				match(T_DATE_ADD);
				setState(2606);
				match(T_OPEN_P);
				setState(2607);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2608);
				match(T_COMMA);
				setState(2609);
				((Date_funcContext)_localctx).days = expr(0);
				setState(2610);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2613);
				match(T_DATE_SUB);
				setState(2614);
				match(T_OPEN_P);
				setState(2615);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2616);
				match(T_COMMA);
				setState(2617);
				((Date_funcContext)_localctx).days = expr(0);
				setState(2618);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2621);
				match(T_TO_UTC_TIMESTAMP);
				setState(2622);
				match(T_OPEN_P);
				setState(2623);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(2624);
				match(T_COMMA);
				setState(2625);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(2626);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TO_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2629);
				match(T_FROM_UTC_TIMESTAMP);
				setState(2630);
				match(T_OPEN_P);
				setState(2631);
				((Date_funcContext)_localctx).ts = expr(0);
				setState(2632);
				match(T_COMMA);
				setState(2633);
				((Date_funcContext)_localctx).timezone = expr(0);
				setState(2634);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("FROM_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2637);
				match(T_CURRENT_DATE);
				setState(2640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(2638);
					match(T_OPEN_P);
					setState(2639);
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
				setState(2643);
				match(T_CURRENT_TIMESTAMP);
				setState(2646);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(2644);
					match(T_OPEN_P);
					setState(2645);
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
				setState(2649);
				match(T_ADD_MONTHS);
				setState(2650);
				match(T_OPEN_P);
				setState(2651);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2652);
				match(T_COMMA);
				setState(2653);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(2654);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2657);
				match(T_ADD_MONTHS);
				setState(2658);
				match(T_OPEN_P);
				setState(2659);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2660);
				match(T_COMMA);
				setState(2661);
				((Date_funcContext)_localctx).num_months = expr(0);
				setState(2662);
				match(T_COMMA);
				setState(2663);
				((Date_funcContext)_localctx).out_date_format = expr(0);
				setState(2664);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_three_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res, "out_date_format", ((Date_funcContext)_localctx).out_date_format.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2667);
				match(T_LAST_DAY);
				setState(2668);
				match(T_OPEN_P);
				setState(2669);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2670);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("LAST_DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2673);
				match(T_NEXT_DAY);
				setState(2674);
				match(T_OPEN_P);
				setState(2675);
				((Date_funcContext)_localctx).startdate = expr(0);
				setState(2676);
				match(T_COMMA);
				setState(2677);
				((Date_funcContext)_localctx).day_of_week = expr(0);
				setState(2678);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("NEXT_DAY", "startdate", ((Date_funcContext)_localctx).startdate.res, "day_of_week", ((Date_funcContext)_localctx).day_of_week.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2681);
				match(T_TRUNC);
				setState(2682);
				match(T_OPEN_P);
				setState(2683);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2684);
				match(T_COMMA);
				setState(2685);
				((Date_funcContext)_localctx).format = expr(0);
				setState(2686);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TRUNC", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2689);
				match(T_MONTHS_BETWEEN);
				setState(2690);
				match(T_OPEN_P);
				setState(2691);
				((Date_funcContext)_localctx).date1 = expr(0);
				setState(2692);
				match(T_COMMA);
				setState(2693);
				((Date_funcContext)_localctx).date2 = expr(0);
				setState(2694);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("MONTHS_BETWEEN", "date1", ((Date_funcContext)_localctx).date1.res, "date2", ((Date_funcContext)_localctx).date2.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2697);
				match(T_DATE_FORMAT);
				setState(2698);
				match(T_OPEN_P);
				setState(2699);
				((Date_funcContext)_localctx).date_expr = expr(0);
				setState(2700);
				match(T_COMMA);
				setState(2701);
				((Date_funcContext)_localctx).format = expr(0);
				setState(2702);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATE_FORMAT", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2705);
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
		enterRule(_localctx, 196, RULE_dat_convrt_func);
		int _la;
		try {
			setState(2726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2709);
				match(T_CAST);
				setState(2710);
				match(T_OPEN_P);
				setState(2711);
				((Dat_convrt_funcContext)_localctx).expr = expr(0);
				setState(2712);
				match(T_AS);
				setState(2713);
				((Dat_convrt_funcContext)_localctx).primitive_type = primitive_type();
				setState(2715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2714);
					dtype_len();
					}
				}

				setState(2717);
				match(T_CLOSE_P);
				 ((Dat_convrt_funcContext)_localctx).res =  hql_cast_func(((Dat_convrt_funcContext)_localctx).expr.res, ((Dat_convrt_funcContext)_localctx).primitive_type.res); 
				}
				break;
			case T_BINARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2720);
				match(T_BINARY);
				setState(2721);
				match(T_OPEN_P);
				setState(2722);
				((Dat_convrt_funcContext)_localctx).expr = expr(0);
				setState(2723);
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
		enterRule(_localctx, 198, RULE_basic_aggr_func);
		int _la;
		try {
			setState(2786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2728);
				match(T_COUNT);
				setState(2729);
				match(T_OPEN_P);
				setState(2730);
				((Basic_aggr_funcContext)_localctx).r = expr(0);
				setState(2731);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_count_func(((Basic_aggr_funcContext)_localctx).r.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 vector<ExprContext*> exprs; 
				setState(2735);
				match(T_COUNT);
				setState(2736);
				match(T_OPEN_P);
				setState(2737);
				match(T_DISTINCT);
				setState(2738);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				((Basic_aggr_funcContext)_localctx).exprs.add(((Basic_aggr_funcContext)_localctx).expr);
				setState(2743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2739);
					match(T_COMMA);
					setState(2740);
					((Basic_aggr_funcContext)_localctx).expr = expr(0);
					((Basic_aggr_funcContext)_localctx).exprs.add(((Basic_aggr_funcContext)_localctx).expr);
					}
					}
					setState(2745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2746);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Basic_aggr_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Basic_aggr_funcContext)_localctx).res =  hql_single_param_list_func("COUNT", "flag_distinct", true, "expr_list", expr_list_json);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2749);
				match(T_COUNT);
				setState(2750);
				match(T_OPEN_P);
				setState(2751);
				match(T_MUL);
				setState(2752);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_count_all_func(); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2754);
				match(T_SUM);
				setState(2755);
				match(T_OPEN_P);
				setState(2756);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2757);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", false, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2760);
				match(T_SUM);
				setState(2761);
				match(T_OPEN_P);
				setState(2762);
				match(T_DISTINCT);
				setState(2763);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2764);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", true, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2767);
				match(T_AVG);
				setState(2768);
				match(T_OPEN_P);
				setState(2769);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2770);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", false, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2773);
				match(T_AVG);
				setState(2774);
				match(T_OPEN_P);
				setState(2775);
				match(T_DISTINCT);
				setState(2776);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2777);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", true, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2780);
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
				setState(2781);
				match(T_OPEN_P);
				setState(2782);
				((Basic_aggr_funcContext)_localctx).expr = expr(0);
				setState(2783);
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
		enterRule(_localctx, 200, RULE_aggr_func);
		int _la;
		try {
			setState(2859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2788);
				((Aggr_funcContext)_localctx).basic_aggr_func = basic_aggr_func();
				 ((Aggr_funcContext)_localctx).res =  ((Aggr_funcContext)_localctx).basic_aggr_func.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2791);
				((Aggr_funcContext)_localctx).fun_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 394)) & ~0x3f) == 0 && ((1L << (_la - 394)) & ((1L << (T_VARIANCE - 394)) | (1L << (T_VAR_POP - 394)) | (1L << (T_VAR_SAMP - 394)))) != 0) || _la==T_STDDEV_POP || _la==T_STDDEV_SAMP) ) {
					((Aggr_funcContext)_localctx).fun_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2792);
				match(T_OPEN_P);
				setState(2793);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(2794);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2797);
				((Aggr_funcContext)_localctx).fun_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_COVAR_POP || _la==T_COVAR_SAMP || _la==T_CORR) ) {
					((Aggr_funcContext)_localctx).fun_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2798);
				match(T_OPEN_P);
				setState(2799);
				((Aggr_funcContext)_localctx).col1 = expr(0);
				setState(2800);
				match(T_COMMA);
				setState(2801);
				((Aggr_funcContext)_localctx).col2 = expr(0);
				setState(2802);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col1", ((Aggr_funcContext)_localctx).col1.res, "col2", ((Aggr_funcContext)_localctx).col2.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2805);
				match(T_PERCENTILE);
				setState(2806);
				match(T_OPEN_P);
				setState(2807);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2808);
				match(T_COMMA);
				setState(2809);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(2810);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2813);
				match(T_PERCENTILE_APPROX);
				setState(2814);
				match(T_OPEN_P);
				setState(2815);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2816);
				match(T_COMMA);
				setState(2817);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(2818);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2821);
				match(T_PERCENTILE_APPROX);
				setState(2822);
				match(T_OPEN_P);
				setState(2823);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2824);
				match(T_COMMA);
				setState(2825);
				((Aggr_funcContext)_localctx).p_expr = expr(0);
				setState(2826);
				match(T_COMMA);
				setState(2827);
				((Aggr_funcContext)_localctx).b_expr = expr(0);
				setState(2828);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_three_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2831);
				((Aggr_funcContext)_localctx).func_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 343)) & ~0x3f) == 0 && ((1L << (_la - 343)) & ((1L << (T_REGR_SXX - 343)) | (1L << (T_REGR_COUNT - 343)) | (1L << (T_REGR_INTERCEPT - 343)))) != 0) || ((((_la - 422)) & ~0x3f) == 0 && ((1L << (_la - 422)) & ((1L << (T_REGR_AVGX - 422)) | (1L << (T_REGR_SYY - 422)) | (1L << (T_REGR_R2 - 422)))) != 0) || ((((_la - 486)) & ~0x3f) == 0 && ((1L << (_la - 486)) & ((1L << (T_REGR_AVGY - 486)) | (1L << (T_REGR_SLOPE - 486)) | (1L << (T_REGR_SXY - 486)))) != 0)) ) {
					((Aggr_funcContext)_localctx).func_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2832);
				match(T_OPEN_P);
				setState(2833);
				((Aggr_funcContext)_localctx).indep = expr(0);
				setState(2834);
				match(T_COMMA);
				setState(2835);
				((Aggr_funcContext)_localctx).dep = expr(0);
				setState(2836);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "independent", ((Aggr_funcContext)_localctx).indep.res, "dependent", ((Aggr_funcContext)_localctx).dep.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2839);
				match(T_HISTOGRAM_NUMERIC);
				setState(2840);
				match(T_OPEN_P);
				setState(2841);
				((Aggr_funcContext)_localctx).col = expr(0);
				setState(2842);
				match(T_COMMA);
				setState(2843);
				((Aggr_funcContext)_localctx).b_expr = expr(0);
				setState(2844);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("HISTOGRAM_NUMERIC", "col", ((Aggr_funcContext)_localctx).col.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2847);
				((Aggr_funcContext)_localctx).func_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_COLLECT_LIST || _la==T_COLLECT_SET) ) {
					((Aggr_funcContext)_localctx).func_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2848);
				match(T_OPEN_P);
				setState(2849);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(2850);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2853);
				match(T_NTILE);
				setState(2854);
				match(T_OPEN_P);
				setState(2855);
				((Aggr_funcContext)_localctx).expr = expr(0);
				setState(2856);
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
		enterRule(_localctx, 202, RULE_tab_generate_func);
		try {
			setState(2879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EXPLODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2861);
				match(T_EXPLODE);
				setState(2862);
				match(T_OPEN_P);
				setState(2863);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(2864);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("EXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_POSEXPLODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2867);
				match(T_POSEXPLODE);
				setState(2868);
				match(T_OPEN_P);
				setState(2869);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(2870);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("POSEXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_INLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2873);
				match(T_INLINE);
				setState(2874);
				match(T_OPEN_P);
				setState(2875);
				((Tab_generate_funcContext)_localctx).expr = expr(0);
				setState(2876);
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
		public TerminalNode T_E() { return getToken(HiveParser.T_E, 0); }
		public TerminalNode T_PI() { return getToken(HiveParser.T_PI, 0); }
		public TerminalNode T_FACTORIAL() { return getToken(HiveParser.T_FACTORIAL, 0); }
		public TerminalNode T_CBRT() { return getToken(HiveParser.T_CBRT, 0); }
		public Math_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_func; }
	}

	public final Math_funcContext math_func() throws RecognitionException {
		Math_funcContext _localctx = new Math_funcContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_math_func);
		int _la;
		try {
			setState(3091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2881);
				match(T_ROUND);
				setState(2882);
				match(T_OPEN_P);
				setState(2883);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2884);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ROUND", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2887);
				match(T_ROUND);
				setState(2888);
				match(T_OPEN_P);
				setState(2889);
				((Math_funcContext)_localctx).fst = expr(0);
				setState(2890);
				match(T_COMMA);
				setState(2891);
				((Math_funcContext)_localctx).snd = expr(0);
				setState(2892);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("ROUND", "expr", ((Math_funcContext)_localctx).fst.res, "decimal_places", ((Math_funcContext)_localctx).snd.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2895);
				match(T_FLOOR);
				setState(2896);
				match(T_OPEN_P);
				setState(2897);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2898);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FLOOR", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2901);
				_la = _input.LA(1);
				if ( !(_la==T_CEIL || _la==T_CEILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2902);
				match(T_OPEN_P);
				setState(2903);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2904);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("CEIL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2907);
				((Math_funcContext)_localctx).T_RAND = match(T_RAND);
				setState(2908);
				match(T_OPEN_P);
				setState(2909);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func((((Math_funcContext)_localctx).T_RAND!=null?((Math_funcContext)_localctx).T_RAND.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2911);
				match(T_RAND);
				setState(2912);
				match(T_OPEN_P);
				setState(2913);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2914);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RAND", "seed", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2917);
				match(T_EXP);
				setState(2918);
				match(T_OPEN_P);
				setState(2919);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2920);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("EXP", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2923);
				match(T_LN);
				setState(2924);
				match(T_OPEN_P);
				setState(2925);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2926);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2929);
				match(T_LOG10);
				setState(2930);
				match(T_OPEN_P);
				setState(2931);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2932);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG10", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2935);
				match(T_LOG2);
				setState(2936);
				match(T_OPEN_P);
				setState(2937);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2938);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG2", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2941);
				match(T_LOG);
				setState(2942);
				match(T_OPEN_P);
				setState(2943);
				((Math_funcContext)_localctx).base = expr(0);
				setState(2944);
				match(T_COMMA);
				setState(2945);
				((Math_funcContext)_localctx).e = expr(0);
				setState(2946);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("LOG", "base", ((Math_funcContext)_localctx).base.res, "expr", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2949);
				_la = _input.LA(1);
				if ( !(_la==T_POW || _la==T_POWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2950);
				match(T_OPEN_P);
				setState(2951);
				((Math_funcContext)_localctx).base = expr(0);
				setState(2952);
				match(T_COMMA);
				setState(2953);
				((Math_funcContext)_localctx).e = expr(0);
				setState(2954);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("POWER", "base", ((Math_funcContext)_localctx).base.res, "exp", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2957);
				match(T_SQRT);
				setState(2958);
				match(T_OPEN_P);
				setState(2959);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2960);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SQRT", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2963);
				match(T_BIN);
				setState(2964);
				match(T_OPEN_P);
				setState(2965);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2966);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("BIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2969);
				match(T_HEX);
				setState(2970);
				match(T_OPEN_P);
				setState(2971);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2972);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("HEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2975);
				match(T_UNHEX);
				setState(2976);
				match(T_OPEN_P);
				setState(2977);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2978);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("UNHEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2981);
				match(T_CONV);
				setState(2982);
				match(T_OPEN_P);
				setState(2983);
				((Math_funcContext)_localctx).e = expr(0);
				setState(2984);
				match(T_COMMA);
				setState(2985);
				((Math_funcContext)_localctx).fbase = expr(0);
				setState(2986);
				match(T_COMMA);
				setState(2987);
				((Math_funcContext)_localctx).tbase = expr(0);
				setState(2988);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_three_param_func("CONV", "expr", ((Math_funcContext)_localctx).e.res, "from_base", ((Math_funcContext)_localctx).fbase.res, "to_base", ((Math_funcContext)_localctx).tbase.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2991);
				match(T_ABS);
				setState(2992);
				match(T_OPEN_P);
				setState(2993);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(2994);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ABS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2997);
				match(T_PMOD);
				setState(2998);
				match(T_OPEN_P);
				setState(2999);
				((Math_funcContext)_localctx).a = expr(0);
				setState(3000);
				match(T_COMMA);
				setState(3001);
				((Math_funcContext)_localctx).b = expr(0);
				setState(3002);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("PMOD", "a", ((Math_funcContext)_localctx).a.res, "b", ((Math_funcContext)_localctx).b.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3005);
				match(T_SIN);
				setState(3006);
				match(T_OPEN_P);
				setState(3007);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3008);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(3011);
				match(T_ASIN);
				setState(3012);
				match(T_OPEN_P);
				setState(3013);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3014);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ASIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(3017);
				match(T_COS);
				setState(3018);
				match(T_OPEN_P);
				setState(3019);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3020);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("COS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(3023);
				match(T_ACOS);
				setState(3024);
				match(T_OPEN_P);
				setState(3025);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3026);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ACOS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(3029);
				match(T_TAN);
				setState(3030);
				match(T_OPEN_P);
				setState(3031);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3032);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("TAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(3035);
				match(T_ATAN);
				setState(3036);
				match(T_OPEN_P);
				setState(3037);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3038);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ATAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(3041);
				match(T_DEGREES);
				setState(3042);
				match(T_OPEN_P);
				setState(3043);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3044);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("DEGREES", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(3047);
				match(T_RADIANS);
				setState(3048);
				match(T_OPEN_P);
				setState(3049);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3050);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RADIANS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(3053);
				match(T_POSITIVE);
				setState(3054);
				match(T_OPEN_P);
				setState(3055);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3056);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("POSITIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(3059);
				match(T_NEGATIVE);
				setState(3060);
				match(T_OPEN_P);
				setState(3061);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3062);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("NEGATIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(3065);
				match(T_SIGN);
				setState(3066);
				match(T_OPEN_P);
				setState(3067);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3068);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIGN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(3071);
				match(T_E);
				setState(3072);
				match(T_OPEN_P);
				setState(3073);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("EULER_CONST"); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(3075);
				match(T_PI);
				setState(3076);
				match(T_OPEN_P);
				setState(3077);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("PI_CONST"); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(3079);
				match(T_FACTORIAL);
				setState(3080);
				match(T_OPEN_P);
				setState(3081);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3082);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FACTORIAL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(3085);
				match(T_CBRT);
				setState(3086);
				match(T_OPEN_P);
				setState(3087);
				((Math_funcContext)_localctx).expr = expr(0);
				setState(3088);
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

	public static class Generic_functionContext extends ParserRuleContext {
		public json res;
		public Complex_atom_nameContext database_name;
		public Complex_atom_nameContext function_name;
		public Expr_listContext expr_list;
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public List<Complex_atom_nameContext> complex_atom_name() {
			return getRuleContexts(Complex_atom_nameContext.class);
		}
		public Complex_atom_nameContext complex_atom_name(int i) {
			return getRuleContext(Complex_atom_nameContext.class,i);
		}
		public Generic_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_function; }
	}

	public final Generic_functionContext generic_function() throws RecognitionException {
		Generic_functionContext _localctx = new Generic_functionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_generic_function);
		try {
			setState(3103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3093);
				((Generic_functionContext)_localctx).database_name = complex_atom_name();
				setState(3094);
				match(T__1);
				setState(3095);
				((Generic_functionContext)_localctx).function_name = complex_atom_name();
				setState(3096);
				((Generic_functionContext)_localctx).expr_list = expr_list();
				 ((Generic_functionContext)_localctx).res =  hql_generic_function(((Generic_functionContext)_localctx).database_name.res, ((Generic_functionContext)_localctx).function_name.res, ((Generic_functionContext)_localctx).expr_list.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3099);
				((Generic_functionContext)_localctx).function_name = complex_atom_name();
				setState(3100);
				((Generic_functionContext)_localctx).expr_list = expr_list();
				 ((Generic_functionContext)_localctx).res =  hql_generic_function(database_now, ((Generic_functionContext)_localctx).function_name.res, ((Generic_functionContext)_localctx).expr_list.res); 
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
		enterRule(_localctx, 208, RULE_literal_values);
		try {
			setState(3121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3105);
				((Literal_valuesContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_string_type((((Literal_valuesContext)_localctx).STRING_LITERAL!=null?((Literal_valuesContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3107);
				((Literal_valuesContext)_localctx).DECIMAL_LITERAL = match(DECIMAL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_decimal_type((((Literal_valuesContext)_localctx).DECIMAL_LITERAL!=null?((Literal_valuesContext)_localctx).DECIMAL_LITERAL.getText():null)); 
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(3109);
				((Literal_valuesContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_int_type((((Literal_valuesContext)_localctx).INT_LITERAL!=null?((Literal_valuesContext)_localctx).INT_LITERAL.getText():null)); 
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(3111);
				((Literal_valuesContext)_localctx).BOOL_LITERAL = match(BOOL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_boolean_type((((Literal_valuesContext)_localctx).BOOL_LITERAL!=null?((Literal_valuesContext)_localctx).BOOL_LITERAL.getText():null)); 
				}
				break;
			case NULL_CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(3113);
				match(NULL_CONST);
				 ((Literal_valuesContext)_localctx).res =  hql_null_constant(); 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(3115);
				((Literal_valuesContext)_localctx).date_literal = date_literal();
				 ((Literal_valuesContext)_localctx).res =  hql_type_date_literal(((Literal_valuesContext)_localctx).date_literal.res); 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(3118);
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
		enterRule(_localctx, 210, RULE_ident);
		try {
			setState(3141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(3123);
				((IdentContext)_localctx).database = name_identifier();
				setState(3124);
				match(T__1);
				}
				{
				setState(3126);
				((IdentContext)_localctx).tablename = name_identifier();
				setState(3127);
				match(T__1);
				}
				setState(3129);
				((IdentContext)_localctx).field = name_identifier();
				 ((IdentContext)_localctx).res =  hql_type_identifier(((IdentContext)_localctx).database.res, ((IdentContext)_localctx).tablename.res, ((IdentContext)_localctx).field.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(3132);
				((IdentContext)_localctx).tablename = name_identifier();
				setState(3133);
				match(T__1);
				}
				setState(3135);
				((IdentContext)_localctx).field = name_identifier();
				 ((IdentContext)_localctx).res =  hql_type_identifier(string(), ((IdentContext)_localctx).tablename.res, ((IdentContext)_localctx).field.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3138);
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
		public Complex_nameContext database;
		public Complex_nameContext tablename;
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
		enterRule(_localctx, 212, RULE_tab_ident);
		try {
			setState(3151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3143);
				((Tab_identContext)_localctx).database = complex_name();
				setState(3144);
				match(T__1);
				setState(3145);
				((Tab_identContext)_localctx).tablename = complex_name();
				 ((Tab_identContext)_localctx).res =  hql_type_table_identifier(((Tab_identContext)_localctx).database.res, ((Tab_identContext)_localctx).tablename.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3148);
				((Tab_identContext)_localctx).tablename = complex_name();
				 ((Tab_identContext)_localctx).res =  hql_type_table_identifier(database_now, ((Tab_identContext)_localctx).tablename.res); 
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
		public Use_varContext use_var;
		public List<Complex_atom_nameContext> complex_atom_name() {
			return getRuleContexts(Complex_atom_nameContext.class);
		}
		public Complex_atom_nameContext complex_atom_name(int i) {
			return getRuleContext(Complex_atom_nameContext.class,i);
		}
		public Use_varContext use_var() {
			return getRuleContext(Use_varContext.class,0);
		}
		public Complex_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_name; }
	}

	public final Complex_nameContext complex_name() throws RecognitionException {
		Complex_nameContext _localctx = new Complex_nameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_complex_name);
		try {
			int _alt;
			setState(3166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3153);
				((Complex_nameContext)_localctx).complex_atom_name = complex_atom_name();
				 ((Complex_nameContext)_localctx).res =  ((Complex_nameContext)_localctx).complex_atom_name.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				vector<Complex_atom_nameContext*> name_list; 
				setState(3160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3157);
						((Complex_nameContext)_localctx).complex_atom_name = complex_atom_name();
						((Complex_nameContext)_localctx).name_list.add(((Complex_nameContext)_localctx).complex_atom_name);
						}
						} 
					}
					setState(3162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				}
				setState(3163);
				((Complex_nameContext)_localctx).use_var = use_var();

				        string result = "";
				        for(Complex_atom_nameContext* name_ctxt:((Complex_nameContext)_localctx).name_list)
				            result+=name_ctxt->res;
				        result += remove_quotes(to_string(((Complex_nameContext)_localctx).use_var.res["value"]));
				        ((Complex_nameContext)_localctx).res =  result;
				    
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
		enterRule(_localctx, 216, RULE_complex_atom_name);
		try {
			setState(3174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AND:
			case T_BINARY:
			case T_CAST:
			case T_END:
			case T_IF:
			case T_OR:
			case T_EXTRACT:
			case T_FLOOR:
			case T_ADD_W:
			case T_ADMIN:
			case T_AFTER:
			case T_ANALYZE:
			case T_ARCHIVE:
			case T_ASC:
			case T_AUTOCOMMIT:
			case T_BEFORE:
			case T_BUCKET:
			case T_BUCKETS:
			case T_CASCADE:
			case T_CHANGE:
			case T_CLUSTER:
			case T_CLUSTERED:
			case T_CLUSTERSTATUS:
			case T_COLLECTION:
			case T_COLUMNS:
			case T_COMMENT:
			case T_COMPACT:
			case T_COMPACTIONS:
			case T_COMPUTE:
			case T_CONCATENATE:
			case T_CONTINUE:
			case T_DATA:
			case T_DATABASES:
			case T_DATETIME:
			case T_DAY:
			case T_DBPROPERTIES:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DELIMITED:
			case T_DEPENDENCY:
			case T_DESC:
			case T_DIRECTORIES:
			case T_DIRECTORY:
			case T_DISABLE:
			case T_DISTRIBUTE:
			case T_ELEM_TYPE:
			case T_ENABLE:
			case T_ESCAPED:
			case T_EXCLUSIVE:
			case T_EXPLAIN:
			case T_EXPORT:
			case T_FIELDS:
			case T_FILE:
			case T_FILEFORMAT:
			case T_FIRST:
			case T_FORMAT:
			case T_FORMATTED:
			case T_FUNCTIONS:
			case T_HOLD_DDLTIME:
			case T_HOUR:
			case T_IDXPROPERTIES:
			case T_IGNORE:
			case T_INDEX:
			case T_INDEXES:
			case T_INPATH:
			case T_INPUTDRIVER:
			case T_INPUTFORMAT:
			case T_ITEMS:
			case T_JAR:
			case T_KEYS:
			case T_KEY_TYPE:
			case T_LIMIT:
			case T_LINES:
			case T_LOAD:
			case T_LOCATION:
			case T_LOCK:
			case T_LOCKS:
			case T_LOGICAL:
			case T_LONG:
			case T_MAPJOIN:
			case T_MATERIALIZED:
			case T_METADATA:
			case T_MINUS:
			case T_MINUTE:
			case T_MONTH:
			case T_MSCK:
			case T_NOSCAN:
			case T_NO_DROP:
			case T_OFFLINE:
			case T_OPTION:
			case T_OUTPUTDRIVER:
			case T_OUTPUTFORMAT:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PARTITIONED:
			case T_PARTITIONS:
			case T_PLUS:
			case T_PRETTY:
			case T_PRINCIPALS:
			case T_PROTECTION:
			case T_PURGE:
			case T_READ:
			case T_READONLY:
			case T_REBUILD:
			case T_RECORDREADER:
			case T_RECORDWRITER:
			case T_RELOAD:
			case T_RENAME:
			case T_REPAIR:
			case T_REPLACE:
			case T_REPLICATION:
			case T_RESTRICT:
			case T_REWRITE:
			case T_ROLE:
			case T_ROLES:
			case T_SCHEMA:
			case T_SCHEMAS:
			case T_SECOND:
			case T_SEMI:
			case T_SERDE:
			case T_SERDEPROPERTIES:
			case T_SERVER:
			case T_SETS:
			case T_SHARED:
			case T_SHOW:
			case T_SHOW_DATABASE:
			case T_SKEWED:
			case T_SORT:
			case T_SORTED:
			case T_SSL:
			case T_STATISTICS:
			case T_STORED:
			case T_STREAMTABLE:
			case T_STRING:
			case T_STRUCT:
			case T_TABLES:
			case T_TBLPROPERTIES:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TINYINT:
			case T_TOUCH:
			case T_TRANSACTIONS:
			case T_UNARCHIVE:
			case T_UNDO:
			case T_UNIONTYPE:
			case T_UNLOCK:
			case T_UNSET:
			case T_UNSIGNED:
			case T_URI:
			case T_USE:
			case T_UTC:
			case T_UTCTIMESTAMP:
			case T_VALUE_TYPE:
			case T_VIEW:
			case T_WHILE:
			case T_YEAR:
			case T_ISOLATION:
			case T_LEVEL:
			case T_OFFSET:
			case T_SNAPSHOT:
			case T_TRANSACTION:
			case T_WORK:
			case T_WRITE:
			case T_ABORT:
			case T_KEY:
			case T_LAST:
			case T_NORELY:
			case T_NOVALIDATE:
			case T_NULLS:
			case T_RELY:
			case T_VALIDATE:
			case T_DETAIL:
			case T_DOW:
			case T_EXPRESSION:
			case T_OPERATOR:
			case T_QUARTER:
			case T_SUMMARY:
			case T_VECTORIZATION:
			case T_WEEK:
			case T_YEARS:
			case T_MONTHS:
			case T_WEEKS:
			case T_DAYS:
			case T_HOURS:
			case T_MINUTES:
			case T_SECONDS:
			case T_TIMESTAMPTZ:
			case T_ZONE:
			case T_COVAR_POP:
			case T_BROUND:
			case T_CURRENT_USER:
			case T_LPAD:
			case T_UNHEX:
			case T_PI:
			case T_STAR:
			case T_REGEXP_REPLACE:
			case T_ASCII:
			case T_GET_JSON_OBJECT:
			case T_COS:
			case T_REGR_SXX:
			case T_WIDTH_BUCKET:
			case T_REPEAT:
			case T_ASIN:
			case T_NULLIF:
			case T_CONTEXT_NGRAMS:
			case T_MASK_HASH:
			case T_PARENT:
			case T_STR_TO_MAP:
			case T_SIN:
			case T_UNBASE64:
			case T_COUNT:
			case T_IN_FILE:
			case T_CONV:
			case T_SIGN:
			case T_REGR_COUNT:
			case T_SQRT:
			case T_REGR_INTERCEPT:
			case T_UNIX_TIMESTAMP:
			case T_MASK_LAST_N:
			case T_AES_ENCRYPT:
			case T_MASK_FIRST_N:
			case T_REVERSE:
			case T_NEXT_DAY:
			case T_HISTOGRAM_NUMERIC:
			case T_TRUNC:
			case T_SHIFTRIGHT:
			case T_ADD_MONTHS:
			case T_MAX:
			case T_DATE_SUB:
			case T_UNARY:
			case T_LN:
			case T_OCTET_LENGTH:
			case T_EXP:
			case T_FIELD:
			case T_NTILE:
			case T_COLLECT_LIST:
			case T_RTRIM:
			case T_LTRIM:
			case T_REFLECT:
			case T_SHA2:
			case T_PRINTF:
			case T_CEIL:
			case T_CEILING:
			case T_CONCAT:
			case T_NVL:
			case T_MD5:
			case T_ISNULL:
			case T_PARSE_URL:
			case T_CBRT:
			case T_VARIANCE:
			case T_VAR_POP:
			case T_DEGREES:
			case T_RADIANS:
			case T_LEAST:
			case T_BUILDVERSION:
			case T_SUBSTR:
			case T_SUBSTRING:
			case T_SIZE:
			case T_POSITIVE:
			case T_FROM_UNIXTIME:
			case T_CHR:
			case T_PERCENTILE_APPROX:
			case T_ASSERT_TRUE:
			case T_MONTHS_BETWEEN:
			case T_INITCAP:
			case T_ACOS:
			case T_WEEKOFYEAR:
			case T_LAST_DAY:
			case T_CHARACTER_LENGTH:
			case T_SUBSTRING_INDEX:
			case T_TRANSLATE:
			case T_LEVENSHTEIN:
			case T_COVAR_SAMP:
			case T_DATEDIFF:
			case T_LOG:
			case T_NGRAMS:
			case T_LENGTH:
			case T_REGR_AVGX:
			case T_FIND_IN_SET:
			case T_XOR:
			case T_NEGATIVE:
			case T_DATE_ADD:
			case T_PARSE_URL_TUPLE:
			case T_CONCAT_WS:
			case T_ELT:
			case T_LOGGED_IN_USER:
			case T_MAP_VALUES:
			case T_JAVA_METHOD:
			case T_MAP_KEYS:
			case T_CORR:
			case T_SORT_ARRAY:
			case T_SHIFTRIGHTUNSIGNED:
			case T_AES_DECRYPT:
			case T_SHA1:
			case T_SHA:
			case T_AVG:
			case T_CURRENT_DATABASE:
			case T_ARRAY_CONTAINS:
			case T_FROM_UTC_TIMESTAMP:
			case T_DECODE:
			case T_ABS:
			case T_EXPLODE:
			case T_E:
			case T_SUM:
			case T_COALESCE:
			case T_LOWER:
			case T_LCASE:
			case T_ENCODE:
			case T_VAR_SAMP:
			case T_INLINE:
			case T_SPACE:
			case T_HASH:
			case T_ROUND:
			case T_SPLIT:
			case T_BASE64:
			case T_TO_UTC_TIMESTAMP:
			case T_REGEXP_EXTRACT:
			case T_CRC32:
			case T_HEX:
			case T_REGR_SYY:
			case T_UPPER:
			case T_UCASE:
			case T_STDDEV_POP:
			case T_DATE_FORMAT:
			case T_REGR_R2:
			case T_ATAN:
			case T_MIN:
			case T_POSEXPLODE:
			case T_BRACKET_OP:
			case T_PMOD:
			case T_POW:
			case T_LAG:
			case T_LEAD:
			case T_POWER:
			case T_SENTENCES:
			case T_MASK_SHOW_FIRST_N:
			case T_SOUNDEX:
			case T_SURROGATE_KEY:
			case T_SHIFTLEFT:
			case T_PERCENTILE:
			case T_TO_DATE:
			case T_REGR_AVGY:
			case T_RPAD:
			case T_FACTORIAL:
			case T_COLLECT_SET:
			case T_BEGINNING:
			case T_VERSION:
			case T_STACK:
			case T_BIN:
			case T_TAN:
			case T_TRIM:
			case T_REGR_SLOPE:
			case T_MASK:
			case T_MASK_SHOW_LAST_N:
			case T_INSTR:
			case T_GREATEST:
			case T_REGR_SXY:
			case T_FORMAT_NUMBER:
			case T_LOCATE:
			case T_STDDEV_SAMP:
			case T_RAND:
			case T_LOG2:
			case T_LOG10:
			case T_JSON_TUPLE:
			case T_QUOTE:
			case T_SYSDATE:
			case T_XPATH:
			case T_XPATH_BOOLEAN:
			case T_XPATH_DOUBLE:
			case T_XPATH_FLOAT:
			case T_XPATH_INT:
			case T_XPATH_LONG:
			case T_XPATH_NUMBER:
			case T_XPATH_SHORT:
			case T_XPATH_STRING:
			case T_FIELD_IN_SET:
			case T_GET_JSON_OBJECTS:
			case T_IN_STR:
			case T_NAMED_STRUCT:
			case T_RANK:
			case T_DENSE_RANK:
			case T_ROW_NUMBER:
			case T_CUME_DIST:
			case T_PERCENT_RANK:
			case T_UNIQUE:
			case T_CHECK:
			case T_DEFAULT:
			case T_SEQUENCEFILE:
			case T_TEXTFILE:
			case T_RCFILE:
			case T_ORC:
			case T_PARQUET:
			case T_AVRO:
			case T_JSONFILE:
			case T_HIVECONF:
			case T_HIVEVAR:
			case T_BYTE:
			case T_EXIT:
			case T_EQUAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(3168);
				((Complex_atom_nameContext)_localctx).name_identifier = name_identifier();
				 ((Complex_atom_nameContext)_localctx).res =  ((Complex_atom_nameContext)_localctx).name_identifier.res; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(3171);
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
		enterRule(_localctx, 218, RULE_name_identifier);
		try {
			setState(3181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(3176);
				((Name_identifierContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Name_identifierContext)_localctx).res =  (((Name_identifierContext)_localctx).IDENTIFIER!=null?((Name_identifierContext)_localctx).IDENTIFIER.getText():null); 
				}
				break;
			case T_AND:
			case T_BINARY:
			case T_CAST:
			case T_END:
			case T_IF:
			case T_OR:
			case T_EXTRACT:
			case T_FLOOR:
			case T_ADD_W:
			case T_ADMIN:
			case T_AFTER:
			case T_ANALYZE:
			case T_ARCHIVE:
			case T_ASC:
			case T_AUTOCOMMIT:
			case T_BEFORE:
			case T_BUCKET:
			case T_BUCKETS:
			case T_CASCADE:
			case T_CHANGE:
			case T_CLUSTER:
			case T_CLUSTERED:
			case T_CLUSTERSTATUS:
			case T_COLLECTION:
			case T_COLUMNS:
			case T_COMMENT:
			case T_COMPACT:
			case T_COMPACTIONS:
			case T_COMPUTE:
			case T_CONCATENATE:
			case T_CONTINUE:
			case T_DATA:
			case T_DATABASES:
			case T_DATETIME:
			case T_DAY:
			case T_DBPROPERTIES:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DELIMITED:
			case T_DEPENDENCY:
			case T_DESC:
			case T_DIRECTORIES:
			case T_DIRECTORY:
			case T_DISABLE:
			case T_DISTRIBUTE:
			case T_ELEM_TYPE:
			case T_ENABLE:
			case T_ESCAPED:
			case T_EXCLUSIVE:
			case T_EXPLAIN:
			case T_EXPORT:
			case T_FIELDS:
			case T_FILE:
			case T_FILEFORMAT:
			case T_FIRST:
			case T_FORMAT:
			case T_FORMATTED:
			case T_FUNCTIONS:
			case T_HOLD_DDLTIME:
			case T_HOUR:
			case T_IDXPROPERTIES:
			case T_IGNORE:
			case T_INDEX:
			case T_INDEXES:
			case T_INPATH:
			case T_INPUTDRIVER:
			case T_INPUTFORMAT:
			case T_ITEMS:
			case T_JAR:
			case T_KEYS:
			case T_KEY_TYPE:
			case T_LIMIT:
			case T_LINES:
			case T_LOAD:
			case T_LOCATION:
			case T_LOCK:
			case T_LOCKS:
			case T_LOGICAL:
			case T_LONG:
			case T_MAPJOIN:
			case T_MATERIALIZED:
			case T_METADATA:
			case T_MINUS:
			case T_MINUTE:
			case T_MONTH:
			case T_MSCK:
			case T_NOSCAN:
			case T_NO_DROP:
			case T_OFFLINE:
			case T_OPTION:
			case T_OUTPUTDRIVER:
			case T_OUTPUTFORMAT:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PARTITIONED:
			case T_PARTITIONS:
			case T_PLUS:
			case T_PRETTY:
			case T_PRINCIPALS:
			case T_PROTECTION:
			case T_PURGE:
			case T_READ:
			case T_READONLY:
			case T_REBUILD:
			case T_RECORDREADER:
			case T_RECORDWRITER:
			case T_RELOAD:
			case T_RENAME:
			case T_REPAIR:
			case T_REPLACE:
			case T_REPLICATION:
			case T_RESTRICT:
			case T_REWRITE:
			case T_ROLE:
			case T_ROLES:
			case T_SCHEMA:
			case T_SCHEMAS:
			case T_SECOND:
			case T_SEMI:
			case T_SERDE:
			case T_SERDEPROPERTIES:
			case T_SERVER:
			case T_SETS:
			case T_SHARED:
			case T_SHOW:
			case T_SHOW_DATABASE:
			case T_SKEWED:
			case T_SORT:
			case T_SORTED:
			case T_SSL:
			case T_STATISTICS:
			case T_STORED:
			case T_STREAMTABLE:
			case T_STRING:
			case T_STRUCT:
			case T_TABLES:
			case T_TBLPROPERTIES:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TINYINT:
			case T_TOUCH:
			case T_TRANSACTIONS:
			case T_UNARCHIVE:
			case T_UNDO:
			case T_UNIONTYPE:
			case T_UNLOCK:
			case T_UNSET:
			case T_UNSIGNED:
			case T_URI:
			case T_USE:
			case T_UTC:
			case T_UTCTIMESTAMP:
			case T_VALUE_TYPE:
			case T_VIEW:
			case T_WHILE:
			case T_YEAR:
			case T_ISOLATION:
			case T_LEVEL:
			case T_OFFSET:
			case T_SNAPSHOT:
			case T_TRANSACTION:
			case T_WORK:
			case T_WRITE:
			case T_ABORT:
			case T_KEY:
			case T_LAST:
			case T_NORELY:
			case T_NOVALIDATE:
			case T_NULLS:
			case T_RELY:
			case T_VALIDATE:
			case T_DETAIL:
			case T_DOW:
			case T_EXPRESSION:
			case T_OPERATOR:
			case T_QUARTER:
			case T_SUMMARY:
			case T_VECTORIZATION:
			case T_WEEK:
			case T_YEARS:
			case T_MONTHS:
			case T_WEEKS:
			case T_DAYS:
			case T_HOURS:
			case T_MINUTES:
			case T_SECONDS:
			case T_TIMESTAMPTZ:
			case T_ZONE:
			case T_COVAR_POP:
			case T_BROUND:
			case T_CURRENT_USER:
			case T_LPAD:
			case T_UNHEX:
			case T_PI:
			case T_STAR:
			case T_REGEXP_REPLACE:
			case T_ASCII:
			case T_GET_JSON_OBJECT:
			case T_COS:
			case T_REGR_SXX:
			case T_WIDTH_BUCKET:
			case T_REPEAT:
			case T_ASIN:
			case T_NULLIF:
			case T_CONTEXT_NGRAMS:
			case T_MASK_HASH:
			case T_PARENT:
			case T_STR_TO_MAP:
			case T_SIN:
			case T_UNBASE64:
			case T_COUNT:
			case T_IN_FILE:
			case T_CONV:
			case T_SIGN:
			case T_REGR_COUNT:
			case T_SQRT:
			case T_REGR_INTERCEPT:
			case T_UNIX_TIMESTAMP:
			case T_MASK_LAST_N:
			case T_AES_ENCRYPT:
			case T_MASK_FIRST_N:
			case T_REVERSE:
			case T_NEXT_DAY:
			case T_HISTOGRAM_NUMERIC:
			case T_TRUNC:
			case T_SHIFTRIGHT:
			case T_ADD_MONTHS:
			case T_MAX:
			case T_DATE_SUB:
			case T_UNARY:
			case T_LN:
			case T_OCTET_LENGTH:
			case T_EXP:
			case T_FIELD:
			case T_NTILE:
			case T_COLLECT_LIST:
			case T_RTRIM:
			case T_LTRIM:
			case T_REFLECT:
			case T_SHA2:
			case T_PRINTF:
			case T_CEIL:
			case T_CEILING:
			case T_CONCAT:
			case T_NVL:
			case T_MD5:
			case T_ISNULL:
			case T_PARSE_URL:
			case T_CBRT:
			case T_VARIANCE:
			case T_VAR_POP:
			case T_DEGREES:
			case T_RADIANS:
			case T_LEAST:
			case T_BUILDVERSION:
			case T_SUBSTR:
			case T_SUBSTRING:
			case T_SIZE:
			case T_POSITIVE:
			case T_FROM_UNIXTIME:
			case T_CHR:
			case T_PERCENTILE_APPROX:
			case T_ASSERT_TRUE:
			case T_MONTHS_BETWEEN:
			case T_INITCAP:
			case T_ACOS:
			case T_WEEKOFYEAR:
			case T_LAST_DAY:
			case T_CHARACTER_LENGTH:
			case T_SUBSTRING_INDEX:
			case T_TRANSLATE:
			case T_LEVENSHTEIN:
			case T_COVAR_SAMP:
			case T_DATEDIFF:
			case T_LOG:
			case T_NGRAMS:
			case T_LENGTH:
			case T_REGR_AVGX:
			case T_FIND_IN_SET:
			case T_XOR:
			case T_NEGATIVE:
			case T_DATE_ADD:
			case T_PARSE_URL_TUPLE:
			case T_CONCAT_WS:
			case T_ELT:
			case T_LOGGED_IN_USER:
			case T_MAP_VALUES:
			case T_JAVA_METHOD:
			case T_MAP_KEYS:
			case T_CORR:
			case T_SORT_ARRAY:
			case T_SHIFTRIGHTUNSIGNED:
			case T_AES_DECRYPT:
			case T_SHA1:
			case T_SHA:
			case T_AVG:
			case T_CURRENT_DATABASE:
			case T_ARRAY_CONTAINS:
			case T_FROM_UTC_TIMESTAMP:
			case T_DECODE:
			case T_ABS:
			case T_EXPLODE:
			case T_E:
			case T_SUM:
			case T_COALESCE:
			case T_LOWER:
			case T_LCASE:
			case T_ENCODE:
			case T_VAR_SAMP:
			case T_INLINE:
			case T_SPACE:
			case T_HASH:
			case T_ROUND:
			case T_SPLIT:
			case T_BASE64:
			case T_TO_UTC_TIMESTAMP:
			case T_REGEXP_EXTRACT:
			case T_CRC32:
			case T_HEX:
			case T_REGR_SYY:
			case T_UPPER:
			case T_UCASE:
			case T_STDDEV_POP:
			case T_DATE_FORMAT:
			case T_REGR_R2:
			case T_ATAN:
			case T_MIN:
			case T_POSEXPLODE:
			case T_BRACKET_OP:
			case T_PMOD:
			case T_POW:
			case T_LAG:
			case T_LEAD:
			case T_POWER:
			case T_SENTENCES:
			case T_MASK_SHOW_FIRST_N:
			case T_SOUNDEX:
			case T_SURROGATE_KEY:
			case T_SHIFTLEFT:
			case T_PERCENTILE:
			case T_TO_DATE:
			case T_REGR_AVGY:
			case T_RPAD:
			case T_FACTORIAL:
			case T_COLLECT_SET:
			case T_BEGINNING:
			case T_VERSION:
			case T_STACK:
			case T_BIN:
			case T_TAN:
			case T_TRIM:
			case T_REGR_SLOPE:
			case T_MASK:
			case T_MASK_SHOW_LAST_N:
			case T_INSTR:
			case T_GREATEST:
			case T_REGR_SXY:
			case T_FORMAT_NUMBER:
			case T_LOCATE:
			case T_STDDEV_SAMP:
			case T_RAND:
			case T_LOG2:
			case T_LOG10:
			case T_JSON_TUPLE:
			case T_QUOTE:
			case T_SYSDATE:
			case T_XPATH:
			case T_XPATH_BOOLEAN:
			case T_XPATH_DOUBLE:
			case T_XPATH_FLOAT:
			case T_XPATH_INT:
			case T_XPATH_LONG:
			case T_XPATH_NUMBER:
			case T_XPATH_SHORT:
			case T_XPATH_STRING:
			case T_FIELD_IN_SET:
			case T_GET_JSON_OBJECTS:
			case T_IN_STR:
			case T_NAMED_STRUCT:
			case T_RANK:
			case T_DENSE_RANK:
			case T_ROW_NUMBER:
			case T_CUME_DIST:
			case T_PERCENT_RANK:
			case T_UNIQUE:
			case T_CHECK:
			case T_DEFAULT:
			case T_SEQUENCEFILE:
			case T_TEXTFILE:
			case T_RCFILE:
			case T_ORC:
			case T_PARQUET:
			case T_AVRO:
			case T_JSONFILE:
			case T_HIVECONF:
			case T_HIVEVAR:
			case T_BYTE:
			case T_EXIT:
			case T_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3178);
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
		enterRule(_localctx, 220, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3183);
			match(T_DATE);
			setState(3184);
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
		enterRule(_localctx, 222, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3187);
			match(T_TIMESTAMP);
			setState(3188);
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
		enterRule(_localctx, 224, RULE_set_operators_is);
		try {
			setState(3196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3191);
				match(T_IS);
				 ((Set_operators_isContext)_localctx).res =  "IS"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3193);
				match(T_IS);
				setState(3194);
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
		enterRule(_localctx, 226, RULE_set_operators_like);
		try {
			setState(3207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3198);
				match(T_LIKE);
				 ((Set_operators_likeContext)_localctx).res =  "LIKE"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3200);
				match(T_NOT);
				setState(3201);
				match(T_LIKE);
				 ((Set_operators_likeContext)_localctx).res =  "NOT_LIKE"; 
				}
				break;
			case T_RLIKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3203);
				match(T_RLIKE);
				 ((Set_operators_likeContext)_localctx).res =  "RLIKE"; 
				}
				break;
			case T_REGEXP:
				enterOuterAlt(_localctx, 4);
				{
				setState(3205);
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
		enterRule(_localctx, 228, RULE_set_operators_in);
		try {
			setState(3214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(3209);
				match(T_IN);
				 ((Set_operators_inContext)_localctx).res =  "IN"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3211);
				match(T_NOT);
				setState(3212);
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
		enterRule(_localctx, 230, RULE_set_operators_exists);
		try {
			setState(3221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EXISTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(3216);
				match(T_EXISTS);
				 ((Set_operators_existsContext)_localctx).res =  "EXISTS"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3218);
				match(T_NOT);
				setState(3219);
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
		enterRule(_localctx, 232, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__10))) != 0) || _la==T_NOT) ) {
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

	public static class Reserved_wordsContext extends ParserRuleContext {
		public string res;
		public Token T_ALL;
		public Token T_ALTER;
		public Token T_AND;
		public Token T_ARRAY;
		public Token T_AS;
		public Token T_AUTHORIZATION;
		public Token T_BETWEEN;
		public Token T_BIGINT;
		public Token T_BINARY;
		public Token T_BOOLEAN;
		public Token T_BOTH;
		public Token T_BY;
		public Token T_CASE;
		public Token T_CAST;
		public Token T_CHAR;
		public Token T_COLUMN;
		public Token T_CONF;
		public Token T_CREATE;
		public Token T_CROSS;
		public Token T_CUBE;
		public Token T_CURRENT;
		public Token T_CURRENT_DATE;
		public Token T_CURRENT_TIMESTAMP;
		public Token T_CURSOR;
		public Token T_DATABASE;
		public Token T_DATE;
		public Token T_DECIMAL;
		public Token T_DELETE;
		public Token T_DESCRIBE;
		public Token T_DISTINCT;
		public Token T_DOUBLE;
		public Token T_DROP;
		public Token T_ELSE;
		public Token T_END;
		public Token T_EXCHANGE;
		public Token T_EXISTS;
		public Token T_EXTENDED;
		public Token T_EXTERNAL;
		public Token T_FALSE;
		public Token T_FETCH;
		public Token T_FLOAT;
		public Token T_FOLLOWING;
		public Token T_FOR;
		public Token T_FROM;
		public Token T_FULL;
		public Token T_FUNCTION;
		public Token T_GRANT;
		public Token T_GROUP;
		public Token T_GROUPING;
		public Token T_HAVING;
		public Token T_IF;
		public Token T_IMPORT;
		public Token T_IN;
		public Token T_INNER;
		public Token T_INSERT;
		public Token T_INT;
		public Token T_INTERSECT;
		public Token T_INTERVAL;
		public Token T_INTO;
		public Token T_IS;
		public Token T_JOIN;
		public Token T_LATERAL;
		public Token T_LEFT;
		public Token T_LESS;
		public Token T_LIKE;
		public Token T_LOCAL;
		public Token T_MACRO;
		public Token T_MAP;
		public Token T_MORE;
		public Token T_NONE;
		public Token T_NOT;
		public Token T_NULL;
		public Token T_OF;
		public Token T_ON;
		public Token T_OR;
		public Token T_ORDER;
		public Token T_OUT;
		public Token T_OUTER;
		public Token T_OVER;
		public Token T_PARTIALSCAN;
		public Token T_PARTITION;
		public Token T_PERCENT;
		public Token T_PRECEDING;
		public Token T_PRESERVE;
		public Token T_PROCEDURE;
		public Token T_RANGE;
		public Token T_READS;
		public Token T_REDUCE;
		public Token T_REVOKE;
		public Token T_RIGHT;
		public Token T_ROLLUP;
		public Token T_ROW;
		public Token T_ROWS;
		public Token T_SELECT;
		public Token T_SET;
		public Token T_SMALLINT;
		public Token T_TABLE;
		public Token T_TABLESAMPLE;
		public Token T_THEN;
		public Token T_TIMESTAMP;
		public Token T_TO;
		public Token T_TRANSFORM;
		public Token T_TRIGGER;
		public Token T_TRUE;
		public Token T_TRUNCATE;
		public Token T_UNBOUNDED;
		public Token T_UNION;
		public Token T_UNIQUEJOIN;
		public Token T_UPDATE;
		public Token T_USER;
		public Token T_USING;
		public Token T_UTC_TMESTAMP;
		public Token T_VALUES;
		public Token T_VARCHAR;
		public Token T_WHEN;
		public Token T_WHERE;
		public Token T_WINDOW;
		public Token T_WITH;
		public Token T_COMMIT;
		public Token T_ONLY;
		public Token T_REGEXP;
		public Token T_RLIKE;
		public Token T_ROLLBACK;
		public Token T_START;
		public Token T_CACHE;
		public Token T_CONSTRAINT;
		public Token T_FOREIGN;
		public Token T_PRIMARY;
		public Token T_REFERENCES;
		public Token T_DAYOFWEEK;
		public Token T_EXTRACT;
		public Token T_FLOOR;
		public Token T_INTEGER;
		public Token T_PRECISION;
		public Token T_VIEWS;
		public Token T_TIME;
		public Token T_NUMERIC;
		public Token T_SYNC;
		public TerminalNode T_ALL() { return getToken(HiveParser.T_ALL, 0); }
		public TerminalNode T_ALTER() { return getToken(HiveParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_ARRAY() { return getToken(HiveParser.T_ARRAY, 0); }
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public TerminalNode T_AUTHORIZATION() { return getToken(HiveParser.T_AUTHORIZATION, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HiveParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(HiveParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY() { return getToken(HiveParser.T_BINARY, 0); }
		public TerminalNode T_BOOLEAN() { return getToken(HiveParser.T_BOOLEAN, 0); }
		public TerminalNode T_BOTH() { return getToken(HiveParser.T_BOTH, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public TerminalNode T_CASE() { return getToken(HiveParser.T_CASE, 0); }
		public TerminalNode T_CAST() { return getToken(HiveParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(HiveParser.T_CHAR, 0); }
		public TerminalNode T_COLUMN() { return getToken(HiveParser.T_COLUMN, 0); }
		public TerminalNode T_CONF() { return getToken(HiveParser.T_CONF, 0); }
		public TerminalNode T_CREATE() { return getToken(HiveParser.T_CREATE, 0); }
		public TerminalNode T_CROSS() { return getToken(HiveParser.T_CROSS, 0); }
		public TerminalNode T_CUBE() { return getToken(HiveParser.T_CUBE, 0); }
		public TerminalNode T_CURRENT() { return getToken(HiveParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HiveParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HiveParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURSOR() { return getToken(HiveParser.T_CURSOR, 0); }
		public TerminalNode T_DATABASE() { return getToken(HiveParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(HiveParser.T_DATE, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HiveParser.T_DECIMAL, 0); }
		public TerminalNode T_DELETE() { return getToken(HiveParser.T_DELETE, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(HiveParser.T_DESCRIBE, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HiveParser.T_DISTINCT, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HiveParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(HiveParser.T_DROP, 0); }
		public TerminalNode T_ELSE() { return getToken(HiveParser.T_ELSE, 0); }
		public TerminalNode T_END() { return getToken(HiveParser.T_END, 0); }
		public TerminalNode T_EXCHANGE() { return getToken(HiveParser.T_EXCHANGE, 0); }
		public TerminalNode T_EXISTS() { return getToken(HiveParser.T_EXISTS, 0); }
		public TerminalNode T_EXTENDED() { return getToken(HiveParser.T_EXTENDED, 0); }
		public TerminalNode T_EXTERNAL() { return getToken(HiveParser.T_EXTERNAL, 0); }
		public TerminalNode T_FALSE() { return getToken(HiveParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(HiveParser.T_FETCH, 0); }
		public TerminalNode T_FLOAT() { return getToken(HiveParser.T_FLOAT, 0); }
		public TerminalNode T_FOLLOWING() { return getToken(HiveParser.T_FOLLOWING, 0); }
		public TerminalNode T_FOR() { return getToken(HiveParser.T_FOR, 0); }
		public TerminalNode T_FROM() { return getToken(HiveParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(HiveParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HiveParser.T_FUNCTION, 0); }
		public TerminalNode T_GRANT() { return getToken(HiveParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(HiveParser.T_GROUP, 0); }
		public TerminalNode T_GROUPING() { return getToken(HiveParser.T_GROUPING, 0); }
		public TerminalNode T_HAVING() { return getToken(HiveParser.T_HAVING, 0); }
		public TerminalNode T_IF() { return getToken(HiveParser.T_IF, 0); }
		public TerminalNode T_IMPORT() { return getToken(HiveParser.T_IMPORT, 0); }
		public TerminalNode T_IN() { return getToken(HiveParser.T_IN, 0); }
		public TerminalNode T_INNER() { return getToken(HiveParser.T_INNER, 0); }
		public TerminalNode T_INSERT() { return getToken(HiveParser.T_INSERT, 0); }
		public TerminalNode T_INT() { return getToken(HiveParser.T_INT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HiveParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(HiveParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(HiveParser.T_INTO, 0); }
		public TerminalNode T_IS() { return getToken(HiveParser.T_IS, 0); }
		public TerminalNode T_JOIN() { return getToken(HiveParser.T_JOIN, 0); }
		public TerminalNode T_LATERAL() { return getToken(HiveParser.T_LATERAL, 0); }
		public TerminalNode T_LEFT() { return getToken(HiveParser.T_LEFT, 0); }
		public TerminalNode T_LESS() { return getToken(HiveParser.T_LESS, 0); }
		public TerminalNode T_LIKE() { return getToken(HiveParser.T_LIKE, 0); }
		public TerminalNode T_LOCAL() { return getToken(HiveParser.T_LOCAL, 0); }
		public TerminalNode T_MACRO() { return getToken(HiveParser.T_MACRO, 0); }
		public TerminalNode T_MAP() { return getToken(HiveParser.T_MAP, 0); }
		public TerminalNode T_MORE() { return getToken(HiveParser.T_MORE, 0); }
		public TerminalNode T_NONE() { return getToken(HiveParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public TerminalNode T_NULL() { return getToken(HiveParser.T_NULL, 0); }
		public TerminalNode T_OF() { return getToken(HiveParser.T_OF, 0); }
		public TerminalNode T_ON() { return getToken(HiveParser.T_ON, 0); }
		public TerminalNode T_OR() { return getToken(HiveParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(HiveParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(HiveParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(HiveParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(HiveParser.T_OVER, 0); }
		public TerminalNode T_PARTIALSCAN() { return getToken(HiveParser.T_PARTIALSCAN, 0); }
		public TerminalNode T_PARTITION() { return getToken(HiveParser.T_PARTITION, 0); }
		public TerminalNode T_PERCENT() { return getToken(HiveParser.T_PERCENT, 0); }
		public TerminalNode T_PRECEDING() { return getToken(HiveParser.T_PRECEDING, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HiveParser.T_PRESERVE, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HiveParser.T_PROCEDURE, 0); }
		public TerminalNode T_RANGE() { return getToken(HiveParser.T_RANGE, 0); }
		public TerminalNode T_READS() { return getToken(HiveParser.T_READS, 0); }
		public TerminalNode T_REDUCE() { return getToken(HiveParser.T_REDUCE, 0); }
		public TerminalNode T_REVOKE() { return getToken(HiveParser.T_REVOKE, 0); }
		public TerminalNode T_RIGHT() { return getToken(HiveParser.T_RIGHT, 0); }
		public TerminalNode T_ROLLUP() { return getToken(HiveParser.T_ROLLUP, 0); }
		public TerminalNode T_ROW() { return getToken(HiveParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(HiveParser.T_ROWS, 0); }
		public TerminalNode T_SELECT() { return getToken(HiveParser.T_SELECT, 0); }
		public TerminalNode T_SET() { return getToken(HiveParser.T_SET, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HiveParser.T_SMALLINT, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveParser.T_TABLE, 0); }
		public TerminalNode T_TABLESAMPLE() { return getToken(HiveParser.T_TABLESAMPLE, 0); }
		public TerminalNode T_THEN() { return getToken(HiveParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HiveParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TO() { return getToken(HiveParser.T_TO, 0); }
		public TerminalNode T_TRANSFORM() { return getToken(HiveParser.T_TRANSFORM, 0); }
		public TerminalNode T_TRIGGER() { return getToken(HiveParser.T_TRIGGER, 0); }
		public TerminalNode T_TRUE() { return getToken(HiveParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(HiveParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNBOUNDED() { return getToken(HiveParser.T_UNBOUNDED, 0); }
		public TerminalNode T_UNION() { return getToken(HiveParser.T_UNION, 0); }
		public TerminalNode T_UNIQUEJOIN() { return getToken(HiveParser.T_UNIQUEJOIN, 0); }
		public TerminalNode T_UPDATE() { return getToken(HiveParser.T_UPDATE, 0); }
		public TerminalNode T_USER() { return getToken(HiveParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(HiveParser.T_USING, 0); }
		public TerminalNode T_UTC_TMESTAMP() { return getToken(HiveParser.T_UTC_TMESTAMP, 0); }
		public TerminalNode T_VALUES() { return getToken(HiveParser.T_VALUES, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HiveParser.T_VARCHAR, 0); }
		public TerminalNode T_WHEN() { return getToken(HiveParser.T_WHEN, 0); }
		public TerminalNode T_WHERE() { return getToken(HiveParser.T_WHERE, 0); }
		public TerminalNode T_WINDOW() { return getToken(HiveParser.T_WINDOW, 0); }
		public TerminalNode T_WITH() { return getToken(HiveParser.T_WITH, 0); }
		public TerminalNode T_COMMIT() { return getToken(HiveParser.T_COMMIT, 0); }
		public TerminalNode T_ONLY() { return getToken(HiveParser.T_ONLY, 0); }
		public TerminalNode T_REGEXP() { return getToken(HiveParser.T_REGEXP, 0); }
		public TerminalNode T_RLIKE() { return getToken(HiveParser.T_RLIKE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(HiveParser.T_ROLLBACK, 0); }
		public TerminalNode T_START() { return getToken(HiveParser.T_START, 0); }
		public TerminalNode T_CACHE() { return getToken(HiveParser.T_CACHE, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(HiveParser.T_CONSTRAINT, 0); }
		public TerminalNode T_FOREIGN() { return getToken(HiveParser.T_FOREIGN, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HiveParser.T_PRIMARY, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HiveParser.T_REFERENCES, 0); }
		public TerminalNode T_DAYOFWEEK() { return getToken(HiveParser.T_DAYOFWEEK, 0); }
		public TerminalNode T_EXTRACT() { return getToken(HiveParser.T_EXTRACT, 0); }
		public TerminalNode T_FLOOR() { return getToken(HiveParser.T_FLOOR, 0); }
		public TerminalNode T_INTEGER() { return getToken(HiveParser.T_INTEGER, 0); }
		public TerminalNode T_PRECISION() { return getToken(HiveParser.T_PRECISION, 0); }
		public TerminalNode T_VIEWS() { return getToken(HiveParser.T_VIEWS, 0); }
		public TerminalNode T_TIME() { return getToken(HiveParser.T_TIME, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HiveParser.T_NUMERIC, 0); }
		public TerminalNode T_SYNC() { return getToken(HiveParser.T_SYNC, 0); }
		public Reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved_words; }
	}

	public final Reserved_wordsContext reserved_words() throws RecognitionException {
		Reserved_wordsContext _localctx = new Reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_reserved_words);
		try {
			setState(3501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3225);
				((Reserved_wordsContext)_localctx).T_ALL = match(T_ALL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ALL!=null?((Reserved_wordsContext)_localctx).T_ALL.getText():null); 
				}
				break;
			case T_ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(3227);
				((Reserved_wordsContext)_localctx).T_ALTER = match(T_ALTER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ALTER!=null?((Reserved_wordsContext)_localctx).T_ALTER.getText():null); 
				}
				break;
			case T_AND:
				enterOuterAlt(_localctx, 3);
				{
				setState(3229);
				((Reserved_wordsContext)_localctx).T_AND = match(T_AND);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_AND!=null?((Reserved_wordsContext)_localctx).T_AND.getText():null); 
				}
				break;
			case T_ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(3231);
				((Reserved_wordsContext)_localctx).T_ARRAY = match(T_ARRAY);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ARRAY!=null?((Reserved_wordsContext)_localctx).T_ARRAY.getText():null); 
				}
				break;
			case T_AS:
				enterOuterAlt(_localctx, 5);
				{
				setState(3233);
				((Reserved_wordsContext)_localctx).T_AS = match(T_AS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_AS!=null?((Reserved_wordsContext)_localctx).T_AS.getText():null); 
				}
				break;
			case T_AUTHORIZATION:
				enterOuterAlt(_localctx, 6);
				{
				setState(3235);
				((Reserved_wordsContext)_localctx).T_AUTHORIZATION = match(T_AUTHORIZATION);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_AUTHORIZATION!=null?((Reserved_wordsContext)_localctx).T_AUTHORIZATION.getText():null); 
				}
				break;
			case T_BETWEEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(3237);
				((Reserved_wordsContext)_localctx).T_BETWEEN = match(T_BETWEEN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BETWEEN!=null?((Reserved_wordsContext)_localctx).T_BETWEEN.getText():null); 
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(3239);
				((Reserved_wordsContext)_localctx).T_BIGINT = match(T_BIGINT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BIGINT!=null?((Reserved_wordsContext)_localctx).T_BIGINT.getText():null); 
				}
				break;
			case T_BINARY:
				enterOuterAlt(_localctx, 9);
				{
				setState(3241);
				((Reserved_wordsContext)_localctx).T_BINARY = match(T_BINARY);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BINARY!=null?((Reserved_wordsContext)_localctx).T_BINARY.getText():null); 
				}
				break;
			case T_BOOLEAN:
				enterOuterAlt(_localctx, 10);
				{
				setState(3243);
				((Reserved_wordsContext)_localctx).T_BOOLEAN = match(T_BOOLEAN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BOOLEAN!=null?((Reserved_wordsContext)_localctx).T_BOOLEAN.getText():null); 
				}
				break;
			case T_BOTH:
				enterOuterAlt(_localctx, 11);
				{
				setState(3245);
				((Reserved_wordsContext)_localctx).T_BOTH = match(T_BOTH);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BOTH!=null?((Reserved_wordsContext)_localctx).T_BOTH.getText():null); 
				}
				break;
			case T_BY:
				enterOuterAlt(_localctx, 12);
				{
				setState(3247);
				((Reserved_wordsContext)_localctx).T_BY = match(T_BY);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BY!=null?((Reserved_wordsContext)_localctx).T_BY.getText():null); 
				}
				break;
			case T_CASE:
				enterOuterAlt(_localctx, 13);
				{
				setState(3249);
				((Reserved_wordsContext)_localctx).T_CASE = match(T_CASE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CASE!=null?((Reserved_wordsContext)_localctx).T_CASE.getText():null); 
				}
				break;
			case T_CAST:
				enterOuterAlt(_localctx, 14);
				{
				setState(3251);
				((Reserved_wordsContext)_localctx).T_CAST = match(T_CAST);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CAST!=null?((Reserved_wordsContext)_localctx).T_CAST.getText():null); 
				}
				break;
			case T_CHAR:
				enterOuterAlt(_localctx, 15);
				{
				setState(3253);
				((Reserved_wordsContext)_localctx).T_CHAR = match(T_CHAR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CHAR!=null?((Reserved_wordsContext)_localctx).T_CHAR.getText():null); 
				}
				break;
			case T_COLUMN:
				enterOuterAlt(_localctx, 16);
				{
				setState(3255);
				((Reserved_wordsContext)_localctx).T_COLUMN = match(T_COLUMN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_COLUMN!=null?((Reserved_wordsContext)_localctx).T_COLUMN.getText():null); 
				}
				break;
			case T_CONF:
				enterOuterAlt(_localctx, 17);
				{
				setState(3257);
				((Reserved_wordsContext)_localctx).T_CONF = match(T_CONF);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CONF!=null?((Reserved_wordsContext)_localctx).T_CONF.getText():null); 
				}
				break;
			case T_CREATE:
				enterOuterAlt(_localctx, 18);
				{
				setState(3259);
				((Reserved_wordsContext)_localctx).T_CREATE = match(T_CREATE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CREATE!=null?((Reserved_wordsContext)_localctx).T_CREATE.getText():null); 
				}
				break;
			case T_CROSS:
				enterOuterAlt(_localctx, 19);
				{
				setState(3261);
				((Reserved_wordsContext)_localctx).T_CROSS = match(T_CROSS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CROSS!=null?((Reserved_wordsContext)_localctx).T_CROSS.getText():null); 
				}
				break;
			case T_CUBE:
				enterOuterAlt(_localctx, 20);
				{
				setState(3263);
				((Reserved_wordsContext)_localctx).T_CUBE = match(T_CUBE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CUBE!=null?((Reserved_wordsContext)_localctx).T_CUBE.getText():null); 
				}
				break;
			case T_CURRENT:
				enterOuterAlt(_localctx, 21);
				{
				setState(3265);
				((Reserved_wordsContext)_localctx).T_CURRENT = match(T_CURRENT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CURRENT!=null?((Reserved_wordsContext)_localctx).T_CURRENT.getText():null); 
				}
				break;
			case T_CURRENT_DATE:
				enterOuterAlt(_localctx, 22);
				{
				setState(3267);
				((Reserved_wordsContext)_localctx).T_CURRENT_DATE = match(T_CURRENT_DATE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CURRENT_DATE!=null?((Reserved_wordsContext)_localctx).T_CURRENT_DATE.getText():null); 
				}
				break;
			case T_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 23);
				{
				setState(3269);
				((Reserved_wordsContext)_localctx).T_CURRENT_TIMESTAMP = match(T_CURRENT_TIMESTAMP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CURRENT_TIMESTAMP!=null?((Reserved_wordsContext)_localctx).T_CURRENT_TIMESTAMP.getText():null); 
				}
				break;
			case T_CURSOR:
				enterOuterAlt(_localctx, 24);
				{
				setState(3271);
				((Reserved_wordsContext)_localctx).T_CURSOR = match(T_CURSOR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CURSOR!=null?((Reserved_wordsContext)_localctx).T_CURSOR.getText():null); 
				}
				break;
			case T_DATABASE:
				enterOuterAlt(_localctx, 25);
				{
				setState(3273);
				((Reserved_wordsContext)_localctx).T_DATABASE = match(T_DATABASE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DATABASE!=null?((Reserved_wordsContext)_localctx).T_DATABASE.getText():null); 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 26);
				{
				setState(3275);
				((Reserved_wordsContext)_localctx).T_DATE = match(T_DATE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DATE!=null?((Reserved_wordsContext)_localctx).T_DATE.getText():null); 
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 27);
				{
				setState(3277);
				((Reserved_wordsContext)_localctx).T_DECIMAL = match(T_DECIMAL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DECIMAL!=null?((Reserved_wordsContext)_localctx).T_DECIMAL.getText():null); 
				}
				break;
			case T_DELETE:
				enterOuterAlt(_localctx, 28);
				{
				setState(3279);
				((Reserved_wordsContext)_localctx).T_DELETE = match(T_DELETE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DELETE!=null?((Reserved_wordsContext)_localctx).T_DELETE.getText():null); 
				}
				break;
			case T_DESCRIBE:
				enterOuterAlt(_localctx, 29);
				{
				setState(3281);
				((Reserved_wordsContext)_localctx).T_DESCRIBE = match(T_DESCRIBE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DESCRIBE!=null?((Reserved_wordsContext)_localctx).T_DESCRIBE.getText():null); 
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 30);
				{
				setState(3283);
				((Reserved_wordsContext)_localctx).T_DISTINCT = match(T_DISTINCT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DISTINCT!=null?((Reserved_wordsContext)_localctx).T_DISTINCT.getText():null); 
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 31);
				{
				setState(3285);
				((Reserved_wordsContext)_localctx).T_DOUBLE = match(T_DOUBLE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DOUBLE!=null?((Reserved_wordsContext)_localctx).T_DOUBLE.getText():null); 
				}
				break;
			case T_DROP:
				enterOuterAlt(_localctx, 32);
				{
				setState(3287);
				((Reserved_wordsContext)_localctx).T_DROP = match(T_DROP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DROP!=null?((Reserved_wordsContext)_localctx).T_DROP.getText():null); 
				}
				break;
			case T_ELSE:
				enterOuterAlt(_localctx, 33);
				{
				setState(3289);
				((Reserved_wordsContext)_localctx).T_ELSE = match(T_ELSE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ELSE!=null?((Reserved_wordsContext)_localctx).T_ELSE.getText():null); 
				}
				break;
			case T_END:
				enterOuterAlt(_localctx, 34);
				{
				setState(3291);
				((Reserved_wordsContext)_localctx).T_END = match(T_END);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_END!=null?((Reserved_wordsContext)_localctx).T_END.getText():null); 
				}
				break;
			case T_EXCHANGE:
				enterOuterAlt(_localctx, 35);
				{
				setState(3293);
				((Reserved_wordsContext)_localctx).T_EXCHANGE = match(T_EXCHANGE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_EXCHANGE!=null?((Reserved_wordsContext)_localctx).T_EXCHANGE.getText():null); 
				}
				break;
			case T_EXISTS:
				enterOuterAlt(_localctx, 36);
				{
				setState(3295);
				((Reserved_wordsContext)_localctx).T_EXISTS = match(T_EXISTS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_EXISTS!=null?((Reserved_wordsContext)_localctx).T_EXISTS.getText():null); 
				}
				break;
			case T_EXTENDED:
				enterOuterAlt(_localctx, 37);
				{
				setState(3297);
				((Reserved_wordsContext)_localctx).T_EXTENDED = match(T_EXTENDED);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_EXTENDED!=null?((Reserved_wordsContext)_localctx).T_EXTENDED.getText():null); 
				}
				break;
			case T_EXTERNAL:
				enterOuterAlt(_localctx, 38);
				{
				setState(3299);
				((Reserved_wordsContext)_localctx).T_EXTERNAL = match(T_EXTERNAL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_EXTERNAL!=null?((Reserved_wordsContext)_localctx).T_EXTERNAL.getText():null); 
				}
				break;
			case T_FALSE:
				enterOuterAlt(_localctx, 39);
				{
				setState(3301);
				((Reserved_wordsContext)_localctx).T_FALSE = match(T_FALSE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FALSE!=null?((Reserved_wordsContext)_localctx).T_FALSE.getText():null); 
				}
				break;
			case T_FETCH:
				enterOuterAlt(_localctx, 40);
				{
				setState(3303);
				((Reserved_wordsContext)_localctx).T_FETCH = match(T_FETCH);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FETCH!=null?((Reserved_wordsContext)_localctx).T_FETCH.getText():null); 
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 41);
				{
				setState(3305);
				((Reserved_wordsContext)_localctx).T_FLOAT = match(T_FLOAT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FLOAT!=null?((Reserved_wordsContext)_localctx).T_FLOAT.getText():null); 
				}
				break;
			case T_FOLLOWING:
				enterOuterAlt(_localctx, 42);
				{
				setState(3307);
				((Reserved_wordsContext)_localctx).T_FOLLOWING = match(T_FOLLOWING);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FOLLOWING!=null?((Reserved_wordsContext)_localctx).T_FOLLOWING.getText():null); 
				}
				break;
			case T_FOR:
				enterOuterAlt(_localctx, 43);
				{
				setState(3309);
				((Reserved_wordsContext)_localctx).T_FOR = match(T_FOR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FOR!=null?((Reserved_wordsContext)_localctx).T_FOR.getText():null); 
				}
				break;
			case T_FROM:
				enterOuterAlt(_localctx, 44);
				{
				setState(3311);
				((Reserved_wordsContext)_localctx).T_FROM = match(T_FROM);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FROM!=null?((Reserved_wordsContext)_localctx).T_FROM.getText():null); 
				}
				break;
			case T_FULL:
				enterOuterAlt(_localctx, 45);
				{
				setState(3313);
				((Reserved_wordsContext)_localctx).T_FULL = match(T_FULL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FULL!=null?((Reserved_wordsContext)_localctx).T_FULL.getText():null); 
				}
				break;
			case T_FUNCTION:
				enterOuterAlt(_localctx, 46);
				{
				setState(3315);
				((Reserved_wordsContext)_localctx).T_FUNCTION = match(T_FUNCTION);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FUNCTION!=null?((Reserved_wordsContext)_localctx).T_FUNCTION.getText():null); 
				}
				break;
			case T_GRANT:
				enterOuterAlt(_localctx, 47);
				{
				setState(3317);
				((Reserved_wordsContext)_localctx).T_GRANT = match(T_GRANT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_GRANT!=null?((Reserved_wordsContext)_localctx).T_GRANT.getText():null); 
				}
				break;
			case T_GROUP:
				enterOuterAlt(_localctx, 48);
				{
				setState(3319);
				((Reserved_wordsContext)_localctx).T_GROUP = match(T_GROUP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_GROUP!=null?((Reserved_wordsContext)_localctx).T_GROUP.getText():null); 
				}
				break;
			case T_GROUPING:
				enterOuterAlt(_localctx, 49);
				{
				setState(3321);
				((Reserved_wordsContext)_localctx).T_GROUPING = match(T_GROUPING);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_GROUPING!=null?((Reserved_wordsContext)_localctx).T_GROUPING.getText():null); 
				}
				break;
			case T_HAVING:
				enterOuterAlt(_localctx, 50);
				{
				setState(3323);
				((Reserved_wordsContext)_localctx).T_HAVING = match(T_HAVING);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_HAVING!=null?((Reserved_wordsContext)_localctx).T_HAVING.getText():null); 
				}
				break;
			case T_IF:
				enterOuterAlt(_localctx, 51);
				{
				setState(3325);
				((Reserved_wordsContext)_localctx).T_IF = match(T_IF);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_IF!=null?((Reserved_wordsContext)_localctx).T_IF.getText():null); 
				}
				break;
			case T_IMPORT:
				enterOuterAlt(_localctx, 52);
				{
				setState(3327);
				((Reserved_wordsContext)_localctx).T_IMPORT = match(T_IMPORT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_IMPORT!=null?((Reserved_wordsContext)_localctx).T_IMPORT.getText():null); 
				}
				break;
			case T_IN:
				enterOuterAlt(_localctx, 53);
				{
				setState(3329);
				((Reserved_wordsContext)_localctx).T_IN = match(T_IN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_IN!=null?((Reserved_wordsContext)_localctx).T_IN.getText():null); 
				}
				break;
			case T_INNER:
				enterOuterAlt(_localctx, 54);
				{
				setState(3331);
				((Reserved_wordsContext)_localctx).T_INNER = match(T_INNER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INNER!=null?((Reserved_wordsContext)_localctx).T_INNER.getText():null); 
				}
				break;
			case T_INSERT:
				enterOuterAlt(_localctx, 55);
				{
				setState(3333);
				((Reserved_wordsContext)_localctx).T_INSERT = match(T_INSERT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INSERT!=null?((Reserved_wordsContext)_localctx).T_INSERT.getText():null); 
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 56);
				{
				setState(3335);
				((Reserved_wordsContext)_localctx).T_INT = match(T_INT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INT!=null?((Reserved_wordsContext)_localctx).T_INT.getText():null); 
				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 57);
				{
				setState(3337);
				((Reserved_wordsContext)_localctx).T_INTERSECT = match(T_INTERSECT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INTERSECT!=null?((Reserved_wordsContext)_localctx).T_INTERSECT.getText():null); 
				}
				break;
			case T_INTERVAL:
				enterOuterAlt(_localctx, 58);
				{
				setState(3339);
				((Reserved_wordsContext)_localctx).T_INTERVAL = match(T_INTERVAL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INTERVAL!=null?((Reserved_wordsContext)_localctx).T_INTERVAL.getText():null); 
				}
				break;
			case T_INTO:
				enterOuterAlt(_localctx, 59);
				{
				setState(3341);
				((Reserved_wordsContext)_localctx).T_INTO = match(T_INTO);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INTO!=null?((Reserved_wordsContext)_localctx).T_INTO.getText():null); 
				}
				break;
			case T_IS:
				enterOuterAlt(_localctx, 60);
				{
				setState(3343);
				((Reserved_wordsContext)_localctx).T_IS = match(T_IS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_IS!=null?((Reserved_wordsContext)_localctx).T_IS.getText():null); 
				}
				break;
			case T_JOIN:
				enterOuterAlt(_localctx, 61);
				{
				setState(3345);
				((Reserved_wordsContext)_localctx).T_JOIN = match(T_JOIN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_JOIN!=null?((Reserved_wordsContext)_localctx).T_JOIN.getText():null); 
				}
				break;
			case T_LATERAL:
				enterOuterAlt(_localctx, 62);
				{
				setState(3347);
				((Reserved_wordsContext)_localctx).T_LATERAL = match(T_LATERAL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_LATERAL!=null?((Reserved_wordsContext)_localctx).T_LATERAL.getText():null); 
				}
				break;
			case T_LEFT:
				enterOuterAlt(_localctx, 63);
				{
				setState(3349);
				((Reserved_wordsContext)_localctx).T_LEFT = match(T_LEFT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_LEFT!=null?((Reserved_wordsContext)_localctx).T_LEFT.getText():null); 
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 64);
				{
				setState(3351);
				((Reserved_wordsContext)_localctx).T_LESS = match(T_LESS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_LESS!=null?((Reserved_wordsContext)_localctx).T_LESS.getText():null); 
				}
				break;
			case T_LIKE:
				enterOuterAlt(_localctx, 65);
				{
				setState(3353);
				((Reserved_wordsContext)_localctx).T_LIKE = match(T_LIKE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_LIKE!=null?((Reserved_wordsContext)_localctx).T_LIKE.getText():null); 
				}
				break;
			case T_LOCAL:
				enterOuterAlt(_localctx, 66);
				{
				setState(3355);
				((Reserved_wordsContext)_localctx).T_LOCAL = match(T_LOCAL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_LOCAL!=null?((Reserved_wordsContext)_localctx).T_LOCAL.getText():null); 
				}
				break;
			case T_MACRO:
				enterOuterAlt(_localctx, 67);
				{
				setState(3357);
				((Reserved_wordsContext)_localctx).T_MACRO = match(T_MACRO);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_MACRO!=null?((Reserved_wordsContext)_localctx).T_MACRO.getText():null); 
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 68);
				{
				setState(3359);
				((Reserved_wordsContext)_localctx).T_MAP = match(T_MAP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_MAP!=null?((Reserved_wordsContext)_localctx).T_MAP.getText():null); 
				}
				break;
			case T_MORE:
				enterOuterAlt(_localctx, 69);
				{
				setState(3361);
				((Reserved_wordsContext)_localctx).T_MORE = match(T_MORE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_MORE!=null?((Reserved_wordsContext)_localctx).T_MORE.getText():null); 
				}
				break;
			case T_NONE:
				enterOuterAlt(_localctx, 70);
				{
				setState(3363);
				((Reserved_wordsContext)_localctx).T_NONE = match(T_NONE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_NONE!=null?((Reserved_wordsContext)_localctx).T_NONE.getText():null); 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 71);
				{
				setState(3365);
				((Reserved_wordsContext)_localctx).T_NOT = match(T_NOT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_NOT!=null?((Reserved_wordsContext)_localctx).T_NOT.getText():null); 
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 72);
				{
				setState(3367);
				((Reserved_wordsContext)_localctx).T_NULL = match(T_NULL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_NULL!=null?((Reserved_wordsContext)_localctx).T_NULL.getText():null); 
				}
				break;
			case T_OF:
				enterOuterAlt(_localctx, 73);
				{
				setState(3369);
				((Reserved_wordsContext)_localctx).T_OF = match(T_OF);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_OF!=null?((Reserved_wordsContext)_localctx).T_OF.getText():null); 
				}
				break;
			case T_ON:
				enterOuterAlt(_localctx, 74);
				{
				setState(3371);
				((Reserved_wordsContext)_localctx).T_ON = match(T_ON);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ON!=null?((Reserved_wordsContext)_localctx).T_ON.getText():null); 
				}
				break;
			case T_OR:
				enterOuterAlt(_localctx, 75);
				{
				setState(3373);
				((Reserved_wordsContext)_localctx).T_OR = match(T_OR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_OR!=null?((Reserved_wordsContext)_localctx).T_OR.getText():null); 
				}
				break;
			case T_ORDER:
				enterOuterAlt(_localctx, 76);
				{
				setState(3375);
				((Reserved_wordsContext)_localctx).T_ORDER = match(T_ORDER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ORDER!=null?((Reserved_wordsContext)_localctx).T_ORDER.getText():null); 
				}
				break;
			case T_OUT:
				enterOuterAlt(_localctx, 77);
				{
				setState(3377);
				((Reserved_wordsContext)_localctx).T_OUT = match(T_OUT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_OUT!=null?((Reserved_wordsContext)_localctx).T_OUT.getText():null); 
				}
				break;
			case T_OUTER:
				enterOuterAlt(_localctx, 78);
				{
				setState(3379);
				((Reserved_wordsContext)_localctx).T_OUTER = match(T_OUTER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_OUTER!=null?((Reserved_wordsContext)_localctx).T_OUTER.getText():null); 
				}
				break;
			case T_OVER:
				enterOuterAlt(_localctx, 79);
				{
				setState(3381);
				((Reserved_wordsContext)_localctx).T_OVER = match(T_OVER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_OVER!=null?((Reserved_wordsContext)_localctx).T_OVER.getText():null); 
				}
				break;
			case T_PARTIALSCAN:
				enterOuterAlt(_localctx, 80);
				{
				setState(3383);
				((Reserved_wordsContext)_localctx).T_PARTIALSCAN = match(T_PARTIALSCAN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PARTIALSCAN!=null?((Reserved_wordsContext)_localctx).T_PARTIALSCAN.getText():null); 
				}
				break;
			case T_PARTITION:
				enterOuterAlt(_localctx, 81);
				{
				setState(3385);
				((Reserved_wordsContext)_localctx).T_PARTITION = match(T_PARTITION);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PARTITION!=null?((Reserved_wordsContext)_localctx).T_PARTITION.getText():null); 
				}
				break;
			case T_PERCENT:
				enterOuterAlt(_localctx, 82);
				{
				setState(3387);
				((Reserved_wordsContext)_localctx).T_PERCENT = match(T_PERCENT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PERCENT!=null?((Reserved_wordsContext)_localctx).T_PERCENT.getText():null); 
				}
				break;
			case T_PRECEDING:
				enterOuterAlt(_localctx, 83);
				{
				setState(3389);
				((Reserved_wordsContext)_localctx).T_PRECEDING = match(T_PRECEDING);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PRECEDING!=null?((Reserved_wordsContext)_localctx).T_PRECEDING.getText():null); 
				}
				break;
			case T_PRESERVE:
				enterOuterAlt(_localctx, 84);
				{
				setState(3391);
				((Reserved_wordsContext)_localctx).T_PRESERVE = match(T_PRESERVE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PRESERVE!=null?((Reserved_wordsContext)_localctx).T_PRESERVE.getText():null); 
				}
				break;
			case T_PROCEDURE:
				enterOuterAlt(_localctx, 85);
				{
				setState(3393);
				((Reserved_wordsContext)_localctx).T_PROCEDURE = match(T_PROCEDURE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PROCEDURE!=null?((Reserved_wordsContext)_localctx).T_PROCEDURE.getText():null); 
				}
				break;
			case T_RANGE:
				enterOuterAlt(_localctx, 86);
				{
				setState(3395);
				((Reserved_wordsContext)_localctx).T_RANGE = match(T_RANGE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_RANGE!=null?((Reserved_wordsContext)_localctx).T_RANGE.getText():null); 
				}
				break;
			case T_READS:
				enterOuterAlt(_localctx, 87);
				{
				setState(3397);
				((Reserved_wordsContext)_localctx).T_READS = match(T_READS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_READS!=null?((Reserved_wordsContext)_localctx).T_READS.getText():null); 
				}
				break;
			case T_REDUCE:
				enterOuterAlt(_localctx, 88);
				{
				setState(3399);
				((Reserved_wordsContext)_localctx).T_REDUCE = match(T_REDUCE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_REDUCE!=null?((Reserved_wordsContext)_localctx).T_REDUCE.getText():null); 
				}
				break;
			case T_REVOKE:
				enterOuterAlt(_localctx, 89);
				{
				setState(3401);
				((Reserved_wordsContext)_localctx).T_REVOKE = match(T_REVOKE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_REVOKE!=null?((Reserved_wordsContext)_localctx).T_REVOKE.getText():null); 
				}
				break;
			case T_RIGHT:
				enterOuterAlt(_localctx, 90);
				{
				setState(3403);
				((Reserved_wordsContext)_localctx).T_RIGHT = match(T_RIGHT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_RIGHT!=null?((Reserved_wordsContext)_localctx).T_RIGHT.getText():null); 
				}
				break;
			case T_ROLLUP:
				enterOuterAlt(_localctx, 91);
				{
				setState(3405);
				((Reserved_wordsContext)_localctx).T_ROLLUP = match(T_ROLLUP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ROLLUP!=null?((Reserved_wordsContext)_localctx).T_ROLLUP.getText():null); 
				}
				break;
			case T_ROW:
				enterOuterAlt(_localctx, 92);
				{
				setState(3407);
				((Reserved_wordsContext)_localctx).T_ROW = match(T_ROW);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ROW!=null?((Reserved_wordsContext)_localctx).T_ROW.getText():null); 
				}
				break;
			case T_ROWS:
				enterOuterAlt(_localctx, 93);
				{
				setState(3409);
				((Reserved_wordsContext)_localctx).T_ROWS = match(T_ROWS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ROWS!=null?((Reserved_wordsContext)_localctx).T_ROWS.getText():null); 
				}
				break;
			case T_SELECT:
				enterOuterAlt(_localctx, 94);
				{
				setState(3411);
				((Reserved_wordsContext)_localctx).T_SELECT = match(T_SELECT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_SELECT!=null?((Reserved_wordsContext)_localctx).T_SELECT.getText():null); 
				}
				break;
			case T_SET:
				enterOuterAlt(_localctx, 95);
				{
				setState(3413);
				((Reserved_wordsContext)_localctx).T_SET = match(T_SET);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_SET!=null?((Reserved_wordsContext)_localctx).T_SET.getText():null); 
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 96);
				{
				setState(3415);
				((Reserved_wordsContext)_localctx).T_SMALLINT = match(T_SMALLINT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_SMALLINT!=null?((Reserved_wordsContext)_localctx).T_SMALLINT.getText():null); 
				}
				break;
			case T_TABLE:
				enterOuterAlt(_localctx, 97);
				{
				setState(3417);
				((Reserved_wordsContext)_localctx).T_TABLE = match(T_TABLE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TABLE!=null?((Reserved_wordsContext)_localctx).T_TABLE.getText():null); 
				}
				break;
			case T_TABLESAMPLE:
				enterOuterAlt(_localctx, 98);
				{
				setState(3419);
				((Reserved_wordsContext)_localctx).T_TABLESAMPLE = match(T_TABLESAMPLE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TABLESAMPLE!=null?((Reserved_wordsContext)_localctx).T_TABLESAMPLE.getText():null); 
				}
				break;
			case T_THEN:
				enterOuterAlt(_localctx, 99);
				{
				setState(3421);
				((Reserved_wordsContext)_localctx).T_THEN = match(T_THEN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_THEN!=null?((Reserved_wordsContext)_localctx).T_THEN.getText():null); 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 100);
				{
				setState(3423);
				((Reserved_wordsContext)_localctx).T_TIMESTAMP = match(T_TIMESTAMP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TIMESTAMP!=null?((Reserved_wordsContext)_localctx).T_TIMESTAMP.getText():null); 
				}
				break;
			case T_TO:
				enterOuterAlt(_localctx, 101);
				{
				setState(3425);
				((Reserved_wordsContext)_localctx).T_TO = match(T_TO);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TO!=null?((Reserved_wordsContext)_localctx).T_TO.getText():null); 
				}
				break;
			case T_TRANSFORM:
				enterOuterAlt(_localctx, 102);
				{
				setState(3427);
				((Reserved_wordsContext)_localctx).T_TRANSFORM = match(T_TRANSFORM);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TRANSFORM!=null?((Reserved_wordsContext)_localctx).T_TRANSFORM.getText():null); 
				}
				break;
			case T_TRIGGER:
				enterOuterAlt(_localctx, 103);
				{
				setState(3429);
				((Reserved_wordsContext)_localctx).T_TRIGGER = match(T_TRIGGER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TRIGGER!=null?((Reserved_wordsContext)_localctx).T_TRIGGER.getText():null); 
				}
				break;
			case T_TRUE:
				enterOuterAlt(_localctx, 104);
				{
				setState(3431);
				((Reserved_wordsContext)_localctx).T_TRUE = match(T_TRUE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TRUE!=null?((Reserved_wordsContext)_localctx).T_TRUE.getText():null); 
				}
				break;
			case T_TRUNCATE:
				enterOuterAlt(_localctx, 105);
				{
				setState(3433);
				((Reserved_wordsContext)_localctx).T_TRUNCATE = match(T_TRUNCATE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TRUNCATE!=null?((Reserved_wordsContext)_localctx).T_TRUNCATE.getText():null); 
				}
				break;
			case T_UNBOUNDED:
				enterOuterAlt(_localctx, 106);
				{
				setState(3435);
				((Reserved_wordsContext)_localctx).T_UNBOUNDED = match(T_UNBOUNDED);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_UNBOUNDED!=null?((Reserved_wordsContext)_localctx).T_UNBOUNDED.getText():null); 
				}
				break;
			case T_UNION:
				enterOuterAlt(_localctx, 107);
				{
				setState(3437);
				((Reserved_wordsContext)_localctx).T_UNION = match(T_UNION);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_UNION!=null?((Reserved_wordsContext)_localctx).T_UNION.getText():null); 
				}
				break;
			case T_UNIQUEJOIN:
				enterOuterAlt(_localctx, 108);
				{
				setState(3439);
				((Reserved_wordsContext)_localctx).T_UNIQUEJOIN = match(T_UNIQUEJOIN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_UNIQUEJOIN!=null?((Reserved_wordsContext)_localctx).T_UNIQUEJOIN.getText():null); 
				}
				break;
			case T_UPDATE:
				enterOuterAlt(_localctx, 109);
				{
				setState(3441);
				((Reserved_wordsContext)_localctx).T_UPDATE = match(T_UPDATE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_UPDATE!=null?((Reserved_wordsContext)_localctx).T_UPDATE.getText():null); 
				}
				break;
			case T_USER:
				enterOuterAlt(_localctx, 110);
				{
				setState(3443);
				((Reserved_wordsContext)_localctx).T_USER = match(T_USER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_USER!=null?((Reserved_wordsContext)_localctx).T_USER.getText():null); 
				}
				break;
			case T_USING:
				enterOuterAlt(_localctx, 111);
				{
				setState(3445);
				((Reserved_wordsContext)_localctx).T_USING = match(T_USING);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_USING!=null?((Reserved_wordsContext)_localctx).T_USING.getText():null); 
				}
				break;
			case T_UTC_TMESTAMP:
				enterOuterAlt(_localctx, 112);
				{
				setState(3447);
				((Reserved_wordsContext)_localctx).T_UTC_TMESTAMP = match(T_UTC_TMESTAMP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_UTC_TMESTAMP!=null?((Reserved_wordsContext)_localctx).T_UTC_TMESTAMP.getText():null); 
				}
				break;
			case T_VALUES:
				enterOuterAlt(_localctx, 113);
				{
				setState(3449);
				((Reserved_wordsContext)_localctx).T_VALUES = match(T_VALUES);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_VALUES!=null?((Reserved_wordsContext)_localctx).T_VALUES.getText():null); 
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 114);
				{
				setState(3451);
				((Reserved_wordsContext)_localctx).T_VARCHAR = match(T_VARCHAR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_VARCHAR!=null?((Reserved_wordsContext)_localctx).T_VARCHAR.getText():null); 
				}
				break;
			case T_WHEN:
				enterOuterAlt(_localctx, 115);
				{
				setState(3453);
				((Reserved_wordsContext)_localctx).T_WHEN = match(T_WHEN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_WHEN!=null?((Reserved_wordsContext)_localctx).T_WHEN.getText():null); 
				}
				break;
			case T_WHERE:
				enterOuterAlt(_localctx, 116);
				{
				setState(3455);
				((Reserved_wordsContext)_localctx).T_WHERE = match(T_WHERE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_WHERE!=null?((Reserved_wordsContext)_localctx).T_WHERE.getText():null); 
				}
				break;
			case T_WINDOW:
				enterOuterAlt(_localctx, 117);
				{
				setState(3457);
				((Reserved_wordsContext)_localctx).T_WINDOW = match(T_WINDOW);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_WINDOW!=null?((Reserved_wordsContext)_localctx).T_WINDOW.getText():null); 
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 118);
				{
				setState(3459);
				((Reserved_wordsContext)_localctx).T_WITH = match(T_WITH);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_WITH!=null?((Reserved_wordsContext)_localctx).T_WITH.getText():null); 
				}
				break;
			case T_COMMIT:
				enterOuterAlt(_localctx, 119);
				{
				setState(3461);
				((Reserved_wordsContext)_localctx).T_COMMIT = match(T_COMMIT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_COMMIT!=null?((Reserved_wordsContext)_localctx).T_COMMIT.getText():null); 
				}
				break;
			case T_ONLY:
				enterOuterAlt(_localctx, 120);
				{
				setState(3463);
				((Reserved_wordsContext)_localctx).T_ONLY = match(T_ONLY);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ONLY!=null?((Reserved_wordsContext)_localctx).T_ONLY.getText():null); 
				}
				break;
			case T_REGEXP:
				enterOuterAlt(_localctx, 121);
				{
				setState(3465);
				((Reserved_wordsContext)_localctx).T_REGEXP = match(T_REGEXP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_REGEXP!=null?((Reserved_wordsContext)_localctx).T_REGEXP.getText():null); 
				}
				break;
			case T_RLIKE:
				enterOuterAlt(_localctx, 122);
				{
				setState(3467);
				((Reserved_wordsContext)_localctx).T_RLIKE = match(T_RLIKE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_RLIKE!=null?((Reserved_wordsContext)_localctx).T_RLIKE.getText():null); 
				}
				break;
			case T_ROLLBACK:
				enterOuterAlt(_localctx, 123);
				{
				setState(3469);
				((Reserved_wordsContext)_localctx).T_ROLLBACK = match(T_ROLLBACK);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ROLLBACK!=null?((Reserved_wordsContext)_localctx).T_ROLLBACK.getText():null); 
				}
				break;
			case T_START:
				enterOuterAlt(_localctx, 124);
				{
				setState(3471);
				((Reserved_wordsContext)_localctx).T_START = match(T_START);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_START!=null?((Reserved_wordsContext)_localctx).T_START.getText():null); 
				}
				break;
			case T_CACHE:
				enterOuterAlt(_localctx, 125);
				{
				setState(3473);
				((Reserved_wordsContext)_localctx).T_CACHE = match(T_CACHE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CACHE!=null?((Reserved_wordsContext)_localctx).T_CACHE.getText():null); 
				}
				break;
			case T_CONSTRAINT:
				enterOuterAlt(_localctx, 126);
				{
				setState(3475);
				((Reserved_wordsContext)_localctx).T_CONSTRAINT = match(T_CONSTRAINT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CONSTRAINT!=null?((Reserved_wordsContext)_localctx).T_CONSTRAINT.getText():null); 
				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 127);
				{
				setState(3477);
				((Reserved_wordsContext)_localctx).T_FOREIGN = match(T_FOREIGN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FOREIGN!=null?((Reserved_wordsContext)_localctx).T_FOREIGN.getText():null); 
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 128);
				{
				setState(3479);
				((Reserved_wordsContext)_localctx).T_PRIMARY = match(T_PRIMARY);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PRIMARY!=null?((Reserved_wordsContext)_localctx).T_PRIMARY.getText():null); 
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 129);
				{
				setState(3481);
				((Reserved_wordsContext)_localctx).T_REFERENCES = match(T_REFERENCES);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_REFERENCES!=null?((Reserved_wordsContext)_localctx).T_REFERENCES.getText():null); 
				}
				break;
			case T_DAYOFWEEK:
				enterOuterAlt(_localctx, 130);
				{
				setState(3483);
				((Reserved_wordsContext)_localctx).T_DAYOFWEEK = match(T_DAYOFWEEK);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DAYOFWEEK!=null?((Reserved_wordsContext)_localctx).T_DAYOFWEEK.getText():null); 
				}
				break;
			case T_EXTRACT:
				enterOuterAlt(_localctx, 131);
				{
				setState(3485);
				((Reserved_wordsContext)_localctx).T_EXTRACT = match(T_EXTRACT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_EXTRACT!=null?((Reserved_wordsContext)_localctx).T_EXTRACT.getText():null); 
				}
				break;
			case T_FLOOR:
				enterOuterAlt(_localctx, 132);
				{
				setState(3487);
				((Reserved_wordsContext)_localctx).T_FLOOR = match(T_FLOOR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FLOOR!=null?((Reserved_wordsContext)_localctx).T_FLOOR.getText():null); 
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 133);
				{
				setState(3489);
				((Reserved_wordsContext)_localctx).T_INTEGER = match(T_INTEGER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INTEGER!=null?((Reserved_wordsContext)_localctx).T_INTEGER.getText():null); 
				}
				break;
			case T_PRECISION:
				enterOuterAlt(_localctx, 134);
				{
				setState(3491);
				((Reserved_wordsContext)_localctx).T_PRECISION = match(T_PRECISION);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PRECISION!=null?((Reserved_wordsContext)_localctx).T_PRECISION.getText():null); 
				}
				break;
			case T_VIEWS:
				enterOuterAlt(_localctx, 135);
				{
				setState(3493);
				((Reserved_wordsContext)_localctx).T_VIEWS = match(T_VIEWS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_VIEWS!=null?((Reserved_wordsContext)_localctx).T_VIEWS.getText():null); 
				}
				break;
			case T_TIME:
				enterOuterAlt(_localctx, 136);
				{
				setState(3495);
				((Reserved_wordsContext)_localctx).T_TIME = match(T_TIME);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TIME!=null?((Reserved_wordsContext)_localctx).T_TIME.getText():null); 
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 137);
				{
				setState(3497);
				((Reserved_wordsContext)_localctx).T_NUMERIC = match(T_NUMERIC);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_NUMERIC!=null?((Reserved_wordsContext)_localctx).T_NUMERIC.getText():null); 
				}
				break;
			case T_SYNC:
				enterOuterAlt(_localctx, 138);
				{
				setState(3499);
				((Reserved_wordsContext)_localctx).T_SYNC = match(T_SYNC);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_SYNC!=null?((Reserved_wordsContext)_localctx).T_SYNC.getText():null); 
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

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public string res;
		public Function_namesContext function_names;
		public Token T_EXIT;
		public Token T_ADD_W;
		public Token T_ADMIN;
		public Token T_AFTER;
		public Token T_ANALYZE;
		public Token T_ARCHIVE;
		public Token T_ASC;
		public Token T_AUTOCOMMIT;
		public Token T_BEFORE;
		public Token T_BUCKET;
		public Token T_BUCKETS;
		public Token T_CASCADE;
		public Token T_CHANGE;
		public Token T_CLUSTER;
		public Token T_CLUSTERED;
		public Token T_CLUSTERSTATUS;
		public Token T_COLLECTION;
		public Token T_COLUMNS;
		public Token T_COMMENT;
		public Token T_COMPACT;
		public Token T_COMPACTIONS;
		public Token T_COMPUTE;
		public Token T_CONCATENATE;
		public Token T_CONTINUE;
		public Token T_DATA;
		public Token T_DATABASES;
		public Token T_DATETIME;
		public Token T_DAY;
		public Token T_DBPROPERTIES;
		public Token T_DEFERRED;
		public Token T_DEFINED;
		public Token T_DELIMITED;
		public Token T_DEPENDENCY;
		public Token T_DESC;
		public Token T_DIRECTORIES;
		public Token T_DIRECTORY;
		public Token T_DISABLE;
		public Token T_DISTRIBUTE;
		public Token T_ELEM_TYPE;
		public Token T_ENABLE;
		public Token T_ESCAPED;
		public Token T_EXCLUSIVE;
		public Token T_EXPLAIN;
		public Token T_EXPORT;
		public Token T_FIELDS;
		public Token T_FILE;
		public Token T_FILEFORMAT;
		public Token T_FIRST;
		public Token T_FORMAT;
		public Token T_FORMATTED;
		public Token T_FUNCTIONS;
		public Token T_HOLD_DDLTIME;
		public Token T_HOUR;
		public Token T_IDXPROPERTIES;
		public Token T_IGNORE;
		public Token T_INDEX;
		public Token T_INDEXES;
		public Token T_INPATH;
		public Token T_INPUTDRIVER;
		public Token T_INPUTFORMAT;
		public Token T_ITEMS;
		public Token T_JAR;
		public Token T_KEYS;
		public Token T_KEY_TYPE;
		public Token T_LIMIT;
		public Token T_LINES;
		public Token T_LOAD;
		public Token T_LOCATION;
		public Token T_LOCK;
		public Token T_LOCKS;
		public Token T_LOGICAL;
		public Token T_LONG;
		public Token T_MAPJOIN;
		public Token T_MATERIALIZED;
		public Token T_METADATA;
		public Token T_MINUS;
		public Token T_MINUTE;
		public Token T_MONTH;
		public Token T_MSCK;
		public Token T_NOSCAN;
		public Token T_NO_DROP;
		public Token T_OFFLINE;
		public Token T_OPTION;
		public Token T_OUTPUTDRIVER;
		public Token T_OUTPUTFORMAT;
		public Token T_OVERWRITE;
		public Token T_OWNER;
		public Token T_PARTITIONED;
		public Token T_PARTITIONS;
		public Token T_PLUS;
		public Token T_PRETTY;
		public Token T_PRINCIPALS;
		public Token T_PROTECTION;
		public Token T_PURGE;
		public Token T_READ;
		public Token T_READONLY;
		public Token T_REBUILD;
		public Token T_RECORDREADER;
		public Token T_RECORDWRITER;
		public Token T_RELOAD;
		public Token T_RENAME;
		public Token T_REPAIR;
		public Token T_REPLACE;
		public Token T_REPLICATION;
		public Token T_RESTRICT;
		public Token T_REWRITE;
		public Token T_ROLE;
		public Token T_ROLES;
		public Token T_SCHEMA;
		public Token T_SCHEMAS;
		public Token T_SECOND;
		public Token T_SEMI;
		public Token T_SERDE;
		public Token T_SERDEPROPERTIES;
		public Token T_SERVER;
		public Token T_SETS;
		public Token T_SHARED;
		public Token T_SHOW;
		public Token T_SHOW_DATABASE;
		public Token T_SKEWED;
		public Token T_SORT;
		public Token T_SORTED;
		public Token T_SSL;
		public Token T_STATISTICS;
		public Token T_STORED;
		public Token T_STREAMTABLE;
		public Token T_STRING;
		public Token T_STRUCT;
		public Token T_TABLES;
		public Token T_TBLPROPERTIES;
		public Token T_TEMPORARY;
		public Token T_TERMINATED;
		public Token T_TINYINT;
		public Token T_TOUCH;
		public Token T_TRANSACTIONS;
		public Token T_UNARCHIVE;
		public Token T_UNDO;
		public Token T_UNIONTYPE;
		public Token T_UNLOCK;
		public Token T_UNSET;
		public Token T_UNSIGNED;
		public Token T_URI;
		public Token T_USE;
		public Token T_UTC;
		public Token T_UTCTIMESTAMP;
		public Token T_VALUE_TYPE;
		public Token T_VIEW;
		public Token T_WHILE;
		public Token T_YEAR;
		public Token T_ISOLATION;
		public Token T_LEVEL;
		public Token T_OFFSET;
		public Token T_SNAPSHOT;
		public Token T_TRANSACTION;
		public Token T_WORK;
		public Token T_WRITE;
		public Token T_ABORT;
		public Token T_KEY;
		public Token T_LAST;
		public Token T_NORELY;
		public Token T_NOVALIDATE;
		public Token T_NULLS;
		public Token T_RELY;
		public Token T_VALIDATE;
		public Token T_DETAIL;
		public Token T_DOW;
		public Token T_EXPRESSION;
		public Token T_OPERATOR;
		public Token T_QUARTER;
		public Token T_SUMMARY;
		public Token T_VECTORIZATION;
		public Token T_WEEK;
		public Token T_YEARS;
		public Token T_MONTHS;
		public Token T_WEEKS;
		public Token T_DAYS;
		public Token T_HOURS;
		public Token T_MINUTES;
		public Token T_SECONDS;
		public Token T_TIMESTAMPTZ;
		public Token T_ZONE;
		public Token T_SYSDATE;
		public Token T_NAMED_STRUCT;
		public Token T_UNIQUE;
		public Token T_CHECK;
		public Token T_DEFAULT;
		public Token T_SEQUENCEFILE;
		public Token T_TEXTFILE;
		public Token T_RCFILE;
		public Token T_ORC;
		public Token T_PARQUET;
		public Token T_AVRO;
		public Token T_JSONFILE;
		public Token T_HIVECONF;
		public Token T_HIVEVAR;
		public Token T_BYTE;
		public Function_namesContext function_names() {
			return getRuleContext(Function_namesContext.class,0);
		}
		public TerminalNode T_EXIT() { return getToken(HiveParser.T_EXIT, 0); }
		public TerminalNode T_ADD_W() { return getToken(HiveParser.T_ADD_W, 0); }
		public TerminalNode T_ADMIN() { return getToken(HiveParser.T_ADMIN, 0); }
		public TerminalNode T_AFTER() { return getToken(HiveParser.T_AFTER, 0); }
		public TerminalNode T_ANALYZE() { return getToken(HiveParser.T_ANALYZE, 0); }
		public TerminalNode T_ARCHIVE() { return getToken(HiveParser.T_ARCHIVE, 0); }
		public TerminalNode T_ASC() { return getToken(HiveParser.T_ASC, 0); }
		public TerminalNode T_AUTOCOMMIT() { return getToken(HiveParser.T_AUTOCOMMIT, 0); }
		public TerminalNode T_BEFORE() { return getToken(HiveParser.T_BEFORE, 0); }
		public TerminalNode T_BUCKET() { return getToken(HiveParser.T_BUCKET, 0); }
		public TerminalNode T_BUCKETS() { return getToken(HiveParser.T_BUCKETS, 0); }
		public TerminalNode T_CASCADE() { return getToken(HiveParser.T_CASCADE, 0); }
		public TerminalNode T_CHANGE() { return getToken(HiveParser.T_CHANGE, 0); }
		public TerminalNode T_CLUSTER() { return getToken(HiveParser.T_CLUSTER, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(HiveParser.T_CLUSTERED, 0); }
		public TerminalNode T_CLUSTERSTATUS() { return getToken(HiveParser.T_CLUSTERSTATUS, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HiveParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMNS() { return getToken(HiveParser.T_COLUMNS, 0); }
		public TerminalNode T_COMMENT() { return getToken(HiveParser.T_COMMENT, 0); }
		public TerminalNode T_COMPACT() { return getToken(HiveParser.T_COMPACT, 0); }
		public TerminalNode T_COMPACTIONS() { return getToken(HiveParser.T_COMPACTIONS, 0); }
		public TerminalNode T_COMPUTE() { return getToken(HiveParser.T_COMPUTE, 0); }
		public TerminalNode T_CONCATENATE() { return getToken(HiveParser.T_CONCATENATE, 0); }
		public TerminalNode T_CONTINUE() { return getToken(HiveParser.T_CONTINUE, 0); }
		public TerminalNode T_DATA() { return getToken(HiveParser.T_DATA, 0); }
		public TerminalNode T_DATABASES() { return getToken(HiveParser.T_DATABASES, 0); }
		public TerminalNode T_DATETIME() { return getToken(HiveParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(HiveParser.T_DAY, 0); }
		public TerminalNode T_DBPROPERTIES() { return getToken(HiveParser.T_DBPROPERTIES, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HiveParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(HiveParser.T_DEFINED, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HiveParser.T_DELIMITED, 0); }
		public TerminalNode T_DEPENDENCY() { return getToken(HiveParser.T_DEPENDENCY, 0); }
		public TerminalNode T_DESC() { return getToken(HiveParser.T_DESC, 0); }
		public TerminalNode T_DIRECTORIES() { return getToken(HiveParser.T_DIRECTORIES, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HiveParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISABLE() { return getToken(HiveParser.T_DISABLE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HiveParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_ELEM_TYPE() { return getToken(HiveParser.T_ELEM_TYPE, 0); }
		public TerminalNode T_ENABLE() { return getToken(HiveParser.T_ENABLE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(HiveParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HiveParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXPLAIN() { return getToken(HiveParser.T_EXPLAIN, 0); }
		public TerminalNode T_EXPORT() { return getToken(HiveParser.T_EXPORT, 0); }
		public TerminalNode T_FIELDS() { return getToken(HiveParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(HiveParser.T_FILE, 0); }
		public TerminalNode T_FILEFORMAT() { return getToken(HiveParser.T_FILEFORMAT, 0); }
		public TerminalNode T_FIRST() { return getToken(HiveParser.T_FIRST, 0); }
		public TerminalNode T_FORMAT() { return getToken(HiveParser.T_FORMAT, 0); }
		public TerminalNode T_FORMATTED() { return getToken(HiveParser.T_FORMATTED, 0); }
		public TerminalNode T_FUNCTIONS() { return getToken(HiveParser.T_FUNCTIONS, 0); }
		public TerminalNode T_HOLD_DDLTIME() { return getToken(HiveParser.T_HOLD_DDLTIME, 0); }
		public TerminalNode T_HOUR() { return getToken(HiveParser.T_HOUR, 0); }
		public TerminalNode T_IDXPROPERTIES() { return getToken(HiveParser.T_IDXPROPERTIES, 0); }
		public TerminalNode T_IGNORE() { return getToken(HiveParser.T_IGNORE, 0); }
		public TerminalNode T_INDEX() { return getToken(HiveParser.T_INDEX, 0); }
		public TerminalNode T_INDEXES() { return getToken(HiveParser.T_INDEXES, 0); }
		public TerminalNode T_INPATH() { return getToken(HiveParser.T_INPATH, 0); }
		public TerminalNode T_INPUTDRIVER() { return getToken(HiveParser.T_INPUTDRIVER, 0); }
		public TerminalNode T_INPUTFORMAT() { return getToken(HiveParser.T_INPUTFORMAT, 0); }
		public TerminalNode T_ITEMS() { return getToken(HiveParser.T_ITEMS, 0); }
		public TerminalNode T_JAR() { return getToken(HiveParser.T_JAR, 0); }
		public TerminalNode T_KEYS() { return getToken(HiveParser.T_KEYS, 0); }
		public TerminalNode T_KEY_TYPE() { return getToken(HiveParser.T_KEY_TYPE, 0); }
		public TerminalNode T_LIMIT() { return getToken(HiveParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(HiveParser.T_LINES, 0); }
		public TerminalNode T_LOAD() { return getToken(HiveParser.T_LOAD, 0); }
		public TerminalNode T_LOCATION() { return getToken(HiveParser.T_LOCATION, 0); }
		public TerminalNode T_LOCK() { return getToken(HiveParser.T_LOCK, 0); }
		public TerminalNode T_LOCKS() { return getToken(HiveParser.T_LOCKS, 0); }
		public TerminalNode T_LOGICAL() { return getToken(HiveParser.T_LOGICAL, 0); }
		public TerminalNode T_LONG() { return getToken(HiveParser.T_LONG, 0); }
		public TerminalNode T_MAPJOIN() { return getToken(HiveParser.T_MAPJOIN, 0); }
		public TerminalNode T_MATERIALIZED() { return getToken(HiveParser.T_MATERIALIZED, 0); }
		public TerminalNode T_METADATA() { return getToken(HiveParser.T_METADATA, 0); }
		public TerminalNode T_MINUS() { return getToken(HiveParser.T_MINUS, 0); }
		public TerminalNode T_MINUTE() { return getToken(HiveParser.T_MINUTE, 0); }
		public TerminalNode T_MONTH() { return getToken(HiveParser.T_MONTH, 0); }
		public TerminalNode T_MSCK() { return getToken(HiveParser.T_MSCK, 0); }
		public TerminalNode T_NOSCAN() { return getToken(HiveParser.T_NOSCAN, 0); }
		public TerminalNode T_NO_DROP() { return getToken(HiveParser.T_NO_DROP, 0); }
		public TerminalNode T_OFFLINE() { return getToken(HiveParser.T_OFFLINE, 0); }
		public TerminalNode T_OPTION() { return getToken(HiveParser.T_OPTION, 0); }
		public TerminalNode T_OUTPUTDRIVER() { return getToken(HiveParser.T_OUTPUTDRIVER, 0); }
		public TerminalNode T_OUTPUTFORMAT() { return getToken(HiveParser.T_OUTPUTFORMAT, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HiveParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(HiveParser.T_OWNER, 0); }
		public TerminalNode T_PARTITIONED() { return getToken(HiveParser.T_PARTITIONED, 0); }
		public TerminalNode T_PARTITIONS() { return getToken(HiveParser.T_PARTITIONS, 0); }
		public TerminalNode T_PLUS() { return getToken(HiveParser.T_PLUS, 0); }
		public TerminalNode T_PRETTY() { return getToken(HiveParser.T_PRETTY, 0); }
		public TerminalNode T_PRINCIPALS() { return getToken(HiveParser.T_PRINCIPALS, 0); }
		public TerminalNode T_PROTECTION() { return getToken(HiveParser.T_PROTECTION, 0); }
		public TerminalNode T_PURGE() { return getToken(HiveParser.T_PURGE, 0); }
		public TerminalNode T_READ() { return getToken(HiveParser.T_READ, 0); }
		public TerminalNode T_READONLY() { return getToken(HiveParser.T_READONLY, 0); }
		public TerminalNode T_REBUILD() { return getToken(HiveParser.T_REBUILD, 0); }
		public TerminalNode T_RECORDREADER() { return getToken(HiveParser.T_RECORDREADER, 0); }
		public TerminalNode T_RECORDWRITER() { return getToken(HiveParser.T_RECORDWRITER, 0); }
		public TerminalNode T_RELOAD() { return getToken(HiveParser.T_RELOAD, 0); }
		public TerminalNode T_RENAME() { return getToken(HiveParser.T_RENAME, 0); }
		public TerminalNode T_REPAIR() { return getToken(HiveParser.T_REPAIR, 0); }
		public TerminalNode T_REPLACE() { return getToken(HiveParser.T_REPLACE, 0); }
		public TerminalNode T_REPLICATION() { return getToken(HiveParser.T_REPLICATION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HiveParser.T_RESTRICT, 0); }
		public TerminalNode T_REWRITE() { return getToken(HiveParser.T_REWRITE, 0); }
		public TerminalNode T_ROLE() { return getToken(HiveParser.T_ROLE, 0); }
		public TerminalNode T_ROLES() { return getToken(HiveParser.T_ROLES, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HiveParser.T_SCHEMA, 0); }
		public TerminalNode T_SCHEMAS() { return getToken(HiveParser.T_SCHEMAS, 0); }
		public TerminalNode T_SECOND() { return getToken(HiveParser.T_SECOND, 0); }
		public TerminalNode T_SEMI() { return getToken(HiveParser.T_SEMI, 0); }
		public TerminalNode T_SERDE() { return getToken(HiveParser.T_SERDE, 0); }
		public TerminalNode T_SERDEPROPERTIES() { return getToken(HiveParser.T_SERDEPROPERTIES, 0); }
		public TerminalNode T_SERVER() { return getToken(HiveParser.T_SERVER, 0); }
		public TerminalNode T_SETS() { return getToken(HiveParser.T_SETS, 0); }
		public TerminalNode T_SHARED() { return getToken(HiveParser.T_SHARED, 0); }
		public TerminalNode T_SHOW() { return getToken(HiveParser.T_SHOW, 0); }
		public TerminalNode T_SHOW_DATABASE() { return getToken(HiveParser.T_SHOW_DATABASE, 0); }
		public TerminalNode T_SKEWED() { return getToken(HiveParser.T_SKEWED, 0); }
		public TerminalNode T_SORT() { return getToken(HiveParser.T_SORT, 0); }
		public TerminalNode T_SORTED() { return getToken(HiveParser.T_SORTED, 0); }
		public TerminalNode T_SSL() { return getToken(HiveParser.T_SSL, 0); }
		public TerminalNode T_STATISTICS() { return getToken(HiveParser.T_STATISTICS, 0); }
		public TerminalNode T_STORED() { return getToken(HiveParser.T_STORED, 0); }
		public TerminalNode T_STREAMTABLE() { return getToken(HiveParser.T_STREAMTABLE, 0); }
		public TerminalNode T_STRING() { return getToken(HiveParser.T_STRING, 0); }
		public TerminalNode T_STRUCT() { return getToken(HiveParser.T_STRUCT, 0); }
		public TerminalNode T_TABLES() { return getToken(HiveParser.T_TABLES, 0); }
		public TerminalNode T_TBLPROPERTIES() { return getToken(HiveParser.T_TBLPROPERTIES, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HiveParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HiveParser.T_TERMINATED, 0); }
		public TerminalNode T_TINYINT() { return getToken(HiveParser.T_TINYINT, 0); }
		public TerminalNode T_TOUCH() { return getToken(HiveParser.T_TOUCH, 0); }
		public TerminalNode T_TRANSACTIONS() { return getToken(HiveParser.T_TRANSACTIONS, 0); }
		public TerminalNode T_UNARCHIVE() { return getToken(HiveParser.T_UNARCHIVE, 0); }
		public TerminalNode T_UNDO() { return getToken(HiveParser.T_UNDO, 0); }
		public TerminalNode T_UNIONTYPE() { return getToken(HiveParser.T_UNIONTYPE, 0); }
		public TerminalNode T_UNLOCK() { return getToken(HiveParser.T_UNLOCK, 0); }
		public TerminalNode T_UNSET() { return getToken(HiveParser.T_UNSET, 0); }
		public TerminalNode T_UNSIGNED() { return getToken(HiveParser.T_UNSIGNED, 0); }
		public TerminalNode T_URI() { return getToken(HiveParser.T_URI, 0); }
		public TerminalNode T_USE() { return getToken(HiveParser.T_USE, 0); }
		public TerminalNode T_UTC() { return getToken(HiveParser.T_UTC, 0); }
		public TerminalNode T_UTCTIMESTAMP() { return getToken(HiveParser.T_UTCTIMESTAMP, 0); }
		public TerminalNode T_VALUE_TYPE() { return getToken(HiveParser.T_VALUE_TYPE, 0); }
		public TerminalNode T_VIEW() { return getToken(HiveParser.T_VIEW, 0); }
		public TerminalNode T_WHILE() { return getToken(HiveParser.T_WHILE, 0); }
		public TerminalNode T_YEAR() { return getToken(HiveParser.T_YEAR, 0); }
		public TerminalNode T_ISOLATION() { return getToken(HiveParser.T_ISOLATION, 0); }
		public TerminalNode T_LEVEL() { return getToken(HiveParser.T_LEVEL, 0); }
		public TerminalNode T_OFFSET() { return getToken(HiveParser.T_OFFSET, 0); }
		public TerminalNode T_SNAPSHOT() { return getToken(HiveParser.T_SNAPSHOT, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HiveParser.T_TRANSACTION, 0); }
		public TerminalNode T_WORK() { return getToken(HiveParser.T_WORK, 0); }
		public TerminalNode T_WRITE() { return getToken(HiveParser.T_WRITE, 0); }
		public TerminalNode T_ABORT() { return getToken(HiveParser.T_ABORT, 0); }
		public TerminalNode T_KEY() { return getToken(HiveParser.T_KEY, 0); }
		public TerminalNode T_LAST() { return getToken(HiveParser.T_LAST, 0); }
		public TerminalNode T_NORELY() { return getToken(HiveParser.T_NORELY, 0); }
		public TerminalNode T_NOVALIDATE() { return getToken(HiveParser.T_NOVALIDATE, 0); }
		public TerminalNode T_NULLS() { return getToken(HiveParser.T_NULLS, 0); }
		public TerminalNode T_RELY() { return getToken(HiveParser.T_RELY, 0); }
		public TerminalNode T_VALIDATE() { return getToken(HiveParser.T_VALIDATE, 0); }
		public TerminalNode T_DETAIL() { return getToken(HiveParser.T_DETAIL, 0); }
		public TerminalNode T_DOW() { return getToken(HiveParser.T_DOW, 0); }
		public TerminalNode T_EXPRESSION() { return getToken(HiveParser.T_EXPRESSION, 0); }
		public TerminalNode T_OPERATOR() { return getToken(HiveParser.T_OPERATOR, 0); }
		public TerminalNode T_QUARTER() { return getToken(HiveParser.T_QUARTER, 0); }
		public TerminalNode T_SUMMARY() { return getToken(HiveParser.T_SUMMARY, 0); }
		public TerminalNode T_VECTORIZATION() { return getToken(HiveParser.T_VECTORIZATION, 0); }
		public TerminalNode T_WEEK() { return getToken(HiveParser.T_WEEK, 0); }
		public TerminalNode T_YEARS() { return getToken(HiveParser.T_YEARS, 0); }
		public TerminalNode T_MONTHS() { return getToken(HiveParser.T_MONTHS, 0); }
		public TerminalNode T_WEEKS() { return getToken(HiveParser.T_WEEKS, 0); }
		public TerminalNode T_DAYS() { return getToken(HiveParser.T_DAYS, 0); }
		public TerminalNode T_HOURS() { return getToken(HiveParser.T_HOURS, 0); }
		public TerminalNode T_MINUTES() { return getToken(HiveParser.T_MINUTES, 0); }
		public TerminalNode T_SECONDS() { return getToken(HiveParser.T_SECONDS, 0); }
		public TerminalNode T_TIMESTAMPTZ() { return getToken(HiveParser.T_TIMESTAMPTZ, 0); }
		public TerminalNode T_ZONE() { return getToken(HiveParser.T_ZONE, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HiveParser.T_SYSDATE, 0); }
		public TerminalNode T_NAMED_STRUCT() { return getToken(HiveParser.T_NAMED_STRUCT, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HiveParser.T_UNIQUE, 0); }
		public TerminalNode T_CHECK() { return getToken(HiveParser.T_CHECK, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HiveParser.T_DEFAULT, 0); }
		public TerminalNode T_SEQUENCEFILE() { return getToken(HiveParser.T_SEQUENCEFILE, 0); }
		public TerminalNode T_TEXTFILE() { return getToken(HiveParser.T_TEXTFILE, 0); }
		public TerminalNode T_RCFILE() { return getToken(HiveParser.T_RCFILE, 0); }
		public TerminalNode T_ORC() { return getToken(HiveParser.T_ORC, 0); }
		public TerminalNode T_PARQUET() { return getToken(HiveParser.T_PARQUET, 0); }
		public TerminalNode T_AVRO() { return getToken(HiveParser.T_AVRO, 0); }
		public TerminalNode T_JSONFILE() { return getToken(HiveParser.T_JSONFILE, 0); }
		public TerminalNode T_HIVECONF() { return getToken(HiveParser.T_HIVECONF, 0); }
		public TerminalNode T_HIVEVAR() { return getToken(HiveParser.T_HIVEVAR, 0); }
		public TerminalNode T_BYTE() { return getToken(HiveParser.T_BYTE, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_non_reserved_words);
		try {
			setState(3898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3503);
				((Non_reserved_wordsContext)_localctx).function_names = function_names();
				 ((Non_reserved_wordsContext)_localctx).res =  ((Non_reserved_wordsContext)_localctx).function_names.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3506);
				((Non_reserved_wordsContext)_localctx).T_EXIT = match(T_EXIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXIT!=null?((Non_reserved_wordsContext)_localctx).T_EXIT.getText():null); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3508);
				((Non_reserved_wordsContext)_localctx).T_ADD_W = match(T_ADD_W);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ADD_W!=null?((Non_reserved_wordsContext)_localctx).T_ADD_W.getText():null); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3510);
				((Non_reserved_wordsContext)_localctx).T_ADMIN = match(T_ADMIN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ADMIN!=null?((Non_reserved_wordsContext)_localctx).T_ADMIN.getText():null); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3512);
				((Non_reserved_wordsContext)_localctx).T_AFTER = match(T_AFTER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_AFTER!=null?((Non_reserved_wordsContext)_localctx).T_AFTER.getText():null); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3514);
				((Non_reserved_wordsContext)_localctx).T_ANALYZE = match(T_ANALYZE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ANALYZE!=null?((Non_reserved_wordsContext)_localctx).T_ANALYZE.getText():null); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3516);
				((Non_reserved_wordsContext)_localctx).T_ARCHIVE = match(T_ARCHIVE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ARCHIVE!=null?((Non_reserved_wordsContext)_localctx).T_ARCHIVE.getText():null); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3518);
				((Non_reserved_wordsContext)_localctx).T_ASC = match(T_ASC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ASC!=null?((Non_reserved_wordsContext)_localctx).T_ASC.getText():null); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3520);
				((Non_reserved_wordsContext)_localctx).T_AUTOCOMMIT = match(T_AUTOCOMMIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_AUTOCOMMIT!=null?((Non_reserved_wordsContext)_localctx).T_AUTOCOMMIT.getText():null); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3522);
				((Non_reserved_wordsContext)_localctx).T_BEFORE = match(T_BEFORE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BEFORE!=null?((Non_reserved_wordsContext)_localctx).T_BEFORE.getText():null); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3524);
				((Non_reserved_wordsContext)_localctx).T_BUCKET = match(T_BUCKET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BUCKET!=null?((Non_reserved_wordsContext)_localctx).T_BUCKET.getText():null); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3526);
				((Non_reserved_wordsContext)_localctx).T_BUCKETS = match(T_BUCKETS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BUCKETS!=null?((Non_reserved_wordsContext)_localctx).T_BUCKETS.getText():null); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3528);
				((Non_reserved_wordsContext)_localctx).T_CASCADE = match(T_CASCADE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CASCADE!=null?((Non_reserved_wordsContext)_localctx).T_CASCADE.getText():null); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3530);
				((Non_reserved_wordsContext)_localctx).T_CHANGE = match(T_CHANGE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CHANGE!=null?((Non_reserved_wordsContext)_localctx).T_CHANGE.getText():null); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3532);
				((Non_reserved_wordsContext)_localctx).T_CLUSTER = match(T_CLUSTER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CLUSTER!=null?((Non_reserved_wordsContext)_localctx).T_CLUSTER.getText():null); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3534);
				((Non_reserved_wordsContext)_localctx).T_CLUSTERED = match(T_CLUSTERED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CLUSTERED!=null?((Non_reserved_wordsContext)_localctx).T_CLUSTERED.getText():null); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3536);
				((Non_reserved_wordsContext)_localctx).T_CLUSTERSTATUS = match(T_CLUSTERSTATUS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CLUSTERSTATUS!=null?((Non_reserved_wordsContext)_localctx).T_CLUSTERSTATUS.getText():null); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3538);
				((Non_reserved_wordsContext)_localctx).T_COLLECTION = match(T_COLLECTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COLLECTION!=null?((Non_reserved_wordsContext)_localctx).T_COLLECTION.getText():null); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3540);
				((Non_reserved_wordsContext)_localctx).T_COLUMNS = match(T_COLUMNS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COLUMNS!=null?((Non_reserved_wordsContext)_localctx).T_COLUMNS.getText():null); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3542);
				((Non_reserved_wordsContext)_localctx).T_COMMENT = match(T_COMMENT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COMMENT!=null?((Non_reserved_wordsContext)_localctx).T_COMMENT.getText():null); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(3544);
				((Non_reserved_wordsContext)_localctx).T_COMPACT = match(T_COMPACT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COMPACT!=null?((Non_reserved_wordsContext)_localctx).T_COMPACT.getText():null); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(3546);
				((Non_reserved_wordsContext)_localctx).T_COMPACTIONS = match(T_COMPACTIONS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COMPACTIONS!=null?((Non_reserved_wordsContext)_localctx).T_COMPACTIONS.getText():null); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(3548);
				((Non_reserved_wordsContext)_localctx).T_COMPUTE = match(T_COMPUTE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COMPUTE!=null?((Non_reserved_wordsContext)_localctx).T_COMPUTE.getText():null); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(3550);
				((Non_reserved_wordsContext)_localctx).T_CONCATENATE = match(T_CONCATENATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CONCATENATE!=null?((Non_reserved_wordsContext)_localctx).T_CONCATENATE.getText():null); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(3552);
				((Non_reserved_wordsContext)_localctx).T_CONTINUE = match(T_CONTINUE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CONTINUE!=null?((Non_reserved_wordsContext)_localctx).T_CONTINUE.getText():null); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(3554);
				((Non_reserved_wordsContext)_localctx).T_DATA = match(T_DATA);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DATA!=null?((Non_reserved_wordsContext)_localctx).T_DATA.getText():null); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(3556);
				((Non_reserved_wordsContext)_localctx).T_DATABASES = match(T_DATABASES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DATABASES!=null?((Non_reserved_wordsContext)_localctx).T_DATABASES.getText():null); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(3558);
				((Non_reserved_wordsContext)_localctx).T_DATETIME = match(T_DATETIME);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DATETIME!=null?((Non_reserved_wordsContext)_localctx).T_DATETIME.getText():null); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(3560);
				((Non_reserved_wordsContext)_localctx).T_DAY = match(T_DAY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DAY!=null?((Non_reserved_wordsContext)_localctx).T_DAY.getText():null); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(3562);
				((Non_reserved_wordsContext)_localctx).T_DBPROPERTIES = match(T_DBPROPERTIES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DBPROPERTIES!=null?((Non_reserved_wordsContext)_localctx).T_DBPROPERTIES.getText():null); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(3564);
				((Non_reserved_wordsContext)_localctx).T_DEFERRED = match(T_DEFERRED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEFERRED!=null?((Non_reserved_wordsContext)_localctx).T_DEFERRED.getText():null); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(3566);
				((Non_reserved_wordsContext)_localctx).T_DEFINED = match(T_DEFINED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEFINED!=null?((Non_reserved_wordsContext)_localctx).T_DEFINED.getText():null); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(3568);
				((Non_reserved_wordsContext)_localctx).T_DELIMITED = match(T_DELIMITED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DELIMITED!=null?((Non_reserved_wordsContext)_localctx).T_DELIMITED.getText():null); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(3570);
				((Non_reserved_wordsContext)_localctx).T_DEPENDENCY = match(T_DEPENDENCY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEPENDENCY!=null?((Non_reserved_wordsContext)_localctx).T_DEPENDENCY.getText():null); 
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(3572);
				((Non_reserved_wordsContext)_localctx).T_DESC = match(T_DESC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DESC!=null?((Non_reserved_wordsContext)_localctx).T_DESC.getText():null); 
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(3574);
				((Non_reserved_wordsContext)_localctx).T_DIRECTORIES = match(T_DIRECTORIES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DIRECTORIES!=null?((Non_reserved_wordsContext)_localctx).T_DIRECTORIES.getText():null); 
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(3576);
				((Non_reserved_wordsContext)_localctx).T_DIRECTORY = match(T_DIRECTORY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DIRECTORY!=null?((Non_reserved_wordsContext)_localctx).T_DIRECTORY.getText():null); 
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(3578);
				((Non_reserved_wordsContext)_localctx).T_DISABLE = match(T_DISABLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DISABLE!=null?((Non_reserved_wordsContext)_localctx).T_DISABLE.getText():null); 
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(3580);
				((Non_reserved_wordsContext)_localctx).T_DISTRIBUTE = match(T_DISTRIBUTE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DISTRIBUTE!=null?((Non_reserved_wordsContext)_localctx).T_DISTRIBUTE.getText():null); 
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(3582);
				((Non_reserved_wordsContext)_localctx).T_ELEM_TYPE = match(T_ELEM_TYPE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ELEM_TYPE!=null?((Non_reserved_wordsContext)_localctx).T_ELEM_TYPE.getText():null); 
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(3584);
				((Non_reserved_wordsContext)_localctx).T_ENABLE = match(T_ENABLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ENABLE!=null?((Non_reserved_wordsContext)_localctx).T_ENABLE.getText():null); 
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(3586);
				((Non_reserved_wordsContext)_localctx).T_ESCAPED = match(T_ESCAPED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ESCAPED!=null?((Non_reserved_wordsContext)_localctx).T_ESCAPED.getText():null); 
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(3588);
				((Non_reserved_wordsContext)_localctx).T_EXCLUSIVE = match(T_EXCLUSIVE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXCLUSIVE!=null?((Non_reserved_wordsContext)_localctx).T_EXCLUSIVE.getText():null); 
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(3590);
				((Non_reserved_wordsContext)_localctx).T_EXPLAIN = match(T_EXPLAIN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXPLAIN!=null?((Non_reserved_wordsContext)_localctx).T_EXPLAIN.getText():null); 
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(3592);
				((Non_reserved_wordsContext)_localctx).T_EXPORT = match(T_EXPORT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXPORT!=null?((Non_reserved_wordsContext)_localctx).T_EXPORT.getText():null); 
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(3594);
				((Non_reserved_wordsContext)_localctx).T_FIELDS = match(T_FIELDS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FIELDS!=null?((Non_reserved_wordsContext)_localctx).T_FIELDS.getText():null); 
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(3596);
				((Non_reserved_wordsContext)_localctx).T_FILE = match(T_FILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FILE!=null?((Non_reserved_wordsContext)_localctx).T_FILE.getText():null); 
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(3598);
				((Non_reserved_wordsContext)_localctx).T_FILEFORMAT = match(T_FILEFORMAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FILEFORMAT!=null?((Non_reserved_wordsContext)_localctx).T_FILEFORMAT.getText():null); 
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(3600);
				((Non_reserved_wordsContext)_localctx).T_FIRST = match(T_FIRST);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FIRST!=null?((Non_reserved_wordsContext)_localctx).T_FIRST.getText():null); 
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(3602);
				((Non_reserved_wordsContext)_localctx).T_FORMAT = match(T_FORMAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FORMAT!=null?((Non_reserved_wordsContext)_localctx).T_FORMAT.getText():null); 
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(3604);
				((Non_reserved_wordsContext)_localctx).T_FORMATTED = match(T_FORMATTED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FORMATTED!=null?((Non_reserved_wordsContext)_localctx).T_FORMATTED.getText():null); 
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(3606);
				((Non_reserved_wordsContext)_localctx).T_FUNCTIONS = match(T_FUNCTIONS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FUNCTIONS!=null?((Non_reserved_wordsContext)_localctx).T_FUNCTIONS.getText():null); 
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(3608);
				((Non_reserved_wordsContext)_localctx).T_HOLD_DDLTIME = match(T_HOLD_DDLTIME);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HOLD_DDLTIME!=null?((Non_reserved_wordsContext)_localctx).T_HOLD_DDLTIME.getText():null); 
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(3610);
				((Non_reserved_wordsContext)_localctx).T_HOUR = match(T_HOUR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HOUR!=null?((Non_reserved_wordsContext)_localctx).T_HOUR.getText():null); 
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(3612);
				((Non_reserved_wordsContext)_localctx).T_IDXPROPERTIES = match(T_IDXPROPERTIES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_IDXPROPERTIES!=null?((Non_reserved_wordsContext)_localctx).T_IDXPROPERTIES.getText():null); 
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(3614);
				((Non_reserved_wordsContext)_localctx).T_IGNORE = match(T_IGNORE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_IGNORE!=null?((Non_reserved_wordsContext)_localctx).T_IGNORE.getText():null); 
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(3616);
				((Non_reserved_wordsContext)_localctx).T_INDEX = match(T_INDEX);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INDEX!=null?((Non_reserved_wordsContext)_localctx).T_INDEX.getText():null); 
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(3618);
				((Non_reserved_wordsContext)_localctx).T_INDEXES = match(T_INDEXES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INDEXES!=null?((Non_reserved_wordsContext)_localctx).T_INDEXES.getText():null); 
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(3620);
				((Non_reserved_wordsContext)_localctx).T_INPATH = match(T_INPATH);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INPATH!=null?((Non_reserved_wordsContext)_localctx).T_INPATH.getText():null); 
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(3622);
				((Non_reserved_wordsContext)_localctx).T_INPUTDRIVER = match(T_INPUTDRIVER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INPUTDRIVER!=null?((Non_reserved_wordsContext)_localctx).T_INPUTDRIVER.getText():null); 
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(3624);
				((Non_reserved_wordsContext)_localctx).T_INPUTFORMAT = match(T_INPUTFORMAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INPUTFORMAT!=null?((Non_reserved_wordsContext)_localctx).T_INPUTFORMAT.getText():null); 
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(3626);
				((Non_reserved_wordsContext)_localctx).T_ITEMS = match(T_ITEMS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ITEMS!=null?((Non_reserved_wordsContext)_localctx).T_ITEMS.getText():null); 
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(3628);
				((Non_reserved_wordsContext)_localctx).T_JAR = match(T_JAR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_JAR!=null?((Non_reserved_wordsContext)_localctx).T_JAR.getText():null); 
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(3630);
				((Non_reserved_wordsContext)_localctx).T_KEYS = match(T_KEYS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_KEYS!=null?((Non_reserved_wordsContext)_localctx).T_KEYS.getText():null); 
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(3632);
				((Non_reserved_wordsContext)_localctx).T_KEY_TYPE = match(T_KEY_TYPE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_KEY_TYPE!=null?((Non_reserved_wordsContext)_localctx).T_KEY_TYPE.getText():null); 
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(3634);
				((Non_reserved_wordsContext)_localctx).T_LIMIT = match(T_LIMIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LIMIT!=null?((Non_reserved_wordsContext)_localctx).T_LIMIT.getText():null); 
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(3636);
				((Non_reserved_wordsContext)_localctx).T_LINES = match(T_LINES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LINES!=null?((Non_reserved_wordsContext)_localctx).T_LINES.getText():null); 
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(3638);
				((Non_reserved_wordsContext)_localctx).T_LOAD = match(T_LOAD);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOAD!=null?((Non_reserved_wordsContext)_localctx).T_LOAD.getText():null); 
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 69);
				{
				setState(3640);
				((Non_reserved_wordsContext)_localctx).T_LOCATION = match(T_LOCATION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOCATION!=null?((Non_reserved_wordsContext)_localctx).T_LOCATION.getText():null); 
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 70);
				{
				setState(3642);
				((Non_reserved_wordsContext)_localctx).T_LOCK = match(T_LOCK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOCK!=null?((Non_reserved_wordsContext)_localctx).T_LOCK.getText():null); 
				}
				break;
			case 71:
				enterOuterAlt(_localctx, 71);
				{
				setState(3644);
				((Non_reserved_wordsContext)_localctx).T_LOCKS = match(T_LOCKS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOCKS!=null?((Non_reserved_wordsContext)_localctx).T_LOCKS.getText():null); 
				}
				break;
			case 72:
				enterOuterAlt(_localctx, 72);
				{
				setState(3646);
				((Non_reserved_wordsContext)_localctx).T_LOGICAL = match(T_LOGICAL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOGICAL!=null?((Non_reserved_wordsContext)_localctx).T_LOGICAL.getText():null); 
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 73);
				{
				setState(3648);
				((Non_reserved_wordsContext)_localctx).T_LONG = match(T_LONG);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LONG!=null?((Non_reserved_wordsContext)_localctx).T_LONG.getText():null); 
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 74);
				{
				setState(3650);
				((Non_reserved_wordsContext)_localctx).T_MAPJOIN = match(T_MAPJOIN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MAPJOIN!=null?((Non_reserved_wordsContext)_localctx).T_MAPJOIN.getText():null); 
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 75);
				{
				setState(3652);
				((Non_reserved_wordsContext)_localctx).T_MATERIALIZED = match(T_MATERIALIZED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MATERIALIZED!=null?((Non_reserved_wordsContext)_localctx).T_MATERIALIZED.getText():null); 
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 76);
				{
				setState(3654);
				((Non_reserved_wordsContext)_localctx).T_METADATA = match(T_METADATA);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_METADATA!=null?((Non_reserved_wordsContext)_localctx).T_METADATA.getText():null); 
				}
				break;
			case 77:
				enterOuterAlt(_localctx, 77);
				{
				setState(3656);
				((Non_reserved_wordsContext)_localctx).T_MINUS = match(T_MINUS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MINUS!=null?((Non_reserved_wordsContext)_localctx).T_MINUS.getText():null); 
				}
				break;
			case 78:
				enterOuterAlt(_localctx, 78);
				{
				setState(3658);
				((Non_reserved_wordsContext)_localctx).T_MINUTE = match(T_MINUTE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MINUTE!=null?((Non_reserved_wordsContext)_localctx).T_MINUTE.getText():null); 
				}
				break;
			case 79:
				enterOuterAlt(_localctx, 79);
				{
				setState(3660);
				((Non_reserved_wordsContext)_localctx).T_MONTH = match(T_MONTH);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MONTH!=null?((Non_reserved_wordsContext)_localctx).T_MONTH.getText():null); 
				}
				break;
			case 80:
				enterOuterAlt(_localctx, 80);
				{
				setState(3662);
				((Non_reserved_wordsContext)_localctx).T_MSCK = match(T_MSCK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MSCK!=null?((Non_reserved_wordsContext)_localctx).T_MSCK.getText():null); 
				}
				break;
			case 81:
				enterOuterAlt(_localctx, 81);
				{
				setState(3664);
				((Non_reserved_wordsContext)_localctx).T_NOSCAN = match(T_NOSCAN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NOSCAN!=null?((Non_reserved_wordsContext)_localctx).T_NOSCAN.getText():null); 
				}
				break;
			case 82:
				enterOuterAlt(_localctx, 82);
				{
				setState(3666);
				((Non_reserved_wordsContext)_localctx).T_NO_DROP = match(T_NO_DROP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NO_DROP!=null?((Non_reserved_wordsContext)_localctx).T_NO_DROP.getText():null); 
				}
				break;
			case 83:
				enterOuterAlt(_localctx, 83);
				{
				setState(3668);
				((Non_reserved_wordsContext)_localctx).T_OFFLINE = match(T_OFFLINE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OFFLINE!=null?((Non_reserved_wordsContext)_localctx).T_OFFLINE.getText():null); 
				}
				break;
			case 84:
				enterOuterAlt(_localctx, 84);
				{
				setState(3670);
				((Non_reserved_wordsContext)_localctx).T_OPTION = match(T_OPTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OPTION!=null?((Non_reserved_wordsContext)_localctx).T_OPTION.getText():null); 
				}
				break;
			case 85:
				enterOuterAlt(_localctx, 85);
				{
				setState(3672);
				((Non_reserved_wordsContext)_localctx).T_OUTPUTDRIVER = match(T_OUTPUTDRIVER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OUTPUTDRIVER!=null?((Non_reserved_wordsContext)_localctx).T_OUTPUTDRIVER.getText():null); 
				}
				break;
			case 86:
				enterOuterAlt(_localctx, 86);
				{
				setState(3674);
				((Non_reserved_wordsContext)_localctx).T_OUTPUTFORMAT = match(T_OUTPUTFORMAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OUTPUTFORMAT!=null?((Non_reserved_wordsContext)_localctx).T_OUTPUTFORMAT.getText():null); 
				}
				break;
			case 87:
				enterOuterAlt(_localctx, 87);
				{
				setState(3676);
				((Non_reserved_wordsContext)_localctx).T_OVERWRITE = match(T_OVERWRITE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OVERWRITE!=null?((Non_reserved_wordsContext)_localctx).T_OVERWRITE.getText():null); 
				}
				break;
			case 88:
				enterOuterAlt(_localctx, 88);
				{
				setState(3678);
				((Non_reserved_wordsContext)_localctx).T_OWNER = match(T_OWNER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OWNER!=null?((Non_reserved_wordsContext)_localctx).T_OWNER.getText():null); 
				}
				break;
			case 89:
				enterOuterAlt(_localctx, 89);
				{
				setState(3680);
				((Non_reserved_wordsContext)_localctx).T_PARTITIONED = match(T_PARTITIONED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PARTITIONED!=null?((Non_reserved_wordsContext)_localctx).T_PARTITIONED.getText():null); 
				}
				break;
			case 90:
				enterOuterAlt(_localctx, 90);
				{
				setState(3682);
				((Non_reserved_wordsContext)_localctx).T_PARTITIONS = match(T_PARTITIONS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PARTITIONS!=null?((Non_reserved_wordsContext)_localctx).T_PARTITIONS.getText():null); 
				}
				break;
			case 91:
				enterOuterAlt(_localctx, 91);
				{
				setState(3684);
				((Non_reserved_wordsContext)_localctx).T_PLUS = match(T_PLUS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PLUS!=null?((Non_reserved_wordsContext)_localctx).T_PLUS.getText():null); 
				}
				break;
			case 92:
				enterOuterAlt(_localctx, 92);
				{
				setState(3686);
				((Non_reserved_wordsContext)_localctx).T_PRETTY = match(T_PRETTY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PRETTY!=null?((Non_reserved_wordsContext)_localctx).T_PRETTY.getText():null); 
				}
				break;
			case 93:
				enterOuterAlt(_localctx, 93);
				{
				setState(3688);
				((Non_reserved_wordsContext)_localctx).T_PRINCIPALS = match(T_PRINCIPALS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PRINCIPALS!=null?((Non_reserved_wordsContext)_localctx).T_PRINCIPALS.getText():null); 
				}
				break;
			case 94:
				enterOuterAlt(_localctx, 94);
				{
				setState(3690);
				((Non_reserved_wordsContext)_localctx).T_PROTECTION = match(T_PROTECTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PROTECTION!=null?((Non_reserved_wordsContext)_localctx).T_PROTECTION.getText():null); 
				}
				break;
			case 95:
				enterOuterAlt(_localctx, 95);
				{
				setState(3692);
				((Non_reserved_wordsContext)_localctx).T_PURGE = match(T_PURGE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PURGE!=null?((Non_reserved_wordsContext)_localctx).T_PURGE.getText():null); 
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 96);
				{
				setState(3694);
				((Non_reserved_wordsContext)_localctx).T_READ = match(T_READ);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_READ!=null?((Non_reserved_wordsContext)_localctx).T_READ.getText():null); 
				}
				break;
			case 97:
				enterOuterAlt(_localctx, 97);
				{
				setState(3696);
				((Non_reserved_wordsContext)_localctx).T_READONLY = match(T_READONLY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_READONLY!=null?((Non_reserved_wordsContext)_localctx).T_READONLY.getText():null); 
				}
				break;
			case 98:
				enterOuterAlt(_localctx, 98);
				{
				setState(3698);
				((Non_reserved_wordsContext)_localctx).T_REBUILD = match(T_REBUILD);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REBUILD!=null?((Non_reserved_wordsContext)_localctx).T_REBUILD.getText():null); 
				}
				break;
			case 99:
				enterOuterAlt(_localctx, 99);
				{
				setState(3700);
				((Non_reserved_wordsContext)_localctx).T_RECORDREADER = match(T_RECORDREADER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RECORDREADER!=null?((Non_reserved_wordsContext)_localctx).T_RECORDREADER.getText():null); 
				}
				break;
			case 100:
				enterOuterAlt(_localctx, 100);
				{
				setState(3702);
				((Non_reserved_wordsContext)_localctx).T_RECORDWRITER = match(T_RECORDWRITER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RECORDWRITER!=null?((Non_reserved_wordsContext)_localctx).T_RECORDWRITER.getText():null); 
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 101);
				{
				setState(3704);
				((Non_reserved_wordsContext)_localctx).T_RELOAD = match(T_RELOAD);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RELOAD!=null?((Non_reserved_wordsContext)_localctx).T_RELOAD.getText():null); 
				}
				break;
			case 102:
				enterOuterAlt(_localctx, 102);
				{
				setState(3706);
				((Non_reserved_wordsContext)_localctx).T_RENAME = match(T_RENAME);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RENAME!=null?((Non_reserved_wordsContext)_localctx).T_RENAME.getText():null); 
				}
				break;
			case 103:
				enterOuterAlt(_localctx, 103);
				{
				setState(3708);
				((Non_reserved_wordsContext)_localctx).T_REPAIR = match(T_REPAIR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REPAIR!=null?((Non_reserved_wordsContext)_localctx).T_REPAIR.getText():null); 
				}
				break;
			case 104:
				enterOuterAlt(_localctx, 104);
				{
				setState(3710);
				((Non_reserved_wordsContext)_localctx).T_REPLACE = match(T_REPLACE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REPLACE!=null?((Non_reserved_wordsContext)_localctx).T_REPLACE.getText():null); 
				}
				break;
			case 105:
				enterOuterAlt(_localctx, 105);
				{
				setState(3712);
				((Non_reserved_wordsContext)_localctx).T_REPLICATION = match(T_REPLICATION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REPLICATION!=null?((Non_reserved_wordsContext)_localctx).T_REPLICATION.getText():null); 
				}
				break;
			case 106:
				enterOuterAlt(_localctx, 106);
				{
				setState(3714);
				((Non_reserved_wordsContext)_localctx).T_RESTRICT = match(T_RESTRICT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RESTRICT!=null?((Non_reserved_wordsContext)_localctx).T_RESTRICT.getText():null); 
				}
				break;
			case 107:
				enterOuterAlt(_localctx, 107);
				{
				setState(3716);
				((Non_reserved_wordsContext)_localctx).T_REWRITE = match(T_REWRITE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REWRITE!=null?((Non_reserved_wordsContext)_localctx).T_REWRITE.getText():null); 
				}
				break;
			case 108:
				enterOuterAlt(_localctx, 108);
				{
				setState(3718);
				((Non_reserved_wordsContext)_localctx).T_ROLE = match(T_ROLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ROLE!=null?((Non_reserved_wordsContext)_localctx).T_ROLE.getText():null); 
				}
				break;
			case 109:
				enterOuterAlt(_localctx, 109);
				{
				setState(3720);
				((Non_reserved_wordsContext)_localctx).T_ROLES = match(T_ROLES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ROLES!=null?((Non_reserved_wordsContext)_localctx).T_ROLES.getText():null); 
				}
				break;
			case 110:
				enterOuterAlt(_localctx, 110);
				{
				setState(3722);
				((Non_reserved_wordsContext)_localctx).T_SCHEMA = match(T_SCHEMA);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SCHEMA!=null?((Non_reserved_wordsContext)_localctx).T_SCHEMA.getText():null); 
				}
				break;
			case 111:
				enterOuterAlt(_localctx, 111);
				{
				setState(3724);
				((Non_reserved_wordsContext)_localctx).T_SCHEMAS = match(T_SCHEMAS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SCHEMAS!=null?((Non_reserved_wordsContext)_localctx).T_SCHEMAS.getText():null); 
				}
				break;
			case 112:
				enterOuterAlt(_localctx, 112);
				{
				setState(3726);
				((Non_reserved_wordsContext)_localctx).T_SECOND = match(T_SECOND);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SECOND!=null?((Non_reserved_wordsContext)_localctx).T_SECOND.getText():null); 
				}
				break;
			case 113:
				enterOuterAlt(_localctx, 113);
				{
				setState(3728);
				((Non_reserved_wordsContext)_localctx).T_SEMI = match(T_SEMI);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SEMI!=null?((Non_reserved_wordsContext)_localctx).T_SEMI.getText():null); 
				}
				break;
			case 114:
				enterOuterAlt(_localctx, 114);
				{
				setState(3730);
				((Non_reserved_wordsContext)_localctx).T_SERDE = match(T_SERDE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SERDE!=null?((Non_reserved_wordsContext)_localctx).T_SERDE.getText():null); 
				}
				break;
			case 115:
				enterOuterAlt(_localctx, 115);
				{
				setState(3732);
				((Non_reserved_wordsContext)_localctx).T_SERDEPROPERTIES = match(T_SERDEPROPERTIES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SERDEPROPERTIES!=null?((Non_reserved_wordsContext)_localctx).T_SERDEPROPERTIES.getText():null); 
				}
				break;
			case 116:
				enterOuterAlt(_localctx, 116);
				{
				setState(3734);
				((Non_reserved_wordsContext)_localctx).T_SERVER = match(T_SERVER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SERVER!=null?((Non_reserved_wordsContext)_localctx).T_SERVER.getText():null); 
				}
				break;
			case 117:
				enterOuterAlt(_localctx, 117);
				{
				setState(3736);
				((Non_reserved_wordsContext)_localctx).T_SETS = match(T_SETS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SETS!=null?((Non_reserved_wordsContext)_localctx).T_SETS.getText():null); 
				}
				break;
			case 118:
				enterOuterAlt(_localctx, 118);
				{
				setState(3738);
				((Non_reserved_wordsContext)_localctx).T_SHARED = match(T_SHARED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SHARED!=null?((Non_reserved_wordsContext)_localctx).T_SHARED.getText():null); 
				}
				break;
			case 119:
				enterOuterAlt(_localctx, 119);
				{
				setState(3740);
				((Non_reserved_wordsContext)_localctx).T_SHOW = match(T_SHOW);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SHOW!=null?((Non_reserved_wordsContext)_localctx).T_SHOW.getText():null); 
				}
				break;
			case 120:
				enterOuterAlt(_localctx, 120);
				{
				setState(3742);
				((Non_reserved_wordsContext)_localctx).T_SHOW_DATABASE = match(T_SHOW_DATABASE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SHOW_DATABASE!=null?((Non_reserved_wordsContext)_localctx).T_SHOW_DATABASE.getText():null); 
				}
				break;
			case 121:
				enterOuterAlt(_localctx, 121);
				{
				setState(3744);
				((Non_reserved_wordsContext)_localctx).T_SKEWED = match(T_SKEWED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SKEWED!=null?((Non_reserved_wordsContext)_localctx).T_SKEWED.getText():null); 
				}
				break;
			case 122:
				enterOuterAlt(_localctx, 122);
				{
				setState(3746);
				((Non_reserved_wordsContext)_localctx).T_SORT = match(T_SORT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SORT!=null?((Non_reserved_wordsContext)_localctx).T_SORT.getText():null); 
				}
				break;
			case 123:
				enterOuterAlt(_localctx, 123);
				{
				setState(3748);
				((Non_reserved_wordsContext)_localctx).T_SORTED = match(T_SORTED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SORTED!=null?((Non_reserved_wordsContext)_localctx).T_SORTED.getText():null); 
				}
				break;
			case 124:
				enterOuterAlt(_localctx, 124);
				{
				setState(3750);
				((Non_reserved_wordsContext)_localctx).T_SSL = match(T_SSL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SSL!=null?((Non_reserved_wordsContext)_localctx).T_SSL.getText():null); 
				}
				break;
			case 125:
				enterOuterAlt(_localctx, 125);
				{
				setState(3752);
				((Non_reserved_wordsContext)_localctx).T_STATISTICS = match(T_STATISTICS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STATISTICS!=null?((Non_reserved_wordsContext)_localctx).T_STATISTICS.getText():null); 
				}
				break;
			case 126:
				enterOuterAlt(_localctx, 126);
				{
				setState(3754);
				((Non_reserved_wordsContext)_localctx).T_STORED = match(T_STORED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STORED!=null?((Non_reserved_wordsContext)_localctx).T_STORED.getText():null); 
				}
				break;
			case 127:
				enterOuterAlt(_localctx, 127);
				{
				setState(3756);
				((Non_reserved_wordsContext)_localctx).T_STREAMTABLE = match(T_STREAMTABLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STREAMTABLE!=null?((Non_reserved_wordsContext)_localctx).T_STREAMTABLE.getText():null); 
				}
				break;
			case 128:
				enterOuterAlt(_localctx, 128);
				{
				setState(3758);
				((Non_reserved_wordsContext)_localctx).T_STRING = match(T_STRING);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STRING!=null?((Non_reserved_wordsContext)_localctx).T_STRING.getText():null); 
				}
				break;
			case 129:
				enterOuterAlt(_localctx, 129);
				{
				setState(3760);
				((Non_reserved_wordsContext)_localctx).T_STRUCT = match(T_STRUCT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STRUCT!=null?((Non_reserved_wordsContext)_localctx).T_STRUCT.getText():null); 
				}
				break;
			case 130:
				enterOuterAlt(_localctx, 130);
				{
				setState(3762);
				((Non_reserved_wordsContext)_localctx).T_TABLES = match(T_TABLES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TABLES!=null?((Non_reserved_wordsContext)_localctx).T_TABLES.getText():null); 
				}
				break;
			case 131:
				enterOuterAlt(_localctx, 131);
				{
				setState(3764);
				((Non_reserved_wordsContext)_localctx).T_TBLPROPERTIES = match(T_TBLPROPERTIES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TBLPROPERTIES!=null?((Non_reserved_wordsContext)_localctx).T_TBLPROPERTIES.getText():null); 
				}
				break;
			case 132:
				enterOuterAlt(_localctx, 132);
				{
				setState(3766);
				((Non_reserved_wordsContext)_localctx).T_TEMPORARY = match(T_TEMPORARY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TEMPORARY!=null?((Non_reserved_wordsContext)_localctx).T_TEMPORARY.getText():null); 
				}
				break;
			case 133:
				enterOuterAlt(_localctx, 133);
				{
				setState(3768);
				((Non_reserved_wordsContext)_localctx).T_TERMINATED = match(T_TERMINATED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TERMINATED!=null?((Non_reserved_wordsContext)_localctx).T_TERMINATED.getText():null); 
				}
				break;
			case 134:
				enterOuterAlt(_localctx, 134);
				{
				setState(3770);
				((Non_reserved_wordsContext)_localctx).T_TINYINT = match(T_TINYINT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TINYINT!=null?((Non_reserved_wordsContext)_localctx).T_TINYINT.getText():null); 
				}
				break;
			case 135:
				enterOuterAlt(_localctx, 135);
				{
				setState(3772);
				((Non_reserved_wordsContext)_localctx).T_TOUCH = match(T_TOUCH);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TOUCH!=null?((Non_reserved_wordsContext)_localctx).T_TOUCH.getText():null); 
				}
				break;
			case 136:
				enterOuterAlt(_localctx, 136);
				{
				setState(3774);
				((Non_reserved_wordsContext)_localctx).T_TRANSACTIONS = match(T_TRANSACTIONS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TRANSACTIONS!=null?((Non_reserved_wordsContext)_localctx).T_TRANSACTIONS.getText():null); 
				}
				break;
			case 137:
				enterOuterAlt(_localctx, 137);
				{
				setState(3776);
				((Non_reserved_wordsContext)_localctx).T_UNARCHIVE = match(T_UNARCHIVE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNARCHIVE!=null?((Non_reserved_wordsContext)_localctx).T_UNARCHIVE.getText():null); 
				}
				break;
			case 138:
				enterOuterAlt(_localctx, 138);
				{
				setState(3778);
				((Non_reserved_wordsContext)_localctx).T_UNDO = match(T_UNDO);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNDO!=null?((Non_reserved_wordsContext)_localctx).T_UNDO.getText():null); 
				}
				break;
			case 139:
				enterOuterAlt(_localctx, 139);
				{
				setState(3780);
				((Non_reserved_wordsContext)_localctx).T_UNIONTYPE = match(T_UNIONTYPE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNIONTYPE!=null?((Non_reserved_wordsContext)_localctx).T_UNIONTYPE.getText():null); 
				}
				break;
			case 140:
				enterOuterAlt(_localctx, 140);
				{
				setState(3782);
				((Non_reserved_wordsContext)_localctx).T_UNLOCK = match(T_UNLOCK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNLOCK!=null?((Non_reserved_wordsContext)_localctx).T_UNLOCK.getText():null); 
				}
				break;
			case 141:
				enterOuterAlt(_localctx, 141);
				{
				setState(3784);
				((Non_reserved_wordsContext)_localctx).T_UNSET = match(T_UNSET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNSET!=null?((Non_reserved_wordsContext)_localctx).T_UNSET.getText():null); 
				}
				break;
			case 142:
				enterOuterAlt(_localctx, 142);
				{
				setState(3786);
				((Non_reserved_wordsContext)_localctx).T_UNSIGNED = match(T_UNSIGNED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNSIGNED!=null?((Non_reserved_wordsContext)_localctx).T_UNSIGNED.getText():null); 
				}
				break;
			case 143:
				enterOuterAlt(_localctx, 143);
				{
				setState(3788);
				((Non_reserved_wordsContext)_localctx).T_URI = match(T_URI);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_URI!=null?((Non_reserved_wordsContext)_localctx).T_URI.getText():null); 
				}
				break;
			case 144:
				enterOuterAlt(_localctx, 144);
				{
				setState(3790);
				((Non_reserved_wordsContext)_localctx).T_USE = match(T_USE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_USE!=null?((Non_reserved_wordsContext)_localctx).T_USE.getText():null); 
				}
				break;
			case 145:
				enterOuterAlt(_localctx, 145);
				{
				setState(3792);
				((Non_reserved_wordsContext)_localctx).T_UTC = match(T_UTC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UTC!=null?((Non_reserved_wordsContext)_localctx).T_UTC.getText():null); 
				}
				break;
			case 146:
				enterOuterAlt(_localctx, 146);
				{
				setState(3794);
				((Non_reserved_wordsContext)_localctx).T_UTCTIMESTAMP = match(T_UTCTIMESTAMP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UTCTIMESTAMP!=null?((Non_reserved_wordsContext)_localctx).T_UTCTIMESTAMP.getText():null); 
				}
				break;
			case 147:
				enterOuterAlt(_localctx, 147);
				{
				setState(3796);
				((Non_reserved_wordsContext)_localctx).T_VALUE_TYPE = match(T_VALUE_TYPE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VALUE_TYPE!=null?((Non_reserved_wordsContext)_localctx).T_VALUE_TYPE.getText():null); 
				}
				break;
			case 148:
				enterOuterAlt(_localctx, 148);
				{
				setState(3798);
				((Non_reserved_wordsContext)_localctx).T_VIEW = match(T_VIEW);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VIEW!=null?((Non_reserved_wordsContext)_localctx).T_VIEW.getText():null); 
				}
				break;
			case 149:
				enterOuterAlt(_localctx, 149);
				{
				setState(3800);
				((Non_reserved_wordsContext)_localctx).T_WHILE = match(T_WHILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WHILE!=null?((Non_reserved_wordsContext)_localctx).T_WHILE.getText():null); 
				}
				break;
			case 150:
				enterOuterAlt(_localctx, 150);
				{
				setState(3802);
				((Non_reserved_wordsContext)_localctx).T_YEAR = match(T_YEAR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_YEAR!=null?((Non_reserved_wordsContext)_localctx).T_YEAR.getText():null); 
				}
				break;
			case 151:
				enterOuterAlt(_localctx, 151);
				{
				setState(3804);
				((Non_reserved_wordsContext)_localctx).T_ISOLATION = match(T_ISOLATION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ISOLATION!=null?((Non_reserved_wordsContext)_localctx).T_ISOLATION.getText():null); 
				}
				break;
			case 152:
				enterOuterAlt(_localctx, 152);
				{
				setState(3806);
				((Non_reserved_wordsContext)_localctx).T_LEVEL = match(T_LEVEL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LEVEL!=null?((Non_reserved_wordsContext)_localctx).T_LEVEL.getText():null); 
				}
				break;
			case 153:
				enterOuterAlt(_localctx, 153);
				{
				setState(3808);
				((Non_reserved_wordsContext)_localctx).T_OFFSET = match(T_OFFSET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OFFSET!=null?((Non_reserved_wordsContext)_localctx).T_OFFSET.getText():null); 
				}
				break;
			case 154:
				enterOuterAlt(_localctx, 154);
				{
				setState(3810);
				((Non_reserved_wordsContext)_localctx).T_SNAPSHOT = match(T_SNAPSHOT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SNAPSHOT!=null?((Non_reserved_wordsContext)_localctx).T_SNAPSHOT.getText():null); 
				}
				break;
			case 155:
				enterOuterAlt(_localctx, 155);
				{
				setState(3812);
				((Non_reserved_wordsContext)_localctx).T_TRANSACTION = match(T_TRANSACTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TRANSACTION!=null?((Non_reserved_wordsContext)_localctx).T_TRANSACTION.getText():null); 
				}
				break;
			case 156:
				enterOuterAlt(_localctx, 156);
				{
				setState(3814);
				((Non_reserved_wordsContext)_localctx).T_WORK = match(T_WORK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WORK!=null?((Non_reserved_wordsContext)_localctx).T_WORK.getText():null); 
				}
				break;
			case 157:
				enterOuterAlt(_localctx, 157);
				{
				setState(3816);
				((Non_reserved_wordsContext)_localctx).T_WRITE = match(T_WRITE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WRITE!=null?((Non_reserved_wordsContext)_localctx).T_WRITE.getText():null); 
				}
				break;
			case 158:
				enterOuterAlt(_localctx, 158);
				{
				setState(3818);
				((Non_reserved_wordsContext)_localctx).T_ABORT = match(T_ABORT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ABORT!=null?((Non_reserved_wordsContext)_localctx).T_ABORT.getText():null); 
				}
				break;
			case 159:
				enterOuterAlt(_localctx, 159);
				{
				setState(3820);
				((Non_reserved_wordsContext)_localctx).T_KEY = match(T_KEY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_KEY!=null?((Non_reserved_wordsContext)_localctx).T_KEY.getText():null); 
				}
				break;
			case 160:
				enterOuterAlt(_localctx, 160);
				{
				setState(3822);
				((Non_reserved_wordsContext)_localctx).T_LAST = match(T_LAST);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LAST!=null?((Non_reserved_wordsContext)_localctx).T_LAST.getText():null); 
				}
				break;
			case 161:
				enterOuterAlt(_localctx, 161);
				{
				setState(3824);
				((Non_reserved_wordsContext)_localctx).T_NORELY = match(T_NORELY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NORELY!=null?((Non_reserved_wordsContext)_localctx).T_NORELY.getText():null); 
				}
				break;
			case 162:
				enterOuterAlt(_localctx, 162);
				{
				setState(3826);
				((Non_reserved_wordsContext)_localctx).T_NOVALIDATE = match(T_NOVALIDATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NOVALIDATE!=null?((Non_reserved_wordsContext)_localctx).T_NOVALIDATE.getText():null); 
				}
				break;
			case 163:
				enterOuterAlt(_localctx, 163);
				{
				setState(3828);
				((Non_reserved_wordsContext)_localctx).T_NULLS = match(T_NULLS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NULLS!=null?((Non_reserved_wordsContext)_localctx).T_NULLS.getText():null); 
				}
				break;
			case 164:
				enterOuterAlt(_localctx, 164);
				{
				setState(3830);
				((Non_reserved_wordsContext)_localctx).T_RELY = match(T_RELY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RELY!=null?((Non_reserved_wordsContext)_localctx).T_RELY.getText():null); 
				}
				break;
			case 165:
				enterOuterAlt(_localctx, 165);
				{
				setState(3832);
				((Non_reserved_wordsContext)_localctx).T_VALIDATE = match(T_VALIDATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VALIDATE!=null?((Non_reserved_wordsContext)_localctx).T_VALIDATE.getText():null); 
				}
				break;
			case 166:
				enterOuterAlt(_localctx, 166);
				{
				setState(3834);
				((Non_reserved_wordsContext)_localctx).T_DETAIL = match(T_DETAIL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DETAIL!=null?((Non_reserved_wordsContext)_localctx).T_DETAIL.getText():null); 
				}
				break;
			case 167:
				enterOuterAlt(_localctx, 167);
				{
				setState(3836);
				((Non_reserved_wordsContext)_localctx).T_DOW = match(T_DOW);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DOW!=null?((Non_reserved_wordsContext)_localctx).T_DOW.getText():null); 
				}
				break;
			case 168:
				enterOuterAlt(_localctx, 168);
				{
				setState(3838);
				((Non_reserved_wordsContext)_localctx).T_EXPRESSION = match(T_EXPRESSION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXPRESSION!=null?((Non_reserved_wordsContext)_localctx).T_EXPRESSION.getText():null); 
				}
				break;
			case 169:
				enterOuterAlt(_localctx, 169);
				{
				setState(3840);
				((Non_reserved_wordsContext)_localctx).T_OPERATOR = match(T_OPERATOR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OPERATOR!=null?((Non_reserved_wordsContext)_localctx).T_OPERATOR.getText():null); 
				}
				break;
			case 170:
				enterOuterAlt(_localctx, 170);
				{
				setState(3842);
				((Non_reserved_wordsContext)_localctx).T_QUARTER = match(T_QUARTER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_QUARTER!=null?((Non_reserved_wordsContext)_localctx).T_QUARTER.getText():null); 
				}
				break;
			case 171:
				enterOuterAlt(_localctx, 171);
				{
				setState(3844);
				((Non_reserved_wordsContext)_localctx).T_SUMMARY = match(T_SUMMARY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SUMMARY!=null?((Non_reserved_wordsContext)_localctx).T_SUMMARY.getText():null); 
				}
				break;
			case 172:
				enterOuterAlt(_localctx, 172);
				{
				setState(3846);
				((Non_reserved_wordsContext)_localctx).T_VECTORIZATION = match(T_VECTORIZATION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VECTORIZATION!=null?((Non_reserved_wordsContext)_localctx).T_VECTORIZATION.getText():null); 
				}
				break;
			case 173:
				enterOuterAlt(_localctx, 173);
				{
				setState(3848);
				((Non_reserved_wordsContext)_localctx).T_WEEK = match(T_WEEK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WEEK!=null?((Non_reserved_wordsContext)_localctx).T_WEEK.getText():null); 
				}
				break;
			case 174:
				enterOuterAlt(_localctx, 174);
				{
				setState(3850);
				((Non_reserved_wordsContext)_localctx).T_YEARS = match(T_YEARS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_YEARS!=null?((Non_reserved_wordsContext)_localctx).T_YEARS.getText():null); 
				}
				break;
			case 175:
				enterOuterAlt(_localctx, 175);
				{
				setState(3852);
				((Non_reserved_wordsContext)_localctx).T_MONTHS = match(T_MONTHS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MONTHS!=null?((Non_reserved_wordsContext)_localctx).T_MONTHS.getText():null); 
				}
				break;
			case 176:
				enterOuterAlt(_localctx, 176);
				{
				setState(3854);
				((Non_reserved_wordsContext)_localctx).T_WEEKS = match(T_WEEKS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WEEKS!=null?((Non_reserved_wordsContext)_localctx).T_WEEKS.getText():null); 
				}
				break;
			case 177:
				enterOuterAlt(_localctx, 177);
				{
				setState(3856);
				((Non_reserved_wordsContext)_localctx).T_DAYS = match(T_DAYS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DAYS!=null?((Non_reserved_wordsContext)_localctx).T_DAYS.getText():null); 
				}
				break;
			case 178:
				enterOuterAlt(_localctx, 178);
				{
				setState(3858);
				((Non_reserved_wordsContext)_localctx).T_HOURS = match(T_HOURS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HOURS!=null?((Non_reserved_wordsContext)_localctx).T_HOURS.getText():null); 
				}
				break;
			case 179:
				enterOuterAlt(_localctx, 179);
				{
				setState(3860);
				((Non_reserved_wordsContext)_localctx).T_MINUTES = match(T_MINUTES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MINUTES!=null?((Non_reserved_wordsContext)_localctx).T_MINUTES.getText():null); 
				}
				break;
			case 180:
				enterOuterAlt(_localctx, 180);
				{
				setState(3862);
				((Non_reserved_wordsContext)_localctx).T_SECONDS = match(T_SECONDS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SECONDS!=null?((Non_reserved_wordsContext)_localctx).T_SECONDS.getText():null); 
				}
				break;
			case 181:
				enterOuterAlt(_localctx, 181);
				{
				setState(3864);
				((Non_reserved_wordsContext)_localctx).T_TIMESTAMPTZ = match(T_TIMESTAMPTZ);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TIMESTAMPTZ!=null?((Non_reserved_wordsContext)_localctx).T_TIMESTAMPTZ.getText():null); 
				}
				break;
			case 182:
				enterOuterAlt(_localctx, 182);
				{
				setState(3866);
				((Non_reserved_wordsContext)_localctx).T_ZONE = match(T_ZONE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ZONE!=null?((Non_reserved_wordsContext)_localctx).T_ZONE.getText():null); 
				}
				break;
			case 183:
				enterOuterAlt(_localctx, 183);
				{
				setState(3868);
				((Non_reserved_wordsContext)_localctx).T_SYSDATE = match(T_SYSDATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SYSDATE!=null?((Non_reserved_wordsContext)_localctx).T_SYSDATE.getText():null); 
				}
				break;
			case 184:
				enterOuterAlt(_localctx, 184);
				{
				setState(3870);
				((Non_reserved_wordsContext)_localctx).T_NAMED_STRUCT = match(T_NAMED_STRUCT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NAMED_STRUCT!=null?((Non_reserved_wordsContext)_localctx).T_NAMED_STRUCT.getText():null); 
				}
				break;
			case 185:
				enterOuterAlt(_localctx, 185);
				{
				setState(3872);
				((Non_reserved_wordsContext)_localctx).T_UNIQUE = match(T_UNIQUE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNIQUE!=null?((Non_reserved_wordsContext)_localctx).T_UNIQUE.getText():null); 
				}
				break;
			case 186:
				enterOuterAlt(_localctx, 186);
				{
				setState(3874);
				((Non_reserved_wordsContext)_localctx).T_CHECK = match(T_CHECK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CHECK!=null?((Non_reserved_wordsContext)_localctx).T_CHECK.getText():null); 
				}
				break;
			case 187:
				enterOuterAlt(_localctx, 187);
				{
				setState(3876);
				((Non_reserved_wordsContext)_localctx).T_DEFAULT = match(T_DEFAULT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEFAULT!=null?((Non_reserved_wordsContext)_localctx).T_DEFAULT.getText():null); 
				}
				break;
			case 188:
				enterOuterAlt(_localctx, 188);
				{
				setState(3878);
				((Non_reserved_wordsContext)_localctx).T_SEQUENCEFILE = match(T_SEQUENCEFILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SEQUENCEFILE!=null?((Non_reserved_wordsContext)_localctx).T_SEQUENCEFILE.getText():null); 
				}
				break;
			case 189:
				enterOuterAlt(_localctx, 189);
				{
				setState(3880);
				((Non_reserved_wordsContext)_localctx).T_TEXTFILE = match(T_TEXTFILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TEXTFILE!=null?((Non_reserved_wordsContext)_localctx).T_TEXTFILE.getText():null); 
				}
				break;
			case 190:
				enterOuterAlt(_localctx, 190);
				{
				setState(3882);
				((Non_reserved_wordsContext)_localctx).T_RCFILE = match(T_RCFILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RCFILE!=null?((Non_reserved_wordsContext)_localctx).T_RCFILE.getText():null); 
				}
				break;
			case 191:
				enterOuterAlt(_localctx, 191);
				{
				setState(3884);
				((Non_reserved_wordsContext)_localctx).T_ORC = match(T_ORC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ORC!=null?((Non_reserved_wordsContext)_localctx).T_ORC.getText():null); 
				}
				break;
			case 192:
				enterOuterAlt(_localctx, 192);
				{
				setState(3886);
				((Non_reserved_wordsContext)_localctx).T_PARQUET = match(T_PARQUET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PARQUET!=null?((Non_reserved_wordsContext)_localctx).T_PARQUET.getText():null); 
				}
				break;
			case 193:
				enterOuterAlt(_localctx, 193);
				{
				setState(3888);
				((Non_reserved_wordsContext)_localctx).T_AVRO = match(T_AVRO);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_AVRO!=null?((Non_reserved_wordsContext)_localctx).T_AVRO.getText():null); 
				}
				break;
			case 194:
				enterOuterAlt(_localctx, 194);
				{
				setState(3890);
				((Non_reserved_wordsContext)_localctx).T_JSONFILE = match(T_JSONFILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_JSONFILE!=null?((Non_reserved_wordsContext)_localctx).T_JSONFILE.getText():null); 
				}
				break;
			case 195:
				enterOuterAlt(_localctx, 195);
				{
				setState(3892);
				((Non_reserved_wordsContext)_localctx).T_HIVECONF = match(T_HIVECONF);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HIVECONF!=null?((Non_reserved_wordsContext)_localctx).T_HIVECONF.getText():null); 
				}
				break;
			case 196:
				enterOuterAlt(_localctx, 196);
				{
				setState(3894);
				((Non_reserved_wordsContext)_localctx).T_HIVEVAR = match(T_HIVEVAR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HIVEVAR!=null?((Non_reserved_wordsContext)_localctx).T_HIVEVAR.getText():null); 
				}
				break;
			case 197:
				enterOuterAlt(_localctx, 197);
				{
				setState(3896);
				((Non_reserved_wordsContext)_localctx).T_BYTE = match(T_BYTE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BYTE!=null?((Non_reserved_wordsContext)_localctx).T_BYTE.getText():null); 
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

	public static class Function_namesContext extends ParserRuleContext {
		public string res;
		public Token T_REGR_AVGX;
		public Token T_LOWER;
		public Token T_SHIFTRIGHT;
		public Token T_LOG;
		public Token T_ABS;
		public Token T_NULLIF;
		public Token T_ENCODE;
		public Token T_FIELD;
		public Token T_END;
		public Token T_DATE_SUB;
		public Token T_ASIN;
		public Token T_SUBSTR;
		public Token T_UNIX_TIMESTAMP;
		public Token T_DECODE;
		public Token T_STDDEV_POP;
		public Token T_SIN;
		public Token T_SORT_ARRAY;
		public Token T_BINARY;
		public Token T_CONCATENATE;
		public Token T_CURRENT_USER;
		public Token T_ASSERT_TRUE;
		public Token T_NVL;
		public Token T_SHA2;
		public Token T_DATEDIFF;
		public Token T_HISTOGRAM_NUMERIC;
		public Token T_TO_DATE;
		public Token T_NEGATIVE;
		public Token T_CONCAT_WS;
		public Token T_LEAST;
		public Token T_FIND_IN_SET;
		public Token T_CONCAT;
		public Token T_MD5;
		public Token T_SUBSTRING_INDEX;
		public Token T_E;
		public Token T_CONTEXT_NGRAMS;
		public Token T_UNHEX;
		public Token T_ELT;
		public Token T_BEGINNING;
		public Token T_AVG;
		public Token T_EXP;
		public Token T_EXTRACT;
		public Token T_QUARTER;
		public Token T_STDDEV_SAMP;
		public Token T_HASH;
		public Token T_SURROGATE_KEY;
		public Token T_FROM_UNIXTIME;
		public Token T_COLLECT_SET;
		public Token T_ASCII;
		public Token T_REGR_R2;
		public Token T_OR;
		public Token T_PERCENTILE_APPROX;
		public Token T_SIZE;
		public Token T_NGRAMS;
		public Token T_MASK_SHOW_FIRST_N;
		public Token T_EXPLODE;
		public Token T_REGR_COUNT;
		public Token T_COUNT;
		public Token T_LENGTH;
		public Token T_LOCATE;
		public Token T_ACOS;
		public Token T_REPLACE;
		public Token T_PMOD;
		public Token T_DAY;
		public Token T_CHR;
		public Token T_SPLIT;
		public Token T_UNARY;
		public Token T_MINUTE;
		public Token T_RADIANS;
		public Token T_INLINE;
		public Token T_LPAD;
		public Token T_CBRT;
		public Token T_FROM_UTC_TIMESTAMP;
		public Token T_CAST;
		public Token T_TRANSLATE;
		public Token T_CRC32;
		public Token T_OCTET_LENGTH;
		public Token T_INITCAP;
		public Token T_POSITIVE;
		public Token T_UNBASE64;
		public Token T_FACTORIAL;
		public Token T_REGEXP_EXTRACT;
		public Token T_COS;
		public Token T_MONTH;
		public Token T_NTILE;
		public Token T_SHIFTRIGHTUNSIGNED;
		public Token T_AES_ENCRYPT;
		public Token T_LAST_DAY;
		public Token T_SECOND;
		public Token T_TO_UTC_TIMESTAMP;
		public Token T_QUOTE;
		public Token T_SQRT;
		public Token T_PARSE_URL;
		public Token T_EQUAL;
		public Token T_MONTHS_BETWEEN;
		public Token T_MASK_HASH;
		public Token T_XOR;
		public Token T_LOG10;
		public Token T_SENTENCES;
		public Token T_MAP_VALUES;
		public Token T_INSTR;
		public Token T_MASK;
		public Token T_AND;
		public Token T_VARIANCE;
		public Token T_VAR_SAMP;
		public Token T_SHA1;
		public Token T_TAN;
		public Token T_ADD_MONTHS;
		public Token T_MAP_KEYS;
		public Token T_ATAN;
		public Token T_TRUNC;
		public Token T_LEVENSHTEIN;
		public Token T_YEAR;
		public Token T_ARRAY_CONTAINS;
		public Token T_MIN;
		public Token T_GET_JSON_OBJECT;
		public Token T_REGR_INTERCEPT;
		public Token T_MASK_SHOW_LAST_N;
		public Token T_RPAD;
		public Token T_PERCENTILE;
		public Token T_REGR_AVGY;
		public Token T_REGR_SYY;
		public Token T_REFLECT;
		public Token T_DATE_FORMAT;
		public Token T_CEIL;
		public Token T_CONV;
		public Token T_BASE64;
		public Token T_WEEKOFYEAR;
		public Token T_BIN;
		public Token T_STAR;
		public Token T_PLUS;
		public Token T_REGR_SXX;
		public Token T_DEGREES;
		public Token T_AES_DECRYPT;
		public Token T_MAX;
		public Token T_LOG2;
		public Token T_CURRENT_DATABASE;
		public Token T_JAVA_METHOD;
		public Token T_HOUR;
		public Token T_STACK;
		public Token T_LN;
		public Token T_CHARACTER_LENGTH;
		public Token T_ROUND;
		public Token T_RAND;
		public Token T_COLLECT_LIST;
		public Token T_REGEXP_REPLACE;
		public Token T_POW;
		public Token T_SOUNDEX;
		public Token T_IF;
		public Token T_SHIFTLEFT;
		public Token T_UPPER;
		public Token T_BROUND;
		public Token T_ISNULL;
		public Token T_COVAR_POP;
		public Token T_HEX;
		public Token T_PARENT;
		public Token T_WIDTH_BUCKET;
		public Token T_REVERSE;
		public Token T_SPACE;
		public Token T_BRACKET_OP;
		public Token T_RTRIM;
		public Token T_LTRIM;
		public Token T_TRIM;
		public Token T_FORMAT_NUMBER;
		public Token T_NEXT_DAY;
		public Token T_VERSION;
		public Token T_BUILDVERSION;
		public Token T_MASK_FIRST_N;
		public Token T_PI;
		public Token T_COALESCE;
		public Token T_STR_TO_MAP;
		public Token T_REGR_SLOPE;
		public Token T_REPEAT;
		public Token T_JSON_TUPLE;
		public Token T_MASK_LAST_N;
		public Token T_SIGN;
		public Token T_PARSE_URL_TUPLE;
		public Token T_IN_FILE;
		public Token T_SUM;
		public Token T_CORR;
		public Token T_REGR_SXY;
		public Token T_GREATEST;
		public Token T_COVAR_SAMP;
		public Token T_LOGGED_IN_USER;
		public Token T_PRINTF;
		public Token T_FLOOR;
		public Token T_POSEXPLODE;
		public Token T_DATE_ADD;
		public Token T_POWER;
		public Token T_CEILING;
		public Token T_VAR_POP;
		public Token T_XPATH;
		public Token T_XPATH_BOOLEAN;
		public Token T_XPATH_DOUBLE;
		public Token T_XPATH_FLOAT;
		public Token T_XPATH_INT;
		public Token T_XPATH_LONG;
		public Token T_XPATH_NUMBER;
		public Token T_XPATH_SHORT;
		public Token T_XPATH_STRING;
		public Token T_SHA;
		public Token T_UCASE;
		public Token T_SUBSTRING;
		public Token T_LCASE;
		public Token T_FIELD_IN_SET;
		public Token T_GET_JSON_OBJECTS;
		public Token T_IN_STR;
		public Token T_RANK;
		public Token T_DENSE_RANK;
		public Token T_ROW_NUMBER;
		public Token T_CUME_DIST;
		public Token T_PERCENT_RANK;
		public Token T_LAG;
		public Token T_LEAD;
		public TerminalNode T_REGR_AVGX() { return getToken(HiveParser.T_REGR_AVGX, 0); }
		public TerminalNode T_LOWER() { return getToken(HiveParser.T_LOWER, 0); }
		public TerminalNode T_SHIFTRIGHT() { return getToken(HiveParser.T_SHIFTRIGHT, 0); }
		public TerminalNode T_LOG() { return getToken(HiveParser.T_LOG, 0); }
		public TerminalNode T_ABS() { return getToken(HiveParser.T_ABS, 0); }
		public TerminalNode T_NULLIF() { return getToken(HiveParser.T_NULLIF, 0); }
		public TerminalNode T_ENCODE() { return getToken(HiveParser.T_ENCODE, 0); }
		public TerminalNode T_FIELD() { return getToken(HiveParser.T_FIELD, 0); }
		public TerminalNode T_END() { return getToken(HiveParser.T_END, 0); }
		public TerminalNode T_DATE_SUB() { return getToken(HiveParser.T_DATE_SUB, 0); }
		public TerminalNode T_ASIN() { return getToken(HiveParser.T_ASIN, 0); }
		public TerminalNode T_SUBSTR() { return getToken(HiveParser.T_SUBSTR, 0); }
		public TerminalNode T_UNIX_TIMESTAMP() { return getToken(HiveParser.T_UNIX_TIMESTAMP, 0); }
		public TerminalNode T_DECODE() { return getToken(HiveParser.T_DECODE, 0); }
		public TerminalNode T_STDDEV_POP() { return getToken(HiveParser.T_STDDEV_POP, 0); }
		public TerminalNode T_SIN() { return getToken(HiveParser.T_SIN, 0); }
		public TerminalNode T_SORT_ARRAY() { return getToken(HiveParser.T_SORT_ARRAY, 0); }
		public TerminalNode T_BINARY() { return getToken(HiveParser.T_BINARY, 0); }
		public TerminalNode T_CONCATENATE() { return getToken(HiveParser.T_CONCATENATE, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HiveParser.T_CURRENT_USER, 0); }
		public TerminalNode T_ASSERT_TRUE() { return getToken(HiveParser.T_ASSERT_TRUE, 0); }
		public TerminalNode T_NVL() { return getToken(HiveParser.T_NVL, 0); }
		public TerminalNode T_SHA2() { return getToken(HiveParser.T_SHA2, 0); }
		public TerminalNode T_DATEDIFF() { return getToken(HiveParser.T_DATEDIFF, 0); }
		public TerminalNode T_HISTOGRAM_NUMERIC() { return getToken(HiveParser.T_HISTOGRAM_NUMERIC, 0); }
		public TerminalNode T_TO_DATE() { return getToken(HiveParser.T_TO_DATE, 0); }
		public TerminalNode T_NEGATIVE() { return getToken(HiveParser.T_NEGATIVE, 0); }
		public TerminalNode T_CONCAT_WS() { return getToken(HiveParser.T_CONCAT_WS, 0); }
		public TerminalNode T_LEAST() { return getToken(HiveParser.T_LEAST, 0); }
		public TerminalNode T_FIND_IN_SET() { return getToken(HiveParser.T_FIND_IN_SET, 0); }
		public TerminalNode T_CONCAT() { return getToken(HiveParser.T_CONCAT, 0); }
		public TerminalNode T_MD5() { return getToken(HiveParser.T_MD5, 0); }
		public TerminalNode T_SUBSTRING_INDEX() { return getToken(HiveParser.T_SUBSTRING_INDEX, 0); }
		public TerminalNode T_E() { return getToken(HiveParser.T_E, 0); }
		public TerminalNode T_CONTEXT_NGRAMS() { return getToken(HiveParser.T_CONTEXT_NGRAMS, 0); }
		public TerminalNode T_UNHEX() { return getToken(HiveParser.T_UNHEX, 0); }
		public TerminalNode T_ELT() { return getToken(HiveParser.T_ELT, 0); }
		public TerminalNode T_BEGINNING() { return getToken(HiveParser.T_BEGINNING, 0); }
		public TerminalNode T_AVG() { return getToken(HiveParser.T_AVG, 0); }
		public TerminalNode T_EXP() { return getToken(HiveParser.T_EXP, 0); }
		public TerminalNode T_EXTRACT() { return getToken(HiveParser.T_EXTRACT, 0); }
		public TerminalNode T_QUARTER() { return getToken(HiveParser.T_QUARTER, 0); }
		public TerminalNode T_STDDEV_SAMP() { return getToken(HiveParser.T_STDDEV_SAMP, 0); }
		public TerminalNode T_HASH() { return getToken(HiveParser.T_HASH, 0); }
		public TerminalNode T_SURROGATE_KEY() { return getToken(HiveParser.T_SURROGATE_KEY, 0); }
		public TerminalNode T_FROM_UNIXTIME() { return getToken(HiveParser.T_FROM_UNIXTIME, 0); }
		public TerminalNode T_COLLECT_SET() { return getToken(HiveParser.T_COLLECT_SET, 0); }
		public TerminalNode T_ASCII() { return getToken(HiveParser.T_ASCII, 0); }
		public TerminalNode T_REGR_R2() { return getToken(HiveParser.T_REGR_R2, 0); }
		public TerminalNode T_OR() { return getToken(HiveParser.T_OR, 0); }
		public TerminalNode T_PERCENTILE_APPROX() { return getToken(HiveParser.T_PERCENTILE_APPROX, 0); }
		public TerminalNode T_SIZE() { return getToken(HiveParser.T_SIZE, 0); }
		public TerminalNode T_NGRAMS() { return getToken(HiveParser.T_NGRAMS, 0); }
		public TerminalNode T_MASK_SHOW_FIRST_N() { return getToken(HiveParser.T_MASK_SHOW_FIRST_N, 0); }
		public TerminalNode T_EXPLODE() { return getToken(HiveParser.T_EXPLODE, 0); }
		public TerminalNode T_REGR_COUNT() { return getToken(HiveParser.T_REGR_COUNT, 0); }
		public TerminalNode T_COUNT() { return getToken(HiveParser.T_COUNT, 0); }
		public TerminalNode T_LENGTH() { return getToken(HiveParser.T_LENGTH, 0); }
		public TerminalNode T_LOCATE() { return getToken(HiveParser.T_LOCATE, 0); }
		public TerminalNode T_ACOS() { return getToken(HiveParser.T_ACOS, 0); }
		public TerminalNode T_REPLACE() { return getToken(HiveParser.T_REPLACE, 0); }
		public TerminalNode T_PMOD() { return getToken(HiveParser.T_PMOD, 0); }
		public TerminalNode T_DAY() { return getToken(HiveParser.T_DAY, 0); }
		public TerminalNode T_CHR() { return getToken(HiveParser.T_CHR, 0); }
		public TerminalNode T_SPLIT() { return getToken(HiveParser.T_SPLIT, 0); }
		public TerminalNode T_UNARY() { return getToken(HiveParser.T_UNARY, 0); }
		public TerminalNode T_MINUTE() { return getToken(HiveParser.T_MINUTE, 0); }
		public TerminalNode T_RADIANS() { return getToken(HiveParser.T_RADIANS, 0); }
		public TerminalNode T_INLINE() { return getToken(HiveParser.T_INLINE, 0); }
		public TerminalNode T_LPAD() { return getToken(HiveParser.T_LPAD, 0); }
		public TerminalNode T_CBRT() { return getToken(HiveParser.T_CBRT, 0); }
		public TerminalNode T_FROM_UTC_TIMESTAMP() { return getToken(HiveParser.T_FROM_UTC_TIMESTAMP, 0); }
		public TerminalNode T_CAST() { return getToken(HiveParser.T_CAST, 0); }
		public TerminalNode T_TRANSLATE() { return getToken(HiveParser.T_TRANSLATE, 0); }
		public TerminalNode T_CRC32() { return getToken(HiveParser.T_CRC32, 0); }
		public TerminalNode T_OCTET_LENGTH() { return getToken(HiveParser.T_OCTET_LENGTH, 0); }
		public TerminalNode T_INITCAP() { return getToken(HiveParser.T_INITCAP, 0); }
		public TerminalNode T_POSITIVE() { return getToken(HiveParser.T_POSITIVE, 0); }
		public TerminalNode T_UNBASE64() { return getToken(HiveParser.T_UNBASE64, 0); }
		public TerminalNode T_FACTORIAL() { return getToken(HiveParser.T_FACTORIAL, 0); }
		public TerminalNode T_REGEXP_EXTRACT() { return getToken(HiveParser.T_REGEXP_EXTRACT, 0); }
		public TerminalNode T_COS() { return getToken(HiveParser.T_COS, 0); }
		public TerminalNode T_MONTH() { return getToken(HiveParser.T_MONTH, 0); }
		public TerminalNode T_NTILE() { return getToken(HiveParser.T_NTILE, 0); }
		public TerminalNode T_SHIFTRIGHTUNSIGNED() { return getToken(HiveParser.T_SHIFTRIGHTUNSIGNED, 0); }
		public TerminalNode T_AES_ENCRYPT() { return getToken(HiveParser.T_AES_ENCRYPT, 0); }
		public TerminalNode T_LAST_DAY() { return getToken(HiveParser.T_LAST_DAY, 0); }
		public TerminalNode T_SECOND() { return getToken(HiveParser.T_SECOND, 0); }
		public TerminalNode T_TO_UTC_TIMESTAMP() { return getToken(HiveParser.T_TO_UTC_TIMESTAMP, 0); }
		public TerminalNode T_QUOTE() { return getToken(HiveParser.T_QUOTE, 0); }
		public TerminalNode T_SQRT() { return getToken(HiveParser.T_SQRT, 0); }
		public TerminalNode T_PARSE_URL() { return getToken(HiveParser.T_PARSE_URL, 0); }
		public TerminalNode T_EQUAL() { return getToken(HiveParser.T_EQUAL, 0); }
		public TerminalNode T_MONTHS_BETWEEN() { return getToken(HiveParser.T_MONTHS_BETWEEN, 0); }
		public TerminalNode T_MASK_HASH() { return getToken(HiveParser.T_MASK_HASH, 0); }
		public TerminalNode T_XOR() { return getToken(HiveParser.T_XOR, 0); }
		public TerminalNode T_LOG10() { return getToken(HiveParser.T_LOG10, 0); }
		public TerminalNode T_SENTENCES() { return getToken(HiveParser.T_SENTENCES, 0); }
		public TerminalNode T_MAP_VALUES() { return getToken(HiveParser.T_MAP_VALUES, 0); }
		public TerminalNode T_INSTR() { return getToken(HiveParser.T_INSTR, 0); }
		public TerminalNode T_MASK() { return getToken(HiveParser.T_MASK, 0); }
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HiveParser.T_VARIANCE, 0); }
		public TerminalNode T_VAR_SAMP() { return getToken(HiveParser.T_VAR_SAMP, 0); }
		public TerminalNode T_SHA1() { return getToken(HiveParser.T_SHA1, 0); }
		public TerminalNode T_TAN() { return getToken(HiveParser.T_TAN, 0); }
		public TerminalNode T_ADD_MONTHS() { return getToken(HiveParser.T_ADD_MONTHS, 0); }
		public TerminalNode T_MAP_KEYS() { return getToken(HiveParser.T_MAP_KEYS, 0); }
		public TerminalNode T_ATAN() { return getToken(HiveParser.T_ATAN, 0); }
		public TerminalNode T_TRUNC() { return getToken(HiveParser.T_TRUNC, 0); }
		public TerminalNode T_LEVENSHTEIN() { return getToken(HiveParser.T_LEVENSHTEIN, 0); }
		public TerminalNode T_YEAR() { return getToken(HiveParser.T_YEAR, 0); }
		public TerminalNode T_ARRAY_CONTAINS() { return getToken(HiveParser.T_ARRAY_CONTAINS, 0); }
		public TerminalNode T_MIN() { return getToken(HiveParser.T_MIN, 0); }
		public TerminalNode T_GET_JSON_OBJECT() { return getToken(HiveParser.T_GET_JSON_OBJECT, 0); }
		public TerminalNode T_REGR_INTERCEPT() { return getToken(HiveParser.T_REGR_INTERCEPT, 0); }
		public TerminalNode T_MASK_SHOW_LAST_N() { return getToken(HiveParser.T_MASK_SHOW_LAST_N, 0); }
		public TerminalNode T_RPAD() { return getToken(HiveParser.T_RPAD, 0); }
		public TerminalNode T_PERCENTILE() { return getToken(HiveParser.T_PERCENTILE, 0); }
		public TerminalNode T_REGR_AVGY() { return getToken(HiveParser.T_REGR_AVGY, 0); }
		public TerminalNode T_REGR_SYY() { return getToken(HiveParser.T_REGR_SYY, 0); }
		public TerminalNode T_REFLECT() { return getToken(HiveParser.T_REFLECT, 0); }
		public TerminalNode T_DATE_FORMAT() { return getToken(HiveParser.T_DATE_FORMAT, 0); }
		public TerminalNode T_CEIL() { return getToken(HiveParser.T_CEIL, 0); }
		public TerminalNode T_CONV() { return getToken(HiveParser.T_CONV, 0); }
		public TerminalNode T_BASE64() { return getToken(HiveParser.T_BASE64, 0); }
		public TerminalNode T_WEEKOFYEAR() { return getToken(HiveParser.T_WEEKOFYEAR, 0); }
		public TerminalNode T_BIN() { return getToken(HiveParser.T_BIN, 0); }
		public TerminalNode T_STAR() { return getToken(HiveParser.T_STAR, 0); }
		public TerminalNode T_PLUS() { return getToken(HiveParser.T_PLUS, 0); }
		public TerminalNode T_REGR_SXX() { return getToken(HiveParser.T_REGR_SXX, 0); }
		public TerminalNode T_DEGREES() { return getToken(HiveParser.T_DEGREES, 0); }
		public TerminalNode T_AES_DECRYPT() { return getToken(HiveParser.T_AES_DECRYPT, 0); }
		public TerminalNode T_MAX() { return getToken(HiveParser.T_MAX, 0); }
		public TerminalNode T_LOG2() { return getToken(HiveParser.T_LOG2, 0); }
		public TerminalNode T_CURRENT_DATABASE() { return getToken(HiveParser.T_CURRENT_DATABASE, 0); }
		public TerminalNode T_JAVA_METHOD() { return getToken(HiveParser.T_JAVA_METHOD, 0); }
		public TerminalNode T_HOUR() { return getToken(HiveParser.T_HOUR, 0); }
		public TerminalNode T_STACK() { return getToken(HiveParser.T_STACK, 0); }
		public TerminalNode T_LN() { return getToken(HiveParser.T_LN, 0); }
		public TerminalNode T_CHARACTER_LENGTH() { return getToken(HiveParser.T_CHARACTER_LENGTH, 0); }
		public TerminalNode T_ROUND() { return getToken(HiveParser.T_ROUND, 0); }
		public TerminalNode T_RAND() { return getToken(HiveParser.T_RAND, 0); }
		public TerminalNode T_COLLECT_LIST() { return getToken(HiveParser.T_COLLECT_LIST, 0); }
		public TerminalNode T_REGEXP_REPLACE() { return getToken(HiveParser.T_REGEXP_REPLACE, 0); }
		public TerminalNode T_POW() { return getToken(HiveParser.T_POW, 0); }
		public TerminalNode T_SOUNDEX() { return getToken(HiveParser.T_SOUNDEX, 0); }
		public TerminalNode T_IF() { return getToken(HiveParser.T_IF, 0); }
		public TerminalNode T_SHIFTLEFT() { return getToken(HiveParser.T_SHIFTLEFT, 0); }
		public TerminalNode T_UPPER() { return getToken(HiveParser.T_UPPER, 0); }
		public TerminalNode T_BROUND() { return getToken(HiveParser.T_BROUND, 0); }
		public TerminalNode T_ISNULL() { return getToken(HiveParser.T_ISNULL, 0); }
		public TerminalNode T_COVAR_POP() { return getToken(HiveParser.T_COVAR_POP, 0); }
		public TerminalNode T_HEX() { return getToken(HiveParser.T_HEX, 0); }
		public TerminalNode T_PARENT() { return getToken(HiveParser.T_PARENT, 0); }
		public TerminalNode T_WIDTH_BUCKET() { return getToken(HiveParser.T_WIDTH_BUCKET, 0); }
		public TerminalNode T_REVERSE() { return getToken(HiveParser.T_REVERSE, 0); }
		public TerminalNode T_SPACE() { return getToken(HiveParser.T_SPACE, 0); }
		public TerminalNode T_BRACKET_OP() { return getToken(HiveParser.T_BRACKET_OP, 0); }
		public TerminalNode T_RTRIM() { return getToken(HiveParser.T_RTRIM, 0); }
		public TerminalNode T_LTRIM() { return getToken(HiveParser.T_LTRIM, 0); }
		public TerminalNode T_TRIM() { return getToken(HiveParser.T_TRIM, 0); }
		public TerminalNode T_FORMAT_NUMBER() { return getToken(HiveParser.T_FORMAT_NUMBER, 0); }
		public TerminalNode T_NEXT_DAY() { return getToken(HiveParser.T_NEXT_DAY, 0); }
		public TerminalNode T_VERSION() { return getToken(HiveParser.T_VERSION, 0); }
		public TerminalNode T_BUILDVERSION() { return getToken(HiveParser.T_BUILDVERSION, 0); }
		public TerminalNode T_MASK_FIRST_N() { return getToken(HiveParser.T_MASK_FIRST_N, 0); }
		public TerminalNode T_PI() { return getToken(HiveParser.T_PI, 0); }
		public TerminalNode T_COALESCE() { return getToken(HiveParser.T_COALESCE, 0); }
		public TerminalNode T_STR_TO_MAP() { return getToken(HiveParser.T_STR_TO_MAP, 0); }
		public TerminalNode T_REGR_SLOPE() { return getToken(HiveParser.T_REGR_SLOPE, 0); }
		public TerminalNode T_REPEAT() { return getToken(HiveParser.T_REPEAT, 0); }
		public TerminalNode T_JSON_TUPLE() { return getToken(HiveParser.T_JSON_TUPLE, 0); }
		public TerminalNode T_MASK_LAST_N() { return getToken(HiveParser.T_MASK_LAST_N, 0); }
		public TerminalNode T_SIGN() { return getToken(HiveParser.T_SIGN, 0); }
		public TerminalNode T_PARSE_URL_TUPLE() { return getToken(HiveParser.T_PARSE_URL_TUPLE, 0); }
		public TerminalNode T_IN_FILE() { return getToken(HiveParser.T_IN_FILE, 0); }
		public TerminalNode T_SUM() { return getToken(HiveParser.T_SUM, 0); }
		public TerminalNode T_CORR() { return getToken(HiveParser.T_CORR, 0); }
		public TerminalNode T_REGR_SXY() { return getToken(HiveParser.T_REGR_SXY, 0); }
		public TerminalNode T_GREATEST() { return getToken(HiveParser.T_GREATEST, 0); }
		public TerminalNode T_COVAR_SAMP() { return getToken(HiveParser.T_COVAR_SAMP, 0); }
		public TerminalNode T_LOGGED_IN_USER() { return getToken(HiveParser.T_LOGGED_IN_USER, 0); }
		public TerminalNode T_PRINTF() { return getToken(HiveParser.T_PRINTF, 0); }
		public TerminalNode T_FLOOR() { return getToken(HiveParser.T_FLOOR, 0); }
		public TerminalNode T_POSEXPLODE() { return getToken(HiveParser.T_POSEXPLODE, 0); }
		public TerminalNode T_DATE_ADD() { return getToken(HiveParser.T_DATE_ADD, 0); }
		public TerminalNode T_POWER() { return getToken(HiveParser.T_POWER, 0); }
		public TerminalNode T_CEILING() { return getToken(HiveParser.T_CEILING, 0); }
		public TerminalNode T_VAR_POP() { return getToken(HiveParser.T_VAR_POP, 0); }
		public TerminalNode T_XPATH() { return getToken(HiveParser.T_XPATH, 0); }
		public TerminalNode T_XPATH_BOOLEAN() { return getToken(HiveParser.T_XPATH_BOOLEAN, 0); }
		public TerminalNode T_XPATH_DOUBLE() { return getToken(HiveParser.T_XPATH_DOUBLE, 0); }
		public TerminalNode T_XPATH_FLOAT() { return getToken(HiveParser.T_XPATH_FLOAT, 0); }
		public TerminalNode T_XPATH_INT() { return getToken(HiveParser.T_XPATH_INT, 0); }
		public TerminalNode T_XPATH_LONG() { return getToken(HiveParser.T_XPATH_LONG, 0); }
		public TerminalNode T_XPATH_NUMBER() { return getToken(HiveParser.T_XPATH_NUMBER, 0); }
		public TerminalNode T_XPATH_SHORT() { return getToken(HiveParser.T_XPATH_SHORT, 0); }
		public TerminalNode T_XPATH_STRING() { return getToken(HiveParser.T_XPATH_STRING, 0); }
		public TerminalNode T_SHA() { return getToken(HiveParser.T_SHA, 0); }
		public TerminalNode T_UCASE() { return getToken(HiveParser.T_UCASE, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HiveParser.T_SUBSTRING, 0); }
		public TerminalNode T_LCASE() { return getToken(HiveParser.T_LCASE, 0); }
		public TerminalNode T_FIELD_IN_SET() { return getToken(HiveParser.T_FIELD_IN_SET, 0); }
		public TerminalNode T_GET_JSON_OBJECTS() { return getToken(HiveParser.T_GET_JSON_OBJECTS, 0); }
		public TerminalNode T_IN_STR() { return getToken(HiveParser.T_IN_STR, 0); }
		public TerminalNode T_RANK() { return getToken(HiveParser.T_RANK, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HiveParser.T_DENSE_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HiveParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HiveParser.T_CUME_DIST, 0); }
		public TerminalNode T_PERCENT_RANK() { return getToken(HiveParser.T_PERCENT_RANK, 0); }
		public TerminalNode T_LAG() { return getToken(HiveParser.T_LAG, 0); }
		public TerminalNode T_LEAD() { return getToken(HiveParser.T_LEAD, 0); }
		public Function_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_names; }
	}

	public final Function_namesContext function_names() throws RecognitionException {
		Function_namesContext _localctx = new Function_namesContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_function_names);
		try {
			setState(4326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_REGR_AVGX:
				enterOuterAlt(_localctx, 1);
				{
				setState(3900);
				((Function_namesContext)_localctx).T_REGR_AVGX = match(T_REGR_AVGX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_AVGX!=null?((Function_namesContext)_localctx).T_REGR_AVGX.getText():null); 
				}
				break;
			case T_LOWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(3902);
				((Function_namesContext)_localctx).T_LOWER = match(T_LOWER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOWER!=null?((Function_namesContext)_localctx).T_LOWER.getText():null); 
				}
				break;
			case T_SHIFTRIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(3904);
				((Function_namesContext)_localctx).T_SHIFTRIGHT = match(T_SHIFTRIGHT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHIFTRIGHT!=null?((Function_namesContext)_localctx).T_SHIFTRIGHT.getText():null); 
				}
				break;
			case T_LOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(3906);
				((Function_namesContext)_localctx).T_LOG = match(T_LOG);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOG!=null?((Function_namesContext)_localctx).T_LOG.getText():null); 
				}
				break;
			case T_ABS:
				enterOuterAlt(_localctx, 5);
				{
				setState(3908);
				((Function_namesContext)_localctx).T_ABS = match(T_ABS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ABS!=null?((Function_namesContext)_localctx).T_ABS.getText():null); 
				}
				break;
			case T_NULLIF:
				enterOuterAlt(_localctx, 6);
				{
				setState(3910);
				((Function_namesContext)_localctx).T_NULLIF = match(T_NULLIF);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NULLIF!=null?((Function_namesContext)_localctx).T_NULLIF.getText():null); 
				}
				break;
			case T_ENCODE:
				enterOuterAlt(_localctx, 7);
				{
				setState(3912);
				((Function_namesContext)_localctx).T_ENCODE = match(T_ENCODE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ENCODE!=null?((Function_namesContext)_localctx).T_ENCODE.getText():null); 
				}
				break;
			case T_FIELD:
				enterOuterAlt(_localctx, 8);
				{
				setState(3914);
				((Function_namesContext)_localctx).T_FIELD = match(T_FIELD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FIELD!=null?((Function_namesContext)_localctx).T_FIELD.getText():null); 
				}
				break;
			case T_END:
				enterOuterAlt(_localctx, 9);
				{
				setState(3916);
				((Function_namesContext)_localctx).T_END = match(T_END);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_END!=null?((Function_namesContext)_localctx).T_END.getText():null); 
				}
				break;
			case T_DATE_SUB:
				enterOuterAlt(_localctx, 10);
				{
				setState(3918);
				((Function_namesContext)_localctx).T_DATE_SUB = match(T_DATE_SUB);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DATE_SUB!=null?((Function_namesContext)_localctx).T_DATE_SUB.getText():null); 
				}
				break;
			case T_ASIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(3920);
				((Function_namesContext)_localctx).T_ASIN = match(T_ASIN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ASIN!=null?((Function_namesContext)_localctx).T_ASIN.getText():null); 
				}
				break;
			case T_SUBSTR:
				enterOuterAlt(_localctx, 12);
				{
				setState(3922);
				((Function_namesContext)_localctx).T_SUBSTR = match(T_SUBSTR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SUBSTR!=null?((Function_namesContext)_localctx).T_SUBSTR.getText():null); 
				}
				break;
			case T_UNIX_TIMESTAMP:
				enterOuterAlt(_localctx, 13);
				{
				setState(3924);
				((Function_namesContext)_localctx).T_UNIX_TIMESTAMP = match(T_UNIX_TIMESTAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UNIX_TIMESTAMP!=null?((Function_namesContext)_localctx).T_UNIX_TIMESTAMP.getText():null); 
				}
				break;
			case T_DECODE:
				enterOuterAlt(_localctx, 14);
				{
				setState(3926);
				((Function_namesContext)_localctx).T_DECODE = match(T_DECODE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DECODE!=null?((Function_namesContext)_localctx).T_DECODE.getText():null); 
				}
				break;
			case T_STDDEV_POP:
				enterOuterAlt(_localctx, 15);
				{
				setState(3928);
				((Function_namesContext)_localctx).T_STDDEV_POP = match(T_STDDEV_POP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_STDDEV_POP!=null?((Function_namesContext)_localctx).T_STDDEV_POP.getText():null); 
				}
				break;
			case T_SIN:
				enterOuterAlt(_localctx, 16);
				{
				setState(3930);
				((Function_namesContext)_localctx).T_SIN = match(T_SIN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SIN!=null?((Function_namesContext)_localctx).T_SIN.getText():null); 
				}
				break;
			case T_SORT_ARRAY:
				enterOuterAlt(_localctx, 17);
				{
				setState(3932);
				((Function_namesContext)_localctx).T_SORT_ARRAY = match(T_SORT_ARRAY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SORT_ARRAY!=null?((Function_namesContext)_localctx).T_SORT_ARRAY.getText():null); 
				}
				break;
			case T_BINARY:
				enterOuterAlt(_localctx, 18);
				{
				setState(3934);
				((Function_namesContext)_localctx).T_BINARY = match(T_BINARY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BINARY!=null?((Function_namesContext)_localctx).T_BINARY.getText():null); 
				}
				break;
			case T_CONCATENATE:
				enterOuterAlt(_localctx, 19);
				{
				setState(3936);
				((Function_namesContext)_localctx).T_CONCATENATE = match(T_CONCATENATE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CONCATENATE!=null?((Function_namesContext)_localctx).T_CONCATENATE.getText():null); 
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 20);
				{
				setState(3938);
				((Function_namesContext)_localctx).T_CURRENT_USER = match(T_CURRENT_USER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CURRENT_USER!=null?((Function_namesContext)_localctx).T_CURRENT_USER.getText():null); 
				}
				break;
			case T_ASSERT_TRUE:
				enterOuterAlt(_localctx, 21);
				{
				setState(3940);
				((Function_namesContext)_localctx).T_ASSERT_TRUE = match(T_ASSERT_TRUE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ASSERT_TRUE!=null?((Function_namesContext)_localctx).T_ASSERT_TRUE.getText():null); 
				}
				break;
			case T_NVL:
				enterOuterAlt(_localctx, 22);
				{
				setState(3942);
				((Function_namesContext)_localctx).T_NVL = match(T_NVL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NVL!=null?((Function_namesContext)_localctx).T_NVL.getText():null); 
				}
				break;
			case T_SHA2:
				enterOuterAlt(_localctx, 23);
				{
				setState(3944);
				((Function_namesContext)_localctx).T_SHA2 = match(T_SHA2);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHA2!=null?((Function_namesContext)_localctx).T_SHA2.getText():null); 
				}
				break;
			case T_DATEDIFF:
				enterOuterAlt(_localctx, 24);
				{
				setState(3946);
				((Function_namesContext)_localctx).T_DATEDIFF = match(T_DATEDIFF);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DATEDIFF!=null?((Function_namesContext)_localctx).T_DATEDIFF.getText():null); 
				}
				break;
			case T_HISTOGRAM_NUMERIC:
				enterOuterAlt(_localctx, 25);
				{
				setState(3948);
				((Function_namesContext)_localctx).T_HISTOGRAM_NUMERIC = match(T_HISTOGRAM_NUMERIC);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_HISTOGRAM_NUMERIC!=null?((Function_namesContext)_localctx).T_HISTOGRAM_NUMERIC.getText():null); 
				}
				break;
			case T_TO_DATE:
				enterOuterAlt(_localctx, 26);
				{
				setState(3950);
				((Function_namesContext)_localctx).T_TO_DATE = match(T_TO_DATE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TO_DATE!=null?((Function_namesContext)_localctx).T_TO_DATE.getText():null); 
				}
				break;
			case T_NEGATIVE:
				enterOuterAlt(_localctx, 27);
				{
				setState(3952);
				((Function_namesContext)_localctx).T_NEGATIVE = match(T_NEGATIVE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NEGATIVE!=null?((Function_namesContext)_localctx).T_NEGATIVE.getText():null); 
				}
				break;
			case T_CONCAT_WS:
				enterOuterAlt(_localctx, 28);
				{
				setState(3954);
				((Function_namesContext)_localctx).T_CONCAT_WS = match(T_CONCAT_WS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CONCAT_WS!=null?((Function_namesContext)_localctx).T_CONCAT_WS.getText():null); 
				}
				break;
			case T_LEAST:
				enterOuterAlt(_localctx, 29);
				{
				setState(3956);
				((Function_namesContext)_localctx).T_LEAST = match(T_LEAST);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LEAST!=null?((Function_namesContext)_localctx).T_LEAST.getText():null); 
				}
				break;
			case T_FIND_IN_SET:
				enterOuterAlt(_localctx, 30);
				{
				setState(3958);
				((Function_namesContext)_localctx).T_FIND_IN_SET = match(T_FIND_IN_SET);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FIND_IN_SET!=null?((Function_namesContext)_localctx).T_FIND_IN_SET.getText():null); 
				}
				break;
			case T_CONCAT:
				enterOuterAlt(_localctx, 31);
				{
				setState(3960);
				((Function_namesContext)_localctx).T_CONCAT = match(T_CONCAT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CONCAT!=null?((Function_namesContext)_localctx).T_CONCAT.getText():null); 
				}
				break;
			case T_MD5:
				enterOuterAlt(_localctx, 32);
				{
				setState(3962);
				((Function_namesContext)_localctx).T_MD5 = match(T_MD5);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MD5!=null?((Function_namesContext)_localctx).T_MD5.getText():null); 
				}
				break;
			case T_SUBSTRING_INDEX:
				enterOuterAlt(_localctx, 33);
				{
				setState(3964);
				((Function_namesContext)_localctx).T_SUBSTRING_INDEX = match(T_SUBSTRING_INDEX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SUBSTRING_INDEX!=null?((Function_namesContext)_localctx).T_SUBSTRING_INDEX.getText():null); 
				}
				break;
			case T_E:
				enterOuterAlt(_localctx, 34);
				{
				setState(3966);
				((Function_namesContext)_localctx).T_E = match(T_E);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_E!=null?((Function_namesContext)_localctx).T_E.getText():null); 
				}
				break;
			case T_CONTEXT_NGRAMS:
				enterOuterAlt(_localctx, 35);
				{
				setState(3968);
				((Function_namesContext)_localctx).T_CONTEXT_NGRAMS = match(T_CONTEXT_NGRAMS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CONTEXT_NGRAMS!=null?((Function_namesContext)_localctx).T_CONTEXT_NGRAMS.getText():null); 
				}
				break;
			case T_UNHEX:
				enterOuterAlt(_localctx, 36);
				{
				setState(3970);
				((Function_namesContext)_localctx).T_UNHEX = match(T_UNHEX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UNHEX!=null?((Function_namesContext)_localctx).T_UNHEX.getText():null); 
				}
				break;
			case T_ELT:
				enterOuterAlt(_localctx, 37);
				{
				setState(3972);
				((Function_namesContext)_localctx).T_ELT = match(T_ELT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ELT!=null?((Function_namesContext)_localctx).T_ELT.getText():null); 
				}
				break;
			case T_BEGINNING:
				enterOuterAlt(_localctx, 38);
				{
				setState(3974);
				((Function_namesContext)_localctx).T_BEGINNING = match(T_BEGINNING);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BEGINNING!=null?((Function_namesContext)_localctx).T_BEGINNING.getText():null); 
				}
				break;
			case T_AVG:
				enterOuterAlt(_localctx, 39);
				{
				setState(3976);
				((Function_namesContext)_localctx).T_AVG = match(T_AVG);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_AVG!=null?((Function_namesContext)_localctx).T_AVG.getText():null); 
				}
				break;
			case T_EXP:
				enterOuterAlt(_localctx, 40);
				{
				setState(3978);
				((Function_namesContext)_localctx).T_EXP = match(T_EXP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_EXP!=null?((Function_namesContext)_localctx).T_EXP.getText():null); 
				}
				break;
			case T_EXTRACT:
				enterOuterAlt(_localctx, 41);
				{
				setState(3980);
				((Function_namesContext)_localctx).T_EXTRACT = match(T_EXTRACT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_EXTRACT!=null?((Function_namesContext)_localctx).T_EXTRACT.getText():null); 
				}
				break;
			case T_QUARTER:
				enterOuterAlt(_localctx, 42);
				{
				setState(3982);
				((Function_namesContext)_localctx).T_QUARTER = match(T_QUARTER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_QUARTER!=null?((Function_namesContext)_localctx).T_QUARTER.getText():null); 
				}
				break;
			case T_STDDEV_SAMP:
				enterOuterAlt(_localctx, 43);
				{
				setState(3984);
				((Function_namesContext)_localctx).T_STDDEV_SAMP = match(T_STDDEV_SAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_STDDEV_SAMP!=null?((Function_namesContext)_localctx).T_STDDEV_SAMP.getText():null); 
				}
				break;
			case T_HASH:
				enterOuterAlt(_localctx, 44);
				{
				setState(3986);
				((Function_namesContext)_localctx).T_HASH = match(T_HASH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_HASH!=null?((Function_namesContext)_localctx).T_HASH.getText():null); 
				}
				break;
			case T_SURROGATE_KEY:
				enterOuterAlt(_localctx, 45);
				{
				setState(3988);
				((Function_namesContext)_localctx).T_SURROGATE_KEY = match(T_SURROGATE_KEY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SURROGATE_KEY!=null?((Function_namesContext)_localctx).T_SURROGATE_KEY.getText():null); 
				}
				break;
			case T_FROM_UNIXTIME:
				enterOuterAlt(_localctx, 46);
				{
				setState(3990);
				((Function_namesContext)_localctx).T_FROM_UNIXTIME = match(T_FROM_UNIXTIME);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FROM_UNIXTIME!=null?((Function_namesContext)_localctx).T_FROM_UNIXTIME.getText():null); 
				}
				break;
			case T_COLLECT_SET:
				enterOuterAlt(_localctx, 47);
				{
				setState(3992);
				((Function_namesContext)_localctx).T_COLLECT_SET = match(T_COLLECT_SET);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COLLECT_SET!=null?((Function_namesContext)_localctx).T_COLLECT_SET.getText():null); 
				}
				break;
			case T_ASCII:
				enterOuterAlt(_localctx, 48);
				{
				setState(3994);
				((Function_namesContext)_localctx).T_ASCII = match(T_ASCII);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ASCII!=null?((Function_namesContext)_localctx).T_ASCII.getText():null); 
				}
				break;
			case T_REGR_R2:
				enterOuterAlt(_localctx, 49);
				{
				setState(3996);
				((Function_namesContext)_localctx).T_REGR_R2 = match(T_REGR_R2);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_R2!=null?((Function_namesContext)_localctx).T_REGR_R2.getText():null); 
				}
				break;
			case T_OR:
				enterOuterAlt(_localctx, 50);
				{
				setState(3998);
				((Function_namesContext)_localctx).T_OR = match(T_OR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_OR!=null?((Function_namesContext)_localctx).T_OR.getText():null); 
				}
				break;
			case T_PERCENTILE_APPROX:
				enterOuterAlt(_localctx, 51);
				{
				setState(4000);
				((Function_namesContext)_localctx).T_PERCENTILE_APPROX = match(T_PERCENTILE_APPROX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PERCENTILE_APPROX!=null?((Function_namesContext)_localctx).T_PERCENTILE_APPROX.getText():null); 
				}
				break;
			case T_SIZE:
				enterOuterAlt(_localctx, 52);
				{
				setState(4002);
				((Function_namesContext)_localctx).T_SIZE = match(T_SIZE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SIZE!=null?((Function_namesContext)_localctx).T_SIZE.getText():null); 
				}
				break;
			case T_NGRAMS:
				enterOuterAlt(_localctx, 53);
				{
				setState(4004);
				((Function_namesContext)_localctx).T_NGRAMS = match(T_NGRAMS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NGRAMS!=null?((Function_namesContext)_localctx).T_NGRAMS.getText():null); 
				}
				break;
			case T_MASK_SHOW_FIRST_N:
				enterOuterAlt(_localctx, 54);
				{
				setState(4006);
				((Function_namesContext)_localctx).T_MASK_SHOW_FIRST_N = match(T_MASK_SHOW_FIRST_N);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK_SHOW_FIRST_N!=null?((Function_namesContext)_localctx).T_MASK_SHOW_FIRST_N.getText():null); 
				}
				break;
			case T_EXPLODE:
				enterOuterAlt(_localctx, 55);
				{
				setState(4008);
				((Function_namesContext)_localctx).T_EXPLODE = match(T_EXPLODE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_EXPLODE!=null?((Function_namesContext)_localctx).T_EXPLODE.getText():null); 
				}
				break;
			case T_REGR_COUNT:
				enterOuterAlt(_localctx, 56);
				{
				setState(4010);
				((Function_namesContext)_localctx).T_REGR_COUNT = match(T_REGR_COUNT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_COUNT!=null?((Function_namesContext)_localctx).T_REGR_COUNT.getText():null); 
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 57);
				{
				setState(4012);
				((Function_namesContext)_localctx).T_COUNT = match(T_COUNT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COUNT!=null?((Function_namesContext)_localctx).T_COUNT.getText():null); 
				}
				break;
			case T_LENGTH:
				enterOuterAlt(_localctx, 58);
				{
				setState(4014);
				((Function_namesContext)_localctx).T_LENGTH = match(T_LENGTH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LENGTH!=null?((Function_namesContext)_localctx).T_LENGTH.getText():null); 
				}
				break;
			case T_LOCATE:
				enterOuterAlt(_localctx, 59);
				{
				setState(4016);
				((Function_namesContext)_localctx).T_LOCATE = match(T_LOCATE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOCATE!=null?((Function_namesContext)_localctx).T_LOCATE.getText():null); 
				}
				break;
			case T_ACOS:
				enterOuterAlt(_localctx, 60);
				{
				setState(4018);
				((Function_namesContext)_localctx).T_ACOS = match(T_ACOS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ACOS!=null?((Function_namesContext)_localctx).T_ACOS.getText():null); 
				}
				break;
			case T_REPLACE:
				enterOuterAlt(_localctx, 61);
				{
				setState(4020);
				((Function_namesContext)_localctx).T_REPLACE = match(T_REPLACE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REPLACE!=null?((Function_namesContext)_localctx).T_REPLACE.getText():null); 
				}
				break;
			case T_PMOD:
				enterOuterAlt(_localctx, 62);
				{
				setState(4022);
				((Function_namesContext)_localctx).T_PMOD = match(T_PMOD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PMOD!=null?((Function_namesContext)_localctx).T_PMOD.getText():null); 
				}
				break;
			case T_DAY:
				enterOuterAlt(_localctx, 63);
				{
				setState(4024);
				((Function_namesContext)_localctx).T_DAY = match(T_DAY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DAY!=null?((Function_namesContext)_localctx).T_DAY.getText():null); 
				}
				break;
			case T_CHR:
				enterOuterAlt(_localctx, 64);
				{
				setState(4026);
				((Function_namesContext)_localctx).T_CHR = match(T_CHR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CHR!=null?((Function_namesContext)_localctx).T_CHR.getText():null); 
				}
				break;
			case T_SPLIT:
				enterOuterAlt(_localctx, 65);
				{
				setState(4028);
				((Function_namesContext)_localctx).T_SPLIT = match(T_SPLIT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SPLIT!=null?((Function_namesContext)_localctx).T_SPLIT.getText():null); 
				}
				break;
			case T_UNARY:
				enterOuterAlt(_localctx, 66);
				{
				setState(4030);
				((Function_namesContext)_localctx).T_UNARY = match(T_UNARY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UNARY!=null?((Function_namesContext)_localctx).T_UNARY.getText():null); 
				}
				break;
			case T_MINUTE:
				enterOuterAlt(_localctx, 67);
				{
				setState(4032);
				((Function_namesContext)_localctx).T_MINUTE = match(T_MINUTE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MINUTE!=null?((Function_namesContext)_localctx).T_MINUTE.getText():null); 
				}
				break;
			case T_RADIANS:
				enterOuterAlt(_localctx, 68);
				{
				setState(4034);
				((Function_namesContext)_localctx).T_RADIANS = match(T_RADIANS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_RADIANS!=null?((Function_namesContext)_localctx).T_RADIANS.getText():null); 
				}
				break;
			case T_INLINE:
				enterOuterAlt(_localctx, 69);
				{
				setState(4036);
				((Function_namesContext)_localctx).T_INLINE = match(T_INLINE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_INLINE!=null?((Function_namesContext)_localctx).T_INLINE.getText():null); 
				}
				break;
			case T_LPAD:
				enterOuterAlt(_localctx, 70);
				{
				setState(4038);
				((Function_namesContext)_localctx).T_LPAD = match(T_LPAD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LPAD!=null?((Function_namesContext)_localctx).T_LPAD.getText():null); 
				}
				break;
			case T_CBRT:
				enterOuterAlt(_localctx, 71);
				{
				setState(4040);
				((Function_namesContext)_localctx).T_CBRT = match(T_CBRT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CBRT!=null?((Function_namesContext)_localctx).T_CBRT.getText():null); 
				}
				break;
			case T_FROM_UTC_TIMESTAMP:
				enterOuterAlt(_localctx, 72);
				{
				setState(4042);
				((Function_namesContext)_localctx).T_FROM_UTC_TIMESTAMP = match(T_FROM_UTC_TIMESTAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FROM_UTC_TIMESTAMP!=null?((Function_namesContext)_localctx).T_FROM_UTC_TIMESTAMP.getText():null); 
				}
				break;
			case T_CAST:
				enterOuterAlt(_localctx, 73);
				{
				setState(4044);
				((Function_namesContext)_localctx).T_CAST = match(T_CAST);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CAST!=null?((Function_namesContext)_localctx).T_CAST.getText():null); 
				}
				break;
			case T_TRANSLATE:
				enterOuterAlt(_localctx, 74);
				{
				setState(4046);
				((Function_namesContext)_localctx).T_TRANSLATE = match(T_TRANSLATE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TRANSLATE!=null?((Function_namesContext)_localctx).T_TRANSLATE.getText():null); 
				}
				break;
			case T_CRC32:
				enterOuterAlt(_localctx, 75);
				{
				setState(4048);
				((Function_namesContext)_localctx).T_CRC32 = match(T_CRC32);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CRC32!=null?((Function_namesContext)_localctx).T_CRC32.getText():null); 
				}
				break;
			case T_OCTET_LENGTH:
				enterOuterAlt(_localctx, 76);
				{
				setState(4050);
				((Function_namesContext)_localctx).T_OCTET_LENGTH = match(T_OCTET_LENGTH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_OCTET_LENGTH!=null?((Function_namesContext)_localctx).T_OCTET_LENGTH.getText():null); 
				}
				break;
			case T_INITCAP:
				enterOuterAlt(_localctx, 77);
				{
				setState(4052);
				((Function_namesContext)_localctx).T_INITCAP = match(T_INITCAP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_INITCAP!=null?((Function_namesContext)_localctx).T_INITCAP.getText():null); 
				}
				break;
			case T_POSITIVE:
				enterOuterAlt(_localctx, 78);
				{
				setState(4054);
				((Function_namesContext)_localctx).T_POSITIVE = match(T_POSITIVE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_POSITIVE!=null?((Function_namesContext)_localctx).T_POSITIVE.getText():null); 
				}
				break;
			case T_UNBASE64:
				enterOuterAlt(_localctx, 79);
				{
				setState(4056);
				((Function_namesContext)_localctx).T_UNBASE64 = match(T_UNBASE64);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UNBASE64!=null?((Function_namesContext)_localctx).T_UNBASE64.getText():null); 
				}
				break;
			case T_FACTORIAL:
				enterOuterAlt(_localctx, 80);
				{
				setState(4058);
				((Function_namesContext)_localctx).T_FACTORIAL = match(T_FACTORIAL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FACTORIAL!=null?((Function_namesContext)_localctx).T_FACTORIAL.getText():null); 
				}
				break;
			case T_REGEXP_EXTRACT:
				enterOuterAlt(_localctx, 81);
				{
				setState(4060);
				((Function_namesContext)_localctx).T_REGEXP_EXTRACT = match(T_REGEXP_EXTRACT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGEXP_EXTRACT!=null?((Function_namesContext)_localctx).T_REGEXP_EXTRACT.getText():null); 
				}
				break;
			case T_COS:
				enterOuterAlt(_localctx, 82);
				{
				setState(4062);
				((Function_namesContext)_localctx).T_COS = match(T_COS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COS!=null?((Function_namesContext)_localctx).T_COS.getText():null); 
				}
				break;
			case T_MONTH:
				enterOuterAlt(_localctx, 83);
				{
				setState(4064);
				((Function_namesContext)_localctx).T_MONTH = match(T_MONTH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MONTH!=null?((Function_namesContext)_localctx).T_MONTH.getText():null); 
				}
				break;
			case T_NTILE:
				enterOuterAlt(_localctx, 84);
				{
				setState(4066);
				((Function_namesContext)_localctx).T_NTILE = match(T_NTILE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NTILE!=null?((Function_namesContext)_localctx).T_NTILE.getText():null); 
				}
				break;
			case T_SHIFTRIGHTUNSIGNED:
				enterOuterAlt(_localctx, 85);
				{
				setState(4068);
				((Function_namesContext)_localctx).T_SHIFTRIGHTUNSIGNED = match(T_SHIFTRIGHTUNSIGNED);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHIFTRIGHTUNSIGNED!=null?((Function_namesContext)_localctx).T_SHIFTRIGHTUNSIGNED.getText():null); 
				}
				break;
			case T_AES_ENCRYPT:
				enterOuterAlt(_localctx, 86);
				{
				setState(4070);
				((Function_namesContext)_localctx).T_AES_ENCRYPT = match(T_AES_ENCRYPT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_AES_ENCRYPT!=null?((Function_namesContext)_localctx).T_AES_ENCRYPT.getText():null); 
				}
				break;
			case T_LAST_DAY:
				enterOuterAlt(_localctx, 87);
				{
				setState(4072);
				((Function_namesContext)_localctx).T_LAST_DAY = match(T_LAST_DAY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LAST_DAY!=null?((Function_namesContext)_localctx).T_LAST_DAY.getText():null); 
				}
				break;
			case T_SECOND:
				enterOuterAlt(_localctx, 88);
				{
				setState(4074);
				((Function_namesContext)_localctx).T_SECOND = match(T_SECOND);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SECOND!=null?((Function_namesContext)_localctx).T_SECOND.getText():null); 
				}
				break;
			case T_TO_UTC_TIMESTAMP:
				enterOuterAlt(_localctx, 89);
				{
				setState(4076);
				((Function_namesContext)_localctx).T_TO_UTC_TIMESTAMP = match(T_TO_UTC_TIMESTAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TO_UTC_TIMESTAMP!=null?((Function_namesContext)_localctx).T_TO_UTC_TIMESTAMP.getText():null); 
				}
				break;
			case T_QUOTE:
				enterOuterAlt(_localctx, 90);
				{
				setState(4078);
				((Function_namesContext)_localctx).T_QUOTE = match(T_QUOTE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_QUOTE!=null?((Function_namesContext)_localctx).T_QUOTE.getText():null); 
				}
				break;
			case T_SQRT:
				enterOuterAlt(_localctx, 91);
				{
				setState(4080);
				((Function_namesContext)_localctx).T_SQRT = match(T_SQRT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SQRT!=null?((Function_namesContext)_localctx).T_SQRT.getText():null); 
				}
				break;
			case T_PARSE_URL:
				enterOuterAlt(_localctx, 92);
				{
				setState(4082);
				((Function_namesContext)_localctx).T_PARSE_URL = match(T_PARSE_URL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PARSE_URL!=null?((Function_namesContext)_localctx).T_PARSE_URL.getText():null); 
				}
				break;
			case T_EQUAL:
				enterOuterAlt(_localctx, 93);
				{
				setState(4084);
				((Function_namesContext)_localctx).T_EQUAL = match(T_EQUAL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_EQUAL!=null?((Function_namesContext)_localctx).T_EQUAL.getText():null); 
				}
				break;
			case T_MONTHS_BETWEEN:
				enterOuterAlt(_localctx, 94);
				{
				setState(4086);
				((Function_namesContext)_localctx).T_MONTHS_BETWEEN = match(T_MONTHS_BETWEEN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MONTHS_BETWEEN!=null?((Function_namesContext)_localctx).T_MONTHS_BETWEEN.getText():null); 
				}
				break;
			case T_MASK_HASH:
				enterOuterAlt(_localctx, 95);
				{
				setState(4088);
				((Function_namesContext)_localctx).T_MASK_HASH = match(T_MASK_HASH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK_HASH!=null?((Function_namesContext)_localctx).T_MASK_HASH.getText():null); 
				}
				break;
			case T_XOR:
				enterOuterAlt(_localctx, 96);
				{
				setState(4090);
				((Function_namesContext)_localctx).T_XOR = match(T_XOR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XOR!=null?((Function_namesContext)_localctx).T_XOR.getText():null); 
				}
				break;
			case T_LOG10:
				enterOuterAlt(_localctx, 97);
				{
				setState(4092);
				((Function_namesContext)_localctx).T_LOG10 = match(T_LOG10);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOG10!=null?((Function_namesContext)_localctx).T_LOG10.getText():null); 
				}
				break;
			case T_SENTENCES:
				enterOuterAlt(_localctx, 98);
				{
				setState(4094);
				((Function_namesContext)_localctx).T_SENTENCES = match(T_SENTENCES);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SENTENCES!=null?((Function_namesContext)_localctx).T_SENTENCES.getText():null); 
				}
				break;
			case T_MAP_VALUES:
				enterOuterAlt(_localctx, 99);
				{
				setState(4096);
				((Function_namesContext)_localctx).T_MAP_VALUES = match(T_MAP_VALUES);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MAP_VALUES!=null?((Function_namesContext)_localctx).T_MAP_VALUES.getText():null); 
				}
				break;
			case T_INSTR:
				enterOuterAlt(_localctx, 100);
				{
				setState(4098);
				((Function_namesContext)_localctx).T_INSTR = match(T_INSTR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_INSTR!=null?((Function_namesContext)_localctx).T_INSTR.getText():null); 
				}
				break;
			case T_MASK:
				enterOuterAlt(_localctx, 101);
				{
				setState(4100);
				((Function_namesContext)_localctx).T_MASK = match(T_MASK);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK!=null?((Function_namesContext)_localctx).T_MASK.getText():null); 
				}
				break;
			case T_AND:
				enterOuterAlt(_localctx, 102);
				{
				setState(4102);
				((Function_namesContext)_localctx).T_AND = match(T_AND);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_AND!=null?((Function_namesContext)_localctx).T_AND.getText():null); 
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 103);
				{
				setState(4104);
				((Function_namesContext)_localctx).T_VARIANCE = match(T_VARIANCE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_VARIANCE!=null?((Function_namesContext)_localctx).T_VARIANCE.getText():null); 
				}
				break;
			case T_VAR_SAMP:
				enterOuterAlt(_localctx, 104);
				{
				setState(4106);
				((Function_namesContext)_localctx).T_VAR_SAMP = match(T_VAR_SAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_VAR_SAMP!=null?((Function_namesContext)_localctx).T_VAR_SAMP.getText():null); 
				}
				break;
			case T_SHA1:
				enterOuterAlt(_localctx, 105);
				{
				setState(4108);
				((Function_namesContext)_localctx).T_SHA1 = match(T_SHA1);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHA1!=null?((Function_namesContext)_localctx).T_SHA1.getText():null); 
				}
				break;
			case T_TAN:
				enterOuterAlt(_localctx, 106);
				{
				setState(4110);
				((Function_namesContext)_localctx).T_TAN = match(T_TAN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TAN!=null?((Function_namesContext)_localctx).T_TAN.getText():null); 
				}
				break;
			case T_ADD_MONTHS:
				enterOuterAlt(_localctx, 107);
				{
				setState(4112);
				((Function_namesContext)_localctx).T_ADD_MONTHS = match(T_ADD_MONTHS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ADD_MONTHS!=null?((Function_namesContext)_localctx).T_ADD_MONTHS.getText():null); 
				}
				break;
			case T_MAP_KEYS:
				enterOuterAlt(_localctx, 108);
				{
				setState(4114);
				((Function_namesContext)_localctx).T_MAP_KEYS = match(T_MAP_KEYS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MAP_KEYS!=null?((Function_namesContext)_localctx).T_MAP_KEYS.getText():null); 
				}
				break;
			case T_ATAN:
				enterOuterAlt(_localctx, 109);
				{
				setState(4116);
				((Function_namesContext)_localctx).T_ATAN = match(T_ATAN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ATAN!=null?((Function_namesContext)_localctx).T_ATAN.getText():null); 
				}
				break;
			case T_TRUNC:
				enterOuterAlt(_localctx, 110);
				{
				setState(4118);
				((Function_namesContext)_localctx).T_TRUNC = match(T_TRUNC);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TRUNC!=null?((Function_namesContext)_localctx).T_TRUNC.getText():null); 
				}
				break;
			case T_LEVENSHTEIN:
				enterOuterAlt(_localctx, 111);
				{
				setState(4120);
				((Function_namesContext)_localctx).T_LEVENSHTEIN = match(T_LEVENSHTEIN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LEVENSHTEIN!=null?((Function_namesContext)_localctx).T_LEVENSHTEIN.getText():null); 
				}
				break;
			case T_YEAR:
				enterOuterAlt(_localctx, 112);
				{
				setState(4122);
				((Function_namesContext)_localctx).T_YEAR = match(T_YEAR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_YEAR!=null?((Function_namesContext)_localctx).T_YEAR.getText():null); 
				}
				break;
			case T_ARRAY_CONTAINS:
				enterOuterAlt(_localctx, 113);
				{
				setState(4124);
				((Function_namesContext)_localctx).T_ARRAY_CONTAINS = match(T_ARRAY_CONTAINS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ARRAY_CONTAINS!=null?((Function_namesContext)_localctx).T_ARRAY_CONTAINS.getText():null); 
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 114);
				{
				setState(4126);
				((Function_namesContext)_localctx).T_MIN = match(T_MIN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MIN!=null?((Function_namesContext)_localctx).T_MIN.getText():null); 
				}
				break;
			case T_GET_JSON_OBJECT:
				enterOuterAlt(_localctx, 115);
				{
				setState(4128);
				((Function_namesContext)_localctx).T_GET_JSON_OBJECT = match(T_GET_JSON_OBJECT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_GET_JSON_OBJECT!=null?((Function_namesContext)_localctx).T_GET_JSON_OBJECT.getText():null); 
				}
				break;
			case T_REGR_INTERCEPT:
				enterOuterAlt(_localctx, 116);
				{
				setState(4130);
				((Function_namesContext)_localctx).T_REGR_INTERCEPT = match(T_REGR_INTERCEPT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_INTERCEPT!=null?((Function_namesContext)_localctx).T_REGR_INTERCEPT.getText():null); 
				}
				break;
			case T_MASK_SHOW_LAST_N:
				enterOuterAlt(_localctx, 117);
				{
				setState(4132);
				((Function_namesContext)_localctx).T_MASK_SHOW_LAST_N = match(T_MASK_SHOW_LAST_N);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK_SHOW_LAST_N!=null?((Function_namesContext)_localctx).T_MASK_SHOW_LAST_N.getText():null); 
				}
				break;
			case T_RPAD:
				enterOuterAlt(_localctx, 118);
				{
				setState(4134);
				((Function_namesContext)_localctx).T_RPAD = match(T_RPAD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_RPAD!=null?((Function_namesContext)_localctx).T_RPAD.getText():null); 
				}
				break;
			case T_PERCENTILE:
				enterOuterAlt(_localctx, 119);
				{
				setState(4136);
				((Function_namesContext)_localctx).T_PERCENTILE = match(T_PERCENTILE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PERCENTILE!=null?((Function_namesContext)_localctx).T_PERCENTILE.getText():null); 
				}
				break;
			case T_REGR_AVGY:
				enterOuterAlt(_localctx, 120);
				{
				setState(4138);
				((Function_namesContext)_localctx).T_REGR_AVGY = match(T_REGR_AVGY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_AVGY!=null?((Function_namesContext)_localctx).T_REGR_AVGY.getText():null); 
				}
				break;
			case T_REGR_SYY:
				enterOuterAlt(_localctx, 121);
				{
				setState(4140);
				((Function_namesContext)_localctx).T_REGR_SYY = match(T_REGR_SYY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_SYY!=null?((Function_namesContext)_localctx).T_REGR_SYY.getText():null); 
				}
				break;
			case T_REFLECT:
				enterOuterAlt(_localctx, 122);
				{
				setState(4142);
				((Function_namesContext)_localctx).T_REFLECT = match(T_REFLECT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REFLECT!=null?((Function_namesContext)_localctx).T_REFLECT.getText():null); 
				}
				break;
			case T_DATE_FORMAT:
				enterOuterAlt(_localctx, 123);
				{
				setState(4144);
				((Function_namesContext)_localctx).T_DATE_FORMAT = match(T_DATE_FORMAT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DATE_FORMAT!=null?((Function_namesContext)_localctx).T_DATE_FORMAT.getText():null); 
				}
				break;
			case T_CEIL:
				enterOuterAlt(_localctx, 124);
				{
				setState(4146);
				((Function_namesContext)_localctx).T_CEIL = match(T_CEIL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CEIL!=null?((Function_namesContext)_localctx).T_CEIL.getText():null); 
				}
				break;
			case T_CONV:
				enterOuterAlt(_localctx, 125);
				{
				setState(4148);
				((Function_namesContext)_localctx).T_CONV = match(T_CONV);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CONV!=null?((Function_namesContext)_localctx).T_CONV.getText():null); 
				}
				break;
			case T_BASE64:
				enterOuterAlt(_localctx, 126);
				{
				setState(4150);
				((Function_namesContext)_localctx).T_BASE64 = match(T_BASE64);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BASE64!=null?((Function_namesContext)_localctx).T_BASE64.getText():null); 
				}
				break;
			case T_WEEKOFYEAR:
				enterOuterAlt(_localctx, 127);
				{
				setState(4152);
				((Function_namesContext)_localctx).T_WEEKOFYEAR = match(T_WEEKOFYEAR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_WEEKOFYEAR!=null?((Function_namesContext)_localctx).T_WEEKOFYEAR.getText():null); 
				}
				break;
			case T_BIN:
				enterOuterAlt(_localctx, 128);
				{
				setState(4154);
				((Function_namesContext)_localctx).T_BIN = match(T_BIN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BIN!=null?((Function_namesContext)_localctx).T_BIN.getText():null); 
				}
				break;
			case T_STAR:
				enterOuterAlt(_localctx, 129);
				{
				setState(4156);
				((Function_namesContext)_localctx).T_STAR = match(T_STAR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_STAR!=null?((Function_namesContext)_localctx).T_STAR.getText():null); 
				}
				break;
			case T_PLUS:
				enterOuterAlt(_localctx, 130);
				{
				setState(4158);
				((Function_namesContext)_localctx).T_PLUS = match(T_PLUS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PLUS!=null?((Function_namesContext)_localctx).T_PLUS.getText():null); 
				}
				break;
			case T_REGR_SXX:
				enterOuterAlt(_localctx, 131);
				{
				setState(4160);
				((Function_namesContext)_localctx).T_REGR_SXX = match(T_REGR_SXX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_SXX!=null?((Function_namesContext)_localctx).T_REGR_SXX.getText():null); 
				}
				break;
			case T_DEGREES:
				enterOuterAlt(_localctx, 132);
				{
				setState(4162);
				((Function_namesContext)_localctx).T_DEGREES = match(T_DEGREES);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DEGREES!=null?((Function_namesContext)_localctx).T_DEGREES.getText():null); 
				}
				break;
			case T_AES_DECRYPT:
				enterOuterAlt(_localctx, 133);
				{
				setState(4164);
				((Function_namesContext)_localctx).T_AES_DECRYPT = match(T_AES_DECRYPT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_AES_DECRYPT!=null?((Function_namesContext)_localctx).T_AES_DECRYPT.getText():null); 
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 134);
				{
				setState(4166);
				((Function_namesContext)_localctx).T_MAX = match(T_MAX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MAX!=null?((Function_namesContext)_localctx).T_MAX.getText():null); 
				}
				break;
			case T_LOG2:
				enterOuterAlt(_localctx, 135);
				{
				setState(4168);
				((Function_namesContext)_localctx).T_LOG2 = match(T_LOG2);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOG2!=null?((Function_namesContext)_localctx).T_LOG2.getText():null); 
				}
				break;
			case T_CURRENT_DATABASE:
				enterOuterAlt(_localctx, 136);
				{
				setState(4170);
				((Function_namesContext)_localctx).T_CURRENT_DATABASE = match(T_CURRENT_DATABASE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CURRENT_DATABASE!=null?((Function_namesContext)_localctx).T_CURRENT_DATABASE.getText():null); 
				}
				break;
			case T_JAVA_METHOD:
				enterOuterAlt(_localctx, 137);
				{
				setState(4172);
				((Function_namesContext)_localctx).T_JAVA_METHOD = match(T_JAVA_METHOD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_JAVA_METHOD!=null?((Function_namesContext)_localctx).T_JAVA_METHOD.getText():null); 
				}
				break;
			case T_HOUR:
				enterOuterAlt(_localctx, 138);
				{
				setState(4174);
				((Function_namesContext)_localctx).T_HOUR = match(T_HOUR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_HOUR!=null?((Function_namesContext)_localctx).T_HOUR.getText():null); 
				}
				break;
			case T_STACK:
				enterOuterAlt(_localctx, 139);
				{
				setState(4176);
				((Function_namesContext)_localctx).T_STACK = match(T_STACK);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_STACK!=null?((Function_namesContext)_localctx).T_STACK.getText():null); 
				}
				break;
			case T_LN:
				enterOuterAlt(_localctx, 140);
				{
				setState(4178);
				((Function_namesContext)_localctx).T_LN = match(T_LN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LN!=null?((Function_namesContext)_localctx).T_LN.getText():null); 
				}
				break;
			case T_CHARACTER_LENGTH:
				enterOuterAlt(_localctx, 141);
				{
				setState(4180);
				((Function_namesContext)_localctx).T_CHARACTER_LENGTH = match(T_CHARACTER_LENGTH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CHARACTER_LENGTH!=null?((Function_namesContext)_localctx).T_CHARACTER_LENGTH.getText():null); 
				}
				break;
			case T_ROUND:
				enterOuterAlt(_localctx, 142);
				{
				setState(4182);
				((Function_namesContext)_localctx).T_ROUND = match(T_ROUND);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ROUND!=null?((Function_namesContext)_localctx).T_ROUND.getText():null); 
				}
				break;
			case T_RAND:
				enterOuterAlt(_localctx, 143);
				{
				setState(4184);
				((Function_namesContext)_localctx).T_RAND = match(T_RAND);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_RAND!=null?((Function_namesContext)_localctx).T_RAND.getText():null); 
				}
				break;
			case T_COLLECT_LIST:
				enterOuterAlt(_localctx, 144);
				{
				setState(4186);
				((Function_namesContext)_localctx).T_COLLECT_LIST = match(T_COLLECT_LIST);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COLLECT_LIST!=null?((Function_namesContext)_localctx).T_COLLECT_LIST.getText():null); 
				}
				break;
			case T_REGEXP_REPLACE:
				enterOuterAlt(_localctx, 145);
				{
				setState(4188);
				((Function_namesContext)_localctx).T_REGEXP_REPLACE = match(T_REGEXP_REPLACE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGEXP_REPLACE!=null?((Function_namesContext)_localctx).T_REGEXP_REPLACE.getText():null); 
				}
				break;
			case T_POW:
				enterOuterAlt(_localctx, 146);
				{
				setState(4190);
				((Function_namesContext)_localctx).T_POW = match(T_POW);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_POW!=null?((Function_namesContext)_localctx).T_POW.getText():null); 
				}
				break;
			case T_SOUNDEX:
				enterOuterAlt(_localctx, 147);
				{
				setState(4192);
				((Function_namesContext)_localctx).T_SOUNDEX = match(T_SOUNDEX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SOUNDEX!=null?((Function_namesContext)_localctx).T_SOUNDEX.getText():null); 
				}
				break;
			case T_IF:
				enterOuterAlt(_localctx, 148);
				{
				setState(4194);
				((Function_namesContext)_localctx).T_IF = match(T_IF);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_IF!=null?((Function_namesContext)_localctx).T_IF.getText():null); 
				}
				break;
			case T_SHIFTLEFT:
				enterOuterAlt(_localctx, 149);
				{
				setState(4196);
				((Function_namesContext)_localctx).T_SHIFTLEFT = match(T_SHIFTLEFT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHIFTLEFT!=null?((Function_namesContext)_localctx).T_SHIFTLEFT.getText():null); 
				}
				break;
			case T_UPPER:
				enterOuterAlt(_localctx, 150);
				{
				setState(4198);
				((Function_namesContext)_localctx).T_UPPER = match(T_UPPER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UPPER!=null?((Function_namesContext)_localctx).T_UPPER.getText():null); 
				}
				break;
			case T_BROUND:
				enterOuterAlt(_localctx, 151);
				{
				setState(4200);
				((Function_namesContext)_localctx).T_BROUND = match(T_BROUND);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BROUND!=null?((Function_namesContext)_localctx).T_BROUND.getText():null); 
				}
				break;
			case T_ISNULL:
				enterOuterAlt(_localctx, 152);
				{
				setState(4202);
				((Function_namesContext)_localctx).T_ISNULL = match(T_ISNULL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ISNULL!=null?((Function_namesContext)_localctx).T_ISNULL.getText():null); 
				}
				break;
			case T_COVAR_POP:
				enterOuterAlt(_localctx, 153);
				{
				setState(4204);
				((Function_namesContext)_localctx).T_COVAR_POP = match(T_COVAR_POP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COVAR_POP!=null?((Function_namesContext)_localctx).T_COVAR_POP.getText():null); 
				}
				break;
			case T_HEX:
				enterOuterAlt(_localctx, 154);
				{
				setState(4206);
				((Function_namesContext)_localctx).T_HEX = match(T_HEX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_HEX!=null?((Function_namesContext)_localctx).T_HEX.getText():null); 
				}
				break;
			case T_PARENT:
				enterOuterAlt(_localctx, 155);
				{
				setState(4208);
				((Function_namesContext)_localctx).T_PARENT = match(T_PARENT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PARENT!=null?((Function_namesContext)_localctx).T_PARENT.getText():null); 
				}
				break;
			case T_WIDTH_BUCKET:
				enterOuterAlt(_localctx, 156);
				{
				setState(4210);
				((Function_namesContext)_localctx).T_WIDTH_BUCKET = match(T_WIDTH_BUCKET);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_WIDTH_BUCKET!=null?((Function_namesContext)_localctx).T_WIDTH_BUCKET.getText():null); 
				}
				break;
			case T_REVERSE:
				enterOuterAlt(_localctx, 157);
				{
				setState(4212);
				((Function_namesContext)_localctx).T_REVERSE = match(T_REVERSE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REVERSE!=null?((Function_namesContext)_localctx).T_REVERSE.getText():null); 
				}
				break;
			case T_SPACE:
				enterOuterAlt(_localctx, 158);
				{
				setState(4214);
				((Function_namesContext)_localctx).T_SPACE = match(T_SPACE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SPACE!=null?((Function_namesContext)_localctx).T_SPACE.getText():null); 
				}
				break;
			case T_BRACKET_OP:
				enterOuterAlt(_localctx, 159);
				{
				setState(4216);
				((Function_namesContext)_localctx).T_BRACKET_OP = match(T_BRACKET_OP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BRACKET_OP!=null?((Function_namesContext)_localctx).T_BRACKET_OP.getText():null); 
				}
				break;
			case T_RTRIM:
				enterOuterAlt(_localctx, 160);
				{
				setState(4218);
				((Function_namesContext)_localctx).T_RTRIM = match(T_RTRIM);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_RTRIM!=null?((Function_namesContext)_localctx).T_RTRIM.getText():null); 
				}
				break;
			case T_LTRIM:
				enterOuterAlt(_localctx, 161);
				{
				setState(4220);
				((Function_namesContext)_localctx).T_LTRIM = match(T_LTRIM);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LTRIM!=null?((Function_namesContext)_localctx).T_LTRIM.getText():null); 
				}
				break;
			case T_TRIM:
				enterOuterAlt(_localctx, 162);
				{
				setState(4222);
				((Function_namesContext)_localctx).T_TRIM = match(T_TRIM);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TRIM!=null?((Function_namesContext)_localctx).T_TRIM.getText():null); 
				}
				break;
			case T_FORMAT_NUMBER:
				enterOuterAlt(_localctx, 163);
				{
				setState(4224);
				((Function_namesContext)_localctx).T_FORMAT_NUMBER = match(T_FORMAT_NUMBER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FORMAT_NUMBER!=null?((Function_namesContext)_localctx).T_FORMAT_NUMBER.getText():null); 
				}
				break;
			case T_NEXT_DAY:
				enterOuterAlt(_localctx, 164);
				{
				setState(4226);
				((Function_namesContext)_localctx).T_NEXT_DAY = match(T_NEXT_DAY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NEXT_DAY!=null?((Function_namesContext)_localctx).T_NEXT_DAY.getText():null); 
				}
				break;
			case T_VERSION:
				enterOuterAlt(_localctx, 165);
				{
				setState(4228);
				((Function_namesContext)_localctx).T_VERSION = match(T_VERSION);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_VERSION!=null?((Function_namesContext)_localctx).T_VERSION.getText():null); 
				}
				break;
			case T_BUILDVERSION:
				enterOuterAlt(_localctx, 166);
				{
				setState(4230);
				((Function_namesContext)_localctx).T_BUILDVERSION = match(T_BUILDVERSION);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BUILDVERSION!=null?((Function_namesContext)_localctx).T_BUILDVERSION.getText():null); 
				}
				break;
			case T_MASK_FIRST_N:
				enterOuterAlt(_localctx, 167);
				{
				setState(4232);
				((Function_namesContext)_localctx).T_MASK_FIRST_N = match(T_MASK_FIRST_N);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK_FIRST_N!=null?((Function_namesContext)_localctx).T_MASK_FIRST_N.getText():null); 
				}
				break;
			case T_PI:
				enterOuterAlt(_localctx, 168);
				{
				setState(4234);
				((Function_namesContext)_localctx).T_PI = match(T_PI);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PI!=null?((Function_namesContext)_localctx).T_PI.getText():null); 
				}
				break;
			case T_COALESCE:
				enterOuterAlt(_localctx, 169);
				{
				setState(4236);
				((Function_namesContext)_localctx).T_COALESCE = match(T_COALESCE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COALESCE!=null?((Function_namesContext)_localctx).T_COALESCE.getText():null); 
				}
				break;
			case T_STR_TO_MAP:
				enterOuterAlt(_localctx, 170);
				{
				setState(4238);
				((Function_namesContext)_localctx).T_STR_TO_MAP = match(T_STR_TO_MAP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_STR_TO_MAP!=null?((Function_namesContext)_localctx).T_STR_TO_MAP.getText():null); 
				}
				break;
			case T_REGR_SLOPE:
				enterOuterAlt(_localctx, 171);
				{
				setState(4240);
				((Function_namesContext)_localctx).T_REGR_SLOPE = match(T_REGR_SLOPE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_SLOPE!=null?((Function_namesContext)_localctx).T_REGR_SLOPE.getText():null); 
				}
				break;
			case T_REPEAT:
				enterOuterAlt(_localctx, 172);
				{
				setState(4242);
				((Function_namesContext)_localctx).T_REPEAT = match(T_REPEAT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REPEAT!=null?((Function_namesContext)_localctx).T_REPEAT.getText():null); 
				}
				break;
			case T_JSON_TUPLE:
				enterOuterAlt(_localctx, 173);
				{
				setState(4244);
				((Function_namesContext)_localctx).T_JSON_TUPLE = match(T_JSON_TUPLE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_JSON_TUPLE!=null?((Function_namesContext)_localctx).T_JSON_TUPLE.getText():null); 
				}
				break;
			case T_MASK_LAST_N:
				enterOuterAlt(_localctx, 174);
				{
				setState(4246);
				((Function_namesContext)_localctx).T_MASK_LAST_N = match(T_MASK_LAST_N);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK_LAST_N!=null?((Function_namesContext)_localctx).T_MASK_LAST_N.getText():null); 
				}
				break;
			case T_SIGN:
				enterOuterAlt(_localctx, 175);
				{
				setState(4248);
				((Function_namesContext)_localctx).T_SIGN = match(T_SIGN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SIGN!=null?((Function_namesContext)_localctx).T_SIGN.getText():null); 
				}
				break;
			case T_PARSE_URL_TUPLE:
				enterOuterAlt(_localctx, 176);
				{
				setState(4250);
				((Function_namesContext)_localctx).T_PARSE_URL_TUPLE = match(T_PARSE_URL_TUPLE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PARSE_URL_TUPLE!=null?((Function_namesContext)_localctx).T_PARSE_URL_TUPLE.getText():null); 
				}
				break;
			case T_IN_FILE:
				enterOuterAlt(_localctx, 177);
				{
				setState(4252);
				((Function_namesContext)_localctx).T_IN_FILE = match(T_IN_FILE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_IN_FILE!=null?((Function_namesContext)_localctx).T_IN_FILE.getText():null); 
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 178);
				{
				setState(4254);
				((Function_namesContext)_localctx).T_SUM = match(T_SUM);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SUM!=null?((Function_namesContext)_localctx).T_SUM.getText():null); 
				}
				break;
			case T_CORR:
				enterOuterAlt(_localctx, 179);
				{
				setState(4256);
				((Function_namesContext)_localctx).T_CORR = match(T_CORR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CORR!=null?((Function_namesContext)_localctx).T_CORR.getText():null); 
				}
				break;
			case T_REGR_SXY:
				enterOuterAlt(_localctx, 180);
				{
				setState(4258);
				((Function_namesContext)_localctx).T_REGR_SXY = match(T_REGR_SXY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_SXY!=null?((Function_namesContext)_localctx).T_REGR_SXY.getText():null); 
				}
				break;
			case T_GREATEST:
				enterOuterAlt(_localctx, 181);
				{
				setState(4260);
				((Function_namesContext)_localctx).T_GREATEST = match(T_GREATEST);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_GREATEST!=null?((Function_namesContext)_localctx).T_GREATEST.getText():null); 
				}
				break;
			case T_COVAR_SAMP:
				enterOuterAlt(_localctx, 182);
				{
				setState(4262);
				((Function_namesContext)_localctx).T_COVAR_SAMP = match(T_COVAR_SAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COVAR_SAMP!=null?((Function_namesContext)_localctx).T_COVAR_SAMP.getText():null); 
				}
				break;
			case T_LOGGED_IN_USER:
				enterOuterAlt(_localctx, 183);
				{
				setState(4264);
				((Function_namesContext)_localctx).T_LOGGED_IN_USER = match(T_LOGGED_IN_USER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOGGED_IN_USER!=null?((Function_namesContext)_localctx).T_LOGGED_IN_USER.getText():null); 
				}
				break;
			case T_PRINTF:
				enterOuterAlt(_localctx, 184);
				{
				setState(4266);
				((Function_namesContext)_localctx).T_PRINTF = match(T_PRINTF);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PRINTF!=null?((Function_namesContext)_localctx).T_PRINTF.getText():null); 
				}
				break;
			case T_FLOOR:
				enterOuterAlt(_localctx, 185);
				{
				setState(4268);
				((Function_namesContext)_localctx).T_FLOOR = match(T_FLOOR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FLOOR!=null?((Function_namesContext)_localctx).T_FLOOR.getText():null); 
				}
				break;
			case T_POSEXPLODE:
				enterOuterAlt(_localctx, 186);
				{
				setState(4270);
				((Function_namesContext)_localctx).T_POSEXPLODE = match(T_POSEXPLODE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_POSEXPLODE!=null?((Function_namesContext)_localctx).T_POSEXPLODE.getText():null); 
				}
				break;
			case T_DATE_ADD:
				enterOuterAlt(_localctx, 187);
				{
				setState(4272);
				((Function_namesContext)_localctx).T_DATE_ADD = match(T_DATE_ADD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DATE_ADD!=null?((Function_namesContext)_localctx).T_DATE_ADD.getText():null); 
				}
				break;
			case T_POWER:
				enterOuterAlt(_localctx, 188);
				{
				setState(4274);
				((Function_namesContext)_localctx).T_POWER = match(T_POWER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_POWER!=null?((Function_namesContext)_localctx).T_POWER.getText():null); 
				}
				break;
			case T_CEILING:
				enterOuterAlt(_localctx, 189);
				{
				setState(4276);
				((Function_namesContext)_localctx).T_CEILING = match(T_CEILING);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CEILING!=null?((Function_namesContext)_localctx).T_CEILING.getText():null); 
				}
				break;
			case T_VAR_POP:
				enterOuterAlt(_localctx, 190);
				{
				setState(4278);
				((Function_namesContext)_localctx).T_VAR_POP = match(T_VAR_POP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_VAR_POP!=null?((Function_namesContext)_localctx).T_VAR_POP.getText():null); 
				}
				break;
			case T_XPATH:
				enterOuterAlt(_localctx, 191);
				{
				setState(4280);
				((Function_namesContext)_localctx).T_XPATH = match(T_XPATH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH!=null?((Function_namesContext)_localctx).T_XPATH.getText():null); 
				}
				break;
			case T_XPATH_BOOLEAN:
				enterOuterAlt(_localctx, 192);
				{
				setState(4282);
				((Function_namesContext)_localctx).T_XPATH_BOOLEAN = match(T_XPATH_BOOLEAN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_BOOLEAN!=null?((Function_namesContext)_localctx).T_XPATH_BOOLEAN.getText():null); 
				}
				break;
			case T_XPATH_DOUBLE:
				enterOuterAlt(_localctx, 193);
				{
				setState(4284);
				((Function_namesContext)_localctx).T_XPATH_DOUBLE = match(T_XPATH_DOUBLE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_DOUBLE!=null?((Function_namesContext)_localctx).T_XPATH_DOUBLE.getText():null); 
				}
				break;
			case T_XPATH_FLOAT:
				enterOuterAlt(_localctx, 194);
				{
				setState(4286);
				((Function_namesContext)_localctx).T_XPATH_FLOAT = match(T_XPATH_FLOAT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_FLOAT!=null?((Function_namesContext)_localctx).T_XPATH_FLOAT.getText():null); 
				}
				break;
			case T_XPATH_INT:
				enterOuterAlt(_localctx, 195);
				{
				setState(4288);
				((Function_namesContext)_localctx).T_XPATH_INT = match(T_XPATH_INT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_INT!=null?((Function_namesContext)_localctx).T_XPATH_INT.getText():null); 
				}
				break;
			case T_XPATH_LONG:
				enterOuterAlt(_localctx, 196);
				{
				setState(4290);
				((Function_namesContext)_localctx).T_XPATH_LONG = match(T_XPATH_LONG);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_LONG!=null?((Function_namesContext)_localctx).T_XPATH_LONG.getText():null); 
				}
				break;
			case T_XPATH_NUMBER:
				enterOuterAlt(_localctx, 197);
				{
				setState(4292);
				((Function_namesContext)_localctx).T_XPATH_NUMBER = match(T_XPATH_NUMBER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_NUMBER!=null?((Function_namesContext)_localctx).T_XPATH_NUMBER.getText():null); 
				}
				break;
			case T_XPATH_SHORT:
				enterOuterAlt(_localctx, 198);
				{
				setState(4294);
				((Function_namesContext)_localctx).T_XPATH_SHORT = match(T_XPATH_SHORT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_SHORT!=null?((Function_namesContext)_localctx).T_XPATH_SHORT.getText():null); 
				}
				break;
			case T_XPATH_STRING:
				enterOuterAlt(_localctx, 199);
				{
				setState(4296);
				((Function_namesContext)_localctx).T_XPATH_STRING = match(T_XPATH_STRING);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_STRING!=null?((Function_namesContext)_localctx).T_XPATH_STRING.getText():null); 
				}
				break;
			case T_SHA:
				enterOuterAlt(_localctx, 200);
				{
				setState(4298);
				((Function_namesContext)_localctx).T_SHA = match(T_SHA);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHA!=null?((Function_namesContext)_localctx).T_SHA.getText():null); 
				}
				break;
			case T_UCASE:
				enterOuterAlt(_localctx, 201);
				{
				setState(4300);
				((Function_namesContext)_localctx).T_UCASE = match(T_UCASE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UCASE!=null?((Function_namesContext)_localctx).T_UCASE.getText():null); 
				}
				break;
			case T_SUBSTRING:
				enterOuterAlt(_localctx, 202);
				{
				setState(4302);
				((Function_namesContext)_localctx).T_SUBSTRING = match(T_SUBSTRING);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SUBSTRING!=null?((Function_namesContext)_localctx).T_SUBSTRING.getText():null); 
				}
				break;
			case T_LCASE:
				enterOuterAlt(_localctx, 203);
				{
				setState(4304);
				((Function_namesContext)_localctx).T_LCASE = match(T_LCASE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LCASE!=null?((Function_namesContext)_localctx).T_LCASE.getText():null); 
				}
				break;
			case T_FIELD_IN_SET:
				enterOuterAlt(_localctx, 204);
				{
				setState(4306);
				((Function_namesContext)_localctx).T_FIELD_IN_SET = match(T_FIELD_IN_SET);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FIELD_IN_SET!=null?((Function_namesContext)_localctx).T_FIELD_IN_SET.getText():null); 
				}
				break;
			case T_GET_JSON_OBJECTS:
				enterOuterAlt(_localctx, 205);
				{
				setState(4308);
				((Function_namesContext)_localctx).T_GET_JSON_OBJECTS = match(T_GET_JSON_OBJECTS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_GET_JSON_OBJECTS!=null?((Function_namesContext)_localctx).T_GET_JSON_OBJECTS.getText():null); 
				}
				break;
			case T_IN_STR:
				enterOuterAlt(_localctx, 206);
				{
				setState(4310);
				((Function_namesContext)_localctx).T_IN_STR = match(T_IN_STR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_IN_STR!=null?((Function_namesContext)_localctx).T_IN_STR.getText():null); 
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 207);
				{
				setState(4312);
				((Function_namesContext)_localctx).T_RANK = match(T_RANK);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_RANK!=null?((Function_namesContext)_localctx).T_RANK.getText():null); 
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 208);
				{
				setState(4314);
				((Function_namesContext)_localctx).T_DENSE_RANK = match(T_DENSE_RANK);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DENSE_RANK!=null?((Function_namesContext)_localctx).T_DENSE_RANK.getText():null); 
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 209);
				{
				setState(4316);
				((Function_namesContext)_localctx).T_ROW_NUMBER = match(T_ROW_NUMBER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ROW_NUMBER!=null?((Function_namesContext)_localctx).T_ROW_NUMBER.getText():null); 
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 210);
				{
				setState(4318);
				((Function_namesContext)_localctx).T_CUME_DIST = match(T_CUME_DIST);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CUME_DIST!=null?((Function_namesContext)_localctx).T_CUME_DIST.getText():null); 
				}
				break;
			case T_PERCENT_RANK:
				enterOuterAlt(_localctx, 211);
				{
				setState(4320);
				((Function_namesContext)_localctx).T_PERCENT_RANK = match(T_PERCENT_RANK);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PERCENT_RANK!=null?((Function_namesContext)_localctx).T_PERCENT_RANK.getText():null); 
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 212);
				{
				setState(4322);
				((Function_namesContext)_localctx).T_LAG = match(T_LAG);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LAG!=null?((Function_namesContext)_localctx).T_LAG.getText():null); 
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 213);
				{
				setState(4324);
				((Function_namesContext)_localctx).T_LEAD = match(T_LEAD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LEAD!=null?((Function_namesContext)_localctx).T_LEAD.getText():null); 
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
		case 86:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 30);
		case 1:
			return precpred(_ctx, 29);
		case 2:
			return precpred(_ctx, 28);
		case 3:
			return precpred(_ctx, 27);
		case 4:
			return precpred(_ctx, 26);
		case 5:
			return precpred(_ctx, 25);
		case 6:
			return precpred(_ctx, 24);
		case 7:
			return precpred(_ctx, 21);
		case 8:
			return precpred(_ctx, 20);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 23);
		case 11:
			return precpred(_ctx, 22);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0240\u10eb\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\u00fb\n\3\r\3\16"+
		"\3\u00fc\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0107\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0117\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u012f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u014a\n\6\f\6\16\6"+
		"\u014d\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0158\n\6\f\6\16\6"+
		"\u015b\13\6\3\6\3\6\3\6\5\6\u0160\n\6\3\7\3\7\3\7\5\7\u0165\n\7\3\7\3"+
		"\7\5\7\u0169\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u017a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\n\u018a\n\n\3\13\3\13\3\13\5\13\u018f\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u019e\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u01b5\n\16\f\16\16\16\u01b8\13\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u01c3\n\16\f\16\16\16\u01c6\13\16\3\16\3\16"+
		"\3\16\5\16\u01cb\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01df\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u01ec\n\22\f\22\16\22\u01ef"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01fa\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0203\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u020b\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\5\27\u0217\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u0235\n\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u023d\n\31\f\31\16\31\u0240\13\31\3\31\3\31\3\31\5\31\u0245\n\31\3\32"+
		"\3\32\3\32\3\32\7\32\u024b\n\32\f\32\16\32\u024e\13\32\3\32\3\32\5\32"+
		"\u0252\n\32\3\33\3\33\3\33\3\33\5\33\u0258\n\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\7\35\u0264\n\35\f\35\16\35\u0267\13\35\3"+
		"\35\3\35\3\35\5\35\u026c\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0278\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u0282\n\37\f\37\16\37\u0285\13\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u028e\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u029b\n \f \16 \u029e"+
		"\13 \3 \3 \3 \5 \u02a3\n \3!\3!\3!\3!\3!\5!\u02aa\n!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\7\"\u02b4\n\"\f\"\16\"\u02b7\13\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u02be\n\"\3#\3#\3#\3#\3#\3#\3#\7#\u02c7\n#\f#\16#\u02ca\13#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\7#\u02d6\n#\f#\16#\u02d9\13#\3#\3#\3#\3#\3#\3#"+
		"\7#\u02e1\n#\f#\16#\u02e4\13#\3#\3#\7#\u02e8\n#\f#\16#\u02eb\13#\3#\3"+
		"#\3#\5#\u02f0\n#\3$\3$\3$\3$\3$\5$\u02f7\n$\3%\3%\3%\3%\3%\3%\5%\u02ff"+
		"\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u030e\n&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u031e\n\'\3(\3(\3(\3(\3("+
		"\3(\3(\5(\u0327\n(\3)\3)\3)\3)\3)\3)\3)\5)\u0330\n)\3*\3*\3*\3*\3*\3*"+
		"\5*\u0338\n*\3+\3+\3+\3+\3+\3+\5+\u0340\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\7,\u034f\n,\f,\16,\u0352\13,\3,\3,\3,\5,\u0357\n,\3-\3-\3"+
		"-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u036f\n"+
		".\3/\3/\3/\3/\5/\u0375\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\7\60\u0383\n\60\f\60\16\60\u0386\13\60\3\60\3\60\3\60"+
		"\5\60\u038b\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\5\62\u0395\n"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\5\63\u03a5\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\6\64\u03b5\n\64\r\64\16\64\u03b6\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\6\64\u03c1\n\64\r\64\16\64\u03c2\3\64\3\64\5\64"+
		"\u03c7\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u03e3\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u03ef\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u03f8\n\67\f\67\16"+
		"\67\u03fb\13\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\7\67\u040c\n\67\f\67\16\67\u040f\13\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\7\67\u0418\n\67\f\67\16\67\u041b\13\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u042a"+
		"\n\67\f\67\16\67\u042d\13\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u043e\n\67\38\38\38\38\38\58\u0445"+
		"\n8\39\39\39\59\u044a\n9\3:\3:\3:\5:\u044f\n:\3;\3;\3;\5;\u0454\n;\3<"+
		"\3<\3<\3<\3<\5<\u045b\n<\3=\3=\3=\3=\3=\5=\u0462\n=\3>\3>\3>\3>\5>\u0468"+
		"\n>\3?\3?\3?\3?\3?\5?\u046f\n?\3@\3@\3@\3@\3@\3@\5@\u0477\n@\3A\3A\3A"+
		"\3A\3A\3A\6A\u047f\nA\rA\16A\u0480\3A\3A\3B\3B\3B\3B\3B\5B\u048a\nB\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5"+
		"C\u04a3\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u04af\nD\fD\16D\u04b2\13D"+
		"\3D\3D\5D\u04b6\nD\3E\3E\3E\3F\3F\3F\3F\3F\5F\u04c0\nF\3G\3G\3G\3G\3G"+
		"\3G\3G\7G\u04c9\nG\fG\16G\u04cc\13G\3G\3G\5G\u04d0\nG\3H\3H\3H\3H\3H\5"+
		"H\u04d7\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u04e3\nI\fI\16I\u04e6\13I"+
		"\3I\3I\5I\u04ea\nI\3J\3J\3J\3J\3J\5J\u04f1\nJ\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\5K\u04fc\nK\3L\3L\3L\3L\3L\3L\3L\6L\u0505\nL\rL\16L\u0506\3L\3L\3"+
		"L\3L\3L\6L\u050e\nL\rL\16L\u050f\3L\3L\5L\u0514\nL\3M\5M\u0517\nM\3M\3"+
		"M\3M\3M\3M\5M\u051e\nM\3M\3M\3M\3M\3M\3M\3M\5M\u0527\nM\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0539\nM\3N\3N\3N\3N\3O\3O\3O\3"+
		"O\3O\5O\u0544\nO\3O\3O\3O\3O\3O\3O\3O\5O\u054d\nO\3O\3O\3O\3O\3O\3O\3"+
		"O\5O\u0556\nO\3O\3O\3O\5O\u055b\nO\3P\3P\3P\3P\3P\5P\u0562\nP\3Q\3Q\3"+
		"Q\3Q\7Q\u0568\nQ\fQ\16Q\u056b\13Q\3Q\3Q\3R\3R\5R\u0571\nR\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\5R\u057b\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\5R\u058f\nR\3R\3R\3R\5R\u0594\nR\3S\3S\3S\3S\3S\3S\3S\3S\3T"+
		"\3T\3T\3T\3T\3T\3T\7T\u05a5\nT\fT\16T\u05a8\13T\3T\3T\5T\u05ac\nT\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u05b8\nU\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\7"+
		"W\u05c4\nW\fW\16W\u05c7\13W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u05fd\nX\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\7X\u0653\nX\fX\16X\u0656\13X\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0680\nY\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\7Z\u0688\nZ\fZ\16Z\u068b\13Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\7[\u069b\n[\f[\16[\u069e\13[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\7"+
		"\\\u06a9\n\\\f\\\16\\\u06ac\13\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\7]\u06bc\n]\f]\16]\u06bf\13]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\6^"+
		"\u06e2\n^\r^\16^\u06e3\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\6^\u06f1\n^\r"+
		"^\16^\u06f2\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\7"+
		"^\u0708\n^\f^\16^\u070b\13^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\3^\7^\u0720\n^\f^\16^\u0723\13^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\6^\u079e"+
		"\n^\r^\16^\u079f\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u08c5"+
		"\n^\3_\3_\3_\3_\3_\3_\3_\3_\7_\u08cf\n_\f_\16_\u08d2\13_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\7_\u08df\n_\f_\16_\u08e2\13_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\7_\u08ed\n_\f_\16_\u08f0\13_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5"+
		"_\u092b\n_\3`\3`\3`\3`\6`\u0931\n`\r`\16`\u0932\3`\3`\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u095d\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\6b\u0983\nb\rb\16b\u0984\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\6"+
		"b\u0992\nb\rb\16b\u0993\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\6b\u09a1\nb\r"+
		"b\16b\u09a2\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\6b\u09b1\nb\rb\16b\u09b2"+
		"\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\6b\u09bf\nb\rb\16b\u09c0\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u09d6\nb\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\5c\u0a53\nc\3c\3c\3c\3c\5c\u0a59\nc\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\5c\u0a96\nc\3d\3d\3d\3d\3d\3d\5d\u0a9e\nd\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\5d\u0aa9\nd\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\7"+
		"e\u0ab8\ne\fe\16e\u0abb\13e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e"+
		"\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e"+
		"\3e\3e\3e\5e\u0ae5\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0b2e\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\5g\u0b42\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u0c16\nh\3i\3i\3i\3i"+
		"\3i\3i\3i\3i\3i\3i\5i\u0c22\ni\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\5j\u0c34\nj\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k"+
		"\3k\3k\5k\u0c48\nk\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0c52\nl\3m\3m\3m\3m\3m"+
		"\7m\u0c59\nm\fm\16m\u0c5c\13m\3m\3m\3m\5m\u0c61\nm\3n\3n\3n\3n\3n\3n\5"+
		"n\u0c69\nn\3o\3o\3o\3o\3o\5o\u0c70\no\3p\3p\3p\3p\3q\3q\3q\3q\3r\3r\3"+
		"r\3r\3r\5r\u0c7f\nr\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0c8a\ns\3t\3t\3t\3"+
		"t\3t\5t\u0c91\nt\3u\3u\3u\3u\3u\5u\u0c98\nu\3v\3v\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u0db0\nw\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3x\5x\u0f3d\nx\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u10e9\ny\3y\2"+
		"\3\u00aez\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\2\32\4\2\u0175\u0175\u023b\u023b\4\2\36\36\u0220\u0220"+
		"\4\2JJ\u00ee\u00ee\5\2<<NNii\3\2\u01de\u01df\3\2\u020f\u0213\5\2\5\5\u0225"+
		"\u0225\u022f\u022f\3\2\6\7\3\2\b\13\3\2\u022b\u022e\4\2\f\f\u0227\u022a"+
		"\3\2\u01c4\u01c5\3\2\u0192\u0193\3\2\u01d3\u01d4\5\2\u0187\u0187\u01b8"+
		"\u01b9\u01d0\u01d0\3\2\u0202\u020a\4\2\u0175\u0175\u01d9\u01d9\6\2\u018c"+
		"\u018d\u01c7\u01c7\u01d5\u01d5\u01fb\u01fb\5\2\u014e\u014e\u01a3\u01a3"+
		"\u01b4\u01b4\13\2\u0159\u0159\u0168\u0168\u016a\u016a\u01a8\u01a8\u01d2"+
		"\u01d2\u01d7\u01d7\u01e8\u01e8\u01f3\u01f3\u01f8\u01f8\4\2\u017d\u017d"+
		"\u01eb\u01eb\3\2\u0183\u0184\4\2\u01dd\u01dd\u01e0\u01e0\5\2\6\7\r\rV"+
		"V\2\u1444\2\u00f2\3\2\2\2\4\u00f6\3\2\2\2\6\u0106\3\2\2\2\b\u012e\3\2"+
		"\2\2\n\u015f\3\2\2\2\f\u0161\3\2\2\2\16\u0179\3\2\2\2\20\u017b\3\2\2\2"+
		"\22\u0189\3\2\2\2\24\u018e\3\2\2\2\26\u019d\3\2\2\2\30\u019f\3\2\2\2\32"+
		"\u01ca\3\2\2\2\34\u01cc\3\2\2\2\36\u01de\3\2\2\2 \u01e0\3\2\2\2\"\u01e7"+
		"\3\2\2\2$\u01f9\3\2\2\2&\u0202\3\2\2\2(\u020a\3\2\2\2*\u020c\3\2\2\2,"+
		"\u0216\3\2\2\2.\u0234\3\2\2\2\60\u0244\3\2\2\2\62\u0251\3\2\2\2\64\u0257"+
		"\3\2\2\2\66\u0259\3\2\2\28\u026b\3\2\2\2:\u0277\3\2\2\2<\u028d\3\2\2\2"+
		">\u02a2\3\2\2\2@\u02a9\3\2\2\2B\u02bd\3\2\2\2D\u02ef\3\2\2\2F\u02f6\3"+
		"\2\2\2H\u02fe\3\2\2\2J\u030d\3\2\2\2L\u031d\3\2\2\2N\u0326\3\2\2\2P\u032f"+
		"\3\2\2\2R\u0337\3\2\2\2T\u033f\3\2\2\2V\u0356\3\2\2\2X\u0358\3\2\2\2Z"+
		"\u036e\3\2\2\2\\\u0374\3\2\2\2^\u038a\3\2\2\2`\u038c\3\2\2\2b\u0394\3"+
		"\2\2\2d\u03a4\3\2\2\2f\u03c6\3\2\2\2h\u03e2\3\2\2\2j\u03ee\3\2\2\2l\u043d"+
		"\3\2\2\2n\u0444\3\2\2\2p\u0449\3\2\2\2r\u044e\3\2\2\2t\u0453\3\2\2\2v"+
		"\u045a\3\2\2\2x\u0461\3\2\2\2z\u0467\3\2\2\2|\u046e\3\2\2\2~\u0476\3\2"+
		"\2\2\u0080\u0478\3\2\2\2\u0082\u0489\3\2\2\2\u0084\u04a2\3\2\2\2\u0086"+
		"\u04b5\3\2\2\2\u0088\u04b7\3\2\2\2\u008a\u04bf\3\2\2\2\u008c\u04cf\3\2"+
		"\2\2\u008e\u04d6\3\2\2\2\u0090\u04e9\3\2\2\2\u0092\u04f0\3\2\2\2\u0094"+
		"\u04fb\3\2\2\2\u0096\u0513\3\2\2\2\u0098\u0538\3\2\2\2\u009a\u053a\3\2"+
		"\2\2\u009c\u055a\3\2\2\2\u009e\u0561\3\2\2\2\u00a0\u0563\3\2\2\2\u00a2"+
		"\u0593\3\2\2\2\u00a4\u0595\3\2\2\2\u00a6\u05ab\3\2\2\2\u00a8\u05b7\3\2"+
		"\2\2\u00aa\u05b9\3\2\2\2\u00ac\u05be\3\2\2\2\u00ae\u05fc\3\2\2\2\u00b0"+
		"\u067f\3\2\2\2\u00b2\u0681\3\2\2\2\u00b4\u068f\3\2\2\2\u00b6\u06a2\3\2"+
		"\2\2\u00b8\u06b0\3\2\2\2\u00ba\u08c4\3\2\2\2\u00bc\u092a\3\2\2\2\u00be"+
		"\u092c\3\2\2\2\u00c0\u095c\3\2\2\2\u00c2\u09d5\3\2\2\2\u00c4\u0a95\3\2"+
		"\2\2\u00c6\u0aa8\3\2\2\2\u00c8\u0ae4\3\2\2\2\u00ca\u0b2d\3\2\2\2\u00cc"+
		"\u0b41\3\2\2\2\u00ce\u0c15\3\2\2\2\u00d0\u0c21\3\2\2\2\u00d2\u0c33\3\2"+
		"\2\2\u00d4\u0c47\3\2\2\2\u00d6\u0c51\3\2\2\2\u00d8\u0c60\3\2\2\2\u00da"+
		"\u0c68\3\2\2\2\u00dc\u0c6f\3\2\2\2\u00de\u0c71\3\2\2\2\u00e0\u0c75\3\2"+
		"\2\2\u00e2\u0c7e\3\2\2\2\u00e4\u0c89\3\2\2\2\u00e6\u0c90\3\2\2\2\u00e8"+
		"\u0c97\3\2\2\2\u00ea\u0c99\3\2\2\2\u00ec\u0daf\3\2\2\2\u00ee\u0f3c\3\2"+
		"\2\2\u00f0\u10e8\3\2\2\2\u00f2\u00f3\5\4\3\2\u00f3\u00f4\7\2\2\3\u00f4"+
		"\u00f5\b\2\1\2\u00f5\3\3\2\2\2\u00f6\u00fa\b\3\1\2\u00f7\u00f8\5\16\b"+
		"\2\u00f8\u00f9\7\u0236\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00ff\b\3\1\2\u00ff\5\3\2\2\2\u0100\u0101\5\b\5\2\u0101\u0102"+
		"\b\4\1\2\u0102\u0107\3\2\2\2\u0103\u0104\5\n\6\2\u0104\u0105\b\4\1\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0103\3\2\2\2\u0107\7\3\2\2\2"+
		"\u0108\u0109\7\u011d\2\2\u0109\u012f\b\5\1\2\u010a\u010b\7o\2\2\u010b"+
		"\u012f\b\5\1\2\u010c\u010d\7G\2\2\u010d\u012f\b\5\1\2\u010e\u010f\7\27"+
		"\2\2\u010f\u012f\b\5\1\2\u0110\u0111\7\31\2\2\u0111\u012f\b\5\1\2\u0112"+
		"\u0113\78\2\2\u0113\u012f\b\5\1\2\u0114\u0116\7.\2\2\u0115\u0117\7\u0095"+
		"\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u012f\b\5\1\2\u0119\u011a\7\u0117\2\2\u011a\u012f\b\5\1\2\u011b\u011c"+
		"\7\30\2\2\u011c\u012f\b\5\1\2\u011d\u011e\7s\2\2\u011e\u012f\b\5\1\2\u011f"+
		"\u0120\7*\2\2\u0120\u012f\b\5\1\2\u0121\u0122\7*\2\2\u0122\u0123\7\u0231"+
		"\2\2\u0123\u0124\7\u0238\2\2\u0124\u0125\7\u0223\2\2\u0125\u0126\7\u0238"+
		"\2\2\u0126\u0127\7\u0234\2\2\u0127\u012f\b\5\1\2\u0128\u0129\7)\2\2\u0129"+
		"\u012f\b\5\1\2\u012a\u012b\7\u0081\2\2\u012b\u012f\b\5\1\2\u012c\u012d"+
		"\7\36\2\2\u012d\u012f\b\5\1\2\u012e\u0108\3\2\2\2\u012e\u010a\3\2\2\2"+
		"\u012e\u010c\3\2\2\2\u012e\u010e\3\2\2\2\u012e\u0110\3\2\2\2\u012e\u0112"+
		"\3\2\2\2\u012e\u0114\3\2\2\2\u012e\u0119\3\2\2\2\u012e\u011b\3\2\2\2\u012e"+
		"\u011d\3\2\2\2\u012e\u011f\3\2\2\2\u012e\u0121\3\2\2\2\u012e\u0128\3\2"+
		"\2\2\u012e\u012a\3\2\2\2\u012e\u012c\3\2\2\2\u012f\t\3\2\2\2\u0130\u0131"+
		"\7\23\2\2\u0131\u0132\7\u022d\2\2\u0132\u0133\5\b\5\2\u0133\u0134\7\u022b"+
		"\2\2\u0134\u0135\b\6\1\2\u0135\u0160\3\2\2\2\u0136\u0137\7S\2\2\u0137"+
		"\u0138\7\u022d\2\2\u0138\u0139\5\b\5\2\u0139\u013a\7\u0223\2\2\u013a\u013b"+
		"\5\6\4\2\u013b\u013c\7\u022b\2\2\u013c\u013d\b\6\1\2\u013d\u0160\3\2\2"+
		"\2\u013e\u013f\b\6\1\2\u013f\u0140\7\u0118\2\2\u0140\u0141\7\u022d\2\2"+
		"\u0141\u0142\5\u0088E\2\u0142\u0143\7\u0222\2\2\u0143\u014b\5\6\4\2\u0144"+
		"\u0145\7\u0223\2\2\u0145\u0146\5\u0088E\2\u0146\u0147\7\u0222\2\2\u0147"+
		"\u0148\5\6\4\2\u0148\u014a\3\2\2\2\u0149\u0144\3\2\2\2\u014a\u014d\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7\u022b\2\2\u014f\u0150\b\6\1\2\u0150\u0160"+
		"\3\2\2\2\u0151\u0152\b\6\1\2\u0152\u0153\7\u0122\2\2\u0153\u0154\7\u022d"+
		"\2\2\u0154\u0159\5\6\4\2\u0155\u0156\7\u0223\2\2\u0156\u0158\5\6\4\2\u0157"+
		"\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7\u022b\2\2\u015d"+
		"\u015e\b\6\1\2\u015e\u0160\3\2\2\2\u015f\u0130\3\2\2\2\u015f\u0136\3\2"+
		"\2\2\u015f\u013e\3\2\2\2\u015f\u0151\3\2\2\2\u0160\13\3\2\2\2\u0161\u0162"+
		"\7\u0231\2\2\u0162\u0164\t\2\2\2\u0163\u0165\t\3\2\2\u0164\u0163\3\2\2"+
		"\2\u0164\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0167\7\u0223\2\2\u0167"+
		"\u0169\7\u023b\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016b\7\u0234\2\2\u016b\r\3\2\2\2\u016c\u016d\5~@\2\u016d"+
		"\u016e\b\b\1\2\u016e\u017a\3\2\2\2\u016f\u0170\5\26\f\2\u0170\u0171\b"+
		"\b\1\2\u0171\u017a\3\2\2\2\u0172\u0173\5\34\17\2\u0173\u0174\b\b\1\2\u0174"+
		"\u017a\3\2\2\2\u0175\u0176\5\20\t\2\u0176\u0177\b\b\1\2\u0177\u017a\3"+
		"\2\2\2\u0178\u017a\7\u0221\2\2\u0179\u016c\3\2\2\2\u0179\u016f\3\2\2\2"+
		"\u0179\u0172\3\2\2\2\u0179\u0175\3\2\2\2\u0179\u0178\3\2\2\2\u017a\17"+
		"\3\2\2\2\u017b\u017c\7\u009d\2\2\u017c\u017d\7p\2\2\u017d\u017e\5\u00d6"+
		"l\2\u017e\u017f\5\32\16\2\u017f\u0180\7\u00ae\2\2\u0180\u0181\7\u0114"+
		"\2\2\u0181\u0182\5\22\n\2\u0182\u0183\5\24\13\2\u0183\u0184\b\t\1\2\u0184"+
		"\21\3\2\2\2\u0185\u018a\b\n\1\2\u0186\u0187\7:\2\2\u0187\u0188\7\u00aa"+
		"\2\2\u0188\u018a\b\n\1\2\u0189\u0185\3\2\2\2\u0189\u0186\3\2\2\2\u018a"+
		"\23\3\2\2\2\u018b\u018f\b\13\1\2\u018c\u018d\7\u00e8\2\2\u018d\u018f\b"+
		"\13\1\2\u018e\u018b\3\2\2\2\u018e\u018c\3\2\2\2\u018f\25\3\2\2\2\u0190"+
		"\u0191\5.\30\2\u0191\u0192\b\f\1\2\u0192\u019e\3\2\2\2\u0193\u0194\5*"+
		"\26\2\u0194\u0195\b\f\1\2\u0195\u019e\3\2\2\2\u0196\u0197\5\30\r\2\u0197"+
		"\u0198\b\f\1\2\u0198\u019e\3\2\2\2\u0199\u019a\7\u0127\2\2\u019a\u019b"+
		"\5\u00dco\2\u019b\u019c\b\f\1\2\u019c\u019e\3\2\2\2\u019d\u0190\3\2\2"+
		"\2\u019d\u0193\3\2\2\2\u019d\u0196\3\2\2\2\u019d\u0199\3\2\2\2\u019e\27"+
		"\3\2\2\2\u019f\u01a0\7F\2\2\u01a0\u01a1\t\4\2\2\u01a1\u01a2\7p\2\2\u01a2"+
		"\u01a3\5\u00d6l\2\u01a3\u01a4\5\32\16\2\u01a4\u01a5\5x=\2\u01a5\u01a6"+
		"\5~@\2\u01a6\u01a7\b\r\1\2\u01a7\31\3\2\2\2\u01a8\u01cb\b\16\1\2\u01a9"+
		"\u01aa\b\16\1\2\u01aa\u01ab\7`\2\2\u01ab\u01ac\7\u0231\2\2\u01ac\u01ad"+
		"\5\u00dco\2\u01ad\u01ae\7\u0227\2\2\u01ae\u01b6\5\u00d2j\2\u01af\u01b0"+
		"\7\u0223\2\2\u01b0\u01b1\5\u00dco\2\u01b1\u01b2\7\u0227\2\2\u01b2\u01b3"+
		"\5\u00d2j\2\u01b3\u01b5\3\2\2\2\u01b4\u01af\3\2\2\2\u01b5\u01b8\3\2\2"+
		"\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6"+
		"\3\2\2\2\u01b9\u01ba\7\u0234\2\2\u01ba\u01bb\b\16\1\2\u01bb\u01cb\3\2"+
		"\2\2\u01bc\u01bd\b\16\1\2\u01bd\u01be\7`\2\2\u01be\u01bf\7\u0231\2\2\u01bf"+
		"\u01c4\5\u00dco\2\u01c0\u01c1\7\u0223\2\2\u01c1\u01c3\5\u00dco\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7\u0234\2\2\u01c8"+
		"\u01c9\b\16\1\2\u01c9\u01cb\3\2\2\2\u01ca\u01a8\3\2\2\2\u01ca\u01a9\3"+
		"\2\2\2\u01ca\u01bc\3\2\2\2\u01cb\33\3\2\2\2\u01cc\u01cd\7n\2\2\u01cd\u01ce"+
		"\5$\23\2\u01ce\u01cf\5\"\22\2\u01cf\u01d0\7\u0227\2\2\u01d0\u01d1\5\36"+
		"\20\2\u01d1\u01d2\b\17\1\2\u01d2\35\3\2\2\2\u01d3\u01d4\7\u0237\2\2\u01d4"+
		"\u01df\b\20\1\2\u01d5\u01d6\5\u00eex\2\u01d6\u01d7\b\20\1\2\u01d7\u01df"+
		"\3\2\2\2\u01d8\u01d9\5\u00ecw\2\u01d9\u01da\b\20\1\2\u01da\u01df\3\2\2"+
		"\2\u01db\u01dc\5\u00aeX\2\u01dc\u01dd\b\20\1\2\u01dd\u01df\3\2\2\2\u01de"+
		"\u01d3\3\2\2\2\u01de\u01d5\3\2\2\2\u01de\u01d8\3\2\2\2\u01de\u01db\3\2"+
		"\2\2\u01df\37\3\2\2\2\u01e0\u01e1\7\3\2\2\u01e1\u01e2\7\u0230\2\2\u01e2"+
		"\u01e3\5&\24\2\u01e3\u01e4\5\"\22\2\u01e4\u01e5\7\u0233\2\2\u01e5\u01e6"+
		"\b\21\1\2\u01e6!\3\2\2\2\u01e7\u01e8\b\22\1\2\u01e8\u01ed\5(\25\2\u01e9"+
		"\u01ea\7\4\2\2\u01ea\u01ec\5(\25\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f1\b\22\1\2\u01f1#\3\2\2\2\u01f2\u01fa\b\23\1"+
		"\2\u01f3\u01f4\7\u021e\2\2\u01f4\u01f5\7\u0222\2\2\u01f5\u01fa\b\23\1"+
		"\2\u01f6\u01f7\7\u021f\2\2\u01f7\u01f8\7\u0222\2\2\u01f8\u01fa\b\23\1"+
		"\2\u01f9\u01f2\3\2\2\2\u01f9\u01f3\3\2\2\2\u01f9\u01f6\3\2\2\2\u01fa%"+
		"\3\2\2\2\u01fb\u0203\b\24\1\2\u01fc\u01fd\7\u021e\2\2\u01fd\u01fe\7\u0222"+
		"\2\2\u01fe\u0203\b\24\1\2\u01ff\u0200\7\u021f\2\2\u0200\u0201\7\u0222"+
		"\2\2\u0201\u0203\b\24\1\2\u0202\u01fb\3\2\2\2\u0202\u01fc\3\2\2\2\u0202"+
		"\u01ff\3\2\2\2\u0203\'\3\2\2\2\u0204\u0205\5\u00dco\2\u0205\u0206\b\25"+
		"\1\2\u0206\u020b\3\2\2\2\u0207\u0208\5\u00ecw\2\u0208\u0209\b\25\1\2\u0209"+
		"\u020b\3\2\2\2\u020a\u0204\3\2\2\2\u020a\u0207\3\2\2\2\u020b)\3\2\2\2"+
		"\u020c\u020d\7/\2\2\u020d\u020e\7p\2\2\u020e\u020f\5z>\2\u020f\u0210\5"+
		"\u00d6l\2\u0210\u0211\5,\27\2\u0211\u0212\b\26\1\2\u0212+\3\2\2\2\u0213"+
		"\u0217\b\27\1\2\u0214\u0215\7\u00f6\2\2\u0215\u0217\b\27\1\2\u0216\u0213"+
		"\3\2\2\2\u0216\u0214\3\2\2\2\u0217-\3\2\2\2\u0218\u0219\7!\2\2\u0219\u021a"+
		"\5|?\2\u021a\u021b\7p\2\2\u021b\u021c\5x=\2\u021c\u021d\5\u00d6l\2\u021d"+
		"\u021e\5\60\31\2\u021e\u021f\5\62\32\2\u021f\u0220\5\64\33\2\u0220\u0221"+
		"\58\35\2\u0221\u0222\5<\37\2\u0222\u0223\5B\"\2\u0223\u0224\5H%\2\u0224"+
		"\u0225\5Z.\2\u0225\u0226\5\\/\2\u0226\u0227\5^\60\2\u0227\u0228\5b\62"+
		"\2\u0228\u0229\b\30\1\2\u0229\u0235\3\2\2\2\u022a\u022b\7!\2\2\u022b\u022c"+
		"\5|?\2\u022c\u022d\7p\2\2\u022d\u022e\5x=\2\u022e\u022f\5\u00d6l\2\u022f"+
		"\u0230\7P\2\2\u0230\u0231\5\u00d6l\2\u0231\u0232\5\\/\2\u0232\u0233\b"+
		"\30\1\2\u0233\u0235\3\2\2\2\u0234\u0218\3\2\2\2\u0234\u022a\3\2\2\2\u0235"+
		"/\3\2\2\2\u0236\u0245\b\31\1\2\u0237\u0238\b\31\1\2\u0238\u0239\7\u0231"+
		"\2\2\u0239\u023e\5f\64\2\u023a\u023b\7\u0223\2\2\u023b\u023d\5f\64\2\u023c"+
		"\u023a\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2"+
		"\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0242\7\u0234\2\2\u0242"+
		"\u0243\b\31\1\2\u0243\u0245\3\2\2\2\u0244\u0236\3\2\2\2\u0244\u0237\3"+
		"\2\2\2\u0245\61\3\2\2\2\u0246\u0252\b\32\1\2\u0247\u0248\b\32\1\2\u0248"+
		"\u024c\5l\67\2\u0249\u024b\5l\67\2\u024a\u0249\3\2\2\2\u024b\u024e\3\2"+
		"\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024f\u0250\b\32\1\2\u0250\u0252\3\2\2\2\u0251\u0246\3"+
		"\2\2\2\u0251\u0247\3\2\2\2\u0252\63\3\2\2\2\u0253\u0258\b\33\1\2\u0254"+
		"\u0255\7\u00ab\2\2\u0255\u0256\7\u023a\2\2\u0256\u0258\b\33\1\2\u0257"+
		"\u0253\3\2\2\2\u0257\u0254\3\2\2\2\u0258\65\3\2\2\2\u0259\u025a\58\35"+
		"\2\u025a\67\3\2\2\2\u025b\u026c\b\35\1\2\u025c\u025d\b\35\1\2\u025d\u025e"+
		"\7\u00f0\2\2\u025e\u025f\7\33\2\2\u025f\u0260\7\u0231\2\2\u0260\u0265"+
		"\5:\36\2\u0261\u0262\7\u0223\2\2\u0262\u0264\5:\36\2\u0263\u0261\3\2\2"+
		"\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268"+
		"\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269\7\u0234\2\2\u0269\u026a\b\35"+
		"\1\2\u026a\u026c\3\2\2\2\u026b\u025b\3\2\2\2\u026b\u025c\3\2\2\2\u026c"+
		"9\3\2\2\2\u026d\u026e\5\u0088E\2\u026e\u026f\5\6\4\2\u026f\u0270\b\36"+
		"\1\2\u0270\u0278\3\2\2\2\u0271\u0272\5\u0088E\2\u0272\u0273\5\6\4\2\u0273"+
		"\u0274\7\u00ab\2\2\u0274\u0275\7\u023a\2\2\u0275\u0276\b\36\1\2\u0276"+
		"\u0278\3\2\2\2\u0277\u026d\3\2\2\2\u0277\u0271\3\2\2\2\u0278;\3\2\2\2"+
		"\u0279\u028e\b\37\1\2\u027a\u027b\b\37\1\2\u027b\u027c\7\u00a7\2\2\u027c"+
		"\u027d\7\33\2\2\u027d\u027e\7\u0231\2\2\u027e\u0283\5\u0088E\2\u027f\u0280"+
		"\7\u0223\2\2\u0280\u0282\5\u0088E\2\u0281\u027f\3\2\2\2\u0282\u0285\3"+
		"\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2\2\2\u0285"+
		"\u0283\3\2\2\2\u0286\u0287\7\u0234\2\2\u0287\u0288\5> \2\u0288\u0289\7"+
		"J\2\2\u0289\u028a\7\u0238\2\2\u028a\u028b\7\u00a3\2\2\u028b\u028c\b\37"+
		"\1\2\u028c\u028e\3\2\2\2\u028d\u0279\3\2\2\2\u028d\u027a\3\2\2\2\u028e"+
		"=\3\2\2\2\u028f\u02a3\b \1\2\u0290\u0291\b \1\2\u0291\u0292\7\u0115\2"+
		"\2\u0292\u0293\7\33\2\2\u0293\u0294\7\u0231\2\2\u0294\u0295\5\u0088E\2"+
		"\u0295\u029c\5@!\2\u0296\u0297\7\u0223\2\2\u0297\u0298\5\u0088E\2\u0298"+
		"\u0299\5@!\2\u0299\u029b\3\2\2\2\u029a\u0296\3\2\2\2\u029b\u029e\3\2\2"+
		"\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u029c"+
		"\3\2\2\2\u029f\u02a0\7\u0234\2\2\u02a0\u02a1\b \1\2\u02a1\u02a3\3\2\2"+
		"\2\u02a2\u028f\3\2\2\2\u02a2\u0290\3\2\2\2\u02a3?\3\2\2\2\u02a4\u02aa"+
		"\b!\1\2\u02a5\u02a6\7\u009f\2\2\u02a6\u02aa\b!\1\2\u02a7\u02a8\7\u00ba"+
		"\2\2\u02a8\u02aa\b!\1\2\u02a9\u02a4\3\2\2\2\u02a9\u02a5\3\2\2\2\u02a9"+
		"\u02a7\3\2\2\2\u02aaA\3\2\2\2\u02ab\u02be\b\"\1\2\u02ac\u02ad\b\"\1\2"+
		"\u02ad\u02ae\7\u0110\2\2\u02ae\u02af\7\33\2\2\u02af\u02b0\7\u0231\2\2"+
		"\u02b0\u02b5\5\u0088E\2\u02b1\u02b2\7\u0223\2\2\u02b2\u02b4\5\u0088E\2"+
		"\u02b3\u02b1\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6"+
		"\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9\5D#\2\u02b9"+
		"\u02ba\7\u0234\2\2\u02ba\u02bb\5F$\2\u02bb\u02bc\b\"\1\2\u02bc\u02be\3"+
		"\2\2\2\u02bd\u02ab\3\2\2\2\u02bd\u02ac\3\2\2\2\u02beC\3\2\2\2\u02bf\u02f0"+
		"\b#\1\2\u02c0\u02c1\b#\1\2\u02c1\u02c2\7Y\2\2\u02c2\u02c3\7\u0231\2\2"+
		"\u02c3\u02c8\5\u00d2j\2\u02c4\u02c5\7\u0223\2\2\u02c5\u02c7\5\u00d2j\2"+
		"\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc\7\u0234\2"+
		"\2\u02cc\u02cd\b#\1\2\u02cd\u02f0\3\2\2\2\u02ce\u02cf\b#\1\2\u02cf\u02d0"+
		"\7Y\2\2\u02d0\u02d1\7\u0231\2\2\u02d1\u02d2\7\u0231\2\2\u02d2\u02d7\5"+
		"\u00d2j\2\u02d3\u02d4\7\u0223\2\2\u02d4\u02d6\5\u00d2j\2\u02d5\u02d3\3"+
		"\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02da\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02e9\7\u0234\2\2\u02db\u02dc"+
		"\7\u0223\2\2\u02dc\u02dd\7\u0231\2\2\u02dd\u02e2\5\u00d2j\2\u02de\u02df"+
		"\7\u0223\2\2\u02df\u02e1\5\u00d2j\2\u02e0\u02de\3\2\2\2\u02e1\u02e4\3"+
		"\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4"+
		"\u02e2\3\2\2\2\u02e5\u02e6\7\u0234\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02db"+
		"\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\7\u0234\2\2\u02ed\u02ee"+
		"\b#\1\2\u02ee\u02f0\3\2\2\2\u02ef\u02bf\3\2\2\2\u02ef\u02c0\3\2\2\2\u02ef"+
		"\u02ce\3\2\2\2\u02f0E\3\2\2\2\u02f1\u02f7\b$\1\2\u02f2\u02f3\7\u0115\2"+
		"\2\u02f3\u02f4\7\24\2\2\u02f4\u02f5\7\u00bc\2\2\u02f5\u02f7\b$\1\2\u02f6"+
		"\u02f1\3\2\2\2\u02f6\u02f2\3\2\2\2\u02f7G\3\2\2\2\u02f8\u02ff\b%\1\2\u02f9"+
		"\u02fa\7k\2\2\u02fa\u02fb\7\u00c9\2\2\u02fb\u02fc\5J&\2\u02fc\u02fd\b"+
		"%\1\2\u02fd\u02ff\3\2\2\2\u02fe\u02f8\3\2\2\2\u02fe\u02f9\3\2\2\2\u02ff"+
		"I\3\2\2\2\u0300\u0301\7\u00b8\2\2\u0301\u0302\5L\'\2\u0302\u0303\5N(\2"+
		"\u0303\u0304\5P)\2\u0304\u0305\5R*\2\u0305\u0306\5T+\2\u0306\u0307\b&"+
		"\1\2\u0307\u030e\3\2\2\2\u0308\u0309\7\u0109\2\2\u0309\u030a\7\u023a\2"+
		"\2\u030a\u030b\5V,\2\u030b\u030c\b&\1\2\u030c\u030e\3\2\2\2\u030d\u0300"+
		"\3\2\2\2\u030d\u0308\3\2\2\2\u030eK\3\2\2\2\u030f\u031e\b\'\1\2\u0310"+
		"\u0311\7\u00c5\2\2\u0311\u0312\7\u011c\2\2\u0312\u0313\7\33\2\2\u0313"+
		"\u0314\7\u023a\2\2\u0314\u031e\b\'\1\2\u0315\u0316\7\u00c5\2\2\u0316\u0317"+
		"\7\u011c\2\2\u0317\u0318\7\33\2\2\u0318\u0319\7\u023a\2\2\u0319\u031a"+
		"\7\u00c1\2\2\u031a\u031b\7\33\2\2\u031b\u031c\7\u023a\2\2\u031c\u031e"+
		"\b\'\1\2\u031d\u030f\3\2\2\2\u031d\u0310\3\2\2\2\u031d\u0315\3\2\2\2\u031e"+
		"M\3\2\2\2\u031f\u0327\b(\1\2\u0320\u0321\7\u00a9\2\2\u0321\u0322\7\u00d5"+
		"\2\2\u0322\u0323\7\u011c\2\2\u0323\u0324\7\33\2\2\u0324\u0325\7\u023a"+
		"\2\2\u0325\u0327\b(\1\2\u0326\u031f\3\2\2\2\u0326\u0320\3\2\2\2\u0327"+
		"O\3\2\2\2\u0328\u0330\b)\1\2\u0329\u032a\7S\2\2\u032a\u032b\7\u00d7\2"+
		"\2\u032b\u032c\7\u011c\2\2\u032c\u032d\7\33\2\2\u032d\u032e\7\u023a\2"+
		"\2\u032e\u0330\b)\1\2\u032f\u0328\3\2\2\2\u032f\u0329\3\2\2\2\u0330Q\3"+
		"\2\2\2\u0331\u0338\b*\1\2\u0332\u0333\7\u00da\2\2\u0333\u0334\7\u011c"+
		"\2\2\u0334\u0335\7\33\2\2\u0335\u0336\7\u023a\2\2\u0336\u0338\b*\1\2\u0337"+
		"\u0331\3\2\2\2\u0337\u0332\3\2\2\2\u0338S\3\2\2\2\u0339\u0340\b+\1\2\u033a"+
		"\u033b\7W\2\2\u033b\u033c\7\u00b7\2\2\u033c\u033d\7\24\2\2\u033d\u033e"+
		"\7\u023a\2\2\u033e\u0340\b+\1\2\u033f\u0339\3\2\2\2\u033f\u033a\3\2\2"+
		"\2\u0340U\3\2\2\2\u0341\u0357\b,\1\2\u0342\u0343\b,\1\2\u0343\u0344\7"+
		"\u0085\2\2\u0344\u0345\7\u010a\2\2\u0345\u0346\7\u0231\2\2\u0346\u0347"+
		"\5X-\2\u0347\u0348\7\u0227\2\2\u0348\u0350\5X-\2\u0349\u034a\7\u0223\2"+
		"\2\u034a\u034b\5X-\2\u034b\u034c\7\u0227\2\2\u034c\u034d\5X-\2\u034d\u034f"+
		"\3\2\2\2\u034e\u0349\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7\u0234"+
		"\2\2\u0354\u0355\b,\1\2\u0355\u0357\3\2\2\2\u0356\u0341\3\2\2\2\u0356"+
		"\u0342\3\2\2\2\u0357W\3\2\2\2\u0358\u0359\7\u023a\2\2\u0359\u035a\b-\1"+
		"\2\u035aY\3\2\2\2\u035b\u036f\b.\1\2\u035c\u035d\7\u0115\2\2\u035d\u035e"+
		"\7\24\2\2\u035e\u035f\5d\63\2\u035f\u0360\b.\1\2\u0360\u036f\3\2\2\2\u0361"+
		"\u0362\7\u0115\2\2\u0362\u0363\7\24\2\2\u0363\u0364\7\u00d4\2\2\u0364"+
		"\u0365\7\u023a\2\2\u0365\u0366\7\u00ed\2\2\u0366\u0367\7\u023a\2\2\u0367"+
		"\u036f\b.\1\2\u0368\u0369\7\u0115\2\2\u0369\u036a\7\33\2\2\u036a\u036b"+
		"\7\u023a\2\2\u036b\u036c\5V,\2\u036c\u036d\b.\1\2\u036d\u036f\3\2\2\2"+
		"\u036e\u035b\3\2\2\2\u036e\u035c\3\2\2\2\u036e\u0361\3\2\2\2\u036e\u0368"+
		"\3\2\2\2\u036f[\3\2\2\2\u0370\u0375\b/\1\2\u0371\u0372\7\u00dc\2\2\u0372"+
		"\u0373\7\u023a\2\2\u0373\u0375\b/\1\2\u0374\u0370\3\2\2\2\u0374\u0371"+
		"\3\2\2\2\u0375]\3\2\2\2\u0376\u038b\b\60\1\2\u0377\u0378\b\60\1\2\u0378"+
		"\u0379\7\u011a\2\2\u0379\u037a\7\u0231\2\2\u037a\u037b\5`\61\2\u037b\u037c"+
		"\7\u0227\2\2\u037c\u0384\5`\61\2\u037d\u037e\7\u0223\2\2\u037e\u037f\5"+
		"`\61\2\u037f\u0380\7\u0227\2\2\u0380\u0381\5`\61\2\u0381\u0383\3\2\2\2"+
		"\u0382\u037d\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385"+
		"\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0388\7\u0234\2"+
		"\2\u0388\u0389\b\60\1\2\u0389\u038b\3\2\2\2\u038a\u0376\3\2\2\2\u038a"+
		"\u0377\3\2\2\2\u038b_\3\2\2\2\u038c\u038d\7\u023a\2\2\u038d\u038e\b\61"+
		"\1\2\u038ea\3\2\2\2\u038f\u0395\b\62\1\2\u0390\u0391\7\24\2\2\u0391\u0392"+
		"\5~@\2\u0392\u0393\b\62\1\2\u0393\u0395\3\2\2\2\u0394\u038f\3\2\2\2\u0394"+
		"\u0390\3\2\2\2\u0395c\3\2\2\2\u0396\u0397\7\u0217\2\2\u0397\u03a5\b\63"+
		"\1\2\u0398\u0399\7\u0218\2\2\u0399\u03a5\b\63\1\2\u039a\u039b\7\u0219"+
		"\2\2\u039b\u03a5\b\63\1\2\u039c\u039d\7\u021a\2\2\u039d\u03a5\b\63\1\2"+
		"\u039e\u039f\7\u021b\2\2\u039f\u03a5\b\63\1\2\u03a0\u03a1\7\u021c\2\2"+
		"\u03a1\u03a5\b\63\1\2\u03a2\u03a3\7\u021d\2\2\u03a3\u03a5\b\63\1\2\u03a4"+
		"\u0396\3\2\2\2\u03a4\u0398\3\2\2\2\u03a4\u039a\3\2\2\2\u03a4\u039c\3\2"+
		"\2\2\u03a4\u039e\3\2\2\2\u03a4\u03a0\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5"+
		"e\3\2\2\2\u03a6\u03a7\5\u0088E\2\u03a7\u03a8\5\6\4\2\u03a8\u03a9\b\64"+
		"\1\2\u03a9\u03c7\3\2\2\2\u03aa\u03ab\5\u0088E\2\u03ab\u03ac\5\6\4\2\u03ac"+
		"\u03ad\7\u00ab\2\2\u03ad\u03ae\7\u023a\2\2\u03ae\u03af\b\64\1\2\u03af"+
		"\u03c7\3\2\2\2\u03b0\u03b1\b\64\1\2\u03b1\u03b2\5\u0088E\2\u03b2\u03b4"+
		"\5\6\4\2\u03b3\u03b5\5h\65\2\u03b4\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\7\u00ab"+
		"\2\2\u03b9\u03ba\7\u023a\2\2\u03ba\u03bb\b\64\1\2\u03bb\u03c7\3\2\2\2"+
		"\u03bc\u03bd\b\64\1\2\u03bd\u03be\5\u0088E\2\u03be\u03c0\5\6\4\2\u03bf"+
		"\u03c1\5h\65\2\u03c0\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c0\3\2"+
		"\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\b\64\1\2\u03c5"+
		"\u03c7\3\2\2\2\u03c6\u03a6\3\2\2\2\u03c6\u03aa\3\2\2\2\u03c6\u03b0\3\2"+
		"\2\2\u03c6\u03bc\3\2\2\2\u03c7g\3\2\2\2\u03c8\u03c9\7\u008f\2\2\u03c9"+
		"\u03ca\7\u0136\2\2\u03ca\u03e3\b\65\1\2\u03cb\u03cc\7\u0214\2\2\u03cc"+
		"\u03e3\b\65\1\2\u03cd\u03ce\7V\2\2\u03ce\u03cf\7W\2\2\u03cf\u03e3\b\65"+
		"\1\2\u03d0\u03d1\7\u0216\2\2\u03d1\u03d2\5j\66\2\u03d2\u03d3\b\65\1\2"+
		"\u03d3\u03e3\3\2\2\2\u03d4\u03d5\7\u0215\2\2\u03d5\u03d6\5\u00aeX\2\u03d6"+
		"\u03d7\b\65\1\2\u03d7\u03e3\3\2\2\2\u03d8\u03d9\7\u00c0\2\2\u03d9\u03e3"+
		"\b\65\1\2\u03da\u03db\7\u00bd\2\2\u03db\u03e3\b\65\1\2\u03dc\u03dd\7\u0139"+
		"\2\2\u03dd\u03e3\b\65\1\2\u03de\u03df\7\u013b\2\2\u03df\u03e3\b\65\1\2"+
		"\u03e0\u03e1\7\u0138\2\2\u03e1\u03e3\b\65\1\2\u03e2\u03c8\3\2\2\2\u03e2"+
		"\u03cb\3\2\2\2\u03e2\u03cd\3\2\2\2\u03e2\u03d0\3\2\2\2\u03e2\u03d4\3\2"+
		"\2\2\u03e2\u03d8\3\2\2\2\u03e2\u03da\3\2\2\2\u03e2\u03dc\3\2\2\2\u03e2"+
		"\u03de\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3i\3\2\2\2\u03e4\u03ef\5\u00d2"+
		"j\2\u03e5\u03e6\7\u0150\2\2\u03e6\u03e7\7\u0231\2\2\u03e7\u03ef\7\u0234"+
		"\2\2\u03e8\u03e9\7%\2\2\u03e9\u03ea\7\u0231\2\2\u03ea\u03ef\7\u0234\2"+
		"\2\u03eb\u03ec\7&\2\2\u03ec\u03ed\7\u0231\2\2\u03ed\u03ef\7\u0234\2\2"+
		"\u03ee\u03e4\3\2\2\2\u03ee\u03e5\3\2\2\2\u03ee\u03e8\3\2\2\2\u03ee\u03eb"+
		"\3\2\2\2\u03efk\3\2\2\2\u03f0\u03f1\b\67\1\2\u03f1\u03f2\7\u008f\2\2\u03f2"+
		"\u03f3\7\u0136\2\2\u03f3\u03f4\7\u0231\2\2\u03f4\u03f9\5\u0088E\2\u03f5"+
		"\u03f6\7\u0223\2\2\u03f6\u03f8\5\u0088E\2\u03f7\u03f5\3\2\2\2\u03f8\u03fb"+
		"\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb"+
		"\u03f9\3\2\2\2\u03fc\u03fd\7\u0234\2\2\u03fd\u03fe\5r:\2\u03fe\u03ff\5"+
		"t;\2\u03ff\u0400\5v<\2\u0400\u0401\b\67\1\2\u0401\u043e\3\2\2\2\u0402"+
		"\u0403\b\67\1\2\u0403\u0404\7\u008d\2\2\u0404\u0405\5\u00dco\2\u0405\u0406"+
		"\7\u008e\2\2\u0406\u0407\7\u0136\2\2\u0407\u0408\7\u0231\2\2\u0408\u040d"+
		"\5\u0088E\2\u0409\u040a\7\u0223\2\2\u040a\u040c\5\u0088E\2\u040b\u0409"+
		"\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u0410\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0411\7\u0234\2\2\u0411\u0412"+
		"\7\u0090\2\2\u0412\u0413\5\u00d6l\2\u0413\u0414\7\u0231\2\2\u0414\u0419"+
		"\5\u0088E\2\u0415\u0416\7\u0223\2\2\u0416\u0418\5\u0088E\2\u0417\u0415"+
		"\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a"+
		"\u041c\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u041d\7\u0234\2\2\u041d\u041e"+
		"\5r:\2\u041e\u041f\5t;\2\u041f\u0420\b\67\1\2\u0420\u043e\3\2\2\2\u0421"+
		"\u0422\b\67\1\2\u0422\u0423\7\u008d\2\2\u0423\u0424\5\u00dco\2\u0424\u0425"+
		"\7\u0214\2\2\u0425\u0426\7\u0231\2\2\u0426\u042b\5\u0088E\2\u0427\u0428"+
		"\7\u0223\2\2\u0428\u042a\5\u0088E\2\u0429\u0427\3\2\2\2\u042a\u042d\3"+
		"\2\2\2\u042b\u0429\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042e\3\2\2\2\u042d"+
		"\u042b\3\2\2\2\u042e\u042f\7\u0234\2\2\u042f\u0430\5r:\2\u0430\u0431\5"+
		"t;\2\u0431\u0432\5v<\2\u0432\u0433\b\67\1\2\u0433\u043e\3\2\2\2\u0434"+
		"\u0435\7\u008d\2\2\u0435\u0436\5\u00dco\2\u0436\u0437\7\u0215\2\2\u0437"+
		"\u0438\5\u00aeX\2\u0438\u0439\5n8\2\u0439\u043a\5t;\2\u043a\u043b\5v<"+
		"\2\u043b\u043c\b\67\1\2\u043c\u043e\3\2\2\2\u043d\u03f0\3\2\2\2\u043d"+
		"\u0402\3\2\2\2\u043d\u0421\3\2\2\2\u043d\u0434\3\2\2\2\u043em\3\2\2\2"+
		"\u043f\u0445\b8\1\2\u0440\u0441\7\u00c0\2\2\u0441\u0445\b8\1\2\u0442\u0443"+
		"\7\u00bd\2\2\u0443\u0445\b8\1\2\u0444\u043f\3\2\2\2\u0444\u0440\3\2\2"+
		"\2\u0444\u0442\3\2\2\2\u0445o\3\2\2\2\u0446\u044a\b9\1\2\u0447\u0448\7"+
		"\u00c0\2\2\u0448\u044a\b9\1\2\u0449\u0446\3\2\2\2\u0449\u0447\3\2\2\2"+
		"\u044aq\3\2\2\2\u044b\u044f\b:\1\2\u044c\u044d\7\u00bd\2\2\u044d\u044f"+
		"\b:\1\2\u044e\u044b\3\2\2\2\u044e\u044c\3\2\2\2\u044fs\3\2\2\2\u0450\u0454"+
		"\b;\1\2\u0451\u0452\7\u0139\2\2\u0452\u0454\b;\1\2\u0453\u0450\3\2\2\2"+
		"\u0453\u0451\3\2\2\2\u0454u\3\2\2\2\u0455\u045b\b<\1\2\u0456\u0457\7\u013b"+
		"\2\2\u0457\u045b\b<\1\2\u0458\u0459\7\u0138\2\2\u0459\u045b\b<\1\2\u045a"+
		"\u0455\3\2\2\2\u045a\u0456\3\2\2\2\u045a\u0458\3\2\2\2\u045bw\3\2\2\2"+
		"\u045c\u0462\b=\1\2\u045d\u045e\7B\2\2\u045e\u045f\7V\2\2\u045f\u0460"+
		"\7\63\2\2\u0460\u0462\b=\1\2\u0461\u045c\3\2\2\2\u0461\u045d\3\2\2\2\u0462"+
		"y\3\2\2\2\u0463\u0468\b>\1\2\u0464\u0465\7B\2\2\u0465\u0466\7\63\2\2\u0466"+
		"\u0468\b>\1\2\u0467\u0463\3\2\2\2\u0467\u0464\3\2\2\2\u0468{\3\2\2\2\u0469"+
		"\u046f\b?\1\2\u046a\u046b\7\65\2\2\u046b\u046f\b?\1\2\u046c\u046d\7\u011b"+
		"\2\2\u046d\u046f\b?\1\2\u046e\u0469\3\2\2\2\u046e\u046a\3\2\2\2\u046e"+
		"\u046c\3\2\2\2\u046f}\3\2\2\2\u0470\u0471\5\u0084C\2\u0471\u0472\b@\1"+
		"\2\u0472\u0477\3\2\2\2\u0473\u0474\5\u0080A\2\u0474\u0475\b@\1\2\u0475"+
		"\u0477\3\2\2\2\u0476\u0470\3\2\2\2\u0476\u0473\3\2\2\2\u0477\177\3\2\2"+
		"\2\u0478\u0479\bA\1\2\u0479\u047e\5\u0084C\2\u047a\u047b\7z\2\2\u047b"+
		"\u047c\5\u0082B\2\u047c\u047d\5\u0084C\2\u047d\u047f\3\2\2\2\u047e\u047a"+
		"\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481"+
		"\u0482\3\2\2\2\u0482\u0483\bA\1\2\u0483\u0081\3\2\2\2\u0484\u048a\bB\1"+
		"\2\u0485\u0486\7\20\2\2\u0486\u048a\bB\1\2\u0487\u0488\7-\2\2\u0488\u048a"+
		"\bB\1\2\u0489\u0484\3\2\2\2\u0489\u0485\3\2\2\2\u0489\u0487\3\2\2\2\u048a"+
		"\u0083\3\2\2\2\u048b\u048c\7m\2\2\u048c\u048d\5\u009eP\2\u048d\u048e\5"+
		"\u00a0Q\2\u048e\u048f\bC\1\2\u048f\u04a3\3\2\2\2\u0490\u0491\7m\2\2\u0491"+
		"\u0492\5\u009eP\2\u0492\u0493\5\u00ccg\2\u0493\u0494\bC\1\2\u0494\u04a3"+
		"\3\2\2\2\u0495\u0496\7m\2\2\u0496\u0497\5\u009eP\2\u0497\u0498\5\u00a0"+
		"Q\2\u0498\u0499\7;\2\2\u0499\u049a\5\u0096L\2\u049a\u049b\5\u0086D\2\u049b"+
		"\u049c\5\u008aF\2\u049c\u049d\5\u008cG\2\u049d\u049e\5\u008eH\2\u049e"+
		"\u049f\5\u0090I\2\u049f\u04a0\5\u0094K\2\u04a0\u04a1\bC\1\2\u04a1\u04a3"+
		"\3\2\2\2\u04a2\u048b\3\2\2\2\u04a2\u0490\3\2\2\2\u04a2\u0495\3\2\2\2\u04a3"+
		"\u0085\3\2\2\2\u04a4\u04b6\bD\1\2\u04a5\u04a6\bD\1\2\u04a6\u04a7\7M\2"+
		"\2\u04a7\u04a8\7\u012b\2\2\u04a8\u04a9\5\u00ccg\2\u04a9\u04aa\5\u0088"+
		"E\2\u04aa\u04ab\7\24\2\2\u04ab\u04b0\5\u0088E\2\u04ac\u04ad\7\u0223\2"+
		"\2\u04ad\u04af\5\u0088E\2\u04ae\u04ac\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0"+
		"\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04b0\3\2"+
		"\2\2\u04b3\u04b4\bD\1\2\u04b4\u04b6\3\2\2\2\u04b5\u04a4\3\2\2\2\u04b5"+
		"\u04a5\3\2\2\2\u04b6\u0087\3\2\2\2\u04b7\u04b8\5\u00dco\2\u04b8\u04b9"+
		"\bE\1\2\u04b9\u0089\3\2\2\2\u04ba\u04c0\bF\1\2\u04bb\u04bc\7\u0083\2\2"+
		"\u04bc\u04bd\5\u00aeX\2\u04bd\u04be\bF\1\2\u04be\u04c0\3\2\2\2\u04bf\u04ba"+
		"\3\2\2\2\u04bf\u04bb\3\2\2\2\u04c0\u008b\3\2\2\2\u04c1\u04d0\bG\1\2\u04c2"+
		"\u04c3\bG\1\2\u04c3\u04c4\7?\2\2\u04c4\u04c5\7\33\2\2\u04c5\u04ca\5\u00ae"+
		"X\2\u04c6\u04c7\7\u0223\2\2\u04c7\u04c9\5\u00aeX\2\u04c8\u04c6\3\2\2\2"+
		"\u04c9\u04cc\3\2\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cd"+
		"\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cd\u04ce\bG\1\2\u04ce\u04d0\3\2\2\2\u04cf"+
		"\u04c1\3\2\2\2\u04cf\u04c2\3\2\2\2\u04d0\u008d\3\2\2\2\u04d1\u04d7\bH"+
		"\1\2\u04d2\u04d3\7A\2\2\u04d3\u04d4\5\u00aeX\2\u04d4\u04d5\bH\1\2\u04d5"+
		"\u04d7\3\2\2\2\u04d6\u04d1\3\2\2\2\u04d6\u04d2\3\2\2\2\u04d7\u008f\3\2"+
		"\2\2\u04d8\u04ea\bI\1\2\u04d9\u04da\bI\1\2\u04da\u04db\7[\2\2\u04db\u04dc"+
		"\7\33\2\2\u04dc\u04dd\5\u00d4k\2\u04dd\u04e4\5\u0092J\2\u04de\u04df\7"+
		"\u0223\2\2\u04df\u04e0\5\u00d4k\2\u04e0\u04e1\5\u0092J\2\u04e1\u04e3\3"+
		"\2\2\2\u04e2\u04de\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4"+
		"\u04e5\3\2\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04e8\bI"+
		"\1\2\u04e8\u04ea\3\2\2\2\u04e9\u04d8\3\2\2\2\u04e9\u04d9\3\2\2\2\u04ea"+
		"\u0091\3\2\2\2\u04eb\u04f1\bJ\1\2\u04ec\u04ed\7\u009f\2\2\u04ed\u04f1"+
		"\bJ\1\2\u04ee\u04ef\7\u00ba\2\2\u04ef\u04f1\bJ\1\2\u04f0\u04eb\3\2\2\2"+
		"\u04f0\u04ec\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f1\u0093\3\2\2\2\u04f2\u04fc"+
		"\bK\1\2\u04f3\u04f4\7\u00d9\2\2\u04f4\u04f5\7\u0238\2\2\u04f5\u04fc\b"+
		"K\1\2\u04f6\u04f7\7\u00d9\2\2\u04f7\u04f8\7\u0238\2\2\u04f8\u04f9\7\u0223"+
		"\2\2\u04f9\u04fa\7\u0238\2\2\u04fa\u04fc\bK\1\2\u04fb\u04f2\3\2\2\2\u04fb"+
		"\u04f3\3\2\2\2\u04fb\u04f6\3\2\2\2\u04fc\u0095\3\2\2\2\u04fd\u04fe\5\u009c"+
		"O\2\u04fe\u04ff\bL\1\2\u04ff\u0514\3\2\2\2\u0500\u0501\bL\1\2\u0501\u0504"+
		"\5\u009cO\2\u0502\u0503\7\u0223\2\2\u0503\u0505\5\u009cO\2\u0504\u0502"+
		"\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u0508\3\2\2\2\u0508\u0509\bL\1\2\u0509\u0514\3\2\2\2\u050a\u050b\bL\1"+
		"\2\u050b\u050d\5\u009cO\2\u050c\u050e\5\u0098M\2\u050d\u050c\3\2\2\2\u050e"+
		"\u050f\3\2\2\2\u050f\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\3\2"+
		"\2\2\u0511\u0512\bL\1\2\u0512\u0514\3\2\2\2\u0513\u04fd\3\2\2\2\u0513"+
		"\u0500\3\2\2\2\u0513\u050a\3\2\2\2\u0514\u0097\3\2\2\2\u0515\u0517\7E"+
		"\2\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2\2\u0518"+
		"\u0519\7L\2\2\u0519\u051a\5\u009cO\2\u051a\u051b\bM\1\2\u051b\u0539\3"+
		"\2\2\2\u051c\u051e\7E\2\2\u051d\u051c\3\2\2\2\u051d\u051e\3\2\2\2\u051e"+
		"\u051f\3\2\2\2\u051f\u0520\7L\2\2\u0520\u0521\5\u009cO\2\u0521\u0522\5"+
		"\u009aN\2\u0522\u0523\bM\1\2\u0523\u0539\3\2\2\2\u0524\u0526\t\5\2\2\u0525"+
		"\u0527\7]\2\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2"+
		"\2\2\u0528\u0529\7L\2\2\u0529\u052a\5\u009cO\2\u052a\u052b\5\u009aN\2"+
		"\u052b\u052c\bM\1\2\u052c\u0539\3\2\2\2\u052d\u052e\7\"\2\2\u052e\u052f"+
		"\7L\2\2\u052f\u0530\5\u009cO\2\u0530\u0531\bM\1\2\u0531\u0539\3\2\2\2"+
		"\u0532\u0533\7\"\2\2\u0533\u0534\7L\2\2\u0534\u0535\5\u009cO\2\u0535\u0536"+
		"\5\u009aN\2\u0536\u0537\bM\1\2\u0537\u0539\3\2\2\2\u0538\u0516\3\2\2\2"+
		"\u0538\u051d\3\2\2\2\u0538\u0524\3\2\2\2\u0538\u052d\3\2\2\2\u0538\u0532"+
		"\3\2\2\2\u0539\u0099\3\2\2\2\u053a\u053b\7Y\2\2\u053b\u053c\5\u00aeX\2"+
		"\u053c\u053d\bN\1\2\u053d\u009b\3\2\2\2\u053e\u053f\5\u00d6l\2\u053f\u0540"+
		"\bO\1\2\u0540\u055b\3\2\2\2\u0541\u0543\5\u00d6l\2\u0542\u0544\7\24\2"+
		"\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546"+
		"\5\u00dco\2\u0546\u0547\bO\1\2\u0547\u055b\3\2\2\2\u0548\u0549\7\u0231"+
		"\2\2\u0549\u054a\5\u0080A\2\u054a\u054c\7\u0234\2\2\u054b\u054d\7\24\2"+
		"\2\u054c\u054b\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f"+
		"\5\u00dco\2\u054f\u0550\bO\1\2\u0550\u055b\3\2\2\2\u0551\u0552\7\u0231"+
		"\2\2\u0552\u0553\5\u0084C\2\u0553\u0555\7\u0234\2\2\u0554\u0556\7\24\2"+
		"\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558"+
		"\5\u00dco\2\u0558\u0559\bO\1\2\u0559\u055b\3\2\2\2\u055a\u053e\3\2\2\2"+
		"\u055a\u0541\3\2\2\2\u055a\u0548\3\2\2\2\u055a\u0551\3\2\2\2\u055b\u009d"+
		"\3\2\2\2\u055c\u0562\bP\1\2\u055d\u055e\7\20\2\2\u055e\u0562\bP\1\2\u055f"+
		"\u0560\7-\2\2\u0560\u0562\bP\1\2\u0561\u055c\3\2\2\2\u0561\u055d\3\2\2"+
		"\2\u0561\u055f\3\2\2\2\u0562\u009f\3\2\2\2\u0563\u0564\bQ\1\2\u0564\u0569"+
		"\5\u00a2R\2\u0565\u0566\7\u0223\2\2\u0566\u0568\5\u00a2R\2\u0567\u0565"+
		"\3\2\2\2\u0568\u056b\3\2\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u056c\3\2\2\2\u056b\u0569\3\2\2\2\u056c\u056d\bQ\1\2\u056d\u00a1\3\2"+
		"\2\2\u056e\u0570\5\u00aeX\2\u056f\u0571\7\24\2\2\u0570\u056f\3\2\2\2\u0570"+
		"\u0571\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0573\5\u00dco\2\u0573\u0574"+
		"\bR\1\2\u0574\u0594\3\2\2\2\u0575\u0576\5\u00aeX\2\u0576\u0577\bR\1\2"+
		"\u0577\u0594\3\2\2\2\u0578\u057a\5\u00aeX\2\u0579\u057b\7\24\2\2\u057a"+
		"\u0579\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\5\u00dc"+
		"o\2\u057d\u057e\bR\1\2\u057e\u0594\3\2\2\2\u057f\u0580\5\u00aeX\2\u0580"+
		"\u0581\bR\1\2\u0581\u0594\3\2\2\2\u0582\u0583\7\u022f\2\2\u0583\u0594"+
		"\bR\1\2\u0584\u0585\5\u00dco\2\u0585\u0586\7\4\2\2\u0586\u0587\7\u022f"+
		"\2\2\u0587\u0588\bR\1\2\u0588\u0594\3\2\2\2\u0589\u058a\5\u00a4S\2\u058a"+
		"\u058b\bR\1\2\u058b\u0594\3\2\2\2\u058c\u058e\5\u00a4S\2\u058d\u058f\7"+
		"\24\2\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590\3\2\2\2\u0590"+
		"\u0591\5\u00dco\2\u0591\u0592\bR\1\2\u0592\u0594\3\2\2\2\u0593\u056e\3"+
		"\2\2\2\u0593\u0575\3\2\2\2\u0593\u0578\3\2\2\2\u0593\u057f\3\2\2\2\u0593"+
		"\u0582\3\2\2\2\u0593\u0584\3\2\2\2\u0593\u0589\3\2\2\2\u0593\u058c\3\2"+
		"\2\2\u0594\u00a3\3\2\2\2\u0595\u0596\5\u00a8U\2\u0596\u0597\7^\2\2\u0597"+
		"\u0598\7\u0231\2\2\u0598\u0599\5\u00a6T\2\u0599\u059a\5\u0090I\2\u059a"+
		"\u059b\7\u0234\2\2\u059b\u059c\bS\1\2\u059c\u00a5\3\2\2\2\u059d\u05ac"+
		"\bT\1\2\u059e\u059f\bT\1\2\u059f\u05a0\7`\2\2\u05a0\u05a1\7\33\2\2\u05a1"+
		"\u05a6\5\u00d4k\2\u05a2\u05a3\7\u0223\2\2\u05a3\u05a5\5\u00d4k\2\u05a4"+
		"\u05a2\3\2\2\2\u05a5\u05a8\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a6\u05a7\3\2"+
		"\2\2\u05a7\u05a9\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a9\u05aa\bT\1\2\u05aa"+
		"\u05ac\3\2\2\2\u05ab\u059d\3\2\2\2\u05ab\u059e\3\2\2\2\u05ac\u00a7\3\2"+
		"\2\2\u05ad\u05ae\5\u00c8e\2\u05ae\u05af\bU\1\2\u05af\u05b8\3\2\2\2\u05b0"+
		"\u05b1\5\u00aaV\2\u05b1\u05b2\bU\1\2\u05b2\u05b8\3\2\2\2\u05b3\u05b4\t"+
		"\6\2\2\u05b4\u05b5\5\u00acW\2\u05b5\u05b6\bU\1\2\u05b6\u05b8\3\2\2\2\u05b7"+
		"\u05ad\3\2\2\2\u05b7\u05b0\3\2\2\2\u05b7\u05b3\3\2\2\2\u05b8\u00a9\3\2"+
		"\2\2\u05b9\u05ba\t\7\2\2\u05ba\u05bb\7\u0231\2\2\u05bb\u05bc\7\u0234\2"+
		"\2\u05bc\u05bd\bV\1\2\u05bd\u00ab\3\2\2\2\u05be\u05bf\bW\1\2\u05bf\u05c0"+
		"\7\u0231\2\2\u05c0\u05c5\5\u00aeX\2\u05c1\u05c2\7\u0223\2\2\u05c2\u05c4"+
		"\5\u00aeX\2\u05c3\u05c1\3\2\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3\3\2\2"+
		"\2\u05c5\u05c6\3\2\2\2\u05c6\u05c8\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8\u05c9"+
		"\7\u0234\2\2\u05c9\u05ca\bW\1\2\u05ca\u00ad\3\2\2\2\u05cb\u05cc\bX\1\2"+
		"\u05cc\u05cd\5\u00d2j\2\u05cd\u05ce\bX\1\2\u05ce\u05fd\3\2\2\2\u05cf\u05d0"+
		"\5\u00d4k\2\u05d0\u05d1\bX\1\2\u05d1\u05fd\3\2\2\2\u05d2\u05d3\5\u00ea"+
		"v\2\u05d3\u05d4\5\u00aeX\17\u05d4\u05d5\bX\1\2\u05d5\u05fd\3\2\2\2\u05d6"+
		"\u05d7\7\u0231\2\2\u05d7\u05d8\5\u00aeX\2\u05d8\u05d9\7\u0234\2\2\u05d9"+
		"\u05da\bX\1\2\u05da\u05fd\3\2\2\2\u05db\u05dc\5\u00c6d\2\u05dc\u05dd\b"+
		"X\1\2\u05dd\u05fd\3\2\2\2\u05de\u05df\5\u00ceh\2\u05df\u05e0\bX\1\2\u05e0"+
		"\u05fd\3\2\2\2\u05e1\u05e2\5\u00c4c\2\u05e2\u05e3\bX\1\2\u05e3\u05fd\3"+
		"\2\2\2\u05e4\u05e5\5\u00c2b\2\u05e5\u05e6\bX\1\2\u05e6\u05fd\3\2\2\2\u05e7"+
		"\u05e8\5\u00ba^\2\u05e8\u05e9\bX\1\2\u05e9\u05fd\3\2\2\2\u05ea\u05eb\5"+
		"\u00be`\2\u05eb\u05ec\bX\1\2\u05ec\u05fd\3\2\2\2\u05ed\u05ee\5\u00bc_"+
		"\2\u05ee\u05ef\bX\1\2\u05ef\u05fd\3\2\2\2\u05f0\u05f1\5\u00caf\2\u05f1"+
		"\u05f2\bX\1\2\u05f2\u05fd\3\2\2\2\u05f3\u05f4\5\u00d0i\2\u05f4\u05f5\b"+
		"X\1\2\u05f5\u05fd\3\2\2\2\u05f6\u05f7\5\u00b0Y\2\u05f7\u05f8\bX\1\2\u05f8"+
		"\u05fd\3\2\2\2\u05f9\u05fa\5 \21\2\u05fa\u05fb\bX\1\2\u05fb\u05fd\3\2"+
		"\2\2\u05fc\u05cb\3\2\2\2\u05fc\u05cf\3\2\2\2\u05fc\u05d2\3\2\2\2\u05fc"+
		"\u05d6\3\2\2\2\u05fc\u05db\3\2\2\2\u05fc\u05de\3\2\2\2\u05fc\u05e1\3\2"+
		"\2\2\u05fc\u05e4\3\2\2\2\u05fc\u05e7\3\2\2\2\u05fc\u05ea\3\2\2\2\u05fc"+
		"\u05ed\3\2\2\2\u05fc\u05f0\3\2\2\2\u05fc\u05f3\3\2\2\2\u05fc\u05f6\3\2"+
		"\2\2\u05fc\u05f9\3\2\2\2\u05fd\u0654\3\2\2\2\u05fe\u05ff\f \2\2\u05ff"+
		"\u0600\t\b\2\2\u0600\u0601\5\u00aeX!\u0601\u0602\bX\1\2\u0602\u0653\3"+
		"\2\2\2\u0603\u0604\f\37\2\2\u0604\u0605\t\t\2\2\u0605\u0606\5\u00aeX "+
		"\u0606\u0607\bX\1\2\u0607\u0653\3\2\2\2\u0608\u0609\f\36\2\2\u0609\u060a"+
		"\t\n\2\2\u060a\u060b\5\u00aeX\37\u060b\u060c\bX\1\2\u060c\u0653\3\2\2"+
		"\2\u060d\u060e\f\35\2\2\u060e\u060f\t\13\2\2\u060f\u0610\5\u00aeX\36\u0610"+
		"\u0611\bX\1\2\u0611\u0653\3\2\2\2\u0612\u0613\f\34\2\2\u0613\u0614\t\f"+
		"\2\2\u0614\u0615\5\u00aeX\35\u0615\u0616\bX\1\2\u0616\u0653\3\2\2\2\u0617"+
		"\u0618\f\33\2\2\u0618\u0619\7\22\2\2\u0619\u061a\5\u00aeX\34\u061a\u061b"+
		"\bX\1\2\u061b\u0653\3\2\2\2\u061c\u061d\f\32\2\2\u061d\u061e\7Z\2\2\u061e"+
		"\u061f\5\u00aeX\33\u061f\u0620\bX\1\2\u0620\u0653\3\2\2\2\u0621\u0622"+
		"\f\27\2\2\u0622\u0623\7\26\2\2\u0623\u0624\5\u00aeX\2\u0624\u0625\7\22"+
		"\2\2\u0625\u0626\5\u00aeX\30\u0626\u0627\bX\1\2\u0627\u0653\3\2\2\2\u0628"+
		"\u0629\f\26\2\2\u0629\u062a\7V\2\2\u062a\u062b\7\26\2\2\u062b\u062c\5"+
		"\u00aeX\2\u062c\u062d\7\22\2\2\u062d\u062e\5\u00aeX\27\u062e\u062f\bX"+
		"\1\2\u062f\u0653\3\2\2\2\u0630\u0631\f\22\2\2\u0631\u0632\5\u00e4s\2\u0632"+
		"\u0633\5\u00aeX\23\u0633\u0634\bX\1\2\u0634\u0653\3\2\2\2\u0635\u0636"+
		"\f\31\2\2\u0636\u0637\5\u00e2r\2\u0637\u0638\7\17\2\2\u0638\u0639\bX\1"+
		"\2\u0639\u0653\3\2\2\2\u063a\u063b\f\30\2\2\u063b\u063c\5\u00e2r\2\u063c"+
		"\u063d\7\16\2\2\u063d\u063e\bX\1\2\u063e\u0653\3\2\2\2\u063f\u0640\f\25"+
		"\2\2\u0640\u0641\5\u00e6t\2\u0641\u0642\5\u00acW\2\u0642\u0643\bX\1\2"+
		"\u0643\u0653\3\2\2\2\u0644\u0645\f\24\2\2\u0645\u0646\5\u00e6t\2\u0646"+
		"\u0647\7\u0231\2\2\u0647\u0648\5~@\2\u0648\u0649\7\u0234\2\2\u0649\u064a"+
		"\bX\1\2\u064a\u0653\3\2\2\2\u064b\u064c\f\23\2\2\u064c\u064d\5\u00e8u"+
		"\2\u064d\u064e\7\u0231\2\2\u064e\u064f\5~@\2\u064f\u0650\7\u0234\2\2\u0650"+
		"\u0651\bX\1\2\u0651\u0653\3\2\2\2\u0652\u05fe\3\2\2\2\u0652\u0603\3\2"+
		"\2\2\u0652\u0608\3\2\2\2\u0652\u060d\3\2\2\2\u0652\u0612\3\2\2\2\u0652"+
		"\u0617\3\2\2\2\u0652\u061c\3\2\2\2\u0652\u0621\3\2\2\2\u0652\u0628\3\2"+
		"\2\2\u0652\u0630\3\2\2\2\u0652\u0635\3\2\2\2\u0652\u063a\3\2\2\2\u0652"+
		"\u063f\3\2\2\2\u0652\u0644\3\2\2\2\u0652\u064b\3\2\2\2\u0653\u0656\3\2"+
		"\2\2\u0654\u0652\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u00af\3\2\2\2\u0656"+
		"\u0654\3\2\2\2\u0657\u0658\5\u00b2Z\2\u0658\u0659\bY\1\2\u0659\u0680\3"+
		"\2\2\2\u065a\u065b\5\u00b4[\2\u065b\u065c\bY\1\2\u065c\u0680\3\2\2\2\u065d"+
		"\u065e\5\u00b6\\\2\u065e\u065f\bY\1\2\u065f\u0680\3\2\2\2\u0660\u0661"+
		"\5\u00b8]\2\u0661\u0662\bY\1\2\u0662\u0680\3\2\2\2\u0663\u0664\5\u00d4"+
		"k\2\u0664\u0665\7\u0232\2\2\u0665\u0666\5\u00aeX\2\u0666\u0667\7\u0235"+
		"\2\2\u0667\u0668\bY\1\2\u0668\u0680\3\2\2\2\u0669\u066a\5\u00b2Z\2\u066a"+
		"\u066b\7\u0232\2\2\u066b\u066c\5\u00aeX\2\u066c\u066d\7\u0235\2\2\u066d"+
		"\u066e\bY\1\2\u066e\u0680\3\2\2\2\u066f\u0670\5\u00b4[\2\u0670\u0671\7"+
		"\u0232\2\2\u0671\u0672\5\u00aeX\2\u0672\u0673\7\u0235\2\2\u0673\u0674"+
		"\bY\1\2\u0674\u0680\3\2\2\2\u0675\u0676\5\u00d4k\2\u0676\u0677\7\4\2\2"+
		"\u0677\u0678\5\u00aeX\2\u0678\u0679\bY\1\2\u0679\u0680\3\2\2\2\u067a\u067b"+
		"\5\u00b6\\\2\u067b\u067c\7\4\2\2\u067c\u067d\5\u00aeX\2\u067d\u067e\b"+
		"Y\1\2\u067e\u0680\3\2\2\2\u067f\u0657\3\2\2\2\u067f\u065a\3\2\2\2\u067f"+
		"\u065d\3\2\2\2\u067f\u0660\3\2\2\2\u067f\u0663\3\2\2\2\u067f\u0669\3\2"+
		"\2\2\u067f\u066f\3\2\2\2\u067f\u0675\3\2\2\2\u067f\u067a\3\2\2\2\u0680"+
		"\u00b1\3\2\2\2\u0681\u0682\bZ\1\2\u0682\u0683\7\23\2\2\u0683\u0684\7\u0231"+
		"\2\2\u0684\u0689\5\u00aeX\2\u0685\u0686\7\u0223\2\2\u0686\u0688\5\u00ae"+
		"X\2\u0687\u0685\3\2\2\2\u0688\u068b\3\2\2\2\u0689\u0687\3\2\2\2\u0689"+
		"\u068a\3\2\2\2\u068a\u068c\3\2\2\2\u068b\u0689\3\2\2\2\u068c\u068d\7\u0234"+
		"\2\2\u068d\u068e\bZ\1\2\u068e\u00b3\3\2\2\2\u068f\u0690\b[\1\2\u0690\u0691"+
		"\7S\2\2\u0691\u0692\7\u0231\2\2\u0692\u0693\5\u00aeX\2\u0693\u0694\7\u0223"+
		"\2\2\u0694\u069c\5\u00aeX\2\u0695\u0696\7\u0223\2\2\u0696\u0697\5\u00ae"+
		"X\2\u0697\u0698\7\u0223\2\2\u0698\u0699\5\u00aeX\2\u0699\u069b\3\2\2\2"+
		"\u069a\u0695\3\2\2\2\u069b\u069e\3\2\2\2\u069c\u069a\3\2\2\2\u069c\u069d"+
		"\3\2\2\2\u069d\u069f\3\2\2\2\u069e\u069c\3\2\2\2\u069f\u06a0\7\u0234\2"+
		"\2\u06a0\u06a1\b[\1\2\u06a1\u00b5\3\2\2\2\u06a2\u06a3\b\\\1\2\u06a3\u06a4"+
		"\7\u0118\2\2\u06a4\u06a5\7\u0231\2\2\u06a5\u06aa\5\u00aeX\2\u06a6\u06a7"+
		"\7\u0223\2\2\u06a7\u06a9\5\u00aeX\2\u06a8\u06a6\3\2\2\2\u06a9\u06ac\3"+
		"\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ad\3\2\2\2\u06ac"+
		"\u06aa\3\2\2\2\u06ad\u06ae\7\u0234\2\2\u06ae\u06af\b\\\1\2\u06af\u00b7"+
		"\3\2\2\2\u06b0\u06b1\b]\1\2\u06b1\u06b2\7\u020e\2\2\u06b2\u06b3\7\u0231"+
		"\2\2\u06b3\u06b4\5\u00aeX\2\u06b4\u06b5\7\u0223\2\2\u06b5\u06bd\5\u00ae"+
		"X\2\u06b6\u06b7\7\u0223\2\2\u06b7\u06b8\5\u00aeX\2\u06b8\u06b9\7\u0223"+
		"\2\2\u06b9\u06ba\5\u00aeX\2\u06ba\u06bc\3\2\2\2\u06bb\u06b6\3\2\2\2\u06bc"+
		"\u06bf\3\2\2\2\u06bd\u06bb\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c0\3\2"+
		"\2\2\u06bf\u06bd\3\2\2\2\u06c0\u06c1\7\u0234\2\2\u06c1\u06c2\b]\1\2\u06c2"+
		"\u00b9\3\2\2\2\u06c3\u06c4\7\u0156\2\2\u06c4\u06c5\7\u0231\2\2\u06c5\u06c6"+
		"\5\u00aeX\2\u06c6\u06c7\7\u0234\2\2\u06c7\u06c8\b^\1\2\u06c8\u08c5\3\2"+
		"\2\2\u06c9\u06ca\7\u01cd\2\2\u06ca\u06cb\7\u0231\2\2\u06cb\u06cc\5\u00ae"+
		"X\2\u06cc\u06cd\7\u0234\2\2\u06cd\u06ce\b^\1\2\u06ce\u08c5\3\2\2\2\u06cf"+
		"\u06d0\7\u019f\2\2\u06d0\u06d1\7\u0231\2\2\u06d1\u06d2\5\u00aeX\2\u06d2"+
		"\u06d3\7\u0234\2\2\u06d3\u06d4\b^\1\2\u06d4\u08c5\3\2\2\2\u06d5\u06d6"+
		"\7\u0197\2\2\u06d6\u06d7\7\u0231\2\2\u06d7\u06d8\5\u00aeX\2\u06d8\u06d9"+
		"\7\u0234\2\2\u06d9\u06da\b^\1\2\u06da\u08c5\3\2\2\2\u06db\u06dc\b^\1\2"+
		"\u06dc\u06dd\7\u0185\2\2\u06dd\u06de\7\u0231\2\2\u06de\u06e1\5\u00aeX"+
		"\2\u06df\u06e0\7\u0223\2\2\u06e0\u06e2\5\u00aeX\2\u06e1\u06df\3\2\2\2"+
		"\u06e2\u06e3\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e5"+
		"\3\2\2\2\u06e5\u06e6\7\u0234\2\2\u06e6\u06e7\b^\1\2\u06e7\u08c5\3\2\2"+
		"\2\u06e8\u06e9\b^\1\2\u06e9\u06ea\7\u01ae\2\2\u06ea\u06eb\7\u0231\2\2"+
		"\u06eb\u06ec\5\u00aeX\2\u06ec\u06ed\7\u0223\2\2\u06ed\u06f0\5\u00aeX\2"+
		"\u06ee\u06ef\7\u0223\2\2\u06ef\u06f1\5\u00aeX\2\u06f0\u06ee\3\2\2\2\u06f1"+
		"\u06f2\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\3\2"+
		"\2\2\u06f4\u06f5\7\u0234\2\2\u06f5\u06f6\b^\1\2\u06f6\u08c5\3\2\2\2\u06f7"+
		"\u06f8\7\u01be\2\2\u06f8\u06f9\7\u0231\2\2\u06f9\u06fa\5\u00aeX\2\u06fa"+
		"\u06fb\7\u0223\2\2\u06fb\u06fc\5\u00aeX\2\u06fc\u06fd\7\u0234\2\2\u06fd"+
		"\u06fe\b^\1\2\u06fe\u08c5\3\2\2\2\u06ff\u0700\b^\1\2\u0700\u0701\7\u01af"+
		"\2\2\u0701\u0702\7\u0231\2\2\u0702\u0703\5\u00aeX\2\u0703\u0704\7\u0223"+
		"\2\2\u0704\u0709\5\u00aeX\2\u0705\u0706\7\u0223\2\2\u0706\u0708\5\u00ae"+
		"X\2\u0707\u0705\3\2\2\2\u0708\u070b\3\2\2\2\u0709\u0707\3\2\2\2\u0709"+
		"\u070a\3\2\2\2\u070a\u070c\3\2\2\2\u070b\u0709\3\2\2\2\u070c\u070d\7\u0234"+
		"\2\2\u070d\u070e\b^\1\2\u070e\u08c5\3\2\2\2\u070f\u0710\7\u01c6\2\2\u0710"+
		"\u0711\7\u0231\2\2\u0711\u0712\5\u00aeX\2\u0712\u0713\7\u0223\2\2\u0713"+
		"\u0714\5\u00aeX\2\u0714\u0715\7\u0234\2\2\u0715\u0716\b^\1\2\u0716\u08c5"+
		"\3\2\2\2\u0717\u0718\b^\1\2\u0718\u0719\7\u017b\2\2\u0719\u071a\7\u0231"+
		"\2\2\u071a\u071b\5\u00aeX\2\u071b\u071c\7\u0223\2\2\u071c\u0721\5\u00ae"+
		"X\2\u071d\u071e\7\u0223\2\2\u071e\u0720\5\u00aeX\2\u071f\u071d\3\2\2\2"+
		"\u0720\u0723\3\2\2\2\u0721\u071f\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0724"+
		"\3\2\2\2\u0723\u0721\3\2\2\2\u0724\u0725\7\u0234\2\2\u0725\u0726\b^\1"+
		"\2\u0726\u08c5\3\2\2\2\u0727\u0728\7\u020b\2\2\u0728\u0729\7\u0231\2\2"+
		"\u0729\u072a\5\u00aeX\2\u072a\u072b\7\u0223\2\2\u072b\u072c\5\u00aeX\2"+
		"\u072c\u072d\7\u0234\2\2\u072d\u072e\b^\1\2\u072e\u08c5\3\2\2\2\u072f"+
		"\u0730\7\u01f9\2\2\u0730\u0731\7\u0231\2\2\u0731\u0732\5\u00aeX\2\u0732"+
		"\u0733\7\u0223\2\2\u0733\u0734\5\u00aeX\2\u0734\u0735\7\u0234\2\2\u0735"+
		"\u0736\b^\1\2\u0736\u08c5\3\2\2\2\u0737\u0738\7\u020c\2\2\u0738\u0739"+
		"\7\u0231\2\2\u0739\u073a\5\u00aeX\2\u073a\u073b\7\u0223\2\2\u073b\u073c"+
		"\5\u00aeX\2\u073c\u073d\7\u0234\2\2\u073d\u073e\b^\1\2\u073e\u08c5\3\2"+
		"\2\2\u073f\u0740\7\u0165\2\2\u0740\u0741\7\u0231\2\2\u0741\u0742\5\u00ae"+
		"X\2\u0742\u0743\7\u0223\2\2\u0743\u0744\5\u00aeX\2\u0744\u0745\7\u0234"+
		"\2\2\u0745\u0746\b^\1\2\u0746\u08c5\3\2\2\2\u0747\u0748\7\u020d\2\2\u0748"+
		"\u0749\7\u0231\2\2\u0749\u074a\5\u00aeX\2\u074a\u074b\7\u0223\2\2\u074b"+
		"\u074c\5\u00aeX\2\u074c\u074d\7\u0234\2\2\u074d\u074e\b^\1\2\u074e\u08c5"+
		"\3\2\2\2\u074f\u0750\7\u01a7\2\2\u0750\u0751\7\u0231\2\2\u0751\u0752\5"+
		"\u00aeX\2\u0752\u0753\7\u0234\2\2\u0753\u0754\b^\1\2\u0754\u08c5\3\2\2"+
		"\2\u0755\u0756\7\u01fa\2\2\u0756\u0757\7\u0231\2\2\u0757\u0758\5\u00ae"+
		"X\2\u0758\u0759\7\u0223\2\2\u0759\u075a\5\u00aeX\2\u075a\u075b\7\u0234"+
		"\2\2\u075b\u075c\b^\1\2\u075c\u08c5\3\2\2\2\u075d\u075e\7\u01fa\2\2\u075e"+
		"\u075f\7\u0231\2\2\u075f\u0760\5\u00aeX\2\u0760\u0761\7\u0223\2\2\u0761"+
		"\u0762\5\u00aeX\2\u0762\u0763\7\u0223\2\2\u0763\u0764\5\u00aeX\2\u0764"+
		"\u0765\7\u0234\2\2\u0765\u0766\b^\1\2\u0766\u08c5\3\2\2\2\u0767\u0768"+
		"\t\r\2\2\u0768\u0769\7\u0231\2\2\u0769\u076a\5\u00aeX\2\u076a\u076b\7"+
		"\u0234\2\2\u076b\u076c\b^\1\2\u076c\u08c5\3\2\2\2\u076d\u076e\7\u0151"+
		"\2\2\u076e\u076f\7\u0231\2\2\u076f\u0770\5\u00aeX\2\u0770\u0771\7\u0223"+
		"\2\2\u0771\u0772\5\u00aeX\2\u0772\u0773\7\u0223\2\2\u0773\u0774\5\u00ae"+
		"X\2\u0774\u0775\7\u0234\2\2\u0775\u0776\b^\1\2\u0776\u08c5\3\2\2\2\u0777"+
		"\u0778\7\u017f\2\2\u0778\u0779\7\u0231\2\2\u0779\u077a\5\u00aeX\2\u077a"+
		"\u077b\7\u0234\2\2\u077b\u077c\b^\1\2\u077c\u08c5\3\2\2\2\u077d\u077e"+
		"\7\u0179\2\2\u077e\u077f\7\u0231\2\2\u077f\u0780\5\u00aeX\2\u0780\u0781"+
		"\7\u0234\2\2\u0781\u0782\b^\1\2\u0782\u08c5\3\2\2\2\u0783\u0784\7\u018a"+
		"\2\2\u0784\u0785\7\u0231\2\2\u0785\u0786\5\u00aeX\2\u0786\u0787\7\u0223"+
		"\2\2\u0787\u0788\5\u00aeX\2\u0788\u0789\7\u0234\2\2\u0789\u078a\b^\1\2"+
		"\u078a\u08c5\3\2\2\2\u078b\u078c\7\u018a\2\2\u078c\u078d\7\u0231\2\2\u078d"+
		"\u078e\5\u00aeX\2\u078e\u078f\7\u0223\2\2\u078f\u0790\5\u00aeX\2\u0790"+
		"\u0791\7\u0223\2\2\u0791\u0792\5\u00aeX\2\u0792\u0793\7\u0234\2\2\u0793"+
		"\u0794\b^\1\2\u0794\u08c5\3\2\2\2\u0795\u0796\b^\1\2\u0796\u0797\7\u0182"+
		"\2\2\u0797\u0798\7\u0231\2\2\u0798\u0799\5\u00aeX\2\u0799\u079a\7\u0223"+
		"\2\2\u079a\u079d\5\u00aeX\2\u079b\u079c\7\u0223\2\2\u079c\u079e\5\u00ae"+
		"X\2\u079d\u079b\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u079d\3\2\2\2\u079f"+
		"\u07a0\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07a2\7\u0234\2\2\u07a2\u07a3"+
		"\b^\1\2\u07a3\u08c5\3\2\2\2\u07a4\u07a5\7\u0200\2\2\u07a5\u07a6\7\u0231"+
		"\2\2\u07a6\u07a7\5\u00aeX\2\u07a7\u07a8\7\u0234\2\2\u07a8\u07a9\b^\1\2"+
		"\u07a9\u08c5\3\2\2\2\u07aa\u07ab\7\u01cf\2\2\u07ab\u07ac\7\u0231\2\2\u07ac"+
		"\u07ad\5\u00aeX\2\u07ad\u07ae\7\u0223\2\2\u07ae\u07af\5\u00aeX\2\u07af"+
		"\u07b0\7\u0223\2\2\u07b0\u07b1\5\u00aeX\2\u07b1\u07b2\7\u0234\2\2\u07b2"+
		"\u07b3\b^\1\2\u07b3\u08c5\3\2\2\2\u07b4\u07b5\7\u0155\2\2\u07b5\u07b6"+
		"\7\u0231\2\2\u07b6\u07b7\5\u00aeX\2\u07b7\u07b8\7\u0223\2\2\u07b8\u07b9"+
		"\5\u00aeX\2\u07b9\u07ba\7\u0223\2\2\u07ba\u07bb\5\u00aeX\2\u07bb\u07bc"+
		"\7\u0234\2\2\u07bc\u07bd\b^\1\2\u07bd\u08c5\3\2\2\2\u07be\u07bf\7\u015b"+
		"\2\2\u07bf\u07c0\7\u0231\2\2\u07c0\u07c1\5\u00aeX\2\u07c1\u07c2\7\u0223"+
		"\2\2\u07c2\u07c3\5\u00aeX\2\u07c3\u07c4\7\u0234\2\2\u07c4\u07c5\b^\1\2"+
		"\u07c5\u08c5\3\2\2\2\u07c6\u07c7\7\u00ff\2\2\u07c7\u07c8\7\u0231\2\2\u07c8"+
		"\u07c9\5\u00aeX\2\u07c9\u07ca\7\u0223\2\2\u07ca\u07cb\5\u00aeX\2\u07cb"+
		"\u07cc\7\u0223\2\2\u07cc\u07cd\5\u00aeX\2\u07cd\u07ce\7\u0234\2\2\u07ce"+
		"\u07cf\b^\1\2\u07cf\u08c5\3\2\2\2\u07d0\u07d1\7\u016f\2\2\u07d1\u07d2"+
		"\7\u0231\2\2\u07d2\u07d3\5\u00aeX\2\u07d3\u07d4\7\u0234\2\2\u07d4\u07d5"+
		"\b^\1\2\u07d5\u08c5\3\2\2\2\u07d6\u07d7\7\u01e9\2\2\u07d7";
	private static final String _serializedATNSegment1 =
		"\u07d8\7\u0231\2\2\u07d8\u07d9\5\u00aeX\2\u07d9\u07da\7\u0223\2\2\u07da"+
		"\u07db\5\u00aeX\2\u07db\u07dc\7\u0223\2\2\u07dc\u07dd\5\u00aeX\2\u07dd"+
		"\u07de\7\u0234\2\2\u07de\u07df\b^\1\2\u07df\u08c5\3\2\2\2\u07e0\u07e1"+
		"\7\u017e\2\2\u07e1\u07e2\7\u0231\2\2\u07e2\u07e3\5\u00aeX\2\u07e3\u07e4"+
		"\7\u0234\2\2\u07e4\u07e5\b^\1\2\u07e5\u08c5\3\2\2\2\u07e6\u07e7\7\u01e1"+
		"\2\2\u07e7\u07e8\7\u0231\2\2\u07e8\u07e9\5\u00aeX\2\u07e9\u07ea\7\u0223"+
		"\2\2\u07ea\u07eb\5\u00aeX\2\u07eb\u07ec\7\u0223\2\2\u07ec\u07ed\5\u00ae"+
		"X\2\u07ed\u07ee\7\u0234\2\2\u07ee\u07ef\b^\1\2\u07ef\u08c5\3\2\2\2\u07f0"+
		"\u07f1\7\u01c9\2\2\u07f1\u07f2\7\u0231\2\2\u07f2\u07f3\5\u00aeX\2\u07f3"+
		"\u07f4\7\u0234\2\2\u07f4\u07f5\b^\1\2\u07f5\u08c5\3\2\2\2\u07f6\u07f7"+
		"\7\u01cc\2\2\u07f7\u07f8\7\u0231\2\2\u07f8\u07f9\5\u00aeX\2\u07f9\u07fa"+
		"\7\u0223\2\2\u07fa\u07fb\5\u00aeX\2\u07fb\u07fc\7\u0234\2\2\u07fc\u07fd"+
		"\b^\1\2\u07fd\u08c5\3\2\2\2\u07fe\u07ff\7\u0161\2\2\u07ff\u0800\7\u0231"+
		"\2\2\u0800\u0801\5\u00aeX\2\u0801\u0802\7\u0234\2\2\u0802\u0803\b^\1\2"+
		"\u0803\u08c5\3\2\2\2\u0804\u0805\7\u0161\2\2\u0805\u0806\7\u0231\2\2\u0806"+
		"\u0807\5\u00aeX\2\u0807\u0808\7\u0223\2\2\u0808\u0809\5\u00aeX\2\u0809"+
		"\u080a\7\u0234\2\2\u080a\u080b\b^\1\2\u080b\u08c5\3\2\2\2\u080c\u080d"+
		"\7\u0161\2\2\u080d\u080e\7\u0231\2\2\u080e\u080f\5\u00aeX\2\u080f\u0810"+
		"\7\u0223\2\2\u0810\u0811\5\u00aeX\2\u0811\u0812\7\u0223\2\2\u0812\u0813"+
		"\5\u00aeX\2\u0813\u0814\7\u0234\2\2\u0814\u0815\b^\1\2\u0815\u08c5\3\2"+
		"\2\2\u0816\u0817\t\16\2\2\u0817\u0818\7\u0231\2\2\u0818\u0819\5\u00ae"+
		"X\2\u0819\u081a\7\u0223\2\2\u081a\u081b\5\u00aeX\2\u081b\u081c\7\u0234"+
		"\2\2\u081c\u081d\b^\1\2\u081d\u08c5\3\2\2\2\u081e\u081f\t\16\2\2\u081f"+
		"\u0820\7\u0231\2\2\u0820\u0821\5\u00aeX\2\u0821\u0822\7\u0223\2\2\u0822"+
		"\u0823\5\u00aeX\2\u0823\u0824\7\u0223\2\2\u0824\u0825\5\u00aeX\2\u0825"+
		"\u0826\7\u0234\2\2\u0826\u0827\b^\1\2\u0827\u08c5\3\2\2\2\u0828\u0829"+
		"\7\u01a0\2\2\u0829\u082a\7\u0231\2\2\u082a\u082b\5\u00aeX\2\u082b\u082c"+
		"\7\u0223\2\2\u082c\u082d\5\u00aeX\2\u082d\u082e\7\u0223\2\2\u082e\u082f"+
		"\5\u00aeX\2\u082f\u0830\7\u0234\2\2\u0830\u0831\b^\1\2\u0831\u08c5\3\2"+
		"\2\2\u0832\u0833\7\u01a1\2\2\u0833\u0834\7\u0231\2\2\u0834\u0835\5\u00ae"+
		"X\2\u0835\u0836\7\u0223\2\2\u0836\u0837\5\u00aeX\2\u0837\u0838\7\u0223"+
		"\2\2\u0838\u0839\5\u00aeX\2\u0839\u083a\7\u0234\2\2\u083a\u083b\b^\1\2"+
		"\u083b\u08c5\3\2\2\2\u083c\u083d\7\u01f2\2\2\u083d\u083e\7\u0231\2\2\u083e"+
		"\u083f\5\u00aeX\2\u083f\u0840\7\u0234\2\2\u0840\u0841\b^\1\2\u0841\u08c5"+
		"\3\2\2\2\u0842\u0843\7\u0163\2\2\u0843\u0844\7\u0231\2\2\u0844\u0845\5"+
		"\u00aeX\2\u0845\u0846\7\u0234\2\2\u0846\u0847\b^\1\2\u0847\u08c5\3\2\2"+
		"\2\u0848\u0849\t\17\2\2\u0849\u084a\7\u0231\2\2\u084a\u084b\5\u00aeX\2"+
		"\u084b\u084c\7\u0234\2\2\u084c\u084d\b^\1\2\u084d\u08c5\3\2\2\2\u084e"+
		"\u084f\7\u019b\2\2\u084f\u0850\7\u0231\2\2\u0850\u0851\5\u00aeX\2\u0851"+
		"\u0852\7\u0234\2\2\u0852\u0853\b^\1\2\u0853\u08c5\3\2\2\2\u0854\u0855"+
		"\7\u01a2\2\2\u0855\u0856\7\u0231\2\2\u0856\u0857\5\u00aeX\2\u0857\u0858"+
		"\7\u0223\2\2\u0858\u0859\5\u00aeX\2\u0859\u085a\7\u0234\2\2\u085a\u085b"+
		"\b^\1\2\u085b\u08c5\3\2\2\2\u085c\u085d\7\u01e3\2\2\u085d\u085e\7\u0231"+
		"\2\2\u085e\u085f\5\u00aeX\2\u085f\u0860\7\u0234\2\2\u0860\u0861\b^\1\2"+
		"\u0861\u08c5\3\2\2\2\u0862\u0863\7\u01f4\2\2\u0863\u0864\7\u0231\2\2\u0864"+
		"\u0865\5\u00aeX\2\u0865\u0866\7\u0234\2\2\u0866\u0867\b^\1\2\u0867\u08c5"+
		"\3\2\2\2\u0868\u0869\7\u01f4\2\2\u0869\u086a\7\u0231\2\2\u086a\u086b\5"+
		"\u00aeX\2\u086b\u086c\7\u0223\2\2\u086c\u086d\5\u00aeX\2\u086d\u086e\7"+
		"\u0234\2\2\u086e\u086f\b^\1\2\u086f\u08c5\3\2\2\2\u0870\u0871\7\u01f4"+
		"\2\2\u0871\u0872\7\u0231\2\2\u0872\u0873\5\u00aeX\2\u0873\u0874\7\u0223"+
		"\2\2\u0874\u0875\5\u00aeX\2\u0875\u0876\7\u0223\2\2\u0876\u0877\5\u00ae"+
		"X\2\u0877\u0878\7\u0234\2\2\u0878\u0879\b^\1\2\u0879\u08c5\3\2\2\2\u087a"+
		"\u087b\7\u01f4\2\2\u087b\u087c\7\u0231\2\2\u087c\u087d\5\u00aeX\2\u087d"+
		"\u087e\7\u0223\2\2\u087e\u087f\5\u00aeX\2\u087f\u0880\7\u0223\2\2\u0880"+
		"\u0881\5\u00aeX\2\u0881\u0882\7\u0223\2\2\u0882\u0883\5\u00aeX\2\u0883"+
		"\u0884\7\u0234\2\2\u0884\u0885\b^\1\2\u0885\u08c5\3\2\2\2\u0886\u0887"+
		"\7\u016e\2\2\u0887\u0888\7\u0231\2\2\u0888\u0889\5\u00aeX\2\u0889\u088a"+
		"\7\u0234\2\2\u088a\u088b\b^\1\2\u088b\u08c5\3\2\2\2\u088c\u088d\7\u016e"+
		"\2\2\u088d\u088e\7\u0231\2\2\u088e\u088f\5\u00aeX\2\u088f\u0890\7\u0223"+
		"\2\2\u0890\u0891\5\u00aeX\2\u0891\u0892\7\u0234\2\2\u0892\u0893\b^\1\2"+
		"\u0893\u08c5\3\2\2\2\u0894\u0895\7\u016c\2\2\u0895\u0896\7\u0231\2\2\u0896"+
		"\u0897\5\u00aeX\2\u0897\u0898\7\u0234\2\2\u0898\u0899\b^\1\2\u0899\u08c5"+
		"\3\2\2\2\u089a\u089b\7\u016c\2\2\u089b\u089c\7\u0231\2\2\u089c\u089d\5"+
		"\u00aeX\2\u089d\u089e\7\u0223\2\2\u089e\u089f\5\u00aeX\2\u089f\u08a0\7"+
		"\u0234\2\2\u08a0\u08a1\b^\1\2\u08a1\u08c5\3\2\2\2\u08a2\u08a3\7\u01e2"+
		"\2\2\u08a3\u08a4\7\u0231\2\2\u08a4\u08a5\5\u00aeX\2\u08a5\u08a6\7\u0234"+
		"\2\2\u08a6\u08a7\b^\1\2\u08a7\u08c5\3\2\2\2\u08a8\u08a9\7\u01e2\2\2\u08a9"+
		"\u08aa\7\u0231\2\2\u08aa\u08ab\5\u00aeX\2\u08ab\u08ac\7\u0223\2\2\u08ac"+
		"\u08ad\5\u00aeX\2\u08ad\u08ae\7\u0234\2\2\u08ae\u08af\b^\1\2\u08af\u08c5"+
		"\3\2\2\2\u08b0\u08b1\7\u01f5\2\2\u08b1\u08b2\7\u0231\2\2\u08b2\u08b3\5"+
		"\u00aeX\2\u08b3\u08b4\7\u0234\2\2\u08b4\u08b5\b^\1\2\u08b5\u08c5\3\2\2"+
		"\2\u08b6\u08b7\7\u01f5\2\2\u08b7\u08b8\7\u0231\2\2\u08b8\u08b9\5\u00ae"+
		"X\2\u08b9\u08ba\7\u0223\2\2\u08ba\u08bb\5\u00aeX\2\u08bb\u08bc\7\u0234"+
		"\2\2\u08bc\u08bd\b^\1\2\u08bd\u08c5\3\2\2\2\u08be\u08bf\7\u015f\2\2\u08bf"+
		"\u08c0\7\u0231\2\2\u08c0\u08c1\5\u00aeX\2\u08c1\u08c2\7\u0234\2\2\u08c2"+
		"\u08c3\b^\1\2\u08c3\u08c5\3\2\2\2\u08c4\u06c3\3\2\2\2\u08c4\u06c9\3\2"+
		"\2\2\u08c4\u06cf\3\2\2\2\u08c4\u06d5\3\2\2\2\u08c4\u06db\3\2\2\2\u08c4"+
		"\u06e8\3\2\2\2\u08c4\u06f7\3\2\2\2\u08c4\u06ff\3\2\2\2\u08c4\u070f\3\2"+
		"\2\2\u08c4\u0717\3\2\2\2\u08c4\u0727\3\2\2\2\u08c4\u072f\3\2\2\2\u08c4"+
		"\u0737\3\2\2\2\u08c4\u073f\3\2\2\2\u08c4\u0747\3\2\2\2\u08c4\u074f\3\2"+
		"\2\2\u08c4\u0755\3\2\2\2\u08c4\u075d\3\2\2\2\u08c4\u0767\3\2\2\2\u08c4"+
		"\u076d\3\2\2\2\u08c4\u0777\3\2\2\2\u08c4\u077d\3\2\2\2\u08c4\u0783\3\2"+
		"\2\2\u08c4\u078b\3\2\2\2\u08c4\u0795\3\2\2\2\u08c4\u07a4\3\2\2\2\u08c4"+
		"\u07aa\3\2\2\2\u08c4\u07b4\3\2\2\2\u08c4\u07be\3\2\2\2\u08c4\u07c6\3\2"+
		"\2\2\u08c4\u07d0\3\2\2\2\u08c4\u07d6\3\2\2\2\u08c4\u07e0\3\2\2\2\u08c4"+
		"\u07e6\3\2\2\2\u08c4\u07f0\3\2\2\2\u08c4\u07f6\3\2\2\2\u08c4\u07fe\3\2"+
		"\2\2\u08c4\u0804\3\2\2\2\u08c4\u080c\3\2\2\2\u08c4\u0816\3\2\2\2\u08c4"+
		"\u081e\3\2\2\2\u08c4\u0828\3\2\2\2\u08c4\u0832\3\2\2\2\u08c4\u083c\3\2"+
		"\2\2\u08c4\u0842\3\2\2\2\u08c4\u0848\3\2\2\2\u08c4\u084e\3\2\2\2\u08c4"+
		"\u0854\3\2\2\2\u08c4\u085c\3\2\2\2\u08c4\u0862\3\2\2\2\u08c4\u0868\3\2"+
		"\2\2\u08c4\u0870\3\2\2\2\u08c4\u087a\3\2\2\2\u08c4\u0886\3\2\2\2\u08c4"+
		"\u088c\3\2\2\2\u08c4\u0894\3\2\2\2\u08c4\u089a\3\2\2\2\u08c4\u08a2\3\2"+
		"\2\2\u08c4\u08a8\3\2\2\2\u08c4\u08b0\3\2\2\2\u08c4\u08b6\3\2\2\2\u08c4"+
		"\u08be\3\2\2\2\u08c5\u00bb\3\2\2\2\u08c6\u08c7\b_\1\2\u08c7\u08c8\7\u01b2"+
		"\2\2\u08c8\u08c9\7\u0231\2\2\u08c9\u08ca\5\u00aeX\2\u08ca\u08cb\7\u0223"+
		"\2\2\u08cb\u08d0\5\u00aeX\2\u08cc\u08cd\7\u0223\2\2\u08cd\u08cf\5\u00ae"+
		"X\2\u08ce\u08cc\3\2\2\2\u08cf\u08d2\3\2\2\2\u08d0\u08ce\3\2\2\2\u08d0"+
		"\u08d1\3\2\2\2\u08d1\u08d3\3\2\2\2\u08d2\u08d0\3\2\2\2\u08d3\u08d4\7\u0234"+
		"\2\2\u08d4\u08d5\b_\1\2\u08d5\u092b\3\2\2\2\u08d6\u08d7\b_\1\2\u08d7\u08d8"+
		"\7\u0180\2\2\u08d8\u08d9\7\u0231\2\2\u08d9\u08da\5\u00aeX\2\u08da\u08db"+
		"\7\u0223\2\2\u08db\u08e0\5\u00aeX\2\u08dc\u08dd\7\u0223\2\2\u08dd\u08df"+
		"\5\u00aeX\2\u08de\u08dc\3\2\2\2\u08df\u08e2\3\2\2\2\u08e0\u08de\3\2\2"+
		"\2\u08e0\u08e1\3\2\2\2\u08e1\u08e3\3\2\2\2\u08e2\u08e0\3\2\2\2\u08e3\u08e4"+
		"\7\u0234\2\2\u08e4\u08e5\b_\1\2\u08e5\u092b\3\2\2\2\u08e6\u08e7\b_\1\2"+
		"\u08e7\u08e8\7\u01ca\2\2\u08e8\u08e9\7\u0231\2\2\u08e9\u08ee\5\u00aeX"+
		"\2\u08ea\u08eb\7\u0223\2\2\u08eb\u08ed\5\u00aeX\2\u08ec\u08ea\3\2\2\2"+
		"\u08ed\u08f0\3\2\2\2\u08ee\u08ec\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08f1"+
		"\3\2\2\2\u08f0\u08ee\3\2\2\2\u08f1\u08f2\7\u0234\2\2\u08f2\u08f3\b_\1"+
		"\2\u08f3\u092b\3\2\2\2\u08f4\u08f5\7\u0150\2\2\u08f5\u08f6\7\u0231\2\2"+
		"\u08f6\u08f7\7\u0234\2\2\u08f7\u092b\b_\1\2\u08f8\u08f9\7\u01b0\2\2\u08f9"+
		"\u08fa\7\u0231\2\2\u08fa\u08fb\7\u0234\2\2\u08fb\u092b\b_\1\2\u08fc\u08fd"+
		"\7\u01bb\2\2\u08fd\u08fe\7\u0231\2\2\u08fe\u08ff\7\u0234\2\2\u08ff\u092b"+
		"\b_\1\2\u0900\u0901\t\20\2\2\u0901\u0902\7\u0231\2\2\u0902\u0903\5\u00ae"+
		"X\2\u0903\u0904\7\u0234\2\2\u0904\u0905\b_\1\2\u0905\u092b\3\2\2\2\u0906"+
		"\u0907\7\u0181\2\2\u0907\u0908\7\u0231\2\2\u0908\u0909\5\u00aeX\2\u0909"+
		"\u090a\7\u0223\2\2\u090a\u090b\5\u00aeX\2\u090b\u090c\7\u0234\2\2\u090c"+
		"\u090d\b_\1\2\u090d\u092b\3\2\2\2\u090e\u090f\7\u016d\2\2\u090f\u0910"+
		"\7\u0231\2\2\u0910\u0911\5\u00aeX\2\u0911\u0912\7\u0223\2\2\u0912\u0913"+
		"\5\u00aeX\2\u0913\u0914\7\u0234\2\2\u0914\u0915\b_\1\2\u0915\u092b\3\2"+
		"\2\2\u0916\u0917\7\u01b7\2\2\u0917\u0918\7\u0231\2\2\u0918\u0919\5\u00ae"+
		"X\2\u0919\u091a\7\u0223\2\2\u091a\u091b\5\u00aeX\2\u091b\u091c\7\u0234"+
		"\2\2\u091c\u091d\b_\1\2\u091d\u092b\3\2\2\2\u091e\u091f\7\u01ee\2\2\u091f"+
		"\u0920\7\u0231\2\2\u0920\u0921\7\u0234\2\2\u0921\u092b\b_\1\2\u0922\u0923"+
		"\t\21\2\2\u0923\u0924\7\u0231\2\2\u0924\u0925\5\u00aeX\2\u0925\u0926\7"+
		"\u0223\2\2\u0926\u0927\5\u00aeX\2\u0927\u0928\7\u0234\2\2\u0928\u0929"+
		"\b_\1\2\u0929\u092b\3\2\2\2\u092a\u08c6\3\2\2\2\u092a\u08d6\3\2\2\2\u092a"+
		"\u08e6\3\2\2\2\u092a\u08f4\3\2\2\2\u092a\u08f8\3\2\2\2\u092a\u08fc\3\2"+
		"\2\2\u092a\u0900\3\2\2\2\u092a\u0906\3\2\2\2\u092a\u090e\3\2\2\2\u092a"+
		"\u0916\3\2\2\2\u092a\u091e\3\2\2\2\u092a\u0922\3\2\2\2\u092b\u00bd\3\2"+
		"\2\2\u092c\u092d\b`\1\2\u092d\u0930\5\u00c0a\2\u092e\u092f\7\u0224\2\2"+
		"\u092f\u0931\5\u00c0a\2\u0930\u092e\3\2\2\2\u0931\u0932\3\2\2\2\u0932"+
		"\u0930\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0934\3\2\2\2\u0934\u0935\b`"+
		"\1\2\u0935\u00bf\3\2\2\2\u0936\u0937\5\u00d2j\2\u0937\u0938\ba\1\2\u0938"+
		"\u095d\3\2\2\2\u0939\u093a\5\u00d4k\2\u093a\u093b\ba\1\2\u093b\u095d\3"+
		"\2\2\2\u093c\u093d\7\u0231\2\2\u093d\u093e\5\u00aeX\2\u093e\u093f\7\u0234"+
		"\2\2\u093f\u0940\ba\1\2\u0940\u095d\3\2\2\2\u0941\u0942\5\u00c6d\2\u0942"+
		"\u0943\ba\1\2\u0943\u095d\3\2\2\2\u0944\u0945\5\u00ceh\2\u0945\u0946\b"+
		"a\1\2\u0946\u095d\3\2\2\2\u0947\u0948\5\u00c4c\2\u0948\u0949\ba\1\2\u0949"+
		"\u095d\3\2\2\2\u094a\u094b\5\u00c2b\2\u094b\u094c\ba\1\2\u094c\u095d\3"+
		"\2\2\2\u094d\u094e\5\u00ba^\2\u094e\u094f\ba\1\2\u094f\u095d\3\2\2\2\u0950"+
		"\u0951\5\u00bc_\2\u0951\u0952\ba\1\2\u0952\u095d\3\2\2\2\u0953\u0954\5"+
		"\u00caf\2\u0954\u0955\ba\1\2\u0955\u095d\3\2\2\2\u0956\u0957\5 \21\2\u0957"+
		"\u0958\ba\1\2\u0958\u095d\3\2\2\2\u0959\u095a\5\u00d0i\2\u095a\u095b\b"+
		"a\1\2\u095b\u095d\3\2\2\2\u095c\u0936\3\2\2\2\u095c\u0939\3\2\2\2\u095c"+
		"\u093c\3\2\2\2\u095c\u0941\3\2\2\2\u095c\u0944\3\2\2\2\u095c\u0947\3\2"+
		"\2\2\u095c\u094a\3\2\2\2\u095c\u094d\3\2\2\2\u095c\u0950\3\2\2\2\u095c"+
		"\u0953\3\2\2\2\u095c\u0956\3\2\2\2\u095c\u0959\3\2\2\2\u095d\u00c1\3\2"+
		"\2\2\u095e\u095f\7B\2\2\u095f\u0960\7\u0231\2\2\u0960\u0961\5\u00aeX\2"+
		"\u0961\u0962\7\u0223\2\2\u0962\u0963\5\u00aeX\2\u0963\u0964\7\u0223\2"+
		"\2\u0964\u0965\5\u00aeX\2\u0965\u0966\7\u0234\2\2\u0966\u0967\bb\1\2\u0967"+
		"\u09d6\3\2\2\2\u0968\u0969\7\u0188\2\2\u0969\u096a\7\u0231\2\2\u096a\u096b"+
		"\5\u00aeX\2\u096b\u096c\7\u0234\2\2\u096c\u096d\bb\1\2\u096d\u09d6\3\2"+
		"\2\2\u096e\u096f\7\u0189\2\2\u096f\u0970\7\u0231\2\2\u0970\u0971\5\u00ae"+
		"X\2\u0971\u0972\7\u0234\2\2\u0972\u0973\bb\1\2\u0973\u09d6\3\2\2\2\u0974"+
		"\u0975\7\u0186\2\2\u0975\u0976\7\u0231\2\2\u0976\u0977\5\u00aeX\2\u0977"+
		"\u0978\7\u0223\2\2\u0978\u0979\5\u00aeX\2\u0979\u097a\7\u0234\2\2\u097a"+
		"\u097b\bb\1\2\u097b\u09d6\3\2\2\2\u097c\u097d\bb\1\2\u097d\u097e\7\u01c3"+
		"\2\2\u097e\u097f\7\u0231\2\2\u097f\u0982\5\u00aeX\2\u0980\u0981\7\u0223"+
		"\2\2\u0981\u0983\5\u00aeX\2\u0982\u0980\3\2\2\2\u0983\u0984\3\2\2\2\u0984"+
		"\u0982\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u0987\7\u0234"+
		"\2\2\u0987\u0988\bb\1\2\u0988\u09d6\3\2\2\2\u0989\u098a\bb\1\2\u098a\u098b"+
		"\7\34\2\2\u098b\u0991\5\u00aeX\2\u098c\u098d\7\u0082\2\2\u098d\u098e\5"+
		"\u00aeX\2\u098e\u098f\7r\2\2\u098f\u0990\5\u00aeX\2\u0990\u0992\3\2\2"+
		"\2\u0991\u098c\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u0991\3\2\2\2\u0993\u0994"+
		"\3\2\2\2\u0994\u0995\3\2\2\2\u0995\u0996\7\61\2\2\u0996\u0997\bb\1\2\u0997"+
		"\u09d6\3\2\2\2\u0998\u0999\bb\1\2\u0999\u099a\7\34\2\2\u099a\u09a0\5\u00ae"+
		"X\2\u099b\u099c\7\u0082\2\2\u099c\u099d\5\u00aeX\2\u099d\u099e\7r\2\2"+
		"\u099e\u099f\5\u00aeX\2\u099f\u09a1\3\2\2\2\u09a0\u099b\3\2\2\2\u09a1"+
		"\u09a2\3\2\2\2\u09a2\u09a0\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4\3\2"+
		"\2\2\u09a4\u09a5\7\60\2\2\u09a5\u09a6\5\u00aeX\2\u09a6\u09a7\7\61\2\2"+
		"\u09a7\u09a8\bb\1\2\u09a8\u09d6\3\2\2\2\u09a9\u09aa\bb\1\2\u09aa\u09b0"+
		"\7\34\2\2\u09ab\u09ac\7\u0082\2\2\u09ac\u09ad\5\u00aeX\2\u09ad\u09ae\7"+
		"r\2\2\u09ae\u09af\5\u00aeX\2\u09af\u09b1\3\2\2\2\u09b0\u09ab\3\2\2\2\u09b1"+
		"\u09b2\3\2\2\2\u09b2\u09b0\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u09b4\3\2"+
		"\2\2\u09b4\u09b5\7\61\2\2\u09b5\u09b6\bb\1\2\u09b6\u09d6\3\2\2\2\u09b7"+
		"\u09b8\bb\1\2\u09b8\u09be\7\34\2\2\u09b9\u09ba\7\u0082\2\2\u09ba\u09bb"+
		"\5\u00aeX\2\u09bb\u09bc\7r\2\2\u09bc\u09bd\5\u00aeX\2\u09bd\u09bf\3\2"+
		"\2\2\u09be\u09b9\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0\u09be\3\2\2\2\u09c0"+
		"\u09c1\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c3\7\60\2\2\u09c3\u09c4\5"+
		"\u00aeX\2\u09c4\u09c5\7\61\2\2\u09c5\u09c6\bb\1\2\u09c6\u09d6\3\2\2\2"+
		"\u09c7\u09c8\7\u015d\2\2\u09c8\u09c9\7\u0231\2\2\u09c9\u09ca\5\u00aeX"+
		"\2\u09ca\u09cb\7\u0223\2\2\u09cb\u09cc\5\u00aeX\2\u09cc\u09cd\7\u0234"+
		"\2\2\u09cd\u09ce\bb\1\2\u09ce\u09d6\3\2\2\2\u09cf\u09d0\7\u0199\2\2\u09d0"+
		"\u09d1\7\u0231\2\2\u09d1\u09d2\5\u00aeX\2\u09d2\u09d3\7\u0234\2\2\u09d3"+
		"\u09d4\bb\1\2\u09d4\u09d6\3\2\2\2\u09d5\u095e\3\2\2\2\u09d5\u0968\3\2"+
		"\2\2\u09d5\u096e\3\2\2\2\u09d5\u0974\3\2\2\2\u09d5\u097c\3\2\2\2\u09d5"+
		"\u0989\3\2\2\2\u09d5\u0998\3\2\2\2\u09d5\u09a9\3\2\2\2\u09d5\u09b7\3\2"+
		"\2\2\u09d5\u09c7\3\2\2\2\u09d5\u09cf\3\2\2\2\u09d6\u00c3\3\2\2\2\u09d7"+
		"\u09d8\7\u0196\2\2\u09d8\u09d9\7\u0231\2\2\u09d9\u09da\5\u00aeX\2\u09da"+
		"\u09db\7\u0234\2\2\u09db\u09dc\bc\1\2\u09dc\u0a96\3\2\2\2\u09dd\u09de"+
		"\7\u0196\2\2\u09de\u09df\7\u0231\2\2\u09df\u09e0\5\u00aeX\2\u09e0\u09e1"+
		"\7\u0223\2\2\u09e1\u09e2\5\u00aeX\2\u09e2\u09e3\7\u0234\2\2\u09e3\u09e4"+
		"\bc\1\2\u09e4\u0a96\3\2\2\2\u09e5\u09e6\7\u016b\2\2\u09e6\u09e7\7\u0231"+
		"\2\2\u09e7\u09e8\7\u0234\2\2\u09e8\u0a96\bc\1\2\u09e9\u09ea\7\u016b\2"+
		"\2\u09ea\u09eb\7\u0231\2\2\u09eb\u09ec\5\u00aeX\2\u09ec\u09ed\7\u0234"+
		"\2\2\u09ed\u09ee\bc\1\2\u09ee\u0a96\3\2\2\2\u09ef\u09f0\7\u016b\2\2\u09f0"+
		"\u09f1\7\u0231\2\2\u09f1\u09f2\5\u00aeX\2\u09f2\u09f3\7\u0223\2\2\u09f3"+
		"\u09f4\5\u00aeX\2\u09f4\u09f5\7\u0234\2\2\u09f5\u09f6\bc\1\2\u09f6\u0a96"+
		"\3\2\2\2\u09f7\u09f8\7\u012d\2\2\u09f8\u09f9\7\u0231\2\2\u09f9\u09fa\5"+
		"\u00aeX\2\u09fa\u09fb\7\u0234\2\2\u09fb\u09fc\bc\1\2\u09fc\u0a96\3\2\2"+
		"\2\u09fd\u09fe\7\u0141\2\2\u09fe\u09ff\7\u0231\2\2\u09ff\u0a00\5\u00ae"+
		"X\2\u0a00\u0a01\7\u0234\2\2\u0a01\u0a02\bc\1\2\u0a02\u0a96\3\2\2\2\u0a03"+
		"\u0a04\7\u00e6\2\2\u0a04\u0a05\7\u0231\2\2\u0a05\u0a06\5\u00aeX\2\u0a06"+
		"\u0a07\7\u0234\2\2\u0a07\u0a08\bc\1\2\u0a08\u0a96\3\2\2\2\u0a09\u0a0a"+
		"\7\u00b4\2\2\u0a0a\u0a0b\7\u0231\2\2\u0a0b\u0a0c\5\u00aeX\2\u0a0c\u0a0d"+
		"\7\u0234\2\2\u0a0d\u0a0e\bc\1\2\u0a0e\u0a96\3\2\2\2\u0a0f\u0a10\7\u00cd"+
		"\2\2\u0a10\u0a11\7\u0231\2\2\u0a11\u0a12\5\u00aeX\2\u0a12\u0a13\7\u0234"+
		"\2\2\u0a13\u0a14\bc\1\2\u0a14\u0a96\3\2\2\2\u0a15\u0a16\7\u00e5\2\2\u0a16"+
		"\u0a17\7\u0231\2\2\u0a17\u0a18\5\u00aeX\2\u0a18\u0a19\7\u0234\2\2\u0a19"+
		"\u0a1a\bc\1\2\u0a1a\u0a96\3\2\2\2\u0a1b\u0a1c\7\u0107\2\2\u0a1c\u0a1d"+
		"\7\u0231\2\2\u0a1d\u0a1e\5\u00aeX\2\u0a1e\u0a1f\7\u0234\2\2\u0a1f\u0a20"+
		"\bc\1\2\u0a20\u0a96\3\2\2\2\u0a21\u0a22\7\u019d\2\2\u0a22\u0a23\7\u0231"+
		"\2\2\u0a23\u0a24\5\u00aeX\2\u0a24\u0a25\7\u0234\2\2\u0a25\u0a26\bc\1\2"+
		"\u0a26\u0a96\3\2\2\2\u0a27\u0a28\7\u01a4\2\2\u0a28\u0a29\7\u0231\2\2\u0a29"+
		"\u0a2a\5\u00aeX\2\u0a2a\u0a2b\7\u0223\2\2\u0a2b\u0a2c\5\u00aeX\2\u0a2c"+
		"\u0a2d\7\u0234\2\2\u0a2d\u0a2e\bc\1\2\u0a2e\u0a96\3\2\2\2\u0a2f\u0a30"+
		"\7\u01ac\2\2\u0a30\u0a31\7\u0231\2\2\u0a31\u0a32\5\u00aeX\2\u0a32\u0a33"+
		"\7\u0223\2\2\u0a33\u0a34\5\u00aeX\2\u0a34\u0a35\7\u0234\2\2\u0a35\u0a36"+
		"\bc\1\2\u0a36\u0a96\3\2\2\2\u0a37\u0a38\7\u0176\2\2\u0a38\u0a39\7\u0231"+
		"\2\2\u0a39\u0a3a\5\u00aeX\2\u0a3a\u0a3b\7\u0223\2\2\u0a3b\u0a3c\5\u00ae"+
		"X\2\u0a3c\u0a3d\7\u0234\2\2\u0a3d\u0a3e\bc\1\2\u0a3e\u0a96\3\2\2\2\u0a3f"+
		"\u0a40\7\u01ce\2\2\u0a40\u0a41\7\u0231\2\2\u0a41\u0a42\5\u00aeX\2\u0a42"+
		"\u0a43\7\u0223\2\2\u0a43\u0a44\5\u00aeX\2\u0a44\u0a45\7\u0234\2\2\u0a45"+
		"\u0a46\bc\1\2\u0a46\u0a96\3\2\2\2\u0a47\u0a48\7\u01bd\2\2\u0a48\u0a49"+
		"\7\u0231\2\2\u0a49\u0a4a\5\u00aeX\2\u0a4a\u0a4b\7\u0223\2\2\u0a4b\u0a4c"+
		"\5\u00aeX\2\u0a4c\u0a4d\7\u0234\2\2\u0a4d\u0a4e\bc\1\2\u0a4e\u0a96\3\2"+
		"\2\2\u0a4f\u0a52\7%\2\2\u0a50\u0a51\7\u0231\2\2\u0a51\u0a53\7\u0234\2"+
		"\2\u0a52\u0a50\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a54\3\2\2\2\u0a54\u0a96"+
		"\bc\1\2\u0a55\u0a58\7&\2\2\u0a56\u0a57\7\u0231\2\2\u0a57\u0a59\7\u0234"+
		"\2\2\u0a58\u0a56\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a"+
		"\u0a96\bc\1\2\u0a5b\u0a5c\7\u0174\2\2\u0a5c\u0a5d\7\u0231\2\2\u0a5d\u0a5e"+
		"\5\u00aeX\2\u0a5e\u0a5f\7\u0223\2\2\u0a5f\u0a60\5\u00aeX\2\u0a60\u0a61"+
		"\7\u0234\2\2\u0a61\u0a62\bc\1\2\u0a62\u0a96\3\2\2\2\u0a63\u0a64\7\u0174"+
		"\2\2\u0a64\u0a65\7\u0231\2\2\u0a65\u0a66\5\u00aeX\2\u0a66\u0a67\7\u0223"+
		"\2\2\u0a67\u0a68\5\u00aeX\2\u0a68\u0a69\7\u0223\2\2\u0a69\u0a6a\5\u00ae"+
		"X\2\u0a6a\u0a6b\7\u0234\2\2\u0a6b\u0a6c\bc\1\2\u0a6c\u0a96\3\2\2\2\u0a6d"+
		"\u0a6e\7\u019e\2\2\u0a6e\u0a6f\7\u0231\2\2\u0a6f\u0a70\5\u00aeX\2\u0a70"+
		"\u0a71\7\u0234\2\2\u0a71\u0a72\bc\1\2\u0a72\u0a96\3\2\2\2\u0a73\u0a74"+
		"\7\u0170\2\2\u0a74\u0a75\7\u0231\2\2\u0a75\u0a76\5\u00aeX\2\u0a76\u0a77"+
		"\7\u0223\2\2\u0a77\u0a78\5\u00aeX\2\u0a78\u0a79\7\u0234\2\2\u0a79\u0a7a"+
		"\bc\1\2\u0a7a\u0a96\3\2\2\2\u0a7b\u0a7c\7\u0172\2\2\u0a7c\u0a7d\7\u0231"+
		"\2\2\u0a7d\u0a7e\5\u00aeX\2\u0a7e\u0a7f\7\u0223\2\2\u0a7f\u0a80\5\u00ae"+
		"X\2\u0a80\u0a81\7\u0234\2\2\u0a81\u0a82\bc\1\2\u0a82\u0a96\3\2\2\2\u0a83"+
		"\u0a84\7\u019a\2\2\u0a84\u0a85\7\u0231\2\2\u0a85\u0a86\5\u00aeX\2\u0a86"+
		"\u0a87\7\u0223\2\2\u0a87\u0a88\5\u00aeX\2\u0a88\u0a89\7\u0234\2\2\u0a89"+
		"\u0a8a\bc\1\2\u0a8a\u0a96\3\2\2\2\u0a8b\u0a8c\7\u01d6\2\2\u0a8c\u0a8d"+
		"\7\u0231\2\2\u0a8d\u0a8e\5\u00aeX\2\u0a8e\u0a8f\7\u0223\2\2\u0a8f\u0a90"+
		"\5\u00aeX\2\u0a90\u0a91\7\u0234\2\2\u0a91\u0a92\bc\1\2\u0a92\u0a96\3\2"+
		"\2\2\u0a93\u0a94\7\u0201\2\2\u0a94\u0a96\bc\1\2\u0a95\u09d7\3\2\2\2\u0a95"+
		"\u09dd\3\2\2\2\u0a95\u09e5\3\2\2\2\u0a95\u09e9\3\2\2\2\u0a95\u09ef\3\2"+
		"\2\2\u0a95\u09f7\3\2\2\2\u0a95\u09fd\3\2\2\2\u0a95\u0a03\3\2\2\2\u0a95"+
		"\u0a09\3\2\2\2\u0a95\u0a0f\3\2\2\2\u0a95\u0a15\3\2\2\2\u0a95\u0a1b\3\2"+
		"\2\2\u0a95\u0a21\3\2\2\2\u0a95\u0a27\3\2\2\2\u0a95\u0a2f\3\2\2\2\u0a95"+
		"\u0a37\3\2\2\2\u0a95\u0a3f\3\2\2\2\u0a95\u0a47\3\2\2\2\u0a95\u0a4f\3\2"+
		"\2\2\u0a95\u0a55\3\2\2\2\u0a95\u0a5b\3\2\2\2\u0a95\u0a63\3\2\2\2\u0a95"+
		"\u0a6d\3\2\2\2\u0a95\u0a73\3\2\2\2\u0a95\u0a7b\3\2\2\2\u0a95\u0a83\3\2"+
		"\2\2\u0a95\u0a8b\3\2\2\2\u0a95\u0a93\3\2\2\2\u0a96\u00c5\3\2\2\2\u0a97"+
		"\u0a98\7\35\2\2\u0a98\u0a99\7\u0231\2\2\u0a99\u0a9a\5\u00aeX\2\u0a9a\u0a9b"+
		"\7\24\2\2\u0a9b\u0a9d\5\b\5\2\u0a9c\u0a9e\5\f\7\2\u0a9d\u0a9c\3\2\2\2"+
		"\u0a9d\u0a9e\3\2\2\2\u0a9e\u0a9f\3\2\2\2\u0a9f\u0aa0\7\u0234\2\2\u0aa0"+
		"\u0aa1\bd\1\2\u0aa1\u0aa9\3\2\2\2\u0aa2\u0aa3\7\30\2\2\u0aa3\u0aa4\7\u0231"+
		"\2\2\u0aa4\u0aa5\5\u00aeX\2\u0aa5\u0aa6\7\u0234\2\2\u0aa6\u0aa7\bd\1\2"+
		"\u0aa7\u0aa9\3\2\2\2\u0aa8\u0a97\3\2\2\2\u0aa8\u0aa2\3\2\2\2\u0aa9\u00c7"+
		"\3\2\2\2\u0aaa\u0aab\7\u0164\2\2\u0aab\u0aac\7\u0231\2\2\u0aac\u0aad\5"+
		"\u00aeX\2\u0aad\u0aae\7\u0234\2\2\u0aae\u0aaf\be\1\2\u0aaf\u0ae5\3\2\2"+
		"\2\u0ab0\u0ab1\be\1\2\u0ab1\u0ab2\7\u0164\2\2\u0ab2\u0ab3\7\u0231\2\2"+
		"\u0ab3\u0ab4\7-\2\2\u0ab4\u0ab9\5\u00aeX\2\u0ab5\u0ab6\7\u0223\2\2\u0ab6"+
		"\u0ab8\5\u00aeX\2\u0ab7\u0ab5\3\2\2\2\u0ab8\u0abb\3\2\2\2\u0ab9\u0ab7"+
		"\3\2\2\2\u0ab9\u0aba\3\2\2\2\u0aba\u0abc\3\2\2\2\u0abb\u0ab9\3\2\2\2\u0abc"+
		"\u0abd\7\u0234\2\2\u0abd\u0abe\be\1\2\u0abe\u0ae5\3\2\2\2\u0abf\u0ac0"+
		"\7\u0164\2\2\u0ac0\u0ac1\7\u0231\2\2\u0ac1\u0ac2\7\u022f\2\2\u0ac2\u0ac3"+
		"\7\u0234\2\2\u0ac3\u0ae5\be\1\2\u0ac4\u0ac5\7\u01c2\2\2\u0ac5\u0ac6\7"+
		"\u0231\2\2\u0ac6\u0ac7\5\u00aeX\2\u0ac7\u0ac8\7\u0234\2\2\u0ac8\u0ac9"+
		"\be\1\2\u0ac9\u0ae5\3\2\2\2\u0aca\u0acb\7\u01c2\2\2\u0acb\u0acc\7\u0231"+
		"\2\2\u0acc\u0acd\7-\2\2\u0acd\u0ace\5\u00aeX\2\u0ace\u0acf\7\u0234\2\2"+
		"\u0acf\u0ad0\be\1\2\u0ad0\u0ae5\3\2\2\2\u0ad1\u0ad2\7\u01ba\2\2\u0ad2"+
		"\u0ad3\7\u0231\2\2\u0ad3\u0ad4\5\u00aeX\2\u0ad4\u0ad5\7\u0234\2\2\u0ad5"+
		"\u0ad6\be\1\2\u0ad6\u0ae5\3\2\2\2\u0ad7\u0ad8\7\u01ba\2\2\u0ad8\u0ad9"+
		"\7\u0231\2\2\u0ad9\u0ada\7-\2\2\u0ada\u0adb\5\u00aeX\2\u0adb\u0adc\7\u0234"+
		"\2\2\u0adc\u0add\be\1\2\u0add\u0ae5\3\2\2\2\u0ade\u0adf\t\22\2\2\u0adf"+
		"\u0ae0\7\u0231\2\2\u0ae0\u0ae1\5\u00aeX\2\u0ae1\u0ae2\7\u0234\2\2\u0ae2"+
		"\u0ae3\be\1\2\u0ae3\u0ae5\3\2\2\2\u0ae4\u0aaa\3\2\2\2\u0ae4\u0ab0\3\2"+
		"\2\2\u0ae4\u0abf\3\2\2\2\u0ae4\u0ac4\3\2\2\2\u0ae4\u0aca\3\2\2\2\u0ae4"+
		"\u0ad1\3\2\2\2\u0ae4\u0ad7\3\2\2\2\u0ae4\u0ade\3\2\2\2\u0ae5\u00c9\3\2"+
		"\2\2\u0ae6\u0ae7\5\u00c8e\2\u0ae7\u0ae8\bf\1\2\u0ae8\u0b2e\3\2\2\2\u0ae9"+
		"\u0aea\t\23\2\2\u0aea\u0aeb\7\u0231\2\2\u0aeb\u0aec\5\u00aeX\2\u0aec\u0aed"+
		"\7\u0234\2\2\u0aed\u0aee\bf\1\2\u0aee\u0b2e\3\2\2\2\u0aef\u0af0\t\24\2"+
		"\2\u0af0\u0af1\7\u0231\2\2\u0af1\u0af2\5\u00aeX\2\u0af2\u0af3\7\u0223"+
		"\2\2\u0af3\u0af4\5\u00aeX\2\u0af4\u0af5\7\u0234\2\2\u0af5\u0af6\bf\1\2"+
		"\u0af6\u0b2e\3\2\2\2\u0af7\u0af8\7\u01e6\2\2\u0af8\u0af9\7\u0231\2\2\u0af9"+
		"\u0afa\5\u00aeX\2\u0afa\u0afb\7\u0223\2\2\u0afb\u0afc\5\u00aeX\2\u0afc"+
		"\u0afd\7\u0234\2\2\u0afd\u0afe\bf\1\2\u0afe\u0b2e\3\2\2\2\u0aff\u0b00"+
		"\7\u0198\2\2\u0b00\u0b01\7\u0231\2\2\u0b01\u0b02\5\u00aeX\2\u0b02\u0b03"+
		"\7\u0223\2\2\u0b03\u0b04\5\u00aeX\2\u0b04\u0b05\7\u0234\2\2\u0b05\u0b06"+
		"\bf\1\2\u0b06\u0b2e\3\2\2\2\u0b07\u0b08\7\u0198\2\2\u0b08\u0b09\7\u0231"+
		"\2\2\u0b09\u0b0a\5\u00aeX\2\u0b0a\u0b0b\7\u0223\2\2\u0b0b\u0b0c\5\u00ae"+
		"X\2\u0b0c\u0b0d\7\u0223\2\2\u0b0d\u0b0e\5\u00aeX\2\u0b0e\u0b0f\7\u0234"+
		"\2\2\u0b0f\u0b10\bf\1\2\u0b10\u0b2e\3\2\2\2\u0b11\u0b12\t\25\2\2\u0b12"+
		"\u0b13\7\u0231\2\2\u0b13\u0b14\5\u00aeX\2\u0b14\u0b15\7\u0223\2\2\u0b15"+
		"\u0b16\5\u00aeX\2\u0b16\u0b17\7\u0234\2\2\u0b17\u0b18\bf\1\2\u0b18\u0b2e"+
		"\3\2\2\2\u0b19\u0b1a\7\u0171\2\2\u0b1a\u0b1b\7\u0231\2\2\u0b1b\u0b1c\5"+
		"\u00aeX\2\u0b1c\u0b1d\7\u0223\2\2\u0b1d\u0b1e\5\u00aeX\2\u0b1e\u0b1f\7"+
		"\u0234\2\2\u0b1f\u0b20\bf\1\2\u0b20\u0b2e\3\2\2\2\u0b21\u0b22\t\26\2\2"+
		"\u0b22\u0b23\7\u0231\2\2\u0b23\u0b24\5\u00aeX\2\u0b24\u0b25\7\u0234\2"+
		"\2\u0b25\u0b26\bf\1\2\u0b26\u0b2e\3\2\2\2\u0b27\u0b28\7\u017c\2\2\u0b28"+
		"\u0b29\7\u0231\2\2\u0b29\u0b2a\5\u00aeX\2\u0b2a\u0b2b\7\u0234\2\2\u0b2b"+
		"\u0b2c\bf\1\2\u0b2c\u0b2e\3\2\2\2\u0b2d\u0ae6\3\2\2\2\u0b2d\u0ae9\3\2"+
		"\2\2\u0b2d\u0aef\3\2\2\2\u0b2d\u0af7\3\2\2\2\u0b2d\u0aff\3\2\2\2\u0b2d"+
		"\u0b07\3\2\2\2\u0b2d\u0b11\3\2\2\2\u0b2d\u0b19\3\2\2\2\u0b2d\u0b21\3\2"+
		"\2\2\u0b2d\u0b27\3\2\2\2\u0b2e\u00cb\3\2\2\2\u0b2f\u0b30\7\u01c0\2\2\u0b30"+
		"\u0b31\7\u0231\2\2\u0b31\u0b32\5\u00aeX\2\u0b32\u0b33\7\u0234\2\2\u0b33"+
		"\u0b34\bg\1\2\u0b34\u0b42\3\2\2\2\u0b35\u0b36\7\u01da\2\2\u0b36\u0b37"+
		"\7\u0231\2\2\u0b37\u0b38\5\u00aeX\2\u0b38\u0b39\7\u0234\2\2\u0b39\u0b3a"+
		"\bg\1\2\u0b3a\u0b42\3\2\2\2\u0b3b\u0b3c\7\u01c8\2\2\u0b3c\u0b3d\7\u0231"+
		"\2\2\u0b3d\u0b3e\5\u00aeX\2\u0b3e\u0b3f\7\u0234\2\2\u0b3f\u0b40\bg\1\2"+
		"\u0b40\u0b42\3\2\2\2\u0b41\u0b2f\3\2\2\2\u0b41\u0b35\3\2\2\2\u0b41\u0b3b"+
		"\3\2\2\2\u0b42\u00cd\3\2\2\2\u0b43\u0b44\7\u01cb\2\2\u0b44\u0b45\7\u0231"+
		"\2\2\u0b45\u0b46\5\u00aeX\2\u0b46\u0b47\7\u0234\2\2\u0b47\u0b48\bh\1\2"+
		"\u0b48\u0c16\3\2\2\2\u0b49\u0b4a\7\u01cb\2\2\u0b4a\u0b4b\7\u0231\2\2\u0b4b"+
		"\u0b4c\5\u00aeX\2\u0b4c\u0b4d\7\u0223\2\2\u0b4d\u0b4e\5\u00aeX\2\u0b4e"+
		"\u0b4f\7\u0234\2\2\u0b4f\u0b50\bh\1\2\u0b50\u0c16\3\2\2\2\u0b51\u0b52"+
		"\7\u0093\2\2\u0b52\u0b53\7\u0231\2\2\u0b53\u0b54\5\u00aeX\2\u0b54\u0b55"+
		"\7\u0234\2\2\u0b55\u0b56\bh\1\2\u0b56\u0c16\3\2\2\2\u0b57\u0b58\t\27\2"+
		"\2\u0b58\u0b59\7\u0231\2\2\u0b59\u0b5a\5\u00aeX\2\u0b5a\u0b5b\7\u0234"+
		"\2\2\u0b5b\u0b5c\bh\1\2\u0b5c\u0c16\3\2\2\2\u0b5d\u0b5e\7\u01fc\2\2\u0b5e"+
		"\u0b5f\7\u0231\2\2\u0b5f\u0b60\7\u0234\2\2\u0b60\u0c16\bh\1\2\u0b61\u0b62"+
		"\7\u01fc\2\2\u0b62\u0b63\7\u0231\2\2\u0b63\u0b64\5\u00aeX\2\u0b64\u0b65"+
		"\7\u0234\2\2\u0b65\u0b66\bh\1\2\u0b66\u0c16\3\2\2\2\u0b67\u0b68\7\u017a"+
		"\2\2\u0b68\u0b69\7\u0231\2\2\u0b69\u0b6a\5\u00aeX\2\u0b6a\u0b6b\7\u0234"+
		"\2\2\u0b6b\u0b6c\bh\1\2\u0b6c\u0c16\3\2\2\2\u0b6d\u0b6e\7\u0178\2\2\u0b6e"+
		"\u0b6f\7\u0231\2\2\u0b6f\u0b70\5\u00aeX\2\u0b70\u0b71\7\u0234\2\2\u0b71"+
		"\u0b72\bh\1\2\u0b72\u0c16\3\2\2\2\u0b73\u0b74\7\u01fe\2\2\u0b74\u0b75"+
		"\7\u0231\2\2\u0b75\u0b76\5\u00aeX\2\u0b76\u0b77\7\u0234\2\2\u0b77\u0b78"+
		"\bh\1\2\u0b78\u0c16\3\2\2\2\u0b79\u0b7a\7\u01fd\2\2\u0b7a\u0b7b\7\u0231"+
		"\2\2\u0b7b\u0b7c\5\u00aeX\2\u0b7c\u0b7d\7\u0234\2\2\u0b7d\u0b7e\bh\1\2"+
		"\u0b7e\u0c16\3\2\2\2\u0b7f\u0b80\7\u01a5\2\2\u0b80\u0b81\7\u0231\2\2\u0b81"+
		"\u0b82\5\u00aeX\2\u0b82\u0b83\7\u0223\2\2\u0b83\u0b84\5\u00aeX\2\u0b84"+
		"\u0b85\7\u0234\2\2\u0b85\u0b86\bh\1\2\u0b86\u0c16\3\2\2\2\u0b87\u0b88"+
		"\t\30\2\2\u0b88\u0b89\7\u0231\2\2\u0b89\u0b8a\5\u00aeX\2\u0b8a\u0b8b\7"+
		"\u0223\2\2\u0b8b\u0b8c\5\u00aeX\2\u0b8c\u0b8d\7\u0234\2\2\u0b8d\u0b8e"+
		"\bh\1\2\u0b8e\u0c16\3\2\2\2\u0b8f\u0b90\7\u0169\2\2\u0b90\u0b91\7\u0231"+
		"\2\2\u0b91\u0b92\5\u00aeX\2\u0b92\u0b93\7\u0234\2\2\u0b93\u0b94\bh\1\2"+
		"\u0b94\u0c16\3\2\2\2\u0b95\u0b96\7\u01f0\2\2\u0b96\u0b97\7\u0231\2\2\u0b97"+
		"\u0b98\5\u00aeX\2\u0b98\u0b99\7\u0234\2\2\u0b99\u0b9a\bh\1\2\u0b9a\u0c16"+
		"\3\2\2\2\u0b9b\u0b9c\7\u01d1\2\2\u0b9c\u0b9d\7\u0231\2\2\u0b9d\u0b9e\5"+
		"\u00aeX\2\u0b9e\u0b9f\7\u0234\2\2\u0b9f\u0ba0\bh\1\2\u0ba0\u0c16\3\2\2"+
		"\2\u0ba1\u0ba2\7\u0152\2\2\u0ba2\u0ba3\7\u0231\2\2\u0ba3\u0ba4\5\u00ae"+
		"X\2\u0ba4\u0ba5\7\u0234\2\2\u0ba5\u0ba6\bh\1\2\u0ba6\u0c16\3\2\2\2\u0ba7"+
		"\u0ba8\7\u0166\2\2\u0ba8\u0ba9\7\u0231\2\2\u0ba9\u0baa\5\u00aeX\2\u0baa"+
		"\u0bab\7\u0223\2\2\u0bab\u0bac\5\u00aeX\2\u0bac\u0bad\7\u0223\2\2\u0bad"+
		"\u0bae\5\u00aeX\2\u0bae\u0baf\7\u0234\2\2\u0baf\u0bb0\bh\1\2\u0bb0\u0c16"+
		"\3\2\2\2\u0bb1\u0bb2\7\u01bf\2\2\u0bb2\u0bb3\7\u0231\2\2\u0bb3\u0bb4\5"+
		"\u00aeX\2\u0bb4\u0bb5\7\u0234\2\2\u0bb5\u0bb6\bh\1\2\u0bb6\u0c16\3\2\2"+
		"\2\u0bb7\u0bb8\7\u01dc\2\2\u0bb8\u0bb9\7\u0231\2\2\u0bb9\u0bba\5\u00ae"+
		"X\2\u0bba\u0bbb\7\u0223\2\2\u0bbb\u0bbc\5\u00aeX\2\u0bbc\u0bbd\7\u0234"+
		"\2\2\u0bbd\u0bbe\bh\1\2\u0bbe\u0c16\3\2\2\2\u0bbf\u0bc0\7\u0162\2\2\u0bc0"+
		"\u0bc1\7\u0231\2\2\u0bc1\u0bc2\5\u00aeX\2\u0bc2\u0bc3\7\u0234\2\2\u0bc3"+
		"\u0bc4\bh\1\2\u0bc4\u0c16\3\2\2\2\u0bc5\u0bc6\7\u015c\2\2\u0bc6\u0bc7"+
		"\7\u0231\2\2\u0bc7\u0bc8\5\u00aeX\2\u0bc8\u0bc9\7\u0234\2\2\u0bc9\u0bca"+
		"\bh\1\2\u0bca\u0c16\3\2\2\2\u0bcb\u0bcc\7\u0158\2\2\u0bcc\u0bcd\7\u0231"+
		"\2\2\u0bcd\u0bce\5\u00aeX\2\u0bce\u0bcf\7\u0234\2\2\u0bcf\u0bd0\bh\1\2"+
		"\u0bd0\u0c16\3\2\2\2\u0bd1\u0bd2\7\u019c\2\2\u0bd2\u0bd3\7\u0231\2\2\u0bd3"+
		"\u0bd4\5\u00aeX\2\u0bd4\u0bd5\7\u0234\2\2\u0bd5\u0bd6\bh\1\2\u0bd6\u0c16"+
		"\3\2\2\2\u0bd7\u0bd8\7\u01f1\2\2\u0bd8\u0bd9\7\u0231\2\2\u0bd9\u0bda\5"+
		"\u00aeX\2\u0bda\u0bdb\7\u0234\2\2\u0bdb\u0bdc\bh\1\2\u0bdc\u0c16\3\2\2"+
		"\2\u0bdd\u0bde\7\u01d8\2\2\u0bde\u0bdf\7\u0231\2\2\u0bdf\u0be0\5\u00ae"+
		"X\2\u0be0\u0be1\7\u0234\2\2\u0be1\u0be2\bh\1\2\u0be2\u0c16\3\2\2\2\u0be3"+
		"\u0be4\7\u018e\2\2\u0be4\u0be5\7\u0231\2\2\u0be5\u0be6\5\u00aeX\2\u0be6"+
		"\u0be7\7\u0234\2\2\u0be7\u0be8\bh\1\2\u0be8\u0c16\3\2\2\2\u0be9\u0bea"+
		"\7\u018f\2\2\u0bea\u0beb\7\u0231\2\2\u0beb\u0bec\5\u00aeX\2\u0bec\u0bed"+
		"\7\u0234\2\2\u0bed\u0bee\bh\1\2\u0bee\u0c16\3\2\2\2\u0bef\u0bf0\7\u0195"+
		"\2\2\u0bf0\u0bf1\7\u0231\2\2\u0bf1\u0bf2\5\u00aeX\2\u0bf2\u0bf3\7\u0234"+
		"\2\2\u0bf3\u0bf4\bh\1\2\u0bf4\u0c16\3\2\2\2\u0bf5\u0bf6\7\u01ab\2\2\u0bf6"+
		"\u0bf7\7\u0231\2\2\u0bf7\u0bf8\5\u00aeX\2\u0bf8\u0bf9\7\u0234\2\2\u0bf9"+
		"\u0bfa\bh\1\2\u0bfa\u0c16\3\2\2\2\u0bfb\u0bfc\7\u0167\2\2\u0bfc\u0bfd"+
		"\7\u0231\2\2\u0bfd\u0bfe\5\u00aeX\2\u0bfe\u0bff\7\u0234\2\2\u0bff\u0c00"+
		"\bh\1\2\u0c00\u0c16\3\2\2\2\u0c01\u0c02\7\u01c1\2\2\u0c02\u0c03\7\u0231"+
		"\2\2\u0c03\u0c04\7\u0234\2\2\u0c04\u0c16\bh\1\2\u0c05\u0c06\7\u0153\2"+
		"\2\u0c06\u0c07\7\u0231\2\2\u0c07\u0c08\7\u0234\2\2\u0c08\u0c16\bh\1\2"+
		"\u0c09\u0c0a\7\u01ea\2\2\u0c0a\u0c0b\7\u0231\2\2\u0c0b\u0c0c\5\u00aeX"+
		"\2\u0c0c\u0c0d\7\u0234\2\2\u0c0d\u0c0e\bh\1\2\u0c0e\u0c16\3\2\2\2\u0c0f"+
		"\u0c10\7\u018b\2\2\u0c10\u0c11\7\u0231\2\2\u0c11\u0c12\5\u00aeX\2\u0c12"+
		"\u0c13\7\u0234\2\2\u0c13\u0c14\bh\1\2\u0c14\u0c16\3\2\2\2\u0c15\u0b43"+
		"\3\2\2\2\u0c15\u0b49\3\2\2\2\u0c15\u0b51\3\2\2\2\u0c15\u0b57\3\2\2\2\u0c15"+
		"\u0b5d\3\2\2\2\u0c15\u0b61\3\2\2\2\u0c15\u0b67\3\2\2\2\u0c15\u0b6d\3\2"+
		"\2\2\u0c15\u0b73\3\2\2\2\u0c15\u0b79\3\2\2\2\u0c15\u0b7f\3\2\2\2\u0c15"+
		"\u0b87\3\2\2\2\u0c15\u0b8f\3\2\2\2\u0c15\u0b95\3\2\2\2\u0c15\u0b9b\3\2"+
		"\2\2\u0c15\u0ba1\3\2\2\2\u0c15\u0ba7\3\2\2\2\u0c15\u0bb1\3\2\2\2\u0c15"+
		"\u0bb7\3\2\2\2\u0c15\u0bbf\3\2\2\2\u0c15\u0bc5\3\2\2\2\u0c15\u0bcb\3\2"+
		"\2\2\u0c15\u0bd1\3\2\2\2\u0c15\u0bd7\3\2\2\2\u0c15\u0bdd\3\2\2\2\u0c15"+
		"\u0be3\3\2\2\2\u0c15\u0be9\3\2\2\2\u0c15\u0bef\3\2\2\2\u0c15\u0bf5\3\2"+
		"\2\2\u0c15\u0bfb\3\2\2\2\u0c15\u0c01\3\2\2\2\u0c15\u0c05\3\2\2\2\u0c15"+
		"\u0c09\3\2\2\2\u0c15\u0c0f\3\2\2\2\u0c16\u00cf\3\2\2\2\u0c17\u0c18\5\u00da"+
		"n\2\u0c18\u0c19\7\4\2\2\u0c19\u0c1a\5\u00dan\2\u0c1a\u0c1b\5\u00acW\2"+
		"\u0c1b\u0c1c\bi\1\2\u0c1c\u0c22\3\2\2\2\u0c1d\u0c1e\5\u00dan\2\u0c1e\u0c1f"+
		"\5\u00acW\2\u0c1f\u0c20\bi\1\2\u0c20\u0c22\3\2\2\2\u0c21\u0c17\3\2\2\2"+
		"\u0c21\u0c1d\3\2\2\2\u0c22\u00d1\3\2\2\2\u0c23\u0c24\7\u023a\2\2\u0c24"+
		"\u0c34\bj\1\2\u0c25\u0c26\7\u0239\2\2\u0c26\u0c34\bj\1\2\u0c27\u0c28\7"+
		"\u0238\2\2\u0c28\u0c34\bj\1\2\u0c29\u0c2a\7\17\2\2\u0c2a\u0c34\bj\1\2"+
		"\u0c2b\u0c2c\7\16\2\2\u0c2c\u0c34\bj\1\2\u0c2d\u0c2e\5\u00dep\2\u0c2e"+
		"\u0c2f\bj\1\2\u0c2f\u0c34\3\2\2\2\u0c30\u0c31\5\u00e0q\2\u0c31\u0c32\b"+
		"j\1\2\u0c32\u0c34\3\2\2\2\u0c33\u0c23\3\2\2\2\u0c33\u0c25\3\2\2\2\u0c33"+
		"\u0c27\3\2\2\2\u0c33\u0c29\3\2\2\2\u0c33\u0c2b\3\2\2\2\u0c33\u0c2d\3\2"+
		"\2\2\u0c33\u0c30\3\2\2\2\u0c34\u00d3\3\2\2\2\u0c35\u0c36\5\u00dco\2\u0c36"+
		"\u0c37\7\4\2\2\u0c37\u0c38\3\2\2\2\u0c38\u0c39\5\u00dco\2\u0c39\u0c3a"+
		"\7\4\2\2\u0c3a\u0c3b\3\2\2\2\u0c3b\u0c3c\5\u00dco\2\u0c3c\u0c3d\bk\1\2"+
		"\u0c3d\u0c48\3\2\2\2\u0c3e\u0c3f\5\u00dco\2\u0c3f\u0c40\7\4\2\2\u0c40"+
		"\u0c41\3\2\2\2\u0c41\u0c42\5\u00dco\2\u0c42\u0c43\bk\1\2\u0c43\u0c48\3"+
		"\2\2\2\u0c44\u0c45\5\u00dco\2\u0c45\u0c46\bk\1\2\u0c46\u0c48\3\2\2\2\u0c47"+
		"\u0c35\3\2\2\2\u0c47\u0c3e\3\2\2\2\u0c47\u0c44\3\2\2\2\u0c48\u00d5\3\2"+
		"\2\2\u0c49\u0c4a\5\u00d8m\2\u0c4a\u0c4b\7\4\2\2\u0c4b\u0c4c\5\u00d8m\2"+
		"\u0c4c\u0c4d\bl\1\2\u0c4d\u0c52\3\2\2\2\u0c4e\u0c4f\5\u00d8m\2\u0c4f\u0c50"+
		"\bl\1\2\u0c50\u0c52\3\2\2\2\u0c51\u0c49\3\2\2\2\u0c51\u0c4e\3\2\2\2\u0c52"+
		"\u00d7\3\2\2\2\u0c53\u0c54\5\u00dan\2\u0c54\u0c55\bm\1\2\u0c55\u0c61\3"+
		"\2\2\2\u0c56\u0c5a\bm\1\2\u0c57\u0c59\5\u00dan\2\u0c58\u0c57\3\2\2\2\u0c59"+
		"\u0c5c\3\2\2\2\u0c5a\u0c58\3\2\2\2\u0c5a\u0c5b\3\2\2\2\u0c5b\u0c5d\3\2"+
		"\2\2\u0c5c\u0c5a\3\2\2\2\u0c5d\u0c5e\5 \21\2\u0c5e\u0c5f\bm\1\2\u0c5f"+
		"\u0c61\3\2\2\2\u0c60\u0c53\3\2\2\2\u0c60\u0c56\3\2\2\2\u0c61\u00d9\3\2"+
		"\2\2\u0c62\u0c63\5\u00dco\2\u0c63\u0c64\bn\1\2\u0c64\u0c69\3\2\2\2\u0c65"+
		"\u0c66\5 \21\2\u0c66\u0c67\bn\1\2\u0c67\u0c69\3\2\2\2\u0c68\u0c62\3\2"+
		"\2\2\u0c68\u0c65\3\2\2\2\u0c69\u00db\3\2\2\2\u0c6a\u0c6b\7\u0237\2\2\u0c6b"+
		"\u0c70\bo\1\2\u0c6c\u0c6d\5\u00eex\2\u0c6d\u0c6e\bo\1\2\u0c6e\u0c70\3"+
		"\2\2\2\u0c6f\u0c6a\3\2\2\2\u0c6f\u0c6c\3\2\2\2\u0c70\u00dd\3\2\2\2\u0c71"+
		"\u0c72\7)\2\2\u0c72\u0c73\7\u023a\2\2\u0c73\u0c74\bp\1\2\u0c74\u00df\3"+
		"\2\2\2\u0c75\u0c76\7s\2\2\u0c76\u0c77\7\u023a\2\2\u0c77\u0c78\bq\1\2\u0c78"+
		"\u00e1\3\2\2\2\u0c79\u0c7a\7K\2\2\u0c7a\u0c7f\br\1\2\u0c7b\u0c7c\7K\2"+
		"\2\u0c7c\u0c7d\7V\2\2\u0c7d\u0c7f\br\1\2\u0c7e\u0c79\3\2\2\2\u0c7e\u0c7b"+
		"\3\2\2\2\u0c7f\u00e3\3\2\2\2\u0c80\u0c81\7P\2\2\u0c81\u0c8a\bs\1\2\u0c82"+
		"\u0c83\7V\2\2\u0c83\u0c84\7P\2\2\u0c84\u0c8a\bs\1\2\u0c85\u0c86\7\u0089"+
		"\2\2\u0c86\u0c8a\bs\1\2\u0c87\u0c88\7\u0088\2\2\u0c88\u0c8a\bs\1\2\u0c89"+
		"\u0c80\3\2\2\2\u0c89\u0c82\3\2\2\2\u0c89\u0c85\3\2\2\2\u0c89\u0c87\3\2"+
		"\2\2\u0c8a\u00e5\3\2\2\2\u0c8b\u0c8c\7D\2\2\u0c8c\u0c91\bt\1\2\u0c8d\u0c8e"+
		"\7V\2\2\u0c8e\u0c8f\7D\2\2\u0c8f\u0c91\bt\1\2\u0c90\u0c8b\3\2\2\2\u0c90"+
		"\u0c8d\3\2\2\2\u0c91\u00e7\3\2\2\2\u0c92\u0c93\7\63\2\2\u0c93\u0c98\b"+
		"u\1\2\u0c94\u0c95\7V\2\2\u0c95\u0c96\7\63\2\2\u0c96\u0c98\bu\1\2\u0c97"+
		"\u0c92\3\2\2\2\u0c97\u0c94\3\2\2\2\u0c98\u00e9\3\2\2\2\u0c99\u0c9a\t\31"+
		"\2\2\u0c9a\u00eb\3\2\2\2\u0c9b\u0c9c\7\20\2\2\u0c9c\u0db0\bw\1\2\u0c9d"+
		"\u0c9e\7\21\2\2\u0c9e\u0db0\bw\1\2\u0c9f\u0ca0\7\22\2\2\u0ca0\u0db0\b"+
		"w\1\2\u0ca1\u0ca2\7\23\2\2\u0ca2\u0db0\bw\1\2\u0ca3\u0ca4\7\24\2\2\u0ca4"+
		"\u0db0\bw\1\2\u0ca5\u0ca6\7\25\2\2\u0ca6\u0db0\bw\1\2\u0ca7\u0ca8\7\26"+
		"\2\2\u0ca8\u0db0\bw\1\2\u0ca9\u0caa\7\27\2\2\u0caa\u0db0\bw\1\2\u0cab"+
		"\u0cac\7\30\2\2\u0cac\u0db0\bw\1\2\u0cad\u0cae\7\31\2\2\u0cae\u0db0\b"+
		"w\1\2\u0caf\u0cb0\7\32\2\2\u0cb0\u0db0\bw\1\2\u0cb1\u0cb2\7\33\2\2\u0cb2"+
		"\u0db0\bw\1\2\u0cb3\u0cb4\7\34\2\2\u0cb4\u0db0\bw\1\2\u0cb5\u0cb6\7\35"+
		"\2\2\u0cb6\u0db0\bw\1\2\u0cb7\u0cb8\7\36\2\2\u0cb8\u0db0\bw\1\2\u0cb9"+
		"\u0cba\7\37\2\2\u0cba\u0db0\bw\1\2\u0cbb\u0cbc\7 \2\2\u0cbc\u0db0\bw\1"+
		"\2\u0cbd\u0cbe\7!\2\2\u0cbe\u0db0\bw\1\2\u0cbf\u0cc0\7\"\2\2\u0cc0\u0db0"+
		"\bw\1\2\u0cc1\u0cc2\7#\2\2\u0cc2\u0db0\bw\1\2\u0cc3\u0cc4\7$\2\2\u0cc4"+
		"\u0db0\bw\1\2\u0cc5\u0cc6\7%\2\2\u0cc6\u0db0\bw\1\2\u0cc7\u0cc8\7&\2\2"+
		"\u0cc8\u0db0\bw\1\2\u0cc9\u0cca\7\'\2\2\u0cca\u0db0\bw\1\2\u0ccb\u0ccc"+
		"\7(\2\2\u0ccc\u0db0\bw\1\2\u0ccd\u0cce\7)\2\2\u0cce\u0db0\bw\1\2\u0ccf"+
		"\u0cd0\7*\2\2\u0cd0\u0db0\bw\1\2\u0cd1\u0cd2\7+\2\2\u0cd2\u0db0\bw\1\2"+
		"\u0cd3\u0cd4\7,\2\2\u0cd4\u0db0\bw\1\2\u0cd5\u0cd6\7-\2\2\u0cd6\u0db0"+
		"\bw\1\2\u0cd7\u0cd8\7.\2\2\u0cd8\u0db0\bw\1\2\u0cd9\u0cda\7/\2\2\u0cda"+
		"\u0db0\bw\1\2\u0cdb\u0cdc\7\60\2\2\u0cdc\u0db0\bw\1\2\u0cdd\u0cde\7\61"+
		"\2\2\u0cde\u0db0\bw\1\2\u0cdf\u0ce0\7\62\2\2\u0ce0\u0db0\bw\1\2\u0ce1"+
		"\u0ce2\7\63\2\2\u0ce2\u0db0\bw\1\2\u0ce3\u0ce4\7\64\2\2\u0ce4\u0db0\b"+
		"w\1\2\u0ce5\u0ce6\7\65\2\2\u0ce6\u0db0\bw\1\2\u0ce7\u0ce8\7\66\2\2\u0ce8"+
		"\u0db0\bw\1\2\u0ce9\u0cea\7\67\2\2\u0cea\u0db0\bw\1\2\u0ceb\u0cec\78\2"+
		"\2\u0cec\u0db0\bw\1\2\u0ced\u0cee\79\2\2\u0cee\u0db0\bw\1\2\u0cef\u0cf0"+
		"\7:\2\2\u0cf0\u0db0\bw\1\2\u0cf1\u0cf2\7;\2\2\u0cf2\u0db0\bw\1\2\u0cf3"+
		"\u0cf4\7<\2\2\u0cf4\u0db0\bw\1\2\u0cf5\u0cf6\7=\2\2\u0cf6\u0db0\bw\1\2"+
		"\u0cf7\u0cf8\7>\2\2\u0cf8\u0db0\bw\1\2\u0cf9\u0cfa\7?\2\2\u0cfa\u0db0"+
		"\bw\1\2\u0cfb\u0cfc\7@\2\2\u0cfc\u0db0\bw\1\2\u0cfd\u0cfe\7A\2\2\u0cfe"+
		"\u0db0\bw\1\2\u0cff\u0d00\7B\2\2\u0d00\u0db0\bw\1\2\u0d01\u0d02\7C\2\2"+
		"\u0d02\u0db0\bw\1\2\u0d03\u0d04\7D\2\2\u0d04\u0db0\bw\1\2\u0d05\u0d06"+
		"\7E\2\2\u0d06\u0db0\bw\1\2\u0d07\u0d08\7F\2\2\u0d08\u0db0\bw\1\2\u0d09"+
		"\u0d0a\7G\2\2\u0d0a\u0db0\bw\1\2\u0d0b\u0d0c\7H\2\2\u0d0c\u0db0\bw\1\2"+
		"\u0d0d\u0d0e\7I\2\2\u0d0e\u0db0\bw\1\2\u0d0f\u0d10\7J\2\2\u0d10\u0db0"+
		"\bw\1\2\u0d11\u0d12\7K\2\2\u0d12\u0db0\bw\1\2\u0d13\u0d14\7L\2\2\u0d14"+
		"\u0db0\bw\1\2\u0d15\u0d16\7M\2\2\u0d16\u0db0\bw\1\2\u0d17\u0d18\7N\2\2"+
		"\u0d18\u0db0\bw\1\2\u0d19\u0d1a\7\u022d\2\2\u0d1a\u0db0\bw\1\2\u0d1b\u0d1c"+
		"\7P\2\2\u0d1c\u0db0\bw\1\2\u0d1d\u0d1e\7Q\2\2\u0d1e\u0db0\bw\1\2\u0d1f"+
		"\u0d20\7R\2\2\u0d20\u0db0\bw\1\2\u0d21\u0d22\7S\2\2\u0d22\u0db0\bw\1\2"+
		"\u0d23\u0d24\7T\2\2\u0d24\u0db0\bw\1\2\u0d25\u0d26\7U\2\2\u0d26\u0db0"+
		"\bw\1\2\u0d27\u0d28\7V\2\2\u0d28\u0db0\bw\1\2\u0d29\u0d2a\7W\2\2\u0d2a"+
		"\u0db0\bw\1\2\u0d2b\u0d2c\7X\2\2\u0d2c\u0db0\bw\1\2\u0d2d\u0d2e\7Y\2\2"+
		"\u0d2e\u0db0\bw\1\2\u0d2f\u0d30\7Z\2\2\u0d30\u0db0\bw\1\2\u0d31\u0d32"+
		"\7[\2\2\u0d32\u0db0\bw\1\2\u0d33\u0d34\7\\\2\2\u0d34\u0db0\bw\1\2\u0d35"+
		"\u0d36\7]\2\2\u0d36\u0db0\bw\1\2\u0d37\u0d38\7^\2\2\u0d38\u0db0\bw\1\2"+
		"\u0d39\u0d3a\7_\2\2\u0d3a\u0db0\bw\1\2\u0d3b\u0d3c\7`\2\2\u0d3c\u0db0"+
		"\bw\1\2\u0d3d\u0d3e\7a\2\2\u0d3e\u0db0\bw\1\2\u0d3f\u0d40\7b\2\2\u0d40"+
		"\u0db0\bw\1\2\u0d41\u0d42\7c\2\2\u0d42\u0db0\bw\1\2\u0d43\u0d44\7d\2\2"+
		"\u0d44\u0db0\bw\1\2\u0d45\u0d46\7e\2\2\u0d46\u0db0\bw\1\2\u0d47\u0d48"+
		"\7f\2\2\u0d48\u0db0\bw\1\2\u0d49\u0d4a\7g\2\2\u0d4a\u0db0\bw\1\2\u0d4b"+
		"\u0d4c\7h\2\2\u0d4c\u0db0\bw\1\2\u0d4d\u0d4e\7i\2\2\u0d4e\u0db0\bw\1\2"+
		"\u0d4f\u0d50\7j\2\2\u0d50\u0db0\bw\1\2\u0d51\u0d52\7k\2\2\u0d52\u0db0"+
		"\bw\1\2\u0d53\u0d54\7l\2\2\u0d54\u0db0\bw\1\2\u0d55\u0d56\7m\2\2\u0d56"+
		"\u0db0\bw\1\2\u0d57\u0d58\7n\2\2\u0d58\u0db0\bw\1\2\u0d59\u0d5a\7o\2\2"+
		"\u0d5a\u0db0\bw\1\2\u0d5b\u0d5c\7p\2\2\u0d5c\u0db0\bw\1\2\u0d5d\u0d5e"+
		"\7q\2\2\u0d5e\u0db0\bw\1\2\u0d5f\u0d60\7r\2\2\u0d60\u0db0\bw\1\2\u0d61"+
		"\u0d62\7s\2\2\u0d62\u0db0\bw\1\2\u0d63\u0d64\7t\2\2\u0d64\u0db0\bw\1\2"+
		"\u0d65\u0d66\7u\2\2\u0d66\u0db0\bw\1\2\u0d67\u0d68\7v\2\2\u0d68\u0db0"+
		"\bw\1\2\u0d69\u0d6a\7w\2\2\u0d6a\u0db0\bw\1\2\u0d6b\u0d6c\7x\2\2\u0d6c"+
		"\u0db0\bw\1\2\u0d6d\u0d6e\7y\2\2\u0d6e\u0db0\bw\1\2\u0d6f\u0d70\7z\2\2"+
		"\u0d70\u0db0\bw\1\2\u0d71\u0d72\7{\2\2\u0d72\u0db0\bw\1\2\u0d73\u0d74"+
		"\7|\2\2\u0d74\u0db0\bw\1\2\u0d75\u0d76\7}\2\2\u0d76\u0db0\bw\1\2\u0d77"+
		"\u0d78\7~\2\2\u0d78\u0db0\bw\1\2\u0d79\u0d7a\7\177\2\2\u0d7a\u0db0\bw"+
		"\1\2\u0d7b\u0d7c\7\u0080\2\2\u0d7c\u0db0\bw\1\2\u0d7d\u0d7e\7\u0081\2"+
		"\2\u0d7e\u0db0\bw\1\2\u0d7f\u0d80\7\u0082\2\2\u0d80\u0db0\bw\1\2\u0d81"+
		"\u0d82\7\u0083\2\2\u0d82\u0db0\bw\1\2\u0d83\u0d84\7\u0084\2\2\u0d84\u0db0"+
		"\bw\1\2\u0d85\u0d86\7\u0085\2\2\u0d86\u0db0\bw\1\2\u0d87\u0d88\7\u0086"+
		"\2\2\u0d88\u0db0\bw\1\2\u0d89\u0d8a\7\u0087\2\2\u0d8a\u0db0\bw\1\2\u0d8b"+
		"\u0d8c\7\u0088\2\2\u0d8c\u0db0\bw\1\2\u0d8d\u0d8e\7\u0089\2\2\u0d8e\u0db0"+
		"\bw\1\2\u0d8f\u0d90\7\u008a\2\2\u0d90\u0db0\bw\1\2\u0d91\u0d92\7\u008b"+
		"\2\2\u0d92\u0db0\bw\1\2\u0d93\u0d94\7\u008c\2\2\u0d94\u0db0\bw\1\2\u0d95"+
		"\u0d96\7\u008d\2\2\u0d96\u0db0\bw\1\2\u0d97\u0d98\7\u008e\2\2\u0d98\u0db0"+
		"\bw\1\2\u0d99\u0d9a\7\u008f\2\2\u0d9a\u0db0\bw\1\2\u0d9b\u0d9c\7\u0090"+
		"\2\2\u0d9c\u0db0\bw\1\2\u0d9d\u0d9e\7\u0091\2\2\u0d9e\u0db0\bw\1\2\u0d9f"+
		"\u0da0\7\u0092\2\2\u0da0\u0db0\bw\1\2\u0da1\u0da2\7\u0093\2\2\u0da2\u0db0"+
		"\bw\1\2\u0da3\u0da4\7\u0094\2\2\u0da4\u0db0\bw\1\2\u0da5\u0da6\7\u0095"+
		"\2\2\u0da6\u0db0\bw\1\2\u0da7\u0da8\7\u0096\2\2\u0da8\u0db0\bw\1\2\u0da9"+
		"\u0daa\7\u0097\2\2\u0daa\u0db0\bw\1\2\u0dab\u0dac\7\u0098\2\2\u0dac\u0db0"+
		"\bw\1\2\u0dad\u0dae\7\u0099\2\2\u0dae\u0db0\bw\1\2\u0daf\u0c9b\3\2\2\2"+
		"\u0daf\u0c9d\3\2\2\2\u0daf\u0c9f\3\2\2\2\u0daf\u0ca1\3\2\2\2\u0daf\u0ca3"+
		"\3\2\2\2\u0daf\u0ca5\3\2\2\2\u0daf\u0ca7\3\2\2\2\u0daf\u0ca9\3\2\2\2\u0daf"+
		"\u0cab\3\2\2\2\u0daf\u0cad\3\2\2\2\u0daf\u0caf\3\2\2\2\u0daf\u0cb1\3\2"+
		"\2\2\u0daf\u0cb3\3\2\2\2\u0daf\u0cb5\3\2\2\2\u0daf\u0cb7\3\2\2\2\u0daf"+
		"\u0cb9\3\2\2\2\u0daf\u0cbb\3\2\2\2\u0daf\u0cbd\3\2\2\2\u0daf\u0cbf\3\2"+
		"\2\2\u0daf\u0cc1\3\2\2\2\u0daf\u0cc3\3\2\2\2\u0daf\u0cc5\3\2\2\2\u0daf"+
		"\u0cc7\3\2\2\2\u0daf\u0cc9\3\2\2\2\u0daf\u0ccb\3\2\2\2\u0daf\u0ccd\3\2"+
		"\2\2\u0daf\u0ccf\3\2\2\2\u0daf\u0cd1\3\2\2\2\u0daf\u0cd3\3\2\2\2\u0daf"+
		"\u0cd5\3\2\2\2\u0daf\u0cd7\3\2\2\2\u0daf\u0cd9\3\2\2\2\u0daf\u0cdb\3\2"+
		"\2\2\u0daf\u0cdd\3\2\2\2\u0daf\u0cdf\3\2\2\2\u0daf\u0ce1\3\2\2\2\u0daf"+
		"\u0ce3\3\2\2\2\u0daf\u0ce5\3\2\2\2\u0daf\u0ce7\3\2\2\2\u0daf\u0ce9\3\2"+
		"\2\2\u0daf\u0ceb\3\2\2\2\u0daf\u0ced\3\2\2\2\u0daf\u0cef\3\2\2\2\u0daf"+
		"\u0cf1\3\2\2\2\u0daf\u0cf3\3\2\2\2\u0daf\u0cf5\3\2\2\2\u0daf\u0cf7\3\2"+
		"\2\2\u0daf\u0cf9\3\2\2\2\u0daf\u0cfb\3\2\2\2\u0daf\u0cfd\3\2\2\2\u0daf"+
		"\u0cff\3\2\2\2\u0daf\u0d01\3\2\2\2\u0daf\u0d03\3\2\2\2\u0daf\u0d05\3\2"+
		"\2\2\u0daf\u0d07\3\2\2\2\u0daf\u0d09\3\2\2\2\u0daf\u0d0b\3\2\2\2\u0daf"+
		"\u0d0d\3\2\2\2\u0daf\u0d0f\3\2\2\2\u0daf\u0d11\3\2\2\2\u0daf\u0d13\3\2"+
		"\2\2\u0daf\u0d15\3\2\2\2\u0daf\u0d17\3\2\2\2\u0daf\u0d19\3\2\2\2\u0daf"+
		"\u0d1b\3\2\2\2\u0daf\u0d1d\3\2\2\2\u0daf\u0d1f\3\2\2\2\u0daf\u0d21\3\2"+
		"\2\2\u0daf\u0d23\3\2\2\2\u0daf\u0d25\3\2\2\2\u0daf\u0d27\3\2\2\2\u0daf"+
		"\u0d29\3\2\2\2\u0daf\u0d2b\3\2\2\2\u0daf\u0d2d\3\2\2\2\u0daf\u0d2f\3\2"+
		"\2\2\u0daf\u0d31\3\2\2\2\u0daf\u0d33\3\2\2\2\u0daf\u0d35\3\2\2\2\u0daf"+
		"\u0d37\3\2\2\2\u0daf\u0d39\3\2\2\2\u0daf\u0d3b\3\2\2\2\u0daf\u0d3d\3\2"+
		"\2\2\u0daf\u0d3f\3\2\2\2\u0daf\u0d41\3\2\2\2\u0daf\u0d43\3\2\2\2\u0daf"+
		"\u0d45\3\2\2\2\u0daf\u0d47\3\2\2\2\u0daf\u0d49\3\2\2\2\u0daf\u0d4b\3\2"+
		"\2\2\u0daf\u0d4d\3\2\2\2\u0daf\u0d4f\3\2\2\2\u0daf\u0d51\3\2\2\2\u0daf"+
		"\u0d53\3\2\2\2\u0daf\u0d55\3\2\2\2\u0daf\u0d57\3\2\2\2\u0daf\u0d59\3\2"+
		"\2\2\u0daf\u0d5b\3\2\2\2\u0daf\u0d5d\3\2\2\2\u0daf\u0d5f\3\2\2\2\u0daf"+
		"\u0d61\3\2\2\2\u0daf\u0d63\3\2\2\2\u0daf\u0d65\3\2\2\2\u0daf\u0d67\3\2"+
		"\2\2\u0daf\u0d69\3\2\2\2\u0daf\u0d6b\3\2\2\2\u0daf\u0d6d\3\2\2\2\u0daf"+
		"\u0d6f\3\2\2\2\u0daf\u0d71\3\2\2\2\u0daf\u0d73\3\2\2\2\u0daf\u0d75\3\2"+
		"\2\2\u0daf\u0d77\3\2\2\2\u0daf\u0d79\3\2\2\2\u0daf\u0d7b\3\2\2\2\u0daf"+
		"\u0d7d\3\2\2\2\u0daf\u0d7f\3\2\2\2\u0daf\u0d81\3\2\2\2\u0daf\u0d83\3\2"+
		"\2\2\u0daf\u0d85\3\2\2\2\u0daf\u0d87\3\2\2\2\u0daf\u0d89\3\2\2\2\u0daf"+
		"\u0d8b\3\2\2\2\u0daf\u0d8d\3\2\2\2\u0daf\u0d8f\3\2\2\2\u0daf\u0d91\3\2"+
		"\2\2\u0daf\u0d93\3\2\2\2\u0daf\u0d95\3\2\2\2\u0daf\u0d97\3\2\2\2\u0daf"+
		"\u0d99\3\2\2\2\u0daf\u0d9b\3\2\2\2\u0daf\u0d9d\3\2\2\2\u0daf\u0d9f\3\2"+
		"\2\2\u0daf\u0da1\3\2\2\2\u0daf\u0da3\3\2\2\2\u0daf\u0da5\3\2\2\2\u0daf"+
		"\u0da7\3\2\2\2\u0daf\u0da9\3\2\2\2\u0daf\u0dab\3\2\2\2\u0daf\u0dad\3\2"+
		"\2\2\u0db0\u00ed\3\2\2\2\u0db1\u0db2\5\u00f0y\2\u0db2\u0db3\bx\1\2\u0db3"+
		"\u0f3d\3\2\2\2\u0db4\u0db5\7\u0221\2\2\u0db5\u0f3d\bx\1\2\u0db6\u0db7"+
		"\7\u009a\2\2\u0db7\u0f3d\bx\1\2\u0db8\u0db9\7\u009b\2\2\u0db9\u0f3d\b"+
		"x\1\2\u0dba\u0dbb\7\u009c\2\2\u0dbb\u0f3d\bx\1\2\u0dbc\u0dbd\7\u009d\2"+
		"\2\u0dbd\u0f3d\bx\1\2\u0dbe\u0dbf\7\u009e\2\2\u0dbf\u0f3d\bx\1\2\u0dc0"+
		"\u0dc1\7\u009f\2\2\u0dc1\u0f3d\bx\1\2\u0dc2\u0dc3\7\u00a0\2\2\u0dc3\u0f3d"+
		"\bx\1\2\u0dc4\u0dc5\7\u00a1\2\2\u0dc5\u0f3d\bx\1\2\u0dc6\u0dc7\7\u00a2"+
		"\2\2\u0dc7\u0f3d\bx\1\2\u0dc8\u0dc9\7\u00a3\2\2\u0dc9\u0f3d\bx\1\2\u0dca"+
		"\u0dcb\7\u00a4\2\2\u0dcb\u0f3d\bx\1\2\u0dcc\u0dcd\7\u00a5\2\2\u0dcd\u0f3d"+
		"\bx\1\2\u0dce\u0dcf\7\u00a6\2\2\u0dcf\u0f3d\bx\1\2\u0dd0\u0dd1\7\u00a7"+
		"\2\2\u0dd1\u0f3d\bx\1\2\u0dd2\u0dd3\7\u00a8\2\2\u0dd3\u0f3d\bx\1\2\u0dd4"+
		"\u0dd5\7\u00a9\2\2\u0dd5\u0f3d\bx\1\2\u0dd6\u0dd7\7\u00aa\2\2\u0dd7\u0f3d"+
		"\bx\1\2\u0dd8\u0dd9\7\u00ab\2\2\u0dd9\u0f3d\bx\1\2\u0dda\u0ddb\7\u00ac"+
		"\2\2\u0ddb\u0f3d\bx\1\2\u0ddc\u0ddd\7\u00ad\2\2\u0ddd\u0f3d\bx\1\2\u0dde"+
		"\u0ddf\7\u00ae\2\2\u0ddf\u0f3d\bx\1\2\u0de0\u0de1\7\u00af\2\2\u0de1\u0f3d"+
		"\bx\1\2\u0de2\u0de3\7\u00b0\2\2\u0de3\u0f3d\bx\1\2\u0de4\u0de5\7\u00b1"+
		"\2\2\u0de5\u0f3d\bx\1\2\u0de6\u0de7\7\u00b2\2\2\u0de7\u0f3d\bx\1\2\u0de8"+
		"\u0de9\7\u00b3\2\2\u0de9\u0f3d\bx\1\2\u0dea\u0deb\7\u00b4\2\2\u0deb\u0f3d"+
		"\bx\1\2\u0dec\u0ded\7\u00b5\2\2\u0ded\u0f3d\bx\1\2\u0dee\u0def\7\u00b6"+
		"\2\2\u0def\u0f3d\bx\1\2\u0df0\u0df1\7\u00b7\2\2\u0df1\u0f3d\bx\1\2\u0df2"+
		"\u0df3\7\u00b8\2\2\u0df3\u0f3d\bx\1\2\u0df4\u0df5\7\u00b9\2\2\u0df5\u0f3d"+
		"\bx\1\2\u0df6\u0df7\7\u00ba\2\2\u0df7\u0f3d\bx\1\2\u0df8\u0df9\7\u00bb"+
		"\2\2\u0df9\u0f3d\bx\1\2\u0dfa\u0dfb\7\u00bc\2\2\u0dfb\u0f3d\bx\1\2\u0dfc"+
		"\u0dfd\7\u00bd\2\2\u0dfd\u0f3d\bx\1\2\u0dfe\u0dff\7\u00be\2\2\u0dff\u0f3d"+
		"\bx\1\2\u0e00\u0e01\7\u00bf\2\2\u0e01\u0f3d\bx\1\2\u0e02\u0e03\7\u00c0"+
		"\2\2\u0e03\u0f3d\bx\1\2\u0e04\u0e05\7\u00c1\2\2\u0e05\u0f3d\bx\1\2\u0e06"+
		"\u0e07\7\u00c2\2\2\u0e07\u0f3d\bx\1\2\u0e08\u0e09\7\u00c3\2\2\u0e09\u0f3d"+
		"\bx\1\2\u0e0a\u0e0b\7\u00c4\2\2\u0e0b\u0f3d\bx\1\2\u0e0c\u0e0d\7\u00c5"+
		"\2\2\u0e0d\u0f3d\bx\1\2\u0e0e\u0e0f\7\u00c6\2\2\u0e0f\u0f3d\bx\1\2\u0e10"+
		"\u0e11\7\u00c7\2\2\u0e11\u0f3d\bx\1\2\u0e12\u0e13\7\u00c8\2\2\u0e13\u0f3d"+
		"\bx\1\2\u0e14\u0e15\7\u00c9\2\2\u0e15\u0f3d\bx\1\2\u0e16\u0e17\7\u00ca"+
		"\2\2\u0e17\u0f3d\bx\1\2\u0e18\u0e19\7\u00cb\2\2\u0e19\u0f3d\bx\1\2\u0e1a"+
		"\u0e1b\7\u00cc\2\2\u0e1b\u0f3d\bx\1\2\u0e1c\u0e1d\7\u00cd\2\2\u0e1d\u0f3d"+
		"\bx\1\2\u0e1e\u0e1f\7\u00ce\2\2\u0e1f\u0f3d\bx\1\2\u0e20\u0e21\7\u00cf"+
		"\2\2\u0e21\u0f3d\bx\1\2\u0e22\u0e23\7\u00d0\2\2\u0e23\u0f3d\bx\1\2\u0e24"+
		"\u0e25\7\u00d1\2\2\u0e25\u0f3d\bx\1\2\u0e26\u0e27\7\u00d2\2\2\u0e27\u0f3d"+
		"\bx\1\2\u0e28\u0e29\7\u00d3\2\2\u0e29\u0f3d\bx\1\2\u0e2a\u0e2b\7\u00d4"+
		"\2\2\u0e2b\u0f3d\bx\1\2\u0e2c\u0e2d\7\u00d5\2\2\u0e2d\u0f3d\bx\1\2\u0e2e"+
		"\u0e2f\7\u00d6\2\2\u0e2f\u0f3d\bx\1\2\u0e30\u0e31\7\u00d7\2\2\u0e31\u0f3d"+
		"\bx\1\2\u0e32\u0e33\7\u00d8\2\2\u0e33\u0f3d\bx\1\2\u0e34\u0e35\7\u00d9"+
		"\2\2\u0e35\u0f3d\bx\1\2\u0e36\u0e37\7\u00da\2\2\u0e37\u0f3d\bx\1\2\u0e38"+
		"\u0e39\7\u00db\2\2\u0e39\u0f3d\bx\1\2\u0e3a\u0e3b\7\u00dc\2\2\u0e3b\u0f3d"+
		"\bx\1\2\u0e3c\u0e3d\7\u00dd\2\2\u0e3d\u0f3d\bx\1\2\u0e3e\u0e3f\7\u00de"+
		"\2\2\u0e3f\u0f3d\bx\1\2\u0e40\u0e41\7\u00df\2\2\u0e41\u0f3d\bx\1\2\u0e42"+
		"\u0e43\7\u00e0\2\2\u0e43\u0f3d\bx\1\2\u0e44\u0e45\7\u00e1\2\2\u0e45\u0f3d"+
		"\bx\1\2\u0e46\u0e47\7\u00e2\2\2\u0e47\u0f3d\bx\1\2\u0e48\u0e49\7\u00e3"+
		"\2\2\u0e49\u0f3d\bx\1\2\u0e4a\u0e4b\7\u00e4\2\2\u0e4b\u0f3d\bx\1\2\u0e4c"+
		"\u0e4d\7\u00e5\2\2\u0e4d\u0f3d\bx\1\2\u0e4e\u0e4f\7\u00e6\2\2\u0e4f\u0f3d"+
		"\bx\1\2\u0e50\u0e51\7\u00e7\2\2\u0e51\u0f3d\bx\1\2\u0e52\u0e53\7\u00e8"+
		"\2\2\u0e53\u0f3d\bx\1\2\u0e54\u0e55\7\u00e9\2\2\u0e55\u0f3d\bx\1\2\u0e56"+
		"\u0e57\7\u00ea\2\2\u0e57\u0f3d\bx\1\2\u0e58\u0e59\7\u00eb\2\2\u0e59\u0f3d"+
		"\bx\1\2\u0e5a\u0e5b\7\u00ec\2\2\u0e5b\u0f3d\bx\1\2\u0e5c\u0e5d\7\u00ed"+
		"\2\2\u0e5d\u0f3d\bx\1\2\u0e5e\u0e5f\7\u00ee\2\2\u0e5f\u0f3d\bx\1\2\u0e60"+
		"\u0e61\7\u00ef\2\2\u0e61\u0f3d\bx\1\2\u0e62\u0e63\7\u00f0\2\2\u0e63\u0f3d"+
		"\bx\1\2\u0e64\u0e65\7\u00f1\2\2\u0e65\u0f3d\bx\1\2\u0e66\u0e67\7\u00f2"+
		"\2\2\u0e67\u0f3d\bx\1\2\u0e68\u0e69\7\u00f3\2\2\u0e69\u0f3d\bx\1\2\u0e6a"+
		"\u0e6b\7\u00f4\2\2\u0e6b\u0f3d\bx\1\2\u0e6c\u0e6d\7\u00f5\2\2\u0e6d\u0f3d"+
		"\bx\1\2\u0e6e\u0e6f\7\u00f6\2\2\u0e6f\u0f3d\bx\1\2\u0e70\u0e71\7\u00f7"+
		"\2\2\u0e71\u0f3d\bx\1\2\u0e72\u0e73\7\u00f8\2\2\u0e73\u0f3d\bx\1\2\u0e74"+
		"\u0e75\7\u00f9\2\2\u0e75\u0f3d\bx\1\2\u0e76\u0e77\7\u00fa\2\2\u0e77\u0f3d"+
		"\bx\1\2\u0e78\u0e79\7\u00fb\2\2\u0e79\u0f3d\bx\1\2\u0e7a\u0e7b\7\u00fc"+
		"\2\2\u0e7b\u0f3d\bx\1\2\u0e7c\u0e7d\7\u00fd\2\2\u0e7d\u0f3d\bx\1\2\u0e7e"+
		"\u0e7f\7\u00fe\2\2\u0e7f\u0f3d\bx\1\2\u0e80\u0e81\7\u00ff\2\2\u0e81\u0f3d"+
		"\bx\1\2\u0e82\u0e83\7\u0100\2\2\u0e83\u0f3d\bx\1\2\u0e84\u0e85\7\u0101"+
		"\2\2\u0e85\u0f3d\bx\1\2\u0e86\u0e87\7\u0102\2\2\u0e87\u0f3d\bx\1\2\u0e88"+
		"\u0e89\7\u0103\2\2\u0e89\u0f3d\bx\1\2\u0e8a\u0e8b\7\u0104\2\2\u0e8b\u0f3d"+
		"\bx\1\2\u0e8c\u0e8d\7\u0105\2\2\u0e8d\u0f3d\bx\1\2\u0e8e\u0e8f\7\u0106"+
		"\2\2\u0e8f\u0f3d\bx\1\2\u0e90\u0e91\7\u0107\2\2\u0e91\u0f3d\bx\1\2\u0e92"+
		"\u0e93\7\u0108\2\2\u0e93\u0f3d\bx\1\2\u0e94\u0e95\7\u0109\2\2\u0e95\u0f3d"+
		"\bx\1\2\u0e96\u0e97\7\u010a\2\2\u0e97\u0f3d\bx\1\2\u0e98\u0e99\7\u010b"+
		"\2\2\u0e99\u0f3d\bx\1\2\u0e9a\u0e9b\7\u010c\2\2\u0e9b\u0f3d\bx\1\2\u0e9c"+
		"\u0e9d\7\u010d\2\2\u0e9d\u0f3d\bx\1\2\u0e9e\u0e9f\7\u010e\2\2\u0e9f\u0f3d"+
		"\bx\1\2\u0ea0\u0ea1\7\u010f\2\2\u0ea1\u0f3d\bx\1\2\u0ea2\u0ea3\7\u0110"+
		"\2\2\u0ea3\u0f3d\bx\1\2\u0ea4\u0ea5\7\u0111\2\2\u0ea5\u0f3d\bx\1\2\u0ea6"+
		"\u0ea7\7\u0112\2\2\u0ea7\u0f3d\bx\1\2\u0ea8\u0ea9\7\u0113\2\2\u0ea9\u0f3d"+
		"\bx\1\2\u0eaa\u0eab\7\u0114\2\2\u0eab\u0f3d\bx\1\2\u0eac\u0ead\7\u0115"+
		"\2\2\u0ead\u0f3d\bx\1\2\u0eae\u0eaf\7\u0116\2\2\u0eaf\u0f3d\bx\1\2\u0eb0"+
		"\u0eb1\7\u0117\2\2\u0eb1\u0f3d\bx\1\2\u0eb2\u0eb3\7\u0118\2\2\u0eb3\u0f3d"+
		"\bx\1\2\u0eb4\u0eb5\7\u0119\2\2\u0eb5\u0f3d\bx\1\2\u0eb6\u0eb7\7\u011a"+
		"\2\2\u0eb7\u0f3d\bx\1\2\u0eb8\u0eb9\7\u011b\2\2\u0eb9\u0f3d\bx\1\2\u0eba"+
		"\u0ebb\7\u011c\2\2\u0ebb\u0f3d\bx\1\2\u0ebc\u0ebd\7\u011d\2\2\u0ebd\u0f3d"+
		"\bx\1\2\u0ebe\u0ebf\7\u011e\2\2\u0ebf\u0f3d\bx\1\2\u0ec0\u0ec1\7\u011f"+
		"\2\2\u0ec1\u0f3d\bx\1\2\u0ec2\u0ec3\7\u0120\2\2\u0ec3\u0f3d\bx\1\2\u0ec4"+
		"\u0ec5\7\u0121\2\2\u0ec5\u0f3d\bx\1\2\u0ec6\u0ec7\7\u0122\2\2\u0ec7\u0f3d"+
		"\bx\1\2\u0ec8\u0ec9\7\u0123\2\2\u0ec9\u0f3d\bx\1\2\u0eca\u0ecb\7\u0124"+
		"\2\2\u0ecb\u0f3d\bx\1\2\u0ecc\u0ecd\7\u0125\2\2\u0ecd\u0f3d\bx\1\2\u0ece"+
		"\u0ecf\7\u0126\2\2\u0ecf\u0f3d\bx\1\2\u0ed0\u0ed1\7\u0127\2\2\u0ed1\u0f3d"+
		"\bx\1\2\u0ed2\u0ed3\7\u0128\2\2\u0ed3\u0f3d\bx\1\2\u0ed4\u0ed5\7\u0129"+
		"\2\2\u0ed5\u0f3d\bx\1\2\u0ed6\u0ed7\7\u012a\2\2\u0ed7\u0f3d\bx\1\2\u0ed8"+
		"\u0ed9\7\u012b\2\2\u0ed9\u0f3d\bx\1\2\u0eda\u0edb\7\u012c\2\2\u0edb\u0f3d"+
		"\bx\1\2\u0edc\u0edd\7\u012d\2\2\u0edd\u0f3d\bx\1\2\u0ede\u0edf\7\u012e"+
		"\2\2\u0edf\u0f3d\bx\1\2\u0ee0\u0ee1\7\u012f\2\2\u0ee1\u0f3d\bx\1\2\u0ee2"+
		"\u0ee3\7\u0130\2\2\u0ee3\u0f3d\bx\1\2\u0ee4\u0ee5\7\u0131\2\2\u0ee5\u0f3d"+
		"\bx\1\2\u0ee6\u0ee7\7\u0132\2\2\u0ee7\u0f3d\bx\1\2\u0ee8\u0ee9\7\u0133"+
		"\2\2\u0ee9\u0f3d\bx\1\2\u0eea\u0eeb\7\u0134\2\2\u0eeb\u0f3d\bx\1\2\u0eec"+
		"\u0eed\7\u0135\2\2\u0eed\u0f3d\bx\1\2\u0eee\u0eef\7\u0136\2\2\u0eef\u0f3d"+
		"\bx\1\2\u0ef0\u0ef1\7\u0137\2\2\u0ef1\u0f3d\bx\1\2\u0ef2\u0ef3\7\u0138"+
		"\2\2\u0ef3\u0f3d\bx\1\2\u0ef4\u0ef5\7\u0139\2\2\u0ef5\u0f3d\bx\1\2\u0ef6"+
		"\u0ef7\7\u013a\2\2\u0ef7\u0f3d\bx\1\2\u0ef8\u0ef9\7\u013b\2\2\u0ef9\u0f3d"+
		"\bx\1\2\u0efa\u0efb\7\u013c\2\2\u0efb\u0f3d\bx\1\2\u0efc\u0efd\7\u013d"+
		"\2\2\u0efd\u0f3d\bx\1\2\u0efe\u0eff\7\u013e\2\2\u0eff\u0f3d\bx\1\2\u0f00"+
		"\u0f01\7\u013f\2\2\u0f01\u0f3d\bx\1\2\u0f02\u0f03\7\u0140\2\2\u0f03\u0f3d"+
		"\bx\1\2\u0f04\u0f05\7\u0141\2\2\u0f05\u0f3d\bx\1\2\u0f06\u0f07\7\u0142"+
		"\2\2\u0f07\u0f3d\bx\1\2\u0f08\u0f09\7\u0143\2\2\u0f09\u0f3d\bx\1\2\u0f0a"+
		"\u0f0b\7\u0144\2\2\u0f0b\u0f3d\bx\1\2\u0f0c\u0f0d\7\u0145\2\2\u0f0d\u0f3d"+
		"\bx\1\2\u0f0e\u0f0f\7\u0146\2\2\u0f0f\u0f3d\bx\1\2\u0f10\u0f11\7\u0147"+
		"\2\2\u0f11\u0f3d\bx\1\2\u0f12\u0f13\7\u0148\2\2\u0f13\u0f3d\bx\1\2\u0f14"+
		"\u0f15\7\u0149\2\2\u0f15\u0f3d\bx\1\2\u0f16\u0f17\7\u014a\2\2\u0f17\u0f3d"+
		"\bx\1\2\u0f18\u0f19\7\u014b\2\2\u0f19\u0f3d\bx\1\2\u0f1a\u0f1b\7\u014c"+
		"\2\2\u0f1b\u0f3d\bx\1\2\u0f1c\u0f1d\7\u014d\2\2\u0f1d\u0f3d\bx\1\2\u0f1e"+
		"\u0f1f\7\u0201\2\2\u0f1f\u0f3d\bx\1\2\u0f20\u0f21\7\u020e\2\2\u0f21\u0f3d"+
		"\bx\1\2\u0f22\u0f23\7\u0214\2\2\u0f23\u0f3d\bx\1\2\u0f24\u0f25\7\u0215"+
		"\2\2\u0f25\u0f3d\bx\1\2\u0f26\u0f27\7\u0216\2\2\u0f27\u0f3d\bx\1\2\u0f28"+
		"\u0f29\7\u0217\2\2\u0f29\u0f3d\bx\1\2\u0f2a\u0f2b\7\u0218\2\2\u0f2b\u0f3d"+
		"\bx\1\2\u0f2c\u0f2d\7\u0219\2\2\u0f2d\u0f3d\bx\1\2\u0f2e\u0f2f\7\u021a"+
		"\2\2\u0f2f\u0f3d\bx\1\2\u0f30\u0f31\7\u021b\2\2\u0f31\u0f3d\bx\1\2\u0f32"+
		"\u0f33\7\u021c\2\2\u0f33\u0f3d\bx\1\2\u0f34\u0f35\7\u021d\2\2\u0f35\u0f3d"+
		"\bx\1\2\u0f36\u0f37\7\u021e\2\2\u0f37\u0f3d\bx\1\2\u0f38\u0f39\7\u021f"+
		"\2\2\u0f39\u0f3d\bx\1\2\u0f3a\u0f3b\7\u0220\2\2\u0f3b\u0f3d\bx\1\2\u0f3c"+
		"\u0db1\3\2\2\2\u0f3c\u0db4\3\2\2\2\u0f3c\u0db6\3\2\2\2\u0f3c\u0db8\3\2"+
		"\2\2\u0f3c\u0dba\3\2\2\2\u0f3c\u0dbc\3\2\2\2\u0f3c\u0dbe\3\2\2\2\u0f3c"+
		"\u0dc0\3\2\2\2\u0f3c\u0dc2\3\2\2\2\u0f3c\u0dc4\3\2\2\2\u0f3c\u0dc6\3\2"+
		"\2\2\u0f3c\u0dc8\3\2\2\2\u0f3c\u0dca\3\2\2\2\u0f3c\u0dcc\3\2\2\2\u0f3c"+
		"\u0dce\3\2\2\2\u0f3c\u0dd0\3\2\2\2\u0f3c\u0dd2\3\2\2\2\u0f3c\u0dd4\3\2"+
		"\2\2\u0f3c\u0dd6\3\2\2\2\u0f3c\u0dd8\3\2\2\2\u0f3c\u0dda\3\2\2\2\u0f3c"+
		"\u0ddc\3\2\2\2\u0f3c\u0dde\3\2\2\2\u0f3c\u0de0\3\2\2\2\u0f3c\u0de2\3\2"+
		"\2\2\u0f3c\u0de4\3\2\2\2\u0f3c\u0de6\3\2\2\2\u0f3c\u0de8\3\2\2\2\u0f3c"+
		"\u0dea\3\2\2\2\u0f3c\u0dec\3\2\2\2\u0f3c\u0dee\3\2\2\2\u0f3c\u0df0\3\2"+
		"\2\2\u0f3c\u0df2\3\2\2\2\u0f3c\u0df4\3\2\2\2\u0f3c\u0df6\3\2\2\2\u0f3c"+
		"\u0df8\3\2\2\2\u0f3c\u0dfa\3\2\2\2\u0f3c\u0dfc\3\2\2\2\u0f3c\u0dfe\3\2"+
		"\2\2\u0f3c\u0e00\3\2\2\2\u0f3c\u0e02\3\2\2\2\u0f3c\u0e04\3\2\2\2\u0f3c"+
		"\u0e06\3\2\2\2\u0f3c\u0e08\3\2\2\2\u0f3c\u0e0a\3\2\2\2\u0f3c\u0e0c\3\2"+
		"\2\2\u0f3c\u0e0e\3\2\2\2\u0f3c\u0e10\3\2\2\2\u0f3c\u0e12\3\2\2\2\u0f3c"+
		"\u0e14\3\2\2\2\u0f3c\u0e16\3\2\2\2\u0f3c\u0e18\3\2\2\2\u0f3c\u0e1a\3\2"+
		"\2\2\u0f3c\u0e1c\3\2\2\2\u0f3c\u0e1e\3\2\2\2\u0f3c\u0e20\3\2\2\2\u0f3c"+
		"\u0e22\3\2\2\2\u0f3c\u0e24\3\2\2\2\u0f3c\u0e26\3\2\2\2\u0f3c\u0e28\3\2"+
		"\2\2\u0f3c\u0e2a\3\2\2\2\u0f3c\u0e2c\3\2\2\2\u0f3c\u0e2e\3\2\2\2\u0f3c"+
		"\u0e30\3\2\2\2\u0f3c\u0e32\3\2\2\2\u0f3c\u0e34\3\2\2\2\u0f3c\u0e36\3\2"+
		"\2\2\u0f3c\u0e38\3\2\2\2\u0f3c\u0e3a\3\2\2\2\u0f3c\u0e3c\3\2\2\2\u0f3c"+
		"\u0e3e\3\2\2\2\u0f3c\u0e40\3\2\2\2\u0f3c\u0e42\3\2\2\2\u0f3c\u0e44\3\2"+
		"\2\2\u0f3c\u0e46\3\2\2\2\u0f3c\u0e48\3\2\2\2\u0f3c\u0e4a\3\2\2\2\u0f3c"+
		"\u0e4c\3\2\2\2\u0f3c\u0e4e\3\2\2\2\u0f3c\u0e50\3\2\2\2\u0f3c\u0e52\3\2"+
		"\2\2\u0f3c\u0e54\3\2\2\2\u0f3c\u0e56\3\2\2\2\u0f3c\u0e58\3\2\2\2\u0f3c"+
		"\u0e5a\3\2\2\2\u0f3c\u0e5c\3\2\2\2\u0f3c\u0e5e\3\2\2\2\u0f3c\u0e60\3\2"+
		"\2\2\u0f3c\u0e62\3\2\2\2\u0f3c\u0e64\3\2\2\2\u0f3c\u0e66\3\2\2\2\u0f3c"+
		"\u0e68\3\2\2\2\u0f3c\u0e6a\3\2\2\2\u0f3c\u0e6c\3\2\2\2\u0f3c\u0e6e\3\2"+
		"\2\2\u0f3c\u0e70\3\2\2\2\u0f3c\u0e72\3\2\2\2\u0f3c\u0e74\3\2\2\2\u0f3c"+
		"\u0e76\3\2\2\2\u0f3c\u0e78\3\2\2\2\u0f3c\u0e7a\3\2\2\2\u0f3c\u0e7c\3\2"+
		"\2\2\u0f3c\u0e7e\3\2\2\2\u0f3c\u0e80\3\2\2\2\u0f3c\u0e82\3\2\2\2\u0f3c"+
		"\u0e84\3\2\2\2\u0f3c\u0e86\3\2\2\2\u0f3c\u0e88\3\2\2\2\u0f3c\u0e8a\3\2"+
		"\2\2\u0f3c\u0e8c\3\2\2\2\u0f3c\u0e8e\3\2\2\2\u0f3c\u0e90\3\2\2\2\u0f3c"+
		"\u0e92\3\2\2\2\u0f3c\u0e94\3\2\2\2\u0f3c\u0e96\3\2\2\2\u0f3c\u0e98\3\2"+
		"\2\2\u0f3c\u0e9a\3\2\2\2\u0f3c\u0e9c\3\2\2\2\u0f3c\u0e9e\3\2\2\2\u0f3c"+
		"\u0ea0\3\2\2\2\u0f3c\u0ea2\3\2\2\2\u0f3c\u0ea4\3\2\2\2\u0f3c\u0ea6\3\2"+
		"\2\2\u0f3c\u0ea8\3\2\2\2\u0f3c\u0eaa\3\2\2\2\u0f3c\u0eac\3\2\2\2\u0f3c"+
		"\u0eae\3\2\2\2\u0f3c\u0eb0\3\2\2\2\u0f3c\u0eb2\3\2\2\2\u0f3c\u0eb4\3\2"+
		"\2\2\u0f3c\u0eb6\3\2\2\2\u0f3c\u0eb8\3\2\2\2\u0f3c\u0eba\3\2\2\2\u0f3c"+
		"\u0ebc\3\2\2\2\u0f3c\u0ebe\3\2\2\2\u0f3c\u0ec0\3\2\2\2\u0f3c\u0ec2\3\2"+
		"\2\2\u0f3c\u0ec4\3\2\2\2\u0f3c\u0ec6\3\2\2\2\u0f3c\u0ec8\3\2\2\2\u0f3c"+
		"\u0eca\3\2\2\2\u0f3c\u0ecc\3\2\2\2\u0f3c\u0ece\3\2\2\2\u0f3c\u0ed0\3\2"+
		"\2\2\u0f3c\u0ed2\3\2\2\2\u0f3c\u0ed4\3\2\2\2\u0f3c\u0ed6\3\2\2\2\u0f3c"+
		"\u0ed8\3\2\2\2\u0f3c\u0eda\3\2\2\2\u0f3c\u0edc\3\2\2\2\u0f3c\u0ede\3\2"+
		"\2\2\u0f3c\u0ee0\3\2\2\2\u0f3c\u0ee2\3\2\2\2\u0f3c\u0ee4\3\2\2\2\u0f3c"+
		"\u0ee6\3\2\2\2\u0f3c\u0ee8\3\2\2\2\u0f3c\u0eea\3\2\2\2\u0f3c\u0eec\3\2"+
		"\2\2\u0f3c\u0eee\3\2\2\2\u0f3c\u0ef0\3\2\2\2\u0f3c\u0ef2\3\2\2\2\u0f3c"+
		"\u0ef4\3\2\2\2\u0f3c\u0ef6\3\2\2\2\u0f3c\u0ef8\3\2\2\2\u0f3c\u0efa\3\2"+
		"\2\2\u0f3c\u0efc\3\2\2\2\u0f3c\u0efe\3\2\2\2\u0f3c\u0f00\3\2\2\2\u0f3c"+
		"\u0f02\3\2\2\2\u0f3c\u0f04\3\2\2\2\u0f3c\u0f06\3\2\2\2\u0f3c\u0f08\3\2"+
		"\2\2\u0f3c\u0f0a\3\2\2\2\u0f3c\u0f0c\3\2\2\2\u0f3c\u0f0e\3\2\2\2\u0f3c"+
		"\u0f10\3\2\2\2\u0f3c\u0f12\3\2\2\2\u0f3c\u0f14\3\2\2\2\u0f3c\u0f16\3\2"+
		"\2\2\u0f3c\u0f18\3\2\2\2\u0f3c\u0f1a\3\2\2\2\u0f3c\u0f1c\3\2\2\2\u0f3c"+
		"\u0f1e\3\2\2\2\u0f3c\u0f20\3\2\2\2\u0f3c\u0f22\3\2\2\2\u0f3c\u0f24\3\2"+
		"\2\2\u0f3c\u0f26\3\2\2\2\u0f3c\u0f28\3\2\2\2\u0f3c\u0f2a\3\2\2\2\u0f3c"+
		"\u0f2c\3\2\2\2\u0f3c\u0f2e\3\2\2\2\u0f3c\u0f30\3\2\2\2\u0f3c\u0f32\3\2"+
		"\2\2\u0f3c\u0f34\3\2\2\2\u0f3c\u0f36\3\2\2\2\u0f3c\u0f38\3\2\2\2\u0f3c"+
		"\u0f3a\3\2\2\2\u0f3d\u00ef\3\2\2\2\u0f3e\u0f3f\7\u01a8\2\2\u0f3f\u10e9"+
		"\by\1\2\u0f40\u0f41\7\u01c4\2\2\u0f41\u10e9\by\1\2\u0f42\u0f43\7\u0173"+
		"\2\2\u0f43\u10e9\by\1\2\u0f44\u0f45\7\u01a5\2\2\u0f45\u10e9\by\1\2\u0f46"+
		"\u0f47\7\u01bf\2\2\u0f47\u10e9\by\1\2\u0f48\u0f49\7\u015d\2\2\u0f49\u10e9"+
		"\by\1\2\u0f4a\u0f4b\7\u01c6\2\2\u0f4b\u10e9\by\1\2\u0f4c\u0f4d\7\u017b"+
		"\2\2\u0f4d\u10e9\by\1\2\u0f4e\u0f4f\7\61\2\2\u0f4f\u10e9\by\1\2\u0f50"+
		"\u0f51\7\u0176\2\2\u0f51\u10e9\by\1\2\u0f52\u0f53\7\u015c\2\2\u0f53\u10e9"+
		"\by\1\2\u0f54\u0f55\7\u0192\2\2\u0f55\u10e9\by\1\2\u0f56\u0f57\7\u016b"+
		"\2\2\u0f57\u10e9\by\1\2\u0f58\u0f59\7\u01be\2\2\u0f59\u10e9\by\1\2\u0f5a"+
		"\u0f5b\7\u01d5\2\2\u0f5b\u10e9\by\1\2\u0f5c\u0f5d\7\u0162\2\2\u0f5d\u10e9"+
		"\by\1\2\u0f5e\u0f5f\7\u01b5\2\2\u0f5f\u10e9\by\1\2\u0f60\u0f61\7\30\2"+
		"\2\u0f61\u10e9\by\1\2\u0f62\u0f63\7\u00af\2\2\u0f63\u10e9\by\1\2\u0f64"+
		"\u0f65\7\u0150\2\2\u0f65\u10e9\by\1\2\u0f66\u0f67\7\u0199\2\2\u0f67\u10e9"+
		"\by\1\2\u0f68\u0f69\7\u0186\2\2\u0f69\u10e9\by\1\2\u0f6a\u0f6b\7\u0181"+
		"\2\2\u0f6b\u10e9\by\1\2\u0f6c\u0f6d\7\u01a4\2\2\u0f6d\u10e9\by\1\2\u0f6e"+
		"\u0f6f\7\u0171\2\2\u0f6f\u10e9\by\1\2\u0f70\u0f71\7\u01e7\2\2\u0f71\u10e9"+
		"\by\1\2\u0f72\u0f73\7\u01ab\2\2\u0f73\u10e9\by\1\2\u0f74\u0f75\7\u01ae"+
		"\2\2\u0f75\u10e9\by\1\2\u0f76\u0f77\7\u0190\2\2\u0f77\u10e9\by\1\2\u0f78"+
		"\u0f79\7\u01a9\2\2\u0f79\u10e9\by\1\2\u0f7a\u0f7b\7\u0185\2\2\u0f7b\u10e9"+
		"\by\1\2\u0f7c\u0f7d\7\u0187\2\2\u0f7d\u10e9\by\1\2\u0f7e\u0f7f\7\u01a0"+
		"\2\2\u0f7f\u10e9\by\1\2\u0f80\u0f81\7\u01c1\2\2\u0f81\u10e9\by\1\2\u0f82"+
		"\u0f83\7\u015e\2\2\u0f83\u10e9\by\1\2\u0f84\u0f85\7\u0152\2\2\u0f85\u10e9"+
		"\by\1\2\u0f86\u0f87\7\u01af\2\2\u0f87\u10e9\by\1\2\u0f88\u0f89\7\u01ed"+
		"\2\2\u0f89\u10e9\by\1\2\u0f8a\u0f8b\7\u01ba\2\2\u0f8b\u10e9\by\1\2\u0f8c"+
		"\u0f8d\7\u017a\2\2\u0f8d\u10e9\by\1\2\u0f8e\u0f8f\7\u0092\2\2\u0f8f\u10e9"+
		"\by\1\2\u0f90\u0f91\7\u0141\2\2\u0f91\u10e9\by\1\2\u0f92\u0f93\7\u01fb"+
		"\2\2\u0f93\u10e9\by\1\2\u0f94\u0f95\7\u01ca\2\2\u0f95\u10e9\by\1\2\u0f96"+
		"\u0f97\7\u01e4\2\2\u0f97\u10e9\by\1\2\u0f98\u0f99\7\u0196\2\2\u0f99\u10e9"+
		"\by\1\2\u0f9a\u0f9b\7\u01eb\2\2\u0f9b\u10e9\by\1\2\u0f9c\u0f9d\7\u0156"+
		"\2\2\u0f9d\u10e9\by\1\2\u0f9e\u0f9f\7\u01d7\2\2\u0f9f\u10e9\by\1\2\u0fa0"+
		"\u0fa1\7Z\2\2\u0fa1\u10e9\by\1\2\u0fa2\u0fa3\7\u0198\2\2\u0fa3\u10e9\b"+
		"y\1\2\u0fa4\u0fa5\7\u0194\2\2\u0fa5\u10e9\by\1\2\u0fa6\u0fa7\7\u01a6\2"+
		"\2\u0fa7\u10e9\by\1\2\u0fa8\u0fa9\7\u01e2\2\2\u0fa9\u10e9\by\1\2\u0faa"+
		"\u0fab\7\u01c0\2\2\u0fab\u10e9\by\1\2\u0fac\u0fad\7\u0168\2\2\u0fad\u10e9"+
		"\by\1\2\u0fae\u0faf\7\u0164\2\2\u0faf\u10e9\by\1\2\u0fb0\u0fb1\7\u01a7"+
		"\2\2\u0fb1\u10e9\by\1\2\u0fb2\u0fb3\7\u01fa\2\2\u0fb3\u10e9\by\1\2\u0fb4"+
		"\u0fb5\7\u019c\2\2\u0fb5\u10e9\by\1\2\u0fb6\u0fb7\7\u00ff\2\2\u0fb7\u10e9"+
		"\by\1\2\u0fb8\u0fb9\7\u01dc\2\2\u0fb9\u10e9\by\1\2\u0fba\u0fbb\7\u00b4"+
		"\2\2\u0fbb\u10e9\by\1\2\u0fbc\u0fbd\7\u0197\2\2\u0fbd\u10e9\by\1\2\u0fbe"+
		"\u0fbf\7\u01cc\2\2\u0fbf\u10e9\by\1\2\u0fc0\u0fc1\7\u0177\2\2\u0fc1\u10e9"+
		"\by\1\2\u0fc2\u0fc3\7\u00e5\2\2\u0fc3\u10e9\by\1\2\u0fc4\u0fc5\7\u018f"+
		"\2\2\u0fc5\u10e9\by\1\2\u0fc6\u0fc7\7\u01c8\2\2\u0fc7\u10e9\by\1\2\u0fc8"+
		"\u0fc9\7\u0151\2\2\u0fc9\u10e9\by\1\2\u0fca\u0fcb\7\u018b\2\2\u0fcb\u10e9"+
		"\by\1\2\u0fcc\u0fcd\7\u01bd\2\2\u0fcd\u10e9\by\1\2\u0fce\u0fcf\7\35\2"+
		"\2\u0fcf\u10e9\by\1\2\u0fd0\u0fd1\7\u01a1\2\2\u0fd1\u10e9\by\1\2\u0fd2"+
		"\u0fd3\7\u01d0\2\2\u0fd3\u10e9\by\1\2\u0fd4\u0fd5\7\u0179\2\2\u0fd5\u10e9"+
		"\by\1\2\u0fd6\u0fd7\7\u019b\2\2\u0fd7\u10e9\by\1\2\u0fd8\u0fd9\7\u0195"+
		"\2\2\u0fd9\u10e9\by\1\2\u0fda\u0fdb\7\u0163\2\2\u0fdb\u10e9\by\1\2\u0fdc"+
		"\u0fdd\7\u01ea\2\2\u0fdd\u10e9\by\1\2\u0fde\u0fdf\7\u01cf\2\2\u0fdf\u10e9"+
		"\by\1\2\u0fe0\u0fe1\7\u0158\2\2\u0fe1\u10e9\by\1\2\u0fe2\u0fe3\7\u00e6"+
		"\2\2\u0fe3\u10e9\by\1\2\u0fe4\u0fe5\7\u017c\2\2\u0fe5\u10e9\by\1\2\u0fe6"+
		"\u0fe7\7\u01b6\2\2\u0fe7\u10e9\by\1\2\u0fe8\u0fe9\7\u016d\2\2\u0fe9\u10e9"+
		"\by\1\2\u0fea\u0feb\7\u019e\2\2\u0feb\u10e9\by\1\2\u0fec\u0fed\7\u0107"+
		"\2\2\u0fed\u10e9\by\1\2\u0fee\u0fef\7\u01ce\2\2\u0fef\u10e9\by\1\2\u0ff0"+
		"\u0ff1\7\u0200\2\2\u0ff1\u10e9\by\1\2\u0ff2\u0ff3\7\u0169\2\2\u0ff3\u10e9"+
		"\by\1\2\u0ff4\u0ff5\7\u018a\2\2\u0ff5\u10e9\by\1\2\u0ff6\u0ff7\7\u0227"+
		"\2\2\u0ff7\u10e9\by\1\2\u0ff8\u0ff9\7\u019a\2\2\u0ff9\u10e9\by\1\2\u0ffa"+
		"\u0ffb\7\u015f\2\2\u0ffb\u10e9\by\1\2\u0ffc\u0ffd\7\u01aa\2\2\u0ffd\u10e9"+
		"\by\1\2\u0ffe\u0fff\7\u01fe\2\2\u0fff\u10e9\by\1\2\u1000\u1001\7\u01e1"+
		"\2\2\u1001\u10e9\by\1\2\u1002\u1003\7\u01b1\2\2\u1003\u10e9\by\1\2\u1004"+
		"\u1005\7\u01f6\2\2\u1005\u10e9\by\1\2\u1006\u1007\7\u01f4\2\2\u1007\u10e9"+
		"\by\1\2\u1008\u1009\7\22\2\2\u1009\u10e9\by\1\2\u100a\u100b\7\u018c\2"+
		"\2\u100b\u10e9\by\1\2\u100c\u100d\7\u01c7\2\2\u100d\u10e9\by\1\2\u100e"+
		"\u100f\7\u01b8\2\2\u100f\u10e9\by\1\2\u1010\u1011\7\u01f1\2\2\u1011\u10e9"+
		"\by\1\2\u1012\u1013\7\u0174\2\2\u1013\u10e9\by\1\2\u1014\u1015\7\u01b3"+
		"\2\2\u1015\u10e9\by\1\2\u1016\u1017\7\u01d8\2\2\u1017\u10e9\by\1\2\u1018"+
		"\u1019\7\u0172\2\2\u1019\u10e9\by\1\2\u101a\u101b\7\u01a2\2\2\u101b\u10e9"+
		"\by\1\2\u101c\u101d\7\u012d\2\2\u101d\u10e9\by\1\2\u101e\u101f\7\u01bc"+
		"\2\2\u101f\u10e9\by\1\2\u1020\u1021\7\u01d9\2\2\u1021\u10e9\by\1\2\u1022"+
		"\u1023\7\u0157\2\2\u1023\u10e9\by\1\2\u1024\u1025\7\u016a\2\2\u1025\u10e9"+
		"\by\1\2\u1026\u1027\7\u01f5\2\2\u1027\u10e9\by\1\2\u1028\u1029\7\u01e9"+
		"\2\2\u1029\u10e9\by\1\2\u102a\u102b\7\u01e6\2\2\u102b\u10e9\by\1\2\u102c"+
		"\u102d\7\u01e8\2\2\u102d\u10e9\by\1\2\u102e\u102f\7\u01d2\2\2\u102f\u10e9"+
		"\by\1\2\u1030\u1031\7\u0180\2\2\u1031\u10e9\by\1\2\u1032\u1033\7\u01d6"+
		"\2\2\u1033\u10e9\by\1\2\u1034\u1035\7\u0183\2\2\u1035\u10e9\by\1\2\u1036"+
		"\u1037\7\u0166\2\2\u1037\u10e9\by\1\2\u1038\u1039\7\u01cd\2\2\u1039\u10e9"+
		"\by\1\2\u103a\u103b\7\u019d\2\2\u103b\u10e9\by\1\2\u103c\u103d\7\u01f0"+
		"\2\2\u103d\u10e9\by\1\2\u103e\u103f\7\u0154\2\2\u103f\u10e9\by\1\2\u1040"+
		"\u1041\7\u00f2\2\2\u1041\u10e9\by\1\2\u1042\u1043\7\u0159\2\2\u1043\u10e9"+
		"\by\1\2\u1044\u1045\7\u018e\2\2\u1045\u10e9\by\1\2\u1046\u1047\7\u01b7"+
		"\2\2\u1047\u10e9\by\1\2\u1048\u1049\7\u0175\2\2\u1049\u10e9\by\1\2\u104a"+
		"\u104b\7\u01fd\2\2\u104b\u10e9\by\1\2\u104c\u104d\7\u01bb\2\2\u104d\u10e9"+
		"\by\1\2\u104e\u104f\7\u01b2\2\2\u104f\u10e9\by\1\2\u1050\u1051\7\u00cd"+
		"\2\2\u1051\u10e9\by\1\2\u1052\u1053\7\u01ef\2\2\u1053\u10e9\by\1\2\u1054"+
		"\u1055\7\u0178\2\2\u1055\u10e9\by\1\2\u1056\u1057\7\u019f\2\2\u1057\u10e9"+
		"\by\1\2\u1058\u1059\7\u01cb\2\2\u1059\u10e9\by\1\2\u105a\u105b\7\u01fc"+
		"\2\2\u105b\u10e9\by\1\2\u105c\u105d\7\u017d\2\2\u105d\u10e9\by\1\2\u105e"+
		"\u105f\7\u0155\2\2\u105f\u10e9\by\1\2\u1060\u1061\7\u01dd\2\2\u1061\u10e9"+
		"\by\1\2\u1062\u1063\7\u01e3\2\2\u1063\u10e9\by\1\2\u1064\u1065\7B\2\2"+
		"\u1065\u10e9\by\1\2\u1066\u1067\7\u01e5\2\2\u1067\u10e9\by\1\2\u1068\u1069"+
		"\7\u01d3\2\2\u1069\u10e9\by\1\2\u106a\u106b\7\u014f\2\2\u106b\u10e9\b"+
		"y\1\2\u106c\u106d\7\u0188\2\2\u106d\u10e9\by\1\2\u106e\u106f\7\u014e\2"+
		"\2\u106f\u10e9\by\1\2\u1070\u1071\7\u01d1\2\2\u1071\u10e9\by\1\2\u1072"+
		"\u1073\7\u0160\2\2\u1073\u10e9\by\1\2\u1074\u1075\7\u015a\2\2\u1075\u10e9"+
		"\by\1\2\u1076\u1077\7\u016f\2\2\u1077\u10e9\by\1\2\u1078\u1079\7\u01c9"+
		"\2\2\u1079\u10e9\by\1\2\u107a\u107b\7\u01db\2\2\u107b\u10e9\by\1\2\u107c"+
		"\u107d\7\u017e\2\2\u107d\u10e9\by\1\2\u107e\u107f\7\u017f\2\2\u107f\u10e9"+
		"\by\1\2\u1080\u1081\7\u01f2\2\2\u1081\u10e9\by\1\2\u1082\u1083\7\u01f9"+
		"\2\2\u1083\u10e9\by\1\2\u1084\u1085\7\u0170\2\2\u1085\u10e9\by\1\2\u1086"+
		"\u1087\7\u01ee\2\2\u1087\u10e9\by\1\2\u1088\u1089\7\u0191\2\2\u1089\u10e9"+
		"\by\1\2\u108a\u108b\7\u016e\2\2\u108b\u10e9\by\1\2\u108c\u108d\7\u0153"+
		"\2\2\u108d\u10e9\by\1\2\u108e\u108f\7\u01c3\2\2\u108f\u10e9\by\1\2\u1090"+
		"\u1091\7\u0161\2\2\u1091\u10e9\by\1\2\u1092\u1093\7\u01f3\2\2\u1093\u10e9"+
		"\by\1\2\u1094\u1095\7\u015b\2\2\u1095\u10e9\by\1\2\u1096\u1097\7\u01ff"+
		"\2\2\u1097\u10e9\by\1\2\u1098\u1099\7\u016c\2\2\u1099\u10e9\by\1\2\u109a"+
		"\u109b\7\u0167\2\2\u109b\u10e9\by\1\2\u109c\u109d\7\u01ad\2\2\u109d\u10e9"+
		"\by\1\2\u109e\u109f\7\u0165\2\2\u109f\u10e9\by\1\2\u10a0\u10a1\7\u01c2"+
		"\2\2\u10a1\u10e9\by\1\2\u10a2\u10a3\7\u01b4\2\2\u10a3\u10e9\by\1\2\u10a4"+
		"\u10a5\7\u01f8\2\2\u10a5\u10e9\by\1\2\u10a6\u10a7\7\u01f7\2\2\u10a7\u10e9"+
		"\by\1\2\u10a8\u10a9\7\u01a3\2\2\u10a9\u10e9\by\1\2\u10aa\u10ab\7\u01b0"+
		"\2\2\u10ab\u10e9\by\1\2\u10ac\u10ad\7\u0182\2\2\u10ad\u10e9\by\1\2\u10ae"+
		"\u10af\7\u0093\2\2\u10af\u10e9\by\1\2\u10b0\u10b1\7\u01da\2\2\u10b1\u10e9"+
		"\by\1\2\u10b2\u10b3\7\u01ac\2\2\u10b3\u10e9\by\1\2\u10b4\u10b5\7\u01e0"+
		"\2\2\u10b5\u10e9\by\1\2\u10b6\u10b7\7\u0184\2\2\u10b7\u10e9\by\1\2\u10b8"+
		"\u10b9\7\u018d\2\2\u10b9\u10e9\by\1\2\u10ba\u10bb\7\u0202\2\2\u10bb\u10e9"+
		"\by\1\2\u10bc\u10bd\7\u0203\2\2\u10bd\u10e9\by\1\2\u10be\u10bf\7\u0204"+
		"\2\2\u10bf\u10e9\by\1\2\u10c0\u10c1\7\u0205\2\2\u10c1\u10e9\by\1\2\u10c2"+
		"\u10c3\7\u0206\2\2\u10c3\u10e9\by\1\2\u10c4\u10c5\7\u0207\2\2\u10c5\u10e9"+
		"\by\1\2\u10c6\u10c7\7\u0208\2\2\u10c7\u10e9\by\1\2\u10c8\u10c9\7\u0209"+
		"\2\2\u10c9\u10e9\by\1\2\u10ca\u10cb\7\u020a\2\2\u10cb\u10e9\by\1\2\u10cc"+
		"\u10cd\7\u01b9\2\2\u10cd\u10e9\by\1\2\u10ce\u10cf\7\u01d4\2\2\u10cf\u10e9"+
		"\by\1\2\u10d0\u10d1\7\u0193\2\2\u10d1\u10e9\by\1\2\u10d2\u10d3\7\u01c5"+
		"\2\2\u10d3\u10e9\by\1\2\u10d4\u10d5\7\u020b\2\2\u10d5\u10e9\by\1\2\u10d6"+
		"\u10d7\7\u020c\2\2\u10d7\u10e9\by\1\2\u10d8\u10d9\7\u020d\2\2\u10d9\u10e9"+
		"\by\1\2\u10da\u10db\7\u020f\2\2\u10db\u10e9\by\1\2\u10dc\u10dd\7\u0210"+
		"\2\2\u10dd\u10e9\by\1\2\u10de\u10df\7\u0211\2\2\u10df\u10e9\by\1\2\u10e0"+
		"\u10e1\7\u0212\2\2\u10e1\u10e9\by\1\2\u10e2\u10e3\7\u0213\2\2\u10e3\u10e9"+
		"\by\1\2\u10e4\u10e5\7\u01de\2\2\u10e5\u10e9\by\1\2\u10e6\u10e7\7\u01df"+
		"\2\2\u10e7\u10e9\by\1\2\u10e8\u0f3e\3\2\2\2\u10e8\u0f40\3\2\2\2\u10e8"+
		"\u0f42\3\2\2\2\u10e8\u0f44\3\2\2\2\u10e8\u0f46\3\2\2\2\u10e8\u0f48\3\2"+
		"\2\2\u10e8\u0f4a\3\2\2\2\u10e8\u0f4c\3\2\2\2\u10e8\u0f4e\3\2\2\2\u10e8"+
		"\u0f50\3\2\2\2\u10e8\u0f52\3\2\2\2\u10e8\u0f54\3\2\2\2\u10e8\u0f56\3\2"+
		"\2\2\u10e8\u0f58\3\2\2\2\u10e8\u0f5a\3\2\2\2\u10e8\u0f5c\3\2\2\2\u10e8"+
		"\u0f5e\3\2\2\2\u10e8\u0f60\3\2\2\2\u10e8\u0f62\3\2\2\2\u10e8\u0f64\3\2"+
		"\2\2\u10e8\u0f66\3\2\2\2\u10e8\u0f68\3\2\2\2\u10e8\u0f6a\3\2\2\2\u10e8"+
		"\u0f6c\3\2\2\2\u10e8\u0f6e\3\2\2\2\u10e8\u0f70\3\2\2\2\u10e8\u0f72\3\2"+
		"\2\2\u10e8\u0f74\3\2\2\2\u10e8\u0f76\3\2\2\2\u10e8\u0f78\3\2\2\2\u10e8"+
		"\u0f7a\3\2\2\2\u10e8\u0f7c\3\2\2\2\u10e8\u0f7e\3\2\2\2\u10e8\u0f80\3\2"+
		"\2\2\u10e8\u0f82\3\2\2\2\u10e8\u0f84\3\2\2\2\u10e8\u0f86\3\2\2\2\u10e8"+
		"\u0f88\3\2\2\2\u10e8\u0f8a\3\2\2\2\u10e8\u0f8c\3\2\2\2\u10e8\u0f8e\3\2"+
		"\2\2\u10e8\u0f90\3\2\2\2\u10e8\u0f92\3\2\2\2\u10e8\u0f94\3\2\2\2\u10e8"+
		"\u0f96\3\2\2\2\u10e8\u0f98\3\2\2\2\u10e8\u0f9a\3\2\2\2\u10e8\u0f9c\3\2"+
		"\2\2\u10e8\u0f9e\3\2\2\2\u10e8\u0fa0\3\2\2\2\u10e8\u0fa2\3\2\2\2\u10e8"+
		"\u0fa4\3\2\2\2\u10e8\u0fa6\3\2\2\2\u10e8\u0fa8\3\2\2\2\u10e8\u0faa\3\2"+
		"\2\2\u10e8\u0fac\3\2\2\2\u10e8\u0fae\3\2\2\2\u10e8\u0fb0\3\2\2\2\u10e8"+
		"\u0fb2\3\2\2\2\u10e8\u0fb4\3\2\2\2\u10e8\u0fb6\3\2\2\2\u10e8\u0fb8\3\2"+
		"\2\2\u10e8\u0fba\3\2\2\2\u10e8\u0fbc\3\2\2\2\u10e8\u0fbe\3\2\2\2\u10e8"+
		"\u0fc0\3\2\2\2\u10e8\u0fc2\3\2\2\2\u10e8\u0fc4\3\2\2\2\u10e8\u0fc6\3\2"+
		"\2\2\u10e8\u0fc8\3\2\2\2\u10e8\u0fca\3\2\2\2\u10e8\u0fcc\3\2\2\2\u10e8"+
		"\u0fce\3\2\2\2\u10e8\u0fd0\3\2\2\2\u10e8\u0fd2\3\2\2\2\u10e8\u0fd4\3\2"+
		"\2\2\u10e8\u0fd6\3\2\2\2\u10e8\u0fd8\3\2\2\2\u10e8\u0fda\3\2\2\2\u10e8"+
		"\u0fdc\3\2\2\2\u10e8\u0fde\3\2\2\2\u10e8\u0fe0\3\2\2\2\u10e8\u0fe2\3\2"+
		"\2\2\u10e8\u0fe4\3\2\2\2\u10e8\u0fe6\3\2\2\2\u10e8\u0fe8\3\2\2\2\u10e8"+
		"\u0fea\3\2\2\2\u10e8\u0fec\3\2\2\2\u10e8\u0fee\3\2\2\2\u10e8\u0ff0\3\2"+
		"\2\2\u10e8\u0ff2\3\2\2\2\u10e8\u0ff4\3\2\2\2\u10e8\u0ff6\3\2\2\2\u10e8"+
		"\u0ff8\3\2\2\2\u10e8\u0ffa\3\2\2\2\u10e8\u0ffc\3\2\2\2\u10e8\u0ffe\3\2"+
		"\2\2\u10e8\u1000\3\2\2\2\u10e8\u1002\3\2\2\2\u10e8\u1004\3\2\2\2\u10e8"+
		"\u1006\3\2\2\2\u10e8\u1008\3\2\2\2\u10e8\u100a\3\2\2\2\u10e8\u100c\3\2"+
		"\2\2\u10e8\u100e\3\2\2\2\u10e8\u1010\3\2\2\2\u10e8\u1012\3\2\2\2\u10e8"+
		"\u1014\3\2\2\2\u10e8\u1016\3\2\2\2\u10e8\u1018\3\2\2\2\u10e8\u101a\3\2"+
		"\2\2\u10e8\u101c\3\2\2\2\u10e8\u101e\3\2\2\2\u10e8\u1020\3\2\2\2\u10e8"+
		"\u1022\3\2\2\2\u10e8\u1024\3\2\2\2\u10e8\u1026\3\2\2\2\u10e8\u1028\3\2"+
		"\2\2\u10e8\u102a\3\2\2\2\u10e8\u102c\3\2\2\2\u10e8\u102e\3\2\2\2\u10e8"+
		"\u1030\3\2\2\2\u10e8\u1032\3\2\2\2\u10e8\u1034\3\2\2\2\u10e8\u1036\3\2"+
		"\2\2\u10e8\u1038\3\2\2\2\u10e8\u103a\3\2\2\2\u10e8\u103c\3\2\2\2\u10e8"+
		"\u103e\3\2\2\2\u10e8\u1040\3\2\2\2\u10e8\u1042\3\2\2\2\u10e8\u1044\3\2"+
		"\2\2\u10e8\u1046\3\2\2\2\u10e8\u1048\3\2\2\2\u10e8\u104a\3\2\2\2\u10e8"+
		"\u104c\3\2\2\2\u10e8\u104e\3\2\2\2\u10e8\u1050\3\2\2\2\u10e8\u1052\3\2"+
		"\2\2\u10e8\u1054\3\2\2\2\u10e8\u1056\3\2\2\2\u10e8\u1058\3\2\2\2\u10e8"+
		"\u105a\3\2\2\2\u10e8\u105c\3\2\2\2\u10e8\u105e\3\2\2\2\u10e8\u1060\3\2"+
		"\2\2\u10e8\u1062\3\2\2\2\u10e8\u1064\3\2\2\2\u10e8\u1066\3\2\2\2\u10e8"+
		"\u1068\3\2\2\2\u10e8\u106a\3\2\2\2\u10e8\u106c\3\2\2\2\u10e8\u106e\3\2"+
		"\2\2\u10e8\u1070\3\2\2\2\u10e8\u1072\3\2\2\2\u10e8\u1074\3\2\2\2\u10e8"+
		"\u1076\3\2\2\2\u10e8\u1078\3\2\2\2\u10e8\u107a\3\2\2\2\u10e8\u107c\3\2"+
		"\2\2\u10e8\u107e\3\2\2\2\u10e8\u1080\3\2\2\2\u10e8\u1082\3\2\2\2\u10e8"+
		"\u1084\3\2\2\2\u10e8\u1086\3\2\2\2\u10e8\u1088\3\2\2\2\u10e8\u108a\3\2"+
		"\2\2\u10e8\u108c\3\2\2\2\u10e8\u108e\3\2\2\2\u10e8\u1090\3\2\2\2\u10e8"+
		"\u1092\3\2\2\2\u10e8\u1094\3\2\2\2\u10e8\u1096\3\2\2\2\u10e8\u1098\3\2"+
		"\2\2\u10e8\u109a\3\2\2\2\u10e8\u109c\3\2\2\2\u10e8\u109e\3\2\2\2\u10e8"+
		"\u10a0\3\2\2\2\u10e8\u10a2\3\2\2\2\u10e8\u10a4\3\2\2\2\u10e8\u10a6\3\2"+
		"\2\2\u10e8\u10a8\3\2\2\2\u10e8\u10aa\3\2\2\2\u10e8\u10ac\3\2\2\2\u10e8"+
		"\u10ae\3\2\2\2\u10e8\u10b0\3\2\2\2\u10e8\u10b2\3\2\2\2\u10e8\u10b4\3\2"+
		"\2\2\u10e8\u10b6\3\2\2\2\u10e8\u10b8\3\2\2\2\u10e8\u10ba\3\2\2\2\u10e8"+
		"\u10bc\3\2\2\2\u10e8\u10be\3\2\2\2\u10e8\u10c0\3\2\2\2\u10e8\u10c2\3\2"+
		"\2\2\u10e8\u10c4\3\2\2\2\u10e8\u10c6\3\2\2\2\u10e8\u10c8\3\2\2\2\u10e8"+
		"\u10ca\3\2\2\2\u10e8\u10cc\3\2\2\2\u10e8\u10ce\3\2\2\2\u10e8\u10d0\3\2"+
		"\2\2\u10e8\u10d2\3\2\2\2\u10e8\u10d4\3\2\2\2\u10e8\u10d6\3\2\2\2\u10e8"+
		"\u10d8\3\2\2\2\u10e8\u10da\3\2\2\2\u10e8\u10dc\3\2\2\2\u10e8\u10de\3\2"+
		"\2\2\u10e8\u10e0\3\2\2\2\u10e8\u10e2\3\2\2\2\u10e8\u10e4\3\2\2\2\u10e8"+
		"\u10e6\3\2\2\2\u10e9\u00f1\3\2\2\2\u00a5\u00fc\u0106\u0116\u012e\u014b"+
		"\u0159\u015f\u0164\u0168\u0179\u0189\u018e\u019d\u01b6\u01c4\u01ca\u01de"+
		"\u01ed\u01f9\u0202\u020a\u0216\u0234\u023e\u0244\u024c\u0251\u0257\u0265"+
		"\u026b\u0277\u0283\u028d\u029c\u02a2\u02a9\u02b5\u02bd\u02c8\u02d7\u02e2"+
		"\u02e9\u02ef\u02f6\u02fe\u030d\u031d\u0326\u032f\u0337\u033f\u0350\u0356"+
		"\u036e\u0374\u0384\u038a\u0394\u03a4\u03b6\u03c2\u03c6\u03e2\u03ee\u03f9"+
		"\u040d\u0419\u042b\u043d\u0444\u0449\u044e\u0453\u045a\u0461\u0467\u046e"+
		"\u0476\u0480\u0489\u04a2\u04b0\u04b5\u04bf\u04ca\u04cf\u04d6\u04e4\u04e9"+
		"\u04f0\u04fb\u0506\u050f\u0513\u0516\u051d\u0526\u0538\u0543\u054c\u0555"+
		"\u055a\u0561\u0569\u0570\u057a\u058e\u0593\u05a6\u05ab\u05b7\u05c5\u05fc"+
		"\u0652\u0654\u067f\u0689\u069c\u06aa\u06bd\u06e3\u06f2\u0709\u0721\u079f"+
		"\u08c4\u08d0\u08e0\u08ee\u092a\u0932\u095c\u0984\u0993\u09a2\u09b2\u09c0"+
		"\u09d5\u0a52\u0a58\u0a95\u0a9d\u0aa8\u0ab9\u0ae4\u0b2d\u0b41\u0c15\u0c21"+
		"\u0c33\u0c47\u0c51\u0c5a\u0c60\u0c68\u0c6f\u0c7e\u0c89\u0c90\u0c97\u0daf"+
		"\u0f3c\u10e8";
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