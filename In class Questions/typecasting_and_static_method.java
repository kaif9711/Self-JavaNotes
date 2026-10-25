public class typecasting_and_static_method
{
    public static void main(String[] args)
    {
        //widning type casting
        int x =9;
        double y = x;
        System.out.println(y);
        //narrowing_type_casting();

    }

     static void narrowing_type_casting()               //this is static method // static method belong to the class, and does not require an object to call itself
    {
        double i= 101.33;
        int x = (int) i;
        System.out.println(x);
    }
}

class casting
{
    public static void main(String[] args)
    {
        typecasting_and_static_method obj = new typecasting_and_static_method();
        //obj.narrowing_type_casting();            // non static method of other class can be called by object
        typecasting_and_static_method.narrowing_type_casting();    //static method can be called in other class without needing an object
    }


}
