package com.code.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human arup = new Human(34, "arup");
       // Human quin = new Human(arup);  //object clo ning

        Human twin = (Human)arup.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 235;

        System.out.println(Arrays.toString(twin.arr));

        System.out.println(Arrays.toString(arup.arr));

    }
}
