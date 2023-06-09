package org.example.javainterpreter.parser.grammar;// Generated from C:/code/Java-Interpreter/grammar\JavaGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KLAMMERAUF=1, KLAMMERZU=2, BLOCKAUF=3, BLOCKZU=4, WENN=5, SONST=6, SOLANGE=7, 
		ZUWEISUNGSOP=8, SEMIKOLON=9, VERGLEICHSOP=10, STRICHOPERATOR=11, PUNKTOPERATOR=12, 
		TYP=13, NAME=14, ZAHL=15, WHITESPACE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KLAMMERAUF", "KLAMMERZU", "BLOCKAUF", "BLOCKZU", "WENN", "SONST", "SOLANGE", 
			"ZUWEISUNGSOP", "SEMIKOLON", "VERGLEICHSOP", "STRICHOPERATOR", "PUNKTOPERATOR", 
			"TYP", "NAME", "ZAHL", "WHITESPACE"
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


	public JavaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010j\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tE\b\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fX\b\f\u0001"+
		"\r\u0004\r[\b\r\u000b\r\f\r\\\u0001\u000e\u0004\u000e`\b\u000e\u000b\u000e"+
		"\f\u000ea\u0001\u000f\u0004\u000fe\b\u000f\u000b\u000f\f\u000ff\u0001"+
		"\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000"+
		"\u0004\u0002\u0000<<>>\u0002\u0000++--\u0002\u0000**//\u0003\u0000\t\n"+
		"\r\r  r\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001"+
		"!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005%\u0001"+
		"\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000\t)\u0001\u0000\u0000"+
		"\u0000\u000b,\u0001\u0000\u0000\u0000\r1\u0001\u0000\u0000\u0000\u000f"+
		"7\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000\u0000\u0013D\u0001"+
		"\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017H\u0001\u0000\u0000"+
		"\u0000\u0019W\u0001\u0000\u0000\u0000\u001bZ\u0001\u0000\u0000\u0000\u001d"+
		"_\u0001\u0000\u0000\u0000\u001fd\u0001\u0000\u0000\u0000!\"\u0005(\u0000"+
		"\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005)\u0000\u0000$\u0004\u0001"+
		"\u0000\u0000\u0000%&\u0005{\u0000\u0000&\u0006\u0001\u0000\u0000\u0000"+
		"\'(\u0005}\u0000\u0000(\b\u0001\u0000\u0000\u0000)*\u0005i\u0000\u0000"+
		"*+\u0005f\u0000\u0000+\n\u0001\u0000\u0000\u0000,-\u0005e\u0000\u0000"+
		"-.\u0005l\u0000\u0000./\u0005s\u0000\u0000/0\u0005e\u0000\u00000\f\u0001"+
		"\u0000\u0000\u000012\u0005w\u0000\u000023\u0005h\u0000\u000034\u0005i"+
		"\u0000\u000045\u0005l\u0000\u000056\u0005e\u0000\u00006\u000e\u0001\u0000"+
		"\u0000\u000078\u0005=\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005"+
		";\u0000\u0000:\u0012\u0001\u0000\u0000\u0000;<\u0005=\u0000\u0000<E\u0005"+
		"=\u0000\u0000=>\u0005!\u0000\u0000>E\u0005=\u0000\u0000?E\u0007\u0000"+
		"\u0000\u0000@A\u0005<\u0000\u0000AE\u0005=\u0000\u0000BC\u0005>\u0000"+
		"\u0000CE\u0005=\u0000\u0000D;\u0001\u0000\u0000\u0000D=\u0001\u0000\u0000"+
		"\u0000D?\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000E\u0014\u0001\u0000\u0000\u0000FG\u0007\u0001\u0000\u0000"+
		"G\u0016\u0001\u0000\u0000\u0000HI\u0007\u0002\u0000\u0000I\u0018\u0001"+
		"\u0000\u0000\u0000JK\u0005v\u0000\u0000KL\u0005o\u0000\u0000LM\u0005i"+
		"\u0000\u0000MX\u0005d\u0000\u0000NO\u0005S\u0000\u0000OP\u0005t\u0000"+
		"\u0000PQ\u0005r\u0000\u0000QR\u0005i\u0000\u0000RS\u0005n\u0000\u0000"+
		"SX\u0005g\u0000\u0000TU\u0005i\u0000\u0000UV\u0005n\u0000\u0000VX\u0005"+
		"t\u0000\u0000WJ\u0001\u0000\u0000\u0000WN\u0001\u0000\u0000\u0000WT\u0001"+
		"\u0000\u0000\u0000X\u001a\u0001\u0000\u0000\u0000Y[\u0002az\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]\u001c\u0001\u0000\u0000\u0000^`\u000209\u0000"+
		"_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000b\u001e\u0001\u0000\u0000\u0000ce\u0007"+
		"\u0003\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hi\u0006\u000f\u0000\u0000i \u0001\u0000\u0000\u0000\u0006\u0000"+
		"DW\\af\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}