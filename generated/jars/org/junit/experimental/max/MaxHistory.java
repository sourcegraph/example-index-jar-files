public class org.junit.experimental.max.MaxHistory implements java.io.Serializable {
  public static org.junit.experimental.max.MaxHistory forFolder(java.io.File);
  java.lang.Long getFailureTimestamp(org.junit.runner.Description);
  void putTestFailureTimestamp(org.junit.runner.Description, long);
  boolean isNewTest(org.junit.runner.Description);
  java.lang.Long getTestDuration(org.junit.runner.Description);
  void putTestDuration(org.junit.runner.Description, long);
  public org.junit.runner.notification.RunListener listener();
  public java.util.Comparator<org.junit.runner.Description> testComparator();
  static void access$000(org.junit.experimental.max.MaxHistory) throws java.io.IOException;
}
