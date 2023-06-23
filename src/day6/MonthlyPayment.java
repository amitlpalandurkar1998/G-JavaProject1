package day6;

import java.util.Scanner;

//monthly Payment
public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the pay off a (P) principal loan amount : ");
        double principalLoan = scanner.nextDouble();
        System.out.println("Enter the make over (Y) years : ");
        double year = scanner.nextDouble();
        System.out.println("Enter the R Percent Rate : ");
        double percentRate = scanner.nextDouble();

        // Given n=12*year , r = percentRate/(12*100)
        double n = (12*year);
        double r = percentRate/(12*100);
        double calMonthlyPayment = ((principalLoan * r)/(1-(Math.pow((1+r),(-n)))));

        System.out.printf("The Monthly Payment is : "+ calMonthlyPayment);
    }
}
