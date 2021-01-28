class org.junit.runner.JUnitCommandLineParseResult {
  org.junit.runner.JUnitCommandLineParseResult();
  public java.util.List<java.lang.String> getFilterSpecs();
  public java.util.List<java.lang.Class<?>> getClasses();
  public static org.junit.runner.JUnitCommandLineParseResult parse(java.lang.String[]);
  java.lang.String[] parseOptions(java.lang.String...);
  void parseParameters(java.lang.String[]);
  public org.junit.runner.Request createRequest(org.junit.runner.Computer);
}
