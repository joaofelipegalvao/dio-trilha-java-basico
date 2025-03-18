# Aula de Introdução e Estruturas Condicionais com Java - DIO

Nesta aula, tive a oportunidade de mergulhar nos conceitos básicos de estruturas condicionais em Java, uma das
linguagens de programação mais utilizadas no mundo. Aprendi como utilizar estruturas como `if-else`, `switch case`,
operadores ternários e loops (`for`, `while`, `do-while`) para controlar o fluxo de execução do código. Além disso,
explorei exemplos práticos que ajudaram a consolidar o entendimento desses conceitos.

Abaixo, compartilho os principais códigos utilizados durante a aula, com breves explicações sobre cada um deles:

---

## 1. **Caixa Eletrônico (`CaixaEletronico`)**

Este exemplo demonstra o uso básico de uma estrutura `if-else` para verificar se o saldo é suficiente para um saque.

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

**Aprendizado:** Aqui, entendi como o `if-else` pode ser usado para tomar decisões simples com base em condições.

---

## 2. **Resultado Escolar (`ResultadoEscolar`)**

Este exemplo mostra como usar `if-else` e operadores ternários para determinar o resultado de um aluno com base em sua
nota.

```java
public class ResultadoEscolar {
   public static void main(String[] args) {
      int nota = 10;
      if (nota >= 7) {
         System.out.println("Aprovado");
      } else if (nota >= 5 && nota < 7) {
         System.out.println("Recuperação");
      } else {
         System.out.println("Reprovado");
      }
      CondicaoTernaria();
   }

   public static void CondicaoTernaria() {
      int nota = 6;
      String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
      System.out.println(resultado);
   }
}
```

**Aprendizado:** Aprendi que o operador ternário é uma forma concisa de substituir estruturas `if-else` simples.

---

## 3. **Sistema de Medida (`SistemaMedida`)**

Este exemplo compara o uso de `if-else`, operador ternário e `switch case` para determinar o tamanho de uma roupa com
base em uma sigla.

```java
public class SistemaMedida {
   public static void main(String[] args) {
      String sigla = "M";
      if (sigla == "P") {
         System.out.println("PEQUENO");
      } else if (sigla == "M") {
         System.out.println("MÉDIO");
      } else if (sigla == "G") {
         System.out.println("GRANDE");
      } else {
         System.out.println("INDEFINIDO");
      }
      CondicaoTernaria();
      SwitchCase();
   }

   public static void CondicaoTernaria() {
      String sigla = "M";
      String resultado = sigla == "P" ? "PEQUENO" : sigla == "M" ? "MÉDIO" : sigla == "G" ? "GRANDE" : "INDEFINIDO";
   }

   public static void SwitchCase() {
      String sigla = "M";
      switch (sigla) {
         case "P": {
            System.out.println("PEQUENO");
            break;
         }
         case "M": {
            System.out.println("MÉDIO");
            break;
         }
         case "G": {
            System.out.println("GRANDE");
            break;
         }
         default:
            System.out.println("INDEFINIDO");
      }
   }
}
```

**Aprendizado:** Aqui, entendi que o `switch case` é ideal para situações com múltiplas condições, enquanto o operador
ternário é útil para decisões simples.

---

## 4. **Plano de Operadora (`PlanoOperadora`)**

Este exemplo compara o uso de `if-else` e `switch case` para escolher um plano de operadora com base em uma sigla.

```java
public class PlanoOperadora {
   public static void main(String[] args) {
      String plano = "M";
      if (plano == "B") {
         System.out.println("100 minutos de ligação");
      } else if (plano == "M") {
         System.out.println("100 minutos de ligação");
         System.out.println("Whats e Instagram grátis");
      } else if (plano == "T") {
         System.out.println("100 minutos de ligação");
         System.out.println("Whats e Instagram grátis");
         System.out.println("5GB Youtube");
      }
      SwitchCase();
   }

   public static void SwitchCase() {
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

**Aprendizado:** Aprendi que o `switch case` pode ser mais eficiente e legível em situações com múltiplas condições.

---

## 5. **Exemplos de Loops (`ExemploFor`, `ExemploForArray`, `ExemploWhile`)**

Esses exemplos mostram o uso de loops (`for`, `for-each`, `while`) para repetir blocos de código.

### Exemplo de `for`:

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

### Exemplo de `for-each`:

```java
public class ExemploForArray {
   public static void main(String[] args) {
      String alunos[] = {"JOAO", "NIELLE", "DAVI"};
      for (int x = 0; x < alunos.length; x++) {
         System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
      }
      ForEmArryas();
   }

   public static void ForEmArryas() {
      String alunos[] = {"FELIPE", "JONAS", "MARCOS"};
      for (String aluno : alunos) {
         System.out.println("Nome do aluno é: " + aluno);
      }
   }
}
```

### Exemplo de `while`:

```java
import java.util.concurrent.ThreadLocalRandom;

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
      System.out.println("Mesada: " + mesada);
      System.out.println("Joãozinho gastou toda a sua mesada em doces.");
   }

   private static double valorAleatorio() {
      return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}
```

**Aprendizado:** Aprendi como os loops podem ser usados para repetir tarefas de forma eficiente, seja com um número fixo
de iterações (`for`) ou enquanto uma condição for verdadeira (`while`).

---

## Conclusão

Essa aula foi fundamental para entender como as estruturas condicionais e de repetição funcionam em Java. Os exemplos
práticos ajudaram a fixar os conceitos e a perceber como essas estruturas podem ser aplicadas em situações reais. Agora,
sinto-me mais confiante para continuar explorando a linguagem e desenvolver projetos mais complexos! 🚀