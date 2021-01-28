public class junit.textui.TestRunner extends junit.runner.BaseTestRunner {
  public static final int SUCCESS_EXIT;
  public static final int FAILURE_EXIT;
  public static final int EXCEPTION_EXIT;
  public junit.textui.TestRunner();
  public junit.textui.TestRunner(java.io.PrintStream);
  public junit.textui.TestRunner(junit.textui.ResultPrinter);
  public static void run(java.lang.Class<? extends junit.framework.TestCase>);
  public static junit.framework.TestResult run(junit.framework.Test);
  public static void runAndWait(junit.framework.Test);
  public void testFailed(int, junit.framework.Test, java.lang.Throwable);
  public void testStarted(java.lang.String);
  public void testEnded(java.lang.String);
  protected junit.framework.TestResult createTestResult();
  public junit.framework.TestResult doRun(junit.framework.Test);
  public junit.framework.TestResult doRun(junit.framework.Test, boolean);
  protected void pause(boolean);
  public static void main(java.lang.String[]);
  public junit.framework.TestResult start(java.lang.String[]) throws java.lang.Exception;
  protected junit.framework.TestResult runSingleMethod(java.lang.String, java.lang.String, boolean) throws java.lang.Exception;
  protected void runFailed(java.lang.String);
  public void setPrinter(junit.textui.ResultPrinter);
}
