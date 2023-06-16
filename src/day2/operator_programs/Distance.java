package day2.operator_programs;
//4. Write a program Distance.java that takes two integer command-line arguments x and y and
// prints the Euclidean distance from the point (x, y) to the origin (0, 0).
// The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function.

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter Any Number (x): ");
        int x = scanner.nextInt();
        System.out.printf("Enter Any Number (y): ");
        int y = scanner.nextInt();

        int calculate_distance = (int) Math.sqrt((x*x)+ (y*y));
        System.out.println(calculate_distance);
    }
}
