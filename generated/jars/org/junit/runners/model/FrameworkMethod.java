public class org.junit.runners.model.FrameworkMethod extends org.junit.runners.model.FrameworkMember<org.junit.runners.model.FrameworkMethod> {
  public org.junit.runners.model.FrameworkMethod(java.lang.reflect.Method);
  public java.lang.reflect.Method getMethod();
  public java.lang.Object invokeExplosively(java.lang.Object, java.lang.Object...) throws java.lang.Throwable;
  public java.lang.String getName();
  public void validatePublicVoidNoArg(boolean, java.util.List<java.lang.Throwable>);
  public void validatePublicVoid(boolean, java.util.List<java.lang.Throwable>);
  protected int getModifiers();
  public java.lang.Class<?> getReturnType();
  public java.lang.Class<?> getType();
  public java.lang.Class<?> getDeclaringClass();
  public void validateNoTypeParametersOnArgs(java.util.List<java.lang.Throwable>);
  public boolean isShadowedBy(org.junit.runners.model.FrameworkMethod);
  boolean isBridgeMethod();
  public boolean equals(java.lang.Object);
  public int hashCode();
  public boolean producesType(java.lang.reflect.Type);
  public java.lang.annotation.Annotation[] getAnnotations();
  public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T>);
  public java.lang.String toString();
  public boolean isShadowedBy(org.junit.runners.model.FrameworkMember);
  static java.lang.reflect.Method access$000(org.junit.runners.model.FrameworkMethod);
}
