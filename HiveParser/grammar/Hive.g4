grammar Hive;

@header {
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

}


/* Parser */

program returns [json res]
    : stmt_list EOF { $res = $stmt_list.res; }
    ;

stmt_list returns [json res]
    :{ vector<StmtContext*> stmts; } (stmts+=stmt ';')+ { 
        vector<json> stmt_list;
        for(StmtContext* stmt : $stmts) {stmt_list.push_back(stmt->res);}
        $res = hql_stmt_list(stmt_list); }
    ;

dtype returns [std::string res]  // Data types
     : T_CHAR { $res = "CHAR"; }
     | T_CHARACTER { $res = "CHAR"; }
     | T_BIGINT { $res = "BIGINT"; }
    //  | T_BINARY_DOUBLE { $res = "BINARY_DOUBLE"; }
    //  | T_BINARY_FLOAT { $res = "BINARY_FLOAT"; }
    //  | T_BINARY_INTEGER { $res = "BINARY_INT"; }
     | T_BIT { $res = "BIT"; }
     | T_DATE { $res = "DATE"; }
     | T_DATETIME { $res = "DATETIME"; }
     | T_DEC { $res = "DECIMAL"; }
     | T_DECIMAL { $res = "DECIMAL"; }
     | T_DOUBLE T_PRECISION? { $res = "DOUBLE"; }
     | T_FLOAT { $res = "FLOAT"; }
     | T_INT { $res = "INT"; }
     | T_INT2 { $res = "TINYINT"; }
     | T_INT4 { $res = "SMALLINT"; }
     | T_INT8 { $res = "INT"; }
     | T_INTEGER { $res = "INT"; }
     | T_NCHAR { $res = "NCHAR"; }
     | T_NVARCHAR { $res = "NVARCHAR"; }
     | T_NUMBER { $res = "NUMBER"; }
     | T_NUMERIC { $res = "NUMERIC"; }
     | T_PLS_INTEGER { $res = "PLS_INTEGER"; }
     | T_REAL { $res = "REAL"; }
     | T_RESULT_SET_LOCATOR T_VARYING { $res = "RESULT_SET_LOCATOR"; }
     | T_SIMPLE_FLOAT { $res = "SIMPLE_FLOAT"; }
     | T_SIMPLE_DOUBLE { $res = "SIMPLE_DOUBLE"; }
     | T_SIMPLE_INTEGER { $res = "SIMPLE_INTEGER"; }
     | T_SMALLINT { $res = "SMALLINT"; }
     | T_SMALLDATETIME { $res = "SMALLDATETIME"; }
     | T_STRING { $res = "STRING"; }
     | T_SYS_REFCURSOR { $res = "SYS_REFCURSOR"; }
     | T_TIMESTAMP { $res = "TIMESTAMP"; }
     | T_TINYINT { $res = "TINYINT"; }
     | T_VARCHAR { $res = "VARCHAR"; }
     | T_VARCHAR2 { $res = "VARCHAR2"; }
     | T_XML { $res = "XML"; }
     | ident ('%' (T_TYPE | T_ROWTYPE))?  { $res = $ident.text; } // User-defined or derived data type
     ;

dtype_len : // Data type length or size specification
       T_OPEN_P size=(L_INT | T_MAX) (T_CHAR | T_BYTE)? (T_COMMA L_INT)? T_CLOSE_P
     ;

stmt returns [json res]
    : query_stmt { $res = $query_stmt.res; }
    ;

query_stmt returns [json res]
    : select_stmt { $res = $select_stmt.res; }
    ;

select_stmt returns [json res] // SELECT statement
    : { vector<ExprContext*> exprs; } T_SELECT exprs+=expr (',' exprs+=expr)* { 
        vector<json> expr_list;
        for(ExprContext* expr : $exprs) {expr_list.push_back(expr->res);}
        $res = hql_select_stmt(expr_list); 
        }
    ;

