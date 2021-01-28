public abstract class org.junit.runner.manipulation.Filter {
  public static final org.junit.runner.manipulation.Filter ALL;
  public org.junit.runner.manipulation.Filter();
  public static org.junit.runner.manipulation.Filter matchMethodDescription(org.junit.runner.Description);
  public abstract boolean shouldRun(org.junit.runner.Description);
  public abstract java.lang.String describe();
  public void apply(java.lang.Object) throws org.junit.runner.manipulation.NoTestsRemainException;
  public org.junit.runner.manipulation.Filter intersect(org.junit.runner.manipulation.Filter);
  static {};
}
