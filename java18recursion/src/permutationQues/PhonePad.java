package permutationQues;

import java.util.ArrayList;

//17. Letter Combinations of a Phone Number {not implemented in leetcode need hashmap}
public class PhonePad {
    public static void main(String[] args) {
       // pad("", "12");
//        System.out.println(padlist("", "12").size());
//        System.out.println(padcount("", "12"));
        System.out.println(padlist("", "12"));
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; //this will convert '2' into 2
        for (int i = (digit-1)*3; i < digit * 3 ; i++) {

            char ch = (char)('a' + i);

            pad(p+ch,up.substring(1)); // only taking

        }
    }
    static ArrayList<String> padlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; //this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit * 3 ; i++) {

            char ch = (char)('a' + i);

           list.addAll( padlist(p+ch,up.substring(1))); // only taking

        }
        return list;
    }
    static int padcount(String p, String up ){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; //this will convert '2' into 2


        for (int i = (digit-1)*3; i < digit * 3 ; i++) {

            char ch = (char)('a' + i);
            count = count + padcount(p+ch,up.substring(1));
        }
        return count;
    }

}
