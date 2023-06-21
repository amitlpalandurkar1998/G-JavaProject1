package day6;
import java.util.Scanner;
//2. Perfect Number

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in num variable.
        System.out.print("Enter Any Number : ");
        int num = scanner.nextInt();

        int sum =0;
        if (num <=0){
            System.out.print("Invalid Number........!");
        }else {
            for (int i=1; i< num; i++){
                if ((num % i)==0 ){
                    System.out.print(i+" + ");
                    sum+=i;
                }
            }
            System.out.print((sum/2));
            if (sum==num){
                System.out.println(" = "+sum);
                System.out.println(num + " is a Perfect Number.");
            }else {
                System.out.println("\n"+num+ " is not a Perfect Number.");
            }

        }

    }
}
