package day2.switchStatement;

import java.util.Scanner;

//2. Write a Program to print the month name for the given number
public class MonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter in Month Number : ");
        int num = scanner.nextInt();

        String print = null;
        switch (num){
            case 1:
                print="Jan";
                break;
            case 2:
                print="Feb";
                break;
            case 3:
                print="March";
                break;
            case 4:
                print="April";
                break;
            case 5:
                print="May";
                break;
            case 6:
                print="Jun";
                break;
            case 7:
                print="July";
                break;
            case 8:
                print="August";
                break;
            case 9:
                print="September";
                break;
            case 10:
                print="Octumber";
                break;
            case 11:
                print="November";
                break;
            case 12:
                print="December";
                break;
            default:
                print="invalid......!";

        }
        System.out.printf("Is "+print+" Month.");
    }
}
