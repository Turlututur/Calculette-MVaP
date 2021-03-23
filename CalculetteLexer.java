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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, NEWLINE=19, TYPE=20, IDENTIFIANT=21, ENTIER=22, OP=23, WS=24, 
		UNMATCH=25, COMMENTAIRE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "NEWLINE", "TYPE", "IDENTIFIANT", "ENTIER", "OP", "WS", "UNMATCH", 
			"COMMENTAIRE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'read'", "'write'", 
			"'&&'", "'||'", "'!'", "'true'", "'false'", "'while'", "'{'", "'}'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NEWLINE", "TYPE", "IDENTIFIANT", 
			"ENTIER", "OP", "WS", "UNMATCH", "COMMENTAIRE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\5\24q\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25}\n"+
		"\25\3\26\3\26\7\26\u0081\n\26\f\26\16\26\u0084\13\26\3\27\6\27\u0087\n"+
		"\27\r\27\16\27\u0088\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u009b\n\30\3\31\6\31\u009e\n\31\r"+
		"\31\16\31\u009f\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33"+
		"\u00ac\n\33\f\33\16\33\u00af\13\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u00b7\n\33\f\33\16\33\u00ba\13\33\3\33\5\33\u00bd\n\33\3\33\3\33\4\u00ad"+
		"\u00b8\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2"+
		"\6\5\2C\\aac|\6\2\62;C\\aac|\4\2>>@@\4\2\13\13\"\"\2\u00cf\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2"+
		"\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23J\3\2\2\2\25P\3"+
		"\2\2\2\27S\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35]\3\2\2\2\37c\3\2\2\2!i\3"+
		"\2\2\2#k\3\2\2\2%m\3\2\2\2\'p\3\2\2\2)|\3\2\2\2+~\3\2\2\2-\u0086\3\2\2"+
		"\2/\u009a\3\2\2\2\61\u009d\3\2\2\2\63\u00a3\3\2\2\2\65\u00bc\3\2\2\2\67"+
		"8\7?\2\28\4\3\2\2\29:\7*\2\2:\6\3\2\2\2;<\7+\2\2<\b\3\2\2\2=>\7,\2\2>"+
		"\n\3\2\2\2?@\7\61\2\2@\f\3\2\2\2AB\7-\2\2B\16\3\2\2\2CD\7/\2\2D\20\3\2"+
		"\2\2EF\7t\2\2FG\7g\2\2GH\7c\2\2HI\7f\2\2I\22\3\2\2\2JK\7y\2\2KL\7t\2\2"+
		"LM\7k\2\2MN\7v\2\2NO\7g\2\2O\24\3\2\2\2PQ\7(\2\2QR\7(\2\2R\26\3\2\2\2"+
		"ST\7~\2\2TU\7~\2\2U\30\3\2\2\2VW\7#\2\2W\32\3\2\2\2XY\7v\2\2YZ\7t\2\2"+
		"Z[\7w\2\2[\\\7g\2\2\\\34\3\2\2\2]^\7h\2\2^_\7c\2\2_`\7n\2\2`a\7u\2\2a"+
		"b\7g\2\2b\36\3\2\2\2cd\7y\2\2de\7j\2\2ef\7k\2\2fg\7n\2\2gh\7g\2\2h \3"+
		"\2\2\2ij\7}\2\2j\"\3\2\2\2kl\7\177\2\2l$\3\2\2\2mn\7=\2\2n&\3\2\2\2oq"+
		"\7\17\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\f\2\2s(\3\2\2\2tu\7k\2\2u"+
		"v\7p\2\2v}\7v\2\2wx\7h\2\2xy\7n\2\2yz\7q\2\2z{\7c\2\2{}\7v\2\2|t\3\2\2"+
		"\2|w\3\2\2\2}*\3\2\2\2~\u0082\t\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2"+
		"\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		",\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\4\62;\2\u0086\u0085\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089.\3"+
		"\2\2\2\u008a\u008b\7?\2\2\u008b\u009b\7?\2\2\u008c\u009b\t\4\2\2\u008d"+
		"\u008e\7>\2\2\u008e\u009b\7?\2\2\u008f\u0090\7@\2\2\u0090\u009b\7?\2\2"+
		"\u0091\u0092\7#\2\2\u0092\u009b\7?\2\2\u0093\u0094\7>\2\2\u0094\u009b"+
		"\7@\2\2\u0095\u0096\7~\2\2\u0096\u009b\7~\2\2\u0097\u0098\7(\2\2\u0098"+
		"\u009b\7(\2\2\u0099\u009b\7#\2\2\u009a\u008a\3\2\2\2\u009a\u008c\3\2\2"+
		"\2\u009a\u008d\3\2\2\2\u009a\u008f\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0093"+
		"\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\60\3\2\2\2\u009c\u009e\t\5\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2"+
		"\b\31\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\13\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\b\32\2\2\u00a6\64\3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00a9\7,\2"+
		"\2\u00a9\u00ad\3\2\2\2\u00aa\u00ac\13\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7,\2\2\u00b1\u00bd\7\61\2\2\u00b2"+
		"\u00b3\7\61\2\2\u00b3\u00b4\7\61\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b7\13"+
		"\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\5\'"+
		"\24\2\u00bc\u00a7\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\b\33\2\2\u00bf\66\3\2\2\2\f\2p|\u0082\u0088\u009a\u009f\u00ad\u00b8"+
		"\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}