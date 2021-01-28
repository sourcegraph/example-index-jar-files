class org.junit.runner.FilterFactories {
  org.junit.runner.FilterFactories();
  public static org.junit.runner.manipulation.Filter createFilterFromFilterSpec(org.junit.runner.Request, java.lang.String) throws org.junit.runner.FilterFactory$FilterNotCreatedException;
  public static org.junit.runner.manipulation.Filter createFilter(java.lang.String, org.junit.runner.FilterFactoryParams) throws org.junit.runner.FilterFactory$FilterNotCreatedException;
  public static org.junit.runner.manipulation.Filter createFilter(java.lang.Class<? extends org.junit.runner.FilterFactory>, org.junit.runner.FilterFactoryParams) throws org.junit.runner.FilterFactory$FilterNotCreatedException;
  static org.junit.runner.FilterFactory createFilterFactory(java.lang.String) throws org.junit.runner.FilterFactory$FilterNotCreatedException;
  static org.junit.runner.FilterFactory createFilterFactory(java.lang.Class<? extends org.junit.runner.FilterFactory>) throws org.junit.runner.FilterFactory$FilterNotCreatedException;
}
