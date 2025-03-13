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