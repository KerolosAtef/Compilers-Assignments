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
		OF=18, NEW=19, THEN=20, WHILE=21, TYPE=22, SEMICOLON=23, TILDE=24, LE=25, 
		LT=26, GT=27, GE=28, MINUS=29, PLUS=30, MUL=31, LPAREN=32, RPAREN=33, 
		EQUALS=34, AT=35, COLON=36, COMMA=37, DIVIDE=38, Backslash=39, LARROW=40, 
		RARROW=41, LBRACE=42, RBRACE=43, Dq=44, Sq=45, MOD=46, SpecialChars=47, 
		ID=48, Integer=49, Decimal=50, String=51, Whitespace=52, ERROR=53;
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
			"TYPE", "SEMICOLON", "TILDE", "LE", "LT", "GT", "GE", "MINUS", "PLUS", 
			"MUL", "LPAREN", "RPAREN", "EQUALS", "AT", "COLON", "COMMA", "DIVIDE", 
			"Backslash", "LARROW", "RARROW", "LBRACE", "RBRACE", "Dq", "Sq", "MOD", 
			"SpecialChars", "Digit", "Letter", "ID", "Integer", "Decimal", "String", 
			"Whitespace", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'.'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "';'", 
			"'~'", "'<='", "'<'", "'>'", "'>='", "'-'", "'+'", "'*'", "'('", "')'", 
			"'='", "'@'", "':'", "','", "'/'", "'\\'", "'<-'", "'->'", "'{'", "'}'", 
			"'\"'", "'''", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	public static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "INHERITS", "CASE", "CLASS", "FOR", "DOT", "ELSE", "FI", 
			"ESAC", "FALSE", "TRUE", "IN", "ISVOID", "LET", "LOOP", "POOL", "NOT", 
			"OF", "NEW", "THEN", "WHILE", "TYPE", "SEMICOLON", "TILDE", "LE", "LT", 
			"GT", "GE", "MINUS", "PLUS", "MUL", "LPAREN", "RPAREN", "EQUALS", "AT", 
			"COLON", "COMMA", "DIVIDE", "Backslash", "LARROW", "RARROW", "LBRACE", 
			"RBRACE", "Dq", "Sq", "MOD", "SpecialChars", "ID", "Integer", "Decimal", 
			"String", "Whitespace", "ERROR"
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 79:
			Whitespace_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Whitespace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01eb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u014a\n\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3F\3F\3"+
		"G\3G\3H\3H\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\5J\u0198\nJ\3K\3K\3L\3L\3M\3M\5M\u01a0\nM\3M\3M\3"+
		"M\7M\u01a5\nM\fM\16M\u01a8\13M\3N\3N\5N\u01ac\nN\3N\6N\u01af\nN\rN\16"+
		"N\u01b0\3N\3N\3N\5N\u01b6\nN\3N\6N\u01b9\nN\rN\16N\u01ba\5N\u01bd\nN\3"+
		"O\3O\5O\u01c1\nO\3O\6O\u01c4\nO\rO\16O\u01c5\3O\3O\6O\u01ca\nO\rO\16O"+
		"\u01cb\5O\u01ce\nO\3O\3O\3O\5O\u01d3\nO\3O\6O\u01d6\nO\rO\16O\u01d7\5"+
		"O\u01da\nO\3P\3P\3P\3P\7P\u01e0\nP\fP\16P\u01e3\13P\3P\3P\3Q\3Q\3Q\3R"+
		"\3R\2\2S\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35"+
		"\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\t"+
		"E\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33"+
		"i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089"+
		",\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095\2\u0097\2\u0099\62\u009b"+
		"\63\u009d\64\u009f\65\u00a1\66\u00a3\67\3\2\37\4\2CCcc\4\2DDdd\4\2EEe"+
		"e\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2"+
		"NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\4\2C\\c|\5\2"+
		"\13\f\17\17\"\"\2\u01fe\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\3\u00a5\3\2\2"+
		"\2\5\u00a7\3\2\2\2\7\u00a9\3\2\2\2\t\u00ab\3\2\2\2\13\u00ad\3\2\2\2\r"+
		"\u00af\3\2\2\2\17\u00b1\3\2\2\2\21\u00b3\3\2\2\2\23\u00b5\3\2\2\2\25\u00b7"+
		"\3\2\2\2\27\u00b9\3\2\2\2\31\u00bb\3\2\2\2\33\u00bd\3\2\2\2\35\u00bf\3"+
		"\2\2\2\37\u00c1\3\2\2\2!\u00c3\3\2\2\2#\u00c5\3\2\2\2%\u00c7\3\2\2\2\'"+
		"\u00c9\3\2\2\2)\u00cb\3\2\2\2+\u00cd\3\2\2\2-\u00cf\3\2\2\2/\u00d1\3\2"+
		"\2\2\61\u00d3\3\2\2\2\63\u00d5\3\2\2\2\65\u00d7\3\2\2\2\67\u00d9\3\2\2"+
		"\29\u00dc\3\2\2\2;\u00e5\3\2\2\2=\u00ea\3\2\2\2?\u00f0\3\2\2\2A\u00f4"+
		"\3\2\2\2C\u00f6\3\2\2\2E\u00fb\3\2\2\2G\u00fe\3\2\2\2I\u0103\3\2\2\2K"+
		"\u0109\3\2\2\2M\u010e\3\2\2\2O\u0111\3\2\2\2Q\u0118\3\2\2\2S\u011c\3\2"+
		"\2\2U\u0121\3\2\2\2W\u0126\3\2\2\2Y\u012a\3\2\2\2[\u012d\3\2\2\2]\u0131"+
		"\3\2\2\2_\u0136\3\2\2\2a\u0149\3\2\2\2c\u014b\3\2\2\2e\u014d\3\2\2\2g"+
		"\u014f\3\2\2\2i\u0152\3\2\2\2k\u0154\3\2\2\2m\u0156\3\2\2\2o\u0159\3\2"+
		"\2\2q\u015b\3\2\2\2s\u015d\3\2\2\2u\u015f\3\2\2\2w\u0161\3\2\2\2y\u0163"+
		"\3\2\2\2{\u0165\3\2\2\2}\u0167\3\2\2\2\177\u0169\3\2\2\2\u0081\u016b\3"+
		"\2\2\2\u0083\u016d\3\2\2\2\u0085\u016f\3\2\2\2\u0087\u0172\3\2\2\2\u0089"+
		"\u0175\3\2\2\2\u008b\u0177\3\2\2\2\u008d\u0179\3\2\2\2\u008f\u017b\3\2"+
		"\2\2\u0091\u017d\3\2\2\2\u0093\u0197\3\2\2\2\u0095\u0199\3\2\2\2\u0097"+
		"\u019b\3\2\2\2\u0099\u019f\3\2\2\2\u009b\u01ab\3\2\2\2\u009d\u01c0\3\2"+
		"\2\2\u009f\u01db\3\2\2\2\u00a1\u01e6\3\2\2\2\u00a3\u01e9\3\2\2\2\u00a5"+
		"\u00a6\t\2\2\2\u00a6\4\3\2\2\2\u00a7\u00a8\t\3\2\2\u00a8\6\3\2\2\2\u00a9"+
		"\u00aa\t\4\2\2\u00aa\b\3\2\2\2\u00ab\u00ac\t\5\2\2\u00ac\n\3\2\2\2\u00ad"+
		"\u00ae\t\6\2\2\u00ae\f\3\2\2\2\u00af\u00b0\t\7\2\2\u00b0\16\3\2\2\2\u00b1"+
		"\u00b2\t\b\2\2\u00b2\20\3\2\2\2\u00b3\u00b4\t\t\2\2\u00b4\22\3\2\2\2\u00b5"+
		"\u00b6\t\n\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\t\13\2\2\u00b8\26\3\2\2\2"+
		"\u00b9\u00ba\t\f\2\2\u00ba\30\3\2\2\2\u00bb\u00bc\t\r\2\2\u00bc\32\3\2"+
		"\2\2\u00bd\u00be\t\16\2\2\u00be\34\3\2\2\2\u00bf\u00c0\t\17\2\2\u00c0"+
		"\36\3\2\2\2\u00c1\u00c2\t\20\2\2\u00c2 \3\2\2\2\u00c3\u00c4\t\21\2\2\u00c4"+
		"\"\3\2\2\2\u00c5\u00c6\t\22\2\2\u00c6$\3\2\2\2\u00c7\u00c8\t\23\2\2\u00c8"+
		"&\3\2\2\2\u00c9\u00ca\t\24\2\2\u00ca(\3\2\2\2\u00cb\u00cc\t\25\2\2\u00cc"+
		"*\3\2\2\2\u00cd\u00ce\t\26\2\2\u00ce,\3\2\2\2\u00cf\u00d0\t\27\2\2\u00d0"+
		".\3\2\2\2\u00d1\u00d2\t\30\2\2\u00d2\60\3\2\2\2\u00d3\u00d4\t\31\2\2\u00d4"+
		"\62\3\2\2\2\u00d5\u00d6\t\32\2\2\u00d6\64\3\2\2\2\u00d7\u00d8\t\33\2\2"+
		"\u00d8\66\3\2\2\2\u00d9\u00da\5\23\n\2\u00da\u00db\5\r\7\2\u00db8\3\2"+
		"\2\2\u00dc\u00dd\5\23\n\2\u00dd\u00de\5\35\17\2\u00de\u00df\5\21\t\2\u00df"+
		"\u00e0\5\13\6\2\u00e0\u00e1\5%\23\2\u00e1\u00e2\5\23\n\2\u00e2\u00e3\5"+
		")\25\2\u00e3\u00e4\5\'\24\2\u00e4:\3\2\2\2\u00e5\u00e6\5\7\4\2\u00e6\u00e7"+
		"\5\3\2\2\u00e7\u00e8\5\'\24\2\u00e8\u00e9\5\13\6\2\u00e9<\3\2\2\2\u00ea"+
		"\u00eb\5\7\4\2\u00eb\u00ec\5\31\r\2\u00ec\u00ed\5\3\2\2\u00ed\u00ee\5"+
		"\'\24\2\u00ee\u00ef\5\'\24\2\u00ef>\3\2\2\2\u00f0\u00f1\5\r\7\2\u00f1"+
		"\u00f2\5\37\20\2\u00f2\u00f3\5%\23\2\u00f3@\3\2\2\2\u00f4\u00f5\7\60\2"+
		"\2\u00f5B\3\2\2\2\u00f6\u00f7\5\13\6\2\u00f7\u00f8\5\31\r\2\u00f8\u00f9"+
		"\5\'\24\2\u00f9\u00fa\5\13\6\2\u00faD\3\2\2\2\u00fb\u00fc\5\r\7\2\u00fc"+
		"\u00fd\5\23\n\2\u00fdF\3\2\2\2\u00fe\u00ff\5\13\6\2\u00ff\u0100\5\'\24"+
		"\2\u0100\u0101\5\3\2\2\u0101\u0102\5\7\4\2\u0102H\3\2\2\2\u0103\u0104"+
		"\7h\2\2\u0104\u0105\5\3\2\2\u0105\u0106\5\31\r\2\u0106\u0107\5\'\24\2"+
		"\u0107\u0108\5\13\6\2\u0108J\3\2\2\2\u0109\u010a\7v\2\2\u010a\u010b\5"+
		"%\23\2\u010b\u010c\5+\26\2\u010c\u010d\5\13\6\2\u010dL\3\2\2\2\u010e\u010f"+
		"\5\23\n\2\u010f\u0110\5\35\17\2\u0110N\3\2\2\2\u0111\u0112\5\23\n\2\u0112"+
		"\u0113\5\'\24\2\u0113\u0114\5-\27\2\u0114\u0115\5\37\20\2\u0115\u0116"+
		"\5\23\n\2\u0116\u0117\5\t\5\2\u0117P\3\2\2\2\u0118\u0119\5\31\r\2\u0119"+
		"\u011a\5\13\6\2\u011a\u011b\5)\25\2\u011bR\3\2\2\2\u011c\u011d\5\31\r"+
		"\2\u011d\u011e\5\37\20\2\u011e\u011f\5\37\20\2\u011f\u0120\5!\21\2\u0120"+
		"T\3\2\2\2\u0121\u0122\5!\21\2\u0122\u0123\5\37\20\2\u0123\u0124\5\37\20"+
		"\2\u0124\u0125\5\31\r\2\u0125V\3\2\2\2\u0126\u0127\5\35\17\2\u0127\u0128"+
		"\5\37\20\2\u0128\u0129\5)\25\2\u0129X\3\2\2\2\u012a\u012b\5\37\20\2\u012b"+
		"\u012c\5\r\7\2\u012cZ\3\2\2\2\u012d\u012e\5\35\17\2\u012e\u012f\5\13\6"+
		"\2\u012f\u0130\5/\30\2\u0130\\\3\2\2\2\u0131\u0132\5)\25\2\u0132\u0133"+
		"\5\21\t\2\u0133\u0134\5\13\6\2\u0134\u0135\5\35\17\2\u0135^\3\2\2\2\u0136"+
		"\u0137\5/\30\2\u0137\u0138\5\21\t\2\u0138\u0139\5\23\n\2\u0139\u013a\5"+
		"\31\r\2\u013a\u013b\5\13\6\2\u013b`\3\2\2\2\u013c\u013d\7U\2\2\u013d\u013e"+
		"\7v\2\2\u013e\u013f\7t\2\2\u013f\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141"+
		"\u014a\7i\2\2\u0142\u0143\7K\2\2\u0143\u0144\7p\2\2\u0144\u014a\7v\2\2"+
		"\u0145\u0146\7D\2\2\u0146\u0147\7q\2\2\u0147\u0148\7q\2\2\u0148\u014a"+
		"\7n\2\2\u0149\u013c\3\2\2\2\u0149\u0142\3\2\2\2\u0149\u0145\3\2\2\2\u014a"+
		"b\3\2\2\2\u014b\u014c\7=\2\2\u014cd\3\2\2\2\u014d\u014e\7\u0080\2\2\u014e"+
		"f\3\2\2\2\u014f\u0150\7>\2\2\u0150\u0151\7?\2\2\u0151h\3\2\2\2\u0152\u0153"+
		"\7>\2\2\u0153j\3\2\2\2\u0154\u0155\7@\2\2\u0155l\3\2\2\2\u0156\u0157\7"+
		"@\2\2\u0157\u0158\7?\2\2\u0158n\3\2\2\2\u0159\u015a\7/\2\2\u015ap\3\2"+
		"\2\2\u015b\u015c\7-\2\2\u015cr\3\2\2\2\u015d\u015e\7,\2\2\u015et\3\2\2"+
		"\2\u015f\u0160\7*\2\2\u0160v\3\2\2\2\u0161\u0162\7+\2\2\u0162x\3\2\2\2"+
		"\u0163\u0164\7?\2\2\u0164z\3\2\2\2\u0165\u0166\7B\2\2\u0166|\3\2\2\2\u0167"+
		"\u0168\7<\2\2\u0168~\3\2\2\2\u0169\u016a\7.\2\2\u016a\u0080\3\2\2\2\u016b"+
		"\u016c\7\61\2\2\u016c\u0082\3\2\2\2\u016d\u016e\7^\2\2\u016e\u0084\3\2"+
		"\2\2\u016f\u0170\7>\2\2\u0170\u0171\7/\2\2\u0171\u0086\3\2\2\2\u0172\u0173"+
		"\7/\2\2\u0173\u0174\7@\2\2\u0174\u0088\3\2\2\2\u0175\u0176\7}\2\2\u0176"+
		"\u008a\3\2\2\2\u0177\u0178\7\177\2\2\u0178\u008c\3\2\2\2\u0179\u017a\7"+
		"$\2\2\u017a\u008e\3\2\2\2\u017b\u017c\7)\2\2\u017c\u0090\3\2\2\2\u017d"+
		"\u017e\7\'\2\2\u017e\u0092\3\2\2\2\u017f\u0198\5c\62\2\u0180\u0198\5e"+
		"\63\2\u0181\u0198\5g\64\2\u0182\u0198\5i\65\2\u0183\u0198\5k\66\2\u0184"+
		"\u0198\5m\67\2\u0185\u0198\5o8\2\u0186\u0198\5q9\2\u0187\u0198\5s:\2\u0188"+
		"\u0198\5u;\2\u0189\u0198\5w<\2\u018a\u0198\5y=\2\u018b\u0198\5{>\2\u018c"+
		"\u0198\5}?\2\u018d\u0198\5\177@\2\u018e\u0198\5\u0081A\2\u018f\u0198\5"+
		"\u0085C\2\u0190\u0198\5\u0087D\2\u0191\u0198\5\u0089E\2\u0192\u0198\5"+
		"\u008bF\2\u0193\u0198\5\u008dG\2\u0194\u0198\5\u008fH\2\u0195\u0198\5"+
		"\u0091I\2\u0196\u0198\5\u0083B\2\u0197\u017f\3\2\2\2\u0197\u0180\3\2\2"+
		"\2\u0197\u0181\3\2\2\2\u0197\u0182\3\2\2\2\u0197\u0183\3\2\2\2\u0197\u0184"+
		"\3\2\2\2\u0197\u0185\3\2\2\2\u0197\u0186\3\2\2\2\u0197\u0187\3\2\2\2\u0197"+
		"\u0188\3\2\2\2\u0197\u0189\3\2\2\2\u0197\u018a\3\2\2\2\u0197\u018b\3\2"+
		"\2\2\u0197\u018c\3\2\2\2\u0197\u018d\3\2\2\2\u0197\u018e\3\2\2\2\u0197"+
		"\u018f\3\2\2\2\u0197\u0190\3\2\2\2\u0197\u0191\3\2\2\2\u0197\u0192\3\2"+
		"\2\2\u0197\u0193\3\2\2\2\u0197\u0194\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0196\3\2\2\2\u0198\u0094\3\2\2\2\u0199\u019a\t\34\2\2\u019a\u0096\3"+
		"\2\2\2\u019b\u019c\t\35\2\2\u019c\u0098\3\2\2\2\u019d\u01a0\7a\2\2\u019e"+
		"\u01a0\5\u0097L\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0\u01a6"+
		"\3\2\2\2\u01a1\u01a5\5\u0097L\2\u01a2\u01a5\5\u0095K\2\u01a3\u01a5\7a"+
		"\2\2\u01a4\u01a1\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u009a\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\5q9\2\u01aa\u01ac\5o8\2\u01ab\u01a9"+
		"\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01af\5\u0095K\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01bc\3\2\2\2\u01b2\u01b5\5\13\6\2"+
		"\u01b3\u01b6\5q9\2\u01b4\u01b6\5o8\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3"+
		"\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b9\5\u0095K\2"+
		"\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01b2\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u009c\3\2\2\2\u01be\u01c1\5q9\2\u01bf\u01c1\5o8\2\u01c0\u01be\3\2\2\2"+
		"\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c4"+
		"\5\u0095K\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2\2"+
		"\2\u01c5\u01c6\3\2\2\2\u01c6\u01cd\3\2\2\2\u01c7\u01c9\13\2\2\2\u01c8"+
		"\u01ca\5\u0095K\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c7\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d9\3\2\2\2\u01cf\u01d2\5\13\6\2\u01d0\u01d3\5"+
		"q9\2\u01d1\u01d3\5o8\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d6\5\u0095K\2\u01d5\u01d4\3\2\2"+
		"\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da"+
		"\3\2\2\2\u01d9\u01cf\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u009e\3\2\2\2\u01db"+
		"\u01e1\5\u008dG\2\u01dc\u01e0\5\u0097L\2\u01dd\u01e0\5\u009dO\2\u01de"+
		"\u01e0\5\u0093J\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de"+
		"\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\5\u008dG\2\u01e5\u00a0"+
		"\3\2\2\2\u01e6\u01e7\t\36\2\2\u01e7\u01e8\bQ\2\2\u01e8\u00a2\3\2\2\2\u01e9"+
		"\u01ea\13\2\2\2\u01ea\u00a4\3\2\2\2\26\2\u0149\u0197\u019f\u01a4\u01a6"+
		"\u01ab\u01b0\u01b5\u01ba\u01bc\u01c0\u01c5\u01cb\u01cd\u01d2\u01d7\u01d9"+
		"\u01df\u01e1\3\3Q\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}