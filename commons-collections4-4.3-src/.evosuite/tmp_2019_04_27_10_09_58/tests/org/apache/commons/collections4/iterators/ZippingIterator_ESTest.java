/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:13:45 GMT 2019
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.apache.commons.collections4.iterators.ZippingIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZippingIterator_ESTest extends ZippingIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Iterator<Object>[] iteratorArray0 = (Iterator<Object>[]) Array.newInstance(Iterator.class, 4);
      Integer integer0 = new Integer(3824);
      Integer integer1 = new Integer(385);
      Integer integer2 = new Integer(1983);
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false, true, true, true, true).when(iterator0).hasNext();
      doReturn(integer0, integer1, integer2, integer2, integer2).when(iterator0).next();
      ZippingIterator<Integer> zippingIterator0 = new ZippingIterator<Integer>(iterator0, iterator0);
      ZippingIterator<Object> zippingIterator1 = new ZippingIterator<Object>(zippingIterator0, zippingIterator0, zippingIterator0);
      iteratorArray0[0] = (Iterator<Object>) zippingIterator1;
      ZippingIterator<Object> zippingIterator2 = new ZippingIterator<Object>(zippingIterator1, zippingIterator0);
      iteratorArray0[1] = (Iterator<Object>) zippingIterator2;
      ZippingIterator<Object> zippingIterator3 = new ZippingIterator<Object>(iteratorArray0[1], iteratorArray0[1]);
      zippingIterator0.hasNext();
      zippingIterator3.hasNext();
      iteratorArray0[2] = (Iterator<Object>) zippingIterator3;
      ZippingIterator<Object> zippingIterator4 = new ZippingIterator<Object>(iteratorArray0[0], zippingIterator0, zippingIterator0);
      Consumer<Integer> consumer0 = (Consumer<Integer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      zippingIterator0.forEachRemaining(consumer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Iterator<Object>[] iteratorArray0 = (Iterator<Object>[]) Array.newInstance(Iterator.class, 4);
      Integer integer0 = new Integer(1);
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false).when(iterator0).hasNext();
      doReturn(integer0).when(iterator0).next();
      ZippingIterator<Integer> zippingIterator0 = new ZippingIterator<Integer>(iterator0, iterator0);
      ZippingIterator<Object> zippingIterator1 = new ZippingIterator<Object>(zippingIterator0, zippingIterator0, zippingIterator0);
      iteratorArray0[0] = (Iterator<Object>) zippingIterator1;
      ZippingIterator<Object> zippingIterator2 = new ZippingIterator<Object>(zippingIterator1, zippingIterator0);
      iteratorArray0[1] = (Iterator<Object>) zippingIterator2;
      ZippingIterator<Object> zippingIterator3 = new ZippingIterator<Object>(iteratorArray0[1], iteratorArray0[1]);
      iteratorArray0[2] = (Iterator<Object>) zippingIterator3;
      ZippingIterator<Object> zippingIterator4 = new ZippingIterator<Object>(iteratorArray0[0], zippingIterator0, zippingIterator0);
      Consumer<Integer> consumer0 = (Consumer<Integer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      zippingIterator0.forEachRemaining(consumer0);
      ZippingIterator<Object> zippingIterator5 = new ZippingIterator<Object>(zippingIterator4, iteratorArray0[1]);
      iteratorArray0[3] = (Iterator<Object>) zippingIterator5;
      ZippingIterator<Object> zippingIterator6 = new ZippingIterator<Object>(iteratorArray0);
      zippingIterator6.hasNext();
      zippingIterator0.remove();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Iterator<Object>[] iteratorArray0 = (Iterator<Object>[]) Array.newInstance(Iterator.class, 4);
      Integer integer0 = new Integer((-730));
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false, true, false).when(iterator0).hasNext();
      doReturn(integer0).when(iterator0).next();
      ZippingIterator<Integer> zippingIterator0 = new ZippingIterator<Integer>(iterator0, iterator0);
      ZippingIterator<Object> zippingIterator1 = new ZippingIterator<Object>(zippingIterator0, zippingIterator0, zippingIterator0);
      iteratorArray0[0] = (Iterator<Object>) zippingIterator1;
      ZippingIterator<Object> zippingIterator2 = new ZippingIterator<Object>(zippingIterator1, zippingIterator0);
      iteratorArray0[1] = (Iterator<Object>) zippingIterator2;
      ZippingIterator<Object> zippingIterator3 = new ZippingIterator<Object>(iteratorArray0[1], iteratorArray0[1]);
      iteratorArray0[2] = (Iterator<Object>) zippingIterator3;
      zippingIterator0.next();
      ZippingIterator<Object> zippingIterator4 = new ZippingIterator<Object>(iteratorArray0[0], zippingIterator0, zippingIterator0);
      ZippingIterator<Object> zippingIterator5 = new ZippingIterator<Object>(zippingIterator4, iteratorArray0[1]);
      iteratorArray0[3] = (Iterator<Object>) zippingIterator5;
      ZippingIterator<Object> zippingIterator6 = new ZippingIterator<Object>(iteratorArray0);
      boolean boolean0 = zippingIterator6.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      ZippingIterator<Integer> zippingIterator0 = new ZippingIterator<Integer>(iterator0, iterator0);
      ZippingIterator<Object> zippingIterator1 = new ZippingIterator<Object>(zippingIterator0, zippingIterator0, zippingIterator0);
      zippingIterator1.next();
      ZippingIterator<Object> zippingIterator2 = new ZippingIterator<Object>(zippingIterator1, zippingIterator0);
      assertFalse(zippingIterator2.equals((Object)zippingIterator1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Iterator<Object>[] iteratorArray0 = (Iterator<Object>[]) Array.newInstance(Iterator.class, 8);
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      ZippingIterator<Object> zippingIterator0 = new ZippingIterator<Object>(iterator0, iterator0, iterator0);
      ZippingIterator<Object> zippingIterator1 = new ZippingIterator<Object>(zippingIterator0, zippingIterator0);
      iteratorArray0[0] = (Iterator<Object>) zippingIterator1;
      Iterator<String> iterator1 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      Iterator<String> iterator2 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ZippingIterator<String> zippingIterator2 = new ZippingIterator<String>(iterator1, iterator2);
      ZippingIterator<Object> zippingIterator3 = new ZippingIterator<Object>(zippingIterator0, iteratorArray0[0], zippingIterator2);
      iteratorArray0[1] = (Iterator<Object>) zippingIterator3;
      ZippingIterator<Object> zippingIterator4 = new ZippingIterator<Object>(iteratorArray0[1], zippingIterator1, iteratorArray0[1]);
      iteratorArray0[2] = (Iterator<Object>) zippingIterator4;
      ZippingIterator<Object> zippingIterator5 = new ZippingIterator<Object>(zippingIterator1, zippingIterator2);
      iteratorArray0[3] = (Iterator<Object>) zippingIterator5;
      ZippingIterator<Object> zippingIterator6 = new ZippingIterator<Object>(iteratorArray0[0], iteratorArray0[0]);
      iteratorArray0[4] = (Iterator<Object>) zippingIterator6;
      ZippingIterator<Object> zippingIterator7 = new ZippingIterator<Object>(zippingIterator5, iteratorArray0[3]);
      iteratorArray0[5] = (Iterator<Object>) zippingIterator7;
      ZippingIterator<Object> zippingIterator8 = new ZippingIterator<Object>(iteratorArray0[5], zippingIterator6);
      iteratorArray0[6] = (Iterator<Object>) zippingIterator8;
      ZippingIterator<Object> zippingIterator9 = new ZippingIterator<Object>(iteratorArray0[6], zippingIterator6);
      iteratorArray0[7] = (Iterator<Object>) zippingIterator9;
      ZippingIterator<Object> zippingIterator10 = new ZippingIterator<Object>(iteratorArray0);
      Object object0 = zippingIterator10.next();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Iterator<Object>[] iteratorArray0 = (Iterator<Object>[]) Array.newInstance(Iterator.class, 4);
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(iterator0).hasNext();
      ZippingIterator<Integer> zippingIterator0 = new ZippingIterator<Integer>(iterator0, iterator0);
      ZippingIterator<Object> zippingIterator1 = new ZippingIterator<Object>(zippingIterator0, zippingIterator0, zippingIterator0);
      iteratorArray0[0] = (Iterator<Object>) zippingIterator1;
      ZippingIterator<Object> zippingIterator2 = new ZippingIterator<Object>(zippingIterator1, zippingIterator0);
      iteratorArray0[1] = (Iterator<Object>) zippingIterator2;
      ZippingIterator<Object> zippingIterator3 = new ZippingIterator<Object>(iteratorArray0[1], iteratorArray0[1]);
      iteratorArray0[2] = (Iterator<Object>) zippingIterator3;
      ZippingIterator<Object> zippingIterator4 = new ZippingIterator<Object>(iteratorArray0[0], zippingIterator0, zippingIterator0);
      ZippingIterator<Object> zippingIterator5 = new ZippingIterator<Object>(zippingIterator4, iteratorArray0[1]);
      iteratorArray0[3] = (Iterator<Object>) zippingIterator5;
      ZippingIterator<Object> zippingIterator6 = new ZippingIterator<Object>(iteratorArray0);
      boolean boolean0 = zippingIterator6.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Iterator<Integer>[] iteratorArray0 = (Iterator<Integer>[]) Array.newInstance(Iterator.class, 0);
      ZippingIterator<Integer> zippingIterator0 = new ZippingIterator<Integer>(iteratorArray0);
      zippingIterator0.hasNext();
      try { 
        zippingIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Iterator<Integer>[] iteratorArray0 = null;
      ZippingIterator<Integer> zippingIterator0 = null;
      try {
        zippingIterator0 = new ZippingIterator<Integer>((Iterator<? extends Integer>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Iterator<Object>[] iteratorArray0 = (Iterator<Object>[]) Array.newInstance(Iterator.class, 9);
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(iterator0).hasNext();
      ZippingIterator<Object> zippingIterator0 = new ZippingIterator<Object>(iterator0, iterator0);
      ZippingIterator<Object> zippingIterator1 = new ZippingIterator<Object>(zippingIterator0, zippingIterator0, zippingIterator0);
      iteratorArray0[0] = (Iterator<Object>) zippingIterator1;
      ZippingIterator<Object> zippingIterator2 = new ZippingIterator<Object>(zippingIterator0, iteratorArray0[0], iteratorArray0[0]);
      iteratorArray0[1] = (Iterator<Object>) zippingIterator2;
      ZippingIterator<Object> zippingIterator3 = new ZippingIterator<Object>(zippingIterator1, zippingIterator2);
      iteratorArray0[2] = (Iterator<Object>) zippingIterator3;
      ZippingIterator<Object> zippingIterator4 = new ZippingIterator<Object>(iteratorArray0[2], zippingIterator0);
      iteratorArray0[3] = (Iterator<Object>) zippingIterator4;
      ZippingIterator<Object> zippingIterator5 = new ZippingIterator<Object>(iteratorArray0[2], zippingIterator3);
      iteratorArray0[4] = (Iterator<Object>) zippingIterator5;
      ZippingIterator<Object> zippingIterator6 = new ZippingIterator<Object>(iteratorArray0[4], zippingIterator3, iteratorArray0[3]);
      iteratorArray0[5] = (Iterator<Object>) zippingIterator6;
      ZippingIterator<Object> zippingIterator7 = new ZippingIterator<Object>(zippingIterator1, zippingIterator0);
      ZippingIterator<Object> zippingIterator8 = new ZippingIterator<Object>(zippingIterator7, iteratorArray0[3], iteratorArray0[4]);
      iteratorArray0[6] = (Iterator<Object>) zippingIterator8;
      ZippingIterator<Object> zippingIterator9 = new ZippingIterator<Object>(zippingIterator1, iteratorArray0[0], iteratorArray0[2]);
      ZippingIterator<Object> zippingIterator10 = new ZippingIterator<Object>(zippingIterator3, zippingIterator9);
      zippingIterator0.hasNext();
      iteratorArray0[7] = (Iterator<Object>) zippingIterator10;
      ZippingIterator<Object> zippingIterator11 = new ZippingIterator<Object>(iteratorArray0[0], zippingIterator2);
      iteratorArray0[8] = (Iterator<Object>) zippingIterator11;
      ZippingIterator<Object> zippingIterator12 = new ZippingIterator<Object>(iteratorArray0);
      // Undeclared exception!
      try { 
        zippingIterator12.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No value can be removed at present
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Iterator<String>[] iteratorArray0 = (Iterator<String>[]) Array.newInstance(Iterator.class, 0);
      ZippingIterator<String> zippingIterator0 = new ZippingIterator<String>(iteratorArray0);
      // Undeclared exception!
      try { 
        zippingIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No value can be removed at present
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Iterator<String>[] iteratorArray0 = (Iterator<String>[]) Array.newInstance(Iterator.class, 0);
      ZippingIterator<String> zippingIterator0 = new ZippingIterator<String>(iteratorArray0);
      ZippingIterator<String> zippingIterator1 = new ZippingIterator<String>(zippingIterator0, zippingIterator0);
      ZippingIterator<String> zippingIterator2 = new ZippingIterator<String>(zippingIterator1, zippingIterator1, zippingIterator0);
      try { 
        zippingIterator2.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Iterator<Object>[] iteratorArray0 = (Iterator<Object>[]) Array.newInstance(Iterator.class, 0);
      ZippingIterator<Object> zippingIterator0 = new ZippingIterator<Object>(iteratorArray0);
      try { 
        zippingIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Iterator<String>[] iteratorArray0 = (Iterator<String>[]) Array.newInstance(Iterator.class, 0);
      ZippingIterator<String> zippingIterator0 = new ZippingIterator<String>(iteratorArray0);
      ZippingIterator<Object> zippingIterator1 = new ZippingIterator<Object>(zippingIterator0, zippingIterator0);
      ZippingIterator<Object> zippingIterator2 = new ZippingIterator<Object>(zippingIterator1, zippingIterator1, zippingIterator0);
      assertFalse(zippingIterator2.equals((Object)zippingIterator1));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Iterator<Integer> iterator0 = null;
      ZippingIterator<Integer> zippingIterator0 = null;
      try {
        zippingIterator0 = new ZippingIterator<Integer>((Iterator<? extends Integer>) null, (Iterator<? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Iterator must not be null.
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Iterator<String>[] iteratorArray0 = (Iterator<String>[]) Array.newInstance(Iterator.class, 5);
      Iterator<String> iterator0 = null;
      ZippingIterator<String> zippingIterator0 = null;
      try {
        zippingIterator0 = new ZippingIterator<String>((Iterator<? extends String>) null, (Iterator<? extends String>) null, (Iterator<? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Iterator must not be null.
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Iterator<String>[] iteratorArray0 = (Iterator<String>[]) Array.newInstance(Iterator.class, 8);
      ZippingIterator<String> zippingIterator0 = null;
      try {
        zippingIterator0 = new ZippingIterator<String>(iteratorArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Iterator must not be null.
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZippingIterator<Object> zippingIterator0 = null;
      try {
        zippingIterator0 = new ZippingIterator<Object>((Iterator<?>) null, (Iterator<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Iterator must not be null.
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Iterator<String>[] iteratorArray0 = (Iterator<String>[]) Array.newInstance(Iterator.class, 0);
      ZippingIterator<String> zippingIterator0 = new ZippingIterator<String>(iteratorArray0);
      try { 
        zippingIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZippingIterator<Object> zippingIterator0 = null;
      try {
        zippingIterator0 = new ZippingIterator<Object>((Iterator<?>) null, (Iterator<?>) null, (Iterator<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Iterator must not be null.
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ZippingIterator<Integer> zippingIterator0 = new ZippingIterator<Integer>(iterator0, iterator0);
      ZippingIterator<Object> zippingIterator1 = new ZippingIterator<Object>(zippingIterator0, zippingIterator0, zippingIterator0);
      // Undeclared exception!
      try { 
        zippingIterator1.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No value can be removed at present
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(iterator0).hasNext();
      ZippingIterator<Integer> zippingIterator0 = new ZippingIterator<Integer>(iterator0, iterator0);
      Consumer<Integer> consumer0 = (Consumer<Integer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      zippingIterator0.forEachRemaining(consumer0);
      // Undeclared exception!
      try { 
        zippingIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No value can be removed at present
         //
         verifyException("org.apache.commons.collections4.iterators.ZippingIterator", e);
      }
  }
}
