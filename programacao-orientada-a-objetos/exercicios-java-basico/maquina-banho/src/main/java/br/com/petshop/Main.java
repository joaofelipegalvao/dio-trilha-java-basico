package br.com.petshop;

import java.util.Scanner;

/**
 * Classe principal que representa o sistema de gerenciamento da máquina de banho para pets.
 *
 * <p>Oferece um menu interativo para operar todas as funcionalidades do sistema através da classe
 * PetMachine.
 */
public class Main {

  /**
   * Scanner configurado para ler entradas do usuário. Usa \\n como delimitador para capturar linhas
   * completas.
   */
  private static final Scanner scanner = new Scanner(System.in);

  /**
   * Instância única da máquina de banho para pets. Todas as operações são delegadas para esta
   * instância.
   */
  private static final PetMachine petMachine = new PetMachine();

  /**
   * Ponto de entrada principal do programa.
   *
   * @param args Argumentos de linha de comando (não utilizados)
   */
  public static void main(String[] args) {
    // Configura o scanner para ler a linha inteira (incluindo espaços)
    scanner.useDelimiter("\\n");

    // Variável para armazenar a opção selecionada pelo usuário
    var option = -1;

    // Loop principal do programa
    do {
      // Exibe o menu de opções formatado
      System.out.println("===Escolha uma das opções===");
      System.out.println("1 - Dar banho no pet");
      System.out.println("2 - Abastecer a máquina com água");
      System.out.println("3 - Abastecer a máquina com shampoo");
      System.out.println("4 - Verificar água da máquina ");
      System.out.println("5 - Verificar shampoo da máquina");
      System.out.println("6 - Verificar se tem pet no banho");
      System.out.println("7 - Colocar pet na máquina");
      System.out.println("8 - Retirar pet na máquina");
      System.out.println("9 - Limpar a máquina");
      System.out.println("0 - sair");

      // Lê a opção do usuário
      option = scanner.nextInt();

      // Processa a opção selecionada
      switch (option) {
        case 1 -> petMachine.takeAShower(); // Executa o banho
        case 2 -> setWater(); // Adiciona água
        case 3 -> setShmapoo(); // Adiciona shampoo
        case 4 -> verifyWater(); // Verifica água
        case 5 -> verifyShampoo(); // Verifica shampoo
        case 6 -> checkIfHasPetInMachine(); // Verifica pet
        case 7 -> setPetInPetMachine(); // Coloca pet
        case 8 -> petMachine.removePet(); // Remove pet
        case 9 -> petMachine.wash(); // Limpa máquina
        case 0 -> System.exit(0); // Encerra programa
        default -> System.out.println("Opção inválida"); // Trata entrada inválida
      }
    } while (true); // Loop infinito até o usuário escolher sair
  }

  /**
   * Gerencia o processo de adicionar água à máquina. Delega a operação para o método addWater() da
   * PetMachine.
   */
  private static void setWater() {
    System.out.println("Adicionando água na máquina");
    petMachine.addWater();
  }

  /**
   * Gerencia o processo de adicionar shampoo à máquina. Delega a operação para o método
   * addShampoo() da PetMachine.
   */
  private static void setShmapoo() {
    System.out.println("Adicionando shampoo na máquina");
    petMachine.addShampoo();
  }

  /**
   * Exibe a quantidade atual de água na máquina. Obtém o valor através do método getWater() da
   * PetMachine.
   */
  private static void verifyWater() {
    var amout = petMachine.getWater();
    System.out.println("A máquina está no momento com " + amout + "litro(s) de água");
  }

  /**
   * Exibe a quantidade atual de shampoo na máquina. Obtém o valor através do método getShampoo() da
   * PetMachine.
   */
  private static void verifyShampoo() {
    var amout = petMachine.getShampoo();
    System.out.println("A máquina está no momento com " + amout + "litro(s) de shampoo");
  }

  /**
   * Verifica e informa se há um pet atualmente na máquina. Utiliza o método hasPet() da PetMachine
   * para a verificação.
   */
  private static void checkIfHasPetInMachine() {
    var hasPet = petMachine.hasPet();
    System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
  }

  /**
   * Gerencia o processo de criação e colocação de um pet na máquina. Solicita o nome do pet até
   * receber uma entrada válida (não vazia). Cria uma nova instância de Pet e a coloca na máquina.
   */
  public static void setPetInPetMachine() {
    var name = "";
    // Loop até receber um nome válido
    while (name == null || name.isEmpty()) {
      System.out.println("Informe o nome do pet");
      name = scanner.next();
    }
    var pet = new Pet(name);
    petMachine.setPet(pet);
  }
}
