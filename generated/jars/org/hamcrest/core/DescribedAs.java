public class org.hamcrest.core.DescribedAs<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.core.DescribedAs(java.lang.String, org.hamcrest.Matcher<T>, java.lang.Object[]);
  public boolean matches(java.lang.Object);
  public void describeTo(org.hamcrest.Description);
  public void describeMismatch(java.lang.Object, org.hamcrest.Description);
  public static <T> org.hamcrest.Matcher<T> describedAs(java.lang.String, org.hamcrest.Matcher<T>, java.lang.Object...);
  static {};
}
