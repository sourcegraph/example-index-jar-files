public class org.junit.experimental.categories.Categories$CategoryFilter extends org.junit.runner.manipulation.Filter {
  public static org.junit.experimental.categories.Categories$CategoryFilter include(boolean, java.lang.Class<?>...);
  public static org.junit.experimental.categories.Categories$CategoryFilter include(java.lang.Class<?>);
  public static org.junit.experimental.categories.Categories$CategoryFilter include(java.lang.Class<?>...);
  public static org.junit.experimental.categories.Categories$CategoryFilter exclude(boolean, java.lang.Class<?>...);
  public static org.junit.experimental.categories.Categories$CategoryFilter exclude(java.lang.Class<?>);
  public static org.junit.experimental.categories.Categories$CategoryFilter exclude(java.lang.Class<?>...);
  public static org.junit.experimental.categories.Categories$CategoryFilter categoryFilter(boolean, java.util.Set<java.lang.Class<?>>, boolean, java.util.Set<java.lang.Class<?>>);
  public org.junit.experimental.categories.Categories$CategoryFilter(java.lang.Class<?>, java.lang.Class<?>);
  protected org.junit.experimental.categories.Categories$CategoryFilter(boolean, java.util.Set<java.lang.Class<?>>, boolean, java.util.Set<java.lang.Class<?>>);
  public java.lang.String describe();
  public java.lang.String toString();
  public boolean shouldRun(org.junit.runner.Description);
}
