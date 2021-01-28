public class org.junit.runners.model.FrameworkField extends org.junit.runners.model.FrameworkMember<org.junit.runners.model.FrameworkField> {
  public org.junit.runners.model.FrameworkField(java.lang.reflect.Field);
  public java.lang.String getName();
  public java.lang.annotation.Annotation[] getAnnotations();
  public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T>);
  public boolean isShadowedBy(org.junit.runners.model.FrameworkField);
  boolean isBridgeMethod();
  protected int getModifiers();
  public java.lang.reflect.Field getField();
  public java.lang.Class<?> getType();
  public java.lang.Class<?> getDeclaringClass();
  public java.lang.Object get(java.lang.Object) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException;
  public java.lang.String toString();
  public boolean isShadowedBy(org.junit.runners.model.FrameworkMember);
}
