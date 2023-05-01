package code.arup;
//leetcode 287: Find the duplicate array
public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,6,2,5};

        System.out.println(finddup(arr));
    }

    static int finddup(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i] != i +1) {
                int correct = nums[i] - 1; //here the "correct" is the index of the array arr[4] = 4
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }
        static void swap ( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

}
