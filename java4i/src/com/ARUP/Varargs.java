package com.ARUP;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
       // fun(34,5,23,67,8,9,5,35,43);
//        multiple(2,4,"arup", "nancy");
//        demo(34,36,88,76);
//        demo("Arup", "nancy");
        //demo(); //ambiguity
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a + " "+ b);

    }
}
