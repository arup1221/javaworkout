package consolio;

import java.util.Scanner;

public class DiffSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int m = in.nextInt();
//        System.out.println(differenceOfSum(n,m));
        System.out.println(isPrime(n));
    }
    public static int differenceOfSum(int n, int m){
        int sum1 =0, sum2 =0, diff =0;
        for(int i=0; i<=m;i++){
            if(i%n==0){
                sum1 +=i;
            }
            else{
                sum2 += i;
            }
            diff = Math.abs(sum1-sum2);
        }
        return diff;
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}
