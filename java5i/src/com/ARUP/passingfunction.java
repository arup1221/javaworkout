package com.ARUP;

import java.util.Arrays;

public class passingfunction {
    public static void main(String[] args) {
        int[] nums = {2,5,6,7,45};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=1;
    }
}
