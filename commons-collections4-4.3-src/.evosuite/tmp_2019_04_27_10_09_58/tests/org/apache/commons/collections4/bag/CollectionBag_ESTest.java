/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 03:44:09 GMT 2019
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
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.SortedBag;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.bag.CollectionBag;
import org.apache.commons.collections4.bag.CollectionSortedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedSortedBag;
import org.apache.commons.collections4.bag.SynchronizedBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TransformedBag;
import org.apache.commons.collections4.bag.TransformedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.bag.UnmodifiableSortedBag;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.NullIsTruePredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.StringValueTransformer;
import org.apache.commons.collections4.functors.TransformedPredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CollectionBag_ESTest extends CollectionBag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(comparator0);
      CollectionSortedBag<Integer> collectionSortedBag0 = new CollectionSortedBag<Integer>(treeBag0);
      CollectionBag<Integer> collectionBag0 = new CollectionBag<Integer>(collectionSortedBag0);
      Class<String> class0 = String.class;
      Integer integer0 = new Integer(0);
      collectionSortedBag0.add(integer0);
      boolean boolean0 = collectionBag0.remove((Object) class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<Transformer<Object, String>> comparator0 = (Comparator<Transformer<Object, String>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(nullable(org.apache.commons.collections4.Transformer.class) , nullable(org.apache.commons.collections4.Transformer.class));
      TreeBag<Transformer<Object, String>> treeBag0 = new TreeBag<Transformer<Object, String>>(comparator0);
      Transformer<Object, String> transformer0 = StringValueTransformer.stringValueTransformer();
      treeBag0.add(transformer0, 2027);
      CollectionBag<Transformer<Object, String>> collectionBag0 = new CollectionBag<Transformer<Object, String>>(treeBag0);
      // Undeclared exception!
      collectionBag0.retainAll(treeBag0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashBag<Predicate<String>> hashBag0 = new HashBag<Predicate<String>>();
      CollectionBag<Predicate<String>> collectionBag0 = new CollectionBag<Predicate<String>>(hashBag0);
      Predicate<String> predicate0 = NotNullPredicate.notNullPredicate();
      hashBag0.add(predicate0);
      NullIsTruePredicate<String> nullIsTruePredicate0 = new NullIsTruePredicate<String>((Predicate<? super String>) null);
      hashBag0.add((Predicate<String>) nullIsTruePredicate0);
      // Undeclared exception!
      try { 
        collectionBag0.removeAll(hashBag0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag$BagIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Predicate<Object> predicate0 = NullPredicate.nullPredicate();
      Transformer<Object, Predicate<Object>> transformer0 = ConstantTransformer.constantTransformer(predicate0);
      TreeBag<Object> treeBag0 = new TreeBag<Object>();
      SortedBag<Object> sortedBag0 = UnmodifiableSortedBag.unmodifiableSortedBag((SortedBag<Object>) treeBag0);
      CollectionBag<Object> collectionBag0 = new CollectionBag<Object>(sortedBag0);
      PredicateTransformer<Object> predicateTransformer0 = new PredicateTransformer<Object>(predicate0);
      Boolean boolean0 = predicateTransformer0.transform(transformer0);
      // Undeclared exception!
      try { 
        collectionBag0.remove((Object) boolean0);
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
      TreeBag<Transformer<String, Integer>> treeBag0 = new TreeBag<Transformer<String, Integer>>();
      CollectionBag<Transformer<String, Integer>> collectionBag0 = new CollectionBag<Transformer<String, Integer>>(treeBag0);
      // Undeclared exception!
      try { 
        collectionBag0.remove((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(linkedList0);
      CollectionBag<Integer> collectionBag0 = new CollectionBag<Integer>(treeBag0);
      // Undeclared exception!
      try { 
        collectionBag0.remove((Object) linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.LinkedList cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TreeBag<Object> treeBag0 = new TreeBag<Object>();
      Class<String> class0 = String.class;
      SynchronizedBag<Object> synchronizedBag0 = new SynchronizedBag<Object>(treeBag0, class0);
      CollectionBag<Object> collectionBag0 = new CollectionBag<Object>(synchronizedBag0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        collectionBag0.remove(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      CollectionBag<Integer> collectionBag0 = new CollectionBag<Integer>(treeBag0);
      // Undeclared exception!
      try { 
        collectionBag0.containsAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.CollectionBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        CollectionBag.collectionBag((Bag<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      TreeBag<Object> treeBag0 = new TreeBag<Object>(comparator0);
      CollectionSortedBag<Object> collectionSortedBag0 = new CollectionSortedBag<Object>(treeBag0);
      CollectionBag<Object> collectionBag0 = new CollectionBag<Object>(collectionSortedBag0);
      collectionBag0.add((Object) collectionSortedBag0, 44);
      // Undeclared exception!
      try { 
        collectionBag0.addAll(treeBag0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag$BagIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TreeBag<LinkedList<Object>> treeBag0 = new TreeBag<LinkedList<Object>>();
      CollectionBag<LinkedList<Object>> collectionBag0 = new CollectionBag<LinkedList<Object>>(treeBag0);
      // Undeclared exception!
      try { 
        collectionBag0.addAll((Collection<? extends LinkedList<Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.CollectionBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Transformer<Object, String>> comparator0 = (Comparator<Transformer<Object, String>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<Transformer<Object, String>> treeBag0 = new TreeBag<Transformer<Object, String>>(comparator0);
      SynchronizedSortedBag<Transformer<Object, String>> synchronizedSortedBag0 = new SynchronizedSortedBag<Transformer<Object, String>>(treeBag0);
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 3);
      Transformer<Transformer<Object, String>, Transformer<Object, String>> transformer0 = InvokerTransformer.invokerTransformer("", (Class<?>[]) classArray0, (Object[]) classArray0);
      Bag<Transformer<Object, String>> bag0 = TransformedBag.transformedBag((Bag<Transformer<Object, String>>) synchronizedSortedBag0, (Transformer<? super Transformer<Object, String>, ? extends Transformer<Object, String>>) transformer0);
      CollectionBag<Transformer<Object, String>> collectionBag0 = new CollectionBag<Transformer<Object, String>>(bag0);
      ConstantFactory<String> constantFactory0 = new ConstantFactory<String>((String) null);
      Transformer<Object, String> transformer1 = FactoryTransformer.factoryTransformer((Factory<? extends String>) constantFactory0);
      // Undeclared exception!
      try { 
        collectionBag0.add(transformer1, 65);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // InvokerTransformer: The method '' on 'class org.apache.commons.collections4.functors.FactoryTransformer' does not exist
         //
         verifyException("org.apache.commons.collections4.functors.InvokerTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(0);
      TreeBag<LinkedList<Integer>> treeBag0 = new TreeBag<LinkedList<Integer>>();
      SortedBag<LinkedList<Integer>> sortedBag0 = UnmodifiableSortedBag.unmodifiableSortedBag((SortedBag<LinkedList<Integer>>) treeBag0);
      Transformer<Object, Integer> transformer0 = ConstantTransformer.constantTransformer(integer0);
      Predicate<Object> predicate0 = NotNullPredicate.notNullPredicate();
      TransformedPredicate<Object> transformedPredicate0 = new TransformedPredicate<Object>(transformer0, predicate0);
      PredicatedSortedBag<LinkedList<Integer>> predicatedSortedBag0 = PredicatedSortedBag.predicatedSortedBag(sortedBag0, (Predicate<? super LinkedList<Integer>>) transformedPredicate0);
      CollectionBag<LinkedList<Integer>> collectionBag0 = new CollectionBag<LinkedList<Integer>>(predicatedSortedBag0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        collectionBag0.add(linkedList0, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.UnmodifiableSortedBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("", classArray0, classArray0);
      TransformedSortedBag<Integer> transformedSortedBag0 = TransformedSortedBag.transformingSortedBag((SortedBag<Integer>) treeBag0, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0);
      CollectionBag<Integer> collectionBag0 = new CollectionBag<Integer>(transformedSortedBag0);
      Integer integer0 = new Integer(592);
      // Undeclared exception!
      try { 
        collectionBag0.add(integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // InvokerTransformer: The method '' on 'class java.lang.Integer' does not exist
         //
         verifyException("org.apache.commons.collections4.functors.InvokerTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<LinkedList<Transformer<Object, String>>> treeBag0 = new TreeBag<LinkedList<Transformer<Object, String>>>(comparator0);
      SortedBag<LinkedList<Transformer<Object, String>>> sortedBag0 = UnmodifiableSortedBag.unmodifiableSortedBag((SortedBag<LinkedList<Transformer<Object, String>>>) treeBag0);
      CollectionBag<LinkedList<Transformer<Object, String>>> collectionBag0 = new CollectionBag<LinkedList<Transformer<Object, String>>>(sortedBag0);
      // Undeclared exception!
      try { 
        collectionBag0.add((LinkedList<Transformer<Object, String>>) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.UnmodifiableSortedBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      Transformer<Object, Integer> transformer0 = ConstantTransformer.nullTransformer();
      TransformedSortedBag<Integer> transformedSortedBag0 = new TransformedSortedBag<Integer>(treeBag0, transformer0);
      CollectionBag<Integer> collectionBag0 = new CollectionBag<Integer>(transformedSortedBag0);
      Integer integer0 = new Integer(91);
      // Undeclared exception!
      try { 
        collectionBag0.add(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<String> treeBag0 = new TreeBag<String>(comparator0);
      TreeBag<Object> treeBag1 = new TreeBag<Object>(treeBag0);
      CollectionBag<Object> collectionBag0 = new CollectionBag<Object>(treeBag1);
      // Undeclared exception!
      try { 
        collectionBag0.add((Object) treeBag0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections4.bag.TreeBag cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TreeBag<Object> treeBag0 = new TreeBag<Object>((Comparator<? super Object>) null);
      CollectionSortedBag<Object> collectionSortedBag0 = new CollectionSortedBag<Object>(treeBag0);
      SynchronizedSortedBag<Object> synchronizedSortedBag0 = SynchronizedSortedBag.synchronizedSortedBag((SortedBag<Object>) collectionSortedBag0);
      CollectionBag<Object> collectionBag0 = new CollectionBag<Object>(synchronizedSortedBag0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        collectionBag0.add(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CollectionBag<Predicate<Transformer<Object, String>>> collectionBag0 = null;
      try {
        collectionBag0 = new CollectionBag<Predicate<Transformer<Object, String>>>((Bag<Predicate<Transformer<Object, String>>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashBag<String> hashBag0 = new HashBag<String>();
      CollectionBag<String> collectionBag0 = new CollectionBag<String>(hashBag0);
      hashBag0.add("");
      boolean boolean0 = collectionBag0.retainAll(hashBag0);
      assertEquals(1, hashBag0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TreeBag<String> treeBag0 = new TreeBag<String>();
      CollectionBag<String> collectionBag0 = new CollectionBag<String>(treeBag0);
      // Undeclared exception!
      try { 
        collectionBag0.retainAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      Integer integer0 = new Integer(0);
      hashBag0.add(integer0);
      CollectionBag<Integer> collectionBag0 = new CollectionBag<Integer>(hashBag0);
      boolean boolean0 = collectionBag0.removeAll(hashBag0);
      assertFalse(collectionBag0.contains(0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashBag<String> hashBag0 = new HashBag<String>();
      CollectionBag<String> collectionBag0 = new CollectionBag<String>(hashBag0);
      hashBag0.add("");
      HashBag<Predicate<Object>> hashBag1 = new HashBag<Predicate<Object>>();
      SynchronizedSortedBag<Predicate<Object>> synchronizedSortedBag0 = new SynchronizedSortedBag<Predicate<Object>>(hashBag1, collectionBag0);
      CollectionBag<Predicate<Object>> collectionBag1 = new CollectionBag<Predicate<Object>>(synchronizedSortedBag0);
      SynchronizedBag<String> synchronizedBag0 = new SynchronizedBag<String>(collectionBag0);
      boolean boolean0 = collectionBag1.removeAll(synchronizedBag0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TreeBag<Transformer<Object, String>> treeBag0 = new TreeBag<Transformer<Object, String>>();
      CollectionBag<Transformer<Object, String>> collectionBag0 = new CollectionBag<Transformer<Object, String>>(treeBag0);
      TreeBag<Object> treeBag1 = new TreeBag<Object>(collectionBag0);
      CollectionBag<Object> collectionBag1 = new CollectionBag<Object>(treeBag1);
      boolean boolean0 = collectionBag1.removeAll((Collection<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(comparator0);
      CollectionSortedBag<Integer> collectionSortedBag0 = new CollectionSortedBag<Integer>(treeBag0);
      CollectionBag<Integer> collectionBag0 = new CollectionBag<Integer>(collectionSortedBag0);
      Integer integer0 = new Integer(0);
      collectionSortedBag0.add(integer0);
      boolean boolean0 = collectionBag0.addAll(treeBag0);
      assertEquals(2, treeBag0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(comparator0);
      CollectionSortedBag<Integer> collectionSortedBag0 = new CollectionSortedBag<Integer>(treeBag0);
      CollectionBag<Integer> collectionBag0 = new CollectionBag<Integer>(collectionSortedBag0);
      boolean boolean0 = collectionBag0.addAll(treeBag0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashBag<String> hashBag0 = new HashBag<String>();
      CollectionBag<String> collectionBag0 = new CollectionBag<String>(hashBag0);
      hashBag0.add("");
      TreeBag<Object> treeBag0 = new TreeBag<Object>((Comparator<? super Object>) null);
      CollectionSortedBag<Object> collectionSortedBag0 = new CollectionSortedBag<Object>(treeBag0);
      SynchronizedSortedBag<Object> synchronizedSortedBag0 = SynchronizedSortedBag.synchronizedSortedBag((SortedBag<Object>) collectionSortedBag0);
      CollectionBag<Object> collectionBag1 = new CollectionBag<Object>(synchronizedSortedBag0);
      boolean boolean0 = collectionBag1.containsAll(collectionBag0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(comparator0);
      CollectionSortedBag<Integer> collectionSortedBag0 = new CollectionSortedBag<Integer>(treeBag0);
      CollectionBag<Integer> collectionBag0 = new CollectionBag<Integer>(collectionSortedBag0);
      Integer integer0 = new Integer(0);
      collectionSortedBag0.add(integer0);
      boolean boolean0 = collectionBag0.containsAll(treeBag0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TreeBag<Predicate<Object>> treeBag0 = new TreeBag<Predicate<Object>>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 5);
      InvokerTransformer<Object, Predicate<Object>> invokerTransformer0 = new InvokerTransformer<Object, Predicate<Object>>("-Vm;A<`p[f=1a@X6", classArray0, classArray0);
      TransformedSortedBag<Predicate<Object>> transformedSortedBag0 = new TransformedSortedBag<Predicate<Object>>(treeBag0, invokerTransformer0);
      SynchronizedSortedBag<Predicate<Object>> synchronizedSortedBag0 = SynchronizedSortedBag.synchronizedSortedBag((SortedBag<Predicate<Object>>) transformedSortedBag0);
      Bag<Predicate<Object>> bag0 = CollectionBag.collectionBag((Bag<Predicate<Object>>) synchronizedSortedBag0);
      assertEquals(0, bag0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(comparator0);
      CollectionSortedBag<Integer> collectionSortedBag0 = new CollectionSortedBag<Integer>(treeBag0);
      CollectionBag<Integer> collectionBag0 = new CollectionBag<Integer>(collectionSortedBag0);
      Class<String> class0 = String.class;
      boolean boolean0 = collectionBag0.remove((Object) class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      TreeBag<LinkedList<Transformer<Object, String>>> treeBag0 = new TreeBag<LinkedList<Transformer<Object, String>>>(comparator0);
      CollectionBag<LinkedList<Transformer<Object, String>>> collectionBag0 = new CollectionBag<LinkedList<Transformer<Object, String>>>(treeBag0);
      boolean boolean0 = collectionBag0.add((LinkedList<Transformer<Object, String>>) null);
      assertEquals(1, treeBag0.size());
      assertTrue(boolean0);
  }
}
