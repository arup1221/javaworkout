package code.java;

import org.w3c.dom.ls.LSOutput;

public class comparison {
    public static void main(String[] args) {
        //In 1st example we we utilise the String pool
        String a = "Arup";
        String b = "Arup";
        String c = a;
        System.out.println(c == a);
        // ==
      //  System.out.println(a==b);
        String name1 = new String("Arup");
        String name2 = new String("Arup");
        System.out.println(name1==name2);
        //it gives false bcz we mentions new Arup where 2 arups are not same object
        System.out.println(name1.equals(name2));//here only value checks
        System.out.println(name1.charAt(2));
    }
}
