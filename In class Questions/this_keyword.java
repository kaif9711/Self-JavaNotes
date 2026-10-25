public class this_keyword
{
    int x =10;
    void show(int x)
    {
        System.out.println(this);
    }
    public static void main(String[] args)
    {
        this_keyword obj1 = new this_keyword();
        obj1.show(2);
    }
}
