package more_loops;

import java.util.Scanner;

public class perfect_number
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is perfect number or not");
        int num = sc.nextInt();
        int digit = 0;
        int sum= 0;

        for (digit = 1; digit<num; digit++ ){
            if(num%digit==0)
            {
                sum = sum + digit;
            }
            }
        System.out.print("Sum of factors is " + sum);

        if(sum==num)
        {
            System.out.println("The number is a perfect number");
        }
        else
        {
            System.out.println("The number is not a perfect number");
        }

    }
    }


