package com.day5.BasicCorePrograms;
import java.util.Scanner;

//6. Java Program to Compute Quotient and Remainder

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in dividend && divisor variable
        System.out.print("Enter the dividend Number : ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor Number : ");
        int divisor = scanner.nextInt();

        //calculation.
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        //Print Result.
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
