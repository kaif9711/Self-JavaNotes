import java.util.Scanner;

public class largest_digit_in_a_number
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int digit =0;
        int greatest  = 0;
        while(num>0){
            digit = num%10;

            if(digit == 9){
                System.out.println(digit + "is the greates digit in the number");
                greatest = digit;
                break;
            }

            if(digit > greatest){
            greatest  = digit;

            }
            num = num/10;
        }
        System.out.println("Greatest digit is " + greatest);
    }
}
