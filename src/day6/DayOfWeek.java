package day6;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Enter the year (YYYY): ");
        int year = scanner.nextInt();

        if(month >= 1 && month<= 12 && day >=1 && day<= 31 && year >=1000 && year <= 9999 ){
            int y0 = year - (14 - month) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = month + 12 * ((14 - month) / 12) - 2;
            int dayOfWeek = (day + x + 31 * m0 / 12) % 7;

            System.out.println("Day of the week: " + dayOfWeek);
        }else {
            System.out.printf("Invalid .............!");
        }
    }
}
