package day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.printf("Enter the year (greater then 1582) : ");
        int year = scanner.nextInt();
        if (year >=1582){
            if (((year % 4) == 0 && (year % 100) != 0 ) || (year % 400) == 0 ){
                System.out.printf(year +" is leap year.");
            }else {
                System.out.printf(year +" is not leap year.");
            }
        }
    }
}
