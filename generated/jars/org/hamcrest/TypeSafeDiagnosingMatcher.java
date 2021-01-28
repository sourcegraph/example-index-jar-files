public abstract class org.hamcrest.TypeSafeDiagnosingMatcher<T> extends org.hamcrest.BaseMatcher<T> {
  protected abstract boolean matchesSafely(T, org.hamcrest.Description);
  protected org.hamcrest.TypeSafeDiagnosingMatcher(java.lang.Class<?>);
  protected org.hamcrest.TypeSafeDiagnosingMatcher(org.hamcrest.internal.ReflectiveTypeFinder);
  protected org.hamcrest.TypeSafeDiagnosingMatcher();
  public final boolean matches(java.lang.Object);
  public final void describeMismatch(java.lang.Object, org.hamcrest.Description);
  static {};
}
