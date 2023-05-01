package com.ARUP;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 5, 6, 7, 8};
                change (arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] nums) {
        nums [5] = 32;
    }
}
