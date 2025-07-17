# Compiladores - T6: Compilador de fichas  

- Felipe Yuya Sato RA: 802444  
- Rafael Martins Cavalheiro Andrade RA: 800446

### Vídeo apresentando a proposta

[Link para o vídeo no YouTube](https://www.youtube.com/watch?v=Z6U7qp2gnsU)

### Descrição do projeto

Este projeto envolve a criação e gerenciamento de fichas para RPG, com uma linguagem simples permitindo a criação de personagens de forma randomizada

```
Bardo, "Kris", 11, Random
```

ou com os atributos já pré-determinados

```
Mago, "Rogério", 5, {
Forca: 8;
Destreza: 14;
Constituição: 10;
Inteligência: 17;
Sabedoria: 13;
Carisma: 11;
}
```

além de uma funcionalidade de subida de nível, bastando adicionar a expressão LVLUP acima de uma ficha já formatada pelo compilador

```
LVLUP
Mago, "Rogério", 5, {
Forca: 8;
Destreza: 14;
Constituição: 10;
Inteligência: 17;
Sabedoria: 13;
Carisma: 11;
}
```

### Compilação  

Tendo clonado esse repositório, vá até o diretório do programa e compile com Maven:

```
mvn clean package
```

### Execução  

Compile com java passando dois argumentos:

1. O caminho literal até o arquivo com o código da(s) ficha(s)
2. O caminho literal até o arquivo onde a saída será escrita

```
java -jar T6-1.0-SNAPSHOT-jar-with-dependencies.jar ~/path/to/input/file.txt ~/path/to/output/file.txt
```

