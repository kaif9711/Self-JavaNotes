import java.util.Arrays;
import java.util.Scanner;

public class array_practice_1
{
    public static void main(String[] args)
    {

        //This is the normal way to iterate using an index:
       // int[] numbers = {10, 20, 30, 40};

        //for (int i = 0; i < numbers.length; i++) {
        //    System.out.println(numbers[i]);
        //}

        //Enhanced FOR loop (only for array elements)
//        for (int x : numbers)
//        {
//            System.out.println(x);
//        }

        //You can also use a loop to take values from the user.

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        for(int i=0; i< numbers.length; i++){
            System.out.println("enter the " + (i+1) + " element" );
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString((numbers)));   // There is another easy way to print the whole array.
    }
}
