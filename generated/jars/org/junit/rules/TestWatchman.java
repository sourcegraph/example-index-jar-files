public class org.junit.rules.TestWatchman implements org.junit.rules.MethodRule {
  public org.junit.rules.TestWatchman();
  public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement, org.junit.runners.model.FrameworkMethod, java.lang.Object);
  public void succeeded(org.junit.runners.model.FrameworkMethod);
  public void failed(java.lang.Throwable, org.junit.runners.model.FrameworkMethod);
  public void starting(org.junit.runners.model.FrameworkMethod);
  public void finished(org.junit.runners.model.FrameworkMethod);
}
