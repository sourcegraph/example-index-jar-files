public class org.junit.runner.notification.RunNotifier {
  public org.junit.runner.notification.RunNotifier();
  public void addListener(org.junit.runner.notification.RunListener);
  public void removeListener(org.junit.runner.notification.RunListener);
  org.junit.runner.notification.RunListener wrapIfNotThreadSafe(org.junit.runner.notification.RunListener);
  public void fireTestRunStarted(org.junit.runner.Description);
  public void fireTestRunFinished(org.junit.runner.Result);
  public void fireTestSuiteStarted(org.junit.runner.Description);
  public void fireTestSuiteFinished(org.junit.runner.Description);
  public void fireTestStarted(org.junit.runner.Description) throws org.junit.runner.notification.StoppedByUserException;
  public void fireTestFailure(org.junit.runner.notification.Failure);
  public void fireTestAssumptionFailed(org.junit.runner.notification.Failure);
  public void fireTestIgnored(org.junit.runner.Description);
  public void fireTestFinished(org.junit.runner.Description);
  public void pleaseStop();
  public void addFirstListener(org.junit.runner.notification.RunListener);
  static java.util.List access$000(org.junit.runner.notification.RunNotifier);
  static void access$100(org.junit.runner.notification.RunNotifier, java.util.List, java.util.List);
}
