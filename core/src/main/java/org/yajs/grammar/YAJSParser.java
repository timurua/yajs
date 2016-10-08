// Generated from /Users/timur/yajs/core/src/main/java/org/yajs/grammar/YAJS.g4 by ANTLR 4.5.3
package org.yajs.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAJSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, IMPORT_KEYWORD=12, TYPE_KEYWORD=13, COLON=14, REQUIRED=15, 
		QUOTED_STRING=16, UNQUOTED_STRING=17, NUMBER=18, WS=19;
	public static final int
		RULE_schema = 0, RULE_importStatement = 1, RULE_filename = 2, RULE_typeDeclaration = 3, 
		RULE_type = 4, RULE_typeName = 5, RULE_object = 6, RULE_pair = 7, RULE_array = 8, 
		RULE_string = 9;
	public static final String[] ruleNames = {
		"schema", "importStatement", "filename", "typeDeclaration", "type", "typeName", 
		"object", "pair", "array", "string"
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

	@Override
	public String getGrammarFileName() { return "YAJS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YAJSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SchemaContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).enterSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).exitSchema(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT_KEYWORD) {
				{
				{
				setState(20);
				importStatement();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE_KEYWORD) {
				{
				{
				setState(26);
				typeDeclaration();
				}
				}
				setState(31);
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT_KEYWORD() { return getToken(YAJSParser.IMPORT_KEYWORD, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(IMPORT_KEYWORD);
			setState(33);
			filename();
			setState(34);
			match(T__0);
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

	public static class FilenameContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).exitFilename(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			string();
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE_KEYWORD() { return getToken(YAJSParser.TYPE_KEYWORD, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(TYPE_KEYWORD);
			setState(39);
			typeName();
			setState(40);
			type();
			setState(41);
			match(T__0);
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(50);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(T__5);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				array();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				object();
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_STRING() { return getToken(YAJSParser.UNQUOTED_STRING, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(UNQUOTED_STRING);
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

	public static class ObjectContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_object);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__6);
				setState(55);
				pair();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(56);
					match(T__7);
					setState(57);
					pair();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(T__6);
				setState(66);
				match(T__8);
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

	public static class PairContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode COLON() { return getToken(YAJSParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode REQUIRED() { return getToken(YAJSParser.REQUIRED, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			string();
			setState(71);
			_la = _input.LA(1);
			if (_la==REQUIRED) {
				{
				setState(70);
				match(REQUIRED);
				}
			}

			setState(73);
			match(COLON);
			setState(74);
			type();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__9);
				setState(77);
				type();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(78);
					match(T__7);
					setState(79);
					type();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__9);
				setState(88);
				match(T__10);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(YAJSParser.QUOTED_STRING, 0); }
		public TerminalNode UNQUOTED_STRING() { return getToken(YAJSParser.UNQUOTED_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAJSListener ) ((YAJSListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==UNQUOTED_STRING) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\65"+
		"\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\3\b\3\b\3\b\3\b\5"+
		"\bF\n\b\3\t\3\t\5\tJ\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nS\n\n\f\n\16\n"+
		"V\13\n\3\n\3\n\3\n\3\n\5\n\\\n\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20"+
		"\22\24\2\3\3\2\22\23b\2\31\3\2\2\2\4\"\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n"+
		"\64\3\2\2\2\f\66\3\2\2\2\16E\3\2\2\2\20G\3\2\2\2\22[\3\2\2\2\24]\3\2\2"+
		"\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2"+
		"\2\32\37\3\2\2\2\33\31\3\2\2\2\34\36\5\b\5\2\35\34\3\2\2\2\36!\3\2\2\2"+
		"\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37\3\2\2\2\"#\7\16\2\2#$\5\6\4"+
		"\2$%\7\3\2\2%\5\3\2\2\2&\'\5\24\13\2\'\7\3\2\2\2()\7\17\2\2)*\5\f\7\2"+
		"*+\5\n\6\2+,\7\3\2\2,\t\3\2\2\2-\65\7\4\2\2.\65\7\5\2\2/\65\7\6\2\2\60"+
		"\65\7\7\2\2\61\65\7\b\2\2\62\65\5\22\n\2\63\65\5\16\b\2\64-\3\2\2\2\64"+
		".\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63"+
		"\3\2\2\2\65\13\3\2\2\2\66\67\7\23\2\2\67\r\3\2\2\289\7\t\2\29>\5\20\t"+
		"\2:;\7\n\2\2;=\5\20\t\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2"+
		"\2\2@>\3\2\2\2AB\7\13\2\2BF\3\2\2\2CD\7\t\2\2DF\7\13\2\2E8\3\2\2\2EC\3"+
		"\2\2\2F\17\3\2\2\2GI\5\24\13\2HJ\7\21\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2"+
		"\2KL\7\20\2\2LM\5\n\6\2M\21\3\2\2\2NO\7\f\2\2OT\5\n\6\2PQ\7\n\2\2QS\5"+
		"\n\6\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7"+
		"\r\2\2X\\\3\2\2\2YZ\7\f\2\2Z\\\7\r\2\2[N\3\2\2\2[Y\3\2\2\2\\\23\3\2\2"+
		"\2]^\t\2\2\2^\25\3\2\2\2\n\31\37\64>EIT[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}