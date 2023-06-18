package day3;
//10) Find 2nd Largest Number in an Array
public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 50, 60, 30, 35, 40, 45};

        int larger_num =numbers[0];
        int second_larger_num = numbers[0];
        for(int element : numbers){
            if (element>=larger_num){
                larger_num=element;
            }
        }
        for(int element : numbers){
            if (element>=second_larger_num && element!=larger_num){
                second_larger_num=element;
            }
        }
        //System.out.println("1st larger Number in the Array is : " + larger_num);
        System.out.println("Second larger Number in the Array is : "+ second_larger_num);
    }
}
