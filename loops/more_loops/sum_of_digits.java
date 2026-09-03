//Q1. Sum of Digits
//        Take a number from the user and find the sum of its digits.
//        Example: 5832 → 18
package more_loops;

import java.util.Scanner;

public class sum_of_digits
{
    public static void main(String[] args){
//        System.out.println(5382%10);  //2
//        System.out.println(5382/10);  //538
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int x = sc.nextInt();
        int i = 1;                     // taking i =1 w
        int sum = 0;
        while(x!=0){                //x!=0 because when divinding x/10 if it becomes zero loops stops
            i=x%10;                 // i=1  will  keep on replacing the remainder (x%10)
            x=x/10;                 // this is to move forward and find the remainder int (x/10) helps to find the last digit by removing the last decimal

            System.out.println(i);
            sum = (sum +i);
        }
        System.out.println("Total sum is " + sum);



    }
}
