//Question Take input from user and do.
// Celcius to Farenheit
import java.util.Scanner;

public class celcius_to_farenhiet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temp in celcius \n");
        int c = sc.nextInt();

        double f = 9.0/5.0 * c + 32;

        System.out.print("The temp in Farenheit is : " + f);

    }

}
