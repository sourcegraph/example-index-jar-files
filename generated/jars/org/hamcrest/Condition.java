public abstract class org.hamcrest.Condition<T> {
  public static final org.hamcrest.Condition$NotMatched<java.lang.Object> NOT_MATCHED;
  public abstract boolean matching(org.hamcrest.Matcher<T>, java.lang.String);
  public abstract <U> org.hamcrest.Condition<U> and(org.hamcrest.Condition$Step<? super T, U>);
  public final boolean matching(org.hamcrest.Matcher<T>);
  public final <U> org.hamcrest.Condition<U> then(org.hamcrest.Condition$Step<? super T, U>);
  public static <T> org.hamcrest.Condition<T> notMatched();
  public static <T> org.hamcrest.Condition<T> matched(T, org.hamcrest.Description);
  org.hamcrest.Condition(org.hamcrest.Condition$1);
  static {};
}
