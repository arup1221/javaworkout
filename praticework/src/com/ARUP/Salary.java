package com.ARUP;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        if (salary>30000) {
            salary += 3000;
        } else if (salary>20000){
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
        {

        }
    }
}
