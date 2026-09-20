public class animal_bird_classes
{
    public static void main(String[] args)
    {
     // object of animal_bird_classes and calling the methods of the animal_bird_classes class
    animal_bird_classes tiger = new animal_bird_classes();
    tiger.eat();
    tiger.sleep();

    }

    public void eat()
    {
        System.out.println("eating");
        //here the lion is out of scope so we cannot call lion.method inside main
        //lion is declared inside eat(), so it only exists within the scope of eat():
        animal_bird_classes lion = new animal_bird_classes();
        lion.sleep();
        lion.eat();

        // object of bird class and calling the method of the bird class
        bird crow = new bird();
        crow.fly();
    }

    public void sleep()
    {
        System.out.println("sleeping");
    }

}

 class bird{

    void fly(){
        System.out.println("flying");
    }


}
