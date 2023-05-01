package com.ARUP;

public class Scope {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Arup";

        {   //block scope method
             //int a = 78;// already initialised outside the block in the same method, hence you cannot initialise again
            a = 100;// reassign the original ref value to some other value
            int c = 99;
            name = "Arup";

            //values initialised in this block, will remain in block
            System.out.println(a);
            System.out.println(name);
        }
        int c = 99;
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c);     //cannot use outside the block   // don't write it in the notes bcz it reinitialised in the 19 no line

        //scoping in for loops
        for(int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }
    static void random() {
        int num = 67;
        System.out.println(num);
        //System.out.println(marks);
    }
}
