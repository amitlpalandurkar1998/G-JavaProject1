package day2.whileLoop;

import java.util.Scanner;

//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Any integer number : ");
        int num = scanner.nextInt();

        int reversedNum = 0;
        while (num !=0){
            int digit = (num % 10);
            reversedNum = (reversedNum * 10 + digit );
            num = num / 10;
        }
        System.out.printf("The reverse integer number is "+ reversedNum);
    }
}
