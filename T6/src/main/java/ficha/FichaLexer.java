package ficha;// Generated from C:/Users/felip/Desktop/Docs_Yuya/UFSCar/COMPL/T6-Compiladores/T6/src/main/antlr4.ficha/Ficha.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FichaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOME=1, CLASSE_LITERAL=2, NIVEL=3, CARACTERISTICAS_LITERAL=4, ATRIBUTOS_LITERAL=5, 
		LVLUP=6, GUERREIRO=7, MAGO=8, CLERIGO=9, LADINO=10, BARDO=11, FORCA=12, 
		DESTREZA=13, CONSTITUICAO=14, SABEDORIA=15, INTELIGENCIA=16, CARISMA=17, 
		PRECISAO=18, ARMADURA=19, INICIATIVA=20, MOVIMENTO=21, PV=22, STRING=23, 
		NUM=24, RANDOM=25, COMMA=26, COLON=27, SEMI=28, LBRACE=29, RBRACE=30, 
		WS=31, COMENTARIO=32, COMENTARIO_ABERTO=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NOME", "CLASSE_LITERAL", "NIVEL", "CARACTERISTICAS_LITERAL", "ATRIBUTOS_LITERAL", 
			"LVLUP", "GUERREIRO", "MAGO", "CLERIGO", "LADINO", "BARDO", "FORCA", 
			"DESTREZA", "CONSTITUICAO", "SABEDORIA", "INTELIGENCIA", "CARISMA", "PRECISAO", 
			"ARMADURA", "INICIATIVA", "MOVIMENTO", "PV", "STRING", "NUM", "RANDOM", 
			"COMMA", "COLON", "SEMI", "LBRACE", "RBRACE", "WS", "COMENTARIO", "COMENTARIO_ABERTO", 
			"ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Nome'", "'Classe'", "'Nivel'", "'Caracteristicas'", "'Atributos'", 
			"'LVLUP'", "'Guerreiro'", "'Mago'", "'Clerigo'", "'Ladino'", "'Bardo'", 
			"'Forca'", "'Destreza'", "'Constituicao'", "'Sabedoria'", "'Inteligencia'", 
			"'Carisma'", "'Precisao'", "'Armadura'", "'Iniciativa'", "'Movimento'", 
			"'PV'", null, null, null, "','", "':'", "';'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOME", "CLASSE_LITERAL", "NIVEL", "CARACTERISTICAS_LITERAL", "ATRIBUTOS_LITERAL", 
			"LVLUP", "GUERREIRO", "MAGO", "CLERIGO", "LADINO", "BARDO", "FORCA", 
			"DESTREZA", "CONSTITUICAO", "SABEDORIA", "INTELIGENCIA", "CARISMA", "PRECISAO", 
			"ARMADURA", "INICIATIVA", "MOVIMENTO", "PV", "STRING", "NUM", "RANDOM", 
			"COMMA", "COLON", "SEMI", "LBRACE", "RBRACE", "WS", "COMENTARIO", "COMENTARIO_ABERTO"
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


	public FichaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ficha.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 31:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000!\u0156\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0103\b\u0016\n\u0016\f\u0016\u0106\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0004\u0017\u010b\b\u0017\u000b\u0017\f\u0017"+
		"\u010c\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u011b\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0004\u001e\u0128\b\u001e\u000b\u001e\f\u001e\u0129"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0132\b\u001f\n\u001f\f\u001f\u0135\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u013b\b\u001f\u0001\u001f\u0003"+
		"\u001f\u013e\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0005 \u0146\b \n \f \u0149\t \u0001 \u0003 \u014c\b \u0001 \u0003 "+
		"\u014f\b \u0001!\u0001!\u0001!\u0001!\u0003!\u0155\b!\u0000\u0000\"\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\u0000\u0001"+
		"\u0000\u0004\u0001\u0000\"\"\u0001\u000009\u0003\u0000\t\n\r\r  \u0004"+
		"\u0000\n\n\r\r{{}}\u015f\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0001E\u0001\u0000\u0000\u0000\u0003"+
		"J\u0001\u0000\u0000\u0000\u0005Q\u0001\u0000\u0000\u0000\u0007W\u0001"+
		"\u0000\u0000\u0000\tg\u0001\u0000\u0000\u0000\u000bq\u0001\u0000\u0000"+
		"\u0000\rw\u0001\u0000\u0000\u0000\u000f\u0081\u0001\u0000\u0000\u0000"+
		"\u0011\u0086\u0001\u0000\u0000\u0000\u0013\u008e\u0001\u0000\u0000\u0000"+
		"\u0015\u0095\u0001\u0000\u0000\u0000\u0017\u009b\u0001\u0000\u0000\u0000"+
		"\u0019\u00a1\u0001\u0000\u0000\u0000\u001b\u00aa\u0001\u0000\u0000\u0000"+
		"\u001d\u00b7\u0001\u0000\u0000\u0000\u001f\u00c1\u0001\u0000\u0000\u0000"+
		"!\u00ce\u0001\u0000\u0000\u0000#\u00d6\u0001\u0000\u0000\u0000%\u00df"+
		"\u0001\u0000\u0000\u0000\'\u00e8\u0001\u0000\u0000\u0000)\u00f3\u0001"+
		"\u0000\u0000\u0000+\u00fd\u0001\u0000\u0000\u0000-\u0100\u0001\u0000\u0000"+
		"\u0000/\u010a\u0001\u0000\u0000\u00001\u011a\u0001\u0000\u0000\u00003"+
		"\u011c\u0001\u0000\u0000\u00005\u011e\u0001\u0000\u0000\u00007\u0120\u0001"+
		"\u0000\u0000\u00009\u0122\u0001\u0000\u0000\u0000;\u0124\u0001\u0000\u0000"+
		"\u0000=\u0127\u0001\u0000\u0000\u0000?\u012d\u0001\u0000\u0000\u0000A"+
		"\u0141\u0001\u0000\u0000\u0000C\u0154\u0001\u0000\u0000\u0000EF\u0005"+
		"N\u0000\u0000FG\u0005o\u0000\u0000GH\u0005m\u0000\u0000HI\u0005e\u0000"+
		"\u0000I\u0002\u0001\u0000\u0000\u0000JK\u0005C\u0000\u0000KL\u0005l\u0000"+
		"\u0000LM\u0005a\u0000\u0000MN\u0005s\u0000\u0000NO\u0005s\u0000\u0000"+
		"OP\u0005e\u0000\u0000P\u0004\u0001\u0000\u0000\u0000QR\u0005N\u0000\u0000"+
		"RS\u0005i\u0000\u0000ST\u0005v\u0000\u0000TU\u0005e\u0000\u0000UV\u0005"+
		"l\u0000\u0000V\u0006\u0001\u0000\u0000\u0000WX\u0005C\u0000\u0000XY\u0005"+
		"a\u0000\u0000YZ\u0005r\u0000\u0000Z[\u0005a\u0000\u0000[\\\u0005c\u0000"+
		"\u0000\\]\u0005t\u0000\u0000]^\u0005e\u0000\u0000^_\u0005r\u0000\u0000"+
		"_`\u0005i\u0000\u0000`a\u0005s\u0000\u0000ab\u0005t\u0000\u0000bc\u0005"+
		"i\u0000\u0000cd\u0005c\u0000\u0000de\u0005a\u0000\u0000ef\u0005s\u0000"+
		"\u0000f\b\u0001\u0000\u0000\u0000gh\u0005A\u0000\u0000hi\u0005t\u0000"+
		"\u0000ij\u0005r\u0000\u0000jk\u0005i\u0000\u0000kl\u0005b\u0000\u0000"+
		"lm\u0005u\u0000\u0000mn\u0005t\u0000\u0000no\u0005o\u0000\u0000op\u0005"+
		"s\u0000\u0000p\n\u0001\u0000\u0000\u0000qr\u0005L\u0000\u0000rs\u0005"+
		"V\u0000\u0000st\u0005L\u0000\u0000tu\u0005U\u0000\u0000uv\u0005P\u0000"+
		"\u0000v\f\u0001\u0000\u0000\u0000wx\u0005G\u0000\u0000xy\u0005u\u0000"+
		"\u0000yz\u0005e\u0000\u0000z{\u0005r\u0000\u0000{|\u0005r\u0000\u0000"+
		"|}\u0005e\u0000\u0000}~\u0005i\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f"+
		"\u0080\u0005o\u0000\u0000\u0080\u000e\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005M\u0000\u0000\u0082\u0083\u0005a\u0000\u0000\u0083\u0084\u0005g"+
		"\u0000\u0000\u0084\u0085\u0005o\u0000\u0000\u0085\u0010\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005C\u0000\u0000\u0087\u0088\u0005l\u0000\u0000\u0088"+
		"\u0089\u0005e\u0000\u0000\u0089\u008a\u0005r\u0000\u0000\u008a\u008b\u0005"+
		"i\u0000\u0000\u008b\u008c\u0005g\u0000\u0000\u008c\u008d\u0005o\u0000"+
		"\u0000\u008d\u0012\u0001\u0000\u0000\u0000\u008e\u008f\u0005L\u0000\u0000"+
		"\u008f\u0090\u0005a\u0000\u0000\u0090\u0091\u0005d\u0000\u0000\u0091\u0092"+
		"\u0005i\u0000\u0000\u0092\u0093\u0005n\u0000\u0000\u0093\u0094\u0005o"+
		"\u0000\u0000\u0094\u0014\u0001\u0000\u0000\u0000\u0095\u0096\u0005B\u0000"+
		"\u0000\u0096\u0097\u0005a\u0000\u0000\u0097\u0098\u0005r\u0000\u0000\u0098"+
		"\u0099\u0005d\u0000\u0000\u0099\u009a\u0005o\u0000\u0000\u009a\u0016\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005F\u0000\u0000\u009c\u009d\u0005o\u0000"+
		"\u0000\u009d\u009e\u0005r\u0000\u0000\u009e\u009f\u0005c\u0000\u0000\u009f"+
		"\u00a0\u0005a\u0000\u0000\u00a0\u0018\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0005D\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3\u00a4\u0005s"+
		"\u0000\u0000\u00a4\u00a5\u0005t\u0000\u0000\u00a5\u00a6\u0005r\u0000\u0000"+
		"\u00a6\u00a7\u0005e\u0000\u0000\u00a7\u00a8\u0005z\u0000\u0000\u00a8\u00a9"+
		"\u0005a\u0000\u0000\u00a9\u001a\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"C\u0000\u0000\u00ab\u00ac\u0005o\u0000\u0000\u00ac\u00ad\u0005n\u0000"+
		"\u0000\u00ad\u00ae\u0005s\u0000\u0000\u00ae\u00af\u0005t\u0000\u0000\u00af"+
		"\u00b0\u0005i\u0000\u0000\u00b0\u00b1\u0005t\u0000\u0000\u00b1\u00b2\u0005"+
		"u\u0000\u0000\u00b2\u00b3\u0005i\u0000\u0000\u00b3\u00b4\u0005c\u0000"+
		"\u0000\u00b4\u00b5\u0005a\u0000\u0000\u00b5\u00b6\u0005o\u0000\u0000\u00b6"+
		"\u001c\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005S\u0000\u0000\u00b8\u00b9"+
		"\u0005a\u0000\u0000\u00b9\u00ba\u0005b\u0000\u0000\u00ba\u00bb\u0005e"+
		"\u0000\u0000\u00bb\u00bc\u0005d\u0000\u0000\u00bc\u00bd\u0005o\u0000\u0000"+
		"\u00bd\u00be\u0005r\u0000\u0000\u00be\u00bf\u0005i\u0000\u0000\u00bf\u00c0"+
		"\u0005a\u0000\u0000\u00c0\u001e\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005"+
		"I\u0000\u0000\u00c2\u00c3\u0005n\u0000\u0000\u00c3\u00c4\u0005t\u0000"+
		"\u0000\u00c4\u00c5\u0005e\u0000\u0000\u00c5\u00c6\u0005l\u0000\u0000\u00c6"+
		"\u00c7\u0005i\u0000\u0000\u00c7\u00c8\u0005g\u0000\u0000\u00c8\u00c9\u0005"+
		"e\u0000\u0000\u00c9\u00ca\u0005n\u0000\u0000\u00ca\u00cb\u0005c\u0000"+
		"\u0000\u00cb\u00cc\u0005i\u0000\u0000\u00cc\u00cd\u0005a\u0000\u0000\u00cd"+
		" \u0001\u0000\u0000\u0000\u00ce\u00cf\u0005C\u0000\u0000\u00cf\u00d0\u0005"+
		"a\u0000\u0000\u00d0\u00d1\u0005r\u0000\u0000\u00d1\u00d2\u0005i\u0000"+
		"\u0000\u00d2\u00d3\u0005s\u0000\u0000\u00d3\u00d4\u0005m\u0000\u0000\u00d4"+
		"\u00d5\u0005a\u0000\u0000\u00d5\"\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005P\u0000\u0000\u00d7\u00d8\u0005r\u0000\u0000\u00d8\u00d9\u0005e"+
		"\u0000\u0000\u00d9\u00da\u0005c\u0000\u0000\u00da\u00db\u0005i\u0000\u0000"+
		"\u00db\u00dc\u0005s\u0000\u0000\u00dc\u00dd\u0005a\u0000\u0000\u00dd\u00de"+
		"\u0005o\u0000\u0000\u00de$\u0001\u0000\u0000\u0000\u00df\u00e0\u0005A"+
		"\u0000\u0000\u00e0\u00e1\u0005r\u0000\u0000\u00e1\u00e2\u0005m\u0000\u0000"+
		"\u00e2\u00e3\u0005a\u0000\u0000\u00e3\u00e4\u0005d\u0000\u0000\u00e4\u00e5"+
		"\u0005u\u0000\u0000\u00e5\u00e6\u0005r\u0000\u0000\u00e6\u00e7\u0005a"+
		"\u0000\u0000\u00e7&\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005I\u0000\u0000"+
		"\u00e9\u00ea\u0005n\u0000\u0000\u00ea\u00eb\u0005i\u0000\u0000\u00eb\u00ec"+
		"\u0005c\u0000\u0000\u00ec\u00ed\u0005i\u0000\u0000\u00ed\u00ee\u0005a"+
		"\u0000\u0000\u00ee\u00ef\u0005t\u0000\u0000\u00ef\u00f0\u0005i\u0000\u0000"+
		"\u00f0\u00f1\u0005v\u0000\u0000\u00f1\u00f2\u0005a\u0000\u0000\u00f2("+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005M\u0000\u0000\u00f4\u00f5\u0005"+
		"o\u0000\u0000\u00f5\u00f6\u0005v\u0000\u0000\u00f6\u00f7\u0005i\u0000"+
		"\u0000\u00f7\u00f8\u0005m\u0000\u0000\u00f8\u00f9\u0005e\u0000\u0000\u00f9"+
		"\u00fa\u0005n\u0000\u0000\u00fa\u00fb\u0005t\u0000\u0000\u00fb\u00fc\u0005"+
		"o\u0000\u0000\u00fc*\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005P\u0000"+
		"\u0000\u00fe\u00ff\u0005V\u0000\u0000\u00ff,\u0001\u0000\u0000\u0000\u0100"+
		"\u0104\u0005\"\u0000\u0000\u0101\u0103\b\u0000\u0000\u0000\u0102\u0101"+
		"\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107"+
		"\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0005\"\u0000\u0000\u0108.\u0001\u0000\u0000\u0000\u0109\u010b\u0007"+
		"\u0001\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d0\u0001\u0000\u0000\u0000\u010e\u010f\u0005R\u0000"+
		"\u0000\u010f\u0110\u0005a\u0000\u0000\u0110\u0111\u0005n\u0000\u0000\u0111"+
		"\u0112\u0005d\u0000\u0000\u0112\u0113\u0005o\u0000\u0000\u0113\u011b\u0005"+
		"m\u0000\u0000\u0114\u0115\u0005r\u0000\u0000\u0115\u0116\u0005a\u0000"+
		"\u0000\u0116\u0117\u0005n\u0000\u0000\u0117\u0118\u0005d\u0000\u0000\u0118"+
		"\u0119\u0005o\u0000\u0000\u0119\u011b\u0005m\u0000\u0000\u011a\u010e\u0001"+
		"\u0000\u0000\u0000\u011a\u0114\u0001\u0000\u0000\u0000\u011b2\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0005,\u0000\u0000\u011d4\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0005:\u0000\u0000\u011f6\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0005;\u0000\u0000\u01218\u0001\u0000\u0000\u0000\u0122\u0123\u0005{"+
		"\u0000\u0000\u0123:\u0001\u0000\u0000\u0000\u0124\u0125\u0005}\u0000\u0000"+
		"\u0125<\u0001\u0000\u0000\u0000\u0126\u0128\u0007\u0002\u0000\u0000\u0127"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0006\u001e\u0000\u0000\u012c"+
		">\u0001\u0000\u0000\u0000\u012d\u012e\u0005/\u0000\u0000\u012e\u012f\u0005"+
		"*\u0000\u0000\u012f\u0133\u0001\u0000\u0000\u0000\u0130\u0132\b\u0003"+
		"\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000"+
		"\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000"+
		"\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0005*\u0000\u0000\u0137\u0138\u0005/\u0000\u0000"+
		"\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u013b\u0005\r\u0000\u0000\u013a"+
		"\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u013d\u0001\u0000\u0000\u0000\u013c\u013e\u0005\n\u0000\u0000\u013d\u013c"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0006\u001f\u0001\u0000\u0140@\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0005/\u0000\u0000\u0142\u0143\u0005*\u0000"+
		"\u0000\u0143\u0147\u0001\u0000\u0000\u0000\u0144\u0146\b\u0003\u0000\u0000"+
		"\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000"+
		"\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000"+
		"\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u014a\u014c\u0005\r\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d"+
		"\u014f\u0005\n\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014fB\u0001\u0000\u0000\u0000\u0150\u0151\u0005"+
		"\\\u0000\u0000\u0151\u0155\u0005\'\u0000\u0000\u0152\u0153\u0005\\\u0000"+
		"\u0000\u0153\u0155\u0005n\u0000\u0000\u0154\u0150\u0001\u0000\u0000\u0000"+
		"\u0154\u0152\u0001\u0000\u0000\u0000\u0155D\u0001\u0000\u0000\u0000\f"+
		"\u0000\u0104\u010c\u011a\u0129\u0133\u013a\u013d\u0147\u014b\u014e\u0154"+
		"\u0002\u0006\u0000\u0000\u0001\u001f\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}