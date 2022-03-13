package homework6;
/*Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r)*/

import java.util.Scanner;
import static java.lang.Math.PI;
public class Programme006Radius {

    public static void main(String[]args){
        Scanner rad = new Scanner(System.in);
        System.out.println("please enter radius:");
        double rd =rad .nextDouble();
        area(rd);

    }

    public static void area(double r){
        double area = PI * (r*r);
        System.out.println("The area of circle:"+area);
    }
}
