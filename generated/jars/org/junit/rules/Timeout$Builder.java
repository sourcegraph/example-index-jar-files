public class org.junit.rules.Timeout$Builder {
  protected org.junit.rules.Timeout$Builder();
  public org.junit.rules.Timeout$Builder withTimeout(long, java.util.concurrent.TimeUnit);
  protected long getTimeout();
  protected java.util.concurrent.TimeUnit getTimeUnit();
  public org.junit.rules.Timeout$Builder withLookingForStuckThread(boolean);
  protected boolean getLookingForStuckThread();
  public org.junit.rules.Timeout build();
}
