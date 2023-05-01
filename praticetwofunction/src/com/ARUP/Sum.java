package com.ARUP;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       // sum();
        //sum();
        //int ans = sum2();
        //System.out.println(ans);
        int ans2 = sum3(2,3);
        System.out.println(ans2);

    }
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
        //System.out.println("ARUP");

    }
     static int sum2() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;

    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println(sum);

    }
}
