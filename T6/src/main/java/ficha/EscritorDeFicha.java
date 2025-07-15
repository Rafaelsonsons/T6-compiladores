package ficha;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class EscritorDeFicha {

    private final TabelaDeSimbolos tabela;

    public EscritorDeFicha(TabelaDeSimbolos tabela) {
        this.tabela = tabela;
    }

    /**
     * Escreve a ficha formatada em um arquivo de destino.
     * @param caminhoArquivo O nome do arquivo a ser criado (ex: "ficha_final.txt").
     */
    public void escreverFicha(String caminhoArquivo) {
        // Usando try-with-resources para garantir que o writer seja fechado.
        try (PrintWriter writer = new PrintWriter(new FileWriter(caminhoArquivo))) {

            // Obtém as informações básicas da tabela.
            String nome = tabela.getValor("Nome");
            String classe = tabela.getValor("Classe");
            String nivel = tabela.getValor("Nivel");

            // Escreve as declarações principais.
            writer.println("Nome: \"" + nome + "\";");
            writer.println("Classe: " + classe + ";");
            writer.println("Nivel: " + nivel + ";");
            writer.println();

            // Escreve o bloco de Características.
            writer.println("Caracteristicas {");
            for (String carac : AnalisadorSemanticoUtils.CARACTERISTICAS_OBRIGATORIAS) {
                writer.println("\t" + carac + ": " + tabela.getValor(carac) + ";");
            }
            writer.println("}");
            writer.println();

            // Escreve o bloco de Atributos.
            writer.println("Atributos {");
            // Para encontrar os atributos, pegamos todos os símbolos e removemos os que já conhecemos.
            Set<String> simbolosConhecidos = new HashSet<>(AnalisadorSemanticoUtils.CARACTERISTICAS_OBRIGATORIAS);
            simbolosConhecidos.add("Nome");
            simbolosConhecidos.add("Classe");
            simbolosConhecidos.add("Nivel");

            for (String simbolo : tabela.todosOsSimbolos()) {
                if (!simbolosConhecidos.contains(simbolo)) {
                    writer.println("\t" + simbolo + ": " + tabela.getValor(simbolo) + ";");
                }
            }
            writer.println("}");

        } catch (IOException e) {
            System.err.println("Nao foi possivel escrever a ficha no arquivo: " + e.getMessage());
        }
    }
}