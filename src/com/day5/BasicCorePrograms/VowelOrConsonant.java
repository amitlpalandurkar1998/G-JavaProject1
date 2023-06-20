package com.day5.BasicCorePrograms;
//9. Java Program to Check Whether an Alphabet is Vowel or Consonant.

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the input From User.Store in alfabet variable.
        System.out.print("Enter Any Single Alfabet : ");
        char alfabet = scanner.next().toLowerCase().charAt(0);

        // checking alfabet is Vowel or Consonant. Print Result.
        switch (alfabet){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.print("The '"+ alfabet +"' Alphabet is Vowel.");
                break;
            default:
                System.out.print("The '"+ alfabet +"' Alphabet is Consonant.");
                break;
        }
    }
}
