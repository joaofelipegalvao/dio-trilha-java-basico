package interfaces.equipamentos.impressora;

public class Scanner implements Impressora {

  @Override
  public void imprimir() {
    System.out.println("IMPRIMINDO DESKJET...");
  }
}
