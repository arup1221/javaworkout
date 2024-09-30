package consolio;

public class candy {
//    public static void main(String[] args) {
//        int[] arr = {4,5,7,2,15,20};
//        int m = 7;
//        int ans =0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] % 5 == 0){
//                ans++;
//            }else if(m>= arr[i]){
//                ans++;
//                m -= arr[i];
//            }
//        }
//        System.out.println(ans);
//    }
public static void main(String[] args) {
    int[] arr = {5,6,7,9,10};
    int a = 2;
    int b = 3;
    int c = 1;

    int divident = a*b +c;
    int ans = -1;
    for (int i = 0; i < arr.length; i++) {
        if(divident == arr[i]){
            ans = i;
            break;
        }
    }
    System.out.println(ans);
}
}
