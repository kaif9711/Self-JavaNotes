//Question :  table of a number
// whenever you want use case where u want number like 1,2,3,5 .... then remeber in for loop i++ is used for this only it
// incerements by +1

import java.util.Scanner;

public class table_of_a_number_for_loop
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which You want the table");
        int n = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(i * n);

        }
    }
}
