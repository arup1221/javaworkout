package code.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(fibo(n));
//        for (int i = 0; i < 11; i++) {
//            System.out.println(fiboformula(i));
//        }
        System.out.println(fiboformula(50));//try to use long
    }
    static int fiboformula(int n){
        // just for demo, use long insted
       // return (int)(Math.pow(((1 + Math.sqrt(5))/2),n));
       // return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));

        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n))/Math.sqrt(5)); //2 zero
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}