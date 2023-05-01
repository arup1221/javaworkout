package prog10;

import java.util.*;

public class TryP {
    int c;
    void div(int a, int b){
        try{
            c = a/b;
            System.out.println("Result = " +c);
        }
        catch (ArithmeticException ex){
            System.out.println("Cannot divide by zero");
        }

    }

    public static void main(String[] args) {
        TryP obj = new TryP();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = in.nextInt();
        int b = in.nextInt();
        obj.div(a,b);
    }
}
