// Generated from c:\Users\elisson.lima\source\repos\HiveParser\HiveParser\grammar\Sql.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SCOL=2, DOT=3, OPEN_PAR=4, CLOSE_PAR=5, COMMA=6, ASSIGN=7, STAR=8, 
		PLUS=9, MINUS=10, TILDE=11, PIPE2=12, DIV=13, MOD=14, LT2=15, GT2=16, 
		AMP=17, PIPE=18, LT=19, LT_EQ=20, GT=21, GT_EQ=22, EQ=23, NOT_EQ1=24, 
		NOT_EQ2=25, K_ABORT=26, K_ACTION=27, K_ADD=28, K_AFTER=29, K_ALL=30, K_ALTER=31, 
		K_ANALYZE=32, K_AND=33, K_AS=34, K_ASC=35, K_ATTACH=36, K_AUTOINCREMENT=37, 
		K_BEFORE=38, K_BEGIN=39, K_BETWEEN=40, K_BY=41, K_CASCADE=42, K_CASE=43, 
		K_CAST=44, K_CHECK=45, K_COLLATE=46, K_COLUMN=47, K_COMMIT=48, K_CONFLICT=49, 
		K_CONSTRAINT=50, K_CREATE=51, K_CROSS=52, K_CURRENT_DATE=53, K_CURRENT_TIME=54, 
		K_CURRENT_TIMESTAMP=55, K_DATABASE=56, K_DEFAULT=57, K_DEFERRABLE=58, 
		K_DEFERRED=59, K_DELETE=60, K_DESC=61, K_DETACH=62, K_DISTINCT=63, K_DROP=64, 
		K_EACH=65, K_ELSE=66, K_END=67, K_ENABLE=68, K_ESCAPE=69, K_EXCEPT=70, 
		K_EXCLUSIVE=71, K_EXISTS=72, K_EXPLAIN=73, K_FAIL=74, K_FOR=75, K_FOREIGN=76, 
		K_FROM=77, K_FULL=78, K_GLOB=79, K_GROUP=80, K_HAVING=81, K_IF=82, K_IGNORE=83, 
		K_IMMEDIATE=84, K_IN=85, K_INDEX=86, K_INDEXED=87, K_INITIALLY=88, K_INNER=89, 
		K_INSERT=90, K_INSTEAD=91, K_INTERSECT=92, K_INTO=93, K_IS=94, K_ISNULL=95, 
		K_JOIN=96, K_KEY=97, K_LEFT=98, K_LIKE=99, K_LIMIT=100, K_MATCH=101, K_NATURAL=102, 
		K_NEXTVAL=103, K_NO=104, K_NOT=105, K_NOTNULL=106, K_NULL=107, K_OF=108, 
		K_OFFSET=109, K_ON=110, K_ONLY=111, K_OR=112, K_ORDER=113, K_OUTER=114, 
		K_PLAN=115, K_PRAGMA=116, K_PRIMARY=117, K_QUERY=118, K_RAISE=119, K_RECURSIVE=120, 
		K_REFERENCES=121, K_REGEXP=122, K_REINDEX=123, K_RELEASE=124, K_RENAME=125, 
		K_REPLACE=126, K_RESTRICT=127, K_RIGHT=128, K_ROLLBACK=129, K_ROW=130, 
		K_SAVEPOINT=131, K_SELECT=132, K_SET=133, K_TABLE=134, K_TEMP=135, K_TEMPORARY=136, 
		K_THEN=137, K_TO=138, K_TRANSACTION=139, K_TRIGGER=140, K_UNION=141, K_UNIQUE=142, 
		K_UPDATE=143, K_USING=144, K_VACUUM=145, K_VALUES=146, K_VIEW=147, K_VIRTUAL=148, 
		K_WHEN=149, K_WHERE=150, K_WITH=151, K_WITHOUT=152, IDENTIFIER=153, NUMERIC_LITERAL=154, 
		BIND_PARAMETER=155, STRING_LITERAL=156, BLOB_LITERAL=157, SINGLE_LINE_COMMENT=158, 
		MULTILINE_COMMENT=159, SPACES=160, UNEXPECTED_CHAR=161;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_alter_table_add_constraint = 5, RULE_alter_table_add = 6, 
		RULE_analyze_stmt = 7, RULE_attach_stmt = 8, RULE_begin_stmt = 9, RULE_commit_stmt = 10, 
		RULE_compound_select_stmt = 11, RULE_create_index_stmt = 12, RULE_create_table_stmt = 13, 
		RULE_create_trigger_stmt = 14, RULE_create_view_stmt = 15, RULE_create_virtual_table_stmt = 16, 
		RULE_delete_stmt = 17, RULE_delete_stmt_limited = 18, RULE_detach_stmt = 19, 
		RULE_drop_index_stmt = 20, RULE_drop_table_stmt = 21, RULE_drop_trigger_stmt = 22, 
		RULE_drop_view_stmt = 23, RULE_factored_select_stmt = 24, RULE_insert_stmt = 25, 
		RULE_pragma_stmt = 26, RULE_reindex_stmt = 27, RULE_release_stmt = 28, 
		RULE_rollback_stmt = 29, RULE_savepoint_stmt = 30, RULE_simple_select_stmt = 31, 
		RULE_select_stmt = 32, RULE_select_or_values = 33, RULE_update_stmt = 34, 
		RULE_update_stmt_limited = 35, RULE_vacuum_stmt = 36, RULE_column_def = 37, 
		RULE_type_name = 38, RULE_column_constraint = 39, RULE_column_constraint_primary_key = 40, 
		RULE_column_constraint_foreign_key = 41, RULE_column_constraint_not_null = 42, 
		RULE_column_constraint_null = 43, RULE_column_default = 44, RULE_column_default_value = 45, 
		RULE_conflict_clause = 46, RULE_expr = 47, RULE_foreign_key_clause = 48, 
		RULE_fk_target_column_name = 49, RULE_raise_function = 50, RULE_indexed_column = 51, 
		RULE_table_constraint = 52, RULE_table_constraint_primary_key = 53, RULE_table_constraint_foreign_key = 54, 
		RULE_table_constraint_unique = 55, RULE_table_constraint_key = 56, RULE_fk_origin_column_name = 57, 
		RULE_with_clause = 58, RULE_qualified_table_name = 59, RULE_ordering_term = 60, 
		RULE_pragma_value = 61, RULE_common_table_expression = 62, RULE_result_column = 63, 
		RULE_table_or_subquery = 64, RULE_join_clause = 65, RULE_join_operator = 66, 
		RULE_join_constraint = 67, RULE_select_core = 68, RULE_compound_operator = 69, 
		RULE_cte_table_name = 70, RULE_signed_number = 71, RULE_literal_value = 72, 
		RULE_unary_operator = 73, RULE_error_message = 74, RULE_module_argument = 75, 
		RULE_column_alias = 76, RULE_keyword = 77, RULE_unknown = 78, RULE_name = 79, 
		RULE_function_name = 80, RULE_database_name = 81, RULE_source_table_name = 82, 
		RULE_table_name = 83, RULE_table_or_index_name = 84, RULE_new_table_name = 85, 
		RULE_column_name = 86, RULE_collation_name = 87, RULE_foreign_table = 88, 
		RULE_index_name = 89, RULE_trigger_name = 90, RULE_view_name = 91, RULE_module_name = 92, 
		RULE_pragma_name = 93, RULE_savepoint_name = 94, RULE_table_alias = 95, 
		RULE_transaction_name = 96, RULE_any_name = 97;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "alter_table_add_constraint", 
		"alter_table_add", "analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", 
		"compound_select_stmt", "create_index_stmt", "create_table_stmt", "create_trigger_stmt", 
		"create_view_stmt", "create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", 
		"detach_stmt", "drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", 
		"drop_view_stmt", "factored_select_stmt", "insert_stmt", "pragma_stmt", 
		"reindex_stmt", "release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
		"select_stmt", "select_or_values", "update_stmt", "update_stmt_limited", 
		"vacuum_stmt", "column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
		"column_constraint_foreign_key", "column_constraint_not_null", "column_constraint_null", 
		"column_default", "column_default_value", "conflict_clause", "expr", "foreign_key_clause", 
		"fk_target_column_name", "raise_function", "indexed_column", "table_constraint", 
		"table_constraint_primary_key", "table_constraint_foreign_key", "table_constraint_unique", 
		"table_constraint_key", "fk_origin_column_name", "with_clause", "qualified_table_name", 
		"ordering_term", "pragma_value", "common_table_expression", "result_column", 
		"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
		"select_core", "compound_operator", "cte_table_name", "signed_number", 
		"literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "unknown", "name", "function_name", "database_name", 
		"source_table_name", "table_name", "table_or_index_name", "new_table_name", 
		"column_name", "collation_name", "foreign_table", "index_name", "trigger_name", 
		"view_name", "module_name", "pragma_name", "savepoint_name", "table_alias", 
		"transaction_name", "any_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'::'", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", 
		"'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", 
		"STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", 
		"AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", 
		"K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", 
		"K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
		"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
		"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
		"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
		"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
		"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ENABLE", "K_ESCAPE", 
		"K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", 
		"K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", 
		"K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
		"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
		"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
		"K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", 
		"K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", 
		"K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", "K_REGEXP", 
		"K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", 
		"K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", 
		"K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", 
		"K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", 
		"K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "IDENTIFIER", 
		"NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", 
		"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DROP - 64)) | (1L << (K_END - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_REPLACE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (K_ROLLBACK - 129)) | (1L << (K_SAVEPOINT - 129)) | (1L << (K_SELECT - 129)) | (1L << (K_UPDATE - 129)) | (1L << (K_VACUUM - 129)) | (1L << (K_VALUES - 129)) | (1L << (K_WITH - 129)) | (1L << (UNEXPECTED_CHAR - 129)))) != 0)) {
				{
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(196);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(197);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SqlParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(208);
				match(SCOL);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			sql_stmt();
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(215);
						match(SCOL);
						}
						}
						setState(218); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(220);
					sql_stmt();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					match(SCOL);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(232);
				match(K_EXPLAIN);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(233);
					match(K_QUERY);
					setState(234);
					match(K_PLAN);
					}
				}

				}
			}

			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(239);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(240);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(241);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(242);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(243);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(244);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(245);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(246);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(247);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(248);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(249);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(250);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(251);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(252);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(253);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(254);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(255);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(256);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(257);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(258);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(259);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(260);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(261);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(262);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(263);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(264);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(265);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(266);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(267);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(268);
				vacuum_stmt();
				}
				break;
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode K_ONLY() { return getToken(SqlParser.K_ONLY, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(K_ALTER);
			setState(272);
			match(K_TABLE);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ONLY) {
				{
				setState(273);
				match(K_ONLY);
				}
			}

			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(276);
				database_name();
				setState(277);
				match(DOT);
				}
				break;
			}
			setState(281);
			source_table_name();
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(282);
				match(K_RENAME);
				setState(283);
				match(K_TO);
				setState(284);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(285);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(286);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(287);
				match(K_ADD);
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(288);
					match(K_COLUMN);
					}
					break;
				}
				setState(291);
				column_def();
				}
				break;
			}
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(294);
				match(K_ENABLE);
				}
				break;
			}
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(297);
				unknown();
				}
				break;
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

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(K_ADD);
			setState(301);
			match(K_CONSTRAINT);
			setState(302);
			any_name();
			setState(303);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(K_ADD);
			setState(306);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
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
			setState(308);
			match(K_ANALYZE);
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(309);
				database_name();
				}
				break;
			case 2:
				{
				setState(310);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(311);
				database_name();
				setState(312);
				match(DOT);
				setState(313);
				table_or_index_name();
				}
				break;
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

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(K_ATTACH);
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(318);
				match(K_DATABASE);
				}
				break;
			}
			setState(321);
			expr(0);
			setState(322);
			match(K_AS);
			setState(323);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(K_BEGIN);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (K_DEFERRED - 59)) | (1L << (K_EXCLUSIVE - 59)) | (1L << (K_IMMEDIATE - 59)))) != 0)) {
				{
				setState(326);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (K_DEFERRED - 59)) | (1L << (K_EXCLUSIVE - 59)) | (1L << (K_IMMEDIATE - 59)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(329);
				match(K_TRANSACTION);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(330);
					transaction_name();
					}
					break;
				}
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

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(336);
				match(K_TRANSACTION);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(337);
					transaction_name();
					}
					break;
				}
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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SqlParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SqlParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SqlParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SqlParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SqlParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SqlParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SqlParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SqlParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(342);
				match(K_WITH);
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(343);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(346);
				common_table_expression();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(347);
					match(COMMA);
					setState(348);
					common_table_expression();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(356);
			select_core();
			setState(366); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(363);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(357);
					match(K_UNION);
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(358);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(361);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(362);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365);
				select_core();
				}
				}
				setState(368); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(370);
				match(K_ORDER);
				setState(371);
				match(K_BY);
				setState(372);
				ordering_term();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(373);
					match(COMMA);
					setState(374);
					ordering_term();
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(382);
				match(K_LIMIT);
				setState(383);
				expr(0);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(384);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(385);
					expr(0);
					}
				}

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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(K_CREATE);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(391);
				match(K_UNIQUE);
				}
			}

			setState(394);
			match(K_INDEX);
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(395);
				match(K_IF);
				setState(396);
				match(K_NOT);
				setState(397);
				match(K_EXISTS);
				}
				break;
			}
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(400);
				database_name();
				setState(401);
				match(DOT);
				}
				break;
			}
			setState(405);
			index_name();
			setState(406);
			match(K_ON);
			setState(407);
			table_name();
			setState(408);
			match(OPEN_PAR);
			setState(409);
			indexed_column();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(410);
				match(COMMA);
				setState(411);
				indexed_column();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(CLOSE_PAR);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(418);
				match(K_WHERE);
				setState(419);
				expr(0);
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(K_CREATE);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(423);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(426);
			match(K_TABLE);
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(427);
				match(K_IF);
				setState(428);
				match(K_NOT);
				setState(429);
				match(K_EXISTS);
				}
				break;
			}
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(432);
				database_name();
				setState(433);
				match(DOT);
				}
				break;
			}
			setState(437);
			table_name();
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(438);
				match(OPEN_PAR);
				setState(439);
				column_def();
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(444);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(440);
						match(COMMA);
						setState(441);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(442);
						match(COMMA);
						setState(443);
						column_def();
						}
						break;
					}
					}
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(449);
				match(CLOSE_PAR);
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(450);
					match(K_WITHOUT);
					setState(451);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case K_AS:
				{
				setState(454);
				match(K_AS);
				setState(455);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(458);
				unknown();
				}
				break;
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

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SqlParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SqlParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(K_CREATE);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(465);
			match(K_TRIGGER);
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(466);
				match(K_IF);
				setState(467);
				match(K_NOT);
				setState(468);
				match(K_EXISTS);
				}
				break;
			}
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(471);
				database_name();
				setState(472);
				match(DOT);
				}
				break;
			}
			setState(476);
			trigger_name();
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(477);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(478);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(479);
				match(K_INSTEAD);
				setState(480);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(483);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(484);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(485);
				match(K_UPDATE);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(486);
					match(K_OF);
					setState(487);
					column_name();
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(488);
						match(COMMA);
						setState(489);
						column_name();
						}
						}
						setState(494);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(499);
			match(K_ON);
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(500);
				database_name();
				setState(501);
				match(DOT);
				}
				break;
			}
			setState(505);
			table_name();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(506);
				match(K_FOR);
				setState(507);
				match(K_EACH);
				setState(508);
				match(K_ROW);
				}
			}

			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(511);
				match(K_WHEN);
				setState(512);
				expr(0);
				}
			}

			setState(515);
			match(K_BEGIN);
			setState(524); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(516);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(517);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(518);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(519);
					select_stmt();
					}
					break;
				}
				setState(522);
				match(SCOL);
				}
				}
				setState(526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (K_INSERT - 90)) | (1L << (K_REPLACE - 90)) | (1L << (K_SELECT - 90)) | (1L << (K_UPDATE - 90)) | (1L << (K_VALUES - 90)) | (1L << (K_WITH - 90)))) != 0) );
			setState(528);
			match(K_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(K_CREATE);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(534);
			match(K_VIEW);
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(535);
				match(K_IF);
				setState(536);
				match(K_NOT);
				setState(537);
				match(K_EXISTS);
				}
				break;
			}
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(540);
				database_name();
				setState(541);
				match(DOT);
				}
				break;
			}
			setState(545);
			view_name();
			setState(546);
			match(K_AS);
			setState(547);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(K_CREATE);
			setState(550);
			match(K_VIRTUAL);
			setState(551);
			match(K_TABLE);
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(552);
				match(K_IF);
				setState(553);
				match(K_NOT);
				setState(554);
				match(K_EXISTS);
				}
				break;
			}
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(557);
				database_name();
				setState(558);
				match(DOT);
				}
				break;
			}
			setState(562);
			table_name();
			setState(563);
			match(K_USING);
			setState(564);
			module_name();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(565);
				match(OPEN_PAR);
				setState(566);
				module_argument();
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(567);
					match(COMMA);
					setState(568);
					module_argument();
					}
					}
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(574);
				match(CLOSE_PAR);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(578);
				with_clause();
				}
			}

			setState(581);
			match(K_DELETE);
			setState(582);
			match(K_FROM);
			setState(583);
			qualified_table_name();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(584);
				match(K_WHERE);
				setState(585);
				expr(0);
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

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(588);
				with_clause();
				}
			}

			setState(591);
			match(K_DELETE);
			setState(592);
			match(K_FROM);
			setState(593);
			qualified_table_name();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(594);
				match(K_WHERE);
				setState(595);
				expr(0);
				}
			}

			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(598);
					match(K_ORDER);
					setState(599);
					match(K_BY);
					setState(600);
					ordering_term();
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(601);
						match(COMMA);
						setState(602);
						ordering_term();
						}
						}
						setState(607);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(610);
				match(K_LIMIT);
				setState(611);
				expr(0);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(612);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(613);
					expr(0);
					}
				}

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

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(K_DETACH);
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(619);
				match(K_DATABASE);
				}
				break;
			}
			setState(622);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(K_DROP);
			setState(625);
			match(K_INDEX);
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(626);
				match(K_IF);
				setState(627);
				match(K_EXISTS);
				}
				break;
			}
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(630);
				database_name();
				setState(631);
				match(DOT);
				}
				break;
			}
			setState(635);
			index_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(K_DROP);
			setState(638);
			match(K_TABLE);
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(639);
				match(K_IF);
				setState(640);
				match(K_EXISTS);
				}
				break;
			}
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(643);
				database_name();
				setState(644);
				match(DOT);
				}
				break;
			}
			setState(648);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(K_DROP);
			setState(651);
			match(K_TRIGGER);
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(652);
				match(K_IF);
				setState(653);
				match(K_EXISTS);
				}
				break;
			}
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(656);
				database_name();
				setState(657);
				match(DOT);
				}
				break;
			}
			setState(661);
			trigger_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(K_DROP);
			setState(664);
			match(K_VIEW);
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(665);
				match(K_IF);
				setState(666);
				match(K_EXISTS);
				}
				break;
			}
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(669);
				database_name();
				setState(670);
				match(DOT);
				}
				break;
			}
			setState(674);
			view_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(676);
				match(K_WITH);
				setState(678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(677);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(680);
				common_table_expression();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(681);
					match(COMMA);
					setState(682);
					common_table_expression();
					}
					}
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(690);
			select_core();
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(691);
				compound_operator();
				setState(692);
				select_core();
				}
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(699);
				match(K_ORDER);
				setState(700);
				match(K_BY);
				setState(701);
				ordering_term();
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(702);
					match(COMMA);
					setState(703);
					ordering_term();
					}
					}
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(711);
				match(K_LIMIT);
				setState(712);
				expr(0);
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(713);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(714);
					expr(0);
					}
				}

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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(719);
				with_clause();
				}
			}

			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(722);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(723);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(724);
				match(K_INSERT);
				setState(725);
				match(K_OR);
				setState(726);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(727);
				match(K_INSERT);
				setState(728);
				match(K_OR);
				setState(729);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(730);
				match(K_INSERT);
				setState(731);
				match(K_OR);
				setState(732);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(733);
				match(K_INSERT);
				setState(734);
				match(K_OR);
				setState(735);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(736);
				match(K_INSERT);
				setState(737);
				match(K_OR);
				setState(738);
				match(K_IGNORE);
				}
				break;
			}
			setState(741);
			match(K_INTO);
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(742);
				database_name();
				setState(743);
				match(DOT);
				}
				break;
			}
			setState(747);
			table_name();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(748);
				match(OPEN_PAR);
				setState(749);
				column_name();
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(750);
					match(COMMA);
					setState(751);
					column_name();
					}
					}
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(757);
				match(CLOSE_PAR);
				}
			}

			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(761);
				match(K_VALUES);
				setState(762);
				match(OPEN_PAR);
				setState(763);
				expr(0);
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(764);
					match(COMMA);
					setState(765);
					expr(0);
					}
					}
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(771);
				match(CLOSE_PAR);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(772);
					match(COMMA);
					setState(773);
					match(OPEN_PAR);
					setState(774);
					expr(0);
					setState(779);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(775);
						match(COMMA);
						setState(776);
						expr(0);
						}
						}
						setState(781);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(782);
					match(CLOSE_PAR);
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(789);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(790);
				match(K_DEFAULT);
				setState(791);
				match(K_VALUES);
				}
				break;
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

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(K_PRAGMA);
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(795);
				database_name();
				setState(796);
				match(DOT);
				}
				break;
			}
			setState(800);
			pragma_name();
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(801);
				match(ASSIGN);
				setState(802);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(803);
				match(OPEN_PAR);
				setState(804);
				pragma_value();
				setState(805);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(K_REINDEX);
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(810);
				collation_name();
				}
				break;
			case 2:
				{
				setState(814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(811);
					database_name();
					setState(812);
					match(DOT);
					}
					break;
				}
				setState(818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(816);
					table_name();
					}
					break;
				case 2:
					{
					setState(817);
					index_name();
					}
					break;
				}
				}
				break;
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

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(K_RELEASE);
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(823);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(826);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(K_ROLLBACK);
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(829);
				match(K_TRANSACTION);
				setState(831);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(830);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(835);
				match(K_TO);
				setState(837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(836);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(839);
				savepoint_name();
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

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(K_SAVEPOINT);
			setState(843);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(845);
				match(K_WITH);
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(846);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(849);
				common_table_expression();
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(850);
					match(COMMA);
					setState(851);
					common_table_expression();
					}
					}
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(859);
			select_core();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(860);
				match(K_ORDER);
				setState(861);
				match(K_BY);
				setState(862);
				ordering_term();
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(863);
					match(COMMA);
					setState(864);
					ordering_term();
					}
					}
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(872);
				match(K_LIMIT);
				setState(873);
				expr(0);
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(874);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(875);
					expr(0);
					}
				}

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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(880);
				match(K_WITH);
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(881);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(884);
				common_table_expression();
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(885);
					match(COMMA);
					setState(886);
					common_table_expression();
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(894);
			select_or_values();
			setState(900);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(895);
					compound_operator();
					setState(896);
					select_or_values();
					}
					} 
				}
				setState(902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(903);
				match(K_ORDER);
				setState(904);
				match(K_BY);
				setState(905);
				ordering_term();
				setState(910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(906);
						match(COMMA);
						setState(907);
						ordering_term();
						}
						} 
					}
					setState(912);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			}
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(915);
				match(K_LIMIT);
				setState(916);
				expr(0);
				setState(919);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(917);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(918);
					expr(0);
					}
					break;
				}
				}
				break;
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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(997);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				match(K_SELECT);
				setState(925);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(924);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
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
				setState(927);
				result_column();
				setState(932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(928);
						match(COMMA);
						setState(929);
						result_column();
						}
						} 
					}
					setState(934);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				setState(947);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(935);
					match(K_FROM);
					setState(945);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(936);
						table_or_subquery();
						setState(941);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(937);
								match(COMMA);
								setState(938);
								table_or_subquery();
								}
								} 
							}
							setState(943);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(944);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(949);
					match(K_WHERE);
					setState(950);
					expr(0);
					}
					break;
				}
				setState(967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(953);
					match(K_GROUP);
					setState(954);
					match(K_BY);
					setState(955);
					expr(0);
					setState(960);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(956);
							match(COMMA);
							setState(957);
							expr(0);
							}
							} 
						}
						setState(962);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					}
					setState(965);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						setState(963);
						match(K_HAVING);
						setState(964);
						expr(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				match(K_VALUES);
				setState(970);
				match(OPEN_PAR);
				setState(971);
				expr(0);
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(972);
					match(COMMA);
					setState(973);
					expr(0);
					}
					}
					setState(978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(979);
				match(CLOSE_PAR);
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(980);
						match(COMMA);
						setState(981);
						match(OPEN_PAR);
						setState(982);
						expr(0);
						setState(987);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(983);
							match(COMMA);
							setState(984);
							expr(0);
							}
							}
							setState(989);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(990);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(996);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(999);
				with_clause();
				}
			}

			setState(1002);
			match(K_UPDATE);
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1003);
				match(K_OR);
				setState(1004);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1005);
				match(K_OR);
				setState(1006);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1007);
				match(K_OR);
				setState(1008);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1009);
				match(K_OR);
				setState(1010);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1011);
				match(K_OR);
				setState(1012);
				match(K_IGNORE);
				}
				break;
			}
			setState(1015);
			qualified_table_name();
			setState(1016);
			match(K_SET);
			setState(1017);
			column_name();
			setState(1018);
			match(ASSIGN);
			setState(1019);
			expr(0);
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1020);
				match(COMMA);
				setState(1021);
				column_name();
				setState(1022);
				match(ASSIGN);
				setState(1023);
				expr(0);
				}
				}
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1030);
				match(K_WHERE);
				setState(1031);
				expr(0);
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

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1034);
				with_clause();
				}
			}

			setState(1037);
			match(K_UPDATE);
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1038);
				match(K_OR);
				setState(1039);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1040);
				match(K_OR);
				setState(1041);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1042);
				match(K_OR);
				setState(1043);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1044);
				match(K_OR);
				setState(1045);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1046);
				match(K_OR);
				setState(1047);
				match(K_IGNORE);
				}
				break;
			}
			setState(1050);
			qualified_table_name();
			setState(1051);
			match(K_SET);
			setState(1052);
			column_name();
			setState(1053);
			match(ASSIGN);
			setState(1054);
			expr(0);
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1055);
				match(COMMA);
				setState(1056);
				column_name();
				setState(1057);
				match(ASSIGN);
				setState(1058);
				expr(0);
				}
				}
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1065);
				match(K_WHERE);
				setState(1066);
				expr(0);
				}
			}

			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1069);
					match(K_ORDER);
					setState(1070);
					match(K_BY);
					setState(1071);
					ordering_term();
					setState(1076);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1072);
						match(COMMA);
						setState(1073);
						ordering_term();
						}
						}
						setState(1078);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1081);
				match(K_LIMIT);
				setState(1082);
				expr(0);
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1083);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1084);
					expr(0);
					}
				}

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

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(K_VACUUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			column_name();
			setState(1096);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1094);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						setState(1092);
						column_constraint();
						}
						break;
					case 2:
						{
						setState(1093);
						type_name();
						}
						break;
					}
					} 
				}
				setState(1098);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			name();
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1100);
				match(OPEN_PAR);
				setState(1101);
				signed_number();
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH) | (1L << K_DISTINCT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(1102);
					any_name();
					}
				}

				setState(1105);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1107);
				match(OPEN_PAR);
				setState(1108);
				signed_number();
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH) | (1L << K_DISTINCT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(1109);
					any_name();
					}
				}

				setState(1112);
				match(COMMA);
				setState(1113);
				signed_number();
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH) | (1L << K_DISTINCT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(1114);
					any_name();
					}
				}

				setState(1117);
				match(CLOSE_PAR);
				}
				break;
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

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1121);
				match(K_CONSTRAINT);
				setState(1122);
				name();
				}
			}

			setState(1139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1125);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1126);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1127);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1128);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(1129);
				match(K_UNIQUE);
				setState(1130);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1131);
				match(K_CHECK);
				setState(1132);
				match(OPEN_PAR);
				setState(1133);
				expr(0);
				setState(1134);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1136);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1137);
				match(K_COLLATE);
				setState(1138);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			match(K_PRIMARY);
			setState(1142);
			match(K_KEY);
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1143);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
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
			setState(1146);
			conflict_clause();
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1147);
				match(K_AUTOINCREMENT);
				}
				break;
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

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(K_NOT);
			setState(1153);
			match(K_NULL);
			setState(1154);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(K_NULL);
			setState(1157);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_column_default);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(K_DEFAULT);
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1160);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1161);
				match(OPEN_PAR);
				setState(1162);
				expr(0);
				setState(1163);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1165);
				match(K_NEXTVAL);
				setState(1166);
				match(OPEN_PAR);
				setState(1167);
				expr(0);
				setState(1168);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1170);
				any_name();
				}
				break;
			}
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1173);
				match(T__0);
				setState(1175); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1174);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1177); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1181);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1182);
				literal_value();
				}
				break;
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1185);
				match(K_ON);
				setState(1186);
				match(K_CONFLICT);
				setState(1187);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_FAIL - 74)) | (1L << (K_IGNORE - 74)) | (1L << (K_REPLACE - 74)) | (1L << (K_ROLLBACK - 74)))) != 0)) ) {
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
		}
		catch (RecognitionException re) {
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
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SqlParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
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
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SqlParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SqlParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SqlParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SqlParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1191);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1192);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						setState(1193);
						database_name();
						setState(1194);
						match(DOT);
						}
						break;
					}
					setState(1198);
					table_name();
					setState(1199);
					match(DOT);
					}
					break;
				}
				setState(1203);
				column_name();
				}
				break;
			case 4:
				{
				setState(1204);
				unary_operator();
				setState(1205);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1207);
				function_name();
				setState(1208);
				match(OPEN_PAR);
				setState(1221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
					case 1:
						{
						setState(1209);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1212);
					expr(0);
					setState(1217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1213);
						match(COMMA);
						setState(1214);
						expr(0);
						}
						}
						setState(1219);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1220);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1223);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1225);
				match(OPEN_PAR);
				setState(1226);
				expr(0);
				setState(1227);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1229);
				match(K_CAST);
				setState(1230);
				match(OPEN_PAR);
				setState(1231);
				expr(0);
				setState(1232);
				match(K_AS);
				setState(1233);
				type_name();
				setState(1234);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1236);
						match(K_NOT);
						}
					}

					setState(1239);
					match(K_EXISTS);
					}
				}

				setState(1242);
				match(OPEN_PAR);
				setState(1243);
				select_stmt();
				setState(1244);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1246);
				match(K_CASE);
				setState(1248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1247);
					expr(0);
					}
					break;
				}
				setState(1255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1250);
					match(K_WHEN);
					setState(1251);
					expr(0);
					setState(1252);
					match(K_THEN);
					setState(1253);
					expr(0);
					}
					}
					setState(1257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1259);
					match(K_ELSE);
					setState(1260);
					expr(0);
					}
				}

				setState(1263);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1265);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1268);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1269);
						match(PIPE2);
						setState(1270);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1271);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1272);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1273);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1274);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1275);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1276);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1277);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1278);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1279);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1280);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1281);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1282);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1283);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1296);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
						case 1:
							{
							setState(1284);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1285);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1286);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1287);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1288);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1289);
							match(K_IS);
							setState(1290);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1291);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1292);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1293);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1294);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1295);
							match(K_REGEXP);
							}
							break;
						}
						setState(1298);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1299);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1300);
						match(K_AND);
						setState(1301);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1302);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1303);
						match(K_OR);
						setState(1304);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1305);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1306);
						match(K_IS);
						setState(1308);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
						case 1:
							{
							setState(1307);
							match(K_NOT);
							}
							break;
						}
						setState(1310);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1311);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1313);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1312);
							match(K_NOT);
							}
						}

						setState(1315);
						match(K_BETWEEN);
						setState(1316);
						expr(0);
						setState(1317);
						match(K_AND);
						setState(1318);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1320);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1321);
						match(K_COLLATE);
						setState(1322);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1323);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1325);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1324);
							match(K_NOT);
							}
						}

						setState(1327);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_GLOB - 79)) | (1L << (K_LIKE - 79)) | (1L << (K_MATCH - 79)) | (1L << (K_REGEXP - 79)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1328);
						expr(0);
						setState(1331);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
						case 1:
							{
							setState(1329);
							match(K_ESCAPE);
							setState(1330);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1333);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1338);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1334);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1335);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1336);
							match(K_NOT);
							setState(1337);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1340);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1342);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1341);
							match(K_NOT);
							}
						}

						setState(1344);
						match(K_IN);
						setState(1364);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
						case 1:
							{
							setState(1345);
							match(OPEN_PAR);
							setState(1355);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
							case 1:
								{
								setState(1346);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1347);
								expr(0);
								setState(1352);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1348);
									match(COMMA);
									setState(1349);
									expr(0);
									}
									}
									setState(1354);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1357);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1361);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
							case 1:
								{
								setState(1358);
								database_name();
								setState(1359);
								match(DOT);
								}
								break;
							}
							setState(1363);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
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

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SqlParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SqlParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SqlParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SqlParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SqlParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SqlParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SqlParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SqlParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SqlParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SqlParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SqlParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SqlParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SqlParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SqlParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SqlParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SqlParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SqlParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SqlParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SqlParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SqlParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SqlParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SqlParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_foreign_key_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(K_REFERENCES);
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1372);
				database_name();
				setState(1373);
				match(DOT);
				}
				break;
			}
			setState(1377);
			foreign_table();
			setState(1389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1378);
				match(OPEN_PAR);
				setState(1379);
				fk_target_column_name();
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1380);
					match(COMMA);
					setState(1381);
					fk_target_column_name();
					}
					}
					setState(1386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1387);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_ON:
						{
						setState(1391);
						match(K_ON);
						setState(1392);
						_la = _input.LA(1);
						if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1401);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
						case 1:
							{
							setState(1393);
							match(K_SET);
							setState(1394);
							match(K_NULL);
							}
							break;
						case 2:
							{
							setState(1395);
							match(K_SET);
							setState(1396);
							match(K_DEFAULT);
							}
							break;
						case 3:
							{
							setState(1397);
							match(K_CASCADE);
							}
							break;
						case 4:
							{
							setState(1398);
							match(K_RESTRICT);
							}
							break;
						case 5:
							{
							setState(1399);
							match(K_NO);
							setState(1400);
							match(K_ACTION);
							}
							break;
						}
						}
						break;
					case K_MATCH:
						{
						setState(1403);
						match(K_MATCH);
						setState(1404);
						name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1412);
					match(K_NOT);
					}
				}

				setState(1415);
				match(K_DEFERRABLE);
				setState(1420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1416);
					match(K_INITIALLY);
					setState(1417);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1418);
					match(K_INITIALLY);
					setState(1419);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1422);
					match(K_ENABLE);
					}
					break;
				}
				}
				break;
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

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(K_RAISE);
			setState(1430);
			match(OPEN_PAR);
			setState(1435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1431);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1432);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1433);
				match(COMMA);
				setState(1434);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1437);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			column_name();
			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1440);
				match(K_COLLATE);
				setState(1441);
				collation_name();
				}
			}

			setState(1445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1444);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
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
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1447);
				match(K_CONSTRAINT);
				setState(1448);
				name();
				}
			}

			setState(1460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1451);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1452);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1453);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1454);
				match(K_CHECK);
				setState(1455);
				match(OPEN_PAR);
				setState(1456);
				expr(0);
				setState(1457);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1459);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			match(K_PRIMARY);
			setState(1463);
			match(K_KEY);
			setState(1464);
			match(OPEN_PAR);
			setState(1465);
			indexed_column();
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1466);
				match(COMMA);
				setState(1467);
				indexed_column();
				}
				}
				setState(1472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1473);
			match(CLOSE_PAR);
			setState(1474);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(K_FOREIGN);
			setState(1477);
			match(K_KEY);
			setState(1478);
			match(OPEN_PAR);
			setState(1479);
			fk_origin_column_name();
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1480);
				match(COMMA);
				setState(1481);
				fk_origin_column_name();
				}
				}
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1487);
			match(CLOSE_PAR);
			setState(1488);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			match(K_UNIQUE);
			setState(1492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1491);
				match(K_KEY);
				}
				break;
			}
			setState(1495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1494);
				name();
				}
				break;
			}
			setState(1497);
			match(OPEN_PAR);
			setState(1498);
			indexed_column();
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1499);
				match(COMMA);
				setState(1500);
				indexed_column();
				}
				}
				setState(1505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1506);
			match(CLOSE_PAR);
			setState(1507);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(K_KEY);
			setState(1511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1510);
				name();
				}
				break;
			}
			setState(1513);
			match(OPEN_PAR);
			setState(1514);
			indexed_column();
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1515);
				match(COMMA);
				setState(1516);
				indexed_column();
				}
				}
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1522);
			match(CLOSE_PAR);
			setState(1523);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SqlParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SqlParser.K_AS, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			match(K_WITH);
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1528);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1531);
			cte_table_name();
			setState(1532);
			match(K_AS);
			setState(1533);
			match(OPEN_PAR);
			setState(1534);
			select_stmt();
			setState(1535);
			match(CLOSE_PAR);
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1536);
				match(COMMA);
				setState(1537);
				cte_table_name();
				setState(1538);
				match(K_AS);
				setState(1539);
				match(OPEN_PAR);
				setState(1540);
				select_stmt();
				setState(1541);
				match(CLOSE_PAR);
				}
				}
				setState(1547);
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1548);
				database_name();
				setState(1549);
				match(DOT);
				}
				break;
			}
			setState(1553);
			table_name();
			setState(1559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1554);
				match(K_INDEXED);
				setState(1555);
				match(K_BY);
				setState(1556);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1557);
				match(K_NOT);
				setState(1558);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			expr(0);
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1562);
				match(K_COLLATE);
				setState(1563);
				collation_name();
				}
				break;
			}
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1566);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pragma_value);
		try {
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1570);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1571);
				match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			table_name();
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1575);
				match(OPEN_PAR);
				setState(1576);
				column_name();
				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1577);
					match(COMMA);
					setState(1578);
					column_name();
					}
					}
					setState(1583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1584);
				match(CLOSE_PAR);
				}
			}

			setState(1588);
			match(K_AS);
			setState(1589);
			match(OPEN_PAR);
			setState(1590);
			select_stmt();
			setState(1591);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_result_column);
		int _la;
		try {
			setState(1605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1594);
				table_name();
				setState(1595);
				match(DOT);
				setState(1596);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1598);
				expr(0);
				setState(1603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1600);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1599);
						match(K_AS);
						}
					}

					setState(1602);
					column_alias();
					}
					break;
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_table_or_subquery);
		int _la;
		try {
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1607);
					database_name();
					setState(1608);
					match(DOT);
					}
					break;
				}
				setState(1612);
				table_name();
				setState(1617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1614);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
					case 1:
						{
						setState(1613);
						match(K_AS);
						}
						break;
					}
					setState(1616);
					table_alias();
					}
					break;
				}
				setState(1624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1619);
					match(K_INDEXED);
					setState(1620);
					match(K_BY);
					setState(1621);
					index_name();
					}
					break;
				case 2:
					{
					setState(1622);
					match(K_NOT);
					setState(1623);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1626);
				match(OPEN_PAR);
				setState(1636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1627);
					table_or_subquery();
					setState(1632);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1628);
						match(COMMA);
						setState(1629);
						table_or_subquery();
						}
						}
						setState(1634);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1635);
					join_clause();
					}
					break;
				}
				setState(1638);
				match(CLOSE_PAR);
				setState(1643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1640);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
					case 1:
						{
						setState(1639);
						match(K_AS);
						}
						break;
					}
					setState(1642);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
				match(OPEN_PAR);
				setState(1646);
				select_stmt();
				setState(1647);
				match(CLOSE_PAR);
				setState(1652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1649);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
					case 1:
						{
						setState(1648);
						match(K_AS);
						}
						break;
					}
					setState(1651);
					table_alias();
					}
					break;
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			table_or_subquery();
			setState(1663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1657);
					join_operator();
					setState(1658);
					table_or_subquery();
					setState(1659);
					join_constraint();
					}
					} 
				}
				setState(1665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_join_operator);
		int _la;
		try {
			setState(1679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1667);
					match(K_NATURAL);
					}
				}

				setState(1676);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1670);
					match(K_LEFT);
					setState(1672);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1671);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1674);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1675);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1678);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1681);
				match(K_ON);
				setState(1682);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1683);
				match(K_USING);
				setState(1684);
				match(OPEN_PAR);
				setState(1685);
				column_name();
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1686);
					match(COMMA);
					setState(1687);
					column_name();
					}
					}
					setState(1692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1693);
				match(CLOSE_PAR);
				}
				break;
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_select_core);
		int _la;
		try {
			setState(1771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697);
				match(K_SELECT);
				setState(1699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1698);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
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
				setState(1701);
				result_column();
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1702);
					match(COMMA);
					setState(1703);
					result_column();
					}
					}
					setState(1708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1709);
					match(K_FROM);
					setState(1719);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
					case 1:
						{
						setState(1710);
						table_or_subquery();
						setState(1715);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1711);
							match(COMMA);
							setState(1712);
							table_or_subquery();
							}
							}
							setState(1717);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1718);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1723);
					match(K_WHERE);
					setState(1724);
					expr(0);
					}
				}

				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1727);
					match(K_GROUP);
					setState(1728);
					match(K_BY);
					setState(1729);
					expr(0);
					setState(1734);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1730);
						match(COMMA);
						setState(1731);
						expr(0);
						}
						}
						setState(1736);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1739);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1737);
						match(K_HAVING);
						setState(1738);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1743);
				match(K_VALUES);
				setState(1744);
				match(OPEN_PAR);
				setState(1745);
				expr(0);
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1746);
					match(COMMA);
					setState(1747);
					expr(0);
					}
					}
					setState(1752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1753);
				match(CLOSE_PAR);
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1754);
					match(COMMA);
					setState(1755);
					match(OPEN_PAR);
					setState(1756);
					expr(0);
					setState(1761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1757);
						match(COMMA);
						setState(1758);
						expr(0);
						}
						}
						setState(1763);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1764);
					match(CLOSE_PAR);
					}
					}
					setState(1770);
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_compound_operator);
		try {
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				match(K_UNION);
				setState(1775);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1776);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1777);
				match(K_EXCEPT);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			table_name();
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1781);
				match(OPEN_PAR);
				setState(1782);
				column_name();
				setState(1787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1783);
					match(COMMA);
					setState(1784);
					column_name();
					}
					}
					setState(1789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1790);
				match(CLOSE_PAR);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1794);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1797);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1798);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SqlParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (K_NULL - 107)) | (1L << (NUMERIC_LITERAL - 107)) | (1L << (STRING_LITERAL - 107)) | (1L << (BLOB_LITERAL - 107)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_module_argument);
		try {
			setState(1809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1807);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1808);
				column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SqlParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SqlParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SqlParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SqlParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SqlParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SqlParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SqlParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SqlParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (K_ABORT - 26)) | (1L << (K_ACTION - 26)) | (1L << (K_ADD - 26)) | (1L << (K_AFTER - 26)) | (1L << (K_ALL - 26)) | (1L << (K_ALTER - 26)) | (1L << (K_ANALYZE - 26)) | (1L << (K_AND - 26)) | (1L << (K_AS - 26)) | (1L << (K_ASC - 26)) | (1L << (K_ATTACH - 26)) | (1L << (K_AUTOINCREMENT - 26)) | (1L << (K_BEFORE - 26)) | (1L << (K_BEGIN - 26)) | (1L << (K_BETWEEN - 26)) | (1L << (K_BY - 26)) | (1L << (K_CASCADE - 26)) | (1L << (K_CASE - 26)) | (1L << (K_CAST - 26)) | (1L << (K_CHECK - 26)) | (1L << (K_COLLATE - 26)) | (1L << (K_COLUMN - 26)) | (1L << (K_COMMIT - 26)) | (1L << (K_CONFLICT - 26)) | (1L << (K_CONSTRAINT - 26)) | (1L << (K_CREATE - 26)) | (1L << (K_CROSS - 26)) | (1L << (K_CURRENT_DATE - 26)) | (1L << (K_CURRENT_TIME - 26)) | (1L << (K_CURRENT_TIMESTAMP - 26)) | (1L << (K_DATABASE - 26)) | (1L << (K_DEFAULT - 26)) | (1L << (K_DEFERRABLE - 26)) | (1L << (K_DEFERRED - 26)) | (1L << (K_DELETE - 26)) | (1L << (K_DESC - 26)) | (1L << (K_DETACH - 26)) | (1L << (K_DISTINCT - 26)) | (1L << (K_DROP - 26)) | (1L << (K_EACH - 26)) | (1L << (K_ELSE - 26)) | (1L << (K_END - 26)) | (1L << (K_ENABLE - 26)) | (1L << (K_ESCAPE - 26)) | (1L << (K_EXCEPT - 26)) | (1L << (K_EXCLUSIVE - 26)) | (1L << (K_EXISTS - 26)) | (1L << (K_EXPLAIN - 26)) | (1L << (K_FAIL - 26)) | (1L << (K_FOR - 26)) | (1L << (K_FOREIGN - 26)) | (1L << (K_FROM - 26)) | (1L << (K_FULL - 26)) | (1L << (K_GLOB - 26)) | (1L << (K_GROUP - 26)) | (1L << (K_HAVING - 26)) | (1L << (K_IF - 26)) | (1L << (K_IGNORE - 26)) | (1L << (K_IMMEDIATE - 26)) | (1L << (K_IN - 26)) | (1L << (K_INDEX - 26)) | (1L << (K_INDEXED - 26)) | (1L << (K_INITIALLY - 26)) | (1L << (K_INNER - 26)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (K_INSERT - 90)) | (1L << (K_INSTEAD - 90)) | (1L << (K_INTERSECT - 90)) | (1L << (K_INTO - 90)) | (1L << (K_IS - 90)) | (1L << (K_ISNULL - 90)) | (1L << (K_JOIN - 90)) | (1L << (K_KEY - 90)) | (1L << (K_LEFT - 90)) | (1L << (K_LIKE - 90)) | (1L << (K_LIMIT - 90)) | (1L << (K_MATCH - 90)) | (1L << (K_NATURAL - 90)) | (1L << (K_NEXTVAL - 90)) | (1L << (K_NO - 90)) | (1L << (K_NOT - 90)) | (1L << (K_NOTNULL - 90)) | (1L << (K_NULL - 90)) | (1L << (K_OF - 90)) | (1L << (K_OFFSET - 90)) | (1L << (K_ON - 90)) | (1L << (K_OR - 90)) | (1L << (K_ORDER - 90)) | (1L << (K_OUTER - 90)) | (1L << (K_PLAN - 90)) | (1L << (K_PRAGMA - 90)) | (1L << (K_PRIMARY - 90)) | (1L << (K_QUERY - 90)) | (1L << (K_RAISE - 90)) | (1L << (K_RECURSIVE - 90)) | (1L << (K_REFERENCES - 90)) | (1L << (K_REGEXP - 90)) | (1L << (K_REINDEX - 90)) | (1L << (K_RELEASE - 90)) | (1L << (K_RENAME - 90)) | (1L << (K_REPLACE - 90)) | (1L << (K_RESTRICT - 90)) | (1L << (K_RIGHT - 90)) | (1L << (K_ROLLBACK - 90)) | (1L << (K_ROW - 90)) | (1L << (K_SAVEPOINT - 90)) | (1L << (K_SELECT - 90)) | (1L << (K_SET - 90)) | (1L << (K_TABLE - 90)) | (1L << (K_TEMP - 90)) | (1L << (K_TEMPORARY - 90)) | (1L << (K_THEN - 90)) | (1L << (K_TO - 90)) | (1L << (K_TRANSACTION - 90)) | (1L << (K_TRIGGER - 90)) | (1L << (K_UNION - 90)) | (1L << (K_UNIQUE - 90)) | (1L << (K_UPDATE - 90)) | (1L << (K_USING - 90)) | (1L << (K_VACUUM - 90)) | (1L << (K_VALUES - 90)) | (1L << (K_VIEW - 90)) | (1L << (K_VIRTUAL - 90)) | (1L << (K_WHEN - 90)) | (1L << (K_WHERE - 90)) | (1L << (K_WITH - 90)) | (1L << (K_WITHOUT - 90)))) != 0)) ) {
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

	public static class UnknownContext extends ParserRuleContext {
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_unknown);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1816); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1815);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1818); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			any_name();
			}
		}
		catch (RecognitionException re) {
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			any_name();
			}
		}
		catch (RecognitionException re) {
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_any_name);
		try {
			setState(1863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1856);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1857);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1858);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1859);
				match(OPEN_PAR);
				setState(1860);
				any_name();
				setState(1861);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
		case 47:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a3\u074c\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\7\2\u00c9\n\2\f\2\16\2\u00cc\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\7\4\u00d4\n\4\f\4\16\4\u00d7\13\4\3\4\3\4\6\4\u00db"+
		"\n\4\r\4\16\4\u00dc\3\4\7\4\u00e0\n\4\f\4\16\4\u00e3\13\4\3\4\7\4\u00e6"+
		"\n\4\f\4\16\4\u00e9\13\4\3\5\3\5\3\5\5\5\u00ee\n\5\5\5\u00f0\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0110\n\5\3\6\3\6\3\6"+
		"\5\6\u0115\n\6\3\6\3\6\3\6\5\6\u011a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u0124\n\6\3\6\5\6\u0127\n\6\3\6\5\6\u012a\n\6\3\6\5\6\u012d\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u013e"+
		"\n\t\3\n\3\n\5\n\u0142\n\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u014a\n\13\3"+
		"\13\3\13\5\13\u014e\n\13\5\13\u0150\n\13\3\f\3\f\3\f\5\f\u0155\n\f\5\f"+
		"\u0157\n\f\3\r\3\r\5\r\u015b\n\r\3\r\3\r\3\r\7\r\u0160\n\r\f\r\16\r\u0163"+
		"\13\r\5\r\u0165\n\r\3\r\3\r\3\r\5\r\u016a\n\r\3\r\3\r\5\r\u016e\n\r\3"+
		"\r\6\r\u0171\n\r\r\r\16\r\u0172\3\r\3\r\3\r\3\r\3\r\7\r\u017a\n\r\f\r"+
		"\16\r\u017d\13\r\5\r\u017f\n\r\3\r\3\r\3\r\3\r\5\r\u0185\n\r\5\r\u0187"+
		"\n\r\3\16\3\16\5\16\u018b\n\16\3\16\3\16\3\16\3\16\5\16\u0191\n\16\3\16"+
		"\3\16\3\16\5\16\u0196\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u019f"+
		"\n\16\f\16\16\16\u01a2\13\16\3\16\3\16\3\16\5\16\u01a7\n\16\3\17\3\17"+
		"\5\17\u01ab\n\17\3\17\3\17\3\17\3\17\5\17\u01b1\n\17\3\17\3\17\3\17\5"+
		"\17\u01b6\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01bf\n\17\f\17"+
		"\16\17\u01c2\13\17\3\17\3\17\3\17\5\17\u01c7\n\17\3\17\3\17\5\17\u01cb"+
		"\n\17\3\17\5\17\u01ce\n\17\3\20\3\20\5\20\u01d2\n\20\3\20\3\20\3\20\3"+
		"\20\5\20\u01d8\n\20\3\20\3\20\3\20\5\20\u01dd\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u01e4\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01ed\n"+
		"\20\f\20\16\20\u01f0\13\20\5\20\u01f2\n\20\5\20\u01f4\n\20\3\20\3\20\3"+
		"\20\3\20\5\20\u01fa\n\20\3\20\3\20\3\20\3\20\5\20\u0200\n\20\3\20\3\20"+
		"\5\20\u0204\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u020b\n\20\3\20\3\20\6"+
		"\20\u020f\n\20\r\20\16\20\u0210\3\20\3\20\3\21\3\21\5\21\u0217\n\21\3"+
		"\21\3\21\3\21\3\21\5\21\u021d\n\21\3\21\3\21\3\21\5\21\u0222\n\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u022e\n\22\3\22\3\22"+
		"\3\22\5\22\u0233\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u023c\n"+
		"\22\f\22\16\22\u023f\13\22\3\22\3\22\5\22\u0243\n\22\3\23\5\23\u0246\n"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u024d\n\23\3\24\5\24\u0250\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0257\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u025e"+
		"\n\24\f\24\16\24\u0261\13\24\5\24\u0263\n\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0269\n\24\5\24\u026b\n\24\3\25\3\25\5\25\u026f\n\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\5\26\u0277\n\26\3\26\3\26\3\26\5\26\u027c\n\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\5\27\u0284\n\27\3\27\3\27\3\27\5\27\u0289\n\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\5\30\u0291\n\30\3\30\3\30\3\30\5\30\u0296"+
		"\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u029e\n\31\3\31\3\31\3\31\5\31"+
		"\u02a3\n\31\3\31\3\31\3\32\3\32\5\32\u02a9\n\32\3\32\3\32\3\32\7\32\u02ae"+
		"\n\32\f\32\16\32\u02b1\13\32\5\32\u02b3\n\32\3\32\3\32\3\32\3\32\7\32"+
		"\u02b9\n\32\f\32\16\32\u02bc\13\32\3\32\3\32\3\32\3\32\3\32\7\32\u02c3"+
		"\n\32\f\32\16\32\u02c6\13\32\5\32\u02c8\n\32\3\32\3\32\3\32\3\32\5\32"+
		"\u02ce\n\32\5\32\u02d0\n\32\3\33\5\33\u02d3\n\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02e6"+
		"\n\33\3\33\3\33\3\33\3\33\5\33\u02ec\n\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u02f3\n\33\f\33\16\33\u02f6\13\33\3\33\3\33\5\33\u02fa\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u0301\n\33\f\33\16\33\u0304\13\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u030c\n\33\f\33\16\33\u030f\13\33\3\33\3\33\7\33"+
		"\u0313\n\33\f\33\16\33\u0316\13\33\3\33\3\33\3\33\5\33\u031b\n\33\3\34"+
		"\3\34\3\34\3\34\5\34\u0321\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u032a\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0331\n\35\3\35\3\35\5\35\u0335"+
		"\n\35\5\35\u0337\n\35\3\36\3\36\5\36\u033b\n\36\3\36\3\36\3\37\3\37\3"+
		"\37\5\37\u0342\n\37\5\37\u0344\n\37\3\37\3\37\5\37\u0348\n\37\3\37\5\37"+
		"\u034b\n\37\3 \3 \3 \3!\3!\5!\u0352\n!\3!\3!\3!\7!\u0357\n!\f!\16!\u035a"+
		"\13!\5!\u035c\n!\3!\3!\3!\3!\3!\3!\7!\u0364\n!\f!\16!\u0367\13!\5!\u0369"+
		"\n!\3!\3!\3!\3!\5!\u036f\n!\5!\u0371\n!\3\"\3\"\5\"\u0375\n\"\3\"\3\""+
		"\3\"\7\"\u037a\n\"\f\"\16\"\u037d\13\"\5\"\u037f\n\"\3\"\3\"\3\"\3\"\7"+
		"\"\u0385\n\"\f\"\16\"\u0388\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u038f\n\"\f\""+
		"\16\"\u0392\13\"\5\"\u0394\n\"\3\"\3\"\3\"\3\"\5\"\u039a\n\"\5\"\u039c"+
		"\n\"\3#\3#\5#\u03a0\n#\3#\3#\3#\7#\u03a5\n#\f#\16#\u03a8\13#\3#\3#\3#"+
		"\3#\7#\u03ae\n#\f#\16#\u03b1\13#\3#\5#\u03b4\n#\5#\u03b6\n#\3#\3#\5#\u03ba"+
		"\n#\3#\3#\3#\3#\3#\7#\u03c1\n#\f#\16#\u03c4\13#\3#\3#\5#\u03c8\n#\5#\u03ca"+
		"\n#\3#\3#\3#\3#\3#\7#\u03d1\n#\f#\16#\u03d4\13#\3#\3#\3#\3#\3#\3#\7#\u03dc"+
		"\n#\f#\16#\u03df\13#\3#\3#\7#\u03e3\n#\f#\16#\u03e6\13#\5#\u03e8\n#\3"+
		"$\5$\u03eb\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u03f8\n$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\7$\u0404\n$\f$\16$\u0407\13$\3$\3$\5$\u040b\n$\3%"+
		"\5%\u040e\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u041b\n%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\7%\u0427\n%\f%\16%\u042a\13%\3%\3%\5%\u042e\n%\3%\3"+
		"%\3%\3%\3%\7%\u0435\n%\f%\16%\u0438\13%\5%\u043a\n%\3%\3%\3%\3%\5%\u0440"+
		"\n%\5%\u0442\n%\3&\3&\3\'\3\'\3\'\7\'\u0449\n\'\f\'\16\'\u044c\13\'\3"+
		"(\3(\3(\3(\5(\u0452\n(\3(\3(\3(\3(\3(\5(\u0459\n(\3(\3(\3(\5(\u045e\n"+
		"(\3(\3(\5(\u0462\n(\3)\3)\5)\u0466\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\5)\u0476\n)\3*\3*\3*\5*\u047b\n*\3*\3*\5*\u047f\n*\3+\3+\3"+
		",\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0496\n.\3"+
		".\3.\6.\u049a\n.\r.\16.\u049b\5.\u049e\n.\3/\3/\5/\u04a2\n/\3\60\3\60"+
		"\3\60\5\60\u04a7\n\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u04af\n\61\3"+
		"\61\3\61\3\61\5\61\u04b4\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u04bd\n\61\3\61\3\61\3\61\7\61\u04c2\n\61\f\61\16\61\u04c5\13\61\3\61"+
		"\5\61\u04c8\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u04d8\n\61\3\61\5\61\u04db\n\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\5\61\u04e3\n\61\3\61\3\61\3\61\3\61\3\61\6\61\u04ea\n\61"+
		"\r\61\16\61\u04eb\3\61\3\61\5\61\u04f0\n\61\3\61\3\61\3\61\5\61\u04f5"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u0513\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u051f\n\61\3\61\3\61\3\61\5\61\u0524\n\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\5\61\u0530\n\61\3\61\3\61\3\61\3\61\5\61"+
		"\u0536\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u053d\n\61\3\61\3\61\5\61\u0541"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0549\n\61\f\61\16\61\u054c\13"+
		"\61\5\61\u054e\n\61\3\61\3\61\3\61\3\61\5\61\u0554\n\61\3\61\5\61\u0557"+
		"\n\61\7\61\u0559\n\61\f\61\16\61\u055c\13\61\3\62\3\62\3\62\3\62\5\62"+
		"\u0562\n\62\3\62\3\62\3\62\3\62\3\62\7\62\u0569\n\62\f\62\16\62\u056c"+
		"\13\62\3\62\3\62\5\62\u0570\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\5\62\u057c\n\62\3\62\3\62\5\62\u0580\n\62\7\62\u0582\n\62"+
		"\f\62\16\62\u0585\13\62\3\62\5\62\u0588\n\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u058f\n\62\3\62\5\62\u0592\n\62\5\62\u0594\n\62\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u059e\n\64\3\64\3\64\3\65\3\65\3\65\5\65"+
		"\u05a5\n\65\3\65\5\65\u05a8\n\65\3\66\3\66\5\66\u05ac\n\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u05b7\n\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\7\67\u05bf\n\67\f\67\16\67\u05c2\13\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\38\78\u05cd\n8\f8\168\u05d0\138\38\38\38\39\39\59\u05d7\n9"+
		"\39\59\u05da\n9\39\39\39\39\79\u05e0\n9\f9\169\u05e3\139\39\39\39\3:\3"+
		":\5:\u05ea\n:\3:\3:\3:\3:\7:\u05f0\n:\f:\16:\u05f3\13:\3:\3:\3:\3;\3;"+
		"\3<\3<\5<\u05fc\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\7<\u060a\n<\f<"+
		"\16<\u060d\13<\3=\3=\3=\5=\u0612\n=\3=\3=\3=\3=\3=\3=\5=\u061a\n=\3>\3"+
		">\3>\5>\u061f\n>\3>\5>\u0622\n>\3?\3?\3?\5?\u0627\n?\3@\3@\3@\3@\3@\7"+
		"@\u062e\n@\f@\16@\u0631\13@\3@\3@\5@\u0635\n@\3@\3@\3@\3@\3@\3A\3A\3A"+
		"\3A\3A\3A\3A\5A\u0643\nA\3A\5A\u0646\nA\5A\u0648\nA\3B\3B\3B\5B\u064d"+
		"\nB\3B\3B\5B\u0651\nB\3B\5B\u0654\nB\3B\3B\3B\3B\3B\5B\u065b\nB\3B\3B"+
		"\3B\3B\7B\u0661\nB\fB\16B\u0664\13B\3B\5B\u0667\nB\3B\3B\5B\u066b\nB\3"+
		"B\5B\u066e\nB\3B\3B\3B\3B\5B\u0674\nB\3B\5B\u0677\nB\5B\u0679\nB\3C\3"+
		"C\3C\3C\3C\7C\u0680\nC\fC\16C\u0683\13C\3D\3D\5D\u0687\nD\3D\3D\5D\u068b"+
		"\nD\3D\3D\5D\u068f\nD\3D\5D\u0692\nD\3E\3E\3E\3E\3E\3E\3E\7E\u069b\nE"+
		"\fE\16E\u069e\13E\3E\3E\5E\u06a2\nE\3F\3F\5F\u06a6\nF\3F\3F\3F\7F\u06ab"+
		"\nF\fF\16F\u06ae\13F\3F\3F\3F\3F\7F\u06b4\nF\fF\16F\u06b7\13F\3F\5F\u06ba"+
		"\nF\5F\u06bc\nF\3F\3F\5F\u06c0\nF\3F\3F\3F\3F\3F\7F\u06c7\nF\fF\16F\u06ca"+
		"\13F\3F\3F\5F\u06ce\nF\5F\u06d0\nF\3F\3F\3F\3F\3F\7F\u06d7\nF\fF\16F\u06da"+
		"\13F\3F\3F\3F\3F\3F\3F\7F\u06e2\nF\fF\16F\u06e5\13F\3F\3F\7F\u06e9\nF"+
		"\fF\16F\u06ec\13F\5F\u06ee\nF\3G\3G\3G\3G\3G\5G\u06f5\nG\3H\3H\3H\3H\3"+
		"H\7H\u06fc\nH\fH\16H\u06ff\13H\3H\3H\5H\u0703\nH\3I\5I\u0706\nI\3I\3I"+
		"\5I\u070a\nI\3J\3J\3K\3K\3L\3L\3M\3M\5M\u0714\nM\3N\3N\3O\3O\3P\6P\u071b"+
		"\nP\rP\16P\u071c\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3"+
		"Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3c\3c"+
		"\3c\3c\3c\5c\u074a\nc\3c\2\3`d\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\2\24\5\2==IIVV"+
		"\4\2\62\62EE\4\2\b\boo\3\2\u0089\u008a\4\2  AA\4\2%%??\7\2\34\34LLUU\u0080"+
		"\u0080\u0083\u0083\4\2\n\n\17\20\3\2\13\f\3\2\21\24\3\2\25\30\6\2QQee"+
		"gg||\4\2>>\u0091\u0091\5\2\34\34LL\u0083\u0083\6\2\679mm\u009c\u009c\u009e"+
		"\u009f\4\2\13\rkk\4\2\u009b\u009b\u009e\u009e\4\2\34pr\u009a\2\u085f\2"+
		"\u00ca\3\2\2\2\4\u00cf\3\2\2\2\6\u00d5\3\2\2\2\b\u00ef\3\2\2\2\n\u0111"+
		"\3\2\2\2\f\u012e\3\2\2\2\16\u0133\3\2\2\2\20\u0136\3\2\2\2\22\u013f\3"+
		"\2\2\2\24\u0147\3\2\2\2\26\u0151\3\2\2\2\30\u0164\3\2\2\2\32\u0188\3\2"+
		"\2\2\34\u01a8\3\2\2\2\36\u01cf\3\2\2\2 \u0214\3\2\2\2\"\u0227\3\2\2\2"+
		"$\u0245\3\2\2\2&\u024f\3\2\2\2(\u026c\3\2\2\2*\u0272\3\2\2\2,\u027f\3"+
		"\2\2\2.\u028c\3\2\2\2\60\u0299\3\2\2\2\62\u02b2\3\2\2\2\64\u02d2\3\2\2"+
		"\2\66\u031c\3\2\2\28\u032b\3\2\2\2:\u0338\3\2\2\2<\u033e\3\2\2\2>\u034c"+
		"\3\2\2\2@\u035b\3\2\2\2B\u037e\3\2\2\2D\u03e7\3\2\2\2F\u03ea\3\2\2\2H"+
		"\u040d\3\2\2\2J\u0443\3\2\2\2L\u0445\3\2\2\2N\u044d\3\2\2\2P\u0465\3\2"+
		"\2\2R\u0477\3\2\2\2T\u0480\3\2\2\2V\u0482\3\2\2\2X\u0486\3\2\2\2Z\u0489"+
		"\3\2\2\2\\\u04a1\3\2\2\2^\u04a6\3\2\2\2`\u04f4\3\2\2\2b\u055d\3\2\2\2"+
		"d\u0595\3\2\2\2f\u0597\3\2\2\2h\u05a1\3\2\2\2j\u05ab\3\2\2\2l\u05b8\3"+
		"\2\2\2n\u05c6\3\2\2\2p\u05d4\3\2\2\2r\u05e7\3\2\2\2t\u05f7\3\2\2\2v\u05f9"+
		"\3\2\2\2x\u0611\3\2\2\2z\u061b\3\2\2\2|\u0626\3\2\2\2~\u0628\3\2\2\2\u0080"+
		"\u0647\3\2\2\2\u0082\u0678\3\2\2\2\u0084\u067a\3\2\2\2\u0086\u0691\3\2"+
		"\2\2\u0088\u06a1\3\2\2\2\u008a\u06ed\3\2\2\2\u008c\u06f4\3\2\2\2\u008e"+
		"\u06f6\3\2\2\2\u0090\u0709\3\2\2\2\u0092\u070b\3\2\2\2\u0094\u070d\3\2"+
		"\2\2\u0096\u070f\3\2\2\2\u0098\u0713\3\2\2\2\u009a\u0715\3\2\2\2\u009c"+
		"\u0717\3\2\2\2\u009e\u071a\3\2\2\2\u00a0\u071e\3\2\2\2\u00a2\u0720\3\2"+
		"\2\2\u00a4\u0722\3\2\2\2\u00a6\u0724\3\2\2\2\u00a8\u0726\3\2\2\2\u00aa"+
		"\u0728\3\2\2\2\u00ac\u072a\3\2\2\2\u00ae\u072c\3\2\2\2\u00b0\u072e\3\2"+
		"\2\2\u00b2\u0730\3\2\2\2\u00b4\u0732\3\2\2\2\u00b6\u0734\3\2\2\2\u00b8"+
		"\u0736\3\2\2\2\u00ba\u0738\3\2\2\2\u00bc\u073a\3\2\2\2\u00be\u073c\3\2"+
		"\2\2\u00c0\u073e\3\2\2\2\u00c2\u0740\3\2\2\2\u00c4\u0749\3\2\2\2\u00c6"+
		"\u00c9\5\6\4\2\u00c7\u00c9\5\4\3\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\2\2\3\u00ce\3\3\2\2\2"+
		"\u00cf\u00d0\7\u00a3\2\2\u00d0\u00d1\b\3\1\2\u00d1\5\3\2\2\2\u00d2\u00d4"+
		"\7\4\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00e1\5\b"+
		"\5\2\u00d9\u00db\7\4\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\5\b"+
		"\5\2\u00df\u00da\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e7\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\7\4"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\7\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\7K\2\2"+
		"\u00eb\u00ec\7x\2\2\u00ec\u00ee\7u\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u010f\3\2\2\2\u00f1\u0110\5\n\6\2\u00f2\u0110\5\20\t\2\u00f3\u0110\5"+
		"\22\n\2\u00f4\u0110\5\24\13\2\u00f5\u0110\5\26\f\2\u00f6\u0110\5\30\r"+
		"\2\u00f7\u0110\5\32\16\2\u00f8\u0110\5\34\17\2\u00f9\u0110\5\36\20\2\u00fa"+
		"\u0110\5 \21\2\u00fb\u0110\5\"\22\2\u00fc\u0110\5$\23\2\u00fd\u0110\5"+
		"&\24\2\u00fe\u0110\5(\25\2\u00ff\u0110\5*\26\2\u0100\u0110\5,\27\2\u0101"+
		"\u0110\5.\30\2\u0102\u0110\5\60\31\2\u0103\u0110\5\62\32\2\u0104\u0110"+
		"\5\64\33\2\u0105\u0110\5\66\34\2\u0106\u0110\58\35\2\u0107\u0110\5:\36"+
		"\2\u0108\u0110\5<\37\2\u0109\u0110\5> \2\u010a\u0110\5@!\2\u010b\u0110"+
		"\5B\"\2\u010c\u0110\5F$\2\u010d\u0110\5H%\2\u010e\u0110\5J&\2\u010f\u00f1"+
		"\3\2\2\2\u010f\u00f2\3\2\2\2\u010f\u00f3\3\2\2\2\u010f\u00f4\3\2\2\2\u010f"+
		"\u00f5\3\2\2\2\u010f\u00f6\3\2\2\2\u010f\u00f7\3\2\2\2\u010f\u00f8\3\2"+
		"\2\2\u010f\u00f9\3\2\2\2\u010f\u00fa\3\2\2\2\u010f\u00fb\3\2\2\2\u010f"+
		"\u00fc\3\2\2\2\u010f\u00fd\3\2\2\2\u010f\u00fe\3\2\2\2\u010f\u00ff\3\2"+
		"\2\2\u010f\u0100\3\2\2\2\u010f\u0101\3\2\2\2\u010f\u0102\3\2\2\2\u010f"+
		"\u0103\3\2\2\2\u010f\u0104\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u0106\3\2"+
		"\2\2\u010f\u0107\3\2\2\2\u010f\u0108\3\2\2\2\u010f\u0109\3\2\2\2\u010f"+
		"\u010a\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u010e\3\2\2\2\u0110\t\3\2\2\2\u0111\u0112\7!\2\2\u0112\u0114"+
		"\7\u0088\2\2\u0113\u0115\7q\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2"+
		"\2\u0115\u0119\3\2\2\2\u0116\u0117\5\u00a4S\2\u0117\u0118\7\5\2\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u0126\5\u00a6T\2\u011c\u011d\7\177\2\2\u011d\u011e\7\u008c"+
		"\2\2\u011e\u0127\5\u00acW\2\u011f\u0127\5\16\b\2\u0120\u0127\5\f\7\2\u0121"+
		"\u0123\7\36\2\2\u0122\u0124\7\61\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3"+
		"\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\5L\'\2\u0126\u011c\3\2\2\2\u0126"+
		"\u011f\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2\2\2\u0127\u0129\3\2"+
		"\2\2\u0128\u012a\7F\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u012d\5\u009eP\2\u012c\u012b\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\13\3\2\2\2\u012e\u012f\7\36\2\2\u012f\u0130\7\64\2\2\u0130"+
		"\u0131\5\u00c4c\2\u0131\u0132\5j\66\2\u0132\r\3\2\2\2\u0133\u0134\7\36"+
		"\2\2\u0134\u0135\5j\66\2\u0135\17\3\2\2\2\u0136\u013d\7\"\2\2\u0137\u013e"+
		"\5\u00a4S\2\u0138\u013e\5\u00aaV\2\u0139\u013a\5\u00a4S\2\u013a\u013b"+
		"\7\5\2\2\u013b\u013c\5\u00aaV\2\u013c\u013e\3\2\2\2\u013d\u0137\3\2\2"+
		"\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013e\3\2\2\2\u013e\21"+
		"\3\2\2\2\u013f\u0141\7&\2\2\u0140\u0142\7:\2\2\u0141\u0140\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\5`\61\2\u0144\u0145\7$"+
		"\2\2\u0145\u0146\5\u00a4S\2\u0146\23\3\2\2\2\u0147\u0149\7)\2\2\u0148"+
		"\u014a\t\2\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014f\3\2"+
		"\2\2\u014b\u014d\7\u008d\2\2\u014c\u014e\5\u00c2b\2\u014d\u014c\3\2\2"+
		"\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014b\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\25\3\2\2\2\u0151\u0156\t\3\2\2\u0152\u0154\7\u008d\2\2"+
		"\u0153\u0155\5\u00c2b\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0152\3\2\2\2\u0156\u0157\3\2\2\2\u0157\27\3\2\2"+
		"\2\u0158\u015a\7\u0099\2\2\u0159\u015b\7z\2\2\u015a\u0159\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0161\5~@\2\u015d\u015e\7\b\2"+
		"\2\u015e\u0160\5~@\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0158\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0170\5\u008a"+
		"F\2\u0167\u0169\7\u008f\2\2\u0168\u016a\7 \2\2\u0169\u0168\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016e\3\2\2\2\u016b\u016e\7^\2\2\u016c\u016e\7H\2"+
		"\2\u016d\u0167\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0171\5\u008aF\2\u0170\u016d\3\2\2\2\u0171\u0172\3\2\2"+
		"\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u017e\3\2\2\2\u0174\u0175"+
		"\7s\2\2\u0175\u0176\7+\2\2\u0176\u017b\5z>\2\u0177\u0178\7\b\2\2\u0178"+
		"\u017a\5z>\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2"+
		"\2\u017b\u017c\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0174"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0186\3\2\2\2\u0180\u0181\7f\2\2\u0181"+
		"\u0184\5`\61\2\u0182\u0183\t\4\2\2\u0183\u0185\5`\61\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0180\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\31\3\2\2\2\u0188\u018a\7\65\2\2\u0189\u018b\7\u0090"+
		"\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u0190\7X\2\2\u018d\u018e\7T\2\2\u018e\u018f\7k\2\2\u018f\u0191\7J\2\2"+
		"\u0190\u018d\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0195\3\2\2\2\u0192\u0193"+
		"\5\u00a4S\2\u0193\u0194\7\5\2\2\u0194\u0196\3\2\2\2\u0195\u0192\3\2\2"+
		"\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\5\u00b4[\2\u0198"+
		"\u0199\7p\2\2\u0199\u019a\5\u00a8U\2\u019a\u019b\7\6\2\2\u019b\u01a0\5"+
		"h\65\2\u019c\u019d\7\b\2\2\u019d\u019f\5h\65\2\u019e\u019c\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\7\7\2\2\u01a4\u01a5\7\u0098\2\2\u01a5"+
		"\u01a7\5`\61\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\33\3\2\2"+
		"\2\u01a8\u01aa\7\65\2\2\u01a9\u01ab\t\5\2\2\u01aa\u01a9\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b0\7\u0088\2\2\u01ad\u01ae"+
		"\7T\2\2\u01ae\u01af\7k\2\2\u01af\u01b1\7J\2\2\u01b0\u01ad\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b5\3\2\2\2\u01b2\u01b3\5\u00a4S\2\u01b3\u01b4"+
		"\7\5\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01ca\5\u00a8U\2\u01b8\u01b9\7\6\2\2\u01b9\u01c0"+
		"\5L\'\2\u01ba\u01bb\7\b\2\2\u01bb\u01bf\5j\66\2\u01bc\u01bd\7\b\2\2\u01bd"+
		"\u01bf\5L\'\2\u01be\u01ba\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c6\7\7\2\2\u01c4\u01c5\7\u009a\2\2\u01c5\u01c7"+
		"\7\u009b\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01cb\3\2\2"+
		"\2\u01c8\u01c9\7$\2\2\u01c9\u01cb\5B\"\2\u01ca\u01b8\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ce\5\u009eP\2\u01cd\u01cc\3\2\2"+
		"\2\u01cd\u01ce\3\2\2\2\u01ce\35\3\2\2\2\u01cf\u01d1\7\65\2\2\u01d0\u01d2"+
		"\t\5\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d7\7\u008e\2\2\u01d4\u01d5\7T\2\2\u01d5\u01d6\7k\2\2\u01d6\u01d8\7"+
		"J\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc\3\2\2\2\u01d9"+
		"\u01da\5\u00a4S\2\u01da\u01db\7\5\2\2\u01db\u01dd\3\2\2\2\u01dc\u01d9"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e3\5\u00b6\\"+
		"\2\u01df\u01e4\7(\2\2\u01e0\u01e4\7\37\2\2\u01e1\u01e2\7]\2\2\u01e2\u01e4"+
		"\7n\2\2\u01e3\u01df\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01f3\3\2\2\2\u01e5\u01f4\7>\2\2\u01e6\u01f4\7\\"+
		"\2\2\u01e7\u01f1\7\u0091\2\2\u01e8\u01e9\7n\2\2\u01e9\u01ee\5\u00aeX\2"+
		"\u01ea\u01eb\7\b\2\2\u01eb\u01ed\5\u00aeX\2\u01ec\u01ea\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f2\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01e8\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f4\3\2\2\2\u01f3\u01e5\3\2\2\2\u01f3\u01e6\3\2\2\2\u01f3\u01e7\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f9\7p\2\2\u01f6\u01f7\5\u00a4S\2\u01f7"+
		"\u01f8\7\5\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01ff\5\u00a8U\2\u01fc\u01fd\7M\2\2\u01fd"+
		"\u01fe\7C\2\2\u01fe\u0200\7\u0084\2\2\u01ff\u01fc\3\2\2\2\u01ff\u0200"+
		"\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u0202\7\u0097\2\2\u0202\u0204\5`\61"+
		"\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u020e"+
		"\7)\2\2\u0206\u020b\5F$\2\u0207\u020b\5\64\33\2\u0208\u020b\5$\23\2\u0209"+
		"\u020b\5B\"\2\u020a\u0206\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7\4\2\2\u020d"+
		"\u020f\3\2\2\2\u020e\u020a\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\7E\2\2\u0213"+
		"\37\3\2\2\2\u0214\u0216\7\65\2\2\u0215\u0217\t\5\2\2\u0216\u0215\3\2\2"+
		"\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021c\7\u0095\2\2\u0219"+
		"\u021a\7T\2\2\u021a\u021b\7k\2\2\u021b\u021d\7J\2\2\u021c\u0219\3\2\2"+
		"\2\u021c\u021d\3\2\2\2\u021d\u0221\3\2\2\2\u021e\u021f\5\u00a4S\2\u021f"+
		"\u0220\7\5\2\2\u0220\u0222\3\2\2\2\u0221\u021e\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223\u0224\5\u00b8]\2\u0224\u0225\7$\2\2\u0225"+
		"\u0226\5B\"\2\u0226!\3\2\2\2\u0227\u0228\7\65\2\2\u0228\u0229\7\u0096"+
		"\2\2\u0229\u022d\7\u0088\2\2\u022a\u022b\7T\2\2\u022b\u022c\7k\2\2\u022c"+
		"\u022e\7J\2\2\u022d\u022a\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0232\3\2"+
		"\2\2\u022f\u0230\5\u00a4S\2\u0230\u0231\7\5\2\2\u0231\u0233\3\2\2\2\u0232"+
		"\u022f\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\5\u00a8"+
		"U\2\u0235\u0236\7\u0092\2\2\u0236\u0242\5\u00ba^\2\u0237\u0238\7\6\2\2"+
		"\u0238\u023d\5\u0098M\2\u0239\u023a\7\b\2\2\u023a\u023c\5\u0098M\2\u023b"+
		"\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\7\7\2\2\u0241"+
		"\u0243\3\2\2\2\u0242\u0237\3\2\2\2\u0242\u0243\3\2\2\2\u0243#\3\2\2\2"+
		"\u0244\u0246\5v<\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247"+
		"\3\2\2\2\u0247\u0248\7>\2\2\u0248\u0249\7O\2\2\u0249\u024c\5x=\2\u024a"+
		"\u024b\7\u0098\2\2\u024b\u024d\5`\61\2\u024c\u024a\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d%\3\2\2\2\u024e\u0250\5v<\2\u024f\u024e\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\7>\2\2\u0252\u0253\7O\2\2\u0253"+
		"\u0256\5x=\2\u0254\u0255\7\u0098\2\2\u0255\u0257\5`\61\2\u0256\u0254\3"+
		"\2\2\2\u0256\u0257\3\2\2\2\u0257\u026a\3\2\2\2\u0258\u0259\7s\2\2\u0259"+
		"\u025a\7+\2\2\u025a\u025f\5z>\2\u025b\u025c\7\b\2\2\u025c\u025e\5z>\2"+
		"\u025d\u025b\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0258\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\7f\2\2\u0265\u0268\5`\61"+
		"\2\u0266\u0267\t\4\2\2\u0267\u0269\5`\61\2\u0268\u0266\3\2\2\2\u0268\u0269"+
		"\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0262\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\'\3\2\2\2\u026c\u026e\7@\2\2\u026d\u026f\7:\2\2\u026e\u026d\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\5\u00a4S\2\u0271)\3\2\2"+
		"\2\u0272\u0273\7B\2\2\u0273\u0276\7X\2\2\u0274\u0275\7T\2\2\u0275\u0277"+
		"\7J\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027b\3\2\2\2\u0278"+
		"\u0279\5\u00a4S\2\u0279\u027a\7\5\2\2\u027a\u027c\3\2\2\2\u027b\u0278"+
		"\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\5\u00b4["+
		"\2\u027e+\3\2\2\2\u027f\u0280\7B\2\2\u0280\u0283\7\u0088\2\2\u0281\u0282"+
		"\7T\2\2\u0282\u0284\7J\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0288\3\2\2\2\u0285\u0286\5\u00a4S\2\u0286\u0287\7\5\2\2\u0287\u0289"+
		"\3\2\2\2\u0288\u0285\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028b\5\u00a8U\2\u028b-\3\2\2\2\u028c\u028d\7B\2\2\u028d\u0290\7\u008e"+
		"\2\2\u028e\u028f\7T\2\2\u028f\u0291\7J\2\2\u0290\u028e\3\2\2\2\u0290\u0291"+
		"\3\2\2\2\u0291\u0295\3\2\2\2\u0292\u0293\5\u00a4S\2\u0293\u0294\7\5\2"+
		"\2\u0294\u0296\3\2\2\2\u0295\u0292\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u0298\5\u00b6\\\2\u0298/\3\2\2\2\u0299\u029a\7B\2\2\u029a"+
		"\u029d\7\u0095\2\2\u029b\u029c\7T\2\2\u029c\u029e\7J\2\2\u029d\u029b\3"+
		"\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a2\3\2\2\2\u029f\u02a0\5\u00a4S\2"+
		"\u02a0\u02a1\7\5\2\2\u02a1\u02a3\3\2\2\2\u02a2\u029f\3\2\2\2\u02a2\u02a3"+
		"\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\5\u00b8]\2\u02a5\61\3\2\2\2\u02a6"+
		"\u02a8\7\u0099\2\2\u02a7\u02a9\7z\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02af\5~@\2\u02ab\u02ac\7\b\2\2\u02ac"+
		"\u02ae\5~@\2\u02ad\u02ab\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2"+
		"\2\u02af\u02b0\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02a6"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02ba\5\u008aF"+
		"\2\u02b5\u02b6\5\u008cG\2\u02b6\u02b7\5\u008aF\2\u02b7\u02b9\3\2\2\2\u02b8"+
		"\u02b5\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02c7\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\7s\2\2\u02be"+
		"\u02bf\7+\2\2\u02bf\u02c4\5z>\2\u02c0\u02c1\7\b\2\2\u02c1\u02c3\5z>\2"+
		"\u02c2\u02c0\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5"+
		"\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02bd\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02cf\3\2\2\2\u02c9\u02ca\7f\2\2\u02ca\u02cd\5`\61"+
		"\2\u02cb\u02cc\t\4\2\2\u02cc\u02ce\5`\61\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce"+
		"\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02c9\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\63\3\2\2\2\u02d1\u02d3\5v<\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2"+
		"\u02d3\u02e5\3\2\2\2\u02d4\u02e6\7\\\2\2\u02d5\u02e6\7\u0080\2\2\u02d6"+
		"\u02d7\7\\\2\2\u02d7\u02d8\7r\2\2\u02d8\u02e6\7\u0080\2\2\u02d9\u02da"+
		"\7\\\2\2\u02da\u02db\7r\2\2\u02db\u02e6\7\u0083\2\2\u02dc\u02dd\7\\\2"+
		"\2\u02dd\u02de\7r\2\2\u02de\u02e6\7\34\2\2\u02df\u02e0\7\\\2\2\u02e0\u02e1"+
		"\7r\2\2\u02e1\u02e6\7L\2\2\u02e2\u02e3\7\\\2\2\u02e3\u02e4\7r\2\2\u02e4"+
		"\u02e6\7U\2\2\u02e5\u02d4\3\2\2\2\u02e5\u02d5\3\2\2\2\u02e5\u02d6\3\2"+
		"\2\2\u02e5\u02d9\3\2\2\2\u02e5\u02dc\3\2\2\2\u02e5\u02df\3\2\2\2\u02e5"+
		"\u02e2\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02eb\7_\2\2\u02e8\u02e9\5\u00a4"+
		"S\2\u02e9\u02ea\7\5\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e8\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02f9\5\u00a8U\2\u02ee\u02ef"+
		"\7\6\2\2\u02ef\u02f4\5\u00aeX\2\u02f0\u02f1\7\b\2\2\u02f1\u02f3\5\u00ae"+
		"X\2\u02f2\u02f0\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f8\7\7"+
		"\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02ee\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u031a\3\2\2\2\u02fb\u02fc\7\u0094\2\2\u02fc\u02fd\7\6\2\2\u02fd\u0302"+
		"\5`\61\2\u02fe\u02ff\7\b\2\2\u02ff\u0301\5`\61\2\u0300\u02fe\3\2\2\2\u0301"+
		"\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0305\3\2"+
		"\2\2\u0304\u0302\3\2\2\2\u0305\u0314\7\7\2\2\u0306\u0307\7\b\2\2\u0307"+
		"\u0308\7\6\2\2\u0308\u030d\5`\61\2\u0309\u030a\7\b\2\2\u030a\u030c\5`"+
		"\61\2\u030b\u0309\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0311\7\7"+
		"\2\2\u0311\u0313\3\2\2\2\u0312\u0306\3\2\2\2\u0313\u0316\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u031b\3\2\2\2\u0316\u0314\3\2"+
		"\2\2\u0317\u031b\5B\"\2\u0318\u0319\7;\2\2\u0319\u031b\7\u0094\2\2\u031a"+
		"\u02fb\3\2\2\2\u031a\u0317\3\2\2\2\u031a\u0318\3\2\2\2\u031b\65\3\2\2"+
		"\2\u031c\u0320\7v\2\2\u031d\u031e\5\u00a4S\2\u031e\u031f\7\5\2\2\u031f"+
		"\u0321\3\2\2\2\u0320\u031d\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0329\5\u00bc_\2\u0323\u0324\7\t\2\2\u0324\u032a\5|?\2\u0325"+
		"\u0326\7\6\2\2\u0326\u0327\5|?\2\u0327\u0328\7\7\2\2\u0328\u032a\3\2\2"+
		"\2\u0329\u0323\3\2\2\2\u0329\u0325\3\2\2\2\u0329\u032a\3\2\2\2\u032a\67"+
		"\3\2\2\2\u032b\u0336\7}\2\2\u032c\u0337\5\u00b0Y\2\u032d\u032e\5\u00a4"+
		"S\2\u032e\u032f\7\5\2\2\u032f\u0331\3\2\2\2\u0330\u032d\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0335\5\u00a8U\2\u0333\u0335"+
		"\5\u00b4[\2\u0334\u0332\3\2\2\2\u0334\u0333\3\2\2\2\u0335\u0337\3\2\2"+
		"\2\u0336\u032c\3\2\2\2\u0336\u0330\3\2\2\2\u0336\u0337\3\2\2\2\u03379"+
		"\3\2\2\2\u0338\u033a\7~\2\2\u0339\u033b\7\u0085\2\2\u033a\u0339\3\2\2"+
		"\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\5\u00be`\2\u033d"+
		";\3\2\2\2\u033e\u0343\7\u0083\2\2\u033f\u0341\7\u008d\2\2\u0340\u0342"+
		"\5\u00c2b\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2"+
		"\2\u0343\u033f\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u034a\3\2\2\2\u0345\u0347"+
		"\7\u008c\2\2\u0346\u0348\7\u0085\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3"+
		"\2\2\2\u0348\u0349\3\2\2\2\u0349\u034b\5\u00be`\2\u034a\u0345\3\2\2\2"+
		"\u034a\u034b\3\2\2\2\u034b=\3\2\2\2\u034c\u034d\7\u0085\2\2\u034d\u034e"+
		"\5\u00be`\2\u034e?\3\2\2\2\u034f\u0351\7\u0099\2\2\u0350\u0352\7z\2\2"+
		"\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0358"+
		"\5~@\2\u0354\u0355\7\b\2\2\u0355\u0357\5~@\2\u0356\u0354\3\2\2\2\u0357"+
		"\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035c\3\2"+
		"\2\2\u035a\u0358\3\2\2\2\u035b\u034f\3\2\2\2\u035b\u035c\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u0368\5\u008aF\2\u035e\u035f\7s\2\2\u035f\u0360\7"+
		"+\2\2\u0360\u0365\5z>\2\u0361\u0362\7\b\2\2\u0362\u0364\5z>\2\u0363\u0361"+
		"\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u035e\3\2\2\2\u0368\u0369\3\2"+
		"\2\2\u0369\u0370\3\2\2\2\u036a\u036b\7f\2\2\u036b\u036e\5`\61\2\u036c"+
		"\u036d\t\4\2\2\u036d\u036f\5`\61\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2"+
		"\2\2\u036f\u0371\3\2\2\2\u0370\u036a\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"A\3\2\2\2\u0372\u0374\7\u0099\2\2\u0373\u0375\7z\2\2\u0374\u0373\3\2\2"+
		"\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u037b\5~@\2\u0377\u0378"+
		"\7\b\2\2\u0378\u037a\5~@\2\u0379\u0377\3\2\2\2\u037a\u037d\3\2\2\2\u037b"+
		"\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2"+
		"\2\2\u037e\u0372\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0386\5D#\2\u0381\u0382\5\u008cG\2\u0382\u0383\5D#\2\u0383\u0385\3\2"+
		"\2\2\u0384\u0381\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u0393\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038a\7s"+
		"\2\2\u038a\u038b\7+\2\2\u038b\u0390\5z>\2\u038c\u038d\7\b\2\2\u038d\u038f"+
		"\5z>\2\u038e\u038c\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0389\3\2"+
		"\2\2\u0393\u0394\3\2\2\2\u0394\u039b\3\2\2\2\u0395\u0396\7f\2\2\u0396"+
		"\u0399\5`\61\2\u0397\u0398\t\4\2\2\u0398\u039a\5`\61\2\u0399\u0397\3\2"+
		"\2\2\u0399\u039a\3\2\2\2\u039a\u039c\3\2\2\2\u039b\u0395\3\2\2\2\u039b"+
		"\u039c\3\2\2\2\u039cC\3\2\2\2\u039d\u039f\7\u0086\2\2\u039e\u03a0\t\6"+
		"\2\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u03a6\5\u0080A\2\u03a2\u03a3\7\b\2\2\u03a3\u03a5\5\u0080A\2\u03a4\u03a2"+
		"\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03b5\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03b3\7O\2\2\u03aa\u03af\5\u0082"+
		"B\2\u03ab\u03ac\7\b\2\2\u03ac\u03ae\5\u0082B\2\u03ad\u03ab\3\2\2\2\u03ae"+
		"\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b4\3\2"+
		"\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b4\5\u0084C\2\u03b3\u03aa\3\2\2\2\u03b3"+
		"\u03b2\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03a9\3\2\2\2\u03b5\u03b6\3\2"+
		"\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b8\7\u0098\2\2\u03b8\u03ba\5`\61\2\u03b9"+
		"\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03c9\3\2\2\2\u03bb\u03bc\7R"+
		"\2\2\u03bc\u03bd\7+\2\2\u03bd\u03c2\5`\61\2\u03be\u03bf\7\b\2\2\u03bf"+
		"\u03c1\5`\61\2\u03c0\u03be\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2"+
		"\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c7\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5"+
		"\u03c6\7S\2\2\u03c6\u03c8\5`\61\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2"+
		"\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03bb\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\u03e8\3\2\2\2\u03cb\u03cc\7\u0094\2\2\u03cc\u03cd\7\6\2\2\u03cd\u03d2"+
		"\5`\61\2\u03ce\u03cf\7\b\2\2\u03cf\u03d1\5`\61\2\u03d0\u03ce\3\2\2\2\u03d1"+
		"\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2"+
		"\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03e4\7\7\2\2\u03d6\u03d7\7\b\2\2\u03d7"+
		"\u03d8\7\6\2\2\u03d8\u03dd\5`\61\2\u03d9\u03da\7\b\2\2\u03da\u03dc\5`"+
		"\61\2\u03db\u03d9\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd"+
		"\u03de\3\2\2\2\u03de\u03e0\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e1\7\7"+
		"\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03d6\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4"+
		"\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2"+
		"\2\2\u03e7\u039d\3\2\2\2\u03e7\u03cb\3\2\2\2\u03e8E\3\2\2\2\u03e9\u03eb"+
		"\5v<\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec"+
		"\u03f7\7\u0091\2\2\u03ed\u03ee\7r\2\2\u03ee\u03f8\7\u0083\2\2\u03ef\u03f0"+
		"\7r\2\2\u03f0\u03f8\7\34\2\2\u03f1\u03f2\7r\2\2\u03f2\u03f8\7\u0080\2"+
		"\2\u03f3\u03f4\7r\2\2\u03f4\u03f8\7L\2\2\u03f5\u03f6\7r\2\2\u03f6\u03f8"+
		"\7U\2\2\u03f7\u03ed\3\2\2\2\u03f7\u03ef\3\2\2\2\u03f7\u03f1\3\2\2\2\u03f7"+
		"\u03f3\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2"+
		"\2\2\u03f9\u03fa\5x=\2\u03fa\u03fb\7\u0087\2\2\u03fb\u03fc\5\u00aeX\2"+
		"\u03fc\u03fd\7\t\2\2\u03fd\u0405\5`\61\2\u03fe\u03ff\7\b\2\2\u03ff\u0400"+
		"\5\u00aeX\2\u0400\u0401\7\t\2\2\u0401\u0402\5`\61\2\u0402\u0404\3\2\2"+
		"\2\u0403\u03fe\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406"+
		"\3\2\2\2\u0406\u040a\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u0409\7\u0098\2"+
		"\2\u0409\u040b\5`\61\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040bG"+
		"\3\2\2\2\u040c\u040e\5v<\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u041a\7\u0091\2\2\u0410\u0411\7r\2\2\u0411\u041b"+
		"\7\u0083\2\2\u0412\u0413\7r\2\2\u0413\u041b\7\34\2\2\u0414\u0415\7r\2"+
		"\2\u0415\u041b\7\u0080\2\2\u0416\u0417\7r\2\2\u0417\u041b\7L\2\2\u0418"+
		"\u0419\7r\2\2\u0419\u041b\7U\2\2\u041a\u0410\3\2\2\2\u041a\u0412\3\2\2"+
		"\2\u041a\u0414\3\2\2\2\u041a\u0416\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b"+
		"\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\5x=\2\u041d\u041e\7\u0087\2\2"+
		"\u041e\u041f\5\u00aeX\2\u041f\u0420\7\t\2\2\u0420\u0428\5`\61\2\u0421"+
		"\u0422\7\b\2\2\u0422\u0423\5\u00aeX\2\u0423\u0424\7\t\2\2\u0424\u0425"+
		"\5`\61\2\u0425\u0427\3\2\2\2\u0426\u0421\3\2\2\2\u0427\u042a\3\2\2\2\u0428"+
		"\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042d\3\2\2\2\u042a\u0428\3\2"+
		"\2\2\u042b\u042c\7\u0098\2\2\u042c\u042e\5`\61\2\u042d\u042b\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u0441\3\2\2\2\u042f\u0430\7s\2\2\u0430\u0431\7+\2"+
		"\2\u0431\u0436\5z>\2\u0432\u0433\7\b\2\2\u0433\u0435\5z>\2\u0434\u0432"+
		"\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
		"\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0439\u042f\3\2\2\2\u0439\u043a\3\2"+
		"\2\2\u043a\u043b\3\2\2\2\u043b\u043c\7f\2\2\u043c\u043f\5`\61\2\u043d"+
		"\u043e\t\4\2\2\u043e\u0440\5`\61\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2"+
		"\2\2\u0440\u0442\3\2\2\2\u0441\u0439\3\2\2\2\u0441\u0442\3\2\2\2\u0442"+
		"I\3\2\2\2\u0443\u0444\7\u0093\2\2\u0444K\3\2\2\2\u0445\u044a\5\u00aeX"+
		"\2\u0446\u0449\5P)\2\u0447\u0449\5N(\2\u0448\u0446\3\2\2\2\u0448\u0447"+
		"\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b"+
		"M\3\2\2\2\u044c\u044a\3\2\2\2\u044d\u0461\5\u00a0Q\2\u044e\u044f\7\6\2"+
		"\2\u044f\u0451\5\u0090I\2\u0450\u0452\5\u00c4c\2\u0451\u0450\3\2\2\2\u0451"+
		"\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\7\7\2\2\u0454\u0462\3\2"+
		"\2\2\u0455\u0456\7\6\2\2\u0456\u0458\5\u0090I\2\u0457\u0459\5\u00c4c\2"+
		"\u0458\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b"+
		"\7\b\2\2\u045b\u045d\5\u0090I\2\u045c\u045e\5\u00c4c\2\u045d\u045c\3\2"+
		"\2\2\u045d\u045e\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460\7\7\2\2\u0460"+
		"\u0462\3\2\2\2\u0461\u044e\3\2\2\2\u0461\u0455\3\2\2\2\u0461\u0462\3\2"+
		"\2\2\u0462O\3\2\2\2\u0463\u0464\7\64\2\2\u0464\u0466\5\u00a0Q\2\u0465"+
		"\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0475\3\2\2\2\u0467\u0476\5R"+
		"*\2\u0468\u0476\5T+\2\u0469\u0476\5V,\2\u046a\u0476\5X-\2\u046b\u046c"+
		"\7\u0090\2\2\u046c\u0476\5^\60\2\u046d\u046e\7/\2\2\u046e\u046f\7\6\2"+
		"\2\u046f\u0470\5`\61\2\u0470\u0471\7\7\2\2\u0471\u0476\3\2\2\2\u0472\u0476"+
		"\5Z.\2\u0473\u0474\7\60\2\2\u0474\u0476\5\u00b0Y\2\u0475\u0467\3\2\2\2"+
		"\u0475\u0468\3\2\2\2\u0475\u0469\3\2\2\2\u0475\u046a\3\2\2\2\u0475\u046b"+
		"\3\2\2\2\u0475\u046d\3\2\2\2\u0475\u0472\3\2\2\2\u0475\u0473\3\2\2\2\u0476"+
		"Q\3\2\2\2\u0477\u0478\7w\2\2\u0478\u047a\7c\2\2\u0479\u047b\t\7\2\2\u047a"+
		"\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047e\5^"+
		"\60\2\u047d\u047f\7\'\2\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f"+
		"S\3\2\2\2\u0480\u0481\5b\62\2\u0481U\3\2\2\2\u0482\u0483\7k\2\2\u0483"+
		"\u0484\7m\2\2\u0484\u0485\5^\60\2\u0485W\3\2\2\2\u0486\u0487\7m\2\2\u0487"+
		"\u0488\5^\60\2\u0488Y\3\2\2\2\u0489\u0495\7;\2\2\u048a\u0496\5\\/\2\u048b"+
		"\u048c\7\6\2\2\u048c\u048d\5`\61\2\u048d\u048e\7\7\2\2\u048e\u0496\3\2"+
		"\2\2\u048f\u0490\7i\2\2\u0490\u0491\7\6\2\2\u0491\u0492\5`\61\2\u0492"+
		"\u0493\7\7\2\2\u0493\u0496\3\2\2\2\u0494\u0496\5\u00c4c\2\u0495\u048a"+
		"\3\2\2\2\u0495\u048b\3\2\2\2\u0495\u048f\3\2\2\2\u0495\u0494\3\2\2\2\u0496"+
		"\u049d\3\2\2\2\u0497\u0499\7\3\2\2\u0498\u049a\5\u00c4c\2\u0499\u0498"+
		"\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c"+
		"\u049e\3\2\2\2\u049d\u0497\3\2\2\2\u049d\u049e\3\2\2\2\u049e[\3\2\2\2"+
		"\u049f\u04a2\5\u0090I\2\u04a0\u04a2\5\u0092J\2\u04a1\u049f\3\2\2\2\u04a1"+
		"\u04a0\3\2\2\2\u04a2]\3\2\2\2\u04a3\u04a4\7p\2\2\u04a4\u04a5\7\63\2\2"+
		"\u04a5\u04a7\t\b\2\2\u04a6\u04a3\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7_\3"+
		"\2\2\2\u04a8\u04a9\b\61\1\2\u04a9\u04f5\5\u0092J\2\u04aa\u04f5\7\u009d"+
		"\2\2\u04ab\u04ac\5\u00a4S\2\u04ac\u04ad\7\5\2\2\u04ad\u04af\3\2\2\2\u04ae"+
		"\u04ab\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\5\u00a8"+
		"U\2\u04b1\u04b2\7\5\2\2\u04b2\u04b4\3\2\2\2\u04b3\u04ae\3\2\2\2\u04b3"+
		"\u04b4\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04f5\5\u00aeX\2\u04b6\u04b7"+
		"\5\u0094K\2\u04b7\u04b8\5`\61\27\u04b8\u04f5\3\2\2\2\u04b9\u04ba\5\u00a2"+
		"R\2\u04ba\u04c7\7\6\2\2\u04bb\u04bd\7A\2\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd"+
		"\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c3\5`\61\2\u04bf\u04c0\7\b\2\2\u04c0"+
		"\u04c2\5`\61\2\u04c1\u04bf\3\2\2\2\u04c2\u04c5\3\2\2\2\u04c3\u04c1\3\2"+
		"\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c8\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c6"+
		"\u04c8\7\n\2\2\u04c7\u04bc\3\2\2\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2"+
		"\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\7\7\2\2\u04ca\u04f5\3\2\2\2\u04cb"+
		"\u04cc\7\6\2\2\u04cc\u04cd\5`\61\2\u04cd\u04ce\7\7\2\2\u04ce\u04f5\3\2"+
		"\2\2\u04cf\u04d0\7.\2\2\u04d0\u04d1\7\6\2\2\u04d1\u04d2\5`\61\2\u04d2"+
		"\u04d3\7$\2\2\u04d3\u04d4\5N(\2\u04d4\u04d5\7\7\2\2\u04d5\u04f5\3\2\2"+
		"\2\u04d6\u04d8\7k\2\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9"+
		"\3\2\2\2\u04d9\u04db\7J\2\2\u04da\u04d7\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04dc\3\2\2\2\u04dc\u04dd\7\6\2\2\u04dd\u04de\5B\"\2\u04de\u04df\7\7"+
		"\2\2\u04df\u04f5\3\2\2\2\u04e0\u04e2\7-\2\2\u04e1\u04e3\5`\61\2\u04e2"+
		"\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e9\3\2\2\2\u04e4\u04e5\7\u0097"+
		"\2\2\u04e5\u04e6\5`\61\2\u04e6\u04e7\7\u008b\2\2\u04e7\u04e8\5`\61\2\u04e8"+
		"\u04ea\3\2\2\2\u04e9\u04e4\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04e9\3\2"+
		"\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04ee\7D\2\2\u04ee"+
		"\u04f0\5`\61\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\3\2"+
		"\2\2\u04f1\u04f2\7E\2\2\u04f2\u04f5\3\2\2\2\u04f3\u04f5\5f\64\2\u04f4"+
		"\u04a8\3\2\2\2\u04f4\u04aa\3\2\2\2\u04f4\u04b3\3\2\2\2\u04f4\u04b6\3\2"+
		"\2\2\u04f4\u04b9\3\2\2\2\u04f4\u04cb\3\2\2\2\u04f4\u04cf\3\2\2\2\u04f4"+
		"\u04da\3\2\2\2\u04f4\u04e0\3\2\2\2\u04f4\u04f3\3\2\2\2\u04f5\u055a\3\2"+
		"\2\2\u04f6\u04f7\f\26\2\2\u04f7\u04f8\7\16\2\2\u04f8\u0559\5`\61\27\u04f9"+
		"\u04fa\f\25\2\2\u04fa\u04fb\t\t\2\2\u04fb\u0559\5`\61\26\u04fc\u04fd\f"+
		"\24\2\2\u04fd\u04fe\t\n\2\2\u04fe\u0559\5`\61\25\u04ff\u0500\f\23\2\2"+
		"\u0500\u0501\t\13\2\2\u0501\u0559\5`\61\24\u0502\u0503\f\22\2\2\u0503"+
		"\u0504\t\f\2\2\u0504\u0559\5`\61\23\u0505\u0512\f\21\2\2\u0506\u0513\7"+
		"\t\2\2\u0507\u0513\7\31\2\2\u0508\u0513\7\32\2\2\u0509\u0513\7\33\2\2"+
		"\u050a\u0513\7`\2\2\u050b\u050c\7`\2\2\u050c\u0513\7k\2\2\u050d\u0513"+
		"\7W\2\2\u050e\u0513\7e\2\2\u050f\u0513\7Q\2\2\u0510\u0513\7g\2\2\u0511"+
		"\u0513\7|\2\2\u0512\u0506\3\2\2\2\u0512\u0507\3\2\2\2\u0512\u0508\3\2"+
		"\2\2\u0512\u0509\3\2\2\2\u0512\u050a\3\2\2\2\u0512\u050b\3\2\2\2\u0512"+
		"\u050d\3\2\2\2\u0512\u050e\3\2\2\2\u0512\u050f\3\2\2\2\u0512\u0510\3\2"+
		"\2\2\u0512\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0559\5`\61\22\u0515"+
		"\u0516\f\20\2\2\u0516\u0517\7#\2\2\u0517\u0559\5`\61\21\u0518\u0519\f"+
		"\17\2\2\u0519\u051a\7r\2\2\u051a\u0559\5`\61\20\u051b\u051c\f\b\2\2\u051c"+
		"\u051e\7`\2\2\u051d\u051f\7k\2\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2"+
		"\2\u051f\u0520\3\2\2\2\u0520\u0559\5`\61\t\u0521\u0523\f\7\2\2\u0522\u0524"+
		"\7k\2\2\u0523\u0522\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525\3\2\2\2\u0525"+
		"\u0526\7*\2\2\u0526\u0527\5`\61\2\u0527\u0528\7#\2\2\u0528\u0529\5`\61"+
		"\b\u0529\u0559\3\2\2\2\u052a\u052b\f\13\2\2\u052b\u052c\7\60\2\2\u052c"+
		"\u0559\5\u00b0Y\2\u052d\u052f\f\n\2\2\u052e\u0530\7k\2\2\u052f\u052e\3"+
		"\2\2\2\u052f\u0530\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\t\r\2\2\u0532"+
		"\u0535\5`\61\2\u0533\u0534\7G\2\2\u0534\u0536\5`\61\2\u0535\u0533\3\2"+
		"\2\2\u0535\u0536\3\2\2\2\u0536\u0559\3\2\2\2\u0537\u053c\f\t\2\2\u0538"+
		"\u053d\7a\2\2\u0539\u053d\7l\2\2\u053a\u053b\7k\2\2\u053b\u053d\7m\2\2"+
		"\u053c\u0538\3\2\2\2\u053c\u0539\3\2\2\2\u053c\u053a\3\2\2\2\u053d\u0559"+
		"\3\2\2\2\u053e\u0540\f\6\2\2\u053f\u0541\7k\2\2\u0540\u053f\3\2\2\2\u0540"+
		"\u0541\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0556\7W\2\2\u0543\u054d\7\6"+
		"\2\2\u0544\u054e\5B\"\2\u0545\u054a\5`\61\2\u0546\u0547\7\b\2\2\u0547"+
		"\u0549\5`\61\2\u0548\u0546\3\2\2\2\u0549\u054c\3\2\2\2\u054a\u0548\3\2"+
		"\2\2\u054a\u054b\3\2\2\2\u054b\u054e\3\2\2\2\u054c\u054a\3\2\2\2\u054d"+
		"\u0544\3\2\2\2\u054d\u0545\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2"+
		"\2\2\u054f\u0557\7\7\2\2\u0550\u0551\5\u00a4S\2\u0551\u0552\7\5\2\2\u0552"+
		"\u0554\3\2\2\2\u0553\u0550\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555\3\2"+
		"\2\2\u0555\u0557\5\u00a8U\2\u0556\u0543\3\2\2\2\u0556\u0553\3\2\2\2\u0557"+
		"\u0559\3\2\2\2\u0558\u04f6\3\2\2\2\u0558\u04f9\3\2\2\2\u0558\u04fc\3\2"+
		"\2\2\u0558\u04ff\3\2\2\2\u0558\u0502\3\2\2\2\u0558\u0505\3\2\2\2\u0558"+
		"\u0515\3\2\2\2\u0558\u0518\3\2\2\2\u0558\u051b\3\2\2\2\u0558\u0521\3\2"+
		"\2\2\u0558\u052a\3\2\2\2\u0558\u052d\3\2\2\2\u0558\u0537\3\2\2\2\u0558"+
		"\u053e\3\2\2\2\u0559\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2"+
		"\2\2\u055ba\3\2\2\2\u055c\u055a\3\2\2\2\u055d\u0561\7{\2\2\u055e\u055f"+
		"\5\u00a4S\2\u055f\u0560\7\5\2\2\u0560\u0562\3\2\2\2\u0561\u055e\3\2\2"+
		"\2\u0561\u0562\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u056f\5\u00b2Z\2\u0564"+
		"\u0565\7\6\2\2\u0565\u056a\5d\63\2\u0566\u0567\7\b\2\2\u0567\u0569\5d"+
		"\63\2\u0568\u0566\3\2\2\2\u0569\u056c\3\2\2\2\u056a\u0568\3\2\2\2\u056a"+
		"\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c\u056a\3\2\2\2\u056d\u056e\7\7"+
		"\2\2\u056e\u0570\3\2\2\2\u056f\u0564\3\2\2\2\u056f\u0570\3\2\2\2\u0570"+
		"\u0583\3\2\2\2\u0571\u0572\7p\2\2\u0572\u057b\t\16\2\2\u0573\u0574\7\u0087"+
		"\2\2\u0574\u057c\7m\2\2\u0575\u0576\7\u0087\2\2\u0576\u057c\7;\2\2\u0577"+
		"\u057c\7,\2\2\u0578\u057c\7\u0081\2\2\u0579\u057a\7j\2\2\u057a\u057c\7"+
		"\35\2\2\u057b\u0573\3\2\2\2\u057b\u0575\3\2\2\2\u057b\u0577\3\2\2\2\u057b"+
		"\u0578\3\2\2\2\u057b\u0579\3\2\2\2\u057c\u0580\3\2\2\2\u057d\u057e\7g"+
		"\2\2\u057e\u0580\5\u00a0Q\2\u057f\u0571\3\2\2\2\u057f\u057d\3\2\2\2\u0580"+
		"\u0582\3\2\2\2\u0581\u057f\3\2\2\2\u0582\u0585\3\2\2\2\u0583\u0581\3\2"+
		"\2\2\u0583\u0584\3\2\2\2\u0584\u0593\3\2\2\2\u0585\u0583\3\2\2\2\u0586"+
		"\u0588\7k\2\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2"+
		"\2\2\u0589\u058e\7<\2\2\u058a\u058b\7Z\2\2\u058b\u058f\7=\2\2\u058c\u058d"+
		"\7Z\2\2\u058d\u058f\7V\2\2\u058e\u058a\3\2\2\2\u058e\u058c\3\2\2\2\u058e"+
		"\u058f\3\2\2\2\u058f\u0591\3\2\2\2\u0590\u0592\7F\2\2\u0591\u0590\3\2"+
		"\2\2\u0591\u0592\3\2\2\2\u0592\u0594\3\2\2\2\u0593\u0587\3\2\2\2\u0593"+
		"\u0594\3\2\2\2\u0594c\3\2\2\2\u0595\u0596\5\u00a0Q\2\u0596e\3\2\2\2\u0597"+
		"\u0598\7y\2\2\u0598\u059d\7\6\2\2\u0599\u059e\7U\2\2\u059a\u059b\t\17"+
		"\2\2\u059b\u059c\7\b\2\2\u059c\u059e\5\u0096L\2\u059d\u0599\3\2\2\2\u059d"+
		"\u059a\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a0\7\7\2\2\u05a0g\3\2\2\2"+
		"\u05a1\u05a4\5\u00aeX\2\u05a2\u05a3\7\60\2\2\u05a3\u05a5\5\u00b0Y\2\u05a4"+
		"\u05a2\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a7\3\2\2\2\u05a6\u05a8\t\7"+
		"\2\2\u05a7\u05a6\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8i\3\2\2\2\u05a9\u05aa"+
		"\7\64\2\2\u05aa\u05ac\5\u00a0Q\2\u05ab\u05a9\3\2\2\2\u05ab\u05ac\3\2\2"+
		"\2\u05ac\u05b6\3\2\2\2\u05ad\u05b7\5l\67\2\u05ae\u05b7\5r:\2\u05af\u05b7"+
		"\5p9\2\u05b0\u05b1\7/\2\2\u05b1\u05b2\7\6\2\2\u05b2\u05b3\5`\61\2\u05b3"+
		"\u05b4\7\7\2\2\u05b4\u05b7\3\2\2\2\u05b5\u05b7\5n8\2\u05b6\u05ad\3\2\2"+
		"\2\u05b6\u05ae\3\2\2\2\u05b6\u05af\3\2\2\2\u05b6\u05b0\3\2\2\2\u05b6\u05b5"+
		"\3\2\2\2\u05b7k\3\2\2\2\u05b8\u05b9\7w\2\2\u05b9\u05ba\7c\2\2\u05ba\u05bb"+
		"\7\6\2\2\u05bb\u05c0\5h\65\2\u05bc\u05bd\7\b\2\2\u05bd\u05bf\5h\65\2\u05be"+
		"\u05bc\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2"+
		"\2\2\u05c1\u05c3\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c4\7\7\2\2\u05c4"+
		"\u05c5\5^\60\2\u05c5m\3\2\2\2\u05c6\u05c7\7N\2\2\u05c7\u05c8\7c\2\2\u05c8"+
		"\u05c9\7\6\2\2\u05c9\u05ce\5t;\2\u05ca\u05cb\7\b\2\2\u05cb\u05cd\5t;\2"+
		"\u05cc\u05ca\3\2\2\2\u05cd\u05d0\3\2\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf"+
		"\3\2\2\2\u05cf\u05d1\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d1\u05d2\7\7\2\2\u05d2"+
		"\u05d3\5b\62\2\u05d3o\3\2\2\2\u05d4\u05d6\7\u0090\2\2\u05d5\u05d7\7c\2"+
		"\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9\3\2\2\2\u05d8\u05da"+
		"\5\u00a0Q\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05db\3\2\2"+
		"\2\u05db\u05dc\7\6\2\2\u05dc\u05e1\5h\65\2\u05dd\u05de\7\b\2\2\u05de\u05e0"+
		"\5h\65\2\u05df\u05dd\3\2\2\2\u05e0\u05e3\3\2\2\2\u05e1\u05df\3\2\2\2\u05e1"+
		"\u05e2\3\2\2\2\u05e2\u05e4\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e4\u05e5\7\7"+
		"\2\2\u05e5\u05e6\5^\60\2\u05e6q\3\2\2\2\u05e7\u05e9\7c\2\2\u05e8\u05ea"+
		"\5\u00a0Q\2\u05e9\u05e8\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05eb\3\2\2"+
		"\2\u05eb\u05ec\7\6\2\2\u05ec\u05f1\5h\65\2\u05ed\u05ee\7\b\2\2\u05ee\u05f0"+
		"\5h\65\2\u05ef\u05ed\3\2\2\2\u05f0\u05f3\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1"+
		"\u05f2\3\2\2\2\u05f2\u05f4\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f4\u05f5\7\7"+
		"\2\2\u05f5\u05f6\5^\60\2\u05f6s\3\2\2\2\u05f7\u05f8\5\u00aeX\2\u05f8u"+
		"\3\2\2\2\u05f9\u05fb\7\u0099\2\2\u05fa\u05fc\7z\2\2\u05fb\u05fa\3\2\2"+
		"\2\u05fb\u05fc\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\5\u008eH\2\u05fe"+
		"\u05ff\7$\2\2\u05ff\u0600\7\6\2\2\u0600\u0601\5B\"\2\u0601\u060b\7\7\2"+
		"\2\u0602\u0603\7\b\2\2\u0603\u0604\5\u008eH\2\u0604\u0605\7$\2\2\u0605"+
		"\u0606\7\6\2\2\u0606\u0607\5B\"\2\u0607\u0608\7\7\2\2\u0608\u060a\3\2"+
		"\2\2\u0609\u0602\3\2\2\2\u060a\u060d\3\2\2\2\u060b\u0609\3\2\2\2\u060b"+
		"\u060c\3\2\2\2\u060cw\3\2\2\2\u060d\u060b\3\2\2\2\u060e\u060f\5\u00a4"+
		"S\2\u060f\u0610\7\5\2\2\u0610\u0612\3\2\2\2\u0611\u060e\3\2\2\2\u0611"+
		"\u0612\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0619\5\u00a8U\2\u0614\u0615"+
		"\7Y\2\2\u0615\u0616\7+\2\2\u0616\u061a\5\u00b4[\2\u0617\u0618\7k\2\2\u0618"+
		"\u061a\7Y\2\2\u0619\u0614\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2"+
		"\2\2\u061ay\3\2\2\2\u061b\u061e\5`\61\2\u061c\u061d\7\60\2\2\u061d\u061f"+
		"\5\u00b0Y\2\u061e\u061c\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0621\3\2\2"+
		"\2\u0620\u0622\t\7\2\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2\2\2\u0622{"+
		"\3\2\2\2\u0623\u0627\5\u0090I\2\u0624\u0627\5\u00a0Q\2\u0625\u0627\7\u009e"+
		"\2\2\u0626\u0623\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0625\3\2\2\2\u0627"+
		"}\3\2\2\2\u0628\u0634\5\u00a8U\2\u0629\u062a\7\6\2\2\u062a\u062f\5\u00ae"+
		"X\2\u062b\u062c\7\b\2\2\u062c\u062e\5\u00aeX\2\u062d\u062b\3\2\2\2\u062e"+
		"\u0631\3\2\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\3\2"+
		"\2\2\u0631\u062f\3\2\2\2\u0632\u0633\7\7\2\2\u0633\u0635\3\2\2\2\u0634"+
		"\u0629\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0637\7$"+
		"\2\2\u0637\u0638\7\6\2\2\u0638\u0639\5B\"\2\u0639\u063a\7\7\2\2\u063a"+
		"\177\3\2\2\2\u063b\u0648\7\n\2\2\u063c\u063d\5\u00a8U\2\u063d\u063e\7"+
		"\5\2\2\u063e\u063f\7\n\2\2\u063f\u0648\3\2\2\2\u0640\u0645\5`\61\2\u0641"+
		"\u0643\7$\2\2\u0642\u0641\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0644\3\2"+
		"\2\2\u0644\u0646\5\u009aN\2\u0645\u0642\3\2\2\2\u0645\u0646\3\2\2\2\u0646"+
		"\u0648\3\2\2\2\u0647\u063b\3\2\2\2\u0647\u063c\3\2\2\2\u0647\u0640\3\2"+
		"\2\2\u0648\u0081\3\2\2\2\u0649\u064a\5\u00a4S\2\u064a\u064b\7\5\2\2\u064b"+
		"\u064d\3\2\2\2\u064c\u0649\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\3\2"+
		"\2\2\u064e\u0653\5\u00a8U\2\u064f\u0651\7$\2\2\u0650\u064f\3\2\2\2\u0650"+
		"\u0651\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0654\5\u00c0a\2\u0653\u0650"+
		"\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u065a\3\2\2\2\u0655\u0656\7Y\2\2\u0656"+
		"\u0657\7+\2\2\u0657\u065b\5\u00b4[\2\u0658\u0659\7k\2\2\u0659\u065b\7"+
		"Y\2\2\u065a\u0655\3\2\2\2\u065a\u0658\3\2\2\2\u065a\u065b\3\2\2\2\u065b"+
		"\u0679\3\2\2\2\u065c\u0666\7\6\2\2\u065d\u0662\5\u0082B\2\u065e\u065f"+
		"\7\b\2\2\u065f\u0661\5\u0082B\2\u0660\u065e\3\2\2\2\u0661\u0664\3\2\2"+
		"\2\u0662\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0667\3\2\2\2\u0664\u0662"+
		"\3\2\2\2\u0665\u0667\5\u0084C\2\u0666\u065d\3\2\2\2\u0666\u0665\3\2\2"+
		"\2\u0667\u0668\3\2\2\2\u0668\u066d\7\7\2\2\u0669\u066b\7$\2\2\u066a\u0669"+
		"\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066e\5\u00c0a"+
		"\2\u066d\u066a\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0679\3\2\2\2\u066f\u0670"+
		"\7\6\2\2\u0670\u0671\5B\"\2\u0671\u0676\7\7\2\2\u0672\u0674\7$\2\2\u0673"+
		"\u0672\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\5\u00c0"+
		"a\2\u0676\u0673\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0679\3\2\2\2\u0678"+
		"\u064c\3\2\2\2\u0678\u065c\3\2\2\2\u0678\u066f\3\2\2\2\u0679\u0083\3\2"+
		"\2\2\u067a\u0681\5\u0082B\2\u067b\u067c\5\u0086D\2\u067c\u067d\5\u0082"+
		"B\2\u067d\u067e\5\u0088E\2\u067e\u0680\3\2\2\2\u067f\u067b\3\2\2\2\u0680"+
		"\u0683\3\2\2\2\u0681\u067f\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0085\3\2"+
		"\2\2\u0683\u0681\3\2\2\2\u0684\u0692\7\b\2\2\u0685\u0687\7h\2\2\u0686"+
		"\u0685\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u068e\3\2\2\2\u0688\u068a\7d"+
		"\2\2\u0689\u068b\7t\2\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b"+
		"\u068f\3\2\2\2\u068c\u068f\7[\2\2\u068d\u068f\7\66\2\2\u068e\u0688\3\2"+
		"\2\2\u068e\u068c\3\2\2\2\u068e\u068d\3\2\2\2\u068e\u068f\3\2\2\2\u068f"+
		"\u0690\3\2\2\2\u0690\u0692\7b\2\2\u0691\u0684\3\2\2\2\u0691\u0686\3\2"+
		"\2\2\u0692\u0087\3\2\2\2\u0693\u0694\7p\2\2\u0694\u06a2\5`\61\2\u0695"+
		"\u0696\7\u0092\2\2\u0696\u0697\7\6\2\2\u0697\u069c\5\u00aeX\2\u0698\u0699"+
		"\7\b\2\2\u0699\u069b\5\u00aeX\2\u069a\u0698\3\2\2\2\u069b\u069e\3\2\2"+
		"\2\u069c\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f\3\2\2\2\u069e\u069c"+
		"\3\2\2\2\u069f\u06a0\7\7\2\2\u06a0\u06a2\3\2\2\2\u06a1\u0693\3\2\2\2\u06a1"+
		"\u0695\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u0089\3\2\2\2\u06a3\u06a5\7\u0086"+
		"\2\2\u06a4\u06a6\t\6\2\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6"+
		"\u06a7\3\2\2\2\u06a7\u06ac\5\u0080A\2\u06a8\u06a9\7\b\2\2\u06a9\u06ab"+
		"\5\u0080A\2\u06aa\u06a8\3\2\2\2\u06ab\u06ae\3\2\2\2\u06ac\u06aa\3\2\2"+
		"\2\u06ac\u06ad\3\2\2\2\u06ad\u06bb\3\2\2\2\u06ae\u06ac\3\2\2\2\u06af\u06b9"+
		"\7O\2\2\u06b0\u06b5\5\u0082B\2\u06b1\u06b2\7\b\2\2\u06b2\u06b4\5\u0082"+
		"B\2\u06b3\u06b1\3\2\2\2\u06b4\u06b7\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b5"+
		"\u06b6\3\2\2\2\u06b6\u06ba\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b8\u06ba\5\u0084"+
		"C\2\u06b9\u06b0\3\2\2\2\u06b9\u06b8\3\2\2\2\u06ba\u06bc\3\2\2\2\u06bb"+
		"\u06af\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06bf\3\2\2\2\u06bd\u06be\7\u0098"+
		"\2\2\u06be\u06c0\5`\61\2\u06bf\u06bd\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0"+
		"\u06cf\3\2\2\2\u06c1\u06c2\7R\2\2\u06c2\u06c3\7+\2\2\u06c3\u06c8\5`\61"+
		"\2\u06c4\u06c5\7\b\2\2\u06c5\u06c7\5`\61\2\u06c6\u06c4\3\2\2\2\u06c7\u06ca"+
		"\3\2\2\2\u06c8\u06c6\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06cd\3\2\2\2\u06ca"+
		"\u06c8\3\2\2\2\u06cb\u06cc\7S\2\2\u06cc\u06ce\5`\61\2\u06cd\u06cb\3\2"+
		"\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d0\3\2\2\2\u06cf\u06c1\3\2\2\2\u06cf"+
		"\u06d0\3\2\2\2\u06d0\u06ee\3\2\2\2\u06d1\u06d2\7\u0094\2\2\u06d2\u06d3"+
		"\7\6\2\2\u06d3\u06d8\5`\61\2\u06d4\u06d5\7\b\2\2\u06d5\u06d7\5`\61\2\u06d6"+
		"\u06d4\3\2\2\2\u06d7\u06da\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d8\u06d9\3\2"+
		"\2\2\u06d9\u06db\3\2\2\2\u06da\u06d8\3\2\2\2\u06db\u06ea\7\7\2\2\u06dc"+
		"\u06dd\7\b\2\2\u06dd\u06de\7\6\2\2\u06de\u06e3\5`\61\2\u06df\u06e0\7\b"+
		"\2\2\u06e0\u06e2\5`\61\2\u06e1\u06df\3\2\2\2\u06e2\u06e5\3\2\2\2\u06e3"+
		"\u06e1\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06e3\3\2"+
		"\2\2\u06e6\u06e7\7\7\2\2\u06e7\u06e9\3\2\2\2\u06e8\u06dc\3\2\2\2\u06e9"+
		"\u06ec\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ee\3\2"+
		"\2\2\u06ec\u06ea\3\2\2\2\u06ed\u06a3\3\2\2\2\u06ed\u06d1\3\2\2\2\u06ee"+
		"\u008b\3\2\2\2\u06ef\u06f5\7\u008f\2\2\u06f0\u06f1\7\u008f\2\2\u06f1\u06f5"+
		"\7 \2\2\u06f2\u06f5\7^\2\2\u06f3\u06f5\7H\2\2\u06f4\u06ef\3\2\2\2\u06f4"+
		"\u06f0\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f4\u06f3\3\2\2\2\u06f5\u008d\3\2"+
		"\2\2\u06f6\u0702\5\u00a8U\2\u06f7\u06f8\7\6\2\2\u06f8\u06fd\5\u00aeX\2"+
		"\u06f9\u06fa\7\b\2\2\u06fa\u06fc\5\u00aeX\2\u06fb\u06f9\3\2\2\2\u06fc"+
		"\u06ff\3\2\2\2\u06fd\u06fb\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0700\3\2"+
		"\2\2\u06ff\u06fd\3\2\2\2\u0700\u0701\7\7\2\2\u0701\u0703\3\2\2\2\u0702"+
		"\u06f7\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u008f\3\2\2\2\u0704\u0706\t\n"+
		"\2\2\u0705\u0704\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0707\3\2\2\2\u0707"+
		"\u070a\7\u009c\2\2\u0708\u070a\7\n\2\2\u0709\u0705\3\2\2\2\u0709\u0708"+
		"\3\2\2\2\u070a\u0091\3\2\2\2\u070b\u070c\t\20\2\2\u070c\u0093\3\2\2\2"+
		"\u070d\u070e\t\21\2\2\u070e\u0095\3\2\2\2\u070f\u0710\7\u009e\2\2\u0710"+
		"\u0097\3\2\2\2\u0711\u0714\5`\61\2\u0712\u0714\5L\'\2\u0713\u0711\3\2"+
		"\2\2\u0713\u0712\3\2\2\2\u0714\u0099\3\2\2\2\u0715\u0716\t\22\2\2\u0716"+
		"\u009b\3\2\2\2\u0717\u0718\t\23\2\2\u0718\u009d\3\2\2\2\u0719\u071b\13"+
		"\2\2\2\u071a\u0719\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071a\3\2\2\2\u071c"+
		"\u071d\3\2\2\2\u071d\u009f\3\2\2\2\u071e\u071f\5\u00c4c\2\u071f\u00a1"+
		"\3\2\2\2\u0720\u0721\5\u00c4c\2\u0721\u00a3\3\2\2\2\u0722\u0723\5\u00c4"+
		"c\2\u0723\u00a5\3\2\2\2\u0724\u0725\5\u00c4c\2\u0725\u00a7\3\2\2\2\u0726"+
		"\u0727\5\u00c4c\2\u0727\u00a9\3\2\2\2\u0728\u0729\5\u00c4c\2\u0729\u00ab"+
		"\3\2\2\2\u072a\u072b\5\u00c4c\2\u072b\u00ad\3\2\2\2\u072c\u072d\5\u00c4"+
		"c\2\u072d\u00af\3\2\2\2\u072e\u072f\5\u00c4c\2\u072f\u00b1\3\2\2\2\u0730"+
		"\u0731\5\u00c4c\2\u0731\u00b3\3\2\2\2\u0732\u0733\5\u00c4c\2\u0733\u00b5"+
		"\3\2\2\2\u0734\u0735\5\u00c4c\2\u0735\u00b7\3\2\2\2\u0736\u0737\5\u00c4"+
		"c\2\u0737\u00b9\3\2\2\2\u0738\u0739\5\u00c4c\2\u0739\u00bb\3\2\2\2\u073a"+
		"\u073b\5\u00c4c\2\u073b\u00bd\3\2\2\2\u073c\u073d\5\u00c4c\2\u073d\u00bf"+
		"\3\2\2\2\u073e\u073f\5\u00c4c\2\u073f\u00c1\3\2\2\2\u0740\u0741\5\u00c4"+
		"c\2\u0741\u00c3\3\2\2\2\u0742\u074a\7\u009b\2\2\u0743\u074a\5\u009cO\2"+
		"\u0744\u074a\7\u009e\2\2\u0745\u0746\7\6\2\2\u0746\u0747\5\u00c4c\2\u0747"+
		"\u0748\7\7\2\2\u0748\u074a\3\2\2\2\u0749\u0742\3\2\2\2\u0749\u0743\3\2"+
		"\2\2\u0749\u0744\3\2\2\2\u0749\u0745\3\2\2\2\u074a\u00c5\3\2\2\2\u0106"+
		"\u00c8\u00ca\u00d5\u00dc\u00e1\u00e7\u00ed\u00ef\u010f\u0114\u0119\u0123"+
		"\u0126\u0129\u012c\u013d\u0141\u0149\u014d\u014f\u0154\u0156\u015a\u0161"+
		"\u0164\u0169\u016d\u0172\u017b\u017e\u0184\u0186\u018a\u0190\u0195\u01a0"+
		"\u01a6\u01aa\u01b0\u01b5\u01be\u01c0\u01c6\u01ca\u01cd\u01d1\u01d7\u01dc"+
		"\u01e3\u01ee\u01f1\u01f3\u01f9\u01ff\u0203\u020a\u0210\u0216\u021c\u0221"+
		"\u022d\u0232\u023d\u0242\u0245\u024c\u024f\u0256\u025f\u0262\u0268\u026a"+
		"\u026e\u0276\u027b\u0283\u0288\u0290\u0295\u029d\u02a2\u02a8\u02af\u02b2"+
		"\u02ba\u02c4\u02c7\u02cd\u02cf\u02d2\u02e5\u02eb\u02f4\u02f9\u0302\u030d"+
		"\u0314\u031a\u0320\u0329\u0330\u0334\u0336\u033a\u0341\u0343\u0347\u034a"+
		"\u0351\u0358\u035b\u0365\u0368\u036e\u0370\u0374\u037b\u037e\u0386\u0390"+
		"\u0393\u0399\u039b\u039f\u03a6\u03af\u03b3\u03b5\u03b9\u03c2\u03c7\u03c9"+
		"\u03d2\u03dd\u03e4\u03e7\u03ea\u03f7\u0405\u040a\u040d\u041a\u0428\u042d"+
		"\u0436\u0439\u043f\u0441\u0448\u044a\u0451\u0458\u045d\u0461\u0465\u0475"+
		"\u047a\u047e\u0495\u049b\u049d\u04a1\u04a6\u04ae\u04b3\u04bc\u04c3\u04c7"+
		"\u04d7\u04da\u04e2\u04eb\u04ef\u04f4\u0512\u051e\u0523\u052f\u0535\u053c"+
		"\u0540\u054a\u054d\u0553\u0556\u0558\u055a\u0561\u056a\u056f\u057b\u057f"+
		"\u0583\u0587\u058e\u0591\u0593\u059d\u05a4\u05a7\u05ab\u05b6\u05c0\u05ce"+
		"\u05d6\u05d9\u05e1\u05e9\u05f1\u05fb\u060b\u0611\u0619\u061e\u0621\u0626"+
		"\u062f\u0634\u0642\u0645\u0647\u064c\u0650\u0653\u065a\u0662\u0666\u066a"+
		"\u066d\u0673\u0676\u0678\u0681\u0686\u068a\u068e\u0691\u069c\u06a1\u06a5"+
		"\u06ac\u06b5\u06b9\u06bb\u06bf\u06c8\u06cd\u06cf\u06d8\u06e3\u06ea\u06ed"+
		"\u06f4\u06fd\u0702\u0705\u0709\u0713\u071c\u0749";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}