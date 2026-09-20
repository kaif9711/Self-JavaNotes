package more_loops;

import java.util.Scanner;

public class sum_of_even_and_odd_digits
{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();       // 2342
        int even_sum = 0;
        int odd_sum = 0;
        while(num!=0){
            int digit = num%10;   //2
            if(even_check(digit)){
                even_sum = even_sum + digit;
            }else
            {
                odd_sum = odd_sum + digit;
            }
            num =num/10;
        }
        System.out.println("Sum of even digits is " + even_sum);
        System.out.println("Sum of odd digits is " + odd_sum);


    }

    public static boolean even_check(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

}
