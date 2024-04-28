class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        Solution solution = new Solution();
        int[] mergedArray = solution.merge(arr1, arr2);
        
        System.out.println("Merged array: " + java.util.Arrays.toString(mergedArray));
    }
    
    public int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        int[] mergedArray = new int[m + n];
        
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        while (i < m) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }
        
        while (j < n) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }
        
        return mergedArray;
    }
}
