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

/*
Question :
Write a Java program that takes a string as input from the user using BufferedReader and then displays the entered string.
The program should handle IOException using throws IOException.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test{
    public static void main(String[] arg) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        String name = br.readLine(); //bufferedreader method
        System.out.println("Hello " + name);
    }
}
 */

/*
Question :
Write a Java program that takes an integer as input from the user using BufferedReader,
        converts the input from String to int using Integer.parseInt(), and then displays the entered integer.
        The program should handle IOException using throws IOException.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter the number ");
        Integer number  = Integer.parseInt(br.readLine());

        System.out.println(" The number is " + number);
    }
}
 */

/*
Question :
Write a Java program that takes an integer as input from the user using BufferedReader, converts the input from String to int using Integer.parseInt(), and then displays the entered integer.
        The program should handle IOException using throws IOException.

import java.io.*;
import java.math.*;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter full name");
        String name = sc.nextLine();
        System.out.println("Name is " + name);

        System.out.println("Enter the number");
        Integer number = sc.nextInt();
        System.out.println("Number is " + number);

        System.out.println("Enter your grade");
        float grade = sc.nextFloat();
        System.out.println("Grade is " + grade);
    }
}
 */
/*
Question

Write a Java program to demonstrate the use of System.out.println() and System.out.print() with different data types and expressions.

The program should:

Declare two integer variables x = 10 and y = 20.
Declare a character variable z = 'G'.
Declare a String variable str = "GFG".
        Print x, the sum of x + y, and x and y separated by a space using println().
Print the String "GFG" followed by "Courses" on the same line using print().

public class Test{
    public static void main(String[] args)
    {
    int x = 10;
    int y = 20;
    char z = 'G';
    String str = "GFG";

    System.out.println(x);
    System.out.println(x+y);
    System.out.print(str + " ");
    System.out.print(z);
    }
}
 */

/*
### Question
**Write a Java program to demonstrate arithmetic operators and increment operators.**
The program should:
        * Declare two integers `x = 10` and `y = 20`.
        * Calculate and display their **sum, product, and quotient**.
        * Evaluate the expression `x + y * 10` and display the result.
        * Demonstrate the **post-increment (`x++`)** operator and display both `z` and `x`.
        * Demonstrate the **pre-increment (`++x`)** operator and display both `z` and `x`.

public class Test{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 20;

        int sum = x + y;
        System.out.println("Sum is " + sum);

        int product = x * y;
        System.out.println("product is " + product);

        System.out.println("questiont is " + y/x);

        int z = (x + y * 10);

        z = x++;
        System.out.println(z + " " + x);

        z = ++x;
        System.out.println(z + " " + x);

    }
}

 */

/*
### Question
        **Write a Java program to create a simple username and password login system.**

        The program should:

        * Store a predefined username as `"geek"` and password as `"GEEK"`.
        * Take the username and password from the user using `Scanner`.
        * Compare the entered username and password with the stored values using `equals()`.
        * If both match, print **`Welcome`**.
        * Otherwise, print **`Try Again`**.

import java.util.Scanner;
import java.io.*;

public class Test{

    public static void main(String[] args)
    {
        String usrnm = "greek";
        String psswrd = "geek";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username and password");
        String username = sc.next();
        String password =sc.next();

        if (username.equals(usrnm) && password.equals(psswrd)){

            System.out.println("Welcome");
        }
        else{
            System.out.println("Invalid username or password");
        }
    }
}
*/

/*
Question
Write a Java program to demonstrate the use of compound assignment operators and chained assignment.
The program should:

Declare x = 10, y = 5, and an integer variable z.
Use the += operator to add y to x and display the result.
Use the %= operator to find the remainder when x is divided by y and display the result.
Use chained assignment z = x = y and display the value of z.
public class Test
{
    public static void main(String[] arg)
    {
        int x = 10, y = 5, z;
        x += y;
        System.out.println(x);

        x %= y;
        System.out.println(x);

        z = x = y;
        System.out.println(z);
    }
}
 */

/*
// Question FIND THE Nth Term

import java.util.*;
import java.util.Scanner;

public class Test{

    public static int term(int a, int n, int d){
        ans = a + (n - 1) * d;
        int return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number a :");
        int a = sc.nextInt();

        System.out.print("Enter the First number n :");
        int n = sc.nextInt();

        System.out.print("Enter the First number d :");
        int d = sc.nextInt();

        System.out.println("The nth term is :" + term(2, 1, 3));
    }
}

 */
/*
// Question: Calculate the are of circle ?
import java.util.*;

public class inclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;

        System.out.println("Are of circle is : " + area);
    }
}
 */
/*
// Question :  calculate area of cirlce by creating methods

import java.util.*;
public class Test{

    public static double c_area(double r)
    {

        double area;
        area = Math.PI * r * r;
        return area;
    }

    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius");
        double r = sc.nextDouble();

        System.out.println("Area of circle is :" + c_area(r));
    }
}

 */

/*

// Question :  find the Nth Term of GP
// gp = a*r^(n-1)

import java.util.Scanner;

public class Test{
public static int term(int a, int r, int n)
{
    int gp = (int) (a * Math.pow(r,n-1));
    return gp;

}
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the a(First term) ");
    int a = sc.nextInt();

    System.out.print("Enter the r(Ration)");
    int r = sc.nextInt();

    System.out.print("Enter the n ");
    int n = sc.nextInt();

    System.out.println("Nth term is " + term(a,r,n));
}

}

 */
/*
If else question
// check whener a number n is odd or even.
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.print("Number is even");
        }
        else
        {
            System.out.print("Number is Odd");
        }
    }
}
 */
/*
Questions:
// Take a number n from user and print sum of first n natural numbers.
// If user enters a negative number show error and exit

import java.util.Scanner;

public class Test{
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        if (n<0)
        {
            System.out.print("Invalid");
            return ;
        }

        System.out.println("Sum of first n natural numbers is" + n*(n+1)/2);
    }
}

 */
/*
//Question. Write a Java program to input an integer and determine whether the number is:
//(a) Positive Even 2,4
//(b) Positive Odd 3,1
//(c) Negative Even -2, -4
//(d) Negative Odd -1, -3
//(e) Zero
// The program should accept a number from the user and display the appropriate category.

import java.util.Scanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.print("Number is Positive, ");

            if (n % 2 == 0) {
                System.out.print("Number is Positive Even");
            } else {
                System.out.print("Number is Positive Odd");
            }

        } else if (n < 0) {
            System.out.print("Number is Negative, ");

            if (n % 2 == 0) {
                System.out.print("Number is Negative Even");
            } else {
                System.out.print("Number is Negative Odd");
            }
        } else {
            System.out.print("Zero");
        }
    }
}
 */
