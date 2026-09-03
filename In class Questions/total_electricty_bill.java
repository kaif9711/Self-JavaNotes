// Program to calculate total electricity bill
import java.util.Scanner;

public class total_electricty_bill
{
    public static void main(String[] args){

        System.out.println("Enter units : ");
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();

        System.out.println("Enter rate per unit : ");
        int rate = sc.nextInt();

        // calculating total bill
        int bill = unit * rate;

        System.out.println("Total electricity bill is : " + bill);
    }
}
