package com.code.abstractDemo;

public abstract class Parent {

    int age;
    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 32423;
    }

    abstract void career();
    abstract void partner();



    void normal(){  // normal method
        System.out.println("This is a normal method");
    }

//    Parent mom = new Parent() {  // we cannot create object in abstract class
//        @Override
//        void career() { // you can create object using this method
//
//        }
//
//        @Override
//        void partner() {
//
//        }
   // abstract Parent(); // we cannot create abstract constructor
     static void hello(){   // we can create static in abstract classes
         System.out.println("Hey");
    };




}
