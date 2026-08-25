class Car{
    String color;
    int speed;
    double price;
}

public class Test{
    public static void main(String[] args)
    {

        Car car1 = new Car();
        car1.color = "red";
        car1.speed = 100;
        car1.price = 150000;

        Car car2 = new Car();
        car2.color = "blue";
        car2.speed = 200;
        car2.price = 120000;

        Car car3 = new Car();
        car3.color = "yellow";
        car3.speed = 300;
        car3.price = 400000;
    }
}
