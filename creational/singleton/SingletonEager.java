/**
 * Singleton "apressado".
 * automatically creates the instance when the class is called
 *
 * @author falvojr
 */
public class SingletonEager {
  private static SingletonEager instance = new SingletonEager();

  private SingletonEager() {
    super();
  }

  public static SingletonEager getInstance() {
    return instance;
  }
}
