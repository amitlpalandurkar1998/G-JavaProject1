package IfElseProblems;
// 1. Read a single Digit Number and write in word.
import java.util.Scanner;

public class NumberToWordConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please Enter Any single Digit Number : ");
            int num = scanner.nextInt();
        String inWord = "";
            if( num >=0 && num <= 9){
                if(num == 0){
                    inWord="Zero";
                } else if (num==1) {
                    inWord="One";
                } else if (num==2) {
                    inWord="Two";
                } else if (num==3) {
                    inWord="Three";
                } else if (num==4) {
                    inWord="Four";
                } else if (num==5) {
                    inWord="Five";
                } else if (num==6) {
                    inWord="Six";
                } else if (num==7) {
                    inWord="Seven";
                } else if (num==8) {
                    inWord="Eight";
                } else if (num==9) {
                    inWord="Nine";
                }
            }else {
                inWord="invalid number. please check the number.";
            }
        System.out.printf(num+ " in Word is " +inWord);
    }
}
