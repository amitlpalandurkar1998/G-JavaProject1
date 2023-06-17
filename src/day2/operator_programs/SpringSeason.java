package day2.operator_programs;

import java.util.Scanner;

//2. Write a program SpringSeason.java that takes two int values m and d
// from the command line and prints true if day d of month m is between
// March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter value of Month in Number (M) :");
        int m = scanner.nextInt();
        System.out.printf("Enter value of Day in Number (D) :");
        int d = scanner.nextInt();

        boolean is_this_springSeason ;
        if (m==3 && d>=20 && d<=31){
            is_this_springSeason=true;
        } else if (m==4 && d>=1 && d<=30) {
            is_this_springSeason=true;
        } else if (m==5 && d>=1 && d<=31) {
            is_this_springSeason=true;
        } else if (m==6 && d>=1 && d<=20) {
            is_this_springSeason=true;
        }else {
            is_this_springSeason=false;
        }
        System.out.printf("Is This Spring Season : "+ is_this_springSeason);
    }
}
