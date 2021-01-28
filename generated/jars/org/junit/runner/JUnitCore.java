public class org.junit.runner.JUnitCore {
  public org.junit.runner.JUnitCore();
  public static void main(java.lang.String...);
  public static org.junit.runner.Result runClasses(java.lang.Class<?>...);
  public static org.junit.runner.Result runClasses(org.junit.runner.Computer, java.lang.Class<?>...);
  org.junit.runner.Result runMain(org.junit.internal.JUnitSystem, java.lang.String...);
  public java.lang.String getVersion();
  public org.junit.runner.Result run(java.lang.Class<?>...);
  public org.junit.runner.Result run(org.junit.runner.Computer, java.lang.Class<?>...);
  public org.junit.runner.Result run(org.junit.runner.Request);
  public org.junit.runner.Result run(junit.framework.Test);
  public org.junit.runner.Result run(org.junit.runner.Runner);
  public void addListener(org.junit.runner.notification.RunListener);
  public void removeListener(org.junit.runner.notification.RunListener);
  static org.junit.runner.Computer defaultComputer();
}
