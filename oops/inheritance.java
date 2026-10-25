public class inheritance
//single level inheritance
{
    void eat()
    {
        System.out.println("Eating ");
    }
}
class dog extends inheritance
{
    void sleep()
    {
        System.out.println("Sleep");
    }

    public static void main(String[] args)
    {
        inheritance a = new inheritance();
        a.eat();
        //a.sleep();
        System.out.println("-------------------------");

        dog max = new dog();
        max.eat();
        max.sleep();
System.out.println("-------------------------");
        //multilevel inheritance
        cat candy = new cat();
        candy.eat();
        candy.run();
        candy.sleep();

        System.out.println("-------------------------");
        bird1 crow = new bird1();
        crow.eat();
    }
}
//multilevel inheritance
class cat extends dog{

    void run()
    {
        System.out.println("Running");
    }
}

// for heirarical inheritance class dog and class birds inherits properties of inheritance class
class bird1 extends inheritance{

}
