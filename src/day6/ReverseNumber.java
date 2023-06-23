package day6;

import java.util.Scanner;

//Reverse a number
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in num variable.
        System.out.print("Enter Any Number : ");
        int num = scanner.nextInt();

        int reverse = 0;
        while (num!=0){
            int digit = (num % 10);
            reverse = ((reverse * 10)+digit);
            num/=10;
        }
        System.out.print("The Reverse a Number : "+reverse);
    }
}
