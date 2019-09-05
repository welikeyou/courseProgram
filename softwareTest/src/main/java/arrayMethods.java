import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/23
 * Time:15:46
 * Introduction:
 */
public class arrayMethods {
    //判断数组中是否包含某个元素
    public static boolean contain(int num, int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }

    //获取数组内部值的总和
    public static int sumArr(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    }

    //比较两个数组总和的大小
    public static int compareSum(int[] arr1, int[] arr2){
        int sum1 = sumArr(arr1);
        int sum2 = sumArr(arr2);
        if(sum1>sum2){
            return 1;
        }else if(sum1==sum2){
            return 0;
        }else{
            return -1;
        }
    }

}
