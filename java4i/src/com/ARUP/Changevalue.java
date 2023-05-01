package com.ARUP;

import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr = {2,5, 7,8,9,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[4] = 345;
    }
}
