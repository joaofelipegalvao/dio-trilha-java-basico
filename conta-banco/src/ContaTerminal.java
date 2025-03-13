import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
      //TODO: Conhecer e importar a Classe Scanner
      // Exibir as mensagens para o usuário
      // Obter pela Classe Scanner os valores digitados no terminal
      // Exibir a mensagem da conta criada

      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Por favor, digite o seu nome: ");
      String nome = scanner.next();
      System.out.println("Por favor, digite o número da agência: ");
      String agencia = scanner.next();
      System.out.println("Por favor, digite o número da conta: ");
      int numero = scanner.nextInt();
      System.out.println("Por favor, digite o saldo: ");
      double saldo = scanner.nextDouble();

      System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é " + saldo);

   }
}