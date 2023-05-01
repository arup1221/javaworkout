package code.arup;

import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycle(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            //here the "correct" is the index of the array
            if (arr[i] != arr[correct]) {
                //arr[i] value of that i'th index
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp =arr [first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
