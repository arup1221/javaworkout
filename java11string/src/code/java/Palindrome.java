package code.java;

import java.util.Locale;

public class Palindrome  {
    public static void main(String[] args) {
    String str ="malayalam";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str) {
        if(str == null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            //when i use arr.length that time i dont need to use length()
            // but in string i need to use length() here in String the length() use as a function but internally it is same
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i); // use i bcz end point is every time change in string
            if(start!= end){
                return false;
            }
        }
    return true;
    }
}
// Time complexity is 0(N)
