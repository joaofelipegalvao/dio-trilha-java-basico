import java.util.Locale;
import java.util.Scanner;

public class Contador {
   public static void main(String[] args) {
      // Cria um objeto Scanner para ler entradas do usuário, configurado para usar o padrão americano (Locale.US)
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      // Solicita ao usuário que insira o primeiro parâmetro
      System.out.println("Digite o primeiro parâmetro");
      int parametroUm = scanner.nextInt();

      // Solicita ao usuário que insira o segundo parâmetro
      System.out.println("Digite o segundo parâmetro");
      int parametroDois = scanner.nextInt();

      /*
         Tenta executar o método contar.
         Se o primeiro parâmetro for maior que o segundo, uma exceção será lançada
         e capturada no bloco catch, exibindo uma mensagem de erro.
       */
      try {
         contar(parametroUm, parametroDois);
      } catch (ParametrosInvalidosException e) {
         System.out.println("O segundo parâmetro deve ser maior que o primeiro"); // Exibe a mensagem da exceção
      } finally {
         scanner.close(); // Fecha o Scanner para liberar recursos
      }
   }

   /*
      Método que realiza a contagem e impressão dos números.
      - Verifica se o primeiro parâmetro é maior que o segundo.
      - Se for, lança uma exceção do tipo ParametrosInvalidosException.
      - Caso contrário, calcula a diferença entre os parâmetros e imprime os números de 1 até a diferença.
    */
   static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
      if (parametroUm > parametroDois) {
         throw new ParametrosInvalidosException(); // Lança a exceção personalizada
      }

      // Calcula a quantidade de iterações necessárias
      int contagem = parametroDois - parametroUm;

      // Itera de 1 até a diferença, imprimindo cada número
      for (int i = 1; i <= contagem; i++) {
         System.out.println("Imprimindo o número " + i);
      }
   }
}