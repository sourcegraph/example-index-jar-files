public abstract class org.junit.runner.Request {
  public org.junit.runner.Request();
  public static org.junit.runner.Request method(java.lang.Class<?>, java.lang.String);
  public static org.junit.runner.Request aClass(java.lang.Class<?>);
  public static org.junit.runner.Request classWithoutSuiteMethod(java.lang.Class<?>);
  public static org.junit.runner.Request classes(org.junit.runner.Computer, java.lang.Class<?>...);
  public static org.junit.runner.Request classes(java.lang.Class<?>...);
  public static org.junit.runner.Request errorReport(java.lang.Class<?>, java.lang.Throwable);
  public static org.junit.runner.Request runner(org.junit.runner.Runner);
  public abstract org.junit.runner.Runner getRunner();
  public org.junit.runner.Request filterWith(org.junit.runner.manipulation.Filter);
  public org.junit.runner.Request filterWith(org.junit.runner.Description);
  public org.junit.runner.Request sortWith(java.util.Comparator<org.junit.runner.Description>);
  public org.junit.runner.Request orderWith(org.junit.runner.manipulation.Ordering);
}
