# Anotação sobre a Aula: **Introdução e Estruturas Condicionais com Java e Tratamento de Exceções**

Nesta aula, tive a oportunidade de mergulhar nos conceitos fundamentais de estruturas condicionais e tratamento de
exceções em Java, além de explorar alguns exemplos práticos que ajudaram a consolidar o aprendizado. Abaixo, compartilho
um resumo dos principais tópicos e códigos que utilizei durante o estudo.

## **Estruturas Condicionais**

### **If-Else**

Aprendi que o `if-else` é uma das estruturas condicionais mais básicas e essenciais em Java. Ele permite que o programa
tome decisões com base em condições específicas. Um exemplo prático foi o código do `CaixaEletronico`, onde verifiquei
se o saldo era suficiente para um saque:

```java
public class CaixaEletronico {
   public static void main(String[] args) {
      double saldo = 25.0;
      double valorSolicitado = 17.0;
      if (valorSolicitado < saldo) {
         saldo = saldo - valorSolicitado;
         System.out.println("Novo saldo: " + saldo);
      } else {
         System.out.println("Saldo insuficiente");
      }
   }
}
```

Esse código me mostrou como o `if-else` pode ser usado para controlar o fluxo do programa com base em uma condição
simples.

### **Condição Ternária**

Aprendi também sobre a **condição ternária**, que é uma forma compacta de escrever um `if-else`. Ela é útil para
decisões simples e rápidas. No exemplo abaixo, usei a condição ternária para verificar se um aluno foi aprovado, está em
recuperação ou foi reprovado:

```java
public class ResultadoEscolar {
   public static void main(String[] args) {
      int nota = 6;
      String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
      System.out.println(resultado);
   }
}
```

Aqui, a condição ternária simplificou o código, tornando-o mais legível e conciso.

### **Switch-Case**

Outra estrutura condicional que explorei foi o `switch-case`, que é ideal para situações em que precisamos comparar uma
variável com múltiplos valores. Um exemplo prático foi o código do `PlanoOperadora`, onde usei o `switch-case` para
definir os benefícios de cada plano:

```java
public class PlanoOperadora {
   public static void main(String[] args) {
      String plano = "M";
      switch (plano) {
         case "T": {
            System.out.println("5GB Youtube");
         }
         case "M": {
            System.out.println("Whats e Instagram grátis");
         }
         case "B": {
            System.out.println("100 minutos de ligação");
            break;
         }
         default: {
            System.out.println("Plano não reconhecido");
         }
      }
   }
}
```

Esse exemplo me mostrou como o `switch-case` pode ser mais eficiente e organizado do que vários `if-else` encadeados.

## **Estruturas de Repetição**

### **For**

Aprendi a usar o `for` para repetir blocos de código um número específico de vezes. Um exemplo divertido foi o código
que conta carneirinhos até o Joãozinho dormir:

```java
public class ExemploFor {
   public static void main(String[] args) {
      for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
         System.out.println("Contando carneirinhos " + carneirinhos);
      }
      System.out.println("Joaozinho dormiu");
   }
}
```

Esse código me ajudou a entender como o `for` funciona, com sua estrutura de inicialização, condição e incremento.

### **While**

Também explorei o `while`, que repete um bloco de código enquanto uma condição for verdadeira. No exemplo abaixo,
simulei o gasto da mesada do Joãozinho em doces:

```java
public class ExemploWhile {
   public static void main(String[] args) {
      double mesada = 50.0;
      while (mesada > 0) {
         double valorDoce = valorAleatorio();
         if (valorDoce > mesada) {
            valorDoce = mesada;
         }
         System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
         mesada = mesada - valorDoce;
      }
      System.out.println("Joãozinho gastou toda a sua mesada em doces.");
   }

   private static double valorAleatorio() {
      return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}
```

Esse exemplo foi muito útil para entender como o `while` pode ser usado em situações onde não sabemos quantas vezes o
loop será executado.

## **Tratamento de Exceções**

### **Try-Catch**

Aprendi a usar o `try-catch` para capturar e tratar exceções, evitando que o programa quebre inesperadamente. Um exemplo
prático foi o código que lê dados do usuário e trata erros de entrada:

```java
public class AboutMe {
   public static void main(String[] args) {
      try {
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
         System.out.println("Digite seu nome:");
         String nome = scanner.next();
         System.out.println("Digite sua idade:");
         int idade = scanner.nextInt();
         System.out.println("Digite sua altura:");
         double altura = scanner.nextDouble();
         System.out.println("Olá, me chamo " + nome.toUpperCase());
         System.out.println("Tenho " + idade + " anos");
         System.out.println("Minha altura é " + altura + "cm");
         scanner.close();
      } catch (InputMismatchException e) {
         System.out.println("Os campos idade e altura precisam ser numéricos.");
      }
   }
}
```

Esse código me mostrou como o `try-catch` pode ser usado para garantir que o programa continue funcionando mesmo que o
usuário insira dados inválidos.

### **Exceções Personalizadas**

Por fim, aprendi a criar exceções personalizadas para tratar erros específicos do meu programa. No exemplo abaixo, criei
uma exceção chamada `CepInvalidoException` para validar o formato de um CEP:

```java
public class FormatadorCepExemplo {
   public static void main(String[] args) {
      try {
         String cepFormatado = formatarCep("2376506");
         System.out.println(cepFormatado);
      } catch (CepInvalidoException e) {
         System.out.println("O cep não corresponde com as regras de negocio");
      }
   }

   static String formatarCep(String cep) throws CepInvalidoException {
      if (cep.length() != 8)
         throw new CepInvalidoException();
      return "23.765-064";
   }
}
```

Esse exemplo me mostrou como criar e usar exceções personalizadas para melhorar a robustez do código.

## **Conclusão**

Essa aula foi incrível! Aprendi a usar estruturas condicionais como `if-else`, `switch-case` e a condição ternária, além
de explorar estruturas de repetição como `for` e `while`. Também entendi a importância do tratamento de exceções com
`try-catch` e como criar exceções personalizadas. Agora, me sinto mais confiante para escrever códigos mais robustos e
eficientes em Java! 🚀

**Próximos passos:**

- Praticar mais exercícios com estruturas condicionais e repetição.
- Explorar outros tipos de exceções e como tratá-las.
- Aprofundar meus conhecimentos em boas práticas de programação em Java.

Estou animado para continuar minha jornada no curso da DIO! 💻✨