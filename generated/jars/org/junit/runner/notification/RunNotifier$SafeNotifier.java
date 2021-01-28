abstract class org.junit.runner.notification.RunNotifier$SafeNotifier {
  final org.junit.runner.notification.RunNotifier this$0;
  org.junit.runner.notification.RunNotifier$SafeNotifier(org.junit.runner.notification.RunNotifier);
  org.junit.runner.notification.RunNotifier$SafeNotifier(java.util.List<org.junit.runner.notification.RunListener>);
  void run();
  protected abstract void notifyListener(org.junit.runner.notification.RunListener) throws java.lang.Exception;
}
