package day2.forLoop;

import java.util.Scanner;

//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the (n) Natural Numbers : ");
        int  num = scanner.nextInt();
        int sum = 0;
        for (int i=0; i<=num; i++){
            sum+=i;
        }
        System.out.printf("The Sum of (n) Natural Numbers is "+ sum);
    }
}
