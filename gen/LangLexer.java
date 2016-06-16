// Generated from C:/Users/slava/IdeaProjects/NewLang/src\LangLexer.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "CHAR_LITERAL", "BOOLEAN_LITERAL", 
		"NULL_LITERAL", "INT", "EXP", "ESC", "ESC_CHAR", "UNICODE", "HEX", "KEYWORD", 
		"INT_TYPE", "BOOL_TYPE", "SEMICOLON", "COMMA", "LEFTB", "RIGHTB", "LEFTSB", 
		"RIGHTSB", "INCREMENT", "DECREMENT", "PLUS", "MINUS", "TIMES", "DIV", 
		"MOD", "TILDE", "BANG", "LSHIFT", "RSHIFT", "LESS", "GREATER", "LESS_EQ", 
		"GREATER_QE", "EQUALS", "NOT_EQUALS", "BITWISE_AND", "BITWISE_OR", "BITWISE_XOR", 
		"LOGICAL_AND", "LOGICAL_OR", "QUESTION", "COLON", "ASSIGN", "PLUS_ASSIGN", 
		"MINUS_ASSIGN", "TIMES_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "RSHIFT_ASSIGN", "LSHIFT_ASSIGN", "ID", "WS", 
		"COMMENT", "LINE_COMMENT"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LangLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\28\u0186\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\6\2}\n\2\r\2\16\2~\3\3\5\3\u0082\n\3\3\3\3\3\3\3\3\3\5\3\u0088\n"+
		"\3\3\3\5\3\u008b\n\3\3\3\3\3\3\3\5\3\u0090\n\3\3\3\5\3\u0093\n\3\3\3\3"+
		"\3\3\3\3\3\5\3\u0099\n\3\3\3\5\3\u009c\n\3\3\4\3\4\3\4\7\4\u00a1\n\4\f"+
		"\4\16\4\u00a4\13\4\3\4\3\4\3\5\3\5\3\5\7\5\u00ab\n\5\f\5\16\5\u00ae\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bb\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\7\b\u00c5\n\b\f\b\16\b\u00c8\13\b\5\b\u00ca\n\b"+
		"\3\t\3\t\5\t\u00ce\n\t\3\t\3\t\3\n\3\n\3\n\5\n\u00d5\n\n\3\13\3\13\3\13"+
		"\5\13\u00da\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\39\39\39\39\3:\6:\u015b"+
		"\n:\r:\16:\u015c\3:\7:\u0160\n:\f:\16:\u0163\13:\3;\6;\u0166\n;\r;\16"+
		";\u0167\3;\3;\3<\3<\3<\3<\7<\u0170\n<\f<\16<\u0173\13<\3<\3<\3<\3<\3<"+
		"\3=\3=\3=\3=\7=\u017e\n=\f=\16=\u0181\13=\3=\3=\3=\3=\3\u0171\2>\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\2\27\2\31\2\33\t\35\n\37\13!\f#"+
		"\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34"+
		"C\35E\36G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62o\63q\64s\65"+
		"u\66w\67y8\3\2\17\3\2\62;\4\2$$^^\4\2))^^\3\2\63;\4\2GGgg\4\2--//\n\2"+
		"$$\61\61^^ddhhppttvv\n\2))\61\61^^ddhhppttvv\5\2\62;CHch\5\2C\\aac|\6"+
		"\2\62;C\\aac|\5\2\13\f\17\17\"\"\3\2\f\f\u0198\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3|\3\2\2\2\5\u009b\3\2\2\2\7\u009d"+
		"\3\2\2\2\t\u00a7\3\2\2\2\13\u00ba\3\2\2\2\r\u00bc\3\2\2\2\17\u00c9\3\2"+
		"\2\2\21\u00cb\3\2\2\2\23\u00d1\3\2\2\2\25\u00d6\3\2\2\2\27\u00db\3\2\2"+
		"\2\31\u00e1\3\2\2\2\33\u00e3\3\2\2\2\35\u00e8\3\2\2\2\37\u00ec\3\2\2\2"+
		"!\u00f1\3\2\2\2#\u00f3\3\2\2\2%\u00f5\3\2\2\2\'\u00f7\3\2\2\2)\u00f9\3"+
		"\2\2\2+\u00fb\3\2\2\2-\u00fd\3\2\2\2/\u0100\3\2\2\2\61\u0103\3\2\2\2\63"+
		"\u0105\3\2\2\2\65\u0107\3\2\2\2\67\u0109\3\2\2\29\u010b\3\2\2\2;\u010d"+
		"\3\2\2\2=\u010f\3\2\2\2?\u0111\3\2\2\2A\u0114\3\2\2\2C\u0117\3\2\2\2E"+
		"\u0119\3\2\2\2G\u011b\3\2\2\2I\u011e\3\2\2\2K\u0121\3\2\2\2M\u0124\3\2"+
		"\2\2O\u0127\3\2\2\2Q\u0129\3\2\2\2S\u012b\3\2\2\2U\u012d\3\2\2\2W\u0130"+
		"\3\2\2\2Y\u0133\3\2\2\2[\u0135\3\2\2\2]\u0137\3\2\2\2_\u0139\3\2\2\2a"+
		"\u013c\3\2\2\2c\u013f\3\2\2\2e\u0142\3\2\2\2g\u0145\3\2\2\2i\u0148\3\2"+
		"\2\2k\u014b\3\2\2\2m\u014e\3\2\2\2o\u0151\3\2\2\2q\u0155\3\2\2\2s\u015a"+
		"\3\2\2\2u\u0165\3\2\2\2w\u016b\3\2\2\2y\u0179\3\2\2\2{}\t\2\2\2|{\3\2"+
		"\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\4\3\2\2\2\u0080\u0082\7/\2\2"+
		"\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\5\17\b\2\u0084\u0085\7\60\2\2\u0085\u0087\5\17\b\2\u0086\u0088\5\21\t"+
		"\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u009c\3\2\2\2\u0089\u008b"+
		"\7/\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\7\60\2\2\u008d\u008f\5\17\b\2\u008e\u0090\5\21\t\2\u008f\u008e"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u009c\3\2\2\2\u0091\u0093\7/\2\2\u0092"+
		"\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5\17"+
		"\b\2\u0095\u0096\5\21\t\2\u0096\u009c\3\2\2\2\u0097\u0099\7/\2\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\5\17"+
		"\b\2\u009b\u0081\3\2\2\2\u009b\u008a\3\2\2\2\u009b\u0092\3\2\2\2\u009b"+
		"\u0098\3\2\2\2\u009c\6\3\2\2\2\u009d\u00a2\7$\2\2\u009e\u00a1\5\23\n\2"+
		"\u009f\u00a1\n\3\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\7$\2\2\u00a6\b\3\2\2\2\u00a7\u00ac\7)\2\2\u00a8"+
		"\u00ab\5\25\13\2\u00a9\u00ab\n\4\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3"+
		"\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7)\2\2\u00b0\n\3\2\2\2"+
		"\u00b1\u00b2\7h\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5"+
		"\7u\2\2\u00b5\u00bb\7g\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7t\2\2\u00b8"+
		"\u00b9\7w\2\2\u00b9\u00bb\7g\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b6\3\2\2"+
		"\2\u00bb\f\3\2\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7"+
		"n\2\2\u00bf\u00c0\7n\2\2\u00c0\16\3\2\2\2\u00c1\u00ca\7\62\2\2\u00c2\u00c6"+
		"\t\5\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c2\3\2\2\2\u00ca\20\3\2\2\2\u00cb\u00cd"+
		"\t\6\2\2\u00cc\u00ce\t\7\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\5\17\b\2\u00d0\22\3\2\2\2\u00d1\u00d4\7^\2"+
		"\2\u00d2\u00d5\t\b\2\2\u00d3\u00d5\5\27\f\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\24\3\2\2\2\u00d6\u00d9\7^\2\2\u00d7\u00da\t\t\2\2"+
		"\u00d8\u00da\5\27\f\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\26"+
		"\3\2\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\5\31\r\2\u00dd\u00de\5\31\r\2"+
		"\u00de\u00df\5\31\r\2\u00df\u00e0\5\31\r\2\u00e0\30\3\2\2\2\u00e1\u00e2"+
		"\t\n\2\2\u00e2\32\3\2\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7w\2\2\u00e5"+
		"\u00e6\7v\2\2\u00e6\u00e7\7q\2\2\u00e7\34\3\2\2\2\u00e8\u00e9\7k\2\2\u00e9"+
		"\u00ea\7p\2\2\u00ea\u00eb\7v\2\2\u00eb\36\3\2\2\2\u00ec\u00ed\7d\2\2\u00ed"+
		"\u00ee\7q\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7n\2\2\u00f0 \3\2\2\2\u00f1"+
		"\u00f2\7=\2\2\u00f2\"\3\2\2\2\u00f3\u00f4\7.\2\2\u00f4$\3\2\2\2\u00f5"+
		"\u00f6\7*\2\2\u00f6&\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8(\3\2\2\2\u00f9\u00fa"+
		"\7]\2\2\u00fa*\3\2\2\2\u00fb\u00fc\7_\2\2\u00fc,\3\2\2\2\u00fd\u00fe\7"+
		"-\2\2\u00fe\u00ff\7-\2\2\u00ff.\3\2\2\2\u0100\u0101\7/\2\2\u0101\u0102"+
		"\7/\2\2\u0102\60\3\2\2\2\u0103\u0104\7-\2\2\u0104\62\3\2\2\2\u0105\u0106"+
		"\7/\2\2\u0106\64\3\2\2\2\u0107\u0108\7,\2\2\u0108\66\3\2\2\2\u0109\u010a"+
		"\7\61\2\2\u010a8\3\2\2\2\u010b\u010c\7\'\2\2\u010c:\3\2\2\2\u010d\u010e"+
		"\7\u0080\2\2\u010e<\3\2\2\2\u010f\u0110\7#\2\2\u0110>\3\2\2\2\u0111\u0112"+
		"\7>\2\2\u0112\u0113\7>\2\2\u0113@\3\2\2\2\u0114\u0115\7@\2\2\u0115\u0116"+
		"\7@\2\2\u0116B\3\2\2\2\u0117\u0118\7>\2\2\u0118D\3\2\2\2\u0119\u011a\7"+
		"@\2\2\u011aF\3\2\2\2\u011b\u011c\7>\2\2\u011c\u011d\7?\2\2\u011dH\3\2"+
		"\2\2\u011e\u011f\7@\2\2\u011f\u0120\7?\2\2\u0120J\3\2\2\2\u0121\u0122"+
		"\7?\2\2\u0122\u0123\7?\2\2\u0123L\3\2\2\2\u0124\u0125\7#\2\2\u0125\u0126"+
		"\7?\2\2\u0126N\3\2\2\2\u0127\u0128\7(\2\2\u0128P\3\2\2\2\u0129\u012a\7"+
		"~\2\2\u012aR\3\2\2\2\u012b\u012c\7`\2\2\u012cT\3\2\2\2\u012d\u012e\7("+
		"\2\2\u012e\u012f\7(\2\2\u012fV\3\2\2\2\u0130\u0131\7~\2\2\u0131\u0132"+
		"\7~\2\2\u0132X\3\2\2\2\u0133\u0134\7A\2\2\u0134Z\3\2\2\2\u0135\u0136\7"+
		"<\2\2\u0136\\\3\2\2\2\u0137\u0138\7?\2\2\u0138^\3\2\2\2\u0139\u013a\7"+
		"-\2\2\u013a\u013b\7?\2\2\u013b`\3\2\2\2\u013c\u013d\7/\2\2\u013d\u013e"+
		"\7?\2\2\u013eb\3\2\2\2\u013f\u0140\7,\2\2\u0140\u0141\7?\2\2\u0141d\3"+
		"\2\2\2\u0142\u0143\7\61\2\2\u0143\u0144\7?\2\2\u0144f\3\2\2\2\u0145\u0146"+
		"\7\'\2\2\u0146\u0147\7?\2\2\u0147h\3\2\2\2\u0148\u0149\7(\2\2\u0149\u014a"+
		"\7?\2\2\u014aj\3\2\2\2\u014b\u014c\7~\2\2\u014c\u014d\7?\2\2\u014dl\3"+
		"\2\2\2\u014e\u014f\7`\2\2\u014f\u0150\7?\2\2\u0150n\3\2\2\2\u0151\u0152"+
		"\7@\2\2\u0152\u0153\7@\2\2\u0153\u0154\7?\2\2\u0154p\3\2\2\2\u0155\u0156"+
		"\7>\2\2\u0156\u0157\7>\2\2\u0157\u0158\7?\2\2\u0158r\3\2\2\2\u0159\u015b"+
		"\t\13\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2"+
		"\u015c\u015d\3\2\2\2\u015d\u0161\3\2\2\2\u015e\u0160\t\f\2\2\u015f\u015e"+
		"\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"t\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\t\r\2\2\u0165\u0164\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016a\b;\2\2\u016av\3\2\2\2\u016b\u016c\7\61\2\2\u016c"+
		"\u016d\7,\2\2\u016d\u0171\3\2\2\2\u016e\u0170\13\2\2\2\u016f\u016e\3\2"+
		"\2\2\u0170\u0173\3\2\2\2\u0171\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7,\2\2\u0175\u0176\7\61"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b<\2\2\u0178x\3\2\2\2\u0179\u017a"+
		"\7\61\2\2\u017a\u017b\7\61\2\2\u017b\u017f\3\2\2\2\u017c\u017e\n\16\2"+
		"\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7\f\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\b=\2\2\u0185z\3\2\2\2\32\2~\u0081\u0087\u008a"+
		"\u008f\u0092\u0098\u009b\u00a0\u00a2\u00aa\u00ac\u00ba\u00c6\u00c9\u00cd"+
		"\u00d4\u00d9\u015c\u0161\u0167\u0171\u017f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}