import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n,i,n*i);
        }
    }
}
