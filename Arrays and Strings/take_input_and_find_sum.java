import java.util.Scanner;

public class take_input_and_find_sum
{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0;
        System.out.println("Enter 10 numbers");

        for(int i = 0; i<num.length; i++){

            num[i] = sc.nextInt();
            sum += num[i];
        }

        System.out.println("Sum of all elements is " + sum);


    }
}
