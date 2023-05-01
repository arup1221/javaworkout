package com.ARUP;

import java.util.Scanner;

public class nestedswich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the  employ Id : ");
        int empId = in.nextInt();
        System.out.print("Enter the department: ");
        String department = in.next();
        switch (empId){
            case 1:
                System.out.println("Arup");
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case"Management":
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("Invalid department");
                        break;
                }
                break;
            case 2:
                System.out.println("Nancy");
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case"Management":
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("Invalid department");
                        break;
                }
                break;
            default:
                System.out.println("Invalid ID");
                break;

        }
    }
}
