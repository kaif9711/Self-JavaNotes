//### Question
//
//        **Write a Java program to find the GCD (Greatest Common Divisor) of two numbers entered by the user.**
//
//        The program should:
//
//        * Take two integers `a` and `b` as input.
//        * Find the **smaller** of the two numbers.
//        * Check all numbers from `1` up to the smaller number.
//        * Determine which numbers divide **both `a` and `b` exactly**.
//        * Store the **largest common divisor**.
//        * Print the GCD.
//
//        ### Example
//
//        **Input:**
//
//        ```text
//        12
//        18
//        ```
//
//        **Output:**
//
//        ```text
//        6
//        ```
//
//        Because the common divisors of `12` and `18` are:
//
//        ```text
//        1, 2, 3, 6
//        ```
//
//        and the greatest one is **6**.

import java.util.Scanner;

public class gcd_of_two_numbers
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the two number a and b");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x;
    if (a>b){
        System.out.println("B is Smaller");
        x = b;
    }
    else
    {
        System.out.println("A is small");
        x=a;
    }
    int ans = 1;
    for(int i=1; i<=x; i++){
        if(a%i==0 && b%i==0){
            ans = i;
        }
    }
        System.out.printf("the gcd of %d and %d is %d", a,b, ans);



    }




}
