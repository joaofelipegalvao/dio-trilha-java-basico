package br.com.dio.iphone.model;

import br.com.dio.iphone.interfaces.AparelhoTelefonico;
import br.com.dio.iphone.interfaces.NavegadorInternet;
import br.com.dio.iphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
   private String modelo;
   private String cor;
   private int capacidade;

   public Iphone(String modelo, String cor, int capacidade) {
      this.modelo = modelo;
      this.cor = cor;
      this.capacidade = capacidade;
   }

   @Override
   public String toString() {
      return String.format(
              "Iphone [Modelo: %s, Cor: %s, Capacidade: %dGB]",
              modelo, cor, capacidade
      );
   }

   @Override
   public void tocar() {
      System.out.println("Tocando música");
   }

   @Override
   public void pausar() {
      System.out.println("Pausando música");
   }

   @Override
   public void selecionarMusica(String musica) {
      System.out.println("Música selecionada: " + musica);
   }

   @Override
   public void ligar(String numero) {
      System.out.println("Ligando para o número: " + numero);
   }

   @Override
   public void atender() {
      System.out.println("Atendendo a ligação");
   }

   @Override
   public void iniciarCorreioVoz() {
      System.out.println("Iniciando o correio de voz");
   }

   @Override
   public void exibirPagina(String url) {
      System.out.println("Página: " + url);
   }

   @Override
   public void adicionarNovaAba() {
      System.out.println("Adicionar nova aba");
   }

   @Override
   public void ligarDispositivo() {
      System.out.println("Ligando Iphone");
   }

   @Override
   public void desligarDispositivo() {
      System.out.println("Desligando Iphone");
   }

   @Override
   public void atualizarPagina() {
      System.out.println("Atualizar página");
   }
}
