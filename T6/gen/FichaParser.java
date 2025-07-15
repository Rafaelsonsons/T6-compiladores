// Generated from C:/Users/felip/Desktop/Docs_Yuya/UFSCar/COMPL/T6/src/main/antlr4.ficha/Ficha.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FichaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOME=1, CLASSE_LITERAL=2, CARACTERISTICAS_LITERAL=3, ATRIBUTOS_LITERAL=4, 
		GUERREIRO=5, MAGO=6, CLERIGO=7, LADINO=8, BARDO=9, FORCA=10, DESTREZA=11, 
		CONSTITUICAO=12, SABEDORIA=13, INTELIGENCIA=14, CARISMA=15, PRECISAO=16, 
		ARMADURA=17, INICIATIVA=18, MOVIMENTO=19, PV=20, PV_MAX=21, D20=22, D12=23, 
		D10=24, D8=25, D6=26, D4=27, STRING=28, NUM=29, LBRACE=30, RBRACE=31, 
		COLON=32, SEMI=33, WS=34, COMMENT=35;
	public static final int
		RULE_ficha = 0, RULE_declaracao = 1, RULE_declaracaoNome = 2, RULE_declaracaoClasse = 3, 
		RULE_blocoCaracteristicas = 4, RULE_atribuicaoCaracteristica = 5, RULE_blocoAtributos = 6, 
		RULE_atribuicaoAtributo = 7, RULE_classe = 8, RULE_caracteristica = 9, 
		RULE_atributo = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"ficha", "declaracao", "declaracaoNome", "declaracaoClasse", "blocoCaracteristicas", 
			"atribuicaoCaracteristica", "blocoAtributos", "atribuicaoAtributo", "classe", 
			"caracteristica", "atributo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Nome'", "'Classe'", "'Caracteristicas'", "'Atributos'", "'Guerreiro'", 
			"'Mago'", "'Clerigo'", "'Ladino'", "'Bardo'", "'Forca'", "'Destreza'", 
			"'Constituicao'", "'Sabedoria'", "'Inteligencia'", "'Carisma'", "'Precisao'", 
			"'Armadura'", "'Iniciativa'", "'Movimento'", "'PV'", "'PV Max'", "'d20'", 
			"'d12'", "'d10'", "'d8'", "'d6'", "'d4'", null, null, "'{'", "'}'", "':'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOME", "CLASSE_LITERAL", "CARACTERISTICAS_LITERAL", "ATRIBUTOS_LITERAL", 
			"GUERREIRO", "MAGO", "CLERIGO", "LADINO", "BARDO", "FORCA", "DESTREZA", 
			"CONSTITUICAO", "SABEDORIA", "INTELIGENCIA", "CARISMA", "PRECISAO", "ARMADURA", 
			"INICIATIVA", "MOVIMENTO", "PV", "PV_MAX", "D20", "D12", "D10", "D8", 
			"D6", "D4", "STRING", "NUM", "LBRACE", "RBRACE", "COLON", "SEMI", "WS", 
			"COMMENT"
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
	public String getGrammarFileName() { return "Ficha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FichaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FichaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FichaParser.EOF, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public FichaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ficha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterFicha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitFicha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitFicha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FichaContext ficha() throws RecognitionException {
		FichaContext _localctx = new FichaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ficha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
				{
				{
				setState(22);
				declaracao();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoNomeContext declaracaoNome() {
			return getRuleContext(DeclaracaoNomeContext.class,0);
		}
		public DeclaracaoClasseContext declaracaoClasse() {
			return getRuleContext(DeclaracaoClasseContext.class,0);
		}
		public BlocoCaracteristicasContext blocoCaracteristicas() {
			return getRuleContext(BlocoCaracteristicasContext.class,0);
		}
		public BlocoAtributosContext blocoAtributos() {
			return getRuleContext(BlocoAtributosContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				declaracaoNome();
				}
				break;
			case CLASSE_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				declaracaoClasse();
				}
				break;
			case CARACTERISTICAS_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				blocoCaracteristicas();
				}
				break;
			case ATRIBUTOS_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				blocoAtributos();
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
	public static class DeclaracaoNomeContext extends ParserRuleContext {
		public Token nome;
		public TerminalNode NOME() { return getToken(FichaParser.NOME, 0); }
		public TerminalNode COLON() { return getToken(FichaParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(FichaParser.SEMI, 0); }
		public TerminalNode STRING() { return getToken(FichaParser.STRING, 0); }
		public DeclaracaoNomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoNome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterDeclaracaoNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitDeclaracaoNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitDeclaracaoNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoNomeContext declaracaoNome() throws RecognitionException {
		DeclaracaoNomeContext _localctx = new DeclaracaoNomeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoNome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(NOME);
			setState(37);
			match(COLON);
			setState(38);
			((DeclaracaoNomeContext)_localctx).nome = match(STRING);
			setState(39);
			match(SEMI);
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
	public static class DeclaracaoClasseContext extends ParserRuleContext {
		public ClasseContext tipo;
		public TerminalNode CLASSE_LITERAL() { return getToken(FichaParser.CLASSE_LITERAL, 0); }
		public TerminalNode COLON() { return getToken(FichaParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(FichaParser.SEMI, 0); }
		public ClasseContext classe() {
			return getRuleContext(ClasseContext.class,0);
		}
		public DeclaracaoClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoClasse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterDeclaracaoClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitDeclaracaoClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitDeclaracaoClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoClasseContext declaracaoClasse() throws RecognitionException {
		DeclaracaoClasseContext _localctx = new DeclaracaoClasseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoClasse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(CLASSE_LITERAL);
			setState(42);
			match(COLON);
			setState(43);
			((DeclaracaoClasseContext)_localctx).tipo = classe();
			setState(44);
			match(SEMI);
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
	public static class BlocoCaracteristicasContext extends ParserRuleContext {
		public TerminalNode CARACTERISTICAS_LITERAL() { return getToken(FichaParser.CARACTERISTICAS_LITERAL, 0); }
		public TerminalNode LBRACE() { return getToken(FichaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FichaParser.RBRACE, 0); }
		public List<AtribuicaoCaracteristicaContext> atribuicaoCaracteristica() {
			return getRuleContexts(AtribuicaoCaracteristicaContext.class);
		}
		public AtribuicaoCaracteristicaContext atribuicaoCaracteristica(int i) {
			return getRuleContext(AtribuicaoCaracteristicaContext.class,i);
		}
		public BlocoCaracteristicasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoCaracteristicas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterBlocoCaracteristicas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitBlocoCaracteristicas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitBlocoCaracteristicas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoCaracteristicasContext blocoCaracteristicas() throws RecognitionException {
		BlocoCaracteristicasContext _localctx = new BlocoCaracteristicasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blocoCaracteristicas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(CARACTERISTICAS_LITERAL);
			setState(47);
			match(LBRACE);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				atribuicaoCaracteristica();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0) );
			setState(53);
			match(RBRACE);
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
	public static class AtribuicaoCaracteristicaContext extends ParserRuleContext {
		public CaracteristicaContext nome;
		public Token valor;
		public TerminalNode COLON() { return getToken(FichaParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(FichaParser.SEMI, 0); }
		public CaracteristicaContext caracteristica() {
			return getRuleContext(CaracteristicaContext.class,0);
		}
		public TerminalNode NUM() { return getToken(FichaParser.NUM, 0); }
		public AtribuicaoCaracteristicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoCaracteristica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterAtribuicaoCaracteristica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitAtribuicaoCaracteristica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitAtribuicaoCaracteristica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoCaracteristicaContext atribuicaoCaracteristica() throws RecognitionException {
		AtribuicaoCaracteristicaContext _localctx = new AtribuicaoCaracteristicaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribuicaoCaracteristica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((AtribuicaoCaracteristicaContext)_localctx).nome = caracteristica();
			setState(56);
			match(COLON);
			setState(57);
			((AtribuicaoCaracteristicaContext)_localctx).valor = match(NUM);
			setState(58);
			match(SEMI);
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
	public static class BlocoAtributosContext extends ParserRuleContext {
		public TerminalNode ATRIBUTOS_LITERAL() { return getToken(FichaParser.ATRIBUTOS_LITERAL, 0); }
		public TerminalNode LBRACE() { return getToken(FichaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FichaParser.RBRACE, 0); }
		public List<AtribuicaoAtributoContext> atribuicaoAtributo() {
			return getRuleContexts(AtribuicaoAtributoContext.class);
		}
		public AtribuicaoAtributoContext atribuicaoAtributo(int i) {
			return getRuleContext(AtribuicaoAtributoContext.class,i);
		}
		public BlocoAtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoAtributos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterBlocoAtributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitBlocoAtributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitBlocoAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoAtributosContext blocoAtributos() throws RecognitionException {
		BlocoAtributosContext _localctx = new BlocoAtributosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blocoAtributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ATRIBUTOS_LITERAL);
			setState(61);
			match(LBRACE);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				atribuicaoAtributo();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0) );
			setState(67);
			match(RBRACE);
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
	public static class AtribuicaoAtributoContext extends ParserRuleContext {
		public AtributoContext nome;
		public Token valor;
		public TerminalNode COLON() { return getToken(FichaParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(FichaParser.SEMI, 0); }
		public AtributoContext atributo() {
			return getRuleContext(AtributoContext.class,0);
		}
		public TerminalNode NUM() { return getToken(FichaParser.NUM, 0); }
		public AtribuicaoAtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoAtributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterAtribuicaoAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitAtribuicaoAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitAtribuicaoAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoAtributoContext atribuicaoAtributo() throws RecognitionException {
		AtribuicaoAtributoContext _localctx = new AtribuicaoAtributoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atribuicaoAtributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((AtribuicaoAtributoContext)_localctx).nome = atributo();
			setState(70);
			match(COLON);
			setState(71);
			((AtribuicaoAtributoContext)_localctx).valor = match(NUM);
			setState(72);
			match(SEMI);
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
	public static class ClasseContext extends ParserRuleContext {
		public TerminalNode GUERREIRO() { return getToken(FichaParser.GUERREIRO, 0); }
		public TerminalNode MAGO() { return getToken(FichaParser.MAGO, 0); }
		public TerminalNode CLERIGO() { return getToken(FichaParser.CLERIGO, 0); }
		public TerminalNode LADINO() { return getToken(FichaParser.LADINO, 0); }
		public TerminalNode BARDO() { return getToken(FichaParser.BARDO, 0); }
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 992L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaracteristicaContext extends ParserRuleContext {
		public TerminalNode FORCA() { return getToken(FichaParser.FORCA, 0); }
		public TerminalNode DESTREZA() { return getToken(FichaParser.DESTREZA, 0); }
		public TerminalNode CONSTITUICAO() { return getToken(FichaParser.CONSTITUICAO, 0); }
		public TerminalNode INTELIGENCIA() { return getToken(FichaParser.INTELIGENCIA, 0); }
		public TerminalNode SABEDORIA() { return getToken(FichaParser.SABEDORIA, 0); }
		public TerminalNode CARISMA() { return getToken(FichaParser.CARISMA, 0); }
		public CaracteristicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracteristica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterCaracteristica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitCaracteristica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitCaracteristica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaracteristicaContext caracteristica() throws RecognitionException {
		CaracteristicaContext _localctx = new CaracteristicaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_caracteristica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtributoContext extends ParserRuleContext {
		public TerminalNode PRECISAO() { return getToken(FichaParser.PRECISAO, 0); }
		public TerminalNode ARMADURA() { return getToken(FichaParser.ARMADURA, 0); }
		public TerminalNode INICIATIVA() { return getToken(FichaParser.INICIATIVA, 0); }
		public TerminalNode MOVIMENTO() { return getToken(FichaParser.MOVIMENTO, 0); }
		public TerminalNode PV() { return getToken(FichaParser.PV, 0); }
		public TerminalNode PV_MAX() { return getToken(FichaParser.PV_MAX, 0); }
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atributo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		"\u0004\u0001#Q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018\b\u0000"+
		"\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u00042\b\u0004\u000b\u0004\f\u00043\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006@\b\u0006\u000b\u0006\f\u0006A\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0001\u0000"+
		"\u0005\t\u0001\u0000\n\u000f\u0001\u0000\u0010\u0015K\u0000\u0019\u0001"+
		"\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004$\u0001\u0000"+
		"\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000"+
		"\n7\u0001\u0000\u0000\u0000\f<\u0001\u0000\u0000\u0000\u000eE\u0001\u0000"+
		"\u0000\u0000\u0010J\u0001\u0000\u0000\u0000\u0012L\u0001\u0000\u0000\u0000"+
		"\u0014N\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0005\u0000\u0000\u0001\u001d\u0001\u0001\u0000\u0000\u0000\u001e"+
		"#\u0003\u0004\u0002\u0000\u001f#\u0003\u0006\u0003\u0000 #\u0003\b\u0004"+
		"\u0000!#\u0003\f\u0006\u0000\"\u001e\u0001\u0000\u0000\u0000\"\u001f\u0001"+
		"\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000"+
		"#\u0003\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005 \u0000"+
		"\u0000&\'\u0005\u001c\u0000\u0000\'(\u0005!\u0000\u0000(\u0005\u0001\u0000"+
		"\u0000\u0000)*\u0005\u0002\u0000\u0000*+\u0005 \u0000\u0000+,\u0003\u0010"+
		"\b\u0000,-\u0005!\u0000\u0000-\u0007\u0001\u0000\u0000\u0000./\u0005\u0003"+
		"\u0000\u0000/1\u0005\u001e\u0000\u000002\u0003\n\u0005\u000010\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0005\u001f\u0000\u0000"+
		"6\t\u0001\u0000\u0000\u000078\u0003\u0012\t\u000089\u0005 \u0000\u0000"+
		"9:\u0005\u001d\u0000\u0000:;\u0005!\u0000\u0000;\u000b\u0001\u0000\u0000"+
		"\u0000<=\u0005\u0004\u0000\u0000=?\u0005\u001e\u0000\u0000>@\u0003\u000e"+
		"\u0007\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CD\u0005\u001f\u0000\u0000D\r\u0001\u0000\u0000\u0000EF\u0003\u0014\n"+
		"\u0000FG\u0005 \u0000\u0000GH\u0005\u001d\u0000\u0000HI\u0005!\u0000\u0000"+
		"I\u000f\u0001\u0000\u0000\u0000JK\u0007\u0000\u0000\u0000K\u0011\u0001"+
		"\u0000\u0000\u0000LM\u0007\u0001\u0000\u0000M\u0013\u0001\u0000\u0000"+
		"\u0000NO\u0007\u0002\u0000\u0000O\u0015\u0001\u0000\u0000\u0000\u0004"+
		"\u0019\"3A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}