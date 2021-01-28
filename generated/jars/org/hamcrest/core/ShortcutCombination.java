abstract class org.hamcrest.core.ShortcutCombination<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.core.ShortcutCombination(java.lang.Iterable<org.hamcrest.Matcher<? super T>>);
  public abstract boolean matches(java.lang.Object);
  public abstract void describeTo(org.hamcrest.Description);
  protected boolean matches(java.lang.Object, boolean);
  public void describeTo(org.hamcrest.Description, java.lang.String);
}
