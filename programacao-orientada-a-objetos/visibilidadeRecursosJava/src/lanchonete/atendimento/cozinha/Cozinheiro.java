package lanchonete.atendimento.cozinha;

public class Cozinheiro {

  // pode ser default
  public void adicionarLancheBalcao() {
    System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
  }

  // pode ser default
  public void adicionarSucoNoBalcao() {
    System.out.println("ADICIONANDO SUCO NO BALCAO");
  }

  // pode ser default
  public void adicionarComboNoBalcao() {
    adicionarLancheBalcao();
    adicionarSucoNoBalcao();
  }

  private void prepararLanche() {
    System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
  }

  private void prepararVitamina() {
    System.out.println("PREPARANDO SUCO");
  }

  private void prepararCombo() {
    prepararLanche();
    prepararVitamina();
  }

  private void selecionarIngredientesLanche() {
    System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
  }

  private void selecionarIngredientesVitamina() {
    System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
  }

  private void lavarIngredientes() {
    System.out.println("LAVANDO INGREDIENTES");
  }

  private void baterVitaminaLiquidificador() {
    System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
  }

  private void fritarIngredientesLanche() {
    System.out.println("FRITANDO A CARNE E OVO PARA HAMBURGUER");
  }

  // public void pedirParaTrocarGas(Atendente meuAmigo) {
  //   meuAmigo.trocarGas();
  // }

  private void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
  }

  private void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }
}
