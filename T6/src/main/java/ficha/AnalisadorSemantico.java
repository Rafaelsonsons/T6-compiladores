package ficha;

import org.antlr.v4.runtime.Token;

public class AnalisadorSemantico extends FichaBaseVisitor<Void> {

    private final TabelaDeSimbolos tabela;
    private final AnalisadorSemanticoUtils utils;

    public AnalisadorSemantico() {
        this.tabela = new TabelaDeSimbolos(); // A tabela é criada uma vez.
        this.utils = new AnalisadorSemanticoUtils();
    }

    public TabelaDeSimbolos getTabela() { return tabela; }

    public AnalisadorSemanticoUtils getUtils() {
        return utils;
    }

    // Remove as aspas de uma string (ex: "Aragorn" -> Aragorn)
    private String limparString(String texto) {
        return texto.substring(1, texto.length() - 1);
    }

    @Override
    public Void visitCriarFicha(FichaParser.CriarFichaContext ctx) {
        // Adiciona as informações básicas da ficha na tabela global.
        tabela.adicionar("Nome", limparString(ctx.nome.getText()));
        tabela.adicionar("Classe", ctx.classe().getText());
        tabela.adicionar("Nivel", ctx.NUM().getText());

        // Visita os filhos (blocoAtributos e blocoCaracteristicas) para popular o resto da tabela.
        super.visitCriarFicha(ctx);

        // REGRA FINAL: Verifica se todas as características obrigatórias foram definidas.
        // Esta verificação é feita após visitar toda a árvore de 'criarFicha'.
        for (String caracteristicaObrigatoria : AnalisadorSemanticoUtils.CARACTERISTICAS_OBRIGATORIAS) {
            if (!tabela.existe(caracteristicaObrigatoria)) {
                utils.adicionarErroSemantico(ctx.getStart(), "A caracteristica obrigatoria '" + caracteristicaObrigatoria + "' nao foi declarada.");
            }
        }

        return null;
    }

    @Override
    public Void visitCriarFichaRANDOM(FichaParser.CriarFichaRANDOMContext ctx) {
        // Para a ficha RANDOM, apenas adicionamos as informações básicas.
        // Não há necessidade de verificar características obrigatórias.
        tabela.adicionar("Nome", limparString(ctx.nome.getText()));
        tabela.adicionar("Classe", ctx.classe().getText());
        tabela.adicionar("Nivel", ctx.NUM().getText());
        tabela.adicionar("Stats", "Random"); // Marca que os stats são aleatórios

        return null;
    }

    // REGRA: Não pode haver características repetidas.
    @Override
    public Void visitAtribuicaoCaracteristica(FichaParser.AtribuicaoCaracteristicaContext ctx) {
        String nomeCaracteristica = ctx.nome.getText();
        if (tabela.existe(nomeCaracteristica)) {
            utils.adicionarErroSemantico(ctx.nome.getStart(), "A caracteristica '" + nomeCaracteristica + "' ja foi declarada.");
        } else {
            // MODIFICAÇÃO: Salvar o valor numérico em vez de apenas "característica"
            String valor = ctx.valor.getText();
            tabela.adicionar(nomeCaracteristica, valor);
        }
        // A visita aos filhos não é necessária aqui, pois não há sub-regras.
        return null;
    }

    // REGRA: Não pode haver atributos repetidos.
    @Override
    public Void visitAtribuicaoAtributo(FichaParser.AtribuicaoAtributoContext ctx) {
        String nomeAtributo = ctx.nome.getText();
        if (tabela.existe(nomeAtributo)) {
            utils.adicionarErroSemantico(ctx.nome.getStart(), "O atributo '" + nomeAtributo + "' ja foi declarado.");
        } else {
            // MODIFICAÇÃO: Salvar o valor numérico em vez de apenas "atributo"
            String valor = ctx.valor.getText();
            tabela.adicionar(nomeAtributo, valor);
        }
        // A visita aos filhos não é necessária aqui.
        return null;
    }
}
