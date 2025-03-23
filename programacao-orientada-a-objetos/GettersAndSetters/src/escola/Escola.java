package escola;

// Classe principal que testa a classe Aluno
public class Escola {
  public static void main(String[] args) {
    // Criando um objeto da classe Aluno
    Aluno felipe = new Aluno();

    // Utilizando os métodos Setter para definir valores aos atributos privados
    felipe.setNome("Felipe Jose"); // Definindo o nome do aluno
    felipe.setIdade(17); // Definindo a idade do aluno

    // Utilizando os métodos Getter para obter e exibir os valores dos atributos
    System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
  }
}
