package day3;
//4) Java Program to print the smallest element in an array
public class SmallestElement {
    public static void main(String[] args) {
        int [] array ={233,267,46,53,614,57,89,58,223,41,65};

        int minimum_num = array[0];
            for (int i=0; i<array.length; i++){
            minimum_num=Math.min(minimum_num,array[i]);
            }
        System.out.printf("minimum "+ minimum_num);
    }
}
