package com.code.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

        //  Integer num = 45;
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
//        final int bonus = 2;
//        bonus = 3; // in this line you can't modify it
        // because you use final keyword which is used to prevent your content modification

        final A arup = new A("arup gope");
        arup.name = "other name";
        // when a non primitive is final, you cannot reassign it;
       // arup = new A("other object"); //can't do this

        A obj = new A("adshfasfjh");
        System.out.println(obj);
       // A obj ;
        for (int i = 0; i < 10000; i++) {
            obj = new A("Random name");
        }

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

    }


}
   class A{
        final int num = 10; //giving an error without an Initialization
        String name;
        public A(String name){
//             System.out.println("object is created");
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }
