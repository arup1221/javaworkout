package com.ARUP;

public class maxwealth {
    public static void main(String[] args) {
      int[][]  accounts =     {
                            {1,5},
                            {7,3},
                            {3,5}
                              };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth2(int[][] accounts) {
       // person = row and account = column
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            //when you start a new col, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            //now check sum of accounts of  person
            //check with the overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return  ans;
    }
    static int maximumWealth(int[][] accounts) {
        // person = row and account = column
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            //when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            //now check sum of accounts of  person
            //check with the overall ans
            if(sum > ans){
                ans = sum;
            }
        }
        return  ans;
    }
}
