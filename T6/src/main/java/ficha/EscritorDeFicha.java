package ficha;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.random.RandomGenerator;

public class EscritorDeFicha {

    Random d6 = new Random();
    int d6min = 1;
    int d6max = 6;

    private final TabelaDeSimbolos tabela;

    public EscritorDeFicha(TabelaDeSimbolos tabela) {
        this.tabela = tabela;
    }

    public void escreverFicha(String caminhoArquivo) {
        // Usando try-with-resources para garantir que o writer seja fechado.
        try (PrintWriter writer = new PrintWriter(new FileWriter(caminhoArquivo))) {

            ArrayList<Integer> caracvalues = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                caracvalues.add(d6.nextInt(d6min, d6max)+d6.nextInt(d6min, d6max)+d6.nextInt(d6min, d6max));}
            int aux = 0;

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
                writer.println("\t" + carac + ": " + caracvalues.get(aux) + ";");
                aux++;
            }
            writer.println("}");
            writer.println();
            aux = 0;
            // Escreve o bloco de Atributos.
            writer.println("Atributos {");
            // Para encontrar os atributos, pegamos todos os símbolos e removemos os que já conhecemos.
            for (String atrib : AnalisadorSemanticoUtils.ATRIBUTOS_OBRIGATORIOS) {
                writer.println("\t" + atrib + ": " + caracvalues.get(aux)+ ";");
            }
            writer.println("}");

        } catch (IOException e) {
            System.err.println("Nao foi possivel escrever a ficha no arquivo: " + e.getMessage());
        }
    }
}