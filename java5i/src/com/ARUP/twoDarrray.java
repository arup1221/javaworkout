package com.ARUP;

import java.util.Arrays;
import java.util.Scanner;

public class twoDarrray {
    public static void main(String[] args) {
        //     int[][]  arr = new int[3][]; //first one is row size that is mandatory and the 2nd one is column size that is not mandatory
        //  int[][] arr = new int[3][3];
         int[][] arr2D = {
                            {1,2,3}, //0 th index
                            {4,5,},// 1st index
                            {6,7,8,9}//2nd index
                            };
//         here arr2d[2] = {6,7,8,9}
//         & arr2d[2][0] = 6;
//         */
        Scanner in = new Scanner(System.in);
        //  int [][] arr = new int[3][4];
        // System.out.println(arr.length);//--> 3
//        int[][] arr = new int[3][3];
//        //input
//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = in.nextInt();
//            }
//        }
        //output
            for ( int row = 0; row < 3; row++) {
                for (int col = 0; col < arr2D[row].length; col++) {
                    System.out.print(arr2D[row][col] + " ");
                }
                System.out.println();

            }
        //output
        for (int row = 0; row < 3; row++) {
            System.out.println(Arrays.toString(arr2D[row]));

        }
//         for(int[] a : arr){
//             System.out.println(Arrays.toString(a));
//         }


        }
    }
//}
