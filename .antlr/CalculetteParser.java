// Generated from c:\Users\Miste\OneDrive\Documents\Travail\L3_info\S6\Language&Compil\Calculette-21806332-21701890\Calculette.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NEWLINE=16, 
		TYPE=17, IDENTIFIANT=18, ENTIER=19, OP=20, WS=21, UNMATCH=22, COMMENTAIRE=23;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_decl = 2, RULE_assignation = 3, 
		RULE_instruction = 4, RULE_expression = 5, RULE_input = 6, RULE_print = 7, 
		RULE_condition = 8, RULE_tantque = 9, RULE_bloc = 10, RULE_finInstruction = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "decl", "assignation", "instruction", "expression", 
			"input", "print", "condition", "tantque", "bloc", "finInstruction"
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

	@Override
	public String getGrammarFileName() { return "Calculette.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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
	public CalculetteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CalculContext a;
		public TerminalNode EOF() { return getToken(CalculetteParser.EOF, 0); }
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((StartContext)_localctx).a = calcul();
			setState(25);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public InstructionContext instruction;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(27);
				((CalculContext)_localctx).decl = decl();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					match(NEWLINE);
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << NEWLINE) | (1L << IDENTIFIANT) | (1L << ENTIER))) != 0)) {
				{
				{
				setState(41);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "  HALT\n"; 
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(52);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				            if((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int")){((DeclContext)_localctx).code =  "PUSHI " + "0" + "\n";}
				            if((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("float")){((DeclContext)_localctx).code =  "PUSHF " + "0.0" + "\n";}
				        
				setState(54);
				finInstruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(56);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(57);
				match(T__0);
				setState(58);
				((DeclContext)_localctx).expression = expression(0);
				setState(59);
				finInstruction();

				            tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				            ((DeclContext)_localctx).code =  ((DeclContext)_localctx).expression.code;
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(65);
			match(T__0);
			setState(66);
			((AssignationContext)_localctx).expression = expression(0);
			  
			            AdresseType at = tablesSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
			            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code + "STOREG " + at.adresse + "\n";

			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public AssignationContext assignation;
		public InputContext input;
		public PrintContext print;
		public TantqueContext tantque;
		public BlocContext bloc;
		public ConditionContext condition;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TantqueContext tantque() {
			return getRuleContext(TantqueContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((InstructionContext)_localctx).expression = expression(0);
				setState(70);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code; 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((InstructionContext)_localctx).assignation = assignation();
				setState(74);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((InstructionContext)_localctx).input = input();
				setState(78);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).input.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				((InstructionContext)_localctx).print = print();
				setState(82);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).print.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				((InstructionContext)_localctx).tantque = tantque();
				setState(86);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).tantque.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				((InstructionContext)_localctx).bloc = bloc();
				setState(90);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				((InstructionContext)_localctx).condition = condition();
				setState(94);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).condition.code;
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				finInstruction();

				        ((InstructionContext)_localctx).code =  "";
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext a;
		public ExpressionContext c;
		public ExpressionContext expression;
		public Token ENTIER;
		public Token IDENTIFIANT;
		public Token op;
		public ExpressionContext b;
		public Token op2;
		public ExpressionContext d;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ENTIER() { return getToken(CalculetteParser.ENTIER, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(103);
				match(T__1);
				setState(104);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(105);
				match(T__2);
				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).expression.code;
				}
				break;
			case ENTIER:
				{
				setState(108);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				        ((ExpressionContext)_localctx).code =  "  PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				    
				}
				break;
			case T__6:
				{
				setState(110);
				match(T__6);
				setState(111);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				        ((ExpressionContext)_localctx).code =  "  PUSHI -" + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				    
				}
				break;
			case IDENTIFIANT:
				{
				setState(113);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

						AdresseType at = tablesSymboles.getAdresseType((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				        ((ExpressionContext)_localctx).code =  "  PUSHG " + at.adresse + "\n";
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(118);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						((ExpressionContext)_localctx).b = ((ExpressionContext)_localctx).expression = expression(6);

						                  if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).equals("*")){((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "MUL\n";}
						                  else{((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "DIV\n";}
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.c = _prevctx;
						_localctx.c = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(123);
						((ExpressionContext)_localctx).op2 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((ExpressionContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						((ExpressionContext)_localctx).d = ((ExpressionContext)_localctx).expression = expression(5);

						                  if((((ExpressionContext)_localctx).op2!=null?((ExpressionContext)_localctx).op2.getText():null).equals("+")){((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code + ((ExpressionContext)_localctx).d.code + "ADD\n";}
						                  else{((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code + ((ExpressionContext)_localctx).d.code + "SUB\n";}
						                  
						}
						break;
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__7);
			setState(133);
			match(T__1);
			setState(134);
			((InputContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(135);
			match(T__2);

			        AdresseType at = tablesSymboles.getAdresseType((((InputContext)_localctx).IDENTIFIANT!=null?((InputContext)_localctx).IDENTIFIANT.getText():null));
			        ((InputContext)_localctx).code =   " READ \n";
			        _localctx.code += " STOREG " + at.adresse + "\n";  
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__8);
			setState(139);
			match(T__1);
			setState(140);
			((PrintContext)_localctx).expression = expression(0);
			setState(141);
			match(T__2);

			        ((PrintContext)_localctx).code =  ((PrintContext)_localctx).expression.code;
			        _localctx.code += " WRITE \n  POP\n";
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext a;
		public Token OP;
		public ExpressionContext b;
		public TerminalNode OP() { return getToken(CalculetteParser.OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__6:
			case IDENTIFIANT:
			case ENTIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				((ConditionContext)_localctx).a = expression(0);
				setState(145);
				((ConditionContext)_localctx).OP = match(OP);
				setState(146);
				((ConditionContext)_localctx).b = expression(0);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + operateurComp((((ConditionContext)_localctx).OP!=null?((ConditionContext)_localctx).OP.getText():null)) + "\n";
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__9);
				 ((ConditionContext)_localctx).code =  "  PUSHI 1\n"; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(T__10);
				 ((ConditionContext)_localctx).code =  "  PUSHI 0\n"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TantqueContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext instruction;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TantqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tantque; }
	}

	public final TantqueContext tantque() throws RecognitionException {
		TantqueContext _localctx = new TantqueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tantque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__11);
			setState(156);
			match(T__1);
			setState(157);
			((TantqueContext)_localctx).condition = condition();
			setState(158);
			match(T__2);
			setState(159);
			((TantqueContext)_localctx).instruction = instruction();

			        String boucleIn = getNewLabel();
			        String boucleOut = getNewLabel();

			        ((TantqueContext)_localctx).code =  "LABEL " + boucleIn +"\n";

			        _localctx.code += ((TantqueContext)_localctx).condition.code;
			        _localctx.code += "JUMPF " + boucleOut + "\n";
			        _localctx.code += ((TantqueContext)_localctx).instruction.code;
			        _localctx.code += "JUMP " + boucleIn+"\n";


			        _localctx.code += "LABEL " + boucleOut + "\n";
			    
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloc);
		((BlocContext)_localctx).code =  "";
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__12);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163);
					match(NEWLINE);
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					((BlocContext)_localctx).instruction = instruction();

					        _localctx.code += ((BlocContext)_localctx).instruction.code + "\n";
					  
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(177);
				match(NEWLINE);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(185);
					_la = _input.LA(1);
					if ( !(_la==T__14 || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3"+
		"\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6g"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7v\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0082\n\7\f\7\16\7\u0085\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u009c\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\7\f\u00a7\n\f\f\f\16\f\u00aa\13\f\3\f\3\f\3\f\7\f\u00af\n\f\f\f\16"+
		"\f\u00b2\13\f\3\f\7\f\u00b5\n\f\f\f\16\f\u00b8\13\f\3\f\3\f\3\r\6\r\u00bd"+
		"\n\r\r\r\16\r\u00be\3\r\2\3\f\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\3\2"+
		"\6\7\3\2\b\t\3\2\21\22\2\u00ca\2\32\3\2\2\2\4\"\3\2\2\2\6@\3\2\2\2\bB"+
		"\3\2\2\2\nf\3\2\2\2\fu\3\2\2\2\16\u0086\3\2\2\2\20\u008c\3\2\2\2\22\u009b"+
		"\3\2\2\2\24\u009d\3\2\2\2\26\u00a4\3\2\2\2\30\u00bc\3\2\2\2\32\33\5\4"+
		"\3\2\33\34\7\2\2\3\34\3\3\2\2\2\35\36\5\6\4\2\36\37\b\3\1\2\37!\3\2\2"+
		"\2 \35\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#(\3\2\2\2$\"\3\2\2\2%\'"+
		"\7\22\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\60\3\2\2\2*(\3\2\2"+
		"\2+,\5\n\6\2,-\b\3\1\2-/\3\2\2\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60"+
		"\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\b\3\1\2\64\5\3\2\2\2\65"+
		"\66\7\23\2\2\66\67\7\24\2\2\678\b\4\1\28A\5\30\r\29:\7\23\2\2:;\7\24\2"+
		"\2;<\7\3\2\2<=\5\f\7\2=>\5\30\r\2>?\b\4\1\2?A\3\2\2\2@\65\3\2\2\2@9\3"+
		"\2\2\2A\7\3\2\2\2BC\7\24\2\2CD\7\3\2\2DE\5\f\7\2EF\b\5\1\2F\t\3\2\2\2"+
		"GH\5\f\7\2HI\5\30\r\2IJ\b\6\1\2Jg\3\2\2\2KL\5\b\5\2LM\5\30\r\2MN\b\6\1"+
		"\2Ng\3\2\2\2OP\5\16\b\2PQ\5\30\r\2QR\b\6\1\2Rg\3\2\2\2ST\5\20\t\2TU\5"+
		"\30\r\2UV\b\6\1\2Vg\3\2\2\2WX\5\24\13\2XY\5\30\r\2YZ\b\6\1\2Zg\3\2\2\2"+
		"[\\\5\26\f\2\\]\5\30\r\2]^\b\6\1\2^g\3\2\2\2_`\5\22\n\2`a\5\30\r\2ab\b"+
		"\6\1\2bg\3\2\2\2cd\5\30\r\2de\b\6\1\2eg\3\2\2\2fG\3\2\2\2fK\3\2\2\2fO"+
		"\3\2\2\2fS\3\2\2\2fW\3\2\2\2f[\3\2\2\2f_\3\2\2\2fc\3\2\2\2g\13\3\2\2\2"+
		"hi\b\7\1\2ij\7\4\2\2jk\5\f\7\2kl\7\5\2\2lm\b\7\1\2mv\3\2\2\2no\7\25\2"+
		"\2ov\b\7\1\2pq\7\t\2\2qr\7\25\2\2rv\b\7\1\2st\7\24\2\2tv\b\7\1\2uh\3\2"+
		"\2\2un\3\2\2\2up\3\2\2\2us\3\2\2\2v\u0083\3\2\2\2wx\f\7\2\2xy\t\2\2\2"+
		"yz\5\f\7\bz{\b\7\1\2{\u0082\3\2\2\2|}\f\6\2\2}~\t\3\2\2~\177\5\f\7\7\177"+
		"\u0080\b\7\1\2\u0080\u0082\3\2\2\2\u0081w\3\2\2\2\u0081|\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\r\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0086\u0087\7\n\2\2\u0087\u0088\7\4\2\2\u0088\u0089"+
		"\7\24\2\2\u0089\u008a\7\5\2\2\u008a\u008b\b\b\1\2\u008b\17\3\2\2\2\u008c"+
		"\u008d\7\13\2\2\u008d\u008e\7\4\2\2\u008e\u008f\5\f\7\2\u008f\u0090\7"+
		"\5\2\2\u0090\u0091\b\t\1\2\u0091\21\3\2\2\2\u0092\u0093\5\f\7\2\u0093"+
		"\u0094\7\26\2\2\u0094\u0095\5\f\7\2\u0095\u0096\b\n\1\2\u0096\u009c\3"+
		"\2\2\2\u0097\u0098\7\f\2\2\u0098\u009c\b\n\1\2\u0099\u009a\7\r\2\2\u009a"+
		"\u009c\b\n\1\2\u009b\u0092\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\23\3\2\2\2\u009d\u009e\7\16\2\2\u009e\u009f\7\4\2\2\u009f\u00a0"+
		"\5\22\n\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\5\n\6\2\u00a2\u00a3\b\13\1\2"+
		"\u00a3\25\3\2\2\2\u00a4\u00a8\7\17\2\2\u00a5\u00a7\7\22\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00b0\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\5\n\6\2\u00ac\u00ad\b\f"+
		"\1\2\u00ad\u00af\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b6\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00b5\7\22\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00ba\7\20\2\2\u00ba\27\3\2\2\2\u00bb\u00bd\t\4\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\31\3\2\2\2\17\"(\60@fu\u0081\u0083\u009b\u00a8\u00b0\u00b6\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}