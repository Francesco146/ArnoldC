// Generated from ArnoldC.g4 by ANTLR 4.13.1
package it.univr.arnoldc.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArnoldCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTIONCALL=1, PUTRESULT=2, FUNCTION=3, ENDFUNCTION=4, PARAMETER=5, WILLRETURN=6, 
		RETURN=7, BEGINMAIN=8, ENDMAIN=9, AT=10, TRUE=11, FALSE=12, PLUSOPERATOR=13, 
		MINUSOPERATOR=14, MULTIPLICATIONOPERATOR=15, DIVISIONOPERATOR=16, EQUALTO=17, 
		GREATERTHAN=18, OR=19, AND=20, PRINT=21, DECLAREINT=22, SETINITIALVALUE=23, 
		ASSIGNVARIABLE=24, SETVALUE=25, ENDASSIGNVARIABLE=26, IF=27, ELSE=28, 
		ENDIF=29, WHILE=30, ENDWHILE=31, READINT=32, IDENTIFIER=33, NUMBER=34, 
		STRING_LITERAL=35, WS=36;
	public static final int
		RULE_main = 0, RULE_function_declaration = 1, RULE_statement = 2, RULE_print_stmt = 3, 
		RULE_condition_stmt = 4, RULE_trueIf = 5, RULE_falseIf = 6, RULE_expression = 7, 
		RULE_operation = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "function_declaration", "statement", "print_stmt", "condition_stmt", 
			"trueIf", "falseIf", "expression", "operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DO IT NOW'", "'GET YOUR ASS TO MARS'", "'LISTEN TO ME VERY CAREFULLY'", 
			"'HASTA LA VISTA, BABY'", "'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE'", 
			"'GIVE THESE PEOPLE AIR'", "'I'LL BE BACK'", "'IT'S SHOWTIME'", "'YOU HAVE BEEN TERMINATED'", 
			"'@'", "'NO PROBLEMO'", "'I LIED'", "'GET UP'", "'GET DOWN'", "'YOU'RE FIRED'", 
			"'HE HAD TO SPLIT'", "'YOU ARE NOT YOU YOU ARE ME'", "'LET OFF SOME STEAM BENNET'", 
			"'CONSIDER THAT A DIVORCE'", "'KNOCK KNOCK'", "'TALK TO THE HAND'", "'HEY CHRISTMAS TREE'", 
			"'YOU SET US UP'", "'GET TO THE CHOPPER'", "'HERE IS MY INVITATION'", 
			"'ENOUGH TALK'", "'BECAUSE I'M GOING TO SAY PLEASE'", "'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", 
			"'STICK AROUND'", "'CHILL'", "'I WANT TO ASK YOU A BUNCH OF QUESTIONS AND I WANT TO HAVE THEM ANSWERED IMMEDIATELY'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTIONCALL", "PUTRESULT", "FUNCTION", "ENDFUNCTION", "PARAMETER", 
			"WILLRETURN", "RETURN", "BEGINMAIN", "ENDMAIN", "AT", "TRUE", "FALSE", 
			"PLUSOPERATOR", "MINUSOPERATOR", "MULTIPLICATIONOPERATOR", "DIVISIONOPERATOR", 
			"EQUALTO", "GREATERTHAN", "OR", "AND", "PRINT", "DECLAREINT", "SETINITIALVALUE", 
			"ASSIGNVARIABLE", "SETVALUE", "ENDASSIGNVARIABLE", "IF", "ELSE", "ENDIF", 
			"WHILE", "ENDWHILE", "READINT", "IDENTIFIER", "NUMBER", "STRING_LITERAL", 
			"WS"
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
	public String getGrammarFileName() { return "ArnoldC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArnoldCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode BEGINMAIN() { return getToken(ArnoldCParser.BEGINMAIN, 0); }
		public TerminalNode ENDMAIN() { return getToken(ArnoldCParser.ENDMAIN, 0); }
		public TerminalNode EOF() { return getToken(ArnoldCParser.EOF, 0); }
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(18);
				function_declaration();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(BEGINMAIN);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1231028230L) != 0)) {
				{
				{
				setState(25);
				statement();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(ENDMAIN);
			setState(32);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	 
		public Function_declarationContext() { }
		public void copyFrom(Function_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidfunctionContext extends Function_declarationContext {
		public TerminalNode FUNCTION() { return getToken(ArnoldCParser.FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArnoldCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArnoldCParser.IDENTIFIER, i);
		}
		public TerminalNode ENDFUNCTION() { return getToken(ArnoldCParser.ENDFUNCTION, 0); }
		public List<TerminalNode> PARAMETER() { return getTokens(ArnoldCParser.PARAMETER); }
		public TerminalNode PARAMETER(int i) {
			return getToken(ArnoldCParser.PARAMETER, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public VoidfunctionContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitVoidfunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonvoidfunctionContext extends Function_declarationContext {
		public TerminalNode FUNCTION() { return getToken(ArnoldCParser.FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArnoldCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArnoldCParser.IDENTIFIER, i);
		}
		public TerminalNode WILLRETURN() { return getToken(ArnoldCParser.WILLRETURN, 0); }
		public TerminalNode RETURN() { return getToken(ArnoldCParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDFUNCTION() { return getToken(ArnoldCParser.ENDFUNCTION, 0); }
		public List<TerminalNode> PARAMETER() { return getTokens(ArnoldCParser.PARAMETER); }
		public TerminalNode PARAMETER(int i) {
			return getToken(ArnoldCParser.PARAMETER, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NonvoidfunctionContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitNonvoidfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_declaration);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new VoidfunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(FUNCTION);
				setState(35);
				match(IDENTIFIER);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAMETER) {
					{
					{
					setState(36);
					match(PARAMETER);
					setState(37);
					match(IDENTIFIER);
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1231028230L) != 0)) {
					{
					{
					setState(43);
					statement();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(ENDFUNCTION);
				}
				break;
			case 2:
				_localctx = new NonvoidfunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(FUNCTION);
				setState(51);
				match(IDENTIFIER);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAMETER) {
					{
					{
					setState(52);
					match(PARAMETER);
					setState(53);
					match(IDENTIFIER);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(WILLRETURN);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1231028230L) != 0)) {
					{
					{
					setState(60);
					statement();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(RETURN);
				setState(67);
				expression();
				setState(68);
				match(ENDFUNCTION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilestmtContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(ArnoldCParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(ArnoldCParser.ENDWHILE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhilestmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignvariableContext extends StatementContext {
		public TerminalNode ASSIGNVARIABLE() { return getToken(ArnoldCParser.ASSIGNVARIABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public TerminalNode SETVALUE() { return getToken(ArnoldCParser.SETVALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDASSIGNVARIABLE() { return getToken(ArnoldCParser.ENDASSIGNVARIABLE, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public AssignvariableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitAssignvariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareintContext extends StatementContext {
		public TerminalNode DECLAREINT() { return getToken(ArnoldCParser.DECLAREINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public TerminalNode SETINITIALVALUE() { return getToken(ArnoldCParser.SETINITIALVALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclareintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitDeclareint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctioncallContext extends StatementContext {
		public TerminalNode FUNCTIONCALL() { return getToken(ArnoldCParser.FUNCTIONCALL, 0); }
		public TerminalNode PUTRESULT() { return getToken(ArnoldCParser.PUTRESULT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArnoldCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArnoldCParser.IDENTIFIER, i);
		}
		public FunctioncallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintstmtContext extends StatementContext {
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public PrintstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPrintstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadintContext extends StatementContext {
		public TerminalNode PUTRESULT() { return getToken(ArnoldCParser.PUTRESULT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public TerminalNode FUNCTIONCALL() { return getToken(ArnoldCParser.FUNCTIONCALL, 0); }
		public TerminalNode READINT() { return getToken(ArnoldCParser.READINT, 0); }
		public ReadintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitReadint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionstmtContext extends StatementContext {
		public Condition_stmtContext condition_stmt() {
			return getRuleContext(Condition_stmtContext.class,0);
		}
		public ConditionstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitConditionstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new DeclareintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(DECLAREINT);
				setState(73);
				match(IDENTIFIER);
				setState(74);
				match(SETINITIALVALUE);
				setState(75);
				expression();
				}
				break;
			case 2:
				_localctx = new AssignvariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(ASSIGNVARIABLE);
				setState(77);
				match(IDENTIFIER);
				setState(78);
				match(SETVALUE);
				setState(79);
				expression();
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					operation();
					}
					}
					setState(83); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2088960L) != 0) );
				setState(85);
				match(ENDASSIGNVARIABLE);
				}
				break;
			case 3:
				_localctx = new PrintstmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				print_stmt();
				}
				break;
			case 4:
				_localctx = new ConditionstmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				condition_stmt();
				}
				break;
			case 5:
				_localctx = new WhilestmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				match(WHILE);
				setState(90);
				expression();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1231028230L) != 0)) {
					{
					{
					setState(91);
					statement();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(ENDWHILE);
				}
				break;
			case 6:
				_localctx = new ReadintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(PUTRESULT);
				setState(100);
				match(IDENTIFIER);
				setState(101);
				match(FUNCTIONCALL);
				setState(102);
				match(READINT);
				}
				break;
			case 7:
				_localctx = new FunctioncallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUTRESULT) {
					{
					setState(103);
					match(PUTRESULT);
					setState(104);
					match(IDENTIFIER);
					}
				}

				setState(107);
				match(FUNCTIONCALL);
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108);
					match(IDENTIFIER);
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Print_stmtContext extends ParserRuleContext {
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
	 
		public Print_stmtContext() { }
		public void copyFrom(Print_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintstringContext extends Print_stmtContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ArnoldCParser.STRING_LITERAL, 0); }
		public PrintstringContext(Print_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPrintstring(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintvariableContext extends Print_stmtContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public PrintvariableContext(Print_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPrintvariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print_stmt);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new PrintvariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(PRINT);
				setState(116);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new PrintstringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(PRINT);
				setState(118);
				match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Condition_stmtContext extends ParserRuleContext {
		public Condition_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_stmt; }
	 
		public Condition_stmtContext() { }
		public void copyFrom(Condition_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfendifContext extends Condition_stmtContext {
		public TerminalNode IF() { return getToken(ArnoldCParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TrueIfContext trueIf() {
			return getRuleContext(TrueIfContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(ArnoldCParser.ENDIF, 0); }
		public IfendifContext(Condition_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitIfendif(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfelseendifContext extends Condition_stmtContext {
		public TerminalNode IF() { return getToken(ArnoldCParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TrueIfContext trueIf() {
			return getRuleContext(TrueIfContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(ArnoldCParser.ELSE, 0); }
		public FalseIfContext falseIf() {
			return getRuleContext(FalseIfContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(ArnoldCParser.ENDIF, 0); }
		public IfelseendifContext(Condition_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitIfelseendif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_stmtContext condition_stmt() throws RecognitionException {
		Condition_stmtContext _localctx = new Condition_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition_stmt);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new IfelseendifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(IF);
				setState(122);
				expression();
				setState(123);
				trueIf();
				setState(124);
				match(ELSE);
				setState(125);
				falseIf();
				setState(126);
				match(ENDIF);
				}
				break;
			case 2:
				_localctx = new IfendifContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(IF);
				setState(129);
				expression();
				setState(130);
				trueIf();
				setState(131);
				match(ENDIF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TrueIfContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TrueIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitTrueIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueIfContext trueIf() throws RecognitionException {
		TrueIfContext _localctx = new TrueIfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_trueIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1231028230L) != 0)) {
				{
				{
				setState(135);
				statement();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FalseIfContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FalseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitFalseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FalseIfContext falseIf() throws RecognitionException {
		FalseIfContext _localctx = new FalseIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_falseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1231028230L) != 0)) {
				{
				{
				setState(141);
				statement();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarexprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public VarexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitVarexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueexprContext extends ExpressionContext {
		public TerminalNode AT() { return getToken(ArnoldCParser.AT, 0); }
		public TerminalNode TRUE() { return getToken(ArnoldCParser.TRUE, 0); }
		public TrueexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitTrueexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberexprContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(ArnoldCParser.NUMBER, 0); }
		public NumberexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitNumberexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseexprContext extends ExpressionContext {
		public TerminalNode AT() { return getToken(ArnoldCParser.AT, 0); }
		public TerminalNode FALSE() { return getToken(ArnoldCParser.FALSE, 0); }
		public FalseexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitFalseexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VarexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new NumberexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(NUMBER);
				}
				break;
			case 3:
				_localctx = new TrueexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(AT);
				setState(150);
				match(TRUE);
				}
				break;
			case 4:
				_localctx = new FalseexprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(AT);
				setState(152);
				match(FALSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualOpContext extends OperationContext {
		public TerminalNode EQUALTO() { return getToken(ArnoldCParser.EQUALTO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EqualOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitEqualOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrAndOpContext extends OperationContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(ArnoldCParser.OR, 0); }
		public TerminalNode AND() { return getToken(ArnoldCParser.AND, 0); }
		public OrAndOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitOrAndOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterOpContext extends OperationContext {
		public TerminalNode GREATERTHAN() { return getToken(ArnoldCParser.GREATERTHAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GreaterOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitGreaterOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivOpContext extends OperationContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MULTIPLICATIONOPERATOR() { return getToken(ArnoldCParser.MULTIPLICATIONOPERATOR, 0); }
		public TerminalNode DIVISIONOPERATOR() { return getToken(ArnoldCParser.DIVISIONOPERATOR, 0); }
		public MulDivOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitMulDivOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusOpContext extends OperationContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUSOPERATOR() { return getToken(ArnoldCParser.PLUSOPERATOR, 0); }
		public TerminalNode MINUSOPERATOR() { return getToken(ArnoldCParser.MINUSOPERATOR, 0); }
		public PlusMinusOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPlusMinusOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operation);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICATIONOPERATOR:
			case DIVISIONOPERATOR:
				_localctx = new MulDivOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((MulDivOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLICATIONOPERATOR || _la==DIVISIONOPERATOR) ) {
					((MulDivOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				expression();
				}
				break;
			case PLUSOPERATOR:
			case MINUSOPERATOR:
				_localctx = new PlusMinusOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((PlusMinusOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUSOPERATOR || _la==MINUSOPERATOR) ) {
					((PlusMinusOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				expression();
				}
				break;
			case GREATERTHAN:
				_localctx = new GreaterOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(GREATERTHAN);
				setState(160);
				expression();
				}
				break;
			case EQUALTO:
				_localctx = new EqualOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(EQUALTO);
				setState(162);
				expression();
				}
				break;
			case OR:
			case AND:
				_localctx = new OrAndOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				((OrAndOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
					((OrAndOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				expression();
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

	public static final String _serializedATN =
		"\u0004\u0001$\u00a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000"+
		"\u001e\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001"+
		"\u0001\u0001\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00017\b\u0001"+
		"\n\u0001\f\u0001:\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001>\b\u0001"+
		"\n\u0001\f\u0001A\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001G\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"R\b\u0002\u000b\u0002\f\u0002S\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002]\b\u0002\n\u0002"+
		"\f\u0002`\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002j\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002n\b\u0002\u000b\u0002\f\u0002o\u0003\u0002"+
		"r\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"x\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0086\b\u0004\u0001\u0005\u0005\u0005\u0089\b"+
		"\u0005\n\u0005\f\u0005\u008c\t\u0005\u0001\u0006\u0005\u0006\u008f\b\u0006"+
		"\n\u0006\f\u0006\u0092\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009a\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00a6\b\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0000\u0003\u0001\u0000\u000f\u0010\u0001\u0000\r\u000e\u0001\u0000"+
		"\u0013\u0014\u00ba\u0000\u0015\u0001\u0000\u0000\u0000\u0002F\u0001\u0000"+
		"\u0000\u0000\u0004q\u0001\u0000\u0000\u0000\u0006w\u0001\u0000\u0000\u0000"+
		"\b\u0085\u0001\u0000\u0000\u0000\n\u008a\u0001\u0000\u0000\u0000\f\u0090"+
		"\u0001\u0000\u0000\u0000\u000e\u0099\u0001\u0000\u0000\u0000\u0010\u00a5"+
		"\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u001c"+
		"\u0005\b\u0000\u0000\u0019\u001b\u0003\u0004\u0002\u0000\u001a\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001f\u0001"+
		"\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f \u0005\t"+
		"\u0000\u0000 !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000\u0000\u0000"+
		"\"#\u0005\u0003\u0000\u0000#(\u0005!\u0000\u0000$%\u0005\u0005\u0000\u0000"+
		"%\'\u0005!\u0000\u0000&$\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000).\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000+-\u0003\u0004\u0002\u0000,+\u0001"+
		"\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u00001G\u0005\u0004\u0000\u000023\u0005\u0003\u0000\u000038\u0005!\u0000"+
		"\u000045\u0005\u0005\u0000\u000057\u0005!\u0000\u000064\u0001\u0000\u0000"+
		"\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;?\u0005"+
		"\u0006\u0000\u0000<>\u0003\u0004\u0002\u0000=<\u0001\u0000\u0000\u0000"+
		">A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005\u0007"+
		"\u0000\u0000CD\u0003\u000e\u0007\u0000DE\u0005\u0004\u0000\u0000EG\u0001"+
		"\u0000\u0000\u0000F\"\u0001\u0000\u0000\u0000F2\u0001\u0000\u0000\u0000"+
		"G\u0003\u0001\u0000\u0000\u0000HI\u0005\u0016\u0000\u0000IJ\u0005!\u0000"+
		"\u0000JK\u0005\u0017\u0000\u0000Kr\u0003\u000e\u0007\u0000LM\u0005\u0018"+
		"\u0000\u0000MN\u0005!\u0000\u0000NO\u0005\u0019\u0000\u0000OQ\u0003\u000e"+
		"\u0007\u0000PR\u0003\u0010\b\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UV\u0005\u001a\u0000\u0000Vr\u0001\u0000\u0000\u0000"+
		"Wr\u0003\u0006\u0003\u0000Xr\u0003\b\u0004\u0000YZ\u0005\u001e\u0000\u0000"+
		"Z^\u0003\u000e\u0007\u0000[]\u0003\u0004\u0002\u0000\\[\u0001\u0000\u0000"+
		"\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005"+
		"\u001f\u0000\u0000br\u0001\u0000\u0000\u0000cd\u0005\u0002\u0000\u0000"+
		"de\u0005!\u0000\u0000ef\u0005\u0001\u0000\u0000fr\u0005 \u0000\u0000g"+
		"h\u0005\u0002\u0000\u0000hj\u0005!\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0005\u0001\u0000"+
		"\u0000ln\u0005!\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000"+
		"\u0000\u0000qH\u0001\u0000\u0000\u0000qL\u0001\u0000\u0000\u0000qW\u0001"+
		"\u0000\u0000\u0000qX\u0001\u0000\u0000\u0000qY\u0001\u0000\u0000\u0000"+
		"qc\u0001\u0000\u0000\u0000qi\u0001\u0000\u0000\u0000r\u0005\u0001\u0000"+
		"\u0000\u0000st\u0005\u0015\u0000\u0000tx\u0005!\u0000\u0000uv\u0005\u0015"+
		"\u0000\u0000vx\u0005#\u0000\u0000ws\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000x\u0007\u0001\u0000\u0000\u0000yz\u0005\u001b\u0000\u0000"+
		"z{\u0003\u000e\u0007\u0000{|\u0003\n\u0005\u0000|}\u0005\u001c\u0000\u0000"+
		"}~\u0003\f\u0006\u0000~\u007f\u0005\u001d\u0000\u0000\u007f\u0086\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u001b\u0000\u0000\u0081\u0082\u0003"+
		"\u000e\u0007\u0000\u0082\u0083\u0003\n\u0005\u0000\u0083\u0084\u0005\u001d"+
		"\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085y\u0001\u0000\u0000"+
		"\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0086\t\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0003\u0004\u0002\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u000b\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0003\u0004\u0002\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\r\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u009a\u0005!\u0000\u0000\u0094\u009a\u0005\"\u0000\u0000\u0095\u0096"+
		"\u0005\n\u0000\u0000\u0096\u009a\u0005\u000b\u0000\u0000\u0097\u0098\u0005"+
		"\n\u0000\u0000\u0098\u009a\u0005\f\u0000\u0000\u0099\u0093\u0001\u0000"+
		"\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0095\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u000f\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0007\u0000\u0000\u0000\u009c\u00a6\u0003\u000e"+
		"\u0007\u0000\u009d\u009e\u0007\u0001\u0000\u0000\u009e\u00a6\u0003\u000e"+
		"\u0007\u0000\u009f\u00a0\u0005\u0012\u0000\u0000\u00a0\u00a6\u0003\u000e"+
		"\u0007\u0000\u00a1\u00a2\u0005\u0011\u0000\u0000\u00a2\u00a6\u0003\u000e"+
		"\u0007\u0000\u00a3\u00a4\u0007\u0002\u0000\u0000\u00a4\u00a6\u0003\u000e"+
		"\u0007\u0000\u00a5\u009b\u0001\u0000\u0000\u0000\u00a5\u009d\u0001\u0000"+
		"\u0000\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u0011\u0001\u0000"+
		"\u0000\u0000\u0012\u0015\u001c(.8?FS^ioqw\u0085\u008a\u0090\u0099\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}