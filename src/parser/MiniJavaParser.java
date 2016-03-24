// Generated from MiniJava.g4 by ANTLR 4.5.2

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
		RULE_expression = 9, RULE_or = 10, RULE_and = 11, RULE_equality = 12, 
		RULE_comparison = 13, RULE_sum = 14, RULE_product = 15, RULE_factor = 16, 
		RULE_access = 17, RULE_terminal = 18;
	public static final String[] ruleNames = {
		"prog", "classDecl", "classBody", "member", "method", "argument", "field", 
		"type", "statement", "expression", "or", "and", "equality", "comparison", 
		"sum", "product", "factor", "access", "terminal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'extends'", "'{'", "'}'", "'public'", "'('", "','", 
		"')'", "'int'", "'boolean'", "'void'", "'='", "';'", "'if'", "'else'", 
		"'while'", "'System.out.println'", "'return'", "'||'", "'&&'", "'=='", 
		"'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", 
		"'.'", "'new'", "'this'", "'null'", "'true'", "'false'"
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				classDecl();
				}
				}
				setState(41); 
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
			setState(43);
			match(T__0);
			setState(44);
			match(ID);
			setState(47);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(45);
				match(T__1);
				setState(46);
				match(ID);
				}
			}

			setState(49);
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
			setState(51);
			match(T__2);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				{
				setState(52);
				member();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				method();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				field();
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
			setState(65);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(64);
				match(T__4);
				}
			}

			setState(67);
			type();
			setState(68);
			match(ID);
			setState(69);
			match(T__5);
			setState(78);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				setState(70);
				argument();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(71);
					match(T__6);
					setState(72);
					argument();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(80);
			match(T__7);
			setState(81);
			match(T__2);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(82);
				statement();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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
			setState(90);
			type();
			setState(91);
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
			setState(93);
			type();
			setState(94);
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
			setState(96);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				type();
				setState(99);
				match(ID);
				setState(100);
				match(T__11);
				setState(101);
				expression();
				setState(102);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__2);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
					{
					{
					setState(105);
					statement();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(T__13);
				setState(113);
				match(T__5);
				setState(114);
				expression();
				setState(115);
				match(T__7);
				setState(116);
				statement();
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(117);
					match(T__14);
					setState(118);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(T__15);
				setState(122);
				match(T__5);
				setState(123);
				expression();
				setState(124);
				match(T__7);
				setState(125);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				match(T__16);
				setState(128);
				match(T__5);
				setState(129);
				expression();
				setState(130);
				match(T__7);
				setState(131);
				match(T__12);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				match(ID);
				setState(134);
				match(T__11);
				setState(135);
				expression();
				setState(136);
				match(T__12);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				match(T__17);
				setState(139);
				expression();
				setState(140);
				match(T__12);
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
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			or();
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

	public static class OrContext extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			and();
			setState(149);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(147);
				match(T__18);
				setState(148);
				or();
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

	public static class AndContext extends ParserRuleContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151);
			equality();
			}
			setState(154);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(152);
				match(T__19);
				setState(153);
				and();
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

	public static class EqualityContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitEquality(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			comparison();
			setState(159);
			_la = _input.LA(1);
			if (_la==T__20 || _la==T__21) {
				{
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(158);
				equality();
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

	public static class ComparisonContext extends ParserRuleContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			sum();
			setState(164);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				setState(162);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(163);
				comparison();
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

	public static class SumContext extends ParserRuleContext {
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			product();
			setState(169);
			_la = _input.LA(1);
			if (_la==T__26 || _la==T__27) {
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(168);
				sum();
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

	public static class ProductContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_product);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			factor();
			setState(174);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29) {
				{
				setState(172);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(173);
				product();
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

	public static class FactorContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if (_la==T__27 || _la==T__30) {
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(179);
			access();
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

	public static class AccessContext extends ParserRuleContext {
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAccess(this);
		}
	}

	public final AccessContext access() throws RecognitionException {
		AccessContext _localctx = new AccessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			terminal();
			setState(186);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(182);
				match(T__31);
				setState(183);
				match(ID);
				setState(184);
				match(T__5);
				setState(185);
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
		enterRule(_localctx, 36, RULE_terminal);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(T__32);
				setState(189);
				match(ID);
				setState(190);
				match(T__5);
				setState(191);
				match(T__7);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(T__36);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(T__5);
				setState(197);
				expression();
				setState(198);
				match(T__7);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				match(ID);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 8);
				{
				setState(201);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\3\3\3\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\5\3\5\5\5A\n\5\3\6"+
		"\5\6D\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\5\6Q\n\6\3\6"+
		"\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\nz\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091\n\n\3\13\3\13\3"+
		"\f\3\f\3\f\5\f\u0098\n\f\3\r\3\r\3\r\5\r\u009d\n\r\3\16\3\16\3\16\5\16"+
		"\u00a2\n\16\3\17\3\17\3\17\5\17\u00a7\n\17\3\20\3\20\3\20\5\20\u00ac\n"+
		"\20\3\21\3\21\3\21\5\21\u00b1\n\21\3\22\5\22\u00b4\n\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00bd\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00cd\n\24\3\24\2\2\25\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\b\4\2\13\r,,\3\2\27\30\3\2\31"+
		"\34\3\2\35\36\3\2\37 \4\2\36\36!!\u00da\2)\3\2\2\2\4-\3\2\2\2\6\65\3\2"+
		"\2\2\b@\3\2\2\2\nC\3\2\2\2\f\\\3\2\2\2\16_\3\2\2\2\20b\3\2\2\2\22\u0090"+
		"\3\2\2\2\24\u0092\3\2\2\2\26\u0094\3\2\2\2\30\u0099\3\2\2\2\32\u009e\3"+
		"\2\2\2\34\u00a3\3\2\2\2\36\u00a8\3\2\2\2 \u00ad\3\2\2\2\"\u00b3\3\2\2"+
		"\2$\u00b7\3\2\2\2&\u00cc\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2"+
		"\2+,\3\2\2\2,\3\3\2\2\2-.\7\3\2\2.\61\7,\2\2/\60\7\4\2\2\60\62\7,\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\5\6\4\2\64\5\3\2\2\2\65"+
		"9\7\5\2\2\668\5\b\5\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<"+
		"\3\2\2\2;9\3\2\2\2<=\7\6\2\2=\7\3\2\2\2>A\5\n\6\2?A\5\16\b\2@>\3\2\2\2"+
		"@?\3\2\2\2A\t\3\2\2\2BD\7\7\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\5\20\t"+
		"\2FG\7,\2\2GP\7\b\2\2HM\5\f\7\2IJ\7\t\2\2JL\5\f\7\2KI\3\2\2\2LO\3\2\2"+
		"\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PH\3\2\2\2PQ\3\2\2\2QR\3\2\2"+
		"\2RS\7\n\2\2SW\7\5\2\2TV\5\22\n\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\6\2\2[\13\3\2\2\2\\]\5\20\t\2]^\7,\2\2^\r"+
		"\3\2\2\2_`\5\20\t\2`a\7,\2\2a\17\3\2\2\2bc\t\2\2\2c\21\3\2\2\2de\5\20"+
		"\t\2ef\7,\2\2fg\7\16\2\2gh\5\24\13\2hi\7\17\2\2i\u0091\3\2\2\2jn\7\5\2"+
		"\2km\5\22\n\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2"+
		"\2\2q\u0091\7\6\2\2rs\7\20\2\2st\7\b\2\2tu\5\24\13\2uv\7\n\2\2vy\5\22"+
		"\n\2wx\7\21\2\2xz\5\22\n\2yw\3\2\2\2yz\3\2\2\2z\u0091\3\2\2\2{|\7\22\2"+
		"\2|}\7\b\2\2}~\5\24\13\2~\177\7\n\2\2\177\u0080\5\22\n\2\u0080\u0091\3"+
		"\2\2\2\u0081\u0082\7\23\2\2\u0082\u0083\7\b\2\2\u0083\u0084\5\24\13\2"+
		"\u0084\u0085\7\n\2\2\u0085\u0086\7\17\2\2\u0086\u0091\3\2\2\2\u0087\u0088"+
		"\7,\2\2\u0088\u0089\7\16\2\2\u0089\u008a\5\24\13\2\u008a\u008b\7\17\2"+
		"\2\u008b\u0091\3\2\2\2\u008c\u008d\7\24\2\2\u008d\u008e\5\24\13\2\u008e"+
		"\u008f\7\17\2\2\u008f\u0091\3\2\2\2\u0090d\3\2\2\2\u0090j\3\2\2\2\u0090"+
		"r\3\2\2\2\u0090{\3\2\2\2\u0090\u0081\3\2\2\2\u0090\u0087\3\2\2\2\u0090"+
		"\u008c\3\2\2\2\u0091\23\3\2\2\2\u0092\u0093\5\26\f\2\u0093\25\3\2\2\2"+
		"\u0094\u0097\5\30\r\2\u0095\u0096\7\25\2\2\u0096\u0098\5\26\f\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\27\3\2\2\2\u0099\u009c\5\32\16"+
		"\2\u009a\u009b\7\26\2\2\u009b\u009d\5\30\r\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\31\3\2\2\2\u009e\u00a1\5\34\17\2\u009f\u00a0\t\3"+
		"\2\2\u00a0\u00a2\5\32\16\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\33\3\2\2\2\u00a3\u00a6\5\36\20\2\u00a4\u00a5\t\4\2\2\u00a5\u00a7\5\34"+
		"\17\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\35\3\2\2\2\u00a8\u00ab"+
		"\5 \21\2\u00a9\u00aa\t\5\2\2\u00aa\u00ac\5\36\20\2\u00ab\u00a9\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\37\3\2\2\2\u00ad\u00b0\5\"\22\2\u00ae\u00af"+
		"\t\6\2\2\u00af\u00b1\5 \21\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"!\3\2\2\2\u00b2\u00b4\t\7\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5$\23\2\u00b6#\3\2\2\2\u00b7\u00bc\5"+
		"&\24\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba\7,\2\2\u00ba\u00bb\7\b\2\2\u00bb"+
		"\u00bd\7\n\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd%\3\2\2\2"+
		"\u00be\u00bf\7#\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c1\7\b\2\2\u00c1\u00cd"+
		"\7\n\2\2\u00c2\u00cd\7$\2\2\u00c3\u00cd\7%\2\2\u00c4\u00cd\7&\2\2\u00c5"+
		"\u00cd\7\'\2\2\u00c6\u00c7\7\b\2\2\u00c7\u00c8\5\24\13\2\u00c8\u00c9\7"+
		"\n\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cd\7,\2\2\u00cb\u00cd\7*\2\2\u00cc"+
		"\u00be\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c4\3\2"+
		"\2\2\u00cc\u00c5\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\'\3\2\2\2\26+\619@CMPWny\u0090\u0097\u009c\u00a1"+
		"\u00a6\u00ab\u00b0\u00b3\u00bc\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}