package enums;

/**
 * Classe de exemplo que demonstra como iterar sobre os valores de um enum e acessar seus métodos.
 */
public class SistemaIbge {
  public static void main(String[] args) {
    // Loop através de todos os valores do enum EstudoBrasileiro
    // values() retorna um array com todas as constantes do enum
    for (EstudoBrasileiro estado : EstudoBrasileiro.values()) {
      // Para cada estado, imprime sua sigla e nome
      System.out.println(
          estado.getSigla()
              + // Obtém a sigla do estado
              " - "
              + estado.getNome() // Obtém o nome completo do estado
          );
    }

    /* Saída esperada:
       SP - São Paulo
       RJ - Rio de Janeiro
       PI - Piauí
       MA - Maranhão
    */
  }
}
