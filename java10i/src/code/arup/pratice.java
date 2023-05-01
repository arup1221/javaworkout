package code.arup;

import javax.swing.*;
import java.util.Arrays;

public class pratice {
    public static void main(String[] args) {
        int[] arr = {3,6,1,2,4,5};
        intertion2(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void intertion2(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
                else{
                    break;
                }
            }


        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
