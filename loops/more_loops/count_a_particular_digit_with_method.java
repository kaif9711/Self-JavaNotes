import java.util.Scanner;

public class count_a_particular_digit_with_method{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // taking input as number and digit from the user
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Enter a digit");
        int digit = sc.nextInt();
        int result = particular_digit(num, digit);  // calling the function and storing the return value in result
        System.out .println("The digit " + digit + " occurs " + result + " times in the number " + num);
    }

    public static int particular_digit(int num, int digit){
        int count = 0;
        while(num!=0){
            int i = num%10;
            num = num/10;

            if (i == digit){   // 5 = 5digit
                count ++;
            }
        }
        return count;   // if we need something from the fucntion then we use return
    }

}
