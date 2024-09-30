package consolio;

import java.util.Scanner;

public class MangoDistribution {

    // Function to calculate nCr (combinatorial)
    public static long binomialCoeff(int n, int k) {
        long ans  = 1;
        if(k> n-k){
            k = n-k;
        }
        for (int i = 0; i < k; i++) {
            ans *= (n-i);
            ans /= (i+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mangoes = scanner.nextInt();  // Input 1: number of mangoes
        int persons = scanner.nextInt();  // Input 2: number of persons

        // Calculate the number of ways to distribute the mangoes
        long ways = binomialCoeff(mangoes + persons - 1, persons - 1);
        System.out.println(ways);  // Output the result
    }
}