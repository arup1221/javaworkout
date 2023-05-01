package com.ARUP;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter two numbers");
       float  num1 = in.nextFloat();
        float num2 = in.nextFloat();
         float sum = num1 + num2;
        System.out.println("The Sum of two Number is : "+ sum);
    }
}
