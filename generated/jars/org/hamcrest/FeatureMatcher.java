public abstract class org.hamcrest.FeatureMatcher<T, U> extends org.hamcrest.TypeSafeDiagnosingMatcher<T> {
  public org.hamcrest.FeatureMatcher(org.hamcrest.Matcher<? super U>, java.lang.String, java.lang.String);
  protected abstract U featureValueOf(T);
  protected boolean matchesSafely(T, org.hamcrest.Description);
  public final void describeTo(org.hamcrest.Description);
  static {};
}
