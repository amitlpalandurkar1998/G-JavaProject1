package com.day5.BasicCorePrograms;
//5. Factors
//a. Desc -> Computes the prime factorization of N using brute force.
//b. I/P -> Number to find the prime factors
//c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//d. O/P -> Print the prime factors of number N.

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in num variable
        System.out.printf("Enter Any number: ");
        int num = scanner.nextInt();

        //calculation.
        if (num < 1 ){
            System.out.println("Invalid......!");
            System.out.println(num + " is not a valid Number.");
        } else if (num ==1) {
            System.out.print("The prime factors of "+num+ " is "+num);
        } else {
            System.out.print("The prime factors of "+num+ " is ");
            while ((num % 2) == 0){
                System.out.print(2 +" ");
                num/=2;
            }
            for (int i=3; i<=num; i+=2){
                while ((num % i) == 0){
                    System.out.printf(i+" ");
                    num/=i;
                }
            }
            if (num > 2){
                System.out.print(num);
            }
        }
    }
}
