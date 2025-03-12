package metodos;

public class ExemploRetorno {

   public static void main(String[] args) {
      // Exemplo de método com retorno
      double area = calculaArea(5.0); // Chama o método e armazena o resultado
      System.out.println("Área do quadrado: " + area);

      // Exemplo de método sem retorno (void)
      exibirMensagem(10);  // Exibe a mensagem
      exibirMensagem(-5);  // Não exibe a mensagem (número negativo)
   }

   // Método com retorno: calcula a área de um quadrado
   public static double calculaArea(double lado) {
      System.out.println("\n===== Exemplos de método com retorno =====");
      return lado * lado; // Retorna a área calculada
   }

   // Método sem retorno (void): exibe uma mensagem condicional
   public static void exibirMensagem(int numero) {
      System.out.println("\n===== Exemplos de método sem retorno =====");
      if (numero < 0) {
         System.out.println("Número negativo. Encerrando método.");
         return; // Encerra o método se o número for negativo
      }
      System.out.println("O número é: " + numero);
   }
}
