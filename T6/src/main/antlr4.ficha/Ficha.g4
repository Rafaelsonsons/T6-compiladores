grammar Ficha;
//Lexic
//Literais para os blocos e declarações
NOME                  : 'Nome';
CLASSE_LITERAL        : 'Classe';
NIVEL                 : 'Nivel';
CARACTERISTICAS_LITERAL : 'Caracteristicas';
ATRIBUTOS_LITERAL     : 'Atributos';
LVLUP                 : 'LVLUP';

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

//Tokens Genéricos
STRING : '"' ( ~["] )* '"';
NUM : [0-9]+;

RANDOM : 'Random' | 'random';

COMMA  : ',';
COLON  : ':';
SEMI   : ';';
LBRACE : '{';
RBRACE : '}';

//White space
WS : [ \t\r\n]+ -> skip;

COMENTARIO
    : '/*' ~('\n'|'\r'|'{'|'}' )* '*/' '\r'? '\n'? {skip();};

COMENTARIO_ABERTO   : '/*' ~('\n'|'\r'|'{'|'}' )* '\r'? '\n'?;

fragment
ESC_SEQ	: '\\\'' | '\\n';

//Syntax
ficha
    : declaracao* EOF
    ;

// Uma declaração pode ser de qualquer um dos tipos abaixo.
declaracao
    : criarFicha
    | criarFichaRANDOM
    | lerFichaPronta
    | lerFichaProntalvlup
    ;
//Nao vai dar tempo de fazer um lerFichaProntalvlupManual
//ideia seria poder alterar os atributos manualmente
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
    : PRECISAO | ARMADURA | INICIATIVA | MOVIMENTO | PV
    ;

// Regra para definir o nome do personagem. Ex: Nome: "Aragorn";
declaracaoNome
    : NOME COLON nome=STRING SEMI
    ;

// Regra para definir a classe. Ex: Classe: Guerreiro;
declaracaoClasse
    : CLASSE_LITERAL COLON tipo=classe SEMI
    ;

declaracaoNivel
    : NIVEL COLON nivel=NUM SEMI
    ;

// Regra para o bloco de características (atributos principais).
blocoCaracteristicas
    : CARACTERISTICAS_LITERAL LBRACE atribuicaoCaracteristica+ RBRACE
    ;

blocoCaracteristicasCriar
    : LBRACE atribuicaoCaracteristica+ RBRACE
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

criarFichaRANDOM
    : classe COMMA nome=STRING COMMA NUM LBRACE
      RANDOM RBRACE
    ;

criarFicha
    : classe COMMA nome=STRING COMMA NUM
    COMMA
    blocoCaracteristicasCriar
    ;

lerFichaPronta
    : declaracaoNome
      declaracaoClasse
      declaracaoNivel
      blocoCaracteristicas
      blocoAtributos
    ;

lerFichaProntalvlup
    : LVLUP
      declaracaoNome
      declaracaoClasse
      declaracaoNivel
      blocoCaracteristicas
      blocoAtributos
    ;