package code.java;

import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibo(n));
    }
    static int fibo(int n){

        //base condition
        if (n<2){
            return n;
        }
        //this is not tail recursion
        return fibo(n-1) + fibo(n-2);//recursion call
    }
}
