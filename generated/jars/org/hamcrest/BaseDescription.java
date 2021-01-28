public abstract class org.hamcrest.BaseDescription implements org.hamcrest.Description {
  public org.hamcrest.BaseDescription();
  public org.hamcrest.Description appendText(java.lang.String);
  public org.hamcrest.Description appendDescriptionOf(org.hamcrest.SelfDescribing);
  public org.hamcrest.Description appendValue(java.lang.Object);
  public <T> org.hamcrest.Description appendValueList(java.lang.String, java.lang.String, java.lang.String, T...);
  public <T> org.hamcrest.Description appendValueList(java.lang.String, java.lang.String, java.lang.String, java.lang.Iterable<T>);
  public org.hamcrest.Description appendList(java.lang.String, java.lang.String, java.lang.String, java.lang.Iterable<? extends org.hamcrest.SelfDescribing>);
  protected void append(java.lang.String);
  protected abstract void append(char);
}
