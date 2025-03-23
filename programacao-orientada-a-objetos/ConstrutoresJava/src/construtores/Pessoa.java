package construtores;

public class Pessoa {
  // Atributos privados da classe
  private String nome; // Armazena o nome da pessoa
  private String cpf; // Armazena o CPF da pessoa
  private String endereco; // Armazena o endereço da pessoa

  /*
  Método construtor
  O construtor é chamado automaticamente quando um objeto é criado.
  Ele deve ter o mesmo nome da classe e não possui tipo de retorno.
  Este construtor recebe dois parâmetros: nome e cpf.
  */

  public Pessoa(String nome, String cpf) {
    this.nome = nome; // Atribui o valor do parâmetro 'nome' ao atributo 'nome' da classe.
    this.cpf = cpf; // Atribui o valor do parâmetro 'cpf' ao atributo 'cpf' da classe.
  }

  // Método Getter para o atributo 'nome'
  // Retorna o valor do atributo 'nome'
  public String getNome() {
    return nome;
  }

  // Método Getter para o atributo 'cpf'
  // Retorna o valor do atributo 'cpf'
  public String getCpf() {
    return cpf;
  }

  // Método Getter para o atributo 'endereco'
  // Retorna o valor do atributo 'endereco'
  public String getEndereco() {
    return endereco;
  }

  // Método Setter para o atributo 'endereco'
  // Permite modificar o valor do atributo 'endereco'
  public void setEndereco(String endereco) {
    this.endereco = endereco; // Atribui o valor do parâmetro 'endereco' ao atributo da classe
  }
}
