package code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = subtractProductAndSum(n);
        System.out.println(answer);
    }
    static int subtractProductAndSum(int n){
        int sum = 0;
        int product = 1;
        while(n>0){
            int rem = n%10;
            n = n/10;
             sum = sum + rem; //sum += rem;
             product = product * rem;//prosuct *= rem;
        }
        return product - sum;
    }
}