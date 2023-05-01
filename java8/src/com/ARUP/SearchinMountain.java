package com.ARUP;
// Find in a mountain array // do when you learn object-oriented language
public class SearchinMountain {
    public static void main(String[] args) {
    int[] arr = {1,3,4,6,5,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firsttry = orderAgnosticBS(arr, target,0,peak);
        if(firsttry != -1){
            return firsttry;
        }
        //then try to search in second array (descending array)
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int  end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //this may be ans, but look at left
                //this is why end != mid -1;
                end = mid;
            } else {
                //you are ascending part of the array
                start = mid + 1;// because we know that mid + 1 element > mid element
            }
        }
         return  start; // or return end as both are Equal
        //return arr[start];
    }
    static int orderAgnosticBS(int[] arr, int target,int start, int end){
        //find the array is sorted ascending or descending
        boolean isAse = arr[start]< arr[end];
//        if(arr[start]< arr[end]){
//            isAse = true;
//        }
//        else {
//            isAse = false;
//        }
        while(start<= end){
            //find the middle element
            int mid = start + (end - start)/2;
            if( arr[mid]==target ){
                return mid;
            }
            if(isAse) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;

                }
            }
            else{
                if(target> arr[mid]){
                    end = mid -1;

                }
                else {
                    start = mid +1;

                }

            }
        }
        return -1;
    }
}

