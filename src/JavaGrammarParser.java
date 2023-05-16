// Generated from /home/pc/codestuff/Java-Interpreter/grammar/JavaGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, TYP=20, NAME=21, ZAHL=22;
	public static final int
		RULE_main = 0, RULE_methode = 1, RULE_block = 2, RULE_anwfolg = 3, RULE_anweisung = 4, 
		RULE_zuweisung = 5, RULE_bedanw = 6, RULE_solangeanw = 7, RULE_vergleich = 8, 
		RULE_ausdruck = 9, RULE_term = 10, RULE_faktor = 11, RULE_vergleichsop = 12, 
		RULE_strichoperator = 13, RULE_punktoperator = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "methode", "block", "anwfolg", "anweisung", "zuweisung", "bedanw", 
			"solangeanw", "vergleich", "ausdruck", "term", "faktor", "vergleichsop", 
			"strichoperator", "punktoperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'='", "';'", "'if'", "'else'", "'while'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "TYP", "NAME", "ZAHL"
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
	public static class MainContext extends ParserRuleContext {
		public MethodeContext methode() {
			return getRuleContext(MethodeContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			methode();
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
	public static class MethodeContext extends ParserRuleContext {
		public TerminalNode TYP() { return getToken(JavaGrammarParser.TYP, 0); }
		public TerminalNode NAME() { return getToken(JavaGrammarParser.NAME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 2, RULE_methode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(TYP);
			setState(33);
			match(NAME);
			setState(34);
			match(T__0);
			setState(35);
			match(T__1);
			setState(36);
			block();
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
		public AnwfolgContext anwfolg() {
			return getRuleContext(AnwfolgContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__2);
			setState(39);
			anwfolg();
			setState(40);
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
		enterRule(_localctx, 6, RULE_anwfolg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				anweisung();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2097800L) != 0) );
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
		enterRule(_localctx, 8, RULE_anweisung);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				block();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				zuweisung();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				bedanw();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
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
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_zuweisung);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(NAME);
			setState(54);
			match(T__4);
			setState(55);
			ausdruck();
			setState(56);
			match(T__5);
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
		public VergleichContext vergleich() {
			return getRuleContext(VergleichContext.class,0);
		}
		public List<AnweisungContext> anweisung() {
			return getRuleContexts(AnweisungContext.class);
		}
		public AnweisungContext anweisung(int i) {
			return getRuleContext(AnweisungContext.class,i);
		}
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
		enterRule(_localctx, 12, RULE_bedanw);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(T__6);
				setState(59);
				match(T__0);
				setState(60);
				vergleich();
				setState(61);
				match(T__1);
				setState(62);
				anweisung();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(T__6);
				setState(65);
				match(T__0);
				setState(66);
				vergleich();
				setState(67);
				match(T__1);
				setState(68);
				anweisung();
				setState(69);
				match(T__7);
				setState(70);
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
		public VergleichContext vergleich() {
			return getRuleContext(VergleichContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_solangeanw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__8);
			setState(75);
			match(T__0);
			setState(76);
			vergleich();
			setState(77);
			match(T__1);
			setState(78);
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
		public VergleichsopContext vergleichsop() {
			return getRuleContext(VergleichsopContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_vergleich);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			ausdruck();
			setState(81);
			vergleichsop();
			setState(82);
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
		public StrichoperatorContext strichoperator() {
			return getRuleContext(StrichoperatorContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_ausdruck);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				term();
				setState(86);
				strichoperator();
				setState(87);
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
		public PunktoperatorContext punktoperator() {
			return getRuleContext(PunktoperatorContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				faktor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				faktor();
				setState(93);
				punktoperator();
				setState(94);
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
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_faktor);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(NAME);
				}
				break;
			case ZAHL:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(ZAHL);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__0);
				setState(101);
				ausdruck();
				setState(102);
				match(T__1);
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
	public static class VergleichsopContext extends ParserRuleContext {
		public VergleichsopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergleichsop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVergleichsop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVergleichsop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitVergleichsop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VergleichsopContext vergleichsop() throws RecognitionException {
		VergleichsopContext _localctx = new VergleichsopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_vergleichsop);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(106);
					match(T__9);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(109);
					match(T__10);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(112);
					match(T__11);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(115);
					match(T__12);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(118);
					match(T__13);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(121);
					match(T__14);
					}
				}

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
	public static class StrichoperatorContext extends ParserRuleContext {
		public StrichoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strichoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterStrichoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitStrichoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitStrichoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrichoperatorContext strichoperator() throws RecognitionException {
		StrichoperatorContext _localctx = new StrichoperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_strichoperator);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(126);
					match(T__15);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(129);
					match(T__16);
					}
				}

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
	public static class PunktoperatorContext extends ParserRuleContext {
		public PunktoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punktoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterPunktoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitPunktoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitPunktoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PunktoperatorContext punktoperator() throws RecognitionException {
		PunktoperatorContext _localctx = new PunktoperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_punktoperator);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(134);
					match(T__17);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(137);
					match(T__18);
					}
				}

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

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u008f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004"+
		"\u0003,\b\u0003\u000b\u0003\f\u0003-\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u00044\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006I\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\tZ\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\na\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000bi\b\u000b\u0001\f\u0003\fl\b\f\u0001\f\u0003\fo\b\f\u0001\f\u0003"+
		"\fr\b\f\u0001\f\u0003\fu\b\f\u0001\f\u0003\fx\b\f\u0001\f\u0003\f{\b\f"+
		"\u0003\f}\b\f\u0001\r\u0003\r\u0080\b\r\u0001\r\u0003\r\u0083\b\r\u0003"+
		"\r\u0085\b\r\u0001\u000e\u0003\u000e\u0088\b\u000e\u0001\u000e\u0003\u000e"+
		"\u008b\b\u000e\u0003\u000e\u008d\b\u000e\u0001\u000e\u0000\u0000\u000f"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u0000\u0000\u0099\u0000\u001e\u0001\u0000\u0000\u0000\u0002 \u0001"+
		"\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006+\u0001\u0000\u0000"+
		"\u0000\b3\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000\u0000\fH\u0001"+
		"\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010P\u0001\u0000\u0000"+
		"\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014`\u0001\u0000\u0000\u0000\u0016"+
		"h\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000\u0000\u001a\u0084\u0001"+
		"\u0000\u0000\u0000\u001c\u008c\u0001\u0000\u0000\u0000\u001e\u001f\u0003"+
		"\u0002\u0001\u0000\u001f\u0001\u0001\u0000\u0000\u0000 !\u0005\u0014\u0000"+
		"\u0000!\"\u0005\u0015\u0000\u0000\"#\u0005\u0001\u0000\u0000#$\u0005\u0002"+
		"\u0000\u0000$%\u0003\u0004\u0002\u0000%\u0003\u0001\u0000\u0000\u0000"+
		"&\'\u0005\u0003\u0000\u0000\'(\u0003\u0006\u0003\u0000()\u0005\u0004\u0000"+
		"\u0000)\u0005\u0001\u0000\u0000\u0000*,\u0003\b\u0004\u0000+*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.\u0007\u0001\u0000\u0000\u0000/4\u0003\u0004\u0002"+
		"\u000004\u0003\n\u0005\u000014\u0003\f\u0006\u000024\u0003\u000e\u0007"+
		"\u00003/\u0001\u0000\u0000\u000030\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000032\u0001\u0000\u0000\u00004\t\u0001\u0000\u0000\u000056\u0005"+
		"\u0015\u0000\u000067\u0005\u0005\u0000\u000078\u0003\u0012\t\u000089\u0005"+
		"\u0006\u0000\u00009\u000b\u0001\u0000\u0000\u0000:;\u0005\u0007\u0000"+
		"\u0000;<\u0005\u0001\u0000\u0000<=\u0003\u0010\b\u0000=>\u0005\u0002\u0000"+
		"\u0000>?\u0003\b\u0004\u0000?I\u0001\u0000\u0000\u0000@A\u0005\u0007\u0000"+
		"\u0000AB\u0005\u0001\u0000\u0000BC\u0003\u0010\b\u0000CD\u0005\u0002\u0000"+
		"\u0000DE\u0003\b\u0004\u0000EF\u0005\b\u0000\u0000FG\u0003\b\u0004\u0000"+
		"GI\u0001\u0000\u0000\u0000H:\u0001\u0000\u0000\u0000H@\u0001\u0000\u0000"+
		"\u0000I\r\u0001\u0000\u0000\u0000JK\u0005\t\u0000\u0000KL\u0005\u0001"+
		"\u0000\u0000LM\u0003\u0010\b\u0000MN\u0005\u0002\u0000\u0000NO\u0003\b"+
		"\u0004\u0000O\u000f\u0001\u0000\u0000\u0000PQ\u0003\u0012\t\u0000QR\u0003"+
		"\u0018\f\u0000RS\u0003\u0012\t\u0000S\u0011\u0001\u0000\u0000\u0000TZ"+
		"\u0003\u0014\n\u0000UV\u0003\u0014\n\u0000VW\u0003\u001a\r\u0000WX\u0003"+
		"\u0012\t\u0000XZ\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000YU\u0001"+
		"\u0000\u0000\u0000Z\u0013\u0001\u0000\u0000\u0000[a\u0003\u0016\u000b"+
		"\u0000\\]\u0003\u0016\u000b\u0000]^\u0003\u001c\u000e\u0000^_\u0003\u0014"+
		"\n\u0000_a\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000`\\\u0001"+
		"\u0000\u0000\u0000a\u0015\u0001\u0000\u0000\u0000bi\u0005\u0015\u0000"+
		"\u0000ci\u0005\u0016\u0000\u0000de\u0005\u0001\u0000\u0000ef\u0003\u0012"+
		"\t\u0000fg\u0005\u0002\u0000\u0000gi\u0001\u0000\u0000\u0000hb\u0001\u0000"+
		"\u0000\u0000hc\u0001\u0000\u0000\u0000hd\u0001\u0000\u0000\u0000i\u0017"+
		"\u0001\u0000\u0000\u0000jl\u0005\n\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000l}\u0001\u0000\u0000\u0000mo\u0005\u000b\u0000"+
		"\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o}\u0001\u0000"+
		"\u0000\u0000pr\u0005\f\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000r}\u0001\u0000\u0000\u0000su\u0005\r\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000u}\u0001\u0000\u0000\u0000vx\u0005"+
		"\u000e\u0000\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x}\u0001\u0000\u0000\u0000y{\u0005\u000f\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|k\u0001\u0000"+
		"\u0000\u0000|n\u0001\u0000\u0000\u0000|q\u0001\u0000\u0000\u0000|t\u0001"+
		"\u0000\u0000\u0000|w\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"}\u0019\u0001\u0000\u0000\u0000~\u0080\u0005\u0010\u0000\u0000\u007f~"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0085"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0005\u0011\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085"+
		"\u0001\u0000\u0000\u0000\u0084\u007f\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u001b\u0001\u0000\u0000\u0000\u0086\u0088"+
		"\u0005\u0012\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u008d\u0001\u0000\u0000\u0000\u0089\u008b"+
		"\u0005\u0013\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u0087"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u001d"+
		"\u0001\u0000\u0000\u0000\u0013-3HY`hknqtwz|\u007f\u0082\u0084\u0087\u008a"+
		"\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}