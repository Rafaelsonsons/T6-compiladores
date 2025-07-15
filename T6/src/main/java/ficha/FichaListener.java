// Generated from C:/Users/felip/Desktop/Docs_Yuya/UFSCar/COMPL/T6-Compiladores/T6/src/main/antlr4.ficha/Ficha.g4 by ANTLR 4.13.2
package ficha;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FichaParser}.
 */
public interface FichaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FichaParser#ficha}.
	 * @param ctx the parse tree
	 */
	void enterFicha(FichaParser.FichaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#ficha}.
	 * @param ctx the parse tree
	 */
	void exitFicha(FichaParser.FichaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(FichaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(FichaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#classe}.
	 * @param ctx the parse tree
	 */
	void enterClasse(FichaParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#classe}.
	 * @param ctx the parse tree
	 */
	void exitClasse(FichaParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#caracteristica}.
	 * @param ctx the parse tree
	 */
	void enterCaracteristica(FichaParser.CaracteristicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#caracteristica}.
	 * @param ctx the parse tree
	 */
	void exitCaracteristica(FichaParser.CaracteristicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(FichaParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(FichaParser.AtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#declaracaoNome}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoNome(FichaParser.DeclaracaoNomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#declaracaoNome}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoNome(FichaParser.DeclaracaoNomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoClasse(FichaParser.DeclaracaoClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoClasse(FichaParser.DeclaracaoClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#declaracaoNivel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoNivel(FichaParser.DeclaracaoNivelContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#declaracaoNivel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoNivel(FichaParser.DeclaracaoNivelContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#blocoCaracteristicas}.
	 * @param ctx the parse tree
	 */
	void enterBlocoCaracteristicas(FichaParser.BlocoCaracteristicasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#blocoCaracteristicas}.
	 * @param ctx the parse tree
	 */
	void exitBlocoCaracteristicas(FichaParser.BlocoCaracteristicasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#atribuicaoCaracteristica}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoCaracteristica(FichaParser.AtribuicaoCaracteristicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#atribuicaoCaracteristica}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoCaracteristica(FichaParser.AtribuicaoCaracteristicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#blocoAtributos}.
	 * @param ctx the parse tree
	 */
	void enterBlocoAtributos(FichaParser.BlocoAtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#blocoAtributos}.
	 * @param ctx the parse tree
	 */
	void exitBlocoAtributos(FichaParser.BlocoAtributosContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#atribuicaoAtributo}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoAtributo(FichaParser.AtribuicaoAtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#atribuicaoAtributo}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoAtributo(FichaParser.AtribuicaoAtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#criarFichaRANDOM}.
	 * @param ctx the parse tree
	 */
	void enterCriarFichaRANDOM(FichaParser.CriarFichaRANDOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#criarFichaRANDOM}.
	 * @param ctx the parse tree
	 */
	void exitCriarFichaRANDOM(FichaParser.CriarFichaRANDOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#criarFicha}.
	 * @param ctx the parse tree
	 */
	void enterCriarFicha(FichaParser.CriarFichaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#criarFicha}.
	 * @param ctx the parse tree
	 */
	void exitCriarFicha(FichaParser.CriarFichaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FichaParser#lerFichaPronta}.
	 * @param ctx the parse tree
	 */
	void enterLerFichaPronta(FichaParser.LerFichaProntaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FichaParser#lerFichaPronta}.
	 * @param ctx the parse tree
	 */
	void exitLerFichaPronta(FichaParser.LerFichaProntaContext ctx);
}