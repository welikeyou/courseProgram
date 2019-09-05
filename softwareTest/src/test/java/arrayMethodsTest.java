import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/23
 * Time:16:05
 * Introduction:
 */

public class arrayMethodsTest {
    @Test
  public void testContain(){
        int[] arr1 = {2,3,1,5};
        int[] arr2={};
        int[] arr3={2,3};
        assertTrue(arrayMethods.contain(1,arr1));
        assertTrue(!arrayMethods.contain(1,arr2));
        assertTrue(!arrayMethods.contain(1,arr3));
  }
  @Test
  public void testCompare(){
     int[] arr1a={1};
     int[] arr2a={0};
     assertEquals(1,arrayMethods.compareSum(arr1a,arr2a));
      int[] arr1b={-1,1};
      int[] arr2b={};
      assertEquals(0,arrayMethods.compareSum(arr1b,arr2b));
      int[] arr1c={-1,-2} ;
      int[] arr2c={};
      assertEquals(-1,arrayMethods.compareSum(arr1c,arr2c));
  }

}
