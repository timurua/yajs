// Generated from /Users/timur/yajs/core/src/main/java/org/yajs/grammar/YAJS.g4 by ANTLR 4.5.3
package org.yajs.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAJSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, IMPORT_KEYWORD=12, TYPE_KEYWORD=13, COLON=14, REQUIRED=15, 
		QUOTED_STRING=16, UNQUOTED_STRING=17, NUMBER=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "IMPORT_KEYWORD", "TYPE_KEYWORD", "COLON", "REQUIRED", 
		"QUOTED_STRING", "UNQUOTED_STRING", "ESC", "UNICODE", "HEX", "NUMBER", 
		"INT", "EXP", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'integer'", "'float'", "'string'", "'boolean'", "'null'", 
		"'{'", "','", "'}'", "'['", "']'", "'import'", "'type'", "':'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IMPORT_KEYWORD", "TYPE_KEYWORD", "COLON", "REQUIRED", "QUOTED_STRING", 
		"UNQUOTED_STRING", "NUMBER", "WS"
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


	public YAJSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "YAJS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\7\21u\n\21\f\21\16\21x\13\21\3\21\3\21\3\22\6\22}\n\22\r\22\16\22~\3"+
		"\23\3\23\3\23\5\23\u0084\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\5\26\u008f\n\26\3\26\3\26\3\26\6\26\u0094\n\26\r\26\16\26\u0095"+
		"\3\26\5\26\u0099\n\26\3\26\5\26\u009c\n\26\3\26\3\26\3\26\3\26\5\26\u00a2"+
		"\n\26\3\26\5\26\u00a5\n\26\3\27\3\27\3\27\7\27\u00aa\n\27\f\27\16\27\u00ad"+
		"\13\27\5\27\u00af\n\27\3\30\3\30\5\30\u00b3\n\30\3\30\3\30\3\31\6\31\u00b8"+
		"\n\31\r\31\16\31\u00b9\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\2)\2+\24-\2"+
		"/\2\61\25\3\2\13\4\2$$^^\6\2\62;C\\aac|\n\2$$\61\61^^ddhhppttvv\5\2\62"+
		";CHch\3\2\62;\3\2\63;\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\u00c6\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2+\3"+
		"\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7=\3\2\2\2\tC\3\2\2\2\13"+
		"J\3\2\2\2\rR\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27"+
		"_\3\2\2\2\31a\3\2\2\2\33h\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#|"+
		"\3\2\2\2%\u0080\3\2\2\2\'\u0085\3\2\2\2)\u008b\3\2\2\2+\u00a4\3\2\2\2"+
		"-\u00ae\3\2\2\2/\u00b0\3\2\2\2\61\u00b7\3\2\2\2\63\64\7=\2\2\64\4\3\2"+
		"\2\2\65\66\7k\2\2\66\67\7p\2\2\678\7v\2\289\7g\2\29:\7i\2\2:;\7g\2\2;"+
		"<\7t\2\2<\6\3\2\2\2=>\7h\2\2>?\7n\2\2?@\7q\2\2@A\7c\2\2AB\7v\2\2B\b\3"+
		"\2\2\2CD\7u\2\2DE\7v\2\2EF\7t\2\2FG\7k\2\2GH\7p\2\2HI\7i\2\2I\n\3\2\2"+
		"\2JK\7d\2\2KL\7q\2\2LM\7q\2\2MN\7n\2\2NO\7g\2\2OP\7c\2\2PQ\7p\2\2Q\f\3"+
		"\2\2\2RS\7p\2\2ST\7w\2\2TU\7n\2\2UV\7n\2\2V\16\3\2\2\2WX\7}\2\2X\20\3"+
		"\2\2\2YZ\7.\2\2Z\22\3\2\2\2[\\\7\177\2\2\\\24\3\2\2\2]^\7]\2\2^\26\3\2"+
		"\2\2_`\7_\2\2`\30\3\2\2\2ab\7k\2\2bc\7o\2\2cd\7r\2\2de\7q\2\2ef\7t\2\2"+
		"fg\7v\2\2g\32\3\2\2\2hi\7v\2\2ij\7{\2\2jk\7r\2\2kl\7g\2\2l\34\3\2\2\2"+
		"mn\7<\2\2n\36\3\2\2\2op\7#\2\2p \3\2\2\2qv\7$\2\2ru\5%\23\2su\n\2\2\2"+
		"tr\3\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2"+
		"yz\7$\2\2z\"\3\2\2\2{}\t\3\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2"+
		"\2\2\177$\3\2\2\2\u0080\u0083\7^\2\2\u0081\u0084\t\4\2\2\u0082\u0084\5"+
		"\'\24\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084&\3\2\2\2\u0085\u0086"+
		"\7w\2\2\u0086\u0087\5)\25\2\u0087\u0088\5)\25\2\u0088\u0089\5)\25\2\u0089"+
		"\u008a\5)\25\2\u008a(\3\2\2\2\u008b\u008c\t\5\2\2\u008c*\3\2\2\2\u008d"+
		"\u008f\7/\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\5-\27\2\u0091\u0093\7\60\2\2\u0092\u0094\t\6\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5/\30\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u00a5\3\2\2\2\u009a\u009c\7/\2\2\u009b\u009a\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\5-\27\2\u009e"+
		"\u009f\5/\30\2\u009f\u00a5\3\2\2\2\u00a0\u00a2\7/\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\5-\27\2\u00a4"+
		"\u008e\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5,\3\2\2\2"+
		"\u00a6\u00af\7\62\2\2\u00a7\u00ab\t\7\2\2\u00a8\u00aa\t\6\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00a7\3\2"+
		"\2\2\u00af.\3\2\2\2\u00b0\u00b2\t\b\2\2\u00b1\u00b3\t\t\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\5-\27\2\u00b5"+
		"\60\3\2\2\2\u00b6\u00b8\t\n\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2"+
		"\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\b\31\2\2\u00bc\62\3\2\2\2\21\2tv~\u0083\u008e\u0095\u0098\u009b\u00a1"+
		"\u00a4\u00ab\u00ae\u00b2\u00b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}