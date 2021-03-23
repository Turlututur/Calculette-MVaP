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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, NEWLINE=21, TYPE=22, IDENTIFIANT=23, ENTIER=24, 
		OP=25, WS=26, UNMATCH=27, COMMENTAIRE=28;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_decl = 2, RULE_assignation = 3, 
		RULE_instruction = 4, RULE_expression = 5, RULE_input = 6, RULE_print = 7, 
		RULE_condition = 8, RULE_tantque = 9, RULE_si = 10, RULE_bloc = 11, RULE_finInstruction = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "decl", "assignation", "instruction", "expression", 
			"input", "print", "condition", "tantque", "si", "bloc", "finInstruction"
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
			setState(26);
			((StartContext)_localctx).a = calcul();
			setState(27);
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
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(29);
				((CalculContext)_localctx).decl = decl();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(37);
					match(NEWLINE);
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << NEWLINE) | (1L << IDENTIFIANT) | (1L << ENTIER))) != 0)) {
				{
				{
				setState(43);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(50);
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(54);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				            if((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int")){((DeclContext)_localctx).code =  "PUSHI " + "0" + "\n";}
				            if((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("float")){((DeclContext)_localctx).code =  "PUSHF " + "0.0" + "\n";}
				        
				setState(56);
				finInstruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(58);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(59);
				match(T__0);
				setState(60);
				((DeclContext)_localctx).expression = expression(0);
				setState(61);
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
			setState(66);
			((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(67);
			match(T__0);
			setState(68);
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
		public SiContext si;
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
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((InstructionContext)_localctx).expression = expression(0);
				setState(72);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code; 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				((InstructionContext)_localctx).assignation = assignation();
				setState(76);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				((InstructionContext)_localctx).input = input();
				setState(80);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).input.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				((InstructionContext)_localctx).print = print();
				setState(84);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).print.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				((InstructionContext)_localctx).tantque = tantque();
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(88);
					finInstruction();
					}
					break;
				}

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).tantque.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				((InstructionContext)_localctx).bloc = bloc();
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(94);
					finInstruction();
					}
					break;
				}

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				((InstructionContext)_localctx).condition = condition(0);
				setState(100);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).condition.code;
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(103);
				((InstructionContext)_localctx).si = si();
				setState(104);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).si.code;
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(107);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(113);
				match(T__1);
				setState(114);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(115);
				match(T__2);
				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).expression.code;
				}
				break;
			case ENTIER:
				{
				setState(118);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				        ((ExpressionContext)_localctx).code =  "  PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				    
				}
				break;
			case T__6:
				{
				setState(120);
				match(T__6);
				setState(121);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				        ((ExpressionContext)_localctx).code =  "  PUSHI -" + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				    
				}
				break;
			case IDENTIFIANT:
				{
				setState(123);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

						AdresseType at = tablesSymboles.getAdresseType((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				        ((ExpressionContext)_localctx).code =  "  PUSHG " + at.adresse + "\n";
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(128);
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
						setState(129);
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
						setState(132);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(133);
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
						setState(134);
						((ExpressionContext)_localctx).d = ((ExpressionContext)_localctx).expression = expression(5);

						                  if((((ExpressionContext)_localctx).op2!=null?((ExpressionContext)_localctx).op2.getText():null).equals("+")){((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code + ((ExpressionContext)_localctx).d.code + "ADD\n";}
						                  else{((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code + ((ExpressionContext)_localctx).d.code + "SUB\n";}
						                  
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(142);
			match(T__7);
			setState(143);
			match(T__1);
			setState(144);
			((InputContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(145);
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
			setState(148);
			match(T__8);
			setState(149);
			match(T__1);
			setState(150);
			((PrintContext)_localctx).expression = expression(0);
			setState(151);
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
		public ConditionContext c;
		public ConditionContext e;
		public ExpressionContext a;
		public Token OP;
		public ExpressionContext b;
		public ConditionContext condition;
		public ConditionContext d;
		public ConditionContext f;
		public TerminalNode OP() { return getToken(CalculetteParser.OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__6:
			case IDENTIFIANT:
			case ENTIER:
				{
				setState(155);
				((ConditionContext)_localctx).a = expression(0);
				setState(156);
				((ConditionContext)_localctx).OP = match(OP);
				setState(157);
				((ConditionContext)_localctx).b = expression(0);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + operateurComp((((ConditionContext)_localctx).OP!=null?((ConditionContext)_localctx).OP.getText():null)) + "\n";
				}
				break;
			case T__11:
				{
				setState(160);
				match(T__11);
				setState(161);
				((ConditionContext)_localctx).condition = condition(3);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).condition.code + "PUSHI 1 \n" + "NEQ" + "\n";
				}
				break;
			case T__12:
				{
				setState(164);
				match(T__12);
				 ((ConditionContext)_localctx).code =  "  PUSHI 1\n"; 
				}
				break;
			case T__13:
				{
				setState(166);
				match(T__13);
				 ((ConditionContext)_localctx).code =  "  PUSHI 0\n"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.c = _prevctx;
						_localctx.c = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(170);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(171);
						match(T__9);
						setState(172);
						((ConditionContext)_localctx).d = ((ConditionContext)_localctx).condition = condition(6);
						 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c.code + ((ConditionContext)_localctx).d.code + "MUL \n";
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(175);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(176);
						match(T__10);
						setState(177);
						((ConditionContext)_localctx).f = ((ConditionContext)_localctx).condition = condition(5);
						 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).e.code + ((ConditionContext)_localctx).f.code + "ADD \n PUSHI 0 \n SUP \n";
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public TerminalNode NEWLINE() { return getToken(CalculetteParser.NEWLINE, 0); }
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
			setState(185);
			match(T__14);
			setState(186);
			match(T__1);
			setState(187);
			((TantqueContext)_localctx).condition = condition(0);
			setState(188);
			match(T__2);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(189);
				match(NEWLINE);
				}
				break;
			}
			setState(192);
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

	public static class SiContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext a;
		public InstructionContext b;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(CalculetteParser.NEWLINE, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__15);
			setState(196);
			match(T__1);
			setState(197);
			((SiContext)_localctx).condition = condition(0);
			setState(198);
			match(T__2);
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(199);
				match(NEWLINE);
				}
				break;
			}
			setState(202);
			((SiContext)_localctx).a = instruction();

			        String IfOut = getNewLabel();
			        String Else = getNewLabel();
			        
			        ((SiContext)_localctx).code =  ((SiContext)_localctx).condition.code +"JUMPF" + Else +"\n";  
			    
			        _localctx.code += ((SiContext)_localctx).a.code;
			        _localctx.code += "JUMP" + IfOut+"\n";

			        _localctx.code += "LABEL" + Else + "\n";
			    
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(204);
				match(T__16);
				setState(205);
				((SiContext)_localctx).b = instruction();

				        ((SiContext)_localctx).code =  ((SiContext)_localctx).b.code + "\n";
				        
				}
			}

			_localctx.code += "LABEL" + IfOut + "\n";
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
		enterRule(_localctx, 22, RULE_bloc);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BlocContext)_localctx).code =  "";
			setState(213);
			match(T__17);
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(214);
				match(NEWLINE);
				}
				break;
			}
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					((BlocContext)_localctx).instruction = instruction();

					        _localctx.code += ((BlocContext)_localctx).instruction.code + "\n";
					  
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(225);
				match(NEWLINE);
				}
			}

			setState(228);
			match(T__18);
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
		enterRule(_localctx, 24, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(230);
					_la = _input.LA(1);
					if ( !(_la==T__19 || _la==NEWLINE) ) {
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
				setState(233); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		case 8:
			return condition_sempred((ConditionContext)_localctx, predIndex);
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
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00ee\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u008c\n\7\f\7\16\7\u008f\13\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00ab\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b7"+
		"\n\n\f\n\16\n\u00ba\13\n\3\13\3\13\3\13\3\13\3\13\5\13\u00c1\n\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00cb\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00d3\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u00da\n\r\3\r\3\r\3\r\7\r\u00df\n"+
		"\r\f\r\16\r\u00e2\13\r\3\r\5\r\u00e5\n\r\3\r\3\r\3\16\6\16\u00ea\n\16"+
		"\r\16\16\16\u00eb\3\16\2\4\f\22\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2"+
		"\5\3\2\6\7\3\2\b\t\3\2\26\27\2\u00ff\2\34\3\2\2\2\4$\3\2\2\2\6B\3\2\2"+
		"\2\bD\3\2\2\2\np\3\2\2\2\f\177\3\2\2\2\16\u0090\3\2\2\2\20\u0096\3\2\2"+
		"\2\22\u00aa\3\2\2\2\24\u00bb\3\2\2\2\26\u00c5\3\2\2\2\30\u00d6\3\2\2\2"+
		"\32\u00e9\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \5\6\4\2"+
		" !\b\3\1\2!#\3\2\2\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%*\3\2"+
		"\2\2&$\3\2\2\2\')\7\27\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\62"+
		"\3\2\2\2,*\3\2\2\2-.\5\n\6\2./\b\3\1\2/\61\3\2\2\2\60-\3\2\2\2\61\64\3"+
		"\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\b"+
		"\3\1\2\66\5\3\2\2\2\678\7\30\2\289\7\31\2\29:\b\4\1\2:C\5\32\16\2;<\7"+
		"\30\2\2<=\7\31\2\2=>\7\3\2\2>?\5\f\7\2?@\5\32\16\2@A\b\4\1\2AC\3\2\2\2"+
		"B\67\3\2\2\2B;\3\2\2\2C\7\3\2\2\2DE\7\31\2\2EF\7\3\2\2FG\5\f\7\2GH\b\5"+
		"\1\2H\t\3\2\2\2IJ\5\f\7\2JK\5\32\16\2KL\b\6\1\2Lq\3\2\2\2MN\5\b\5\2NO"+
		"\5\32\16\2OP\b\6\1\2Pq\3\2\2\2QR\5\16\b\2RS\5\32\16\2ST\b\6\1\2Tq\3\2"+
		"\2\2UV\5\20\t\2VW\5\32\16\2WX\b\6\1\2Xq\3\2\2\2Y[\5\24\13\2Z\\\5\32\16"+
		"\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\6\1\2^q\3\2\2\2_a\5\30\r\2`b\5"+
		"\32\16\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\6\1\2dq\3\2\2\2ef\5\22\n\2"+
		"fg\5\32\16\2gh\b\6\1\2hq\3\2\2\2ij\5\26\f\2jk\5\32\16\2kl\b\6\1\2lq\3"+
		"\2\2\2mn\5\32\16\2no\b\6\1\2oq\3\2\2\2pI\3\2\2\2pM\3\2\2\2pQ\3\2\2\2p"+
		"U\3\2\2\2pY\3\2\2\2p_\3\2\2\2pe\3\2\2\2pi\3\2\2\2pm\3\2\2\2q\13\3\2\2"+
		"\2rs\b\7\1\2st\7\4\2\2tu\5\f\7\2uv\7\5\2\2vw\b\7\1\2w\u0080\3\2\2\2xy"+
		"\7\32\2\2y\u0080\b\7\1\2z{\7\t\2\2{|\7\32\2\2|\u0080\b\7\1\2}~\7\31\2"+
		"\2~\u0080\b\7\1\2\177r\3\2\2\2\177x\3\2\2\2\177z\3\2\2\2\177}\3\2\2\2"+
		"\u0080\u008d\3\2\2\2\u0081\u0082\f\7\2\2\u0082\u0083\t\2\2\2\u0083\u0084"+
		"\5\f\7\b\u0084\u0085\b\7\1\2\u0085\u008c\3\2\2\2\u0086\u0087\f\6\2\2\u0087"+
		"\u0088\t\3\2\2\u0088\u0089\5\f\7\7\u0089\u008a\b\7\1\2\u008a\u008c\3\2"+
		"\2\2\u008b\u0081\3\2\2\2\u008b\u0086\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\r\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u0090\u0091\7\n\2\2\u0091\u0092\7\4\2\2\u0092\u0093\7\31\2\2\u0093\u0094"+
		"\7\5\2\2\u0094\u0095\b\b\1\2\u0095\17\3\2\2\2\u0096\u0097\7\13\2\2\u0097"+
		"\u0098\7\4\2\2\u0098\u0099\5\f\7\2\u0099\u009a\7\5\2\2\u009a\u009b\b\t"+
		"\1\2\u009b\21\3\2\2\2\u009c\u009d\b\n\1\2\u009d\u009e\5\f\7\2\u009e\u009f"+
		"\7\33\2\2\u009f\u00a0\5\f\7\2\u00a0\u00a1\b\n\1\2\u00a1\u00ab\3\2\2\2"+
		"\u00a2\u00a3\7\16\2\2\u00a3\u00a4\5\22\n\5\u00a4\u00a5\b\n\1\2\u00a5\u00ab"+
		"\3\2\2\2\u00a6\u00a7\7\17\2\2\u00a7\u00ab\b\n\1\2\u00a8\u00a9\7\20\2\2"+
		"\u00a9\u00ab\b\n\1\2\u00aa\u009c\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a6"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00b8\3\2\2\2\u00ac\u00ad\f\7\2\2\u00ad"+
		"\u00ae\7\f\2\2\u00ae\u00af\5\22\n\b\u00af\u00b0\b\n\1\2\u00b0\u00b7\3"+
		"\2\2\2\u00b1\u00b2\f\6\2\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\5\22\n\7\u00b4"+
		"\u00b5\b\n\1\2\u00b5\u00b7\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00b1\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\23\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\7\4\2"+
		"\2\u00bd\u00be\5\22\n\2\u00be\u00c0\7\5\2\2\u00bf\u00c1\7\27\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\5\n"+
		"\6\2\u00c3\u00c4\b\13\1\2\u00c4\25\3\2\2\2\u00c5\u00c6\7\22\2\2\u00c6"+
		"\u00c7\7\4\2\2\u00c7\u00c8\5\22\n\2\u00c8\u00ca\7\5\2\2\u00c9\u00cb\7"+
		"\27\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\5\n\6\2\u00cd\u00d2\b\f\1\2\u00ce\u00cf\7\23\2\2\u00cf\u00d0\5"+
		"\n\6\2\u00d0\u00d1\b\f\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\f\1\2\u00d5\27\3\2\2"+
		"\2\u00d6\u00d7\b\r\1\2\u00d7\u00d9\7\24\2\2\u00d8\u00da\7\27\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e0\3\2\2\2\u00db\u00dc\5\n"+
		"\6\2\u00dc\u00dd\b\r\1\2\u00dd\u00df\3\2\2\2\u00de\u00db\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\7\27\2\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\25\2\2\u00e7\31\3\2\2"+
		"\2\u00e8\u00ea\t\4\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\33\3\2\2\2\26$*\62B[ap\177\u008b\u008d"+
		"\u00aa\u00b6\u00b8\u00c0\u00ca\u00d2\u00d9\u00e0\u00e4\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}