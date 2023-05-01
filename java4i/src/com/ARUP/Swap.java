package com.ARUP;

public class Swap {
    public static void main(String[] args) {
        //Swaping two numbers
        int a = 10;
        int b = 20;
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " " + b);
//        System.out.println(a);
//
        swap(a,b); // here it not change the value
        //System.out.println(a + " "+ b);
        String name = "Arup";
        changename(name);
        System.out.println(name);
    }
    static void changename(String name) {
        name = " Nancy";
    }
        static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        }
        //This change is only valid in this function scope only


}
