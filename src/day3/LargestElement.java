package day3;
//3) Java Program to print the largest element in an array
public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 50, 60, 30, 35, 40, 45};

        int larger_num =numbers[0];
        for(int element : numbers){
            if (element>=larger_num){
                larger_num=element;
            }
        }
        System.out.printf("The Larger Number in the Array is "+ larger_num);
    }
}
