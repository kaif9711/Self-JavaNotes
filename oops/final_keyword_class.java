// Final class - cannot be extended
public final class final_keyword_class
{
    void mA()
    {
        System.out.println("This is class A.");
    }
}

// Trying to extend a final class will cause a compile-time error
/*
class B extends A
{

}
*/

class FinalDemo
{
    public static void main(String[] args)
    {
        final_keyword_class obj = new final_keyword_class();
        obj.mA();
    }
}
