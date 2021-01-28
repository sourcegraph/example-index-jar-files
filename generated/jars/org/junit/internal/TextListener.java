public class org.junit.internal.TextListener extends org.junit.runner.notification.RunListener {
  public org.junit.internal.TextListener(org.junit.internal.JUnitSystem);
  public org.junit.internal.TextListener(java.io.PrintStream);
  public void testRunFinished(org.junit.runner.Result);
  public void testStarted(org.junit.runner.Description);
  public void testFailure(org.junit.runner.notification.Failure);
  public void testIgnored(org.junit.runner.Description);
  protected void printHeader(long);
  protected void printFailures(org.junit.runner.Result);
  protected void printFailure(org.junit.runner.notification.Failure, java.lang.String);
  protected void printFooter(org.junit.runner.Result);
  protected java.lang.String elapsedTimeAsString(long);
}
