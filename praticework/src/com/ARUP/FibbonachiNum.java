package com.ARUP;

import java.util.Scanner;

public class FibbonachiNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count<=n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            //System.out.print(b + " ");
        }
//        for (int count  = 2; count  <=n ; count ++) {
//            int temp = b;
//            b = b + a ;
//            a = temp;
//            System.out.print( b+ " " );
//
//        }
        System.out.println(b);
    }

}
