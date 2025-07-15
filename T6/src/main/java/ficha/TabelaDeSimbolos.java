package ficha;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TabelaDeSimbolos {

    private final Map<String, String> tabela;

    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    /**
     * Adiciona um símbolo à tabela.
     * @param nome O nome do símbolo (ex: "Forca", "Nome").
     * @param tipo O tipo do símbolo (ex: "caracteristica", "classe").
     */
    public void adicionar(String nome, String tipo) {
        tabela.put(nome, tipo);
    }

    /**
     * Verifica se um símbolo já existe na tabela.
     * @param nome O nome do símbolo.
     * @return true se o símbolo existe, false caso contrário.
     */
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }

    /**
     * Retorna o conjunto de todos os nomes de símbolos na tabela.
     * @return um Set<String> com os nomes dos símbolos.
     */
    public Set<String> todosOsSimbolos() {
        return tabela.keySet();
    }
}
