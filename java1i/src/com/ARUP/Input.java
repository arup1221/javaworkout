package com.ARUP;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        System.out.print("Please enter some Input");
        Scanner in = new Scanner(System.in);
//        int rollno= in.nextInt();
//        System.out.println("Your Roll No is " + rollno);
        String name = in.nextLine();
        System.out.println(name);
    }
}
