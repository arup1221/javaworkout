package code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayfromPermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] ans = buildArray(arr);
        System.out.println(Arrays.toString(ans)); //remind that you return an array that's why you Arrays.toString
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length]; // here you initialize the array ans which you want to return...... OK!
        for(int i = 0; i< nums.length;i++){
            ans[i] = nums[nums[i]]; //just apply the question ans explanation
        }
        return ans;
    }
}
