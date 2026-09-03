import java.util.Scanner;

public class leap_year_check
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (year % 400 == 0)
        {
            System.out.println(year + " Leap year");
        } else if (year % 4 == 0 || year % 10 != 0)
        {
            System.out.println(year + " Is not a Leap Year");
        } else
        {
            System.out.println(year + " Is not a Leap Year");
        }

    }
}



