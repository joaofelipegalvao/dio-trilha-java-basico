// Implementação de um relógio no formato brasileiro (24 horas)
public non-sealed class RelogioBR extends Relogio {

  // Implementação do método de conversão
  @Override
  public Relogio convert(Relogio relogio) {
    // Copia minuto e segundo
    this.segundo = relogio.getSegundo();
    this.minuto = relogio.getMinuto();

    // Identifica o tipo do relógio usando pattern matching no switch
    switch (relogio) {
      // Se for um relógio americano, converte PM para hora + 12
      case RelogioUS usRelogio ->
          this.hora =
              (usRelogio.getIndicadorPeriodo().equals("PM"))
                  ? usRelogio.getHora() + 12
                  : usRelogio.getHora();

      // Se já for BR, apenas copia a hora
      case RelogioBR brRelogio -> this.hora = brRelogio.getHora();
    }

    return this;
  }
}
