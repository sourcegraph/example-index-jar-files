public abstract class org.hamcrest.core.SubstringMatcher extends org.hamcrest.TypeSafeMatcher<java.lang.String> {
  protected final java.lang.String substring;
  protected org.hamcrest.core.SubstringMatcher(java.lang.String);
  public boolean matchesSafely(java.lang.String);
  public void describeMismatchSafely(java.lang.String, org.hamcrest.Description);
  public void describeTo(org.hamcrest.Description);
  protected abstract boolean evalSubstringOf(java.lang.String);
  protected abstract java.lang.String relationship();
  public void describeMismatchSafely(java.lang.Object, org.hamcrest.Description);
  public boolean matchesSafely(java.lang.Object);
}
