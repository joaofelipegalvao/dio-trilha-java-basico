package usuario;

import apps.Facebook;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
  public static void main(String[] args) {
    ServicoMensagemInstantanea smi = null;

    String appEscolhido = "fb";

    if (appEscolhido.equals("msn")) {
      smi = new MSNMessenger();
    } else if (appEscolhido.equals("fb")) {
      smi = new Facebook();
    } else if (appEscolhido.equals("tlg")) {
      smi = new Telegram();
    }
    smi.enviarMensagem();
    smi.receberMensagem();
  }
}
