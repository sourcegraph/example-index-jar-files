public class org.junit.Assume {
  public org.junit.Assume();
  public static void assumeTrue(boolean);
  public static void assumeFalse(boolean);
  public static void assumeTrue(java.lang.String, boolean);
  public static void assumeFalse(java.lang.String, boolean);
  public static void assumeNotNull(java.lang.Object...);
  public static <T> void assumeThat(T, org.hamcrest.Matcher<T>);
  public static <T> void assumeThat(java.lang.String, T, org.hamcrest.Matcher<T>);
  public static void assumeNoException(java.lang.Throwable);
  public static void assumeNoException(java.lang.String, java.lang.Throwable);
}
