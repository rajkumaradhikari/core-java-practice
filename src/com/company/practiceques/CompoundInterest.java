package com.company.practiceques;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter priniciple : ");
        double principle = sc.nextDouble();

        System.out.println("Enter rate : ");
        double rate = sc.nextDouble();

        System.out.println("Enter time  : ");
        double time = sc.nextInt();

        double v = principle * Math.pow((1 + rate / 100), time);
        System.out.println(v);
    }
}
