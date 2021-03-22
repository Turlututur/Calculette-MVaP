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
		T__9=10, T__10=11, T__11=12, T__12=13, TYPE=14, IDENTIFIANT=15, ENTIER=16, 
		NEWLINE=17, WS=18, UNMATCH=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "TYPE", "IDENTIFIANT", "ENTIER", "NEWLINE", 
			"WS", "UNMATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'read'", "'('", "')'", "'write'", 
			"'true'", "'false'", "'while'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TYPE", "IDENTIFIANT", "ENTIER", "NEWLINE", "WS", "UNMATCH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17^\n\17\3\20\3\20\7\20b\n\20\f\20"+
		"\16\20e\13\20\3\21\6\21h\n\21\r\21\16\21i\3\22\5\22m\n\22\3\22\3\22\3"+
		"\23\6\23r\n\23\r\23\16\23s\3\23\3\23\3\24\3\24\3\24\3\24\2\2\25\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25\3\2\5\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2\177"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2"+
		"\2\13\61\3\2\2\2\r\63\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25B"+
		"\3\2\2\2\27G\3\2\2\2\31M\3\2\2\2\33S\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!"+
		"g\3\2\2\2#l\3\2\2\2%q\3\2\2\2\'w\3\2\2\2)*\7?\2\2*\4\3\2\2\2+,\7,\2\2"+
		",\6\3\2\2\2-.\7\61\2\2.\b\3\2\2\2/\60\7-\2\2\60\n\3\2\2\2\61\62\7/\2\2"+
		"\62\f\3\2\2\2\63\64\7t\2\2\64\65\7g\2\2\65\66\7c\2\2\66\67\7f\2\2\67\16"+
		"\3\2\2\289\7*\2\29\20\3\2\2\2:;\7+\2\2;\22\3\2\2\2<=\7y\2\2=>\7t\2\2>"+
		"?\7k\2\2?@\7v\2\2@A\7g\2\2A\24\3\2\2\2BC\7v\2\2CD\7t\2\2DE\7w\2\2EF\7"+
		"g\2\2F\26\3\2\2\2GH\7h\2\2HI\7c\2\2IJ\7n\2\2JK\7u\2\2KL\7g\2\2L\30\3\2"+
		"\2\2MN\7y\2\2NO\7j\2\2OP\7k\2\2PQ\7n\2\2QR\7g\2\2R\32\3\2\2\2ST\7=\2\2"+
		"T\34\3\2\2\2UV\7k\2\2VW\7p\2\2W^\7v\2\2XY\7h\2\2YZ\7n\2\2Z[\7q\2\2[\\"+
		"\7c\2\2\\^\7v\2\2]U\3\2\2\2]X\3\2\2\2^\36\3\2\2\2_c\t\2\2\2`b\t\3\2\2"+
		"a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d \3\2\2\2ec\3\2\2\2fh\4\62;\2"+
		"gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\"\3\2\2\2km\7\17\2\2lk\3\2\2"+
		"\2lm\3\2\2\2mn\3\2\2\2no\7\f\2\2o$\3\2\2\2pr\t\4\2\2qp\3\2\2\2rs\3\2\2"+
		"\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\23\2\2v&\3\2\2\2wx\13\2\2\2xy\3\2"+
		"\2\2yz\b\24\2\2z(\3\2\2\2\b\2]cils\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}