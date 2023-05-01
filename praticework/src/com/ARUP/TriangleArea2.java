package com.ARUP;

import java.util.Scanner;

public class TriangleArea2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter side 1: ");
        float a = in.nextFloat();
        System.out.print("Please Enter side 2: ");
        float b = in.nextFloat();
        System.out.print("Please Enter side 3: ");
        float c = in.nextFloat();
        float s = (a + b + c)/2;
        //float B = s * (s-a) * (s-b) * (s-c);
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("The area is: " + area);
    }
}
