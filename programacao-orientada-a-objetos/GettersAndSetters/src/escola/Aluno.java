package escola;

// Classe que representa um Aluno
public class Aluno {

  // Atributos privados para encapsulamento
  private String nome;
  private int idade;
  private String sexo;

  // Método Setter: Permite definir o valor do atributo "sexo"
  public void setSexo(String sexo) {
    this.sexo = sexo; // A palavra-chave "this" se refere ao atributo da classe
  }

  // Método Getter: Retorna o valor do atributo "sexo"
  public String getSexo() {
    return sexo;
  }

  // Método Getter: Retorna o valor do atributo "nome"
  public String getNome() {
    return nome;
  }

  // Método Setter: Permite definir o valor do atributo "nome"
  public void setNome(String nome) {
    this.nome = nome;
  }

  // Método Getter: Retorna o valor do atributo "idade"
  public int getIdade() {
    return idade;
  }

  // Método Setter: Permite definir o valor do atributo "idade"
  public void setIdade(int idade) {
    this.idade = idade;
  }
}
