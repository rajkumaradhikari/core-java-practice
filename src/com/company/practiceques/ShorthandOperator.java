package com.company.practiceques;

import java.util.Scanner;

public class ShorthandOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 5;
        System.out.println("Enter any number : ");
        int number = sc.nextInt();
        number += a;
        System.out.println(number);

        System.out.println("Enter second number : ");
        int secondNumber = sc.nextInt();
        secondNumber -= a;
        System.out.println(secondNumber);

    }
}
