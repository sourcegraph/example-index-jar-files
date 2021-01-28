public class org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters extends org.junit.runners.BlockJUnit4ClassRunner {
  public org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters(org.junit.runners.parameterized.TestWithParameters) throws org.junit.runners.model.InitializationError;
  public java.lang.Object createTest() throws java.lang.Exception;
  protected java.lang.String getName();
  protected java.lang.String testName(org.junit.runners.model.FrameworkMethod);
  protected void validateConstructor(java.util.List<java.lang.Throwable>);
  protected void validateFields(java.util.List<java.lang.Throwable>);
  protected org.junit.runners.model.Statement classBlock(org.junit.runner.notification.RunNotifier);
  protected java.lang.annotation.Annotation[] getRunnerAnnotations();
  static java.lang.Object[] access$000(org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters);
}
