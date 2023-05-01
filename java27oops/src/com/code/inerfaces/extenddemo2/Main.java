package com.code.inerfaces.extenddemo2;



public class Main implements A,B { //implementation for interfaces
//    @Override
//    public void fun() {
//
//    }

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greetingg();
    }

    @Override
    public void fun() {
        A.super.fun();
    }
}
