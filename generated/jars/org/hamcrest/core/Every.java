public class org.hamcrest.core.Every<T> extends org.hamcrest.TypeSafeDiagnosingMatcher<java.lang.Iterable<T>> {
  public org.hamcrest.core.Every(org.hamcrest.Matcher<? super T>);
  public boolean matchesSafely(java.lang.Iterable<T>, org.hamcrest.Description);
  public void describeTo(org.hamcrest.Description);
  public static <U> org.hamcrest.Matcher<java.lang.Iterable<U>> everyItem(org.hamcrest.Matcher<U>);
  public boolean matchesSafely(java.lang.Object, org.hamcrest.Description);
}
