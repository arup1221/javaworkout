package com.ARUP;

import java.util.Scanner;

public class TemperatureCtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the Temperature in C: ");
        float tempC = in.nextFloat();
        float tempF = ((tempC * 9)/5) + 32;
        System.out.print("The Temperature in F is: "+ tempF);
    }
}
