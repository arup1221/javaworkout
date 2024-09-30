package consolio;

import java.util.HashMap;
import java.util.Scanner;

public class longSubSeq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        int longestLength = findLongestSubsequence(arr, k);
        System.out.println(longestLength);
    }
    public static  int findLongestSubsequence(int[] arr, int k){
        HashMap<Integer, Integer> map  = new HashMap<>();
        map.put(0, -1);
        // is crucial for handling the case where the sum of elements
        // from the very beginning of the array up to some index is
        // divisible by K.
        int PrefixSum =0;
        int maxLength = 0;
        // Iterate through the array to calculate prefix sums
        for(int i=0; i<arr.length; i++){
            PrefixSum += arr[i];
        // Find remainder of prefix sum when divided by K
            int reminder = PrefixSum % k;
            // Handle negative remainders
            if (reminder <0) {
                reminder += k;
            }
            if(map.containsKey(reminder)) {
                int previosIndex = map.get(reminder);
                int len = i - previosIndex;

                if (len > maxLength){
                    maxLength = len;
                }
            }
            else{
                // Store the first occurrence of this remainder
                map.put(reminder, i);
            }
        }
        return maxLength;
    }
}


//        Enter the length of the array: 5
//        Enter the array elements: 2 7 6 1 4
//        Enter the value of K: 3
//
//        The length of the longest subsequence whose sum
//        is divisible by 3 is: 4


//        Enter the length of the array: 6
//        Enter the array elements: 3 1 2 6 5 4
//        Enter the value of K: 5
//        The length of the longest subsequence whose sum
//        is divisible by 5 is: 5
