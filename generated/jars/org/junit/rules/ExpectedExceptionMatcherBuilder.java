class org.junit.rules.ExpectedExceptionMatcherBuilder {
  org.junit.rules.ExpectedExceptionMatcherBuilder();
  void add(org.hamcrest.Matcher<?>);
  boolean expectsThrowable();
  org.hamcrest.Matcher<java.lang.Throwable> build();
}
