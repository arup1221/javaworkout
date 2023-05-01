package com.code.access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }
    // it basically a number representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
       // return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num ==((ObjectDemo) obj).num;
    }
    //covered  string representation
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//covered  gets called when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(45, 65.8f);
        ObjectDemo obj2 = new ObjectDemo(45,78.9f);
        //ObjectDemo obj2 = obj;

        if(obj1==obj2){ // == is a compatitor
            System.out.println("Obj is equal to obj2");
        }
        if(obj1.equals(obj2)){ //.equals to is a method
            System.out.println("Obj is equal to obj2");
        }

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        System.out.println(obj1.getClass().getName());
    }
}
