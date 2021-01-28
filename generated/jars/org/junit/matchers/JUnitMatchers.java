public class org.junit.matchers.JUnitMatchers {
  public org.junit.matchers.JUnitMatchers();
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> hasItem(T);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> hasItem(org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<T>> hasItems(T...);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<T>> hasItems(org.hamcrest.Matcher<? super T>...);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<T>> everyItem(org.hamcrest.Matcher<T>);
  public static org.hamcrest.Matcher<java.lang.String> containsString(java.lang.String);
  public static <T> org.hamcrest.core.CombinableMatcher$CombinableBothMatcher<T> both(org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.core.CombinableMatcher$CombinableEitherMatcher<T> either(org.hamcrest.Matcher<? super T>);
  public static <T extends java.lang.Throwable> org.hamcrest.Matcher<T> isThrowable(org.hamcrest.Matcher<T>);
  public static <T extends java.lang.Exception> org.hamcrest.Matcher<T> isException(org.hamcrest.Matcher<T>);
}
