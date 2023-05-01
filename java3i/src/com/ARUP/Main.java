package com.ARUP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //String a = "Arup";
        //String b = "Arup";


//        if(fruit .equals("mango")){
//            System.out.println("King of Fruits");
//        }
//        if(fruit .equals("apple")){
//            System.out.println("Red fruit");
//        }
            System.out.println("Enter a fruit");
            String fruit = in.next();

            switch (fruit) {
                case "Mango":
                    System.out.println("King of all fruit");
                    break;
                case "Apple":
                    System.out.println("A Sweet red fruit");
                    break;
                case "Orange":
                    System.out.println("A round fruit");
                    break;
                case "Grapes":
                    System.out.println("A small fruit");
                    break;
                default:
                    System.out.println("Please Enter a valid fruit");

            }
        }
    }

