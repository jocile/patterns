/**
 * Singleton "Lazy Holder".
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Reference</a>
 * encapsulates the instance in an inner static class
 *
 * @author falvojr
 */
public class SingletonLazyHolder {

  private static class InstanceHolder {
    public static SingletonLazyHolder instance = new SingletonLazyHolder();
  }

  private SingletonLazyHolder() {
    super();
  }

  public static SingletonLazyHolder getInstance() {
    return InstanceHolder.instance;
  }
}
