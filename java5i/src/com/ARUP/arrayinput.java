package com.ARUP;

import java.util.Arrays;
import java.util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
      int n = in.nextInt();
      
        int ar[] = new int[n];
        System.out.print("Enter the Elements of the Array: ");
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();

        }
        System.out.print("The value of array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i]+ " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(ar));
    }
}
