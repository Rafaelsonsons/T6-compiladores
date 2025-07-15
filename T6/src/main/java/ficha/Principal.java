package ficha;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        try {
            // Argumento de entrada: caminho para o arquivo com o código-fonte
            CharStream cs = CharStreams.fromFileName(args[0]);
            FichaLexer lexer = new FichaLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FichaParser parser = new FichaParser(tokens);

            // Remove o error listener padrão para não poluir o console.
            parser.removeErrorListeners();
            // Adiciona nosso error listener customizado (se você criar um).
            // Por enquanto, vamos apenas verificar o número de erros.

            // Inicia a análise sintática pela regra 'ficha'
            FichaParser.FichaContext arvore = parser.ficha();

            // Se não houver erros sintáticos, prossiga para a análise semântica.
            if (parser.getNumberOfSyntaxErrors() == 0) {
                AnalisadorSemantico semantico = new AnalisadorSemantico();
                semantico.visit(arvore);

                // Após a análise, verifica se foram encontrados erros semânticos.
                AnalisadorSemanticoUtils utils = semantico.getUtils();
                if (utils.semErros()) {
                    System.out.println("Compilacao bem-sucedida!");
                    // Aqui seria o local para chamar o Gerador de Código
                } else {
                    // Imprime todos os erros semânticos encontrados.
                    utils.getErrosSemanticos().forEach(System.out::println);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
