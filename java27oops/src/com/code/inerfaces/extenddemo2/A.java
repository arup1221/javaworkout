package com.code.inerfaces.extenddemo2;

public interface A {
    //static interface methods should always have a body
    //call via the interfaces name
    static void greetingg(){
        System.out.println("Hey i am static method");
    }
    default void fun(){
        System.out.println("Hi  I am A");
    }

}
