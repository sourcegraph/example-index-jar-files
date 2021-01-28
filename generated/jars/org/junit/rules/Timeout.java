public class org.junit.rules.Timeout implements org.junit.rules.TestRule {
  public static org.junit.rules.Timeout$Builder builder();
  public org.junit.rules.Timeout(int);
  public org.junit.rules.Timeout(long, java.util.concurrent.TimeUnit);
  protected org.junit.rules.Timeout(org.junit.rules.Timeout$Builder);
  public static org.junit.rules.Timeout millis(long);
  public static org.junit.rules.Timeout seconds(long);
  protected final long getTimeout(java.util.concurrent.TimeUnit);
  protected final boolean getLookingForStuckThread();
  protected org.junit.runners.model.Statement createFailOnTimeoutStatement(org.junit.runners.model.Statement) throws java.lang.Exception;
  public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement, org.junit.runner.Description);
}
