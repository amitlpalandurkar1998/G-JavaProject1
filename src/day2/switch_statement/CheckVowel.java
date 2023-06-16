package day2.switchStatement;

import java.util.Scanner;

//1. Write a Program to Check Vowel or Consonant
public class CheckVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Any Single Alfabet : ");
        char alf = scanner.next().toLowerCase().charAt(0);

        switch (Character.toLowerCase(alf)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf(alf + " is a Vowel.");
                break;
            default:
                System.out.printf(alf + " is a consonant.");
        }

    }
}
