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

        tabela.adicionar("Tipo", "Manual");

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
        tabela.adicionar("Tipo", "Random"); // Marca que os stats são aleatórios

        return null;
    }

    @Override
    public Void visitLerFichaPronta(FichaParser.LerFichaProntaContext ctx) {
        tabela.adicionar("Nome", limparString(ctx.declaracaoNome().nome.getText()));
        tabela.adicionar("Classe", ctx.declaracaoClasse().classe().getText());
        tabela.adicionar("Nivel", ctx.declaracaoNivel().nivel.getText());
        //esse tipo marca qual saida vai dar no txt
        tabela.adicionar("Tipo", "Ler");

        super.visitLerFichaPronta(ctx);

        for (String caracteristicaObrigatoria : AnalisadorSemanticoUtils.CARACTERISTICAS_OBRIGATORIAS) {
            if (!tabela.existe(caracteristicaObrigatoria)) {
                utils.adicionarErroSemantico(ctx.getStart(), "A caracteristica obrigatoria '" + caracteristicaObrigatoria + "' nao foi declarada.");
            }
        }

        for (String atributoObrigatorio : AnalisadorSemanticoUtils.ATRIBUTOS_OBRIGATORIOS) {
            if (!tabela.existe(atributoObrigatorio)) {
                utils.adicionarErroSemantico(ctx.getStart(), "O atributo obrigatorio '" + atributoObrigatorio + "' nao foi declarado.");
            }
        }


        return null;
    }

    @Override
    public Void visitLerFichaProntalvlup (FichaParser.LerFichaProntalvlupContext ctx) {

        tabela.adicionar("Nome", limparString(ctx.declaracaoNome().nome.getText()));
        tabela.adicionar("Classe", ctx.declaracaoClasse().classe().getText());
        tabela.adicionar("Nivel", ctx.declaracaoNivel().nivel.getText());

        tabela.adicionar("Tipo", "UP");

        super.visitLerFichaProntalvlup(ctx);

        for (String caracteristicaObrigatoria : AnalisadorSemanticoUtils.CARACTERISTICAS_OBRIGATORIAS) {
            if (!tabela.existe(caracteristicaObrigatoria)) {
                utils.adicionarErroSemantico(ctx.getStart(), "A caracteristica obrigatoria '" + caracteristicaObrigatoria + "' nao foi declarada.");
            }
        }
        //mesma coisa que os outros
        for (String atributoObrigatorio : AnalisadorSemanticoUtils.ATRIBUTOS_OBRIGATORIOS) {
            if (!tabela.existe(atributoObrigatorio)) {
                utils.adicionarErroSemantico(ctx.getStart(), "O atributo obrigatorio '" + atributoObrigatorio + "' nao foi declarado.");
            }
        }

        return null;
    }

    // REGRA: Não pode haver características repetidas.
    @Override
    public Void visitAtribuicaoCaracteristica(FichaParser.AtribuicaoCaracteristicaContext ctx) {
        String nomeCaracteristica = ctx.nome.getText();
        if (tabela.existe(nomeCaracteristica)) {
            utils.adicionarErroSemantico(ctx.nome.getStart(), "A caracteristica '" + nomeCaracteristica + "' ja foi declarada.");
        } else {
            //ello, se voce estah lendo isso, eh pq eu vou me ferrar kkkkk
            String valor = ctx.valor.getText();
            tabela.adicionar(nomeCaracteristica, valor);
        }
        // poh soh comentario sem nocao aki mas e soh na zueira kkkkkkk
        return null;
    }

    // REGRA: Não pode haver atributos repetidos.
    @Override
    public Void visitAtribuicaoAtributo(FichaParser.AtribuicaoAtributoContext ctx) {
        String nomeAtributo = ctx.nome.getText();
        if (tabela.existe(nomeAtributo)) {
            utils.adicionarErroSemantico(ctx.nome.getStart(), "O atributo '" + nomeAtributo + "' ja foi declarado.");
        } else {
            String valor = ctx.valor.getText();
            tabela.adicionar(nomeAtributo, valor);
        }

        return null;
    }
}