expr returns [json res]
    : literal_values { $res = $literal_values.res; }    
    | ident { $res =  $ident.res; }
    | unary_operator expr { $res = hql_unary_operator($unary_operator.text, $expr.res); }
    | l_expr=expr op=( '*' | '/' | '%' ) r_expr=expr { $res = hql_generic_operator($op.text, $l_expr.res, $r_expr.res); }
    | l_expr=expr op=( '+' | '-' ) r_expr=expr { $res = hql_generic_operator($op.text, $l_expr.res, $r_expr.res); }
    | l_expr=expr op=( '<<' | '>>' | '&' | '|' ) r_expr=expr { $res = hql_generic_operator($op.text, $l_expr.res, $r_expr.res); } 
    | l_expr=expr op=( '<' | '<=' | '>' | '>=' ) r_expr=expr { $res = hql_generic_operator($op.text, $l_expr.res, $r_expr.res); } 
    | l_expr=expr op=( '=' | '==' | '!=' | '<>' ) r_expr=expr { $res = hql_generic_operator($op.text, $l_expr.res, $r_expr.res); }
    | l_expr=expr set_operators r_expr=expr { $res = hql_generic_operator($set_operators.text, $l_expr.res, $r_expr.res); }
    | l_expr=expr op=T_AND r_expr=expr { $res = hql_generic_operator($op.text, $l_expr.res, $r_expr.res); }
    | l_expr=expr op=T_OR r_expr=expr { $res = hql_generic_operator($op.text, $l_expr.res, $r_expr.res); }
    | '(' expr ')' { $res = $expr.res; }
    | spec_func { $res = $spec_func.res; }
    | math_func { $res = $math_func.res; }
    | string_func { $res = $string_func.res; }
    | date_func { $res = $date_func.res; }
    ;

date_func returns [json res]
    : T_UNIX_TIMESTAMP T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("UNIX_TIMESTAMP"); }
    | T_UNIX_TIMESTAMP T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("UNIX_TIMESTAMP", "date", $date_expr.res); }
    | T_UNIX_TIMESTAMP T_OPEN_P date_expr=expr ',' pattern_expr=expr T_CLOSE_P { $res = hql_double_param_func("UNIX_TIMESTAMP", "date", $date_expr.res, "pattern", $pattern_expr.res); }
    | T_YEAR T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("YEAR", "date", $date_expr.res); }
    | T_QUARTER T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("QUARTER", "date", $date_expr.res); }
    | T_MONTH T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("MONTH", "date", $date_expr.res); }
    | T_DAY T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("DAY", "date", $date_expr.res); }
    | T_HOUR T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("HOUR", "date", $date_expr.res); }
    | T_MINUTE T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("MINUTE", "date", $date_expr.res); }
    | T_SECOND T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("SECOND", "date", $date_expr.res); }
    | T_WEEKOFYEAR T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("WEEKOFYEAR", "date", $date_expr.res); }
    | T_DATEDIFF T_OPEN_P enddate=expr ',' startdate=expr T_CLOSE_P { $res = hql_double_param_func("DATEDIFF", "enddate", $enddate.res, "startdate", $startdate.res); }
    | T_DATEADD T_OPEN_P startdate=expr ',' days=expr T_CLOSE_P { $res = hql_double_param_func("DATEDIFF", "startdate", $startdate.res, "days", $days.res); }
    | T_DATESUB T_OPEN_P startdate=expr ',' days=expr T_CLOSE_P { $res = hql_double_param_func("DATEDIFF", "startdate", $startdate.res, "days", $days.res); }
    | T_TOUTCTIMESTAMP T_OPEN_P ts=expr ',' timezone=expr T_CLOSE_P { $res = hql_double_param_func("TO_UTC_TIMESTAMP", "ts", $ts.res, "timezone", $timezone.res); }
    | T_FROMUTCTIMESTAMP T_OPEN_P ts=expr ',' timezone=expr T_CLOSE_P { $res = hql_double_param_func("FROM_UTC_TIMESTAMP", "ts", $ts.res, "timezone", $timezone.res); }
    | T_CURRENT_DATE (T_OPEN_P T_CLOSE_P)? { $res = hql_fixed_func("CURRENT_DATE"); }
    | T_CURRENT_TIMESTAMP (T_OPEN_P T_CLOSE_P)? { $res = hql_fixed_func("T_CURRENT_TIMESTAMP"); }
    | T_ADD_MONTHS T_OPEN_P startdate=expr ',' num_months=expr T_CLOSE_P { $res = hql_double_param_func("ADD_MONTHS", "startdate", $startdate.res, "num_months", $num_months.res); }
    | T_ADD_MONTHS T_OPEN_P startdate=expr ',' num_months=expr ',' out_date_format=expr T_CLOSE_P { $res = hql_three_param_func("ADD_MONTHS", "startdate", $startdate.res, "num_months", $num_months.res, "out_date_format", $out_date_format.res); }
    | T_LASTDAY T_OPEN_P date_expr=expr T_CLOSE_P { $res = hql_single_param_func("LAST_DAY", "date", $date_expr.res); }
    | T_NEXT_DAY T_OPEN_P startdate=expr ',' day_of_week=expr T_CLOSE_P { $res = hql_double_param_func("NEXT_DAY", "startdate", $startdate.res, "day_of_week", $day_of_week.res); }
    | T_TRUNC T_OPEN_P date_expr=expr ',' format=expr T_CLOSE_P { $res = hql_double_param_func("TRUNC", "date", $date_expr.res, "format", $format.res); }
    | T_MONTHS_BETWEEN T_OPEN_P date1=expr ',' date2=expr T_CLOSE_P { $res = hql_double_param_func("MONTHS_BETWEEN", "date1", $date1.res, "date2", $date2.res); }
    | T_DATE_FORMAT T_OPEN_P date_expr=expr ',' format=expr T_CLOSE_P { $res = hql_double_param_func("DATE_FORMAT", "date", $date_expr.res, "format", $format.res); }
    ;

