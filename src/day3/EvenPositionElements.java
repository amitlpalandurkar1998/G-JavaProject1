package day3;
//5) Java Program to print the elements of an array present on an even position
public class EvenPositionElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        for (int i=1; i<array.length; i+=2){
            System.out.println("Elements at even positions : "+ array[i]);
        }
    }
}
