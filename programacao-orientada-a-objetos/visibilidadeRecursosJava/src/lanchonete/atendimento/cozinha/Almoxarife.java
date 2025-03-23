package lanchonete.atendimento.cozinha;

public class Almoxarife {
  // Métodos privados: só podem ser acessados dentro da classe Almoxarife
  private void controlarEntrada() {
    System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
  }

  private void controlarSaida() {
    System.out.println("CONTROLANDO A SAIDA DOS ITENS");
  }

  // Método default: só pode ser acessado dentro do mesmo pacote
  void entregarIngredientes() {
    System.out.println("ENTREGANDO INGREDIENTES");
    controlarSaida();
  }

  // Método default: só pode ser acessado dentro do mesmo pacote
  void trocarGas() {
    System.out.println("ALMOXARIFE TROCANDO GAS");
  }
}
