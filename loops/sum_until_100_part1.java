//take input from user until sum exceeds 100

import java.util.Scanner;

public class sum_until_100_part1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a Number");
        //int n = sc.nextInt(); (this was extra input taking)

        while (sum<=100){
           int n = sc.nextInt();
            sum = (sum + n);
            System.out.println("Keep entering the number until sum becomes 100");
            System.out.println("temp sum: " + sum);

        }
        System.out.println("Sum is greater than 100 which is " + sum );

    }
}
