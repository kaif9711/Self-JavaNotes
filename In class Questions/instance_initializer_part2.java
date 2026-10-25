public class instance_initializer_part2
{
    {
        System.out.println("hi");   // then initializer block executes after static{} when object is created
    }

    {
        System.out.println("hi-1");     // then initializer block executes after static{}   when obj is created
    }

    static
        {
            System.out.println("hi - 3");   //static initializer block  executes first when class is initialized
        }

    static
    {
        System.out.println("hi - 4");   //static initializer block  executes first when class is initialized
    }
    instance_initializer_part2()
    {
        System.out.println("This is a constructor");    // constr run at the end when object is created
    }

    void show()
    {
        System.out.println("This is a method");
    }

    public static void main(String[] args)
    {
        instance_initializer_part2 obj = new instance_initializer_part2();
    }

}