spec_func returns [json res]
    : T_CAST T_OPEN_P expr T_AS dtype dtype_len? T_CLOSE_P { $res = hql_cast_func($expr.res, $dtype.res); }
    | T_COUNT T_OPEN_P r=expr T_CLOSE_P { $res = hql_count_func($r.res); }
    | T_COUNT T_OPEN_P '*' T_CLOSE_P { $res = hql_count_all_func(); }
    | T_CURRENT_DATE { $res = hql_fixed_func($T_CURRENT_DATE.text); }
    | T_CURRENT_DATE '(' ')' { $res = hql_fixed_func($T_CURRENT_DATE.text); }
    | T_CURRENT_TIMESTAMP { $res = hql_fixed_func($T_CURRENT_TIMESTAMP.text); }
    | T_CURRENT_TIMESTAMP '(' ')' { $res = hql_fixed_func($T_CURRENT_TIMESTAMP.text); }
    | T_SYSDATE { $res = hql_fixed_func($T_SYSDATE.text); }
    | T_USER { $res = hql_fixed_func($T_USER.text); }
    ;
    
math_func returns [json res]
    : T_ROUND T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ROUND", "expr", $expr.res); }
    | T_ROUND T_OPEN_P fst=expr ',' snd=expr T_CLOSE_P { $res = hql_double_param_func("ROUND", "expr", $fst.res, "decimal_places", $snd.res); }
    | T_FLOOR T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("FLOOR", "expr", $expr.res); }
    | (T_CEIL | T_CEILING) T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("CEIL", "expr", $expr.res); }
    | T_RAND T_OPEN_P T_CLOSE_P { $res = hql_fixed_func($T_RAND.text); }
    | T_RAND T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("RAND", "seed", $expr.res); }
    | T_EXP T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("EXP", "expr", $expr.res); }
    | T_LN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("LN", "expr", $expr.res); }
    | T_LOG10 T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("LOG10", "expr", $expr.res); }
    | T_LOG2 T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("LOG2", "expr", $expr.res); }
    | T_LOG T_OPEN_P base=expr ',' e=expr T_CLOSE_P { $res = hql_double_param_func("LOG", "base", $base.res, "expr", $e.res); }
    | ( T_POW | T_POWER ) T_OPEN_P base=expr ',' e=expr T_CLOSE_P { $res = hql_double_param_func("POWER", "base", $base.res, "exp", $e.res); }
    | T_SQRT T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("SQRT", "expr", $expr.res); }
    | T_BIN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("BIN", "expr", $expr.res); }
    | T_HEX T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("HEX", "expr", $expr.res); }
    | T_UNHEX T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("UNHEX", "expr", $expr.res); }
    | T_CONV T_OPEN_P e=expr ',' fbase=expr ',' tbase=expr T_CLOSE_P { $res = hql_three_param_func("CONV", "expr", $e.res, "from_base", $fbase.res, "to_base", $tbase.res); }
    | T_ABS T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ABS", "expr", $expr.res); }
    | T_PMOD T_OPEN_P a=expr ',' b=expr T_CLOSE_P { $res = hql_double_param_func("PMOD", "a", $a.res, "b", $b.res); }
    | T_SIN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("SIN", "expr", $expr.res); }
    | T_ASIN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ASIN", "expr", $expr.res); }
    | T_COS T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("COS", "expr", $expr.res); }
    | T_ACOS T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ACOS", "expr", $expr.res); }
    | T_TAN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("TAN", "expr", $expr.res); }
    | T_ATAN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("ATAN", "expr", $expr.res); }
    | T_DEGREES T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("DEGREES", "expr", $expr.res); }
    | T_RADIANS T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("RADIANS", "expr", $expr.res); }
    | T_POSITIVE T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("POSITIVE", "expr", $expr.res); }
    | T_NEGATIVE T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("NEGATIVE", "expr", $expr.res); }
    | T_SIGN T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("SIGN", "expr", $expr.res); }
    | 'E' T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("EULER_CONST"); }
    | 'PI' T_OPEN_P T_CLOSE_P { $res = hql_fixed_func("PI_CONST"); }
    | T_FACTORIAL T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("FACTORIAL", "expr", $expr.res); }
    | T_CBR T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("CUBE_ROOT", "expr", $expr.res); }
    ;

