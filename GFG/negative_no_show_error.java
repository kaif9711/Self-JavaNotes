//Questions:
// Take a number n from user and print sum of first n natural numbers.
// If user enters a negative number show error and exit

import java.util.Scanner;

public class negative_no_show_error{
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
