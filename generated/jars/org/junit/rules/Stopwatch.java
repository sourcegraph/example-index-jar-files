public class org.junit.rules.Stopwatch implements org.junit.rules.TestRule {
  public org.junit.rules.Stopwatch();
  org.junit.rules.Stopwatch(org.junit.rules.Stopwatch$Clock);
  public long runtime(java.util.concurrent.TimeUnit);
  protected void succeeded(long, org.junit.runner.Description);
  protected void failed(long, java.lang.Throwable, org.junit.runner.Description);
  protected void skipped(long, org.junit.AssumptionViolatedException, org.junit.runner.Description);
  protected void finished(long, org.junit.runner.Description);
  public final org.junit.runners.model.Statement apply(org.junit.runners.model.Statement, org.junit.runner.Description);
  static void access$100(org.junit.rules.Stopwatch);
  static long access$200(org.junit.rules.Stopwatch);
  static void access$300(org.junit.rules.Stopwatch);
}
