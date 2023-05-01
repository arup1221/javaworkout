package com.ARUP;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        fun(35, 453);
        multiple( 2,3,"Arup", "Google");

    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
