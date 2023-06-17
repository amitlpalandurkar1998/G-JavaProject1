package day1;

import java.util.Scanner;

//1.4 To find the sum of command-line arguments and count the invalid integers entered.
public class CountInvalid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter Any Even Number (num1) : ");
        int num1=scanner.nextInt();
        System.out.printf("Enter Any Even Number (num2): ");
        int num2=scanner.nextInt();
        System.out.printf("Enter Any Even Number (num3): ");
        int num3=scanner.nextInt();
        System.out.printf("Enter Any Even Number (num4): ");
        int num4=scanner.nextInt();

        int valid_num=0;
        int in_valid_num=0;
        if(num1%2==0){valid_num+=1;}else {in_valid_num+=1;}
        if(num2%2==0){valid_num+=1;}else {in_valid_num+=1;}
        if(num3%2==0){valid_num+=1;}else {in_valid_num+=1;}
        if(num4%2==0){valid_num+=1;}else {in_valid_num+=1;}

        System.out.println("The even Number is Valid Number and Odd Number is InValid Number.");
        System.out.println("The valid Number is "+ valid_num);
        System.out.println("The InValid Number is "+ in_valid_num);

    }
}
