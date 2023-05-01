package com.ARUP;
// leetcode 410: split array largest sum
public class splittingarray {
    public static void main(String[] args) {
    int[] nums ={7,2,5,10,8};
    int m = 2;
        System.out.println(splitArray(nums,m));
    }
    public static int splitArray(int[] nums, int m) {
    int start = 0;
    int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);//in the end of loop this will contain the max item for the array
            end += nums[i];//the sum of the values
        }
        //binary search
        while(start< end){
            //try for the middle as potential answer
            int mid = start + (end - start)/2;
            //calculate how many pieces you can divide this in which this will be max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if(sum + num > mid){
                    //you cannot add this in this subarray, make new one
                    //say you add this num in new subarray, then sum = num;
                    sum = num;
                    pieces++;

                }else{
                    sum +=num;
                }

            }
            if(pieces>m){
                start = mid +1;
            }else{
                end = mid;
            }

        }
        return end; // Because here start==end
    }
}
