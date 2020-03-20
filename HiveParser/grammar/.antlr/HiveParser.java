// Generated from c:\Users\elisson.lima\source\repos\HiveParser\HiveParser\grammar\Hive.g4 by ANTLR 4.7.1

    #include <string>
    #include <vector>
    #include "HqlFunction.h"

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
		T__0=1, T__1=2, T_ACTION=3, T_ADD2=4, T_ALL=5, T_ALLOCATE=6, T_ALTER=7, 
		T_AND=8, T_ANSI_NULLS=9, T_ANSI_PADDING=10, T_AS=11, T_ASC=12, T_ASSOCIATE=13, 
		T_AT=14, T_AUTO_INCREMENT=15, T_AVG=16, T_BATCHSIZE=17, T_BEGIN=18, T_BETWEEN=19, 
		T_BIGINT=20, T_BINARY_DOUBLE=21, T_BINARY_FLOAT=22, T_BINARY_INTEGER=23, 
		T_BIT=24, T_BODY=25, T_BREAK=26, T_BY=27, T_BYTE=28, T_CALL=29, T_CALLER=30, 
		T_CASCADE=31, T_CASE=32, T_CASESPECIFIC=33, T_CAST=34, T_CHAR=35, T_CHARACTER=36, 
		T_CHARSET=37, T_CLIENT=38, T_CLOSE=39, T_CLUSTERED=40, T_CMP=41, T_COLLECT=42, 
		T_COLLECTION=43, T_COLUMN=44, T_COMMENT=45, T_CONSTANT=46, T_COMMIT=47, 
		T_COMPRESS=48, T_CONCAT=49, T_CONDITION=50, T_CONSTRAINT=51, T_CONTINUE=52, 
		T_COPY=53, T_COUNT=54, T_COUNT_BIG=55, T_CREATE=56, T_CREATION=57, T_CREATOR=58, 
		T_CS=59, T_CURRENT=60, T_CURRENT_SCHEMA=61, T_CURSOR=62, T_DATABASE=63, 
		T_DATA=64, T_DATE=65, T_DATETIME=66, T_DAY=67, T_DAYS=68, T_DEC=69, T_DECIMAL=70, 
		T_DECLARE=71, T_DEFAULT=72, T_DEFERRED=73, T_DEFINED=74, T_DEFINER=75, 
		T_DEFINITION=76, T_DELETE=77, T_DELIMITED=78, T_DELIMITER=79, T_DESC=80, 
		T_DESCRIBE=81, T_DIAGNOSTICS=82, T_DIR=83, T_DIRECTORY=84, T_DISTINCT=85, 
		T_DISTRIBUTE=86, T_DO=87, T_DOUBLE=88, T_DROP=89, T_DYNAMIC=90, T_ELSE=91, 
		T_ELSEIF=92, T_ELSIF=93, T_ENABLE=94, T_END=95, T_ENGINE=96, T_ESCAPED=97, 
		T_EXCEPT=98, T_EXEC=99, T_EXECUTE=100, T_EXCEPTION=101, T_EXCLUSIVE=102, 
		T_EXISTS=103, T_EXIT=104, T_FALLBACK=105, T_FALSE=106, T_FETCH=107, T_FIELDS=108, 
		T_FILE=109, T_FILES=110, T_FLOAT=111, T_FOR=112, T_FOREIGN=113, T_FORMAT=114, 
		T_FOUND=115, T_FROM=116, T_FULL=117, T_FUNCTION=118, T_GET=119, T_GLOBAL=120, 
		T_GO=121, T_GRANT=122, T_GROUP=123, T_HANDLER=124, T_HASH=125, T_HAVING=126, 
		T_HDFS=127, T_HIVE=128, T_HOST=129, T_IDENTITY=130, T_IF=131, T_IGNORE=132, 
		T_IMMEDIATE=133, T_IN=134, T_INCLUDE=135, T_INDEX=136, T_INITRANS=137, 
		T_INNER=138, T_INOUT=139, T_INSERT=140, T_INT=141, T_INT2=142, T_INT4=143, 
		T_INT8=144, T_INTEGER=145, T_INTERSECT=146, T_INTERVAL=147, T_INTO=148, 
		T_INVOKER=149, T_IS=150, T_ISOPEN=151, T_ITEMS=152, T_JOIN=153, T_KEEP=154, 
		T_KEY=155, T_KEYS=156, T_LANGUAGE=157, T_LEAVE=158, T_LEFT=159, T_LIKE=160, 
		T_LIMIT=161, T_LINES=162, T_LOCAL=163, T_LOCATION=164, T_LOCATOR=165, 
		T_LOCATORS=166, T_LOCKS=167, T_LOG=168, T_LOGGED=169, T_LOGGING=170, T_LOOP=171, 
		T_MAP=172, T_MATCHED=173, T_MAX=174, T_MAXTRANS=175, T_MERGE=176, T_MESSAGE_TEXT=177, 
		T_MICROSECOND=178, T_MICROSECONDS=179, T_MIN=180, T_MULTISET=181, T_NCHAR=182, 
		T_NEW=183, T_NVARCHAR=184, T_NO=185, T_NOCOUNT=186, T_NOCOMPRESS=187, 
		T_NOLOGGING=188, T_NONE=189, T_NOT=190, T_NOTFOUND=191, T_NULL=192, T_NUMERIC=193, 
		T_NUMBER=194, T_OBJECT=195, T_OFF=196, T_ON=197, T_ONLY=198, T_OPEN=199, 
		T_OR=200, T_ORDER=201, T_OUT=202, T_OUTER=203, T_OVER=204, T_OVERWRITE=205, 
		T_OWNER=206, T_PACKAGE=207, T_PARTITION=208, T_PCTFREE=209, T_PCTUSED=210, 
		T_PLS_INTEGER=211, T_PRECISION=212, T_PRESERVE=213, T_PRIMARY=214, T_PRINT=215, 
		T_PROC=216, T_PROCEDURE=217, T_QUALIFY=218, T_QUERY_BAND=219, T_QUIT=220, 
		T_QUOTED_IDENTIFIER=221, T_RAISE=222, T_REAL=223, T_REFERENCES=224, T_REGEXP=225, 
		T_REPLACE=226, T_RESIGNAL=227, T_RESTRICT=228, T_RESULT=229, T_RESULT_SET_LOCATOR=230, 
		T_RETURN=231, T_RETURNS=232, T_REVERSE=233, T_RIGHT=234, T_RLIKE=235, 
		T_ROLE=236, T_ROLLBACK=237, T_ROW=238, T_ROWS=239, T_ROWTYPE=240, T_ROW_COUNT=241, 
		T_RR=242, T_RS=243, T_PWD=244, T_TRIM=245, T_SCHEMA=246, T_SECOND=247, 
		T_SECONDS=248, T_SECURITY=249, T_SEGMENT=250, T_SEL=251, T_SELECT=252, 
		T_SET=253, T_SESSION=254, T_SESSIONS=255, T_SETS=256, T_SHARE=257, T_SIGNAL=258, 
		T_SIMPLE_DOUBLE=259, T_SIMPLE_FLOAT=260, T_SIMPLE_INTEGER=261, T_SMALLDATETIME=262, 
		T_SMALLINT=263, T_SQL=264, T_SQLEXCEPTION=265, T_SQLINSERT=266, T_SQLSTATE=267, 
		T_SQLWARNING=268, T_STATS=269, T_STATISTICS=270, T_STEP=271, T_STORAGE=272, 
		T_STORED=273, T_STRING=274, T_SUBDIR=275, T_SUBSTR=276, T_SUBSTRING=277, 
		T_SUM=278, T_SUMMARY=279, T_SYS_REFCURSOR=280, T_TABLE=281, T_TABLESPACE=282, 
		T_TEMPORARY=283, T_TERMINATED=284, T_TEXTIMAGE_ON=285, T_THEN=286, T_TIMESTAMP=287, 
		T_TINYINT=288, T_TITLE=289, T_TO=290, T_TOP=291, T_TRANSACTION=292, T_TRUE=293, 
		T_TRUNCATE=294, T_TYPE=295, T_UNION=296, T_UNIQUE=297, T_UPDATE=298, T_UR=299, 
		T_USE=300, T_USING=301, T_VALUE=302, T_VALUES=303, T_VAR=304, T_VARCHAR=305, 
		T_VARCHAR2=306, T_VARYING=307, T_VOLATILE=308, T_WHEN=309, T_WHERE=310, 
		T_WHILE=311, T_WITH=312, T_WITHOUT=313, T_WORK=314, T_XACT_ABORT=315, 
		T_XML=316, T_YES=317, T_ACTIVITY_COUNT=318, T_CUME_DIST=319, T_CURRENT_DATE=320, 
		T_CURRENT_TIMESTAMP=321, T_CURRENT_USER=322, T_DENSE_RANK=323, T_FIRST_VALUE=324, 
		T_LAG=325, T_LAST_VALUE=326, T_LEAD=327, T_MAX_PART_STRING=328, T_MIN_PART_STRING=329, 
		T_MAX_PART_INT=330, T_MIN_PART_INT=331, T_MAX_PART_DATE=332, T_MIN_PART_DATE=333, 
		T_PART_COUNT=334, T_PART_LOC=335, T_RANK=336, T_ROW_NUMBER=337, T_STDEV=338, 
		T_SYSDATE=339, T_VARIANCE=340, T_USER=341, T_ADD=342, T_COLON=343, T_COMMA=344, 
		T_PIPE=345, T_DIV=346, T_DOT2=347, T_EQUAL=348, T_EQUAL2=349, T_NOTEQUAL=350, 
		T_NOTEQUAL2=351, T_GREATER=352, T_GREATEREQUAL=353, T_LESS=354, T_LESSEQUAL=355, 
		T_MUL=356, T_OPEN_B=357, T_OPEN_P=358, T_OPEN_SB=359, T_CLOSE_B=360, T_CLOSE_P=361, 
		T_CLOSE_SB=362, T_SEMICOLON=363, T_SUB=364, L_S_STRING=365, L_D_STRING=366, 
		L_ID=367, L_INT=368, L_DEC=369, L_WS=370, L_M_COMMENT=371, L_S_COMMENT=372, 
		L_FILE=373, L_LABEL=374;
	public static final int
		RULE_program = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_query_stmt = 3, 
		RULE_dtype = 4, RULE_dtype_len = 5, RULE_dtype_default = 6, RULE_dtype_attr = 7, 
		RULE_create_table_stmt = 8, RULE_create_local_temp_table_stmt = 9, RULE_create_table_definition = 10, 
		RULE_create_table_columns = 11, RULE_create_table_columns_item = 12, RULE_column_name = 13, 
		RULE_create_table_column_inline_cons = 14, RULE_create_table_column_cons = 15, 
		RULE_create_table_fk_action = 16, RULE_create_table_preoptions = 17, RULE_create_table_preoptions_item = 18, 
		RULE_create_table_preoptions_td_item = 19, RULE_create_table_options = 20, 
		RULE_create_table_options_item = 21, RULE_create_table_options_ora_item = 22, 
		RULE_create_table_options_db2_item = 23, RULE_create_table_options_td_item = 24, 
		RULE_create_table_options_hive_item = 25, RULE_create_table_hive_row_format = 26, 
		RULE_create_table_hive_row_format_fields_list = 27, RULE_create_table_hive_row_format_fields = 28, 
		RULE_create_table_options_mssql_item = 29, RULE_create_table_options_mysql_item = 30, 
		RULE_select_stmt = 31, RULE_fullselect_stmt = 32, RULE_fullselect_stmt_item = 33, 
		RULE_fullselect_set_clause = 34, RULE_subselect_stmt = 35, RULE_having_qualify_clause = 36, 
		RULE_select_list = 37, RULE_select_expr_list = 38, RULE_select_list_set = 39, 
		RULE_select_list_limit = 40, RULE_select_list_item = 41, RULE_select_list_alias = 42, 
		RULE_select_list_asterisk = 43, RULE_into_clause = 44, RULE_from_clause = 45, 
		RULE_from_join_clause_list = 46, RULE_from_table_clause = 47, RULE_from_table_name_clause = 48, 
		RULE_from_subselect_clause = 49, RULE_from_join_clause = 50, RULE_from_join_type_clause = 51, 
		RULE_from_table_values_clause = 52, RULE_from_table_values_row_list = 53, 
		RULE_from_table_values_row = 54, RULE_from_alias_clause = 55, RULE_table_name = 56, 
		RULE_where_clause = 57, RULE_group_by_clause = 58, RULE_expr_list = 59, 
		RULE_having_clause = 60, RULE_qualify_clause = 61, RULE_select_options = 62, 
		RULE_select_options_item = 63, RULE_delete_stmt = 64, RULE_delete_alias = 65, 
		RULE_describe_stmt = 66, RULE_bool_expr = 67, RULE_bool_expr_atom = 68, 
		RULE_bool_expr_unary = 69, RULE_bool_expr_single_in = 70, RULE_bool_expr_multi_in = 71, 
		RULE_bool_mult_expr = 72, RULE_bool_expr_binary = 73, RULE_bool_expr_logical_operator = 74, 
		RULE_bool_expr_binary_operator = 75, RULE_expr = 76, RULE_expr_concat = 77, 
		RULE_expr_concat_item = 78, RULE_expr_case = 79, RULE_expr_case_simple = 80, 
		RULE_expr_case_searched = 81, RULE_expr_case_when_then = 82, RULE_expr_case_else = 83, 
		RULE_expr_agg_window_func = 84, RULE_expr_func_all_distinct = 85, RULE_opt_expr_func_over_clause = 86, 
		RULE_expr_func_over_clause = 87, RULE_expr_func_partition_by_clause = 88, 
		RULE_expr_spec_func = 89, RULE_expr_func = 90, RULE_expr_func_params = 91, 
		RULE_func_param = 92, RULE_order_by_clause = 93, RULE_order_by_asc_desc = 94, 
		RULE_expr_atom = 95, RULE_interval_item = 96, RULE_date_literal = 97, 
		RULE_timestamp_literal = 98, RULE_ident = 99, RULE_string = 100, RULE_bool_literal = 101, 
		RULE_int_number = 102, RULE_dec_number = 103, RULE_null_const = 104, RULE_non_reserved_words = 105;
	public static final String[] ruleNames = {
		"program", "stmt_list", "stmt", "query_stmt", "dtype", "dtype_len", "dtype_default", 
		"dtype_attr", "create_table_stmt", "create_local_temp_table_stmt", "create_table_definition", 
		"create_table_columns", "create_table_columns_item", "column_name", "create_table_column_inline_cons", 
		"create_table_column_cons", "create_table_fk_action", "create_table_preoptions", 
		"create_table_preoptions_item", "create_table_preoptions_td_item", "create_table_options", 
		"create_table_options_item", "create_table_options_ora_item", "create_table_options_db2_item", 
		"create_table_options_td_item", "create_table_options_hive_item", "create_table_hive_row_format", 
		"create_table_hive_row_format_fields_list", "create_table_hive_row_format_fields", 
		"create_table_options_mssql_item", "create_table_options_mysql_item", 
		"select_stmt", "fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", 
		"subselect_stmt", "having_qualify_clause", "select_list", "select_expr_list", 
		"select_list_set", "select_list_limit", "select_list_item", "select_list_alias", 
		"select_list_asterisk", "into_clause", "from_clause", "from_join_clause_list", 
		"from_table_clause", "from_table_name_clause", "from_subselect_clause", 
		"from_join_clause", "from_join_type_clause", "from_table_values_clause", 
		"from_table_values_row_list", "from_table_values_row", "from_alias_clause", 
		"table_name", "where_clause", "group_by_clause", "expr_list", "having_clause", 
		"qualify_clause", "select_options", "select_options_item", "delete_stmt", 
		"delete_alias", "describe_stmt", "bool_expr", "bool_expr_atom", "bool_expr_unary", 
		"bool_expr_single_in", "bool_expr_multi_in", "bool_mult_expr", "bool_expr_binary", 
		"bool_expr_logical_operator", "bool_expr_binary_operator", "expr", "expr_concat", 
		"expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched", 
		"expr_case_when_then", "expr_case_else", "expr_agg_window_func", "expr_func_all_distinct", 
		"opt_expr_func_over_clause", "expr_func_over_clause", "expr_func_partition_by_clause", 
		"expr_spec_func", "expr_func", "expr_func_params", "func_param", "order_by_clause", 
		"order_by_asc_desc", "expr_atom", "interval_item", "date_literal", "timestamp_literal", 
		"ident", "string", "bool_literal", "int_number", "dec_number", "null_const", 
		"non_reserved_words"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'.'", null, null, null, null, null, null, null, null, null, 
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
		null, null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", "T_ALTER", 
		"T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", "T_ASSOCIATE", 
		"T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", "T_BEGIN", "T_BETWEEN", 
		"T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", "T_BIT", 
		"T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", "T_CASCADE", 
		"T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", "T_CHARSET", 
		"T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", "T_COLLECTION", 
		"T_COLUMN", "T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", "T_CONCAT", 
		"T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", "T_COUNT_BIG", 
		"T_CREATE", "T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", 
		"T_CURSOR", "T_DATABASE", "T_DATA", "T_DATE", "T_DATETIME", "T_DAY", "T_DAYS", 
		"T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", "T_DEFINED", 
		"T_DEFINER", "T_DEFINITION", "T_DELETE", "T_DELIMITED", "T_DELIMITER", 
		"T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", "T_DIR", "T_DIRECTORY", "T_DISTINCT", 
		"T_DISTRIBUTE", "T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", 
		"T_ELSIF", "T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", 
		"T_EXECUTE", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALLBACK", 
		"T_FALSE", "T_FETCH", "T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_FOR", 
		"T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM", "T_FULL", "T_FUNCTION", 
		"T_GET", "T_GLOBAL", "T_GO", "T_GRANT", "T_GROUP", "T_HANDLER", "T_HASH", 
		"T_HAVING", "T_HDFS", "T_HIVE", "T_HOST", "T_IDENTITY", "T_IF", "T_IGNORE", 
		"T_IMMEDIATE", "T_IN", "T_INCLUDE", "T_INDEX", "T_INITRANS", "T_INNER", 
		"T_INOUT", "T_INSERT", "T_INT", "T_INT2", "T_INT4", "T_INT8", "T_INTEGER", 
		"T_INTERSECT", "T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", "T_ISOPEN", 
		"T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", "T_LEAVE", 
		"T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATION", "T_LOCATOR", 
		"T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", 
		"T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", 
		"T_MICROSECONDS", "T_MIN", "T_MULTISET", "T_NCHAR", "T_NEW", "T_NVARCHAR", 
		"T_NO", "T_NOCOUNT", "T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", "T_NOT", 
		"T_NOTFOUND", "T_NULL", "T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OFF", 
		"T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", 
		"T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", 
		"T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", "T_PRIMARY", "T_PRINT", 
		"T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", "T_QUIT", "T_QUOTED_IDENTIFIER", 
		"T_RAISE", "T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", "T_RESIGNAL", 
		"T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", 
		"T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", "T_ROLLBACK", "T_ROW", "T_ROWS", 
		"T_ROWTYPE", "T_ROW_COUNT", "T_RR", "T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", 
		"T_SECOND", "T_SECONDS", "T_SECURITY", "T_SEGMENT", "T_SEL", "T_SELECT", 
		"T_SET", "T_SESSION", "T_SESSIONS", "T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", 
		"T_SIMPLE_FLOAT", "T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", 
		"T_SQL", "T_SQLEXCEPTION", "T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", 
		"T_STATS", "T_STATISTICS", "T_STEP", "T_STORAGE", "T_STORED", "T_STRING", 
		"T_SUBDIR", "T_SUBSTR", "T_SUBSTRING", "T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", 
		"T_TABLE", "T_TABLESPACE", "T_TEMPORARY", "T_TERMINATED", "T_TEXTIMAGE_ON", 
		"T_THEN", "T_TIMESTAMP", "T_TINYINT", "T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", 
		"T_TRUE", "T_TRUNCATE", "T_TYPE", "T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", 
		"T_USE", "T_USING", "T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", 
		"T_VARYING", "T_VOLATILE", "T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", 
		"T_WORK", "T_XACT_ABORT", "T_XML", "T_YES", "T_ACTIVITY_COUNT", "T_CUME_DIST", 
		"T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", 
		"T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
		"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
		"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
		"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", 
		"T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", 
		"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", 
		"T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", 
		"T_SUB", "L_S_STRING", "L_D_STRING", "L_ID", "L_INT", "L_DEC", "L_WS", 
		"L_M_COMMENT", "L_S_COMMENT", "L_FILE", "L_LABEL"
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
		public std::string res;
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
			setState(212);
			((ProgramContext)_localctx).stmt_list = stmt_list();
			setState(213);
			match(EOF);

			        std::stringstream js_template;
			        js_template << "{\"stmt_list\":[" << ((ProgramContext)_localctx).stmt_list.res << "]}";
			        ((ProgramContext)_localctx).res =  js_template.str();
			    
			}
		}
		catch (RecognitionException re) {
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
		public std::string res;
		public StmtContext stmt;
		public Stmt_listContext stmt_list;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_list);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				((Stmt_listContext)_localctx).stmt = stmt();
				setState(217);
				match(T_SEMICOLON);
				 ((Stmt_listContext)_localctx).res =  ((Stmt_listContext)_localctx).stmt.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((Stmt_listContext)_localctx).stmt = stmt();
				setState(221);
				match(T_SEMICOLON);
				setState(222);
				((Stmt_listContext)_localctx).stmt_list = stmt_list();

				        std::stringstream js_template;
				        js_template << ((Stmt_listContext)_localctx).stmt_list.res << "," << ((Stmt_listContext)_localctx).stmt.res;
				        ((Stmt_listContext)_localctx).res =  js_template.str();
				    
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

	public static class StmtContext extends ParserRuleContext {
		public std::string res;
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
		enterRule(_localctx, 4, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
		public std::string res;
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
		enterRule(_localctx, 6, RULE_query_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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

	public static class DtypeContext extends ParserRuleContext {
		public std::string res;
		public IdentContext ident;
		public TerminalNode T_CHAR() { return getToken(HiveParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HiveParser.T_CHARACTER, 0); }
		public TerminalNode T_BIGINT() { return getToken(HiveParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HiveParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HiveParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(HiveParser.T_BINARY_INTEGER, 0); }
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
		enterRule(_localctx, 8, RULE_dtype);
		int _la;
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T_CHAR);
				 ((DtypeContext)_localctx).res =  "CHAR"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(T_CHARACTER);
				 ((DtypeContext)_localctx).res =  "CHAR"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(T_BIGINT);
				 ((DtypeContext)_localctx).res =  "BIGINT"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(T_BINARY_DOUBLE);
				 ((DtypeContext)_localctx).res =  "BINARY_DOUBLE"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				match(T_BINARY_FLOAT);
				 ((DtypeContext)_localctx).res =  "BINARY_FLOAT"; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				match(T_BINARY_INTEGER);
				 ((DtypeContext)_localctx).res =  "BINARY_INT"; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				match(T_BIT);
				 ((DtypeContext)_localctx).res =  "BIT"; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(247);
				match(T_DATE);
				 ((DtypeContext)_localctx).res =  "DATE"; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				match(T_DATETIME);
				 ((DtypeContext)_localctx).res =  "DATETIME"; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(251);
				match(T_DEC);
				 ((DtypeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(253);
				match(T_DECIMAL);
				 ((DtypeContext)_localctx).res =  "DECIMAL"; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(255);
				match(T_DOUBLE);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PRECISION) {
					{
					setState(256);
					match(T_PRECISION);
					}
				}

				 ((DtypeContext)_localctx).res =  "DOUBLE"; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(260);
				match(T_FLOAT);
				 ((DtypeContext)_localctx).res =  "FLOAT"; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(262);
				match(T_INT);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(264);
				match(T_INT2);
				 ((DtypeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(266);
				match(T_INT4);
				 ((DtypeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(268);
				match(T_INT8);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(270);
				match(T_INTEGER);
				 ((DtypeContext)_localctx).res =  "INT"; 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(272);
				match(T_NCHAR);
				 ((DtypeContext)_localctx).res =  "NCHAR"; 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(274);
				match(T_NVARCHAR);
				 ((DtypeContext)_localctx).res =  "NVARCHAR"; 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(276);
				match(T_NUMBER);
				 ((DtypeContext)_localctx).res =  "NUMBER"; 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(278);
				match(T_NUMERIC);
				 ((DtypeContext)_localctx).res =  "NUMERIC"; 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(280);
				match(T_PLS_INTEGER);
				 ((DtypeContext)_localctx).res =  "PLS_INTEGER"; 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(282);
				match(T_REAL);
				 ((DtypeContext)_localctx).res =  "REAL"; 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(284);
				match(T_RESULT_SET_LOCATOR);
				setState(285);
				match(T_VARYING);
				 ((DtypeContext)_localctx).res =  "RESULT_SET_LOCATOR"; 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(287);
				match(T_SIMPLE_FLOAT);
				 ((DtypeContext)_localctx).res =  "SIMPLE_FLOAT"; 
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(289);
				match(T_SIMPLE_DOUBLE);
				 ((DtypeContext)_localctx).res =  "SIMPLE_DOUBLE"; 
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(291);
				match(T_SIMPLE_INTEGER);
				 ((DtypeContext)_localctx).res =  "SIMPLE_INTEGER"; 
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(293);
				match(T_SMALLINT);
				 ((DtypeContext)_localctx).res =  "SMALLINT"; 
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(295);
				match(T_SMALLDATETIME);
				 ((DtypeContext)_localctx).res =  "SMALLDATETIME"; 
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(297);
				match(T_STRING);
				 ((DtypeContext)_localctx).res =  "STRING"; 
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(299);
				match(T_SYS_REFCURSOR);
				 ((DtypeContext)_localctx).res =  "SYS_REFCURSOR"; 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(301);
				match(T_TIMESTAMP);
				 ((DtypeContext)_localctx).res =  "TIMESTAMP"; 
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(303);
				match(T_TINYINT);
				 ((DtypeContext)_localctx).res =  "TINYINT"; 
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(305);
				match(T_VARCHAR);
				 ((DtypeContext)_localctx).res =  "VARCHAR"; 
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(307);
				match(T_VARCHAR2);
				 ((DtypeContext)_localctx).res =  "VARCHAR2"; 
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(309);
				match(T_XML);
				 ((DtypeContext)_localctx).res =  "XML"; 
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(311);
				((DtypeContext)_localctx).ident = ident();
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(312);
					match(T__0);
					setState(313);
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
			}
		}
		catch (RecognitionException re) {
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
		public std::string res;
		public Token size;
		public Token scale;
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HiveParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HiveParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(HiveParser.T_MAX, 0); }
		public TerminalNode T_CHAR() { return getToken(HiveParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(HiveParser.T_BYTE, 0); }
		public TerminalNode T_COMMA() { return getToken(HiveParser.T_COMMA, 0); }
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Dtype_lenContext)_localctx).res =  ""; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(T_OPEN_P);
				setState(322);
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
				setState(323);
				match(T_CLOSE_P);
				 ((Dtype_lenContext)_localctx).res =  hql_dtype_size((((Dtype_lenContext)_localctx).size!=null?((Dtype_lenContext)_localctx).size.getText():null), ""); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(T_OPEN_P);
				setState(326);
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
				setState(327);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				match(T_CLOSE_P);
				 ((Dtype_lenContext)_localctx).res =  hql_dtype_size((((Dtype_lenContext)_localctx).size!=null?((Dtype_lenContext)_localctx).size.getText():null), ""); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(T_OPEN_P);
				setState(331);
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
				{
				setState(332);
				match(T_COMMA);
				setState(333);
				((Dtype_lenContext)_localctx).scale = match(L_INT);
				}
				setState(335);
				match(T_CLOSE_P);
				 ((Dtype_lenContext)_localctx).res =  hql_dtype_size((((Dtype_lenContext)_localctx).size!=null?((Dtype_lenContext)_localctx).size.getText():null), (((Dtype_lenContext)_localctx).scale!=null?((Dtype_lenContext)_localctx).scale.getText():null)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				match(T_OPEN_P);
				setState(338);
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
				setState(339);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(340);
				match(T_COMMA);
				setState(341);
				((Dtype_lenContext)_localctx).scale = match(L_INT);
				}
				setState(343);
				match(T_CLOSE_P);
				 ((Dtype_lenContext)_localctx).res =  hql_dtype_size((((Dtype_lenContext)_localctx).size!=null?((Dtype_lenContext)_localctx).size.getText():null), (((Dtype_lenContext)_localctx).scale!=null?((Dtype_lenContext)_localctx).scale.getText():null)); 
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

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HiveParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HiveParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HiveParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(HiveParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dtype_default);
		int _la;
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(347);
					match(T_COLON);
					}
				}

				setState(350);
				match(T_EQUAL);
				setState(351);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(352);
					match(T_WITH);
					}
				}

				setState(355);
				match(T_DEFAULT);
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(356);
					expr(0);
					}
					break;
				}
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

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HiveParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HiveParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HiveParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(HiveParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(HiveParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dtype_attr);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(361);
					match(T_NOT);
					}
				}

				setState(364);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(T_CHARACTER);
				setState(366);
				match(T_SET);
				setState(367);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(368);
					match(T_NOT);
					}
				}

				setState(371);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HiveParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(HiveParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HiveParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T_CREATE);
			setState(375);
			match(T_TABLE);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(376);
				match(T_IF);
				setState(377);
				match(T_NOT);
				setState(378);
				match(T_EXISTS);
				}
				break;
			}
			setState(381);
			table_name();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(382);
				create_table_preoptions();
				}
			}

			setState(385);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HiveParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(HiveParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HiveParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HiveParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(HiveParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(HiveParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T_CREATE);
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(388);
				match(T_LOCAL);
				setState(389);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(390);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(393);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(396);
			match(T_TABLE);
			setState(397);
			ident();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(398);
				create_table_preoptions();
				}
			}

			setState(401);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public TerminalNode T_LIKE() { return getToken(HiveParser.T_LIKE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(403);
					match(T_AS);
					}
				}

				setState(406);
				match(T_OPEN_P);
				setState(407);
				select_stmt();
				setState(408);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
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
				select_stmt();
				}
				break;
			case 3:
				{
				setState(414);
				match(T_OPEN_P);
				setState(415);
				create_table_columns();
				setState(416);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				{
				setState(418);
				match(T_LIKE);
				setState(419);
				table_name();
				}
				break;
			}
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_AUTO_INCREMENT) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_COMMENT) | (1L << T_COMPRESS))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T_DEFAULT - 72)) | (1L << (T_DEFINITION - 72)) | (1L << (T_DISTRIBUTE - 72)) | (1L << (T_ENGINE - 72)) | (1L << (T_IN - 72)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (T_INDEX - 136)) | (1L << (T_INITRANS - 136)) | (1L << (T_LOGGED - 136)) | (1L << (T_LOGGING - 136)) | (1L << (T_MAXTRANS - 136)) | (1L << (T_NOCOMPRESS - 136)) | (1L << (T_NOLOGGING - 136)) | (1L << (T_NOT - 136)) | (1L << (T_ON - 136)))) != 0) || ((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (T_PCTFREE - 209)) | (1L << (T_PCTUSED - 209)) | (1L << (T_PRIMARY - 209)) | (1L << (T_ROW - 209)) | (1L << (T_SEGMENT - 209)) | (1L << (T_STORAGE - 209)))) != 0) || ((((_la - 273)) & ~0x3f) == 0 && ((1L << (_la - 273)) & ((1L << (T_STORED - 273)) | (1L << (T_TABLESPACE - 273)) | (1L << (T_TEXTIMAGE_ON - 273)) | (1L << (T_UNIQUE - 273)) | (1L << (T_WITH - 273)))) != 0)) {
				{
				setState(422);
				create_table_options();
				}
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

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			create_table_columns_item();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(426);
				match(T_COMMA);
				setState(427);
				create_table_columns_item();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HiveParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				column_name();
				setState(434);
				dtype();
				setState(436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(435);
					dtype_len();
					}
					break;
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(438);
						dtype_attr();
						}
						} 
					}
					setState(443);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T_DEFAULT - 72)) | (1L << (T_ENABLE - 72)) | (1L << (T_IDENTITY - 72)))) != 0) || ((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (T_NOT - 190)) | (1L << (T_NULL - 190)) | (1L << (T_PRIMARY - 190)) | (1L << (T_REFERENCES - 190)))) != 0) || ((((_la - 297)) & ~0x3f) == 0 && ((1L << (_la - 297)) & ((1L << (T_UNIQUE - 297)) | (1L << (T_WITH - 297)) | (1L << (T_COLON - 297)) | (1L << (T_EQUAL - 297)))) != 0)) {
					{
					{
					setState(444);
					create_table_column_inline_cons();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(450);
					match(T_CONSTRAINT);
					setState(451);
					ident();
					}
				}

				setState(454);
				create_table_column_cons();
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

	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(HiveParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HiveParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HiveParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HiveParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HiveParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(HiveParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HiveParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HiveParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HiveParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(HiveParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(460);
					match(T_NOT);
					}
				}

				setState(463);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				match(T_PRIMARY);
				setState(465);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				match(T_REFERENCES);
				setState(468);
				table_name();
				setState(469);
				match(T_OPEN_P);
				setState(470);
				ident();
				setState(471);
				match(T_CLOSE_P);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(472);
					create_table_fk_action();
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(478);
				match(T_IDENTITY);
				setState(479);
				match(T_OPEN_P);
				setState(480);
				match(L_INT);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(481);
					match(T_COMMA);
					setState(482);
					match(L_INT);
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(489);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(490);
				match(T_ENABLE);
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

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HiveParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HiveParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HiveParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HiveParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HiveParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HiveParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(HiveParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(HiveParser.T_ENABLE, 0); }
		public List<TerminalNode> T_ASC() { return getTokens(HiveParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HiveParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HiveParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HiveParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(HiveParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HiveParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_table_column_cons);
		int _la;
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(T_PRIMARY);
				setState(494);
				match(T_KEY);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(495);
					match(T_CLUSTERED);
					}
				}

				setState(498);
				match(T_OPEN_P);
				setState(499);
				ident();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(500);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(503);
					match(T_COMMA);
					setState(504);
					ident();
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(505);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(513);
				match(T_CLOSE_P);
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(514);
					match(T_ENABLE);
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(T_FOREIGN);
				setState(518);
				match(T_KEY);
				setState(519);
				match(T_OPEN_P);
				setState(520);
				ident();
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(521);
					match(T_COMMA);
					setState(522);
					ident();
					}
					}
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(528);
				match(T_CLOSE_P);
				setState(529);
				match(T_REFERENCES);
				setState(530);
				table_name();
				setState(531);
				match(T_OPEN_P);
				setState(532);
				ident();
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(533);
					match(T_COMMA);
					setState(534);
					ident();
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540);
				match(T_CLOSE_P);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(541);
					create_table_fk_action();
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public std::string res;
		public Token act;
		public TerminalNode T_ON() { return getToken(HiveParser.T_ON, 0); }
		public TerminalNode T_DELETE() { return getToken(HiveParser.T_DELETE, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HiveParser.T_RESTRICT, 0); }
		public TerminalNode T_CASCADE() { return getToken(HiveParser.T_CASCADE, 0); }
		public TerminalNode T_NO() { return getToken(HiveParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(HiveParser.T_ACTION, 0); }
		public TerminalNode T_SET() { return getToken(HiveParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(HiveParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HiveParser.T_DEFAULT, 0); }
		public TerminalNode T_UPDATE() { return getToken(HiveParser.T_UPDATE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_table_fk_action);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(T_ON);
				setState(550);
				match(T_DELETE);
				setState(551);
				((Create_table_fk_actionContext)_localctx).act = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_CASCADE || _la==T_RESTRICT) ) {
					((Create_table_fk_actionContext)_localctx).act = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 ((Create_table_fk_actionContext)_localctx).res =  hql_create_table_option_item_val("ON_DELETE", (((Create_table_fk_actionContext)_localctx).act!=null?((Create_table_fk_actionContext)_localctx).act.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(T_ON);
				setState(554);
				match(T_DELETE);
				setState(555);
				match(T_NO);
				setState(556);
				match(T_ACTION);
				 ((Create_table_fk_actionContext)_localctx).res =  hql_create_table_option_item_val("ON_DELETE", "NO_ACTION"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				match(T_ON);
				setState(559);
				match(T_DELETE);
				setState(560);
				match(T_SET);
				setState(561);
				match(T_NULL);
				 ((Create_table_fk_actionContext)_localctx).res =  hql_create_table_option_item_val("ON_DELETE", "SET_NULL"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				match(T_ON);
				setState(564);
				match(T_DELETE);
				setState(565);
				match(T_SET);
				setState(566);
				match(T_DEFAULT);
				 ((Create_table_fk_actionContext)_localctx).res =  hql_create_table_option_item_val("ON_DELETE", "SET_DEFAULT"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(568);
				match(T_ON);
				setState(569);
				match(T_UPDATE);
				setState(570);
				((Create_table_fk_actionContext)_localctx).act = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_CASCADE || _la==T_RESTRICT) ) {
					((Create_table_fk_actionContext)_localctx).act = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 ((Create_table_fk_actionContext)_localctx).res =  hql_create_table_option_item_val("ON_UPDATE", (((Create_table_fk_actionContext)_localctx).act!=null?((Create_table_fk_actionContext)_localctx).act.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(572);
				match(T_ON);
				setState(573);
				match(T_UPDATE);
				setState(574);
				match(T_NO);
				setState(575);
				match(T_ACTION);
				 ((Create_table_fk_actionContext)_localctx).res =  hql_create_table_option_item_val("ON_DELETE", "NO_ACTION"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(577);
				match(T_ON);
				setState(578);
				match(T_UPDATE);
				setState(579);
				match(T_SET);
				setState(580);
				match(T_NULL);
				 ((Create_table_fk_actionContext)_localctx).res =  hql_create_table_option_item_val("ON_DELETE", "SET_NULL"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(582);
				match(T_ON);
				setState(583);
				match(T_UPDATE);
				setState(584);
				match(T_SET);
				setState(585);
				match(T_DEFAULT);
				 ((Create_table_fk_actionContext)_localctx).res =  hql_create_table_option_item_val("ON_DELETE", "SET_DEFAULT"); 
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

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public std::string res;
		public Create_table_preoptions_itemContext create_table_preoptions_item;
		public Create_table_preoptionsContext create_table_preoptions;
		public Create_table_preoptions_itemContext create_table_preoptions_item() {
			return getRuleContext(Create_table_preoptions_itemContext.class,0);
		}
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_create_table_preoptions);
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				((Create_table_preoptionsContext)_localctx).create_table_preoptions_item = create_table_preoptions_item();
				 ((Create_table_preoptionsContext)_localctx).res =  ((Create_table_preoptionsContext)_localctx).create_table_preoptions_item.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				((Create_table_preoptionsContext)_localctx).create_table_preoptions_item = create_table_preoptions_item();
				setState(593);
				((Create_table_preoptionsContext)_localctx).create_table_preoptions = create_table_preoptions();
				 ((Create_table_preoptionsContext)_localctx).res =  hql_recur_list(((Create_table_preoptionsContext)_localctx).create_table_preoptions_item.res, ((Create_table_preoptionsContext)_localctx).create_table_preoptions.res); 
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

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public std::string res;
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item;
		public Create_table_options_hive_itemContext create_table_options_hive_item;
		public TerminalNode T_COMMA() { return getToken(HiveParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_create_table_preoptions_item);
		try {
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(T_COMMA);
				setState(599);
				((Create_table_preoptions_itemContext)_localctx).create_table_preoptions_td_item = create_table_preoptions_td_item();
				 ((Create_table_preoptions_itemContext)_localctx).res =  ((Create_table_preoptions_itemContext)_localctx).create_table_preoptions_td_item.res; 
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				((Create_table_preoptions_itemContext)_localctx).create_table_options_hive_item = create_table_options_hive_item();
				 ((Create_table_preoptions_itemContext)_localctx).res =  ((Create_table_preoptions_itemContext)_localctx).create_table_options_hive_item.res; 
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

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public std::string res;
		public TerminalNode T_NO() { return getToken(HiveParser.T_NO, 0); }
		public TerminalNode T_LOG() { return getToken(HiveParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HiveParser.T_FALLBACK, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_create_table_preoptions_td_item);
		try {
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(T_NO);
				setState(608);
				match(T_LOG);
				 ((Create_table_preoptions_td_itemContext)_localctx).res =  hql_create_table_option_item_val("NOLOG", "null"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				match(T_NO);
				setState(611);
				match(T_FALLBACK);
				 ((Create_table_preoptions_td_itemContext)_localctx).res =  hql_create_table_option_item_val("NOFALLBACK", "null"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				match(T_FALLBACK);
				 ((Create_table_preoptions_td_itemContext)_localctx).res =  hql_create_table_option_item_val("FALLBACK", "null"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(615);
				match(T_LOG);
				 ((Create_table_preoptions_td_itemContext)_localctx).res =  hql_create_table_option_item_val("LOG", "null"); 
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

	public static class Create_table_optionsContext extends ParserRuleContext {
		public std::string res;
		public Create_table_options_itemContext create_table_options_item;
		public Create_table_optionsContext create_table_options;
		public Create_table_options_itemContext create_table_options_item() {
			return getRuleContext(Create_table_options_itemContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_create_table_options);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				((Create_table_optionsContext)_localctx).create_table_options_item = create_table_options_item();
				 ((Create_table_optionsContext)_localctx).res =  ((Create_table_optionsContext)_localctx).create_table_options_item.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				((Create_table_optionsContext)_localctx).create_table_options_item = create_table_options_item();
				setState(623);
				((Create_table_optionsContext)_localctx).create_table_options = create_table_options();
				 ((Create_table_optionsContext)_localctx).res =  hql_recur_list(((Create_table_optionsContext)_localctx).create_table_options_item.res, ((Create_table_optionsContext)_localctx).create_table_options.res); 
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

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public std::string res;
		public Create_table_options_ora_itemContext create_table_options_ora_item;
		public Create_table_options_db2_itemContext create_table_options_db2_item;
		public Create_table_options_td_itemContext create_table_options_td_item;
		public Create_table_options_hive_itemContext create_table_options_hive_item;
		public Create_table_options_mssql_itemContext create_table_options_mssql_item;
		public Create_table_options_mysql_itemContext create_table_options_mysql_item;
		public TerminalNode T_ON() { return getToken(HiveParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(HiveParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(HiveParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(HiveParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HiveParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_create_table_options_item);
		int _la;
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				match(T_ON);
				setState(629);
				match(T_COMMIT);
				setState(630);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(631);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				((Create_table_options_itemContext)_localctx).create_table_options_ora_item = create_table_options_ora_item();
				 ((Create_table_options_itemContext)_localctx).res =  ((Create_table_options_itemContext)_localctx).create_table_options_ora_item.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(635);
				((Create_table_options_itemContext)_localctx).create_table_options_db2_item = create_table_options_db2_item();
				 ((Create_table_options_itemContext)_localctx).res =  ((Create_table_options_itemContext)_localctx).create_table_options_db2_item.res; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(638);
				((Create_table_options_itemContext)_localctx).create_table_options_td_item = create_table_options_td_item();
				 ((Create_table_options_itemContext)_localctx).res =  ((Create_table_options_itemContext)_localctx).create_table_options_td_item.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(641);
				((Create_table_options_itemContext)_localctx).create_table_options_hive_item = create_table_options_hive_item();
				 ((Create_table_options_itemContext)_localctx).res =  ((Create_table_options_itemContext)_localctx).create_table_options_hive_item.res; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(644);
				((Create_table_options_itemContext)_localctx).create_table_options_mssql_item = create_table_options_mssql_item();
				 ((Create_table_options_itemContext)_localctx).res =  ((Create_table_options_itemContext)_localctx).create_table_options_mssql_item.res; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(647);
				((Create_table_options_itemContext)_localctx).create_table_options_mysql_item = create_table_options_mysql_item();
				 ((Create_table_options_itemContext)_localctx).res =  ((Create_table_options_itemContext)_localctx).create_table_options_mysql_item.res; 
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

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public std::string res;
		public Token v;
		public Token L_INT;
		public IdentContext ident;
		public TerminalNode T_SEGMENT() { return getToken(HiveParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(HiveParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HiveParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HiveParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HiveParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HiveParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(HiveParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HiveParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(HiveParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HiveParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HiveParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(HiveParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HiveParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(HiveParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(HiveParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				match(T_SEGMENT);
				setState(653);
				match(T_CREATION);
				setState(654);
				((Create_table_options_ora_itemContext)_localctx).v = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
					((Create_table_options_ora_itemContext)_localctx).v = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 ((Create_table_options_ora_itemContext)_localctx).res =  hql_create_table_option_item_val("SEGMENT_CREATION", (((Create_table_options_ora_itemContext)_localctx).v!=null?((Create_table_options_ora_itemContext)_localctx).v.getText():null)); 
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				((Create_table_options_ora_itemContext)_localctx).v = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
					((Create_table_options_ora_itemContext)_localctx).v = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(657);
				((Create_table_options_ora_itemContext)_localctx).L_INT = match(L_INT);
				 ((Create_table_options_ora_itemContext)_localctx).res =  hql_create_table_option_item_val((((Create_table_options_ora_itemContext)_localctx).v!=null?((Create_table_options_ora_itemContext)_localctx).v.getText():null), (((Create_table_options_ora_itemContext)_localctx).L_INT!=null?((Create_table_options_ora_itemContext)_localctx).L_INT.getText():null)); 
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(659);
				match(T_NOCOMPRESS);
				 ((Create_table_options_ora_itemContext)_localctx).res =  hql_create_table_option_item_val("NOCOMPRESS", "null"); 
				}
				break;
			case T_LOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(661);
				match(T_LOGGING);
				 ((Create_table_options_ora_itemContext)_localctx).res =  hql_create_table_option_item_val("LOGGING", "TRUE"); 
				}
				break;
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 5);
				{
				setState(663);
				match(T_NOLOGGING);
				 ((Create_table_options_ora_itemContext)_localctx).res =  hql_create_table_option_item_val("LOGGING", "FALSE"); 
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 6);
				{
				setState(665);
				match(T_STORAGE);
				setState(666);
				match(T_OPEN_P);
				setState(669); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(669);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
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
					case T_DATA:
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
					case T_HIVE:
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
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
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
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
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
					case T_SUBSTR:
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
					case T_SUB:
					case L_ID:
						{
						setState(667);
						ident();
						}
						break;
					case L_INT:
						{
						setState(668);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(671); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (T_NUMERIC - 193)) | (1L << (T_NUMBER - 193)) | (1L << (T_OBJECT - 193)) | (1L << (T_OFF - 193)) | (1L << (T_ON - 193)) | (1L << (T_ONLY - 193)) | (1L << (T_OPEN - 193)) | (1L << (T_OR - 193)) | (1L << (T_ORDER - 193)) | (1L << (T_OUT - 193)) | (1L << (T_OUTER - 193)) | (1L << (T_OVER - 193)) | (1L << (T_OVERWRITE - 193)) | (1L << (T_OWNER - 193)) | (1L << (T_PACKAGE - 193)) | (1L << (T_PARTITION - 193)) | (1L << (T_PCTFREE - 193)) | (1L << (T_PCTUSED - 193)) | (1L << (T_PRECISION - 193)) | (1L << (T_PRESERVE - 193)) | (1L << (T_PRIMARY - 193)) | (1L << (T_PRINT - 193)) | (1L << (T_PROC - 193)) | (1L << (T_PROCEDURE - 193)) | (1L << (T_QUALIFY - 193)) | (1L << (T_QUERY_BAND - 193)) | (1L << (T_QUIT - 193)) | (1L << (T_QUOTED_IDENTIFIER - 193)) | (1L << (T_RAISE - 193)) | (1L << (T_REAL - 193)) | (1L << (T_REFERENCES - 193)) | (1L << (T_REGEXP - 193)) | (1L << (T_REPLACE - 193)) | (1L << (T_RESIGNAL - 193)) | (1L << (T_RESTRICT - 193)) | (1L << (T_RESULT - 193)) | (1L << (T_RESULT_SET_LOCATOR - 193)) | (1L << (T_RETURN - 193)) | (1L << (T_RETURNS - 193)) | (1L << (T_REVERSE - 193)) | (1L << (T_RIGHT - 193)) | (1L << (T_RLIKE - 193)) | (1L << (T_ROLE - 193)) | (1L << (T_ROLLBACK - 193)) | (1L << (T_ROW - 193)) | (1L << (T_ROWS - 193)) | (1L << (T_ROW_COUNT - 193)) | (1L << (T_RR - 193)) | (1L << (T_RS - 193)) | (1L << (T_PWD - 193)) | (1L << (T_TRIM - 193)) | (1L << (T_SCHEMA - 193)) | (1L << (T_SECOND - 193)) | (1L << (T_SECONDS - 193)) | (1L << (T_SECURITY - 193)) | (1L << (T_SEGMENT - 193)) | (1L << (T_SEL - 193)) | (1L << (T_SELECT - 193)) | (1L << (T_SET - 193)) | (1L << (T_SESSION - 193)) | (1L << (T_SESSIONS - 193)) | (1L << (T_SETS - 193)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (T_SHARE - 257)) | (1L << (T_SIGNAL - 257)) | (1L << (T_SIMPLE_DOUBLE - 257)) | (1L << (T_SIMPLE_FLOAT - 257)) | (1L << (T_SMALLDATETIME - 257)) | (1L << (T_SMALLINT - 257)) | (1L << (T_SQL - 257)) | (1L << (T_SQLEXCEPTION - 257)) | (1L << (T_SQLINSERT - 257)) | (1L << (T_SQLSTATE - 257)) | (1L << (T_SQLWARNING - 257)) | (1L << (T_STATS - 257)) | (1L << (T_STATISTICS - 257)) | (1L << (T_STEP - 257)) | (1L << (T_STORAGE - 257)) | (1L << (T_STORED - 257)) | (1L << (T_STRING - 257)) | (1L << (T_SUBDIR - 257)) | (1L << (T_SUBSTR - 257)) | (1L << (T_SUBSTRING - 257)) | (1L << (T_SUM - 257)) | (1L << (T_SUMMARY - 257)) | (1L << (T_SYS_REFCURSOR - 257)) | (1L << (T_TABLE - 257)) | (1L << (T_TABLESPACE - 257)) | (1L << (T_TEMPORARY - 257)) | (1L << (T_TERMINATED - 257)) | (1L << (T_TEXTIMAGE_ON - 257)) | (1L << (T_THEN - 257)) | (1L << (T_TIMESTAMP - 257)) | (1L << (T_TITLE - 257)) | (1L << (T_TO - 257)) | (1L << (T_TOP - 257)) | (1L << (T_TRANSACTION - 257)) | (1L << (T_TRUE - 257)) | (1L << (T_TRUNCATE - 257)) | (1L << (T_UNIQUE - 257)) | (1L << (T_UPDATE - 257)) | (1L << (T_UR - 257)) | (1L << (T_USE - 257)) | (1L << (T_USING - 257)) | (1L << (T_VALUE - 257)) | (1L << (T_VALUES - 257)) | (1L << (T_VAR - 257)) | (1L << (T_VARCHAR - 257)) | (1L << (T_VARCHAR2 - 257)) | (1L << (T_VARYING - 257)) | (1L << (T_VOLATILE - 257)) | (1L << (T_WHILE - 257)) | (1L << (T_WITH - 257)) | (1L << (T_WITHOUT - 257)) | (1L << (T_WORK - 257)) | (1L << (T_XACT_ABORT - 257)) | (1L << (T_XML - 257)) | (1L << (T_YES - 257)) | (1L << (T_ACTIVITY_COUNT - 257)) | (1L << (T_CUME_DIST - 257)) | (1L << (T_CURRENT_DATE - 257)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)) | (1L << (T_SUB - 321)) | (1L << (L_ID - 321)) | (1L << (L_INT - 321)))) != 0) );
				setState(673);
				match(T_CLOSE_P);
				 ((Create_table_options_ora_itemContext)_localctx).res =  hql_create_table_option_item_val("STORAGE", "null"); 
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(675);
				match(T_TABLESPACE);
				setState(676);
				((Create_table_options_ora_itemContext)_localctx).ident = ident();
				 ((Create_table_options_ora_itemContext)_localctx).res =  hql_create_table_option_item_val("TABLESPACE", (((Create_table_options_ora_itemContext)_localctx).ident!=null?_input.getText(((Create_table_options_ora_itemContext)_localctx).ident.start,((Create_table_options_ora_itemContext)_localctx).ident.stop):null)); 
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

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public std::string res;
		public IdentContext ident;
		public IdentContext fst;
		public Token c;
		public TerminalNode T_IN() { return getToken(HiveParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(HiveParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(HiveParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(HiveParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HiveParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(HiveParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public TerminalNode T_LOGGED() { return getToken(HiveParser.T_LOGGED, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HiveParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(HiveParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(HiveParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HiveParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(HiveParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HiveParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(HiveParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(HiveParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(681);
					match(T_INDEX);
					}
				}

				setState(684);
				match(T_IN);
				setState(685);
				((Create_table_options_db2_itemContext)_localctx).ident = ident();
				 ((Create_table_options_db2_itemContext)_localctx).res =  hql_create_table_option_item_val("INDEX_IN", (((Create_table_options_db2_itemContext)_localctx).ident!=null?_input.getText(((Create_table_options_db2_itemContext)_localctx).ident.start,((Create_table_options_db2_itemContext)_localctx).ident.stop):null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				match(T_WITH);
				setState(689);
				match(T_REPLACE);
				 ((Create_table_options_db2_itemContext)_localctx).res =  hql_create_table_option_item_val("WITH_REPLACE", "null"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(691);
				match(T_DISTRIBUTE);
				setState(692);
				match(T_BY);
				setState(693);
				match(T_HASH);
				setState(694);
				match(T_OPEN_P);
				setState(695);
				((Create_table_options_db2_itemContext)_localctx).fst = ident();
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(696);
					match(T_COMMA);
					setState(697);
					ident();
					}
					}
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(703);
				match(T_CLOSE_P);
				 ((Create_table_options_db2_itemContext)_localctx).res =  hql_create_table_option_item_val("DISTRIBUTE_BY_HASH", (((Create_table_options_db2_itemContext)_localctx).fst!=null?_input.getText(((Create_table_options_db2_itemContext)_localctx).fst.start,((Create_table_options_db2_itemContext)_localctx).fst.stop):null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(706);
				match(T_NOT);
				setState(707);
				match(T_LOGGED);
				 ((Create_table_options_db2_itemContext)_localctx).res =  hql_create_table_option_item_val("LOGGED", "FALSE"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(709);
				match(T_LOGGED);
				 ((Create_table_options_db2_itemContext)_localctx).res =  hql_create_table_option_item_val("LOGGED", "TRUE"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(711);
				match(T_COMPRESS);
				setState(712);
				((Create_table_options_db2_itemContext)_localctx).c = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
					((Create_table_options_db2_itemContext)_localctx).c = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 ((Create_table_options_db2_itemContext)_localctx).res =  hql_create_table_option_item_val("COMPRESS", (((Create_table_options_db2_itemContext)_localctx).c!=null?((Create_table_options_db2_itemContext)_localctx).c.getText():null)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(714);
				match(T_DEFINITION);
				setState(715);
				match(T_ONLY);
				 ((Create_table_options_db2_itemContext)_localctx).res =  hql_create_table_option_item_val("DEFINITION_ONLY", "null"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(717);
				match(T_WITH);
				setState(718);
				match(T_RESTRICT);
				setState(719);
				match(T_ON);
				setState(720);
				match(T_DROP);
				 ((Create_table_options_db2_itemContext)_localctx).res =  hql_create_table_option_item_val("WITH_RESTRICT_ON_DROP", "null"); 
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

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public std::string res;
		public IdentContext fst;
		public TerminalNode T_PRIMARY() { return getToken(HiveParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(HiveParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_UNIQUE() { return getToken(HiveParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(HiveParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(HiveParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(724);
					match(T_UNIQUE);
					}
				}

				setState(727);
				match(T_PRIMARY);
				setState(728);
				match(T_INDEX);
				setState(729);
				match(T_OPEN_P);
				setState(730);
				((Create_table_options_td_itemContext)_localctx).fst = ident();
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(731);
					match(T_COMMA);
					setState(732);
					ident();
					}
					}
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(738);
				match(T_CLOSE_P);
				 ((Create_table_options_td_itemContext)_localctx).res =  hql_create_table_option_item_val("PRIMARY_INDEX", (((Create_table_options_td_itemContext)_localctx).fst!=null?_input.getText(((Create_table_options_td_itemContext)_localctx).fst.start,((Create_table_options_td_itemContext)_localctx).fst.stop):null)); 
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				match(T_WITH);
				setState(742);
				match(T_DATA);
				 ((Create_table_options_td_itemContext)_localctx).res =  hql_create_table_option_item_val("WITH_DATA", "null"); 
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

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public std::string res;
		public Create_table_hive_row_formatContext create_table_hive_row_format;
		public IdentContext ident;
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(HiveParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_create_table_options_hive_item);
		try {
			setState(754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				((Create_table_options_hive_itemContext)_localctx).create_table_hive_row_format = create_table_hive_row_format();
				 ((Create_table_options_hive_itemContext)_localctx).res =  ((Create_table_options_hive_itemContext)_localctx).create_table_hive_row_format.res; 
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				match(T_STORED);
				setState(750);
				match(T_AS);
				setState(751);
				((Create_table_options_hive_itemContext)_localctx).ident = ident();
				 ((Create_table_options_hive_itemContext)_localctx).res =  hql_create_table_option_item_val("STORED_AS", (((Create_table_options_hive_itemContext)_localctx).ident!=null?_input.getText(((Create_table_options_hive_itemContext)_localctx).ident.start,((Create_table_options_hive_itemContext)_localctx).ident.stop):null)); 
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

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public std::string res;
		public Create_table_hive_row_format_fields_listContext create_table_hive_row_format_fields_list;
		public TerminalNode T_ROW() { return getToken(HiveParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(HiveParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HiveParser.T_DELIMITED, 0); }
		public Create_table_hive_row_format_fields_listContext create_table_hive_row_format_fields_list() {
			return getRuleContext(Create_table_hive_row_format_fields_listContext.class,0);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_create_table_hive_row_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(T_ROW);
			setState(757);
			match(T_FORMAT);
			setState(758);
			match(T_DELIMITED);
			setState(759);
			((Create_table_hive_row_formatContext)_localctx).create_table_hive_row_format_fields_list = create_table_hive_row_format_fields_list();
			 ((Create_table_hive_row_formatContext)_localctx).res =  hql_create_table_option_item("ROW_FORMAT_DELIMITED", ((Create_table_hive_row_formatContext)_localctx).create_table_hive_row_format_fields_list.res); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_format_fields_listContext extends ParserRuleContext {
		public std::string res;
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields;
		public Create_table_hive_row_format_fields_listContext create_table_hive_row_format_fields_list;
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,0);
		}
		public Create_table_hive_row_format_fields_listContext create_table_hive_row_format_fields_list() {
			return getRuleContext(Create_table_hive_row_format_fields_listContext.class,0);
		}
		public Create_table_hive_row_format_fields_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields_list; }
	}

	public final Create_table_hive_row_format_fields_listContext create_table_hive_row_format_fields_list() throws RecognitionException {
		Create_table_hive_row_format_fields_listContext _localctx = new Create_table_hive_row_format_fields_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_create_table_hive_row_format_fields_list);
		try {
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T_AS:
			case T_AUTO_INCREMENT:
			case T_CHARACTER:
			case T_CHARSET:
			case T_COMMENT:
			case T_COMPRESS:
			case T_DEFAULT:
			case T_DEFINITION:
			case T_DISTRIBUTE:
			case T_ENGINE:
			case T_IN:
			case T_INDEX:
			case T_INITRANS:
			case T_LIKE:
			case T_LOGGED:
			case T_LOGGING:
			case T_MAXTRANS:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NOT:
			case T_ON:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRIMARY:
			case T_ROW:
			case T_SEGMENT:
			case T_SELECT:
			case T_STORAGE:
			case T_STORED:
			case T_TABLESPACE:
			case T_TEXTIMAGE_ON:
			case T_UNIQUE:
			case T_WITH:
			case T_COMMA:
			case T_OPEN_P:
				enterOuterAlt(_localctx, 1);
				{
				 ((Create_table_hive_row_format_fields_listContext)_localctx).res =  "null"; 
				}
				break;
			case T_COLLECTION:
			case T_FIELDS:
			case T_LINES:
			case T_MAP:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				((Create_table_hive_row_format_fields_listContext)_localctx).create_table_hive_row_format_fields = create_table_hive_row_format_fields();
				setState(764);
				((Create_table_hive_row_format_fields_listContext)_localctx).create_table_hive_row_format_fields_list = create_table_hive_row_format_fields_list();
				 ((Create_table_hive_row_format_fields_listContext)_localctx).res =  hql_recur_list(((Create_table_hive_row_format_fields_listContext)_localctx).create_table_hive_row_format_fields.res, ((Create_table_hive_row_format_fields_listContext)_localctx).create_table_hive_row_format_fields_list.res); 
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

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public std::string res;
		public ExprContext terminated_expr;
		public ExprContext escap_expr;
		public ExprContext expr;
		public TerminalNode T_FIELDS() { return getToken(HiveParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HiveParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(HiveParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(HiveParser.T_BY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ESCAPED() { return getToken(HiveParser.T_ESCAPED, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HiveParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(HiveParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(HiveParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(HiveParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(HiveParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(HiveParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(HiveParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_create_table_hive_row_format_fields);
		try {
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				match(T_FIELDS);
				setState(770);
				match(T_TERMINATED);
				setState(771);
				match(T_BY);
				setState(772);
				((Create_table_hive_row_format_fieldsContext)_localctx).terminated_expr = expr(0);
				 ((Create_table_hive_row_format_fieldsContext)_localctx).res =  hql_create_table_option_item_val(((Create_table_hive_row_format_fieldsContext)_localctx).terminated_expr.res, "null"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				match(T_FIELDS);
				setState(776);
				match(T_TERMINATED);
				setState(777);
				match(T_BY);
				setState(778);
				((Create_table_hive_row_format_fieldsContext)_localctx).terminated_expr = expr(0);
				setState(779);
				match(T_ESCAPED);
				setState(780);
				match(T_BY);
				setState(781);
				((Create_table_hive_row_format_fieldsContext)_localctx).escap_expr = expr(0);
				 ((Create_table_hive_row_format_fieldsContext)_localctx).res =  hql_create_table_fields_spec(((Create_table_hive_row_format_fieldsContext)_localctx).terminated_expr.res, ((Create_table_hive_row_format_fieldsContext)_localctx).escap_expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(784);
				match(T_COLLECTION);
				setState(785);
				match(T_ITEMS);
				setState(786);
				match(T_TERMINATED);
				setState(787);
				match(T_BY);
				setState(788);
				((Create_table_hive_row_format_fieldsContext)_localctx).expr = expr(0);
				 ((Create_table_hive_row_format_fieldsContext)_localctx).res =  hql_create_table_option_item("COLLECTION_ITEMS_TERMINATED", ((Create_table_hive_row_format_fieldsContext)_localctx).expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(791);
				match(T_MAP);
				setState(792);
				match(T_KEYS);
				setState(793);
				match(T_TERMINATED);
				setState(794);
				match(T_BY);
				setState(795);
				((Create_table_hive_row_format_fieldsContext)_localctx).expr = expr(0);
				 ((Create_table_hive_row_format_fieldsContext)_localctx).res =  hql_create_table_option_item("MAP_KEYS_TERMINATED", ((Create_table_hive_row_format_fieldsContext)_localctx).expr.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(798);
				match(T_LINES);
				setState(799);
				match(T_TERMINATED);
				setState(800);
				match(T_BY);
				setState(801);
				((Create_table_hive_row_format_fieldsContext)_localctx).expr = expr(0);
				 ((Create_table_hive_row_format_fieldsContext)_localctx).res =  hql_create_table_option_item("LINES_TERMINATED", ((Create_table_hive_row_format_fieldsContext)_localctx).expr.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(804);
				match(T_NULL);
				setState(805);
				match(T_DEFINED);
				setState(806);
				match(T_AS);
				setState(807);
				((Create_table_hive_row_format_fieldsContext)_localctx).expr = expr(0);
				 ((Create_table_hive_row_format_fieldsContext)_localctx).res =  hql_create_table_option_item("NULL_DEFINED", ((Create_table_hive_row_format_fieldsContext)_localctx).expr.res); 
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

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public std::string res;
		public Token T_ON;
		public IdentContext ident;
		public Token T_TEXTIMAGE_ON;
		public TerminalNode T_ON() { return getToken(HiveParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HiveParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_create_table_options_mssql_item);
		try {
			setState(820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				((Create_table_options_mssql_itemContext)_localctx).T_ON = match(T_ON);
				setState(813);
				((Create_table_options_mssql_itemContext)_localctx).ident = ident();
				 ((Create_table_options_mssql_itemContext)_localctx).res =  (hql_create_table_option_item_val((((Create_table_options_mssql_itemContext)_localctx).T_ON!=null?((Create_table_options_mssql_itemContext)_localctx).T_ON.getText():null), (((Create_table_options_mssql_itemContext)_localctx).ident!=null?_input.getText(((Create_table_options_mssql_itemContext)_localctx).ident.start,((Create_table_options_mssql_itemContext)_localctx).ident.stop):null)); 
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				((Create_table_options_mssql_itemContext)_localctx).T_TEXTIMAGE_ON = match(T_TEXTIMAGE_ON);
				setState(817);
				((Create_table_options_mssql_itemContext)_localctx).ident = ident();
				 ((Create_table_options_mssql_itemContext)_localctx).res =  hql_create_table_option_item_val((((Create_table_options_mssql_itemContext)_localctx).T_TEXTIMAGE_ON!=null?((Create_table_options_mssql_itemContext)_localctx).T_TEXTIMAGE_ON.getText():null), (((Create_table_options_mssql_itemContext)_localctx).ident!=null?_input.getText(((Create_table_options_mssql_itemContext)_localctx).ident.start,((Create_table_options_mssql_itemContext)_localctx).ident.stop):null)); 
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

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public std::string res;
		public Token T_AUTO_INCREMENT;
		public ExprContext expr;
		public Token T_COMMENT;
		public Token T_DEFAULT;
		public Token T_ENGINE;
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HiveParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HiveParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(HiveParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HiveParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HiveParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(HiveParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HiveParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(HiveParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				((Create_table_options_mysql_itemContext)_localctx).T_AUTO_INCREMENT = match(T_AUTO_INCREMENT);
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(823);
					match(T_EQUAL);
					}
				}

				setState(826);
				((Create_table_options_mysql_itemContext)_localctx).expr = expr(0);
				 ((Create_table_options_mysql_itemContext)_localctx).res =  hql_create_table_option_item((((Create_table_options_mysql_itemContext)_localctx).T_AUTO_INCREMENT!=null?((Create_table_options_mysql_itemContext)_localctx).T_AUTO_INCREMENT.getText():null), ((Create_table_options_mysql_itemContext)_localctx).expr.res); 
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				((Create_table_options_mysql_itemContext)_localctx).T_COMMENT = match(T_COMMENT);
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(830);
					match(T_EQUAL);
					}
				}

				setState(833);
				((Create_table_options_mysql_itemContext)_localctx).expr = expr(0);
				 ((Create_table_options_mysql_itemContext)_localctx).res =  hql_create_table_option_item((((Create_table_options_mysql_itemContext)_localctx).T_COMMENT!=null?((Create_table_options_mysql_itemContext)_localctx).T_COMMENT.getText():null), ((Create_table_options_mysql_itemContext)_localctx).expr.res); 
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(836);
					((Create_table_options_mysql_itemContext)_localctx).T_DEFAULT = match(T_DEFAULT);
					}
				}

				setState(842);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(839);
					match(T_CHARACTER);
					setState(840);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(841);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(844);
					match(T_EQUAL);
					}
				}

				setState(847);
				((Create_table_options_mysql_itemContext)_localctx).expr = expr(0);
				 ((Create_table_options_mysql_itemContext)_localctx).res =  hql_create_table_option_item((((Create_table_options_mysql_itemContext)_localctx).T_DEFAULT!=null?((Create_table_options_mysql_itemContext)_localctx).T_DEFAULT.getText():null), ((Create_table_options_mysql_itemContext)_localctx).expr.res); 
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(850);
				((Create_table_options_mysql_itemContext)_localctx).T_ENGINE = match(T_ENGINE);
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(851);
					match(T_EQUAL);
					}
				}

				setState(854);
				((Create_table_options_mysql_itemContext)_localctx).expr = expr(0);
				 ((Create_table_options_mysql_itemContext)_localctx).res =  hql_create_table_option_item((((Create_table_options_mysql_itemContext)_localctx).T_ENGINE!=null?((Create_table_options_mysql_itemContext)_localctx).T_ENGINE.getText():null), ((Create_table_options_mysql_itemContext)_localctx).expr.res); 
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
		public std::string res;
		public Fullselect_stmtContext fullselect_stmt;
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			((Select_stmtContext)_localctx).fullselect_stmt = fullselect_stmt();
			 ((Select_stmtContext)_localctx).res =  ((Select_stmtContext)_localctx).fullselect_stmt.res; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public std::string res;
		public Fullselect_stmt_itemContext fullselect_stmt_item;
		public Fullselect_set_clauseContext fullselect_set_clause;
		public Fullselect_stmtContext fullselect_stmt;
		public Fullselect_stmt_itemContext fullselect_stmt_item() {
			return getRuleContext(Fullselect_stmt_itemContext.class,0);
		}
		public Fullselect_set_clauseContext fullselect_set_clause() {
			return getRuleContext(Fullselect_set_clauseContext.class,0);
		}
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fullselect_stmt);
		try {
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				((Fullselect_stmtContext)_localctx).fullselect_stmt_item = fullselect_stmt_item();
				 ((Fullselect_stmtContext)_localctx).res =  ((Fullselect_stmtContext)_localctx).fullselect_stmt_item.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				((Fullselect_stmtContext)_localctx).fullselect_stmt_item = fullselect_stmt_item();
				setState(866);
				((Fullselect_stmtContext)_localctx).fullselect_set_clause = fullselect_set_clause();
				setState(867);
				((Fullselect_stmtContext)_localctx).fullselect_stmt = fullselect_stmt();
				 ((Fullselect_stmtContext)_localctx).res =  hql_select_set_opt(((Fullselect_stmtContext)_localctx).fullselect_set_clause.res, ((Fullselect_stmtContext)_localctx).fullselect_stmt_item.res, ((Fullselect_stmtContext)_localctx).fullselect_stmt.res); 
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

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public std::string res;
		public Subselect_stmtContext subselect_stmt;
		public Fullselect_stmtContext fullselect_stmt;
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fullselect_stmt_item);
		try {
			setState(880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				((Fullselect_stmt_itemContext)_localctx).subselect_stmt = subselect_stmt();
				 ((Fullselect_stmt_itemContext)_localctx).res =  ((Fullselect_stmt_itemContext)_localctx).subselect_stmt.res; 
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				match(T_OPEN_P);
				setState(876);
				((Fullselect_stmt_itemContext)_localctx).fullselect_stmt = fullselect_stmt();
				setState(877);
				match(T_CLOSE_P);
				 ((Fullselect_stmt_itemContext)_localctx).res =  ((Fullselect_stmt_itemContext)_localctx).fullselect_stmt.res; 
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

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public std::string res;
		public TerminalNode T_UNION() { return getToken(HiveParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(HiveParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HiveParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HiveParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fullselect_set_clause);
		try {
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				match(T_UNION);
				setState(883);
				match(T_ALL);
				 ((Fullselect_set_clauseContext)_localctx).res =  "UNION_ALL"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				match(T_UNION);
				 ((Fullselect_set_clauseContext)_localctx).res =  "UNION"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(887);
				match(T_EXCEPT);
				 ((Fullselect_set_clauseContext)_localctx).res =  "EXCEPT"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(889);
				match(T_EXCEPT);
				setState(890);
				match(T_ALL);
				 ((Fullselect_set_clauseContext)_localctx).res =  "EXCEPT_ALL"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(892);
				match(T_INTERSECT);
				 ((Fullselect_set_clauseContext)_localctx).res =  "INTERSECT"; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(894);
				match(T_INTERSECT);
				setState(895);
				match(T_ALL);
				 ((Fullselect_set_clauseContext)_localctx).res =  "INTERSECT_ALL"; 
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

	public static class Subselect_stmtContext extends ParserRuleContext {
		public std::string res;
		public Select_listContext select_list;
		public From_clauseContext from_clause;
		public Where_clauseContext where_clause;
		public Group_by_clauseContext group_by_clause;
		public Having_qualify_clauseContext having_qualify_clause;
		public Order_by_clauseContext order_by_clause;
		public Select_optionsContext select_options;
		public TerminalNode T_SELECT() { return getToken(HiveParser.T_SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_qualify_clauseContext having_qualify_clause() {
			return getRuleContext(Having_qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_subselect_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(T_SELECT);
			setState(900);
			((Subselect_stmtContext)_localctx).select_list = select_list();
			setState(901);
			into_clause();
			setState(902);
			((Subselect_stmtContext)_localctx).from_clause = from_clause();
			setState(903);
			((Subselect_stmtContext)_localctx).where_clause = where_clause();
			setState(904);
			((Subselect_stmtContext)_localctx).group_by_clause = group_by_clause();
			setState(905);
			((Subselect_stmtContext)_localctx).having_qualify_clause = having_qualify_clause();
			setState(906);
			((Subselect_stmtContext)_localctx).order_by_clause = order_by_clause();
			setState(907);
			((Subselect_stmtContext)_localctx).select_options = select_options();

			        ((Subselect_stmtContext)_localctx).res =  hql_subselect_stmt(((Subselect_stmtContext)_localctx).select_list.res, ((Subselect_stmtContext)_localctx).from_clause.res, ((Subselect_stmtContext)_localctx).where_clause.res, ((Subselect_stmtContext)_localctx).group_by_clause.res, ((Subselect_stmtContext)_localctx).having_qualify_clause.res, ((Subselect_stmtContext)_localctx).order_by_clause.res, ((Subselect_stmtContext)_localctx).select_options.res);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_qualify_clauseContext extends ParserRuleContext {
		public std::string res;
		public Having_clauseContext having_clause;
		public Qualify_clauseContext qualify_clause;
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Having_qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_qualify_clause; }
	}

	public final Having_qualify_clauseContext having_qualify_clause() throws RecognitionException {
		Having_qualify_clauseContext _localctx = new Having_qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_having_qualify_clause);
		try {
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Having_qualify_clauseContext)_localctx).res =  "null"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				((Having_qualify_clauseContext)_localctx).having_clause = having_clause();
				 ((Having_qualify_clauseContext)_localctx).res =  ((Having_qualify_clauseContext)_localctx).having_clause.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(914);
				((Having_qualify_clauseContext)_localctx).qualify_clause = qualify_clause();
				 ((Having_qualify_clauseContext)_localctx).res =  ((Having_qualify_clauseContext)_localctx).qualify_clause.res; 
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

	public static class Select_listContext extends ParserRuleContext {
		public std::string res;
		public Select_list_setContext select_list_set;
		public Select_list_limitContext select_list_limit;
		public Select_expr_listContext select_expr_list;
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public Select_expr_listContext select_expr_list() {
			return getRuleContext(Select_expr_listContext.class,0);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_select_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			((Select_listContext)_localctx).select_list_set = select_list_set();
			setState(920);
			((Select_listContext)_localctx).select_list_limit = select_list_limit();
			setState(921);
			((Select_listContext)_localctx).select_expr_list = select_expr_list();
			 ((Select_listContext)_localctx).res =  hql_select_list(((Select_listContext)_localctx).select_list_set.res, ((Select_listContext)_localctx).select_list_limit.res, ((Select_listContext)_localctx).select_expr_list.res); 
			}
		}
		catch (RecognitionException re) {
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
		public std::string res;
		public Select_list_itemContext select_list_item;
		public Select_expr_listContext select_expr_list;
		public Select_list_itemContext select_list_item() {
			return getRuleContext(Select_list_itemContext.class,0);
		}
		public TerminalNode T_COMMA() { return getToken(HiveParser.T_COMMA, 0); }
		public Select_expr_listContext select_expr_list() {
			return getRuleContext(Select_expr_listContext.class,0);
		}
		public Select_expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expr_list; }
	}

	public final Select_expr_listContext select_expr_list() throws RecognitionException {
		Select_expr_listContext _localctx = new Select_expr_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_select_expr_list);
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				((Select_expr_listContext)_localctx).select_list_item = select_list_item();
				 ((Select_expr_listContext)_localctx).res =  ((Select_expr_listContext)_localctx).select_list_item.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				((Select_expr_listContext)_localctx).select_list_item = select_list_item();
				setState(928);
				match(T_COMMA);
				setState(929);
				((Select_expr_listContext)_localctx).select_expr_list = select_expr_list();
				 ((Select_expr_listContext)_localctx).res =  hql_recur_list(((Select_expr_listContext)_localctx).select_list_item.res, ((Select_expr_listContext)_localctx).select_expr_list.res); 
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

	public static class Select_list_setContext extends ParserRuleContext {
		public std::string res;
		public TerminalNode T_ALL() { return getToken(HiveParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HiveParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_select_list_set);
		try {
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Select_list_setContext)_localctx).res =  "ALL"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				match(T_ALL);
				  ((Select_list_setContext)_localctx).res =  "ALL"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(937);
				match(T_DISTINCT);
				  ((Select_list_setContext)_localctx).res =  "DISTINCT"; 
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

	public static class Select_list_limitContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public TerminalNode T_TOP() { return getToken(HiveParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_select_list_limit);
		try {
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Select_list_limitContext)_localctx).res =  "\"ALL\""; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(T_TOP);
				setState(943);
				((Select_list_limitContext)_localctx).expr = expr(0);
				 ((Select_list_limitContext)_localctx).res =  ((Select_list_limitContext)_localctx).expr.res; 
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

	public static class Select_list_itemContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public Select_list_aliasContext select_list_alias;
		public Select_list_asteriskContext select_list_asterisk;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HiveParser.T_EQUAL, 0); }
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_select_list_item);
		try {
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(948);
				ident();
				setState(949);
				match(T_EQUAL);
				}
				setState(951);
				((Select_list_itemContext)_localctx).expr = expr(0);
				setState(952);
				((Select_list_itemContext)_localctx).select_list_alias = select_list_alias();
				 ((Select_list_itemContext)_localctx).res =  hql_select_expr(((Select_list_itemContext)_localctx).expr.res, ((Select_list_itemContext)_localctx).select_list_alias.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				((Select_list_itemContext)_localctx).expr = expr(0);
				setState(956);
				((Select_list_itemContext)_localctx).select_list_alias = select_list_alias();
				 ((Select_list_itemContext)_localctx).res =  hql_select_expr(((Select_list_itemContext)_localctx).expr.res, ((Select_list_itemContext)_localctx).select_list_alias.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				((Select_list_itemContext)_localctx).select_list_asterisk = select_list_asterisk();
				 ((Select_list_itemContext)_localctx).res =  ((Select_list_itemContext)_localctx).select_list_asterisk.res; 
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

	public static class Select_list_aliasContext extends ParserRuleContext {
		public std::string res;
		public IdentContext ident;
		public Token L_S_STRING;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(HiveParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(HiveParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_select_list_alias);
		try {
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Select_list_aliasContext)_localctx).res =  "DEFAULT"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(965);
					match(T_AS);
					}
					break;
				}
				setState(968);
				((Select_list_aliasContext)_localctx).ident = ident();
				 ((Select_list_aliasContext)_localctx).res =  (((Select_list_aliasContext)_localctx).ident!=null?_input.getText(((Select_list_aliasContext)_localctx).ident.start,((Select_list_aliasContext)_localctx).ident.stop):null); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(971);
				match(T_OPEN_P);
				setState(972);
				match(T_TITLE);
				setState(973);
				((Select_list_aliasContext)_localctx).L_S_STRING = match(L_S_STRING);
				setState(974);
				match(T_CLOSE_P);
				 ((Select_list_aliasContext)_localctx).res =  (((Select_list_aliasContext)_localctx).L_S_STRING!=null?((Select_list_aliasContext)_localctx).L_S_STRING.getText():null); 
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

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public std::string res;
		public Token L_ID;
		public TerminalNode L_ID() { return getToken(HiveParser.L_ID, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_select_list_asterisk);
		try {
			setState(985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(978);
				((Select_list_asteriskContext)_localctx).L_ID = match(L_ID);
				setState(979);
				match(T__1);
				}
				setState(981);
				match(T_MUL);
				 ((Select_list_asteriskContext)_localctx).res =  hql_select_expr("\"ALL\"", (((Select_list_asteriskContext)_localctx).L_ID!=null?((Select_list_asteriskContext)_localctx).L_ID.getText():null)); 
				}
				break;
			case T_MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				match(T_MUL);
				 ((Select_list_asteriskContext)_localctx).res =  hql_select_expr("\"ALL\"", "DEFAULT"); 
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

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(HiveParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_into_clause);
		int _la;
		try {
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				match(T_INTO);
				setState(989);
				ident();
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(990);
					match(T_COMMA);
					setState(991);
					ident();
					}
					}
					setState(996);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class From_clauseContext extends ParserRuleContext {
		public std::string res;
		public From_table_clauseContext from_table_clause;
		public From_join_clause_listContext from_join_clause_list;
		public TerminalNode T_FROM() { return getToken(HiveParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_clause_listContext from_join_clause_list() {
			return getRuleContext(From_join_clause_listContext.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_from_clause);
		try {
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((From_clauseContext)_localctx).res =  "null"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				match(T_FROM);
				setState(1001);
				((From_clauseContext)_localctx).from_table_clause = from_table_clause();
				setState(1002);
				((From_clauseContext)_localctx).from_join_clause_list = from_join_clause_list();
				 ((From_clauseContext)_localctx).res =  hql_from_clause(((From_clauseContext)_localctx).from_table_clause.res, ((From_clauseContext)_localctx).from_join_clause_list.res); 
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

	public static class From_join_clause_listContext extends ParserRuleContext {
		public std::string res;
		public From_join_clauseContext from_join_clause;
		public From_join_clause_listContext from_join_clause_list;
		public From_join_clauseContext from_join_clause() {
			return getRuleContext(From_join_clauseContext.class,0);
		}
		public From_join_clause_listContext from_join_clause_list() {
			return getRuleContext(From_join_clause_listContext.class,0);
		}
		public From_join_clause_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause_list; }
	}

	public final From_join_clause_listContext from_join_clause_list() throws RecognitionException {
		From_join_clause_listContext _localctx = new From_join_clause_listContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_from_join_clause_list);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((From_join_clause_listContext)_localctx).res =  ""; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				((From_join_clause_listContext)_localctx).from_join_clause = from_join_clause();
				 ((From_join_clause_listContext)_localctx).res =  ((From_join_clause_listContext)_localctx).from_join_clause.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1011);
				((From_join_clause_listContext)_localctx).from_join_clause = from_join_clause();
				setState(1012);
				((From_join_clause_listContext)_localctx).from_join_clause_list = from_join_clause_list();
				 ((From_join_clause_listContext)_localctx).res =  hql_recur_list(((From_join_clause_listContext)_localctx).from_join_clause.res, ((From_join_clause_listContext)_localctx).from_join_clause_list.res); 
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

	public static class From_table_clauseContext extends ParserRuleContext {
		public std::string res;
		public From_table_name_clauseContext from_table_name_clause;
		public From_subselect_clauseContext from_subselect_clause;
		public From_table_values_clauseContext from_table_values_clause;
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_from_table_clause);
		try {
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				((From_table_clauseContext)_localctx).from_table_name_clause = from_table_name_clause();
				 ((From_table_clauseContext)_localctx).res =  ((From_table_clauseContext)_localctx).from_table_name_clause.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				((From_table_clauseContext)_localctx).from_subselect_clause = from_subselect_clause();
				 ((From_table_clauseContext)_localctx).res =  ((From_table_clauseContext)_localctx).from_subselect_clause.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1023);
				((From_table_clauseContext)_localctx).from_table_values_clause = from_table_values_clause();
				 ((From_table_clauseContext)_localctx).res =  ((From_table_clauseContext)_localctx).from_table_values_clause.res; 
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

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public std::string res;
		public Table_nameContext table_name;
		public From_alias_clauseContext from_alias_clause;
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			((From_table_name_clauseContext)_localctx).table_name = table_name();
			setState(1029);
			((From_table_name_clauseContext)_localctx).from_alias_clause = from_alias_clause();
			 ((From_table_name_clauseContext)_localctx).res =  hql_from_table_name(((From_table_name_clauseContext)_localctx).table_name.res, ((From_table_name_clauseContext)_localctx).from_alias_clause.res); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public std::string res;
		public Select_stmtContext select_stmt;
		public From_alias_clauseContext from_alias_clause;
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(T_OPEN_P);
			setState(1033);
			((From_subselect_clauseContext)_localctx).select_stmt = select_stmt();
			setState(1034);
			match(T_CLOSE_P);
			setState(1035);
			((From_subselect_clauseContext)_localctx).from_alias_clause = from_alias_clause();
			 ((From_subselect_clauseContext)_localctx).res =  hql_from_subselect(((From_subselect_clauseContext)_localctx).select_stmt.res, ((From_subselect_clauseContext)_localctx).from_alias_clause.res); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_clauseContext extends ParserRuleContext {
		public std::string res;
		public From_table_clauseContext from_table_clause;
		public From_join_type_clauseContext from_join_type_clause;
		public Bool_exprContext bool_expr;
		public TerminalNode T_COMMA() { return getToken(HiveParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HiveParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_from_join_clause);
		try {
			setState(1048);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				match(T_COMMA);
				setState(1039);
				((From_join_clauseContext)_localctx).from_table_clause = from_table_clause();
				 ((From_join_clauseContext)_localctx).res =  hql_join_expr("FULL", ((From_join_clauseContext)_localctx).from_table_clause.res, "\"\""); 
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				((From_join_clauseContext)_localctx).from_join_type_clause = from_join_type_clause();
				setState(1043);
				((From_join_clauseContext)_localctx).from_table_clause = from_table_clause();
				setState(1044);
				match(T_ON);
				setState(1045);
				((From_join_clauseContext)_localctx).bool_expr = bool_expr(0);
				 ((From_join_clauseContext)_localctx).res =  hql_join_expr(((From_join_clauseContext)_localctx).from_join_type_clause.res, ((From_join_clauseContext)_localctx).from_table_clause.res, ((From_join_clauseContext)_localctx).bool_expr.res); 
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

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public std::string res;
		public Token typ;
		public TerminalNode T_JOIN() { return getToken(HiveParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(HiveParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(HiveParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(HiveParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(HiveParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(HiveParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_from_join_type_clause);
		int _la;
		try {
			setState(1061);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1050);
					match(T_INNER);
					}
				}

				setState(1053);
				match(T_JOIN);
				 ((From_join_type_clauseContext)_localctx).res =  "INNER"; 
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				((From_join_type_clauseContext)_localctx).typ = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
					((From_join_type_clauseContext)_localctx).typ = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1056);
					match(T_OUTER);
					}
				}

				setState(1059);
				match(T_JOIN);
				 ((From_join_type_clauseContext)_localctx).res =  (((From_join_type_clauseContext)_localctx).typ!=null?((From_join_type_clauseContext)_localctx).typ.getText():null); 
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

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public std::string res;
		public From_table_values_row_listContext from_table_values_row_list;
		public From_alias_clauseContext from_alias_clause;
		public TerminalNode T_TABLE() { return getToken(HiveParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(HiveParser.T_VALUES, 0); }
		public From_table_values_row_listContext from_table_values_row_list() {
			return getRuleContext(From_table_values_row_listContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_from_table_values_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			match(T_TABLE);
			setState(1064);
			match(T_OPEN_P);
			setState(1065);
			match(T_VALUES);
			setState(1066);
			((From_table_values_clauseContext)_localctx).from_table_values_row_list = from_table_values_row_list();
			setState(1067);
			match(T_CLOSE_P);
			setState(1068);
			((From_table_values_clauseContext)_localctx).from_alias_clause = from_alias_clause();
			 ((From_table_values_clauseContext)_localctx).res =  hql_from_table_values_clause(((From_table_values_clauseContext)_localctx).from_table_values_row_list.res, ((From_table_values_clauseContext)_localctx).from_alias_clause.res); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_row_listContext extends ParserRuleContext {
		public std::string res;
		public From_table_values_rowContext from_table_values_row;
		public From_table_values_row_listContext from_table_values_row_list;
		public From_table_values_rowContext from_table_values_row() {
			return getRuleContext(From_table_values_rowContext.class,0);
		}
		public TerminalNode T_COMMA() { return getToken(HiveParser.T_COMMA, 0); }
		public From_table_values_row_listContext from_table_values_row_list() {
			return getRuleContext(From_table_values_row_listContext.class,0);
		}
		public From_table_values_row_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row_list; }
	}

	public final From_table_values_row_listContext from_table_values_row_list() throws RecognitionException {
		From_table_values_row_listContext _localctx = new From_table_values_row_listContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_from_table_values_row_list);
		try {
			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				((From_table_values_row_listContext)_localctx).from_table_values_row = from_table_values_row();
				 ((From_table_values_row_listContext)_localctx).res =  ((From_table_values_row_listContext)_localctx).from_table_values_row.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				((From_table_values_row_listContext)_localctx).from_table_values_row = from_table_values_row();
				setState(1075);
				match(T_COMMA);
				setState(1076);
				((From_table_values_row_listContext)_localctx).from_table_values_row_list = from_table_values_row_list();
				 ((From_table_values_row_listContext)_localctx).res =  hql_recur_list(((From_table_values_row_listContext)_localctx).from_table_values_row.res, ((From_table_values_row_listContext)_localctx).from_table_values_row_list.res); 
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

	public static class From_table_values_rowContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public Expr_listContext expr_list;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_from_table_values_row);
		try {
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				((From_table_values_rowContext)_localctx).expr = expr(0);
				 ((From_table_values_rowContext)_localctx).res =  ((From_table_values_rowContext)_localctx).expr.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(T_OPEN_P);
				setState(1085);
				((From_table_values_rowContext)_localctx).expr_list = expr_list();
				setState(1086);
				match(T_CLOSE_P);
				 ((From_table_values_rowContext)_localctx).res =  ((From_table_values_rowContext)_localctx).expr_list.res; 
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

	public static class From_alias_clauseContext extends ParserRuleContext {
		public std::string res;
		public IdentContext ident;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HiveParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HiveParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_from_alias_clause);
		int _la;
		try {
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((From_alias_clauseContext)_localctx).res =  "DEFAULT"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(1092);
					match(T_AS);
					}
					break;
				}
				setState(1095);
				((From_alias_clauseContext)_localctx).ident = ident();
				setState(1106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(1096);
					match(T_OPEN_P);
					setState(1097);
					match(L_ID);
					setState(1102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(1098);
						match(T_COMMA);
						setState(1099);
						match(L_ID);
						}
						}
						setState(1104);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1105);
					match(T_CLOSE_P);
					}
					break;
				}
				 ((From_alias_clauseContext)_localctx).res =  (((From_alias_clauseContext)_localctx).ident!=null?_input.getText(((From_alias_clauseContext)_localctx).ident.start,((From_alias_clauseContext)_localctx).ident.stop):null); 
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

	public static class Table_nameContext extends ParserRuleContext {
		public std::string res;
		public IdentContext ident;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			((Table_nameContext)_localctx).ident = ident();
			 ((Table_nameContext)_localctx).res =  (((Table_nameContext)_localctx).ident!=null?_input.getText(((Table_nameContext)_localctx).ident.start,((Table_nameContext)_localctx).ident.stop):null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public std::string res;
		public Bool_exprContext bool_expr;
		public TerminalNode T_WHERE() { return getToken(HiveParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_where_clause);
		try {
			setState(1120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
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
			case T_DATA:
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
			case T_HIVE:
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
			case T_NULL:
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
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
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
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
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
			case T_SUBSTR:
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
			case T_UNION:
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
			case T_ADD:
			case T_OPEN_P:
			case T_CLOSE_P:
			case T_SEMICOLON:
			case T_SUB:
			case L_S_STRING:
			case L_D_STRING:
			case L_ID:
			case L_INT:
			case L_DEC:
				enterOuterAlt(_localctx, 1);
				{
				 ((Where_clauseContext)_localctx).res =  "null"; 
				}
				break;
			case T_WHERE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				match(T_WHERE);
				setState(1117);
				((Where_clauseContext)_localctx).bool_expr = bool_expr(0);
				 ((Where_clauseContext)_localctx).res =  ((Where_clauseContext)_localctx).bool_expr.res; 
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

	public static class Group_by_clauseContext extends ParserRuleContext {
		public std::string res;
		public Expr_listContext expr_list;
		public TerminalNode T_GROUP() { return getToken(HiveParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_group_by_clause);
		try {
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Group_by_clauseContext)_localctx).res =  "null"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				match(T_GROUP);
				setState(1124);
				match(T_BY);
				setState(1125);
				((Group_by_clauseContext)_localctx).expr_list = expr_list();
				 ((Group_by_clauseContext)_localctx).res =  ((Group_by_clauseContext)_localctx).expr_list.res; 
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

	public static class Expr_listContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public Expr_listContext expr_list;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COMMA() { return getToken(HiveParser.T_COMMA, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expr_list);
		try {
			setState(1138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				((Expr_listContext)_localctx).expr = expr(0);
				 ((Expr_listContext)_localctx).res =  ((Expr_listContext)_localctx).expr.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1133);
				((Expr_listContext)_localctx).expr = expr(0);
				setState(1134);
				match(T_COMMA);
				setState(1135);
				((Expr_listContext)_localctx).expr_list = expr_list();
				 ((Expr_listContext)_localctx).res =  hql_recur_list(((Expr_listContext)_localctx).expr.res, ((Expr_listContext)_localctx).expr_list.res); 
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

	public static class Having_clauseContext extends ParserRuleContext {
		public std::string res;
		public Bool_exprContext bool_expr;
		public TerminalNode T_HAVING() { return getToken(HiveParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			match(T_HAVING);
			setState(1141);
			((Having_clauseContext)_localctx).bool_expr = bool_expr(0);
			 ((Having_clauseContext)_localctx).res =  ((Having_clauseContext)_localctx).bool_expr.res; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualify_clauseContext extends ParserRuleContext {
		public std::string res;
		public Bool_exprContext bool_expr;
		public TerminalNode T_QUALIFY() { return getToken(HiveParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(T_QUALIFY);
			setState(1145);
			((Qualify_clauseContext)_localctx).bool_expr = bool_expr(0);
			 ((Qualify_clauseContext)_localctx).res =  ((Qualify_clauseContext)_localctx).bool_expr.res; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_optionsContext extends ParserRuleContext {
		public std::string res;
		public Select_options_itemContext select_options_item;
		public Select_optionsContext select_options;
		public Select_options_itemContext select_options_item() {
			return getRuleContext(Select_options_itemContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_select_options);
		try {
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Select_optionsContext)_localctx).res =  "null"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149);
				((Select_optionsContext)_localctx).select_options_item = select_options_item();
				 ((Select_optionsContext)_localctx).res =  ((Select_optionsContext)_localctx).select_options_item.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152);
				((Select_optionsContext)_localctx).select_options_item = select_options_item();
				setState(1153);
				((Select_optionsContext)_localctx).select_options = select_options();
				 ((Select_optionsContext)_localctx).res =  hql_recur_list(((Select_optionsContext)_localctx).select_options_item.res, ((Select_optionsContext)_localctx).select_options.res); 
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

	public static class Select_options_itemContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public Token expr_t;
		public TerminalNode T_LIMIT() { return getToken(HiveParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(HiveParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(HiveParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(HiveParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(HiveParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(HiveParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HiveParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(HiveParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(HiveParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HiveParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HiveParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(HiveParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_select_options_item);
		int _la;
		try {
			setState(1172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1158);
				match(T_LIMIT);
				setState(1159);
				((Select_options_itemContext)_localctx).expr = expr(0);
				 ((Select_options_itemContext)_localctx).res =  hql_select_option_item("LIMIT", ((Select_options_itemContext)_localctx).expr.res); 
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				match(T_WITH);
				setState(1163);
				((Select_options_itemContext)_localctx).expr_t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 242)) & ~0x3f) == 0 && ((1L << (_la - 242)) & ((1L << (T_RR - 242)) | (1L << (T_RS - 242)) | (1L << (T_UR - 242)))) != 0)) ) {
					((Select_options_itemContext)_localctx).expr_t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_USE) {
					{
					setState(1164);
					match(T_USE);
					setState(1165);
					match(T_AND);
					setState(1166);
					match(T_KEEP);
					setState(1167);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1168);
					match(T_LOCKS);
					}
				}

				 ((Select_options_itemContext)_localctx).res =  hql_select_option_item("WITH", (((Select_options_itemContext)_localctx).expr_t!=null?((Select_options_itemContext)_localctx).expr_t.getText():null)); 
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public std::string res;
		public Table_nameContext table_name;
		public Delete_aliasContext delete_alias;
		public Where_clauseContext where_clause;
		public TerminalNode T_DELETE() { return getToken(HiveParser.T_DELETE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Delete_aliasContext delete_alias() {
			return getRuleContext(Delete_aliasContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_FROM() { return getToken(HiveParser.T_FROM, 0); }
		public TerminalNode T_ALL() { return getToken(HiveParser.T_ALL, 0); }
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_delete_stmt);
		int _la;
		try {
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				match(T_DELETE);
				setState(1176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1175);
					match(T_FROM);
					}
					break;
				}
				setState(1178);
				((Delete_stmtContext)_localctx).table_name = table_name();
				setState(1179);
				((Delete_stmtContext)_localctx).delete_alias = delete_alias();
				setState(1180);
				((Delete_stmtContext)_localctx).where_clause = where_clause();
				 ((Delete_stmtContext)_localctx).res =  hql_delete_stmt(((Delete_stmtContext)_localctx).table_name.res, ((Delete_stmtContext)_localctx).delete_alias.res, ((Delete_stmtContext)_localctx).where_clause.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1183);
				match(T_DELETE);
				setState(1185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1184);
					match(T_FROM);
					}
					break;
				}
				setState(1187);
				((Delete_stmtContext)_localctx).table_name = table_name();
				setState(1188);
				((Delete_stmtContext)_localctx).delete_alias = delete_alias();
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1189);
					match(T_ALL);
					}
				}

				 ((Delete_stmtContext)_localctx).res =  hql_delete_stmt(((Delete_stmtContext)_localctx).table_name.res, ((Delete_stmtContext)_localctx).delete_alias.res, ""); 
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

	public static class Delete_aliasContext extends ParserRuleContext {
		public std::string res;
		public IdentContext ident;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public Delete_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_alias; }
	}

	public final Delete_aliasContext delete_alias() throws RecognitionException {
		Delete_aliasContext _localctx = new Delete_aliasContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_delete_alias);
		try {
			setState(1203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Delete_aliasContext)_localctx).res =  "DEFAULT"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1197);
					match(T_AS);
					}
					break;
				}
				setState(1200);
				((Delete_aliasContext)_localctx).ident = ident();
				 ((Delete_aliasContext)_localctx).res =  (((Delete_aliasContext)_localctx).ident!=null?_input.getText(((Delete_aliasContext)_localctx).ident.start,((Delete_aliasContext)_localctx).ident.stop):null); 
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

	public static class Describe_stmtContext extends ParserRuleContext {
		public std::string res;
		public Table_nameContext table_name;
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_DESCRIBE() { return getToken(HiveParser.T_DESCRIBE, 0); }
		public TerminalNode T_DESC() { return getToken(HiveParser.T_DESC, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveParser.T_TABLE, 0); }
		public Describe_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe_stmt; }
	}

	public final Describe_stmtContext describe_stmt() throws RecognitionException {
		Describe_stmtContext _localctx = new Describe_stmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_describe_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			_la = _input.LA(1);
			if ( !(_la==T_DESC || _la==T_DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1206);
				match(T_TABLE);
				}
				break;
			}
			setState(1209);
			((Describe_stmtContext)_localctx).table_name = table_name();
			 ((Describe_stmtContext)_localctx).res =  hql_desc_table_stmt(((Describe_stmtContext)_localctx).table_name.res); 
			}
		}
		catch (RecognitionException re) {
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
		public std::string res;
		public Bool_exprContext left_expr;
		public Bool_exprContext bool_expr;
		public Bool_expr_atomContext bool_expr_atom;
		public Bool_expr_logical_operatorContext bool_expr_logical_operator;
		public Bool_exprContext right_expr;
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1213);
				match(T_OPEN_P);
				setState(1214);
				((Bool_exprContext)_localctx).bool_expr = bool_expr(0);
				setState(1215);
				match(T_CLOSE_P);
				 ((Bool_exprContext)_localctx).res =  ((Bool_exprContext)_localctx).bool_expr.res; 
				}
				break;
			case 2:
				{
				setState(1218);
				match(T_NOT);
				setState(1219);
				match(T_OPEN_P);
				setState(1220);
				((Bool_exprContext)_localctx).bool_expr = bool_expr(0);
				setState(1221);
				match(T_CLOSE_P);
				 ((Bool_exprContext)_localctx).res =  hql_bool_not_expr(((Bool_exprContext)_localctx).bool_expr.res); 
				}
				break;
			case 3:
				{
				setState(1224);
				((Bool_exprContext)_localctx).bool_expr_atom = bool_expr_atom();
				 ((Bool_exprContext)_localctx).res =  ((Bool_exprContext)_localctx).bool_expr_atom.res; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					_localctx.left_expr = _prevctx;
					_localctx.left_expr = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(1229);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1230);
					((Bool_exprContext)_localctx).bool_expr_logical_operator = bool_expr_logical_operator();
					setState(1231);
					((Bool_exprContext)_localctx).right_expr = ((Bool_exprContext)_localctx).bool_expr = bool_expr(3);
					 ((Bool_exprContext)_localctx).res =  hql_bool_expr_binary(((Bool_exprContext)_localctx).bool_expr_logical_operator.res, ((Bool_exprContext)_localctx).left_expr.res , ((Bool_exprContext)_localctx).right_expr.res); 
					}
					} 
				}
				setState(1238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public std::string res;
		public Bool_expr_unaryContext bool_expr_unary;
		public Bool_expr_binaryContext bool_expr_binary;
		public ExprContext expr;
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_bool_expr_atom);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1239);
				((Bool_expr_atomContext)_localctx).bool_expr_unary = bool_expr_unary();
				 ((Bool_expr_atomContext)_localctx).res =  ((Bool_expr_atomContext)_localctx).bool_expr_unary.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
				((Bool_expr_atomContext)_localctx).bool_expr_binary = bool_expr_binary();
				 ((Bool_expr_atomContext)_localctx).res =  ((Bool_expr_atomContext)_localctx).bool_expr_binary.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1245);
				((Bool_expr_atomContext)_localctx).expr = expr(0);
				 ((Bool_expr_atomContext)_localctx).res =  ((Bool_expr_atomContext)_localctx).expr.res; 
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

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public ExprContext v_expr;
		public ExprContext left_expr;
		public ExprContext right_expr;
		public Select_stmtContext select_stmt;
		public Bool_expr_single_inContext bool_expr_single_in;
		public Bool_expr_multi_inContext bool_expr_multi_in;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(HiveParser.T_IS, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public TerminalNode T_NULL() { return getToken(HiveParser.T_NULL, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HiveParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(HiveParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_bool_expr_unary);
		try {
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1250);
				((Bool_expr_unaryContext)_localctx).expr = expr(0);
				setState(1251);
				match(T_IS);
				setState(1252);
				match(T_NOT);
				setState(1253);
				match(T_NULL);
				 ((Bool_expr_unaryContext)_localctx).res =  hql_is_null("IS_NOT_NULL", ((Bool_expr_unaryContext)_localctx).expr.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1256);
				((Bool_expr_unaryContext)_localctx).expr = expr(0);
				setState(1257);
				match(T_IS);
				setState(1258);
				match(T_NULL);
				 ((Bool_expr_unaryContext)_localctx).res =  hql_is_null("IS_NULL", ((Bool_expr_unaryContext)_localctx).expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1261);
				((Bool_expr_unaryContext)_localctx).v_expr = expr(0);
				setState(1262);
				match(T_BETWEEN);
				setState(1263);
				((Bool_expr_unaryContext)_localctx).left_expr = expr(0);
				setState(1264);
				match(T_AND);
				setState(1265);
				((Bool_expr_unaryContext)_localctx).right_expr = expr(0);
				 ((Bool_expr_unaryContext)_localctx).res =  hql_between(((Bool_expr_unaryContext)_localctx).v_expr.res, ((Bool_expr_unaryContext)_localctx).left_expr.res, ((Bool_expr_unaryContext)_localctx).right_expr.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1268);
				match(T_NOT);
				setState(1269);
				match(T_EXISTS);
				setState(1270);
				match(T_OPEN_P);
				setState(1271);
				((Bool_expr_unaryContext)_localctx).select_stmt = select_stmt();
				setState(1272);
				match(T_CLOSE_P);
				 ((Bool_expr_unaryContext)_localctx).res =  hql_bool_exists("NOT_EXISTS", ((Bool_expr_unaryContext)_localctx).select_stmt.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1275);
				match(T_EXISTS);
				setState(1276);
				match(T_OPEN_P);
				setState(1277);
				((Bool_expr_unaryContext)_localctx).select_stmt = select_stmt();
				setState(1278);
				match(T_CLOSE_P);
				 ((Bool_expr_unaryContext)_localctx).res =  hql_bool_exists("EXISTS", ((Bool_expr_unaryContext)_localctx).select_stmt.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1281);
				((Bool_expr_unaryContext)_localctx).bool_expr_single_in = bool_expr_single_in();
				 ((Bool_expr_unaryContext)_localctx).res =  ((Bool_expr_unaryContext)_localctx).bool_expr_single_in.res; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1284);
				((Bool_expr_unaryContext)_localctx).bool_expr_multi_in = bool_expr_multi_in();
				 ((Bool_expr_unaryContext)_localctx).res =  ((Bool_expr_unaryContext)_localctx).bool_expr_multi_in.res; 
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

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public Select_stmtContext select_stmt;
		public Bool_mult_exprContext bool_mult_expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(HiveParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Bool_mult_exprContext bool_mult_expr() {
			return getRuleContext(Bool_mult_exprContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_bool_expr_single_in);
		try {
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				((Bool_expr_single_inContext)_localctx).expr = expr(0);
				setState(1290);
				match(T_IN);
				setState(1291);
				match(T_OPEN_P);
				setState(1292);
				((Bool_expr_single_inContext)_localctx).select_stmt = select_stmt();
				setState(1293);
				match(T_CLOSE_P);
				 ((Bool_expr_single_inContext)_localctx).res =  hql_bool_expr_single_in(((Bool_expr_single_inContext)_localctx).expr.res, "IN", ((Bool_expr_single_inContext)_localctx).select_stmt.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				((Bool_expr_single_inContext)_localctx).expr = expr(0);
				setState(1297);
				match(T_IN);
				setState(1298);
				match(T_OPEN_P);
				setState(1299);
				((Bool_expr_single_inContext)_localctx).bool_mult_expr = bool_mult_expr();
				setState(1300);
				match(T_CLOSE_P);
				 ((Bool_expr_single_inContext)_localctx).res =  hql_bool_expr_single_in(((Bool_expr_single_inContext)_localctx).expr.res, "IN", ((Bool_expr_single_inContext)_localctx).bool_mult_expr.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1303);
				((Bool_expr_single_inContext)_localctx).expr = expr(0);
				setState(1304);
				match(T_NOT);
				setState(1305);
				match(T_IN);
				setState(1306);
				match(T_OPEN_P);
				setState(1307);
				((Bool_expr_single_inContext)_localctx).select_stmt = select_stmt();
				setState(1308);
				match(T_CLOSE_P);
				 ((Bool_expr_single_inContext)_localctx).res =  hql_bool_expr_single_in(((Bool_expr_single_inContext)_localctx).expr.res, "NOT_IN", ((Bool_expr_single_inContext)_localctx).select_stmt.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1311);
				((Bool_expr_single_inContext)_localctx).expr = expr(0);
				setState(1312);
				match(T_NOT);
				setState(1313);
				match(T_IN);
				setState(1314);
				match(T_OPEN_P);
				setState(1315);
				((Bool_expr_single_inContext)_localctx).bool_mult_expr = bool_mult_expr();
				setState(1316);
				match(T_CLOSE_P);
				 ((Bool_expr_single_inContext)_localctx).res =  hql_bool_expr_single_in(((Bool_expr_single_inContext)_localctx).expr.res, "NOT_IN", ((Bool_expr_single_inContext)_localctx).bool_mult_expr.res); 
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

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public std::string res;
		public Bool_mult_exprContext bool_mult_expr;
		public Select_stmtContext select_stmt;
		public List<TerminalNode> T_OPEN_P() { return getTokens(HiveParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HiveParser.T_OPEN_P, i);
		}
		public Bool_mult_exprContext bool_mult_expr() {
			return getRuleContext(Bool_mult_exprContext.class,0);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HiveParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HiveParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(HiveParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_bool_expr_multi_in);
		try {
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321);
				match(T_OPEN_P);
				setState(1322);
				((Bool_expr_multi_inContext)_localctx).bool_mult_expr = bool_mult_expr();
				setState(1323);
				match(T_CLOSE_P);
				setState(1324);
				match(T_IN);
				setState(1325);
				match(T_OPEN_P);
				setState(1326);
				((Bool_expr_multi_inContext)_localctx).select_stmt = select_stmt();
				setState(1327);
				match(T_CLOSE_P);
				 ((Bool_expr_multi_inContext)_localctx).res =  hql_bool_expr_multi_in(((Bool_expr_multi_inContext)_localctx).bool_mult_expr.res, "IN", ((Bool_expr_multi_inContext)_localctx).select_stmt.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				match(T_OPEN_P);
				setState(1331);
				((Bool_expr_multi_inContext)_localctx).bool_mult_expr = bool_mult_expr();
				setState(1332);
				match(T_CLOSE_P);
				setState(1333);
				match(T_NOT);
				setState(1334);
				match(T_IN);
				setState(1335);
				match(T_OPEN_P);
				setState(1336);
				((Bool_expr_multi_inContext)_localctx).select_stmt = select_stmt();
				setState(1337);
				match(T_CLOSE_P);
				 ((Bool_expr_multi_inContext)_localctx).res =  hql_bool_expr_multi_in(((Bool_expr_multi_inContext)_localctx).bool_mult_expr.res, "NOT_IN", ((Bool_expr_multi_inContext)_localctx).select_stmt.res); 
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

	public static class Bool_mult_exprContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public Bool_mult_exprContext bool_mult_expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COMMA() { return getToken(HiveParser.T_COMMA, 0); }
		public Bool_mult_exprContext bool_mult_expr() {
			return getRuleContext(Bool_mult_exprContext.class,0);
		}
		public Bool_mult_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_mult_expr; }
	}

	public final Bool_mult_exprContext bool_mult_expr() throws RecognitionException {
		Bool_mult_exprContext _localctx = new Bool_mult_exprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_bool_mult_expr);
		try {
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				((Bool_mult_exprContext)_localctx).expr = expr(0);
				 ((Bool_mult_exprContext)_localctx).res =  ((Bool_mult_exprContext)_localctx).expr.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
				((Bool_mult_exprContext)_localctx).expr = expr(0);
				setState(1346);
				match(T_COMMA);
				setState(1347);
				((Bool_mult_exprContext)_localctx).bool_mult_expr = bool_mult_expr();
				 ((Bool_mult_exprContext)_localctx).res =  hql_recur_list(((Bool_mult_exprContext)_localctx).expr.res, ((Bool_mult_exprContext)_localctx).bool_mult_expr.res); 
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

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public std::string res;
		public ExprContext left_expr;
		public Bool_expr_binary_operatorContext bool_expr_binary_operator;
		public ExprContext right_expr;
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			((Bool_expr_binaryContext)_localctx).left_expr = expr(0);
			setState(1353);
			((Bool_expr_binaryContext)_localctx).bool_expr_binary_operator = bool_expr_binary_operator();
			setState(1354);
			((Bool_expr_binaryContext)_localctx).right_expr = expr(0);
			 ((Bool_expr_binaryContext)_localctx).res =  hql_bool_expr_binary(((Bool_expr_binaryContext)_localctx).bool_expr_binary_operator.res, ((Bool_expr_binaryContext)_localctx).left_expr.res , ((Bool_expr_binaryContext)_localctx).right_expr.res); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public std::string res;
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HiveParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_bool_expr_logical_operator);
		try {
			setState(1361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				match(T_AND);
				 ((Bool_expr_logical_operatorContext)_localctx).res =  "AND"; 
				}
				break;
			case T_OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359);
				match(T_OR);
				 ((Bool_expr_logical_operatorContext)_localctx).res =  "OR"; 
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

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public std::string res;
		public Token op;
		public TerminalNode T_EQUAL() { return getToken(HiveParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(HiveParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(HiveParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(HiveParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(HiveParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HiveParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HiveParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HiveParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(HiveParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(HiveParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(HiveParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(HiveParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(1384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1363);
				match(T_EQUAL);
				 ((Bool_expr_binary_operatorContext)_localctx).res =  "EQUAL"; 
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365);
				match(T_EQUAL2);
				 ((Bool_expr_binary_operatorContext)_localctx).res =  "EQUAL"; 
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1367);
				match(T_NOTEQUAL);
				 ((Bool_expr_binary_operatorContext)_localctx).res =  "NOT_EQUAL"; 
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(1369);
				match(T_NOTEQUAL2);
				 ((Bool_expr_binary_operatorContext)_localctx).res =  "NOT_EQUAL"; 
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1371);
				match(T_LESS);
				 ((Bool_expr_binary_operatorContext)_localctx).res =  "LESS"; 
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1373);
				match(T_LESSEQUAL);
				 ((Bool_expr_binary_operatorContext)_localctx).res =  "LESS_EQUAL"; 
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(1375);
				match(T_GREATER);
				 ((Bool_expr_binary_operatorContext)_localctx).res =  "GREATER"; 
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1377);
				match(T_GREATEREQUAL);
				 ((Bool_expr_binary_operatorContext)_localctx).res =  "GREATER_EQUAL"; 
				}
				break;
			case T_LIKE:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1379);
				((Bool_expr_binary_operatorContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
					((Bool_expr_binary_operatorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 ((Bool_expr_binary_operatorContext)_localctx).res =  (((Bool_expr_binary_operatorContext)_localctx).op!=null?((Bool_expr_binary_operatorContext)_localctx).op.getText():null); 
				}
				break;
			case T_NOT:
				enterOuterAlt(_localctx, 10);
				{
				setState(1381);
				match(T_NOT);
				setState(1382);
				((Bool_expr_binary_operatorContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
					((Bool_expr_binary_operatorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 ((Bool_expr_binary_operatorContext)_localctx).res =  (((Bool_expr_binary_operatorContext)_localctx).op!=null?((Bool_expr_binary_operatorContext)_localctx).op.getText():null); 
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

	public static class ExprContext extends ParserRuleContext {
		public std::string res;
		public ExprContext l;
		public Select_stmtContext select_stmt;
		public ExprContext expr;
		public Expr_atomContext expr_atom;
		public Expr_concatContext expr_concat;
		public Expr_caseContext expr_case;
		public Expr_agg_window_funcContext expr_agg_window_func;
		public Expr_spec_funcContext expr_spec_func;
		public Expr_funcContext expr_func;
		public Token T_MUL;
		public ExprContext r;
		public Token T_DIV;
		public Token T_ADD;
		public Token T_SUB;
		public Interval_itemContext interval_item;
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(HiveParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(HiveParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(HiveParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(HiveParser.T_SUB, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
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
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1387);
				match(T_OPEN_P);
				setState(1388);
				((ExprContext)_localctx).select_stmt = select_stmt();
				setState(1389);
				match(T_CLOSE_P);
				 ((ExprContext)_localctx).res =  hql_subselect_expr(((ExprContext)_localctx).select_stmt.res); 
				}
				break;
			case 2:
				{
				setState(1392);
				match(T_OPEN_P);
				setState(1393);
				((ExprContext)_localctx).expr = expr(0);
				setState(1394);
				match(T_CLOSE_P);
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr.res; 
				}
				break;
			case 3:
				{
				setState(1397);
				((ExprContext)_localctx).expr_atom = expr_atom();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr_atom.res; 
				}
				break;
			case 4:
				{
				setState(1400);
				((ExprContext)_localctx).expr_concat = expr_concat(0);
				 ((ExprContext)_localctx).res =  hql_concat_expr_result(((ExprContext)_localctx).expr_concat.res); 
				}
				break;
			case 5:
				{
				setState(1403);
				((ExprContext)_localctx).expr_case = expr_case();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr_case.res; 
				}
				break;
			case 6:
				{
				setState(1406);
				((ExprContext)_localctx).expr_agg_window_func = expr_agg_window_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr_agg_window_func.res; 
				}
				break;
			case 7:
				{
				setState(1409);
				((ExprContext)_localctx).expr_spec_func = expr_spec_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr_spec_func.res; 
				}
				break;
			case 8:
				{
				setState(1412);
				((ExprContext)_localctx).expr_func = expr_func();
				 ((ExprContext)_localctx).res =  ((ExprContext)_localctx).expr_func.res; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1441);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1417);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1418);
						((ExprContext)_localctx).T_MUL = match(T_MUL);
						setState(1419);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(13);
						 ((ExprContext)_localctx).res =  hql_arithmetic_expr((((ExprContext)_localctx).T_MUL!=null?((ExprContext)_localctx).T_MUL.getText():null), ((ExprContext)_localctx).l.res, ((ExprContext)_localctx).r.res); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1422);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1423);
						((ExprContext)_localctx).T_DIV = match(T_DIV);
						setState(1424);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(12);
						 ((ExprContext)_localctx).res =  hql_arithmetic_expr((((ExprContext)_localctx).T_DIV!=null?((ExprContext)_localctx).T_DIV.getText():null), ((ExprContext)_localctx).l.res, ((ExprContext)_localctx).r.res); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1427);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1428);
						((ExprContext)_localctx).T_ADD = match(T_ADD);
						setState(1429);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(11);
						 ((ExprContext)_localctx).res =  hql_arithmetic_expr((((ExprContext)_localctx).T_ADD!=null?((ExprContext)_localctx).T_ADD.getText():null), ((ExprContext)_localctx).l.res, ((ExprContext)_localctx).r.res); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1432);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1433);
						((ExprContext)_localctx).T_SUB = match(T_SUB);
						setState(1434);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(10);
						 ((ExprContext)_localctx).res =  hql_arithmetic_expr((((ExprContext)_localctx).T_SUB!=null?((ExprContext)_localctx).T_SUB.getText():null), ((ExprContext)_localctx).l.res, ((ExprContext)_localctx).r.res); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1437);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1438);
						((ExprContext)_localctx).interval_item = interval_item();
						 ((ExprContext)_localctx).res =  hql_expr_interval(((ExprContext)_localctx).expr.res, (((ExprContext)_localctx).interval_item!=null?_input.getText(((ExprContext)_localctx).interval_item.start,((ExprContext)_localctx).interval_item.stop):null)); 
						}
						break;
					}
					} 
				}
				setState(1445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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

	public static class Expr_concatContext extends ParserRuleContext {
		public std::string res;
		public Expr_concatContext c;
		public Expr_concat_itemContext a;
		public Expr_concat_itemContext b;
		public Expr_concat_itemContext d;
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public TerminalNode T_PIPE() { return getToken(HiveParser.T_PIPE, 0); }
		public TerminalNode T_CONCAT() { return getToken(HiveParser.T_CONCAT, 0); }
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		return expr_concat(0);
	}

	private Expr_concatContext expr_concat(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, _parentState);
		Expr_concatContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_expr_concat, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1447);
			((Expr_concatContext)_localctx).a = expr_concat_item();
			setState(1448);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1449);
			((Expr_concatContext)_localctx).b = expr_concat_item();
			 ((Expr_concatContext)_localctx).res =  hql_concat_expr(((Expr_concatContext)_localctx).a.res, ((Expr_concatContext)_localctx).b.res); 
			}
			_ctx.stop = _input.LT(-1);
			setState(1459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_concatContext(_parentctx, _parentState);
					_localctx.c = _prevctx;
					_localctx.c = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr_concat);
					setState(1452);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1453);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1454);
					((Expr_concatContext)_localctx).d = expr_concat_item();
					 ((Expr_concatContext)_localctx).res =  hql_concat_expr(((Expr_concatContext)_localctx).c.res, ((Expr_concatContext)_localctx).d.res); 
					}
					} 
				}
				setState(1461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public Expr_caseContext expr_case;
		public Expr_agg_window_funcContext expr_agg_window_func;
		public Expr_spec_funcContext expr_spec_func;
		public Expr_funcContext expr_func;
		public Expr_atomContext expr_atom;
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_expr_concat_item);
		try {
			setState(1482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				match(T_OPEN_P);
				setState(1463);
				((Expr_concat_itemContext)_localctx).expr = expr(0);
				setState(1464);
				match(T_CLOSE_P);
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				((Expr_concat_itemContext)_localctx).expr_case = expr_case();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr_case.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1470);
				((Expr_concat_itemContext)_localctx).expr_agg_window_func = expr_agg_window_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr_agg_window_func.res; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1473);
				((Expr_concat_itemContext)_localctx).expr_spec_func = expr_spec_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr_spec_func.res; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1476);
				((Expr_concat_itemContext)_localctx).expr_func = expr_func();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr_func.res; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1479);
				((Expr_concat_itemContext)_localctx).expr_atom = expr_atom();
				 ((Expr_concat_itemContext)_localctx).res =  ((Expr_concat_itemContext)_localctx).expr_atom.res; 
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

	public static class Expr_caseContext extends ParserRuleContext {
		public std::string res;
		public Expr_case_simpleContext expr_case_simple;
		public Expr_case_searchedContext expr_case_searched;
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_expr_case);
		try {
			setState(1490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1484);
				((Expr_caseContext)_localctx).expr_case_simple = expr_case_simple();
				 ((Expr_caseContext)_localctx).res =  ((Expr_caseContext)_localctx).expr_case_simple.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1487);
				((Expr_caseContext)_localctx).expr_case_searched = expr_case_searched();
				 ((Expr_caseContext)_localctx).res =  ((Expr_caseContext)_localctx).expr_case_searched.res; 
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

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public Expr_case_when_thenContext expr_case_when_then;
		public Expr_case_elseContext expr_case_else;
		public TerminalNode T_CASE() { return getToken(HiveParser.T_CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_case_when_thenContext expr_case_when_then() {
			return getRuleContext(Expr_case_when_thenContext.class,0);
		}
		public Expr_case_elseContext expr_case_else() {
			return getRuleContext(Expr_case_elseContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HiveParser.T_END, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_expr_case_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			match(T_CASE);
			setState(1493);
			((Expr_case_simpleContext)_localctx).expr = expr(0);
			setState(1494);
			((Expr_case_simpleContext)_localctx).expr_case_when_then = expr_case_when_then();
			setState(1495);
			((Expr_case_simpleContext)_localctx).expr_case_else = expr_case_else();
			setState(1496);
			match(T_END);
			 ((Expr_case_simpleContext)_localctx).res =  hql_case_expr(((Expr_case_simpleContext)_localctx).expr.res, ((Expr_case_simpleContext)_localctx).expr_case_when_then.res, ((Expr_case_simpleContext)_localctx).expr_case_else.res); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public std::string res;
		public Expr_case_when_thenContext expr_case_when_then;
		public Expr_case_elseContext expr_case_else;
		public TerminalNode T_CASE() { return getToken(HiveParser.T_CASE, 0); }
		public Expr_case_when_thenContext expr_case_when_then() {
			return getRuleContext(Expr_case_when_thenContext.class,0);
		}
		public Expr_case_elseContext expr_case_else() {
			return getRuleContext(Expr_case_elseContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HiveParser.T_END, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_expr_case_searched);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			match(T_CASE);
			setState(1500);
			((Expr_case_searchedContext)_localctx).expr_case_when_then = expr_case_when_then();
			setState(1501);
			((Expr_case_searchedContext)_localctx).expr_case_else = expr_case_else();
			setState(1502);
			match(T_END);
			 ((Expr_case_searchedContext)_localctx).res =  hql_case_expr("\"\"", ((Expr_case_searchedContext)_localctx).expr_case_when_then.res, ((Expr_case_searchedContext)_localctx).expr_case_else.res); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_when_thenContext extends ParserRuleContext {
		public std::string res;
		public ExprContext a;
		public ExprContext b;
		public ExprContext c;
		public ExprContext d;
		public Expr_case_when_thenContext expr_case_when_then;
		public TerminalNode T_WHEN() { return getToken(HiveParser.T_WHEN, 0); }
		public TerminalNode T_THEN() { return getToken(HiveParser.T_THEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_case_when_thenContext expr_case_when_then() {
			return getRuleContext(Expr_case_when_thenContext.class,0);
		}
		public Expr_case_when_thenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_when_then; }
	}

	public final Expr_case_when_thenContext expr_case_when_then() throws RecognitionException {
		Expr_case_when_thenContext _localctx = new Expr_case_when_thenContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_expr_case_when_then);
		try {
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1505);
				match(T_WHEN);
				setState(1506);
				((Expr_case_when_thenContext)_localctx).a = expr(0);
				setState(1507);
				match(T_THEN);
				setState(1508);
				((Expr_case_when_thenContext)_localctx).b = expr(0);
				}
				 ((Expr_case_when_thenContext)_localctx).res =  hql_case_when_then_list(((Expr_case_when_thenContext)_localctx).a.res, ((Expr_case_when_thenContext)_localctx).b.res, ""); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1512);
				match(T_WHEN);
				setState(1513);
				((Expr_case_when_thenContext)_localctx).c = expr(0);
				setState(1514);
				match(T_THEN);
				setState(1515);
				((Expr_case_when_thenContext)_localctx).d = expr(0);
				}
				setState(1517);
				((Expr_case_when_thenContext)_localctx).expr_case_when_then = expr_case_when_then();
				 ((Expr_case_when_thenContext)_localctx).res =  hql_case_when_then_list(((Expr_case_when_thenContext)_localctx).c.res, ((Expr_case_when_thenContext)_localctx).d.res, ((Expr_case_when_thenContext)_localctx).expr_case_when_then.res); 
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

	public static class Expr_case_elseContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public TerminalNode T_ELSE() { return getToken(HiveParser.T_ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_case_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_else; }
	}

	public final Expr_case_elseContext expr_case_else() throws RecognitionException {
		Expr_case_elseContext _localctx = new Expr_case_elseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_expr_case_else);
		try {
			setState(1528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_END:
				enterOuterAlt(_localctx, 1);
				{
				 ((Expr_case_elseContext)_localctx).res =  "\"\"";
				}
				break;
			case T_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1523);
				match(T_ELSE);
				setState(1524);
				((Expr_case_elseContext)_localctx).expr = expr(0);
				}
				 ((Expr_case_elseContext)_localctx).res =  ((Expr_case_elseContext)_localctx).expr.res;
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

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public std::string res;
		public Expr_func_all_distinctContext expr_func_all_distinct;
		public ExprContext expr;
		public Opt_expr_func_over_clauseContext opt_expr_func_over_clause;
		public Expr_func_over_clauseContext expr_func_over_clause;
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext e3;
		public TerminalNode T_AVG() { return getToken(HiveParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Opt_expr_func_over_clauseContext opt_expr_func_over_clause() {
			return getRuleContext(Opt_expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HiveParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HiveParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HiveParser.T_CUME_DIST, 0); }
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_DENSE_RANK() { return getToken(HiveParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HiveParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(HiveParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(HiveParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HiveParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(HiveParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(HiveParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(HiveParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HiveParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(HiveParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(HiveParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(HiveParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HiveParser.T_VARIANCE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_expr_agg_window_func);
		try {
			setState(1708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1530);
				match(T_AVG);
				setState(1531);
				match(T_OPEN_P);
				setState(1532);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(1533);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(1534);
				match(T_CLOSE_P);
				setState(1535);
				((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause = opt_expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("AVG", ((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.res, ((Expr_agg_window_funcContext)_localctx).expr.res, ((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1538);
				match(T_COUNT);
				setState(1539);
				match(T_OPEN_P);
				setState(1540);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(1541);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(1542);
				match(T_CLOSE_P);
				setState(1543);
				((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause = opt_expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("COUNT",((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.res, ((Expr_agg_window_funcContext)_localctx).expr.res, ((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1546);
				match(T_COUNT);
				setState(1547);
				match(T_OPEN_P);
				setState(1548);
				match(T_MUL);
				setState(1549);
				match(T_CLOSE_P);
				setState(1550);
				((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause = opt_expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("COUNT", "", "\"ALL\"", ((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1553);
				match(T_COUNT_BIG);
				setState(1554);
				match(T_OPEN_P);
				setState(1555);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(1556);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(1557);
				match(T_CLOSE_P);
				setState(1558);
				((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause = opt_expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("COUNT_BIG",((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.res, ((Expr_agg_window_funcContext)_localctx).expr.res, ((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause.res); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1561);
				match(T_COUNT_BIG);
				setState(1562);
				match(T_OPEN_P);
				setState(1563);
				match(T_MUL);
				setState(1564);
				match(T_CLOSE_P);
				setState(1565);
				((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause = opt_expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("COUNT_BIG", "", "\"ALL\"", ((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1568);
				match(T_CUME_DIST);
				setState(1569);
				match(T_OPEN_P);
				setState(1570);
				match(T_CLOSE_P);
				setState(1571);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("CUME_DIST", "", "\"\"", ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1574);
				match(T_DENSE_RANK);
				setState(1575);
				match(T_OPEN_P);
				setState(1576);
				match(T_CLOSE_P);
				setState(1577);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("DENSE_RANK", "", "\"\"", ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1580);
				match(T_FIRST_VALUE);
				setState(1581);
				match(T_OPEN_P);
				setState(1582);
				expr(0);
				setState(1583);
				match(T_CLOSE_P);
				setState(1584);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("FIRST_VALUE", "", "\"\"", ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1587);
				match(T_LAG);
				setState(1588);
				match(T_OPEN_P);
				setState(1589);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(1590);
				match(T_CLOSE_P);
				setState(1591);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_lag_lead_func("LAG", ((Expr_agg_window_funcContext)_localctx).expr.res, ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1594);
				match(T_LAG);
				setState(1595);
				match(T_OPEN_P);
				setState(1596);
				((Expr_agg_window_funcContext)_localctx).e1 = expr(0);
				setState(1597);
				match(T_COMMA);
				setState(1598);
				((Expr_agg_window_funcContext)_localctx).e2 = expr(0);
				setState(1599);
				match(T_CLOSE_P);
				setState(1600);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_lag_lead_func("LAG", aux_return_list(((Expr_agg_window_funcContext)_localctx).e1.res, ((Expr_agg_window_funcContext)_localctx).e2.res), ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1603);
				match(T_LAG);
				setState(1604);
				match(T_OPEN_P);
				setState(1605);
				((Expr_agg_window_funcContext)_localctx).e1 = expr(0);
				setState(1606);
				match(T_COMMA);
				setState(1607);
				((Expr_agg_window_funcContext)_localctx).e2 = expr(0);
				setState(1608);
				match(T_COMMA);
				setState(1609);
				((Expr_agg_window_funcContext)_localctx).e3 = expr(0);
				setState(1610);
				match(T_CLOSE_P);
				setState(1611);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_lag_lead_func("LAG", aux_return_list(((Expr_agg_window_funcContext)_localctx).e1.res, ((Expr_agg_window_funcContext)_localctx).e2.res, ((Expr_agg_window_funcContext)_localctx).e3.res), ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1614);
				match(T_LAST_VALUE);
				setState(1615);
				match(T_OPEN_P);
				setState(1616);
				expr(0);
				setState(1617);
				match(T_CLOSE_P);
				setState(1618);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("LAST_VALUE", "", "\"\"", ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1621);
				match(T_LEAD);
				setState(1622);
				match(T_OPEN_P);
				setState(1623);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(1624);
				match(T_CLOSE_P);
				setState(1625);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_lag_lead_func("LEAD", ((Expr_agg_window_funcContext)_localctx).expr.res, ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1628);
				match(T_LEAD);
				setState(1629);
				match(T_OPEN_P);
				setState(1630);
				((Expr_agg_window_funcContext)_localctx).e1 = expr(0);
				setState(1631);
				match(T_COMMA);
				setState(1632);
				((Expr_agg_window_funcContext)_localctx).e2 = expr(0);
				setState(1633);
				match(T_CLOSE_P);
				setState(1634);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_lag_lead_func("LEAD", aux_return_list(((Expr_agg_window_funcContext)_localctx).e1.res, ((Expr_agg_window_funcContext)_localctx).e2.res), ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1637);
				match(T_LEAD);
				setState(1638);
				match(T_OPEN_P);
				setState(1639);
				((Expr_agg_window_funcContext)_localctx).e1 = expr(0);
				setState(1640);
				match(T_COMMA);
				setState(1641);
				((Expr_agg_window_funcContext)_localctx).e2 = expr(0);
				setState(1642);
				match(T_COMMA);
				setState(1643);
				((Expr_agg_window_funcContext)_localctx).e3 = expr(0);
				setState(1644);
				match(T_CLOSE_P);
				setState(1645);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_lag_lead_func("LEAD", aux_return_list(((Expr_agg_window_funcContext)_localctx).e1.res, ((Expr_agg_window_funcContext)_localctx).e2.res, ((Expr_agg_window_funcContext)_localctx).e3.res), ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1648);
				match(T_MAX);
				setState(1649);
				match(T_OPEN_P);
				setState(1650);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(1651);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(1652);
				match(T_CLOSE_P);
				setState(1653);
				((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause = opt_expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("MAX", ((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.res, ((Expr_agg_window_funcContext)_localctx).expr.res, ((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause.res); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1656);
				match(T_MIN);
				setState(1657);
				match(T_OPEN_P);
				setState(1658);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(1659);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(1660);
				match(T_CLOSE_P);
				setState(1661);
				((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause = opt_expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("MIN", ((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.res, ((Expr_agg_window_funcContext)_localctx).expr.res, ((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause.res); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1664);
				match(T_RANK);
				setState(1665);
				match(T_OPEN_P);
				setState(1666);
				match(T_CLOSE_P);
				setState(1667);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("RANK", "", "\"\"", ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1670);
				match(T_ROW_NUMBER);
				setState(1671);
				match(T_OPEN_P);
				setState(1672);
				match(T_CLOSE_P);
				setState(1673);
				((Expr_agg_window_funcContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("ROW_NUMBER", "", "\"\"", ((Expr_agg_window_funcContext)_localctx).expr_func_over_clause.res); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1676);
				match(T_STDEV);
				setState(1677);
				match(T_OPEN_P);
				setState(1678);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(1679);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(1680);
				match(T_CLOSE_P);
				setState(1681);
				((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause = opt_expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("STDEV", ((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.res, ((Expr_agg_window_funcContext)_localctx).expr.res, ((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause.res); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1684);
				match(T_SUM);
				setState(1685);
				match(T_OPEN_P);
				setState(1686);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(1687);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(1688);
				match(T_CLOSE_P);
				setState(1689);
				((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause = opt_expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("SUM", ((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.res, ((Expr_agg_window_funcContext)_localctx).expr.res, ((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause.res); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1692);
				match(T_VAR);
				setState(1693);
				match(T_OPEN_P);
				setState(1694);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(1695);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(1696);
				match(T_CLOSE_P);
				setState(1697);
				((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause = opt_expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("VAR", ((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.res, ((Expr_agg_window_funcContext)_localctx).expr.res, ((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause.res); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1700);
				match(T_VARIANCE);
				setState(1701);
				match(T_OPEN_P);
				setState(1702);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(1703);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(1704);
				match(T_CLOSE_P);
				setState(1705);
				((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause = opt_expr_func_over_clause();
				 ((Expr_agg_window_funcContext)_localctx).res =  hql_agg_window_func("VARIANCE", ((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.res, ((Expr_agg_window_funcContext)_localctx).expr.res, ((Expr_agg_window_funcContext)_localctx).opt_expr_func_over_clause.res); 
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

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public std::string res;
		public TerminalNode T_ALL() { return getToken(HiveParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HiveParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_expr_func_all_distinct);
		try {
			setState(1715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Expr_func_all_distinctContext)_localctx).res =  "ALL"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				match(T_ALL);
				 ((Expr_func_all_distinctContext)_localctx).res =  "ALL"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1713);
				match(T_DISTINCT);
				 ((Expr_func_all_distinctContext)_localctx).res =  "DISTINCT"; 
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

	public static class Opt_expr_func_over_clauseContext extends ParserRuleContext {
		public std::string res;
		public Expr_func_over_clauseContext expr_func_over_clause;
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public Opt_expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_expr_func_over_clause; }
	}

	public final Opt_expr_func_over_clauseContext opt_expr_func_over_clause() throws RecognitionException {
		Opt_expr_func_over_clauseContext _localctx = new Opt_expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_opt_expr_func_over_clause);
		try {
			setState(1721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Opt_expr_func_over_clauseContext)_localctx).res =  ""; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1718);
				((Opt_expr_func_over_clauseContext)_localctx).expr_func_over_clause = expr_func_over_clause();
				 ((Opt_expr_func_over_clauseContext)_localctx).res =  ((Opt_expr_func_over_clauseContext)_localctx).expr_func_over_clause.res; 
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

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public std::string res;
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause;
		public Order_by_clauseContext order_by_clause;
		public TerminalNode T_OVER() { return getToken(HiveParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_expr_func_over_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(T_OVER);
			setState(1724);
			match(T_OPEN_P);
			setState(1725);
			((Expr_func_over_clauseContext)_localctx).expr_func_partition_by_clause = expr_func_partition_by_clause();
			setState(1726);
			((Expr_func_over_clauseContext)_localctx).order_by_clause = order_by_clause();
			setState(1727);
			match(T_CLOSE_P);
			 ((Expr_func_over_clauseContext)_localctx).res =  hql_over_clause(((Expr_func_over_clauseContext)_localctx).expr_func_partition_by_clause.res, ((Expr_func_over_clauseContext)_localctx).order_by_clause.res); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause;
		public TerminalNode T_PARTITION() { return getToken(HiveParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COMMA() { return getToken(HiveParser.T_COMMA, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_expr_func_partition_by_clause);
		try {
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Expr_func_partition_by_clauseContext)_localctx).res =  ""; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1731);
				match(T_PARTITION);
				setState(1732);
				match(T_BY);
				setState(1733);
				((Expr_func_partition_by_clauseContext)_localctx).expr = expr(0);
				 ((Expr_func_partition_by_clauseContext)_localctx).res =  hql_partition_by_list(((Expr_func_partition_by_clauseContext)_localctx).expr.res, ""); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1736);
				((Expr_func_partition_by_clauseContext)_localctx).expr = expr(0);
				setState(1737);
				match(T_COMMA);
				setState(1738);
				((Expr_func_partition_by_clauseContext)_localctx).expr_func_partition_by_clause = expr_func_partition_by_clause();
				 ((Expr_func_partition_by_clauseContext)_localctx).res =  hql_partition_by_list(((Expr_func_partition_by_clauseContext)_localctx).expr.res, ((Expr_func_partition_by_clauseContext)_localctx).expr_func_partition_by_clause.res); 
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

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public DtypeContext dtype;
		public Dtype_lenContext dtype_len;
		public ExprContext exp;
		public ExprContext from_expr;
		public ExprContext for_expr;
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HiveParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(HiveParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public TerminalNode T_COUNT() { return getToken(HiveParser.T_COUNT, 0); }
		public Opt_expr_func_over_clauseContext opt_expr_func_over_clause() {
			return getRuleContext(Opt_expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_CURRENT_DATE() { return getToken(HiveParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(HiveParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(HiveParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HiveParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HiveParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HiveParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(HiveParser.T_USER, 0); }
		public TerminalNode T_TRIM() { return getToken(HiveParser.T_TRIM, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveParser.T_COMMA, i);
		}
		public TerminalNode T_SUBSTR() { return getToken(HiveParser.T_SUBSTR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HiveParser.T_SUBSTRING, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HiveParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_expr_spec_func);
		int _la;
		try {
			setState(1828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1743);
				match(T_ACTIVITY_COUNT);
				 ((Expr_spec_funcContext)_localctx).res =  hql_simple_spec_func("ACTIVITY_COUNT"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1745);
				match(T_CAST);
				setState(1746);
				match(T_OPEN_P);
				setState(1747);
				((Expr_spec_funcContext)_localctx).expr = expr(0);
				setState(1748);
				match(T_AS);
				setState(1749);
				((Expr_spec_funcContext)_localctx).dtype = dtype();
				setState(1750);
				((Expr_spec_funcContext)_localctx).dtype_len = dtype_len();
				setState(1751);
				match(T_CLOSE_P);
				 ((Expr_spec_funcContext)_localctx).res =  hql_cast_func(((Expr_spec_funcContext)_localctx).expr.res, hql_dtype(((Expr_spec_funcContext)_localctx).dtype.res, ((Expr_spec_funcContext)_localctx).dtype_len.res)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1754);
				match(T_COUNT);
				setState(1755);
				match(T_OPEN_P);
				setState(1756);
				((Expr_spec_funcContext)_localctx).expr = expr(0);
				setState(1757);
				match(T_CLOSE_P);
				 ((Expr_spec_funcContext)_localctx).res =  hql_agg_window_func("COUNT","", ((Expr_spec_funcContext)_localctx).expr.res, ""); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1760);
				match(T_COUNT);
				setState(1761);
				match(T_OPEN_P);
				setState(1762);
				match(T_MUL);
				setState(1763);
				match(T_CLOSE_P);
				setState(1764);
				opt_expr_func_over_clause();
				 ((Expr_spec_funcContext)_localctx).res =  hql_agg_window_func("COUNT", "", "\"ALL\"", ""); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1767);
				match(T_CURRENT_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1768);
				match(T_CURRENT);
				setState(1769);
				match(T_DATE);
				 ((Expr_spec_funcContext)_localctx).res =  hql_simple_spec_func("CURRENT_DATE"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1774);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(1771);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(1772);
					match(T_CURRENT);
					setState(1773);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				 ((Expr_spec_funcContext)_localctx).res =  hql_current_timestamp(""); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1780);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(1777);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(1778);
					match(T_CURRENT);
					setState(1779);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1782);
				match(T_OPEN_P);
				setState(1783);
				match(T_CLOSE_P);
				 ((Expr_spec_funcContext)_localctx).res =  hql_current_timestamp(""); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1788);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(1785);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(1786);
					match(T_CURRENT);
					setState(1787);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(1790);
				match(T_OPEN_P);
				setState(1791);
				((Expr_spec_funcContext)_localctx).expr = expr(0);
				setState(1792);
				match(T_CLOSE_P);
				}
				 ((Expr_spec_funcContext)_localctx).res =  hql_current_timestamp(((Expr_spec_funcContext)_localctx).expr.res); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1796);
				match(T_CURRENT_USER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1797);
				match(T_CURRENT);
				setState(1798);
				match(T_USER);
				 ((Expr_spec_funcContext)_localctx).res =  hql_simple_spec_func("CURRENT_USER"); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1800);
				match(T_TRIM);
				setState(1801);
				match(T_OPEN_P);
				setState(1802);
				((Expr_spec_funcContext)_localctx).expr = expr(0);
				setState(1803);
				match(T_CLOSE_P);
				 ((Expr_spec_funcContext)_localctx).res =  hql_trim_func(((Expr_spec_funcContext)_localctx).expr.res); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1806);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1807);
				match(T_OPEN_P);
				setState(1808);
				((Expr_spec_funcContext)_localctx).exp = expr(0);
				setState(1809);
				match(T_COMMA);
				setState(1810);
				((Expr_spec_funcContext)_localctx).from_expr = expr(0);
				setState(1811);
				match(T_CLOSE_P);
				 ((Expr_spec_funcContext)_localctx).res =  hql_substr_func(((Expr_spec_funcContext)_localctx).exp.res, ((Expr_spec_funcContext)_localctx).from_expr.res, ""); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1814);
				_la = _input.LA(1);
				if ( !(_la==T_SUBSTR || _la==T_SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1815);
				match(T_OPEN_P);
				setState(1816);
				((Expr_spec_funcContext)_localctx).exp = expr(0);
				setState(1817);
				match(T_COMMA);
				setState(1818);
				((Expr_spec_funcContext)_localctx).from_expr = expr(0);
				setState(1819);
				match(T_COMMA);
				setState(1820);
				((Expr_spec_funcContext)_localctx).for_expr = expr(0);
				setState(1821);
				match(T_CLOSE_P);
				 ((Expr_spec_funcContext)_localctx).res =  hql_substr_func(((Expr_spec_funcContext)_localctx).exp.res, ((Expr_spec_funcContext)_localctx).from_expr.res, ((Expr_spec_funcContext)_localctx).for_expr.res); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1824);
				match(T_SYSDATE);
				 ((Expr_spec_funcContext)_localctx).res =  hql_simple_spec_func("SYSDATE"); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1826);
				match(T_USER);
				 ((Expr_spec_funcContext)_localctx).res =  hql_simple_spec_func("USER"); 
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

	public static class Expr_funcContext extends ParserRuleContext {
		public std::string res;
		public IdentContext ident;
		public Expr_func_paramsContext expr_func_params;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveParser.T_OPEN_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveParser.T_CLOSE_P, 0); }
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			((Expr_funcContext)_localctx).ident = ident();
			setState(1831);
			match(T_OPEN_P);
			setState(1832);
			((Expr_funcContext)_localctx).expr_func_params = expr_func_params();
			setState(1833);
			match(T_CLOSE_P);
			 ((Expr_funcContext)_localctx).res =  hql_generic_func((((Expr_funcContext)_localctx).ident!=null?_input.getText(((Expr_funcContext)_localctx).ident.start,((Expr_funcContext)_localctx).ident.stop):null), ((Expr_funcContext)_localctx).expr_func_params.res); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public std::string res;
		public Func_paramContext func_param;
		public Expr_func_paramsContext expr_func_params;
		public Func_paramContext func_param() {
			return getRuleContext(Func_paramContext.class,0);
		}
		public TerminalNode T_COMMA() { return getToken(HiveParser.T_COMMA, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_expr_func_params);
		try {
			setState(1845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1837);
				((Expr_func_paramsContext)_localctx).func_param = func_param();
				 ((Expr_func_paramsContext)_localctx).res =  ((Expr_func_paramsContext)_localctx).func_param.res; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1840);
				((Expr_func_paramsContext)_localctx).func_param = func_param();
				setState(1841);
				match(T_COMMA);
				setState(1842);
				((Expr_func_paramsContext)_localctx).expr_func_params = expr_func_params();
				 ((Expr_func_paramsContext)_localctx).res =  hql_recur_list(((Expr_func_paramsContext)_localctx).func_param.res, ((Expr_func_paramsContext)_localctx).expr_func_params.res); 
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

	public static class Func_paramContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_func_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			((Func_paramContext)_localctx).expr = expr(0);
			 ((Func_paramContext)_localctx).res =  ((Func_paramContext)_localctx).expr.res; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public std::string res;
		public ExprContext expr;
		public Order_by_asc_descContext order_by_asc_desc;
		public Order_by_clauseContext order_by_clause;
		public TerminalNode T_ORDER() { return getToken(HiveParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Order_by_asc_descContext order_by_asc_desc() {
			return getRuleContext(Order_by_asc_descContext.class,0);
		}
		public TerminalNode T_COMMA() { return getToken(HiveParser.T_COMMA, 0); }
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_order_by_clause);
		try {
			setState(1863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Order_by_clauseContext)_localctx).res =  "null"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1851);
				match(T_ORDER);
				setState(1852);
				match(T_BY);
				setState(1853);
				((Order_by_clauseContext)_localctx).expr = expr(0);
				setState(1854);
				((Order_by_clauseContext)_localctx).order_by_asc_desc = order_by_asc_desc();
				 ((Order_by_clauseContext)_localctx).res =  hql_order_by_clause(((Order_by_clauseContext)_localctx).expr.res, ((Order_by_clauseContext)_localctx).order_by_asc_desc.res, ""); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1857);
				((Order_by_clauseContext)_localctx).expr = expr(0);
				setState(1858);
				match(T_COMMA);
				setState(1859);
				((Order_by_clauseContext)_localctx).order_by_clause = order_by_clause();
				setState(1860);
				((Order_by_clauseContext)_localctx).order_by_asc_desc = order_by_asc_desc();
				 ((Order_by_clauseContext)_localctx).res =  hql_order_by_clause(((Order_by_clauseContext)_localctx).expr.res, ((Order_by_clauseContext)_localctx).order_by_asc_desc.res, ((Order_by_clauseContext)_localctx).order_by_clause.res); 
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

	public static class Order_by_asc_descContext extends ParserRuleContext {
		public std::string res;
		public TerminalNode T_ASC() { return getToken(HiveParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(HiveParser.T_DESC, 0); }
		public Order_by_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_asc_desc; }
	}

	public final Order_by_asc_descContext order_by_asc_desc() throws RecognitionException {
		Order_by_asc_descContext _localctx = new Order_by_asc_descContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_order_by_asc_desc);
		try {
			setState(1870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((Order_by_asc_descContext)_localctx).res =  "ASC"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1866);
				match(T_ASC);
				 ((Order_by_asc_descContext)_localctx).res =  "ASC"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1868);
				match(T_DESC);
				 ((Order_by_asc_descContext)_localctx).res =  "DESC"; 
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

	public static class Expr_atomContext extends ParserRuleContext {
		public std::string res;
		public Date_literalContext date_literal;
		public Timestamp_literalContext timestamp_literal;
		public Bool_literalContext bool_literal;
		public IdentContext ident;
		public StringContext string;
		public Dec_numberContext dec_number;
		public Int_numberContext int_number;
		public Null_constContext null_const;
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_expr_atom);
		try {
			setState(1896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1872);
				((Expr_atomContext)_localctx).date_literal = date_literal();
				 ((Expr_atomContext)_localctx).res =  hql_expr_atom("DATE", ((Expr_atomContext)_localctx).date_literal.res); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1875);
				((Expr_atomContext)_localctx).timestamp_literal = timestamp_literal();
				 ((Expr_atomContext)_localctx).res =  hql_expr_atom("TIMESTAMP", ((Expr_atomContext)_localctx).timestamp_literal.res); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1878);
				((Expr_atomContext)_localctx).bool_literal = bool_literal();
				 ((Expr_atomContext)_localctx).res =  hql_expr_atom("BOOLEAN", ((Expr_atomContext)_localctx).bool_literal.res); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1881);
				((Expr_atomContext)_localctx).ident = ident();
				 ((Expr_atomContext)_localctx).res =  hql_expr_name((((Expr_atomContext)_localctx).ident!=null?_input.getText(((Expr_atomContext)_localctx).ident.start,((Expr_atomContext)_localctx).ident.stop):null)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1884);
				((Expr_atomContext)_localctx).string = string();
				 ((Expr_atomContext)_localctx).res =  hql_expr_atom("STRING", ((Expr_atomContext)_localctx).string.res); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1887);
				((Expr_atomContext)_localctx).dec_number = dec_number();
				 ((Expr_atomContext)_localctx).res =  hql_expr_atom("DECIMAL", (((Expr_atomContext)_localctx).dec_number!=null?_input.getText(((Expr_atomContext)_localctx).dec_number.start,((Expr_atomContext)_localctx).dec_number.stop):null)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1890);
				((Expr_atomContext)_localctx).int_number = int_number();
				 ((Expr_atomContext)_localctx).res =  hql_expr_atom("INT", (((Expr_atomContext)_localctx).int_number!=null?_input.getText(((Expr_atomContext)_localctx).int_number.start,((Expr_atomContext)_localctx).int_number.stop):null)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1893);
				((Expr_atomContext)_localctx).null_const = null_const();
				 ((Expr_atomContext)_localctx).res =  hql_expr_atom("NULL_CONSTANT", ((Expr_atomContext)_localctx).null_const.res); 
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

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(HiveParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HiveParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HiveParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HiveParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(HiveParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HiveParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
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

	public static class Date_literalContext extends ParserRuleContext {
		public std::string res;
		public StringContext s;
		public TerminalNode T_DATE() { return getToken(HiveParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			match(T_DATE);
			setState(1901);
			((Date_literalContext)_localctx).s = string();
			 ((Date_literalContext)_localctx).res =  ((Date_literalContext)_localctx).s.res; 
			}
		}
		catch (RecognitionException re) {
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
		public std::string res;
		public StringContext s;
		public TerminalNode T_TIMESTAMP() { return getToken(HiveParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			match(T_TIMESTAMP);
			setState(1905);
			((Timestamp_literalContext)_localctx).s = string();
			 ((Timestamp_literalContext)_localctx).res =  ((Timestamp_literalContext)_localctx).s.res; 
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> L_ID() { return getTokens(HiveParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HiveParser.L_ID, i);
		}
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SUB) {
				{
				setState(1908);
				match(T_SUB);
				}
			}

			setState(1913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(1911);
				match(L_ID);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
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
			case T_DATA:
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
			case T_HIVE:
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
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
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
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
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
			case T_SUBSTR:
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
				{
				setState(1912);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1915);
					match(T__1);
					setState(1918);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(1916);
						match(L_ID);
						}
						break;
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
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
					case T_DATA:
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
					case T_HIVE:
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
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
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
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
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
					case T_SUBSTR:
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
						{
						setState(1917);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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

	public static class StringContext extends ParserRuleContext {
		public std::string res;
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
			this.res = ctx.res;
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public Token L_D_STRING;
		public TerminalNode L_D_STRING() { return getToken(HiveParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
	}
	public static class Single_quotedStringContext extends StringContext {
		public Token L_S_STRING;
		public TerminalNode L_S_STRING() { return getToken(HiveParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_string);
		try {
			setState(1929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1925);
				((Single_quotedStringContext)_localctx).L_S_STRING = match(L_S_STRING);
				 ((Single_quotedStringContext)_localctx).res =  (((Single_quotedStringContext)_localctx).L_S_STRING!=null?((Single_quotedStringContext)_localctx).L_S_STRING.getText():null).substr(1, (((Single_quotedStringContext)_localctx).L_S_STRING!=null?((Single_quotedStringContext)_localctx).L_S_STRING.getText():null).length() - 2); 
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1927);
				((Double_quotedStringContext)_localctx).L_D_STRING = match(L_D_STRING);
				 ((Double_quotedStringContext)_localctx).res =  (((Double_quotedStringContext)_localctx).L_D_STRING!=null?((Double_quotedStringContext)_localctx).L_D_STRING.getText():null).substr(1, (((Double_quotedStringContext)_localctx).L_D_STRING!=null?((Double_quotedStringContext)_localctx).L_D_STRING.getText():null).length() - 2); 
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

	public static class Bool_literalContext extends ParserRuleContext {
		public std::string res;
		public Token T_TRUE;
		public Token T_FALSE;
		public TerminalNode T_TRUE() { return getToken(HiveParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(HiveParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_bool_literal);
		try {
			setState(1935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1931);
				((Bool_literalContext)_localctx).T_TRUE = match(T_TRUE);
				 ((Bool_literalContext)_localctx).res =  (((Bool_literalContext)_localctx).T_TRUE!=null?((Bool_literalContext)_localctx).T_TRUE.getText():null); 
				}
				break;
			case T_FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1933);
				((Bool_literalContext)_localctx).T_FALSE = match(T_FALSE);
				 ((Bool_literalContext)_localctx).res =  (((Bool_literalContext)_localctx).T_FALSE!=null?((Bool_literalContext)_localctx).T_FALSE.getText():null); 
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

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(HiveParser.L_INT, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(1937);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1940);
			match(L_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(HiveParser.L_DEC, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(1942);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1945);
			match(L_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_constContext extends ParserRuleContext {
		public std::string res;
		public TerminalNode T_NULL() { return getToken(HiveParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			match(T_NULL);
			 ((Null_constContext)_localctx).res =  "NULL"; 
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode T_ACTION() { return getToken(HiveParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HiveParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(HiveParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(HiveParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(HiveParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(HiveParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(HiveParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(HiveParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HiveParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(HiveParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(HiveParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(HiveParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(HiveParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HiveParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(HiveParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(HiveParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(HiveParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HiveParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(HiveParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HiveParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HiveParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(HiveParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(HiveParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(HiveParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(HiveParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(HiveParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(HiveParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(HiveParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(HiveParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(HiveParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(HiveParser.T_CASESPECIFIC, 0); }
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
		public TerminalNode T_DATA() { return getToken(HiveParser.T_DATA, 0); }
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
		public TerminalNode T_HIVE() { return getToken(HiveParser.T_HIVE, 0); }
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
		public TerminalNode T_PRINT() { return getToken(HiveParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(HiveParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HiveParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(HiveParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(HiveParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(HiveParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(HiveParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HiveParser.T_QUOTED_IDENTIFIER, 0); }
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
		public TerminalNode T_SESSION() { return getToken(HiveParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(HiveParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(HiveParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(HiveParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(HiveParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(HiveParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HiveParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HiveParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HiveParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HiveParser.T_SMALLINT, 0); }
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
		public TerminalNode T_SUBSTR() { return getToken(HiveParser.T_SUBSTR, 0); }
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
		enterRule(_localctx, 210, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (T_NUMERIC - 193)) | (1L << (T_NUMBER - 193)) | (1L << (T_OBJECT - 193)) | (1L << (T_OFF - 193)) | (1L << (T_ON - 193)) | (1L << (T_ONLY - 193)) | (1L << (T_OPEN - 193)) | (1L << (T_OR - 193)) | (1L << (T_ORDER - 193)) | (1L << (T_OUT - 193)) | (1L << (T_OUTER - 193)) | (1L << (T_OVER - 193)) | (1L << (T_OVERWRITE - 193)) | (1L << (T_OWNER - 193)) | (1L << (T_PACKAGE - 193)) | (1L << (T_PARTITION - 193)) | (1L << (T_PCTFREE - 193)) | (1L << (T_PCTUSED - 193)) | (1L << (T_PRECISION - 193)) | (1L << (T_PRESERVE - 193)) | (1L << (T_PRIMARY - 193)) | (1L << (T_PRINT - 193)) | (1L << (T_PROC - 193)) | (1L << (T_PROCEDURE - 193)) | (1L << (T_QUALIFY - 193)) | (1L << (T_QUERY_BAND - 193)) | (1L << (T_QUIT - 193)) | (1L << (T_QUOTED_IDENTIFIER - 193)) | (1L << (T_RAISE - 193)) | (1L << (T_REAL - 193)) | (1L << (T_REFERENCES - 193)) | (1L << (T_REGEXP - 193)) | (1L << (T_REPLACE - 193)) | (1L << (T_RESIGNAL - 193)) | (1L << (T_RESTRICT - 193)) | (1L << (T_RESULT - 193)) | (1L << (T_RESULT_SET_LOCATOR - 193)) | (1L << (T_RETURN - 193)) | (1L << (T_RETURNS - 193)) | (1L << (T_REVERSE - 193)) | (1L << (T_RIGHT - 193)) | (1L << (T_RLIKE - 193)) | (1L << (T_ROLE - 193)) | (1L << (T_ROLLBACK - 193)) | (1L << (T_ROW - 193)) | (1L << (T_ROWS - 193)) | (1L << (T_ROW_COUNT - 193)) | (1L << (T_RR - 193)) | (1L << (T_RS - 193)) | (1L << (T_PWD - 193)) | (1L << (T_TRIM - 193)) | (1L << (T_SCHEMA - 193)) | (1L << (T_SECOND - 193)) | (1L << (T_SECONDS - 193)) | (1L << (T_SECURITY - 193)) | (1L << (T_SEGMENT - 193)) | (1L << (T_SEL - 193)) | (1L << (T_SELECT - 193)) | (1L << (T_SET - 193)) | (1L << (T_SESSION - 193)) | (1L << (T_SESSIONS - 193)) | (1L << (T_SETS - 193)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (T_SHARE - 257)) | (1L << (T_SIGNAL - 257)) | (1L << (T_SIMPLE_DOUBLE - 257)) | (1L << (T_SIMPLE_FLOAT - 257)) | (1L << (T_SMALLDATETIME - 257)) | (1L << (T_SMALLINT - 257)) | (1L << (T_SQL - 257)) | (1L << (T_SQLEXCEPTION - 257)) | (1L << (T_SQLINSERT - 257)) | (1L << (T_SQLSTATE - 257)) | (1L << (T_SQLWARNING - 257)) | (1L << (T_STATS - 257)) | (1L << (T_STATISTICS - 257)) | (1L << (T_STEP - 257)) | (1L << (T_STORAGE - 257)) | (1L << (T_STORED - 257)) | (1L << (T_STRING - 257)) | (1L << (T_SUBDIR - 257)) | (1L << (T_SUBSTR - 257)) | (1L << (T_SUBSTRING - 257)) | (1L << (T_SUM - 257)) | (1L << (T_SUMMARY - 257)) | (1L << (T_SYS_REFCURSOR - 257)) | (1L << (T_TABLE - 257)) | (1L << (T_TABLESPACE - 257)) | (1L << (T_TEMPORARY - 257)) | (1L << (T_TERMINATED - 257)) | (1L << (T_TEXTIMAGE_ON - 257)) | (1L << (T_THEN - 257)) | (1L << (T_TIMESTAMP - 257)) | (1L << (T_TITLE - 257)) | (1L << (T_TO - 257)) | (1L << (T_TOP - 257)) | (1L << (T_TRANSACTION - 257)) | (1L << (T_TRUE - 257)) | (1L << (T_TRUNCATE - 257)) | (1L << (T_UNIQUE - 257)) | (1L << (T_UPDATE - 257)) | (1L << (T_UR - 257)) | (1L << (T_USE - 257)) | (1L << (T_USING - 257)) | (1L << (T_VALUE - 257)) | (1L << (T_VALUES - 257)) | (1L << (T_VAR - 257)) | (1L << (T_VARCHAR - 257)) | (1L << (T_VARCHAR2 - 257)) | (1L << (T_VARYING - 257)) | (1L << (T_VOLATILE - 257)) | (1L << (T_WHILE - 257)) | (1L << (T_WITH - 257)) | (1L << (T_WITHOUT - 257)) | (1L << (T_WORK - 257)) | (1L << (T_XACT_ABORT - 257)) | (1L << (T_XML - 257)) | (1L << (T_YES - 257)) | (1L << (T_ACTIVITY_COUNT - 257)) | (1L << (T_CUME_DIST - 257)) | (1L << (T_CURRENT_DATE - 257)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)))) != 0)) ) {
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
		case 67:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 76:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 77:
			return expr_concat_sempred((Expr_concatContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean expr_concat_sempred(Expr_concatContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0178\u07a3\4\2\t"+
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
		"k\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00e4\n\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0104\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u013d\n\6\3\6\3\6\5\6\u0141\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u015c\n\7\3\b\5\b\u015f\n\b\3\b\3\b\3\b\5\b\u0164\n\b\3\b\3\b\5\b\u0168"+
		"\n\b\5\b\u016a\n\b\3\t\5\t\u016d\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0174\n\t"+
		"\3\t\5\t\u0177\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u017e\n\n\3\n\3\n\5\n\u0182"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u018a\n\13\3\13\5\13\u018d\n\13"+
		"\3\13\3\13\3\13\5\13\u0192\n\13\3\13\3\13\3\f\5\f\u0197\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u019e\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01a7\n\f\3\f"+
		"\5\f\u01aa\n\f\3\r\3\r\3\r\7\r\u01af\n\r\f\r\16\r\u01b2\13\r\3\16\3\16"+
		"\3\16\5\16\u01b7\n\16\3\16\7\16\u01ba\n\16\f\16\16\16\u01bd\13\16\3\16"+
		"\7\16\u01c0\n\16\f\16\16\16\u01c3\13\16\3\16\3\16\5\16\u01c7\n\16\3\16"+
		"\5\16\u01ca\n\16\3\17\3\17\3\20\3\20\5\20\u01d0\n\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01dc\n\20\f\20\16\20\u01df\13"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u01e6\n\20\f\20\16\20\u01e9\13\20\3"+
		"\20\3\20\3\20\5\20\u01ee\n\20\3\21\3\21\3\21\5\21\u01f3\n\21\3\21\3\21"+
		"\3\21\5\21\u01f8\n\21\3\21\3\21\3\21\5\21\u01fd\n\21\7\21\u01ff\n\21\f"+
		"\21\16\21\u0202\13\21\3\21\3\21\5\21\u0206\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\7\21\u020e\n\21\f\21\16\21\u0211\13\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u021a\n\21\f\21\16\21\u021d\13\21\3\21\3\21\7\21\u0221"+
		"\n\21\f\21\16\21\u0224\13\21\5\21\u0226\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u024e\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0257\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0260\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u026c\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0275\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u028d\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u02a0\n\30\r\30"+
		"\16\30\u02a1\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02aa\n\30\3\31\5\31\u02ad"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u02bd\n\31\f\31\16\31\u02c0\13\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u02d5\n\31\3\32\5\32\u02d8\n\32\3\32\3\32\3\32\3\32\3\32\3\32\7"+
		"\32\u02e0\n\32\f\32\16\32\u02e3\13\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u02eb\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02f5\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0302\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u032d\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0337\n\37\3"+
		" \3 \5 \u033b\n \3 \3 \3 \3 \3 \5 \u0342\n \3 \3 \3 \3 \5 \u0348\n \3"+
		" \3 \3 \5 \u034d\n \3 \5 \u0350\n \3 \3 \3 \3 \3 \5 \u0357\n \3 \3 \3"+
		" \5 \u035c\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0369\n\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\5#\u0373\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u0384\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u0398\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u03a7"+
		"\n(\3)\3)\3)\3)\3)\5)\u03ae\n)\3*\3*\3*\3*\3*\5*\u03b5\n*\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u03c5\n+\3,\3,\5,\u03c9\n,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\5,\u03d3\n,\3-\3-\3-\3-\3-\3-\3-\5-\u03dc\n-\3.\3.\3."+
		"\3.\3.\7.\u03e3\n.\f.\16.\u03e6\13.\5.\u03e8\n.\3/\3/\3/\3/\3/\3/\5/\u03f0"+
		"\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u03fa\n\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0405\n\61\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u041b\n\64\3\65\5\65\u041e\n\65\3\65\3\65\3\65\3\65\5"+
		"\65\u0424\n\65\3\65\3\65\5\65\u0428\n\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u043a\n\67\38"+
		"\38\38\38\38\38\38\38\58\u0444\n8\39\39\59\u0448\n9\39\39\39\39\39\79"+
		"\u044f\n9\f9\169\u0452\139\39\59\u0455\n9\39\39\59\u0459\n9\3:\3:\3:\3"+
		";\3;\3;\3;\3;\5;\u0463\n;\3<\3<\3<\3<\3<\3<\5<\u046b\n<\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\5=\u0475\n=\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\5@\u0487\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0494\nA\3A\5A\u0497"+
		"\nA\3B\3B\5B\u049b\nB\3B\3B\3B\3B\3B\3B\3B\5B\u04a4\nB\3B\3B\3B\5B\u04a9"+
		"\nB\3B\3B\5B\u04ad\nB\3C\3C\5C\u04b1\nC\3C\3C\3C\5C\u04b6\nC\3D\3D\5D"+
		"\u04ba\nD\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u04ce"+
		"\nE\3E\3E\3E\3E\3E\7E\u04d5\nE\fE\16E\u04d8\13E\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\5F\u04e3\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u050a\n"+
		"G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\5H\u052a\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\5I\u053f\nI\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0549\n"+
		"J\3K\3K\3K\3K\3K\3L\3L\3L\3L\5L\u0554\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u056b\nM\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u058a"+
		"\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N"+
		"\3N\3N\7N\u05a4\nN\fN\16N\u05a7\13N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\7"+
		"O\u05b4\nO\fO\16O\u05b7\13O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\5P\u05cd\nP\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u05d5\nQ\3R\3R\3R"+
		"\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\3T\5T\u05f3\nT\3U\3U\3U\3U\3U\3U\5U\u05fb\nU\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u06af\nV\3W\3W\3W\3W\3W\5W\u06b6\nW"+
		"\3X\3X\3X\3X\5X\u06bc\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\5Z\u06d0\nZ\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u06f1\n[\3[\3[\3[\3["+
		"\5[\u06f7\n[\3[\3[\3[\3[\3[\3[\5[\u06ff\n[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\5[\u0727\n[\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]"+
		"\3]\3]\3]\3]\5]\u0738\n]\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\5_\u074a\n_\3`\3`\3`\3`\3`\5`\u0751\n`\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u076b\na\3b\3b\3c\3c"+
		"\3c\3c\3d\3d\3d\3d\3e\5e\u0778\ne\3e\3e\5e\u077c\ne\3e\3e\3e\5e\u0781"+
		"\ne\7e\u0783\ne\fe\16e\u0786\13e\3f\3f\3f\3f\5f\u078c\nf\3g\3g\3g\3g\5"+
		"g\u0792\ng\3h\5h\u0795\nh\3h\3h\3i\5i\u079a\ni\3i\3i\3j\3j\3j\3k\3k\3"+
		"k\2\5\u0088\u009a\u009cl\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\2\27\4\2\u00f2\u00f2\u0129\u0129\4\2\u00b0\u00b0"+
		"\u0172\u0172\4\2\36\36%%\4\2##==\4\2\u00b7\u00b7\u00ff\u00ff\4\2\16\16"+
		"RR\4\2!!\u00e6\u00e6\4\2OO\u00d7\u00d7\4\2KK\u0087\u0087\5\2\u008b\u008b"+
		"\u00b1\u00b1\u00d3\u00d4\4\2\u00bb\u00bb\u013f\u013f\5\2ww\u00a1\u00a1"+
		"\u00ec\u00ec\5\2==\u00f4\u00f5\u012d\u012d\5\2hh\u0103\u0103\u012c\u012c"+
		"\3\2RS\5\2\u00a2\u00a2\u00e3\u00e3\u00ed\u00ed\4\2\63\63\u015b\u015b\3"+
		"\2\u0116\u0117\5\2EF\u00b4\u00b5\u00f9\u00fa\4\2\u0158\u0158\u016e\u016e"+
		"\16\2\5\30\32\\``b\u00c1\u00c3\u00d4\u00d6\u00f1\u00f3\u0106\u0108\u0121"+
		"\u0123\u0128\u012b\u0136\u0139\u0149\u0150\u0157\2\u086b\2\u00d6\3\2\2"+
		"\2\4\u00e3\3\2\2\2\6\u00e5\3\2\2\2\b\u00e8\3\2\2\2\n\u0140\3\2\2\2\f\u015b"+
		"\3\2\2\2\16\u0169\3\2\2\2\20\u0176\3\2\2\2\22\u0178\3\2\2\2\24\u0185\3"+
		"\2\2\2\26\u01a6\3\2\2\2\30\u01ab\3\2\2\2\32\u01c9\3\2\2\2\34\u01cb\3\2"+
		"\2\2\36\u01ed\3\2\2\2 \u0225\3\2\2\2\"\u024d\3\2\2\2$\u0256\3\2\2\2&\u025f"+
		"\3\2\2\2(\u026b\3\2\2\2*\u0274\3\2\2\2,\u028c\3\2\2\2.\u02a9\3\2\2\2\60"+
		"\u02d4\3\2\2\2\62\u02ea\3\2\2\2\64\u02f4\3\2\2\2\66\u02f6\3\2\2\28\u0301"+
		"\3\2\2\2:\u032c\3\2\2\2<\u0336\3\2\2\2>\u035b\3\2\2\2@\u035d\3\2\2\2B"+
		"\u0368\3\2\2\2D\u0372\3\2\2\2F\u0383\3\2\2\2H\u0385\3\2\2\2J\u0397\3\2"+
		"\2\2L\u0399\3\2\2\2N\u03a6\3\2\2\2P\u03ad\3\2\2\2R\u03b4\3\2\2\2T\u03c4"+
		"\3\2\2\2V\u03d2\3\2\2\2X\u03db\3\2\2\2Z\u03e7\3\2\2\2\\\u03ef\3\2\2\2"+
		"^\u03f9\3\2\2\2`\u0404\3\2\2\2b\u0406\3\2\2\2d\u040a\3\2\2\2f\u041a\3"+
		"\2\2\2h\u0427\3\2\2\2j\u0429\3\2\2\2l\u0439\3\2\2\2n\u0443\3\2\2\2p\u0458"+
		"\3\2\2\2r\u045a\3\2\2\2t\u0462\3\2\2\2v\u046a\3\2\2\2x\u0474\3\2\2\2z"+
		"\u0476\3\2\2\2|\u047a\3\2\2\2~\u0486\3\2\2\2\u0080\u0496\3\2\2\2\u0082"+
		"\u04ac\3\2\2\2\u0084\u04b5\3\2\2\2\u0086\u04b7\3\2\2\2\u0088\u04cd\3\2"+
		"\2\2\u008a\u04e2\3\2\2\2\u008c\u0509\3\2\2\2\u008e\u0529\3\2\2\2\u0090"+
		"\u053e\3\2\2\2\u0092\u0548\3\2\2\2\u0094\u054a\3\2\2\2\u0096\u0553\3\2"+
		"\2\2\u0098\u056a\3\2\2\2\u009a\u0589\3\2\2\2\u009c\u05a8\3\2\2\2\u009e"+
		"\u05cc\3\2\2\2\u00a0\u05d4\3\2\2\2\u00a2\u05d6\3\2\2\2\u00a4\u05dd\3\2"+
		"\2\2\u00a6\u05f2\3\2\2\2\u00a8\u05fa\3\2\2\2\u00aa\u06ae\3\2\2\2\u00ac"+
		"\u06b5\3\2\2\2\u00ae\u06bb\3\2\2\2\u00b0\u06bd\3\2\2\2\u00b2\u06cf\3\2"+
		"\2\2\u00b4\u0726\3\2\2\2\u00b6\u0728\3\2\2\2\u00b8\u0737\3\2\2\2\u00ba"+
		"\u0739\3\2\2\2\u00bc\u0749\3\2\2\2\u00be\u0750\3\2\2\2\u00c0\u076a\3\2"+
		"\2\2\u00c2\u076c\3\2\2\2\u00c4\u076e\3\2\2\2\u00c6\u0772\3\2\2\2\u00c8"+
		"\u0777\3\2\2\2\u00ca\u078b\3\2\2\2\u00cc\u0791\3\2\2\2\u00ce\u0794\3\2"+
		"\2\2\u00d0\u0799\3\2\2\2\u00d2\u079d\3\2\2\2\u00d4\u07a0\3\2\2\2\u00d6"+
		"\u00d7\5\4\3\2\u00d7\u00d8\7\2\2\3\u00d8\u00d9\b\2\1\2\u00d9\3\3\2\2\2"+
		"\u00da\u00db\5\6\4\2\u00db\u00dc\7\u016d\2\2\u00dc\u00dd\b\3\1\2\u00dd"+
		"\u00e4\3\2\2\2\u00de\u00df\5\6\4\2\u00df\u00e0\7\u016d\2\2\u00e0\u00e1"+
		"\5\4\3\2\u00e1\u00e2\b\3\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3"+
		"\u00de\3\2\2\2\u00e4\5\3\2\2\2\u00e5\u00e6\5\b\5\2\u00e6\u00e7\b\4\1\2"+
		"\u00e7\7\3\2\2\2\u00e8\u00e9\5@!\2\u00e9\u00ea\b\5\1\2\u00ea\t\3\2\2\2"+
		"\u00eb\u00ec\7%\2\2\u00ec\u0141\b\6\1\2\u00ed\u00ee\7&\2\2\u00ee\u0141"+
		"\b\6\1\2\u00ef\u00f0\7\26\2\2\u00f0\u0141\b\6\1\2\u00f1\u00f2\7\27\2\2"+
		"\u00f2\u0141\b\6\1\2\u00f3\u00f4\7\30\2\2\u00f4\u0141\b\6\1\2\u00f5\u00f6"+
		"\7\31\2\2\u00f6\u0141\b\6\1\2\u00f7\u00f8\7\32\2\2\u00f8\u0141\b\6\1\2"+
		"\u00f9\u00fa\7C\2\2\u00fa\u0141\b\6\1\2\u00fb\u00fc\7D\2\2\u00fc\u0141"+
		"\b\6\1\2\u00fd\u00fe\7G\2\2\u00fe\u0141\b\6\1\2\u00ff\u0100\7H\2\2\u0100"+
		"\u0141\b\6\1\2\u0101\u0103\7Z\2\2\u0102\u0104\7\u00d6\2\2\u0103\u0102"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0141\b\6\1\2\u0106"+
		"\u0107\7q\2\2\u0107\u0141\b\6\1\2\u0108\u0109\7\u008f\2\2\u0109\u0141"+
		"\b\6\1\2\u010a\u010b\7\u0090\2\2\u010b\u0141\b\6\1\2\u010c\u010d\7\u0091"+
		"\2\2\u010d\u0141\b\6\1\2\u010e\u010f\7\u0092\2\2\u010f\u0141\b\6\1\2\u0110"+
		"\u0111\7\u0093\2\2\u0111\u0141\b\6\1\2\u0112\u0113\7\u00b8\2\2\u0113\u0141"+
		"\b\6\1\2\u0114\u0115\7\u00ba\2\2\u0115\u0141\b\6\1\2\u0116\u0117\7\u00c4"+
		"\2\2\u0117\u0141\b\6\1\2\u0118\u0119\7\u00c3\2\2\u0119\u0141\b\6\1\2\u011a"+
		"\u011b\7\u00d5\2\2\u011b\u0141\b\6\1\2\u011c\u011d\7\u00e1\2\2\u011d\u0141"+
		"\b\6\1\2\u011e\u011f\7\u00e8\2\2\u011f\u0120\7\u0135\2\2\u0120\u0141\b"+
		"\6\1\2\u0121\u0122\7\u0106\2\2\u0122\u0141\b\6\1\2\u0123\u0124\7\u0105"+
		"\2\2\u0124\u0141\b\6\1\2\u0125\u0126\7\u0107\2\2\u0126\u0141\b\6\1\2\u0127"+
		"\u0128\7\u0109\2\2\u0128\u0141\b\6\1\2\u0129\u012a\7\u0108\2\2\u012a\u0141"+
		"\b\6\1\2\u012b\u012c\7\u0114\2\2\u012c\u0141\b\6\1\2\u012d\u012e\7\u011a"+
		"\2\2\u012e\u0141\b\6\1\2\u012f\u0130\7\u0121\2\2\u0130\u0141\b\6\1\2\u0131"+
		"\u0132\7\u0122\2\2\u0132\u0141\b\6\1\2\u0133\u0134\7\u0133\2\2\u0134\u0141"+
		"\b\6\1\2\u0135\u0136\7\u0134\2\2\u0136\u0141\b\6\1\2\u0137\u0138\7\u013e"+
		"\2\2\u0138\u0141\b\6\1\2\u0139\u013c\5\u00c8e\2\u013a\u013b\7\3\2\2\u013b"+
		"\u013d\t\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\b\6\1\2\u013f\u0141\3\2\2\2\u0140\u00eb\3\2\2\2\u0140"+
		"\u00ed\3\2\2\2\u0140\u00ef\3\2\2\2\u0140\u00f1\3\2\2\2\u0140\u00f3\3\2"+
		"\2\2\u0140\u00f5\3\2\2\2\u0140\u00f7\3\2\2\2\u0140\u00f9\3\2\2\2\u0140"+
		"\u00fb\3\2\2\2\u0140\u00fd\3\2\2\2\u0140\u00ff\3\2\2\2\u0140\u0101\3\2"+
		"\2\2\u0140\u0106\3\2\2\2\u0140\u0108\3\2\2\2\u0140\u010a\3\2\2\2\u0140"+
		"\u010c\3\2\2\2\u0140\u010e\3\2\2\2\u0140\u0110\3\2\2\2\u0140\u0112\3\2"+
		"\2\2\u0140\u0114\3\2\2\2\u0140\u0116\3\2\2\2\u0140\u0118\3\2\2\2\u0140"+
		"\u011a\3\2\2\2\u0140\u011c\3\2\2\2\u0140\u011e\3\2\2\2\u0140\u0121\3\2"+
		"\2\2\u0140\u0123\3\2\2\2\u0140\u0125\3\2\2\2\u0140\u0127\3\2\2\2\u0140"+
		"\u0129\3\2\2\2\u0140\u012b\3\2\2\2\u0140\u012d\3\2\2\2\u0140\u012f\3\2"+
		"\2\2\u0140\u0131\3\2\2\2\u0140\u0133\3\2\2\2\u0140\u0135\3\2\2\2\u0140"+
		"\u0137\3\2\2\2\u0140\u0139\3\2\2\2\u0141\13\3\2\2\2\u0142\u015c\b\7\1"+
		"\2\u0143\u0144\7\u0168\2\2\u0144\u0145\t\3\2\2\u0145\u0146\7\u016b\2\2"+
		"\u0146\u015c\b\7\1\2\u0147\u0148\7\u0168\2\2\u0148\u0149\t\3\2\2\u0149"+
		"\u014a\t\4\2\2\u014a\u014b\7\u016b\2\2\u014b\u015c\b\7\1\2\u014c\u014d"+
		"\7\u0168\2\2\u014d\u014e\t\3\2\2\u014e\u014f\7\u015a\2\2\u014f\u0150\7"+
		"\u0172\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7\u016b\2\2\u0152\u015c\b\7"+
		"\1\2\u0153\u0154\7\u0168\2\2\u0154\u0155\t\3\2\2\u0155\u0156\t\4\2\2\u0156"+
		"\u0157\7\u015a\2\2\u0157\u0158\7\u0172\2\2\u0158\u0159\3\2\2\2\u0159\u015a"+
		"\7\u016b\2\2\u015a\u015c\b\7\1\2\u015b\u0142\3\2\2\2\u015b\u0143\3\2\2"+
		"\2\u015b\u0147\3\2\2\2\u015b\u014c\3\2\2\2\u015b\u0153\3\2\2\2\u015c\r"+
		"\3\2\2\2\u015d\u015f\7\u0159\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2"+
		"\2\u015f\u0160\3\2\2\2\u0160\u0161\7\u015e\2\2\u0161\u016a\5\u009aN\2"+
		"\u0162\u0164\7\u013a\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0167\7J\2\2\u0166\u0168\5\u009aN\2\u0167\u0166\3"+
		"\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u015e\3\2\2\2\u0169"+
		"\u0163\3\2\2\2\u016a\17\3\2\2\2\u016b\u016d\7\u00c0\2\2\u016c\u016b\3"+
		"\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0177\7\u00c2\2\2"+
		"\u016f\u0170\7&\2\2\u0170\u0171\7\u00ff\2\2\u0171\u0177\5\u00c8e\2\u0172"+
		"\u0174\7\u00c0\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0177\t\5\2\2\u0176\u016c\3\2\2\2\u0176\u016f\3\2\2\2\u0176"+
		"\u0173\3\2\2\2\u0177\21\3\2\2\2\u0178\u0179\7:\2\2\u0179\u017d\7\u011b"+
		"\2\2\u017a\u017b\7\u0085\2\2\u017b\u017c\7\u00c0\2\2\u017c\u017e\7i\2"+
		"\2\u017d\u017a\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181"+
		"\5r:\2\u0180\u0182\5$\23\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\5\26\f\2\u0184\23\3\2\2\2\u0185\u018c\7:\2"+
		"\2\u0186\u0187\7\u00a5\2\2\u0187\u018d\7\u011d\2\2\u0188\u018a\t\6\2\2"+
		"\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d"+
		"\7\u0136\2\2\u018c\u0186\3\2\2\2\u018c\u0189\3\2\2\2\u018d\u018e\3\2\2"+
		"\2\u018e\u018f\7\u011b\2\2\u018f\u0191\5\u00c8e\2\u0190\u0192\5$\23\2"+
		"\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194"+
		"\5\26\f\2\u0194\25\3\2\2\2\u0195\u0197\7\r\2\2\u0196\u0195\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7\u0168\2\2\u0199\u019a"+
		"\5@!\2\u019a\u019b\7\u016b\2\2\u019b\u01a7\3\2\2\2\u019c\u019e\7\r\2\2"+
		"\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a7"+
		"\5@!\2\u01a0\u01a1\7\u0168\2\2\u01a1\u01a2\5\30\r\2\u01a2\u01a3\7\u016b"+
		"\2\2\u01a3\u01a7\3\2\2\2\u01a4\u01a5\7\u00a2\2\2\u01a5\u01a7\5r:\2\u01a6"+
		"\u0196\3\2\2\2\u01a6\u019d\3\2\2\2\u01a6\u01a0\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01aa\5*\26\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\27\3\2\2\2\u01ab\u01b0\5\32\16\2\u01ac\u01ad\7\u015a"+
		"\2\2\u01ad\u01af\5\32\16\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\31\3\2\2\2\u01b2\u01b0\3\2\2"+
		"\2\u01b3\u01b4\5\34\17\2\u01b4\u01b6\5\n\6\2\u01b5\u01b7\5\f\7\2\u01b6"+
		"\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01bb\3\2\2\2\u01b8\u01ba\5\20"+
		"\t\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01c1\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c0\5\36"+
		"\20\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01ca\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7\65"+
		"\2\2\u01c5\u01c7\5\u00c8e\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\5 \21\2\u01c9\u01b3\3\2\2\2\u01c9\u01c6\3\2"+
		"\2\2\u01ca\33\3\2\2\2\u01cb\u01cc\5\u00c8e\2\u01cc\35\3\2\2\2\u01cd\u01ee"+
		"\5\16\b\2\u01ce\u01d0\7\u00c0\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01ee\7\u00c2\2\2\u01d2\u01d3\7\u00d8\2"+
		"\2\u01d3\u01ee\7\u009d\2\2\u01d4\u01ee\7\u012b\2\2\u01d5\u01d6\7\u00e2"+
		"\2\2\u01d6\u01d7\5r:\2\u01d7\u01d8\7\u0168\2\2\u01d8\u01d9\5\u00c8e\2"+
		"\u01d9\u01dd\7\u016b\2\2\u01da\u01dc\5\"\22\2\u01db\u01da\3\2\2\2\u01dc"+
		"\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01ee\3\2"+
		"\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\7\u0084\2\2\u01e1\u01e2\7\u0168\2"+
		"\2\u01e2\u01e7\7\u0172\2\2\u01e3\u01e4\7\u015a\2\2\u01e4\u01e6\7\u0172"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ee\7\u016b"+
		"\2\2\u01eb\u01ee\7\21\2\2\u01ec\u01ee\7`\2\2\u01ed\u01cd\3\2\2\2\u01ed"+
		"\u01cf\3\2\2\2\u01ed\u01d2\3\2\2\2\u01ed\u01d4\3\2\2\2\u01ed\u01d5\3\2"+
		"\2\2\u01ed\u01e0\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee"+
		"\37\3\2\2\2\u01ef\u01f0\7\u00d8\2\2\u01f0\u01f2\7\u009d\2\2\u01f1\u01f3"+
		"\7*\2\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f5\7\u0168\2\2\u01f5\u01f7\5\u00c8e\2\u01f6\u01f8\t\7\2\2\u01f7\u01f6"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0200\3\2\2\2\u01f9\u01fa\7\u015a\2"+
		"\2\u01fa\u01fc\5\u00c8e\2\u01fb\u01fd\t\7\2\2\u01fc\u01fb\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01f9\3\2\2\2\u01ff\u0202\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0203\u0205\7\u016b\2\2\u0204\u0206\7`\2\2\u0205\u0204"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0226\3\2\2\2\u0207\u0208\7s\2\2\u0208"+
		"\u0209\7\u009d\2\2\u0209\u020a\7\u0168\2\2\u020a\u020f\5\u00c8e\2\u020b"+
		"\u020c\7\u015a\2\2\u020c\u020e\5\u00c8e\2\u020d\u020b\3\2\2\2\u020e\u0211"+
		"\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0212\u0213\7\u016b\2\2\u0213\u0214\7\u00e2\2\2\u0214\u0215"+
		"\5r:\2\u0215\u0216\7\u0168\2\2\u0216\u021b\5\u00c8e\2\u0217\u0218\7\u015a"+
		"\2\2\u0218\u021a\5\u00c8e\2\u0219\u0217\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021e\u0222\7\u016b\2\2\u021f\u0221\5\"\22\2\u0220\u021f\3\2\2\2"+
		"\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0226"+
		"\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u01ef\3\2\2\2\u0225\u0207\3\2\2\2\u0226"+
		"!\3\2\2\2\u0227\u0228\7\u00c7\2\2\u0228\u0229\7O\2\2\u0229\u022a\t\b\2"+
		"\2\u022a\u024e\b\22\1\2\u022b\u022c\7\u00c7\2\2\u022c\u022d\7O\2\2\u022d"+
		"\u022e\7\u00bb\2\2\u022e\u022f\7\5\2\2\u022f\u024e\b\22\1\2\u0230\u0231"+
		"\7\u00c7\2\2\u0231\u0232\7O\2\2\u0232\u0233\7\u00ff\2\2\u0233\u0234\7"+
		"\u00c2\2\2\u0234\u024e\b\22\1\2\u0235\u0236\7\u00c7\2\2\u0236\u0237\7"+
		"O\2\2\u0237\u0238\7\u00ff\2\2\u0238\u0239\7J\2\2\u0239\u024e\b\22\1\2"+
		"\u023a\u023b\7\u00c7\2\2\u023b\u023c\7\u012c\2\2\u023c\u023d\t\b\2\2\u023d"+
		"\u024e\b\22\1\2\u023e\u023f\7\u00c7\2\2\u023f\u0240\7\u012c\2\2\u0240"+
		"\u0241\7\u00bb\2\2\u0241\u0242\7\5\2\2\u0242\u024e\b\22\1\2\u0243\u0244"+
		"\7\u00c7\2\2\u0244\u0245\7\u012c\2\2\u0245\u0246\7\u00ff\2\2\u0246\u0247"+
		"\7\u00c2\2\2\u0247\u024e\b\22\1\2\u0248\u0249\7\u00c7\2\2\u0249\u024a"+
		"\7\u012c\2\2\u024a\u024b\7\u00ff\2\2\u024b\u024c\7J\2\2\u024c\u024e\b"+
		"\22\1\2\u024d\u0227\3\2\2\2\u024d\u022b\3\2\2\2\u024d\u0230\3\2\2\2\u024d"+
		"\u0235\3\2\2\2\u024d\u023a\3\2\2\2\u024d\u023e\3\2\2\2\u024d\u0243\3\2"+
		"\2\2\u024d\u0248\3\2\2\2\u024e#\3\2\2\2\u024f\u0250\5&\24\2\u0250\u0251"+
		"\b\23\1\2\u0251\u0257\3\2\2\2\u0252\u0253\5&\24\2\u0253\u0254\5$\23\2"+
		"\u0254\u0255\b\23\1\2\u0255\u0257\3\2\2\2\u0256\u024f\3\2\2\2\u0256\u0252"+
		"\3\2\2\2\u0257%\3\2\2\2\u0258\u0259\7\u015a\2\2\u0259\u025a\5(\25\2\u025a"+
		"\u025b\b\24\1\2\u025b\u0260\3\2\2\2\u025c\u025d\5\64\33\2\u025d\u025e"+
		"\b\24\1\2\u025e\u0260\3\2\2\2\u025f\u0258\3\2\2\2\u025f\u025c\3\2\2\2"+
		"\u0260\'\3\2\2\2\u0261\u0262\7\u00bb\2\2\u0262\u0263\7\u00aa\2\2\u0263"+
		"\u026c\b\25\1\2\u0264\u0265\7\u00bb\2\2\u0265\u0266\7k\2\2\u0266\u026c"+
		"\b\25\1\2\u0267\u0268\7k\2\2\u0268\u026c\b\25\1\2\u0269\u026a\7\u00aa"+
		"\2\2\u026a\u026c\b\25\1\2\u026b\u0261\3\2\2\2\u026b\u0264\3\2\2\2\u026b"+
		"\u0267\3\2\2\2\u026b\u0269\3\2\2\2\u026c)\3\2\2\2\u026d\u026e\5,\27\2"+
		"\u026e\u026f\b\26\1\2\u026f\u0275\3\2\2\2\u0270\u0271\5,\27\2\u0271\u0272"+
		"\5*\26\2\u0272\u0273\b\26\1\2\u0273\u0275\3\2\2\2\u0274\u026d\3\2\2\2"+
		"\u0274\u0270\3\2\2\2\u0275+\3\2\2\2\u0276\u0277\7\u00c7\2\2\u0277\u0278"+
		"\7\61\2\2\u0278\u0279\t\t\2\2\u0279\u028d\7\u00f1\2\2\u027a\u027b\5.\30"+
		"\2\u027b\u027c\b\27\1\2\u027c\u028d\3\2\2\2\u027d\u027e\5\60\31\2\u027e"+
		"\u027f\b\27\1\2\u027f\u028d\3\2\2\2\u0280\u0281\5\62\32\2\u0281\u0282"+
		"\b\27\1\2\u0282\u028d\3\2\2\2\u0283\u0284\5\64\33\2\u0284\u0285\b\27\1"+
		"\2\u0285\u028d\3\2\2\2\u0286\u0287\5<\37\2\u0287\u0288\b\27\1\2\u0288"+
		"\u028d\3\2\2\2\u0289\u028a\5> \2\u028a\u028b\b\27\1\2\u028b\u028d\3\2"+
		"\2\2\u028c\u0276\3\2\2\2\u028c\u027a\3\2\2\2\u028c\u027d\3\2\2\2\u028c"+
		"\u0280\3\2\2\2\u028c\u0283\3\2\2\2\u028c\u0286\3\2\2\2\u028c\u0289\3\2"+
		"\2\2\u028d-\3\2\2\2\u028e\u028f\7\u00fc\2\2\u028f\u0290\7;\2\2\u0290\u0291"+
		"\t\n\2\2\u0291\u02aa\b\30\1\2\u0292\u0293\t\13\2\2\u0293\u0294\7\u0172"+
		"\2\2\u0294\u02aa\b\30\1\2\u0295\u0296\7\u00bd\2\2\u0296\u02aa\b\30\1\2"+
		"\u0297\u0298\7\u00ac\2\2\u0298\u02aa\b\30\1\2\u0299\u029a\7\u00be\2\2"+
		"\u029a\u02aa\b\30\1\2\u029b\u029c\7\u0112\2\2\u029c\u029f\7\u0168\2\2"+
		"\u029d\u02a0\5\u00c8e\2\u029e\u02a0\7\u0172\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2"+
		"\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\7\u016b\2\2\u02a4\u02aa\b\30\1\2"+
		"\u02a5\u02a6\7\u011c\2\2\u02a6\u02a7\5\u00c8e\2\u02a7\u02a8\b\30\1\2\u02a8"+
		"\u02aa\3\2\2\2\u02a9\u028e\3\2\2\2\u02a9\u0292\3\2\2\2\u02a9\u0295\3\2"+
		"\2\2\u02a9\u0297\3\2\2\2\u02a9\u0299\3\2\2\2\u02a9\u029b\3\2\2\2\u02a9"+
		"\u02a5\3\2\2\2\u02aa/\3\2\2\2\u02ab\u02ad\7\u008a\2\2\u02ac\u02ab\3\2"+
		"\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\7\u0088\2\2\u02af"+
		"\u02b0\5\u00c8e\2\u02b0\u02b1\b\31\1\2\u02b1\u02d5\3\2\2\2\u02b2\u02b3"+
		"\7\u013a\2\2\u02b3\u02b4\7\u00e4\2\2\u02b4\u02d5\b\31\1\2\u02b5\u02b6"+
		"\7X\2\2\u02b6\u02b7\7\35\2\2\u02b7\u02b8\7\177\2\2\u02b8\u02b9\7\u0168"+
		"\2\2\u02b9\u02be\5\u00c8e\2\u02ba\u02bb\7\u015a\2\2\u02bb\u02bd\5\u00c8"+
		"e\2\u02bc\u02ba\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c2\7\u016b"+
		"\2\2\u02c2\u02c3\b\31\1\2\u02c3\u02d5\3\2\2\2\u02c4\u02c5\7\u00c0\2\2"+
		"\u02c5\u02c6\7\u00ab\2\2\u02c6\u02d5\b\31\1\2\u02c7\u02c8\7\u00ab\2\2"+
		"\u02c8\u02d5\b\31\1\2\u02c9\u02ca\7\62\2\2\u02ca\u02cb\t\f\2\2\u02cb\u02d5"+
		"\b\31\1\2\u02cc\u02cd\7N\2\2\u02cd\u02ce\7\u00c8\2\2\u02ce\u02d5\b\31"+
		"\1\2\u02cf\u02d0\7\u013a\2\2\u02d0\u02d1\7\u00e6\2\2\u02d1\u02d2\7\u00c7"+
		"\2\2\u02d2\u02d3\7[\2\2\u02d3\u02d5\b\31\1\2\u02d4\u02ac\3\2\2\2\u02d4"+
		"\u02b2\3\2\2\2\u02d4\u02b5\3\2\2\2\u02d4\u02c4\3\2\2\2\u02d4\u02c7\3\2"+
		"\2\2\u02d4\u02c9\3\2\2\2\u02d4\u02cc\3\2\2\2\u02d4\u02cf\3\2\2\2\u02d5"+
		"\61\3\2\2\2\u02d6\u02d8\7\u012b\2\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3"+
		"\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\7\u00d8\2\2\u02da\u02db\7\u008a"+
		"\2\2\u02db\u02dc\7\u0168\2\2\u02dc\u02e1\5\u00c8e\2\u02dd\u02de\7\u015a"+
		"\2\2\u02de\u02e0\5\u00c8e\2\u02df\u02dd\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1"+
		"\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02e1\3\2"+
		"\2\2\u02e4\u02e5\7\u016b\2\2\u02e5\u02e6\b\32\1\2\u02e6\u02eb\3\2\2\2"+
		"\u02e7\u02e8\7\u013a\2\2\u02e8\u02e9\7B\2\2\u02e9\u02eb\b\32\1\2\u02ea"+
		"\u02d7\3\2\2\2\u02ea\u02e7\3\2\2\2\u02eb\63\3\2\2\2\u02ec\u02ed\5\66\34"+
		"\2\u02ed\u02ee\b\33\1\2\u02ee\u02f5\3\2\2\2\u02ef\u02f0\7\u0113\2\2\u02f0"+
		"\u02f1\7\r\2\2\u02f1\u02f2\5\u00c8e\2\u02f2\u02f3\b\33\1\2\u02f3\u02f5"+
		"\3\2\2\2\u02f4\u02ec\3\2\2\2\u02f4\u02ef\3\2\2\2\u02f5\65\3\2\2\2\u02f6"+
		"\u02f7\7\u00f0\2\2\u02f7\u02f8\7t\2\2\u02f8\u02f9\7P\2\2\u02f9\u02fa\5"+
		"8\35\2\u02fa\u02fb\b\34\1\2\u02fb\67\3\2\2\2\u02fc\u0302\b\35\1\2\u02fd"+
		"\u02fe\5:\36\2\u02fe\u02ff\58\35\2\u02ff\u0300\b\35\1\2\u0300\u0302\3"+
		"\2\2\2\u0301\u02fc\3\2\2\2\u0301\u02fd\3\2\2\2\u03029\3\2\2\2\u0303\u0304"+
		"\7n\2\2\u0304\u0305\7\u011e\2\2\u0305\u0306\7\35\2\2\u0306\u0307\5\u009a"+
		"N\2\u0307\u0308\b\36\1\2\u0308\u032d\3\2\2\2\u0309\u030a\7n\2\2\u030a"+
		"\u030b\7\u011e\2\2\u030b\u030c\7\35\2\2\u030c\u030d\5\u009aN\2\u030d\u030e"+
		"\7c\2\2\u030e\u030f\7\35\2\2\u030f\u0310\5\u009aN\2\u0310\u0311\b\36\1"+
		"\2\u0311\u032d\3\2\2\2\u0312\u0313\7-\2\2\u0313\u0314\7\u009a\2\2\u0314"+
		"\u0315\7\u011e\2\2\u0315\u0316\7\35\2\2\u0316\u0317\5\u009aN\2\u0317\u0318"+
		"\b\36\1\2\u0318\u032d\3\2\2\2\u0319\u031a\7\u00ae\2\2\u031a\u031b\7\u009e"+
		"\2\2\u031b\u031c\7\u011e\2\2\u031c\u031d\7\35\2\2\u031d\u031e\5\u009a"+
		"N\2\u031e\u031f\b\36\1\2\u031f\u032d\3\2\2\2\u0320\u0321\7\u00a4\2\2\u0321"+
		"\u0322\7\u011e\2\2\u0322\u0323\7\35\2\2\u0323\u0324\5\u009aN\2\u0324\u0325"+
		"\b\36\1\2\u0325\u032d\3\2\2\2\u0326\u0327\7\u00c2\2\2\u0327\u0328\7L\2"+
		"\2\u0328\u0329\7\r\2\2\u0329\u032a\5\u009aN\2\u032a\u032b\b\36\1\2\u032b"+
		"\u032d\3\2\2\2\u032c\u0303\3\2\2\2\u032c\u0309\3\2\2\2\u032c\u0312\3\2"+
		"\2\2\u032c\u0319\3\2\2\2\u032c\u0320\3\2\2\2\u032c\u0326\3\2\2\2\u032d"+
		";\3\2\2\2\u032e\u032f\7\u00c7\2\2\u032f\u0330\5\u00c8e\2\u0330\u0331\b"+
		"\37\1\2\u0331\u0337\3\2\2\2\u0332\u0333\7\u011f\2\2\u0333\u0334\5\u00c8"+
		"e\2\u0334\u0335\b\37\1\2\u0335\u0337\3\2\2\2\u0336\u032e\3\2\2\2\u0336"+
		"\u0332\3\2\2\2\u0337=\3\2\2\2\u0338\u033a\7\21\2\2\u0339\u033b\7\u015e"+
		"\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u033d\5\u009aN\2\u033d\u033e\b \1\2\u033e\u035c\3\2\2\2\u033f\u0341\7"+
		"/\2\2\u0340\u0342\7\u015e\2\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2"+
		"\u0342\u0343\3\2\2\2\u0343\u0344\5\u009aN\2\u0344\u0345\b \1\2\u0345\u035c"+
		"\3\2\2\2\u0346\u0348\7J\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u034c\3\2\2\2\u0349\u034a\7&\2\2\u034a\u034d\7\u00ff\2\2\u034b\u034d"+
		"\7\'\2\2\u034c\u0349\3\2\2\2\u034c\u034b\3\2\2\2\u034d\u034f\3\2\2\2\u034e"+
		"\u0350\7\u015e\2\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351"+
		"\3\2\2\2\u0351\u0352\5\u009aN\2\u0352\u0353\b \1\2\u0353\u035c\3\2\2\2"+
		"\u0354\u0356\7b\2\2\u0355\u0357\7\u015e\2\2\u0356\u0355\3\2\2\2\u0356"+
		"\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\5\u009aN\2\u0359\u035a"+
		"\b \1\2\u035a\u035c\3\2\2\2\u035b\u0338\3\2\2\2\u035b\u033f\3\2\2\2\u035b"+
		"\u0347\3\2\2\2\u035b\u0354\3\2\2\2\u035c?\3\2\2\2\u035d\u035e\5B\"\2\u035e"+
		"\u035f\b!\1\2\u035fA\3\2\2\2\u0360\u0361\5D#\2\u0361\u0362\b\"\1\2\u0362"+
		"\u0369\3\2\2\2\u0363\u0364\5D#\2\u0364\u0365\5F$\2\u0365\u0366\5B\"\2"+
		"\u0366\u0367\b\"\1\2\u0367\u0369\3\2\2\2\u0368\u0360\3\2\2\2\u0368\u0363"+
		"\3\2\2\2\u0369C\3\2\2\2\u036a\u036b\5H%\2\u036b\u036c\b#\1\2\u036c\u0373"+
		"\3\2\2\2\u036d\u036e\7\u0168\2\2\u036e\u036f\5B\"\2\u036f\u0370\7\u016b"+
		"\2\2\u0370\u0371\b#\1\2\u0371\u0373\3\2\2\2\u0372\u036a\3\2\2\2\u0372"+
		"\u036d\3\2\2\2\u0373E\3\2\2\2\u0374\u0375\7\u012a\2\2\u0375\u0376\7\7"+
		"\2\2\u0376\u0384\b$\1\2\u0377\u0378\7\u012a\2\2\u0378\u0384\b$\1\2\u0379"+
		"\u037a\7d\2\2\u037a\u0384\b$\1\2\u037b\u037c\7d\2\2\u037c\u037d\7\7\2"+
		"\2\u037d\u0384\b$\1\2\u037e\u037f\7\u0094\2\2\u037f\u0384\b$\1\2\u0380"+
		"\u0381\7\u0094\2\2\u0381\u0382\7\7\2\2\u0382\u0384\b$\1\2\u0383\u0374"+
		"\3\2\2\2\u0383\u0377\3\2\2\2\u0383\u0379\3\2\2\2\u0383\u037b\3\2\2\2\u0383"+
		"\u037e\3\2\2\2\u0383\u0380\3\2\2\2\u0384G\3\2\2\2\u0385\u0386\7\u00fe"+
		"\2\2\u0386\u0387\5L\'\2\u0387\u0388\5Z.\2\u0388\u0389\5\\/\2\u0389\u038a"+
		"\5t;\2\u038a\u038b\5v<\2\u038b\u038c\5J&\2\u038c\u038d\5\u00bc_\2\u038d"+
		"\u038e\5~@\2\u038e\u038f\b%\1\2\u038fI\3\2\2\2\u0390\u0398\b&\1\2\u0391"+
		"\u0392\5z>\2\u0392\u0393\b&\1\2\u0393\u0398\3\2\2\2\u0394\u0395\5|?\2"+
		"\u0395\u0396\b&\1\2\u0396\u0398\3\2\2\2\u0397\u0390\3\2\2\2\u0397\u0391"+
		"\3\2\2\2\u0397\u0394\3\2\2\2\u0398K\3\2\2\2\u0399\u039a\5P)\2\u039a\u039b"+
		"\5R*\2\u039b\u039c\5N(\2\u039c\u039d\b\'\1\2\u039dM\3\2\2\2\u039e\u039f"+
		"\5T+\2\u039f\u03a0\b(\1\2\u03a0\u03a7\3\2\2\2\u03a1\u03a2\5T+\2\u03a2"+
		"\u03a3\7\u015a\2\2\u03a3\u03a4\5N(\2\u03a4\u03a5\b(\1\2\u03a5\u03a7\3"+
		"\2\2\2\u03a6\u039e\3\2\2\2\u03a6\u03a1\3\2\2\2\u03a7O\3\2\2\2\u03a8\u03ae"+
		"\b)\1\2\u03a9\u03aa\7\7\2\2\u03aa\u03ae\b)\1\2\u03ab\u03ac\7W\2\2\u03ac"+
		"\u03ae\b)\1\2\u03ad\u03a8\3\2\2\2\u03ad\u03a9\3\2\2\2\u03ad\u03ab\3\2"+
		"\2\2\u03aeQ\3\2\2\2\u03af\u03b5\b*\1\2\u03b0\u03b1\7\u0125\2\2\u03b1\u03b2"+
		"\5\u009aN\2\u03b2\u03b3\b*\1\2\u03b3\u03b5\3\2\2\2\u03b4\u03af\3\2\2\2"+
		"\u03b4\u03b0\3\2\2\2\u03b5S\3\2\2\2\u03b6\u03b7\5\u00c8e\2\u03b7\u03b8"+
		"\7\u015e\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\5\u009aN\2\u03ba\u03bb\5"+
		"V,\2\u03bb\u03bc\b+\1\2\u03bc\u03c5\3\2\2\2\u03bd\u03be\5\u009aN\2\u03be"+
		"\u03bf\5V,\2\u03bf\u03c0\b+\1\2\u03c0\u03c5\3\2\2\2\u03c1\u03c2\5X-\2"+
		"\u03c2\u03c3\b+\1\2\u03c3\u03c5\3\2\2\2\u03c4\u03b6\3\2\2\2\u03c4\u03bd"+
		"\3\2\2\2\u03c4\u03c1\3\2\2\2\u03c5U\3\2\2\2\u03c6\u03d3\b,\1\2\u03c7\u03c9"+
		"\7\r\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\u03cb\5\u00c8e\2\u03cb\u03cc\b,\1\2\u03cc\u03d3\3\2\2\2\u03cd\u03ce\7"+
		"\u0168\2\2\u03ce\u03cf\7\u0123\2\2\u03cf\u03d0\7\u016f\2\2\u03d0\u03d1"+
		"\7\u016b\2\2\u03d1\u03d3\b,\1\2\u03d2\u03c6\3\2\2\2\u03d2\u03c8\3\2\2"+
		"\2\u03d2\u03cd\3\2\2\2\u03d3W\3\2\2\2\u03d4\u03d5\7\u0171\2\2\u03d5\u03d6"+
		"\7\4\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8\7\u0166\2\2\u03d8\u03dc\b-\1"+
		"\2\u03d9\u03da\7\u0166\2\2\u03da\u03dc\b-\1\2\u03db\u03d4\3\2\2\2\u03db"+
		"\u03d9\3\2\2\2\u03dcY\3\2\2\2\u03dd\u03e8\3\2\2\2\u03de\u03df\7\u0096"+
		"\2\2\u03df\u03e4\5\u00c8e\2\u03e0\u03e1\7\u015a\2\2\u03e1\u03e3\5\u00c8"+
		"e\2\u03e2\u03e0\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4"+
		"\u03e5\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03dd\3\2"+
		"\2\2\u03e7\u03de\3\2\2\2\u03e8[\3\2\2\2\u03e9\u03f0\b/\1\2\u03ea\u03eb"+
		"\7v\2\2\u03eb\u03ec\5`\61\2\u03ec\u03ed\5^\60\2\u03ed\u03ee\b/\1\2\u03ee"+
		"\u03f0\3\2\2\2\u03ef\u03e9\3\2\2\2\u03ef\u03ea\3\2\2\2\u03f0]\3\2\2\2"+
		"\u03f1\u03fa\b\60\1\2\u03f2\u03f3\5f\64\2\u03f3\u03f4\b\60\1\2\u03f4\u03fa"+
		"\3\2\2\2\u03f5\u03f6\5f\64\2\u03f6\u03f7\5^\60\2\u03f7\u03f8\b\60\1\2"+
		"\u03f8\u03fa\3\2\2\2\u03f9\u03f1\3\2\2\2\u03f9\u03f2\3\2\2\2\u03f9\u03f5"+
		"\3\2\2\2\u03fa_\3\2\2\2\u03fb\u03fc\5b\62\2\u03fc\u03fd\b\61\1\2\u03fd"+
		"\u0405\3\2\2\2\u03fe\u03ff\5d\63\2\u03ff\u0400\b\61\1\2\u0400\u0405\3"+
		"\2\2\2\u0401\u0402\5j\66\2\u0402\u0403\b\61\1\2\u0403\u0405\3\2\2\2\u0404"+
		"\u03fb\3\2\2\2\u0404\u03fe\3\2\2\2\u0404\u0401\3\2\2\2\u0405a\3\2\2\2"+
		"\u0406\u0407\5r:\2\u0407\u0408\5p9\2\u0408\u0409\b\62\1\2\u0409c\3\2\2"+
		"\2\u040a\u040b\7\u0168\2\2\u040b\u040c\5@!\2\u040c\u040d\7\u016b\2\2\u040d"+
		"\u040e\5p9\2\u040e\u040f\b\63\1\2\u040fe\3\2\2\2\u0410\u0411\7\u015a\2"+
		"\2\u0411\u0412\5`\61\2\u0412\u0413\b\64\1\2\u0413\u041b\3\2\2\2\u0414"+
		"\u0415\5h\65\2\u0415\u0416\5`\61\2\u0416\u0417\7\u00c7\2\2\u0417\u0418"+
		"\5\u0088E\2\u0418\u0419\b\64\1\2\u0419\u041b\3\2\2\2\u041a\u0410\3\2\2"+
		"\2\u041a\u0414\3\2\2\2\u041bg\3\2\2\2\u041c\u041e\7\u008c\2\2\u041d\u041c"+
		"\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\7\u009b\2"+
		"\2\u0420\u0428\b\65\1\2\u0421\u0423\t\r\2\2\u0422\u0424\7\u00cd\2\2\u0423"+
		"\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0426\7\u009b"+
		"\2\2\u0426\u0428\b\65\1\2\u0427\u041d\3\2\2\2\u0427\u0421\3\2\2\2\u0428"+
		"i\3\2\2\2\u0429\u042a\7\u011b\2\2\u042a\u042b\7\u0168\2\2\u042b\u042c"+
		"\7\u0131\2\2\u042c\u042d\5l\67\2\u042d\u042e\7\u016b\2\2\u042e\u042f\5"+
		"p9\2\u042f\u0430\b\66\1\2\u0430k\3\2\2\2\u0431\u0432\5n8\2\u0432\u0433"+
		"\b\67\1\2\u0433\u043a\3\2\2\2\u0434\u0435\5n8\2\u0435\u0436\7\u015a\2"+
		"\2\u0436\u0437\5l\67\2\u0437\u0438\b\67\1\2\u0438\u043a\3\2\2\2\u0439"+
		"\u0431\3\2\2\2\u0439\u0434\3\2\2\2\u043am\3\2\2\2\u043b\u043c\5\u009a"+
		"N\2\u043c\u043d\b8\1\2\u043d\u0444\3\2\2\2\u043e\u043f\7\u0168\2\2\u043f"+
		"\u0440\5x=\2\u0440\u0441\7\u016b\2\2\u0441\u0442\b8\1\2\u0442\u0444\3"+
		"\2\2\2\u0443\u043b\3\2\2\2\u0443\u043e\3\2\2\2\u0444o\3\2\2\2\u0445\u0459"+
		"\b9\1\2\u0446\u0448\7\r\2\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448"+
		"\u0449\3\2\2\2\u0449\u0454\5\u00c8e\2\u044a\u044b\7\u0168\2\2\u044b\u0450"+
		"\7\u0171\2\2\u044c\u044d\7\u015a\2\2\u044d\u044f\7\u0171\2\2\u044e\u044c"+
		"\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451"+
		"\u0453\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0455\7\u016b\2\2\u0454\u044a"+
		"\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\b9\1\2\u0457"+
		"\u0459\3\2\2\2\u0458\u0445\3\2\2\2\u0458\u0447\3\2\2\2\u0459q\3\2\2\2"+
		"\u045a\u045b\5\u00c8e\2\u045b\u045c\b:\1\2\u045cs\3\2\2\2\u045d\u0463"+
		"\b;\1\2\u045e\u045f\7\u0138\2\2\u045f\u0460\5\u0088E\2\u0460\u0461\b;"+
		"\1\2\u0461\u0463\3\2\2\2\u0462\u045d\3\2\2\2\u0462\u045e\3\2\2\2\u0463"+
		"u\3\2\2\2\u0464\u046b\b<\1\2\u0465\u0466\7}\2\2\u0466\u0467\7\35\2\2\u0467"+
		"\u0468\5x=\2\u0468\u0469\b<\1\2\u0469\u046b\3\2\2\2\u046a\u0464\3\2\2"+
		"\2\u046a\u0465\3\2\2\2\u046bw\3\2\2\2\u046c\u046d\5\u009aN\2\u046d\u046e"+
		"\b=\1\2\u046e\u0475\3\2\2\2\u046f\u0470\5\u009aN\2\u0470\u0471\7\u015a"+
		"\2\2\u0471\u0472\5x=\2\u0472\u0473\b=\1\2\u0473\u0475\3\2\2\2\u0474\u046c"+
		"\3\2\2\2\u0474\u046f\3\2\2\2\u0475y\3\2\2\2\u0476\u0477\7\u0080\2\2\u0477"+
		"\u0478\5\u0088E\2\u0478\u0479\b>\1\2\u0479{\3\2\2\2\u047a\u047b\7\u00dc"+
		"\2\2\u047b\u047c\5\u0088E\2\u047c\u047d\b?\1\2\u047d}\3\2\2\2\u047e\u0487"+
		"\b@\1\2\u047f\u0480\5\u0080A\2\u0480\u0481\b@\1\2\u0481\u0487\3\2\2\2"+
		"\u0482\u0483\5\u0080A\2\u0483\u0484\5~@\2\u0484\u0485\b@\1\2\u0485\u0487"+
		"\3\2\2\2\u0486\u047e\3\2\2\2\u0486\u047f\3\2\2\2\u0486\u0482\3\2\2\2\u0487"+
		"\177\3\2\2\2\u0488\u0489\7\u00a3\2\2\u0489\u048a\5\u009aN\2\u048a\u048b"+
		"\bA\1\2\u048b\u0497\3\2\2\2\u048c\u048d\7\u013a\2\2\u048d\u0493\t\16\2"+
		"\2\u048e\u048f\7\u012e\2\2\u048f\u0490\7\n\2\2\u0490\u0491\7\u009c\2\2"+
		"\u0491\u0492\t\17\2\2\u0492\u0494\7\u00a9\2\2\u0493\u048e\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0497\bA\1\2\u0496\u0488\3\2"+
		"\2\2\u0496\u048c\3\2\2\2\u0497\u0081\3\2\2\2\u0498\u049a\7O\2\2\u0499"+
		"\u049b\7v\2\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\3\2"+
		"\2\2\u049c\u049d\5r:\2\u049d\u049e\5\u0084C\2\u049e\u049f\5t;\2\u049f"+
		"\u04a0\bB\1\2\u04a0\u04ad\3\2\2\2\u04a1\u04a3\7O\2\2\u04a2\u04a4\7v\2"+
		"\2\u04a3\u04a2\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6"+
		"\5r:\2\u04a6\u04a8\5\u0084C\2\u04a7\u04a9\7\7\2\2\u04a8\u04a7\3\2\2\2"+
		"\u04a8\u04a9\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\bB\1\2\u04ab\u04ad"+
		"\3\2\2\2\u04ac\u0498\3\2\2\2\u04ac\u04a1\3\2\2\2\u04ad\u0083\3\2\2\2\u04ae"+
		"\u04b6\bC\1\2\u04af\u04b1\7\r\2\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2"+
		"\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\5\u00c8e\2\u04b3\u04b4\bC\1\2\u04b4"+
		"\u04b6\3\2\2\2\u04b5\u04ae\3\2\2\2\u04b5\u04b0\3\2\2\2\u04b6\u0085\3\2"+
		"\2\2\u04b7\u04b9\t\20\2\2\u04b8\u04ba\7\u011b\2\2\u04b9\u04b8\3\2\2\2"+
		"\u04b9\u04ba\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\5r:\2\u04bc\u04bd"+
		"\bD\1\2\u04bd\u0087\3\2\2\2\u04be\u04bf\bE\1\2\u04bf\u04c0\7\u0168\2\2"+
		"\u04c0\u04c1\5\u0088E\2\u04c1\u04c2\7\u016b\2\2\u04c2\u04c3\bE\1\2\u04c3"+
		"\u04ce\3\2\2\2\u04c4\u04c5\7\u00c0\2\2\u04c5\u04c6\7\u0168\2\2\u04c6\u04c7"+
		"\5\u0088E\2\u04c7\u04c8\7\u016b\2\2\u04c8\u04c9\bE\1\2\u04c9\u04ce\3\2"+
		"\2\2\u04ca\u04cb\5\u008aF\2\u04cb\u04cc\bE\1\2\u04cc\u04ce\3\2\2\2\u04cd"+
		"\u04be\3\2\2\2\u04cd\u04c4\3\2\2\2\u04cd\u04ca\3\2\2\2\u04ce\u04d6\3\2"+
		"\2\2\u04cf\u04d0\f\4\2\2\u04d0\u04d1\5\u0096L\2\u04d1\u04d2\5\u0088E\5"+
		"\u04d2\u04d3\bE\1\2\u04d3\u04d5\3\2\2\2\u04d4\u04cf\3\2\2\2\u04d5\u04d8"+
		"\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u0089\3\2\2\2\u04d8"+
		"\u04d6\3\2\2\2\u04d9\u04da\5\u008cG\2\u04da\u04db\bF\1\2\u04db\u04e3\3"+
		"\2\2\2\u04dc\u04dd\5\u0094K\2\u04dd\u04de\bF\1\2\u04de\u04e3\3\2\2\2\u04df"+
		"\u04e0\5\u009aN\2\u04e0\u04e1\bF\1\2\u04e1\u04e3\3\2\2\2\u04e2\u04d9\3"+
		"\2\2\2\u04e2\u04dc\3\2\2\2\u04e2\u04df\3\2\2\2\u04e3\u008b\3\2\2\2\u04e4"+
		"\u04e5\5\u009aN\2\u04e5\u04e6\7\u0098\2\2\u04e6\u04e7\7\u00c0\2\2\u04e7"+
		"\u04e8\7\u00c2\2\2\u04e8\u04e9\bG\1\2\u04e9\u050a\3\2\2\2\u04ea\u04eb"+
		"\5\u009aN\2\u04eb\u04ec\7\u0098\2\2\u04ec\u04ed\7\u00c2\2\2\u04ed\u04ee"+
		"\bG\1\2\u04ee\u050a\3\2\2\2\u04ef\u04f0\5\u009aN\2\u04f0\u04f1\7\25\2"+
		"\2\u04f1\u04f2\5\u009aN\2\u04f2\u04f3\7\n\2\2\u04f3\u04f4\5\u009aN\2\u04f4"+
		"\u04f5\bG\1\2\u04f5\u050a\3\2\2\2\u04f6\u04f7\7\u00c0\2\2\u04f7\u04f8"+
		"\7i\2\2\u04f8\u04f9\7\u0168\2\2\u04f9\u04fa\5@!\2\u04fa\u04fb\7\u016b"+
		"\2\2\u04fb\u04fc\bG\1\2\u04fc\u050a\3\2\2\2\u04fd\u04fe\7i\2\2\u04fe\u04ff"+
		"\7\u0168\2\2\u04ff\u0500\5@!\2\u0500\u0501\7\u016b\2\2\u0501\u0502\bG"+
		"\1\2\u0502\u050a\3\2\2\2\u0503\u0504\5\u008eH\2\u0504\u0505\bG\1\2\u0505"+
		"\u050a\3\2\2\2\u0506\u0507\5\u0090I\2\u0507\u0508\bG\1\2\u0508\u050a\3"+
		"\2\2\2\u0509\u04e4\3\2\2\2\u0509\u04ea\3\2\2\2\u0509\u04ef\3\2\2\2\u0509"+
		"\u04f6\3\2\2\2\u0509\u04fd\3\2\2\2\u0509\u0503\3\2\2\2\u0509\u0506\3\2"+
		"\2\2\u050a\u008d\3\2\2\2\u050b\u050c\5\u009aN\2\u050c\u050d\7\u0088\2"+
		"\2\u050d\u050e\7\u0168\2\2\u050e\u050f\5@!\2\u050f\u0510\7\u016b\2\2\u0510"+
		"\u0511\bH\1\2\u0511\u052a\3\2\2\2\u0512\u0513\5\u009aN\2\u0513\u0514\7"+
		"\u0088\2\2\u0514\u0515\7\u0168\2\2\u0515\u0516\5\u0092J\2\u0516\u0517"+
		"\7\u016b\2\2\u0517\u0518\bH\1\2\u0518\u052a\3\2\2\2\u0519\u051a\5\u009a"+
		"N\2\u051a\u051b\7\u00c0\2\2\u051b\u051c\7\u0088\2\2\u051c\u051d\7\u0168"+
		"\2\2\u051d\u051e\5@!\2\u051e\u051f\7\u016b\2\2\u051f\u0520\bH\1\2\u0520"+
		"\u052a\3\2\2\2\u0521\u0522\5\u009aN\2\u0522\u0523\7\u00c0\2\2\u0523\u0524"+
		"\7\u0088\2\2\u0524\u0525\7\u0168\2\2\u0525\u0526\5\u0092J\2\u0526\u0527"+
		"\7\u016b\2\2\u0527\u0528\bH\1\2\u0528\u052a\3\2\2\2\u0529\u050b\3\2\2"+
		"\2\u0529\u0512\3\2\2\2\u0529\u0519\3\2\2\2\u0529\u0521\3\2\2\2\u052a\u008f"+
		"\3\2\2\2\u052b\u052c\7\u0168\2\2\u052c\u052d\5\u0092J\2\u052d\u052e\7"+
		"\u016b\2\2\u052e\u052f\7\u0088\2\2\u052f\u0530\7\u0168\2\2\u0530\u0531"+
		"\5@!\2\u0531\u0532\7\u016b\2\2\u0532\u0533\bI\1\2\u0533\u053f\3\2\2\2"+
		"\u0534\u0535\7\u0168\2\2\u0535\u0536\5\u0092J\2\u0536\u0537\7\u016b\2"+
		"\2\u0537\u0538\7\u00c0\2\2\u0538\u0539\7\u0088\2\2\u0539\u053a\7\u0168"+
		"\2\2\u053a\u053b\5@!\2\u053b\u053c\7\u016b\2\2\u053c\u053d\bI\1\2\u053d"+
		"\u053f\3\2\2\2\u053e\u052b\3\2\2\2\u053e\u0534\3\2\2\2\u053f\u0091\3\2"+
		"\2\2\u0540\u0541\5\u009aN\2\u0541\u0542\bJ\1\2\u0542\u0549\3\2\2\2\u0543"+
		"\u0544\5\u009aN\2\u0544\u0545\7\u015a\2\2\u0545\u0546\5\u0092J\2\u0546"+
		"\u0547\bJ\1\2\u0547\u0549\3\2\2\2\u0548\u0540\3\2\2\2\u0548\u0543\3\2"+
		"\2\2\u0549\u0093\3\2\2\2\u054a\u054b\5\u009aN\2\u054b\u054c\5\u0098M\2"+
		"\u054c\u054d\5\u009aN\2\u054d\u054e\bK\1\2\u054e\u0095\3\2\2\2\u054f\u0550"+
		"\7\n\2\2\u0550\u0554\bL\1\2\u0551\u0552\7\u00ca\2\2\u0552\u0554\bL\1\2"+
		"\u0553\u054f\3\2\2\2\u0553\u0551\3\2\2\2\u0554\u0097\3\2\2\2\u0555\u0556"+
		"\7\u015e\2\2\u0556\u056b\bM\1\2\u0557\u0558\7\u015f\2\2\u0558\u056b\b"+
		"M\1\2\u0559\u055a\7\u0160\2\2\u055a\u056b\bM\1\2\u055b\u055c\7\u0161\2"+
		"\2\u055c\u056b\bM\1\2\u055d\u055e\7\u0164\2\2\u055e\u056b\bM\1\2\u055f"+
		"\u0560\7\u0165\2\2\u0560\u056b\bM\1\2\u0561\u0562\7\u0162\2\2\u0562\u056b"+
		"\bM\1\2\u0563\u0564\7\u0163\2\2\u0564\u056b\bM\1\2\u0565\u0566\t\21\2"+
		"\2\u0566\u056b\bM\1\2\u0567\u0568\7\u00c0\2\2\u0568\u0569\t\21\2\2\u0569"+
		"\u056b\bM\1\2\u056a\u0555\3\2\2\2\u056a\u0557\3\2\2\2\u056a\u0559\3\2"+
		"\2\2\u056a\u055b\3\2\2\2\u056a\u055d\3\2\2\2\u056a\u055f\3\2\2\2\u056a"+
		"\u0561\3\2\2\2\u056a\u0563\3\2\2\2\u056a\u0565\3\2\2\2\u056a\u0567\3\2"+
		"\2\2\u056b\u0099\3\2\2\2\u056c\u056d\bN\1\2\u056d\u056e\7\u0168\2\2\u056e"+
		"\u056f\5@!\2\u056f\u0570\7\u016b\2\2\u0570\u0571\bN\1\2\u0571\u058a\3"+
		"\2\2\2\u0572\u0573\7\u0168\2\2\u0573\u0574\5\u009aN\2\u0574\u0575\7\u016b"+
		"\2\2\u0575\u0576\bN\1\2\u0576\u058a\3\2\2\2\u0577\u0578\5\u00c0a\2\u0578"+
		"\u0579\bN\1\2\u0579\u058a\3\2\2\2\u057a\u057b\5\u009cO\2\u057b\u057c\b"+
		"N\1\2\u057c\u058a\3\2\2\2\u057d\u057e\5\u00a0Q\2\u057e\u057f\bN\1\2\u057f"+
		"\u058a\3\2\2\2\u0580\u0581\5\u00aaV\2\u0581\u0582\bN\1\2\u0582\u058a\3"+
		"\2\2\2\u0583\u0584\5\u00b4[\2\u0584\u0585\bN\1\2\u0585\u058a\3\2\2\2\u0586"+
		"\u0587\5\u00b6\\\2\u0587\u0588\bN\1\2\u0588\u058a\3\2\2\2\u0589\u056c"+
		"\3\2\2\2\u0589\u0572\3\2\2\2\u0589\u0577\3\2\2\2\u0589\u057a\3\2\2\2\u0589"+
		"\u057d\3\2\2\2\u0589\u0580\3\2\2\2\u0589\u0583\3\2\2\2\u0589\u0586\3\2"+
		"\2\2\u058a\u05a5\3\2\2\2\u058b\u058c\f\16\2\2\u058c\u058d\7\u0166\2\2"+
		"\u058d\u058e\5\u009aN\17\u058e\u058f\bN\1\2\u058f\u05a4\3\2\2\2\u0590"+
		"\u0591\f\r\2\2\u0591\u0592\7\u015c\2\2\u0592\u0593\5\u009aN\16\u0593\u0594"+
		"\bN\1\2\u0594\u05a4\3\2\2\2\u0595\u0596\f\f\2\2\u0596\u0597\7\u0158\2"+
		"\2\u0597\u0598\5\u009aN\r\u0598\u0599\bN\1\2\u0599\u05a4\3\2\2\2\u059a"+
		"\u059b\f\13\2\2\u059b\u059c\7\u016e\2\2\u059c\u059d\5\u009aN\f\u059d\u059e"+
		"\bN\1\2\u059e\u05a4\3\2\2\2\u059f\u05a0\f\17\2\2\u05a0\u05a1\5\u00c2b"+
		"\2\u05a1\u05a2\bN\1\2\u05a2\u05a4\3\2\2\2\u05a3\u058b\3\2\2\2\u05a3\u0590"+
		"\3\2\2\2\u05a3\u0595\3\2\2\2\u05a3\u059a\3\2\2\2\u05a3\u059f\3\2\2\2\u05a4"+
		"\u05a7\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u009b\3\2"+
		"\2\2\u05a7\u05a5\3\2\2\2\u05a8\u05a9\bO\1\2\u05a9\u05aa\5\u009eP\2\u05aa"+
		"\u05ab\t\22\2\2\u05ab\u05ac\5\u009eP\2\u05ac\u05ad\bO\1\2\u05ad\u05b5"+
		"\3\2\2\2\u05ae\u05af\f\3\2\2\u05af\u05b0\t\22\2\2\u05b0\u05b1\5\u009e"+
		"P\2\u05b1\u05b2\bO\1\2\u05b2\u05b4\3\2\2\2\u05b3\u05ae\3\2\2\2\u05b4\u05b7"+
		"\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u009d\3\2\2\2\u05b7"+
		"\u05b5\3\2\2\2\u05b8\u05b9\7\u0168\2\2\u05b9\u05ba\5\u009aN\2\u05ba\u05bb"+
		"\7\u016b\2\2\u05bb\u05bc\bP\1\2\u05bc\u05cd\3\2\2\2\u05bd\u05be\5\u00a0"+
		"Q\2\u05be\u05bf\bP\1\2\u05bf\u05cd\3\2\2\2\u05c0\u05c1\5\u00aaV\2\u05c1"+
		"\u05c2\bP\1\2\u05c2\u05cd\3\2\2\2\u05c3\u05c4\5\u00b4[\2\u05c4\u05c5\b"+
		"P\1\2\u05c5\u05cd\3\2\2\2\u05c6\u05c7\5\u00b6\\\2\u05c7\u05c8\bP\1\2\u05c8"+
		"\u05cd\3\2\2\2\u05c9\u05ca\5\u00c0a\2\u05ca\u05cb\bP\1\2\u05cb\u05cd\3"+
		"\2\2\2\u05cc\u05b8\3\2\2\2\u05cc\u05bd\3\2\2\2\u05cc\u05c0\3\2\2\2\u05cc"+
		"\u05c3\3\2\2\2\u05cc\u05c6\3\2\2\2\u05cc\u05c9\3\2\2\2\u05cd\u009f\3\2"+
		"\2\2\u05ce\u05cf\5\u00a2R\2\u05cf\u05d0\bQ\1\2\u05d0\u05d5\3\2\2\2\u05d1"+
		"\u05d2\5\u00a4S\2\u05d2\u05d3\bQ\1\2\u05d3\u05d5\3\2\2\2\u05d4\u05ce\3"+
		"\2\2\2\u05d4\u05d1\3\2\2\2\u05d5\u00a1\3\2\2\2\u05d6\u05d7\7\"\2\2\u05d7"+
		"\u05d8\5\u009aN\2\u05d8\u05d9\5\u00a6T\2\u05d9\u05da\5\u00a8U\2\u05da"+
		"\u05db\7a\2\2\u05db\u05dc\bR\1\2\u05dc\u00a3\3\2\2\2\u05dd\u05de\7\"\2"+
		"\2\u05de\u05df\5\u00a6T\2\u05df\u05e0\5\u00a8U\2\u05e0\u05e1\7a\2\2\u05e1"+
		"\u05e2\bS\1\2\u05e2\u00a5\3\2\2\2\u05e3\u05e4\7\u0137\2\2\u05e4\u05e5"+
		"\5\u009aN\2\u05e5\u05e6\7\u0120\2\2\u05e6\u05e7\5\u009aN\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u05e9\bT\1\2\u05e9\u05f3\3\2\2\2\u05ea\u05eb\7\u0137\2"+
		"\2\u05eb\u05ec\5\u009aN\2\u05ec\u05ed\7\u0120\2\2\u05ed\u05ee\5\u009a"+
		"N\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\5\u00a6T\2\u05f0\u05f1\bT\1\2\u05f1"+
		"\u05f3\3\2\2\2\u05f2\u05e3\3\2\2\2\u05f2\u05ea\3\2\2\2\u05f3\u00a7\3\2"+
		"\2\2\u05f4\u05fb\bU\1\2\u05f5\u05f6\7]\2\2\u05f6\u05f7\5\u009aN\2\u05f7"+
		"\u05f8\3\2\2\2\u05f8\u05f9\bU\1\2\u05f9\u05fb\3\2\2\2\u05fa\u05f4\3\2"+
		"\2\2\u05fa\u05f5\3\2\2\2\u05fb\u00a9\3\2\2\2\u05fc\u05fd\7\22\2\2\u05fd"+
		"\u05fe\7\u0168\2\2\u05fe\u05ff\5\u00acW\2\u05ff\u0600\5\u009aN\2\u0600"+
		"\u0601\7\u016b\2\2\u0601\u0602\5\u00aeX\2\u0602\u0603\bV\1\2\u0603\u06af"+
		"\3\2\2\2\u0604\u0605\78\2\2\u0605\u0606\7\u0168\2\2\u0606\u0607\5\u00ac"+
		"W\2\u0607\u0608\5\u009aN\2\u0608\u0609\7\u016b\2\2\u0609\u060a\5\u00ae"+
		"X\2\u060a\u060b\bV\1\2\u060b\u06af\3\2\2\2\u060c\u060d\78\2\2\u060d\u060e"+
		"\7\u0168\2\2\u060e\u060f\7\u0166\2\2\u060f\u0610\7\u016b\2\2\u0610\u0611"+
		"\5\u00aeX\2\u0611\u0612\bV\1\2\u0612\u06af\3\2\2\2\u0613\u0614\79\2\2"+
		"\u0614\u0615\7\u0168\2\2\u0615\u0616\5\u00acW\2\u0616\u0617\5\u009aN\2"+
		"\u0617\u0618\7\u016b\2\2\u0618\u0619\5\u00aeX\2\u0619\u061a\bV\1\2\u061a"+
		"\u06af\3\2\2\2\u061b\u061c\79\2\2\u061c\u061d\7\u0168\2\2\u061d\u061e"+
		"\7\u0166\2\2\u061e\u061f\7\u016b\2\2\u061f\u0620\5\u00aeX\2\u0620\u0621"+
		"\bV\1\2\u0621\u06af\3\2\2\2\u0622\u0623\7\u0141\2\2\u0623\u0624\7\u0168"+
		"\2\2\u0624\u0625\7\u016b\2\2\u0625\u0626\5\u00b0Y\2\u0626\u0627\bV\1\2"+
		"\u0627\u06af\3\2\2\2\u0628\u0629\7\u0145\2\2\u0629\u062a\7\u0168\2\2\u062a"+
		"\u062b\7\u016b\2\2\u062b\u062c\5\u00b0Y\2\u062c\u062d\bV\1\2\u062d\u06af"+
		"\3\2\2\2\u062e\u062f\7\u0146\2\2\u062f\u0630\7\u0168\2\2\u0630\u0631\5"+
		"\u009aN\2\u0631\u0632\7\u016b\2\2\u0632\u0633\5\u00b0Y\2\u0633\u0634\b"+
		"V\1\2\u0634\u06af\3\2\2\2\u0635\u0636\7\u0147\2\2\u0636\u0637\7\u0168"+
		"\2\2\u0637\u0638\5\u009aN\2\u0638\u0639\7\u016b\2\2\u0639\u063a\5\u00b0"+
		"Y\2\u063a\u063b\bV\1\2\u063b\u06af\3\2\2\2\u063c\u063d\7\u0147\2\2\u063d"+
		"\u063e\7\u0168\2\2\u063e\u063f\5\u009aN\2\u063f\u0640\7\u015a\2\2\u0640"+
		"\u0641\5\u009aN\2\u0641\u0642\7\u016b\2\2\u0642\u0643\5\u00b0Y\2\u0643"+
		"\u0644\bV\1\2\u0644\u06af\3\2\2\2\u0645\u0646\7\u0147\2\2\u0646\u0647"+
		"\7\u0168\2\2\u0647\u0648\5\u009aN\2\u0648\u0649\7\u015a\2\2\u0649\u064a"+
		"\5\u009aN\2\u064a\u064b\7\u015a\2\2\u064b\u064c\5\u009aN\2\u064c\u064d"+
		"\7\u016b\2\2\u064d\u064e\5\u00b0Y\2\u064e\u064f\bV\1\2\u064f\u06af\3\2"+
		"\2\2\u0650\u0651\7\u0148\2\2\u0651\u0652\7\u0168\2\2\u0652\u0653\5\u009a"+
		"N\2\u0653\u0654\7\u016b\2\2\u0654\u0655\5\u00b0Y\2\u0655\u0656\bV\1\2"+
		"\u0656\u06af\3\2\2\2\u0657\u0658\7\u0149\2\2\u0658\u0659\7\u0168\2\2\u0659"+
		"\u065a\5\u009aN\2\u065a\u065b\7\u016b\2\2\u065b\u065c\5\u00b0Y\2\u065c"+
		"\u065d\bV\1\2\u065d\u06af\3\2\2\2\u065e\u065f\7\u0149\2\2\u065f\u0660"+
		"\7\u0168\2\2\u0660\u0661\5\u009aN\2\u0661\u0662\7\u015a\2\2\u0662\u0663"+
		"\5\u009aN\2\u0663\u0664\7\u016b\2\2\u0664\u0665\5\u00b0Y\2\u0665\u0666"+
		"\bV\1\2\u0666\u06af\3\2\2\2\u0667\u0668\7\u0149\2\2\u0668\u0669\7\u0168"+
		"\2\2\u0669\u066a\5\u009aN\2\u066a\u066b\7\u015a\2\2\u066b\u066c\5\u009a"+
		"N\2\u066c\u066d\7\u015a\2\2\u066d\u066e\5\u009aN\2\u066e\u066f\7\u016b"+
		"\2\2\u066f\u0670\5\u00b0Y\2\u0670\u0671\bV\1\2\u0671\u06af\3\2\2\2\u0672"+
		"\u0673\7\u00b0\2\2\u0673\u0674\7\u0168\2\2\u0674\u0675\5\u00acW\2\u0675"+
		"\u0676\5\u009aN\2\u0676\u0677\7\u016b\2\2\u0677\u0678\5\u00aeX\2\u0678"+
		"\u0679\bV\1\2\u0679\u06af\3\2\2\2\u067a\u067b\7\u00b6\2\2\u067b\u067c"+
		"\7\u0168\2\2\u067c\u067d\5\u00acW\2\u067d\u067e\5\u009aN\2\u067e\u067f"+
		"\7\u016b\2\2\u067f\u0680\5\u00aeX\2\u0680\u0681\bV\1\2\u0681\u06af\3\2"+
		"\2\2\u0682\u0683\7\u0152\2\2\u0683\u0684\7\u0168\2\2\u0684\u0685\7\u016b"+
		"\2\2\u0685\u0686\5\u00b0Y\2\u0686\u0687\bV\1\2\u0687\u06af\3\2\2\2\u0688"+
		"\u0689\7\u0153\2\2\u0689\u068a\7\u0168\2\2\u068a\u068b\7\u016b\2\2\u068b"+
		"\u068c\5\u00b0Y\2\u068c\u068d\bV\1\2\u068d\u06af\3\2\2\2\u068e\u068f\7"+
		"\u0154\2\2\u068f\u0690\7\u0168\2\2\u0690\u0691\5\u00acW\2\u0691\u0692"+
		"\5\u009aN\2\u0692\u0693\7\u016b\2\2\u0693\u0694\5\u00aeX\2\u0694\u0695"+
		"\bV\1\2\u0695\u06af\3\2\2\2\u0696\u0697\7\u0118\2\2\u0697\u0698\7\u0168"+
		"\2\2\u0698\u0699\5\u00acW\2\u0699\u069a\5\u009aN\2\u069a\u069b\7\u016b"+
		"\2\2\u069b\u069c\5\u00aeX\2\u069c\u069d\bV\1\2\u069d\u06af\3\2\2\2\u069e"+
		"\u069f\7\u0132\2\2\u069f\u06a0\7\u0168\2\2\u06a0\u06a1\5\u00acW\2\u06a1"+
		"\u06a2\5\u009aN\2\u06a2\u06a3\7\u016b\2\2\u06a3\u06a4\5\u00aeX\2\u06a4"+
		"\u06a5\bV\1\2\u06a5\u06af\3\2\2\2\u06a6\u06a7\7\u0156\2\2\u06a7\u06a8"+
		"\7\u0168\2\2\u06a8\u06a9\5\u00acW\2\u06a9\u06aa\5\u009aN\2\u06aa\u06ab"+
		"\7\u016b\2\2\u06ab\u06ac\5\u00aeX\2\u06ac\u06ad\bV\1\2\u06ad\u06af\3\2"+
		"\2\2\u06ae\u05fc\3\2\2\2\u06ae\u0604\3\2\2\2\u06ae\u060c\3\2\2\2\u06ae"+
		"\u0613\3\2\2\2\u06ae\u061b\3\2\2\2\u06ae\u0622\3\2\2\2\u06ae\u0628\3\2"+
		"\2\2\u06ae\u062e\3\2\2\2\u06ae\u0635\3\2\2\2\u06ae\u063c\3\2\2\2\u06ae"+
		"\u0645\3\2\2\2\u06ae\u0650\3\2\2\2\u06ae\u0657\3\2\2\2\u06ae\u065e\3\2"+
		"\2\2\u06ae\u0667\3\2\2\2\u06ae\u0672\3\2\2\2\u06ae\u067a\3\2\2\2\u06ae"+
		"\u0682\3\2\2\2\u06ae\u0688\3\2\2\2\u06ae\u068e\3\2\2\2\u06ae\u0696\3\2"+
		"\2\2\u06ae\u069e\3\2\2\2\u06ae\u06a6\3\2\2\2\u06af\u00ab\3\2\2\2\u06b0"+
		"\u06b6\bW\1\2\u06b1\u06b2\7\7\2\2\u06b2\u06b6\bW\1\2\u06b3\u06b4\7W\2"+
		"\2\u06b4\u06b6\bW\1\2\u06b5\u06b0\3\2\2\2\u06b5\u06b1\3\2\2\2\u06b5\u06b3"+
		"\3\2\2\2\u06b6\u00ad\3\2\2\2\u06b7\u06bc\bX\1\2\u06b8\u06b9\5\u00b0Y\2"+
		"\u06b9\u06ba\bX\1\2\u06ba\u06bc\3\2\2\2\u06bb\u06b7\3\2\2\2\u06bb\u06b8"+
		"\3\2\2\2\u06bc\u00af\3\2\2\2\u06bd\u06be\7\u00ce\2\2\u06be\u06bf\7\u0168"+
		"\2\2\u06bf\u06c0\5\u00b2Z\2\u06c0\u06c1\5\u00bc_\2\u06c1\u06c2\7\u016b"+
		"\2\2\u06c2\u06c3\bY\1\2\u06c3\u00b1\3\2\2\2\u06c4\u06d0\bZ\1\2\u06c5\u06c6"+
		"\7\u00d2\2\2\u06c6\u06c7\7\35\2\2\u06c7\u06c8\5\u009aN\2\u06c8\u06c9\b"+
		"Z\1\2\u06c9\u06d0\3\2\2\2\u06ca\u06cb\5\u009aN\2\u06cb\u06cc\7\u015a\2"+
		"\2\u06cc\u06cd\5\u00b2Z\2\u06cd\u06ce\bZ\1\2\u06ce\u06d0\3\2\2\2\u06cf"+
		"\u06c4\3\2\2\2\u06cf\u06c5\3\2\2\2\u06cf\u06ca\3\2\2\2\u06d0\u00b3\3\2"+
		"\2\2\u06d1\u06d2\7\u0140\2\2\u06d2\u0727\b[\1\2\u06d3\u06d4\7$\2\2\u06d4"+
		"\u06d5\7\u0168\2\2\u06d5\u06d6\5\u009aN\2\u06d6\u06d7\7\r\2\2\u06d7\u06d8"+
		"\5\n\6\2\u06d8\u06d9\5\f\7\2\u06d9\u06da\7\u016b\2\2\u06da\u06db\b[\1"+
		"\2\u06db\u0727\3\2\2\2\u06dc\u06dd\78\2\2\u06dd\u06de\7\u0168\2\2\u06de"+
		"\u06df\5\u009aN\2\u06df\u06e0\7\u016b\2\2\u06e0\u06e1\b[\1\2\u06e1\u0727"+
		"\3\2\2\2\u06e2\u06e3\78\2\2\u06e3\u06e4\7\u0168\2\2\u06e4\u06e5\7\u0166"+
		"\2\2\u06e5\u06e6\7\u016b\2\2\u06e6\u06e7\5\u00aeX\2\u06e7\u06e8\b[\1\2"+
		"\u06e8\u0727\3\2\2\2\u06e9\u0727\7\u0142\2\2\u06ea\u06eb\7>\2\2\u06eb"+
		"\u06ec\7C\2\2\u06ec\u0727\b[\1\2\u06ed\u06f1\7\u0143\2\2\u06ee\u06ef\7"+
		">\2\2\u06ef\u06f1\7\u0121\2\2\u06f0\u06ed\3\2\2\2\u06f0\u06ee\3\2\2\2"+
		"\u06f1\u06f2\3\2\2\2\u06f2\u0727\b[\1\2\u06f3\u06f7\7\u0143\2\2\u06f4"+
		"\u06f5\7>\2\2\u06f5\u06f7\7\u0121\2\2\u06f6\u06f3\3\2\2\2\u06f6\u06f4"+
		"\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06f9\7\u0168\2\2\u06f9\u06fa\7\u016b"+
		"\2\2\u06fa\u0727\b[\1\2\u06fb\u06ff\7\u0143\2\2\u06fc\u06fd\7>\2\2\u06fd"+
		"\u06ff\7\u0121\2\2\u06fe\u06fb\3\2\2\2\u06fe\u06fc\3\2\2\2\u06ff\u0700"+
		"\3\2\2\2\u0700\u0701\7\u0168\2\2\u0701\u0702\5\u009aN\2\u0702\u0703\7"+
		"\u016b\2\2\u0703\u0704\3\2\2\2\u0704\u0705\b[\1\2\u0705\u0727\3\2\2\2"+
		"\u0706\u0727\7\u0144\2\2\u0707\u0708\7>\2\2\u0708\u0709\7\u0157\2\2\u0709"+
		"\u0727\b[\1\2\u070a\u070b\7\u00f7\2\2\u070b\u070c\7\u0168\2\2\u070c\u070d"+
		"\5\u009aN\2\u070d\u070e\7\u016b\2\2\u070e\u070f\b[\1\2\u070f\u0727\3\2"+
		"\2\2\u0710\u0711\t\23\2\2\u0711\u0712\7\u0168\2\2\u0712\u0713\5\u009a"+
		"N\2\u0713\u0714\7\u015a\2\2\u0714\u0715\5\u009aN\2\u0715\u0716\7\u016b"+
		"\2\2\u0716\u0717\b[\1\2\u0717\u0727\3\2\2\2\u0718\u0719\t\23\2\2\u0719"+
		"\u071a\7\u0168\2\2\u071a\u071b\5\u009aN\2\u071b\u071c\7\u015a\2\2\u071c"+
		"\u071d\5\u009aN\2\u071d\u071e\7\u015a\2\2\u071e\u071f\5\u009aN\2\u071f"+
		"\u0720\7\u016b\2\2\u0720\u0721\b[\1\2\u0721\u0727\3\2\2\2\u0722\u0723"+
		"\7\u0155\2\2\u0723\u0727\b[\1\2\u0724\u0725\7\u0157\2\2\u0725\u0727\b"+
		"[\1\2\u0726\u06d1\3\2\2\2\u0726\u06d3\3\2\2\2\u0726\u06dc\3\2\2\2\u0726"+
		"\u06e2\3\2\2\2\u0726\u06e9\3\2\2\2\u0726\u06ea\3\2\2\2\u0726\u06f0\3\2"+
		"\2\2\u0726\u06f6\3\2\2\2\u0726\u06fe\3\2\2\2\u0726\u0706\3\2\2\2\u0726"+
		"\u0707\3\2\2\2\u0726\u070a\3\2\2\2\u0726\u0710\3\2\2\2\u0726\u0718\3\2"+
		"\2\2\u0726\u0722\3\2\2\2\u0726\u0724\3\2\2\2\u0727\u00b5\3\2\2\2\u0728"+
		"\u0729\5\u00c8e\2\u0729\u072a\7\u0168\2\2\u072a\u072b\5\u00b8]\2\u072b"+
		"\u072c\7\u016b\2\2\u072c\u072d\b\\\1\2\u072d\u00b7\3\2\2\2\u072e\u0738"+
		"\3\2\2\2\u072f\u0730\5\u00ba^\2\u0730\u0731\b]\1\2\u0731\u0738\3\2\2\2"+
		"\u0732\u0733\5\u00ba^\2\u0733\u0734\7\u015a\2\2\u0734\u0735\5\u00b8]\2"+
		"\u0735\u0736\b]\1\2\u0736\u0738\3\2\2\2\u0737\u072e\3\2\2\2\u0737\u072f"+
		"\3\2\2\2\u0737\u0732\3\2\2\2\u0738\u00b9\3\2\2\2\u0739\u073a\5\u009aN"+
		"\2\u073a\u073b\b^\1\2\u073b\u00bb\3\2\2\2\u073c\u074a\b_\1\2\u073d\u073e"+
		"\7\u00cb\2\2\u073e\u073f\7\35\2\2\u073f\u0740\5\u009aN\2\u0740\u0741\5"+
		"\u00be`\2\u0741\u0742\b_\1\2\u0742\u074a\3\2\2\2\u0743\u0744\5\u009aN"+
		"\2\u0744\u0745\7\u015a\2\2\u0745\u0746\5\u00bc_\2\u0746\u0747\5\u00be"+
		"`\2\u0747\u0748\b_\1\2\u0748\u074a\3\2\2\2\u0749\u073c\3\2\2\2\u0749\u073d"+
		"\3\2\2\2\u0749\u0743\3\2\2\2\u074a\u00bd\3\2\2\2\u074b\u0751\b`\1\2\u074c"+
		"\u074d\7\16\2\2\u074d\u0751\b`\1\2\u074e\u074f\7R\2\2\u074f\u0751\b`\1"+
		"\2\u0750\u074b\3\2\2\2\u0750\u074c\3\2\2\2\u0750\u074e\3\2\2\2\u0751\u00bf"+
		"\3\2\2\2\u0752\u0753\5\u00c4c\2\u0753\u0754\ba\1\2\u0754\u076b\3\2\2\2"+
		"\u0755\u0756\5\u00c6d\2\u0756\u0757\ba\1\2\u0757\u076b\3\2\2\2\u0758\u0759"+
		"\5\u00ccg\2\u0759\u075a\ba\1\2\u075a\u076b\3\2\2\2\u075b\u075c\5\u00c8"+
		"e\2\u075c\u075d\ba\1\2\u075d\u076b\3\2\2\2\u075e\u075f\5\u00caf\2\u075f"+
		"\u0760\ba\1\2\u0760\u076b\3\2\2\2\u0761\u0762\5\u00d0i\2\u0762\u0763\b"+
		"a\1\2\u0763\u076b\3\2\2\2\u0764\u0765\5\u00ceh\2\u0765\u0766\ba\1\2\u0766"+
		"\u076b\3\2\2\2\u0767\u0768\5\u00d2j\2\u0768\u0769\ba\1\2\u0769\u076b\3"+
		"\2\2\2\u076a\u0752\3\2\2\2\u076a\u0755\3\2\2\2\u076a\u0758\3\2\2\2\u076a"+
		"\u075b\3\2\2\2\u076a\u075e\3\2\2\2\u076a\u0761\3\2\2\2\u076a\u0764\3\2"+
		"\2\2\u076a\u0767\3\2\2\2\u076b\u00c1\3\2\2\2\u076c\u076d\t\24\2\2\u076d"+
		"\u00c3\3\2\2\2\u076e\u076f\7C\2\2\u076f\u0770\5\u00caf\2\u0770\u0771\b"+
		"c\1\2\u0771\u00c5\3\2\2\2\u0772\u0773\7\u0121\2\2\u0773\u0774\5\u00ca"+
		"f\2\u0774\u0775\bd\1\2\u0775\u00c7\3\2\2\2\u0776\u0778\7\u016e\2\2\u0777"+
		"\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u077b\3\2\2\2\u0779\u077c\7\u0171"+
		"\2\2\u077a\u077c\5\u00d4k\2\u077b\u0779\3\2\2\2\u077b\u077a\3\2\2\2\u077c"+
		"\u0784\3\2\2\2\u077d\u0780\7\4\2\2\u077e\u0781\7\u0171\2\2\u077f\u0781"+
		"\5\u00d4k\2\u0780\u077e\3\2\2\2\u0780\u077f\3\2\2\2\u0781\u0783\3\2\2"+
		"\2\u0782\u077d\3\2\2\2\u0783\u0786\3\2\2\2\u0784\u0782\3\2\2\2\u0784\u0785"+
		"\3\2\2\2\u0785\u00c9\3\2\2\2\u0786\u0784\3\2\2\2\u0787\u0788\7\u016f\2"+
		"\2\u0788\u078c\bf\1\2\u0789\u078a\7\u0170\2\2\u078a\u078c\bf\1\2\u078b"+
		"\u0787\3\2\2\2\u078b\u0789\3\2\2\2\u078c\u00cb\3\2\2\2\u078d\u078e\7\u0127"+
		"\2\2\u078e\u0792\bg\1\2\u078f\u0790\7l\2\2\u0790\u0792\bg\1\2\u0791\u078d"+
		"\3\2\2\2\u0791\u078f\3\2\2\2\u0792\u00cd\3\2\2\2\u0793\u0795\t\25\2\2"+
		"\u0794\u0793\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u0797"+
		"\7\u0172\2\2\u0797\u00cf\3\2\2\2\u0798\u079a\t\25\2\2\u0799\u0798\3\2"+
		"\2\2\u0799\u079a\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079c\7\u0173\2\2\u079c"+
		"\u00d1\3\2\2\2\u079d\u079e\7\u00c2\2\2\u079e\u079f\bj\1\2\u079f\u00d3"+
		"\3\2\2\2\u07a0\u07a1\t\26\2\2\u07a1\u00d5\3\2\2\2\u0090\u00e3\u0103\u013c"+
		"\u0140\u015b\u015e\u0163\u0167\u0169\u016c\u0173\u0176\u017d\u0181\u0189"+
		"\u018c\u0191\u0196\u019d\u01a6\u01a9\u01b0\u01b6\u01bb\u01c1\u01c6\u01c9"+
		"\u01cf\u01dd\u01e7\u01ed\u01f2\u01f7\u01fc\u0200\u0205\u020f\u021b\u0222"+
		"\u0225\u024d\u0256\u025f\u026b\u0274\u028c\u029f\u02a1\u02a9\u02ac\u02be"+
		"\u02d4\u02d7\u02e1\u02ea\u02f4\u0301\u032c\u0336\u033a\u0341\u0347\u034c"+
		"\u034f\u0356\u035b\u0368\u0372\u0383\u0397\u03a6\u03ad\u03b4\u03c4\u03c8"+
		"\u03d2\u03db\u03e4\u03e7\u03ef\u03f9\u0404\u041a\u041d\u0423\u0427\u0439"+
		"\u0443\u0447\u0450\u0454\u0458\u0462\u046a\u0474\u0486\u0493\u0496\u049a"+
		"\u04a3\u04a8\u04ac\u04b0\u04b5\u04b9\u04cd\u04d6\u04e2\u0509\u0529\u053e"+
		"\u0548\u0553\u056a\u0589\u05a3\u05a5\u05b5\u05cc\u05d4\u05f2\u05fa\u06ae"+
		"\u06b5\u06bb\u06cf\u06f0\u06f6\u06fe\u0726\u0737\u0749\u0750\u076a\u0777"+
		"\u077b\u0780\u0784\u078b\u0791\u0794\u0799";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}