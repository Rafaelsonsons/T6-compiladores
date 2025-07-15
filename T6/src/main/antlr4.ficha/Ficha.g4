grammar Ficha;

//sytax
ficha
    : declaracao* EOF
    ;

// Uma declaração pode ser de qualquer um dos tipos abaixo.
declaracao
    : declaracaoNome
    | declaracaoClasse
    | blocoCaracteristicas
    | blocoAtributos
    ;

// Regra para definir o nome do personagem. Ex: Nome: "Aragorn";
declaracaoNome
    : NOME COLON nome=STRING SEMI
    ;

// Regra para definir a classe. Ex: Classe: Guerreiro;
declaracaoClasse
    : CLASSE_LITERAL COLON tipo=classe SEMI
    ;

// Regra para o bloco de características (atributos principais).
blocoCaracteristicas
    : CARACTERISTICAS_LITERAL LBRACE atribuicaoCaracteristica+ RBRACE
    ;

// Regra para uma única linha de característica. Ex: Forca: 18;
atribuicaoCaracteristica
    : nome=caracteristica COLON valor=NUM SEMI
    ;

// Regra para o bloco de atributos (estatísticas secundárias).
blocoAtributos
    : ATRIBUTOS_LITERAL LBRACE atribuicaoAtributo+ RBRACE
    ;

// Regra para uma única linha de atributo. Ex: PV: 12;
atribuicaoAtributo
    : nome=atributo COLON valor=NUM SEMI
    ;

// Tipos de classes permitidas (referencia os tokens do lexer).
classe
    : GUERREIRO | MAGO | CLERIGO | LADINO | BARDO
    ;

// Tipos de características permitidas.
caracteristica
    : FORCA | DESTREZA | CONSTITUICAO | INTELIGENCIA | SABEDORIA | CARISMA
    ;

// Tipos de atributos permitidos.
atributo
    : PRECISAO | ARMADURA | INICIATIVA | MOVIMENTO | PV | PV_MAX
    ;

//Lexic
//Literais para os blocos e declarações
NOME                  : 'Nome';
CLASSE_LITERAL        : 'Classe';
CARACTERISTICAS_LITERAL : 'Caracteristicas';
ATRIBUTOS_LITERAL     : 'Atributos';

//Tokens para as Classes
GUERREIRO : 'Guerreiro';
MAGO      : 'Mago';
CLERIGO   : 'Clerigo';
LADINO    : 'Ladino';
BARDO     : 'Bardo';

//Tokens para as Características
FORCA        : 'Forca';
DESTREZA     : 'Destreza';
CONSTITUICAO : 'Constituicao';
SABEDORIA    : 'Sabedoria';
INTELIGENCIA : 'Inteligencia';
CARISMA      : 'Carisma';

//Tokens para os Atributos Secundários
PRECISAO   : 'Precisao';
ARMADURA   : 'Armadura';
INICIATIVA : 'Iniciativa';
MOVIMENTO  : 'Movimento';
PV         : 'PV';
PV_MAX     : 'PV Max';

//Tokens para os Dados
D20 : 'd20';
D12 : 'd12';
D10 : 'd10';
D8  : 'd8';
D6  : 'd6';
D4  : 'd4';

//Tokens Genéricos
STRING : '"' ( ~["] )* '"';
NUM : [0-9]+;

LBRACE : '{';
RBRACE : '}';
COLON  : ':';
SEMI   : ';';

//White space
WS : [ \t\r\n]+ -> skip;

COMMENT : '//' ~[\r\n]* -> skip;