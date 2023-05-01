package com.code.abstractDemo;

public class Son extends Parent {

    public Son(int age) {
        super(34); //we can create a constructor in  abstract class using super keyword
      //  this.age = age;
    } // here the value is called

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be a Doctor" );
    }
    @Override
    void partner(){
        System.out.println("I love Nancy");

    }
}
