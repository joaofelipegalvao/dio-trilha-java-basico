public class PlanoOperadora {
   public static void main(String[] args) {
      // Exemplo de uso de if-else para escolher um plano de operadora
      // Este método funciona, mas não é o ideal para essa situação
      String plano = "M"; // Definindo o plano como "M" (plano médio)

      if (plano == "B") {
         System.out.println("100 minutos de ligação");
      } else if (plano == "M") {
         System.out.println("100 minutos de ligação");
         System.out.println("Whats e Instagram grátis");
      } else if (plano == "T") {
         System.out.println("100 minutos de ligação");
         System.out.println("Whats e Instagram grátis");
         System.out.println("5GB Youtube");
      }

      // Chamando o método que utiliza switch case
      SwitchCase();
   }

   public static void SwitchCase() {
      // Utilizando switch case para escolher um plano de operadora
      // Esta abordagem é mais clara e eficiente para essa situação
      String plano = "M"; // Definindo o plano como "M" (plano médio)

      switch (plano) {
         case "T": {
            // Se o plano for "T", inclui todos os benefícios dos planos inferiores
            System.out.println("5GB Youtube");
            // Note que não há break aqui, então o código continua executando os casos abaixo
         }
         case "M": {
            // Se o plano for "M", inclui os benefícios do plano "M" e do plano "B"
            System.out.println("Whats e Instagram grátis");
            // Novamente, não há break, então o código continua executando o próximo caso
         }
         case "B": {
            // Se o plano for "B", inclui apenas os benefícios do plano "B"
            System.out.println("100 minutos de ligação");
            break; // O break é usado para sair do switch case após executar o caso correspondente
         }
         default: {
            // Caso o valor de 'plano' não corresponda a nenhum dos casos acima
            System.out.println("Plano não reconhecido");
         }
      }
   }
}