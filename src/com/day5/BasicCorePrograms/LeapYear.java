package com.day5.BasicCorePrograms;
//2. Leap Year
//a. I/P -> Year, ensure it is a 4-digit number.
//b. Logic -> Determine if it is a Leap Year.
//c. O/P -> Print the year is a Leap Year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in inputYear variable
        System.out.printf("Enter the year (YYYY) : ");
        int inputYear = scanner.nextInt();

        // calculation. and print Result.
        String checkLeap = null;
        if (inputYear >= 1000 && inputYear <= 9999){
            if (((inputYear % 4) == 0 && (inputYear % 100) != 0 ) || (inputYear % 400) == 0 ){
                checkLeap="Leap";
            }else {
                checkLeap="Not Leap";
            }
            System.out.printf(inputYear+" is a "+checkLeap+ "Year.");
        }else {
            System.out.println("Invalid......!");
            System.out.println("Please Enter Minimum & Maximum 4-digit number.");
        }
    }
}
