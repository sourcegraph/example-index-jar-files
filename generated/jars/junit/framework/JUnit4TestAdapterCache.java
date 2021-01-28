public class junit.framework.JUnit4TestAdapterCache extends java.util.HashMap<org.junit.runner.Description, junit.framework.Test> {
  public junit.framework.JUnit4TestAdapterCache();
  public static junit.framework.JUnit4TestAdapterCache getDefault();
  public junit.framework.Test asTest(org.junit.runner.Description);
  junit.framework.Test createTest(org.junit.runner.Description);
  public org.junit.runner.notification.RunNotifier getNotifier(junit.framework.TestResult, junit.framework.JUnit4TestAdapter);
  public java.util.List<junit.framework.Test> asTestList(org.junit.runner.Description);
  static {};
}
