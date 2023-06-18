package day3;
//7) Java Program to print the elements of an array present on odd position
public class PrintOddPosition {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,7,8,9,10,11};

        for (int i=0 ; i<array.length; i+=2){
            System.out.println("Elements at Odd positions : " + array[i]);
        }
    }
}
