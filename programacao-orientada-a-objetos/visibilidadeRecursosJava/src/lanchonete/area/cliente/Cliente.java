package lanchonete.area.cliente;

public class Cliente {
  // Métodos públicos: podem ser acessados por qualquer classe
  public void escolherLanche() {
    System.out.println("ESCOLHENDO O LANCHE");
  }

  public void fazerPedido() {
    System.out.println("FAZENDO O PEDIDO");
  }

  public void pagarConta() {
    System.out.println("PAGANDO A CONTA");
  }

  // Método privado: só pode ser acessado dentro da classe Cliente
  private void consultarSaldoAplicativo() {
    System.out.println("CONSULTANDO SALDO NO APLICATIVO");
  }

  // Método privado: só pode ser acessado dentro da classe Cliente
  // NÃO deveria nem existir - refatoração. Já temos atendente para servir a mesa
  // public void pegarPedidoBalcao() {
  //   System.out.println("PEGANDO O PEDIDO NO BALCAO");
  // }
}
