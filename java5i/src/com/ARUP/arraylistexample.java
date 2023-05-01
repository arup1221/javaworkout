package com.ARUP;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylistexample {
    public static void main(String[] args) {
        // Syntax
        //ArrayList<Integer/String> list = new ArrayList<Integer>();
                   //here you cannot  pass primitives like int here you have to pass wrapper class                         //this datatype is not much important
        ArrayList<Integer> list = new ArrayList<>(20);
        Scanner in = new Scanner(System.in);
//        list.add(324);
//        list.add(34);
//        list.add(24);
//        list.add(32);
//        list.add(4);
//        list.add(3);
//        list.add(2);
//        System.out.println(list.contains(32));//--> true
//        System.out.println(list.contains(343323));//--> false

//        System.out.println(list);//--> all the no above mentions
//        list.set(0,98);//--> oth index change to 99
//        list.remove(4);//--> 4 is gone means the 4th index
//        System.out.println(list);
        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");// pass index here, list[index] syntax will not work here
        }
        System.out.println();
        System.out.println(list);
    }
}
