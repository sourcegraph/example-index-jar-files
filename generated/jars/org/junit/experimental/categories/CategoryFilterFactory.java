abstract class org.junit.experimental.categories.CategoryFilterFactory implements org.junit.runner.FilterFactory {
  org.junit.experimental.categories.CategoryFilterFactory();
  public org.junit.runner.manipulation.Filter createFilter(org.junit.runner.FilterFactoryParams) throws org.junit.runner.FilterFactory$FilterNotCreatedException;
  protected abstract org.junit.runner.manipulation.Filter createFilter(java.util.List<java.lang.Class<?>>);
}
