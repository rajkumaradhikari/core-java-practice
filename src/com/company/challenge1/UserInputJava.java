package com.company.challenge1;

import java.util.Scanner;

public class UserInputJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = sc.nextLine();
        System.out.println("Good Morning "+name);
        System.out.println(name +", Also tell me your age : ");
        int age = sc.nextInt();
        System.out.println("Your age is "+age);
    }
}
