package br.com.dio;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Banco {
   private String nome;
   private final List<Conta> contas = new ArrayList<>();

   public void adicionarConta(Conta conta) {
      contas.add(conta);
   }

   public void listarClientes() {
      System.out.println("\n=== Clientes do Banco " + nome + " ===");
      contas.stream()
              .map(Conta::getCliente)
              .distinct()
              .forEach(cliente -> System.out.println(cliente.getNome()));
   }

   public void listarContas() {
      System.out.println("\n=== Contas do Banco " + nome + " ===");
      contas.forEach(conta -> {
         System.out.println("Tipo: " + conta.getClass().getSimpleName());
         System.out.println("Títular: " + conta.getCliente().getNome());
         System.out.println("Agência: " + conta.getAgencia());
         System.out.println("Número: " + conta.getNumero());
         System.out.println("Saldo: R$ " + conta.getSaldo());
         System.out.println("-------------------");
      });
   }
}