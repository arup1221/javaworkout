package com.ARUP;

public class minvalue {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println("Minimum value: "+min(arr));
        System.out.println("Maximum value: "+max(arr));
    }
    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]> ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]< ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
