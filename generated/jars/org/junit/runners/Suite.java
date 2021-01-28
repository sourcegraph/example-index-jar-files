public class org.junit.runners.Suite extends org.junit.runners.ParentRunner<org.junit.runner.Runner> {
  public static org.junit.runner.Runner emptySuite();
  public org.junit.runners.Suite(java.lang.Class<?>, org.junit.runners.model.RunnerBuilder) throws org.junit.runners.model.InitializationError;
  public org.junit.runners.Suite(org.junit.runners.model.RunnerBuilder, java.lang.Class<?>[]) throws org.junit.runners.model.InitializationError;
  protected org.junit.runners.Suite(java.lang.Class<?>, java.lang.Class<?>[]) throws org.junit.runners.model.InitializationError;
  protected org.junit.runners.Suite(org.junit.runners.model.RunnerBuilder, java.lang.Class<?>, java.lang.Class<?>[]) throws org.junit.runners.model.InitializationError;
  protected org.junit.runners.Suite(java.lang.Class<?>, java.util.List<org.junit.runner.Runner>) throws org.junit.runners.model.InitializationError;
  protected java.util.List<org.junit.runner.Runner> getChildren();
  protected org.junit.runner.Description describeChild(org.junit.runner.Runner);
  protected void runChild(org.junit.runner.Runner, org.junit.runner.notification.RunNotifier);
  protected void runChild(java.lang.Object, org.junit.runner.notification.RunNotifier);
  protected org.junit.runner.Description describeChild(java.lang.Object);
}
