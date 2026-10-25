public class encapsulation
{
    //private instance variables
    private int age;
    private String name;

    encapsulation(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

//    public void setInput(int age, String name)
//    {
//        this.age = age;
//        this.name = name;
//    }

    public void getOutput()
    {
        System.out.println("Age and Name is " + age + " - " + name );
    }

    public static void main(String[] args)
    {
        encapsulation obj1 = new encapsulation(25, "Kaif");

        obj1.getOutput();
    }
}
