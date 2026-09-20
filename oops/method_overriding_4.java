// Rule 2 — Overriding + Exceptions
//
//If the parent method throws an exception, the child overriding method can:
//
//✅ Throw the same checked exception
//✅ Throw a subclass/narrower checked exception
//✅ Throw no exception
//❌ Cannot throw a parent/broader checked exception

public class method_overriding_4
{
    void show() throws  RuntimeException        //Runtimexception is unchecked exception
                                                // if there is checked parent exception then child method must have child class exception
    {
        System.out.println("Parent");
    }
}

class Child extends method_overriding_4
{
    void show() throws ArithmeticException         // ArithmeticException is subclass of Runtimexception
    {
        System.out.println("Child");
    }

    public static void main(String[] args){
        method_overriding_4 obj1 = new method_overriding_4();
        obj1.show();

        method_overriding_4 obj2 = new Child();
        obj2.show();
    }

}
