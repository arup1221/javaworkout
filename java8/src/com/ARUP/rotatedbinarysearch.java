package com.ARUP;
//leetcode 33. Search in Rotated Sorted Array
// need recursion

public class rotatedbinarysearch {
    public static void main(String[] args) {
    int[] arr = {4,6,8,0,1,5,7,2};
    //int[] arr ={2,2,2,2,2,2,1,2};
    int target = 1;
        System.out.println(search(arr,target));
    }
    // this will not work in duplicate array
    static int search(int[] nums, int target){
        //int pivot = findpivotwithduplicate(nums);
        int pivot = findpivot(nums);
        //if you did not find pivot it means the array is not rotated
        if(pivot == -1){
            //just do normal binary search
            return binarySearch(nums,target,0, nums.length-1);
        }
        //if pivot is found you have found two asc sorted arrays
        if(nums[pivot]==target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums, target, pivot +1, nums.length-1);
    }
    static int binarySearch(int[] arr,int target, int start,int end){
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
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<= end){
            int mid = start + (end - start)/2;
            //found ans
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid]<= arr[start]){
                end = mid - 1; // it is used to ignore all the elements after the mid bcz start is big
            }
            else {
                start = mid + 1;// bigger numbers are lie after the mid
            }
        }
        return -1;
    }
    //for duplicate value
    static int findpivotwithduplicate(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<= end){
            int mid = start + (end - start)/2;
            //found ans
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            //if elements at middle, start, end are equal then just skip the duplicate
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
            //skips the duplicates
                //NOTE : what if the start and end were the pivot??
                if(arr[start]>arr[start +1]){
                    return start;
                }
                start++;
                if(arr[end]< arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //the left side is sorted, so pivot should be in right side.
            else if(arr[start]< arr[mid]||(arr[start]==arr[mid]&&arr[mid]> arr[end])){
                start = mid + 1;
            }
            else{
                end= mid - 1;
            }
        }
        return -1;
    }

}
