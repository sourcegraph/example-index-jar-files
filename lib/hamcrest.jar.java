Compiled from "BaseDescription.java"
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
Compiled from "BaseMatcher.java"
public abstract class org.hamcrest.BaseMatcher<T> implements org.hamcrest.Matcher<T> {
  public org.hamcrest.BaseMatcher();
  public final void _dont_implement_Matcher___instead_extend_BaseMatcher_();
  public void describeMismatch(java.lang.Object, org.hamcrest.Description);
  public java.lang.String toString();
}
Compiled from "Condition.java"
class org.hamcrest.Condition$1 {
}
Compiled from "Condition.java"
final class org.hamcrest.Condition$Matched<T> extends org.hamcrest.Condition<T> {
  public boolean matching(org.hamcrest.Matcher<T>, java.lang.String);
  public <U> org.hamcrest.Condition<U> and(org.hamcrest.Condition$Step<? super T, U>);
  org.hamcrest.Condition$Matched(java.lang.Object, org.hamcrest.Description, org.hamcrest.Condition$1);
}
Compiled from "Condition.java"
final class org.hamcrest.Condition$NotMatched<T> extends org.hamcrest.Condition<T> {
  public boolean matching(org.hamcrest.Matcher<T>, java.lang.String);
  public <U> org.hamcrest.Condition<U> and(org.hamcrest.Condition$Step<? super T, U>);
  org.hamcrest.Condition$NotMatched(org.hamcrest.Condition$1);
}
Compiled from "Condition.java"
public interface org.hamcrest.Condition$Step<I, O> {
  public abstract org.hamcrest.Condition<O> apply(I, org.hamcrest.Description);
}
Compiled from "Condition.java"
public abstract class org.hamcrest.Condition<T> {
  public static final org.hamcrest.Condition$NotMatched<java.lang.Object> NOT_MATCHED;
  public abstract boolean matching(org.hamcrest.Matcher<T>, java.lang.String);
  public abstract <U> org.hamcrest.Condition<U> and(org.hamcrest.Condition$Step<? super T, U>);
  public final boolean matching(org.hamcrest.Matcher<T>);
  public final <U> org.hamcrest.Condition<U> then(org.hamcrest.Condition$Step<? super T, U>);
  public static <T> org.hamcrest.Condition<T> notMatched();
  public static <T> org.hamcrest.Condition<T> matched(T, org.hamcrest.Description);
  org.hamcrest.Condition(org.hamcrest.Condition$1);
  static {};
}
Compiled from "CoreMatchers.java"
public class org.hamcrest.CoreMatchers {
  public org.hamcrest.CoreMatchers();
  public static <T> org.hamcrest.Matcher<T> allOf(java.lang.Iterable<org.hamcrest.Matcher<? super T>>);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>...);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(java.lang.Iterable<org.hamcrest.Matcher<? super T>>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<? super T>...);
  public static <LHS> org.hamcrest.core.CombinableMatcher$CombinableBothMatcher<LHS> both(org.hamcrest.Matcher<? super LHS>);
  public static <LHS> org.hamcrest.core.CombinableMatcher$CombinableEitherMatcher<LHS> either(org.hamcrest.Matcher<? super LHS>);
  public static <T> org.hamcrest.Matcher<T> describedAs(java.lang.String, org.hamcrest.Matcher<T>, java.lang.Object...);
  public static <U> org.hamcrest.Matcher<java.lang.Iterable<U>> everyItem(org.hamcrest.Matcher<U>);
  public static <T> org.hamcrest.Matcher<T> is(T);
  public static <T> org.hamcrest.Matcher<T> is(org.hamcrest.Matcher<T>);
  public static <T> org.hamcrest.Matcher<T> is(java.lang.Class<T>);
  public static <T> org.hamcrest.Matcher<T> isA(java.lang.Class<T>);
  public static org.hamcrest.Matcher<java.lang.Object> anything();
  public static org.hamcrest.Matcher<java.lang.Object> anything(java.lang.String);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> hasItem(T);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> hasItem(org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<T>> hasItems(T...);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<T>> hasItems(org.hamcrest.Matcher<? super T>...);
  public static <T> org.hamcrest.Matcher<T> equalTo(T);
  public static <T> org.hamcrest.Matcher<T> any(java.lang.Class<T>);
  public static <T> org.hamcrest.Matcher<T> instanceOf(java.lang.Class<?>);
  public static <T> org.hamcrest.Matcher<T> not(org.hamcrest.Matcher<T>);
  public static <T> org.hamcrest.Matcher<T> not(T);
  public static org.hamcrest.Matcher<java.lang.Object> nullValue();
  public static <T> org.hamcrest.Matcher<T> nullValue(java.lang.Class<T>);
  public static org.hamcrest.Matcher<java.lang.Object> notNullValue();
  public static <T> org.hamcrest.Matcher<T> notNullValue(java.lang.Class<T>);
  public static <T> org.hamcrest.Matcher<T> sameInstance(T);
  public static <T> org.hamcrest.Matcher<T> theInstance(T);
  public static org.hamcrest.Matcher<java.lang.String> containsString(java.lang.String);
  public static org.hamcrest.Matcher<java.lang.String> startsWith(java.lang.String);
  public static org.hamcrest.Matcher<java.lang.String> endsWith(java.lang.String);
}
Compiled from "CustomMatcher.java"
public abstract class org.hamcrest.CustomMatcher<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.CustomMatcher(java.lang.String);
  public final void describeTo(org.hamcrest.Description);
}
Compiled from "CustomTypeSafeMatcher.java"
public abstract class org.hamcrest.CustomTypeSafeMatcher<T> extends org.hamcrest.TypeSafeMatcher<T> {
  public org.hamcrest.CustomTypeSafeMatcher(java.lang.String);
  public final void describeTo(org.hamcrest.Description);
}
Compiled from "Description.java"
public final class org.hamcrest.Description$NullDescription implements org.hamcrest.Description {
  public org.hamcrest.Description$NullDescription();
  public org.hamcrest.Description appendDescriptionOf(org.hamcrest.SelfDescribing);
  public org.hamcrest.Description appendList(java.lang.String, java.lang.String, java.lang.String, java.lang.Iterable<? extends org.hamcrest.SelfDescribing>);
  public org.hamcrest.Description appendText(java.lang.String);
  public org.hamcrest.Description appendValue(java.lang.Object);
  public <T> org.hamcrest.Description appendValueList(java.lang.String, java.lang.String, java.lang.String, T...);
  public <T> org.hamcrest.Description appendValueList(java.lang.String, java.lang.String, java.lang.String, java.lang.Iterable<T>);
  public java.lang.String toString();
}
Compiled from "Description.java"
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
Compiled from "DiagnosingMatcher.java"
public abstract class org.hamcrest.DiagnosingMatcher<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.DiagnosingMatcher();
  public final boolean matches(java.lang.Object);
  public final void describeMismatch(java.lang.Object, org.hamcrest.Description);
  protected abstract boolean matches(java.lang.Object, org.hamcrest.Description);
}
Compiled from "Factory.java"
public interface org.hamcrest.Factory extends java.lang.annotation.Annotation {
}
Compiled from "FeatureMatcher.java"
public abstract class org.hamcrest.FeatureMatcher<T, U> extends org.hamcrest.TypeSafeDiagnosingMatcher<T> {
  public org.hamcrest.FeatureMatcher(org.hamcrest.Matcher<? super U>, java.lang.String, java.lang.String);
  protected abstract U featureValueOf(T);
  protected boolean matchesSafely(T, org.hamcrest.Description);
  public final void describeTo(org.hamcrest.Description);
  static {};
}
Compiled from "Matcher.java"
public interface org.hamcrest.Matcher<T> extends org.hamcrest.SelfDescribing {
  public abstract boolean matches(java.lang.Object);
  public abstract void describeMismatch(java.lang.Object, org.hamcrest.Description);
  public abstract void _dont_implement_Matcher___instead_extend_BaseMatcher_();
}
Compiled from "MatcherAssert.java"
public class org.hamcrest.MatcherAssert {
  public org.hamcrest.MatcherAssert();
  public static <T> void assertThat(T, org.hamcrest.Matcher<? super T>);
  public static <T> void assertThat(java.lang.String, T, org.hamcrest.Matcher<? super T>);
  public static void assertThat(java.lang.String, boolean);
}
Compiled from "SelfDescribing.java"
public interface org.hamcrest.SelfDescribing {
  public abstract void describeTo(org.hamcrest.Description);
}
Compiled from "StringDescription.java"
public class org.hamcrest.StringDescription extends org.hamcrest.BaseDescription {
  public org.hamcrest.StringDescription();
  public org.hamcrest.StringDescription(java.lang.Appendable);
  public static java.lang.String toString(org.hamcrest.SelfDescribing);
  public static java.lang.String asString(org.hamcrest.SelfDescribing);
  protected void append(java.lang.String);
  protected void append(char);
  public java.lang.String toString();
}
Compiled from "TypeSafeDiagnosingMatcher.java"
public abstract class org.hamcrest.TypeSafeDiagnosingMatcher<T> extends org.hamcrest.BaseMatcher<T> {
  protected abstract boolean matchesSafely(T, org.hamcrest.Description);
  protected org.hamcrest.TypeSafeDiagnosingMatcher(java.lang.Class<?>);
  protected org.hamcrest.TypeSafeDiagnosingMatcher(org.hamcrest.internal.ReflectiveTypeFinder);
  protected org.hamcrest.TypeSafeDiagnosingMatcher();
  public final boolean matches(java.lang.Object);
  public final void describeMismatch(java.lang.Object, org.hamcrest.Description);
  static {};
}
Compiled from "TypeSafeMatcher.java"
public abstract class org.hamcrest.TypeSafeMatcher<T> extends org.hamcrest.BaseMatcher<T> {
  protected org.hamcrest.TypeSafeMatcher();
  protected org.hamcrest.TypeSafeMatcher(java.lang.Class<?>);
  protected org.hamcrest.TypeSafeMatcher(org.hamcrest.internal.ReflectiveTypeFinder);
  protected abstract boolean matchesSafely(T);
  protected void describeMismatchSafely(T, org.hamcrest.Description);
  public final boolean matches(java.lang.Object);
  public final void describeMismatch(java.lang.Object, org.hamcrest.Description);
  static {};
}
Compiled from "AllOf.java"
public class org.hamcrest.core.AllOf<T> extends org.hamcrest.DiagnosingMatcher<T> {
  public org.hamcrest.core.AllOf(java.lang.Iterable<org.hamcrest.Matcher<? super T>>);
  public boolean matches(java.lang.Object, org.hamcrest.Description);
  public void describeTo(org.hamcrest.Description);
  public static <T> org.hamcrest.Matcher<T> allOf(java.lang.Iterable<org.hamcrest.Matcher<? super T>>);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>...);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
}
Compiled from "AnyOf.java"
public class org.hamcrest.core.AnyOf<T> extends org.hamcrest.core.ShortcutCombination<T> {
  public org.hamcrest.core.AnyOf(java.lang.Iterable<org.hamcrest.Matcher<? super T>>);
  public boolean matches(java.lang.Object);
  public void describeTo(org.hamcrest.Description);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(java.lang.Iterable<org.hamcrest.Matcher<? super T>>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<? super T>...);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>, org.hamcrest.Matcher<? super T>);
  public void describeTo(org.hamcrest.Description, java.lang.String);
}
Compiled from "CombinableMatcher.java"
public final class org.hamcrest.core.CombinableMatcher$CombinableBothMatcher<X> {
  public org.hamcrest.core.CombinableMatcher$CombinableBothMatcher(org.hamcrest.Matcher<? super X>);
  public org.hamcrest.core.CombinableMatcher<X> and(org.hamcrest.Matcher<? super X>);
}
Compiled from "CombinableMatcher.java"
public final class org.hamcrest.core.CombinableMatcher$CombinableEitherMatcher<X> {
  public org.hamcrest.core.CombinableMatcher$CombinableEitherMatcher(org.hamcrest.Matcher<? super X>);
  public org.hamcrest.core.CombinableMatcher<X> or(org.hamcrest.Matcher<? super X>);
}
Compiled from "CombinableMatcher.java"
public class org.hamcrest.core.CombinableMatcher<T> extends org.hamcrest.TypeSafeDiagnosingMatcher<T> {
  public org.hamcrest.core.CombinableMatcher(org.hamcrest.Matcher<? super T>);
  protected boolean matchesSafely(T, org.hamcrest.Description);
  public void describeTo(org.hamcrest.Description);
  public org.hamcrest.core.CombinableMatcher<T> and(org.hamcrest.Matcher<? super T>);
  public org.hamcrest.core.CombinableMatcher<T> or(org.hamcrest.Matcher<? super T>);
  public static <LHS> org.hamcrest.core.CombinableMatcher$CombinableBothMatcher<LHS> both(org.hamcrest.Matcher<? super LHS>);
  public static <LHS> org.hamcrest.core.CombinableMatcher$CombinableEitherMatcher<LHS> either(org.hamcrest.Matcher<? super LHS>);
}
Compiled from "DescribedAs.java"
public class org.hamcrest.core.DescribedAs<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.core.DescribedAs(java.lang.String, org.hamcrest.Matcher<T>, java.lang.Object[]);
  public boolean matches(java.lang.Object);
  public void describeTo(org.hamcrest.Description);
  public void describeMismatch(java.lang.Object, org.hamcrest.Description);
  public static <T> org.hamcrest.Matcher<T> describedAs(java.lang.String, org.hamcrest.Matcher<T>, java.lang.Object...);
  static {};
}
Compiled from "Every.java"
public class org.hamcrest.core.Every<T> extends org.hamcrest.TypeSafeDiagnosingMatcher<java.lang.Iterable<T>> {
  public org.hamcrest.core.Every(org.hamcrest.Matcher<? super T>);
  public boolean matchesSafely(java.lang.Iterable<T>, org.hamcrest.Description);
  public void describeTo(org.hamcrest.Description);
  public static <U> org.hamcrest.Matcher<java.lang.Iterable<U>> everyItem(org.hamcrest.Matcher<U>);
  public boolean matchesSafely(java.lang.Object, org.hamcrest.Description);
}
Compiled from "Is.java"
public class org.hamcrest.core.Is<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.core.Is(org.hamcrest.Matcher<T>);
  public boolean matches(java.lang.Object);
  public void describeTo(org.hamcrest.Description);
  public void describeMismatch(java.lang.Object, org.hamcrest.Description);
  public static <T> org.hamcrest.Matcher<T> is(org.hamcrest.Matcher<T>);
  public static <T> org.hamcrest.Matcher<T> is(T);
  public static <T> org.hamcrest.Matcher<T> is(java.lang.Class<T>);
  public static <T> org.hamcrest.Matcher<T> isA(java.lang.Class<T>);
}
Compiled from "IsAnything.java"
public class org.hamcrest.core.IsAnything<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.core.IsAnything();
  public org.hamcrest.core.IsAnything(java.lang.String);
  public boolean matches(java.lang.Object);
  public void describeTo(org.hamcrest.Description);
  public static org.hamcrest.Matcher<java.lang.Object> anything();
  public static org.hamcrest.Matcher<java.lang.Object> anything(java.lang.String);
}
Compiled from "IsCollectionContaining.java"
public class org.hamcrest.core.IsCollectionContaining<T> extends org.hamcrest.TypeSafeDiagnosingMatcher<java.lang.Iterable<? super T>> {
  public org.hamcrest.core.IsCollectionContaining(org.hamcrest.Matcher<? super T>);
  protected boolean matchesSafely(java.lang.Iterable<? super T>, org.hamcrest.Description);
  public void describeTo(org.hamcrest.Description);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> hasItem(org.hamcrest.Matcher<? super T>);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> hasItem(T);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<T>> hasItems(org.hamcrest.Matcher<? super T>...);
  public static <T> org.hamcrest.Matcher<java.lang.Iterable<T>> hasItems(T...);
  protected boolean matchesSafely(java.lang.Object, org.hamcrest.Description);
}
Compiled from "IsEqual.java"
public class org.hamcrest.core.IsEqual<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.core.IsEqual(T);
  public boolean matches(java.lang.Object);
  public void describeTo(org.hamcrest.Description);
  public static <T> org.hamcrest.Matcher<T> equalTo(T);
}
Compiled from "IsInstanceOf.java"
public class org.hamcrest.core.IsInstanceOf extends org.hamcrest.DiagnosingMatcher<java.lang.Object> {
  public org.hamcrest.core.IsInstanceOf(java.lang.Class<?>);
  protected boolean matches(java.lang.Object, org.hamcrest.Description);
  public void describeTo(org.hamcrest.Description);
  public static <T> org.hamcrest.Matcher<T> instanceOf(java.lang.Class<?>);
  public static <T> org.hamcrest.Matcher<T> any(java.lang.Class<T>);
}
Compiled from "IsNot.java"
public class org.hamcrest.core.IsNot<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.core.IsNot(org.hamcrest.Matcher<T>);
  public boolean matches(java.lang.Object);
  public void describeTo(org.hamcrest.Description);
  public static <T> org.hamcrest.Matcher<T> not(org.hamcrest.Matcher<T>);
  public static <T> org.hamcrest.Matcher<T> not(T);
}
Compiled from "IsNull.java"
public class org.hamcrest.core.IsNull<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.core.IsNull();
  public boolean matches(java.lang.Object);
  public void describeTo(org.hamcrest.Description);
  public static org.hamcrest.Matcher<java.lang.Object> nullValue();
  public static org.hamcrest.Matcher<java.lang.Object> notNullValue();
  public static <T> org.hamcrest.Matcher<T> nullValue(java.lang.Class<T>);
  public static <T> org.hamcrest.Matcher<T> notNullValue(java.lang.Class<T>);
}
Compiled from "IsSame.java"
public class org.hamcrest.core.IsSame<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.core.IsSame(T);
  public boolean matches(java.lang.Object);
  public void describeTo(org.hamcrest.Description);
  public static <T> org.hamcrest.Matcher<T> sameInstance(T);
  public static <T> org.hamcrest.Matcher<T> theInstance(T);
}
Compiled from "ShortcutCombination.java"
abstract class org.hamcrest.core.ShortcutCombination<T> extends org.hamcrest.BaseMatcher<T> {
  public org.hamcrest.core.ShortcutCombination(java.lang.Iterable<org.hamcrest.Matcher<? super T>>);
  public abstract boolean matches(java.lang.Object);
  public abstract void describeTo(org.hamcrest.Description);
  protected boolean matches(java.lang.Object, boolean);
  public void describeTo(org.hamcrest.Description, java.lang.String);
}
Compiled from "StringContains.java"
public class org.hamcrest.core.StringContains extends org.hamcrest.core.SubstringMatcher {
  public org.hamcrest.core.StringContains(java.lang.String);
  protected boolean evalSubstringOf(java.lang.String);
  protected java.lang.String relationship();
  public static org.hamcrest.Matcher<java.lang.String> containsString(java.lang.String);
}
Compiled from "StringEndsWith.java"
public class org.hamcrest.core.StringEndsWith extends org.hamcrest.core.SubstringMatcher {
  public org.hamcrest.core.StringEndsWith(java.lang.String);
  protected boolean evalSubstringOf(java.lang.String);
  protected java.lang.String relationship();
  public static org.hamcrest.Matcher<java.lang.String> endsWith(java.lang.String);
}
Compiled from "StringStartsWith.java"
public class org.hamcrest.core.StringStartsWith extends org.hamcrest.core.SubstringMatcher {
  public org.hamcrest.core.StringStartsWith(java.lang.String);
  protected boolean evalSubstringOf(java.lang.String);
  protected java.lang.String relationship();
  public static org.hamcrest.Matcher<java.lang.String> startsWith(java.lang.String);
}
Compiled from "SubstringMatcher.java"
public abstract class org.hamcrest.core.SubstringMatcher extends org.hamcrest.TypeSafeMatcher<java.lang.String> {
  protected final java.lang.String substring;
  protected org.hamcrest.core.SubstringMatcher(java.lang.String);
  public boolean matchesSafely(java.lang.String);
  public void describeMismatchSafely(java.lang.String, org.hamcrest.Description);
  public void describeTo(org.hamcrest.Description);
  protected abstract boolean evalSubstringOf(java.lang.String);
  protected abstract java.lang.String relationship();
  public void describeMismatchSafely(java.lang.Object, org.hamcrest.Description);
  public boolean matchesSafely(java.lang.Object);
}
Compiled from "ArrayIterator.java"
public class org.hamcrest.internal.ArrayIterator implements java.util.Iterator<java.lang.Object> {
  public org.hamcrest.internal.ArrayIterator(java.lang.Object);
  public boolean hasNext();
  public java.lang.Object next();
  public void remove();
}
Compiled from "ReflectiveTypeFinder.java"
public class org.hamcrest.internal.ReflectiveTypeFinder {
  public org.hamcrest.internal.ReflectiveTypeFinder(java.lang.String, int, int);
  public java.lang.Class<?> findExpectedType(java.lang.Class<?>);
  protected boolean canObtainExpectedTypeFrom(java.lang.reflect.Method);
  protected java.lang.Class<?> expectedTypeFrom(java.lang.reflect.Method);
}
Compiled from "SelfDescribingValue.java"
public class org.hamcrest.internal.SelfDescribingValue<T> implements org.hamcrest.SelfDescribing {
  public org.hamcrest.internal.SelfDescribingValue(T);
  public void describeTo(org.hamcrest.Description);
}
Compiled from "SelfDescribingValueIterator.java"
public class org.hamcrest.internal.SelfDescribingValueIterator<T> implements java.util.Iterator<org.hamcrest.SelfDescribing> {
  public org.hamcrest.internal.SelfDescribingValueIterator(java.util.Iterator<T>);
  public boolean hasNext();
  public org.hamcrest.SelfDescribing next();
  public void remove();
  public java.lang.Object next();
}
