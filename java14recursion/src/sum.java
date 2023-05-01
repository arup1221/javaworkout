public class sum {
    public static void main(String[] args) {
        int ans = Sum(3);
        System.out.println(ans);
    }
    static int Sum(int n){
        if(n<=1) {  //Base condition
            return 1;
        }
        return n+Sum(n-1);
    }
}
