package com.day5.BasicCorePrograms;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in a && b variable
        System.out.print("Enter the value of a : ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b : ");
        int b = scanner.nextInt();

        //calculation.
        a=a+b;
        b=a-b;
        a=a-b;

        // Print Result.
        System.out.println("The value of a is : "+a);
        System.out.println("The value of b is : "+b);
    }
}
