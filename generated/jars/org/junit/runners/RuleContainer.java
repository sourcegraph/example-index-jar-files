class org.junit.runners.RuleContainer {
  static final java.util.Comparator<org.junit.runners.RuleContainer$RuleEntry> ENTRY_COMPARATOR;
  org.junit.runners.RuleContainer();
  public void setOrder(java.lang.Object, int);
  public void add(org.junit.rules.MethodRule);
  public void add(org.junit.rules.TestRule);
  public org.junit.runners.model.Statement apply(org.junit.runners.model.FrameworkMethod, org.junit.runner.Description, java.lang.Object, org.junit.runners.model.Statement);
  java.util.List<java.lang.Object> getSortedRules();
  static {};
}
