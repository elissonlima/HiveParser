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
		T__0=1, T__1=2, T__2=3, NULL_CONST=4, BOOL_LITERAL=5, T_ALL=6, T_ALTER=7, 
		T_AND=8, T_ARRAY=9, T_AS=10, T_AUTHORIZATION=11, T_BETWEEN=12, T_BIGINT=13, 
		T_BINARY=14, T_BOOLEAN=15, T_BOTH=16, T_BY=17, T_CASE=18, T_CAST=19, T_CHAR=20, 
		T_COLUMN=21, T_CONF=22, T_CREATE=23, T_CROSS=24, T_CUBE=25, T_CURRENT=26, 
		T_CURRENT_DATE=27, T_CURRENT_TIMESTAMP=28, T_CURSOR=29, T_DATABASE=30, 
		T_DATE=31, T_DECIMAL=32, T_DELETE=33, T_DESCRIBE=34, T_DISTINCT=35, T_DOUBLE=36, 
		T_DROP=37, T_ELSE=38, T_END=39, T_EXCHANGE=40, T_EXISTS=41, T_EXTENDED=42, 
		T_EXTERNAL=43, T_FALSE=44, T_FETCH=45, T_FLOAT=46, T_FOLLOWING=47, T_FOR=48, 
		T_FROM=49, T_FULL=50, T_FUNCTION=51, T_GRANT=52, T_GROUP=53, T_GROUPING=54, 
		T_HAVING=55, T_IF=56, T_IMPORT=57, T_IN=58, T_INNER=59, T_INSERT=60, T_INT=61, 
		T_INTERSECT=62, T_INTERVAL=63, T_INTO=64, T_IS=65, T_JOIN=66, T_LATERAL=67, 
		T_LEFT=68, T_LESS_W=69, T_LIKE=70, T_LOCAL=71, T_MACRO=72, T_MAP=73, T_MORE=74, 
		T_NONE=75, T_NOT=76, T_NULL=77, T_OF=78, T_ON=79, T_OR=80, T_ORDER=81, 
		T_OUT=82, T_OUTER=83, T_OVER=84, T_PARTIALSCAN=85, T_PARTITION=86, T_PERCENT=87, 
		T_PRECEDING=88, T_PRESERVE=89, T_PROCEDURE=90, T_RANGE=91, T_READS=92, 
		T_REDUCE=93, T_REVOKE=94, T_RIGHT=95, T_ROLLUP=96, T_ROW=97, T_ROWS=98, 
		T_SELECT=99, T_SET=100, T_SMALLINT=101, T_TABLE=102, T_TABLESAMPLE=103, 
		T_THEN=104, T_TIMESTAMP=105, T_TO=106, T_TRANSFORM=107, T_TRIGGER=108, 
		T_TRUE=109, T_TRUNCATE=110, T_UNBOUNDED=111, T_UNION=112, T_UNIQUEJOIN=113, 
		T_UPDATE=114, T_USER=115, T_USING=116, T_UTC_TMESTAMP=117, T_VALUES=118, 
		T_VARCHAR=119, T_WHEN=120, T_WHERE=121, T_WINDOW=122, T_WITH=123, T_COMMIT=124, 
		T_ONLY=125, T_REGEXP=126, T_RLIKE=127, T_ROLLBACK=128, T_START=129, T_CACHE=130, 
		T_CONSTRAINT=131, T_FOREIGN=132, T_PRIMARY=133, T_REFERENCES=134, T_DAYOFWEEK=135, 
		T_EXTRACT=136, T_FLOOR=137, T_INTEGER=138, T_PRECISION=139, T_VIEWS=140, 
		T_TIME=141, T_NUMERIC=142, T_SYNC=143, T_ADD_W=144, T_ADMIN=145, T_AFTER=146, 
		T_ANALYZE=147, T_ARCHIVE=148, T_ASC=149, T_AUTOCOMMIT=150, T_BEFORE=151, 
		T_BUCKET=152, T_BUCKETS=153, T_CASCADE=154, T_CHANGE=155, T_CLUSTER=156, 
		T_CLUSTERED=157, T_CLUSTERSTATUS=158, T_COLLECTION=159, T_COLUMNS=160, 
		T_COMMENT=161, T_COMPACT=162, T_COMPACTIONS=163, T_COMPUTE=164, T_CONCATENATE=165, 
		T_CONTINUE=166, T_DATA=167, T_DATABASES=168, T_DATETIME=169, T_DAY=170, 
		T_DBPROPERTIES=171, T_DEFERRED=172, T_DEFINED=173, T_DELIMITED=174, T_DEPENDENCY=175, 
		T_DESC=176, T_DIRECTORIES=177, T_DIRECTORY=178, T_DISABLE=179, T_DISTRIBUTE=180, 
		T_ELEM_TYPE=181, T_ENABLE=182, T_ESCAPED=183, T_EXCLUSIVE=184, T_EXPLAIN=185, 
		T_EXPORT=186, T_FIELDS=187, T_FILE=188, T_FILEFORMAT=189, T_FIRST=190, 
		T_FORMAT=191, T_FORMATTED=192, T_FUNCTIONS=193, T_HOLD_DDLTIME=194, T_HOUR=195, 
		T_IDXPROPERTIES=196, T_IGNORE=197, T_INDEX=198, T_INDEXES=199, T_INPATH=200, 
		T_INPUTDRIVER=201, T_INPUTFORMAT=202, T_ITEMS=203, T_JAR=204, T_KEYS=205, 
		T_KEY_TYPE=206, T_LIMIT=207, T_LINES=208, T_LOAD=209, T_LOCATION=210, 
		T_LOCK=211, T_LOCKS=212, T_LOGICAL=213, T_LONG=214, T_MAPJOIN=215, T_MATERIALIZED=216, 
		T_METADATA=217, T_MINUS=218, T_MINUTE=219, T_MONTH=220, T_MSCK=221, T_NOSCAN=222, 
		T_NO_DROP=223, T_OFFLINE=224, T_OPTION=225, T_OUTPUTDRIVER=226, T_OUTPUTFORMAT=227, 
		T_OVERWRITE=228, T_OWNER=229, T_PARTITIONED=230, T_PARTITIONS=231, T_PLUS=232, 
		T_PRETTY=233, T_PRINCIPALS=234, T_PROTECTION=235, T_PURGE=236, T_READ=237, 
		T_READONLY=238, T_REBUILD=239, T_RECORDREADER=240, T_RECORDWRITER=241, 
		T_RELOAD=242, T_RENAME=243, T_REPAIR=244, T_REPLACE=245, T_REPLICATION=246, 
		T_RESTRICT=247, T_REWRITE=248, T_ROLE=249, T_ROLES=250, T_SCHEMA=251, 
		T_SCHEMAS=252, T_SECOND=253, T_SEMI=254, T_SERDE=255, T_SERDEPROPERTIES=256, 
		T_SERVER=257, T_SETS=258, T_SHARED=259, T_SHOW=260, T_SHOW_DATABASE=261, 
		T_SKEWED=262, T_SORT=263, T_SORTED=264, T_SSL=265, T_STATISTICS=266, T_STORED=267, 
		T_STREAMTABLE=268, T_STRING=269, T_STRUCT=270, T_TABLES=271, T_TBLPROPERTIES=272, 
		T_TEMPORARY=273, T_TERMINATED=274, T_TINYINT=275, T_TOUCH=276, T_TRANSACTIONS=277, 
		T_UNARCHIVE=278, T_UNDO=279, T_UNIONTYPE=280, T_UNLOCK=281, T_UNSET=282, 
		T_UNSIGNED=283, T_URI=284, T_USE=285, T_UTC=286, T_UTCTIMESTAMP=287, T_VALUE_TYPE=288, 
		T_VIEW=289, T_WHILE=290, T_YEAR=291, T_ISOLATION=292, T_LEVEL=293, T_OFFSET=294, 
		T_SNAPSHOT=295, T_TRANSACTION=296, T_WORK=297, T_WRITE=298, T_ABORT=299, 
		T_KEY=300, T_LAST=301, T_NORELY=302, T_NOVALIDATE=303, T_NULLS=304, T_RELY=305, 
		T_VALIDATE=306, T_DETAIL=307, T_DOW=308, T_EXPRESSION=309, T_OPERATOR=310, 
		T_QUARTER=311, T_SUMMARY=312, T_VECTORIZATION=313, T_WEEK=314, T_YEARS=315, 
		T_MONTHS=316, T_WEEKS=317, T_DAYS=318, T_HOURS=319, T_MINUTES=320, T_SECONDS=321, 
		T_TIMESTAMPTZ=322, T_ZONE=323, T_COVAR_POP=324, T_BROUND=325, T_CURRENT_USER=326, 
		T_LPAD=327, T_UNHEX=328, T_PI=329, T_STAR=330, T_REGEXP_REPLACE=331, T_ASCII=332, 
		T_GET_JSON_OBJECT=333, T_COS=334, T_REGR_SXX=335, T_WIDTH_BUCKET=336, 
		T_REPEAT=337, T_ASIN=338, T_NULLIF=339, T_CONTEXT_NGRAMS=340, T_MASK_HASH=341, 
		T_PARENT=342, T_STR_TO_MAP=343, T_SIN=344, T_UNBASE64=345, T_COUNT=346, 
		T_IN_FILE=347, T_CONV=348, T_SIGN=349, T_REGR_COUNT=350, T_SQRT=351, T_REGR_INTERCEPT=352, 
		T_UNIX_TIMESTAMP=353, T_MASK_LAST_N=354, T_AES_ENCRYPT=355, T_MASK_FIRST_N=356, 
		T_REVERSE=357, T_NEXT_DAY=358, T_HISTOGRAM_NUMERIC=359, T_TRUNC=360, T_SHIFTRIGHT=361, 
		T_ADD_MONTHS=362, T_MAX=363, T_DATE_SUB=364, T_UNARY=365, T_LN=366, T_OCTET_LENGTH=367, 
		T_EXP=368, T_FIELD=369, T_NTILE=370, T_COLLECT_LIST=371, T_RTRIM=372, 
		T_LTRIM=373, T_REFLECT=374, T_SHA2=375, T_PRINTF=376, T_CEIL=377, T_CEILING=378, 
		T_CONCAT=379, T_NVL=380, T_MD5=381, T_ISNULL=382, T_ISNOTNULL=383, T_PARSE_URL=384, 
		T_CBRT=385, T_VARIANCE=386, T_VAR_POP=387, T_DEGREES=388, T_RADIANS=389, 
		T_LEAST=390, T_BUILDVERSION=391, T_SUBSTR=392, T_SUBSTRING=393, T_SIZE=394, 
		T_POSITIVE=395, T_FROM_UNIXTIME=396, T_CHR=397, T_PERCENTILE_APPROX=398, 
		T_ASSERT_TRUE=399, T_MONTHS_BETWEEN=400, T_INITCAP=401, T_ACOS=402, T_WEEKOFYEAR=403, 
		T_LAST_DAY=404, T_CHARACTER_LENGTH=405, T_SUBSTRING_INDEX=406, T_TRANSLATE=407, 
		T_LEVENSHTEIN=408, T_COVAR_SAMP=409, T_DATEDIFF=410, T_LOG=411, T_NGRAMS=412, 
		T_LENGTH=413, T_REGR_AVGX=414, T_FIND_IN_SET=415, T_XOR=416, T_NEGATIVE=417, 
		T_DATE_ADD=418, T_PARSE_URL_TUPLE=419, T_CONCAT_WS=420, T_ELT=421, T_LOGGED_IN_USER=422, 
		T_MAP_VALUES=423, T_JAVA_METHOD=424, T_MAP_KEYS=425, T_CORR=426, T_SORT_ARRAY=427, 
		T_SHIFTRIGHTUNSIGNED=428, T_AES_DECRYPT=429, T_SHA1=430, T_SHA=431, T_AVG=432, 
		T_CURRENT_DATABASE=433, T_ARRAY_CONTAINS=434, T_FROM_UTC_TIMESTAMP=435, 
		T_DECODE=436, T_ABS=437, T_EXPLODE=438, T_E=439, T_SUM=440, T_COALESCE=441, 
		T_LOWER=442, T_LCASE=443, T_ENCODE=444, T_VAR_SAMP=445, T_INLINE=446, 
		T_SPACE=447, T_HASH=448, T_ROUND=449, T_SPLIT=450, T_BASE64=451, T_TO_UTC_TIMESTAMP=452, 
		T_REGEXP_EXTRACT=453, T_CRC32=454, T_HEX=455, T_REGR_SYY=456, T_UPPER=457, 
		T_UCASE=458, T_STDDEV_POP=459, T_DATE_FORMAT=460, T_REGR_R2=461, T_ATAN=462, 
		T_MIN=463, T_POSEXPLODE=464, T_BRACKET_OP=465, T_PMOD=466, T_POW=467, 
		T_LAG=468, T_LEAD=469, T_POWER=470, T_SENTENCES=471, T_MASK_SHOW_FIRST_N=472, 
		T_SOUNDEX=473, T_SURROGATE_KEY=474, T_SHIFTLEFT=475, T_PERCENTILE=476, 
		T_TO_DATE=477, T_REGR_AVGY=478, T_RPAD=479, T_FACTORIAL=480, T_COLLECT_SET=481, 
		T_EQUAL_W=482, T_BEGINNING=483, T_VERSION=484, T_STACK=485, T_BIN=486, 
		T_TAN=487, T_TRIM=488, T_REGR_SLOPE=489, T_MASK=490, T_MASK_SHOW_LAST_N=491, 
		T_INSTR=492, T_GREATEST=493, T_REGR_SXY=494, T_FORMAT_NUMBER=495, T_LOCATE=496, 
		T_STDDEV_SAMP=497, T_RAND=498, T_LOG2=499, T_LOG10=500, T_JSON_TUPLE=501, 
		T_QUOTE=502, T_SYSDATE=503, T_XPATH=504, T_XPATH_BOOLEAN=505, T_XPATH_DOUBLE=506, 
		T_XPATH_FLOAT=507, T_XPATH_INT=508, T_XPATH_LONG=509, T_XPATH_NUMBER=510, 
		T_XPATH_SHORT=511, T_XPATH_STRING=512, T_FIELD_IN_SET=513, T_GET_JSON_OBJECTS=514, 
		T_IN_STR=515, T_NAMED_STRUCT=516, T_RANK=517, T_DENSE_RANK=518, T_ROW_NUMBER=519, 
		T_CUME_DIST=520, T_PERCENT_RANK=521, T_UNIQUE=522, T_CHECK=523, T_DEFAULT=524, 
		T_SEQUENCEFILE=525, T_TEXTFILE=526, T_RCFILE=527, T_ORC=528, T_PARQUET=529, 
		T_AVRO=530, T_JSONFILE=531, T_HIVECONF=532, T_HIVEVAR=533, T_BYTE=534, 
		T_EXIT=535, T_ADD_S=536, T_SUB_S=537, T_MULT_S=538, T_DIV_S=539, T_MOD_S=540, 
		T_COLON=541, T_COMMA=542, T_PIPE=543, T_DOT2=544, T_EQUAL=545, T_EQUAL2=546, 
		T_NOTEQUAL=547, T_NOTEQUAL2=548, T_GREATER=549, T_GREATEREQUAL=550, T_LESS=551, 
		T_LESSEQUAL=552, T_OPEN_B=553, T_OPEN_P=554, T_OPEN_SB=555, T_CLOSE_B=556, 
		T_CLOSE_P=557, T_CLOSE_SB=558, T_SEMICOLON=559, T_SHIFT_LEFT=560, T_SHIFT_RIGHT=561, 
		T_BIT_AND=562, T_BIT_OR=563, IDENTIFIER=564, INT_LITERAL=565, DECIMAL_LITERAL=566, 
		STRING_LITERAL=567, L_INT=568, L_DEC=569, L_M_COMMENT=570, L_S_COMMENT=571, 
		SPACES=572, UNEXPECTED_CHAR=573;
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
		RULE_analytic_func = 84, RULE_expr_list = 85, RULE_expr = 86, RULE_multi_expr = 87, 
		RULE_add_expr = 88, RULE_add_op_expr = 89, RULE_shift_expr = 90, RULE_shift_op_expr = 91, 
		RULE_comp_expr = 92, RULE_comp_op_expr = 93, RULE_bool_expr = 94, RULE_bool_op_expr = 95, 
		RULE_base_expr = 96, RULE_complex_types = 97, RULE_array_def = 98, RULE_map_def = 99, 
		RULE_struct_def = 100, RULE_named_struct_def = 101, RULE_str_func = 102, 
		RULE_misc_func = 103, RULE_expr_concat = 104, RULE_expr_concat_item = 105, 
		RULE_cond_func = 106, RULE_date_func = 107, RULE_dat_convrt_func = 108, 
		RULE_basic_aggr_func = 109, RULE_aggr_func = 110, RULE_tab_generate_func = 111, 
		RULE_math_func = 112, RULE_generic_function = 113, RULE_literal_values = 114, 
		RULE_ident = 115, RULE_tab_ident = 116, RULE_complex_name = 117, RULE_complex_atom_name = 118, 
		RULE_name_identifier = 119, RULE_date_literal = 120, RULE_timestamp_literal = 121, 
		RULE_set_operators_is = 122, RULE_set_operators_like = 123, RULE_set_operators_in = 124, 
		RULE_set_operators_exists = 125, RULE_unary_operator = 126, RULE_reserved_words = 127, 
		RULE_non_reserved_words = 128, RULE_function_names = 129;
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
		"expr_list", "expr", "multi_expr", "add_expr", "add_op_expr", "shift_expr", 
		"shift_op_expr", "comp_expr", "comp_op_expr", "bool_expr", "bool_op_expr", 
		"base_expr", "complex_types", "array_def", "map_def", "struct_def", "named_struct_def", 
		"str_func", "misc_func", "expr_concat", "expr_concat_item", "cond_func", 
		"date_func", "dat_convrt_func", "basic_aggr_func", "aggr_func", "tab_generate_func", 
		"math_func", "generic_function", "literal_values", "ident", "tab_ident", 
		"complex_name", "complex_atom_name", "name_identifier", "date_literal", 
		"timestamp_literal", "set_operators_is", "set_operators_like", "set_operators_in", 
		"set_operators_exists", "unary_operator", "reserved_words", "non_reserved_words", 
		"function_names"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'.'", "'!'", null, null, null, null, null, null, null, null, 
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
		null, null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
		"'%'", "':'", "','", "'||'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", 
		"'>='", "'<'", "'<='", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'", 
		"'<<'", "'>>'", "'&'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "NULL_CONST", "BOOL_LITERAL", "T_ALL", "T_ALTER", 
		"T_AND", "T_ARRAY", "T_AS", "T_AUTHORIZATION", "T_BETWEEN", "T_BIGINT", 
		"T_BINARY", "T_BOOLEAN", "T_BOTH", "T_BY", "T_CASE", "T_CAST", "T_CHAR", 
		"T_COLUMN", "T_CONF", "T_CREATE", "T_CROSS", "T_CUBE", "T_CURRENT", "T_CURRENT_DATE", 
		"T_CURRENT_TIMESTAMP", "T_CURSOR", "T_DATABASE", "T_DATE", "T_DECIMAL", 
		"T_DELETE", "T_DESCRIBE", "T_DISTINCT", "T_DOUBLE", "T_DROP", "T_ELSE", 
		"T_END", "T_EXCHANGE", "T_EXISTS", "T_EXTENDED", "T_EXTERNAL", "T_FALSE", 
		"T_FETCH", "T_FLOAT", "T_FOLLOWING", "T_FOR", "T_FROM", "T_FULL", "T_FUNCTION", 
		"T_GRANT", "T_GROUP", "T_GROUPING", "T_HAVING", "T_IF", "T_IMPORT", "T_IN", 
		"T_INNER", "T_INSERT", "T_INT", "T_INTERSECT", "T_INTERVAL", "T_INTO", 
		"T_IS", "T_JOIN", "T_LATERAL", "T_LEFT", "T_LESS_W", "T_LIKE", "T_LOCAL", 
		"T_MACRO", "T_MAP", "T_MORE", "T_NONE", "T_NOT", "T_NULL", "T_OF", "T_ON", 
		"T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", "T_PARTIALSCAN", "T_PARTITION", 
		"T_PERCENT", "T_PRECEDING", "T_PRESERVE", "T_PROCEDURE", "T_RANGE", "T_READS", 
		"T_REDUCE", "T_REVOKE", "T_RIGHT", "T_ROLLUP", "T_ROW", "T_ROWS", "T_SELECT", 
		"T_SET", "T_SMALLINT", "T_TABLE", "T_TABLESAMPLE", "T_THEN", "T_TIMESTAMP", 
		"T_TO", "T_TRANSFORM", "T_TRIGGER", "T_TRUE", "T_TRUNCATE", "T_UNBOUNDED", 
		"T_UNION", "T_UNIQUEJOIN", "T_UPDATE", "T_USER", "T_USING", "T_UTC_TMESTAMP", 
		"T_VALUES", "T_VARCHAR", "T_WHEN", "T_WHERE", "T_WINDOW", "T_WITH", "T_COMMIT", 
		"T_ONLY", "T_REGEXP", "T_RLIKE", "T_ROLLBACK", "T_START", "T_CACHE", "T_CONSTRAINT", 
		"T_FOREIGN", "T_PRIMARY", "T_REFERENCES", "T_DAYOFWEEK", "T_EXTRACT", 
		"T_FLOOR", "T_INTEGER", "T_PRECISION", "T_VIEWS", "T_TIME", "T_NUMERIC", 
		"T_SYNC", "T_ADD_W", "T_ADMIN", "T_AFTER", "T_ANALYZE", "T_ARCHIVE", "T_ASC", 
		"T_AUTOCOMMIT", "T_BEFORE", "T_BUCKET", "T_BUCKETS", "T_CASCADE", "T_CHANGE", 
		"T_CLUSTER", "T_CLUSTERED", "T_CLUSTERSTATUS", "T_COLLECTION", "T_COLUMNS", 
		"T_COMMENT", "T_COMPACT", "T_COMPACTIONS", "T_COMPUTE", "T_CONCATENATE", 
		"T_CONTINUE", "T_DATA", "T_DATABASES", "T_DATETIME", "T_DAY", "T_DBPROPERTIES", 
		"T_DEFERRED", "T_DEFINED", "T_DELIMITED", "T_DEPENDENCY", "T_DESC", "T_DIRECTORIES", 
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
		"T_ADD_S", "T_SUB_S", "T_MULT_S", "T_DIV_S", "T_MOD_S", "T_COLON", "T_COMMA", 
		"T_PIPE", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", 
		"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_OPEN_B", "T_OPEN_P", 
		"T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", "T_SHIFT_LEFT", 
		"T_SHIFT_RIGHT", "T_BIT_AND", "T_BIT_OR", "IDENTIFIER", "INT_LITERAL", 
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
			setState(260);
			((ProgramContext)_localctx).stmt_list = stmt_list();
			setState(261);
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
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				((Stmt_listContext)_localctx).stmt = stmt();
				((Stmt_listContext)_localctx).stmts.add(((Stmt_listContext)_localctx).stmt);
				setState(266);
				match(T_SEMICOLON);
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_CREATE) | (1L << T_DROP) | (1L << T_INSERT))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (T_SELECT - 99)) | (1L << (T_SET - 99)) | (1L << (T_ANALYZE - 99)))) != 0) || _la==T_USE || _la==T_EXIT );
			 
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
			setState(280);
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
				setState(274);
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
				setState(277);
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
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(T_TINYINT);
				 ((Primitive_typeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T_SMALLINT);
				 ((Primitive_typeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(T_INT);
				 ((Primitive_typeContext)_localctx).res =  "INT"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(T_BIGINT);
				 ((Primitive_typeContext)_localctx).res =  "BIGINT"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				match(T_BOOLEAN);
				 ((Primitive_typeContext)_localctx).res =  "BOOLEAN"; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				match(T_FLOAT);
				 ((Primitive_typeContext)_localctx).res =  "FLOAT"; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(294);
				match(T_DOUBLE);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PRECISION) {
					{
					setState(295);
					match(T_PRECISION);
					}
				}

				 ((Primitive_typeContext)_localctx).res =  "DOUBLE"; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(299);
				match(T_STRING);
				 ((Primitive_typeContext)_localctx).res =  "STRING"; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(301);
				match(T_BINARY);
				 ((Primitive_typeContext)_localctx).res =  "BINARY"; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(303);
				match(T_TIMESTAMP);
				 ((Primitive_typeContext)_localctx).res =  "TIMESTAMP"; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(305);
				match(T_DECIMAL);
				 ((Primitive_typeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(307);
				match(T_DECIMAL);
				setState(308);
				match(T_OPEN_P);
				setState(309);
				((Primitive_typeContext)_localctx).precision = match(INT_LITERAL);
				setState(310);
				match(T_COMMA);
				setState(311);
				((Primitive_typeContext)_localctx).scale = match(INT_LITERAL);
				setState(312);
				match(T_CLOSE_P);
				 ((Primitive_typeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(314);
				match(T_DATE);
				 ((Primitive_typeContext)_localctx).res =  "DATE"; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(316);
				match(T_VARCHAR);
				 ((Primitive_typeContext)_localctx).res =  "VARCHAR"; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(318);
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
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(T_ARRAY);
				setState(323);
				match(T_LESS);
				setState(324);
				((Complex_typeContext)_localctx).primitive_type = primitive_type();
				setState(325);
				match(T_GREATER);
				 ((Complex_typeContext)_localctx).res =  hql_array_type_spec(((Complex_typeContext)_localctx).primitive_type.res); 
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(T_MAP);
				setState(329);
				match(T_LESS);
				setState(330);
				((Complex_typeContext)_localctx).primitive_type = primitive_type();
				setState(331);
				match(T_COMMA);
				setState(332);
				((Complex_typeContext)_localctx).data_type = data_type();
				setState(333);
				match(T_GREATER);
				 ((Complex_typeContext)_localctx).res =  hql_map_type_spec(((Complex_typeContext)_localctx).primitive_type.res, ((Complex_typeContext)_localctx).data_type.res); 
				}
				break;
			case T_STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				 vector<Column_identifierContext*> column_list; vector<Data_typeContext*> data_type_list; 
				setState(337);
				match(T_STRUCT);
				setState(338);
				match(T_LESS);
				setState(339);
				((Complex_typeContext)_localctx).column_identifier = column_identifier();
				((Complex_typeContext)_localctx).column_list.add(((Complex_typeContext)_localctx).column_identifier);
				setState(340);
				match(T_COLON);
				setState(341);
				((Complex_typeContext)_localctx).data_type = data_type();
				((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(342);
					match(T_COMMA);
					setState(343);
					((Complex_typeContext)_localctx).column_identifier = column_identifier();
					((Complex_typeContext)_localctx).column_list.add(((Complex_typeContext)_localctx).column_identifier);
					setState(344);
					match(T_COLON);
					setState(345);
					((Complex_typeContext)_localctx).data_type = data_type();
					((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(352);
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
				setState(356);
				match(T_UNIONTYPE);
				setState(357);
				match(T_LESS);
				setState(358);
				((Complex_typeContext)_localctx).data_type = data_type();
				((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(359);
					match(T_COMMA);
					setState(360);
					((Complex_typeContext)_localctx).data_type = data_type();
					((Complex_typeContext)_localctx).data_type_list.add(((Complex_typeContext)_localctx).data_type);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
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
			setState(371);
			match(T_OPEN_P);
			setState(372);
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
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CHAR || _la==T_BYTE) {
				{
				setState(373);
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

			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(376);
				match(T_COMMA);
				setState(377);
				match(L_INT);
				}
			}

			setState(380);
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
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
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
				setState(385);
				((StmtContext)_localctx).ddl_stmt = ddl_stmt();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).ddl_stmt.res; 
				}
				break;
			case T_SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				((StmtContext)_localctx).variable_substitution = variable_substitution();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).variable_substitution.res; 
				}
				break;
			case T_ANALYZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				((StmtContext)_localctx).analyze_stmt = analyze_stmt();
				 ((StmtContext)_localctx).res =  ((StmtContext)_localctx).analyze_stmt.res; 
				}
				break;
			case T_EXIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
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
			setState(397);
			match(T_ANALYZE);
			setState(398);
			match(T_TABLE);
			setState(399);
			((Analyze_stmtContext)_localctx).tab_ident = tab_ident();
			setState(400);
			((Analyze_stmtContext)_localctx).opt_insert_partitions = opt_insert_partitions();
			setState(401);
			match(T_COMPUTE);
			setState(402);
			match(T_STATISTICS);
			setState(403);
			((Analyze_stmtContext)_localctx).opt_for_columns = opt_for_columns();
			setState(404);
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
			setState(411);
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
				setState(408);
				match(T_FOR);
				setState(409);
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
			setState(416);
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
				setState(414);
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
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				((Ddl_stmtContext)_localctx).create_table_stmt = create_table_stmt();
				 ((Ddl_stmtContext)_localctx).res =  ((Ddl_stmtContext)_localctx).create_table_stmt.res; 
				}
				break;
			case T_DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				((Ddl_stmtContext)_localctx).droptable_stmt = droptable_stmt();
				 ((Ddl_stmtContext)_localctx).res =  ((Ddl_stmtContext)_localctx).droptable_stmt.res; 
				}
				break;
			case T_INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				((Ddl_stmtContext)_localctx).insert_stmt = insert_stmt();
				 ((Ddl_stmtContext)_localctx).res =  ((Ddl_stmtContext)_localctx).insert_stmt.res; 
				}
				break;
			case T_USE:
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				match(T_USE);
				setState(428);
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
			setState(433);
			match(T_INSERT);
			setState(434);
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
			setState(435);
			match(T_TABLE);
			setState(436);
			((Insert_stmtContext)_localctx).tab_ident = tab_ident();
			setState(437);
			((Insert_stmtContext)_localctx).opt_insert_partitions = opt_insert_partitions();
			setState(438);
			((Insert_stmtContext)_localctx).opt_if_not_exists_flag = opt_if_not_exists_flag();
			setState(439);
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
			setState(476);
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
				setState(444);
				match(T_PARTITION);
				setState(445);
				match(T_OPEN_P);
				setState(446);
				((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
				((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
				setState(447);
				match(T_EQUAL);
				setState(448);
				((Opt_insert_partitionsContext)_localctx).literal_values = literal_values();
				((Opt_insert_partitionsContext)_localctx).col_value_list.add(((Opt_insert_partitionsContext)_localctx).literal_values);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(449);
					match(T_COMMA);
					setState(450);
					((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
					((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
					setState(451);
					match(T_EQUAL);
					setState(452);
					((Opt_insert_partitionsContext)_localctx).literal_values = literal_values();
					((Opt_insert_partitionsContext)_localctx).col_value_list.add(((Opt_insert_partitionsContext)_localctx).literal_values);
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(459);
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
				setState(463);
				match(T_PARTITION);
				setState(464);
				match(T_OPEN_P);
				setState(465);
				((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
				((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(466);
					match(T_COMMA);
					setState(467);
					((Opt_insert_partitionsContext)_localctx).name_identifier = name_identifier();
					((Opt_insert_partitionsContext)_localctx).col_name_list.add(((Opt_insert_partitionsContext)_localctx).name_identifier);
					}
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(473);
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
			setState(478);
			match(T_SET);
			setState(479);
			((Variable_substitutionContext)_localctx).opt_var_set_type = opt_var_set_type();
			setState(480);
			((Variable_substitutionContext)_localctx).system_var_identifier = system_var_identifier();
			setState(481);
			match(T_EQUAL);
			setState(482);
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
		public Complex_nameContext complex_name;
		public Base_exprContext base_expr;
		public ExprContext expr;
		public TerminalNode IDENTIFIER() { return getToken(HiveParser.IDENTIFIER, 0); }
		public Non_reserved_wordsContext non_reserved_words() {
			return getRuleContext(Non_reserved_wordsContext.class,0);
		}
		public Reserved_wordsContext reserved_words() {
			return getRuleContext(Reserved_wordsContext.class,0);
		}
		public Complex_nameContext complex_name() {
			return getRuleContext(Complex_nameContext.class,0);
		}
		public Base_exprContext base_expr() {
			return getRuleContext(Base_exprContext.class,0);
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
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				((Set_var_valueContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((Set_var_valueContext)_localctx).res =  hql_var_name_value(remove_backquotes((((Set_var_valueContext)_localctx).IDENTIFIER!=null?((Set_var_valueContext)_localctx).IDENTIFIER.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				((Set_var_valueContext)_localctx).non_reserved_words = non_reserved_words();
				 ((Set_var_valueContext)_localctx).res =  hql_var_name_value(((Set_var_valueContext)_localctx).non_reserved_words.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				((Set_var_valueContext)_localctx).reserved_words = reserved_words();
				 ((Set_var_valueContext)_localctx).res =  hql_var_name_value(((Set_var_valueContext)_localctx).reserved_words.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				((Set_var_valueContext)_localctx).complex_name = complex_name();
				 ((Set_var_valueContext)_localctx).res =  ((Set_var_valueContext)_localctx).complex_name.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(496);
				((Set_var_valueContext)_localctx).base_expr = base_expr();
				 ((Set_var_valueContext)_localctx).res =  ((Set_var_valueContext)_localctx).base_expr.res; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(499);
				((Set_var_valueContext)_localctx).expr = expr();
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
			setState(504);
			match(T__0);
			setState(505);
			match(T_OPEN_B);
			setState(506);
			((Use_varContext)_localctx).opt_var_use_type = opt_var_use_type();
			setState(507);
			((Use_varContext)_localctx).system_var_identifier = system_var_identifier();
			setState(508);
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
			setState(512);
			((System_var_identifierContext)_localctx).var_name = var_name();
			((System_var_identifierContext)_localctx).var_name_list.add(((System_var_identifierContext)_localctx).var_name);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(513);
				match(T__1);
				setState(514);
				((System_var_identifierContext)_localctx).var_name = var_name();
				((System_var_identifierContext)_localctx).var_name_list.add(((System_var_identifierContext)_localctx).var_name);
				}
				}
				setState(519);
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
			setState(529);
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
				setState(523);
				match(T_HIVECONF);
				setState(524);
				match(T_COLON);
				 ((Opt_var_set_typeContext)_localctx).res =  "HIVECONF"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				match(T_HIVEVAR);
				setState(527);
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
			setState(538);
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
				setState(532);
				match(T_HIVECONF);
				setState(533);
				match(T_COLON);
				 ((Opt_var_use_typeContext)_localctx).res =  "HIVECONF"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				match(T_HIVEVAR);
				setState(536);
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
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				((Var_nameContext)_localctx).name_identifier = name_identifier();
				 ((Var_nameContext)_localctx).res =  ((Var_nameContext)_localctx).name_identifier.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
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
			setState(548);
			match(T_DROP);
			setState(549);
			match(T_TABLE);
			setState(550);
			((Droptable_stmtContext)_localctx).opt_if_exists = opt_if_exists();
			setState(551);
			((Droptable_stmtContext)_localctx).tab_ident = tab_ident();
			setState(552);
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
			setState(558);
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
				setState(556);
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
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				match(T_CREATE);
				setState(561);
				((Create_table_stmtContext)_localctx).table_type = table_type();
				setState(562);
				match(T_TABLE);
				setState(563);
				((Create_table_stmtContext)_localctx).opt_if_not_exists_flag = opt_if_not_exists_flag();
				setState(564);
				((Create_table_stmtContext)_localctx).tab_ident = tab_ident();
				setState(565);
				((Create_table_stmtContext)_localctx).opt_column_specs = opt_column_specs();
				setState(566);
				((Create_table_stmtContext)_localctx).opt_constraint_specification = opt_constraint_specification();
				setState(567);
				((Create_table_stmtContext)_localctx).opt_comment = opt_comment();
				setState(568);
				((Create_table_stmtContext)_localctx).opt_partitioned_table = opt_partitioned_table();
				setState(569);
				((Create_table_stmtContext)_localctx).opt_clustered_by_table = opt_clustered_by_table();
				setState(570);
				((Create_table_stmtContext)_localctx).opt_skewed_by_table = opt_skewed_by_table();
				setState(571);
				((Create_table_stmtContext)_localctx).opt_row_formated = opt_row_formated();
				setState(572);
				((Create_table_stmtContext)_localctx).opt_stored_as = opt_stored_as();
				setState(573);
				((Create_table_stmtContext)_localctx).opt_location = opt_location();
				setState(574);
				((Create_table_stmtContext)_localctx).opt_table_properties = opt_table_properties();
				setState(575);
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
				setState(578);
				match(T_CREATE);
				setState(579);
				((Create_table_stmtContext)_localctx).table_type = table_type();
				setState(580);
				match(T_TABLE);
				setState(581);
				((Create_table_stmtContext)_localctx).opt_if_not_exists_flag = opt_if_not_exists_flag();
				setState(582);
				((Create_table_stmtContext)_localctx).tab_name = tab_ident();
				setState(583);
				match(T_LIKE);
				setState(584);
				((Create_table_stmtContext)_localctx).tab_like = tab_ident();
				setState(585);
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
			setState(604);
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
				setState(592);
				match(T_OPEN_P);
				setState(593);
				((Opt_column_specsContext)_localctx).column_definition = column_definition();
				((Opt_column_specsContext)_localctx).column_def_list.add(((Opt_column_specsContext)_localctx).column_definition);
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(594);
					match(T_COMMA);
					setState(595);
					((Opt_column_specsContext)_localctx).column_definition = column_definition();
					((Opt_column_specsContext)_localctx).column_def_list.add(((Opt_column_specsContext)_localctx).column_definition);
					}
					}
					setState(600);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(601);
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
			setState(617);
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
				setState(608);
				((Opt_constraint_specificationContext)_localctx).constraint_specification = constraint_specification();
				((Opt_constraint_specificationContext)_localctx).constraint_list.add(((Opt_constraint_specificationContext)_localctx).constraint_specification);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_CONSTRAINT || _la==T_PRIMARY) {
					{
					{
					setState(609);
					((Opt_constraint_specificationContext)_localctx).constraint_specification = constraint_specification();
					((Opt_constraint_specificationContext)_localctx).constraint_list.add(((Opt_constraint_specificationContext)_localctx).constraint_specification);
					}
					}
					setState(614);
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
			setState(623);
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
				setState(620);
				match(T_COMMENT);
				setState(621);
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
			setState(625);
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
			setState(643);
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
				setState(629);
				match(T_PARTITIONED);
				setState(630);
				match(T_BY);
				setState(631);
				match(T_OPEN_P);
				setState(632);
				((Opt_partitioned_tableContext)_localctx).partition_spec = partition_spec();
				((Opt_partitioned_tableContext)_localctx).partition_field_list.add(((Opt_partitioned_tableContext)_localctx).partition_spec);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(633);
					match(T_COMMA);
					setState(634);
					((Opt_partitioned_tableContext)_localctx).partition_spec = partition_spec();
					((Opt_partitioned_tableContext)_localctx).partition_field_list.add(((Opt_partitioned_tableContext)_localctx).partition_spec);
					}
					}
					setState(639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(640);
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
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				((Partition_specContext)_localctx).column_identifier = column_identifier();
				setState(646);
				((Partition_specContext)_localctx).data_type = data_type();
				 ((Partition_specContext)_localctx).res =  hql_column_definition(((Partition_specContext)_localctx).column_identifier.res, ((Partition_specContext)_localctx).data_type.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				((Partition_specContext)_localctx).column_identifier = column_identifier();
				setState(650);
				((Partition_specContext)_localctx).data_type = data_type();
				setState(651);
				match(T_COMMENT);
				setState(652);
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
			setState(677);
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
				setState(659);
				match(T_CLUSTERED);
				setState(660);
				match(T_BY);
				setState(661);
				match(T_OPEN_P);
				setState(662);
				((Opt_clustered_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_clustered_by_tableContext)_localctx).column_list.add(((Opt_clustered_by_tableContext)_localctx).column_identifier);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(663);
					match(T_COMMA);
					setState(664);
					((Opt_clustered_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_clustered_by_tableContext)_localctx).column_list.add(((Opt_clustered_by_tableContext)_localctx).column_identifier);
					}
					}
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(670);
				match(T_CLOSE_P);
				setState(671);
				((Opt_clustered_by_tableContext)_localctx).opt_sorted_by_table = opt_sorted_by_table();
				setState(672);
				match(T_INTO);
				setState(673);
				((Opt_clustered_by_tableContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(674);
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
			setState(698);
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
				setState(681);
				match(T_STORED);
				setState(682);
				match(T_BY);
				setState(683);
				match(T_OPEN_P);
				setState(684);
				((Opt_sorted_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_sorted_by_tableContext)_localctx).column_list.add(((Opt_sorted_by_tableContext)_localctx).column_identifier);
				setState(685);
				((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc = opt_sorted_by_asc_desc();
				((Opt_sorted_by_tableContext)_localctx).sort_type_list.add(((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(686);
					match(T_COMMA);
					setState(687);
					((Opt_sorted_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_sorted_by_tableContext)_localctx).column_list.add(((Opt_sorted_by_tableContext)_localctx).column_identifier);
					setState(688);
					((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc = opt_sorted_by_asc_desc();
					((Opt_sorted_by_tableContext)_localctx).sort_type_list.add(((Opt_sorted_by_tableContext)_localctx).opt_sorted_by_asc_desc);
					}
					}
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(695);
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
			setState(705);
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
				setState(701);
				match(T_ASC);
				 ((Opt_sorted_by_asc_descContext)_localctx).res =  "ASC"; 
				}
				break;
			case T_DESC:
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
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
			setState(725);
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
				setState(709);
				match(T_SKEWED);
				setState(710);
				match(T_BY);
				setState(711);
				match(T_OPEN_P);
				setState(712);
				((Opt_skewed_by_tableContext)_localctx).column_identifier = column_identifier();
				((Opt_skewed_by_tableContext)_localctx).column_list.add(((Opt_skewed_by_tableContext)_localctx).column_identifier);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(713);
					match(T_COMMA);
					setState(714);
					((Opt_skewed_by_tableContext)_localctx).column_identifier = column_identifier();
					((Opt_skewed_by_tableContext)_localctx).column_list.add(((Opt_skewed_by_tableContext)_localctx).column_identifier);
					}
					}
					setState(719);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(720);
				((Opt_skewed_by_tableContext)_localctx).opt_on_skewed = opt_on_skewed();
				setState(721);
				match(T_CLOSE_P);
				setState(722);
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
			setState(775);
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
				setState(729);
				match(T_ON);
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
				setState(743);
				match(T_ON);
				setState(744);
				match(T_OPEN_P);
				setState(745);
				match(T_OPEN_P);
				setState(746);
				((Opt_on_skewedContext)_localctx).literal_values = literal_values();
				((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(747);
					match(T_COMMA);
					setState(748);
					((Opt_on_skewedContext)_localctx).literal_values = literal_values();
					((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
					}
					}
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(754);
				match(T_CLOSE_P);
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(755);
					match(T_COMMA);
					setState(756);
					match(T_OPEN_P);
					setState(757);
					((Opt_on_skewedContext)_localctx).literal_values = literal_values();
					((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(758);
						match(T_COMMA);
						setState(759);
						((Opt_on_skewedContext)_localctx).literal_values = literal_values();
						((Opt_on_skewedContext)_localctx).values_list.add(((Opt_on_skewedContext)_localctx).literal_values);
						}
						}
						setState(764);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(765);
					match(T_CLOSE_P);
					}
					}
					setState(771);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(772);
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
			setState(782);
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
				setState(778);
				match(T_STORED);
				setState(779);
				match(T_AS);
				setState(780);
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
			setState(790);
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
				setState(785);
				match(T_ROW);
				setState(786);
				match(T_FORMAT);
				setState(787);
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
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DELIMITED:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				match(T_DELIMITED);
				setState(793);
				((Row_formatContext)_localctx).opt_field_terminated_by = opt_field_terminated_by();
				setState(794);
				((Row_formatContext)_localctx).opt_collection_items_terminated_by = opt_collection_items_terminated_by();
				setState(795);
				((Row_formatContext)_localctx).opt_map_keys_terminated_by = opt_map_keys_terminated_by();
				setState(796);
				((Row_formatContext)_localctx).opt_lines_terminated_by = opt_lines_terminated_by();
				setState(797);
				((Row_formatContext)_localctx).opt_null_defined_as = opt_null_defined_as();
				 ((Row_formatContext)_localctx).res =  hql_row_format_delimited(((Row_formatContext)_localctx).opt_field_terminated_by.res, ((Row_formatContext)_localctx).opt_collection_items_terminated_by.res, ((Row_formatContext)_localctx).opt_map_keys_terminated_by.res, ((Row_formatContext)_localctx).opt_lines_terminated_by.res, ((Row_formatContext)_localctx).opt_null_defined_as.res); 
				}
				break;
			case T_SERDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				match(T_SERDE);
				setState(801);
				((Row_formatContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				setState(802);
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
			setState(821);
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
				setState(808);
				match(T_FIELDS);
				setState(809);
				match(T_TERMINATED);
				setState(810);
				match(T_BY);
				setState(811);
				((Opt_field_terminated_byContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Opt_field_terminated_byContext)_localctx).res =  remove_quotes((((Opt_field_terminated_byContext)_localctx).STRING_LITERAL!=null?((Opt_field_terminated_byContext)_localctx).STRING_LITERAL.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				match(T_FIELDS);
				setState(814);
				match(T_TERMINATED);
				setState(815);
				match(T_BY);
				setState(816);
				((Opt_field_terminated_byContext)_localctx).delimiter = match(STRING_LITERAL);
				setState(817);
				match(T_ESCAPED);
				setState(818);
				match(T_BY);
				setState(819);
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
			setState(830);
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
				setState(824);
				match(T_COLLECTION);
				setState(825);
				match(T_ITEMS);
				setState(826);
				match(T_TERMINATED);
				setState(827);
				match(T_BY);
				setState(828);
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
			setState(839);
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
				setState(833);
				match(T_MAP);
				setState(834);
				match(T_KEYS);
				setState(835);
				match(T_TERMINATED);
				setState(836);
				match(T_BY);
				setState(837);
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
			setState(847);
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
				setState(842);
				match(T_LINES);
				setState(843);
				match(T_TERMINATED);
				setState(844);
				match(T_BY);
				setState(845);
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
			setState(855);
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
				setState(850);
				match(T_NULL);
				setState(851);
				match(T_DEFINED);
				setState(852);
				match(T_AS);
				setState(853);
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
			setState(878);
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
				setState(859);
				match(T_WITH);
				setState(860);
				match(T_SERDEPROPERTIES);
				setState(861);
				match(T_OPEN_P);
				setState(862);
				((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
				((Opt_serde_propertiesContext)_localctx).opt_name_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
				setState(863);
				match(T_EQUAL);
				setState(864);
				((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
				((Opt_serde_propertiesContext)_localctx).opt_val_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(865);
					match(T_COMMA);
					setState(866);
					((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
					((Opt_serde_propertiesContext)_localctx).opt_name_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
					setState(867);
					match(T_EQUAL);
					setState(868);
					((Opt_serde_propertiesContext)_localctx).serde_val = serde_val();
					((Opt_serde_propertiesContext)_localctx).opt_val_list.add(((Opt_serde_propertiesContext)_localctx).serde_val);
					}
					}
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(875);
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
			setState(880);
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
			setState(902);
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
				setState(884);
				match(T_STORED);
				setState(885);
				match(T_AS);
				setState(886);
				((Opt_stored_asContext)_localctx).file_format = file_format();
				 ((Opt_stored_asContext)_localctx).res =  hql_stored_as_file_format(((Opt_stored_asContext)_localctx).file_format.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(889);
				match(T_STORED);
				setState(890);
				match(T_AS);
				setState(891);
				match(T_INPUTFORMAT);
				setState(892);
				((Opt_stored_asContext)_localctx).input_format = match(STRING_LITERAL);
				setState(893);
				match(T_OUTPUTFORMAT);
				setState(894);
				((Opt_stored_asContext)_localctx).output_format = match(STRING_LITERAL);
				 ((Opt_stored_asContext)_localctx).res =  hql_stored_as_file_format((((Opt_stored_asContext)_localctx).input_format!=null?((Opt_stored_asContext)_localctx).input_format.getText():null), (((Opt_stored_asContext)_localctx).output_format!=null?((Opt_stored_asContext)_localctx).output_format.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(896);
				match(T_STORED);
				setState(897);
				match(T_BY);
				setState(898);
				((Opt_stored_asContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				setState(899);
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
			setState(908);
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
				setState(905);
				match(T_LOCATION);
				setState(906);
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
			setState(930);
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
				setState(912);
				match(T_TBLPROPERTIES);
				setState(913);
				match(T_OPEN_P);
				setState(914);
				((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
				((Opt_table_propertiesContext)_localctx).opt_name_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
				setState(915);
				match(T_EQUAL);
				setState(916);
				((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
				((Opt_table_propertiesContext)_localctx).opt_val_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(917);
					match(T_COMMA);
					setState(918);
					((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
					((Opt_table_propertiesContext)_localctx).opt_name_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
					setState(919);
					match(T_EQUAL);
					setState(920);
					((Opt_table_propertiesContext)_localctx).opt_table_val = opt_table_val();
					((Opt_table_propertiesContext)_localctx).opt_val_list.add(((Opt_table_propertiesContext)_localctx).opt_table_val);
					}
					}
					setState(926);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(927);
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
			setState(932);
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
			setState(940);
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
				setState(936);
				match(T_AS);
				setState(937);
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
			setState(956);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEQUENCEFILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				match(T_SEQUENCEFILE);
				 ((File_formatContext)_localctx).res =  "SEQUENCEFILE"; 
				}
				break;
			case T_TEXTFILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				match(T_TEXTFILE);
				 ((File_formatContext)_localctx).res =  "TEXTFILE"; 
				}
				break;
			case T_RCFILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(946);
				match(T_RCFILE);
				 ((File_formatContext)_localctx).res =  "RCFILE"; 
				}
				break;
			case T_ORC:
				enterOuterAlt(_localctx, 4);
				{
				setState(948);
				match(T_ORC);
				 ((File_formatContext)_localctx).res =  "ORC"; 
				}
				break;
			case T_PARQUET:
				enterOuterAlt(_localctx, 5);
				{
				setState(950);
				match(T_PARQUET);
				 ((File_formatContext)_localctx).res =  "PARQUET"; 
				}
				break;
			case T_AVRO:
				enterOuterAlt(_localctx, 6);
				{
				setState(952);
				match(T_AVRO);
				 ((File_formatContext)_localctx).res =  "AVRO"; 
				}
				break;
			case T_JSONFILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(954);
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
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(959);
				((Column_definitionContext)_localctx).data_type = data_type();
				 ((Column_definitionContext)_localctx).res =  hql_column_definition(((Column_definitionContext)_localctx).column_identifier.res, ((Column_definitionContext)_localctx).data_type.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(962);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(963);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(964);
				match(T_COMMENT);
				setState(965);
				((Column_definitionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Column_definitionContext)_localctx).res =  hql_column_definition(((Column_definitionContext)_localctx).column_identifier.res, ((Column_definitionContext)_localctx).data_type.res, (((Column_definitionContext)_localctx).STRING_LITERAL!=null?((Column_definitionContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				vector<Column_constraintContext*> constraint_list; 
				setState(969);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(970);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(972); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(971);
					((Column_definitionContext)_localctx).column_constraint = column_constraint();
					((Column_definitionContext)_localctx).constraint_list.add(((Column_definitionContext)_localctx).column_constraint);
					}
					}
					setState(974); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_NOT || _la==T_PRIMARY || _la==T_DISABLE || _la==T_ENABLE || ((((_la - 302)) & ~0x3f) == 0 && ((1L << (_la - 302)) & ((1L << (T_NORELY - 302)) | (1L << (T_NOVALIDATE - 302)) | (1L << (T_RELY - 302)))) != 0) || ((((_la - 522)) & ~0x3f) == 0 && ((1L << (_la - 522)) & ((1L << (T_UNIQUE - 522)) | (1L << (T_CHECK - 522)) | (1L << (T_DEFAULT - 522)))) != 0) );
				setState(976);
				match(T_COMMENT);
				setState(977);
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
				setState(981);
				((Column_definitionContext)_localctx).column_identifier = column_identifier();
				setState(982);
				((Column_definitionContext)_localctx).data_type = data_type();
				setState(984); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(983);
					((Column_definitionContext)_localctx).column_constraint = column_constraint();
					((Column_definitionContext)_localctx).constraint_list.add(((Column_definitionContext)_localctx).column_constraint);
					}
					}
					setState(986); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_NOT || _la==T_PRIMARY || _la==T_DISABLE || _la==T_ENABLE || ((((_la - 302)) & ~0x3f) == 0 && ((1L << (_la - 302)) & ((1L << (T_NORELY - 302)) | (1L << (T_NOVALIDATE - 302)) | (1L << (T_RELY - 302)))) != 0) || ((((_la - 522)) & ~0x3f) == 0 && ((1L << (_la - 522)) & ((1L << (T_UNIQUE - 522)) | (1L << (T_CHECK - 522)) | (1L << (T_DEFAULT - 522)))) != 0) );
				 
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
			setState(1018);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				match(T_PRIMARY);
				setState(993);
				match(T_KEY);
				 ((Column_constraintContext)_localctx).res =  json({"primary_key", true}); 
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(T_UNIQUE);
				 ((Column_constraintContext)_localctx).res =  json({"unique", true}); 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(997);
				match(T_NOT);
				setState(998);
				match(T_NULL);
				 ((Column_constraintContext)_localctx).res =  json({"not_null", true}); 
				}
				break;
			case T_DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1000);
				match(T_DEFAULT);
				setState(1001);
				((Column_constraintContext)_localctx).default_value = default_value();
				 ((Column_constraintContext)_localctx).res =  json({"default_value", ((Column_constraintContext)_localctx).default_value.res}); 
				}
				break;
			case T_CHECK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1004);
				match(T_CHECK);
				setState(1005);
				((Column_constraintContext)_localctx).expr = expr();
				 ((Column_constraintContext)_localctx).res =  json({"check", ((Column_constraintContext)_localctx).expr.res}); 
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1008);
				match(T_ENABLE);
				 ((Column_constraintContext)_localctx).res =  json({"enable", true}); 
				}
				break;
			case T_DISABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1010);
				match(T_DISABLE);
				 ((Column_constraintContext)_localctx).res =  json({"enable", false}); 
				}
				break;
			case T_NOVALIDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1012);
				match(T_NOVALIDATE);
				 ((Column_constraintContext)_localctx).res =  json({"novalidate", true}); 
				}
				break;
			case T_RELY:
				enterOuterAlt(_localctx, 9);
				{
				setState(1014);
				match(T_RELY);
				 ((Column_constraintContext)_localctx).res =  json({"rely", true}); 
				}
				break;
			case T_NORELY:
				enterOuterAlt(_localctx, 10);
				{
				setState(1016);
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
			setState(1030);
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
				setState(1020);
				literal_values();
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				match(T_CURRENT_USER);
				setState(1022);
				match(T_OPEN_P);
				setState(1023);
				match(T_CLOSE_P);
				}
				break;
			case T_CURRENT_DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1024);
				match(T_CURRENT_DATE);
				setState(1025);
				match(T_OPEN_P);
				setState(1026);
				match(T_CLOSE_P);
				}
				break;
			case T_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(1027);
				match(T_CURRENT_TIMESTAMP);
				setState(1028);
				match(T_OPEN_P);
				setState(1029);
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
			setState(1109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				vector<Column_identifierContext*> column_list; 
				setState(1033);
				match(T_PRIMARY);
				setState(1034);
				match(T_KEY);
				setState(1035);
				match(T_OPEN_P);
				setState(1036);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1037);
					match(T_COMMA);
					setState(1038);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(1043);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1044);
				match(T_CLOSE_P);
				setState(1045);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(1046);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(1047);
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
				setState(1051);
				match(T_CONSTRAINT);
				setState(1052);
				name_identifier();
				setState(1053);
				match(T_FOREIGN);
				setState(1054);
				match(T_KEY);
				setState(1055);
				match(T_OPEN_P);
				setState(1056);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1057);
					match(T_COMMA);
					setState(1058);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1064);
				match(T_CLOSE_P);
				setState(1065);
				match(T_REFERENCES);
				setState(1066);
				((Constraint_specificationContext)_localctx).tab_ident = tab_ident();
				setState(1067);
				match(T_OPEN_P);
				setState(1068);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).ref_column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1069);
					match(T_COMMA);
					setState(1070);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).ref_column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(1075);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1076);
				match(T_CLOSE_P);
				setState(1077);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(1078);
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
				setState(1082);
				match(T_CONSTRAINT);
				setState(1083);
				name_identifier();
				setState(1084);
				match(T_UNIQUE);
				setState(1085);
				match(T_OPEN_P);
				setState(1086);
				((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
				((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1087);
					match(T_COMMA);
					setState(1088);
					((Constraint_specificationContext)_localctx).column_identifier = column_identifier();
					((Constraint_specificationContext)_localctx).column_list.add(((Constraint_specificationContext)_localctx).column_identifier);
					}
					}
					setState(1093);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1094);
				match(T_CLOSE_P);
				setState(1095);
				((Constraint_specificationContext)_localctx).opt_constraint_disable = opt_constraint_disable();
				setState(1096);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(1097);
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
				setState(1100);
				match(T_CONSTRAINT);
				setState(1101);
				name_identifier();
				setState(1102);
				match(T_CHECK);
				setState(1103);
				((Constraint_specificationContext)_localctx).expr = expr();
				setState(1104);
				((Constraint_specificationContext)_localctx).opt_constraint_enable_disable = opt_constraint_enable_disable();
				setState(1105);
				((Constraint_specificationContext)_localctx).opt_constraint_novalidate = opt_constraint_novalidate();
				setState(1106);
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
			setState(1116);
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
				setState(1112);
				match(T_ENABLE);
				 ((Opt_constraint_enable_disableContext)_localctx).res =  "ENABLE"; 
				}
				break;
			case T_DISABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1114);
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
			setState(1121);
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
				setState(1119);
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
			setState(1126);
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
				setState(1124);
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
			setState(1131);
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
				setState(1129);
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
			setState(1138);
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
				setState(1134);
				match(T_RELY);
				 ((Opt_constraint_rely_no_relyContext)_localctx).res =  "RELY"; 
				}
				break;
			case T_NORELY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1136);
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
			setState(1145);
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
				setState(1141);
				match(T_IF);
				setState(1142);
				match(T_NOT);
				setState(1143);
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
			setState(1151);
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
				setState(1148);
				match(T_IF);
				setState(1149);
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
			setState(1158);
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
				setState(1154);
				match(T_EXTERNAL);
				 ((Table_typeContext)_localctx).res =  "EXTERNAL"; 
				}
				break;
			case T_TEMPORARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1156);
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
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				((Full_select_stmtContext)_localctx).select_stmt = select_stmt();
				 ((Full_select_stmtContext)_localctx).res =  ((Full_select_stmtContext)_localctx).select_stmt.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
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
			setState(1169);
			((Select_union_stmtContext)_localctx).base_select = select_stmt();
			setState(1174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1170);
				match(T_UNION);
				setState(1171);
				((Select_union_stmtContext)_localctx).select_union_type = select_union_type();
				((Select_union_stmtContext)_localctx).union_type_list.add(((Select_union_stmtContext)_localctx).select_union_type);
				setState(1172);
				((Select_union_stmtContext)_localctx).select_stmt = select_stmt();
				((Select_union_stmtContext)_localctx).select_stmt_list.add(((Select_union_stmtContext)_localctx).select_stmt);
				}
				}
				setState(1176); 
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
			setState(1185);
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
				setState(1181);
				match(T_ALL);
				 ((Select_union_typeContext)_localctx).res =  "ALL"; 
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1183);
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
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1187);
				match(T_SELECT);
				setState(1188);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1189);
				((Select_stmtContext)_localctx).select_expr_list = select_expr_list();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).select_expr_list.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				match(T_SELECT);
				setState(1193);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1194);
				((Select_stmtContext)_localctx).tab_generate_func = tab_generate_func();
				 ((Select_stmtContext)_localctx).res =  hql_select_stmt(((Select_stmtContext)_localctx).select_all_distinct.res, ((Select_stmtContext)_localctx).tab_generate_func.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1197);
				match(T_SELECT);
				setState(1198);
				((Select_stmtContext)_localctx).select_all_distinct = select_all_distinct();
				setState(1199);
				((Select_stmtContext)_localctx).select_expr_list = select_expr_list();
				setState(1200);
				match(T_FROM);
				setState(1201);
				((Select_stmtContext)_localctx).table_reference = table_reference();
				setState(1202);
				((Select_stmtContext)_localctx).opt_lateral_view_expr = opt_lateral_view_expr();
				setState(1203);
				((Select_stmtContext)_localctx).opt_where_expr = opt_where_expr();
				setState(1204);
				((Select_stmtContext)_localctx).opt_group_by_list = opt_group_by_list();
				setState(1205);
				((Select_stmtContext)_localctx).opt_having_expr = opt_having_expr();
				setState(1206);
				((Select_stmtContext)_localctx).opt_order_by_list = opt_order_by_list();
				setState(1207);
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
			setState(1229);
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
				setState(1214);
				match(T_LATERAL);
				setState(1215);
				match(T_VIEW);
				setState(1216);
				((Opt_lateral_view_exprContext)_localctx).tab_generate_func = tab_generate_func();
				setState(1217);
				((Opt_lateral_view_exprContext)_localctx).tab_alias = column_identifier();
				setState(1218);
				match(T_AS);
				setState(1219);
				((Opt_lateral_view_exprContext)_localctx).column_identifier = column_identifier();
				((Opt_lateral_view_exprContext)_localctx).column_alias_list.add(((Opt_lateral_view_exprContext)_localctx).column_identifier);
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1220);
					match(T_COMMA);
					setState(1221);
					((Opt_lateral_view_exprContext)_localctx).column_identifier = column_identifier();
					((Opt_lateral_view_exprContext)_localctx).column_alias_list.add(((Opt_lateral_view_exprContext)_localctx).column_identifier);
					}
					}
					setState(1226);
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
			setState(1231);
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
			setState(1239);
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
				setState(1235);
				match(T_WHERE);
				setState(1236);
				((Opt_where_exprContext)_localctx).expr = expr();
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
			setState(1255);
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
				setState(1243);
				match(T_GROUP);
				setState(1244);
				match(T_BY);
				setState(1245);
				((Opt_group_by_listContext)_localctx).expr = expr();
				((Opt_group_by_listContext)_localctx).expr_group_by_list.add(((Opt_group_by_listContext)_localctx).expr);
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1246);
					match(T_COMMA);
					setState(1247);
					((Opt_group_by_listContext)_localctx).expr = expr();
					((Opt_group_by_listContext)_localctx).expr_group_by_list.add(((Opt_group_by_listContext)_localctx).expr);
					}
					}
					setState(1252);
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
			setState(1262);
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
				setState(1258);
				match(T_HAVING);
				setState(1259);
				((Opt_having_exprContext)_localctx).expr = expr();
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
			setState(1281);
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
				setState(1266);
				match(T_ORDER);
				setState(1267);
				match(T_BY);
				setState(1268);
				((Opt_order_by_listContext)_localctx).ident = ident();
				((Opt_order_by_listContext)_localctx).order_by_ident_list.add(((Opt_order_by_listContext)_localctx).ident);
				setState(1269);
				((Opt_order_by_listContext)_localctx).opt_order_by_mode = opt_order_by_mode();
				((Opt_order_by_listContext)_localctx).order_mode_list.add(((Opt_order_by_listContext)_localctx).opt_order_by_mode);
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1270);
					match(T_COMMA);
					setState(1271);
					((Opt_order_by_listContext)_localctx).ident = ident();
					((Opt_order_by_listContext)_localctx).order_by_ident_list.add(((Opt_order_by_listContext)_localctx).ident);
					setState(1272);
					((Opt_order_by_listContext)_localctx).opt_order_by_mode = opt_order_by_mode();
					((Opt_order_by_listContext)_localctx).order_mode_list.add(((Opt_order_by_listContext)_localctx).opt_order_by_mode);
					}
					}
					setState(1278);
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
			setState(1288);
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
				setState(1284);
				match(T_ASC);
				 ((Opt_order_by_modeContext)_localctx).res =  "ASC"; 
				}
				break;
			case T_DESC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1286);
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
			setState(1299);
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
				setState(1291);
				match(T_LIMIT);
				setState(1292);
				((Opt_limitContext)_localctx).rows = match(INT_LITERAL);
				 ((Opt_limitContext)_localctx).res =  hql_select_limit_clause((((Opt_limitContext)_localctx).rows!=null?((Opt_limitContext)_localctx).rows.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1294);
				match(T_LIMIT);
				setState(1295);
				((Opt_limitContext)_localctx).offset = match(INT_LITERAL);
				setState(1296);
				match(T_COMMA);
				setState(1297);
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
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				 ((Table_referenceContext)_localctx).res =  ((Table_referenceContext)_localctx).table_factor.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				vector<Table_factorContext*> table_factor_list; 
				setState(1305);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				((Table_referenceContext)_localctx).table_factor_list.add(((Table_referenceContext)_localctx).table_factor);
				setState(1308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1306);
					match(T_COMMA);
					setState(1307);
					((Table_referenceContext)_localctx).table_factor = table_factor();
					((Table_referenceContext)_localctx).table_factor_list.add(((Table_referenceContext)_localctx).table_factor);
					}
					}
					setState(1310); 
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
				setState(1315);
				((Table_referenceContext)_localctx).table_factor = table_factor();
				setState(1317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1316);
					((Table_referenceContext)_localctx).join_table = join_table();
					((Table_referenceContext)_localctx).join_table_list.add(((Table_referenceContext)_localctx).join_table);
					}
					}
					setState(1319); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_CROSS) | (1L << T_FULL) | (1L << T_INNER))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T_JOIN - 66)) | (1L << (T_LEFT - 66)) | (1L << (T_RIGHT - 66)))) != 0) );

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
			setState(1360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1325);
					match(T_INNER);
					}
				}

				setState(1328);
				match(T_JOIN);
				setState(1329);
				((Join_tableContext)_localctx).table_factor = table_factor();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("INNER", ((Join_tableContext)_localctx).table_factor.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1332);
					match(T_INNER);
					}
				}

				setState(1335);
				match(T_JOIN);
				setState(1336);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1337);
				((Join_tableContext)_localctx).join_condition = join_condition();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("INNER", ((Join_tableContext)_localctx).table_factor.res, ((Join_tableContext)_localctx).join_condition.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1340);
				((Join_tableContext)_localctx).j_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (T_FULL - 50)) | (1L << (T_LEFT - 50)) | (1L << (T_RIGHT - 50)))) != 0)) ) {
					((Join_tableContext)_localctx).j_type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1341);
					match(T_OUTER);
					}
				}

				setState(1344);
				match(T_JOIN);
				setState(1345);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1346);
				((Join_tableContext)_localctx).join_condition = join_condition();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table((((Join_tableContext)_localctx).j_type!=null?((Join_tableContext)_localctx).j_type.getText():null), ((Join_tableContext)_localctx).table_factor.res, ((Join_tableContext)_localctx).join_condition.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1349);
				match(T_CROSS);
				setState(1350);
				match(T_JOIN);
				setState(1351);
				((Join_tableContext)_localctx).table_factor = table_factor();
				 ((Join_tableContext)_localctx).res =  hql_stmt_join_table("CROSS", ((Join_tableContext)_localctx).table_factor.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1354);
				match(T_CROSS);
				setState(1355);
				match(T_JOIN);
				setState(1356);
				((Join_tableContext)_localctx).table_factor = table_factor();
				setState(1357);
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
			setState(1362);
			match(T_ON);
			setState(1363);
			((Join_conditionContext)_localctx).expr = expr();
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
			setState(1394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1366);
				((Table_factorContext)_localctx).tab_ident = tab_ident();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).tab_ident.res, "DEFAULT"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1369);
				((Table_factorContext)_localctx).tab_ident = tab_ident();
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1370);
					match(T_AS);
					}
				}

				setState(1373);
				((Table_factorContext)_localctx).name_identifier = name_identifier();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).tab_ident.res, ((Table_factorContext)_localctx).name_identifier.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1376);
				match(T_OPEN_P);
				setState(1377);
				((Table_factorContext)_localctx).select_union_stmt = select_union_stmt();
				setState(1378);
				match(T_CLOSE_P);
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1379);
					match(T_AS);
					}
				}

				setState(1382);
				((Table_factorContext)_localctx).name_identifier = name_identifier();
				 ((Table_factorContext)_localctx).res = hql_stmt_table_ref(((Table_factorContext)_localctx).select_union_stmt.res, ((Table_factorContext)_localctx).name_identifier.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1385);
				match(T_OPEN_P);
				setState(1386);
				((Table_factorContext)_localctx).select_stmt = select_stmt();
				setState(1387);
				match(T_CLOSE_P);
				setState(1389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1388);
					match(T_AS);
					}
				}

				setState(1391);
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
			setState(1401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
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
			case T_ADD_S:
			case T_SUB_S:
			case T_MULT_S:
			case T_EQUAL:
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
				setState(1397);
				match(T_ALL);
				 ((Select_all_distinctContext)_localctx).res =  "ALL"; 
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1399);
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
			setState(1404);
			((Select_expr_listContext)_localctx).select_expr = select_expr();
			((Select_expr_listContext)_localctx).exprs.add(((Select_expr_listContext)_localctx).select_expr);
			setState(1409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1405);
				match(T_COMMA);
				setState(1406);
				((Select_expr_listContext)_localctx).select_expr = select_expr();
				((Select_expr_listContext)_localctx).exprs.add(((Select_expr_listContext)_localctx).select_expr);
				}
				}
				setState(1411);
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
		public TerminalNode T_MULT_S() { return getToken(HiveParser.T_MULT_S, 0); }
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
			setState(1451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1414);
				((Select_exprContext)_localctx).expr = expr();
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1415);
					match(T_AS);
					}
				}

				setState(1418);
				((Select_exprContext)_localctx).name_identifier = name_identifier();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res, ((Select_exprContext)_localctx).name_identifier.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
				((Select_exprContext)_localctx).expr = expr();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1424);
				((Select_exprContext)_localctx).expr = expr();
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1425);
					match(T_AS);
					}
				}

				setState(1428);
				((Select_exprContext)_localctx).name_identifier = name_identifier();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res, ((Select_exprContext)_localctx).name_identifier.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1431);
				((Select_exprContext)_localctx).expr = expr();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1434);
				match(T_MULT_S);
				 ((Select_exprContext)_localctx).res =  hql_select_all_expr(); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1436);
				((Select_exprContext)_localctx).name_identifier = name_identifier();
				setState(1437);
				match(T__1);
				setState(1438);
				match(T_MULT_S);
				 ((Select_exprContext)_localctx).res =  hql_select_all_expr(((Select_exprContext)_localctx).name_identifier.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1441);
				((Select_exprContext)_localctx).over_clause = over_clause();
				 ((Select_exprContext)_localctx).res =  hql_select_expr(((Select_exprContext)_localctx).over_clause.res, "DEFAULT"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1444);
				((Select_exprContext)_localctx).over_clause = over_clause();
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1445);
					match(T_AS);
					}
				}

				setState(1448);
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
			setState(1453);
			((Over_clauseContext)_localctx).over_func = over_func();
			setState(1454);
			match(T_OVER);
			setState(1455);
			match(T_OPEN_P);
			setState(1456);
			((Over_clauseContext)_localctx).opt_partitions_by_list = opt_partitions_by_list();
			setState(1457);
			((Over_clauseContext)_localctx).opt_order_by_list = opt_order_by_list();
			setState(1458);
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
			setState(1475);
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
				setState(1463);
				match(T_PARTITION);
				setState(1464);
				match(T_BY);
				setState(1465);
				((Opt_partitions_by_listContext)_localctx).ident = ident();
				((Opt_partitions_by_listContext)_localctx).ident_cntxt_list.add(((Opt_partitions_by_listContext)_localctx).ident);
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1466);
					match(T_COMMA);
					setState(1467);
					((Opt_partitions_by_listContext)_localctx).ident = ident();
					((Opt_partitions_by_listContext)_localctx).ident_cntxt_list.add(((Opt_partitions_by_listContext)_localctx).ident);
					}
					}
					setState(1472);
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
			setState(1487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COUNT:
			case T_MAX:
			case T_AVG:
			case T_SUM:
			case T_MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477);
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
				setState(1480);
				((Over_funcContext)_localctx).analytic_func = analytic_func();
				 ((Over_funcContext)_localctx).res =  ((Over_funcContext)_localctx).analytic_func.res; 
				}
				break;
			case T_LAG:
			case T_LEAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1483);
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
				setState(1484);
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
			setState(1489);
			((Analytic_funcContext)_localctx).func_name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 517)) & ~0x3f) == 0 && ((1L << (_la - 517)) & ((1L << (T_RANK - 517)) | (1L << (T_DENSE_RANK - 517)) | (1L << (T_ROW_NUMBER - 517)) | (1L << (T_CUME_DIST - 517)) | (1L << (T_PERCENT_RANK - 517)))) != 0)) ) {
				((Analytic_funcContext)_localctx).func_name = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1490);
			match(T_OPEN_P);
			setState(1491);
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
			setState(1495);
			match(T_OPEN_P);
			setState(1496);
			((Expr_listContext)_localctx).expr = expr();
			((Expr_listContext)_localctx).exprs.add(((Expr_listContext)_localctx).expr);
			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1497);
				match(T_COMMA);
				setState(1498);
				((Expr_listContext)_localctx).expr = expr();
				((Expr_listContext)_localctx).exprs.add(((Expr_listContext)_localctx).expr);
				}
				}
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1504);
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
		public Bool_exprContext bool_expr;
		public ExprContext expr;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_expr);
		try {
			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				((ExprContext)_localctx).bool_expr = bool_expr();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).bool_expr.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				match(T_OPEN_P);
				setState(1511);
				((ExprContext)_localctx).expr = expr();
				setState(1512);
				match(T_CLOSE_P);
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr.res; 
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

	public static class Multi_exprContext extends ParserRuleContext {
		public json res;
		public Multi_exprContext left_op;
		public Base_exprContext base_expr;
		public Token op;
		public Base_exprContext right_op;
		public Base_exprContext base_expr() {
			return getRuleContext(Base_exprContext.class,0);
		}
		public Multi_exprContext multi_expr() {
			return getRuleContext(Multi_exprContext.class,0);
		}
		public TerminalNode T_MULT_S() { return getToken(HiveParser.T_MULT_S, 0); }
		public TerminalNode T_DIV_S() { return getToken(HiveParser.T_DIV_S, 0); }
		public TerminalNode T_MOD_S() { return getToken(HiveParser.T_MOD_S, 0); }
		public Multi_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_expr; }
	}

	public final Multi_exprContext multi_expr() throws RecognitionException {
		return multi_expr(0);
	}

	private Multi_exprContext multi_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multi_exprContext _localctx = new Multi_exprContext(_ctx, _parentState);
		Multi_exprContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_multi_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1518);
			((Multi_exprContext)_localctx).base_expr = base_expr();
			 ((Multi_exprContext)_localctx).res =  ((Multi_exprContext)_localctx).base_expr.res; 
			}
			_ctx.stop = _input.LT(-1);
			setState(1528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Multi_exprContext(_parentctx, _parentState);
					_localctx.left_op = _prevctx;
					_localctx.left_op = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multi_expr);
					setState(1521);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1522);
					((Multi_exprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 538)) & ~0x3f) == 0 && ((1L << (_la - 538)) & ((1L << (T_MULT_S - 538)) | (1L << (T_DIV_S - 538)) | (1L << (T_MOD_S - 538)))) != 0)) ) {
						((Multi_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1523);
					((Multi_exprContext)_localctx).right_op = ((Multi_exprContext)_localctx).base_expr = base_expr();
					 ((Multi_exprContext)_localctx).res =  hql_math_operator((((Multi_exprContext)_localctx).op!=null?((Multi_exprContext)_localctx).op.getText():null), ((Multi_exprContext)_localctx).left_op.res, ((Multi_exprContext)_localctx).right_op.res); 
					}
					} 
				}
				setState(1530);
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

	public static class Add_exprContext extends ParserRuleContext {
		public json res;
		public Multi_exprContext left_op;
		public Add_op_exprContext add_op_expr;
		public List<Add_op_exprContext> operators = new ArrayList<Add_op_exprContext>();
		public Multi_exprContext multi_expr;
		public List<Multi_exprContext> multi_expr_list = new ArrayList<Multi_exprContext>();
		public List<Multi_exprContext> multi_expr() {
			return getRuleContexts(Multi_exprContext.class);
		}
		public Multi_exprContext multi_expr(int i) {
			return getRuleContext(Multi_exprContext.class,i);
		}
		public List<Add_op_exprContext> add_op_expr() {
			return getRuleContexts(Add_op_exprContext.class);
		}
		public Add_op_exprContext add_op_expr(int i) {
			return getRuleContext(Add_op_exprContext.class,i);
		}
		public Add_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expr; }
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_add_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			vector<Multi_exprContext*> multi_expr_list; vector<Add_op_exprContext*> operators; 
			setState(1532);
			((Add_exprContext)_localctx).left_op = multi_expr(0);
			setState(1538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1533);
					((Add_exprContext)_localctx).add_op_expr = add_op_expr();
					((Add_exprContext)_localctx).operators.add(((Add_exprContext)_localctx).add_op_expr);
					setState(1534);
					((Add_exprContext)_localctx).multi_expr = multi_expr(0);
					((Add_exprContext)_localctx).multi_expr_list.add(((Add_exprContext)_localctx).multi_expr);
					}
					} 
				}
				setState(1540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			 
			        if(((Add_exprContext)_localctx).multi_expr_list.size() == 0)
			            ((Add_exprContext)_localctx).res =  ((Add_exprContext)_localctx).left_op.res;
			        else
			        {
			            json result = hql_math_operator(((Add_exprContext)_localctx).operators[0]->res, ((Add_exprContext)_localctx).left_op.res, ((Add_exprContext)_localctx).multi_expr_list[0]->res);
			            for(int i = 1 ; i < ((Add_exprContext)_localctx).multi_expr_list.size(); i++)
			               result = hql_math_operator(((Add_exprContext)_localctx).operators[i]->res, result, ((Add_exprContext)_localctx).multi_expr_list[i]->res);
			            ((Add_exprContext)_localctx).res =  result;
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

	public static class Add_op_exprContext extends ParserRuleContext {
		public string res;
		public Token T_ADD_S;
		public Token T_SUB_S;
		public TerminalNode T_ADD_S() { return getToken(HiveParser.T_ADD_S, 0); }
		public TerminalNode T_SUB_S() { return getToken(HiveParser.T_SUB_S, 0); }
		public Add_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op_expr; }
	}

	public final Add_op_exprContext add_op_expr() throws RecognitionException {
		Add_op_exprContext _localctx = new Add_op_exprContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_add_op_expr);
		try {
			setState(1547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ADD_S:
				enterOuterAlt(_localctx, 1);
				{
				setState(1543);
				((Add_op_exprContext)_localctx).T_ADD_S = match(T_ADD_S);
				 ((Add_op_exprContext)_localctx).res =  (((Add_op_exprContext)_localctx).T_ADD_S!=null?((Add_op_exprContext)_localctx).T_ADD_S.getText():null); 
				}
				break;
			case T_SUB_S:
				enterOuterAlt(_localctx, 2);
				{
				setState(1545);
				((Add_op_exprContext)_localctx).T_SUB_S = match(T_SUB_S);
				 ((Add_op_exprContext)_localctx).res =  (((Add_op_exprContext)_localctx).T_SUB_S!=null?((Add_op_exprContext)_localctx).T_SUB_S.getText():null); 
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

	public static class Shift_exprContext extends ParserRuleContext {
		public json res;
		public Add_exprContext left_expr;
		public Shift_op_exprContext shift_op_expr;
		public List<Shift_op_exprContext> operators = new ArrayList<Shift_op_exprContext>();
		public Add_exprContext add_expr;
		public List<Add_exprContext> add_expr_list = new ArrayList<Add_exprContext>();
		public List<Add_exprContext> add_expr() {
			return getRuleContexts(Add_exprContext.class);
		}
		public Add_exprContext add_expr(int i) {
			return getRuleContext(Add_exprContext.class,i);
		}
		public List<Shift_op_exprContext> shift_op_expr() {
			return getRuleContexts(Shift_op_exprContext.class);
		}
		public Shift_op_exprContext shift_op_expr(int i) {
			return getRuleContext(Shift_op_exprContext.class,i);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_shift_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			vector<Add_exprContext*> add_expr_list; vector<Shift_op_exprContext*> operators; 
			setState(1550);
			((Shift_exprContext)_localctx).left_expr = add_expr();
			setState(1556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1551);
					((Shift_exprContext)_localctx).shift_op_expr = shift_op_expr();
					((Shift_exprContext)_localctx).operators.add(((Shift_exprContext)_localctx).shift_op_expr);
					setState(1552);
					((Shift_exprContext)_localctx).add_expr = add_expr();
					((Shift_exprContext)_localctx).add_expr_list.add(((Shift_exprContext)_localctx).add_expr);
					}
					} 
				}
				setState(1558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			 
			        if(((Shift_exprContext)_localctx).add_expr_list.size() == 0)
			            ((Shift_exprContext)_localctx).res =  ((Shift_exprContext)_localctx).left_expr.res;
			        else
			        {
			            json result = hql_bool_operator(((Shift_exprContext)_localctx).operators[0]->res, ((Shift_exprContext)_localctx).left_expr.res, ((Shift_exprContext)_localctx).add_expr_list[0]->res);
			            for(int i = 1 ; i < ((Shift_exprContext)_localctx).add_expr_list.size(); i++)
			               result = hql_bool_operator(((Shift_exprContext)_localctx).operators[i]->res, result, ((Shift_exprContext)_localctx).add_expr_list[i]->res);
			            ((Shift_exprContext)_localctx).res =  result;
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

	public static class Shift_op_exprContext extends ParserRuleContext {
		public string res;
		public Token T_SHIFT_LEFT;
		public Token T_SHIFT_RIGHT;
		public Token T_BIT_AND;
		public Token T_BIT_OR;
		public TerminalNode T_SHIFT_LEFT() { return getToken(HiveParser.T_SHIFT_LEFT, 0); }
		public TerminalNode T_SHIFT_RIGHT() { return getToken(HiveParser.T_SHIFT_RIGHT, 0); }
		public TerminalNode T_BIT_AND() { return getToken(HiveParser.T_BIT_AND, 0); }
		public TerminalNode T_BIT_OR() { return getToken(HiveParser.T_BIT_OR, 0); }
		public Shift_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_op_expr; }
	}

	public final Shift_op_exprContext shift_op_expr() throws RecognitionException {
		Shift_op_exprContext _localctx = new Shift_op_exprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_shift_op_expr);
		try {
			setState(1569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SHIFT_LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				((Shift_op_exprContext)_localctx).T_SHIFT_LEFT = match(T_SHIFT_LEFT);
				 ((Shift_op_exprContext)_localctx).res =  (((Shift_op_exprContext)_localctx).T_SHIFT_LEFT!=null?((Shift_op_exprContext)_localctx).T_SHIFT_LEFT.getText():null); 
				}
				break;
			case T_SHIFT_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				((Shift_op_exprContext)_localctx).T_SHIFT_RIGHT = match(T_SHIFT_RIGHT);
				 ((Shift_op_exprContext)_localctx).res =  (((Shift_op_exprContext)_localctx).T_SHIFT_RIGHT!=null?((Shift_op_exprContext)_localctx).T_SHIFT_RIGHT.getText():null); 
				}
				break;
			case T_BIT_AND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1565);
				((Shift_op_exprContext)_localctx).T_BIT_AND = match(T_BIT_AND);
				 ((Shift_op_exprContext)_localctx).res =  (((Shift_op_exprContext)_localctx).T_BIT_AND!=null?((Shift_op_exprContext)_localctx).T_BIT_AND.getText():null); 
				}
				break;
			case T_BIT_OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1567);
				((Shift_op_exprContext)_localctx).T_BIT_OR = match(T_BIT_OR);
				 ((Shift_op_exprContext)_localctx).res =  (((Shift_op_exprContext)_localctx).T_BIT_OR!=null?((Shift_op_exprContext)_localctx).T_BIT_OR.getText():null); 
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

	public static class Comp_exprContext extends ParserRuleContext {
		public json res;
		public Shift_exprContext left_expr;
		public Comp_op_exprContext comp_op_expr;
		public List<Comp_op_exprContext> operators = new ArrayList<Comp_op_exprContext>();
		public Shift_exprContext shift_expr;
		public List<Shift_exprContext> shift_expr_list = new ArrayList<Shift_exprContext>();
		public Shift_exprContext l_expr;
		public Set_operators_isContext set_operators_is;
		public Token BOOL_LITERAL;
		public Shift_exprContext eval_expr;
		public Shift_exprContext start_interval;
		public Shift_exprContext end_interval;
		public Set_operators_inContext set_operators_in;
		public Expr_listContext expr_list;
		public Full_select_stmtContext full_select_stmt;
		public Set_operators_existsContext set_operators_exists;
		public Set_operators_likeContext set_operators_like;
		public Shift_exprContext r_expr;
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public List<Comp_op_exprContext> comp_op_expr() {
			return getRuleContexts(Comp_op_exprContext.class);
		}
		public Comp_op_exprContext comp_op_expr(int i) {
			return getRuleContext(Comp_op_exprContext.class,i);
		}
		public Set_operators_isContext set_operators_is() {
			return getRuleContext(Set_operators_isContext.class,0);
		}
		public TerminalNode BOOL_LITERAL() { return getToken(HiveParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_CONST() { return getToken(HiveParser.NULL_CONST, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HiveParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
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
		public Set_operators_likeContext set_operators_like() {
			return getRuleContext(Set_operators_likeContext.class,0);
		}
		public Comp_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_expr; }
	}

	public final Comp_exprContext comp_expr() throws RecognitionException {
		Comp_exprContext _localctx = new Comp_exprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_comp_expr);
		try {
			int _alt;
			setState(1632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				vector<Shift_exprContext*> shift_expr_list; vector<Comp_op_exprContext*> operators; 
				setState(1572);
				((Comp_exprContext)_localctx).left_expr = shift_expr();
				setState(1578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1573);
						((Comp_exprContext)_localctx).comp_op_expr = comp_op_expr();
						((Comp_exprContext)_localctx).operators.add(((Comp_exprContext)_localctx).comp_op_expr);
						setState(1574);
						((Comp_exprContext)_localctx).shift_expr = shift_expr();
						((Comp_exprContext)_localctx).shift_expr_list.add(((Comp_exprContext)_localctx).shift_expr);
						}
						} 
					}
					setState(1580);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				}
				 
				        if(((Comp_exprContext)_localctx).shift_expr_list.size() == 0)
				            ((Comp_exprContext)_localctx).res =  ((Comp_exprContext)_localctx).left_expr.res;
				        else
				        {
				            json result = hql_bool_operator(((Comp_exprContext)_localctx).operators[0]->res, ((Comp_exprContext)_localctx).left_expr.res, ((Comp_exprContext)_localctx).shift_expr_list[0]->res);
				            for(int i = 1 ; i < ((Comp_exprContext)_localctx).shift_expr_list.size(); i++)
				               result = hql_bool_operator(((Comp_exprContext)_localctx).operators[i]->res, result, ((Comp_exprContext)_localctx).shift_expr_list[i]->res);
				            ((Comp_exprContext)_localctx).res =  result;
				        }
				     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1583);
				((Comp_exprContext)_localctx).l_expr = shift_expr();
				setState(1584);
				((Comp_exprContext)_localctx).set_operators_is = set_operators_is();
				setState(1585);
				((Comp_exprContext)_localctx).BOOL_LITERAL = match(BOOL_LITERAL);
				 ((Comp_exprContext)_localctx).res =  hql_bool_operator(((Comp_exprContext)_localctx).set_operators_is.res, ((Comp_exprContext)_localctx).l_expr.res, hql_boolean_type((((Comp_exprContext)_localctx).BOOL_LITERAL!=null?((Comp_exprContext)_localctx).BOOL_LITERAL.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1588);
				((Comp_exprContext)_localctx).l_expr = shift_expr();
				setState(1589);
				((Comp_exprContext)_localctx).set_operators_is = set_operators_is();
				setState(1590);
				match(NULL_CONST);
				 ((Comp_exprContext)_localctx).res =  hql_bool_operator(((Comp_exprContext)_localctx).set_operators_is.res, ((Comp_exprContext)_localctx).l_expr.res, hql_null_constant()); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1593);
				((Comp_exprContext)_localctx).eval_expr = shift_expr();
				setState(1594);
				match(T_BETWEEN);
				setState(1595);
				((Comp_exprContext)_localctx).start_interval = shift_expr();
				setState(1596);
				match(T_AND);
				setState(1597);
				((Comp_exprContext)_localctx).end_interval = shift_expr();
				 ((Comp_exprContext)_localctx).res =  hql_between_expr(((Comp_exprContext)_localctx).eval_expr.res, ((Comp_exprContext)_localctx).start_interval.res, ((Comp_exprContext)_localctx).end_interval.res, false); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1600);
				((Comp_exprContext)_localctx).eval_expr = shift_expr();
				setState(1601);
				match(T_NOT);
				setState(1602);
				match(T_BETWEEN);
				setState(1603);
				((Comp_exprContext)_localctx).start_interval = shift_expr();
				setState(1604);
				match(T_AND);
				setState(1605);
				((Comp_exprContext)_localctx).end_interval = shift_expr();
				 ((Comp_exprContext)_localctx).res =  hql_between_expr(((Comp_exprContext)_localctx).eval_expr.res, ((Comp_exprContext)_localctx).start_interval.res, ((Comp_exprContext)_localctx).end_interval.res, true); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1608);
				((Comp_exprContext)_localctx).eval_expr = shift_expr();
				setState(1609);
				((Comp_exprContext)_localctx).set_operators_in = set_operators_in();
				setState(1610);
				((Comp_exprContext)_localctx).expr_list = expr_list();
				 ((Comp_exprContext)_localctx).res =  hql_set_operators_in(((Comp_exprContext)_localctx).set_operators_in.res, ((Comp_exprContext)_localctx).eval_expr.res, ((Comp_exprContext)_localctx).expr_list.res);  
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1613);
				((Comp_exprContext)_localctx).eval_expr = shift_expr();
				setState(1614);
				((Comp_exprContext)_localctx).set_operators_in = set_operators_in();
				setState(1615);
				match(T_OPEN_P);
				setState(1616);
				((Comp_exprContext)_localctx).full_select_stmt = full_select_stmt();
				setState(1617);
				match(T_CLOSE_P);
				 ((Comp_exprContext)_localctx).res =  hql_set_operators_in(((Comp_exprContext)_localctx).set_operators_in.res, ((Comp_exprContext)_localctx).eval_expr.res, ((Comp_exprContext)_localctx).full_select_stmt.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1620);
				((Comp_exprContext)_localctx).eval_expr = shift_expr();
				setState(1621);
				((Comp_exprContext)_localctx).set_operators_exists = set_operators_exists();
				setState(1622);
				match(T_OPEN_P);
				setState(1623);
				((Comp_exprContext)_localctx).full_select_stmt = full_select_stmt();
				setState(1624);
				match(T_CLOSE_P);
				 ((Comp_exprContext)_localctx).res =  hql_set_operators_in(((Comp_exprContext)_localctx).set_operators_exists.res, ((Comp_exprContext)_localctx).eval_expr.res, ((Comp_exprContext)_localctx).full_select_stmt.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1627);
				((Comp_exprContext)_localctx).eval_expr = shift_expr();
				setState(1628);
				((Comp_exprContext)_localctx).set_operators_like = set_operators_like();
				setState(1629);
				((Comp_exprContext)_localctx).r_expr = shift_expr();
				 ((Comp_exprContext)_localctx).res =  hql_bool_operator(((Comp_exprContext)_localctx).set_operators_like.res, ((Comp_exprContext)_localctx).eval_expr.res, ((Comp_exprContext)_localctx).r_expr.res); 
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

	public static class Comp_op_exprContext extends ParserRuleContext {
		public string res;
		public Token T_LESS;
		public Token T_LESSEQUAL;
		public Token T_GREATER;
		public Token T_GREATEREQUAL;
		public Token T_EQUAL2;
		public Token T_EQUAL;
		public Token T_NOTEQUAL;
		public Token T_NOTEQUAL2;
		public TerminalNode T_LESS() { return getToken(HiveParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HiveParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HiveParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HiveParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(HiveParser.T_EQUAL2, 0); }
		public TerminalNode T_EQUAL() { return getToken(HiveParser.T_EQUAL, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(HiveParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(HiveParser.T_NOTEQUAL2, 0); }
		public Comp_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op_expr; }
	}

	public final Comp_op_exprContext comp_op_expr() throws RecognitionException {
		Comp_op_exprContext _localctx = new Comp_op_exprContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_comp_op_expr);
		try {
			setState(1650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				((Comp_op_exprContext)_localctx).T_LESS = match(T_LESS);
				 ((Comp_op_exprContext)_localctx).res =  (((Comp_op_exprContext)_localctx).T_LESS!=null?((Comp_op_exprContext)_localctx).T_LESS.getText():null); 
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				((Comp_op_exprContext)_localctx).T_LESSEQUAL = match(T_LESSEQUAL);
				 ((Comp_op_exprContext)_localctx).res =  (((Comp_op_exprContext)_localctx).T_LESSEQUAL!=null?((Comp_op_exprContext)_localctx).T_LESSEQUAL.getText():null); 
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1638);
				((Comp_op_exprContext)_localctx).T_GREATER = match(T_GREATER);
				 ((Comp_op_exprContext)_localctx).res =  (((Comp_op_exprContext)_localctx).T_GREATER!=null?((Comp_op_exprContext)_localctx).T_GREATER.getText():null); 
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1640);
				((Comp_op_exprContext)_localctx).T_GREATEREQUAL = match(T_GREATEREQUAL);
				 ((Comp_op_exprContext)_localctx).res =  (((Comp_op_exprContext)_localctx).T_GREATEREQUAL!=null?((Comp_op_exprContext)_localctx).T_GREATEREQUAL.getText():null); 
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 5);
				{
				setState(1642);
				((Comp_op_exprContext)_localctx).T_EQUAL2 = match(T_EQUAL2);
				 ((Comp_op_exprContext)_localctx).res =  (((Comp_op_exprContext)_localctx).T_EQUAL2!=null?((Comp_op_exprContext)_localctx).T_EQUAL2.getText():null); 
				}
				break;
			case T_EQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1644);
				((Comp_op_exprContext)_localctx).T_EQUAL = match(T_EQUAL);
				 ((Comp_op_exprContext)_localctx).res =  (((Comp_op_exprContext)_localctx).T_EQUAL!=null?((Comp_op_exprContext)_localctx).T_EQUAL.getText():null); 
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1646);
				((Comp_op_exprContext)_localctx).T_NOTEQUAL = match(T_NOTEQUAL);
				 ((Comp_op_exprContext)_localctx).res =  (((Comp_op_exprContext)_localctx).T_NOTEQUAL!=null?((Comp_op_exprContext)_localctx).T_NOTEQUAL.getText():null); 
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 8);
				{
				setState(1648);
				((Comp_op_exprContext)_localctx).T_NOTEQUAL2 = match(T_NOTEQUAL2);
				 ((Comp_op_exprContext)_localctx).res =  (((Comp_op_exprContext)_localctx).T_NOTEQUAL2!=null?((Comp_op_exprContext)_localctx).T_NOTEQUAL2.getText():null); 
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

	public static class Bool_exprContext extends ParserRuleContext {
		public json res;
		public Comp_exprContext left_expr;
		public Bool_op_exprContext bool_op_expr;
		public List<Bool_op_exprContext> operators = new ArrayList<Bool_op_exprContext>();
		public Comp_exprContext comp_expr;
		public List<Comp_exprContext> comp_expr_list = new ArrayList<Comp_exprContext>();
		public List<Comp_exprContext> comp_expr() {
			return getRuleContexts(Comp_exprContext.class);
		}
		public Comp_exprContext comp_expr(int i) {
			return getRuleContext(Comp_exprContext.class,i);
		}
		public List<Bool_op_exprContext> bool_op_expr() {
			return getRuleContexts(Bool_op_exprContext.class);
		}
		public Bool_op_exprContext bool_op_expr(int i) {
			return getRuleContext(Bool_op_exprContext.class,i);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_bool_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			vector<Comp_exprContext*> comp_expr_list; vector<Bool_op_exprContext*> operators; 
			setState(1653);
			((Bool_exprContext)_localctx).left_expr = comp_expr();
			setState(1659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1654);
					((Bool_exprContext)_localctx).bool_op_expr = bool_op_expr();
					((Bool_exprContext)_localctx).operators.add(((Bool_exprContext)_localctx).bool_op_expr);
					setState(1655);
					((Bool_exprContext)_localctx).comp_expr = comp_expr();
					((Bool_exprContext)_localctx).comp_expr_list.add(((Bool_exprContext)_localctx).comp_expr);
					}
					} 
				}
				setState(1661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			 
			        if(((Bool_exprContext)_localctx).comp_expr_list.size() == 0)
			            ((Bool_exprContext)_localctx).res =  ((Bool_exprContext)_localctx).left_expr.res;
			        else
			        {
			            json result = hql_bool_operator(((Bool_exprContext)_localctx).operators[0]->res, ((Bool_exprContext)_localctx).left_expr.res, ((Bool_exprContext)_localctx).comp_expr_list[0]->res);
			            for(int i = 1 ; i < ((Bool_exprContext)_localctx).comp_expr_list.size(); i++)
			               result = hql_bool_operator(((Bool_exprContext)_localctx).operators[i]->res, result, ((Bool_exprContext)_localctx).comp_expr_list[i]->res);
			            ((Bool_exprContext)_localctx).res =  result;
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

	public static class Bool_op_exprContext extends ParserRuleContext {
		public string res;
		public Set_operators_likeContext set_operators_like;
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HiveParser.T_OR, 0); }
		public Set_operators_likeContext set_operators_like() {
			return getRuleContext(Set_operators_likeContext.class,0);
		}
		public Bool_op_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_op_expr; }
	}

	public final Bool_op_exprContext bool_op_expr() throws RecognitionException {
		Bool_op_exprContext _localctx = new Bool_op_exprContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_bool_op_expr);
		try {
			setState(1671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				match(T_AND);
				 ((Bool_op_exprContext)_localctx).res =  "AND"; 
				}
				break;
			case T_OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1666);
				match(T_OR);
				 ((Bool_op_exprContext)_localctx).res =  "OR"; 
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1668);
				((Bool_op_exprContext)_localctx).set_operators_like = set_operators_like();
				 ((Bool_op_exprContext)_localctx).res =  ((Bool_op_exprContext)_localctx).set_operators_like.res; 
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

	public static class Base_exprContext extends ParserRuleContext {
		public json res;
		public Literal_valuesContext literal_values;
		public IdentContext ident;
		public Unary_operatorContext unary_operator;
		public Base_exprContext base_expr;
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
		public Literal_valuesContext literal_values() {
			return getRuleContext(Literal_valuesContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Base_exprContext base_expr() {
			return getRuleContext(Base_exprContext.class,0);
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
		public Base_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_expr; }
	}

	public final Base_exprContext base_expr() throws RecognitionException {
		Base_exprContext _localctx = new Base_exprContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_base_expr);
		try {
			setState(1721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1673);
				((Base_exprContext)_localctx).literal_values = literal_values();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).literal_values.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1676);
				((Base_exprContext)_localctx).ident = ident();
				 ((Base_exprContext)_localctx).res =   ((Base_exprContext)_localctx).ident.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1679);
				((Base_exprContext)_localctx).unary_operator = unary_operator();
				setState(1680);
				((Base_exprContext)_localctx).base_expr = base_expr();
				 ((Base_exprContext)_localctx).res =  hql_unary_operator((((Base_exprContext)_localctx).unary_operator!=null?_input.getText(((Base_exprContext)_localctx).unary_operator.start,((Base_exprContext)_localctx).unary_operator.stop):null), ((Base_exprContext)_localctx).base_expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1683);
				match(T_OPEN_P);
				setState(1684);
				((Base_exprContext)_localctx).base_expr = base_expr();
				setState(1685);
				match(T_CLOSE_P);
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).base_expr.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1688);
				((Base_exprContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1691);
				((Base_exprContext)_localctx).math_func = math_func();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).math_func.res; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1694);
				((Base_exprContext)_localctx).date_func = date_func();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).date_func.res; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1697);
				((Base_exprContext)_localctx).cond_func = cond_func();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).cond_func.res; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1700);
				((Base_exprContext)_localctx).str_func = str_func();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).str_func.res; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1703);
				((Base_exprContext)_localctx).expr_concat = expr_concat();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).expr_concat.res; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1706);
				((Base_exprContext)_localctx).misc_func = misc_func();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).misc_func.res; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1709);
				((Base_exprContext)_localctx).aggr_func = aggr_func();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).aggr_func.res; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1712);
				((Base_exprContext)_localctx).generic_function = generic_function();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).generic_function.res; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1715);
				((Base_exprContext)_localctx).complex_types = complex_types();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).complex_types.res; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1718);
				((Base_exprContext)_localctx).use_var = use_var();
				 ((Base_exprContext)_localctx).res =  ((Base_exprContext)_localctx).use_var.res; 
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
		enterRule(_localctx, 194, RULE_complex_types);
		try {
			setState(1763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1723);
				((Complex_typesContext)_localctx).array_def = array_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).array_def.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1726);
				((Complex_typesContext)_localctx).map_def = map_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).map_def.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1729);
				((Complex_typesContext)_localctx).struct_def = struct_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).struct_def.res; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1732);
				((Complex_typesContext)_localctx).named_struct_def = named_struct_def();
				 ((Complex_typesContext)_localctx).res =  ((Complex_typesContext)_localctx).named_struct_def.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1735);
				((Complex_typesContext)_localctx).ident = ident();
				setState(1736);
				match(T_OPEN_SB);
				setState(1737);
				((Complex_typesContext)_localctx).expr = expr();
				setState(1738);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).ident.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1741);
				((Complex_typesContext)_localctx).array_def = array_def();
				setState(1742);
				match(T_OPEN_SB);
				setState(1743);
				((Complex_typesContext)_localctx).expr = expr();
				setState(1744);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).array_def.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1747);
				((Complex_typesContext)_localctx).map_def = map_def();
				setState(1748);
				match(T_OPEN_SB);
				setState(1749);
				((Complex_typesContext)_localctx).expr = expr();
				setState(1750);
				match(T_CLOSE_SB);
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).map_def.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1753);
				((Complex_typesContext)_localctx).ident = ident();
				setState(1754);
				match(T__1);
				setState(1755);
				((Complex_typesContext)_localctx).expr = expr();
				 ((Complex_typesContext)_localctx).res =  hql_complex_type_access(((Complex_typesContext)_localctx).ident.res, ((Complex_typesContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1758);
				((Complex_typesContext)_localctx).struct_def = struct_def();
				setState(1759);
				match(T__1);
				setState(1760);
				((Complex_typesContext)_localctx).expr = expr();
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
		enterRule(_localctx, 196, RULE_array_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> exprs; 
			setState(1766);
			match(T_ARRAY);
			setState(1767);
			match(T_OPEN_P);
			setState(1768);
			((Array_defContext)_localctx).expr = expr();
			((Array_defContext)_localctx).exprs.add(((Array_defContext)_localctx).expr);
			setState(1773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1769);
				match(T_COMMA);
				setState(1770);
				((Array_defContext)_localctx).expr = expr();
				((Array_defContext)_localctx).exprs.add(((Array_defContext)_localctx).expr);
				}
				}
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1776);
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
		enterRule(_localctx, 198, RULE_map_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> key_exprs; vector<ExprContext*> val_exprs; 
			setState(1780);
			match(T_MAP);
			setState(1781);
			match(T_OPEN_P);
			setState(1782);
			((Map_defContext)_localctx).expr = expr();
			((Map_defContext)_localctx).key_exprs.add(((Map_defContext)_localctx).expr);
			setState(1783);
			match(T_COMMA);
			setState(1784);
			((Map_defContext)_localctx).expr = expr();
			((Map_defContext)_localctx).val_exprs.add(((Map_defContext)_localctx).expr);
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1785);
				match(T_COMMA);
				setState(1786);
				((Map_defContext)_localctx).expr = expr();
				((Map_defContext)_localctx).key_exprs.add(((Map_defContext)_localctx).expr);
				setState(1787);
				match(T_COMMA);
				setState(1788);
				((Map_defContext)_localctx).expr = expr();
				((Map_defContext)_localctx).val_exprs.add(((Map_defContext)_localctx).expr);
				}
				}
				setState(1794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1795);
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
		enterRule(_localctx, 200, RULE_struct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> val_exprs; 
			setState(1799);
			match(T_STRUCT);
			setState(1800);
			match(T_OPEN_P);
			setState(1801);
			((Struct_defContext)_localctx).expr = expr();
			((Struct_defContext)_localctx).val_exprs.add(((Struct_defContext)_localctx).expr);
			setState(1806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1802);
				match(T_COMMA);
				setState(1803);
				((Struct_defContext)_localctx).expr = expr();
				((Struct_defContext)_localctx).val_exprs.add(((Struct_defContext)_localctx).expr);
				}
				}
				setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1809);
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
		enterRule(_localctx, 202, RULE_named_struct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 vector<ExprContext*> col_exprs; vector<ExprContext*> val_exprs; 
			setState(1813);
			match(T_NAMED_STRUCT);
			setState(1814);
			match(T_OPEN_P);
			setState(1815);
			((Named_struct_defContext)_localctx).expr = expr();
			((Named_struct_defContext)_localctx).col_exprs.add(((Named_struct_defContext)_localctx).expr);
			setState(1816);
			match(T_COMMA);
			setState(1817);
			((Named_struct_defContext)_localctx).expr = expr();
			((Named_struct_defContext)_localctx).val_exprs.add(((Named_struct_defContext)_localctx).expr);
			setState(1825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1818);
				match(T_COMMA);
				setState(1819);
				((Named_struct_defContext)_localctx).expr = expr();
				((Named_struct_defContext)_localctx).col_exprs.add(((Named_struct_defContext)_localctx).expr);
				setState(1820);
				match(T_COMMA);
				setState(1821);
				((Named_struct_defContext)_localctx).expr = expr();
				((Named_struct_defContext)_localctx).val_exprs.add(((Named_struct_defContext)_localctx).expr);
				}
				}
				setState(1827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1828);
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
		enterRule(_localctx, 204, RULE_str_func);
		int _la;
		try {
			setState(2344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1831);
				match(T_ASCII);
				setState(1832);
				match(T_OPEN_P);
				setState(1833);
				((Str_funcContext)_localctx).expr = expr();
				setState(1834);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("ASCII", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1837);
				match(T_BASE64);
				setState(1838);
				match(T_OPEN_P);
				setState(1839);
				((Str_funcContext)_localctx).expr = expr();
				setState(1840);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("BASE64", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1843);
				match(T_CHARACTER_LENGTH);
				setState(1844);
				match(T_OPEN_P);
				setState(1845);
				((Str_funcContext)_localctx).expr = expr();
				setState(1846);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHARACTER_LENGTH", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1849);
				match(T_CHR);
				setState(1850);
				match(T_OPEN_P);
				setState(1851);
				((Str_funcContext)_localctx).expr = expr();
				setState(1852);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("CHR", "expr", ((Str_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(1856);
				match(T_CONCAT);
				setState(1857);
				match(T_OPEN_P);
				setState(1858);
				((Str_funcContext)_localctx).expr = expr();
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1861); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1859);
					match(T_COMMA);
					setState(1860);
					((Str_funcContext)_localctx).expr = expr();
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1863); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(1865);
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
				setState(1869);
				match(T_CONCAT_WS);
				setState(1870);
				match(T_OPEN_P);
				setState(1871);
				((Str_funcContext)_localctx).sep = expr();
				setState(1872);
				match(T_COMMA);
				setState(1873);
				((Str_funcContext)_localctx).expr = expr();
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1876); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1874);
					match(T_COMMA);
					setState(1875);
					((Str_funcContext)_localctx).expr = expr();
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1878); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(1880);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("CONCAT","separator", ((Str_funcContext)_localctx).sep.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1883);
				match(T_DECODE);
				setState(1884);
				match(T_OPEN_P);
				setState(1885);
				((Str_funcContext)_localctx).expr_bin = expr();
				setState(1886);
				match(T_COMMA);
				setState(1887);
				((Str_funcContext)_localctx).expr_charset = expr();
				setState(1888);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("DECODE", "binary_value", ((Str_funcContext)_localctx).expr_bin.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				 vector<ExprContext*> exprs; 
				setState(1892);
				match(T_ELT);
				setState(1893);
				match(T_OPEN_P);
				setState(1894);
				((Str_funcContext)_localctx).index_num = expr();
				setState(1895);
				match(T_COMMA);
				setState(1896);
				((Str_funcContext)_localctx).expr = expr();
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1897);
					match(T_COMMA);
					setState(1898);
					((Str_funcContext)_localctx).expr = expr();
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1904);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("ELT","index_num", ((Str_funcContext)_localctx).index_num.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1907);
				match(T_ENCODE);
				setState(1908);
				match(T_OPEN_P);
				setState(1909);
				((Str_funcContext)_localctx).expr_str = expr();
				setState(1910);
				match(T_COMMA);
				setState(1911);
				((Str_funcContext)_localctx).expr_charset = expr();
				setState(1912);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("ENCODE", "str_value", ((Str_funcContext)_localctx).expr_str.res, "charset", ((Str_funcContext)_localctx).expr_charset.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				 vector<ExprContext*> exprs; 
				setState(1916);
				match(T_FIELD);
				setState(1917);
				match(T_OPEN_P);
				setState(1918);
				((Str_funcContext)_localctx).expr_val = expr();
				setState(1919);
				match(T_COMMA);
				setState(1920);
				((Str_funcContext)_localctx).expr = expr();
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(1925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1921);
					match(T_COMMA);
					setState(1922);
					((Str_funcContext)_localctx).expr = expr();
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(1927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1928);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("FIELD","expr_val", ((Str_funcContext)_localctx).expr_val.res, "expr_list",expr_list_json);
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1931);
				match(T_FIELD_IN_SET);
				setState(1932);
				match(T_OPEN_P);
				setState(1933);
				((Str_funcContext)_localctx).expr_str = expr();
				setState(1934);
				match(T_COMMA);
				setState(1935);
				((Str_funcContext)_localctx).expr_str_list = expr();
				setState(1936);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FIELD_IN_SET", "str_value", ((Str_funcContext)_localctx).expr_str.res, "str_list", ((Str_funcContext)_localctx).expr_str_list.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1939);
				match(T_FORMAT_NUMBER);
				setState(1940);
				match(T_OPEN_P);
				setState(1941);
				((Str_funcContext)_localctx).number_expr = expr();
				setState(1942);
				match(T_COMMA);
				setState(1943);
				((Str_funcContext)_localctx).int_expr = expr();
				setState(1944);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("FORMAT_NUMBER", "number", ((Str_funcContext)_localctx).number_expr.res, "decimal_places", ((Str_funcContext)_localctx).int_expr.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1947);
				match(T_GET_JSON_OBJECTS);
				setState(1948);
				match(T_OPEN_P);
				setState(1949);
				((Str_funcContext)_localctx).json_string = expr();
				setState(1950);
				match(T_COMMA);
				setState(1951);
				((Str_funcContext)_localctx).path_expr = expr();
				setState(1952);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("GET_JSON_OBJECTS", "json_string", ((Str_funcContext)_localctx).json_string.res, "path", ((Str_funcContext)_localctx).path_expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1955);
				match(T_IN_FILE);
				setState(1956);
				match(T_OPEN_P);
				setState(1957);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(1958);
				match(T_COMMA);
				setState(1959);
				((Str_funcContext)_localctx).filename = expr();
				setState(1960);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_FILE", "string", ((Str_funcContext)_localctx).str_expr.res, "filename", ((Str_funcContext)_localctx).filename.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1963);
				match(T_IN_STR);
				setState(1964);
				match(T_OPEN_P);
				setState(1965);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(1966);
				match(T_COMMA);
				setState(1967);
				((Str_funcContext)_localctx).substr_expr = expr();
				setState(1968);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("IN_STR", "string", ((Str_funcContext)_localctx).str_expr.res, "substring", ((Str_funcContext)_localctx).substr_expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1971);
				match(T_LENGTH);
				setState(1972);
				match(T_OPEN_P);
				setState(1973);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(1974);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1977);
				match(T_LOCATE);
				setState(1978);
				match(T_OPEN_P);
				setState(1979);
				((Str_funcContext)_localctx).substr_expr = expr();
				setState(1980);
				match(T_COMMA);
				setState(1981);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(1982);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1985);
				match(T_LOCATE);
				setState(1986);
				match(T_OPEN_P);
				setState(1987);
				((Str_funcContext)_localctx).substr_expr = expr();
				setState(1988);
				match(T_COMMA);
				setState(1989);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(1990);
				match(T_COMMA);
				setState(1991);
				((Str_funcContext)_localctx).pos = expr();
				setState(1992);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LOCATE", "substring", ((Str_funcContext)_localctx).substr_expr.res, "string", ((Str_funcContext)_localctx).str_expr.res,"position", ((Str_funcContext)_localctx).pos.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1995);
				_la = _input.LA(1);
				if ( !(_la==T_LOWER || _la==T_LCASE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1996);
				match(T_OPEN_P);
				setState(1997);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(1998);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LOWER_CASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2001);
				match(T_LPAD);
				setState(2002);
				match(T_OPEN_P);
				setState(2003);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2004);
				match(T_COMMA);
				setState(2005);
				((Str_funcContext)_localctx).len = expr();
				setState(2006);
				match(T_COMMA);
				setState(2007);
				((Str_funcContext)_localctx).pad = expr();
				setState(2008);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("LPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2011);
				match(T_LTRIM);
				setState(2012);
				match(T_OPEN_P);
				setState(2013);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2014);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("LTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2017);
				match(T_OCTET_LENGTH);
				setState(2018);
				match(T_OPEN_P);
				setState(2019);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2020);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("OCTET_LENGTH", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2023);
				match(T_PARSE_URL);
				setState(2024);
				match(T_OPEN_P);
				setState(2025);
				((Str_funcContext)_localctx).url_str = expr();
				setState(2026);
				match(T_COMMA);
				setState(2027);
				((Str_funcContext)_localctx).part_to_extract = expr();
				setState(2028);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2031);
				match(T_PARSE_URL);
				setState(2032);
				match(T_OPEN_P);
				setState(2033);
				((Str_funcContext)_localctx).url_str = expr();
				setState(2034);
				match(T_COMMA);
				setState(2035);
				((Str_funcContext)_localctx).part_to_extract = expr();
				setState(2036);
				match(T_COMMA);
				setState(2037);
				((Str_funcContext)_localctx).key_to_extract = expr();
				setState(2038);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("PARSE_URL", "url_str", ((Str_funcContext)_localctx).url_str.res, "part_to_extract", ((Str_funcContext)_localctx).part_to_extract.res, "key_to_extract", ((Str_funcContext)_localctx).key_to_extract.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				 vector<ExprContext*> exprs; 
				setState(2042);
				match(T_PRINTF);
				setState(2043);
				match(T_OPEN_P);
				setState(2044);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2045);
				match(T_COMMA);
				setState(2046);
				((Str_funcContext)_localctx).expr = expr();
				((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
				setState(2049); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2047);
					match(T_COMMA);
					setState(2048);
					((Str_funcContext)_localctx).expr = expr();
					((Str_funcContext)_localctx).exprs.add(((Str_funcContext)_localctx).expr);
					}
					}
					setState(2051); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(2053);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Str_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Str_funcContext)_localctx).res =  hql_single_param_list_func("PRINTF","string", ((Str_funcContext)_localctx).str_expr.res, "object_list",expr_list_json);
				    
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2056);
				match(T_QUOTE);
				setState(2057);
				match(T_OPEN_P);
				setState(2058);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2059);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("QUOTE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2062);
				match(T_REGEXP_EXTRACT);
				setState(2063);
				match(T_OPEN_P);
				setState(2064);
				((Str_funcContext)_localctx).subject = expr();
				setState(2065);
				match(T_COMMA);
				setState(2066);
				((Str_funcContext)_localctx).pattern = expr();
				setState(2067);
				match(T_COMMA);
				setState(2068);
				((Str_funcContext)_localctx).index = expr();
				setState(2069);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_EXTRACT", "subject", ((Str_funcContext)_localctx).subject.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"index", ((Str_funcContext)_localctx).index.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2072);
				match(T_REGEXP_REPLACE);
				setState(2073);
				match(T_OPEN_P);
				setState(2074);
				((Str_funcContext)_localctx).initial_string = expr();
				setState(2075);
				match(T_COMMA);
				setState(2076);
				((Str_funcContext)_localctx).pattern = expr();
				setState(2077);
				match(T_COMMA);
				setState(2078);
				((Str_funcContext)_localctx).replacement = expr();
				setState(2079);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REGEXP_REPLACE", "initial_string", ((Str_funcContext)_localctx).initial_string.res, "pattern", ((Str_funcContext)_localctx).pattern.res,"replacement", ((Str_funcContext)_localctx).replacement.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2082);
				match(T_REPEAT);
				setState(2083);
				match(T_OPEN_P);
				setState(2084);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2085);
				match(T_COMMA);
				setState(2086);
				((Str_funcContext)_localctx).n_times_expr = expr();
				setState(2087);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("REPEAT", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_times_expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2090);
				match(T_REPLACE);
				setState(2091);
				match(T_OPEN_P);
				setState(2092);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2093);
				match(T_COMMA);
				setState(2094);
				((Str_funcContext)_localctx).old = expr();
				setState(2095);
				match(T_COMMA);
				setState(2096);
				((Str_funcContext)_localctx).new_expr = expr();
				setState(2097);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("REPLACE", "string", ((Str_funcContext)_localctx).str_expr.res, "old", ((Str_funcContext)_localctx).old.res,"new", ((Str_funcContext)_localctx).new_expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2100);
				match(T_REVERSE);
				setState(2101);
				match(T_OPEN_P);
				setState(2102);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2103);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("REVERSE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2106);
				match(T_RPAD);
				setState(2107);
				match(T_OPEN_P);
				setState(2108);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2109);
				match(T_COMMA);
				setState(2110);
				((Str_funcContext)_localctx).len = expr();
				setState(2111);
				match(T_COMMA);
				setState(2112);
				((Str_funcContext)_localctx).pad = expr();
				setState(2113);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("RPAD", "string", ((Str_funcContext)_localctx).str_expr.res, "length", ((Str_funcContext)_localctx).len.res,"pad", ((Str_funcContext)_localctx).pad.res); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2116);
				match(T_RTRIM);
				setState(2117);
				match(T_OPEN_P);
				setState(2118);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2119);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("RTRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2122);
				match(T_SENTENCES);
				setState(2123);
				match(T_OPEN_P);
				setState(2124);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2125);
				match(T_COMMA);
				setState(2126);
				((Str_funcContext)_localctx).lang_expr = expr();
				setState(2127);
				match(T_COMMA);
				setState(2128);
				((Str_funcContext)_localctx).locale_expr = expr();
				setState(2129);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SENTENCES", "string", ((Str_funcContext)_localctx).str_expr.res, "lang", ((Str_funcContext)_localctx).lang_expr.res, "locale", ((Str_funcContext)_localctx).locale_expr.res); 
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2132);
				match(T_SPACE);
				setState(2133);
				match(T_OPEN_P);
				setState(2134);
				((Str_funcContext)_localctx).size_expr = expr();
				setState(2135);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SPACE", "size", ((Str_funcContext)_localctx).size_expr.res); 
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2138);
				match(T_SPLIT);
				setState(2139);
				match(T_OPEN_P);
				setState(2140);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2141);
				match(T_COMMA);
				setState(2142);
				((Str_funcContext)_localctx).pattern = expr();
				setState(2143);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SPLIT", "string", ((Str_funcContext)_localctx).str_expr.res, "pattern", ((Str_funcContext)_localctx).pattern.res); 
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2146);
				match(T_STR_TO_MAP);
				setState(2147);
				match(T_OPEN_P);
				setState(2148);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2149);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", hql_string_type(";"), "delimiter2", hql_string_type(":")); 
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2152);
				match(T_STR_TO_MAP);
				setState(2153);
				match(T_OPEN_P);
				setState(2154);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2155);
				match(T_COMMA);
				setState(2156);
				((Str_funcContext)_localctx).delimiter1 = expr();
				setState(2157);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2", hql_string_type(":")); 
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2160);
				match(T_STR_TO_MAP);
				setState(2161);
				match(T_OPEN_P);
				setState(2162);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2163);
				match(T_COMMA);
				setState(2164);
				((Str_funcContext)_localctx).delimiter1 = expr();
				setState(2165);
				match(T_COMMA);
				setState(2166);
				((Str_funcContext)_localctx).delimiter2 = expr();
				setState(2167);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("STR_TO_MAP", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter1", ((Str_funcContext)_localctx).delimiter1.res, "delimiter2",((Str_funcContext)_localctx).delimiter2.res); 
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2170);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2171);
				match(T_OPEN_P);
				setState(2172);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2173);
				match(T_COMMA);
				setState(2174);
				((Str_funcContext)_localctx).start_indx = expr();
				setState(2175);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res); 
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2178);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2179);
				match(T_OPEN_P);
				setState(2180);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2181);
				match(T_COMMA);
				setState(2182);
				((Str_funcContext)_localctx).start_indx = expr();
				setState(2183);
				match(T_COMMA);
				setState(2184);
				((Str_funcContext)_localctx).lenght_expr = expr();
				setState(2185);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING", "string", ((Str_funcContext)_localctx).str_expr.res, "start", ((Str_funcContext)_localctx).start_indx.res, "length", ((Str_funcContext)_localctx).lenght_expr.res); 
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2188);
				match(T_SUBSTRING_INDEX);
				setState(2189);
				match(T_OPEN_P);
				setState(2190);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2191);
				match(T_COMMA);
				setState(2192);
				((Str_funcContext)_localctx).delimiter = expr();
				setState(2193);
				match(T_COMMA);
				setState(2194);
				((Str_funcContext)_localctx).count = expr();
				setState(2195);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("SUBSTRING_INDEX", "string", ((Str_funcContext)_localctx).str_expr.res, "delimiter", ((Str_funcContext)_localctx).delimiter.res, "count", ((Str_funcContext)_localctx).count.res); 
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2198);
				match(T_TRANSLATE);
				setState(2199);
				match(T_OPEN_P);
				setState(2200);
				((Str_funcContext)_localctx).input_expr = expr();
				setState(2201);
				match(T_COMMA);
				setState(2202);
				((Str_funcContext)_localctx).from_expr = expr();
				setState(2203);
				match(T_COMMA);
				setState(2204);
				((Str_funcContext)_localctx).to_expr = expr();
				setState(2205);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("TRANSLATE", "input", ((Str_funcContext)_localctx).input_expr.res, "from", ((Str_funcContext)_localctx).from_expr.res, "to", ((Str_funcContext)_localctx).to_expr.res); 
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2208);
				match(T_TRIM);
				setState(2209);
				match(T_OPEN_P);
				setState(2210);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2211);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("TRIM", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2214);
				match(T_UNBASE64);
				setState(2215);
				match(T_OPEN_P);
				setState(2216);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2217);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UNBASE64", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(2220);
				_la = _input.LA(1);
				if ( !(_la==T_UPPER || _la==T_UCASE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2221);
				match(T_OPEN_P);
				setState(2222);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2223);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("UPPERCASE", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(2226);
				match(T_INITCAP);
				setState(2227);
				match(T_OPEN_P);
				setState(2228);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2229);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("INITCAP", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(2232);
				match(T_LEVENSHTEIN);
				setState(2233);
				match(T_OPEN_P);
				setState(2234);
				((Str_funcContext)_localctx).strA_expr = expr();
				setState(2235);
				match(T_COMMA);
				setState(2236);
				((Str_funcContext)_localctx).strB_expr = expr();
				setState(2237);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("LEVENSHTEIN", "string_A", ((Str_funcContext)_localctx).strA_expr.res, "string_B", ((Str_funcContext)_localctx).strB_expr.res); 
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(2240);
				match(T_SOUNDEX);
				setState(2241);
				match(T_OPEN_P);
				setState(2242);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2243);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("SOUNDEX", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(2246);
				match(T_MASK);
				setState(2247);
				match(T_OPEN_P);
				setState(2248);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2249);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(2252);
				match(T_MASK);
				setState(2253);
				match(T_OPEN_P);
				setState(2254);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2255);
				match(T_COMMA);
				setState(2256);
				((Str_funcContext)_localctx).str_upper_expr = expr();
				setState(2257);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res); 
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(2260);
				match(T_MASK);
				setState(2261);
				match(T_OPEN_P);
				setState(2262);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2263);
				match(T_COMMA);
				setState(2264);
				((Str_funcContext)_localctx).str_upper_expr = expr();
				setState(2265);
				match(T_COMMA);
				setState(2266);
				((Str_funcContext)_localctx).str_lower_expr = expr();
				setState(2267);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_three_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res); 
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(2270);
				match(T_MASK);
				setState(2271);
				match(T_OPEN_P);
				setState(2272);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2273);
				match(T_COMMA);
				setState(2274);
				((Str_funcContext)_localctx).str_upper_expr = expr();
				setState(2275);
				match(T_COMMA);
				setState(2276);
				((Str_funcContext)_localctx).str_lower_expr = expr();
				setState(2277);
				match(T_COMMA);
				setState(2278);
				((Str_funcContext)_localctx).str_number_expr = expr();
				setState(2279);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_four_param_func("MASK", "string", ((Str_funcContext)_localctx).str_expr.res, "upper", ((Str_funcContext)_localctx).str_upper_expr.res, "lower", ((Str_funcContext)_localctx).str_lower_expr.res, "number", ((Str_funcContext)_localctx).str_number_expr.res); 
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(2282);
				match(T_MASK_FIRST_N);
				setState(2283);
				match(T_OPEN_P);
				setState(2284);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2285);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(2288);
				match(T_MASK_FIRST_N);
				setState(2289);
				match(T_OPEN_P);
				setState(2290);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2291);
				match(T_COMMA);
				setState(2292);
				((Str_funcContext)_localctx).n_expr = expr();
				setState(2293);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(2296);
				match(T_MASK_LAST_N);
				setState(2297);
				match(T_OPEN_P);
				setState(2298);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2299);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(2302);
				match(T_MASK_LAST_N);
				setState(2303);
				match(T_OPEN_P);
				setState(2304);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2305);
				match(T_COMMA);
				setState(2306);
				((Str_funcContext)_localctx).n_expr = expr();
				setState(2307);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(2310);
				match(T_MASK_SHOW_FIRST_N);
				setState(2311);
				match(T_OPEN_P);
				setState(2312);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2313);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(2316);
				match(T_MASK_SHOW_FIRST_N);
				setState(2317);
				match(T_OPEN_P);
				setState(2318);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2319);
				match(T_COMMA);
				setState(2320);
				((Str_funcContext)_localctx).n_expr = expr();
				setState(2321);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_FIRST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(2324);
				match(T_MASK_SHOW_LAST_N);
				setState(2325);
				match(T_OPEN_P);
				setState(2326);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2327);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_single_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res); 
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(2330);
				match(T_MASK_SHOW_LAST_N);
				setState(2331);
				match(T_OPEN_P);
				setState(2332);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2333);
				match(T_COMMA);
				setState(2334);
				((Str_funcContext)_localctx).n_expr = expr();
				setState(2335);
				match(T_CLOSE_P);
				 ((Str_funcContext)_localctx).res =  hql_double_param_func("MASK_SHOW_LAST_N", "string", ((Str_funcContext)_localctx).str_expr.res, "n", ((Str_funcContext)_localctx).n_expr.res); 
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(2338);
				match(T_MASK_HASH);
				setState(2339);
				match(T_OPEN_P);
				setState(2340);
				((Str_funcContext)_localctx).str_expr = expr();
				setState(2341);
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
		enterRule(_localctx, 206, RULE_misc_func);
		int _la;
		try {
			setState(2446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_JAVA_METHOD:
				enterOuterAlt(_localctx, 1);
				{
				 vector<ExprContext*> exprs; 
				setState(2347);
				match(T_JAVA_METHOD);
				setState(2348);
				match(T_OPEN_P);
				setState(2349);
				((Misc_funcContext)_localctx).class_name_expr = expr();
				setState(2350);
				match(T_COMMA);
				setState(2351);
				((Misc_funcContext)_localctx).method_name_expr = expr();
				setState(2356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2352);
					match(T_COMMA);
					setState(2353);
					((Misc_funcContext)_localctx).expr = expr();
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2359);
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
				setState(2363);
				match(T_REFLECT);
				setState(2364);
				match(T_OPEN_P);
				setState(2365);
				((Misc_funcContext)_localctx).class_name_expr = expr();
				setState(2366);
				match(T_COMMA);
				setState(2367);
				((Misc_funcContext)_localctx).method_name_expr = expr();
				setState(2372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2368);
					match(T_COMMA);
					setState(2369);
					((Misc_funcContext)_localctx).expr = expr();
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2375);
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
				setState(2379);
				match(T_HASH);
				setState(2380);
				match(T_OPEN_P);
				setState(2381);
				((Misc_funcContext)_localctx).expr = expr();
				((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
				setState(2386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2382);
					match(T_COMMA);
					setState(2383);
					((Misc_funcContext)_localctx).expr = expr();
					((Misc_funcContext)_localctx).exprs.add(((Misc_funcContext)_localctx).expr);
					}
					}
					setState(2388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2389);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Misc_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Misc_funcContext)_localctx).res =  hql_list_param_func("HASH", "expr_list", expr_list_json);
				    
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2392);
				match(T_CURRENT_USER);
				setState(2393);
				match(T_OPEN_P);
				setState(2394);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("CURRENT_USER"); 
				}
				break;
			case T_LOGGED_IN_USER:
				enterOuterAlt(_localctx, 5);
				{
				setState(2396);
				match(T_LOGGED_IN_USER);
				setState(2397);
				match(T_OPEN_P);
				setState(2398);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_fixed_func("LOGGED_IN_USER"); 
				}
				break;
			case T_CURRENT_DATABASE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2400);
				match(T_CURRENT_DATABASE);
				setState(2401);
				match(T_OPEN_P);
				setState(2402);
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
				setState(2404);
				((Misc_funcContext)_localctx).f_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 381)) & ~0x3f) == 0 && ((1L << (_la - 381)) & ((1L << (T_MD5 - 381)) | (1L << (T_SHA1 - 381)) | (1L << (T_SHA - 381)))) != 0) || _la==T_CRC32) ) {
					((Misc_funcContext)_localctx).f_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2405);
				match(T_OPEN_P);
				setState(2406);
				((Misc_funcContext)_localctx).str_expr = expr();
				setState(2407);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_single_param_func((((Misc_funcContext)_localctx).f_name!=null?((Misc_funcContext)_localctx).f_name.getText():null), "string", ((Misc_funcContext)_localctx).str_expr.res); 
				}
				break;
			case T_SHA2:
				enterOuterAlt(_localctx, 8);
				{
				setState(2410);
				match(T_SHA2);
				setState(2411);
				match(T_OPEN_P);
				setState(2412);
				((Misc_funcContext)_localctx).str_expr = expr();
				setState(2413);
				match(T_COMMA);
				setState(2414);
				((Misc_funcContext)_localctx).n_expr = expr();
				setState(2415);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "string", ((Misc_funcContext)_localctx).str_expr.res, "hash_size", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_ENCRYPT:
				enterOuterAlt(_localctx, 9);
				{
				setState(2418);
				match(T_AES_ENCRYPT);
				setState(2419);
				match(T_OPEN_P);
				setState(2420);
				((Misc_funcContext)_localctx).str_expr = expr();
				setState(2421);
				match(T_COMMA);
				setState(2422);
				((Misc_funcContext)_localctx).n_expr = expr();
				setState(2423);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_AES_DECRYPT:
				enterOuterAlt(_localctx, 10);
				{
				setState(2426);
				match(T_AES_DECRYPT);
				setState(2427);
				match(T_OPEN_P);
				setState(2428);
				((Misc_funcContext)_localctx).str_expr = expr();
				setState(2429);
				match(T_COMMA);
				setState(2430);
				((Misc_funcContext)_localctx).n_expr = expr();
				setState(2431);
				match(T_CLOSE_P);
				 ((Misc_funcContext)_localctx).res =  hql_double_param_func("SHA2", "input", ((Misc_funcContext)_localctx).str_expr.res, "key", ((Misc_funcContext)_localctx).n_expr.res); 
				}
				break;
			case T_VERSION:
				enterOuterAlt(_localctx, 11);
				{
				setState(2434);
				match(T_VERSION);
				setState(2435);
				match(T_OPEN_P);
				setState(2436);
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
				setState(2438);
				((Misc_funcContext)_localctx).f_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 504)) & ~0x3f) == 0 && ((1L << (_la - 504)) & ((1L << (T_XPATH - 504)) | (1L << (T_XPATH_BOOLEAN - 504)) | (1L << (T_XPATH_DOUBLE - 504)) | (1L << (T_XPATH_FLOAT - 504)) | (1L << (T_XPATH_INT - 504)) | (1L << (T_XPATH_LONG - 504)) | (1L << (T_XPATH_NUMBER - 504)) | (1L << (T_XPATH_SHORT - 504)) | (1L << (T_XPATH_STRING - 504)))) != 0)) ) {
					((Misc_funcContext)_localctx).f_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2439);
				match(T_OPEN_P);
				setState(2440);
				((Misc_funcContext)_localctx).xml_str_expr = expr();
				setState(2441);
				match(T_COMMA);
				setState(2442);
				((Misc_funcContext)_localctx).xpath_expr_str = expr();
				setState(2443);
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
		enterRule(_localctx, 208, RULE_expr_concat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 vector<Expr_concat_itemContext*> exprs; 
			setState(2449);
			((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
			((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
			setState(2452); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2450);
					match(T_PIPE);
					setState(2451);
					((Expr_concatContext)_localctx).expr_concat_item = expr_concat_item();
					((Expr_concatContext)_localctx).expr_concat_items.add(((Expr_concatContext)_localctx).expr_concat_item);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2454); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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
		enterRule(_localctx, 210, RULE_expr_concat_item);
		try {
			setState(2496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2458);
				((Expr_concat_itemContext)_localctx).literal_values = literal_values();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).literal_values.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2461);
				((Expr_concat_itemContext)_localctx).ident = ident();
				 ((Expr_concat_itemContext)_localctx).res =   ((Expr_concat_itemContext)_localctx).ident.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2464);
				match(T_OPEN_P);
				setState(2465);
				((Expr_concat_itemContext)_localctx).expr = expr();
				setState(2466);
				match(T_CLOSE_P);
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr.res; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2469);
				((Expr_concat_itemContext)_localctx).dat_convrt_func = dat_convrt_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).dat_convrt_func.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2472);
				((Expr_concat_itemContext)_localctx).math_func = math_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).math_func.res; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2475);
				((Expr_concat_itemContext)_localctx).date_func = date_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).date_func.res; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2478);
				((Expr_concat_itemContext)_localctx).cond_func = cond_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).cond_func.res; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2481);
				((Expr_concat_itemContext)_localctx).str_func = str_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).str_func.res; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2484);
				((Expr_concat_itemContext)_localctx).misc_func = misc_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).misc_func.res; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2487);
				((Expr_concat_itemContext)_localctx).aggr_func = aggr_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).aggr_func.res; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2490);
				((Expr_concat_itemContext)_localctx).use_var = use_var();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).use_var.res; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2493);
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
		enterRule(_localctx, 212, RULE_cond_func);
		int _la;
		try {
			setState(2617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2498);
				match(T_IF);
				setState(2499);
				match(T_OPEN_P);
				setState(2500);
				((Cond_funcContext)_localctx).test_cond = expr();
				setState(2501);
				match(T_COMMA);
				setState(2502);
				((Cond_funcContext)_localctx).valueTrue = expr();
				setState(2503);
				match(T_COMMA);
				setState(2504);
				((Cond_funcContext)_localctx).valueFalse = expr();
				setState(2505);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_three_param_func("IF", "test_cond", ((Cond_funcContext)_localctx).test_cond.res, "value_true", ((Cond_funcContext)_localctx).valueTrue.res, "value_false", ((Cond_funcContext)_localctx).valueFalse.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2508);
				match(T_ISNULL);
				setState(2509);
				match(T_OPEN_P);
				setState(2510);
				((Cond_funcContext)_localctx).expr = expr();
				setState(2511);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2514);
				match(T_ISNOTNULL);
				setState(2515);
				match(T_OPEN_P);
				setState(2516);
				((Cond_funcContext)_localctx).expr = expr();
				setState(2517);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_single_param_func("ISNOTNULL", "expr", ((Cond_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2520);
				match(T_NVL);
				setState(2521);
				match(T_OPEN_P);
				setState(2522);
				((Cond_funcContext)_localctx).expr_val = expr();
				setState(2523);
				match(T_COMMA);
				setState(2524);
				((Cond_funcContext)_localctx).default_val = expr();
				setState(2525);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NVL", "expr_val", ((Cond_funcContext)_localctx).expr_val.res, "default_val", ((Cond_funcContext)_localctx).default_val.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 vector<ExprContext*> exprs; 
				setState(2529);
				match(T_COALESCE);
				setState(2530);
				match(T_OPEN_P);
				setState(2531);
				((Cond_funcContext)_localctx).expr = expr();
				((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
				setState(2534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2532);
					match(T_COMMA);
					setState(2533);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2536); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_COMMA );
				setState(2538);
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
				setState(2542);
				match(T_CASE);
				setState(2543);
				((Cond_funcContext)_localctx).case_expr = expr();
				setState(2549); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2544);
					match(T_WHEN);
					setState(2545);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2546);
					match(T_THEN);
					setState(2547);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2551); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2553);
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
				setState(2557);
				match(T_CASE);
				setState(2558);
				((Cond_funcContext)_localctx).case_expr = expr();
				setState(2564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2559);
					match(T_WHEN);
					setState(2560);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2561);
					match(T_THEN);
					setState(2562);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2568);
				match(T_ELSE);
				setState(2569);
				((Cond_funcContext)_localctx).els_expr = expr();
				setState(2570);
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
				setState(2574);
				match(T_CASE);
				setState(2580); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2575);
					match(T_WHEN);
					setState(2576);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2577);
					match(T_THEN);
					setState(2578);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2582); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2584);
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
				setState(2588);
				match(T_CASE);
				setState(2594); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2589);
					match(T_WHEN);
					setState(2590);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).when_exprs.add(((Cond_funcContext)_localctx).expr);
					setState(2591);
					match(T_THEN);
					setState(2592);
					((Cond_funcContext)_localctx).expr = expr();
					((Cond_funcContext)_localctx).then_exprs.add(((Cond_funcContext)_localctx).expr);
					}
					}
					setState(2596); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_WHEN );
				setState(2598);
				match(T_ELSE);
				setState(2599);
				((Cond_funcContext)_localctx).els_expr = expr();
				setState(2600);
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
				setState(2603);
				match(T_NULLIF);
				setState(2604);
				match(T_OPEN_P);
				setState(2605);
				((Cond_funcContext)_localctx).a_expr = expr();
				setState(2606);
				match(T_COMMA);
				setState(2607);
				((Cond_funcContext)_localctx).b_expr = expr();
				setState(2608);
				match(T_CLOSE_P);
				 ((Cond_funcContext)_localctx).res =  hql_double_param_func("NULLIF", "a_expr", ((Cond_funcContext)_localctx).a_expr.res, "b_expr", ((Cond_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2611);
				match(T_ASSERT_TRUE);
				setState(2612);
				match(T_OPEN_P);
				setState(2613);
				((Cond_funcContext)_localctx).expr = expr();
				setState(2614);
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
		enterRule(_localctx, 214, RULE_date_func);
		try {
			setState(2809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2619);
				match(T_FROM_UNIXTIME);
				setState(2620);
				match(T_OPEN_P);
				setState(2621);
				((Date_funcContext)_localctx).unix_time = expr();
				setState(2622);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("FROM_UNIXTIME", "unixtime", ((Date_funcContext)_localctx).unix_time.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2625);
				match(T_FROM_UNIXTIME);
				setState(2626);
				match(T_OPEN_P);
				setState(2627);
				((Date_funcContext)_localctx).unix_time = expr();
				setState(2628);
				match(T_COMMA);
				setState(2629);
				((Date_funcContext)_localctx).str_format = expr();
				setState(2630);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("FROM_UNIXTIME", "unixtime", ((Date_funcContext)_localctx).unix_time.res,"format",((Date_funcContext)_localctx).str_format.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2633);
				match(T_UNIX_TIMESTAMP);
				setState(2634);
				match(T_OPEN_P);
				setState(2635);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_fixed_func("UNIX_TIMESTAMP"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2637);
				match(T_UNIX_TIMESTAMP);
				setState(2638);
				match(T_OPEN_P);
				setState(2639);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2640);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2643);
				match(T_UNIX_TIMESTAMP);
				setState(2644);
				match(T_OPEN_P);
				setState(2645);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2646);
				match(T_COMMA);
				setState(2647);
				((Date_funcContext)_localctx).pattern_expr = expr();
				setState(2648);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("UNIX_TIMESTAMP", "date", ((Date_funcContext)_localctx).date_expr.res, "pattern", ((Date_funcContext)_localctx).pattern_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2651);
				match(T_YEAR);
				setState(2652);
				match(T_OPEN_P);
				setState(2653);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2654);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("YEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2657);
				match(T_QUARTER);
				setState(2658);
				match(T_OPEN_P);
				setState(2659);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2660);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("QUARTER", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2663);
				match(T_MONTH);
				setState(2664);
				match(T_OPEN_P);
				setState(2665);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2666);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MONTH", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2669);
				match(T_DAY);
				setState(2670);
				match(T_OPEN_P);
				setState(2671);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2672);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2675);
				match(T_HOUR);
				setState(2676);
				match(T_OPEN_P);
				setState(2677);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2678);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("HOUR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2681);
				match(T_MINUTE);
				setState(2682);
				match(T_OPEN_P);
				setState(2683);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2684);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("MINUTE", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2687);
				match(T_SECOND);
				setState(2688);
				match(T_OPEN_P);
				setState(2689);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2690);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("SECOND", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2693);
				match(T_WEEKOFYEAR);
				setState(2694);
				match(T_OPEN_P);
				setState(2695);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2696);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("WEEKOFYEAR", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2699);
				match(T_DATEDIFF);
				setState(2700);
				match(T_OPEN_P);
				setState(2701);
				((Date_funcContext)_localctx).enddate = expr();
				setState(2702);
				match(T_COMMA);
				setState(2703);
				((Date_funcContext)_localctx).startdate = expr();
				setState(2704);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "enddate", ((Date_funcContext)_localctx).enddate.res, "startdate", ((Date_funcContext)_localctx).startdate.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2707);
				match(T_DATE_ADD);
				setState(2708);
				match(T_OPEN_P);
				setState(2709);
				((Date_funcContext)_localctx).startdate = expr();
				setState(2710);
				match(T_COMMA);
				setState(2711);
				((Date_funcContext)_localctx).days = expr();
				setState(2712);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2715);
				match(T_DATE_SUB);
				setState(2716);
				match(T_OPEN_P);
				setState(2717);
				((Date_funcContext)_localctx).startdate = expr();
				setState(2718);
				match(T_COMMA);
				setState(2719);
				((Date_funcContext)_localctx).days = expr();
				setState(2720);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATEDIFF", "startdate", ((Date_funcContext)_localctx).startdate.res, "days", ((Date_funcContext)_localctx).days.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2723);
				match(T_TO_UTC_TIMESTAMP);
				setState(2724);
				match(T_OPEN_P);
				setState(2725);
				((Date_funcContext)_localctx).ts = expr();
				setState(2726);
				match(T_COMMA);
				setState(2727);
				((Date_funcContext)_localctx).timezone = expr();
				setState(2728);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TO_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2731);
				match(T_FROM_UTC_TIMESTAMP);
				setState(2732);
				match(T_OPEN_P);
				setState(2733);
				((Date_funcContext)_localctx).ts = expr();
				setState(2734);
				match(T_COMMA);
				setState(2735);
				((Date_funcContext)_localctx).timezone = expr();
				setState(2736);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("FROM_UTC_TIMESTAMP", "ts", ((Date_funcContext)_localctx).ts.res, "timezone", ((Date_funcContext)_localctx).timezone.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2739);
				match(T_CURRENT_DATE);
				setState(2742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(2740);
					match(T_OPEN_P);
					setState(2741);
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
				setState(2745);
				match(T_CURRENT_TIMESTAMP);
				setState(2748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(2746);
					match(T_OPEN_P);
					setState(2747);
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
				setState(2751);
				match(T_ADD_MONTHS);
				setState(2752);
				match(T_OPEN_P);
				setState(2753);
				((Date_funcContext)_localctx).startdate = expr();
				setState(2754);
				match(T_COMMA);
				setState(2755);
				((Date_funcContext)_localctx).num_months = expr();
				setState(2756);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2759);
				match(T_ADD_MONTHS);
				setState(2760);
				match(T_OPEN_P);
				setState(2761);
				((Date_funcContext)_localctx).startdate = expr();
				setState(2762);
				match(T_COMMA);
				setState(2763);
				((Date_funcContext)_localctx).num_months = expr();
				setState(2764);
				match(T_COMMA);
				setState(2765);
				((Date_funcContext)_localctx).out_date_format = expr();
				setState(2766);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_three_param_func("ADD_MONTHS", "startdate", ((Date_funcContext)_localctx).startdate.res, "num_months", ((Date_funcContext)_localctx).num_months.res, "out_date_format", ((Date_funcContext)_localctx).out_date_format.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2769);
				match(T_LAST_DAY);
				setState(2770);
				match(T_OPEN_P);
				setState(2771);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2772);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_single_param_func("LAST_DAY", "date", ((Date_funcContext)_localctx).date_expr.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2775);
				match(T_NEXT_DAY);
				setState(2776);
				match(T_OPEN_P);
				setState(2777);
				((Date_funcContext)_localctx).startdate = expr();
				setState(2778);
				match(T_COMMA);
				setState(2779);
				((Date_funcContext)_localctx).day_of_week = expr();
				setState(2780);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("NEXT_DAY", "startdate", ((Date_funcContext)_localctx).startdate.res, "day_of_week", ((Date_funcContext)_localctx).day_of_week.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2783);
				match(T_TRUNC);
				setState(2784);
				match(T_OPEN_P);
				setState(2785);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2786);
				match(T_COMMA);
				setState(2787);
				((Date_funcContext)_localctx).format = expr();
				setState(2788);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("TRUNC", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2791);
				match(T_MONTHS_BETWEEN);
				setState(2792);
				match(T_OPEN_P);
				setState(2793);
				((Date_funcContext)_localctx).date1 = expr();
				setState(2794);
				match(T_COMMA);
				setState(2795);
				((Date_funcContext)_localctx).date2 = expr();
				setState(2796);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("MONTHS_BETWEEN", "date1", ((Date_funcContext)_localctx).date1.res, "date2", ((Date_funcContext)_localctx).date2.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2799);
				match(T_DATE_FORMAT);
				setState(2800);
				match(T_OPEN_P);
				setState(2801);
				((Date_funcContext)_localctx).date_expr = expr();
				setState(2802);
				match(T_COMMA);
				setState(2803);
				((Date_funcContext)_localctx).format = expr();
				setState(2804);
				match(T_CLOSE_P);
				 ((Date_funcContext)_localctx).res =  hql_double_param_func("DATE_FORMAT", "date", ((Date_funcContext)_localctx).date_expr.res, "format", ((Date_funcContext)_localctx).format.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2807);
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
		enterRule(_localctx, 216, RULE_dat_convrt_func);
		int _la;
		try {
			setState(2828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2811);
				match(T_CAST);
				setState(2812);
				match(T_OPEN_P);
				setState(2813);
				((Dat_convrt_funcContext)_localctx).expr = expr();
				setState(2814);
				match(T_AS);
				setState(2815);
				((Dat_convrt_funcContext)_localctx).primitive_type = primitive_type();
				setState(2817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2816);
					dtype_len();
					}
				}

				setState(2819);
				match(T_CLOSE_P);
				 ((Dat_convrt_funcContext)_localctx).res =  hql_cast_func(((Dat_convrt_funcContext)_localctx).expr.res, ((Dat_convrt_funcContext)_localctx).primitive_type.res); 
				}
				break;
			case T_BINARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2822);
				match(T_BINARY);
				setState(2823);
				match(T_OPEN_P);
				setState(2824);
				((Dat_convrt_funcContext)_localctx).expr = expr();
				setState(2825);
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
		public TerminalNode T_MULT_S() { return getToken(HiveParser.T_MULT_S, 0); }
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
		enterRule(_localctx, 218, RULE_basic_aggr_func);
		int _la;
		try {
			setState(2888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2830);
				match(T_COUNT);
				setState(2831);
				match(T_OPEN_P);
				setState(2832);
				((Basic_aggr_funcContext)_localctx).r = expr();
				setState(2833);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_count_func(((Basic_aggr_funcContext)_localctx).r.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 vector<ExprContext*> exprs; 
				setState(2837);
				match(T_COUNT);
				setState(2838);
				match(T_OPEN_P);
				setState(2839);
				match(T_DISTINCT);
				setState(2840);
				((Basic_aggr_funcContext)_localctx).expr = expr();
				((Basic_aggr_funcContext)_localctx).exprs.add(((Basic_aggr_funcContext)_localctx).expr);
				setState(2845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2841);
					match(T_COMMA);
					setState(2842);
					((Basic_aggr_funcContext)_localctx).expr = expr();
					((Basic_aggr_funcContext)_localctx).exprs.add(((Basic_aggr_funcContext)_localctx).expr);
					}
					}
					setState(2847);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2848);
				match(T_CLOSE_P);

				        vector<json> expr_list_json;
				        for (ExprContext* exp_contxt : ((Basic_aggr_funcContext)_localctx).exprs){ expr_list_json.push_back(exp_contxt->res); }
				        ((Basic_aggr_funcContext)_localctx).res =  hql_single_param_list_func("COUNT", "flag_distinct", true, "expr_list", expr_list_json);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2851);
				match(T_COUNT);
				setState(2852);
				match(T_OPEN_P);
				setState(2853);
				match(T_MULT_S);
				setState(2854);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_count_all_func(); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2856);
				match(T_SUM);
				setState(2857);
				match(T_OPEN_P);
				setState(2858);
				((Basic_aggr_funcContext)_localctx).expr = expr();
				setState(2859);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", false, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2862);
				match(T_SUM);
				setState(2863);
				match(T_OPEN_P);
				setState(2864);
				match(T_DISTINCT);
				setState(2865);
				((Basic_aggr_funcContext)_localctx).expr = expr();
				setState(2866);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("SUM", "flag_distinct", true, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2869);
				match(T_AVG);
				setState(2870);
				match(T_OPEN_P);
				setState(2871);
				((Basic_aggr_funcContext)_localctx).expr = expr();
				setState(2872);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", false, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2875);
				match(T_AVG);
				setState(2876);
				match(T_OPEN_P);
				setState(2877);
				match(T_DISTINCT);
				setState(2878);
				((Basic_aggr_funcContext)_localctx).expr = expr();
				setState(2879);
				match(T_CLOSE_P);
				 ((Basic_aggr_funcContext)_localctx).res =  hql_double_param_func("AVG", "flag_distinct", true, "col", ((Basic_aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2882);
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
				setState(2883);
				match(T_OPEN_P);
				setState(2884);
				((Basic_aggr_funcContext)_localctx).expr = expr();
				setState(2885);
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
		enterRule(_localctx, 220, RULE_aggr_func);
		int _la;
		try {
			setState(2961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2890);
				((Aggr_funcContext)_localctx).basic_aggr_func = basic_aggr_func();
				 ((Aggr_funcContext)_localctx).res =  ((Aggr_funcContext)_localctx).basic_aggr_func.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2893);
				((Aggr_funcContext)_localctx).fun_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (T_VARIANCE - 386)) | (1L << (T_VAR_POP - 386)) | (1L << (T_VAR_SAMP - 386)))) != 0) || _la==T_STDDEV_POP || _la==T_STDDEV_SAMP) ) {
					((Aggr_funcContext)_localctx).fun_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2894);
				match(T_OPEN_P);
				setState(2895);
				((Aggr_funcContext)_localctx).expr = expr();
				setState(2896);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2899);
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
				setState(2900);
				match(T_OPEN_P);
				setState(2901);
				((Aggr_funcContext)_localctx).col1 = expr();
				setState(2902);
				match(T_COMMA);
				setState(2903);
				((Aggr_funcContext)_localctx).col2 = expr();
				setState(2904);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).fun_name!=null?((Aggr_funcContext)_localctx).fun_name.getText():null), "col1", ((Aggr_funcContext)_localctx).col1.res, "col2", ((Aggr_funcContext)_localctx).col2.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2907);
				match(T_PERCENTILE);
				setState(2908);
				match(T_OPEN_P);
				setState(2909);
				((Aggr_funcContext)_localctx).col = expr();
				setState(2910);
				match(T_COMMA);
				setState(2911);
				((Aggr_funcContext)_localctx).p_expr = expr();
				setState(2912);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2915);
				match(T_PERCENTILE_APPROX);
				setState(2916);
				match(T_OPEN_P);
				setState(2917);
				((Aggr_funcContext)_localctx).col = expr();
				setState(2918);
				match(T_COMMA);
				setState(2919);
				((Aggr_funcContext)_localctx).p_expr = expr();
				setState(2920);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2923);
				match(T_PERCENTILE_APPROX);
				setState(2924);
				match(T_OPEN_P);
				setState(2925);
				((Aggr_funcContext)_localctx).col = expr();
				setState(2926);
				match(T_COMMA);
				setState(2927);
				((Aggr_funcContext)_localctx).p_expr = expr();
				setState(2928);
				match(T_COMMA);
				setState(2929);
				((Aggr_funcContext)_localctx).b_expr = expr();
				setState(2930);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_three_param_func("PERCENTILE_APPROX", "col", ((Aggr_funcContext)_localctx).col.res, "percentile", ((Aggr_funcContext)_localctx).p_expr.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2933);
				((Aggr_funcContext)_localctx).func_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 335)) & ~0x3f) == 0 && ((1L << (_la - 335)) & ((1L << (T_REGR_SXX - 335)) | (1L << (T_REGR_COUNT - 335)) | (1L << (T_REGR_INTERCEPT - 335)))) != 0) || ((((_la - 414)) & ~0x3f) == 0 && ((1L << (_la - 414)) & ((1L << (T_REGR_AVGX - 414)) | (1L << (T_REGR_SYY - 414)) | (1L << (T_REGR_R2 - 414)))) != 0) || ((((_la - 478)) & ~0x3f) == 0 && ((1L << (_la - 478)) & ((1L << (T_REGR_AVGY - 478)) | (1L << (T_REGR_SLOPE - 478)) | (1L << (T_REGR_SXY - 478)))) != 0)) ) {
					((Aggr_funcContext)_localctx).func_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2934);
				match(T_OPEN_P);
				setState(2935);
				((Aggr_funcContext)_localctx).indep = expr();
				setState(2936);
				match(T_COMMA);
				setState(2937);
				((Aggr_funcContext)_localctx).dep = expr();
				setState(2938);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "independent", ((Aggr_funcContext)_localctx).indep.res, "dependent", ((Aggr_funcContext)_localctx).dep.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2941);
				match(T_HISTOGRAM_NUMERIC);
				setState(2942);
				match(T_OPEN_P);
				setState(2943);
				((Aggr_funcContext)_localctx).col = expr();
				setState(2944);
				match(T_COMMA);
				setState(2945);
				((Aggr_funcContext)_localctx).b_expr = expr();
				setState(2946);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_double_param_func("HISTOGRAM_NUMERIC", "col", ((Aggr_funcContext)_localctx).col.res, "b", ((Aggr_funcContext)_localctx).b_expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2949);
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
				setState(2950);
				match(T_OPEN_P);
				setState(2951);
				((Aggr_funcContext)_localctx).expr = expr();
				setState(2952);
				match(T_CLOSE_P);
				 ((Aggr_funcContext)_localctx).res =  hql_single_param_func((((Aggr_funcContext)_localctx).func_name!=null?((Aggr_funcContext)_localctx).func_name.getText():null), "col", ((Aggr_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2955);
				match(T_NTILE);
				setState(2956);
				match(T_OPEN_P);
				setState(2957);
				((Aggr_funcContext)_localctx).expr = expr();
				setState(2958);
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
		enterRule(_localctx, 222, RULE_tab_generate_func);
		try {
			setState(2981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EXPLODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2963);
				match(T_EXPLODE);
				setState(2964);
				match(T_OPEN_P);
				setState(2965);
				((Tab_generate_funcContext)_localctx).expr = expr();
				setState(2966);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("EXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_POSEXPLODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2969);
				match(T_POSEXPLODE);
				setState(2970);
				match(T_OPEN_P);
				setState(2971);
				((Tab_generate_funcContext)_localctx).expr = expr();
				setState(2972);
				match(T_CLOSE_P);
				 ((Tab_generate_funcContext)_localctx).res =  hql_single_param_func("POSEXPLODE", "expr", ((Tab_generate_funcContext)_localctx).expr.res); 
				}
				break;
			case T_INLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2975);
				match(T_INLINE);
				setState(2976);
				match(T_OPEN_P);
				setState(2977);
				((Tab_generate_funcContext)_localctx).expr = expr();
				setState(2978);
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
		enterRule(_localctx, 224, RULE_math_func);
		int _la;
		try {
			setState(3193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2983);
				match(T_ROUND);
				setState(2984);
				match(T_OPEN_P);
				setState(2985);
				((Math_funcContext)_localctx).expr = expr();
				setState(2986);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ROUND", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2989);
				match(T_ROUND);
				setState(2990);
				match(T_OPEN_P);
				setState(2991);
				((Math_funcContext)_localctx).fst = expr();
				setState(2992);
				match(T_COMMA);
				setState(2993);
				((Math_funcContext)_localctx).snd = expr();
				setState(2994);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("ROUND", "expr", ((Math_funcContext)_localctx).fst.res, "decimal_places", ((Math_funcContext)_localctx).snd.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2997);
				match(T_FLOOR);
				setState(2998);
				match(T_OPEN_P);
				setState(2999);
				((Math_funcContext)_localctx).expr = expr();
				setState(3000);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FLOOR", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3003);
				_la = _input.LA(1);
				if ( !(_la==T_CEIL || _la==T_CEILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3004);
				match(T_OPEN_P);
				setState(3005);
				((Math_funcContext)_localctx).expr = expr();
				setState(3006);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("CEIL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3009);
				((Math_funcContext)_localctx).T_RAND = match(T_RAND);
				setState(3010);
				match(T_OPEN_P);
				setState(3011);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func((((Math_funcContext)_localctx).T_RAND!=null?((Math_funcContext)_localctx).T_RAND.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3013);
				match(T_RAND);
				setState(3014);
				match(T_OPEN_P);
				setState(3015);
				((Math_funcContext)_localctx).expr = expr();
				setState(3016);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RAND", "seed", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3019);
				match(T_EXP);
				setState(3020);
				match(T_OPEN_P);
				setState(3021);
				((Math_funcContext)_localctx).expr = expr();
				setState(3022);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("EXP", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3025);
				match(T_LN);
				setState(3026);
				match(T_OPEN_P);
				setState(3027);
				((Math_funcContext)_localctx).expr = expr();
				setState(3028);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3031);
				match(T_LOG10);
				setState(3032);
				match(T_OPEN_P);
				setState(3033);
				((Math_funcContext)_localctx).expr = expr();
				setState(3034);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG10", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3037);
				match(T_LOG2);
				setState(3038);
				match(T_OPEN_P);
				setState(3039);
				((Math_funcContext)_localctx).expr = expr();
				setState(3040);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("LOG2", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3043);
				match(T_LOG);
				setState(3044);
				match(T_OPEN_P);
				setState(3045);
				((Math_funcContext)_localctx).base = expr();
				setState(3046);
				match(T_COMMA);
				setState(3047);
				((Math_funcContext)_localctx).e = expr();
				setState(3048);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("LOG", "base", ((Math_funcContext)_localctx).base.res, "expr", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3051);
				_la = _input.LA(1);
				if ( !(_la==T_POW || _la==T_POWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3052);
				match(T_OPEN_P);
				setState(3053);
				((Math_funcContext)_localctx).base = expr();
				setState(3054);
				match(T_COMMA);
				setState(3055);
				((Math_funcContext)_localctx).e = expr();
				setState(3056);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("POWER", "base", ((Math_funcContext)_localctx).base.res, "exp", ((Math_funcContext)_localctx).e.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3059);
				match(T_SQRT);
				setState(3060);
				match(T_OPEN_P);
				setState(3061);
				((Math_funcContext)_localctx).expr = expr();
				setState(3062);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SQRT", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3065);
				match(T_BIN);
				setState(3066);
				match(T_OPEN_P);
				setState(3067);
				((Math_funcContext)_localctx).expr = expr();
				setState(3068);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("BIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3071);
				match(T_HEX);
				setState(3072);
				match(T_OPEN_P);
				setState(3073);
				((Math_funcContext)_localctx).expr = expr();
				setState(3074);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("HEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3077);
				match(T_UNHEX);
				setState(3078);
				match(T_OPEN_P);
				setState(3079);
				((Math_funcContext)_localctx).expr = expr();
				setState(3080);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("UNHEX", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3083);
				match(T_CONV);
				setState(3084);
				match(T_OPEN_P);
				setState(3085);
				((Math_funcContext)_localctx).e = expr();
				setState(3086);
				match(T_COMMA);
				setState(3087);
				((Math_funcContext)_localctx).fbase = expr();
				setState(3088);
				match(T_COMMA);
				setState(3089);
				((Math_funcContext)_localctx).tbase = expr();
				setState(3090);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_three_param_func("CONV", "expr", ((Math_funcContext)_localctx).e.res, "from_base", ((Math_funcContext)_localctx).fbase.res, "to_base", ((Math_funcContext)_localctx).tbase.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3093);
				match(T_ABS);
				setState(3094);
				match(T_OPEN_P);
				setState(3095);
				((Math_funcContext)_localctx).expr = expr();
				setState(3096);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ABS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3099);
				match(T_PMOD);
				setState(3100);
				match(T_OPEN_P);
				setState(3101);
				((Math_funcContext)_localctx).a = expr();
				setState(3102);
				match(T_COMMA);
				setState(3103);
				((Math_funcContext)_localctx).b = expr();
				setState(3104);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_double_param_func("PMOD", "a", ((Math_funcContext)_localctx).a.res, "b", ((Math_funcContext)_localctx).b.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3107);
				match(T_SIN);
				setState(3108);
				match(T_OPEN_P);
				setState(3109);
				((Math_funcContext)_localctx).expr = expr();
				setState(3110);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(3113);
				match(T_ASIN);
				setState(3114);
				match(T_OPEN_P);
				setState(3115);
				((Math_funcContext)_localctx).expr = expr();
				setState(3116);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ASIN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(3119);
				match(T_COS);
				setState(3120);
				match(T_OPEN_P);
				setState(3121);
				((Math_funcContext)_localctx).expr = expr();
				setState(3122);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("COS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(3125);
				match(T_ACOS);
				setState(3126);
				match(T_OPEN_P);
				setState(3127);
				((Math_funcContext)_localctx).expr = expr();
				setState(3128);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ACOS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(3131);
				match(T_TAN);
				setState(3132);
				match(T_OPEN_P);
				setState(3133);
				((Math_funcContext)_localctx).expr = expr();
				setState(3134);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("TAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(3137);
				match(T_ATAN);
				setState(3138);
				match(T_OPEN_P);
				setState(3139);
				((Math_funcContext)_localctx).expr = expr();
				setState(3140);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("ATAN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(3143);
				match(T_DEGREES);
				setState(3144);
				match(T_OPEN_P);
				setState(3145);
				((Math_funcContext)_localctx).expr = expr();
				setState(3146);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("DEGREES", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(3149);
				match(T_RADIANS);
				setState(3150);
				match(T_OPEN_P);
				setState(3151);
				((Math_funcContext)_localctx).expr = expr();
				setState(3152);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("RADIANS", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(3155);
				match(T_POSITIVE);
				setState(3156);
				match(T_OPEN_P);
				setState(3157);
				((Math_funcContext)_localctx).expr = expr();
				setState(3158);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("POSITIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(3161);
				match(T_NEGATIVE);
				setState(3162);
				match(T_OPEN_P);
				setState(3163);
				((Math_funcContext)_localctx).expr = expr();
				setState(3164);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("NEGATIVE", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(3167);
				match(T_SIGN);
				setState(3168);
				match(T_OPEN_P);
				setState(3169);
				((Math_funcContext)_localctx).expr = expr();
				setState(3170);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("SIGN", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(3173);
				match(T_E);
				setState(3174);
				match(T_OPEN_P);
				setState(3175);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("EULER_CONST"); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(3177);
				match(T_PI);
				setState(3178);
				match(T_OPEN_P);
				setState(3179);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_fixed_func("PI_CONST"); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(3181);
				match(T_FACTORIAL);
				setState(3182);
				match(T_OPEN_P);
				setState(3183);
				((Math_funcContext)_localctx).expr = expr();
				setState(3184);
				match(T_CLOSE_P);
				 ((Math_funcContext)_localctx).res =  hql_single_param_func("FACTORIAL", "expr", ((Math_funcContext)_localctx).expr.res); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(3187);
				match(T_CBRT);
				setState(3188);
				match(T_OPEN_P);
				setState(3189);
				((Math_funcContext)_localctx).expr = expr();
				setState(3190);
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
		enterRule(_localctx, 226, RULE_generic_function);
		try {
			setState(3205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3195);
				((Generic_functionContext)_localctx).database_name = complex_atom_name();
				setState(3196);
				match(T__1);
				setState(3197);
				((Generic_functionContext)_localctx).function_name = complex_atom_name();
				setState(3198);
				((Generic_functionContext)_localctx).expr_list = expr_list();
				 ((Generic_functionContext)_localctx).res =  hql_generic_function(((Generic_functionContext)_localctx).database_name.res, ((Generic_functionContext)_localctx).function_name.res, ((Generic_functionContext)_localctx).expr_list.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3201);
				((Generic_functionContext)_localctx).function_name = complex_atom_name();
				setState(3202);
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
		enterRule(_localctx, 228, RULE_literal_values);
		try {
			setState(3223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3207);
				((Literal_valuesContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_string_type((((Literal_valuesContext)_localctx).STRING_LITERAL!=null?((Literal_valuesContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3209);
				((Literal_valuesContext)_localctx).DECIMAL_LITERAL = match(DECIMAL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_decimal_type((((Literal_valuesContext)_localctx).DECIMAL_LITERAL!=null?((Literal_valuesContext)_localctx).DECIMAL_LITERAL.getText():null)); 
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(3211);
				((Literal_valuesContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_int_type((((Literal_valuesContext)_localctx).INT_LITERAL!=null?((Literal_valuesContext)_localctx).INT_LITERAL.getText():null)); 
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(3213);
				((Literal_valuesContext)_localctx).BOOL_LITERAL = match(BOOL_LITERAL);
				 ((Literal_valuesContext)_localctx).res =  hql_boolean_type((((Literal_valuesContext)_localctx).BOOL_LITERAL!=null?((Literal_valuesContext)_localctx).BOOL_LITERAL.getText():null)); 
				}
				break;
			case NULL_CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(3215);
				match(NULL_CONST);
				 ((Literal_valuesContext)_localctx).res =  hql_null_constant(); 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(3217);
				((Literal_valuesContext)_localctx).date_literal = date_literal();
				 ((Literal_valuesContext)_localctx).res =  hql_type_date_literal(((Literal_valuesContext)_localctx).date_literal.res); 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(3220);
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
		enterRule(_localctx, 230, RULE_ident);
		try {
			setState(3243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(3225);
				((IdentContext)_localctx).database = name_identifier();
				setState(3226);
				match(T__1);
				}
				{
				setState(3228);
				((IdentContext)_localctx).tablename = name_identifier();
				setState(3229);
				match(T__1);
				}
				setState(3231);
				((IdentContext)_localctx).field = name_identifier();
				 ((IdentContext)_localctx).res =  hql_type_identifier(((IdentContext)_localctx).database.res, ((IdentContext)_localctx).tablename.res, ((IdentContext)_localctx).field.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(3234);
				((IdentContext)_localctx).tablename = name_identifier();
				setState(3235);
				match(T__1);
				}
				setState(3237);
				((IdentContext)_localctx).field = name_identifier();
				 ((IdentContext)_localctx).res =  hql_type_identifier(string(), ((IdentContext)_localctx).tablename.res, ((IdentContext)_localctx).field.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3240);
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
		enterRule(_localctx, 232, RULE_tab_ident);
		try {
			setState(3253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3245);
				((Tab_identContext)_localctx).database = complex_name();
				setState(3246);
				match(T__1);
				setState(3247);
				((Tab_identContext)_localctx).tablename = complex_name();
				 ((Tab_identContext)_localctx).res =  hql_type_table_identifier(((Tab_identContext)_localctx).database.res, ((Tab_identContext)_localctx).tablename.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3250);
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
		enterRule(_localctx, 234, RULE_complex_name);
		try {
			int _alt;
			setState(3268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3255);
				((Complex_nameContext)_localctx).complex_atom_name = complex_atom_name();
				 ((Complex_nameContext)_localctx).res =  ((Complex_nameContext)_localctx).complex_atom_name.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				vector<Complex_atom_nameContext*> name_list; 
				setState(3262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3259);
						((Complex_nameContext)_localctx).complex_atom_name = complex_atom_name();
						((Complex_nameContext)_localctx).name_list.add(((Complex_nameContext)_localctx).complex_atom_name);
						}
						} 
					}
					setState(3264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				}
				setState(3265);
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
		enterRule(_localctx, 236, RULE_complex_atom_name);
		try {
			setState(3276);
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
				setState(3270);
				((Complex_atom_nameContext)_localctx).name_identifier = name_identifier();
				 ((Complex_atom_nameContext)_localctx).res =  ((Complex_atom_nameContext)_localctx).name_identifier.res; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(3273);
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
		enterRule(_localctx, 238, RULE_name_identifier);
		try {
			setState(3283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(3278);
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
				setState(3280);
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
		enterRule(_localctx, 240, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3285);
			match(T_DATE);
			setState(3286);
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
		enterRule(_localctx, 242, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3289);
			match(T_TIMESTAMP);
			setState(3290);
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
		enterRule(_localctx, 244, RULE_set_operators_is);
		try {
			setState(3298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3293);
				match(T_IS);
				 ((Set_operators_isContext)_localctx).res =  "IS"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3295);
				match(T_IS);
				setState(3296);
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
		enterRule(_localctx, 246, RULE_set_operators_like);
		try {
			setState(3309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3300);
				match(T_LIKE);
				 ((Set_operators_likeContext)_localctx).res =  "LIKE"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3302);
				match(T_NOT);
				setState(3303);
				match(T_LIKE);
				 ((Set_operators_likeContext)_localctx).res =  "NOT_LIKE"; 
				}
				break;
			case T_RLIKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3305);
				match(T_RLIKE);
				 ((Set_operators_likeContext)_localctx).res =  "RLIKE"; 
				}
				break;
			case T_REGEXP:
				enterOuterAlt(_localctx, 4);
				{
				setState(3307);
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
		enterRule(_localctx, 248, RULE_set_operators_in);
		try {
			setState(3316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(3311);
				match(T_IN);
				 ((Set_operators_inContext)_localctx).res =  "IN"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3313);
				match(T_NOT);
				setState(3314);
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
		enterRule(_localctx, 250, RULE_set_operators_exists);
		try {
			setState(3323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EXISTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(3318);
				match(T_EXISTS);
				 ((Set_operators_existsContext)_localctx).res =  "EXISTS"; 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3320);
				match(T_NOT);
				setState(3321);
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
		enterRule(_localctx, 252, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3325);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T_NOT || _la==T_ADD_S || _la==T_SUB_S) ) {
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
		enterRule(_localctx, 254, RULE_reserved_words);
		try {
			setState(3603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3327);
				((Reserved_wordsContext)_localctx).T_ALL = match(T_ALL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ALL!=null?((Reserved_wordsContext)_localctx).T_ALL.getText():null); 
				}
				break;
			case T_ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(3329);
				((Reserved_wordsContext)_localctx).T_ALTER = match(T_ALTER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ALTER!=null?((Reserved_wordsContext)_localctx).T_ALTER.getText():null); 
				}
				break;
			case T_AND:
				enterOuterAlt(_localctx, 3);
				{
				setState(3331);
				((Reserved_wordsContext)_localctx).T_AND = match(T_AND);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_AND!=null?((Reserved_wordsContext)_localctx).T_AND.getText():null); 
				}
				break;
			case T_ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(3333);
				((Reserved_wordsContext)_localctx).T_ARRAY = match(T_ARRAY);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ARRAY!=null?((Reserved_wordsContext)_localctx).T_ARRAY.getText():null); 
				}
				break;
			case T_AS:
				enterOuterAlt(_localctx, 5);
				{
				setState(3335);
				((Reserved_wordsContext)_localctx).T_AS = match(T_AS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_AS!=null?((Reserved_wordsContext)_localctx).T_AS.getText():null); 
				}
				break;
			case T_AUTHORIZATION:
				enterOuterAlt(_localctx, 6);
				{
				setState(3337);
				((Reserved_wordsContext)_localctx).T_AUTHORIZATION = match(T_AUTHORIZATION);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_AUTHORIZATION!=null?((Reserved_wordsContext)_localctx).T_AUTHORIZATION.getText():null); 
				}
				break;
			case T_BETWEEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(3339);
				((Reserved_wordsContext)_localctx).T_BETWEEN = match(T_BETWEEN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BETWEEN!=null?((Reserved_wordsContext)_localctx).T_BETWEEN.getText():null); 
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(3341);
				((Reserved_wordsContext)_localctx).T_BIGINT = match(T_BIGINT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BIGINT!=null?((Reserved_wordsContext)_localctx).T_BIGINT.getText():null); 
				}
				break;
			case T_BINARY:
				enterOuterAlt(_localctx, 9);
				{
				setState(3343);
				((Reserved_wordsContext)_localctx).T_BINARY = match(T_BINARY);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BINARY!=null?((Reserved_wordsContext)_localctx).T_BINARY.getText():null); 
				}
				break;
			case T_BOOLEAN:
				enterOuterAlt(_localctx, 10);
				{
				setState(3345);
				((Reserved_wordsContext)_localctx).T_BOOLEAN = match(T_BOOLEAN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BOOLEAN!=null?((Reserved_wordsContext)_localctx).T_BOOLEAN.getText():null); 
				}
				break;
			case T_BOTH:
				enterOuterAlt(_localctx, 11);
				{
				setState(3347);
				((Reserved_wordsContext)_localctx).T_BOTH = match(T_BOTH);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BOTH!=null?((Reserved_wordsContext)_localctx).T_BOTH.getText():null); 
				}
				break;
			case T_BY:
				enterOuterAlt(_localctx, 12);
				{
				setState(3349);
				((Reserved_wordsContext)_localctx).T_BY = match(T_BY);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_BY!=null?((Reserved_wordsContext)_localctx).T_BY.getText():null); 
				}
				break;
			case T_CASE:
				enterOuterAlt(_localctx, 13);
				{
				setState(3351);
				((Reserved_wordsContext)_localctx).T_CASE = match(T_CASE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CASE!=null?((Reserved_wordsContext)_localctx).T_CASE.getText():null); 
				}
				break;
			case T_CAST:
				enterOuterAlt(_localctx, 14);
				{
				setState(3353);
				((Reserved_wordsContext)_localctx).T_CAST = match(T_CAST);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CAST!=null?((Reserved_wordsContext)_localctx).T_CAST.getText():null); 
				}
				break;
			case T_CHAR:
				enterOuterAlt(_localctx, 15);
				{
				setState(3355);
				((Reserved_wordsContext)_localctx).T_CHAR = match(T_CHAR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CHAR!=null?((Reserved_wordsContext)_localctx).T_CHAR.getText():null); 
				}
				break;
			case T_COLUMN:
				enterOuterAlt(_localctx, 16);
				{
				setState(3357);
				((Reserved_wordsContext)_localctx).T_COLUMN = match(T_COLUMN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_COLUMN!=null?((Reserved_wordsContext)_localctx).T_COLUMN.getText():null); 
				}
				break;
			case T_CONF:
				enterOuterAlt(_localctx, 17);
				{
				setState(3359);
				((Reserved_wordsContext)_localctx).T_CONF = match(T_CONF);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CONF!=null?((Reserved_wordsContext)_localctx).T_CONF.getText():null); 
				}
				break;
			case T_CREATE:
				enterOuterAlt(_localctx, 18);
				{
				setState(3361);
				((Reserved_wordsContext)_localctx).T_CREATE = match(T_CREATE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CREATE!=null?((Reserved_wordsContext)_localctx).T_CREATE.getText():null); 
				}
				break;
			case T_CROSS:
				enterOuterAlt(_localctx, 19);
				{
				setState(3363);
				((Reserved_wordsContext)_localctx).T_CROSS = match(T_CROSS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CROSS!=null?((Reserved_wordsContext)_localctx).T_CROSS.getText():null); 
				}
				break;
			case T_CUBE:
				enterOuterAlt(_localctx, 20);
				{
				setState(3365);
				((Reserved_wordsContext)_localctx).T_CUBE = match(T_CUBE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CUBE!=null?((Reserved_wordsContext)_localctx).T_CUBE.getText():null); 
				}
				break;
			case T_CURRENT:
				enterOuterAlt(_localctx, 21);
				{
				setState(3367);
				((Reserved_wordsContext)_localctx).T_CURRENT = match(T_CURRENT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CURRENT!=null?((Reserved_wordsContext)_localctx).T_CURRENT.getText():null); 
				}
				break;
			case T_CURRENT_DATE:
				enterOuterAlt(_localctx, 22);
				{
				setState(3369);
				((Reserved_wordsContext)_localctx).T_CURRENT_DATE = match(T_CURRENT_DATE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CURRENT_DATE!=null?((Reserved_wordsContext)_localctx).T_CURRENT_DATE.getText():null); 
				}
				break;
			case T_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 23);
				{
				setState(3371);
				((Reserved_wordsContext)_localctx).T_CURRENT_TIMESTAMP = match(T_CURRENT_TIMESTAMP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CURRENT_TIMESTAMP!=null?((Reserved_wordsContext)_localctx).T_CURRENT_TIMESTAMP.getText():null); 
				}
				break;
			case T_CURSOR:
				enterOuterAlt(_localctx, 24);
				{
				setState(3373);
				((Reserved_wordsContext)_localctx).T_CURSOR = match(T_CURSOR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CURSOR!=null?((Reserved_wordsContext)_localctx).T_CURSOR.getText():null); 
				}
				break;
			case T_DATABASE:
				enterOuterAlt(_localctx, 25);
				{
				setState(3375);
				((Reserved_wordsContext)_localctx).T_DATABASE = match(T_DATABASE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DATABASE!=null?((Reserved_wordsContext)_localctx).T_DATABASE.getText():null); 
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 26);
				{
				setState(3377);
				((Reserved_wordsContext)_localctx).T_DATE = match(T_DATE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DATE!=null?((Reserved_wordsContext)_localctx).T_DATE.getText():null); 
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 27);
				{
				setState(3379);
				((Reserved_wordsContext)_localctx).T_DECIMAL = match(T_DECIMAL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DECIMAL!=null?((Reserved_wordsContext)_localctx).T_DECIMAL.getText():null); 
				}
				break;
			case T_DELETE:
				enterOuterAlt(_localctx, 28);
				{
				setState(3381);
				((Reserved_wordsContext)_localctx).T_DELETE = match(T_DELETE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DELETE!=null?((Reserved_wordsContext)_localctx).T_DELETE.getText():null); 
				}
				break;
			case T_DESCRIBE:
				enterOuterAlt(_localctx, 29);
				{
				setState(3383);
				((Reserved_wordsContext)_localctx).T_DESCRIBE = match(T_DESCRIBE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DESCRIBE!=null?((Reserved_wordsContext)_localctx).T_DESCRIBE.getText():null); 
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 30);
				{
				setState(3385);
				((Reserved_wordsContext)_localctx).T_DISTINCT = match(T_DISTINCT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DISTINCT!=null?((Reserved_wordsContext)_localctx).T_DISTINCT.getText():null); 
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 31);
				{
				setState(3387);
				((Reserved_wordsContext)_localctx).T_DOUBLE = match(T_DOUBLE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DOUBLE!=null?((Reserved_wordsContext)_localctx).T_DOUBLE.getText():null); 
				}
				break;
			case T_DROP:
				enterOuterAlt(_localctx, 32);
				{
				setState(3389);
				((Reserved_wordsContext)_localctx).T_DROP = match(T_DROP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DROP!=null?((Reserved_wordsContext)_localctx).T_DROP.getText():null); 
				}
				break;
			case T_ELSE:
				enterOuterAlt(_localctx, 33);
				{
				setState(3391);
				((Reserved_wordsContext)_localctx).T_ELSE = match(T_ELSE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ELSE!=null?((Reserved_wordsContext)_localctx).T_ELSE.getText():null); 
				}
				break;
			case T_END:
				enterOuterAlt(_localctx, 34);
				{
				setState(3393);
				((Reserved_wordsContext)_localctx).T_END = match(T_END);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_END!=null?((Reserved_wordsContext)_localctx).T_END.getText():null); 
				}
				break;
			case T_EXCHANGE:
				enterOuterAlt(_localctx, 35);
				{
				setState(3395);
				((Reserved_wordsContext)_localctx).T_EXCHANGE = match(T_EXCHANGE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_EXCHANGE!=null?((Reserved_wordsContext)_localctx).T_EXCHANGE.getText():null); 
				}
				break;
			case T_EXISTS:
				enterOuterAlt(_localctx, 36);
				{
				setState(3397);
				((Reserved_wordsContext)_localctx).T_EXISTS = match(T_EXISTS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_EXISTS!=null?((Reserved_wordsContext)_localctx).T_EXISTS.getText():null); 
				}
				break;
			case T_EXTENDED:
				enterOuterAlt(_localctx, 37);
				{
				setState(3399);
				((Reserved_wordsContext)_localctx).T_EXTENDED = match(T_EXTENDED);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_EXTENDED!=null?((Reserved_wordsContext)_localctx).T_EXTENDED.getText():null); 
				}
				break;
			case T_EXTERNAL:
				enterOuterAlt(_localctx, 38);
				{
				setState(3401);
				((Reserved_wordsContext)_localctx).T_EXTERNAL = match(T_EXTERNAL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_EXTERNAL!=null?((Reserved_wordsContext)_localctx).T_EXTERNAL.getText():null); 
				}
				break;
			case T_FALSE:
				enterOuterAlt(_localctx, 39);
				{
				setState(3403);
				((Reserved_wordsContext)_localctx).T_FALSE = match(T_FALSE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FALSE!=null?((Reserved_wordsContext)_localctx).T_FALSE.getText():null); 
				}
				break;
			case T_FETCH:
				enterOuterAlt(_localctx, 40);
				{
				setState(3405);
				((Reserved_wordsContext)_localctx).T_FETCH = match(T_FETCH);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FETCH!=null?((Reserved_wordsContext)_localctx).T_FETCH.getText():null); 
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 41);
				{
				setState(3407);
				((Reserved_wordsContext)_localctx).T_FLOAT = match(T_FLOAT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FLOAT!=null?((Reserved_wordsContext)_localctx).T_FLOAT.getText():null); 
				}
				break;
			case T_FOLLOWING:
				enterOuterAlt(_localctx, 42);
				{
				setState(3409);
				((Reserved_wordsContext)_localctx).T_FOLLOWING = match(T_FOLLOWING);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FOLLOWING!=null?((Reserved_wordsContext)_localctx).T_FOLLOWING.getText():null); 
				}
				break;
			case T_FOR:
				enterOuterAlt(_localctx, 43);
				{
				setState(3411);
				((Reserved_wordsContext)_localctx).T_FOR = match(T_FOR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FOR!=null?((Reserved_wordsContext)_localctx).T_FOR.getText():null); 
				}
				break;
			case T_FROM:
				enterOuterAlt(_localctx, 44);
				{
				setState(3413);
				((Reserved_wordsContext)_localctx).T_FROM = match(T_FROM);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FROM!=null?((Reserved_wordsContext)_localctx).T_FROM.getText():null); 
				}
				break;
			case T_FULL:
				enterOuterAlt(_localctx, 45);
				{
				setState(3415);
				((Reserved_wordsContext)_localctx).T_FULL = match(T_FULL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FULL!=null?((Reserved_wordsContext)_localctx).T_FULL.getText():null); 
				}
				break;
			case T_FUNCTION:
				enterOuterAlt(_localctx, 46);
				{
				setState(3417);
				((Reserved_wordsContext)_localctx).T_FUNCTION = match(T_FUNCTION);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FUNCTION!=null?((Reserved_wordsContext)_localctx).T_FUNCTION.getText():null); 
				}
				break;
			case T_GRANT:
				enterOuterAlt(_localctx, 47);
				{
				setState(3419);
				((Reserved_wordsContext)_localctx).T_GRANT = match(T_GRANT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_GRANT!=null?((Reserved_wordsContext)_localctx).T_GRANT.getText():null); 
				}
				break;
			case T_GROUP:
				enterOuterAlt(_localctx, 48);
				{
				setState(3421);
				((Reserved_wordsContext)_localctx).T_GROUP = match(T_GROUP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_GROUP!=null?((Reserved_wordsContext)_localctx).T_GROUP.getText():null); 
				}
				break;
			case T_GROUPING:
				enterOuterAlt(_localctx, 49);
				{
				setState(3423);
				((Reserved_wordsContext)_localctx).T_GROUPING = match(T_GROUPING);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_GROUPING!=null?((Reserved_wordsContext)_localctx).T_GROUPING.getText():null); 
				}
				break;
			case T_HAVING:
				enterOuterAlt(_localctx, 50);
				{
				setState(3425);
				((Reserved_wordsContext)_localctx).T_HAVING = match(T_HAVING);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_HAVING!=null?((Reserved_wordsContext)_localctx).T_HAVING.getText():null); 
				}
				break;
			case T_IF:
				enterOuterAlt(_localctx, 51);
				{
				setState(3427);
				((Reserved_wordsContext)_localctx).T_IF = match(T_IF);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_IF!=null?((Reserved_wordsContext)_localctx).T_IF.getText():null); 
				}
				break;
			case T_IMPORT:
				enterOuterAlt(_localctx, 52);
				{
				setState(3429);
				((Reserved_wordsContext)_localctx).T_IMPORT = match(T_IMPORT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_IMPORT!=null?((Reserved_wordsContext)_localctx).T_IMPORT.getText():null); 
				}
				break;
			case T_IN:
				enterOuterAlt(_localctx, 53);
				{
				setState(3431);
				((Reserved_wordsContext)_localctx).T_IN = match(T_IN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_IN!=null?((Reserved_wordsContext)_localctx).T_IN.getText():null); 
				}
				break;
			case T_INNER:
				enterOuterAlt(_localctx, 54);
				{
				setState(3433);
				((Reserved_wordsContext)_localctx).T_INNER = match(T_INNER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INNER!=null?((Reserved_wordsContext)_localctx).T_INNER.getText():null); 
				}
				break;
			case T_INSERT:
				enterOuterAlt(_localctx, 55);
				{
				setState(3435);
				((Reserved_wordsContext)_localctx).T_INSERT = match(T_INSERT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INSERT!=null?((Reserved_wordsContext)_localctx).T_INSERT.getText():null); 
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 56);
				{
				setState(3437);
				((Reserved_wordsContext)_localctx).T_INT = match(T_INT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INT!=null?((Reserved_wordsContext)_localctx).T_INT.getText():null); 
				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 57);
				{
				setState(3439);
				((Reserved_wordsContext)_localctx).T_INTERSECT = match(T_INTERSECT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INTERSECT!=null?((Reserved_wordsContext)_localctx).T_INTERSECT.getText():null); 
				}
				break;
			case T_INTERVAL:
				enterOuterAlt(_localctx, 58);
				{
				setState(3441);
				((Reserved_wordsContext)_localctx).T_INTERVAL = match(T_INTERVAL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INTERVAL!=null?((Reserved_wordsContext)_localctx).T_INTERVAL.getText():null); 
				}
				break;
			case T_INTO:
				enterOuterAlt(_localctx, 59);
				{
				setState(3443);
				((Reserved_wordsContext)_localctx).T_INTO = match(T_INTO);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INTO!=null?((Reserved_wordsContext)_localctx).T_INTO.getText():null); 
				}
				break;
			case T_IS:
				enterOuterAlt(_localctx, 60);
				{
				setState(3445);
				((Reserved_wordsContext)_localctx).T_IS = match(T_IS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_IS!=null?((Reserved_wordsContext)_localctx).T_IS.getText():null); 
				}
				break;
			case T_JOIN:
				enterOuterAlt(_localctx, 61);
				{
				setState(3447);
				((Reserved_wordsContext)_localctx).T_JOIN = match(T_JOIN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_JOIN!=null?((Reserved_wordsContext)_localctx).T_JOIN.getText():null); 
				}
				break;
			case T_LATERAL:
				enterOuterAlt(_localctx, 62);
				{
				setState(3449);
				((Reserved_wordsContext)_localctx).T_LATERAL = match(T_LATERAL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_LATERAL!=null?((Reserved_wordsContext)_localctx).T_LATERAL.getText():null); 
				}
				break;
			case T_LEFT:
				enterOuterAlt(_localctx, 63);
				{
				setState(3451);
				((Reserved_wordsContext)_localctx).T_LEFT = match(T_LEFT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_LEFT!=null?((Reserved_wordsContext)_localctx).T_LEFT.getText():null); 
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 64);
				{
				setState(3453);
				((Reserved_wordsContext)_localctx).T_LESS = match(T_LESS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_LESS!=null?((Reserved_wordsContext)_localctx).T_LESS.getText():null); 
				}
				break;
			case T_LIKE:
				enterOuterAlt(_localctx, 65);
				{
				setState(3455);
				((Reserved_wordsContext)_localctx).T_LIKE = match(T_LIKE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_LIKE!=null?((Reserved_wordsContext)_localctx).T_LIKE.getText():null); 
				}
				break;
			case T_LOCAL:
				enterOuterAlt(_localctx, 66);
				{
				setState(3457);
				((Reserved_wordsContext)_localctx).T_LOCAL = match(T_LOCAL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_LOCAL!=null?((Reserved_wordsContext)_localctx).T_LOCAL.getText():null); 
				}
				break;
			case T_MACRO:
				enterOuterAlt(_localctx, 67);
				{
				setState(3459);
				((Reserved_wordsContext)_localctx).T_MACRO = match(T_MACRO);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_MACRO!=null?((Reserved_wordsContext)_localctx).T_MACRO.getText():null); 
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 68);
				{
				setState(3461);
				((Reserved_wordsContext)_localctx).T_MAP = match(T_MAP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_MAP!=null?((Reserved_wordsContext)_localctx).T_MAP.getText():null); 
				}
				break;
			case T_MORE:
				enterOuterAlt(_localctx, 69);
				{
				setState(3463);
				((Reserved_wordsContext)_localctx).T_MORE = match(T_MORE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_MORE!=null?((Reserved_wordsContext)_localctx).T_MORE.getText():null); 
				}
				break;
			case T_NONE:
				enterOuterAlt(_localctx, 70);
				{
				setState(3465);
				((Reserved_wordsContext)_localctx).T_NONE = match(T_NONE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_NONE!=null?((Reserved_wordsContext)_localctx).T_NONE.getText():null); 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 71);
				{
				setState(3467);
				((Reserved_wordsContext)_localctx).T_NOT = match(T_NOT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_NOT!=null?((Reserved_wordsContext)_localctx).T_NOT.getText():null); 
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 72);
				{
				setState(3469);
				((Reserved_wordsContext)_localctx).T_NULL = match(T_NULL);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_NULL!=null?((Reserved_wordsContext)_localctx).T_NULL.getText():null); 
				}
				break;
			case T_OF:
				enterOuterAlt(_localctx, 73);
				{
				setState(3471);
				((Reserved_wordsContext)_localctx).T_OF = match(T_OF);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_OF!=null?((Reserved_wordsContext)_localctx).T_OF.getText():null); 
				}
				break;
			case T_ON:
				enterOuterAlt(_localctx, 74);
				{
				setState(3473);
				((Reserved_wordsContext)_localctx).T_ON = match(T_ON);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ON!=null?((Reserved_wordsContext)_localctx).T_ON.getText():null); 
				}
				break;
			case T_OR:
				enterOuterAlt(_localctx, 75);
				{
				setState(3475);
				((Reserved_wordsContext)_localctx).T_OR = match(T_OR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_OR!=null?((Reserved_wordsContext)_localctx).T_OR.getText():null); 
				}
				break;
			case T_ORDER:
				enterOuterAlt(_localctx, 76);
				{
				setState(3477);
				((Reserved_wordsContext)_localctx).T_ORDER = match(T_ORDER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ORDER!=null?((Reserved_wordsContext)_localctx).T_ORDER.getText():null); 
				}
				break;
			case T_OUT:
				enterOuterAlt(_localctx, 77);
				{
				setState(3479);
				((Reserved_wordsContext)_localctx).T_OUT = match(T_OUT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_OUT!=null?((Reserved_wordsContext)_localctx).T_OUT.getText():null); 
				}
				break;
			case T_OUTER:
				enterOuterAlt(_localctx, 78);
				{
				setState(3481);
				((Reserved_wordsContext)_localctx).T_OUTER = match(T_OUTER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_OUTER!=null?((Reserved_wordsContext)_localctx).T_OUTER.getText():null); 
				}
				break;
			case T_OVER:
				enterOuterAlt(_localctx, 79);
				{
				setState(3483);
				((Reserved_wordsContext)_localctx).T_OVER = match(T_OVER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_OVER!=null?((Reserved_wordsContext)_localctx).T_OVER.getText():null); 
				}
				break;
			case T_PARTIALSCAN:
				enterOuterAlt(_localctx, 80);
				{
				setState(3485);
				((Reserved_wordsContext)_localctx).T_PARTIALSCAN = match(T_PARTIALSCAN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PARTIALSCAN!=null?((Reserved_wordsContext)_localctx).T_PARTIALSCAN.getText():null); 
				}
				break;
			case T_PARTITION:
				enterOuterAlt(_localctx, 81);
				{
				setState(3487);
				((Reserved_wordsContext)_localctx).T_PARTITION = match(T_PARTITION);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PARTITION!=null?((Reserved_wordsContext)_localctx).T_PARTITION.getText():null); 
				}
				break;
			case T_PERCENT:
				enterOuterAlt(_localctx, 82);
				{
				setState(3489);
				((Reserved_wordsContext)_localctx).T_PERCENT = match(T_PERCENT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PERCENT!=null?((Reserved_wordsContext)_localctx).T_PERCENT.getText():null); 
				}
				break;
			case T_PRECEDING:
				enterOuterAlt(_localctx, 83);
				{
				setState(3491);
				((Reserved_wordsContext)_localctx).T_PRECEDING = match(T_PRECEDING);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PRECEDING!=null?((Reserved_wordsContext)_localctx).T_PRECEDING.getText():null); 
				}
				break;
			case T_PRESERVE:
				enterOuterAlt(_localctx, 84);
				{
				setState(3493);
				((Reserved_wordsContext)_localctx).T_PRESERVE = match(T_PRESERVE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PRESERVE!=null?((Reserved_wordsContext)_localctx).T_PRESERVE.getText():null); 
				}
				break;
			case T_PROCEDURE:
				enterOuterAlt(_localctx, 85);
				{
				setState(3495);
				((Reserved_wordsContext)_localctx).T_PROCEDURE = match(T_PROCEDURE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PROCEDURE!=null?((Reserved_wordsContext)_localctx).T_PROCEDURE.getText():null); 
				}
				break;
			case T_RANGE:
				enterOuterAlt(_localctx, 86);
				{
				setState(3497);
				((Reserved_wordsContext)_localctx).T_RANGE = match(T_RANGE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_RANGE!=null?((Reserved_wordsContext)_localctx).T_RANGE.getText():null); 
				}
				break;
			case T_READS:
				enterOuterAlt(_localctx, 87);
				{
				setState(3499);
				((Reserved_wordsContext)_localctx).T_READS = match(T_READS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_READS!=null?((Reserved_wordsContext)_localctx).T_READS.getText():null); 
				}
				break;
			case T_REDUCE:
				enterOuterAlt(_localctx, 88);
				{
				setState(3501);
				((Reserved_wordsContext)_localctx).T_REDUCE = match(T_REDUCE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_REDUCE!=null?((Reserved_wordsContext)_localctx).T_REDUCE.getText():null); 
				}
				break;
			case T_REVOKE:
				enterOuterAlt(_localctx, 89);
				{
				setState(3503);
				((Reserved_wordsContext)_localctx).T_REVOKE = match(T_REVOKE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_REVOKE!=null?((Reserved_wordsContext)_localctx).T_REVOKE.getText():null); 
				}
				break;
			case T_RIGHT:
				enterOuterAlt(_localctx, 90);
				{
				setState(3505);
				((Reserved_wordsContext)_localctx).T_RIGHT = match(T_RIGHT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_RIGHT!=null?((Reserved_wordsContext)_localctx).T_RIGHT.getText():null); 
				}
				break;
			case T_ROLLUP:
				enterOuterAlt(_localctx, 91);
				{
				setState(3507);
				((Reserved_wordsContext)_localctx).T_ROLLUP = match(T_ROLLUP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ROLLUP!=null?((Reserved_wordsContext)_localctx).T_ROLLUP.getText():null); 
				}
				break;
			case T_ROW:
				enterOuterAlt(_localctx, 92);
				{
				setState(3509);
				((Reserved_wordsContext)_localctx).T_ROW = match(T_ROW);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ROW!=null?((Reserved_wordsContext)_localctx).T_ROW.getText():null); 
				}
				break;
			case T_ROWS:
				enterOuterAlt(_localctx, 93);
				{
				setState(3511);
				((Reserved_wordsContext)_localctx).T_ROWS = match(T_ROWS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ROWS!=null?((Reserved_wordsContext)_localctx).T_ROWS.getText():null); 
				}
				break;
			case T_SELECT:
				enterOuterAlt(_localctx, 94);
				{
				setState(3513);
				((Reserved_wordsContext)_localctx).T_SELECT = match(T_SELECT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_SELECT!=null?((Reserved_wordsContext)_localctx).T_SELECT.getText():null); 
				}
				break;
			case T_SET:
				enterOuterAlt(_localctx, 95);
				{
				setState(3515);
				((Reserved_wordsContext)_localctx).T_SET = match(T_SET);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_SET!=null?((Reserved_wordsContext)_localctx).T_SET.getText():null); 
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 96);
				{
				setState(3517);
				((Reserved_wordsContext)_localctx).T_SMALLINT = match(T_SMALLINT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_SMALLINT!=null?((Reserved_wordsContext)_localctx).T_SMALLINT.getText():null); 
				}
				break;
			case T_TABLE:
				enterOuterAlt(_localctx, 97);
				{
				setState(3519);
				((Reserved_wordsContext)_localctx).T_TABLE = match(T_TABLE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TABLE!=null?((Reserved_wordsContext)_localctx).T_TABLE.getText():null); 
				}
				break;
			case T_TABLESAMPLE:
				enterOuterAlt(_localctx, 98);
				{
				setState(3521);
				((Reserved_wordsContext)_localctx).T_TABLESAMPLE = match(T_TABLESAMPLE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TABLESAMPLE!=null?((Reserved_wordsContext)_localctx).T_TABLESAMPLE.getText():null); 
				}
				break;
			case T_THEN:
				enterOuterAlt(_localctx, 99);
				{
				setState(3523);
				((Reserved_wordsContext)_localctx).T_THEN = match(T_THEN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_THEN!=null?((Reserved_wordsContext)_localctx).T_THEN.getText():null); 
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 100);
				{
				setState(3525);
				((Reserved_wordsContext)_localctx).T_TIMESTAMP = match(T_TIMESTAMP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TIMESTAMP!=null?((Reserved_wordsContext)_localctx).T_TIMESTAMP.getText():null); 
				}
				break;
			case T_TO:
				enterOuterAlt(_localctx, 101);
				{
				setState(3527);
				((Reserved_wordsContext)_localctx).T_TO = match(T_TO);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TO!=null?((Reserved_wordsContext)_localctx).T_TO.getText():null); 
				}
				break;
			case T_TRANSFORM:
				enterOuterAlt(_localctx, 102);
				{
				setState(3529);
				((Reserved_wordsContext)_localctx).T_TRANSFORM = match(T_TRANSFORM);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TRANSFORM!=null?((Reserved_wordsContext)_localctx).T_TRANSFORM.getText():null); 
				}
				break;
			case T_TRIGGER:
				enterOuterAlt(_localctx, 103);
				{
				setState(3531);
				((Reserved_wordsContext)_localctx).T_TRIGGER = match(T_TRIGGER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TRIGGER!=null?((Reserved_wordsContext)_localctx).T_TRIGGER.getText():null); 
				}
				break;
			case T_TRUE:
				enterOuterAlt(_localctx, 104);
				{
				setState(3533);
				((Reserved_wordsContext)_localctx).T_TRUE = match(T_TRUE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TRUE!=null?((Reserved_wordsContext)_localctx).T_TRUE.getText():null); 
				}
				break;
			case T_TRUNCATE:
				enterOuterAlt(_localctx, 105);
				{
				setState(3535);
				((Reserved_wordsContext)_localctx).T_TRUNCATE = match(T_TRUNCATE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TRUNCATE!=null?((Reserved_wordsContext)_localctx).T_TRUNCATE.getText():null); 
				}
				break;
			case T_UNBOUNDED:
				enterOuterAlt(_localctx, 106);
				{
				setState(3537);
				((Reserved_wordsContext)_localctx).T_UNBOUNDED = match(T_UNBOUNDED);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_UNBOUNDED!=null?((Reserved_wordsContext)_localctx).T_UNBOUNDED.getText():null); 
				}
				break;
			case T_UNION:
				enterOuterAlt(_localctx, 107);
				{
				setState(3539);
				((Reserved_wordsContext)_localctx).T_UNION = match(T_UNION);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_UNION!=null?((Reserved_wordsContext)_localctx).T_UNION.getText():null); 
				}
				break;
			case T_UNIQUEJOIN:
				enterOuterAlt(_localctx, 108);
				{
				setState(3541);
				((Reserved_wordsContext)_localctx).T_UNIQUEJOIN = match(T_UNIQUEJOIN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_UNIQUEJOIN!=null?((Reserved_wordsContext)_localctx).T_UNIQUEJOIN.getText():null); 
				}
				break;
			case T_UPDATE:
				enterOuterAlt(_localctx, 109);
				{
				setState(3543);
				((Reserved_wordsContext)_localctx).T_UPDATE = match(T_UPDATE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_UPDATE!=null?((Reserved_wordsContext)_localctx).T_UPDATE.getText():null); 
				}
				break;
			case T_USER:
				enterOuterAlt(_localctx, 110);
				{
				setState(3545);
				((Reserved_wordsContext)_localctx).T_USER = match(T_USER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_USER!=null?((Reserved_wordsContext)_localctx).T_USER.getText():null); 
				}
				break;
			case T_USING:
				enterOuterAlt(_localctx, 111);
				{
				setState(3547);
				((Reserved_wordsContext)_localctx).T_USING = match(T_USING);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_USING!=null?((Reserved_wordsContext)_localctx).T_USING.getText():null); 
				}
				break;
			case T_UTC_TMESTAMP:
				enterOuterAlt(_localctx, 112);
				{
				setState(3549);
				((Reserved_wordsContext)_localctx).T_UTC_TMESTAMP = match(T_UTC_TMESTAMP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_UTC_TMESTAMP!=null?((Reserved_wordsContext)_localctx).T_UTC_TMESTAMP.getText():null); 
				}
				break;
			case T_VALUES:
				enterOuterAlt(_localctx, 113);
				{
				setState(3551);
				((Reserved_wordsContext)_localctx).T_VALUES = match(T_VALUES);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_VALUES!=null?((Reserved_wordsContext)_localctx).T_VALUES.getText():null); 
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 114);
				{
				setState(3553);
				((Reserved_wordsContext)_localctx).T_VARCHAR = match(T_VARCHAR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_VARCHAR!=null?((Reserved_wordsContext)_localctx).T_VARCHAR.getText():null); 
				}
				break;
			case T_WHEN:
				enterOuterAlt(_localctx, 115);
				{
				setState(3555);
				((Reserved_wordsContext)_localctx).T_WHEN = match(T_WHEN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_WHEN!=null?((Reserved_wordsContext)_localctx).T_WHEN.getText():null); 
				}
				break;
			case T_WHERE:
				enterOuterAlt(_localctx, 116);
				{
				setState(3557);
				((Reserved_wordsContext)_localctx).T_WHERE = match(T_WHERE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_WHERE!=null?((Reserved_wordsContext)_localctx).T_WHERE.getText():null); 
				}
				break;
			case T_WINDOW:
				enterOuterAlt(_localctx, 117);
				{
				setState(3559);
				((Reserved_wordsContext)_localctx).T_WINDOW = match(T_WINDOW);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_WINDOW!=null?((Reserved_wordsContext)_localctx).T_WINDOW.getText():null); 
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 118);
				{
				setState(3561);
				((Reserved_wordsContext)_localctx).T_WITH = match(T_WITH);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_WITH!=null?((Reserved_wordsContext)_localctx).T_WITH.getText():null); 
				}
				break;
			case T_COMMIT:
				enterOuterAlt(_localctx, 119);
				{
				setState(3563);
				((Reserved_wordsContext)_localctx).T_COMMIT = match(T_COMMIT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_COMMIT!=null?((Reserved_wordsContext)_localctx).T_COMMIT.getText():null); 
				}
				break;
			case T_ONLY:
				enterOuterAlt(_localctx, 120);
				{
				setState(3565);
				((Reserved_wordsContext)_localctx).T_ONLY = match(T_ONLY);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ONLY!=null?((Reserved_wordsContext)_localctx).T_ONLY.getText():null); 
				}
				break;
			case T_REGEXP:
				enterOuterAlt(_localctx, 121);
				{
				setState(3567);
				((Reserved_wordsContext)_localctx).T_REGEXP = match(T_REGEXP);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_REGEXP!=null?((Reserved_wordsContext)_localctx).T_REGEXP.getText():null); 
				}
				break;
			case T_RLIKE:
				enterOuterAlt(_localctx, 122);
				{
				setState(3569);
				((Reserved_wordsContext)_localctx).T_RLIKE = match(T_RLIKE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_RLIKE!=null?((Reserved_wordsContext)_localctx).T_RLIKE.getText():null); 
				}
				break;
			case T_ROLLBACK:
				enterOuterAlt(_localctx, 123);
				{
				setState(3571);
				((Reserved_wordsContext)_localctx).T_ROLLBACK = match(T_ROLLBACK);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_ROLLBACK!=null?((Reserved_wordsContext)_localctx).T_ROLLBACK.getText():null); 
				}
				break;
			case T_START:
				enterOuterAlt(_localctx, 124);
				{
				setState(3573);
				((Reserved_wordsContext)_localctx).T_START = match(T_START);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_START!=null?((Reserved_wordsContext)_localctx).T_START.getText():null); 
				}
				break;
			case T_CACHE:
				enterOuterAlt(_localctx, 125);
				{
				setState(3575);
				((Reserved_wordsContext)_localctx).T_CACHE = match(T_CACHE);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CACHE!=null?((Reserved_wordsContext)_localctx).T_CACHE.getText():null); 
				}
				break;
			case T_CONSTRAINT:
				enterOuterAlt(_localctx, 126);
				{
				setState(3577);
				((Reserved_wordsContext)_localctx).T_CONSTRAINT = match(T_CONSTRAINT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_CONSTRAINT!=null?((Reserved_wordsContext)_localctx).T_CONSTRAINT.getText():null); 
				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 127);
				{
				setState(3579);
				((Reserved_wordsContext)_localctx).T_FOREIGN = match(T_FOREIGN);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FOREIGN!=null?((Reserved_wordsContext)_localctx).T_FOREIGN.getText():null); 
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 128);
				{
				setState(3581);
				((Reserved_wordsContext)_localctx).T_PRIMARY = match(T_PRIMARY);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PRIMARY!=null?((Reserved_wordsContext)_localctx).T_PRIMARY.getText():null); 
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 129);
				{
				setState(3583);
				((Reserved_wordsContext)_localctx).T_REFERENCES = match(T_REFERENCES);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_REFERENCES!=null?((Reserved_wordsContext)_localctx).T_REFERENCES.getText():null); 
				}
				break;
			case T_DAYOFWEEK:
				enterOuterAlt(_localctx, 130);
				{
				setState(3585);
				((Reserved_wordsContext)_localctx).T_DAYOFWEEK = match(T_DAYOFWEEK);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_DAYOFWEEK!=null?((Reserved_wordsContext)_localctx).T_DAYOFWEEK.getText():null); 
				}
				break;
			case T_EXTRACT:
				enterOuterAlt(_localctx, 131);
				{
				setState(3587);
				((Reserved_wordsContext)_localctx).T_EXTRACT = match(T_EXTRACT);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_EXTRACT!=null?((Reserved_wordsContext)_localctx).T_EXTRACT.getText():null); 
				}
				break;
			case T_FLOOR:
				enterOuterAlt(_localctx, 132);
				{
				setState(3589);
				((Reserved_wordsContext)_localctx).T_FLOOR = match(T_FLOOR);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_FLOOR!=null?((Reserved_wordsContext)_localctx).T_FLOOR.getText():null); 
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 133);
				{
				setState(3591);
				((Reserved_wordsContext)_localctx).T_INTEGER = match(T_INTEGER);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_INTEGER!=null?((Reserved_wordsContext)_localctx).T_INTEGER.getText():null); 
				}
				break;
			case T_PRECISION:
				enterOuterAlt(_localctx, 134);
				{
				setState(3593);
				((Reserved_wordsContext)_localctx).T_PRECISION = match(T_PRECISION);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_PRECISION!=null?((Reserved_wordsContext)_localctx).T_PRECISION.getText():null); 
				}
				break;
			case T_VIEWS:
				enterOuterAlt(_localctx, 135);
				{
				setState(3595);
				((Reserved_wordsContext)_localctx).T_VIEWS = match(T_VIEWS);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_VIEWS!=null?((Reserved_wordsContext)_localctx).T_VIEWS.getText():null); 
				}
				break;
			case T_TIME:
				enterOuterAlt(_localctx, 136);
				{
				setState(3597);
				((Reserved_wordsContext)_localctx).T_TIME = match(T_TIME);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_TIME!=null?((Reserved_wordsContext)_localctx).T_TIME.getText():null); 
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 137);
				{
				setState(3599);
				((Reserved_wordsContext)_localctx).T_NUMERIC = match(T_NUMERIC);
				 ((Reserved_wordsContext)_localctx).res =  (((Reserved_wordsContext)_localctx).T_NUMERIC!=null?((Reserved_wordsContext)_localctx).T_NUMERIC.getText():null); 
				}
				break;
			case T_SYNC:
				enterOuterAlt(_localctx, 138);
				{
				setState(3601);
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
		enterRule(_localctx, 256, RULE_non_reserved_words);
		try {
			setState(4000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3605);
				((Non_reserved_wordsContext)_localctx).function_names = function_names();
				 ((Non_reserved_wordsContext)_localctx).res =  ((Non_reserved_wordsContext)_localctx).function_names.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3608);
				((Non_reserved_wordsContext)_localctx).T_EXIT = match(T_EXIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXIT!=null?((Non_reserved_wordsContext)_localctx).T_EXIT.getText():null); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3610);
				((Non_reserved_wordsContext)_localctx).T_ADD_W = match(T_ADD_W);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ADD_W!=null?((Non_reserved_wordsContext)_localctx).T_ADD_W.getText():null); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3612);
				((Non_reserved_wordsContext)_localctx).T_ADMIN = match(T_ADMIN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ADMIN!=null?((Non_reserved_wordsContext)_localctx).T_ADMIN.getText():null); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3614);
				((Non_reserved_wordsContext)_localctx).T_AFTER = match(T_AFTER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_AFTER!=null?((Non_reserved_wordsContext)_localctx).T_AFTER.getText():null); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3616);
				((Non_reserved_wordsContext)_localctx).T_ANALYZE = match(T_ANALYZE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ANALYZE!=null?((Non_reserved_wordsContext)_localctx).T_ANALYZE.getText():null); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3618);
				((Non_reserved_wordsContext)_localctx).T_ARCHIVE = match(T_ARCHIVE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ARCHIVE!=null?((Non_reserved_wordsContext)_localctx).T_ARCHIVE.getText():null); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3620);
				((Non_reserved_wordsContext)_localctx).T_ASC = match(T_ASC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ASC!=null?((Non_reserved_wordsContext)_localctx).T_ASC.getText():null); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3622);
				((Non_reserved_wordsContext)_localctx).T_AUTOCOMMIT = match(T_AUTOCOMMIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_AUTOCOMMIT!=null?((Non_reserved_wordsContext)_localctx).T_AUTOCOMMIT.getText():null); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3624);
				((Non_reserved_wordsContext)_localctx).T_BEFORE = match(T_BEFORE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BEFORE!=null?((Non_reserved_wordsContext)_localctx).T_BEFORE.getText():null); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3626);
				((Non_reserved_wordsContext)_localctx).T_BUCKET = match(T_BUCKET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BUCKET!=null?((Non_reserved_wordsContext)_localctx).T_BUCKET.getText():null); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3628);
				((Non_reserved_wordsContext)_localctx).T_BUCKETS = match(T_BUCKETS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_BUCKETS!=null?((Non_reserved_wordsContext)_localctx).T_BUCKETS.getText():null); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3630);
				((Non_reserved_wordsContext)_localctx).T_CASCADE = match(T_CASCADE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CASCADE!=null?((Non_reserved_wordsContext)_localctx).T_CASCADE.getText():null); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3632);
				((Non_reserved_wordsContext)_localctx).T_CHANGE = match(T_CHANGE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CHANGE!=null?((Non_reserved_wordsContext)_localctx).T_CHANGE.getText():null); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3634);
				((Non_reserved_wordsContext)_localctx).T_CLUSTER = match(T_CLUSTER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CLUSTER!=null?((Non_reserved_wordsContext)_localctx).T_CLUSTER.getText():null); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3636);
				((Non_reserved_wordsContext)_localctx).T_CLUSTERED = match(T_CLUSTERED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CLUSTERED!=null?((Non_reserved_wordsContext)_localctx).T_CLUSTERED.getText():null); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3638);
				((Non_reserved_wordsContext)_localctx).T_CLUSTERSTATUS = match(T_CLUSTERSTATUS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CLUSTERSTATUS!=null?((Non_reserved_wordsContext)_localctx).T_CLUSTERSTATUS.getText():null); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3640);
				((Non_reserved_wordsContext)_localctx).T_COLLECTION = match(T_COLLECTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COLLECTION!=null?((Non_reserved_wordsContext)_localctx).T_COLLECTION.getText():null); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3642);
				((Non_reserved_wordsContext)_localctx).T_COLUMNS = match(T_COLUMNS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COLUMNS!=null?((Non_reserved_wordsContext)_localctx).T_COLUMNS.getText():null); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3644);
				((Non_reserved_wordsContext)_localctx).T_COMMENT = match(T_COMMENT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COMMENT!=null?((Non_reserved_wordsContext)_localctx).T_COMMENT.getText():null); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(3646);
				((Non_reserved_wordsContext)_localctx).T_COMPACT = match(T_COMPACT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COMPACT!=null?((Non_reserved_wordsContext)_localctx).T_COMPACT.getText():null); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(3648);
				((Non_reserved_wordsContext)_localctx).T_COMPACTIONS = match(T_COMPACTIONS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COMPACTIONS!=null?((Non_reserved_wordsContext)_localctx).T_COMPACTIONS.getText():null); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(3650);
				((Non_reserved_wordsContext)_localctx).T_COMPUTE = match(T_COMPUTE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_COMPUTE!=null?((Non_reserved_wordsContext)_localctx).T_COMPUTE.getText():null); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(3652);
				((Non_reserved_wordsContext)_localctx).T_CONCATENATE = match(T_CONCATENATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CONCATENATE!=null?((Non_reserved_wordsContext)_localctx).T_CONCATENATE.getText():null); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(3654);
				((Non_reserved_wordsContext)_localctx).T_CONTINUE = match(T_CONTINUE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CONTINUE!=null?((Non_reserved_wordsContext)_localctx).T_CONTINUE.getText():null); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(3656);
				((Non_reserved_wordsContext)_localctx).T_DATA = match(T_DATA);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DATA!=null?((Non_reserved_wordsContext)_localctx).T_DATA.getText():null); 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(3658);
				((Non_reserved_wordsContext)_localctx).T_DATABASES = match(T_DATABASES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DATABASES!=null?((Non_reserved_wordsContext)_localctx).T_DATABASES.getText():null); 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(3660);
				((Non_reserved_wordsContext)_localctx).T_DATETIME = match(T_DATETIME);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DATETIME!=null?((Non_reserved_wordsContext)_localctx).T_DATETIME.getText():null); 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(3662);
				((Non_reserved_wordsContext)_localctx).T_DAY = match(T_DAY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DAY!=null?((Non_reserved_wordsContext)_localctx).T_DAY.getText():null); 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(3664);
				((Non_reserved_wordsContext)_localctx).T_DBPROPERTIES = match(T_DBPROPERTIES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DBPROPERTIES!=null?((Non_reserved_wordsContext)_localctx).T_DBPROPERTIES.getText():null); 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(3666);
				((Non_reserved_wordsContext)_localctx).T_DEFERRED = match(T_DEFERRED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEFERRED!=null?((Non_reserved_wordsContext)_localctx).T_DEFERRED.getText():null); 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(3668);
				((Non_reserved_wordsContext)_localctx).T_DEFINED = match(T_DEFINED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEFINED!=null?((Non_reserved_wordsContext)_localctx).T_DEFINED.getText():null); 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(3670);
				((Non_reserved_wordsContext)_localctx).T_DELIMITED = match(T_DELIMITED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DELIMITED!=null?((Non_reserved_wordsContext)_localctx).T_DELIMITED.getText():null); 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(3672);
				((Non_reserved_wordsContext)_localctx).T_DEPENDENCY = match(T_DEPENDENCY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEPENDENCY!=null?((Non_reserved_wordsContext)_localctx).T_DEPENDENCY.getText():null); 
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(3674);
				((Non_reserved_wordsContext)_localctx).T_DESC = match(T_DESC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DESC!=null?((Non_reserved_wordsContext)_localctx).T_DESC.getText():null); 
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(3676);
				((Non_reserved_wordsContext)_localctx).T_DIRECTORIES = match(T_DIRECTORIES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DIRECTORIES!=null?((Non_reserved_wordsContext)_localctx).T_DIRECTORIES.getText():null); 
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(3678);
				((Non_reserved_wordsContext)_localctx).T_DIRECTORY = match(T_DIRECTORY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DIRECTORY!=null?((Non_reserved_wordsContext)_localctx).T_DIRECTORY.getText():null); 
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(3680);
				((Non_reserved_wordsContext)_localctx).T_DISABLE = match(T_DISABLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DISABLE!=null?((Non_reserved_wordsContext)_localctx).T_DISABLE.getText():null); 
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(3682);
				((Non_reserved_wordsContext)_localctx).T_DISTRIBUTE = match(T_DISTRIBUTE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DISTRIBUTE!=null?((Non_reserved_wordsContext)_localctx).T_DISTRIBUTE.getText():null); 
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(3684);
				((Non_reserved_wordsContext)_localctx).T_ELEM_TYPE = match(T_ELEM_TYPE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ELEM_TYPE!=null?((Non_reserved_wordsContext)_localctx).T_ELEM_TYPE.getText():null); 
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(3686);
				((Non_reserved_wordsContext)_localctx).T_ENABLE = match(T_ENABLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ENABLE!=null?((Non_reserved_wordsContext)_localctx).T_ENABLE.getText():null); 
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(3688);
				((Non_reserved_wordsContext)_localctx).T_ESCAPED = match(T_ESCAPED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ESCAPED!=null?((Non_reserved_wordsContext)_localctx).T_ESCAPED.getText():null); 
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(3690);
				((Non_reserved_wordsContext)_localctx).T_EXCLUSIVE = match(T_EXCLUSIVE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXCLUSIVE!=null?((Non_reserved_wordsContext)_localctx).T_EXCLUSIVE.getText():null); 
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(3692);
				((Non_reserved_wordsContext)_localctx).T_EXPLAIN = match(T_EXPLAIN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXPLAIN!=null?((Non_reserved_wordsContext)_localctx).T_EXPLAIN.getText():null); 
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(3694);
				((Non_reserved_wordsContext)_localctx).T_EXPORT = match(T_EXPORT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXPORT!=null?((Non_reserved_wordsContext)_localctx).T_EXPORT.getText():null); 
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(3696);
				((Non_reserved_wordsContext)_localctx).T_FIELDS = match(T_FIELDS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FIELDS!=null?((Non_reserved_wordsContext)_localctx).T_FIELDS.getText():null); 
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(3698);
				((Non_reserved_wordsContext)_localctx).T_FILE = match(T_FILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FILE!=null?((Non_reserved_wordsContext)_localctx).T_FILE.getText():null); 
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(3700);
				((Non_reserved_wordsContext)_localctx).T_FILEFORMAT = match(T_FILEFORMAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FILEFORMAT!=null?((Non_reserved_wordsContext)_localctx).T_FILEFORMAT.getText():null); 
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(3702);
				((Non_reserved_wordsContext)_localctx).T_FIRST = match(T_FIRST);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FIRST!=null?((Non_reserved_wordsContext)_localctx).T_FIRST.getText():null); 
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(3704);
				((Non_reserved_wordsContext)_localctx).T_FORMAT = match(T_FORMAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FORMAT!=null?((Non_reserved_wordsContext)_localctx).T_FORMAT.getText():null); 
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(3706);
				((Non_reserved_wordsContext)_localctx).T_FORMATTED = match(T_FORMATTED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FORMATTED!=null?((Non_reserved_wordsContext)_localctx).T_FORMATTED.getText():null); 
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(3708);
				((Non_reserved_wordsContext)_localctx).T_FUNCTIONS = match(T_FUNCTIONS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_FUNCTIONS!=null?((Non_reserved_wordsContext)_localctx).T_FUNCTIONS.getText():null); 
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(3710);
				((Non_reserved_wordsContext)_localctx).T_HOLD_DDLTIME = match(T_HOLD_DDLTIME);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HOLD_DDLTIME!=null?((Non_reserved_wordsContext)_localctx).T_HOLD_DDLTIME.getText():null); 
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(3712);
				((Non_reserved_wordsContext)_localctx).T_HOUR = match(T_HOUR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HOUR!=null?((Non_reserved_wordsContext)_localctx).T_HOUR.getText():null); 
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(3714);
				((Non_reserved_wordsContext)_localctx).T_IDXPROPERTIES = match(T_IDXPROPERTIES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_IDXPROPERTIES!=null?((Non_reserved_wordsContext)_localctx).T_IDXPROPERTIES.getText():null); 
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(3716);
				((Non_reserved_wordsContext)_localctx).T_IGNORE = match(T_IGNORE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_IGNORE!=null?((Non_reserved_wordsContext)_localctx).T_IGNORE.getText():null); 
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(3718);
				((Non_reserved_wordsContext)_localctx).T_INDEX = match(T_INDEX);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INDEX!=null?((Non_reserved_wordsContext)_localctx).T_INDEX.getText():null); 
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(3720);
				((Non_reserved_wordsContext)_localctx).T_INDEXES = match(T_INDEXES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INDEXES!=null?((Non_reserved_wordsContext)_localctx).T_INDEXES.getText():null); 
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(3722);
				((Non_reserved_wordsContext)_localctx).T_INPATH = match(T_INPATH);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INPATH!=null?((Non_reserved_wordsContext)_localctx).T_INPATH.getText():null); 
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(3724);
				((Non_reserved_wordsContext)_localctx).T_INPUTDRIVER = match(T_INPUTDRIVER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INPUTDRIVER!=null?((Non_reserved_wordsContext)_localctx).T_INPUTDRIVER.getText():null); 
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(3726);
				((Non_reserved_wordsContext)_localctx).T_INPUTFORMAT = match(T_INPUTFORMAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_INPUTFORMAT!=null?((Non_reserved_wordsContext)_localctx).T_INPUTFORMAT.getText():null); 
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(3728);
				((Non_reserved_wordsContext)_localctx).T_ITEMS = match(T_ITEMS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ITEMS!=null?((Non_reserved_wordsContext)_localctx).T_ITEMS.getText():null); 
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(3730);
				((Non_reserved_wordsContext)_localctx).T_JAR = match(T_JAR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_JAR!=null?((Non_reserved_wordsContext)_localctx).T_JAR.getText():null); 
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(3732);
				((Non_reserved_wordsContext)_localctx).T_KEYS = match(T_KEYS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_KEYS!=null?((Non_reserved_wordsContext)_localctx).T_KEYS.getText():null); 
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(3734);
				((Non_reserved_wordsContext)_localctx).T_KEY_TYPE = match(T_KEY_TYPE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_KEY_TYPE!=null?((Non_reserved_wordsContext)_localctx).T_KEY_TYPE.getText():null); 
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(3736);
				((Non_reserved_wordsContext)_localctx).T_LIMIT = match(T_LIMIT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LIMIT!=null?((Non_reserved_wordsContext)_localctx).T_LIMIT.getText():null); 
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(3738);
				((Non_reserved_wordsContext)_localctx).T_LINES = match(T_LINES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LINES!=null?((Non_reserved_wordsContext)_localctx).T_LINES.getText():null); 
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(3740);
				((Non_reserved_wordsContext)_localctx).T_LOAD = match(T_LOAD);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOAD!=null?((Non_reserved_wordsContext)_localctx).T_LOAD.getText():null); 
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 69);
				{
				setState(3742);
				((Non_reserved_wordsContext)_localctx).T_LOCATION = match(T_LOCATION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOCATION!=null?((Non_reserved_wordsContext)_localctx).T_LOCATION.getText():null); 
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 70);
				{
				setState(3744);
				((Non_reserved_wordsContext)_localctx).T_LOCK = match(T_LOCK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOCK!=null?((Non_reserved_wordsContext)_localctx).T_LOCK.getText():null); 
				}
				break;
			case 71:
				enterOuterAlt(_localctx, 71);
				{
				setState(3746);
				((Non_reserved_wordsContext)_localctx).T_LOCKS = match(T_LOCKS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOCKS!=null?((Non_reserved_wordsContext)_localctx).T_LOCKS.getText():null); 
				}
				break;
			case 72:
				enterOuterAlt(_localctx, 72);
				{
				setState(3748);
				((Non_reserved_wordsContext)_localctx).T_LOGICAL = match(T_LOGICAL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LOGICAL!=null?((Non_reserved_wordsContext)_localctx).T_LOGICAL.getText():null); 
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 73);
				{
				setState(3750);
				((Non_reserved_wordsContext)_localctx).T_LONG = match(T_LONG);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LONG!=null?((Non_reserved_wordsContext)_localctx).T_LONG.getText():null); 
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 74);
				{
				setState(3752);
				((Non_reserved_wordsContext)_localctx).T_MAPJOIN = match(T_MAPJOIN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MAPJOIN!=null?((Non_reserved_wordsContext)_localctx).T_MAPJOIN.getText():null); 
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 75);
				{
				setState(3754);
				((Non_reserved_wordsContext)_localctx).T_MATERIALIZED = match(T_MATERIALIZED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MATERIALIZED!=null?((Non_reserved_wordsContext)_localctx).T_MATERIALIZED.getText():null); 
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 76);
				{
				setState(3756);
				((Non_reserved_wordsContext)_localctx).T_METADATA = match(T_METADATA);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_METADATA!=null?((Non_reserved_wordsContext)_localctx).T_METADATA.getText():null); 
				}
				break;
			case 77:
				enterOuterAlt(_localctx, 77);
				{
				setState(3758);
				((Non_reserved_wordsContext)_localctx).T_MINUS = match(T_MINUS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MINUS!=null?((Non_reserved_wordsContext)_localctx).T_MINUS.getText():null); 
				}
				break;
			case 78:
				enterOuterAlt(_localctx, 78);
				{
				setState(3760);
				((Non_reserved_wordsContext)_localctx).T_MINUTE = match(T_MINUTE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MINUTE!=null?((Non_reserved_wordsContext)_localctx).T_MINUTE.getText():null); 
				}
				break;
			case 79:
				enterOuterAlt(_localctx, 79);
				{
				setState(3762);
				((Non_reserved_wordsContext)_localctx).T_MONTH = match(T_MONTH);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MONTH!=null?((Non_reserved_wordsContext)_localctx).T_MONTH.getText():null); 
				}
				break;
			case 80:
				enterOuterAlt(_localctx, 80);
				{
				setState(3764);
				((Non_reserved_wordsContext)_localctx).T_MSCK = match(T_MSCK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MSCK!=null?((Non_reserved_wordsContext)_localctx).T_MSCK.getText():null); 
				}
				break;
			case 81:
				enterOuterAlt(_localctx, 81);
				{
				setState(3766);
				((Non_reserved_wordsContext)_localctx).T_NOSCAN = match(T_NOSCAN);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NOSCAN!=null?((Non_reserved_wordsContext)_localctx).T_NOSCAN.getText():null); 
				}
				break;
			case 82:
				enterOuterAlt(_localctx, 82);
				{
				setState(3768);
				((Non_reserved_wordsContext)_localctx).T_NO_DROP = match(T_NO_DROP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NO_DROP!=null?((Non_reserved_wordsContext)_localctx).T_NO_DROP.getText():null); 
				}
				break;
			case 83:
				enterOuterAlt(_localctx, 83);
				{
				setState(3770);
				((Non_reserved_wordsContext)_localctx).T_OFFLINE = match(T_OFFLINE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OFFLINE!=null?((Non_reserved_wordsContext)_localctx).T_OFFLINE.getText():null); 
				}
				break;
			case 84:
				enterOuterAlt(_localctx, 84);
				{
				setState(3772);
				((Non_reserved_wordsContext)_localctx).T_OPTION = match(T_OPTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OPTION!=null?((Non_reserved_wordsContext)_localctx).T_OPTION.getText():null); 
				}
				break;
			case 85:
				enterOuterAlt(_localctx, 85);
				{
				setState(3774);
				((Non_reserved_wordsContext)_localctx).T_OUTPUTDRIVER = match(T_OUTPUTDRIVER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OUTPUTDRIVER!=null?((Non_reserved_wordsContext)_localctx).T_OUTPUTDRIVER.getText():null); 
				}
				break;
			case 86:
				enterOuterAlt(_localctx, 86);
				{
				setState(3776);
				((Non_reserved_wordsContext)_localctx).T_OUTPUTFORMAT = match(T_OUTPUTFORMAT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OUTPUTFORMAT!=null?((Non_reserved_wordsContext)_localctx).T_OUTPUTFORMAT.getText():null); 
				}
				break;
			case 87:
				enterOuterAlt(_localctx, 87);
				{
				setState(3778);
				((Non_reserved_wordsContext)_localctx).T_OVERWRITE = match(T_OVERWRITE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OVERWRITE!=null?((Non_reserved_wordsContext)_localctx).T_OVERWRITE.getText():null); 
				}
				break;
			case 88:
				enterOuterAlt(_localctx, 88);
				{
				setState(3780);
				((Non_reserved_wordsContext)_localctx).T_OWNER = match(T_OWNER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OWNER!=null?((Non_reserved_wordsContext)_localctx).T_OWNER.getText():null); 
				}
				break;
			case 89:
				enterOuterAlt(_localctx, 89);
				{
				setState(3782);
				((Non_reserved_wordsContext)_localctx).T_PARTITIONED = match(T_PARTITIONED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PARTITIONED!=null?((Non_reserved_wordsContext)_localctx).T_PARTITIONED.getText():null); 
				}
				break;
			case 90:
				enterOuterAlt(_localctx, 90);
				{
				setState(3784);
				((Non_reserved_wordsContext)_localctx).T_PARTITIONS = match(T_PARTITIONS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PARTITIONS!=null?((Non_reserved_wordsContext)_localctx).T_PARTITIONS.getText():null); 
				}
				break;
			case 91:
				enterOuterAlt(_localctx, 91);
				{
				setState(3786);
				((Non_reserved_wordsContext)_localctx).T_PLUS = match(T_PLUS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PLUS!=null?((Non_reserved_wordsContext)_localctx).T_PLUS.getText():null); 
				}
				break;
			case 92:
				enterOuterAlt(_localctx, 92);
				{
				setState(3788);
				((Non_reserved_wordsContext)_localctx).T_PRETTY = match(T_PRETTY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PRETTY!=null?((Non_reserved_wordsContext)_localctx).T_PRETTY.getText():null); 
				}
				break;
			case 93:
				enterOuterAlt(_localctx, 93);
				{
				setState(3790);
				((Non_reserved_wordsContext)_localctx).T_PRINCIPALS = match(T_PRINCIPALS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PRINCIPALS!=null?((Non_reserved_wordsContext)_localctx).T_PRINCIPALS.getText():null); 
				}
				break;
			case 94:
				enterOuterAlt(_localctx, 94);
				{
				setState(3792);
				((Non_reserved_wordsContext)_localctx).T_PROTECTION = match(T_PROTECTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PROTECTION!=null?((Non_reserved_wordsContext)_localctx).T_PROTECTION.getText():null); 
				}
				break;
			case 95:
				enterOuterAlt(_localctx, 95);
				{
				setState(3794);
				((Non_reserved_wordsContext)_localctx).T_PURGE = match(T_PURGE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PURGE!=null?((Non_reserved_wordsContext)_localctx).T_PURGE.getText():null); 
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 96);
				{
				setState(3796);
				((Non_reserved_wordsContext)_localctx).T_READ = match(T_READ);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_READ!=null?((Non_reserved_wordsContext)_localctx).T_READ.getText():null); 
				}
				break;
			case 97:
				enterOuterAlt(_localctx, 97);
				{
				setState(3798);
				((Non_reserved_wordsContext)_localctx).T_READONLY = match(T_READONLY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_READONLY!=null?((Non_reserved_wordsContext)_localctx).T_READONLY.getText():null); 
				}
				break;
			case 98:
				enterOuterAlt(_localctx, 98);
				{
				setState(3800);
				((Non_reserved_wordsContext)_localctx).T_REBUILD = match(T_REBUILD);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REBUILD!=null?((Non_reserved_wordsContext)_localctx).T_REBUILD.getText():null); 
				}
				break;
			case 99:
				enterOuterAlt(_localctx, 99);
				{
				setState(3802);
				((Non_reserved_wordsContext)_localctx).T_RECORDREADER = match(T_RECORDREADER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RECORDREADER!=null?((Non_reserved_wordsContext)_localctx).T_RECORDREADER.getText():null); 
				}
				break;
			case 100:
				enterOuterAlt(_localctx, 100);
				{
				setState(3804);
				((Non_reserved_wordsContext)_localctx).T_RECORDWRITER = match(T_RECORDWRITER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RECORDWRITER!=null?((Non_reserved_wordsContext)_localctx).T_RECORDWRITER.getText():null); 
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 101);
				{
				setState(3806);
				((Non_reserved_wordsContext)_localctx).T_RELOAD = match(T_RELOAD);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RELOAD!=null?((Non_reserved_wordsContext)_localctx).T_RELOAD.getText():null); 
				}
				break;
			case 102:
				enterOuterAlt(_localctx, 102);
				{
				setState(3808);
				((Non_reserved_wordsContext)_localctx).T_RENAME = match(T_RENAME);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RENAME!=null?((Non_reserved_wordsContext)_localctx).T_RENAME.getText():null); 
				}
				break;
			case 103:
				enterOuterAlt(_localctx, 103);
				{
				setState(3810);
				((Non_reserved_wordsContext)_localctx).T_REPAIR = match(T_REPAIR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REPAIR!=null?((Non_reserved_wordsContext)_localctx).T_REPAIR.getText():null); 
				}
				break;
			case 104:
				enterOuterAlt(_localctx, 104);
				{
				setState(3812);
				((Non_reserved_wordsContext)_localctx).T_REPLACE = match(T_REPLACE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REPLACE!=null?((Non_reserved_wordsContext)_localctx).T_REPLACE.getText():null); 
				}
				break;
			case 105:
				enterOuterAlt(_localctx, 105);
				{
				setState(3814);
				((Non_reserved_wordsContext)_localctx).T_REPLICATION = match(T_REPLICATION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REPLICATION!=null?((Non_reserved_wordsContext)_localctx).T_REPLICATION.getText():null); 
				}
				break;
			case 106:
				enterOuterAlt(_localctx, 106);
				{
				setState(3816);
				((Non_reserved_wordsContext)_localctx).T_RESTRICT = match(T_RESTRICT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RESTRICT!=null?((Non_reserved_wordsContext)_localctx).T_RESTRICT.getText():null); 
				}
				break;
			case 107:
				enterOuterAlt(_localctx, 107);
				{
				setState(3818);
				((Non_reserved_wordsContext)_localctx).T_REWRITE = match(T_REWRITE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_REWRITE!=null?((Non_reserved_wordsContext)_localctx).T_REWRITE.getText():null); 
				}
				break;
			case 108:
				enterOuterAlt(_localctx, 108);
				{
				setState(3820);
				((Non_reserved_wordsContext)_localctx).T_ROLE = match(T_ROLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ROLE!=null?((Non_reserved_wordsContext)_localctx).T_ROLE.getText():null); 
				}
				break;
			case 109:
				enterOuterAlt(_localctx, 109);
				{
				setState(3822);
				((Non_reserved_wordsContext)_localctx).T_ROLES = match(T_ROLES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ROLES!=null?((Non_reserved_wordsContext)_localctx).T_ROLES.getText():null); 
				}
				break;
			case 110:
				enterOuterAlt(_localctx, 110);
				{
				setState(3824);
				((Non_reserved_wordsContext)_localctx).T_SCHEMA = match(T_SCHEMA);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SCHEMA!=null?((Non_reserved_wordsContext)_localctx).T_SCHEMA.getText():null); 
				}
				break;
			case 111:
				enterOuterAlt(_localctx, 111);
				{
				setState(3826);
				((Non_reserved_wordsContext)_localctx).T_SCHEMAS = match(T_SCHEMAS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SCHEMAS!=null?((Non_reserved_wordsContext)_localctx).T_SCHEMAS.getText():null); 
				}
				break;
			case 112:
				enterOuterAlt(_localctx, 112);
				{
				setState(3828);
				((Non_reserved_wordsContext)_localctx).T_SECOND = match(T_SECOND);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SECOND!=null?((Non_reserved_wordsContext)_localctx).T_SECOND.getText():null); 
				}
				break;
			case 113:
				enterOuterAlt(_localctx, 113);
				{
				setState(3830);
				((Non_reserved_wordsContext)_localctx).T_SEMI = match(T_SEMI);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SEMI!=null?((Non_reserved_wordsContext)_localctx).T_SEMI.getText():null); 
				}
				break;
			case 114:
				enterOuterAlt(_localctx, 114);
				{
				setState(3832);
				((Non_reserved_wordsContext)_localctx).T_SERDE = match(T_SERDE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SERDE!=null?((Non_reserved_wordsContext)_localctx).T_SERDE.getText():null); 
				}
				break;
			case 115:
				enterOuterAlt(_localctx, 115);
				{
				setState(3834);
				((Non_reserved_wordsContext)_localctx).T_SERDEPROPERTIES = match(T_SERDEPROPERTIES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SERDEPROPERTIES!=null?((Non_reserved_wordsContext)_localctx).T_SERDEPROPERTIES.getText():null); 
				}
				break;
			case 116:
				enterOuterAlt(_localctx, 116);
				{
				setState(3836);
				((Non_reserved_wordsContext)_localctx).T_SERVER = match(T_SERVER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SERVER!=null?((Non_reserved_wordsContext)_localctx).T_SERVER.getText():null); 
				}
				break;
			case 117:
				enterOuterAlt(_localctx, 117);
				{
				setState(3838);
				((Non_reserved_wordsContext)_localctx).T_SETS = match(T_SETS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SETS!=null?((Non_reserved_wordsContext)_localctx).T_SETS.getText():null); 
				}
				break;
			case 118:
				enterOuterAlt(_localctx, 118);
				{
				setState(3840);
				((Non_reserved_wordsContext)_localctx).T_SHARED = match(T_SHARED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SHARED!=null?((Non_reserved_wordsContext)_localctx).T_SHARED.getText():null); 
				}
				break;
			case 119:
				enterOuterAlt(_localctx, 119);
				{
				setState(3842);
				((Non_reserved_wordsContext)_localctx).T_SHOW = match(T_SHOW);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SHOW!=null?((Non_reserved_wordsContext)_localctx).T_SHOW.getText():null); 
				}
				break;
			case 120:
				enterOuterAlt(_localctx, 120);
				{
				setState(3844);
				((Non_reserved_wordsContext)_localctx).T_SHOW_DATABASE = match(T_SHOW_DATABASE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SHOW_DATABASE!=null?((Non_reserved_wordsContext)_localctx).T_SHOW_DATABASE.getText():null); 
				}
				break;
			case 121:
				enterOuterAlt(_localctx, 121);
				{
				setState(3846);
				((Non_reserved_wordsContext)_localctx).T_SKEWED = match(T_SKEWED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SKEWED!=null?((Non_reserved_wordsContext)_localctx).T_SKEWED.getText():null); 
				}
				break;
			case 122:
				enterOuterAlt(_localctx, 122);
				{
				setState(3848);
				((Non_reserved_wordsContext)_localctx).T_SORT = match(T_SORT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SORT!=null?((Non_reserved_wordsContext)_localctx).T_SORT.getText():null); 
				}
				break;
			case 123:
				enterOuterAlt(_localctx, 123);
				{
				setState(3850);
				((Non_reserved_wordsContext)_localctx).T_SORTED = match(T_SORTED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SORTED!=null?((Non_reserved_wordsContext)_localctx).T_SORTED.getText():null); 
				}
				break;
			case 124:
				enterOuterAlt(_localctx, 124);
				{
				setState(3852);
				((Non_reserved_wordsContext)_localctx).T_SSL = match(T_SSL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SSL!=null?((Non_reserved_wordsContext)_localctx).T_SSL.getText():null); 
				}
				break;
			case 125:
				enterOuterAlt(_localctx, 125);
				{
				setState(3854);
				((Non_reserved_wordsContext)_localctx).T_STATISTICS = match(T_STATISTICS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STATISTICS!=null?((Non_reserved_wordsContext)_localctx).T_STATISTICS.getText():null); 
				}
				break;
			case 126:
				enterOuterAlt(_localctx, 126);
				{
				setState(3856);
				((Non_reserved_wordsContext)_localctx).T_STORED = match(T_STORED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STORED!=null?((Non_reserved_wordsContext)_localctx).T_STORED.getText():null); 
				}
				break;
			case 127:
				enterOuterAlt(_localctx, 127);
				{
				setState(3858);
				((Non_reserved_wordsContext)_localctx).T_STREAMTABLE = match(T_STREAMTABLE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STREAMTABLE!=null?((Non_reserved_wordsContext)_localctx).T_STREAMTABLE.getText():null); 
				}
				break;
			case 128:
				enterOuterAlt(_localctx, 128);
				{
				setState(3860);
				((Non_reserved_wordsContext)_localctx).T_STRING = match(T_STRING);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STRING!=null?((Non_reserved_wordsContext)_localctx).T_STRING.getText():null); 
				}
				break;
			case 129:
				enterOuterAlt(_localctx, 129);
				{
				setState(3862);
				((Non_reserved_wordsContext)_localctx).T_STRUCT = match(T_STRUCT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_STRUCT!=null?((Non_reserved_wordsContext)_localctx).T_STRUCT.getText():null); 
				}
				break;
			case 130:
				enterOuterAlt(_localctx, 130);
				{
				setState(3864);
				((Non_reserved_wordsContext)_localctx).T_TABLES = match(T_TABLES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TABLES!=null?((Non_reserved_wordsContext)_localctx).T_TABLES.getText():null); 
				}
				break;
			case 131:
				enterOuterAlt(_localctx, 131);
				{
				setState(3866);
				((Non_reserved_wordsContext)_localctx).T_TBLPROPERTIES = match(T_TBLPROPERTIES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TBLPROPERTIES!=null?((Non_reserved_wordsContext)_localctx).T_TBLPROPERTIES.getText():null); 
				}
				break;
			case 132:
				enterOuterAlt(_localctx, 132);
				{
				setState(3868);
				((Non_reserved_wordsContext)_localctx).T_TEMPORARY = match(T_TEMPORARY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TEMPORARY!=null?((Non_reserved_wordsContext)_localctx).T_TEMPORARY.getText():null); 
				}
				break;
			case 133:
				enterOuterAlt(_localctx, 133);
				{
				setState(3870);
				((Non_reserved_wordsContext)_localctx).T_TERMINATED = match(T_TERMINATED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TERMINATED!=null?((Non_reserved_wordsContext)_localctx).T_TERMINATED.getText():null); 
				}
				break;
			case 134:
				enterOuterAlt(_localctx, 134);
				{
				setState(3872);
				((Non_reserved_wordsContext)_localctx).T_TINYINT = match(T_TINYINT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TINYINT!=null?((Non_reserved_wordsContext)_localctx).T_TINYINT.getText():null); 
				}
				break;
			case 135:
				enterOuterAlt(_localctx, 135);
				{
				setState(3874);
				((Non_reserved_wordsContext)_localctx).T_TOUCH = match(T_TOUCH);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TOUCH!=null?((Non_reserved_wordsContext)_localctx).T_TOUCH.getText():null); 
				}
				break;
			case 136:
				enterOuterAlt(_localctx, 136);
				{
				setState(3876);
				((Non_reserved_wordsContext)_localctx).T_TRANSACTIONS = match(T_TRANSACTIONS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TRANSACTIONS!=null?((Non_reserved_wordsContext)_localctx).T_TRANSACTIONS.getText():null); 
				}
				break;
			case 137:
				enterOuterAlt(_localctx, 137);
				{
				setState(3878);
				((Non_reserved_wordsContext)_localctx).T_UNARCHIVE = match(T_UNARCHIVE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNARCHIVE!=null?((Non_reserved_wordsContext)_localctx).T_UNARCHIVE.getText():null); 
				}
				break;
			case 138:
				enterOuterAlt(_localctx, 138);
				{
				setState(3880);
				((Non_reserved_wordsContext)_localctx).T_UNDO = match(T_UNDO);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNDO!=null?((Non_reserved_wordsContext)_localctx).T_UNDO.getText():null); 
				}
				break;
			case 139:
				enterOuterAlt(_localctx, 139);
				{
				setState(3882);
				((Non_reserved_wordsContext)_localctx).T_UNIONTYPE = match(T_UNIONTYPE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNIONTYPE!=null?((Non_reserved_wordsContext)_localctx).T_UNIONTYPE.getText():null); 
				}
				break;
			case 140:
				enterOuterAlt(_localctx, 140);
				{
				setState(3884);
				((Non_reserved_wordsContext)_localctx).T_UNLOCK = match(T_UNLOCK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNLOCK!=null?((Non_reserved_wordsContext)_localctx).T_UNLOCK.getText():null); 
				}
				break;
			case 141:
				enterOuterAlt(_localctx, 141);
				{
				setState(3886);
				((Non_reserved_wordsContext)_localctx).T_UNSET = match(T_UNSET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNSET!=null?((Non_reserved_wordsContext)_localctx).T_UNSET.getText():null); 
				}
				break;
			case 142:
				enterOuterAlt(_localctx, 142);
				{
				setState(3888);
				((Non_reserved_wordsContext)_localctx).T_UNSIGNED = match(T_UNSIGNED);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNSIGNED!=null?((Non_reserved_wordsContext)_localctx).T_UNSIGNED.getText():null); 
				}
				break;
			case 143:
				enterOuterAlt(_localctx, 143);
				{
				setState(3890);
				((Non_reserved_wordsContext)_localctx).T_URI = match(T_URI);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_URI!=null?((Non_reserved_wordsContext)_localctx).T_URI.getText():null); 
				}
				break;
			case 144:
				enterOuterAlt(_localctx, 144);
				{
				setState(3892);
				((Non_reserved_wordsContext)_localctx).T_USE = match(T_USE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_USE!=null?((Non_reserved_wordsContext)_localctx).T_USE.getText():null); 
				}
				break;
			case 145:
				enterOuterAlt(_localctx, 145);
				{
				setState(3894);
				((Non_reserved_wordsContext)_localctx).T_UTC = match(T_UTC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UTC!=null?((Non_reserved_wordsContext)_localctx).T_UTC.getText():null); 
				}
				break;
			case 146:
				enterOuterAlt(_localctx, 146);
				{
				setState(3896);
				((Non_reserved_wordsContext)_localctx).T_UTCTIMESTAMP = match(T_UTCTIMESTAMP);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UTCTIMESTAMP!=null?((Non_reserved_wordsContext)_localctx).T_UTCTIMESTAMP.getText():null); 
				}
				break;
			case 147:
				enterOuterAlt(_localctx, 147);
				{
				setState(3898);
				((Non_reserved_wordsContext)_localctx).T_VALUE_TYPE = match(T_VALUE_TYPE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VALUE_TYPE!=null?((Non_reserved_wordsContext)_localctx).T_VALUE_TYPE.getText():null); 
				}
				break;
			case 148:
				enterOuterAlt(_localctx, 148);
				{
				setState(3900);
				((Non_reserved_wordsContext)_localctx).T_VIEW = match(T_VIEW);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VIEW!=null?((Non_reserved_wordsContext)_localctx).T_VIEW.getText():null); 
				}
				break;
			case 149:
				enterOuterAlt(_localctx, 149);
				{
				setState(3902);
				((Non_reserved_wordsContext)_localctx).T_WHILE = match(T_WHILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WHILE!=null?((Non_reserved_wordsContext)_localctx).T_WHILE.getText():null); 
				}
				break;
			case 150:
				enterOuterAlt(_localctx, 150);
				{
				setState(3904);
				((Non_reserved_wordsContext)_localctx).T_YEAR = match(T_YEAR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_YEAR!=null?((Non_reserved_wordsContext)_localctx).T_YEAR.getText():null); 
				}
				break;
			case 151:
				enterOuterAlt(_localctx, 151);
				{
				setState(3906);
				((Non_reserved_wordsContext)_localctx).T_ISOLATION = match(T_ISOLATION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ISOLATION!=null?((Non_reserved_wordsContext)_localctx).T_ISOLATION.getText():null); 
				}
				break;
			case 152:
				enterOuterAlt(_localctx, 152);
				{
				setState(3908);
				((Non_reserved_wordsContext)_localctx).T_LEVEL = match(T_LEVEL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LEVEL!=null?((Non_reserved_wordsContext)_localctx).T_LEVEL.getText():null); 
				}
				break;
			case 153:
				enterOuterAlt(_localctx, 153);
				{
				setState(3910);
				((Non_reserved_wordsContext)_localctx).T_OFFSET = match(T_OFFSET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OFFSET!=null?((Non_reserved_wordsContext)_localctx).T_OFFSET.getText():null); 
				}
				break;
			case 154:
				enterOuterAlt(_localctx, 154);
				{
				setState(3912);
				((Non_reserved_wordsContext)_localctx).T_SNAPSHOT = match(T_SNAPSHOT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SNAPSHOT!=null?((Non_reserved_wordsContext)_localctx).T_SNAPSHOT.getText():null); 
				}
				break;
			case 155:
				enterOuterAlt(_localctx, 155);
				{
				setState(3914);
				((Non_reserved_wordsContext)_localctx).T_TRANSACTION = match(T_TRANSACTION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TRANSACTION!=null?((Non_reserved_wordsContext)_localctx).T_TRANSACTION.getText():null); 
				}
				break;
			case 156:
				enterOuterAlt(_localctx, 156);
				{
				setState(3916);
				((Non_reserved_wordsContext)_localctx).T_WORK = match(T_WORK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WORK!=null?((Non_reserved_wordsContext)_localctx).T_WORK.getText():null); 
				}
				break;
			case 157:
				enterOuterAlt(_localctx, 157);
				{
				setState(3918);
				((Non_reserved_wordsContext)_localctx).T_WRITE = match(T_WRITE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WRITE!=null?((Non_reserved_wordsContext)_localctx).T_WRITE.getText():null); 
				}
				break;
			case 158:
				enterOuterAlt(_localctx, 158);
				{
				setState(3920);
				((Non_reserved_wordsContext)_localctx).T_ABORT = match(T_ABORT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ABORT!=null?((Non_reserved_wordsContext)_localctx).T_ABORT.getText():null); 
				}
				break;
			case 159:
				enterOuterAlt(_localctx, 159);
				{
				setState(3922);
				((Non_reserved_wordsContext)_localctx).T_KEY = match(T_KEY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_KEY!=null?((Non_reserved_wordsContext)_localctx).T_KEY.getText():null); 
				}
				break;
			case 160:
				enterOuterAlt(_localctx, 160);
				{
				setState(3924);
				((Non_reserved_wordsContext)_localctx).T_LAST = match(T_LAST);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_LAST!=null?((Non_reserved_wordsContext)_localctx).T_LAST.getText():null); 
				}
				break;
			case 161:
				enterOuterAlt(_localctx, 161);
				{
				setState(3926);
				((Non_reserved_wordsContext)_localctx).T_NORELY = match(T_NORELY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NORELY!=null?((Non_reserved_wordsContext)_localctx).T_NORELY.getText():null); 
				}
				break;
			case 162:
				enterOuterAlt(_localctx, 162);
				{
				setState(3928);
				((Non_reserved_wordsContext)_localctx).T_NOVALIDATE = match(T_NOVALIDATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NOVALIDATE!=null?((Non_reserved_wordsContext)_localctx).T_NOVALIDATE.getText():null); 
				}
				break;
			case 163:
				enterOuterAlt(_localctx, 163);
				{
				setState(3930);
				((Non_reserved_wordsContext)_localctx).T_NULLS = match(T_NULLS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NULLS!=null?((Non_reserved_wordsContext)_localctx).T_NULLS.getText():null); 
				}
				break;
			case 164:
				enterOuterAlt(_localctx, 164);
				{
				setState(3932);
				((Non_reserved_wordsContext)_localctx).T_RELY = match(T_RELY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RELY!=null?((Non_reserved_wordsContext)_localctx).T_RELY.getText():null); 
				}
				break;
			case 165:
				enterOuterAlt(_localctx, 165);
				{
				setState(3934);
				((Non_reserved_wordsContext)_localctx).T_VALIDATE = match(T_VALIDATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VALIDATE!=null?((Non_reserved_wordsContext)_localctx).T_VALIDATE.getText():null); 
				}
				break;
			case 166:
				enterOuterAlt(_localctx, 166);
				{
				setState(3936);
				((Non_reserved_wordsContext)_localctx).T_DETAIL = match(T_DETAIL);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DETAIL!=null?((Non_reserved_wordsContext)_localctx).T_DETAIL.getText():null); 
				}
				break;
			case 167:
				enterOuterAlt(_localctx, 167);
				{
				setState(3938);
				((Non_reserved_wordsContext)_localctx).T_DOW = match(T_DOW);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DOW!=null?((Non_reserved_wordsContext)_localctx).T_DOW.getText():null); 
				}
				break;
			case 168:
				enterOuterAlt(_localctx, 168);
				{
				setState(3940);
				((Non_reserved_wordsContext)_localctx).T_EXPRESSION = match(T_EXPRESSION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_EXPRESSION!=null?((Non_reserved_wordsContext)_localctx).T_EXPRESSION.getText():null); 
				}
				break;
			case 169:
				enterOuterAlt(_localctx, 169);
				{
				setState(3942);
				((Non_reserved_wordsContext)_localctx).T_OPERATOR = match(T_OPERATOR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_OPERATOR!=null?((Non_reserved_wordsContext)_localctx).T_OPERATOR.getText():null); 
				}
				break;
			case 170:
				enterOuterAlt(_localctx, 170);
				{
				setState(3944);
				((Non_reserved_wordsContext)_localctx).T_QUARTER = match(T_QUARTER);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_QUARTER!=null?((Non_reserved_wordsContext)_localctx).T_QUARTER.getText():null); 
				}
				break;
			case 171:
				enterOuterAlt(_localctx, 171);
				{
				setState(3946);
				((Non_reserved_wordsContext)_localctx).T_SUMMARY = match(T_SUMMARY);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SUMMARY!=null?((Non_reserved_wordsContext)_localctx).T_SUMMARY.getText():null); 
				}
				break;
			case 172:
				enterOuterAlt(_localctx, 172);
				{
				setState(3948);
				((Non_reserved_wordsContext)_localctx).T_VECTORIZATION = match(T_VECTORIZATION);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_VECTORIZATION!=null?((Non_reserved_wordsContext)_localctx).T_VECTORIZATION.getText():null); 
				}
				break;
			case 173:
				enterOuterAlt(_localctx, 173);
				{
				setState(3950);
				((Non_reserved_wordsContext)_localctx).T_WEEK = match(T_WEEK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WEEK!=null?((Non_reserved_wordsContext)_localctx).T_WEEK.getText():null); 
				}
				break;
			case 174:
				enterOuterAlt(_localctx, 174);
				{
				setState(3952);
				((Non_reserved_wordsContext)_localctx).T_YEARS = match(T_YEARS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_YEARS!=null?((Non_reserved_wordsContext)_localctx).T_YEARS.getText():null); 
				}
				break;
			case 175:
				enterOuterAlt(_localctx, 175);
				{
				setState(3954);
				((Non_reserved_wordsContext)_localctx).T_MONTHS = match(T_MONTHS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MONTHS!=null?((Non_reserved_wordsContext)_localctx).T_MONTHS.getText():null); 
				}
				break;
			case 176:
				enterOuterAlt(_localctx, 176);
				{
				setState(3956);
				((Non_reserved_wordsContext)_localctx).T_WEEKS = match(T_WEEKS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_WEEKS!=null?((Non_reserved_wordsContext)_localctx).T_WEEKS.getText():null); 
				}
				break;
			case 177:
				enterOuterAlt(_localctx, 177);
				{
				setState(3958);
				((Non_reserved_wordsContext)_localctx).T_DAYS = match(T_DAYS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DAYS!=null?((Non_reserved_wordsContext)_localctx).T_DAYS.getText():null); 
				}
				break;
			case 178:
				enterOuterAlt(_localctx, 178);
				{
				setState(3960);
				((Non_reserved_wordsContext)_localctx).T_HOURS = match(T_HOURS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HOURS!=null?((Non_reserved_wordsContext)_localctx).T_HOURS.getText():null); 
				}
				break;
			case 179:
				enterOuterAlt(_localctx, 179);
				{
				setState(3962);
				((Non_reserved_wordsContext)_localctx).T_MINUTES = match(T_MINUTES);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_MINUTES!=null?((Non_reserved_wordsContext)_localctx).T_MINUTES.getText():null); 
				}
				break;
			case 180:
				enterOuterAlt(_localctx, 180);
				{
				setState(3964);
				((Non_reserved_wordsContext)_localctx).T_SECONDS = match(T_SECONDS);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SECONDS!=null?((Non_reserved_wordsContext)_localctx).T_SECONDS.getText():null); 
				}
				break;
			case 181:
				enterOuterAlt(_localctx, 181);
				{
				setState(3966);
				((Non_reserved_wordsContext)_localctx).T_TIMESTAMPTZ = match(T_TIMESTAMPTZ);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TIMESTAMPTZ!=null?((Non_reserved_wordsContext)_localctx).T_TIMESTAMPTZ.getText():null); 
				}
				break;
			case 182:
				enterOuterAlt(_localctx, 182);
				{
				setState(3968);
				((Non_reserved_wordsContext)_localctx).T_ZONE = match(T_ZONE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ZONE!=null?((Non_reserved_wordsContext)_localctx).T_ZONE.getText():null); 
				}
				break;
			case 183:
				enterOuterAlt(_localctx, 183);
				{
				setState(3970);
				((Non_reserved_wordsContext)_localctx).T_SYSDATE = match(T_SYSDATE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SYSDATE!=null?((Non_reserved_wordsContext)_localctx).T_SYSDATE.getText():null); 
				}
				break;
			case 184:
				enterOuterAlt(_localctx, 184);
				{
				setState(3972);
				((Non_reserved_wordsContext)_localctx).T_NAMED_STRUCT = match(T_NAMED_STRUCT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_NAMED_STRUCT!=null?((Non_reserved_wordsContext)_localctx).T_NAMED_STRUCT.getText():null); 
				}
				break;
			case 185:
				enterOuterAlt(_localctx, 185);
				{
				setState(3974);
				((Non_reserved_wordsContext)_localctx).T_UNIQUE = match(T_UNIQUE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_UNIQUE!=null?((Non_reserved_wordsContext)_localctx).T_UNIQUE.getText():null); 
				}
				break;
			case 186:
				enterOuterAlt(_localctx, 186);
				{
				setState(3976);
				((Non_reserved_wordsContext)_localctx).T_CHECK = match(T_CHECK);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_CHECK!=null?((Non_reserved_wordsContext)_localctx).T_CHECK.getText():null); 
				}
				break;
			case 187:
				enterOuterAlt(_localctx, 187);
				{
				setState(3978);
				((Non_reserved_wordsContext)_localctx).T_DEFAULT = match(T_DEFAULT);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_DEFAULT!=null?((Non_reserved_wordsContext)_localctx).T_DEFAULT.getText():null); 
				}
				break;
			case 188:
				enterOuterAlt(_localctx, 188);
				{
				setState(3980);
				((Non_reserved_wordsContext)_localctx).T_SEQUENCEFILE = match(T_SEQUENCEFILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_SEQUENCEFILE!=null?((Non_reserved_wordsContext)_localctx).T_SEQUENCEFILE.getText():null); 
				}
				break;
			case 189:
				enterOuterAlt(_localctx, 189);
				{
				setState(3982);
				((Non_reserved_wordsContext)_localctx).T_TEXTFILE = match(T_TEXTFILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_TEXTFILE!=null?((Non_reserved_wordsContext)_localctx).T_TEXTFILE.getText():null); 
				}
				break;
			case 190:
				enterOuterAlt(_localctx, 190);
				{
				setState(3984);
				((Non_reserved_wordsContext)_localctx).T_RCFILE = match(T_RCFILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_RCFILE!=null?((Non_reserved_wordsContext)_localctx).T_RCFILE.getText():null); 
				}
				break;
			case 191:
				enterOuterAlt(_localctx, 191);
				{
				setState(3986);
				((Non_reserved_wordsContext)_localctx).T_ORC = match(T_ORC);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_ORC!=null?((Non_reserved_wordsContext)_localctx).T_ORC.getText():null); 
				}
				break;
			case 192:
				enterOuterAlt(_localctx, 192);
				{
				setState(3988);
				((Non_reserved_wordsContext)_localctx).T_PARQUET = match(T_PARQUET);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_PARQUET!=null?((Non_reserved_wordsContext)_localctx).T_PARQUET.getText():null); 
				}
				break;
			case 193:
				enterOuterAlt(_localctx, 193);
				{
				setState(3990);
				((Non_reserved_wordsContext)_localctx).T_AVRO = match(T_AVRO);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_AVRO!=null?((Non_reserved_wordsContext)_localctx).T_AVRO.getText():null); 
				}
				break;
			case 194:
				enterOuterAlt(_localctx, 194);
				{
				setState(3992);
				((Non_reserved_wordsContext)_localctx).T_JSONFILE = match(T_JSONFILE);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_JSONFILE!=null?((Non_reserved_wordsContext)_localctx).T_JSONFILE.getText():null); 
				}
				break;
			case 195:
				enterOuterAlt(_localctx, 195);
				{
				setState(3994);
				((Non_reserved_wordsContext)_localctx).T_HIVECONF = match(T_HIVECONF);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HIVECONF!=null?((Non_reserved_wordsContext)_localctx).T_HIVECONF.getText():null); 
				}
				break;
			case 196:
				enterOuterAlt(_localctx, 196);
				{
				setState(3996);
				((Non_reserved_wordsContext)_localctx).T_HIVEVAR = match(T_HIVEVAR);
				 ((Non_reserved_wordsContext)_localctx).res =  (((Non_reserved_wordsContext)_localctx).T_HIVEVAR!=null?((Non_reserved_wordsContext)_localctx).T_HIVEVAR.getText():null); 
				}
				break;
			case 197:
				enterOuterAlt(_localctx, 197);
				{
				setState(3998);
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
		enterRule(_localctx, 258, RULE_function_names);
		try {
			setState(4428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_REGR_AVGX:
				enterOuterAlt(_localctx, 1);
				{
				setState(4002);
				((Function_namesContext)_localctx).T_REGR_AVGX = match(T_REGR_AVGX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_AVGX!=null?((Function_namesContext)_localctx).T_REGR_AVGX.getText():null); 
				}
				break;
			case T_LOWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(4004);
				((Function_namesContext)_localctx).T_LOWER = match(T_LOWER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOWER!=null?((Function_namesContext)_localctx).T_LOWER.getText():null); 
				}
				break;
			case T_SHIFTRIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(4006);
				((Function_namesContext)_localctx).T_SHIFTRIGHT = match(T_SHIFTRIGHT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHIFTRIGHT!=null?((Function_namesContext)_localctx).T_SHIFTRIGHT.getText():null); 
				}
				break;
			case T_LOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(4008);
				((Function_namesContext)_localctx).T_LOG = match(T_LOG);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOG!=null?((Function_namesContext)_localctx).T_LOG.getText():null); 
				}
				break;
			case T_ABS:
				enterOuterAlt(_localctx, 5);
				{
				setState(4010);
				((Function_namesContext)_localctx).T_ABS = match(T_ABS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ABS!=null?((Function_namesContext)_localctx).T_ABS.getText():null); 
				}
				break;
			case T_NULLIF:
				enterOuterAlt(_localctx, 6);
				{
				setState(4012);
				((Function_namesContext)_localctx).T_NULLIF = match(T_NULLIF);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NULLIF!=null?((Function_namesContext)_localctx).T_NULLIF.getText():null); 
				}
				break;
			case T_ENCODE:
				enterOuterAlt(_localctx, 7);
				{
				setState(4014);
				((Function_namesContext)_localctx).T_ENCODE = match(T_ENCODE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ENCODE!=null?((Function_namesContext)_localctx).T_ENCODE.getText():null); 
				}
				break;
			case T_FIELD:
				enterOuterAlt(_localctx, 8);
				{
				setState(4016);
				((Function_namesContext)_localctx).T_FIELD = match(T_FIELD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FIELD!=null?((Function_namesContext)_localctx).T_FIELD.getText():null); 
				}
				break;
			case T_END:
				enterOuterAlt(_localctx, 9);
				{
				setState(4018);
				((Function_namesContext)_localctx).T_END = match(T_END);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_END!=null?((Function_namesContext)_localctx).T_END.getText():null); 
				}
				break;
			case T_DATE_SUB:
				enterOuterAlt(_localctx, 10);
				{
				setState(4020);
				((Function_namesContext)_localctx).T_DATE_SUB = match(T_DATE_SUB);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DATE_SUB!=null?((Function_namesContext)_localctx).T_DATE_SUB.getText():null); 
				}
				break;
			case T_ASIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(4022);
				((Function_namesContext)_localctx).T_ASIN = match(T_ASIN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ASIN!=null?((Function_namesContext)_localctx).T_ASIN.getText():null); 
				}
				break;
			case T_SUBSTR:
				enterOuterAlt(_localctx, 12);
				{
				setState(4024);
				((Function_namesContext)_localctx).T_SUBSTR = match(T_SUBSTR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SUBSTR!=null?((Function_namesContext)_localctx).T_SUBSTR.getText():null); 
				}
				break;
			case T_UNIX_TIMESTAMP:
				enterOuterAlt(_localctx, 13);
				{
				setState(4026);
				((Function_namesContext)_localctx).T_UNIX_TIMESTAMP = match(T_UNIX_TIMESTAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UNIX_TIMESTAMP!=null?((Function_namesContext)_localctx).T_UNIX_TIMESTAMP.getText():null); 
				}
				break;
			case T_DECODE:
				enterOuterAlt(_localctx, 14);
				{
				setState(4028);
				((Function_namesContext)_localctx).T_DECODE = match(T_DECODE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DECODE!=null?((Function_namesContext)_localctx).T_DECODE.getText():null); 
				}
				break;
			case T_STDDEV_POP:
				enterOuterAlt(_localctx, 15);
				{
				setState(4030);
				((Function_namesContext)_localctx).T_STDDEV_POP = match(T_STDDEV_POP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_STDDEV_POP!=null?((Function_namesContext)_localctx).T_STDDEV_POP.getText():null); 
				}
				break;
			case T_SIN:
				enterOuterAlt(_localctx, 16);
				{
				setState(4032);
				((Function_namesContext)_localctx).T_SIN = match(T_SIN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SIN!=null?((Function_namesContext)_localctx).T_SIN.getText():null); 
				}
				break;
			case T_SORT_ARRAY:
				enterOuterAlt(_localctx, 17);
				{
				setState(4034);
				((Function_namesContext)_localctx).T_SORT_ARRAY = match(T_SORT_ARRAY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SORT_ARRAY!=null?((Function_namesContext)_localctx).T_SORT_ARRAY.getText():null); 
				}
				break;
			case T_BINARY:
				enterOuterAlt(_localctx, 18);
				{
				setState(4036);
				((Function_namesContext)_localctx).T_BINARY = match(T_BINARY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BINARY!=null?((Function_namesContext)_localctx).T_BINARY.getText():null); 
				}
				break;
			case T_CONCATENATE:
				enterOuterAlt(_localctx, 19);
				{
				setState(4038);
				((Function_namesContext)_localctx).T_CONCATENATE = match(T_CONCATENATE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CONCATENATE!=null?((Function_namesContext)_localctx).T_CONCATENATE.getText():null); 
				}
				break;
			case T_CURRENT_USER:
				enterOuterAlt(_localctx, 20);
				{
				setState(4040);
				((Function_namesContext)_localctx).T_CURRENT_USER = match(T_CURRENT_USER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CURRENT_USER!=null?((Function_namesContext)_localctx).T_CURRENT_USER.getText():null); 
				}
				break;
			case T_ASSERT_TRUE:
				enterOuterAlt(_localctx, 21);
				{
				setState(4042);
				((Function_namesContext)_localctx).T_ASSERT_TRUE = match(T_ASSERT_TRUE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ASSERT_TRUE!=null?((Function_namesContext)_localctx).T_ASSERT_TRUE.getText():null); 
				}
				break;
			case T_NVL:
				enterOuterAlt(_localctx, 22);
				{
				setState(4044);
				((Function_namesContext)_localctx).T_NVL = match(T_NVL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NVL!=null?((Function_namesContext)_localctx).T_NVL.getText():null); 
				}
				break;
			case T_SHA2:
				enterOuterAlt(_localctx, 23);
				{
				setState(4046);
				((Function_namesContext)_localctx).T_SHA2 = match(T_SHA2);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHA2!=null?((Function_namesContext)_localctx).T_SHA2.getText():null); 
				}
				break;
			case T_DATEDIFF:
				enterOuterAlt(_localctx, 24);
				{
				setState(4048);
				((Function_namesContext)_localctx).T_DATEDIFF = match(T_DATEDIFF);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DATEDIFF!=null?((Function_namesContext)_localctx).T_DATEDIFF.getText():null); 
				}
				break;
			case T_HISTOGRAM_NUMERIC:
				enterOuterAlt(_localctx, 25);
				{
				setState(4050);
				((Function_namesContext)_localctx).T_HISTOGRAM_NUMERIC = match(T_HISTOGRAM_NUMERIC);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_HISTOGRAM_NUMERIC!=null?((Function_namesContext)_localctx).T_HISTOGRAM_NUMERIC.getText():null); 
				}
				break;
			case T_TO_DATE:
				enterOuterAlt(_localctx, 26);
				{
				setState(4052);
				((Function_namesContext)_localctx).T_TO_DATE = match(T_TO_DATE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TO_DATE!=null?((Function_namesContext)_localctx).T_TO_DATE.getText():null); 
				}
				break;
			case T_NEGATIVE:
				enterOuterAlt(_localctx, 27);
				{
				setState(4054);
				((Function_namesContext)_localctx).T_NEGATIVE = match(T_NEGATIVE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NEGATIVE!=null?((Function_namesContext)_localctx).T_NEGATIVE.getText():null); 
				}
				break;
			case T_CONCAT_WS:
				enterOuterAlt(_localctx, 28);
				{
				setState(4056);
				((Function_namesContext)_localctx).T_CONCAT_WS = match(T_CONCAT_WS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CONCAT_WS!=null?((Function_namesContext)_localctx).T_CONCAT_WS.getText():null); 
				}
				break;
			case T_LEAST:
				enterOuterAlt(_localctx, 29);
				{
				setState(4058);
				((Function_namesContext)_localctx).T_LEAST = match(T_LEAST);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LEAST!=null?((Function_namesContext)_localctx).T_LEAST.getText():null); 
				}
				break;
			case T_FIND_IN_SET:
				enterOuterAlt(_localctx, 30);
				{
				setState(4060);
				((Function_namesContext)_localctx).T_FIND_IN_SET = match(T_FIND_IN_SET);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FIND_IN_SET!=null?((Function_namesContext)_localctx).T_FIND_IN_SET.getText():null); 
				}
				break;
			case T_CONCAT:
				enterOuterAlt(_localctx, 31);
				{
				setState(4062);
				((Function_namesContext)_localctx).T_CONCAT = match(T_CONCAT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CONCAT!=null?((Function_namesContext)_localctx).T_CONCAT.getText():null); 
				}
				break;
			case T_MD5:
				enterOuterAlt(_localctx, 32);
				{
				setState(4064);
				((Function_namesContext)_localctx).T_MD5 = match(T_MD5);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MD5!=null?((Function_namesContext)_localctx).T_MD5.getText():null); 
				}
				break;
			case T_SUBSTRING_INDEX:
				enterOuterAlt(_localctx, 33);
				{
				setState(4066);
				((Function_namesContext)_localctx).T_SUBSTRING_INDEX = match(T_SUBSTRING_INDEX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SUBSTRING_INDEX!=null?((Function_namesContext)_localctx).T_SUBSTRING_INDEX.getText():null); 
				}
				break;
			case T_E:
				enterOuterAlt(_localctx, 34);
				{
				setState(4068);
				((Function_namesContext)_localctx).T_E = match(T_E);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_E!=null?((Function_namesContext)_localctx).T_E.getText():null); 
				}
				break;
			case T_CONTEXT_NGRAMS:
				enterOuterAlt(_localctx, 35);
				{
				setState(4070);
				((Function_namesContext)_localctx).T_CONTEXT_NGRAMS = match(T_CONTEXT_NGRAMS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CONTEXT_NGRAMS!=null?((Function_namesContext)_localctx).T_CONTEXT_NGRAMS.getText():null); 
				}
				break;
			case T_UNHEX:
				enterOuterAlt(_localctx, 36);
				{
				setState(4072);
				((Function_namesContext)_localctx).T_UNHEX = match(T_UNHEX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UNHEX!=null?((Function_namesContext)_localctx).T_UNHEX.getText():null); 
				}
				break;
			case T_ELT:
				enterOuterAlt(_localctx, 37);
				{
				setState(4074);
				((Function_namesContext)_localctx).T_ELT = match(T_ELT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ELT!=null?((Function_namesContext)_localctx).T_ELT.getText():null); 
				}
				break;
			case T_BEGINNING:
				enterOuterAlt(_localctx, 38);
				{
				setState(4076);
				((Function_namesContext)_localctx).T_BEGINNING = match(T_BEGINNING);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BEGINNING!=null?((Function_namesContext)_localctx).T_BEGINNING.getText():null); 
				}
				break;
			case T_AVG:
				enterOuterAlt(_localctx, 39);
				{
				setState(4078);
				((Function_namesContext)_localctx).T_AVG = match(T_AVG);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_AVG!=null?((Function_namesContext)_localctx).T_AVG.getText():null); 
				}
				break;
			case T_EXP:
				enterOuterAlt(_localctx, 40);
				{
				setState(4080);
				((Function_namesContext)_localctx).T_EXP = match(T_EXP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_EXP!=null?((Function_namesContext)_localctx).T_EXP.getText():null); 
				}
				break;
			case T_EXTRACT:
				enterOuterAlt(_localctx, 41);
				{
				setState(4082);
				((Function_namesContext)_localctx).T_EXTRACT = match(T_EXTRACT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_EXTRACT!=null?((Function_namesContext)_localctx).T_EXTRACT.getText():null); 
				}
				break;
			case T_QUARTER:
				enterOuterAlt(_localctx, 42);
				{
				setState(4084);
				((Function_namesContext)_localctx).T_QUARTER = match(T_QUARTER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_QUARTER!=null?((Function_namesContext)_localctx).T_QUARTER.getText():null); 
				}
				break;
			case T_STDDEV_SAMP:
				enterOuterAlt(_localctx, 43);
				{
				setState(4086);
				((Function_namesContext)_localctx).T_STDDEV_SAMP = match(T_STDDEV_SAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_STDDEV_SAMP!=null?((Function_namesContext)_localctx).T_STDDEV_SAMP.getText():null); 
				}
				break;
			case T_HASH:
				enterOuterAlt(_localctx, 44);
				{
				setState(4088);
				((Function_namesContext)_localctx).T_HASH = match(T_HASH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_HASH!=null?((Function_namesContext)_localctx).T_HASH.getText():null); 
				}
				break;
			case T_SURROGATE_KEY:
				enterOuterAlt(_localctx, 45);
				{
				setState(4090);
				((Function_namesContext)_localctx).T_SURROGATE_KEY = match(T_SURROGATE_KEY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SURROGATE_KEY!=null?((Function_namesContext)_localctx).T_SURROGATE_KEY.getText():null); 
				}
				break;
			case T_FROM_UNIXTIME:
				enterOuterAlt(_localctx, 46);
				{
				setState(4092);
				((Function_namesContext)_localctx).T_FROM_UNIXTIME = match(T_FROM_UNIXTIME);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FROM_UNIXTIME!=null?((Function_namesContext)_localctx).T_FROM_UNIXTIME.getText():null); 
				}
				break;
			case T_COLLECT_SET:
				enterOuterAlt(_localctx, 47);
				{
				setState(4094);
				((Function_namesContext)_localctx).T_COLLECT_SET = match(T_COLLECT_SET);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COLLECT_SET!=null?((Function_namesContext)_localctx).T_COLLECT_SET.getText():null); 
				}
				break;
			case T_ASCII:
				enterOuterAlt(_localctx, 48);
				{
				setState(4096);
				((Function_namesContext)_localctx).T_ASCII = match(T_ASCII);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ASCII!=null?((Function_namesContext)_localctx).T_ASCII.getText():null); 
				}
				break;
			case T_REGR_R2:
				enterOuterAlt(_localctx, 49);
				{
				setState(4098);
				((Function_namesContext)_localctx).T_REGR_R2 = match(T_REGR_R2);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_R2!=null?((Function_namesContext)_localctx).T_REGR_R2.getText():null); 
				}
				break;
			case T_OR:
				enterOuterAlt(_localctx, 50);
				{
				setState(4100);
				((Function_namesContext)_localctx).T_OR = match(T_OR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_OR!=null?((Function_namesContext)_localctx).T_OR.getText():null); 
				}
				break;
			case T_PERCENTILE_APPROX:
				enterOuterAlt(_localctx, 51);
				{
				setState(4102);
				((Function_namesContext)_localctx).T_PERCENTILE_APPROX = match(T_PERCENTILE_APPROX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PERCENTILE_APPROX!=null?((Function_namesContext)_localctx).T_PERCENTILE_APPROX.getText():null); 
				}
				break;
			case T_SIZE:
				enterOuterAlt(_localctx, 52);
				{
				setState(4104);
				((Function_namesContext)_localctx).T_SIZE = match(T_SIZE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SIZE!=null?((Function_namesContext)_localctx).T_SIZE.getText():null); 
				}
				break;
			case T_NGRAMS:
				enterOuterAlt(_localctx, 53);
				{
				setState(4106);
				((Function_namesContext)_localctx).T_NGRAMS = match(T_NGRAMS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NGRAMS!=null?((Function_namesContext)_localctx).T_NGRAMS.getText():null); 
				}
				break;
			case T_MASK_SHOW_FIRST_N:
				enterOuterAlt(_localctx, 54);
				{
				setState(4108);
				((Function_namesContext)_localctx).T_MASK_SHOW_FIRST_N = match(T_MASK_SHOW_FIRST_N);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK_SHOW_FIRST_N!=null?((Function_namesContext)_localctx).T_MASK_SHOW_FIRST_N.getText():null); 
				}
				break;
			case T_EXPLODE:
				enterOuterAlt(_localctx, 55);
				{
				setState(4110);
				((Function_namesContext)_localctx).T_EXPLODE = match(T_EXPLODE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_EXPLODE!=null?((Function_namesContext)_localctx).T_EXPLODE.getText():null); 
				}
				break;
			case T_REGR_COUNT:
				enterOuterAlt(_localctx, 56);
				{
				setState(4112);
				((Function_namesContext)_localctx).T_REGR_COUNT = match(T_REGR_COUNT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_COUNT!=null?((Function_namesContext)_localctx).T_REGR_COUNT.getText():null); 
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 57);
				{
				setState(4114);
				((Function_namesContext)_localctx).T_COUNT = match(T_COUNT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COUNT!=null?((Function_namesContext)_localctx).T_COUNT.getText():null); 
				}
				break;
			case T_LENGTH:
				enterOuterAlt(_localctx, 58);
				{
				setState(4116);
				((Function_namesContext)_localctx).T_LENGTH = match(T_LENGTH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LENGTH!=null?((Function_namesContext)_localctx).T_LENGTH.getText():null); 
				}
				break;
			case T_LOCATE:
				enterOuterAlt(_localctx, 59);
				{
				setState(4118);
				((Function_namesContext)_localctx).T_LOCATE = match(T_LOCATE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOCATE!=null?((Function_namesContext)_localctx).T_LOCATE.getText():null); 
				}
				break;
			case T_ACOS:
				enterOuterAlt(_localctx, 60);
				{
				setState(4120);
				((Function_namesContext)_localctx).T_ACOS = match(T_ACOS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ACOS!=null?((Function_namesContext)_localctx).T_ACOS.getText():null); 
				}
				break;
			case T_REPLACE:
				enterOuterAlt(_localctx, 61);
				{
				setState(4122);
				((Function_namesContext)_localctx).T_REPLACE = match(T_REPLACE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REPLACE!=null?((Function_namesContext)_localctx).T_REPLACE.getText():null); 
				}
				break;
			case T_PMOD:
				enterOuterAlt(_localctx, 62);
				{
				setState(4124);
				((Function_namesContext)_localctx).T_PMOD = match(T_PMOD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PMOD!=null?((Function_namesContext)_localctx).T_PMOD.getText():null); 
				}
				break;
			case T_DAY:
				enterOuterAlt(_localctx, 63);
				{
				setState(4126);
				((Function_namesContext)_localctx).T_DAY = match(T_DAY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DAY!=null?((Function_namesContext)_localctx).T_DAY.getText():null); 
				}
				break;
			case T_CHR:
				enterOuterAlt(_localctx, 64);
				{
				setState(4128);
				((Function_namesContext)_localctx).T_CHR = match(T_CHR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CHR!=null?((Function_namesContext)_localctx).T_CHR.getText():null); 
				}
				break;
			case T_SPLIT:
				enterOuterAlt(_localctx, 65);
				{
				setState(4130);
				((Function_namesContext)_localctx).T_SPLIT = match(T_SPLIT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SPLIT!=null?((Function_namesContext)_localctx).T_SPLIT.getText():null); 
				}
				break;
			case T_UNARY:
				enterOuterAlt(_localctx, 66);
				{
				setState(4132);
				((Function_namesContext)_localctx).T_UNARY = match(T_UNARY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UNARY!=null?((Function_namesContext)_localctx).T_UNARY.getText():null); 
				}
				break;
			case T_MINUTE:
				enterOuterAlt(_localctx, 67);
				{
				setState(4134);
				((Function_namesContext)_localctx).T_MINUTE = match(T_MINUTE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MINUTE!=null?((Function_namesContext)_localctx).T_MINUTE.getText():null); 
				}
				break;
			case T_RADIANS:
				enterOuterAlt(_localctx, 68);
				{
				setState(4136);
				((Function_namesContext)_localctx).T_RADIANS = match(T_RADIANS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_RADIANS!=null?((Function_namesContext)_localctx).T_RADIANS.getText():null); 
				}
				break;
			case T_INLINE:
				enterOuterAlt(_localctx, 69);
				{
				setState(4138);
				((Function_namesContext)_localctx).T_INLINE = match(T_INLINE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_INLINE!=null?((Function_namesContext)_localctx).T_INLINE.getText():null); 
				}
				break;
			case T_LPAD:
				enterOuterAlt(_localctx, 70);
				{
				setState(4140);
				((Function_namesContext)_localctx).T_LPAD = match(T_LPAD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LPAD!=null?((Function_namesContext)_localctx).T_LPAD.getText():null); 
				}
				break;
			case T_CBRT:
				enterOuterAlt(_localctx, 71);
				{
				setState(4142);
				((Function_namesContext)_localctx).T_CBRT = match(T_CBRT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CBRT!=null?((Function_namesContext)_localctx).T_CBRT.getText():null); 
				}
				break;
			case T_FROM_UTC_TIMESTAMP:
				enterOuterAlt(_localctx, 72);
				{
				setState(4144);
				((Function_namesContext)_localctx).T_FROM_UTC_TIMESTAMP = match(T_FROM_UTC_TIMESTAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FROM_UTC_TIMESTAMP!=null?((Function_namesContext)_localctx).T_FROM_UTC_TIMESTAMP.getText():null); 
				}
				break;
			case T_CAST:
				enterOuterAlt(_localctx, 73);
				{
				setState(4146);
				((Function_namesContext)_localctx).T_CAST = match(T_CAST);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CAST!=null?((Function_namesContext)_localctx).T_CAST.getText():null); 
				}
				break;
			case T_TRANSLATE:
				enterOuterAlt(_localctx, 74);
				{
				setState(4148);
				((Function_namesContext)_localctx).T_TRANSLATE = match(T_TRANSLATE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TRANSLATE!=null?((Function_namesContext)_localctx).T_TRANSLATE.getText():null); 
				}
				break;
			case T_CRC32:
				enterOuterAlt(_localctx, 75);
				{
				setState(4150);
				((Function_namesContext)_localctx).T_CRC32 = match(T_CRC32);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CRC32!=null?((Function_namesContext)_localctx).T_CRC32.getText():null); 
				}
				break;
			case T_OCTET_LENGTH:
				enterOuterAlt(_localctx, 76);
				{
				setState(4152);
				((Function_namesContext)_localctx).T_OCTET_LENGTH = match(T_OCTET_LENGTH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_OCTET_LENGTH!=null?((Function_namesContext)_localctx).T_OCTET_LENGTH.getText():null); 
				}
				break;
			case T_INITCAP:
				enterOuterAlt(_localctx, 77);
				{
				setState(4154);
				((Function_namesContext)_localctx).T_INITCAP = match(T_INITCAP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_INITCAP!=null?((Function_namesContext)_localctx).T_INITCAP.getText():null); 
				}
				break;
			case T_POSITIVE:
				enterOuterAlt(_localctx, 78);
				{
				setState(4156);
				((Function_namesContext)_localctx).T_POSITIVE = match(T_POSITIVE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_POSITIVE!=null?((Function_namesContext)_localctx).T_POSITIVE.getText():null); 
				}
				break;
			case T_UNBASE64:
				enterOuterAlt(_localctx, 79);
				{
				setState(4158);
				((Function_namesContext)_localctx).T_UNBASE64 = match(T_UNBASE64);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UNBASE64!=null?((Function_namesContext)_localctx).T_UNBASE64.getText():null); 
				}
				break;
			case T_FACTORIAL:
				enterOuterAlt(_localctx, 80);
				{
				setState(4160);
				((Function_namesContext)_localctx).T_FACTORIAL = match(T_FACTORIAL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FACTORIAL!=null?((Function_namesContext)_localctx).T_FACTORIAL.getText():null); 
				}
				break;
			case T_REGEXP_EXTRACT:
				enterOuterAlt(_localctx, 81);
				{
				setState(4162);
				((Function_namesContext)_localctx).T_REGEXP_EXTRACT = match(T_REGEXP_EXTRACT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGEXP_EXTRACT!=null?((Function_namesContext)_localctx).T_REGEXP_EXTRACT.getText():null); 
				}
				break;
			case T_COS:
				enterOuterAlt(_localctx, 82);
				{
				setState(4164);
				((Function_namesContext)_localctx).T_COS = match(T_COS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COS!=null?((Function_namesContext)_localctx).T_COS.getText():null); 
				}
				break;
			case T_MONTH:
				enterOuterAlt(_localctx, 83);
				{
				setState(4166);
				((Function_namesContext)_localctx).T_MONTH = match(T_MONTH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MONTH!=null?((Function_namesContext)_localctx).T_MONTH.getText():null); 
				}
				break;
			case T_NTILE:
				enterOuterAlt(_localctx, 84);
				{
				setState(4168);
				((Function_namesContext)_localctx).T_NTILE = match(T_NTILE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NTILE!=null?((Function_namesContext)_localctx).T_NTILE.getText():null); 
				}
				break;
			case T_SHIFTRIGHTUNSIGNED:
				enterOuterAlt(_localctx, 85);
				{
				setState(4170);
				((Function_namesContext)_localctx).T_SHIFTRIGHTUNSIGNED = match(T_SHIFTRIGHTUNSIGNED);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHIFTRIGHTUNSIGNED!=null?((Function_namesContext)_localctx).T_SHIFTRIGHTUNSIGNED.getText():null); 
				}
				break;
			case T_AES_ENCRYPT:
				enterOuterAlt(_localctx, 86);
				{
				setState(4172);
				((Function_namesContext)_localctx).T_AES_ENCRYPT = match(T_AES_ENCRYPT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_AES_ENCRYPT!=null?((Function_namesContext)_localctx).T_AES_ENCRYPT.getText():null); 
				}
				break;
			case T_LAST_DAY:
				enterOuterAlt(_localctx, 87);
				{
				setState(4174);
				((Function_namesContext)_localctx).T_LAST_DAY = match(T_LAST_DAY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LAST_DAY!=null?((Function_namesContext)_localctx).T_LAST_DAY.getText():null); 
				}
				break;
			case T_SECOND:
				enterOuterAlt(_localctx, 88);
				{
				setState(4176);
				((Function_namesContext)_localctx).T_SECOND = match(T_SECOND);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SECOND!=null?((Function_namesContext)_localctx).T_SECOND.getText():null); 
				}
				break;
			case T_TO_UTC_TIMESTAMP:
				enterOuterAlt(_localctx, 89);
				{
				setState(4178);
				((Function_namesContext)_localctx).T_TO_UTC_TIMESTAMP = match(T_TO_UTC_TIMESTAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TO_UTC_TIMESTAMP!=null?((Function_namesContext)_localctx).T_TO_UTC_TIMESTAMP.getText():null); 
				}
				break;
			case T_QUOTE:
				enterOuterAlt(_localctx, 90);
				{
				setState(4180);
				((Function_namesContext)_localctx).T_QUOTE = match(T_QUOTE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_QUOTE!=null?((Function_namesContext)_localctx).T_QUOTE.getText():null); 
				}
				break;
			case T_SQRT:
				enterOuterAlt(_localctx, 91);
				{
				setState(4182);
				((Function_namesContext)_localctx).T_SQRT = match(T_SQRT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SQRT!=null?((Function_namesContext)_localctx).T_SQRT.getText():null); 
				}
				break;
			case T_PARSE_URL:
				enterOuterAlt(_localctx, 92);
				{
				setState(4184);
				((Function_namesContext)_localctx).T_PARSE_URL = match(T_PARSE_URL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PARSE_URL!=null?((Function_namesContext)_localctx).T_PARSE_URL.getText():null); 
				}
				break;
			case T_EQUAL:
				enterOuterAlt(_localctx, 93);
				{
				setState(4186);
				((Function_namesContext)_localctx).T_EQUAL = match(T_EQUAL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_EQUAL!=null?((Function_namesContext)_localctx).T_EQUAL.getText():null); 
				}
				break;
			case T_MONTHS_BETWEEN:
				enterOuterAlt(_localctx, 94);
				{
				setState(4188);
				((Function_namesContext)_localctx).T_MONTHS_BETWEEN = match(T_MONTHS_BETWEEN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MONTHS_BETWEEN!=null?((Function_namesContext)_localctx).T_MONTHS_BETWEEN.getText():null); 
				}
				break;
			case T_MASK_HASH:
				enterOuterAlt(_localctx, 95);
				{
				setState(4190);
				((Function_namesContext)_localctx).T_MASK_HASH = match(T_MASK_HASH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK_HASH!=null?((Function_namesContext)_localctx).T_MASK_HASH.getText():null); 
				}
				break;
			case T_XOR:
				enterOuterAlt(_localctx, 96);
				{
				setState(4192);
				((Function_namesContext)_localctx).T_XOR = match(T_XOR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XOR!=null?((Function_namesContext)_localctx).T_XOR.getText():null); 
				}
				break;
			case T_LOG10:
				enterOuterAlt(_localctx, 97);
				{
				setState(4194);
				((Function_namesContext)_localctx).T_LOG10 = match(T_LOG10);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOG10!=null?((Function_namesContext)_localctx).T_LOG10.getText():null); 
				}
				break;
			case T_SENTENCES:
				enterOuterAlt(_localctx, 98);
				{
				setState(4196);
				((Function_namesContext)_localctx).T_SENTENCES = match(T_SENTENCES);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SENTENCES!=null?((Function_namesContext)_localctx).T_SENTENCES.getText():null); 
				}
				break;
			case T_MAP_VALUES:
				enterOuterAlt(_localctx, 99);
				{
				setState(4198);
				((Function_namesContext)_localctx).T_MAP_VALUES = match(T_MAP_VALUES);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MAP_VALUES!=null?((Function_namesContext)_localctx).T_MAP_VALUES.getText():null); 
				}
				break;
			case T_INSTR:
				enterOuterAlt(_localctx, 100);
				{
				setState(4200);
				((Function_namesContext)_localctx).T_INSTR = match(T_INSTR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_INSTR!=null?((Function_namesContext)_localctx).T_INSTR.getText():null); 
				}
				break;
			case T_MASK:
				enterOuterAlt(_localctx, 101);
				{
				setState(4202);
				((Function_namesContext)_localctx).T_MASK = match(T_MASK);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK!=null?((Function_namesContext)_localctx).T_MASK.getText():null); 
				}
				break;
			case T_AND:
				enterOuterAlt(_localctx, 102);
				{
				setState(4204);
				((Function_namesContext)_localctx).T_AND = match(T_AND);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_AND!=null?((Function_namesContext)_localctx).T_AND.getText():null); 
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 103);
				{
				setState(4206);
				((Function_namesContext)_localctx).T_VARIANCE = match(T_VARIANCE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_VARIANCE!=null?((Function_namesContext)_localctx).T_VARIANCE.getText():null); 
				}
				break;
			case T_VAR_SAMP:
				enterOuterAlt(_localctx, 104);
				{
				setState(4208);
				((Function_namesContext)_localctx).T_VAR_SAMP = match(T_VAR_SAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_VAR_SAMP!=null?((Function_namesContext)_localctx).T_VAR_SAMP.getText():null); 
				}
				break;
			case T_SHA1:
				enterOuterAlt(_localctx, 105);
				{
				setState(4210);
				((Function_namesContext)_localctx).T_SHA1 = match(T_SHA1);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHA1!=null?((Function_namesContext)_localctx).T_SHA1.getText():null); 
				}
				break;
			case T_TAN:
				enterOuterAlt(_localctx, 106);
				{
				setState(4212);
				((Function_namesContext)_localctx).T_TAN = match(T_TAN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TAN!=null?((Function_namesContext)_localctx).T_TAN.getText():null); 
				}
				break;
			case T_ADD_MONTHS:
				enterOuterAlt(_localctx, 107);
				{
				setState(4214);
				((Function_namesContext)_localctx).T_ADD_MONTHS = match(T_ADD_MONTHS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ADD_MONTHS!=null?((Function_namesContext)_localctx).T_ADD_MONTHS.getText():null); 
				}
				break;
			case T_MAP_KEYS:
				enterOuterAlt(_localctx, 108);
				{
				setState(4216);
				((Function_namesContext)_localctx).T_MAP_KEYS = match(T_MAP_KEYS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MAP_KEYS!=null?((Function_namesContext)_localctx).T_MAP_KEYS.getText():null); 
				}
				break;
			case T_ATAN:
				enterOuterAlt(_localctx, 109);
				{
				setState(4218);
				((Function_namesContext)_localctx).T_ATAN = match(T_ATAN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ATAN!=null?((Function_namesContext)_localctx).T_ATAN.getText():null); 
				}
				break;
			case T_TRUNC:
				enterOuterAlt(_localctx, 110);
				{
				setState(4220);
				((Function_namesContext)_localctx).T_TRUNC = match(T_TRUNC);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TRUNC!=null?((Function_namesContext)_localctx).T_TRUNC.getText():null); 
				}
				break;
			case T_LEVENSHTEIN:
				enterOuterAlt(_localctx, 111);
				{
				setState(4222);
				((Function_namesContext)_localctx).T_LEVENSHTEIN = match(T_LEVENSHTEIN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LEVENSHTEIN!=null?((Function_namesContext)_localctx).T_LEVENSHTEIN.getText():null); 
				}
				break;
			case T_YEAR:
				enterOuterAlt(_localctx, 112);
				{
				setState(4224);
				((Function_namesContext)_localctx).T_YEAR = match(T_YEAR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_YEAR!=null?((Function_namesContext)_localctx).T_YEAR.getText():null); 
				}
				break;
			case T_ARRAY_CONTAINS:
				enterOuterAlt(_localctx, 113);
				{
				setState(4226);
				((Function_namesContext)_localctx).T_ARRAY_CONTAINS = match(T_ARRAY_CONTAINS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ARRAY_CONTAINS!=null?((Function_namesContext)_localctx).T_ARRAY_CONTAINS.getText():null); 
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 114);
				{
				setState(4228);
				((Function_namesContext)_localctx).T_MIN = match(T_MIN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MIN!=null?((Function_namesContext)_localctx).T_MIN.getText():null); 
				}
				break;
			case T_GET_JSON_OBJECT:
				enterOuterAlt(_localctx, 115);
				{
				setState(4230);
				((Function_namesContext)_localctx).T_GET_JSON_OBJECT = match(T_GET_JSON_OBJECT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_GET_JSON_OBJECT!=null?((Function_namesContext)_localctx).T_GET_JSON_OBJECT.getText():null); 
				}
				break;
			case T_REGR_INTERCEPT:
				enterOuterAlt(_localctx, 116);
				{
				setState(4232);
				((Function_namesContext)_localctx).T_REGR_INTERCEPT = match(T_REGR_INTERCEPT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_INTERCEPT!=null?((Function_namesContext)_localctx).T_REGR_INTERCEPT.getText():null); 
				}
				break;
			case T_MASK_SHOW_LAST_N:
				enterOuterAlt(_localctx, 117);
				{
				setState(4234);
				((Function_namesContext)_localctx).T_MASK_SHOW_LAST_N = match(T_MASK_SHOW_LAST_N);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK_SHOW_LAST_N!=null?((Function_namesContext)_localctx).T_MASK_SHOW_LAST_N.getText():null); 
				}
				break;
			case T_RPAD:
				enterOuterAlt(_localctx, 118);
				{
				setState(4236);
				((Function_namesContext)_localctx).T_RPAD = match(T_RPAD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_RPAD!=null?((Function_namesContext)_localctx).T_RPAD.getText():null); 
				}
				break;
			case T_PERCENTILE:
				enterOuterAlt(_localctx, 119);
				{
				setState(4238);
				((Function_namesContext)_localctx).T_PERCENTILE = match(T_PERCENTILE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PERCENTILE!=null?((Function_namesContext)_localctx).T_PERCENTILE.getText():null); 
				}
				break;
			case T_REGR_AVGY:
				enterOuterAlt(_localctx, 120);
				{
				setState(4240);
				((Function_namesContext)_localctx).T_REGR_AVGY = match(T_REGR_AVGY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_AVGY!=null?((Function_namesContext)_localctx).T_REGR_AVGY.getText():null); 
				}
				break;
			case T_REGR_SYY:
				enterOuterAlt(_localctx, 121);
				{
				setState(4242);
				((Function_namesContext)_localctx).T_REGR_SYY = match(T_REGR_SYY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_SYY!=null?((Function_namesContext)_localctx).T_REGR_SYY.getText():null); 
				}
				break;
			case T_REFLECT:
				enterOuterAlt(_localctx, 122);
				{
				setState(4244);
				((Function_namesContext)_localctx).T_REFLECT = match(T_REFLECT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REFLECT!=null?((Function_namesContext)_localctx).T_REFLECT.getText():null); 
				}
				break;
			case T_DATE_FORMAT:
				enterOuterAlt(_localctx, 123);
				{
				setState(4246);
				((Function_namesContext)_localctx).T_DATE_FORMAT = match(T_DATE_FORMAT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DATE_FORMAT!=null?((Function_namesContext)_localctx).T_DATE_FORMAT.getText():null); 
				}
				break;
			case T_CEIL:
				enterOuterAlt(_localctx, 124);
				{
				setState(4248);
				((Function_namesContext)_localctx).T_CEIL = match(T_CEIL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CEIL!=null?((Function_namesContext)_localctx).T_CEIL.getText():null); 
				}
				break;
			case T_CONV:
				enterOuterAlt(_localctx, 125);
				{
				setState(4250);
				((Function_namesContext)_localctx).T_CONV = match(T_CONV);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CONV!=null?((Function_namesContext)_localctx).T_CONV.getText():null); 
				}
				break;
			case T_BASE64:
				enterOuterAlt(_localctx, 126);
				{
				setState(4252);
				((Function_namesContext)_localctx).T_BASE64 = match(T_BASE64);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BASE64!=null?((Function_namesContext)_localctx).T_BASE64.getText():null); 
				}
				break;
			case T_WEEKOFYEAR:
				enterOuterAlt(_localctx, 127);
				{
				setState(4254);
				((Function_namesContext)_localctx).T_WEEKOFYEAR = match(T_WEEKOFYEAR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_WEEKOFYEAR!=null?((Function_namesContext)_localctx).T_WEEKOFYEAR.getText():null); 
				}
				break;
			case T_BIN:
				enterOuterAlt(_localctx, 128);
				{
				setState(4256);
				((Function_namesContext)_localctx).T_BIN = match(T_BIN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BIN!=null?((Function_namesContext)_localctx).T_BIN.getText():null); 
				}
				break;
			case T_STAR:
				enterOuterAlt(_localctx, 129);
				{
				setState(4258);
				((Function_namesContext)_localctx).T_STAR = match(T_STAR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_STAR!=null?((Function_namesContext)_localctx).T_STAR.getText():null); 
				}
				break;
			case T_PLUS:
				enterOuterAlt(_localctx, 130);
				{
				setState(4260);
				((Function_namesContext)_localctx).T_PLUS = match(T_PLUS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PLUS!=null?((Function_namesContext)_localctx).T_PLUS.getText():null); 
				}
				break;
			case T_REGR_SXX:
				enterOuterAlt(_localctx, 131);
				{
				setState(4262);
				((Function_namesContext)_localctx).T_REGR_SXX = match(T_REGR_SXX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_SXX!=null?((Function_namesContext)_localctx).T_REGR_SXX.getText():null); 
				}
				break;
			case T_DEGREES:
				enterOuterAlt(_localctx, 132);
				{
				setState(4264);
				((Function_namesContext)_localctx).T_DEGREES = match(T_DEGREES);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DEGREES!=null?((Function_namesContext)_localctx).T_DEGREES.getText():null); 
				}
				break;
			case T_AES_DECRYPT:
				enterOuterAlt(_localctx, 133);
				{
				setState(4266);
				((Function_namesContext)_localctx).T_AES_DECRYPT = match(T_AES_DECRYPT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_AES_DECRYPT!=null?((Function_namesContext)_localctx).T_AES_DECRYPT.getText():null); 
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 134);
				{
				setState(4268);
				((Function_namesContext)_localctx).T_MAX = match(T_MAX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MAX!=null?((Function_namesContext)_localctx).T_MAX.getText():null); 
				}
				break;
			case T_LOG2:
				enterOuterAlt(_localctx, 135);
				{
				setState(4270);
				((Function_namesContext)_localctx).T_LOG2 = match(T_LOG2);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOG2!=null?((Function_namesContext)_localctx).T_LOG2.getText():null); 
				}
				break;
			case T_CURRENT_DATABASE:
				enterOuterAlt(_localctx, 136);
				{
				setState(4272);
				((Function_namesContext)_localctx).T_CURRENT_DATABASE = match(T_CURRENT_DATABASE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CURRENT_DATABASE!=null?((Function_namesContext)_localctx).T_CURRENT_DATABASE.getText():null); 
				}
				break;
			case T_JAVA_METHOD:
				enterOuterAlt(_localctx, 137);
				{
				setState(4274);
				((Function_namesContext)_localctx).T_JAVA_METHOD = match(T_JAVA_METHOD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_JAVA_METHOD!=null?((Function_namesContext)_localctx).T_JAVA_METHOD.getText():null); 
				}
				break;
			case T_HOUR:
				enterOuterAlt(_localctx, 138);
				{
				setState(4276);
				((Function_namesContext)_localctx).T_HOUR = match(T_HOUR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_HOUR!=null?((Function_namesContext)_localctx).T_HOUR.getText():null); 
				}
				break;
			case T_STACK:
				enterOuterAlt(_localctx, 139);
				{
				setState(4278);
				((Function_namesContext)_localctx).T_STACK = match(T_STACK);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_STACK!=null?((Function_namesContext)_localctx).T_STACK.getText():null); 
				}
				break;
			case T_LN:
				enterOuterAlt(_localctx, 140);
				{
				setState(4280);
				((Function_namesContext)_localctx).T_LN = match(T_LN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LN!=null?((Function_namesContext)_localctx).T_LN.getText():null); 
				}
				break;
			case T_CHARACTER_LENGTH:
				enterOuterAlt(_localctx, 141);
				{
				setState(4282);
				((Function_namesContext)_localctx).T_CHARACTER_LENGTH = match(T_CHARACTER_LENGTH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CHARACTER_LENGTH!=null?((Function_namesContext)_localctx).T_CHARACTER_LENGTH.getText():null); 
				}
				break;
			case T_ROUND:
				enterOuterAlt(_localctx, 142);
				{
				setState(4284);
				((Function_namesContext)_localctx).T_ROUND = match(T_ROUND);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ROUND!=null?((Function_namesContext)_localctx).T_ROUND.getText():null); 
				}
				break;
			case T_RAND:
				enterOuterAlt(_localctx, 143);
				{
				setState(4286);
				((Function_namesContext)_localctx).T_RAND = match(T_RAND);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_RAND!=null?((Function_namesContext)_localctx).T_RAND.getText():null); 
				}
				break;
			case T_COLLECT_LIST:
				enterOuterAlt(_localctx, 144);
				{
				setState(4288);
				((Function_namesContext)_localctx).T_COLLECT_LIST = match(T_COLLECT_LIST);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COLLECT_LIST!=null?((Function_namesContext)_localctx).T_COLLECT_LIST.getText():null); 
				}
				break;
			case T_REGEXP_REPLACE:
				enterOuterAlt(_localctx, 145);
				{
				setState(4290);
				((Function_namesContext)_localctx).T_REGEXP_REPLACE = match(T_REGEXP_REPLACE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGEXP_REPLACE!=null?((Function_namesContext)_localctx).T_REGEXP_REPLACE.getText():null); 
				}
				break;
			case T_POW:
				enterOuterAlt(_localctx, 146);
				{
				setState(4292);
				((Function_namesContext)_localctx).T_POW = match(T_POW);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_POW!=null?((Function_namesContext)_localctx).T_POW.getText():null); 
				}
				break;
			case T_SOUNDEX:
				enterOuterAlt(_localctx, 147);
				{
				setState(4294);
				((Function_namesContext)_localctx).T_SOUNDEX = match(T_SOUNDEX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SOUNDEX!=null?((Function_namesContext)_localctx).T_SOUNDEX.getText():null); 
				}
				break;
			case T_IF:
				enterOuterAlt(_localctx, 148);
				{
				setState(4296);
				((Function_namesContext)_localctx).T_IF = match(T_IF);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_IF!=null?((Function_namesContext)_localctx).T_IF.getText():null); 
				}
				break;
			case T_SHIFTLEFT:
				enterOuterAlt(_localctx, 149);
				{
				setState(4298);
				((Function_namesContext)_localctx).T_SHIFTLEFT = match(T_SHIFTLEFT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHIFTLEFT!=null?((Function_namesContext)_localctx).T_SHIFTLEFT.getText():null); 
				}
				break;
			case T_UPPER:
				enterOuterAlt(_localctx, 150);
				{
				setState(4300);
				((Function_namesContext)_localctx).T_UPPER = match(T_UPPER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UPPER!=null?((Function_namesContext)_localctx).T_UPPER.getText():null); 
				}
				break;
			case T_BROUND:
				enterOuterAlt(_localctx, 151);
				{
				setState(4302);
				((Function_namesContext)_localctx).T_BROUND = match(T_BROUND);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BROUND!=null?((Function_namesContext)_localctx).T_BROUND.getText():null); 
				}
				break;
			case T_ISNULL:
				enterOuterAlt(_localctx, 152);
				{
				setState(4304);
				((Function_namesContext)_localctx).T_ISNULL = match(T_ISNULL);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ISNULL!=null?((Function_namesContext)_localctx).T_ISNULL.getText():null); 
				}
				break;
			case T_COVAR_POP:
				enterOuterAlt(_localctx, 153);
				{
				setState(4306);
				((Function_namesContext)_localctx).T_COVAR_POP = match(T_COVAR_POP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COVAR_POP!=null?((Function_namesContext)_localctx).T_COVAR_POP.getText():null); 
				}
				break;
			case T_HEX:
				enterOuterAlt(_localctx, 154);
				{
				setState(4308);
				((Function_namesContext)_localctx).T_HEX = match(T_HEX);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_HEX!=null?((Function_namesContext)_localctx).T_HEX.getText():null); 
				}
				break;
			case T_PARENT:
				enterOuterAlt(_localctx, 155);
				{
				setState(4310);
				((Function_namesContext)_localctx).T_PARENT = match(T_PARENT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PARENT!=null?((Function_namesContext)_localctx).T_PARENT.getText():null); 
				}
				break;
			case T_WIDTH_BUCKET:
				enterOuterAlt(_localctx, 156);
				{
				setState(4312);
				((Function_namesContext)_localctx).T_WIDTH_BUCKET = match(T_WIDTH_BUCKET);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_WIDTH_BUCKET!=null?((Function_namesContext)_localctx).T_WIDTH_BUCKET.getText():null); 
				}
				break;
			case T_REVERSE:
				enterOuterAlt(_localctx, 157);
				{
				setState(4314);
				((Function_namesContext)_localctx).T_REVERSE = match(T_REVERSE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REVERSE!=null?((Function_namesContext)_localctx).T_REVERSE.getText():null); 
				}
				break;
			case T_SPACE:
				enterOuterAlt(_localctx, 158);
				{
				setState(4316);
				((Function_namesContext)_localctx).T_SPACE = match(T_SPACE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SPACE!=null?((Function_namesContext)_localctx).T_SPACE.getText():null); 
				}
				break;
			case T_BRACKET_OP:
				enterOuterAlt(_localctx, 159);
				{
				setState(4318);
				((Function_namesContext)_localctx).T_BRACKET_OP = match(T_BRACKET_OP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BRACKET_OP!=null?((Function_namesContext)_localctx).T_BRACKET_OP.getText():null); 
				}
				break;
			case T_RTRIM:
				enterOuterAlt(_localctx, 160);
				{
				setState(4320);
				((Function_namesContext)_localctx).T_RTRIM = match(T_RTRIM);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_RTRIM!=null?((Function_namesContext)_localctx).T_RTRIM.getText():null); 
				}
				break;
			case T_LTRIM:
				enterOuterAlt(_localctx, 161);
				{
				setState(4322);
				((Function_namesContext)_localctx).T_LTRIM = match(T_LTRIM);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LTRIM!=null?((Function_namesContext)_localctx).T_LTRIM.getText():null); 
				}
				break;
			case T_TRIM:
				enterOuterAlt(_localctx, 162);
				{
				setState(4324);
				((Function_namesContext)_localctx).T_TRIM = match(T_TRIM);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_TRIM!=null?((Function_namesContext)_localctx).T_TRIM.getText():null); 
				}
				break;
			case T_FORMAT_NUMBER:
				enterOuterAlt(_localctx, 163);
				{
				setState(4326);
				((Function_namesContext)_localctx).T_FORMAT_NUMBER = match(T_FORMAT_NUMBER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FORMAT_NUMBER!=null?((Function_namesContext)_localctx).T_FORMAT_NUMBER.getText():null); 
				}
				break;
			case T_NEXT_DAY:
				enterOuterAlt(_localctx, 164);
				{
				setState(4328);
				((Function_namesContext)_localctx).T_NEXT_DAY = match(T_NEXT_DAY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_NEXT_DAY!=null?((Function_namesContext)_localctx).T_NEXT_DAY.getText():null); 
				}
				break;
			case T_VERSION:
				enterOuterAlt(_localctx, 165);
				{
				setState(4330);
				((Function_namesContext)_localctx).T_VERSION = match(T_VERSION);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_VERSION!=null?((Function_namesContext)_localctx).T_VERSION.getText():null); 
				}
				break;
			case T_BUILDVERSION:
				enterOuterAlt(_localctx, 166);
				{
				setState(4332);
				((Function_namesContext)_localctx).T_BUILDVERSION = match(T_BUILDVERSION);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_BUILDVERSION!=null?((Function_namesContext)_localctx).T_BUILDVERSION.getText():null); 
				}
				break;
			case T_MASK_FIRST_N:
				enterOuterAlt(_localctx, 167);
				{
				setState(4334);
				((Function_namesContext)_localctx).T_MASK_FIRST_N = match(T_MASK_FIRST_N);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK_FIRST_N!=null?((Function_namesContext)_localctx).T_MASK_FIRST_N.getText():null); 
				}
				break;
			case T_PI:
				enterOuterAlt(_localctx, 168);
				{
				setState(4336);
				((Function_namesContext)_localctx).T_PI = match(T_PI);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PI!=null?((Function_namesContext)_localctx).T_PI.getText():null); 
				}
				break;
			case T_COALESCE:
				enterOuterAlt(_localctx, 169);
				{
				setState(4338);
				((Function_namesContext)_localctx).T_COALESCE = match(T_COALESCE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COALESCE!=null?((Function_namesContext)_localctx).T_COALESCE.getText():null); 
				}
				break;
			case T_STR_TO_MAP:
				enterOuterAlt(_localctx, 170);
				{
				setState(4340);
				((Function_namesContext)_localctx).T_STR_TO_MAP = match(T_STR_TO_MAP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_STR_TO_MAP!=null?((Function_namesContext)_localctx).T_STR_TO_MAP.getText():null); 
				}
				break;
			case T_REGR_SLOPE:
				enterOuterAlt(_localctx, 171);
				{
				setState(4342);
				((Function_namesContext)_localctx).T_REGR_SLOPE = match(T_REGR_SLOPE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_SLOPE!=null?((Function_namesContext)_localctx).T_REGR_SLOPE.getText():null); 
				}
				break;
			case T_REPEAT:
				enterOuterAlt(_localctx, 172);
				{
				setState(4344);
				((Function_namesContext)_localctx).T_REPEAT = match(T_REPEAT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REPEAT!=null?((Function_namesContext)_localctx).T_REPEAT.getText():null); 
				}
				break;
			case T_JSON_TUPLE:
				enterOuterAlt(_localctx, 173);
				{
				setState(4346);
				((Function_namesContext)_localctx).T_JSON_TUPLE = match(T_JSON_TUPLE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_JSON_TUPLE!=null?((Function_namesContext)_localctx).T_JSON_TUPLE.getText():null); 
				}
				break;
			case T_MASK_LAST_N:
				enterOuterAlt(_localctx, 174);
				{
				setState(4348);
				((Function_namesContext)_localctx).T_MASK_LAST_N = match(T_MASK_LAST_N);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_MASK_LAST_N!=null?((Function_namesContext)_localctx).T_MASK_LAST_N.getText():null); 
				}
				break;
			case T_SIGN:
				enterOuterAlt(_localctx, 175);
				{
				setState(4350);
				((Function_namesContext)_localctx).T_SIGN = match(T_SIGN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SIGN!=null?((Function_namesContext)_localctx).T_SIGN.getText():null); 
				}
				break;
			case T_PARSE_URL_TUPLE:
				enterOuterAlt(_localctx, 176);
				{
				setState(4352);
				((Function_namesContext)_localctx).T_PARSE_URL_TUPLE = match(T_PARSE_URL_TUPLE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PARSE_URL_TUPLE!=null?((Function_namesContext)_localctx).T_PARSE_URL_TUPLE.getText():null); 
				}
				break;
			case T_IN_FILE:
				enterOuterAlt(_localctx, 177);
				{
				setState(4354);
				((Function_namesContext)_localctx).T_IN_FILE = match(T_IN_FILE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_IN_FILE!=null?((Function_namesContext)_localctx).T_IN_FILE.getText():null); 
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 178);
				{
				setState(4356);
				((Function_namesContext)_localctx).T_SUM = match(T_SUM);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SUM!=null?((Function_namesContext)_localctx).T_SUM.getText():null); 
				}
				break;
			case T_CORR:
				enterOuterAlt(_localctx, 179);
				{
				setState(4358);
				((Function_namesContext)_localctx).T_CORR = match(T_CORR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CORR!=null?((Function_namesContext)_localctx).T_CORR.getText():null); 
				}
				break;
			case T_REGR_SXY:
				enterOuterAlt(_localctx, 180);
				{
				setState(4360);
				((Function_namesContext)_localctx).T_REGR_SXY = match(T_REGR_SXY);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_REGR_SXY!=null?((Function_namesContext)_localctx).T_REGR_SXY.getText():null); 
				}
				break;
			case T_GREATEST:
				enterOuterAlt(_localctx, 181);
				{
				setState(4362);
				((Function_namesContext)_localctx).T_GREATEST = match(T_GREATEST);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_GREATEST!=null?((Function_namesContext)_localctx).T_GREATEST.getText():null); 
				}
				break;
			case T_COVAR_SAMP:
				enterOuterAlt(_localctx, 182);
				{
				setState(4364);
				((Function_namesContext)_localctx).T_COVAR_SAMP = match(T_COVAR_SAMP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_COVAR_SAMP!=null?((Function_namesContext)_localctx).T_COVAR_SAMP.getText():null); 
				}
				break;
			case T_LOGGED_IN_USER:
				enterOuterAlt(_localctx, 183);
				{
				setState(4366);
				((Function_namesContext)_localctx).T_LOGGED_IN_USER = match(T_LOGGED_IN_USER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LOGGED_IN_USER!=null?((Function_namesContext)_localctx).T_LOGGED_IN_USER.getText():null); 
				}
				break;
			case T_PRINTF:
				enterOuterAlt(_localctx, 184);
				{
				setState(4368);
				((Function_namesContext)_localctx).T_PRINTF = match(T_PRINTF);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PRINTF!=null?((Function_namesContext)_localctx).T_PRINTF.getText():null); 
				}
				break;
			case T_FLOOR:
				enterOuterAlt(_localctx, 185);
				{
				setState(4370);
				((Function_namesContext)_localctx).T_FLOOR = match(T_FLOOR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FLOOR!=null?((Function_namesContext)_localctx).T_FLOOR.getText():null); 
				}
				break;
			case T_POSEXPLODE:
				enterOuterAlt(_localctx, 186);
				{
				setState(4372);
				((Function_namesContext)_localctx).T_POSEXPLODE = match(T_POSEXPLODE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_POSEXPLODE!=null?((Function_namesContext)_localctx).T_POSEXPLODE.getText():null); 
				}
				break;
			case T_DATE_ADD:
				enterOuterAlt(_localctx, 187);
				{
				setState(4374);
				((Function_namesContext)_localctx).T_DATE_ADD = match(T_DATE_ADD);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DATE_ADD!=null?((Function_namesContext)_localctx).T_DATE_ADD.getText():null); 
				}
				break;
			case T_POWER:
				enterOuterAlt(_localctx, 188);
				{
				setState(4376);
				((Function_namesContext)_localctx).T_POWER = match(T_POWER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_POWER!=null?((Function_namesContext)_localctx).T_POWER.getText():null); 
				}
				break;
			case T_CEILING:
				enterOuterAlt(_localctx, 189);
				{
				setState(4378);
				((Function_namesContext)_localctx).T_CEILING = match(T_CEILING);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CEILING!=null?((Function_namesContext)_localctx).T_CEILING.getText():null); 
				}
				break;
			case T_VAR_POP:
				enterOuterAlt(_localctx, 190);
				{
				setState(4380);
				((Function_namesContext)_localctx).T_VAR_POP = match(T_VAR_POP);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_VAR_POP!=null?((Function_namesContext)_localctx).T_VAR_POP.getText():null); 
				}
				break;
			case T_XPATH:
				enterOuterAlt(_localctx, 191);
				{
				setState(4382);
				((Function_namesContext)_localctx).T_XPATH = match(T_XPATH);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH!=null?((Function_namesContext)_localctx).T_XPATH.getText():null); 
				}
				break;
			case T_XPATH_BOOLEAN:
				enterOuterAlt(_localctx, 192);
				{
				setState(4384);
				((Function_namesContext)_localctx).T_XPATH_BOOLEAN = match(T_XPATH_BOOLEAN);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_BOOLEAN!=null?((Function_namesContext)_localctx).T_XPATH_BOOLEAN.getText():null); 
				}
				break;
			case T_XPATH_DOUBLE:
				enterOuterAlt(_localctx, 193);
				{
				setState(4386);
				((Function_namesContext)_localctx).T_XPATH_DOUBLE = match(T_XPATH_DOUBLE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_DOUBLE!=null?((Function_namesContext)_localctx).T_XPATH_DOUBLE.getText():null); 
				}
				break;
			case T_XPATH_FLOAT:
				enterOuterAlt(_localctx, 194);
				{
				setState(4388);
				((Function_namesContext)_localctx).T_XPATH_FLOAT = match(T_XPATH_FLOAT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_FLOAT!=null?((Function_namesContext)_localctx).T_XPATH_FLOAT.getText():null); 
				}
				break;
			case T_XPATH_INT:
				enterOuterAlt(_localctx, 195);
				{
				setState(4390);
				((Function_namesContext)_localctx).T_XPATH_INT = match(T_XPATH_INT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_INT!=null?((Function_namesContext)_localctx).T_XPATH_INT.getText():null); 
				}
				break;
			case T_XPATH_LONG:
				enterOuterAlt(_localctx, 196);
				{
				setState(4392);
				((Function_namesContext)_localctx).T_XPATH_LONG = match(T_XPATH_LONG);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_LONG!=null?((Function_namesContext)_localctx).T_XPATH_LONG.getText():null); 
				}
				break;
			case T_XPATH_NUMBER:
				enterOuterAlt(_localctx, 197);
				{
				setState(4394);
				((Function_namesContext)_localctx).T_XPATH_NUMBER = match(T_XPATH_NUMBER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_NUMBER!=null?((Function_namesContext)_localctx).T_XPATH_NUMBER.getText():null); 
				}
				break;
			case T_XPATH_SHORT:
				enterOuterAlt(_localctx, 198);
				{
				setState(4396);
				((Function_namesContext)_localctx).T_XPATH_SHORT = match(T_XPATH_SHORT);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_SHORT!=null?((Function_namesContext)_localctx).T_XPATH_SHORT.getText():null); 
				}
				break;
			case T_XPATH_STRING:
				enterOuterAlt(_localctx, 199);
				{
				setState(4398);
				((Function_namesContext)_localctx).T_XPATH_STRING = match(T_XPATH_STRING);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_XPATH_STRING!=null?((Function_namesContext)_localctx).T_XPATH_STRING.getText():null); 
				}
				break;
			case T_SHA:
				enterOuterAlt(_localctx, 200);
				{
				setState(4400);
				((Function_namesContext)_localctx).T_SHA = match(T_SHA);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SHA!=null?((Function_namesContext)_localctx).T_SHA.getText():null); 
				}
				break;
			case T_UCASE:
				enterOuterAlt(_localctx, 201);
				{
				setState(4402);
				((Function_namesContext)_localctx).T_UCASE = match(T_UCASE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_UCASE!=null?((Function_namesContext)_localctx).T_UCASE.getText():null); 
				}
				break;
			case T_SUBSTRING:
				enterOuterAlt(_localctx, 202);
				{
				setState(4404);
				((Function_namesContext)_localctx).T_SUBSTRING = match(T_SUBSTRING);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_SUBSTRING!=null?((Function_namesContext)_localctx).T_SUBSTRING.getText():null); 
				}
				break;
			case T_LCASE:
				enterOuterAlt(_localctx, 203);
				{
				setState(4406);
				((Function_namesContext)_localctx).T_LCASE = match(T_LCASE);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LCASE!=null?((Function_namesContext)_localctx).T_LCASE.getText():null); 
				}
				break;
			case T_FIELD_IN_SET:
				enterOuterAlt(_localctx, 204);
				{
				setState(4408);
				((Function_namesContext)_localctx).T_FIELD_IN_SET = match(T_FIELD_IN_SET);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_FIELD_IN_SET!=null?((Function_namesContext)_localctx).T_FIELD_IN_SET.getText():null); 
				}
				break;
			case T_GET_JSON_OBJECTS:
				enterOuterAlt(_localctx, 205);
				{
				setState(4410);
				((Function_namesContext)_localctx).T_GET_JSON_OBJECTS = match(T_GET_JSON_OBJECTS);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_GET_JSON_OBJECTS!=null?((Function_namesContext)_localctx).T_GET_JSON_OBJECTS.getText():null); 
				}
				break;
			case T_IN_STR:
				enterOuterAlt(_localctx, 206);
				{
				setState(4412);
				((Function_namesContext)_localctx).T_IN_STR = match(T_IN_STR);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_IN_STR!=null?((Function_namesContext)_localctx).T_IN_STR.getText():null); 
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 207);
				{
				setState(4414);
				((Function_namesContext)_localctx).T_RANK = match(T_RANK);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_RANK!=null?((Function_namesContext)_localctx).T_RANK.getText():null); 
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 208);
				{
				setState(4416);
				((Function_namesContext)_localctx).T_DENSE_RANK = match(T_DENSE_RANK);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_DENSE_RANK!=null?((Function_namesContext)_localctx).T_DENSE_RANK.getText():null); 
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 209);
				{
				setState(4418);
				((Function_namesContext)_localctx).T_ROW_NUMBER = match(T_ROW_NUMBER);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_ROW_NUMBER!=null?((Function_namesContext)_localctx).T_ROW_NUMBER.getText():null); 
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 210);
				{
				setState(4420);
				((Function_namesContext)_localctx).T_CUME_DIST = match(T_CUME_DIST);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_CUME_DIST!=null?((Function_namesContext)_localctx).T_CUME_DIST.getText():null); 
				}
				break;
			case T_PERCENT_RANK:
				enterOuterAlt(_localctx, 211);
				{
				setState(4422);
				((Function_namesContext)_localctx).T_PERCENT_RANK = match(T_PERCENT_RANK);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_PERCENT_RANK!=null?((Function_namesContext)_localctx).T_PERCENT_RANK.getText():null); 
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 212);
				{
				setState(4424);
				((Function_namesContext)_localctx).T_LAG = match(T_LAG);
				 ((Function_namesContext)_localctx).res =  (((Function_namesContext)_localctx).T_LAG!=null?((Function_namesContext)_localctx).T_LAG.getText():null); 
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 213);
				{
				setState(4426);
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
		case 87:
			return multi_expr_sempred((Multi_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean multi_expr_sempred(Multi_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u023f\u1151\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\6\3\u010f\n\3\r\3\16\3\u0110\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u011b\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u012b\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0143\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u015e\n\6\f\6\16\6\u0161\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u016c\n\6\f\6\16\6\u016f\13\6\3\6\3\6\3\6\5\6\u0174\n\6\3"+
		"\7\3\7\3\7\5\7\u0179\n\7\3\7\3\7\5\7\u017d\n\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u018e\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u019e\n\n\3\13\3\13\3\13\5\13"+
		"\u01a3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01b2"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01c9\n\16\f\16\16\16\u01cc\13\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01d7\n\16\f\16\16"+
		"\16\u01da\13\16\3\16\3\16\3\16\5\16\u01df\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u01f9\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\7\22\u0206\n\22\f\22\16\22\u0209\13\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0214\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u021d\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0225\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0231"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u024f\n\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0257\n\31\f"+
		"\31\16\31\u025a\13\31\3\31\3\31\3\31\5\31\u025f\n\31\3\32\3\32\3\32\3"+
		"\32\7\32\u0265\n\32\f\32\16\32\u0268\13\32\3\32\3\32\5\32\u026c\n\32\3"+
		"\33\3\33\3\33\3\33\5\33\u0272\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u027e\n\35\f\35\16\35\u0281\13\35\3\35\3\35\3\35"+
		"\5\35\u0286\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0292\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u029c\n\37\f"+
		"\37\16\37\u029f\13\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u02a8\n"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u02b5\n \f \16 \u02b8\13 \3 \3"+
		" \3 \5 \u02bd\n \3!\3!\3!\3!\3!\5!\u02c4\n!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\7\"\u02ce\n\"\f\"\16\"\u02d1\13\"\3\"\3\"\3\"\3\"\3\"\5\"\u02d8"+
		"\n\"\3#\3#\3#\3#\3#\3#\3#\7#\u02e1\n#\f#\16#\u02e4\13#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\7#\u02f0\n#\f#\16#\u02f3\13#\3#\3#\3#\3#\3#\3#\7#\u02fb"+
		"\n#\f#\16#\u02fe\13#\3#\3#\7#\u0302\n#\f#\16#\u0305\13#\3#\3#\3#\5#\u030a"+
		"\n#\3$\3$\3$\3$\3$\5$\u0311\n$\3%\3%\3%\3%\3%\3%\5%\u0319\n%\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0328\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0338\n\'\3(\3(\3(\3(\3(\3(\3(\5(\u0341"+
		"\n(\3)\3)\3)\3)\3)\3)\3)\5)\u034a\n)\3*\3*\3*\3*\3*\3*\5*\u0352\n*\3+"+
		"\3+\3+\3+\3+\3+\5+\u035a\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,"+
		"\u0369\n,\f,\16,\u036c\13,\3,\3,\3,\5,\u0371\n,\3-\3-\3-\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0389\n.\3/\3/\3/\3/\5"+
		"/\u038f\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\7\60\u039d\n\60\f\60\16\60\u03a0\13\60\3\60\3\60\3\60\5\60\u03a5\n\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\5\62\u03af\n\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u03bf\n\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\6\64\u03cf\n\64\r\64\16\64\u03d0\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\6\64\u03db\n\64\r\64\16\64\u03dc\3\64\3\64\5\64\u03e1\n\64\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u03fd\n\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0409\n\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0412\n\67\f\67\16\67\u0415\13\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\7\67\u0426\n\67\f\67\16\67\u0429\13\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\7\67\u0432\n\67\f\67\16\67\u0435\13\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0444\n\67\f\67\16"+
		"\67\u0447\13\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u0458\n\67\38\38\38\38\38\58\u045f\n8\39\39"+
		"\39\59\u0464\n9\3:\3:\3:\5:\u0469\n:\3;\3;\3;\5;\u046e\n;\3<\3<\3<\3<"+
		"\3<\5<\u0475\n<\3=\3=\3=\3=\3=\5=\u047c\n=\3>\3>\3>\3>\5>\u0482\n>\3?"+
		"\3?\3?\3?\3?\5?\u0489\n?\3@\3@\3@\3@\3@\3@\5@\u0491\n@\3A\3A\3A\3A\3A"+
		"\3A\6A\u0499\nA\rA\16A\u049a\3A\3A\3B\3B\3B\3B\3B\5B\u04a4\nB\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u04bd"+
		"\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u04c9\nD\fD\16D\u04cc\13D\3D\3D\5"+
		"D\u04d0\nD\3E\3E\3E\3F\3F\3F\3F\3F\5F\u04da\nF\3G\3G\3G\3G\3G\3G\3G\7"+
		"G\u04e3\nG\fG\16G\u04e6\13G\3G\3G\5G\u04ea\nG\3H\3H\3H\3H\3H\5H\u04f1"+
		"\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u04fd\nI\fI\16I\u0500\13I\3I\3I\5"+
		"I\u0504\nI\3J\3J\3J\3J\3J\5J\u050b\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0516"+
		"\nK\3L\3L\3L\3L\3L\3L\3L\6L\u051f\nL\rL\16L\u0520\3L\3L\3L\3L\3L\6L\u0528"+
		"\nL\rL\16L\u0529\3L\3L\5L\u052e\nL\3M\5M\u0531\nM\3M\3M\3M\3M\3M\5M\u0538"+
		"\nM\3M\3M\3M\3M\3M\3M\3M\5M\u0541\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3M\5M\u0553\nM\3N\3N\3N\3N\3O\3O\3O\3O\3O\5O\u055e\nO\3O"+
		"\3O\3O\3O\3O\3O\3O\5O\u0567\nO\3O\3O\3O\3O\3O\3O\3O\5O\u0570\nO\3O\3O"+
		"\3O\5O\u0575\nO\3P\3P\3P\3P\3P\5P\u057c\nP\3Q\3Q\3Q\3Q\7Q\u0582\nQ\fQ"+
		"\16Q\u0585\13Q\3Q\3Q\3R\3R\5R\u058b\nR\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0595"+
		"\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u05a9\nR"+
		"\3R\3R\3R\5R\u05ae\nR\3S\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\7T"+
		"\u05bf\nT\fT\16T\u05c2\13T\3T\3T\5T\u05c6\nT\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\5U\u05d2\nU\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\7W\u05de\nW\fW\16W\u05e1"+
		"\13W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\5X\u05ee\nX\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\7Y\u05f9\nY\fY\16Y\u05fc\13Y\3Z\3Z\3Z\3Z\3Z\7Z\u0603\nZ\fZ\16"+
		"Z\u0606\13Z\3Z\3Z\3[\3[\3[\3[\5[\u060e\n[\3\\\3\\\3\\\3\\\3\\\7\\\u0615"+
		"\n\\\f\\\16\\\u0618\13\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0624\n]\3"+
		"^\3^\3^\3^\3^\7^\u062b\n^\f^\16^\u062e\13^\3^\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0663\n^"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0675\n_\3`\3`\3`"+
		"\3`\3`\7`\u067c\n`\f`\16`\u067f\13`\3`\3`\3a\3a\3a\3a\3a\3a\3a\5a\u068a"+
		"\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b"+
		"\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b"+
		"\3b\3b\3b\5b\u06bc\nb\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\5c\u06e6\nc\3d\3d\3d\3d\3d\3d\7d\u06ee\nd\fd\16d\u06f1\13d\3d\3d\3"+
		"d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\7e\u0701\ne\fe\16e\u0704\13e\3e\3e"+
		"\3e\3f\3f\3f\3f\3f\3f\7f\u070f\nf\ff\16f\u0712\13f\3f\3f\3f\3g\3g\3g\3"+
		"g\3g\3g\3g\3g\3g\3g\3g\7g\u0722\ng\fg\16g\u0725\13g\3g\3g\3g\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\6h\u0748\nh\rh\16h\u0749\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\6h\u0757\nh\rh\16h\u0758\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\7h\u076e\nh\fh\16h\u0771\13h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\7h\u0786\nh\fh\16h\u0789\13h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\6h\u0804\nh\rh\16h\u0805\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\5h\u092b\nh\3i\3i\3i\3i\3i\3i\3i\3i\7i\u0935\ni\fi\16i\u0938\13"+
		"i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\7i\u0945\ni\fi\16i\u0948\13i\3i\3i"+
		"\3i\3i\3i\3i\3i\3i\3i\7i\u0953\ni\fi\16i\u0956\13i\3i\3i\3i\3i\3i\3i\3"+
		"i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3"+
		"i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3"+
		"i\3i\3i\3i\3i\5i\u0991\ni\3j\3j\3j\3j\6j\u0997\nj\rj\16j\u0998\3j\3j\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u09c3\nk\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\6l\u09e9\nl\rl\16l\u09ea\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\6l\u09f8\nl\rl\16l\u09f9\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\6l\u0a07\nl\rl\16l\u0a08\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\6l\u0a17"+
		"\nl\rl\16l\u0a18\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\6l\u0a25\nl\rl\16l\u0a26"+
		"\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0a3c\nl"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\5m\u0ab9\nm\3m\3m\3m\3m\5m\u0abf\nm\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u0afc\nm\3n\3n\3n\3n\3n\3n\5n\u0b04"+
		"\nn\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0b0f\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o"+
		"\3o\3o\3o\3o\7o\u0b1e\no\fo\16o\u0b21\13o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3o\3o\3o\3o\3o\3o\5o\u0b4b\no\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3"+
		"p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3"+
		"p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3"+
		"p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u0b94\np\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u0ba8\nq\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0c7c\n"+
		"r\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0c88\ns\3t\3t\3t\3t\3t\3t\3t\3t\3"+
		"t\3t\3t\3t\3t\3t\3t\3t\5t\u0c9a\nt\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3"+
		"u\3u\3u\3u\3u\3u\3u\5u\u0cae\nu\3v\3v\3v\3v\3v\3v\3v\3v\5v\u0cb8\nv\3"+
		"w\3w\3w\3w\3w\7w\u0cbf\nw\fw\16w\u0cc2\13w\3w\3w\3w\5w\u0cc7\nw\3x\3x"+
		"\3x\3x\3x\3x\5x\u0ccf\nx\3y\3y\3y\3y\3y\5y\u0cd6\ny\3z\3z\3z\3z\3{\3{"+
		"\3{\3{\3|\3|\3|\3|\3|\5|\u0ce5\n|\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u0cf0"+
		"\n}\3~\3~\3~\3~\3~\5~\u0cf7\n~\3\177\3\177\3\177\3\177\3\177\5\177\u0cfe"+
		"\n\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u0e16\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\5\u0082\u0fa3\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083"+
		"\u114f\n\u0083\3\u0083\2\3\u00b0\u0084\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\2\26\4\2\u016d\u016d\u023a\u023a"+
		"\4\2\26\26\u0218\u0218\4\2BB\u00e6\u00e6\5\2\64\64FFaa\3\2\u01d6\u01d7"+
		"\3\2\u0207\u020b\3\2\u021c\u021e\3\2\u01bc\u01bd\3\2\u018a\u018b\3\2\u01cb"+
		"\u01cc\5\2\u017f\u017f\u01b0\u01b1\u01c8\u01c8\3\2\u01fa\u0202\4\2\u016d"+
		"\u016d\u01d1\u01d1\6\2\u0184\u0185\u01bf\u01bf\u01cd\u01cd\u01f3\u01f3"+
		"\5\2\u0146\u0146\u019b\u019b\u01ac\u01ac\13\2\u0151\u0151\u0160\u0160"+
		"\u0162\u0162\u01a0\u01a0\u01ca\u01ca\u01cf\u01cf\u01e0\u01e0\u01eb\u01eb"+
		"\u01f0\u01f0\4\2\u0175\u0175\u01e3\u01e3\3\2\u017b\u017c\4\2\u01d5\u01d5"+
		"\u01d8\u01d8\5\2\5\5NN\u021a\u021b\2\u14ae\2\u0106\3\2\2\2\4\u010a\3\2"+
		"\2\2\6\u011a\3\2\2\2\b\u0142\3\2\2\2\n\u0173\3\2\2\2\f\u0175\3\2\2\2\16"+
		"\u018d\3\2\2\2\20\u018f\3\2\2\2\22\u019d\3\2\2\2\24\u01a2\3\2\2\2\26\u01b1"+
		"\3\2\2\2\30\u01b3\3\2\2\2\32\u01de\3\2\2\2\34\u01e0\3\2\2\2\36\u01f8\3"+
		"\2\2\2 \u01fa\3\2\2\2\"\u0201\3\2\2\2$\u0213\3\2\2\2&\u021c\3\2\2\2(\u0224"+
		"\3\2\2\2*\u0226\3\2\2\2,\u0230\3\2\2\2.\u024e\3\2\2\2\60\u025e\3\2\2\2"+
		"\62\u026b\3\2\2\2\64\u0271\3\2\2\2\66\u0273\3\2\2\28\u0285\3\2\2\2:\u0291"+
		"\3\2\2\2<\u02a7\3\2\2\2>\u02bc\3\2\2\2@\u02c3\3\2\2\2B\u02d7\3\2\2\2D"+
		"\u0309\3\2\2\2F\u0310\3\2\2\2H\u0318\3\2\2\2J\u0327\3\2\2\2L\u0337\3\2"+
		"\2\2N\u0340\3\2\2\2P\u0349\3\2\2\2R\u0351\3\2\2\2T\u0359\3\2\2\2V\u0370"+
		"\3\2\2\2X\u0372\3\2\2\2Z\u0388\3\2\2\2\\\u038e\3\2\2\2^\u03a4\3\2\2\2"+
		"`\u03a6\3\2\2\2b\u03ae\3\2\2\2d\u03be\3\2\2\2f\u03e0\3\2\2\2h\u03fc\3"+
		"\2\2\2j\u0408\3\2\2\2l\u0457\3\2\2\2n\u045e\3\2\2\2p\u0463\3\2\2\2r\u0468"+
		"\3\2\2\2t\u046d\3\2\2\2v\u0474\3\2\2\2x\u047b\3\2\2\2z\u0481\3\2\2\2|"+
		"\u0488\3\2\2\2~\u0490\3\2\2\2\u0080\u0492\3\2\2\2\u0082\u04a3\3\2\2\2"+
		"\u0084\u04bc\3\2\2\2\u0086\u04cf\3\2\2\2\u0088\u04d1\3\2\2\2\u008a\u04d9"+
		"\3\2\2\2\u008c\u04e9\3\2\2\2\u008e\u04f0\3\2\2\2\u0090\u0503\3\2\2\2\u0092"+
		"\u050a\3\2\2\2\u0094\u0515\3\2\2\2\u0096\u052d\3\2\2\2\u0098\u0552\3\2"+
		"\2\2\u009a\u0554\3\2\2\2\u009c\u0574\3\2\2\2\u009e\u057b\3\2\2\2\u00a0"+
		"\u057d\3\2\2\2\u00a2\u05ad\3\2\2\2\u00a4\u05af\3\2\2\2\u00a6\u05c5\3\2"+
		"\2\2\u00a8\u05d1\3\2\2\2\u00aa\u05d3\3\2\2\2\u00ac\u05d8\3\2\2\2\u00ae"+
		"\u05ed\3\2\2\2\u00b0\u05ef\3\2\2\2\u00b2\u05fd\3\2\2\2\u00b4\u060d\3\2"+
		"\2\2\u00b6\u060f\3\2\2\2\u00b8\u0623\3\2\2\2\u00ba\u0662\3\2\2\2\u00bc"+
		"\u0674\3\2\2\2\u00be\u0676\3\2\2\2\u00c0\u0689\3\2\2\2\u00c2\u06bb\3\2"+
		"\2\2\u00c4\u06e5\3\2\2\2\u00c6\u06e7\3\2\2\2\u00c8\u06f5\3\2\2\2\u00ca"+
		"\u0708\3\2\2\2\u00cc\u0716\3\2\2\2\u00ce\u092a\3\2\2\2\u00d0\u0990\3\2"+
		"\2\2\u00d2\u0992\3\2\2\2\u00d4\u09c2\3\2\2\2\u00d6\u0a3b\3\2\2\2\u00d8"+
		"\u0afb\3\2\2\2\u00da\u0b0e\3\2\2\2\u00dc\u0b4a\3\2\2\2\u00de\u0b93\3\2"+
		"\2\2\u00e0\u0ba7\3\2\2\2\u00e2\u0c7b\3\2\2\2\u00e4\u0c87\3\2\2\2\u00e6"+
		"\u0c99\3\2\2\2\u00e8\u0cad\3\2\2\2\u00ea\u0cb7\3\2\2\2\u00ec\u0cc6\3\2"+
		"\2\2\u00ee\u0cce\3\2\2\2\u00f0\u0cd5\3\2\2\2\u00f2\u0cd7\3\2\2\2\u00f4"+
		"\u0cdb\3\2\2\2\u00f6\u0ce4\3\2\2\2\u00f8\u0cef\3\2\2\2\u00fa\u0cf6\3\2"+
		"\2\2\u00fc\u0cfd\3\2\2\2\u00fe\u0cff\3\2\2\2\u0100\u0e15\3\2\2\2\u0102"+
		"\u0fa2\3\2\2\2\u0104\u114e\3\2\2\2\u0106\u0107\5\4\3\2\u0107\u0108\7\2"+
		"\2\3\u0108\u0109\b\2\1\2\u0109\3\3\2\2\2\u010a\u010e\b\3\1\2\u010b\u010c"+
		"\5\16\b\2\u010c\u010d\7\u0231\2\2\u010d\u010f\3\2\2\2\u010e\u010b\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\b\3\1\2\u0113\5\3\2\2\2\u0114\u0115\5\b\5\2"+
		"\u0115\u0116\b\4\1\2\u0116\u011b\3\2\2\2\u0117\u0118\5\n\6\2\u0118\u0119"+
		"\b\4\1\2\u0119\u011b\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0117\3\2\2\2\u011b"+
		"\7\3\2\2\2\u011c\u011d\7\u0115\2\2\u011d\u0143\b\5\1\2\u011e\u011f\7g"+
		"\2\2\u011f\u0143\b\5\1\2\u0120\u0121\7?\2\2\u0121\u0143\b\5\1\2\u0122"+
		"\u0123\7\17\2\2\u0123\u0143\b\5\1\2\u0124\u0125\7\21\2\2\u0125\u0143\b"+
		"\5\1\2\u0126\u0127\7\60\2\2\u0127\u0143\b\5\1\2\u0128\u012a\7&\2\2\u0129"+
		"\u012b\7\u008d\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u0143\b\5\1\2\u012d\u012e\7\u010f\2\2\u012e\u0143\b\5\1"+
		"\2\u012f\u0130\7\20\2\2\u0130\u0143\b\5\1\2\u0131\u0132\7k\2\2\u0132\u0143"+
		"\b\5\1\2\u0133\u0134\7\"\2\2\u0134\u0143\b\5\1\2\u0135\u0136\7\"\2\2\u0136"+
		"\u0137\7\u022c\2\2\u0137\u0138\7\u0237\2\2\u0138\u0139\7\u0220\2\2\u0139"+
		"\u013a\7\u0237\2\2\u013a\u013b\7\u022f\2\2\u013b\u0143\b\5\1\2\u013c\u013d"+
		"\7!\2\2\u013d\u0143\b\5\1\2\u013e\u013f\7y\2\2\u013f\u0143\b\5\1\2\u0140"+
		"\u0141\7\26\2\2\u0141\u0143\b\5\1\2\u0142\u011c\3\2\2\2\u0142\u011e\3"+
		"\2\2\2\u0142\u0120\3\2\2\2\u0142\u0122\3\2\2\2\u0142\u0124\3\2\2\2\u0142"+
		"\u0126\3\2\2\2\u0142\u0128\3\2\2\2\u0142\u012d\3\2\2\2\u0142\u012f\3\2"+
		"\2\2\u0142\u0131\3\2\2\2\u0142\u0133\3\2\2\2\u0142\u0135\3\2\2\2\u0142"+
		"\u013c\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u0140\3\2\2\2\u0143\t\3\2\2\2"+
		"\u0144\u0145\7\13\2\2\u0145\u0146\7\u0229\2\2\u0146\u0147\5\b\5\2\u0147"+
		"\u0148\7\u0227\2\2\u0148\u0149\b\6\1\2\u0149\u0174\3\2\2\2\u014a\u014b"+
		"\7K\2\2\u014b\u014c\7\u0229\2\2\u014c\u014d\5\b\5\2\u014d\u014e\7\u0220"+
		"\2\2\u014e\u014f\5\6\4\2\u014f\u0150\7\u0227\2\2\u0150\u0151\b\6\1\2\u0151"+
		"\u0174\3\2\2\2\u0152\u0153\b\6\1\2\u0153\u0154\7\u0110\2\2\u0154\u0155"+
		"\7\u0229\2\2\u0155\u0156\5\u0088E\2\u0156\u0157\7\u021f\2\2\u0157\u015f"+
		"\5\6\4\2\u0158\u0159\7\u0220\2\2\u0159\u015a\5\u0088E\2\u015a\u015b\7"+
		"\u021f\2\2\u015b\u015c\5\6\4\2\u015c\u015e\3\2\2\2\u015d\u0158\3\2\2\2"+
		"\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7\u0227\2\2\u0163\u0164\b\6\1"+
		"\2\u0164\u0174\3\2\2\2\u0165\u0166\b\6\1\2\u0166\u0167\7\u011a\2\2\u0167"+
		"\u0168\7\u0229\2\2\u0168\u016d\5\6\4\2\u0169\u016a\7\u0220\2\2\u016a\u016c"+
		"\5\6\4\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\u0227"+
		"\2\2\u0171\u0172\b\6\1\2\u0172\u0174\3\2\2\2\u0173\u0144\3\2\2\2\u0173"+
		"\u014a\3\2\2\2\u0173\u0152\3\2\2\2\u0173\u0165\3\2\2\2\u0174\13\3\2\2"+
		"\2\u0175\u0176\7\u022c\2\2\u0176\u0178\t\2\2\2\u0177\u0179\t\3\2\2\u0178"+
		"\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u017b\7\u0220"+
		"\2\2\u017b\u017d\7\u023a\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017f\7\u022f\2\2\u017f\r\3\2\2\2\u0180\u0181\5~"+
		"@\2\u0181\u0182\b\b\1\2\u0182\u018e\3\2\2\2\u0183\u0184\5\26\f\2\u0184"+
		"\u0185\b\b\1\2\u0185\u018e\3\2\2\2\u0186\u0187\5\34\17\2\u0187\u0188\b"+
		"\b\1\2\u0188\u018e\3\2\2\2\u0189\u018a\5\20\t\2\u018a\u018b\b\b\1\2\u018b"+
		"\u018e\3\2\2\2\u018c\u018e\7\u0219\2\2\u018d\u0180\3\2\2\2\u018d\u0183"+
		"\3\2\2\2\u018d\u0186\3\2\2\2\u018d\u0189\3\2\2\2\u018d\u018c\3\2\2\2\u018e"+
		"\17\3\2\2\2\u018f\u0190\7\u0095\2\2\u0190\u0191\7h\2\2\u0191\u0192\5\u00ea"+
		"v\2\u0192\u0193\5\32\16\2\u0193\u0194\7\u00a6\2\2\u0194\u0195\7\u010c"+
		"\2\2\u0195\u0196\5\22\n\2\u0196\u0197\5\24\13\2\u0197\u0198\b\t\1\2\u0198"+
		"\21\3\2\2\2\u0199\u019e\b\n\1\2\u019a\u019b\7\62\2\2\u019b\u019c\7\u00a2"+
		"\2\2\u019c\u019e\b\n\1\2\u019d\u0199\3\2\2\2\u019d\u019a\3\2\2\2\u019e"+
		"\23\3\2\2\2\u019f\u01a3\b\13\1\2\u01a0\u01a1\7\u00e0\2\2\u01a1\u01a3\b"+
		"\13\1\2\u01a2\u019f\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\25\3\2\2\2\u01a4"+
		"\u01a5\5.\30\2\u01a5\u01a6\b\f\1\2\u01a6\u01b2\3\2\2\2\u01a7\u01a8\5*"+
		"\26\2\u01a8\u01a9\b\f\1\2\u01a9\u01b2\3\2\2\2\u01aa\u01ab\5\30\r\2\u01ab"+
		"\u01ac\b\f\1\2\u01ac\u01b2\3\2\2\2\u01ad\u01ae\7\u011f\2\2\u01ae\u01af"+
		"\5\u00f0y\2\u01af\u01b0\b\f\1\2\u01b0\u01b2\3\2\2\2\u01b1\u01a4\3\2\2"+
		"\2\u01b1\u01a7\3\2\2\2\u01b1\u01aa\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b2\27"+
		"\3\2\2\2\u01b3\u01b4\7>\2\2\u01b4\u01b5\t\4\2\2\u01b5\u01b6\7h\2\2\u01b6"+
		"\u01b7\5\u00eav\2\u01b7\u01b8\5\32\16\2\u01b8\u01b9\5x=\2\u01b9\u01ba"+
		"\5~@\2\u01ba\u01bb\b\r\1\2\u01bb\31\3\2\2\2\u01bc\u01df\b\16\1\2\u01bd"+
		"\u01be\b\16\1\2\u01be\u01bf\7X\2\2\u01bf\u01c0\7\u022c\2\2\u01c0\u01c1"+
		"\5\u00f0y\2\u01c1\u01c2\7\u0223\2\2\u01c2\u01ca\5\u00e6t\2\u01c3\u01c4"+
		"\7\u0220\2\2\u01c4\u01c5\5\u00f0y\2\u01c5\u01c6\7\u0223\2\2\u01c6\u01c7"+
		"\5\u00e6t\2\u01c7\u01c9\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c9\u01cc\3\2\2"+
		"\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca"+
		"\3\2\2\2\u01cd\u01ce\7\u022f\2\2\u01ce\u01cf\b\16\1\2\u01cf\u01df\3\2"+
		"\2\2\u01d0\u01d1\b\16\1\2\u01d1\u01d2\7X\2\2\u01d2\u01d3\7\u022c\2\2\u01d3"+
		"\u01d8\5\u00f0y\2\u01d4\u01d5\7\u0220\2\2\u01d5\u01d7\5\u00f0y\2\u01d6"+
		"\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\7\u022f\2\2\u01dc"+
		"\u01dd\b\16\1\2\u01dd\u01df\3\2\2\2\u01de\u01bc\3\2\2\2\u01de\u01bd\3"+
		"\2\2\2\u01de\u01d0\3\2\2\2\u01df\33\3\2\2\2\u01e0\u01e1\7f\2\2\u01e1\u01e2"+
		"\5$\23\2\u01e2\u01e3\5\"\22\2\u01e3\u01e4\7\u0223\2\2\u01e4\u01e5\5\36"+
		"\20\2\u01e5\u01e6\b\17\1\2\u01e6\35\3\2\2\2\u01e7\u01e8\7\u0236\2\2\u01e8"+
		"\u01f9\b\20\1\2\u01e9\u01ea\5\u0102\u0082\2\u01ea\u01eb\b\20\1\2\u01eb"+
		"\u01f9\3\2\2\2\u01ec\u01ed\5\u0100\u0081\2\u01ed\u01ee\b\20\1\2\u01ee"+
		"\u01f9\3\2\2\2\u01ef\u01f0\5\u00ecw\2\u01f0\u01f1\b\20\1\2\u01f1\u01f9"+
		"\3\2\2\2\u01f2\u01f3\5\u00c2b\2\u01f3\u01f4\b\20\1\2\u01f4\u01f9\3\2\2"+
		"\2\u01f5\u01f6\5\u00aeX\2\u01f6\u01f7\b\20\1\2\u01f7\u01f9\3\2\2\2\u01f8"+
		"\u01e7\3\2\2\2\u01f8\u01e9\3\2\2\2\u01f8\u01ec\3\2\2\2\u01f8\u01ef\3\2"+
		"\2\2\u01f8\u01f2\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f9\37\3\2\2\2\u01fa\u01fb"+
		"\7\3\2\2\u01fb\u01fc\7\u022b\2\2\u01fc\u01fd\5&\24\2\u01fd\u01fe\5\"\22"+
		"\2\u01fe\u01ff\7\u022e\2\2\u01ff\u0200\b\21\1\2\u0200!\3\2\2\2\u0201\u0202"+
		"\b\22\1\2\u0202\u0207\5(\25\2\u0203\u0204\7\4\2\2\u0204\u0206\5(\25\2"+
		"\u0205\u0203\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020b\b\22\1\2"+
		"\u020b#\3\2\2\2\u020c\u0214\b\23\1\2\u020d\u020e\7\u0216\2\2\u020e\u020f"+
		"\7\u021f\2\2\u020f\u0214\b\23\1\2\u0210\u0211\7\u0217\2\2\u0211\u0212"+
		"\7\u021f\2\2\u0212\u0214\b\23\1\2\u0213\u020c\3\2\2\2\u0213\u020d\3\2"+
		"\2\2\u0213\u0210\3\2\2\2\u0214%\3\2\2\2\u0215\u021d\b\24\1\2\u0216\u0217"+
		"\7\u0216\2\2\u0217\u0218\7\u021f\2\2\u0218\u021d\b\24\1\2\u0219\u021a"+
		"\7\u0217\2\2\u021a\u021b\7\u021f\2\2\u021b\u021d\b\24\1\2\u021c\u0215"+
		"\3\2\2\2\u021c\u0216\3\2\2\2\u021c\u0219\3\2\2\2\u021d\'\3\2\2\2\u021e"+
		"\u021f\5\u00f0y\2\u021f\u0220\b\25\1\2\u0220\u0225\3\2\2\2\u0221\u0222"+
		"\5\u0100\u0081\2\u0222\u0223\b\25\1\2\u0223\u0225\3\2\2\2\u0224\u021e"+
		"\3\2\2\2\u0224\u0221\3\2\2\2\u0225)\3\2\2\2\u0226\u0227\7\'\2\2\u0227"+
		"\u0228\7h\2\2\u0228\u0229\5z>\2\u0229\u022a\5\u00eav\2\u022a\u022b\5,"+
		"\27\2\u022b\u022c\b\26\1\2\u022c+\3\2\2\2\u022d\u0231\b\27\1\2\u022e\u022f"+
		"\7\u00ee\2\2\u022f\u0231\b\27\1\2\u0230\u022d\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0231-\3\2\2\2\u0232\u0233\7\31\2\2\u0233\u0234\5|?\2\u0234\u0235"+
		"\7h\2\2\u0235\u0236\5x=\2\u0236\u0237\5\u00eav\2\u0237\u0238\5\60\31\2"+
		"\u0238\u0239\5\62\32\2\u0239\u023a\5\64\33\2\u023a\u023b\58\35\2\u023b"+
		"\u023c\5<\37\2\u023c\u023d\5B\"\2\u023d\u023e\5H%\2\u023e\u023f\5Z.\2"+
		"\u023f\u0240\5\\/\2\u0240\u0241\5^\60\2\u0241\u0242\5b\62\2\u0242\u0243"+
		"\b\30\1\2\u0243\u024f\3\2\2\2\u0244\u0245\7\31\2\2\u0245\u0246\5|?\2\u0246"+
		"\u0247\7h\2\2\u0247\u0248\5x=\2\u0248\u0249\5\u00eav\2\u0249\u024a\7H"+
		"\2\2\u024a\u024b\5\u00eav\2\u024b\u024c\5\\/\2\u024c\u024d\b\30\1\2\u024d"+
		"\u024f\3\2\2\2\u024e\u0232\3\2\2\2\u024e\u0244\3\2\2\2\u024f/\3\2\2\2"+
		"\u0250\u025f\b\31\1\2\u0251\u0252\b\31\1\2\u0252\u0253\7\u022c\2\2\u0253"+
		"\u0258\5f\64\2\u0254\u0255\7\u0220\2\2\u0255\u0257\5f\64\2\u0256\u0254"+
		"\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u025b\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\7\u022f\2\2\u025c\u025d"+
		"\b\31\1\2\u025d\u025f\3\2\2\2\u025e\u0250\3\2\2\2\u025e\u0251\3\2\2\2"+
		"\u025f\61\3\2\2\2\u0260\u026c\b\32\1\2\u0261\u0262\b\32\1\2\u0262\u0266"+
		"\5l\67\2\u0263\u0265\5l\67\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2"+
		"\2\2\u0269\u026a\b\32\1\2\u026a\u026c\3\2\2\2\u026b\u0260\3\2\2\2\u026b"+
		"\u0261\3\2\2\2\u026c\63\3\2\2\2\u026d\u0272\b\33\1\2\u026e\u026f\7\u00a3"+
		"\2\2\u026f\u0270\7\u0239\2\2\u0270\u0272\b\33\1\2\u0271\u026d\3\2\2\2"+
		"\u0271\u026e\3\2\2\2\u0272\65\3\2\2\2\u0273\u0274\58\35\2\u0274\67\3\2"+
		"\2\2\u0275\u0286\b\35\1\2\u0276\u0277\b\35\1\2\u0277\u0278\7\u00e8\2\2"+
		"\u0278\u0279\7\23\2\2\u0279\u027a\7\u022c\2\2\u027a\u027f\5:\36\2\u027b"+
		"\u027c\7\u0220\2\2\u027c\u027e\5:\36\2\u027d\u027b\3\2\2\2\u027e\u0281"+
		"\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0282\u0283\7\u022f\2\2\u0283\u0284\b\35\1\2\u0284\u0286"+
		"\3\2\2\2\u0285\u0275\3\2\2\2\u0285\u0276\3\2\2\2\u02869\3\2\2\2\u0287"+
		"\u0288\5\u0088E\2\u0288\u0289\5\6\4\2\u0289\u028a\b\36\1\2\u028a\u0292"+
		"\3\2\2\2\u028b\u028c\5\u0088E\2\u028c\u028d\5\6\4\2\u028d\u028e\7\u00a3"+
		"\2\2\u028e\u028f\7\u0239\2\2\u028f\u0290\b\36\1\2\u0290\u0292\3\2\2\2"+
		"\u0291\u0287\3\2\2\2\u0291\u028b\3\2\2\2\u0292;\3\2\2\2\u0293\u02a8\b"+
		"\37\1\2\u0294\u0295\b\37\1\2\u0295\u0296\7\u009f\2\2\u0296\u0297\7\23"+
		"\2\2\u0297\u0298\7\u022c\2\2\u0298\u029d\5\u0088E\2\u0299\u029a\7\u0220"+
		"\2\2\u029a\u029c\5\u0088E\2\u029b\u0299\3\2\2\2\u029c\u029f\3\2\2\2\u029d"+
		"\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u029d\3\2"+
		"\2\2\u02a0\u02a1\7\u022f\2\2\u02a1\u02a2\5> \2\u02a2\u02a3\7B\2\2\u02a3"+
		"\u02a4\7\u0237\2\2\u02a4\u02a5\7\u009b\2\2\u02a5\u02a6\b\37\1\2\u02a6"+
		"\u02a8\3\2\2\2\u02a7\u0293\3\2\2\2\u02a7\u0294\3\2\2\2\u02a8=\3\2\2\2"+
		"\u02a9\u02bd\b \1\2\u02aa\u02ab\b \1\2\u02ab\u02ac\7\u010d\2\2\u02ac\u02ad"+
		"\7\23\2\2\u02ad\u02ae\7\u022c\2\2\u02ae\u02af\5\u0088E\2\u02af\u02b6\5"+
		"@!\2\u02b0\u02b1\7\u0220\2\2\u02b1\u02b2\5\u0088E\2\u02b2\u02b3\5@!\2"+
		"\u02b3\u02b5\3\2\2\2\u02b4\u02b0\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4"+
		"\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9"+
		"\u02ba\7\u022f\2\2\u02ba\u02bb\b \1\2\u02bb\u02bd\3\2\2\2\u02bc\u02a9"+
		"\3\2\2\2\u02bc\u02aa\3\2\2\2\u02bd?\3\2\2\2\u02be\u02c4\b!\1\2\u02bf\u02c0"+
		"\7\u0097\2\2\u02c0\u02c4\b!\1\2\u02c1\u02c2\7\u00b2\2\2\u02c2\u02c4\b"+
		"!\1\2\u02c3\u02be\3\2\2\2\u02c3\u02bf\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4"+
		"A\3\2\2\2\u02c5\u02d8\b\"\1\2\u02c6\u02c7\b\"\1\2\u02c7\u02c8\7\u0108"+
		"\2\2\u02c8\u02c9\7\23\2\2\u02c9\u02ca\7\u022c\2\2\u02ca\u02cf\5\u0088"+
		"E\2\u02cb\u02cc\7\u0220\2\2\u02cc\u02ce\5\u0088E\2\u02cd\u02cb\3\2\2\2"+
		"\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2"+
		"\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d3\5D#\2\u02d3\u02d4\7\u022f\2\2"+
		"\u02d4\u02d5\5F$\2\u02d5\u02d6\b\"\1\2\u02d6\u02d8\3\2\2\2\u02d7\u02c5"+
		"\3\2\2\2\u02d7\u02c6\3\2\2\2\u02d8C\3\2\2\2\u02d9\u030a\b#\1\2\u02da\u02db"+
		"\b#\1\2\u02db\u02dc\7Q\2\2\u02dc\u02dd\7\u022c\2\2\u02dd\u02e2\5\u00e6"+
		"t\2\u02de\u02df\7\u0220\2\2\u02df\u02e1\5\u00e6t\2\u02e0\u02de\3\2\2\2"+
		"\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5"+
		"\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e6\7\u022f\2\2\u02e6\u02e7\b#\1"+
		"\2\u02e7\u030a\3\2\2\2\u02e8\u02e9\b#\1\2\u02e9\u02ea\7Q\2\2\u02ea\u02eb"+
		"\7\u022c\2\2\u02eb\u02ec\7\u022c\2\2\u02ec\u02f1\5\u00e6t\2\u02ed\u02ee"+
		"\7\u0220\2\2\u02ee\u02f0\5\u00e6t\2\u02ef\u02ed\3\2\2\2\u02f0\u02f3\3"+
		"\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\3\2\2\2\u02f3"+
		"\u02f1\3\2\2\2\u02f4\u0303\7\u022f\2\2\u02f5\u02f6\7\u0220\2\2\u02f6\u02f7"+
		"\7\u022c\2\2\u02f7\u02fc\5\u00e6t\2\u02f8\u02f9\7\u0220\2\2\u02f9\u02fb"+
		"\5\u00e6t\2\u02fa\u02f8\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2\2"+
		"\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0300"+
		"\7\u022f\2\2\u0300\u0302\3\2\2\2\u0301\u02f5\3\2\2\2\u0302\u0305\3\2\2"+
		"\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0303"+
		"\3\2\2\2\u0306\u0307\7\u022f\2\2\u0307\u0308\b#\1\2\u0308\u030a\3\2\2"+
		"\2\u0309\u02d9\3\2\2\2\u0309\u02da\3\2\2\2\u0309\u02e8\3\2\2\2\u030aE"+
		"\3\2\2\2\u030b\u0311\b$\1\2\u030c\u030d\7\u010d\2\2\u030d\u030e\7\f\2"+
		"\2\u030e\u030f\7\u00b4\2\2\u030f\u0311\b$\1\2\u0310\u030b\3\2\2\2\u0310"+
		"\u030c\3\2\2\2\u0311G\3\2\2\2\u0312\u0319\b%\1\2\u0313\u0314\7c\2\2\u0314"+
		"\u0315\7\u00c1\2\2\u0315\u0316\5J&\2\u0316\u0317\b%\1\2\u0317\u0319\3"+
		"\2\2\2\u0318\u0312\3\2\2\2\u0318\u0313\3\2\2\2\u0319I\3\2\2\2\u031a\u031b"+
		"\7\u00b0\2\2\u031b\u031c\5L\'\2\u031c\u031d\5N(\2\u031d\u031e\5P)\2\u031e"+
		"\u031f\5R*\2\u031f\u0320\5T+\2\u0320\u0321\b&\1\2\u0321\u0328\3\2\2\2"+
		"\u0322\u0323\7\u0101\2\2\u0323\u0324\7\u0239\2\2\u0324\u0325\5V,\2\u0325"+
		"\u0326\b&\1\2\u0326\u0328\3\2\2\2\u0327\u031a\3\2\2\2\u0327\u0322\3\2"+
		"\2\2\u0328K\3\2\2\2\u0329\u0338\b\'\1\2\u032a\u032b\7\u00bd\2\2\u032b"+
		"\u032c\7\u0114\2\2\u032c\u032d\7\23\2\2\u032d\u032e\7\u0239\2\2\u032e"+
		"\u0338\b\'\1\2\u032f\u0330\7\u00bd\2\2\u0330\u0331\7\u0114\2\2\u0331\u0332"+
		"\7\23\2\2\u0332\u0333\7\u0239\2\2\u0333\u0334\7\u00b9\2\2\u0334\u0335"+
		"\7\23\2\2\u0335\u0336\7\u0239\2\2\u0336\u0338\b\'\1\2\u0337\u0329\3\2"+
		"\2\2\u0337\u032a\3\2\2\2\u0337\u032f\3\2\2\2\u0338M\3\2\2\2\u0339\u0341"+
		"\b(\1\2\u033a\u033b\7\u00a1\2\2\u033b\u033c\7\u00cd\2\2\u033c\u033d\7"+
		"\u0114\2\2\u033d\u033e\7\23\2\2\u033e\u033f\7\u0239\2\2\u033f\u0341\b"+
		"(\1\2\u0340\u0339\3\2\2\2\u0340\u033a\3\2\2\2\u0341O\3\2\2\2\u0342\u034a"+
		"\b)\1\2\u0343\u0344\7K\2\2\u0344\u0345\7\u00cf\2\2\u0345\u0346\7\u0114"+
		"\2\2\u0346\u0347\7\23\2\2\u0347\u0348\7\u0239\2\2\u0348\u034a\b)\1\2\u0349"+
		"\u0342\3\2\2\2\u0349\u0343\3\2\2\2\u034aQ\3\2\2\2\u034b\u0352\b*\1\2\u034c"+
		"\u034d\7\u00d2\2\2\u034d\u034e\7\u0114\2\2\u034e\u034f\7\23\2\2\u034f"+
		"\u0350\7\u0239\2\2\u0350\u0352\b*\1\2\u0351\u034b\3\2\2\2\u0351\u034c"+
		"\3\2\2\2\u0352S\3\2\2\2\u0353\u035a\b+\1\2\u0354\u0355\7O\2\2\u0355\u0356"+
		"\7\u00af\2\2\u0356\u0357\7\f\2\2\u0357\u0358\7\u0239\2\2\u0358\u035a\b"+
		"+\1\2\u0359\u0353\3\2\2\2\u0359\u0354\3\2\2\2\u035aU\3\2\2\2\u035b\u0371"+
		"\b,\1\2\u035c\u035d\b,\1\2\u035d\u035e\7}\2\2\u035e\u035f\7\u0102\2\2"+
		"\u035f\u0360\7\u022c\2\2\u0360\u0361\5X-\2\u0361\u0362\7\u0223\2\2\u0362"+
		"\u036a\5X-\2\u0363\u0364\7\u0220\2\2\u0364\u0365\5X-\2\u0365\u0366\7\u0223"+
		"\2\2\u0366\u0367\5X-\2\u0367\u0369\3\2\2\2\u0368\u0363\3\2\2\2\u0369\u036c"+
		"\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036d\3\2\2\2\u036c"+
		"\u036a\3\2\2\2\u036d\u036e\7\u022f\2\2\u036e\u036f\b,\1\2\u036f\u0371"+
		"\3\2\2\2\u0370\u035b\3\2\2\2\u0370\u035c\3\2\2\2\u0371W\3\2\2\2\u0372"+
		"\u0373\7\u0239\2\2\u0373\u0374\b-\1\2\u0374Y\3\2\2\2\u0375\u0389\b.\1"+
		"\2\u0376\u0377\7\u010d\2\2\u0377\u0378\7\f\2\2\u0378\u0379\5d\63\2\u0379"+
		"\u037a\b.\1\2\u037a\u0389\3\2\2\2\u037b\u037c\7\u010d\2\2\u037c\u037d"+
		"\7\f\2\2\u037d\u037e\7\u00cc\2\2\u037e\u037f\7\u0239\2\2\u037f\u0380\7"+
		"\u00e5\2\2\u0380\u0381\7\u0239\2\2\u0381\u0389\b.\1\2\u0382\u0383\7\u010d"+
		"\2\2\u0383\u0384\7\23\2\2\u0384\u0385\7\u0239\2\2\u0385\u0386\5V,\2\u0386"+
		"\u0387\b.\1\2\u0387\u0389\3\2\2\2\u0388\u0375\3\2\2\2\u0388\u0376\3\2"+
		"\2\2\u0388\u037b\3\2\2\2\u0388\u0382\3\2\2\2\u0389[\3\2\2\2\u038a\u038f"+
		"\b/\1\2\u038b\u038c\7\u00d4\2\2\u038c\u038d\7\u0239\2\2\u038d\u038f\b"+
		"/\1\2\u038e\u038a\3\2\2\2\u038e\u038b\3\2\2\2\u038f]\3\2\2\2\u0390\u03a5"+
		"\b\60\1\2\u0391\u0392\b\60\1\2\u0392\u0393\7\u0112\2\2\u0393\u0394\7\u022c"+
		"\2\2\u0394\u0395\5`\61\2\u0395\u0396\7\u0223\2\2\u0396\u039e\5`\61\2\u0397"+
		"\u0398\7\u0220\2\2\u0398\u0399\5`\61\2\u0399\u039a\7\u0223\2\2\u039a\u039b"+
		"\5`\61\2\u039b\u039d\3\2\2\2\u039c\u0397\3\2\2\2\u039d\u03a0\3\2\2\2\u039e"+
		"\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a1\3\2\2\2\u03a0\u039e\3\2"+
		"\2\2\u03a1\u03a2\7\u022f\2\2\u03a2\u03a3\b\60\1\2\u03a3\u03a5\3\2\2\2"+
		"\u03a4\u0390\3\2\2\2\u03a4\u0391\3\2\2\2\u03a5_\3\2\2\2\u03a6\u03a7\7"+
		"\u0239\2\2\u03a7\u03a8\b\61\1\2\u03a8a\3\2\2\2\u03a9\u03af\b\62\1\2\u03aa"+
		"\u03ab\7\f\2\2\u03ab\u03ac\5~@\2\u03ac\u03ad\b\62\1\2\u03ad\u03af\3\2"+
		"\2\2\u03ae\u03a9\3\2\2\2\u03ae\u03aa\3\2\2\2\u03afc\3\2\2\2\u03b0\u03b1"+
		"\7\u020f\2\2\u03b1\u03bf\b\63\1\2\u03b2\u03b3\7\u0210\2\2\u03b3\u03bf"+
		"\b\63\1\2\u03b4\u03b5\7\u0211\2\2\u03b5\u03bf\b\63\1\2\u03b6\u03b7\7\u0212"+
		"\2\2\u03b7\u03bf\b\63\1\2\u03b8\u03b9\7\u0213\2\2\u03b9\u03bf\b\63\1\2"+
		"\u03ba\u03bb\7\u0214\2\2\u03bb\u03bf\b\63\1\2\u03bc\u03bd\7\u0215\2\2"+
		"\u03bd\u03bf\b\63\1\2\u03be\u03b0\3\2\2\2\u03be\u03b2\3\2\2\2\u03be\u03b4"+
		"\3\2\2\2\u03be\u03b6\3\2\2\2\u03be\u03b8\3\2\2\2\u03be\u03ba\3\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03bfe\3\2\2\2\u03c0\u03c1\5\u0088E\2\u03c1\u03c2\5\6\4"+
		"\2\u03c2\u03c3\b\64\1\2\u03c3\u03e1\3\2\2\2\u03c4\u03c5\5\u0088E\2\u03c5"+
		"\u03c6\5\6\4\2\u03c6\u03c7\7\u00a3\2\2\u03c7\u03c8\7\u0239\2\2\u03c8\u03c9"+
		"\b\64\1\2\u03c9\u03e1\3\2\2\2\u03ca\u03cb\b\64\1\2\u03cb\u03cc\5\u0088"+
		"E\2\u03cc\u03ce\5\6\4\2\u03cd\u03cf\5h\65\2\u03ce\u03cd\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\3\2"+
		"\2\2\u03d2\u03d3\7\u00a3\2\2\u03d3\u03d4\7\u0239\2\2\u03d4\u03d5\b\64"+
		"\1\2\u03d5\u03e1\3\2\2\2\u03d6\u03d7\b\64\1\2\u03d7\u03d8\5\u0088E\2\u03d8"+
		"\u03da\5\6\4\2\u03d9\u03db\5h\65\2\u03da\u03d9\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03df\b\64\1\2\u03df\u03e1\3\2\2\2\u03e0\u03c0\3\2\2\2\u03e0\u03c4\3"+
		"\2\2\2\u03e0\u03ca\3\2\2\2\u03e0\u03d6\3\2\2\2\u03e1g\3\2\2\2\u03e2\u03e3"+
		"\7\u0087\2\2\u03e3\u03e4\7\u012e\2\2\u03e4\u03fd\b\65\1\2\u03e5\u03e6"+
		"\7\u020c\2\2\u03e6\u03fd\b\65\1\2\u03e7\u03e8\7N\2\2\u03e8\u03e9\7O\2"+
		"\2\u03e9\u03fd\b\65\1\2\u03ea\u03eb\7\u020e\2\2\u03eb\u03ec\5j\66\2\u03ec"+
		"\u03ed\b\65\1\2\u03ed\u03fd\3\2\2\2\u03ee\u03ef\7\u020d\2\2\u03ef\u03f0"+
		"\5\u00aeX\2\u03f0\u03f1\b\65\1\2\u03f1\u03fd\3\2\2\2\u03f2\u03f3\7\u00b8"+
		"\2\2\u03f3\u03fd\b\65\1\2\u03f4\u03f5\7\u00b5\2\2\u03f5\u03fd\b\65\1\2"+
		"\u03f6\u03f7\7\u0131\2\2\u03f7\u03fd\b\65\1\2\u03f8\u03f9\7\u0133\2\2"+
		"\u03f9\u03fd\b\65\1\2\u03fa\u03fb\7\u0130\2\2\u03fb\u03fd\b\65\1\2\u03fc"+
		"\u03e2\3\2\2\2\u03fc\u03e5\3\2\2\2\u03fc\u03e7\3\2\2\2\u03fc\u03ea\3\2"+
		"\2\2\u03fc\u03ee\3\2\2\2\u03fc\u03f2\3\2\2\2\u03fc\u03f4\3\2\2\2\u03fc"+
		"\u03f6\3\2\2\2\u03fc\u03f8\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fdi\3\2\2\2"+
		"\u03fe\u0409\5\u00e6t\2\u03ff\u0400\7\u0148\2\2\u0400\u0401\7\u022c\2"+
		"\2\u0401\u0409\7\u022f\2\2\u0402\u0403\7\35\2\2\u0403\u0404\7\u022c\2"+
		"\2\u0404\u0409\7\u022f\2\2\u0405\u0406\7\36\2\2\u0406\u0407\7\u022c\2"+
		"\2\u0407\u0409\7\u022f\2\2\u0408\u03fe\3\2\2\2\u0408\u03ff\3\2\2\2\u0408"+
		"\u0402\3\2\2\2\u0408\u0405\3\2\2\2\u0409k\3\2\2\2\u040a\u040b\b\67\1\2"+
		"\u040b\u040c\7\u0087\2\2\u040c\u040d\7\u012e\2\2\u040d\u040e\7\u022c\2"+
		"\2\u040e\u0413\5\u0088E\2\u040f\u0410\7\u0220\2\2\u0410\u0412\5\u0088"+
		"E\2\u0411\u040f\3\2\2\2\u0412\u0415\3\2\2\2\u0413\u0411\3\2\2\2\u0413"+
		"\u0414\3\2\2\2\u0414\u0416\3\2\2\2\u0415\u0413\3\2\2\2\u0416\u0417\7\u022f"+
		"\2\2\u0417\u0418\5r:\2\u0418\u0419\5t;\2\u0419\u041a\5v<\2\u041a\u041b"+
		"\b\67\1\2\u041b\u0458\3\2\2\2\u041c\u041d\b\67\1\2\u041d\u041e\7\u0085"+
		"\2\2\u041e\u041f\5\u00f0y\2\u041f\u0420\7\u0086\2\2\u0420\u0421\7\u012e"+
		"\2\2\u0421\u0422\7\u022c\2\2\u0422\u0427\5\u0088E\2\u0423\u0424\7\u0220"+
		"\2\2\u0424\u0426\5\u0088E\2\u0425\u0423\3\2\2\2\u0426\u0429\3\2\2\2\u0427"+
		"\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u042a\3\2\2\2\u0429\u0427\3\2"+
		"\2\2\u042a\u042b\7\u022f\2\2\u042b\u042c\7\u0088\2\2\u042c\u042d\5\u00ea"+
		"v\2\u042d\u042e\7\u022c\2\2\u042e\u0433\5\u0088E\2\u042f\u0430\7\u0220"+
		"\2\2\u0430\u0432\5\u0088E\2\u0431\u042f\3\2\2\2\u0432\u0435\3\2\2\2\u0433"+
		"\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0436\3\2\2\2\u0435\u0433\3\2"+
		"\2\2\u0436\u0437\7\u022f\2\2\u0437\u0438\5r:\2\u0438\u0439\5t;\2\u0439"+
		"\u043a\b\67\1\2\u043a\u0458\3\2\2\2\u043b\u043c\b\67\1\2\u043c\u043d\7"+
		"\u0085\2\2\u043d\u043e\5\u00f0y\2\u043e\u043f\7\u020c\2\2\u043f\u0440"+
		"\7\u022c\2\2\u0440\u0445\5\u0088E\2\u0441\u0442\7\u0220\2\2\u0442\u0444"+
		"\5\u0088E\2\u0443\u0441\3\2\2\2\u0444\u0447\3\2\2\2\u0445\u0443\3\2\2"+
		"\2\u0445\u0446\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u0445\3\2\2\2\u0448\u0449"+
		"\7\u022f\2\2\u0449\u044a\5r:\2\u044a\u044b\5t;\2\u044b\u044c\5v<\2\u044c"+
		"\u044d\b\67\1\2\u044d\u0458\3\2\2\2\u044e\u044f\7\u0085\2\2\u044f\u0450"+
		"\5\u00f0y\2\u0450\u0451\7\u020d\2\2\u0451\u0452\5\u00aeX\2\u0452\u0453"+
		"\5n8\2\u0453\u0454\5t;\2\u0454\u0455\5v<\2\u0455\u0456\b\67\1\2\u0456"+
		"\u0458\3\2\2\2\u0457\u040a\3\2\2\2\u0457\u041c\3\2\2\2\u0457\u043b\3\2"+
		"\2\2\u0457\u044e\3\2\2\2\u0458m\3\2\2\2\u0459\u045f\b8\1\2\u045a\u045b"+
		"\7\u00b8\2\2\u045b\u045f\b8\1\2\u045c\u045d\7\u00b5\2\2\u045d\u045f\b"+
		"8\1\2\u045e\u0459\3\2\2\2\u045e\u045a\3\2\2\2\u045e\u045c\3\2\2\2\u045f"+
		"o\3\2\2\2\u0460\u0464\b9\1\2\u0461\u0462\7\u00b8\2\2\u0462\u0464\b9\1"+
		"\2\u0463\u0460\3\2\2\2\u0463\u0461\3\2\2\2\u0464q\3\2\2\2\u0465\u0469"+
		"\b:\1\2\u0466\u0467\7\u00b5\2\2\u0467\u0469\b:\1\2\u0468\u0465\3\2\2\2"+
		"\u0468\u0466\3\2\2\2\u0469s\3\2\2\2\u046a\u046e\b;\1\2\u046b\u046c\7\u0131"+
		"\2\2\u046c\u046e\b;\1\2\u046d\u046a\3\2\2\2\u046d\u046b\3\2\2\2\u046e"+
		"u\3\2\2\2\u046f\u0475\b<\1\2\u0470\u0471\7\u0133\2\2\u0471\u0475\b<\1"+
		"\2\u0472\u0473\7\u0130\2\2\u0473\u0475\b<\1\2\u0474\u046f\3\2\2\2\u0474"+
		"\u0470\3\2\2\2\u0474\u0472\3\2\2\2\u0475w\3\2\2\2\u0476\u047c\b=\1\2\u0477"+
		"\u0478\7:\2\2\u0478\u0479\7N\2\2\u0479\u047a\7+\2\2\u047a\u047c\b=\1\2"+
		"\u047b\u0476\3\2\2\2\u047b\u0477\3\2\2\2\u047cy\3\2\2\2\u047d\u0482\b"+
		">\1\2\u047e\u047f\7:\2\2\u047f\u0480\7+\2\2\u0480\u0482\b>\1\2\u0481\u047d"+
		"\3\2\2\2\u0481\u047e\3\2\2\2\u0482{\3\2\2\2\u0483\u0489\b?\1\2\u0484\u0485"+
		"\7-\2\2\u0485\u0489\b?\1\2\u0486\u0487\7\u0113\2\2\u0487\u0489\b?\1\2"+
		"\u0488\u0483\3\2\2\2\u0488\u0484\3\2\2\2\u0488\u0486\3\2\2\2\u0489}\3"+
		"\2\2\2\u048a\u048b\5\u0084C\2\u048b\u048c\b@\1\2\u048c\u0491\3\2\2\2\u048d"+
		"\u048e\5\u0080A\2\u048e\u048f\b@\1\2\u048f\u0491\3\2\2\2\u0490\u048a\3"+
		"\2\2\2\u0490\u048d\3\2\2\2\u0491\177\3\2\2\2\u0492\u0493\bA\1\2\u0493"+
		"\u0498\5\u0084C\2\u0494\u0495\7r\2\2\u0495\u0496\5\u0082B\2\u0496\u0497"+
		"\5\u0084C\2\u0497\u0499\3\2\2\2\u0498\u0494\3\2\2\2\u0499\u049a\3\2\2"+
		"\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d"+
		"\bA\1\2\u049d\u0081\3\2\2\2\u049e\u04a4\bB\1\2\u049f\u04a0\7\b\2\2\u04a0"+
		"\u04a4\bB\1\2\u04a1\u04a2\7%\2\2\u04a2\u04a4\bB\1\2\u04a3\u049e\3\2\2"+
		"\2\u04a3\u049f\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a4\u0083\3\2\2\2\u04a5\u04a6"+
		"\7e\2\2\u04a6\u04a7\5\u009eP\2\u04a7\u04a8\5\u00a0Q\2\u04a8\u04a9\bC\1"+
		"\2\u04a9\u04bd\3\2\2\2\u04aa\u04ab\7e\2\2\u04ab\u04ac\5\u009eP\2\u04ac"+
		"\u04ad\5\u00e0q\2\u04ad\u04ae\bC\1\2\u04ae\u04bd\3\2\2\2\u04af\u04b0\7"+
		"e\2\2\u04b0\u04b1\5\u009eP\2\u04b1\u04b2\5\u00a0Q\2\u04b2\u04b3\7\63\2"+
		"\2\u04b3\u04b4\5\u0096L\2\u04b4\u04b5\5\u0086D\2\u04b5\u04b6\5\u008aF"+
		"\2\u04b6\u04b7\5\u008cG\2\u04b7\u04b8\5\u008eH\2\u04b8\u04b9\5\u0090I"+
		"\2\u04b9\u04ba\5\u0094K\2\u04ba\u04bb\bC\1\2\u04bb\u04bd\3\2\2\2\u04bc"+
		"\u04a5\3\2\2\2\u04bc\u04aa\3\2\2\2\u04bc\u04af\3\2\2\2\u04bd\u0085\3\2"+
		"\2\2\u04be\u04d0\bD\1\2\u04bf\u04c0\bD\1\2\u04c0\u04c1\7E\2\2\u04c1\u04c2"+
		"\7\u0123\2\2\u04c2\u04c3\5\u00e0q\2\u04c3\u04c4\5\u0088E\2\u04c4\u04c5"+
		"\7\f\2\2\u04c5\u04ca\5\u0088E\2\u04c6\u04c7\7\u0220\2\2\u04c7\u04c9\5"+
		"\u0088E\2\u04c8\u04c6\3\2\2\2\u04c9\u04cc\3\2\2\2\u04ca\u04c8\3\2\2\2"+
		"\u04ca\u04cb\3\2\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cd\u04ce"+
		"\bD\1\2\u04ce\u04d0\3\2\2\2\u04cf\u04be\3\2\2\2\u04cf\u04bf\3\2\2\2\u04d0"+
		"\u0087\3\2\2\2\u04d1\u04d2\5\u00f0y\2\u04d2\u04d3\bE\1\2\u04d3\u0089\3"+
		"\2\2\2\u04d4\u04da\bF\1\2\u04d5\u04d6\7{\2\2\u04d6\u04d7\5\u00aeX\2\u04d7"+
		"\u04d8\bF\1\2\u04d8\u04da\3\2\2\2\u04d9\u04d4\3\2\2\2\u04d9\u04d5\3\2"+
		"\2\2\u04da\u008b\3\2\2\2\u04db\u04ea\bG\1\2\u04dc\u04dd\bG\1\2\u04dd\u04de"+
		"\7\67\2\2\u04de\u04df\7\23\2\2\u04df\u04e4\5\u00aeX\2\u04e0\u04e1\7\u0220"+
		"\2\2\u04e1\u04e3\5\u00aeX\2\u04e2\u04e0\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4"+
		"\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04e4\3\2"+
		"\2\2\u04e7\u04e8\bG\1\2\u04e8\u04ea\3\2\2\2\u04e9\u04db\3\2\2\2\u04e9"+
		"\u04dc\3\2\2\2\u04ea\u008d\3\2\2\2\u04eb\u04f1\bH\1\2\u04ec\u04ed\79\2"+
		"\2\u04ed\u04ee\5\u00aeX\2\u04ee\u04ef\bH\1\2\u04ef\u04f1\3\2\2\2\u04f0"+
		"\u04eb\3\2\2\2\u04f0\u04ec\3\2\2\2\u04f1\u008f\3\2\2\2\u04f2\u0504\bI"+
		"\1\2\u04f3\u04f4\bI\1\2\u04f4\u04f5\7S\2\2\u04f5\u04f6\7\23\2\2\u04f6"+
		"\u04f7\5\u00e8u\2\u04f7\u04fe\5\u0092J\2\u04f8\u04f9\7\u0220\2\2\u04f9"+
		"\u04fa\5\u00e8u\2\u04fa\u04fb\5\u0092J\2\u04fb\u04fd\3\2\2\2\u04fc\u04f8"+
		"\3\2\2\2\u04fd\u0500\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"\u0501\3\2\2\2\u0500\u04fe\3\2\2\2\u0501\u0502\bI\1\2\u0502\u0504\3\2"+
		"\2\2\u0503\u04f2\3\2\2\2\u0503\u04f3\3\2\2\2\u0504\u0091\3\2\2\2\u0505"+
		"\u050b\bJ\1\2\u0506\u0507\7\u0097\2\2\u0507\u050b\bJ\1\2\u0508\u0509\7"+
		"\u00b2\2\2\u0509\u050b\bJ\1\2\u050a\u0505\3\2\2\2\u050a\u0506\3\2\2\2"+
		"\u050a\u0508\3\2\2\2\u050b\u0093\3\2\2\2\u050c\u0516\bK\1\2\u050d\u050e"+
		"\7\u00d1\2\2\u050e\u050f\7\u0237\2\2\u050f\u0516\bK\1\2\u0510\u0511\7"+
		"\u00d1\2\2\u0511\u0512\7\u0237\2\2\u0512\u0513\7\u0220\2\2\u0513\u0514"+
		"\7\u0237\2\2\u0514\u0516\bK\1\2\u0515\u050c\3\2\2\2\u0515\u050d\3\2\2"+
		"\2\u0515\u0510\3\2\2\2\u0516\u0095\3\2\2\2\u0517\u0518\5\u009cO\2\u0518"+
		"\u0519\bL\1\2\u0519\u052e\3\2\2\2\u051a\u051b\bL\1\2\u051b\u051e\5\u009c"+
		"O\2\u051c\u051d\7\u0220\2\2\u051d\u051f\5\u009cO\2\u051e\u051c\3\2\2\2"+
		"\u051f\u0520\3\2\2\2\u0520\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522"+
		"\3\2\2\2\u0522\u0523\bL\1\2\u0523\u052e\3\2\2\2\u0524\u0525\bL\1\2\u0525"+
		"\u0527\5\u009cO\2\u0526\u0528\5\u0098M\2\u0527\u0526\3\2\2\2\u0528\u0529"+
		"\3\2\2\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\3\2\2\2\u052b"+
		"\u052c\bL\1\2\u052c\u052e\3\2\2\2\u052d\u0517\3\2\2\2\u052d\u051a\3\2"+
		"\2\2\u052d\u0524\3\2\2\2\u052e\u0097\3\2\2\2\u052f\u0531\7=\2\2\u0530"+
		"\u052f\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\7D"+
		"\2\2\u0533\u0534\5\u009cO\2\u0534\u0535\bM\1\2\u0535\u0553\3\2\2\2\u0536"+
		"\u0538\7=\2\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\3\2"+
		"\2\2\u0539\u053a\7D\2\2\u053a\u053b\5\u009cO\2\u053b\u053c\5\u009aN\2"+
		"\u053c\u053d\bM\1\2\u053d\u0553\3\2\2\2\u053e\u0540\t\5\2\2\u053f\u0541"+
		"\7U\2\2\u0540\u053f\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0542\3\2\2\2\u0542"+
		"\u0543\7D\2\2\u0543\u0544\5\u009cO\2\u0544\u0545\5\u009aN\2\u0545\u0546"+
		"\bM\1\2\u0546\u0553\3\2\2\2\u0547\u0548\7\32\2\2\u0548\u0549\7D\2\2\u0549"+
		"\u054a\5\u009cO\2\u054a\u054b\bM\1\2\u054b\u0553\3\2\2\2\u054c\u054d\7"+
		"\32\2\2\u054d\u054e\7D\2\2\u054e\u054f\5\u009cO\2\u054f\u0550\5\u009a"+
		"N\2\u0550\u0551\bM\1\2\u0551\u0553\3\2\2\2\u0552\u0530\3\2\2\2\u0552\u0537"+
		"\3\2\2\2\u0552\u053e\3\2\2\2\u0552\u0547\3\2\2\2\u0552\u054c\3\2\2\2\u0553"+
		"\u0099\3\2\2\2\u0554\u0555\7Q\2\2\u0555\u0556\5\u00aeX\2\u0556\u0557\b"+
		"N\1\2\u0557\u009b\3\2\2\2\u0558\u0559\5\u00eav\2\u0559\u055a\bO\1\2\u055a"+
		"\u0575\3\2\2\2\u055b\u055d\5\u00eav\2\u055c\u055e\7\f\2\2\u055d\u055c"+
		"\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\5\u00f0y"+
		"\2\u0560\u0561\bO\1\2\u0561\u0575\3\2\2\2\u0562\u0563\7\u022c\2\2\u0563"+
		"\u0564\5\u0080A\2\u0564\u0566\7\u022f\2\2\u0565\u0567\7\f\2\2\u0566\u0565"+
		"\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0569\5\u00f0y"+
		"\2\u0569\u056a\bO\1\2\u056a\u0575\3\2\2\2\u056b\u056c\7\u022c\2\2\u056c"+
		"\u056d\5\u0084C\2\u056d\u056f\7\u022f\2\2\u056e\u0570\7\f\2\2\u056f\u056e"+
		"\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\5\u00f0y"+
		"\2\u0572\u0573\bO\1\2\u0573\u0575\3\2\2\2\u0574\u0558\3\2\2\2\u0574\u055b"+
		"\3\2\2\2\u0574\u0562\3\2\2\2\u0574\u056b\3\2\2\2\u0575\u009d\3\2\2\2\u0576"+
		"\u057c\bP\1\2\u0577\u0578\7\b\2\2\u0578\u057c\bP\1\2\u0579\u057a\7%\2"+
		"\2\u057a\u057c\bP\1\2\u057b\u0576\3\2\2\2\u057b\u0577\3\2\2\2\u057b\u0579"+
		"\3\2\2\2\u057c\u009f\3\2\2\2\u057d\u057e\bQ\1\2\u057e\u0583\5\u00a2R\2"+
		"\u057f\u0580\7\u0220\2\2\u0580\u0582\5\u00a2R\2\u0581\u057f\3\2\2\2\u0582"+
		"\u0585\3\2\2\2\u0583\u0581\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2"+
		"\2\2\u0585\u0583\3\2\2\2\u0586\u0587\bQ\1\2\u0587\u00a1\3\2\2\2\u0588"+
		"\u058a\5\u00aeX\2\u0589\u058b\7\f\2\2\u058a\u0589\3\2\2\2\u058a\u058b"+
		"\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\5\u00f0y\2\u058d\u058e\bR\1\2"+
		"\u058e\u05ae\3\2\2\2\u058f\u0590\5\u00aeX\2\u0590\u0591\bR\1\2\u0591\u05ae"+
		"\3\2\2\2\u0592\u0594\5\u00aeX\2\u0593\u0595\7\f\2\2\u0594\u0593\3\2\2"+
		"\2\u0594\u0595\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\5\u00f0y\2\u0597"+
		"\u0598\bR\1\2\u0598\u05ae\3\2\2\2\u0599\u059a\5\u00aeX\2\u059a\u059b\b"+
		"R\1\2\u059b\u05ae\3\2\2\2\u059c\u059d\7\u021c\2\2\u059d\u05ae\bR\1\2\u059e"+
		"\u059f\5\u00f0y\2\u059f\u05a0\7\4\2\2\u05a0\u05a1\7\u021c\2\2\u05a1\u05a2"+
		"\bR\1\2\u05a2\u05ae\3\2\2\2\u05a3\u05a4\5\u00a4S\2\u05a4\u05a5\bR\1\2"+
		"\u05a5\u05ae\3\2\2\2\u05a6\u05a8\5\u00a4S\2\u05a7\u05a9\7\f\2\2\u05a8"+
		"\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\5\u00f0"+
		"y\2\u05ab\u05ac\bR\1\2\u05ac\u05ae\3\2\2\2\u05ad\u0588\3\2\2\2\u05ad\u058f"+
		"\3\2\2\2\u05ad\u0592\3\2\2\2\u05ad\u0599\3\2\2\2\u05ad\u059c\3\2\2\2\u05ad"+
		"\u059e\3\2\2\2\u05ad\u05a3\3\2\2\2\u05ad\u05a6\3\2\2\2\u05ae\u00a3\3\2"+
		"\2\2\u05af\u05b0\5\u00a8U\2\u05b0\u05b1\7V\2\2\u05b1\u05b2\7\u022c\2\2"+
		"\u05b2\u05b3\5\u00a6T\2\u05b3\u05b4\5\u0090I\2\u05b4\u05b5\7\u022f\2\2"+
		"\u05b5\u05b6\bS\1\2\u05b6\u00a5\3\2\2\2\u05b7\u05c6\bT\1\2\u05b8\u05b9"+
		"\bT\1\2\u05b9\u05ba\7X\2\2\u05ba\u05bb\7\23\2\2\u05bb\u05c0\5\u00e8u\2"+
		"\u05bc\u05bd\7\u0220\2\2\u05bd\u05bf\5\u00e8u\2\u05be\u05bc\3\2\2\2\u05bf"+
		"\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c3\3\2"+
		"\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c4\bT\1\2\u05c4\u05c6\3\2\2\2\u05c5"+
		"\u05b7\3\2\2\2\u05c5\u05b8\3\2\2\2\u05c6\u00a7\3\2\2\2\u05c7\u05c8\5\u00dc"+
		"o\2\u05c8\u05c9\bU\1\2\u05c9\u05d2\3\2\2\2\u05ca\u05cb\5\u00aaV\2\u05cb"+
		"\u05cc\bU\1\2\u05cc\u05d2\3\2\2\2\u05cd\u05ce\t\6\2\2\u05ce\u05cf\5\u00ac"+
		"W\2\u05cf\u05d0\bU\1\2\u05d0\u05d2\3\2\2\2\u05d1\u05c7\3\2\2\2\u05d1\u05ca"+
		"\3\2\2\2\u05d1\u05cd\3\2\2\2\u05d2\u00a9\3\2\2\2\u05d3\u05d4\t\7\2\2\u05d4"+
		"\u05d5\7\u022c\2\2\u05d5\u05d6\7\u022f\2\2\u05d6\u05d7\bV\1\2\u05d7\u00ab"+
		"\3\2\2\2\u05d8\u05d9\bW\1\2\u05d9\u05da\7\u022c\2\2\u05da\u05df\5\u00ae"+
		"X\2\u05db\u05dc\7\u0220\2\2\u05dc\u05de\5\u00aeX\2\u05dd\u05db\3\2\2\2"+
		"\u05de\u05e1\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e2"+
		"\3\2\2\2\u05e1\u05df\3\2\2\2\u05e2\u05e3\7\u022f\2\2\u05e3\u05e4\bW\1"+
		"\2\u05e4\u00ad\3\2\2\2\u05e5\u05e6\5\u00be`\2\u05e6\u05e7\bX\1\2\u05e7"+
		"\u05ee\3\2\2\2\u05e8\u05e9\7\u022c\2\2\u05e9\u05ea\5\u00aeX\2\u05ea\u05eb"+
		"\7\u022f\2\2\u05eb\u05ec\bX\1\2\u05ec\u05ee\3\2\2\2\u05ed\u05e5\3\2\2"+
		"\2\u05ed\u05e8\3\2\2\2\u05ee\u00af\3\2\2\2\u05ef\u05f0\bY\1\2\u05f0\u05f1"+
		"\5\u00c2b\2\u05f1\u05f2\bY\1\2\u05f2\u05fa\3\2\2\2\u05f3\u05f4\f\3\2\2"+
		"\u05f4\u05f5\t\b\2\2\u05f5\u05f6\5\u00c2b\2\u05f6\u05f7\bY\1\2\u05f7\u05f9"+
		"\3\2\2\2\u05f8\u05f3\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa"+
		"\u05fb\3\2\2\2\u05fb\u00b1\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fd\u05fe\bZ"+
		"\1\2\u05fe\u0604\5\u00b0Y\2\u05ff\u0600\5\u00b4[\2\u0600\u0601\5\u00b0"+
		"Y\2\u0601\u0603\3\2\2\2\u0602\u05ff\3\2\2\2\u0603\u0606\3\2\2\2\u0604"+
		"\u0602\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0607\3\2\2\2\u0606\u0604\3\2"+
		"\2\2\u0607\u0608\bZ\1\2\u0608\u00b3\3\2\2\2\u0609\u060a\7\u021a\2\2\u060a"+
		"\u060e\b[\1\2\u060b\u060c\7\u021b\2\2\u060c\u060e\b[\1\2\u060d\u0609\3"+
		"\2\2\2\u060d\u060b\3\2\2\2\u060e\u00b5\3\2\2\2\u060f\u0610\b\\\1\2\u0610"+
		"\u0616\5\u00b2Z\2\u0611\u0612\5\u00b8]\2\u0612\u0613\5\u00b2Z\2\u0613"+
		"\u0615\3\2\2\2\u0614\u0611\3\2\2\2\u0615\u0618\3\2\2\2\u0616\u0614\3\2"+
		"\2\2\u0616\u0617\3\2\2\2\u0617\u0619\3\2\2\2\u0618\u0616\3\2\2\2\u0619"+
		"\u061a\b\\\1\2\u061a\u00b7\3\2\2\2\u061b\u061c\7\u0232\2\2\u061c\u0624"+
		"\b]\1\2\u061d\u061e\7\u0233\2\2\u061e\u0624\b]\1\2\u061f\u0620\7\u0234"+
		"\2\2\u0620\u0624\b]\1\2\u0621\u0622\7\u0235\2\2\u0622\u0624\b]\1\2\u0623"+
		"\u061b\3\2\2\2\u0623\u061d\3\2\2\2\u0623\u061f\3\2\2\2\u0623\u0621\3\2"+
		"\2\2\u0624\u00b9\3\2\2\2\u0625\u0626\b^\1\2\u0626\u062c\5\u00b6\\\2\u0627"+
		"\u0628\5\u00bc_\2\u0628\u0629\5\u00b6\\\2\u0629\u062b\3\2\2\2\u062a\u0627"+
		"\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062d\3\2\2\2\u062d"+
		"\u062f\3\2\2\2\u062e\u062c\3\2\2\2\u062f\u0630\b^\1\2\u0630\u0663\3\2"+
		"\2\2\u0631\u0632\5\u00b6\\\2\u0632\u0633\5\u00f6|\2\u0633\u0634\7\7\2"+
		"\2\u0634\u0635\b^\1\2\u0635\u0663\3\2\2\2\u0636\u0637\5\u00b6\\\2\u0637"+
		"\u0638\5\u00f6|\2\u0638\u0639\7\6\2\2\u0639\u063a\b^\1\2\u063a\u0663\3"+
		"\2\2\2\u063b\u063c\5\u00b6\\\2\u063c\u063d\7\16\2\2\u063d\u063e\5\u00b6"+
		"\\\2\u063e\u063f\7\n\2\2\u063f\u0640\5\u00b6\\\2\u0640\u0641\b^\1\2\u0641"+
		"\u0663\3\2\2\2\u0642\u0643\5\u00b6\\\2\u0643\u0644\7N\2\2\u0644\u0645"+
		"\7\16\2\2\u0645\u0646\5\u00b6\\\2\u0646\u0647\7\n\2\2\u0647\u0648\5\u00b6"+
		"\\\2\u0648\u0649\b^\1\2\u0649\u0663\3\2\2\2\u064a\u064b\5\u00b6\\\2\u064b"+
		"\u064c\5\u00fa~\2\u064c\u064d\5\u00acW\2\u064d\u064e\b^\1\2\u064e\u0663"+
		"\3\2\2\2\u064f\u0650\5\u00b6\\\2\u0650\u0651\5\u00fa~\2\u0651\u0652\7"+
		"\u022c\2\2\u0652\u0653\5~@\2\u0653\u0654\7\u022f\2\2\u0654\u0655\b^\1"+
		"\2\u0655\u0663\3\2\2\2\u0656\u0657\5\u00b6\\\2\u0657\u0658\5\u00fc\177"+
		"\2\u0658\u0659\7\u022c\2\2\u0659\u065a\5~@\2\u065a\u065b\7\u022f\2\2\u065b"+
		"\u065c\b^\1\2\u065c\u0663\3\2\2\2\u065d\u065e\5\u00b6\\\2\u065e\u065f"+
		"\5\u00f8}\2\u065f\u0660\5\u00b6\\\2\u0660\u0661\b^\1\2\u0661\u0663\3\2"+
		"\2\2\u0662\u0625\3\2\2\2\u0662\u0631\3\2\2\2\u0662\u0636\3\2\2\2\u0662"+
		"\u063b\3\2\2\2\u0662\u0642\3\2\2\2\u0662\u064a\3\2\2\2\u0662\u064f\3\2"+
		"\2\2\u0662\u0656\3\2\2\2\u0662\u065d\3\2\2\2\u0663\u00bb\3\2\2\2\u0664"+
		"\u0665\7\u0229\2\2\u0665\u0675\b_\1\2\u0666\u0667\7\u022a\2\2\u0667\u0675"+
		"\b_\1\2\u0668\u0669\7\u0227\2\2\u0669\u0675\b_\1\2\u066a\u066b\7\u0228"+
		"\2\2\u066b\u0675\b_\1\2\u066c\u066d\7\u0224\2\2\u066d\u0675\b_\1\2\u066e"+
		"\u066f\7\u0223\2\2\u066f\u0675\b_\1\2\u0670\u0671\7\u0225\2\2\u0671\u0675"+
		"\b_\1\2\u0672\u0673\7\u0226\2\2\u0673\u0675\b_\1\2\u0674\u0664\3\2\2\2"+
		"\u0674\u0666\3\2\2\2\u0674\u0668\3\2\2\2\u0674\u066a\3\2\2\2\u0674\u066c"+
		"\3\2\2\2\u0674\u066e\3\2\2\2\u0674\u0670\3\2\2\2\u0674\u0672\3\2\2\2\u0675"+
		"\u00bd\3\2\2\2\u0676\u0677\b`\1\2\u0677\u067d\5\u00ba^\2\u0678\u0679\5"+
		"\u00c0a\2\u0679\u067a\5\u00ba^\2\u067a\u067c\3\2\2\2\u067b\u0678\3\2\2"+
		"\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680"+
		"\3\2\2\2\u067f\u067d\3\2\2\2\u0680\u0681\b`\1\2\u0681\u00bf\3\2\2\2\u0682"+
		"\u0683\7\n\2\2\u0683\u068a\ba\1\2\u0684\u0685\7R\2\2\u0685\u068a\ba\1"+
		"\2\u0686\u0687\5\u00f8}\2\u0687\u0688\ba\1\2\u0688\u068a\3\2\2\2\u0689"+
		"\u0682\3\2\2\2\u0689\u0684\3\2\2\2\u0689\u0686\3\2\2\2\u068a\u00c1\3\2"+
		"\2\2\u068b\u068c\5\u00e6t\2\u068c\u068d\bb\1\2\u068d\u06bc\3\2\2\2\u068e"+
		"\u068f\5\u00e8u\2\u068f\u0690\bb\1\2\u0690\u06bc\3\2\2\2\u0691\u0692\5"+
		"\u00fe\u0080\2\u0692\u0693\5\u00c2b\2\u0693\u0694\bb\1\2\u0694\u06bc\3"+
		"\2\2\2\u0695\u0696\7\u022c\2\2\u0696\u0697\5\u00c2b\2\u0697\u0698\7\u022f"+
		"\2\2\u0698\u0699\bb\1\2\u0699\u06bc\3\2\2\2\u069a\u069b\5\u00dan\2\u069b"+
		"\u069c\bb\1\2\u069c\u06bc\3\2\2\2\u069d\u069e\5\u00e2r\2\u069e\u069f\b"+
		"b\1\2\u069f\u06bc\3\2\2\2\u06a0\u06a1\5\u00d8m\2\u06a1\u06a2\bb\1\2\u06a2"+
		"\u06bc\3\2\2\2\u06a3\u06a4\5\u00d6l\2\u06a4\u06a5\bb\1\2\u06a5\u06bc\3"+
		"\2\2\2\u06a6\u06a7\5\u00ceh\2\u06a7\u06a8\bb\1\2\u06a8\u06bc\3\2\2\2\u06a9"+
		"\u06aa\5\u00d2j\2\u06aa\u06ab\bb\1\2\u06ab\u06bc\3\2\2\2\u06ac\u06ad\5"+
		"\u00d0i\2\u06ad\u06ae\bb\1\2\u06ae\u06bc\3\2\2\2\u06af\u06b0\5\u00dep"+
		"\2\u06b0\u06b1\bb\1\2\u06b1\u06bc\3\2\2\2\u06b2\u06b3\5\u00e4s\2\u06b3"+
		"\u06b4\bb\1\2\u06b4\u06bc\3\2\2\2\u06b5\u06b6\5\u00c4c\2\u06b6\u06b7\b"+
		"b\1\2\u06b7\u06bc\3\2\2\2\u06b8\u06b9\5 \21\2\u06b9\u06ba\bb\1\2\u06ba"+
		"\u06bc\3\2\2\2\u06bb\u068b\3\2\2\2\u06bb\u068e\3\2\2\2\u06bb\u0691\3\2"+
		"\2\2\u06bb\u0695\3\2\2\2\u06bb\u069a\3\2\2\2\u06bb\u069d\3\2\2\2\u06bb"+
		"\u06a0\3\2\2\2\u06bb\u06a3\3\2\2\2\u06bb\u06a6\3\2\2\2\u06bb\u06a9\3\2"+
		"\2\2\u06bb\u06ac\3\2\2\2\u06bb\u06af\3\2\2\2\u06bb\u06b2\3\2\2\2\u06bb"+
		"\u06b5\3\2\2\2\u06bb\u06b8\3\2\2\2\u06bc\u00c3\3\2\2\2\u06bd\u06be\5\u00c6"+
		"d\2\u06be\u06bf\bc\1\2\u06bf\u06e6\3\2\2\2\u06c0\u06c1\5\u00c8e\2\u06c1"+
		"\u06c2\bc\1\2\u06c2\u06e6\3\2\2\2\u06c3\u06c4\5\u00caf\2\u06c4\u06c5\b"+
		"c\1\2\u06c5\u06e6\3\2\2\2\u06c6\u06c7\5\u00ccg\2\u06c7\u06c8\bc\1\2\u06c8"+
		"\u06e6\3\2\2\2\u06c9\u06ca\5\u00e8u\2\u06ca\u06cb\7\u022d\2\2\u06cb\u06cc"+
		"\5\u00aeX\2\u06cc\u06cd\7\u0230\2\2\u06cd\u06ce\bc\1\2\u06ce\u06e6\3\2"+
		"\2\2\u06cf\u06d0\5\u00c6d\2\u06d0\u06d1\7\u022d\2\2\u06d1\u06d2\5\u00ae"+
		"X\2\u06d2\u06d3\7\u0230\2\2\u06d3\u06d4\bc\1\2\u06d4\u06e6\3\2\2\2\u06d5"+
		"\u06d6\5\u00c8e\2\u06d6\u06d7\7\u022d\2\2\u06d7\u06d8\5\u00aeX\2\u06d8"+
		"\u06d9\7\u0230\2\2\u06d9\u06da\bc\1\2\u06da\u06e6\3\2\2\2\u06db\u06dc"+
		"\5\u00e8u\2\u06dc\u06dd\7\4\2\2\u06dd\u06de\5\u00aeX\2\u06de\u06df\bc"+
		"\1\2\u06df\u06e6\3\2\2\2\u06e0\u06e1\5\u00caf\2\u06e1\u06e2\7\4\2\2\u06e2"+
		"\u06e3\5\u00aeX\2\u06e3\u06e4\bc\1\2\u06e4\u06e6\3\2\2\2\u06e5\u06bd\3"+
		"\2\2\2\u06e5\u06c0\3\2\2\2\u06e5\u06c3\3\2\2\2\u06e5\u06c6\3\2\2\2\u06e5"+
		"\u06c9\3\2\2\2\u06e5\u06cf\3\2\2\2\u06e5\u06d5\3\2\2\2\u06e5\u06db\3\2"+
		"\2\2\u06e5\u06e0\3\2\2\2\u06e6\u00c5\3\2\2\2\u06e7\u06e8\bd\1\2\u06e8"+
		"\u06e9\7\13\2\2\u06e9\u06ea\7\u022c\2\2\u06ea\u06ef\5\u00aeX\2\u06eb\u06ec"+
		"\7\u0220\2\2\u06ec\u06ee\5\u00aeX\2\u06ed\u06eb\3\2\2\2\u06ee\u06f1\3"+
		"\2\2\2\u06ef\u06ed\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f2\3\2\2\2\u06f1"+
		"\u06ef\3\2\2\2\u06f2\u06f3\7\u022f\2\2\u06f3\u06f4\bd\1\2\u06f4\u00c7"+
		"\3\2\2\2\u06f5\u06f6\be\1\2\u06f6\u06f7\7K\2\2\u06f7\u06f8\7\u022c\2\2"+
		"\u06f8\u06f9\5\u00aeX\2\u06f9\u06fa\7\u0220\2\2\u06fa\u0702\5\u00aeX\2"+
		"\u06fb\u06fc\7\u0220\2\2\u06fc\u06fd\5\u00aeX\2\u06fd\u06fe\7\u0220\2"+
		"\2\u06fe\u06ff\5\u00aeX\2\u06ff\u0701\3\2\2\2\u0700\u06fb\3\2\2\2\u0701"+
		"\u0704\3\2\2\2\u0702\u0700\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0705\3\2"+
		"\2\2\u0704\u0702\3\2\2\2\u0705\u0706\7\u022f\2\2\u0706\u0707\be\1\2\u0707"+
		"\u00c9\3\2\2\2\u0708\u0709\bf\1\2\u0709\u070a\7\u0110\2\2\u070a\u070b"+
		"\7\u022c\2\2\u070b\u0710\5\u00aeX\2\u070c\u070d\7\u0220\2\2\u070d\u070f"+
		"\5\u00aeX\2\u070e\u070c\3\2\2\2\u070f\u0712\3\2\2\2\u0710\u070e\3\2\2"+
		"\2\u0710\u0711\3\2\2\2\u0711\u0713\3\2\2\2\u0712\u0710\3\2\2\2\u0713\u0714"+
		"\7\u022f\2\2\u0714\u0715\bf\1\2\u0715\u00cb\3\2\2\2\u0716\u0717\bg\1\2"+
		"\u0717\u0718\7\u0206\2\2\u0718\u0719\7\u022c\2\2\u0719\u071a\5\u00aeX"+
		"\2\u071a\u071b\7\u0220\2\2\u071b\u0723\5\u00aeX\2\u071c\u071d\7\u0220"+
		"\2\2\u071d\u071e\5\u00aeX\2\u071e\u071f\7\u0220\2\2\u071f\u0720\5\u00ae"+
		"X\2\u0720\u0722\3\2\2\2\u0721\u071c\3\2\2\2\u0722\u0725\3\2\2\2\u0723"+
		"\u0721\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0726\3\2\2\2\u0725\u0723\3\2"+
		"\2\2\u0726\u0727\7\u022f\2\2\u0727\u0728\bg\1\2\u0728\u00cd\3\2\2\2\u0729"+
		"\u072a\7\u014e\2\2\u072a\u072b\7\u022c\2\2\u072b\u072c\5\u00aeX\2\u072c"+
		"\u072d\7\u022f\2\2\u072d\u072e\bh\1\2\u072e\u092b\3\2\2\2\u072f\u0730"+
		"\7\u01c5\2\2\u0730\u0731\7\u022c\2\2\u0731\u0732\5\u00aeX\2\u0732\u0733"+
		"\7\u022f\2\2\u0733\u0734\bh\1\2\u0734\u092b\3\2\2\2\u0735\u0736\7\u0197"+
		"\2\2\u0736\u0737\7\u022c\2\2\u0737\u0738\5\u00aeX\2\u0738\u0739\7\u022f"+
		"\2\2\u0739\u073a\bh\1\2\u073a\u092b\3\2\2\2\u073b\u073c\7\u018f\2\2\u073c"+
		"\u073d\7\u022c\2\2\u073d\u073e\5\u00aeX\2\u073e\u073f\7\u022f\2\2\u073f"+
		"\u0740\bh\1\2\u0740\u092b\3\2\2\2\u0741\u0742\bh\1\2\u0742\u0743\7\u017d"+
		"\2\2\u0743\u0744\7\u022c\2\2\u0744\u0747\5\u00aeX\2\u0745\u0746\7\u0220"+
		"\2\2\u0746\u0748\5\u00aeX\2\u0747\u0745\3\2\2\2\u0748\u0749\3\2\2\2\u0749"+
		"\u0747\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074c\7\u022f"+
		"\2\2\u074c\u074d\bh\1\2\u074d\u092b\3\2\2\2\u074e\u074f\bh\1\2\u074f\u0750"+
		"\7\u01a6\2\2\u0750\u0751\7\u022c\2\2\u0751\u0752\5\u00aeX\2\u0752\u0753"+
		"\7\u0220\2\2\u0753\u0756\5\u00aeX\2\u0754\u0755\7\u0220\2\2\u0755\u0757"+
		"\5\u00aeX\2\u0756\u0754\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u0756\3\2\2"+
		"\2\u0758\u0759\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u075b\7\u022f\2\2\u075b"+
		"\u075c\bh\1\2\u075c\u092b\3\2\2\2\u075d\u075e\7\u01b6\2\2\u075e\u075f"+
		"\7\u022c\2\2\u075f\u0760\5\u00aeX\2\u0760\u0761\7\u0220\2\2\u0761\u0762"+
		"\5\u00aeX\2\u0762\u0763\7\u022f\2\2\u0763\u0764\bh\1\2\u0764\u092b\3\2"+
		"\2\2\u0765\u0766\bh\1\2\u0766\u0767\7\u01a7\2\2\u0767\u0768\7\u022c\2"+
		"\2\u0768\u0769\5\u00aeX\2\u0769\u076a\7\u0220\2\2\u076a\u076f\5\u00ae"+
		"X\2\u076b\u076c\7\u0220\2\2\u076c\u076e\5\u00aeX\2\u076d\u076b\3\2\2\2"+
		"\u076e\u0771\3\2\2\2\u076f\u076d\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0772"+
		"\3\2\2\2\u0771\u076f\3\2\2\2\u0772\u0773\7\u022f\2\2\u0773\u0774\bh\1"+
		"\2\u0774\u092b\3\2\2\2\u0775\u0776\7\u01be\2\2\u0776\u0777\7\u022c\2\2"+
		"\u0777\u0778\5\u00aeX\2\u0778\u0779\7\u0220\2\2\u0779\u077a\5\u00aeX\2"+
		"\u077a\u077b\7\u022f\2\2\u077b\u077c\bh\1\2\u077c\u092b\3\2\2\2\u077d"+
		"\u077e\bh\1\2\u077e\u077f\7\u0173\2\2\u077f\u0780\7\u022c\2\2\u0780\u0781"+
		"\5\u00aeX\2\u0781\u0782\7\u0220\2\2\u0782\u0787\5\u00aeX\2\u0783\u0784"+
		"\7\u0220\2\2\u0784\u0786\5\u00aeX\2\u0785\u0783\3\2\2\2\u0786\u0789\3"+
		"\2\2\2\u0787\u0785\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u078a\3\2\2\2\u0789"+
		"\u0787\3\2\2\2\u078a\u078b\7\u022f\2\2\u078b\u078c\bh\1\2\u078c\u092b"+
		"\3\2\2\2\u078d\u078e\7\u0203\2\2\u078e\u078f\7\u022c\2\2\u078f\u0790\5"+
		"\u00aeX\2\u0790\u0791\7\u0220\2\2\u0791\u0792\5\u00aeX\2\u0792\u0793\7"+
		"\u022f\2\2\u0793\u0794\bh\1\2\u0794\u092b\3\2\2\2\u0795\u0796\7\u01f1"+
		"\2\2\u0796\u0797\7\u022c\2\2\u0797\u0798\5\u00aeX\2\u0798\u0799\7\u0220"+
		"\2\2\u0799\u079a\5\u00aeX\2\u079a\u079b\7\u022f\2\2\u079b\u079c\bh\1\2"+
		"\u079c\u092b\3\2\2\2\u079d\u079e\7\u0204\2\2\u079e\u079f\7\u022c\2\2\u079f"+
		"\u07a0\5\u00aeX\2\u07a0\u07a1\7\u0220\2\2\u07a1\u07a2\5\u00aeX\2\u07a2"+
		"\u07a3\7\u022f\2\2\u07a3\u07a4\bh\1\2\u07a4\u092b\3\2\2\2\u07a5\u07a6"+
		"\7\u015d\2\2\u07a6\u07a7\7\u022c\2\2\u07a7\u07a8\5\u00aeX\2\u07a8\u07a9"+
		"\7\u0220\2\2\u07a9\u07aa\5\u00aeX\2\u07aa\u07ab\7\u022f\2\2\u07ab\u07ac"+
		"\bh\1\2\u07ac\u092b\3\2\2\2\u07ad\u07ae\7\u0205\2\2\u07ae\u07af\7\u022c"+
		"\2\2\u07af\u07b0\5\u00aeX\2\u07b0\u07b1\7\u0220\2\2\u07b1\u07b2\5\u00ae"+
		"X";
	private static final String _serializedATNSegment1 =
		"\2\u07b2\u07b3\7\u022f\2\2\u07b3\u07b4\bh\1\2\u07b4\u092b\3\2\2\2\u07b5"+
		"\u07b6\7\u019f\2\2\u07b6\u07b7\7\u022c\2\2\u07b7\u07b8\5\u00aeX\2\u07b8"+
		"\u07b9\7\u022f\2\2\u07b9\u07ba\bh\1\2\u07ba\u092b\3\2\2\2\u07bb\u07bc"+
		"\7\u01f2\2\2\u07bc\u07bd\7\u022c\2\2\u07bd\u07be\5\u00aeX\2\u07be\u07bf"+
		"\7\u0220\2\2\u07bf\u07c0\5\u00aeX\2\u07c0\u07c1\7\u022f\2\2\u07c1\u07c2"+
		"\bh\1\2\u07c2\u092b\3\2\2\2\u07c3\u07c4\7\u01f2\2\2\u07c4\u07c5\7\u022c"+
		"\2\2\u07c5\u07c6\5\u00aeX\2\u07c6\u07c7\7\u0220\2\2\u07c7\u07c8\5\u00ae"+
		"X\2\u07c8\u07c9\7\u0220\2\2\u07c9\u07ca\5\u00aeX\2\u07ca\u07cb\7\u022f"+
		"\2\2\u07cb\u07cc\bh\1\2\u07cc\u092b\3\2\2\2\u07cd\u07ce\t\t\2\2\u07ce"+
		"\u07cf\7\u022c\2\2\u07cf\u07d0\5\u00aeX\2\u07d0\u07d1\7\u022f\2\2\u07d1"+
		"\u07d2\bh\1\2\u07d2\u092b\3\2\2\2\u07d3\u07d4\7\u0149\2\2\u07d4\u07d5"+
		"\7\u022c\2\2\u07d5\u07d6\5\u00aeX\2\u07d6\u07d7\7\u0220\2\2\u07d7\u07d8"+
		"\5\u00aeX\2\u07d8\u07d9\7\u0220\2\2\u07d9\u07da\5\u00aeX\2\u07da\u07db"+
		"\7\u022f\2\2\u07db\u07dc\bh\1\2\u07dc\u092b\3\2\2\2\u07dd\u07de\7\u0177"+
		"\2\2\u07de\u07df\7\u022c\2\2\u07df\u07e0\5\u00aeX\2\u07e0\u07e1\7\u022f"+
		"\2\2\u07e1\u07e2\bh\1\2\u07e2\u092b\3\2\2\2\u07e3\u07e4\7\u0171\2\2\u07e4"+
		"\u07e5\7\u022c\2\2\u07e5\u07e6\5\u00aeX\2\u07e6\u07e7\7\u022f\2\2\u07e7"+
		"\u07e8\bh\1\2\u07e8\u092b\3\2\2\2\u07e9\u07ea\7\u0182\2\2\u07ea\u07eb"+
		"\7\u022c\2\2\u07eb\u07ec\5\u00aeX\2\u07ec\u07ed\7\u0220\2\2\u07ed\u07ee"+
		"\5\u00aeX\2\u07ee\u07ef\7\u022f\2\2\u07ef\u07f0\bh\1\2\u07f0\u092b\3\2"+
		"\2\2\u07f1\u07f2\7\u0182\2\2\u07f2\u07f3\7\u022c\2\2\u07f3\u07f4\5\u00ae"+
		"X\2\u07f4\u07f5\7\u0220\2\2\u07f5\u07f6\5\u00aeX\2\u07f6\u07f7\7\u0220"+
		"\2\2\u07f7\u07f8\5\u00aeX\2\u07f8\u07f9\7\u022f\2\2\u07f9\u07fa\bh\1\2"+
		"\u07fa\u092b\3\2\2\2\u07fb\u07fc\bh\1\2\u07fc\u07fd\7\u017a\2\2\u07fd"+
		"\u07fe\7\u022c\2\2\u07fe\u07ff\5\u00aeX\2\u07ff\u0800\7\u0220\2\2\u0800"+
		"\u0803\5\u00aeX\2\u0801\u0802\7\u0220\2\2\u0802\u0804\5\u00aeX\2\u0803"+
		"\u0801\3\2\2\2\u0804\u0805\3\2\2\2\u0805\u0803\3\2\2\2\u0805\u0806\3\2"+
		"\2\2\u0806\u0807\3\2\2\2\u0807\u0808\7\u022f\2\2\u0808\u0809\bh\1\2\u0809"+
		"\u092b\3\2\2\2\u080a\u080b\7\u01f8\2\2\u080b\u080c\7\u022c\2\2\u080c\u080d"+
		"\5\u00aeX\2\u080d\u080e\7\u022f\2\2\u080e\u080f\bh\1\2\u080f\u092b\3\2"+
		"\2\2\u0810\u0811\7\u01c7\2\2\u0811\u0812\7\u022c\2\2\u0812\u0813\5\u00ae"+
		"X\2\u0813\u0814\7\u0220\2\2\u0814\u0815\5\u00aeX\2\u0815\u0816\7\u0220"+
		"\2\2\u0816\u0817\5\u00aeX\2\u0817\u0818\7\u022f\2\2\u0818\u0819\bh\1\2"+
		"\u0819\u092b\3\2\2\2\u081a\u081b\7\u014d\2\2\u081b\u081c\7\u022c\2\2\u081c"+
		"\u081d\5\u00aeX\2\u081d\u081e\7\u0220\2\2\u081e\u081f\5\u00aeX\2\u081f"+
		"\u0820\7\u0220\2\2\u0820\u0821\5\u00aeX\2\u0821\u0822\7\u022f\2\2\u0822"+
		"\u0823\bh\1\2\u0823\u092b\3\2\2\2\u0824\u0825\7\u0153\2\2\u0825\u0826"+
		"\7\u022c\2\2\u0826\u0827\5\u00aeX\2\u0827\u0828\7\u0220\2\2\u0828\u0829"+
		"\5\u00aeX\2\u0829\u082a\7\u022f\2\2\u082a\u082b\bh\1\2\u082b\u092b\3\2"+
		"\2\2\u082c\u082d\7\u00f7\2\2\u082d\u082e\7\u022c\2\2\u082e\u082f\5\u00ae"+
		"X\2\u082f\u0830\7\u0220\2\2\u0830\u0831\5\u00aeX\2\u0831\u0832\7\u0220"+
		"\2\2\u0832\u0833\5\u00aeX\2\u0833\u0834\7\u022f\2\2\u0834\u0835\bh\1\2"+
		"\u0835\u092b\3\2\2\2\u0836\u0837\7\u0167\2\2\u0837\u0838\7\u022c\2\2\u0838"+
		"\u0839\5\u00aeX\2\u0839\u083a\7\u022f\2\2\u083a\u083b\bh\1\2\u083b\u092b"+
		"\3\2\2\2\u083c\u083d\7\u01e1\2\2\u083d\u083e\7\u022c\2\2\u083e\u083f\5"+
		"\u00aeX\2\u083f\u0840\7\u0220\2\2\u0840\u0841\5\u00aeX\2\u0841\u0842\7"+
		"\u0220\2\2\u0842\u0843\5\u00aeX\2\u0843\u0844\7\u022f\2\2\u0844\u0845"+
		"\bh\1\2\u0845\u092b\3\2\2\2\u0846\u0847\7\u0176\2\2\u0847\u0848\7\u022c"+
		"\2\2\u0848\u0849\5\u00aeX\2\u0849\u084a\7\u022f\2\2\u084a\u084b\bh\1\2"+
		"\u084b\u092b\3\2\2\2\u084c\u084d\7\u01d9\2\2\u084d\u084e\7\u022c\2\2\u084e"+
		"\u084f\5\u00aeX\2\u084f\u0850\7\u0220\2\2\u0850\u0851\5\u00aeX\2\u0851"+
		"\u0852\7\u0220\2\2\u0852\u0853\5\u00aeX\2\u0853\u0854\7\u022f\2\2\u0854"+
		"\u0855\bh\1\2\u0855\u092b\3\2\2\2\u0856\u0857\7\u01c1\2\2\u0857\u0858"+
		"\7\u022c\2\2\u0858\u0859\5\u00aeX\2\u0859\u085a\7\u022f\2\2\u085a\u085b"+
		"\bh\1\2\u085b\u092b\3\2\2\2\u085c\u085d\7\u01c4\2\2\u085d\u085e\7\u022c"+
		"\2\2\u085e\u085f\5\u00aeX\2\u085f\u0860\7\u0220\2\2\u0860\u0861\5\u00ae"+
		"X\2\u0861\u0862\7\u022f\2\2\u0862\u0863\bh\1\2\u0863\u092b\3\2\2\2\u0864"+
		"\u0865\7\u0159\2\2\u0865\u0866\7\u022c\2\2\u0866\u0867\5\u00aeX\2\u0867"+
		"\u0868\7\u022f\2\2\u0868\u0869\bh\1\2\u0869\u092b\3\2\2\2\u086a\u086b"+
		"\7\u0159\2\2\u086b\u086c\7\u022c\2\2\u086c\u086d\5\u00aeX\2\u086d\u086e"+
		"\7\u0220\2\2\u086e\u086f\5\u00aeX\2\u086f\u0870\7\u022f\2\2\u0870\u0871"+
		"\bh\1\2\u0871\u092b\3\2\2\2\u0872\u0873\7\u0159\2\2\u0873\u0874\7\u022c"+
		"\2\2\u0874\u0875\5\u00aeX\2\u0875\u0876\7\u0220\2\2\u0876\u0877\5\u00ae"+
		"X\2\u0877\u0878\7\u0220\2\2\u0878\u0879\5\u00aeX\2\u0879\u087a\7\u022f"+
		"\2\2\u087a\u087b\bh\1\2\u087b\u092b\3\2\2\2\u087c\u087d\t\n\2\2\u087d"+
		"\u087e\7\u022c\2\2\u087e\u087f\5\u00aeX\2\u087f\u0880\7\u0220\2\2\u0880"+
		"\u0881\5\u00aeX\2\u0881\u0882\7\u022f\2\2\u0882\u0883\bh\1\2\u0883\u092b"+
		"\3\2\2\2\u0884\u0885\t\n\2\2\u0885\u0886\7\u022c\2\2\u0886\u0887\5\u00ae"+
		"X\2\u0887\u0888\7\u0220\2\2\u0888\u0889\5\u00aeX\2\u0889\u088a\7\u0220"+
		"\2\2\u088a\u088b\5\u00aeX\2\u088b\u088c\7\u022f\2\2\u088c\u088d\bh\1\2"+
		"\u088d\u092b\3\2\2\2\u088e\u088f\7\u0198\2\2\u088f\u0890\7\u022c\2\2\u0890"+
		"\u0891\5\u00aeX\2\u0891\u0892\7\u0220\2\2\u0892\u0893\5\u00aeX\2\u0893"+
		"\u0894\7\u0220\2\2\u0894\u0895\5\u00aeX\2\u0895\u0896\7\u022f\2\2\u0896"+
		"\u0897\bh\1\2\u0897\u092b\3\2\2\2\u0898\u0899\7\u0199\2\2\u0899\u089a"+
		"\7\u022c\2\2\u089a\u089b\5\u00aeX\2\u089b\u089c\7\u0220\2\2\u089c\u089d"+
		"\5\u00aeX\2\u089d\u089e\7\u0220\2\2\u089e\u089f\5\u00aeX\2\u089f\u08a0"+
		"\7\u022f\2\2\u08a0\u08a1\bh\1\2\u08a1\u092b\3\2\2\2\u08a2\u08a3\7\u01ea"+
		"\2\2\u08a3\u08a4\7\u022c\2\2\u08a4\u08a5\5\u00aeX\2\u08a5\u08a6\7\u022f"+
		"\2\2\u08a6\u08a7\bh\1\2\u08a7\u092b\3\2\2\2\u08a8\u08a9\7\u015b\2\2\u08a9"+
		"\u08aa\7\u022c\2\2\u08aa\u08ab\5\u00aeX\2\u08ab\u08ac\7\u022f\2\2\u08ac"+
		"\u08ad\bh\1\2\u08ad\u092b\3\2\2\2\u08ae\u08af\t\13\2\2\u08af\u08b0\7\u022c"+
		"\2\2\u08b0\u08b1\5\u00aeX\2\u08b1\u08b2\7\u022f\2\2\u08b2\u08b3\bh\1\2"+
		"\u08b3\u092b\3\2\2\2\u08b4\u08b5\7\u0193\2\2\u08b5\u08b6\7\u022c\2\2\u08b6"+
		"\u08b7\5\u00aeX\2\u08b7\u08b8\7\u022f\2\2\u08b8\u08b9\bh\1\2\u08b9\u092b"+
		"\3\2\2\2\u08ba\u08bb\7\u019a\2\2\u08bb\u08bc\7\u022c\2\2\u08bc\u08bd\5"+
		"\u00aeX\2\u08bd\u08be\7\u0220\2\2\u08be\u08bf\5\u00aeX\2\u08bf\u08c0\7"+
		"\u022f\2\2\u08c0\u08c1\bh\1\2\u08c1\u092b\3\2\2\2\u08c2\u08c3\7\u01db"+
		"\2\2\u08c3\u08c4\7\u022c\2\2\u08c4\u08c5\5\u00aeX\2\u08c5\u08c6\7\u022f"+
		"\2\2\u08c6\u08c7\bh\1\2\u08c7\u092b\3\2\2\2\u08c8\u08c9\7\u01ec\2\2\u08c9"+
		"\u08ca\7\u022c\2\2\u08ca\u08cb\5\u00aeX\2\u08cb\u08cc\7\u022f\2\2\u08cc"+
		"\u08cd\bh\1\2\u08cd\u092b\3\2\2\2\u08ce\u08cf\7\u01ec\2\2\u08cf\u08d0"+
		"\7\u022c\2\2\u08d0\u08d1\5\u00aeX\2\u08d1\u08d2\7\u0220\2\2\u08d2\u08d3"+
		"\5\u00aeX\2\u08d3\u08d4\7\u022f\2\2\u08d4\u08d5\bh\1\2\u08d5\u092b\3\2"+
		"\2\2\u08d6\u08d7\7\u01ec\2\2\u08d7\u08d8\7\u022c\2\2\u08d8\u08d9\5\u00ae"+
		"X\2\u08d9\u08da\7\u0220\2\2\u08da\u08db\5\u00aeX\2\u08db\u08dc\7\u0220"+
		"\2\2\u08dc\u08dd\5\u00aeX\2\u08dd\u08de\7\u022f\2\2\u08de\u08df\bh\1\2"+
		"\u08df\u092b\3\2\2\2\u08e0\u08e1\7\u01ec\2\2\u08e1\u08e2\7\u022c\2\2\u08e2"+
		"\u08e3\5\u00aeX\2\u08e3\u08e4\7\u0220\2\2\u08e4\u08e5\5\u00aeX\2\u08e5"+
		"\u08e6\7\u0220\2\2\u08e6\u08e7\5\u00aeX\2\u08e7\u08e8\7\u0220\2\2\u08e8"+
		"\u08e9\5\u00aeX\2\u08e9\u08ea\7\u022f\2\2\u08ea\u08eb\bh\1\2\u08eb\u092b"+
		"\3\2\2\2\u08ec\u08ed\7\u0166\2\2\u08ed\u08ee\7\u022c\2\2\u08ee\u08ef\5"+
		"\u00aeX\2\u08ef\u08f0\7\u022f\2\2\u08f0\u08f1\bh\1\2\u08f1\u092b\3\2\2"+
		"\2\u08f2\u08f3\7\u0166\2\2\u08f3\u08f4\7\u022c\2\2\u08f4\u08f5\5\u00ae"+
		"X\2\u08f5\u08f6\7\u0220\2\2\u08f6\u08f7\5\u00aeX\2\u08f7\u08f8\7\u022f"+
		"\2\2\u08f8\u08f9\bh\1\2\u08f9\u092b\3\2\2\2\u08fa\u08fb\7\u0164\2\2\u08fb"+
		"\u08fc\7\u022c\2\2\u08fc\u08fd\5\u00aeX\2\u08fd\u08fe\7\u022f\2\2\u08fe"+
		"\u08ff\bh\1\2\u08ff\u092b\3\2\2\2\u0900\u0901\7\u0164\2\2\u0901\u0902"+
		"\7\u022c\2\2\u0902\u0903\5\u00aeX\2\u0903\u0904\7\u0220\2\2\u0904\u0905"+
		"\5\u00aeX\2\u0905\u0906\7\u022f\2\2\u0906\u0907\bh\1\2\u0907\u092b\3\2"+
		"\2\2\u0908\u0909\7\u01da\2\2\u0909\u090a\7\u022c\2\2\u090a\u090b\5\u00ae"+
		"X\2\u090b\u090c\7\u022f\2\2\u090c\u090d\bh\1\2\u090d\u092b\3\2\2\2\u090e"+
		"\u090f\7\u01da\2\2\u090f\u0910\7\u022c\2\2\u0910\u0911\5\u00aeX\2\u0911"+
		"\u0912\7\u0220\2\2\u0912\u0913\5\u00aeX\2\u0913\u0914\7\u022f\2\2\u0914"+
		"\u0915\bh\1\2\u0915\u092b\3\2\2\2\u0916\u0917\7\u01ed\2\2\u0917\u0918"+
		"\7\u022c\2\2\u0918\u0919\5\u00aeX\2\u0919\u091a\7\u022f\2\2\u091a\u091b"+
		"\bh\1\2\u091b\u092b\3\2\2\2\u091c\u091d\7\u01ed\2\2\u091d\u091e\7\u022c"+
		"\2\2\u091e\u091f\5\u00aeX\2\u091f\u0920\7\u0220\2\2\u0920\u0921\5\u00ae"+
		"X\2\u0921\u0922\7\u022f\2\2\u0922\u0923\bh\1\2\u0923\u092b\3\2\2\2\u0924"+
		"\u0925\7\u0157\2\2\u0925\u0926\7\u022c\2\2\u0926\u0927\5\u00aeX\2\u0927"+
		"\u0928\7\u022f\2\2\u0928\u0929\bh\1\2\u0929\u092b\3\2\2\2\u092a\u0729"+
		"\3\2\2\2\u092a\u072f\3\2\2\2\u092a\u0735\3\2\2\2\u092a\u073b\3\2\2\2\u092a"+
		"\u0741\3\2\2\2\u092a\u074e\3\2\2\2\u092a\u075d\3\2\2\2\u092a\u0765\3\2"+
		"\2\2\u092a\u0775\3\2\2\2\u092a\u077d\3\2\2\2\u092a\u078d\3\2\2\2\u092a"+
		"\u0795\3\2\2\2\u092a\u079d\3\2\2\2\u092a\u07a5\3\2\2\2\u092a\u07ad\3\2"+
		"\2\2\u092a\u07b5\3\2\2\2\u092a\u07bb\3\2\2\2\u092a\u07c3\3\2\2\2\u092a"+
		"\u07cd\3\2\2\2\u092a\u07d3\3\2\2\2\u092a\u07dd\3\2\2\2\u092a\u07e3\3\2"+
		"\2\2\u092a\u07e9\3\2\2\2\u092a\u07f1\3\2\2\2\u092a\u07fb\3\2\2\2\u092a"+
		"\u080a\3\2\2\2\u092a\u0810\3\2\2\2\u092a\u081a\3\2\2\2\u092a\u0824\3\2"+
		"\2\2\u092a\u082c\3\2\2\2\u092a\u0836\3\2\2\2\u092a\u083c\3\2\2\2\u092a"+
		"\u0846\3\2\2\2\u092a\u084c\3\2\2\2\u092a\u0856\3\2\2\2\u092a\u085c\3\2"+
		"\2\2\u092a\u0864\3\2\2\2\u092a\u086a\3\2\2\2\u092a\u0872\3\2\2\2\u092a"+
		"\u087c\3\2\2\2\u092a\u0884\3\2\2\2\u092a\u088e\3\2\2\2\u092a\u0898\3\2"+
		"\2\2\u092a\u08a2\3\2\2\2\u092a\u08a8\3\2\2\2\u092a\u08ae\3\2\2\2\u092a"+
		"\u08b4\3\2\2\2\u092a\u08ba\3\2\2\2\u092a\u08c2\3\2\2\2\u092a\u08c8\3\2"+
		"\2\2\u092a\u08ce\3\2\2\2\u092a\u08d6\3\2\2\2\u092a\u08e0\3\2\2\2\u092a"+
		"\u08ec\3\2\2\2\u092a\u08f2\3\2\2\2\u092a\u08fa\3\2\2\2\u092a\u0900\3\2"+
		"\2\2\u092a\u0908\3\2\2\2\u092a\u090e\3\2\2\2\u092a\u0916\3\2\2\2\u092a"+
		"\u091c\3\2\2\2\u092a\u0924\3\2\2\2\u092b\u00cf\3\2\2\2\u092c\u092d\bi"+
		"\1\2\u092d\u092e\7\u01aa\2\2\u092e\u092f\7\u022c\2\2\u092f\u0930\5\u00ae"+
		"X\2\u0930\u0931\7\u0220\2\2\u0931\u0936\5\u00aeX\2\u0932\u0933\7\u0220"+
		"\2\2\u0933\u0935\5\u00aeX\2\u0934\u0932\3\2\2\2\u0935\u0938\3\2\2\2\u0936"+
		"\u0934\3\2\2\2\u0936\u0937\3\2\2\2\u0937\u0939\3\2\2\2\u0938\u0936\3\2"+
		"\2\2\u0939\u093a\7\u022f\2\2\u093a\u093b\bi\1\2\u093b\u0991\3\2\2\2\u093c"+
		"\u093d\bi\1\2\u093d\u093e\7\u0178\2\2\u093e\u093f\7\u022c\2\2\u093f\u0940"+
		"\5\u00aeX\2\u0940\u0941\7\u0220\2\2\u0941\u0946\5\u00aeX\2\u0942\u0943"+
		"\7\u0220\2\2\u0943\u0945\5\u00aeX\2\u0944\u0942\3\2\2\2\u0945\u0948\3"+
		"\2\2\2\u0946\u0944\3\2\2\2\u0946\u0947\3\2\2\2\u0947\u0949\3\2\2\2\u0948"+
		"\u0946\3\2\2\2\u0949\u094a\7\u022f\2\2\u094a\u094b\bi\1\2\u094b\u0991"+
		"\3\2\2\2\u094c\u094d\bi\1\2\u094d\u094e\7\u01c2\2\2\u094e\u094f\7\u022c"+
		"\2\2\u094f\u0954\5\u00aeX\2\u0950\u0951\7\u0220\2\2\u0951\u0953\5\u00ae"+
		"X\2\u0952\u0950\3\2\2\2\u0953\u0956\3\2\2\2\u0954\u0952\3\2\2\2\u0954"+
		"\u0955\3\2\2\2\u0955\u0957\3\2\2\2\u0956\u0954\3\2\2\2\u0957\u0958\7\u022f"+
		"\2\2\u0958\u0959\bi\1\2\u0959\u0991\3\2\2\2\u095a\u095b\7\u0148\2\2\u095b"+
		"\u095c\7\u022c\2\2\u095c\u095d\7\u022f\2\2\u095d\u0991\bi\1\2\u095e\u095f"+
		"\7\u01a8\2\2\u095f\u0960\7\u022c\2\2\u0960\u0961\7\u022f\2\2\u0961\u0991"+
		"\bi\1\2\u0962\u0963\7\u01b3\2\2\u0963\u0964\7\u022c\2\2\u0964\u0965\7"+
		"\u022f\2\2\u0965\u0991\bi\1\2\u0966\u0967\t\f\2\2\u0967\u0968\7\u022c"+
		"\2\2\u0968\u0969\5\u00aeX\2\u0969\u096a\7\u022f\2\2\u096a\u096b\bi\1\2"+
		"\u096b\u0991\3\2\2\2\u096c\u096d\7\u0179\2\2\u096d\u096e\7\u022c\2\2\u096e"+
		"\u096f\5\u00aeX\2\u096f\u0970\7\u0220\2\2\u0970\u0971\5\u00aeX\2\u0971"+
		"\u0972\7\u022f\2\2\u0972\u0973\bi\1\2\u0973\u0991\3\2\2\2\u0974\u0975"+
		"\7\u0165\2\2\u0975\u0976\7\u022c\2\2\u0976\u0977\5\u00aeX\2\u0977\u0978"+
		"\7\u0220\2\2\u0978\u0979\5\u00aeX\2\u0979\u097a\7\u022f\2\2\u097a\u097b"+
		"\bi\1\2\u097b\u0991\3\2\2\2\u097c\u097d\7\u01af\2\2\u097d\u097e\7\u022c"+
		"\2\2\u097e\u097f\5\u00aeX\2\u097f\u0980\7\u0220\2\2\u0980\u0981\5\u00ae"+
		"X\2\u0981\u0982\7\u022f\2\2\u0982\u0983\bi\1\2\u0983\u0991\3\2\2\2\u0984"+
		"\u0985\7\u01e6\2\2\u0985\u0986\7\u022c\2\2\u0986\u0987\7\u022f\2\2\u0987"+
		"\u0991\bi\1\2\u0988\u0989\t\r\2\2\u0989\u098a\7\u022c\2\2\u098a\u098b"+
		"\5\u00aeX\2\u098b\u098c\7\u0220\2\2\u098c\u098d\5\u00aeX\2\u098d\u098e"+
		"\7\u022f\2\2\u098e\u098f\bi\1\2\u098f\u0991\3\2\2\2\u0990\u092c\3\2\2"+
		"\2\u0990\u093c\3\2\2\2\u0990\u094c\3\2\2\2\u0990\u095a\3\2\2\2\u0990\u095e"+
		"\3\2\2\2\u0990\u0962\3\2\2\2\u0990\u0966\3\2\2\2\u0990\u096c\3\2\2\2\u0990"+
		"\u0974\3\2\2\2\u0990\u097c\3\2\2\2\u0990\u0984\3\2\2\2\u0990\u0988\3\2"+
		"\2\2\u0991\u00d1\3\2\2\2\u0992\u0993\bj\1\2\u0993\u0996\5\u00d4k\2\u0994"+
		"\u0995\7\u0221\2\2\u0995\u0997\5\u00d4k\2\u0996\u0994\3\2\2\2\u0997\u0998"+
		"\3\2\2\2\u0998\u0996\3\2\2\2\u0998\u0999\3\2\2\2\u0999\u099a\3\2\2\2\u099a"+
		"\u099b\bj\1\2\u099b\u00d3\3\2\2\2\u099c\u099d\5\u00e6t\2\u099d\u099e\b"+
		"k\1\2\u099e\u09c3\3\2\2\2\u099f\u09a0\5\u00e8u\2\u09a0\u09a1\bk\1\2\u09a1"+
		"\u09c3\3\2\2\2\u09a2\u09a3\7\u022c\2\2\u09a3\u09a4\5\u00aeX\2\u09a4\u09a5"+
		"\7\u022f\2\2\u09a5\u09a6\bk\1\2\u09a6\u09c3\3\2\2\2\u09a7\u09a8\5\u00da"+
		"n\2\u09a8\u09a9\bk\1\2\u09a9\u09c3\3\2\2\2\u09aa\u09ab\5\u00e2r\2\u09ab"+
		"\u09ac\bk\1\2\u09ac\u09c3\3\2\2\2\u09ad\u09ae\5\u00d8m\2\u09ae\u09af\b"+
		"k\1\2\u09af\u09c3\3\2\2\2\u09b0\u09b1\5\u00d6l\2\u09b1\u09b2\bk\1\2\u09b2"+
		"\u09c3\3\2\2\2\u09b3\u09b4\5\u00ceh\2\u09b4\u09b5\bk\1\2\u09b5\u09c3\3"+
		"\2\2\2\u09b6\u09b7\5\u00d0i\2\u09b7\u09b8\bk\1\2\u09b8\u09c3\3\2\2\2\u09b9"+
		"\u09ba\5\u00dep\2\u09ba\u09bb\bk\1\2\u09bb\u09c3\3\2\2\2\u09bc\u09bd\5"+
		" \21\2\u09bd\u09be\bk\1\2\u09be\u09c3\3\2\2\2\u09bf\u09c0\5\u00e4s\2\u09c0"+
		"\u09c1\bk\1\2\u09c1\u09c3\3\2\2\2\u09c2\u099c\3\2\2\2\u09c2\u099f\3\2"+
		"\2\2\u09c2\u09a2\3\2\2\2\u09c2\u09a7\3\2\2\2\u09c2\u09aa\3\2\2\2\u09c2"+
		"\u09ad\3\2\2\2\u09c2\u09b0\3\2\2\2\u09c2\u09b3\3\2\2\2\u09c2\u09b6\3\2"+
		"\2\2\u09c2\u09b9\3\2\2\2\u09c2\u09bc\3\2\2\2\u09c2\u09bf\3\2\2\2\u09c3"+
		"\u00d5\3\2\2\2\u09c4\u09c5\7:\2\2\u09c5\u09c6\7\u022c\2\2\u09c6\u09c7"+
		"\5\u00aeX\2\u09c7\u09c8\7\u0220\2\2\u09c8\u09c9\5\u00aeX\2\u09c9\u09ca"+
		"\7\u0220\2\2\u09ca\u09cb\5\u00aeX\2\u09cb\u09cc\7\u022f\2\2\u09cc\u09cd"+
		"\bl\1\2\u09cd\u0a3c\3\2\2\2\u09ce\u09cf\7\u0180\2\2\u09cf\u09d0\7\u022c"+
		"\2\2\u09d0\u09d1\5\u00aeX\2\u09d1\u09d2\7\u022f\2\2\u09d2\u09d3\bl\1\2"+
		"\u09d3\u0a3c\3\2\2\2\u09d4\u09d5\7\u0181\2\2\u09d5\u09d6\7\u022c\2\2\u09d6"+
		"\u09d7\5\u00aeX\2\u09d7\u09d8\7\u022f\2\2\u09d8\u09d9\bl\1\2\u09d9\u0a3c"+
		"\3\2\2\2\u09da\u09db\7\u017e\2\2\u09db\u09dc\7\u022c\2\2\u09dc\u09dd\5"+
		"\u00aeX\2\u09dd\u09de\7\u0220\2\2\u09de\u09df\5\u00aeX\2\u09df\u09e0\7"+
		"\u022f\2\2\u09e0\u09e1\bl\1\2\u09e1\u0a3c\3\2\2\2\u09e2\u09e3\bl\1\2\u09e3"+
		"\u09e4\7\u01bb\2\2\u09e4\u09e5\7\u022c\2\2\u09e5\u09e8\5\u00aeX\2\u09e6"+
		"\u09e7\7\u0220\2\2\u09e7\u09e9\5\u00aeX\2\u09e8\u09e6\3\2\2\2\u09e9\u09ea"+
		"\3\2\2\2\u09ea\u09e8\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09ec\3\2\2\2\u09ec"+
		"\u09ed\7\u022f\2\2\u09ed\u09ee\bl\1\2\u09ee\u0a3c\3\2\2\2\u09ef\u09f0"+
		"\bl\1\2\u09f0\u09f1\7\24\2\2\u09f1\u09f7\5\u00aeX\2\u09f2\u09f3\7z\2\2"+
		"\u09f3\u09f4\5\u00aeX\2\u09f4\u09f5\7j\2\2\u09f5\u09f6\5\u00aeX\2\u09f6"+
		"\u09f8\3\2\2\2\u09f7\u09f2\3\2\2\2\u09f8\u09f9\3\2\2\2\u09f9\u09f7\3\2"+
		"\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u09fc\7)\2\2\u09fc"+
		"\u09fd\bl\1\2\u09fd\u0a3c\3\2\2\2\u09fe\u09ff\bl\1\2\u09ff\u0a00\7\24"+
		"\2\2\u0a00\u0a06\5\u00aeX\2\u0a01\u0a02\7z\2\2\u0a02\u0a03\5\u00aeX\2"+
		"\u0a03\u0a04\7j\2\2\u0a04\u0a05\5\u00aeX\2\u0a05\u0a07\3\2\2\2\u0a06\u0a01"+
		"\3\2\2\2\u0a07\u0a08\3\2\2\2\u0a08\u0a06\3\2\2\2\u0a08\u0a09\3\2\2\2\u0a09"+
		"\u0a0a\3\2\2\2\u0a0a\u0a0b\7(\2\2\u0a0b\u0a0c\5\u00aeX\2\u0a0c\u0a0d\7"+
		")\2\2\u0a0d\u0a0e\bl\1\2\u0a0e\u0a3c\3\2\2\2\u0a0f\u0a10\bl\1\2\u0a10"+
		"\u0a16\7\24\2\2\u0a11\u0a12\7z\2\2\u0a12\u0a13\5\u00aeX\2\u0a13\u0a14"+
		"\7j\2\2\u0a14\u0a15\5\u00aeX\2\u0a15\u0a17\3\2\2\2\u0a16\u0a11\3\2\2\2"+
		"\u0a17\u0a18\3\2\2\2\u0a18\u0a16\3\2\2\2\u0a18\u0a19\3\2\2\2\u0a19\u0a1a"+
		"\3\2\2\2\u0a1a\u0a1b\7)\2\2\u0a1b\u0a1c\bl\1\2\u0a1c\u0a3c\3\2\2\2\u0a1d"+
		"\u0a1e\bl\1\2\u0a1e\u0a24\7\24\2\2\u0a1f\u0a20\7z\2\2\u0a20\u0a21\5\u00ae"+
		"X\2\u0a21\u0a22\7j\2\2\u0a22\u0a23\5\u00aeX\2\u0a23\u0a25\3\2\2\2\u0a24"+
		"\u0a1f\3\2\2\2\u0a25\u0a26\3\2\2\2\u0a26\u0a24\3\2\2\2\u0a26\u0a27\3\2"+
		"\2\2\u0a27\u0a28\3\2\2\2\u0a28\u0a29\7(\2\2\u0a29\u0a2a\5\u00aeX\2\u0a2a"+
		"\u0a2b\7)\2\2\u0a2b\u0a2c\bl\1\2\u0a2c\u0a3c\3\2\2\2\u0a2d\u0a2e\7\u0155"+
		"\2\2\u0a2e\u0a2f\7\u022c\2\2\u0a2f\u0a30\5\u00aeX\2\u0a30\u0a31\7\u0220"+
		"\2\2\u0a31\u0a32\5\u00aeX\2\u0a32\u0a33\7\u022f\2\2\u0a33\u0a34\bl\1\2"+
		"\u0a34\u0a3c\3\2\2\2\u0a35\u0a36\7\u0191\2\2\u0a36\u0a37\7\u022c\2\2\u0a37"+
		"\u0a38\5\u00aeX\2\u0a38\u0a39\7\u022f\2\2\u0a39\u0a3a\bl\1\2\u0a3a\u0a3c"+
		"\3\2\2\2\u0a3b\u09c4\3\2\2\2\u0a3b\u09ce\3\2\2\2\u0a3b\u09d4\3\2\2\2\u0a3b"+
		"\u09da\3\2\2\2\u0a3b\u09e2\3\2\2\2\u0a3b\u09ef\3\2\2\2\u0a3b\u09fe\3\2"+
		"\2\2\u0a3b\u0a0f\3\2\2\2\u0a3b\u0a1d\3\2\2\2\u0a3b\u0a2d\3\2\2\2\u0a3b"+
		"\u0a35\3\2\2\2\u0a3c\u00d7\3\2\2\2\u0a3d\u0a3e\7\u018e\2\2\u0a3e\u0a3f"+
		"\7\u022c\2\2\u0a3f\u0a40\5\u00aeX\2\u0a40\u0a41\7\u022f\2\2\u0a41\u0a42"+
		"\bm\1\2\u0a42\u0afc\3\2\2\2\u0a43\u0a44\7\u018e\2\2\u0a44\u0a45\7\u022c"+
		"\2\2\u0a45\u0a46\5\u00aeX\2\u0a46\u0a47\7\u0220\2\2\u0a47\u0a48\5\u00ae"+
		"X\2\u0a48\u0a49\7\u022f\2\2\u0a49\u0a4a\bm\1\2\u0a4a\u0afc\3\2\2\2\u0a4b"+
		"\u0a4c\7\u0163\2\2\u0a4c\u0a4d\7\u022c\2\2\u0a4d\u0a4e\7\u022f\2\2\u0a4e"+
		"\u0afc\bm\1\2\u0a4f\u0a50\7\u0163\2\2\u0a50\u0a51\7\u022c\2\2\u0a51\u0a52"+
		"\5\u00aeX\2\u0a52\u0a53\7\u022f\2\2\u0a53\u0a54\bm\1\2\u0a54\u0afc\3\2"+
		"\2\2\u0a55\u0a56\7\u0163\2\2\u0a56\u0a57\7\u022c\2\2\u0a57\u0a58\5\u00ae"+
		"X\2\u0a58\u0a59\7\u0220\2\2\u0a59\u0a5a\5\u00aeX\2\u0a5a\u0a5b\7\u022f"+
		"\2\2\u0a5b\u0a5c\bm\1\2\u0a5c\u0afc\3\2\2\2\u0a5d\u0a5e\7\u0125\2\2\u0a5e"+
		"\u0a5f\7\u022c\2\2\u0a5f\u0a60\5\u00aeX\2\u0a60\u0a61\7\u022f\2\2\u0a61"+
		"\u0a62\bm\1\2\u0a62\u0afc\3\2\2\2\u0a63\u0a64\7\u0139\2\2\u0a64\u0a65"+
		"\7\u022c\2\2\u0a65\u0a66\5\u00aeX\2\u0a66\u0a67\7\u022f\2\2\u0a67\u0a68"+
		"\bm\1\2\u0a68\u0afc\3\2\2\2\u0a69\u0a6a\7\u00de\2\2\u0a6a\u0a6b\7\u022c"+
		"\2\2\u0a6b\u0a6c\5\u00aeX\2\u0a6c\u0a6d\7\u022f\2\2\u0a6d\u0a6e\bm\1\2"+
		"\u0a6e\u0afc\3\2\2\2\u0a6f\u0a70\7\u00ac\2\2\u0a70\u0a71\7\u022c\2\2\u0a71"+
		"\u0a72\5\u00aeX\2\u0a72\u0a73\7\u022f\2\2\u0a73\u0a74\bm\1\2\u0a74\u0afc"+
		"\3\2\2\2\u0a75\u0a76\7\u00c5\2\2\u0a76\u0a77\7\u022c\2\2\u0a77\u0a78\5"+
		"\u00aeX\2\u0a78\u0a79\7\u022f\2\2\u0a79\u0a7a\bm\1\2\u0a7a\u0afc\3\2\2"+
		"\2\u0a7b\u0a7c\7\u00dd\2\2\u0a7c\u0a7d\7\u022c\2\2\u0a7d\u0a7e\5\u00ae"+
		"X\2\u0a7e\u0a7f\7\u022f\2\2\u0a7f\u0a80\bm\1\2\u0a80\u0afc\3\2\2\2\u0a81"+
		"\u0a82\7\u00ff\2\2\u0a82\u0a83\7\u022c\2\2\u0a83\u0a84\5\u00aeX\2\u0a84"+
		"\u0a85\7\u022f\2\2\u0a85\u0a86\bm\1\2\u0a86\u0afc\3\2\2\2\u0a87\u0a88"+
		"\7\u0195\2\2\u0a88\u0a89\7\u022c\2\2\u0a89\u0a8a\5\u00aeX\2\u0a8a\u0a8b"+
		"\7\u022f\2\2\u0a8b\u0a8c\bm\1\2\u0a8c\u0afc\3\2\2\2\u0a8d\u0a8e\7\u019c"+
		"\2\2\u0a8e\u0a8f\7\u022c\2\2\u0a8f\u0a90\5\u00aeX\2\u0a90\u0a91\7\u0220"+
		"\2\2\u0a91\u0a92\5\u00aeX\2\u0a92\u0a93\7\u022f\2\2\u0a93\u0a94\bm\1\2"+
		"\u0a94\u0afc\3\2\2\2\u0a95\u0a96\7\u01a4\2\2\u0a96\u0a97\7\u022c\2\2\u0a97"+
		"\u0a98\5\u00aeX\2\u0a98\u0a99\7\u0220\2\2\u0a99\u0a9a\5\u00aeX\2\u0a9a"+
		"\u0a9b\7\u022f\2\2\u0a9b\u0a9c\bm\1\2\u0a9c\u0afc\3\2\2\2\u0a9d\u0a9e"+
		"\7\u016e\2\2\u0a9e\u0a9f\7\u022c\2\2\u0a9f\u0aa0\5\u00aeX\2\u0aa0\u0aa1"+
		"\7\u0220\2\2\u0aa1\u0aa2\5\u00aeX\2\u0aa2\u0aa3\7\u022f\2\2\u0aa3\u0aa4"+
		"\bm\1\2\u0aa4\u0afc\3\2\2\2\u0aa5\u0aa6\7\u01c6\2\2\u0aa6\u0aa7\7\u022c"+
		"\2\2\u0aa7\u0aa8\5\u00aeX\2\u0aa8\u0aa9\7\u0220\2\2\u0aa9\u0aaa\5\u00ae"+
		"X\2\u0aaa\u0aab\7\u022f\2\2\u0aab\u0aac\bm\1\2\u0aac\u0afc\3\2\2\2\u0aad"+
		"\u0aae\7\u01b5\2\2\u0aae\u0aaf\7\u022c\2\2\u0aaf\u0ab0\5\u00aeX\2\u0ab0"+
		"\u0ab1\7\u0220\2\2\u0ab1\u0ab2\5\u00aeX\2\u0ab2\u0ab3\7\u022f\2\2\u0ab3"+
		"\u0ab4\bm\1\2\u0ab4\u0afc\3\2\2\2\u0ab5\u0ab8\7\35\2\2\u0ab6\u0ab7\7\u022c"+
		"\2\2\u0ab7\u0ab9\7\u022f\2\2\u0ab8\u0ab6\3\2\2\2\u0ab8\u0ab9\3\2\2\2\u0ab9"+
		"\u0aba\3\2\2\2\u0aba\u0afc\bm\1\2\u0abb\u0abe\7\36\2\2\u0abc\u0abd\7\u022c"+
		"\2\2\u0abd\u0abf\7\u022f\2\2\u0abe\u0abc\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf"+
		"\u0ac0\3\2\2\2\u0ac0\u0afc\bm\1\2\u0ac1\u0ac2\7\u016c\2\2\u0ac2\u0ac3"+
		"\7\u022c\2\2\u0ac3\u0ac4\5\u00aeX\2\u0ac4\u0ac5\7\u0220\2\2\u0ac5\u0ac6"+
		"\5\u00aeX\2\u0ac6\u0ac7\7\u022f\2\2\u0ac7\u0ac8\bm\1\2\u0ac8\u0afc\3\2"+
		"\2\2\u0ac9\u0aca\7\u016c\2\2\u0aca\u0acb\7\u022c\2\2\u0acb\u0acc\5\u00ae"+
		"X\2\u0acc\u0acd\7\u0220\2\2\u0acd\u0ace\5\u00aeX\2\u0ace\u0acf\7\u0220"+
		"\2\2\u0acf\u0ad0\5\u00aeX\2\u0ad0\u0ad1\7\u022f\2\2\u0ad1\u0ad2\bm\1\2"+
		"\u0ad2\u0afc\3\2\2\2\u0ad3\u0ad4\7\u0196\2\2\u0ad4\u0ad5\7\u022c\2\2\u0ad5"+
		"\u0ad6\5\u00aeX\2\u0ad6\u0ad7\7\u022f\2\2\u0ad7\u0ad8\bm\1\2\u0ad8\u0afc"+
		"\3\2\2\2\u0ad9\u0ada\7\u0168\2\2\u0ada\u0adb\7\u022c\2\2\u0adb\u0adc\5"+
		"\u00aeX\2\u0adc\u0add\7\u0220\2\2\u0add\u0ade\5\u00aeX\2\u0ade\u0adf\7"+
		"\u022f\2\2\u0adf\u0ae0\bm\1\2\u0ae0\u0afc\3\2\2\2\u0ae1\u0ae2\7\u016a"+
		"\2\2\u0ae2\u0ae3\7\u022c\2\2\u0ae3\u0ae4\5\u00aeX\2\u0ae4\u0ae5\7\u0220"+
		"\2\2\u0ae5\u0ae6\5\u00aeX\2\u0ae6\u0ae7\7\u022f\2\2\u0ae7\u0ae8\bm\1\2"+
		"\u0ae8\u0afc\3\2\2\2\u0ae9\u0aea\7\u0192\2\2\u0aea\u0aeb\7\u022c\2\2\u0aeb"+
		"\u0aec\5\u00aeX\2\u0aec\u0aed\7\u0220\2\2\u0aed\u0aee\5\u00aeX\2\u0aee"+
		"\u0aef\7\u022f\2\2\u0aef\u0af0\bm\1\2\u0af0\u0afc\3\2\2\2\u0af1\u0af2"+
		"\7\u01ce\2\2\u0af2\u0af3\7\u022c\2\2\u0af3\u0af4\5\u00aeX\2\u0af4\u0af5"+
		"\7\u0220\2\2\u0af5\u0af6\5\u00aeX\2\u0af6\u0af7\7\u022f\2\2\u0af7\u0af8"+
		"\bm\1\2\u0af8\u0afc\3\2\2\2\u0af9\u0afa\7\u01f9\2\2\u0afa\u0afc\bm\1\2"+
		"\u0afb\u0a3d\3\2\2\2\u0afb\u0a43\3\2\2\2\u0afb\u0a4b\3\2\2\2\u0afb\u0a4f"+
		"\3\2\2\2\u0afb\u0a55\3\2\2\2\u0afb\u0a5d\3\2\2\2\u0afb\u0a63\3\2\2\2\u0afb"+
		"\u0a69\3\2\2\2\u0afb\u0a6f\3\2\2\2\u0afb\u0a75\3\2\2\2\u0afb\u0a7b\3\2"+
		"\2\2\u0afb\u0a81\3\2\2\2\u0afb\u0a87\3\2\2\2\u0afb\u0a8d\3\2\2\2\u0afb"+
		"\u0a95\3\2\2\2\u0afb\u0a9d\3\2\2\2\u0afb\u0aa5\3\2\2\2\u0afb\u0aad\3\2"+
		"\2\2\u0afb\u0ab5\3\2\2\2\u0afb\u0abb\3\2\2\2\u0afb\u0ac1\3\2\2\2\u0afb"+
		"\u0ac9\3\2\2\2\u0afb\u0ad3\3\2\2\2\u0afb\u0ad9\3\2\2\2\u0afb\u0ae1\3\2"+
		"\2\2\u0afb\u0ae9\3\2\2\2\u0afb\u0af1\3\2\2\2\u0afb\u0af9\3\2\2\2\u0afc"+
		"\u00d9\3\2\2\2\u0afd\u0afe\7\25\2\2\u0afe\u0aff\7\u022c\2\2\u0aff\u0b00"+
		"\5\u00aeX\2\u0b00\u0b01\7\f\2\2\u0b01\u0b03\5\b\5\2\u0b02\u0b04\5\f\7"+
		"\2\u0b03\u0b02\3\2\2\2\u0b03\u0b04\3\2\2\2\u0b04\u0b05\3\2\2\2\u0b05\u0b06"+
		"\7\u022f\2\2\u0b06\u0b07\bn\1\2\u0b07\u0b0f\3\2\2\2\u0b08\u0b09\7\20\2"+
		"\2\u0b09\u0b0a\7\u022c\2\2\u0b0a\u0b0b\5\u00aeX\2\u0b0b\u0b0c\7\u022f"+
		"\2\2\u0b0c\u0b0d\bn\1\2\u0b0d\u0b0f\3\2\2\2\u0b0e\u0afd\3\2\2\2\u0b0e"+
		"\u0b08\3\2\2\2\u0b0f\u00db\3\2\2\2\u0b10\u0b11\7\u015c\2\2\u0b11\u0b12"+
		"\7\u022c\2\2\u0b12\u0b13\5\u00aeX\2\u0b13\u0b14\7\u022f\2\2\u0b14\u0b15"+
		"\bo\1\2\u0b15\u0b4b\3\2\2\2\u0b16\u0b17\bo\1\2\u0b17\u0b18\7\u015c\2\2"+
		"\u0b18\u0b19\7\u022c\2\2\u0b19\u0b1a\7%\2\2\u0b1a\u0b1f\5\u00aeX\2\u0b1b"+
		"\u0b1c\7\u0220\2\2\u0b1c\u0b1e\5\u00aeX\2\u0b1d\u0b1b\3\2\2\2\u0b1e\u0b21"+
		"\3\2\2\2\u0b1f\u0b1d\3\2\2\2\u0b1f\u0b20\3\2\2\2\u0b20\u0b22\3\2\2\2\u0b21"+
		"\u0b1f\3\2\2\2\u0b22\u0b23\7\u022f\2\2\u0b23\u0b24\bo\1\2\u0b24\u0b4b"+
		"\3\2\2\2\u0b25\u0b26\7\u015c\2\2\u0b26\u0b27\7\u022c\2\2\u0b27\u0b28\7"+
		"\u021c\2\2\u0b28\u0b29\7\u022f\2\2\u0b29\u0b4b\bo\1\2\u0b2a\u0b2b\7\u01ba"+
		"\2\2\u0b2b\u0b2c\7\u022c\2\2\u0b2c\u0b2d\5\u00aeX\2\u0b2d\u0b2e\7\u022f"+
		"\2\2\u0b2e\u0b2f\bo\1\2\u0b2f\u0b4b\3\2\2\2\u0b30\u0b31\7\u01ba\2\2\u0b31"+
		"\u0b32\7\u022c\2\2\u0b32\u0b33\7%\2\2\u0b33\u0b34\5\u00aeX\2\u0b34\u0b35"+
		"\7\u022f\2\2\u0b35\u0b36\bo\1\2\u0b36\u0b4b\3\2\2\2\u0b37\u0b38\7\u01b2"+
		"\2\2\u0b38\u0b39\7\u022c\2\2\u0b39\u0b3a\5\u00aeX\2\u0b3a\u0b3b\7\u022f"+
		"\2\2\u0b3b\u0b3c\bo\1\2\u0b3c\u0b4b\3\2\2\2\u0b3d\u0b3e\7\u01b2\2\2\u0b3e"+
		"\u0b3f\7\u022c\2\2\u0b3f\u0b40\7%\2\2\u0b40\u0b41\5\u00aeX\2\u0b41\u0b42"+
		"\7\u022f\2\2\u0b42\u0b43\bo\1\2\u0b43\u0b4b\3\2\2\2\u0b44\u0b45\t\16\2"+
		"\2\u0b45\u0b46\7\u022c\2\2\u0b46\u0b47\5\u00aeX\2\u0b47\u0b48\7\u022f"+
		"\2\2\u0b48\u0b49\bo\1\2\u0b49\u0b4b\3\2\2\2\u0b4a\u0b10\3\2\2\2\u0b4a"+
		"\u0b16\3\2\2\2\u0b4a\u0b25\3\2\2\2\u0b4a\u0b2a\3\2\2\2\u0b4a\u0b30\3\2"+
		"\2\2\u0b4a\u0b37\3\2\2\2\u0b4a\u0b3d\3\2\2\2\u0b4a\u0b44\3\2\2\2\u0b4b"+
		"\u00dd\3\2\2\2\u0b4c\u0b4d\5\u00dco\2\u0b4d\u0b4e\bp\1\2\u0b4e\u0b94\3"+
		"\2\2\2\u0b4f\u0b50\t\17\2\2\u0b50\u0b51\7\u022c\2\2\u0b51\u0b52\5\u00ae"+
		"X\2\u0b52\u0b53\7\u022f\2\2\u0b53\u0b54\bp\1\2\u0b54\u0b94\3\2\2\2\u0b55"+
		"\u0b56\t\20\2\2\u0b56\u0b57\7\u022c\2\2\u0b57\u0b58\5\u00aeX\2\u0b58\u0b59"+
		"\7\u0220\2\2\u0b59\u0b5a\5\u00aeX\2\u0b5a\u0b5b\7\u022f\2\2\u0b5b\u0b5c"+
		"\bp\1\2\u0b5c\u0b94\3\2\2\2\u0b5d\u0b5e\7\u01de\2\2\u0b5e\u0b5f\7\u022c"+
		"\2\2\u0b5f\u0b60\5\u00aeX\2\u0b60\u0b61\7\u0220\2\2\u0b61\u0b62\5\u00ae"+
		"X\2\u0b62\u0b63\7\u022f\2\2\u0b63\u0b64\bp\1\2\u0b64\u0b94\3\2\2\2\u0b65"+
		"\u0b66\7\u0190\2\2\u0b66\u0b67\7\u022c\2\2\u0b67\u0b68\5\u00aeX\2\u0b68"+
		"\u0b69\7\u0220\2\2\u0b69\u0b6a\5\u00aeX\2\u0b6a\u0b6b\7\u022f\2\2\u0b6b"+
		"\u0b6c\bp\1\2\u0b6c\u0b94\3\2\2\2\u0b6d\u0b6e\7\u0190\2\2\u0b6e\u0b6f"+
		"\7\u022c\2\2\u0b6f\u0b70\5\u00aeX\2\u0b70\u0b71\7\u0220\2\2\u0b71\u0b72"+
		"\5\u00aeX\2\u0b72\u0b73\7\u0220\2\2\u0b73\u0b74\5\u00aeX\2\u0b74\u0b75"+
		"\7\u022f\2\2\u0b75\u0b76\bp\1\2\u0b76\u0b94\3\2\2\2\u0b77\u0b78\t\21\2"+
		"\2\u0b78\u0b79\7\u022c\2\2\u0b79\u0b7a\5\u00aeX\2\u0b7a\u0b7b\7\u0220"+
		"\2\2\u0b7b\u0b7c\5\u00aeX\2\u0b7c\u0b7d\7\u022f\2\2\u0b7d\u0b7e\bp\1\2"+
		"\u0b7e\u0b94\3\2\2\2\u0b7f\u0b80\7\u0169\2\2\u0b80\u0b81\7\u022c\2\2\u0b81"+
		"\u0b82\5\u00aeX\2\u0b82\u0b83\7\u0220\2\2\u0b83\u0b84\5\u00aeX\2\u0b84"+
		"\u0b85\7\u022f\2\2\u0b85\u0b86\bp\1\2\u0b86\u0b94\3\2\2\2\u0b87\u0b88"+
		"\t\22\2\2\u0b88\u0b89\7\u022c\2\2\u0b89\u0b8a\5\u00aeX\2\u0b8a\u0b8b\7"+
		"\u022f\2\2\u0b8b\u0b8c\bp\1\2\u0b8c\u0b94\3\2\2\2\u0b8d\u0b8e\7\u0174"+
		"\2\2\u0b8e\u0b8f\7\u022c\2\2\u0b8f\u0b90\5\u00aeX\2\u0b90\u0b91\7\u022f"+
		"\2\2\u0b91\u0b92\bp\1\2\u0b92\u0b94\3\2\2\2\u0b93\u0b4c\3\2\2\2\u0b93"+
		"\u0b4f\3\2\2\2\u0b93\u0b55\3\2\2\2\u0b93\u0b5d\3\2\2\2\u0b93\u0b65\3\2"+
		"\2\2\u0b93\u0b6d\3\2\2\2\u0b93\u0b77\3\2\2\2\u0b93\u0b7f\3\2\2\2\u0b93"+
		"\u0b87\3\2\2\2\u0b93\u0b8d\3\2\2\2\u0b94\u00df\3\2\2\2\u0b95\u0b96\7\u01b8"+
		"\2\2\u0b96\u0b97\7\u022c\2\2\u0b97\u0b98\5\u00aeX\2\u0b98\u0b99\7\u022f"+
		"\2\2\u0b99\u0b9a\bq\1\2\u0b9a\u0ba8\3\2\2\2\u0b9b\u0b9c\7\u01d2\2\2\u0b9c"+
		"\u0b9d\7\u022c\2\2\u0b9d\u0b9e\5\u00aeX\2\u0b9e\u0b9f\7\u022f\2\2\u0b9f"+
		"\u0ba0\bq\1\2\u0ba0\u0ba8\3\2\2\2\u0ba1\u0ba2\7\u01c0\2\2\u0ba2\u0ba3"+
		"\7\u022c\2\2\u0ba3\u0ba4\5\u00aeX\2\u0ba4\u0ba5\7\u022f\2\2\u0ba5\u0ba6"+
		"\bq\1\2\u0ba6\u0ba8\3\2\2\2\u0ba7\u0b95\3\2\2\2\u0ba7\u0b9b\3\2\2\2\u0ba7"+
		"\u0ba1\3\2\2\2\u0ba8\u00e1\3\2\2\2\u0ba9\u0baa\7\u01c3\2\2\u0baa\u0bab"+
		"\7\u022c\2\2\u0bab\u0bac\5\u00aeX\2\u0bac\u0bad\7\u022f\2\2\u0bad\u0bae"+
		"\br\1\2\u0bae\u0c7c\3\2\2\2\u0baf\u0bb0\7\u01c3\2\2\u0bb0\u0bb1\7\u022c"+
		"\2\2\u0bb1\u0bb2\5\u00aeX\2\u0bb2\u0bb3\7\u0220\2\2\u0bb3\u0bb4\5\u00ae"+
		"X\2\u0bb4\u0bb5\7\u022f\2\2\u0bb5\u0bb6\br\1\2\u0bb6\u0c7c\3\2\2\2\u0bb7"+
		"\u0bb8\7\u008b\2\2\u0bb8\u0bb9\7\u022c\2\2\u0bb9\u0bba\5\u00aeX\2\u0bba"+
		"\u0bbb\7\u022f\2\2\u0bbb\u0bbc\br\1\2\u0bbc\u0c7c\3\2\2\2\u0bbd\u0bbe"+
		"\t\23\2\2\u0bbe\u0bbf\7\u022c\2\2\u0bbf\u0bc0\5\u00aeX\2\u0bc0\u0bc1\7"+
		"\u022f\2\2\u0bc1\u0bc2\br\1\2\u0bc2\u0c7c\3\2\2\2\u0bc3\u0bc4\7\u01f4"+
		"\2\2\u0bc4\u0bc5\7\u022c\2\2\u0bc5\u0bc6\7\u022f\2\2\u0bc6\u0c7c\br\1"+
		"\2\u0bc7\u0bc8\7\u01f4\2\2\u0bc8\u0bc9\7\u022c\2\2\u0bc9\u0bca\5\u00ae"+
		"X\2\u0bca\u0bcb\7\u022f\2\2\u0bcb\u0bcc\br\1\2\u0bcc\u0c7c\3\2\2\2\u0bcd"+
		"\u0bce\7\u0172\2\2\u0bce\u0bcf\7\u022c\2\2\u0bcf\u0bd0\5\u00aeX\2\u0bd0"+
		"\u0bd1\7\u022f\2\2\u0bd1\u0bd2\br\1\2\u0bd2\u0c7c\3\2\2\2\u0bd3\u0bd4"+
		"\7\u0170\2\2\u0bd4\u0bd5\7\u022c\2\2\u0bd5\u0bd6\5\u00aeX\2\u0bd6\u0bd7"+
		"\7\u022f\2\2\u0bd7\u0bd8\br\1\2\u0bd8\u0c7c\3\2\2\2\u0bd9\u0bda\7\u01f6"+
		"\2\2\u0bda\u0bdb\7\u022c\2\2\u0bdb\u0bdc\5\u00aeX\2\u0bdc\u0bdd\7\u022f"+
		"\2\2\u0bdd\u0bde\br\1\2\u0bde\u0c7c\3\2\2\2\u0bdf\u0be0\7\u01f5\2\2\u0be0"+
		"\u0be1\7\u022c\2\2\u0be1\u0be2\5\u00aeX\2\u0be2\u0be3\7\u022f\2\2\u0be3"+
		"\u0be4\br\1\2\u0be4\u0c7c\3\2\2\2\u0be5\u0be6\7\u019d\2\2\u0be6\u0be7"+
		"\7\u022c\2\2\u0be7\u0be8\5\u00aeX\2\u0be8\u0be9\7\u0220\2\2\u0be9\u0bea"+
		"\5\u00aeX\2\u0bea\u0beb\7\u022f\2\2\u0beb\u0bec\br\1\2\u0bec\u0c7c\3\2"+
		"\2\2\u0bed\u0bee\t\24\2\2\u0bee\u0bef\7\u022c\2\2\u0bef\u0bf0\5\u00ae"+
		"X\2\u0bf0\u0bf1\7\u0220\2\2\u0bf1\u0bf2\5\u00aeX\2\u0bf2\u0bf3\7\u022f"+
		"\2\2\u0bf3\u0bf4\br\1\2\u0bf4\u0c7c\3\2\2\2\u0bf5\u0bf6\7\u0161\2\2\u0bf6"+
		"\u0bf7\7\u022c\2\2\u0bf7\u0bf8\5\u00aeX\2\u0bf8\u0bf9\7\u022f\2\2\u0bf9"+
		"\u0bfa\br\1\2\u0bfa\u0c7c\3\2\2\2\u0bfb\u0bfc\7\u01e8\2\2\u0bfc\u0bfd"+
		"\7\u022c\2\2\u0bfd\u0bfe\5\u00aeX\2\u0bfe\u0bff\7\u022f\2\2\u0bff\u0c00"+
		"\br\1\2\u0c00\u0c7c\3\2\2\2\u0c01\u0c02\7\u01c9\2\2\u0c02\u0c03\7\u022c"+
		"\2\2\u0c03\u0c04\5\u00aeX\2\u0c04\u0c05\7\u022f\2\2\u0c05\u0c06\br\1\2"+
		"\u0c06\u0c7c\3\2\2\2\u0c07\u0c08\7\u014a\2\2\u0c08\u0c09\7\u022c\2\2\u0c09"+
		"\u0c0a\5\u00aeX\2\u0c0a\u0c0b\7\u022f\2\2\u0c0b\u0c0c\br\1\2\u0c0c\u0c7c"+
		"\3\2\2\2\u0c0d\u0c0e\7\u015e\2\2\u0c0e\u0c0f\7\u022c\2\2\u0c0f\u0c10\5"+
		"\u00aeX\2\u0c10\u0c11\7\u0220\2\2\u0c11\u0c12\5\u00aeX\2\u0c12\u0c13\7"+
		"\u0220\2\2\u0c13\u0c14\5\u00aeX\2\u0c14\u0c15\7\u022f\2\2\u0c15\u0c16"+
		"\br\1\2\u0c16\u0c7c\3\2\2\2\u0c17\u0c18\7\u01b7\2\2\u0c18\u0c19\7\u022c"+
		"\2\2\u0c19\u0c1a\5\u00aeX\2\u0c1a\u0c1b\7\u022f\2\2\u0c1b\u0c1c\br\1\2"+
		"\u0c1c\u0c7c\3\2\2\2\u0c1d\u0c1e\7\u01d4\2\2\u0c1e\u0c1f\7\u022c\2\2\u0c1f"+
		"\u0c20\5\u00aeX\2\u0c20\u0c21\7\u0220\2\2\u0c21\u0c22\5\u00aeX\2\u0c22"+
		"\u0c23\7\u022f\2\2\u0c23\u0c24\br\1\2\u0c24\u0c7c\3\2\2\2\u0c25\u0c26"+
		"\7\u015a\2\2\u0c26\u0c27\7\u022c\2\2\u0c27\u0c28\5\u00aeX\2\u0c28\u0c29"+
		"\7\u022f\2\2\u0c29\u0c2a\br\1\2\u0c2a\u0c7c\3\2\2\2\u0c2b\u0c2c\7\u0154"+
		"\2\2\u0c2c\u0c2d\7\u022c\2\2\u0c2d\u0c2e\5\u00aeX\2\u0c2e\u0c2f\7\u022f"+
		"\2\2\u0c2f\u0c30\br\1\2\u0c30\u0c7c\3\2\2\2\u0c31\u0c32\7\u0150\2\2\u0c32"+
		"\u0c33\7\u022c\2\2\u0c33\u0c34\5\u00aeX\2\u0c34\u0c35\7\u022f\2\2\u0c35"+
		"\u0c36\br\1\2\u0c36\u0c7c\3\2\2\2\u0c37\u0c38\7\u0194\2\2\u0c38\u0c39"+
		"\7\u022c\2\2\u0c39\u0c3a\5\u00aeX\2\u0c3a\u0c3b\7\u022f\2\2\u0c3b\u0c3c"+
		"\br\1\2\u0c3c\u0c7c\3\2\2\2\u0c3d\u0c3e\7\u01e9\2\2\u0c3e\u0c3f\7\u022c"+
		"\2\2\u0c3f\u0c40\5\u00aeX\2\u0c40\u0c41\7\u022f\2\2\u0c41\u0c42\br\1\2"+
		"\u0c42\u0c7c\3\2\2\2\u0c43\u0c44\7\u01d0\2\2\u0c44\u0c45\7\u022c\2\2\u0c45"+
		"\u0c46\5\u00aeX\2\u0c46\u0c47\7\u022f\2\2\u0c47\u0c48\br\1\2\u0c48\u0c7c"+
		"\3\2\2\2\u0c49\u0c4a\7\u0186\2\2\u0c4a\u0c4b\7\u022c\2\2\u0c4b\u0c4c\5"+
		"\u00aeX\2\u0c4c\u0c4d\7\u022f\2\2\u0c4d\u0c4e\br\1\2\u0c4e\u0c7c\3\2\2"+
		"\2\u0c4f\u0c50\7\u0187\2\2\u0c50\u0c51\7\u022c\2\2\u0c51\u0c52\5\u00ae"+
		"X\2\u0c52\u0c53\7\u022f\2\2\u0c53\u0c54\br\1\2\u0c54\u0c7c\3\2\2\2\u0c55"+
		"\u0c56\7\u018d\2\2\u0c56\u0c57\7\u022c\2\2\u0c57\u0c58\5\u00aeX\2\u0c58"+
		"\u0c59\7\u022f\2\2\u0c59\u0c5a\br\1\2\u0c5a\u0c7c\3\2\2\2\u0c5b\u0c5c"+
		"\7\u01a3\2\2\u0c5c\u0c5d\7\u022c\2\2\u0c5d\u0c5e\5\u00aeX\2\u0c5e\u0c5f"+
		"\7\u022f\2\2\u0c5f\u0c60\br\1\2\u0c60\u0c7c\3\2\2\2\u0c61\u0c62\7\u015f"+
		"\2\2\u0c62\u0c63\7\u022c\2\2\u0c63\u0c64\5\u00aeX\2\u0c64\u0c65\7\u022f"+
		"\2\2\u0c65\u0c66\br\1\2\u0c66\u0c7c\3\2\2\2\u0c67\u0c68\7\u01b9\2\2\u0c68"+
		"\u0c69\7\u022c\2\2\u0c69\u0c6a\7\u022f\2\2\u0c6a\u0c7c\br\1\2\u0c6b\u0c6c"+
		"\7\u014b\2\2\u0c6c\u0c6d\7\u022c\2\2\u0c6d\u0c6e\7\u022f\2\2\u0c6e\u0c7c"+
		"\br\1\2\u0c6f\u0c70\7\u01e2\2\2\u0c70\u0c71\7\u022c\2\2\u0c71\u0c72\5"+
		"\u00aeX\2\u0c72\u0c73\7\u022f\2\2\u0c73\u0c74\br\1\2\u0c74\u0c7c\3\2\2"+
		"\2\u0c75\u0c76\7\u0183\2\2\u0c76\u0c77\7\u022c\2\2\u0c77\u0c78\5\u00ae"+
		"X\2\u0c78\u0c79\7\u022f\2\2\u0c79\u0c7a\br\1\2\u0c7a\u0c7c\3\2\2\2\u0c7b"+
		"\u0ba9\3\2\2\2\u0c7b\u0baf\3\2\2\2\u0c7b\u0bb7\3\2\2\2\u0c7b\u0bbd\3\2"+
		"\2\2\u0c7b\u0bc3\3\2\2\2\u0c7b\u0bc7\3\2\2\2\u0c7b\u0bcd\3\2\2\2\u0c7b"+
		"\u0bd3\3\2\2\2\u0c7b\u0bd9\3\2\2\2\u0c7b\u0bdf\3\2\2\2\u0c7b\u0be5\3\2"+
		"\2\2\u0c7b\u0bed\3\2\2\2\u0c7b\u0bf5\3\2\2\2\u0c7b\u0bfb\3\2\2\2\u0c7b"+
		"\u0c01\3\2\2\2\u0c7b\u0c07\3\2\2\2\u0c7b\u0c0d\3\2\2\2\u0c7b\u0c17\3\2"+
		"\2\2\u0c7b\u0c1d\3\2\2\2\u0c7b\u0c25\3\2\2\2\u0c7b\u0c2b\3\2\2\2\u0c7b"+
		"\u0c31\3\2\2\2\u0c7b\u0c37\3\2\2\2\u0c7b\u0c3d\3\2\2\2\u0c7b\u0c43\3\2"+
		"\2\2\u0c7b\u0c49\3\2\2\2\u0c7b\u0c4f\3\2\2\2\u0c7b\u0c55\3\2\2\2\u0c7b"+
		"\u0c5b\3\2\2\2\u0c7b\u0c61\3\2\2\2\u0c7b\u0c67\3\2\2\2\u0c7b\u0c6b\3\2"+
		"\2\2\u0c7b\u0c6f\3\2\2\2\u0c7b\u0c75\3\2\2\2\u0c7c\u00e3\3\2\2\2\u0c7d"+
		"\u0c7e\5\u00eex\2\u0c7e\u0c7f\7\4\2\2\u0c7f\u0c80\5\u00eex\2\u0c80\u0c81"+
		"\5\u00acW\2\u0c81\u0c82\bs\1\2\u0c82\u0c88\3\2\2\2\u0c83\u0c84\5\u00ee"+
		"x\2\u0c84\u0c85\5\u00acW\2\u0c85\u0c86\bs\1\2\u0c86\u0c88\3\2\2\2\u0c87"+
		"\u0c7d\3\2\2\2\u0c87\u0c83\3\2\2\2\u0c88\u00e5\3\2\2\2\u0c89\u0c8a\7\u0239"+
		"\2\2\u0c8a\u0c9a\bt\1\2\u0c8b\u0c8c\7\u0238\2\2\u0c8c\u0c9a\bt\1\2\u0c8d"+
		"\u0c8e\7\u0237\2\2\u0c8e\u0c9a\bt\1\2\u0c8f\u0c90\7\7\2\2\u0c90\u0c9a"+
		"\bt\1\2\u0c91\u0c92\7\6\2\2\u0c92\u0c9a\bt\1\2\u0c93\u0c94\5\u00f2z\2"+
		"\u0c94\u0c95\bt\1\2\u0c95\u0c9a\3\2\2\2\u0c96\u0c97\5\u00f4{\2\u0c97\u0c98"+
		"\bt\1\2\u0c98\u0c9a\3\2\2\2\u0c99\u0c89\3\2\2\2\u0c99\u0c8b\3\2\2\2\u0c99"+
		"\u0c8d\3\2\2\2\u0c99\u0c8f\3\2\2\2\u0c99\u0c91\3\2\2\2\u0c99\u0c93\3\2"+
		"\2\2\u0c99\u0c96\3\2\2\2\u0c9a\u00e7\3\2\2\2\u0c9b\u0c9c\5\u00f0y\2\u0c9c"+
		"\u0c9d\7\4\2\2\u0c9d\u0c9e\3\2\2\2\u0c9e\u0c9f\5\u00f0y\2\u0c9f\u0ca0"+
		"\7\4\2\2\u0ca0\u0ca1\3\2\2\2\u0ca1\u0ca2\5\u00f0y\2\u0ca2\u0ca3\bu\1\2"+
		"\u0ca3\u0cae\3\2\2\2\u0ca4\u0ca5\5\u00f0y\2\u0ca5\u0ca6\7\4\2\2\u0ca6"+
		"\u0ca7\3\2\2\2\u0ca7\u0ca8\5\u00f0y\2\u0ca8\u0ca9\bu\1\2\u0ca9\u0cae\3"+
		"\2\2\2\u0caa\u0cab\5\u00f0y\2\u0cab\u0cac\bu\1\2\u0cac\u0cae\3\2\2\2\u0cad"+
		"\u0c9b\3\2\2\2\u0cad\u0ca4\3\2\2\2\u0cad\u0caa\3\2\2\2\u0cae\u00e9\3\2"+
		"\2\2\u0caf\u0cb0\5\u00ecw\2\u0cb0\u0cb1\7\4\2\2\u0cb1\u0cb2\5\u00ecw\2"+
		"\u0cb2\u0cb3\bv\1\2\u0cb3\u0cb8\3\2\2\2\u0cb4\u0cb5\5\u00ecw\2\u0cb5\u0cb6"+
		"\bv\1\2\u0cb6\u0cb8\3\2\2\2\u0cb7\u0caf\3\2\2\2\u0cb7\u0cb4\3\2\2\2\u0cb8"+
		"\u00eb\3\2\2\2\u0cb9\u0cba\5\u00eex\2\u0cba\u0cbb\bw\1\2\u0cbb\u0cc7\3"+
		"\2\2\2\u0cbc\u0cc0\bw\1\2\u0cbd\u0cbf\5\u00eex\2\u0cbe\u0cbd\3\2\2\2\u0cbf"+
		"\u0cc2\3\2\2\2\u0cc0\u0cbe\3\2\2\2\u0cc0\u0cc1\3\2\2\2\u0cc1\u0cc3\3\2"+
		"\2\2\u0cc2\u0cc0\3\2\2\2\u0cc3\u0cc4\5 \21\2\u0cc4\u0cc5\bw\1\2\u0cc5"+
		"\u0cc7\3\2\2\2\u0cc6\u0cb9\3\2\2\2\u0cc6\u0cbc\3\2\2\2\u0cc7\u00ed\3\2"+
		"\2\2\u0cc8\u0cc9\5\u00f0y\2\u0cc9\u0cca\bx\1\2\u0cca\u0ccf\3\2\2\2\u0ccb"+
		"\u0ccc\5 \21\2\u0ccc\u0ccd\bx\1\2\u0ccd\u0ccf\3\2\2\2\u0cce\u0cc8\3\2"+
		"\2\2\u0cce\u0ccb\3\2\2\2\u0ccf\u00ef\3\2\2\2\u0cd0\u0cd1\7\u0236\2\2\u0cd1"+
		"\u0cd6\by\1\2\u0cd2\u0cd3\5\u0102\u0082\2\u0cd3\u0cd4\by\1\2\u0cd4\u0cd6"+
		"\3\2\2\2\u0cd5\u0cd0\3\2\2\2\u0cd5\u0cd2\3\2\2\2\u0cd6\u00f1\3\2\2\2\u0cd7"+
		"\u0cd8\7!\2\2\u0cd8\u0cd9\7\u0239\2\2\u0cd9\u0cda\bz\1\2\u0cda\u00f3\3"+
		"\2\2\2\u0cdb\u0cdc\7k\2\2\u0cdc\u0cdd\7\u0239\2\2\u0cdd\u0cde\b{\1\2\u0cde"+
		"\u00f5\3\2\2\2\u0cdf\u0ce0\7C\2\2\u0ce0\u0ce5\b|\1\2\u0ce1\u0ce2\7C\2"+
		"\2\u0ce2\u0ce3\7N\2\2\u0ce3\u0ce5\b|\1\2\u0ce4\u0cdf\3\2\2\2\u0ce4\u0ce1"+
		"\3\2\2\2\u0ce5\u00f7\3\2\2\2\u0ce6\u0ce7\7H\2\2\u0ce7\u0cf0\b}\1\2\u0ce8"+
		"\u0ce9\7N\2\2\u0ce9\u0cea\7H\2\2\u0cea\u0cf0\b}\1\2\u0ceb\u0cec\7\u0081"+
		"\2\2\u0cec\u0cf0\b}\1\2\u0ced\u0cee\7\u0080\2\2\u0cee\u0cf0\b}\1\2\u0cef"+
		"\u0ce6\3\2\2\2\u0cef\u0ce8\3\2\2\2\u0cef\u0ceb\3\2\2\2\u0cef\u0ced\3\2"+
		"\2\2\u0cf0\u00f9\3\2\2\2\u0cf1\u0cf2\7<\2\2\u0cf2\u0cf7\b~\1\2\u0cf3\u0cf4"+
		"\7N\2\2\u0cf4\u0cf5\7<\2\2\u0cf5\u0cf7\b~\1\2\u0cf6\u0cf1\3\2\2\2\u0cf6"+
		"\u0cf3\3\2\2\2\u0cf7\u00fb\3\2\2\2\u0cf8\u0cf9\7+\2\2\u0cf9\u0cfe\b\177"+
		"\1\2\u0cfa\u0cfb\7N\2\2\u0cfb\u0cfc\7+\2\2\u0cfc\u0cfe\b\177\1\2\u0cfd"+
		"\u0cf8\3\2\2\2\u0cfd\u0cfa\3\2\2\2\u0cfe\u00fd\3\2\2\2\u0cff\u0d00\t\25"+
		"\2\2\u0d00\u00ff\3\2\2\2\u0d01\u0d02\7\b\2\2\u0d02\u0e16\b\u0081\1\2\u0d03"+
		"\u0d04\7\t\2\2\u0d04\u0e16\b\u0081\1\2\u0d05\u0d06\7\n\2\2\u0d06\u0e16"+
		"\b\u0081\1\2\u0d07\u0d08\7\13\2\2\u0d08\u0e16\b\u0081\1\2\u0d09\u0d0a"+
		"\7\f\2\2\u0d0a\u0e16\b\u0081\1\2\u0d0b\u0d0c\7\r\2\2\u0d0c\u0e16\b\u0081"+
		"\1\2\u0d0d\u0d0e\7\16\2\2\u0d0e\u0e16\b\u0081\1\2\u0d0f\u0d10\7\17\2\2"+
		"\u0d10\u0e16\b\u0081\1\2\u0d11\u0d12\7\20\2\2\u0d12\u0e16\b\u0081\1\2"+
		"\u0d13\u0d14\7\21\2\2\u0d14\u0e16\b\u0081\1\2\u0d15\u0d16\7\22\2\2\u0d16"+
		"\u0e16\b\u0081\1\2\u0d17\u0d18\7\23\2\2\u0d18\u0e16\b\u0081\1\2\u0d19"+
		"\u0d1a\7\24\2\2\u0d1a\u0e16\b\u0081\1\2\u0d1b\u0d1c\7\25\2\2\u0d1c\u0e16"+
		"\b\u0081\1\2\u0d1d\u0d1e\7\26\2\2\u0d1e\u0e16\b\u0081\1\2\u0d1f\u0d20"+
		"\7\27\2\2\u0d20\u0e16\b\u0081\1\2\u0d21\u0d22\7\30\2\2\u0d22\u0e16\b\u0081"+
		"\1\2\u0d23\u0d24\7\31\2\2\u0d24\u0e16\b\u0081\1\2\u0d25\u0d26\7\32\2\2"+
		"\u0d26\u0e16\b\u0081\1\2\u0d27\u0d28\7\33\2\2\u0d28\u0e16\b\u0081\1\2"+
		"\u0d29\u0d2a\7\34\2\2\u0d2a\u0e16\b\u0081\1\2\u0d2b\u0d2c\7\35\2\2\u0d2c"+
		"\u0e16\b\u0081\1\2\u0d2d\u0d2e\7\36\2\2\u0d2e\u0e16\b\u0081\1\2\u0d2f"+
		"\u0d30\7\37\2\2\u0d30\u0e16\b\u0081\1\2\u0d31\u0d32\7 \2\2\u0d32\u0e16"+
		"\b\u0081\1\2\u0d33\u0d34\7!\2\2\u0d34\u0e16\b\u0081\1\2\u0d35\u0d36\7"+
		"\"\2\2\u0d36\u0e16\b\u0081\1\2\u0d37\u0d38\7#\2\2\u0d38\u0e16\b\u0081"+
		"\1\2\u0d39\u0d3a\7$\2\2\u0d3a\u0e16\b\u0081\1\2\u0d3b\u0d3c\7%\2\2\u0d3c"+
		"\u0e16\b\u0081\1\2\u0d3d\u0d3e\7&\2\2\u0d3e\u0e16\b\u0081\1\2\u0d3f\u0d40"+
		"\7\'\2\2\u0d40\u0e16\b\u0081\1\2\u0d41\u0d42\7(\2\2\u0d42\u0e16\b\u0081"+
		"\1\2\u0d43\u0d44\7)\2\2\u0d44\u0e16\b\u0081\1\2\u0d45\u0d46\7*\2\2\u0d46"+
		"\u0e16\b\u0081\1\2\u0d47\u0d48\7+\2\2\u0d48\u0e16\b\u0081\1\2\u0d49\u0d4a"+
		"\7,\2\2\u0d4a\u0e16\b\u0081\1\2\u0d4b\u0d4c\7-\2\2\u0d4c\u0e16\b\u0081"+
		"\1\2\u0d4d\u0d4e\7.\2\2\u0d4e\u0e16\b\u0081\1\2\u0d4f\u0d50\7/\2\2\u0d50"+
		"\u0e16\b\u0081\1\2\u0d51\u0d52\7\60\2\2\u0d52\u0e16\b\u0081\1\2\u0d53"+
		"\u0d54\7\61\2\2\u0d54\u0e16\b\u0081\1\2\u0d55\u0d56\7\62\2\2\u0d56\u0e16"+
		"\b\u0081\1\2\u0d57\u0d58\7\63\2\2\u0d58\u0e16\b\u0081\1\2\u0d59\u0d5a"+
		"\7\64\2\2\u0d5a\u0e16\b\u0081\1\2\u0d5b\u0d5c\7\65\2\2\u0d5c\u0e16\b\u0081"+
		"\1\2\u0d5d\u0d5e\7\66\2\2\u0d5e\u0e16\b\u0081\1\2\u0d5f\u0d60\7\67\2\2"+
		"\u0d60\u0e16\b\u0081\1\2\u0d61\u0d62\78\2\2\u0d62\u0e16\b\u0081\1\2\u0d63"+
		"\u0d64\79\2\2\u0d64\u0e16\b\u0081\1\2\u0d65\u0d66\7:\2\2\u0d66\u0e16\b"+
		"\u0081\1\2\u0d67\u0d68\7;\2\2\u0d68\u0e16\b\u0081\1\2\u0d69\u0d6a\7<\2"+
		"\2\u0d6a\u0e16\b\u0081\1\2\u0d6b\u0d6c\7=\2\2\u0d6c\u0e16\b\u0081\1\2"+
		"\u0d6d\u0d6e\7>\2\2\u0d6e\u0e16\b\u0081\1\2\u0d6f\u0d70\7?\2\2\u0d70\u0e16"+
		"\b\u0081\1\2\u0d71\u0d72\7@\2\2\u0d72\u0e16\b\u0081\1\2\u0d73\u0d74\7"+
		"A\2\2\u0d74\u0e16\b\u0081\1\2\u0d75\u0d76\7B\2\2\u0d76\u0e16\b\u0081\1"+
		"\2\u0d77\u0d78\7C\2\2\u0d78\u0e16\b\u0081\1\2\u0d79\u0d7a\7D\2\2\u0d7a"+
		"\u0e16\b\u0081\1\2\u0d7b\u0d7c\7E\2\2\u0d7c\u0e16\b\u0081\1\2\u0d7d\u0d7e"+
		"\7F\2\2\u0d7e\u0e16\b\u0081\1\2\u0d7f\u0d80\7\u0229\2\2\u0d80\u0e16\b"+
		"\u0081\1\2\u0d81\u0d82\7H\2\2\u0d82\u0e16\b\u0081\1\2\u0d83\u0d84\7I\2"+
		"\2\u0d84\u0e16\b\u0081\1\2\u0d85\u0d86\7J\2\2\u0d86\u0e16\b\u0081\1\2"+
		"\u0d87\u0d88\7K\2\2\u0d88\u0e16\b\u0081\1\2\u0d89\u0d8a\7L\2\2\u0d8a\u0e16"+
		"\b\u0081\1\2\u0d8b\u0d8c\7M\2\2\u0d8c\u0e16\b\u0081\1\2\u0d8d\u0d8e\7"+
		"N\2\2\u0d8e\u0e16\b\u0081\1\2\u0d8f\u0d90\7O\2\2\u0d90\u0e16\b\u0081\1"+
		"\2\u0d91\u0d92\7P\2\2\u0d92\u0e16\b\u0081\1\2\u0d93\u0d94\7Q\2\2\u0d94"+
		"\u0e16\b\u0081\1\2\u0d95\u0d96\7R\2\2\u0d96\u0e16\b\u0081\1\2\u0d97\u0d98"+
		"\7S\2\2\u0d98\u0e16\b\u0081\1\2\u0d99\u0d9a\7T\2\2\u0d9a\u0e16\b\u0081"+
		"\1\2\u0d9b\u0d9c\7U\2\2\u0d9c\u0e16\b\u0081\1\2\u0d9d\u0d9e\7V\2\2\u0d9e"+
		"\u0e16\b\u0081\1\2\u0d9f\u0da0\7W\2\2\u0da0\u0e16\b\u0081\1\2\u0da1\u0da2"+
		"\7X\2\2\u0da2\u0e16\b\u0081\1\2\u0da3\u0da4\7Y\2\2\u0da4\u0e16\b\u0081"+
		"\1\2\u0da5\u0da6\7Z\2\2\u0da6\u0e16\b\u0081\1\2\u0da7\u0da8\7[\2\2\u0da8"+
		"\u0e16\b\u0081\1\2\u0da9\u0daa\7\\\2\2\u0daa\u0e16\b\u0081\1\2\u0dab\u0dac"+
		"\7]\2\2\u0dac\u0e16\b\u0081\1\2\u0dad\u0dae\7^\2\2\u0dae\u0e16\b\u0081"+
		"\1\2\u0daf\u0db0\7_\2\2\u0db0\u0e16\b\u0081\1\2\u0db1\u0db2\7`\2\2\u0db2"+
		"\u0e16\b\u0081\1\2\u0db3\u0db4\7a\2\2\u0db4\u0e16\b\u0081\1\2\u0db5\u0db6"+
		"\7b\2\2\u0db6\u0e16\b\u0081\1\2\u0db7\u0db8\7c\2\2\u0db8\u0e16\b\u0081"+
		"\1\2\u0db9\u0dba\7d\2\2\u0dba\u0e16\b\u0081\1\2\u0dbb\u0dbc\7e\2\2\u0dbc"+
		"\u0e16\b\u0081\1\2\u0dbd\u0dbe\7f\2\2\u0dbe\u0e16\b\u0081\1\2\u0dbf\u0dc0"+
		"\7g\2\2\u0dc0\u0e16\b\u0081\1\2\u0dc1\u0dc2\7h\2\2\u0dc2\u0e16\b\u0081"+
		"\1\2\u0dc3\u0dc4\7i\2\2\u0dc4\u0e16\b\u0081\1\2\u0dc5\u0dc6\7j\2\2\u0dc6"+
		"\u0e16\b\u0081\1\2\u0dc7\u0dc8\7k\2\2\u0dc8\u0e16\b\u0081\1\2\u0dc9\u0dca"+
		"\7l\2\2\u0dca\u0e16\b\u0081\1\2\u0dcb\u0dcc\7m\2\2\u0dcc\u0e16\b\u0081"+
		"\1\2\u0dcd\u0dce\7n\2\2\u0dce\u0e16\b\u0081\1\2\u0dcf\u0dd0\7o\2\2\u0dd0"+
		"\u0e16\b\u0081\1\2\u0dd1\u0dd2\7p\2\2\u0dd2\u0e16\b\u0081\1\2\u0dd3\u0dd4"+
		"\7q\2\2\u0dd4\u0e16\b\u0081\1\2\u0dd5\u0dd6\7r\2\2\u0dd6\u0e16\b\u0081"+
		"\1\2\u0dd7\u0dd8\7s\2\2\u0dd8\u0e16\b\u0081\1\2\u0dd9\u0dda\7t\2\2\u0dda"+
		"\u0e16\b\u0081\1\2\u0ddb\u0ddc\7u\2\2\u0ddc\u0e16\b\u0081\1\2\u0ddd\u0dde"+
		"\7v\2\2\u0dde\u0e16\b\u0081\1\2\u0ddf\u0de0\7w\2\2\u0de0\u0e16\b\u0081"+
		"\1\2\u0de1\u0de2\7x\2\2\u0de2\u0e16\b\u0081\1\2\u0de3\u0de4\7y\2\2\u0de4"+
		"\u0e16\b\u0081\1\2\u0de5\u0de6\7z\2\2\u0de6\u0e16\b\u0081\1\2\u0de7\u0de8"+
		"\7{\2\2\u0de8\u0e16\b\u0081\1\2\u0de9\u0dea\7|\2\2\u0dea\u0e16\b\u0081"+
		"\1\2\u0deb\u0dec\7}\2\2\u0dec\u0e16\b\u0081\1\2\u0ded\u0dee\7~\2\2\u0dee"+
		"\u0e16\b\u0081\1\2\u0def\u0df0\7\177\2\2\u0df0\u0e16\b\u0081\1\2\u0df1"+
		"\u0df2\7\u0080\2\2\u0df2\u0e16\b\u0081\1\2\u0df3\u0df4\7\u0081\2\2\u0df4"+
		"\u0e16\b\u0081\1\2\u0df5\u0df6\7\u0082\2\2\u0df6\u0e16\b\u0081\1\2\u0df7"+
		"\u0df8\7\u0083\2\2\u0df8\u0e16\b\u0081\1\2\u0df9\u0dfa\7\u0084\2\2\u0dfa"+
		"\u0e16\b\u0081\1\2\u0dfb\u0dfc\7\u0085\2\2\u0dfc\u0e16\b\u0081\1\2\u0dfd"+
		"\u0dfe\7\u0086\2\2\u0dfe\u0e16\b\u0081\1\2\u0dff\u0e00\7\u0087\2\2\u0e00"+
		"\u0e16\b\u0081\1\2\u0e01\u0e02\7\u0088\2\2\u0e02\u0e16\b\u0081\1\2\u0e03"+
		"\u0e04\7\u0089\2\2\u0e04\u0e16\b\u0081\1\2\u0e05\u0e06\7\u008a\2\2\u0e06"+
		"\u0e16\b\u0081\1\2\u0e07\u0e08\7\u008b\2\2\u0e08\u0e16\b\u0081\1\2\u0e09"+
		"\u0e0a\7\u008c\2\2\u0e0a\u0e16\b\u0081\1\2\u0e0b\u0e0c\7\u008d\2\2\u0e0c"+
		"\u0e16\b\u0081\1\2\u0e0d\u0e0e\7\u008e\2\2\u0e0e\u0e16\b\u0081\1\2\u0e0f"+
		"\u0e10\7\u008f\2\2\u0e10\u0e16\b\u0081\1\2\u0e11\u0e12\7\u0090\2\2\u0e12"+
		"\u0e16\b\u0081\1\2\u0e13\u0e14\7\u0091\2\2\u0e14\u0e16\b\u0081\1\2\u0e15"+
		"\u0d01\3\2\2\2\u0e15\u0d03\3\2\2\2\u0e15\u0d05\3\2\2\2\u0e15\u0d07\3\2"+
		"\2\2\u0e15\u0d09\3\2\2\2\u0e15\u0d0b\3\2\2\2\u0e15\u0d0d\3\2\2\2\u0e15"+
		"\u0d0f\3\2\2\2\u0e15\u0d11\3\2\2\2\u0e15\u0d13\3\2\2\2\u0e15\u0d15\3\2"+
		"\2\2\u0e15\u0d17\3\2\2\2\u0e15\u0d19\3\2\2\2\u0e15\u0d1b\3\2\2\2\u0e15"+
		"\u0d1d\3\2\2\2\u0e15\u0d1f\3\2\2\2\u0e15\u0d21\3\2\2\2\u0e15\u0d23\3\2"+
		"\2\2\u0e15\u0d25\3\2\2\2\u0e15\u0d27\3\2\2\2\u0e15\u0d29\3\2\2\2\u0e15"+
		"\u0d2b\3\2\2\2\u0e15\u0d2d\3\2\2\2\u0e15\u0d2f\3\2\2\2\u0e15\u0d31\3\2"+
		"\2\2\u0e15\u0d33\3\2\2\2\u0e15\u0d35\3\2\2\2\u0e15\u0d37\3\2\2\2\u0e15"+
		"\u0d39\3\2\2\2\u0e15\u0d3b\3\2\2\2\u0e15\u0d3d\3\2\2\2\u0e15\u0d3f\3\2"+
		"\2\2\u0e15\u0d41\3\2\2\2\u0e15\u0d43\3\2\2\2\u0e15\u0d45\3\2\2\2\u0e15"+
		"\u0d47\3\2\2\2\u0e15\u0d49\3\2\2\2\u0e15\u0d4b\3\2\2\2\u0e15\u0d4d\3\2"+
		"\2\2\u0e15\u0d4f\3\2\2\2\u0e15\u0d51\3\2\2\2\u0e15\u0d53\3\2\2\2\u0e15"+
		"\u0d55\3\2\2\2\u0e15\u0d57\3\2\2\2\u0e15\u0d59\3\2\2\2\u0e15\u0d5b\3\2"+
		"\2\2\u0e15\u0d5d\3\2\2\2\u0e15\u0d5f\3\2\2\2\u0e15\u0d61\3\2\2\2\u0e15"+
		"\u0d63\3\2\2\2\u0e15\u0d65\3\2\2\2\u0e15\u0d67\3\2\2\2\u0e15\u0d69\3\2"+
		"\2\2\u0e15\u0d6b\3\2\2\2\u0e15\u0d6d\3\2\2\2\u0e15\u0d6f\3\2\2\2\u0e15"+
		"\u0d71\3\2\2\2\u0e15\u0d73\3\2\2\2\u0e15\u0d75\3\2\2\2\u0e15\u0d77\3\2"+
		"\2\2\u0e15\u0d79\3\2\2\2\u0e15\u0d7b\3\2\2\2\u0e15\u0d7d\3\2\2\2\u0e15"+
		"\u0d7f\3\2\2\2\u0e15\u0d81\3\2\2\2\u0e15\u0d83\3\2\2\2\u0e15\u0d85\3\2"+
		"\2\2\u0e15\u0d87\3\2\2\2\u0e15\u0d89\3\2\2\2\u0e15\u0d8b\3\2\2\2\u0e15"+
		"\u0d8d\3\2\2\2\u0e15\u0d8f\3\2\2\2\u0e15\u0d91\3\2\2\2\u0e15\u0d93\3\2"+
		"\2\2\u0e15\u0d95\3\2\2\2\u0e15\u0d97\3\2\2\2\u0e15\u0d99\3\2\2\2\u0e15"+
		"\u0d9b\3\2\2\2\u0e15\u0d9d\3\2\2\2\u0e15\u0d9f\3\2\2\2\u0e15\u0da1\3\2"+
		"\2\2\u0e15\u0da3\3\2\2\2\u0e15\u0da5\3\2\2\2\u0e15\u0da7\3\2\2\2\u0e15"+
		"\u0da9\3\2\2\2\u0e15\u0dab\3\2\2\2\u0e15\u0dad\3\2\2\2\u0e15\u0daf\3\2"+
		"\2\2\u0e15\u0db1\3\2\2\2\u0e15\u0db3\3\2\2\2\u0e15\u0db5\3\2\2\2\u0e15"+
		"\u0db7\3\2\2\2\u0e15\u0db9\3\2\2\2\u0e15\u0dbb\3\2\2\2\u0e15\u0dbd\3\2"+
		"\2\2\u0e15\u0dbf\3\2\2\2\u0e15\u0dc1\3\2\2\2\u0e15\u0dc3\3\2\2\2\u0e15"+
		"\u0dc5\3\2\2\2\u0e15\u0dc7\3\2\2\2\u0e15\u0dc9\3\2\2\2\u0e15\u0dcb\3\2"+
		"\2\2\u0e15\u0dcd\3\2\2\2\u0e15\u0dcf\3\2\2\2\u0e15\u0dd1\3\2\2\2\u0e15"+
		"\u0dd3\3\2\2\2\u0e15\u0dd5\3\2\2\2\u0e15\u0dd7\3\2\2\2\u0e15\u0dd9\3\2"+
		"\2\2\u0e15\u0ddb\3\2\2\2\u0e15\u0ddd\3\2\2\2\u0e15\u0ddf\3\2\2\2\u0e15"+
		"\u0de1\3\2\2\2\u0e15\u0de3\3\2\2\2\u0e15\u0de5\3\2\2\2\u0e15\u0de7\3\2"+
		"\2\2\u0e15\u0de9\3\2\2\2\u0e15\u0deb\3\2\2\2\u0e15\u0ded\3\2\2\2\u0e15"+
		"\u0def\3\2\2\2\u0e15\u0df1\3\2\2\2\u0e15\u0df3\3\2\2\2\u0e15\u0df5\3\2"+
		"\2\2\u0e15\u0df7\3\2\2\2\u0e15\u0df9\3\2\2\2\u0e15\u0dfb\3\2\2\2\u0e15"+
		"\u0dfd\3\2\2\2\u0e15\u0dff\3\2\2\2\u0e15\u0e01\3\2\2\2\u0e15\u0e03\3\2"+
		"\2\2\u0e15\u0e05\3\2\2\2\u0e15\u0e07\3\2\2\2\u0e15\u0e09\3\2\2\2\u0e15"+
		"\u0e0b\3\2\2\2\u0e15\u0e0d\3\2\2\2\u0e15\u0e0f\3\2\2\2\u0e15\u0e11\3\2"+
		"\2\2\u0e15\u0e13\3\2\2\2\u0e16\u0101\3\2\2\2\u0e17\u0e18\5\u0104\u0083"+
		"\2\u0e18\u0e19\b\u0082\1\2\u0e19\u0fa3\3\2\2\2\u0e1a\u0e1b\7\u0219\2\2"+
		"\u0e1b\u0fa3\b\u0082\1\2\u0e1c\u0e1d\7\u0092\2\2\u0e1d\u0fa3\b\u0082\1"+
		"\2\u0e1e\u0e1f\7\u0093\2\2\u0e1f\u0fa3\b\u0082\1\2\u0e20\u0e21\7\u0094"+
		"\2\2\u0e21\u0fa3\b\u0082\1\2\u0e22\u0e23\7\u0095\2\2\u0e23\u0fa3\b\u0082"+
		"\1\2\u0e24\u0e25\7\u0096\2\2\u0e25\u0fa3\b\u0082\1\2\u0e26\u0e27\7\u0097"+
		"\2\2\u0e27\u0fa3\b\u0082\1\2\u0e28\u0e29\7\u0098\2\2\u0e29\u0fa3\b\u0082"+
		"\1\2\u0e2a\u0e2b\7\u0099\2\2\u0e2b\u0fa3\b\u0082\1\2\u0e2c\u0e2d\7\u009a"+
		"\2\2\u0e2d\u0fa3\b\u0082\1\2\u0e2e\u0e2f\7\u009b\2\2\u0e2f\u0fa3\b\u0082"+
		"\1\2\u0e30\u0e31\7\u009c\2\2\u0e31\u0fa3\b\u0082\1\2\u0e32\u0e33\7\u009d"+
		"\2\2\u0e33\u0fa3\b\u0082\1\2\u0e34\u0e35\7\u009e\2\2\u0e35\u0fa3\b\u0082"+
		"\1\2\u0e36\u0e37\7\u009f\2\2\u0e37\u0fa3\b\u0082\1\2\u0e38\u0e39\7\u00a0"+
		"\2\2\u0e39\u0fa3\b\u0082\1\2\u0e3a\u0e3b\7\u00a1\2\2\u0e3b\u0fa3\b\u0082"+
		"\1\2\u0e3c\u0e3d\7\u00a2\2\2\u0e3d\u0fa3\b\u0082\1\2\u0e3e\u0e3f\7\u00a3"+
		"\2\2\u0e3f\u0fa3\b\u0082\1\2\u0e40\u0e41\7\u00a4\2\2\u0e41\u0fa3\b\u0082"+
		"\1\2\u0e42\u0e43\7\u00a5\2\2\u0e43\u0fa3\b\u0082\1\2\u0e44\u0e45\7\u00a6"+
		"\2\2\u0e45\u0fa3\b\u0082\1\2\u0e46\u0e47\7\u00a7\2\2\u0e47\u0fa3\b\u0082"+
		"\1\2\u0e48\u0e49\7\u00a8\2\2\u0e49\u0fa3\b\u0082\1\2\u0e4a\u0e4b\7\u00a9"+
		"\2\2\u0e4b\u0fa3\b\u0082\1\2\u0e4c\u0e4d\7\u00aa\2\2\u0e4d\u0fa3\b\u0082"+
		"\1\2\u0e4e\u0e4f\7\u00ab\2\2\u0e4f\u0fa3\b\u0082\1\2\u0e50\u0e51\7\u00ac"+
		"\2\2\u0e51\u0fa3\b\u0082\1\2\u0e52\u0e53\7\u00ad\2\2\u0e53\u0fa3\b\u0082"+
		"\1\2\u0e54\u0e55\7\u00ae\2\2\u0e55\u0fa3\b\u0082\1\2\u0e56\u0e57\7\u00af"+
		"\2\2\u0e57\u0fa3\b\u0082\1\2\u0e58\u0e59\7\u00b0\2\2\u0e59\u0fa3\b\u0082"+
		"\1\2\u0e5a\u0e5b\7\u00b1\2\2\u0e5b\u0fa3\b\u0082\1\2\u0e5c\u0e5d\7\u00b2"+
		"\2\2\u0e5d\u0fa3\b\u0082\1\2\u0e5e\u0e5f\7\u00b3\2\2\u0e5f\u0fa3\b\u0082"+
		"\1\2\u0e60\u0e61\7\u00b4\2\2\u0e61\u0fa3\b\u0082\1\2\u0e62\u0e63\7\u00b5"+
		"\2\2\u0e63\u0fa3\b\u0082\1\2\u0e64\u0e65\7\u00b6\2\2\u0e65\u0fa3\b\u0082"+
		"\1\2\u0e66\u0e67\7\u00b7\2\2\u0e67\u0fa3\b\u0082\1\2\u0e68\u0e69\7\u00b8"+
		"\2\2\u0e69\u0fa3\b\u0082\1\2\u0e6a\u0e6b\7\u00b9\2\2\u0e6b\u0fa3\b\u0082"+
		"\1\2\u0e6c\u0e6d\7\u00ba\2\2\u0e6d\u0fa3\b\u0082\1\2\u0e6e\u0e6f\7\u00bb"+
		"\2\2\u0e6f\u0fa3\b\u0082\1\2\u0e70\u0e71\7\u00bc\2\2\u0e71\u0fa3\b\u0082"+
		"\1\2\u0e72\u0e73\7\u00bd\2\2\u0e73\u0fa3\b\u0082\1\2\u0e74\u0e75\7\u00be"+
		"\2\2\u0e75\u0fa3\b\u0082\1\2\u0e76\u0e77\7\u00bf\2\2\u0e77\u0fa3\b\u0082"+
		"\1\2\u0e78\u0e79\7\u00c0\2\2\u0e79\u0fa3\b\u0082\1\2\u0e7a\u0e7b\7\u00c1"+
		"\2\2\u0e7b\u0fa3\b\u0082\1\2\u0e7c\u0e7d\7\u00c2\2\2\u0e7d\u0fa3\b\u0082"+
		"\1\2\u0e7e\u0e7f\7\u00c3\2\2\u0e7f\u0fa3\b\u0082\1\2\u0e80\u0e81\7\u00c4"+
		"\2\2\u0e81\u0fa3\b\u0082\1\2\u0e82\u0e83\7\u00c5\2\2\u0e83\u0fa3\b\u0082"+
		"\1\2\u0e84\u0e85\7\u00c6\2\2\u0e85\u0fa3\b\u0082\1\2\u0e86\u0e87\7\u00c7"+
		"\2\2\u0e87\u0fa3\b\u0082\1\2\u0e88\u0e89\7\u00c8\2\2\u0e89\u0fa3\b\u0082"+
		"\1\2\u0e8a\u0e8b\7\u00c9\2\2\u0e8b\u0fa3\b\u0082\1\2\u0e8c\u0e8d\7\u00ca"+
		"\2\2\u0e8d\u0fa3\b\u0082\1\2\u0e8e\u0e8f\7\u00cb\2\2\u0e8f\u0fa3\b\u0082"+
		"\1\2\u0e90\u0e91\7\u00cc\2\2\u0e91\u0fa3\b\u0082\1\2\u0e92\u0e93\7\u00cd"+
		"\2\2\u0e93\u0fa3\b\u0082\1\2\u0e94\u0e95\7\u00ce\2\2\u0e95\u0fa3\b\u0082"+
		"\1\2\u0e96\u0e97\7\u00cf\2\2\u0e97\u0fa3\b\u0082\1\2\u0e98\u0e99\7\u00d0"+
		"\2\2\u0e99\u0fa3\b\u0082\1\2\u0e9a\u0e9b\7\u00d1\2\2\u0e9b\u0fa3\b\u0082"+
		"\1\2\u0e9c\u0e9d\7\u00d2\2\2\u0e9d\u0fa3\b\u0082\1\2\u0e9e\u0e9f\7\u00d3"+
		"\2\2\u0e9f\u0fa3\b\u0082\1\2\u0ea0\u0ea1\7\u00d4\2\2\u0ea1\u0fa3\b\u0082"+
		"\1\2\u0ea2\u0ea3\7\u00d5\2\2\u0ea3\u0fa3\b\u0082\1\2\u0ea4\u0ea5\7\u00d6"+
		"\2\2\u0ea5\u0fa3\b\u0082\1\2\u0ea6\u0ea7\7\u00d7\2\2\u0ea7\u0fa3\b\u0082"+
		"\1\2\u0ea8\u0ea9\7\u00d8\2\2\u0ea9\u0fa3\b\u0082\1\2\u0eaa\u0eab\7\u00d9"+
		"\2\2\u0eab\u0fa3\b\u0082\1\2\u0eac\u0ead\7\u00da\2\2\u0ead\u0fa3\b\u0082"+
		"\1\2\u0eae\u0eaf\7\u00db\2\2\u0eaf\u0fa3\b\u0082\1\2\u0eb0\u0eb1\7\u00dc"+
		"\2\2\u0eb1\u0fa3\b\u0082\1\2\u0eb2\u0eb3\7\u00dd\2\2\u0eb3\u0fa3\b\u0082"+
		"\1\2\u0eb4\u0eb5\7\u00de\2\2\u0eb5\u0fa3\b\u0082\1\2\u0eb6\u0eb7\7\u00df"+
		"\2\2\u0eb7\u0fa3\b\u0082\1\2\u0eb8\u0eb9\7\u00e0\2\2\u0eb9\u0fa3\b\u0082"+
		"\1\2\u0eba\u0ebb\7\u00e1\2\2\u0ebb\u0fa3\b\u0082\1\2\u0ebc\u0ebd\7\u00e2"+
		"\2\2\u0ebd\u0fa3\b\u0082\1\2\u0ebe\u0ebf\7\u00e3\2\2\u0ebf\u0fa3\b\u0082"+
		"\1\2\u0ec0\u0ec1\7\u00e4\2\2\u0ec1\u0fa3\b\u0082\1\2\u0ec2\u0ec3\7\u00e5"+
		"\2\2\u0ec3\u0fa3\b\u0082\1\2\u0ec4\u0ec5\7\u00e6\2\2\u0ec5\u0fa3\b\u0082"+
		"\1\2\u0ec6\u0ec7\7\u00e7\2\2\u0ec7\u0fa3\b\u0082\1\2\u0ec8\u0ec9\7\u00e8"+
		"\2\2\u0ec9\u0fa3\b\u0082\1\2\u0eca\u0ecb\7\u00e9\2\2\u0ecb\u0fa3\b\u0082"+
		"\1\2\u0ecc\u0ecd\7\u00ea\2\2\u0ecd\u0fa3\b\u0082\1\2\u0ece\u0ecf\7\u00eb"+
		"\2\2\u0ecf\u0fa3\b\u0082\1\2\u0ed0\u0ed1\7\u00ec\2\2\u0ed1\u0fa3\b\u0082"+
		"\1\2\u0ed2\u0ed3\7\u00ed\2\2\u0ed3\u0fa3\b\u0082\1\2\u0ed4\u0ed5\7\u00ee"+
		"\2\2\u0ed5\u0fa3\b\u0082\1\2\u0ed6\u0ed7\7\u00ef\2\2\u0ed7\u0fa3\b\u0082"+
		"\1\2\u0ed8\u0ed9\7\u00f0\2\2\u0ed9\u0fa3\b\u0082\1\2\u0eda\u0edb\7\u00f1"+
		"\2\2\u0edb\u0fa3\b\u0082\1\2\u0edc\u0edd\7\u00f2\2\2\u0edd\u0fa3\b\u0082"+
		"\1\2\u0ede\u0edf\7\u00f3\2\2\u0edf\u0fa3\b\u0082\1\2\u0ee0\u0ee1\7\u00f4"+
		"\2\2\u0ee1\u0fa3\b\u0082\1\2\u0ee2\u0ee3\7\u00f5\2\2\u0ee3\u0fa3\b\u0082"+
		"\1\2\u0ee4\u0ee5\7\u00f6\2\2\u0ee5\u0fa3\b\u0082\1\2\u0ee6\u0ee7\7\u00f7"+
		"\2\2\u0ee7\u0fa3\b\u0082\1\2\u0ee8\u0ee9\7\u00f8\2\2\u0ee9\u0fa3\b\u0082"+
		"\1\2\u0eea\u0eeb\7\u00f9\2\2\u0eeb\u0fa3\b\u0082\1\2\u0eec\u0eed\7\u00fa"+
		"\2\2\u0eed\u0fa3\b\u0082\1\2\u0eee\u0eef\7\u00fb\2\2\u0eef\u0fa3\b\u0082"+
		"\1\2\u0ef0\u0ef1\7\u00fc\2\2\u0ef1\u0fa3\b\u0082\1\2\u0ef2\u0ef3\7\u00fd"+
		"\2\2\u0ef3\u0fa3\b\u0082\1\2\u0ef4\u0ef5\7\u00fe\2\2\u0ef5\u0fa3\b\u0082"+
		"\1\2\u0ef6\u0ef7\7\u00ff\2\2\u0ef7\u0fa3\b\u0082\1\2\u0ef8\u0ef9\7\u0100"+
		"\2\2\u0ef9\u0fa3\b\u0082\1\2\u0efa\u0efb\7\u0101\2\2\u0efb\u0fa3\b\u0082"+
		"\1\2\u0efc\u0efd\7\u0102\2\2\u0efd\u0fa3\b\u0082\1\2\u0efe\u0eff\7\u0103"+
		"\2\2\u0eff\u0fa3\b\u0082\1\2\u0f00\u0f01\7\u0104\2\2\u0f01\u0fa3\b\u0082"+
		"\1\2\u0f02\u0f03\7\u0105\2\2\u0f03\u0fa3\b\u0082\1\2\u0f04\u0f05\7\u0106"+
		"\2\2\u0f05\u0fa3\b\u0082\1\2\u0f06\u0f07\7\u0107\2\2\u0f07\u0fa3\b\u0082"+
		"\1\2\u0f08\u0f09\7\u0108\2\2\u0f09\u0fa3\b\u0082\1\2\u0f0a\u0f0b\7\u0109"+
		"\2\2\u0f0b\u0fa3\b\u0082\1\2\u0f0c\u0f0d\7\u010a\2\2\u0f0d\u0fa3\b\u0082"+
		"\1\2\u0f0e\u0f0f\7\u010b\2\2\u0f0f\u0fa3\b\u0082\1\2\u0f10\u0f11\7\u010c"+
		"\2\2\u0f11\u0fa3\b\u0082\1\2\u0f12\u0f13\7\u010d\2\2\u0f13\u0fa3\b\u0082"+
		"\1\2\u0f14\u0f15\7\u010e\2\2\u0f15\u0fa3\b\u0082\1\2\u0f16\u0f17\7\u010f"+
		"\2\2\u0f17\u0fa3\b\u0082\1\2\u0f18\u0f19\7\u0110\2\2\u0f19\u0fa3\b\u0082"+
		"\1\2\u0f1a\u0f1b\7\u0111\2\2\u0f1b\u0fa3\b\u0082\1\2\u0f1c\u0f1d\7\u0112"+
		"\2\2\u0f1d\u0fa3\b\u0082\1\2\u0f1e\u0f1f\7\u0113\2\2\u0f1f\u0fa3\b\u0082"+
		"\1\2\u0f20\u0f21\7\u0114\2\2\u0f21\u0fa3\b\u0082\1\2\u0f22\u0f23\7\u0115"+
		"\2\2\u0f23\u0fa3\b\u0082\1\2\u0f24\u0f25\7\u0116\2\2\u0f25\u0fa3\b\u0082"+
		"\1\2\u0f26\u0f27\7\u0117\2\2\u0f27\u0fa3\b\u0082\1\2\u0f28\u0f29\7\u0118"+
		"\2\2\u0f29\u0fa3\b\u0082\1\2\u0f2a\u0f2b\7\u0119\2\2\u0f2b\u0fa3\b\u0082"+
		"\1\2\u0f2c\u0f2d\7\u011a\2\2\u0f2d\u0fa3\b\u0082\1\2\u0f2e\u0f2f\7\u011b"+
		"\2\2\u0f2f\u0fa3\b\u0082\1\2\u0f30\u0f31\7\u011c\2\2\u0f31\u0fa3\b\u0082"+
		"\1\2\u0f32\u0f33\7\u011d\2\2\u0f33\u0fa3\b\u0082\1\2\u0f34\u0f35\7\u011e"+
		"\2\2\u0f35\u0fa3\b\u0082\1\2\u0f36\u0f37\7\u011f\2\2\u0f37\u0fa3\b\u0082"+
		"\1\2\u0f38\u0f39\7\u0120\2\2\u0f39\u0fa3\b\u0082\1\2\u0f3a\u0f3b\7\u0121"+
		"\2\2\u0f3b\u0fa3\b\u0082\1\2\u0f3c\u0f3d\7\u0122\2\2\u0f3d\u0fa3\b\u0082"+
		"\1\2\u0f3e\u0f3f\7\u0123\2\2\u0f3f\u0fa3\b\u0082\1\2\u0f40\u0f41\7\u0124"+
		"\2\2\u0f41\u0fa3\b\u0082\1\2\u0f42\u0f43\7\u0125\2\2\u0f43\u0fa3\b\u0082"+
		"\1\2\u0f44\u0f45\7\u0126\2\2\u0f45\u0fa3\b\u0082\1\2\u0f46\u0f47\7\u0127"+
		"\2\2\u0f47\u0fa3\b\u0082\1\2\u0f48\u0f49\7\u0128\2\2\u0f49\u0fa3\b\u0082"+
		"\1\2\u0f4a\u0f4b\7\u0129\2\2\u0f4b\u0fa3\b\u0082\1\2\u0f4c\u0f4d\7\u012a"+
		"\2\2\u0f4d\u0fa3\b\u0082\1\2\u0f4e\u0f4f\7\u012b\2\2\u0f4f\u0fa3\b\u0082"+
		"\1\2\u0f50\u0f51\7\u012c\2\2\u0f51\u0fa3\b\u0082\1\2\u0f52\u0f53\7\u012d"+
		"\2\2\u0f53\u0fa3\b\u0082\1\2\u0f54\u0f55\7\u012e\2\2\u0f55\u0fa3\b\u0082"+
		"\1\2\u0f56\u0f57\7\u012f\2\2\u0f57\u0fa3\b\u0082\1\2\u0f58\u0f59\7\u0130"+
		"\2\2\u0f59\u0fa3\b\u0082\1\2\u0f5a\u0f5b\7\u0131\2\2\u0f5b\u0fa3\b\u0082"+
		"\1\2\u0f5c\u0f5d\7\u0132\2\2\u0f5d\u0fa3\b\u0082\1\2\u0f5e\u0f5f\7\u0133"+
		"\2\2\u0f5f\u0fa3\b\u0082\1\2\u0f60\u0f61\7\u0134\2\2\u0f61\u0fa3\b\u0082"+
		"\1\2\u0f62\u0f63\7\u0135\2\2\u0f63\u0fa3\b\u0082\1\2\u0f64\u0f65\7\u0136"+
		"\2\2\u0f65\u0fa3\b\u0082\1\2\u0f66\u0f67\7\u0137\2\2\u0f67\u0fa3\b\u0082"+
		"\1\2\u0f68\u0f69\7\u0138\2\2\u0f69\u0fa3\b\u0082\1\2\u0f6a\u0f6b\7\u0139"+
		"\2\2\u0f6b\u0fa3\b\u0082\1\2\u0f6c\u0f6d\7\u013a\2\2\u0f6d\u0fa3\b\u0082"+
		"\1\2\u0f6e\u0f6f\7\u013b\2\2\u0f6f\u0fa3\b\u0082\1\2\u0f70\u0f71\7\u013c"+
		"\2\2\u0f71\u0fa3\b\u0082\1\2\u0f72\u0f73\7\u013d\2\2\u0f73\u0fa3\b\u0082"+
		"\1\2\u0f74\u0f75\7\u013e\2\2\u0f75\u0fa3\b\u0082\1\2\u0f76\u0f77\7\u013f"+
		"\2\2\u0f77\u0fa3\b\u0082\1\2\u0f78\u0f79\7\u0140\2\2\u0f79\u0fa3\b\u0082"+
		"\1\2\u0f7a\u0f7b\7\u0141\2\2\u0f7b\u0fa3\b\u0082\1\2\u0f7c\u0f7d\7\u0142"+
		"\2\2\u0f7d\u0fa3\b\u0082\1\2\u0f7e\u0f7f\7\u0143\2\2\u0f7f\u0fa3\b\u0082"+
		"\1\2\u0f80\u0f81\7\u0144\2\2\u0f81\u0fa3\b\u0082\1\2\u0f82\u0f83\7\u0145"+
		"\2\2\u0f83\u0fa3\b\u0082\1\2\u0f84\u0f85\7\u01f9\2\2\u0f85\u0fa3\b\u0082"+
		"\1\2\u0f86\u0f87\7\u0206\2\2\u0f87\u0fa3\b\u0082\1\2\u0f88\u0f89\7\u020c"+
		"\2\2\u0f89\u0fa3\b\u0082\1\2\u0f8a\u0f8b\7\u020d\2\2\u0f8b\u0fa3\b\u0082"+
		"\1\2\u0f8c\u0f8d\7\u020e\2\2\u0f8d\u0fa3\b\u0082\1\2\u0f8e\u0f8f\7\u020f"+
		"\2\2\u0f8f\u0fa3\b\u0082\1\2\u0f90\u0f91\7\u0210\2\2\u0f91\u0fa3\b\u0082"+
		"\1\2\u0f92\u0f93\7\u0211\2\2\u0f93\u0fa3\b\u0082\1\2\u0f94\u0f95\7\u0212"+
		"\2\2\u0f95\u0fa3\b\u0082\1\2\u0f96\u0f97\7\u0213\2\2\u0f97\u0fa3\b\u0082"+
		"\1\2\u0f98\u0f99\7\u0214\2\2\u0f99\u0fa3\b\u0082\1\2\u0f9a\u0f9b\7\u0215"+
		"\2\2\u0f9b\u0fa3\b\u0082\1\2\u0f9c\u0f9d\7\u0216\2\2\u0f9d\u0fa3\b\u0082"+
		"\1\2\u0f9e\u0f9f\7\u0217\2\2\u0f9f\u0fa3\b\u0082\1\2\u0fa0\u0fa1\7\u0218"+
		"\2\2\u0fa1\u0fa3\b\u0082\1\2\u0fa2\u0e17\3\2\2\2\u0fa2\u0e1a\3\2\2\2\u0fa2"+
		"\u0e1c\3\2\2\2\u0fa2\u0e1e\3\2\2\2\u0fa2\u0e20\3\2\2\2\u0fa2\u0e22\3\2"+
		"\2\2\u0fa2\u0e24\3\2\2\2\u0fa2\u0e26\3\2\2\2\u0fa2\u0e28\3\2\2\2\u0fa2"+
		"\u0e2a\3\2\2\2\u0fa2\u0e2c\3\2\2\2\u0fa2\u0e2e\3\2\2\2\u0fa2\u0e30\3\2"+
		"\2\2\u0fa2\u0e32\3\2\2\2\u0fa2\u0e34\3\2\2\2\u0fa2\u0e36\3\2\2\2\u0fa2"+
		"\u0e38\3\2\2\2\u0fa2\u0e3a\3\2\2\2\u0fa2\u0e3c\3\2\2\2\u0fa2\u0e3e\3\2"+
		"\2\2\u0fa2\u0e40\3\2\2\2\u0fa2\u0e42\3\2\2\2\u0fa2\u0e44\3\2\2\2\u0fa2"+
		"\u0e46\3\2\2\2\u0fa2\u0e48\3\2\2\2\u0fa2\u0e4a\3\2\2\2\u0fa2\u0e4c\3\2"+
		"\2\2\u0fa2\u0e4e\3\2\2\2\u0fa2\u0e50\3\2\2\2\u0fa2\u0e52\3\2\2\2\u0fa2"+
		"\u0e54\3\2\2\2\u0fa2\u0e56\3\2\2\2\u0fa2\u0e58\3\2\2\2\u0fa2\u0e5a\3\2"+
		"\2\2\u0fa2\u0e5c\3\2\2\2\u0fa2\u0e5e\3\2\2\2\u0fa2\u0e60\3\2\2\2\u0fa2"+
		"\u0e62\3\2\2\2\u0fa2\u0e64\3\2\2\2\u0fa2\u0e66\3\2\2\2\u0fa2\u0e68\3\2"+
		"\2\2\u0fa2\u0e6a\3\2\2\2\u0fa2\u0e6c\3\2\2\2\u0fa2\u0e6e\3\2\2\2\u0fa2"+
		"\u0e70\3\2\2\2\u0fa2\u0e72\3\2\2\2\u0fa2\u0e74\3\2\2\2\u0fa2\u0e76\3\2"+
		"\2\2\u0fa2\u0e78\3\2\2\2\u0fa2\u0e7a\3\2\2\2\u0fa2\u0e7c\3\2\2\2\u0fa2"+
		"\u0e7e\3\2\2\2\u0fa2\u0e80\3\2\2\2\u0fa2\u0e82\3\2\2\2\u0fa2\u0e84\3\2"+
		"\2\2\u0fa2\u0e86\3\2\2\2\u0fa2\u0e88\3\2\2\2\u0fa2\u0e8a\3\2\2\2\u0fa2"+
		"\u0e8c\3\2\2\2\u0fa2\u0e8e\3\2\2\2\u0fa2\u0e90\3\2\2\2\u0fa2\u0e92\3\2"+
		"\2\2\u0fa2\u0e94\3\2\2\2\u0fa2\u0e96\3\2\2\2\u0fa2\u0e98\3\2\2\2\u0fa2"+
		"\u0e9a\3\2\2\2\u0fa2\u0e9c\3\2\2\2\u0fa2\u0e9e\3\2\2\2\u0fa2\u0ea0\3\2"+
		"\2\2\u0fa2\u0ea2\3\2\2\2\u0fa2\u0ea4\3\2\2\2\u0fa2\u0ea6\3\2\2\2\u0fa2"+
		"\u0ea8\3\2\2\2\u0fa2\u0eaa\3\2\2\2\u0fa2\u0eac\3\2\2\2\u0fa2\u0eae\3\2"+
		"\2\2\u0fa2\u0eb0\3\2\2\2\u0fa2\u0eb2\3\2\2\2\u0fa2\u0eb4\3\2\2\2\u0fa2"+
		"\u0eb6\3\2\2\2\u0fa2\u0eb8\3\2\2\2\u0fa2\u0eba\3\2\2\2\u0fa2\u0ebc\3\2"+
		"\2\2\u0fa2\u0ebe\3\2\2\2\u0fa2\u0ec0\3\2\2\2\u0fa2\u0ec2\3\2\2\2\u0fa2"+
		"\u0ec4\3\2\2\2\u0fa2\u0ec6\3\2\2\2\u0fa2\u0ec8\3\2\2\2\u0fa2\u0eca\3\2"+
		"\2\2\u0fa2\u0ecc\3\2\2\2\u0fa2\u0ece\3\2\2\2\u0fa2\u0ed0\3\2\2\2\u0fa2"+
		"\u0ed2\3\2\2\2\u0fa2\u0ed4\3\2\2\2\u0fa2\u0ed6\3\2\2\2\u0fa2\u0ed8\3\2"+
		"\2\2\u0fa2\u0eda\3\2\2\2\u0fa2\u0edc\3\2\2\2\u0fa2\u0ede\3\2\2\2\u0fa2"+
		"\u0ee0\3\2\2\2\u0fa2\u0ee2\3\2\2\2\u0fa2\u0ee4\3\2\2\2\u0fa2\u0ee6\3\2"+
		"\2\2\u0fa2\u0ee8\3\2\2\2\u0fa2\u0eea\3\2\2\2\u0fa2\u0eec\3\2\2\2\u0fa2"+
		"\u0eee\3\2\2\2\u0fa2\u0ef0\3\2\2\2\u0fa2\u0ef2\3\2\2\2\u0fa2\u0ef4\3\2"+
		"\2\2\u0fa2\u0ef6\3\2\2\2\u0fa2\u0ef8\3\2\2\2\u0fa2\u0efa\3\2\2\2\u0fa2"+
		"\u0efc\3\2\2\2\u0fa2\u0efe\3\2\2\2\u0fa2\u0f00\3\2\2\2\u0fa2\u0f02\3\2"+
		"\2\2\u0fa2\u0f04\3\2\2\2\u0fa2\u0f06\3\2\2\2\u0fa2\u0f08\3\2\2\2\u0fa2"+
		"\u0f0a\3\2\2\2\u0fa2\u0f0c\3\2\2\2\u0fa2\u0f0e\3\2\2\2\u0fa2\u0f10\3\2"+
		"\2\2\u0fa2\u0f12\3\2\2\2\u0fa2\u0f14\3\2\2\2\u0fa2\u0f16\3\2\2\2\u0fa2"+
		"\u0f18\3\2\2\2\u0fa2\u0f1a\3\2\2\2\u0fa2\u0f1c\3\2\2\2\u0fa2\u0f1e\3\2"+
		"\2\2\u0fa2\u0f20\3\2\2\2\u0fa2\u0f22\3\2\2\2\u0fa2\u0f24\3\2\2\2\u0fa2"+
		"\u0f26\3\2\2\2\u0fa2\u0f28\3\2\2\2\u0fa2\u0f2a\3\2\2\2\u0fa2\u0f2c\3\2"+
		"\2\2\u0fa2\u0f2e\3\2\2\2\u0fa2\u0f30\3\2\2\2\u0fa2\u0f32\3\2\2\2\u0fa2"+
		"\u0f34\3\2\2\2\u0fa2\u0f36\3\2\2\2\u0fa2\u0f38\3\2\2\2\u0fa2\u0f3a\3\2"+
		"\2\2\u0fa2\u0f3c\3\2\2\2\u0fa2\u0f3e\3\2\2\2\u0fa2\u0f40\3\2\2\2\u0fa2"+
		"\u0f42\3\2\2\2\u0fa2\u0f44\3\2\2\2\u0fa2\u0f46\3\2\2\2\u0fa2\u0f48\3\2"+
		"\2\2\u0fa2\u0f4a\3\2\2\2\u0fa2\u0f4c\3\2\2\2\u0fa2\u0f4e\3\2\2\2\u0fa2"+
		"\u0f50\3\2\2\2\u0fa2\u0f52\3\2\2\2\u0fa2\u0f54\3\2\2\2\u0fa2\u0f56\3\2"+
		"\2\2\u0fa2\u0f58\3\2\2\2\u0fa2\u0f5a\3\2\2\2\u0fa2\u0f5c\3\2\2\2\u0fa2"+
		"\u0f5e\3\2\2\2\u0fa2\u0f60\3\2\2\2\u0fa2\u0f62\3\2\2\2\u0fa2\u0f64\3\2"+
		"\2\2\u0fa2\u0f66\3\2\2\2\u0fa2\u0f68\3\2\2\2\u0fa2\u0f6a\3\2\2\2\u0fa2"+
		"\u0f6c\3\2\2\2\u0fa2\u0f6e\3\2\2\2\u0fa2\u0f70\3\2\2\2\u0fa2\u0f72\3\2"+
		"\2\2\u0fa2\u0f74\3\2\2\2\u0fa2\u0f76\3\2\2\2\u0fa2\u0f78\3\2\2\2\u0fa2"+
		"\u0f7a\3\2\2\2\u0fa2\u0f7c\3\2\2\2\u0fa2\u0f7e\3\2\2\2\u0fa2\u0f80\3\2"+
		"\2\2\u0fa2\u0f82\3\2\2\2\u0fa2\u0f84\3\2\2\2\u0fa2\u0f86\3\2\2\2\u0fa2"+
		"\u0f88\3\2\2\2\u0fa2\u0f8a\3\2\2\2\u0fa2\u0f8c\3\2\2\2\u0fa2\u0f8e\3\2"+
		"\2\2\u0fa2\u0f90\3\2\2\2\u0fa2\u0f92\3\2\2\2\u0fa2\u0f94\3\2\2\2\u0fa2"+
		"\u0f96\3\2\2\2\u0fa2\u0f98\3\2\2\2\u0fa2\u0f9a\3\2\2\2\u0fa2\u0f9c\3\2"+
		"\2\2\u0fa2\u0f9e\3\2\2\2\u0fa2\u0fa0\3\2\2\2\u0fa3\u0103\3\2\2\2\u0fa4"+
		"\u0fa5\7\u01a0\2\2\u0fa5\u114f\b\u0083\1\2\u0fa6\u0fa7\7\u01bc\2\2\u0fa7"+
		"\u114f\b\u0083\1\2\u0fa8\u0fa9\7\u016b\2\2\u0fa9\u114f\b\u0083\1\2\u0faa"+
		"\u0fab\7\u019d\2\2\u0fab\u114f\b\u0083\1\2\u0fac\u0fad\7\u01b7\2\2\u0fad"+
		"\u114f\b\u0083\1\2\u0fae\u0faf\7\u0155\2\2\u0faf\u114f\b\u0083\1\2\u0fb0"+
		"\u0fb1\7\u01be\2\2\u0fb1\u114f\b\u0083\1\2\u0fb2\u0fb3\7\u0173\2\2\u0fb3"+
		"\u114f\b\u0083\1\2\u0fb4\u0fb5\7)\2\2\u0fb5\u114f\b\u0083\1\2\u0fb6\u0fb7"+
		"\7\u016e\2\2\u0fb7\u114f\b\u0083\1\2\u0fb8\u0fb9\7\u0154\2\2\u0fb9\u114f"+
		"\b\u0083\1\2\u0fba\u0fbb\7\u018a\2\2\u0fbb\u114f\b\u0083\1\2\u0fbc\u0fbd"+
		"\7\u0163\2\2\u0fbd\u114f\b\u0083\1\2\u0fbe\u0fbf\7\u01b6\2\2\u0fbf\u114f"+
		"\b\u0083\1\2\u0fc0\u0fc1\7\u01cd\2\2\u0fc1\u114f\b\u0083\1\2\u0fc2\u0fc3"+
		"\7\u015a\2\2\u0fc3\u114f\b\u0083\1\2\u0fc4\u0fc5\7\u01ad\2\2\u0fc5\u114f"+
		"\b\u0083\1\2\u0fc6\u0fc7\7\20\2\2\u0fc7\u114f\b\u0083\1\2\u0fc8\u0fc9"+
		"\7\u00a7\2\2\u0fc9\u114f\b\u0083\1\2\u0fca\u0fcb\7\u0148\2\2\u0fcb\u114f"+
		"\b\u0083\1\2\u0fcc\u0fcd\7\u0191\2\2\u0fcd\u114f\b\u0083\1\2\u0fce\u0fcf"+
		"\7\u017e\2\2\u0fcf\u114f\b\u0083\1\2\u0fd0\u0fd1\7\u0179\2\2\u0fd1\u114f"+
		"\b\u0083\1\2\u0fd2\u0fd3\7\u019c\2\2\u0fd3\u114f\b\u0083\1\2\u0fd4\u0fd5"+
		"\7\u0169\2\2\u0fd5\u114f\b\u0083\1\2\u0fd6\u0fd7\7\u01df\2\2\u0fd7\u114f"+
		"\b\u0083\1\2\u0fd8\u0fd9\7\u01a3\2\2\u0fd9\u114f\b\u0083\1\2\u0fda\u0fdb"+
		"\7\u01a6\2\2\u0fdb\u114f\b\u0083\1\2\u0fdc\u0fdd\7\u0188\2\2\u0fdd\u114f"+
		"\b\u0083\1\2\u0fde\u0fdf\7\u01a1\2\2\u0fdf\u114f\b\u0083\1\2\u0fe0\u0fe1"+
		"\7\u017d\2\2\u0fe1\u114f\b\u0083\1\2\u0fe2\u0fe3\7\u017f\2\2\u0fe3\u114f"+
		"\b\u0083\1\2\u0fe4\u0fe5\7\u0198\2\2\u0fe5\u114f\b\u0083\1\2\u0fe6\u0fe7"+
		"\7\u01b9\2\2\u0fe7\u114f\b\u0083\1\2\u0fe8\u0fe9\7\u0156\2\2\u0fe9\u114f"+
		"\b\u0083\1\2\u0fea\u0feb\7\u014a\2\2\u0feb\u114f\b\u0083\1\2\u0fec\u0fed"+
		"\7\u01a7\2\2\u0fed\u114f\b\u0083\1\2\u0fee\u0fef\7\u01e5\2\2\u0fef\u114f"+
		"\b\u0083\1\2\u0ff0\u0ff1\7\u01b2\2\2\u0ff1\u114f\b\u0083\1\2\u0ff2\u0ff3"+
		"\7\u0172\2\2\u0ff3\u114f\b\u0083\1\2\u0ff4\u0ff5\7\u008a\2\2\u0ff5\u114f"+
		"\b\u0083\1\2\u0ff6\u0ff7\7\u0139\2\2\u0ff7\u114f\b\u0083\1\2\u0ff8\u0ff9"+
		"\7\u01f3\2\2\u0ff9\u114f\b\u0083\1\2\u0ffa\u0ffb\7\u01c2\2\2\u0ffb\u114f"+
		"\b\u0083\1\2\u0ffc\u0ffd\7\u01dc\2\2\u0ffd\u114f\b\u0083\1\2\u0ffe\u0fff"+
		"\7\u018e\2\2\u0fff\u114f\b\u0083\1\2\u1000\u1001\7\u01e3\2\2\u1001\u114f"+
		"\b\u0083\1\2\u1002\u1003\7\u014e\2\2\u1003\u114f\b\u0083\1\2\u1004\u1005"+
		"\7\u01cf\2\2\u1005\u114f\b\u0083\1\2\u1006\u1007\7R\2\2\u1007\u114f\b"+
		"\u0083\1\2\u1008\u1009\7\u0190\2\2\u1009\u114f\b\u0083\1\2\u100a\u100b"+
		"\7\u018c\2\2\u100b\u114f\b\u0083\1\2\u100c\u100d\7\u019e\2\2\u100d\u114f"+
		"\b\u0083\1\2\u100e\u100f\7\u01da\2\2\u100f\u114f\b\u0083\1\2\u1010\u1011"+
		"\7\u01b8\2\2\u1011\u114f\b\u0083\1\2\u1012\u1013\7\u0160\2\2\u1013\u114f"+
		"\b\u0083\1\2\u1014\u1015\7\u015c\2\2\u1015\u114f\b\u0083\1\2\u1016\u1017"+
		"\7\u019f\2\2\u1017\u114f\b\u0083\1\2\u1018\u1019\7\u01f2\2\2\u1019\u114f"+
		"\b\u0083\1\2\u101a\u101b\7\u0194\2\2\u101b\u114f\b\u0083\1\2\u101c\u101d"+
		"\7\u00f7\2\2\u101d\u114f\b\u0083\1\2\u101e\u101f\7\u01d4\2\2\u101f\u114f"+
		"\b\u0083\1\2\u1020\u1021\7\u00ac\2\2\u1021\u114f\b\u0083\1\2\u1022\u1023"+
		"\7\u018f\2\2\u1023\u114f\b\u0083\1\2\u1024\u1025\7\u01c4\2\2\u1025\u114f"+
		"\b\u0083\1\2\u1026\u1027\7\u016f\2\2\u1027\u114f\b\u0083\1\2\u1028\u1029"+
		"\7\u00dd\2\2\u1029\u114f\b\u0083\1\2\u102a\u102b\7\u0187\2\2\u102b\u114f"+
		"\b\u0083\1\2\u102c\u102d\7\u01c0\2\2\u102d\u114f\b\u0083\1\2\u102e\u102f"+
		"\7\u0149\2\2\u102f\u114f\b\u0083\1\2\u1030\u1031\7\u0183\2\2\u1031\u114f"+
		"\b\u0083\1\2\u1032\u1033\7\u01b5\2\2\u1033\u114f\b\u0083\1\2\u1034\u1035"+
		"\7\25\2\2\u1035\u114f\b\u0083\1\2\u1036\u1037\7\u0199\2\2\u1037\u114f"+
		"\b\u0083\1\2\u1038\u1039\7\u01c8\2\2\u1039\u114f\b\u0083\1\2\u103a\u103b"+
		"\7\u0171\2\2\u103b\u114f\b\u0083\1\2\u103c\u103d\7\u0193\2\2\u103d\u114f"+
		"\b\u0083\1\2\u103e\u103f\7\u018d\2\2\u103f\u114f\b\u0083\1\2\u1040\u1041"+
		"\7\u015b\2\2\u1041\u114f\b\u0083\1\2\u1042\u1043\7\u01e2\2\2\u1043\u114f"+
		"\b\u0083\1\2\u1044\u1045\7\u01c7\2\2\u1045\u114f\b\u0083\1\2\u1046\u1047"+
		"\7\u0150\2\2\u1047\u114f\b\u0083\1\2\u1048\u1049\7\u00de\2\2\u1049\u114f"+
		"\b\u0083\1\2\u104a\u104b\7\u0174\2\2\u104b\u114f\b\u0083\1\2\u104c\u104d"+
		"\7\u01ae\2\2\u104d\u114f\b\u0083\1\2\u104e\u104f\7\u0165\2\2\u104f\u114f"+
		"\b\u0083\1\2\u1050\u1051\7\u0196\2\2\u1051\u114f\b\u0083\1\2\u1052\u1053"+
		"\7\u00ff\2\2\u1053\u114f\b\u0083\1\2\u1054\u1055\7\u01c6\2\2\u1055\u114f"+
		"\b\u0083\1\2\u1056\u1057\7\u01f8\2\2\u1057\u114f\b\u0083\1\2\u1058\u1059"+
		"\7\u0161\2\2\u1059\u114f\b\u0083\1\2\u105a\u105b\7\u0182\2\2\u105b\u114f"+
		"\b\u0083\1\2\u105c\u105d\7\u0223\2\2\u105d\u114f\b\u0083\1\2\u105e\u105f"+
		"\7\u0192\2\2\u105f\u114f\b\u0083\1\2\u1060\u1061\7\u0157\2\2\u1061\u114f"+
		"\b\u0083\1\2\u1062\u1063\7\u01a2\2\2\u1063\u114f\b\u0083\1\2\u1064\u1065"+
		"\7\u01f6\2\2\u1065\u114f\b\u0083\1\2\u1066\u1067\7\u01d9\2\2\u1067\u114f"+
		"\b\u0083\1\2\u1068\u1069\7\u01a9\2\2\u1069\u114f\b\u0083\1\2\u106a\u106b"+
		"\7\u01ee\2\2\u106b\u114f\b\u0083\1\2\u106c\u106d\7\u01ec\2\2\u106d\u114f"+
		"\b\u0083\1\2\u106e\u106f\7\n\2\2\u106f\u114f\b\u0083\1\2\u1070\u1071\7"+
		"\u0184\2\2\u1071\u114f\b\u0083\1\2\u1072\u1073\7\u01bf\2\2\u1073\u114f"+
		"\b\u0083\1\2\u1074\u1075\7\u01b0\2\2\u1075\u114f\b\u0083\1\2\u1076\u1077"+
		"\7\u01e9\2\2\u1077\u114f\b\u0083\1\2\u1078\u1079\7\u016c\2\2\u1079\u114f"+
		"\b\u0083\1\2\u107a\u107b\7\u01ab\2\2\u107b\u114f\b\u0083\1\2\u107c\u107d"+
		"\7\u01d0\2\2\u107d\u114f\b\u0083\1\2\u107e\u107f\7\u016a\2\2\u107f\u114f"+
		"\b\u0083\1\2\u1080\u1081\7\u019a\2\2\u1081\u114f\b\u0083\1\2\u1082\u1083"+
		"\7\u0125\2\2\u1083\u114f\b\u0083\1\2\u1084\u1085\7\u01b4\2\2\u1085\u114f"+
		"\b\u0083\1\2\u1086\u1087\7\u01d1\2\2\u1087\u114f\b\u0083\1\2\u1088\u1089"+
		"\7\u014f\2\2\u1089\u114f\b\u0083\1\2\u108a\u108b\7\u0162\2\2\u108b\u114f"+
		"\b\u0083\1\2\u108c\u108d\7\u01ed\2\2\u108d\u114f\b\u0083\1\2\u108e\u108f"+
		"\7\u01e1\2\2\u108f\u114f\b\u0083\1\2\u1090\u1091\7\u01de\2\2\u1091\u114f"+
		"\b\u0083\1\2\u1092\u1093\7\u01e0\2\2\u1093\u114f\b\u0083\1\2\u1094\u1095"+
		"\7\u01ca\2\2\u1095\u114f\b\u0083\1\2\u1096\u1097\7\u0178\2\2\u1097\u114f"+
		"\b\u0083\1\2\u1098\u1099\7\u01ce\2\2\u1099\u114f\b\u0083\1\2\u109a\u109b"+
		"\7\u017b\2\2\u109b\u114f\b\u0083\1\2\u109c\u109d\7\u015e\2\2\u109d\u114f"+
		"\b\u0083\1\2\u109e\u109f\7\u01c5\2\2\u109f\u114f\b\u0083\1\2\u10a0\u10a1"+
		"\7\u0195\2\2\u10a1\u114f\b\u0083\1\2\u10a2\u10a3\7\u01e8\2\2\u10a3\u114f"+
		"\b\u0083\1\2\u10a4\u10a5\7\u014c\2\2\u10a5\u114f\b\u0083\1\2\u10a6\u10a7"+
		"\7\u00ea\2\2\u10a7\u114f\b\u0083\1\2\u10a8\u10a9\7\u0151\2\2\u10a9\u114f"+
		"\b\u0083\1\2\u10aa\u10ab\7\u0186\2\2\u10ab\u114f\b\u0083\1\2\u10ac\u10ad"+
		"\7\u01af\2\2\u10ad\u114f\b\u0083\1\2\u10ae\u10af\7\u016d\2\2\u10af\u114f"+
		"\b\u0083\1\2\u10b0\u10b1\7\u01f5\2\2\u10b1\u114f\b\u0083\1\2\u10b2\u10b3"+
		"\7\u01b3\2\2\u10b3\u114f\b\u0083\1\2\u10b4\u10b5\7\u01aa\2\2\u10b5\u114f"+
		"\b\u0083\1\2\u10b6\u10b7\7\u00c5\2\2\u10b7\u114f\b\u0083\1\2\u10b8\u10b9"+
		"\7\u01e7\2\2\u10b9\u114f\b\u0083\1\2\u10ba\u10bb\7\u0170\2\2\u10bb\u114f"+
		"\b\u0083\1\2\u10bc\u10bd\7\u0197\2\2\u10bd\u114f\b\u0083\1\2\u10be\u10bf"+
		"\7\u01c3\2\2\u10bf\u114f\b\u0083\1\2\u10c0\u10c1\7\u01f4\2\2\u10c1\u114f"+
		"\b\u0083\1\2\u10c2\u10c3\7\u0175\2\2\u10c3\u114f\b\u0083\1\2\u10c4\u10c5"+
		"\7\u014d\2\2\u10c5\u114f\b\u0083\1\2\u10c6\u10c7\7\u01d5\2\2\u10c7\u114f"+
		"\b\u0083\1\2\u10c8\u10c9\7\u01db\2\2\u10c9\u114f\b\u0083\1\2\u10ca\u10cb"+
		"\7:\2\2\u10cb\u114f\b\u0083\1\2\u10cc\u10cd\7\u01dd\2\2\u10cd\u114f\b"+
		"\u0083\1\2\u10ce\u10cf\7\u01cb\2\2\u10cf\u114f\b\u0083\1\2\u10d0\u10d1"+
		"\7\u0147\2\2\u10d1\u114f\b\u0083\1\2\u10d2\u10d3\7\u0180\2\2\u10d3\u114f"+
		"\b\u0083\1\2\u10d4\u10d5\7\u0146\2\2\u10d5\u114f\b\u0083\1\2\u10d6\u10d7"+
		"\7\u01c9\2\2\u10d7\u114f\b\u0083\1\2\u10d8\u10d9\7\u0158\2\2\u10d9\u114f"+
		"\b\u0083\1\2\u10da\u10db\7\u0152\2\2\u10db\u114f\b\u0083\1\2\u10dc\u10dd"+
		"\7\u0167\2\2\u10dd\u114f\b\u0083\1\2\u10de\u10df\7\u01c1\2\2\u10df\u114f"+
		"\b\u0083\1\2\u10e0\u10e1\7\u01d3\2\2\u10e1\u114f\b\u0083\1\2\u10e2\u10e3"+
		"\7\u0176\2\2\u10e3\u114f\b\u0083\1\2\u10e4\u10e5\7\u0177\2\2\u10e5\u114f"+
		"\b\u0083\1\2\u10e6\u10e7\7\u01ea\2\2\u10e7\u114f\b\u0083\1\2\u10e8\u10e9"+
		"\7\u01f1\2\2\u10e9\u114f\b\u0083\1\2\u10ea\u10eb\7\u0168\2\2\u10eb\u114f"+
		"\b\u0083\1\2\u10ec\u10ed\7\u01e6\2\2\u10ed\u114f\b\u0083\1\2\u10ee\u10ef"+
		"\7\u0189\2\2\u10ef\u114f\b\u0083\1\2\u10f0\u10f1\7\u0166\2\2\u10f1\u114f"+
		"\b\u0083\1\2\u10f2\u10f3\7\u014b\2\2\u10f3\u114f\b\u0083\1\2\u10f4\u10f5"+
		"\7\u01bb\2\2\u10f5\u114f\b\u0083\1\2\u10f6\u10f7\7\u0159\2\2\u10f7\u114f"+
		"\b\u0083\1\2\u10f8\u10f9\7\u01eb\2\2\u10f9\u114f\b\u0083\1\2\u10fa\u10fb"+
		"\7\u0153\2\2\u10fb\u114f\b\u0083\1\2\u10fc\u10fd\7\u01f7\2\2\u10fd\u114f"+
		"\b\u0083\1\2\u10fe\u10ff\7\u0164\2\2\u10ff\u114f\b\u0083\1\2\u1100\u1101"+
		"\7\u015f\2\2\u1101\u114f\b\u0083\1\2\u1102\u1103\7\u01a5\2\2\u1103\u114f"+
		"\b\u0083\1\2\u1104\u1105\7\u015d\2\2\u1105\u114f\b\u0083\1\2\u1106\u1107"+
		"\7\u01ba\2\2\u1107\u114f\b\u0083\1\2\u1108\u1109\7\u01ac\2\2\u1109\u114f"+
		"\b\u0083\1\2\u110a\u110b\7\u01f0\2\2\u110b\u114f\b\u0083\1\2\u110c\u110d"+
		"\7\u01ef\2\2\u110d\u114f\b\u0083\1\2\u110e\u110f\7\u019b\2\2\u110f\u114f"+
		"\b\u0083\1\2\u1110\u1111\7\u01a8\2\2\u1111\u114f\b\u0083\1\2\u1112\u1113"+
		"\7\u017a\2\2\u1113\u114f\b\u0083\1\2\u1114\u1115\7\u008b\2\2\u1115\u114f"+
		"\b\u0083\1\2\u1116\u1117\7\u01d2\2\2\u1117\u114f\b\u0083\1\2\u1118\u1119"+
		"\7\u01a4\2\2\u1119\u114f\b\u0083\1\2\u111a\u111b\7\u01d8\2\2\u111b\u114f"+
		"\b\u0083\1\2\u111c\u111d\7\u017c\2\2\u111d\u114f\b\u0083\1\2\u111e\u111f"+
		"\7\u0185\2\2\u111f\u114f\b\u0083\1\2\u1120\u1121\7\u01fa\2\2\u1121\u114f"+
		"\b\u0083\1\2\u1122\u1123\7\u01fb\2\2\u1123\u114f\b\u0083\1\2\u1124\u1125"+
		"\7\u01fc\2\2\u1125\u114f\b\u0083\1\2\u1126\u1127\7\u01fd\2\2\u1127\u114f"+
		"\b\u0083\1\2\u1128\u1129\7\u01fe\2\2\u1129\u114f\b\u0083\1\2\u112a\u112b"+
		"\7\u01ff\2\2\u112b\u114f\b\u0083\1\2\u112c\u112d\7\u0200\2\2\u112d\u114f"+
		"\b\u0083\1\2\u112e\u112f\7\u0201\2\2\u112f\u114f\b\u0083\1\2\u1130\u1131"+
		"\7\u0202\2\2\u1131\u114f\b\u0083\1\2\u1132\u1133\7\u01b1\2\2\u1133\u114f"+
		"\b\u0083\1\2\u1134\u1135\7\u01cc\2\2\u1135\u114f\b\u0083\1\2\u1136\u1137"+
		"\7\u018b\2\2\u1137\u114f\b\u0083\1\2\u1138\u1139\7\u01bd\2\2\u1139\u114f"+
		"\b\u0083\1\2\u113a\u113b\7\u0203\2\2\u113b\u114f\b\u0083\1\2\u113c\u113d"+
		"\7\u0204\2\2\u113d\u114f\b\u0083\1\2\u113e\u113f\7\u0205\2\2\u113f\u114f"+
		"\b\u0083\1\2\u1140\u1141\7\u0207\2\2\u1141\u114f\b\u0083\1\2\u1142\u1143"+
		"\7\u0208\2\2\u1143\u114f\b\u0083\1\2\u1144\u1145\7\u0209\2\2\u1145\u114f"+
		"\b\u0083\1\2\u1146\u1147\7\u020a\2\2\u1147\u114f\b\u0083\1\2\u1148\u1149"+
		"\7\u020b\2\2\u1149\u114f\b\u0083\1\2\u114a\u114b\7\u01d6\2\2\u114b\u114f"+
		"\b\u0083\1\2\u114c\u114d\7\u01d7\2\2\u114d\u114f\b\u0083\1\2\u114e\u0fa4"+
		"\3\2\2\2\u114e\u0fa6\3\2\2\2\u114e\u0fa8\3\2\2\2\u114e\u0faa\3\2\2\2\u114e"+
		"\u0fac\3\2\2\2\u114e\u0fae\3\2\2\2\u114e\u0fb0\3\2\2\2\u114e\u0fb2\3\2"+
		"\2\2\u114e\u0fb4\3\2\2\2\u114e\u0fb6\3\2\2\2\u114e\u0fb8\3\2\2\2\u114e"+
		"\u0fba\3\2\2\2\u114e\u0fbc\3\2\2\2\u114e\u0fbe\3\2\2\2\u114e\u0fc0\3\2"+
		"\2\2\u114e\u0fc2\3\2\2\2\u114e\u0fc4\3\2\2\2\u114e\u0fc6\3\2\2\2\u114e"+
		"\u0fc8\3\2\2\2\u114e\u0fca\3\2\2\2\u114e\u0fcc\3\2\2\2\u114e\u0fce\3\2"+
		"\2\2\u114e\u0fd0\3\2\2\2\u114e\u0fd2\3\2\2\2\u114e\u0fd4\3\2\2\2\u114e"+
		"\u0fd6\3\2\2\2\u114e\u0fd8\3\2\2\2\u114e\u0fda\3\2\2\2\u114e\u0fdc\3\2"+
		"\2\2\u114e\u0fde\3\2\2\2\u114e\u0fe0\3\2\2\2\u114e\u0fe2\3\2\2\2\u114e"+
		"\u0fe4\3\2\2\2\u114e\u0fe6\3\2\2\2\u114e\u0fe8\3\2\2\2\u114e\u0fea\3\2"+
		"\2\2\u114e\u0fec\3\2\2\2\u114e\u0fee\3\2\2\2\u114e\u0ff0\3\2\2\2\u114e"+
		"\u0ff2\3\2\2\2\u114e\u0ff4\3\2\2\2\u114e\u0ff6\3\2\2\2\u114e\u0ff8\3\2"+
		"\2\2\u114e\u0ffa\3\2\2\2\u114e\u0ffc\3\2\2\2\u114e\u0ffe\3\2\2\2\u114e"+
		"\u1000\3\2\2\2\u114e\u1002\3\2\2\2\u114e\u1004\3\2\2\2\u114e\u1006\3\2"+
		"\2\2\u114e\u1008\3\2\2\2\u114e\u100a\3\2\2\2\u114e\u100c\3\2\2\2\u114e"+
		"\u100e\3\2\2\2\u114e\u1010\3\2\2\2\u114e\u1012\3\2\2\2\u114e\u1014\3\2"+
		"\2\2\u114e\u1016\3\2\2\2\u114e\u1018\3\2\2\2\u114e\u101a\3\2\2\2\u114e"+
		"\u101c\3\2\2\2\u114e\u101e\3\2\2\2\u114e\u1020\3\2\2\2\u114e\u1022\3\2"+
		"\2\2\u114e\u1024\3\2\2\2\u114e\u1026\3\2\2\2\u114e\u1028\3\2\2\2\u114e"+
		"\u102a\3\2\2\2\u114e\u102c\3\2\2\2\u114e\u102e\3\2\2\2\u114e\u1030\3\2"+
		"\2\2\u114e\u1032\3\2\2\2\u114e\u1034\3\2\2\2\u114e\u1036\3\2\2\2\u114e"+
		"\u1038\3\2\2\2\u114e\u103a\3\2\2\2\u114e\u103c\3\2\2\2\u114e\u103e\3\2"+
		"\2\2\u114e\u1040\3\2\2\2\u114e\u1042\3\2\2\2\u114e\u1044\3\2\2\2\u114e"+
		"\u1046\3\2\2\2\u114e\u1048\3\2\2\2\u114e\u104a\3\2\2\2\u114e\u104c\3\2"+
		"\2\2\u114e\u104e\3\2\2\2\u114e\u1050\3\2\2\2\u114e\u1052\3\2\2\2\u114e"+
		"\u1054\3\2\2\2\u114e\u1056\3\2\2\2\u114e\u1058\3\2\2\2\u114e\u105a\3\2"+
		"\2\2\u114e\u105c\3\2\2\2\u114e\u105e\3\2\2\2\u114e\u1060\3\2\2\2\u114e"+
		"\u1062\3\2\2\2\u114e\u1064\3\2\2\2\u114e\u1066\3\2\2\2\u114e\u1068\3\2"+
		"\2\2\u114e\u106a\3\2\2\2\u114e\u106c\3\2\2\2\u114e\u106e\3\2\2\2\u114e"+
		"\u1070\3\2\2\2\u114e\u1072\3\2\2\2\u114e\u1074\3\2\2\2\u114e\u1076\3\2"+
		"\2\2\u114e\u1078\3\2\2\2\u114e\u107a\3\2\2\2\u114e\u107c\3\2\2\2\u114e"+
		"\u107e\3\2\2\2\u114e\u1080\3\2\2\2\u114e\u1082\3\2\2\2\u114e\u1084\3\2"+
		"\2\2\u114e\u1086\3\2\2\2\u114e\u1088\3\2\2\2\u114e\u108a\3\2\2\2\u114e"+
		"\u108c\3\2\2\2\u114e\u108e\3\2\2\2\u114e\u1090\3\2\2\2\u114e\u1092\3\2"+
		"\2\2\u114e\u1094\3\2\2\2\u114e\u1096\3\2\2\2\u114e\u1098\3\2\2\2\u114e"+
		"\u109a\3\2\2\2\u114e\u109c\3\2\2\2\u114e\u109e\3\2\2\2\u114e\u10a0\3\2"+
		"\2\2\u114e\u10a2\3\2\2\2\u114e\u10a4\3\2\2\2\u114e\u10a6\3\2\2\2\u114e"+
		"\u10a8\3\2\2\2\u114e\u10aa\3\2\2\2\u114e\u10ac\3\2\2\2\u114e\u10ae\3\2"+
		"\2\2\u114e\u10b0\3\2\2\2\u114e\u10b2\3\2\2\2\u114e\u10b4\3\2\2\2\u114e"+
		"\u10b6\3\2\2\2\u114e\u10b8\3\2\2\2\u114e\u10ba\3\2\2\2\u114e\u10bc\3\2"+
		"\2\2\u114e\u10be\3\2\2\2\u114e\u10c0\3\2\2\2\u114e\u10c2\3\2\2\2\u114e"+
		"\u10c4\3\2\2\2\u114e\u10c6\3\2\2\2\u114e\u10c8\3\2\2\2\u114e\u10ca\3\2"+
		"\2\2\u114e\u10cc\3\2\2\2\u114e\u10ce\3\2\2\2\u114e\u10d0\3\2\2\2\u114e"+
		"\u10d2\3\2\2\2\u114e\u10d4\3\2\2\2\u114e\u10d6\3\2\2\2\u114e\u10d8\3\2"+
		"\2\2\u114e\u10da\3\2\2\2\u114e\u10dc\3\2\2\2\u114e\u10de\3\2\2\2\u114e"+
		"\u10e0\3\2\2\2\u114e\u10e2\3\2\2\2\u114e\u10e4\3\2\2\2\u114e\u10e6\3\2"+
		"\2\2\u114e\u10e8\3\2\2\2\u114e\u10ea\3\2\2\2\u114e\u10ec\3\2\2\2\u114e"+
		"\u10ee\3\2\2\2\u114e\u10f0\3\2\2\2\u114e\u10f2\3\2\2\2\u114e\u10f4\3\2"+
		"\2\2\u114e\u10f6\3\2\2\2\u114e\u10f8\3\2\2\2\u114e\u10fa\3\2\2\2\u114e"+
		"\u10fc\3\2\2\2\u114e\u10fe\3\2\2\2\u114e\u1100\3\2\2\2\u114e\u1102\3\2"+
		"\2\2\u114e\u1104\3\2\2\2\u114e\u1106\3\2\2\2\u114e\u1108\3\2\2\2\u114e"+
		"\u110a\3\2\2\2\u114e\u110c\3\2\2\2\u114e\u110e\3\2\2\2\u114e\u1110\3\2"+
		"\2\2\u114e\u1112\3\2\2\2\u114e\u1114\3\2\2\2\u114e\u1116\3\2\2\2\u114e"+
		"\u1118\3\2\2\2\u114e\u111a\3\2\2\2\u114e\u111c\3\2\2\2\u114e\u111e\3\2"+
		"\2\2\u114e\u1120\3\2\2\2\u114e\u1122\3\2\2\2\u114e\u1124\3\2\2\2\u114e"+
		"\u1126\3\2\2\2\u114e\u1128\3\2\2\2\u114e\u112a\3\2\2\2\u114e\u112c\3\2"+
		"\2\2\u114e\u112e\3\2\2\2\u114e\u1130\3\2\2\2\u114e\u1132\3\2\2\2\u114e"+
		"\u1134\3\2\2\2\u114e\u1136\3\2\2\2\u114e\u1138\3\2\2\2\u114e\u113a\3\2"+
		"\2\2\u114e\u113c\3\2\2\2\u114e\u113e\3\2\2\2\u114e\u1140\3\2\2\2\u114e"+
		"\u1142\3\2\2\2\u114e\u1144\3\2\2\2\u114e\u1146\3\2\2\2\u114e\u1148\3\2"+
		"\2\2\u114e\u114a\3\2\2\2\u114e\u114c\3\2\2\2\u114f\u0105\3\2\2\2\u00ae"+
		"\u0110\u011a\u012a\u0142\u015f\u016d\u0173\u0178\u017c\u018d\u019d\u01a2"+
		"\u01b1\u01ca\u01d8\u01de\u01f8\u0207\u0213\u021c\u0224\u0230\u024e\u0258"+
		"\u025e\u0266\u026b\u0271\u027f\u0285\u0291\u029d\u02a7\u02b6\u02bc\u02c3"+
		"\u02cf\u02d7\u02e2\u02f1\u02fc\u0303\u0309\u0310\u0318\u0327\u0337\u0340"+
		"\u0349\u0351\u0359\u036a\u0370\u0388\u038e\u039e\u03a4\u03ae\u03be\u03d0"+
		"\u03dc\u03e0\u03fc\u0408\u0413\u0427\u0433\u0445\u0457\u045e\u0463\u0468"+
		"\u046d\u0474\u047b\u0481\u0488\u0490\u049a\u04a3\u04bc\u04ca\u04cf\u04d9"+
		"\u04e4\u04e9\u04f0\u04fe\u0503\u050a\u0515\u0520\u0529\u052d\u0530\u0537"+
		"\u0540\u0552\u055d\u0566\u056f\u0574\u057b\u0583\u058a\u0594\u05a8\u05ad"+
		"\u05c0\u05c5\u05d1\u05df\u05ed\u05fa\u0604\u060d\u0616\u0623\u062c\u0662"+
		"\u0674\u067d\u0689\u06bb\u06e5\u06ef\u0702\u0710\u0723\u0749\u0758\u076f"+
		"\u0787\u0805\u092a\u0936\u0946\u0954\u0990\u0998\u09c2\u09ea\u09f9\u0a08"+
		"\u0a18\u0a26\u0a3b\u0ab8\u0abe\u0afb\u0b03\u0b0e\u0b1f\u0b4a\u0b93\u0ba7"+
		"\u0c7b\u0c87\u0c99\u0cad\u0cb7\u0cc0\u0cc6\u0cce\u0cd5\u0ce4\u0cef\u0cf6"+
		"\u0cfd\u0e15\u0fa2\u114e";
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