// Importa as classes necessárias para entrada de dados e tratamento de exceções
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

   public static void main(String[] args) {

      // Bloco try para capturar exceções durante a execução
      try {
         // Cria um objeto Scanner para ler entradas do usuário
         // O Locale.US é usado para garantir que números decimais usem ponto (.) como separador
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         // Solicita e lê o nome do usuário
         System.out.println("Digite seu nome:");
         String nome = scanner.next();

         // Solicita e lê o sobrenome do usuário
         System.out.println("Digite seu sobrenome:");
         String sobrenome = scanner.next();

         // Solicita e lê a idade do usuário
         System.out.println("Digite sua idade:");
         int idade = scanner.nextInt();

         // Solicita e lê a altura do usuário
         System.out.println("Digite sua altura:");
         double altura = scanner.nextDouble();

         // Exibe as informações do usuário
         System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
         System.out.println("Tenho " + idade + " anos");
         System.out.println("Minha altura é " + altura + "cm");

         // Fecha o objeto Scanner para liberar recursos
         scanner.close();
      }

      // Captura a exceção InputMismatchException, que ocorre se o usuário digitar um tipo de dado incorreto
      catch (InputMismatchException e) {
         // Mensagem de erro informando que idade e altura devem ser numéricos
         System.out.println("Os campos idade e altura precisam ser numéricos.");
      }
   }
}