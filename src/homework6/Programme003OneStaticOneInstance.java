/*Write a Java programme using the following steps.
        3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme.*/




package homework6;

public class Programme003OneStaticOneInstance {
    //Declare one instance and one static variable.
    int a=10;
    static int b=20;
    //Declare one instance method.
    public void test()
    {
        System.out.println(a);//10
        System.out.println(b);//20

    }

    public static void test1()
    {
        Programme003OneStaticOneInstance obj = new Programme003OneStaticOneInstance();
        System.out.println(obj.a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        Programme003OneStaticOneInstance obj = new Programme003OneStaticOneInstance();
        obj.test();
        System.out.println("-----------");
        test1();
    }
}
