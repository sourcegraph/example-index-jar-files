public class junit.extensions.ActiveTestSuite extends junit.framework.TestSuite {
  public junit.extensions.ActiveTestSuite();
  public junit.extensions.ActiveTestSuite(java.lang.Class<? extends junit.framework.TestCase>);
  public junit.extensions.ActiveTestSuite(java.lang.String);
  public junit.extensions.ActiveTestSuite(java.lang.Class<? extends junit.framework.TestCase>, java.lang.String);
  public void run(junit.framework.TestResult);
  public void runTest(junit.framework.Test, junit.framework.TestResult);
  synchronized void waitUntilFinished();
  public synchronized void runFinished();
}
