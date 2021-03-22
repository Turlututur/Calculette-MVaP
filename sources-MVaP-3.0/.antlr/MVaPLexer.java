// Generated from c:\Users\Miste\OneDrive\Documents\Travail\L3_info\S6\Language&Compil\Calculette-21806332-21701890\sources-MVaP-3.0\MVaP.g4 by ANTLR 4.8

    import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MVaPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ENTIER=2, FLOAT=3, ADD=4, SUB=5, MUL=6, DIV=7, INF=8, INFEQ=9, SUP=10, 
		SUPEQ=11, EQUAL=12, NEQ=13, FADD=14, FSUB=15, FMUL=16, FDIV=17, FINF=18, 
		FINFEQ=19, FSUP=20, FSUPEQ=21, FEQUAL=22, FNEQ=23, ITOF=24, FTOI=25, RETURN=26, 
		POP=27, POPF=28, READ=29, READF=30, WRITE=31, WRITEF=32, PADD=33, PUSHGP=34, 
		PUSHFP=35, DUP=36, PUSHI=37, PUSHG=38, STOREG=39, PUSHL=40, STOREL=41, 
		PUSHR=42, STORER=43, FREE=44, ALLOC=45, PUSHF=46, CALL=47, JUMP=48, JUMPF=49, 
		JUMPI=50, HALT=51, LABEL=52, IDENTIFIANT=53, NEWLINE=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "ENTIER", "FLOAT", "EXPONENT", "ADD", "SUB", "MUL", "DIV", "INF", 
			"INFEQ", "SUP", "SUPEQ", "EQUAL", "NEQ", "FADD", "FSUB", "FMUL", "FDIV", 
			"FINF", "FINFEQ", "FSUP", "FSUPEQ", "FEQUAL", "FNEQ", "ITOF", "FTOI", 
			"RETURN", "POP", "POPF", "READ", "READF", "WRITE", "WRITEF", "PADD", 
			"PUSHGP", "PUSHFP", "DUP", "PUSHI", "PUSHG", "STOREG", "PUSHL", "STOREL", 
			"PUSHR", "STORER", "FREE", "ALLOC", "PUSHF", "CALL", "JUMP", "JUMPF", 
			"JUMPI", "HALT", "LABEL", "IDENTIFIANT", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'ADD'", "'SUB'", "'MUL'", "'DIV'", "'INF'", 
			"'INFEQ'", "'SUP'", "'SUPEQ'", "'EQUAL'", "'NEQ'", "'FADD'", "'FSUB'", 
			"'FMUL'", "'FDIV'", "'FINF'", "'FINFEQ'", "'FSUP'", "'FSUPEQ'", "'FEQUAL'", 
			"'FNEQ'", "'ITOF'", "'FTOI'", "'RETURN'", "'POP'", "'POPF'", "'READ'", 
			"'READF'", "'WRITE'", "'WRITEF'", "'PADD'", "'PUSHGP'", "'PUSHFP'", "'DUP'", 
			"'PUSHI'", "'PUSHG'", "'STOREG'", "'PUSHL'", "'STOREL'", "'PUSHR'", "'STORER'", 
			"'FREE'", "'ALLOC'", "'PUSHF'", "'CALL'", "'JUMP '", "'JUMPF'", "'JUMPI'", 
			"'HALT'", "'LABEL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "ENTIER", "FLOAT", "ADD", "SUB", "MUL", "DIV", "INF", "INFEQ", 
			"SUP", "SUPEQ", "EQUAL", "NEQ", "FADD", "FSUB", "FMUL", "FDIV", "FINF", 
			"FINFEQ", "FSUP", "FSUPEQ", "FEQUAL", "FNEQ", "ITOF", "FTOI", "RETURN", 
			"POP", "POPF", "READ", "READF", "WRITE", "WRITEF", "PADD", "PUSHGP", 
			"PUSHFP", "DUP", "PUSHI", "PUSHG", "STOREG", "PUSHL", "STOREL", "PUSHR", 
			"STORER", "FREE", "ALLOC", "PUSHF", "CALL", "JUMP", "JUMPF", "JUMPI", 
			"HALT", "LABEL", "IDENTIFIANT", "NEWLINE"
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


	    /** La map pour mémoriser les addresses des étiquettes */
	    private HashMap<String, Integer> labels = new HashMap<String, Integer>();
	    /** adresse instruction */
	    private int instrAddress = 0;
	    /** Récupère le dictionnaire des étiquettes */
	    public HashMap<String, Integer> getLabels() { return labels; }
	    public int getProgramSize() { return instrAddress; }


	public MVaPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MVaP.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\6\2s\n\2\r\2\16\2t\3\2\3\2"+
		"\3\3\5\3z\n\3\3\3\6\3}\n\3\r\3\16\3~\3\4\6\4\u0082\n\4\r\4\16\4\u0083"+
		"\3\4\3\4\7\4\u0088\n\4\f\4\16\4\u008b\13\4\3\4\5\4\u008e\n\4\3\4\3\4\6"+
		"\4\u0092\n\4\r\4\16\4\u0093\3\4\5\4\u0097\n\4\3\4\6\4\u009a\n\4\r\4\16"+
		"\4\u009b\3\4\5\4\u009f\n\4\3\5\3\5\5\5\u00a3\n\5\3\5\6\5\u00a6\n\5\r\5"+
		"\16\5\u00a7\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u01bb\n\67\f\67"+
		"\16\67\u01be\13\67\38\38\78\u01c2\n8\f8\168\u01c5\138\58\u01c7\n8\38\5"+
		"8\u01ca\n8\38\38\2\29\3\3\5\4\7\5\t\2\13\6\r\7\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32"+
		"\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62"+
		"e\63g\64i\65k\66m\67o8\3\2\b\4\2\13\13\"\"\4\2--//\4\2GGgg\5\2C\\aac|"+
		"\6\2\62;C\\aac|\4\2\f\f\17\17\2\u01dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3r\3\2\2\2\5y\3\2\2\2\7\u009e\3"+
		"\2\2\2\t\u00a0\3\2\2\2\13\u00a9\3\2\2\2\r\u00ad\3\2\2\2\17\u00b1\3\2\2"+
		"\2\21\u00b5\3\2\2\2\23\u00b9\3\2\2\2\25\u00bd\3\2\2\2\27\u00c3\3\2\2\2"+
		"\31\u00c7\3\2\2\2\33\u00cd\3\2\2\2\35\u00d3\3\2\2\2\37\u00d7\3\2\2\2!"+
		"\u00dc\3\2\2\2#\u00e1\3\2\2\2%\u00e6\3\2\2\2\'\u00eb\3\2\2\2)\u00f0\3"+
		"\2\2\2+\u00f7\3\2\2\2-\u00fc\3\2\2\2/\u0103\3\2\2\2\61\u010a\3\2\2\2\63"+
		"\u010f\3\2\2\2\65\u0114\3\2\2\2\67\u0119\3\2\2\29\u0120\3\2\2\2;\u0124"+
		"\3\2\2\2=\u0129\3\2\2\2?\u012e\3\2\2\2A\u0134\3\2\2\2C\u013a\3\2\2\2E"+
		"\u0141\3\2\2\2G\u0146\3\2\2\2I\u014d\3\2\2\2K\u0154\3\2\2\2M\u0158\3\2"+
		"\2\2O\u015e\3\2\2\2Q\u0164\3\2\2\2S\u016b\3\2\2\2U\u0171\3\2\2\2W\u0178"+
		"\3\2\2\2Y\u017e\3\2\2\2[\u0185\3\2\2\2]\u018a\3\2\2\2_\u0190\3\2\2\2a"+
		"\u0196\3\2\2\2c\u019b\3\2\2\2e\u01a1\3\2\2\2g\u01a7\3\2\2\2i\u01ad\3\2"+
		"\2\2k\u01b2\3\2\2\2m\u01b8\3\2\2\2o\u01c6\3\2\2\2qs\t\2\2\2rq\3\2\2\2"+
		"st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\2\2\2w\4\3\2\2\2xz\t\3\2"+
		"\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\4\62;\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177\6\3\2\2\2\u0080\u0082\4\62;\2\u0081\u0080\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0089\7\60\2\2\u0086\u0088\4\62;\2\u0087\u0086\3\2\2\2"+
		"\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\5\t\5\2\u008d\u008c\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u009f\3\2\2\2\u008f\u0091\7\60\2\2\u0090\u0092\4"+
		"\62;\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097\5\t\5\2\u0096\u0095\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u009f\3\2\2\2\u0098\u009a\4\62;\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009f\5\t\5\2\u009e\u0081\3\2\2\2\u009e"+
		"\u008f\3\2\2\2\u009e\u0099\3\2\2\2\u009f\b\3\2\2\2\u00a0\u00a2\t\4\2\2"+
		"\u00a1\u00a3\t\3\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4\u00a6\4\62;\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\n\3\2\2\2\u00a9\u00aa\7C\2\2"+
		"\u00aa\u00ab\7F\2\2\u00ab\u00ac\7F\2\2\u00ac\f\3\2\2\2\u00ad\u00ae\7U"+
		"\2\2\u00ae\u00af\7W\2\2\u00af\u00b0\7D\2\2\u00b0\16\3\2\2\2\u00b1\u00b2"+
		"\7O\2\2\u00b2\u00b3\7W\2\2\u00b3\u00b4\7N\2\2\u00b4\20\3\2\2\2\u00b5\u00b6"+
		"\7F\2\2\u00b6\u00b7\7K\2\2\u00b7\u00b8\7X\2\2\u00b8\22\3\2\2\2\u00b9\u00ba"+
		"\7K\2\2\u00ba\u00bb\7P\2\2\u00bb\u00bc\7H\2\2\u00bc\24\3\2\2\2\u00bd\u00be"+
		"\7K\2\2\u00be\u00bf\7P\2\2\u00bf\u00c0\7H\2\2\u00c0\u00c1\7G\2\2\u00c1"+
		"\u00c2\7S\2\2\u00c2\26\3\2\2\2\u00c3\u00c4\7U\2\2\u00c4\u00c5\7W\2\2\u00c5"+
		"\u00c6\7R\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7U\2\2\u00c8\u00c9\7W\2\2\u00c9"+
		"\u00ca\7R\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cc\7S\2\2\u00cc\32\3\2\2\2\u00cd"+
		"\u00ce\7G\2\2\u00ce\u00cf\7S\2\2\u00cf\u00d0\7W\2\2\u00d0\u00d1\7C\2\2"+
		"\u00d1\u00d2\7N\2\2\u00d2\34\3\2\2\2\u00d3\u00d4\7P\2\2\u00d4\u00d5\7"+
		"G\2\2\u00d5\u00d6\7S\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\7H\2\2\u00d8\u00d9"+
		"\7C\2\2\u00d9\u00da\7F\2\2\u00da\u00db\7F\2\2\u00db \3\2\2\2\u00dc\u00dd"+
		"\7H\2\2\u00dd\u00de\7U\2\2\u00de\u00df\7W\2\2\u00df\u00e0\7D\2\2\u00e0"+
		"\"\3\2\2\2\u00e1\u00e2\7H\2\2\u00e2\u00e3\7O\2\2\u00e3\u00e4\7W\2\2\u00e4"+
		"\u00e5\7N\2\2\u00e5$\3\2\2\2\u00e6\u00e7\7H\2\2\u00e7\u00e8\7F\2\2\u00e8"+
		"\u00e9\7K\2\2\u00e9\u00ea\7X\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7H\2\2\u00ec"+
		"\u00ed\7K\2\2\u00ed\u00ee\7P\2\2\u00ee\u00ef\7H\2\2\u00ef(\3\2\2\2\u00f0"+
		"\u00f1\7H\2\2\u00f1\u00f2\7K\2\2\u00f2\u00f3\7P\2\2\u00f3\u00f4\7H\2\2"+
		"\u00f4\u00f5\7G\2\2\u00f5\u00f6\7S\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7H\2"+
		"\2\u00f8\u00f9\7U\2\2\u00f9\u00fa\7W\2\2\u00fa\u00fb\7R\2\2\u00fb,\3\2"+
		"\2\2\u00fc\u00fd\7H\2\2\u00fd\u00fe\7U\2\2\u00fe\u00ff\7W\2\2\u00ff\u0100"+
		"\7R\2\2\u0100\u0101\7G\2\2\u0101\u0102\7S\2\2\u0102.\3\2\2\2\u0103\u0104"+
		"\7H\2\2\u0104\u0105\7G\2\2\u0105\u0106\7S\2\2\u0106\u0107\7W\2\2\u0107"+
		"\u0108\7C\2\2\u0108\u0109\7N\2\2\u0109\60\3\2\2\2\u010a\u010b\7H\2\2\u010b"+
		"\u010c\7P\2\2\u010c\u010d\7G\2\2\u010d\u010e\7S\2\2\u010e\62\3\2\2\2\u010f"+
		"\u0110\7K\2\2\u0110\u0111\7V\2\2\u0111\u0112\7Q\2\2\u0112\u0113\7H\2\2"+
		"\u0113\64\3\2\2\2\u0114\u0115\7H\2\2\u0115\u0116\7V\2\2\u0116\u0117\7"+
		"Q\2\2\u0117\u0118\7K\2\2\u0118\66\3\2\2\2\u0119\u011a\7T\2\2\u011a\u011b"+
		"\7G\2\2\u011b\u011c\7V\2\2\u011c\u011d\7W\2\2\u011d\u011e\7T\2\2\u011e"+
		"\u011f\7P\2\2\u011f8\3\2\2\2\u0120\u0121\7R\2\2\u0121\u0122\7Q\2\2\u0122"+
		"\u0123\7R\2\2\u0123:\3\2\2\2\u0124\u0125\7R\2\2\u0125\u0126\7Q\2\2\u0126"+
		"\u0127\7R\2\2\u0127\u0128\7H\2\2\u0128<\3\2\2\2\u0129\u012a\7T\2\2\u012a"+
		"\u012b\7G\2\2\u012b\u012c\7C\2\2\u012c\u012d\7F\2\2\u012d>\3\2\2\2\u012e"+
		"\u012f\7T\2\2\u012f\u0130\7G\2\2\u0130\u0131\7C\2\2\u0131\u0132\7F\2\2"+
		"\u0132\u0133\7H\2\2\u0133@\3\2\2\2\u0134\u0135\7Y\2\2\u0135\u0136\7T\2"+
		"\2\u0136\u0137\7K\2\2\u0137\u0138\7V\2\2\u0138\u0139\7G\2\2\u0139B\3\2"+
		"\2\2\u013a\u013b\7Y\2\2\u013b\u013c\7T\2\2\u013c\u013d\7K\2\2\u013d\u013e"+
		"\7V\2\2\u013e\u013f\7G\2\2\u013f\u0140\7H\2\2\u0140D\3\2\2\2\u0141\u0142"+
		"\7R\2\2\u0142\u0143\7C\2\2\u0143\u0144\7F\2\2\u0144\u0145\7F\2\2\u0145"+
		"F\3\2\2\2\u0146\u0147\7R\2\2\u0147\u0148\7W\2\2\u0148\u0149\7U\2\2\u0149"+
		"\u014a\7J\2\2\u014a\u014b\7I\2\2\u014b\u014c\7R\2\2\u014cH\3\2\2\2\u014d"+
		"\u014e\7R\2\2\u014e\u014f\7W\2\2\u014f\u0150\7U\2\2\u0150\u0151\7J\2\2"+
		"\u0151\u0152\7H\2\2\u0152\u0153\7R\2\2\u0153J\3\2\2\2\u0154\u0155\7F\2"+
		"\2\u0155\u0156\7W\2\2\u0156\u0157\7R\2\2\u0157L\3\2\2\2\u0158\u0159\7"+
		"R\2\2\u0159\u015a\7W\2\2\u015a\u015b\7U\2\2\u015b\u015c\7J\2\2\u015c\u015d"+
		"\7K\2\2\u015dN\3\2\2\2\u015e\u015f\7R\2\2\u015f\u0160\7W\2\2\u0160\u0161"+
		"\7U\2\2\u0161\u0162\7J\2\2\u0162\u0163\7I\2\2\u0163P\3\2\2\2\u0164\u0165"+
		"\7U\2\2\u0165\u0166\7V\2\2\u0166\u0167\7Q\2\2\u0167\u0168\7T\2\2\u0168"+
		"\u0169\7G\2\2\u0169\u016a\7I\2\2\u016aR\3\2\2\2\u016b\u016c\7R\2\2\u016c"+
		"\u016d\7W\2\2\u016d\u016e\7U\2\2\u016e\u016f\7J\2\2\u016f\u0170\7N\2\2"+
		"\u0170T\3\2\2\2\u0171\u0172\7U\2\2\u0172\u0173\7V\2\2\u0173\u0174\7Q\2"+
		"\2\u0174\u0175\7T\2\2\u0175\u0176\7G\2\2\u0176\u0177\7N\2\2\u0177V\3\2"+
		"\2\2\u0178\u0179\7R\2\2\u0179\u017a\7W\2\2\u017a\u017b\7U\2\2\u017b\u017c"+
		"\7J\2\2\u017c\u017d\7T\2\2\u017dX\3\2\2\2\u017e\u017f\7U\2\2\u017f\u0180"+
		"\7V\2\2\u0180\u0181\7Q\2\2\u0181\u0182\7T\2\2\u0182\u0183\7G\2\2\u0183"+
		"\u0184\7T\2\2\u0184Z\3\2\2\2\u0185\u0186\7H\2\2\u0186\u0187\7T\2\2\u0187"+
		"\u0188\7G\2\2\u0188\u0189\7G\2\2\u0189\\\3\2\2\2\u018a\u018b\7C\2\2\u018b"+
		"\u018c\7N\2\2\u018c\u018d\7N\2\2\u018d\u018e\7Q\2\2\u018e\u018f\7E\2\2"+
		"\u018f^\3\2\2\2\u0190\u0191\7R\2\2\u0191\u0192\7W\2\2\u0192\u0193\7U\2"+
		"\2\u0193\u0194\7J\2\2\u0194\u0195\7H\2\2\u0195`\3\2\2\2\u0196\u0197\7"+
		"E\2\2\u0197\u0198\7C\2\2\u0198\u0199\7N\2\2\u0199\u019a\7N\2\2\u019ab"+
		"\3\2\2\2\u019b\u019c\7L\2\2\u019c\u019d\7W\2\2\u019d\u019e\7O\2\2\u019e"+
		"\u019f\7R\2\2\u019f\u01a0\7\"\2\2\u01a0d\3\2\2\2\u01a1\u01a2\7L\2\2\u01a2"+
		"\u01a3\7W\2\2\u01a3\u01a4\7O\2\2\u01a4\u01a5\7R\2\2\u01a5\u01a6\7H\2\2"+
		"\u01a6f\3\2\2\2\u01a7\u01a8\7L\2\2\u01a8\u01a9\7W\2\2\u01a9\u01aa\7O\2"+
		"\2\u01aa\u01ab\7R\2\2\u01ab\u01ac\7K\2\2\u01ach\3\2\2\2\u01ad\u01ae\7"+
		"J\2\2\u01ae\u01af\7C\2\2\u01af\u01b0\7N\2\2\u01b0\u01b1\7V\2\2\u01b1j"+
		"\3\2\2\2\u01b2\u01b3\7N\2\2\u01b3\u01b4\7C\2\2\u01b4\u01b5\7D\2\2\u01b5"+
		"\u01b6\7G\2\2\u01b6\u01b7\7N\2\2\u01b7l\3\2\2\2\u01b8\u01bc\t\5\2\2\u01b9"+
		"\u01bb\t\6\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bdn\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c3"+
		"\7%\2\2\u01c0\u01c2\n\7\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c6\u01bf\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01ca\7\17\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3"+
		"\2\2\2\u01cb\u01cc\7\f\2\2\u01ccp\3\2\2\2\23\2ty~\u0083\u0089\u008d\u0093"+
		"\u0096\u009b\u009e\u00a2\u00a7\u01bc\u01c3\u01c6\u01c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}