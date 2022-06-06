public class Robo {
  private Comportament comportament;

  public void setComportament(Comportament comportament) {
    this.comportament = comportament;
  }

  public void move() {
    comportament.move();
  }
}
