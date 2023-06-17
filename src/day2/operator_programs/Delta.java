package day2.operator_programs;
import java.util.Scanner;
//3. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)
//Take a, b, and c as input values to find the roots of x.
public class Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();

        int delta = b * b - 4 * a * c;

            int root1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
            int root2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Root 1 of x = " + root1);
            System.out.println("Root 2 of x = " + root2);
    }
}
