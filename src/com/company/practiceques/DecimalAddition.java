package com.company.practiceques;

import java.util.Scanner;

public class DecimalAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double first = input.nextDouble();

        System.out.println("Enter second number : ");
        double second = input.nextDouble();
        System.out.println("The sum of two number is "+ (first + second));

    }
}
