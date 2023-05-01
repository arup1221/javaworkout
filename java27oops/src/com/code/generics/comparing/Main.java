package com.code.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Arup = new Student(12,89.76f);
        Student Rahul= new Student(5,99.75f);
        Student harshini = new Student(2,95.75f);
        Student annaya = new Student(13,77.75f);
        Student anushka = new Student(9,96.75f);

        Student[] list = {Arup,Rahul,annaya,anushka,harshini};

        System.out.println(Arrays.toString(list));

//        Arrays.sort(list);
            Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));


//        if(Arup.compareTo(Rahul)< 0){
//            System.out.println(Arup.compareTo(Rahul));
//            System.out.println("Rahul has more marks");
//        }
    }
}
