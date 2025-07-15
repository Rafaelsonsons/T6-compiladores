// Generated from C:/Users/felip/Desktop/Docs_Yuya/UFSCar/COMPL/T6/src/main/antlr4.ficha/Ficha.g4 by ANTLR 4.13.2
package ficha;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FichaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FichaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FichaParser#ficha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFicha(FichaParser.FichaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FichaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(FichaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FichaParser#declaracaoNome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoNome(FichaParser.DeclaracaoNomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FichaParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoClasse(FichaParser.DeclaracaoClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FichaParser#blocoCaracteristicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoCaracteristicas(FichaParser.BlocoCaracteristicasContext ctx);
	/**
	 * Visit a parse tree produced by {@link FichaParser#atribuicaoCaracteristica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoCaracteristica(FichaParser.AtribuicaoCaracteristicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FichaParser#blocoAtributos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoAtributos(FichaParser.BlocoAtributosContext ctx);
	/**
	 * Visit a parse tree produced by {@link FichaParser#atribuicaoAtributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoAtributo(FichaParser.AtribuicaoAtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FichaParser#classe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasse(FichaParser.ClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FichaParser#caracteristica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaracteristica(FichaParser.CaracteristicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FichaParser#atributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributo(FichaParser.AtributoContext ctx);
}