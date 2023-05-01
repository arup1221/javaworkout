package com.code.singleton;

import com.code.access.A;

 public class subclass extends A {
    public subclass(int num, String name) {
        super(num, name);
//        Object
    }

    public static void main(String[] args) {
        A obj = new A(35,"sa");
//        int n = obj.num;

    }
}
class Subsubclass extends A{

        public Subsubclass(int num, String name) {
            super(num, name);
        }

        public static void main(String[] args) {
            Subsubclass obj = new Subsubclass(35,"sa");
            int n = obj.num;
        }
    }

 class subclass2 extends A {
    public subclass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subclass2 obj = new subclass2(35,"sa");
        int n = obj.num;
    }
}
