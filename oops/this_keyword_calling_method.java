public class this_keyword_calling_method
{
    void start()
    {
        System.out.println("Calculator Started");

    }
    void calculate()
    {
        this.start();
        System.out.println("Calculator is in progess");
    }

    public static void main(String[] args)
    {
        this_keyword_calling_method obj = new this_keyword_calling_method();
        obj.calculate();
    }
}
