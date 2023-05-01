package com.ARUP;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st no : ");
        float num1 = in.nextFloat();
        System.out.print("Enter 2nd no : ");
        float num2 = in.nextFloat();
        System.out.print("Enter 3rd no : ");
        float num3 = in.nextFloat();
        float sum = num1 + num2 + num3;
        System.out.print("The sum is :- " + sum);
    }
}
