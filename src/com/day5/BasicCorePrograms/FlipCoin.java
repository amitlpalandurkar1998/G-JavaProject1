package com.day5.BasicCorePrograms;

import java.util.Scanner;

//1. Flip Coin and print percentage of Heads and Tails.
public class FlipCoin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // get the input from user(How Many Times do You Want To Flip The Coin)
        //&& store in timeToFlipCoin variable.

        System.out.printf("How Many Times do You Want To Flip The Coin : ");
        int timeToFlipCoin = scanner.nextInt();

        // variables
        double flipCoin = 0;
        int countHead = 0, countTail=0;
        double percentageOfHead = 0, percentageOfTail =0;

        // loop for getting random values between 0 and 1 up to
        // How Many Times do You Want To Flip The Coin.
        for (int i=1; i<=timeToFlipCoin; i++){
            flipCoin=(Math.random()*1);
            if (flipCoin<0.5){
                countTail++;
            }else {
                countHead++;
            }
        }

        //print count of head and tail.
        System.out.println("Head  "+ countHead);
        System.out.println("tails  "+ countTail);

        // calculate percentage of head and tail.
        percentageOfHead= (((double) countHead /timeToFlipCoin)*100);
        percentageOfTail=(((double) countTail /timeToFlipCoin)*100);

        //print percentage of head and tail.
        System.out.println("percentage of Heads : "+ percentageOfHead+" % ");
        System.out.println("percentage of Tails : "+ percentageOfTail+ " % ");
    }
}
