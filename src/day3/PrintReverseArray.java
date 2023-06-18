package day3;
//6) Java Program to print the elements of an array in reverse order
public class PrintReverseArray {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,7,8,9,10};

       for(int i = array.length - 1; i>=0 ;i--){
        System.out.printf(array[i]+",");
       }
    }
}
