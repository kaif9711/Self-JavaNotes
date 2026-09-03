//Q2. Reverse a Number
//        Take a number and print its reverse.
//        Example: 5832 → 2385
package more_loops;

import java.util.Scanner;

public class reverse_a_number
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();         //n =5432

        int i=1;
        int reverse = 0;
        while(n!=0)                     // same logic to extrcat the digits from the number as in question @sum_of_digits
        {
            i = n%10;
            n = n/10;
            reverse = reverse*10 + i;     // currently i is the highest place value of the number e.g:5, this formula begins building the reveres from 5
            System.out.println(i);

        }
        System.out.println("revered number " + reverse);

    }
}
