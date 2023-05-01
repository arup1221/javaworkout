package com.ARUP;

public class orderagnosticBS {
    public static void main(String[] args) {
        int[] arr = {-24,-10,0,2,4,6,8,34,65,76,787,2567,3423,9999};
       // int[] arr = {99,88,65,56,49,34,23,12,10,6,4,3,2,1,0,-4,-32,-67};
        int target = 4;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length- 1;
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
