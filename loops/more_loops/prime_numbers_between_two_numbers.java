package more_loops;

import java.util.Scanner;

public class prime_numbers_between_two_numbers
{
    public static void main(String[] args)
    {
        //taking inputes from the user num1 and num 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the last number");
        int num2 = sc.nextInt();

        // this is outer loop whoch itirates from num1 to num2-1
        for(int n=num1; n<num2; n++){
            if(prime_check(n)){
            System.out.println(n);
            }


        }

//        // int result = prime_check(num1, num2);
//        System.out.println("The rime numbers between " + num1 + "and" + num2 + " are" + prime_check(num1, num2));

    }

    public static boolean prime_check(int n)
    {
        for (int i=2; i<n; i++ )
        {
            if (n%i==0){
                return false;
            }
        }
    return true;
    }

}






