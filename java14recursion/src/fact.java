public class fact {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println(ans);
    }
    static int factorial(int n){
        if(n<=1) {  //Base condition
            return 1;
        }
        return n*factorial(n-1);
    }
}
