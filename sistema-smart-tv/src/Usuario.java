public class Usuario {
   public static void main(String[] args) {
      // Cria uma instância da SmartTv
      SmartTv smartTv = new SmartTv();

      // Testando o controle de volume
      smartTv.diminuirVolume(); // Diminui o volume para 24
      smartTv.diminuirVolume(); // Diminui o volume para 23
      smartTv.diminuirVolume(); // Diminui o volume para 22
      smartTv.aumentarVolume(); // Aumenta o volume para 23
      System.out.println("Volume atual: " + smartTv.volume); // Exibe o volume atual (23)

      // Testando o controle de canal
      System.out.println("Canal atual: " + smartTv.canal); // Exibe o canal atual (1)
      smartTv.mudarCanal(13); // Muda o canal para 13
      System.out.println("Canal atual: " + smartTv.canal); // Exibe o canal atual (13)

      // Verificando o estado da TV
      System.out.println("Tv ligada? " + smartTv.ligada); // Exibe se a TV está ligada (false)

      // Ligando a TV
      smartTv.ligar(); // Liga a TV
      System.out.println("Novo Status -> TV ligada? " + smartTv.ligada); // Exibe o novo status (true)

      // Desligando a TV
      smartTv.desligar(); // Desliga a TV
      System.out.println("Novo Status -> TV ligada? " + smartTv.ligada); // Exibe o novo status (false)
   }
}