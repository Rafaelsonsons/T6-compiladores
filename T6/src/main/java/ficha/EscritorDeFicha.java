package ficha;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.random.RandomGenerator;

public class EscritorDeFicha {

    private final TabelaDeSimbolos tabela;

    public EscritorDeFicha(TabelaDeSimbolos tabela) {
        this.tabela = tabela;
    }

    public void escreverFicha(String caminhoArquivo) {
        // Usando try-with-resources para garantir que o writer seja fechado.
        try (PrintWriter writer = new PrintWriter(new FileWriter(caminhoArquivo))) {
            Random d6 = new Random();
            int d6min = 1;
            int d6max = 6;

            int aux = 0;

            // Obtém as informações básicas da tabela.
            String nome = tabela.getValor("Nome");
            String classe = tabela.getValor("Classe");
            int nivel = Integer.parseInt(tabela.getValor("Nivel"));

            ArrayList<Integer> caracvalues = new ArrayList<>();
            ArrayList<Integer> atribvals = new ArrayList<>();

            int forca;
            int destreza;
            int constituicao;
            int inteligencia;
            int sabedoria;
            int carisma;

            int precisao;
            int armadura;
            int iniciativa;
            int movimento;
            int pv;



            switch (tabela.getValor("Tipo")){

                case "Random":

                    for (int i = 0; i < 6; i++) {
                        caracvalues.add(d6.nextInt(d6min, d6max)+d6.nextInt(d6min, d6max)+d6.nextInt(d6min, d6max));}

                    atribvals.add(caracvalues.get(1)+ Integer.valueOf(tabela.getValor("Nivel")));
                    atribvals.add(caracvalues.get(0) + caracvalues.get(2)); //bora botar armadura como for + con
                    atribvals.add(caracvalues.get(1));
                    atribvals.add(caracvalues.get(1) * 10);
                    atribvals.add(caracvalues.get(3) * Integer.valueOf(tabela.getValor("Nivel")));
                    //definindo os atributos na gambiarra mesmo kkkkk
                    aux = 0;

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
                        writer.println("\t" + atrib + ": " + atribvals.get(aux)+ ";");
                        aux++;
                    }
                    writer.println("}");

                    break;

                case "Manual":
                    // Escreve as declarações principais.
                    writer.println("Nome: \"" + nome + "\";");
                    writer.println("Classe: " + classe + ";");
                    writer.println("Nivel: " + nivel + ";");
                    writer.println();

                    forca = Integer.parseInt(tabela.getValor("Forca"));
                    destreza = Integer.parseInt(tabela.getValor("Destreza"));
                    constituicao = Integer.parseInt(tabela.getValor("Constituicao"));
                    inteligencia = Integer.parseInt(tabela.getValor("Inteligencia"));
                    sabedoria = Integer.parseInt(tabela.getValor("Sabedoria"));
                    carisma = Integer.parseInt(tabela.getValor("Carisma"));

                    caracvalues.add(forca);
                    caracvalues.add(destreza);
                    caracvalues.add(constituicao);
                    caracvalues.add(inteligencia);
                    caracvalues.add(sabedoria);
                    caracvalues.add(carisma);

                    aux = 0;
                    writer.println("Caracteristicas {");
                    for (String carac : AnalisadorSemanticoUtils.CARACTERISTICAS_OBRIGATORIAS) {
                        writer.println("\t" + carac + ": " + caracvalues.get(aux) + ";");
                        aux++;
                    }
                    writer.println("}");
                    writer.println();

                    atribvals.add(destreza + Integer.valueOf(tabela.getValor("Nivel")));
                    atribvals.add(forca + constituicao); //bora botar armadura como for + con
                    atribvals.add(destreza);
                    atribvals.add(destreza * 10);
                    atribvals.add(constituicao * Integer.valueOf(tabela.getValor("Nivel")));

                    aux = 0;
                    // Escreve o bloco de Atributos.
                    writer.println("Atributos {");
                    // Para encontrar os atributos, pegamos todos os símbolos e removemos os que já conhecemos.
                    for (String atrib : AnalisadorSemanticoUtils.ATRIBUTOS_OBRIGATORIOS) {
                        writer.println("\t" + atrib + ": " + atribvals.get(aux)+ ";");
                        aux++;
                    }
                    writer.println("}");

                    break;

                case "Ler":

                    writer.println("Nome: \"" + nome + "\";");
                    writer.println("Classe: " + classe + ";");
                    writer.println("Nivel: " + nivel + ";");
                    writer.println();

                    forca = Integer.parseInt(tabela.getValor("Forca"));
                    destreza = Integer.parseInt(tabela.getValor("Destreza"));
                    constituicao = Integer.parseInt(tabela.getValor("Constituicao"));
                    inteligencia = Integer.parseInt(tabela.getValor("Inteligencia"));
                    sabedoria = Integer.parseInt(tabela.getValor("Sabedoria"));
                    carisma = Integer.parseInt(tabela.getValor("Carisma"));

                    caracvalues.add(forca);
                    caracvalues.add(destreza);
                    caracvalues.add(constituicao);
                    caracvalues.add(inteligencia);
                    caracvalues.add(sabedoria);
                    caracvalues.add(carisma);

                    aux = 0;
                    writer.println("Caracteristicas {");
                    for (String carac : AnalisadorSemanticoUtils.CARACTERISTICAS_OBRIGATORIAS) {
                        writer.println("\t" + carac + ": " + caracvalues.get(aux) + ";");
                        aux++;
                    }
                    writer.println("}");
                    writer.println();

                    precisao = Integer.parseInt(tabela.getValor("Precisao"));
                    armadura = Integer.parseInt(tabela.getValor("Armadura"));
                    iniciativa = Integer.parseInt(tabela.getValor("Iniciativa"));
                    movimento = Integer.parseInt(tabela.getValor("Movimento"));
                    pv = Integer.parseInt(tabela.getValor("PV"));


                    atribvals.add(precisao);
                    atribvals.add(armadura);
                    atribvals.add(iniciativa);
                    atribvals.add(movimento);
                    atribvals.add(pv);

                    aux = 0;
                    // Escreve o bloco de Atributos.
                    writer.println("Atributos {");
                    // Para encontrar os atributos, pegamos todos os símbolos e removemos os que já conhecemos.
                    for (String atrib : AnalisadorSemanticoUtils.ATRIBUTOS_OBRIGATORIOS) {
                        writer.println("\t" + atrib + ": " + atribvals.get(aux)+ ";");
                        aux++;
                    }
                    writer.println("}");

                    break;

                case "UP":

                    nivel = nivel + 1;
                    writer.println("Nome: \"" + nome + "\";");
                    writer.println("Classe: " + classe + ";");
                    writer.println("Nivel: " + nivel + ";");
                    writer.println();

                    forca = Integer.parseInt(tabela.getValor("Forca")) + d6.nextInt(d6min,d6max);
                    destreza = Integer.parseInt(tabela.getValor("Destreza")) + d6.nextInt(d6min,d6max);
                    constituicao = Integer.parseInt(tabela.getValor("Constituicao")) + d6.nextInt(d6min,d6max);
                    inteligencia = Integer.parseInt(tabela.getValor("Inteligencia")) + d6.nextInt(d6min,d6max);
                    sabedoria = Integer.parseInt(tabela.getValor("Sabedoria")) + d6.nextInt(d6min,d6max);
                    carisma = Integer.parseInt(tabela.getValor("Carisma")) + d6.nextInt(d6min,d6max);

                    caracvalues.add(forca);
                    caracvalues.add(destreza);
                    caracvalues.add(constituicao);
                    caracvalues.add(inteligencia);
                    caracvalues.add(sabedoria);
                    caracvalues.add(carisma);

                    aux = 0;
                    writer.println("Caracteristicas {");
                    for (String carac : AnalisadorSemanticoUtils.CARACTERISTICAS_OBRIGATORIAS) {
                        writer.println("\t" + carac + ": " + caracvalues.get(aux) + ";");
                        aux++;
                    }
                    writer.println("}");
                    writer.println();

                    //revendo os atributos pelo lvl up
                    atribvals.add(destreza + Integer.valueOf(tabela.getValor("Nivel")));
                    atribvals.add(forca + constituicao); //bora botar armadura como for + con
                    atribvals.add(destreza);
                    atribvals.add(destreza * 10);
                    atribvals.add(constituicao * Integer.valueOf(tabela.getValor("Nivel")));

                    aux = 0;
                    // Escreve o bloco de Atributos.
                    writer.println("Atributos {");
                    // Para encontrar os atributos, pegamos todos os símbolos e removemos os que já conhecemos.
                    for (String atrib : AnalisadorSemanticoUtils.ATRIBUTOS_OBRIGATORIOS) {
                        writer.println("\t" + atrib + ": " + atribvals.get(aux)+ ";");
                        aux++;
                    }
                    writer.println("}");

                    break;

                default: writer.println("Ficha inválida!");
            };

        } catch (IOException e) {
            System.err.println("Nao foi possivel escrever a ficha no arquivo: " + e.getMessage());
        }
    }
}