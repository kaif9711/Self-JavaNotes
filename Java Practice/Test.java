//Q. Write a Java program to input an integer and determine whether the number is:
//(a) Positive Even 2,4
//(b) Positive Odd 3,1
//(c) Negative Even -2, -4
//(d) Negative Odd -1, -3
//(e) Zero
// The program should accept a number from the user and display the appropriate category.

import java.util.Scanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.print("Number is Positive, ");

            if (n % 2 == 0) {
                System.out.print("Number is Positive Even");
            } else {
                System.out.print("Number is Positive Odd");
            }

        } else if (n < 0) {
            System.out.print("Number is Negative, ");

            if (n % 2 == 0) {
                System.out.print("Number is Negative Even");
            } else {
                System.out.print("Number is Negative Odd");
            }

        } else {
            System.out.print("Zero");
        }
    }
}
