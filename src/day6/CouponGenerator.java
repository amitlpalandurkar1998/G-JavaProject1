package com.pratice;

import java.util.Random;
import java.util.Scanner;

public class CouponGenerator {
    public static void main(String[] args) {
        int outPutArrayParameter = 0;
        String [] collectionOfOutPut = new String[outPutArrayParameter];
        while (true){
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter '0' To Generat Coupan Code : ");
            int generatCoupan = scanner.nextInt();

            if (generatCoupan==0){
                char [] alfa ={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                        'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                        'X', 'Y', 'Z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                        'v', 'w', 'x','y', 'z','1','2','3','4','5','6','7','8','9'};
                int firstNum = random.nextInt(61);
                int secondNum = random.nextInt(61);
                int thirdNum = random.nextInt(61);
                int fourthNum = random.nextInt(61);
                int fifthNum = random.nextInt(61);
                int sixthNum = random.nextInt(61);

                char firstAlfa = alfa[firstNum];
                char secondAlfa = alfa[secondNum];
                char thirdAlfa = alfa[thirdNum];
                char fourthAlfa = alfa[fourthNum];
                char fifthAlfa = alfa[fifthNum];
                char sixthAlfa = alfa[sixthNum];


                System.out.println("The Coupon Code is : "+firstAlfa+" "+secondAlfa+" "+thirdAlfa+" "+fourthAlfa+" "+fifthAlfa+" "+sixthAlfa);

            }else {
                System.out.print("Invalid...........!");
                break;
            }
        }
    }
}
