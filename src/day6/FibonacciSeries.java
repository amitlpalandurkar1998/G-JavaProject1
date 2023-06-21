package day6;

import java.util.Scanner;

//1. Fibonacci Series
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in num variable.
        System.out.print("Enter Any Number : ");
        int num = scanner.nextInt();

        if (num <= 0){
            System.out.print("Invalid Number........!");
        }else {
        int firstNum = 0;
        int secondNum = 1;
        for (int i=2; i<=num; i++){
            int fibonacci=firstNum*(firstNum+secondNum);
            System.out.print(" , "+fibonacci);
            firstNum=secondNum;
            secondNum=i;
        }
        }
    }
}
