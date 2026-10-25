interface I1
{
    int num = 5;

    void name();  //abstract method
    void age();   //abstract method


    default void show()  //default concrete methods
    {
        System.out.println("This is default method ");
        name();     //calling abstract metho inside
        age();      //calling abstract metho inside
    }

    static void show1()     //static concrete method
    {
        System.out.println("This is static method");
    }
}
interface I2
{
    void display2();       //public abstract void display2();
    default void show3()    //default concrete method of 2nd interface
    {
        System.out.println("Hello from 2nd interface");
    }
}

class xyz6 implements I1, I2
{
    public void name()      //this abstract method need to be overridden and implemented  with same/broader access modifier
    {
        System.out.println("Kaif");
    }
    public void age()      //this abstract method need to be overridden and implemented with same/broader access modifier
    {
        System.out.println("25");
    }
    public void show()    //overridden I1(interface) method with changed implementation
    {
        System.out.println("This is default + overriding method  ");
        I1.super.show();    //Calls I1's original default method implementation from the implementing class // it cannot be called in main() because main() is static
    }
    public void display2()      //this is abstract method of 2nd interface(I2) and implementing it
    {
        System.out.println("--------------");
        System.out.println("This is 2nd interface");
        name();
        age();
        show();
        I1.super.show();    // we can call elements of 1st interface as xyz6 class implements both interfaces
    }

    public static void main(String[] args)
    {
        xyz6 obj = new xyz6(); //

        obj.name(); //calling implemented + overridden abstract method
        obj.age();  //calling implemented + overridden abstract method

        obj.show(); // calling the overridden method
        I1.show1(); // calling the static method of interface

        obj.display2(); // calling the implemented + overridden abstract method od 2nd iterface
        obj.show3();    // calling the default concrete method of 2nd interface



    }


}
