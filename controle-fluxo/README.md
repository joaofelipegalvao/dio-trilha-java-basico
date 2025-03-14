# Aula de Introdução e Estruturas Condicionais com Java - Curso DIO

Nesta aula, explorei os conceitos fundamentais das estruturas condicionais em Java, que são essenciais para controlar o
fluxo de execução de um programa com base em condições específicas. Aprendi a utilizar estruturas como `if-else`,
`switch case` e operadores ternários, que são ferramentas poderosas para tomar decisões em um programa.

Abaixo, compartilho os códigos utilizados como exemplo durante a aula, juntamente com algumas observações sobre cada um
deles:

---

### 1. **Exemplo de `if-else` - Classe `CaixaEletronico`**

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

**O que aprendi:**

- O `if-else` é uma estrutura condicional simples que permite executar um bloco de código se uma condição for
  verdadeira (`if`) e outro bloco se a condição for falsa (`else`).
- Neste exemplo, o programa verifica se o valor solicitado é menor que o saldo disponível. Se for, ele atualiza o saldo;
  caso contrário, exibe uma mensagem de saldo insuficiente.

---

### 2. **Exemplo de `if-else` e Operador Ternário - Classe `ResultadoEscolar`**

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

**O que aprendi:**

- O `if-else` pode ser usado para verificar múltiplas condições, como no exemplo em que a nota do aluno é avaliada para
  determinar se ele está aprovado, em recuperação ou reprovado.
- O **operador ternário** (`? :`) é uma forma compacta de escrever condições simples. Ele é útil para substituir
  `if-else` em situações onde a lógica é direta, como no método `CondicaoTernaria`.

---

### 3. **Exemplo de `if-else`, Operador Ternário e `switch case` - Classe `SistemaMedida`**

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
      System.out.println(resultado);
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

**O que aprendi:**

- O `switch case` é uma estrutura condicional que permite comparar uma variável com vários valores possíveis. Ele é mais
  legível e eficiente do que múltiplos `if-else` quando há muitas condições.
- O uso do `break` é importante para evitar o "fall-through", onde o código continua executando os casos subsequentes.
- O operador ternário também pode ser usado para simplificar a lógica de decisão, como no método `CondicaoTernaria`.

---

### 4. **Exemplo de `if-else` e `switch case` - Classe `PlanoOperadora`**

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

**O que aprendi:**

- O `switch case` é ideal para situações em que uma variável pode assumir vários valores e cada valor requer uma ação
  específica.
- O "fall-through" pode ser útil quando queremos que um caso inclua os benefícios dos casos inferiores, como no exemplo
  dos planos de operadora.
- O `default` é opcional e serve para lidar com valores inesperados.

---

### Conclusão

Essa aula foi muito importante para entender como as estruturas condicionais funcionam em Java. Aprendi que cada
estrutura tem seu uso específico:

- **`if-else`**: Ideal para condições simples ou quando há poucas opções.
- **`switch case`**: Melhor para múltiplas condições baseadas no valor de uma única variável.
- **Operador Ternário**: Útil para simplificar condições simples em uma única linha.

Estou animado para aplicar esses conceitos em projetos mais complexos e continuar explorando o poder da linguagem Java!
🚀