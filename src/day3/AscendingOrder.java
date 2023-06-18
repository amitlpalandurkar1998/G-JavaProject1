package day3;
//9) Java Program to sort the elements of an array in ascending order
public class AscendingOrder {
    public static void main(String[] args) {
        int [] array = {13,62,55,674,98,23,48,97,85,25,64,69,11};

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " < ");
        }
    }
}
