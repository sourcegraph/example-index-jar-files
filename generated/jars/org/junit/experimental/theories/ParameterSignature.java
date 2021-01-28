public class org.junit.experimental.theories.ParameterSignature {
  public static java.util.ArrayList<org.junit.experimental.theories.ParameterSignature> signatures(java.lang.reflect.Method);
  public static java.util.List<org.junit.experimental.theories.ParameterSignature> signatures(java.lang.reflect.Constructor<?>);
  public boolean canAcceptValue(java.lang.Object);
  public boolean canAcceptType(java.lang.Class<?>);
  public boolean canPotentiallyAcceptType(java.lang.Class<?>);
  public java.lang.Class<?> getType();
  public java.util.List<java.lang.annotation.Annotation> getAnnotations();
  public boolean hasAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation>);
  public <T extends java.lang.annotation.Annotation> T findDeepAnnotation(java.lang.Class<T>);
  public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T>);
  static {};
}
