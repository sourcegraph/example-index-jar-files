public class org.hamcrest.core.CombinableMatcher<T> extends org.hamcrest.TypeSafeDiagnosingMatcher<T> {
  public org.hamcrest.core.CombinableMatcher(org.hamcrest.Matcher<? super T>);
  protected boolean matchesSafely(T, org.hamcrest.Description);
  public void describeTo(org.hamcrest.Description);
  public org.hamcrest.core.CombinableMatcher<T> and(org.hamcrest.Matcher<? super T>);
  public org.hamcrest.core.CombinableMatcher<T> or(org.hamcrest.Matcher<? super T>);
  public static <LHS> org.hamcrest.core.CombinableMatcher$CombinableBothMatcher<LHS> both(org.hamcrest.Matcher<? super LHS>);
  public static <LHS> org.hamcrest.core.CombinableMatcher$CombinableEitherMatcher<LHS> either(org.hamcrest.Matcher<? super LHS>);
}
