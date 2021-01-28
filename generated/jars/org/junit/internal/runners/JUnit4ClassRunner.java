public class org.junit.internal.runners.JUnit4ClassRunner extends org.junit.runner.Runner implements org.junit.runner.manipulation.Filterable,org.junit.runner.manipulation.Sortable {
  public org.junit.internal.runners.JUnit4ClassRunner(java.lang.Class<?>) throws org.junit.internal.runners.InitializationError;
  protected java.util.List<java.lang.reflect.Method> getTestMethods();
  protected void validate() throws org.junit.internal.runners.InitializationError;
  public void run(org.junit.runner.notification.RunNotifier);
  protected void runMethods(org.junit.runner.notification.RunNotifier);
  public org.junit.runner.Description getDescription();
  protected java.lang.annotation.Annotation[] classAnnotations();
  protected java.lang.String getName();
  protected java.lang.Object createTest() throws java.lang.Exception;
  protected void invokeTestMethod(java.lang.reflect.Method, org.junit.runner.notification.RunNotifier);
  protected org.junit.internal.runners.TestMethod wrapMethod(java.lang.reflect.Method);
  protected java.lang.String testName(java.lang.reflect.Method);
  protected org.junit.runner.Description methodDescription(java.lang.reflect.Method);
  protected java.lang.annotation.Annotation[] testAnnotations(java.lang.reflect.Method);
  public void filter(org.junit.runner.manipulation.Filter) throws org.junit.runner.manipulation.NoTestsRemainException;
  public void sort(org.junit.runner.manipulation.Sorter);
  protected org.junit.internal.runners.TestClass getTestClass();
}
