public class org.junit.runner.manipulation.Sorter extends org.junit.runner.manipulation.Ordering implements java.util.Comparator<org.junit.runner.Description> {
  public static final org.junit.runner.manipulation.Sorter NULL;
  public org.junit.runner.manipulation.Sorter(java.util.Comparator<org.junit.runner.Description>);
  public void apply(java.lang.Object);
  public int compare(org.junit.runner.Description, org.junit.runner.Description);
  protected final java.util.List<org.junit.runner.Description> orderItems(java.util.Collection<org.junit.runner.Description>);
  boolean validateOrderingIsCorrect();
  public int compare(java.lang.Object, java.lang.Object);
  static {};
}
