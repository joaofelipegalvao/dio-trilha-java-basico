package domain;

// Classe abstrata selada: só permite herança pelas classes especificadas
public abstract sealed class Funcionario permits Gerente, Vendedor {

  // Atributos comuns a todos os funcionários
  protected String code;
  protected String nome;
  protected String endereco;
  protected int idade;
  protected double salario;

  // Construtor com parâmetros (usado para inicializar os dados do funcionário)
  public Funcionario(String code, String nome, String endereco, int idade, double salario) {
    this.code = code;
    this.nome = nome;
    this.endereco = endereco;
    this.idade = idade;
    this.salario = salario;
  }

  // Construtor vazio (caso queira criar um objeto sem passar dados)
  public Funcionario() {}

  // Métodos getters e setters (acessar e modificar os atributos)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  // Método abstrato: precisa ser implementado pelas subclasses
  public abstract double getSalarioIntegral();

  // Sobrecarga: mesma função, mas recebe um valor extra
  public double getSalarioIntegral(double extra) {
    return this.getSalarioIntegral() + extra;
  }
}
