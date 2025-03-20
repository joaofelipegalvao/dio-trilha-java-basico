# Desafio de Projeto: Contador - DIO

Neste desafio proposto pela DIO, desenvolvi um programa em Java que realiza uma contagem baseada em dois parâmetros
fornecidos pelo usuário. Durante a implementação, pratiquei conceitos essenciais como exceções personalizadas,
manipulação de entrada de dados e estrutura de controle de fluxo.

## 📌 Objetivo

O objetivo do desafio era criar um método que recebesse dois números inteiros como parâmetros e imprimisse uma contagem
do menor para o maior. Caso o primeiro número fosse maior que o segundo, uma exceção personalizada deveria ser lançada.

## 🔍 Implementação

A implementação foi dividida em duas classes:

### 1️⃣ `ParametrosInvalidosException.java`

Essa classe define uma exceção personalizada para lidar com entradas inválidas.

```java
public class ParametrosInvalidosException extends Exception {
}
```

### 2️⃣ `Contador.java`

Esta classe contém a lógica principal do programa. Ela solicita dois números ao usuário e chama o método `contar()`, que
realiza a contagem ou lança a exceção caso os parâmetros sejam inválidos.

```java
import java.util.Locale;
import java.util.Scanner;

public class Contador {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite o primeiro parâmetro");
      int parametroUm = scanner.nextInt();

      System.out.println("Digite o segundo parâmetro");
      int parametroDois = scanner.nextInt();

      try {
         contar(parametroUm, parametroDois);
      } catch (ParametrosInvalidosException e) {
         System.out.println("O segundo parâmetro deve ser maior que o primeiro");
      } finally {
         scanner.close();
      }
   }

   static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
      if (parametroUm > parametroDois) {
         throw new ParametrosInvalidosException();
      }

      int contagem = parametroDois - parametroUm;
      for (int i = 1; i <= contagem; i++) {
         System.out.println("Imprimindo o número " + i);
      }
   }
}
```

## 🚀 Aprendizados

Durante esse desafio, reforcei conhecimentos sobre:

- Tratamento de exceções em Java.
- Uso do `Scanner` para entrada de dados.
- Estruturas de repetição (`for`) e controle de fluxo (`try-catch-finally`).
- Definição e lançamento de exceções personalizadas.

Esse exercício foi essencial para consolidar a prática de controle de fluxo e manipulação de erros no desenvolvimento
Java. 💡

