# Desafios de Lógica de Programação - DIO

Durante o curso da DIO, realizei desafios de lógica de programação em Java para aprimorar minhas habilidades com entrada
e saída de dados, controle de fluxo e manipulação de variáveis. Abaixo, descrevo dois dos desafios práticos que
implementei.

## 🏦 Desafio 1: Cálculo de Saldo Final

### 📌 Descrição

Desenvolvi um programa que recebe um saldo inicial e três transações (depósitos ou saques) e calcula o saldo final da
conta bancária após essas operações.

### 🔢 Entrada

- Um número decimal representando o saldo inicial.
- Três números decimais representando os valores das transações.

### 📤 Saída

- O saldo final da conta após as transações.

### 🖥 Implementação

```java
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Entrada do saldo inicial
      double saldoInicial = scanner.nextDouble();

      // Entrada das três transações
      double transacao1 = scanner.nextDouble();
      double transacao2 = scanner.nextDouble();
      double transacao3 = scanner.nextDouble();

      // Cálculo do saldo final
      double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

      // Exibe o saldo final formatado com duas casas decimais
      System.out.printf("%.2f\n", saldoFinal);

      scanner.close();
   }
}
```

### ✅ Exemplos de Entrada e Saída

| Entrada              | Saída  |
|----------------------|--------|
| 100.00               | 100.00 |
| 50.00 -20.00 -30.00  |        |
| 200.50               | 110.00 |
| -50.50 -70.00 30.00  |        |
| 0.00                 | 25.00  |
| 100.00 -50.00 -25.00 |        |

## 📊 Desafio 2: Classificação de Clientes

### 📌 Descrição

Neste desafio, criei um programa que classifica clientes de um banco com base no saldo de suas contas, conforme as
categorias abaixo:

- "Negativado" para saldos abaixo de zero.
- "Baixo" para saldos entre 0 e 500, inclusive.
- "Confortável" para saldos acima de 500.

### 🔢 Entrada

- Um número decimal representando o saldo do cliente.

### 📤 Saída

- Uma mensagem indicando a classificação do cliente.

### 🖥 Implementação

```java
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      double saldo = scanner.nextDouble();

      // Classificação do cliente com base no saldo
      if (saldo < 0) {
         System.out.println("Negativado");
      } else if (saldo <= 500) {
         System.out.println("Baixo");
      } else {
         System.out.println("Confortável");
      }

      scanner.close();
   }
}
```

### ✅ Exemplos de Entrada e Saída

| Entrada | Saída       |
|---------|-------------|
| -50.00  | Negativado  |
| 0.00    | Baixo       |
| 1000.00 | Confortável |

## 🚀 Aprendizados

Ao resolver esses desafios, pratiquei:

- Leitura de entradas do usuário utilizando `Scanner`.
- Manipulação de variáveis do tipo `double`.
- Estruturas condicionais (`if-else`) para controle de fluxo.
- Impressão formatada de saída (`System.out.printf`).

Esses exercícios foram fundamentais para fortalecer meu raciocínio lógico e habilidades com Java! 💡

