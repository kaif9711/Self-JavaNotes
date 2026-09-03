import java.util.Scanner;

public class check_three_digit_or_not
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();

        int count = 0;
        while (x!=0)
        {
            x = x / 10;
            count = count + 1;
        // System.out.println("The digits are" + count);
        }
        System.out.println("Total digits are " + count);


        if (count==3)
        {
            System.out.println("The number is 3 digit");
        } else
        {
            System.out.println("The number is not three digit");

        }
    }
}
