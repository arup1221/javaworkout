package com.ARUP;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }
    //return the value

    static int sum2() {
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = in.nextInt();
        sum = num1 + num2;
       return sum;

    }
    static void sum() {
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.print("The Sum =  " + sum);

    }
    /*
     return_type name () {
     // body
     return statement;
     }
     */


}
