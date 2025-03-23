package lanchonete.atendimento;

public class Atendente {
  // Método público: pode ser acessado por qualquer classe
  public void servindoMesa() {
    pegarLancheCozinha();
    System.out.println("SERVINDO MESA");
  }

  // Método privado: só pode ser acessado dentro da classe Atendente
  private void pegarLancheCozinha() {
    System.out.println("PEGANDO LANCHE NA COZINHA");
  }

  // Método público: pode ser acessado por qualquer classe
  public void receberPagamento() {
    System.out.println("RECEBENDO PAGAMENTO");
  }

  // Método default: só pode ser acessado dentro do mesmo pacote
  void trocarGas() {
    System.out.println("ATENDENTE TROCANDO O GÁS");
  }

  // Método privado: só pode ser acessado dentro da classe Atendente
  private void pegarPedidoBalcao() {
    System.out.println("PEGANDO O PEDIDO NO BALCAO");
  }
}
