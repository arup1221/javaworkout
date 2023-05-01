package com.ARUP;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    //array of objects
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 //       int arr[] = new int[5];
//        arr[0]= 43;
//        arr[1]= 343;
//        arr[2]= 34;
//        arr[3]= 35;
//        arr[4]= 45;
//        System.out.println(arr[3]);
//        for (int i = 0; i < arr.length; i++) {
//          arr[i] = in.nextInt();
//        }
          //  System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
//        for(int num: arr){            // here every element in array print the element
//            System.out.print(num + " "); // here num represents element of the array
//        }
        // Array of string datatype
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] = "anushka";
        System.out.println(Arrays.toString(str));
    }

}
