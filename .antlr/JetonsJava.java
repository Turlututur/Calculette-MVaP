// Generated from d:\etudes\cours_l3\2020-2021\semestre2\langages_compilation\tp\4\JetonsJava.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JetonsJava extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATEUR=1, MOTCLE=2, IDENTIFIANT=3, WHITE_SPACE=4, NUMBER=5, SIGNLE_LINE_COMMENT=6, 
		MULTIPLE_LINES_COMMENT=7, UNMATCH=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPERATEUR", "MOTCLE", "IDENTIFIANT", "WHITE_SPACE", "EXPOSANT", "NUMBER", 
			"SIGNLE_LINE_COMMENT", "MULTIPLE_LINES_COMMENT", "UNMATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATEUR", "MOTCLE", "IDENTIFIANT", "WHITE_SPACE", "NUMBER", 
			"SIGNLE_LINE_COMMENT", "MULTIPLE_LINES_COMMENT", "UNMATCH"
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


	public JetonsJava(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JetonsJava.g4"; }

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
		case 0:
			OPERATEUR_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			MOTCLE_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			IDENTIFIANT_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			WHITE_SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			NUMBER_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			SIGNLE_LINE_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			MULTIPLE_LINES_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			UNMATCH_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void OPERATEUR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.print(getText()); 
			break;
		}
	}
	private void MOTCLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 System.out.print("[motcle : " + getText() + " ]"); 
			break;
		}
	}
	private void IDENTIFIANT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			System.out.print("[ident : " + getText() + " ]"); 
			break;
		}
	}
	private void WHITE_SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 System.out.print(getText()); 
			break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 System.out.print("[number : " +
			getText() + " ]"); 
			break;
		}
	}
	private void SIGNLE_LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 System.out.print("[comment : " + getText() + " ]"); 
					
			break;
		}
	}
	private void MULTIPLE_LINES_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 System.out.print("[multiple line comment : " +
			getText() + " ]"); 
			break;
		}
	}
	private void UNMATCH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			 System.out.print(getText()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3{\n\3\3\3\3\3"+
		"\3\4\3\4\7\4\u0081\n\4\f\4\16\4\u0084\13\4\3\4\3\4\3\5\6\5\u0089\n\5\r"+
		"\5\16\5\u008a\3\5\3\5\3\6\3\6\5\6\u0091\n\6\3\6\6\6\u0094\n\6\r\6\16\6"+
		"\u0095\3\7\5\7\u0099\n\7\3\7\6\7\u009c\n\7\r\7\16\7\u009d\3\7\3\7\7\7"+
		"\u00a2\n\7\f\7\16\7\u00a5\13\7\5\7\u00a7\n\7\3\7\5\7\u00aa\n\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\7\b\u00b2\n\b\f\b\16\b\u00b5\13\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\7\t\u00bd\n\t\f\t\16\t\u00c0\13\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\4\u00b3\u00be\2\13\3\3\5\4\7\5\t\6\13\2\r\7\17\b\21\t\23\n\3\2\7\5\2"+
		"C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17aa\4\2GGgg\4\2--//\2\u00e6\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\3\37\3\2\2\2\5z\3\2\2\2\7~\3\2\2\2\t\u0088\3"+
		"\2\2\2\13\u008e\3\2\2\2\r\u0098\3\2\2\2\17\u00ad\3\2\2\2\21\u00b8\3\2"+
		"\2\2\23\u00c6\3\2\2\2\25 \7>\2\2\26\27\7>\2\2\27 \7?\2\2\30 \7@\2\2\31"+
		"\32\7@\2\2\32 \7?\2\2\33\34\7?\2\2\34 \7?\2\2\35\36\7#\2\2\36 \7?\2\2"+
		"\37\25\3\2\2\2\37\26\3\2\2\2\37\30\3\2\2\2\37\31\3\2\2\2\37\33\3\2\2\2"+
		"\37\35\3\2\2\2 !\3\2\2\2!\"\b\2\2\2\"\4\3\2\2\2#$\7d\2\2$%\7t\2\2%&\7"+
		"g\2\2&\'\7c\2\2\'{\7m\2\2()\7e\2\2)*\7n\2\2*+\7c\2\2+,\7u\2\2,{\7u\2\2"+
		"-.\7h\2\2./\7n\2\2/\60\7q\2\2\60\61\7c\2\2\61{\7v\2\2\62\63\7n\2\2\63"+
		"\64\7q\2\2\64\65\7p\2\2\65{\7i\2\2\66\67\7f\2\2\678\7q\2\289\7w\2\29:"+
		"\7d\2\2:;\7n\2\2;{\7g\2\2<=\7g\2\2=>\7n\2\2>?\7u\2\2?{\7g\2\2@A\7k\2\2"+
		"A{\7h\2\2BC\7k\2\2CD\7o\2\2DE\7r\2\2EF\7q\2\2FG\7t\2\2G{\7v\2\2HI\7r\2"+
		"\2IJ\7w\2\2JK\7d\2\2KL\7n\2\2LM\7k\2\2M{\7e\2\2NO\7r\2\2OP\7t\2\2PQ\7"+
		"q\2\2QR\7v\2\2RS\7g\2\2ST\7e\2\2TU\7v\2\2UV\7g\2\2V{\7f\2\2WX\7r\2\2X"+
		"Y\7t\2\2YZ\7k\2\2Z[\7x\2\2[\\\7c\2\2\\]\7v\2\2]{\7g\2\2^_\7u\2\2_`\7v"+
		"\2\2`a\7c\2\2ab\7v\2\2bc\7k\2\2c{\7e\2\2de\7c\2\2ef\7d\2\2fg\7u\2\2gh"+
		"\7v\2\2hi\7t\2\2ij\7c\2\2jk\7e\2\2k{\7v\2\2lm\7v\2\2mn\7j\2\2no\7t\2\2"+
		"op\7q\2\2pq\7y\2\2q{\7u\2\2rs\7v\2\2st\7j\2\2tu\7t\2\2uv\7q\2\2v{\7y\2"+
		"\2wx\7p\2\2xy\7g\2\2y{\7y\2\2z#\3\2\2\2z(\3\2\2\2z-\3\2\2\2z\62\3\2\2"+
		"\2z\66\3\2\2\2z<\3\2\2\2z@\3\2\2\2zB\3\2\2\2zH\3\2\2\2zN\3\2\2\2zW\3\2"+
		"\2\2z^\3\2\2\2zd\3\2\2\2zl\3\2\2\2zr\3\2\2\2zw\3\2\2\2{|\3\2\2\2|}\b\3"+
		"\3\2}\6\3\2\2\2~\u0082\t\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0086\b\4\4\2\u0086\b\3\2\2\2\u0087\u0089"+
		"\t\4\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\5\5\2\u008d\n\3\2\2\2"+
		"\u008e\u0090\t\5\2\2\u008f\u0091\t\6\2\2\u0090\u008f\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0094\4\62;\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\f\3\2\2\2"+
		"\u0097\u0099\t\6\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b"+
		"\3\2\2\2\u009a\u009c\4\62;\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a6\3\2\2\2\u009f\u00a3\7\60"+
		"\2\2\u00a0\u00a2\4\62;\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00aa\5\13\6\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab\u00ac\b\7\6\2\u00ac\16\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae"+
		"\u00af\7\61\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\13\2\2\2\u00b1\u00b0\3"+
		"\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\b\7\2\u00b7\20\3\2\2"+
		"\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba\7,\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd"+
		"\13\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2"+
		"\7,\2\2\u00c2\u00c3\7\61\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\t\b\2\u00c5"+
		"\22\3\2\2\2\u00c6\u00c7\13\2\2\2\u00c7\u00c8\b\n\t\2\u00c8\24\3\2\2\2"+
		"\20\2\37z\u0082\u008a\u0090\u0095\u0098\u009d\u00a3\u00a6\u00a9\u00b3"+
		"\u00be\n\3\2\2\3\3\3\3\4\4\3\5\5\3\7\6\3\b\7\3\t\b\3\n\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}