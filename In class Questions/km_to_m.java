//take inputfom user and calculate Km to m

import java.util.Scanner;

public class km_to_m{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in KM");
        int km = sc.nextInt();

        int m = km * 1000;

        System.out.println("Distance in Meter is : " + m);

    }
}


