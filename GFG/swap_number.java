// swap numbers with using the 3rd term
import java.util.Scanner;

public class swap_number
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a :");
        int a = sc.nextInt();

        System.out.println("Enter number b :");
        int b = sc.nextInt();

        // a=2, b=3
        a = a+b; //a = 5
        b = a - b; // b =2
        a = a - b; // a=3

        System.out.println("After swapping a is ;" + a + " after swapping b is; " + b);

    }

}
