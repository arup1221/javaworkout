package com.code.questionanswer;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Sing sing = new Sing();
        sing.walk();
        sing.fly();
        sing.singh();

    }
}
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}
class Sing extends Bird {
    void singh() {
        System.out.println("I am singing");
    }
}