// https://cwiki.apache.org/confluence/display/Hive/LanguageManual+UDF

string_func returns [json res]
    : T_TRIM T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("TRIM", "expr", $expr.res); }
    | T_UPPER T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("UPPER", "expr", $expr.res); }
    | T_LOWER T_OPEN_P expr T_CLOSE_P { $res = hql_single_param_func("LOWER", "expr", $expr.res); }
    ;

literal_values returns [json res]
    : STRING_LITERAL { $res = hql_string_type($STRING_LITERAL.text); }
    | DECIMAL_LITERAL { $res = hql_decimal_type($DECIMAL_LITERAL.text); }
    | INT_LITERAL { $res = hql_int_type($INT_LITERAL.text); }
    | BOOL_LITERAL { $res = hql_boolean_type($BOOL_LITERAL.text); }
    | NULL_CONST { $res = hql_null_constant(); }
    | date_literal { $res = hql_type_date_literal($date_literal.res); }
    | timestamp_literal { $res = hql_type_timestamp_literal($timestamp_literal.res); }
    ;

ident returns [json res]
    : ( database=IDENTIFIER '.' )? ( tablename=IDENTIFIER '.' )? field=IDENTIFIER { $res = hql_type_identifier($database.text, $tablename.text, $field.text); }
    ;

date_literal returns [string res]
    : T_DATE STRING_LITERAL { $res = $STRING_LITERAL.text; }
    ;

timestamp_literal returns [string res]
    : T_TIMESTAMP STRING_LITERAL { $res = $STRING_LITERAL.text; }
    ;

set_operators
    : T_IS 
    | T_IS T_NOT 
    | T_IN 
    | T_NOT T_IN
    ;

unary_operator
    : '-'
    | '+'
    | '~'
    | T_NOT
    ;

NULL_CONST
    : T_NULL
    ;

BOOL_LITERAL
    : T_TRUE
    | T_FALSE
    ;

