package com.ARUP;

import java.util.Arrays;

public class searchin2d {
    public static void main(String[] args) {
        int[][] arr = { //here we can use new int[][] but its not mendetory
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target= 34;
        int[] ans = search(arr,target); //formet of the return value is {row,col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(max2(arr));

    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int  max = Integer.MIN_VALUE;//max =[0][0]; // the Integer.MIN_VALUE holds the minimum value in the max
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }

        }
        return max;
    }
    static int max2(int[][] arr){
        int  max = Integer.MIN_VALUE;//max =[0][0];
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }

        }
        return max;
    }
}
