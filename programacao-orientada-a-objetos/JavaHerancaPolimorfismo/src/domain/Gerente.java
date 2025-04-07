package domain;

// Classe Gerente também herda de Funcionario
public non-sealed class Gerente extends Funcionario {

  // Atributos específicos do gerente
  private String login;
  private String senha;
  private double comissao;

  // Construtor completo com atributos da superclasse e os novos
  public Gerente(
      String code,
      String nome,
      String endereco,
      int idade,
      double salario,
      String login,
      String senha,
      double comissao) {
    super(code, nome, endereco, idade, salario); // chama o construtor da superclasse
    this.login = login;
    this.senha = senha;
    this.comissao = comissao;
  }

  // Construtor vazio
  public Gerente() {}

  // Getters e setters
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double commissao) {
    this.comissao = commissao;
  }

  // Sobrescreve o código com prefixo "GE"
  @Override
  public String getCode() {
    return "GE" + this.code;
  }

  // Implementa o cálculo do salário total
  @Override
  public double getSalarioIntegral() {
    return this.salario + this.comissao;
  }
}
