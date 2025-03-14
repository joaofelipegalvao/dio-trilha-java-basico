public class SistemaMedida {
   public static void main(String[] args) {
      String sigla = "M";
      if (sigla == "P") {
         System.out.println("PEQUENO");
      } else if (sigla == "M") {
         System.out.println("MÉDIO");
      } else if (sigla == "G") {
         System.out.println("GRANDE");
      } else {
         System.out.println("INDEFINIDO");
      }
      CondicaoTernaria();
      SwitchCase();
   }

   public static void CondicaoTernaria() {
      String sigla = "M";
      String resultado = sigla == "P" ? "PEQUENO" : sigla == "M" ? "MÉDIO" : sigla == "G" ? "GRANDE" : "INDEFINIDO";
   }

   public static void SwitchCase() {
      // Exemplo switch case, o código abaixo o ideal é melhor utilizar if else.
      String sigla = "M";
      switch (sigla) {
         case "P": {
            System.out.println("PEQUENO");
            break;
         }
         case "M": {
            System.out.println("MÈDIO");
            break;
         }
         case "G": {
            System.out.println("GRANDE");
            break;
         }
         default:
            System.out.println("INDEFINIDO");
      }
   }
}
