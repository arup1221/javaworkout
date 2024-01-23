import java.util.*;

public class twosum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] ans = twoSums(arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                + ans[1] + "]");
    }

    // public static int[] twoSum2(int[] arr, int target){
    //     return twoSums(arr.length, arr, target);
    // }
    public static int[] twoSums( int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;  // so update ans
            }
            mpp.put(arr[i], i);  //putin hashtables
        }
        return ans;

    }
}
