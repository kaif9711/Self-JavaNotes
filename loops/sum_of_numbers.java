//4. Sum of numbers
//Take n from the user and calculate the sum from 1 to n using while.

import java.util.Scanner;
public class sum_of_numbers
{
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        while(i<=n){
            sum = sum + i;
            System.out.println(sum);
            i++;
        }

    }
}
