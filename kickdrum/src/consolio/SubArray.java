package consolio;
import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3, 0};
//        int k =0;
//        System.out.println(subarraySum(arr, 6));

        System.out.println(subarraySumZero(arr));
    }
    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // sum , freq
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int more = sum-k;
            if( map.containsKey(more)){
                ans += map.get(more);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return ans;
    }
    public static int subarraySumZero(int[] nums) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initial condition: sum 0 occurs once

        for(int i = 0; i < nums.length; i++){
            sum += nums[i]; // Calculate cumulative sum

            if(map.containsKey(sum)){ // Check if this sum has been seen before
                ans += map.get(sum); // If yes, add the frequency to the answer
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1); // Update frequency of the sum
        }

        return ans; // Return the count of subarrays with sum zero
    }
}
