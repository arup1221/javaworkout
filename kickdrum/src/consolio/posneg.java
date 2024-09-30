package consolio;

import java.util.Arrays;

public class posneg {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] res = new int[arr.length];
        int posindex= 0;
        int negindex = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >0){
               res[posindex] = arr[i];
               posindex += 2;
            }
            else{
                res[negindex] = arr[i];
                negindex += 2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
