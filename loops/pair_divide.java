//Question
//
//        Write a Java program that takes 5 pairs of integers (x, y) from the user and prints the result of x / y for each pair.

//        The program should:
//
//        Use a for loop that runs 5 times.
//        Take x and y as input in each iteration.
//        If y is 0, use the continue statement to skip that iteration.
//        Otherwise, calculate and print x / y.
//        Do not perform division when y = 0.
//
//        Example input:
//        10 2
//        20 5
//        15 0
//        30 3
//        50 10
//        Expected output://
//        5
//        4
//        10
//        5

import java.util.Scanner;

public class pair_divide
{
    public static void main(String[] args){

        for(int i=0; i<5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter first number: ");
            int x = sc.nextInt();
            System.out.println("Enter second number: ");
            int y = sc.nextInt();
            if(y==0){
                System.out.println("Y cannot be zero");
                continue;
            }
            System.out.print("Ratio is " + x/y);

        }

    }
}
