// check whener a number n is odd or even.

import java.util.Scanner;
public class odd_or_even {
    public static void main(String[] args){
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.print("Number is even");
        }
        else
        {
            System.out.print("Number is Odd");
        }
    }
}
