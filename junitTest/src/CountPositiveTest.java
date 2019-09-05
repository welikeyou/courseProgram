import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/23
 * Time:10:35
 * Introduction:
 */

public class CountPositiveTest {
@Test
    public void testCountPositive(){
    int[] arr0 = {1,1};
    int[] arr1 = {1,-1};
    int[] arr2 = {-1,-1};
    int[] arr3 = {-1,1};
    int[] arr4 = {};
    assertEquals("正数个数不匹配",2,CountPositive.countPositive(arr0));
    assertEquals("正数个数不匹配",1,CountPositive.countPositive(arr1));
    assertEquals("正数个数不匹配",0,CountPositive.countPositive(arr2));
    assertEquals("正数个数不匹配",1,CountPositive.countPositive(arr3));
    assertEquals("正数个数不匹配",0,CountPositive.countPositive(arr4));
}

}