T_ABS             : A B S ;
T_ACOS            : A C O S ;
T_ADD_MONTHS      : A D D '_' M O N T H S ;
T_ALL             : A L L ;
T_ALTER           : A L T E R ;
T_AND             : A N D ;
T_AS              : A S ;
T_ASC             : A S C ;
T_ASIN            : A S I N ;
T_AT              : A T ;
T_ATAN            : A T A N ;
T_AUTO_INCREMENT  : A U T O '_' I N C R E M E N T ;
T_AVG             : A V G ; 
T_BEGIN           : B E G I N ;
T_BETWEEN         : B E T W E E N ; 
T_BIGINT          : B I G I N T ;
T_BIN             : B I N ;
T_BIT             : B I T ;
T_BODY            : B O D Y ; 
T_BREAK           : B R E A K ;
T_BY              : B Y ;
T_BYTE            : B Y T E ; 
T_CALL            : C A L L ;
T_CALLER          : C A L L E R ;
T_CASCADE         : C A S C A D E ; 
T_CASE            : C A S E ;
T_CAST            : C A S T ;
T_CBR             : C B R ;
T_CEIL            : C E I L ;
T_CEILING         : C E I L I N G ;
T_CHAR            : C H A R ;
T_CHARACTER       : C H A R A C T E R ;
T_CHARSET         : C H A R S E T ;
T_CLIENT          : C L I E N T ;
T_CLOSE           : C L O S E ;
T_CLUSTERED       : C L U S T E R E D;
T_CMP             : C M P ; 
T_COLLECT         : C O L L E C T ; 
T_COLLECTION      : C O L L E C T I O N ; 
T_COLUMN          : C O L U M N ;
T_COMMENT         : C O M M E N T;
T_CONSTANT        : C O N S T A N T ;
T_COMMIT          : C O M M I T ; 
T_COMPRESS        : C O M P R E S S ;
T_CONCAT          : C O N C A T;
T_CONDITION       : C O N D I T I O N ;
T_CONSTRAINT      : C O N S T R A I N T ; 
T_CONTINUE        : C O N T I N U E ;
T_CONV            : C O N V ;
T_COPY            : C O P Y ;
T_COS             : C O S ;
T_COUNT           : C O U N T ;
T_COUNT_BIG       : C O U N T '_' B I G;
T_CREATE          : C R E A T E ;
T_CREATION        : C R E A T I O N ; 
T_CREATOR         : C R E A T O R ;
T_CS              : C S;
T_CURRENT         : C U R R E N T ;
T_CURRENT_SCHEMA  : C U R R E N T '_' S C H E M A ;
T_CURSOR          : C U R S O R ;
T_DATABASE        : D A T A B A S E ;
T_DATA            : D A T A ;
T_DATE            : D A T E ;
T_DATEADD         : D A T E '_' A D D ;
T_DATEDIFF        : D A T E D I F F ;
T_DATE_FORMAT     : D A T E '_' F O R M A T ;
T_DATESUB         : D A T E '_' S U B ;
T_DATETIME        : D A T E T I M E ;
T_DAY             : D A Y ;
T_DAYS            : D A Y S ;
T_DEC             : D E C ;
T_DECIMAL         : D E C I M A L ;
T_DECLARE         : D E C L A R E ;
T_DEFAULT         : D E F A U L T ;
T_DEFERRED        : D E F E R R E D ; 
T_DEFINED         : D E F I N E D ; 
T_DEFINER         : D E F I N E R ;
T_DEFINITION      : D E F I N I T I O N ; 
T_DEGREES         : D E G R E E S ;
T_DELETE          : D E L E T E ;
T_DELIMITED       : D E L I M I T E D ; 
T_DELIMITER       : D E L I M I T E R ; 
T_DESC            : D E S C ;
T_DESCRIBE        : D E S C R I B E ; 
T_DIAGNOSTICS     : D I A G N O S T I C S ;
T_DIR             : D I R ;
T_DIRECTORY       : D I R E C T O R Y ; 
T_DISTINCT        : D I S T I N C T ;
T_DISTRIBUTE      : D I S T R I B U T E ;
T_DO              : D O ;
T_DOUBLE          : D O U B L E ;
T_DROP            : D R O P ;
T_DYNAMIC         : D Y N A M I C ; 
T_ELSE            : E L S E ;
T_ELSEIF          : E L S E I F ;
T_ELSIF           : E L S I F ;
T_ENABLE          : E N A B L E ;
T_END             : E N D ;
T_ENGINE          : E N G I N E ;
T_ESCAPED         : E S C A P E D ; 
T_EXCEPT          : E X C E P T ;
T_EXEC            : E X E C ;
T_EXECUTE         : E X E C U T E ;
T_EXCEPTION       : E X C E P T I O N ;
T_EXCLUSIVE       : E X C L U S I V E ; 
T_EXISTS          : E X I S T S ; 
T_EXIT            : E X I T ;
T_EXP             : E X P;
T_FACTORIAL       : F A C T O R I A L ;
T_FALLBACK        : F A L L B A C K ;
T_FALSE           : F A L S E ;
T_FETCH           : F E T C H ;
T_FIELDS          : F I E L D S ; 
T_FILE            : F I L E ;
T_FILES           : F I L E S ; 
T_FLOAT           : F L O A T ;
T_FLOOR           : F L O O R;
T_FOR             : F O R ;
T_FOREIGN         : F O R E I G N ; 
T_FORMAT          : F O R M A T ;
T_FOUND           : F O U N D ;
T_FROM            : F R O M ; 
T_FROMUTCTIMESTAMP  : F R O M '_' U T C '_' T I M E S T A M P ;
T_FULL            : F U L L ;
T_FUNCTION        : F U N C T I O N ;
T_GET             : G E T ;
T_GLOBAL          : G L O B A L ; 
T_GO              : G O ;
T_GRANT           : G R A N T ; 
T_GROUP           : G R O U P ;
T_HANDLER         : H A N D L E R ;
T_HASH            : H A S H ;
T_HAVING          : H A V I N G ;
T_HDFS            : H D F S ; 
T_HEX             : H E X ;
T_HIVE            : H I V E ;
T_HOST            : H O S T ;
T_HOUR            : H O U R ;
T_IDENTITY        : I D E N T I T Y ; 
T_IF              : I F ;
T_IGNORE          : I G N O R E ; 
T_IMMEDIATE       : I M M E D I A T E ;
T_IN              : I N ;
T_INCLUDE         : I N C L U D E ;
T_INDEX           : I N D E X ;
T_INITRANS        : I N I T R A N S ;
T_INNER           : I N N E R ; 
T_INOUT           : I N O U T;
T_INSERT          : I N S E R T ;
T_INT             : I N T ;
T_INT2            : I N T '2';
T_INT4            : I N T '4';
T_INT8            : I N T '8';
T_INTEGER         : I N T E G E R ;
T_INTERSECT       : I N T E R S E C T ;
T_INTERVAL        : I N T E R V A L ; 
T_INTO            : I N T O ;
T_INVOKER         : I N V O K E R ;
T_IS              : I S ;
T_ISOPEN          : I S O P E N ;
T_ITEMS           : I T E M S ; 
T_JOIN            : J O I N ;
T_KEEP            : K E E P; 
T_KEY             : K E Y ;
T_KEYS            : K E Y S ;
T_LANGUAGE        : L A N G U A G E ;
T_LASTDAY         : L A S T '_' D A Y ;
T_LEAVE           : L E A V E ;
T_LEFT            : L E F T ;
T_LIKE            : L I K E ; 
T_LIMIT           : L I M I T ;
T_LINES           : L I N E S ; 
T_LOCAL           : L O C A L ;
T_LOCATION        : L O C A T I O N ;
T_LOCATOR         : L O C A T O R ; 
T_LOCATORS        : L O C A T O R S ; 
T_LOCKS           : L O C K S ; 
T_LOG             : L O G ; 
T_LOG10           : L O G '1' '0'; 
T_LOG2            : L O G '2'; 
T_LOGGED          : L O G G E D ; 
T_LOGGING         : L O G G I N G ; 
T_LOOP            : L O O P ;
T_LOWER           : L O W E R;
T_LN              : L N ;
T_MAP             : M A P ; 
T_MATCHED         : M A T C H E D ; 
T_MAX             : M A X ;
T_MAXTRANS        : M A X T R A N S ; 
T_MERGE           : M E R G E ; 
T_MESSAGE_TEXT    : M E S S A G E '_' T E X T ;
T_MICROSECOND     : M I C R O S E C O N D ;
T_MICROSECONDS    : M I C R O S E C O N D S;
T_MIN             : M I N ;
T_MINUTE          : M I N U T E ;
T_MONTH           : M O N T H ;
T_MONTHS_BETWEEN  : M O N T H S '_' B E T W E E N ;
T_MULTISET        : M U L T I S E T ; 
T_NCHAR           : N C H A R ; 
T_NEGATIVE        : N E G A T I V E ;
T_NEXT_DAY        : N E X T '_' D A Y ;
T_NEW             : N E W ;
T_NVARCHAR        : N V A R C H A R ; 
T_NO              : N O ;
T_NOCOUNT         : N O C O U N T ;
T_NOCOMPRESS      : N O C O M P R E S S ; 
T_NOLOGGING       : N O L O G G I N G ;
T_NONE            : N O N E ;
T_NOT             : N O T ;
T_NOTFOUND        : N O T F O U N D ; 
T_NULL            : N U L L ;
T_NUMERIC         : N U M E R I C ; 
T_NUMBER          : N U M B E R ;
T_OBJECT          : O B J E C T ; 
T_OFF             : O F F ;
T_ON              : O N ;
T_ONLY            : O N L Y ;
T_OPEN            : O P E N ;
T_OR              : O R ;
T_ORDER           : O R D E R;
T_OUT             : O U T ;
T_OUTER           : O U T E R ;
T_OVER            : O V E R ;
T_OVERWRITE       : O V E R W R I T E ; 
T_OWNER           : O W N E R ; 
T_PACKAGE         : P A C K A G E ; 
T_PARTITION       : P A R T I T I O N ; 
T_PCTFREE         : P C T F R E E ; 
T_PCTUSED         : P C T U S E D ;
T_PLS_INTEGER     : P L S '_' I N T E G E R ;
T_PMOD            : P M O D ;
T_POSITIVE        : P O S I T I V E ;
T_POW             : P O W;
T_POWER           : P O W E R;
T_PRECISION       : P R E C I S I O N ; 
T_PRESERVE        : P R E S E R V E ; 
T_PRIMARY         : P R I M A R Y ;
T_PRINT           : P R I N T ; 
T_PROC            : P R O C ;
T_PROCEDURE       : P R O C E D U R E ;
T_QUALIFY         : Q U A L I F Y ;
T_QUARTER         : Q U A R T E R ;
T_QUERY_BAND      : Q U E R Y '_' B A N D ; 
T_QUIT            : Q U I T ; 
T_QUOTED_IDENTIFIER : Q U O T E D '_' I D E N T I F I E R ;
T_RADIANS         : R A D I A N S ;
T_RAISE           : R A I S E ;
T_RAND            : R A N D ;
T_REAL            : R E A L ; 
T_REFERENCES      : R E F E R E N C E S ; 
T_REGEXP          : R E G E X P ;
T_REPLACE         : R E P L A C E ; 
T_RESIGNAL        : R E S I G N A L ;
T_RESTRICT        : R E S T R I C T ; 
T_RESULT          : R E S U L T ; 
T_RESULT_SET_LOCATOR : R E S U L T '_' S E T '_' L O C A T O R ;
T_RETURN          : R E T U R N ;
T_RETURNS         : R E T U R N S ;
T_REVERSE         : R E V E R S E ;
T_RIGHT           : R I G H T ;
T_RLIKE           : R L I K E ;
T_ROLE            : R O L E ;
T_ROLLBACK        : R O L L B A C K ;
T_ROUND           : R O U N D ;
T_ROW             : R O W ; 
T_ROWS            : R O W S ; 
T_ROWTYPE         : R O W T Y P E ; 
T_ROW_COUNT       : R O W '_' C O U N T ;
T_RR              : R R;
T_RS              : R S ;
T_PWD             : P W D ; 
T_TRIM            : T R I M ;
T_SCHEMA          : S C H E M A ;
T_SECOND          : S E C O N D ;
T_SECONDS         : S E C O N D S;
T_SECURITY        : S E C U R I T Y ; 
T_SEGMENT         : S E G M E N T ; 
T_SEL             : S E L ;
T_SELECT          : S E L E C T ; 
T_SET             : S E T ;
T_SETS            : S E T S;
T_SIGN          : S I G N ;
T_SIN             : S I N ; 
T_SIMPLE_DOUBLE   : S I M P L E '_' D O U B L E ;
T_SIMPLE_FLOAT    : S I M P L E '_' F L O A T ;
T_SIMPLE_INTEGER  : S I M P L E '_' I N T E G E R ;
T_SMALLDATETIME   : S M A L L D A T E T I M E ;
T_SMALLINT        : S M A L L I N T ;
T_SQL             : S Q L ; 
T_SQLEXCEPTION    : S Q L E X C E P T I O N ;
T_SQLINSERT       : S Q L I N S E R T ;
T_SQLSTATE        : S Q L S T A T E ;
T_SQLWARNING      : S Q L W A R N I N G ;
T_SQRT            : S Q R T ;
T_STATS           : S T A T S ; 
T_STATISTICS      : S T A T I S T I C S ;
T_STEP            : S T E P ; 
T_STORAGE         : S T O R A G E ; 
T_STORED          : S T O R E D ;
T_STRING          : S T R I N G ;
T_SUBDIR          : S U B D I R ; 
T_SUBSTR          : S U B S T R ; 
T_SUBSTRING       : S U B S T R I N G ; 
T_SUM             : S U M ;
T_SUMMARY         : S U M M A R Y ;
T_SYS_REFCURSOR   : S Y S '_' R E F C U R S O R ; 
T_TABLE           : T A B L E ;
T_TABLESPACE      : T A B L E S P A C E ;
T_TAN             : T A N ;
T_TEMPORARY       : T E M P O R A R Y ;
T_TERMINATED      : T E R M I N A T E D ; 
T_TEXTIMAGE_ON    : T E X T I M A G E '_' O N ;
T_THEN            : T H E N ;
T_TIMESTAMP       : T I M E S T A M P ;
T_TINYINT         : T I N Y I N T ;
T_TITLE           : T I T L E ;
T_TO              : T O ; 
T_TOP             : T O P ;
T_TOUTCTIMESTAMP  : T O '_' U T C '_' T I M E S T A M P ;
T_TRANSACTION     : T R A N S A C T I O N ;
T_TRUE            : T R U E ;
T_TRUNCATE        : T R U N C A T E;
T_TRUNC            : T R U N C ;
T_TYPE            : T Y P E ; 
T_UNHEX           : U N H E X ;
T_UNION           : U N I O N ;
T_UNIQUE          : U N I Q U E ;
T_UNIX_TIMESTAMP  : U N I X '_' T I M E S T A M P ;
T_UPDATE          : U P D A T E ; 
T_UPPER           : U P P E R;
T_UR              : U R ;
T_USE             : U S E ;
T_USING           : U S I N G ;
T_VALUE           : V A L U E ;
T_VALUES          : V A L U E S ;
T_VAR             : V A R ;
T_VARCHAR         : V A R C H A R ;
T_VARCHAR2        : V A R C H A R '2' ;
T_VARYING         : V A R Y I N G ;
T_VOLATILE        : V O L A T I L E ;
T_WEEKOFYEAR      : W E E K O F Y E A R ;
T_WHEN            : W H E N ;
T_WHERE           : W H E R E ;
T_WHILE           : W H I L E ;
T_WITH            : W I T H ; 
T_WITHOUT         : W I T H O U T ;
T_WORK            : W O R K ;
T_XACT_ABORT      : X A C T '_' A B O R T ;
T_XML             : X M L ;
T_YEAR            : Y E A R ;
T_YES             : Y E S ; 

