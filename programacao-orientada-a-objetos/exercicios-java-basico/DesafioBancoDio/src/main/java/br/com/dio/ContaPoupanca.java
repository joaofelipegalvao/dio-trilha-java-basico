package br.com.dio;

public class ContaPoupanca extends Conta {
   private static final double TAXA_RENDIMENTO = 0.005;

   public ContaPoupanca(Cliente cliente) {
      super(cliente);
   }

   public void aplicarRendimento() {
      double rendimento = saldo * TAXA_RENDIMENTO;
      saldo += rendimento;
      transacoes.add(new Transacao(Transacao.TipoTransacao.DEPOSITO, rendimento));
   }

   @Override
   public void imprimirExtrato() {
      System.out.println("\n=== Extrato Conta Poupança ===");
      imprimirInfosComuns();
      System.out.printf("Rendimento mensal: %.2f%%\n", TAXA_RENDIMENTO * 100);
   }
}