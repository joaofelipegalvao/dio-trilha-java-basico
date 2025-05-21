package br.com.dio;

public class ContaCorrente extends Conta {
   public ContaCorrente(Cliente cliente) {
      super(cliente);
   }

   @Override
   public void imprimirExtrato() {
      System.out.println("\n=== Extrato Conta Corrente ===");
      imprimirInfosComuns();
      System.out.println("Tipo de cliente: " + cliente.getTipo());
   }
}