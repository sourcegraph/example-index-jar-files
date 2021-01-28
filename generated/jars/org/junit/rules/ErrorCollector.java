public class org.junit.rules.ErrorCollector extends org.junit.rules.Verifier {
  public org.junit.rules.ErrorCollector();
  protected void verify() throws java.lang.Throwable;
  public void addError(java.lang.Throwable);
  public <T> void checkThat(T, org.hamcrest.Matcher<T>);
  public <T> void checkThat(java.lang.String, T, org.hamcrest.Matcher<T>);
  public <T> T checkSucceeds(java.util.concurrent.Callable<T>);
  public void checkThrows(java.lang.Class<? extends java.lang.Throwable>, org.junit.function.ThrowingRunnable);
}
