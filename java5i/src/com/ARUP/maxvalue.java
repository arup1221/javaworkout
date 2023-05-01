package com.ARUP;

public class maxvalue {
    public static void main(String[] args) {
        int[] arr = { 1,3,23,9,18};
        System.out.println(maxrange(arr,0,1));
    }
        // maximum value between two range
     static int maxrange(int[] arr,int start, int end){
        if(start>end){
            return -1;
        }
        if(arr == null){
            return  -1;
        }
        int maxval = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]> maxval)
                maxval = arr[i];
        }
        return maxval;
    }

    //imagine that arr is not empty
    static int max(int[] arr){
        if(arr.length == 0 ){
            return -1;
        }
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> maxval)
                maxval = arr[i];
        }
        return maxval;
    }
        ;
}
