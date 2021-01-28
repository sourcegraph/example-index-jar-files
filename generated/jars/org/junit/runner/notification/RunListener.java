public class org.junit.runner.notification.RunListener {
  public org.junit.runner.notification.RunListener();
  public void testRunStarted(org.junit.runner.Description) throws java.lang.Exception;
  public void testRunFinished(org.junit.runner.Result) throws java.lang.Exception;
  public void testSuiteStarted(org.junit.runner.Description) throws java.lang.Exception;
  public void testSuiteFinished(org.junit.runner.Description) throws java.lang.Exception;
  public void testStarted(org.junit.runner.Description) throws java.lang.Exception;
  public void testFinished(org.junit.runner.Description) throws java.lang.Exception;
  public void testFailure(org.junit.runner.notification.Failure) throws java.lang.Exception;
  public void testAssumptionFailure(org.junit.runner.notification.Failure);
  public void testIgnored(org.junit.runner.Description) throws java.lang.Exception;
}
