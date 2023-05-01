package code.java;

public class Numbersexamplerecursion {
    public static void main(String[] args) {
        //writes a function that takes in a number and prints it
        //prints first 5 numbers : 1 2 3 4 5 Numbers example
        print(1);
    }

    static void print(int n) {
        //base condition
        if (n == 5) {
            System.out.println(5);
            return;
        }
        //body 
        System.out.println(n);
        //recursion call
        //if you are calling a function again and again, you can treat it as a separate call in the stack

        


       //this is called tail recursion
        //this is last function call
        print(n + 1);

    }
}
