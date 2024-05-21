package com.company.logicaloperator;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Number Checker");
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }else if(num == 0 ){
            System.out.println("Zero");
        }else{
            System.out.println("Your number is negative");
        }
    }
}
