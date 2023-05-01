package com.ARUP;

import java.util.Scanner;

public class TempCtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the temp in c : ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.print("The temp in F is : " + tempF);

    }
}
