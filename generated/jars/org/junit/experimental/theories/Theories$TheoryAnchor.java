public class org.junit.experimental.theories.Theories$TheoryAnchor extends org.junit.runners.model.Statement {
  public org.junit.experimental.theories.Theories$TheoryAnchor(org.junit.runners.model.FrameworkMethod, org.junit.runners.model.TestClass);
  public void evaluate() throws java.lang.Throwable;
  protected void runWithAssignment(org.junit.experimental.theories.internal.Assignments) throws java.lang.Throwable;
  protected void runWithIncompleteAssignment(org.junit.experimental.theories.internal.Assignments) throws java.lang.Throwable;
  protected void runWithCompleteAssignment(org.junit.experimental.theories.internal.Assignments) throws java.lang.Throwable;
  protected void handleAssumptionViolation(org.junit.internal.AssumptionViolatedException);
  protected void reportParameterizedError(java.lang.Throwable, java.lang.Object...) throws java.lang.Throwable;
  protected void handleDataPointSuccess();
  static boolean access$000(org.junit.experimental.theories.Theories$TheoryAnchor);
  static org.junit.runners.model.Statement access$100(org.junit.experimental.theories.Theories$TheoryAnchor, org.junit.runners.model.FrameworkMethod, org.junit.experimental.theories.internal.Assignments, java.lang.Object);
}
