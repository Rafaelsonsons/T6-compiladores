grammar Ficha;
    PalavrasChave:
         'Precisao' | 'Armadura' | 'Iniciativa' |
         'Movimento' | 'PV' | 'PV Max' | 'Forca' | 'Destreza' |
         'Constituicao' | 'Sabedoria' | 'Inteligencia' | 'Carisma' |
         'Guerreiro' | 'Mago' | 'Clerigo' | 'Ladino' | 'Bardo';

    Texto:
        ('A'..'Z')('a'..'z')+ (' ' ('A'..'Z')('a'..'z')+)?;



    Num:
        ('0'..'9')+;

    Caracteristicas:
        'Forca' | 'Destreza' | 'Constituicao' | 'Sabedoria' | 'Inteligencia' | 'Carisma';

    Classe:
        'Guerreiro' | 'Mago' | 'Clerigo' | 'Ladino' | 'Bardo';

    Atributos:
        'Precisao' | 'Armadura' | 'Iniciativa' |
        'Movimento' | 'PV' | 'PV Max';

    Dado:
        'd20' | 'd12' | 'd10' | 'd8' | 'd6' | 'd4';





