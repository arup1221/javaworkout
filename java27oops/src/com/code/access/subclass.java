package com.code.access;

public class subclass  extends A{
    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subclass obj = new subclass(35,"sa");
        int n = obj.num;

        System.out.println(obj instanceof Object);


    }
}
