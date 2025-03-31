package br.com.petshop;

/**
 * Máquina de banho para pets que gerencia: - Estado de limpeza da máquina - Níveis de água e
 * shampoo - Operações de banho e limpeza
 */
public class PetMachine {

  // Indica se a máquina está limpa (true) ou suja (false)
  private boolean clean = true;

  // Quantidade atual de água (capacidade máxima: 30)
  private int water = 30;

  // Quantidade atual de shampoo (capacidade máxima: 30)
  private int shampoo = 10;

  // Referência para o pet atualmente na máquina (null se vazia)
  private Pet pet;

  /**
   * Realiza o banho do pet, consumindo recursos. Pré-condições: - Deve haver um pet na máquina -
   * Deve haver água e shampoo suficientes Efeitos: - Pet fica limpo - Máquina fica suja - Consome
   * 10 de água e 2 de shampoo
   */
  public void takeAShower() {
    if (this.pet == null) {
      System.out.println("Coloque o pet na máquina para iniciar o banho");
      return;
    }

    if (water < 10 || shampoo < 2) {
      System.out.println(
          "Recursos insuficientes para o banho (Água: " + water + ", Shampoo: " + shampoo + ")");
      return;
    }
    // Só consome se tiver rescursos suficientes
    this.water -= 10;
    this.shampoo -= 2;
    pet.setClean(true);
    this.clean = false;
    System.out.println("O pet " + pet.getName() + " está limpo");
  }

  /**
   * Adiciona água à máquina (incrementa em 2 unidades). Não ultrapassa o limite máximo de 30
   * unidades.
   */
  public void addWater() {
    if (water == 30) {
      System.out.println("A capacidade de água da máquina está no máximo");
      return;
    }

    water += 2;
  }

  /**
   * Adiciona shampoo à máquina (incrementa em 2 unidades). Não ultrapassa o limite máximo de 30
   * unidades.
   */
  public void addShampoo() {
    if (shampoo == 30) {
      System.out.println("A capacidade de shampoo da máquina está no máximo");
      return;
    }

    shampoo += 2;
  }

  /**
   * @return Quantidade atual de água na máquina
   */
  public int getWater() {
    return water;
  }

  /**
   * @return Quantidade atual de shampoo na máquina
   */
  public int getShampoo() {
    return shampoo;
  }

  /**
   * Verifica se há um pet na máquina.
   *
   * @return true se há um pet, false caso contrário
   */
  public boolean hasPet() {
    return pet != null;
  }

  /**
   * Altera o estado de limpeza da máquina.
   *
   * @param clean true para limpa, false para suja
   */
  public void setClean(boolean clean) {
    this.clean = clean;
  }

  /**
   * Define a quantidade de água (uso interno/testes).
   *
   * @param water Nova quantidade de água
   */
  public void setWater(int water) {
    this.water = water;
  }

  /**
   * Define a quantidade de shampoo (uso interno/testes).
   *
   * @param shampoo Nova quantidade de shampoo
   */
  public void setShampoo(int shampoo) {
    this.shampoo = shampoo;
  }

  /**
   * Coloca um pet na máquina, verificando condições: - Máquina deve estar limpa - Não pode haver
   * outro pet na máquina
   *
   * @param pet O pet a ser colocado na máquina
   */
  public void setPet(Pet pet) {
    if (!this.clean) {
      System.out.println(
          "[AVISO HIGIÊNICO] A máquina está suja. Limpe antes de colocar outro pet!");
      return;
    }
    if (hasPet()) {
      System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
      return;
    }
    this.pet = pet;
    System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
  }

  /**
   * Remove o pet atual da máquina. Verifica se há um pet antes de tentar remover. A máquina mantém
   * seu estado de limpeza atual.
   */
  public void removePet() {
    if (this.pet == null) {
      System.out.println("Não há pet na máquina para remover");
      return;
    }

    System.out.println("O pet " + this.pet.getName() + " foi tirado da máquina");
    this.pet = null;
  }

  /**
   * Limpa a máquina, consumindo recursos: - 10 unidades de água - 2 unidades de shampoo Máquina
   * fica limpa após a operação.
   */
  public void wash() {
    this.water -= 10;
    this.shampoo -= 2;
    this.clean = true;
    System.out.println("A máquina foi limpa");
  }
}
