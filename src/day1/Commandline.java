package day1;

import java.util.Scanner;

//1.5 To get the name using the command line.
public class Commandline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get The input From User
        System.out.printf("Enter Any Name : ");
        String name = scanner.next().toString();

        System.out.printf("To get the name using the command line. The is : "+name);
    }
}
