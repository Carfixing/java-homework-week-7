
/*Write a program for a calculator with addition, subtraction, multiplication
        and division methods all with parameters and use string concatenation
        methods.(Note: Two static and Two instance methods.)*/
package homework6;
import java.util.Scanner;
public class Programme005 {
    public static void main(String[]args) {
        Scanner adds = new Scanner(System.in);
        System.out.println("Please enter number 1 : ");
        int num1 = adds.nextInt();
        System.out.println("Please enter number 2:");
        int num2 = adds.nextInt();

        Programme005 obj = new Programme005();
        int sums = obj.addition(num1, num2);
        System.out.println("Addition of" + num1 + "and" + num2 + ": =" + sums);

        int subs = obj.subtracts(num1, num2);
        System.out.println("Subtracts of" + num1 + "and" + num2 + ": =" + subs);

        obj.multiple(num1, num2);

        division(num1, num2);
    }
    int result;
    //instance method
    //int is datatype
    //its return result beacause it does not have void

public int addition(int a,int b){
    result=a+b;
    return result;
}

//static method
    public static int subtracts (int a,int b){
    int result = a-b;
    return result;
    }
//Instance method
public void multiple(int a,int b){
    result=a*b;
    System.out.println("Multiplication of " +a+"and"+b+":="+result);

}
//static method
    public static void division(int a,int b){
    int result = a/b;
    System.out.println("division of"+a+"and"+b+":="+result);
    }
}
