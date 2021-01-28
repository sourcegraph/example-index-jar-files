public abstract class org.hamcrest.DiagnosingMatcher<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.DiagnosingMatcher();
  public final boolean matches(java.lang.Object);
  public final void describeMismatch(java.lang.Object, org.hamcrest.Description);
  protected abstract boolean matches(java.lang.Object, org.hamcrest.Description);
}
