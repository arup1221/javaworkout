package com.ARUP;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        //String message = greet();
        //System.out.println(message);
        //Scanner in = new Scanner(System.in);
        //System.out.print("Enter Your Name: ");
        //String name = in.next();
        String Personalised = mygreet("Nancy");
        System.out.println(Personalised);

    }
    static String mygreet(String name2) {
        String message = "Hello " + name2;
        return message;
    }

//    static String greet() {
//        String greeting = "how are you";
//        return greeting;
//    }
}
