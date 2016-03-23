// Generated from MiniJava.g by ANTLR 4.5.2

    package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, COMMENT=38, 
		WHITE_SPACE=39, INTEGER=40, RESERVED_WORD=41, ID=42, OPERATOR=43, DELIMETER=44;
	public static final int
		RULE_prog = 0, RULE_classDecl = 1, RULE_classBody = 2, RULE_member = 3, 
		RULE_method = 4, RULE_argument = 5, RULE_field = 6, RULE_type = 7, RULE_statement = 8, 
		RULE_expression = 9, RULE_expression7 = 10, RULE_expression6 = 11, RULE_expression5 = 12, 
		RULE_expression4 = 13, RULE_expression3 = 14, RULE_expression2 = 15, RULE_expression1 = 16, 
		RULE_terminal = 17;
	public static final String[] ruleNames = {
		"prog", "classDecl", "classBody", "member", "method", "argument", "field", 
		"type", "statement", "expression", "expression7", "expression6", "expression5", 
		"expression4", "expression3", "expression2", "expression1", "terminal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'extends'", "'{'", "'}'", "'public'", "'('", "','", 
		"')'", "'int'", "'boolean'", "'void'", "'='", "'if'", "'else'", "'while'", 
		"'System.out.println'", "';'", "'return'", "'||'", "'&&'", "'=='", "'!='", 
		"'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'.'", 
		"'new'", "'this'", "'null'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "COMMENT", "WHITE_SPACE", "INTEGER", "RESERVED_WORD", "ID", 
		"OPERATOR", "DELIMETER"
	};
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
	public String getGrammarFileName() { return "MiniJava.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				classDecl();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class ClassDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			match(ID);
			setState(45);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(43);
				match(T__1);
				setState(44);
				match(ID);
				}
			}

			setState(47);
			classBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__2);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				member();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__3);
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

	public static class MemberContext extends ParserRuleContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_member);
		try {
			setState(60);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				method();
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				field();
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

	public static class MethodContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__4);
			setState(63);
			type();
			setState(64);
			match(ID);
			setState(65);
			match(T__5);
			setState(74);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				setState(66);
				argument();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(67);
					match(T__6);
					setState(68);
					argument();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(76);
			match(T__7);
			setState(77);
			match(T__2);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(78);
				statement();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(T__3);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			type();
			setState(87);
			match(ID);
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

	public static class FieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			type();
			setState(90);
			match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class StatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				type();
				setState(95);
				match(ID);
				setState(96);
				match(T__11);
				setState(97);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__2);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << ID))) != 0)) {
					{
					{
					setState(100);
					statement();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(T__12);
				setState(108);
				match(T__5);
				setState(109);
				expression();
				setState(110);
				match(T__7);
				setState(111);
				statement();
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(112);
					match(T__13);
					setState(113);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(T__14);
				setState(117);
				match(T__5);
				setState(118);
				expression();
				setState(119);
				match(T__7);
				setState(120);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				match(T__15);
				setState(123);
				match(T__5);
				setState(124);
				expression();
				setState(125);
				match(T__7);
				setState(126);
				match(T__16);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				match(ID);
				setState(129);
				match(T__11);
				setState(130);
				expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				match(T__17);
				setState(132);
				expression();
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
		public Expression7Context expression7() {
			return getRuleContext(Expression7Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			expression7();
			setState(138);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(136);
				match(T__18);
				setState(137);
				expression();
				}
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

	public static class Expression7Context extends ParserRuleContext {
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public Expression7Context expression7() {
			return getRuleContext(Expression7Context.class,0);
		}
		public Expression7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression7(this);
		}
	}

	public final Expression7Context expression7() throws RecognitionException {
		Expression7Context _localctx = new Expression7Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			expression6();
			setState(143);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(141);
				match(T__19);
				setState(142);
				expression7();
				}
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

	public static class Expression6Context extends ParserRuleContext {
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public Expression6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression6(this);
		}
	}

	public final Expression6Context expression6() throws RecognitionException {
		Expression6Context _localctx = new Expression6Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			expression5();
			setState(148);
			_la = _input.LA(1);
			if (_la==T__20 || _la==T__21) {
				{
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(147);
				expression6();
				}
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

	public static class Expression5Context extends ParserRuleContext {
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public Expression5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression5(this);
		}
	}

	public final Expression5Context expression5() throws RecognitionException {
		Expression5Context _localctx = new Expression5Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			expression4();
			setState(153);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				setState(151);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(152);
				expression5();
				}
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

	public static class Expression4Context extends ParserRuleContext {
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public Expression4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression4(this);
		}
	}

	public final Expression4Context expression4() throws RecognitionException {
		Expression4Context _localctx = new Expression4Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			expression3();
			setState(158);
			_la = _input.LA(1);
			if (_la==T__26 || _la==T__27) {
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(157);
				expression4();
				}
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

	public static class Expression3Context extends ParserRuleContext {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public Expression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression3(this);
		}
	}

	public final Expression3Context expression3() throws RecognitionException {
		Expression3Context _localctx = new Expression3Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			expression2();
			setState(163);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29) {
				{
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(162);
				expression3();
				}
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

	public static class Expression2Context extends ParserRuleContext {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression2(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if (_la==T__27 || _la==T__30) {
				{
				setState(165);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(168);
			expression1();
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

	public static class Expression1Context extends ParserRuleContext {
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression1(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		Expression1Context _localctx = new Expression1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			terminal();
			setState(175);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(171);
				match(T__31);
				setState(172);
				match(ID);
				setState(173);
				match(T__5);
				setState(174);
				match(T__7);
				}
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

	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(MiniJavaParser.INTEGER, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_terminal);
		try {
			setState(191);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(T__32);
				setState(178);
				match(ID);
				setState(179);
				match(T__5);
				setState(180);
				match(T__7);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(T__36);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				match(T__5);
				setState(186);
				expression();
				setState(187);
				match(T__7);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				match(ID);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				match(INTEGER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u00c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\5\3\60\n\3\3\3\3\3\3"+
		"\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\3\5\3\5\5\5?\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\5\6M\n\6\3\6\3\6\3\6\7\6R\n\6"+
		"\f\6\16\6U\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\nh\n\n\f\n\16\nk\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\nu\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u0088\n\n\3\13\3\13\3\13\5\13\u008d\n\13\3\f\3\f\3\f\5\f"+
		"\u0092\n\f\3\r\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\16\5\16\u009c\n\16\3"+
		"\17\3\17\3\17\5\17\u00a1\n\17\3\20\3\20\3\20\5\20\u00a6\n\20\3\21\5\21"+
		"\u00a9\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00b2\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c2"+
		"\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\b\4\2\13"+
		"\r,,\3\2\27\30\3\2\31\34\3\2\35\36\3\2\37 \4\2\36\36!!\u00cf\2\'\3\2\2"+
		"\2\4+\3\2\2\2\6\63\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fX\3\2\2\2\16[\3\2\2"+
		"\2\20^\3\2\2\2\22\u0087\3\2\2\2\24\u0089\3\2\2\2\26\u008e\3\2\2\2\30\u0093"+
		"\3\2\2\2\32\u0098\3\2\2\2\34\u009d\3\2\2\2\36\u00a2\3\2\2\2 \u00a8\3\2"+
		"\2\2\"\u00ac\3\2\2\2$\u00c1\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+,\7\3\2\2,/\7,\2\2-.\7\4\2\2.\60\7,\2\2"+
		"/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\5\6\4\2\62\5\3\2\2\2\63\67"+
		"\7\5\2\2\64\66\5\b\5\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2"+
		"\2\28:\3\2\2\29\67\3\2\2\2:;\7\6\2\2;\7\3\2\2\2<?\5\n\6\2=?\5\16\b\2>"+
		"<\3\2\2\2>=\3\2\2\2?\t\3\2\2\2@A\7\7\2\2AB\5\20\t\2BC\7,\2\2CL\7\b\2\2"+
		"DI\5\f\7\2EF\7\t\2\2FH\5\f\7\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"JM\3\2\2\2KI\3\2\2\2LD\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\n\2\2OS\7\5\2\2"+
		"PR\5\22\n\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2"+
		"\2VW\7\6\2\2W\13\3\2\2\2XY\5\20\t\2YZ\7,\2\2Z\r\3\2\2\2[\\\5\20\t\2\\"+
		"]\7,\2\2]\17\3\2\2\2^_\t\2\2\2_\21\3\2\2\2`a\5\20\t\2ab\7,\2\2bc\7\16"+
		"\2\2cd\5\24\13\2d\u0088\3\2\2\2ei\7\5\2\2fh\5\22\n\2gf\3\2\2\2hk\3\2\2"+
		"\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2l\u0088\7\6\2\2mn\7\17\2\2n"+
		"o\7\b\2\2op\5\24\13\2pq\7\n\2\2qt\5\22\n\2rs\7\20\2\2su\5\22\n\2tr\3\2"+
		"\2\2tu\3\2\2\2u\u0088\3\2\2\2vw\7\21\2\2wx\7\b\2\2xy\5\24\13\2yz\7\n\2"+
		"\2z{\5\22\n\2{\u0088\3\2\2\2|}\7\22\2\2}~\7\b\2\2~\177\5\24\13\2\177\u0080"+
		"\7\n\2\2\u0080\u0081\7\23\2\2\u0081\u0088\3\2\2\2\u0082\u0083\7,\2\2\u0083"+
		"\u0084\7\16\2\2\u0084\u0088\5\24\13\2\u0085\u0086\7\24\2\2\u0086\u0088"+
		"\5\24\13\2\u0087`\3\2\2\2\u0087e\3\2\2\2\u0087m\3\2\2\2\u0087v\3\2\2\2"+
		"\u0087|\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0085\3\2\2\2\u0088\23\3\2\2"+
		"\2\u0089\u008c\5\26\f\2\u008a\u008b\7\25\2\2\u008b\u008d\5\24\13\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\25\3\2\2\2\u008e\u0091\5\30\r"+
		"\2\u008f\u0090\7\26\2\2\u0090\u0092\5\26\f\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\27\3\2\2\2\u0093\u0096\5\32\16\2\u0094\u0095\t\3"+
		"\2\2\u0095\u0097\5\30\r\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\31\3\2\2\2\u0098\u009b\5\34\17\2\u0099\u009a\t\4\2\2\u009a\u009c\5\32"+
		"\16\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\33\3\2\2\2\u009d\u00a0"+
		"\5\36\20\2\u009e\u009f\t\5\2\2\u009f\u00a1\5\34\17\2\u00a0\u009e\3\2\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\35\3\2\2\2\u00a2\u00a5\5 \21\2\u00a3\u00a4"+
		"\t\6\2\2\u00a4\u00a6\5\36\20\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a6\37\3\2\2\2\u00a7\u00a9\t\7\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\5\"\22\2\u00ab!\3\2\2\2\u00ac"+
		"\u00b1\5$\23\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7,\2\2\u00af\u00b0\7\b"+
		"\2\2\u00b0\u00b2\7\n\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"#\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4\u00b5\7,\2\2\u00b5\u00b6\7\b\2\2\u00b6"+
		"\u00c2\7\n\2\2\u00b7\u00c2\7$\2\2\u00b8\u00c2\7%\2\2\u00b9\u00c2\7&\2"+
		"\2\u00ba\u00c2\7\'\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\5\24\13\2\u00bd"+
		"\u00be\7\n\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c2\7,\2\2\u00c0\u00c2\7*\2"+
		"\2\u00c1\u00b3\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00b9"+
		"\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2%\3\2\2\2\25)/\67>ILSit\u0087\u008c\u0091\u0096\u009b"+
		"\u00a0\u00a5\u00a8\u00b1\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}