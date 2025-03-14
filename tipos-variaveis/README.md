# Aula de Aprendendo a Sintaxe Java - Introdução - Curso DIO

Nesta aula, dei os primeiros passos na sintaxe da linguagem Java, aprendendo sobre variáveis, tipos de dados, constantes
e boas práticas de programação. Foi uma introdução essencial para entender como o Java lida com dados e como podemos
armazenar e manipular informações em um programa.

Abaixo, compartilho o código utilizado como exemplo durante a aula, juntamente com comentários e observações sobre cada
parte:

---

### Código da Aula: `TiposVariaveis.java`

```java
public class TiposVariaveis {
   public static void main(String[] args) {
      // Declaração de uma variável do tipo short
      short numeroCurto = 1;

      // Atribuição de um short a um int (não precisa de casting, pois int é maior que short)
      int numeroNormal = numeroCurto;

      // Atribuição de um int a um short (Precisa de casting, pois int é maior que short)
      short numeroCurto2 = (short) numeroNormal;

      /*
       Exemplo de reatribuição de valor a uma variável.
       A variável 'numero', é inicializada com o valor 5,
       mas depois é alterada para 10.
       */
      int numero = 5;
      numero = 10;
      System.out.print(numero); // Imprime o valor atual de 'numero' (10)

      /*
         Declaração de uma constante usando a palavra-chave 'final'.
         Por convenção, constantes são escritas em CAIXA ALTA para facilitar
         a identificação no código.
       */
      final double VALOR_DE_PI = 3.14;

      /*
       Constantes não podem ter seu valor alterado após a inicialização.
       Se tentarmos fazer VALOR_DE_PI = 3.14159;, o código não compilará.
       */

      // Declaração de uma variável do tipo String para armazenar texto
      String meuNome = "João Felipe Galvão";

      /*
          Strings são usadas para representar sequências de caracteres.
          O valor de uma String deve estar entre aspas duplas (" ").
       */
   }
}
```

---

### O que Aprendi:

1. **Tipos de Dados Primitivos:**
    - Java possui tipos de dados primitivos, como `short`, `int`, `double`, entre outros, que são usados para armazenar
      valores simples.
    - No exemplo, utilizei `short` para armazenar números pequenos e `int` para números maiores.

2. **Casting:**
    - O **casting** é a conversão de um tipo de dado para outro. No exemplo, converti um `int` para `short` usando
      `(short)`. Isso é necessário porque `int` ocupa mais memória que `short`, e o Java exige uma conversão explícita
      para evitar perda de dados.

3. **Reatribuição de Variáveis:**
    - Variáveis podem ter seus valores alterados após a inicialização. No exemplo, a variável `numero` foi inicializada
      com o valor `5` e depois alterada para `10`.

4. **Constantes:**
    - Constantes são valores que não podem ser alterados após a inicialização. Para declarar uma constante, usei a
      palavra-chave `final`.
    - Por convenção, constantes são escritas em CAIXA ALTA para facilitar a identificação no código, como em
      `VALOR_DE_PI`.

5. **Strings:**
    - Strings são usadas para armazenar sequências de caracteres. No exemplo, declarei uma variável `String` chamada
      `meuNome` para armazenar meu nome completo.
    - Strings devem estar entre aspas duplas (`" "`).

---

### Boas Práticas Aprendidas:

- **Nomes Significativos:** Use nomes descritivos para variáveis e constantes, como `numeroCurto` ou `VALOR_DE_PI`, para
  tornar o código mais legível.
- **Convenções de Nomenclatura:**
    - Variáveis: `camelCase` (ex: `meuNome`).
    - Constantes: `CAIXA_ALTA` (ex: `VALOR_DE_PI`).
- **Cuidado com Casting:** Ao converter tipos de dados, esteja ciente da possibilidade de perda de informação,
  especialmente ao converter de um tipo maior para um menor.

---

### Conclusão

Essa aula foi fundamental para entender como declarar e manipular variáveis e constantes em Java. Aprendi sobre tipos de
dados primitivos, casting, reatribuição de valores e a importância de seguir boas práticas de programação. Agora, estou
mais confiante para continuar explorando a linguagem e aplicando esses conceitos em projetos reais! 🚀