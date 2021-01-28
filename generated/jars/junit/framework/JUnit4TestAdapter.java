public class junit.framework.JUnit4TestAdapter implements junit.framework.Test,org.junit.runner.manipulation.Filterable,org.junit.runner.manipulation.Orderable,org.junit.runner.Describable {
  public junit.framework.JUnit4TestAdapter(java.lang.Class<?>);
  public junit.framework.JUnit4TestAdapter(java.lang.Class<?>, junit.framework.JUnit4TestAdapterCache);
  public int countTestCases();
  public void run(junit.framework.TestResult);
  public java.util.List<junit.framework.Test> getTests();
  public java.lang.Class<?> getTestClass();
  public org.junit.runner.Description getDescription();
  public java.lang.String toString();
  public void filter(org.junit.runner.manipulation.Filter) throws org.junit.runner.manipulation.NoTestsRemainException;
  public void sort(org.junit.runner.manipulation.Sorter);
  public void order(org.junit.runner.manipulation.Orderer) throws org.junit.runner.manipulation.InvalidOrderingException;
}
