public class pascalstriangle {
    public static void main(String[] args) {
        // find the sum of n th row
        int n = 5;
        int sum = 0;
        sum = 1<<(n-1);   //1 * 2^(n-1)
        System.out.println(sum);

    }
}
