/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 03:41:03 GMT 2019
 */

package org.apache.commons.collections4.bag;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.SortedBag;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.bag.CollectionSortedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedSortedBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TransformedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.bag.UnmodifiableSortedBag;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.ExceptionTransformer;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.NOPTransformer;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.StringValueTransformer;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CollectionSortedBag_ESTest extends CollectionSortedBag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1101), 0, 1, 1, 0).when(comparator0).compare(anyString() , anyString());
      TreeBag<String> treeBag0 = new TreeBag<String>(comparator0);
      SynchronizedSortedBag<String> synchronizedSortedBag0 = new SynchronizedSortedBag<String>(treeBag0);
      synchronizedSortedBag0.add("~@Ib5\"h&");
      synchronizedSortedBag0.clear();
      CollectionSortedBag<String> collectionSortedBag0 = new CollectionSortedBag<String>(synchronizedSortedBag0);
      collectionSortedBag0.add("~@Ib5\"h&");
      collectionSortedBag0.removeAll(treeBag0);
      assertEquals(0, treeBag0.size());
      
      boolean boolean0 = collectionSortedBag0.remove((Object) "~@Ib5\"h&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      TreeBag<Closure<Integer>> treeBag0 = new TreeBag<Closure<Integer>>(comparator0);
      treeBag0.add((Closure<Integer>) null);
      SortedBag<Closure<Integer>> sortedBag0 = UnmodifiableSortedBag.unmodifiableSortedBag((SortedBag<Closure<Integer>>) treeBag0);
      SynchronizedSortedBag<Closure<Integer>> synchronizedSortedBag0 = SynchronizedSortedBag.synchronizedSortedBag(sortedBag0);
      CollectionSortedBag<Closure<Integer>> collectionSortedBag0 = new CollectionSortedBag<Closure<Integer>>(synchronizedSortedBag0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.removeAll(treeBag0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.UnmodifiableSortedBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1295)).when(comparator0).compare(any() , any());
      TreeBag<Transformer<InstanceofPredicate, String>> treeBag0 = new TreeBag<Transformer<InstanceofPredicate, String>>(comparator0);
      SynchronizedSortedBag<Transformer<InstanceofPredicate, String>> synchronizedSortedBag0 = SynchronizedSortedBag.synchronizedSortedBag((SortedBag<Transformer<InstanceofPredicate, String>>) treeBag0);
      Transformer<InstanceofPredicate, String> transformer0 = StringValueTransformer.stringValueTransformer();
      synchronizedSortedBag0.add(transformer0);
      CollectionSortedBag<Transformer<InstanceofPredicate, String>> collectionSortedBag0 = new CollectionSortedBag<Transformer<InstanceofPredicate, String>>(synchronizedSortedBag0);
      TreeBag<String> treeBag1 = new TreeBag<String>();
      CollectionSortedBag<String> collectionSortedBag1 = new CollectionSortedBag<String>(treeBag1);
      // Undeclared exception!
      try { 
        collectionSortedBag1.removeAll(collectionSortedBag0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TreeBag<Closure<String>> treeBag0 = new TreeBag<Closure<String>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<InstanceofPredicate> treeBag1 = new TreeBag<InstanceofPredicate>(comparator0);
      SynchronizedSortedBag<InstanceofPredicate> synchronizedSortedBag0 = SynchronizedSortedBag.synchronizedSortedBag((SortedBag<InstanceofPredicate>) treeBag1);
      SortedBag<InstanceofPredicate> sortedBag0 = UnmodifiableSortedBag.unmodifiableSortedBag((SortedBag<InstanceofPredicate>) synchronizedSortedBag0);
      CollectionSortedBag<InstanceofPredicate> collectionSortedBag0 = new CollectionSortedBag<InstanceofPredicate>(sortedBag0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.remove((Object) treeBag0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.UnmodifiableSortedBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeBag<Transformer<Object, String>> treeBag0 = new TreeBag<Transformer<Object, String>>((Comparator<? super Transformer<Object, String>>) null);
      CollectionSortedBag<Transformer<Object, String>> collectionSortedBag0 = new CollectionSortedBag<Transformer<Object, String>>(treeBag0);
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.remove((Object) instanceofPredicate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<InstanceofPredicate> comparator0 = (Comparator<InstanceofPredicate>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<InstanceofPredicate> treeBag0 = new TreeBag<InstanceofPredicate>(comparator0);
      Transformer<InstanceofPredicate, InstanceofPredicate> transformer0 = NOPTransformer.nopTransformer();
      TransformedSortedBag<InstanceofPredicate> transformedSortedBag0 = new TransformedSortedBag<InstanceofPredicate>(treeBag0, transformer0);
      CollectionSortedBag<InstanceofPredicate> collectionSortedBag0 = new CollectionSortedBag<InstanceofPredicate>(transformedSortedBag0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.containsAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.CollectionSortedBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        CollectionSortedBag.collectionSortedBag((SortedBag<LinkedList<Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<Object> treeBag0 = new TreeBag<Object>(comparator0);
      CollectionSortedBag<Object> collectionSortedBag0 = new CollectionSortedBag<Object>(treeBag0);
      HashBag<InstanceofPredicate> hashBag0 = new HashBag<InstanceofPredicate>();
      SynchronizedSortedBag<InstanceofPredicate> synchronizedSortedBag0 = new SynchronizedSortedBag<InstanceofPredicate>(hashBag0, collectionSortedBag0);
      CollectionSortedBag<InstanceofPredicate> collectionSortedBag1 = new CollectionSortedBag<InstanceofPredicate>(synchronizedSortedBag0);
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      collectionSortedBag1.add(instanceofPredicate0, 813);
      // Undeclared exception!
      try { 
        collectionSortedBag1.addAll(synchronizedSortedBag0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag$BagIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TreeBag<Object> treeBag0 = new TreeBag<Object>();
      CollectionSortedBag<Object> collectionSortedBag0 = new CollectionSortedBag<Object>(treeBag0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.addAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.CollectionSortedBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<InstanceofPredicate> comparator0 = (Comparator<InstanceofPredicate>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<InstanceofPredicate> treeBag0 = new TreeBag<InstanceofPredicate>(comparator0);
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      InvokerTransformer<Object, InstanceofPredicate> invokerTransformer0 = new InvokerTransformer<Object, InstanceofPredicate>("", classArray0, classArray0);
      TransformedSortedBag<InstanceofPredicate> transformedSortedBag0 = TransformedSortedBag.transformingSortedBag((SortedBag<InstanceofPredicate>) treeBag0, (Transformer<? super InstanceofPredicate, ? extends InstanceofPredicate>) invokerTransformer0);
      CollectionSortedBag<InstanceofPredicate> collectionSortedBag0 = new CollectionSortedBag<InstanceofPredicate>(transformedSortedBag0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.add(instanceofPredicate0, 1096);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // InvokerTransformer: The method '' on 'class org.apache.commons.collections4.functors.InstanceofPredicate' does not exist
         //
         verifyException("org.apache.commons.collections4.functors.InvokerTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      SynchronizedSortedBag<Integer> synchronizedSortedBag0 = SynchronizedSortedBag.synchronizedSortedBag((SortedBag<Integer>) treeBag0);
      SortedBag<Integer> sortedBag0 = UnmodifiableSortedBag.unmodifiableSortedBag((SortedBag<Integer>) synchronizedSortedBag0);
      Integer integer0 = new Integer((-1488));
      Transformer<Integer, Integer> transformer0 = ConstantTransformer.constantTransformer(integer0);
      TransformedSortedBag<Integer> transformedSortedBag0 = new TransformedSortedBag<Integer>(sortedBag0, transformer0);
      CollectionSortedBag<Integer> collectionSortedBag0 = new CollectionSortedBag<Integer>(transformedSortedBag0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.add((Integer) null, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.UnmodifiableSortedBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TreeBag<StringValueTransformer<Boolean>> treeBag0 = new TreeBag<StringValueTransformer<Boolean>>();
      CollectionSortedBag<StringValueTransformer<Boolean>> collectionSortedBag0 = new CollectionSortedBag<StringValueTransformer<Boolean>>(treeBag0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.add((StringValueTransformer<Boolean>) null, 1843);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TreeBag<Object> treeBag0 = new TreeBag<Object>();
      Predicate<Object> predicate0 = FalsePredicate.falsePredicate();
      PredicatedSortedBag<Object> predicatedSortedBag0 = new PredicatedSortedBag<Object>(treeBag0, predicate0);
      CollectionSortedBag<Object> collectionSortedBag0 = new CollectionSortedBag<Object>(predicatedSortedBag0);
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 7);
      NonePredicate<Object> nonePredicate0 = new NonePredicate<Object>(predicateArray0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.add((Object) nonePredicate0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add Object 'org.apache.commons.collections4.functors.NonePredicate@5' - Predicate 'org.apache.commons.collections4.functors.FalsePredicate@6' rejected it
         //
         verifyException("org.apache.commons.collections4.collection.PredicatedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TreeBag<Transformer<InstanceofPredicate, Integer>> treeBag0 = new TreeBag<Transformer<InstanceofPredicate, Integer>>();
      CollectionSortedBag<Transformer<InstanceofPredicate, Integer>> collectionSortedBag0 = new CollectionSortedBag<Transformer<InstanceofPredicate, Integer>>(treeBag0);
      Transformer<InstanceofPredicate, Integer> transformer0 = ExceptionTransformer.exceptionTransformer();
      // Undeclared exception!
      try { 
        collectionSortedBag0.add(transformer0, 1522);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Transformer> class0 = Transformer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      TreeBag<Transformer<Object, String>> treeBag0 = new TreeBag<Transformer<Object, String>>((Comparator<? super Transformer<Object, String>>) null);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 5);
      Transformer<Object, Transformer<Object, String>> transformer0 = InvokerTransformer.invokerTransformer("The parameter types must match the arguments", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedSortedBag<Transformer<Object, String>> transformedSortedBag0 = new TransformedSortedBag<Transformer<Object, String>>(treeBag0, transformer0);
      PredicatedSortedBag<Transformer<Object, String>> predicatedSortedBag0 = new PredicatedSortedBag<Transformer<Object, String>>(transformedSortedBag0, instanceofPredicate0);
      CollectionSortedBag<Transformer<Object, String>> collectionSortedBag0 = new CollectionSortedBag<Transformer<Object, String>>(predicatedSortedBag0);
      Transformer<Object, String> transformer1 = StringValueTransformer.stringValueTransformer();
      // Undeclared exception!
      try { 
        collectionSortedBag0.add(transformer1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // InvokerTransformer: The method 'The parameter types must match the arguments' on 'class org.apache.commons.collections4.functors.StringValueTransformer' does not exist
         //
         verifyException("org.apache.commons.collections4.functors.InvokerTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<Object> treeBag0 = new TreeBag<Object>(comparator0);
      SortedBag<Object> sortedBag0 = UnmodifiableSortedBag.unmodifiableSortedBag((SortedBag<Object>) treeBag0);
      CollectionSortedBag<Object> collectionSortedBag0 = new CollectionSortedBag<Object>(sortedBag0);
      Integer integer0 = new Integer(1301);
      ConstantTransformer<Object, Integer> constantTransformer0 = new ConstantTransformer<Object, Integer>(integer0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.add((Object) constantTransformer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.UnmodifiableSortedBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TreeBag<Boolean> treeBag0 = new TreeBag<Boolean>();
      CollectionSortedBag<Boolean> collectionSortedBag0 = new CollectionSortedBag<Boolean>(treeBag0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.add((Boolean) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<InstanceofPredicate> treeBag0 = new TreeBag<InstanceofPredicate>(comparator0);
      Class<InstanceofPredicate> class0 = InstanceofPredicate.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      TreeBag<Object> treeBag1 = new TreeBag<Object>(treeBag0);
      PredicatedSortedBag<Object> predicatedSortedBag0 = new PredicatedSortedBag<Object>(treeBag1, instanceofPredicate0);
      CollectionSortedBag<Object> collectionSortedBag0 = new CollectionSortedBag<Object>(predicatedSortedBag0);
      Predicate<InstanceofPredicate> predicate0 = UniquePredicate.uniquePredicate();
      // Undeclared exception!
      try { 
        collectionSortedBag0.add((Object) predicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add Object 'org.apache.commons.collections4.functors.UniquePredicate@8' - Predicate 'org.apache.commons.collections4.functors.InstanceofPredicate@2' rejected it
         //
         verifyException("org.apache.commons.collections4.collection.PredicatedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TreeBag<Predicate<Object>> treeBag0 = new TreeBag<Predicate<Object>>();
      CollectionSortedBag<Predicate<Object>> collectionSortedBag0 = new CollectionSortedBag<Predicate<Object>>(treeBag0);
      Predicate<Object> predicate0 = OnePredicate.onePredicate((Collection<? extends Predicate<? super Object>>) treeBag0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.add(predicate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CollectionSortedBag<String> collectionSortedBag0 = null;
      try {
        collectionSortedBag0 = new CollectionSortedBag<String>((SortedBag<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<Transformer<InstanceofPredicate, String>> treeBag0 = new TreeBag<Transformer<InstanceofPredicate, String>>(comparator0);
      SynchronizedSortedBag<Transformer<InstanceofPredicate, String>> synchronizedSortedBag0 = SynchronizedSortedBag.synchronizedSortedBag((SortedBag<Transformer<InstanceofPredicate, String>>) treeBag0);
      CollectionSortedBag<Transformer<InstanceofPredicate, String>> collectionSortedBag0 = new CollectionSortedBag<Transformer<InstanceofPredicate, String>>(synchronizedSortedBag0);
      TreeBag<String> treeBag1 = new TreeBag<String>();
      treeBag1.add("YfMx,i1lu");
      CollectionSortedBag<String> collectionSortedBag1 = new CollectionSortedBag<String>(treeBag1);
      boolean boolean0 = collectionSortedBag1.retainAll(collectionSortedBag0);
      assertFalse(collectionSortedBag1.contains("YfMx,i1lu"));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1295)).when(comparator0).compare(any() , any());
      TreeBag<Transformer<InstanceofPredicate, String>> treeBag0 = new TreeBag<Transformer<InstanceofPredicate, String>>(comparator0);
      SynchronizedSortedBag<Transformer<InstanceofPredicate, String>> synchronizedSortedBag0 = SynchronizedSortedBag.synchronizedSortedBag((SortedBag<Transformer<InstanceofPredicate, String>>) treeBag0);
      Transformer<InstanceofPredicate, String> transformer0 = StringValueTransformer.stringValueTransformer();
      synchronizedSortedBag0.add(transformer0);
      CollectionSortedBag<Transformer<InstanceofPredicate, String>> collectionSortedBag0 = new CollectionSortedBag<Transformer<InstanceofPredicate, String>>(synchronizedSortedBag0);
      boolean boolean0 = collectionSortedBag0.retainAll(treeBag0);
      assertFalse(treeBag0.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<Closure<Boolean>> treeBag0 = new TreeBag<Closure<Boolean>>(comparator0);
      CollectionSortedBag<Closure<Boolean>> collectionSortedBag0 = new CollectionSortedBag<Closure<Boolean>>(treeBag0);
      // Undeclared exception!
      try { 
        collectionSortedBag0.retainAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TreeBag<String> treeBag0 = new TreeBag<String>();
      CollectionSortedBag<String> collectionSortedBag0 = new CollectionSortedBag<String>(treeBag0);
      collectionSortedBag0.add("cT->");
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      TreeBag<Transformer<Object, String>> treeBag1 = new TreeBag<Transformer<Object, String>>(comparator0);
      CollectionSortedBag<Transformer<Object, String>> collectionSortedBag1 = new CollectionSortedBag<Transformer<Object, String>>(treeBag1);
      Transformer<Object, String> transformer0 = StringValueTransformer.stringValueTransformer();
      collectionSortedBag1.add(transformer0);
      boolean boolean0 = collectionSortedBag1.removeAll(collectionSortedBag0);
      assertEquals(1, treeBag0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2097), (-2097), (-2097)).when(comparator0).compare(any() , any());
      TreeBag<InstanceofPredicate> treeBag0 = new TreeBag<InstanceofPredicate>(comparator0);
      CollectionSortedBag<InstanceofPredicate> collectionSortedBag0 = new CollectionSortedBag<InstanceofPredicate>(treeBag0);
      Class<InstanceofPredicate> class0 = InstanceofPredicate.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      treeBag0.add(instanceofPredicate0);
      boolean boolean0 = collectionSortedBag0.addAll(treeBag0);
      assertEquals(2, treeBag0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<InstanceofPredicate> treeBag0 = new TreeBag<InstanceofPredicate>(comparator0);
      CollectionSortedBag<InstanceofPredicate> collectionSortedBag0 = new CollectionSortedBag<InstanceofPredicate>(treeBag0);
      boolean boolean0 = collectionSortedBag0.addAll(treeBag0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      TreeBag<LinkedList<Object>> treeBag0 = new TreeBag<LinkedList<Object>>(comparator0);
      CollectionSortedBag<LinkedList<Object>> collectionSortedBag0 = new CollectionSortedBag<LinkedList<Object>>(treeBag0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      collectionSortedBag0.add(linkedList0, 1298);
      boolean boolean0 = collectionSortedBag0.containsAll(treeBag0);
      assertEquals(1298, treeBag0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2078), (-2078)).when(comparator0).compare(any() , any());
      TreeBag<InstanceofPredicate> treeBag0 = new TreeBag<InstanceofPredicate>(comparator0);
      CollectionSortedBag<InstanceofPredicate> collectionSortedBag0 = new CollectionSortedBag<InstanceofPredicate>(treeBag0);
      Class<InstanceofPredicate> class0 = InstanceofPredicate.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      collectionSortedBag0.add(instanceofPredicate0, 26);
      boolean boolean0 = collectionSortedBag0.containsAll(treeBag0);
      assertEquals(26, treeBag0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<Transformer<Object, String>> treeBag0 = new TreeBag<Transformer<Object, String>>(comparator0);
      CollectionSortedBag<Transformer<Object, String>> collectionSortedBag0 = new CollectionSortedBag<Transformer<Object, String>>(treeBag0);
      boolean boolean0 = collectionSortedBag0.remove((Object) treeBag0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<Transformer<Object, String>> treeBag0 = new TreeBag<Transformer<Object, String>>(comparator0);
      Class<Object> class0 = Object.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      PredicatedSortedBag<Transformer<Object, String>> predicatedSortedBag0 = PredicatedSortedBag.predicatedSortedBag((SortedBag<Transformer<Object, String>>) treeBag0, (Predicate<? super Transformer<Object, String>>) predicate0);
      SortedBag<Transformer<Object, String>> sortedBag0 = CollectionSortedBag.collectionSortedBag((SortedBag<Transformer<Object, String>>) predicatedSortedBag0);
      assertEquals(0, sortedBag0.size());
  }
}
