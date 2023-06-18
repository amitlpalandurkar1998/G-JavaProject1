package day3;
import java.util.ArrayList;
//8) Java Program to print the duplicate elements of an array.

public class DuplicateElements {
    public static void main(String[] args) {
        int [] array ={2,13,1,3,2,6,4,5,8,7,4,9,8,6,1,2,4,13};

        int temp = 0;

        // ArrayList to store the output
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i] == array[j]){
                    temp =array[i];
                    if (al.contains(array[i])) {
                        break;
                    }
                    else {
                        al.add(array[i]);
                        System.out.println(temp);
                    }
                }
            }
        }
    }
}
