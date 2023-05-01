package com.code.properties.polymorphism;

public class Numbers {
    double sum(double a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(3,4);
        obj.sum(5,2,1);
//        obj.sum(3,4,2,5);
    }
}
