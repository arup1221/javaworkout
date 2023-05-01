package com.code.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"arup");
        // need to do a few things members
        //1. access the data members
        //2. modify the data members

//        ArrayList<Integer> list = new ArrayList<>();
//        list.DEFAULT_CAPACITY;
           // obj.num; it does not give value because it is private but
        // we can access the value via getter and setter method
            obj.getNum();
        int n = obj.num;
    }
}
