//### Question
//
//**Write a Java program to find the LCM (Least Common Multiple) of two integers entered by the user.**
//
//The program should:
//
//        * Take two integers `a` and `b` as input.
//        * Find the larger of the two numbers.
//* Start checking from `max(a, b)`.
//        * Continue checking up to `a * b`.
//        * Find the **first number that is exactly divisible by both `a` and `b`**.
//        * Print that number as the LCM.
//
//        ### Example
//
//**Input:**
//
//        ```text
//12
//        18
//        ```
//
//        **Output:**
//
//        ```text
//36
//        ```
//
//        **Hint:** Use `%` to check whether a number is divisible by both numbers.

import java.util.Scanner;

public class lcm_of_two_numbers{
    public static void main(String[] args){
        System.out.println("Enter the two number a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = (a*b);          //ans will be if there are no least common multiples (a*b)
        int x;
        x= Math.max(a,b);

//        if(a>b){
//            System.out.println("B is Greater");
//            x = a;
//        }
//        else
//        {
//            System.out.println("A is Greater");
//            x = b;
//        }
        for(int i=x; i<=ans; i++ ){                  //i will iterate from max(a,b) to (a*b)
            if(i%a==0 && i%b==0){
                ans = i;
            }
        }
        System.out.println("The LCM will be " + ans);

    }


}
