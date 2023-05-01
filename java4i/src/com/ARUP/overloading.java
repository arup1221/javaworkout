package com.ARUP;
/*The function overloading is basically happens when 2 or more function have the same name
 and they can exist if the parameters are different*/
public class overloading {
    public static void main(String[] args) {
//      fun("arup")  ;
//      fun(34);
//        int ans = sum(2, 3,34);
        int ans = sum(2, 3);
        System.out.println(ans);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static void fun(int a ){
        System.out.println("First one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second One");
        System.out.println(name);
    }
}
