public class org.junit.internal.builders.AllDefaultPossibilitiesBuilder extends org.junit.runners.model.RunnerBuilder {
  public org.junit.internal.builders.AllDefaultPossibilitiesBuilder();
  public org.junit.internal.builders.AllDefaultPossibilitiesBuilder(boolean);
  public org.junit.runner.Runner runnerForClass(java.lang.Class<?>) throws java.lang.Throwable;
  protected org.junit.internal.builders.JUnit4Builder junit4Builder();
  protected org.junit.internal.builders.JUnit3Builder junit3Builder();
  protected org.junit.internal.builders.AnnotatedBuilder annotatedBuilder();
  protected org.junit.internal.builders.IgnoredBuilder ignoredBuilder();
  protected org.junit.runners.model.RunnerBuilder suiteMethodBuilder();
}
