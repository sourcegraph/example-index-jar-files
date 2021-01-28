public abstract class org.junit.runners.model.RunnerBuilder {
  public org.junit.runners.model.RunnerBuilder();
  public abstract org.junit.runner.Runner runnerForClass(java.lang.Class<?>) throws java.lang.Throwable;
  public org.junit.runner.Runner safeRunnerForClass(java.lang.Class<?>);
  java.lang.Class<?> addParent(java.lang.Class<?>) throws org.junit.runners.model.InitializationError;
  void removeParent(java.lang.Class<?>);
  public java.util.List<org.junit.runner.Runner> runners(java.lang.Class<?>, java.lang.Class<?>[]) throws org.junit.runners.model.InitializationError;
  public java.util.List<org.junit.runner.Runner> runners(java.lang.Class<?>, java.util.List<java.lang.Class<?>>) throws org.junit.runners.model.InitializationError;
}
