package com.day5.BasicCorePrograms;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in num variable
        System.out.printf("Enter Any Number (1 to 30) : ");
        int num = scanner.nextInt();

        //calculation.
        int answer = 0;
        if (num >= 1 && num < 31){
            for (int i=1; i<=num; i++){
            answer= (int) Math.pow(2,i);
            System.out.println("2^"+i+" is "+answer);
            }
        }else {
            System.out.printf("Invalid.....!");
            System.out.printf("Please Enter the Valid Number.");
        }
    }
}
