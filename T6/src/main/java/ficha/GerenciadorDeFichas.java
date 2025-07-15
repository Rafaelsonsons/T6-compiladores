package ficha;

import java.util.HashMap;
import java.util.Map;

// Nova classe para gerenciar todas as fichas declaradas em um arquivo.
public class GerenciadorDeFichas {

    private final Map<String, TabelaDeSimbolos> todasAsFichas;

    public GerenciadorDeFichas() {
        this.todasAsFichas = new HashMap<>();
    }

    /**
     * Adiciona uma nova ficha ao gerenciador.
     * @param nome O nome do personagem da nova ficha.
     * @return A TabelaDeSimbolos da nova ficha criada.
     */
    public TabelaDeSimbolos novaFicha(String nome) {
        TabelaDeSimbolos novaTabela = new TabelaDeSimbolos();
        todasAsFichas.put(nome, novaTabela);
        return novaTabela;
    }

}
