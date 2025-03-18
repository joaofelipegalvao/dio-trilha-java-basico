// Importa a classe ThreadLocalRandom para gerar números aleatórios

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

   public static void main(String[] args) {

      // Variável que representa a mesada de Joãozinho
      double mesada = 50.0;

      // Estrutura de repetição while
      // O while repete o bloco de código enquanto a condição (mesada > 0) for verdadeira
      while (mesada > 0) {

         // Gera um valor aleatório para o preço do doce
         double valorDoce = valorAleatorio();

         // Verifica se o valor do doce é maior que a mesada restante
         if (valorDoce > mesada) {
            // Se for, ajusta o valor do doce para o valor restante da mesada
            valorDoce = mesada;
         }

         // Imprime o valor do doce adicionado ao carrinho
         System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");

         // Subtrai o valor do doce da mesada
         mesada = mesada - valorDoce;
      }

      // Após o loop, imprime a mesada restante (que será 0)
      System.out.println("Mesada: " + mesada);

      // Mensagem final indicando que Joãozinho gastou toda a mesada
      System.out.println("Joãozinho gastou toda a sua mesada em doces.");
   }

   // Método que gera um valor aleatório entre 2 e 8
   private static double valorAleatorio() {
      // Usa ThreadLocalRandom para gerar um número double aleatório entre 2 (inclusive) e 8 (exclusive)
      return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}