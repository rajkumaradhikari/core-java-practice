package com.company.relationoperator;

import java.util.Scanner;

public class OperatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Driving license portal");
        System.out.println("Please enter your age : ");
        int age = input.nextInt();

        if (age>18 && age <55){
            System.out.println("You are eligible to drive");
        }else{
            System.out.println("Not to drive");
        }
    }
}
