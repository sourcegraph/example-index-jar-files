public class org.junit.internal.matchers.ThrowableCauseMatcher<T extends java.lang.Throwable> extends org.hamcrest.TypeSafeMatcher<T> {
  public org.junit.internal.matchers.ThrowableCauseMatcher(org.hamcrest.Matcher<?>);
  public void describeTo(org.hamcrest.Description);
  protected boolean matchesSafely(T);
  protected void describeMismatchSafely(T, org.hamcrest.Description);
  public static <T extends java.lang.Throwable> org.hamcrest.Matcher<T> hasCause(org.hamcrest.Matcher<?>);
  protected void describeMismatchSafely(java.lang.Object, org.hamcrest.Description);
  protected boolean matchesSafely(java.lang.Object);
}
