public class org.junit.experimental.max.MaxCore {
  public static org.junit.experimental.max.MaxCore forFolder(java.lang.String);
  public static org.junit.experimental.max.MaxCore storedLocally(java.io.File);
  public org.junit.runner.Result run(java.lang.Class<?>);
  public org.junit.runner.Result run(org.junit.runner.Request);
  public org.junit.runner.Result run(org.junit.runner.Request, org.junit.runner.JUnitCore);
  public org.junit.runner.Request sortRequest(org.junit.runner.Request);
  public java.util.List<org.junit.runner.Description> sortedLeavesForTest(org.junit.runner.Request);
}
