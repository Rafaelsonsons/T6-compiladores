package ficha;

import org.antlr.v4.runtime.Token;
import java.util.ArrayList;
import java.util.List;

public class AnalisadorSemanticoUtils {

    // Lista de todas as características que são obrigatórias em uma ficha.
    public static final List<String> CARACTERISTICAS_OBRIGATORIAS = new ArrayList<>(
            List.of("Forca", "Destreza", "Constituicao", "Inteligencia", "Sabedoria", "Carisma")
    );

    // Lista para armazenar os erros semânticos encontrados.
    private final List<String> errosSemanticos;

    public AnalisadorSemanticoUtils() {
        this.errosSemanticos = new ArrayList<>();
    }

    /**
     * Adiciona uma mensagem de erro à lista, formatada com a linha e a coluna.
     * @param t O Token onde o erro foi encontrado.
     * @param mensagem A mensagem de erro.
     */
    public void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Erro semantico na linha %d: %s", linha, mensagem));
    }

    /**
     * Verifica se há erros semânticos.
     * @return true se a lista de erros estiver vazia, false caso contrário.
     */
    public boolean semErros() {
        return errosSemanticos.isEmpty();
    }

    /**
     * Retorna a lista de todos os erros encontrados.
     * @return uma List<String> com os erros.
     */
    public List<String> getErrosSemanticos() {
        return errosSemanticos;
    }
}
