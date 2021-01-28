public class org.junit.internal.runners.TestMethod {
  public org.junit.internal.runners.TestMethod(java.lang.reflect.Method, org.junit.internal.runners.TestClass);
  public boolean isIgnored();
  public long getTimeout();
  protected java.lang.Class<? extends java.lang.Throwable> getExpectedException();
  boolean isUnexpected(java.lang.Throwable);
  boolean expectsException();
  java.util.List<java.lang.reflect.Method> getBefores();
  java.util.List<java.lang.reflect.Method> getAfters();
  public void invoke(java.lang.Object) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException;
}
