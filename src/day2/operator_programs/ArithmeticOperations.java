package day2.operator_programs;

import java.util.Scanner;

//1. Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any Number (a) : ");
        int a = scanner.nextInt();
        System.out.println("Enter Any Number (b) : ");
        int b = scanner.nextInt();
        System.out.println("Enter Any Number (c) : ");
        int c = scanner.nextInt();

        int sum1 =(a+b*c);
        int sum2 =(c+a/b);
        int sum3 =(a%b+c);
        int sum4 =(a*b+c);

        System.out.println("Result 1 : "+ sum1);
        System.out.println("Result 2 : "+ sum2);
        System.out.println("Result 3 : "+ sum3);
        System.out.println("Result 4 : "+ sum4);

        int max_num;
        if (sum1>= sum2 && sum1>= sum3 && sum1>= sum4) {
            max_num=sum1;
        } else if (sum2>= sum1 && sum2>= sum3 && sum2>= sum4) {
            max_num=sum2;
        } else if (sum3>= sum2 && sum3>= sum1 && sum3>= sum4) {
            max_num=sum3;
        } else  {
            max_num=sum4;
        }

        int min_num;
        if (sum1<= sum2 && sum1<= sum3 && sum1<= sum4){
            min_num=sum1;
        } else if (sum2<= sum1 && sum2<= sum3 && sum2<= sum4) {
            min_num=sum2;
        } else if (sum3<= sum2 && sum3<= sum1 && sum3<= sum4) {
            min_num=sum3;
        }else {
            min_num=sum4;
        }

        System.out.println("The Maximum Number is : "+max_num);
        System.out.println("The Minimum Number is : "+min_num);
    }
}
