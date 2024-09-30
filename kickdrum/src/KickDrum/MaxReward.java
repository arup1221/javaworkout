package KickDrum;

import java.util.*;

public class MaxReward {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] jobs = new int[n][3];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = scanner.nextInt(); // Start day
            jobs[i][1] = scanner.nextInt(); // End day
            jobs[i][2] = scanner.nextInt(); // Reward
        }

        int ans = getMaxReward(n, jobs);
        System.out.println(ans);
    }

    public static int getMaxReward(int n, int[][] jobs) {
        // Sort jobs by their end times
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[1]));

        // dp[i] will be the maximum reward we can get by considering up to the i-th job
        int[] dp = new int[n];
        dp[0] = jobs[0][2];

        for (int i = 1; i < n; i++) {
            // Option 1: Do not include this job
            dp[i] = dp[i - 1];

            // Option 2: Include this job
            int reward = jobs[i][2];
            // Find the last job that ends before the current job starts
            int j = binarySearch(jobs, i);
            if (j != -1) {
                reward += dp[j];
            }

            dp[i] = Math.max(dp[i], reward);
        }

        // Maximum reward is the value in the last element of dp array
        return dp[n - 1];
    }

    private static int binarySearch(int[][] jobs, int index) {
        int low = 0, high = index - 1;
        int startTime = jobs[index][0];

        while (low <= high) {
            int mid = (low + high) / 2;
            if (jobs[mid][1] < startTime) {
                if (mid + 1 <= high && jobs[mid + 1][1] < startTime) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
