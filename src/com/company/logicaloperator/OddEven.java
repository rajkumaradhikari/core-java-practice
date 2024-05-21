package com.company.logicaloperator;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        int output = number%2;
        if (output==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
