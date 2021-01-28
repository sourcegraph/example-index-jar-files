public class org.hamcrest.core.Is<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.core.Is(org.hamcrest.Matcher<T>);
  public boolean matches(java.lang.Object);
  public void describeTo(org.hamcrest.Description);
  public void describeMismatch(java.lang.Object, org.hamcrest.Description);
  public static <T> org.hamcrest.Matcher<T> is(org.hamcrest.Matcher<T>);
  public static <T> org.hamcrest.Matcher<T> is(T);
  public static <T> org.hamcrest.Matcher<T> is(java.lang.Class<T>);
  public static <T> org.hamcrest.Matcher<T> isA(java.lang.Class<T>);
}
