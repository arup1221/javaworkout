package com.ARUP;

public class peakelement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));

    }
    public static int findPeakElement(int[] nums) {
        return SearchInsertof(nums, 0, nums.length - 1);  // ekhane recursive call kora ho66a
    }
    static int SearchInsertof(int[] nums, int start,int end){

        if(start == end){
            return start;
        }
            int mid = start + ((end - start)/2);
           if(nums[mid]>nums[mid+1]){   //jodi mid ta boro hoi tahole start ar mid er moddey thakbe boro element ta
               return SearchInsertof(nums,start,mid);
           }
           else{  // jodi mid + 1 (element ta) boro hoi thahole mid + 1 ar end er moddy element ta thakbe
               return SearchInsertof(nums,mid + 1,end);
           }

    }
}
