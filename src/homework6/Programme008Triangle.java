package homework6;
/*Write a program to calculate the area of a triangle*/

import java.util.Scanner;
public class Programme008Triangle {
    public static void main(String[]args){
        Programme008Triangle tri = new Programme008Triangle();
        tri.triangle();
    }

    public double triangle (){
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter width :");
        double b = scr.nextDouble();
        System.out.println("Enter height: ");
        double h = scr.nextDouble();

        //Area=(Width*height0/2)
        double area = (b*h)/2;
        System.out.println("Area of Triangel:"+ area);
        return area;
    }
}
