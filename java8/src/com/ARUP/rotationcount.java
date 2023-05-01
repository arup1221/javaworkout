package com.ARUP;
//Find the rotation count in Rotated sorted array
//GFG question
public class rotationcount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countrotarion(arr));
    }

     static int countrotarion(int[] arr) {
        int pivot = findpivot(arr);

        return pivot +1;
    }
    //for non duplicates
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
