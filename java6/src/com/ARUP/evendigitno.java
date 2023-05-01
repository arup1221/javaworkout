package com.ARUP;

public class evendigitno {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findnumbers(nums));
        System.out.println(digitnum(0));
        System.out.println(digitnum2(0));
        System.out.println(even(1232));
    }
    static int findnumbers(int[] nums){
        int countable = 0;
        for(int num : nums){
            if(even(num)){
                countable ++;
            }
        }
        return countable;
    }
    //function to check whether a num is cotains even digit or not
     static boolean even(int num) {
    int numberofdigits = digitnum(num);
         /*if(numberofdigits % 2 == 0){
        return true;
    }
    return  false;*/
         return numberofdigits % 2 == 0;
     }
        //count no of digits in a number
    static int digitnum2(int num){
        if(num<0){
            num = num*-1;
        }
        if(num==0){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }
     static int digitnum(int num) {
        if(num<0){
            num = num*-1;
        }
        if(num==0){
            return 1;
        }
     int count = 0;
     while(num>0){
         count++;
         num /= 10;
     }
     return  count;
    }

}
