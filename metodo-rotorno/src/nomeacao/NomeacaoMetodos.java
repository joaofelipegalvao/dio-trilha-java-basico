package nomeacao;

public class NomeacaoMetodos {

   public static void main(String[] args) {
      // Exemplos de métodos bem nomeados
      exibirMensagem();
      int resultado = calcularSoma(5, 3);
      System.out.println("Resultado da soma: " + resultado);
   }

   // Método bem nomeado: indica claramente sua função
   public static void exibirMensagem() {
      System.out.println("Este é um exemplo de método bem nomeado.");
   }

   // Método bem nomeado: indica que calcula a soma de dois números
   public static int calcularSoma(int a, int b) {
      return a + b;
   }
}
