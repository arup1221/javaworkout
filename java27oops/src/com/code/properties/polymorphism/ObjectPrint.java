package com.code.properties.polymorphism;

public class ObjectPrint  {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }
    // it is run time decide

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(34);
        System.out.println(obj);
    }
}
