package KickDrum;

import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(setBit(n));
//        int count =0;
//        while(n != 0){
//            if((n & 1) == 1){ // and operator
//                count++;
//            }
//            n = n>>1;  // right shift done here
//        }
//        System.out.println(count);
    }
    public static int setBit(int n){
        int count = 0;
        while(n != 0){
            if((n & 1) == 1){ // here and operator working
                count++;
            }
            n = n>>1; // right shift doing here
        }
        return count;
    }
}
