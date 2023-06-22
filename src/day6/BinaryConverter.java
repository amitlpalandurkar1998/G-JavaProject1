package day6;

import java.util.Scanner;
//BinaryConverter

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in num variable.
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();

        if (num<=0){
            System.out.print("Invalid............!");
        }else {
            // calculation.
            int calBinary = 1;
            int arrayLength = 0;
            int[] outputArray = new int[num];

            while (calBinary <= num) {
                outputArray[arrayLength] = calBinary;
                arrayLength++;
                calBinary *= 2;
            }
            arrayLength--;

            //print Result.
            System.out.print("The Binary Number of "+num+ " is : ");
            for (int i = arrayLength; i != -1; i--) {
                if (outputArray[i] <= num && outputArray[i] != 0) {
                    System.out.print(1 + " ");
                    num -= outputArray[i];
                } else {
                    System.out.print(0 + " ");
                }
            }
        }
    }
}
