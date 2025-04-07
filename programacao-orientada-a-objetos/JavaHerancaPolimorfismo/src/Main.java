import domain.Funcionario;
import domain.Gerente;
import domain.Vendedor;

public class Main {
  public static void main(String[] args) {
    // Cria e imprime um gerente
    printFuncionario(new Gerente());

    // Cria e imprime um vendedor
    printFuncionario(new Vendedor());
  }

  // Método que recebe um funcionário e imprime dados de acordo com o tipo
  public static void printFuncionario(Funcionario funcionario) {
    funcionario.setCode(""); // define o código base como vazio

    // Mostra o nome completo da classe
    System.out.printf("=======%s=======\n", funcionario.getClass().getCanonicalName());

    // Padrão de decisão baseado no tipo real do objeto (pattern matching com switch)
    switch (funcionario) {

      // Se for um Gerente
      case Gerente gerente -> {
        gerente.setCode("123");
        gerente.setNome("João");
        gerente.setSalario(5000);
        gerente.setLogin("joao");
        gerente.setSenha("12345");
        gerente.setComissao(1200);

        // Impressão dos dados
        System.out.println(gerente.getCode()); // GE123
        System.out.println(gerente.getSalario()); // 5000
        System.out.println(gerente.getNome()); // João
        System.out.println(gerente.getLogin()); // joao
        System.out.println(gerente.getSenha()); // 12345
        System.out.println(gerente.getComissao()); // 1200
      }

      // Se for um Vendedor
      case Vendedor vendedor -> {
        vendedor.setCode("456");
        vendedor.setNome("Lucas");
        vendedor.setSalario(2800);
        vendedor.setPorcentagemPorVenda(10);
        vendedor.setValorVendido(1000);

        // Impressão dos dados
        System.out.println(vendedor.getCode()); // VD456
        System.out.println(vendedor.getSalario()); // 2800
        System.out.println(vendedor.getNome()); // Lucas
        System.out.println(vendedor.getPorcentagemPorVenda()); // 10
        System.out.println(vendedor.getValorVendido()); // 1000
      }
    }

    // Imprime o salário com um valor extra (500)
    System.out.println(funcionario.getSalarioIntegral(500));

    // Imprime o salário calculado normalmente
    System.out.println(funcionario.getSalarioIntegral());
  }
}
