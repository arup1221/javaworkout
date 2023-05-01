package com.ARUP;

public class BinarySearch {

    public static void main(String[] args) {
    int[] arr = {-24,-10,0,2,4,6,8,34,65,76,787,2567,3423,9999};
    int target = 65;
    int ans = binarySearch(arr, target);
        System.out.println(ans);
       // System.out.println(binarySearch(arr,65));
    }
    //return the index
    //return -1 if target is does not exist
    static int binarySearch(int[] arr,int target){
    int start = 0;
    int end = arr.length- 1;
    while(start<= end){
        //find the middle element
        // int mid = (start + end)/2; // might be possible that (start + end ) exceeds the int range in java
        int mid = start + ((end - start)/2);
        if(target< arr[mid]){
            end = mid - 1;
            //here the new arr is from the left of the middle point (means from left side),so there
            // the end  point is going to be changed means mid-1 and start point remains same.
        }
        else if (target>arr[mid]){
            start = mid + 1;
            //here the new arr is from the right of the middle point (means from right side),so there
            // the start  point is going to be changed means mid+1 and end point remains same.
        }
        else{
            // answer found
            return mid ;//+1;
        }
    }
    return -1;
    }

}
