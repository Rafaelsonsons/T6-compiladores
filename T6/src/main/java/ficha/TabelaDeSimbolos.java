package ficha;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {

    private final Map<String, String> tabela;

    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    public void adicionar(String nome, String tipo) {
        tabela.put(nome, tipo);
    }

    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }

    public String getValor(String nome) {
        return tabela.get(nome);
    }

}
