package day3;

import java.lang.reflect.Array;
import java.util.Scanner;

//2. Java Program to find the frequency of each element in the array
public class ArrayFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 3, 1, 2, 4, 2, 1, 4};

        System.out.printf("Enter Any Number To check The frequency Number in the Array : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int frequency = 0;
        for (int element : array) {
            if (num == element){
                frequency+=1;
            }

        }
        System.out.println("The Frequency of "+num+" is " + frequency + " Times. ");
    }
}
