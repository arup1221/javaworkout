package com.ARUP;

import java.util.Scanner;

public class Largestno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Three Numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if(b>max){
//            max = b;
//        }
//         if(c> max){
//            max = c;
//        }
        //int max = 0;
//        if(a>b){
//            max = a;
//        }
//        else{
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
        //maximum of  3 numbers
        int max = (Math.max(c,Math.max(a,b)));
        System.out.println("largest no: " +  max);
        //Minimum of three numbers
        int min = (Math.min(c,Math.min(a,b)));
        System.out.println("Smallest no: " + min);
    }
}
