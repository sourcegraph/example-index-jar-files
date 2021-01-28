public class junit.textui.ResultPrinter implements junit.framework.TestListener {
  java.io.PrintStream fWriter;
  int fColumn;
  public junit.textui.ResultPrinter(java.io.PrintStream);
  synchronized void print(junit.framework.TestResult, long);
  void printWaitPrompt();
  protected void printHeader(long);
  protected void printErrors(junit.framework.TestResult);
  protected void printFailures(junit.framework.TestResult);
  protected void printDefects(java.util.Enumeration<junit.framework.TestFailure>, int, java.lang.String);
  public void printDefect(junit.framework.TestFailure, int);
  protected void printDefectHeader(junit.framework.TestFailure, int);
  protected void printDefectTrace(junit.framework.TestFailure);
  protected void printFooter(junit.framework.TestResult);
  protected java.lang.String elapsedTimeAsString(long);
  public java.io.PrintStream getWriter();
  public void addError(junit.framework.Test, java.lang.Throwable);
  public void addFailure(junit.framework.Test, junit.framework.AssertionFailedError);
  public void endTest(junit.framework.Test);
  public void startTest(junit.framework.Test);
}
