public abstract class org.junit.rules.TestWatcher implements org.junit.rules.TestRule {
  public org.junit.rules.TestWatcher();
  public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement, org.junit.runner.Description);
  protected void succeeded(org.junit.runner.Description);
  protected void failed(java.lang.Throwable, org.junit.runner.Description);
  protected void skipped(org.junit.AssumptionViolatedException, org.junit.runner.Description);
  protected void skipped(org.junit.internal.AssumptionViolatedException, org.junit.runner.Description);
  protected void starting(org.junit.runner.Description);
  protected void finished(org.junit.runner.Description);
  static void access$000(org.junit.rules.TestWatcher, org.junit.runner.Description, java.util.List);
  static void access$100(org.junit.rules.TestWatcher, org.junit.runner.Description, java.util.List);
  static void access$200(org.junit.rules.TestWatcher, org.junit.internal.AssumptionViolatedException, org.junit.runner.Description, java.util.List);
  static void access$300(org.junit.rules.TestWatcher, java.lang.Throwable, org.junit.runner.Description, java.util.List);
  static void access$400(org.junit.rules.TestWatcher, org.junit.runner.Description, java.util.List);
}
