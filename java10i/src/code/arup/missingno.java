package code.arup;
//leetcode 268: Missing number
import java.util.Arrays;

public class missingno {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};

        System.out.println(missingnumber(arr));
    }
    public static int missingnumber(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]; //here the "correct" is the index of the array arr[4] = 4
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
            //search for first missing no
            for (int index = 0; index < arr.length; index++) {
               //case 1
                if(arr[index]!= index){
                   return index;
               }

            }

        //case 2
        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp =arr [first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
