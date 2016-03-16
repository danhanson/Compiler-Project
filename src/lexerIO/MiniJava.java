// Generated from MiniJava.g by ANTLR 4.5.2

	package lexerIO;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJava extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Program=1, Token=2, Integer=3, ID=4, ReservedWord=5, Operator=6, Delimiter=7, 
		WhiteSpace=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Letter", "Digit", "NonZeroDigit", "Program", "Token", "Integer", "ID", 
		"ReservedWord", "Operator", "Delimiter", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Program", "Token", "Integer", "ID", "ReservedWord", "Operator", 
		"Delimiter", "WhiteSpace"
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


	public MiniJava(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 10:
			WhiteSpace_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u00c0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\5\2\33\n\2\3\3\3\3\3\4\3\4\3\5\3\5\6\5#\n\5\r\5\16\5"+
		"$\3\6\3\6\3\6\3\6\3\6\5\6,\n\6\3\7\3\7\3\7\7\7\61\n\7\f\7\16\7\64\13\7"+
		"\5\7\66\n\7\3\b\3\b\3\b\7\b;\n\b\f\b\16\b>\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a7\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b6\n\n\3\13\3\13\3\f\6\f\u00bb"+
		"\n\f\r\f\16\f\u00bc\3\f\3\f\2\2\r\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23"+
		"\b\25\t\27\n\3\2\b\4\2C\\c|\3\2\62;\3\2\63;\6\2,-//\61\61>>\13\2*+..\60"+
		"\60==??]]__}}\177\177\5\2\13\f\17\17\"\"\u00e0\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\3\32\3\2\2\2\5\34\3\2\2\2\7\36\3\2\2\2\t\"\3\2\2\2\13+\3\2\2"+
		"\2\r\65\3\2\2\2\17\67\3\2\2\2\21\u00a6\3\2\2\2\23\u00b5\3\2\2\2\25\u00b7"+
		"\3\2\2\2\27\u00ba\3\2\2\2\31\33\t\2\2\2\32\31\3\2\2\2\33\4\3\2\2\2\34"+
		"\35\t\3\2\2\35\6\3\2\2\2\36\37\t\4\2\2\37\b\3\2\2\2 #\5\13\6\2!#\5\27"+
		"\f\2\" \3\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\n\3\2\2\2&"+
		",\5\23\n\2\',\5\25\13\2(,\5\21\t\2),\5\r\7\2*,\5\17\b\2+&\3\2\2\2+\'\3"+
		"\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\f\3\2\2\2-\66\7\62\2\2.\62\5\7\4"+
		"\2/\61\5\5\3\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63"+
		"\66\3\2\2\2\64\62\3\2\2\2\65-\3\2\2\2\65.\3\2\2\2\66\16\3\2\2\2\67<\5"+
		"\3\2\28;\5\3\2\29;\5\5\3\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=\20\3\2\2\2><\3\2\2\2?@\7e\2\2@A\7n\2\2AB\7c\2\2BC\7u\2\2C\u00a7"+
		"\7u\2\2DE\7r\2\2EF\7w\2\2FG\7d\2\2GH\7n\2\2HI\7k\2\2I\u00a7\7e\2\2JK\7"+
		"u\2\2KL\7v\2\2LM\7c\2\2MN\7v\2\2NO\7k\2\2O\u00a7\7e\2\2PQ\7g\2\2QR\7z"+
		"\2\2RS\7v\2\2ST\7g\2\2TU\7p\2\2UV\7f\2\2V\u00a7\7u\2\2WX\7x\2\2XY\7q\2"+
		"\2YZ\7k\2\2Z\u00a7\7f\2\2[\\\7k\2\2\\]\7p\2\2]\u00a7\7v\2\2^_\7d\2\2_"+
		"`\7q\2\2`a\7q\2\2ab\7n\2\2bc\7g\2\2cd\7c\2\2d\u00a7\7p\2\2ef\7k\2\2f\u00a7"+
		"\7h\2\2gh\7g\2\2hi\7n\2\2ij\7u\2\2j\u00a7\7g\2\2kl\7y\2\2lm\7j\2\2mn\7"+
		"k\2\2no\7n\2\2o\u00a7\7g\2\2pq\7t\2\2qr\7g\2\2rs\7v\2\2st\7w\2\2tu\7t"+
		"\2\2u\u00a7\7p\2\2vw\7p\2\2wx\7w\2\2xy\7n\2\2y\u00a7\7n\2\2z{\7v\2\2{"+
		"|\7t\2\2|}\7w\2\2}\u00a7\7g\2\2~\177\7h\2\2\177\u0080\7c\2\2\u0080\u0081"+
		"\7n\2\2\u0081\u0082\7u\2\2\u0082\u00a7\7g\2\2\u0083\u0084\7v\2\2\u0084"+
		"\u0085\7j\2\2\u0085\u0086\7k\2\2\u0086\u00a7\7u\2\2\u0087\u0088\7p\2\2"+
		"\u0088\u0089\7g\2\2\u0089\u00a7\7y\2\2\u008a\u008b\7U\2\2\u008b\u008c"+
		"\7v\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f"+
		"\u00a7\7i\2\2\u0090\u0091\7o\2\2\u0091\u0092\7c\2\2\u0092\u0093\7k\2\2"+
		"\u0093\u00a7\7p\2\2\u0094\u0095\7U\2\2\u0095\u0096\7{\2\2\u0096\u0097"+
		"\7u\2\2\u0097\u0098\7v\2\2\u0098\u0099\7g\2\2\u0099\u009a\7o\2\2\u009a"+
		"\u009b\7\60\2\2\u009b\u009c\7q\2\2\u009c\u009d\7w\2\2\u009d\u009e\7v\2"+
		"\2\u009e\u009f\7\60\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2"+
		"\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7n\2\2\u00a5"+
		"\u00a7\7p\2\2\u00a6?\3\2\2\2\u00a6D\3\2\2\2\u00a6J\3\2\2\2\u00a6P\3\2"+
		"\2\2\u00a6W\3\2\2\2\u00a6[\3\2\2\2\u00a6^\3\2\2\2\u00a6e\3\2\2\2\u00a6"+
		"g\3\2\2\2\u00a6k\3\2\2\2\u00a6p\3\2\2\2\u00a6v\3\2\2\2\u00a6z\3\2\2\2"+
		"\u00a6~\3\2\2\2\u00a6\u0083\3\2\2\2\u00a6\u0087\3\2\2\2\u00a6\u008a\3"+
		"\2\2\2\u00a6\u0090\3\2\2\2\u00a6\u0094\3\2\2\2\u00a7\22\3\2\2\2\u00a8"+
		"\u00b6\t\5\2\2\u00a9\u00aa\7>\2\2\u00aa\u00b6\7?\2\2\u00ab\u00ac\7@\2"+
		"\2\u00ac\u00b6\7?\2\2\u00ad\u00b6\7@\2\2\u00ae\u00af\7?\2\2\u00af\u00b6"+
		"\7?\2\2\u00b0\u00b1\7(\2\2\u00b1\u00b6\7(\2\2\u00b2\u00b3\7~\2\2\u00b3"+
		"\u00b6\7~\2\2\u00b4\u00b6\7#\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00a9\3\2\2"+
		"\2\u00b5\u00ab\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00b0"+
		"\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\24\3\2\2\2\u00b7"+
		"\u00b8\t\6\2\2\u00b8\26\3\2\2\2\u00b9\u00bb\t\7\2\2\u00ba\u00b9\3\2\2"+
		"\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\b\f\2\2\u00bf\30\3\2\2\2\16\2\32\"$+\62\65:<\u00a6"+
		"\u00b5\u00bc\3\3\f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}