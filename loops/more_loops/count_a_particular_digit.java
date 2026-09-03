//Q4. Count a Particular Digit ( will try it doing with method)
//        Take a number and a digit from the user. Count how many times that digit occurs.
//        Example: Number = 525253, Digit = 5 → 3
//
package more_loops;

import java.util.Scanner;

public class count_a_particular_digit
{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Eneter a number");
    int num = sc.nextInt();

    System.out.println("enter a digit ");
    int digit = sc.nextInt();
    int i = 1;        // i will be assigned new digit everytime
    int count = 0;   // count var to keep track of how many times the digit occured

// extracted the digits
    while(num!=0)
    {
        i = num%10;
        num = num/10;

        //  condition to compare the i(digits) with the digit(variable) from the user
        if (i == digit)
        {
            //System.out.println(" The digit is same " + digit);
            count = count + 1;                // add when the digit is same
        }
//            else{
//                System.out.println("The digit is not same " + digit);
//            }


    }
        System.out.println(" The digits occured " + count + " times");

    }

}
