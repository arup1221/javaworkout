public class uniqueno {
    public static void main(String[] args) {
    int[] arr = {2,3,5,6,2,5,3};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr){
        int unique = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int n = arr[i];
        for(int n: arr){             //for every number in my array
            unique ^= n;   //unique = unique ^n ;
        }
        return  unique;
    }
}
