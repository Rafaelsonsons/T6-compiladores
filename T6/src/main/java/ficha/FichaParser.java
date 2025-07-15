// Generated from C:/Users/felip/Desktop/Docs_Yuya/UFSCar/COMPL/T6-Compiladores/T6/src/main/antlr4.ficha/Ficha.g4 by ANTLR 4.13.2
package ficha;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FichaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOME=1, CLASSE_LITERAL=2, NIVEL=3, CARACTERISTICAS_LITERAL=4, ATRIBUTOS_LITERAL=5, 
		LVLUP=6, GUERREIRO=7, MAGO=8, CLERIGO=9, LADINO=10, BARDO=11, FORCA=12, 
		DESTREZA=13, CONSTITUICAO=14, SABEDORIA=15, INTELIGENCIA=16, CARISMA=17, 
		PRECISAO=18, ARMADURA=19, INICIATIVA=20, MOVIMENTO=21, PV=22, PV_MAX=23, 
		STRING=24, NUM=25, RANDOM=26, COMMA=27, COLON=28, SEMI=29, LBRKT=30, RBRKT=31, 
		LBRACE=32, RBRACE=33, WS=34, COMENTARIO=35, COMENTARIO_ABERTO=36;
	public static final int
		RULE_ficha = 0, RULE_declaracao = 1, RULE_classe = 2, RULE_caracteristica = 3, 
		RULE_atributo = 4, RULE_declaracaoNome = 5, RULE_declaracaoClasse = 6, 
		RULE_declaracaoNivel = 7, RULE_blocoCaracteristicas = 8, RULE_atribuicaoCaracteristica = 9, 
		RULE_blocoAtributos = 10, RULE_atribuicaoAtributo = 11, RULE_criarFichaRANDOM = 12, 
		RULE_criarFicha = 13, RULE_lerFichaPronta = 14;
	private static String[] makeRuleNames() {
		return new String[] {
				"ficha", "declaracao", "classe", "caracteristica", "atributo", "declaracaoNome",
			"declaracaoClasse", "declaracaoNivel", "blocoCaracteristicas", "atribuicaoCaracteristica", 
			"blocoAtributos", "atribuicaoAtributo", "criarFichaRANDOM", "criarFicha", 
			"lerFichaPronta"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Nome'", "'Classe'", "'Nivel'", "'Caracteristicas'", "'Atributos'", 
			"'LVLUP'", "'Guerreiro'", "'Mago'", "'Clerigo'", "'Ladino'", "'Bardo'", 
			"'Forca'", "'Destreza'", "'Constituicao'", "'Sabedoria'", "'Inteligencia'", 
			"'Carisma'", "'Precisao'", "'Armadura'", "'Iniciativa'", "'Movimento'", 
			"'PV'", "'PV Max'", null, null, "'Random'", "','", "':'", "';'", "'['", 
			"']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOME", "CLASSE_LITERAL", "NIVEL", "CARACTERISTICAS_LITERAL", "ATRIBUTOS_LITERAL", 
			"LVLUP", "GUERREIRO", "MAGO", "CLERIGO", "LADINO", "BARDO", "FORCA", 
			"DESTREZA", "CONSTITUICAO", "SABEDORIA", "INTELIGENCIA", "CARISMA", "PRECISAO", 
			"ARMADURA", "INICIATIVA", "MOVIMENTO", "PV", "PV_MAX", "STRING", "NUM", 
			"RANDOM", "COMMA", "COLON", "SEMI", "LBRKT", "RBRKT", "LBRACE", "RBRACE", 
			"WS", "COMENTARIO", "COMENTARIO_ABERTO"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3970L) != 0)) {
				{
				{
				setState(30);
				declaracao();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
		public CriarFichaContext criarFicha() {
			return getRuleContext(CriarFichaContext.class,0);
		}
		public CriarFichaRANDOMContext criarFichaRANDOM() {
			return getRuleContext(CriarFichaRANDOMContext.class,0);
		}
		public LerFichaProntaContext lerFichaPronta() {
			return getRuleContext(LerFichaProntaContext.class,0);
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
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				criarFicha();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				criarFichaRANDOM();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				lerFichaPronta();
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
		enterRule(_localctx, 4, RULE_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) ) {
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
		enterRule(_localctx, 6, RULE_caracteristica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) ) {
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
		enterRule(_localctx, 8, RULE_atributo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0)) ) {
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
		enterRule(_localctx, 10, RULE_declaracaoNome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(NOME);
			setState(50);
			match(COLON);
			setState(51);
			((DeclaracaoNomeContext)_localctx).nome = match(STRING);
			setState(52);
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
		enterRule(_localctx, 12, RULE_declaracaoClasse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(CLASSE_LITERAL);
			setState(55);
			match(COLON);
			setState(56);
			((DeclaracaoClasseContext)_localctx).tipo = classe();
			setState(57);
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
	public static class DeclaracaoNivelContext extends ParserRuleContext {
		public Token nivel;
		public TerminalNode NIVEL() { return getToken(FichaParser.NIVEL, 0); }
		public TerminalNode COLON() { return getToken(FichaParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(FichaParser.SEMI, 0); }
		public TerminalNode NUM() { return getToken(FichaParser.NUM, 0); }
		public DeclaracaoNivelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoNivel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterDeclaracaoNivel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitDeclaracaoNivel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitDeclaracaoNivel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoNivelContext declaracaoNivel() throws RecognitionException {
		DeclaracaoNivelContext _localctx = new DeclaracaoNivelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracaoNivel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(NIVEL);
			setState(60);
			match(COLON);
			setState(61);
			((DeclaracaoNivelContext)_localctx).nivel = match(NUM);
			setState(62);
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
		enterRule(_localctx, 16, RULE_blocoCaracteristicas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CARACTERISTICAS_LITERAL);
			setState(65);
			match(LBRACE);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				atribuicaoCaracteristica();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0) );
			setState(71);
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
		enterRule(_localctx, 18, RULE_atribuicaoCaracteristica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((AtribuicaoCaracteristicaContext)_localctx).nome = caracteristica();
			setState(74);
			match(COLON);
			setState(75);
			((AtribuicaoCaracteristicaContext)_localctx).valor = match(NUM);
			setState(76);
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
		enterRule(_localctx, 20, RULE_blocoAtributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ATRIBUTOS_LITERAL);
			setState(79);
			match(LBRACE);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				atribuicaoAtributo();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0) );
			setState(85);
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
		enterRule(_localctx, 22, RULE_atribuicaoAtributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((AtribuicaoAtributoContext)_localctx).nome = atributo();
			setState(88);
			match(COLON);
			setState(89);
			((AtribuicaoAtributoContext)_localctx).valor = match(NUM);
			setState(90);
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
	public static class CriarFichaRANDOMContext extends ParserRuleContext {
		public Token nome;
		public ClasseContext classe() {
			return getRuleContext(ClasseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FichaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FichaParser.COMMA, i);
		}
		public TerminalNode NUM() { return getToken(FichaParser.NUM, 0); }
		public TerminalNode LBRKT() { return getToken(FichaParser.LBRKT, 0); }
		public TerminalNode RANDOM() { return getToken(FichaParser.RANDOM, 0); }
		public TerminalNode RBRKT() { return getToken(FichaParser.RBRKT, 0); }
		public TerminalNode STRING() { return getToken(FichaParser.STRING, 0); }
		public CriarFichaRANDOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criarFichaRANDOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterCriarFichaRANDOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitCriarFichaRANDOM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitCriarFichaRANDOM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriarFichaRANDOMContext criarFichaRANDOM() throws RecognitionException {
		CriarFichaRANDOMContext _localctx = new CriarFichaRANDOMContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_criarFichaRANDOM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			classe();
			setState(93);
			match(COMMA);
			setState(94);
			((CriarFichaRANDOMContext)_localctx).nome = match(STRING);
			setState(95);
			match(COMMA);
			setState(96);
			match(NUM);
			setState(97);
			match(LBRKT);
			setState(98);
			match(RANDOM);
			setState(99);
			match(RBRKT);
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
	public static class CriarFichaContext extends ParserRuleContext {
		public Token nome;
		public ClasseContext classe() {
			return getRuleContext(ClasseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FichaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FichaParser.COMMA, i);
		}
		public TerminalNode NUM() { return getToken(FichaParser.NUM, 0); }
		public TerminalNode LBRKT() { return getToken(FichaParser.LBRKT, 0); }
		public BlocoAtributosContext blocoAtributos() {
			return getRuleContext(BlocoAtributosContext.class,0);
		}
		public BlocoCaracteristicasContext blocoCaracteristicas() {
			return getRuleContext(BlocoCaracteristicasContext.class,0);
		}
		public TerminalNode RBRKT() { return getToken(FichaParser.RBRKT, 0); }
		public TerminalNode STRING() { return getToken(FichaParser.STRING, 0); }
		public CriarFichaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criarFicha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterCriarFicha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitCriarFicha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitCriarFicha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriarFichaContext criarFicha() throws RecognitionException {
		CriarFichaContext _localctx = new CriarFichaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_criarFicha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			classe();
			setState(102);
			match(COMMA);
			setState(103);
			((CriarFichaContext)_localctx).nome = match(STRING);
			setState(104);
			match(COMMA);
			setState(105);
			match(NUM);
			setState(106);
			match(LBRKT);
			setState(107);
			blocoAtributos();
			setState(108);
			blocoCaracteristicas();
			setState(109);
			match(RBRKT);
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
	public static class LerFichaProntaContext extends ParserRuleContext {
		public DeclaracaoNomeContext declaracaoNome() {
			return getRuleContext(DeclaracaoNomeContext.class,0);
		}
		public DeclaracaoClasseContext declaracaoClasse() {
			return getRuleContext(DeclaracaoClasseContext.class,0);
		}
		public DeclaracaoNivelContext declaracaoNivel() {
			return getRuleContext(DeclaracaoNivelContext.class,0);
		}
		public BlocoAtributosContext blocoAtributos() {
			return getRuleContext(BlocoAtributosContext.class,0);
		}
		public BlocoCaracteristicasContext blocoCaracteristicas() {
			return getRuleContext(BlocoCaracteristicasContext.class,0);
		}
		public LerFichaProntaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lerFichaPronta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).enterLerFichaPronta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener ) ((FichaListener)listener).exitLerFichaPronta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor ) return ((FichaVisitor<? extends T>)visitor).visitLerFichaPronta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LerFichaProntaContext lerFichaPronta() throws RecognitionException {
		LerFichaProntaContext _localctx = new LerFichaProntaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lerFichaPronta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			declaracaoNome();
			setState(112);
			declaracaoClasse();
			setState(113);
			declaracaoNivel();
			setState(114);
			blocoAtributos();
			setState(115);
			blocoCaracteristicas();
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
		"\u0004\u0001$v\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000 \b"+
		"\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0004\bD\b\b\u000b\b\f\bE\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0004"+
		"\nR\b\n\u000b\n\f\nS\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u0000\u0003\u0001\u0000\u0007\u000b\u0001\u0000\f\u0011\u0001\u0000\u0012"+
		"\u0017k\u0000!\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000"+
		"\u0004+\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b/\u0001"+
		"\u0000\u0000\u0000\n1\u0001\u0000\u0000\u0000\f6\u0001\u0000\u0000\u0000"+
		"\u000e;\u0001\u0000\u0000\u0000\u0010@\u0001\u0000\u0000\u0000\u0012I"+
		"\u0001\u0000\u0000\u0000\u0014N\u0001\u0000\u0000\u0000\u0016W\u0001\u0000"+
		"\u0000\u0000\u0018\\\u0001\u0000\u0000\u0000\u001ae\u0001\u0000\u0000"+
		"\u0000\u001co\u0001\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f"+
		"\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000"+
		"\u0000\u0000&*\u0003\u001a\r\u0000\'*\u0003\u0018\f\u0000(*\u0003\u001c"+
		"\u000e\u0000)&\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001"+
		"\u0000\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+,\u0007\u0000\u0000"+
		"\u0000,\u0005\u0001\u0000\u0000\u0000-.\u0007\u0001\u0000\u0000.\u0007"+
		"\u0001\u0000\u0000\u0000/0\u0007\u0002\u0000\u00000\t\u0001\u0000\u0000"+
		"\u000012\u0005\u0001\u0000\u000023\u0005\u001c\u0000\u000034\u0005\u0018"+
		"\u0000\u000045\u0005\u001d\u0000\u00005\u000b\u0001\u0000\u0000\u0000"+
		"67\u0005\u0002\u0000\u000078\u0005\u001c\u0000\u000089\u0003\u0004\u0002"+
		"\u00009:\u0005\u001d\u0000\u0000:\r\u0001\u0000\u0000\u0000;<\u0005\u0003"+
		"\u0000\u0000<=\u0005\u001c\u0000\u0000=>\u0005\u0019\u0000\u0000>?\u0005"+
		"\u001d\u0000\u0000?\u000f\u0001\u0000\u0000\u0000@A\u0005\u0004\u0000"+
		"\u0000AC\u0005 \u0000\u0000BD\u0003\u0012\t\u0000CB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005!\u0000\u0000H\u0011\u0001"+
		"\u0000\u0000\u0000IJ\u0003\u0006\u0003\u0000JK\u0005\u001c\u0000\u0000"+
		"KL\u0005\u0019\u0000\u0000LM\u0005\u001d\u0000\u0000M\u0013\u0001\u0000"+
		"\u0000\u0000NO\u0005\u0005\u0000\u0000OQ\u0005 \u0000\u0000PR\u0003\u0016"+
		"\u000b\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0005!\u0000\u0000V\u0015\u0001\u0000\u0000\u0000WX\u0003\b\u0004\u0000"+
		"XY\u0005\u001c\u0000\u0000YZ\u0005\u0019\u0000\u0000Z[\u0005\u001d\u0000"+
		"\u0000[\u0017\u0001\u0000\u0000\u0000\\]\u0003\u0004\u0002\u0000]^\u0005"+
		"\u001b\u0000\u0000^_\u0005\u0018\u0000\u0000_`\u0005\u001b\u0000\u0000"+
		"`a\u0005\u0019\u0000\u0000ab\u0005\u001e\u0000\u0000bc\u0005\u001a\u0000"+
		"\u0000cd\u0005\u001f\u0000\u0000d\u0019\u0001\u0000\u0000\u0000ef\u0003"+
		"\u0004\u0002\u0000fg\u0005\u001b\u0000\u0000gh\u0005\u0018\u0000\u0000"+
		"hi\u0005\u001b\u0000\u0000ij\u0005\u0019\u0000\u0000jk\u0005\u001e\u0000"+
		"\u0000kl\u0003\u0014\n\u0000lm\u0003\u0010\b\u0000mn\u0005\u001f\u0000"+
		"\u0000n\u001b\u0001\u0000\u0000\u0000op\u0003\n\u0005\u0000pq\u0003\f"+
		"\u0006\u0000qr\u0003\u000e\u0007\u0000rs\u0003\u0014\n\u0000st\u0003\u0010"+
		"\b\u0000t\u001d\u0001\u0000\u0000\u0000\u0004!)ES";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}