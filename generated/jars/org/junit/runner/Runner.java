public abstract class org.junit.runner.Runner implements org.junit.runner.Describable {
  public org.junit.runner.Runner();
  public abstract org.junit.runner.Description getDescription();
  public abstract void run(org.junit.runner.notification.RunNotifier);
  public int testCount();
}
