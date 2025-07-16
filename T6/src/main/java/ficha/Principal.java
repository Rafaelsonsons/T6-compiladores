package ficha;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        // Defina aqui o nome do arquivo de entrada e saída.
        String arquivoEntrada = args[0];
        String arquivoSaida = args[1];

        try {
            // 1. Cria o fluxo de caracteres a partir do arquivo de entrada.
            CharStream cs = CharStreams.fromFileName(arquivoEntrada);

            // 2. Cria o analisador léxico (Lexer).
            FichaLexer lexer = new FichaLexer(cs);

            // 3. Cria o fluxo de tokens a partir do Lexer.
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 4. Cria o analisador sintático (Parser).
            FichaParser parser = new FichaParser(tokens);

            // 5. Inicia a análise sintática pela regra 'ficha' e obtém a árvore.
            ParseTree arvore = parser.ficha();

            // 6. Cria o analisador semântico.
            AnalisadorSemantico analisador = new AnalisadorSemantico();
            analisador.visit(arvore); // Executa a análise na árvore.

            // 7. Verifica se existem erros semânticos.
            AnalisadorSemanticoUtils utils = analisador.getUtils();
            if (utils.semErros()) {
                System.out.println("Analise semantica concluida com sucesso!");

                EscritorDeFicha escritor = new EscritorDeFicha(analisador.getTabela());
                escritor.escreverFicha(arquivoSaida);
                System.out.println("Ficha gerada com sucesso em '" + arquivoSaida + "'");

            } else {
                // Se houver erros, imprime-os.
                System.err.println("Foram encontrados erros semanticos:");
                for (String erro : utils.getErrosSemanticos()) {
                    System.err.println("- " + erro);
                }
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de entrada: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}