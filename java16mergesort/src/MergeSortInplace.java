import java.util.Arrays;

public class MergeSortInplace { 
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
    int[] arr = {5,4,35,2,1,6};
    mergesortinplace(arr,0,arr.length);
    System.out.println(Arrays.toString(arr));

}
    static void mergesortinplace(int[] arr, int s, int e){
        if(e-s == 1){
            return ;

        }
        int mid = (s+e) /2;
         mergesortinplace(arr,s,mid);
        mergesortinplace(arr, mid,e);

         mergeInPlace(arr,s,mid,e);
    }
    static void mergeInPlace(int[] arr, int s,int m, int e){
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while(i<m && j<e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arrays is not completed
        //copy the remaining elements
        while(i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
        
    }
}
