/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:00:49 GMT 2019
 */

package org.apache.commons.collections4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.collections4.MultiMapUtils;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.bag.CollectionBag;
import org.apache.commons.collections4.bag.CollectionSortedBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TransformedBag;
import org.apache.commons.collections4.bag.TransformedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiMapUtils_ESTest extends MultiMapUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = new Integer((-795));
      hashMap0.put(integer0, "Y?TR:g");
      HashSetValuedHashMap<Integer, String> hashSetValuedHashMap0 = new HashSetValuedHashMap<Integer, String>(hashMap0);
      MultiValuedMap<Integer, Object> multiValuedMap0 = MultiMapUtils.unmodifiableMultiValuedMap((MultiValuedMap<? extends Integer, ?>) hashSetValuedHashMap0);
      assertFalse(multiValuedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashSetValuedHashMap<String, Predicate<Object>> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, Predicate<Object>>(1);
      hashSetValuedHashMap0.put("1t", (Predicate<Object>) null);
      MultiValuedMap<String, Predicate<Object>> multiValuedMap0 = MultiMapUtils.emptyIfNull((MultiValuedMap<String, Predicate<Object>>) hashSetValuedHashMap0);
      assertFalse(multiValuedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        MultiMapUtils.unmodifiableMultiValuedMap((MultiValuedMap<? extends Integer, ? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // MultiValuedMap must not be null.
         //
         verifyException("org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Transformer<Object, Predicate<Object>> transformer0 = (Transformer<Object, Predicate<Object>>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      Transformer<Object, TransformedSortedBag<String>> transformer1 = (Transformer<Object, TransformedSortedBag<String>>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        MultiMapUtils.transformedMultiValuedMap((MultiValuedMap<Predicate<Object>, TransformedSortedBag<String>>) null, (Transformer<? super Predicate<Object>, ? extends Predicate<Object>>) transformer0, (Transformer<? super TransformedSortedBag<String>, ? extends TransformedSortedBag<String>>) transformer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // MultiValuedMap must not be null.
         //
         verifyException("org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayListValuedHashMap<Integer, ComparatorPredicate.Criterion> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Integer, ComparatorPredicate.Criterion>((-1));
      Integer integer0 = new Integer((-1));
      List<ComparatorPredicate.Criterion> list0 = MultiMapUtils.getValuesAsList((MultiValuedMap<Integer, ComparatorPredicate.Criterion>) arrayListValuedHashMap0, integer0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<CollectionBag<TransformedSortedBag>> list0 = MultiMapUtils.getValuesAsList((MultiValuedMap<SynchronizedSortedBag<CollectionSortedBag>, CollectionBag<TransformedSortedBag>>) null, (SynchronizedSortedBag<CollectionSortedBag>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Collection<TreeBag<LinkedList>> collection0 = MultiMapUtils.getCollection((MultiValuedMap<Object, TreeBag<LinkedList>>) null, (Object) "");
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashSetValuedHashMap<Object, Object> hashSetValuedHashMap0 = new HashSetValuedHashMap<Object, Object>(3318, 0);
      MultiSet<Object> multiSet0 = hashSetValuedHashMap0.keys();
      hashSetValuedHashMap0.put(multiSet0, multiSet0);
      boolean boolean0 = MultiMapUtils.isEmpty(hashSetValuedHashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = MultiMapUtils.isEmpty((MultiValuedMap<?, ?>) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultiValuedMap<CollectionSortedBag<TransformedBag>, ComparatorPredicate.Criterion> multiValuedMap0 = MultiMapUtils.emptyIfNull((MultiValuedMap<CollectionSortedBag<TransformedBag>, ComparatorPredicate.Criterion>) null);
      assertTrue(multiValuedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiValuedMap<ComparatorPredicate.Criterion, ComparatorPredicate.Criterion> multiValuedMap0 = MultiMapUtils.emptyMultiValuedMap();
      boolean boolean0 = MultiMapUtils.isEmpty(multiValuedMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayListValuedHashMap<Object, Predicate<Object>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Object, Predicate<Object>>(44, (-65));
      Transformer<Object, Integer> transformer0 = (Transformer<Object, Integer>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      Transformer<Object, Predicate<Object>> transformer1 = (Transformer<Object, Predicate<Object>>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      MultiValuedMap<Object, Predicate<Object>> multiValuedMap0 = MultiMapUtils.transformedMultiValuedMap((MultiValuedMap<Object, Predicate<Object>>) arrayListValuedHashMap0, (Transformer<? super Object, ?>) transformer0, (Transformer<? super Predicate<Object>, ? extends Predicate<Object>>) transformer1);
      assertTrue(multiValuedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashSetValuedHashMap<String, String> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, String>(16);
      ArrayListValuedHashMap<Object, String> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Object, String>(hashSetValuedHashMap0);
      MultiValuedMap<Object, String> multiValuedMap0 = MultiMapUtils.unmodifiableMultiValuedMap((MultiValuedMap<?, ? extends String>) arrayListValuedHashMap0);
      assertTrue(multiValuedMap0.isEmpty());
  }
}