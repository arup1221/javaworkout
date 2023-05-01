public class noofdigits {
    public static void main(String[] args) {
        int n = 10;
        int  b = 2; //here 10 in binary
        int ans = (int)(Math.log(n)/Math.log(b)) +1;
        System.out.println(ans); // 4 digits 1010
        // time complexity = log n
    }
}
