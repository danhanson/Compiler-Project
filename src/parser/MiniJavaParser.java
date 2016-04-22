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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		TRUE=39, FALSE=40, COMMENT=41, WHITE_SPACE=42, INTEGER=43, RESERVED_WORD=44, 
		ID=45, OPERATOR=46, DELIMETER=47;
	public static final int
		RULE_prog = 0, RULE_classDecl = 1, RULE_inherits = 2, RULE_classBody = 3, 
		RULE_member = 4, RULE_method = 5, RULE_block = 6, RULE_returnType = 7, 
		RULE_arguments = 8, RULE_field = 9, RULE_declaration = 10, RULE_type = 11, 
		RULE_statement = 12, RULE_ifBody = 13, RULE_elseBody = 14, RULE_expression = 15, 
		RULE_booleanExp = 16, RULE_params = 17;
	public static final String[] ruleNames = {
		"prog", "classDecl", "inherits", "classBody", "member", "method", "block", 
		"returnType", "arguments", "field", "declaration", "type", "statement", 
		"ifBody", "elseBody", "expression", "booleanExp", "params"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'extends'", "'{'", "'}'", "'public'", "'('", "')'", 
		"'static'", "'void'", "'main'", "'String[]'", "','", "'='", "';'", "'int'", 
		"'boolean'", "'while'", "'System.out.println'", "'return'", "'if'", "'else'", 
		"'new'", "'this'", "'null'", "'.'", "'-'", "'!'", "'/'", "'*'", "'+'", 
		"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'true'", 
		"'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "TRUE", "FALSE", "COMMENT", "WHITE_SPACE", "INTEGER", 
		"RESERVED_WORD", "ID", "OPERATOR", "DELIMETER"
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
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
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
			while (_la==T__0) {
				{
				{
				setState(36);
				classDecl();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public InheritsContext inherits() {
			return getRuleContext(InheritsContext.class,0);
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
			setState(44);
			match(T__0);
			setState(45);
			match(ID);
			setState(47);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(46);
				inherits();
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

	public static class InheritsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public InheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterInherits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitInherits(this);
		}
	}

	public final InheritsContext inherits() throws RecognitionException {
		InheritsContext _localctx = new InheritsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inherits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__1);
			setState(52);
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
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__2);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) {
				{
				{
				setState(55);
				member();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
		enterRule(_localctx, 8, RULE_member);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				method();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
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
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	 
		public MethodContext() { }
		public void copyFrom(MethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalMethodContext extends MethodContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NormalMethodContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNormalMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNormalMethod(this);
		}
	}
	public static class MainMethodContext extends MethodContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainMethodContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NormalMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(67);
					match(T__4);
					}
				}

				setState(70);
				returnType();
				setState(71);
				match(ID);
				setState(72);
				match(T__5);
				setState(73);
				arguments();
				setState(74);
				match(T__6);
				setState(75);
				block();
				}
				break;
			case 2:
				_localctx = new MainMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__4);
				setState(78);
				match(T__7);
				setState(79);
				match(T__8);
				setState(80);
				match(T__9);
				setState(81);
				match(T__5);
				setState(82);
				match(T__10);
				setState(83);
				match(ID);
				setState(84);
				match(T__6);
				setState(85);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__2);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(89);
				statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case ID:
				{
				setState(97);
				type();
				}
				break;
			case T__8:
				{
				setState(98);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arguments);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				declaration();
				setState(102);
				match(T__11);
				setState(103);
				arguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FieldContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			declaration();
			setState(112);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(110);
				match(T__12);
				setState(111);
				expression(0);
				}
			}

			setState(114);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			type();
			setState(117);
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
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationStatementContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitDeclarationStatement(this);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhileStatement(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrintStatement(this);
		}
	}
	public static class EmptyStatementContext extends StatementContext {
		public EmptyStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitEmptyStatement(this);
		}
	}
	public static class BlockStatementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlockStatement(this);
		}
	}
	public static class AssignmentStatementContext extends StatementContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignmentStatement(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public ElseBodyContext elseBody() {
			return getRuleContext(ElseBodyContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfStatement(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitReturnStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				declaration();
				setState(124);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(122);
					match(T__12);
					setState(123);
					expression(0);
					}
				}

				setState(126);
				match(T__13);
				}
				break;
			case 2:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				block();
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				ifBody();
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(130);
					elseBody();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(T__16);
				setState(134);
				match(T__5);
				setState(135);
				expression(0);
				setState(136);
				match(T__6);
				setState(137);
				statement();
				}
				break;
			case 5:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(T__17);
				setState(140);
				match(T__5);
				setState(141);
				expression(0);
				setState(142);
				match(T__6);
				setState(143);
				match(T__13);
				}
				break;
			case 6:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(ID);
				setState(146);
				match(T__12);
				setState(147);
				expression(0);
				setState(148);
				match(T__13);
				}
				break;
			case 7:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				match(T__18);
				setState(152);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(151);
					expression(0);
					}
				}

				setState(154);
				match(T__13);
				}
				break;
			case 8:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
				match(T__13);
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

	public static class IfBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfBody(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__19);
			setState(159);
			match(T__5);
			setState(160);
			expression(0);
			setState(161);
			match(T__6);
			setState(162);
			statement();
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

	public static class ElseBodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterElseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitElseBody(this);
		}
	}

	public final ElseBodyContext elseBody() throws RecognitionException {
		ElseBodyContext _localctx = new ElseBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__20);
			setState(165);
			statement();
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public IdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifier(this);
		}
	}
	public static class BooleanContext extends ExpressionContext {
		public BooleanExpContext booleanExp() {
			return getRuleContext(BooleanExpContext.class,0);
		}
		public BooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBoolean(this);
		}
	}
	public static class NullContext extends ExpressionContext {
		public NullContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNull(this);
		}
	}
	public static class ThisContext extends ExpressionContext {
		public ThisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitThis(this);
		}
	}
	public static class ParenthExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParenthExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParenthExpression(this);
		}
	}
	public static class IntegerContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(MiniJavaParser.INTEGER, 0); }
		public IntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitInteger(this);
		}
	}
	public static class BinaryOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBinaryOperation(this);
		}
	}
	public static class UnaryOperationContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitUnaryOperation(this);
		}
	}
	public static class InvokeMethodContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public InvokeMethodContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterInvokeMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitInvokeMethod(this);
		}
	}
	public static class InstantiationContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public InstantiationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitInstantiation(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(169);
				expression(7);
				}
				break;
			case T__21:
				{
				_localctx = new InstantiationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(T__21);
				setState(171);
				match(ID);
				setState(172);
				match(T__5);
				setState(173);
				match(T__6);
				}
				break;
			case T__22:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(T__22);
				}
				break;
			case T__23:
				{
				_localctx = new NullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(T__23);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				booleanExp();
				}
				break;
			case T__5:
				{
				_localctx = new ParenthExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(T__5);
				setState(178);
				expression(0);
				setState(179);
				match(T__6);
				}
				break;
			case ID:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(ID);
				}
				break;
			case INTEGER:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(INTEGER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(186);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(187);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(189);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(190);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(192);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(193);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(195);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(196);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(198);
						match(T__36);
						setState(199);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(201);
						match(T__37);
						setState(202);
						expression(2);
						}
						break;
					case 7:
						{
						_localctx = new InvokeMethodContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(204);
						match(T__24);
						setState(205);
						match(ID);
						setState(206);
						match(T__5);
						setState(207);
						params();
						setState(208);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class BooleanExpContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MiniJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniJavaParser.FALSE, 0); }
		public BooleanExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBooleanExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBooleanExp(this);
		}
	}

	public final BooleanExpContext booleanExp() throws RecognitionException {
		BooleanExpContext _localctx = new BooleanExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_booleanExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class ParamsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_params);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				expression(0);
				setState(218);
				match(T__11);
				setState(219);
				params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u00e4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\3\5\3\6\3\6\5"+
		"\6D\n\6\3\7\5\7G\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\3\b\3\b\3\t\3"+
		"\t\5\tf\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\5\13s\n\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16\177\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0086\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009b\n\16"+
		"\3\16\3\16\5\16\u009f\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00ba\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00d5\n\21\f\21\16\21\u00d8\13\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00e2\n\23\3\23\2\3 \24\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$\2\t\4\2\21\22//\3\2\34\35\3\2\36\37\4\2\34\34 "+
		" \3\2!$\3\2%&\3\2)*\u00f6\2)\3\2\2\2\4.\3\2\2\2\6\65\3\2\2\2\b8\3\2\2"+
		"\2\nC\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20e\3\2\2\2\22m\3\2\2\2\24o\3\2\2"+
		"\2\26v\3\2\2\2\30y\3\2\2\2\32\u009e\3\2\2\2\34\u00a0\3\2\2\2\36\u00a6"+
		"\3\2\2\2 \u00b9\3\2\2\2\"\u00d9\3\2\2\2$\u00e1\3\2\2\2&(\5\4\3\2\'&\3"+
		"\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3"+
		"\3\2\2\2./\7\3\2\2/\61\7/\2\2\60\62\5\6\4\2\61\60\3\2\2\2\61\62\3\2\2"+
		"\2\62\63\3\2\2\2\63\64\5\b\5\2\64\5\3\2\2\2\65\66\7\4\2\2\66\67\7/\2\2"+
		"\67\7\3\2\2\28<\7\5\2\29;\5\n\6\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2"+
		"\2\2=?\3\2\2\2><\3\2\2\2?@\7\6\2\2@\t\3\2\2\2AD\5\f\7\2BD\5\24\13\2CA"+
		"\3\2\2\2CB\3\2\2\2D\13\3\2\2\2EG\7\7\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2"+
		"HI\5\20\t\2IJ\7/\2\2JK\7\b\2\2KL\5\22\n\2LM\7\t\2\2MN\5\16\b\2NY\3\2\2"+
		"\2OP\7\7\2\2PQ\7\n\2\2QR\7\13\2\2RS\7\f\2\2ST\7\b\2\2TU\7\r\2\2UV\7/\2"+
		"\2VW\7\t\2\2WY\5\16\b\2XF\3\2\2\2XO\3\2\2\2Y\r\3\2\2\2Z^\7\5\2\2[]\5\32"+
		"\16\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab"+
		"\7\6\2\2b\17\3\2\2\2cf\5\30\r\2df\7\13\2\2ec\3\2\2\2ed\3\2\2\2f\21\3\2"+
		"\2\2gh\5\26\f\2hi\7\16\2\2ij\5\22\n\2jn\3\2\2\2kn\5\26\f\2ln\3\2\2\2m"+
		"g\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\23\3\2\2\2or\5\26\f\2pq\7\17\2\2qs\5 \21"+
		"\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\20\2\2u\25\3\2\2\2vw\5\30\r\2wx\7"+
		"/\2\2x\27\3\2\2\2yz\t\2\2\2z\31\3\2\2\2{~\5\26\f\2|}\7\17\2\2}\177\5 "+
		"\21\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\20\2\2\u0081"+
		"\u009f\3\2\2\2\u0082\u009f\5\16\b\2\u0083\u0085\5\34\17\2\u0084\u0086"+
		"\5\36\20\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u009f\3\2\2\2"+
		"\u0087\u0088\7\23\2\2\u0088\u0089\7\b\2\2\u0089\u008a\5 \21\2\u008a\u008b"+
		"\7\t\2\2\u008b\u008c\5\32\16\2\u008c\u009f\3\2\2\2\u008d\u008e\7\24\2"+
		"\2\u008e\u008f\7\b\2\2\u008f\u0090\5 \21\2\u0090\u0091\7\t\2\2\u0091\u0092"+
		"\7\20\2\2\u0092\u009f\3\2\2\2\u0093\u0094\7/\2\2\u0094\u0095\7\17\2\2"+
		"\u0095\u0096\5 \21\2\u0096\u0097\7\20\2\2\u0097\u009f\3\2\2\2\u0098\u009a"+
		"\7\25\2\2\u0099\u009b\5 \21\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009f\7\20\2\2\u009d\u009f\7\20\2\2\u009e{"+
		"\3\2\2\2\u009e\u0082\3\2\2\2\u009e\u0083\3\2\2\2\u009e\u0087\3\2\2\2\u009e"+
		"\u008d\3\2\2\2\u009e\u0093\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\33\3\2\2\2\u00a0\u00a1\7\26\2\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3"+
		"\5 \21\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5\5\32\16\2\u00a5\35\3\2\2\2\u00a6"+
		"\u00a7\7\27\2\2\u00a7\u00a8\5\32\16\2\u00a8\37\3\2\2\2\u00a9\u00aa\b\21"+
		"\1\2\u00aa\u00ab\t\3\2\2\u00ab\u00ba\5 \21\t\u00ac\u00ad\7\30\2\2\u00ad"+
		"\u00ae\7/\2\2\u00ae\u00af\7\b\2\2\u00af\u00ba\7\t\2\2\u00b0\u00ba\7\31"+
		"\2\2\u00b1\u00ba\7\32\2\2\u00b2\u00ba\5\"\22\2\u00b3\u00b4\7\b\2\2\u00b4"+
		"\u00b5\5 \21\2\u00b5\u00b6\7\t\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00ba\7/"+
		"\2\2\u00b8\u00ba\7-\2\2\u00b9\u00a9\3\2\2\2\u00b9\u00ac\3\2\2\2\u00b9"+
		"\u00b0\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9\u00b3\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00d6\3\2\2\2\u00bb"+
		"\u00bc\f\b\2\2\u00bc\u00bd\t\4\2\2\u00bd\u00d5\5 \21\t\u00be\u00bf\f\7"+
		"\2\2\u00bf\u00c0\t\5\2\2\u00c0\u00d5\5 \21\b\u00c1\u00c2\f\6\2\2\u00c2"+
		"\u00c3\t\6\2\2\u00c3\u00d5\5 \21\7\u00c4\u00c5\f\5\2\2\u00c5\u00c6\t\7"+
		"\2\2\u00c6\u00d5\5 \21\6\u00c7\u00c8\f\4\2\2\u00c8\u00c9\7\'\2\2\u00c9"+
		"\u00d5\5 \21\5\u00ca\u00cb\f\3\2\2\u00cb\u00cc\7(\2\2\u00cc\u00d5\5 \21"+
		"\4\u00cd\u00ce\f\n\2\2\u00ce\u00cf\7\33\2\2\u00cf\u00d0\7/\2\2\u00d0\u00d1"+
		"\7\b\2\2\u00d1\u00d2\5$\23\2\u00d2\u00d3\7\t\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00bb\3\2\2\2\u00d4\u00be\3\2\2\2\u00d4\u00c1\3\2\2\2\u00d4\u00c4\3\2"+
		"\2\2\u00d4\u00c7\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7!\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d9\u00da\t\b\2\2\u00da#\3\2\2\2\u00db\u00dc\5"+
		" \21\2\u00dc\u00dd\7\16\2\2\u00dd\u00de\5$\23\2\u00de\u00e2\3\2\2\2\u00df"+
		"\u00e2\5 \21\2\u00e0\u00e2\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e0\3\2\2\2\u00e2%\3\2\2\2\24)\61<CFX^emr~\u0085\u009a\u009e"+
		"\u00b9\u00d4\u00d6\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}