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
		Token=1, Integer=2, ID=3, ReservedWord=4, Operator=5, Delimiter=6, WhiteSpace=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Letter", "Digit", "NonZeroDigit", "Token", "Integer", "ID", "ReservedWord", 
		"Operator", "Delimiter", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Token", "Integer", "ID", "ReservedWord", "Operator", "Delimiter", 
		"WhiteSpace"
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
		case 9:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u00b8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\5\2\31\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5$\n\5\3\6"+
		"\3\6\3\6\7\6)\n\6\f\6\16\6,\13\6\5\6.\n\6\3\7\3\7\3\7\7\7\63\n\7\f\7\16"+
		"\7\66\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u009f\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00ae\n\t\3\n\3\n\3\13\6\13\u00b3\n\13\r\13\16\13\u00b4\3\13\3\13\2"+
		"\2\f\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\3\2\b\4\2C\\c|\3\2\62"+
		";\3\2\63;\6\2,-//\61\61>>\13\2*+..\60\60==??]]__}}\177\177\5\2\13\f\17"+
		"\17\"\"\u00d6\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\30\3\2\2\2\5\32\3\2\2\2\7\34\3\2\2"+
		"\2\t#\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\u009e\3\2\2\2\21\u00ad\3\2\2\2"+
		"\23\u00af\3\2\2\2\25\u00b2\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2\2\31\4\3"+
		"\2\2\2\32\33\t\3\2\2\33\6\3\2\2\2\34\35\t\4\2\2\35\b\3\2\2\2\36$\5\21"+
		"\t\2\37$\5\23\n\2 $\5\17\b\2!$\5\13\6\2\"$\5\r\7\2#\36\3\2\2\2#\37\3\2"+
		"\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\n\3\2\2\2%.\7\62\2\2&*\5\7\4\2\'"+
		")\5\5\3\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,*\3\2\2\2"+
		"-%\3\2\2\2-&\3\2\2\2.\f\3\2\2\2/\64\5\3\2\2\60\63\5\3\2\2\61\63\5\5\3"+
		"\2\62\60\3\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2"+
		"\2\65\16\3\2\2\2\66\64\3\2\2\2\678\7e\2\289\7n\2\29:\7c\2\2:;\7u\2\2;"+
		"\u009f\7u\2\2<=\7r\2\2=>\7w\2\2>?\7d\2\2?@\7n\2\2@A\7k\2\2A\u009f\7e\2"+
		"\2BC\7u\2\2CD\7v\2\2DE\7c\2\2EF\7v\2\2FG\7k\2\2G\u009f\7e\2\2HI\7g\2\2"+
		"IJ\7z\2\2JK\7v\2\2KL\7g\2\2LM\7p\2\2MN\7f\2\2N\u009f\7u\2\2OP\7x\2\2P"+
		"Q\7q\2\2QR\7k\2\2R\u009f\7f\2\2ST\7k\2\2TU\7p\2\2U\u009f\7v\2\2VW\7d\2"+
		"\2WX\7q\2\2XY\7q\2\2YZ\7n\2\2Z[\7g\2\2[\\\7c\2\2\\\u009f\7p\2\2]^\7k\2"+
		"\2^\u009f\7h\2\2_`\7g\2\2`a\7n\2\2ab\7u\2\2b\u009f\7g\2\2cd\7y\2\2de\7"+
		"j\2\2ef\7k\2\2fg\7n\2\2g\u009f\7g\2\2hi\7t\2\2ij\7g\2\2jk\7v\2\2kl\7w"+
		"\2\2lm\7t\2\2m\u009f\7p\2\2no\7p\2\2op\7w\2\2pq\7n\2\2q\u009f\7n\2\2r"+
		"s\7v\2\2st\7t\2\2tu\7w\2\2u\u009f\7g\2\2vw\7h\2\2wx\7c\2\2xy\7n\2\2yz"+
		"\7u\2\2z\u009f\7g\2\2{|\7v\2\2|}\7j\2\2}~\7k\2\2~\u009f\7u\2\2\177\u0080"+
		"\7p\2\2\u0080\u0081\7g\2\2\u0081\u009f\7y\2\2\u0082\u0083\7U\2\2\u0083"+
		"\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2"+
		"\u0087\u009f\7i\2\2\u0088\u0089\7o\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u009f\7p\2\2\u008c\u008d\7U\2\2\u008d\u008e\7{\2\2\u008e"+
		"\u008f\7u\2\2\u008f\u0090\7v\2\2\u0090\u0091\7g\2\2\u0091\u0092\7o\2\2"+
		"\u0092\u0093\7\60\2\2\u0093\u0094\7q\2\2\u0094\u0095\7w\2\2\u0095\u0096"+
		"\7v\2\2\u0096\u0097\7\60\2\2\u0097\u0098\7r\2\2\u0098\u0099\7t\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\u009d\7n\2\2"+
		"\u009d\u009f\7p\2\2\u009e\67\3\2\2\2\u009e<\3\2\2\2\u009eB\3\2\2\2\u009e"+
		"H\3\2\2\2\u009eO\3\2\2\2\u009eS\3\2\2\2\u009eV\3\2\2\2\u009e]\3\2\2\2"+
		"\u009e_\3\2\2\2\u009ec\3\2\2\2\u009eh\3\2\2\2\u009en\3\2\2\2\u009er\3"+
		"\2\2\2\u009ev\3\2\2\2\u009e{\3\2\2\2\u009e\177\3\2\2\2\u009e\u0082\3\2"+
		"\2\2\u009e\u0088\3\2\2\2\u009e\u008c\3\2\2\2\u009f\20\3\2\2\2\u00a0\u00ae"+
		"\t\5\2\2\u00a1\u00a2\7>\2\2\u00a2\u00ae\7?\2\2\u00a3\u00a4\7@\2\2\u00a4"+
		"\u00ae\7?\2\2\u00a5\u00ae\7@\2\2\u00a6\u00a7\7?\2\2\u00a7\u00ae\7?\2\2"+
		"\u00a8\u00a9\7(\2\2\u00a9\u00ae\7(\2\2\u00aa\u00ab\7~\2\2\u00ab\u00ae"+
		"\7~\2\2\u00ac\u00ae\7#\2\2\u00ad\u00a0\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ad"+
		"\u00a3\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a8\3\2"+
		"\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\22\3\2\2\2\u00af\u00b0"+
		"\t\6\2\2\u00b0\24\3\2\2\2\u00b1\u00b3\t\7\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\b\13\2\2\u00b7\26\3\2\2\2\f\2\30#*-\62\64\u009e\u00ad"+
		"\u00b4\3\3\13\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}