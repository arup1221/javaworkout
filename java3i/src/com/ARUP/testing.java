package com.ARUP;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("TESTING 1");
        String ans = null;
        while (true) {

            System.out.println("Enter the fruit");
            String fruit = in.next();
            switch (fruit) {
                case "Mango":
                     ans = "King of all fruit";
                break;
                case "Apple":
                    ans = "A Sweet red fruit";
                break;
                case "Orange":
                    ans = "A round fruit";
                    break;
                case "Grapes":
                    ans = "A small fruit";
                    break;
                default:
                    System.out.println("Enter a valid fruit");
                break;



            }
            System.out.println(ans);
        }
    }
}
