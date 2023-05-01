package code.java;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Arup Gope Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); //insted it not changing the original one, it is creating an another object
        // because the strings are immutable in JAVA
        System.out.println(name);

        System.out.println(name.indexOf('o'));
        System.out.println(name.indexOf('A'));
        System.out.println("     Arup ".strip()); //it removes the extra spaces
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
