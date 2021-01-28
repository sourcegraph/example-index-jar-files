public class org.junit.rules.ExpectedException implements org.junit.rules.TestRule {
  public static org.junit.rules.ExpectedException none();
  public org.junit.rules.ExpectedException handleAssertionErrors();
  public org.junit.rules.ExpectedException handleAssumptionViolatedExceptions();
  public org.junit.rules.ExpectedException reportMissingExceptionWithMessage(java.lang.String);
  public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement, org.junit.runner.Description);
  public void expect(org.hamcrest.Matcher<?>);
  public void expect(java.lang.Class<? extends java.lang.Throwable>);
  public void expectMessage(java.lang.String);
  public void expectMessage(org.hamcrest.Matcher<java.lang.String>);
  public void expectCause(org.hamcrest.Matcher<?>);
  public final boolean isAnyExceptionExpected();
  static void access$000(org.junit.rules.ExpectedException, java.lang.Throwable) throws java.lang.Throwable;
  static void access$100(org.junit.rules.ExpectedException) throws java.lang.AssertionError;
}
