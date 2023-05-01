public class productdigit {
    public static void main(String[] args) {
        int ans = ProductofDigit(1342);
        System.out.println(ans);
    }
    static int ProductofDigit(int n){
        if(n%10 ==n){  //Base condition
            return n;
        }
        return  (n%10)*ProductofDigit(n/10) ;
    }

}
