package com.ARUP;
//leetcode 744: Find the smallest letter Greater than target
public class smallestno {

    public static void main(String[] args) {
        char[] arr = {'c','f','j'};//for using single character use single cote('a')
        char target = 'f';
        char ans = ceiling(arr, target);
        System.out.println(ans);
    }
    // it returns the greater of smallest character
    public static char ceiling(char[] letters,char target){

        int start = 0;
        int end = letters.length- 1;
        while(start<= end){
            //find the middle element
            int mid = start + ((end - start)/2);
            if(target< letters[mid]){
                end = mid -1;
            }
            else {
                start = mid +1;
            }

        }
        return letters[start % letters.length]; //because it only give zero(0) when 3%3 means the 0th index means wrap it
    }

}
