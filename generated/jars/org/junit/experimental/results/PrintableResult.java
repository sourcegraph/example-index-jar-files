public class org.junit.experimental.results.PrintableResult {
  public static org.junit.experimental.results.PrintableResult testResult(java.lang.Class<?>);
  public static org.junit.experimental.results.PrintableResult testResult(org.junit.runner.Request);
  public org.junit.experimental.results.PrintableResult(java.util.List<org.junit.runner.notification.Failure>);
  public int failureCount();
  public java.util.List<org.junit.runner.notification.Failure> failures();
  public java.lang.String toString();
}
