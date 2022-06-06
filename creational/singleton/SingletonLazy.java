/**
 * Singleton "pregui�oso".
 * the builder is private,
 * this ensures it cannot be instantiated,
 *  and can only be instantiated by the function getInstance().
 *
 * @author falvojr
 */
public class SingletonLazy {
  private static SingletonLazy instance;

  private SingletonLazy() {
    super();
  }

  public static SingletonLazy getInstance() {
    if (instance == null) {
      instance = new SingletonLazy();
    }
    return instance;
  }
}
