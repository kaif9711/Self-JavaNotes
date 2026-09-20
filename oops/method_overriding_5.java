//overriding and abstarction method
public class method_overriding_5
{
    public static void main(String[] args){
        Child2 obj1 = new Child2();
        obj1.sound();
    }

}


abstract class Parent1               // created an abstarct class
{
    abstract void sound();             // abstatc method

    void eat()
    {
        System.out.println("Eat");
    }
}

class Child2 extends Parent1
{
    void sound()                      //overriding the abstract method
    {
        System.out.println("Barking");
    }
}


