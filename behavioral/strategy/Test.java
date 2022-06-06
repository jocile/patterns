public class Test {

  public static void main(String[] args) {
    // Strategy

    Comportament defensive = new ComportamentDefensive();
    Comportament normal = new ComportamentNormal();
    Comportament aggressive = new ComportamentAggressive();

    Robo robo = new Robo();
    robo.setComportament(normal);
    robo.move();
    robo.move();
    robo.setComportament(defensive);
    robo.move();
    robo.setComportament(aggressive);
    robo.move();
    robo.move();
    robo.move();
  }
}
