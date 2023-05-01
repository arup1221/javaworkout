package code.arup;
//leetcode 645. Set Mismatch

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {2,1,4,2,6,5};
        System.out.println(Arrays.toString(findErrorNums(arr)));


    }
     static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1; //here the "correct" is the index of the array arr[4] = 4
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        //search for first missing no
        for (int index = 0; index < nums.length; index++) {

            if(nums[index]!= index + 1){
                return new int[]{nums[index],index + 1};
            }

        }

        return new int[] {-1,-1};
    }
    static void swap(int[] arr, int first, int second){
        int temp =arr [first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
