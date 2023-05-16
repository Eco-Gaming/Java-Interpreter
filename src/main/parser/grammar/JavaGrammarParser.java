package main.parser.grammar;// Generated from /home/pc/codestuff/Java-Interpreter/grammar/JavaGrammar.g4 by ANTLR 4.12.0
import main.parser.Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KLAMMERAUF=1, KLAMMERZU=2, BLOCKAUF=3, BLOCKZU=4, WENN=5, SONST=6, SOLANGE=7, 
		ZUWEISUNGSOP=8, SEMIKOLON=9, VERGLEICHSOP=10, STRICHOPERATOR=11, PUNKTOPERATOR=12, 
		TYP=13, NAME=14, ZAHL=15, WHITESPACE=16;
	public static final int
		RULE_methode = 0, RULE_block = 1, RULE_anwfolg = 2, RULE_anweisung = 3, 
		RULE_zuweisung = 4, RULE_bedanw = 5, RULE_solangeanw = 6, RULE_vergleich = 7, 
		RULE_ausdruck = 8, RULE_term = 9, RULE_faktor = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"methode", "block", "anwfolg", "anweisung", "zuweisung", "bedanw", "solangeanw", 
			"vergleich", "ausdruck", "term", "faktor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'if'", "'else'", "'while'", "'='", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KLAMMERAUF", "KLAMMERZU", "BLOCKAUF", "BLOCKZU", "WENN", "SONST", 
			"SOLANGE", "ZUWEISUNGSOP", "SEMIKOLON", "VERGLEICHSOP", "STRICHOPERATOR", 
			"PUNKTOPERATOR", "TYP", "NAME", "ZAHL", "WHITESPACE"
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
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodeContext extends ParserRuleContext {
		public TerminalNode TYP() { return getToken(JavaGrammarParser.TYP, 0); }
		public TerminalNode NAME() { return getToken(JavaGrammarParser.NAME, 0); }
		public TerminalNode KLAMMERAUF() { return getToken(JavaGrammarParser.KLAMMERAUF, 0); }
		public TerminalNode KLAMMERZU() { return getToken(JavaGrammarParser.KLAMMERZU, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaGrammarParser.EOF, 0); }
		public MethodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMethode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMethode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitMethode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodeContext methode() throws RecognitionException {
		MethodeContext _localctx = new MethodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_methode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(TYP);
			setState(23);
			match(NAME);
			setState(24);
			match(KLAMMERAUF);
			setState(25);
			match(KLAMMERZU);
			setState(26);
			block();
			setState(27);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BLOCKAUF() { return getToken(JavaGrammarParser.BLOCKAUF, 0); }
		public AnwfolgContext anwfolg() {
			return getRuleContext(AnwfolgContext.class,0);
		}
		public TerminalNode BLOCKZU() { return getToken(JavaGrammarParser.BLOCKZU, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(BLOCKAUF);
				setState(30);
				anwfolg();
				setState(31);
				match(BLOCKZU);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(BLOCKAUF);
				setState(34);
				match(BLOCKZU);
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
	public static class AnwfolgContext extends ParserRuleContext {
		public List<AnweisungContext> anweisung() {
			return getRuleContexts(AnweisungContext.class);
		}
		public AnweisungContext anweisung(int i) {
			return getRuleContext(AnweisungContext.class,i);
		}
		public AnwfolgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anwfolg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAnwfolg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAnwfolg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitAnwfolg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnwfolgContext anwfolg() throws RecognitionException {
		AnwfolgContext _localctx = new AnwfolgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anwfolg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				anweisung();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16552L) != 0) );
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
	public static class AnweisungContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ZuweisungContext zuweisung() {
			return getRuleContext(ZuweisungContext.class,0);
		}
		public BedanwContext bedanw() {
			return getRuleContext(BedanwContext.class,0);
		}
		public SolangeanwContext solangeanw() {
			return getRuleContext(SolangeanwContext.class,0);
		}
		public AnweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAnweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAnweisung(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitAnweisung(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnweisungContext anweisung() throws RecognitionException {
		AnweisungContext _localctx = new AnweisungContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_anweisung);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCKAUF:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				block();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				zuweisung();
				}
				break;
			case WENN:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				bedanw();
				}
				break;
			case SOLANGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				solangeanw();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ZuweisungContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JavaGrammarParser.NAME, 0); }
		public TerminalNode ZUWEISUNGSOP() { return getToken(JavaGrammarParser.ZUWEISUNGSOP, 0); }
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public TerminalNode SEMIKOLON() { return getToken(JavaGrammarParser.SEMIKOLON, 0); }
		public ZuweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zuweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterZuweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitZuweisung(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitZuweisung(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZuweisungContext zuweisung() throws RecognitionException {
		ZuweisungContext _localctx = new ZuweisungContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_zuweisung);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(NAME);
			setState(49);
			match(ZUWEISUNGSOP);
			setState(50);
			ausdruck();
			setState(51);
			match(SEMIKOLON);
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
	public static class BedanwContext extends ParserRuleContext {
		public TerminalNode WENN() { return getToken(JavaGrammarParser.WENN, 0); }
		public TerminalNode KLAMMERAUF() { return getToken(JavaGrammarParser.KLAMMERAUF, 0); }
		public VergleichContext vergleich() {
			return getRuleContext(VergleichContext.class,0);
		}
		public TerminalNode KLAMMERZU() { return getToken(JavaGrammarParser.KLAMMERZU, 0); }
		public List<AnweisungContext> anweisung() {
			return getRuleContexts(AnweisungContext.class);
		}
		public AnweisungContext anweisung(int i) {
			return getRuleContext(AnweisungContext.class,i);
		}
		public TerminalNode SONST() { return getToken(JavaGrammarParser.SONST, 0); }
		public BedanwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bedanw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBedanw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBedanw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitBedanw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BedanwContext bedanw() throws RecognitionException {
		BedanwContext _localctx = new BedanwContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bedanw);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(WENN);
				setState(54);
				match(KLAMMERAUF);
				setState(55);
				vergleich();
				setState(56);
				match(KLAMMERZU);
				setState(57);
				anweisung();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(WENN);
				setState(60);
				match(KLAMMERAUF);
				setState(61);
				vergleich();
				setState(62);
				match(KLAMMERZU);
				setState(63);
				anweisung();
				setState(64);
				match(SONST);
				setState(65);
				anweisung();
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
	public static class SolangeanwContext extends ParserRuleContext {
		public TerminalNode SOLANGE() { return getToken(JavaGrammarParser.SOLANGE, 0); }
		public TerminalNode KLAMMERAUF() { return getToken(JavaGrammarParser.KLAMMERAUF, 0); }
		public VergleichContext vergleich() {
			return getRuleContext(VergleichContext.class,0);
		}
		public TerminalNode KLAMMERZU() { return getToken(JavaGrammarParser.KLAMMERZU, 0); }
		public AnweisungContext anweisung() {
			return getRuleContext(AnweisungContext.class,0);
		}
		public SolangeanwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solangeanw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterSolangeanw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitSolangeanw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitSolangeanw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolangeanwContext solangeanw() throws RecognitionException {
		SolangeanwContext _localctx = new SolangeanwContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_solangeanw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(SOLANGE);
			setState(70);
			match(KLAMMERAUF);
			setState(71);
			vergleich();
			setState(72);
			match(KLAMMERZU);
			setState(73);
			anweisung();
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
	public static class VergleichContext extends ParserRuleContext {
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public TerminalNode VERGLEICHSOP() { return getToken(JavaGrammarParser.VERGLEICHSOP, 0); }
		public VergleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVergleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVergleich(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitVergleich(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VergleichContext vergleich() throws RecognitionException {
		VergleichContext _localctx = new VergleichContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vergleich);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			ausdruck();
			setState(76);
			match(VERGLEICHSOP);
			setState(77);
			ausdruck();
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
	public static class AusdruckContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode STRICHOPERATOR() { return getToken(JavaGrammarParser.STRICHOPERATOR, 0); }
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public AusdruckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ausdruck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAusdruck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAusdruck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitAusdruck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AusdruckContext ausdruck() throws RecognitionException {
		AusdruckContext _localctx = new AusdruckContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ausdruck);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				term();
				setState(81);
				match(STRICHOPERATOR);
				setState(82);
				ausdruck();
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
	public static class TermContext extends ParserRuleContext {
		public FaktorContext faktor() {
			return getRuleContext(FaktorContext.class,0);
		}
		public TerminalNode PUNKTOPERATOR() { return getToken(JavaGrammarParser.PUNKTOPERATOR, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				faktor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				faktor();
				setState(88);
				match(PUNKTOPERATOR);
				setState(89);
				term();
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
	public static class FaktorContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JavaGrammarParser.NAME, 0); }
		public TerminalNode ZAHL() { return getToken(JavaGrammarParser.ZAHL, 0); }
		public TerminalNode KLAMMERAUF() { return getToken(JavaGrammarParser.KLAMMERAUF, 0); }
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public TerminalNode KLAMMERZU() { return getToken(JavaGrammarParser.KLAMMERZU, 0); }
		public FaktorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faktor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFaktor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFaktor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitFaktor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaktorContext faktor() throws RecognitionException {
		FaktorContext _localctx = new FaktorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_faktor);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(NAME);
				}
				break;
			case ZAHL:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(ZAHL);
				}
				break;
			case KLAMMERAUF:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(KLAMMERAUF);
				setState(96);
				ausdruck();
				setState(97);
				match(KLAMMERZU);
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
		"\u0004\u0001\u0010f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001$\b"+
		"\u0001\u0001\u0002\u0004\u0002\'\b\u0002\u000b\u0002\f\u0002(\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003/\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005D\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bU\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\\\b\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\nd\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000d\u0000\u0016\u0001\u0000"+
		"\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000"+
		"\u0006.\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\nC\u0001\u0000"+
		"\u0000\u0000\fE\u0001\u0000\u0000\u0000\u000eK\u0001\u0000\u0000\u0000"+
		"\u0010T\u0001\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014c"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0005\r\u0000\u0000\u0017\u0018\u0005"+
		"\u000e\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001a\u0005"+
		"\u0002\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001c\u0005"+
		"\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"\u0003\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0005\u0004"+
		"\u0000\u0000 $\u0001\u0000\u0000\u0000!\"\u0005\u0003\u0000\u0000\"$\u0005"+
		"\u0004\u0000\u0000#\u001d\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000$\u0003\u0001\u0000\u0000\u0000%\'\u0003\u0006\u0003\u0000&%\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)\u0005\u0001\u0000\u0000\u0000*/\u0003\u0002"+
		"\u0001\u0000+/\u0003\b\u0004\u0000,/\u0003\n\u0005\u0000-/\u0003\f\u0006"+
		"\u0000.*\u0001\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0007\u0001\u0000\u0000\u0000"+
		"01\u0005\u000e\u0000\u000012\u0005\b\u0000\u000023\u0003\u0010\b\u0000"+
		"34\u0005\t\u0000\u00004\t\u0001\u0000\u0000\u000056\u0005\u0005\u0000"+
		"\u000067\u0005\u0001\u0000\u000078\u0003\u000e\u0007\u000089\u0005\u0002"+
		"\u0000\u00009:\u0003\u0006\u0003\u0000:D\u0001\u0000\u0000\u0000;<\u0005"+
		"\u0005\u0000\u0000<=\u0005\u0001\u0000\u0000=>\u0003\u000e\u0007\u0000"+
		">?\u0005\u0002\u0000\u0000?@\u0003\u0006\u0003\u0000@A\u0005\u0006\u0000"+
		"\u0000AB\u0003\u0006\u0003\u0000BD\u0001\u0000\u0000\u0000C5\u0001\u0000"+
		"\u0000\u0000C;\u0001\u0000\u0000\u0000D\u000b\u0001\u0000\u0000\u0000"+
		"EF\u0005\u0007\u0000\u0000FG\u0005\u0001\u0000\u0000GH\u0003\u000e\u0007"+
		"\u0000HI\u0005\u0002\u0000\u0000IJ\u0003\u0006\u0003\u0000J\r\u0001\u0000"+
		"\u0000\u0000KL\u0003\u0010\b\u0000LM\u0005\n\u0000\u0000MN\u0003\u0010"+
		"\b\u0000N\u000f\u0001\u0000\u0000\u0000OU\u0003\u0012\t\u0000PQ\u0003"+
		"\u0012\t\u0000QR\u0005\u000b\u0000\u0000RS\u0003\u0010\b\u0000SU\u0001"+
		"\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000"+
		"U\u0011\u0001\u0000\u0000\u0000V\\\u0003\u0014\n\u0000WX\u0003\u0014\n"+
		"\u0000XY\u0005\f\u0000\u0000YZ\u0003\u0012\t\u0000Z\\\u0001\u0000\u0000"+
		"\u0000[V\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000\\\u0013\u0001"+
		"\u0000\u0000\u0000]d\u0005\u000e\u0000\u0000^d\u0005\u000f\u0000\u0000"+
		"_`\u0005\u0001\u0000\u0000`a\u0003\u0010\b\u0000ab\u0005\u0002\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000c]\u0001\u0000\u0000\u0000c^\u0001\u0000\u0000"+
		"\u0000c_\u0001\u0000\u0000\u0000d\u0015\u0001\u0000\u0000\u0000\u0007"+
		"#(.CT[c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}