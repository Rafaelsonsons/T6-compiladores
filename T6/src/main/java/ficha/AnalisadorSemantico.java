package ficha;

public class AnalisadorSemantico extends FichaBaseVisitor<Void> {

    private final TabelaDeSimbolos tabela;
    private final AnalisadorSemanticoUtils utils;

    public AnalisadorSemantico() {
        this.tabela = new TabelaDeSimbolos();
        this.utils = new AnalisadorSemanticoUtils();
    }

    public AnalisadorSemanticoUtils getUtils() {
        return utils;
    }

    // REGRA 1: A ficha só pode ter uma declaração de 'Nome'.
    @Override
    public Void visitDeclaracaoNome(FichaParser.DeclaracaoNomeContext ctx) {
        if (tabela.existe("Nome")) {
            utils.adicionarErroSemantico(ctx.getStart(), "Nome do personagem ja foi declarado.");
        } else {
            tabela.adicionar("Nome", "declaracao_nome");
        }
        return super.visitDeclaracaoNome(ctx);
    }

    // REGRA 2: A ficha só pode ter uma declaração de 'Classe'.
    @Override
    public Void visitDeclaracaoClasse(FichaParser.DeclaracaoClasseContext ctx) {
        if (tabela.existe("Classe")) {
            utils.adicionarErroSemantico(ctx.getStart(), "Classe do personagem ja foi declarada.");
        } else {
            tabela.adicionar("Classe", "declaracao_classe");
        }
        return super.visitDeclaracaoClasse(ctx);
    }

    // REGRA 3: Não pode haver características repetidas.
    @Override
    public Void visitAtribuicaoCaracteristica(FichaParser.AtribuicaoCaracteristicaContext ctx) {
        String nomeCaracteristica = ctx.nome.getText();
        if (tabela.existe(nomeCaracteristica)) {
            utils.adicionarErroSemantico(ctx.nome.getStart(), "Caracteristica '" + nomeCaracteristica + "' ja foi declarada.");
        } else {
            tabela.adicionar(nomeCaracteristica, "caracteristica");
        }
        return super.visitAtribuicaoCaracteristica(ctx);
    }

    // REGRA 4: Não pode haver atributos repetidos.
    @Override
    public Void visitAtribuicaoAtributo(FichaParser.AtribuicaoAtributoContext ctx) {
        String nomeAtributo = ctx.nome.getText();
        if (tabela.existe(nomeAtributo)) {
            utils.adicionarErroSemantico(ctx.nome.getStart(), "Atributo '" + nomeAtributo + "' ja foi declarado.");
        } else {
            tabela.adicionar(nomeAtributo, "atributo");
        }
        return super.visitAtribuicaoAtributo(ctx);
    }

    // REGRA 5: Ao final, verificar se todas as características obrigatórias foram declaradas.
    @Override
    public Void visitFicha(FichaParser.FichaContext ctx) {
        // Primeiro, visita todas as declarações para popular a tabela.
        super.visitFicha(ctx);

        // Após visitar tudo, verifica as regras globais.
        for (String caracteristicaObrigatoria : AnalisadorSemanticoUtils.CARACTERISTICAS_OBRIGATORIAS) {
            if (!tabela.existe(caracteristicaObrigatoria)) {
                // Se não existe, adiciona um erro na primeira linha do arquivo.
                utils.adicionarErroSemantico(ctx.getStart(), "Caracteristica obrigatoria '" + caracteristicaObrigatoria + "' nao foi declarada.");
            }
        }
        return null;
    }
}
