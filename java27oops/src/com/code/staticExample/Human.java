package com.code.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
        static void message(){
            System.out.println("Hello world");
//            System.out.println(this.age); //  you can't use "this." over here
        }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        //this.population += 1;// it does not give error .... but we should we class name insted of this.
        Human.population += 1; // we should not use this. because the population is static means it is common to all
   // such properties are really not related to that object are common to all the object of the class we declared those as static
        Human.message();
    }

 }
