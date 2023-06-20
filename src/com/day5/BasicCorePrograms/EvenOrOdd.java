package com.day5.BasicCorePrograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in num variable.
        System.out.printf("Enter Any Number : ");
        int num = scanner.nextInt();

        // calculation. and print Result.
        if((num % 2) == 0){
            if (num < 0){
                System.out.print(num +" is Negative Even Number.");
            }else {
                System.out.print(num +" is Even Number.");
            }
        } else {
            if (num < 0){
                System.out.print(num +" is Negative Odd Number.");
            }else {
                System.out.print(num +" is Odd Number.");
            }
        }
    }
}
