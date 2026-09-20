import java.io.IOException;
// If the parent method does not throw any exception,
// then the overriding child method cannot throw a checked exception


public class method_overriding_3
{
    void show()                                 // parent method does not throw any exception
    {
        System.out.println("Parent");
    }
}

class Child1 extends method_overriding_3
{
//    void show() throws IOException            // this is checked exception so this will not run
    void show() throws ArithmeticException      // this is unchecked exception
    {
        System.out.println("Child");
    }

    public static void main(String[] args){
        method_overriding_3 obj1 = new method_overriding_3();
        obj1.show();

        method_overriding_3 obj2 = new Child1();
        obj2.show();
    }


}
