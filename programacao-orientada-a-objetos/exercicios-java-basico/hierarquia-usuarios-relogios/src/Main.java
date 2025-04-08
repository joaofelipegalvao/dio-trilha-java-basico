public class Main {
  public static void main(String[] args) {
    // Cria um relógio brasileiro e configura a hora para 13:00:00
    Relogio brlRelogio = new RelogioBR();
    brlRelogio.setSegundo(0);
    brlRelogio.setMinuto(0);
    brlRelogio.setHora(13);

    // Mostra a hora no formato BR (13:00:00)
    System.out.println(brlRelogio.getTempo());

    // Converte para formato americano (deve mostrar 01:00:00 PM)
    System.out.println(new RelogioUS().convert(brlRelogio).getTempo());
  }
}
