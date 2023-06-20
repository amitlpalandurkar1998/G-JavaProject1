package com.day5.BasicCorePrograms;
import java.util.Scanner;

//10. Java Program to Find the Largest Among Three Numbers

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in num1,num2 & num3 variable
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // calculation.
        int largestNum = num1;
        if (num2 > largestNum){
            largestNum = num2;
        }
        if (num3 > largestNum){
            largestNum=num3;
        }

        //print Result.
        System.out.printf("The largest number is: "+largestNum);
    }
}
