// Generated from MiniJava.g by ANTLR 4.5.2

    package parser;

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
		Program=1, ClassDecl=2, ClassBody=3, Member=4, Method=5, Argument=6, Field=7, 
		Type=8, Statement=9, Expression=10, Expression7=11, Expression6=12, Expression5=13, 
		Expression4=14, Expression3=15, Expression2=16, Expression1=17, Terminal=18, 
		Integer=19, ID=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Program", "ClassDecl", "ClassBody", "Member", "Method", "Argument", "Field", 
		"Type", "Statement", "Expression", "Expression7", "Expression6", "Expression5", 
		"Expression4", "Expression3", "Expression2", "Expression1", "Terminal", 
		"Integer", "ID", "Letter", "Digit", "NonZeroDigit"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Program", "ClassDecl", "ClassBody", "Member", "Method", "Argument", 
		"Field", "Type", "Statement", "Expression", "Expression7", "Expression6", 
		"Expression5", "Expression4", "Expression3", "Expression2", "Expression1", 
		"Terminal", "Integer", "ID"
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u014d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\6\2\63\n\2\r\2\16\2\64\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3"+
		"\4\3\4\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6e\n\6\f\6\16\6h\13\6\5\6j\n\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6"+
		"r\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u0094\n\n\f\n\16\n\u0097\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00a7\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00d8\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00df\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00e6\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00ed\n\r\3\r"+
		"\5\r\u00f0\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f8\n\16\3\16\5\16"+
		"\u00fb\n\16\3\17\3\17\3\17\5\17\u0100\n\17\3\20\3\20\3\20\5\20\u0105\n"+
		"\20\3\21\5\21\u0108\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0112\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0133\n\23\3\24\3\24\3\24\7\24\u0138\n"+
		"\24\f\24\16\24\u013b\13\24\5\24\u013d\n\24\3\25\3\25\3\25\7\25\u0142\n"+
		"\25\f\25\16\25\u0145\13\25\3\26\5\26\u0148\n\26\3\27\3\27\3\30\3\30\2"+
		"\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\3\2\t\4\2>>@@\4\2--//\4\2,,\61"+
		"\61\4\2##//\4\2C\\c|\3\2\62;\3\2\63;\u0171\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\3\62\3\2\2\2\5\66\3\2\2\2\7J\3\2\2\2\tU\3\2\2\2\13W\3\2\2"+
		"\2\ru\3\2\2\2\17x\3\2\2\2\21\u008a\3\2\2\2\23\u00d7\3\2\2\2\25\u00d9\3"+
		"\2\2\2\27\u00e0\3\2\2\2\31\u00e7\3\2\2\2\33\u00f1\3\2\2\2\35\u00fc\3\2"+
		"\2\2\37\u0101\3\2\2\2!\u0107\3\2\2\2#\u010b\3\2\2\2%\u0132\3\2\2\2\'\u013c"+
		"\3\2\2\2)\u013e\3\2\2\2+\u0147\3\2\2\2-\u0149\3\2\2\2/\u014b\3\2\2\2\61"+
		"\63\5\5\3\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\4\3\2\2\2\66\67\7e\2\2\678\7n\2\289\7c\2\29:\7u\2\2:;\7u\2\2;<\3\2\2"+
		"\2<F\5)\25\2=>\7g\2\2>?\7z\2\2?@\7v\2\2@A\7g\2\2AB\7p\2\2BC\7f\2\2CD\7"+
		"u\2\2DE\3\2\2\2EG\5)\25\2F=\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\5\7\4\2I\6\3"+
		"\2\2\2JN\7}\2\2KM\5\t\5\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3"+
		"\2\2\2PN\3\2\2\2QR\7\177\2\2R\b\3\2\2\2SV\5\13\6\2TV\5\17\b\2US\3\2\2"+
		"\2UT\3\2\2\2V\n\3\2\2\2WX\7r\2\2XY\7w\2\2YZ\7d\2\2Z[\7n\2\2[\\\7k\2\2"+
		"\\]\7e\2\2]^\3\2\2\2^_\5\21\t\2_`\5)\25\2`i\7*\2\2af\5\r\7\2bc\7.\2\2"+
		"ce\5\r\7\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2"+
		"ia\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7+\2\2lp\7}\2\2mo\5\23\n\2nm\3\2\2\2"+
		"or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\177\2\2t\f\3\2"+
		"\2\2uv\5\21\t\2vw\5)\25\2w\16\3\2\2\2xy\5\21\t\2yz\5)\25\2z\20\3\2\2\2"+
		"{|\7k\2\2|}\7p\2\2}\u008b\7v\2\2~\177\7d\2\2\177\u0080\7q\2\2\u0080\u0081"+
		"\7q\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u008b\7p\2\2\u0085\u0086\7x\2\2\u0086\u0087\7q\2\2\u0087\u0088\7k\2\2"+
		"\u0088\u008b\7f\2\2\u0089\u008b\5)\25\2\u008a{\3\2\2\2\u008a~\3\2\2\2"+
		"\u008a\u0085\3\2\2\2\u008a\u0089\3\2\2\2\u008b\22\3\2\2\2\u008c\u008d"+
		"\5\21\t\2\u008d\u008e\5)\25\2\u008e\u008f\7?\2\2\u008f\u0090\5\25\13\2"+
		"\u0090\u00d8\3\2\2\2\u0091\u0095\7}\2\2\u0092\u0094\5\23\n\2\u0093\u0092"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u00d8\7\177\2\2\u0099\u009a\7"+
		"k\2\2\u009a\u009b\7h\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7*\2\2\u009d"+
		"\u009e\5\25\13\2\u009e\u009f\7+\2\2\u009f\u00a6\5\23\n\2\u00a0\u00a1\7"+
		"g\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a7\5\23\n\2\u00a6\u00a0\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\u00d8\3\2\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab"+
		"\7k\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\7*\2\2\u00af\u00b0\5\25\13\2\u00b0\u00b1\7+\2\2\u00b1\u00b2\5\23"+
		"\n\2\u00b2\u00d8\3\2\2\2\u00b3\u00b4\7U\2\2\u00b4\u00b5\7{\2\2\u00b5\u00b6"+
		"\7u\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7o\2\2\u00b9"+
		"\u00ba\7\60\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7v\2"+
		"\2\u00bd\u00be\7\60\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7n\2\2\u00c4"+
		"\u00c5\7p\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7*\2\2\u00c7\u00c8\5\25"+
		"\13\2\u00c8\u00c9\7+\2\2\u00c9\u00ca\7=\2\2\u00ca\u00d8\3\2\2\2\u00cb"+
		"\u00cc\5)\25\2\u00cc\u00cd\7?\2\2\u00cd\u00ce\5\25\13\2\u00ce\u00d8\3"+
		"\2\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"\u00d3\7w\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\3\2\2"+
		"\2\u00d6\u00d8\5\25\13\2\u00d7\u008c\3\2\2\2\u00d7\u0091\3\2\2\2\u00d7"+
		"\u0099\3\2\2\2\u00d7\u00a8\3\2\2\2\u00d7\u00b3\3\2\2\2\u00d7\u00cb\3\2"+
		"\2\2\u00d7\u00cf\3\2\2\2\u00d8\24\3\2\2\2\u00d9\u00de\5\27\f\2\u00da\u00db"+
		"\7~\2\2\u00db\u00dc\7~\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\5\25\13\2\u00de"+
		"\u00da\3\2\2\2\u00de\u00df\3\2\2\2\u00df\26\3\2\2\2\u00e0\u00e5\5\31\r"+
		"\2\u00e1\u00e2\7(\2\2\u00e2\u00e3\7(\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6"+
		"\5\27\f\2\u00e5\u00e1\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\30\3\2\2\2\u00e7"+
		"\u00ef\5\33\16\2\u00e8\u00e9\7?\2\2\u00e9\u00ed\7?\2\2\u00ea\u00eb\7#"+
		"\2\2\u00eb\u00ed\7?\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\5\31\r\2\u00ef\u00ec\3\2\2\2\u00ef\u00f0\3"+
		"\2\2\2\u00f0\32\3\2\2\2\u00f1\u00fa\5\35\17\2\u00f2\u00f8\t\2\2\2\u00f3"+
		"\u00f4\7>\2\2\u00f4\u00f8\7?\2\2\u00f5\u00f6\7@\2\2\u00f6\u00f8\7?\2\2"+
		"\u00f7\u00f2\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fb\5\33\16\2\u00fa\u00f7\3\2\2\2\u00fa\u00fb\3\2\2\2"+
		"\u00fb\34\3\2\2\2\u00fc\u00ff\5\37\20\2\u00fd\u00fe\t\3\2\2\u00fe\u0100"+
		"\5\35\17\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\36\3\2\2\2\u0101"+
		"\u0104\5!\21\2\u0102\u0103\t\4\2\2\u0103\u0105\5\37\20\2\u0104\u0102\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105 \3\2\2\2\u0106\u0108\t\5\2\2\u0107\u0106"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\5#\22\2\u010a"+
		"\"\3\2\2\2\u010b\u0111\5%\23\2\u010c\u010d\7\60\2\2\u010d\u010e\5)\25"+
		"\2\u010e\u010f\7*\2\2\u010f\u0110\7+\2\2\u0110\u0112\3\2\2\2\u0111\u010c"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112$\3\2\2\2\u0113\u0114\7p\2\2\u0114\u0115"+
		"\7g\2\2\u0115\u0116\7y\2\2\u0116\u0117\3\2\2\2\u0117\u0118\5)\25\2\u0118"+
		"\u0119\7*\2\2\u0119\u011a\7+\2\2\u011a\u0133\3\2\2\2\u011b\u011c\7v\2"+
		"\2\u011c\u011d\7j\2\2\u011d\u011e\7k\2\2\u011e\u0133\7u\2\2\u011f\u0120"+
		"\7p\2\2\u0120\u0121\7w\2\2\u0121\u0122\7n\2\2\u0122\u0133\7n\2\2\u0123"+
		"\u0124\7v\2\2\u0124\u0125\7t\2\2\u0125\u0126\7w\2\2\u0126\u0133\7g\2\2"+
		"\u0127\u0128\7h\2\2\u0128\u0129\7c\2\2\u0129\u012a\7n\2\2\u012a\u012b"+
		"\7u\2\2\u012b\u0133\7g\2\2\u012c\u012d\7*\2\2\u012d\u012e\5\25\13\2\u012e"+
		"\u012f\7+\2\2\u012f\u0133\3\2\2\2\u0130\u0133\5)\25\2\u0131\u0133\5\'"+
		"\24\2\u0132\u0113\3\2\2\2\u0132\u011b\3\2\2\2\u0132\u011f\3\2\2\2\u0132"+
		"\u0123\3\2\2\2\u0132\u0127\3\2\2\2\u0132\u012c\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0131\3\2\2\2\u0133&\3\2\2\2\u0134\u013d\7\62\2\2\u0135\u0139"+
		"\5/\30\2\u0136\u0138\5-\27\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013c\u0134\3\2\2\2\u013c\u0135\3\2\2\2\u013d(\3\2\2\2\u013e\u0143"+
		"\5+\26\2\u013f\u0142\5+\26\2\u0140\u0142\5-\27\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144*\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\t\6\2\2\u0147\u0146"+
		"\3\2\2\2\u0148,\3\2\2\2\u0149\u014a\t\7\2\2\u014a.\3\2\2\2\u014b\u014c"+
		"\t\b\2\2\u014c\60\3\2\2\2\36\2\64FNUfip\u008a\u0095\u00a6\u00d7\u00de"+
		"\u00e5\u00ec\u00ef\u00f7\u00fa\u00ff\u0104\u0107\u0111\u0132\u0139\u013c"+
		"\u0141\u0143\u0147\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}