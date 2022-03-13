package homework6;
//Write a Java program that takes three numbers as input to calculate and
//print the average of the numbers.


//public class Programme013AvgNumber {
    /*public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;
        System.out.println("Avg =");
        System.out.println((a + b + c) / 3);
    }
}*/
import java.util.Scanner;

public class Programme013AvgNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();

             System.out.println("Average of five numbers is: " +
                (num1 + num2 + num3 ) / 3

             );
    }
}
