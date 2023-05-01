import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        pattrn(4,0);
//        pattrn2(4,0);
        int[] arr= {4,2,3,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void pattrn2(int r, int c ) {
        if (r == 0) {
            return;
        }
        if (c < r) {

            pattrn2(r, c + 1);
            System.out.print(" * ");
        } else {

            pattrn2(r - 1, 0);
            System.out.println();
        }
    }
    static void pattrn(int r, int c ){
        if(r == 0){
            return;
        }
        if(c<r){
            System.out.print(" * ");
            pattrn(r,c+1);
        }
        else{
            System.out.println();
            pattrn(r-1,0);
        }



//        for (int i = 4; i >0 ; i--) {
//            for (int j = 0; j <i; j++) {
//                System.out.print(" * ");
//            }
//
//            System.out.println();
//
//        }

//        pattrn(n+1);
    }
    static void bubble( int[] arr,int r, int c ) {
        if (r == 0) {
            return;
        }
        if (c < r) {

            if(arr[c] > arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubble(arr, r,c + 1);

        } else {

            bubble(arr,r - 1, 0);

        }
    }
}