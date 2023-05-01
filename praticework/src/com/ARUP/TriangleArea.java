package com.ARUP;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length:");
        float side = in.nextFloat();
        System.out.print("Enter the hight:");
        float hight = in.nextFloat();
        float area = (side*hight)/2;
        System.out.print("The Area is:-  " + area);
    }
}
