import java.util.*;

public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // int fibn = Fib(n);
        int fibn = FibMem(n, new int[n+1]);
        System.out.println(fibn);
    }

    public static int Fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        System.out.println("Hello" + n);
        int fibom1 = Fib(n-1);
        int fibom2 = Fib(n-2);
        int fivn = fibom1 + fibom2;

        return fivn;
    }

    public static int FibMem(int n, int[] qb){
        if(n == 0 || n == 1){
            return n;
        }

        if(qb[n] != 0){
            return qb[n];
        }

        System.out.println("Hello" + n);
        int fibom1 = FibMem(n-1, qb);
        int fibom2 = FibMem(n-2, qb);
        int fivn = fibom1 + fibom2;

        qb[n] = fivn;
        return fivn;
    }
}
