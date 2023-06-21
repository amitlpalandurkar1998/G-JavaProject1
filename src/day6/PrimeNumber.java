package day6;
import java.util.Scanner;

//3. Prime Number

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in num variable.
        System.out.print("Enter Any Number : ");
        int num = scanner.nextInt();

        if (num <= 1){
            System.out.printf("0 and 1 are not counted as prime numbers. and also negative integers can not be prime number.");
        }else {
            if (num==2){
                System.out.printf(num+ " is a prime number.");
            }
                for (int i=2; i<num; i++){
                    if ((num % i)==0){
                        System.out.printf(num+ " is a prime number.");
                    }else {
                        System.out.printf(num+ " is not a prime number.");
                    }
            }
        }
    }
}
