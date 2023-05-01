package code.arup;
//leetcode 448: Find all the numbers disappeared in an array
import java.util.ArrayList;
import java.util.List;

public class NumbersDisappearedinArray {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add();
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1; //here the "correct" is the index of the array
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        //just find missing number
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ans.add(index + 1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp =arr [first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
