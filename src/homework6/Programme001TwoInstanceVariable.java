
//Write a Java programme using the following steps.
//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
//1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the programme.



package homework6;

    public class Programme001TwoInstanceVariable {
        //DEclaring 2 Variable
    int a = 200;
    String name = "Palak";
       //instance method
    public void test() {

        //print statement
        System.out.println(a);
        System.out.println(name);
    }
       //main method
    public static void main(String[] args) {
        Programme001TwoInstanceVariable obj = new Programme001TwoInstanceVariable();
        //call instance method into main method
        //System.out.println(obj.a);
        obj.test();
        // System.out.println(obj.name);
    }


}
