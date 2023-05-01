package com.ARUP;

public class Shadowing {
    static int x = 80;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 98;
        //x = 40;
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
