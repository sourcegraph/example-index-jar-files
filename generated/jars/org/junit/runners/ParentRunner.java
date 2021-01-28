public abstract class org.junit.runners.ParentRunner<T> extends org.junit.runner.Runner implements org.junit.runner.manipulation.Filterable, org.junit.runner.manipulation.Orderable {
  protected org.junit.runners.ParentRunner(java.lang.Class<?>) throws org.junit.runners.model.InitializationError;
  protected org.junit.runners.ParentRunner(org.junit.runners.model.TestClass) throws org.junit.runners.model.InitializationError;
  protected org.junit.runners.model.TestClass createTestClass(java.lang.Class<?>);
  protected abstract java.util.List<T> getChildren();
  protected abstract org.junit.runner.Description describeChild(T);
  protected abstract void runChild(T, org.junit.runner.notification.RunNotifier);
  protected void collectInitializationErrors(java.util.List<java.lang.Throwable>);
  protected void validatePublicVoidNoArgMethods(java.lang.Class<? extends java.lang.annotation.Annotation>, boolean, java.util.List<java.lang.Throwable>);
  protected org.junit.runners.model.Statement classBlock(org.junit.runner.notification.RunNotifier);
  protected org.junit.runners.model.Statement withBeforeClasses(org.junit.runners.model.Statement);
  protected org.junit.runners.model.Statement withAfterClasses(org.junit.runners.model.Statement);
  protected java.util.List<org.junit.rules.TestRule> classRules();
  protected org.junit.runners.model.Statement childrenInvoker(org.junit.runner.notification.RunNotifier);
  protected final org.junit.runners.model.Statement withInterruptIsolation(org.junit.runners.model.Statement);
  protected boolean isIgnored(T);
  protected java.lang.String getName();
  public final org.junit.runners.model.TestClass getTestClass();
  protected final void runLeaf(org.junit.runners.model.Statement, org.junit.runner.Description, org.junit.runner.notification.RunNotifier);
  protected java.lang.annotation.Annotation[] getRunnerAnnotations();
  public org.junit.runner.Description getDescription();
  public void run(org.junit.runner.notification.RunNotifier);
  public void filter(org.junit.runner.manipulation.Filter) throws org.junit.runner.manipulation.NoTestsRemainException;
  public void sort(org.junit.runner.manipulation.Sorter);
  public void order(org.junit.runner.manipulation.Orderer) throws org.junit.runner.manipulation.InvalidOrderingException;
  public void setScheduler(org.junit.runners.model.RunnerScheduler);
  static void access$100(org.junit.runners.ParentRunner, org.junit.runner.notification.RunNotifier);
  static {};
}
