package com.day5.BasicCorePrograms;
//4. Harmonic Number
//a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in num variable.
        System.out.printf("Enter Any value of (N) : ");
        int num = scanner.nextInt();

        double harmonicValue = 0;

        //calculation.
        if (num > 0){
            for (int i=1; i<=num; i++){
                harmonicValue+=((double) 1 /i);
            }
        }else {
            System.out.printf("The value Should be Greater Then 0.");
        }

        //print Result.
        System.out.println("Harmonic Value of "+num+" is : "+harmonicValue);
    }
}
