// Generated from C:/Users/slava/IdeaProjects/NewLang/src\LangParser.g4 by ANTLR 4.5.3

import structure.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_LITERAL=1, FLOAT_LITERAL=2, STRING_LITERAL=3, CHAR_LITERAL=4, BOOLEAN_LITERAL=5, 
		NULL_LITERAL=6, KEYWORD=7, INT_TYPE=8, BOOL_TYPE=9, SEMICOLON=10, COMMA=11, 
		LEFTB=12, RIGHTB=13, LEFTSB=14, RIGHTSB=15, INCREMENT=16, DECREMENT=17, 
		PLUS=18, MINUS=19, TIMES=20, DIV=21, MOD=22, TILDE=23, BANG=24, LSHIFT=25, 
		RSHIFT=26, LESS=27, GREATER=28, LESS_EQ=29, GREATER_QE=30, EQUALS=31, 
		NOT_EQUALS=32, BITWISE_AND=33, BITWISE_OR=34, BITWISE_XOR=35, LOGICAL_AND=36, 
		LOGICAL_OR=37, QUESTION=38, COLON=39, ASSIGN=40, PLUS_ASSIGN=41, MINUS_ASSIGN=42, 
		TIMES_ASSIGN=43, DIV_ASSIGN=44, MOD_ASSIGN=45, AND_ASSIGN=46, OR_ASSIGN=47, 
		XOR_ASSIGN=48, RSHIFT_ASSIGN=49, LSHIFT_ASSIGN=50, ID=51, WS=52, COMMENT=53, 
		LINE_COMMENT=54;
	public static final int
		RULE_varDef = 0, RULE_type = 1, RULE_primitiveType = 2, RULE_expr = 3, 
		RULE_primary = 4, RULE_literal = 5, RULE_exprList = 6;
	public static final String[] ruleNames = {
		"varDef", "type", "primitiveType", "expr", "primary", "literal", "exprList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'null'", "'auto'", "'int'", "'bool'", 
		"';'", "','", "'('", "')'", "'['", "']'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'~'", "'!'", "'<<'", "'>>'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'&'", "'|'", "'^'", "'&&'", "'||'", "'?'", "':'", 
		"'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", 
		"'>>='", "'<<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "CHAR_LITERAL", 
		"BOOLEAN_LITERAL", "NULL_LITERAL", "KEYWORD", "INT_TYPE", "BOOL_TYPE", 
		"SEMICOLON", "COMMA", "LEFTB", "RIGHTB", "LEFTSB", "RIGHTSB", "INCREMENT", 
		"DECREMENT", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "TILDE", "BANG", 
		"LSHIFT", "RSHIFT", "LESS", "GREATER", "LESS_EQ", "GREATER_QE", "EQUALS", 
		"NOT_EQUALS", "BITWISE_AND", "BITWISE_OR", "BITWISE_XOR", "LOGICAL_AND", 
		"LOGICAL_OR", "QUESTION", "COLON", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", 
		"TIMES_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
		"XOR_ASSIGN", "RSHIFT_ASSIGN", "LSHIFT_ASSIGN", "ID", "WS", "COMMENT", 
		"LINE_COMMENT"
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
	public String getGrammarFileName() { return "LangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VarDefContext extends ParserRuleContext {
		public Token var_name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(LangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varDef);
		int _la;
		try {
			setState(36);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				type();
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(15);
					((VarDefContext)_localctx).var_name = match(ID);
					setState(18);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(16);
						match(ASSIGN);
						setState(17);
						expr(0);
						}
					}

					}
					}
					setState(22); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(24);
				match(SEMICOLON);
				}
				break;
			case KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(KEYWORD);
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(27);
					((VarDefContext)_localctx).var_name = match(ID);
					setState(28);
					match(ASSIGN);
					setState(29);
					expr(0);
					}
					}
					setState(32); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(34);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			primitiveType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==BOOL_TYPE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExprContext extends ParserRuleContext {
		public Expr e;
		public Object obj;
		public ExprMode mode;
		public ExprContext e1;
		public PrimaryContext primary;
		public TypeContext type;
		public ExprContext expr;
		public ExprContext e2;
		public ExprContext e3;
		public ExprListContext exprList;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		((ExprContext)_localctx).obj =  null; ((ExprContext)_localctx).mode =  null;
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(43);
				((ExprContext)_localctx).primary = primary();
				((ExprContext)_localctx).e =  ((ExprContext)_localctx).primary.e;
				}
				break;
			case 2:
				{
				setState(46);
				match(LEFTB);
				setState(47);
				((ExprContext)_localctx).type = type();
				setState(48);
				match(RIGHTB);
				setState(49);
				((ExprContext)_localctx).expr = expr(16);
				((ExprContext)_localctx).e =  new Expr(ExprMode.TYPE_CAST, ((ExprContext)_localctx).type.t, _localctx.e);
				}
				break;
			case 3:
				{
				setState(60);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(52);
					match(PLUS);
					((ExprContext)_localctx).mode =  ExprMode.UNARY_PLUS;
					}
					break;
				case MINUS:
					{
					setState(54);
					match(MINUS);
					((ExprContext)_localctx).mode =  ExprMode.UNARY_MINUS;
					}
					break;
				case INCREMENT:
					{
					setState(56);
					match(INCREMENT);
					((ExprContext)_localctx).mode =  ExprMode.PRE_INCREMENT;
					}
					break;
				case DECREMENT:
					{
					setState(58);
					match(DECREMENT);
					((ExprContext)_localctx).mode =  ExprMode.PRE_DECREMENT;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62);
				((ExprContext)_localctx).expr = expr(14);
				((ExprContext)_localctx).e =  new Expr(_localctx.mode, null, _localctx.e);
				}
				break;
			case 4:
				{
				setState(69);
				switch (_input.LA(1)) {
				case TILDE:
					{
					setState(65);
					match(TILDE);
					((ExprContext)_localctx).mode =  ExprMode.BITWISE_NOT;
					}
					break;
				case BANG:
					{
					setState(67);
					match(BANG);
					((ExprContext)_localctx).mode =  ExprMode.LOGICAL_NOT;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71);
				((ExprContext)_localctx).expr = expr(13);
				((ExprContext)_localctx).e =  new Expr(_localctx.mode, null, _localctx.e);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(83);
						switch (_input.LA(1)) {
						case TIMES:
							{
							setState(77);
							match(TIMES);
							((ExprContext)_localctx).mode =  ExprMode.TIMES;
							}
							break;
						case DIV:
							{
							setState(79);
							match(DIV);
							((ExprContext)_localctx).mode =  ExprMode.DIV;
							}
							break;
						case MOD:
							{
							setState(81);
							match(MOD);
							((ExprContext)_localctx).mode =  ExprMode.MOD;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(85);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(13);
						((ExprContext)_localctx).e =  new Expr(_localctx.mode, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(93);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(89);
							match(PLUS);
							((ExprContext)_localctx).mode =  ExprMode.PLUS;
							}
							break;
						case MINUS:
							{
							setState(91);
							match(MINUS);
							((ExprContext)_localctx).mode =  ExprMode.MINUS;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(95);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(12);
						((ExprContext)_localctx).e =  new Expr(_localctx.mode, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(103);
						switch (_input.LA(1)) {
						case LSHIFT:
							{
							setState(99);
							match(LSHIFT);
							((ExprContext)_localctx).mode =  ExprMode.LSHIFT;
							}
							break;
						case RSHIFT:
							{
							setState(101);
							match(RSHIFT);
							((ExprContext)_localctx).mode =  ExprMode.RSHIFT;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(105);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(11);
						((ExprContext)_localctx).e =  new Expr(_localctx.mode, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(117);
						switch (_input.LA(1)) {
						case LESS_EQ:
							{
							setState(109);
							match(LESS_EQ);
							((ExprContext)_localctx).mode =  ExprMode.LESS_EQ;
							}
							break;
						case GREATER_QE:
							{
							setState(111);
							match(GREATER_QE);
							((ExprContext)_localctx).mode =  ExprMode.GREATER_EQ;
							}
							break;
						case GREATER:
							{
							setState(113);
							match(GREATER);
							((ExprContext)_localctx).mode =  ExprMode.GREATER;
							}
							break;
						case LESS:
							{
							setState(115);
							match(LESS);
							((ExprContext)_localctx).mode =  ExprMode.LESS;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(119);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(10);
						((ExprContext)_localctx).e =  new Expr(_localctx.mode, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(127);
						switch (_input.LA(1)) {
						case EQUALS:
							{
							setState(123);
							match(EQUALS);
							((ExprContext)_localctx).mode =  ExprMode.EQUALS;
							}
							break;
						case NOT_EQUALS:
							{
							setState(125);
							match(NOT_EQUALS);
							((ExprContext)_localctx).mode =  ExprMode.NOT_EQUALS;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(129);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(9);
						((ExprContext)_localctx).e =  new Expr(_localctx.mode, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(133);
						match(BITWISE_AND);
						setState(134);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(8);
						((ExprContext)_localctx).e =  new Expr(ExprMode.BITWISE_AND, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(138);
						match(BITWISE_XOR);
						setState(139);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(7);
						((ExprContext)_localctx).e =  new Expr(ExprMode.BITWISE_XOR, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(143);
						match(BITWISE_OR);
						setState(144);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(6);
						((ExprContext)_localctx).e =  new Expr(ExprMode.BITWISE_OR, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(148);
						match(LOGICAL_AND);
						setState(149);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(5);
						((ExprContext)_localctx).e =  new Expr(ExprMode.LOGICAL_AND, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(153);
						match(LOGICAL_OR);
						setState(154);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(4);
						((ExprContext)_localctx).e =  new Expr(ExprMode.LOGICAL_OR, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(158);
						match(QUESTION);
						setState(159);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(0);
						setState(160);
						match(COLON);
						setState(161);
						((ExprContext)_localctx).e3 = ((ExprContext)_localctx).expr = expr(2);
						((ExprContext)_localctx).e =  new Expr(ExprMode.TERNARY, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e, ((ExprContext)_localctx).e3.e);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(187);
						switch (_input.LA(1)) {
						case ASSIGN:
							{
							setState(165);
							match(ASSIGN);
							((ExprContext)_localctx).mode =  ExprMode.ASSIGN;
							}
							break;
						case PLUS_ASSIGN:
							{
							setState(167);
							match(PLUS_ASSIGN);
							((ExprContext)_localctx).mode =  ExprMode.PLUS_ASSIGN;
							}
							break;
						case MINUS_ASSIGN:
							{
							setState(169);
							match(MINUS_ASSIGN);
							((ExprContext)_localctx).mode =  ExprMode.MINUS_ASSIGN;
							}
							break;
						case TIMES_ASSIGN:
							{
							setState(171);
							match(TIMES_ASSIGN);
							((ExprContext)_localctx).mode =  ExprMode.TIMES_ASSIGN;
							}
							break;
						case DIV_ASSIGN:
							{
							setState(173);
							match(DIV_ASSIGN);
							((ExprContext)_localctx).mode =  ExprMode.DIV_ASSIGN;
							}
							break;
						case MOD_ASSIGN:
							{
							setState(175);
							match(MOD_ASSIGN);
							((ExprContext)_localctx).mode =  ExprMode.MOD_ASSIGN;
							}
							break;
						case AND_ASSIGN:
							{
							setState(177);
							match(AND_ASSIGN);
							((ExprContext)_localctx).mode =  ExprMode.AND_ASSIGN;
							}
							break;
						case OR_ASSIGN:
							{
							setState(179);
							match(OR_ASSIGN);
							((ExprContext)_localctx).mode =  ExprMode.OR_ASSIGN;
							}
							break;
						case XOR_ASSIGN:
							{
							setState(181);
							match(XOR_ASSIGN);
							((ExprContext)_localctx).mode =  ExprMode.XOR_ASSIGN;
							}
							break;
						case RSHIFT_ASSIGN:
							{
							setState(183);
							match(RSHIFT_ASSIGN);
							((ExprContext)_localctx).mode =  ExprMode.RSHIFT_ASSIGN;
							}
							break;
						case LSHIFT_ASSIGN:
							{
							setState(185);
							match(LSHIFT_ASSIGN);
							((ExprContext)_localctx).mode =  ExprMode.LSHIFT_ASSIGN;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(189);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(1);
						((ExprContext)_localctx).e =  new Expr(_localctx.mode, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(193);
						match(LEFTSB);
						setState(194);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(0);
						setState(195);
						match(RIGHTSB);
						((ExprContext)_localctx).e =  new Expr(ExprMode.ARRAY_ELEMENT, null, ((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(199);
						match(LEFTB);
						setState(203);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << CHAR_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << LEFTB) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << BANG) | (1L << ID))) != 0)) {
							{
							setState(200);
							((ExprContext)_localctx).exprList = exprList();
							((ExprContext)_localctx).obj =  ((ExprContext)_localctx).exprList.list;
							}
						}

						setState(205);
						match(RIGHTB);
						((ExprContext)_localctx).e =  new Expr(ExprMode.FUNCTION_CALL, _localctx.obj, _localctx.e);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(212);
						switch (_input.LA(1)) {
						case INCREMENT:
							{
							setState(208);
							match(INCREMENT);
							((ExprContext)_localctx).mode =  ExprMode.POST_INCREMENT;
							}
							break;
						case DECREMENT:
							{
							setState(210);
							match(DECREMENT);
							((ExprContext)_localctx).mode =  ExprMode.POST_DECREMENT;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						((ExprContext)_localctx).e =  new Expr(_localctx.mode, null, _localctx.e);
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public Expr e;
		public ExprContext expr;
		public LiteralContext literal;
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primary);
		try {
			setState(230);
			switch (_input.LA(1)) {
			case LEFTB:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(LEFTB);
				setState(221);
				((PrimaryContext)_localctx).expr = expr(0);
				setState(222);
				match(RIGHTB);
				((PrimaryContext)_localctx).e =  new Expr(ExprMode.BRACKETS, null, ((PrimaryContext)_localctx).expr.e);
				}
				break;
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
			case BOOLEAN_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				((PrimaryContext)_localctx).literal = literal();
				((PrimaryContext)_localctx).e =  ((PrimaryContext)_localctx).literal.e;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				((PrimaryContext)_localctx).ID = match(ID);
				((PrimaryContext)_localctx).e =  new Expr(ExprMode.ID, (((PrimaryContext)_localctx).ID!=null?((PrimaryContext)_localctx).ID.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Expr e;
		public Token INT_LITERAL;
		public Token FLOAT_LITERAL;
		public Token CHAR_LITERAL;
		public Token STRING_LITERAL;
		public Token BOOLEAN_LITERAL;
		public TerminalNode INT_LITERAL() { return getToken(LangParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(LangParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(LangParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(LangParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(LangParser.BOOLEAN_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literal);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				((LiteralContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				((LiteralContext)_localctx).e =  new Expr(ExprMode.INT_LITERAL, Integer.valueOf((((LiteralContext)_localctx).INT_LITERAL!=null?((LiteralContext)_localctx).INT_LITERAL.getText():null)));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				((LiteralContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((LiteralContext)_localctx).e =  new Expr(ExprMode.FLOAT_LITERAL, Double.valueOf((((LiteralContext)_localctx).FLOAT_LITERAL!=null?((LiteralContext)_localctx).FLOAT_LITERAL.getText():null)));
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				((LiteralContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				((LiteralContext)_localctx).e =  new Expr(ExprMode.CHAR_LITERAL, (((LiteralContext)_localctx).CHAR_LITERAL!=null?((LiteralContext)_localctx).CHAR_LITERAL.getText():null).substring(1, (((LiteralContext)_localctx).CHAR_LITERAL!=null?((LiteralContext)_localctx).CHAR_LITERAL.getText():null).length() - 1));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				((LiteralContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((LiteralContext)_localctx).e =  new Expr(ExprMode.STRING_LITERAL, (((LiteralContext)_localctx).STRING_LITERAL!=null?((LiteralContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((LiteralContext)_localctx).STRING_LITERAL!=null?((LiteralContext)_localctx).STRING_LITERAL.getText():null).length() - 1));
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				((LiteralContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				((LiteralContext)_localctx).e =  new Expr(ExprMode.BOOLEAN_LITERAL, Boolean.valueOf((((LiteralContext)_localctx).BOOLEAN_LITERAL!=null?((LiteralContext)_localctx).BOOLEAN_LITERAL.getText():null).equals("true")));
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(NULL_LITERAL);
				((LiteralContext)_localctx).e =  new Expr(ExprMode.NULL_LITERAL, null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<Expr> list;
		public ExprContext e1;
		public ExprContext ec;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprList);
		((ExprListContext)_localctx).list =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			((ExprListContext)_localctx).e1 = expr(0);
			_localctx.list.add(((ExprListContext)_localctx).e1.e);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(248);
				match(COMMA);
				setState(249);
				((ExprListContext)_localctx).ec = expr(0);
				_localctx.list.add(((ExprListContext)_localctx).ec.e);
				}
				}
				setState(256);
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
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 17);
		case 14:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\5\2\25"+
		"\n\2\6\2\27\n\2\r\2\16\2\30\3\2\3\2\3\2\3\2\3\2\3\2\6\2!\n\2\r\2\16\2"+
		"\"\3\2\3\2\5\2\'\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5H\n\5\3\5\3\5\3\5\5\5M\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5V"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"x\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00be\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00ce\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00d7\n\5\3\5\7\5\u00da"+
		"\n\5\f\5\16\5\u00dd\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e9"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f7\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00ff\n\b\f\b\16\b\u0102\13\b\3\b\2\3\b\t\2\4"+
		"\6\b\n\f\16\2\3\3\2\n\13\u0132\2&\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\bL\3\2"+
		"\2\2\n\u00e8\3\2\2\2\f\u00f6\3\2\2\2\16\u00f8\3\2\2\2\20\26\5\4\3\2\21"+
		"\24\7\65\2\2\22\23\7*\2\2\23\25\5\b\5\2\24\22\3\2\2\2\24\25\3\2\2\2\25"+
		"\27\3\2\2\2\26\21\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31"+
		"\32\3\2\2\2\32\33\7\f\2\2\33\'\3\2\2\2\34 \7\t\2\2\35\36\7\65\2\2\36\37"+
		"\7*\2\2\37!\5\b\5\2 \35\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2"+
		"\2\2$%\7\f\2\2%\'\3\2\2\2&\20\3\2\2\2&\34\3\2\2\2\'\3\3\2\2\2()\5\6\4"+
		"\2)\5\3\2\2\2*+\t\2\2\2+\7\3\2\2\2,-\b\5\1\2-.\5\n\6\2./\b\5\1\2/M\3\2"+
		"\2\2\60\61\7\16\2\2\61\62\5\4\3\2\62\63\7\17\2\2\63\64\5\b\5\22\64\65"+
		"\b\5\1\2\65M\3\2\2\2\66\67\7\24\2\2\67?\b\5\1\289\7\25\2\29?\b\5\1\2:"+
		";\7\22\2\2;?\b\5\1\2<=\7\23\2\2=?\b\5\1\2>\66\3\2\2\2>8\3\2\2\2>:\3\2"+
		"\2\2><\3\2\2\2?@\3\2\2\2@A\5\b\5\20AB\b\5\1\2BM\3\2\2\2CD\7\31\2\2DH\b"+
		"\5\1\2EF\7\32\2\2FH\b\5\1\2GC\3\2\2\2GE\3\2\2\2HI\3\2\2\2IJ\5\b\5\17J"+
		"K\b\5\1\2KM\3\2\2\2L,\3\2\2\2L\60\3\2\2\2L>\3\2\2\2LG\3\2\2\2M\u00db\3"+
		"\2\2\2NU\f\16\2\2OP\7\26\2\2PV\b\5\1\2QR\7\27\2\2RV\b\5\1\2ST\7\30\2\2"+
		"TV\b\5\1\2UO\3\2\2\2UQ\3\2\2\2US\3\2\2\2VW\3\2\2\2WX\5\b\5\17XY\b\5\1"+
		"\2Y\u00da\3\2\2\2Z_\f\r\2\2[\\\7\24\2\2\\`\b\5\1\2]^\7\25\2\2^`\b\5\1"+
		"\2_[\3\2\2\2_]\3\2\2\2`a\3\2\2\2ab\5\b\5\16bc\b\5\1\2c\u00da\3\2\2\2d"+
		"i\f\f\2\2ef\7\33\2\2fj\b\5\1\2gh\7\34\2\2hj\b\5\1\2ie\3\2\2\2ig\3\2\2"+
		"\2jk\3\2\2\2kl\5\b\5\rlm\b\5\1\2m\u00da\3\2\2\2nw\f\13\2\2op\7\37\2\2"+
		"px\b\5\1\2qr\7 \2\2rx\b\5\1\2st\7\36\2\2tx\b\5\1\2uv\7\35\2\2vx\b\5\1"+
		"\2wo\3\2\2\2wq\3\2\2\2ws\3\2\2\2wu\3\2\2\2xy\3\2\2\2yz\5\b\5\fz{\b\5\1"+
		"\2{\u00da\3\2\2\2|\u0081\f\n\2\2}~\7!\2\2~\u0082\b\5\1\2\177\u0080\7\""+
		"\2\2\u0080\u0082\b\5\1\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\5\b\5\13\u0084\u0085\b\5\1\2\u0085\u00da\3\2\2\2"+
		"\u0086\u0087\f\t\2\2\u0087\u0088\7#\2\2\u0088\u0089\5\b\5\n\u0089\u008a"+
		"\b\5\1\2\u008a\u00da\3\2\2\2\u008b\u008c\f\b\2\2\u008c\u008d\7%\2\2\u008d"+
		"\u008e\5\b\5\t\u008e\u008f\b\5\1\2\u008f\u00da\3\2\2\2\u0090\u0091\f\7"+
		"\2\2\u0091\u0092\7$\2\2\u0092\u0093\5\b\5\b\u0093\u0094\b\5\1\2\u0094"+
		"\u00da\3\2\2\2\u0095\u0096\f\6\2\2\u0096\u0097\7&\2\2\u0097\u0098\5\b"+
		"\5\7\u0098\u0099\b\5\1\2\u0099\u00da\3\2\2\2\u009a\u009b\f\5\2\2\u009b"+
		"\u009c\7\'\2\2\u009c\u009d\5\b\5\6\u009d\u009e\b\5\1\2\u009e\u00da\3\2"+
		"\2\2\u009f\u00a0\f\4\2\2\u00a0\u00a1\7(\2\2\u00a1\u00a2\5\b\5\2\u00a2"+
		"\u00a3\7)\2\2\u00a3\u00a4\5\b\5\4\u00a4\u00a5\b\5\1\2\u00a5\u00da\3\2"+
		"\2\2\u00a6\u00bd\f\3\2\2\u00a7\u00a8\7*\2\2\u00a8\u00be\b\5\1\2\u00a9"+
		"\u00aa\7+\2\2\u00aa\u00be\b\5\1\2\u00ab\u00ac\7,\2\2\u00ac\u00be\b\5\1"+
		"\2\u00ad\u00ae\7-\2\2\u00ae\u00be\b\5\1\2\u00af\u00b0\7.\2\2\u00b0\u00be"+
		"\b\5\1\2\u00b1\u00b2\7/\2\2\u00b2\u00be\b\5\1\2\u00b3\u00b4\7\60\2\2\u00b4"+
		"\u00be\b\5\1\2\u00b5\u00b6\7\61\2\2\u00b6\u00be\b\5\1\2\u00b7\u00b8\7"+
		"\62\2\2\u00b8\u00be\b\5\1\2\u00b9\u00ba\7\63\2\2\u00ba\u00be\b\5\1\2\u00bb"+
		"\u00bc\7\64\2\2\u00bc\u00be\b\5\1\2\u00bd\u00a7\3\2\2\2\u00bd\u00a9\3"+
		"\2\2\2\u00bd\u00ab\3\2\2\2\u00bd\u00ad\3\2\2\2\u00bd\u00af\3\2\2\2\u00bd"+
		"\u00b1\3\2\2\2\u00bd\u00b3\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b7\3\2"+
		"\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\5\b\5\3\u00c0\u00c1\b\5\1\2\u00c1\u00da\3\2\2\2\u00c2\u00c3\f\24"+
		"\2\2\u00c3\u00c4\7\20\2\2\u00c4\u00c5\5\b\5\2\u00c5\u00c6\7\21\2\2\u00c6"+
		"\u00c7\b\5\1\2\u00c7\u00da\3\2\2\2\u00c8\u00c9\f\23\2\2\u00c9\u00cd\7"+
		"\16\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\b\5\1\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\17"+
		"\2\2\u00d0\u00da\b\5\1\2\u00d1\u00d6\f\21\2\2\u00d2\u00d3\7\22\2\2\u00d3"+
		"\u00d7\b\5\1\2\u00d4\u00d5\7\23\2\2\u00d5\u00d7\b\5\1\2\u00d6\u00d2\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\b\5\1\2\u00d9"+
		"N\3\2\2\2\u00d9Z\3\2\2\2\u00d9d\3\2\2\2\u00d9n\3\2\2\2\u00d9|\3\2\2\2"+
		"\u00d9\u0086\3\2\2\2\u00d9\u008b\3\2\2\2\u00d9\u0090\3\2\2\2\u00d9\u0095"+
		"\3\2\2\2\u00d9\u009a\3\2\2\2\u00d9\u009f\3\2\2\2\u00d9\u00a6\3\2\2\2\u00d9"+
		"\u00c2\3\2\2\2\u00d9\u00c8\3\2\2\2\u00d9\u00d1\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\t\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00df\7\16\2\2\u00df\u00e0\5\b\5\2\u00e0\u00e1\7\17\2\2"+
		"\u00e1\u00e2\b\6\1\2\u00e2\u00e9\3\2\2\2\u00e3\u00e4\5\f\7\2\u00e4\u00e5"+
		"\b\6\1\2\u00e5\u00e9\3\2\2\2\u00e6\u00e7\7\65\2\2\u00e7\u00e9\b\6\1\2"+
		"\u00e8\u00de\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\13"+
		"\3\2\2\2\u00ea\u00eb\7\3\2\2\u00eb\u00f7\b\7\1\2\u00ec\u00ed\7\4\2\2\u00ed"+
		"\u00f7\b\7\1\2\u00ee\u00ef\7\6\2\2\u00ef\u00f7\b\7\1\2\u00f0\u00f1\7\5"+
		"\2\2\u00f1\u00f7\b\7\1\2\u00f2\u00f3\7\7\2\2\u00f3\u00f7\b\7\1\2\u00f4"+
		"\u00f5\7\b\2\2\u00f5\u00f7\b\7\1\2\u00f6\u00ea\3\2\2\2\u00f6\u00ec\3\2"+
		"\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\r\3\2\2\2\u00f8\u00f9\5\b\5\2\u00f9\u0100\b\b\1\2"+
		"\u00fa\u00fb\7\r\2\2\u00fb\u00fc\5\b\5\2\u00fc\u00fd\b\b\1\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\17\3\2\2\2\u0102\u0100\3\2\2\2\26\24\30\"&>GLU_i"+
		"w\u0081\u00bd\u00cd\u00d6\u00d9\u00db\u00e8\u00f6\u0100";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}