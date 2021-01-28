abstract class org.junit.internal.Throwables$State extends java.lang.Enum<org.junit.internal.Throwables$State> {
  public static final org.junit.internal.Throwables$State PROCESSING_OTHER_CODE;
  public static final org.junit.internal.Throwables$State PROCESSING_TEST_FRAMEWORK_CODE;
  public static final org.junit.internal.Throwables$State PROCESSING_REFLECTION_CODE;
  public static final org.junit.internal.Throwables$State DONE;
  public static org.junit.internal.Throwables$State[] values();
  public static org.junit.internal.Throwables$State valueOf(java.lang.String);
  protected abstract org.junit.internal.Throwables$State processLine(java.lang.String);
  public final org.junit.internal.Throwables$State processStackTraceElement(java.lang.StackTraceElement);
  org.junit.internal.Throwables$State(java.lang.String, int, org.junit.internal.Throwables$1);
  static {};
}
