package com.ARUP;

public class Main {

    public static void main(String[] args) {
	// Q: store a roll number
        int a = 19;

        //Q: store a person's name
         String name = "Arup Gope";

        //Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;
        //syntax
        //datatype[] variable name = new datatype[].. #> {[] this 3rd bracket means this an array;
        //store 5 roll numbers:
       // int [] rnos = new int[5];
        // or directly
        //int [] rnos2 = {23, 12, 34, 65, 87};
        int[] ros; //declaration of array. Here ros is getting defined in the stack.
        ros = new int[5]; // Initialisation : actually here object is being created in the memory (heap).
       // System.out.println(ros[3]); //(run it)*****
        String[] arr = new String[4];
        System.out.println(arr[0]);
        // there is a screenshot plz note it.....
    }
}
