// Generated from D:/Collage/Forth year/Second term/Compilers/Section/ANTLR Projects/OurProject\coolLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class coolLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "IF", "INHERITS", 
			"CASE", "CLASS", "FOR", "DOT", "ELSE", "FI", "ESAC", "FALSE", "TRUE", 
			"IN", "ISVOID", "LET", "LOOP", "POOL", "NOT", "OF", "NEW", "THEN", "WHILE", 
			"SEMICOLON", "TILDE", "LE", "LT", "GT", "GE", "MINUS", "PLUS", "MUL", 
			"LPAREN", "RPAREN", "EQUALS", "AT", "COLON", "COMMA", "DIVIDE", "Backslash", 
			"LARROW", "RARROW", "LBRACE", "RBRACE", "UNDERSCORE", "Dq", "Sq", "MOD", 
			"MINAOP", "OPS", "SpecialChars", "Digit", "Letter", "ID", "TYPE", "Integer", 
			"String", "Whitespace", "ADDOPS", "MULOPS", "ERROR"
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
	public static String[] makeSymbolicNames() {
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


	public coolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "coolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u01d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3"+
		".\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\3"+
		"8\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B\3C\3"+
		"C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\3K\3K\3K\5K\u0181\n"+
		"K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\5L\u019b\nL\3M\3M\3N\3N\3O\3O\3O\3O\7O\u01a5\nO\fO\16O\u01a8\13O"+
		"\3P\3P\3P\3P\7P\u01ae\nP\fP\16P\u01b1\13P\3Q\6Q\u01b4\nQ\rQ\16Q\u01b5"+
		"\3R\3R\3R\3R\3R\7R\u01bd\nR\fR\16R\u01c0\13R\3R\3R\3S\6S\u01c5\nS\rS\16"+
		"S\u01c6\3S\3S\3T\3T\5T\u01cd\nT\3U\3U\5U\u01d1\nU\3V\3V\2\2W\3\2\5\2\7"+
		"\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2"+
		"\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG\13I\fK\rM\16"+
		"O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\2g\2i\2k\2m\2o\2q\2s\32"+
		"u\33w\2y\2{\34}\35\177\2\u0081\2\u0083\36\u0085\37\u0087 \u0089!\u008b"+
		"\2\u008d\2\u008f\2\u0091\2\u0093\"\u0095#\u0097\2\u0099\2\u009b\2\u009d"+
		"$\u009f%\u00a1&\u00a3\'\u00a5(\u00a7)\u00a9*\u00ab+\3\2!\4\2CCcc\4\2D"+
		"Ddd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4"+
		"\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUu"+
		"u\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\4"+
		"\2C\\c|\3\2c|\3\2C\\\5\2\13\f\17\17\"\"\2\u01ce\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\3\u00ad\3\2\2\2\5\u00af\3\2\2\2\7\u00b1\3\2\2\2\t\u00b3\3\2\2"+
		"\2\13\u00b5\3\2\2\2\r\u00b7\3\2\2\2\17\u00b9\3\2\2\2\21\u00bb\3\2\2\2"+
		"\23\u00bd\3\2\2\2\25\u00bf\3\2\2\2\27\u00c1\3\2\2\2\31\u00c3\3\2\2\2\33"+
		"\u00c5\3\2\2\2\35\u00c7\3\2\2\2\37\u00c9\3\2\2\2!\u00cb\3\2\2\2#\u00cd"+
		"\3\2\2\2%\u00cf\3\2\2\2\'\u00d1\3\2\2\2)\u00d3\3\2\2\2+\u00d5\3\2\2\2"+
		"-\u00d7\3\2\2\2/\u00d9\3\2\2\2\61\u00db\3\2\2\2\63\u00dd\3\2\2\2\65\u00df"+
		"\3\2\2\2\67\u00e1\3\2\2\29\u00e4\3\2\2\2;\u00ed\3\2\2\2=\u00f2\3\2\2\2"+
		"?\u00f8\3\2\2\2A\u00fc\3\2\2\2C\u00fe\3\2\2\2E\u0103\3\2\2\2G\u0106\3"+
		"\2\2\2I\u010b\3\2\2\2K\u0111\3\2\2\2M\u0116\3\2\2\2O\u0119\3\2\2\2Q\u0120"+
		"\3\2\2\2S\u0124\3\2\2\2U\u0129\3\2\2\2W\u012e\3\2\2\2Y\u0132\3\2\2\2["+
		"\u0135\3\2\2\2]\u0139\3\2\2\2_\u013e\3\2\2\2a\u0144\3\2\2\2c\u0146\3\2"+
		"\2\2e\u0148\3\2\2\2g\u014b\3\2\2\2i\u014d\3\2\2\2k\u014f\3\2\2\2m\u0152"+
		"\3\2\2\2o\u0154\3\2\2\2q\u0156\3\2\2\2s\u0158\3\2\2\2u\u015a\3\2\2\2w"+
		"\u015c\3\2\2\2y\u015e\3\2\2\2{\u0160\3\2\2\2}\u0162\3\2\2\2\177\u0164"+
		"\3\2\2\2\u0081\u0166\3\2\2\2\u0083\u0168\3\2\2\2\u0085\u016b\3\2\2\2\u0087"+
		"\u016e\3\2\2\2\u0089\u0170\3\2\2\2\u008b\u0172\3\2\2\2\u008d\u0174\3\2"+
		"\2\2\u008f\u0176\3\2\2\2\u0091\u0178\3\2\2\2\u0093\u017a\3\2\2\2\u0095"+
		"\u0180\3\2\2\2\u0097\u019a\3\2\2\2\u0099\u019c\3\2\2\2\u009b\u019e\3\2"+
		"\2\2\u009d\u01a0\3\2\2\2\u009f\u01a9\3\2\2\2\u00a1\u01b3\3\2\2\2\u00a3"+
		"\u01b7\3\2\2\2\u00a5\u01c4\3\2\2\2\u00a7\u01cc\3\2\2\2\u00a9\u01d0\3\2"+
		"\2\2\u00ab\u01d2\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae\4\3\2\2\2\u00af\u00b0"+
		"\t\3\2\2\u00b0\6\3\2\2\2\u00b1\u00b2\t\4\2\2\u00b2\b\3\2\2\2\u00b3\u00b4"+
		"\t\5\2\2\u00b4\n\3\2\2\2\u00b5\u00b6\t\6\2\2\u00b6\f\3\2\2\2\u00b7\u00b8"+
		"\t\7\2\2\u00b8\16\3\2\2\2\u00b9\u00ba\t\b\2\2\u00ba\20\3\2\2\2\u00bb\u00bc"+
		"\t\t\2\2\u00bc\22\3\2\2\2\u00bd\u00be\t\n\2\2\u00be\24\3\2\2\2\u00bf\u00c0"+
		"\t\13\2\2\u00c0\26\3\2\2\2\u00c1\u00c2\t\f\2\2\u00c2\30\3\2\2\2\u00c3"+
		"\u00c4\t\r\2\2\u00c4\32\3\2\2\2\u00c5\u00c6\t\16\2\2\u00c6\34\3\2\2\2"+
		"\u00c7\u00c8\t\17\2\2\u00c8\36\3\2\2\2\u00c9\u00ca\t\20\2\2\u00ca \3\2"+
		"\2\2\u00cb\u00cc\t\21\2\2\u00cc\"\3\2\2\2\u00cd\u00ce\t\22\2\2\u00ce$"+
		"\3\2\2\2\u00cf\u00d0\t\23\2\2\u00d0&\3\2\2\2\u00d1\u00d2\t\24\2\2\u00d2"+
		"(\3\2\2\2\u00d3\u00d4\t\25\2\2\u00d4*\3\2\2\2\u00d5\u00d6\t\26\2\2\u00d6"+
		",\3\2\2\2\u00d7\u00d8\t\27\2\2\u00d8.\3\2\2\2\u00d9\u00da\t\30\2\2\u00da"+
		"\60\3\2\2\2\u00db\u00dc\t\31\2\2\u00dc\62\3\2\2\2\u00dd\u00de\t\32\2\2"+
		"\u00de\64\3\2\2\2\u00df\u00e0\t\33\2\2\u00e0\66\3\2\2\2\u00e1\u00e2\5"+
		"\23\n\2\u00e2\u00e3\5\r\7\2\u00e38\3\2\2\2\u00e4\u00e5\5\23\n\2\u00e5"+
		"\u00e6\5\35\17\2\u00e6\u00e7\5\21\t\2\u00e7\u00e8\5\13\6\2\u00e8\u00e9"+
		"\5%\23\2\u00e9\u00ea\5\23\n\2\u00ea\u00eb\5)\25\2\u00eb\u00ec\5\'\24\2"+
		"\u00ec:\3\2\2\2\u00ed\u00ee\5\7\4\2\u00ee\u00ef\5\3\2\2\u00ef\u00f0\5"+
		"\'\24\2\u00f0\u00f1\5\13\6\2\u00f1<\3\2\2\2\u00f2\u00f3\5\7\4\2\u00f3"+
		"\u00f4\5\31\r\2\u00f4\u00f5\5\3\2\2\u00f5\u00f6\5\'\24\2\u00f6\u00f7\5"+
		"\'\24\2\u00f7>\3\2\2\2\u00f8\u00f9\5\r\7\2\u00f9\u00fa\5\37\20\2\u00fa"+
		"\u00fb\5%\23\2\u00fb@\3\2\2\2\u00fc\u00fd\7\60\2\2\u00fdB\3\2\2\2\u00fe"+
		"\u00ff\5\13\6\2\u00ff\u0100\5\31\r\2\u0100\u0101\5\'\24\2\u0101\u0102"+
		"\5\13\6\2\u0102D\3\2\2\2\u0103\u0104\5\r\7\2\u0104\u0105\5\23\n\2\u0105"+
		"F\3\2\2\2\u0106\u0107\5\13\6\2\u0107\u0108\5\'\24\2\u0108\u0109\5\3\2"+
		"\2\u0109\u010a\5\7\4\2\u010aH\3\2\2\2\u010b\u010c\7h\2\2\u010c\u010d\5"+
		"\3\2\2\u010d\u010e\5\31\r\2\u010e\u010f\5\'\24\2\u010f\u0110\5\13\6\2"+
		"\u0110J\3\2\2\2\u0111\u0112\7v\2\2\u0112\u0113\5%\23\2\u0113\u0114\5+"+
		"\26\2\u0114\u0115\5\13\6\2\u0115L\3\2\2\2\u0116\u0117\5\23\n\2\u0117\u0118"+
		"\5\35\17\2\u0118N\3\2\2\2\u0119\u011a\5\23\n\2\u011a\u011b\5\'\24\2\u011b"+
		"\u011c\5-\27\2\u011c\u011d\5\37\20\2\u011d\u011e\5\23\n\2\u011e\u011f"+
		"\5\t\5\2\u011fP\3\2\2\2\u0120\u0121\5\31\r\2\u0121\u0122\5\13\6\2\u0122"+
		"\u0123\5)\25\2\u0123R\3\2\2\2\u0124\u0125\5\31\r\2\u0125\u0126\5\37\20"+
		"\2\u0126\u0127\5\37\20\2\u0127\u0128\5!\21\2\u0128T\3\2\2\2\u0129\u012a"+
		"\5!\21\2\u012a\u012b\5\37\20\2\u012b\u012c\5\37\20\2\u012c\u012d\5\31"+
		"\r\2\u012dV\3\2\2\2\u012e\u012f\5\35\17\2\u012f\u0130\5\37\20\2\u0130"+
		"\u0131\5)\25\2\u0131X\3\2\2\2\u0132\u0133\5\37\20\2\u0133\u0134\5\r\7"+
		"\2\u0134Z\3\2\2\2\u0135\u0136\5\35\17\2\u0136\u0137\5\13\6\2\u0137\u0138"+
		"\5/\30\2\u0138\\\3\2\2\2\u0139\u013a\5)\25\2\u013a\u013b\5\21\t\2\u013b"+
		"\u013c\5\13\6\2\u013c\u013d\5\35\17\2\u013d^\3\2\2\2\u013e\u013f\5/\30"+
		"\2\u013f\u0140\5\21\t\2\u0140\u0141\5\23\n\2\u0141\u0142\5\31\r\2\u0142"+
		"\u0143\5\13\6\2\u0143`\3\2\2\2\u0144\u0145\7=\2\2\u0145b\3\2\2\2\u0146"+
		"\u0147\7\u0080\2\2\u0147d\3\2\2\2\u0148\u0149\7>\2\2\u0149\u014a\7?\2"+
		"\2\u014af\3\2\2\2\u014b\u014c\7>\2\2\u014ch\3\2\2\2\u014d\u014e\7@\2\2"+
		"\u014ej\3\2\2\2\u014f\u0150\7@\2\2\u0150\u0151\7?\2\2\u0151l\3\2\2\2\u0152"+
		"\u0153\7/\2\2\u0153n\3\2\2\2\u0154\u0155\7-\2\2\u0155p\3\2\2\2\u0156\u0157"+
		"\7,\2\2\u0157r\3\2\2\2\u0158\u0159\7*\2\2\u0159t\3\2\2\2\u015a\u015b\7"+
		"+\2\2\u015bv\3\2\2\2\u015c\u015d\7?\2\2\u015dx\3\2\2\2\u015e\u015f\7B"+
		"\2\2\u015fz\3\2\2\2\u0160\u0161\7<\2\2\u0161|\3\2\2\2\u0162\u0163\7.\2"+
		"\2\u0163~\3\2\2\2\u0164\u0165\7\61\2\2\u0165\u0080\3\2\2\2\u0166\u0167"+
		"\7^\2\2\u0167\u0082\3\2\2\2\u0168\u0169\7>\2\2\u0169\u016a\7/\2\2\u016a"+
		"\u0084\3\2\2\2\u016b\u016c\7/\2\2\u016c\u016d\7@\2\2\u016d\u0086\3\2\2"+
		"\2\u016e\u016f\7}\2\2\u016f\u0088\3\2\2\2\u0170\u0171\7\177\2\2\u0171"+
		"\u008a\3\2\2\2\u0172\u0173\7a\2\2\u0173\u008c\3\2\2\2\u0174\u0175\7$\2"+
		"\2\u0175\u008e\3\2\2\2\u0176\u0177\7)\2\2\u0177\u0090\3\2\2\2\u0178\u0179"+
		"\7\'\2\2\u0179\u0092\3\2\2\2\u017a\u017b\7?\2\2\u017b\u017c\7@\2\2\u017c"+
		"\u0094\3\2\2\2\u017d\u0181\5g\64\2\u017e\u0181\5e\63\2\u017f\u0181\5w"+
		"<\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181"+
		"\u0096\3\2\2\2\u0182\u019b\5a\61\2\u0183\u019b\5c\62\2\u0184\u019b\5e"+
		"\63\2\u0185\u019b\5g\64\2\u0186\u019b\5i\65\2\u0187\u019b\5k\66\2\u0188"+
		"\u019b\5m\67\2\u0189\u019b\5o8\2\u018a\u019b\5q9\2\u018b\u019b\5s:\2\u018c"+
		"\u019b\5u;\2\u018d\u019b\5w<\2\u018e\u019b\5y=\2\u018f\u019b\5{>\2\u0190"+
		"\u019b\5}?\2\u0191\u019b\5\177@\2\u0192\u019b\5\u0083B\2\u0193\u019b\5"+
		"\u0085C\2\u0194\u019b\5\u0087D\2\u0195\u019b\5\u0089E\2\u0196\u019b\5"+
		"\u008dG\2\u0197\u019b\5\u008fH\2\u0198\u019b\5\u0091I\2\u0199\u019b\5"+
		"\u0081A\2\u019a\u0182\3\2\2\2\u019a\u0183\3\2\2\2\u019a\u0184\3\2\2\2"+
		"\u019a\u0185\3\2\2\2\u019a\u0186\3\2\2\2\u019a\u0187\3\2\2\2\u019a\u0188"+
		"\3\2\2\2\u019a\u0189\3\2\2\2\u019a\u018a\3\2\2\2\u019a\u018b\3\2\2\2\u019a"+
		"\u018c\3\2\2\2\u019a\u018d\3\2\2\2\u019a\u018e\3\2\2\2\u019a\u018f\3\2"+
		"\2\2\u019a\u0190\3\2\2\2\u019a\u0191\3\2\2\2\u019a\u0192\3\2\2\2\u019a"+
		"\u0193\3\2\2\2\u019a\u0194\3\2\2\2\u019a\u0195\3\2\2\2\u019a\u0196\3\2"+
		"\2\2\u019a\u0197\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b"+
		"\u0098\3\2\2\2\u019c\u019d\t\34\2\2\u019d\u009a\3\2\2\2\u019e\u019f\t"+
		"\35\2\2\u019f\u009c\3\2\2\2\u01a0\u01a6\t\36\2\2\u01a1\u01a5\5\u009bN"+
		"\2\u01a2\u01a5\5\u0099M\2\u01a3\u01a5\5\u008bF\2\u01a4\u01a1\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u009e\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u01af\t\37\2\2\u01aa\u01ae\5\u009bN\2\u01ab\u01ae\5\u008bF\2\u01ac\u01ae"+
		"\5\u0099M\2\u01ad\u01aa\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2"+
		"\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u00a0"+
		"\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\5\u0099M\2\u01b3\u01b2\3\2\2"+
		"\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u00a2"+
		"\3\2\2\2\u01b7\u01be\5\u008dG\2\u01b8\u01bd\5\u009bN\2\u01b9\u01bd\5\u0099"+
		"M\2\u01ba\u01bd\5\u0097L\2\u01bb\u01bd\7\"\2\2\u01bc\u01b8\3\2\2\2\u01bc"+
		"\u01b9\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2"+
		"\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c1\u01c2\5\u008dG\2\u01c2\u00a4\3\2\2\2\u01c3\u01c5"+
		"\t \2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\bS\2\2\u01c9\u00a6\3\2"+
		"\2\2\u01ca\u01cd\5o8\2\u01cb\u01cd\5m\67\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb"+
		"\3\2\2\2\u01cd\u00a8\3\2\2\2\u01ce\u01d1\5\177@\2\u01cf\u01d1\5q9\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u00aa\3\2\2\2\u01d2\u01d3\13"+
		"\2\2\2\u01d3\u00ac\3\2\2\2\17\2\u0180\u019a\u01a4\u01a6\u01ad\u01af\u01b5"+
		"\u01bc\u01be\u01c6\u01cc\u01d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}