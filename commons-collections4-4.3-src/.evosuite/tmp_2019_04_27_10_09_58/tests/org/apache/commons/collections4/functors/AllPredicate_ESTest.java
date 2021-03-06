/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:22:44 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.NullIsTruePredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.SwitchTransformer;
import org.apache.commons.collections4.functors.TransformedPredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AllPredicate_ESTest extends AllPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 4);
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      Predicate<Object> predicate0 = AllPredicate.allPredicate((Collection<? extends Predicate<? super Object>>) linkedList0);
      predicateArray0[0] = predicate0;
      predicateArray0[1] = predicate0;
      predicateArray0[2] = predicate0;
      Predicate<Object> predicate1 = ExceptionPredicate.exceptionPredicate();
      predicateArray0[3] = predicate1;
      AllPredicate<UniquePredicate<Object>> allPredicate0 = new AllPredicate<UniquePredicate<Object>>(predicateArray0);
      UniquePredicate<Object> uniquePredicate0 = new UniquePredicate<Object>();
      // Undeclared exception!
      try { 
        allPredicate0.evaluate(uniquePredicate0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionPredicate invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 3);
      Predicate<Object> predicate0 = UniquePredicate.uniquePredicate();
      predicateArray0[0] = predicate0;
      OnePredicate<Object> onePredicate0 = new OnePredicate<Object>(predicateArray0);
      predicateArray0[1] = (Predicate<Object>) onePredicate0;
      AllPredicate<ExceptionPredicate<Boolean>> allPredicate0 = new AllPredicate<ExceptionPredicate<Boolean>>(predicateArray0);
      ExceptionPredicate<Boolean> exceptionPredicate0 = (ExceptionPredicate<Boolean>) mock(ExceptionPredicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      allPredicate0.evaluate(exceptionPredicate0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AllPredicate<ComparatorPredicate<Integer>> allPredicate0 = new AllPredicate<ComparatorPredicate<Integer>>((Predicate<? super ComparatorPredicate<Integer>>[]) null);
      // Undeclared exception!
      try { 
        allPredicate0.evaluate((ComparatorPredicate<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.AllPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 3);
      Predicate<Object> predicate0 = UniquePredicate.uniquePredicate();
      predicateArray0[0] = predicate0;
      NullIsTruePredicate<Object> nullIsTruePredicate0 = new NullIsTruePredicate<Object>(predicate0);
      predicateArray0[1] = (Predicate<Object>) nullIsTruePredicate0;
      Transformer<Object, String>[] transformerArray0 = (Transformer<Object, String>[]) Array.newInstance(Transformer.class, 1);
      Transformer<Object, String> transformer0 = ConstantTransformer.constantTransformer("");
      SwitchTransformer<Object, Object> switchTransformer0 = new SwitchTransformer<Object, Object>(predicateArray0, transformerArray0, transformer0);
      TransformedPredicate<Object> transformedPredicate0 = new TransformedPredicate<Object>(switchTransformer0, predicate0);
      predicateArray0[2] = (Predicate<Object>) transformedPredicate0;
      AllPredicate<Object> allPredicate0 = new AllPredicate<Object>(predicateArray0);
      // Undeclared exception!
      try { 
        allPredicate0.evaluate((Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.collections4.functors.SwitchTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 7);
      // Undeclared exception!
      try { 
        AllPredicate.allPredicate((Predicate<? super Object>[]) predicateArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The predicate array must not contain a null predicate, index 0 was null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        AllPredicate.allPredicate((Collection<? extends Predicate<? super NonePredicate<NullPredicate>>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The predicate collection must not be null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 1);
      Class<Integer> class0 = Integer.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      predicateArray0[0] = predicate0;
      AllPredicate<AndPredicate<Object>> allPredicate0 = new AllPredicate<AndPredicate<Object>>(predicateArray0);
      AndPredicate<Object> andPredicate0 = new AndPredicate<Object>(predicate0, predicate0);
      boolean boolean0 = allPredicate0.evaluate(andPredicate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 1);
      Predicate<Object> predicate0 = UniquePredicate.uniquePredicate();
      predicateArray0[0] = predicate0;
      AllPredicate<IdentityPredicate<String>> allPredicate0 = new AllPredicate<IdentityPredicate<String>>(predicateArray0);
      IdentityPredicate<String> identityPredicate0 = new IdentityPredicate<String>("kyLHMA");
      boolean boolean0 = allPredicate0.evaluate(identityPredicate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      linkedList0.add(instanceofPredicate0);
      linkedList0.add(instanceofPredicate0);
      Predicate<InstanceofPredicate> predicate0 = AllPredicate.allPredicate((Collection<? extends Predicate<? super InstanceofPredicate>>) linkedList0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      linkedList0.add(instanceofPredicate0);
      Predicate<ExceptionPredicate<AndPredicate>> predicate0 = AllPredicate.allPredicate((Collection<? extends Predicate<? super ExceptionPredicate<AndPredicate>>>) linkedList0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Predicate<Boolean>[] predicateArray0 = (Predicate<Boolean>[]) Array.newInstance(Predicate.class, 1);
      Predicate<Boolean> predicate0 = ExceptionPredicate.exceptionPredicate();
      predicateArray0[0] = predicate0;
      Predicate<Boolean> predicate1 = AllPredicate.allPredicate((Predicate<? super Boolean>[]) predicateArray0);
      assertSame(predicate1, predicate0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 0);
      Predicate<ComparatorPredicate<IdentityPredicate>> predicate0 = AllPredicate.allPredicate((Predicate<? super ComparatorPredicate<IdentityPredicate>>[]) predicateArray0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 3);
      predicateArray0[0] = (Predicate<Object>) instanceofPredicate0;
      predicateArray0[1] = (Predicate<Object>) instanceofPredicate0;
      predicateArray0[2] = (Predicate<Object>) instanceofPredicate0;
      Predicate<NullIsTruePredicate<ComparatorPredicate>> predicate0 = AllPredicate.allPredicate((Predicate<? super NullIsTruePredicate<ComparatorPredicate>>[]) predicateArray0);
      assertNotNull(predicate0);
  }
}
