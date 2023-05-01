package com.ARUP;
//leetcode 34: Find first and last position of element in sorted array
public class firstandlastposition {
    public static void main(String[] args) {

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        //check for first occurrence if target first
        int start = search(nums,target, true);
        int end = search(nums,target, false);

        ans[0]= start;
        ans[1] = end;
        /* or I can write
        int ans[0] = search(nums,target, true);
        if(ans[0] != -1){
        int ans[1] = search(nums,target, false);
        }
         */
        return ans;
    }

    //this function just returns the index value of target
    static int search(int[] nums, int target, boolean firstindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            //find the middle element
            int mid = start + ((end - start) / 2);
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                if(firstindex){
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}


