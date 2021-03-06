/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:14:58 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantTransformer_ESTest extends ConstantTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantTransformer<Integer, String> constantTransformer0 = new ConstantTransformer<Integer, String>("ConstantTransformer");
      ConstantTransformer.constantTransformer((Object) "ConstantTransformer");
      constantTransformer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantTransformer<Integer, String> constantTransformer0 = new ConstantTransformer<Integer, String>("olleH");
      ConstantTransformer<String, Object> constantTransformer1 = new ConstantTransformer<String, Object>(constantTransformer0);
      Object object0 = constantTransformer1.getConstant();
      boolean boolean0 = constantTransformer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer((-2709));
      ConstantTransformer<Integer, Object> constantTransformer0 = new ConstantTransformer<Integer, Object>((Object) null);
      Object object0 = constantTransformer0.transform(integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantTransformer<Object, Object> constantTransformer0 = new ConstantTransformer<Object, Object>((Object) null);
      Object object0 = constantTransformer0.getConstant();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantTransformer<String, Object> constantTransformer0 = new ConstantTransformer<String, Object>((Object) null);
      constantTransformer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer((-2063));
      Transformer<String, Integer> transformer0 = ConstantTransformer.constantTransformer(integer0);
      Integer integer1 = new Integer(1742);
      ConstantTransformer<ConstantTransformer<String, String>, Object> constantTransformer0 = new ConstantTransformer<ConstantTransformer<String, String>, Object>(integer1);
      ConstantTransformer<String, Object> constantTransformer1 = new ConstantTransformer<String, Object>(transformer0);
      Object object0 = constantTransformer1.getConstant();
      boolean boolean0 = constantTransformer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer((-2063));
      Transformer<String, Integer> transformer0 = ConstantTransformer.constantTransformer(integer0);
      Integer integer1 = new Integer((-2063));
      ConstantTransformer<ConstantTransformer<Integer, Object>, Object> constantTransformer0 = new ConstantTransformer<ConstantTransformer<Integer, Object>, Object>(integer1);
      boolean boolean0 = constantTransformer0.equals(transformer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstantTransformer<Object, String> constantTransformer0 = new ConstantTransformer<Object, String>("org.apache.commns.collections4.collection.TransformdCollectionTest$StringToInteger");
      boolean boolean0 = constantTransformer0.equals("org.apache.commns.collections4.collection.TransformdCollectionTest$StringToInteger");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Transformer<String, Object> transformer0 = ConstantTransformer.constantTransformer((Object) null);
      assertNotNull(transformer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer((-739));
      ConstantTransformer<Integer, Integer> constantTransformer0 = new ConstantTransformer<Integer, Integer>(integer0);
      Integer integer1 = constantTransformer0.transform(integer0);
      assertEquals((-739), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Transformer<Integer, String> transformer0 = ConstantTransformer.nullTransformer();
      ConstantTransformer<Object, String> constantTransformer0 = new ConstantTransformer<Object, String>("olleH");
      boolean boolean0 = constantTransformer0.equals(transformer0);
      assertFalse(boolean0);
  }
}
