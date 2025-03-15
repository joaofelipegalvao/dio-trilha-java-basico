# Aula de Introdução - Aprendendo a Sintaxe Java - Curso DIO

Nesta aula, dei os primeiros passos na sintaxe da linguagem Java, aprendendo sobre métodos, parâmetros, retornos e como
estruturar um programa básico. Aprendi que métodos são blocos de código que realizam tarefas específicas e podem ou não
retornar valores. Além disso, entendi a importância de organizar o código em métodos para torná-lo mais modular e
reutilizável.

Abaixo, compartilho o código utilizado como exemplo durante a aula, juntamente com comentários e observações sobre cada
parte:

---

### Código: Exemplo de Métodos em Java

```java
public class ExemploMetodos {
   public static void main(String[] args) {

      // Método com retorno
      double area = calculaArea(5.0); // Chama o método e armazena o resultado
      System.out.println("Área do quadrado: " + area);

      // Método sem retorno (void)
      ExibirMensagem(10); // Exibe a mensagem
      ExibirMensagem(-5); // Não exibe a mensagem (número negativo)
   }

   /*
       Método com retorno: calcula a área de um quadrado.
       - Recebe um valor double (lado) como parâmetro.
       - Retorna a área calculada (lado * lado).
       - O tipo de retorno é double, então o método deve retornar um valor desse tipo.
   */
   public static double calculaArea(double lado) {
      System.out.println("\n===== Exemplos de método com retorno =====");
      return lado * lado; // Retorna a área calculada
   }

   /*
       Método sem retorno (void): exibe uma mensagem condicional.
       - Recebe um valor int (numero) como parâmetro.
       - Se o número for negativo, o método é encerrado com return.
       - Caso contrário, exibe uma mensagem com o número.
       - Métodos void não retornam valores, mas podem usar return para encerrar a execução antecipadamente.
   */
   public static void ExibirMensagem(int numero) {
      System.out.println("\n===== Exemplos de método sem retorno =====");
      if (numero < 0) {
         System.out.println("Número negativo. Encerrando método.");
         return; // Encerra o método se o número for negativo.
      }
      System.out.println("O número é: " + numero);
   }
}
```

---

### O que aprendi:

#### 1. **Métodos com Retorno**

- Um método com retorno realiza uma operação e devolve um valor ao chamador.
- No exemplo, o método `calculaArea` recebe um valor `double` (o lado de um quadrado) e retorna a área calculada (
  `lado * lado`).
- O tipo de retorno do método (`double`) deve corresponder ao valor que ele retorna.
- Métodos com retorno são úteis quando precisamos obter um resultado específico de uma operação.

#### 2. **Métodos sem Retorno (`void`)**

- Métodos `void` não retornam valores, mas podem executar ações, como exibir mensagens ou modificar variáveis.
- No exemplo, o método `ExibirMensagem` recebe um número inteiro e exibe uma mensagem condicional.
- Se o número for negativo, o método é encerrado antecipadamente com `return`, sem executar o restante do código.
- Métodos `void` são úteis para realizar tarefas que não precisam retornar um valor específico.

#### 3. **Parâmetros e Argumentos**

- Parâmetros são variáveis definidas na assinatura do método, que recebem valores (argumentos) quando o método é
  chamado.
- No exemplo, `calculaArea` recebe um parâmetro `double lado`, e `ExibirMensagem` recebe um parâmetro `int numero`.
- Argumentos são os valores passados para os parâmetros quando o método é chamado (por exemplo, `5.0` para `calculaArea`
  e `10` para `ExibirMensagem`).

#### 4. **Organização do Código**

- Dividir o código em métodos torna o programa mais organizado, legível e reutilizável.
- Métodos bem definidos facilitam a manutenção e o entendimento do código, especialmente em programas maiores.

---

### Exemplo de Saída do Código

Ao executar o programa, a saída será:

```
===== Exemplos de método com retorno =====
Área do quadrado: 25.0

===== Exemplos de método sem retorno =====
O número é: 10

===== Exemplos de método sem retorno =====
Número negativo. Encerrando método.
```

---

### Conclusão

Essa aula foi fundamental para entender como métodos funcionam em Java e como eles podem ser usados para organizar e
modularizar o código. Aprendi que:

- Métodos com retorno são ideais para cálculos e operações que produzem um resultado.
- Métodos `void` são úteis para executar ações sem a necessidade de retornar um valor.
- A organização do código em métodos melhora a legibilidade e a manutenção do programa.

Estou animado para continuar explorando a sintaxe do Java e aplicar esses conceitos em projetos mais complexos! 🚀