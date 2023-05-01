package com.ARUP;

public class Linearsearch {

    public static void main(String[] args) {
        int[] nums = { 1,4,6,8,23,121,66,87,232};
        int target = 8;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }
    //search in the array: return the index if item found
    //otherwise the item is not found return -1
    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        for (int i = 0; i < arr.length; i++) {
            //check the element every i if it is = target
            int element = arr[i];
            if(element==target) {
                return i;
            }
        }
        //this line will execute if none of the return statements above here executed
        //hence the target not found
        return -1;
    }
    //search in the array: return the element
    static int linearsearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        for (int element : arr) {
            //check the element every index if it is = target
            if (element == target) {
                return element;
            }
        }
        //this line will execute if none of the return statements above here executed
        //hence the target not found
        return Integer.MAX_VALUE;
    }
    //search in the array: return the true or false
    static boolean linearsearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        //run a for loop
        for (int element : arr) {
            //check the element every index if it is = target
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the return statements above here executed
        //hence the target not found
        return false;
    }
}
