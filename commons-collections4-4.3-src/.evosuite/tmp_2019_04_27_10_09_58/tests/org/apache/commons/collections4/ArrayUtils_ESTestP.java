package org.apache.commons.collections4;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/5/1
 * Time:8:19
 * Introduction:
 */
/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:06:23 GMT 2019
 */
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class ArrayUtils_ESTestP extends ArrayUtils_ESTest_scaffolding {

    //changed 测试indexOf函数，数组不为null，object不为null，数组中不包含object
    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        Object[] objectArray0 = new Object[2];
        System.out.println(objectArray0[0]);
        Integer integer0 = new Integer((-1422));
        int int0 = ArrayUtils.indexOf(objectArray0, integer0, 1563);
        assertEquals((-1), int0);
    }

    //added 针对test00改进，test00没有测试循环，即是将整个数组循环后没有值才返回-1
    public void test00P()  throws Throwable  {
        Object[] objectArray0 = new Object[2];
        System.out.println(objectArray0[0]);
        Integer integer0 = new Integer((-1422));
        int int0 = ArrayUtils.indexOf(objectArray0, integer0, -1);
        assertEquals((-1), int0);
    }

    //changed 测试indexOf函数，数组不为null，object为null，数组中不包含object
    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        Object[] objectArray0 = new Object[2];
        int int0 = ArrayUtils.indexOf(objectArray0, (Object) null, 1563);
        assertEquals((-1), int0);
    }

    //added 针对test01的改进。test01由于startIndex超过数组长度，没有执行循环。所以这里测试执行循环后不包含object
    @Test(timeout = 4000)
    public void test01P()  throws Throwable  {
        Object[] objectArray0 = new Object[2];
        ArrayUtils arrayUtils0 = new ArrayUtils();
        ArrayUtils arrayUtils1 = new ArrayUtils();
        objectArray0[0] = arrayUtils0;
        objectArray0[1] = arrayUtils1;
        int int0 = ArrayUtils.indexOf(objectArray0, (Object) null, 0);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        ArrayUtils arrayUtils0 = new ArrayUtils();
        Object[] objectArray0 = new Object[7];
        objectArray0[0] = (Object) arrayUtils0;
        int int0 = ArrayUtils.indexOf(objectArray0, arrayUtils0, (-1548));
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        Object[] objectArray0 = new Object[3];
        Object object0 = new Object();
        objectArray0[0] = object0;
        int int0 = ArrayUtils.indexOf(objectArray0, objectArray0[1], (-752));
        assertEquals(1, int0);
    }
    //changed test04和test02测试的代码大部分重合，稍加改进即可减少用例使用
    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        Object[] objectArray0 = new Object[3];
        Object object0 = new Object();
        objectArray0[2] = object0;
        int int0 = ArrayUtils.indexOf(objectArray0, object0);
        assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        Object object0 = new Object();
        int int0 = ArrayUtils.indexOf((String[]) null, object0);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        ArrayUtils arrayUtils0 = new ArrayUtils();
        Object[] objectArray0 = new Object[10];
        objectArray0[0] = (Object) arrayUtils0;
        int int0 = ArrayUtils.indexOf(objectArray0, objectArray0[0]);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        ArrayUtils arrayUtils0 = new ArrayUtils();
        Object[] objectArray0 = new Object[10];
        objectArray0[0] = (Object) arrayUtils0;
        boolean boolean0 = ArrayUtils.contains(objectArray0, objectArray0[2]);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        boolean boolean0 = ArrayUtils.contains((Object[]) null, (Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        Object[] objectArray0 = new Object[0];
        boolean boolean0 = ArrayUtils.contains(objectArray0, (Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        ArrayUtils arrayUtils0 = new ArrayUtils();
        Integer[] integerArray0 = new Integer[1];
        int int0 = ArrayUtils.indexOf(integerArray0, arrayUtils0, (-3186));
        assertEquals((-1), int0);
    }

    //added 测试当一个数组中包含两个相同的元素，会返回第一个元素的位置
    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        ArrayUtils arrayUtils0 = new ArrayUtils();
        Object[] integerArray0 = new Object[3];
        integerArray0[0] = arrayUtils0;
        integerArray0[1] = arrayUtils0;
        int int0 = ArrayUtils.indexOf(integerArray0, arrayUtils0, (-3186));
        assertEquals(0, int0);
    }

    //added 测试异常
    @Test(expected = IndexOutOfBoundsException.class)
    public void test12()  throws Throwable  {
        ArrayUtils arrayUtils0 = new ArrayUtils();
        Object[] integerArray0 = new Object[3];
        integerArray0[3] = arrayUtils0;
    }
}

