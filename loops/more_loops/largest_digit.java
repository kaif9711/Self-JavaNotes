package more_loops;

import java.util.Scanner;

public class largest_digit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 1;
        int x = 0;

        // same way to exctract the digits
        while (n != 0)       //5679   // is used to check if the number is not zero
        {
            i = n % 10;// i = 7   // extract the digits as i

            // inside while, checking cond if i = 9  which is highest then break
            if(i==9){
                System.out.println("Largest digit is " + i);
                x = i;     // before it break overrding x = which is 9
                break;
            }

            // checking if the extracted digit is greater than the previous largest digit stored in x, if yes then update x
            // to identify the greatest digit in the number
            if (x < i)
            {
                x=i;         //x= 9
            }
            n = n / 10;

        }
        System.out.println("Largest digit is " + x);

    }
}
