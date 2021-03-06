/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:24:51 GMT 2019
 */

package org.apache.commons.collections4.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.keyvalue.MultiKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiKey_ESTest extends MultiKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[0];
      MultiKey<String> multiKey0 = new MultiKey<String>(stringArray0);
      int int0 = multiKey0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      MultiKey<Object> multiKey0 = new MultiKey<Object>(objectArray0);
      Object[] objectArray1 = multiKey0.getKeys();
      assertFalse(objectArray1.equals((Object)objectArray0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiKey<String> multiKey0 = new MultiKey<String>("org.apache.commons.collections4.keyvalue.MultiKey", "org.apache.commons.collections4.keyvalue.MultiKey", "org.apache.commons.collections4.keyvalue.MultiKey");
      Object[] objectArray0 = new Object[5];
      objectArray0[1] = (Object) multiKey0;
      MultiKey<Object> multiKey1 = new MultiKey<Object>(objectArray0);
      MultiKey multiKey2 = (MultiKey)multiKey1.getKey(1);
      assertEquals(3, multiKey2.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultiKey<String> multiKey0 = new MultiKey<String>("", "", "", "");
      // Undeclared exception!
      try { 
        multiKey0.getKey(873);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 873
         //
         verifyException("org.apache.commons.collections4.keyvalue.MultiKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      MultiKey<String> multiKey0 = new MultiKey<String>(stringArray0, false);
      assertEquals(0, multiKey0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiKey<String> multiKey0 = null;
      try {
        multiKey0 = new MultiKey<String>((String[]) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array of keys must not be null
         //
         verifyException("org.apache.commons.collections4.keyvalue.MultiKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      MultiKey<Object> multiKey0 = new MultiKey<Object>(objectArray0, true);
      assertEquals(5, multiKey0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiKey<String> multiKey0 = new MultiKey<String>("org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey");
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) multiKey0;
      MultiKey<Object> multiKey1 = new MultiKey<Object>(objectArray0);
      boolean boolean0 = multiKey1.equals(objectArray0[0]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiKey<String> multiKey0 = new MultiKey<String>("org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey");
      Object object0 = multiKey0.readResolve();
      boolean boolean0 = multiKey0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      MultiKey<Object> multiKey0 = new MultiKey<Object>(objectArray0);
      boolean boolean0 = multiKey0.equals("MultiKey[org.apache.cfmmons.colTections4.keyvalue.MuQtiKey, org.apache.cfmmons.colTections4.keyvalue.MuQtiKey, org.apache.cfmmons.colTections4.keyvalue.MuQtiKey]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiKey<MultiKey<String>> multiKey0 = null;
      try {
        multiKey0 = new MultiKey<MultiKey<String>>((MultiKey<String>[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array of keys must not be null
         //
         verifyException("org.apache.commons.collections4.keyvalue.MultiKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiKey<String> multiKey0 = new MultiKey<String>("org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey");
      int int0 = multiKey0.size();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiKey<String> multiKey0 = new MultiKey<String>("org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey");
      Object object0 = multiKey0.readResolve();
      MultiKey<Object> multiKey1 = new MultiKey<Object>(object0, object0);
      assertEquals(2, multiKey1.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      MultiKey<Object> multiKey0 = new MultiKey<Object>(objectArray0);
      Object object0 = multiKey0.getKey(1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultiKey<String> multiKey0 = new MultiKey<String>("org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey");
      multiKey0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MultiKey<String> multiKey0 = new MultiKey<String>("org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey", "org.apache.cfmmons.colTections4.keyvalue.MuQtiKey");
      String string0 = multiKey0.toString();
      assertEquals("MultiKey[org.apache.cfmmons.colTections4.keyvalue.MuQtiKey, org.apache.cfmmons.colTections4.keyvalue.MuQtiKey, org.apache.cfmmons.colTections4.keyvalue.MuQtiKey]", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MultiKey<MultiKey<String>> multiKey0 = new MultiKey<MultiKey<String>>((MultiKey<String>) null, (MultiKey<String>) null, (MultiKey<String>) null, (MultiKey<String>) null, (MultiKey<String>) null);
      MultiKey<String>[] multiKeyArray0 = multiKey0.getKeys();
      assertEquals(5, multiKeyArray0.length);
  }
}
