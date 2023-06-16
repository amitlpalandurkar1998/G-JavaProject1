package day2.forLoop;

import java.util.Scanner;

//3. Write a Program to find Palindrome Number
public class PalindromNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter The Number : ");
        int num = scanner.nextInt();

        int reverseNum = 0;
        for (int i=num; i!=0; i=i/10){
            int digit =(i%10);
            reverseNum = (reverseNum * 10 + digit);
        }

        String result;
        if (num == reverseNum){
            result = (num +" is Palindrome Number.");
        }else {
            result = (num +" is not Palindrome Number.");
        }
        System.out.printf(result);

    }
}
