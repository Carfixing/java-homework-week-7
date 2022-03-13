package homework6;
/*Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Programme007Temperature {
    public static void main(String[] args) {temp();}
    public static void temp(){
        float Celsius;
        float Fahrenheit;

        Scanner scr = new Scanner (System.in);
        System.out.println("Please enter temperature in Fahrenheit : ");
        Fahrenheit = scr.nextFloat();
        Celsius= ((Fahrenheit - 32)*5)/9;
        System.out.println("Temperature in celsius is : "+ Celsius);

    }


}
