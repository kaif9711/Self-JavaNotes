// largest of three digit number
import java.util.Scanner;

public class largest_of_three_number_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int num = Math.max(a,b);
        int num1 = Math.max(num,c);
        System.out.println("largest number is ; " + num1);
    }
}
