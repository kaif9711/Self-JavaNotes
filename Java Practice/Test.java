public class Test{
    public static void main (String[] arg) {

        method1(arg);
        method2(arg);
    }
    public static void method1(String[] arg) {
        System.out.println("Hello" + arg[0]);
        System.out.println("Welcome to Java World");
    }

    public static void method2(String[] arg) {
        System.out.println("Name = " + arg[0]);
        System.out.println("Age = " + arg[1]);
        System.out.println("City = " + arg[2]);

    }


}
