import java.util.Scanner;

public class first_digit_of_number
{
    public static void main(String [] args)
    {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The first digit is "+ method(n));
    }
    public static int method(int n)
    {
        while (n > 10)
        {
            n = n / 10;
        }
        return n;

    }
}
