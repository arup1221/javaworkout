package com.ARUP;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 42, 323);
        multiple(2,  4,  "Arup", "loves", "Nancy");
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));

    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
