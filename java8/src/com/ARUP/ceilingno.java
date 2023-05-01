package com.ARUP;
//random question
public class ceilingno {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    //return the index of the smallest no => target
    static int ceiling(int[] arr,int target){
        //but what if the target is greater than the greatest number in the array
        if(target > arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length- 1;
        while(start<= end){
            //find the middle element
            // int mid = (start + end)/2; // might be possible that (start + end ) exceeds the int range in java
            int mid = start + ((end - start)/2);
            if(target< arr[mid]){
                end = mid -1;
                //here the new arr is from the left of the mid point (means from left side),so there
                // the end  point is going to be changed means mid-1 and start point remains same.
            }
            else if (target>arr[mid]){
                start = mid +1;
                //here the new arr is from the right of the mid point (means from right side),so there
                // the start  point is going to be changed means mid+1 and end point remains same.
            }
            else{
                // ans found
                return mid ;//+1;
            }
        }
        return start;
    }

}
