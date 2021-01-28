public abstract class org.junit.runners.model.FrameworkMember<T extends org.junit.runners.model.FrameworkMember<T>> implements org.junit.runners.model.Annotatable {
  public org.junit.runners.model.FrameworkMember();
  abstract boolean isShadowedBy(T);
  T handlePossibleBridgeMethod(java.util.List<T>);
  abstract boolean isBridgeMethod();
  protected abstract int getModifiers();
  public boolean isStatic();
  public boolean isPublic();
  public abstract java.lang.String getName();
  public abstract java.lang.Class<?> getType();
  public abstract java.lang.Class<?> getDeclaringClass();
}
