package com.ARUP;

import java.util.Scanner;

public class Updated {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();
        switch (empId) {
            case 1:
                System.out.println("Arup");

                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                    default:
                        System.out.println("No Department Entered");

                }

                break;
            case 2:
                System.out.println("Nancy");


            switch (department) {
                case "IT":
                    System.out.println("IT Department");
                    break;
                case "Management":
                    System.out.println("Management Department");
                default:
                    System.out.println("No Department Entered");

            }
                break;


            default:
                System.out.println("Enter correct empId");
        }
    }
    }

