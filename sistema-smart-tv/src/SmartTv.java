public class SmartTv {
   // Atributos da SmartTv
   boolean ligada = false; // Indica se a TV está ligada ou desligada (inicialmente desligada)
   int canal = 1;          // Canal atual da TV (inicialmente no canal 1)
   int volume = 25;        // Volume atual da TV (inicialmente no volume 25)

   // Método para mudar o canal da TV
   public void mudarCanal(int novoCanal) {
      canal = novoCanal; // Atualiza o canal para o valor passado como parâmetro
   }

   // Método para aumentar o canal em 1 unidade
   public void aumentarCanal() {
      canal++; // Incrementa o canal atual
   }

   // Método para diminuir o canal em 1 unidade
   public void diminuirCanal() {
      canal--; // Decrementa o canal atual
   }

   // Método para aumentar o volume em 1 unidade
   public void aumentarVolume() {
      volume++; // Incrementa o volume atual
      System.out.println("Aumentando volume para: " + volume); // Exibe o novo volume
   }

   // Método para diminuir o volume em 1 unidade
   public void diminuirVolume() {
      volume--; // Decrementa o volume atual
      System.out.println("Diminuindo volume para: " + volume); // Exibe o novo volume
   }

   // Método para ligar a TV
   public void ligar() {
      ligada = true; // Altera o estado da TV para ligada
   }

   // Método para desligar a TV
   public void desligar() {
      ligada = false; // Altera o estado da TV para desligada
   }
}