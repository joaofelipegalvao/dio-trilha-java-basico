package br.com.dio;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements InterfaceConta {
   private static final int AGENCIA_PADRAO = 1;
   private static int SEQUENCIAL = 1;

   protected int agencia;
   protected int numero;
   protected double saldo;
   protected Cliente cliente;
   protected List<Transacao> transacoes = new ArrayList<>();

   public Conta(Cliente cliente) {
      this.agencia = AGENCIA_PADRAO;
      this.numero = SEQUENCIAL++;
      this.cliente = cliente;
   }

   @Override
   public void depositar(double valor) {
      saldo += valor;
      transacoes.add(new Transacao(Transacao.TipoTransacao.DEPOSITO, valor));
   }

   @Override
   public void sacar(double valor) {
      saldo -= valor;
      transacoes.add(new Transacao(Transacao.TipoTransacao.SAQUE, valor));
   }

   @Override
   public void transferir(double valor, Conta contaDestino) {
      this.sacar(valor);
      contaDestino.depositar(valor);
      transacoes.add(new Transacao(Transacao.TipoTransacao.TRANSFERENCIA_ENVIADA, valor));
   }

   protected void imprimirInfosComuns() {
      System.out.println("Títular: " + cliente.getNome());
      System.out.println("Agência: " + agencia);
      System.out.println("Número: " + numero);
      System.out.printf("Saldo: R$ %.2f\n", saldo);
   }

   public int getAgencia() {
      return agencia;
   }

   public int getNumero() {
      return numero;
   }

   public double getSaldo() {
      return saldo;
   }

   public Cliente getCliente() {
      return cliente;
   }
}