public class junit.framework.TestSuite implements junit.framework.Test {
  public static junit.framework.Test createTest(java.lang.Class<?>, java.lang.String);
  public static java.lang.reflect.Constructor<?> getTestConstructor(java.lang.Class<?>) throws java.lang.NoSuchMethodException;
  public static junit.framework.Test warning(java.lang.String);
  public junit.framework.TestSuite();
  public junit.framework.TestSuite(java.lang.Class<?>);
  public junit.framework.TestSuite(java.lang.Class<? extends junit.framework.TestCase>, java.lang.String);
  public junit.framework.TestSuite(java.lang.String);
  public junit.framework.TestSuite(java.lang.Class<?>...);
  public junit.framework.TestSuite(java.lang.Class<? extends junit.framework.TestCase>[], java.lang.String);
  public void addTest(junit.framework.Test);
  public void addTestSuite(java.lang.Class<? extends junit.framework.TestCase>);
  public int countTestCases();
  public java.lang.String getName();
  public void run(junit.framework.TestResult);
  public void runTest(junit.framework.Test, junit.framework.TestResult);
  public void setName(java.lang.String);
  public junit.framework.Test testAt(int);
  public int testCount();
  public java.util.Enumeration<junit.framework.Test> tests();
  public java.lang.String toString();
}
