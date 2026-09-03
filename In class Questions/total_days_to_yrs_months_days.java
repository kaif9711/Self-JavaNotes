// Program to take total days as input and convert it into years:months:days
import java.util.Scanner;

public class total_days_to_yrs_months_days
{
    public static void main(String[] args){
        System.out.println("Enter total days : ");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        // converting days to years
        int year = days / 365;

        // remaining days
        int rem_days = days % 365;

        // converting remaining days to months
        int month = rem_days / 30;

        // remaining days
        int rem_days2 = rem_days % 30;

        System.out.println("Time is " + year + " years " + month + " months " + rem_days2 + " days");
    }
}
