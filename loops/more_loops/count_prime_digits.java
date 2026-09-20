//Q11. Count Prime Digits
//Take a number and count how many of its digits are prime digits (2, 3, 5, 7).
//Example: 235871 → 5

package more_loops;

import java.util.Scanner;

public class count_prime_digits
{
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt(); ///3452
        int sum = 0;
        while (num != 0)
        {
            int i = num % 10;         //2
            if (prime(i))
            {
                sum = sum + 1;
            }
            num = num / 10;

        }
        System.out.println("Total prime digits are " + sum);
    }

    public static boolean prime(int n)
    {

        if(n==2 || n==3 || n==5 || n==7){
            return true;}
            else{ return false;}

//        for (int i = 2; i <= 7; i++)
//        {
//            if (n == 2)
//            {
//                break;
//            }
//
//            if (n % i == 0)
//            {
//                return false;
//            }
//
//        }
//        return true;
    }
}


