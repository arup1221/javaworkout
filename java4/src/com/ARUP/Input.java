package com.ARUP;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[5];
//        arr[0] = 42;
//        arr[1] = 332;
//        arr[2] = 22;
//        arr[3] = 231;
//        arr[4] = 4;
        //[42, 332, 22, 231, 4];
        //System.out.println(arr[3]);
        //input using for loops
        //for (int i = 0; i < arr.length; i++) {
            //arr[i] = in.nextInt();
        //}
       // System.out.println(Arrays.toString(arr));
        //for (int i = 0; i < arr.length; i++) {
          //  System.out.print(arr[i] + " ");

        //}
        // for each loop
       // for (int num : arr) { //for every element in array, print the element
         //   System.out.print(num + " "); //here num represents element of the array
        //}
        //System.out.println(arr [5]); //index out of bound error bcz try to print more than 5 numbers (Starts from 0)
       // }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//            System.out.print(Arrays.toString(arr));
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();

        }
      System.out.println(Arrays.toString(str));
        //modify
         str[1] ="nancy";
        System.out.println(Arrays.toString(str));
    }
}
