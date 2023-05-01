package com.ARUP;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
//        greeting();
//        greeting();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }

     static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static void greeting(){
        System.out.println("Hi Arup");
    }
}
