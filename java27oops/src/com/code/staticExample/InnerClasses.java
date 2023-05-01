package com.code.staticExample;

// class test {
//   static String name;
//
//    public test(String name){
//        test.name = name;
//    }

import java.util.Arrays;

/*static*/ public class InnerClasses {  //outside classes can't be static
   static class test { // inside class can be static
        String name;

        public test(String name){
            this.name = name;
        }

       @Override
       public String toString() {
           return name;
       }
   }

     public static void main(String[] args) {
         test a = new test("arup");
         test b = new test("Isha");
         Arrays.toString(new int[]{3,35,2,7,});
//         System.out.println(a.name);
//         System.out.println(b.name);
         System.out.println(a);
     }
}
