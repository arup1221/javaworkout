package code.java;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        //base function
        if(n<2){
            return 1;
        }
        return (n*fact(n-1));
    }
}
