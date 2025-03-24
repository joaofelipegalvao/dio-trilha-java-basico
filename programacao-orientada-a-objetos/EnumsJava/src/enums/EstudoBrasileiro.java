package enums;

/**
 * Enum que representa estados brasileiros com suas siglas e nomes. Demonstra como enums podem ter
 * atributos, construtores e métodos.
 */
public enum EstudoBrasileiro {
  // Constantes do enum com valores iniciais
  SAO_PAULO("SP", "São Paulo"), // Cria a constante SAO_PAULO com sigla "SP" e nome "São Paulo"
  RIO_DE_JANEIRO("RJ", "Rio de Janeiro"), // Constante para Rio de Janeiro
  PIAUI("PI", "Piauí"), // Constante para Piauí
  MARANHAO("MA", "Maranhão"); // Constante para Maranhão

  // Atributos do enum - cada constante terá esses valores
  private final String sigla; // Sigla do estado (final pois não deve mudar)
  private final String nome; // Nome completo do estado

  /**
   * Construtor do enum (implícitamente privado)
   *
   * @param sigla Sigla do estado (2 letras)
   * @param nome Nome completo do estado
   */
  EstudoBrasileiro(String sigla, String nome) {
    this.sigla = sigla;
    this.nome = nome;
  }

  /**
   * @return A sigla do estado
   */
  public String getSigla() {
    return sigla;
  }

  /**
   * @return O nome completo do estado
   */
  public String getNome() {
    return nome;
  }

  /**
   * @return O nome do estado em letras maiúsculas
   */
  public String getNomeMaiusculo() {
    return nome.toUpperCase(); // Converte o nome para maiúsculas
  }
}
