/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:05:08 GMT 2019
 */

package org.apache.commons.collections4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import org.apache.commons.collections4.ComparatorUtils;
import org.apache.commons.collections4.Transformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComparatorUtils_ESTest extends ComparatorUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      Comparator<Object>[] comparatorArray0 = (Comparator<Object>[]) Array.newInstance(Comparator.class, 7);
      Comparator<Object> comparator0 = ComparatorUtils.nullLowComparator((Comparator<Object>) null);
      comparatorArray0[0] = comparator0;
      Object object1 = ComparatorUtils.max((Object) null, object0, comparatorArray0[0]);
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = Boolean.valueOf("THERE");
      Comparator<Boolean> comparator0 = ComparatorUtils.booleanComparator(false);
      Boolean boolean2 = ComparatorUtils.min(boolean0, boolean1, comparator0);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Integer> comparator0 = ComparatorUtils.naturalComparator();
      Comparator<Integer> comparator1 = ComparatorUtils.nullHighComparator(comparator0);
      Integer integer0 = ComparatorUtils.min((Integer) null, (Integer) null, comparator1);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object>[] comparatorArray0 = (Comparator<Object>[]) Array.newInstance(Comparator.class, 4);
      Comparator<Object> comparator0 = ComparatorUtils.nullHighComparator(comparatorArray0[0]);
      Object object0 = ComparatorUtils.max((Object) null, (Object) null, comparator0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Comparator<String>> linkedList0 = new LinkedList<Comparator<String>>();
      Comparator<String> comparator0 = ComparatorUtils.chainedComparator((Collection<Comparator<String>>) linkedList0);
      // Undeclared exception!
      try { 
        ComparatorUtils.min((String) null, "setLength", comparator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // ComparatorChains must contain at least one Comparator
         //
         verifyException("org.apache.commons.collections4.comparators.ComparatorChain", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Comparator<Boolean> comparator0 = ComparatorUtils.booleanComparator(true);
      Transformer<Object, Boolean> transformer0 = (Transformer<Object, Boolean>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(transformer0).transform(any());
      Comparator<Boolean> comparator1 = ComparatorUtils.transformedComparator(comparator0, (Transformer<? super Boolean, ? extends Boolean>) transformer0);
      // Undeclared exception!
      try { 
        ComparatorUtils.min(boolean0, boolean0, comparator1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.comparators.BooleanComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      LinkedList<Comparator<Boolean>> linkedList0 = new LinkedList<Comparator<Boolean>>();
      Comparator<Boolean> comparator0 = ComparatorUtils.chainedComparator((Collection<Comparator<Boolean>>) linkedList0);
      // Undeclared exception!
      try { 
        ComparatorUtils.max(boolean0, boolean0, comparator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // ComparatorChains must contain at least one Comparator
         //
         verifyException("org.apache.commons.collections4.comparators.ComparatorChain", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Boolean> comparator0 = ComparatorUtils.naturalComparator();
      Transformer<Object, Boolean> transformer0 = (Transformer<Object, Boolean>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(transformer0).transform(any());
      Comparator<Boolean> comparator1 = ComparatorUtils.transformedComparator(comparator0, (Transformer<? super Boolean, ? extends Boolean>) transformer0);
      Comparator<Boolean> comparator2 = ComparatorUtils.reversedComparator(comparator1);
      Boolean boolean0 = Boolean.TRUE;
      // Undeclared exception!
      try { 
        ComparatorUtils.max(boolean0, boolean0, comparator2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.comparators.ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ComparatorUtils.chainedComparator((Comparator<Comparable<String>>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.ComparatorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ComparatorUtils.chainedComparator((Collection<Comparator<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.ComparatorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Comparator<Comparator<Integer>>> linkedList0 = new LinkedList<Comparator<Comparator<Integer>>>();
      linkedList0.offerLast((Comparator<Comparator<Integer>>) null);
      // Undeclared exception!
      try { 
        ComparatorUtils.chainedComparator((Collection<Comparator<Comparator<Integer>>>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Comparator cannot be null
         //
         verifyException("org.apache.commons.collections4.ComparatorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<String> comparator0 = ComparatorUtils.naturalComparator();
      Comparator<String>[] comparatorArray0 = (Comparator<String>[]) Array.newInstance(Comparator.class, 1);
      comparatorArray0[0] = comparator0;
      Comparator<String> comparator1 = ComparatorUtils.chainedComparator(comparatorArray0);
      assertFalse(comparator1.equals((Object)comparator0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<String> comparator0 = ComparatorUtils.naturalComparator();
      String string0 = ComparatorUtils.max("wz`yms%+\"", "", comparator0);
      assertEquals("wz`yms%+\"", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<String> comparator0 = ComparatorUtils.naturalComparator();
      String string0 = ComparatorUtils.min("Hello", "[>", comparator0);
      assertEquals("Hello", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = ComparatorUtils.min("K?9T;b.D|Zv", "K?9T;b.D|Zv", (Comparator<String>) null);
      assertEquals("K?9T;b.D|Zv", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Boolean> comparator0 = ComparatorUtils.booleanComparator(true);
      Comparator<Object>[] comparatorArray0 = (Comparator<Object>[]) Array.newInstance(Comparator.class, 5);
      Comparator<Object> comparator1 = ComparatorUtils.nullLowComparator((Comparator<Object>) null);
      comparatorArray0[0] = comparator1;
      // Undeclared exception!
      try { 
        ComparatorUtils.min((Object) comparator0, (Object) "", comparatorArray0[0]);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections4.comparators.BooleanComparator cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.collections4.comparators.ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Transformer<Object, Integer> transformer0 = (Transformer<Object, Integer>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      Comparator<Integer> comparator0 = ComparatorUtils.transformedComparator((Comparator<Integer>) null, (Transformer<? super Integer, ? extends Integer>) transformer0);
      assertNotNull(comparator0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Boolean>[] comparatorArray0 = (Comparator<Boolean>[]) Array.newInstance(Comparator.class, 5);
      Comparator<Boolean> comparator0 = ComparatorUtils.booleanComparator(true);
      comparatorArray0[0] = comparator0;
      Comparator<Boolean> comparator1 = ComparatorUtils.nullLowComparator(comparatorArray0[0]);
      assertFalse(comparator1.equals((Object)comparator0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Integer>[] comparatorArray0 = (Comparator<Integer>[]) Array.newInstance(Comparator.class, 2);
      Comparator<Integer> comparator0 = ComparatorUtils.naturalComparator();
      comparatorArray0[0] = comparator0;
      // Undeclared exception!
      try { 
        ComparatorUtils.chainedComparator(comparatorArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Comparator cannot be null
         //
         verifyException("org.apache.commons.collections4.ComparatorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Comparator<Object>> linkedList0 = new LinkedList<Comparator<Object>>();
      Comparator<Object> comparator0 = ComparatorUtils.chainedComparator((Collection<Comparator<Object>>) linkedList0);
      // Undeclared exception!
      try { 
        ComparatorUtils.max(comparator0, comparator0, (Comparator<Comparator<Object>>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections4.comparators.ComparatorChain cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.collections4.comparators.ComparableComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<String> comparator0 = ComparatorUtils.naturalComparator();
      Comparator<String> comparator1 = ComparatorUtils.reversedComparator(comparator0);
      Comparator<String>[] comparatorArray0 = (Comparator<String>[]) Array.newInstance(Comparator.class, 1);
      comparatorArray0[0] = comparator1;
      Comparator<String> comparator2 = ComparatorUtils.chainedComparator(comparatorArray0);
      assertFalse(comparator2.equals((Object)comparator0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Boolean> comparator0 = ComparatorUtils.booleanComparator(true);
      Comparator<Boolean> comparator1 = ComparatorUtils.nullHighComparator(comparator0);
      assertFalse(comparator1.equals((Object)comparator0));
  }
}
