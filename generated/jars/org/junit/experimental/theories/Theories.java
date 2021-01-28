public class org.junit.experimental.theories.Theories extends org.junit.runners.BlockJUnit4ClassRunner {
  public org.junit.experimental.theories.Theories(java.lang.Class<?>) throws org.junit.runners.model.InitializationError;
  protected org.junit.experimental.theories.Theories(org.junit.runners.model.TestClass) throws org.junit.runners.model.InitializationError;
  protected void collectInitializationErrors(java.util.List<java.lang.Throwable>);
  protected void validateConstructor(java.util.List<java.lang.Throwable>);
  protected void validateTestMethods(java.util.List<java.lang.Throwable>);
  protected java.util.List<org.junit.runners.model.FrameworkMethod> computeTestMethods();
  public org.junit.runners.model.Statement methodBlock(org.junit.runners.model.FrameworkMethod);
}
