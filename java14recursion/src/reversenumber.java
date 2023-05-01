public class reversenumber {

    public static void main(String[] args) {
//       reverse(1234);
//        System.out.println(sum);
        System.out.println(rev2(1221));
        System.out.println(palin(1221));
    }
    static int sum=0;
    static void rev(int n){
        if(n==0){
            return;
        }
        int rem = n % 10;
        sum = sum*10 + rem;
        rev(n/10);

    }

    static int rev2(int n){
        //sometimes you might need some additional variables
        // in the argument in that case, make another function
        int digits = (int)(Math.log10(n)) + 1; //If the argument is equal to 10^n for integer n, this method will return n
        return helper(n,digits);
    }

     static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n %10;
        return rem *(int)(Math.pow(10,digits -1)) + helper(n/10, digits-1);

    }
    static boolean palin(int n) {
        return n == rev2(n);
    }


}
