package ficha;

import org.antlr.v4.runtime.Token;
import java.util.ArrayList;
import java.util.List;

public class AnalisadorSemanticoUtils {

    public static final List<String> CARACTERISTICAS_OBRIGATORIAS = new ArrayList<>(
            List.of("Forca", "Destreza", "Constituicao", "Inteligencia", "Sabedoria", "Carisma")
    );

    public static final List<String> ATRIBUTOS_OBRIGATORIOS = new ArrayList<>(
            List.of("Precisao", "Armadura", "Iniciativa", "Movimento", "PV")
    );

    private final List<String> errosSemanticos;

    public AnalisadorSemanticoUtils() {
        this.errosSemanticos = new ArrayList<>();
    }

    public void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Erro semantico na linha %d: %s", linha, mensagem));
    }

    public boolean semErros() {
        return errosSemanticos.isEmpty();
    }

    public List<String> getErrosSemanticos() {
        return errosSemanticos;
    }
}
