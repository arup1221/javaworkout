package code.java;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b'); //ascy values
        System.out.println("a"+ "b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
         // this is same as after a few steps: "a" + "1"
        //Integer will be converted to Integer that will call toString()
        System.out.println("Arup" + new ArrayList<>());
        System.out.println("Arup"+ new Integer(56));
        String ans = new Integer(56) + " "+new ArrayList<>();
        System.out.println(ans);
        System.out.println("a"+'a'); //here one of the character is string "a" so the another character is also 'a' string

    }
}
