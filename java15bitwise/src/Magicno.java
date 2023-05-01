public class Magicno {
    public static void main(String[] args) {
        int n = 5;
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n&1; //it gives us the last digit in binary
            n = n>>1; //ignore the right zero
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
