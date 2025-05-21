package br.com.dio;

public class Main {
   public static void main(String[] args) {
      // Criando endereços
      Endereco enderecoJoao = new Endereco(
              "Rua das Flores", "123", "Apto 101", "Centro",
              "São Paulo", "SP", "01234-567");

      Endereco enderecoMaria = new Endereco(
              "Avenida Brasil", "456", "", "Jardins",
              "Rio de Janeiro", "RJ", "04567-890");

      // Criando clientes
      Cliente joao = new Cliente();
      joao.setNome("João Silva");
      joao.setCpf("123.456.789-00");
      joao.setTelefone("(11) 9999-8888");
      joao.setEndereco(enderecoJoao);
      joao.setTipo(TipoCliente.VIP);

      Cliente maria = new Cliente();
      maria.setNome("Maria Oliveira");
      maria.setCpf("987.654.321-00");
      maria.setTelefone("(21) 98888-7777");
      maria.setEndereco(enderecoMaria);
      maria.setTipo(TipoCliente.EMPRESARIAL);

      // Criando contas
      Conta ccJoao = new ContaCorrente(joao);
      Conta cpJoao = new ContaPoupanca(joao);
      Conta ccMaria = new ContaCorrente(maria);
      Conta cpMaria = new ContaPoupanca(maria);

      // Operações
      ccJoao.depositar(1000);
      ccJoao.transferir(300, cpJoao);
      ((ContaPoupanca) cpJoao).aplicarRendimento();

      ccMaria.depositar(2000);
      ccMaria.transferir(500, cpMaria);
      ((ContaPoupanca) cpMaria).aplicarRendimento();

      // Banco
      Banco banco = new Banco();
      banco.setNome("DIO Bank");
      banco.adicionarConta(ccJoao);
      banco.adicionarConta(cpJoao);
      banco.adicionarConta(ccMaria);
      banco.adicionarConta(cpMaria);

      // Exibir informações
      ccJoao.imprimirExtrato();
      cpJoao.imprimirExtrato();
      ccMaria.imprimirExtrato();
      cpMaria.imprimirExtrato();

      banco.listarClientes();
      banco.listarContas();
   }
}