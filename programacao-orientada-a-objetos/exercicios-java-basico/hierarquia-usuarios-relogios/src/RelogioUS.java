// Implementação de um relógio no formato americano (12 horas com AM/PM)
public non-sealed class RelogioUS extends Relogio {
  private String indicadorPeriodo; // AM ou PM

  public String getIndicadorPeriodo() {
    return indicadorPeriodo;
  }

  public void setDepoisDoMeioDia() {
    this.indicadorPeriodo = "PM";
  }

  public void setAntesDoMeioDia() {
    this.indicadorPeriodo = "AM";
  }

  // Sobrescreve o setHora para aplicar lógica de 12h
  public void setHora(int hora) {
    setAntesDoMeioDia(); // Assume AM por padrão

    if ((hora > 12) && (hora <= 23)) {
      setDepoisDoMeioDia(); // Se for de 13 até 23, é PM
      this.hora = hora - 12; // Converte para formato 12h
    } else if (hora >= 24) {
      this.hora = 0; // Hora inválida → define como 0
    } else {
      this.hora = hora;
    }
  }

  // Converte de outro relógio (BR ou US) para este formato
  @Override
  Relogio convert(Relogio relogio) {

    switch (relogio) {
      // Se for US, apenas copia os valores
      case RelogioUS usRelogio -> {
        this.hora = usRelogio.getHora();
        this.indicadorPeriodo = usRelogio.getIndicadorPeriodo();
      }

      // Se for BR, usa o setHora para converter para 12h com AM/PM
      case RelogioBR brRelogio -> this.setHora(brRelogio.getHora());
    }

    return this;
  }

  // Adiciona o AM/PM ao final do tempo formatado
  @Override
  public String getTempo() {
    return super.getTempo() + " " + this.indicadorPeriodo;
  }
}
