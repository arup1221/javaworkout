package com.ARUP;

import java.util.Scanner;

public class SimpleInter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float p, r, t, SI;
        System.out.print("Please Enter the Principle Amount: ");
        p = in.nextFloat();
        System.out.print("Please Enter the Rate of Interest: ");
        r = in.nextFloat();
        System.out.print("Please Enter the Time(in months) : ");
        t = in.nextFloat();
        SI = ((p*r*t) / 100) + p;
        System.out.print("Total Amount is : " + SI);
    }
}
