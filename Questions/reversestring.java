import java.util.*;

public class reversestring {
    public static void main(String[] args) {
        String originalString = "hello World";
        String reverseString = reverse(originalString);

        System.out.println(originalString);
        System.out.println(reverseString);
    }
    public static String reverse(String s){
        StringBuilder rev =  new StringBuilder();
        for(int i= s.length() - 1; i>0; i--){
            rev.append(s.substring(i, i+1));
        }
        return rev.toString();
    }

}
