//5. Keep asking until 0
//Keep taking numbers from the user until they enter 0.

import java.util.Scanner;

public class keep_asking_until_0
{
    public static void main(String[] args){

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //1

        while (n!=0){
            System.out.println(n + " is not a zero" );
            System.out.println("Enter another number");

            n = sc.nextInt(); //2
        }
        System.out.println("U type 0");
    }

}
