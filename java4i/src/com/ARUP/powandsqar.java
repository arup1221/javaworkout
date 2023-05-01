package com.ARUP;

import java.util.Scanner;

public class powandsqar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b = Math.pow(a,3);
        double e = Math.pow(a,2);
        double d = Math.pow(a,0.5);
        double c = Math.sqrt(a);
        System.out.println(b);
        System.out.println(e);
        System.out.println(c);
        System.out.println(d);

    }
}
