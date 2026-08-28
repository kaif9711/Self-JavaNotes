// calc using if else ladder
import java.util.Scanner;

public class simple_calc
{
    public static void main(String[] args)
    {
        // int x = 0;
        // int y = 0;
        System.out.println("Welcome to Simple Calculator \n Please choose an Operation \n " + " 1.Addition + \n 2.Substarction - \n 3.Multiplication * ");

        Scanner sc = new Scanner(System.in);
        int operator = sc.nextInt();
        if (operator != 1 && operator != 2 && operator != 3)
        {
            System.out.println("Invalid Operator");
        } else
        {
            System.out.println("Enter first number");
            int x = sc.nextInt();
            System.out.println("Enter second number");
            int y = sc.nextInt();

            if (operator == 1)
            {
                System.out.println("Addition : " + (x + y));
            } else if (operator == 2)
            {
                System.out.println("Subtraction : " + (x - y));
            } else if (operator == 3)
            {
                System.out.println("Multiplication : " + (x * y));
            }
        }
    }
}





