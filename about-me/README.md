# Aula de Introdução - Aprendendo a Sintaxe Java - Curso DIO

Nesta aula, dei os primeiros passos na linguagem Java, aprendendo sobre sua sintaxe básica e como criar um programa
simples que interage com o usuário. O foco foi entender como declarar variáveis, utilizar a classe `Scanner` para
entrada de dados e exibir informações na tela. Abaixo, compartilho o código utilizado como exemplo durante a aula,
juntamente com algumas observações sobre o que aprendi.

---

### Código Exemplo - Classe `AboutMe`

```java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
   public static void main(String[] args) {
      // Criando um objeto Scanner para ler entradas do usuário
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      // Solicitando e lendo o nome do usuário
      System.out.println("Digite seu nome: ");
      String nome = scanner.next();

      // Solicitando e lendo o sobrenome do usuário
      System.out.println("Digite seu sobrenome: ");
      String sobrenome = scanner.next();

      // Solicitando e lendo a idade do usuário
      System.out.println("Digite sua idade: ");
      int idade = scanner.nextInt();

      // Solicitando e lendo a altura do usuário
      System.out.println("Digite sua altura: ");
      double altura = scanner.nextDouble();

      // Exibindo as informações fornecidas pelo usuário
      System.out.println("Olá, me chamo " + nome + " " + sobrenome);
      System.out.println("Tenho " + idade + " anos");
      System.out.println("Minha altura é " + altura + " cm");
   }
}
```

---

### O que Aprendi:

1. **Declaração de Variáveis**:
    - Em Java, as variáveis precisam ser declaradas com um tipo específico, como `String` para texto, `int` para números
      inteiros e `double` para números decimais.
    - Exemplo:
      ```java
      String nome = "João";
      int idade = 25;
      double altura = 1.75;
      ```

2. **Entrada de Dados com `Scanner`**:
    - A classe `Scanner` é utilizada para ler entradas do usuário. Para isso, é necessário importá-la no início do
      código:
      ```java
      import java.util.Scanner;
      ```
    - O objeto `Scanner` é criado para ler dados do teclado (`System.in`):
      ```java
      Scanner scanner = new Scanner(System.in);
      ```
    - Métodos como `next()`, `nextInt()` e `nextDouble()` são usados para capturar diferentes tipos de dados.

3. **Configuração de Localidade**:
    - O método `useLocale(Locale.US)` foi utilizado para garantir que números decimais sejam lidos com ponto (`.`) como
      separador, seguindo o padrão americano. Isso evita problemas ao ler valores como `1.75` em locais onde o separador
      padrão é a vírgula (`,`).

4. **Exibição de Dados**:
    - Para exibir informações na tela, utilizei o `System.out.println()`, que imprime uma mensagem e pula para a próxima
      linha.
    - Também é possível concatenar strings e variáveis usando o operador `+`.

5. **Estrutura Básica de um Programa Java**:
    - Todo programa Java começa com uma classe principal, que contém o método `main`. Esse método é o ponto de entrada
      do programa.
    - Exemplo:
      ```java
      public class NomeDaClasse {
         public static void main(String[] args) {
            // Código do programa
         }
      }
      ```

---

### Como Funciona o Programa:

1. O programa solicita ao usuário que insira seu nome, sobrenome, idade e altura.
2. As entradas são armazenadas em variáveis (`nome`, `sobrenome`, `idade`, `altura`).
3. Por fim, o programa exibe uma mensagem personalizada com as informações fornecidas pelo usuário.

---

### Exemplo de Execução:

```
Digite seu nome: João
Digite seu sobrenome: Silva
Digite sua idade: 25
Digite sua altura: 1.75
Olá, me chamo João Silva
Tenho 25 anos
Minha altura é 1.75 cm
```

### Conclusão

Essa aula foi fundamental para entender a sintaxe básica do Java e como criar programas simples que interagem com o
usuário. Aprendi a declarar variáveis, utilizar a classe `Scanner` para entrada de dados e exibir informações na tela.
Esses conceitos são a base para construir programas mais complexos no futuro. Estou animado para continuar explorando a
linguagem Java e suas possibilidades! 🚀