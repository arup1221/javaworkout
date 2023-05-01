package com.code.singleton;

public class Singleton {
   int num = 0;
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getInstance(){
     // check whether 1 obj only is created or not

     if(instance==null){
      instance = new Singleton();
     }
     return instance;


    }

}
