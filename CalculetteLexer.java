// Generated from Calculette.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TYPE=16, IDENTIFIANT=17, 
		ENTIER=18, NEWLINE=19, WS=20, UNMATCH=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "TYPE", "IDENTIFIANT", 
			"ENTIER", "NEWLINE", "WS", "UNMATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'read'", "'('", "')'", "'write'", 
			"'true'", "'false'", "'while'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TYPE", "IDENTIFIANT", "ENTIER", "NEWLINE", "WS", 
			"UNMATCH"
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


	    private TablesSymboles tablesSymboles = new TablesSymboles();
	    private int _cur_label = 1;
	    /** générateur de nom d'étiquettes pour les boucles */
	    private String getNewLabel() { return "B" +(_cur_label++); }
	    


	public CalculetteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculette.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21f\n\21\3\22\3\22\7\22j\n\22\f\22\16\22m\13\22\3\23\6\23"+
		"p\n\23\r\23\16\23q\3\24\5\24u\n\24\3\24\3\24\3\25\6\25z\n\25\r\25\16\25"+
		"{\3\25\3\25\3\26\3\26\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3"+
		"\2\5\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2\u0087\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63"+
		"\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23@\3\2\2"+
		"\2\25F\3\2\2\2\27K\3\2\2\2\31Q\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37[\3\2"+
		"\2\2!e\3\2\2\2#g\3\2\2\2%o\3\2\2\2\'t\3\2\2\2)y\3\2\2\2+\177\3\2\2\2-"+
		".\7?\2\2.\4\3\2\2\2/\60\7,\2\2\60\6\3\2\2\2\61\62\7\61\2\2\62\b\3\2\2"+
		"\2\63\64\7-\2\2\64\n\3\2\2\2\65\66\7/\2\2\66\f\3\2\2\2\678\7t\2\289\7"+
		"g\2\29:\7c\2\2:;\7f\2\2;\16\3\2\2\2<=\7*\2\2=\20\3\2\2\2>?\7+\2\2?\22"+
		"\3\2\2\2@A\7y\2\2AB\7t\2\2BC\7k\2\2CD\7v\2\2DE\7g\2\2E\24\3\2\2\2FG\7"+
		"v\2\2GH\7t\2\2HI\7w\2\2IJ\7g\2\2J\26\3\2\2\2KL\7h\2\2LM\7c\2\2MN\7n\2"+
		"\2NO\7u\2\2OP\7g\2\2P\30\3\2\2\2QR\7y\2\2RS\7j\2\2ST\7k\2\2TU\7n\2\2U"+
		"V\7g\2\2V\32\3\2\2\2WX\7}\2\2X\34\3\2\2\2YZ\7\177\2\2Z\36\3\2\2\2[\\\7"+
		"=\2\2\\ \3\2\2\2]^\7k\2\2^_\7p\2\2_f\7v\2\2`a\7h\2\2ab\7n\2\2bc\7q\2\2"+
		"cd\7c\2\2df\7v\2\2e]\3\2\2\2e`\3\2\2\2f\"\3\2\2\2gk\t\2\2\2hj\t\3\2\2"+
		"ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l$\3\2\2\2mk\3\2\2\2np\4\62;\2"+
		"on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r&\3\2\2\2su\7\17\2\2ts\3\2\2"+
		"\2tu\3\2\2\2uv\3\2\2\2vw\7\f\2\2w(\3\2\2\2xz\t\4\2\2yx\3\2\2\2z{\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\25\2\2~*\3\2\2\2\177\u0080\13\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0082\b\26\2\2\u0082,\3\2\2\2\b\2ekqt{\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}