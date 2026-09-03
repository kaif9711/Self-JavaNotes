// Naive wat to solve, not efficient

import java.util.Scanner;

public class check_prime
{
    public static boolean prime_method(int n)
    {


        if (n == 1)
        {
            return false;
        }

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String [] args){
        System.out.println("Enter the number to check prime or not : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime_method(n)); // Example usage
    }

}

