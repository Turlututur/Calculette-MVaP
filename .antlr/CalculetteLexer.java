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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, NEWLINE=21, TYPE=22, IDENTIFIANT=23, ENTIER=24, 
		OP=25, WS=26, UNMATCH=27, COMMENTAIRE=28;
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
			"T__17", "T__18", "T__19", "NEWLINE", "TYPE", "IDENTIFIANT", "ENTIER", 
			"OP", "WS", "UNMATCH", "COMMENTAIRE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'read'", "'write'", 
			"'&&'", "'||'", "'!'", "'true'", "'false'", "'while'", "'if'", "'else'", 
			"'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NEWLINE", "TYPE", 
			"IDENTIFIANT", "ENTIER", "OP", "WS", "UNMATCH", "COMMENTAIRE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00cc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\5\26}\n\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0089\n\27\3\30"+
		"\3\30\7\30\u008d\n\30\f\30\16\30\u0090\13\30\3\31\6\31\u0093\n\31\r\31"+
		"\16\31\u0094\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u00a7\n\32\3\33\6\33\u00aa\n\33\r\33\16\33"+
		"\u00ab\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00b8\n"+
		"\35\f\35\16\35\u00bb\13\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u00c3\n"+
		"\35\f\35\16\35\u00c6\13\35\3\35\5\35\u00c9\n\35\3\35\3\35\4\u00b9\u00c4"+
		"\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		"\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\4\2>>@@\4\2\13\13\"\"\2\u00db\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5"+
		"=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21"+
		"I\3\2\2\2\23N\3\2\2\2\25T\3\2\2\2\27W\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2"+
		"\35a\3\2\2\2\37g\3\2\2\2!m\3\2\2\2#p\3\2\2\2%u\3\2\2\2\'w\3\2\2\2)y\3"+
		"\2\2\2+|\3\2\2\2-\u0088\3\2\2\2/\u008a\3\2\2\2\61\u0092\3\2\2\2\63\u00a6"+
		"\3\2\2\2\65\u00a9\3\2\2\2\67\u00af\3\2\2\29\u00c8\3\2\2\2;<\7?\2\2<\4"+
		"\3\2\2\2=>\7*\2\2>\6\3\2\2\2?@\7+\2\2@\b\3\2\2\2AB\7,\2\2B\n\3\2\2\2C"+
		"D\7\61\2\2D\f\3\2\2\2EF\7-\2\2F\16\3\2\2\2GH\7/\2\2H\20\3\2\2\2IJ\7t\2"+
		"\2JK\7g\2\2KL\7c\2\2LM\7f\2\2M\22\3\2\2\2NO\7y\2\2OP\7t\2\2PQ\7k\2\2Q"+
		"R\7v\2\2RS\7g\2\2S\24\3\2\2\2TU\7(\2\2UV\7(\2\2V\26\3\2\2\2WX\7~\2\2X"+
		"Y\7~\2\2Y\30\3\2\2\2Z[\7#\2\2[\32\3\2\2\2\\]\7v\2\2]^\7t\2\2^_\7w\2\2"+
		"_`\7g\2\2`\34\3\2\2\2ab\7h\2\2bc\7c\2\2cd\7n\2\2de\7u\2\2ef\7g\2\2f\36"+
		"\3\2\2\2gh\7y\2\2hi\7j\2\2ij\7k\2\2jk\7n\2\2kl\7g\2\2l \3\2\2\2mn\7k\2"+
		"\2no\7h\2\2o\"\3\2\2\2pq\7g\2\2qr\7n\2\2rs\7u\2\2st\7g\2\2t$\3\2\2\2u"+
		"v\7}\2\2v&\3\2\2\2wx\7\177\2\2x(\3\2\2\2yz\7=\2\2z*\3\2\2\2{}\7\17\2\2"+
		"|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\f\2\2\177,\3\2\2\2\u0080\u0081\7"+
		"k\2\2\u0081\u0082\7p\2\2\u0082\u0089\7v\2\2\u0083\u0084\7h\2\2\u0084\u0085"+
		"\7n\2\2\u0085\u0086\7q\2\2\u0086\u0087\7c\2\2\u0087\u0089\7v\2\2\u0088"+
		"\u0080\3\2\2\2\u0088\u0083\3\2\2\2\u0089.\3\2\2\2\u008a\u008e\t\2\2\2"+
		"\u008b\u008d\t\3\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\60\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0093\4\62;\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\62\3\2\2\2\u0096\u0097\7?\2\2\u0097\u00a7"+
		"\7?\2\2\u0098\u00a7\t\4\2\2\u0099\u009a\7>\2\2\u009a\u00a7\7?\2\2\u009b"+
		"\u009c\7@\2\2\u009c\u00a7\7?\2\2\u009d\u009e\7#\2\2\u009e\u00a7\7?\2\2"+
		"\u009f\u00a0\7>\2\2\u00a0\u00a7\7@\2\2\u00a1\u00a2\7~\2\2\u00a2\u00a7"+
		"\7~\2\2\u00a3\u00a4\7(\2\2\u00a4\u00a7\7(\2\2\u00a5\u00a7\7#\2\2\u00a6"+
		"\u0096\3\2\2\2\u00a6\u0098\3\2\2\2\u00a6\u0099\3\2\2\2\u00a6\u009b\3\2"+
		"\2\2\u00a6\u009d\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\64\3\2\2\2\u00a8\u00aa\t\5\2"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\33\2\2\u00ae\66\3\2\2\2\u00af"+
		"\u00b0\13\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\34\2\2\u00b28\3\2\2"+
		"\2\u00b3\u00b4\7\61\2\2\u00b4\u00b5\7,\2\2\u00b5\u00b9\3\2\2\2\u00b6\u00b8"+
		"\13\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\7,\2\2\u00bd\u00c9\7\61\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c0\7\61\2\2"+
		"\u00c0\u00c4\3\2\2\2\u00c1\u00c3\13\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c9\5+\26\2\u00c8\u00b3\3\2\2\2\u00c8\u00be\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\35\2\2\u00cb:\3\2\2\2\f\2|\u0088"+
		"\u008e\u0094\u00a6\u00ab\u00b9\u00c4\u00c8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}