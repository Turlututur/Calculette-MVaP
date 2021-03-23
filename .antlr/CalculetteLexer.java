// Generated from c:\Users\Miste\OneDrive\Documents\Travail\L3_info\S6\Language&Compil\Calculette-21806332-21701890\Calculette.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NEWLINE=16, 
		TYPE=17, IDENTIFIANT=18, ENTIER=19, OP=20, WS=21, UNMATCH=22, COMMENTAIRE=23;
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
			"IDENTIFIANT", "ENTIER", "OP", "WS", "UNMATCH", "COMMENTAIRE"
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
			"WS", "UNMATCH", "COMMENTAIRE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\5\21"+
		"c\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22o\n\22\3"+
		"\23\3\23\7\23s\n\23\f\23\16\23v\13\23\3\24\6\24y\n\24\r\24\16\24z\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0088\n\25\3\26"+
		"\6\26\u008b\n\26\r\26\16\26\u008c\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\7\30\u0099\n\30\f\30\16\30\u009c\13\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\7\30\u00a4\n\30\f\30\16\30\u00a7\13\30\3\30\5\30\u00aa\n"+
		"\30\3\30\3\30\4\u009a\u00a5\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\4\2>>@@\4\2\13\13\"\"\2\u00b9\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3"+
		"\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17"+
		"=\3\2\2\2\21?\3\2\2\2\23D\3\2\2\2\25J\3\2\2\2\27O\3\2\2\2\31U\3\2\2\2"+
		"\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!b\3\2\2\2#n\3\2\2\2%p\3\2\2\2\'x"+
		"\3\2\2\2)\u0087\3\2\2\2+\u008a\3\2\2\2-\u0090\3\2\2\2/\u00a9\3\2\2\2\61"+
		"\62\7?\2\2\62\4\3\2\2\2\63\64\7*\2\2\64\6\3\2\2\2\65\66\7+\2\2\66\b\3"+
		"\2\2\2\678\7,\2\28\n\3\2\2\29:\7\61\2\2:\f\3\2\2\2;<\7-\2\2<\16\3\2\2"+
		"\2=>\7/\2\2>\20\3\2\2\2?@\7t\2\2@A\7g\2\2AB\7c\2\2BC\7f\2\2C\22\3\2\2"+
		"\2DE\7y\2\2EF\7t\2\2FG\7k\2\2GH\7v\2\2HI\7g\2\2I\24\3\2\2\2JK\7v\2\2K"+
		"L\7t\2\2LM\7w\2\2MN\7g\2\2N\26\3\2\2\2OP\7h\2\2PQ\7c\2\2QR\7n\2\2RS\7"+
		"u\2\2ST\7g\2\2T\30\3\2\2\2UV\7y\2\2VW\7j\2\2WX\7k\2\2XY\7n\2\2YZ\7g\2"+
		"\2Z\32\3\2\2\2[\\\7}\2\2\\\34\3\2\2\2]^\7\177\2\2^\36\3\2\2\2_`\7=\2\2"+
		"` \3\2\2\2ac\7\17\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\f\2\2e\"\3\2\2"+
		"\2fg\7k\2\2gh\7p\2\2ho\7v\2\2ij\7h\2\2jk\7n\2\2kl\7q\2\2lm\7c\2\2mo\7"+
		"v\2\2nf\3\2\2\2ni\3\2\2\2o$\3\2\2\2pt\t\2\2\2qs\t\3\2\2rq\3\2\2\2sv\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2u&\3\2\2\2vt\3\2\2\2wy\4\62;\2xw\3\2\2\2yz\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{(\3\2\2\2|}\7?\2\2}\u0088\7?\2\2~\u0088\t\4"+
		"\2\2\177\u0080\7>\2\2\u0080\u0088\7?\2\2\u0081\u0082\7@\2\2\u0082\u0088"+
		"\7?\2\2\u0083\u0084\7#\2\2\u0084\u0088\7?\2\2\u0085\u0086\7>\2\2\u0086"+
		"\u0088\7@\2\2\u0087|\3\2\2\2\u0087~\3\2\2\2\u0087\177\3\2\2\2\u0087\u0081"+
		"\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088*\3\2\2\2\u0089"+
		"\u008b\t\5\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\26\2\2\u008f"+
		",\3\2\2\2\u0090\u0091\13\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\27\2"+
		"\2\u0093.\3\2\2\2\u0094\u0095\7\61\2\2\u0095\u0096\7,\2\2\u0096\u009a"+
		"\3\2\2\2\u0097\u0099\13\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009d\u009e\7,\2\2\u009e\u00aa\7\61\2\2\u009f\u00a0\7\61\2\2"+
		"\u00a0\u00a1\7\61\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\5!\21\2\u00a9\u0094\3\2"+
		"\2\2\u00a9\u009f\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\30\2\2\u00ac"+
		"\60\3\2\2\2\f\2bntz\u0087\u008c\u009a\u00a5\u00a9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}