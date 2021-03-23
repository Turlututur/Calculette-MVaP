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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NEWLINE=16, 
		TYPE=17, IDENTIFIANT=18, ENTIER=19, OP=20, WS=21, UNMATCH=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "NEWLINE", "TYPE", 
			"IDENTIFIANT", "ENTIER", "OP", "WS", "UNMATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'read'", "'write'", 
			"'true'", "'false'", "'while'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NEWLINE", "TYPE", "IDENTIFIANT", "ENTIER", "OP", 
			"WS", "UNMATCH"
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

	    private String operateurComp(String op){
	        if(op.equals("==")){return op = " EQUAL";}
	        else if(op.equals("<")){return op = " INF";}
	        else if(op.equals(">")){return op = " SUP";}
	        else if(op.equals(">=")){return op = " SUPEQ";}
	        else if(op.equals("<=")){return op = " INFEQ";}
	    return op=" NEQ";
	}

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\5\21a\n\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22m\n\22\3\23\3\23\7\23"+
		"q\n\23\f\23\16\23t\13\23\3\24\6\24w\n\24\r\24\16\24x\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0086\n\25\3\26\6\26\u0089"+
		"\n\26\r\26\16\26\u008a\3\26\3\26\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\4\2>>@@\4\2"+
		"\13\13\"\"\2\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2"+
		"\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23B\3\2\2\2\25H\3\2\2\2\27M\3\2\2"+
		"\2\31S\3\2\2\2\33Y\3\2\2\2\35[\3\2\2\2\37]\3\2\2\2!`\3\2\2\2#l\3\2\2\2"+
		"%n\3\2\2\2\'v\3\2\2\2)\u0085\3\2\2\2+\u0088\3\2\2\2-\u008e\3\2\2\2/\60"+
		"\7?\2\2\60\4\3\2\2\2\61\62\7*\2\2\62\6\3\2\2\2\63\64\7+\2\2\64\b\3\2\2"+
		"\2\65\66\7,\2\2\66\n\3\2\2\2\678\7\61\2\28\f\3\2\2\29:\7-\2\2:\16\3\2"+
		"\2\2;<\7/\2\2<\20\3\2\2\2=>\7t\2\2>?\7g\2\2?@\7c\2\2@A\7f\2\2A\22\3\2"+
		"\2\2BC\7y\2\2CD\7t\2\2DE\7k\2\2EF\7v\2\2FG\7g\2\2G\24\3\2\2\2HI\7v\2\2"+
		"IJ\7t\2\2JK\7w\2\2KL\7g\2\2L\26\3\2\2\2MN\7h\2\2NO\7c\2\2OP\7n\2\2PQ\7"+
		"u\2\2QR\7g\2\2R\30\3\2\2\2ST\7y\2\2TU\7j\2\2UV\7k\2\2VW\7n\2\2WX\7g\2"+
		"\2X\32\3\2\2\2YZ\7}\2\2Z\34\3\2\2\2[\\\7\177\2\2\\\36\3\2\2\2]^\7=\2\2"+
		"^ \3\2\2\2_a\7\17\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\f\2\2c\"\3\2\2"+
		"\2de\7k\2\2ef\7p\2\2fm\7v\2\2gh\7h\2\2hi\7n\2\2ij\7q\2\2jk\7c\2\2km\7"+
		"v\2\2ld\3\2\2\2lg\3\2\2\2m$\3\2\2\2nr\t\2\2\2oq\t\3\2\2po\3\2\2\2qt\3"+
		"\2\2\2rp\3\2\2\2rs\3\2\2\2s&\3\2\2\2tr\3\2\2\2uw\4\62;\2vu\3\2\2\2wx\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y(\3\2\2\2z{\7?\2\2{\u0086\7?\2\2|\u0086\t\4"+
		"\2\2}~\7>\2\2~\u0086\7?\2\2\177\u0080\7@\2\2\u0080\u0086\7?\2\2\u0081"+
		"\u0082\7#\2\2\u0082\u0086\7?\2\2\u0083\u0084\7>\2\2\u0084\u0086\7@\2\2"+
		"\u0085z\3\2\2\2\u0085|\3\2\2\2\u0085}\3\2\2\2\u0085\177\3\2\2\2\u0085"+
		"\u0081\3\2\2\2\u0085\u0083\3\2\2\2\u0086*\3\2\2\2\u0087\u0089\t\5\2\2"+
		"\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\26\2\2\u008d,\3\2\2\2\u008e"+
		"\u008f\13\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\27\2\2\u0091.\3\2\2"+
		"\2\t\2`lrx\u0085\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}