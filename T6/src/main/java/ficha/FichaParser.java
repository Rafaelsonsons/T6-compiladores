package ficha;// Generated from C:/Users/felip/Desktop/Docs_Yuya/UFSCar/COMPL/T6-Compiladores/T6/src/main/antlr4.ficha/Ficha.g4 by ANTLR 4.13.2
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
		NOME=1, CLASSE_LITERAL=2, NIVEL=3, CARACTERISTICAS_LITERAL=4, ATRIBUTOS_LITERAL=5, 
		LVLUP=6, GUERREIRO=7, MAGO=8, CLERIGO=9, LADINO=10, BARDO=11, FORCA=12, 
		DESTREZA=13, CONSTITUICAO=14, SABEDORIA=15, INTELIGENCIA=16, CARISMA=17, 
		PRECISAO=18, ARMADURA=19, INICIATIVA=20, MOVIMENTO=21, PV=22, STRING=23, 
		NUM=24, RANDOM=25, COMMA=26, COLON=27, SEMI=28, LBRACE=29, RBRACE=30, 
		WS=31, COMENTARIO=32, COMENTARIO_ABERTO=33;
	public static final int
		RULE_ficha = 0, RULE_declaracao = 1, RULE_classe = 2, RULE_caracteristica = 3, 
		RULE_atributo = 4, RULE_declaracaoNome = 5, RULE_declaracaoClasse = 6, 
		RULE_declaracaoNivel = 7, RULE_blocoCaracteristicas = 8, RULE_blocoCaracteristicasCriar = 9, 
		RULE_atribuicaoCaracteristica = 10, RULE_blocoAtributos = 11, RULE_atribuicaoAtributo = 12, 
		RULE_criarFichaRANDOM = 13, RULE_criarFicha = 14, RULE_lerFichaPronta = 15, 
		RULE_lerFichaProntalvlup = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"ficha", "declaracao", "classe", "caracteristica", "atributo", "declaracaoNome", 
			"declaracaoClasse", "declaracaoNivel", "blocoCaracteristicas", "blocoCaracteristicasCriar", 
			"atribuicaoCaracteristica", "blocoAtributos", "atribuicaoAtributo", "criarFichaRANDOM", 
			"criarFicha", "lerFichaPronta", "lerFichaProntalvlup"
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
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterFicha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitFicha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitFicha(this);
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4034L) != 0)) {
				{
				{
				setState(34);
				declaracao();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
		public LerFichaProntalvlupContext lerFichaProntalvlup() {
			return getRuleContext(LerFichaProntalvlupContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				criarFicha();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				criarFichaRANDOM();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				lerFichaPronta();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				lerFichaProntalvlup();
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
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitClasse(this);
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
			setState(48);
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
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterCaracteristica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitCaracteristica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitCaracteristica(this);
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
			setState(50);
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
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitAtributo(this);
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
			setState(52);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) ) {
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
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterDeclaracaoNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitDeclaracaoNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitDeclaracaoNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoNomeContext declaracaoNome() throws RecognitionException {
		DeclaracaoNomeContext _localctx = new DeclaracaoNomeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracaoNome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(NOME);
			setState(55);
			match(COLON);
			setState(56);
			((DeclaracaoNomeContext)_localctx).nome = match(STRING);
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
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterDeclaracaoClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitDeclaracaoClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitDeclaracaoClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoClasseContext declaracaoClasse() throws RecognitionException {
		DeclaracaoClasseContext _localctx = new DeclaracaoClasseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracaoClasse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(CLASSE_LITERAL);
			setState(60);
			match(COLON);
			setState(61);
			((DeclaracaoClasseContext)_localctx).tipo = classe();
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
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterDeclaracaoNivel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitDeclaracaoNivel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitDeclaracaoNivel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoNivelContext declaracaoNivel() throws RecognitionException {
		DeclaracaoNivelContext _localctx = new DeclaracaoNivelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracaoNivel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(NIVEL);
			setState(65);
			match(COLON);
			setState(66);
			((DeclaracaoNivelContext)_localctx).nivel = match(NUM);
			setState(67);
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
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterBlocoCaracteristicas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitBlocoCaracteristicas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitBlocoCaracteristicas(this);
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
			setState(69);
			match(CARACTERISTICAS_LITERAL);
			setState(70);
			match(LBRACE);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				atribuicaoCaracteristica();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0) );
			setState(76);
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
	public static class BlocoCaracteristicasCriarContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FichaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FichaParser.RBRACE, 0); }
		public List<AtribuicaoCaracteristicaContext> atribuicaoCaracteristica() {
			return getRuleContexts(AtribuicaoCaracteristicaContext.class);
		}
		public AtribuicaoCaracteristicaContext atribuicaoCaracteristica(int i) {
			return getRuleContext(AtribuicaoCaracteristicaContext.class,i);
		}
		public BlocoCaracteristicasCriarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoCaracteristicasCriar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterBlocoCaracteristicasCriar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitBlocoCaracteristicasCriar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitBlocoCaracteristicasCriar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoCaracteristicasCriarContext blocoCaracteristicasCriar() throws RecognitionException {
		BlocoCaracteristicasCriarContext _localctx = new BlocoCaracteristicasCriarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blocoCaracteristicasCriar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LBRACE);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				atribuicaoCaracteristica();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0) );
			setState(84);
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
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterAtribuicaoCaracteristica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitAtribuicaoCaracteristica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitAtribuicaoCaracteristica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoCaracteristicaContext atribuicaoCaracteristica() throws RecognitionException {
		AtribuicaoCaracteristicaContext _localctx = new AtribuicaoCaracteristicaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicaoCaracteristica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((AtribuicaoCaracteristicaContext)_localctx).nome = caracteristica();
			setState(87);
			match(COLON);
			setState(88);
			((AtribuicaoCaracteristicaContext)_localctx).valor = match(NUM);
			setState(89);
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
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterBlocoAtributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitBlocoAtributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitBlocoAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoAtributosContext blocoAtributos() throws RecognitionException {
		BlocoAtributosContext _localctx = new BlocoAtributosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blocoAtributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ATRIBUTOS_LITERAL);
			setState(92);
			match(LBRACE);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				atribuicaoAtributo();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0) );
			setState(98);
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
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterAtribuicaoAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitAtribuicaoAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitAtribuicaoAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoAtributoContext atribuicaoAtributo() throws RecognitionException {
		AtribuicaoAtributoContext _localctx = new AtribuicaoAtributoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuicaoAtributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((AtribuicaoAtributoContext)_localctx).nome = atributo();
			setState(101);
			match(COLON);
			setState(102);
			((AtribuicaoAtributoContext)_localctx).valor = match(NUM);
			setState(103);
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
		public TerminalNode RANDOM() { return getToken(FichaParser.RANDOM, 0); }
		public TerminalNode STRING() { return getToken(FichaParser.STRING, 0); }
		public CriarFichaRANDOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criarFichaRANDOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterCriarFichaRANDOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitCriarFichaRANDOM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitCriarFichaRANDOM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriarFichaRANDOMContext criarFichaRANDOM() throws RecognitionException {
		CriarFichaRANDOMContext _localctx = new CriarFichaRANDOMContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_criarFichaRANDOM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			classe();
			setState(106);
			match(COMMA);
			setState(107);
			((CriarFichaRANDOMContext)_localctx).nome = match(STRING);
			setState(108);
			match(COMMA);
			setState(109);
			match(NUM);
			setState(110);
			match(COMMA);
			setState(111);
			match(RANDOM);
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
		public BlocoCaracteristicasCriarContext blocoCaracteristicasCriar() {
			return getRuleContext(BlocoCaracteristicasCriarContext.class,0);
		}
		public TerminalNode STRING() { return getToken(FichaParser.STRING, 0); }
		public CriarFichaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criarFicha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterCriarFicha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitCriarFicha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitCriarFicha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriarFichaContext criarFicha() throws RecognitionException {
		CriarFichaContext _localctx = new CriarFichaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_criarFicha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			classe();
			setState(114);
			match(COMMA);
			setState(115);
			((CriarFichaContext)_localctx).nome = match(STRING);
			setState(116);
			match(COMMA);
			setState(117);
			match(NUM);
			setState(118);
			match(COMMA);
			setState(119);
			blocoCaracteristicasCriar();
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
		public BlocoCaracteristicasContext blocoCaracteristicas() {
			return getRuleContext(BlocoCaracteristicasContext.class,0);
		}
		public BlocoAtributosContext blocoAtributos() {
			return getRuleContext(BlocoAtributosContext.class,0);
		}
		public LerFichaProntaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lerFichaPronta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterLerFichaPronta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitLerFichaPronta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitLerFichaPronta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LerFichaProntaContext lerFichaPronta() throws RecognitionException {
		LerFichaProntaContext _localctx = new LerFichaProntaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lerFichaPronta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			declaracaoNome();
			setState(122);
			declaracaoClasse();
			setState(123);
			declaracaoNivel();
			setState(124);
			blocoCaracteristicas();
			setState(125);
			blocoAtributos();
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
	public static class LerFichaProntalvlupContext extends ParserRuleContext {
		public TerminalNode LVLUP() { return getToken(FichaParser.LVLUP, 0); }
		public DeclaracaoNomeContext declaracaoNome() {
			return getRuleContext(DeclaracaoNomeContext.class,0);
		}
		public DeclaracaoClasseContext declaracaoClasse() {
			return getRuleContext(DeclaracaoClasseContext.class,0);
		}
		public DeclaracaoNivelContext declaracaoNivel() {
			return getRuleContext(DeclaracaoNivelContext.class,0);
		}
		public BlocoCaracteristicasContext blocoCaracteristicas() {
			return getRuleContext(BlocoCaracteristicasContext.class,0);
		}
		public BlocoAtributosContext blocoAtributos() {
			return getRuleContext(BlocoAtributosContext.class,0);
		}
		public LerFichaProntalvlupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lerFichaProntalvlup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).enterLerFichaProntalvlup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FichaListener) ((FichaListener)listener).exitLerFichaProntalvlup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FichaVisitor) return ((FichaVisitor<? extends T>)visitor).visitLerFichaProntalvlup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LerFichaProntalvlupContext lerFichaProntalvlup() throws RecognitionException {
		LerFichaProntalvlupContext _localctx = new LerFichaProntalvlupContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lerFichaProntalvlup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LVLUP);
			setState(128);
			declaracaoNome();
			setState(129);
			declaracaoClasse();
			setState(130);
			declaracaoNivel();
			setState(131);
			blocoCaracteristicas();
			setState(132);
			blocoAtributos();
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
		"\u0004\u0001!\u0087\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0004\bI\b\b\u000b\b\f\bJ\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0004\tQ\b\t\u000b\t\f\tR\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b_\b"+
		"\u000b\u000b\u000b\f\u000b`\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000"+
		"\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \u0000\u0003\u0001\u0000\u0007\u000b\u0001\u0000\f"+
		"\u0011\u0001\u0000\u0012\u0016|\u0000%\u0001\u0000\u0000\u0000\u0002."+
		"\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00062\u0001\u0000"+
		"\u0000\u0000\b4\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000\f;"+
		"\u0001\u0000\u0000\u0000\u000e@\u0001\u0000\u0000\u0000\u0010E\u0001\u0000"+
		"\u0000\u0000\u0012N\u0001\u0000\u0000\u0000\u0014V\u0001\u0000\u0000\u0000"+
		"\u0016[\u0001\u0000\u0000\u0000\u0018d\u0001\u0000\u0000\u0000\u001ai"+
		"\u0001\u0000\u0000\u0000\u001cq\u0001\u0000\u0000\u0000\u001ey\u0001\u0000"+
		"\u0000\u0000 \u007f\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000"+
		"#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000()\u0005\u0000\u0000\u0001)\u0001\u0001\u0000\u0000\u0000"+
		"*/\u0003\u001c\u000e\u0000+/\u0003\u001a\r\u0000,/\u0003\u001e\u000f\u0000"+
		"-/\u0003 \u0010\u0000.*\u0001\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0003\u0001\u0000"+
		"\u0000\u000001\u0007\u0000\u0000\u00001\u0005\u0001\u0000\u0000\u0000"+
		"23\u0007\u0001\u0000\u00003\u0007\u0001\u0000\u0000\u000045\u0007\u0002"+
		"\u0000\u00005\t\u0001\u0000\u0000\u000067\u0005\u0001\u0000\u000078\u0005"+
		"\u001b\u0000\u000089\u0005\u0017\u0000\u00009:\u0005\u001c\u0000\u0000"+
		":\u000b\u0001\u0000\u0000\u0000;<\u0005\u0002\u0000\u0000<=\u0005\u001b"+
		"\u0000\u0000=>\u0003\u0004\u0002\u0000>?\u0005\u001c\u0000\u0000?\r\u0001"+
		"\u0000\u0000\u0000@A\u0005\u0003\u0000\u0000AB\u0005\u001b\u0000\u0000"+
		"BC\u0005\u0018\u0000\u0000CD\u0005\u001c\u0000\u0000D\u000f\u0001\u0000"+
		"\u0000\u0000EF\u0005\u0004\u0000\u0000FH\u0005\u001d\u0000\u0000GI\u0003"+
		"\u0014\n\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LM\u0005\u001e\u0000\u0000M\u0011\u0001\u0000\u0000\u0000NP\u0005\u001d"+
		"\u0000\u0000OQ\u0003\u0014\n\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TU\u0005\u001e\u0000\u0000U\u0013\u0001\u0000\u0000"+
		"\u0000VW\u0003\u0006\u0003\u0000WX\u0005\u001b\u0000\u0000XY\u0005\u0018"+
		"\u0000\u0000YZ\u0005\u001c\u0000\u0000Z\u0015\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0005\u0000\u0000\\^\u0005\u001d\u0000\u0000]_\u0003\u0018\f"+
		"\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005"+
		"\u001e\u0000\u0000c\u0017\u0001\u0000\u0000\u0000de\u0003\b\u0004\u0000"+
		"ef\u0005\u001b\u0000\u0000fg\u0005\u0018\u0000\u0000gh\u0005\u001c\u0000"+
		"\u0000h\u0019\u0001\u0000\u0000\u0000ij\u0003\u0004\u0002\u0000jk\u0005"+
		"\u001a\u0000\u0000kl\u0005\u0017\u0000\u0000lm\u0005\u001a\u0000\u0000"+
		"mn\u0005\u0018\u0000\u0000no\u0005\u001a\u0000\u0000op\u0005\u0019\u0000"+
		"\u0000p\u001b\u0001\u0000\u0000\u0000qr\u0003\u0004\u0002\u0000rs\u0005"+
		"\u001a\u0000\u0000st\u0005\u0017\u0000\u0000tu\u0005\u001a\u0000\u0000"+
		"uv\u0005\u0018\u0000\u0000vw\u0005\u001a\u0000\u0000wx\u0003\u0012\t\u0000"+
		"x\u001d\u0001\u0000\u0000\u0000yz\u0003\n\u0005\u0000z{\u0003\f\u0006"+
		"\u0000{|\u0003\u000e\u0007\u0000|}\u0003\u0010\b\u0000}~\u0003\u0016\u000b"+
		"\u0000~\u001f\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0006\u0000\u0000"+
		"\u0080\u0081\u0003\n\u0005\u0000\u0081\u0082\u0003\f\u0006\u0000\u0082"+
		"\u0083\u0003\u000e\u0007\u0000\u0083\u0084\u0003\u0010\b\u0000\u0084\u0085"+
		"\u0003\u0016\u000b\u0000\u0085!\u0001\u0000\u0000\u0000\u0005%.JR`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}