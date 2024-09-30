package consolio;

import java.util.Scanner;

public class WairedNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int k = in.nextInt();
//        int ans2 = weiredNum2(a);
//        System.out.println(ans2);
        if(weiredNum(a, k)){
            System.out.println("Weird Number");
        }
        else{
            System.out.println("not a weired number");
        }
    }

    public static boolean weiredNum(int a, int k){

        if(a % k == 0) return false;

        int digitSum= sumOfDigits(a);

        return digitSum % k == 0;
    }

    public static int sumOfDigits(int a){
        int sum = 0;
        while(a>0){
            int reminder = a % 10;
            sum += reminder;
            a /= 10;
        }
        return sum;
    }


    public static int weiredNum2(int a){
        int sum =0;
        int org = a;
        int ans = 0;

        while(a>0){
            int reminder = a % 10;
            sum += reminder;
            a /= 10;
        }

       if(org % sum ==0){
            ans = org / sum;
           return ans;
       }
        return 0;
    }
}
