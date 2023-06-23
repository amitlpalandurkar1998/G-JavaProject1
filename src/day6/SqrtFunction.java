package day6;

import java.util.Scanner;

public class SqrtFunction {
    public static double sqrt(double c){

        //Logic
        double epsilon = 1e-15;
        double t = c;  // initialize t with c

        // if first term is greater than second term then update the t.
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (((c / t )+ t) / 2.0);  // update t with the average of c/t and t
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SqrtFunction sqrtFunction = new SqrtFunction();

        //Get the input From User.Store in c variable.
        System.out.print("Enter Any nonnegative number (c) : ");
        double c = scanner.nextDouble();

        //assign input value of c in sqrt() method and get output in result.
        double result = sqrt(c);
        System.out.print(result);
    }
}
