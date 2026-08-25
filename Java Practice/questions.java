/*
    JAVA PRACTICE QUESTIONS
    Topic: String[] args and Methods


    QUESTION 1:
    Write a Java program that takes the user's name as a
    program argument and prints:

    Hello<name>
    Welcome to Java World

    Example program argument:
    Kaif

    Expected output:
    HelloKaif
    Welcome to Java World


    QUESTION 2:
    Add another method that takes three program arguments:

    Name
    Age
    City

    and prints them in the following format:

    Name = <name>
    Age = <age>
    City = <city>

    Example program arguments:
    Kaif 21 Delhi

    Expected output:
    Name = Kaif
    Age = 21
    City = Delhi


    REQUIREMENTS:
    - Use String[] args (or String[] arg).
    - Do NOT use Scanner.
    - Create a separate method for each question.
    - Call both methods from main().



public class Test {

    public static void main(String[] arg) {

        method1(arg);
        method2(arg);

    }

    // Method for Question 1
    public static void method1(String[] arg) {

        System.out.println("Hello" + arg[0]);
        System.out.println("Welcome to Java World");

    }

    // Method for Question 2
    public static void method2(String[] arg) {

        System.out.println("Name = " + arg[0]);
        System.out.println("Age = " + arg[1]);
        System.out.println("City = " + arg[2]);

    }

}
*/

/*
Question 2
Inside Main, complete the following steps:
Create a method named welcomeMessage
The method should print Welcome to Java!
Call welcomeMessage() inside main()
Note: The method must be static.



public class Test{

    public static void main(String[] arg){

        welcomeMessage(arg);
    }
    public static void welcomeMessage(String[] arg){
        System.out.println("welcome to Java");

    }

}

/*
Question3 Swap Numbers

 public class Test{
     public static void main(String[] args){
         int a = 10;
         int b = 20;
         int temp = 0;
         //temp 10
         temp = a;
         a = b ;
         b = temp;
         System.out.println("Hello World" + a + " and " + b);
     }
 }
 */
/*
Question: Simple Object Structure
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

 */

 /*
Question : Write a Java program to represent a point using a class.
Create a class named Point.
Add two integer variables x and y inside the Point class.
Create another class named Test containing the main() method.
Inside main(), create a Point object and store its reference in a variable named p.
Set x to 10 and y to 20 using the reference variable p.
Print the values of x and y in the same line, separated by a space.

 class Point{
    int x;
    int y;
}
public class Test{
    public static void main(String[] args){
        Point p = new Point();
        p.x = 10;
        p.y = 20;

        System.out.println(p.x + " " + p.y);
    }
}
  */

/*
Write a Java program to demonstrate how two reference variables can refer to the same object.

Your program should:
Create a class named Point.
Add two integer instance variables: x and y.
Create a Point object and store its reference in a variable named p1.
        Set:
p1.x = 10
p1.y = 20
Create another reference variable named p2 and make it refer to the same object as p1.
Change the value of x using p2 to 30.
Print p1.x.
Print p2.x.


class Point{
    int x;
    int y;

}

public class Test{
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point();

        p1.x = 10;
        p1.y=20;

        p2=p1;
        p2.x= 100;

        System.out.println(p1.x + " | " + p2.x);
    }
}
 */
/*

Write a Java program to demonstrate the use of a wrapper class with ArrayList.

Requirements:

Import ArrayList from java.util.
Create a class named Test.
Create an ArrayList that stores Integer values.
Add the numbers 10, 20, and 30 to the list.
Print the entire list.
import java.util.ArrayList;

public class Test{
    public static void main(String[] args){

        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);

        System.out.println(number);
    }
}
 */

/*
Question : Autoboxing & Unboxing Concept
public class Test{
    public static void main(String[] arg){
        int a = 10;
        Integer b = a; // Autoboxing: converting primitive to wrapper class

        int c = b; // Unboxing: converting wrapper class to primitive

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
 */
