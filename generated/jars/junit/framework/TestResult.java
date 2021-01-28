public class junit.framework.TestResult {
  protected java.util.List<junit.framework.TestFailure> fFailures;
  protected java.util.List<junit.framework.TestFailure> fErrors;
  protected java.util.List<junit.framework.TestListener> fListeners;
  protected int fRunTests;
  public junit.framework.TestResult();
  public synchronized void addError(junit.framework.Test, java.lang.Throwable);
  public synchronized void addFailure(junit.framework.Test, junit.framework.AssertionFailedError);
  public synchronized void addListener(junit.framework.TestListener);
  public synchronized void removeListener(junit.framework.TestListener);
  public void endTest(junit.framework.Test);
  public synchronized int errorCount();
  public synchronized java.util.Enumeration<junit.framework.TestFailure> errors();
  public synchronized int failureCount();
  public synchronized java.util.Enumeration<junit.framework.TestFailure> failures();
  protected void run(junit.framework.TestCase);
  public synchronized int runCount();
  public void runProtected(junit.framework.Test, junit.framework.Protectable);
  public synchronized boolean shouldStop();
  public void startTest(junit.framework.Test);
  public synchronized void stop();
  public synchronized boolean wasSuccessful();
}
