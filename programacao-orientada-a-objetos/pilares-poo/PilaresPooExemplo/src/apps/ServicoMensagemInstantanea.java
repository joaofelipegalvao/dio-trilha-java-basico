package apps;

public abstract class ServicoMensagemInstantanea {

  public abstract void enviarMensagem();

  public abstract void receberMensagem();

  // Somente as classes filhas podem acessar esse método
  protected void validarConectadoInternet() {
    System.out.println("Validando se está conectado a internet");
  }
}
