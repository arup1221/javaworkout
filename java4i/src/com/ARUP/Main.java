package com.ARUP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the 1st no: ");
        int num1  = in.nextInt();
        System.out.print("Please Enter the 2nd no: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum of two number is: " + sum);
    }
}
