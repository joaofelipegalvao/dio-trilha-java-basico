public class ExemploBreak {

   public static void main(String[] args) {

      System.out.println("===== Exemplo utilizando break =====");
      for (int numero = 1; numero <= 5; numero++) { // Loop que vai de 1 a 5
         if (numero == 3) { // Se o número for igual a 3
            break; // Interrompe o loop completamente
         }
         System.out.println(numero); // Imprime o número atual
      }

      ExemploContinue();
   }

   // Método que demonstra o uso do continue
   public static void ExemploContinue() {
      System.out.println("\n===== Exemplo utilizando continue =====");
      for (int numero = 1; numero <= 5; numero++) { // Loop que vai de 1 a 5
         if (numero == 3) { // Se o número for igual a 3
            continue; // Pula para a próxima iteração do loop, ignorando o código abaixo
         }
         System.out.println(numero); // Imprime o número atual
      }
   }
}