package br.com.petshop;

/**
 * Representa um animal de estimação (pet) que pode tomar banho na máquina. Armazena informações
 * básicas como nome e estado de limpeza.
 */
public class Pet {

  // Nome do pet - marcado como 'final' porque não pode mudar após a criação
  private final String name;

  // Estado de limpeza: true = limpo, false = sujo
  private boolean clean;

  /**
   * Construtor que inicializa um novo pet.
   *
   * @param nome Nome do pet (não pode ser null ou vazio)
   */
  public Pet(String nome) {
    this.name = nome;
    this.clean = false; // Todo pet começa como sujo por padrão
  }

  /**
   * @return O nome do pet
   */
  public String getName() {
    return name;
  }

  /**
   * Verifica o estado de limpeza do pet.
   *
   * @return true se o pet está limpo, false se está sujo
   */
  public boolean isClean() {
    return clean;
  }

  /**
   * Altera o estado de limpeza do pet.
   *
   * @param clean true para marcar como limpo, false para marcar como sujo
   */
  public void setClean(boolean clean) {
    this.clean = clean;
  }
}
