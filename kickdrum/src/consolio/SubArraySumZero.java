package consolio;
import java.util.*;
public class SubArraySumZero {
    public static void main(String[] args) {
        int[] arr = {1,-1,2, -2};
        System.out.println(subarraysumzeero(arr));
    }
    public static int subarraysumzeero(int[] nums){
        return subarraySum(nums, 0);
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
}
