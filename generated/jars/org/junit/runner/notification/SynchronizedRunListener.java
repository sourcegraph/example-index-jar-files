final class org.junit.runner.notification.SynchronizedRunListener extends org.junit.runner.notification.RunListener {
  org.junit.runner.notification.SynchronizedRunListener(org.junit.runner.notification.RunListener, java.lang.Object);
  public void testRunStarted(org.junit.runner.Description) throws java.lang.Exception;
  public void testRunFinished(org.junit.runner.Result) throws java.lang.Exception;
  public void testSuiteStarted(org.junit.runner.Description) throws java.lang.Exception;
  public void testSuiteFinished(org.junit.runner.Description) throws java.lang.Exception;
  public void testStarted(org.junit.runner.Description) throws java.lang.Exception;
  public void testFinished(org.junit.runner.Description) throws java.lang.Exception;
  public void testFailure(org.junit.runner.notification.Failure) throws java.lang.Exception;
  public void testAssumptionFailure(org.junit.runner.notification.Failure);
  public void testIgnored(org.junit.runner.Description) throws java.lang.Exception;
  public int hashCode();
  public boolean equals(java.lang.Object);
  public java.lang.String toString();
}
