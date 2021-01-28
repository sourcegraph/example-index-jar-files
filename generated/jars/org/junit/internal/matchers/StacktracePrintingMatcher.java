public class org.junit.internal.matchers.StacktracePrintingMatcher<T extends java.lang.Throwable> extends org.hamcrest.TypeSafeMatcher<T> {
  public org.junit.internal.matchers.StacktracePrintingMatcher(org.hamcrest.Matcher<T>);
  public void describeTo(org.hamcrest.Description);
  protected boolean matchesSafely(T);
  protected void describeMismatchSafely(T, org.hamcrest.Description);
  public static <T extends java.lang.Throwable> org.hamcrest.Matcher<T> isThrowable(org.hamcrest.Matcher<T>);
  public static <T extends java.lang.Exception> org.hamcrest.Matcher<T> isException(org.hamcrest.Matcher<T>);
  protected void describeMismatchSafely(java.lang.Object, org.hamcrest.Description);
  protected boolean matchesSafely(java.lang.Object);
}
