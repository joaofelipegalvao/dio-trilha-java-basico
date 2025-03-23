package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
  public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();

    // cozinheiro.lavarIngredientes(); // Método privado, só pode ser acessado dentro da classe
    // Cozinheiro
    // cozinheiro.baterVitaminaLiquidificador(); // Método privado, só pode ser acessado dentro da
    // classe Cozinheiro
    // cozinheiro.selecionarIngredientesVitamina(); // Método privado, só pode ser acessado dentro
    // da classe Cozinheiro
    // cozinheiro.prepararLanche(); // Método privado, só pode ser acessado dentro da classe
    // Cozinheiro
    // cozinheiro.prepararVitamina(); // Método privado, só pode ser acessado dentro da classe
    // Cozinheiro

    // Ações que o estabelecimento precisa ter ciência
    cozinheiro.adicionarLancheBalcao(); // Método público, pode ser acessado por qualquer classe
    cozinheiro.adicionarSucoNoBalcao(); // Método público, pode ser acessado por qualquer classe
    cozinheiro.adicionarComboNoBalcao(); // Método público, pode ser acessado por qualquer classe

    // Almoxarife almoxarife = new Almoxarife(); // Almoxarife não é acessível aqui porque está em
    // outro pacote e não é público

    // ações que não precisam estarem disponíveis para toda a aplicação
    // almoxarife.controlarEntrada(); // Método privado, só pode ser acessado dentro da classe
    // Almoxarife
    // almoxarife.controlarSaida(); // Método privado, só pode ser acessado dentro da classe
    // Almoxarife

    // ação que somente o seu pacote cozinha precisa conhecer (default)
    // almoxarife.entregarIngredientes(); // Método default, só pode ser acessado dentro do mesmo
    // pacote
    // almoxarife.trocarGas(); // Método default, só pode ser acessado dentro do mesmo pacote

    Atendente atendente = new Atendente();

    // atendente.pegarLancheCozinha(); // Método privado, só pode ser acessado dentro da classe
    // Atendente
    atendente.servindoMesa(); // Método público, pode ser acessado por qualquer classe
    atendente.receberPagamento(); // Método público, pode ser acessado por qualquer classe

    // ação que somente o seu pacote cozinha precisa conhecer (default)
    // atendente.trocarGas(); // Método default, só pode ser acessado dentro do mesmo pacote

    Cliente cliente = new Cliente();
    cliente.escolherLanche(); // Método público, pode ser acessado por qualquer classe
    cliente.fazerPedido(); // Método público, pode ser acessado por qualquer classe
    cliente.pagarConta(); // Método público, pode ser acessado por qualquer classe

    // não deveria, mas o estabelecimento ainda não definiu normas de atendimento
    // cliente.pegarPedidoBalcao(); // Método privado, só pode ser acessado dentro da classe Cliente

    // esta ação é muito sigilosa, que tal ser privada?
    // cliente.consultarSaldoAplicativo(); // Método privado, só pode ser acessado dentro da classe
    // Cliente

    // já pensou os clientes ouvindo que o gás acabou?
    // cozinheiro.pedirParaTrocarGas(atendente); // Método privado, só pode ser acessado dentro da
    // classe Cozinheiro
    // cozinheiro.pedirParaTrocarGas(almoxarife); // Método privado, só pode ser acessado dentro da
    // classe Cozinheiro
  }
}
