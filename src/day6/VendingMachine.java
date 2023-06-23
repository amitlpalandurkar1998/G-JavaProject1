package day6;

import java.util.Scanner;

//Find the Fewest Notes to be returned for Vending Machine.
public class VendingMachine {
    private final int RS_1000 = 1000;
    private final int RS_500 = 500;
    private final int RS_100 = 100;
    private final int RS_50 = 50;
    private final int RS_10 = 100;
    private final int RS_5 = 5;
    private final int RS_2 = 2;
    private final int RS_1 = 1;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the change in Rs. : ");
        int inputRs = scanner.nextInt();

        int count1000=0,count500=0,count100=0,count50=0,count10=0,count5=0,count2=0,count1=0;

        if (inputRs > 0){

            while (inputRs >= 1000){
                count1000++;
                inputRs-=1000;
            }
            while (inputRs>=500){
                count500++;
                inputRs-=500;
            }
            while (inputRs>=100){
                count100++;
                inputRs-=100;
            }
            while (inputRs>=50){
                count50++;
                inputRs-=50;
            }
            while (inputRs>=10){
                count10++;
                inputRs-=10;
            }
            while (inputRs>=5){
                count5++;
                inputRs-=5;
            }
            while (inputRs>=2){
                count2++;
                inputRs-=2;
            }
            while (inputRs>=1){
                count1++;
                inputRs-=1;
            }
            int numOfNotes = count1000+count500+count100+count50+count10+count5+count2+count1;
            System.out.println("the number of minimum Note needed to give is : "+numOfNotes);
            System.out.println("The 1000 Rs. Notes is : "+count1000);
            System.out.println("The 500 Rs. Notes is : "+count500);
            System.out.println("The 100 Rs. Notes is : "+count100);
            System.out.println("The 50 Rs. Notes is : "+count50);
            System.out.println("The 10 Rs. Notes is : "+count10);
            System.out.println("The 5 Rs. Notes is : "+count5);
            System.out.println("The 2 Rs. Notes is : "+count2);
            System.out.println("The 1 Rs. Notes is : "+count1);
        }else {
            System.out.print("Invalid.............!");
        }
    }
}
