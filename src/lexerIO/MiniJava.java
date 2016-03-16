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
		Comment=1, WhiteSpace=2, Integer=3, ID=4, ReservedWord=5, Operator=6, 
		Delimiter=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Letter", "Digit", "NonZeroDigit", "Comment", "WhiteSpace", "Integer", 
		"ID", "ReservedWord", "Operator", "Delimiter"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Comment", "WhiteSpace", "Integer", "ID", "ReservedWord", "Operator", 
		"Delimiter"
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
		case 3:
			Comment_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			WhiteSpace_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Comment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u00c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\5\2\31\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5#\n\5\f\5\16\5"+
		"&\13\5\3\5\3\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\5\3\5\5\5\63\n\5\3\5"+
		"\3\5\3\6\6\68\n\6\r\6\16\69\3\6\3\6\3\7\3\7\3\7\7\7A\n\7\f\7\16\7D\13"+
		"\7\5\7F\n\7\3\b\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b7\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c6\n\n\3\13\3\13\3-\2\f\3"+
		"\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\3\2\t\4\2C\\c|\3\2\62;\3\2"+
		"\63;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\6\2,-//\61\61>>\13\2*+..\60\60="+
		"=??]]__}}\177\177\u00e6\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\30\3\2\2\2\5\32\3\2\2\2"+
		"\7\34\3\2\2\2\t\62\3\2\2\2\13\67\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21\u00b6"+
		"\3\2\2\2\23\u00c5\3\2\2\2\25\u00c7\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2\2"+
		"\31\4\3\2\2\2\32\33\t\3\2\2\33\6\3\2\2\2\34\35\t\4\2\2\35\b\3\2\2\2\36"+
		"\37\7\61\2\2\37 \7\61\2\2 $\3\2\2\2!#\n\5\2\2\"!\3\2\2\2#&\3\2\2\2$\""+
		"\3\2\2\2$%\3\2\2\2%\63\3\2\2\2&$\3\2\2\2\'(\7\61\2\2()\7,\2\2)-\3\2\2"+
		"\2*,\13\2\2\2+*\3\2\2\2,/\3\2\2\2-.\3\2\2\2-+\3\2\2\2.\60\3\2\2\2/-\3"+
		"\2\2\2\60\61\7,\2\2\61\63\7\61\2\2\62\36\3\2\2\2\62\'\3\2\2\2\63\64\3"+
		"\2\2\2\64\65\b\5\2\2\65\n\3\2\2\2\668\t\6\2\2\67\66\3\2\2\289\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\b\6\3\2<\f\3\2\2\2=F\7\62\2\2>B\5\7"+
		"\4\2?A\5\5\3\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DB\3\2"+
		"\2\2E=\3\2\2\2E>\3\2\2\2F\16\3\2\2\2GL\5\3\2\2HK\5\3\2\2IK\5\5\3\2JH\3"+
		"\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\20\3\2\2\2NL\3\2\2\2O"+
		"P\7e\2\2PQ\7n\2\2QR\7c\2\2RS\7u\2\2S\u00b7\7u\2\2TU\7r\2\2UV\7w\2\2VW"+
		"\7d\2\2WX\7n\2\2XY\7k\2\2Y\u00b7\7e\2\2Z[\7u\2\2[\\\7v\2\2\\]\7c\2\2]"+
		"^\7v\2\2^_\7k\2\2_\u00b7\7e\2\2`a\7g\2\2ab\7z\2\2bc\7v\2\2cd\7g\2\2de"+
		"\7p\2\2ef\7f\2\2f\u00b7\7u\2\2gh\7x\2\2hi\7q\2\2ij\7k\2\2j\u00b7\7f\2"+
		"\2kl\7k\2\2lm\7p\2\2m\u00b7\7v\2\2no\7d\2\2op\7q\2\2pq\7q\2\2qr\7n\2\2"+
		"rs\7g\2\2st\7c\2\2t\u00b7\7p\2\2uv\7k\2\2v\u00b7\7h\2\2wx\7g\2\2xy\7n"+
		"\2\2yz\7u\2\2z\u00b7\7g\2\2{|\7y\2\2|}\7j\2\2}~\7k\2\2~\177\7n\2\2\177"+
		"\u00b7\7g\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2"+
		"\u0083\u0084\7w\2\2\u0084\u0085\7t\2\2\u0085\u00b7\7p\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u0088\7w\2\2\u0088\u0089\7n\2\2\u0089\u00b7\7n\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d\7w\2\2\u008d\u00b7\7g\2\2"+
		"\u008e\u008f\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092"+
		"\7u\2\2\u0092\u00b7\7g\2\2\u0093\u0094\7v\2\2\u0094\u0095\7j\2\2\u0095"+
		"\u0096\7k\2\2\u0096\u00b7\7u\2\2\u0097\u0098\7p\2\2\u0098\u0099\7g\2\2"+
		"\u0099\u00b7\7y\2\2\u009a\u009b\7U\2\2\u009b\u009c\7v\2\2\u009c\u009d"+
		"\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00b7\7i\2\2\u00a0"+
		"\u00a1\7o\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7k\2\2\u00a3\u00b7\7p\2\2"+
		"\u00a4\u00a5\7U\2\2\u00a5\u00a6\7{\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ab\7\60\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7\60\2"+
		"\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3"+
		"\7p\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b7\7p\2\2\u00b6"+
		"O\3\2\2\2\u00b6T\3\2\2\2\u00b6Z\3\2\2\2\u00b6`\3\2\2\2\u00b6g\3\2\2\2"+
		"\u00b6k\3\2\2\2\u00b6n\3\2\2\2\u00b6u\3\2\2\2\u00b6w\3\2\2\2\u00b6{\3"+
		"\2\2\2\u00b6\u0080\3\2\2\2\u00b6\u0086\3\2\2\2\u00b6\u008a\3\2\2\2\u00b6"+
		"\u008e\3\2\2\2\u00b6\u0093\3\2\2\2\u00b6\u0097\3\2\2\2\u00b6\u009a\3\2"+
		"\2\2\u00b6\u00a0\3\2\2\2\u00b6\u00a4\3\2\2\2\u00b7\22\3\2\2\2\u00b8\u00c6"+
		"\t\7\2\2\u00b9\u00ba\7>\2\2\u00ba\u00c6\7?\2\2\u00bb\u00bc\7@\2\2\u00bc"+
		"\u00c6\7?\2\2\u00bd\u00c6\7@\2\2\u00be\u00bf\7?\2\2\u00bf\u00c6\7?\2\2"+
		"\u00c0\u00c1\7(\2\2\u00c1\u00c6\7(\2\2\u00c2\u00c3\7~\2\2\u00c3\u00c6"+
		"\7~\2\2\u00c4\u00c6\7#\2\2\u00c5\u00b8\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5"+
		"\u00bb\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00c0\3\2"+
		"\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\24\3\2\2\2\u00c7\u00c8"+
		"\t\b\2\2\u00c8\26\3\2\2\2\16\2\30$-\629BEJL\u00b6\u00c5\4\3\5\2\3\6\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}