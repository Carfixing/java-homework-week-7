/*Write a Java programme using the following steps.
        4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme.*/




package homework6;

public class programme004 {
    //Declare two instance and two static variable.
    int a=10;//instance variable
    int b =20;//instance variable
    static int c=30;//static variable
    static int d=40;//static variable
    //Declare one instance method.
    public void test()
    {
        System.out.println(a);//10
        System.out.println(b);//20
        System.out.println(c);//30
        System.out.println(d);//40

    }

    public static void test1()
    {
        programme004 obj = new programme004();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        programme004 obj = new programme004();
        obj.test();
         System.out.println("-----------");
        test1();
    }

}


