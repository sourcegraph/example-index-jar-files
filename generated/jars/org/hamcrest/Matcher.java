public interface org.hamcrest.Matcher<T> extends org.hamcrest.SelfDescribing {
  public abstract boolean matches(java.lang.Object);
  public abstract void describeMismatch(java.lang.Object, org.hamcrest.Description);
  public abstract void _dont_implement_Matcher___instead_extend_BaseMatcher_();
}
