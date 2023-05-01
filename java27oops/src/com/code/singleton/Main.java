package com.code.singleton;

import com.code.access.A;

public class Main {
    public static void main(String[] args) {
       Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

            //all 3 ref variable are pointing to just one object

        A a = new A(34,"arup");
        a.getNum(); //private
       //int n = a.num;// public

    }
}
