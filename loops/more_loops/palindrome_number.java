package more_loops;

import java.util.Scanner;

public class palindrome_number
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int original;                  // to check
        original = n;                  // this is to keep the original n input by the user so that it can be compared

        int i = 1;
        int reverse = 0;               // this variable is for the reverse of digits

        // same way to exctract the digits
        while(n!=0){
            i=n%10;
            n=n/10;
        reverse = reverse*10 +i;

        }
        System.out.println(reverse);

        // do the comparison of original and reverse to check if it is palindrome or not
        if (original == reverse){
            System.out.println("Palindrome" + original + "=" + reverse);
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
