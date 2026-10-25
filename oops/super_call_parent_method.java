public class super_call_parent_method
{
    void m1()                        // this is overriding
    {
        System.out.println(" parent method ");
    }
}
class xyz4 extends super_call_parent_method
{
    void m1()                       // this is overriding method
    {
        System.out.println( " Child method");
    }

    void display()
    {
        m1();               // this called xyz4 child method
        super.m1();         // this calls immediate super(parent) class method
    }

    public static void main(String[] args)
    {
        xyz4 obj = new xyz4();
        obj.display();     // this calls the display method

    }

}
