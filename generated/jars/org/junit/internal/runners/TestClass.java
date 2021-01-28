public class org.junit.internal.runners.TestClass {
  public org.junit.internal.runners.TestClass(java.lang.Class<?>);
  public java.util.List<java.lang.reflect.Method> getTestMethods();
  java.util.List<java.lang.reflect.Method> getBefores();
  java.util.List<java.lang.reflect.Method> getAfters();
  public java.util.List<java.lang.reflect.Method> getAnnotatedMethods(java.lang.Class<? extends java.lang.annotation.Annotation>);
  public java.lang.reflect.Constructor<?> getConstructor() throws java.lang.SecurityException, java.lang.NoSuchMethodException;
  public java.lang.Class<?> getJavaClass();
  public java.lang.String getName();
}
