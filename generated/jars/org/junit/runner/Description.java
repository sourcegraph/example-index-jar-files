public class org.junit.runner.Description implements java.io.Serializable {
  public static final org.junit.runner.Description EMPTY;
  public static final org.junit.runner.Description TEST_MECHANISM;
  public static org.junit.runner.Description createSuiteDescription(java.lang.String, java.lang.annotation.Annotation...);
  public static org.junit.runner.Description createSuiteDescription(java.lang.String, java.io.Serializable, java.lang.annotation.Annotation...);
  public static org.junit.runner.Description createTestDescription(java.lang.String, java.lang.String, java.lang.annotation.Annotation...);
  public static org.junit.runner.Description createTestDescription(java.lang.Class<?>, java.lang.String, java.lang.annotation.Annotation...);
  public static org.junit.runner.Description createTestDescription(java.lang.Class<?>, java.lang.String);
  public static org.junit.runner.Description createTestDescription(java.lang.String, java.lang.String, java.io.Serializable);
  public static org.junit.runner.Description createSuiteDescription(java.lang.Class<?>);
  public static org.junit.runner.Description createSuiteDescription(java.lang.Class<?>, java.lang.annotation.Annotation...);
  public java.lang.String getDisplayName();
  public void addChild(org.junit.runner.Description);
  public java.util.ArrayList<org.junit.runner.Description> getChildren();
  public boolean isSuite();
  public boolean isTest();
  public int testCount();
  public int hashCode();
  public boolean equals(java.lang.Object);
  public java.lang.String toString();
  public boolean isEmpty();
  public org.junit.runner.Description childlessCopy();
  public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T>);
  public java.util.Collection<java.lang.annotation.Annotation> getAnnotations();
  public java.lang.Class<?> getTestClass();
  public java.lang.String getClassName();
  public java.lang.String getMethodName();
  static {};
}
