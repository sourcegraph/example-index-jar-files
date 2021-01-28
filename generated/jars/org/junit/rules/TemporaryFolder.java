public class org.junit.rules.TemporaryFolder extends org.junit.rules.ExternalResource {
  public org.junit.rules.TemporaryFolder();
  public org.junit.rules.TemporaryFolder(java.io.File);
  protected org.junit.rules.TemporaryFolder(org.junit.rules.TemporaryFolder$Builder);
  public static org.junit.rules.TemporaryFolder$Builder builder();
  protected void before() throws java.lang.Throwable;
  protected void after();
  public void create() throws java.io.IOException;
  public java.io.File newFile(java.lang.String) throws java.io.IOException;
  public java.io.File newFile() throws java.io.IOException;
  public java.io.File newFolder(java.lang.String) throws java.io.IOException;
  public java.io.File newFolder(java.lang.String...) throws java.io.IOException;
  public java.io.File newFolder() throws java.io.IOException;
  public java.io.File getRoot();
  public void delete();
}
