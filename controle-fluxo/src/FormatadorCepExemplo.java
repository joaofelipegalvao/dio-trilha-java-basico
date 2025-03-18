public class FormatadorCepExemplo {
   public static void main(String[] args) {
      try {
         // Tenta formatar um CEP inválido (menos de 8 dígitos).
         String cepFormatado = formatarCep("2376506");
         System.out.println(cepFormatado);
      } catch (CepInvalidoException e) {
         // Captura e trata a exceção caso o CEP não tenha 8 caracteres.
         System.out.println("O cep não corresponde com as regras de negocio");
      }
   }

   // Método que formata um CEP, lançando uma exceção se ele for inválido.
   static String formatarCep(String cep) throws CepInvalidoException {
      // Verifica se o CEP tem exatamente 8 caracteres.
      if (cep.length() != 8)
         // Se o CEP for inválido, lança uma exceção personalizada.
         throw new CepInvalidoException();

      // Retorna o CEP formatado (simulação, pois sempre retorna um valor fixo).
      return "23.765-064";
   }
}