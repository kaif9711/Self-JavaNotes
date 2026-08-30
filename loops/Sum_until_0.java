/*
6. Sum Until 0

Keep taking numbers from the user and calculate their sum.

Stop when the user enters 0.

Example:

5
10
20
0

Sum = 35
 */
import java.util.Scanner;

public class Sum_until_0
{
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //1
        int sum = 0;

        while(n!=0){
            System.out.println("Keep entering number , until typed zero");
            sum = sum +n;
            n = sc.nextInt();
        }
        System.out.println("Sum of all numbers is " + sum);
    }

}
