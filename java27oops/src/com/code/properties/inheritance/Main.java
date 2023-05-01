package com.code.properties.inheritance;

public class Main {
    public static void main(String[] args) {
      Box box1 = new Box(4, 7.9, 9.9);
      box1.getL();
        Box box2 = new Box(box1);
//        System.out.println(box1.h + " "+ box1.w+" "+ box1.l);
//         Boxweight box3 = new Boxweight();
//         Boxweight box4 = new Boxweight(2,5,6,7);
//        System.out.println(box3.h +" "+ box3.weight);
//
//        Box box5 = new Boxweight(2,3,4,8);
//        System.out.println(box5.w);

        //there are many variable in both parent and child classe
        // you are given access to variable that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor
        // this is why error
//        Boxweight box6 = new Box(2,3,6);
//        System.out.println(box6);

      //  Boxprice box = new Boxprice(3,5,3);
       // box1.greeting();

        Boxweight box = new Boxweight();
        Boxweight.greeting(); // you can inherit but you cannot override
    }
}
