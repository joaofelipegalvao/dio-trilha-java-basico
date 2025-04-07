package domain;

// Classe Vendedor herda de Funcionario
public non-sealed class Vendedor extends Funcionario {

  // Atributos específicos do vendedor
  private double porcentagemPorVenda;
  private double valorVendido;

  // Construtor com todos os atributos (incluindo os herdados)
  public Vendedor(
      String code,
      String nome,
      String endereco,
      int idade,
      double salario,
      double porcentagemPorVenda,
      double valorVendido) {
    super(code, nome, endereco, idade, salario); // chama o construtor da superclasse
    this.porcentagemPorVenda = porcentagemPorVenda;
    this.valorVendido = valorVendido;
  }

  // Construtor vazio (pode ser útil ao instanciar sem valores ainda)
  public Vendedor() {}

  // Sobrescrevendo o método getCode para adicionar prefixo "VD"
  @Override
  public String getCode() {
    return "VD" + this.code;
  }

  // Getters e setters
  public double getPorcentagemPorVenda() {
    return porcentagemPorVenda;
  }

  public void setPorcentagemPorVenda(double porcentagemPorVenda) {
    this.porcentagemPorVenda = porcentagemPorVenda;
  }

  public double getValorVendido() {
    return valorVendido;
  }

  public void setValorVendido(double valorVendido) {
    this.valorVendido = valorVendido;
  }

  // Implementação do método abstrato de Funcionario
  @Override
  public double getSalarioIntegral() {
    // Salário + comissão calculada com base na porcentagem
    return this.salario + (valorVendido * porcentagemPorVenda / 100);
  }
}
