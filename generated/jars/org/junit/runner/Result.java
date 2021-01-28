public class org.junit.runner.Result implements java.io.Serializable {
  public org.junit.runner.Result();
  public int getRunCount();
  public int getFailureCount();
  public long getRunTime();
  public java.util.List<org.junit.runner.notification.Failure> getFailures();
  public int getIgnoreCount();
  public int getAssumptionFailureCount();
  public boolean wasSuccessful();
  public org.junit.runner.notification.RunListener createListener();
  static java.util.concurrent.atomic.AtomicLong access$600(org.junit.runner.Result);
  static java.util.concurrent.atomic.AtomicLong access$700(org.junit.runner.Result);
  static java.util.concurrent.atomic.AtomicInteger access$800(org.junit.runner.Result);
  static java.util.concurrent.CopyOnWriteArrayList access$900(org.junit.runner.Result);
  static java.util.concurrent.atomic.AtomicInteger access$1000(org.junit.runner.Result);
  static java.util.concurrent.atomic.AtomicInteger access$1100(org.junit.runner.Result);
  static {};
}
