package day6;
import java.util.Scanner;

//Write a static function toBinary.
// which is the same as saying that 106 = 64 + 32 + 8 + 2.

public class ToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();

        if (num<=0){
            System.out.print("Invalid............!");
        }else {
            int calBinary = 1;
            int arrayLength = 0;
            int[] outputArray = new int[num];

            while (calBinary <= num) {
                outputArray[arrayLength] = calBinary;
                arrayLength++;
                calBinary *= 2;
            }
            arrayLength--;

            System.out.print("The Binary Number of "+num+ " is : ");
            for (int i = arrayLength; i != -1; i--) {
                if (outputArray[i] <= num && outputArray[i] != 0) {
                    System.out.print(outputArray[i]+" + ");
                    num -= outputArray[i];
                }
            }
        }
    }
}


