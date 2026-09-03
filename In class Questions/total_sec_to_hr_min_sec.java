// Program to take total seconds as input and print time as total time hr:min:sec
import java.util.Scanner;

public class total_sec_to_hr_min_sec
{
    public static void main(String[] args){
        System.out.println("Enter time in seconds : ");
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();

        //converting second to hr
        int hr = second/3600;
        // remaining seconds
        int rem_sec = second%3600;
        // converting to minutes
        int min = rem_sec/60;
        //remaing seconds
        int rem_sec2 = rem_sec%60;
        System.out.println("time is "+ hr+" hours "+ min+" minutes "+ rem_sec2+" seconds");;

    }
}
