package day2.forLoop;

import java.util.Scanner;

//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.printf("Enter Any Integer Number : ");
        int num  = scanner.nextInt();

        int reverseNum = 0;
        for (int i=num; i!=0;  i=i/10){
                int digit = (i % 10);
                reverseNum = (reverseNum * 10 + digit);
        }
        System.out.printf("is " + reverseNum);
    }
}
