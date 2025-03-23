package lanchonete.atendimento.cozinha;

public class Almoxarife {
  private void controlarEntrada() {
    System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
  }

  private void controlarSaida() {
    System.out.println("CONTROLANDO A SAIDA DOS ITENS");
  }

  // Só pessoa do seu pacote consegue acessar
  void entregarIngredientes() {
    System.out.println("ENTREGANDO INGREDIENTES");
    controlarSaida();
  }

  void trocarGas() {
    System.out.println("ALMOXARIFE TROCANDO GAS");
  }
}
