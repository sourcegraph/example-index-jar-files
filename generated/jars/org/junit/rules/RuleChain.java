public class org.junit.rules.RuleChain implements org.junit.rules.TestRule {
  public static org.junit.rules.RuleChain emptyRuleChain();
  public static org.junit.rules.RuleChain outerRule(org.junit.rules.TestRule);
  public org.junit.rules.RuleChain around(org.junit.rules.TestRule);
  public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement, org.junit.runner.Description);
  static {};
}
