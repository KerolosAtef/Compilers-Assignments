// Generated from D:/Havana Oh Na Na/CoolParser/src\coolParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class coolParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, INHERITS=2, CASE=3, CLASS=4, FOR=5, DOT=6, ELSE=7, FI=8, ESAC=9, 
		FALSE=10, TRUE=11, IN=12, ISVOID=13, LET=14, LOOP=15, POOL=16, NOT=17, 
		OF=18, NEW=19, THEN=20, WHILE=21, SEMICOLON=22, TILDE=23, LPAREN=24, RPAREN=25, 
		COLON=26, COMMA=27, LARROW=28, RARROW=29, LBRACE=30, RBRACE=31, MINAOP=32, 
		OPS=33, ID=34, TYPE=35, Integer=36, String=37, Whitespace=38, ADDOPS=39, 
		MULOPS=40, ERROR=41;
	public static final int
		RULE_vals = 0, RULE_instance = 1, RULE_var_assign = 2, RULE_var_dec = 3, 
		RULE_var = 4, RULE_math_expr = 5, RULE_cond_stmt = 6, RULE_param = 7, 
		RULE_func_call = 8, RULE_stmt = 9, RULE_code_block = 10, RULE_loop = 11, 
		RULE_ourcase = 12, RULE_if_stmt = 13, RULE_let = 14, RULE_function = 15, 
		RULE_our_class = 16, RULE_our_program = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"vals", "instance", "var_assign", "var_dec", "var", "math_expr", "cond_stmt", 
			"param", "func_call", "stmt", "code_block", "loop", "ourcase", "if_stmt", 
			"let", "function", "our_class", "our_program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'.'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "';'", "'~'", 
			"'('", "')'", "':'", "','", "'<-'", "'->'", "'{'", "'}'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "INHERITS", "CASE", "CLASS", "FOR", "DOT", "ELSE", "FI", 
			"ESAC", "FALSE", "TRUE", "IN", "ISVOID", "LET", "LOOP", "POOL", "NOT", 
			"OF", "NEW", "THEN", "WHILE", "SEMICOLON", "TILDE", "LPAREN", "RPAREN", 
			"COLON", "COMMA", "LARROW", "RARROW", "LBRACE", "RBRACE", "MINAOP", "OPS", 
			"ID", "TYPE", "Integer", "String", "Whitespace", "ADDOPS", "MULOPS", 
			"ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "coolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public coolParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ValsContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(coolParserParser.String, 0); }
		public TerminalNode FALSE() { return getToken(coolParserParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(coolParserParser.TRUE, 0); }
		public OurcaseContext ourcase() {
			return getRuleContext(OurcaseContext.class,0);
		}
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public ValsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterVals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitVals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitVals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValsContext vals() throws RecognitionException {
		ValsContext _localctx = new ValsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				setState(36);
				match(String);
				}
				break;
			case FALSE:
				{
				setState(37);
				match(FALSE);
				}
				break;
			case TRUE:
				{
				setState(38);
				match(TRUE);
				}
				break;
			case CASE:
				{
				setState(39);
				ourcase();
				}
				break;
			case TILDE:
			case LPAREN:
			case ID:
			case Integer:
			case ADDOPS:
				{
				setState(40);
				math_expr(0);
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

	public static class InstanceContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(coolParserParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(coolParserParser.TYPE, 0); }
		public InstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceContext instance() throws RecognitionException {
		InstanceContext _localctx = new InstanceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(NEW);
			setState(44);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_assignContext extends ParserRuleContext {
		public TerminalNode LARROW() { return getToken(coolParserParser.LARROW, 0); }
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public InstanceContext instance() {
			return getRuleContext(InstanceContext.class,0);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitVar_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(LARROW);
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case FALSE:
			case TRUE:
			case TILDE:
			case LPAREN:
			case ID:
			case Integer:
			case String:
			case ADDOPS:
				{
				setState(47);
				vals();
				}
				break;
			case NEW:
				{
				setState(48);
				instance();
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

	public static class Var_decContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(coolParserParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(coolParserParser.TYPE, 0); }
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitVar_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitVar_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(51);
			match(COLON);
			setState(52);
			match(TYPE);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(coolParserParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(coolParserParser.SEMICOLON, 0); }
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ID);
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(55);
					var_dec();
					}
				}

				setState(58);
				var_assign();
				}
				break;
			case 2:
				{
				setState(59);
				var_dec();
				}
				break;
			}
			setState(62);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_exprContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(coolParserParser.Integer, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(coolParserParser.TILDE, 0); }
		public TerminalNode ID() { return getToken(coolParserParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(coolParserParser.LPAREN, 0); }
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(coolParserParser.RPAREN, 0); }
		public TerminalNode ADDOPS() { return getToken(coolParserParser.ADDOPS, 0); }
		public TerminalNode MULOPS() { return getToken(coolParserParser.MULOPS, 0); }
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterMath_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitMath_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		return math_expr(0);
	}

	private Math_exprContext math_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_exprContext _localctx = new Math_exprContext(_ctx, _parentState);
		Math_exprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_math_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					{
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TILDE) {
						{
						setState(65);
						match(TILDE);
						}
					}

					setState(68);
					match(Integer);
					}
					}
					break;
				case 2:
					{
					{
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TILDE) {
						{
						setState(69);
						match(TILDE);
						}
					}

					setState(72);
					func_call();
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TILDE) {
					{
					setState(75);
					match(TILDE);
					}
				}

				setState(78);
				match(ID);
				}
				break;
			case 3:
				{
				setState(79);
				match(LPAREN);
				setState(80);
				math_expr(0);
				setState(81);
				match(RPAREN);
				}
				break;
			case 4:
				{
				{
				setState(83);
				match(ADDOPS);
				}
				setState(84);
				math_expr(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(87);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(88);
						match(MULOPS);
						}
						setState(89);
						math_expr(3);
						}
						break;
					case 2:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(90);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						{
						setState(91);
						match(ADDOPS);
						}
						setState(92);
						math_expr(2);
						}
						break;
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Cond_stmtContext extends ParserRuleContext {
		public List<ValsContext> vals() {
			return getRuleContexts(ValsContext.class);
		}
		public ValsContext vals(int i) {
			return getRuleContext(ValsContext.class,i);
		}
		public TerminalNode OPS() { return getToken(coolParserParser.OPS, 0); }
		public TerminalNode NOT() { return getToken(coolParserParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(coolParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(coolParserParser.RPAREN, 0); }
		public Cond_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterCond_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitCond_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitCond_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_stmtContext cond_stmt() throws RecognitionException {
		Cond_stmtContext _localctx = new Cond_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond_stmt);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(98);
						match(NOT);
						}
					}

					{
					setState(101);
					vals();
					setState(102);
					match(OPS);
					setState(103);
					vals();
					}
					}
					break;
				case 2:
					{
					setState(105);
					vals();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(108);
					match(LPAREN);
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(109);
						match(NOT);
						}
					}

					{
					setState(112);
					vals();
					setState(113);
					match(OPS);
					setState(114);
					vals();
					}
					}
					break;
				case 2:
					{
					setState(116);
					vals();
					setState(117);
					match(RPAREN);
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

	public static class ParamContext extends ParserRuleContext {
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public InstanceContext instance() {
			return getRuleContext(InstanceContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case FALSE:
			case TRUE:
			case TILDE:
			case LPAREN:
			case ID:
			case Integer:
			case String:
			case ADDOPS:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				vals();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				instance();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(coolParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(coolParserParser.ID, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(coolParserParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(coolParserParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(coolParserParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(coolParserParser.RPAREN, i);
		}
		public TerminalNode DOT() { return getToken(coolParserParser.DOT, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(coolParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(coolParserParser.COMMA, i);
		}
		public InstanceContext instance() {
			return getRuleContext(InstanceContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(127);
					match(ID);
					}
					break;
				case LPAREN:
					{
					{
					setState(128);
					match(LPAREN);
					setState(129);
					instance();
					setState(130);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134);
				match(DOT);
				}
				break;
			}
			setState(137);
			match(ID);
			setState(138);
			match(LPAREN);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << FALSE) | (1L << TRUE) | (1L << NEW) | (1L << TILDE) | (1L << LPAREN) | (1L << ID) | (1L << Integer) | (1L << String) | (1L << ADDOPS))) != 0)) {
				{
				setState(139);
				param();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(140);
					match(COMMA);
					setState(141);
					param();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(149);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public TerminalNode ID() { return getToken(coolParserParser.ID, 0); }
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				vals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(152);
				match(ID);
				setState(153);
				var_assign();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				let();
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

	public static class Code_blockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(coolParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(coolParserParser.RBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(coolParserParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(coolParserParser.SEMICOLON, i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case CASE:
			case FALSE:
			case TRUE:
			case LET:
			case WHILE:
			case TILDE:
			case LPAREN:
			case ID:
			case Integer:
			case String:
			case ADDOPS:
				{
				setState(159);
				stmt();
				}
				break;
			case LBRACE:
				{
				{
				setState(160);
				match(LBRACE);
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					stmt();
					setState(162);
					match(SEMICOLON);
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << FALSE) | (1L << TRUE) | (1L << LET) | (1L << WHILE) | (1L << TILDE) | (1L << LPAREN) | (1L << ID) | (1L << Integer) | (1L << String) | (1L << ADDOPS))) != 0) );
				setState(168);
				match(RBRACE);
				}
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(coolParserParser.WHILE, 0); }
		public Cond_stmtContext cond_stmt() {
			return getRuleContext(Cond_stmtContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(coolParserParser.LOOP, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode POOL() { return getToken(coolParserParser.POOL, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(WHILE);
			setState(173);
			cond_stmt();
			setState(174);
			match(LOOP);
			setState(175);
			code_block();
			setState(176);
			match(POOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OurcaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(coolParserParser.CASE, 0); }
		public List<TerminalNode> ID() { return getTokens(coolParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(coolParserParser.ID, i);
		}
		public TerminalNode OF() { return getToken(coolParserParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(coolParserParser.ESAC, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(coolParserParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(coolParserParser.SEMICOLON, i);
		}
		public List<Var_decContext> var_dec() {
			return getRuleContexts(Var_decContext.class);
		}
		public Var_decContext var_dec(int i) {
			return getRuleContext(Var_decContext.class,i);
		}
		public List<TerminalNode> MINAOP() { return getTokens(coolParserParser.MINAOP); }
		public TerminalNode MINAOP(int i) {
			return getToken(coolParserParser.MINAOP, i);
		}
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public OurcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ourcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterOurcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitOurcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitOurcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OurcaseContext ourcase() throws RecognitionException {
		OurcaseContext _localctx = new OurcaseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ourcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(CASE);
			setState(179);
			match(ID);
			setState(180);
			match(OF);
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(181);
				match(ID);
				setState(182);
				var_dec();
				setState(183);
				match(MINAOP);
				setState(184);
				code_block();
				}
				setState(186);
				match(SEMICOLON);
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(192);
			match(ESAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(coolParserParser.IF, 0); }
		public Cond_stmtContext cond_stmt() {
			return getRuleContext(Cond_stmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(coolParserParser.THEN, 0); }
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(coolParserParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(coolParserParser.FI, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IF);
			setState(195);
			cond_stmt();
			setState(196);
			match(THEN);
			setState(197);
			code_block();
			setState(198);
			match(ELSE);
			setState(199);
			code_block();
			setState(200);
			match(FI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(coolParserParser.LET, 0); }
		public TerminalNode IN() { return getToken(coolParserParser.IN, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(coolParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(coolParserParser.ID, i);
		}
		public List<Var_decContext> var_dec() {
			return getRuleContexts(Var_decContext.class);
		}
		public Var_decContext var_dec(int i) {
			return getRuleContext(Var_decContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(coolParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(coolParserParser.COMMA, i);
		}
		public List<Var_assignContext> var_assign() {
			return getRuleContexts(Var_assignContext.class);
		}
		public Var_assignContext var_assign(int i) {
			return getRuleContext(Var_assignContext.class,i);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(LET);
			{
			setState(203);
			match(ID);
			setState(204);
			var_dec();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LARROW) {
				{
				setState(205);
				var_assign();
				}
			}

			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(208);
				match(COMMA);
				setState(209);
				match(ID);
				setState(210);
				var_dec();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LARROW) {
					{
					setState(211);
					var_assign();
					}
				}

				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(IN);
			setState(220);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(coolParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(coolParserParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(coolParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(coolParserParser.RPAREN, 0); }
		public List<Var_decContext> var_dec() {
			return getRuleContexts(Var_decContext.class);
		}
		public Var_decContext var_dec(int i) {
			return getRuleContext(Var_decContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(coolParserParser.LBRACE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(coolParserParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(coolParserParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(coolParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(coolParserParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
			setState(223);
			match(LPAREN);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(224);
				match(ID);
				setState(225);
				var_dec();
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(227);
					match(COMMA);
					{
					setState(228);
					match(ID);
					setState(229);
					var_dec();
					}
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(237);
			match(RPAREN);
			setState(238);
			var_dec();
			setState(239);
			match(LBRACE);
			setState(240);
			code_block();
			setState(241);
			match(RBRACE);
			setState(242);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Our_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(coolParserParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(coolParserParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(coolParserParser.TYPE, i);
		}
		public TerminalNode LBRACE() { return getToken(coolParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(coolParserParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(coolParserParser.SEMICOLON, 0); }
		public TerminalNode INHERITS() { return getToken(coolParserParser.INHERITS, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public Our_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_our_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterOur_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitOur_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitOur_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Our_classContext our_class() throws RecognitionException {
		Our_classContext _localctx = new Our_classContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_our_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CLASS);
			setState(245);
			match(TYPE);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(246);
				match(INHERITS);
				setState(247);
				match(TYPE);
				}
			}

			setState(250);
			match(LBRACE);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(251);
					var();
					}
					break;
				case 2:
					{
					setState(252);
					function();
					}
					break;
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(RBRACE);
			setState(259);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Our_programContext extends ParserRuleContext {
		public List<Our_classContext> our_class() {
			return getRuleContexts(Our_classContext.class);
		}
		public Our_classContext our_class(int i) {
			return getRuleContext(Our_classContext.class,i);
		}
		public Our_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_our_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).enterOur_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof coolParserListener ) ((coolParserListener)listener).exitOur_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof coolParserVisitor ) return ((coolParserVisitor<? extends T>)visitor).visitOur_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Our_programContext our_program() throws RecognitionException {
		Our_programContext _localctx = new Our_programContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_our_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(261);
				our_class();
				}
				}
				setState(266);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return math_expr_sempred((Math_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_expr_sempred(Math_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u010e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\5\2,\n\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4\64"+
		"\n\4\3\5\3\5\3\5\3\6\3\6\5\6;\n\6\3\6\3\6\5\6?\n\6\3\6\3\6\3\7\3\7\5\7"+
		"E\n\7\3\7\3\7\5\7I\n\7\3\7\5\7L\n\7\3\7\5\7O\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7X\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7`\n\7\f\7\16\7c\13\7\3\b\5"+
		"\bf\n\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\5\bq\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bz\n\b\5\b|\n\b\3\t\3\t\5\t\u0080\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0087\n\n\3\n\5\n\u008a\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u0091\n\n\f"+
		"\n\16\n\u0094\13\n\5\n\u0096\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00a0\n\13\3\f\3\f\3\f\3\f\3\f\6\f\u00a7\n\f\r\f\16\f\u00a8\3\f"+
		"\3\f\5\f\u00ad\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\6\16\u00bf\n\16\r\16\16\16\u00c0\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00d1\n\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00d7\n\20\7\20\u00d9\n\20\f\20\16\20\u00dc"+
		"\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e9"+
		"\n\21\f\21\16\21\u00ec\13\21\5\21\u00ee\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00fb\n\22\3\22\3\22\3\22\7\22\u0100"+
		"\n\22\f\22\16\22\u0103\13\22\3\22\3\22\3\22\3\23\7\23\u0109\n\23\f\23"+
		"\16\23\u010c\13\23\3\23\2\3\f\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\2\2\u0125\2+\3\2\2\2\4-\3\2\2\2\6\60\3\2\2\2\b\65\3\2\2\2\n8\3"+
		"\2\2\2\fW\3\2\2\2\16{\3\2\2\2\20\177\3\2\2\2\22\u0089\3\2\2\2\24\u009f"+
		"\3\2\2\2\26\u00ac\3\2\2\2\30\u00ae\3\2\2\2\32\u00b4\3\2\2\2\34\u00c4\3"+
		"\2\2\2\36\u00cc\3\2\2\2 \u00e0\3\2\2\2\"\u00f6\3\2\2\2$\u010a\3\2\2\2"+
		"&,\7\'\2\2\',\7\f\2\2(,\7\r\2\2),\5\32\16\2*,\5\f\7\2+&\3\2\2\2+\'\3\2"+
		"\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\3\3\2\2\2-.\7\25\2\2./\7%\2\2/\5\3"+
		"\2\2\2\60\63\7\36\2\2\61\64\5\2\2\2\62\64\5\4\3\2\63\61\3\2\2\2\63\62"+
		"\3\2\2\2\64\7\3\2\2\2\65\66\7\34\2\2\66\67\7%\2\2\67\t\3\2\2\28>\7$\2"+
		"\29;\5\b\5\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<?\5\6\4\2=?\5\b\5\2>:\3\2\2"+
		"\2>=\3\2\2\2?@\3\2\2\2@A\7\30\2\2A\13\3\2\2\2BK\b\7\1\2CE\7\31\2\2DC\3"+
		"\2\2\2DE\3\2\2\2EF\3\2\2\2FL\7&\2\2GI\7\31\2\2HG\3\2\2\2HI\3\2\2\2IJ\3"+
		"\2\2\2JL\5\22\n\2KD\3\2\2\2KH\3\2\2\2LX\3\2\2\2MO\7\31\2\2NM\3\2\2\2N"+
		"O\3\2\2\2OP\3\2\2\2PX\7$\2\2QR\7\32\2\2RS\5\f\7\2ST\7\33\2\2TX\3\2\2\2"+
		"UV\7)\2\2VX\5\f\7\5WB\3\2\2\2WN\3\2\2\2WQ\3\2\2\2WU\3\2\2\2Xa\3\2\2\2"+
		"YZ\f\4\2\2Z[\7*\2\2[`\5\f\7\5\\]\f\3\2\2]^\7)\2\2^`\5\f\7\4_Y\3\2\2\2"+
		"_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\r\3\2\2\2ca\3\2\2\2df\7\23"+
		"\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\5\2\2\2hi\7#\2\2ij\5\2\2\2jm\3\2"+
		"\2\2km\5\2\2\2le\3\2\2\2lk\3\2\2\2m|\3\2\2\2np\7\32\2\2oq\7\23\2\2po\3"+
		"\2\2\2pq\3\2\2\2qr\3\2\2\2rs\5\2\2\2st\7#\2\2tu\5\2\2\2uz\3\2\2\2vw\5"+
		"\2\2\2wx\7\33\2\2xz\3\2\2\2yn\3\2\2\2yv\3\2\2\2z|\3\2\2\2{l\3\2\2\2{y"+
		"\3\2\2\2|\17\3\2\2\2}\u0080\5\2\2\2~\u0080\5\4\3\2\177}\3\2\2\2\177~\3"+
		"\2\2\2\u0080\21\3\2\2\2\u0081\u0087\7$\2\2\u0082\u0083\7\32\2\2\u0083"+
		"\u0084\5\4\3\2\u0084\u0085\7\33\2\2\u0085\u0087\3\2\2\2\u0086\u0081\3"+
		"\2\2\2\u0086\u0082\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7\b\2\2\u0089"+
		"\u0086\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7$"+
		"\2\2\u008c\u0095\7\32\2\2\u008d\u0092\5\20\t\2\u008e\u008f\7\35\2\2\u008f"+
		"\u0091\5\20\t\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u008d\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\33"+
		"\2\2\u0098\23\3\2\2\2\u0099\u00a0\5\2\2\2\u009a\u009b\7$\2\2\u009b\u00a0"+
		"\5\6\4\2\u009c\u00a0\5\34\17\2\u009d\u00a0\5\30\r\2\u009e\u00a0\5\36\20"+
		"\2\u009f\u0099\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u00ad\5\24\13\2\u00a2"+
		"\u00a6\7 \2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\7\30\2\2\u00a5\u00a7\3"+
		"\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7!\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00a1\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ad\27\3\2\2\2\u00ae\u00af"+
		"\7\27\2\2\u00af\u00b0\5\16\b\2\u00b0\u00b1\7\21\2\2\u00b1\u00b2\5\26\f"+
		"\2\u00b2\u00b3\7\22\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6"+
		"\7$\2\2\u00b6\u00be\7\24\2\2\u00b7\u00b8\7$\2\2\u00b8\u00b9\5\b\5\2\u00b9"+
		"\u00ba\7\"\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7"+
		"\30\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b7\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\13"+
		"\2\2\u00c3\33\3\2\2\2\u00c4\u00c5\7\3\2\2\u00c5\u00c6\5\16\b\2\u00c6\u00c7"+
		"\7\26\2\2\u00c7\u00c8\5\26\f\2\u00c8\u00c9\7\t\2\2\u00c9\u00ca\5\26\f"+
		"\2\u00ca\u00cb\7\n\2\2\u00cb\35\3\2\2\2\u00cc\u00cd\7\20\2\2\u00cd\u00ce"+
		"\7$\2\2\u00ce\u00d0\5\b\5\2\u00cf\u00d1\5\6\4\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00da\3\2\2\2\u00d2\u00d3\7\35\2\2\u00d3\u00d4\7"+
		"$\2\2\u00d4\u00d6\5\b\5\2\u00d5\u00d7\5\6\4\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\7\16\2\2\u00de\u00df\5\26\f\2\u00df\37\3\2"+
		"\2\2\u00e0\u00e1\7$\2\2\u00e1\u00ed\7\32\2\2\u00e2\u00e3\7$\2\2\u00e3"+
		"\u00e4\5\b\5\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6\7\35\2\2\u00e6\u00e7\7"+
		"$\2\2\u00e7\u00e9\5\b\5\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00e2\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\7\33\2\2\u00f0\u00f1\5\b\5\2\u00f1\u00f2\7 \2\2\u00f2\u00f3\5\26"+
		"\f\2\u00f3\u00f4\7!\2\2\u00f4\u00f5\7\30\2\2\u00f5!\3\2\2\2\u00f6\u00f7"+
		"\7\6\2\2\u00f7\u00fa\7%\2\2\u00f8\u00f9\7\4\2\2\u00f9\u00fb\7%\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0101\7 "+
		"\2\2\u00fd\u0100\5\n\6\2\u00fe\u0100\5 \21\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7!\2\2\u0105"+
		"\u0106\7\30\2\2\u0106#\3\2\2\2\u0107\u0109\5\"\22\2\u0108\u0107\3\2\2"+
		"\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b%"+
		"\3\2\2\2\u010c\u010a\3\2\2\2$+\63:>DHKNW_aelpy{\177\u0086\u0089\u0092"+
		"\u0095\u009f\u00a8\u00ac\u00c0\u00d0\u00d6\u00da\u00ea\u00ed\u00fa\u00ff"+
		"\u0101\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}