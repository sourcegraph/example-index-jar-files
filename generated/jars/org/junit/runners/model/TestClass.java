public class org.junit.runners.model.TestClass implements org.junit.runners.model.Annotatable {
  public org.junit.runners.model.TestClass(java.lang.Class<?>);
  protected void scanAnnotatedMembers(java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<org.junit.runners.model.FrameworkMethod>>, java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<org.junit.runners.model.FrameworkField>>);
  protected static <T extends org.junit.runners.model.FrameworkMember<T>> void addToAnnotationLists(T, java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<T>>);
  public java.util.List<org.junit.runners.model.FrameworkMethod> getAnnotatedMethods();
  public java.util.List<org.junit.runners.model.FrameworkMethod> getAnnotatedMethods(java.lang.Class<? extends java.lang.annotation.Annotation>);
  public java.util.List<org.junit.runners.model.FrameworkField> getAnnotatedFields();
  public java.util.List<org.junit.runners.model.FrameworkField> getAnnotatedFields(java.lang.Class<? extends java.lang.annotation.Annotation>);
  public java.lang.Class<?> getJavaClass();
  public java.lang.String getName();
  public java.lang.reflect.Constructor<?> getOnlyConstructor();
  public java.lang.annotation.Annotation[] getAnnotations();
  public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T>);
  public <T> java.util.List<T> getAnnotatedFieldValues(java.lang.Object, java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.Class<T>);
  public <T> void collectAnnotatedFieldValues(java.lang.Object, java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.Class<T>, org.junit.runners.model.MemberValueConsumer<T>);
  public <T> java.util.List<T> getAnnotatedMethodValues(java.lang.Object, java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.Class<T>);
  public <T> void collectAnnotatedMethodValues(java.lang.Object, java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.Class<T>, org.junit.runners.model.MemberValueConsumer<T>);
  public boolean isPublic();
  public boolean isANonStaticInnerClass();
  public int hashCode();
  public boolean equals(java.lang.Object);
  static {};
}
