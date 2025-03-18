public class ExemploFor {

   public static void main(String[] args) {

      /* Estrutura de repetição for
       O for é composto por três partes:
       1. Inicialização: int carneirinhos = 1 (inicia a variável carneirinhos com o valor 1)
       2. Condição de parada: carneirinhos <= 20 (repete enquanto carneirinhos for menor ou igual a 20)
       3. Incremento: carneirinhos++ (aumenta o valor de carneirinhos em 1 a cada repetição)
       */

      for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {

         // Imprime a mensagem com o número atual de carneirinhos
         System.out.println("Contando carneirinhos " + carneirinhos);
      }

      // Após o loop terminar, imprime esta mensagem
      System.out.println("Joaozinho dormiu");
   }
}