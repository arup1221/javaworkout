package com.ARUP;

import java.util.Scanner;

public class Conditionalstatement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the salary: ");
        int salary = in.nextInt();
        if(salary>10000){
           // salary += 1000;
            salary = salary + 1000;
        }
        else if(salary>5000){
            salary += 500;
        }
        else{
            salary += 100;
        }
        System.out.println("The salary is: " + salary);
    }
}
