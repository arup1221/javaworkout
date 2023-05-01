package com.ARUP;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String name ="Arup";
       // System.out.println(a);
      //  System.out.println(name);
        {
            //int a = 78; already initialised outside the block in the same method hence you cannot initialise again.
            a = 34; //here reassign the original ref value to some other value(updating).
            System.out.println(a);
            int c = 99;
            name = "rahul";
            System.out.println(name);
            // value initialised in this block  will remain in the block
        }
        int c = 43;
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c);//we cannot use outside the block
        for (int i = 0; i < 4; i++) {
            System.out.println(i);

        }
        //System.out.println(i); here it cannot print bcz it in outside the for loop
    }
    {
        int a = 78;
    }
}