// Functions with specific syntax
T_ACTIVITY_COUNT       : A C T I V I T Y '_' C O U N T ;
T_CUME_DIST            : C U M E '_' D I S T ; 
T_CURRENT_DATE         : C U R R E N T '_' D A T E ;
T_CURRENT_TIMESTAMP    : C U R R E N T '_' T I M E S T A M P ;
T_CURRENT_USER         : C U R R E N T '_' U S E R ;
T_DENSE_RANK           : D E N S E '_' R A N K ;
T_FIRST_VALUE          : F I R S T '_' V A L U E; 
T_LAG                  : L A G ;
T_LAST_VALUE           : L A S T '_' V A L U E; 
T_LEAD                 : L E A D ; 
T_MAX_PART_STRING      : M A X '_' P A R T '_' S T R I N G ;
T_MIN_PART_STRING      : M I N '_' P A R T '_' S T R I N G ;
T_MAX_PART_INT         : M A X '_' P A R T '_' I N T ;
T_MIN_PART_INT         : M I N '_' P A R T '_' I N T ;
T_MAX_PART_DATE        : M A X '_' P A R T '_' D A T E ;
T_MIN_PART_DATE        : M I N '_' P A R T '_' D A T E ;
T_PART_COUNT           : P A R T '_' C O U N T ; 
T_PART_LOC             : P A R T '_' L O C ;
T_RANK                 : R A N K ;
T_ROW_NUMBER           : R O W '_' N U M B E R;
T_STDEV                : S T D E V ;
T_SYSDATE              : S Y S D A T E ;
T_VARIANCE             : V A R I A N C E ; 
T_USER                 : U S E R; 

