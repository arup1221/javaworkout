package com.code.exceptlonhandleing;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a,b);
//            int c = a / b;
//            throw  new Exception("just for fun");

            String name = "arup";
            if (name.equals("arup")){
                throw new myException("name is arup");
            }
        }
        catch (myException e){
            System.out.println(e.getMessage()); // just print the exception message
        }
        catch (Exception e){
            System.out.println("normal exception"); // just print the exception message
        }
        finally {
            System.out.println("no matter what happen but This will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException(" Please do not divide by zero ");
        }
        return a/b;
    }
}
