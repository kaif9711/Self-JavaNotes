import java.util.Scanner;

public class celcius_to_farenheit_method {
    public static double temp(int c){
        double f = 9.0/5.0 * (double)c + 32;
        return f;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp in Celcius :  ");
        int c = sc.nextInt();

        System.out.print("Temp in farenheit is " + temp(c));

    }


}
