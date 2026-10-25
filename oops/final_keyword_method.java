public class final_keyword_method
{
    final void showmessage()        //method is final so it cannot be overridden
    {
        System.out.println("this is final method from the parent class");
    }
}
class child4 extends final_keyword_method
{/*
    void showmessage()      // we cant override the method even if we inherit the child class from the parent
    {
        System.out.println("this is final method from the child class");
    }
    */
}
class final_demo
{
    public static void main(String[] args)
    {
        child4 obj = new child4();
        obj. showmessage();     // this calls the shomessage() of the parent/super class+
    }

}
