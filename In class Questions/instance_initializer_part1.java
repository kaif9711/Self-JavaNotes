public class instance_initializer_part1
{
    int speed;      // instance variable
    {speed = 100;}          // this is instance_intializer of a variable

    void bike_speed()
    {
        System.out.println("speed of bike is " + speed);
    }

    public static void main (String[] args)
    {
        instance_initializer_part1 obj = new instance_initializer_part1();
        obj.bike_speed();
    }
}


