// Count the number of digits.
// (count = count +1) this is used to calcualte the no. of itirations in loop
import java.util.Scanner;

public class count_digits
{
    public static void main(String[] args){
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =sc.nextInt();
        while(n!=0){
            n = n/10;
            count = count + 1;
            System.out.println("count of digit " + count);
        }
        System.out.printf("The count is %d", count);
    }
}
