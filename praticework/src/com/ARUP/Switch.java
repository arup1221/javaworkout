package com.ARUP;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //while(true) {
            String fruit = in.next();
            switch (fruit) {
                case "Mango":
                    System.out.println("King of fruits");
                    break;
                case "Apple":
                    System.out.println("The Red Fruit");
                    break;
                case "Orange":
                    System.out.println("The Round Fruit");
                    break;
                case "Banana":
                    System.out.println("The Yellow Fruit");
                    break;
                default:
                    System.out.println("Please Enter a valid Fruit");
            }
        //}
    }
}
