public class TiposVariaveis {
   public static void main(String[] args) {
      // Declaração de uma variável do tipo short
      short numeroCurto = 1;
      // Atribuição de um short a um int (não precisa de casting, pois int é maior que short)
      int numeroNormal = numeroCurto;
      // Atribuição de um int a um short (Precisa de casting, pois int é maior que short)
      short numeroCurto2 = (short) numeroNormal;

       /*
        Exemplo de reatribuição de valor a uma variável.
        A variável 'numero', é inicializada com o valor 5,
        mas depois é alterada para 10.
        */

      int numero = 5;
      numero = 10;
      System.out.print(numero); // Imprime o valor atual de 'numero' (10)

        /*
           Declaração de uma constante usando a palavra-chave 'final'.
           Por convenção, constantes são escritas em CAIXA ALTA para facilitar
           a identificação no código.
         */

      final double VALOR_DE_PI = 3.14;

       /*
        Constantes não podem ter seu valor alterado após a inicialização.
        Se tentarmos fazer VALOR_DE_PI = 3.14159;, o código não compilará.
        */

      // Declaração de uma variável do tipo String para armazenar texto
      String meuNome = "João Felipe Galvão";

        /*
            Strings são usadas para representar sequências de caracteres.
            O valor de uma String deve estar entre aspas duplas (" ").
         */

   }
}