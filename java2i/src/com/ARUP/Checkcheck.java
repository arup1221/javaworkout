package com.ARUP;

import java.util.Scanner;

public class Checkcheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println(in.next().trim());
        //String word = "Hello";
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }

        //System.out.println(ch);
    }
}
