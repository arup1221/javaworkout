package com.code.introduction;

import java.util.Arrays;
import java.util.ArrayList;
import java.sql.Struct;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        // data of 5 students: { roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // here make it all together
        Student[] students = new Student[5];  // it might give error if we dont make a class
        //        Student arup; // now it contains roll no, name and marks;
//        arup = new Student();
        Student arup = new Student(32, "agent venom", 4.0f);
        Student rahul = new Student(34, "lonewolf", 35.00f);
        arup.changename("lonewolf17");
        rahul.changename("hayarrabba");
        Student random = new Student(arup);

        Student random2 = new Student();

        System.out.println(random.name);
        //   arup.greeting();

        // arup.rollno = 42;
        // arup.name = "Arup Gope";
        // arup.marks = 34.34f;
        System.out.println(arup.rollno);
        System.out.println(arup.name);
        System.out.println(arup.marks);
        System.out.println(rahul.rollno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);
        System.out.println(random.rollno);
        System.out.println(random2.name);//it gives default name

        //System.out.println(arup.rollno);
        System.out.println(Arrays.toString(students));
        Student one = new Student();
        Student two = one;
        one.name = "something something";
        System.out.println(two.name);
    }
}
    // previous one give error so make it in class
    // create a class
    // for every single student
     class Student {
        int rollno ;
        String name ;
        float marks ;
        void greeting(){
            System.out.println("Hello my name is "+ name);
            System.out.println("Hello my name is "+ this.name);

        }
//        void changename(String newName){
//            name = newName;
//        }
        void changename(String name){
         this.name = name;
        }

        // we need a way to add the values of the above
        //properties object by object
        // we need one word to access every object
        Student(){
//           this.rollno = 40; //"this" is replaced with "arup" // constuctor
//             this.name = "Arup Gope";
//             this.marks = 36.23f;


            //this is how you call a constructor from another constructor
            //internally: new Student();
            this(23,"default name",34.24f);

        }
//        Student(int roll, String naam, float mark){
//           rollno = roll ;
//            name =naam;
//            marks = mark;
//
//        }
        Student (Student other){
            this.name = other.name;
            this.rollno =other.rollno;
            this.marks = other.marks;

        }
        //Student arpit = new Student(17, "Arpit", 89.09f)
        //here, this will be replaced with arpit
        Student(int rollno, String name, float marks){
         this.rollno = rollno ;
         this.name =name;
         this.marks = marks;

}
    }

// 'this' key word is means what object you referring  to