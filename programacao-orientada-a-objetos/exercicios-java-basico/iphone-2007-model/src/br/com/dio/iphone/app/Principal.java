package br.com.dio.iphone.app;

import br.com.dio.iphone.model.Iphone;

public class Principal {
   public static void main(String[] args) {
      Iphone meuIphone = new Iphone("Iphone 2s", "Preto", 16);
      System.out.println(meuIphone);
      meuIphone.selecionarMusica("Qualquer música...");
      meuIphone.tocar();
      meuIphone.ligar("0800 000");
      meuIphone.exibirPagina("www.google.com.br");
      meuIphone.ligarDispositivo();
      meuIphone.desligarDispositivo();
   }
}
