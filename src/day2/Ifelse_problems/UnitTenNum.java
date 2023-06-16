package IfElseProblems;

import java.util.Scanner;

public class UnitTenNum {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number (1, 10, 100, or 1000) but not more then 5 digit (99999): ");
                int number = scanner.nextInt();
                    int Unit = 0;
                    int Tens = 0;
                    int Hundreds = 0;
                    int Thousands = 0;


                if (number<=99999){
                    Unit=((number % 10));
                    Tens=(((number / 10) % 10));
                    Hundreds=((number / 100) % 10);
                    Thousands=(number / 1000);
                }else {
                    System.out.printf("invalid . please read care fully and then enter the number.");
                }

        System.out.println(String.valueOf("Unit : "+Unit));
        System.out.println(String.valueOf("Tens : "+Tens));
        System.out.println(String.valueOf("Hundreds : "+Hundreds));
        System.out.println(String.valueOf("Thousands : "+Thousands));

    }
}
