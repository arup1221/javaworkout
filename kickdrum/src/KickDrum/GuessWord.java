package KickDrum;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
//        guessword(n, arr);// here need to call the function
        int len = 0;
        ArrayList<String> oddLength = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            len = arr[i].length(); // string length
            if(len % 2 == 1){
                oddLength.add(arr[i]);
            }
        }

        if(oddLength.size() == 0){
            System.out.println("Better Luck Next Time");
        }
        else{
            int max = -1;
            String res = "";
            for (String temp : oddLength) { // using enhanced for-loop to iterate
                if (temp.length() > max) {
                    res = temp;
                    max = temp.length();
                }
            }
            System.out.println(res);
        }
    }

    public static void guessword(int n, String[] arr) {  // Accept array of words
        ArrayList<String> oddLength = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            int len = arr[i].length(); // string length
            if (len % 2 == 1) {
                oddLength.add(arr[i]);
            }
        }

        if (oddLength.size() == 0) {
            System.out.println("Better Luck Next Time");
        } else {
            int max = -1;
            String res = "";
            for (String temp : oddLength) { // using enhanced for-loop to iterate
                if (temp.length() > max) {
                    res = temp;
                    max = temp.length();
                }
            }
            System.out.println(res);
        }
    }
}
