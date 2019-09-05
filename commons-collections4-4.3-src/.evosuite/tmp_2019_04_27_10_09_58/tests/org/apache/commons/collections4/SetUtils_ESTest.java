/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 03:29:38 GMT 2019
 */

package org.apache.commons.collections4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.collections4.ClosureUtilsTest;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.SetUtils;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.NotPredicate;
import org.apache.commons.collections4.functors.NullIsExceptionPredicate;
import org.apache.commons.collections4.functors.NullIsTruePredicate;
import org.apache.commons.collections4.functors.TransformedPredicate;
import org.apache.commons.collections4.functors.TransformerPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.set.UnmodifiableSortedSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SetUtils_ESTest extends SetUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<InstanceofPredicate> comparator0 = (Comparator<InstanceofPredicate>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<InstanceofPredicate> treeSet0 = new TreeSet<InstanceofPredicate>(comparator0);
      SetUtils.SetView<InstanceofPredicate> setUtils_SetView0 = SetUtils.difference((Set<? extends InstanceofPredicate>) treeSet0, (Set<? extends InstanceofPredicate>) treeSet0);
      SetUtils.SetView<InstanceofPredicate> setUtils_SetView1 = SetUtils.difference((Set<? extends InstanceofPredicate>) treeSet0, (Set<? extends InstanceofPredicate>) treeSet0);
      SetUtils.SetView<Object> setUtils_SetView2 = SetUtils.union((Set<?>) setUtils_SetView1, (Set<?>) setUtils_SetView0);
      assertNotNull(setUtils_SetView2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Set<Object> set0 = SetUtils.unmodifiableSet(objectArray0);
      SortedSet<InstanceofPredicate> sortedSet0 = SetUtils.emptySortedSet();
      boolean boolean0 = SetUtils.isEqualSet(set0, sortedSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Set<Object> set0 = SetUtils.unmodifiableSet(objectArray0);
      SetUtils.SetView<Object> setUtils_SetView0 = SetUtils.disjunction((Set<?>) set0, (Set<?>) set0);
      SortedSet<Integer> sortedSet0 = SetUtils.emptySortedSet();
      SetUtils.SetView<Object> setUtils_SetView1 = SetUtils.intersection((Set<?>) setUtils_SetView0, (Set<?>) sortedSet0);
      assertTrue(setUtils_SetView1.equals((Object)setUtils_SetView0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Predicate<Object> predicate0 = ExceptionPredicate.exceptionPredicate();
      TreeSet<InstanceofPredicate> treeSet0 = new TreeSet<InstanceofPredicate>();
      Set<Predicate<Object>> set0 = SetUtils.unmodifiableSet((Set<? extends Predicate<Object>>) treeSet0);
      Set<Predicate<Object>> set1 = SetUtils.predicatedSet(set0, (Predicate<? super Predicate<Object>>) predicate0);
      assertTrue(set1.equals((Object)set0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<InstanceofPredicate> comparator0 = (Comparator<InstanceofPredicate>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<InstanceofPredicate> treeSet0 = new TreeSet<InstanceofPredicate>(comparator0);
      SetUtils.SetView<InstanceofPredicate> setUtils_SetView0 = SetUtils.difference((Set<? extends InstanceofPredicate>) treeSet0, (Set<? extends InstanceofPredicate>) treeSet0);
      Iterator<InstanceofPredicate> iterator0 = setUtils_SetView0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Set<Integer> set0 = SetUtils.newIdentityHashSet();
      SetUtils.SetView<Object> setUtils_SetView0 = SetUtils.disjunction((Set<?>) set0, (Set<?>) set0);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      setUtils_SetView0.copyInto(linkedHashSet0);
      assertTrue(linkedHashSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      HashSet<Object> hashSet0 = SetUtils.hashSet(objectArray0);
      assertTrue(hashSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Set<String> set0 = SetUtils.emptyIfNull((Set<String>) linkedHashSet0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        SetUtils.unmodifiableSortedSet((SortedSet<Integer>) null);
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
      LinkedHashSet<Object>[] linkedHashSetArray0 = (LinkedHashSet<Object>[]) Array.newInstance(LinkedHashSet.class, 5);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      linkedHashSetArray0[0] = linkedHashSet0;
      linkedHashSet0.add(linkedHashSet0);
      // Undeclared exception!
      try { 
        SetUtils.unmodifiableSet(linkedHashSetArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        SetUtils.unmodifiableSet((Set<? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        SetUtils.unmodifiableNavigableSet((NavigableSet<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClosureUtilsTest.MockTransformer<Integer> closureUtilsTest_MockTransformer0 = new ClosureUtilsTest.MockTransformer<Integer>();
      // Undeclared exception!
      try { 
        SetUtils.transformedSortedSet((SortedSet<Integer>) null, (Transformer<? super Integer, ? extends Integer>) closureUtilsTest_MockTransformer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InstanceofPredicate[] instanceofPredicateArray0 = new InstanceofPredicate[5];
      Set<InstanceofPredicate> set0 = SetUtils.unmodifiableSet(instanceofPredicateArray0);
      // Undeclared exception!
      try { 
        SetUtils.transformedSet(set0, (Transformer<? super InstanceofPredicate, ? extends InstanceofPredicate>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Transformer must not be null
         //
         verifyException("org.apache.commons.collections4.collection.TransformedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        SetUtils.transformedNavigableSet((NavigableSet<Object>) null, (Transformer<? super Object, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        SetUtils.synchronizedSortedSet((SortedSet<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        SetUtils.synchronizedSet((Set<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("org.apache.commons.collections4.set.AbstractSortedSetDecorator");
      Transformer<Object, Boolean> transformer0 = (Transformer<Object, Boolean>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(transformer0).transform(any());
      Predicate<Object> predicate0 = TransformerPredicate.transformerPredicate((Transformer<? super Object, Boolean>) transformer0);
      // Undeclared exception!
      try { 
        SetUtils.predicatedSortedSet((SortedSet<String>) treeSet0, (Predicate<? super String>) predicate0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Transformer must return an instanceof Boolean, it was a null object
         //
         verifyException("org.apache.commons.collections4.functors.TransformerPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      // Undeclared exception!
      try { 
        SetUtils.predicatedSortedSet((SortedSet<Object>) treeSet0, (Predicate<? super Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.PredicatedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("F $P");
      Class<Integer> class0 = Integer.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      // Undeclared exception!
      try { 
        SetUtils.predicatedSortedSet((SortedSet<String>) treeSet0, (Predicate<? super String>) predicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add Object 'F $P' - Predicate 'org.apache.commons.collections4.functors.InstanceofPredicate@1' rejected it
         //
         verifyException("org.apache.commons.collections4.collection.PredicatedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer[] integerArray0 = new Integer[7];
      HashSet<Integer> hashSet0 = SetUtils.hashSet(integerArray0);
      Predicate<Object> predicate0 = ExceptionPredicate.exceptionPredicate();
      NullIsExceptionPredicate<Object> nullIsExceptionPredicate0 = new NullIsExceptionPredicate<Object>(predicate0);
      // Undeclared exception!
      try { 
        SetUtils.predicatedSet((Set<Integer>) hashSet0, (Predicate<? super Integer>) nullIsExceptionPredicate0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Input Object must not be null
         //
         verifyException("org.apache.commons.collections4.functors.NullIsExceptionPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Predicate<Object> predicate0 = FalsePredicate.falsePredicate();
      NotPredicate<Object> notPredicate0 = new NotPredicate<Object>(predicate0);
      NullIsTruePredicate<Object> nullIsTruePredicate0 = new NullIsTruePredicate<Object>(notPredicate0);
      // Undeclared exception!
      try { 
        SetUtils.predicatedSet((Set<String>) null, (Predicate<? super String>) nullIsTruePredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashSet<Object>[] linkedHashSetArray0 = (LinkedHashSet<Object>[]) Array.newInstance(LinkedHashSet.class, 4);
      HashSet<LinkedHashSet<Object>> hashSet0 = SetUtils.hashSet(linkedHashSetArray0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(comparator0).compare(any() , any());
      Predicate<Object> predicate0 = ComparatorPredicate.comparatorPredicate((Object) linkedHashSetArray0[2], comparator0);
      // Undeclared exception!
      try { 
        SetUtils.predicatedSet((Set<LinkedHashSet<Object>>) hashSet0, (Predicate<? super LinkedHashSet<Object>>) predicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add Object 'null' - Predicate 'org.apache.commons.collections4.functors.ComparatorPredicate@1' rejected it
         //
         verifyException("org.apache.commons.collections4.collection.PredicatedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      Transformer<Object, Boolean> transformer0 = (Transformer<Object, Boolean>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(transformer0).transform(any());
      Predicate<Object> predicate0 = TransformerPredicate.transformerPredicate((Transformer<? super Object, Boolean>) transformer0);
      Integer integer0 = new Integer(2221);
      treeSet0.add(integer0);
      // Undeclared exception!
      try { 
        SetUtils.predicatedNavigableSet((NavigableSet<Integer>) treeSet0, (Predicate<? super Integer>) predicate0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Transformer must return an instanceof Boolean, it was a null object
         //
         verifyException("org.apache.commons.collections4.functors.TransformerPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("w*T'WLP 5d!8");
      TransformerPredicate<Object> transformerPredicate0 = new TransformerPredicate<Object>((Transformer<? super Object, Boolean>) null);
      // Undeclared exception!
      try { 
        SetUtils.predicatedNavigableSet((NavigableSet<String>) treeSet0, (Predicate<? super String>) transformerPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.TransformerPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Predicate<Object> predicate0 = NotNullPredicate.notNullPredicate();
      // Undeclared exception!
      try { 
        SetUtils.predicatedNavigableSet((NavigableSet<InstanceofPredicate>) null, (Predicate<? super InstanceofPredicate>) predicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      TreeSet<String> treeSet0 = new TreeSet<String>(comparator0);
      EqualPredicate<String> equalPredicate0 = new EqualPredicate<String>("NxAl=aoUK@JO1V");
      treeSet0.add("E#d+2");
      // Undeclared exception!
      try { 
        SetUtils.predicatedNavigableSet((NavigableSet<String>) treeSet0, (Predicate<? super String>) equalPredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add Object 'E#d+2' - Predicate 'org.apache.commons.collections4.functors.EqualPredicate@1' rejected it
         //
         verifyException("org.apache.commons.collections4.collection.PredicatedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        SetUtils.orderedSet((Set<InstanceofPredicate>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Set<String> set0 = SetUtils.unmodifiableSet((String[]) null);
      assertNull(set0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("olleH");
      SetUtils.SetView<String> setUtils_SetView0 = SetUtils.union((Set<? extends String>) linkedHashSet0, (Set<? extends String>) linkedHashSet0);
      boolean boolean0 = setUtils_SetView0.contains("olleH");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      SetUtils.SetView<String> setUtils_SetView0 = SetUtils.union((Set<? extends String>) linkedHashSet0, (Set<? extends String>) linkedHashSet0);
      boolean boolean0 = setUtils_SetView0.contains("olleH");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Set<Integer> set0 = SetUtils.emptySet();
      SetUtils.SetView<Integer> setUtils_SetView0 = SetUtils.difference((Set<? extends Integer>) set0, (Set<? extends Integer>) set0);
      // Undeclared exception!
      try { 
        SetUtils.union((Set<? extends Integer>) setUtils_SetView0, (Set<? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Sets must not be null.
         //
         verifyException("org.apache.commons.collections4.SetUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        SetUtils.union((Set<? extends Integer>) null, (Set<? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Sets must not be null.
         //
         verifyException("org.apache.commons.collections4.SetUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Set<Object> set0 = SetUtils.newIdentityHashSet();
      Set<Object> set1 = SetUtils.orderedSet(set0);
      boolean boolean0 = SetUtils.isEqualSet(set0, set1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Set<Object> set0 = SetUtils.emptyIfNull((Set<Object>) null);
      boolean boolean0 = SetUtils.isEqualSet((Collection<?>) null, set0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Set<Object> set0 = SetUtils.newIdentityHashSet();
      boolean boolean0 = SetUtils.isEqualSet(set0, set0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      SetUtils.SetView<String> setUtils_SetView0 = SetUtils.union((Set<? extends String>) linkedHashSet0, (Set<? extends String>) linkedHashSet0);
      InstanceofPredicate[] instanceofPredicateArray0 = new InstanceofPredicate[6];
      Set<InstanceofPredicate> set0 = SetUtils.unmodifiableSet(instanceofPredicateArray0);
      boolean boolean0 = SetUtils.isEqualSet(setUtils_SetView0, set0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("");
      SetUtils.SetView<Object> setUtils_SetView0 = SetUtils.intersection((Set<?>) treeSet0, (Set<?>) treeSet0);
      boolean boolean0 = setUtils_SetView0.contains("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      SetUtils.SetView<Object> setUtils_SetView0 = SetUtils.intersection((Set<?>) treeSet0, (Set<?>) treeSet0);
      boolean boolean0 = setUtils_SetView0.contains("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("");
      SetUtils.SetView<Object> setUtils_SetView0 = SetUtils.intersection((Set<?>) treeSet0, (Set<?>) treeSet0);
      int int0 = SetUtils.hashCodeForSet((Collection<Object>) setUtils_SetView0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Set<String> set0 = SetUtils.newIdentityHashSet();
      SetUtils.SetView<String> setUtils_SetView0 = SetUtils.union((Set<? extends String>) set0, (Set<? extends String>) set0);
      // Undeclared exception!
      try { 
        SetUtils.intersection((Set<? extends String>) setUtils_SetView0, (Set<? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Sets must not be null.
         //
         verifyException("org.apache.commons.collections4.SetUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        SetUtils.intersection((Set<? extends InstanceofPredicate>) null, (Set<? extends InstanceofPredicate>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Sets must not be null.
         //
         verifyException("org.apache.commons.collections4.SetUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HashSet<InstanceofPredicate> hashSet0 = SetUtils.hashSet((InstanceofPredicate[]) null);
      assertNull(hashSet0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = SetUtils.hashCodeForSet((Collection<InstanceofPredicate>) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Integer[] integerArray0 = new Integer[2];
      HashSet<Integer> hashSet0 = SetUtils.hashSet(integerArray0);
      Set<Integer> set0 = SetUtils.emptyIfNull((Set<Integer>) hashSet0);
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Set<String> set0 = SetUtils.unmodifiableSet(stringArray0);
      SetUtils.SetView<Object> setUtils_SetView0 = SetUtils.disjunction((Set<?>) set0, (Set<?>) set0);
      boolean boolean0 = setUtils_SetView0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Set<String> set0 = SetUtils.unmodifiableSet(stringArray0);
      SetUtils.SetView<Object> setUtils_SetView0 = SetUtils.disjunction((Set<?>) set0, (Set<?>) set0);
      boolean boolean0 = setUtils_SetView0.containsAll(set0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      SortedSet<InstanceofPredicate> sortedSet0 = SetUtils.emptySortedSet();
      linkedHashSet0.add("~<");
      SetUtils.SetView<Object> setUtils_SetView0 = SetUtils.disjunction((Set<?>) linkedHashSet0, (Set<?>) sortedSet0);
      boolean boolean0 = setUtils_SetView0.contains("~<");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Set<String> set0 = SetUtils.unmodifiableSet(stringArray0);
      SetUtils.SetView<Object> setUtils_SetView0 = SetUtils.disjunction((Set<?>) set0, (Set<?>) set0);
      Integer integer0 = new Integer(2);
      boolean boolean0 = setUtils_SetView0.contains(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      // Undeclared exception!
      try { 
        SetUtils.disjunction((Set<?>) linkedHashSet0, (Set<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Sets must not be null.
         //
         verifyException("org.apache.commons.collections4.SetUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        SetUtils.disjunction((Set<? extends String>) null, (Set<? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Sets must not be null.
         //
         verifyException("org.apache.commons.collections4.SetUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      SetUtils.SetView<String> setUtils_SetView0 = SetUtils.difference((Set<? extends String>) treeSet0, (Set<? extends String>) treeSet0);
      SetUtils.SetView<Object> setUtils_SetView1 = SetUtils.difference((Set<?>) setUtils_SetView0, (Set<?>) treeSet0);
      boolean boolean0 = setUtils_SetView1.contains("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Object object0 = new Object();
      linkedHashSet0.add(object0);
      SortedSet<InstanceofPredicate> sortedSet0 = SetUtils.emptySortedSet();
      SetUtils.SetView<Object> setUtils_SetView0 = SetUtils.disjunction((Set<?>) linkedHashSet0, (Set<?>) sortedSet0);
      int int0 = setUtils_SetView0.size();
      assertTrue(setUtils_SetView0.contains(object0));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Set<Integer> set0 = SetUtils.emptyIfNull((Set<Integer>) null);
      // Undeclared exception!
      try { 
        SetUtils.difference((Set<? extends Integer>) set0, (Set<? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Sets must not be null.
         //
         verifyException("org.apache.commons.collections4.SetUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        SetUtils.difference((Set<? extends InstanceofPredicate>) null, (Set<? extends InstanceofPredicate>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Sets must not be null.
         //
         verifyException("org.apache.commons.collections4.SetUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Set<String> set0 = SetUtils.unmodifiableSet(stringArray0);
      assertNotNull(set0);
      
      SetUtils.SetView<Object> setUtils_SetView0 = SetUtils.disjunction((Set<?>) set0, (Set<?>) set0);
      Set<Object> set1 = setUtils_SetView0.toSet();
      assertTrue(set1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TreeSet<InstanceofPredicate> treeSet0 = new TreeSet<InstanceofPredicate>();
      Predicate<Object> predicate0 = TruePredicate.truePredicate();
      SortedSet<InstanceofPredicate> sortedSet0 = SetUtils.predicatedNavigableSet((NavigableSet<InstanceofPredicate>) treeSet0, (Predicate<? super InstanceofPredicate>) predicate0);
      assertEquals(0, sortedSet0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Comparator<InstanceofPredicate> comparator0 = (Comparator<InstanceofPredicate>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<InstanceofPredicate> treeSet0 = new TreeSet<InstanceofPredicate>(comparator0);
      ClosureUtilsTest.MockTransformer<InstanceofPredicate> closureUtilsTest_MockTransformer0 = new ClosureUtilsTest.MockTransformer<InstanceofPredicate>();
      Set<InstanceofPredicate> set0 = SetUtils.transformedSet((Set<InstanceofPredicate>) treeSet0, (Transformer<? super InstanceofPredicate, ? extends InstanceofPredicate>) closureUtilsTest_MockTransformer0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SortedSet<LinkedHashSet<Object>> sortedSet0 = SetUtils.emptySortedSet();
      Set<LinkedHashSet<Object>> set0 = SetUtils.synchronizedSet((Set<LinkedHashSet<Object>>) sortedSet0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TreeSet<InstanceofPredicate> treeSet0 = new TreeSet<InstanceofPredicate>();
      SortedSet<InstanceofPredicate> sortedSet0 = SetUtils.unmodifiableNavigableSet((NavigableSet<InstanceofPredicate>) treeSet0);
      assertTrue(sortedSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SortedSet<LinkedHashSet<Object>> sortedSet0 = SetUtils.emptySortedSet();
      SortedSet<LinkedHashSet<Object>> sortedSet1 = SetUtils.unmodifiableSortedSet(sortedSet0);
      assertSame(sortedSet0, sortedSet1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SortedSet<InstanceofPredicate> sortedSet0 = SetUtils.emptySortedSet();
      SortedSet<InstanceofPredicate> sortedSet1 = SetUtils.synchronizedSortedSet(sortedSet0);
      assertEquals(0, sortedSet1.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TreeSet<UnmodifiableSortedSet<String>> treeSet0 = new TreeSet<UnmodifiableSortedSet<String>>();
      Transformer<Object, UnmodifiableSortedSet<String>> transformer0 = (Transformer<Object, UnmodifiableSortedSet<String>>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      SortedSet<UnmodifiableSortedSet<String>> sortedSet0 = SetUtils.transformedSortedSet((SortedSet<UnmodifiableSortedSet<String>>) treeSet0, (Transformer<? super UnmodifiableSortedSet<String>, ? extends UnmodifiableSortedSet<String>>) transformer0);
      assertTrue(sortedSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Predicate<Object> predicate0 = TruePredicate.truePredicate();
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      SortedSet<Integer> sortedSet0 = SetUtils.predicatedSortedSet((SortedSet<Integer>) treeSet0, (Predicate<? super Integer>) predicate0);
      assertTrue(sortedSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Set<String> set0 = SetUtils.unmodifiableSet(stringArray0);
      UniquePredicate<Object> uniquePredicate0 = new UniquePredicate<Object>();
      TransformedPredicate<Object> transformedPredicate0 = new TransformedPredicate<Object>((Transformer<? super Object, ?>) null, uniquePredicate0);
      // Undeclared exception!
      try { 
        SetUtils.predicatedSet(set0, (Predicate<? super String>) transformedPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.TransformedPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Comparator<InstanceofPredicate> comparator0 = (Comparator<InstanceofPredicate>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<InstanceofPredicate> treeSet0 = new TreeSet<InstanceofPredicate>(comparator0);
      Transformer<Object, InstanceofPredicate> transformer0 = (Transformer<Object, InstanceofPredicate>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      SortedSet<InstanceofPredicate> sortedSet0 = SetUtils.transformedNavigableSet((NavigableSet<InstanceofPredicate>) treeSet0, (Transformer<? super InstanceofPredicate, ? extends InstanceofPredicate>) transformer0);
      assertEquals(0, sortedSet0.size());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Comparator<InstanceofPredicate> comparator0 = (Comparator<InstanceofPredicate>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<InstanceofPredicate> treeSet0 = new TreeSet<InstanceofPredicate>(comparator0);
      SetUtils.SetView<InstanceofPredicate> setUtils_SetView0 = SetUtils.difference((Set<? extends InstanceofPredicate>) treeSet0, (Set<? extends InstanceofPredicate>) treeSet0);
      SetUtils.SetView<Object> setUtils_SetView1 = SetUtils.union((Set<?>) setUtils_SetView0, (Set<?>) setUtils_SetView0);
      Set<Object> set0 = setUtils_SetView1.toSet();
      assertEquals(0, set0.size());
  }
}