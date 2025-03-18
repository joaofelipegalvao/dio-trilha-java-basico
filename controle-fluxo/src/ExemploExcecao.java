// Importa as classes necessárias para formatação de números e tratamento de exceções
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

   public static void main(String[] args) {
      // Declara uma variável do tipo Number para armazenar o valor convertido
      Number valor;

      // Bloco try: tenta executar um código que pode gerar uma exceção
      try {
         // Tenta converter a String "a1.75" em um número usando NumberFormat
         // O método parse() pode lançar uma exceção do tipo ParseException
         valor = NumberFormat.getInstance().parse("a1.75");

         // Se a conversão for bem-sucedida, imprime o valor convertido
         System.out.println(valor);
      }
      // Bloco catch: captura e trata a exceção caso ela ocorra
      catch (ParseException e) {
         // Exibe uma mensagem de erro amigável para o usuário
         System.out.println("Erro: A String não pode ser convertida em número.");

         // Imprime detalhes da exceção no console (opcional, útil para depuração)
         e.printStackTrace();
      }
   }
}