public class countsetbits {
    public static void main(String[] args) {
        int n = 234567;
        System.out.println(Integer.toBinaryString(n)); // use to convert integer to binary
        System.out.println(setbits(n));
    }

    static int setbits(int n) {
        int count = 0;
//        while(n>0){
//            count ++;
//            n -= (n & -n);
//        }
        while (n>0){
            count ++;
            n = n & (n-1);
        }
            return count;
    }
}
