public interface org.hamcrest.Description {
  public static final org.hamcrest.Description NONE;
  public abstract org.hamcrest.Description appendText(java.lang.String);
  public abstract org.hamcrest.Description appendDescriptionOf(org.hamcrest.SelfDescribing);
  public abstract org.hamcrest.Description appendValue(java.lang.Object);
  public abstract <T> org.hamcrest.Description appendValueList(java.lang.String, java.lang.String, java.lang.String, T...);
  public abstract <T> org.hamcrest.Description appendValueList(java.lang.String, java.lang.String, java.lang.String, java.lang.Iterable<T>);
  public abstract org.hamcrest.Description appendList(java.lang.String, java.lang.String, java.lang.String, java.lang.Iterable<? extends org.hamcrest.SelfDescribing>);
  static {};
}
