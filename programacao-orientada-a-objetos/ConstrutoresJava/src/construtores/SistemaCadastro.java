package construtores;

public class SistemaCadastro {
  public static void main(String[] args) {
    // Criamos um objeto da classe Pessoa
    // O construtor da classe Pessoa é chamado com os valores "Marcos" e "123.456.789-00"
    Pessoa marcos = new Pessoa("Marcos", "123.456.789-00");

    // Usando o método setter para definir o endereço da pessoa
    marcos.setEndereco("RUA DAS MARIAS");

    // Exibindo as informações da pessoa no console
    // Usamos os métodos getters para acessar os valores dos atributos
    System.out.println(marcos.getNome() + " - " + marcos.getEndereco());
  }
}
