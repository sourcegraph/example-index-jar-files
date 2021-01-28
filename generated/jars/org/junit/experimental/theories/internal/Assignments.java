public class org.junit.experimental.theories.internal.Assignments {
  public static org.junit.experimental.theories.internal.Assignments allUnassigned(java.lang.reflect.Method, org.junit.runners.model.TestClass);
  public boolean isComplete();
  public org.junit.experimental.theories.ParameterSignature nextUnassigned();
  public org.junit.experimental.theories.internal.Assignments assignNext(org.junit.experimental.theories.PotentialAssignment);
  public java.lang.Object[] getActualValues(int, int) throws org.junit.experimental.theories.PotentialAssignment$CouldNotGenerateValueException;
  public java.util.List<org.junit.experimental.theories.PotentialAssignment> potentialsForNextUnassigned() throws java.lang.Throwable;
  public java.lang.Object[] getConstructorArguments() throws org.junit.experimental.theories.PotentialAssignment$CouldNotGenerateValueException;
  public java.lang.Object[] getMethodArguments() throws org.junit.experimental.theories.PotentialAssignment$CouldNotGenerateValueException;
  public java.lang.Object[] getAllArguments() throws org.junit.experimental.theories.PotentialAssignment$CouldNotGenerateValueException;
  public java.lang.Object[] getArgumentStrings(boolean) throws org.junit.experimental.theories.PotentialAssignment$CouldNotGenerateValueException;
}
