// Classe abstrata base (modelo) que define a estrutura comum dos relógios
public abstract sealed class Relogio permits RelogioBR, RelogioUS {

  protected int hora;
  protected int minuto;
  protected int segundo;

  // Getter e setter da hora com verificação de limite
  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    if (hora >= 24) {
      this.hora = 24;
      return;
    }
    this.hora = hora;
  }

  // Getter e setter do minuto com verificação de limite
  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    if (minuto >= 60) {
      this.minuto = 60;
      return;
    }
    this.minuto = minuto;
  }

  // Getter e setter do segundo com verificação de limite
  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    if (segundo >= 60) {
      this.segundo = 60;
      return;
    }
    this.segundo = segundo;
  }

  // Método privado auxiliar para formatar números com 2 dígitos
  private String formatar(int valor) {
    return valor < 9 ? "0" + valor : String.valueOf(valor);
  }

  // Método que retorna o tempo no formato HH:MM:SS
  public String getTempo() {
    return formatar(hora) + ":" + formatar(minuto) + ":" + formatar(segundo);
  }

  // Método abstrato para ser implementado pelas subclasses
  abstract Relogio convert(Relogio relogio);
}
