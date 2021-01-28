public abstract class org.hamcrest.TypeSafeMatcher<T> extends org.hamcrest.BaseMatcher<T> {
  protected org.hamcrest.TypeSafeMatcher();
  protected org.hamcrest.TypeSafeMatcher(java.lang.Class<?>);
  protected org.hamcrest.TypeSafeMatcher(org.hamcrest.internal.ReflectiveTypeFinder);
  protected abstract boolean matchesSafely(T);
  protected void describeMismatchSafely(T, org.hamcrest.Description);
  public final boolean matches(java.lang.Object);
  public final void describeMismatch(java.lang.Object, org.hamcrest.Description);
  static {};
}
