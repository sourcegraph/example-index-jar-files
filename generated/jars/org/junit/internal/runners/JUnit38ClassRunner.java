public class org.junit.internal.runners.JUnit38ClassRunner extends org.junit.runner.Runner implements org.junit.runner.manipulation.Filterable,org.junit.runner.manipulation.Orderable {
  public org.junit.internal.runners.JUnit38ClassRunner(java.lang.Class<?>);
  public org.junit.internal.runners.JUnit38ClassRunner(junit.framework.Test);
  public void run(org.junit.runner.notification.RunNotifier);
  public junit.framework.TestListener createAdaptingListener(org.junit.runner.notification.RunNotifier);
  public org.junit.runner.Description getDescription();
  public void filter(org.junit.runner.manipulation.Filter) throws org.junit.runner.manipulation.NoTestsRemainException;
  public void sort(org.junit.runner.manipulation.Sorter);
  public void order(org.junit.runner.manipulation.Orderer) throws org.junit.runner.manipulation.InvalidOrderingException;
}
