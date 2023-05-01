package com.ARUP;
//Geeks For Geeks Question: Find position of an element in a sorted array of infinite numbers : amazon question

public class infinitearray {
    public static void main(String[] args) {
    int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
    int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range
        while(target>arr[end]){
            int temp = end + 1; //this is new start
            //double the box value
            //end = previous end + (size of box * 2)
            end = end + (end - start + 1) * 2;//or end -(start-1)=(end - start + 1) is size of the box such as 4 -2 + 1 = 3 size
            start = temp;//end + 1
        }
        return  binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start, int end){

        while(start<= end){
            int mid = start + ((end - start)/2);
            if(target< arr[mid]){
                end = mid -1;
            }
            else if (target>arr[mid]){
                start = mid +1;
            }
            else{
                return mid ;
            }
        }
        return -1;
    }
}
