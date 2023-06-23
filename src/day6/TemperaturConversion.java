package day6;

import java.util.Scanner;

public class TemperaturConversion {
    public void CelsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the temperature in Celsius : ");
        double tem_c = scanner.nextDouble();

        double calInFahrenheit = ((tem_c * ((double) 9 /5)) + 32);
        System.out.printf("The Temperature Celsius to Fahrenheit is : "+calInFahrenheit);
    }
    public void FahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the temperature in fahrenheit : ");
        double tem_f = scanner.nextDouble();

        double calInCelsius = ((tem_f - 32) * ((double) 5 /9));

        System.out.printf("The Temperature Fahrenheit to Celsius is : "+calInCelsius);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperaturConversion temperaturConversion = new TemperaturConversion();

        System.out.println("If you Want to convert the Temperature Celsius to Fahrenheit then press '0' ");
        System.out.println("If you Want to convert the Temperature Fahrenheit to Celsius then press '1' ");
        System.out.print("Please Enter The input : ");
        int num = scanner.nextInt();

        if (num==0){
            temperaturConversion.CelsiusToFahrenheit();
        } else if (num==1) {
            temperaturConversion.FahrenheitToCelsius();
        }else {
            System.out.printf("Invalid...........!");
        }
    }
}
