public abstract class org.junit.runner.manipulation.Ordering {
  public org.junit.runner.manipulation.Ordering();
  public static org.junit.runner.manipulation.Ordering shuffledBy(java.util.Random);
  public static org.junit.runner.manipulation.Ordering definedBy(java.lang.Class<? extends org.junit.runner.manipulation.Ordering$Factory>, org.junit.runner.Description) throws org.junit.runner.manipulation.InvalidOrderingException;
  public static org.junit.runner.manipulation.Ordering definedBy(org.junit.runner.manipulation.Ordering$Factory, org.junit.runner.Description) throws org.junit.runner.manipulation.InvalidOrderingException;
  public void apply(java.lang.Object) throws org.junit.runner.manipulation.InvalidOrderingException;
  boolean validateOrderingIsCorrect();
  protected abstract java.util.List<org.junit.runner.Description> orderItems(java.util.Collection<org.junit.runner.Description>);
}
