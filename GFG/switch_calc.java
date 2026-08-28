
//calculator but with switch operator
import java.util.Scanner;

public class switch_calc{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        System.out.println("Choose an Operator from +, -, *, /");
        char op = sc.next().charAt(0);
        switch (op){
            case '+':
                System.out.println(" Addition : " + (num1 +num2));
                break;
            case '-':
                System.out.println(" Subtraction : " + (num1 - num2));
                break;
            case '*':
                System.out.println(" Multiplication : " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                {
                    System.out.print("Division : " + num1 / num2);
                }
                else{
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid Operator");

        }



    }
}
