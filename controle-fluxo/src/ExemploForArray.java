public class ExemploForArray {

   public static void main(String[] args) {

      // Declaração e inicialização de um array de strings com nomes de alunos
      String alunos[] = {"JOAO", "NIELLE", "DAVI"};
      /*
         Estrutura de repetição for tradicional
         O for é composto por três partes:
         1. Inicialização: int x = 0 (inicia a variável x com o valor 0)
         2. Condição de parada: x < alunos.length (repete enquanto x for menor que o tamanho do array)
         3. Incremento: x++ (aumenta o valor de x em 1 a cada repetição)
       */
      for (int x = 0; x < alunos.length; x++) {

         // Imprime o índice (x) e o valor correspondente no array (alunos[x])
         System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
      }

      ForEmArryas();
   }

   // Método que demonstra o uso do for-each (também conhecido como enhanced for)
   public static void ForEmArryas() {
      System.out.println("\n===== Exemplos For em Arrays =====");

      // Declaração e inicialização de outro array de strings com nomes de alunos
      String alunos[] = {"FELIPE", "JONAS", "MARCOS"};

      /*
       Estrutura de repetição for-each
         Itera sobre cada elemento do array "alunos"
         A cada iteração, a variável "aluno" recebe o valor do elemento atual
       */
      for (String aluno : alunos) {

         // Imprime o nome do aluno
         System.out.println("Nome do aluno é: " + aluno);
      }
   }
}