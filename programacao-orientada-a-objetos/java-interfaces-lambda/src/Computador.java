public class Computador implements VideoPlayer, MusicPlayer {

  @Override
  public void pauseMusic() {
    System.out.println("O Computer está pausando a música");
  }

  @Override
  public void playMusic() {
    System.out.println("O Computer está tocando a música");
  }

  @Override
  public void stopMusic() {
    System.out.println("O Computer está parando a música");
  }

  @Override
  public void pauseVideo() {
    System.out.println("O Computer está pausando o video");
  }

  @Override
  public void playVideo() {
    System.out.println("O Computer está reproduzindo o video");
  }

  @Override
  public void stopVideo() {
    System.out.println("O Computer está parando a video");
  }
}
