package day2.whileLoop;

import java.util.Scanner;

//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Any Natural Numbers (n) : ");
        int Num = scanner.nextInt();
        int sum = 0;

        int i = 0;
        while (i<= Num){
            sum+=i;
            i++;
        }

        System.out.printf("The Sum of (n) number is " + sum + ".");
    }
}
