package KickDrum;

public class GCD {
    public static void main(String[] args) {
        int a = 8;
        int b = 7;

        System.out.println(gcd(a,b));
    }

    public static int gcd(int a,  int b){
        if( b ==0) return a;

        return gcd(b, a%b);
    }
}
