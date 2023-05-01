package com.ARUP;
//leetcode 852: Peak index in a Mountain Array?
//leetcode 162: Find peak element
public class MountainArray {
    public static void main(String[] args) {
    int[] arr = {1,3,4,6,5,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in the descending part of the array
                //this may be ans, but look at left
                //this is why end != mid -1;
                end = mid;
            } else {
                //you are ascending part of the array
                start = mid + 1;// because we know that mid + 1 element > mid element
            }
        }
        //In the end the start == end, and pointing to the largest number because of the two checks of above
        //the start and end are always trying to find the max element in the above two checks
        //hence when they are pointing to one element that is max one that is what the check say
        //more elaboration :  at every point of time for start and end they have the best possible number till have time
        //if we are saying that only one item is remaining, Hence cuz of above line that is the best possible ans
         return  start; // or return end as both are Equal
        //return arr[start];
    }
}

