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

