package homework6;
/*16. Write a Java program to add two binary numbers.
        Input Data:
        Input first binary number: 10
        Input second binary number: 11
        Expected Output:
        Sum of two binary numbers: 101*/
import java.util.Scanner;
public class  Programme016BinaryNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter 1st binary number:");
            String number1 = scanner.next();

            System.out.print("Enter 2st binary number:");
            String number2 = scanner.next();

            System.out.println("Sum of binary number" + number1 + "and" + number2 + "is:" + add(number1, number2));

        }
    }
        public static String add(String num1, String num2){
            int num1Binary = Integer.parseInt(num1, 2);
            int num2Binary = Integer.parseInt(num2, 2);
            int sumOfNumber = num1Binary + num2Binary;
            return Integer.toBinaryString(sumOfNumber);
        }
    }




       // Scanner scr = new Scanner(System.in)


       /* long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = in.nextLong();

        while (binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}*/
