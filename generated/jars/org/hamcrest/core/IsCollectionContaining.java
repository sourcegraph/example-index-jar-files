public class org.hamcrest.core.IsCollectionContaining<T> extends org.hamcrest.TypeSafeDiagnosingMatcher<java.lang.Iterable<? super T>> {
  public org.hamcrest.core.IsCollectionContaining(org.hamcrest.Matcher<? super T>);
  protected boolean matchesSafely(java.lang.Iterable<? super T>, org.hamcrest.Description);
  public void describeTo(org.hamcrest.Description);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> hasItem(org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> hasItem(T);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<T>> hasItems(org.hamcrest.Matcher<? super T>...);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<T>> hasItems(T...);
  protected boolean matchesSafely(java.lang.Object, org.hamcrest.Description);
}
