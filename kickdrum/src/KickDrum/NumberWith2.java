package KickDrum;

import java.util.Scanner;

public class NumberWith2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double ans = (n-1) * 10 + 2;
        System.out.println(ans);
    }
}
