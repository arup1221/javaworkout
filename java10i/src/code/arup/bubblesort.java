package code.arup;
//leetcode 268: Missing Number
import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
    int[] arr = {1,-2,3,0,-5};
    bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
    static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at the respective index
            for (int j = 1; j < arr.length - i ; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j]< arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped){  //here !false = true
                break;
            }
        }
    }
}