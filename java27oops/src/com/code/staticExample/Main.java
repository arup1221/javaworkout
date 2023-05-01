package com.code.staticExample;

public class Main {
    public static void main(String[] args) {
        Human arup = new Human(32, "Arup", 700, true);
        Human rahul = new Human(32, "Rahul", 4700, false);
        Human arpit = new Human(34, "arpit", 45242, false);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
       // greeting();  // it gives error because greeting is non static
        Main funn = new Main();
        funn.fun2();
    }
    //this is not dependent on objects because it is static
    static void fun(){
//        Main.greeting();  // you can't use this because it requires an instance
        // but the function you are using it in does not depend on instance

        //you cannot access non static stuff without referencing their instances
        // in a static context

        //hence, here I am referencing it
        Main obj = new Main();
            obj.greeting();
    }
        void fun2(){
        greeting();
        }

        //we know that something which is not static, belongs to an object
         void greeting(){
//        fun();
            System.out.println("hello world");
        }

}
