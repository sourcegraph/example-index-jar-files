public interface junit.runner.TestRunListener {
  public static final int STATUS_ERROR;
  public static final int STATUS_FAILURE;
  public abstract void testRunStarted(java.lang.String, int);
  public abstract void testRunEnded(long);
  public abstract void testRunStopped(long);
  public abstract void testStarted(java.lang.String);
  public abstract void testEnded(java.lang.String);
  public abstract void testFailed(int, java.lang.String, java.lang.String);
}
