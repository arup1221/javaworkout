package com.ARUP;

public class Typecasting {
    public static void main(String[] args) {
        //typecasting
       // int num = (int)(3234.3224);
        //System.out.println(num); //this is we called typecasting where we change the float value into int value


        //automatic type promotion in expression
        //int a = 258;
       // byte b = (byte)(a); //   258 % 256 = 2
        //System.out.println(" ");
        //System.out.println(b);
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//        System.out.println(d);
//        int number = 'E';
//        System.out.println(number);
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        //float + int - double = double
        System.out.println((f * b) +" "+ (i / c) +" "+ (d * s));
        System.out.println("The result is :" + result);
    }
}
