package com.ARUP;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;
        int b = 0;
        int count = 2;
        while(count<= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println(b);
    }
}
/* a b
   0
 */