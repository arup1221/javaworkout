public class sumdigit {
    public static void main(String[] args) {
        int ans = SumofDigit(1342);
        System.out.println(ans);
    }
    static int SumofDigit(int n){
        if(n ==0){  //Base condition
            return 0;
        }
        return  (n%10)+SumofDigit(n/10) ;
    }

}
