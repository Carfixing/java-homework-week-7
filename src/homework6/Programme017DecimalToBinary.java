package homework6;
/*Write a Java program to convert a decimal number to binary number.
        Input Data:
        Input a Decimal Number : 5
        Expected Output
        Binary number is: 101*/

import java.util.Scanner;
public class Programme017DecimalToBinary {
    double num;

    public static void main(String[]args){
        Programme017DecimalToBinary  programme017DecimalToBinary = new Programme017DecimalToBinary();
        programme017DecimalToBinary.strbinary();


    }
 public void strbinary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextDouble();
        System.out.println(Integer.toBinaryString((int) num));
 }
}

   /* import java.util.Scanner;
    public class Programme017DecimalToBinary {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            long binaryNumber, decimalNumber = 0, j = 1, remainder;
            System.out.print("Input a binary number: ");
            binaryNumber = sc.nextLong();

            while (binaryNumber != 0)
            {
                remainder = binaryNumber % 10;
                decimalNumber = decimalNumber + remainder * j;
                j = j * 2;
                binaryNumber = binaryNumber / 10;
            }
            System.out.println("Decimal Number: " + decimalNumber);
        }
    }*/

