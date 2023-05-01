package com.ARUP;

public class Overloading {
    public static void main(String[] args) {
        //fun(24);
        //fun("Arup");
        int ans = sum(2, 3, 6);
        System.out.println(ans);

    }
    static int sum(int a, int b) {
       // System.out.println("First");
       // System.out.println(a);
        return a+b;
    }
    static int sum(int a, int b, int c) {
       // System.out.println("Second");
        //System.out.println(name);
        return a+b+c;
    }
}
