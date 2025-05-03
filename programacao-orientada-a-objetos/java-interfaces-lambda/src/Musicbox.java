public class Musicbox implements MusicPlayer {

  @Override
  public void pauseMusic() {
    System.out.println("A caixa de música está pausando a música");
  }

  @Override
  public void playMusic() {
    System.out.println("A caixa de música está tocando música");
  }

  @Override
  public void stopMusic() {
    System.out.println("A caixa de música está parando a música");
  }
}
