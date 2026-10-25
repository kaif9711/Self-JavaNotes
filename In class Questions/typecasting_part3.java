// a class can have two or more main() due to overloading, with different paramter type/arguments types
public class typecasting_part3
{
    public static void main(String[] main)
    {
        float a = 10.5f;        //
        double b = (double) a;
        System.out.println("narrowing " + b);

        double price = 99.99;
        int i = (int) price;
        System.out.println("widning " + i);
    }

}
