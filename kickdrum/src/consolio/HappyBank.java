package consolio;

import java.util.Scanner;

public class HappyBank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int money = TotalMoney(n);
        System.out.println(money);
    }

    public static int TotalMoney(int n){
        int totalMoney = 0;
        int totalWeeks = n / 7;
        int remainingDays = n % 7;

        for(int week =0; week<totalWeeks; week++){
            totalMoney += (week + 1) + (week + 2) + (week + 3) + (week + 4) + (week + 5);
        }
        for(int days =0 ; days<remainingDays; days++){
        if(days<5){
            totalMoney += (totalWeeks + 1) + days;
        }
        }


        return totalMoney *100;
//what if (100+200+300+400+500+0+0) +(200+300+400)  = 2400
    }
}
