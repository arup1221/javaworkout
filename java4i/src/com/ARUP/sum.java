package com.ARUP;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//    int ans = sum2();
//    System.out.println(ans);
   // sum();
        int ans = sum3(34, 87);
        System.out.println(ans);
    }
    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the 1st no: ");
        int num1  = in.nextInt();
        System.out.print("Please Enter the 2nd no: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        //System.out.println("The sum of two number is: " + sum);
        return sum; // here the return means finish, nothing will execute after this, here end
    }
}