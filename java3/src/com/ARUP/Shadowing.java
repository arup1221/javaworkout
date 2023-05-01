package com.ARUP;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);// for this print 90
        int x ; //the class variable at line 4 is shadowed by this
        x = 10;
        System.out.println(x); // for this print 10
        fun();
    }
    static void fun() {
        System.out.println(x);  // for this print 90
    }
}
