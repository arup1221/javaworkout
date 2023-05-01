package com.ARUP;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         float ans = 0f;
        //take input from user till user does not press  X or x

        while (true) {
            //take operator as input
            System.out.print("Please enter the operator: ");
            int op = in.next().trim().charAt(0);
          //  System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Please Enter two number: ");
                float num1 = in.nextFloat();
                float num2 = in.nextFloat();
               // System.out.println();
                if (op == '+') {
                    ans = num1 + num2;
                }
                 if (op == '-') {
                    ans = num1 - num2;
                }
                 if (op == '*') {
                    ans = num1 * num2;
                }
                 if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                 if(op=='%'){
                    ans = num1 % num2;
                }

            }
            else if(op=='x'|| op =='X'){
                break;
            }
            else{
                System.out.println("Invalid Operator");
           }
            System.out.println("The answer is:" + ans);
        }
    }
}
