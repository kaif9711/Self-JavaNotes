public class this_keyword_as_argument
{
    void show(this_keyword_as_argument obj)
    {
        System.out.println("Employee object recieved");
    }

    void start()
    {
        show(this);
    }

    public static void main(String[] args)
    {
        this_keyword_as_argument obj = new this_keyword_as_argument();
        obj.start();
    }
}
