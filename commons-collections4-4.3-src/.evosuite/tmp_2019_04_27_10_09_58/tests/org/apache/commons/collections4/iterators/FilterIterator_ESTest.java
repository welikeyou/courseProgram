/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:12:20 GMT 2019
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.NotPredicate;
import org.apache.commons.collections4.functors.NullIsTruePredicate;
import org.apache.commons.collections4.functors.OrPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.iterators.FilterIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FilterIterator_ESTest extends FilterIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("");
      Iterator<String> iterator0 = linkedList0.iterator();
      Predicate<Object> predicate0 = TruePredicate.truePredicate();
      FilterIterator<Object> filterIterator0 = new FilterIterator<Object>(iterator0, predicate0);
      boolean boolean0 = filterIterator0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      Predicate<Object> predicate0 = NonePredicate.nonePredicate((Collection<? extends Predicate<? super Object>>) linkedList0);
      NotPredicate<Object> notPredicate0 = new NotPredicate<Object>(predicate0);
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      linkedList0.offerLast(instanceofPredicate0);
      ListIterator<InstanceofPredicate> listIterator0 = linkedList0.listIterator(1);
      FilterIterator<Predicate<Object>> filterIterator0 = new FilterIterator<Predicate<Object>>(listIterator0, notPredicate0);
      Predicate<? super Predicate<Object>> predicate1 = filterIterator0.getPredicate();
      assertNotNull(predicate1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FilterIterator<Boolean> filterIterator0 = new FilterIterator<Boolean>();
      Iterator<? extends Boolean> iterator0 = filterIterator0.getIterator();
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Iterator<String> iterator0 = linkedList0.descendingIterator();
      FilterIterator<String> filterIterator0 = new FilterIterator<String>(iterator0);
      linkedList0.addLast("org.apache.commons.collections4.iterators.FilterIterator");
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      EqualPredicate<Object> equalPredicate0 = new EqualPredicate<Object>(listIterator0);
      NullIsTruePredicate<Object> nullIsTruePredicate0 = new NullIsTruePredicate<Object>(equalPredicate0);
      Predicate<String> predicate0 = OrPredicate.orPredicate((Predicate<? super String>) nullIsTruePredicate0, (Predicate<? super String>) equalPredicate0);
      FilterIterator<String> filterIterator0 = new FilterIterator<String>(listIterator0, predicate0);
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      FilterIterator<String> filterIterator0 = new FilterIterator<String>(listIterator0);
      LinkedList<InstanceofPredicate> linkedList1 = new LinkedList<InstanceofPredicate>();
      Predicate<Object> predicate0 = NonePredicate.nonePredicate((Collection<? extends Predicate<? super Object>>) linkedList1);
      linkedList0.add("AUf%5#k[iEtr-,D");
      NotPredicate<Object> notPredicate0 = new NotPredicate<Object>(predicate0);
      FilterIterator<Object> filterIterator1 = new FilterIterator<Object>(filterIterator0, notPredicate0);
      // Undeclared exception!
      try { 
        filterIterator1.next();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FilterIterator<InstanceofPredicate> filterIterator0 = new FilterIterator<InstanceofPredicate>((Iterator<? extends InstanceofPredicate>) null);
      // Undeclared exception!
      try { 
        filterIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      Iterator<String> iterator0 = linkedList0.iterator();
      Predicate<Object> predicate0 = ExceptionPredicate.exceptionPredicate();
      FilterIterator<String> filterIterator0 = new FilterIterator<String>(iterator0, predicate0);
      // Undeclared exception!
      try { 
        filterIterator0.hasNext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionPredicate invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      FilterIterator<String> filterIterator0 = new FilterIterator<String>(listIterator0);
      linkedList0.add("");
      // Undeclared exception!
      try { 
        filterIterator0.hasNext();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FilterIterator<Integer> filterIterator0 = new FilterIterator<Integer>();
      // Undeclared exception!
      try { 
        filterIterator0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("");
      Iterator<String> iterator0 = linkedList0.descendingIterator();
      UniquePredicate<Object> uniquePredicate0 = new UniquePredicate<Object>();
      Predicate<Object> predicate0 = AndPredicate.andPredicate((Predicate<? super Object>) uniquePredicate0, (Predicate<? super Object>) uniquePredicate0);
      FilterIterator<Object> filterIterator0 = new FilterIterator<Object>(iterator0, predicate0);
      // Undeclared exception!
      try { 
        filterIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FilterIterator<String> filterIterator0 = new FilterIterator<String>();
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("");
      Iterator<String> iterator0 = linkedList0.descendingIterator();
      Predicate<Object> predicate0 = TruePredicate.truePredicate();
      FilterIterator<Object> filterIterator0 = new FilterIterator<Object>(iterator0, predicate0);
      filterIterator0.next();
      filterIterator0.remove();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      FilterIterator<String> filterIterator0 = new FilterIterator<String>(listIterator0);
      LinkedList<InstanceofPredicate> linkedList1 = new LinkedList<InstanceofPredicate>();
      Predicate<Object> predicate0 = NonePredicate.nonePredicate((Collection<? extends Predicate<? super Object>>) linkedList1);
      NotPredicate<Object> notPredicate0 = new NotPredicate<Object>(predicate0);
      FilterIterator<Object> filterIterator1 = new FilterIterator<Object>(filterIterator0, notPredicate0);
      // Undeclared exception!
      try { 
        filterIterator1.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FilterIterator<InstanceofPredicate> filterIterator0 = new FilterIterator<InstanceofPredicate>();
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      linkedList0.add(instanceofPredicate0);
      Iterator<InstanceofPredicate> iterator0 = linkedList0.descendingIterator();
      filterIterator0.setIterator(iterator0);
      Predicate<Object> predicate0 = TruePredicate.truePredicate();
      filterIterator0.setPredicate(predicate0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      filterIterator0.forEachRemaining(consumer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      FilterIterator<String> filterIterator0 = new FilterIterator<String>(listIterator0);
      boolean boolean0 = filterIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FilterIterator<Integer> filterIterator0 = new FilterIterator<Integer>((Iterator<? extends Integer>) null);
      FilterIterator<Object> filterIterator1 = new FilterIterator<Object>(filterIterator0);
      Iterator<?> iterator0 = filterIterator1.getIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FilterIterator<String> filterIterator0 = new FilterIterator<String>();
      Predicate<? super String> predicate0 = filterIterator0.getPredicate();
      assertNull(predicate0);
  }
}
