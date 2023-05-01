import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int[] arr = {5,4,3,2,1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;

        }
        int mid = arr.length /2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid)); // copy of the previous array and create a new array
        int[] right = mergesort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0; // for first array
        int j = 0;// for second array
        int k = 0;// for the new array
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arrays is not completed
        //copy the remaining elements
        // for the remaining elements
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<first.length){
            mix[k] = first[j];
            j++;
            k++;
        }
        return mix;
    }
}