T_ADD          : '+' ;
T_COLON        : ':' ;
T_COMMA        : ',' ;
T_PIPE         : '||' ;
T_DIV          : '/' ;
T_DOT2         : '..' ;
T_EQUAL        : '=' ;
T_EQUAL2       : '==' ;
T_NOTEQUAL     : '<>' ;
T_NOTEQUAL2    : '!=' ;
T_GREATER      : '>' ;
T_GREATEREQUAL : '>=' ;
T_LESS         : '<' ;
T_LESSEQUAL    : '<=' ;
T_MUL          : '*' ;
T_OPEN_B       : '{' ;
T_OPEN_P       : '(' ;
T_OPEN_SB      : '[' ;
T_CLOSE_B      : '}' ; 
T_CLOSE_P      : ')' ;
T_CLOSE_SB     : ']' ;
T_SEMICOLON    : ';' ;
T_SUB          : '-' ;


IDENTIFIER
    : '`' (~'`' | '``')* '`'
    | [a-zA-Z_] [a-zA-Z_0-9]*
    ;

INT_LITERAL
    :('-' | '+')? L_INT
    ;

DECIMAL_LITERAL 
    : ('-' | '+')? L_DEC 
    ;

STRING_LITERAL  
    : '\'' (('\'' '\'') | ('\\' '\'') | ~('\''))* '\''         // Single quoted string literal 
    | '"' ('""' | '\\"' | .)*? '"'                              // Double quoted string literal
    ;

L_INT       : DIGIT+ ;

L_DEC
    : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
    | '.' DIGIT+ ( E [-+]? DIGIT+ )?
    ;


SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9]; 

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];